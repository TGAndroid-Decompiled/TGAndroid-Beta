package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class uv0 extends em0 {
    public final Context f31267c;
    public final int d;
    public boolean f31268e;
    public final hw0 f31269f;

    public uv0(hw0 hw0Var, Context context, int i10) {
        this.f31269f = hw0Var;
        this.f31267c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f31269f.f26953t1[this.d].f32555e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((fv0) arrayList.get(i11)).f26177b) {
                    return ((fv0) arrayList.get(i11)).f26176a;
                }
            }
            return ((fv0) hg.c.h(1, arrayList)).f26176a;
        }
        return "";
    }

    @Override
    public final void G(wm0 wm0Var, float f7, int[] iArr) {
        int measuredHeight = wm0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (wm0Var.getMeasuredHeight() - wm0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(wm0 wm0Var) {
        if (this.f31268e) {
            this.f31268e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < wm0Var.getChildCount() && (i10 = hw0.p(wm0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f31269f.S(this.d, wm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f31268e = true;
        av0 W = this.f31269f.W(this.d);
        if (W != null) {
            hw0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        wv0[] wv0VarArr = this.f31269f.f26953t1;
        int i12 = this.d;
        wv0 wv0Var = wv0VarArr[i12];
        if (wv0Var.f32564o) {
            return wv0Var.e();
        }
        if (wv0Var.f32552a.size() == 0 && !wv0VarArr[i12].f32557g) {
            return 1;
        }
        if (wv0VarArr[i12].f32552a.size() == 0) {
            wv0 wv0Var2 = wv0VarArr[i12];
            boolean[] zArr = wv0Var2.f32558i;
            if ((!zArr[0] || !zArr[1]) && wv0Var2.f32561l) {
                return 0;
            }
        }
        if (wv0VarArr[i12].e() == 0) {
            int size = wv0VarArr[i12].c().size() + wv0VarArr[i12].d();
            if (size != 0) {
                wv0 wv0Var3 = wv0VarArr[i12];
                boolean[] zArr2 = wv0Var3.f32558i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = wv0Var3.f32567r;
                    if (z10) {
                        i10 = wv0Var3.f32570u;
                    } else {
                        i10 = wv0Var3.f32563n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = wv0Var3.f32570u;
                        } else {
                            i11 = wv0Var3.f32563n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(wv0VarArr[i12].e(), wv0VarArr[i12].c().size() + wv0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        wv0[] wv0VarArr = this.f31269f.f26953t1;
        int i11 = this.d;
        if (wv0VarArr[i11].f32554c.size() == 0 && !wv0VarArr[i11].f32557g) {
            return 9;
        }
        wv0 wv0Var = wv0VarArr[i11];
        int i12 = wv0Var.f32562m;
        if (i10 >= i12 && i10 < wv0Var.f32552a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f31269f.f26953t1[this.d].e();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        hw0 hw0Var = this.f31269f;
        long j3 = hw0Var.f26932j1;
        SparseArray[] sparseArrayArr = hw0Var.Z0;
        wv0 wv0Var = hw0Var.f26953t1[this.d];
        ArrayList arrayList = wv0Var.f32552a;
        int i11 = d1Var.f47901f;
        View view = d1Var.f47897a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.i7)) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - wv0Var.f32562m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i7Var.f(messageObject, z11);
                if (hw0Var.C1) {
                    if (messageObject.getDialogId() == j3) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    i7Var.e(z12, !hw0Var.f26911b1);
                    return;
                }
                i7Var.e(false, !hw0Var.f26911b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.j7)) {
        } else {
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - wv0Var.f32562m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            j7Var.c(messageObject2, z10);
            if (hw0Var.C1) {
                if (messageObject2.getDialogId() == j3) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                j7Var.b(z12, !hw0Var.f26911b1);
                return;
            }
            j7Var.b(false, !hw0Var.f26911b1);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        hw0 hw0Var = this.f31269f;
        m10 m10Var = hw0Var.f26964y;
        ArrayList arrayList = hw0Var.G0;
        org.telegram.ui.ActionBar.c6 c6Var = hw0Var.F1;
        Context context = this.f31267c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 != 8) {
                if (i10 != 9) {
                    if (i11 == 4 && !arrayList.isEmpty()) {
                        View view3 = (View) arrayList.get(0);
                        arrayList.remove(0);
                        ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                        view2 = view3;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(view3);
                            view2 = view3;
                        }
                    } else {
                        view2 = new cv0(this, context, c6Var, 1);
                    }
                    org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view2;
                    i7Var.setGlobalGradientView(m10Var);
                    view = view2;
                    if (i11 == 4) {
                        hw0Var.H0.add(i7Var);
                        view = view2;
                    }
                } else {
                    uu0 M = hw0.M(i11, hw0Var.f26932j1, context, c6Var);
                    M.setLayoutParams(new s4.q0(-1, -1));
                    return new s4.d1(M);
                }
            } else {
                m10 m10Var2 = new m10(context, c6Var);
                if (i11 == 2) {
                    m10Var2.setViewType(4);
                } else {
                    m10Var2.setViewType(3);
                }
                m10Var2.f28350w = false;
                m10Var2.setIsSingleCell(true);
                m10Var2.setGlobalGradientView(m10Var);
                view = m10Var2;
            }
        } else {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 0, c6Var);
            j7Var.setGlobalGradientView(m10Var);
            view = j7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
