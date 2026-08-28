package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class mh extends FrameLayout {
    public final int f30836a;
    public final ki f30837b;

    public mh(ki kiVar, Context context, int i9) {
        super(context);
        this.f30836a = i9;
        this.f30837b = kiVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f30836a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f30837b.R1, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f30836a) {
            case 2:
                ki kiVar = this.f30837b;
                mh mhVar = kiVar.f30178z0;
                if (kiVar.f30175y0.getAlpha() > 0.0f) {
                    float f10 = kiVar.S1;
                    if (f10 != 0.0f && f10 != mhVar.getTop() + kiVar.S1) {
                        ValueAnimator valueAnimator = kiVar.T1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = kiVar.S1 - (mhVar.getTop() + kiVar.R1);
                        kiVar.R1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        kiVar.T1 = ofFloat;
                        ofFloat.addUpdateListener(new e6(this, 10));
                        kiVar.T1.setInterpolator(gr.f28844f);
                        kiVar.T1.setDuration(200L);
                        kiVar.T1.start();
                        kiVar.S1 = 0.0f;
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
        switch (this.f30836a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                ki kiVar = this.f30837b;
                ci ciVar = kiVar.f30160u0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f30114f0;
                if (ciVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    fk fkVar = kiVar.f30132l0;
                    if (ciVar == fkVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", fkVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        vi viVar = kiVar.f30120h0;
                        if (ciVar == viVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", viVar.getSelectedItemsCount(), new Object[0]));
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
        switch (this.f30836a) {
            case 0:
                if (this.f30837b.f30111e1.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f30836a) {
            case 1:
                ki kiVar = this.f30837b;
                if (kiVar.D && kiVar.E != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(kiVar.E))), 1073741824), i10);
                    return;
                }
                super.onMeasure(i9, i10);
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f30836a) {
            case 0:
                if (this.f30837b.f30111e1.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f30836a) {
            case 0:
                super.setAlpha(f10);
                ki kiVar = this.f30837b;
                kiVar.a2(0);
                ki.N(kiVar).invalidate();
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
        switch (this.f30836a) {
            case 1:
                super.setTranslationY(f10);
                this.f30837b.f30160u0.j();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
