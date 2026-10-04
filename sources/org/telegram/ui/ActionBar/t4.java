package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.ListView;
import org.telegram.messenger.AndroidUtilities;
public final class t4 extends ListView {
    public final u4 f21524a;
    public final LinearGradient f21525b;
    public final Paint f21526c;
    public final Paint d;
    public final Matrix f21527e;

    public t4(u4 u4Var) {
        super(u4Var.f21542a);
        int[] iArr = new int[8];
        PathInterpolator pathInterpolator = yf.y.f51035i;
        yf.y.a(pathInterpolator, -16777216, iArr);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, AndroidUtilities.dp(16.0f), 0.0f, 0.0f, iArr, (float[]) null, tileMode);
        int[] iArr2 = new int[8];
        yf.y.a(pathInterpolator, -16777216, iArr2);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), iArr2, (float[]) null, tileMode);
        this.f21525b = linearGradient2;
        Paint paint = new Paint(1);
        this.f21526c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f21527e = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f21524a = u4Var;
        setVerticalScrollBarEnabled(false);
    }

    @Override
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (u4.b(this.f21524a)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        boolean z11;
        float y3 = view.getY();
        float height = y3 + view.getHeight();
        if (y3 < AndroidUtilities.dp(16.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (height > getHeight() - AndroidUtilities.dp(16.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.saveLayer(0.0f, y3, getWidth(), height, null);
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(16.0f), this.f21526c);
        }
        if (z11) {
            canvas.drawRect(0.0f, getHeight() - AndroidUtilities.dp(16.0f), getWidth(), getHeight(), this.d);
        }
        canvas.restore();
        return drawChild;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        u4 u4Var = this.f21524a;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(u4Var.I.getHeight() - u4Var.H.getHeight(), 1073741824));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        Matrix matrix = this.f21527e;
        matrix.reset();
        matrix.postTranslate(0.0f, i11 - AndroidUtilities.dp(16.0f));
        this.f21525b.setLocalMatrix(matrix);
    }
}
