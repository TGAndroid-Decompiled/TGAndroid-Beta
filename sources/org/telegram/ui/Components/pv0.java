package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class pv0 extends im0 {
    public final Context f31717r;
    public final bw0 f31718s;

    public pv0(bw0 bw0Var, Context context) {
        this.f31718s = bw0Var;
        this.f31717r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(nm0 nm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        qv0[] qv0VarArr = this.f31718s.f26986v1;
        int i11 = 1;
        if ((qv0VarArr[3].f32035c.size() == 0 && !qv0VarArr[3].f32037g) || i10 >= qv0VarArr[3].f32035c.size()) {
            return 1;
        }
        qv0 qv0Var = qv0VarArr[3];
        int size = ((ArrayList) qv0Var.d.get(qv0Var.f32035c.get(i10))).size();
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
        qv0[] qv0VarArr = this.f31718s.f26986v1;
        if (qv0VarArr[3].f32035c.size() == 0 && !qv0VarArr[3].f32037g) {
            return 5;
        }
        if (i10 < qv0VarArr[3].f32035c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pv0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        bw0 bw0Var = this.f31718s;
        if (view == null) {
            view = new org.telegram.ui.Cells.z3(this.f31717r, 28, bw0Var.H1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < bw0Var.f26986v1[3].f32035c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.z3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) bw0Var.f26986v1[3].d.get((String) bw0Var.f26986v1[3].f32035c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.e1 e1Var) {
        qv0[] qv0VarArr = this.f31718s.f26986v1;
        if (qv0VarArr[3].f32035c.size() != 0 || qv0VarArr[3].f32037g) {
            if (i10 != 0 && i11 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.e1 e1Var) {
        boolean z10;
        char c10;
        bw0 bw0Var = this.f31718s;
        qv0[] qv0VarArr = bw0Var.f26986v1;
        int i12 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) qv0VarArr[3].d.get((String) qv0VarArr[3].f32035c.get(i10));
            int i13 = e1Var.f47776f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.r7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != qv0VarArr[3].f32035c.size() - 1 || !qv0VarArr[3].f32037g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        r7Var.f24997y = z10;
                        r7Var.e();
                        r7Var.f24979b0 = messageObject;
                        r7Var.requestLayout();
                        if (bw0Var.E1) {
                            SparseArray[] sparseArrayArr = bw0Var.f26929b1;
                            if (messageObject.getDialogId() == bw0Var.l1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            r7Var.f(z11, !bw0Var.f26936d1);
                            return;
                        }
                        r7Var.f(false, !bw0Var.f26936d1);
                        return;
                    }
                    return;
                }
                return;
            }
            MessageObject messageObject2 = (MessageObject) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.z3) {
                ((org.telegram.ui.Cells.z3) view).setText(LocaleController.formatSectionDate(messageObject2.messageOwner.date));
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.z3 z3Var;
        bw0 bw0Var = this.f31718s;
        org.telegram.ui.ActionBar.u6 u6Var = bw0Var.H1;
        Context context = this.f31717r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    c10 c10Var = new c10(context, u6Var);
                    c10Var.setIsSingleCell(true);
                    c10Var.f27026w = false;
                    c10Var.setViewType(5);
                    z3Var = c10Var;
                } else {
                    ou0 U = bw0.U(3, bw0Var.l1, context, u6Var);
                    U.setLayoutParams(new s4.q0(-1, -1));
                    return new s4.e1(U);
                }
            } else {
                org.telegram.ui.Cells.r7 r7Var = new org.telegram.ui.Cells.r7(context, 0, u6Var);
                r7Var.setDelegate(bw0Var.V1);
                z3Var = r7Var;
            }
        } else {
            z3Var = new org.telegram.ui.Cells.z3(context, 28, u6Var);
        }
        return ic.a.n(z3Var, z3Var, -1, -2);
    }
}
