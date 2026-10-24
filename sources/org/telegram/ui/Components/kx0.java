package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class kx0 extends km0 {
    public int f28093c;
    public final tx0 d;

    public kx0(tx0 tx0Var) {
        this.d = tx0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        tx0 tx0Var = this.d;
        px0[] px0VarArr = tx0Var.Z2;
        if (px0VarArr == null) {
            length = 0;
        } else {
            length = px0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f28093c) {
            ai.jc jcVar = tx0Var.f30923m3;
            if (jcVar != null) {
                jcVar.requestLayout();
            }
            this.f28093c = i10;
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
    public final void v(s4.b1 b1Var, int i10) {
        tx0 tx0Var;
        px0[] px0VarArr;
        boolean z10 = true;
        if (b1Var.f46345f == 1 && (px0VarArr = (tx0Var = this.d).Z2) != null) {
            int i11 = i10 - 1;
            px0 px0Var = px0VarArr[i11];
            final ox0 ox0Var = (ox0) b1Var.f46342a;
            if (tx0Var.f30924n3 != i11) {
                z10 = false;
            }
            ox0Var.getClass();
            if (!TextUtils.isEmpty(px0Var.d)) {
                ox0Var.setContentDescription(px0Var.d);
            } else if (!TextUtils.isEmpty(px0Var.f29685a)) {
                ox0Var.setContentDescription(px0Var.f29685a);
            } else {
                ox0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = ox0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                ox0Var.G = null;
            }
            ox0Var.setImageResource(0);
            ox0Var.a();
            final boolean G1 = ox0Var.H.G1();
            ox0Var.f29424w = false;
            ox0Var.f29426y = 1.0f;
            p5.h(UserConfig.selectedAccount).b(px0Var.f29687c, new m5() {
                @Override
                public final void a(TLRPC.Document document) {
                    ox0 ox0Var2 = ox0.this;
                    ox0Var2.setOnlyLastFrame(!G1);
                    ox0Var2.g(24, 24, document);
                    ox0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new jr0(ox0Var, 10), 60L);
            ox0Var.l(z10, false);
            ox0Var.setAlpha(tx0Var.f30926p3);
            ox0Var.setScaleX(tx0Var.f30926p3);
            ox0Var.setScaleY(tx0Var.f30926p3);
            ox0Var.j();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ox0 ox0Var;
        tx0 tx0Var = this.d;
        if (i10 == 0) {
            ai.jc jcVar = new ai.jc(this, tx0Var.getContext(), 25);
            tx0Var.f30923m3 = jcVar;
            ox0Var = jcVar;
        } else {
            ox0Var = new ox0(tx0Var, tx0Var.getContext());
        }
        return new s4.b1(ox0Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10 = true;
        if (b1Var.f46345f == 1) {
            ox0 ox0Var = (ox0) b1Var.f46342a;
            if (this.d.f30924n3 != b1Var.b() - 1) {
                z10 = false;
            }
            ox0Var.l(z10, false);
            ox0Var.j();
        }
    }
}
