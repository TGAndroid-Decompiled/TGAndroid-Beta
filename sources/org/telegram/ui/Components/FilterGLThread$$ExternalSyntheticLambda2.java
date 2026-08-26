package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Looper;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.FloatBuffer;

public final class FilterGLThread$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final FilterGLThread f$0;

    public FilterGLThread$$ExternalSyntheticLambda2(FilterGLThread filterGLThread, int i) {
        this.$r8$classId = i;
        this.f$0 = filterGLThread;
    }

    @Override
    public final void run() {
        FilterShaders.FilterShadersDelegate filterShadersDelegate;
        switch (this.$r8$classId) {
            case 0:
                this.f$0.finish();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    looperMyLooper.quit();
                }
                break;
            case 1:
                FilterGLThread filterGLThread = this.f$0;
                if (filterGLThread.initied) {
                    filterGLThread.makeCurrentContext();
                    if (filterGLThread.updateSurface) {
                        filterGLThread.videoSurfaceTexture.updateTexImage();
                        filterGLThread.videoSurfaceTexture.getTransformMatrix(filterGLThread.videoTextureMatrix);
                        filterGLThread.setRenderData();
                        filterGLThread.updateSurface = false;
                        FilterShaders filterShaders = filterGLThread.filterShaders;
                        filterShaders.videoMatrix = filterGLThread.videoTextureMatrix;
                        filterShaders.hsvGenerated = false;
                        filterGLThread.videoFrameAvailable = true;
                    }
                    if (filterGLThread.renderDataSet) {
                        if (filterGLThread.isVideo && ((filterShadersDelegate = filterGLThread.filterShaders.delegate) == null || filterShadersDelegate.shouldShowOriginal())) {
                            GLES20.glViewport(0, 0, filterGLThread.surfaceWidth, filterGLThread.surfaceHeight);
                            GLES20.glBindFramebuffer(36160, 0);
                            GLES20.glUseProgram(filterGLThread.simpleOESShaderProgram);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(36197, filterGLThread.videoTexture[0]);
                            GLES20.glUniform1i(filterGLThread.simpleOESSourceImageHandle, 0);
                            GLES20.glEnableVertexAttribArray(filterGLThread.simpleOESInputTexCoordHandle);
                            int i = filterGLThread.simpleOESInputTexCoordHandle;
                            FloatBuffer floatBuffer = filterGLThread.textureBuffer;
                            if (floatBuffer == null) {
                                floatBuffer = filterGLThread.filterShaders.textureBuffer;
                            }
                            GLES20.glVertexAttribPointer(i, 2, 5126, false, 8, (Buffer) floatBuffer);
                            GLES20.glEnableVertexAttribArray(filterGLThread.simpleOESPositionHandle);
                            GLES20.glVertexAttribPointer(filterGLThread.simpleOESPositionHandle, 2, 5126, false, 8, (Buffer) filterGLThread.filterShaders.vertexInvertBuffer);
                            GLES20.glUniformMatrix4fv(filterGLThread.simpleOESMatrixHandle, 1, false, filterGLThread.videoTextureMatrix, 0);
                            GLES20.glDrawArrays(5, 0, 4);
                            filterGLThread.egl10.eglSwapBuffers(filterGLThread.eglDisplay, filterGLThread.eglSurface);
                            BlurringShader blurringShader = filterGLThread.uiBlur;
                            if (blurringShader != null) {
                                blurringShader.draw(filterGLThread.videoTextureMatrix, filterGLThread.videoTexture[0], filterGLThread.videoWidth, filterGLThread.videoHeight);
                            }
                        } else {
                            if (filterGLThread.videoDelegate == null || filterGLThread.videoFrameAvailable) {
                                GLES20.glViewport(0, 0, filterGLThread.renderBufferWidth, filterGLThread.renderBufferHeight);
                                filterGLThread.filterShaders.drawSkinSmoothPass();
                                filterGLThread.filterShaders.drawEnhancePass();
                                if (filterGLThread.videoDelegate == null) {
                                    filterGLThread.filterShaders.drawSharpenPass();
                                }
                                filterGLThread.filterShaders.drawCustomParamsPass();
                                filterGLThread.blurred = filterGLThread.filterShaders.drawBlurPass();
                                filterGLThread.filterTextureAvailable = true;
                            }
                            if (filterGLThread.filterTextureAvailable) {
                                GLES20.glViewport(0, 0, filterGLThread.surfaceWidth, filterGLThread.surfaceHeight);
                                GLES20.glBindFramebuffer(36160, 0);
                                int renderTexture = filterGLThread.filterShaders.getRenderTexture(1 ^ (filterGLThread.blurred ? 1 : 0));
                                GLES20.glUseProgram(filterGLThread.simpleShaderProgram);
                                GLES20.glActiveTexture(33984);
                                GLES20.glBindTexture(3553, renderTexture);
                                GLES20.glUniform1i(filterGLThread.simpleSourceImageHandle, 0);
                                GLES20.glEnableVertexAttribArray(filterGLThread.simpleInputTexCoordHandle);
                                int i2 = filterGLThread.simpleInputTexCoordHandle;
                                FloatBuffer floatBuffer2 = filterGLThread.textureBuffer;
                                if (floatBuffer2 == null) {
                                    floatBuffer2 = filterGLThread.filterShaders.textureBuffer;
                                }
                                GLES20.glVertexAttribPointer(i2, 2, 5126, false, 8, (Buffer) floatBuffer2);
                                GLES20.glEnableVertexAttribArray(filterGLThread.simplePositionHandle);
                                GLES20.glVertexAttribPointer(filterGLThread.simplePositionHandle, 2, 5126, false, 8, (Buffer) filterGLThread.filterShaders.vertexBuffer);
                                GLES20.glDrawArrays(5, 0, 4);
                                filterGLThread.egl10.eglSwapBuffers(filterGLThread.eglDisplay, filterGLThread.eglSurface);
                                BlurringShader blurringShader2 = filterGLThread.uiBlur;
                                if (blurringShader2 != null) {
                                    blurringShader2.draw(null, renderTexture, filterGLThread.renderBufferWidth, filterGLThread.renderBufferHeight);
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                FilterGLThread filterGLThread2 = this.f$0;
                SurfaceTexture surfaceTexture = filterGLThread2.videoSurfaceTexture;
                VideoEditTextureView videoEditTextureView = (VideoEditTextureView) filterGLThread2.videoDelegate.f$0;
                if (videoEditTextureView.currentVideoPlayer != null) {
                    videoEditTextureView.currentVideoPlayer.setSurface(new Surface(surfaceTexture));
                    break;
                }
                break;
        }
    }
}
