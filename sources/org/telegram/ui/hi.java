package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class hi extends z4.a {
    public final int f37024c;
    public final SparseArray d;
    public final boolean f37025e;
    public final List f37026f;
    public final MessageObject f37027g;
    public final org.telegram.ui.Components.fj0 h;
    public final MessageObject f37028i;
    public final SparseIntArray f37029j;
    public final int f37030k;
    public final z4.g f37031l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37032m;
    public final int[] f37033n;
    public final int f37034o;
    public final co f37035p;

    public hi(co coVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.fj0 fj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f37035p = coVar;
        this.f37024c = i10;
        this.d = sparseArray;
        this.f37025e = z10;
        this.f37026f = list;
        this.f37027g = messageObject;
        this.h = fj0Var;
        this.f37028i = messageObject2;
        this.f37029j = sparseIntArray;
        this.f37030k = i11;
        this.f37031l = gVar;
        this.f37032m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f37033n = iArr;
        this.f37034o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f37024c;
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
        if (this.f37025e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f37026f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        co coVar = this.f37035p;
        ao aoVar = coVar.f35248ea;
        i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, aoVar, i12, this.f37027g, reactionCount2, true);
        org.telegram.ui.Components.fj0 fj0Var = this.h;
        pj0Var.h(fj0Var.getSeenUsers());
        pj0Var.G = new z0(this, 16);
        pj0Var.E = new m4(9, this, this.f37028i);
        pj0Var.f29408y = new fi.v4(this.f37029j, i10, this.f37030k, this.f37031l, this.f37032m, this.f37033n);
        if (i11 < 0) {
            pj0Var.setPredictiveCount(this.f37034o);
            fj0Var.setSeenCallback(new h3(pj0Var, 1));
        }
        gVar.addView(pj0Var);
        sparseArray.put(i10, pj0Var);
        return pj0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
