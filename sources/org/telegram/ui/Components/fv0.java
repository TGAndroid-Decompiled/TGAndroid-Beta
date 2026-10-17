package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class fv0 extends ql0 {
    public final Context f26396c;
    public final int d;
    public boolean e;
    public final sv0 f26397f;

    public fv0(sv0 sv0Var, Context context, int i10) {
        this.f26397f = sv0Var;
        this.f26396c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f26397f.f30384t1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((qu0) arrayList.get(i11)).f29754b) {
                    return ((qu0) arrayList.get(i11)).f29753a;
                }
            }
            return ((qu0) i0.a.h(1, arrayList)).f29753a;
        }
        return "";
    }

    @Override
    public final void G(im0 im0Var, float f7, int[] iArr) {
        int measuredHeight = im0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (im0Var.getMeasuredHeight() - im0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(im0 im0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < im0Var.getChildCount() && (i10 = sv0.q(im0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f26397f.S(this.d, im0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        lu0 W = this.f26397f.W(this.d);
        if (W != null) {
            sv0.r(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        hv0[] hv0VarArr = this.f26397f.f30384t1;
        int i12 = this.d;
        hv0 hv0Var = hv0VarArr[i12];
        if (hv0Var.f26953o) {
            return hv0Var.e();
        }
        if (hv0Var.f26942a.size() == 0 && !hv0VarArr[i12].f26946g) {
            return 1;
        }
        if (hv0VarArr[i12].f26942a.size() == 0) {
            hv0 hv0Var2 = hv0VarArr[i12];
            boolean[] zArr = hv0Var2.f26947i;
            if ((!zArr[0] || !zArr[1]) && hv0Var2.f26950l) {
                return 0;
            }
        }
        if (hv0VarArr[i12].e() == 0) {
            int size = hv0VarArr[i12].c().size() + hv0VarArr[i12].d();
            if (size != 0) {
                hv0 hv0Var3 = hv0VarArr[i12];
                boolean[] zArr2 = hv0Var3.f26947i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = hv0Var3.f26956r;
                    if (z10) {
                        i10 = hv0Var3.f26959u;
                    } else {
                        i10 = hv0Var3.f26952n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = hv0Var3.f26959u;
                        } else {
                            i11 = hv0Var3.f26952n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(hv0VarArr[i12].e(), hv0VarArr[i12].c().size() + hv0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        hv0[] hv0VarArr = this.f26397f.f30384t1;
        int i11 = this.d;
        if (hv0VarArr[i11].f26944c.size() == 0 && !hv0VarArr[i11].f26946g) {
            return 9;
        }
        hv0 hv0Var = hv0VarArr[i11];
        int i12 = hv0Var.f26951m;
        if (i10 >= i12 && i10 < hv0Var.f26942a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f26397f.f30384t1[this.d].e();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        sv0 sv0Var = this.f26397f;
        long j10 = sv0Var.f30363j1;
        SparseArray[] sparseArrayArr = sv0Var.Z0;
        hv0 hv0Var = sv0Var.f30384t1[this.d];
        ArrayList arrayList = hv0Var.f26942a;
        int i11 = b1Var.f45941f;
        View view = b1Var.f45938a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.h7)) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - hv0Var.f26951m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h7Var.f(messageObject, z11);
                if (sv0Var.C1) {
                    if (messageObject.getDialogId() == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    h7Var.e(z12, !sv0Var.f30343b1);
                    return;
                }
                h7Var.e(false, !sv0Var.f30343b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.i7)) {
        } else {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - hv0Var.f26951m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i7Var.c(messageObject2, z10);
            if (sv0Var.C1) {
                if (messageObject2.getDialogId() == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                i7Var.b(z12, !sv0Var.f30343b1);
                return;
            }
            i7Var.b(false, !sv0Var.f30343b1);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        sv0 sv0Var = this.f26397f;
        b10 b10Var = sv0Var.f30395y;
        ArrayList arrayList = sv0Var.G0;
        org.telegram.ui.ActionBar.d6 d6Var = sv0Var.F1;
        Context context = this.f26396c;
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
                        view2 = new nu0(this, context, d6Var, 1);
                    }
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view2;
                    h7Var.setGlobalGradientView(b10Var);
                    view = view2;
                    if (i11 == 4) {
                        sv0Var.H0.add(h7Var);
                        view = view2;
                    }
                } else {
                    fu0 M = sv0.M(i11, sv0Var.f30363j1, context, d6Var);
                    M.setLayoutParams(new s4.o0(-1, -1));
                    return new s4.b1(M);
                }
            } else {
                b10 b10Var2 = new b10(context, d6Var);
                if (i11 == 2) {
                    b10Var2.setViewType(4);
                } else {
                    b10Var2.setViewType(3);
                }
                b10Var2.f24767w = false;
                b10Var2.setIsSingleCell(true);
                b10Var2.setGlobalGradientView(b10Var);
                view = b10Var2;
            }
        } else {
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 0, d6Var);
            i7Var.setGlobalGradientView(b10Var);
            view = i7Var;
        }
        return com.google.android.gms.internal.cast.a6.l(view, view, -1, -2);
    }
}
