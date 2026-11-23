package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class nh extends c5.a {
    public final int f50187c;
    public final SparseArray d;
    public final boolean f50188e;
    public final List f50189f;
    public final org.telegram.messenger.gj f50190g;
    public final org.telegram.ui.Components.wh0 h;
    public final org.telegram.messenger.gj f50191i;
    public final SparseIntArray f50192j;
    public final int f50193k;
    public final c5.l f50194l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f50195m;
    public final int[] f50196n;
    public final int f50197o;
    public final bn f50198p;

    public nh(bn bnVar, int i7, SparseArray sparseArray, boolean z10, List list, org.telegram.messenger.gj gjVar, org.telegram.ui.Components.wh0 wh0Var, org.telegram.messenger.gj gjVar2, SparseIntArray sparseIntArray, int i10, c5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.f50198p = bnVar;
        this.f50187c = i7;
        this.d = sparseArray;
        this.f50188e = z10;
        this.f50189f = list;
        this.f50190g = gjVar;
        this.h = wh0Var;
        this.f50191i = gjVar2;
        this.f50192j = sparseIntArray;
        this.f50193k = i10;
        this.f50194l = lVar;
        this.f50195m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f50196n = iArr;
        this.f50197o = i11;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f50187c;
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
        if (this.f50188e) {
            i10 = i7 - 1;
        } else {
            i10 = i7;
        }
        if (i10 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f50189f.get(i10);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = lVar.getContext();
        bn bnVar = this.f50198p;
        zm zmVar = bnVar.Ba;
        i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
        org.telegram.ui.Components.gi0 gi0Var = new org.telegram.ui.Components.gi0(context, zmVar, i11, this.f50190g, reactionCount2, true);
        org.telegram.ui.Components.wh0 wh0Var = this.h;
        gi0Var.h(wh0Var.getSeenUsers());
        gi0Var.H = new w0(this, 18);
        gi0Var.F = new oi.e0(15, this, this.f50191i);
        gi0Var.E = new ki.v3(this.f50192j, i7, this.f50193k, this.f50194l, this.f50195m, this.f50196n);
        if (i10 < 0) {
            gi0Var.setPredictiveCount(this.f50197o);
            wh0Var.setSeenCallback(new f3(gi0Var, 1));
        }
        lVar.addView(gi0Var);
        sparseArray.put(i7, gi0Var);
        return gi0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
