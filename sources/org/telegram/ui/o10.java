package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class o10 extends org.telegram.ui.Components.tl0 {
    public final Context f36029r;
    public final int f36030s;
    public final t10 v;

    public o10(t10 t10Var, Context context, int i10) {
        this.v = t10Var;
        this.f36029r = context;
        this.f36030s = i10;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.xl0 xl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        t10 t10Var = this.v;
        int i11 = 1;
        if (i10 >= t10Var.f37934n.size()) {
            return 1;
        }
        int size = ((ArrayList) t10Var.f37939r.get(t10Var.f37934n.get(i10))).size();
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
        if (i10 >= this.v.f37934n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.f36030s;
        if (i12 != 2 && i12 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        t10 t10Var = this.v;
        int i10 = 0;
        if (t10Var.f37934n.isEmpty()) {
            return 0;
        }
        int size = t10Var.f37934n.size();
        if (!t10Var.f37934n.isEmpty() && !t10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f36029r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        t10 t10Var = this.v;
        if (i10 < t10Var.f37934n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) t10Var.f37939r.get((String) t10Var.f37934n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 != 0 && i11 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        boolean z10;
        t10 t10Var = this.v;
        ArrayList arrayList = t10Var.f37934n;
        int i12 = c1Var.f42962f;
        View view = c1Var.f42959a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) t10Var.f37939r.get((String) arrayList.get(i10));
            int i13 = c1Var.f42962f;
            boolean z11 = false;
            if (i13 != 0) {
                boolean z12 = true;
                if (i13 != 1) {
                    if (i13 == 3) {
                        if (i10 != 0) {
                            i11--;
                        }
                        org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                        MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                        if (j7Var.getMessage() != null && j7Var.getMessage().getId() == messageObject.getId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && t10Var.M)) {
                            z11 = true;
                        }
                        j7Var.f(messageObject, z11);
                        j7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.ok(this, j7Var, messageObject, z10, 3));
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
                    z11 = true;
                }
                if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !t10Var.M)) {
                    z12 = false;
                }
                k7Var.c(messageObject2, z12);
                k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.ok(this, k7Var, messageObject2, z11, 2));
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f36029r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    frameLayout2 = new n10(this, context);
                    return com.google.android.gms.internal.vision.e2.k(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(context, null);
                int i11 = this.f36030s;
                if (i11 != 2 && i11 != 4) {
                    v00Var.setViewType(3);
                } else {
                    v00Var.setViewType(4);
                }
                v00Var.setIsSingleCell(true);
                frameLayout = v00Var;
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
