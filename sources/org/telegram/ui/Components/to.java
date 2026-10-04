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
    public final org.telegram.ui.ActionBar.d6 f31102a;
    public final ImageView f31103b;
    public final org.telegram.ui.ActionBar.i5 f31104c;
    public final org.telegram.ui.ActionBar.i5 d;
    public final org.telegram.ui.ActionBar.i5 f31105e;
    public final org.telegram.ui.il f31106f;
    public boolean h;
    public boolean f31107n;

    public to(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f31102a = d6Var;
        ImageView imageView = new ImageView(context);
        this.f31103b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.e(52, 46, 51));
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.f31104c = i5Var;
        i5Var.setTextSize(14);
        i5Var.setTypeface(AndroidUtilities.bold());
        addView(i5Var, w7.z5.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.i5 i5Var2 = new org.telegram.ui.ActionBar.i5(context);
        this.d = i5Var2;
        i5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(i5Var2);
        addView(i5Var2, w7.z5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.i5 i5Var3 = new org.telegram.ui.ActionBar.i5(context);
        this.f31105e = i5Var3;
        i5Var3.setTextSize(14);
        i5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        i5Var3.setAlpha(0.0f);
        addView(i5Var3, w7.z5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, context, new vh.g());
        this.f31106f = ilVar;
        ilVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(ilVar, w7.z5.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        e();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f31107n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.f21124te;
        org.telegram.ui.ActionBar.d6 d6Var = this.f31102a;
        this.f31103b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        this.f31104c.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21160ve, d6Var));
        int i11 = org.telegram.ui.ActionBar.i6.Xk;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i11, d6Var);
        org.telegram.ui.ActionBar.i5 i5Var = this.d;
        i5Var.setTextColor(v02);
        i5Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var));
        this.f31105e.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
