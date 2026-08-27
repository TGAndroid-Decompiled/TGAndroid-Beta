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

public final class ih extends FrameLayout {

    public final int f29365a;

    public final gi f29366b;

    public ih(gi giVar, Context context, int i10) {
        super(context);
        this.f29365a = i10;
        this.f29366b = giVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f29365a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f29366b.R1, getMeasuredWidth(), getMeasuredHeight());
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f29365a) {
            case 2:
                gi giVar = this.f29366b;
                ih ihVar = giVar.f28714z0;
                if (giVar.f28711y0.getAlpha() > 0.0f) {
                    float f10 = giVar.S1;
                    if (f10 != 0.0f && f10 != ihVar.getTop() + giVar.S1) {
                        ValueAnimator valueAnimator = giVar.T1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = giVar.S1 - (ihVar.getTop() + giVar.R1);
                        giVar.R1 = top;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(top, 0.0f);
                        giVar.T1 = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new e6(this, 10));
                        giVar.T1.setInterpolator(er.f28122f);
                        giVar.T1.setDuration(200L);
                        giVar.T1.start();
                        giVar.S1 = 0.0f;
                        break;
                    }
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f29365a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                gi giVar = this.f29366b;
                yh yhVar = giVar.f28696u0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f28650f0;
                if (yhVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    bk bkVar = giVar.f28668l0;
                    if (yhVar == bkVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", bkVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        ri riVar = giVar.f28656h0;
                        if (yhVar == riVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", riVar.getSelectedItemsCount(), new Object[0]));
                        }
                    }
                }
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f29365a) {
            case 0:
                if (this.f29366b.f28647e1.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f29365a) {
            case 1:
                gi giVar = this.f29366b;
                if (giVar.D && giVar.E != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(giVar.E))), 1073741824), i11);
                } else {
                    super.onMeasure(i10, i11);
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29365a) {
            case 0:
                if (this.f29366b.f28647e1.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f29365a) {
            case 0:
                super.setAlpha(f10);
                gi giVar = this.f29366b;
                giVar.a2(0);
                ((org.telegram.ui.ActionBar.e3) giVar).containerView.invalidate();
                break;
            case 1:
            default:
                super.setAlpha(f10);
                break;
            case 2:
                super.setAlpha(f10);
                invalidate();
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f29365a) {
            case 1:
                super.setTranslationY(f10);
                this.f29366b.f28696u0.j();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }
}
