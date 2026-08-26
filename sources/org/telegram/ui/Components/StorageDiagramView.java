package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Storage.CacheModel;

public class StorageDiagramView extends View implements NotificationCenter.NotificationCenterDelegate {
    private float[] animateToPercentage;
    private AvatarDrawable avatarDrawable;
    private ImageReceiver avatarImageReceiver;
    ValueAnimator backAnimator;
    CacheModel cacheModel;
    private ClearViewData[] data;
    private Long dialogId;
    CharSequence dialogText;
    StaticLayout dialogTextLayout;
    TextPaint dialogTextPaint;
    private float[] drawingPercentage;
    int enabledCount;
    private long lastDrawTime;
    float pressedProgress;
    private RectF rectF;
    private float singleProgress;
    private float[] startFromPercentage;
    AnimatedTextView.AnimatedTextDrawable text1;
    AnimatedTextView.AnimatedTextDrawable text2;
    ValueAnimator valueAnimator;

    public static class ClearViewData {
        public boolean clear;
        public int colorKey;
        boolean firstDraw;
        Paint paint;
        private final StorageDiagramView parentView;
        public long size;

        public ClearViewData(StorageDiagramView storageDiagramView) {
            Paint paint = new Paint(1);
            this.paint = paint;
            this.clear = true;
            this.firstDraw = false;
            this.parentView = storageDiagramView;
            paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
            this.paint.setStrokeCap(Paint.Cap.ROUND);
            this.paint.setStrokeJoin(Paint.Join.ROUND);
        }

        public void setClear(boolean z) {
            if (this.clear != z) {
                this.clear = z;
                this.firstDraw = true;
            }
        }
    }

    public StorageDiagramView(Context context) {
        super(context);
        this.rectF = new RectF();
        this.singleProgress = 0.0f;
        this.text1 = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.text2 = new AnimatedTextView.AnimatedTextDrawable(false, true, false);
        this.text1.setCallback(this);
        this.text2.setCallback(this);
    }

    public void lambda$setPressed$1(ValueAnimator valueAnimator) {
        this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void lambda$update$0(ClearViewData[] clearViewDataArr, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < clearViewDataArr.length; i++) {
            this.drawingPercentage[i] = (this.animateToPercentage[i] * fFloatValue) + ((1.0f - fFloatValue) * this.startFromPercentage[i]);
        }
        invalidate();
    }

    public long calculateSize() {
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
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageReceiver imageReceiver = this.avatarImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public void onAvatarClick() {
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageReceiver imageReceiver = this.avatarImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public void onDraw(Canvas canvas) {
        double d;
        int i;
        float f;
        boolean[] zArr;
        double d2;
        if (this.data == null) {
            return;
        }
        float f2 = 0.0f;
        if (this.avatarImageReceiver != null) {
            canvas.save();
            if (isPressed()) {
                float f3 = this.pressedProgress;
                if (f3 != 1.0f) {
                    float fMin = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f3;
                    this.pressedProgress = fMin;
                    this.pressedProgress = Utilities.clamp(fMin, 1.0f, 0.0f);
                    invalidate();
                }
            }
            float fM = DiffUtil.m(1.0f, this.pressedProgress, 0.15f, 0.85f);
            canvas.scale(fM, fM, this.avatarImageReceiver.getCenterX(), this.avatarImageReceiver.getCenterY());
        }
        if (this.enabledCount > 1) {
            float f4 = this.singleProgress;
            if (f4 > 0.0f) {
                float f5 = (float) (((double) f4) - 0.04d);
                this.singleProgress = f5;
                if (f5 < 0.0f) {
                    this.singleProgress = 0.0f;
                }
            }
        } else {
            float f6 = this.singleProgress;
            if (f6 < 1.0f) {
                float f7 = (float) (((double) f6) + 0.04d);
                this.singleProgress = f7;
                if (f7 > 1.0f) {
                    this.singleProgress = 1.0f;
                }
            }
        }
        int i2 = 0;
        float f8 = 0.0f;
        while (true) {
            ClearViewData[] clearViewDataArr = this.data;
            d = 180.0d;
            i = 255;
            f = 10.0f;
            zArr = null;
            if (i2 >= clearViewDataArr.length) {
                break;
            }
            ClearViewData clearViewData = clearViewDataArr[i2];
            if (clearViewData != null) {
                float f9 = this.drawingPercentage[i2];
                if (f9 != f2) {
                    if (clearViewData.firstDraw) {
                        float fM2 = DiffUtil.m(1.0f, this.singleProgress, 10.0f, f9 * (-360.0f));
                        if (fM2 > 0.0f) {
                            fM2 = 0.0f;
                        }
                        clearViewData.paint.setColor(Theme.getColor(null, clearViewData.colorKey, false));
                        this.data[i2].paint.setAlpha(255);
                        double dWidth = this.rectF.width() / 2.0f;
                        if (Math.abs((float) (((3.141592653589793d * dWidth) / 180.0d) * ((double) fM2))) <= 1.0f) {
                            double d3 = (-90.0f) - (360.0f * f8);
                            canvas.drawPoint(this.rectF.centerX() + ((float) (Math.cos(Math.toRadians(d3)) * dWidth)), this.rectF.centerY() + ((float) (Math.sin(Math.toRadians(d3)) * dWidth)), this.data[i2].paint);
                        } else {
                            this.data[i2].paint.setStyle(Paint.Style.STROKE);
                            canvas.drawArc(this.rectF, (-90.0f) - (360.0f * f8), fM2, false, this.data[i2].paint);
                        }
                    }
                    f8 += f9;
                }
            }
            i2++;
            f2 = 0.0f;
        }
        int i3 = 0;
        float f10 = 0.0f;
        while (true) {
            ClearViewData[] clearViewDataArr2 = this.data;
            if (i3 >= clearViewDataArr2.length) {
                break;
            }
            ClearViewData clearViewData2 = clearViewDataArr2[i3];
            if (clearViewData2 != null) {
                float f11 = this.drawingPercentage[i3];
                if (f11 == 0.0f) {
                    d2 = d;
                    zArr = zArr;
                } else {
                    if (clearViewData2.firstDraw) {
                        d2 = d;
                    } else {
                        d2 = d;
                        float fM3 = DiffUtil.m(1.0f, this.singleProgress, f, f11 * (-360.0f));
                        if (fM3 > 0.0f) {
                            fM3 = 0.0f;
                        }
                        clearViewData2.paint.setColor(Theme.getColor(zArr, clearViewData2.colorKey, false));
                        this.data[i3].paint.setAlpha(i);
                        double dWidth2 = this.rectF.width() / 2.0f;
                        if (Math.abs((float) (((double) fM3) * ((dWidth2 * 3.141592653589793d) / d2))) <= 1.0f) {
                            double d4 = (-90.0f) - (f10 * 360.0f);
                            canvas.drawPoint(this.rectF.centerX() + ((float) (Math.cos(Math.toRadians(d4)) * dWidth2)), this.rectF.centerY() + ((float) (Math.sin(Math.toRadians(d4)) * dWidth2)), this.data[i3].paint);
                        } else {
                            this.data[i3].paint.setStyle(Paint.Style.STROKE);
                            canvas.drawArc(this.rectF, (-90.0f) - (f10 * 360.0f), fM3, false, this.data[i3].paint);
                        }
                    }
                    f10 += f11;
                }
            } else {
                d2 = d;
                zArr = zArr;
            }
            i3++;
            zArr = zArr;
            d = d2;
            i = 255;
            f = 10.0f;
        }
        boolean[] zArr2 = zArr;
        ImageReceiver imageReceiver = this.avatarImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text1;
        if (animatedTextDrawable != null) {
            int i4 = Theme.key_dialogTextBlack;
            animatedTextDrawable.setTextColor(Theme.getColor(zArr2, i4, false));
            this.text2.setTextColor(Theme.getColor(zArr2, i4, false));
            if (this.dialogId != null) {
                float currentWidth = this.text2.getCurrentWidth() + this.text1.getCurrentWidth() + AndroidUtilities.dp(4.0f);
                float width = (getWidth() - currentWidth) / 2.0f;
                this.text1.setBounds(0, AndroidUtilities.dp(115.0f), (int) (this.text1.getCurrentWidth() + width), AndroidUtilities.dp(145.0f));
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.text2;
                animatedTextDrawable2.setBounds((int) ((width + currentWidth) - animatedTextDrawable2.getCurrentWidth()), AndroidUtilities.dp(118.0f), getWidth(), AndroidUtilities.dp(148.0f));
            }
            this.text1.draw(canvas);
            this.text2.draw(canvas);
        }
        if (this.dialogTextLayout != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(148.0f) - ((this.dialogTextLayout.getHeight() - AndroidUtilities.dp(13.0f)) / 2.0f));
            this.dialogTextPaint.setColor(Theme.getColor(zArr2, Theme.key_dialogTextBlack, false));
            this.dialogTextLayout.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        int iM$2;
        if (this.dialogId != null) {
            i3 = i;
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), 1073741824));
            iM$2 = OKLCH.m$2(110.0f, View.MeasureSpec.getSize(i3), 2);
            this.rectF.set(AndroidUtilities.dp(3.0f) + iM$2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f) + iM$2, AndroidUtilities.dp(107.0f));
        } else {
            i3 = i;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), 1073741824));
            this.rectF.set(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f), AndroidUtilities.dp(107.0f));
            iM$2 = 0;
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text1;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        animatedTextDrawable.setAnimationProperties(0.18f, 0L, 300L, cubicBezierInterpolator);
        this.text1.setTextSize(AndroidUtilities.dp(24.0f));
        this.text1.setTypeface(AndroidUtilities.bold());
        this.text2.setAnimationProperties(0.18f, 0L, 300L, cubicBezierInterpolator);
        if (this.dialogId != null) {
            this.text2.setTextSize(AndroidUtilities.dp(16.0f));
            this.text1.setGravity(5);
            this.text2.setGravity(3);
        } else {
            this.text2.setTextSize(AndroidUtilities.dp(13.0f));
            int textSize = (int) this.text1.getTextSize();
            int textSize2 = (int) this.text2.getTextSize();
            int iDp = ((AndroidUtilities.dp(110.0f) - textSize) - textSize2) / 2;
            int i4 = textSize + iDp;
            this.text1.setBounds(0, iDp, getMeasuredWidth(), i4);
            this.text2.setBounds(0, AndroidUtilities.dp(2.0f) + i4, getMeasuredWidth(), AndroidUtilities.dp(2.0f) + i4 + textSize2);
            this.text1.setGravity(17);
            this.text2.setGravity(17);
        }
        if (this.dialogText != null) {
            if (this.dialogTextPaint == null) {
                this.dialogTextPaint = new TextPaint(1);
            }
            this.dialogTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
            int size = View.MeasureSpec.getSize(i3) - AndroidUtilities.dp(60.0f);
            this.dialogTextLayout = StaticLayoutEx.createStaticLayout2(this.dialogText, this.dialogTextPaint, size, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, size, 1);
        }
        ImageReceiver imageReceiver = this.avatarImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(AndroidUtilities.dp(10.0f) + iM$2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            this.avatarImageReceiver.setRoundRadius(AndroidUtilities.dp(45.0f));
        }
        updateDescription();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Long l;
        boolean z = this.avatarImageReceiver != null && (l = this.dialogId) != null && l.longValue() != Long.MAX_VALUE && motionEvent.getX() > this.avatarImageReceiver.getImageX() && motionEvent.getX() <= this.avatarImageReceiver.getImageX2() && motionEvent.getY() > this.avatarImageReceiver.getImageY() && motionEvent.getY() <= this.avatarImageReceiver.getImageY2();
        if (motionEvent.getAction() == 0) {
            if (z) {
                setPressed(true);
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (z && motionEvent.getAction() != 3) {
                AndroidUtilities.runOnUIThread(new Tooltip$$ExternalSyntheticLambda0(this, 18), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(CacheModel cacheModel) {
        this.cacheModel = cacheModel;
    }

    public void setData(CacheModel cacheModel, ClearViewData[] clearViewDataArr) {
        this.data = clearViewDataArr;
        this.cacheModel = cacheModel;
        invalidate();
        this.drawingPercentage = new float[clearViewDataArr.length];
        this.animateToPercentage = new float[clearViewDataArr.length];
        this.startFromPercentage = new float[clearViewDataArr.length];
        update(false);
        if (this.enabledCount > 1) {
            this.singleProgress = 0.0f;
        } else {
            this.singleProgress = 1.0f;
        }
    }

    @Override
    public void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        int i = 2;
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
                valueAnimatorOfFloat.addUpdateListener(new WaveDrawable$$ExternalSyntheticLambda1(this, i));
                this.backAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        StorageDiagramView.this.backAnimator = null;
                    }
                });
                zzkk.m(2.0f, this.backAnimator);
                this.backAnimator.setDuration(350L);
                this.backAnimator.start();
            }
        }
    }

    public void update(boolean z) {
        boolean z2;
        final ClearViewData[] clearViewDataArr = this.data;
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
        valueAnimatorOfFloat.addUpdateListener(new ChatAttachAlert$19$$ExternalSyntheticLambda0(3, this, clearViewDataArr));
        this.valueAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                int i4 = 0;
                while (true) {
                    ClearViewData[] clearViewDataArr2 = clearViewDataArr;
                    if (i4 >= clearViewDataArr2.length) {
                        return;
                    }
                    ClearViewData clearViewData3 = clearViewDataArr2[i4];
                    if (clearViewData3 != null) {
                        clearViewData3.firstDraw = false;
                    }
                    i4++;
                }
            }
        });
        this.valueAnimator.setDuration(450L);
        this.valueAnimator.setInterpolator(new FastOutSlowInInterpolator());
        this.valueAnimator.start();
    }

    public long updateDescription() {
        long jCalculateSize = calculateSize();
        String[] strArrSplit = AndroidUtilities.formatFileSize(jCalculateSize).split(" ");
        if (strArrSplit.length > 1) {
            this.text1.setText(jCalculateSize == 0 ? " " : strArrSplit[0], true, false);
            this.text2.setText(jCalculateSize != 0 ? strArrSplit[1] : " ", true, false);
        }
        return jCalculateSize;
    }

    public StorageDiagramView(Context context, long j) {
        this(context);
        this.dialogId = Long.valueOf(j);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        this.avatarDrawable = avatarDrawable;
        avatarDrawable.setScaleSize(1.5f);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.avatarImageReceiver = imageReceiver;
        imageReceiver.setParentView(this);
        if (j == Long.MAX_VALUE) {
            this.dialogText = LocaleController.getString(R.string.CacheOtherChats);
            this.avatarDrawable.setAvatarType(14);
            this.avatarImageReceiver.setForUserOrChat(null, this.avatarDrawable);
        } else {
            String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(this.avatarImageReceiver, this.avatarDrawable, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j));
            this.dialogText = dialogPhotoTitle;
            this.dialogText = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
        }
    }
}
