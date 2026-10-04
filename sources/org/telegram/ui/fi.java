package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class fi extends z4.a {
    public final int f36327c;
    public final SparseArray d;
    public final boolean f36328e;
    public final List f36329f;
    public final MessageObject f36330g;
    public final org.telegram.ui.Components.sj0 h;
    public final MessageObject f36331i;
    public final SparseIntArray f36332j;
    public final int f36333k;
    public final z4.g f36334l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f36335m;
    public final int[] f36336n;
    public final int f36337o;
    public final yn f36338p;

    public fi(yn ynVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.sj0 sj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f36338p = ynVar;
        this.f36327c = i10;
        this.d = sparseArray;
        this.f36328e = z10;
        this.f36329f = list;
        this.f36330g = messageObject;
        this.h = sj0Var;
        this.f36331i = messageObject2;
        this.f36332j = sparseIntArray;
        this.f36333k = i11;
        this.f36334l = gVar;
        this.f36335m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f36336n = iArr;
        this.f36337o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f36327c;
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
        if (this.f36328e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f36329f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        yn ynVar = this.f36338p;
        wn wnVar = ynVar.f43307ca;
        i12 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, wnVar, i12, this.f36330g, reactionCount2, true);
        org.telegram.ui.Components.sj0 sj0Var = this.h;
        ck0Var.h(sj0Var.getSeenUsers());
        ck0Var.G = new z0(this, 18);
        ck0Var.E = new o(12, this, this.f36331i);
        ck0Var.f25416y = new ei.v4(this.f36332j, i10, this.f36333k, this.f36334l, this.f36335m, this.f36336n);
        if (i11 < 0) {
            ck0Var.setPredictiveCount(this.f36337o);
            sj0Var.setSeenCallback(new h3(ck0Var, 1));
        }
        gVar.addView(ck0Var);
        sparseArray.put(i10, ck0Var);
        return ck0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
