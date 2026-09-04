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
public final class nq0 extends org.telegram.ui.ActionBar.n2 {
    public Bitmap f39003a;
    public BitmapDrawable f39004b;
    public mq0 f39005c;
    public lq0 d;
    public boolean f39006e;
    public boolean f39007f;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.B(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.C(-1, false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.CropImage));
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 15));
        this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        lq0 lq0Var = new lq0(this, context);
        this.d = lq0Var;
        this.fragmentView = lq0Var;
        lq0Var.G = getArguments().getBoolean("freeform", false);
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
        if (this.f39003a == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !w.f.o(string)) {
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
            this.f39003a = loadBitmap;
            if (loadBitmap == null) {
                return false;
            }
        }
        this.f39004b = new BitmapDrawable(this.f39003a);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.f39003a;
        if (bitmap != null && !this.f39006e) {
            bitmap.recycle();
            this.f39003a = null;
        }
        this.f39004b = null;
    }
}
