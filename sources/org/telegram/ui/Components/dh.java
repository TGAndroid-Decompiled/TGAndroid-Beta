package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class dh extends FrameLayout {
    public final int f32907a;
    public final di f32908b;

    public dh(di diVar, Context context, int i7) {
        super(context);
        this.f32907a = i7;
        this.f32908b = diVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f32907a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f32908b.P3, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f32907a) {
            case 2:
                di diVar = this.f32908b;
                dh dhVar = diVar.f33012x2;
                if (diVar.f33008w2.getAlpha() > 0.0f) {
                    float f10 = diVar.Q3;
                    if (f10 != 0.0f && f10 != dhVar.getTop() + diVar.Q3) {
                        ValueAnimator valueAnimator = diVar.R3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = diVar.Q3 - (dhVar.getTop() + diVar.P3);
                        diVar.P3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        diVar.R3 = ofFloat;
                        ofFloat.addUpdateListener(new e6(this, 10));
                        diVar.R3.setInterpolator(xq.f40366f);
                        diVar.R3.setDuration(200L);
                        diVar.R3.start();
                        diVar.Q3 = 0.0f;
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
        switch (this.f32907a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                di diVar = this.f32908b;
                vh vhVar = diVar.f32992s2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar.f32932a2;
                if (vhVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.id.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    vj vjVar = diVar.f32949g2;
                    if (vhVar == vjVar) {
                        accessibilityNodeInfo.setText(org.telegram.messenger.id.G(vjVar.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        ni niVar = diVar.f32938c2;
                        if (vhVar == niVar) {
                            accessibilityNodeInfo.setText(org.telegram.messenger.id.G(niVar.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
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
        switch (this.f32907a) {
            case 0:
                if (this.f32908b.f32939c3.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f32907a) {
            case 1:
                di diVar = this.f32908b;
                if (diVar.f33015y1 && diVar.f33019z1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(36.0f) + (org.telegram.messenger.g0.L(80.0f) * Integer.bitCount(diVar.f33019z1))), 1073741824), i10);
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
        switch (this.f32907a) {
            case 0:
                if (this.f32908b.f32939c3.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f32907a) {
            case 0:
                super.setAlpha(f10);
                di diVar = this.f32908b;
                diVar.P1(0);
                diVar.f28619b.invalidate();
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
        switch (this.f32907a) {
            case 1:
                super.setTranslationY(f10);
                this.f32908b.f32992s2.l();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
