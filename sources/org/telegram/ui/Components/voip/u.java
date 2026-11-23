package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.f40;
public final class u extends n2 {
    public float f41369h0;
    public final t3 f41370i0;
    public final k0 f41371j0;
    public final TextPaint f41372k0;
    public final StaticLayout f41373l0;
    public final TextPaint m0;
    public final String f41374n0;
    public final float f41375o0;
    public final StaticLayout f41376p0;
    public final f40 f41377q0;
    public final String f41378r0;
    public final float f41379s0;
    public final y f41380t0;

    public u(y yVar, Context context, t3 t3Var, k0 k0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, f40 f40Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.f41380t0 = yVar;
        this.f41370i0 = t3Var;
        this.f41371j0 = k0Var;
        this.f41372k0 = textPaint;
        this.f41373l0 = staticLayout;
        this.m0 = textPaint2;
        this.f41374n0 = str;
        this.f41375o0 = f10;
        this.f41376p0 = staticLayout2;
        this.f41377q0 = f40Var;
        this.f41378r0 = str2;
        this.f41379s0 = f11;
    }

    @Override
    public final void a() {
        super.a();
        this.f41369h0 = this.f41380t0.f41493x0;
    }

    @Override
    public final void b() {
        int i7;
        u3 u3Var;
        y yVar = this.f41380t0;
        TextView textView = yVar.P;
        u uVar = yVar.f41461a;
        invalidate();
        t3 t3Var = this.f41370i0;
        if (t3Var != null && t3Var.f26950b.rtmp_stream && yVar.A0) {
            org.telegram.messenger.g0.r(yVar.B0);
            yVar.A0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            uVar.animate().cancel();
            uVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = yVar.f41487t0;
        m2 m2Var = this.d;
        if (!z10 && m2Var.getAlpha() != 1.0f) {
            m2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f41217e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = yVar.f41495y0;
        if (imageView != null && imageView.getParent() != null) {
            if (yVar.f41495y0.getAlpha() == 1.0f) {
                yVar.f41495y0.animate().alpha(0.0f).setDuration(300L).setListener(new y9(this, 11)).start();
            } else if (yVar.f41495y0.getParent() != null) {
                uVar.removeView(yVar.f41495y0);
            }
        }
        int i10 = m2Var.rotatedFrameHeight;
        if (i10 != 0 && (i7 = m2Var.rotatedFrameWidth) != 0 && (u3Var = yVar.f41492x) != null) {
            u3Var.a(i7, i10, t3Var);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.u.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        y yVar = this.f41380t0;
        if (yVar.f41476k0 && view == yVar.f41461a.d) {
            canvas.save();
            float f10 = yVar.f41471f0;
            canvas.scale(f10, f10, yVar.f41472g0, yVar.f41473h0);
            canvas.translate(yVar.f41474i0, yVar.f41475j0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        super.e();
        y yVar = this.f41380t0;
        u uVar = yVar.f41461a;
        ImageView imageView = yVar.f41495y0;
        if (imageView != null && imageView.getParent() != null) {
            yVar.f41495y0.getLayoutParams().width = uVar.d.getMeasuredWidth();
            yVar.f41495y0.getLayoutParams().height = uVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        y yVar = this.f41380t0;
        yVar.R = true;
        yVar.invalidate();
        yVar.R = false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        u3 u3Var;
        y yVar = this.f41380t0;
        u uVar = yVar.f41461a;
        boolean z11 = yVar.f41490w;
        m2 m2Var = this.d;
        if (z11 && yVar.S && m2Var.rotatedFrameHeight != 0 && m2Var.rotatedFrameWidth != 0) {
            if (yVar.h) {
                uVar.f41213b0 = 1;
            } else if (yVar.f41463b) {
                uVar.f41213b0 = 1;
            } else if (this.f41371j0.f41109b) {
                uVar.f41213b0 = 0;
            } else if (yVar.f41492x.f27156b) {
                uVar.f41213b0 = 1;
            } else {
                uVar.f41213b0 = 2;
            }
            yVar.S = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        int i14 = m2Var.rotatedFrameHeight;
        if (i14 != 0 && (i13 = m2Var.rotatedFrameWidth) != 0 && (u3Var = yVar.f41492x) != null) {
            u3Var.a(i13, i14, this.f41370i0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f41380t0.requestLayout();
        super.requestLayout();
    }
}
