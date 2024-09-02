package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.PhotoCropActivity;

public class PhotoCropActivity extends BaseFragment {
    private String bitmapKey;
    private PhotoEditActivityDelegate delegate;
    private boolean doneButtonPressed;
    private BitmapDrawable drawable;
    private Bitmap imageToCrop;
    private boolean sameBitmap;
    private PhotoCropView view;

    public interface PhotoEditActivityDelegate {
        void didFinishEdit(Bitmap bitmap);
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public class PhotoCropView extends FrameLayout {
        int bitmapHeight;
        int bitmapWidth;
        int bitmapX;
        int bitmapY;
        Paint circlePaint;
        int draggingState;
        boolean freeform;
        Paint halfPaint;
        float oldX;
        float oldY;
        Paint rectPaint;
        float rectSizeX;
        float rectSizeY;
        float rectX;
        float rectY;
        int viewHeight;
        int viewWidth;

        public PhotoCropView(Context context) {
            super(context);
            this.rectPaint = null;
            this.circlePaint = null;
            this.halfPaint = null;
            this.rectSizeX = 600.0f;
            this.rectSizeY = 600.0f;
            this.rectX = -1.0f;
            this.rectY = -1.0f;
            this.draggingState = 0;
            this.oldX = 0.0f;
            this.oldY = 0.0f;
            init();
        }

        private void init() {
            Paint paint = new Paint();
            this.rectPaint = paint;
            paint.setColor(1073412858);
            this.rectPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            this.rectPaint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.circlePaint = paint2;
            paint2.setColor(-1);
            Paint paint3 = new Paint();
            this.halfPaint = paint3;
            paint3.setColor(-939524096);
            setBackgroundColor(-13421773);
            setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean lambda$init$0;
                    lambda$init$0 = PhotoCropActivity.PhotoCropView.this.lambda$init$0(view, motionEvent);
                    return lambda$init$0;
                }
            });
        }

        public boolean lambda$init$0(android.view.View r14, android.view.MotionEvent r15) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoCropActivity.PhotoCropView.lambda$init$0(android.view.View, android.view.MotionEvent):boolean");
        }

        private void updateBitmapSize() {
            if (this.viewWidth == 0 || this.viewHeight == 0 || PhotoCropActivity.this.imageToCrop == null) {
                return;
            }
            float f = this.rectX - this.bitmapX;
            float f2 = this.bitmapWidth;
            float f3 = f / f2;
            float f4 = this.rectY - this.bitmapY;
            float f5 = this.bitmapHeight;
            float f6 = f4 / f5;
            float f7 = this.rectSizeX / f2;
            float f8 = this.rectSizeY / f5;
            float width = PhotoCropActivity.this.imageToCrop.getWidth();
            float height = PhotoCropActivity.this.imageToCrop.getHeight();
            int i = this.viewWidth;
            float f9 = i / width;
            int i2 = this.viewHeight;
            if (f9 > i2 / height) {
                this.bitmapHeight = i2;
                this.bitmapWidth = (int) Math.ceil(width * r9);
            } else {
                this.bitmapWidth = i;
                this.bitmapHeight = (int) Math.ceil(height * f9);
            }
            this.bitmapX = ((this.viewWidth - this.bitmapWidth) / 2) + AndroidUtilities.dp(14.0f);
            int dp = ((this.viewHeight - this.bitmapHeight) / 2) + AndroidUtilities.dp(14.0f);
            this.bitmapY = dp;
            if (this.rectX == -1.0f && this.rectY == -1.0f) {
                if (this.freeform) {
                    this.rectY = dp;
                    this.rectX = this.bitmapX;
                    this.rectSizeX = this.bitmapWidth;
                    this.rectSizeY = this.bitmapHeight;
                } else {
                    if (this.bitmapWidth > this.bitmapHeight) {
                        this.rectY = dp;
                        this.rectX = ((this.viewWidth - r1) / 2) + AndroidUtilities.dp(14.0f);
                        float f10 = this.bitmapHeight;
                        this.rectSizeX = f10;
                        this.rectSizeY = f10;
                    } else {
                        this.rectX = this.bitmapX;
                        this.rectY = ((this.viewHeight - r0) / 2) + AndroidUtilities.dp(14.0f);
                        float f11 = this.bitmapWidth;
                        this.rectSizeX = f11;
                        this.rectSizeY = f11;
                    }
                }
            } else {
                float f12 = this.bitmapWidth;
                this.rectX = (f3 * f12) + this.bitmapX;
                float f13 = this.bitmapHeight;
                this.rectY = (f6 * f13) + dp;
                this.rectSizeX = f7 * f12;
                this.rectSizeY = f8 * f13;
            }
            invalidate();
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            this.viewWidth = (i3 - i) - AndroidUtilities.dp(28.0f);
            this.viewHeight = (i4 - i2) - AndroidUtilities.dp(28.0f);
            updateBitmapSize();
        }

        public Bitmap getBitmap() {
            float f = this.rectX - this.bitmapX;
            float f2 = this.bitmapWidth;
            float f3 = (this.rectY - this.bitmapY) / this.bitmapHeight;
            float f4 = this.rectSizeX / f2;
            float f5 = this.rectSizeY / f2;
            int width = (int) ((f / f2) * PhotoCropActivity.this.imageToCrop.getWidth());
            int height = (int) (f3 * PhotoCropActivity.this.imageToCrop.getHeight());
            int width2 = (int) (f4 * PhotoCropActivity.this.imageToCrop.getWidth());
            int width3 = (int) (f5 * PhotoCropActivity.this.imageToCrop.getWidth());
            if (width < 0) {
                width = 0;
            }
            if (height < 0) {
                height = 0;
            }
            if (width + width2 > PhotoCropActivity.this.imageToCrop.getWidth()) {
                width2 = PhotoCropActivity.this.imageToCrop.getWidth() - width;
            }
            if (height + width3 > PhotoCropActivity.this.imageToCrop.getHeight()) {
                width3 = PhotoCropActivity.this.imageToCrop.getHeight() - height;
            }
            try {
                return Bitmaps.createBitmap(PhotoCropActivity.this.imageToCrop, width, height, width2, width3);
            } catch (Throwable th) {
                FileLog.e(th);
                System.gc();
                try {
                    return Bitmaps.createBitmap(PhotoCropActivity.this.imageToCrop, width, height, width2, width3);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return null;
                }
            }
        }

        @Override
        protected void onDraw(android.graphics.Canvas r16) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoCropActivity.PhotoCropView.onDraw(android.graphics.Canvas):void");
        }
    }

    public PhotoCropActivity(Bundle bundle) {
        super(bundle);
        this.delegate = null;
        this.sameBitmap = false;
        this.doneButtonPressed = false;
    }

    @Override
    public boolean onFragmentCreate() {
        int max;
        if (this.imageToCrop == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !new File(string).exists()) {
                return false;
            }
            if (AndroidUtilities.isTablet()) {
                max = AndroidUtilities.dp(520.0f);
            } else {
                Point point = AndroidUtilities.displaySize;
                max = Math.max(point.x, point.y);
            }
            float f = max;
            Bitmap loadBitmap = ImageLoader.loadBitmap(string, uri, f, f, true);
            this.imageToCrop = loadBitmap;
            if (loadBitmap == null) {
                return false;
            }
        }
        this.drawable = new BitmapDrawable(this.imageToCrop);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        Bitmap bitmap;
        super.onFragmentDestroy();
        if (this.bitmapKey != null && ImageLoader.getInstance().decrementUseCount(this.bitmapKey) && !ImageLoader.getInstance().isInMemCache(this.bitmapKey, false)) {
            this.bitmapKey = null;
        }
        if (this.bitmapKey == null && (bitmap = this.imageToCrop) != null && !this.sameBitmap) {
            bitmap.recycle();
            this.imageToCrop = null;
        }
        this.drawable = null;
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.setItemsBackgroundColor(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.setItemsColor(-1, false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.CropImage));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    PhotoCropActivity.this.lambda$onBackPressed$308();
                    return;
                }
                if (i == 1) {
                    if (PhotoCropActivity.this.delegate != null && !PhotoCropActivity.this.doneButtonPressed) {
                        Bitmap bitmap = PhotoCropActivity.this.view.getBitmap();
                        if (bitmap == PhotoCropActivity.this.imageToCrop) {
                            PhotoCropActivity.this.sameBitmap = true;
                        }
                        PhotoCropActivity.this.delegate.didFinishEdit(bitmap);
                        PhotoCropActivity.this.doneButtonPressed = true;
                    }
                    PhotoCropActivity.this.lambda$onBackPressed$308();
                }
            }
        });
        this.actionBar.createMenu().addItemWithWidth(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
        PhotoCropView photoCropView = new PhotoCropView(context);
        this.view = photoCropView;
        this.fragmentView = photoCropView;
        photoCropView.freeform = getArguments().getBoolean("freeform", false);
        this.fragmentView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return this.fragmentView;
    }

    public void setDelegate(PhotoEditActivityDelegate photoEditActivityDelegate) {
        this.delegate = photoEditActivityDelegate;
    }
}
