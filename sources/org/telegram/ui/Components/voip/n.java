package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.x30;
public final class n extends z1 {
    public float f39481h0;
    public final r3 f39482i0;
    public final x f39483j0;
    public final TextPaint f39484k0;
    public final StaticLayout f39485l0;
    public final TextPaint m0;
    public final String f39486n0;
    public final float f39487o0;
    public final StaticLayout f39488p0;
    public final x30 f39489q0;
    public final String f39490r0;
    public final float f39491s0;
    public final r f39492t0;

    public n(r rVar, Context context, r3 r3Var, x xVar, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, x30 x30Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.f39492t0 = rVar;
        this.f39482i0 = r3Var;
        this.f39483j0 = xVar;
        this.f39484k0 = textPaint;
        this.f39485l0 = staticLayout;
        this.m0 = textPaint2;
        this.f39486n0 = str;
        this.f39487o0 = f10;
        this.f39488p0 = staticLayout2;
        this.f39489q0 = x30Var;
        this.f39490r0 = str2;
        this.f39491s0 = f11;
    }

    @Override
    public final void a() {
        super.a();
        this.f39481h0 = this.f39492t0.f39578x0;
    }

    @Override
    public final void b() {
        int i3;
        s3 s3Var;
        r rVar = this.f39492t0;
        TextView textView = rVar.P;
        n nVar = rVar.f39546a;
        invalidate();
        r3 r3Var = this.f39482i0;
        if (r3Var != null && r3Var.f25049b.rtmp_stream && rVar.A0) {
            org.telegram.messenger.g0.r(rVar.B0);
            rVar.A0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            nVar.animate().cancel();
            nVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = rVar.f39572t0;
        y1 y1Var = this.d;
        if (!z10 && y1Var.getAlpha() != 1.0f) {
            y1Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f39737e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = rVar.f39580y0;
        if (imageView != null && imageView.getParent() != null) {
            if (rVar.f39580y0.getAlpha() == 1.0f) {
                rVar.f39580y0.animate().alpha(0.0f).setDuration(300L).setListener(new w9(this, 11)).start();
            } else if (rVar.f39580y0.getParent() != null) {
                nVar.removeView(rVar.f39580y0);
            }
        }
        int i10 = y1Var.rotatedFrameHeight;
        if (i10 != 0 && (i3 = y1Var.rotatedFrameWidth) != 0 && (s3Var = rVar.f39577x) != null) {
            s3Var.a(i3, i10, r3Var);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.n.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        r rVar = this.f39492t0;
        if (rVar.f39561k0 && view == rVar.f39546a.d) {
            canvas.save();
            float f10 = rVar.f39556f0;
            canvas.scale(f10, f10, rVar.f39557g0, rVar.f39558h0);
            canvas.translate(rVar.f39559i0, rVar.f39560j0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        super.e();
        r rVar = this.f39492t0;
        n nVar = rVar.f39546a;
        ImageView imageView = rVar.f39580y0;
        if (imageView != null && imageView.getParent() != null) {
            rVar.f39580y0.getLayoutParams().width = nVar.d.getMeasuredWidth();
            rVar.f39580y0.getLayoutParams().height = nVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        r rVar = this.f39492t0;
        rVar.R = true;
        rVar.invalidate();
        rVar.R = false;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        s3 s3Var;
        r rVar = this.f39492t0;
        n nVar = rVar.f39546a;
        boolean z11 = rVar.f39575w;
        y1 y1Var = this.d;
        if (z11 && rVar.S && y1Var.rotatedFrameHeight != 0 && y1Var.rotatedFrameWidth != 0) {
            if (rVar.h) {
                nVar.f39733b0 = 1;
            } else if (rVar.f39548b) {
                nVar.f39733b0 = 1;
            } else if (this.f39483j0.f39670b) {
                nVar.f39733b0 = 0;
            } else if (rVar.f39577x.f25271b) {
                nVar.f39733b0 = 1;
            } else {
                nVar.f39733b0 = 2;
            }
            rVar.S = false;
        }
        super.onLayout(z10, i3, i10, i11, i12);
        int i14 = y1Var.rotatedFrameHeight;
        if (i14 != 0 && (i13 = y1Var.rotatedFrameWidth) != 0 && (s3Var = rVar.f39577x) != null) {
            s3Var.a(i13, i14, this.f39482i0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f39492t0.requestLayout();
        super.requestLayout();
    }
}
