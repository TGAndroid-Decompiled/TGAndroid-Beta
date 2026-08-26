package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.Storage.CacheModel;

public abstract class StorageDiagramView extends View implements NotificationCenter.NotificationCenterDelegate {
    public float[] animateToPercentage;
    public ImageReceiver avatarImageReceiver;
    public ValueAnimator backAnimator;
    public CacheModel cacheModel;
    public ClearViewData[] data;
    public Long dialogId;
    public CharSequence dialogText;
    public StaticLayout dialogTextLayout;
    public TextPaint dialogTextPaint;
    public float[] drawingPercentage;
    public int enabledCount;
    public float pressedProgress;
    public final RectF rectF;
    public float singleProgress;
    public float[] startFromPercentage;
    public final AnimatedTextView.AnimatedTextDrawable text1;
    public final AnimatedTextView.AnimatedTextDrawable text2;
    public ValueAnimator valueAnimator;

    public final class ClearViewData {
        public boolean clear;
        public int colorKey;
        public boolean firstDraw;
        public final Paint paint;
        public long size;

        public ClearViewData() {
            Paint paint = new Paint(1);
            this.paint = paint;
            this.clear = true;
            this.firstDraw = false;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
        }
    }

    public StorageDiagramView(Context context) {
        super(context);
        this.rectF = new RectF();
        this.singleProgress = 0.0f;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
        this.text1 = animatedTextDrawable;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(false, true, false, false);
        this.text2 = animatedTextDrawable2;
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable2.setCallback(this);
    }

    public final long calculateSize() {
        if (this.data == null) {
            return 0L;
        }
        long j = 0;
        for (int i = 0; i < this.data.length; i++) {
            long selectedFilesSize = this.cacheModel.getSelectedFilesSize(i);
            ClearViewData clearViewData = this.data[i];
            if (clearViewData != null && (clearViewData.clear || selectedFilesSize > 0)) {
                if (selectedFilesSize <= 0) {
                    selectedFilesSize = clearViewData.size;
                }
                j += selectedFilesSize;
            }
        }
        return j;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageReceiver imageReceiver = this.avatarImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageReceiver imageReceiver = this.avatarImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        double d;
        int i;
        float f;
        if (this.data == null) {
            return;
        }
        if (this.avatarImageReceiver != null) {
            canvas.save();
            if (isPressed()) {
                float f2 = this.pressedProgress;
                if (f2 != 1.0f) {
                    float fMin = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f2;
                    this.pressedProgress = fMin;
                    this.pressedProgress = Utilities.clamp(fMin, 1.0f, 0.0f);
                    invalidate();
                }
            }
            float fM = DiffUtil.m(1.0f, this.pressedProgress, 0.15f, 0.85f);
            canvas.scale(fM, fM, this.avatarImageReceiver.getCenterX(), this.avatarImageReceiver.getCenterY());
        }
        if (this.enabledCount > 1) {
            float f3 = this.singleProgress;
            if (f3 > 0.0f) {
                float f4 = (float) (((double) f3) - 0.04d);
                this.singleProgress = f4;
                if (f4 < 0.0f) {
                    this.singleProgress = 0.0f;
                }
            }
        } else {
            float f5 = this.singleProgress;
            if (f5 < 1.0f) {
                float f6 = (float) (((double) f5) + 0.04d);
                this.singleProgress = f6;
                if (f6 > 1.0f) {
                    this.singleProgress = 1.0f;
                }
            }
        }
        int i2 = 0;
        float f7 = 0.0f;
        while (true) {
            ClearViewData[] clearViewDataArr = this.data;
            int length = clearViewDataArr.length;
            rectF = this.rectF;
            d = 3.141592653589793d;
            i = 255;
            f = 10.0f;
            if (i2 >= length) {
                break;
            }
            ClearViewData clearViewData = clearViewDataArr[i2];
            if (clearViewData != null) {
                float f8 = this.drawingPercentage[i2];
                if (f8 != 0.0f) {
                    if (clearViewData.firstDraw) {
                        float fM2 = DiffUtil.m(1.0f, this.singleProgress, 10.0f, f8 * (-360.0f));
                        if (fM2 > 0.0f) {
                            fM2 = 0.0f;
                        }
                        clearViewData.paint.setColor(Theme.getColor(null, clearViewData.colorKey, false));
                        this.data[i2].paint.setAlpha(255);
                        double dWidth = rectF.width() / 2.0f;
                        if (Math.abs((float) (((3.141592653589793d * dWidth) / 180.0d) * ((double) fM2))) <= 1.0f) {
                            double d2 = (-90.0f) - (360.0f * f7);
                            canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d2)) * dWidth)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d2)) * dWidth)), this.data[i2].paint);
                        } else {
                            this.data[i2].paint.setStyle(Paint.Style.STROKE);
                            canvas.drawArc(rectF, (-90.0f) - (360.0f * f7), fM2, false, this.data[i2].paint);
                        }
                    }
                    f7 += f8;
                }
            }
            i2++;
        }
        int i3 = 0;
        float f9 = 0.0f;
        while (true) {
            ClearViewData[] clearViewDataArr2 = this.data;
            if (i3 >= clearViewDataArr2.length) {
                break;
            }
            ClearViewData clearViewData2 = clearViewDataArr2[i3];
            if (clearViewData2 != null) {
                float f10 = this.drawingPercentage[i3];
                if (f10 != 0.0f) {
                    if (!clearViewData2.firstDraw) {
                        float fM3 = DiffUtil.m(1.0f, this.singleProgress, f, f10 * (-360.0f));
                        if (fM3 > 0.0f) {
                            fM3 = 0.0f;
                        }
                        clearViewData2.paint.setColor(Theme.getColor(null, clearViewData2.colorKey, false));
                        this.data[i3].paint.setAlpha(i);
                        double dWidth2 = rectF.width() / 2.0f;
                        if (Math.abs((float) (((double) fM3) * ((dWidth2 * d) / 180.0d))) <= 1.0f) {
                            double d3 = (-90.0f) - (f9 * 360.0f);
                            canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d3)) * dWidth2)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d3)) * dWidth2)), this.data[i3].paint);
                        } else {
                            this.data[i3].paint.setStyle(Paint.Style.STROKE);
                            canvas.drawArc(rectF, (-90.0f) - (f9 * 360.0f), fM3, false, this.data[i3].paint);
                        }
                    }
                    f9 += f10;
                }
            }
            i3++;
            i = 255;
            f = 10.0f;
            d = 3.141592653589793d;
        }
        ImageReceiver imageReceiver = this.avatarImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text1;
        if (animatedTextDrawable != null) {
            int i4 = Theme.key_dialogTextBlack;
            int color = Theme.getColor(null, i4, false);
            animatedTextDrawable.textPaint.setColor(color);
            animatedTextDrawable.alpha = Color.alpha(color);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.text2;
            int color2 = Theme.getColor(null, i4, false);
            animatedTextDrawable2.textPaint.setColor(color2);
            animatedTextDrawable2.alpha = Color.alpha(color2);
            if (this.dialogId != null) {
                float currentWidth = animatedTextDrawable2.getCurrentWidth() + animatedTextDrawable.getCurrentWidth() + AndroidUtilities.dp(4.0f);
                float width = (getWidth() - currentWidth) / 2.0f;
                animatedTextDrawable.setBounds(0, AndroidUtilities.dp(115.0f), (int) (animatedTextDrawable.getCurrentWidth() + width), AndroidUtilities.dp(145.0f));
                animatedTextDrawable2.setBounds((int) ((width + currentWidth) - animatedTextDrawable2.getCurrentWidth()), AndroidUtilities.dp(118.0f), getWidth(), AndroidUtilities.dp(148.0f));
            }
            animatedTextDrawable.draw(canvas);
            animatedTextDrawable2.draw(canvas);
        }
        if (this.dialogTextLayout != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(148.0f) - ((this.dialogTextLayout.getHeight() - AndroidUtilities.dp(13.0f)) / 2.0f));
            this.dialogTextPaint.setColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
            this.dialogTextLayout.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int iM$2;
        Long l = this.dialogId;
        RectF rectF = this.rectF;
        if (l != null) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), 1073741824));
            iM$2 = OKLCH.m$2(110.0f, View.MeasureSpec.getSize(i), 2);
            rectF.set(AndroidUtilities.dp(3.0f) + iM$2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f) + iM$2, AndroidUtilities.dp(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824));
            rectF.set(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f), AndroidUtilities.dp(107.0f));
            iM$2 = 0;
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text1;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        animatedTextDrawable.moveAmplitude = 0.18f;
        animatedTextDrawable.animateDuration = 300L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(24.0f));
        animatedTextDrawable.textPaint.setTypeface(AndroidUtilities.bold());
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.text2;
        animatedTextDrawable2.moveAmplitude = 0.18f;
        animatedTextDrawable2.animateDuration = 300L;
        animatedTextDrawable2.animateWave = 1.0f;
        animatedTextDrawable2.animateInterpolator = cubicBezierInterpolator;
        if (this.dialogId != null) {
            animatedTextDrawable2.setTextSize(AndroidUtilities.dp(16.0f));
            animatedTextDrawable.gravity = 5;
            animatedTextDrawable2.gravity = 3;
        } else {
            animatedTextDrawable2.setTextSize(AndroidUtilities.dp(13.0f));
            int textSize = (int) animatedTextDrawable.textPaint.getTextSize();
            int textSize2 = (int) animatedTextDrawable2.textPaint.getTextSize();
            int iDp = ((AndroidUtilities.dp(110.0f) - textSize) - textSize2) / 2;
            int i3 = textSize + iDp;
            animatedTextDrawable.setBounds(0, iDp, getMeasuredWidth(), i3);
            animatedTextDrawable2.setBounds(0, AndroidUtilities.dp(2.0f) + i3, getMeasuredWidth(), AndroidUtilities.dp(2.0f) + i3 + textSize2);
            animatedTextDrawable.gravity = 17;
            animatedTextDrawable2.gravity = 17;
        }
        if (this.dialogText != null) {
            if (this.dialogTextPaint == null) {
                this.dialogTextPaint = new TextPaint(1);
            }
            this.dialogTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
            int size = View.MeasureSpec.getSize(i) - AndroidUtilities.dp(60.0f);
            CharSequence charSequence = this.dialogText;
            TextPaint textPaint = this.dialogTextPaint;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.dialogTextLayout = StaticLayoutEx.createStaticLayout2(charSequence, textPaint, size, false, size, 1);
        }
        ImageReceiver imageReceiver = this.avatarImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(AndroidUtilities.dp(10.0f) + iM$2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            this.avatarImageReceiver.setRoundRadius(AndroidUtilities.dp(45.0f));
        }
        updateDescription();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Long l;
        boolean z = this.avatarImageReceiver != null && (l = this.dialogId) != null && l.longValue() != Long.MAX_VALUE && motionEvent.getX() > this.avatarImageReceiver.getImageX() && motionEvent.getX() <= this.avatarImageReceiver.getImageX2() && motionEvent.getY() > this.avatarImageReceiver.getImageY() && motionEvent.getY() <= this.avatarImageReceiver.getImageY2();
        if (motionEvent.getAction() == 0) {
            if (z) {
                setPressed(true);
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (z && motionEvent.getAction() != 3) {
                AndroidUtilities.runOnUIThread(new SeekBarView$$ExternalSyntheticLambda1(this, 25), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(CacheModel cacheModel) {
        this.cacheModel = cacheModel;
    }

    @Override
    public void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        if (isPressed() != z) {
            super.setPressed(z);
            invalidate();
            if (z && (valueAnimator = this.backAnimator) != null) {
                valueAnimator.removeAllListeners();
                this.backAnimator.cancel();
            }
            if (z) {
                return;
            }
            float f = this.pressedProgress;
            if (f != 0.0f) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.backAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 24));
                this.backAnimator.addListener(new Tooltip.AnonymousClass1(this, 10));
                this.backAnimator.setInterpolator(new OvershootInterpolator(2.0f));
                this.backAnimator.setDuration(350L);
                this.backAnimator.start();
            }
        }
    }

    public final void update(boolean z) {
        boolean z2;
        ClearViewData[] clearViewDataArr = this.data;
        if (clearViewDataArr == null) {
            return;
        }
        long j = 0;
        for (int i = 0; i < clearViewDataArr.length; i++) {
            long selectedFilesSize = this.cacheModel.getSelectedFilesSize(i);
            ClearViewData clearViewData = clearViewDataArr[i];
            if (clearViewData != null && (clearViewData.clear || selectedFilesSize > 0)) {
                if (selectedFilesSize <= 0) {
                    selectedFilesSize = clearViewData.size;
                }
                j += selectedFilesSize;
            }
        }
        this.enabledCount = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < clearViewDataArr.length; i2++) {
            long selectedFilesSize2 = this.cacheModel.getSelectedFilesSize(i2);
            ClearViewData clearViewData2 = clearViewDataArr[i2];
            if (clearViewData2 != null && (clearViewData2.clear || selectedFilesSize2 > 0)) {
                this.enabledCount++;
            }
            if (clearViewData2 == null || (!(z2 = clearViewData2.clear) && selectedFilesSize2 <= 0)) {
                this.animateToPercentage[i2] = 0.0f;
            } else {
                if (selectedFilesSize2 <= 0) {
                    selectedFilesSize2 = clearViewData2.size;
                }
                float f3 = selectedFilesSize2 / j;
                if (f3 < 0.02777f) {
                    f3 = 0.02777f;
                }
                f += f3;
                if (f3 > f2 && (z2 || selectedFilesSize2 > 0)) {
                    f2 = f3;
                }
                this.animateToPercentage[i2] = f3;
            }
        }
        if (f > 1.0f) {
            float f4 = 1.0f / f;
            for (int i3 = 0; i3 < clearViewDataArr.length; i3++) {
                if (clearViewDataArr[i3] != null) {
                    float[] fArr = this.animateToPercentage;
                    fArr[i3] = fArr[i3] * f4;
                }
            }
        }
        if (!z) {
            System.arraycopy(this.animateToPercentage, 0, this.drawingPercentage, 0, clearViewDataArr.length);
            return;
        }
        System.arraycopy(this.drawingPercentage, 0, this.startFromPercentage, 0, clearViewDataArr.length);
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.valueAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(17, this, clearViewDataArr));
        this.valueAnimator.addListener(new Tooltip.AnonymousClass1(clearViewDataArr, 9));
        this.valueAnimator.setDuration(450L);
        this.valueAnimator.setInterpolator(new FastOutSlowInInterpolator());
        this.valueAnimator.start();
    }

    public final long updateDescription() {
        long jCalculateSize = calculateSize();
        String[] strArrSplit = AndroidUtilities.formatFileSize(jCalculateSize).split(" ");
        if (strArrSplit.length > 1) {
            this.text1.setText(jCalculateSize == 0 ? " " : strArrSplit[0], true, false);
            this.text2.setText(jCalculateSize != 0 ? strArrSplit[1] : " ", true, false);
        }
        return jCalculateSize;
    }
}
