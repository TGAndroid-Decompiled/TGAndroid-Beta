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

public final class s4 extends ListView {

    public final t4 f23760a;

    public final LinearGradient f23761b;

    public final Paint f23762c;
    public final Paint d;

    public final Matrix f23763e;

    public s4(t4 t4Var) {
        super(t4Var.f23782a);
        float fDp = AndroidUtilities.dp(16.0f);
        int[] iArr = new int[8];
        PathInterpolator pathInterpolator = gf.c0.f6953i;
        gf.c0.a(pathInterpolator, -16777216, iArr);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, fDp, 0.0f, 0.0f, iArr, (float[]) null, tileMode);
        float fDp2 = AndroidUtilities.dp(16.0f);
        int[] iArr2 = new int[8];
        gf.c0.a(pathInterpolator, -16777216, iArr2);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, fDp2, iArr2, (float[]) null, tileMode);
        this.f23761b = linearGradient2;
        Paint paint = new Paint(1);
        this.f23762c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f23763e = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f23760a = t4Var;
        setVerticalScrollBarEnabled(false);
    }

    @Override
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (t4.b(this.f23760a)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float y10 = view.getY();
        float height = y10 + view.getHeight();
        boolean z10 = y10 < ((float) AndroidUtilities.dp(16.0f));
        boolean z11 = height > ((float) (getHeight() - AndroidUtilities.dp(16.0f)));
        if (!z10 && !z11) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.saveLayer(0.0f, y10, getWidth(), height, null);
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (z10) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(16.0f), this.f23762c);
        }
        if (z11) {
            canvas.drawRect(0.0f, getHeight() - AndroidUtilities.dp(16.0f), getWidth(), getHeight(), this.d);
        }
        canvas.restore();
        return zDrawChild;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        t4 t4Var = this.f23760a;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(t4Var.I.getHeight() - t4Var.H.getHeight(), 1073741824));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        Matrix matrix = this.f23763e;
        matrix.reset();
        matrix.postTranslate(0.0f, i11 - AndroidUtilities.dp(16.0f));
        this.f23761b.setLocalMatrix(matrix);
    }
}
