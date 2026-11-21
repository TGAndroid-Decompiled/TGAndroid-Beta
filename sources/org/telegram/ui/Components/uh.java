package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class uh extends FrameLayout {
    public final int f40368a;
    public final ui f40369b;

    public uh(ui uiVar, Context context, int i7) {
        super(context);
        this.f40368a = i7;
        this.f40369b = uiVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f40368a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f40369b.T3, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f40368a) {
            case 2:
                ui uiVar = this.f40369b;
                uh uhVar = uiVar.B2;
                if (uiVar.A2.getAlpha() > 0.0f) {
                    float f10 = uiVar.U3;
                    if (f10 != 0.0f && f10 != uhVar.getTop() + uiVar.U3) {
                        ValueAnimator valueAnimator = uiVar.V3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = uiVar.U3 - (uhVar.getTop() + uiVar.T3);
                        uiVar.T3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        uiVar.V3 = ofFloat;
                        ofFloat.addUpdateListener(new x(this, 11));
                        uiVar.V3.setInterpolator(nr.f37956f);
                        uiVar.V3.setDuration(200L);
                        uiVar.V3.start();
                        uiVar.U3 = 0.0f;
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
        switch (this.f40368a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                ui uiVar = this.f40369b;
                mi miVar = uiVar.f40448w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar.f40386e2;
                if (miVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    mk mkVar = uiVar.f40403k2;
                    if (miVar == mkVar) {
                        accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(mkVar.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        ej ejVar = uiVar.f40392g2;
                        if (miVar == ejVar) {
                            accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(ejVar.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
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
        switch (this.f40368a) {
            case 0:
                if (this.f40369b.f40393g3.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f40368a) {
            case 1:
                ui uiVar = this.f40369b;
                if (uiVar.C1 && uiVar.D1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(36.0f) + (org.telegram.messenger.g0.L(80.0f) * Integer.bitCount(uiVar.D1))), 1073741824), i10);
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
        switch (this.f40368a) {
            case 0:
                if (this.f40369b.f40393g3.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f40368a) {
            case 0:
                super.setAlpha(f10);
                ui uiVar = this.f40369b;
                uiVar.Q1(0);
                uiVar.f30173b.invalidate();
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
        switch (this.f40368a) {
            case 1:
                super.setTranslationY(f10);
                this.f40369b.f40448w2.l();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
