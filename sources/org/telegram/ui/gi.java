package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gi extends z4.a {
    public final int f33939c;
    public final SparseArray d;
    public final boolean e;
    public final List f33940f;
    public final MessageObject f33941g;
    public final org.telegram.ui.Components.sj0 h;
    public final MessageObject f33942i;
    public final SparseIntArray f33943j;
    public final int f33944k;
    public final z4.g f33945l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f33946m;
    public final int[] f33947n;
    public final int f33948o;
    public final xn f33949p;

    public gi(xn xnVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.sj0 sj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f33949p = xnVar;
        this.f33939c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f33940f = list;
        this.f33941g = messageObject;
        this.h = sj0Var;
        this.f33942i = messageObject2;
        this.f33943j = sparseIntArray;
        this.f33944k = i11;
        this.f33945l = gVar;
        this.f33946m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f33947n = iArr;
        this.f33948o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f33939c;
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
            reactionCount = (TLRPC.ReactionCount) this.f33940f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        xn xnVar = this.f33949p;
        vn vnVar = xnVar.f39750ea;
        i12 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, vnVar, i12, this.f33941g, reactionCount2, true);
        org.telegram.ui.Components.sj0 sj0Var = this.h;
        ck0Var.h(sj0Var.getSeenUsers());
        ck0Var.G = new a1(this, 18);
        ck0Var.E = new p(11, this, this.f33942i);
        ck0Var.f23356y = new ei.u4(this.f33943j, i10, this.f33944k, this.f33945l, this.f33946m, this.f33947n);
        if (i11 < 0) {
            ck0Var.setPredictiveCount(this.f33948o);
            sj0Var.setSeenCallback(new i3(ck0Var, 1));
        }
        gVar.addView(ck0Var);
        sparseArray.put(i10, ck0Var);
        return ck0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
