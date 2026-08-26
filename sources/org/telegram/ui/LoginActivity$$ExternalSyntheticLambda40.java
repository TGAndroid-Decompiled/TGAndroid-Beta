package org.telegram.ui;

import org.telegram.ui.Components.FilterGLThread;

public final class LoginActivity$$ExternalSyntheticLambda40 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final boolean f$2;
    public final boolean f$3;

    public LoginActivity$$ExternalSyntheticLambda40(Object obj, boolean z, boolean z2, boolean z3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = z2;
        this.f$3 = z3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((LoginActivity) this.f$0).lambda$showEditDoneProgress$14(this.f$1, this.f$2, this.f$3);
                break;
            default:
                ((FilterGLThread) this.f$0).lambda$requestRender$10(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
