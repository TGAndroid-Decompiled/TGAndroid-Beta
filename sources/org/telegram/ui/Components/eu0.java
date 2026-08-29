package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class eu0 extends fl0 {
    public final Context f28181r;
    public final qu0 f28182s;

    public eu0(qu0 qu0Var, Context context) {
        this.f28182s = qu0Var;
        this.f28181r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        fu0[] fu0VarArr = this.f28182s.f32088p1;
        int i11 = 1;
        if ((fu0VarArr[3].f28536c.size() == 0 && !fu0VarArr[3].f28539g) || i10 >= fu0VarArr[3].f28536c.size()) {
            return 1;
        }
        fu0 fu0Var = fu0VarArr[3];
        int size = ((ArrayList) fu0Var.d.get(fu0Var.f28536c.get(i10))).size();
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
        fu0[] fu0VarArr = this.f28182s.f32088p1;
        if (fu0VarArr[3].f28536c.size() == 0 && !fu0VarArr[3].f28539g) {
            return 5;
        }
        if (i10 < fu0VarArr[3].f28536c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eu0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        qu0 qu0Var = this.f28182s;
        if (view == null) {
            view = new org.telegram.ui.Cells.s3(this.f28181r, 28, qu0Var.B1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < qu0Var.f32088p1[3].f28536c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) qu0Var.f32088p1[3].d.get((String) qu0Var.f32088p1[3].f28536c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, f2.n1 n1Var) {
        fu0[] fu0VarArr = this.f28182s.f32088p1;
        if (fu0VarArr[3].f28536c.size() != 0 || fu0VarArr[3].f28539g) {
            if (i10 != 0 && i11 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, f2.n1 n1Var) {
        boolean z10;
        char c3;
        qu0 qu0Var = this.f28182s;
        fu0[] fu0VarArr = qu0Var.f32088p1;
        int i12 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) fu0VarArr[3].d.get((String) fu0VarArr[3].f28536c.get(i10));
            int i13 = n1Var.f6436f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.j7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != fu0VarArr[3].f28536c.size() - 1 || !fu0VarArr[3].f28539g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        j7Var.f24561y = z10;
                        j7Var.e();
                        j7Var.U = messageObject;
                        j7Var.requestLayout();
                        if (qu0Var.f32111y1) {
                            SparseArray[] sparseArrayArr = qu0Var.V0;
                            if (messageObject.getDialogId() == qu0Var.f32069f1) {
                                c3 = 0;
                            } else {
                                c3 = 1;
                            }
                            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            j7Var.f(z11, !qu0Var.X0);
                            return;
                        }
                        j7Var.f(false, !qu0Var.X0);
                        return;
                    }
                    return;
                }
                return;
            }
            MessageObject messageObject2 = (MessageObject) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.s3) {
                ((org.telegram.ui.Cells.s3) view).setText(LocaleController.formatSectionDate(messageObject2.messageOwner.date));
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s3 s3Var;
        qu0 qu0Var = this.f28182s;
        org.telegram.ui.ActionBar.c6 c6Var = qu0Var.B1;
        Context context = this.f28181r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    p00 p00Var = new p00(context, c6Var);
                    p00Var.setIsSingleCell(true);
                    p00Var.f31529w = false;
                    p00Var.setViewType(5);
                    s3Var = p00Var;
                } else {
                    ct0 M = qu0.M(3, qu0Var.f32069f1, context, c6Var);
                    M.setLayoutParams(new f2.x0(-1, -1));
                    return new f2.n1(M);
                }
            } else {
                org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 0, c6Var);
                j7Var.setDelegate(qu0Var.O1);
                s3Var = j7Var;
            }
        } else {
            s3Var = new org.telegram.ui.Cells.s3(context, 28, c6Var);
        }
        return org.telegram.ui.th.m(s3Var, s3Var, -1, -2);
    }
}
