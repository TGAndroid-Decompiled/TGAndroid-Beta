package org.telegram.ui.Components.Premium.GLIcon;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.zxing.Result;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.ActionBar.Theme;

public final class Icon3D {
    public final int N;
    public final int alphaHandle;
    public Bitmap backgroundBitmap;
    public final int behindHandle;
    public final int[] buffers;
    public final int diffuseHandle;
    public final int goldenHandle;
    public int gradientColor1;
    public final int gradientColor1Handle;
    public int gradientColor2;
    public final int gradientColor2Handle;
    public final int gradientPositionHandle;
    public final int mBackgroundTextureHandle;
    public final int mBackgroundTextureUniformHandle;
    public final int mMVPMatrixHandle;
    public final int mNormalCoordinateHandle;
    public final int mNormalMapUniformHandle;
    public final FloatBuffer[] mNormals;
    public final int mProgramObject;
    public final int mTextureCoordinateHandle;
    public final int mTextureUniformHandle;
    public final FloatBuffer[] mTextures;
    public final FloatBuffer[] mVertices;
    public final int mVerticesHandle;
    public final int mWorldMatrixHandle;
    public final int modelIndex2Handle;
    public final int modelIndexHandle;
    public boolean night;
    public final int nightHandle;
    public final int normalSpecColorHandle;
    public final int normalSpecHandle;
    public final int resolutionHandle;
    public final int specColorHandle;
    public final int specHandleBottom;
    public final int specHandleTop;
    public final int timeHandle;
    public final int[] trianglesCount;
    public final int type;
    public final int typeHandle;
    public final int whiteHandle;
    public float xOffset;
    public final int xOffsetHandle;
    public static final String[] starModel = {"models/star.binobj"};
    public static final String[] diamondModel = {"models/diamond_outer_2.binobj", "models/diamond_outer.binobj", "models/diamond.binobj"};
    public static final String[] coinModel = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/coin_logo.binobj", "models/coin_stars.binobj"};
    public static final String[] dealModel = {"models/coin_outer.binobj", "models/coin_inner.binobj", "models/deal_logo.binobj", "models/coin_stars.binobj"};
    public float enterAlpha = 0.0f;
    public float spec1 = 2.0f;
    public float spec2 = 0.13f;
    public float diffuse = 1.0f;
    public float normalSpec = 0.2f;
    public int normalSpecColor = -1;
    public int specColor = -1;
    public float time = 0.0f;

    public Icon3D(Context context, int i) {
        String[] strArr;
        Bitmap bitmapDecodeStream;
        Bitmap bitmap;
        float f = 1.0f;
        this.type = i;
        if (i == 1) {
            strArr = coinModel;
        } else if (i == 3) {
            strArr = dealModel;
        } else if (i == 0 || i == 2) {
            strArr = starModel;
        } else if (i == 4) {
            strArr = diamondModel;
            f = 8.0f;
        } else {
            strArr = new String[0];
        }
        int length = strArr.length;
        this.N = length;
        this.mVertices = new FloatBuffer[length];
        this.mTextures = new FloatBuffer[length];
        this.mNormals = new FloatBuffer[length];
        this.trianglesCount = new int[length];
        for (int i2 = 0; i2 < this.N; i2++) {
            Result result = new Result(context, strArr[i2], f);
            FloatBuffer[] floatBufferArr = this.mVertices;
            float[] fArr = (float[]) result.resultMetadata;
            floatBufferArr[i2] = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.mVertices[i2].put(fArr).position(0);
            FloatBuffer[] floatBufferArr2 = this.mTextures;
            float[] fArr2 = (float[]) result.resultPoints;
            floatBufferArr2[i2] = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.mTextures[i2].put(fArr2).position(0);
            FloatBuffer[] floatBufferArr3 = this.mNormals;
            float[] fArr3 = (float[]) result.text;
            floatBufferArr3[i2] = ByteBuffer.allocateDirect(fArr3.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.mNormals[i2].put(fArr3).position(0);
            this.trianglesCount[i2] = fArr.length;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, 100.0f, 150.0f, 0.0f, new int[]{Theme.getColor(null, Theme.key_premiumGradient1, false), Theme.getColor(null, Theme.key_premiumGradient2, false), Theme.getColor(null, Theme.key_premiumGradient3, false), Theme.getColor(null, Theme.key_premiumGradient4, false)}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, 100.0f, 100.0f, paint);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLUtils.texImage2D(3553, 0, bitmapCreateBitmap, 0);
        int[] iArr2 = new int[1];
        String str = (i == 0 || i == 2) ? "shaders/fragment4.glsl" : i == 4 ? "shaders/fragment5.glsl" : "shaders/fragment3.glsl";
        String strPreprocessShader = preprocessShader(loadFromAsset(context, "shaders/vertex2.glsl"));
        int[] iArr3 = new int[1];
        int iGlCreateShader = GLES20.glCreateShader(35633);
        if (iGlCreateShader == 0) {
            iGlCreateShader = 0;
        } else {
            GLES20.glShaderSource(iGlCreateShader, strPreprocessShader);
            GLES20.glCompileShader(iGlCreateShader);
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr3, 0);
            if (iArr3[0] == 0) {
                throw new RuntimeException("Could not compile program: " + GLES20.glGetShaderInfoLog(iGlCreateShader) + " " + strPreprocessShader);
            }
        }
        String strPreprocessShader2 = preprocessShader(loadFromAsset(context, str));
        int[] iArr4 = new int[1];
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        if (iGlCreateShader2 == 0) {
            iGlCreateShader2 = 0;
        } else {
            GLES20.glShaderSource(iGlCreateShader2, strPreprocessShader2);
            GLES20.glCompileShader(iGlCreateShader2);
            GLES20.glGetShaderiv(iGlCreateShader2, 35713, iArr4, 0);
            if (iArr4[0] == 0) {
                throw new RuntimeException("Could not compile program: " + GLES20.glGetShaderInfoLog(iGlCreateShader2) + " " + strPreprocessShader2);
            }
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader2);
        GLES20.glLinkProgram(iGlCreateProgram);
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
        this.mProgramObject = iGlCreateProgram;
        GLES20.glUseProgram(iGlCreateProgram);
        this.mVerticesHandle = GLES20.glGetAttribLocation(iGlCreateProgram, "vPosition");
        this.mTextureCoordinateHandle = GLES20.glGetAttribLocation(iGlCreateProgram, "a_TexCoordinate");
        this.mNormalCoordinateHandle = GLES20.glGetAttribLocation(iGlCreateProgram, "a_Normal");
        this.mTextureUniformHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "u_Texture");
        this.mNormalMapUniformHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "u_NormalMap");
        this.mBackgroundTextureUniformHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "u_BackgroundTexture");
        this.xOffsetHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "f_xOffset");
        this.alphaHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "f_alpha");
        this.mMVPMatrixHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "uMVPMatrix");
        this.mWorldMatrixHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "world");
        this.whiteHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "white");
        this.goldenHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "golden");
        this.specHandleTop = GLES20.glGetUniformLocation(iGlCreateProgram, "spec1");
        this.specHandleBottom = GLES20.glGetUniformLocation(iGlCreateProgram, "spec2");
        this.diffuseHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "u_diffuse");
        this.gradientColor1Handle = GLES20.glGetUniformLocation(iGlCreateProgram, "gradientColor1");
        this.gradientColor2Handle = GLES20.glGetUniformLocation(iGlCreateProgram, "gradientColor2");
        this.normalSpecColorHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "normalSpecColor");
        this.normalSpecHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "normalSpec");
        this.specColorHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "specColor");
        this.resolutionHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "resolution");
        this.gradientPositionHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "gradientPosition");
        this.modelIndexHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "modelIndex");
        this.modelIndex2Handle = GLES20.glGetUniformLocation(iGlCreateProgram, "modelIndex2");
        this.behindHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "behind");
        this.typeHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "type");
        this.nightHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "night");
        this.timeHandle = GLES20.glGetUniformLocation(iGlCreateProgram, "time");
        int i3 = this.N * 3;
        int[] iArr5 = new int[i3];
        this.buffers = iArr5;
        GLES20.glGenBuffers(i3, iArr5, 0);
        for (int i4 = 0; i4 < this.N; i4++) {
            int i5 = i4 * 3;
            GLES20.glBindBuffer(34962, this.buffers[i5]);
            this.mTextures[i4].position(0);
            GLES20.glBufferData(34962, this.mTextures[i4].capacity() * 4, this.mTextures[i4], 35044);
            GLES20.glEnableVertexAttribArray(this.mTextureCoordinateHandle);
            this.mTextures[i4].clear();
            GLES20.glBindBuffer(34962, this.buffers[i5 + 1]);
            this.mNormals[i4].position(0);
            GLES20.glBufferData(34962, this.mNormals[i4].capacity() * 4, this.mNormals[i4], 35044);
            GLES20.glEnableVertexAttribArray(this.mNormalCoordinateHandle);
            this.mNormals[i4].clear();
            GLES20.glBindBuffer(34962, this.buffers[i5 + 2]);
            this.mVertices[i4].position(0);
            GLES20.glBufferData(34962, this.mVertices[i4].capacity() * 4, this.mVertices[i4], 35044);
            GLES20.glEnableVertexAttribArray(this.mVerticesHandle);
            this.mVertices[i4].clear();
        }
        GLES20.glBindBuffer(34962, 0);
        int[] iArr6 = new int[1];
        GLES20.glGenTextures(1, iArr6, 0);
        int i6 = iArr6[0];
        GLES20.glBindTexture(3553, i6);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindTexture(3553, i6);
        try {
            bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open("flecks.png"));
        } catch (IOException unused) {
            bitmapDecodeStream = null;
        }
        int[] iArr7 = new int[1];
        GLES20.glGenTextures(1, iArr7, 0);
        GLES20.glBindTexture(3553, iArr7[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, bitmapDecodeStream, 0);
        bitmapDecodeStream.recycle();
        int[] iArr8 = new int[1];
        GLES20.glGenTextures(1, iArr8, 0);
        int i7 = iArr8[0];
        this.mBackgroundTextureHandle = i7;
        GLES20.glBindTexture(3553, i7);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindTexture(3553, i7);
        int i8 = this.type;
        if (i8 == 0 || i8 == 2) {
            bitmap = SvgHelper.getBitmap(R.raw.start_texture, 240, 240, -1);
        } else {
            try {
                if (i8 == 1) {
                    bitmap = BitmapFactory.decodeStream(context.getAssets().open("models/coin_border.png"));
                } else if (i8 == 3) {
                    bitmap = BitmapFactory.decodeStream(context.getAssets().open("models/deal_border.png"));
                } else {
                    bitmap = null;
                }
            } catch (IOException unused2) {
            }
        }
        if (bitmap != null) {
            int[] iArr9 = new int[1];
            GLES20.glGenTextures(1, iArr9, 0);
            GLES20.glBindTexture(3553, iArr9[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            bitmap.recycle();
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr9[0]);
            GLES20.glUniform1i(this.mTextureUniformHandle, 0);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, iArr7[0]);
            GLES20.glUniform1i(this.mNormalMapUniformHandle, 1);
        }
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, iArr8[0]);
        GLES20.glUniform1i(this.mBackgroundTextureUniformHandle, 2);
        if (this.type == 4) {
            GLES20.glEnable(2884);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
        }
    }

    public static String loadFromAsset(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, StandardCharsets.UTF_8));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append("\n");
            }
            bufferedReader.close();
            inputStreamOpen.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static String preprocessShader(String str) {
        Matcher matcher = Pattern.compile("RGB#([0-9a-fA-F]{6})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            matcher.appendReplacement(stringBuffer, String.format(Locale.US, "vec3(%.3f, %.3f, %.3f)", Double.valueOf(((double) Integer.parseInt(strGroup.substring(0, 2), 16)) / 255.0d), Double.valueOf(((double) Integer.parseInt(strGroup.substring(2, 4), 16)) / 255.0d), Double.valueOf(((double) Integer.parseInt(strGroup.substring(4, 6), 16)) / 255.0d)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public final void drawModel(int i, boolean z) {
        int i2 = i * 3;
        int[] iArr = this.buffers;
        GLES20.glBindBuffer(34962, iArr[i2]);
        GLES20.glVertexAttribPointer(this.mTextureCoordinateHandle, 2, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, iArr[i2 + 1]);
        GLES20.glVertexAttribPointer(this.mNormalCoordinateHandle, 3, 5126, false, 0, 0);
        GLES20.glBindBuffer(34962, iArr[i2 + 2]);
        GLES20.glVertexAttribPointer(this.mVerticesHandle, 3, 5126, false, 0, 0);
        GLES20.glUniform1i(this.modelIndexHandle, i);
        GLES20.glUniform1i(this.modelIndex2Handle, i);
        GLES20.glUniform1i(this.behindHandle, z ? 1 : 0);
        GLES20.glUniform1i(this.typeHandle, this.type);
        GLES20.glDrawArrays(4, 0, this.trianglesCount[i] / 3);
    }
}
