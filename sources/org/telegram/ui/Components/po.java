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
public final class po extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.f6 f29444a;
    public final ImageView f29445b;
    public final org.telegram.ui.ActionBar.j5 f29446c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final org.telegram.ui.ActionBar.j5 f29447e;
    public final org.telegram.ui.ml f29448f;
    public boolean h;
    public boolean f29449n;

    public po(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f29444a = f6Var;
        ImageView imageView = new ImageView(context);
        this.f29445b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.e(52, 46, 51));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f29446c = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTypeface(AndroidUtilities.bold());
        addView(j5Var, w7.x5.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var2;
        j5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(j5Var2);
        addView(j5Var2, w7.x5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
        this.f29447e = j5Var3;
        j5Var3.setTextSize(14);
        j5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        j5Var3.setAlpha(0.0f);
        addView(j5Var3, w7.x5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ml mlVar = new org.telegram.ui.ml(this, context, new wh.h());
        this.f29448f = mlVar;
        mlVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(mlVar, w7.x5.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.j6.f20961te;
        org.telegram.ui.ActionBar.f6 f6Var = this.f29444a;
        this.f29445b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        this.f29446c.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20997ve, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.Xk;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        j5Var.setTextColor(v02);
        j5Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        this.f29447e.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f29449n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int[] getColorKeys() {
        return null;
    }
}
