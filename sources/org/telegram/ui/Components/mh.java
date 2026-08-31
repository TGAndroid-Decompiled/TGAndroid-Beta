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
    public final int f29030a;
    public final mi f29031b;

    public mh(mi miVar, Context context, int i10) {
        super(context);
        this.f29030a = i10;
        this.f29031b = miVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f29030a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f29031b.S1, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f29030a) {
            case 2:
                mi miVar = this.f29031b;
                mh mhVar = miVar.A0;
                if (miVar.f29115z0.getAlpha() > 0.0f) {
                    float f10 = miVar.T1;
                    if (f10 != 0.0f && f10 != mhVar.getTop() + miVar.T1) {
                        ValueAnimator valueAnimator = miVar.U1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = miVar.T1 - (mhVar.getTop() + miVar.S1);
                        miVar.S1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        miVar.U1 = ofFloat;
                        ofFloat.addUpdateListener(new f6(this, 10));
                        miVar.U1.setInterpolator(pr.f30183f);
                        miVar.U1.setDuration(200L);
                        miVar.U1.start();
                        miVar.T1 = 0.0f;
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
        switch (this.f29030a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                mi miVar = this.f29031b;
                ei eiVar = miVar.f29100v0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar.f29054g0;
                if (eiVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    jk jkVar = miVar.m0;
                    if (eiVar == jkVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", jkVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        xi xiVar = miVar.f29060i0;
                        if (eiVar == xiVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", xiVar.getSelectedItemsCount(), new Object[0]));
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
        switch (this.f29030a) {
            case 0:
                if (this.f29031b.f29052f1.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f29030a) {
            case 1:
                mi miVar = this.f29031b;
                if (miVar.E && miVar.F != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(miVar.F))), 1073741824), i11);
                    return;
                }
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29030a) {
            case 0:
                if (this.f29031b.f29052f1.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f29030a) {
            case 0:
                super.setAlpha(f10);
                mi miVar = this.f29031b;
                miVar.a2(0);
                mi.O(miVar).invalidate();
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
        switch (this.f29030a) {
            case 1:
                super.setTranslationY(f10);
                this.f29031b.f29100v0.j();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
