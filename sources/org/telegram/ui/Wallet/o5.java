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
import org.telegram.ui.Components.b71;
public final class o5 extends b71 {
    public final ArrayList f44712a;
    public final Context f44713b;
    public final org.telegram.ui.ActionBar.h6 f44714c;
    public final Rect d;
    public final int f44715e;
    public final e3[] f44716f;

    public o5(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.h6 h6Var, Rect rect, int i7, e3[] e3VarArr) {
        this.f44712a = arrayList;
        this.f44713b = context;
        this.f44714c = h6Var;
        this.d = rect;
        this.f44715e = i7;
        this.f44716f = e3VarArr;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        e3[] e3VarArr = this.f44716f;
        frameLayout.addView(n6.u0(this.f44713b, this.f44715e, (TL_wallet.walletTransaction) this.f44712a.get(i7), null, null, null, null, this.f44714c, e3VarArr, true), c8.na.c(-2.0f, -1));
    }

    @Override
    public final View d(int i7) {
        FrameLayout frameLayout = new FrameLayout(this.f44713b);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.m6.f29347d6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f44714c;
        ShapeDrawable e02 = org.telegram.ui.ActionBar.m6.e0(L, 0, org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) e02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.t6.j(frameLayout, insetDrawable, M, null, h6Var);
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f44712a.size();
    }
}
