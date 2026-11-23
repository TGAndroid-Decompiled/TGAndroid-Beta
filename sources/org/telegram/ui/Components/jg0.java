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
public final class jg0 implements kg0 {
    public final float f36453f;
    public final Paint f36455i;
    public final RectF f36456j;
    public final lg0 f36457k;
    public final Paint f36449a = new Paint(1);
    public final RenderNode f36450b = new RenderNode("render");
    public final RenderNode f36451c = new RenderNode("effectNotch");
    public final RenderNode d = new RenderNode("effect");
    public final RenderNode f36452e = new RenderNode("blur");
    public final RectF f36454g = new RectF();
    public final RectF h = new RectF();

    public jg0(lg0 lg0Var, float f10) {
        this.f36457k = lg0Var;
        Paint paint = new Paint();
        this.f36455i = paint;
        this.f36456j = new RectF();
        this.f36453f = f10;
        paint.setColor(-16777216);
        paint.setBlendMode(BlendMode.SRC_IN);
    }

    @Override
    public final void a(float f10) {
        RenderNode renderNode = this.d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        this.f36451c.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        this.f36449a.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
    }

    @Override
    public final void b(float f10) {
        Shader.TileMode tileMode;
        if (f10 == 0.0f) {
            this.f36452e.setRenderEffect(null);
            return;
        }
        RenderNode renderNode = this.f36452e;
        float f11 = this.f36457k.d;
        float f12 = this.f36453f;
        tileMode = Shader.TileMode.DECAL;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect((f10 * f11) / f12, (f10 * f11) / f12, tileMode));
    }

    @Override
    public final void c(ky kyVar, Canvas canvas) {
        Paint paint;
        float T1;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        Paint paint2;
        lg0 lg0Var = this.f36457k;
        Paint paint3 = lg0Var.f37139a;
        Path path = lg0Var.f37140b;
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        RectF rectF = this.f36454g;
        rectF.set(0.0f, 0.0f, lg0Var.getWidth(), lg0Var.getHeight());
        int childCount = lg0Var.getChildCount();
        RectF rectF2 = this.f36456j;
        if (childCount > 0) {
            View childAt = lg0Var.getChildAt(0);
            float scaleX = childAt.getScaleX() * childAt.getWidth();
            float scaleY = childAt.getScaleY() * childAt.getHeight();
            float x10 = childAt.getX();
            float y10 = childAt.getY();
            rectF2.set(x10, y10, scaleX + x10, scaleY + y10);
            bi.d2 d2Var = lg0Var.f37144n;
            if (d2Var != null) {
                rectF2.union((RectF) d2Var.f3458e);
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
        this.f36450b.setPosition(0, 0, ceil, ceil2);
        this.f36452e.setPosition(0, 0, ceil, ceil2);
        this.d.setPosition(0, 0, ceil, ceil2);
        this.f36451c.setPosition(0, 0, ceil, ceil2);
        float f17 = ceil;
        float f18 = ceil2;
        rectF2.set(0.0f, 0.0f, f17, f18);
        RecordingCanvas beginRecording = this.f36450b.beginRecording();
        float f19 = -f15;
        float f20 = -f16;
        beginRecording.translate(f19, f20);
        int z12 = (int) ((1.0f - org.telegram.messenger.g0.z1(lg0Var.f37142e, 0.5f, 1.0f)) * 255.0f);
        int b10 = c8.m9.b(z12, 0, 255);
        lg0.a((lg0) kyVar.f36994b, beginRecording);
        this.f36450b.endRecording();
        float f21 = this.f36453f;
        float z10 = com.google.android.gms.internal.vision.e2.z(f21, 1.0f, 2.0f, com.google.android.gms.internal.vision.e2.x(lg0Var.f37143f, 0.5f, f21, (f21 / 4.0f) + 1.0f));
        RecordingCanvas beginRecording2 = this.f36452e.beginRecording();
        float f22 = 1.0f / z10;
        beginRecording2.scale(f22, f22, 0.0f, 0.0f);
        beginRecording2.drawRenderNode(this.f36450b);
        this.f36452e.endRecording();
        float f23 = f21 + 2.0f;
        RecordingCanvas beginRecording3 = this.d.beginRecording();
        float f24 = 1.0f / f23;
        beginRecording3.scale(f24, f24, 0.0f, 0.0f);
        Paint paint4 = this.f36455i;
        if (b10 < 255) {
            beginRecording3.saveLayer(rectF2, null);
            beginRecording3.drawRenderNode(this.f36450b);
            beginRecording3.drawRect(rectF2, paint4);
            beginRecording3.restore();
        }
        float L = org.telegram.messenger.g0.L(7.0f) * f23;
        float f25 = lg0Var.f37142e;
        if (f25 < 0.5f) {
            paint = paint4;
            T1 = org.telegram.messenger.g0.T1(0.0f, L, f25 / 0.5f);
        } else {
            paint = paint4;
            T1 = org.telegram.messenger.g0.T1(L, 0.0f, (f25 - 0.5f) / 0.5f);
        }
        if (lg0Var.getChildCount() > 0) {
            View childAt2 = lg0Var.getChildAt(0);
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
            beginRecording3.drawRenderNode(this.f36450b);
            if (b10 != 255) {
                beginRecording3.restore();
            }
        }
        this.d.endRecording();
        RecordingCanvas beginRecording4 = this.f36451c.beginRecording();
        beginRecording4.scale(f24, f24, 0.0f, 0.0f);
        if (lg0Var.f37144n != null) {
            beginRecording4.translate(f19, f20);
            beginRecording4.translate(0.0f, org.telegram.messenger.g0.L(32.0f));
            bi.d2 d2Var2 = lg0Var.f37144n;
            if (d2Var2.f3457c) {
                float min = Math.min(((RectF) d2Var2.f3458e).width(), ((RectF) lg0Var.f37144n.f3458e).height()) / 2.0f;
                RectF rectF3 = (RectF) lg0Var.f37144n.f3458e;
                float width = rectF3.bottom - (rectF3.width() / 2.0f);
                beginRecording4.drawCircle(((RectF) lg0Var.f37144n.f3458e).centerX(), width, min, paint3);
                path.rewind();
                float f26 = f10 / 2.0f;
                path.moveTo(((RectF) lg0Var.f37144n.f3458e).centerX() - f26, width);
                path.lineTo(((RectF) lg0Var.f37144n.f3458e).centerX(), min + width + f10);
                path.lineTo(((RectF) lg0Var.f37144n.f3458e).centerX() + f26, width);
                path.close();
                beginRecording4.drawPath(path, paint3);
            } else if (d2Var2.f3456b) {
                beginRecording4.drawPath((Path) d2Var2.d, paint3);
            } else {
                float max = Math.max(((RectF) d2Var2.f3458e).width(), ((RectF) lg0Var.f37144n.f3458e).height()) / 2.0f;
                RectF rectF4 = this.h;
                rectF4.set((RectF) lg0Var.f37144n.f3458e);
                beginRecording4.drawRoundRect(rectF4, max, max, paint3);
                path.rewind();
                float f27 = f10 / 2.0f;
                path.moveTo(rectF4.centerX() - f27, rectF4.bottom);
                path.lineTo(rectF4.centerX(), rectF4.bottom + f10);
                path.lineTo(rectF4.centerX() + f27, rectF4.bottom);
                path.close();
                beginRecording4.drawPath(path, paint3);
            }
            f12 = f18;
            f13 = f17;
            f14 = z10;
            paint2 = paint;
        } else {
            f12 = f18;
            f13 = f17;
            f14 = z10;
            paint2 = paint;
            beginRecording4.drawRect(0.0f, 0.0f, f13, org.telegram.messenger.g0.L(32.0f), paint3);
            path.rewind();
            path.moveTo((f13 - f10) / 2.0f, org.telegram.messenger.g0.L(32.0f));
            path.lineTo(f13 / 2.0f, org.telegram.messenger.g0.L(32.0f) + f10);
            path.lineTo((f13 + f10) / 2.0f, org.telegram.messenger.g0.L(32.0f));
            path.close();
            beginRecording4.drawPath(path, paint3);
        }
        this.f36451c.endRecording();
        canvas.save();
        canvas.translate(f11, f16 - org.telegram.messenger.g0.L(32.0f));
        bi.d2 d2Var3 = lg0Var.f37144n;
        if (d2Var3 != null) {
            canvas.clipRect(0.0f, ((RectF) d2Var3.f3458e).top, f13, f12);
        }
        Paint paint5 = this.f36449a;
        canvas.saveLayer(rectF2, paint5);
        canvas.scale(f23, f23);
        canvas.drawRenderNode(this.f36451c);
        canvas.drawRenderNode(this.d);
        canvas.restore();
        int b11 = c8.m9.b((z12 * 3) / 4, 0, 255);
        if (b11 < 255) {
            canvas.saveLayer(rectF2, null);
            if (lg0Var.f37143f != 0.0f) {
                canvas.saveLayer(rectF2, paint5);
                canvas.scale(f14, f14);
                canvas.drawRenderNode(this.f36452e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f36450b);
            }
            canvas.drawRect(rectF2, paint2);
            canvas.restore();
        }
        if (b11 > 0) {
            if (b11 != 255) {
                canvas.saveLayerAlpha(rectF2, b11);
            }
            if (lg0Var.f37143f != 0.0f) {
                canvas.saveLayer(rectF2, paint5);
                canvas.scale(f14, f14);
                canvas.drawRenderNode(this.f36452e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f36450b);
            }
            if (b11 != 255) {
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override
    public final void d(int i7, int i10) {
    }
}
