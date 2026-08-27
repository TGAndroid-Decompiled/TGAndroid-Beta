package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.io.FileNotFoundException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class mp0 extends org.telegram.ui.ActionBar.n2 {

    public Bitmap f40575a;

    public BitmapDrawable f40576b;

    public lp0 f40577c;
    public kp0 d;

    public boolean f40578e;

    public boolean f40579f;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.C(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.D(-1, false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.CropImage));
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 10));
        this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        kp0 kp0Var = new kp0(this, context);
        this.d = kp0Var;
        this.fragmentView = kp0Var;
        kp0Var.C = getArguments().getBoolean("freeform", false);
        this.fragmentView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return this.fragmentView;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onFragmentCreate() throws FileNotFoundException {
        int iMax;
        if (this.f40575a == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !com.google.android.recaptcha.internal.a.v(string)) {
                return false;
            }
            if (AndroidUtilities.isTablet()) {
                iMax = AndroidUtilities.dp(520.0f);
            } else {
                Point point = AndroidUtilities.displaySize;
                iMax = Math.max(point.x, point.y);
            }
            float f10 = iMax;
            Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(string, uri, f10, f10, true);
            this.f40575a = bitmapLoadBitmap;
            if (bitmapLoadBitmap == null) {
                return false;
            }
        }
        this.f40576b = new BitmapDrawable(this.f40575a);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.f40575a;
        if (bitmap != null && !this.f40578e) {
            bitmap.recycle();
            this.f40575a = null;
        }
        this.f40576b = null;
    }
}
