package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.Delegates.MemberRequestsDelegate$$ExternalSyntheticLambda1;

public final class StarGiftSheet$$ExternalSyntheticLambda71 implements RequestDelegate {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final boolean f$3;
    public final Object f$4;

    public StarGiftSheet$$ExternalSyntheticLambda71(MemberRequestsDelegate memberRequestsDelegate, boolean z, MemberRequestsDelegate$$ExternalSyntheticLambda1 memberRequestsDelegate$$ExternalSyntheticLambda1, String str, boolean z2) {
        this.f$0 = memberRequestsDelegate;
        this.f$1 = z;
        this.f$2 = memberRequestsDelegate$$ExternalSyntheticLambda1;
        this.f$4 = str;
        this.f$3 = z2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$0;
                starGiftSheet.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda9(starGiftSheet, tLObject, this.f$1, (TLRPC.Document) this.f$2, this.f$3, tL_error, (TL_stars.saveStarGift) this.f$4));
                break;
            default:
                ((MemberRequestsDelegate) this.f$0).lambda$loadMembers$4(this.f$1, (MemberRequestsDelegate$$ExternalSyntheticLambda1) this.f$2, (String) this.f$4, this.f$3, tLObject, tL_error);
                break;
        }
    }

    public StarGiftSheet$$ExternalSyntheticLambda71(StarGiftSheet starGiftSheet, boolean z, TLRPC.Document document, boolean z2, TL_stars.saveStarGift savestargift) {
        this.f$0 = starGiftSheet;
        this.f$1 = z;
        this.f$2 = document;
        this.f$3 = z2;
        this.f$4 = savestargift;
    }
}
