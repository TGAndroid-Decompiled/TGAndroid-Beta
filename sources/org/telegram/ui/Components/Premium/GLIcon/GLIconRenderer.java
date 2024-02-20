package org.telegram.ui.Components.Premium.GLIcon;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import androidx.core.graphics.ColorUtils;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.ui.ActionBar.Theme;
public class GLIconRenderer implements GLSurfaceView.Renderer {
    Bitmap backgroundBitmap;
    int color1;
    int color2;
    Context context;
    public float gradientScaleX;
    public float gradientScaleY;
    public float gradientStartX;
    public float gradientStartY;
    public boolean isDarkBackground;
    private int mHeight;
    private int mWidth;
    public Star3DIcon star;
    private final int style;
    public float angleX = 0.0f;
    public float angleX2 = 0.0f;
    public float angleY = 0.0f;
    private final float[] mMVPMatrix = new float[16];
    private final float[] mProjectionMatrix = new float[16];
    private final float[] mViewMatrix = new float[16];
    private final float[] mRotationMatrix = new float[16];
    public int colorKey1 = Theme.key_premiumStartGradient1;
    public int colorKey2 = Theme.key_premiumStartGradient2;

    public GLIconRenderer(Context context, int i) {
        this.context = context;
        this.style = i;
        updateColors();
    }

    public static int loadShader(int i, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        throw new RuntimeException("Could not compile program: " + GLES20.glGetShaderInfoLog(glCreateShader) + " " + str);
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        Star3DIcon star3DIcon = this.star;
        if (star3DIcon != null) {
            star3DIcon.destroy();
        }
        Star3DIcon star3DIcon2 = new Star3DIcon(this.context);
        this.star = star3DIcon2;
        Bitmap bitmap = this.backgroundBitmap;
        if (bitmap != null) {
            star3DIcon2.setBackground(bitmap);
        }
        if (this.isDarkBackground) {
            Star3DIcon star3DIcon3 = this.star;
            star3DIcon3.spec1 = 1.0f;
            star3DIcon3.spec2 = 0.2f;
        }
    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16640);
        GLES20.glEnable(2929);
        Matrix.setLookAtM(this.mViewMatrix, 0, 0.0f, 0.0f, 100.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.setIdentityM(this.mRotationMatrix, 0);
        Matrix.translateM(this.mRotationMatrix, 0, 0.0f, this.angleX2, 0.0f);
        Matrix.rotateM(this.mRotationMatrix, 0, -this.angleY, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(this.mRotationMatrix, 0, -this.angleX, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.mMVPMatrix, 0, this.mViewMatrix, 0, this.mRotationMatrix, 0);
        float[] fArr = this.mMVPMatrix;
        Matrix.multiplyMM(fArr, 0, this.mProjectionMatrix, 0, fArr, 0);
        Star3DIcon star3DIcon = this.star;
        if (star3DIcon != null) {
            star3DIcon.gradientColor1 = this.color1;
            star3DIcon.gradientColor2 = this.color2;
            star3DIcon.draw(this.mMVPMatrix, this.mRotationMatrix, this.mWidth, this.mHeight, this.gradientStartX, this.gradientScaleX, this.gradientStartY, this.gradientScaleY);
        }
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
        GLES20.glViewport(0, 0, i, i2);
        Matrix.perspectiveM(this.mProjectionMatrix, 0, 53.13f, i / i2, 1.0f, 200.0f);
    }

    public void setBackground(Bitmap bitmap) {
        Star3DIcon star3DIcon = this.star;
        if (star3DIcon != null) {
            star3DIcon.setBackground(bitmap);
        }
        this.backgroundBitmap = bitmap;
    }

    public void updateColors() {
        this.color1 = Theme.getColor(this.colorKey1);
        this.color2 = Theme.getColor(this.colorKey2);
        boolean z = true;
        this.isDarkBackground = (this.style != 1 || ColorUtils.calculateLuminance(Theme.getColor(Theme.key_dialogBackground)) >= 0.5d) ? false : false;
    }
}
