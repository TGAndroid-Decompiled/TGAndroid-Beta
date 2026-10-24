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
import org.telegram.ui.Components.d91;
public final class n4 extends d91 {
    public final ArrayList f34902a;
    public final Context f34903b;
    public final org.telegram.ui.ActionBar.g6 f34904c;
    public final Rect d;
    public final int e;
    public final j2[] f34905f;

    public n4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.g6 g6Var, Rect rect, int i10, j2[] j2VarArr) {
        this.f34902a = arrayList;
        this.f34903b = context;
        this.f34904c = g6Var;
        this.d = rect;
        this.e = i10;
        this.f34905f = j2VarArr;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        j2[] j2VarArr = this.f34905f;
        frameLayout.addView(o5.o0(this.f34903b, this.e, (TL_wallet.walletTransaction) this.f34902a.get(i10), null, null, null, null, this.f34904c, j2VarArr, true), w7.z5.c(-2.0f, -1));
    }

    @Override
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.f34903b);
        int dp = AndroidUtilities.dp(20.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f21184d6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f34904c;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(dp, 0, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.r6.k(frameLayout, insetDrawable, O, null, g6Var);
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f34902a.size();
    }
}
