package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class zu0 extends ul0 {
    public final Context f30959r;
    public final lv0 f30960s;

    public zu0(lv0 lv0Var, Context context) {
        this.f30960s = lv0Var;
        this.f30959r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(yl0 yl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        av0[] av0VarArr = this.f30960s.f26230t1;
        int i11 = 1;
        if ((av0VarArr[3].f22746c.size() == 0 && !av0VarArr[3].f22748g) || i10 >= av0VarArr[3].f22746c.size()) {
            return 1;
        }
        av0 av0Var = av0VarArr[3];
        int size = ((ArrayList) av0Var.d.get(av0Var.f22746c.get(i10))).size();
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
        av0[] av0VarArr = this.f30960s.f26230t1;
        if (av0VarArr[3].f22746c.size() == 0 && !av0VarArr[3].f22748g) {
            return 5;
        }
        if (i10 < av0VarArr[3].f22746c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zu0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        lv0 lv0Var = this.f30960s;
        if (view == null) {
            view = new org.telegram.ui.Cells.w3(this.f30959r, 28, lv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < lv0Var.f26230t1[3].f22746c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.w3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) lv0Var.f26230t1[3].d.get((String) lv0Var.f26230t1[3].f22746c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        av0[] av0VarArr = this.f30960s.f26230t1;
        if (av0VarArr[3].f22746c.size() != 0 || av0VarArr[3].f22748g) {
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
        lv0 lv0Var = this.f30960s;
        av0[] av0VarArr = lv0Var.f26230t1;
        int i12 = c1Var.f42998f;
        View view = c1Var.f42995a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) av0VarArr[3].d.get((String) av0VarArr[3].f22746c.get(i10));
            int i13 = c1Var.f42998f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.o7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != av0VarArr[3].f22746c.size() - 1 || !av0VarArr[3].f22748g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        o7Var.f20792y = z10;
                        o7Var.e();
                        o7Var.f20774b0 = messageObject;
                        o7Var.requestLayout();
                        if (lv0Var.C1) {
                            SparseArray[] sparseArrayArr = lv0Var.Z0;
                            if (messageObject.getDialogId() == lv0Var.f26209j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            o7Var.f(z11, !lv0Var.f26189b1);
                            return;
                        }
                        o7Var.f(false, !lv0Var.f26189b1);
                        return;
                    }
                    return;
                }
                return;
            }
            MessageObject messageObject2 = (MessageObject) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.w3) {
                ((org.telegram.ui.Cells.w3) view).setText(LocaleController.formatSectionDate(messageObject2.messageOwner.date));
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.w3 w3Var;
        lv0 lv0Var = this.f30960s;
        org.telegram.ui.ActionBar.f6 f6Var = lv0Var.F1;
        Context context = this.f30959r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    t00 t00Var = new t00(context, f6Var);
                    t00Var.setIsSingleCell(true);
                    t00Var.f28362w = false;
                    t00Var.setViewType(5);
                    w3Var = t00Var;
                } else {
                    yt0 M = lv0.M(3, lv0Var.f26209j1, context, f6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new s4.c1(M);
                }
            } else {
                org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 0, f6Var);
                o7Var.setDelegate(lv0Var.S1);
                w3Var = o7Var;
            }
        } else {
            w3Var = new org.telegram.ui.Cells.w3(context, 28, f6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(w3Var, w3Var, -1, -2);
    }
}
