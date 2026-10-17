package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class gv0 extends em0 {
    public final Context f26676r;
    public final sv0 f26677s;

    public gv0(sv0 sv0Var, Context context) {
        this.f26677s = sv0Var;
        this.f26676r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(im0 im0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        hv0[] hv0VarArr = this.f26677s.f30384t1;
        int i11 = 1;
        if ((hv0VarArr[3].f26944c.size() == 0 && !hv0VarArr[3].f26946g) || i10 >= hv0VarArr[3].f26944c.size()) {
            return 1;
        }
        hv0 hv0Var = hv0VarArr[3];
        int size = ((ArrayList) hv0Var.d.get(hv0Var.f26944c.get(i10))).size();
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
        hv0[] hv0VarArr = this.f26677s.f30384t1;
        if (hv0VarArr[3].f26944c.size() == 0 && !hv0VarArr[3].f26946g) {
            return 5;
        }
        if (i10 < hv0VarArr[3].f26944c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gv0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        sv0 sv0Var = this.f26677s;
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f26676r, 28, sv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < sv0Var.f30384t1[3].f26944c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) sv0Var.f30384t1[3].d.get((String) sv0Var.f30384t1[3].f26944c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        hv0[] hv0VarArr = this.f26677s.f30384t1;
        if (hv0VarArr[3].f26944c.size() != 0 || hv0VarArr[3].f26946g) {
            if (i10 != 0 && i11 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.b1 b1Var) {
        boolean z10;
        char c10;
        sv0 sv0Var = this.f26677s;
        hv0[] hv0VarArr = sv0Var.f30384t1;
        int i12 = b1Var.f45941f;
        View view = b1Var.f45938a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) hv0VarArr[3].d.get((String) hv0VarArr[3].f26944c.get(i10));
            int i13 = b1Var.f45941f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.m7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != hv0VarArr[3].f26944c.size() - 1 || !hv0VarArr[3].f26946g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        m7Var.f22607y = z10;
                        m7Var.e();
                        m7Var.f22589b0 = messageObject;
                        m7Var.requestLayout();
                        if (sv0Var.C1) {
                            SparseArray[] sparseArrayArr = sv0Var.Z0;
                            if (messageObject.getDialogId() == sv0Var.f30363j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            m7Var.f(z11, !sv0Var.f30343b1);
                            return;
                        }
                        m7Var.f(false, !sv0Var.f30343b1);
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
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u3 u3Var;
        sv0 sv0Var = this.f26677s;
        org.telegram.ui.ActionBar.d6 d6Var = sv0Var.F1;
        Context context = this.f26676r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    b10 b10Var = new b10(context, d6Var);
                    b10Var.setIsSingleCell(true);
                    b10Var.f24767w = false;
                    b10Var.setViewType(5);
                    u3Var = b10Var;
                } else {
                    fu0 M = sv0.M(3, sv0Var.f30363j1, context, d6Var);
                    M.setLayoutParams(new s4.o0(-1, -1));
                    return new s4.b1(M);
                }
            } else {
                org.telegram.ui.Cells.m7 m7Var = new org.telegram.ui.Cells.m7(context, 0, d6Var);
                m7Var.setDelegate(sv0Var.S1);
                u3Var = m7Var;
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, 28, d6Var);
        }
        return com.google.android.gms.internal.cast.a6.l(u3Var, u3Var, -1, -2);
    }
}
