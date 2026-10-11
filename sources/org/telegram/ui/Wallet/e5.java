package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e5 extends View {
    public final Paint f34843a;
    public final Matrix f34844b;
    public final Path f34845c;
    public SweepGradient d;
    public float f34846e;
    public float f34847f;

    public e5(Context context) {
        super(context);
        this.f34843a = new Paint(1);
        this.f34844b = new Matrix();
        this.f34845c = new Path();
        setClipToOutline(true);
        setOutlineProvider(new ch.b(this, 7));
        if (Build.VERSION.SDK_INT >= 31) {
            setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Shader.TileMode.CLAMP));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f34843a);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f34846e = i10 * 0.5f;
        this.f34847f = i11 * 0.5f;
        this.d = new SweepGradient(this.f34846e, this.f34847f, new int[]{-16216082, -15291399, -16216082, -15291399, -16216082}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f});
        float f7 = this.f34846e;
        float f10 = this.f34847f;
        Matrix matrix = this.f34844b;
        matrix.setRotate(-69.01f, f7, f10);
        this.d.setLocalMatrix(matrix);
        this.f34843a.setShader(this.d);
        invalidateOutline();
    }
}
