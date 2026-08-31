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
public final class w4 extends ListView {
    public final x4 f22390a;
    public final LinearGradient f22391b;
    public final Paint f22392c;
    public final Paint d;
    public final Matrix f22393e;

    public w4(x4 x4Var) {
        super(x4Var.f22423a);
        int[] iArr = new int[8];
        PathInterpolator pathInterpolator = lf.b0.f12397i;
        lf.b0.a(pathInterpolator, -16777216, iArr);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, AndroidUtilities.dp(16.0f), 0.0f, 0.0f, iArr, (float[]) null, tileMode);
        int[] iArr2 = new int[8];
        lf.b0.a(pathInterpolator, -16777216, iArr2);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), iArr2, (float[]) null, tileMode);
        this.f22391b = linearGradient2;
        Paint paint = new Paint(1);
        this.f22392c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f22393e = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f22390a = x4Var;
        setVerticalScrollBarEnabled(false);
    }

    @Override
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (x4.b(this.f22390a)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        boolean z10;
        float y10 = view.getY();
        float height = y10 + view.getHeight();
        if (y10 < AndroidUtilities.dp(16.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (height > getHeight() - AndroidUtilities.dp(16.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z4 && !z10) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.saveLayer(0.0f, y10, getWidth(), height, null);
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z4) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(16.0f), this.f22392c);
        }
        if (z10) {
            canvas.drawRect(0.0f, getHeight() - AndroidUtilities.dp(16.0f), getWidth(), getHeight(), this.d);
        }
        canvas.restore();
        return drawChild;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        x4 x4Var = this.f22390a;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(x4Var.I.getHeight() - x4Var.H.getHeight(), 1073741824));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        Matrix matrix = this.f22393e;
        matrix.reset();
        matrix.postTranslate(0.0f, i11 - AndroidUtilities.dp(16.0f));
        this.f22391b.setLocalMatrix(matrix);
    }
}
