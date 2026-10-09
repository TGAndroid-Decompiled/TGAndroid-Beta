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
import org.telegram.ui.Components.f91;
public final class b4 extends f91 {
    public final ArrayList f34677a;
    public final Context f34678b;
    public final org.telegram.ui.ActionBar.e6 f34679c;
    public final Rect d;
    public final int f34680e;
    public final i2[] f34681f;

    public b4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.e6 e6Var, Rect rect, int i10, i2[] i2VarArr) {
        this.f34677a = arrayList;
        this.f34678b = context;
        this.f34679c = e6Var;
        this.d = rect;
        this.f34680e = i10;
        this.f34681f = i2VarArr;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        org.telegram.ui.ActionBar.e6 e6Var = this.f34679c;
        i2[] i2VarArr = this.f34681f;
        frameLayout.addView(a5.i0(this.f34678b, this.f34680e, (TL_wallet.walletTransaction) this.f34677a.get(i10), null, null, null, null, e6Var, i2VarArr), w7.x5.d(-2.0f, -1));
    }

    @Override
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.f34678b);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.i6.d0(AndroidUtilities.dp(20.0f), 0, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, this.f34679c));
        Rect rect = this.d;
        frameLayout.setBackground(new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0));
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f34677a.size();
    }
}
