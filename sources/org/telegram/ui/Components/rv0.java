package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class rv0 extends om0 {
    public final Context f30552r;
    public final dw0 f30553s;

    public rv0(dw0 dw0Var, Context context) {
        this.f30553s = dw0Var;
        this.f30552r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(sm0 sm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        sv0[] sv0VarArr = this.f30553s.f25731t1;
        int i11 = 1;
        if ((sv0VarArr[3].f30869c.size() == 0 && !sv0VarArr[3].f30872g) || i10 >= sv0VarArr[3].f30869c.size()) {
            return 1;
        }
        sv0 sv0Var = sv0VarArr[3];
        int size = ((ArrayList) sv0Var.d.get(sv0Var.f30869c.get(i10))).size();
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
        sv0[] sv0VarArr = this.f30553s.f25731t1;
        if (sv0VarArr[3].f30869c.size() == 0 && !sv0VarArr[3].f30872g) {
            return 5;
        }
        if (i10 < sv0VarArr[3].f30869c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rv0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        dw0 dw0Var = this.f30553s;
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f30552r, 28, dw0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < dw0Var.f25731t1[3].f30869c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) dw0Var.f25731t1[3].d.get((String) dw0Var.f25731t1[3].f30869c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.d1 d1Var) {
        sv0[] sv0VarArr = this.f30553s.f25731t1;
        if (sv0VarArr[3].f30869c.size() != 0 || sv0VarArr[3].f30872g) {
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
        dw0 dw0Var = this.f30553s;
        sv0[] sv0VarArr = dw0Var.f25731t1;
        int i12 = d1Var.f47752f;
        View view = d1Var.f47748a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) sv0VarArr[3].d.get((String) sv0VarArr[3].f30869c.get(i10));
            int i13 = d1Var.f47752f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.n7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != sv0VarArr[3].f30869c.size() - 1 || !sv0VarArr[3].f30872g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n7Var.f22538y = z10;
                        n7Var.e();
                        n7Var.f22519b0 = messageObject;
                        n7Var.requestLayout();
                        if (dw0Var.C1) {
                            SparseArray[] sparseArrayArr = dw0Var.Z0;
                            if (messageObject.getDialogId() == dw0Var.f25710j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            n7Var.f(z11, !dw0Var.f25689b1);
                            return;
                        }
                        n7Var.f(false, !dw0Var.f25689b1);
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
        dw0 dw0Var = this.f30553s;
        org.telegram.ui.ActionBar.d6 d6Var = dw0Var.F1;
        Context context = this.f30552r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    k10 k10Var = new k10(context, d6Var);
                    k10Var.setIsSingleCell(true);
                    k10Var.f27811w = false;
                    k10Var.setViewType(5);
                    v3Var = k10Var;
                } else {
                    qu0 M = dw0.M(3, dw0Var.f25710j1, context, d6Var);
                    M.setLayoutParams(new s4.q0(-1, -1));
                    return new s4.d1(M);
                }
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, d6Var);
                n7Var.setDelegate(dw0Var.S1);
                v3Var = n7Var;
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, 28, d6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(v3Var, v3Var, -1, -2);
    }
}
