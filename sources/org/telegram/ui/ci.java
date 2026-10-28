package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ci extends a5.a {
    public final int f38357c;
    public final SparseArray d;
    public final boolean e;
    public final List f38358f;
    public final MessageObject f38359g;
    public final org.telegram.ui.Components.gk0 h;
    public final MessageObject f38360i;
    public final SparseIntArray f38361j;
    public final int f38362k;
    public final a5.m f38363l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38364m;
    public final int[] f38365n;
    public final int f38366o;
    public final wn f38367p;

    public ci(wn wnVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.gk0 gk0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, a5.m mVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f38367p = wnVar;
        this.f38357c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f38358f = list;
        this.f38359g = messageObject;
        this.h = gk0Var;
        this.f38360i = messageObject2;
        this.f38361j = sparseIntArray;
        this.f38362k = i11;
        this.f38363l = mVar;
        this.f38364m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f38365n = iArr;
        this.f38366o = i12;
    }

    @Override
    public final void a(a5.m mVar, Object obj) {
        mVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f38357c;
    }

    @Override
    public final Object e(a5.m mVar, int i10) {
        int i11;
        TLRPC.ReactionCount reactionCount;
        int i12;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            mVar.addView(view);
            return view;
        }
        if (this.e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f38358f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = mVar.getContext();
        wn wnVar = this.f38367p;
        un unVar = wnVar.f45309ua;
        i12 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
        org.telegram.ui.Components.qk0 qk0Var = new org.telegram.ui.Components.qk0(context, unVar, i12, this.f38359g, reactionCount2, true);
        org.telegram.ui.Components.gk0 gk0Var = this.h;
        qk0Var.h(gk0Var.getSeenUsers());
        qk0Var.G = new y0(this, 18);
        qk0Var.E = new m4.s0(18, this, this.f38360i);
        qk0Var.f31929y = new hi.s4(this.f38361j, i10, this.f38362k, this.f38363l, this.f38364m, this.f38365n);
        if (i11 < 0) {
            qk0Var.setPredictiveCount(this.f38366o);
            gk0Var.setSeenCallback(new h3(qk0Var, 1));
        }
        mVar.addView(qk0Var);
        sparseArray.put(i10, qk0Var);
        return qk0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
