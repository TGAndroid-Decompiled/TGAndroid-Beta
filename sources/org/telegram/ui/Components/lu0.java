package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class lu0 extends hl0 {
    public final Context f28336r;
    public final xu0 f28337s;

    public lu0(xu0 xu0Var, Context context) {
        this.f28337s = xu0Var;
        this.f28336r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        mu0[] mu0VarArr = this.f28337s.f32749t1;
        int i11 = 1;
        if ((mu0VarArr[3].f28545c.size() == 0 && !mu0VarArr[3].f28548g) || i10 >= mu0VarArr[3].f28545c.size()) {
            return 1;
        }
        mu0 mu0Var = mu0VarArr[3];
        int size = ((ArrayList) mu0Var.d.get(mu0Var.f28545c.get(i10))).size();
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
        mu0[] mu0VarArr = this.f28337s.f32749t1;
        if (mu0VarArr[3].f28545c.size() == 0 && !mu0VarArr[3].f28548g) {
            return 5;
        }
        if (i10 < mu0VarArr[3].f28545c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lu0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        xu0 xu0Var = this.f28337s;
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f28336r, 28, xu0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < xu0Var.f32749t1[3].f28545c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) xu0Var.f32749t1[3].d.get((String) xu0Var.f32749t1[3].f28545c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        mu0[] mu0VarArr = this.f28337s.f32749t1;
        if (mu0VarArr[3].f28545c.size() != 0 || mu0VarArr[3].f28548g) {
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
        xu0 xu0Var = this.f28337s;
        mu0[] mu0VarArr = xu0Var.f32749t1;
        int i12 = c1Var.f45770f;
        View view = c1Var.f45766a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) mu0VarArr[3].d.get((String) mu0VarArr[3].f28545c.get(i10));
            int i13 = c1Var.f45770f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.n7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != mu0VarArr[3].f28545c.size() - 1 || !mu0VarArr[3].f28548g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n7Var.f22393y = z10;
                        n7Var.e();
                        n7Var.f22374b0 = messageObject;
                        n7Var.requestLayout();
                        if (xu0Var.C1) {
                            SparseArray[] sparseArrayArr = xu0Var.Z0;
                            if (messageObject.getDialogId() == xu0Var.f32728j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            n7Var.f(z11, !xu0Var.f32707b1);
                            return;
                        }
                        n7Var.f(false, !xu0Var.f32707b1);
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
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        xu0 xu0Var = this.f28337s;
        org.telegram.ui.ActionBar.f6 f6Var = xu0Var.F1;
        Context context = this.f28336r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    t00 t00Var = new t00(context, f6Var);
                    t00Var.setIsSingleCell(true);
                    t00Var.f30492w = false;
                    t00Var.setViewType(5);
                    u3Var = t00Var;
                } else {
                    kt0 M = xu0.M(3, xu0Var.f32728j1, context, f6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new s4.c1(M);
                }
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, f6Var);
                n7Var.setDelegate(xu0Var.S1);
                u3Var = n7Var;
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, 28, f6Var);
        }
        return com.google.android.gms.internal.vision.e2.l(u3Var, u3Var, -1, -2);
    }
}
