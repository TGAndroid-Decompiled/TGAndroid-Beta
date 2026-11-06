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
import org.telegram.ui.c40;
import org.telegram.ui.va;
public final class u extends k2 {
    public float f39514g0;
    public final r3 f39515h0;
    public final k0 f39516i0;
    public final TextPaint f39517j0;
    public final StaticLayout f39518k0;
    public final TextPaint f39519l0;
    public final String m0;
    public final float f39520n0;
    public final StaticLayout f39521o0;
    public final c40 f39522p0;
    public final String f39523q0;
    public final float f39524r0;
    public final y f39525s0;

    public u(y yVar, Context context, r3 r3Var, k0 k0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, c40 c40Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.f39525s0 = yVar;
        this.f39515h0 = r3Var;
        this.f39516i0 = k0Var;
        this.f39517j0 = textPaint;
        this.f39518k0 = staticLayout;
        this.f39519l0 = textPaint2;
        this.m0 = str;
        this.f39520n0 = f10;
        this.f39521o0 = staticLayout2;
        this.f39522p0 = c40Var;
        this.f39523q0 = str2;
        this.f39524r0 = f11;
    }

    @Override
    public final void a() {
        super.a();
        this.f39514g0 = this.f39525s0.f39620w0;
    }

    @Override
    public final void b() {
        int i7;
        s3 s3Var;
        y yVar = this.f39525s0;
        TextView textView = yVar.O;
        u uVar = yVar.f39590a;
        invalidate();
        r3 r3Var = this.f39515h0;
        if (r3Var != null && r3Var.f25209b.rtmp_stream && yVar.f39625z0) {
            org.telegram.messenger.g0.r(yVar.A0);
            yVar.f39625z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            uVar.animate().cancel();
            uVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z9 = yVar.f39615s0;
        j2 j2Var = this.d;
        if (!z9 && j2Var.getAlpha() != 1.0f) {
            j2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f39302e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = yVar.f39622x0;
        if (imageView != null && imageView.getParent() != null) {
            if (yVar.f39622x0.getAlpha() == 1.0f) {
                yVar.f39622x0.animate().alpha(0.0f).setDuration(300L).setListener(new va(this, 10)).start();
            } else if (yVar.f39622x0.getParent() != null) {
                uVar.removeView(yVar.f39622x0);
            }
        }
        int i10 = j2Var.rotatedFrameHeight;
        if (i10 != 0 && (i7 = j2Var.rotatedFrameWidth) != 0 && (s3Var = yVar.f39621x) != null) {
            s3Var.a(i7, i10, r3Var);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.u.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        y yVar = this.f39525s0;
        if (yVar.f39604j0 && view == yVar.f39590a.d) {
            canvas.save();
            float f10 = yVar.f39598e0;
            canvas.scale(f10, f10, yVar.f39600f0, yVar.f39601g0);
            canvas.translate(yVar.f39602h0, yVar.f39603i0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        super.e();
        y yVar = this.f39525s0;
        u uVar = yVar.f39590a;
        ImageView imageView = yVar.f39622x0;
        if (imageView != null && imageView.getParent() != null) {
            yVar.f39622x0.getLayoutParams().width = uVar.d.getMeasuredWidth();
            yVar.f39622x0.getLayoutParams().height = uVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        y yVar = this.f39525s0;
        yVar.Q = true;
        yVar.invalidate();
        yVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        s3 s3Var;
        y yVar = this.f39525s0;
        u uVar = yVar.f39590a;
        boolean z10 = yVar.f39619w;
        j2 j2Var = this.d;
        if (z10 && yVar.R && j2Var.rotatedFrameHeight != 0 && j2Var.rotatedFrameWidth != 0) {
            if (yVar.h) {
                uVar.f39296a0 = 1;
            } else if (yVar.f39592b) {
                uVar.f39296a0 = 1;
            } else if (this.f39516i0.f39258b) {
                uVar.f39296a0 = 0;
            } else if (yVar.f39621x.f25414b) {
                uVar.f39296a0 = 1;
            } else {
                uVar.f39296a0 = 2;
            }
            yVar.R = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        int i14 = j2Var.rotatedFrameHeight;
        if (i14 != 0 && (i13 = j2Var.rotatedFrameWidth) != 0 && (s3Var = yVar.f39621x) != null) {
            s3Var.a(i13, i14, this.f39515h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f39525s0.requestLayout();
        super.requestLayout();
    }
}
