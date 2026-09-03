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
public final class mh extends FrameLayout {
    public final int f27057a;
    public final li f27058b;

    public mh(li liVar, Context context, int i10) {
        super(context);
        this.f27057a = i10;
        this.f27058b = liVar;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f27057a) {
            case 2:
                canvas.save();
                canvas.clipRect(0.0f, this.f27058b.S1, getMeasuredWidth(), getMeasuredHeight());
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
        switch (this.f27057a) {
            case 2:
                li liVar = this.f27058b;
                mh mhVar = liVar.A0;
                if (liVar.f26759z0.getAlpha() > 0.0f) {
                    float f10 = liVar.T1;
                    if (f10 != 0.0f && f10 != mhVar.getTop() + liVar.T1) {
                        ValueAnimator valueAnimator = liVar.U1;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float top = liVar.T1 - (mhVar.getTop() + liVar.S1);
                        liVar.S1 = top;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(top, 0.0f);
                        liVar.U1 = ofFloat;
                        ofFloat.addUpdateListener(new f6(this, 10));
                        liVar.U1.setInterpolator(mr.f27122f);
                        liVar.U1.setDuration(200L);
                        liVar.U1.start();
                        liVar.T1 = 0.0f;
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
        switch (this.f27057a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                li liVar = this.f27058b;
                di diVar = liVar.f26744v0;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.f26698g0;
                if (diVar == chatAttachAlertPhotoLayout) {
                    accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", chatAttachAlertPhotoLayout.getSelectedItemsCount(), new Object[0]));
                } else {
                    hk hkVar = liVar.m0;
                    if (diVar == hkVar) {
                        accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendFiles", hkVar.getSelectedItemsCount(), new Object[0]));
                    } else {
                        wi wiVar = liVar.f26704i0;
                        if (diVar == wiVar) {
                            accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendAudio", wiVar.getSelectedItemsCount(), new Object[0]));
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
        switch (this.f27057a) {
            case 0:
                if (this.f27058b.f26696f1.getVisibility() != 0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f27057a) {
            case 1:
                li liVar = this.f27058b;
                if (liVar.E && liVar.F != 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(liVar.F))), 1073741824), i11);
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
        switch (this.f27057a) {
            case 0:
                if (this.f27058b.f26696f1.getVisibility() != 0) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f27057a) {
            case 0:
                super.setAlpha(f10);
                li liVar = this.f27058b;
                liVar.a2(0);
                li.O(liVar).invalidate();
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
        switch (this.f27057a) {
            case 1:
                super.setTranslationY(f10);
                this.f27058b.f26744v0.j();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }
}
