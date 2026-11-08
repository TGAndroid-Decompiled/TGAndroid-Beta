package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class oh extends c5.a {
    public final int f48394c;
    public final SparseArray d;
    public final boolean f48395e;
    public final List f48396f;
    public final org.telegram.messenger.ij f48397g;
    public final org.telegram.ui.Components.hh0 h;
    public final org.telegram.messenger.ij f48398i;
    public final SparseIntArray f48399j;
    public final int f48400k;
    public final c5.k f48401l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f48402m;
    public final int[] f48403n;
    public final int f48404o;
    public final an f48405p;

    public oh(an anVar, int i7, SparseArray sparseArray, boolean z9, List list, org.telegram.messenger.ij ijVar, org.telegram.ui.Components.hh0 hh0Var, org.telegram.messenger.ij ijVar2, SparseIntArray sparseIntArray, int i10, c5.k kVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.f48405p = anVar;
        this.f48394c = i7;
        this.d = sparseArray;
        this.f48395e = z9;
        this.f48396f = list;
        this.f48397g = ijVar;
        this.h = hh0Var;
        this.f48398i = ijVar2;
        this.f48399j = sparseIntArray;
        this.f48400k = i10;
        this.f48401l = kVar;
        this.f48402m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f48403n = iArr;
        this.f48404o = i11;
    }

    @Override
    public final void a(c5.k kVar, Object obj) {
        kVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f48394c;
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
        if (this.f48395e) {
            i10 = i7 - 1;
        } else {
            i10 = i7;
        }
        if (i10 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f48396f.get(i10);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = kVar.getContext();
        an anVar = this.f48405p;
        ym ymVar = anVar.f44028xa;
        i11 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
        org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(context, ymVar, i11, this.f48397g, reactionCount2, true);
        org.telegram.ui.Components.hh0 hh0Var = this.h;
        rh0Var.h(hh0Var.getSeenUsers());
        rh0Var.G = new w0(this, 18);
        rh0Var.E = new ni.c(13, this, this.f48398i);
        rh0Var.D = new hi.g4(this.f48399j, i7, this.f48400k, this.f48401l, this.f48402m, this.f48403n);
        if (i10 < 0) {
            rh0Var.setPredictiveCount(this.f48404o);
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
