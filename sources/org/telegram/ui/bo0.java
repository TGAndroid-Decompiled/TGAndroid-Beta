package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class bo0 extends org.telegram.ui.ActionBar.k2 {
    public Bitmap f36283a;
    public BitmapDrawable f36284b;
    public ao0 f36285c;
    public zn0 d;
    public boolean e;
    public boolean f36286f;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.C(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.D(-1, false);
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131751699, null));
        this.actionBar.setActionBarMenuOnItemClick(new t60(this, 14));
        this.actionBar.p().h(1, 2131231243, org.telegram.messenger.cd.L0(2131751355, null), org.telegram.messenger.i0.L(56.0f));
        zn0 zn0Var = new zn0(this, context);
        this.d = zn0Var;
        this.fragmentView = zn0Var;
        zn0Var.G = getArguments().getBoolean("freeform", false);
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
        if (this.f36283a == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !sc.e.x(string)) {
                return false;
            }
            if (org.telegram.messenger.i0.Q1()) {
                max = org.telegram.messenger.i0.L(520.0f);
            } else {
                Point point = org.telegram.messenger.i0.f16026q;
                max = Math.max(point.x, point.y);
            }
            float f7 = max;
            Bitmap K = org.telegram.messenger.hc.K(string, uri, f7, f7, true);
            this.f36283a = K;
            if (K == null) {
                return false;
            }
        }
        this.f36284b = new BitmapDrawable(this.f36283a);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.f36283a;
        if (bitmap != null && !this.e) {
            bitmap.recycle();
            this.f36283a = null;
        }
        this.f36284b = null;
    }
}
