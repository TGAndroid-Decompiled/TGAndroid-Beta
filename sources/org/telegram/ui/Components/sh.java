package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class sh extends FrameLayout {
    public final int f39652a;
    public final si f39653b;

    public sh(si siVar, Context context, int i7) {
        super(context);
        this.f39652a = i7;
        this.f39653b = siVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f39652a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f39653b.T3, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f39652a) {
            case 2:
                si siVar = this.f39653b;
                sh shVar = siVar.B2;
                if (siVar.A2.getAlpha() > 0.0f) {
                    float f10 = siVar.U3;
                    if (f10 != 0.0f && f10 != shVar.getTop() + siVar.U3) {
                        ValueAnimator valueAnimator = siVar.V3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = siVar.U3 - (shVar.getTop() + siVar.T3);
                        siVar.T3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        siVar.V3 = ofFloat;
                        ofFloat.addUpdateListener(new w(this, 11));
                        siVar.V3.setInterpolator(lr.f37208f);
                        siVar.V3.setDuration(200L);
                        siVar.V3.start();
                        siVar.U3 = 0.0f;
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
        switch (this.f39652a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                si siVar = this.f39653b;
                ki kiVar = siVar.f39732w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar.f39670e2;
                if (kiVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    kk kkVar = siVar.f39687k2;
                    if (kiVar == kkVar) {
                        accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(kkVar.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        cj cjVar = siVar.f39676g2;
                        if (kiVar == cjVar) {
                            accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(cjVar.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
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
        switch (this.f39652a) {
            case 0:
                if (this.f39653b.f39677g3.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f39652a) {
            case 1:
                si siVar = this.f39653b;
                if (siVar.C1 && siVar.D1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(36.0f) + (org.telegram.messenger.g0.L(80.0f) * Integer.bitCount(siVar.D1))), 1073741824), i10);
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
        switch (this.f39652a) {
            case 0:
                if (this.f39653b.f39677g3.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f39652a) {
            case 0:
                super.setAlpha(f10);
                si siVar = this.f39653b;
                siVar.Q1(0);
                siVar.f30190b.invalidate();
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
        switch (this.f39652a) {
            case 1:
                super.setTranslationY(f10);
                this.f39653b.f39732w2.l();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
