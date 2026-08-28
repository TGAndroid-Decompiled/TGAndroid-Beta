package org.telegram.ui.Components.Paint.Views;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import xf.q1;
import yf.a;
public class ColorPicker extends FrameLayout {
    public static final int[] d = {-1431751, -2409774, -13610525, -11942419, -8337308, -205211, -223667, -16777216, -1};
    public static final float[] f26420e = {0.0f, 0.14f, 0.24f, 0.39f, 0.49f, 0.62f, 0.73f, 0.85f, 1.0f};
    public float f26421a;
    public float f26422b;
    public float f26423c;

    public static int a(float f10) {
        float[] fArr;
        int i9;
        int blue;
        int[] iArr = d;
        if (f10 <= 0.0f) {
            return iArr[0];
        }
        if (f10 >= 1.0f) {
            return iArr[8];
        }
        int i10 = 1;
        while (true) {
            fArr = f26420e;
            if (i10 < 9) {
                if (fArr[i10] >= f10) {
                    i9 = i10 - 1;
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                i9 = -1;
                break;
            }
        }
        float f11 = fArr[i9];
        int i11 = iArr[i9];
        float f12 = fArr[i10];
        int i12 = iArr[i10];
        float min = Math.min(Math.max((f10 - f11) / (f12 - f11), 0.0f), 1.0f);
        int red = Color.red(i11);
        int red2 = Color.red(i12);
        int green = Color.green(i11);
        int green2 = Color.green(i12);
        return Color.argb(255, Math.min(255, (int) (((red2 - red) * min) + red)), Math.min(255, (int) (((green2 - green) * min) + green)), Math.min(255, (int) (((Color.blue(i12) - blue) * min) + Color.blue(i11))));
    }

    private void setDraggingFactor(float f10) {
        this.f26423c = f10;
        invalidate();
    }

    public float getDraggingFactor() {
        return this.f26423c;
    }

    public View getSettingsButton() {
        return null;
    }

    public q1 getSwatch() {
        return new q1(this.f26421a, this.f26422b, a(this.f26421a));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRoundRect(null, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), null);
        throw null;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        new LinearGradient(AndroidUtilities.dp(56.0f), 0.0f, (i11 - i9) - AndroidUtilities.dp(56.0f), 0.0f, d, f26420e, tileMode);
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
        this.f26421a = f10;
        a(f10);
        throw null;
    }

    public void setSettingsButtonImage(int i9) {
        throw null;
    }

    public void setSwatch(q1 q1Var) {
        setLocation(q1Var.f49334b);
        setWeight(q1Var.f49335c);
    }

    public void setUndoEnabled(boolean z10) {
        throw null;
    }

    public void setWeight(float f10) {
        this.f26422b = f10;
        invalidate();
    }

    public void setDelegate(a aVar) {
    }
}
