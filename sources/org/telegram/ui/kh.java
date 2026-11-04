package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class kh extends b5.a {
    public final int f46936c;
    public final SparseArray d;
    public final boolean f46937e;
    public final List f46938f;
    public final org.telegram.messenger.zi f46939g;
    public final org.telegram.ui.Components.kh0 h;
    public final org.telegram.messenger.zi f46940i;
    public final SparseIntArray f46941j;
    public final int f46942k;
    public final b5.l f46943l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f46944m;
    public final int[] f46945n;
    public final int f46946o;
    public final wm f46947p;

    public kh(wm wmVar, int i3, SparseArray sparseArray, boolean z10, List list, org.telegram.messenger.zi ziVar, org.telegram.ui.Components.kh0 kh0Var, org.telegram.messenger.zi ziVar2, SparseIntArray sparseIntArray, int i10, b5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.f46947p = wmVar;
        this.f46936c = i3;
        this.d = sparseArray;
        this.f46937e = z10;
        this.f46938f = list;
        this.f46939g = ziVar;
        this.h = kh0Var;
        this.f46940i = ziVar2;
        this.f46941j = sparseIntArray;
        this.f46942k = i10;
        this.f46943l = lVar;
        this.f46944m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f46945n = iArr;
        this.f46946o = i11;
    }

    @Override
    public final void a(b5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f46936c;
    }

    @Override
    public final Object e(b5.l lVar, int i3) {
        int i10;
        TLRPC.ReactionCount reactionCount;
        int i11;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i3);
        if (view != null) {
            lVar.addView(view);
            return view;
        }
        if (this.f46937e) {
            i10 = i3 - 1;
        } else {
            i10 = i3;
        }
        if (i10 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f46938f.get(i10);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = lVar.getContext();
        wm wmVar = this.f46947p;
        um umVar = wmVar.f51557ya;
        i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
        org.telegram.ui.Components.uh0 uh0Var = new org.telegram.ui.Components.uh0(context, umVar, i11, this.f46939g, reactionCount2, true);
        org.telegram.ui.Components.kh0 kh0Var = this.h;
        uh0Var.h(kh0Var.getSeenUsers());
        uh0Var.H = new x0(this, 18);
        uh0Var.F = new mi.d4(23, this, this.f46940i);
        uh0Var.E = new ii.g4(this.f46941j, i3, this.f46942k, this.f46943l, this.f46944m, this.f46945n);
        if (i10 < 0) {
            uh0Var.setPredictiveCount(this.f46946o);
            kh0Var.setSeenCallback(new g3(uh0Var, 1));
        }
        lVar.addView(uh0Var);
        sparseArray.put(i3, uh0Var);
        return uh0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
