package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class p10 extends org.telegram.ui.Components.nl0 {
    public final Context f36919r;
    public final int f36920s;
    public final u10 v;

    public p10(u10 u10Var, Context context, int i10) {
        this.v = u10Var;
        this.f36919r = context;
        this.f36920s = i10;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.rl0 rl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        u10 u10Var = this.v;
        int i11 = 1;
        if (i10 >= u10Var.f38654n.size()) {
            return 1;
        }
        int size = ((ArrayList) u10Var.f38657r.get(u10Var.f38654n.get(i10))).size();
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
        if (i10 >= this.v.f38654n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.f36920s;
        if (i12 != 2 && i12 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        u10 u10Var = this.v;
        int i10 = 0;
        if (u10Var.f38654n.isEmpty()) {
            return 0;
        }
        int size = u10Var.f38654n.size();
        if (!u10Var.f38654n.isEmpty() && !u10Var.K) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.t3(this.f36919r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19899e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        u10 u10Var = this.v;
        if (i10 < u10Var.f38654n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.t3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) u10Var.f38657r.get((String) u10Var.f38654n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, f2.l1 l1Var) {
        if (i10 != 0 && i11 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i10, int i11, f2.l1 l1Var) {
        boolean z4;
        u10 u10Var = this.v;
        ArrayList arrayList = u10Var.f38654n;
        int i12 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) u10Var.f38657r.get((String) arrayList.get(i10));
            int i13 = l1Var.f5777f;
            boolean z10 = false;
            if (i13 != 0) {
                boolean z11 = true;
                if (i13 != 1) {
                    if (i13 == 3) {
                        if (i10 != 0) {
                            i11--;
                        }
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                        MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                        if (g7Var.getMessage() != null && g7Var.getMessage().getId() == messageObject.getId()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && u10Var.J)) {
                            z10 = true;
                        }
                        g7Var.f(messageObject, z10);
                        g7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.fk(this, g7Var, messageObject, z4, 3));
                        return;
                    }
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
                if (h7Var.getMessage() != null && h7Var.getMessage().getId() == messageObject2.getId()) {
                    z10 = true;
                }
                if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !u10Var.J)) {
                    z11 = false;
                }
                h7Var.c(messageObject2, z11);
                h7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.fk(this, h7Var, messageObject2, z10, 2));
                return;
            }
            ((org.telegram.ui.Cells.t3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f36919r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    frameLayout2 = new o10(this, context);
                    return ai.n(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
                int i11 = this.f36920s;
                if (i11 != 2 && i11 != 4) {
                    u00Var.setViewType(3);
                } else {
                    u00Var.setViewType(4);
                }
                u00Var.setIsSingleCell(true);
                frameLayout = u00Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.h7(context, 2, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.t3(context, null);
        }
        frameLayout2 = frameLayout;
        return ai.n(frameLayout2, frameLayout2, -1, -2);
    }
}
