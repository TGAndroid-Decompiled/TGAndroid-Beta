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
import org.telegram.ui.Cells.x9;
import org.telegram.ui.e40;
public final class v extends o2 {
    public float f41265h0;
    public final t3 f41266i0;
    public final l0 f41267j0;
    public final TextPaint f41268k0;
    public final StaticLayout f41269l0;
    public final TextPaint m0;
    public final String f41270n0;
    public final float f41271o0;
    public final StaticLayout f41272p0;
    public final e40 f41273q0;
    public final String f41274r0;
    public final float f41275s0;
    public final z f41276t0;

    public v(z zVar, Context context, t3 t3Var, l0 l0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, e40 e40Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.f41276t0 = zVar;
        this.f41266i0 = t3Var;
        this.f41267j0 = l0Var;
        this.f41268k0 = textPaint;
        this.f41269l0 = staticLayout;
        this.m0 = textPaint2;
        this.f41270n0 = str;
        this.f41271o0 = f10;
        this.f41272p0 = staticLayout2;
        this.f41273q0 = e40Var;
        this.f41274r0 = str2;
        this.f41275s0 = f11;
    }

    @Override
    public final void a() {
        super.a();
        this.f41265h0 = this.f41276t0.f41389x0;
    }

    @Override
    public final void b() {
        int i7;
        u3 u3Var;
        z zVar = this.f41276t0;
        TextView textView = zVar.P;
        v vVar = zVar.f41357a;
        invalidate();
        t3 t3Var = this.f41266i0;
        if (t3Var != null && t3Var.f27034b.rtmp_stream && zVar.A0) {
            org.telegram.messenger.g0.r(zVar.B0);
            zVar.A0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            vVar.animate().cancel();
            vVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = zVar.f41383t0;
        n2 n2Var = this.d;
        if (!z10 && n2Var.getAlpha() != 1.0f) {
            n2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f41113e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = zVar.f41391y0;
        if (imageView != null && imageView.getParent() != null) {
            if (zVar.f41391y0.getAlpha() == 1.0f) {
                zVar.f41391y0.animate().alpha(0.0f).setDuration(300L).setListener(new x9(this, 11)).start();
            } else if (zVar.f41391y0.getParent() != null) {
                vVar.removeView(zVar.f41391y0);
            }
        }
        int i10 = n2Var.rotatedFrameHeight;
        if (i10 != 0 && (i7 = n2Var.rotatedFrameWidth) != 0 && (u3Var = zVar.f41388x) != null) {
            u3Var.a(i7, i10, t3Var);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.v.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        z zVar = this.f41276t0;
        if (zVar.f41372k0 && view == zVar.f41357a.d) {
            canvas.save();
            float f10 = zVar.f41367f0;
            canvas.scale(f10, f10, zVar.f41368g0, zVar.f41369h0);
            canvas.translate(zVar.f41370i0, zVar.f41371j0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        super.e();
        z zVar = this.f41276t0;
        v vVar = zVar.f41357a;
        ImageView imageView = zVar.f41391y0;
        if (imageView != null && imageView.getParent() != null) {
            zVar.f41391y0.getLayoutParams().width = vVar.d.getMeasuredWidth();
            zVar.f41391y0.getLayoutParams().height = vVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        z zVar = this.f41276t0;
        zVar.R = true;
        zVar.invalidate();
        zVar.R = false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        u3 u3Var;
        z zVar = this.f41276t0;
        v vVar = zVar.f41357a;
        boolean z11 = zVar.f41386w;
        n2 n2Var = this.d;
        if (z11 && zVar.S && n2Var.rotatedFrameHeight != 0 && n2Var.rotatedFrameWidth != 0) {
            if (zVar.h) {
                vVar.f41109b0 = 1;
            } else if (zVar.f41359b) {
                vVar.f41109b0 = 1;
            } else if (this.f41267j0.f41003b) {
                vVar.f41109b0 = 0;
            } else if (zVar.f41388x.f27216b) {
                vVar.f41109b0 = 1;
            } else {
                vVar.f41109b0 = 2;
            }
            zVar.S = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        int i14 = n2Var.rotatedFrameHeight;
        if (i14 != 0 && (i13 = n2Var.rotatedFrameWidth) != 0 && (u3Var = zVar.f41388x) != null) {
            u3Var.a(i13, i14, this.f41266i0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f41276t0.requestLayout();
        super.requestLayout();
    }
}
