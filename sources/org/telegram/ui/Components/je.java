package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.ToggleButton;
import org.telegram.messenger.voip.VoIPService;
public final class je extends ImageView {
    public final int f29646a;

    public je(Context context, int i10) {
        super(context);
        this.f29646a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f29646a) {
            case 1:
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f29646a) {
            case 0:
                if (getAlpha() < 0.5f) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f29646a) {
            case 3:
                super.onDraw(canvas);
                invalidate();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f29646a) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
                accessibilityNodeInfo.setCheckable(true);
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    accessibilityNodeInfo.setChecked(sharedInstance.isSpeakerphoneOn());
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        float f9;
        float f10;
        switch (this.f29646a) {
            case 2:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            case 5:
                super.onMeasure(i10, i11);
                Matrix imageMatrix = getImageMatrix();
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                int intrinsicWidth = getDrawable().getIntrinsicWidth();
                int intrinsicHeight = getDrawable().getIntrinsicHeight();
                if (intrinsicWidth * measuredHeight > intrinsicHeight * measuredWidth) {
                    f9 = measuredHeight;
                    f10 = intrinsicHeight;
                } else {
                    f9 = measuredWidth;
                    f10 = intrinsicWidth;
                }
                float f11 = f9 / f10;
                imageMatrix.setScale(f11, f11);
                setImageMatrix(imageMatrix);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public je(au auVar, Context context) {
        super(context);
        this.f29646a = 1;
    }
}
