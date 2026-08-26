package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public final class PostSuggestionsEditActivity extends BaseFragment {
    public final long currentChatId;
    public ActionBarMenuItem doneButton;
    public CrossfadeDrawable doneButtonDrawable;
    public final boolean initialSuggestionsEnabled;
    public final long initialSuggestionsStarsCount;
    public boolean isSuggestionsEnabled;
    public boolean lastHasChanges;
    public LinkActionView linkView;
    public UniversalRecyclerView listView;
    public SlideIntChooseView slideView;
    public ChatEditActivity$$ExternalSyntheticLambda41 starsCallback;
    public long suggestionsStarsCount;

    public PostSuggestionsEditActivity(long j) {
        super(null);
        TLRPC.Chat chat = null;
        this.lastHasChanges = true;
        this.currentChatId = j;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j2 = chat != null ? chat.send_paid_messages_stars : 0L;
        boolean z = chat2 != null && chat2.broadcast_messages_allowed;
        this.initialSuggestionsEnabled = z;
        long jClamp = Utilities.clamp(z ? j2 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.initialSuggestionsStarsCount = jClamp;
        this.isSuggestionsEnabled = z;
        this.suggestionsStarsCount = jClamp;
    }

    public final void checkDone$7(boolean z) {
        boolean zHasChanges$4;
        if (this.doneButton == null || this.lastHasChanges == (zHasChanges$4 = hasChanges$4())) {
            return;
        }
        this.lastHasChanges = zHasChanges$4;
        this.doneButton.setEnabled(zHasChanges$4);
        if (z) {
            this.doneButton.animate().alpha(zHasChanges$4 ? 1.0f : 0.0f).scaleX(zHasChanges$4 ? 1.0f : 0.0f).scaleY(zHasChanges$4 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.doneButton.setAlpha(zHasChanges$4 ? 1.0f : 0.0f);
        this.doneButton.setScaleX(zHasChanges$4 ? 1.0f : 0.0f);
        this.doneButton.setScaleY(zHasChanges$4 ? 1.0f : 0.0f);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 12));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.MULTIPLY));
        this.doneButtonDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i, false)));
        this.doneButton = this.actionBar.createMenu().addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.doneButtonDrawable);
        checkDone$7(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        SlideIntChooseView slideIntChooseView = new SlideIntChooseView(context, this.resourceProvider);
        this.slideView = slideIntChooseView;
        int i2 = Theme.key_windowBackgroundWhite;
        slideIntChooseView.setBackgroundColor(getThemedColor(i2));
        LinkActionView linkActionView = new LinkActionView(context, this, null, true, true);
        this.linkView = linkActionView;
        linkActionView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        this.linkView.setBackgroundColor(getThemedColor(i2));
        this.linkView.hideRevokeOption(true);
        this.linkView.setUsers(0, null, false);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, this.currentAccount, this.classGuid, new LinkManager$$ExternalSyntheticLambda1(this, 3), new PostSuggestionsEditActivity$$ExternalSyntheticLambda0(this, 2), null, this.resourceProvider);
        this.listView = universalRecyclerView;
        universalRecyclerView.setSections();
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.actionBar.setAdaptiveBackground(this.listView);
        return this.fragmentView;
    }

    public final boolean hasChanges$4() {
        return (this.suggestionsStarsCount == this.initialSuggestionsStarsCount && this.isSuggestionsEnabled == this.initialSuggestionsEnabled) ? false : true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !hasChanges$4();
    }

    public final void lambda$processDone$2(TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
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
        ChatEditActivity$$ExternalSyntheticLambda41 chatEditActivity$$ExternalSyntheticLambda41 = this.starsCallback;
        if (chatEditActivity$$ExternalSyntheticLambda41 != null) {
            chatEditActivity$$ExternalSyntheticLambda41.run(updatepaidmessagesprice.suggestions_allowed ? updatepaidmessagesprice.send_paid_messages_stars : -1L);
        }
        finishFragment();
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!hasChanges$4()) {
            return super.onBackPressed(z);
        }
        if (z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string = LocaleController.getString(R.string.UnsavedChanges);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
            builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new PostSuggestionsEditActivity$$ExternalSyntheticLambda0(this, 0));
            builder.setNegativeButton(LocaleController.getString(R.string.Discard), new PostSuggestionsEditActivity$$ExternalSyntheticLambda0(this, 1));
            showDialog(alertDialog);
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        UniversalAdapter universalAdapter;
        super.onFragmentCreate();
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView == null || (universalAdapter = universalRecyclerView.adapter) == null) {
            return true;
        }
        universalAdapter.update(false);
        return true;
    }

    public final void processDone$16() {
        if (this.doneButtonDrawable.progress > 0.0f) {
            return;
        }
        if (!hasChanges$4()) {
            finishFragment();
            return;
        }
        this.doneButtonDrawable.animateToProgress(1.0f);
        TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
        MessagesController messagesController = getMessagesController();
        long j = this.currentChatId;
        updatepaidmessagesprice.channel = messagesController.getInputChannel(j);
        boolean z = this.isSuggestionsEnabled;
        updatepaidmessagesprice.send_paid_messages_stars = z ? this.suggestionsStarsCount : 0L;
        updatepaidmessagesprice.suggestions_allowed = z;
        getConnectionsManager().sendRequest(updatepaidmessagesprice, new ProfileActivity$$ExternalSyntheticLambda65(8, this, updatepaidmessagesprice));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j));
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
        ChatEditActivity$$ExternalSyntheticLambda41 chatEditActivity$$ExternalSyntheticLambda41 = this.starsCallback;
        if (chatEditActivity$$ExternalSyntheticLambda41 != null) {
            chatEditActivity$$ExternalSyntheticLambda41.run(this.isSuggestionsEnabled ? this.suggestionsStarsCount : -1L);
        }
    }
}
