package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class di extends m2.a {
    public final int f36200c;
    public final SparseArray d;
    public final boolean f36201e;
    public final List f36202f;
    public final MessageObject f36203g;
    public final org.telegram.ui.Components.pj0 h;
    public final MessageObject f36204i;
    public final SparseIntArray f36205j;
    public final int f36206k;
    public final m2.h f36207l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f36208m;
    public final int[] f36209n;
    public final int f36210o;
    public final xn f36211p;

    public di(xn xnVar, int i10, SparseArray sparseArray, boolean z4, List list, MessageObject messageObject, org.telegram.ui.Components.pj0 pj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, m2.h hVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f36211p = xnVar;
        this.f36200c = i10;
        this.d = sparseArray;
        this.f36201e = z4;
        this.f36202f = list;
        this.f36203g = messageObject;
        this.h = pj0Var;
        this.f36204i = messageObject2;
        this.f36205j = sparseIntArray;
        this.f36206k = i11;
        this.f36207l = hVar;
        this.f36208m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f36209n = iArr;
        this.f36210o = i12;
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f36200c;
    }

    @Override
    public final Object e(m2.h hVar, int i10) {
        int i11;
        TLRPC.ReactionCount reactionCount;
        int i12;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            hVar.addView(view);
            return view;
        }
        if (this.f36201e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f36202f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = hVar.getContext();
        xn xnVar = this.f36211p;
        vn vnVar = xnVar.f43114ba;
        i12 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        org.telegram.ui.Components.zj0 zj0Var = new org.telegram.ui.Components.zj0(context, vnVar, i12, this.f36203g, reactionCount2, true);
        org.telegram.ui.Components.pj0 pj0Var = this.h;
        zj0Var.h(pj0Var.getSeenUsers());
        zj0Var.D = new a1(this, 16);
        zj0Var.B = new ng.w(17, this, this.f36204i);
        zj0Var.f33959y = new hg.d(this.f36205j, i10, this.f36206k, this.f36207l, this.f36208m, this.f36209n);
        if (i11 < 0) {
            zj0Var.setPredictiveCount(this.f36210o);
            pj0Var.setSeenCallback(new j3(zj0Var, 1));
        }
        hVar.addView(zj0Var);
        sparseArray.put(i10, zj0Var);
        return zj0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
