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
public final class dq0 extends org.telegram.ui.ActionBar.r2 {
    public Bitmap f38918a;
    public BitmapDrawable f38919b;
    public cq0 f38920c;
    public bq0 d;
    public boolean e;
    public boolean f38921f;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.x(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.y(-1, false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.CropImage));
        this.actionBar.setActionBarMenuOnItemClick(new a20(this, 20));
        this.actionBar.l().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        bq0 bq0Var = new bq0(this, context);
        this.d = bq0Var;
        this.fragmentView = bq0Var;
        bq0Var.G = getArguments().getBoolean("freeform", false);
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
        if (this.f38918a == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !org.telegram.ui.Components.b10.t(string)) {
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
            this.f38918a = loadBitmap;
            if (loadBitmap == null) {
                return false;
            }
        }
        this.f38919b = new BitmapDrawable(this.f38918a);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.f38918a;
        if (bitmap != null && !this.e) {
            bitmap.recycle();
            this.f38918a = null;
        }
        this.f38919b = null;
    }
}
