package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class qh extends c5.a {
    public final int f49035c;
    public final SparseArray d;
    public final boolean f49036e;
    public final List f49037f;
    public final org.telegram.messenger.ij f49038g;
    public final org.telegram.ui.Components.hh0 h;
    public final org.telegram.messenger.ij f49039i;
    public final SparseIntArray f49040j;
    public final int f49041k;
    public final c5.k f49042l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f49043m;
    public final int[] f49044n;
    public final int f49045o;
    public final cn f49046p;

    public qh(cn cnVar, int i7, SparseArray sparseArray, boolean z9, List list, org.telegram.messenger.ij ijVar, org.telegram.ui.Components.hh0 hh0Var, org.telegram.messenger.ij ijVar2, SparseIntArray sparseIntArray, int i10, c5.k kVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.f49046p = cnVar;
        this.f49035c = i7;
        this.d = sparseArray;
        this.f49036e = z9;
        this.f49037f = list;
        this.f49038g = ijVar;
        this.h = hh0Var;
        this.f49039i = ijVar2;
        this.f49040j = sparseIntArray;
        this.f49041k = i10;
        this.f49042l = kVar;
        this.f49043m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f49044n = iArr;
        this.f49045o = i11;
    }

    @Override
    public final void a(c5.k kVar, Object obj) {
        kVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f49035c;
    }

    @Override
    public final Object e(c5.k kVar, int i7) {
        int i10;
        TLRPC.ReactionCount reactionCount;
        int i11;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i7);
        if (view != null) {
            kVar.addView(view);
            return view;
        }
        if (this.f49036e) {
            i10 = i7 - 1;
        } else {
            i10 = i7;
        }
        if (i10 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f49037f.get(i10);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = kVar.getContext();
        cn cnVar = this.f49046p;
        an anVar = cnVar.f44750za;
        i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
        org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(context, anVar, i11, this.f49038g, reactionCount2, true);
        org.telegram.ui.Components.hh0 hh0Var = this.h;
        rh0Var.h(hh0Var.getSeenUsers());
        rh0Var.G = new w0(this, 18);
        rh0Var.E = new ni.c(13, this, this.f49039i);
        rh0Var.D = new hi.g4(this.f49040j, i7, this.f49041k, this.f49042l, this.f49043m, this.f49044n);
        if (i10 < 0) {
            rh0Var.setPredictiveCount(this.f49045o);
            hh0Var.setSeenCallback(new f3(rh0Var, 1));
        }
        kVar.addView(rh0Var);
        sparseArray.put(i7, rh0Var);
        return rh0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
