package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class xu0 extends sl0 {
    public final Context f30412r;
    public final jv0 f30413s;

    public xu0(jv0 jv0Var, Context context) {
        this.f30413s = jv0Var;
        this.f30412r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(wl0 wl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        yu0[] yu0VarArr = this.f30413s.f25555t1;
        int i11 = 1;
        if ((yu0VarArr[3].f30694c.size() == 0 && !yu0VarArr[3].f30696g) || i10 >= yu0VarArr[3].f30694c.size()) {
            return 1;
        }
        yu0 yu0Var = yu0VarArr[3];
        int size = ((ArrayList) yu0Var.d.get(yu0Var.f30694c.get(i10))).size();
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
        yu0[] yu0VarArr = this.f30413s.f25555t1;
        if (yu0VarArr[3].f30694c.size() == 0 && !yu0VarArr[3].f30696g) {
            return 5;
        }
        if (i10 < yu0VarArr[3].f30694c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xu0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        jv0 jv0Var = this.f30413s;
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f30412r, 28, jv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < jv0Var.f25555t1[3].f30694c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) jv0Var.f25555t1[3].d.get((String) jv0Var.f25555t1[3].f30694c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        yu0[] yu0VarArr = this.f30413s.f25555t1;
        if (yu0VarArr[3].f30694c.size() != 0 || yu0VarArr[3].f30696g) {
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
        jv0 jv0Var = this.f30413s;
        yu0[] yu0VarArr = jv0Var.f25555t1;
        int i12 = c1Var.f42963f;
        View view = c1Var.f42960a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) yu0VarArr[3].d.get((String) yu0VarArr[3].f30694c.get(i10));
            int i13 = c1Var.f42963f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.n7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != yu0VarArr[3].f30694c.size() - 1 || !yu0VarArr[3].f30696g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n7Var.f20720y = z10;
                        n7Var.e();
                        n7Var.f20702b0 = messageObject;
                        n7Var.requestLayout();
                        if (jv0Var.C1) {
                            SparseArray[] sparseArrayArr = jv0Var.Z0;
                            if (messageObject.getDialogId() == jv0Var.f25534j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            n7Var.f(z11, !jv0Var.f25514b1);
                            return;
                        }
                        n7Var.f(false, !jv0Var.f25514b1);
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
        jv0 jv0Var = this.f30413s;
        org.telegram.ui.ActionBar.d6 d6Var = jv0Var.F1;
        Context context = this.f30412r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    u00 u00Var = new u00(context, d6Var);
                    u00Var.setIsSingleCell(true);
                    u00Var.f28661w = false;
                    u00Var.setViewType(5);
                    v3Var = u00Var;
                } else {
                    wt0 M = jv0.M(3, jv0Var.f25534j1, context, d6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new s4.c1(M);
                }
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, d6Var);
                n7Var.setDelegate(jv0Var.S1);
                v3Var = n7Var;
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, 28, d6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(v3Var, v3Var, -1, -2);
    }
}
