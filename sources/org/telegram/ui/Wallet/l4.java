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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.m91;
public final class l4 extends m91 {
    public final ArrayList f36836a;
    public final Context f36837b;
    public final org.telegram.ui.ActionBar.u6 f36838c;
    public final Rect d;
    public final int e;
    public final j2[] f36839f;

    public l4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.u6 u6Var, Rect rect, int i10, j2[] j2VarArr) {
        this.f36836a = arrayList;
        this.f36837b = context;
        this.f36838c = u6Var;
        this.d = rect;
        this.e = i10;
        this.f36839f = j2VarArr;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        j2[] j2VarArr = this.f36839f;
        frameLayout.addView(m5.p0(this.f36837b, this.e, (TL_wallet.walletTransaction) this.f36836a.get(i10), null, null, null, null, this.f36838c, j2VarArr, true), gb1.g(-2.0f, -1));
    }

    @Override
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.f36837b);
        int dp = AndroidUtilities.dp(20.0f);
        int i11 = org.telegram.ui.ActionBar.y6.f23354d6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f36838c;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.y6.d0(dp, 0, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        Rect rect = this.d;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        frameLayout.setBackground(insetDrawable);
        org.telegram.ui.ActionBar.f7.k(frameLayout, insetDrawable, N, null, u6Var);
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f36836a.size();
    }
}
