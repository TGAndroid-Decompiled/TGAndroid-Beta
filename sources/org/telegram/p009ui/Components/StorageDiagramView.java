package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AnimatedTextView;

public class StorageDiagramView extends View implements NotificationCenter.NotificationCenterDelegate {
    private float[] animateToPercentage;
    private AvatarDrawable avatarDrawable;
    private ImageReceiver avatarImageReceiver;
    ValueAnimator backAnimator;
    private ClearViewData[] data;
    private Long dialogId;
    CharSequence dialogText;
    StaticLayout dialogTextLayout;
    TextPaint dialogTextPaint;
    private float[] drawingPercentage;
    int enabledCount;
    float pressedProgress;
    private RectF rectF;
    private float singleProgress;
    private float[] startFromPercentage;
    AnimatedTextView.AnimatedTextDrawable text1;
    AnimatedTextView.AnimatedTextDrawable text2;
    ValueAnimator valueAnimator;

    public void onAvatarClick() {
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
            this.dialogText = LocaleController.getString("CacheOtherChats", C1010R.string.CacheOtherChats);
            this.avatarDrawable.setAvatarType(14);
            this.avatarImageReceiver.setForUserOrChat(null, this.avatarDrawable);
            return;
        }
        String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(this.avatarImageReceiver, this.avatarDrawable, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j));
        this.dialogText = dialogPhotoTitle;
        this.dialogText = Emoji.replaceEmoji(dialogPhotoTitle, null, AndroidUtilities.m35dp(6.0f), false);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int i3;
        if (this.dialogId != null) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(166.0f), 1073741824));
            i3 = (View.MeasureSpec.getSize(i) - AndroidUtilities.m35dp(110.0f)) / 2;
            this.rectF.set(AndroidUtilities.m35dp(3.0f) + i3, AndroidUtilities.m35dp(3.0f), AndroidUtilities.m35dp(107.0f) + i3, AndroidUtilities.m35dp(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(110.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(110.0f), 1073741824));
            this.rectF.set(AndroidUtilities.m35dp(3.0f), AndroidUtilities.m35dp(3.0f), AndroidUtilities.m35dp(107.0f), AndroidUtilities.m35dp(107.0f));
            i3 = 0;
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text1;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        animatedTextDrawable.setAnimationProperties(0.18f, 0L, 300L, cubicBezierInterpolator);
        this.text1.setTextSize(AndroidUtilities.m35dp(24.0f));
        this.text1.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.text2.setAnimationProperties(0.18f, 0L, 300L, cubicBezierInterpolator);
        if (this.dialogId != null) {
            this.text2.setTextSize(AndroidUtilities.m35dp(16.0f));
            this.text1.setGravity(5);
            this.text2.setGravity(3);
        } else {
            this.text2.setTextSize(AndroidUtilities.m35dp(13.0f));
            int textSize = (int) this.text1.getTextSize();
            int textSize2 = (int) this.text2.getTextSize();
            int m35dp = ((AndroidUtilities.m35dp(110.0f) - textSize) - textSize2) / 2;
            int i4 = textSize + m35dp;
            this.text1.setBounds(0, m35dp, getMeasuredWidth(), i4);
            this.text2.setBounds(0, AndroidUtilities.m35dp(2.0f) + i4, getMeasuredWidth(), i4 + textSize2 + AndroidUtilities.m35dp(2.0f));
            this.text1.setGravity(17);
            this.text2.setGravity(17);
        }
        if (this.dialogText != null) {
            if (this.dialogTextPaint == null) {
                this.dialogTextPaint = new TextPaint(1);
            }
            this.dialogTextPaint.setTextSize(AndroidUtilities.m35dp(13.0f));
            int size = View.MeasureSpec.getSize(i) - AndroidUtilities.m35dp(60.0f);
            this.dialogTextLayout = StaticLayoutEx.createStaticLayout2(this.dialogText, this.dialogTextPaint, size, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, size, 1);
        }
        ImageReceiver imageReceiver = this.avatarImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(i3 + AndroidUtilities.m35dp(10.0f), AndroidUtilities.m35dp(10.0f), AndroidUtilities.m35dp(90.0f), AndroidUtilities.m35dp(90.0f));
            this.avatarImageReceiver.setRoundRadius(AndroidUtilities.m35dp(45.0f));
        }
        updateDescription();
    }

    public void setData(ClearViewData[] clearViewDataArr) {
        this.data = clearViewDataArr;
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
    protected void onDraw(Canvas canvas) {
        double d;
        int i;
        if (this.data == null) {
            return;
        }
        if (this.avatarImageReceiver != null) {
            canvas.save();
            if (isPressed()) {
                float f = this.pressedProgress;
                if (f != 1.0f) {
                    float min = f + (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f);
                    this.pressedProgress = min;
                    this.pressedProgress = Utilities.clamp(min, 1.0f, 0.0f);
                    invalidate();
                }
            }
            float f2 = ((1.0f - this.pressedProgress) * 0.15f) + 0.85f;
            canvas.scale(f2, f2, this.avatarImageReceiver.getCenterX(), this.avatarImageReceiver.getCenterY());
        }
        if (this.enabledCount > 1) {
            float f3 = this.singleProgress;
            if (f3 > 0.0f) {
                double d2 = f3;
                Double.isNaN(d2);
                float f4 = (float) (d2 - 0.04d);
                this.singleProgress = f4;
                if (f4 < 0.0f) {
                    this.singleProgress = 0.0f;
                }
            }
        } else {
            float f5 = this.singleProgress;
            if (f5 < 1.0f) {
                double d3 = f5;
                Double.isNaN(d3);
                float f6 = (float) (d3 + 0.04d);
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
            d = 180.0d;
            i = 255;
            if (i2 >= clearViewDataArr.length) {
                break;
            }
            if (clearViewDataArr[i2] != null) {
                float[] fArr = this.drawingPercentage;
                if (fArr[i2] != 0.0f) {
                    float f8 = fArr[i2];
                    if (clearViewDataArr[i2].firstDraw) {
                        float f9 = ((-360.0f) * f8) + ((1.0f - this.singleProgress) * 10.0f);
                        float f10 = f9 > 0.0f ? 0.0f : f9;
                        clearViewDataArr[i2].paint.setColor(Theme.getColor(clearViewDataArr[i2].color));
                        this.data[i2].paint.setAlpha(255);
                        double width = this.rectF.width() / 2.0f;
                        Double.isNaN(width);
                        double d4 = f10;
                        Double.isNaN(d4);
                        if (Math.abs((float) (d4 * ((3.141592653589793d * width) / 180.0d))) <= 1.0f) {
                            float centerX = this.rectF.centerX();
                            double d5 = (-90.0f) - (360.0f * f7);
                            double cos = Math.cos(Math.toRadians(d5));
                            Double.isNaN(width);
                            float f11 = centerX + ((float) (cos * width));
                            float centerY = this.rectF.centerY();
                            double sin = Math.sin(Math.toRadians(d5));
                            Double.isNaN(width);
                            float f12 = centerY + ((float) (width * sin));
                            if (Build.VERSION.SDK_INT >= 21) {
                                canvas.drawPoint(f11, f12, this.data[i2].paint);
                            } else {
                                this.data[i2].paint.setStyle(Paint.Style.FILL);
                                canvas.drawCircle(f11, f12, this.data[i2].paint.getStrokeWidth() / 2.0f, this.data[i2].paint);
                            }
                        } else {
                            this.data[i2].paint.setStyle(Paint.Style.STROKE);
                            canvas.drawArc(this.rectF, (-90.0f) - (360.0f * f7), f10, false, this.data[i2].paint);
                        }
                    }
                    f7 += f8;
                }
            }
            i2++;
        }
        int i3 = 0;
        float f13 = 0.0f;
        while (true) {
            ClearViewData[] clearViewDataArr2 = this.data;
            if (i3 >= clearViewDataArr2.length) {
                break;
            }
            if (clearViewDataArr2[i3] != null) {
                float[] fArr2 = this.drawingPercentage;
                if (fArr2[i3] != 0.0f) {
                    float f14 = fArr2[i3];
                    if (!clearViewDataArr2[i3].firstDraw) {
                        float f15 = (f14 * (-360.0f)) + ((1.0f - this.singleProgress) * 10.0f);
                        float f16 = f15 > 0.0f ? 0.0f : f15;
                        clearViewDataArr2[i3].paint.setColor(Theme.getColor(clearViewDataArr2[i3].color));
                        this.data[i3].paint.setAlpha(i);
                        double width2 = this.rectF.width() / 2.0f;
                        Double.isNaN(width2);
                        double d6 = (width2 * 3.141592653589793d) / d;
                        double d7 = f16;
                        Double.isNaN(d7);
                        if (Math.abs((float) (d7 * d6)) <= 1.0f) {
                            float centerX2 = this.rectF.centerX();
                            double d8 = (-90.0f) - (f13 * 360.0f);
                            double cos2 = Math.cos(Math.toRadians(d8));
                            Double.isNaN(width2);
                            float f17 = centerX2 + ((float) (cos2 * width2));
                            float centerY2 = this.rectF.centerY();
                            double sin2 = Math.sin(Math.toRadians(d8));
                            Double.isNaN(width2);
                            float f18 = centerY2 + ((float) (width2 * sin2));
                            if (Build.VERSION.SDK_INT >= 21) {
                                canvas.drawPoint(f17, f18, this.data[i3].paint);
                            } else {
                                this.data[i3].paint.setStyle(Paint.Style.FILL);
                                canvas.drawCircle(f17, f18, this.data[i3].paint.getStrokeWidth() / 2.0f, this.data[i3].paint);
                            }
                        } else {
                            this.data[i3].paint.setStyle(Paint.Style.STROKE);
                            canvas.drawArc(this.rectF, (-90.0f) - (f13 * 360.0f), f16, false, this.data[i3].paint);
                            f13 += f14;
                            i3++;
                            i = 255;
                            d = 180.0d;
                        }
                    }
                    f13 += f14;
                    i3++;
                    i = 255;
                    d = 180.0d;
                }
            }
            i3++;
            i = 255;
            d = 180.0d;
        }
        ImageReceiver imageReceiver = this.avatarImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text1;
        if (animatedTextDrawable != null) {
            animatedTextDrawable.setTextColor(Theme.getColor("dialogTextBlack"));
            this.text2.setTextColor(Theme.getColor("dialogTextBlack"));
            if (this.dialogId != null) {
                int currentWidth = this.text1.getCurrentWidth() + AndroidUtilities.m35dp(4.0f) + this.text2.getCurrentWidth();
                int width3 = (getWidth() - currentWidth) / 2;
                this.text1.setBounds(0, AndroidUtilities.m35dp(115.0f), this.text1.getCurrentWidth() + width3, AndroidUtilities.m35dp(145.0f));
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.text2;
                animatedTextDrawable2.setBounds((width3 + currentWidth) - animatedTextDrawable2.getCurrentWidth(), AndroidUtilities.m35dp(118.0f), getWidth(), AndroidUtilities.m35dp(148.0f));
            }
            this.text1.draw(canvas);
            this.text2.draw(canvas);
        }
        if (this.dialogTextLayout != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.m35dp(30.0f), AndroidUtilities.m35dp(148.0f) - ((this.dialogTextLayout.getHeight() - AndroidUtilities.m35dp(13.0f)) / 2.0f));
            this.dialogTextPaint.setColor(Theme.getColor("dialogTextBlack"));
            this.dialogTextLayout.draw(canvas);
            canvas.restore();
        }
    }

    public static class ClearViewData {
        public boolean clear;
        public String color;
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
            this.paint.setStrokeWidth(AndroidUtilities.m35dp(5.0f));
            this.paint.setStrokeCap(Paint.Cap.ROUND);
            this.paint.setStrokeJoin(Paint.Join.ROUND);
        }

        public void setClear(boolean z) {
            if (this.clear != z) {
                this.clear = z;
                this.parentView.updateDescription();
                this.firstDraw = true;
                this.parentView.update(true);
            }
        }
    }

    public void update(boolean z) {
        final ClearViewData[] clearViewDataArr = this.data;
        if (clearViewDataArr == null) {
            return;
        }
        long j = 0;
        for (int i = 0; i < clearViewDataArr.length; i++) {
            if (clearViewDataArr[i] != null && clearViewDataArr[i].clear) {
                j += clearViewDataArr[i].size;
            }
        }
        this.enabledCount = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < clearViewDataArr.length; i2++) {
            if (clearViewDataArr[i2] != null && clearViewDataArr[i2].clear) {
                this.enabledCount++;
            }
            if (clearViewDataArr[i2] == null || !clearViewDataArr[i2].clear) {
                this.animateToPercentage[i2] = 0.0f;
            } else {
                float f3 = ((float) clearViewDataArr[i2].size) / ((float) j);
                if (f3 < 0.02777f) {
                    f3 = 0.02777f;
                }
                f += f3;
                if (f3 > f2 && clearViewDataArr[i2].clear) {
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.valueAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                StorageDiagramView.this.lambda$update$0(clearViewDataArr, valueAnimator2);
            }
        });
        this.valueAnimator.addListener(new AnimatorListenerAdapter(this) {
            @Override
            public void onAnimationEnd(Animator animator) {
                int i4 = 0;
                while (true) {
                    ClearViewData[] clearViewDataArr2 = clearViewDataArr;
                    if (i4 >= clearViewDataArr2.length) {
                        return;
                    }
                    if (clearViewDataArr2[i4] != null) {
                        clearViewDataArr2[i4].firstDraw = false;
                    }
                    i4++;
                }
            }
        });
        this.valueAnimator.setDuration(450L);
        this.valueAnimator.setInterpolator(new FastOutSlowInInterpolator());
        this.valueAnimator.start();
    }

    public void lambda$update$0(ClearViewData[] clearViewDataArr, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < clearViewDataArr.length; i++) {
            this.drawingPercentage[i] = (this.startFromPercentage[i] * (1.0f - floatValue)) + (this.animateToPercentage[i] * floatValue);
        }
        invalidate();
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
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StorageDiagramView.this.onAvatarClick();
                    }
                }, 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
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
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.backAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        StorageDiagramView.this.lambda$setPressed$1(valueAnimator2);
                    }
                });
                this.backAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        StorageDiagramView.this.backAnimator = null;
                    }
                });
                this.backAnimator.setInterpolator(new OvershootInterpolator(2.0f));
                this.backAnimator.setDuration(350L);
                this.backAnimator.start();
            }
        }
    }

    public void lambda$setPressed$1(ValueAnimator valueAnimator) {
        this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public void updateDescription() {
        if (this.data == null) {
            return;
        }
        long j = 0;
        int i = 0;
        while (true) {
            ClearViewData[] clearViewDataArr = this.data;
            if (i >= clearViewDataArr.length) {
                break;
            }
            if (clearViewDataArr[i] != null && clearViewDataArr[i].clear) {
                j += clearViewDataArr[i].size;
            }
            i++;
        }
        String[] split = AndroidUtilities.formatFileSize(j).split(" ");
        if (split.length > 1) {
            this.text1.setText(j == 0 ? " " : split[0], true, false);
            this.text2.setText(j != 0 ? split[1] : " ", true, false);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageReceiver imageReceiver = this.avatarImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageReceiver imageReceiver = this.avatarImageReceiver;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }
}
