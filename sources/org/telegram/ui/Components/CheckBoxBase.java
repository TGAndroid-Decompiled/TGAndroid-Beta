package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;

public class CheckBoxBase {
    private static Paint forbidPaint;
    private static Paint paint;
    public long animationDuration;
    private boolean attachedToWindow;
    private int background2ColorKey;
    private int backgroundColor;
    private int backgroundColorKey;
    private Paint backgroundPaint;
    private int backgroundType;
    private ObjectAnimator checkAnimator;
    private Paint checkPaint;
    private String checkedText;
    private GenericProvider circlePaintProvider;
    private float customRadius;
    private float customRadiusFactor;
    private boolean cutCheck;
    private boolean drawUnchecked;
    private boolean forbidden;
    private boolean isChecked;
    private MessageDrawable messageDrawable;
    private View parentView;
    private float progress;
    private ProgressDelegate progressDelegate;
    private Theme.ResourcesProvider resourcesProvider;
    private float size;
    private int strokeBackgroundKey;
    private int strokeBackgroundWidth;
    private TextPaint textPaint;
    private boolean useDefaultCheck;
    public Rect bounds = new Rect();
    private RectF rect = new RectF();
    public float checkScale = 1.0f;
    private float alpha = 1.0f;
    private Path path = new Path();
    private boolean enabled = true;
    private float backgroundAlpha = 1.0f;
    private int checkColorKey = Theme.key_checkboxCheck;

    public interface ProgressDelegate {
        void setProgress(float f);
    }

    public void setAlpha(float f) {
        if (this.alpha == f) {
            return;
        }
        this.alpha = f;
        invalidate();
    }

    public void setCuttingCheck(boolean z) {
        if (this.cutCheck == z) {
            return;
        }
        this.cutCheck = z;
        this.checkPaint.setXfermode(z ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        invalidate();
    }

    public static Paint lambda$new$0(Void r0) {
        return paint;
    }

    public CheckBoxBase(View view, int i, Theme.ResourcesProvider resourcesProvider) {
        int i2 = Theme.key_chat_serviceBackground;
        this.backgroundColorKey = i2;
        this.background2ColorKey = i2;
        this.strokeBackgroundKey = Theme.key_dialogBackground;
        this.strokeBackgroundWidth = -1;
        this.customRadius = 0.0f;
        this.customRadiusFactor = 1.0f;
        this.drawUnchecked = true;
        this.circlePaintProvider = new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                return CheckBoxBase.lambda$new$0((Void) obj);
            }
        };
        this.animationDuration = 200L;
        this.resourcesProvider = resourcesProvider;
        this.parentView = view;
        this.size = i;
        if (paint == null) {
            paint = new Paint(1);
        }
        Paint paint2 = new Paint(1);
        this.checkPaint = paint2;
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = this.checkPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        this.checkPaint.setStrokeJoin(Paint.Join.ROUND);
        this.checkPaint.setStrokeWidth(AndroidUtilities.dp(1.9f));
        Paint paint4 = new Paint(1);
        this.backgroundPaint = paint4;
        paint4.setStyle(style);
        this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.2f));
    }

    public void setSize(float f) {
        if (this.size == f) {
            return;
        }
        this.size = f;
        invalidate();
    }

    public void setParentView(View view) {
        this.parentView = view;
    }

    public View getParentView() {
        return this.parentView;
    }

    public void setResourcesProvider(Theme.ResourcesProvider resourcesProvider) {
        if (this.resourcesProvider == resourcesProvider) {
            return;
        }
        this.resourcesProvider = resourcesProvider;
        invalidate();
    }

    public void onAttachedToWindow() {
        this.attachedToWindow = true;
    }

    public void onDetachedFromWindow() {
        this.attachedToWindow = false;
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i3 + i;
        int i6 = i4 + i2;
        Rect rect = this.bounds;
        if (rect.left == i && rect.top == i2 && rect.right == i5 && rect.bottom == i6) {
            return;
        }
        rect.left = i;
        rect.top = i2;
        rect.right = i5;
        rect.bottom = i6;
        invalidate();
    }

    public void setCustomRadius(float f) {
        if (this.customRadius == f) {
            return;
        }
        this.customRadius = f;
        invalidate();
    }

    public void setCustomRadiusFactor(float f) {
        if (this.customRadiusFactor == f) {
            return;
        }
        this.customRadiusFactor = f;
        invalidate();
    }

    public void setDrawUnchecked(boolean z) {
        if (this.drawUnchecked == z) {
            return;
        }
        this.drawUnchecked = z;
        invalidate();
    }

    public boolean getDrawUnchecked() {
        return this.drawUnchecked;
    }

    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
        ProgressDelegate progressDelegate = this.progressDelegate;
        if (progressDelegate != null) {
            progressDelegate.setProgress(f);
        }
    }

    public void setForbidden(boolean z) {
        if (this.forbidden == z) {
            return;
        }
        this.forbidden = z;
        invalidate();
    }

    private void invalidate() {
        View view = this.parentView;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.parentView.getParent()).invalidate();
        }
        this.parentView.invalidate();
    }

    public void setProgressDelegate(ProgressDelegate progressDelegate) {
        this.progressDelegate = progressDelegate;
    }

    public float getProgress() {
        return this.progress;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setEnabled(boolean z) {
        if (this.enabled == z) {
            return;
        }
        this.enabled = z;
        invalidate();
    }

    public void setBackgroundType(int i) {
        if (this.backgroundType == i) {
            return;
        }
        this.backgroundType = i;
        if (i == 12 || i == 13) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        } else if (i == 4 || i == 5) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.9f));
            if (i == 5) {
                this.checkPaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
            }
        } else if (i == 3) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        } else if (i != 0) {
            this.backgroundPaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        }
        invalidate();
    }

    public void cancelCheckAnimator() {
        ObjectAnimator objectAnimator = this.checkAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.checkAnimator = null;
        }
    }

    private void animateToCheckedState(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
        this.checkAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(CheckBoxBase.this.checkAnimator)) {
                    CheckBoxBase.this.checkAnimator = null;
                }
                if (CheckBoxBase.this.isChecked) {
                    return;
                }
                CheckBoxBase.this.checkedText = null;
            }
        });
        this.checkAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.checkAnimator.setDuration(this.animationDuration);
        this.checkAnimator.start();
    }

    public void setColor(int i, int i2, int i3) {
        if (this.backgroundColorKey == i && this.background2ColorKey == i2 && this.checkColorKey == i3) {
            return;
        }
        this.backgroundColorKey = i;
        this.background2ColorKey = i2;
        this.checkColorKey = i3;
        invalidate();
    }

    public void setStrokeBackgroundColor(int i) {
        if (this.strokeBackgroundKey == i) {
            return;
        }
        this.strokeBackgroundKey = i;
        invalidate();
    }

    public void setBackgroundColor(int i) {
        if (this.backgroundColor == i) {
            return;
        }
        this.backgroundColor = i;
        invalidate();
    }

    public void setBackgroundDrawable(MessageDrawable messageDrawable) {
        if (this.messageDrawable == messageDrawable) {
            return;
        }
        this.messageDrawable = messageDrawable;
        invalidate();
    }

    public void setUseDefaultCheck(boolean z) {
        if (this.useDefaultCheck == z) {
            return;
        }
        this.useDefaultCheck = z;
        invalidate();
    }

    public void setBackgroundAlpha(float f) {
        if (this.backgroundAlpha == f) {
            return;
        }
        this.backgroundAlpha = f;
        invalidate();
    }

    public void setNum(int i) {
        String str;
        if (i >= 0) {
            str = "" + (i + 1);
        } else {
            str = this.checkAnimator != null ? this.checkedText : null;
        }
        String str2 = this.checkedText;
        if (str2 == null) {
            if (str == null) {
                return;
            }
        } else if (str2.equals(str)) {
            return;
        }
        this.checkedText = str;
        invalidate();
    }

    public void setChecked(boolean z, boolean z2) {
        setChecked(-1, z, z2);
    }

    public void setChecked(int i, boolean z, boolean z2) {
        if (i >= 0) {
            String str = "" + (i + 1);
            String str2 = this.checkedText;
            if (str2 == null || !str2.equals(str)) {
                this.checkedText = str;
                invalidate();
            }
        }
        if (z == this.isChecked) {
            return;
        }
        this.isChecked = z;
        if (this.attachedToWindow && z2) {
            animateToCheckedState(z);
        } else {
            cancelCheckAnimator();
            setProgress(z ? 1.0f : 0.0f);
        }
    }

    public void draw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.CheckBoxBase.draw(android.graphics.Canvas):void");
    }

    public void setCirclePaintProvider(GenericProvider genericProvider) {
        if (this.circlePaintProvider == genericProvider) {
            return;
        }
        this.circlePaintProvider = genericProvider;
        invalidate();
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
