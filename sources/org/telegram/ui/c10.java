package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class c10 extends org.telegram.ui.Components.fl0 {
    public final Context f36956r;
    public final int f36957s;
    public final h10 v;

    public c10(h10 h10Var, Context context, int i10) {
        this.v = h10Var;
        this.f36956r = context;
        this.f36957s = i10;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        h10 h10Var = this.v;
        int i11 = 1;
        if (i10 >= h10Var.f38735n.size()) {
            return 1;
        }
        int size = ((ArrayList) h10Var.f38737r.get(h10Var.f38735n.get(i10))).size();
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
        if (i10 >= this.v.f38735n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.f36957s;
        if (i12 != 2 && i12 != 4) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int R() {
        h10 h10Var = this.v;
        int i10 = 0;
        if (h10Var.f38735n.isEmpty()) {
            return 0;
        }
        int size = h10Var.f38735n.size();
        if (!h10Var.f38735n.isEmpty() && !h10Var.J) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.s3(this.f36956r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23081e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        h10 h10Var = this.v;
        if (i10 < h10Var.f38735n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) h10Var.f38737r.get((String) h10Var.f38735n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, f2.n1 n1Var) {
        if (i10 != 0 && i11 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W(int i10, int i11, f2.n1 n1Var) {
        boolean z10;
        h10 h10Var = this.v;
        ArrayList arrayList = h10Var.f38735n;
        int i12 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) h10Var.f38737r.get((String) arrayList.get(i10));
            int i13 = n1Var.f6436f;
            boolean z11 = false;
            if (i13 != 0) {
                boolean z12 = true;
                if (i13 != 1) {
                    if (i13 == 3) {
                        if (i10 != 0) {
                            i11--;
                        }
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                        MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                        if (f7Var.getMessage() != null && f7Var.getMessage().getId() == messageObject.getId()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && h10Var.I)) {
                            z11 = true;
                        }
                        f7Var.f(messageObject, z11);
                        f7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.hk(this, f7Var, messageObject, z10, 3));
                        return;
                    }
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
                if (g7Var.getMessage() != null && g7Var.getMessage().getId() == messageObject2.getId()) {
                    z11 = true;
                }
                if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !h10Var.I)) {
                    z12 = false;
                }
                g7Var.c(messageObject2, z12);
                g7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.hk(this, g7Var, messageObject2, z11, 2));
                return;
            }
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.f36956r;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    frameLayout2 = new b10(this, context);
                    return th.m(frameLayout2, frameLayout2, -1, -2);
                }
                org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
                int i11 = this.f36957s;
                if (i11 != 2 && i11 != 4) {
                    p00Var.setViewType(3);
                } else {
                    p00Var.setViewType(4);
                }
                p00Var.setIsSingleCell(true);
                frameLayout = p00Var;
            } else {
                frameLayout = new org.telegram.ui.Cells.g7(context, 2, null);
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.s3(context, null);
        }
        frameLayout2 = frameLayout;
        return th.m(frameLayout2, frameLayout2, -1, -2);
    }
}
