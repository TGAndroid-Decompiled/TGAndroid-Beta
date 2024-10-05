package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

public class MenuDrawable extends Drawable {
    public static int TYPE_DEFAULT = 0;
    public static int TYPE_UDPATE_AVAILABLE = 1;
    public static int TYPE_UDPATE_DOWNLOADING = 2;
    private int alpha;
    private float animatedDownloadProgress;
    private int backColor;
    private Paint backPaint;
    private int currentAnimationTime;
    private float currentRotation;
    private float downloadProgress;
    private float downloadProgressAnimationStart;
    private float downloadProgressTime;
    private float downloadRadOffset;
    private float finalRotation;
    private int iconColor;
    private DecelerateInterpolator interpolator;
    private long lastFrameTime;
    private boolean miniIcon;
    private Paint paint;
    private int previousType;
    private RectF rect;
    private boolean reverseAngle;
    private boolean rotateToBack;
    private boolean roundCap;
    private int type;
    private float typeAnimationProgress;

    public MenuDrawable() {
        this(TYPE_DEFAULT);
    }

    public MenuDrawable(int i) {
        this.paint = new Paint(1);
        this.backPaint = new Paint(1);
        this.rotateToBack = true;
        this.interpolator = new DecelerateInterpolator();
        this.rect = new RectF();
        this.alpha = 255;
        this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.backPaint.setStrokeWidth(AndroidUtilities.density * 1.66f);
        this.backPaint.setStrokeCap(Paint.Cap.ROUND);
        this.backPaint.setStyle(Paint.Style.STROKE);
        this.previousType = TYPE_DEFAULT;
        this.type = i;
        this.typeAnimationProgress = 1.0f;
    }

    @Override
    public void draw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.MenuDrawable.draw(android.graphics.Canvas):void");
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
        if (this.alpha != i) {
            this.alpha = i;
            this.paint.setAlpha(i);
            this.backPaint.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setBackColor(int i) {
        this.backColor = i;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setIconColor(int i) {
        this.iconColor = i;
    }

    public void setMiniIcon(boolean z) {
        this.miniIcon = z;
    }

    public void setRotateToBack(boolean z) {
        this.rotateToBack = z;
    }

    public void setRotation(float r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.MenuDrawable.setRotation(float, boolean):void");
    }

    public void setRoundCap() {
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.roundCap = true;
    }

    public void setType(int i, boolean z) {
        int i2 = this.type;
        if (i2 == i) {
            return;
        }
        this.previousType = i2;
        this.type = i;
        this.typeAnimationProgress = z ? 0.0f : 1.0f;
        invalidateSelf();
    }

    public void setUpdateDownloadProgress(float f, boolean z) {
        if (z) {
            if (this.animatedDownloadProgress > f) {
                this.animatedDownloadProgress = f;
            }
            this.downloadProgressAnimationStart = this.animatedDownloadProgress;
        } else {
            this.animatedDownloadProgress = f;
            this.downloadProgressAnimationStart = f;
        }
        this.downloadProgress = f;
        this.downloadProgressTime = 0.0f;
        invalidateSelf();
    }
}
