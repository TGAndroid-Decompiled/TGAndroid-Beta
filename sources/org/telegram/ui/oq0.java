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
public final class oq0 extends org.telegram.ui.ActionBar.n2 {
    public Bitmap f36355a;
    public BitmapDrawable f36356b;
    public nq0 f36357c;
    public mq0 d;
    public boolean e;
    public boolean f36358f;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.A(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.B(-1, false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.CropImage));
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 14));
        this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        mq0 mq0Var = new mq0(this, context);
        this.d = mq0Var;
        this.fragmentView = mq0Var;
        mq0Var.G = getArguments().getBoolean("freeform", false);
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
        if (this.f36355a == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !v7.j0.r(string)) {
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
            this.f36355a = loadBitmap;
            if (loadBitmap == null) {
                return false;
            }
        }
        this.f36356b = new BitmapDrawable(this.f36355a);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.f36355a;
        if (bitmap != null && !this.e) {
            bitmap.recycle();
            this.f36355a = null;
        }
        this.f36356b = null;
    }
}
