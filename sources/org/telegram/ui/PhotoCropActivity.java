package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import java.io.FileNotFoundException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.ImageUpdater;

public final class PhotoCropActivity extends BaseFragment {
    public ImageUpdater delegate;
    public boolean doneButtonPressed;
    public BitmapDrawable drawable;
    public Bitmap imageToCrop;
    public boolean sameBitmap;
    public PhotoCropView view;

    public final class PhotoCropView extends FrameLayout {
        public int bitmapHeight;
        public int bitmapWidth;
        public int bitmapX;
        public int bitmapY;
        public final Paint circlePaint;
        public int draggingState;
        public boolean freeform;
        public final Paint halfPaint;
        public float oldX;
        public float oldY;
        public final Paint rectPaint;
        public float rectSizeX;
        public float rectSizeY;
        public float rectX;
        public float rectY;
        public int viewHeight;
        public int viewWidth;

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
            setOnTouchListener(new TodoItemMenu$$ExternalSyntheticLambda4(this, 12));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            PhotoCropActivity photoCropActivity = PhotoCropActivity.this;
            BitmapDrawable bitmapDrawable = photoCropActivity.drawable;
            if (bitmapDrawable != null) {
                try {
                    int i = this.bitmapX;
                    int i2 = this.bitmapY;
                    bitmapDrawable.setBounds(i, i2, this.bitmapWidth + i, this.bitmapHeight + i2);
                    photoCropActivity.drawable.draw(canvas);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            int i3 = this.bitmapX;
            canvas.drawRect(i3, this.bitmapY, i3 + this.bitmapWidth, this.rectY, this.halfPaint);
            float f = this.bitmapX;
            float f2 = this.rectY;
            canvas.drawRect(f, f2, this.rectX, f2 + this.rectSizeY, this.halfPaint);
            float f3 = this.rectX + this.rectSizeX;
            float f4 = this.rectY;
            canvas.drawRect(f3, f4, this.bitmapX + this.bitmapWidth, f4 + this.rectSizeY, this.halfPaint);
            int i4 = this.bitmapX;
            canvas.drawRect(i4, this.rectY + this.rectSizeY, i4 + this.bitmapWidth, this.bitmapY + this.bitmapHeight, this.halfPaint);
            float f5 = this.rectX;
            float f6 = this.rectY;
            canvas.drawRect(f5, f6, f5 + this.rectSizeX, f6 + this.rectSizeY, this.rectPaint);
            int iDp = AndroidUtilities.dp(1.0f);
            float f7 = iDp;
            float f8 = this.rectX + f7;
            float f9 = iDp * 3;
            canvas.drawRect(f8, this.rectY + f7, f8 + AndroidUtilities.dp(20.0f), this.rectY + f9, this.circlePaint);
            float f10 = this.rectX;
            float f11 = this.rectY + f7;
            canvas.drawRect(f10 + f7, f11, f10 + f9, f11 + AndroidUtilities.dp(20.0f), this.circlePaint);
            float fDp = ((this.rectX + this.rectSizeX) - f7) - AndroidUtilities.dp(20.0f);
            float f12 = this.rectY;
            canvas.drawRect(fDp, f12 + f7, (this.rectX + this.rectSizeX) - f7, f12 + f9, this.circlePaint);
            float f13 = this.rectX + this.rectSizeX;
            float f14 = this.rectY + f7;
            canvas.drawRect(f13 - f9, f14, f13 - f7, f14 + AndroidUtilities.dp(20.0f), this.circlePaint);
            canvas.drawRect(this.rectX + f7, ((this.rectY + this.rectSizeY) - f7) - AndroidUtilities.dp(20.0f), this.rectX + f9, (this.rectY + this.rectSizeY) - f7, this.circlePaint);
            float f15 = this.rectX + f7;
            canvas.drawRect(f15, (this.rectY + this.rectSizeY) - f9, f15 + AndroidUtilities.dp(20.0f), (this.rectY + this.rectSizeY) - f7, this.circlePaint);
            float fDp2 = ((this.rectX + this.rectSizeX) - f7) - AndroidUtilities.dp(20.0f);
            float f16 = this.rectY + this.rectSizeY;
            canvas.drawRect(fDp2, f16 - f9, (this.rectX + this.rectSizeX) - f7, f16 - f7, this.circlePaint);
            canvas.drawRect((this.rectX + this.rectSizeX) - f9, ((this.rectY + this.rectSizeY) - f7) - AndroidUtilities.dp(20.0f), (this.rectX + this.rectSizeX) - f7, (this.rectY + this.rectSizeY) - f7, this.circlePaint);
            for (int i5 = 1; i5 < 3; i5++) {
                float f17 = this.rectX;
                float f18 = this.rectSizeX;
                float f19 = i5;
                float f20 = this.rectY;
                canvas.drawRect(((f18 / 3.0f) * f19) + f17, f20 + f7, zzjd.m(f18, 3.0f, f19, f17 + f7), (f20 + this.rectSizeY) - f7, this.circlePaint);
                float f21 = this.rectX;
                float f22 = this.rectY;
                float f23 = this.rectSizeY;
                canvas.drawRect(f21 + f7, zzjd.m(f23, 3.0f, f19, f22), this.rectSizeX + (f21 - f7), ((f23 / 3.0f) * f19) + f22 + f7, this.circlePaint);
            }
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            PhotoCropActivity photoCropActivity;
            Bitmap bitmap;
            super.onLayout(z, i, i2, i3, i4);
            this.viewWidth = (i3 - i) - AndroidUtilities.dp(28.0f);
            int iDp = (i4 - i2) - AndroidUtilities.dp(28.0f);
            this.viewHeight = iDp;
            if (this.viewWidth == 0 || iDp == 0 || (bitmap = (photoCropActivity = PhotoCropActivity.this).imageToCrop) == null) {
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
            float width = bitmap.getWidth();
            float height = photoCropActivity.imageToCrop.getHeight();
            int i5 = this.viewWidth;
            float f9 = i5 / width;
            int i6 = this.viewHeight;
            float f10 = i6 / height;
            if (f9 > f10) {
                this.bitmapHeight = i6;
                this.bitmapWidth = (int) Math.ceil(width * f10);
            } else {
                this.bitmapWidth = i5;
                this.bitmapHeight = (int) Math.ceil(height * f9);
            }
            this.bitmapX = AndroidUtilities.dp(14.0f) + ((this.viewWidth - this.bitmapWidth) / 2);
            int iDp2 = AndroidUtilities.dp(14.0f) + ((this.viewHeight - this.bitmapHeight) / 2);
            this.bitmapY = iDp2;
            if (this.rectX != -1.0f || this.rectY != -1.0f) {
                float f11 = this.bitmapWidth;
                this.rectX = (f3 * f11) + this.bitmapX;
                float f12 = this.bitmapHeight;
                this.rectY = (f6 * f12) + iDp2;
                this.rectSizeX = f7 * f11;
                this.rectSizeY = f8 * f12;
            } else if (this.freeform) {
                this.rectY = iDp2;
                this.rectX = this.bitmapX;
                this.rectSizeX = this.bitmapWidth;
                this.rectSizeY = this.bitmapHeight;
            } else {
                int i7 = this.bitmapWidth;
                int i8 = this.bitmapHeight;
                if (i7 > i8) {
                    this.rectY = iDp2;
                    this.rectX = AndroidUtilities.dp(14.0f) + ((this.viewWidth - i8) / 2);
                    float f13 = this.bitmapHeight;
                    this.rectSizeX = f13;
                    this.rectSizeY = f13;
                } else {
                    this.rectX = this.bitmapX;
                    this.rectY = AndroidUtilities.dp(14.0f) + ((this.viewHeight - i7) / 2);
                    float f14 = this.bitmapWidth;
                    this.rectSizeX = f14;
                    this.rectSizeY = f14;
                }
            }
            invalidate();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.setItemsBackgroundColor(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.setItemsColor(-1, false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.CropImage));
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 8));
        this.actionBar.createMenu().addItemWithWidth(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
        PhotoCropView photoCropView = new PhotoCropView(context);
        this.view = photoCropView;
        this.fragmentView = photoCropView;
        photoCropView.freeform = getArguments().getBoolean("freeform", false);
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
        if (this.imageToCrop == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null && uri == null) {
                return false;
            }
            if (string != null && !ArticleViewer.IBlock.CC.m(string)) {
                return false;
            }
            if (AndroidUtilities.isTablet()) {
                iMax = AndroidUtilities.dp(520.0f);
            } else {
                Point point = AndroidUtilities.displaySize;
                iMax = Math.max(point.x, point.y);
            }
            float f = iMax;
            Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(string, uri, f, f, true);
            this.imageToCrop = bitmapLoadBitmap;
            if (bitmapLoadBitmap == null) {
                return false;
            }
        }
        this.drawable = new BitmapDrawable(this.imageToCrop);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.imageToCrop;
        if (bitmap != null && !this.sameBitmap) {
            bitmap.recycle();
            this.imageToCrop = null;
        }
        this.drawable = null;
    }
}
