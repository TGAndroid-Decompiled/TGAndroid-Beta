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
public final class wi0 implements xi0 {
    public final float f32679f;
    public final Paint f32681i;
    public final RectF f32682j;
    public final yi0 f32683k;
    public final Paint f32675a = new Paint(1);
    public final RenderNode f32676b = new RenderNode("render");
    public final RenderNode f32677c = new RenderNode("effectNotch");
    public final RenderNode d = new RenderNode("effect");
    public final RenderNode f32678e = new RenderNode("blur");
    public final RectF f32680g = new RectF();
    public final RectF h = new RectF();

    public wi0(yi0 yi0Var, float f7) {
        this.f32683k = yi0Var;
        Paint paint = new Paint();
        this.f32681i = paint;
        this.f32682j = new RectF();
        this.f32679f = f7;
        paint.setColor(-16777216);
        paint.setBlendMode(BlendMode.SRC_IN);
    }

    @Override
    public final void a(float f7) {
        RenderNode renderNode = this.d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f7, f7, tileMode));
        this.f32677c.setRenderEffect(RenderEffect.createBlurEffect(f7, f7, tileMode));
        this.f32675a.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
    }

    @Override
    public final void b(float f7) {
        Shader.TileMode tileMode;
        if (f7 == 0.0f) {
            this.f32678e.setRenderEffect(null);
            return;
        }
        RenderNode renderNode = this.f32678e;
        float f10 = this.f32683k.d;
        float f11 = this.f32679f;
        tileMode = Shader.TileMode.DECAL;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect((f7 * f10) / f11, (f7 * f10) / f11, tileMode));
    }

    @Override
    public final void c(cw cwVar, Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        Paint paint;
        yi0 yi0Var = this.f32683k;
        Paint paint2 = yi0Var.f33302a;
        Path path = yi0Var.f33303b;
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        RectF rectF = this.f32680g;
        rectF.set(0.0f, 0.0f, yi0Var.getWidth(), yi0Var.getHeight());
        int childCount = yi0Var.getChildCount();
        RectF rectF2 = this.f32682j;
        if (childCount > 0) {
            View childAt = yi0Var.getChildAt(0);
            float scaleX = childAt.getScaleX() * childAt.getWidth();
            float scaleY = childAt.getScaleY() * childAt.getHeight();
            float x10 = childAt.getX();
            float y3 = childAt.getY();
            rectF2.set(x10, y3, scaleX + x10, scaleY + y3);
            NotchInfoUtils.NotchInfo notchInfo = yi0Var.f33307n;
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
        this.f32676b.setPosition(0, 0, ceil, ceil2);
        this.f32678e.setPosition(0, 0, ceil, ceil2);
        this.d.setPosition(0, 0, ceil, ceil2);
        this.f32677c.setPosition(0, 0, ceil, ceil2);
        float f16 = ceil;
        float f17 = ceil2;
        rectF2.set(0.0f, 0.0f, f16, f17);
        RecordingCanvas beginRecording = this.f32676b.beginRecording();
        float f18 = -f14;
        float f19 = -f15;
        beginRecording.translate(f18, f19);
        int ilerp = (int) ((1.0f - AndroidUtilities.ilerp(yi0Var.f33305e, 0.5f, 1.0f)) * 255.0f);
        int b10 = w7.o.b(ilerp, 0, 255);
        yi0.a((yi0) cwVar.f25420b, beginRecording);
        this.f32676b.endRecording();
        float f20 = this.f32679f;
        float y10 = com.google.android.gms.internal.vision.e2.y(f20, 1.0f, 2.0f, com.google.android.gms.internal.vision.e2.w(yi0Var.f33306f, 0.5f, f20, (f20 / 4.0f) + 1.0f));
        RecordingCanvas beginRecording2 = this.f32678e.beginRecording();
        float f21 = 1.0f / y10;
        beginRecording2.scale(f21, f21, 0.0f, 0.0f);
        beginRecording2.drawRenderNode(this.f32676b);
        this.f32678e.endRecording();
        float f22 = f20 + 2.0f;
        RecordingCanvas beginRecording3 = this.d.beginRecording();
        float f23 = 1.0f / f22;
        beginRecording3.scale(f23, f23, 0.0f, 0.0f);
        Paint paint3 = this.f32681i;
        if (b10 < 255) {
            beginRecording3.saveLayer(rectF2, null);
            beginRecording3.drawRenderNode(this.f32676b);
            beginRecording3.drawRect(rectF2, paint3);
            beginRecording3.restore();
        }
        float lerp = AndroidUtilities.lerp(0.0f, AndroidUtilities.dp(7.0f) * f22, 0.0f, 0.5f, yi0Var.f33305e);
        if (yi0Var.getChildCount() > 0) {
            View childAt2 = yi0Var.getChildAt(0);
            float scaleX2 = (((childAt2.getScaleX() * childAt2.getWidth()) / 2.0f) + childAt2.getX()) - f14;
            float scaleY2 = ((((childAt2.getScaleY() * childAt2.getHeight()) / 2.0f) + childAt2.getY()) + AndroidUtilities.dp(32.0f)) - f15;
            float scaleX3 = childAt2.getScaleX() * (childAt2.getWidth() / 2.0f);
            path.rewind();
            f7 = lerp;
            f10 = f14;
            path.moveTo(scaleX2 - scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
            path.lineTo(scaleX2, (scaleY2 - scaleX3) - (0.25f * f7));
            path.lineTo(scaleX2 + scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
            path.close();
            beginRecording3.drawPath(path, paint2);
        } else {
            f7 = lerp;
            f10 = f14;
        }
        if (b10 > 0) {
            if (b10 != 255) {
                beginRecording3.saveLayerAlpha(rectF2, b10);
            }
            beginRecording3.drawRenderNode(this.f32676b);
            if (b10 != 255) {
                beginRecording3.restore();
            }
        }
        this.d.endRecording();
        RecordingCanvas beginRecording4 = this.f32677c.beginRecording();
        beginRecording4.scale(f23, f23, 0.0f, 0.0f);
        if (yi0Var.f33307n != null) {
            beginRecording4.translate(f18, f19);
            beginRecording4.translate(0.0f, AndroidUtilities.dp(32.0f));
            NotchInfoUtils.NotchInfo notchInfo2 = yi0Var.f33307n;
            if (notchInfo2.isLikelyCircle) {
                float min = Math.min(notchInfo2.bounds.width(), yi0Var.f33307n.bounds.height()) / 2.0f;
                RectF rectF3 = yi0Var.f33307n.bounds;
                float width = rectF3.bottom - (rectF3.width() / 2.0f);
                beginRecording4.drawCircle(yi0Var.f33307n.bounds.centerX(), width, min, paint2);
                path.rewind();
                float f24 = f7 / 2.0f;
                path.moveTo(yi0Var.f33307n.bounds.centerX() - f24, width);
                path.lineTo(yi0Var.f33307n.bounds.centerX(), min + width + f7);
                path.lineTo(yi0Var.f33307n.bounds.centerX() + f24, width);
                path.close();
                beginRecording4.drawPath(path, paint2);
            } else if (notchInfo2.isAccurate) {
                beginRecording4.drawPath(notchInfo2.path, paint2);
            } else {
                float max = Math.max(notchInfo2.bounds.width(), yi0Var.f33307n.bounds.height()) / 2.0f;
                RectF rectF4 = yi0Var.f33307n.bounds;
                RectF rectF5 = this.h;
                rectF5.set(rectF4);
                beginRecording4.drawRoundRect(rectF5, max, max, paint2);
                path.rewind();
                float f25 = f7 / 2.0f;
                path.moveTo(rectF5.centerX() - f25, rectF5.bottom);
                path.lineTo(rectF5.centerX(), rectF5.bottom + f7);
                path.lineTo(rectF5.centerX() + f25, rectF5.bottom);
                path.close();
                beginRecording4.drawPath(path, paint2);
            }
            f11 = f17;
            f12 = f16;
            f13 = y10;
            paint = paint3;
        } else {
            f11 = f17;
            f12 = f16;
            f13 = y10;
            paint = paint3;
            beginRecording4.drawRect(0.0f, 0.0f, f12, AndroidUtilities.dp(32.0f), paint2);
            path.rewind();
            path.moveTo((f12 - f7) / 2.0f, AndroidUtilities.dp(32.0f));
            path.lineTo(f12 / 2.0f, AndroidUtilities.dp(32.0f) + f7);
            path.lineTo((f12 + f7) / 2.0f, AndroidUtilities.dp(32.0f));
            path.close();
            beginRecording4.drawPath(path, paint2);
        }
        this.f32677c.endRecording();
        canvas.save();
        canvas.translate(f10, f15 - AndroidUtilities.dp(32.0f));
        NotchInfoUtils.NotchInfo notchInfo3 = yi0Var.f33307n;
        if (notchInfo3 != null) {
            canvas.clipRect(0.0f, notchInfo3.bounds.top, f12, f11);
        }
        Paint paint4 = this.f32675a;
        canvas.saveLayer(rectF2, paint4);
        canvas.scale(f22, f22);
        canvas.drawRenderNode(this.f32677c);
        canvas.drawRenderNode(this.d);
        canvas.restore();
        int b11 = w7.o.b((ilerp * 3) / 4, 0, 255);
        if (b11 < 255) {
            canvas.saveLayer(rectF2, null);
            if (yi0Var.f33306f != 0.0f) {
                canvas.saveLayer(rectF2, paint4);
                canvas.scale(f13, f13);
                canvas.drawRenderNode(this.f32678e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f32676b);
            }
            canvas.drawRect(rectF2, paint);
            canvas.restore();
        }
        if (b11 > 0) {
            if (b11 != 255) {
                canvas.saveLayerAlpha(rectF2, b11);
            }
            if (yi0Var.f33306f != 0.0f) {
                canvas.saveLayer(rectF2, paint4);
                canvas.scale(f13, f13);
                canvas.drawRenderNode(this.f32678e);
                canvas.restore();
            } else {
                canvas.drawRenderNode(this.f32676b);
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
