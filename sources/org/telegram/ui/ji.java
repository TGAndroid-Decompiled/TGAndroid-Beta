package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ji extends z4.a {
    public final int f34107c;
    public final SparseArray d;
    public final boolean e;
    public final List f34108f;
    public final MessageObject f34109g;
    public final org.telegram.ui.Components.pj0 h;
    public final MessageObject f34110i;
    public final SparseIntArray f34111j;
    public final int f34112k;
    public final z4.g f34113l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f34114m;
    public final int[] f34115n;
    public final int f34116o;
    public final eo f34117p;

    public ji(eo eoVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.pj0 pj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f34117p = eoVar;
        this.f34107c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f34108f = list;
        this.f34109g = messageObject;
        this.h = pj0Var;
        this.f34110i = messageObject2;
        this.f34111j = sparseIntArray;
        this.f34112k = i11;
        this.f34113l = gVar;
        this.f34114m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f34115n = iArr;
        this.f34116o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f34107c;
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
            reactionCount = (TLRPC.ReactionCount) this.f34108f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        eo eoVar = this.f34117p;
        bo boVar = eoVar.f32316ea;
        i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
        org.telegram.ui.Components.zj0 zj0Var = new org.telegram.ui.Components.zj0(context, boVar, i12, this.f34109g, reactionCount2, true);
        org.telegram.ui.Components.pj0 pj0Var = this.h;
        zj0Var.h(pj0Var.getSeenUsers());
        zj0Var.G = new a1(this, 16);
        zj0Var.E = new oe(4, this, this.f34110i);
        zj0Var.f29710y = new di.y4(this.f34111j, i10, this.f34112k, this.f34113l, this.f34114m, this.f34115n);
        if (i11 < 0) {
            zj0Var.setPredictiveCount(this.f34116o);
            pj0Var.setSeenCallback(new i3(zj0Var, 1));
        }
        gVar.addView(zj0Var);
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
