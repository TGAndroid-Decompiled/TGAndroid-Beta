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
public final class xf0 implements yf0 {
    public final float f40344f;
    public final Paint f40346i;
    public final RectF f40347j;
    public final zf0 f40348k;
    public final Paint f40340a = new Paint(1);
    public final RenderNode f40341b = new RenderNode("render");
    public final RenderNode f40342c = new RenderNode("effectNotch");
    public final RenderNode d = new RenderNode("effect");
    public final RenderNode f40343e = new RenderNode("blur");
    public final RectF f40345g = new RectF();
    public final RectF h = new RectF();

    public xf0(zf0 zf0Var, float f10) {
        this.f40348k = zf0Var;
        Paint paint = new Paint();
        this.f40346i = paint;
        this.f40347j = new RectF();
        this.f40344f = f10;
        paint.setColor(-16777216);
        paint.setBlendMode(BlendMode.SRC_IN);
    }

    @Override
    public final void a(float f10) {
        RenderNode renderNode = this.d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        this.f40342c.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        this.f40340a.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
    }

    @Override
    public final void b(zw zwVar, Canvas canvas) {
        Paint paint;
        float T1;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        Paint paint2;
        zf0 zf0Var = this.f40348k;
        Paint paint3 = zf0Var.f41034a;
        Path path = zf0Var.f41035b;
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        RectF rectF = this.f40345g;
        rectF.set(0.0f, 0.0f, zf0Var.getWidth(), zf0Var.getHeight());
        int childCount = zf0Var.getChildCount();
        RectF rectF2 = this.f40347j;
        if (childCount > 0) {
            View childAt = zf0Var.getChildAt(0);
            float scaleX = childAt.getScaleX() * childAt.getWidth();
            float scaleY = childAt.getScaleY() * childAt.getHeight();
            float x10 = childAt.getX();
            float y9 = childAt.getY();
            rectF2.set(x10, y9, scaleX + x10, scaleY + y9);
            org.telegram.messenger.tr trVar = zf0Var.f41039n;
            if (trVar != null) {
                rectF2.union(trVar.f25586e);
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
        this.f40341b.setPosition(0, 0, ceil, ceil2);
        this.f40343e.setPosition(0, 0, ceil, ceil2);
        this.d.setPosition(0, 0, ceil, ceil2);
        this.f40342c.setPosition(0, 0, ceil, ceil2);
        float f17 = ceil;
        float f18 = ceil2;
        rectF2.set(0.0f, 0.0f, f17, f18);
        RecordingCanvas beginRecording = this.f40341b.beginRecording();
        float f19 = -f15;
        float f20 = -f16;
        beginRecording.translate(f19, f20);
        int z12 = (int) ((1.0f - org.telegram.messenger.g0.z1(zf0Var.f41037e, 0.5f, 1.0f)) * 255.0f);
        int b10 = b8.be.b(z12, 0, 255);
        zf0.a((zf0) zwVar.f41140b, beginRecording);
        this.f40341b.endRecording();
        float f21 = this.f40344f;
        float y10 = com.google.android.recaptcha.internal.a.y(f21, 1.0f, 2.0f, com.google.android.recaptcha.internal.a.v(zf0Var.f41038f, 0.5f, f21, (f21 / 4.0f) + 1.0f));
        RecordingCanvas beginRecording2 = this.f40343e.beginRecording();
        float f22 = 1.0f / y10;
        beginRecording2.scale(f22, f22, 0.0f, 0.0f);
        beginRecording2.drawRenderNode(this.f40341b);
        this.f40343e.endRecording();
        float f23 = f21 + 2.0f;
        RecordingCanvas beginRecording3 = this.d.beginRecording();
        float f24 = 1.0f / f23;
        beginRecording3.scale(f24, f24, 0.0f, 0.0f);
        Paint paint4 = this.f40346i;
        if (b10 < 255) {
            beginRecording3.saveLayer(rectF2, null);
            beginRecording3.drawRenderNode(this.f40341b);
            beginRecording3.drawRect(rectF2, paint4);
            beginRecording3.restore();
        }
        float L = org.telegram.messenger.g0.L(7.0f) * f23;
        float f25 = zf0Var.f41037e;
        if (f25 < 0.5f) {
            paint = paint4;
            T1 = org.telegram.messenger.g0.T1(0.0f, L, f25 / 0.5f);
        } else {
            paint = paint4;
            T1 = org.telegram.messenger.g0.T1(L, 0.0f, (f25 - 0.5f) / 0.5f);
        }
        if (zf0Var.getChildCount() > 0) {
            View childAt2 = zf0Var.getChildAt(0);
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
            beginRecording3.drawRenderNode(this.f40341b);
            if (b10 != 255) {
                beginRecording3.restore();
            }
        }
        this.d.endRecording();
        RecordingCanvas beginRecording4 = this.f40342c.beginRecording();
        beginRecording4.scale(f24, f24, 0.0f, 0.0f);
        if (zf0Var.f41039n != null) {
            beginRecording4.translate(f19, f20);
            beginRecording4.translate(0.0f, org.telegram.messenger.g0.L(32.0f));
            org.telegram.messenger.tr trVar2 = zf0Var.f41039n;
            if (trVar2.f25585c) {
                float min = Math.min(trVar2.f25586e.width(), zf0Var.f41039n.f25586e.height()) / 2.0f;
                RectF rectF3 = zf0Var.f41039n.f25586e;
                float width = rectF3.bottom - (rectF3.width() / 2.0f);
                beginRecording4.drawCircle(zf0Var.f41039n.f25586e.centerX(), width, min, paint3);
                path.rewind();
                float f26 = f10 / 2.0f;
                path.moveTo(zf0Var.f41039n.f25586e.centerX() - f26, width);
                path.lineTo(zf0Var.f41039n.f25586e.centerX(), min + width + f10);
                path.lineTo(zf0Var.f41039n.f25586e.centerX() + f26, width);
                path.close();
                beginRecording4.drawPath(path, paint3);
            } else if (trVar2.f25584b) {
                beginRecording4.drawPath(trVar2.d, paint3);
            } else {
                float max = Math.max(trVar2.f25586e.width(), zf0Var.f41039n.f25586e.height()) / 2.0f;
                RectF rectF4 = zf0Var.f41039n.f25586e;
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
            f14 = y10;
            paint2 = paint;
        } else {
            f12 = f18;
            f13 = f17;
            f14 = y10;
            paint2 = paint;
            beginRecording4.drawRect(0.0f, 0.0f, f13, org.telegram.messenger.g0.L(32.0f), paint3);
            path.rewind();
            path.moveTo((f13 - f10) / 2.0f, org.telegram.messenger.g0.L(32.0f));
            path.lineTo(f13 / 2.0f, org.telegram.messenger.g0.L(32.0f) + f10);
            path.lineTo((f13 + f10) / 2.0f, org.telegram.messenger.g0.L(32.0f));
            path.close();
            beginRecording4.drawPath(path, paint3);
        }
        this.f40342c.endRecording();
        canvas.save();
        canvas.translate(f11, f16 - org.telegram.messenger.g0.L(32.0f));
        org.telegram.messenger.tr trVar3 = zf0Var.f41039n;
        if (trVar3 != null) {
            canvas.clipRect(0.0f, trVar3.f25586e.top, f13, f12);
        }
        Paint paint5 = this.f40340a;
        canvas.saveLayer(rectF2, paint5);
        canvas.scale(f23, f23);
        canvas.drawRenderNode(this.f40342c);
        canvas.drawRenderNode(this.d);
        canvas.restore();
        int b11 = b8.be.b((z12 * 3) / 4, 0, 255);
        if (b11 < 255) {
            canvas.saveLayer(rectF2, null);
            if (zf0Var.f41038f != 0.0f) {
                canvas.saveLayer(rectF2, paint5);
                canvas.scale(f14, f14);
                canvas.drawRenderNode(this.f40343e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f40341b);
            }
            canvas.drawRect(rectF2, paint2);
            canvas.restore();
        }
        if (b11 > 0) {
            if (b11 != 255) {
                canvas.saveLayerAlpha(rectF2, b11);
            }
            if (zf0Var.f41038f != 0.0f) {
                canvas.saveLayer(rectF2, paint5);
                canvas.scale(f14, f14);
                canvas.drawRenderNode(this.f40343e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f40341b);
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
            this.f40343e.setRenderEffect(null);
            return;
        }
        RenderNode renderNode = this.f40343e;
        float f11 = this.f40348k.d;
        float f12 = this.f40344f;
        tileMode = Shader.TileMode.DECAL;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect((f10 * f11) / f12, (f10 * f11) / f12, tileMode));
    }

    @Override
    public final void d(int i3, int i10) {
    }
}
