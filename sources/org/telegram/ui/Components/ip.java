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
public final class ip extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f27252a;
    public final ImageView f27253b;
    public final org.telegram.ui.ActionBar.h5 f27254c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final org.telegram.ui.ActionBar.h5 f27255e;
    public final org.telegram.ui.rl f27256f;
    public boolean h;
    public boolean f27257n;

    public ip(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f27252a = c6Var;
        ImageView imageView = new ImageView(context);
        this.f27253b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.w5.e(52, 46, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f27254c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTypeface(AndroidUtilities.bold());
        addView(h5Var, w7.w5.a(18.0f, 52.0f, 6.0f, 0.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var2;
        h5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(h5Var2);
        addView(h5Var2, w7.w5.a(18.0f, 52.0f, 24.0f, 0.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.f27255e = h5Var3;
        h5Var3.setTextSize(14);
        h5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        h5Var3.setAlpha(0.0f);
        addView(h5Var3, w7.w5.a(18.0f, 52.0f, 24.0f, 0.0f, 0.0f, -1, 51));
        org.telegram.ui.rl rlVar = new org.telegram.ui.rl(this, context, new vh.g());
        this.f27256f = rlVar;
        rlVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(rlVar, w7.w5.a(34.0f, 52.0f, 6.0f, 0.0f, 0.0f, 34, 51));
        e();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f27257n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.f20863te;
        org.telegram.ui.ActionBar.c6 c6Var = this.f27252a;
        this.f27253b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        this.f27254c.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20899ve, c6Var));
        int i11 = org.telegram.ui.ActionBar.h6.Xk;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, c6Var);
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.setTextColor(w02);
        h5Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, c6Var));
        this.f27255e.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
