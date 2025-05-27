package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.PostSuggestionsEditActivity;
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
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private int rowCount;
    private int rowSuggestionPriceHeader;
    private int rowSuggestionPriceInfo;
    private int rowSuggestionPriceSlider;
    private int rowSuggestionsEnabled;
    private int rowSuggestionsEnabledInfo;
    private MessagesStorage.LongCallback starsCallback;
    private long suggestionsStarsCount;

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        public static CharSequence lambda$onBindViewHolder$0(Integer num, Integer num2) {
            return num.intValue() == 0 ? StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatPluralStringComma("Stars", num2.intValue()), 0.66f) : LocaleController.formatNumber(num2.intValue(), ',');
        }

        public void lambda$onBindViewHolder$1(Integer num) {
            PostSuggestionsEditActivity.this.suggestionsStarsCount = num.intValue();
            AndroidUtilities.updateVisibleRow(PostSuggestionsEditActivity.this.listView, PostSuggestionsEditActivity.this.rowSuggestionPriceInfo);
            PostSuggestionsEditActivity.this.checkDone(true);
        }

        @Override
        public int getItemCount() {
            return PostSuggestionsEditActivity.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == PostSuggestionsEditActivity.this.rowSuggestionsEnabled) {
                return 0;
            }
            if (i == PostSuggestionsEditActivity.this.rowSuggestionPriceHeader) {
                return 2;
            }
            return i == PostSuggestionsEditActivity.this.rowSuggestionPriceSlider ? 3 : 5;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String formatString;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (i == PostSuggestionsEditActivity.this.rowSuggestionsEnabled) {
                    textCheckCell.setDrawCheckRipple(true);
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.AllowPostSuggestions), PostSuggestionsEditActivity.this.isSuggestionsEnabled, false);
                    textCheckCell.setTag(Integer.valueOf(PostSuggestionsEditActivity.this.isSuggestionsEnabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
                    textCheckCell.setBackgroundColor(Theme.getColor(PostSuggestionsEditActivity.this.isSuggestionsEnabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
                    return;
                }
                return;
            }
            if (itemViewType != 5) {
                if (itemViewType == 2) {
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (i == PostSuggestionsEditActivity.this.rowSuggestionPriceHeader) {
                        headerCell.setText(LocaleController.getString(R.string.PriceForEachSuggestion));
                        return;
                    }
                    return;
                }
                if (itemViewType != 3) {
                    return;
                }
                SlideIntChooseView slideIntChooseView = (SlideIntChooseView) viewHolder.itemView;
                if (i == PostSuggestionsEditActivity.this.rowSuggestionPriceSlider) {
                    slideIntChooseView.set((int) Utilities.clamp(PostSuggestionsEditActivity.this.suggestionsStarsCount, 10000L, 0L), SlideIntChooseView.Options.make(1, SlideIntChooseView.cut(new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, (int) PostSuggestionsEditActivity.this.getMessagesController().starsPaidMessageAmountMax), 20, new Utilities.Callback2Return() {
                        @Override
                        public final Object run(Object obj, Object obj2) {
                            CharSequence lambda$onBindViewHolder$0;
                            lambda$onBindViewHolder$0 = PostSuggestionsEditActivity.ListAdapter.lambda$onBindViewHolder$0((Integer) obj, (Integer) obj2);
                            return lambda$onBindViewHolder$0;
                        }
                    }), new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            PostSuggestionsEditActivity.ListAdapter.this.lambda$onBindViewHolder$1((Integer) obj);
                        }
                    });
                    return;
                }
                return;
            }
            TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
            if (i == PostSuggestionsEditActivity.this.rowSuggestionsEnabledInfo) {
                textInfoPrivacyCell.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4));
                textInfoPrivacyCell.setTopPadding(12);
                textInfoPrivacyCell.setBottomPadding(16);
                formatString = LocaleController.getString(R.string.AllowPostSuggestionsHint);
            } else {
                if (i != PostSuggestionsEditActivity.this.rowSuggestionPriceInfo) {
                    return;
                }
                textInfoPrivacyCell.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4));
                textInfoPrivacyCell.setTopPadding(12);
                textInfoPrivacyCell.setBottomPadding(16);
                double d = ((float) PostSuggestionsEditActivity.this.suggestionsStarsCount) * (PostSuggestionsEditActivity.this.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f);
                Double.isNaN(d);
                double d2 = PostSuggestionsEditActivity.this.getMessagesController().starsUsdWithdrawRate1000;
                Double.isNaN(d2);
                double d3 = (int) ((d / 1000.0d) * d2);
                Double.isNaN(d3);
                formatString = LocaleController.formatString(R.string.PostSuggestionsPriceInfo, AffiliateProgramFragment.percents(850), String.valueOf(d3 / 100.0d));
            }
            textInfoPrivacyCell.setText(formatString);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            FrameLayout frameLayout;
            int color;
            FrameLayout frameLayout2;
            if (i != 0) {
                if (i == 2) {
                    FrameLayout headerCell = new HeaderCell(this.mContext);
                    color = Theme.getColor(Theme.key_windowBackgroundWhite);
                    frameLayout2 = headerCell;
                } else if (i != 3) {
                    FrameLayout textInfoPrivacyCell = new TextInfoPrivacyCell(this.mContext);
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    frameLayout = textInfoPrivacyCell;
                } else {
                    FrameLayout slideIntChooseView = new SlideIntChooseView(this.mContext, ((BaseFragment) PostSuggestionsEditActivity.this).resourceProvider);
                    color = PostSuggestionsEditActivity.this.getThemedColor(Theme.key_windowBackgroundWhite);
                    frameLayout2 = slideIntChooseView;
                }
                frameLayout2.setBackgroundColor(color);
                frameLayout = frameLayout2;
            } else {
                TextCheckCell textCheckCell = new TextCheckCell(this.mContext);
                textCheckCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
                textCheckCell.setTypeface(AndroidUtilities.bold());
                textCheckCell.setHeight(56);
                frameLayout = textCheckCell;
            }
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(frameLayout);
        }
    }

    public PostSuggestionsEditActivity(long j) {
        this.currentChatId = j;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j));
        TLRPC.Chat chat2 = (chat == null || chat.linked_monoforum_id == 0) ? null : getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
        long j2 = chat2 != null ? chat2.send_paid_messages_stars : 0L;
        boolean z = chat != null && chat.broadcast_messages_allowed;
        this.initialSuggestionsEnabled = z;
        long clamp = Utilities.clamp(z ? j2 : 10L, getMessagesController().starsPaidMessageAmountMax, 0L);
        this.initialSuggestionsStarsCount = clamp;
        this.isSuggestionsEnabled = z;
        this.suggestionsStarsCount = clamp;
    }

    public void checkDone(boolean z) {
        boolean hasChanges;
        if (this.doneButton == null || this.lastHasChanges == (hasChanges = hasChanges())) {
            return;
        }
        this.lastHasChanges = hasChanges;
        this.doneButton.setEnabled(hasChanges);
        if (z) {
            this.doneButton.animate().alpha(hasChanges ? 1.0f : 0.0f).scaleX(hasChanges ? 1.0f : 0.0f).scaleY(hasChanges ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.doneButton.setAlpha(hasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleX(hasChanges ? 1.0f : 0.0f);
        this.doneButton.setScaleY(hasChanges ? 1.0f : 0.0f);
    }

    private boolean hasChanges() {
        return (this.suggestionsStarsCount == this.initialSuggestionsStarsCount && this.isSuggestionsEnabled == this.initialSuggestionsEnabled) ? false : true;
    }

    public void lambda$createView$0(View view, int i, float f, float f2) {
        if (i == this.rowSuggestionsEnabled) {
            TextCheckCell textCheckCell = (TextCheckCell) view;
            boolean z = !textCheckCell.isChecked();
            this.isSuggestionsEnabled = z;
            view.setTag(Integer.valueOf(z ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
            textCheckCell.setBackgroundColorAnimated(z, Theme.getColor(this.isSuggestionsEnabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
            updateRows();
            if (this.isSuggestionsEnabled) {
                this.listAdapter.notifyItemRangeInserted(this.rowSuggestionsEnabledInfo + 1, 3);
            } else {
                this.listAdapter.notifyItemRangeRemoved(this.rowSuggestionsEnabledInfo + 1, 3);
            }
            textCheckCell.setChecked(z);
            checkDone(true);
        }
    }

    public void lambda$onBackPressed$3(AlertDialog alertDialog, int i) {
        processDone();
    }

    public void lambda$onBackPressed$4(AlertDialog alertDialog, int i) {
        lambda$onBackPressed$347();
    }

    public void lambda$processDone$1(TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
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
        lambda$onBackPressed$347();
    }

    public void lambda$processDone$2(final TL_stars.updatePaidMessagesPrice updatepaidmessagesprice, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PostSuggestionsEditActivity.this.lambda$processDone$1(tL_error, tLObject, updatepaidmessagesprice);
            }
        });
    }

    public void processDone() {
        if (this.doneButtonDrawable.getProgress() > 0.0f) {
            return;
        }
        if (!hasChanges()) {
            lambda$onBackPressed$347();
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
                PostSuggestionsEditActivity.this.lambda$processDone$2(updatepaidmessagesprice, tLObject, tL_error);
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

    private void updateRows() {
        int i;
        this.rowSuggestionsEnabled = 0;
        this.rowCount = 2;
        this.rowSuggestionsEnabledInfo = 1;
        if (this.isSuggestionsEnabled) {
            this.rowSuggestionPriceHeader = 2;
            this.rowSuggestionPriceSlider = 3;
            this.rowCount = 5;
            i = 4;
        } else {
            i = -1;
            this.rowSuggestionPriceHeader = -1;
            this.rowSuggestionPriceSlider = -1;
        }
        this.rowSuggestionPriceInfo = i;
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
                    if (PostSuggestionsEditActivity.this.onBackPressed()) {
                        PostSuggestionsEditActivity.this.lambda$onBackPressed$347();
                    }
                } else if (i == 1) {
                    PostSuggestionsEditActivity.this.processDone();
                }
            }
        });
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(mutate, new CircularProgressDrawable(Theme.getColor(i)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(1, this.doneButtonDrawable, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
        checkDone(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        this.listAdapter = new ListAdapter(context);
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setVerticalScrollBarEnabled(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        this.listView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i2) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i2);
            }

            @Override
            public void onDoubleTap(View view, int i2, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i2, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i2, float f, float f2) {
                PostSuggestionsEditActivity.this.lambda$createView$0(view, i2, f, f2);
            }
        });
        return this.fragmentView;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !hasChanges();
    }

    @Override
    public boolean onBackPressed() {
        if (!hasChanges()) {
            return super.onBackPressed();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.UnsavedChanges));
        builder.setMessage(LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges));
        builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                PostSuggestionsEditActivity.this.lambda$onBackPressed$3(alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Discard), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                PostSuggestionsEditActivity.this.lambda$onBackPressed$4(alertDialog, i);
            }
        });
        showDialog(builder.create());
        return false;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        updateRows();
        return true;
    }

    public PostSuggestionsEditActivity setOnApplied(MessagesStorage.LongCallback longCallback) {
        this.starsCallback = longCallback;
        return this;
    }
}
