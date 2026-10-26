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
public final class z4 extends ListView {
    public final a5 f23786a;
    public final LinearGradient f23787b;
    public final Paint f23788c;
    public final Paint d;
    public final Matrix e;

    public z4(a5 a5Var) {
        super(a5Var.f22397a);
        int[] iArr = new int[8];
        PathInterpolator pathInterpolator = ag.h0.f1292i;
        ag.h0.a(pathInterpolator, -16777216, iArr);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, AndroidUtilities.dp(16.0f), 0.0f, 0.0f, iArr, (float[]) null, tileMode);
        int[] iArr2 = new int[8];
        ag.h0.a(pathInterpolator, -16777216, iArr2);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), iArr2, (float[]) null, tileMode);
        this.f23787b = linearGradient2;
        Paint paint = new Paint(1);
        this.f23788c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f23786a = a5Var;
        setVerticalScrollBarEnabled(false);
    }

    @Override
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (a5.b(this.f23786a)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
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
            return super.drawChild(canvas, view, j10);
        }
        canvas.saveLayer(0.0f, y3, getWidth(), height, null);
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(16.0f), this.f23788c);
        }
        if (z11) {
            canvas.drawRect(0.0f, getHeight() - AndroidUtilities.dp(16.0f), getWidth(), getHeight(), this.d);
        }
        canvas.restore();
        return drawChild;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        a5 a5Var = this.f23786a;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(a5Var.I.getHeight() - a5Var.H.getHeight(), 1073741824));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        Matrix matrix = this.e;
        matrix.reset();
        matrix.postTranslate(0.0f, i11 - AndroidUtilities.dp(16.0f));
        this.f23787b.setLocalMatrix(matrix);
    }
}
