package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class n5 extends View {
    public final Paint f34635a;
    public final Matrix f34636b;
    public final Path f34637c;
    public SweepGradient d;
    public float[] e;
    public final Paint f34638f;
    public float h;
    public float f34639n;

    public n5(Context context) {
        super(context);
        this.f34635a = new Paint(1);
        this.f34636b = new Matrix();
        this.f34637c = new Path();
        this.f34638f = new Paint(1);
        setClipToOutline(true);
        setOutlineProvider(new dh.b(this, 7));
        if (Build.VERSION.SDK_INT >= 31) {
            setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Shader.TileMode.CLAMP));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.n5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.h = i10 * 0.5f;
        this.f34639n = i11 * 0.5f;
        this.d = new SweepGradient(this.h, this.f34639n, new int[]{-16216082, -15291399, -16216082, -15291399, -16216082}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f});
        float f7 = this.h;
        float f10 = this.f34639n;
        Matrix matrix = this.f34636b;
        matrix.setRotate(-69.01f, f7, f10);
        this.d.setLocalMatrix(matrix);
        this.f34635a.setShader(this.d);
        invalidateOutline();
    }
}
