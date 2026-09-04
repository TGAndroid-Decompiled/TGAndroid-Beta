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
public final class u4 extends ListView {
    public final v4 f21368a;
    public final LinearGradient f21369b;
    public final Paint f21370c;
    public final Paint d;
    public final Matrix f21371e;

    public u4(v4 v4Var) {
        super(v4Var.f21411a);
        int[] iArr = new int[8];
        PathInterpolator pathInterpolator = yf.z.f50151i;
        yf.z.a(pathInterpolator, -16777216, iArr);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, AndroidUtilities.dp(16.0f), 0.0f, 0.0f, iArr, (float[]) null, tileMode);
        int[] iArr2 = new int[8];
        yf.z.a(pathInterpolator, -16777216, iArr2);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), iArr2, (float[]) null, tileMode);
        this.f21369b = linearGradient2;
        Paint paint = new Paint(1);
        this.f21370c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f21371e = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f21368a = v4Var;
        setVerticalScrollBarEnabled(false);
    }

    @Override
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (v4.b(this.f21368a)) {
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
            canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(16.0f), this.f21370c);
        }
        if (z11) {
            canvas.drawRect(0.0f, getHeight() - AndroidUtilities.dp(16.0f), getWidth(), getHeight(), this.d);
        }
        canvas.restore();
        return drawChild;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        v4 v4Var = this.f21368a;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(v4Var.I.getHeight() - v4Var.H.getHeight(), 1073741824));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        Matrix matrix = this.f21371e;
        matrix.reset();
        matrix.postTranslate(0.0f, i11 - AndroidUtilities.dp(16.0f));
        this.f21369b.setLocalMatrix(matrix);
    }
}
