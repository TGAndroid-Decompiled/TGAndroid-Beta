package org.telegram.ui;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.Delegates.MemberRequestsDelegate$$ExternalSyntheticLambda2;
import org.telegram.ui.Stars.StarGiftSheet;

public final class ChatActivity$$ExternalSyntheticLambda113 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final boolean f$5;
    public final boolean f$6;

    public ChatActivity$$ExternalSyntheticLambda113(ChatActivity chatActivity, String str, CharacterStyle characterStyle, MessageObject messageObject, ChatMessageCell chatMessageCell, boolean z, boolean z2) {
        this.f$0 = chatActivity;
        this.f$1 = str;
        this.f$2 = characterStyle;
        this.f$3 = messageObject;
        this.f$4 = chatMessageCell;
        this.f$5 = z;
        this.f$6 = z2;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                String str = (String) this.f$1;
                boolean zStartsWith = str.startsWith("video?");
                CharacterStyle characterStyle = (CharacterStyle) this.f$2;
                MessageObject messageObject = (MessageObject) this.f$3;
                ChatMessageCell chatMessageCell = (ChatMessageCell) this.f$4;
                if (zStartsWith) {
                    chatActivity.didPressMessageUrl(characterStyle, false, messageObject, chatMessageCell);
                } else if (this.f$5 && !this.f$6) {
                    chatActivity.getParentActivity();
                    Browser.openInTelegramBrowser(str);
                } else {
                    chatActivity.logSponsoredClicked(messageObject, false, false);
                    chatActivity.openClickableLink(characterStyle, str, false, chatMessageCell, messageObject);
                }
                break;
            case 1:
                MemberRequestsDelegate memberRequestsDelegate = (MemberRequestsDelegate) this.f$0;
                memberRequestsDelegate.isLoading = false;
                memberRequestsDelegate.isDataLoaded = true;
                if (this.f$5) {
                    AndroidUtilities.cancelRunOnUIThread((MemberRequestsDelegate$$ExternalSyntheticLambda2) this.f$2);
                }
                MemberRequestsDelegate.setViewVisible(memberRequestsDelegate.loadingView, false, false);
                String str2 = memberRequestsDelegate.query;
                String str3 = (String) this.f$1;
                if (TextUtils.equals(str3, str2) && ((TLRPC.TL_error) this.f$3) == null) {
                    memberRequestsDelegate.isDataLoaded = true;
                    memberRequestsDelegate.onImportersLoaded((TLRPC.TL_messages_chatInviteImporters) ((TLObject) this.f$4), str3, this.f$6, false);
                }
                break;
            default:
                TL_stars.saveStarGift savestargift = (TL_stars.saveStarGift) this.f$4;
                ((StarGiftSheet) this.f$0).lambda$toggleShow$107((TLObject) this.f$1, this.f$5, (TLRPC.Document) this.f$2, this.f$6, (TLRPC.TL_error) this.f$3, savestargift);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda113(MemberRequestsDelegate memberRequestsDelegate, boolean z, MemberRequestsDelegate$$ExternalSyntheticLambda2 memberRequestsDelegate$$ExternalSyntheticLambda2, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z2) {
        this.f$0 = memberRequestsDelegate;
        this.f$5 = z;
        this.f$2 = memberRequestsDelegate$$ExternalSyntheticLambda2;
        this.f$1 = str;
        this.f$3 = tL_error;
        this.f$4 = tLObject;
        this.f$6 = z2;
    }

    public ChatActivity$$ExternalSyntheticLambda113(StarGiftSheet starGiftSheet, TLObject tLObject, boolean z, TLRPC.Document document, boolean z2, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f$0 = starGiftSheet;
        this.f$1 = tLObject;
        this.f$5 = z;
        this.f$2 = document;
        this.f$6 = z2;
        this.f$3 = tL_error;
        this.f$4 = savestargift;
    }
}
