package org.telegram.ui.Components.Paint.Views;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import pg.s1;
import qg.a;
public class ColorPicker extends FrameLayout {
    public static final int[] d = {-1431751, -2409774, -13610525, -11942419, -8337308, -205211, -223667, -16777216, -1};
    public static final float[] f24208e = {0.0f, 0.14f, 0.24f, 0.39f, 0.49f, 0.62f, 0.73f, 0.85f, 1.0f};
    public float f24209a;
    public float f24210b;
    public float f24211c;

    public static int a(float f7) {
        float[] fArr;
        int i10;
        int blue;
        int i11 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        int[] iArr = d;
        if (i11 <= 0) {
            return iArr[0];
        }
        if (f7 >= 1.0f) {
            return iArr[8];
        }
        int i12 = 1;
        while (true) {
            fArr = f24208e;
            if (i12 < 9) {
                if (fArr[i12] >= f7) {
                    i10 = i12 - 1;
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                i10 = -1;
                break;
            }
        }
        float f10 = fArr[i10];
        int i13 = iArr[i10];
        float f11 = fArr[i12];
        int i14 = iArr[i12];
        float min = Math.min(Math.max((f7 - f10) / (f11 - f10), 0.0f), 1.0f);
        int red = Color.red(i13);
        int red2 = Color.red(i14);
        int green = Color.green(i13);
        int green2 = Color.green(i14);
        return Color.argb(255, Math.min(255, (int) (((red2 - red) * min) + red)), Math.min(255, (int) (((green2 - green) * min) + green)), Math.min(255, (int) (((Color.blue(i14) - blue) * min) + Color.blue(i13))));
    }

    private void setDraggingFactor(float f7) {
        this.f24211c = f7;
        invalidate();
    }

    public float getDraggingFactor() {
        return this.f24211c;
    }

    public View getSettingsButton() {
        return null;
    }

    public s1 getSwatch() {
        return new s1(this.f24209a, this.f24210b, a(this.f24209a));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRoundRect(null, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), null);
        throw null;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        new LinearGradient(AndroidUtilities.dp(56.0f), 0.0f, (i12 - i10) - AndroidUtilities.dp(56.0f), 0.0f, d, f24208e, tileMode);
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

    public void setLocation(float f7) {
        this.f24209a = f7;
        a(f7);
        throw null;
    }

    public void setSettingsButtonImage(int i10) {
        throw null;
    }

    public void setSwatch(s1 s1Var) {
        setLocation(s1Var.f45777b);
        setWeight(s1Var.f45778c);
    }

    public void setUndoEnabled(boolean z10) {
        throw null;
    }

    public void setWeight(float f7) {
        this.f24210b = f7;
        invalidate();
    }

    public void setDelegate(a aVar) {
    }
}
