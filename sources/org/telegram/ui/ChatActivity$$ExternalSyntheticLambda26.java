package org.telegram.ui;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.utils.OnPostDrawView;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.Components.ReactedUsersListView;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundButton;
import org.telegram.ui.Components.chat.layouts.ButtonOnClickListener;
import org.telegram.ui.Components.chat.layouts.ButtonOnLongClickListener;
import org.telegram.ui.Components.chat.layouts.ChatActivityChannelButtonsLayout;
import org.telegram.ui.Delegates.ChatActivityMemberRequestsDelegate;

public final class ChatActivity$$ExternalSyntheticLambda26 implements AlertDialog.OnButtonClickListener, MessagesStorage.BooleanCallback, ResultCallback, GroupCreateActivity.ContactsAddActivityDelegate, ContactAddActivity.ContactAddActivityDelegate, ChatActivityMemberRequestsDelegate.ChangeVisibilityDelegate, ButtonOnClickListener, ButtonOnLongClickListener, RecyclerListView.OnItemLongClickListener, ChatActivityChannelButtonsLayout.OnButtonFullyVisibleListener, ChatActivityChannelButtonsLayout.OnButtonsTotalWidthChanged, RecyclerAnimationScrollHelper.ScrollListener, FlagSecureReason.FlagSecureCondition, PinchToZoomHelper.ClipBoundsListener, OnApplyWindowInsetsListener, OnPostDrawView.InvalidateCallback, ReactedUsersListView.OnCustomEmojiSelectedListener {
    public final int $r8$classId;
    public final ChatActivity f$0;

    public ChatActivity$$ExternalSyntheticLambda26(ChatActivity chatActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
    }

    @Override
    public void didAddToContacts() {
        this.f$0.lambda$createTopPanel$90();
    }

    @Override
    public void didSelectUsers(ArrayList arrayList, int i) {
        this.f$0.lambda$createTopPanel$89(arrayList, i);
    }

    @Override
    public void getClipTopBottom(float[] fArr) {
        this.f$0.lambda$createView$81(fArr);
    }

    @Override
    public void needAddBot(TLRPC.User user) {
        GroupCreateActivity.ContactsAddActivityDelegate.CC.$default$needAddBot(this, user);
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
    }

    @Override
    public void onButtonFullyVisible(ChatActivityBlurredRoundButton chatActivityBlurredRoundButton, int i, boolean z) {
        switch (this.$r8$classId) {
            case 15:
                this.f$0.lambda$createView$65(chatActivityBlurredRoundButton, i, z);
                break;
            default:
                this.f$0.lambda$createView$68(chatActivityBlurredRoundButton, i, z);
                break;
        }
    }

    @Override
    public void onClick(int i, View view) {
        this.f$0.onSideControlButtonOnClick(i, view);
    }

    @Override
    public void onComplete(Object obj) {
        this.f$0.lambda$setChatThemeEmoticon$400((EmojiThemes) obj);
    }

    @Override
    public void onError(Throwable th) {
        ResultCallback.CC.$default$onError(this, th);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        return this.f$0.lambda$createView$44(view, i);
    }

    @Override
    public void onPostDraw(int i) {
        this.f$0.invalidateMergedVisibleBlurredPositionsAndSourcesImpl(i);
    }

    @Override
    public void onScroll() {
        this.f$0.lambda$createView$79();
    }

    @Override
    public void run(boolean z) {
        this.f$0.lambda$createView$77(z);
    }

    @Override
    public void setVisible(boolean z, boolean z2) {
        this.f$0.lambda$createView$33(z, z2);
    }

    @Override
    public void showCustomEmojiAlert(ReactedUsersListView reactedUsersListView, ArrayList arrayList) {
        switch (this.$r8$classId) {
            case 23:
                this.f$0.lambda$didPressReaction$464(reactedUsersListView, arrayList);
                break;
            default:
                this.f$0.lambda$createMenu$258(reactedUsersListView, arrayList);
                break;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onFragmentCreate$15(alertDialog, i);
                break;
            case 1:
                this.f$0.lambda$openAnotherForward$117(alertDialog, i);
                break;
            case 2:
                this.f$0.lambda$openAnotherForward$118(alertDialog, i);
                break;
            case 3:
                this.f$0.lambda$createView$74(alertDialog, i);
                break;
            case 6:
                this.f$0.lambda$showQuickRepliesRemoveAlert$362(alertDialog, i);
                break;
            case 9:
                this.f$0.lambda$onFragmentCreate$16(alertDialog, i);
                break;
            case 10:
                this.f$0.lambda$createPinnedMessageView$115(alertDialog, i);
                break;
            case 25:
                this.f$0.lambda$createView$43(alertDialog, i);
                break;
            case 26:
                this.f$0.lambda$onRequestPermissionsResultFragment$164(alertDialog, i);
                break;
            case 27:
                this.f$0.lambda$showQuoteMessageUpdate$194(alertDialog, i);
                break;
            case 28:
                this.f$0.lambda$showQuoteMessageUpdate$195(alertDialog, i);
                break;
            default:
                this.f$0.lambda$showGigagroupConvertAlert$199(alertDialog, i);
                break;
        }
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        ResultCallback.CC.$default$onError(this, tL_error);
    }

    @Override
    public boolean run() {
        return this.f$0.lambda$createView$80();
    }
}
