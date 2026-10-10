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
import org.telegram.ui.Components.g91;
public final class c4 extends g91 {
    public final ArrayList f34777a;
    public final Context f34778b;
    public final org.telegram.ui.ActionBar.e6 f34779c;
    public final Rect d;
    public final int f34780e;
    public final j2[] f34781f;

    public c4(ArrayList arrayList, Context context, org.telegram.ui.ActionBar.e6 e6Var, Rect rect, int i10, j2[] j2VarArr) {
        this.f34777a = arrayList;
        this.f34778b = context;
        this.f34779c = e6Var;
        this.d = rect;
        this.f34780e = i10;
        this.f34781f = j2VarArr;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        org.telegram.ui.ActionBar.e6 e6Var = this.f34779c;
        j2[] j2VarArr = this.f34781f;
        frameLayout.addView(b5.i0(this.f34778b, this.f34780e, (TL_wallet.walletTransaction) this.f34777a.get(i10), null, null, null, null, e6Var, j2VarArr), w7.x5.d(-2.0f, -1));
    }

    @Override
    public final View d(int i10) {
        FrameLayout frameLayout = new FrameLayout(this.f34778b);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.i6.d0(AndroidUtilities.dp(20.0f), 0, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, this.f34779c));
        Rect rect = this.d;
        frameLayout.setBackground(new InsetDrawable((Drawable) d02, rect.left, 0, rect.right, 0));
        return frameLayout;
    }

    @Override
    public final int e() {
        return this.f34777a.size();
    }
}
