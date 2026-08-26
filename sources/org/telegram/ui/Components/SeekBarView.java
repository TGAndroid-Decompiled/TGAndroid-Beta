package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.ProfileActivity;

public class SeekBarView extends FrameLayout {
    public static Path tmpPath;
    public static float[] tmpRadii;
    public final AnimatedFloat animatedThumbX;
    public float bufferedProgress;
    public boolean captured;
    public float currentRadius;
    public int currentTimestamp;
    public SeekBarViewDelegate delegate;
    public final BaseCell.RippleDrawableSafe hoverDrawable;
    public final Paint innerPaint1;
    public CharSequence lastCaption;
    public long lastDuration;
    public int lastTimestampLabelWidth;
    public long lastTimestampUpdate;
    public int lastValue;
    public float lastWidth;
    public int lineWidthDp;
    public float minProgress;
    public final Paint outerPaint1;
    public boolean pressed;
    public final int[] pressedState;
    public float progressToSet;
    public final RectF rect;
    public boolean reportChanges;
    public final Theme.ResourcesProvider resourcesProvider;
    public final ChatMessageCell.AnonymousClass5 seekBarAccessibilityDelegate;
    public final int selectorWidth;
    public int separatorsCount;
    public float sx;
    public float sy;
    public final ProfileActivity.AnonymousClass26 textViewSwitcher;
    public int thumbDX;
    public final int thumbSize;
    public int thumbX;
    public int timestampChangeDirection;
    public float timestampChangeT;
    public int timestampIndex;
    public StaticLayout[] timestampLabel;
    public TextPaint timestampLabelPaint;
    public ArrayList timestamps;
    public float timestampsAppearing;
    public float transitionProgress;
    public int transitionThumbX;
    public boolean twoSided;

    public interface SeekBarViewDelegate {
        CharSequence getContentDescription();

        int getStepsCount();

        void onSeekBarDrag(float f, boolean z);

        void onSeekBarPressed();
    }

    public SeekBarView(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        this.animatedThumbX = new AnimatedFloat(this, 0L, 60L, CubicBezierInterpolator.EASE_OUT);
        this.progressToSet = -100.0f;
        this.minProgress = -1.0f;
        this.pressedState = new int[]{16842910, 16842919};
        this.transitionProgress = 1.0f;
        this.lineWidthDp = 3;
        this.timestampsAppearing = 0.0f;
        this.currentTimestamp = -1;
        this.timestampChangeT = 1.0f;
        this.lastWidth = -1.0f;
        this.rect = new RectF();
        this.timestampIndex = -1;
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        this.innerPaint1 = new Paint(1);
        Paint paint = new Paint(1);
        this.outerPaint1 = paint;
        int i = Theme.key_player_progress;
        paint.setColor(Theme.getColor(i, resourcesProvider));
        this.selectorWidth = AndroidUtilities.dp(32.0f);
        this.thumbSize = AndroidUtilities.dp(24.0f);
        this.currentRadius = AndroidUtilities.dp(6.0f);
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable = Theme.createSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor(i, resourcesProvider), 40), 1, AndroidUtilities.dp(16.0f));
        this.hoverDrawable = rippleDrawableSafeCreateSelectorDrawable;
        rippleDrawableSafeCreateSelectorDrawable.setCallback(this);
        rippleDrawableSafeCreateSelectorDrawable.setVisible(true, false);
        ProfileActivity.AnonymousClass26 anonymousClass26 = new ProfileActivity.AnonymousClass26(this, context, context, 1);
        this.textViewSwitcher = anonymousClass26;
        anonymousClass26.isCenter = true;
        addView(anonymousClass26, LayoutHelper.createFrame(-2.0f, -1));
        setImportantForAccessibility(1);
        ChatMessageCell.AnonymousClass5 anonymousClass5 = new ChatMessageCell.AnonymousClass5(this, z);
        this.seekBarAccessibilityDelegate = anonymousClass5;
        setAccessibilityDelegate(anonymousClass5);
    }

    private int getTimestampLabelWidth() {
        int i = this.selectorWidth;
        return (int) (Math.abs(((i / 2.0f) + (this.lastDuration > 600000 ? AndroidUtilities.dp(42.0f) : 0)) - ((getMeasuredWidth() - (i / 2.0f)) - (this.lastDuration > 600000 ? AndroidUtilities.dp(42.0f) : 0))) - AndroidUtilities.dp(66.0f));
    }

    private void setTimestampIndex(int i) {
        if (this.timestampIndex != i) {
            this.timestampIndex = i;
            if (i < 0 || i >= this.timestamps.size()) {
                return;
            }
            this.textViewSwitcher.setText((CharSequence) ((Pair) this.timestamps.get(this.timestampIndex)).second);
        }
    }

    public final void drawProgressBar(Canvas canvas, RectF rectF, Paint paint) {
        int size;
        char c;
        float fFloatValue;
        char c2;
        char c3;
        SeekBarView seekBarView = this;
        float fDp = AndroidUtilities.dp(2.0f);
        ArrayList arrayList = seekBarView.timestamps;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, fDp, fDp, paint);
            return;
        }
        float f = rectF.bottom;
        int i = seekBarView.selectorWidth;
        float f2 = i / 2.0f;
        float measuredWidth = seekBarView.getMeasuredWidth() - (i / 2.0f);
        AndroidUtilities.rectTmp.set(rectF);
        float fDp2 = AndroidUtilities.dp(seekBarView.timestampsAppearing * 1.0f) / 2.0f;
        if (tmpPath == null) {
            tmpPath = new Path();
        }
        tmpPath.reset();
        float fDp3 = AndroidUtilities.dp(4.0f) / (measuredWidth - f2);
        int i2 = 0;
        while (true) {
            size = -1;
            if (i2 >= seekBarView.timestamps.size()) {
                i2 = -1;
                break;
            } else if (((Float) ((Pair) seekBarView.timestamps.get(i2)).first).floatValue() >= fDp3) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            i2 = 0;
        }
        for (int size2 = seekBarView.timestamps.size() - 1; size2 >= 0; size2--) {
            if (1.0f - ((Float) ((Pair) seekBarView.timestamps.get(size2)).first).floatValue() >= fDp3) {
                size = size2 + 1;
                break;
            }
        }
        if (size < 0) {
            size = seekBarView.timestamps.size();
        }
        int i3 = i2;
        while (i3 <= size) {
            if (i3 == i2) {
                fFloatValue = 0.0f;
                c = 0;
            } else {
                c = 0;
                fFloatValue = ((Float) ((Pair) seekBarView.timestamps.get(i3 - 1)).first).floatValue();
            }
            float fFloatValue2 = i3 == size ? 1.0f : ((Float) ((Pair) seekBarView.timestamps.get(i3)).first).floatValue();
            while (true) {
                if (i3 == size || i3 == 0) {
                    c2 = 1;
                    break;
                }
                c2 = 1;
                if (i3 >= seekBarView.timestamps.size() - 1 || ((Float) ((Pair) seekBarView.timestamps.get(i3)).first).floatValue() - fFloatValue > fDp3) {
                    break;
                }
                i3++;
                fFloatValue2 = ((Float) ((Pair) seekBarView.timestamps.get(i3)).first).floatValue();
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.left = AndroidUtilities.lerp(f2, measuredWidth, fFloatValue) + (i3 > 0 ? fDp2 : 0.0f);
            float fLerp = AndroidUtilities.lerp(f2, measuredWidth, fFloatValue2) - (i3 < size ? fDp2 : 0.0f);
            rectF2.right = fLerp;
            float f3 = rectF.right;
            boolean z = fLerp > f3;
            if (z) {
                rectF2.right = f3;
            }
            float f4 = rectF2.right;
            float f5 = rectF.left;
            if (f4 >= f5) {
                if (rectF2.left < f5) {
                    rectF2.left = f5;
                }
                if (tmpRadii == null) {
                    tmpRadii = new float[8];
                }
                if (i3 != i2) {
                    if (z) {
                        c3 = 3;
                        if (rectF2.left >= rectF.left) {
                        }
                        tmpPath.addRoundRect(rectF2, tmpRadii, Path.Direction.CW);
                        if (z) {
                            break;
                        }
                    } else {
                        c3 = 3;
                    }
                    if (i3 >= size) {
                        float[] fArr = tmpRadii;
                        float f6 = 0.7f * fDp * seekBarView.timestampsAppearing;
                        fArr[7] = f6;
                        fArr[6] = f6;
                        fArr[c2] = f6;
                        fArr[c] = f6;
                        fArr[5] = fDp;
                        fArr[4] = fDp;
                        fArr[c3] = fDp;
                        fArr[2] = fDp;
                    } else {
                        float[] fArr2 = tmpRadii;
                        float f7 = 0.7f * fDp * seekBarView.timestampsAppearing;
                        fArr2[5] = f7;
                        fArr2[4] = f7;
                        fArr2[c3] = f7;
                        fArr2[2] = f7;
                        fArr2[7] = f7;
                        fArr2[6] = f7;
                        fArr2[c2] = f7;
                        fArr2[c] = f7;
                    }
                    tmpPath.addRoundRect(rectF2, tmpRadii, Path.Direction.CW);
                    if (z) {
                        break;
                        break;
                    }
                } else {
                    c3 = 3;
                }
                float[] fArr3 = tmpRadii;
                fArr3[7] = fDp;
                fArr3[6] = fDp;
                fArr3[c2] = fDp;
                fArr3[c] = fDp;
                float f8 = 0.7f * fDp * seekBarView.timestampsAppearing;
                fArr3[5] = f8;
                fArr3[4] = f8;
                fArr3[c3] = f8;
                fArr3[2] = f8;
                tmpPath.addRoundRect(rectF2, tmpRadii, Path.Direction.CW);
                if (z) {
                    break;
                    break;
                }
            }
            i3++;
            seekBarView = this;
        }
        canvas.drawPath(tmpPath, paint);
    }

    public float getProgress() {
        return getMeasuredWidth() == 0 ? this.progressToSet : this.thumbX / (getMeasuredWidth() - this.selectorWidth);
    }

    public SeekBarAccessibilityDelegate getSeekBarAccessibilityDelegate() {
        return this.seekBarAccessibilityDelegate;
    }

    public final StaticLayout makeStaticLayout(int i, CharSequence charSequence) {
        if (this.timestampLabelPaint == null) {
            TextPaint textPaint = new TextPaint(1);
            this.timestampLabelPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        }
        this.timestampLabelPaint.setColor(Theme.getColor(Theme.key_player_time, this.resourcesProvider));
        if (charSequence == null) {
            charSequence = "";
        }
        CharSequence charSequence2 = charSequence;
        if (Build.VERSION.SDK_INT < 23) {
            return new StaticLayout(charSequence2, 0, charSequence2.length(), this.timestampLabelPaint, i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i));
        }
        StaticLayout.Builder maxLines = StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.timestampLabelPaint, i).setMaxLines(1);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout.Builder alignment2 = maxLines.setAlignment(Layout.Alignment.ALIGN_CENTER);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        return alignment2.setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i)).build();
    }

    public final int minThumbX() {
        return Math.max((int) (this.minProgress * (getMeasuredWidth() - this.selectorWidth)), 0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z;
        float f4;
        float f5;
        CharSequence charSequence;
        Canvas canvas2 = canvas;
        int i = this.thumbX;
        boolean z2 = this.twoSided;
        int i2 = this.selectorWidth;
        if (!z2 && this.separatorsCount > 1) {
            float measuredWidth = (getMeasuredWidth() - i2) / (this.separatorsCount - 1.0f);
            i = (int) this.animatedThumbX.set(Math.round(i / measuredWidth) * measuredWidth, false);
        }
        int i3 = i;
        int measuredHeight = getMeasuredHeight();
        int i4 = this.thumbSize;
        int i5 = (measuredHeight - i4) / 2;
        Paint paint = this.innerPaint1;
        int i6 = Theme.key_player_progressBackground;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        paint.setColor(Theme.getColor(i6, resourcesProvider));
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f6 = i2 / 2.0f;
        int i7 = i2 / 2;
        float measuredWidth2 = getMeasuredWidth() - i7;
        float fDp = measuredHeight2 - (AndroidUtilities.dp(this.lineWidthDp) / 2.0f);
        float fDp2 = (AndroidUtilities.dp(this.lineWidthDp) / 2.0f) + measuredHeight2;
        RectF rectF = this.rect;
        rectF.set(f6, fDp, measuredWidth2, fDp2);
        drawProgressBar(canvas2, rectF, paint);
        if (this.bufferedProgress > 0.0f) {
            paint.setColor(Theme.getColor(Theme.key_player_progressCachedBackground, resourcesProvider));
            f = 0.0f;
            rectF.set(f6, fDp, (this.bufferedProgress * (getMeasuredWidth() - i2)) + f6, fDp2);
            drawProgressBar(canvas2, rectF, paint);
        } else {
            f = 0.0f;
        }
        boolean z3 = this.twoSided;
        Paint paint2 = this.outerPaint1;
        if (z3) {
            canvas2.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2), paint2);
            if (i3 > (getMeasuredWidth() - i2) / 2) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), i7 + i3, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i7 + i3, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            }
            f6 = f6;
        } else {
            float f7 = this.minProgress;
            if (f7 >= f) {
                float f8 = measuredWidth2 - f6;
                rectF.set((f7 * f8) + f6, fDp, i3 + f6, fDp2);
                drawProgressBar(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f6, fDp, (this.minProgress * f8) + f6, fDp2);
                paint2.setAlpha((int) (alpha * 0.5f));
                drawProgressBar(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f6, fDp, i3 + f6, fDp2);
                drawProgressBar(canvas2, rectF, paint2);
            }
        }
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.hoverDrawable;
        if (rippleDrawableSafe != null) {
            int iDp = (i7 + i3) - AndroidUtilities.dp(16.0f);
            int iDp2 = ((i4 / 2) + i5) - AndroidUtilities.dp(16.0f);
            rippleDrawableSafe.setBounds(iDp, iDp2, AndroidUtilities.dp(32.0f) + iDp, AndroidUtilities.dp(32.0f) + iDp2);
            rippleDrawableSafe.draw(canvas2);
        }
        int iDp3 = AndroidUtilities.dp(this.pressed ? 8.0f : 6.0f);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime > 18) {
            jElapsedRealtime = 16;
        }
        float f9 = this.currentRadius;
        float f10 = iDp3;
        if (f9 != f10) {
            if (f9 < f10) {
                f2 = 16.0f;
                f3 = 8.0f;
                float fM = zzjd.m(jElapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f9);
                this.currentRadius = fM;
                if (fM > f10) {
                    this.currentRadius = f10;
                }
            } else {
                f2 = 16.0f;
                f3 = 8.0f;
                float fM2 = TextureRenderer$$ExternalSyntheticOutline0.m(jElapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f9);
                this.currentRadius = fM2;
                if (fM2 < f10) {
                    this.currentRadius = f10;
                }
            }
            z = true;
        } else {
            f2 = 16.0f;
            f3 = 8.0f;
            z = false;
        }
        float f11 = this.transitionProgress;
        if (f11 < 1.0f) {
            float f12 = (jElapsedRealtime / 225.0f) + f11;
            this.transitionProgress = f12;
            if (f12 < 1.0f) {
                z = true;
            } else {
                this.transitionProgress = 1.0f;
            }
        }
        float f13 = this.transitionProgress;
        if (f13 < 1.0f) {
            float interpolation = 1.0f - Easings.easeInQuad.getInterpolation(Math.min(1.0f, f13 * 3.0f));
            float interpolation2 = Easings.easeOutQuad.getInterpolation(this.transitionProgress);
            if (interpolation > f) {
                canvas2.drawCircle(i7 + this.transitionThumbX, (i4 / 2) + i5, this.currentRadius * interpolation, paint2);
            }
            canvas2.drawCircle(i7 + i3, (i4 / 2) + i5, this.currentRadius * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i7 + i3, (i4 / 2) + i5, this.currentRadius, paint2);
        }
        ArrayList arrayList = this.timestamps;
        if (arrayList != null && !arrayList.isEmpty()) {
            float progress = getProgress();
            int size = this.timestamps.size();
            do {
                size--;
                if (size < 0) {
                    size = -1;
                    break;
                }
            } while (((Float) ((Pair) this.timestamps.get(size)).first).floatValue() - 0.001f > progress);
            setTimestampIndex(size);
            if (this.timestampLabel == null) {
                this.timestampLabel = new StaticLayout[2];
            }
            float fDp3 = (this.lastDuration > 600000 ? AndroidUtilities.dp(42.0f) : 0) + f6;
            float fAbs = Math.abs(fDp3 - ((getMeasuredWidth() - f6) - (this.lastDuration > 600000 ? AndroidUtilities.dp(42.0f) : 0))) - AndroidUtilities.dp(66.0f);
            float f14 = this.lastWidth;
            if (f14 > f && Math.abs(f14 - fAbs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.timestampLabel;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = makeStaticLayout((int) fAbs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.timestampLabel;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = makeStaticLayout((int) fAbs, staticLayout2.getText());
                }
            }
            this.lastWidth = fAbs;
            if (size != this.currentTimestamp) {
                StaticLayout[] staticLayoutArr3 = this.timestampLabel;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.pressed) {
                    AndroidUtilities.vibrateCursor(this);
                }
                if (size < 0 || size >= this.timestamps.size() || (charSequence = (CharSequence) ((Pair) this.timestamps.get(size)).second) == null) {
                    this.timestampLabel[0] = null;
                } else {
                    this.timestampLabel[0] = makeStaticLayout((int) fAbs, charSequence);
                }
                this.timestampChangeT = 0.0f;
                if (size == -1) {
                    this.timestampChangeDirection = -1;
                } else {
                    int i8 = this.currentTimestamp;
                    if (i8 == -1) {
                        this.timestampChangeDirection = 1;
                    } else if (size < i8) {
                        this.timestampChangeDirection = -1;
                    } else if (size > i8) {
                        this.timestampChangeDirection = 1;
                    }
                }
                this.currentTimestamp = size;
            }
            if (this.timestampChangeT < 1.0f) {
                this.timestampChangeT = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.lastTimestampUpdate)) / (this.timestamps.size() > 8 ? 160.0f : 220.0f)) + this.timestampChangeT, 1.0f);
                invalidate();
                this.lastTimestampUpdate = SystemClock.elapsedRealtime();
            }
            if (this.timestampsAppearing < 1.0f) {
                this.timestampsAppearing = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.lastTimestampUpdate)) / 200.0f) + this.timestampsAppearing, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = CubicBezierInterpolator.DEFAULT.getInterpolation(this.timestampChangeT);
            canvas2.save();
            canvas2.translate(fDp3 + AndroidUtilities.dp(25.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(14.0f));
            this.timestampLabelPaint.setColor(Theme.getColor(Theme.key_player_time, resourcesProvider));
            if (this.timestampLabel[1] != null) {
                canvas2.save();
                if (this.timestampChangeDirection != 0) {
                    f5 = 0.0f;
                    canvas2.translate((AndroidUtilities.dp(f2) * (-this.timestampChangeDirection) * interpolation3) + AndroidUtilities.dp(f3), 0.0f);
                } else {
                    f5 = 0.0f;
                }
                canvas2.translate(f5, (-this.timestampLabel[1].getHeight()) / 2.0f);
                this.timestampLabelPaint.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.timestampsAppearing));
                canvas2.restore();
            }
            if (this.timestampLabel[0] != null) {
                canvas2.save();
                if (this.timestampChangeDirection != 0) {
                    f4 = 0.0f;
                    canvas2.translate(DiffUtil.m(1.0f, interpolation3, AndroidUtilities.dp(f2) * this.timestampChangeDirection, AndroidUtilities.dp(f3)), 0.0f);
                } else {
                    f4 = 0.0f;
                }
                canvas2.translate(f4, (-this.timestampLabel[0].getHeight()) / 2.0f);
                this.timestampLabelPaint.setAlpha((int) (interpolation3 * 255.0f * this.timestampsAppearing));
                canvas2.restore();
            }
            canvas2.restore();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouch(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int iDp = AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2);
        ProfileActivity.AnonymousClass26 anonymousClass26 = this.textViewSwitcher;
        int measuredHeight = (anonymousClass26.getMeasuredHeight() / 2) + iDp;
        int iDp2 = AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(25.0f) + (this.selectorWidth / 2) + (this.lastDuration > 600000 ? AndroidUtilities.dp(42.0f) : 0);
        anonymousClass26.layout(iDp2, measuredHeight - anonymousClass26.getMeasuredHeight(), anonymousClass26.getMeasuredWidth() + iDp2, measuredHeight);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.lastTimestampLabelWidth = timestampLabelWidth;
        this.textViewSwitcher.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, 1073741824), 0);
        if (this.progressToSet == -100.0f || getMeasuredWidth() <= 0) {
            return;
        }
        setProgress(this.progressToSet);
        this.progressToSet = -100.0f;
    }

    public boolean onTouch(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.sx = motionEvent.getX();
            this.sy = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.hoverDrawable;
        int i = this.thumbSize;
        int i2 = this.selectorWidth;
        if (action == 1 || motionEvent.getAction() == 3) {
            this.captured = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.sy) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int measuredHeight = (getMeasuredHeight() - i) / 2;
                    if (this.thumbX - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.thumbX + i + measuredHeight) {
                        int x = ((int) motionEvent.getX()) - (i / 2);
                        this.thumbX = x;
                        if (x < minThumbX()) {
                            this.thumbX = minThumbX();
                        } else if (this.thumbX > getMeasuredWidth() - i2) {
                            this.thumbX = getMeasuredWidth() - i2;
                        }
                    }
                    this.thumbDX = (int) (motionEvent.getX() - this.thumbX);
                    this.pressed = true;
                }
            }
            if (this.pressed) {
                if (motionEvent.getAction() == 1) {
                    if (this.twoSided) {
                        float measuredWidth = (getMeasuredWidth() - i2) / 2;
                        float f = this.thumbX;
                        if (f >= measuredWidth) {
                            setSeekBarDrag((f - measuredWidth) / measuredWidth, false);
                        } else {
                            setSeekBarDrag(-Math.max(0.01f, 1.0f - ((measuredWidth - f) / measuredWidth)), false);
                        }
                    } else {
                        setSeekBarDrag(this.thumbX / (getMeasuredWidth() - i2), true);
                    }
                }
                if (rippleDrawableSafe != null) {
                    rippleDrawableSafe.setState(StateSet.NOTHING);
                }
                this.delegate.onSeekBarPressed();
                this.pressed = false;
                AndroidUtilities.runOnUIThread(new SeekBarView$$ExternalSyntheticLambda1(this, 0), 50L);
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            if (!this.captured) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                if (Math.abs(motionEvent.getY() - this.sy) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.sx) > viewConfiguration.getScaledTouchSlop()) {
                    this.captured = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    int measuredHeight2 = (getMeasuredHeight() - i) / 2;
                    if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                        if (this.thumbX - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.thumbX + i + measuredHeight2) {
                            int x2 = ((int) motionEvent.getX()) - (i / 2);
                            this.thumbX = x2;
                            if (x2 < minThumbX()) {
                                this.thumbX = minThumbX();
                            } else if (this.thumbX > getMeasuredWidth() - i2) {
                                this.thumbX = getMeasuredWidth() - i2;
                            }
                        }
                        this.thumbDX = (int) (motionEvent.getX() - this.thumbX);
                        this.pressed = true;
                        this.delegate.onSeekBarPressed();
                        if (rippleDrawableSafe != null) {
                            rippleDrawableSafe.setState(this.pressedState);
                            rippleDrawableSafe.setHotspot(motionEvent.getX(), motionEvent.getY());
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.pressed) {
                int x3 = (int) (motionEvent.getX() - this.thumbDX);
                this.thumbX = x3;
                if (x3 < minThumbX()) {
                    this.thumbX = minThumbX();
                } else if (this.thumbX > getMeasuredWidth() - i2) {
                    this.thumbX = getMeasuredWidth() - i2;
                }
                if (this.reportChanges) {
                    if (this.twoSided) {
                        float measuredWidth2 = (getMeasuredWidth() - i2) / 2;
                        float f2 = this.thumbX;
                        if (f2 >= measuredWidth2) {
                            setSeekBarDrag((f2 - measuredWidth2) / measuredWidth2, false);
                        } else {
                            setSeekBarDrag(-Math.max(0.01f, 1.0f - ((measuredWidth2 - f2) / measuredWidth2)), false);
                        }
                    } else {
                        setSeekBarDrag(this.thumbX / (getMeasuredWidth() - i2), false);
                    }
                }
                if (rippleDrawableSafe != null) {
                    rippleDrawableSafe.setHotspot(motionEvent.getX(), motionEvent.getY());
                }
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return onTouch(motionEvent);
    }

    public void setBufferedProgress(float f) {
        this.bufferedProgress = f;
        invalidate();
    }

    public void setDelegate(SeekBarViewDelegate seekBarViewDelegate) {
        this.delegate = seekBarViewDelegate;
    }

    public void setInnerColor(int i) {
        this.innerPaint1.setColor(i);
    }

    public void setLineWidth(int i) {
        this.lineWidthDp = i;
    }

    public void setMinProgress(float f) {
        this.minProgress = f;
        float progress = getProgress();
        float f2 = this.minProgress;
        if (progress < f2) {
            setProgress(f2, false);
        }
        invalidate();
    }

    public void setOuterColor(int i) {
        this.outerPaint1.setColor(i);
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.hoverDrawable;
        if (rippleDrawableSafe != null) {
            Theme.setSelectorDrawableColor(rippleDrawableSafe, ColorUtils.setAlphaComponent(i, 40), true);
        }
    }

    public void setProgress(float f) {
        setProgress(f, false);
    }

    public void setReportChanges(boolean z) {
        this.reportChanges = z;
    }

    public final void setSeekBarDrag(float f, boolean z) {
        SeekBarViewDelegate seekBarViewDelegate = this.delegate;
        if (seekBarViewDelegate != null) {
            seekBarViewDelegate.onSeekBarDrag(f, z);
        }
        int i = this.separatorsCount;
        if (i > 1) {
            int iRound = Math.round((i - 1) * f);
            if (!z && iRound != this.lastValue) {
                AndroidUtilities.vibrateCursor(this);
            }
            this.lastValue = iRound;
        }
    }

    public void setSeparatorsCount(int i) {
        this.separatorsCount = i;
    }

    public void setTwoSided(boolean z) {
        this.twoSided = z;
    }

    public final void updateTimestamps(MessageObject messageObject) {
        Integer num;
        String str;
        long duration = (long) messageObject.getDuration();
        long j = duration * 1000;
        if (j < 0) {
            this.timestamps = null;
            this.currentTimestamp = -1;
            this.timestampsAppearing = 0.0f;
            StaticLayout[] staticLayoutArr = this.timestampLabel;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.lastCaption = null;
            this.lastDuration = -1L;
            return;
        }
        CharSequence charSequence = messageObject.caption;
        if (messageObject.isYouTubeVideo()) {
            if (messageObject.youtubeDescription == null && (str = messageObject.messageOwner.media.webpage.description) != null) {
                messageObject.youtubeDescription = SpannableString.valueOf(str);
                MessageObject.addUrlsByPattern(messageObject.isOut(), messageObject.youtubeDescription, false, 3, (int) j, false);
            }
            charSequence = messageObject.youtubeDescription;
        }
        boolean z = charSequence != this.lastCaption;
        if (z || this.lastDuration != j) {
            this.lastCaption = charSequence;
            this.lastDuration = duration * 10000;
            if (getTimestampLabelWidth() != this.lastTimestampLabelWidth) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.timestamps = null;
                this.currentTimestamp = -1;
                this.timestampsAppearing = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.timestampLabel;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                URLSpanNoUnderline[] uRLSpanNoUnderlineArr = (URLSpanNoUnderline[]) spanned.getSpans(0, spanned.length(), URLSpanNoUnderline.class);
                this.timestamps = new ArrayList();
                if (z) {
                    this.timestampsAppearing = 0.0f;
                }
                if (this.timestampLabelPaint == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.timestampLabelPaint = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.timestampLabelPaint.setColor(-1);
                }
                for (URLSpanNoUnderline uRLSpanNoUnderline : uRLSpanNoUnderlineArr) {
                    if (uRLSpanNoUnderline != null && uRLSpanNoUnderline.getURL() != null && uRLSpanNoUnderline.label != null && uRLSpanNoUnderline.getURL().startsWith("audio?") && (num = Utilities.parseInt((CharSequence) uRLSpanNoUnderline.getURL().substring(6))) != null && num.intValue() >= 0) {
                        float fIntValue = (((long) num.intValue()) * 1000) / j;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(uRLSpanNoUnderline.label);
                        Emoji.replaceEmoji(spannableStringBuilder, this.timestampLabelPaint.getFontMetricsInt(), false);
                        this.timestamps.add(new Pair(Float.valueOf(fIntValue), spannableStringBuilder));
                    }
                }
                Collections.sort(this.timestamps, new ChatActivity$$ExternalSyntheticLambda18(22));
            } catch (Exception e) {
                FileLog.e(e);
                this.timestamps = null;
                this.currentTimestamp = -1;
                this.timestampsAppearing = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.timestampLabel;
                if (staticLayoutArr3 != null) {
                    staticLayoutArr3[1] = null;
                    staticLayoutArr3[0] = null;
                }
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.hoverDrawable;
    }

    public final void setProgress(float f, boolean z) {
        double dCeil;
        if (getMeasuredWidth() == 0) {
            this.progressToSet = f;
            return;
        }
        this.progressToSet = -100.0f;
        boolean z2 = this.twoSided;
        int i = this.selectorWidth;
        if (z2) {
            float measuredWidth = (getMeasuredWidth() - i) / 2;
            dCeil = f < 0.0f ? Math.ceil(((-(f + 1.0f)) * measuredWidth) + measuredWidth) : Math.ceil((f * measuredWidth) + measuredWidth);
        } else {
            dCeil = Math.ceil((getMeasuredWidth() - i) * f);
        }
        int i2 = (int) dCeil;
        int i3 = this.thumbX;
        if (i3 != i2) {
            if (z) {
                this.transitionThumbX = i3;
                this.transitionProgress = 0.0f;
            }
            this.thumbX = i2;
            if (i2 < minThumbX()) {
                this.thumbX = minThumbX();
            } else if (this.thumbX > getMeasuredWidth() - i) {
                this.thumbX = getMeasuredWidth() - i;
            }
            invalidate();
        }
    }
}
