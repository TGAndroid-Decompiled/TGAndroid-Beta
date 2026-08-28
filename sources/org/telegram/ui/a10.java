package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class a10 extends org.telegram.ui.Components.sk0 {
    public final Context f36327r;
    public final int f36328s;
    public final f10 v;

    public a10(f10 f10Var, Context context, int i9) {
        this.v = f10Var;
        this.f36327r = context;
        this.f36328s = i9;
    }

    @Override
    public final String F(int i9) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i9) {
        f10 f10Var = this.v;
        int i10 = 1;
        if (i9 >= f10Var.f38102n.size()) {
            return 1;
        }
        int size = ((ArrayList) f10Var.f38104r.get(f10Var.f38102n.get(i9))).size();
        if (i9 == 0) {
            i10 = 0;
        }
        return size + i10;
    }

    @Override
    public final Object O(int i9, int i10) {
        return null;
    }

    @Override
    public final int P(int i9, int i10) {
        if (i9 >= this.v.f38102n.size()) {
            return 2;
        }
        if (i9 != 0 && i10 == 0) {
            return 0;
        }
        int i11 = this.f36328s;
        if (i11 != 2 && i11 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        f10 f10Var = this.v;
        int i9 = 0;
        if (f10Var.f38102n.isEmpty()) {
            return 0;
        }
        int size = f10Var.f38102n.size();
        if (!f10Var.f38102n.isEmpty() && !f10Var.J) {
            i9 = 1;
        }
        return size + i9;
    }

    @Override
    public final View T(int i9, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.f36327r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23020e7, false) & (-218103809));
        }
        if (i9 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        f10 f10Var = this.v;
        if (i9 < f10Var.f38102n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) f10Var.f38104r.get((String) f10Var.f38102n.get(i9))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        if (i9 != 0 && i10 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i9, int i10, f2.q1 q1Var) {
        boolean z10;
        f10 f10Var = this.v;
        ArrayList arrayList = f10Var.f38102n;
        int i11 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) f10Var.f38104r.get((String) arrayList.get(i9));
            int i12 = q1Var.f5505f;
            boolean z11 = false;
            if (i12 != 0) {
                boolean z12 = true;
                if (i12 != 1) {
                    if (i12 == 3) {
                        if (i9 != 0) {
                            i10--;
                        }
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                        MessageObject messageObject = (MessageObject) arrayList2.get(i10);
                        if (h7Var.getMessage() != null && h7Var.getMessage().getId() == messageObject.getId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i10 != arrayList2.size() - 1 || (i9 == arrayList.size() - 1 && f10Var.I)) {
                            z11 = true;
                        }
                        h7Var.f(messageObject, z11);
                        h7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.dk(this, h7Var, messageObject, z10, 3));
                        return;
                    }
                    return;
                }
                if (i9 != 0) {
                    i10--;
                }
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i10);
                if (i7Var.getMessage() != null && i7Var.getMessage().getId() == messageObject2.getId()) {
                    z11 = true;
                }
                if (i10 == arrayList2.size() - 1 && (i9 != arrayList.size() - 1 || !f10Var.I)) {
                    z12 = false;
                }
                i7Var.c(messageObject2, z12);
                i7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.dk(this, i7Var, messageObject2, z11, 2));
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f36327r;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    frameLayout2 = new z00(this, context);
                    return j3.r0.s(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
                int i10 = this.f36328s;
                if (i10 != 2 && i10 != 4) {
                    e00Var.setViewType(3);
                } else {
                    e00Var.setViewType(4);
                }
                e00Var.setIsSingleCell(true);
                frameLayout = e00Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.i7(context, 2, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.v3(context, null);
        }
        frameLayout2 = frameLayout;
        return j3.r0.s(frameLayout2, frameLayout2, -1, -2);
    }
}
