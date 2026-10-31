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
    public final int f24413a;
    public final bi f24414b;

    public ah(bi biVar, Context context, int i10) {
        super(context);
        this.f24413a = i10;
        this.f24414b = biVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f24413a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f24414b.P3, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f24413a) {
            case 2:
                bi biVar = this.f24414b;
                ah ahVar = biVar.f24741x2;
                if (biVar.f24737w2.getAlpha() > 0.0f) {
                    float f7 = biVar.Q3;
                    if (f7 != 0.0f && f7 != ahVar.getTop() + biVar.Q3) {
                        ValueAnimator valueAnimator = biVar.R3;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = biVar.Q3 - (ahVar.getTop() + biVar.P3);
                        biVar.P3 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        biVar.R3 = ofFloat;
                        ofFloat.addUpdateListener(new a6(this, 10));
                        biVar.R3.setInterpolator(gr.f26495f);
                        biVar.R3.setDuration(200L);
                        biVar.R3.start();
                        biVar.Q3 = 0.0f;
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
        switch (this.f24413a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                bi biVar = this.f24414b;
                uh uhVar = biVar.f24721s2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
                if (uhVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.cd.G(chatAttachAlertPhotoLayout.getSelectedItemsCount(), "AccDescrSendPhotos", new Object[0]));
                } else {
                    xj xjVar = biVar.f24676g2;
                    if (uhVar == xjVar) {
                        accessibilityNodeInfo.setText(org.telegram.messenger.cd.G(xjVar.getSelectedItemsCount(), "AccDescrSendFiles", new Object[0]));
                    } else {
                        mi miVar = biVar.f24664c2;
                        if (uhVar == miVar) {
                            accessibilityNodeInfo.setText(org.telegram.messenger.cd.G(miVar.getSelectedItemsCount(), "AccDescrSendAudio", new Object[0]));
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
        switch (this.f24413a) {
            case 0:
                if (this.f24414b.f24665c3.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f24413a) {
            case 1:
                bi biVar = this.f24414b;
                if (biVar.f24744y1 && biVar.f24747z1 != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(36.0f) + (org.telegram.messenger.i0.L(80.0f) * Integer.bitCount(biVar.f24747z1))), 1073741824), i11);
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
        switch (this.f24413a) {
            case 0:
                if (this.f24414b.f24665c3.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f24413a) {
            case 0:
                super.setAlpha(f7);
                bi biVar = this.f24414b;
                biVar.O1(0);
                biVar.f21586b.invalidate();
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
        switch (this.f24413a) {
            case 1:
                super.setTranslationY(f7);
                this.f24414b.f24721s2.k();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
