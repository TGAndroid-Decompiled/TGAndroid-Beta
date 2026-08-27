package org.telegram.ui.Components.Paint.Views;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import yf.p1;
import zf.a;

public class ColorPicker extends FrameLayout {
    public static final int[] d = {-1431751, -2409774, -13610525, -11942419, -8337308, -205211, -223667, -16777216, -1};

    public static final float[] f26416e = {0.0f, 0.14f, 0.24f, 0.39f, 0.49f, 0.62f, 0.73f, 0.85f, 1.0f};

    public float f26417a;

    public float f26418b;

    public float f26419c;

    public static int a(float f10) {
        float[] fArr;
        int i10;
        int[] iArr = d;
        if (f10 <= 0.0f) {
            return iArr[0];
        }
        if (f10 >= 1.0f) {
            return iArr[8];
        }
        int i11 = 1;
        while (true) {
            fArr = f26416e;
            if (i11 >= 9) {
                i11 = -1;
                i10 = -1;
                break;
            }
            if (fArr[i11] >= f10) {
                i10 = i11 - 1;
                break;
            }
            i11++;
        }
        float f11 = fArr[i10];
        int i12 = iArr[i10];
        float f12 = fArr[i11];
        int i13 = iArr[i11];
        float fMin = Math.min(Math.max((f10 - f11) / (f12 - f11), 0.0f), 1.0f);
        int iRed = Color.red(i12);
        int iRed2 = Color.red(i13);
        int iGreen = Color.green(i12);
        int iGreen2 = Color.green(i13);
        int iBlue = Color.blue(i12);
        return Color.argb(255, Math.min(255, (int) (((iRed2 - iRed) * fMin) + iRed)), Math.min(255, (int) (((iGreen2 - iGreen) * fMin) + iGreen)), Math.min(255, (int) (((Color.blue(i13) - iBlue) * fMin) + iBlue)));
    }

    private void setDraggingFactor(float f10) {
        this.f26419c = f10;
        invalidate();
    }

    public float getDraggingFactor() {
        return this.f26419c;
    }

    public View getSettingsButton() {
        return null;
    }

    public p1 getSwatch() {
        return new p1(this.f26417a, this.f26418b, a(this.f26417a));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRoundRect(null, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), null);
        throw null;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        new LinearGradient(AndroidUtilities.dp(56.0f), 0.0f, (i12 - i10) - AndroidUtilities.dp(56.0f), 0.0f, d, f26416e, Shader.TileMode.REPEAT);
        throw null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        motionEvent.getX();
        throw null;
    }

    public void setLocation(float f10) {
        this.f26417a = f10;
        a(f10);
        throw null;
    }

    public void setSettingsButtonImage(int i10) {
        throw null;
    }

    public void setSwatch(p1 p1Var) {
        setLocation(p1Var.f50035b);
        setWeight(p1Var.f50036c);
    }

    public void setUndoEnabled(boolean z10) {
        throw null;
    }

    public void setWeight(float f10) {
        this.f26418b = f10;
        invalidate();
    }

    public void setDelegate(a aVar) {
    }
}
