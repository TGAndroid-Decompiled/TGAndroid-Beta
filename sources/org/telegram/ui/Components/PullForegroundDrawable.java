package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.TopicsFragment;

public abstract class PullForegroundDrawable {
    public ValueAnimator accentRevalAnimatorIn;
    public ValueAnimator accentRevalAnimatorOut;
    public float accentRevalProgress;
    public float accentRevalProgressOut;
    public boolean animateOut;
    public boolean animateToColorize;
    public boolean animateToEndText;
    public boolean animateToTextIn;
    public boolean arrowAnimateTo;
    public final ArrowDrawable arrowDrawable;
    public ValueAnimator arrowRotateAnimator;
    public float arrowRotateProgress;
    public boolean bounceIn;
    public float bounceProgress;
    public DialogCell cell;
    public final Path circleClipPath;
    public final Drawable generalTopicDrawable;
    public boolean isOut;
    public int lastWidth;
    public BlurredRecyclerView listView;
    public AnimatorSet outAnimator;
    public float outCx;
    public float outCy;
    public float outProgress;
    public float outRadius;
    public float pullProgress;
    public StaticLayout pullTooltipLayout;
    public float pullTooltipLayoutLeft;
    public float pullTooltipLayoutScale;
    public float pullTooltipLayoutWidth;
    public final CharSequence pullTooltipText;
    public StaticLayout releaseTooltipLayout;
    public float releaseTooltipLayoutLeft;
    public float releaseTooltipLayoutScale;
    public float releaseTooltipLayoutWidth;
    public final CharSequence releaseTooltipText;
    public int scrollDy;
    public float textInProgress;
    public final BubbleActivity.AnonymousClass1 textInRunnable;
    public final PullForegroundDrawable$$ExternalSyntheticLambda0 textInUpdateListener;
    public ValueAnimator textIntAnimator;
    public float textSwappingProgress;
    public final PullForegroundDrawable$$ExternalSyntheticLambda0 textSwappingUpdateListener;
    public ValueAnimator textSwipingAnimator;
    public final TextPaint tooltipTextPaint;
    public final float touchSlop;
    public boolean wasSendCallback;
    public boolean willDraw;
    public final int backgroundColorKey = Theme.key_chats_archivePullDownBackground;
    public final int backgroundActiveColorKey = Theme.key_chats_archivePullDownBackgroundActive;
    public final int avatarBackgroundColorKey = Theme.key_avatar_backgroundArchivedHidden;
    public final boolean changeAvatarColor = true;
    public final Paint paintSecondary = new Paint(1);
    public final Paint paintWhite = new Paint(1);
    public final Paint paintBackgroundAccent = new Paint(1);
    public final Paint backgroundPaint = new Paint();
    public final RectF rectF = new RectF();

    public final class ArrowDrawable extends Drawable {
        public float lastDensity;
        public final Path path = new Path();
        public final Paint paint = new Paint(1);

        public ArrowDrawable() {
            updatePath();
        }

        @Override
        public final void draw(Canvas canvas) {
            if (this.lastDensity != AndroidUtilities.density) {
                updatePath();
            }
            canvas.save();
            canvas.translate(getBounds().left, getBounds().top);
            Path path = this.path;
            Paint paint = this.paint;
            canvas.drawPath(path, paint);
            canvas.drawRect(AndroidUtilities.dpf2(7.56f), AndroidUtilities.dpf2(8.0f), AndroidUtilities.dp(18.0f) - AndroidUtilities.dpf2(7.56f), AndroidUtilities.dpf2(11.1f), paint);
            canvas.restore();
        }

        @Override
        public final int getIntrinsicHeight() {
            return AndroidUtilities.dp(18.0f);
        }

        @Override
        public final int getIntrinsicWidth() {
            return AndroidUtilities.dp(18.0f);
        }

        @Override
        public final int getOpacity() {
            return 0;
        }

        @Override
        public final void setAlpha(int i) {
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public final void updatePath() {
            int iDp = AndroidUtilities.dp(18.0f);
            Path path = this.path;
            path.reset();
            float f = iDp >> 1;
            path.moveTo(f, AndroidUtilities.dpf2(4.98f));
            path.lineTo(AndroidUtilities.dpf2(4.95f), AndroidUtilities.dpf2(9.0f));
            path.lineTo(iDp - AndroidUtilities.dpf2(4.95f), AndroidUtilities.dpf2(9.0f));
            path.lineTo(f, AndroidUtilities.dpf2(4.98f));
            Paint.Style style = Paint.Style.FILL_AND_STROKE;
            Paint paint = this.paint;
            paint.setStyle(style);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
            this.lastDensity = AndroidUtilities.density;
        }
    }

    public PullForegroundDrawable(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.tooltipTextPaint = textPaint;
        this.arrowDrawable = new ArrowDrawable();
        this.circleClipPath = new Path();
        this.textSwappingProgress = 1.0f;
        this.arrowRotateProgress = 1.0f;
        this.accentRevalProgress = 1.0f;
        this.accentRevalProgressOut = 1.0f;
        this.pullTooltipLayoutScale = 1.0f;
        this.releaseTooltipLayoutScale = 1.0f;
        this.textSwappingUpdateListener = new PullForegroundDrawable$$ExternalSyntheticLambda0(this, 3);
        this.textInUpdateListener = new PullForegroundDrawable$$ExternalSyntheticLambda0(this, 4);
        this.textInRunnable = new BubbleActivity.AnonymousClass1(this, 28);
        this.wasSendCallback = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.touchSlop = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        this.pullTooltipText = charSequence;
        this.releaseTooltipText = charSequence2;
        try {
            this.generalTopicDrawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_general).mutate();
        } catch (Exception unused) {
        }
    }

    public final void colorize(boolean z) {
        if (this.animateToColorize != z) {
            this.animateToColorize = z;
            if (z) {
                ValueAnimator valueAnimator = this.accentRevalAnimatorIn;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.accentRevalAnimatorIn = null;
                }
                this.accentRevalProgress = 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.accentRevalAnimatorIn = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new PullForegroundDrawable$$ExternalSyntheticLambda0(this, 0));
                this.accentRevalAnimatorIn.setInterpolator(AndroidUtilities.accelerateInterpolator);
                this.accentRevalAnimatorIn.setDuration(230L);
                this.accentRevalAnimatorIn.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.accentRevalAnimatorOut;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.accentRevalAnimatorOut = null;
            }
            this.accentRevalProgressOut = 0.0f;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.accentRevalAnimatorOut = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(new PullForegroundDrawable$$ExternalSyntheticLambda0(this, 1));
            this.accentRevalAnimatorOut.setInterpolator(AndroidUtilities.accelerateInterpolator);
            this.accentRevalAnimatorOut.setDuration(230L);
            this.accentRevalAnimatorOut.start();
        }
    }

    public final void doNotShow() {
        ValueAnimator valueAnimator = this.textSwipingAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.textIntAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        DialogCell dialogCell = this.cell;
        if (dialogCell != null) {
            dialogCell.removeCallbacks(this.textInRunnable);
        }
        ValueAnimator valueAnimator3 = this.accentRevalAnimatorIn;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.textSwappingProgress = 1.0f;
        this.arrowRotateProgress = 1.0f;
        this.animateToEndText = false;
        this.arrowAnimateTo = false;
        this.animateToTextIn = false;
        this.wasSendCallback = false;
        this.textInProgress = 0.0f;
        this.isOut = true;
        setOutProgress(1.0f);
        this.animateToColorize = false;
        this.accentRevalProgress = 0.0f;
    }

    public final void draw(Canvas canvas, boolean z) {
        DialogCell dialogCell;
        float f;
        int i;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
        if (!this.willDraw || this.isOut || (dialogCell = this.cell) == null || this.listView == null) {
            return;
        }
        boolean z2 = dialogCell instanceof TopicsFragment.TopicDialogCell;
        int iDp = AndroidUtilities.dp(z2 ? 15.0f : 28.0f);
        int iDp2 = AndroidUtilities.dp(8.0f);
        int iDp3 = AndroidUtilities.dp(9.0f);
        int iDp4 = AndroidUtilities.dp(18.0f);
        int viewOffset = (int) getViewOffset();
        int height = (int) (this.cell.getHeight() * this.pullProgress);
        float f6 = this.bounceIn ? (this.bounceProgress * 0.07f) - 0.05f : this.bounceProgress * 0.02f;
        int width = (this.cell.getWidth() - (iDp * 4)) - AndroidUtilities.dp(16.0f);
        if (width != this.lastWidth) {
            TextPaint textPaint = this.tooltipTextPaint;
            this.pullTooltipLayout = new StaticLayout(this.pullTooltipText, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float fMax = 0.0f;
            for (int i3 = 0; i3 < this.pullTooltipLayout.getLineCount(); i3++) {
                fMax = Math.max(fMax, this.pullTooltipLayout.getLineWidth(i3));
            }
            float f7 = width;
            this.pullTooltipLayoutScale = Math.min(1.0f, f7 / fMax);
            int iCeil = (int) Math.ceil(fMax);
            if (this.pullTooltipLayoutScale < 0.8f) {
                this.pullTooltipLayoutScale = 0.8f;
                iCeil = HintView2.cutInFancyHalf(this.pullTooltipText, textPaint);
            }
            int i4 = iCeil;
            this.pullTooltipLayout = new StaticLayout(this.pullTooltipText, textPaint, i4, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.pullTooltipLayoutLeft = i4;
            this.pullTooltipLayoutWidth = 0.0f;
            for (int i5 = 0; i5 < this.pullTooltipLayout.getLineCount(); i5++) {
                this.pullTooltipLayoutLeft = Math.min(this.pullTooltipLayoutLeft, this.pullTooltipLayout.getLineLeft(i5));
                this.pullTooltipLayoutWidth = Math.max(this.pullTooltipLayoutWidth, this.pullTooltipLayout.getLineWidth(i5));
            }
            this.releaseTooltipLayout = new StaticLayout(this.releaseTooltipText, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float fMax2 = 0.0f;
            for (int i6 = 0; i6 < this.releaseTooltipLayout.getLineCount(); i6++) {
                fMax2 = Math.max(fMax2, this.releaseTooltipLayout.getLineWidth(i6));
            }
            this.releaseTooltipLayoutScale = Math.min(1.0f, f7 / fMax2);
            int iCeil2 = (int) Math.ceil(fMax2);
            if (this.releaseTooltipLayoutScale < 0.8f) {
                this.releaseTooltipLayoutScale = 0.8f;
                iCeil2 = HintView2.cutInFancyHalf(this.releaseTooltipText, textPaint);
            }
            int i7 = iCeil2;
            this.releaseTooltipLayout = new StaticLayout(this.releaseTooltipText, textPaint, i7, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.releaseTooltipLayoutLeft = i7;
            this.releaseTooltipLayoutWidth = 0.0f;
            for (int i8 = 0; i8 < this.releaseTooltipLayout.getLineCount(); i8++) {
                this.releaseTooltipLayoutLeft = Math.min(this.releaseTooltipLayoutLeft, this.releaseTooltipLayout.getLineLeft(i8));
                this.releaseTooltipLayoutWidth = Math.max(this.releaseTooltipLayoutWidth, this.releaseTooltipLayout.getLineWidth(i8));
            }
            this.lastWidth = width;
        }
        boolean z3 = this.pullProgress > 0.85f;
        if (this.animateToEndText != z3) {
            this.animateToEndText = z3;
            if (this.textInProgress == 0.0f) {
                ValueAnimator valueAnimator = this.textSwipingAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.textSwappingProgress = z3 ? 0.0f : 1.0f;
            } else {
                ValueAnimator valueAnimator2 = this.textSwipingAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.textSwappingProgress, z3 ? 0.0f : 1.0f);
                this.textSwipingAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(this.textSwappingUpdateListener);
                this.textSwipingAnimator.setInterpolator(new LinearInterpolator());
                this.textSwipingAnimator.setDuration(170L);
                this.textSwipingAnimator.start();
            }
        }
        if (z3 != this.arrowAnimateTo) {
            this.arrowAnimateTo = z3;
            ValueAnimator valueAnimator3 = this.arrowRotateAnimator;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.arrowRotateProgress, this.arrowAnimateTo ? 0.0f : 1.0f);
            this.arrowRotateAnimator = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(new PullForegroundDrawable$$ExternalSyntheticLambda0(this, 2));
            this.arrowRotateAnimator.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
            this.arrowRotateAnimator.setDuration(250L);
            this.arrowRotateAnimator.start();
        }
        float f8 = this.outProgress * 2.0f;
        if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        float f9 = this.outCx;
        float f10 = this.outCy;
        if (z) {
            f10 += viewOffset;
        }
        int i9 = iDp + iDp3;
        int measuredHeight = (this.cell.getMeasuredHeight() - iDp2) - iDp3;
        if (z) {
            measuredHeight += viewOffset;
        }
        int i10 = (iDp2 * 2) + iDp4;
        float f11 = f8;
        float f12 = height > i10 ? 1.0f : height / i10;
        canvas.save();
        float f13 = f12;
        if (z) {
            canvas.clipRect(0, 0, this.listView.getMeasuredWidth(), viewOffset + 1);
        }
        float f14 = this.outProgress;
        Paint paint = this.backgroundPaint;
        RectF rectF = this.rectF;
        if (f14 == 0.0f) {
            if (this.accentRevalProgress != 1.0f && this.accentRevalProgressOut != 1.0f) {
                canvas.drawPaint(paint);
            }
            f = f10;
        } else {
            float f15 = this.outRadius;
            float fM = DiffUtil.m(1.0f, this.outProgress, this.cell.getWidth() - this.outRadius, (f15 * f6) + f15);
            if (this.accentRevalProgress != 1.0f && this.accentRevalProgressOut != 1.0f) {
                canvas.drawCircle(f9, f10, fM, paint);
            }
            Path path = this.circleClipPath;
            path.reset();
            f = f10;
            rectF.set(f9 - fM, f10 - fM, f9 + fM, f + fM);
            path.addOval(rectF, Path.Direction.CW);
            canvas.clipPath(path);
        }
        boolean z4 = this.animateToColorize;
        Paint paint2 = this.paintBackgroundAccent;
        if (z4) {
            if (this.accentRevalProgressOut > this.accentRevalProgress) {
                canvas.save();
                float f16 = i9;
                float f17 = this.outProgress;
                float f18 = measuredHeight;
                canvas.translate((f9 - f16) * f17, f17 * (f - f18));
                canvas.drawCircle(f16, f18, this.cell.getWidth() * this.accentRevalProgressOut, paint);
                canvas.restore();
            }
            if (this.accentRevalProgress > 0.0f) {
                canvas.save();
                float f19 = i9;
                float f20 = this.outProgress;
                float f21 = measuredHeight;
                canvas.translate((f9 - f19) * f20, (f - f21) * f20);
                canvas.drawCircle(f19, f21, this.cell.getWidth() * this.accentRevalProgress, paint2);
                canvas.restore();
            }
        } else {
            if (this.accentRevalProgress > this.accentRevalProgressOut) {
                canvas.save();
                float f22 = i9;
                float f23 = this.outProgress;
                float f24 = measuredHeight;
                canvas.translate((f9 - f22) * f23, f23 * (f - f24));
                canvas.drawCircle(f22, f24, this.cell.getWidth() * this.accentRevalProgress, paint2);
                canvas.restore();
            }
            if (this.accentRevalProgressOut > 0.0f) {
                canvas.save();
                float f25 = i9;
                float f26 = this.outProgress;
                float f27 = measuredHeight;
                canvas.translate((f9 - f25) * f26, f26 * (f - f27));
                canvas.drawCircle(f25, f27, this.cell.getWidth() * this.accentRevalProgressOut, paint);
                canvas.restore();
            }
        }
        if (height > i10) {
            Paint paint3 = this.paintSecondary;
            paint3.setAlpha((int) ((1.0f - f11) * 0.4f * f13 * 255.0f));
            if (z) {
                i = iDp2;
                f2 = 255.0f;
                rectF.set(iDp, i, iDp + iDp4, i + viewOffset + iDp3);
            } else {
                i = iDp2;
                f2 = 255.0f;
                rectF.set(iDp, ((this.cell.getHeight() - height) + i) - viewOffset, iDp + iDp4, this.cell.getHeight() - i);
            }
            float f28 = iDp3;
            canvas.drawRoundRect(rectF, f28, f28, paint3);
        } else {
            i = iDp2;
            f2 = 255.0f;
        }
        if (z) {
            canvas.restore();
            return;
        }
        if (z2 != 0) {
            measuredHeight = (int) (measuredHeight - ((this.cell.getMeasuredHeight() - AndroidUtilities.dp(41.0f)) * this.outProgress));
        }
        int i11 = measuredHeight;
        float f29 = this.outProgress;
        if (f29 == 0.0f || z2) {
            Paint paint4 = this.paintWhite;
            paint4.setAlpha((int) ((1.0f - f29) * f13 * f2));
            float f30 = i9;
            float f31 = i11;
            canvas.drawCircle(f30, f31, iDp3, paint4);
            ArrowDrawable arrowDrawable = this.arrowDrawable;
            arrowDrawable.getClass();
            int iDp5 = AndroidUtilities.dp(18.0f);
            int iDp6 = AndroidUtilities.dp(18.0f) >> 1;
            int i12 = iDp5 >> 1;
            arrowDrawable.setBounds(i9 - iDp6, i11 - i12, i9 + iDp6, i11 + i12);
            float f32 = 1.0f - this.arrowRotateProgress;
            if (f32 < 0.0f) {
                f32 = 0.0f;
            }
            float f33 = 1.0f - f32;
            canvas.save();
            canvas.rotate(180.0f * f33, f30, f31);
            canvas.translate(0.0f, (AndroidUtilities.dpf2(1.0f) * 1.0f) - f33);
            arrowDrawable.paint.setColor(this.animateToColorize ? paint2.getColor() : Theme.getColor(null, this.backgroundColorKey, false));
            arrowDrawable.draw(canvas);
            canvas.restore();
        }
        if (this.pullProgress > 0.0f && !this.animateToTextIn) {
            if (Math.abs(this.scrollDy) >= this.touchSlop * 0.5f) {
                this.wasSendCallback = true;
                DialogCell dialogCell2 = this.cell;
                BubbleActivity.AnonymousClass1 anonymousClass1 = this.textInRunnable;
                dialogCell2.removeCallbacks(anonymousClass1);
                this.cell.postDelayed(anonymousClass1, 200L);
            } else if (!this.wasSendCallback) {
                this.textInProgress = 1.0f;
                this.animateToTextIn = true;
            }
        }
        float height2 = (this.cell.getHeight() - (i10 / 2.0f)) + AndroidUtilities.dp(6.0f);
        float width2 = (this.cell.getWidth() + (z2 != 0 ? iDp * 2 : 0)) / 2.0f;
        if (this.pullTooltipLayout != null) {
            float f34 = this.textSwappingProgress;
            f5 = 1.0f;
            if (f34 > 0.0f && f34 < 1.0f) {
                canvas.save();
                float f35 = (this.textSwappingProgress * 0.2f) + 0.8f;
                canvas.scale(f35, f35, width2, DiffUtil.m(1.0f, this.textSwappingProgress, AndroidUtilities.dp(16.0f), height2));
            }
            i2 = i9;
            f3 = f13;
            f4 = f;
            canvas.saveLayerAlpha(0.0f, 0.0f, this.cell.getMeasuredWidth(), this.cell.getMeasuredHeight(), (int) (this.textSwappingProgress * f2 * f13 * this.textInProgress), 31);
            canvas.translate((width2 - this.pullTooltipLayoutLeft) - (this.pullTooltipLayoutWidth / 2.0f), DiffUtil.m(1.0f, this.textSwappingProgress, AndroidUtilities.dp(8.0f), height2) - this.pullTooltipLayout.getHeight());
            float f36 = this.pullTooltipLayoutScale;
            canvas.scale(f36, f36, (this.pullTooltipLayoutWidth / 2.0f) + this.pullTooltipLayoutLeft, this.pullTooltipLayout.getHeight());
            this.pullTooltipLayout.draw(canvas);
            canvas.restore();
            float f37 = this.textSwappingProgress;
            if (f37 > 0.0f && f37 < 1.0f) {
                canvas.restore();
            }
        } else {
            i2 = i9;
            f3 = f13;
            f4 = f;
            f5 = 1.0f;
        }
        if (this.releaseTooltipLayout != null) {
            float f38 = this.textSwappingProgress;
            if (f38 > 0.0f && f38 < f5) {
                canvas.save();
                float fM2 = DiffUtil.m(f5, this.textSwappingProgress, 0.1f, 0.9f);
                canvas.scale(fM2, fM2, width2, height2 - (AndroidUtilities.dp(8.0f) * this.textSwappingProgress));
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.cell.getMeasuredWidth(), this.cell.getMeasuredHeight(), (int) (ImageReceiver$$ExternalSyntheticOutline2.m(f5, this.textSwappingProgress, 255.0f, f3) * this.textInProgress), 31);
            canvas.translate((width2 - this.releaseTooltipLayoutLeft) - (this.releaseTooltipLayoutWidth / 2.0f), ((AndroidUtilities.dp(8.0f) * this.textSwappingProgress) + height2) - this.releaseTooltipLayout.getHeight());
            float f39 = this.releaseTooltipLayoutScale;
            canvas.scale(f39, f39, (this.releaseTooltipLayoutWidth / 2.0f) + this.releaseTooltipLayoutLeft, this.releaseTooltipLayout.getHeight());
            this.releaseTooltipLayout.draw(canvas);
            canvas.restore();
            float f40 = this.textSwappingProgress;
            if (f40 > 0.0f && f40 < f5) {
                canvas.restore();
            }
        }
        canvas.restore();
        if (z2 == 0 && this.changeAvatarColor && this.outProgress > 0.0f) {
            canvas.save();
            int i13 = Theme.dialogs_archiveAvatarDrawable.width;
            int height3 = (this.cell.getHeight() - i) - iDp3;
            float f41 = i13;
            float fDp = AndroidUtilities.dp(24.0f) / f41;
            float f42 = this.outProgress;
            float fM3 = OKLCH.m(f5 - fDp, f42, fDp, f6);
            float f43 = f5 - f42;
            canvas.translate((i2 - f9) * f43, (height3 - f4) * f43);
            canvas.scale(fM3, fM3, f9, f4);
            Theme.dialogs_archiveAvatarDrawable.setProgress(0.0f, true);
            if (!Theme.dialogs_archiveAvatarDrawableRecolored) {
                RLottieDrawable rLottieDrawable = Theme.dialogs_archiveAvatarDrawable;
                rLottieDrawable.applyingLayerColors = true;
                int i14 = this.avatarBackgroundColorKey;
                OKLCH.m(Theme.getColor(null, i14, true), rLottieDrawable.newColorUpdates, "Arrow1", rLottieDrawable);
                RLottieDrawable rLottieDrawable2 = Theme.dialogs_archiveAvatarDrawable;
                OKLCH.m(Theme.getColor(null, i14, true), rLottieDrawable2.newColorUpdates, "Arrow2", rLottieDrawable2);
                Theme.dialogs_archiveAvatarDrawable.commitApplyLayerColors();
                Theme.dialogs_archiveAvatarDrawableRecolored = true;
            }
            float f44 = f41 / 2.0f;
            Theme.dialogs_archiveAvatarDrawable.setBounds((int) (f9 - f44), (int) (f4 - f44), (int) (f9 + f44), (int) (f44 + f4));
            Theme.dialogs_archiveAvatarDrawable.draw(canvas);
            canvas.restore();
        }
    }

    public abstract float getViewOffset();

    public final void setOutProgress(float f) {
        this.outProgress = f;
        int iBlendARGB = ColorUtils.blendARGB(1.0f - this.outProgress, Theme.getColor(null, this.avatarBackgroundColorKey, true), Theme.getColor(null, this.backgroundActiveColorKey, true));
        this.paintBackgroundAccent.setColor(iBlendARGB);
        if (this.changeAvatarColor && this.willDraw && !this.isOut) {
            RLottieDrawable rLottieDrawable = Theme.dialogs_archiveAvatarDrawable;
            rLottieDrawable.applyingLayerColors = true;
            OKLCH.m(iBlendARGB, rLottieDrawable.newColorUpdates, "Arrow1", rLottieDrawable);
            RLottieDrawable rLottieDrawable2 = Theme.dialogs_archiveAvatarDrawable;
            OKLCH.m(iBlendARGB, rLottieDrawable2.newColorUpdates, "Arrow2", rLottieDrawable2);
            Theme.dialogs_archiveAvatarDrawable.commitApplyLayerColors();
            Theme.dialogs_archiveAvatarDrawableRecolored = true;
        }
    }

    public final void setWillDraw(boolean z) {
        this.willDraw = z;
    }

    public final void showHidden() {
        AnimatorSet animatorSet = this.outAnimator;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.outAnimator.cancel();
        }
        setOutProgress(0.0f);
        this.isOut = false;
        this.animateOut = false;
    }

    public final void updateColors() {
        int color = Theme.getColor(null, this.backgroundColorKey, false);
        this.tooltipTextPaint.setColor(-1);
        this.paintWhite.setColor(-1);
        this.paintSecondary.setColor(ColorUtils.setAlphaComponent(-1, 100));
        this.backgroundPaint.setColor(color);
        this.arrowDrawable.paint.setColor(color);
        this.paintBackgroundAccent.setColor(Theme.getColor(null, this.avatarBackgroundColorKey, false));
    }
}
