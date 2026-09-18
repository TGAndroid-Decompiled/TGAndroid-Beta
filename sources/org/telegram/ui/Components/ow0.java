package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class ow0 extends ll0 {
    public int f26874c;
    public final xw0 d;

    public ow0(xw0 xw0Var) {
        this.d = xw0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42705f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        xw0 xw0Var = this.d;
        tw0[] tw0VarArr = xw0Var.Y2;
        if (tw0VarArr == null) {
            length = 0;
        } else {
            length = tw0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f26874c) {
            ci.eb ebVar = xw0Var.f30014l3;
            if (ebVar != null) {
                ebVar.requestLayout();
            }
            this.f26874c = i10;
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
        xw0 xw0Var;
        tw0[] tw0VarArr;
        boolean z10 = true;
        if (c1Var.f42705f == 1 && (tw0VarArr = (xw0Var = this.d).Y2) != null) {
            int i11 = i10 - 1;
            tw0 tw0Var = tw0VarArr[i11];
            final sw0 sw0Var = (sw0) c1Var.f42702a;
            if (xw0Var.f30015m3 != i11) {
                z10 = false;
            }
            sw0Var.getClass();
            if (!TextUtils.isEmpty(tw0Var.d)) {
                sw0Var.setContentDescription(tw0Var.d);
            } else if (!TextUtils.isEmpty(tw0Var.f28215a)) {
                sw0Var.setContentDescription(tw0Var.f28215a);
            } else {
                sw0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = sw0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                sw0Var.G = null;
            }
            sw0Var.setImageResource(0);
            sw0Var.a();
            final boolean B1 = sw0Var.H.B1();
            sw0Var.f27942w = false;
            sw0Var.f27944y = 1.0f;
            o5.h(UserConfig.selectedAccount).b(tw0Var.f28217c, new l5() {
                @Override
                public final void a(TLRPC.Document document) {
                    sw0 sw0Var2 = sw0.this;
                    sw0Var2.setOnlyLastFrame(!B1);
                    sw0Var2.g(24, 24, document);
                    sw0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new kq0(sw0Var, 9), 60L);
            sw0Var.l(z10, false);
            sw0Var.setAlpha(xw0Var.f30017o3);
            sw0Var.setScaleX(xw0Var.f30017o3);
            sw0Var.setScaleY(xw0Var.f30017o3);
            sw0Var.j();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        sw0 sw0Var;
        xw0 xw0Var = this.d;
        if (i10 == 0) {
            ci.eb ebVar = new ci.eb(this, xw0Var.getContext(), 25);
            xw0Var.f30014l3 = ebVar;
            sw0Var = ebVar;
        } else {
            sw0Var = new sw0(xw0Var, xw0Var.getContext());
        }
        return new s4.c1(sw0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10 = true;
        if (c1Var.f42705f == 1) {
            sw0 sw0Var = (sw0) c1Var.f42702a;
            if (this.d.f30015m3 != c1Var.b() - 1) {
                z10 = false;
            }
            sw0Var.l(z10, false);
            sw0Var.j();
        }
    }
}
