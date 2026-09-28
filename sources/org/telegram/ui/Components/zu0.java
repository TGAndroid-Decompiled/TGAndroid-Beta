package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class zu0 extends ul0 {
    public final Context f30976r;
    public final lv0 f30977s;

    public zu0(lv0 lv0Var, Context context) {
        this.f30977s = lv0Var;
        this.f30976r = context;
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
        av0[] av0VarArr = this.f30977s.f26156t1;
        int i11 = 1;
        if ((av0VarArr[3].f22733c.size() == 0 && !av0VarArr[3].f22735g) || i10 >= av0VarArr[3].f22733c.size()) {
            return 1;
        }
        av0 av0Var = av0VarArr[3];
        int size = ((ArrayList) av0Var.d.get(av0Var.f22733c.get(i10))).size();
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
        av0[] av0VarArr = this.f30977s.f26156t1;
        if (av0VarArr[3].f22733c.size() == 0 && !av0VarArr[3].f22735g) {
            return 5;
        }
        if (i10 < av0VarArr[3].f22733c.size()) {
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
        lv0 lv0Var = this.f30977s;
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f30976r, 28, lv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < lv0Var.f26156t1[3].f22733c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) lv0Var.f26156t1[3].d.get((String) lv0Var.f26156t1[3].f22733c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        av0[] av0VarArr = this.f30977s.f26156t1;
        if (av0VarArr[3].f22733c.size() != 0 || av0VarArr[3].f22735g) {
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
        lv0 lv0Var = this.f30977s;
        av0[] av0VarArr = lv0Var.f26156t1;
        int i12 = c1Var.f42964f;
        View view = c1Var.f42961a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) av0VarArr[3].d.get((String) av0VarArr[3].f22733c.get(i10));
            int i13 = c1Var.f42964f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.n7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != av0VarArr[3].f22733c.size() - 1 || !av0VarArr[3].f22735g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n7Var.f20721y = z10;
                        n7Var.e();
                        n7Var.f20703b0 = messageObject;
                        n7Var.requestLayout();
                        if (lv0Var.C1) {
                            SparseArray[] sparseArrayArr = lv0Var.Z0;
                            if (messageObject.getDialogId() == lv0Var.f26135j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            n7Var.f(z11, !lv0Var.f26115b1);
                            return;
                        }
                        n7Var.f(false, !lv0Var.f26115b1);
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
        lv0 lv0Var = this.f30977s;
        org.telegram.ui.ActionBar.d6 d6Var = lv0Var.F1;
        Context context = this.f30976r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    v00 v00Var = new v00(context, d6Var);
                    v00Var.setIsSingleCell(true);
                    v00Var.f28924w = false;
                    v00Var.setViewType(5);
                    v3Var = v00Var;
                } else {
                    yt0 M = lv0.M(3, lv0Var.f26135j1, context, d6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new s4.c1(M);
                }
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, d6Var);
                n7Var.setDelegate(lv0Var.S1);
                v3Var = n7Var;
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, 28, d6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(v3Var, v3Var, -1, -2);
    }
}
