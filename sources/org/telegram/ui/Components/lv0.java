package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class lv0 extends im0 {
    public final Context f28427r;
    public final xv0 f28428s;

    public lv0(xv0 xv0Var, Context context) {
        this.f28428s = xv0Var;
        this.f28427r = context;
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
        mv0[] mv0VarArr = this.f28428s.f32707t1;
        int i11 = 1;
        if ((mv0VarArr[3].f28759c.size() == 0 && !mv0VarArr[3].f28761g) || i10 >= mv0VarArr[3].f28759c.size()) {
            return 1;
        }
        mv0 mv0Var = mv0VarArr[3];
        int size = ((ArrayList) mv0Var.d.get(mv0Var.f28759c.get(i10))).size();
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
        mv0[] mv0VarArr = this.f28428s.f32707t1;
        if (mv0VarArr[3].f28759c.size() == 0 && !mv0VarArr[3].f28761g) {
            return 5;
        }
        if (i10 < mv0VarArr[3].f28759c.size()) {
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
        xv0 xv0Var = this.f28428s;
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f28427r, 28, xv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < xv0Var.f32707t1[3].f28759c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) xv0Var.f32707t1[3].d.get((String) xv0Var.f32707t1[3].f28759c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        mv0[] mv0VarArr = this.f28428s.f32707t1;
        if (mv0VarArr[3].f28759c.size() != 0 || mv0VarArr[3].f28761g) {
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
        xv0 xv0Var = this.f28428s;
        mv0[] mv0VarArr = xv0Var.f32707t1;
        int i12 = b1Var.f46346f;
        View view = b1Var.f46343a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) mv0VarArr[3].d.get((String) mv0VarArr[3].f28759c.get(i10));
            int i13 = b1Var.f46346f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.n7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != mv0VarArr[3].f28759c.size() - 1 || !mv0VarArr[3].f28761g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n7Var.f22815y = z10;
                        n7Var.e();
                        n7Var.f22797b0 = messageObject;
                        n7Var.requestLayout();
                        if (xv0Var.C1) {
                            SparseArray[] sparseArrayArr = xv0Var.Z0;
                            if (messageObject.getDialogId() == xv0Var.f32686j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            n7Var.f(z11, !xv0Var.f32663b1);
                            return;
                        }
                        n7Var.f(false, !xv0Var.f32663b1);
                        return;
                    }
                    return;
                }
                return;
            }
            MessageObject messageObject2 = (MessageObject) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.u3) {
                ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(messageObject2.messageOwner.date));
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        xv0 xv0Var = this.f28428s;
        org.telegram.ui.ActionBar.g6 g6Var = xv0Var.F1;
        Context context = this.f28427r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    b10 b10Var = new b10(context, g6Var);
                    b10Var.setIsSingleCell(true);
                    b10Var.f24923w = false;
                    b10Var.setViewType(5);
                    u3Var = b10Var;
                } else {
                    ku0 N = xv0.N(3, xv0Var.f32686j1, context, g6Var);
                    N.setLayoutParams(new s4.o0(-1, -1));
                    return new s4.b1(N);
                }
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, g6Var);
                n7Var.setDelegate(xv0Var.T1);
                u3Var = n7Var;
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, 28, g6Var);
        }
        return com.google.android.gms.internal.play_billing.k3.l(u3Var, u3Var, -1, -2);
    }
}
