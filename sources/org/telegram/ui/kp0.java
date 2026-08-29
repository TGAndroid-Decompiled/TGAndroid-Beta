package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kp0 extends org.telegram.ui.ActionBar.o2 {
    public Bitmap f39988a;
    public BitmapDrawable f39989b;
    public jp0 f39990c;
    public ip0 d;
    public boolean f39991e;
    public boolean f39992f;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.B(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.C(-1, false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.CropImage));
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 1));
        this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        ip0 ip0Var = new ip0(this, context);
        this.d = ip0Var;
        this.fragmentView = ip0Var;
        ip0Var.C = getArguments().getBoolean("freeform", false);
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
        if (this.f39988a == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !com.google.android.recaptcha.internal.a.v(string)) {
                return false;
            }
            if (AndroidUtilities.isTablet()) {
                max = AndroidUtilities.dp(520.0f);
            } else {
                Point point = AndroidUtilities.displaySize;
                max = Math.max(point.x, point.y);
            }
            float f9 = max;
            Bitmap loadBitmap = ImageLoader.loadBitmap(string, uri, f9, f9, true);
            this.f39988a = loadBitmap;
            if (loadBitmap == null) {
                return false;
            }
        }
        this.f39989b = new BitmapDrawable(this.f39988a);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.f39988a;
        if (bitmap != null && !this.f39991e) {
            bitmap.recycle();
            this.f39988a = null;
        }
        this.f39989b = null;
    }
}
