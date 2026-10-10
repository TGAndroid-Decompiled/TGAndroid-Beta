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
public final class ai extends FrameLayout {
    public final int f24569a;
    public final yi f24570b;

    public ai(yi yiVar, Context context, int i10) {
        super(context);
        this.f24569a = i10;
        this.f24570b = yiVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f24569a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f24570b.Y1, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f24569a) {
            case 2:
                yi yiVar = this.f24570b;
                ai aiVar = yiVar.G0;
                if (yiVar.F0.getAlpha() > 0.0f) {
                    float f7 = yiVar.Z1;
                    if (f7 != 0.0f && f7 != aiVar.getTop() + yiVar.Z1) {
                        ValueAnimator valueAnimator = yiVar.a2;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = yiVar.Z1 - (aiVar.getTop() + yiVar.Y1);
                        yiVar.Y1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        yiVar.a2 = ofFloat;
                        ofFloat.addUpdateListener(new m6(this, 10));
                        yiVar.a2.setInterpolator(is.f27443f);
                        yiVar.a2.setDuration(200L);
                        yiVar.a2.start();
                        yiVar.Z1 = 0.0f;
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
        switch (this.f24569a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                yi yiVar = this.f24570b;
                qi qiVar = yiVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f33247j0;
                if (qiVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    sk skVar = yiVar.f33264p0;
                    if (qiVar == skVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", skVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        kj kjVar = yiVar.f33253l0;
                        if (qiVar == kjVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", kjVar.getSelectedItemsCount(), new Object[0]));
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
        switch (this.f24569a) {
            case 0:
                if (this.f24570b.l1.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f24569a) {
            case 1:
                yi yiVar = this.f24570b;
                if (yiVar.H && yiVar.I != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(yiVar.I))), 1073741824), i11);
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
        switch (this.f24569a) {
            case 0:
                if (this.f24570b.l1.getVisibility() != 0) {
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
        switch (this.f24569a) {
            case 0:
                super.setAlpha(f7);
                yi yiVar = this.f24570b;
                yiVar.e2(0);
                viewGroup = ((org.telegram.ui.ActionBar.f3) yiVar).containerView;
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
        switch (this.f24569a) {
            case 1:
                super.setTranslationY(f7);
                this.f24570b.B0.k();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
