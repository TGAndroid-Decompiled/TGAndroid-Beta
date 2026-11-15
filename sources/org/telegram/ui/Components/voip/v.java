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
import org.telegram.ui.c40;
public final class v extends o2 {
    public float f40986h0;
    public final r3 f40987i0;
    public final l0 f40988j0;
    public final TextPaint f40989k0;
    public final StaticLayout f40990l0;
    public final TextPaint m0;
    public final String f40991n0;
    public final float f40992o0;
    public final StaticLayout f40993p0;
    public final c40 f40994q0;
    public final String f40995r0;
    public final float f40996s0;
    public final z f40997t0;

    public v(z zVar, Context context, r3 r3Var, l0 l0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, c40 c40Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.f40997t0 = zVar;
        this.f40987i0 = r3Var;
        this.f40988j0 = l0Var;
        this.f40989k0 = textPaint;
        this.f40990l0 = staticLayout;
        this.m0 = textPaint2;
        this.f40991n0 = str;
        this.f40992o0 = f10;
        this.f40993p0 = staticLayout2;
        this.f40994q0 = c40Var;
        this.f40995r0 = str2;
        this.f40996s0 = f11;
    }

    @Override
    public final void a() {
        super.a();
        this.f40986h0 = this.f40997t0.f41110x0;
    }

    @Override
    public final void b() {
        int i7;
        s3 s3Var;
        z zVar = this.f40997t0;
        TextView textView = zVar.P;
        v vVar = zVar.f41078a;
        invalidate();
        r3 r3Var = this.f40987i0;
        if (r3Var != null && r3Var.f26208b.rtmp_stream && zVar.A0) {
            org.telegram.messenger.g0.r(zVar.B0);
            zVar.A0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            vVar.animate().cancel();
            vVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = zVar.f41104t0;
        n2 n2Var = this.d;
        if (!z10 && n2Var.getAlpha() != 1.0f) {
            n2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f40833e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = zVar.f41112y0;
        if (imageView != null && imageView.getParent() != null) {
            if (zVar.f41112y0.getAlpha() == 1.0f) {
                zVar.f41112y0.animate().alpha(0.0f).setDuration(300L).setListener(new w9(this, 11)).start();
            } else if (zVar.f41112y0.getParent() != null) {
                vVar.removeView(zVar.f41112y0);
            }
        }
        int i10 = n2Var.rotatedFrameHeight;
        if (i10 != 0 && (i7 = n2Var.rotatedFrameWidth) != 0 && (s3Var = zVar.f41109x) != null) {
            s3Var.a(i7, i10, r3Var);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.v.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        z zVar = this.f40997t0;
        if (zVar.f41093k0 && view == zVar.f41078a.d) {
            canvas.save();
            float f10 = zVar.f41088f0;
            canvas.scale(f10, f10, zVar.f41089g0, zVar.f41090h0);
            canvas.translate(zVar.f41091i0, zVar.f41092j0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        super.e();
        z zVar = this.f40997t0;
        v vVar = zVar.f41078a;
        ImageView imageView = zVar.f41112y0;
        if (imageView != null && imageView.getParent() != null) {
            zVar.f41112y0.getLayoutParams().width = vVar.d.getMeasuredWidth();
            zVar.f41112y0.getLayoutParams().height = vVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        z zVar = this.f40997t0;
        zVar.R = true;
        zVar.invalidate();
        zVar.R = false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        s3 s3Var;
        z zVar = this.f40997t0;
        v vVar = zVar.f41078a;
        boolean z11 = zVar.f41107w;
        n2 n2Var = this.d;
        if (z11 && zVar.S && n2Var.rotatedFrameHeight != 0 && n2Var.rotatedFrameWidth != 0) {
            if (zVar.h) {
                vVar.f40829b0 = 1;
            } else if (zVar.f41080b) {
                vVar.f40829b0 = 1;
            } else if (this.f40988j0.f40724b) {
                vVar.f40829b0 = 0;
            } else if (zVar.f41109x.f26394b) {
                vVar.f40829b0 = 1;
            } else {
                vVar.f40829b0 = 2;
            }
            zVar.S = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        int i14 = n2Var.rotatedFrameHeight;
        if (i14 != 0 && (i13 = n2Var.rotatedFrameWidth) != 0 && (s3Var = zVar.f41109x) != null) {
            s3Var.a(i13, i14, this.f40987i0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f40997t0.requestLayout();
        super.requestLayout();
    }
}
