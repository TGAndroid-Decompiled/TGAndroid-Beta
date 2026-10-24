package org.telegram.ui.Components;

import android.text.TextUtils;
public final class eh implements Runnable {
    public final int f26042a;
    public final ri f26043b;

    public eh(ri riVar, int i10) {
        this.f26042a = i10;
        this.f26043b = riVar;
    }

    @Override
    public final void run() {
        ou ouVar;
        boolean z10;
        long j10;
        boolean N1;
        switch (this.f26042a) {
            case 0:
                ri riVar = this.f26043b;
                if (riVar.f30136c0) {
                    ouVar = riVar.S0;
                } else {
                    ouVar = riVar.H0;
                }
                if (ouVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ouVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                riVar.U1(z10);
                return;
            case 1:
                ri.u(this.f26043b);
                return;
            case 2:
                ri riVar2 = this.f26043b;
                kf kfVar = riVar2.f30152h0;
                if (kfVar != null) {
                    j10 = kfVar.j();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                ci ciVar = riVar2.L0;
                riVar2.Q0 = j11;
                ciVar.setEffect(j11);
                ji jiVar = riVar2.B0;
                if (jiVar != riVar2.f30158j0 && jiVar != riVar2.f30178q0) {
                    if (!jiVar.K(0, false, 0, riVar2.x1(), j11)) {
                        riVar2.dismiss();
                    }
                    N1 = false;
                } else {
                    N1 = riVar2.N1(0, false, 0, riVar2.x1(), j11);
                }
                kf kfVar2 = riVar2.f30152h0;
                if (kfVar2 != null) {
                    kfVar2.g(!N1);
                    riVar2.f30152h0 = null;
                    return;
                }
                return;
            case 3:
                this.f26043b.M1();
                return;
            default:
                ri.y(this.f26043b);
                return;
        }
    }
}
