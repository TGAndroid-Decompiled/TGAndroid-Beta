package org.telegram.ui.Components.Premium.GLIcon;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import androidx.core.graphics.ColorUtils;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.Theme;

public final class GLIconRenderer implements GLSurfaceView.Renderer {
    public Bitmap backgroundBitmap;
    public int color1;
    public int color2;
    public final Context context;
    public float dt;
    public float golden;
    public float gradientScaleX;
    public float gradientScaleY;
    public float gradientStartX;
    public float gradientStartY;
    public boolean isDarkBackground;
    public int mHeight;
    public int mWidth;
    public Icon3D model;
    public boolean night;
    public final int style;
    public final int type;
    public float angleX = 0.0f;
    public float angleX2 = 0.0f;
    public float angleX3 = 0.0f;
    public float angleY = 0.0f;
    public float white = 0.0f;
    public final float[] mMVPMatrix = new float[16];
    public final float[] mProjectionMatrix = new float[16];
    public final float[] mViewMatrix = new float[16];
    public final float[] mRotationMatrix = new float[16];
    public int colorKey1 = Theme.key_premiumStarGradient1;
    public int colorKey2 = Theme.key_premiumStarGradient2;
    public final int goldenColorKey1 = Theme.key_starsGradient1;
    public final int goldenColorKey2 = Theme.key_starsGradient2;

    public GLIconRenderer(Context context, int i, int i2) {
        this.golden = 0.0f;
        this.context = context;
        this.style = i;
        this.type = i2;
        if (i2 == 2) {
            this.golden = 1.0f;
        }
        updateColors();
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        Matrix.setLookAtM(this.mViewMatrix, 0, 0.0f, this.type == 4 ? 40.0f : 0.0f, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr = this.mRotationMatrix;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, this.angleX2, 0.0f);
        Matrix.rotateM(this.mRotationMatrix, 0, -this.angleY, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.mRotationMatrix, 0, (-this.angleX) - this.angleX3, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.mMVPMatrix, 0, this.mViewMatrix, 0, this.mRotationMatrix, 0);
        float[] fArr2 = this.mMVPMatrix;
        Matrix.multiplyMM(fArr2, 0, this.mProjectionMatrix, 0, fArr2, 0);
        Icon3D icon3D = this.model;
        if (icon3D != null) {
            icon3D.night = this.night;
            icon3D.gradientColor1 = this.color1;
            icon3D.gradientColor2 = this.color2;
            int i = this.mWidth;
            int i2 = this.mHeight;
            float f = this.gradientStartX;
            float f2 = this.gradientScaleX;
            float f3 = this.gradientStartY;
            float f4 = this.gradientScaleY;
            float f5 = this.white;
            float f6 = this.golden;
            float f7 = this.dt;
            if (icon3D.backgroundBitmap != null) {
                GLES20.glBindTexture(3553, icon3D.mBackgroundTextureHandle);
                GLUtils.texImage2D(3553, 0, icon3D.backgroundBitmap, 0);
                icon3D.backgroundBitmap = null;
            }
            GLES20.glUniform1i(icon3D.mTextureUniformHandle, 0);
            GLES20.glUniform1f(icon3D.xOffsetHandle, icon3D.xOffset);
            GLES20.glUniform1f(icon3D.alphaHandle, icon3D.enterAlpha);
            GLES20.glUniform1f(icon3D.whiteHandle, f5);
            GLES20.glUniform1f(icon3D.goldenHandle, f6);
            GLES20.glUniformMatrix4fv(icon3D.mMVPMatrixHandle, 1, false, this.mMVPMatrix, 0);
            GLES20.glUniformMatrix4fv(icon3D.mWorldMatrixHandle, 1, false, fArr, 0);
            GLES20.glUniform1f(icon3D.specHandleTop, icon3D.spec1);
            GLES20.glUniform1f(icon3D.specHandleBottom, icon3D.spec2);
            GLES20.glUniform1f(icon3D.diffuseHandle, icon3D.diffuse);
            GLES20.glUniform1f(icon3D.normalSpecHandle, icon3D.normalSpec);
            GLES20.glUniform3f(icon3D.gradientColor1Handle, Color.red(icon3D.gradientColor1) / 255.0f, Color.green(icon3D.gradientColor1) / 255.0f, Color.blue(icon3D.gradientColor1) / 255.0f);
            GLES20.glUniform3f(icon3D.gradientColor2Handle, Color.red(icon3D.gradientColor2) / 255.0f, Color.green(icon3D.gradientColor2) / 255.0f, Color.blue(icon3D.gradientColor2) / 255.0f);
            GLES20.glUniform3f(icon3D.normalSpecColorHandle, Color.red(icon3D.normalSpecColor) / 255.0f, Color.green(icon3D.normalSpecColor) / 255.0f, Color.blue(icon3D.normalSpecColor) / 255.0f);
            GLES20.glUniform3f(icon3D.specColorHandle, Color.red(icon3D.specColor) / 255.0f, Color.green(icon3D.specColor) / 255.0f, Color.blue(icon3D.specColor) / 255.0f);
            GLES20.glUniform2f(icon3D.resolutionHandle, i, i2);
            GLES20.glUniform4f(icon3D.gradientPositionHandle, f, f2, f3, f4);
            GLES20.glUniform1i(icon3D.nightHandle, icon3D.night ? 1 : 0);
            float f8 = icon3D.time + f7;
            icon3D.time = f8;
            GLES20.glUniform1f(icon3D.timeHandle, f8);
            if (icon3D.type == 4) {
                icon3D.drawModel(0, true);
                GLES20.glClear(256);
                icon3D.drawModel(1, true);
                GLES20.glClear(256);
                icon3D.drawModel(2, false);
                icon3D.drawModel(1, false);
                icon3D.drawModel(0, false);
            } else {
                for (int i3 = 0; i3 < icon3D.N; i3++) {
                    icon3D.drawModel(i3, false);
                }
            }
            float f9 = icon3D.enterAlpha;
            if (f9 < 1.0f) {
                float f10 = f9 + 0.07272727f;
                icon3D.enterAlpha = f10;
                if (f10 > 1.0f) {
                    icon3D.enterAlpha = 1.0f;
                }
            }
            float f11 = icon3D.xOffset + 5.0E-4f;
            icon3D.xOffset = f11;
            if (f11 > 1.0f) {
                icon3D.xOffset = f11 - 1.0f;
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
        GLES20.glViewport(0, 0, i, i2);
        Matrix.perspectiveM(this.mProjectionMatrix, 0, this.type == 4 ? 12.0f : 53.13f, i / i2, 1.0f, 200.0f);
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        Icon3D icon3D = this.model;
        if (icon3D != null) {
            GLES20.glDeleteProgram(icon3D.mProgramObject);
        }
        Icon3D icon3D2 = new Icon3D(this.context, this.type);
        this.model = icon3D2;
        Bitmap bitmap = this.backgroundBitmap;
        if (bitmap != null) {
            icon3D2.backgroundBitmap = bitmap;
        }
        if (this.isDarkBackground) {
            icon3D2.spec1 = 1.0f;
            icon3D2.spec2 = 0.2f;
        }
    }

    public final void updateColors() {
        int i = Theme.key_dialogBackground;
        boolean z = false;
        this.night = ColorUtils.calculateLuminance(Theme.getColor(null, i, false)) < 0.5d;
        this.color1 = ColorUtils.blendARGB(this.golden, Theme.getColor(null, this.colorKey1, false), Theme.getColor(null, this.goldenColorKey1, false));
        this.color2 = ColorUtils.blendARGB(this.golden, Theme.getColor(null, this.colorKey2, false), Theme.getColor(null, this.goldenColorKey2, false));
        if (this.style == 1 && ColorUtils.calculateLuminance(Theme.getColor(null, i, false)) < 0.5d) {
            z = true;
        }
        this.isDarkBackground = z;
    }
}
