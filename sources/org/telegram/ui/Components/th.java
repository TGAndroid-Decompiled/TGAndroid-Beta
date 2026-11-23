package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class th extends FrameLayout {
    public final int f39949a;
    public final ti f39950b;

    public th(ti tiVar, Context context, int i7) {
        super(context);
        this.f39949a = i7;
        this.f39950b = tiVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f39949a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f39950b.T3, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f39949a) {
            case 2:
                ti tiVar = this.f39950b;
                th thVar = tiVar.B2;
                if (tiVar.A2.getAlpha() > 0.0f) {
                    float f10 = tiVar.U3;
                    if (f10 != 0.0f && f10 != thVar.getTop() + tiVar.U3) {
                        ValueAnimator valueAnimator = tiVar.V3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = tiVar.U3 - (thVar.getTop() + tiVar.T3);
                        tiVar.T3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        tiVar.V3 = ofFloat;
                        ofFloat.addUpdateListener(new w(this, 11));
                        tiVar.V3.setInterpolator(kr.f36858f);
                        tiVar.V3.setDuration(200L);
                        tiVar.V3.start();
                        tiVar.U3 = 0.0f;
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
        switch (this.f39949a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                ti tiVar = this.f39950b;
                li liVar = tiVar.f40029w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f39967e2;
                if (liVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    kk kkVar = tiVar.f39984k2;
                    if (liVar == kkVar) {
                        accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(kkVar.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        dj djVar = tiVar.f39973g2;
                        if (liVar == djVar) {
                            accessibilityNodeInfo.setText(org.telegram.messenger.gd.G(djVar.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
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
        switch (this.f39949a) {
            case 0:
                if (this.f39950b.f39974g3.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f39949a) {
            case 1:
                ti tiVar = this.f39950b;
                if (tiVar.C1 && tiVar.D1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(36.0f) + (org.telegram.messenger.g0.L(80.0f) * Integer.bitCount(tiVar.D1))), 1073741824), i10);
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
        switch (this.f39949a) {
            case 0:
                if (this.f39950b.f39974g3.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f39949a) {
            case 0:
                super.setAlpha(f10);
                ti tiVar = this.f39950b;
                tiVar.Q1(0);
                tiVar.f30226b.invalidate();
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
        switch (this.f39949a) {
            case 1:
                super.setTranslationY(f10);
                this.f39950b.f40029w2.l();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
