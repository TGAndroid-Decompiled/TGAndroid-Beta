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
public final class o5 extends View {
    public final Paint f34672a;
    public final Matrix f34673b;
    public final Path f34674c;
    public SweepGradient d;
    public float[] e;
    public final Paint f34675f;
    public float h;
    public float f34676n;

    public o5(Context context) {
        super(context);
        this.f34672a = new Paint(1);
        this.f34673b = new Matrix();
        this.f34674c = new Path();
        this.f34675f = new Paint(1);
        setClipToOutline(true);
        setOutlineProvider(new dh.b(this, 7));
        if (Build.VERSION.SDK_INT >= 31) {
            setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Shader.TileMode.CLAMP));
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.o5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.h = i10 * 0.5f;
        this.f34676n = i11 * 0.5f;
        this.d = new SweepGradient(this.h, this.f34676n, new int[]{-16216082, -15291399, -16216082, -15291399, -16216082}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f});
        float f7 = this.h;
        float f10 = this.f34676n;
        Matrix matrix = this.f34673b;
        matrix.setRotate(-69.01f, f7, f10);
        this.d.setLocalMatrix(matrix);
        this.f34672a.setShader(this.d);
        invalidateOutline();
    }
}
