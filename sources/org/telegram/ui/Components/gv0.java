package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class gv0 extends ql0 {
    public final Context f26700c;
    public final int d;
    public boolean e;
    public final tv0 f26701f;

    public gv0(tv0 tv0Var, Context context, int i10) {
        this.f26701f = tv0Var;
        this.f26700c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f26701f.f30730t1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((ru0) arrayList.get(i11)).f30054b) {
                    return ((ru0) arrayList.get(i11)).f30053a;
                }
            }
            return ((ru0) i2.e.h(1, arrayList)).f30053a;
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
            for (int i11 = 0; i11 < im0Var.getChildCount() && (i10 = tv0.q(im0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f26701f.S(this.d, im0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        mu0 W = this.f26701f.W(this.d);
        if (W != null) {
            tv0.r(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        iv0[] iv0VarArr = this.f26701f.f30730t1;
        int i12 = this.d;
        iv0 iv0Var = iv0VarArr[i12];
        if (iv0Var.f27374o) {
            return iv0Var.e();
        }
        if (iv0Var.f27363a.size() == 0 && !iv0VarArr[i12].f27367g) {
            return 1;
        }
        if (iv0VarArr[i12].f27363a.size() == 0) {
            iv0 iv0Var2 = iv0VarArr[i12];
            boolean[] zArr = iv0Var2.f27368i;
            if ((!zArr[0] || !zArr[1]) && iv0Var2.f27371l) {
                return 0;
            }
        }
        if (iv0VarArr[i12].e() == 0) {
            int size = iv0VarArr[i12].c().size() + iv0VarArr[i12].d();
            if (size != 0) {
                iv0 iv0Var3 = iv0VarArr[i12];
                boolean[] zArr2 = iv0Var3.f27368i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = iv0Var3.f27377r;
                    if (z10) {
                        i10 = iv0Var3.f27380u;
                    } else {
                        i10 = iv0Var3.f27373n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = iv0Var3.f27380u;
                        } else {
                            i11 = iv0Var3.f27373n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(iv0VarArr[i12].e(), iv0VarArr[i12].c().size() + iv0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        iv0[] iv0VarArr = this.f26701f.f30730t1;
        int i11 = this.d;
        if (iv0VarArr[i11].f27365c.size() == 0 && !iv0VarArr[i11].f27367g) {
            return 9;
        }
        iv0 iv0Var = iv0VarArr[i11];
        int i12 = iv0Var.f27372m;
        if (i10 >= i12 && i10 < iv0Var.f27363a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f26701f.f30730t1[this.d].e();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        tv0 tv0Var = this.f26701f;
        long j10 = tv0Var.f30709j1;
        SparseArray[] sparseArrayArr = tv0Var.Z0;
        iv0 iv0Var = tv0Var.f30730t1[this.d];
        ArrayList arrayList = iv0Var.f27363a;
        int i11 = b1Var.f45913f;
        View view = b1Var.f45910a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.h7)) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - iv0Var.f27372m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h7Var.f(messageObject, z11);
                if (tv0Var.C1) {
                    if (messageObject.getDialogId() == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    h7Var.e(z12, !tv0Var.f30689b1);
                    return;
                }
                h7Var.e(false, !tv0Var.f30689b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.i7)) {
        } else {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - iv0Var.f27372m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i7Var.c(messageObject2, z10);
            if (tv0Var.C1) {
                if (messageObject2.getDialogId() == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                i7Var.b(z12, !tv0Var.f30689b1);
                return;
            }
            i7Var.b(false, !tv0Var.f30689b1);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        tv0 tv0Var = this.f26701f;
        b10 b10Var = tv0Var.f30741y;
        ArrayList arrayList = tv0Var.G0;
        org.telegram.ui.ActionBar.d6 d6Var = tv0Var.F1;
        Context context = this.f26700c;
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
                        view2 = new ou0(this, context, d6Var, 1);
                    }
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view2;
                    h7Var.setGlobalGradientView(b10Var);
                    view = view2;
                    if (i11 == 4) {
                        tv0Var.H0.add(h7Var);
                        view = view2;
                    }
                } else {
                    gu0 M = tv0.M(i11, tv0Var.f30709j1, context, d6Var);
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
                b10Var2.f24772w = false;
                b10Var2.setIsSingleCell(true);
                b10Var2.setGlobalGradientView(b10Var);
                view = b10Var2;
            }
        } else {
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 0, d6Var);
            i7Var.setGlobalGradientView(b10Var);
            view = i7Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
