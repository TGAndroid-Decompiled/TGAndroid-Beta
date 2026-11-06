package org.telegram.ui.Components;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.view.View;
public final class uf0 implements vf0 {
    public final float f38626f;
    public final Paint f38628i;
    public final RectF f38629j;
    public final wf0 f38630k;
    public final Paint f38622a = new Paint(1);
    public final RenderNode f38623b = new RenderNode("render");
    public final RenderNode f38624c = new RenderNode("effectNotch");
    public final RenderNode d = new RenderNode("effect");
    public final RenderNode f38625e = new RenderNode("blur");
    public final RectF f38627g = new RectF();
    public final RectF h = new RectF();

    public uf0(wf0 wf0Var, float f10) {
        this.f38630k = wf0Var;
        Paint paint = new Paint();
        this.f38628i = paint;
        this.f38629j = new RectF();
        this.f38626f = f10;
        paint.setColor(-16777216);
        paint.setBlendMode(BlendMode.SRC_IN);
    }

    @Override
    public final void a(float f10) {
        RenderNode renderNode = this.d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        this.f38624c.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        this.f38622a.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
    }

    @Override
    public final void b(ax axVar, Canvas canvas) {
        Paint paint;
        float T1;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        Paint paint2;
        wf0 wf0Var = this.f38630k;
        Paint paint3 = wf0Var.f39951a;
        Path path = wf0Var.f39952b;
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        RectF rectF = this.f38627g;
        rectF.set(0.0f, 0.0f, wf0Var.getWidth(), wf0Var.getHeight());
        int childCount = wf0Var.getChildCount();
        RectF rectF2 = this.f38629j;
        if (childCount > 0) {
            View childAt = wf0Var.getChildAt(0);
            float scaleX = childAt.getScaleX() * childAt.getWidth();
            float scaleY = childAt.getScaleY() * childAt.getHeight();
            float x10 = childAt.getX();
            float y10 = childAt.getY();
            rectF2.set(x10, y10, scaleX + x10, scaleY + y10);
            org.telegram.messenger.bs bsVar = wf0Var.f39956n;
            if (bsVar != null) {
                rectF2.union(bsVar.f21692e);
            }
            rectF2.inset(-org.telegram.messenger.g0.L(20.0f), -org.telegram.messenger.g0.L(20.0f));
            rectF2.intersect(rectF);
            rectF2.top = 0.0f;
        } else {
            rectF2.set(rectF);
        }
        rectF2.bottom += org.telegram.messenger.g0.L(32.0f);
        int ceil = (int) Math.ceil(rectF2.width());
        int ceil2 = (int) Math.ceil(rectF2.height());
        float f15 = rectF2.left;
        float f16 = rectF2.top;
        this.f38623b.setPosition(0, 0, ceil, ceil2);
        this.f38625e.setPosition(0, 0, ceil, ceil2);
        this.d.setPosition(0, 0, ceil, ceil2);
        this.f38624c.setPosition(0, 0, ceil, ceil2);
        float f17 = ceil;
        float f18 = ceil2;
        rectF2.set(0.0f, 0.0f, f17, f18);
        RecordingCanvas beginRecording = this.f38623b.beginRecording();
        float f19 = -f15;
        float f20 = -f16;
        beginRecording.translate(f19, f20);
        int z12 = (int) ((1.0f - org.telegram.messenger.g0.z1(wf0Var.f39954e, 0.5f, 1.0f)) * 255.0f);
        int b10 = c8.j9.b(z12, 0, 255);
        wf0.a((wf0) axVar.f31929b, beginRecording);
        this.f38623b.endRecording();
        float f21 = this.f38626f;
        float z9 = com.google.android.recaptcha.internal.a.z(f21, 1.0f, 2.0f, com.google.android.recaptcha.internal.a.x(wf0Var.f39955f, 0.5f, f21, (f21 / 4.0f) + 1.0f));
        RecordingCanvas beginRecording2 = this.f38625e.beginRecording();
        float f22 = 1.0f / z9;
        beginRecording2.scale(f22, f22, 0.0f, 0.0f);
        beginRecording2.drawRenderNode(this.f38623b);
        this.f38625e.endRecording();
        float f23 = f21 + 2.0f;
        RecordingCanvas beginRecording3 = this.d.beginRecording();
        float f24 = 1.0f / f23;
        beginRecording3.scale(f24, f24, 0.0f, 0.0f);
        Paint paint4 = this.f38628i;
        if (b10 < 255) {
            beginRecording3.saveLayer(rectF2, null);
            beginRecording3.drawRenderNode(this.f38623b);
            beginRecording3.drawRect(rectF2, paint4);
            beginRecording3.restore();
        }
        float L = org.telegram.messenger.g0.L(7.0f) * f23;
        float f25 = wf0Var.f39954e;
        if (f25 < 0.5f) {
            paint = paint4;
            T1 = org.telegram.messenger.g0.T1(0.0f, L, f25 / 0.5f);
        } else {
            paint = paint4;
            T1 = org.telegram.messenger.g0.T1(L, 0.0f, (f25 - 0.5f) / 0.5f);
        }
        if (wf0Var.getChildCount() > 0) {
            View childAt2 = wf0Var.getChildAt(0);
            float scaleX2 = (((childAt2.getScaleX() * childAt2.getWidth()) / 2.0f) + childAt2.getX()) - f15;
            f10 = T1;
            float scaleY2 = ((((childAt2.getScaleY() * childAt2.getHeight()) / 2.0f) + childAt2.getY()) + org.telegram.messenger.g0.L(32.0f)) - f16;
            float scaleX3 = childAt2.getScaleX() * (childAt2.getWidth() / 2.0f);
            path.rewind();
            f11 = f15;
            path.moveTo(scaleX2 - scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
            path.lineTo(scaleX2, (scaleY2 - scaleX3) - (0.25f * f10));
            path.lineTo(scaleX2 + scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
            path.close();
            beginRecording3.drawPath(path, paint3);
        } else {
            f10 = T1;
            f11 = f15;
        }
        if (b10 > 0) {
            if (b10 != 255) {
                beginRecording3.saveLayerAlpha(rectF2, b10);
            }
            beginRecording3.drawRenderNode(this.f38623b);
            if (b10 != 255) {
                beginRecording3.restore();
            }
        }
        this.d.endRecording();
        RecordingCanvas beginRecording4 = this.f38624c.beginRecording();
        beginRecording4.scale(f24, f24, 0.0f, 0.0f);
        if (wf0Var.f39956n != null) {
            beginRecording4.translate(f19, f20);
            beginRecording4.translate(0.0f, org.telegram.messenger.g0.L(32.0f));
            org.telegram.messenger.bs bsVar2 = wf0Var.f39956n;
            if (bsVar2.f21691c) {
                float min = Math.min(bsVar2.f21692e.width(), wf0Var.f39956n.f21692e.height()) / 2.0f;
                RectF rectF3 = wf0Var.f39956n.f21692e;
                float width = rectF3.bottom - (rectF3.width() / 2.0f);
                beginRecording4.drawCircle(wf0Var.f39956n.f21692e.centerX(), width, min, paint3);
                path.rewind();
                float f26 = f10 / 2.0f;
                path.moveTo(wf0Var.f39956n.f21692e.centerX() - f26, width);
                path.lineTo(wf0Var.f39956n.f21692e.centerX(), min + width + f10);
                path.lineTo(wf0Var.f39956n.f21692e.centerX() + f26, width);
                path.close();
                beginRecording4.drawPath(path, paint3);
            } else if (bsVar2.f21690b) {
                beginRecording4.drawPath(bsVar2.d, paint3);
            } else {
                float max = Math.max(bsVar2.f21692e.width(), wf0Var.f39956n.f21692e.height()) / 2.0f;
                RectF rectF4 = wf0Var.f39956n.f21692e;
                RectF rectF5 = this.h;
                rectF5.set(rectF4);
                beginRecording4.drawRoundRect(rectF5, max, max, paint3);
                path.rewind();
                float f27 = f10 / 2.0f;
                path.moveTo(rectF5.centerX() - f27, rectF5.bottom);
                path.lineTo(rectF5.centerX(), rectF5.bottom + f10);
                path.lineTo(rectF5.centerX() + f27, rectF5.bottom);
                path.close();
                beginRecording4.drawPath(path, paint3);
            }
            f12 = f18;
            f13 = f17;
            f14 = z9;
            paint2 = paint;
        } else {
            f12 = f18;
            f13 = f17;
            f14 = z9;
            paint2 = paint;
            beginRecording4.drawRect(0.0f, 0.0f, f13, org.telegram.messenger.g0.L(32.0f), paint3);
            path.rewind();
            path.moveTo((f13 - f10) / 2.0f, org.telegram.messenger.g0.L(32.0f));
            path.lineTo(f13 / 2.0f, org.telegram.messenger.g0.L(32.0f) + f10);
            path.lineTo((f13 + f10) / 2.0f, org.telegram.messenger.g0.L(32.0f));
            path.close();
            beginRecording4.drawPath(path, paint3);
        }
        this.f38624c.endRecording();
        canvas.save();
        canvas.translate(f11, f16 - org.telegram.messenger.g0.L(32.0f));
        org.telegram.messenger.bs bsVar3 = wf0Var.f39956n;
        if (bsVar3 != null) {
            canvas.clipRect(0.0f, bsVar3.f21692e.top, f13, f12);
        }
        Paint paint5 = this.f38622a;
        canvas.saveLayer(rectF2, paint5);
        canvas.scale(f23, f23);
        canvas.drawRenderNode(this.f38624c);
        canvas.drawRenderNode(this.d);
        canvas.restore();
        int b11 = c8.j9.b((z12 * 3) / 4, 0, 255);
        if (b11 < 255) {
            canvas.saveLayer(rectF2, null);
            if (wf0Var.f39955f != 0.0f) {
                canvas.saveLayer(rectF2, paint5);
                canvas.scale(f14, f14);
                canvas.drawRenderNode(this.f38625e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f38623b);
            }
            canvas.drawRect(rectF2, paint2);
            canvas.restore();
        }
        if (b11 > 0) {
            if (b11 != 255) {
                canvas.saveLayerAlpha(rectF2, b11);
            }
            if (wf0Var.f39955f != 0.0f) {
                canvas.saveLayer(rectF2, paint5);
                canvas.scale(f14, f14);
                canvas.drawRenderNode(this.f38625e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f38623b);
            }
            if (b11 != 255) {
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override
    public final void c(float f10) {
        Shader.TileMode tileMode;
        if (f10 == 0.0f) {
            this.f38625e.setRenderEffect(null);
            return;
        }
        RenderNode renderNode = this.f38625e;
        float f11 = this.f38630k.d;
        float f12 = this.f38626f;
        tileMode = Shader.TileMode.DECAL;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect((f10 * f11) / f12, (f10 * f11) / f12, tileMode));
    }

    @Override
    public final void d(int i7, int i10) {
    }
}
