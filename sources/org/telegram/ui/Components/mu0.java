package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class mu0 extends hl0 {
    public final Context f26251r;
    public final yu0 f26252s;

    public mu0(yu0 yu0Var, Context context) {
        this.f26252s = yu0Var;
        this.f26251r = context;
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
        nu0[] nu0VarArr = this.f26252s.f30388t1;
        int i11 = 1;
        if ((nu0VarArr[3].f26578c.size() == 0 && !nu0VarArr[3].f26580g) || i10 >= nu0VarArr[3].f26578c.size()) {
            return 1;
        }
        nu0 nu0Var = nu0VarArr[3];
        int size = ((ArrayList) nu0Var.d.get(nu0Var.f26578c.get(i10))).size();
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
        nu0[] nu0VarArr = this.f26252s.f30388t1;
        if (nu0VarArr[3].f26578c.size() == 0 && !nu0VarArr[3].f26580g) {
            return 5;
        }
        if (i10 < nu0VarArr[3].f26578c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mu0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        yu0 yu0Var = this.f26252s;
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f26251r, 28, yu0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < yu0Var.f30388t1[3].f26578c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) yu0Var.f30388t1[3].d.get((String) yu0Var.f30388t1[3].f26578c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        nu0[] nu0VarArr = this.f26252s.f30388t1;
        if (nu0VarArr[3].f26578c.size() != 0 || nu0VarArr[3].f26580g) {
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
        yu0 yu0Var = this.f26252s;
        nu0[] nu0VarArr = yu0Var.f30388t1;
        int i12 = c1Var.f42678f;
        View view = c1Var.f42675a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) nu0VarArr[3].d.get((String) nu0VarArr[3].f26578c.get(i10));
            int i13 = c1Var.f42678f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.n7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != nu0VarArr[3].f26578c.size() - 1 || !nu0VarArr[3].f26580g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n7Var.f20501y = z10;
                        n7Var.e();
                        n7Var.f20483b0 = messageObject;
                        n7Var.requestLayout();
                        if (yu0Var.C1) {
                            SparseArray[] sparseArrayArr = yu0Var.Z0;
                            if (messageObject.getDialogId() == yu0Var.f30367j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            n7Var.f(z11, !yu0Var.f30347b1);
                            return;
                        }
                        n7Var.f(false, !yu0Var.f30347b1);
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
        yu0 yu0Var = this.f26252s;
        org.telegram.ui.ActionBar.e6 e6Var = yu0Var.F1;
        Context context = this.f26251r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    t00 t00Var = new t00(context, e6Var);
                    t00Var.setIsSingleCell(true);
                    t00Var.f28018w = false;
                    t00Var.setViewType(5);
                    u3Var = t00Var;
                } else {
                    lt0 M = yu0.M(3, yu0Var.f30367j1, context, e6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new s4.c1(M);
                }
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, e6Var);
                n7Var.setDelegate(yu0Var.S1);
                u3Var = n7Var;
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, 28, e6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(u3Var, u3Var, -1, -2);
    }
}
