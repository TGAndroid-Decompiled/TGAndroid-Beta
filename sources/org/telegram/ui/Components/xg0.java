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
public final class xg0 implements yg0 {
    public final float f32553f;
    public final Paint f32555i;
    public final RectF f32556j;
    public final zg0 f32557k;
    public final Paint f32550a = new Paint(1);
    public final RenderNode f32551b = new RenderNode("render");
    public final RenderNode f32552c = new RenderNode("effectNotch");
    public final RenderNode d = new RenderNode("effect");
    public final RenderNode e = new RenderNode("blur");
    public final RectF f32554g = new RectF();
    public final RectF h = new RectF();

    public xg0(zg0 zg0Var, float f7) {
        this.f32557k = zg0Var;
        Paint paint = new Paint();
        this.f32555i = paint;
        this.f32556j = new RectF();
        this.f32553f = f7;
        paint.setColor(-16777216);
        paint.setBlendMode(BlendMode.SRC_IN);
    }

    @Override
    public final void a(float f7) {
        RenderNode renderNode = this.d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f7, f7, tileMode));
        this.f32552c.setRenderEffect(RenderEffect.createBlurEffect(f7, f7, tileMode));
        this.f32550a.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
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
        zg0 zg0Var = this.f32557k;
        Paint paint3 = zg0Var.f33152a;
        Path path = zg0Var.f33153b;
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        RectF rectF = this.f32554g;
        rectF.set(0.0f, 0.0f, zg0Var.getWidth(), zg0Var.getHeight());
        int childCount = zg0Var.getChildCount();
        RectF rectF2 = this.f32556j;
        if (childCount > 0) {
            View childAt = zg0Var.getChildAt(0);
            float scaleX = childAt.getScaleX() * childAt.getWidth();
            float scaleY = childAt.getScaleY() * childAt.getHeight();
            float x10 = childAt.getX();
            float y3 = childAt.getY();
            rectF2.set(x10, y3, scaleX + x10, scaleY + y3);
            org.telegram.messenger.ls lsVar = zg0Var.f33156n;
            if (lsVar != null) {
                rectF2.union(lsVar.e);
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
        this.f32551b.setPosition(0, 0, ceil, ceil2);
        this.e.setPosition(0, 0, ceil, ceil2);
        this.d.setPosition(0, 0, ceil, ceil2);
        this.f32552c.setPosition(0, 0, ceil, ceil2);
        float f16 = ceil;
        float f17 = ceil2;
        rectF2.set(0.0f, 0.0f, f16, f17);
        RecordingCanvas beginRecording = this.f32551b.beginRecording();
        float f18 = -f14;
        float f19 = -f15;
        beginRecording.translate(f18, f19);
        int z12 = (int) ((1.0f - org.telegram.messenger.i0.z1(zg0Var.e, 0.5f, 1.0f)) * 255.0f);
        int b10 = w7.u.b(z12, 0, 255);
        zg0.a((zg0) pxVar.f29561b, beginRecording);
        this.f32551b.endRecording();
        float f20 = this.f32553f;
        float z10 = c3.i0.z(f20, 1.0f, 2.0f, c3.i0.u(zg0Var.f33155f, 0.5f, f20, (f20 / 4.0f) + 1.0f));
        RecordingCanvas beginRecording2 = this.e.beginRecording();
        float f21 = 1.0f / z10;
        beginRecording2.scale(f21, f21, 0.0f, 0.0f);
        beginRecording2.drawRenderNode(this.f32551b);
        this.e.endRecording();
        float f22 = f20 + 2.0f;
        RecordingCanvas beginRecording3 = this.d.beginRecording();
        float f23 = 1.0f / f22;
        beginRecording3.scale(f23, f23, 0.0f, 0.0f);
        Paint paint4 = this.f32555i;
        if (b10 < 255) {
            beginRecording3.saveLayer(rectF2, null);
            beginRecording3.drawRenderNode(this.f32551b);
            beginRecording3.drawRect(rectF2, paint4);
            beginRecording3.restore();
        }
        float L = org.telegram.messenger.i0.L(7.0f) * f22;
        float f24 = zg0Var.e;
        if (f24 < 0.5f) {
            paint = paint4;
            T1 = org.telegram.messenger.i0.T1(0.0f, L, f24 / 0.5f);
        } else {
            paint = paint4;
            T1 = org.telegram.messenger.i0.T1(L, 0.0f, (f24 - 0.5f) / 0.5f);
        }
        if (zg0Var.getChildCount() > 0) {
            View childAt2 = zg0Var.getChildAt(0);
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
            beginRecording3.drawRenderNode(this.f32551b);
            if (b10 != 255) {
                beginRecording3.restore();
            }
        }
        this.d.endRecording();
        RecordingCanvas beginRecording4 = this.f32552c.beginRecording();
        beginRecording4.scale(f23, f23, 0.0f, 0.0f);
        if (zg0Var.f33156n != null) {
            beginRecording4.translate(f18, f19);
            beginRecording4.translate(0.0f, org.telegram.messenger.i0.L(32.0f));
            org.telegram.messenger.ls lsVar2 = zg0Var.f33156n;
            if (lsVar2.f16997c) {
                float min = Math.min(lsVar2.e.width(), zg0Var.f33156n.e.height()) / 2.0f;
                RectF rectF3 = zg0Var.f33156n.e;
                float width = rectF3.bottom - (rectF3.width() / 2.0f);
                beginRecording4.drawCircle(zg0Var.f33156n.e.centerX(), width, min, paint3);
                path.rewind();
                float f25 = f7 / 2.0f;
                path.moveTo(zg0Var.f33156n.e.centerX() - f25, width);
                path.lineTo(zg0Var.f33156n.e.centerX(), min + width + f7);
                path.lineTo(zg0Var.f33156n.e.centerX() + f25, width);
                path.close();
                beginRecording4.drawPath(path, paint3);
            } else if (lsVar2.f16996b) {
                beginRecording4.drawPath(lsVar2.d, paint3);
            } else {
                float max = Math.max(lsVar2.e.width(), zg0Var.f33156n.e.height()) / 2.0f;
                RectF rectF4 = zg0Var.f33156n.e;
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
        this.f32552c.endRecording();
        canvas.save();
        canvas.translate(f10, f15 - org.telegram.messenger.i0.L(32.0f));
        org.telegram.messenger.ls lsVar3 = zg0Var.f33156n;
        if (lsVar3 != null) {
            canvas.clipRect(0.0f, lsVar3.e.top, f12, f11);
        }
        Paint paint5 = this.f32550a;
        canvas.saveLayer(rectF2, paint5);
        canvas.scale(f22, f22);
        canvas.drawRenderNode(this.f32552c);
        canvas.drawRenderNode(this.d);
        canvas.restore();
        int b11 = w7.u.b((z12 * 3) / 4, 0, 255);
        if (b11 < 255) {
            canvas.saveLayer(rectF2, null);
            if (zg0Var.f33155f != 0.0f) {
                canvas.saveLayer(rectF2, paint5);
                canvas.scale(f13, f13);
                canvas.drawRenderNode(this.e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f32551b);
            }
            canvas.drawRect(rectF2, paint2);
            canvas.restore();
        }
        if (b11 > 0) {
            if (b11 != 255) {
                canvas.saveLayerAlpha(rectF2, b11);
            }
            if (zg0Var.f33155f != 0.0f) {
                canvas.saveLayer(rectF2, paint5);
                canvas.scale(f13, f13);
                canvas.drawRenderNode(this.e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f32551b);
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
        float f10 = this.f32557k.d;
        float f11 = this.f32553f;
        tileMode = Shader.TileMode.DECAL;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect((f7 * f10) / f11, (f7 * f10) / f11, tileMode));
    }

    @Override
    public final void d(int i10, int i11) {
    }
}
