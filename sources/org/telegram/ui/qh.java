package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class qh extends c5.a {
    public final int f49047c;
    public final SparseArray d;
    public final boolean f49048e;
    public final List f49049f;
    public final org.telegram.messenger.ij f49050g;
    public final org.telegram.ui.Components.ih0 h;
    public final org.telegram.messenger.ij f49051i;
    public final SparseIntArray f49052j;
    public final int f49053k;
    public final c5.k f49054l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f49055m;
    public final int[] f49056n;
    public final int f49057o;
    public final cn f49058p;

    public qh(cn cnVar, int i7, SparseArray sparseArray, boolean z9, List list, org.telegram.messenger.ij ijVar, org.telegram.ui.Components.ih0 ih0Var, org.telegram.messenger.ij ijVar2, SparseIntArray sparseIntArray, int i10, c5.k kVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.f49058p = cnVar;
        this.f49047c = i7;
        this.d = sparseArray;
        this.f49048e = z9;
        this.f49049f = list;
        this.f49050g = ijVar;
        this.h = ih0Var;
        this.f49051i = ijVar2;
        this.f49052j = sparseIntArray;
        this.f49053k = i10;
        this.f49054l = kVar;
        this.f49055m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f49056n = iArr;
        this.f49057o = i11;
    }

    @Override
    public final void a(c5.k kVar, Object obj) {
        kVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f49047c;
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
        if (this.f49048e) {
            i10 = i7 - 1;
        } else {
            i10 = i7;
        }
        if (i10 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f49049f.get(i10);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = kVar.getContext();
        cn cnVar = this.f49058p;
        an anVar = cnVar.f44709za;
        i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
        org.telegram.ui.Components.sh0 sh0Var = new org.telegram.ui.Components.sh0(context, anVar, i11, this.f49050g, reactionCount2, true);
        org.telegram.ui.Components.ih0 ih0Var = this.h;
        sh0Var.h(ih0Var.getSeenUsers());
        sh0Var.G = new w0(this, 18);
        sh0Var.E = new ni.c(13, this, this.f49051i);
        sh0Var.D = new hi.g4(this.f49052j, i7, this.f49053k, this.f49054l, this.f49055m, this.f49056n);
        if (i10 < 0) {
            sh0Var.setPredictiveCount(this.f49057o);
            ih0Var.setSeenCallback(new f3(sh0Var, 1));
        }
        kVar.addView(sh0Var);
        sparseArray.put(i7, sh0Var);
        return sh0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
