package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class st0 extends sk0 {
    public final Context f32552r;
    public final eu0 f32553s;

    public st0(eu0 eu0Var, Context context) {
        this.f32553s = eu0Var;
        this.f32552r = context;
    }

    @Override
    public final String F(int i9) {
        return null;
    }

    @Override
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i9) {
        tt0[] tt0VarArr = this.f32553s.f28155p1;
        int i10 = 1;
        if ((tt0VarArr[3].f32790c.size() == 0 && !tt0VarArr[3].f32793g) || i9 >= tt0VarArr[3].f32790c.size()) {
            return 1;
        }
        tt0 tt0Var = tt0VarArr[3];
        int size = ((ArrayList) tt0Var.d.get(tt0Var.f32790c.get(i9))).size();
        if (i9 == 0) {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final Object O(int i9, int i10) {
        return null;
    }

    @Override
    public final int P(int i9, int i10) {
        tt0[] tt0VarArr = this.f32553s.f28155p1;
        if (tt0VarArr[3].f32790c.size() == 0 && !tt0VarArr[3].f32793g) {
            return 5;
        }
        if (i9 < tt0VarArr[3].f32790c.size()) {
            if (i9 != 0 && i10 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.st0.R():int");
    }

    @Override
    public final View T(int i9, View view) {
        eu0 eu0Var = this.f32553s;
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f32552r, 28, eu0Var.B1);
        }
        if (i9 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i9 < eu0Var.f28155p1[3].f32790c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) eu0Var.f28155p1[3].d.get((String) eu0Var.f28155p1[3].f32790c.get(i9))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        tt0[] tt0VarArr = this.f32553s.f28155p1;
        if (tt0VarArr[3].f32790c.size() != 0 || tt0VarArr[3].f32793g) {
            if (i9 != 0 && i10 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i9, int i10, f2.q1 q1Var) {
        boolean z10;
        char c10;
        eu0 eu0Var = this.f32553s;
        tt0[] tt0VarArr = eu0Var.f28155p1;
        int i11 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i11 != 6 && i11 != 5) {
            ArrayList arrayList = (ArrayList) tt0VarArr[3].d.get((String) tt0VarArr[3].f32790c.get(i9));
            int i12 = q1Var.f5505f;
            boolean z11 = false;
            if (i12 != 3) {
                if (i12 == 4) {
                    if (i9 != 0) {
                        i10--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.l7) && i10 >= 0 && i10 < arrayList.size()) {
                        org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i10);
                        if (i10 == arrayList.size() - 1 && (i9 != tt0VarArr[3].f32790c.size() - 1 || !tt0VarArr[3].f32793g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        l7Var.f24671y = z10;
                        l7Var.e();
                        l7Var.U = messageObject;
                        l7Var.requestLayout();
                        if (eu0Var.f28178y1) {
                            SparseArray[] sparseArrayArr = eu0Var.V0;
                            if (messageObject.getDialogId() == eu0Var.f28136f1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            l7Var.f(z11, !eu0Var.X0);
                            return;
                        }
                        l7Var.f(false, !eu0Var.X0);
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
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.v3 v3Var;
        eu0 eu0Var = this.f32553s;
        org.telegram.ui.ActionBar.b6 b6Var = eu0Var.B1;
        Context context = this.f32552r;
        if (i9 != 3) {
            if (i9 != 4) {
                if (i9 != 5) {
                    e00 e00Var = new e00(context, b6Var);
                    e00Var.setIsSingleCell(true);
                    e00Var.f27885w = false;
                    e00Var.setViewType(5);
                    v3Var = e00Var;
                } else {
                    rs0 M = eu0.M(3, eu0Var.f28136f1, context, b6Var);
                    M.setLayoutParams(new f2.a1(-1, -1));
                    return new f2.q1(M);
                }
            } else {
                org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 0, b6Var);
                l7Var.setDelegate(eu0Var.O1);
                v3Var = l7Var;
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, 28, b6Var);
        }
        return j3.r0.s(v3Var, v3Var, -1, -2);
    }
}
