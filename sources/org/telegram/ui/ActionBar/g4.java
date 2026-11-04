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
public final class g4 extends ListView {
    public final i4 f27520a;
    public final LinearGradient f27521b;
    public final Paint f27522c;
    public final Paint d;
    public final Matrix f27523e;

    public g4(i4 i4Var) {
        super(i4Var.f27608a);
        int[] iArr = new int[8];
        PathInterpolator pathInterpolator = cg.b0.f4619i;
        cg.b0.a(pathInterpolator, -16777216, iArr);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, org.telegram.messenger.g0.L(16.0f), 0.0f, 0.0f, iArr, (float[]) null, tileMode);
        int[] iArr2 = new int[8];
        cg.b0.a(pathInterpolator, -16777216, iArr2);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(16.0f), iArr2, (float[]) null, tileMode);
        this.f27521b = linearGradient2;
        Paint paint = new Paint(1);
        this.f27522c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f27523e = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f27520a = i4Var;
        setVerticalScrollBarEnabled(false);
    }

    @Override
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (i4.b(this.f27520a)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean z11;
        float y9 = view.getY();
        float height = y9 + view.getHeight();
        if (y9 < org.telegram.messenger.g0.L(16.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (height > getHeight() - org.telegram.messenger.g0.L(16.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.saveLayer(0.0f, y9, getWidth(), height, null);
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(16.0f), this.f27522c);
        }
        if (z11) {
            canvas.drawRect(0.0f, getHeight() - org.telegram.messenger.g0.L(16.0f), getWidth(), getHeight(), this.d);
        }
        canvas.restore();
        return drawChild;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        i4 i4Var = this.f27520a;
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(i4Var.I.getHeight() - i4Var.H.getHeight(), 1073741824));
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        Matrix matrix = this.f27523e;
        matrix.reset();
        matrix.postTranslate(0.0f, i10 - org.telegram.messenger.g0.L(16.0f));
        this.f27521b.setLocalMatrix(matrix);
    }
}
