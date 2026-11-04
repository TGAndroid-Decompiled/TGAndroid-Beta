package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class km0 extends org.telegram.ui.ActionBar.d2 {
    public Bitmap f46984a;
    public BitmapDrawable f46985b;
    public jm0 f46986c;
    public im0 d;
    public boolean f46987e;
    public boolean f46988f;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.C(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.D(-1, false);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131751699, null));
        this.actionBar.setActionBarMenuOnItemClick(new hx(this, 24));
        this.actionBar.q().h(1, 2131231242, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.bd.M0(2131751355, null));
        im0 im0Var = new im0(this, context);
        this.d = im0Var;
        this.fragmentView = im0Var;
        im0Var.H = getArguments().getBoolean("freeform", false);
        this.fragmentView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return this.fragmentView;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        int max;
        if (this.f46984a == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !t4.c.p(string)) {
                return false;
            }
            if (org.telegram.messenger.g0.Q1()) {
                max = org.telegram.messenger.g0.L(520.0f);
            } else {
                Point point = org.telegram.messenger.g0.f22608q;
                max = Math.max(point.x, point.y);
            }
            float f10 = max;
            Bitmap K = org.telegram.messenger.zb.K(string, uri, f10, f10, true);
            this.f46984a = K;
            if (K == null) {
                return false;
            }
        }
        this.f46985b = new BitmapDrawable(this.f46984a);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.f46984a;
        if (bitmap != null && !this.f46987e) {
            bitmap.recycle();
            this.f46984a = null;
        }
        this.f46985b = null;
    }
}
