package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
public final class ah extends FrameLayout {
    public final int f31844a;
    public final bi f31845b;

    public ah(bi biVar, Context context, int i3) {
        super(context);
        this.f31844a = i3;
        this.f31845b = biVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f31844a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f31845b.Q3, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f31844a) {
            case 2:
                bi biVar = this.f31845b;
                ah ahVar = biVar.f32295y2;
                if (biVar.f32291x2.getAlpha() > 0.0f) {
                    float f10 = biVar.R3;
                    if (f10 != 0.0f && f10 != ahVar.getTop() + biVar.R3) {
                        ValueAnimator valueAnimator = biVar.S3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = biVar.R3 - (ahVar.getTop() + biVar.Q3);
                        biVar.Q3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        biVar.S3 = ofFloat;
                        ofFloat.addUpdateListener(new c6(this, 10));
                        biVar.S3.setInterpolator(xq.f40452f);
                        biVar.S3.setDuration(200L);
                        biVar.S3.start();
                        biVar.R3 = 0.0f;
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
        switch (this.f31844a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                bi biVar = this.f31845b;
                th thVar = biVar.f32275t2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.f32215b2;
                if (thVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.bd.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    uj ujVar = biVar.f32232h2;
                    if (thVar == ujVar) {
                        accessibilityNodeInfo.setText(org.telegram.messenger.bd.G(ujVar.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        ni niVar = biVar.f32220d2;
                        if (thVar == niVar) {
                            accessibilityNodeInfo.setText(org.telegram.messenger.bd.G(niVar.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
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
        switch (this.f31844a) {
            case 0:
                if (this.f31845b.f32221d3.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f31844a) {
            case 1:
                bi biVar = this.f31845b;
                if (biVar.f32298z1 && biVar.A1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(36.0f) + (org.telegram.messenger.g0.L(80.0f) * Integer.bitCount(biVar.A1))), 1073741824), i10);
                    return;
                }
                super.onMeasure(i3, i10);
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f31844a) {
            case 0:
                if (this.f31845b.f32221d3.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f31844a) {
            case 0:
                super.setAlpha(f10);
                bi biVar = this.f31845b;
                biVar.P1(0);
                biVar.f28586b.invalidate();
                return;
            case 1:
            default:
                super.setAlpha(f10);
                return;
            case 2:
                super.setAlpha(f10);
                invalidate();
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f31844a) {
            case 1:
                super.setTranslationY(f10);
                this.f31845b.f32275t2.l();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
