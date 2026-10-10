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
    public final int f38383c;
    public final SparseArray d;
    public final boolean f38384e;
    public final List f38385f;
    public final MessageObject f38386g;
    public final org.telegram.ui.Components.lk0 h;
    public final MessageObject f38387i;
    public final SparseIntArray f38388j;
    public final int f38389k;
    public final z4.g f38390l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38391m;
    public final int[] f38392n;
    public final int f38393o;
    public final zn f38394p;

    public hi(zn znVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.lk0 lk0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f38394p = znVar;
        this.f38383c = i10;
        this.d = sparseArray;
        this.f38384e = z10;
        this.f38385f = list;
        this.f38386g = messageObject;
        this.h = lk0Var;
        this.f38387i = messageObject2;
        this.f38388j = sparseIntArray;
        this.f38389k = i11;
        this.f38390l = gVar;
        this.f38391m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f38392n = iArr;
        this.f38393o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f38383c;
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
        if (this.f38384e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f38385f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        zn znVar = this.f38394p;
        xn xnVar = znVar.f44807ea;
        i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        org.telegram.ui.Components.vk0 vk0Var = new org.telegram.ui.Components.vk0(context, xnVar, i12, this.f38386g, reactionCount2, true);
        org.telegram.ui.Components.lk0 lk0Var = this.h;
        vk0Var.h(lk0Var.getSeenUsers());
        vk0Var.G = new z0(this, 16);
        vk0Var.E = new o(11, this, this.f38387i);
        vk0Var.f31880y = new ei.t4(this.f38388j, i10, this.f38389k, this.f38390l, this.f38391m, this.f38392n);
        if (i11 < 0) {
            vk0Var.setPredictiveCount(this.f38393o);
            lk0Var.setSeenCallback(new h3(vk0Var, 1));
        }
        gVar.addView(vk0Var);
        sparseArray.put(i10, vk0Var);
        return vk0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
