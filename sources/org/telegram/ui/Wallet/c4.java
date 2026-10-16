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
public final class c4 extends d91 {
    public final ArrayList f32733a;
    public final Context f32734b;
    public final org.telegram.ui.ActionBar.c6 f32735c;
    public final Rect d;
    public final int e;
    public final j2[] f32736f;

    public c4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.c6 c6Var, Rect rect, int i10, j2[] j2VarArr) {
        this.f32733a = arrayList;
        this.f32734b = context;
        this.f32735c = c6Var;
        this.d = rect;
        this.e = i10;
        this.f32736f = j2VarArr;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        org.telegram.ui.ActionBar.c6 c6Var = this.f32735c;
        j2[] j2VarArr = this.f32736f;
        frameLayout.addView(a5.i0(this.f32734b, this.e, (TL_wallet.walletTransaction) this.f32733a.get(i10), null, null, null, null, c6Var, j2VarArr), w7.z5.d(-2.0f, -1));
    }

    @Override
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.f32734b);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(20.0f), 0, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, this.f32735c));
        Rect rect = this.d;
        frameLayout.setBackground(new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0));
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f32733a.size();
    }
}
