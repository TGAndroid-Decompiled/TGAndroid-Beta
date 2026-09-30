package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ei extends z4.a {
    public final int f33497c;
    public final SparseArray d;
    public final boolean e;
    public final List f33498f;
    public final MessageObject f33499g;
    public final org.telegram.ui.Components.tj0 h;
    public final MessageObject f33500i;
    public final SparseIntArray f33501j;
    public final int f33502k;
    public final z4.g f33503l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f33504m;
    public final int[] f33505n;
    public final int f33506o;
    public final wn f33507p;

    public ei(wn wnVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.tj0 tj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f33507p = wnVar;
        this.f33497c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f33498f = list;
        this.f33499g = messageObject;
        this.h = tj0Var;
        this.f33500i = messageObject2;
        this.f33501j = sparseIntArray;
        this.f33502k = i11;
        this.f33503l = gVar;
        this.f33504m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f33505n = iArr;
        this.f33506o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f33497c;
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
        if (this.e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f33498f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        wn wnVar = this.f33507p;
        un unVar = wnVar.f39562ea;
        i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        org.telegram.ui.Components.dk0 dk0Var = new org.telegram.ui.Components.dk0(context, unVar, i12, this.f33499g, reactionCount2, true);
        org.telegram.ui.Components.tj0 tj0Var = this.h;
        dk0Var.h(tj0Var.getSeenUsers());
        dk0Var.G = new z0(this, 16);
        dk0Var.E = new o(11, this, this.f33500i);
        dk0Var.f23674y = new ei.u4(this.f33501j, i10, this.f33502k, this.f33503l, this.f33504m, this.f33505n);
        if (i11 < 0) {
            dk0Var.setPredictiveCount(this.f33506o);
            tj0Var.setSeenCallback(new h3(dk0Var, 1));
        }
        gVar.addView(dk0Var);
        sparseArray.put(i10, dk0Var);
        return dk0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
