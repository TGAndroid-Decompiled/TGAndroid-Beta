package org.telegram.ui;

import android.view.View;

public final class PassportActivity$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId;
    public final PassportActivity f$0;

    public PassportActivity$$ExternalSyntheticLambda5(PassportActivity passportActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passportActivity;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createEmailInterface$24(view);
                break;
            case 1:
                this.f$0.lambda$createRequestInterface$16(view);
                break;
            case 2:
                this.f$0.lambda$createPhoneInterface$26(view);
                break;
            case 3:
                this.f$0.lambda$createIdentityInterface$40(view);
                break;
            case 4:
                this.f$0.lambda$createIdentityInterface$54(view);
                break;
            case 5:
                this.f$0.lambda$createIdentityInterface$41(view);
                break;
            case 6:
                this.f$0.lambda$createIdentityInterface$42(view);
                break;
            case 7:
                this.f$0.lambda$createIdentityInterface$43(view);
                break;
            case 8:
                this.f$0.lambda$createIdentityInterface$44(view);
                break;
            case 9:
                this.f$0.lambda$createAddressInterface$32(view);
                break;
            case 10:
                this.f$0.lambda$createAddressInterface$33(view);
                break;
            case 11:
                this.f$0.lambda$createAddressInterface$37(view);
                break;
            case 12:
                this.f$0.lambda$createPasswordInterface$6(view);
                break;
            case 13:
                this.f$0.lambda$createPasswordInterface$12(view);
                break;
            case 14:
                this.f$0.lambda$createManageInterface$17(view);
                break;
            case 15:
                this.f$0.lambda$createManageInterface$21(view);
                break;
            default:
                this.f$0.lambda$createManageInterface$22(view);
                break;
        }
    }
}
