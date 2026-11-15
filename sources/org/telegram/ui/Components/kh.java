package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class kh extends FrameLayout {
    public final int f36419a;
    public final ki f36420b;

    public kh(ki kiVar, Context context, int i7) {
        super(context);
        this.f36419a = i7;
        this.f36420b = kiVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f36419a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f36420b.T3, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f36419a) {
            case 2:
                ki kiVar = this.f36420b;
                kh khVar = kiVar.B2;
                if (kiVar.A2.getAlpha() > 0.0f) {
                    float f10 = kiVar.U3;
                    if (f10 != 0.0f && f10 != khVar.getTop() + kiVar.U3) {
                        ValueAnimator valueAnimator = kiVar.V3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = kiVar.U3 - (khVar.getTop() + kiVar.T3);
                        kiVar.T3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        kiVar.V3 = ofFloat;
                        ofFloat.addUpdateListener(new c6(this, 10));
                        kiVar.V3.setInterpolator(er.f34419f);
                        kiVar.V3.setDuration(200L);
                        kiVar.V3.start();
                        kiVar.U3 = 0.0f;
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
        switch (this.f36419a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                ki kiVar = this.f36420b;
                ci ciVar = kiVar.f36497w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f36435e2;
                if (ciVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    dk dkVar = kiVar.f36452k2;
                    if (ciVar == dkVar) {
                        accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(dkVar.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        vi viVar = kiVar.f36441g2;
                        if (ciVar == viVar) {
                            accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(viVar.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
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
        switch (this.f36419a) {
            case 0:
                if (this.f36420b.f36442g3.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f36419a) {
            case 1:
                ki kiVar = this.f36420b;
                if (kiVar.C1 && kiVar.D1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(36.0f) + (org.telegram.messenger.g0.L(80.0f) * Integer.bitCount(kiVar.D1))), 1073741824), i10);
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
        switch (this.f36419a) {
            case 0:
                if (this.f36420b.f36442g3.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f36419a) {
            case 0:
                super.setAlpha(f10);
                ki kiVar = this.f36420b;
                kiVar.P1(0);
                kiVar.f29682b.invalidate();
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
        switch (this.f36419a) {
            case 1:
                super.setTranslationY(f10);
                this.f36420b.f36497w2.l();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
