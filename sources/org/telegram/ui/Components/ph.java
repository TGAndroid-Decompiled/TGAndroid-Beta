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
public final class ph extends FrameLayout {
    public final int f31674a;
    public final ni f31675b;

    public ph(ni niVar, Context context, int i10) {
        super(context);
        this.f31674a = i10;
        this.f31675b = niVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f31674a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f31675b.R1, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f31674a) {
            case 2:
                ni niVar = this.f31675b;
                ph phVar = niVar.f31069z0;
                if (niVar.f31066y0.getAlpha() > 0.0f) {
                    float f9 = niVar.S1;
                    if (f9 != 0.0f && f9 != phVar.getTop() + niVar.S1) {
                        ValueAnimator valueAnimator = niVar.T1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = niVar.S1 - (phVar.getTop() + niVar.R1);
                        niVar.R1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        niVar.T1 = ofFloat;
                        ofFloat.addUpdateListener(new j6(this, 10));
                        niVar.T1.setInterpolator(jr.f29800f);
                        niVar.T1.setDuration(200L);
                        niVar.T1.start();
                        niVar.S1 = 0.0f;
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
        switch (this.f31674a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                ni niVar = this.f31675b;
                fi fiVar = niVar.f31051u0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f31005f0;
                if (fiVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    jk jkVar = niVar.f31023l0;
                    if (fiVar == jkVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", jkVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        yi yiVar = niVar.f31011h0;
                        if (fiVar == yiVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", yiVar.getSelectedItemsCount(), new Object[0]));
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
        switch (this.f31674a) {
            case 0:
                if (this.f31675b.f31002e1.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f31674a) {
            case 1:
                ni niVar = this.f31675b;
                if (niVar.D && niVar.E != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(niVar.E))), 1073741824), i11);
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
        switch (this.f31674a) {
            case 0:
                if (this.f31675b.f31002e1.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f9) {
        switch (this.f31674a) {
            case 0:
                super.setAlpha(f9);
                ni niVar = this.f31675b;
                niVar.a2(0);
                ni.O(niVar).invalidate();
                return;
            case 1:
            default:
                super.setAlpha(f9);
                return;
            case 2:
                super.setAlpha(f9);
                invalidate();
                return;
        }
    }

    @Override
    public void setTranslationY(float f9) {
        switch (this.f31674a) {
            case 1:
                super.setTranslationY(f9);
                this.f31675b.f31051u0.j();
                return;
            default:
                super.setTranslationY(f9);
                return;
        }
    }
}
