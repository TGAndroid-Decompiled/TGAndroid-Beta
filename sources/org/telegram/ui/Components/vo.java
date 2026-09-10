package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class vo extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f28033a;
    public final ImageView f28034b;
    public final org.telegram.ui.ActionBar.l5 f28035c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final org.telegram.ui.ActionBar.l5 e;
    public final org.telegram.ui.ol f28036f;
    public boolean h;
    public boolean f28037n;

    public vo(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f28033a = f6Var;
        ImageView imageView = new ImageView(context);
        this.f28034b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.a6.e(52, 46, 51));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f28035c = l5Var;
        l5Var.setTextSize(14);
        l5Var.setTypeface(AndroidUtilities.bold());
        addView(l5Var, w7.a6.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var2;
        l5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(l5Var2);
        addView(l5Var2, w7.a6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var3 = new org.telegram.ui.ActionBar.l5(context);
        this.e = l5Var3;
        l5Var3.setTextSize(14);
        l5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        l5Var3.setAlpha(0.0f);
        addView(l5Var3, w7.a6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ol olVar = new org.telegram.ui.ol(this, context, new uh.h());
        this.f28036f = olVar;
        olVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(olVar, w7.a6.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        e();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f28037n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.f18225te;
        org.telegram.ui.ActionBar.f6 f6Var = this.f28033a;
        this.f28034b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        this.f28035c.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18261ve, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.Xk;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        l5Var.setTextColor(v02);
        l5Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
