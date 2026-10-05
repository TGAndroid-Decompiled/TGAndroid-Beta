package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class ev0 extends ul0 {
    public final Context f26218r;
    public final qv0 f26219s;

    public ev0(qv0 qv0Var, Context context) {
        this.f26219s = qv0Var;
        this.f26218r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(zl0 zl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        fv0[] fv0VarArr = this.f26219s.f30259t1;
        int i11 = 1;
        if ((fv0VarArr[3].f26593c.size() == 0 && !fv0VarArr[3].f26596g) || i10 >= fv0VarArr[3].f26593c.size()) {
            return 1;
        }
        fv0 fv0Var = fv0VarArr[3];
        int size = ((ArrayList) fv0Var.d.get(fv0Var.f26593c.get(i10))).size();
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
        fv0[] fv0VarArr = this.f26219s.f30259t1;
        if (fv0VarArr[3].f26593c.size() == 0 && !fv0VarArr[3].f26596g) {
            return 5;
        }
        if (i10 < fv0VarArr[3].f26593c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ev0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        qv0 qv0Var = this.f26219s;
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f26218r, 28, qv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < qv0Var.f30259t1[3].f26593c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) qv0Var.f30259t1[3].d.get((String) qv0Var.f30259t1[3].f26593c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        fv0[] fv0VarArr = this.f26219s.f30259t1;
        if (fv0VarArr[3].f26593c.size() != 0 || fv0VarArr[3].f26596g) {
            if (i10 != 0 && i11 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        boolean z10;
        char c10;
        qv0 qv0Var = this.f26219s;
        fv0[] fv0VarArr = qv0Var.f30259t1;
        int i12 = c1Var.f46542f;
        View view = c1Var.f46538a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) fv0VarArr[3].d.get((String) fv0VarArr[3].f26593c.get(i10));
            int i13 = c1Var.f46542f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.n7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != fv0VarArr[3].f26593c.size() - 1 || !fv0VarArr[3].f26596g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n7Var.f22561y = z10;
                        n7Var.e();
                        n7Var.f22542b0 = messageObject;
                        n7Var.requestLayout();
                        if (qv0Var.C1) {
                            SparseArray[] sparseArrayArr = qv0Var.Z0;
                            if (messageObject.getDialogId() == qv0Var.f30238j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            n7Var.f(z11, !qv0Var.f30217b1);
                            return;
                        }
                        n7Var.f(false, !qv0Var.f30217b1);
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
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v3 v3Var;
        qv0 qv0Var = this.f26219s;
        org.telegram.ui.ActionBar.d6 d6Var = qv0Var.F1;
        Context context = this.f26218r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    w00 w00Var = new w00(context, d6Var);
                    w00Var.setIsSingleCell(true);
                    w00Var.f32460w = false;
                    w00Var.setViewType(5);
                    v3Var = w00Var;
                } else {
                    du0 M = qv0.M(3, qv0Var.f30238j1, context, d6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new s4.c1(M);
                }
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, d6Var);
                n7Var.setDelegate(qv0Var.S1);
                v3Var = n7Var;
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, 28, d6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(v3Var, v3Var, -1, -2);
    }
}
