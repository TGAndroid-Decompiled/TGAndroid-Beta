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
import org.telegram.ui.Components.n61;
public final class z4 extends n61 {
    public final ArrayList f44798a;
    public final Context f44799b;
    public final org.telegram.ui.ActionBar.e6 f44800c;
    public final Rect d;
    public final int f44801e;
    public final x2[] f44802f;

    public z4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.e6 e6Var, Rect rect, int i7, x2[] x2VarArr) {
        this.f44798a = arrayList;
        this.f44799b = context;
        this.f44800c = e6Var;
        this.d = rect;
        this.f44801e = i7;
        this.f44802f = x2VarArr;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        x2[] x2VarArr = this.f44802f;
        frameLayout.addView(y5.t0(this.f44799b, this.f44801e, (TL_wallet.walletTransaction) this.f44798a.get(i7), null, null, null, null, this.f44800c, x2VarArr, true), c8.ja.c(-2.0f, -1));
    }

    @Override
    public final View d(int i7) {
        FrameLayout frameLayout = new FrameLayout(this.f44799b);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f44800c;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.j6.e0(L, 0, org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) e02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.q6.j(frameLayout, insetDrawable, M, null, e6Var);
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f44798a.size();
    }
}
