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
public final class zh extends FrameLayout {
    public final int f30968a;
    public final xi f30969b;

    public zh(xi xiVar, Context context, int i10) {
        super(context);
        this.f30968a = i10;
        this.f30969b = xiVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f30968a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f30969b.V1, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f30968a) {
            case 2:
                xi xiVar = this.f30969b;
                zh zhVar = xiVar.D0;
                if (xiVar.C0.getAlpha() > 0.0f) {
                    float f7 = xiVar.W1;
                    if (f7 != 0.0f && f7 != zhVar.getTop() + xiVar.W1) {
                        ValueAnimator valueAnimator = xiVar.X1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = xiVar.W1 - (zhVar.getTop() + xiVar.V1);
                        xiVar.V1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        xiVar.X1 = ofFloat;
                        ofFloat.addUpdateListener(new k6(this, 10));
                        xiVar.X1.setInterpolator(tr.f28636f);
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
        switch (this.f30968a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                xi xiVar = this.f30969b;
                pi piVar = xiVar.f30331y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = xiVar.f30282j0;
                if (piVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    rk rkVar = xiVar.f30299p0;
                    if (piVar == rkVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", rkVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        jj jjVar = xiVar.f30288l0;
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
        switch (this.f30968a) {
            case 0:
                if (this.f30969b.f30280i1.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f30968a) {
            case 1:
                xi xiVar = this.f30969b;
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
        switch (this.f30968a) {
            case 0:
                if (this.f30969b.f30280i1.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f30968a) {
            case 0:
                super.setAlpha(f7);
                xi xiVar = this.f30969b;
                xiVar.a2(0);
                xi.O(xiVar).invalidate();
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
        switch (this.f30968a) {
            case 1:
                super.setTranslationY(f7);
                this.f30969b.f30331y0.j();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
