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
import org.telegram.ui.Components.l91;
public final class d4 extends l91 {
    public final ArrayList f34617a;
    public final Context f34618b;
    public final org.telegram.ui.ActionBar.c6 f34619c;
    public final Rect d;
    public final int f34620e;
    public final k2[] f34621f;

    public d4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.c6 c6Var, Rect rect, int i10, k2[] k2VarArr) {
        this.f34617a = arrayList;
        this.f34618b = context;
        this.f34619c = c6Var;
        this.d = rect;
        this.f34620e = i10;
        this.f34621f = k2VarArr;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        org.telegram.ui.ActionBar.c6 c6Var = this.f34619c;
        k2[] k2VarArr = this.f34621f;
        frameLayout.addView(c5.i0(this.f34618b, this.f34620e, (TL_wallet.walletTransaction) this.f34617a.get(i10), null, null, null, null, c6Var, k2VarArr), w7.w5.d(-2.0f, -1));
    }

    @Override
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.f34618b);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(20.0f), 0, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, this.f34619c));
        Rect rect = this.d;
        frameLayout.setBackground(new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0));
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f34617a.size();
    }
}
