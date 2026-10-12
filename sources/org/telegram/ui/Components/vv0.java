package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class vv0 extends sm0 {
    public final Context f32179r;
    public final hw0 f32180s;

    public vv0(hw0 hw0Var, Context context) {
        this.f32180s = hw0Var;
        this.f32179r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(wm0 wm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        wv0[] wv0VarArr = this.f32180s.f26953t1;
        int i11 = 1;
        if ((wv0VarArr[3].f32554c.size() == 0 && !wv0VarArr[3].f32557g) || i10 >= wv0VarArr[3].f32554c.size()) {
            return 1;
        }
        wv0 wv0Var = wv0VarArr[3];
        int size = ((ArrayList) wv0Var.d.get(wv0Var.f32554c.get(i10))).size();
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
        wv0[] wv0VarArr = this.f32180s.f26953t1;
        if (wv0VarArr[3].f32554c.size() == 0 && !wv0VarArr[3].f32557g) {
            return 5;
        }
        if (i10 < wv0VarArr[3].f32554c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vv0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        hw0 hw0Var = this.f32180s;
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f32179r, 28, hw0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < hw0Var.f26953t1[3].f32554c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) hw0Var.f26953t1[3].d.get((String) hw0Var.f26953t1[3].f32554c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.d1 d1Var) {
        wv0[] wv0VarArr = this.f32180s.f26953t1;
        if (wv0VarArr[3].f32554c.size() != 0 || wv0VarArr[3].f32557g) {
            if (i10 != 0 && i11 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.d1 d1Var) {
        boolean z10;
        char c10;
        hw0 hw0Var = this.f32180s;
        wv0[] wv0VarArr = hw0Var.f26953t1;
        int i12 = d1Var.f47901f;
        View view = d1Var.f47897a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) wv0VarArr[3].d.get((String) wv0VarArr[3].f32554c.get(i10));
            int i13 = d1Var.f47901f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.n7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != wv0VarArr[3].f32554c.size() - 1 || !wv0VarArr[3].f32557g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n7Var.f22310y = z10;
                        n7Var.e();
                        n7Var.f22291b0 = messageObject;
                        n7Var.requestLayout();
                        if (hw0Var.C1) {
                            SparseArray[] sparseArrayArr = hw0Var.Z0;
                            if (messageObject.getDialogId() == hw0Var.f26932j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            n7Var.f(z11, !hw0Var.f26911b1);
                            return;
                        }
                        n7Var.f(false, !hw0Var.f26911b1);
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
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v3 v3Var;
        hw0 hw0Var = this.f32180s;
        org.telegram.ui.ActionBar.c6 c6Var = hw0Var.F1;
        Context context = this.f32179r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    m10 m10Var = new m10(context, c6Var);
                    m10Var.setIsSingleCell(true);
                    m10Var.f28350w = false;
                    m10Var.setViewType(5);
                    v3Var = m10Var;
                } else {
                    uu0 M = hw0.M(3, hw0Var.f26932j1, context, c6Var);
                    M.setLayoutParams(new s4.q0(-1, -1));
                    return new s4.d1(M);
                }
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, c6Var);
                n7Var.setDelegate(hw0Var.S1);
                v3Var = n7Var;
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, 28, c6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(v3Var, v3Var, -1, -2);
    }
}
