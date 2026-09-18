package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class yu0 extends sl0 {
    public final Context f30670r;
    public final kv0 f30671s;

    public yu0(kv0 kv0Var, Context context) {
        this.f30671s = kv0Var;
        this.f30670r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(wl0 wl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        zu0[] zu0VarArr = this.f30671s.f25844t1;
        int i11 = 1;
        if ((zu0VarArr[3].f30879c.size() == 0 && !zu0VarArr[3].f30881g) || i10 >= zu0VarArr[3].f30879c.size()) {
            return 1;
        }
        zu0 zu0Var = zu0VarArr[3];
        int size = ((ArrayList) zu0Var.d.get(zu0Var.f30879c.get(i10))).size();
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
        zu0[] zu0VarArr = this.f30671s.f25844t1;
        if (zu0VarArr[3].f30879c.size() == 0 && !zu0VarArr[3].f30881g) {
            return 5;
        }
        if (i10 < zu0VarArr[3].f30879c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yu0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        kv0 kv0Var = this.f30671s;
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f30670r, 28, kv0Var.F1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < kv0Var.f25844t1[3].f30879c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) kv0Var.f25844t1[3].d.get((String) kv0Var.f25844t1[3].f30879c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        zu0[] zu0VarArr = this.f30671s.f25844t1;
        if (zu0VarArr[3].f30879c.size() != 0 || zu0VarArr[3].f30881g) {
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
        kv0 kv0Var = this.f30671s;
        zu0[] zu0VarArr = kv0Var.f25844t1;
        int i12 = c1Var.f42932f;
        View view = c1Var.f42929a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) zu0VarArr[3].d.get((String) zu0VarArr[3].f30879c.get(i10));
            int i13 = c1Var.f42932f;
            boolean z11 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.n7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != zu0VarArr[3].f30879c.size() - 1 || !zu0VarArr[3].f30881g)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n7Var.f20684y = z10;
                        n7Var.e();
                        n7Var.f20666b0 = messageObject;
                        n7Var.requestLayout();
                        if (kv0Var.C1) {
                            SparseArray[] sparseArrayArr = kv0Var.Z0;
                            if (messageObject.getDialogId() == kv0Var.f25823j1) {
                                c10 = 0;
                            } else {
                                c10 = 1;
                            }
                            if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                                z11 = true;
                            }
                            n7Var.f(z11, !kv0Var.f25803b1);
                            return;
                        }
                        n7Var.f(false, !kv0Var.f25803b1);
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
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v3 v3Var;
        kv0 kv0Var = this.f30671s;
        org.telegram.ui.ActionBar.e6 e6Var = kv0Var.F1;
        Context context = this.f30670r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    t00 t00Var = new t00(context, e6Var);
                    t00Var.setIsSingleCell(true);
                    t00Var.f28272w = false;
                    t00Var.setViewType(5);
                    v3Var = t00Var;
                } else {
                    xt0 M = kv0.M(3, kv0Var.f25823j1, context, e6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new s4.c1(M);
                }
            } else {
                org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, 0, e6Var);
                n7Var.setDelegate(kv0Var.S1);
                v3Var = n7Var;
            }
        } else {
            v3Var = new org.telegram.ui.Cells.v3(context, 28, e6Var);
        }
        return com.google.android.gms.internal.vision.e2.k(v3Var, v3Var, -1, -2);
    }
}
