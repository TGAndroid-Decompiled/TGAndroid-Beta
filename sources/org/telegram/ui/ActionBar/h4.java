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
public final class h4 extends ListView {
    public final i4 f27509a;
    public final LinearGradient f27510b;
    public final Paint f27511c;
    public final Paint d;
    public final Matrix f27512e;

    public h4(i4 i4Var) {
        super(i4Var.f27567a);
        int[] iArr = new int[8];
        PathInterpolator pathInterpolator = bg.c0.f3259i;
        bg.c0.a(pathInterpolator, -16777216, iArr);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, org.telegram.messenger.g0.L(16.0f), 0.0f, 0.0f, iArr, (float[]) null, tileMode);
        int[] iArr2 = new int[8];
        bg.c0.a(pathInterpolator, -16777216, iArr2);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(16.0f), iArr2, (float[]) null, tileMode);
        this.f27510b = linearGradient2;
        Paint paint = new Paint(1);
        this.f27511c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f27512e = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f27509a = i4Var;
        setVerticalScrollBarEnabled(false);
    }

    @Override
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (i4.b(this.f27509a)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        boolean z10;
        float y10 = view.getY();
        float height = y10 + view.getHeight();
        if (y10 < org.telegram.messenger.g0.L(16.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (height > getHeight() - org.telegram.messenger.g0.L(16.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z9 && !z10) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.saveLayer(0.0f, y10, getWidth(), height, null);
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z9) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(16.0f), this.f27511c);
        }
        if (z10) {
            canvas.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.L(16.0f), getWidth(), getHeight(), this.d);
        }
        canvas.restore();
        return drawChild;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        i4 i4Var = this.f27509a;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i4Var.I.getHeight() - i4Var.H.getHeight(), 1073741824));
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        Matrix matrix = this.f27512e;
        matrix.reset();
        matrix.postTranslate(0.0f, i10 - org.telegram.messenger.g0.L(16.0f));
        this.f27510b.setLocalMatrix(matrix);
    }
}
