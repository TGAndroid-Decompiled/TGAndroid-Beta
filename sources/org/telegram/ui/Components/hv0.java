package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class hv0 extends em0 {
    public final Context f26942r;
    public final tv0 f26943s;

    public hv0(tv0 tv0Var, Context context) {
        this.f26943s = tv0Var;
        this.f26942r = context;
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
        iv0[] iv0VarArr = this.f26943s.f30730t1;
        int i11 = 1;
        if ((iv0VarArr[3].f27365c.size() == 0 && !iv0VarArr[3].f27367g) || i10 >= iv0VarArr[3].f27365c.size()) {
            return 1;
        }
        iv0 iv0Var = iv0VarArr[3];
        int size = ((ArrayList) iv0Var.d.get(iv0Var.f27365c.get(i10))).size();
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
        iv0[] iv0VarArr = this.f26943s.f30730t1;
        if (iv0VarArr[3].f27365c.size() == 0 && !iv0VarArr[3].f27367g) {
            return 5;
        }
        if (i10 < iv0VarArr[3].f27365c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hv0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        tv0 tv0Var = this.f26943s;
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f26942r, 28, tv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < tv0Var.f30730t1[3].f27365c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) tv0Var.f30730t1[3].d.get((String) tv0Var.f30730t1[3].f27365c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        iv0[] iv0VarArr = this.f26943s.f30730t1;
        if (iv0VarArr[3].f27365c.size() != 0 || iv0VarArr[3].f27367g) {
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
        tv0 tv0Var = this.f26943s;
        iv0[] iv0VarArr = tv0Var.f30730t1;
        int i12 = b1Var.f45913f;
        View view = b1Var.f45910a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) iv0VarArr[3].d.get((String) iv0VarArr[3].f27365c.get(i10));
            int i13 = b1Var.f45913f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.m7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != iv0VarArr[3].f27365c.size() - 1 || !iv0VarArr[3].f27367g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        m7Var.f22607y = z10;
                        m7Var.e();
                        m7Var.f22589b0 = messageObject;
                        m7Var.requestLayout();
                        if (tv0Var.C1) {
                            SparseArray[] sparseArrayArr = tv0Var.Z0;
                            if (messageObject.getDialogId() == tv0Var.f30709j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            m7Var.f(z11, !tv0Var.f30689b1);
                            return;
                        }
                        m7Var.f(false, !tv0Var.f30689b1);
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
        tv0 tv0Var = this.f26943s;
        org.telegram.ui.ActionBar.d6 d6Var = tv0Var.F1;
        Context context = this.f26942r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    b10 b10Var = new b10(context, d6Var);
                    b10Var.setIsSingleCell(true);
                    b10Var.f24772w = false;
                    b10Var.setViewType(5);
                    u3Var = b10Var;
                } else {
                    gu0 M = tv0.M(3, tv0Var.f30709j1, context, d6Var);
                    M.setLayoutParams(new s4.o0(-1, -1));
                    return new s4.b1(M);
                }
            } else {
                org.telegram.ui.Cells.m7 m7Var = new org.telegram.ui.Cells.m7(context, 0, d6Var);
                m7Var.setDelegate(tv0Var.S1);
                u3Var = m7Var;
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, 28, d6Var);
        }
        return com.google.android.gms.internal.play_billing.k3.l(u3Var, u3Var, -1, -2);
    }
}
