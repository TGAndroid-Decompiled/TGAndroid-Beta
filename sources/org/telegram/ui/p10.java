package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class p10 extends org.telegram.ui.Components.il0 {
    public final Context f35996r;
    public final int f35997s;
    public final u10 v;

    public p10(u10 u10Var, Context context, int i10) {
        this.v = u10Var;
        this.f35996r = context;
        this.f35997s = i10;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.ml0 ml0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        u10 u10Var = this.v;
        int i11 = 1;
        if (i10 >= u10Var.f37860n.size()) {
            return 1;
        }
        int size = ((ArrayList) u10Var.f37865r.get(u10Var.f37860n.get(i10))).size();
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
        if (i10 >= this.v.f37860n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.f35997s;
        if (i12 != 2 && i12 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        u10 u10Var = this.v;
        int i10 = 0;
        if (u10Var.f37860n.isEmpty()) {
            return 0;
        }
        int size = u10Var.f37860n.size();
        if (!u10Var.f37860n.isEmpty() && !u10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f35996r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        u10 u10Var = this.v;
        if (i10 < u10Var.f37860n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) u10Var.f37865r.get((String) u10Var.f37860n.get(i10))).get(0)).messageOwner.date));
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
        u10 u10Var = this.v;
        ArrayList arrayList = u10Var.f37860n;
        int i12 = c1Var.f42630f;
        View view = c1Var.f42627a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) u10Var.f37865r.get((String) arrayList.get(i10));
            int i13 = c1Var.f42630f;
            boolean z11 = false;
            if (i13 != 0) {
                boolean z12 = true;
                if (i13 != 1) {
                    if (i13 == 3) {
                        if (i10 != 0) {
                            i11--;
                        }
                        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                        MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                        if (i7Var.getMessage() != null && i7Var.getMessage().getId() == messageObject.getId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && u10Var.M)) {
                            z11 = true;
                        }
                        i7Var.f(messageObject, z11);
                        i7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.nk(this, i7Var, messageObject, z10, 3));
                        return;
                    }
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
                if (j7Var.getMessage() != null && j7Var.getMessage().getId() == messageObject2.getId()) {
                    z11 = true;
                }
                if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !u10Var.M)) {
                    z12 = false;
                }
                j7Var.c(messageObject2, z12);
                j7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.nk(this, j7Var, messageObject2, z11, 2));
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f35996r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    frameLayout2 = new o10(this, context);
                    return com.google.android.gms.internal.vision.e2.k(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                int i11 = this.f35997s;
                if (i11 != 2 && i11 != 4) {
                    u00Var.setViewType(3);
                } else {
                    u00Var.setViewType(4);
                }
                u00Var.setIsSingleCell(true);
                frameLayout = u00Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.j7(context, 2, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.v3(context, null);
        }
        frameLayout2 = frameLayout;
        return com.google.android.gms.internal.vision.e2.k(frameLayout2, frameLayout2, -1, -2);
    }
}
