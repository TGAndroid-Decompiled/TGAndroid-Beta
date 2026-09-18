package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class nu0 extends il0 {
    public final Context f26545r;
    public final zu0 f26546s;

    public nu0(zu0 zu0Var, Context context) {
        this.f26546s = zu0Var;
        this.f26545r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(ml0 ml0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        ou0[] ou0VarArr = this.f26546s.f30655t1;
        int i11 = 1;
        if ((ou0VarArr[3].f26854c.size() == 0 && !ou0VarArr[3].f26856g) || i10 >= ou0VarArr[3].f26854c.size()) {
            return 1;
        }
        ou0 ou0Var = ou0VarArr[3];
        int size = ((ArrayList) ou0Var.d.get(ou0Var.f26854c.get(i10))).size();
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
        ou0[] ou0VarArr = this.f26546s.f30655t1;
        if (ou0VarArr[3].f26854c.size() == 0 && !ou0VarArr[3].f26856g) {
            return 5;
        }
        if (i10 < ou0VarArr[3].f26854c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nu0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        zu0 zu0Var = this.f26546s;
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f26545r, 28, zu0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < zu0Var.f30655t1[3].f26854c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) zu0Var.f30655t1[3].d.get((String) zu0Var.f30655t1[3].f26854c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        ou0[] ou0VarArr = this.f26546s.f30655t1;
        if (ou0VarArr[3].f26854c.size() != 0 || ou0VarArr[3].f26856g) {
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
        zu0 zu0Var = this.f26546s;
        ou0[] ou0VarArr = zu0Var.f30655t1;
        int i12 = c1Var.f42705f;
        View view = c1Var.f42702a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) ou0VarArr[3].d.get((String) ou0VarArr[3].f26854c.get(i10));
            int i13 = c1Var.f42705f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.n7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != ou0VarArr[3].f26854c.size() - 1 || !ou0VarArr[3].f26856g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n7Var.f20512y = z10;
                        n7Var.e();
                        n7Var.f20494b0 = messageObject;
                        n7Var.requestLayout();
                        if (zu0Var.C1) {
                            SparseArray[] sparseArrayArr = zu0Var.Z0;
                            if (messageObject.getDialogId() == zu0Var.f30634j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            n7Var.f(z11, !zu0Var.f30614b1);
                            return;
                        }
                        n7Var.f(false, !zu0Var.f30614b1);
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
        zu0 zu0Var = this.f26546s;
        org.telegram.ui.ActionBar.f6 f6Var = zu0Var.F1;
        Context context = this.f26545r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    t00 t00Var = new t00(context, f6Var);
                    t00Var.setIsSingleCell(true);
                    t00Var.f27979w = false;
                    t00Var.setViewType(5);
                    u3Var = t00Var;
                } else {
                    mt0 M = zu0.M(3, zu0Var.f30634j1, context, f6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new s4.c1(M);
                }
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, f6Var);
                n7Var.setDelegate(zu0Var.S1);
                u3Var = n7Var;
            }
        } else {
            u3Var = new org.telegram.ui.Cells.u3(context, 28, f6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(u3Var, u3Var, -1, -2);
    }
}
