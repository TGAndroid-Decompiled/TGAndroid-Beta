package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.u3;
import org.telegram.messenger.v3;
import org.telegram.ui.a50;
import org.telegram.ui.s9;
public final class n extends z1 {
    public float f31613g0;
    public final u3 f31614h0;
    public final x f31615i0;
    public final TextPaint f31616j0;
    public final StaticLayout f31617k0;
    public final TextPaint f31618l0;
    public final String m0;
    public final float f31619n0;
    public final StaticLayout f31620o0;
    public final a50 f31621p0;
    public final String f31622q0;
    public final float f31623r0;
    public final r f31624s0;

    public n(r rVar, Context context, u3 u3Var, x xVar, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, a50 a50Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f31624s0 = rVar;
        this.f31614h0 = u3Var;
        this.f31615i0 = xVar;
        this.f31616j0 = textPaint;
        this.f31617k0 = staticLayout;
        this.f31618l0 = textPaint2;
        this.m0 = str;
        this.f31619n0 = f7;
        this.f31620o0 = staticLayout2;
        this.f31621p0 = a50Var;
        this.f31622q0 = str2;
        this.f31623r0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f31613g0 = this.f31624s0.f31692w0;
    }

    @Override
    public final void b() {
        int i10;
        v3 v3Var;
        r rVar = this.f31624s0;
        TextView textView = rVar.O;
        n nVar = rVar.f31663a;
        invalidate();
        u3 u3Var = this.f31614h0;
        if (u3Var != null && u3Var.f18361b.rtmp_stream && rVar.f31697z0) {
            org.telegram.messenger.i0.r(rVar.A0);
            rVar.f31697z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            nVar.animate().cancel();
            nVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = rVar.f31687s0;
        y1 y1Var = this.d;
        if (!z10 && y1Var.getAlpha() != 1.0f) {
            y1Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = rVar.f31694x0;
        if (imageView != null && imageView.getParent() != null) {
            if (rVar.f31694x0.getAlpha() == 1.0f) {
                rVar.f31694x0.animate().alpha(0.0f).setDuration(300L).setListener(new s9(this, 22)).start();
            } else if (rVar.f31694x0.getParent() != null) {
                nVar.removeView(rVar.f31694x0);
            }
        }
        int i11 = y1Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = y1Var.rotatedFrameWidth) != 0 && (v3Var = rVar.f31693x) != null) {
            v3Var.a(i10, i11, u3Var);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.n.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        r rVar = this.f31624s0;
        if (rVar.f31676j0 && view == rVar.f31663a.d) {
            canvas.save();
            float f7 = rVar.f31670e0;
            canvas.scale(f7, f7, rVar.f31672f0, rVar.f31673g0);
            canvas.translate(rVar.f31674h0, rVar.f31675i0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        super.e();
        r rVar = this.f31624s0;
        n nVar = rVar.f31663a;
        ImageView imageView = rVar.f31694x0;
        if (imageView != null && imageView.getParent() != null) {
            rVar.f31694x0.getLayoutParams().width = nVar.d.getMeasuredWidth();
            rVar.f31694x0.getLayoutParams().height = nVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        r rVar = this.f31624s0;
        rVar.Q = true;
        rVar.invalidate();
        rVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        v3 v3Var;
        r rVar = this.f31624s0;
        n nVar = rVar.f31663a;
        boolean z11 = rVar.f31691w;
        y1 y1Var = this.d;
        if (z11 && rVar.R && y1Var.rotatedFrameHeight != 0 && y1Var.rotatedFrameWidth != 0) {
            if (rVar.h) {
                nVar.f31848a0 = 1;
            } else if (rVar.f31665b) {
                nVar.f31848a0 = 1;
            } else if (this.f31615i0.f31792b) {
                nVar.f31848a0 = 0;
            } else if (rVar.f31693x.f18589b) {
                nVar.f31848a0 = 1;
            } else {
                nVar.f31848a0 = 2;
            }
            rVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = y1Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = y1Var.rotatedFrameWidth) != 0 && (v3Var = rVar.f31693x) != null) {
            v3Var.a(i14, i15, this.f31614h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f31624s0.requestLayout();
        super.requestLayout();
    }
}
