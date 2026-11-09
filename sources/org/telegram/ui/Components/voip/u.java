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
import org.telegram.ui.e40;
import org.telegram.ui.va;
public final class u extends k2 {
    public float f39638g0;
    public final r3 f39639h0;
    public final k0 f39640i0;
    public final TextPaint f39641j0;
    public final StaticLayout f39642k0;
    public final TextPaint f39643l0;
    public final String m0;
    public final float f39644n0;
    public final StaticLayout f39645o0;
    public final e40 f39646p0;
    public final String f39647q0;
    public final float f39648r0;
    public final y f39649s0;

    public u(y yVar, Context context, r3 r3Var, k0 k0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, e40 e40Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.f39649s0 = yVar;
        this.f39639h0 = r3Var;
        this.f39640i0 = k0Var;
        this.f39641j0 = textPaint;
        this.f39642k0 = staticLayout;
        this.f39643l0 = textPaint2;
        this.m0 = str;
        this.f39644n0 = f10;
        this.f39645o0 = staticLayout2;
        this.f39646p0 = e40Var;
        this.f39647q0 = str2;
        this.f39648r0 = f11;
    }

    @Override
    public final void a() {
        super.a();
        this.f39638g0 = this.f39649s0.f39744w0;
    }

    @Override
    public final void b() {
        int i7;
        s3 s3Var;
        y yVar = this.f39649s0;
        TextView textView = yVar.O;
        u uVar = yVar.f39714a;
        invalidate();
        r3 r3Var = this.f39639h0;
        if (r3Var != null && r3Var.f25222b.rtmp_stream && yVar.f39749z0) {
            org.telegram.messenger.g0.r(yVar.A0);
            yVar.f39749z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            uVar.animate().cancel();
            uVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z9 = yVar.f39739s0;
        j2 j2Var = this.d;
        if (!z9 && j2Var.getAlpha() != 1.0f) {
            j2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.f39426e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = yVar.f39746x0;
        if (imageView != null && imageView.getParent() != null) {
            if (yVar.f39746x0.getAlpha() == 1.0f) {
                yVar.f39746x0.animate().alpha(0.0f).setDuration(300L).setListener(new va(this, 10)).start();
            } else if (yVar.f39746x0.getParent() != null) {
                uVar.removeView(yVar.f39746x0);
            }
        }
        int i10 = j2Var.rotatedFrameHeight;
        if (i10 != 0 && (i7 = j2Var.rotatedFrameWidth) != 0 && (s3Var = yVar.f39745x) != null) {
            s3Var.a(i7, i10, r3Var);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.u.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        y yVar = this.f39649s0;
        if (yVar.f39728j0 && view == yVar.f39714a.d) {
            canvas.save();
            float f10 = yVar.f39722e0;
            canvas.scale(f10, f10, yVar.f39724f0, yVar.f39725g0);
            canvas.translate(yVar.f39726h0, yVar.f39727i0);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void e() {
        super.e();
        y yVar = this.f39649s0;
        u uVar = yVar.f39714a;
        ImageView imageView = yVar.f39746x0;
        if (imageView != null && imageView.getParent() != null) {
            yVar.f39746x0.getLayoutParams().width = uVar.d.getMeasuredWidth();
            yVar.f39746x0.getLayoutParams().height = uVar.d.getMeasuredHeight();
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        y yVar = this.f39649s0;
        yVar.Q = true;
        yVar.invalidate();
        yVar.Q = false;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        s3 s3Var;
        y yVar = this.f39649s0;
        u uVar = yVar.f39714a;
        boolean z10 = yVar.f39743w;
        j2 j2Var = this.d;
        if (z10 && yVar.R && j2Var.rotatedFrameHeight != 0 && j2Var.rotatedFrameWidth != 0) {
            if (yVar.h) {
                uVar.f39420a0 = 1;
            } else if (yVar.f39716b) {
                uVar.f39420a0 = 1;
            } else if (this.f39640i0.f39382b) {
                uVar.f39420a0 = 0;
            } else if (yVar.f39745x.f25410b) {
                uVar.f39420a0 = 1;
            } else {
                uVar.f39420a0 = 2;
            }
            yVar.R = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        int i14 = j2Var.rotatedFrameHeight;
        if (i14 != 0 && (i13 = j2Var.rotatedFrameWidth) != 0 && (s3Var = yVar.f39745x) != null) {
            s3Var.a(i13, i14, this.f39639h0);
        }
    }

    @Override
    public final void requestLayout() {
        this.f39649s0.requestLayout();
        super.requestLayout();
    }
}
