package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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

public class ShutterButton extends View {

    public Drawable f26529a;

    public DecelerateInterpolator f26530b;

    public Paint f26531c;
    public Paint d;

    public nu0 f26532e;

    public ou0 f26533f;
    public boolean h;

    public float f26534n;

    public long f26535r;

    public long f26536s;
    public boolean v;

    public mu0 f26537w;

    private void setHighlighted(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_Y;
        Property property2 = View.SCALE_X;
        if (z10) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property2, 1.06f), ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property, 1.06f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this, (Property<ShutterButton, Float>) property, 1.0f));
            animatorSet.setStartDelay(40L);
        }
        animatorSet.setDuration(120L);
        animatorSet.setInterpolator(this.f26530b);
        animatorSet.start();
    }

    public final void a(ou0 ou0Var) {
        if (this.f26533f != ou0Var) {
            this.f26533f = ou0Var;
            this.f26535r = System.currentTimeMillis();
            this.f26536s = 0L;
            if (this.f26533f != ou0.f31411b) {
                this.f26534n = 0.0f;
            }
            invalidate();
        }
    }

    public nu0 getDelegate() {
        return this.f26532e;
    }

    public ou0 getState() {
        return this.f26533f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.f26531c;
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        Drawable drawable = this.f26529a;
        drawable.setBounds(measuredWidth - AndroidUtilities.dp(36.0f), measuredHeight - AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f) + measuredWidth, AndroidUtilities.dp(36.0f) + measuredHeight);
        drawable.draw(canvas);
        if (!this.h && getScaleX() == 1.0f) {
            if (this.f26534n != 0.0f) {
                this.f26534n = 0.0f;
                return;
            }
            return;
        }
        float scaleX = (getScaleX() - 1.0f) / 0.06f;
        paint2.setAlpha((int) (255.0f * scaleX));
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(26.0f), paint2);
        if (this.f26533f != ou0.f31411b) {
            if (this.f26534n != 0.0f) {
                canvas.drawCircle(f10, f11, AndroidUtilities.dp(26.5f) * scaleX, paint);
                return;
            }
            return;
        }
        if (this.f26534n != 1.0f) {
            long jAbs = Math.abs(System.currentTimeMillis() - this.f26535r);
            if (jAbs > 17) {
                jAbs = 17;
            }
            long j10 = this.f26536s + jAbs;
            this.f26536s = j10;
            if (j10 > 120) {
                this.f26536s = 120L;
            }
            this.f26534n = this.f26530b.getInterpolation(this.f26536s / 120.0f);
            invalidate();
        }
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(26.5f) * scaleX * this.f26534n, paint);
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
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(84.0f), AndroidUtilities.dp(84.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        el elVar;
        File file;
        mu0 mu0Var = this.f26537w;
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            AndroidUtilities.runOnUIThread(mu0Var, 800L);
            this.h = true;
            this.v = true;
            setHighlighted(true);
            return true;
        }
        if (action == 1) {
            setHighlighted(false);
            AndroidUtilities.cancelRunOnUIThread(mu0Var);
            if (this.v) {
                ((el) this.f26532e).b();
            }
        } else if (action == 2) {
            if (x8 >= 0.0f && x8 <= getMeasuredWidth()) {
                x8 = 0.0f;
            }
            if (y10 >= 0.0f && y10 <= getMeasuredHeight()) {
                y10 = 0.0f;
            }
            el elVar2 = (el) this.f26532e;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = elVar2.f28078e;
            k81 k81Var = chatAttachAlertPhotoLayout.f26256h0;
            org.telegram.ui.ActionBar.c3 c3Var = elVar2.d;
            boolean z10 = c3Var.getWidth() < c3Var.getHeight();
            float f10 = z10 ? x8 : y10;
            float f11 = z10 ? y10 : x8;
            if (elVar2.f28076b || Math.abs(f10) <= Math.abs(f11)) {
                if (f11 < 0.0f) {
                    boolean z11 = ChatAttachAlertPhotoLayout.f26237m1;
                    chatAttachAlertPhotoLayout.t0(true);
                    k81Var.b((-f11) / AndroidUtilities.dp(200.0f), true);
                    elVar2.f28076b = true;
                    return true;
                }
                if (elVar2.f28076b) {
                    k81Var.b(0.0f, true);
                }
                if (x8 == 0.0f && y10 == 0.0f) {
                    elVar2.f28076b = false;
                }
                if (!elVar2.f28076b && (x8 != 0.0f || y10 != 0.0f)) {
                    AndroidUtilities.cancelRunOnUIThread(mu0Var);
                    if (this.f26533f == ou0.f31411b) {
                        this.v = false;
                        setHighlighted(false);
                        elVar = (el) this.f26532e;
                        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = elVar.f28078e;
                        file = elVar.f28075a;
                        if (file != null) {
                            file.delete();
                            elVar.f28075a = null;
                        }
                        boolean z12 = ChatAttachAlertPhotoLayout.f26237m1;
                        chatAttachAlertPhotoLayout2.l0();
                        CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout2.L.getCameraSession(), true);
                        a(ou0.f31410a);
                        return true;
                    }
                }
            } else if (k81Var.getTag() == null) {
                AndroidUtilities.cancelRunOnUIThread(mu0Var);
                if (this.f26533f == ou0.f31411b) {
                    this.v = false;
                    setHighlighted(false);
                    elVar = (el) this.f26532e;
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = elVar.f28078e;
                    file = elVar.f28075a;
                    if (file != null) {
                        file.delete();
                        elVar.f28075a = null;
                    }
                    boolean z13 = ChatAttachAlertPhotoLayout.f26237m1;
                    chatAttachAlertPhotoLayout3.l0();
                    CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout3.L.getCameraSession(), true);
                    a(ou0.f31410a);
                    return true;
                }
            }
        } else if (action == 3) {
            setHighlighted(false);
            this.h = false;
            return true;
        }
        return true;
    }

    public void setDelegate(nu0 nu0Var) {
        this.f26532e = nu0Var;
    }

    @Override
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        invalidate();
    }
}
