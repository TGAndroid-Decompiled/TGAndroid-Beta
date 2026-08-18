package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.TopicsFragment;

public abstract class PullForegroundDrawable {
    private ValueAnimator accentRevalAnimatorIn;
    private ValueAnimator accentRevalAnimatorOut;
    private float accentRevalProgress;
    private float accentRevalProgressOut;
    private boolean animateOut;
    private boolean animateToColorize;
    private boolean animateToEndText;
    private boolean animateToTextIn;
    private boolean arrowAnimateTo;
    private final ArrowDrawable arrowDrawable;
    private ValueAnimator arrowRotateAnimator;
    private float arrowRotateProgress;
    private boolean bounceIn;
    private float bounceProgress;
    private View cell;
    private final Path circleClipPath;
    private Drawable generalTopicDrawable;
    private boolean isOut;
    private int lastWidth;
    private RecyclerListView listView;
    private AnimatorSet outAnimator;
    public float outCx;
    public float outCy;
    public float outImageSize;
    public float outOverScroll;
    public float outProgress;
    public float outRadius;
    private float pullProgress;
    private StaticLayout pullTooltipLayout;
    private float pullTooltipLayoutLeft;
    private float pullTooltipLayoutScale;
    private float pullTooltipLayoutWidth;
    private final CharSequence pullTooltipText;
    private StaticLayout releaseTooltipLayout;
    private float releaseTooltipLayoutLeft;
    private float releaseTooltipLayoutScale;
    private float releaseTooltipLayoutWidth;
    private final CharSequence releaseTooltipText;
    public int scrollDy;
    private float textInProgress;
    Runnable textInRunnable;
    private ValueAnimator.AnimatorUpdateListener textInUpdateListener;
    private ValueAnimator textIntAnimator;
    private float textSwappingProgress;
    private ValueAnimator.AnimatorUpdateListener textSwappingUpdateListener;
    private ValueAnimator textSwipingAnimator;
    private final TextPaint tooltipTextPaint;
    private float touchSlop;
    boolean wasSendCallback;
    private boolean willDraw;
    private int backgroundColorKey = Theme.key_chats_archivePullDownBackground;
    private int backgroundActiveColorKey = Theme.key_chats_archivePullDownBackgroundActive;
    private int avatarBackgroundColorKey = Theme.key_avatar_backgroundArchivedHidden;
    private boolean changeAvatarColor = true;
    private final Paint paintSecondary = new Paint(1);
    private final Paint paintWhite = new Paint(1);
    private final Paint paintBackgroundAccent = new Paint(1);
    private final Paint backgroundPaint = new Paint();
    private final RectF rectF = new RectF();

    protected abstract float getViewOffset();

    public void lambda$new$0(ValueAnimator valueAnimator) {
        this.textSwappingProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    public void lambda$new$1(ValueAnimator valueAnimator) {
        this.textInProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.cell;
        if (view != null) {
            view.invalidate();
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
        this.textSwappingUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$new$0(valueAnimator);
            }
        };
        this.textInUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$new$1(valueAnimator);
            }
        };
        this.textInRunnable = new Runnable() {
            @Override
            public void run() {
                PullForegroundDrawable.this.animateToTextIn = true;
                if (PullForegroundDrawable.this.textIntAnimator != null) {
                    PullForegroundDrawable.this.textIntAnimator.cancel();
                }
                PullForegroundDrawable.this.textInProgress = 0.0f;
                PullForegroundDrawable.this.textIntAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                PullForegroundDrawable.this.textIntAnimator.addUpdateListener(PullForegroundDrawable.this.textInUpdateListener);
                PullForegroundDrawable.this.textIntAnimator.setInterpolator(new LinearInterpolator());
                PullForegroundDrawable.this.textIntAnimator.setDuration(150L);
                PullForegroundDrawable.this.textIntAnimator.start();
            }
        };
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

    private void checkTextLayouts(int i) {
        if (i != this.lastWidth) {
            this.pullTooltipLayout = new StaticLayout(this.pullTooltipText, this.tooltipTextPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float fMax = 0.0f;
            for (int i2 = 0; i2 < this.pullTooltipLayout.getLineCount(); i2++) {
                fMax = Math.max(fMax, this.pullTooltipLayout.getLineWidth(i2));
            }
            float f = i;
            this.pullTooltipLayoutScale = Math.min(1.0f, f / fMax);
            int iCeil = (int) Math.ceil(fMax);
            if (this.pullTooltipLayoutScale < 0.8f) {
                this.pullTooltipLayoutScale = 0.8f;
                iCeil = HintView2.cutInFancyHalf(this.pullTooltipText, this.tooltipTextPaint);
            }
            this.pullTooltipLayout = new StaticLayout(this.pullTooltipText, this.tooltipTextPaint, iCeil, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.pullTooltipLayoutLeft = iCeil;
            this.pullTooltipLayoutWidth = 0.0f;
            for (int i3 = 0; i3 < this.pullTooltipLayout.getLineCount(); i3++) {
                this.pullTooltipLayoutLeft = Math.min(this.pullTooltipLayoutLeft, this.pullTooltipLayout.getLineLeft(i3));
                this.pullTooltipLayoutWidth = Math.max(this.pullTooltipLayoutWidth, this.pullTooltipLayout.getLineWidth(i3));
            }
            this.releaseTooltipLayout = new StaticLayout(this.releaseTooltipText, this.tooltipTextPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float fMax2 = 0.0f;
            for (int i4 = 0; i4 < this.releaseTooltipLayout.getLineCount(); i4++) {
                fMax2 = Math.max(fMax2, this.releaseTooltipLayout.getLineWidth(i4));
            }
            this.releaseTooltipLayoutScale = Math.min(1.0f, f / fMax2);
            int iCeil2 = (int) Math.ceil(fMax2);
            if (this.releaseTooltipLayoutScale < 0.8f) {
                this.releaseTooltipLayoutScale = 0.8f;
                iCeil2 = HintView2.cutInFancyHalf(this.releaseTooltipText, this.tooltipTextPaint);
            }
            this.releaseTooltipLayout = new StaticLayout(this.releaseTooltipText, this.tooltipTextPaint, iCeil2, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.releaseTooltipLayoutLeft = iCeil2;
            this.releaseTooltipLayoutWidth = 0.0f;
            for (int i5 = 0; i5 < this.releaseTooltipLayout.getLineCount(); i5++) {
                this.releaseTooltipLayoutLeft = Math.min(this.releaseTooltipLayoutLeft, this.releaseTooltipLayout.getLineLeft(i5));
                this.releaseTooltipLayoutWidth = Math.max(this.releaseTooltipLayoutWidth, this.releaseTooltipLayout.getLineWidth(i5));
            }
            this.lastWidth = i;
        }
    }

    public static int getMaxOverscroll() {
        return AndroidUtilities.dp(72.0f);
    }

    public void setCell(View view) {
        this.cell = view;
        updateColors();
    }

    public void updateColors() {
        int color = Theme.getColor(this.backgroundColorKey);
        this.tooltipTextPaint.setColor(-1);
        this.paintWhite.setColor(-1);
        this.paintSecondary.setColor(ColorUtils.setAlphaComponent(-1, 100));
        this.backgroundPaint.setColor(color);
        this.arrowDrawable.setColor(color);
        this.paintBackgroundAccent.setColor(Theme.getColor(this.avatarBackgroundColorKey));
    }

    public void setListView(RecyclerListView recyclerListView) {
        this.listView = recyclerListView;
    }

    public void drawOverScroll(Canvas canvas) {
        draw(canvas, true);
    }

    public void draw(Canvas canvas) {
        draw(canvas, false);
    }

    public void draw(Canvas canvas, boolean z) {
        View view;
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        if (!this.willDraw || this.isOut || (view = this.cell) == null || this.listView == null) {
            return;
        }
        boolean z2 = view instanceof TopicsFragment.TopicDialogCell;
        int iDp = AndroidUtilities.dp(z2 ? 15.0f : 28.0f);
        int iDp2 = AndroidUtilities.dp(8.0f);
        int iDp3 = AndroidUtilities.dp(9.0f);
        int iDp4 = AndroidUtilities.dp(18.0f);
        int viewOffset = (int) getViewOffset();
        int height = (int) (this.cell.getHeight() * getPullProgress());
        float f3 = this.bounceIn ? (this.bounceProgress * 0.07f) - 0.05f : this.bounceProgress * 0.02f;
        checkTextLayouts((this.cell.getWidth() - (iDp * 4)) - AndroidUtilities.dp(16.0f));
        updateTextProgress(getPullProgress());
        float f4 = this.outProgress * 2.0f;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        float f5 = this.outCx;
        float f6 = this.outCy;
        if (z) {
            f6 += viewOffset;
        }
        int i4 = iDp + iDp3;
        int measuredHeight = (this.cell.getMeasuredHeight() - iDp2) - iDp3;
        if (z) {
            measuredHeight += viewOffset;
        }
        int i5 = iDp4 + (iDp2 * 2);
        float f7 = height > i5 ? 1.0f : height / i5;
        canvas.save();
        if (z) {
            canvas.clipRect(0, 0, this.listView.getMeasuredWidth(), viewOffset + 1);
        }
        if (this.outProgress != 0.0f) {
            float f8 = this.outRadius;
            float width = f8 + (f8 * f3) + ((this.cell.getWidth() - this.outRadius) * (1.0f - this.outProgress));
            if (this.accentRevalProgress != 1.0f && this.accentRevalProgressOut != 1.0f) {
                canvas.drawCircle(f5, f6, width, this.backgroundPaint);
            }
            this.circleClipPath.reset();
            this.rectF.set(f5 - width, f6 - width, f5 + width, width + f6);
            this.circleClipPath.addOval(this.rectF, Path.Direction.CW);
            canvas.clipPath(this.circleClipPath);
        } else if (this.accentRevalProgress != 1.0f && this.accentRevalProgressOut != 1.0f) {
            canvas.drawPaint(this.backgroundPaint);
        }
        if (this.animateToColorize) {
            if (this.accentRevalProgressOut > this.accentRevalProgress) {
                canvas.save();
                float f9 = i4;
                float f10 = this.outProgress;
                float f11 = measuredHeight;
                canvas.translate((f5 - f9) * f10, (f6 - f11) * f10);
                canvas.drawCircle(f9, f11, this.cell.getWidth() * this.accentRevalProgressOut, this.backgroundPaint);
                canvas.restore();
            }
            if (this.accentRevalProgress > 0.0f) {
                canvas.save();
                float f12 = i4;
                float f13 = this.outProgress;
                float f14 = measuredHeight;
                canvas.translate((f5 - f12) * f13, (f6 - f14) * f13);
                canvas.drawCircle(f12, f14, this.cell.getWidth() * this.accentRevalProgress, this.paintBackgroundAccent);
                canvas.restore();
            }
        } else {
            if (this.accentRevalProgress > this.accentRevalProgressOut) {
                canvas.save();
                float f15 = i4;
                float f16 = this.outProgress;
                float f17 = measuredHeight;
                canvas.translate((f5 - f15) * f16, (f6 - f17) * f16);
                canvas.drawCircle(f15, f17, this.cell.getWidth() * this.accentRevalProgress, this.paintBackgroundAccent);
                canvas.restore();
            }
            if (this.accentRevalProgressOut > 0.0f) {
                canvas.save();
                float f18 = i4;
                float f19 = this.outProgress;
                float f20 = measuredHeight;
                canvas.translate((f5 - f18) * f19, (f6 - f20) * f19);
                canvas.drawCircle(f18, f20, this.cell.getWidth() * this.accentRevalProgressOut, this.backgroundPaint);
                canvas.restore();
            }
        }
        if (height > i5) {
            this.paintSecondary.setAlpha((int) ((1.0f - f4) * 0.4f * f7 * 255.0f));
            if (z) {
                i2 = iDp2;
                this.rectF.set(iDp, i2, iDp + iDp4, i2 + viewOffset + iDp3);
            } else {
                i2 = iDp2;
                this.rectF.set(iDp, ((this.cell.getHeight() - height) + i2) - viewOffset, iDp + iDp4, this.cell.getHeight() - i2);
            }
            i = iDp3;
            float f21 = i;
            canvas.drawRoundRect(this.rectF, f21, f21, this.paintSecondary);
        } else {
            i = iDp3;
            i2 = iDp2;
        }
        if (z) {
            canvas.restore();
            return;
        }
        if (z2) {
            measuredHeight = (int) (measuredHeight - ((this.cell.getMeasuredHeight() - AndroidUtilities.dp(41.0f)) * this.outProgress));
        }
        float f22 = this.outProgress;
        if (f22 == 0.0f || z2) {
            this.paintWhite.setAlpha((int) (f7 * 255.0f * (1.0f - f22)));
            float f23 = i4;
            float f24 = measuredHeight;
            canvas.drawCircle(f23, f24, i, this.paintWhite);
            int intrinsicHeight = this.arrowDrawable.getIntrinsicHeight();
            int intrinsicWidth = this.arrowDrawable.getIntrinsicWidth() >> 1;
            int i6 = intrinsicHeight >> 1;
            this.arrowDrawable.setBounds(i4 - intrinsicWidth, measuredHeight - i6, intrinsicWidth + i4, measuredHeight + i6);
            float f25 = 1.0f - this.arrowRotateProgress;
            if (f25 < 0.0f) {
                f25 = 0.0f;
            }
            float f26 = 1.0f - f25;
            canvas.save();
            canvas.rotate(180.0f * f26, f23, f24);
            canvas.translate(0.0f, (AndroidUtilities.dpf2(1.0f) * 1.0f) - f26);
            this.arrowDrawable.setColor(this.animateToColorize ? this.paintBackgroundAccent.getColor() : Theme.getColor(this.backgroundColorKey));
            this.arrowDrawable.setAlpha((int) ((1.0f - this.outProgress) * 255.0f));
            this.arrowDrawable.draw(canvas);
            canvas.restore();
        }
        if (getPullProgress() > 0.0f) {
            textIn();
        }
        float height2 = (this.cell.getHeight() - (i5 / 2.0f)) + AndroidUtilities.dp(6.0f);
        float width2 = (this.cell.getWidth() + (z2 ? iDp * 2 : 0)) / 2.0f;
        if (this.pullTooltipLayout != null) {
            float f27 = this.textSwappingProgress;
            if (f27 > 0.0f && f27 < 1.0f) {
                canvas.save();
                float f28 = (this.textSwappingProgress * 0.2f) + 0.8f;
                canvas.scale(f28, f28, width2, (AndroidUtilities.dp(16.0f) * (1.0f - this.textSwappingProgress)) + height2);
            }
            i3 = i4;
            f = f5;
            canvas.saveLayerAlpha(0.0f, 0.0f, this.cell.getMeasuredWidth(), this.cell.getMeasuredHeight(), (int) (this.textSwappingProgress * 255.0f * f7 * this.textInProgress), 31);
            canvas.translate((width2 - this.pullTooltipLayoutLeft) - (this.pullTooltipLayoutWidth / 2.0f), ((AndroidUtilities.dp(8.0f) * (1.0f - this.textSwappingProgress)) + height2) - this.pullTooltipLayout.getHeight());
            float f29 = this.pullTooltipLayoutScale;
            canvas.scale(f29, f29, this.pullTooltipLayoutLeft + (this.pullTooltipLayoutWidth / 2.0f), this.pullTooltipLayout.getHeight());
            this.pullTooltipLayout.draw(canvas);
            canvas.restore();
            float f30 = this.textSwappingProgress;
            if (f30 > 0.0f && f30 < 1.0f) {
                canvas.restore();
            }
        } else {
            i3 = i4;
            f = f5;
        }
        if (this.releaseTooltipLayout != null) {
            float f31 = this.textSwappingProgress;
            if (f31 > 0.0f && f31 < 1.0f) {
                canvas.save();
                float f32 = ((1.0f - this.textSwappingProgress) * 0.1f) + 0.9f;
                canvas.scale(f32, f32, width2, height2 - (AndroidUtilities.dp(8.0f) * this.textSwappingProgress));
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.cell.getMeasuredWidth(), this.cell.getMeasuredHeight(), (int) ((1.0f - this.textSwappingProgress) * 255.0f * f7 * this.textInProgress), 31);
            canvas.translate((width2 - this.releaseTooltipLayoutLeft) - (this.releaseTooltipLayoutWidth / 2.0f), (height2 + (AndroidUtilities.dp(8.0f) * this.textSwappingProgress)) - this.releaseTooltipLayout.getHeight());
            float f33 = this.releaseTooltipLayoutScale;
            canvas.scale(f33, f33, this.releaseTooltipLayoutLeft + (this.releaseTooltipLayoutWidth / 2.0f), this.releaseTooltipLayout.getHeight());
            this.releaseTooltipLayout.draw(canvas);
            canvas.restore();
            float f34 = this.textSwappingProgress;
            if (f34 > 0.0f && f34 < 1.0f) {
                canvas.restore();
            }
        }
        canvas.restore();
        if (z2 || !this.changeAvatarColor || this.outProgress <= 0.0f) {
            return;
        }
        canvas.save();
        int intrinsicWidth2 = Theme.dialogs_archiveAvatarDrawable.getIntrinsicWidth();
        int height3 = (this.cell.getHeight() - i2) - i;
        float f35 = intrinsicWidth2;
        float fDp = AndroidUtilities.dp(24.0f) / f35;
        float f36 = this.outProgress;
        float f37 = fDp + ((1.0f - fDp) * f36) + f3;
        float f38 = f;
        float f39 = i3 - f38;
        float f40 = 1.0f - f36;
        canvas.translate(f39 * f40, (height3 - f6) * f40);
        canvas.scale(f37, f37, f38, f2);
        Theme.dialogs_archiveAvatarDrawable.setProgress(0.0f);
        if (!Theme.dialogs_archiveAvatarDrawableRecolored) {
            f2 = f6;
            Theme.dialogs_archiveAvatarDrawable.beginApplyLayerColors();
            Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow1", Theme.getNonAnimatedColor(this.avatarBackgroundColorKey));
            Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow2", Theme.getNonAnimatedColor(this.avatarBackgroundColorKey));
            Theme.dialogs_archiveAvatarDrawable.commitApplyLayerColors();
            Theme.dialogs_archiveAvatarDrawableRecolored = true;
        }
        f2 = f6;
        float f41 = f35 / 2.0f;
        Theme.dialogs_archiveAvatarDrawable.setBounds((int) (f38 - f41), (int) (f2 - f41), (int) (f38 + f41), (int) (f2 + f41));
        Theme.dialogs_archiveAvatarDrawable.draw(canvas);
        canvas.restore();
    }

    private void updateTextProgress(float f) {
        boolean z = f > 0.85f;
        if (this.animateToEndText != z) {
            this.animateToEndText = z;
            if (this.textInProgress == 0.0f) {
                ValueAnimator valueAnimator = this.textSwipingAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.textSwappingProgress = z ? 0.0f : 1.0f;
            } else {
                ValueAnimator valueAnimator2 = this.textSwipingAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.textSwappingProgress, z ? 0.0f : 1.0f);
                this.textSwipingAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(this.textSwappingUpdateListener);
                this.textSwipingAnimator.setInterpolator(new LinearInterpolator());
                this.textSwipingAnimator.setDuration(170L);
                this.textSwipingAnimator.start();
            }
        }
        if (z != this.arrowAnimateTo) {
            this.arrowAnimateTo = z;
            ValueAnimator valueAnimator3 = this.arrowRotateAnimator;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.arrowRotateProgress, this.arrowAnimateTo ? 0.0f : 1.0f);
            this.arrowRotateAnimator = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    this.f$0.lambda$updateTextProgress$2(valueAnimator4);
                }
            });
            this.arrowRotateAnimator.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
            this.arrowRotateAnimator.setDuration(250L);
            this.arrowRotateAnimator.start();
        }
    }

    public void lambda$updateTextProgress$2(ValueAnimator valueAnimator) {
        this.arrowRotateProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    public void colorize(boolean z) {
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
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        this.f$0.lambda$colorize$3(valueAnimator2);
                    }
                });
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
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    this.f$0.lambda$colorize$4(valueAnimator3);
                }
            });
            this.accentRevalAnimatorOut.setInterpolator(AndroidUtilities.accelerateInterpolator);
            this.accentRevalAnimatorOut.setDuration(230L);
            this.accentRevalAnimatorOut.start();
        }
    }

    public void lambda$colorize$3(ValueAnimator valueAnimator) {
        this.accentRevalProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.cell;
        if (view != null) {
            view.invalidate();
        }
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            recyclerListView.invalidate();
        }
    }

    public void lambda$colorize$4(ValueAnimator valueAnimator) {
        this.accentRevalProgressOut = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.cell;
        if (view != null) {
            view.invalidate();
        }
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            recyclerListView.invalidate();
        }
    }

    private void textIn() {
        if (this.animateToTextIn) {
            return;
        }
        if (Math.abs(this.scrollDy) < this.touchSlop * 0.5f) {
            if (this.wasSendCallback) {
                return;
            }
            this.textInProgress = 1.0f;
            this.animateToTextIn = true;
            return;
        }
        this.wasSendCallback = true;
        this.cell.removeCallbacks(this.textInRunnable);
        this.cell.postDelayed(this.textInRunnable, 200L);
    }

    public void startOutAnimation() {
        if (this.animateOut || this.listView == null) {
            return;
        }
        AnimatorSet animatorSet = this.outAnimator;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.outAnimator.cancel();
        }
        this.animateOut = true;
        this.bounceIn = true;
        this.bounceProgress = 0.0f;
        this.outOverScroll = this.listView.getTranslationY() / AndroidUtilities.dp(100.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$startOutAnimation$5(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        valueAnimatorOfFloat.setDuration(250L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$startOutAnimation$6(valueAnimator);
            }
        });
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_BOTH;
        valueAnimatorOfFloat2.setInterpolator(cubicBezierInterpolator);
        valueAnimatorOfFloat2.setDuration(150L);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$startOutAnimation$7(valueAnimator);
            }
        });
        valueAnimatorOfFloat3.setInterpolator(cubicBezierInterpolator);
        valueAnimatorOfFloat3.setDuration(135L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.outAnimator = animatorSet2;
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PullForegroundDrawable.this.doNotShow();
            }
        });
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(valueAnimatorOfFloat2, valueAnimatorOfFloat3);
        animatorSet3.setStartDelay(180L);
        this.outAnimator.playTogether(valueAnimatorOfFloat, animatorSet3);
        this.outAnimator.start();
    }

    public void lambda$startOutAnimation$5(ValueAnimator valueAnimator) {
        setOutProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
        View view = this.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    public void lambda$startOutAnimation$6(ValueAnimator valueAnimator) {
        this.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.bounceIn = true;
        View view = this.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    public void lambda$startOutAnimation$7(ValueAnimator valueAnimator) {
        this.bounceProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.bounceIn = false;
        View view = this.cell;
        if (view != null) {
            view.invalidate();
        }
    }

    private void setOutProgress(float f) {
        this.outProgress = f;
        int iBlendARGB = ColorUtils.blendARGB(Theme.getNonAnimatedColor(this.avatarBackgroundColorKey), Theme.getNonAnimatedColor(this.backgroundActiveColorKey), 1.0f - this.outProgress);
        this.paintBackgroundAccent.setColor(iBlendARGB);
        if (this.changeAvatarColor && isDraw()) {
            Theme.dialogs_archiveAvatarDrawable.beginApplyLayerColors();
            Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow1", iBlendARGB);
            Theme.dialogs_archiveAvatarDrawable.setLayerColor("Arrow2", iBlendARGB);
            Theme.dialogs_archiveAvatarDrawable.commitApplyLayerColors();
            Theme.dialogs_archiveAvatarDrawableRecolored = true;
        }
    }

    public void doNotShow() {
        ValueAnimator valueAnimator = this.textSwipingAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.textIntAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        View view = this.cell;
        if (view != null) {
            view.removeCallbacks(this.textInRunnable);
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

    public void showHidden() {
        AnimatorSet animatorSet = this.outAnimator;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.outAnimator.cancel();
        }
        setOutProgress(0.0f);
        this.isOut = false;
        this.animateOut = false;
    }

    public boolean isDraw() {
        return this.willDraw && !this.isOut;
    }

    public void setWillDraw(boolean z) {
        this.willDraw = z;
    }

    public void resetText() {
        ValueAnimator valueAnimator = this.textIntAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.cell;
        if (view != null) {
            view.removeCallbacks(this.textInRunnable);
        }
        this.textInProgress = 0.0f;
        this.animateToTextIn = false;
        this.wasSendCallback = false;
    }

    public float getPullProgress() {
        return this.pullProgress;
    }

    public void setPullProgress(float f) {
        if (this.pullProgress != f) {
            this.pullProgress = f;
            View view = this.cell;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    private class ArrowDrawable extends Drawable {
        private float lastDensity;
        private Path path = new Path();
        private Paint paint = new Paint(1);

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public ArrowDrawable() {
            updatePath();
        }

        private void updatePath() {
            int iDp = AndroidUtilities.dp(18.0f);
            this.path.reset();
            float f = iDp >> 1;
            this.path.moveTo(f, AndroidUtilities.dpf2(4.98f));
            this.path.lineTo(AndroidUtilities.dpf2(4.95f), AndroidUtilities.dpf2(9.0f));
            this.path.lineTo(iDp - AndroidUtilities.dpf2(4.95f), AndroidUtilities.dpf2(9.0f));
            this.path.lineTo(f, AndroidUtilities.dpf2(4.98f));
            this.paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.paint.setStrokeJoin(Paint.Join.ROUND);
            this.paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
            this.lastDensity = AndroidUtilities.density;
        }

        public void setColor(int i) {
            this.paint.setColor(i);
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(18.0f);
        }

        @Override
        public int getIntrinsicWidth() {
            return getIntrinsicHeight();
        }

        @Override
        public void draw(Canvas canvas) {
            if (this.lastDensity != AndroidUtilities.density) {
                updatePath();
            }
            canvas.save();
            canvas.translate(getBounds().left, getBounds().top);
            canvas.drawPath(this.path, this.paint);
            canvas.drawRect(AndroidUtilities.dpf2(7.56f), AndroidUtilities.dpf2(8.0f), AndroidUtilities.dp(18.0f) - AndroidUtilities.dpf2(7.56f), AndroidUtilities.dpf2(11.1f), this.paint);
            canvas.restore();
        }
    }
}
