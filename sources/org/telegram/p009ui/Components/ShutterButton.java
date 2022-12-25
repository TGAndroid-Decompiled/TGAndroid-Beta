package org.telegram.p009ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.Keep;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;

public class ShutterButton extends View {
    private ShutterButtonDelegate delegate;
    private DecelerateInterpolator interpolator;
    private long lastUpdateTime;
    private Runnable longPressed;
    private boolean pressed;
    private boolean processRelease;
    private Paint redPaint;
    private float redProgress;
    private Drawable shadowDrawable;
    private State state;
    private long totalTime;
    private Paint whitePaint;

    public interface ShutterButtonDelegate {
        boolean onTranslationChanged(float f, float f2);

        void shutterCancel();

        boolean shutterLongPressed();

        void shutterReleased();
    }

    public enum State {
        DEFAULT,
        RECORDING
    }

    public ShutterButton(Context context) {
        super(context);
        this.interpolator = new DecelerateInterpolator();
        this.longPressed = new Runnable() {
            @Override
            public void run() {
                if (ShutterButton.this.delegate == null || ShutterButton.this.delegate.shutterLongPressed()) {
                    return;
                }
                ShutterButton.this.processRelease = false;
            }
        };
        this.shadowDrawable = getResources().getDrawable(C1072R.C1073drawable.camera_btn);
        Paint paint = new Paint(1);
        this.whitePaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.whitePaint.setColor(-1);
        Paint paint2 = new Paint(1);
        this.redPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.redPaint.setColor(-3324089);
        this.state = State.DEFAULT;
    }

    public void setDelegate(ShutterButtonDelegate shutterButtonDelegate) {
        this.delegate = shutterButtonDelegate;
    }

    public ShutterButtonDelegate getDelegate() {
        return this.delegate;
    }

    private void setHighlighted(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.06f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.06f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.0f));
            animatorSet.setStartDelay(40L);
        }
        animatorSet.setDuration(120L);
        animatorSet.setInterpolator(this.interpolator);
        animatorSet.start();
    }

    @Override
    @Keep
    public void setScaleX(float f) {
        super.setScaleX(f);
        invalidate();
    }

    public State getState() {
        return this.state;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        this.shadowDrawable.setBounds(measuredWidth - AndroidUtilities.m35dp(36.0f), measuredHeight - AndroidUtilities.m35dp(36.0f), AndroidUtilities.m35dp(36.0f) + measuredWidth, AndroidUtilities.m35dp(36.0f) + measuredHeight);
        this.shadowDrawable.draw(canvas);
        if (this.pressed || getScaleX() != 1.0f) {
            float scaleX = (getScaleX() - 1.0f) / 0.06f;
            this.whitePaint.setAlpha((int) (255.0f * scaleX));
            float f = measuredWidth;
            float f2 = measuredHeight;
            canvas.drawCircle(f, f2, AndroidUtilities.m35dp(26.0f), this.whitePaint);
            if (this.state == State.RECORDING) {
                if (this.redProgress != 1.0f) {
                    long abs = Math.abs(System.currentTimeMillis() - this.lastUpdateTime);
                    if (abs > 17) {
                        abs = 17;
                    }
                    long j = this.totalTime + abs;
                    this.totalTime = j;
                    if (j > 120) {
                        this.totalTime = 120L;
                    }
                    this.redProgress = this.interpolator.getInterpolation(((float) this.totalTime) / 120.0f);
                    invalidate();
                }
                canvas.drawCircle(f, f2, AndroidUtilities.m35dp(26.5f) * scaleX * this.redProgress, this.redPaint);
            } else if (this.redProgress != 0.0f) {
                canvas.drawCircle(f, f2, AndroidUtilities.m35dp(26.5f) * scaleX, this.redPaint);
            }
        } else if (this.redProgress != 0.0f) {
            this.redProgress = 0.0f;
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(AndroidUtilities.m35dp(84.0f), AndroidUtilities.m35dp(84.0f));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            AndroidUtilities.runOnUIThread(this.longPressed, 800L);
            this.pressed = true;
            this.processRelease = true;
            setHighlighted(true);
        } else if (action == 1) {
            setHighlighted(false);
            AndroidUtilities.cancelRunOnUIThread(this.longPressed);
            if (this.processRelease) {
                this.delegate.shutterReleased();
            }
        } else if (action == 2) {
            if (x >= 0.0f && x <= getMeasuredWidth()) {
                x = 0.0f;
            }
            if (y >= 0.0f && y <= getMeasuredHeight()) {
                y = 0.0f;
            }
            if (this.delegate.onTranslationChanged(x, y)) {
                AndroidUtilities.cancelRunOnUIThread(this.longPressed);
                if (this.state == State.RECORDING) {
                    this.processRelease = false;
                    setHighlighted(false);
                    this.delegate.shutterCancel();
                    setState(State.DEFAULT, true);
                }
            }
        } else if (action == 3) {
            setHighlighted(false);
            this.pressed = false;
        }
        return true;
    }

    public void setState(State state, boolean z) {
        if (this.state != state) {
            this.state = state;
            if (z) {
                this.lastUpdateTime = System.currentTimeMillis();
                this.totalTime = 0L;
                if (this.state != State.RECORDING) {
                    this.redProgress = 0.0f;
                }
            } else if (state == State.RECORDING) {
                this.redProgress = 1.0f;
            } else {
                this.redProgress = 0.0f;
            }
            invalidate();
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setLongClickable(true);
        if (Build.VERSION.SDK_INT >= 21) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), LocaleController.getString("AccActionTakePicture", C1072R.string.AccActionTakePicture)));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK.getId(), LocaleController.getString("AccActionRecordVideo", C1072R.string.AccActionRecordVideo)));
        }
    }
}
