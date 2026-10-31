package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ae0 implements Runnable {
    public final int f35633a;
    public final me0 f35634b;

    public ae0(me0 me0Var, int i10) {
        this.f35633a = i10;
        this.f35634b = me0Var;
    }

    @Override
    public final void run() {
        bs[] bsVarArr;
        View view;
        int i10 = this.f35633a;
        int i11 = 0;
        me0 me0Var = this.f35634b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.ei0 ei0Var = me0Var.G;
                zr zrVar = me0Var.f39664f;
                int i12 = me0Var.f39667h0;
                if (i12 != 3 && (bsVarArr = zrVar.f44219f) != null) {
                    for (int length = bsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || zrVar.f44219f[length].length() != 0) {
                            zrVar.f44219f[length].requestFocus();
                            bs bsVar = zrVar.f44219f[length];
                            bsVar.setSelection(bsVar.length());
                            hf0.Z0(me0Var.f39682u0, zrVar.f44219f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.bi0 bi0Var = me0Var.f39656a;
                if (bi0Var != null) {
                    bi0Var.start();
                }
                if (i12 == 15) {
                    ei0Var.getAnimatedDrawable().N(0, false, false);
                    ei0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.i0.g3(new ae0(me0Var, 6));
                return;
            case 2:
                vc0 vc0Var = me0Var.f39684x;
                me0Var.f39680s0 = false;
                while (true) {
                    bs[] bsVarArr2 = me0Var.f39664f.f44219f;
                    if (i11 < bsVarArr2.length) {
                        bsVarArr2[i11].z(0.0f);
                        i11++;
                    } else {
                        if (me0Var.f39667h0 == 15) {
                            view = me0Var.F;
                        } else {
                            view = me0Var.D;
                        }
                        if (vc0Var.getCurrentView() != view) {
                            vc0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                org.telegram.messenger.i0.g3(new ae0(me0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.ei0 ei0Var2 = me0Var.f39679s;
                ei0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.bi0 bi0Var2 = me0Var.Q;
                bi0Var2.N(0, false, false);
                bi0Var2.K(1);
                ei0Var2.setAnimation(bi0Var2);
                ei0Var2.d();
                return;
            case 5:
                try {
                    me0Var.f39682u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(me0Var.getContext());
                String L0 = org.telegram.messenger.cd.L0(2131742823, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131752534, org.telegram.messenger.m5.h(new StringBuilder("+"), me0Var.d, af.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                x1Var.setOnDismissListener(new ie0(me0Var, 1));
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.Components.bi0 bi0Var3 = me0Var.R;
                bi0Var3.f24776t0 = new ae0(me0Var, 8);
                org.telegram.ui.Components.ei0 ei0Var3 = me0Var.f39679s;
                ei0Var3.setAutoRepeat(false);
                bi0Var3.N(0, false, false);
                ei0Var3.setAnimation(bi0Var3);
                ei0Var3.d();
                return;
            case 7:
                me0Var.postDelayed(new ae0(me0Var, 9), 150L);
                return;
            case 8:
                org.telegram.messenger.i0.g3(new ae0(me0Var, 10));
                return;
            case 9:
                zr zrVar2 = me0Var.f39664f;
                zrVar2.e = false;
                zrVar2.f44219f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = zrVar2.f44219f;
                    if (i11 < bsVarArr3.length) {
                        bsVarArr3[i11].z(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.ei0 ei0Var4 = me0Var.f39679s;
                ei0Var4.setAutoRepeat(false);
                ei0Var4.setAnimation(me0Var.f39656a);
                return;
        }
    }
}
