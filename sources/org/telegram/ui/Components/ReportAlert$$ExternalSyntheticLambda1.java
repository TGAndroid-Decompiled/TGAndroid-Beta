package org.telegram.ui.Components;

import android.view.View;

public final class ReportAlert$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public ReportAlert$$ExternalSyntheticLambda1(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((ReportAlert) this.f$0).lambda$new$1(this.f$1, view);
                break;
            case 1:
                ((GroupCallRecordAlert.Adapter) this.f$0).lambda$instantiateItem$0(this.f$1, view);
                break;
            case 2:
                ((AdminLogFilterAlert2) this.f$0).lambda$getGroupClick$2(this.f$1, view);
                break;
            case 3:
                AlertsCreator.lambda$createBlockDialogAlert$99((boolean[]) this.f$0, this.f$1, view);
                break;
            case 4:
                ((ChatAttachAlertPhotoLayout) this.f$0).lambda$updateAlbumsDropDown$13(this.f$1, view);
                break;
            case 5:
                ((GroupCallRecordAlert) this.f$0).lambda$new$1(this.f$1, view);
                break;
            case 6:
                ((ScrollSlidingTextTabStrip) this.f$0).lambda$addTextTab$0(this.f$1, view);
                break;
            default:
                ((UpdateLayout) this.f$0).lambda$createUpdateUI$0(this.f$1, view);
                break;
        }
    }
}
