package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ap extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f24793a;
    public final ImageView f24794b;
    public final org.telegram.ui.ActionBar.n5 f24795c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final org.telegram.ui.ActionBar.n5 e;
    public final org.telegram.ui.fl f24796f;
    public boolean h;
    public boolean f24797n;

    public ap(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f24793a = g6Var;
        ImageView imageView = new ImageView(context);
        this.f24794b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.e(52, 46, 51));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f24795c = n5Var;
        n5Var.setTextSize(14);
        n5Var.setTypeface(AndroidUtilities.bold());
        addView(n5Var, w7.z5.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var2;
        n5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(n5Var2);
        addView(n5Var2, w7.z5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(context);
        this.e = n5Var3;
        n5Var3.setTextSize(14);
        n5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        n5Var3.setAlpha(0.0f);
        addView(n5Var3, w7.z5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.fl flVar = new org.telegram.ui.fl(this, context, new wh.g());
        this.f24796f = flVar;
        flVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(flVar, w7.z5.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21487te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21524ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21242gc));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f24797n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.f21487te;
        org.telegram.ui.ActionBar.g6 g6Var = this.f24793a;
        this.f24794b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i10, g6Var), PorterDuff.Mode.MULTIPLY));
        this.f24795c.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21524ve, g6Var));
        int i11 = org.telegram.ui.ActionBar.k6.Xk;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.setTextColor(w02);
        n5Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21242gc, g6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
    }
}
