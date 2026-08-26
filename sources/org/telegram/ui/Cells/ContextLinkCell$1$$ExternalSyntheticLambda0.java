package org.telegram.ui.Cells;

import java.io.File;
import org.telegram.messenger.camera.CameraController;

public final class ContextLinkCell$1$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$2;
    public final boolean f$4;
    public final boolean f$5;

    public ContextLinkCell$1$$ExternalSyntheticLambda0(CameraController cameraController, Object obj, boolean z, boolean z2) {
        this.f$0 = cameraController;
        this.f$2 = obj;
        this.f$4 = z;
        this.f$5 = z2;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ContextLinkCell contextLinkCell = ((ContextLinkCell.AnonymousClass1) this.f$0).this$0;
                contextLinkCell.resolvingFileName = false;
                String str = (String) this.f$2;
                contextLinkCell.fileName = str;
                if (str == null) {
                    contextLinkCell.fileName = "";
                }
                contextLinkCell.fileExist = this.f$4;
                contextLinkCell.updateButtonState(this.f$5, true);
                break;
            default:
                ((CameraController) this.f$0).lambda$stopVideoRecording$17(this.f$2, this.f$4, this.f$5);
                break;
        }
    }

    public ContextLinkCell$1$$ExternalSyntheticLambda0(ContextLinkCell.AnonymousClass1 anonymousClass1, String str, File file, boolean z, boolean z2) {
        this.f$0 = anonymousClass1;
        this.f$2 = str;
        this.f$4 = z;
        this.f$5 = z2;
    }
}
