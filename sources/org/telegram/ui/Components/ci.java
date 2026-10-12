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
public final class ci extends FrameLayout {
    public final int f24939a;
    public final aj f24940b;

    public ci(aj ajVar, Context context, int i10) {
        super(context);
        this.f24939a = i10;
        this.f24940b = ajVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f24939a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f24940b.Y1, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f24939a) {
            case 2:
                aj ajVar = this.f24940b;
                ci ciVar = ajVar.G0;
                if (ajVar.F0.getAlpha() > 0.0f) {
                    float f7 = ajVar.Z1;
                    if (f7 != 0.0f && f7 != ciVar.getTop() + ajVar.Z1) {
                        ValueAnimator valueAnimator = ajVar.a2;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = ajVar.Z1 - (ciVar.getTop() + ajVar.Y1);
                        ajVar.Y1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        ajVar.a2 = ofFloat;
                        ofFloat.addUpdateListener(new m6(this, 10));
                        ajVar.a2.setInterpolator(js.f27634f);
                        ajVar.a2.setDuration(200L);
                        ajVar.a2.start();
                        ajVar.Z1 = 0.0f;
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
        switch (this.f24939a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                aj ajVar = this.f24940b;
                si siVar = ajVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ajVar.f24350j0;
                if (siVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    uk ukVar = ajVar.f24367p0;
                    if (siVar == ukVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", ukVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        mj mjVar = ajVar.f24356l0;
                        if (siVar == mjVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", mjVar.getSelectedItemsCount(), new Object[0]));
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
        switch (this.f24939a) {
            case 0:
                if (this.f24940b.l1.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f24939a) {
            case 1:
                aj ajVar = this.f24940b;
                if (ajVar.H && ajVar.I != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(ajVar.I))), 1073741824), i11);
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
        switch (this.f24939a) {
            case 0:
                if (this.f24940b.l1.getVisibility() != 0) {
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
        switch (this.f24939a) {
            case 0:
                super.setAlpha(f7);
                aj ajVar = this.f24940b;
                ajVar.e2(0);
                viewGroup = ((org.telegram.ui.ActionBar.e3) ajVar).containerView;
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
        switch (this.f24939a) {
            case 1:
                super.setTranslationY(f7);
                this.f24940b.B0.k();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
