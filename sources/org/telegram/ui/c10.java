package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class c10 extends org.telegram.ui.Components.hm0 {
    public final Context f38210r;
    public final int f38211s;
    public final h10 v;

    public c10(h10 h10Var, Context context, int i10) {
        this.v = h10Var;
        this.f38210r = context;
        this.f38211s = i10;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.mm0 mm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        h10 h10Var = this.v;
        int i11 = 1;
        if (i10 >= h10Var.f39839n.size()) {
            return 1;
        }
        int size = ((ArrayList) h10Var.f39844r.get(h10Var.f39839n.get(i10))).size();
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
        if (i10 >= this.v.f39839n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.f38211s;
        if (i12 != 2 && i12 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        h10 h10Var = this.v;
        int i10 = 0;
        if (h10Var.f39839n.isEmpty()) {
            return 0;
        }
        int size = h10Var.f39839n.size();
        if (!h10Var.f39839n.isEmpty() && !h10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.z3(this.f38210r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23374e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        h10 h10Var = this.v;
        if (i10 < h10Var.f39839n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.z3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) h10Var.f39844r.get((String) h10Var.f39839n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, s4.e1 e1Var) {
        if (i10 != 0 && i11 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i10, int i11, s4.e1 e1Var) {
        boolean z10;
        boolean z11;
        h10 h10Var = this.v;
        ArrayList arrayList = h10Var.f39839n;
        int i12 = e1Var.f47738f;
        View view = e1Var.f47735a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) h10Var.f39844r.get((String) arrayList.get(i10));
            int i13 = e1Var.f47738f;
            boolean z12 = false;
            if (i13 != 0) {
                boolean z13 = true;
                if (i13 != 1) {
                    if (i13 == 3) {
                        if (i10 != 0) {
                            i11--;
                        }
                        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                        MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                        if (n7Var.getMessage() != null && n7Var.getMessage().getId() == messageObject.getId()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && h10Var.M)) {
                            z12 = true;
                        }
                        n7Var.f(messageObject, z12);
                        n7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, n7Var, messageObject, z11, 3));
                        return;
                    }
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
                if (o7Var.getMessage() != null && o7Var.getMessage().getId() == messageObject2.getId()) {
                    z10 = false;
                    z12 = true;
                } else {
                    z10 = false;
                }
                if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !h10Var.M)) {
                    z13 = z10;
                }
                o7Var.c(messageObject2, z13);
                o7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, o7Var, messageObject2, z12, 2));
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f38210r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    frameLayout2 = new b10(this, context);
                    return ic.a.n(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
                int i11 = this.f38211s;
                if (i11 != 2 && i11 != 4) {
                    c10Var.setViewType(3);
                } else {
                    c10Var.setViewType(4);
                }
                c10Var.setIsSingleCell(true);
                frameLayout = c10Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.o7(context, 2, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.z3(context, null);
        }
        frameLayout2 = frameLayout;
        return ic.a.n(frameLayout2, frameLayout2, -1, -2);
    }
}
