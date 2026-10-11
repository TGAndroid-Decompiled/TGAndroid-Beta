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
    public final int f38468c;
    public final SparseArray d;
    public final boolean f38469e;
    public final List f38470f;
    public final MessageObject f38471g;
    public final org.telegram.ui.Components.lk0 h;
    public final MessageObject f38472i;
    public final SparseIntArray f38473j;
    public final int f38474k;
    public final z4.g f38475l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38476m;
    public final int[] f38477n;
    public final int f38478o;
    public final zn f38479p;

    public hi(zn znVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.lk0 lk0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f38479p = znVar;
        this.f38468c = i10;
        this.d = sparseArray;
        this.f38469e = z10;
        this.f38470f = list;
        this.f38471g = messageObject;
        this.h = lk0Var;
        this.f38472i = messageObject2;
        this.f38473j = sparseIntArray;
        this.f38474k = i11;
        this.f38475l = gVar;
        this.f38476m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f38477n = iArr;
        this.f38478o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f38468c;
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
        if (this.f38469e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f38470f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        zn znVar = this.f38479p;
        xn xnVar = znVar.f44796ea;
        i12 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
        org.telegram.ui.Components.vk0 vk0Var = new org.telegram.ui.Components.vk0(context, xnVar, i12, this.f38471g, reactionCount2, true);
        org.telegram.ui.Components.lk0 lk0Var = this.h;
        vk0Var.h(lk0Var.getSeenUsers());
        vk0Var.G = new y0(this, 16);
        vk0Var.E = new m4.v0(12, this, this.f38472i);
        vk0Var.f31914y = new ei.t4(this.f38473j, i10, this.f38474k, this.f38475l, this.f38476m, this.f38477n);
        if (i11 < 0) {
            vk0Var.setPredictiveCount(this.f38478o);
            lk0Var.setSeenCallback(new g3(vk0Var, 1));
        }
        gVar.addView(vk0Var);
        sparseArray.put(i10, vk0Var);
        return vk0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
