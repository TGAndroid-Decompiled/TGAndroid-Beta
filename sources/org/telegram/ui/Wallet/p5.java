package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c71;
public final class p5 extends c71 {
    public final ArrayList f44874a;
    public final Context f44875b;
    public final org.telegram.ui.ActionBar.i6 f44876c;
    public final Rect d;
    public final int f44877e;
    public final f3[] f44878f;

    public p5(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.i6 i6Var, Rect rect, int i7, f3[] f3VarArr) {
        this.f44874a = arrayList;
        this.f44875b = context;
        this.f44876c = i6Var;
        this.d = rect;
        this.f44877e = i7;
        this.f44878f = f3VarArr;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        f3[] f3VarArr = this.f44878f;
        frameLayout.addView(o6.u0(this.f44875b, this.f44877e, (TL_wallet.walletTransaction) this.f44874a.get(i7), null, null, null, null, this.f44876c, f3VarArr, true), c8.na.c(-2.0f, -1));
    }

    @Override
    public final View d(int i7) {
        FrameLayout frameLayout = new FrameLayout(this.f44875b);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.n6.f29451d6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f44876c;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.n6.e0(L, 0, org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) e02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.u6.j(frameLayout, insetDrawable, M, null, i6Var);
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f44874a.size();
    }
}
