package org.telegram.ui.Components.Paint.Views;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import dg.e2;
import eg.a;
import org.telegram.messenger.AndroidUtilities;
public class ColorPicker extends FrameLayout {
    public static final int[] d = {-1431751, -2409774, -13610525, -11942419, -8337308, -205211, -223667, -16777216, -1};
    public static final float[] f24919e = {0.0f, 0.14f, 0.24f, 0.39f, 0.49f, 0.62f, 0.73f, 0.85f, 1.0f};
    public float f24920a;
    public float f24921b;
    public float f24922c;

    public static int a(float f10) {
        float[] fArr;
        int i10;
        int blue;
        int[] iArr = d;
        if (f10 <= 0.0f) {
            return iArr[0];
        }
        if (f10 >= 1.0f) {
            return iArr[8];
        }
        int i11 = 1;
        while (true) {
            fArr = f24919e;
            if (i11 < 9) {
                if (fArr[i11] >= f10) {
                    i10 = i11 - 1;
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                i10 = -1;
                break;
            }
        }
        float f11 = fArr[i10];
        int i12 = iArr[i10];
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
        this.f24922c = f10;
        invalidate();
    }

    public float getDraggingFactor() {
        return this.f24922c;
    }

    public View getSettingsButton() {
        return null;
    }

    public e2 getSwatch() {
        return new e2(this.f24920a, this.f24921b, a(this.f24920a));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRoundRect(null, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), null);
        throw null;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        new LinearGradient(AndroidUtilities.dp(56.0f), 0.0f, (i12 - i10) - AndroidUtilities.dp(56.0f), 0.0f, d, f24919e, tileMode);
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
        this.f24920a = f10;
        a(f10);
        throw null;
    }

    public void setSettingsButtonImage(int i10) {
        throw null;
    }

    public void setSwatch(e2 e2Var) {
        setLocation(e2Var.f4525b);
        setWeight(e2Var.f4526c);
    }

    public void setUndoEnabled(boolean z4) {
        throw null;
    }

    public void setWeight(float f10) {
        this.f24921b = f10;
        invalidate();
    }

    public void setDelegate(a aVar) {
    }
}
