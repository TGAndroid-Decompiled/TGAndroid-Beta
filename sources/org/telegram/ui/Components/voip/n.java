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
import org.telegram.ui.b50;
import org.telegram.ui.s9;
public final class n extends y1 {
    public float f31541g0;
    public final u3 f31542h0;
    public final w f31543i0;
    public final TextPaint f31544j0;
    public final StaticLayout f31545k0;
    public final TextPaint f31546l0;
    public final String m0;
    public final float f31547n0;
    public final StaticLayout f31548o0;
    public final b50 f31549p0;
    public final String f31550q0;
    public final float f31551r0;
    public final r f31552s0;

    public n(r rVar, Context context, u3 u3Var, w wVar, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, b50 b50Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.f31552s0 = rVar;
        this.f31542h0 = u3Var;
        this.f31543i0 = wVar;
        this.f31544j0 = textPaint;
        this.f31545k0 = staticLayout;
        this.f31546l0 = textPaint2;
        this.m0 = str;
        this.f31547n0 = f7;
        this.f31548o0 = staticLayout2;
        this.f31549p0 = b50Var;
        this.f31550q0 = str2;
        this.f31551r0 = f10;
    }

    @Override
    public final void a() {
        super.a();
        this.f31541g0 = this.f31552s0.f31629w0;
    }

    @Override
    public final void b() {
        int i10;
        v3 v3Var;
        r rVar = this.f31552s0;
        TextView textView = rVar.O;
        n nVar = rVar.f31600a;
        invalidate();
        u3 u3Var = this.f31542h0;
        if (u3Var != null && u3Var.f18228b.rtmp_stream && rVar.f31634z0) {
            org.telegram.messenger.i0.r(rVar.A0);
            rVar.f31634z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            nVar.animate().cancel();
            nVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = rVar.f31624s0;
        x1 x1Var = this.d;
        if (!z10 && x1Var.getAlpha() != 1.0f) {
            x1Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = rVar.f31631x0;
        if (imageView != null && imageView.getParent() != null) {
            if (rVar.f31631x0.getAlpha() == 1.0f) {
                rVar.f31631x0.animate().alpha(0.0f).setDuration(300L).setListener(new s9(this, 22)).start();
            } else if (rVar.f31631x0.getParent() != null) {
                nVar.removeView(rVar.f31631x0);
            }
        }
        int i11 = x1Var.rotatedFrameHeight;
        if (i11 != 0 && (i10 = x1Var.rotatedFrameWidth) != 0 && (v3Var = rVar.f31630x) != null) {
            v3Var.a(i10, i11, u3Var);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.n.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        r rVar = this.f31552s0;
        if (rVar.f31613j0 && view == rVar.f31600a.d) {
            canvas.save();
            float f7 = rVar.f31607e0;
            canvas.scale(f7, f7, rVar.f31609f0, rVar.f31610g0);
            canvas.translate(rVar.f31611h0, rVar.f31612i0);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void e() {
        super.e();
        r rVar = this.f31552s0;
        n nVar = rVar.f31600a;
        ImageView imageView = rVar.f31631x0;
        if (imageView != null && imageView.getParent() != null) {
            rVar.f31631x0.getLayoutParams().width = nVar.d.getMeasuredWidth();
            rVar.f31631x0.getLayoutParams().height = nVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        r rVar = this.f31552s0;
        rVar.Q = true;
        rVar.invalidate();
        rVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        v3 v3Var;
        r rVar = this.f31552s0;
        n nVar = rVar.f31600a;
        boolean z11 = rVar.f31628w;
        x1 x1Var = this.d;
        if (z11 && rVar.R && x1Var.rotatedFrameHeight != 0 && x1Var.rotatedFrameWidth != 0) {
            if (rVar.h) {
                nVar.f31768a0 = 1;
            } else if (rVar.f31602b) {
                nVar.f31768a0 = 1;
            } else if (this.f31543i0.f31712b) {
                nVar.f31768a0 = 0;
            } else if (rVar.f31630x.f18478b) {
                nVar.f31768a0 = 1;
            } else {
                nVar.f31768a0 = 2;
            }
            rVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = x1Var.rotatedFrameHeight;
        if (i15 != 0 && (i14 = x1Var.rotatedFrameWidth) != 0 && (v3Var = rVar.f31630x) != null) {
            v3Var.a(i14, i15, this.f31542h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f31552s0.requestLayout();
        super.requestLayout();
    }
}
