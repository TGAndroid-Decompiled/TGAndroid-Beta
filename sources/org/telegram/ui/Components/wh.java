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
public final class wh extends FrameLayout {
    public final int f32556a;
    public final xi f32557b;

    public wh(xi xiVar, Context context, int i10) {
        super(context);
        this.f32556a = i10;
        this.f32557b = xiVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f32556a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f32557b.V1, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f32556a) {
            case 2:
                xi xiVar = this.f32557b;
                wh whVar = xiVar.D0;
                if (xiVar.C0.getAlpha() > 0.0f) {
                    float f7 = xiVar.W1;
                    if (f7 != 0.0f && f7 != whVar.getTop() + xiVar.W1) {
                        ValueAnimator valueAnimator = xiVar.X1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = xiVar.W1 - (whVar.getTop() + xiVar.V1);
                        xiVar.V1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        xiVar.X1 = ofFloat;
                        ofFloat.addUpdateListener(new k6(this, 10));
                        xiVar.X1.setInterpolator(tr.f31140f);
                        xiVar.X1.setDuration(200L);
                        xiVar.X1.start();
                        xiVar.W1 = 0.0f;
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
        switch (this.f32556a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                xi xiVar = this.f32557b;
                pi piVar = xiVar.f32873y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar.f32824j0;
                if (piVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    rk rkVar = xiVar.f32841p0;
                    if (piVar == rkVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", rkVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        jj jjVar = xiVar.f32830l0;
                        if (piVar == jjVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", jjVar.getSelectedItemsCount(), new Object[0]));
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
        switch (this.f32556a) {
            case 0:
                if (this.f32557b.f32822i1.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f32556a) {
            case 1:
                xi xiVar = this.f32557b;
                if (xiVar.H && xiVar.I != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(xiVar.I))), 1073741824), i11);
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
        switch (this.f32556a) {
            case 0:
                if (this.f32557b.f32822i1.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f32556a) {
            case 0:
                super.setAlpha(f7);
                xi xiVar = this.f32557b;
                xiVar.X1(0);
                xi.F(xiVar).invalidate();
                return;
            case 1:
            default:
                super.setAlpha(f7);
                return;
            case 2:
                super.setAlpha(f7);
                invalidate();
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f32556a) {
            case 1:
                super.setTranslationY(f7);
                this.f32557b.f32873y0.j();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
