package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class CallLogActivity$$ExternalSyntheticLambda31 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public CallLogActivity$$ExternalSyntheticLambda31(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((CallLogActivity) this.f$0).lambda$deleteAllMessages$15(this.f$1, tLObject, tL_error);
                break;
            case 1:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressInstantButton$50(this.f$1, tLObject, tL_error);
                break;
            case 2:
                ((PassportActivity.AnonymousClass8) this.f$0).lambda$run$10(this.f$1, tLObject, tL_error);
                break;
            case 3:
                ((ChatEditActivity) this.f$0).lambda$createView$18(this.f$1, tLObject, tL_error);
                break;
            case 4:
                ((ChatEditTypeActivity) this.f$0).lambda$generateLink$27(this.f$1, tLObject, tL_error);
                break;
            case 5:
                ((GroupInviteActivity) this.f$0).lambda$generateLink$3(this.f$1, tLObject, tL_error);
                break;
            case 6:
                ((PaymentFormActivity) this.f$0).lambda$sendSavePassword$44(this.f$1, tLObject, tL_error);
                break;
            case 7:
                ((PhotoPickerActivity) this.f$0).lambda$searchBotUser$11(this.f$1, tLObject, tL_error);
                break;
            case 8:
                ((TwoStepVerificationSetupActivity) this.f$0).lambda$setNewPassword$46(this.f$1, tLObject, tL_error);
                break;
            default:
                ((WallpapersListActivity) this.f$0).lambda$loadWallpapers$8(this.f$1, tLObject, tL_error);
                break;
        }
    }
}
