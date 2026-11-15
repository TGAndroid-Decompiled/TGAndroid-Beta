package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class oh extends c5.a {
    public final int f49948c;
    public final SparseArray d;
    public final boolean f49949e;
    public final List f49950f;
    public final org.telegram.messenger.gj f49951g;
    public final org.telegram.ui.Components.lh0 h;
    public final org.telegram.messenger.gj f49952i;
    public final SparseIntArray f49953j;
    public final int f49954k;
    public final c5.l f49955l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f49956m;
    public final int[] f49957n;
    public final int f49958o;
    public final an f49959p;

    public oh(an anVar, int i7, SparseArray sparseArray, boolean z10, List list, org.telegram.messenger.gj gjVar, org.telegram.ui.Components.lh0 lh0Var, org.telegram.messenger.gj gjVar2, SparseIntArray sparseIntArray, int i10, c5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.f49959p = anVar;
        this.f49948c = i7;
        this.d = sparseArray;
        this.f49949e = z10;
        this.f49950f = list;
        this.f49951g = gjVar;
        this.h = lh0Var;
        this.f49952i = gjVar2;
        this.f49953j = sparseIntArray;
        this.f49954k = i10;
        this.f49955l = lVar;
        this.f49956m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f49957n = iArr;
        this.f49958o = i11;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f49948c;
    }

    @Override
    public final Object e(c5.l lVar, int i7) {
        int i10;
        TLRPC.ReactionCount reactionCount;
        int i11;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i7);
        if (view != null) {
            lVar.addView(view);
            return view;
        }
        if (this.f49949e) {
            i10 = i7 - 1;
        } else {
            i10 = i7;
        }
        if (i10 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f49950f.get(i10);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = lVar.getContext();
        an anVar = this.f49959p;
        ym ymVar = anVar.Aa;
        i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
        org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(context, ymVar, i11, this.f49951g, reactionCount2, true);
        org.telegram.ui.Components.lh0 lh0Var = this.h;
        vh0Var.h(lh0Var.getSeenUsers());
        vh0Var.H = new w0(this, 18);
        vh0Var.F = new m2.d(17, this, this.f49952i);
        vh0Var.E = new ki.b4(this.f49953j, i7, this.f49954k, this.f49955l, this.f49956m, this.f49957n);
        if (i10 < 0) {
            vh0Var.setPredictiveCount(this.f49958o);
            lh0Var.setSeenCallback(new f3(vh0Var, 1));
        }
        lVar.addView(vh0Var);
        sparseArray.put(i7, vh0Var);
        return vh0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
