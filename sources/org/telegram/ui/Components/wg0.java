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
public final class wg0 implements xg0 {
    public final float f32177f;
    public final Paint f32179i;
    public final RectF f32180j;
    public final yg0 f32181k;
    public final Paint f32174a = new Paint(1);
    public final RenderNode f32175b = new RenderNode("render");
    public final RenderNode f32176c = new RenderNode("effectNotch");
    public final RenderNode d = new RenderNode("effect");
    public final RenderNode e = new RenderNode("blur");
    public final RectF f32178g = new RectF();
    public final RectF h = new RectF();

    public wg0(yg0 yg0Var, float f7) {
        this.f32181k = yg0Var;
        Paint paint = new Paint();
        this.f32179i = paint;
        this.f32180j = new RectF();
        this.f32177f = f7;
        paint.setColor(-16777216);
        paint.setBlendMode(BlendMode.SRC_IN);
    }

    @Override
    public final void a(float f7) {
        RenderNode renderNode = this.d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f7, f7, tileMode));
        this.f32176c.setRenderEffect(RenderEffect.createBlurEffect(f7, f7, tileMode));
        this.f32174a.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
    }

    @Override
    public final void b(px pxVar, Canvas canvas) {
        Paint paint;
        float T1;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        Paint paint2;
        yg0 yg0Var = this.f32181k;
        Paint paint3 = yg0Var.f32731a;
        Path path = yg0Var.f32732b;
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        RectF rectF = this.f32178g;
        rectF.set(0.0f, 0.0f, yg0Var.getWidth(), yg0Var.getHeight());
        int childCount = yg0Var.getChildCount();
        RectF rectF2 = this.f32180j;
        if (childCount > 0) {
            View childAt = yg0Var.getChildAt(0);
            float scaleX = childAt.getScaleX() * childAt.getWidth();
            float scaleY = childAt.getScaleY() * childAt.getHeight();
            float x10 = childAt.getX();
            float y3 = childAt.getY();
            rectF2.set(x10, y3, scaleX + x10, scaleY + y3);
            org.telegram.messenger.ks ksVar = yg0Var.f32735n;
            if (ksVar != null) {
                rectF2.union(ksVar.e);
            }
            rectF2.inset(-org.telegram.messenger.i0.L(20.0f), -org.telegram.messenger.i0.L(20.0f));
            rectF2.intersect(rectF);
            rectF2.top = 0.0f;
        } else {
            rectF2.set(rectF);
        }
        rectF2.bottom += org.telegram.messenger.i0.L(32.0f);
        int ceil = (int) Math.ceil(rectF2.width());
        int ceil2 = (int) Math.ceil(rectF2.height());
        float f14 = rectF2.left;
        float f15 = rectF2.top;
        this.f32175b.setPosition(0, 0, ceil, ceil2);
        this.e.setPosition(0, 0, ceil, ceil2);
        this.d.setPosition(0, 0, ceil, ceil2);
        this.f32176c.setPosition(0, 0, ceil, ceil2);
        float f16 = ceil;
        float f17 = ceil2;
        rectF2.set(0.0f, 0.0f, f16, f17);
        RecordingCanvas beginRecording = this.f32175b.beginRecording();
        float f18 = -f14;
        float f19 = -f15;
        beginRecording.translate(f18, f19);
        int z12 = (int) ((1.0f - org.telegram.messenger.i0.z1(yg0Var.e, 0.5f, 1.0f)) * 255.0f);
        int b10 = w7.u.b(z12, 0, 255);
        yg0.a((yg0) pxVar.f29448b, beginRecording);
        this.f32175b.endRecording();
        float f20 = this.f32177f;
        float z10 = c3.i0.z(f20, 1.0f, 2.0f, c3.i0.u(yg0Var.f32734f, 0.5f, f20, (f20 / 4.0f) + 1.0f));
        RecordingCanvas beginRecording2 = this.e.beginRecording();
        float f21 = 1.0f / z10;
        beginRecording2.scale(f21, f21, 0.0f, 0.0f);
        beginRecording2.drawRenderNode(this.f32175b);
        this.e.endRecording();
        float f22 = f20 + 2.0f;
        RecordingCanvas beginRecording3 = this.d.beginRecording();
        float f23 = 1.0f / f22;
        beginRecording3.scale(f23, f23, 0.0f, 0.0f);
        Paint paint4 = this.f32179i;
        if (b10 < 255) {
            beginRecording3.saveLayer(rectF2, null);
            beginRecording3.drawRenderNode(this.f32175b);
            beginRecording3.drawRect(rectF2, paint4);
            beginRecording3.restore();
        }
        float L = org.telegram.messenger.i0.L(7.0f) * f22;
        float f24 = yg0Var.e;
        if (f24 < 0.5f) {
            paint = paint4;
            T1 = org.telegram.messenger.i0.T1(0.0f, L, f24 / 0.5f);
        } else {
            paint = paint4;
            T1 = org.telegram.messenger.i0.T1(L, 0.0f, (f24 - 0.5f) / 0.5f);
        }
        if (yg0Var.getChildCount() > 0) {
            View childAt2 = yg0Var.getChildAt(0);
            float scaleX2 = (((childAt2.getScaleX() * childAt2.getWidth()) / 2.0f) + childAt2.getX()) - f14;
            f7 = T1;
            float scaleY2 = ((((childAt2.getScaleY() * childAt2.getHeight()) / 2.0f) + childAt2.getY()) + org.telegram.messenger.i0.L(32.0f)) - f15;
            float scaleX3 = childAt2.getScaleX() * (childAt2.getWidth() / 2.0f);
            path.rewind();
            f10 = f14;
            path.moveTo(scaleX2 - scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
            path.lineTo(scaleX2, (scaleY2 - scaleX3) - (0.25f * f7));
            path.lineTo(scaleX2 + scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
            path.close();
            beginRecording3.drawPath(path, paint3);
        } else {
            f7 = T1;
            f10 = f14;
        }
        if (b10 > 0) {
            if (b10 != 255) {
                beginRecording3.saveLayerAlpha(rectF2, b10);
            }
            beginRecording3.drawRenderNode(this.f32175b);
            if (b10 != 255) {
                beginRecording3.restore();
            }
        }
        this.d.endRecording();
        RecordingCanvas beginRecording4 = this.f32176c.beginRecording();
        beginRecording4.scale(f23, f23, 0.0f, 0.0f);
        if (yg0Var.f32735n != null) {
            beginRecording4.translate(f18, f19);
            beginRecording4.translate(0.0f, org.telegram.messenger.i0.L(32.0f));
            org.telegram.messenger.ks ksVar2 = yg0Var.f32735n;
            if (ksVar2.f16632c) {
                float min = Math.min(ksVar2.e.width(), yg0Var.f32735n.e.height()) / 2.0f;
                RectF rectF3 = yg0Var.f32735n.e;
                float width = rectF3.bottom - (rectF3.width() / 2.0f);
                beginRecording4.drawCircle(yg0Var.f32735n.e.centerX(), width, min, paint3);
                path.rewind();
                float f25 = f7 / 2.0f;
                path.moveTo(yg0Var.f32735n.e.centerX() - f25, width);
                path.lineTo(yg0Var.f32735n.e.centerX(), min + width + f7);
                path.lineTo(yg0Var.f32735n.e.centerX() + f25, width);
                path.close();
                beginRecording4.drawPath(path, paint3);
            } else if (ksVar2.f16631b) {
                beginRecording4.drawPath(ksVar2.d, paint3);
            } else {
                float max = Math.max(ksVar2.e.width(), yg0Var.f32735n.e.height()) / 2.0f;
                RectF rectF4 = yg0Var.f32735n.e;
                RectF rectF5 = this.h;
                rectF5.set(rectF4);
                beginRecording4.drawRoundRect(rectF5, max, max, paint3);
                path.rewind();
                float f26 = f7 / 2.0f;
                path.moveTo(rectF5.centerX() - f26, rectF5.bottom);
                path.lineTo(rectF5.centerX(), rectF5.bottom + f7);
                path.lineTo(rectF5.centerX() + f26, rectF5.bottom);
                path.close();
                beginRecording4.drawPath(path, paint3);
            }
            f11 = f17;
            f12 = f16;
            f13 = z10;
            paint2 = paint;
        } else {
            f11 = f17;
            f12 = f16;
            f13 = z10;
            paint2 = paint;
            beginRecording4.drawRect(0.0f, 0.0f, f12, org.telegram.messenger.i0.L(32.0f), paint3);
            path.rewind();
            path.moveTo((f12 - f7) / 2.0f, org.telegram.messenger.i0.L(32.0f));
            path.lineTo(f12 / 2.0f, org.telegram.messenger.i0.L(32.0f) + f7);
            path.lineTo((f12 + f7) / 2.0f, org.telegram.messenger.i0.L(32.0f));
            path.close();
            beginRecording4.drawPath(path, paint3);
        }
        this.f32176c.endRecording();
        canvas.save();
        canvas.translate(f10, f15 - org.telegram.messenger.i0.L(32.0f));
        org.telegram.messenger.ks ksVar3 = yg0Var.f32735n;
        if (ksVar3 != null) {
            canvas.clipRect(0.0f, ksVar3.e.top, f12, f11);
        }
        Paint paint5 = this.f32174a;
        canvas.saveLayer(rectF2, paint5);
        canvas.scale(f22, f22);
        canvas.drawRenderNode(this.f32176c);
        canvas.drawRenderNode(this.d);
        canvas.restore();
        int b11 = w7.u.b((z12 * 3) / 4, 0, 255);
        if (b11 < 255) {
            canvas.saveLayer(rectF2, null);
            if (yg0Var.f32734f != 0.0f) {
                canvas.saveLayer(rectF2, paint5);
                canvas.scale(f13, f13);
                canvas.drawRenderNode(this.e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f32175b);
            }
            canvas.drawRect(rectF2, paint2);
            canvas.restore();
        }
        if (b11 > 0) {
            if (b11 != 255) {
                canvas.saveLayerAlpha(rectF2, b11);
            }
            if (yg0Var.f32734f != 0.0f) {
                canvas.saveLayer(rectF2, paint5);
                canvas.scale(f13, f13);
                canvas.drawRenderNode(this.e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f32175b);
            }
            if (b11 != 255) {
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override
    public final void c(float f7) {
        Shader.TileMode tileMode;
        if (f7 == 0.0f) {
            this.e.setRenderEffect(null);
            return;
        }
        RenderNode renderNode = this.e;
        float f10 = this.f32181k.d;
        float f11 = this.f32177f;
        tileMode = Shader.TileMode.DECAL;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect((f7 * f10) / f11, (f7 * f10) / f11, tileMode));
    }

    @Override
    public final void d(int i10, int i11) {
    }
}
