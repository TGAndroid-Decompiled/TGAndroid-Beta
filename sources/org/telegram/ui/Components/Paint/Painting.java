package org.telegram.ui.Components.Paint;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import androidx.core.graphics.ColorUtils;
import com.google.common.base.Splitter;
import com.stripe.android.Stripe;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;
import java.util.zip.Inflater;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda14;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.Size;

public final class Painting {
    public Path activePath;
    public Shape activeShape;
    public RectF activeStrokeBounds;
    public Splitter backupSlice;
    public Texture bitmapBlurTexture;
    public Texture bitmapTexture;
    public final BlurringShader.BlurManager blurManager;
    public Bitmap bluredBitmap;
    public Texture bluredTexture;
    public Brush brush;
    public final ByteBuffer dataBuffer;
    public RenderView.AnonymousClass2 delegate;
    public boolean hasBlur;
    public float helperAlpha;
    public ValueAnimator helperAnimator;
    public float helperApplyAlpha;
    public ValueAnimator helperApplyAnimator;
    public Shape helperShape;
    public boolean helperShown;
    public int helperTexture;
    public final Bitmap imageBitmap;
    public Paint imageBitmapPaint;
    public final int imageBitmapRotation;
    public Texture originalBitmapTexture;
    public int paintTexture;
    public boolean paused;
    public final float[] projection;
    public float[] renderProjection;
    public RenderView renderView;
    public int reusableFramebuffer;
    public Map shaders;
    public final Size size;
    public int suppressChangesCounter;
    public final ByteBuffer textureBuffer;
    public final ByteBuffer vertexBuffer;
    public final HashMap brushTextures = new HashMap();
    public final int[] buffers = new int[1];
    public boolean masking = false;
    public final RenderState renderState = new RenderState();

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Painting this$0;

        public AnonymousClass1(Painting painting, int i) {
            this.$r8$classId = i;
            this.this$0 = painting;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    Painting painting = this.this$0;
                    painting.helperAnimator = null;
                    painting.renderView.performInContext(new ChatbotSheet$$ExternalSyntheticLambda0(this, 17));
                    break;
                default:
                    this.this$0.renderView.performInContext(new ChatbotSheet$$ExternalSyntheticLambda0(this, 18));
                    break;
            }
        }
    }

    public Painting(Size size, Bitmap bitmap, int i, BlurringShader.BlurManager blurManager) {
        this.blurManager = blurManager;
        this.size = size;
        this.imageBitmap = bitmap;
        this.imageBitmapRotation = i;
        this.dataBuffer = ByteBuffer.allocateDirect(((int) size.width) * ((int) size.height) * 4);
        this.projection = GLMatrix.LoadOrtho(size.width, size.height);
        if (this.vertexBuffer == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
            this.vertexBuffer = byteBufferAllocateDirect;
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        }
        this.vertexBuffer.putFloat(0.0f);
        this.vertexBuffer.putFloat(0.0f);
        this.vertexBuffer.putFloat(size.width);
        this.vertexBuffer.putFloat(0.0f);
        this.vertexBuffer.putFloat(0.0f);
        this.vertexBuffer.putFloat(size.height);
        this.vertexBuffer.putFloat(size.width);
        this.vertexBuffer.putFloat(size.height);
        this.vertexBuffer.rewind();
        if (this.textureBuffer == null) {
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
            this.textureBuffer = byteBufferAllocateDirect2;
            byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
            byteBufferAllocateDirect2.putFloat(0.0f);
            byteBufferAllocateDirect2.putFloat(0.0f);
            byteBufferAllocateDirect2.putFloat(1.0f);
            byteBufferAllocateDirect2.putFloat(0.0f);
            byteBufferAllocateDirect2.putFloat(0.0f);
            byteBufferAllocateDirect2.putFloat(1.0f);
            byteBufferAllocateDirect2.putFloat(1.0f);
            byteBufferAllocateDirect2.putFloat(1.0f);
            byteBufferAllocateDirect2.rewind();
        }
    }

    public final void cleanResources(boolean z) {
        int i = this.reusableFramebuffer;
        int[] iArr = this.buffers;
        if (i != 0) {
            iArr[0] = i;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.reusableFramebuffer = 0;
        }
        Texture texture = this.bitmapTexture;
        if (texture != null) {
            texture.cleanResources(z);
        }
        Texture texture2 = this.bitmapBlurTexture;
        if (texture2 != null) {
            texture2.cleanResources(z);
        }
        int i2 = this.paintTexture;
        if (i2 != 0) {
            iArr[0] = i2;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.paintTexture = 0;
        }
        HashMap map = this.brushTextures;
        for (Texture texture3 : map.values()) {
            if (texture3 != null) {
                texture3.cleanResources(true);
            }
        }
        map.clear();
        int i3 = this.helperTexture;
        if (i3 != 0) {
            iArr[0] = i3;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.helperTexture = 0;
        }
        Texture texture4 = this.bluredTexture;
        if (texture4 != null) {
            texture4.cleanResources(true);
        }
        Texture texture5 = this.originalBitmapTexture;
        if (texture5 != null) {
            texture5.cleanResources(true);
        }
        Map map2 = this.shaders;
        if (map2 != null) {
            for (Shader shader : map2.values()) {
                if (shader.program != 0) {
                    GLES20.glDeleteProgram(0);
                    shader.program = 0;
                }
            }
            this.shaders = null;
        }
    }

    public final void clearStrokeInternal() {
        GLES20.glBindFramebuffer(36160, getReusableFramebuffer());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, getPaintTexture(), 0);
        Utils.HasGLError();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            Size size = this.size;
            GLES20.glViewport(0, 0, (int) size.width, (int) size.height);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        RenderView.AnonymousClass2 anonymousClass2 = this.delegate;
        if (anonymousClass2 != null) {
            anonymousClass2.contentChanged();
        }
        RenderState renderState = this.renderState;
        renderState.count = 0;
        renderState.remainder = 0.0d;
        ByteBuffer byteBuffer = renderState.buffer;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.activeStrokeBounds = null;
        this.activePath = null;
        this.helperApplyAlpha = 0.0f;
    }

    public final void commitPath(Path path, int i, boolean z, Input$$ExternalSyntheticLambda2 input$$ExternalSyntheticLambda2) {
        if (this.shaders == null || this.brush == null) {
            return;
        }
        this.renderView.performInContext(new Painting$$ExternalSyntheticLambda7(this, path, i, z, input$$ExternalSyntheticLambda2));
    }

    public final Splitter commitPathInternal(Path path, int i, RectF rectF) {
        Splitter splitterRegisterUndo;
        RenderView.AnonymousClass2 anonymousClass2;
        Object textureLock;
        boolean z;
        Brush brush = this.brush;
        if (path != null) {
            brush = path.brush;
        }
        Brush eraser = brush;
        if (this.blurManager == null || !(((z = eraser instanceof Brush.Blurer)) || (eraser instanceof Brush.Eraser))) {
            splitterRegisterUndo = registerUndo(rectF, false);
        } else {
            boolean z2 = this.hasBlur;
            if (rectF == null) {
                splitterRegisterUndo = null;
            } else {
                Size size = this.size;
                if (rectF.setIntersect(rectF, new RectF(0.0f, 0.0f, size.width, size.height))) {
                    ByteBuffer byteBuffer = (ByteBuffer) getPaintingData(rectF, true, false, false).defaultPublishableKey;
                    RenderView renderView = RenderView.this;
                    Splitter splitter = new Splitter(byteBuffer, 0, rectF);
                    ByteBuffer byteBuffer2 = (ByteBuffer) getPaintingData(rectF, true, true, false).defaultPublishableKey;
                    RenderView renderView2 = RenderView.this;
                    Splitter splitter2 = new Splitter(byteBuffer2, 1, rectF);
                    UndoStore undoStore = RenderView.this.undoStore;
                    UUID uuidRandomUUID = UUID.randomUUID();
                    undoStore.uuidToOperationMap.put(uuidRandomUUID, new Theme$$ExternalSyntheticLambda14(this, splitter, splitter2, z2, 3));
                    undoStore.operations.add(uuidRandomUUID);
                    undoStore.notifyOfHistoryChanges();
                    splitterRegisterUndo = splitter;
                } else {
                    splitterRegisterUndo = null;
                }
            }
            this.hasBlur = z;
        }
        this.suppressChangesCounter++;
        int i2 = (this.blurManager == null || !((eraser instanceof Brush.Blurer) || (eraser instanceof Brush.Eraser))) ? 1 : 2;
        for (int i3 = 0; i3 < i2; i3++) {
            GLES20.glBindFramebuffer(36160, getReusableFramebuffer());
            int texture = getTexture();
            if (this.blurManager != null && (((eraser instanceof Brush.Blurer) && i3 == 0) || ((eraser instanceof Brush.Eraser) && i3 == 1))) {
                Texture texture2 = this.bitmapBlurTexture;
                texture = texture2 != null ? texture2.texture() : 0;
            }
            if (i3 == 1 && (eraser instanceof Brush.Blurer)) {
                eraser = new Brush.Eraser();
            }
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, texture, 0);
            Size size2 = this.size;
            GLES20.glViewport(0, 0, (int) size2.width, (int) size2.height);
            Shader shader = (Shader) this.shaders.get(eraser.getShaderName(1));
            if (shader == null) {
                return null;
            }
            GLES20.glUseProgram(shader.program);
            GLES20.glUniformMatrix4fv(((Integer) shader.uniformsMap.get("mvpMatrix")).intValue(), 1, false, FloatBuffer.wrap(this.projection));
            GLES20.glUniform1i(((Integer) shader.uniformsMap.get("texture")).intValue(), 0);
            GLES20.glUniform1i(((Integer) shader.uniformsMap.get("mask")).intValue(), 1);
            Shader.SetColorUniform(((Integer) shader.uniformsMap.get("color")).intValue(), ColorUtils.setAlphaComponent(i, (int) (eraser.getOverrideAlpha() * Color.alpha(i))));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, texture);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, getPaintTexture());
            if (eraser instanceof Brush.Blurer) {
                GLES20.glUniform1i(((Integer) shader.uniformsMap.get("blured")).intValue(), 2);
                GLES20.glActiveTexture(33986);
                BlurringShader.BlurManager blurManager = this.blurManager;
                if (blurManager != null) {
                    textureLock = blurManager.getTextureLock();
                    GLES20.glBindTexture(3553, this.blurManager.getTexture());
                } else {
                    GLES20.glBindTexture(3553, this.bluredTexture.texture());
                    textureLock = null;
                }
            } else {
                textureLock = null;
            }
            GLES20.glBlendFunc(1, 0);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(1);
            if (textureLock != null) {
                synchronized (textureLock) {
                    GLES20.glDrawArrays(5, 0, 4);
                }
            } else {
                GLES20.glDrawArrays(5, 0, 4);
            }
            GLES20.glBindTexture(3553, getTexture());
            GLES20.glTexParameteri(3553, 10241, 9729);
        }
        GLES20.glBindFramebuffer(36160, 0);
        if (this.suppressChangesCounter <= 0 && (anonymousClass2 = this.delegate) != null) {
            anonymousClass2.contentChanged();
        }
        this.suppressChangesCounter--;
        RenderState renderState = this.renderState;
        renderState.count = 0;
        renderState.remainder = 0.0d;
        ByteBuffer byteBuffer3 = renderState.buffer;
        if (byteBuffer3 != null) {
            byteBuffer3.position(0);
        }
        this.activePath = null;
        this.activeShape = null;
        return splitterRegisterUndo;
    }

    public final Splitter commitShapeInternal(Shape shape, int i, RectF rectF) {
        Brush brush = shape.brush;
        if (brush == null) {
            brush = this.brush;
        }
        Splitter splitterRegisterUndo = registerUndo(rectF, this.blurManager != null && (brush instanceof Brush.Blurer));
        this.suppressChangesCounter++;
        GLES20.glBindFramebuffer(36160, getReusableFramebuffer());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, getTexture(), 0);
        Size size = this.size;
        GLES20.glViewport(0, 0, (int) size.width, (int) size.height);
        Shader shader = (Shader) this.shaders.get(brush.getShaderName(1));
        if (shader == null) {
            return null;
        }
        GLES20.glUseProgram(shader.program);
        HashMap map = shader.uniformsMap;
        GLES20.glUniformMatrix4fv(((Integer) map.get("mvpMatrix")).intValue(), 1, false, FloatBuffer.wrap(this.projection));
        GLES20.glUniform1i(((Integer) map.get("texture")).intValue(), 0);
        GLES20.glUniform1i(((Integer) map.get("mask")).intValue(), 1);
        Shader.SetColorUniform(((Integer) map.get("color")).intValue(), i);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, getTexture());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, getPaintTexture());
        if ((brush instanceof Brush.Blurer) && this.bluredTexture != null) {
            GLES20.glUniform1i(((Integer) map.get("blured")).intValue(), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.bluredTexture.texture());
        }
        if (brush instanceof Brush.Shape) {
            GLES20.glUniform1i(((Integer) map.get("type")).intValue(), shape.brush.getShapeShaderType());
            GLES20.glUniform2f(((Integer) map.get("resolution")).intValue(), size.width, size.height);
            GLES20.glUniform2f(((Integer) map.get("center")).intValue(), shape.centerX, shape.centerY);
            GLES20.glUniform2f(((Integer) map.get("radius")).intValue(), shape.radiusX, shape.radiusY);
            GLES20.glUniform1f(((Integer) map.get("thickness")).intValue(), shape.thickness);
            GLES20.glUniform1f(((Integer) map.get("rounding")).intValue(), shape.rounding);
            GLES20.glUniform2f(((Integer) map.get("middle")).intValue(), shape.middleX, shape.middleY);
            GLES20.glUniform1f(((Integer) map.get("rotation")).intValue(), shape.rotation);
            GLES20.glUniform1i(((Integer) map.get("fill")).intValue(), shape.fill ? 1 : 0);
            GLES20.glUniform1f(((Integer) map.get("arrowTriangleLength")).intValue(), shape.arrowTriangleLength);
            GLES20.glUniform1i(((Integer) map.get("composite")).intValue(), 1);
            GLES20.glUniform1i(((Integer) map.get("clear")).intValue(), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.textureBuffer);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, getTexture());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        RenderView.AnonymousClass2 anonymousClass2 = this.delegate;
        if (anonymousClass2 != null && this.suppressChangesCounter <= 0) {
            anonymousClass2.contentChanged();
        }
        this.suppressChangesCounter--;
        RenderState renderState = this.renderState;
        renderState.count = 0;
        renderState.remainder = 0.0d;
        ByteBuffer byteBuffer = renderState.buffer;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.helperApplyAlpha = 0.0f;
        this.helperShown = false;
        this.helperAlpha = 0.0f;
        this.helperShape = null;
        this.activePath = null;
        this.activeShape = null;
        return splitterRegisterUndo;
    }

    public final int getPaintTexture() {
        if (this.paintTexture == 0) {
            this.paintTexture = Texture.generateTexture(this.size);
        }
        return this.paintTexture;
    }

    public final Stripe getPaintingData(RectF rectF, boolean z, boolean z2, boolean z3) {
        String str;
        Texture texture;
        Stripe stripe;
        Shader shader;
        Texture texture2;
        int i = (int) rectF.left;
        int i2 = (int) rectF.top;
        int iWidth = (int) rectF.width();
        int iHeight = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.buffers, 0);
        int i3 = this.buffers[0];
        GLES20.glBindFramebuffer(36160, i3);
        GLES20.glGenTextures(1, this.buffers, 0);
        int i4 = this.buffers[0];
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, iWidth, iHeight, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i4, 0);
        Size size = this.size;
        GLES20.glViewport(0, 0, (int) size.width, (int) size.height);
        Map map = this.shaders;
        Object obj = null;
        if (map != null) {
            if (z) {
                str = "nonPremultipliedBlit";
            } else {
                str = this.masking ? "maskingBlit" : "blit";
            }
            Shader shader2 = (Shader) map.get(str);
            if (shader2 != null) {
                GLES20.glUseProgram(shader2.program);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i, -i2);
                float[] fArr = new float[9];
                matrix.getValues(fArr);
                float[] fArrMultiplyMat4f = GLMatrix.MultiplyMat4f(this.projection, new float[]{fArr[0], fArr[1], 0.0f, 0.0f, fArr[3], fArr[4], 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, 1.0f});
                GLES20.glUniformMatrix4fv(((Integer) shader2.uniformsMap.get("mvpMatrix")).intValue(), 1, false, FloatBuffer.wrap(fArrMultiplyMat4f));
                if (z || !this.masking) {
                    GLES20.glUniform1i(((Integer) shader2.uniformsMap.get("texture")).intValue(), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z2 || (texture = this.bitmapBlurTexture) == null) ? getTexture() : texture.texture());
                } else {
                    GLES20.glUniform1i(((Integer) shader2.uniformsMap.get("texture")).intValue(), 1);
                    GLES20.glUniform1i(((Integer) shader2.uniformsMap.get("mask")).intValue(), 0);
                    GLES20.glUniform1f(((Integer) shader2.uniformsMap.get("preview")).intValue(), 0.0f);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z2 || (texture2 = this.bitmapBlurTexture) == null) ? getTexture() : texture2.texture());
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.originalBitmapTexture.texture());
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.textureBuffer);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z3 && !z2 && (shader = (Shader) this.shaders.get("videoBlur")) != null && this.blurManager != null) {
                    GLES20.glUseProgram(shader.program);
                    GLES20.glUniformMatrix4fv(((Integer) shader.uniformsMap.get("mvpMatrix")).intValue(), 1, false, FloatBuffer.wrap(fArrMultiplyMat4f));
                    GLES20.glUniform1f(((Integer) shader.uniformsMap.get("flipy")).intValue(), 0.0f);
                    GLES20.glUniform1i(((Integer) shader.uniformsMap.get("texture")).intValue(), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.bitmapBlurTexture.texture());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(((Integer) shader.uniformsMap.get("blured")).intValue(), 1);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.blurManager.getTexture());
                    GLES20.glUniform1f(((Integer) shader.uniformsMap.get("eraser")).intValue(), 0.0f);
                    GLES20.glUniform1i(((Integer) shader.uniformsMap.get("mask")).intValue(), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, getTexture());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.textureBuffer);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.blurManager.getTextureLock()) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.dataBuffer.limit(iWidth * iHeight * 4);
                GLES20.glReadPixels(0, 0, iWidth, iHeight, 6408, 5121, this.dataBuffer);
                if (z) {
                    stripe = new Stripe(18, obj, this.dataBuffer);
                } else {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(this.dataBuffer);
                    stripe = new Stripe(18, bitmapCreateBitmap, obj);
                }
                this.dataBuffer.rewind();
                int[] iArr = this.buffers;
                iArr[0] = i3;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.buffers;
                iArr2[0] = i4;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return stripe;
            }
        }
        return null;
    }

    public final int getReusableFramebuffer() {
        if (this.reusableFramebuffer == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.reusableFramebuffer = iArr[0];
            Utils.HasGLError();
        }
        return this.reusableFramebuffer;
    }

    public final int getTexture() {
        Texture texture = this.bitmapTexture;
        if (texture != null) {
            return texture.texture();
        }
        return 0;
    }

    public final void paintShape(Shape shape) {
        if (shape == null) {
            return;
        }
        this.renderView.performInContext(new Painting$$ExternalSyntheticLambda1(this, shape, 0));
    }

    public final void paintStrokeInternal(Path path, boolean z, boolean z2) {
        int i;
        int i2;
        RenderView.AnonymousClass2 anonymousClass2;
        RectF rectF;
        char c;
        char c2;
        int i3;
        Point point;
        double d;
        Object obj;
        float f;
        char c3;
        this.activePath = path;
        if (path == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, getReusableFramebuffer());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, getPaintTexture(), 0);
        Utils.HasGLError();
        RectF rectF2 = null;
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            Size size = this.size;
            GLES20.glViewport(0, 0, (int) size.width, (int) size.height);
            if (z) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
            }
            Map map = this.shaders;
            if (map == null) {
                return;
            }
            Brush brush = path.brush;
            Shader shader = (Shader) map.get(brush.getShaderName(2));
            if (shader == null) {
                return;
            }
            GLES20.glUseProgram(shader.program);
            Texture texture = (Texture) this.brushTextures.get(Integer.valueOf(brush.getStampResId()));
            if (texture == null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = false;
                c = 3;
                texture = new Texture(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), brush.getStampResId(), options));
                this.brushTextures.put(Integer.valueOf(brush.getStampResId()), texture);
            } else {
                c = 3;
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, texture.texture());
            GLES20.glUniformMatrix4fv(((Integer) shader.uniformsMap.get("mvpMatrix")).intValue(), 1, false, FloatBuffer.wrap(this.projection));
            GLES20.glUniform1i(((Integer) shader.uniformsMap.get("texture")).intValue(), 0);
            if (z2) {
                this.renderState.viewportScale = 1.0f;
            } else {
                this.renderState.viewportScale = this.renderView.getScaleX();
            }
            RenderState renderState = this.renderState;
            renderState.baseWeight = path.baseWeight;
            renderState.spacing = path.brush.getSpacing();
            renderState.alpha = z2 ? 1.0f : path.brush.getAlpha();
            renderState.angle = path.brush.getAngle();
            renderState.scale = path.brush.getScale();
            Vector vector = path.points;
            int size2 = vector == null ? 0 : vector.size();
            if (size2 == 0) {
                i2 = 36160;
                i = 0;
            } else {
                if (size2 == 1) {
                    Point[] pointArr = new Point[path.points.size()];
                    path.points.toArray(pointArr);
                    Point point2 = pointArr[0];
                    float f2 = ((renderState.baseWeight * renderState.scale) * 1.0f) / renderState.viewportScale;
                    point2.getClass();
                    c2 = 4;
                    i3 = 1;
                    PointF pointF = new PointF((float) point2.x, (float) point2.y);
                    float f3 = Math.abs(renderState.angle) > 0.0f ? renderState.angle : 0.0f;
                    float f4 = renderState.alpha;
                    renderState.count = 0;
                    if (renderState.buffer == null) {
                        renderState.allocatedCount = 256;
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(5120);
                        renderState.buffer = byteBufferAllocateDirect;
                        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                        renderState.buffer.position(0);
                    }
                    int i4 = renderState.count + 1;
                    int i5 = renderState.allocatedCount;
                    if (i4 > i5 || renderState.buffer == null) {
                        if (renderState.buffer != null) {
                            renderState.buffer = null;
                        }
                        int iMax = Math.max(i5 * 2, 256);
                        renderState.allocatedCount = iMax;
                        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(iMax * 20);
                        renderState.buffer = byteBufferAllocateDirect2;
                        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
                        renderState.buffer.position(0);
                    }
                    renderState.count = i4;
                    renderState.addPoint(pointF, f2, f3, f4, 0);
                } else {
                    c2 = 4;
                    i3 = 1;
                    int size3 = path.points.size();
                    Point[] pointArr2 = new Point[size3];
                    path.points.toArray(pointArr2);
                    renderState.count = 0;
                    if (renderState.buffer == null) {
                        renderState.allocatedCount = 256;
                        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(5120);
                        renderState.buffer = byteBufferAllocateDirect3;
                        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
                        renderState.buffer.position(0);
                    }
                    int i6 = 0;
                    while (i6 < size3 - 1) {
                        Point point3 = pointArr2[i6];
                        int i7 = i6 + 1;
                        Point point4 = pointArr2[i7];
                        double distanceTo = point3.getDistanceTo(point4);
                        Point[] pointArr3 = pointArr2;
                        double d2 = point4.x - point3.x;
                        double d3 = point4.y - point3.y;
                        double d4 = point4.z - point3.z;
                        Point point5 = new Point(1.0d, 1.0d, 0.0d);
                        float fAtan2 = Math.abs(renderState.angle) > 0.0f ? renderState.angle : (float) Math.atan2(d3, d2);
                        int i8 = size3;
                        float f5 = (float) ((((((double) renderState.baseWeight) * point4.z) * ((double) renderState.scale)) * 1.0d) / ((double) renderState.viewportScale));
                        double dMax = Math.max(1.0f, renderState.spacing * f5);
                        if (distanceTo > 0.0d) {
                            double d5 = 1.0d / distanceTo;
                            point = new Point(d2 * d5, d3 * d5, d4 * d5);
                        } else {
                            point = point5;
                        }
                        float fMin = Math.min(1.0f, renderState.alpha * 1.15f);
                        boolean z3 = point3.edge;
                        boolean z4 = point4.edge;
                        int iCeil = (int) Math.ceil((distanceTo - renderState.remainder) / dMax);
                        int i9 = renderState.count;
                        int i10 = iCeil + i9;
                        int i11 = renderState.allocatedCount;
                        if (i10 > i11 || renderState.buffer == null) {
                            if (renderState.buffer != null) {
                                renderState.buffer = null;
                            }
                            int iMax2 = Math.max(i11 * 2, 256);
                            renderState.allocatedCount = iMax2;
                            ByteBuffer byteBufferAllocateDirect4 = ByteBuffer.allocateDirect(iMax2 * 20);
                            renderState.buffer = byteBufferAllocateDirect4;
                            byteBufferAllocateDirect4.order(ByteOrder.nativeOrder());
                            renderState.buffer.position(0);
                        }
                        renderState.count = i10;
                        ByteBuffer byteBuffer = renderState.buffer;
                        if (byteBuffer != null && i9 >= 0 && i9 < renderState.allocatedCount) {
                            byteBuffer.position(i9 * 20);
                        }
                        double d6 = renderState.remainder;
                        Point point6 = new Point(point3.x + (point.x * d6), point3.y + (point.y * d6), point3.z + (point.z * d6));
                        boolean z5 = z3;
                        double d7 = d6;
                        Point point7 = point6;
                        boolean zAddPoint = true;
                        while (true) {
                            if (d7 > distanceTo) {
                                d = d7;
                                break;
                            }
                            RenderState renderState2 = renderState;
                            d = d7;
                            zAddPoint = renderState2.addPoint(new PointF((float) point7.x, (float) point7.y), f5, fAtan2, z5 ? fMin : renderState.alpha, -1);
                            renderState = renderState2;
                            if (!zAddPoint) {
                                break;
                            }
                            d7 = d + dMax;
                            point7 = new Point(point7.x + (point.x * dMax), point7.y + (point.y * dMax), point7.z + (point.z * dMax));
                            z5 = false;
                        }
                        if (zAddPoint && z4) {
                            int i12 = renderState.count + 1;
                            int i13 = renderState.allocatedCount;
                            if (i12 > i13 || renderState.buffer == null) {
                                if (renderState.buffer != null) {
                                    obj = null;
                                    renderState.buffer = null;
                                } else {
                                    obj = null;
                                }
                                int iMax3 = Math.max(i13 * 2, 256);
                                renderState.allocatedCount = iMax3;
                                ByteBuffer byteBufferAllocateDirect5 = ByteBuffer.allocateDirect(iMax3 * 20);
                                renderState.buffer = byteBufferAllocateDirect5;
                                byteBufferAllocateDirect5.order(ByteOrder.nativeOrder());
                                renderState.buffer.position(0);
                            } else {
                                obj = null;
                            }
                            renderState.count = i12;
                            renderState.addPoint(new PointF((float) point4.x, (float) point4.y), f5, fAtan2, fMin, -1);
                        } else {
                            obj = null;
                        }
                        renderState.remainder = d - distanceTo;
                        i6 = i7;
                        pointArr2 = pointArr3;
                        size3 = i8;
                    }
                }
                path.remainder = renderState.remainder;
                rectF2 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                int i14 = renderState.count;
                if (i14 > 0) {
                    int i15 = i14 - 1;
                    ByteBuffer byteBufferAllocateDirect6 = ByteBuffer.allocateDirect(((i15 * 2) + (i14 * 4)) * 20);
                    byteBufferAllocateDirect6.order(ByteOrder.nativeOrder());
                    FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect6.asFloatBuffer();
                    floatBufferAsFloatBuffer.position(0);
                    ByteBuffer byteBuffer2 = renderState.buffer;
                    if (byteBuffer2 != null && renderState.allocatedCount > 0) {
                        byteBuffer2.position(0);
                    }
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < i14) {
                        float f6 = renderState.buffer.getFloat();
                        float f7 = renderState.buffer.getFloat();
                        float f8 = renderState.buffer.getFloat();
                        float f9 = renderState.buffer.getFloat();
                        float f10 = renderState.buffer.getFloat();
                        RectF rectF3 = new RectF(f6 - f8, f7 - f8, f6 + f8, f7 + f8);
                        float f11 = rectF3.left;
                        float f12 = rectF3.top;
                        float f13 = rectF3.right;
                        float f14 = rectF3.bottom;
                        float[] fArr = new float[8];
                        fArr[0] = f11;
                        fArr[i3] = f12;
                        fArr[2] = f13;
                        fArr[c] = f12;
                        fArr[c2] = f11;
                        fArr[5] = f14;
                        fArr[6] = f13;
                        fArr[7] = f14;
                        float fCenterX = rectF3.centerX();
                        float fCenterY = rectF3.centerY();
                        Matrix matrix = new Matrix();
                        int i18 = i14;
                        matrix.setRotate((float) Math.toDegrees(f9), fCenterX, fCenterY);
                        matrix.mapPoints(fArr);
                        matrix.mapRect(rectF3);
                        rectF3.left = (int) Math.floor(rectF3.left);
                        rectF3.top = (int) Math.floor(rectF3.top);
                        rectF3.right = (int) Math.ceil(rectF3.right);
                        rectF3.bottom = (int) Math.ceil(rectF3.bottom);
                        rectF2.union(rectF3);
                        if (i17 != 0) {
                            c3 = 0;
                            floatBufferAsFloatBuffer.put(fArr[0]);
                            floatBufferAsFloatBuffer.put(fArr[i3]);
                            f = 0.0f;
                            floatBufferAsFloatBuffer.put(0.0f);
                            floatBufferAsFloatBuffer.put(0.0f);
                            floatBufferAsFloatBuffer.put(f10);
                            i17++;
                        } else {
                            f = 0.0f;
                            c3 = 0;
                        }
                        floatBufferAsFloatBuffer.put(fArr[c3]);
                        floatBufferAsFloatBuffer.put(fArr[i3]);
                        floatBufferAsFloatBuffer.put(f);
                        floatBufferAsFloatBuffer.put(f);
                        floatBufferAsFloatBuffer.put(f10);
                        floatBufferAsFloatBuffer.put(fArr[2]);
                        floatBufferAsFloatBuffer.put(fArr[c]);
                        floatBufferAsFloatBuffer.put(1.0f);
                        floatBufferAsFloatBuffer.put(f);
                        floatBufferAsFloatBuffer.put(f10);
                        floatBufferAsFloatBuffer.put(fArr[c2]);
                        floatBufferAsFloatBuffer.put(fArr[5]);
                        floatBufferAsFloatBuffer.put(f);
                        floatBufferAsFloatBuffer.put(1.0f);
                        floatBufferAsFloatBuffer.put(f10);
                        floatBufferAsFloatBuffer.put(fArr[6]);
                        floatBufferAsFloatBuffer.put(fArr[7]);
                        floatBufferAsFloatBuffer.put(1.0f);
                        floatBufferAsFloatBuffer.put(1.0f);
                        floatBufferAsFloatBuffer.put(f10);
                        int i19 = i17 + 4;
                        if (i16 != i15) {
                            floatBufferAsFloatBuffer.put(fArr[6]);
                            floatBufferAsFloatBuffer.put(fArr[7]);
                            floatBufferAsFloatBuffer.put(1.0f);
                            floatBufferAsFloatBuffer.put(1.0f);
                            floatBufferAsFloatBuffer.put(f10);
                            i17 += 5;
                        } else {
                            i17 = i19;
                        }
                        i16++;
                        i14 = i18;
                    }
                    floatBufferAsFloatBuffer.position(0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 20, (Buffer) floatBufferAsFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(0);
                    floatBufferAsFloatBuffer.position(2);
                    GLES20.glVertexAttribPointer(1, 2, 5126, true, 20, (Buffer) floatBufferAsFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(i3);
                    floatBufferAsFloatBuffer.position(4);
                    GLES20.glVertexAttribPointer(2, 1, 5126, true, 20, (Buffer) floatBufferAsFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(2);
                    i = 0;
                    GLES20.glDrawArrays(5, 0, i17);
                }
                i2 = 36160;
            }
            GLES20.glBindFramebuffer(i2, i);
            anonymousClass2 = this.delegate;
            if (anonymousClass2 != null) {
                anonymousClass2.contentChanged();
            }
            rectF = this.activeStrokeBounds;
            if (rectF != null) {
                rectF.union(rectF2);
            } else {
                this.activeStrokeBounds = rectF2;
            }
        }
        i = 0;
        i2 = 36160;
        GLES20.glBindFramebuffer(i2, i);
        anonymousClass2 = this.delegate;
        if (anonymousClass2 != null) {
            anonymousClass2.contentChanged();
        }
        rectF = this.activeStrokeBounds;
        if (rectF != null) {
            rectF.union(rectF2);
        } else {
            this.activeStrokeBounds = rectF2;
        }
    }

    public final Splitter registerUndo(RectF rectF, boolean z) {
        if (rectF == null) {
            return null;
        }
        Size size = this.size;
        if (!rectF.setIntersect(rectF, new RectF(0.0f, 0.0f, size.width, size.height))) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) getPaintingData(rectF, true, z, false).defaultPublishableKey;
        RenderView renderView = RenderView.this;
        Splitter splitter = new Splitter(byteBuffer, z ? 1 : 0, rectF);
        UndoStore undoStore = RenderView.this.undoStore;
        UUID uuidRandomUUID = UUID.randomUUID();
        undoStore.uuidToOperationMap.put(uuidRandomUUID, new Painting$$ExternalSyntheticLambda4(this, splitter, 1));
        undoStore.operations.add(uuidRandomUUID);
        undoStore.notifyOfHistoryChanges();
        return splitter;
    }

    public final void renderBlitPath(int i, Path path, float f) {
        Object textureLock;
        if (path == null) {
            return;
        }
        Brush brush = path.brush;
        if (brush == null) {
            brush = this.brush;
        }
        boolean z = this.masking && ((brush instanceof Brush.Radial) || (brush instanceof Brush.Eraser));
        Map map = this.shaders;
        StringBuilder sb = new StringBuilder();
        sb.append(brush.getShaderName(0));
        sb.append(z ? "_masking" : "");
        Shader shader = (Shader) map.get(sb.toString());
        if (shader == null) {
            return;
        }
        GLES20.glUseProgram(shader.program);
        GLES20.glUniformMatrix4fv(((Integer) shader.uniformsMap.get("mvpMatrix")).intValue(), 1, false, FloatBuffer.wrap(this.renderProjection));
        GLES20.glUniform1i(((Integer) shader.uniformsMap.get("texture")).intValue(), 0);
        GLES20.glUniform1i(((Integer) shader.uniformsMap.get("mask")).intValue(), 1);
        int i2 = path.color;
        Shader.SetColorUniform(((Integer) shader.uniformsMap.get("color")).intValue(), ColorUtils.setAlphaComponent(i2, (int) (brush.getOverrideAlpha() * Color.alpha(i2) * f)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, getTexture());
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i);
        if (z) {
            GLES20.glUniform1i(((Integer) shader.uniformsMap.get("otexture")).intValue(), 2);
            GLES20.glUniform1f(((Integer) shader.uniformsMap.get("preview")).intValue(), 0.4f);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.originalBitmapTexture.texture());
        }
        if (brush instanceof Brush.Blurer) {
            GLES20.glUniform1i(((Integer) shader.uniformsMap.get("blured")).intValue(), 2);
            GLES20.glActiveTexture(33986);
            BlurringShader.BlurManager blurManager = this.blurManager;
            if (blurManager != null) {
                textureLock = blurManager.getTextureLock();
                GLES20.glBindTexture(3553, this.blurManager.getTexture());
            } else {
                Texture texture = this.bluredTexture;
                if (texture != null) {
                    GLES20.glBindTexture(3553, texture.texture());
                }
                textureLock = null;
            }
        } else {
            textureLock = null;
        }
        Object obj = textureLock;
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.textureBuffer);
        GLES20.glEnableVertexAttribArray(1);
        if (obj != null) {
            synchronized (obj) {
                GLES20.glDrawArrays(5, 0, 4);
            }
        } else {
            GLES20.glDrawArrays(5, 0, 4);
        }
        Utils.HasGLError();
    }

    public final void renderBlitShape(int i, int i2, Shape shape, float f) {
        Shader shader;
        if (shape == null) {
            return;
        }
        Brush brush = this.brush;
        Brush.Shape shape2 = shape.brush;
        if (shape2 != null && i == this.helperTexture) {
            brush = shape2;
        }
        if (brush == null || this.renderView == null || (shader = (Shader) this.shaders.get(brush.getShaderName(0))) == null) {
            return;
        }
        GLES20.glUseProgram(shader.program);
        HashMap map = shader.uniformsMap;
        GLES20.glUniformMatrix4fv(((Integer) map.get("mvpMatrix")).intValue(), 1, false, FloatBuffer.wrap(this.renderProjection));
        GLES20.glUniform1i(((Integer) map.get("texture")).intValue(), 0);
        GLES20.glUniform1i(((Integer) map.get("mask")).intValue(), 1);
        int currentColor = this.renderView.getCurrentColor();
        Shader.SetColorUniform(((Integer) map.get("color")).intValue(), ColorUtils.setAlphaComponent(currentColor, (int) (Color.alpha(currentColor) * f)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i2);
        if (brush instanceof Brush.Shape) {
            GLES20.glUniform1i(((Integer) map.get("type")).intValue(), ((Brush.Shape) brush).getShapeShaderType());
            int iIntValue = ((Integer) map.get("resolution")).intValue();
            Size size = this.size;
            GLES20.glUniform2f(iIntValue, size.width, size.height);
            GLES20.glUniform2f(((Integer) map.get("center")).intValue(), shape.centerX, shape.centerY);
            GLES20.glUniform2f(((Integer) map.get("radius")).intValue(), shape.radiusX, shape.radiusY);
            GLES20.glUniform1f(((Integer) map.get("thickness")).intValue(), shape.thickness);
            GLES20.glUniform1f(((Integer) map.get("rounding")).intValue(), shape.rounding);
            GLES20.glUniform2f(((Integer) map.get("middle")).intValue(), shape.middleX, shape.middleY);
            GLES20.glUniform1f(((Integer) map.get("rotation")).intValue(), shape.rotation);
            GLES20.glUniform1i(((Integer) map.get("fill")).intValue(), shape.fill ? 1 : 0);
            GLES20.glUniform1f(((Integer) map.get("arrowTriangleLength")).intValue(), shape.arrowTriangleLength);
            GLES20.glUniform1i(((Integer) map.get("composite")).intValue(), 0);
            GLES20.glUniform1i(((Integer) map.get("clear")).intValue(), shape == this.helperShape ? 1 : 0);
        }
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.textureBuffer);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        Utils.HasGLError();
    }

    public final void restoreSliceInternal(Splitter splitter, boolean z) {
        ByteBuffer byteBuffer;
        File file;
        RenderView.AnonymousClass2 anonymousClass2;
        Texture texture;
        if (splitter == null) {
            return;
        }
        try {
            byte[] bArr = new byte[1024];
            byte[] bArr2 = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream((File) splitter.strategy);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Inflater inflater = new Inflater(true);
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i != -1) {
                    inflater.setInput(bArr, 0, i);
                }
                while (true) {
                    int iInflate = inflater.inflate(bArr2, 0, 1024);
                    if (iInflate == 0) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr2, 0, iInflate);
                    }
                }
                if (inflater.finished()) {
                    break;
                } else {
                    inflater.needsInput();
                }
            }
            inflater.end();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            byteArrayOutputStream.close();
            fileInputStream.close();
            byteBuffer = byteBufferWrap;
        } catch (Exception e) {
            FileLog.e(e);
            byteBuffer = null;
        }
        int texture2 = getTexture();
        if (splitter.limit == 1 && (texture = this.bitmapBlurTexture) != null) {
            texture2 = texture.texture();
        }
        GLES20.glBindTexture(3553, texture2);
        RectF rectF = (RectF) splitter.trimmer;
        GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) splitter.trimmer).height(), 6408, 5121, byteBuffer);
        if (this.suppressChangesCounter <= 0 && (anonymousClass2 = this.delegate) != null) {
            anonymousClass2.contentChanged();
        }
        if (!z || (file = (File) splitter.strategy) == null) {
            return;
        }
        file.delete();
        splitter.strategy = null;
    }

    public final void setBrush(Brush brush) {
        Bitmap bitmap;
        Bitmap resultBitmap;
        this.brush = brush;
        if ((brush instanceof Brush.Blurer) && (bitmap = this.imageBitmap) != null && this.blurManager == null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = this.imageBitmapRotation;
            if (i == 90 || i == 270 || i == -90) {
                height = width;
                width = height;
            }
            if (this.bluredBitmap == null) {
                this.bluredBitmap = Bitmap.createBitmap((int) (width / 8.0f), (int) (height / 8.0f), Bitmap.Config.ARGB_8888);
            }
            Canvas canvas = new Canvas(this.bluredBitmap);
            canvas.save();
            canvas.scale(0.125f, 0.125f);
            if (this.imageBitmapPaint != null) {
                this.imageBitmapPaint = new Paint(1);
            }
            canvas.save();
            canvas.rotate(i);
            if (i == 90) {
                canvas.translate(0.0f, -width);
            } else if (i == 180) {
                canvas.translate(-width, -height);
            } else if (i == 270) {
                canvas.translate(-height, 0.0f);
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.imageBitmapPaint);
            canvas.restore();
            RenderView renderView = this.renderView;
            if (renderView != null && (resultBitmap = renderView.getResultBitmap(false, false)) != null) {
                canvas.scale(width / resultBitmap.getWidth(), height / resultBitmap.getHeight());
                canvas.drawBitmap(resultBitmap, 0.0f, 0.0f, this.imageBitmapPaint);
                resultBitmap.recycle();
            }
            Utilities.stackBlurBitmap(this.bluredBitmap, (int) 8.0f);
            Texture texture = this.bluredTexture;
            if (texture != null) {
                texture.cleanResources(false);
            }
            this.bluredTexture = new Texture(this.bluredBitmap);
        }
    }
}
