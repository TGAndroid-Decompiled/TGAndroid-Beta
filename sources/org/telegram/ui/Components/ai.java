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
public final class ai extends FrameLayout {
    public final int f21501a;
    public final yi f21502b;

    public ai(yi yiVar, Context context, int i10) {
        super(context);
        this.f21501a = i10;
        this.f21502b = yiVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f21501a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f21502b.V1, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f21501a) {
            case 2:
                yi yiVar = this.f21502b;
                ai aiVar = yiVar.D0;
                if (yiVar.C0.getAlpha() > 0.0f) {
                    float f7 = yiVar.W1;
                    if (f7 != 0.0f && f7 != aiVar.getTop() + yiVar.W1) {
                        ValueAnimator valueAnimator = yiVar.X1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = yiVar.W1 - (aiVar.getTop() + yiVar.V1);
                        yiVar.V1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        yiVar.X1 = ofFloat;
                        ofFloat.addUpdateListener(new j6(this, 10));
                        yiVar.X1.setInterpolator(wr.f28819f);
                        yiVar.X1.setDuration(200L);
                        yiVar.X1.start();
                        yiVar.W1 = 0.0f;
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
        switch (this.f21501a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                yi yiVar = this.f21502b;
                qi qiVar = yiVar.f29427y0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = yiVar.f29378j0;
                if (qiVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    tk tkVar = yiVar.f29395p0;
                    if (qiVar == tkVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", tkVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        jj jjVar = yiVar.f29384l0;
                        if (qiVar == jjVar) {
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
        switch (this.f21501a) {
            case 0:
                if (this.f21502b.f29376i1.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f21501a) {
            case 1:
                yi yiVar = this.f21502b;
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
        switch (this.f21501a) {
            case 0:
                if (this.f21502b.f29376i1.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f21501a) {
            case 0:
                super.setAlpha(f7);
                yi yiVar = this.f21502b;
                yiVar.a2(0);
                yi.O(yiVar).invalidate();
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
        switch (this.f21501a) {
            case 1:
                super.setTranslationY(f7);
                this.f21502b.f29427y0.j();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
