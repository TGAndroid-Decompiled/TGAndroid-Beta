package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ei extends z4.a {
    public final int f32928c;
    public final SparseArray d;
    public final boolean e;
    public final List f32929f;
    public final MessageObject f32930g;
    public final org.telegram.ui.Components.gj0 h;
    public final MessageObject f32931i;
    public final SparseIntArray f32932j;
    public final int f32933k;
    public final z4.g f32934l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f32935m;
    public final int[] f32936n;
    public final int f32937o;
    public final xn f32938p;

    public ei(xn xnVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.gj0 gj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f32938p = xnVar;
        this.f32928c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f32929f = list;
        this.f32930g = messageObject;
        this.h = gj0Var;
        this.f32931i = messageObject2;
        this.f32932j = sparseIntArray;
        this.f32933k = i11;
        this.f32934l = gVar;
        this.f32935m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f32936n = iArr;
        this.f32937o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f32928c;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        int i11;
        TLRPC.ReactionCount reactionCount;
        int i12;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            gVar.addView(view);
            return view;
        }
        if (this.e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f32929f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        xn xnVar = this.f32938p;
        vn vnVar = xnVar.f39370ea;
        i12 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, vnVar, i12, this.f32930g, reactionCount2, true);
        org.telegram.ui.Components.gj0 gj0Var = this.h;
        qj0Var.h(gj0Var.getSeenUsers());
        qj0Var.G = new z0(this, 16);
        qj0Var.E = new u(10, this, this.f32931i);
        qj0Var.f27373y = new ei.u4(this.f32932j, i10, this.f32933k, this.f32934l, this.f32935m, this.f32936n);
        if (i11 < 0) {
            qj0Var.setPredictiveCount(this.f32937o);
            gj0Var.setSeenCallback(new h3(qj0Var, 1));
        }
        gVar.addView(qj0Var);
        sparseArray.put(i10, qj0Var);
        return qj0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
