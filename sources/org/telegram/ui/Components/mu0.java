package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class mu0 extends ol0 {
    public final Context f29260r;
    public final yu0 f29261s;

    public mu0(yu0 yu0Var, Context context) {
        this.f29261s = yu0Var;
        this.f29260r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(sl0 sl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        nu0[] nu0VarArr = this.f29261s.f33643q1;
        int i11 = 1;
        if ((nu0VarArr[3].f29582c.size() == 0 && !nu0VarArr[3].f29585g) || i10 >= nu0VarArr[3].f29582c.size()) {
            return 1;
        }
        nu0 nu0Var = nu0VarArr[3];
        int size = ((ArrayList) nu0Var.d.get(nu0Var.f29582c.get(i10))).size();
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
        nu0[] nu0VarArr = this.f29261s.f33643q1;
        if (nu0VarArr[3].f29582c.size() == 0 && !nu0VarArr[3].f29585g) {
            return 5;
        }
        if (i10 < nu0VarArr[3].f29582c.size()) {
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
        yu0 yu0Var = this.f29261s;
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f29260r, 28, yu0Var.C1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < yu0Var.f33643q1[3].f29582c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) yu0Var.f33643q1[3].d.get((String) yu0Var.f33643q1[3].f29582c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, f2.m1 m1Var) {
        nu0[] nu0VarArr = this.f29261s.f33643q1;
        if (nu0VarArr[3].f29582c.size() != 0 || nu0VarArr[3].f29585g) {
            if (i10 != 0 && i11 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, f2.m1 m1Var) {
        boolean z4;
        char c3;
        yu0 yu0Var = this.f29261s;
        nu0[] nu0VarArr = yu0Var.f33643q1;
        int i12 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) nu0VarArr[3].d.get((String) nu0VarArr[3].f29582c.get(i10));
            int i13 = m1Var.f5879f;
            boolean z10 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.l7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != nu0VarArr[3].f29582c.size() - 1 || !nu0VarArr[3].f29585g)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        l7Var.f23134y = z4;
                        l7Var.e();
                        l7Var.V = messageObject;
                        l7Var.requestLayout();
                        if (yu0Var.f33666z1) {
                            SparseArray[] sparseArrayArr = yu0Var.W0;
                            if (messageObject.getDialogId() == yu0Var.f33624g1) {
                                c3 = 0;
                            } else {
                                c3 = 1;
                            }
                            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                                z10 = true;
                            }
                            l7Var.f(z10, !yu0Var.Y0);
                            return;
                        }
                        l7Var.f(false, !yu0Var.Y0);
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
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        yu0 yu0Var = this.f29261s;
        org.telegram.ui.ActionBar.g6 g6Var = yu0Var.C1;
        Context context = this.f29260r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    u00 u00Var = new u00(context, g6Var);
                    u00Var.setIsSingleCell(true);
                    u00Var.f31465w = false;
                    u00Var.setViewType(5);
                    u3Var = u00Var;
                } else {
                    kt0 M = yu0.M(3, yu0Var.f33624g1, context, g6Var);
                    M.setLayoutParams(new f2.x0(-1, -1));
                    return new f2.m1(M);
                }
            } else {
                org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 0, g6Var);
                l7Var.setDelegate(yu0Var.P1);
                u3Var = l7Var;
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, 28, g6Var);
        }
        return org.telegram.ui.yh.o(u3Var, u3Var, -1, -2);
    }
}
