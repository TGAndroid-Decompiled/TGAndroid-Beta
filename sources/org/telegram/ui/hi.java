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
    public final int f38339c;
    public final SparseArray d;
    public final boolean f38340e;
    public final List f38341f;
    public final MessageObject f38342g;
    public final org.telegram.ui.Components.kk0 h;
    public final MessageObject f38343i;
    public final SparseIntArray f38344j;
    public final int f38345k;
    public final z4.g f38346l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38347m;
    public final int[] f38348n;
    public final int f38349o;
    public final zn f38350p;

    public hi(zn znVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.kk0 kk0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f38350p = znVar;
        this.f38339c = i10;
        this.d = sparseArray;
        this.f38340e = z10;
        this.f38341f = list;
        this.f38342g = messageObject;
        this.h = kk0Var;
        this.f38343i = messageObject2;
        this.f38344j = sparseIntArray;
        this.f38345k = i11;
        this.f38346l = gVar;
        this.f38347m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f38348n = iArr;
        this.f38349o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f38339c;
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
        if (this.f38340e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f38341f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        zn znVar = this.f38350p;
        xn xnVar = znVar.f44763ea;
        i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, xnVar, i12, this.f38342g, reactionCount2, true);
        org.telegram.ui.Components.kk0 kk0Var = this.h;
        uk0Var.h(kk0Var.getSeenUsers());
        uk0Var.G = new z0(this, 16);
        uk0Var.E = new o(11, this, this.f38343i);
        uk0Var.f31531y = new ei.t4(this.f38344j, i10, this.f38345k, this.f38346l, this.f38347m, this.f38348n);
        if (i11 < 0) {
            uk0Var.setPredictiveCount(this.f38349o);
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
