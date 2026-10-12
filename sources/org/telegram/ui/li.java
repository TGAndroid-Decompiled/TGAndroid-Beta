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
    public final int f39756c;
    public final SparseArray d;
    public final boolean f39757e;
    public final List f39758f;
    public final MessageObject f39759g;
    public final org.telegram.ui.Components.nk0 h;
    public final MessageObject f39760i;
    public final SparseIntArray f39761j;
    public final int f39762k;
    public final z4.g f39763l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f39764m;
    public final int[] f39765n;
    public final int f39766o;
    public final eo f39767p;

    public li(eo eoVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.nk0 nk0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f39767p = eoVar;
        this.f39756c = i10;
        this.d = sparseArray;
        this.f39757e = z10;
        this.f39758f = list;
        this.f39759g = messageObject;
        this.h = nk0Var;
        this.f39760i = messageObject2;
        this.f39761j = sparseIntArray;
        this.f39762k = i11;
        this.f39763l = gVar;
        this.f39764m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f39765n = iArr;
        this.f39766o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f39756c;
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
        if (this.f39757e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f39758f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        eo eoVar = this.f39767p;
        bo boVar = eoVar.f37256ea;
        i12 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
        org.telegram.ui.Components.xk0 xk0Var = new org.telegram.ui.Components.xk0(context, boVar, i12, this.f39759g, reactionCount2, true);
        org.telegram.ui.Components.nk0 nk0Var = this.h;
        xk0Var.h(nk0Var.getSeenUsers());
        xk0Var.G = new z0(this, 16);
        xk0Var.E = new o(11, this, this.f39760i);
        xk0Var.f32794y = new ei.t4(this.f39761j, i10, this.f39762k, this.f39763l, this.f39764m, this.f39765n);
        if (i11 < 0) {
            xk0Var.setPredictiveCount(this.f39766o);
            nk0Var.setSeenCallback(new h3(xk0Var, 1));
        }
        gVar.addView(xk0Var);
        sparseArray.put(i10, xk0Var);
        return xk0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
