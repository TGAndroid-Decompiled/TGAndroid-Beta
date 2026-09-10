package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class wu0 extends rl0 {
    public final Context f28839r;
    public final iv0 f28840s;

    public wu0(iv0 iv0Var, Context context) {
        this.f28840s = iv0Var;
        this.f28839r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        xu0[] xu0VarArr = this.f28840s.f24127t1;
        int i11 = 1;
        if ((xu0VarArr[3].f29158c.size() == 0 && !xu0VarArr[3].f29160g) || i10 >= xu0VarArr[3].f29158c.size()) {
            return 1;
        }
        xu0 xu0Var = xu0VarArr[3];
        int size = ((ArrayList) xu0Var.d.get(xu0Var.f29158c.get(i10))).size();
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
        xu0[] xu0VarArr = this.f28840s.f24127t1;
        if (xu0VarArr[3].f29158c.size() == 0 && !xu0VarArr[3].f29160g) {
            return 5;
        }
        if (i10 < xu0VarArr[3].f29158c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wu0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        iv0 iv0Var = this.f28840s;
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f28839r, 28, iv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < iv0Var.f24127t1[3].f29158c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) iv0Var.f24127t1[3].d.get((String) iv0Var.f24127t1[3].f29158c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        xu0[] xu0VarArr = this.f28840s.f24127t1;
        if (xu0VarArr[3].f29158c.size() != 0 || xu0VarArr[3].f29160g) {
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
        iv0 iv0Var = this.f28840s;
        xu0[] xu0VarArr = iv0Var.f24127t1;
        int i12 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) xu0VarArr[3].d.get((String) xu0VarArr[3].f29158c.get(i10));
            int i13 = c1Var.f41613f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.o7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != xu0VarArr[3].f29158c.size() - 1 || !xu0VarArr[3].f29160g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        o7Var.f19660y = z10;
                        o7Var.e();
                        o7Var.f19642b0 = messageObject;
                        o7Var.requestLayout();
                        if (iv0Var.C1) {
                            SparseArray[] sparseArrayArr = iv0Var.Z0;
                            if (messageObject.getDialogId() == iv0Var.f24106j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            o7Var.f(z11, !iv0Var.f24086b1);
                            return;
                        }
                        o7Var.f(false, !iv0Var.f24086b1);
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
        iv0 iv0Var = this.f28840s;
        org.telegram.ui.ActionBar.f6 f6Var = iv0Var.F1;
        Context context = this.f28839r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    a10 a10Var = new a10(context, f6Var);
                    a10Var.setIsSingleCell(true);
                    a10Var.f21345w = false;
                    a10Var.setViewType(5);
                    u3Var = a10Var;
                } else {
                    ut0 M = iv0.M(3, iv0Var.f24106j1, context, f6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new s4.c1(M);
                }
            } else {
                org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 0, f6Var);
                o7Var.setDelegate(iv0Var.S1);
                u3Var = o7Var;
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, 28, f6Var);
        }
        return com.google.android.gms.internal.vision.e2.j(u3Var, u3Var, -1, -2);
    }
}
