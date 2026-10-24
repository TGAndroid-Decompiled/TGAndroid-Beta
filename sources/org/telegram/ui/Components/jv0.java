package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class jv0 extends tl0 {
    public final Context f27802c;
    public final int d;
    public boolean e;
    public final wv0 f27803f;

    public jv0(wv0 wv0Var, Context context, int i10) {
        this.f27803f = wv0Var;
        this.f27802c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f27803f.f32406t1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((uu0) arrayList.get(i11)).f31227b) {
                    return ((uu0) arrayList.get(i11)).f31226a;
                }
            }
            return ((uu0) i2.o1.i(1, arrayList)).f31226a;
        }
        return "";
    }

    @Override
    public final void G(lm0 lm0Var, float f7, int[] iArr) {
        int measuredHeight = lm0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (lm0Var.getMeasuredHeight() - lm0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(lm0 lm0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < lm0Var.getChildCount() && (i10 = wv0.q(lm0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f27803f.T(this.d, lm0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        pu0 X = this.f27803f.X(this.d);
        if (X != null) {
            wv0.r(X, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        lv0[] lv0VarArr = this.f27803f.f32406t1;
        int i12 = this.d;
        lv0 lv0Var = lv0VarArr[i12];
        if (lv0Var.f28450o) {
            return lv0Var.e();
        }
        if (lv0Var.f28439a.size() == 0 && !lv0VarArr[i12].f28443g) {
            return 1;
        }
        if (lv0VarArr[i12].f28439a.size() == 0) {
            lv0 lv0Var2 = lv0VarArr[i12];
            boolean[] zArr = lv0Var2.f28444i;
            if ((!zArr[0] || !zArr[1]) && lv0Var2.f28447l) {
                return 0;
            }
        }
        if (lv0VarArr[i12].e() == 0) {
            int size = lv0VarArr[i12].c().size() + lv0VarArr[i12].d();
            if (size != 0) {
                lv0 lv0Var3 = lv0VarArr[i12];
                boolean[] zArr2 = lv0Var3.f28444i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z10 = lv0Var3.f28453r;
                    if (z10) {
                        i10 = lv0Var3.f28456u;
                    } else {
                        i10 = lv0Var3.f28449n;
                    }
                    if (i10 != 0) {
                        if (z10) {
                            i11 = lv0Var3.f28456u;
                        } else {
                            i11 = lv0Var3.f28449n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(lv0VarArr[i12].e(), lv0VarArr[i12].c().size() + lv0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        lv0[] lv0VarArr = this.f27803f.f32406t1;
        int i11 = this.d;
        if (lv0VarArr[i11].f28441c.size() == 0 && !lv0VarArr[i11].f28443g) {
            return 9;
        }
        lv0 lv0Var = lv0VarArr[i11];
        int i12 = lv0Var.f28448m;
        if (i10 >= i12 && i10 < lv0Var.f28439a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f27803f.f32406t1[this.d].e();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        char c10;
        boolean z11;
        char c11;
        wv0 wv0Var = this.f27803f;
        long j10 = wv0Var.f32385j1;
        SparseArray[] sparseArrayArr = wv0Var.Z0;
        lv0 lv0Var = wv0Var.f32406t1[this.d];
        ArrayList arrayList = lv0Var.f28439a;
        int i11 = b1Var.f46345f;
        View view = b1Var.f46342a;
        boolean z12 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.j7)) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - lv0Var.f28448m);
                if (i10 != arrayList.size() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j7Var.f(messageObject, z11);
                if (wv0Var.C1) {
                    if (messageObject.getDialogId() == j10) {
                        c11 = 0;
                    } else {
                        c11 = 1;
                    }
                    if (sparseArrayArr[c11].indexOfKey(messageObject.getId()) >= 0) {
                        z12 = true;
                    }
                    j7Var.e(z12, !wv0Var.f32362b1);
                    return;
                }
                j7Var.e(false, !wv0Var.f32362b1);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.k7)) {
        } else {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - lv0Var.f28448m);
            if (i10 != arrayList.size() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            k7Var.c(messageObject2, z10);
            if (wv0Var.C1) {
                if (messageObject2.getDialogId() == j10) {
                    c10 = 0;
                } else {
                    c10 = 1;
                }
                if (sparseArrayArr[c10].indexOfKey(messageObject2.getId()) >= 0) {
                    z12 = true;
                }
                k7Var.b(z12, !wv0Var.f32362b1);
                return;
            }
            k7Var.b(false, !wv0Var.f32362b1);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        wv0 wv0Var = this.f27803f;
        z00 z00Var = wv0Var.f32417y;
        ArrayList arrayList = wv0Var.G0;
        org.telegram.ui.ActionBar.g6 g6Var = wv0Var.F1;
        Context context = this.f27802c;
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
                        view2 = new ru0(this, context, g6Var, 1);
                    }
                    org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view2;
                    j7Var.setGlobalGradientView(z00Var);
                    view = view2;
                    if (i11 == 4) {
                        wv0Var.H0.add(j7Var);
                        view = view2;
                    }
                } else {
                    ju0 N = wv0.N(i11, wv0Var.f32385j1, context, g6Var);
                    N.setLayoutParams(new s4.o0(-1, -1));
                    return new s4.b1(N);
                }
            } else {
                z00 z00Var2 = new z00(context, g6Var);
                if (i11 == 2) {
                    z00Var2.setViewType(4);
                } else {
                    z00Var2.setViewType(3);
                }
                z00Var2.f33104w = false;
                z00Var2.setIsSingleCell(true);
                z00Var2.setGlobalGradientView(z00Var);
                view = z00Var2;
            }
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 0, g6Var);
            k7Var.setGlobalGradientView(z00Var);
            view = k7Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
