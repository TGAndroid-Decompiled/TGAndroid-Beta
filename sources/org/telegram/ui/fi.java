package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class fi extends m2.a {
    public final int f34085c;
    public final SparseArray d;
    public final boolean e;
    public final List f34086f;
    public final MessageObject f34087g;
    public final org.telegram.ui.Components.oj0 h;
    public final MessageObject f34088i;
    public final SparseIntArray f34089j;
    public final int f34090k;
    public final m2.h f34091l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f34092m;
    public final int[] f34093n;
    public final int f34094o;
    public final zn f34095p;

    public fi(zn znVar, int i10, SparseArray sparseArray, boolean z4, List list, MessageObject messageObject, org.telegram.ui.Components.oj0 oj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, m2.h hVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f34095p = znVar;
        this.f34085c = i10;
        this.d = sparseArray;
        this.e = z4;
        this.f34086f = list;
        this.f34087g = messageObject;
        this.h = oj0Var;
        this.f34088i = messageObject2;
        this.f34089j = sparseIntArray;
        this.f34090k = i11;
        this.f34091l = hVar;
        this.f34092m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f34093n = iArr;
        this.f34094o = i12;
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f34085c;
    }

    @Override
    public final Object e(m2.h hVar, int i10) {
        int i11;
        TLRPC.ReactionCount reactionCount;
        int i12;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            hVar.addView(view);
            return view;
        }
        if (this.e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f34086f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = hVar.getContext();
        zn znVar = this.f34095p;
        xn xnVar = znVar.f40534ba;
        i12 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(context, xnVar, i12, this.f34087g, reactionCount2, true);
        org.telegram.ui.Components.oj0 oj0Var = this.h;
        yj0Var.h(oj0Var.getSeenUsers());
        yj0Var.D = new c1(this, 16);
        yj0Var.B = new mg.w(17, this, this.f34088i);
        yj0Var.f31041y = new gg.d(this.f34089j, i10, this.f34090k, this.f34091l, this.f34092m, this.f34093n);
        if (i11 < 0) {
            yj0Var.setPredictiveCount(this.f34094o);
            oj0Var.setSeenCallback(new l3(yj0Var, 1));
        }
        hVar.addView(yj0Var);
        sparseArray.put(i10, yj0Var);
        return yj0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
