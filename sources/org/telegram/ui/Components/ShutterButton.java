package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.LaunchActivity;

public final class ShutterButton extends View {
    public ShutterButtonDelegate delegate;
    public final DecelerateInterpolator interpolator;
    public long lastUpdateTime;
    public final LaunchActivity.AnonymousClass18 longPressed;
    public boolean pressed;
    public boolean processRelease;
    public final Paint redPaint;
    public float redProgress;
    public final Drawable shadowDrawable;
    public State state;
    public long totalTime;
    public final Paint whitePaint;

    public interface ShutterButtonDelegate {
    }

    public final class State {
        public static final State[] $VALUES;
        public static final State DEFAULT;
        public static final State RECORDING;

        static {
            State state = new State("DEFAULT", 0);
            DEFAULT = state;
            State state2 = new State("RECORDING", 1);
            RECORDING = state2;
            $VALUES = new State[]{state, state2};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public ShutterButton(Context context) {
        super(context);
        this.interpolator = new DecelerateInterpolator();
        this.longPressed = new LaunchActivity.AnonymousClass18(this, 4);
        this.shadowDrawable = getResources().getDrawable(R.drawable.camera_btn);
        Paint paint = new Paint(1);
        this.whitePaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        Paint paint2 = new Paint(1);
        this.redPaint = paint2;
        paint2.setStyle(style);
        paint2.setColor(-3324089);
        this.state = State.DEFAULT;
    }

    private void setHighlighted(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_Y;
        Property property2 = View.SCALE_X;
        if (z) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property2, 1.06f), ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property, 1.06f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property, 1.0f));
            animatorSet.setStartDelay(40L);
        }
        animatorSet.setDuration(120L);
        animatorSet.setInterpolator(this.interpolator);
        animatorSet.start();
    }

    public ShutterButtonDelegate getDelegate() {
        return this.delegate;
    }

    public State getState() {
        return this.state;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        int iDp = measuredWidth - AndroidUtilities.dp(36.0f);
        int iDp2 = measuredHeight - AndroidUtilities.dp(36.0f);
        int iDp3 = AndroidUtilities.dp(36.0f) + measuredWidth;
        int iDp4 = AndroidUtilities.dp(36.0f) + measuredHeight;
        Drawable drawable = this.shadowDrawable;
        drawable.setBounds(iDp, iDp2, iDp3, iDp4);
        drawable.draw(canvas);
        if (!this.pressed && getScaleX() == 1.0f) {
            if (this.redProgress != 0.0f) {
                this.redProgress = 0.0f;
                return;
            }
            return;
        }
        float scaleX = (getScaleX() - 1.0f) / 0.06f;
        Paint paint = this.whitePaint;
        paint.setAlpha((int) (255.0f * scaleX));
        float f = measuredWidth;
        float f2 = measuredHeight;
        canvas.drawCircle(f, f2, AndroidUtilities.dp(26.0f), paint);
        State state = this.state;
        State state2 = State.RECORDING;
        Paint paint2 = this.redPaint;
        if (state != state2) {
            if (this.redProgress != 0.0f) {
                canvas.drawCircle(f, f2, AndroidUtilities.dp(26.5f) * scaleX, paint2);
                return;
            }
            return;
        }
        if (this.redProgress != 1.0f) {
            long jAbs = Math.abs(System.currentTimeMillis() - this.lastUpdateTime);
            if (jAbs > 17) {
                jAbs = 17;
            }
            long j = this.totalTime + jAbs;
            this.totalTime = j;
            if (j > 120) {
                this.totalTime = 120L;
            }
            this.redProgress = this.interpolator.getInterpolation(this.totalTime / 120.0f);
            invalidate();
        }
        canvas.drawCircle(f, f2, AndroidUtilities.dp(26.5f) * scaleX * this.redProgress, paint2);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setLongClickable(true);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), LocaleController.getString(R.string.AccActionTakePicture)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK.getId(), LocaleController.getString(R.string.AccActionRecordVideo)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatAttachAlertPhotoLayout.AnonymousClass10 anonymousClass10;
        File file;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        LaunchActivity.AnonymousClass18 anonymousClass18 = this.longPressed;
        if (action == 0) {
            AndroidUtilities.runOnUIThread(anonymousClass18, 800L);
            this.pressed = true;
            this.processRelease = true;
            setHighlighted(true);
            return true;
        }
        if (action == 1) {
            setHighlighted(false);
            AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
            if (this.processRelease) {
                ((ChatAttachAlertPhotoLayout.AnonymousClass10) this.delegate).shutterReleased();
            }
        } else if (action == 2) {
            if (x >= 0.0f && x <= getMeasuredWidth()) {
                x = 0.0f;
            }
            if (y >= 0.0f && y <= getMeasuredHeight()) {
                y = 0.0f;
            }
            ChatAttachAlertPhotoLayout.AnonymousClass10 anonymousClass11 = (ChatAttachAlertPhotoLayout.AnonymousClass10) this.delegate;
            boolean z = anonymousClass11.val$container.getWidth() < anonymousClass11.val$container.getHeight();
            float f = z ? x : y;
            float f2 = z ? y : x;
            boolean z2 = anonymousClass11.zoomingWas;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ChatAttachAlertPhotoLayout.this;
            if (z2 || Math.abs(f) <= Math.abs(f2)) {
                if (f2 < 0.0f) {
                    boolean z3 = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
                    chatAttachAlertPhotoLayout.showZoomControls(true);
                    chatAttachAlertPhotoLayout.zoomControlView.setZoom((-f2) / AndroidUtilities.dp(200.0f), true);
                    anonymousClass11.zoomingWas = true;
                    return true;
                }
                if (anonymousClass11.zoomingWas) {
                    chatAttachAlertPhotoLayout.zoomControlView.setZoom(0.0f, true);
                }
                if (x == 0.0f && y == 0.0f) {
                    anonymousClass11.zoomingWas = false;
                }
                if (!anonymousClass11.zoomingWas && (x != 0.0f || y != 0.0f)) {
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
                    if (this.state == State.RECORDING) {
                        this.processRelease = false;
                        setHighlighted(false);
                        anonymousClass10 = (ChatAttachAlertPhotoLayout.AnonymousClass10) this.delegate;
                        file = anonymousClass10.outputFile;
                        if (file != null) {
                            file.delete();
                            anonymousClass10.outputFile = null;
                        }
                        boolean z4 = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ChatAttachAlertPhotoLayout.this;
                        chatAttachAlertPhotoLayout2.resetRecordState();
                        CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout2.cameraView.getCameraSession(), true);
                        setState(State.DEFAULT);
                        return true;
                    }
                }
            } else if (chatAttachAlertPhotoLayout.zoomControlView.getTag() == null) {
                AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
                if (this.state == State.RECORDING) {
                    this.processRelease = false;
                    setHighlighted(false);
                    anonymousClass10 = (ChatAttachAlertPhotoLayout.AnonymousClass10) this.delegate;
                    file = anonymousClass10.outputFile;
                    if (file != null) {
                        file.delete();
                        anonymousClass10.outputFile = null;
                    }
                    boolean z5 = ChatAttachAlertPhotoLayout.mediaFromExternalCamera;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ChatAttachAlertPhotoLayout.this;
                    chatAttachAlertPhotoLayout3.resetRecordState();
                    CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout3.cameraView.getCameraSession(), true);
                    setState(State.DEFAULT);
                    return true;
                }
            }
        } else if (action == 3) {
            setHighlighted(false);
            this.pressed = false;
            return true;
        }
        return true;
    }

    public void setDelegate(ShutterButtonDelegate shutterButtonDelegate) {
        this.delegate = shutterButtonDelegate;
    }

    @Override
    public void setScaleX(float f) {
        super.setScaleX(f);
        invalidate();
    }

    public final void setState(State state) {
        if (this.state != state) {
            this.state = state;
            this.lastUpdateTime = System.currentTimeMillis();
            this.totalTime = 0L;
            if (this.state != State.RECORDING) {
                this.redProgress = 0.0f;
            }
            invalidate();
        }
    }
}
