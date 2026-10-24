package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class d10 extends org.telegram.ui.Components.hm0 {
    public final Context f36444r;
    public final int f36445s;
    public final i10 v;

    public d10(i10 i10Var, Context context, int i10) {
        this.v = i10Var;
        this.f36444r = context;
        this.f36445s = i10;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.lm0 lm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        i10 i10Var = this.v;
        int i11 = 1;
        if (i10 >= i10Var.f38109n.size()) {
            return 1;
        }
        int size = ((ArrayList) i10Var.f38114r.get(i10Var.f38109n.get(i10))).size();
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
        if (i10 >= this.v.f38109n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.f36445s;
        if (i12 != 2 && i12 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        i10 i10Var = this.v;
        int i10 = 0;
        if (i10Var.f38109n.isEmpty()) {
            return 0;
        }
        int size = i10Var.f38109n.size();
        if (!i10Var.f38109n.isEmpty() && !i10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f36444r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        i10 i10Var = this.v;
        if (i10 < i10Var.f38109n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) i10Var.f38114r.get((String) i10Var.f38109n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        if (i10 != 0 && i11 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i10, int i11, s4.b1 b1Var) {
        boolean z10;
        boolean z11;
        i10 i10Var = this.v;
        ArrayList arrayList = i10Var.f38109n;
        int i12 = b1Var.f46345f;
        View view = b1Var.f46342a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) i10Var.f38114r.get((String) arrayList.get(i10));
            int i13 = b1Var.f46345f;
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
                        if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && i10Var.M)) {
                            z12 = true;
                        }
                        j7Var.f(messageObject, z12);
                        j7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.jk(this, j7Var, messageObject, z11, 3));
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
                if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !i10Var.M)) {
                    z13 = z10;
                }
                k7Var.c(messageObject2, z13);
                k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.jk(this, k7Var, messageObject2, z12, 2));
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f36444r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    frameLayout2 = new c10(this, context);
                    return com.google.android.gms.internal.play_billing.k3.l(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(context, null);
                int i11 = this.f36445s;
                if (i11 != 2 && i11 != 4) {
                    z00Var.setViewType(3);
                } else {
                    z00Var.setViewType(4);
                }
                z00Var.setIsSingleCell(true);
                frameLayout = z00Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.k7(context, 2, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.u3(context, null);
        }
        frameLayout2 = frameLayout;
        return com.google.android.gms.internal.play_billing.k3.l(frameLayout2, frameLayout2, -1, -2);
    }
}
