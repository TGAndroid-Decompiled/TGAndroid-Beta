package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class nh extends c5.a {
    public final int f50172c;
    public final SparseArray d;
    public final boolean f50173e;
    public final List f50174f;
    public final org.telegram.messenger.fj f50175g;
    public final org.telegram.ui.Components.uh0 h;
    public final org.telegram.messenger.fj f50176i;
    public final SparseIntArray f50177j;
    public final int f50178k;
    public final c5.l f50179l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f50180m;
    public final int[] f50181n;
    public final int f50182o;
    public final bn f50183p;

    public nh(bn bnVar, int i7, SparseArray sparseArray, boolean z10, List list, org.telegram.messenger.fj fjVar, org.telegram.ui.Components.uh0 uh0Var, org.telegram.messenger.fj fjVar2, SparseIntArray sparseIntArray, int i10, c5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.f50183p = bnVar;
        this.f50172c = i7;
        this.d = sparseArray;
        this.f50173e = z10;
        this.f50174f = list;
        this.f50175g = fjVar;
        this.h = uh0Var;
        this.f50176i = fjVar2;
        this.f50177j = sparseIntArray;
        this.f50178k = i10;
        this.f50179l = lVar;
        this.f50180m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f50181n = iArr;
        this.f50182o = i11;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f50172c;
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
        if (this.f50173e) {
            i10 = i7 - 1;
        } else {
            i10 = i7;
        }
        if (i10 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f50174f.get(i10);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = lVar.getContext();
        bn bnVar = this.f50183p;
        zm zmVar = bnVar.Ba;
        i11 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context, zmVar, i11, this.f50175g, reactionCount2, true);
        org.telegram.ui.Components.uh0 uh0Var = this.h;
        ei0Var.h(uh0Var.getSeenUsers());
        ei0Var.H = new w0(this, 18);
        ei0Var.F = new oi.e0(15, this, this.f50176i);
        ei0Var.E = new ki.w3(this.f50177j, i7, this.f50178k, this.f50179l, this.f50180m, this.f50181n);
        if (i10 < 0) {
            ei0Var.setPredictiveCount(this.f50182o);
            uh0Var.setSeenCallback(new f3(ei0Var, 1));
        }
        lVar.addView(ei0Var);
        sparseArray.put(i7, ei0Var);
        return ei0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
