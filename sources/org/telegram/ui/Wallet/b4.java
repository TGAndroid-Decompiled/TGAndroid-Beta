package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c91;
public final class b4 extends c91 {
    public final ArrayList f32957a;
    public final Context f32958b;
    public final org.telegram.ui.ActionBar.c6 f32959c;
    public final Rect d;
    public final int e;
    public final i2[] f32960f;

    public b4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.c6 c6Var, Rect rect, int i10, i2[] i2VarArr) {
        this.f32957a = arrayList;
        this.f32958b = context;
        this.f32959c = c6Var;
        this.d = rect;
        this.e = i10;
        this.f32960f = i2VarArr;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        org.telegram.ui.ActionBar.c6 c6Var = this.f32959c;
        i2[] i2VarArr = this.f32960f;
        frameLayout.addView(z4.i0(this.f32958b, this.e, (TL_wallet.walletTransaction) this.f32957a.get(i10), null, null, null, null, c6Var, i2VarArr), w7.a6.d(-2.0f, -1));
    }

    @Override
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.f32958b);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(20.0f), 0, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, this.f32959c));
        Rect rect = this.d;
        frameLayout.setBackground(new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0));
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f32957a.size();
    }
}
