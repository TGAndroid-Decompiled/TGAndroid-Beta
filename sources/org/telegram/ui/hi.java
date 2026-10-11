package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class hi extends z4.a {
    public final int f38434c;
    public final SparseArray d;
    public final boolean f38435e;
    public final List f38436f;
    public final MessageObject f38437g;
    public final org.telegram.ui.Components.mk0 h;
    public final MessageObject f38438i;
    public final SparseIntArray f38439j;
    public final int f38440k;
    public final z4.g f38441l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38442m;
    public final int[] f38443n;
    public final int f38444o;
    public final zn f38445p;

    public hi(zn znVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.mk0 mk0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f38445p = znVar;
        this.f38434c = i10;
        this.d = sparseArray;
        this.f38435e = z10;
        this.f38436f = list;
        this.f38437g = messageObject;
        this.h = mk0Var;
        this.f38438i = messageObject2;
        this.f38439j = sparseIntArray;
        this.f38440k = i11;
        this.f38441l = gVar;
        this.f38442m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f38443n = iArr;
        this.f38444o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f38434c;
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
        if (this.f38435e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f38436f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        zn znVar = this.f38445p;
        xn xnVar = znVar.f44762ea;
        i12 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, xnVar, i12, this.f38437g, reactionCount2, true);
        org.telegram.ui.Components.mk0 mk0Var = this.h;
        wk0Var.h(mk0Var.getSeenUsers());
        wk0Var.G = new y0(this, 16);
        wk0Var.E = new m4.v0(12, this, this.f38438i);
        wk0Var.f32673y = new ei.t4(this.f38439j, i10, this.f38440k, this.f38441l, this.f38442m, this.f38443n);
        if (i11 < 0) {
            wk0Var.setPredictiveCount(this.f38444o);
            mk0Var.setSeenCallback(new g3(wk0Var, 1));
        }
        gVar.addView(wk0Var);
        sparseArray.put(i10, wk0Var);
        return wk0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
