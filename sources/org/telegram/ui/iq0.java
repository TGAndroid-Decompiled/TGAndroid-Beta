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
public final class iq0 extends org.telegram.ui.ActionBar.o2 {
    public Bitmap f34517a;
    public BitmapDrawable f34518b;
    public hq0 f34519c;
    public gq0 d;
    public boolean e;
    public boolean f34520f;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.B(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.E(-1, false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.CropImage));
        this.actionBar.setActionBarMenuOnItemClick(new t70(this, 14));
        this.actionBar.o().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        gq0 gq0Var = new gq0(this, context);
        this.d = gq0Var;
        this.fragmentView = gq0Var;
        gq0Var.G = getArguments().getBoolean("freeform", false);
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
        if (this.f34517a == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !v7.k0.r(string)) {
                return false;
            }
            if (AndroidUtilities.isTablet()) {
                max = AndroidUtilities.dp(520.0f);
            } else {
                Point point = AndroidUtilities.displaySize;
                max = Math.max(point.x, point.y);
            }
            float f7 = max;
            Bitmap loadBitmap = ImageLoader.loadBitmap(string, uri, f7, f7, true);
            this.f34517a = loadBitmap;
            if (loadBitmap == null) {
                return false;
            }
        }
        this.f34518b = new BitmapDrawable(this.f34517a);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.f34517a;
        if (bitmap != null && !this.e) {
            bitmap.recycle();
            this.f34517a = null;
        }
        this.f34518b = null;
    }
}
