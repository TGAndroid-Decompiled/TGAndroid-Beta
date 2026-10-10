package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class qv0 extends nm0 {
    public final Context f30303r;
    public final cw0 f30304s;

    public qv0(cw0 cw0Var, Context context) {
        this.f30304s = cw0Var;
        this.f30303r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(rm0 rm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        rv0[] rv0VarArr = this.f30304s.f25470t1;
        int i11 = 1;
        if ((rv0VarArr[3].f30580c.size() == 0 && !rv0VarArr[3].f30583g) || i10 >= rv0VarArr[3].f30580c.size()) {
            return 1;
        }
        rv0 rv0Var = rv0VarArr[3];
        int size = ((ArrayList) rv0Var.d.get(rv0Var.f30580c.get(i10))).size();
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
        rv0[] rv0VarArr = this.f30304s.f25470t1;
        if (rv0VarArr[3].f30580c.size() == 0 && !rv0VarArr[3].f30583g) {
            return 5;
        }
        if (i10 < rv0VarArr[3].f30580c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qv0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        cw0 cw0Var = this.f30304s;
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f30303r, 28, cw0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < cw0Var.f25470t1[3].f30580c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) cw0Var.f25470t1[3].d.get((String) cw0Var.f25470t1[3].f30580c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.d1 d1Var) {
        rv0[] rv0VarArr = this.f30304s.f25470t1;
        if (rv0VarArr[3].f30580c.size() != 0 || rv0VarArr[3].f30583g) {
            if (i10 != 0 && i11 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.d1 d1Var) {
        boolean z10;
        char c10;
        cw0 cw0Var = this.f30304s;
        rv0[] rv0VarArr = cw0Var.f25470t1;
        int i12 = d1Var.f47706f;
        View view = d1Var.f47702a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) rv0VarArr[3].d.get((String) rv0VarArr[3].f30580c.get(i10));
            int i13 = d1Var.f47706f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.n7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != rv0VarArr[3].f30580c.size() - 1 || !rv0VarArr[3].f30583g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n7Var.f22550y = z10;
                        n7Var.e();
                        n7Var.f22531b0 = messageObject;
                        n7Var.requestLayout();
                        if (cw0Var.C1) {
                            SparseArray[] sparseArrayArr = cw0Var.Z0;
                            if (messageObject.getDialogId() == cw0Var.f25449j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            n7Var.f(z11, !cw0Var.f25428b1);
                            return;
                        }
                        n7Var.f(false, !cw0Var.f25428b1);
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
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v3 v3Var;
        cw0 cw0Var = this.f30304s;
        org.telegram.ui.ActionBar.e6 e6Var = cw0Var.F1;
        Context context = this.f30303r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    k10 k10Var = new k10(context, e6Var);
                    k10Var.setIsSingleCell(true);
                    k10Var.f27857w = false;
                    k10Var.setViewType(5);
                    v3Var = k10Var;
                } else {
                    pu0 M = cw0.M(3, cw0Var.f25449j1, context, e6Var);
                    M.setLayoutParams(new s4.q0(-1, -1));
                    return new s4.d1(M);
                }
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, e6Var);
                n7Var.setDelegate(cw0Var.S1);
                v3Var = n7Var;
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, 28, e6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(v3Var, v3Var, -1, -2);
    }
}
