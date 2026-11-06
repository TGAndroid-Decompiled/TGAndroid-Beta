package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class pm0 extends org.telegram.ui.ActionBar.f2 {
    public Bitmap f48857a;
    public BitmapDrawable f48858b;
    public om0 f48859c;
    public nm0 d;
    public boolean f48860e;
    public boolean f48861f;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.C(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.D(-1, false);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131751699, null));
        this.actionBar.setActionBarMenuOnItemClick(new ux(this, 23));
        this.actionBar.q().h(1, 2131231242, org.telegram.messenger.g0.L(56.0f), org.telegram.messenger.hd.M0(2131751355, null));
        nm0 nm0Var = new nm0(this, context);
        this.d = nm0Var;
        this.fragmentView = nm0Var;
        nm0Var.G = getArguments().getBoolean("freeform", false);
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
        if (this.f48857a == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !a8.p0.B(string)) {
                return false;
            }
            if (org.telegram.messenger.g0.Q1()) {
                max = org.telegram.messenger.g0.L(520.0f);
            } else {
                Point point = org.telegram.messenger.g0.f22537q;
                max = Math.max(point.x, point.y);
            }
            float f10 = max;
            Bitmap K = org.telegram.messenger.gc.K(string, uri, f10, f10, true);
            this.f48857a = K;
            if (K == null) {
                return false;
            }
        }
        this.f48858b = new BitmapDrawable(this.f48857a);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.f48857a;
        if (bitmap != null && !this.f48860e) {
            bitmap.recycle();
            this.f48857a = null;
        }
        this.f48858b = null;
    }
}
