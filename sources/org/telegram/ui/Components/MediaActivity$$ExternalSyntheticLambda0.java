package org.telegram.ui.Components;

import java.util.ArrayList;

public final class MediaActivity$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;

    public MediaActivity$$ExternalSyntheticLambda0(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MediaActivity) this.f$0).lambda$createView$7((ArrayList) this.f$1, this.f$2);
                break;
            case 1:
                ((PasscodeView.AnonymousClass2) this.f$0).lambda$beforeTextChanged$0(this.f$2, (MotionBackgroundDrawable) this.f$1);
                break;
            case 2:
                ((AnimatedPhoneNumberEditText) this.f$0).lambda$setHintText$0(this.f$2, (String) this.f$1);
                break;
            case 3:
                ((ChatAttachAlert) this.f$0).lambda$makeFocusable$62((EditTextBoldCursor) this.f$1, this.f$2);
                break;
            case 4:
                ((FolderBottomSheet) this.f$0).lambda$deselectAll$21((FolderBottomSheet.HeaderCell) this.f$1, this.f$2);
                break;
            case 5:
                ((PasscodeView) this.f$0).lambda$new$4(this.f$2, (MotionBackgroundDrawable) this.f$1);
                break;
            default:
                ((PostsSearchContainer) this.f$0).lambda$load$0(this.f$2, (ArrayList) this.f$1);
                break;
        }
    }

    public MediaActivity$$ExternalSyntheticLambda0(Object obj, boolean z, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = z;
        this.f$1 = obj2;
    }
}
