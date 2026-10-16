package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class li extends z4.a {
    public final int f37755c;
    public final SparseArray d;
    public final boolean e;
    public final List f37756f;
    public final MessageObject f37757g;
    public final org.telegram.ui.Components.gk0 h;
    public final MessageObject f37758i;
    public final SparseIntArray f37759j;
    public final int f37760k;
    public final z4.g f37761l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37762m;
    public final int[] f37763n;
    public final int f37764o;
    public final fo f37765p;

    public li(fo foVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.gk0 gk0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f37765p = foVar;
        this.f37755c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f37756f = list;
        this.f37757g = messageObject;
        this.h = gk0Var;
        this.f37758i = messageObject2;
        this.f37759j = sparseIntArray;
        this.f37760k = i11;
        this.f37761l = gVar;
        this.f37762m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f37763n = iArr;
        this.f37764o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f37755c;
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
            reactionCount = (TLRPC.ReactionCount) this.f37756f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        fo foVar = this.f37765p;
        co coVar = foVar.f35633ea;
        i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
        org.telegram.ui.Components.qk0 qk0Var = new org.telegram.ui.Components.qk0(context, coVar, i12, this.f37757g, reactionCount2, true);
        org.telegram.ui.Components.gk0 gk0Var = this.h;
        qk0Var.h(gk0Var.getSeenUsers());
        qk0Var.G = new b1(this, 16);
        qk0Var.E = new m4.y0(13, this, this.f37758i);
        qk0Var.f28319y = new fi.u4(this.f37759j, i10, this.f37760k, this.f37761l, this.f37762m, this.f37763n);
        if (i11 < 0) {
            qk0Var.setPredictiveCount(this.f37764o);
            gk0Var.setSeenCallback(new j3(qk0Var, 1));
        }
        gVar.addView(qk0Var);
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
