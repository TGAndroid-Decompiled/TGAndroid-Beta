package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class lv0 extends im0 {
    public final Context f26839r;
    public final xv0 f26840s;

    public lv0(xv0 xv0Var, Context context) {
        this.f26840s = xv0Var;
        this.f26839r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        mv0[] mv0VarArr = this.f26840s.f31065t1;
        int i11 = 1;
        if ((mv0VarArr[3].f27213c.size() == 0 && !mv0VarArr[3].f27215g) || i10 >= mv0VarArr[3].f27213c.size()) {
            return 1;
        }
        mv0 mv0Var = mv0VarArr[3];
        int size = ((ArrayList) mv0Var.d.get(mv0Var.f27213c.get(i10))).size();
        if (i10 == 0) {
            i11 = 0;
        }
        return size + i11;
    }

    @Override
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override
    public final int P(int i10, int i11) {
        mv0[] mv0VarArr = this.f26840s.f31065t1;
        if (mv0VarArr[3].f27213c.size() == 0 && !mv0VarArr[3].f27215g) {
            return 5;
        }
        if (i10 < mv0VarArr[3].f27213c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lv0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        xv0 xv0Var = this.f26840s;
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f26839r, 28, xv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < xv0Var.f31065t1[3].f27213c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) xv0Var.f31065t1[3].d.get((String) xv0Var.f31065t1[3].f27213c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        mv0[] mv0VarArr = this.f26840s.f31065t1;
        if (mv0VarArr[3].f27213c.size() != 0 || mv0VarArr[3].f27215g) {
            if (i10 != 0 && i11 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.b1 b1Var) {
        boolean z10;
        char c10;
        xv0 xv0Var = this.f26840s;
        mv0[] mv0VarArr = xv0Var.f31065t1;
        int i12 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) mv0VarArr[3].d.get((String) mv0VarArr[3].f27213c.get(i10));
            int i13 = b1Var.f44841f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.n7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != mv0VarArr[3].f27213c.size() - 1 || !mv0VarArr[3].f27215g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n7Var.f21295y = z10;
                        n7Var.e();
                        n7Var.f21277b0 = messageObject;
                        n7Var.requestLayout();
                        if (xv0Var.C1) {
                            SparseArray[] sparseArrayArr = xv0Var.Z0;
                            if (messageObject.getDialogId() == xv0Var.f31044j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            n7Var.f(z11, !xv0Var.f31024b1);
                            return;
                        }
                        n7Var.f(false, !xv0Var.f31024b1);
                        return;
                    }
                    return;
                }
                return;
            }
            MessageObject messageObject2 = (MessageObject) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.v3) {
                ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(messageObject2.messageOwner.date));
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v3 v3Var;
        xv0 xv0Var = this.f26840s;
        org.telegram.ui.ActionBar.c6 c6Var = xv0Var.F1;
        Context context = this.f26839r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    f10 f10Var = new f10(context, c6Var);
                    f10Var.setIsSingleCell(true);
                    f10Var.f24549w = false;
                    f10Var.setViewType(5);
                    v3Var = f10Var;
                } else {
                    ku0 M = xv0.M(3, xv0Var.f31044j1, context, c6Var);
                    M.setLayoutParams(new s4.o0(-1, -1));
                    return new s4.b1(M);
                }
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, c6Var);
                n7Var.setDelegate(xv0Var.S1);
                v3Var = n7Var;
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, 28, c6Var);
        }
        return com.google.android.gms.internal.play_billing.k3.l(v3Var, v3Var, -1, -2);
    }
}
