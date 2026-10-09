package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class pv0 extends mm0 {
    public final Context f29956r;
    public final bw0 f29957s;

    public pv0(bw0 bw0Var, Context context) {
        this.f29957s = bw0Var;
        this.f29956r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(qm0 qm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        qv0[] qv0VarArr = this.f29957s.f25162t1;
        int i11 = 1;
        if ((qv0VarArr[3].f30276c.size() == 0 && !qv0VarArr[3].f30279g) || i10 >= qv0VarArr[3].f30276c.size()) {
            return 1;
        }
        qv0 qv0Var = qv0VarArr[3];
        int size = ((ArrayList) qv0Var.d.get(qv0Var.f30276c.get(i10))).size();
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
        qv0[] qv0VarArr = this.f29957s.f25162t1;
        if (qv0VarArr[3].f30276c.size() == 0 && !qv0VarArr[3].f30279g) {
            return 5;
        }
        if (i10 < qv0VarArr[3].f30276c.size()) {
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
        bw0 bw0Var = this.f29957s;
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f29956r, 28, bw0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < bw0Var.f25162t1[3].f30276c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) bw0Var.f25162t1[3].d.get((String) bw0Var.f25162t1[3].f30276c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.d1 d1Var) {
        qv0[] qv0VarArr = this.f29957s.f25162t1;
        if (qv0VarArr[3].f30276c.size() != 0 || qv0VarArr[3].f30279g) {
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
        bw0 bw0Var = this.f29957s;
        qv0[] qv0VarArr = bw0Var.f25162t1;
        int i12 = d1Var.f47662f;
        View view = d1Var.f47658a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) qv0VarArr[3].d.get((String) qv0VarArr[3].f30276c.get(i10));
            int i13 = d1Var.f47662f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.n7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != qv0VarArr[3].f30276c.size() - 1 || !qv0VarArr[3].f30279g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n7Var.f22546y = z10;
                        n7Var.e();
                        n7Var.f22527b0 = messageObject;
                        n7Var.requestLayout();
                        if (bw0Var.C1) {
                            SparseArray[] sparseArrayArr = bw0Var.Z0;
                            if (messageObject.getDialogId() == bw0Var.f25141j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            n7Var.f(z11, !bw0Var.f25120b1);
                            return;
                        }
                        n7Var.f(false, !bw0Var.f25120b1);
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
        bw0 bw0Var = this.f29957s;
        org.telegram.ui.ActionBar.e6 e6Var = bw0Var.F1;
        Context context = this.f29956r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    j10 j10Var = new j10(context, e6Var);
                    j10Var.setIsSingleCell(true);
                    j10Var.f27555w = false;
                    j10Var.setViewType(5);
                    v3Var = j10Var;
                } else {
                    ou0 M = bw0.M(3, bw0Var.f25141j1, context, e6Var);
                    M.setLayoutParams(new s4.q0(-1, -1));
                    return new s4.d1(M);
                }
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, e6Var);
                n7Var.setDelegate(bw0Var.S1);
                v3Var = n7Var;
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, 28, e6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(v3Var, v3Var, -1, -2);
    }
}
