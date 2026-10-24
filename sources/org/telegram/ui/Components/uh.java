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
public final class uh extends FrameLayout {
    public final int f31123a;
    public final ri f31124b;

    public uh(ri riVar, Context context, int i10) {
        super(context);
        this.f31123a = i10;
        this.f31124b = riVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f31123a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f31124b.Y1, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f31123a) {
            case 2:
                ri riVar = this.f31124b;
                uh uhVar = riVar.G0;
                if (riVar.F0.getAlpha() > 0.0f) {
                    float f7 = riVar.Z1;
                    if (f7 != 0.0f && f7 != uhVar.getTop() + riVar.Z1) {
                        ValueAnimator valueAnimator = riVar.a2;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = riVar.Z1 - (uhVar.getTop() + riVar.Y1);
                        riVar.Y1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        riVar.a2 = ofFloat;
                        ofFloat.addUpdateListener(new j6(this, 10));
                        riVar.a2.setInterpolator(zr.f33337f);
                        riVar.a2.setDuration(200L);
                        riVar.a2.start();
                        riVar.Z1 = 0.0f;
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
        switch (this.f31123a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                ri riVar = this.f31124b;
                ji jiVar = riVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = riVar.f30158j0;
                if (jiVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    lk lkVar = riVar.f30175p0;
                    if (jiVar == lkVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", lkVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        dj djVar = riVar.f30164l0;
                        if (jiVar == djVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", djVar.getSelectedItemsCount(), new Object[0]));
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
        switch (this.f31123a) {
            case 0:
                if (this.f31124b.l1.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f31123a) {
            case 1:
                ri riVar = this.f31124b;
                if (riVar.H && riVar.I != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(riVar.I))), 1073741824), i11);
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
        switch (this.f31123a) {
            case 0:
                if (this.f31124b.l1.getVisibility() != 0) {
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
        switch (this.f31123a) {
            case 0:
                super.setAlpha(f7);
                ri riVar = this.f31124b;
                riVar.i2(0);
                viewGroup = ((org.telegram.ui.ActionBar.h3) riVar).containerView;
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
        switch (this.f31123a) {
            case 1:
                super.setTranslationY(f7);
                this.f31124b.B0.k();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
