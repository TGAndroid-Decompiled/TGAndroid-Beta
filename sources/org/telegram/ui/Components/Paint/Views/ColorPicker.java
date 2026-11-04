package org.telegram.ui.Components.Paint.Views;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.g0;
import tg.h1;
import ug.a;
public class ColorPicker extends FrameLayout {
    public static final int[] d = {-1431751, -2409774, -13610525, -11942419, -8337308, -205211, -223667, -16777216, -1};
    public static final float[] f31493e = {0.0f, 0.14f, 0.24f, 0.39f, 0.49f, 0.62f, 0.73f, 0.85f, 1.0f};
    public float f31494a;
    public float f31495b;
    public float f31496c;

    public static int a(float f10) {
        float[] fArr;
        int i3;
        int blue;
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        int[] iArr = d;
        if (i10 <= 0) {
            return iArr[0];
        }
        if (f10 >= 1.0f) {
            return iArr[8];
        }
        int i11 = 1;
        while (true) {
            fArr = f31493e;
            if (i11 < 9) {
                if (fArr[i11] >= f10) {
                    i3 = i11 - 1;
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                i3 = -1;
                break;
            }
        }
        float f11 = fArr[i3];
        int i12 = iArr[i3];
        float f12 = fArr[i11];
        int i13 = iArr[i11];
        float min = Math.min(Math.max((f10 - f11) / (f12 - f11), 0.0f), 1.0f);
        int red = Color.red(i12);
        int red2 = Color.red(i13);
        int green = Color.green(i12);
        int green2 = Color.green(i13);
        return Color.argb(255, Math.min(255, (int) (((red2 - red) * min) + red)), Math.min(255, (int) (((green2 - green) * min) + green)), Math.min(255, (int) (((Color.blue(i13) - blue) * min) + Color.blue(i12))));
    }

    private void setDraggingFactor(float f10) {
        this.f31496c = f10;
        invalidate();
    }

    public float getDraggingFactor() {
        return this.f31496c;
    }

    public View getSettingsButton() {
        return null;
    }

    public h1 getSwatch() {
        return new h1(this.f31494a, this.f31495b, a(this.f31494a));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRoundRect(null, g0.L(6.0f), g0.L(6.0f), null);
        throw null;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        new LinearGradient(g0.L(56.0f), 0.0f, (i11 - i3) - g0.L(56.0f), 0.0f, d, f31493e, tileMode);
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
        this.f31494a = f10;
        a(f10);
        throw null;
    }

    public void setSettingsButtonImage(int i3) {
        throw null;
    }

    public void setSwatch(h1 h1Var) {
        setLocation(h1Var.f55187b);
        setWeight(h1Var.f55188c);
    }

    public void setUndoEnabled(boolean z10) {
        throw null;
    }

    public void setWeight(float f10) {
        this.f31495b = f10;
        invalidate();
    }

    public void setDelegate(a aVar) {
    }
}
