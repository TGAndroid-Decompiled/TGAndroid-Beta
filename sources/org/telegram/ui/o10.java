package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class o10 extends org.telegram.ui.Components.ol0 {
    public final Context f36764r;
    public final int f36765s;
    public final t10 v;

    public o10(t10 t10Var, Context context, int i10) {
        this.v = t10Var;
        this.f36764r = context;
        this.f36765s = i10;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.sl0 sl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        t10 t10Var = this.v;
        int i11 = 1;
        if (i10 >= t10Var.f38488n.size()) {
            return 1;
        }
        int size = ((ArrayList) t10Var.f38491r.get(t10Var.f38488n.get(i10))).size();
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
        if (i10 >= this.v.f38488n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.f36765s;
        if (i12 != 2 && i12 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        t10 t10Var = this.v;
        int i10 = 0;
        if (t10Var.f38488n.isEmpty()) {
            return 0;
        }
        int size = t10Var.f38488n.size();
        if (!t10Var.f38488n.isEmpty() && !t10Var.K) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.f36764r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19924e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        t10 t10Var = this.v;
        if (i10 < t10Var.f38488n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) t10Var.f38491r.get((String) t10Var.f38488n.get(i10))).get(0)).messageOwner.date));
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
        t10 t10Var = this.v;
        ArrayList arrayList = t10Var.f38488n;
        int i12 = l1Var.f5788f;
        View view = l1Var.f5785a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) t10Var.f38491r.get((String) arrayList.get(i10));
            int i13 = l1Var.f5788f;
            boolean z10 = false;
            if (i13 != 0) {
                boolean z11 = true;
                if (i13 != 1) {
                    if (i13 == 3) {
                        if (i10 != 0) {
                            i11--;
                        }
                        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                        MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                        if (h7Var.getMessage() != null && h7Var.getMessage().getId() == messageObject.getId()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && t10Var.J)) {
                            z10 = true;
                        }
                        h7Var.f(messageObject, z10);
                        h7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.fk(this, h7Var, messageObject, z4, 3));
                        return;
                    }
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
                if (i7Var.getMessage() != null && i7Var.getMessage().getId() == messageObject2.getId()) {
                    z10 = true;
                }
                if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !t10Var.J)) {
                    z11 = false;
                }
                i7Var.c(messageObject2, z11);
                i7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.fk(this, i7Var, messageObject2, z10, 2));
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f36764r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    frameLayout2 = new n10(this, context);
                    return yh.o(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
                int i11 = this.f36765s;
                if (i11 != 2 && i11 != 4) {
                    t00Var.setViewType(3);
                } else {
                    t00Var.setViewType(4);
                }
                t00Var.setIsSingleCell(true);
                frameLayout = t00Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.i7(context, 2, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.u3(context, null);
        }
        frameLayout2 = frameLayout;
        return yh.o(frameLayout2, frameLayout2, -1, -2);
    }
}
