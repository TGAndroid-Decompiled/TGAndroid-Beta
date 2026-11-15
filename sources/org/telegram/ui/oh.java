package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class oh extends c5.a {
    public final int f49958c;
    public final SparseArray d;
    public final boolean f49959e;
    public final List f49960f;
    public final org.telegram.messenger.gj f49961g;
    public final org.telegram.ui.Components.lh0 h;
    public final org.telegram.messenger.gj f49962i;
    public final SparseIntArray f49963j;
    public final int f49964k;
    public final c5.l f49965l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f49966m;
    public final int[] f49967n;
    public final int f49968o;
    public final an f49969p;

    public oh(an anVar, int i7, SparseArray sparseArray, boolean z10, List list, org.telegram.messenger.gj gjVar, org.telegram.ui.Components.lh0 lh0Var, org.telegram.messenger.gj gjVar2, SparseIntArray sparseIntArray, int i10, c5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.f49969p = anVar;
        this.f49958c = i7;
        this.d = sparseArray;
        this.f49959e = z10;
        this.f49960f = list;
        this.f49961g = gjVar;
        this.h = lh0Var;
        this.f49962i = gjVar2;
        this.f49963j = sparseIntArray;
        this.f49964k = i10;
        this.f49965l = lVar;
        this.f49966m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f49967n = iArr;
        this.f49968o = i11;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f49958c;
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
        if (this.f49959e) {
            i10 = i7 - 1;
        } else {
            i10 = i7;
        }
        if (i10 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f49960f.get(i10);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = lVar.getContext();
        an anVar = this.f49969p;
        ym ymVar = anVar.Aa;
        i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
        org.telegram.ui.Components.vh0 vh0Var = new org.telegram.ui.Components.vh0(context, ymVar, i11, this.f49961g, reactionCount2, true);
        org.telegram.ui.Components.lh0 lh0Var = this.h;
        vh0Var.h(lh0Var.getSeenUsers());
        vh0Var.H = new w0(this, 18);
        vh0Var.F = new m2.d(17, this, this.f49962i);
        vh0Var.E = new ki.b4(this.f49963j, i7, this.f49964k, this.f49965l, this.f49966m, this.f49967n);
        if (i10 < 0) {
            vh0Var.setPredictiveCount(this.f49968o);
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
