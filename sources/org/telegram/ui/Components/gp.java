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
public final class gp extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f26826a;
    public final ImageView f26827b;
    public final org.telegram.ui.ActionBar.j5 f26828c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final org.telegram.ui.ActionBar.j5 f26829e;
    public final org.telegram.ui.nl f26830f;
    public boolean h;
    public boolean f26831n;

    public gp(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f26826a = e6Var;
        ImageView imageView = new ImageView(context);
        this.f26827b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.e(52, 46, 51));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f26828c = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTypeface(AndroidUtilities.bold());
        addView(j5Var, w7.x5.a(18.0f, 52.0f, 6.0f, 0.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var2;
        j5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(j5Var2);
        addView(j5Var2, w7.x5.a(18.0f, 52.0f, 24.0f, 0.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
        this.f26829e = j5Var3;
        j5Var3.setTextSize(14);
        j5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        j5Var3.setAlpha(0.0f);
        addView(j5Var3, w7.x5.a(18.0f, 52.0f, 24.0f, 0.0f, 0.0f, -1, 51));
        org.telegram.ui.nl nlVar = new org.telegram.ui.nl(this, context, new vh.g());
        this.f26830f = nlVar;
        nlVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(nlVar, w7.x5.a(34.0f, 52.0f, 6.0f, 0.0f, 0.0f, 34, 51));
        e();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f26831n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.f21099te;
        org.telegram.ui.ActionBar.e6 e6Var = this.f26826a;
        this.f26827b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
        this.f26828c.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21135ve, e6Var));
        int i11 = org.telegram.ui.ActionBar.i6.Xk;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        j5Var.setTextColor(w02);
        j5Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        this.f26829e.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
