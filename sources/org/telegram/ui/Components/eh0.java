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

public final class eh0 implements fh0 {

    public final float f28061f;

    public final Paint f28063i;

    public final RectF f28064j;

    public final gh0 f28065k;

    public final Paint f28057a = new Paint(1);

    public final RenderNode f28058b = new RenderNode("render");

    public final RenderNode f28059c = new RenderNode("effectNotch");
    public final RenderNode d = new RenderNode("effect");

    public final RenderNode f28060e = new RenderNode("blur");

    public final RectF f28062g = new RectF();
    public final RectF h = new RectF();

    public eh0(gh0 gh0Var, float f10) {
        this.f28065k = gh0Var;
        Paint paint = new Paint();
        this.f28063i = paint;
        this.f28064j = new RectF();
        this.f28061f = f10;
        paint.setColor(-16777216);
        paint.setBlendMode(BlendMode.SRC_IN);
    }

    @Override
    public final void a(float f10) {
        RenderNode renderNode = this.d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        this.f28059c.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        this.f28057a.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
    }

    @Override
    public final void b(float f10) {
        if (f10 == 0.0f) {
            this.f28060e.setRenderEffect(null);
            return;
        }
        RenderNode renderNode = this.f28060e;
        float f11 = this.f28065k.d;
        float f12 = this.f28061f;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect((f10 * f11) / f12, (f10 * f11) / f12, Shader.TileMode.DECAL));
    }

    @Override
    public final void c(vu vuVar, Canvas canvas) {
        float f10;
        float f11;
        gh0 gh0Var = this.f28065k;
        Paint paint = gh0Var.f28626a;
        Path path = gh0Var.f28627b;
        if (canvas.isHardwareAccelerated()) {
            float width = gh0Var.getWidth();
            float height = gh0Var.getHeight();
            RectF rectF = this.f28062g;
            rectF.set(0.0f, 0.0f, width, height);
            int childCount = gh0Var.getChildCount();
            RectF rectF2 = this.f28064j;
            if (childCount > 0) {
                View childAt = gh0Var.getChildAt(0);
                float scaleX = childAt.getScaleX() * childAt.getWidth();
                float scaleY = childAt.getScaleY() * childAt.getHeight();
                float x8 = childAt.getX();
                float y10 = childAt.getY();
                rectF2.set(x8, y10, scaleX + x8, scaleY + y10);
                NotchInfoUtils.NotchInfo notchInfo = gh0Var.f28631n;
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
            int iCeil = (int) Math.ceil(rectF2.width());
            int iCeil2 = (int) Math.ceil(rectF2.height());
            float f12 = rectF2.left;
            float f13 = rectF2.top;
            this.f28058b.setPosition(0, 0, iCeil, iCeil2);
            this.f28060e.setPosition(0, 0, iCeil, iCeil2);
            this.d.setPosition(0, 0, iCeil, iCeil2);
            this.f28059c.setPosition(0, 0, iCeil, iCeil2);
            float f14 = iCeil;
            float f15 = iCeil2;
            rectF2.set(0.0f, 0.0f, f14, f15);
            RecordingCanvas recordingCanvasBeginRecording = this.f28058b.beginRecording();
            float f16 = -f12;
            float f17 = -f13;
            recordingCanvasBeginRecording.translate(f16, f17);
            int iIlerp = (int) ((1.0f - AndroidUtilities.ilerp(gh0Var.f28629e, 0.5f, 1.0f)) * 255.0f);
            int iB = h7.n.b(iIlerp, 0, 255);
            gh0.a((gh0) vuVar.f34056b, recordingCanvasBeginRecording);
            this.f28058b.endRecording();
            float f18 = this.f28061f;
            float fZ = com.google.android.recaptcha.internal.a.z(f18, 1.0f, 2.0f, com.google.android.recaptcha.internal.a.x(gh0Var.f28630f, 0.5f, f18, (f18 / 4.0f) + 1.0f));
            RecordingCanvas recordingCanvasBeginRecording2 = this.f28060e.beginRecording();
            float f19 = 1.0f / fZ;
            recordingCanvasBeginRecording2.scale(f19, f19, 0.0f, 0.0f);
            recordingCanvasBeginRecording2.drawRenderNode(this.f28058b);
            this.f28060e.endRecording();
            float f20 = f18 + 2.0f;
            RecordingCanvas recordingCanvasBeginRecording3 = this.d.beginRecording();
            float f21 = 1.0f / f20;
            recordingCanvasBeginRecording3.scale(f21, f21, 0.0f, 0.0f);
            Paint paint2 = this.f28063i;
            if (iB < 255) {
                recordingCanvasBeginRecording3.saveLayer(rectF2, null);
                recordingCanvasBeginRecording3.drawRenderNode(this.f28058b);
                recordingCanvasBeginRecording3.drawRect(rectF2, paint2);
                recordingCanvasBeginRecording3.restore();
            }
            float fLerp = AndroidUtilities.lerp(0.0f, AndroidUtilities.dp(7.0f) * f20, 0.0f, 0.5f, gh0Var.f28629e);
            if (gh0Var.getChildCount() > 0) {
                View childAt2 = gh0Var.getChildAt(0);
                float scaleX2 = (((childAt2.getScaleX() * childAt2.getWidth()) / 2.0f) + childAt2.getX()) - f12;
                float scaleY2 = ((((childAt2.getScaleY() * childAt2.getHeight()) / 2.0f) + childAt2.getY()) + AndroidUtilities.dp(32.0f)) - f13;
                float scaleX3 = childAt2.getScaleX() * (childAt2.getWidth() / 2.0f);
                path.rewind();
                f10 = fLerp;
                path.moveTo(scaleX2 - scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
                path.lineTo(scaleX2, (scaleY2 - scaleX3) - (0.25f * f10));
                path.lineTo(scaleX2 + scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
                path.close();
                recordingCanvasBeginRecording3.drawPath(path, paint);
            } else {
                f10 = fLerp;
            }
            if (iB > 0) {
                if (iB != 255) {
                    recordingCanvasBeginRecording3.saveLayerAlpha(rectF2, iB);
                }
                recordingCanvasBeginRecording3.drawRenderNode(this.f28058b);
                if (iB != 255) {
                    recordingCanvasBeginRecording3.restore();
                }
            }
            this.d.endRecording();
            RecordingCanvas recordingCanvasBeginRecording4 = this.f28059c.beginRecording();
            recordingCanvasBeginRecording4.scale(f21, f21, 0.0f, 0.0f);
            if (gh0Var.f28631n != null) {
                recordingCanvasBeginRecording4.translate(f16, f17);
                recordingCanvasBeginRecording4.translate(0.0f, AndroidUtilities.dp(32.0f));
                NotchInfoUtils.NotchInfo notchInfo2 = gh0Var.f28631n;
                if (notchInfo2.isLikelyCircle) {
                    float fMin = Math.min(notchInfo2.bounds.width(), gh0Var.f28631n.bounds.height()) / 2.0f;
                    RectF rectF3 = gh0Var.f28631n.bounds;
                    float fWidth = rectF3.bottom - (rectF3.width() / 2.0f);
                    recordingCanvasBeginRecording4.drawCircle(gh0Var.f28631n.bounds.centerX(), fWidth, fMin, paint);
                    path.rewind();
                    float f22 = f10 / 2.0f;
                    path.moveTo(gh0Var.f28631n.bounds.centerX() - f22, fWidth);
                    path.lineTo(gh0Var.f28631n.bounds.centerX(), fMin + fWidth + f10);
                    path.lineTo(gh0Var.f28631n.bounds.centerX() + f22, fWidth);
                    path.close();
                    recordingCanvasBeginRecording4.drawPath(path, paint);
                } else if (notchInfo2.isAccurate) {
                    recordingCanvasBeginRecording4.drawPath(notchInfo2.path, paint);
                } else {
                    float fMax = Math.max(notchInfo2.bounds.width(), gh0Var.f28631n.bounds.height()) / 2.0f;
                    RectF rectF4 = gh0Var.f28631n.bounds;
                    RectF rectF5 = this.h;
                    rectF5.set(rectF4);
                    recordingCanvasBeginRecording4.drawRoundRect(rectF5, fMax, fMax, paint);
                    path.rewind();
                    float f23 = f10 / 2.0f;
                    path.moveTo(rectF5.centerX() - f23, rectF5.bottom);
                    path.lineTo(rectF5.centerX(), rectF5.bottom + f10);
                    path.lineTo(rectF5.centerX() + f23, rectF5.bottom);
                    path.close();
                    recordingCanvasBeginRecording4.drawPath(path, paint);
                }
                f11 = f14;
            } else {
                f11 = f14;
                recordingCanvasBeginRecording4.drawRect(0.0f, 0.0f, f11, AndroidUtilities.dp(32.0f), paint);
                path.rewind();
                path.moveTo((f11 - f10) / 2.0f, AndroidUtilities.dp(32.0f));
                path.lineTo(f11 / 2.0f, AndroidUtilities.dp(32.0f) + f10);
                path.lineTo((f11 + f10) / 2.0f, AndroidUtilities.dp(32.0f));
                path.close();
                recordingCanvasBeginRecording4.drawPath(path, paint);
            }
            this.f28059c.endRecording();
            canvas.save();
            canvas.translate(f12, f13 - AndroidUtilities.dp(32.0f));
            NotchInfoUtils.NotchInfo notchInfo3 = gh0Var.f28631n;
            if (notchInfo3 != null) {
                canvas.clipRect(0.0f, notchInfo3.bounds.top, f11, f15);
            }
            Paint paint3 = this.f28057a;
            canvas.saveLayer(rectF2, paint3);
            canvas.scale(f20, f20);
            canvas.drawRenderNode(this.f28059c);
            canvas.drawRenderNode(this.d);
            canvas.restore();
            int iB2 = h7.n.b((iIlerp * 3) / 4, 0, 255);
            if (iB2 < 255) {
                canvas.saveLayer(rectF2, null);
                if (gh0Var.f28630f != 0.0f) {
                    canvas.saveLayer(rectF2, paint3);
                    canvas.scale(fZ, r22);
                    canvas.drawRenderNode(this.f28060e);
                    canvas.restore();
                } else {
                    canvas.drawRenderNode(this.f28058b);
                }
                canvas.drawRect(rectF2, paint2);
                canvas.restore();
            }
            if (iB2 > 0) {
                if (iB2 != 255) {
                    canvas.saveLayerAlpha(rectF2, iB2);
                }
                if (gh0Var.f28630f != 0.0f) {
                    canvas.saveLayer(rectF2, paint3);
                    canvas.scale(r22, r22);
                    canvas.drawRenderNode(this.f28060e);
                    canvas.restore();
                } else {
                    canvas.drawRenderNode(this.f28058b);
                }
                if (iB2 != 255) {
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    @Override
    public final void d(int i10, int i11) {
    }
}
