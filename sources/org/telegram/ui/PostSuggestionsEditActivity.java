package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.bots.AffiliateProgramFragment;

public class PostSuggestionsEditActivity extends BaseFragment {
    private final long currentChatId;
    private ActionBarMenuItem doneButton;
    private CrossfadeDrawable doneButtonDrawable;
    private final boolean initialSuggestionsEnabled;
    private final long initialSuggestionsStarsCount;
    private boolean isSuggestionsEnabled;
    private boolean lastHasChanges = true;
    private LinkActionView linkView;
    private UniversalRecyclerView listView;
    private SlideIntChooseView slideView;
    private MessagesStorage.LongCallback starsCallback;
    private long suggestionsStarsCount;

    public PostSuggestionsEditActivity(long j) {
        this.currentChatId = j;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j));
        TLRPC.Chat chat2 = (chat == null || chat.linked_monoforum_id == 0) ? null : getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
        long j2 = chat2 != null ? chat2.send_paid_messages_stars : 0L;
        boolean z = chat != null && chat.broadcast_messages_allowed;
        this.initialSuggestionsEnabled = z;
        long jClamp = Utilities.clamp(z ? j2 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.initialSuggestionsStarsCount = jClamp;
        this.isSuggestionsEnabled = z;
        this.suggestionsStarsCount = jClamp;
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    if (PostSuggestionsEditActivity.this.onBackPressed(true)) {
                        PostSuggestionsEditActivity.this.finishFragment();
                    }
                } else if (i == 1) {
                    PostSuggestionsEditActivity.this.processDone();
                }
            }
        });
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(i)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, this.doneButtonDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
        checkDone(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        SlideIntChooseView slideIntChooseView = new SlideIntChooseView(context, this.resourceProvider);
        this.slideView = slideIntChooseView;
        int i2 = Theme.key_windowBackgroundWhite;
        slideIntChooseView.setBackgroundColor(getThemedColor(i2));
        LinkActionView linkActionView = new LinkActionView(context, this, null, this.currentChatId, true, true);
        this.linkView = linkActionView;
        linkActionView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        this.linkView.setBackgroundColor(getThemedColor(i2));
        this.linkView.hideRevokeOption(true);
        this.linkView.setUsers(0, null);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, this.currentAccount, this.classGuid, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onItemClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, null, this.resourceProvider);
        this.listView = universalRecyclerView;
        frameLayout2.addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1, 51));
        return this.fragmentView;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asTopView(LocaleController.getString(R.string.AllowPostSuggestionsHint2), R.raw.bubble));
        arrayList.add(UItem.asCheck(1, LocaleController.getString(R.string.AllowPostSuggestions)).setChecked(this.isSuggestionsEnabled));
        arrayList.add(UItem.asShadow(2, null));
        if (this.isSuggestionsEnabled) {
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.PriceForEachSuggestion)));
            this.slideView.set((int) Utilities.clamp(this.suggestionsStarsCount, 10000L, 0L), SlideIntChooseView.Options.make(1, SlideIntChooseView.cut(new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) getMessagesController().starsPaidMessageAmountMax), 20, new Utilities.Callback2Return() {
                @Override
                public final Object run(Object obj, Object obj2) {
                    return PostSuggestionsEditActivity.lambda$fillItems$0((Integer) obj, (Integer) obj2);
                }
            }), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$fillItems$1((Integer) obj);
                }
            });
            arrayList.add(UItem.asCustom(3, this.slideView));
            arrayList.add(UItem.asShadow(4, this.suggestionsStarsCount > 0 ? getIncomeInfo() : null));
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.currentChatId));
            if (chat == null || TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
                return;
            }
            this.linkView.setLink(getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat) + "?direct");
            arrayList.add(UItem.asHeader(LocaleController.getString(R.string.ChannelLinkDirectMessages)));
            arrayList.add(UItem.asCustom(5, this.linkView));
        }
    }

    public static CharSequence lambda$fillItems$0(Integer num, Integer num2) {
        if (num.intValue() == 0) {
            return StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatPluralStringComma("Stars", num2.intValue()), 0.66f);
        }
        return LocaleController.formatNumber(num2.intValue(), ',');
    }

    public void lambda$fillItems$1(java.lang.Integer r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PostSuggestionsEditActivity.lambda$fillItems$1(java.lang.Integer):void");
    }

    private CharSequence getIncomeInfo() {
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, AffiliateProgramFragment.percents(getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((this.suggestionsStarsCount * (r0 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public void onItemClick(UItem uItem, View view, int i, float f, float f2) {
        if (uItem.id == 1) {
            TextCheckCell textCheckCell = (TextCheckCell) view;
            boolean z = !textCheckCell.isChecked();
            this.isSuggestionsEnabled = z;
            textCheckCell.setChecked(z);
            this.listView.adapter.update(true);
            checkDone(true);
        }
    }

    @Override
    public boolean onFragmentCreate() {
        UniversalAdapter universalAdapter;
        super.onFragmentCreate();
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView == null || (universalAdapter = universalRecyclerView.adapter) == null) {
            return true;
        }
        universalAdapter.update(false);
        return true;
    }

    public PostSuggestionsEditActivity setOnApplied(MessagesStorage.LongCallback longCallback) {
        this.starsCallback = longCallback;
        return this;
    }

    public void processDone() {
        if (this.doneButtonDrawable.getProgress() > 0.0f) {
            return;
        }
        if (!hasChanges()) {
            finishFragment();
            return;
        }
        this.doneButtonDrawable.animateToProgress(1.0f);
        final TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
        updatepaidmessagesprice.channel = getMessagesController().getInputChannel(this.currentChatId);
        boolean z = this.isSuggestionsEnabled;
        updatepaidmessagesprice.send_paid_messages_stars = z ? this.suggestionsStarsCount : 0L;
        updatepaidmessagesprice.suggestions_allowed = z;
        getConnectionsManager().sendRequest(updatepaidmessagesprice, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$processDone$3(updatepaidmessagesprice, tLObject, tL_error);
            }
        });
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.currentChatId));
        if (chat != null) {
            if (this.isSuggestionsEnabled) {
                chat.flags2 |= 65536;
                chat.broadcast_messages_allowed = true;
            } else {
                chat.flags2 &= -65537;
                chat.broadcast_messages_allowed = false;
            }
            getMessagesController().putChat(chat, true);
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                if (this.isSuggestionsEnabled) {
                    chat2.flags2 |= 16384;
                    chat2.send_paid_messages_stars = this.suggestionsStarsCount;
                } else {
                    chat2.flags2 &= -16385;
                    chat2.send_paid_messages_stars = 0L;
                }
                getMessagesController().putChat(chat2, true);
            }
        }
        MessagesStorage.LongCallback longCallback = this.starsCallback;
        if (longCallback != null) {
            longCallback.run(this.isSuggestionsEnabled ? this.suggestionsStarsCount : -1L);
        }
    }

    public void lambda$processDone$3(final TL_stars.updatePaidMessagesPrice updatepaidmessagesprice, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processDone$2(tL_error, tLObject, updatepaidmessagesprice);
            }
        });
    }

    public void lambda$processDone$2(TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        if (tL_error != null) {
            this.doneButtonDrawable.animateToProgress(0.0f);
            BulletinFactory.showError(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        getMessagesController().putChats(updates.chats, false);
        getMessagesController().processUpdates(updates, false);
        if (this.isFinished || this.finishing) {
            return;
        }
        MessagesStorage.LongCallback longCallback = this.starsCallback;
        if (longCallback != null) {
            longCallback.run(updatepaidmessagesprice.suggestions_allowed ? updatepaidmessagesprice.send_paid_messages_stars : -1L);
        }
        finishFragment();
    }

    private boolean hasChanges() {
        return (this.suggestionsStarsCount == this.initialSuggestionsStarsCount && this.isSuggestionsEnabled == this.initialSuggestionsEnabled) ? false : true;
    }

    private void checkDone(boolean z) {
        boolean zHasChanges;
        if (this.doneButton == null || this.lastHasChanges == (zHasChanges = hasChanges())) {
            return;
        }
        this.lastHasChanges = zHasChanges;
        this.doneButton.setEnabled(zHasChanges);
        if (z) {
            this.doneButton.animate().alpha(zHasChanges ? 1.0f : 0.0f).scaleX(zHasChanges ? 1.0f : 0.0f).scaleY(zHasChanges ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.doneButton.setAlpha(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleX(zHasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleY(zHasChanges ? 1.0f : 0.0f);
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (!hasChanges()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.UnsavedChanges));
        builder.setMessage(LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges));
        builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$onBackPressed$4(alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Discard), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$onBackPressed$5(alertDialog, i);
            }
        });
        showDialog(builder.create());
        return false;
    }

    public void lambda$onBackPressed$4(AlertDialog alertDialog, int i) {
        processDone();
    }

    public void lambda$onBackPressed$5(AlertDialog alertDialog, int i) {
        finishFragment();
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !hasChanges();
    }
}
