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
public final class to extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f31101a;
    public final ImageView f31102b;
    public final org.telegram.ui.ActionBar.i5 f31103c;
    public final org.telegram.ui.ActionBar.i5 d;
    public final org.telegram.ui.ActionBar.i5 f31104e;
    public final org.telegram.ui.il f31105f;
    public boolean h;
    public boolean f31106n;

    public to(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f31101a = d6Var;
        ImageView imageView = new ImageView(context);
        this.f31102b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.e(52, 46, 51));
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f31103c = i5Var;
        i5Var.setTextSize(14);
        i5Var.setTypeface(AndroidUtilities.bold());
        addView(i5Var, w7.z5.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.i5 i5Var2 = new org.telegram.ui.ActionBar.i5(context);
        this.d = i5Var2;
        i5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(i5Var2);
        addView(i5Var2, w7.z5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.i5 i5Var3 = new org.telegram.ui.ActionBar.i5(context);
        this.f31104e = i5Var3;
        i5Var3.setTextSize(14);
        i5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        i5Var3.setAlpha(0.0f);
        addView(i5Var3, w7.z5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, context, new vh.g());
        this.f31105f = ilVar;
        ilVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(ilVar, w7.z5.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        e();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f31106n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.f21123te;
        org.telegram.ui.ActionBar.d6 d6Var = this.f31101a;
        this.f31102b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        this.f31103c.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21159ve, d6Var));
        int i11 = org.telegram.ui.ActionBar.i6.Xk;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i11, d6Var);
        org.telegram.ui.ActionBar.i5 i5Var = this.d;
        i5Var.setTextColor(v02);
        i5Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var));
        this.f31104e.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
