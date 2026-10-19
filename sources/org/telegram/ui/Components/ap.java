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
public final class ap extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f24664a;
    public final ImageView f24665b;
    public final org.telegram.ui.ActionBar.j5 f24666c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final org.telegram.ui.el f24667f;
    public boolean h;
    public boolean f24668n;

    public ap(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24664a = d6Var;
        ImageView imageView = new ImageView(context);
        this.f24665b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.e(52, 46, 51));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f24666c = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTypeface(AndroidUtilities.bold());
        addView(j5Var, w7.z5.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var2;
        j5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(j5Var2);
        addView(j5Var2, w7.z5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var3;
        j5Var3.setTextSize(14);
        j5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        j5Var3.setAlpha(0.0f);
        addView(j5Var3, w7.z5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.el elVar = new org.telegram.ui.el(this, context, new wh.g());
        this.f24667f = elVar;
        elVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(elVar, w7.z5.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.h6.f21291te;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24664a;
        this.f24665b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        this.f24666c.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21328ve, d6Var));
        int i11 = org.telegram.ui.ActionBar.h6.Xk;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        j5Var.setTextColor(w02);
        j5Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21046gc, d6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f24668n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int[] getColorKeys() {
        return null;
    }
}
