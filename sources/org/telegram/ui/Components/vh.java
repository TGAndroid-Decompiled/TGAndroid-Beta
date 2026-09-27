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
public final class vh extends FrameLayout {
    public final int f29134a;
    public final wi f29135b;

    public vh(wi wiVar, Context context, int i10) {
        super(context);
        this.f29134a = i10;
        this.f29135b = wiVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f29134a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f29135b.V1, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f29134a) {
            case 2:
                wi wiVar = this.f29135b;
                vh vhVar = wiVar.D0;
                if (wiVar.C0.getAlpha() > 0.0f) {
                    float f7 = wiVar.W1;
                    if (f7 != 0.0f && f7 != vhVar.getTop() + wiVar.W1) {
                        ValueAnimator valueAnimator = wiVar.X1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = wiVar.W1 - (vhVar.getTop() + wiVar.V1);
                        wiVar.V1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        wiVar.X1 = ofFloat;
                        ofFloat.addUpdateListener(new k6(this, 10));
                        wiVar.X1.setInterpolator(sr.f28359f);
                        wiVar.X1.setDuration(200L);
                        wiVar.X1.start();
                        wiVar.W1 = 0.0f;
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
        switch (this.f29134a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                wi wiVar = this.f29135b;
                oi oiVar = wiVar.f30023y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = wiVar.f29974j0;
                if (oiVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    qk qkVar = wiVar.f29991p0;
                    if (oiVar == qkVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", qkVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        ij ijVar = wiVar.f29980l0;
                        if (oiVar == ijVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", ijVar.getSelectedItemsCount(), new Object[0]));
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
        switch (this.f29134a) {
            case 0:
                if (this.f29135b.f29972i1.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f29134a) {
            case 1:
                wi wiVar = this.f29135b;
                if (wiVar.H && wiVar.I != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(wiVar.I))), 1073741824), i11);
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
        switch (this.f29134a) {
            case 0:
                if (this.f29135b.f29972i1.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f29134a) {
            case 0:
                super.setAlpha(f7);
                wi wiVar = this.f29135b;
                wiVar.X1(0);
                wi.H(wiVar).invalidate();
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
        switch (this.f29134a) {
            case 1:
                super.setTranslationY(f7);
                this.f29135b.f30023y0.j();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
