package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class xh extends FrameLayout {
    public final int f31258a;
    public final vi f31259b;

    public xh(vi viVar, Context context, int i10) {
        super(context);
        this.f31258a = i10;
        this.f31259b = viVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f31258a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f31259b.Y1, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f31258a) {
            case 2:
                vi viVar = this.f31259b;
                xh xhVar = viVar.G0;
                if (viVar.F0.getAlpha() > 0.0f) {
                    float f7 = viVar.Z1;
                    if (f7 != 0.0f && f7 != xhVar.getTop() + viVar.Z1) {
                        ValueAnimator valueAnimator = viVar.a2;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = viVar.Z1 - (xhVar.getTop() + viVar.Y1);
                        viVar.Y1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        viVar.a2 = ofFloat;
                        ofFloat.addUpdateListener(new n6(this, 10));
                        viVar.a2.setInterpolator(es.f24771f);
                        viVar.a2.setDuration(200L);
                        viVar.a2.start();
                        viVar.Z1 = 0.0f;
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
        switch (this.f31258a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                vi viVar = this.f31259b;
                ni niVar = viVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = viVar.f30013j0;
                if (niVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    pk pkVar = viVar.f30030p0;
                    if (niVar == pkVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", pkVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        hj hjVar = viVar.f30019l0;
                        if (niVar == hjVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", hjVar.getSelectedItemsCount(), new Object[0]));
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
        switch (this.f31258a) {
            case 0:
                if (this.f31259b.l1.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f31258a) {
            case 1:
                vi viVar = this.f31259b;
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
        switch (this.f31258a) {
            case 0:
                if (this.f31259b.l1.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f7) {
        ViewGroup viewGroup;
        switch (this.f31258a) {
            case 0:
                super.setAlpha(f7);
                vi viVar = this.f31259b;
                viVar.e2(0);
                viewGroup = ((org.telegram.ui.ActionBar.e3) viVar).containerView;
                viewGroup.invalidate();
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
        switch (this.f31258a) {
            case 1:
                super.setTranslationY(f7);
                this.f31259b.B0.k();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
