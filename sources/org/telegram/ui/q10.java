package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class q10 extends org.telegram.ui.Components.nm0 {
    public final Context f41052r;
    public final int f41053s;
    public final v10 v;

    public q10(v10 v10Var, Context context, int i10) {
        this.v = v10Var;
        this.f41052r = context;
        this.f41053s = i10;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.rm0 rm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        v10 v10Var = this.v;
        int i11 = 1;
        if (i10 >= v10Var.f42879n.size()) {
            return 1;
        }
        int size = ((ArrayList) v10Var.f42884r.get(v10Var.f42879n.get(i10))).size();
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
        if (i10 >= this.v.f42879n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.f41053s;
        if (i12 != 2 && i12 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        v10 v10Var = this.v;
        int i10 = 0;
        if (v10Var.f42879n.isEmpty()) {
            return 0;
        }
        int size = v10Var.f42879n.size();
        if (!v10Var.f42879n.isEmpty() && !v10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f41052r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        v10 v10Var = this.v;
        if (i10 < v10Var.f42879n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) v10Var.f42884r.get((String) v10Var.f42879n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.d1 d1Var) {
        if (i10 != 0 && i11 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i10, int i11, s4.d1 d1Var) {
        boolean z10;
        boolean z11;
        v10 v10Var = this.v;
        ArrayList arrayList = v10Var.f42879n;
        int i12 = d1Var.f47786f;
        View view = d1Var.f47782a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) v10Var.f42884r.get((String) arrayList.get(i10));
            int i13 = d1Var.f47786f;
            boolean z12 = false;
            if (i13 != 0) {
                boolean z13 = true;
                if (i13 != 1) {
                    if (i13 == 3) {
                        if (i10 != 0) {
                            i11--;
                        }
                        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                        MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                        if (j7Var.getMessage() != null && j7Var.getMessage().getId() == messageObject.getId()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && v10Var.M)) {
                            z12 = true;
                        }
                        j7Var.f(messageObject, z12);
                        j7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.qk(this, j7Var, messageObject, z11, 3));
                        return;
                    }
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
                if (k7Var.getMessage() != null && k7Var.getMessage().getId() == messageObject2.getId()) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !v10Var.M)) {
                    z13 = z10;
                }
                k7Var.c(messageObject2, z13);
                k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.qk(this, k7Var, messageObject2, z12, 2));
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f41052r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    frameLayout2 = new p10(this, context);
                    return com.google.android.gms.internal.vision.e2.k(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
                int i11 = this.f41053s;
                if (i11 != 2 && i11 != 4) {
                    k10Var.setViewType(3);
                } else {
                    k10Var.setViewType(4);
                }
                k10Var.setIsSingleCell(true);
                frameLayout = k10Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.k7(context, 2, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.v3(context, null);
        }
        frameLayout2 = frameLayout;
        return com.google.android.gms.internal.vision.e2.k(frameLayout2, frameLayout2, -1, -2);
    }
}
