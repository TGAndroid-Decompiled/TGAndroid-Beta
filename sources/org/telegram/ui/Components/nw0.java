package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class nw0 extends kl0 {
    public int f26606c;
    public final ww0 d;

    public nw0(ww0 ww0Var) {
        this.d = ww0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42678f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        int length;
        ww0 ww0Var = this.d;
        sw0[] sw0VarArr = ww0Var.Y2;
        if (sw0VarArr == null) {
            length = 0;
        } else {
            length = sw0VarArr.length;
        }
        int i10 = length + 1;
        if (i10 != this.f26606c) {
            ci.eb ebVar = ww0Var.f29810l3;
            if (ebVar != null) {
                ebVar.requestLayout();
            }
            this.f26606c = i10;
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
        ww0 ww0Var;
        sw0[] sw0VarArr;
        boolean z10 = true;
        if (c1Var.f42678f == 1 && (sw0VarArr = (ww0Var = this.d).Y2) != null) {
            int i11 = i10 - 1;
            sw0 sw0Var = sw0VarArr[i11];
            final rw0 rw0Var = (rw0) c1Var.f42675a;
            if (ww0Var.f29811m3 != i11) {
                z10 = false;
            }
            rw0Var.getClass();
            if (!TextUtils.isEmpty(sw0Var.d)) {
                rw0Var.setContentDescription(sw0Var.d);
            } else if (!TextUtils.isEmpty(sw0Var.f27983a)) {
                rw0Var.setContentDescription(sw0Var.f27983a);
            } else {
                rw0Var.setContentDescription(null);
            }
            ValueAnimator valueAnimator = rw0Var.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                rw0Var.G = null;
            }
            rw0Var.setImageResource(0);
            rw0Var.a();
            final boolean A1 = rw0Var.H.A1();
            rw0Var.f27698w = false;
            rw0Var.f27700y = 1.0f;
            o5.h(UserConfig.selectedAccount).b(sw0Var.f27985c, new l5() {
                @Override
                public final void a(TLRPC.Document document) {
                    rw0 rw0Var2 = rw0.this;
                    rw0Var2.setOnlyLastFrame(!A1);
                    rw0Var2.g(24, 24, document);
                    rw0Var2.d();
                }
            });
            AndroidUtilities.runOnUIThread(new jq0(rw0Var, 9), 60L);
            rw0Var.l(z10, false);
            rw0Var.setAlpha(ww0Var.f29813o3);
            rw0Var.setScaleX(ww0Var.f29813o3);
            rw0Var.setScaleY(ww0Var.f29813o3);
            rw0Var.j();
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        rw0 rw0Var;
        ww0 ww0Var = this.d;
        if (i10 == 0) {
            ci.eb ebVar = new ci.eb(this, ww0Var.getContext(), 25);
            ww0Var.f29810l3 = ebVar;
            rw0Var = ebVar;
        } else {
            rw0Var = new rw0(ww0Var, ww0Var.getContext());
        }
        return new s4.c1(rw0Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10 = true;
        if (c1Var.f42678f == 1) {
            rw0 rw0Var = (rw0) c1Var.f42675a;
            if (this.d.f29811m3 != c1Var.b() - 1) {
                z10 = false;
            }
            rw0Var.l(z10, false);
            rw0Var.j();
        }
    }
}
