package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class ch extends FrameLayout {
    public final int f32583a;
    public final ci f32584b;

    public ch(ci ciVar, Context context, int i7) {
        super(context);
        this.f32583a = i7;
        this.f32584b = ciVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f32583a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f32584b.S3, getMeasuredWidth(), getMeasuredHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f32583a) {
            case 2:
                ci ciVar = this.f32584b;
                ch chVar = ciVar.A2;
                if (ciVar.f32676z2.getAlpha() > 0.0f) {
                    float f10 = ciVar.T3;
                    if (f10 != 0.0f && f10 != chVar.getTop() + ciVar.T3) {
                        ValueAnimator valueAnimator = ciVar.U3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = ciVar.T3 - (chVar.getTop() + ciVar.S3);
                        ciVar.S3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        ciVar.U3 = ofFloat;
                        ofFloat.addUpdateListener(new d6(this, 10));
                        ciVar.U3.setInterpolator(wq.f40046f);
                        ciVar.U3.setDuration(200L);
                        ciVar.U3.start();
                        ciVar.T3 = 0.0f;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f32583a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                ci ciVar = this.f32584b;
                uh uhVar = ciVar.f32660v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar.d2;
                if (uhVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.id.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    uj ujVar = ciVar.f32617j2;
                    if (uhVar == ujVar) {
                        accessibilityNodeInfo.setText(org.telegram.messenger.id.G(ujVar.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        mi miVar = ciVar.f32605f2;
                        if (uhVar == miVar) {
                            accessibilityNodeInfo.setText(org.telegram.messenger.id.G(miVar.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
                        }
                    }
                }
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f32583a) {
            case 0:
                if (this.f32584b.f32606f3.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f32583a) {
            case 1:
                ci ciVar = this.f32584b;
                if (ciVar.B1 && ciVar.C1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(36.0f) + (org.telegram.messenger.g0.L(80.0f) * Integer.bitCount(ciVar.C1))), 1073741824), i10);
                    return;
                }
                super.onMeasure(i7, i10);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32583a) {
            case 0:
                if (this.f32584b.f32606f3.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f32583a) {
            case 0:
                super.setAlpha(f10);
                ci ciVar = this.f32584b;
                ciVar.P1(0);
                ciVar.f28672b.invalidate();
                return;
            case 1:
            default:
                super.setAlpha(f10);
                return;
            case 2:
                super.setAlpha(f10);
                invalidate();
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f32583a) {
            case 1:
                super.setTranslationY(f10);
                this.f32584b.f32660v2.l();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
