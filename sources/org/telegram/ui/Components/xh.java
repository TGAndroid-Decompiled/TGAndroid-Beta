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
public final class xh extends FrameLayout {
    public final int f32568a;
    public final vi f32569b;

    public xh(vi viVar, Context context, int i10) {
        super(context);
        this.f32568a = i10;
        this.f32569b = viVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f32568a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f32569b.V1, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f32568a) {
            case 2:
                vi viVar = this.f32569b;
                xh xhVar = viVar.D0;
                if (viVar.C0.getAlpha() > 0.0f) {
                    float f7 = viVar.W1;
                    if (f7 != 0.0f && f7 != xhVar.getTop() + viVar.W1) {
                        ValueAnimator valueAnimator = viVar.X1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = viVar.W1 - (xhVar.getTop() + viVar.V1);
                        viVar.V1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        viVar.X1 = ofFloat;
                        ofFloat.addUpdateListener(new l6(this, 10));
                        viVar.X1.setInterpolator(pr.f29493f);
                        viVar.X1.setDuration(200L);
                        viVar.X1.start();
                        viVar.W1 = 0.0f;
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
        switch (this.f32568a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                vi viVar = this.f32569b;
                ni niVar = viVar.f31367y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f31318j0;
                if (niVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    ok okVar = viVar.f31335p0;
                    if (niVar == okVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", okVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        gj gjVar = viVar.f31324l0;
                        if (niVar == gjVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", gjVar.getSelectedItemsCount(), new Object[0]));
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
        switch (this.f32568a) {
            case 0:
                if (this.f32569b.f31316i1.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f32568a) {
            case 1:
                vi viVar = this.f32569b;
                if (viVar.H && viVar.I != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(viVar.I))), 1073741824), i11);
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
        switch (this.f32568a) {
            case 0:
                if (this.f32569b.f31316i1.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f32568a) {
            case 0:
                super.setAlpha(f7);
                vi viVar = this.f32569b;
                viVar.a2(0);
                vi.O(viVar).invalidate();
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
        switch (this.f32568a) {
            case 1:
                super.setTranslationY(f7);
                this.f32569b.f31367y0.j();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
