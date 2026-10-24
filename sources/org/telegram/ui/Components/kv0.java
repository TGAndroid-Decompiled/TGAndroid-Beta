package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class kv0 extends hm0 {
    public final Context f28088r;
    public final wv0 f28089s;

    public kv0(wv0 wv0Var, Context context) {
        this.f28089s = wv0Var;
        this.f28088r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(lm0 lm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        lv0[] lv0VarArr = this.f28089s.f32406t1;
        int i11 = 1;
        if ((lv0VarArr[3].f28441c.size() == 0 && !lv0VarArr[3].f28443g) || i10 >= lv0VarArr[3].f28441c.size()) {
            return 1;
        }
        lv0 lv0Var = lv0VarArr[3];
        int size = ((ArrayList) lv0Var.d.get(lv0Var.f28441c.get(i10))).size();
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
        lv0[] lv0VarArr = this.f28089s.f32406t1;
        if (lv0VarArr[3].f28441c.size() == 0 && !lv0VarArr[3].f28443g) {
            return 5;
        }
        if (i10 < lv0VarArr[3].f28441c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kv0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        wv0 wv0Var = this.f28089s;
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f28088r, 28, wv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < wv0Var.f32406t1[3].f28441c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) wv0Var.f32406t1[3].d.get((String) wv0Var.f32406t1[3].f28441c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        lv0[] lv0VarArr = this.f28089s.f32406t1;
        if (lv0VarArr[3].f28441c.size() != 0 || lv0VarArr[3].f28443g) {
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
        wv0 wv0Var = this.f28089s;
        lv0[] lv0VarArr = wv0Var.f32406t1;
        int i12 = b1Var.f46345f;
        View view = b1Var.f46342a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) lv0VarArr[3].d.get((String) lv0VarArr[3].f28441c.get(i10));
            int i13 = b1Var.f46345f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.n7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != lv0VarArr[3].f28441c.size() - 1 || !lv0VarArr[3].f28443g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n7Var.f22816y = z10;
                        n7Var.e();
                        n7Var.f22798b0 = messageObject;
                        n7Var.requestLayout();
                        if (wv0Var.C1) {
                            SparseArray[] sparseArrayArr = wv0Var.Z0;
                            if (messageObject.getDialogId() == wv0Var.f32385j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            n7Var.f(z11, !wv0Var.f32362b1);
                            return;
                        }
                        n7Var.f(false, !wv0Var.f32362b1);
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
        wv0 wv0Var = this.f28089s;
        org.telegram.ui.ActionBar.g6 g6Var = wv0Var.F1;
        Context context = this.f28088r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    z00 z00Var = new z00(context, g6Var);
                    z00Var.setIsSingleCell(true);
                    z00Var.f33104w = false;
                    z00Var.setViewType(5);
                    u3Var = z00Var;
                } else {
                    ju0 N = wv0.N(3, wv0Var.f32385j1, context, g6Var);
                    N.setLayoutParams(new s4.o0(-1, -1));
                    return new s4.b1(N);
                }
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, g6Var);
                n7Var.setDelegate(wv0Var.T1);
                u3Var = n7Var;
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, 28, g6Var);
        }
        return com.google.android.gms.internal.play_billing.k3.l(u3Var, u3Var, -1, -2);
    }
}
