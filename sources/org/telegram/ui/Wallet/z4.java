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
import org.telegram.ui.Components.m61;
public final class z4 extends m61 {
    public final ArrayList f43419a;
    public final Context f43420b;
    public final org.telegram.ui.ActionBar.f6 f43421c;
    public final Rect d;
    public final int f43422e;
    public final a3[] f43423f;

    public z4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.f6 f6Var, Rect rect, int i7, a3[] a3VarArr) {
        this.f43419a = arrayList;
        this.f43420b = context;
        this.f43421c = f6Var;
        this.d = rect;
        this.f43422e = i7;
        this.f43423f = a3VarArr;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        a3[] a3VarArr = this.f43423f;
        frameLayout.addView(y5.t0(this.f43420b, this.f43422e, (TL_wallet.walletTransaction) this.f43419a.get(i7), null, null, null, null, this.f43421c, a3VarArr, true), c8.ha.c(-2.0f, -1));
    }

    @Override
    public final View d(int i7) {
        FrameLayout frameLayout = new FrameLayout(this.f43420b);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f27849d6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f43421c;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.k6.e0(L, 0, org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) e02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.r6.k(frameLayout, insetDrawable, N, null, f6Var);
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f43419a.size();
    }
}
