package org.telegram.ui;

import android.text.style.CharacterStyle;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.Stars.StarGiftSheet;

public final class ChatActivity$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final boolean f$5;
    public final boolean f$6;

    public ChatActivity$$ExternalSyntheticLambda9(ChatActivity chatActivity, CharacterStyle characterStyle, String str, boolean z, ChatMessageCell chatMessageCell, MessageObject messageObject, boolean z2) {
        this.f$0 = chatActivity;
        this.f$1 = str;
        this.f$2 = characterStyle;
        this.f$3 = messageObject;
        this.f$4 = chatMessageCell;
        this.f$5 = z;
        this.f$6 = z2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$didLongPressLink$409((String) this.f$1, (CharacterStyle) this.f$2, (MessageObject) this.f$3, (ChatMessageCell) this.f$4, this.f$5, this.f$6);
                break;
            case 1:
                ((MemberRequestsDelegate) this.f$0).lambda$loadMembers$3(this.f$5, (Runnable) this.f$2, (String) this.f$1, (TLRPC.TL_error) this.f$3, (TLObject) this.f$4, this.f$6);
                break;
            default:
                TL_stars.saveStarGift savestargift = (TL_stars.saveStarGift) this.f$4;
                ((StarGiftSheet) this.f$0).lambda$toggleShow$107((TLObject) this.f$1, this.f$5, (TLRPC.Document) this.f$2, this.f$6, (TLRPC.TL_error) this.f$3, savestargift);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda9(MemberRequestsDelegate memberRequestsDelegate, boolean z, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z2) {
        this.f$0 = memberRequestsDelegate;
        this.f$5 = z;
        this.f$2 = runnable;
        this.f$1 = str;
        this.f$3 = tL_error;
        this.f$4 = tLObject;
        this.f$6 = z2;
    }

    public ChatActivity$$ExternalSyntheticLambda9(StarGiftSheet starGiftSheet, TLObject tLObject, boolean z, TLRPC.Document document, boolean z2, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.f$0 = starGiftSheet;
        this.f$1 = tLObject;
        this.f$5 = z;
        this.f$2 = document;
        this.f$6 = z2;
        this.f$3 = tL_error;
        this.f$4 = savestargift;
    }
}
