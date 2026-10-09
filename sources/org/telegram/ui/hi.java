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
    public final int f38337c;
    public final SparseArray d;
    public final boolean f38338e;
    public final List f38339f;
    public final MessageObject f38340g;
    public final org.telegram.ui.Components.kk0 h;
    public final MessageObject f38341i;
    public final SparseIntArray f38342j;
    public final int f38343k;
    public final z4.g f38344l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38345m;
    public final int[] f38346n;
    public final int f38347o;
    public final zn f38348p;

    public hi(zn znVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.kk0 kk0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f38348p = znVar;
        this.f38337c = i10;
        this.d = sparseArray;
        this.f38338e = z10;
        this.f38339f = list;
        this.f38340g = messageObject;
        this.h = kk0Var;
        this.f38341i = messageObject2;
        this.f38342j = sparseIntArray;
        this.f38343k = i11;
        this.f38344l = gVar;
        this.f38345m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f38346n = iArr;
        this.f38347o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f38337c;
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
        if (this.f38338e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f38339f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        zn znVar = this.f38348p;
        xn xnVar = znVar.f44761ea;
        i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, xnVar, i12, this.f38340g, reactionCount2, true);
        org.telegram.ui.Components.kk0 kk0Var = this.h;
        uk0Var.h(kk0Var.getSeenUsers());
        uk0Var.G = new z0(this, 16);
        uk0Var.E = new o(11, this, this.f38341i);
        uk0Var.f31531y = new ei.t4(this.f38342j, i10, this.f38343k, this.f38344l, this.f38345m, this.f38346n);
        if (i11 < 0) {
            uk0Var.setPredictiveCount(this.f38347o);
            kk0Var.setSeenCallback(new h3(uk0Var, 1));
        }
        gVar.addView(uk0Var);
        sparseArray.put(i10, uk0Var);
        return uk0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
