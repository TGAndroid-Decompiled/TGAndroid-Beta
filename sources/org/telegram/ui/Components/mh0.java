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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotchInfoUtils;
public final class mh0 implements nh0 {
    public final float f30698f;
    public final Paint f30700i;
    public final RectF f30701j;
    public final oh0 f30702k;
    public final Paint f30694a = new Paint(1);
    public final RenderNode f30695b = new RenderNode("render");
    public final RenderNode f30696c = new RenderNode("effectNotch");
    public final RenderNode d = new RenderNode("effect");
    public final RenderNode f30697e = new RenderNode("blur");
    public final RectF f30699g = new RectF();
    public final RectF h = new RectF();

    public mh0(oh0 oh0Var, float f9) {
        this.f30702k = oh0Var;
        Paint paint = new Paint();
        this.f30700i = paint;
        this.f30701j = new RectF();
        this.f30698f = f9;
        paint.setColor(-16777216);
        paint.setBlendMode(BlendMode.SRC_IN);
    }

    @Override
    public final void a(float f9) {
        RenderNode renderNode = this.d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f9, f9, tileMode));
        this.f30696c.setRenderEffect(RenderEffect.createBlurEffect(f9, f9, tileMode));
        this.f30694a.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
    }

    @Override
    public final void b(float f9) {
        Shader.TileMode tileMode;
        if (f9 == 0.0f) {
            this.f30697e.setRenderEffect(null);
            return;
        }
        RenderNode renderNode = this.f30697e;
        float f10 = this.f30702k.d;
        float f11 = this.f30698f;
        tileMode = Shader.TileMode.DECAL;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect((f9 * f10) / f11, (f9 * f10) / f11, tileMode));
    }

    @Override
    public final void c(cv cvVar, Canvas canvas) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        Paint paint;
        oh0 oh0Var = this.f30702k;
        Paint paint2 = oh0Var.f31365a;
        Path path = oh0Var.f31366b;
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        RectF rectF = this.f30699g;
        rectF.set(0.0f, 0.0f, oh0Var.getWidth(), oh0Var.getHeight());
        int childCount = oh0Var.getChildCount();
        RectF rectF2 = this.f30701j;
        if (childCount > 0) {
            View childAt = oh0Var.getChildAt(0);
            float scaleX = childAt.getScaleX() * childAt.getWidth();
            float scaleY = childAt.getScaleY() * childAt.getHeight();
            float x4 = childAt.getX();
            float y8 = childAt.getY();
            rectF2.set(x4, y8, scaleX + x4, scaleY + y8);
            NotchInfoUtils.NotchInfo notchInfo = oh0Var.f31370n;
            if (notchInfo != null) {
                rectF2.union(notchInfo.bounds);
            }
            rectF2.inset(-AndroidUtilities.dp(20.0f), -AndroidUtilities.dp(20.0f));
            rectF2.intersect(rectF);
            rectF2.top = 0.0f;
        } else {
            rectF2.set(rectF);
        }
        rectF2.bottom += AndroidUtilities.dp(32.0f);
        int ceil = (int) Math.ceil(rectF2.width());
        int ceil2 = (int) Math.ceil(rectF2.height());
        float f14 = rectF2.left;
        float f15 = rectF2.top;
        this.f30695b.setPosition(0, 0, ceil, ceil2);
        this.f30697e.setPosition(0, 0, ceil, ceil2);
        this.d.setPosition(0, 0, ceil, ceil2);
        this.f30696c.setPosition(0, 0, ceil, ceil2);
        float f16 = ceil;
        float f17 = ceil2;
        rectF2.set(0.0f, 0.0f, f16, f17);
        RecordingCanvas beginRecording = this.f30695b.beginRecording();
        float f18 = -f14;
        float f19 = -f15;
        beginRecording.translate(f18, f19);
        int ilerp = (int) ((1.0f - AndroidUtilities.ilerp(oh0Var.f31368e, 0.5f, 1.0f)) * 255.0f);
        int b10 = i7.w.b(ilerp, 0, 255);
        oh0.a((oh0) cvVar.f27577b, beginRecording);
        this.f30695b.endRecording();
        float f20 = this.f30698f;
        float z10 = com.google.android.recaptcha.internal.a.z(f20, 1.0f, 2.0f, com.google.android.recaptcha.internal.a.x(oh0Var.f31369f, 0.5f, f20, (f20 / 4.0f) + 1.0f));
        RecordingCanvas beginRecording2 = this.f30697e.beginRecording();
        float f21 = 1.0f / z10;
        beginRecording2.scale(f21, f21, 0.0f, 0.0f);
        beginRecording2.drawRenderNode(this.f30695b);
        this.f30697e.endRecording();
        float f22 = f20 + 2.0f;
        RecordingCanvas beginRecording3 = this.d.beginRecording();
        float f23 = 1.0f / f22;
        beginRecording3.scale(f23, f23, 0.0f, 0.0f);
        Paint paint3 = this.f30700i;
        if (b10 < 255) {
            beginRecording3.saveLayer(rectF2, null);
            beginRecording3.drawRenderNode(this.f30695b);
            beginRecording3.drawRect(rectF2, paint3);
            beginRecording3.restore();
        }
        float lerp = AndroidUtilities.lerp(0.0f, AndroidUtilities.dp(7.0f) * f22, 0.0f, 0.5f, oh0Var.f31368e);
        if (oh0Var.getChildCount() > 0) {
            View childAt2 = oh0Var.getChildAt(0);
            float scaleX2 = (((childAt2.getScaleX() * childAt2.getWidth()) / 2.0f) + childAt2.getX()) - f14;
            float scaleY2 = ((((childAt2.getScaleY() * childAt2.getHeight()) / 2.0f) + childAt2.getY()) + AndroidUtilities.dp(32.0f)) - f15;
            float scaleX3 = childAt2.getScaleX() * (childAt2.getWidth() / 2.0f);
            path.rewind();
            f9 = lerp;
            f10 = f14;
            path.moveTo(scaleX2 - scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
            path.lineTo(scaleX2, (scaleY2 - scaleX3) - (0.25f * f9));
            path.lineTo(scaleX2 + scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
            path.close();
            beginRecording3.drawPath(path, paint2);
        } else {
            f9 = lerp;
            f10 = f14;
        }
        if (b10 > 0) {
            if (b10 != 255) {
                beginRecording3.saveLayerAlpha(rectF2, b10);
            }
            beginRecording3.drawRenderNode(this.f30695b);
            if (b10 != 255) {
                beginRecording3.restore();
            }
        }
        this.d.endRecording();
        RecordingCanvas beginRecording4 = this.f30696c.beginRecording();
        beginRecording4.scale(f23, f23, 0.0f, 0.0f);
        if (oh0Var.f31370n != null) {
            beginRecording4.translate(f18, f19);
            beginRecording4.translate(0.0f, AndroidUtilities.dp(32.0f));
            NotchInfoUtils.NotchInfo notchInfo2 = oh0Var.f31370n;
            if (notchInfo2.isLikelyCircle) {
                float min = Math.min(notchInfo2.bounds.width(), oh0Var.f31370n.bounds.height()) / 2.0f;
                RectF rectF3 = oh0Var.f31370n.bounds;
                float width = rectF3.bottom - (rectF3.width() / 2.0f);
                beginRecording4.drawCircle(oh0Var.f31370n.bounds.centerX(), width, min, paint2);
                path.rewind();
                float f24 = f9 / 2.0f;
                path.moveTo(oh0Var.f31370n.bounds.centerX() - f24, width);
                path.lineTo(oh0Var.f31370n.bounds.centerX(), min + width + f9);
                path.lineTo(oh0Var.f31370n.bounds.centerX() + f24, width);
                path.close();
                beginRecording4.drawPath(path, paint2);
            } else if (notchInfo2.isAccurate) {
                beginRecording4.drawPath(notchInfo2.path, paint2);
            } else {
                float max = Math.max(notchInfo2.bounds.width(), oh0Var.f31370n.bounds.height()) / 2.0f;
                RectF rectF4 = oh0Var.f31370n.bounds;
                RectF rectF5 = this.h;
                rectF5.set(rectF4);
                beginRecording4.drawRoundRect(rectF5, max, max, paint2);
                path.rewind();
                float f25 = f9 / 2.0f;
                path.moveTo(rectF5.centerX() - f25, rectF5.bottom);
                path.lineTo(rectF5.centerX(), rectF5.bottom + f9);
                path.lineTo(rectF5.centerX() + f25, rectF5.bottom);
                path.close();
                beginRecording4.drawPath(path, paint2);
            }
            f11 = f17;
            f12 = f16;
            f13 = z10;
            paint = paint3;
        } else {
            f11 = f17;
            f12 = f16;
            f13 = z10;
            paint = paint3;
            beginRecording4.drawRect(0.0f, 0.0f, f12, AndroidUtilities.dp(32.0f), paint2);
            path.rewind();
            path.moveTo((f12 - f9) / 2.0f, AndroidUtilities.dp(32.0f));
            path.lineTo(f12 / 2.0f, AndroidUtilities.dp(32.0f) + f9);
            path.lineTo((f12 + f9) / 2.0f, AndroidUtilities.dp(32.0f));
            path.close();
            beginRecording4.drawPath(path, paint2);
        }
        this.f30696c.endRecording();
        canvas.save();
        canvas.translate(f10, f15 - AndroidUtilities.dp(32.0f));
        NotchInfoUtils.NotchInfo notchInfo3 = oh0Var.f31370n;
        if (notchInfo3 != null) {
            canvas.clipRect(0.0f, notchInfo3.bounds.top, f12, f11);
        }
        Paint paint4 = this.f30694a;
        canvas.saveLayer(rectF2, paint4);
        canvas.scale(f22, f22);
        canvas.drawRenderNode(this.f30696c);
        canvas.drawRenderNode(this.d);
        canvas.restore();
        int b11 = i7.w.b((ilerp * 3) / 4, 0, 255);
        if (b11 < 255) {
            canvas.saveLayer(rectF2, null);
            if (oh0Var.f31369f != 0.0f) {
                canvas.saveLayer(rectF2, paint4);
                canvas.scale(f13, f13);
                canvas.drawRenderNode(this.f30697e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f30695b);
            }
            canvas.drawRect(rectF2, paint);
            canvas.restore();
        }
        if (b11 > 0) {
            if (b11 != 255) {
                canvas.saveLayerAlpha(rectF2, b11);
            }
            if (oh0Var.f31369f != 0.0f) {
                canvas.saveLayer(rectF2, paint4);
                canvas.scale(f13, f13);
                canvas.drawRenderNode(this.f30697e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f30695b);
            }
            if (b11 != 255) {
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override
    public final void d(int i10, int i11) {
    }
}
