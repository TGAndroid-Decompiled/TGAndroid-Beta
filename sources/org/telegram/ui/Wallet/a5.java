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
public final class a5 extends m61 {
    public final ArrayList f42101a;
    public final Context f42102b;
    public final org.telegram.ui.ActionBar.h6 f42103c;
    public final Rect d;
    public final int f42104e;
    public final y2[] f42105f;

    public a5(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.h6 h6Var, Rect rect, int i7, y2[] y2VarArr) {
        this.f42101a = arrayList;
        this.f42102b = context;
        this.f42103c = h6Var;
        this.d = rect;
        this.f42104e = i7;
        this.f42105f = y2VarArr;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        y2[] y2VarArr = this.f42105f;
        frameLayout.addView(z5.t0(this.f42102b, this.f42104e, (TL_wallet.walletTransaction) this.f42101a.get(i7), null, null, null, null, this.f42103c, y2VarArr, true), c8.ha.c(-2.0f, -1));
    }

    @Override
    public final View d(int i7) {
        FrameLayout frameLayout = new FrameLayout(this.f42102b);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i10 = org.telegram.ui.ActionBar.m6.f27890d6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f42103c;
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
        return this.f42101a.size();
    }
}
