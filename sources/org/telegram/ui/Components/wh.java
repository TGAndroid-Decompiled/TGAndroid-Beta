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
public final class wh extends FrameLayout {
    public final int f32104a;
    public final ti f32105b;

    public wh(ti tiVar, Context context, int i10) {
        super(context);
        this.f32104a = i10;
        this.f32105b = tiVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f32104a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f32105b.Y1, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f32104a) {
            case 2:
                ti tiVar = this.f32105b;
                wh whVar = tiVar.G0;
                if (tiVar.F0.getAlpha() > 0.0f) {
                    float f7 = tiVar.Z1;
                    if (f7 != 0.0f && f7 != whVar.getTop() + tiVar.Z1) {
                        ValueAnimator valueAnimator = tiVar.a2;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = tiVar.Z1 - (whVar.getTop() + tiVar.Y1);
                        tiVar.Y1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        tiVar.a2 = ofFloat;
                        ofFloat.addUpdateListener(new l6(this, 10));
                        tiVar.a2.setInterpolator(bs.f25021f);
                        tiVar.a2.setDuration(200L);
                        tiVar.a2.start();
                        tiVar.Z1 = 0.0f;
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
        switch (this.f32104a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                ti tiVar = this.f32105b;
                li liVar = tiVar.B0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f30558j0;
                if (liVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    nk nkVar = tiVar.f30575p0;
                    if (liVar == nkVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", nkVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        fj fjVar = tiVar.f30564l0;
                        if (liVar == fjVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", fjVar.getSelectedItemsCount(), new Object[0]));
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
        switch (this.f32104a) {
            case 0:
                if (this.f32105b.l1.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f32104a) {
            case 1:
                ti tiVar = this.f32105b;
                if (tiVar.H && tiVar.I != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(tiVar.I))), 1073741824), i11);
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
        switch (this.f32104a) {
            case 0:
                if (this.f32105b.l1.getVisibility() != 0) {
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
        switch (this.f32104a) {
            case 0:
                super.setAlpha(f7);
                ti tiVar = this.f32105b;
                tiVar.e2(0);
                viewGroup = ((org.telegram.ui.ActionBar.f3) tiVar).containerView;
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
        switch (this.f32104a) {
            case 1:
                super.setTranslationY(f7);
                this.f32105b.B0.k();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
