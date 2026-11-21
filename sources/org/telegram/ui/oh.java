package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class oh extends c5.a {
    public final int f50595c;
    public final SparseArray d;
    public final boolean f50596e;
    public final List f50597f;
    public final org.telegram.messenger.fj f50598g;
    public final org.telegram.ui.Components.wh0 h;
    public final org.telegram.messenger.fj f50599i;
    public final SparseIntArray f50600j;
    public final int f50601k;
    public final c5.l f50602l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f50603m;
    public final int[] f50604n;
    public final int f50605o;
    public final bn f50606p;

    public oh(bn bnVar, int i7, SparseArray sparseArray, boolean z10, List list, org.telegram.messenger.fj fjVar, org.telegram.ui.Components.wh0 wh0Var, org.telegram.messenger.fj fjVar2, SparseIntArray sparseIntArray, int i10, c5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.f50606p = bnVar;
        this.f50595c = i7;
        this.d = sparseArray;
        this.f50596e = z10;
        this.f50597f = list;
        this.f50598g = fjVar;
        this.h = wh0Var;
        this.f50599i = fjVar2;
        this.f50600j = sparseIntArray;
        this.f50601k = i10;
        this.f50602l = lVar;
        this.f50603m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f50604n = iArr;
        this.f50605o = i11;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f50595c;
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
        if (this.f50596e) {
            i10 = i7 - 1;
        } else {
            i10 = i7;
        }
        if (i10 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f50597f.get(i10);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = lVar.getContext();
        bn bnVar = this.f50606p;
        zm zmVar = bnVar.Ba;
        i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
        org.telegram.ui.Components.gi0 gi0Var = new org.telegram.ui.Components.gi0(context, zmVar, i11, this.f50598g, reactionCount2, true);
        org.telegram.ui.Components.wh0 wh0Var = this.h;
        gi0Var.h(wh0Var.getSeenUsers());
        gi0Var.H = new w0(this, 18);
        gi0Var.F = new oi.f0(15, this, this.f50599i);
        gi0Var.E = new ki.v3(this.f50600j, i7, this.f50601k, this.f50602l, this.f50603m, this.f50604n);
        if (i10 < 0) {
            gi0Var.setPredictiveCount(this.f50605o);
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
