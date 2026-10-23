package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class iv0 extends fm0 {
    public final Context f27344r;
    public final uv0 f27345s;

    public iv0(uv0 uv0Var, Context context) {
        this.f27345s = uv0Var;
        this.f27344r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(jm0 jm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        jv0[] jv0VarArr = this.f27345s.f31071t1;
        int i11 = 1;
        if ((jv0VarArr[3].f27647c.size() == 0 && !jv0VarArr[3].f27649g) || i10 >= jv0VarArr[3].f27647c.size()) {
            return 1;
        }
        jv0 jv0Var = jv0VarArr[3];
        int size = ((ArrayList) jv0Var.d.get(jv0Var.f27647c.get(i10))).size();
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
        jv0[] jv0VarArr = this.f27345s.f31071t1;
        if (jv0VarArr[3].f27647c.size() == 0 && !jv0VarArr[3].f27649g) {
            return 5;
        }
        if (i10 < jv0VarArr[3].f27647c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iv0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        uv0 uv0Var = this.f27345s;
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f27344r, 28, uv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < uv0Var.f31071t1[3].f27647c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) uv0Var.f31071t1[3].d.get((String) uv0Var.f31071t1[3].f27647c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        jv0[] jv0VarArr = this.f27345s.f31071t1;
        if (jv0VarArr[3].f27647c.size() != 0 || jv0VarArr[3].f27649g) {
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
        uv0 uv0Var = this.f27345s;
        jv0[] jv0VarArr = uv0Var.f31071t1;
        int i12 = b1Var.f45924f;
        View view = b1Var.f45921a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) jv0VarArr[3].d.get((String) jv0VarArr[3].f27647c.get(i10));
            int i13 = b1Var.f45924f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.m7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != jv0VarArr[3].f27647c.size() - 1 || !jv0VarArr[3].f27649g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        m7Var.f22612y = z10;
                        m7Var.e();
                        m7Var.f22594b0 = messageObject;
                        m7Var.requestLayout();
                        if (uv0Var.C1) {
                            SparseArray[] sparseArrayArr = uv0Var.Z0;
                            if (messageObject.getDialogId() == uv0Var.f31050j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            m7Var.f(z11, !uv0Var.f31030b1);
                            return;
                        }
                        m7Var.f(false, !uv0Var.f31030b1);
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
        uv0 uv0Var = this.f27345s;
        org.telegram.ui.ActionBar.d6 d6Var = uv0Var.F1;
        Context context = this.f27344r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    b10 b10Var = new b10(context, d6Var);
                    b10Var.setIsSingleCell(true);
                    b10Var.f24778w = false;
                    b10Var.setViewType(5);
                    u3Var = b10Var;
                } else {
                    hu0 M = uv0.M(3, uv0Var.f31050j1, context, d6Var);
                    M.setLayoutParams(new s4.o0(-1, -1));
                    return new s4.b1(M);
                }
            } else {
                org.telegram.ui.Cells.m7 m7Var = new org.telegram.ui.Cells.m7(context, 0, d6Var);
                m7Var.setDelegate(uv0Var.S1);
                u3Var = m7Var;
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, 28, d6Var);
        }
        return com.google.android.gms.internal.play_billing.k3.l(u3Var, u3Var, -1, -2);
    }
}
