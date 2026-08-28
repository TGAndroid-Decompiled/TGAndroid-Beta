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
public final class ch0 implements dh0 {
    public final float f27487f;
    public final Paint f27489i;
    public final RectF f27490j;
    public final eh0 f27491k;
    public final Paint f27483a = new Paint(1);
    public final RenderNode f27484b = new RenderNode("render");
    public final RenderNode f27485c = new RenderNode("effectNotch");
    public final RenderNode d = new RenderNode("effect");
    public final RenderNode f27486e = new RenderNode("blur");
    public final RectF f27488g = new RectF();
    public final RectF h = new RectF();

    public ch0(eh0 eh0Var, float f10) {
        this.f27491k = eh0Var;
        Paint paint = new Paint();
        this.f27489i = paint;
        this.f27490j = new RectF();
        this.f27487f = f10;
        paint.setColor(-16777216);
        paint.setBlendMode(BlendMode.SRC_IN);
    }

    @Override
    public final void a(float f10) {
        RenderNode renderNode = this.d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        this.f27485c.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        this.f27483a.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
    }

    @Override
    public final void b(float f10) {
        Shader.TileMode tileMode;
        if (f10 == 0.0f) {
            this.f27486e.setRenderEffect(null);
            return;
        }
        RenderNode renderNode = this.f27486e;
        float f11 = this.f27491k.d;
        float f12 = this.f27487f;
        tileMode = Shader.TileMode.DECAL;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect((f10 * f11) / f12, (f10 * f11) / f12, tileMode));
    }

    @Override
    public final void c(wu wuVar, Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        Paint paint;
        eh0 eh0Var = this.f27491k;
        Paint paint2 = eh0Var.f28026a;
        Path path = eh0Var.f28027b;
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        RectF rectF = this.f27488g;
        rectF.set(0.0f, 0.0f, eh0Var.getWidth(), eh0Var.getHeight());
        int childCount = eh0Var.getChildCount();
        RectF rectF2 = this.f27490j;
        if (childCount > 0) {
            View childAt = eh0Var.getChildAt(0);
            float scaleX = childAt.getScaleX() * childAt.getWidth();
            float scaleY = childAt.getScaleY() * childAt.getHeight();
            float x10 = childAt.getX();
            float y10 = childAt.getY();
            rectF2.set(x10, y10, scaleX + x10, scaleY + y10);
            NotchInfoUtils.NotchInfo notchInfo = eh0Var.f28031n;
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
        float f15 = rectF2.left;
        float f16 = rectF2.top;
        this.f27484b.setPosition(0, 0, ceil, ceil2);
        this.f27486e.setPosition(0, 0, ceil, ceil2);
        this.d.setPosition(0, 0, ceil, ceil2);
        this.f27485c.setPosition(0, 0, ceil, ceil2);
        float f17 = ceil;
        float f18 = ceil2;
        rectF2.set(0.0f, 0.0f, f17, f18);
        RecordingCanvas beginRecording = this.f27484b.beginRecording();
        float f19 = -f15;
        float f20 = -f16;
        beginRecording.translate(f19, f20);
        int ilerp = (int) ((1.0f - AndroidUtilities.ilerp(eh0Var.f28029e, 0.5f, 1.0f)) * 255.0f);
        int b10 = g7.n.b(ilerp, 0, 255);
        eh0.a((eh0) wuVar.f34373b, beginRecording);
        this.f27484b.endRecording();
        float f21 = this.f27487f;
        float z10 = e2.c.z(f21, 1.0f, 2.0f, e2.c.x(eh0Var.f28030f, 0.5f, f21, (f21 / 4.0f) + 1.0f));
        RecordingCanvas beginRecording2 = this.f27486e.beginRecording();
        float f22 = 1.0f / z10;
        beginRecording2.scale(f22, f22, 0.0f, 0.0f);
        beginRecording2.drawRenderNode(this.f27484b);
        this.f27486e.endRecording();
        float f23 = f21 + 2.0f;
        RecordingCanvas beginRecording3 = this.d.beginRecording();
        float f24 = 1.0f / f23;
        beginRecording3.scale(f24, f24, 0.0f, 0.0f);
        Paint paint3 = this.f27489i;
        if (b10 < 255) {
            beginRecording3.saveLayer(rectF2, null);
            beginRecording3.drawRenderNode(this.f27484b);
            beginRecording3.drawRect(rectF2, paint3);
            beginRecording3.restore();
        }
        float lerp = AndroidUtilities.lerp(0.0f, AndroidUtilities.dp(7.0f) * f23, 0.0f, 0.5f, eh0Var.f28029e);
        if (eh0Var.getChildCount() > 0) {
            View childAt2 = eh0Var.getChildAt(0);
            float scaleX2 = (((childAt2.getScaleX() * childAt2.getWidth()) / 2.0f) + childAt2.getX()) - f15;
            float scaleY2 = ((((childAt2.getScaleY() * childAt2.getHeight()) / 2.0f) + childAt2.getY()) + AndroidUtilities.dp(32.0f)) - f16;
            float scaleX3 = childAt2.getScaleX() * (childAt2.getWidth() / 2.0f);
            path.rewind();
            f10 = lerp;
            f11 = f15;
            path.moveTo(scaleX2 - scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
            path.lineTo(scaleX2, (scaleY2 - scaleX3) - (0.25f * f10));
            path.lineTo(scaleX2 + scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
            path.close();
            beginRecording3.drawPath(path, paint2);
        } else {
            f10 = lerp;
            f11 = f15;
        }
        if (b10 > 0) {
            if (b10 != 255) {
                beginRecording3.saveLayerAlpha(rectF2, b10);
            }
            beginRecording3.drawRenderNode(this.f27484b);
            if (b10 != 255) {
                beginRecording3.restore();
            }
        }
        this.d.endRecording();
        RecordingCanvas beginRecording4 = this.f27485c.beginRecording();
        beginRecording4.scale(f24, f24, 0.0f, 0.0f);
        if (eh0Var.f28031n != null) {
            beginRecording4.translate(f19, f20);
            beginRecording4.translate(0.0f, AndroidUtilities.dp(32.0f));
            NotchInfoUtils.NotchInfo notchInfo2 = eh0Var.f28031n;
            if (notchInfo2.isLikelyCircle) {
                float min = Math.min(notchInfo2.bounds.width(), eh0Var.f28031n.bounds.height()) / 2.0f;
                RectF rectF3 = eh0Var.f28031n.bounds;
                float width = rectF3.bottom - (rectF3.width() / 2.0f);
                beginRecording4.drawCircle(eh0Var.f28031n.bounds.centerX(), width, min, paint2);
                path.rewind();
                float f25 = f10 / 2.0f;
                path.moveTo(eh0Var.f28031n.bounds.centerX() - f25, width);
                path.lineTo(eh0Var.f28031n.bounds.centerX(), min + width + f10);
                path.lineTo(eh0Var.f28031n.bounds.centerX() + f25, width);
                path.close();
                beginRecording4.drawPath(path, paint2);
            } else if (notchInfo2.isAccurate) {
                beginRecording4.drawPath(notchInfo2.path, paint2);
            } else {
                float max = Math.max(notchInfo2.bounds.width(), eh0Var.f28031n.bounds.height()) / 2.0f;
                RectF rectF4 = eh0Var.f28031n.bounds;
                RectF rectF5 = this.h;
                rectF5.set(rectF4);
                beginRecording4.drawRoundRect(rectF5, max, max, paint2);
                path.rewind();
                float f26 = f10 / 2.0f;
                path.moveTo(rectF5.centerX() - f26, rectF5.bottom);
                path.lineTo(rectF5.centerX(), rectF5.bottom + f10);
                path.lineTo(rectF5.centerX() + f26, rectF5.bottom);
                path.close();
                beginRecording4.drawPath(path, paint2);
            }
            f12 = f18;
            f13 = f17;
            f14 = z10;
            paint = paint3;
        } else {
            f12 = f18;
            f13 = f17;
            f14 = z10;
            paint = paint3;
            beginRecording4.drawRect(0.0f, 0.0f, f13, AndroidUtilities.dp(32.0f), paint2);
            path.rewind();
            path.moveTo((f13 - f10) / 2.0f, AndroidUtilities.dp(32.0f));
            path.lineTo(f13 / 2.0f, AndroidUtilities.dp(32.0f) + f10);
            path.lineTo((f13 + f10) / 2.0f, AndroidUtilities.dp(32.0f));
            path.close();
            beginRecording4.drawPath(path, paint2);
        }
        this.f27485c.endRecording();
        canvas.save();
        canvas.translate(f11, f16 - AndroidUtilities.dp(32.0f));
        NotchInfoUtils.NotchInfo notchInfo3 = eh0Var.f28031n;
        if (notchInfo3 != null) {
            canvas.clipRect(0.0f, notchInfo3.bounds.top, f13, f12);
        }
        Paint paint4 = this.f27483a;
        canvas.saveLayer(rectF2, paint4);
        canvas.scale(f23, f23);
        canvas.drawRenderNode(this.f27485c);
        canvas.drawRenderNode(this.d);
        canvas.restore();
        int b11 = g7.n.b((ilerp * 3) / 4, 0, 255);
        if (b11 < 255) {
            canvas.saveLayer(rectF2, null);
            if (eh0Var.f28030f != 0.0f) {
                canvas.saveLayer(rectF2, paint4);
                canvas.scale(f14, f14);
                canvas.drawRenderNode(this.f27486e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f27484b);
            }
            canvas.drawRect(rectF2, paint);
            canvas.restore();
        }
        if (b11 > 0) {
            if (b11 != 255) {
                canvas.saveLayerAlpha(rectF2, b11);
            }
            if (eh0Var.f28030f != 0.0f) {
                canvas.saveLayer(rectF2, paint4);
                canvas.scale(f14, f14);
                canvas.drawRenderNode(this.f27486e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f27484b);
            }
            if (b11 != 255) {
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override
    public final void d(int i9, int i10) {
    }
}
