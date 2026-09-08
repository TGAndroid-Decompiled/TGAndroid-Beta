package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class mw0 extends kl0 {
    public int f28575c;
    public final vw0 d;

    public mw0(vw0 vw0Var) {
        this.d = vw0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45770f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        vw0 vw0Var = this.d;
        rw0[] rw0VarArr = vw0Var.Y2;
        if (rw0VarArr == null) {
            length = 0;
        } else {
            length = rw0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f28575c) {
            di.eb ebVar = vw0Var.f32031l3;
            if (ebVar != null) {
                ebVar.requestLayout();
            }
            this.f28575c = i10;
        }
        return i10;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        vw0 vw0Var;
        rw0[] rw0VarArr;
        boolean z10 = true;
        if (c1Var.f45770f == 1 && (rw0VarArr = (vw0Var = this.d).Y2) != null) {
            int i11 = i10 - 1;
            rw0 rw0Var = rw0VarArr[i11];
            final qw0 qw0Var = (qw0) c1Var.f45766a;
            if (vw0Var.f32032m3 != i11) {
                z10 = false;
            }
            qw0Var.getClass();
            if (!TextUtils.isEmpty(rw0Var.d)) {
                qw0Var.setContentDescription(rw0Var.d);
            } else if (!TextUtils.isEmpty(rw0Var.f30132a)) {
                qw0Var.setContentDescription(rw0Var.f30132a);
            } else {
                qw0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = qw0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                qw0Var.G = null;
            }
            qw0Var.setImageResource(0);
            qw0Var.a();
            final boolean z12 = qw0Var.H.z1();
            qw0Var.f29856w = false;
            qw0Var.f29858y = 1.0f;
            q5.h(UserConfig.selectedAccount).b(rw0Var.f30134c, new n5() {
                @Override
                public final void a(TLRPC.Document document) {
                    qw0 qw0Var2 = qw0.this;
                    qw0Var2.setOnlyLastFrame(!z12);
                    qw0Var2.g(24, 24, document);
                    qw0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new jq0(qw0Var, 9), 60L);
            qw0Var.l(z10, false);
            qw0Var.setAlpha(vw0Var.f32034o3);
            qw0Var.setScaleX(vw0Var.f32034o3);
            qw0Var.setScaleY(vw0Var.f32034o3);
            qw0Var.j();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        qw0 qw0Var;
        vw0 vw0Var = this.d;
        if (i10 == 0) {
            di.eb ebVar = new di.eb(this, vw0Var.getContext(), 25);
            vw0Var.f32031l3 = ebVar;
            qw0Var = ebVar;
        } else {
            qw0Var = new qw0(vw0Var, vw0Var.getContext());
        }
        return new s4.c1(qw0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10 = true;
        if (c1Var.f45770f == 1) {
            qw0 qw0Var = (qw0) c1Var.f45766a;
            if (this.d.f32032m3 != c1Var.b() - 1) {
                z10 = false;
            }
            qw0Var.l(z10, false);
            qw0Var.j();
        }
    }
}
