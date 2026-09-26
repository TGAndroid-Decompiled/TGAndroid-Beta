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
    public final int f33413c;
    public final SparseArray d;
    public final boolean e;
    public final List f33414f;
    public final MessageObject f33415g;
    public final org.telegram.ui.Components.rj0 h;
    public final MessageObject f33416i;
    public final SparseIntArray f33417j;
    public final int f33418k;
    public final z4.g f33419l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f33420m;
    public final int[] f33421n;
    public final int f33422o;
    public final wn f33423p;

    public ei(wn wnVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.rj0 rj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f33423p = wnVar;
        this.f33413c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f33414f = list;
        this.f33415g = messageObject;
        this.h = rj0Var;
        this.f33416i = messageObject2;
        this.f33417j = sparseIntArray;
        this.f33418k = i11;
        this.f33419l = gVar;
        this.f33420m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f33421n = iArr;
        this.f33422o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f33413c;
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
            reactionCount = (TLRPC.ReactionCount) this.f33414f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        wn wnVar = this.f33423p;
        un unVar = wnVar.f39468ea;
        i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context, unVar, i12, this.f33415g, reactionCount2, true);
        org.telegram.ui.Components.rj0 rj0Var = this.h;
        bk0Var.h(rj0Var.getSeenUsers());
        bk0Var.G = new z0(this, 16);
        bk0Var.E = new o(11, this, this.f33416i);
        bk0Var.f23055y = new ei.u4(this.f33417j, i10, this.f33418k, this.f33419l, this.f33420m, this.f33421n);
        if (i11 < 0) {
            bk0Var.setPredictiveCount(this.f33422o);
            rj0Var.setSeenCallback(new h3(bk0Var, 1));
        }
        gVar.addView(bk0Var);
        sparseArray.put(i10, bk0Var);
        return bk0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
