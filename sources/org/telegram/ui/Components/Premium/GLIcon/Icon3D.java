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
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.camera.CameraView$VideoRecorder$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;

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
        String[] strArr2;
        float f;
        int i2;
        String str;
        String strPreprocessShader;
        int[] iArr;
        int iGlCreateShader;
        String strPreprocessShader2;
        int[] iArr2;
        int iGlCreateShader2;
        int i3;
        int i4;
        int i5;
        Bitmap bitmapDecodeStream;
        int[] iArr3;
        int i6;
        Bitmap bitmap;
        char c;
        ChatActivity.AnonymousClass117 anonymousClass117;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        DataInputStream dataInputStream;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        ArrayList arrayList4;
        float fFloatValue;
        int i19;
        float fFloatValue2;
        this.type = i;
        try {
            if (i == 1) {
                strArr = coinModel;
            } else if (i == 3) {
                strArr = dealModel;
            } else {
                if (i != 0 && i != 2) {
                    if (i == 4) {
                        strArr2 = diamondModel;
                        f = 8.0f;
                    } else {
                        strArr = new String[0];
                    }
                    int length = strArr2.length;
                    this.N = length;
                    this.mVertices = new FloatBuffer[length];
                    this.mTextures = new FloatBuffer[length];
                    this.mNormals = new FloatBuffer[length];
                    this.trianglesCount = new int[length];
                    for (i2 = 0; i2 < this.N; i2++) {
                        String str2 = strArr2[i2];
                        anonymousClass117 = new ChatActivity.AnonymousClass117();
                        arrayList = new ArrayList();
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList();
                        try {
                            try {
                                dataInputStream = new DataInputStream(context.getAssets().open(str2));
                                i7 = dataInputStream.readInt();
                                for (i8 = 0; i8 < i7; i8++) {
                                    try {
                                        arrayList.add(Float.valueOf(dataInputStream.readFloat()));
                                    } catch (IOException e) {
                                        e = e;
                                        e.printStackTrace();
                                        FloatBuffer[] floatBufferArr = this.mVertices;
                                        float[] fArr = (float[]) anonymousClass117.this$0;
                                        floatBufferArr[i2] = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(fArr.length * 4));
                                        this.mVertices[i2].put(fArr).position(0);
                                        FloatBuffer[] floatBufferArr2 = this.mTextures;
                                        float[] fArr2 = (float[]) anonymousClass117.val$finalReactionsLayout;
                                        floatBufferArr2[i2] = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(fArr2.length * 4));
                                        this.mTextures[i2].put(fArr2).position(0);
                                        FloatBuffer[] floatBufferArr3 = this.mNormals;
                                        float[] fArr3 = (float[]) anonymousClass117.val$primaryMessage;
                                        floatBufferArr3[i2] = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(fArr3.length * 4));
                                        this.mNormals[i2].put(fArr3).position(0);
                                        this.trianglesCount[i2] = fArr.length;
                                    }
                                }
                                i9 = dataInputStream.readInt();
                                for (i10 = 0; i10 < i9; i10++) {
                                    arrayList3.add(Float.valueOf(dataInputStream.readFloat()));
                                }
                                i11 = dataInputStream.readInt();
                                for (i12 = 0; i12 < i11; i12++) {
                                    arrayList2.add(Float.valueOf(dataInputStream.readFloat()));
                                }
                                i13 = dataInputStream.readInt();
                                int i20 = i13 * 3;
                                anonymousClass117.val$primaryMessage = new float[i20];
                                anonymousClass117.val$finalReactionsLayout = new float[i13 * 2];
                                anonymousClass117.this$0 = new float[i20];
                                i14 = 0;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                while (i14 < i13) {
                                    int i21 = dataInputStream.readInt() * 3;
                                    try {
                                        int i22 = i13;
                                        ((float[]) anonymousClass117.this$0)[i15] = ((Float) arrayList.get(i21)).floatValue() * f;
                                        int i23 = i15 + 2;
                                        ((float[]) anonymousClass117.this$0)[i15 + 1] = ((Float) arrayList.get(i21 + 1)).floatValue() * f;
                                        i15 += 3;
                                        ((float[]) anonymousClass117.this$0)[i23] = ((Float) arrayList.get(i21 + 2)).floatValue() * f;
                                        i18 = dataInputStream.readInt() * 2;
                                        float[] fArr4 = (float[]) anonymousClass117.val$finalReactionsLayout;
                                        int i24 = i16 + 1;
                                        if (i18 >= 0) {
                                            arrayList4 = arrayList;
                                            if (i18 >= arrayList3.size()) {
                                                fFloatValue = ((Float) arrayList3.get(i18)).floatValue();
                                            }
                                            fArr4[i16] = fFloatValue;
                                            i19 = i18 + 1;
                                            float[] fArr5 = (float[]) anonymousClass117.val$finalReactionsLayout;
                                            i16 += 2;
                                            if (i19 >= 0 || i19 >= arrayList3.size()) {
                                                fFloatValue2 = 0.0f;
                                            } else {
                                                fFloatValue2 = 1.0f - ((Float) arrayList3.get(i19)).floatValue();
                                            }
                                            fArr5[i24] = fFloatValue2;
                                            int i25 = dataInputStream.readInt() * 3;
                                            ((float[]) anonymousClass117.val$primaryMessage)[i17] = ((Float) arrayList2.get(i25)).floatValue();
                                            int i26 = i17 + 2;
                                            ((float[]) anonymousClass117.val$primaryMessage)[i17 + 1] = ((Float) arrayList2.get(i25 + 1)).floatValue();
                                            i17 += 3;
                                            ((float[]) anonymousClass117.val$primaryMessage)[i26] = ((Float) arrayList2.get(i25 + 2)).floatValue();
                                            i14++;
                                            arrayList = arrayList4;
                                            i13 = i22;
                                        } else {
                                            arrayList4 = arrayList;
                                        }
                                        fFloatValue = 0.0f;
                                        fArr4[i16] = fFloatValue;
                                        i19 = i18 + 1;
                                        float[] fArr6 = (float[]) anonymousClass117.val$finalReactionsLayout;
                                        i16 += 2;
                                        if (i19 >= 0) {
                                            fFloatValue2 = 0.0f;
                                        } else {
                                            fFloatValue2 = 0.0f;
                                        }
                                        fArr6[i24] = fFloatValue2;
                                        int i27 = dataInputStream.readInt() * 3;
                                        ((float[]) anonymousClass117.val$primaryMessage)[i17] = ((Float) arrayList2.get(i27)).floatValue();
                                        int i28 = i17 + 2;
                                        ((float[]) anonymousClass117.val$primaryMessage)[i17 + 1] = ((Float) arrayList2.get(i27 + 1)).floatValue();
                                        i17 += 3;
                                        ((float[]) anonymousClass117.val$primaryMessage)[i28] = ((Float) arrayList2.get(i27 + 2)).floatValue();
                                        i14++;
                                        arrayList = arrayList4;
                                        i13 = i22;
                                    } catch (IOException e2) {
                                        e = e2;
                                        e.printStackTrace();
                                        FloatBuffer[] floatBufferArr4 = this.mVertices;
                                        float[] fArr7 = (float[]) anonymousClass117.this$0;
                                        floatBufferArr4[i2] = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(fArr7.length * 4));
                                        this.mVertices[i2].put(fArr7).position(0);
                                        FloatBuffer[] floatBufferArr5 = this.mTextures;
                                        float[] fArr8 = (float[]) anonymousClass117.val$finalReactionsLayout;
                                        floatBufferArr5[i2] = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(fArr8.length * 4));
                                        this.mTextures[i2].put(fArr8).position(0);
                                        FloatBuffer[] floatBufferArr6 = this.mNormals;
                                        float[] fArr9 = (float[]) anonymousClass117.val$primaryMessage;
                                        floatBufferArr6[i2] = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(fArr9.length * 4));
                                        this.mNormals[i2].put(fArr9).position(0);
                                        this.trianglesCount[i2] = fArr7.length;
                                    }
                                }
                            } catch (IOException e3) {
                                e = e3;
                                e.printStackTrace();
                                FloatBuffer[] floatBufferArr7 = this.mVertices;
                                float[] fArr10 = (float[]) anonymousClass117.this$0;
                                floatBufferArr7[i2] = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(fArr10.length * 4));
                                this.mVertices[i2].put(fArr10).position(0);
                                FloatBuffer[] floatBufferArr8 = this.mTextures;
                                float[] fArr11 = (float[]) anonymousClass117.val$finalReactionsLayout;
                                floatBufferArr8[i2] = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(fArr11.length * 4));
                                this.mTextures[i2].put(fArr11).position(0);
                                FloatBuffer[] floatBufferArr9 = this.mNormals;
                                float[] fArr12 = (float[]) anonymousClass117.val$primaryMessage;
                                floatBufferArr9[i2] = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(fArr12.length * 4));
                                this.mNormals[i2].put(fArr12).position(0);
                                this.trianglesCount[i2] = fArr10.length;
                            }
                        } catch (IOException e4) {
                            e = e4;
                        }
                        FloatBuffer[] floatBufferArr10 = this.mVertices;
                        float[] fArr13 = (float[]) anonymousClass117.this$0;
                        floatBufferArr10[i2] = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(fArr13.length * 4));
                        this.mVertices[i2].put(fArr13).position(0);
                        FloatBuffer[] floatBufferArr11 = this.mTextures;
                        float[] fArr14 = (float[]) anonymousClass117.val$finalReactionsLayout;
                        floatBufferArr11[i2] = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(fArr14.length * 4));
                        this.mTextures[i2].put(fArr14).position(0);
                        FloatBuffer[] floatBufferArr12 = this.mNormals;
                        float[] fArr15 = (float[]) anonymousClass117.val$primaryMessage;
                        floatBufferArr12[i2] = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(fArr15.length * 4));
                        this.mNormals[i2].put(fArr15).position(0);
                        this.trianglesCount[i2] = fArr13.length;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setShader(new LinearGradient(0.0f, 100.0f, 150.0f, 0.0f, new int[]{Theme.getColor(null, Theme.key_premiumGradient1, false), Theme.getColor(null, Theme.key_premiumGradient2, false), Theme.getColor(null, Theme.key_premiumGradient3, false), Theme.getColor(null, Theme.key_premiumGradient4, false)}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP));
                    canvas.drawRect(0.0f, 0.0f, 100.0f, 100.0f, paint);
                    int[] iArr4 = new int[1];
                    GLES20.glGenTextures(1, iArr4, 0);
                    GLES20.glBindTexture(3553, iArr4[0]);
                    GLES20.glTexParameteri(3553, 10241, 9728);
                    GLES20.glTexParameteri(3553, 10240, 9728);
                    GLUtils.texImage2D(3553, 0, bitmapCreateBitmap, 0);
                    int[] iArr5 = new int[1];
                    if (i != 0 || i == 2) {
                        str = "shaders/fragment4.glsl";
                    } else {
                        str = i == 4 ? "shaders/fragment5.glsl" : "shaders/fragment3.glsl";
                    }
                    strPreprocessShader = preprocessShader(loadFromAsset(context, "shaders/vertex2.glsl"));
                    iArr = new int[1];
                    iGlCreateShader = GLES20.glCreateShader(35633);
                    if (iGlCreateShader == 0) {
                        iGlCreateShader = 0;
                    } else {
                        GLES20.glShaderSource(iGlCreateShader, strPreprocessShader);
                        GLES20.glCompileShader(iGlCreateShader);
                        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
                        if (iArr[0] == 0) {
                            throw new RuntimeException("Could not compile program: " + GLES20.glGetShaderInfoLog(iGlCreateShader) + " " + strPreprocessShader);
                        }
                    }
                    strPreprocessShader2 = preprocessShader(loadFromAsset(context, str));
                    iArr2 = new int[1];
                    iGlCreateShader2 = GLES20.glCreateShader(35632);
                    if (iGlCreateShader2 == 0) {
                        iGlCreateShader2 = 0;
                        i3 = 0;
                    } else {
                        GLES20.glShaderSource(iGlCreateShader2, strPreprocessShader2);
                        GLES20.glCompileShader(iGlCreateShader2);
                        i3 = 0;
                        GLES20.glGetShaderiv(iGlCreateShader2, 35713, iArr2, 0);
                        if (iArr2[0] == 0) {
                            throw new RuntimeException("Could not compile program: " + GLES20.glGetShaderInfoLog(iGlCreateShader2) + " " + strPreprocessShader2);
                        }
                    }
                    int iGlCreateProgram = GLES20.glCreateProgram();
                    GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
                    GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader2);
                    GLES20.glLinkProgram(iGlCreateProgram);
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr5, i3);
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
                    int i29 = this.N * 3;
                    int[] iArr6 = new int[i29];
                    this.buffers = iArr6;
                    i4 = 0;
                    GLES20.glGenBuffers(i29, iArr6, 0);
                    i5 = 0;
                    while (i5 < this.N) {
                        int i30 = i5 * 3;
                        GLES20.glBindBuffer(34962, this.buffers[i30]);
                        this.mTextures[i5].position(i4);
                        GLES20.glBufferData(34962, this.mTextures[i5].capacity() * 4, this.mTextures[i5], 35044);
                        GLES20.glEnableVertexAttribArray(this.mTextureCoordinateHandle);
                        this.mTextures[i5].clear();
                        GLES20.glBindBuffer(34962, this.buffers[i30 + 1]);
                        this.mNormals[i5].position(0);
                        GLES20.glBufferData(34962, this.mNormals[i5].capacity() * 4, this.mNormals[i5], 35044);
                        GLES20.glEnableVertexAttribArray(this.mNormalCoordinateHandle);
                        this.mNormals[i5].clear();
                        GLES20.glBindBuffer(34962, this.buffers[i30 + 2]);
                        this.mVertices[i5].position(0);
                        GLES20.glBufferData(34962, this.mVertices[i5].capacity() * 4, this.mVertices[i5], 35044);
                        GLES20.glEnableVertexAttribArray(this.mVerticesHandle);
                        this.mVertices[i5].clear();
                        i5++;
                        i4 = 0;
                    }
                    GLES20.glBindBuffer(34962, i4);
                    int[] iArr7 = new int[1];
                    GLES20.glGenTextures(1, iArr7, i4);
                    int i31 = iArr7[i4];
                    GLES20.glBindTexture(3553, i31);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glBindTexture(3553, i31);
                    bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open("flecks.png"));
                    iArr3 = new int[1];
                    GLES20.glGenTextures(1, iArr3, 0);
                    GLES20.glBindTexture(3553, iArr3[0]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLUtils.texImage2D(3553, 0, bitmapDecodeStream, 0);
                    bitmapDecodeStream.recycle();
                    int[] iArr8 = new int[1];
                    GLES20.glGenTextures(1, iArr8, 0);
                    int i32 = iArr8[0];
                    this.mBackgroundTextureHandle = i32;
                    GLES20.glBindTexture(3553, i32);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glBindTexture(3553, i32);
                    i6 = this.type;
                    if (i6 != 0 || i6 == 2) {
                        bitmap = SvgHelper.getBitmap(R.raw.start_texture, 240, 240, -1);
                    } else {
                        try {
                            if (i6 == 1) {
                                bitmap = BitmapFactory.decodeStream(context.getAssets().open("models/coin_border.png"));
                            } else if (i6 == 3) {
                                bitmap = BitmapFactory.decodeStream(context.getAssets().open("models/deal_border.png"));
                            } else {
                                bitmap = null;
                            }
                        } catch (IOException unused) {
                        }
                    }
                    if (bitmap != null) {
                        int[] iArr9 = new int[1];
                        c = 0;
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
                        GLES20.glBindTexture(3553, iArr3[0]);
                        GLES20.glUniform1i(this.mNormalMapUniformHandle, 1);
                    } else {
                        c = 0;
                    }
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, iArr8[c]);
                    GLES20.glUniform1i(this.mBackgroundTextureUniformHandle, 2);
                    if (this.type == 4) {
                        GLES20.glEnable(2884);
                        GLES20.glEnable(3042);
                        GLES20.glBlendFunc(770, 771);
                    }
                }
                strArr = starModel;
            }
            bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open("flecks.png"));
        } catch (IOException unused2) {
            bitmapDecodeStream = null;
        }
        strArr2 = strArr;
        f = 1.0f;
        int length2 = strArr2.length;
        this.N = length2;
        this.mVertices = new FloatBuffer[length2];
        this.mTextures = new FloatBuffer[length2];
        this.mNormals = new FloatBuffer[length2];
        this.trianglesCount = new int[length2];
        while (i2 < this.N) {
            String str3 = strArr2[i2];
            anonymousClass117 = new ChatActivity.AnonymousClass117();
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            dataInputStream = new DataInputStream(context.getAssets().open(str3));
            i7 = dataInputStream.readInt();
            while (i8 < i7) {
                arrayList.add(Float.valueOf(dataInputStream.readFloat()));
            }
            i9 = dataInputStream.readInt();
            while (i10 < i9) {
                arrayList3.add(Float.valueOf(dataInputStream.readFloat()));
            }
            i11 = dataInputStream.readInt();
            while (i12 < i11) {
                arrayList2.add(Float.valueOf(dataInputStream.readFloat()));
            }
            i13 = dataInputStream.readInt();
            int i210 = i13 * 3;
            anonymousClass117.val$primaryMessage = new float[i210];
            anonymousClass117.val$finalReactionsLayout = new float[i13 * 2];
            anonymousClass117.this$0 = new float[i210];
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
            while (i14 < i13) {
                int i211 = dataInputStream.readInt() * 3;
                int i212 = i13;
                ((float[]) anonymousClass117.this$0)[i15] = ((Float) arrayList.get(i211)).floatValue() * f;
                int i213 = i15 + 2;
                ((float[]) anonymousClass117.this$0)[i15 + 1] = ((Float) arrayList.get(i211 + 1)).floatValue() * f;
                i15 += 3;
                ((float[]) anonymousClass117.this$0)[i213] = ((Float) arrayList.get(i211 + 2)).floatValue() * f;
                i18 = dataInputStream.readInt() * 2;
                float[] fArr16 = (float[]) anonymousClass117.val$finalReactionsLayout;
                int i214 = i16 + 1;
                if (i18 >= 0) {
                    arrayList4 = arrayList;
                    if (i18 >= arrayList3.size()) {
                        fFloatValue = ((Float) arrayList3.get(i18)).floatValue();
                    }
                    fArr16[i16] = fFloatValue;
                    i19 = i18 + 1;
                    float[] fArr17 = (float[]) anonymousClass117.val$finalReactionsLayout;
                    i16 += 2;
                    if (i19 >= 0) {
                        fFloatValue2 = 0.0f;
                    } else {
                        fFloatValue2 = 0.0f;
                    }
                    fArr17[i214] = fFloatValue2;
                    int i215 = dataInputStream.readInt() * 3;
                    ((float[]) anonymousClass117.val$primaryMessage)[i17] = ((Float) arrayList2.get(i215)).floatValue();
                    int i216 = i17 + 2;
                    ((float[]) anonymousClass117.val$primaryMessage)[i17 + 1] = ((Float) arrayList2.get(i215 + 1)).floatValue();
                    i17 += 3;
                    ((float[]) anonymousClass117.val$primaryMessage)[i216] = ((Float) arrayList2.get(i215 + 2)).floatValue();
                    i14++;
                    arrayList = arrayList4;
                    i13 = i212;
                } else {
                    arrayList4 = arrayList;
                }
                fFloatValue = 0.0f;
                fArr16[i16] = fFloatValue;
                i19 = i18 + 1;
                float[] fArr18 = (float[]) anonymousClass117.val$finalReactionsLayout;
                i16 += 2;
                if (i19 >= 0) {
                    fFloatValue2 = 0.0f;
                } else {
                    fFloatValue2 = 0.0f;
                }
                fArr18[i214] = fFloatValue2;
                int i217 = dataInputStream.readInt() * 3;
                ((float[]) anonymousClass117.val$primaryMessage)[i17] = ((Float) arrayList2.get(i217)).floatValue();
                int i218 = i17 + 2;
                ((float[]) anonymousClass117.val$primaryMessage)[i17 + 1] = ((Float) arrayList2.get(i217 + 1)).floatValue();
                i17 += 3;
                ((float[]) anonymousClass117.val$primaryMessage)[i218] = ((Float) arrayList2.get(i217 + 2)).floatValue();
                i14++;
                arrayList = arrayList4;
                i13 = i212;
            }
            FloatBuffer[] floatBufferArr13 = this.mVertices;
            float[] fArr19 = (float[]) anonymousClass117.this$0;
            floatBufferArr13[i2] = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(fArr19.length * 4));
            this.mVertices[i2].put(fArr19).position(0);
            FloatBuffer[] floatBufferArr14 = this.mTextures;
            float[] fArr110 = (float[]) anonymousClass117.val$finalReactionsLayout;
            floatBufferArr14[i2] = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(fArr110.length * 4));
            this.mTextures[i2].put(fArr110).position(0);
            FloatBuffer[] floatBufferArr15 = this.mNormals;
            float[] fArr111 = (float[]) anonymousClass117.val$primaryMessage;
            floatBufferArr15[i2] = CameraView$VideoRecorder$$ExternalSyntheticOutline0.m(ByteBuffer.allocateDirect(fArr111.length * 4));
            this.mNormals[i2].put(fArr111).position(0);
            this.trianglesCount[i2] = fArr19.length;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        Paint paint2 = new Paint();
        paint2.setShader(new LinearGradient(0.0f, 100.0f, 150.0f, 0.0f, new int[]{Theme.getColor(null, Theme.key_premiumGradient1, false), Theme.getColor(null, Theme.key_premiumGradient2, false), Theme.getColor(null, Theme.key_premiumGradient3, false), Theme.getColor(null, Theme.key_premiumGradient4, false)}, new float[]{0.0f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP));
        canvas2.drawRect(0.0f, 0.0f, 100.0f, 100.0f, paint2);
        int[] iArr10 = new int[1];
        GLES20.glGenTextures(1, iArr10, 0);
        GLES20.glBindTexture(3553, iArr10[0]);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLUtils.texImage2D(3553, 0, bitmapCreateBitmap2, 0);
        int[] iArr11 = new int[1];
        if (i != 0) {
            str = "shaders/fragment4.glsl";
        } else {
            str = "shaders/fragment4.glsl";
        }
        strPreprocessShader = preprocessShader(loadFromAsset(context, "shaders/vertex2.glsl"));
        iArr = new int[1];
        iGlCreateShader = GLES20.glCreateShader(35633);
        if (iGlCreateShader == 0) {
            iGlCreateShader = 0;
        } else {
            GLES20.glShaderSource(iGlCreateShader, strPreprocessShader);
            GLES20.glCompileShader(iGlCreateShader);
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                throw new RuntimeException("Could not compile program: " + GLES20.glGetShaderInfoLog(iGlCreateShader) + " " + strPreprocessShader);
            }
        }
        strPreprocessShader2 = preprocessShader(loadFromAsset(context, str));
        iArr2 = new int[1];
        iGlCreateShader2 = GLES20.glCreateShader(35632);
        if (iGlCreateShader2 == 0) {
            iGlCreateShader2 = 0;
            i3 = 0;
        } else {
            GLES20.glShaderSource(iGlCreateShader2, strPreprocessShader2);
            GLES20.glCompileShader(iGlCreateShader2);
            i3 = 0;
            GLES20.glGetShaderiv(iGlCreateShader2, 35713, iArr2, 0);
            if (iArr2[0] == 0) {
                throw new RuntimeException("Could not compile program: " + GLES20.glGetShaderInfoLog(iGlCreateShader2) + " " + strPreprocessShader2);
            }
        }
        int iGlCreateProgram2 = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram2, iGlCreateShader);
        GLES20.glAttachShader(iGlCreateProgram2, iGlCreateShader2);
        GLES20.glLinkProgram(iGlCreateProgram2);
        GLES20.glGetProgramiv(iGlCreateProgram2, 35714, iArr11, i3);
        this.mProgramObject = iGlCreateProgram2;
        GLES20.glUseProgram(iGlCreateProgram2);
        this.mVerticesHandle = GLES20.glGetAttribLocation(iGlCreateProgram2, "vPosition");
        this.mTextureCoordinateHandle = GLES20.glGetAttribLocation(iGlCreateProgram2, "a_TexCoordinate");
        this.mNormalCoordinateHandle = GLES20.glGetAttribLocation(iGlCreateProgram2, "a_Normal");
        this.mTextureUniformHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "u_Texture");
        this.mNormalMapUniformHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "u_NormalMap");
        this.mBackgroundTextureUniformHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "u_BackgroundTexture");
        this.xOffsetHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "f_xOffset");
        this.alphaHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "f_alpha");
        this.mMVPMatrixHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "uMVPMatrix");
        this.mWorldMatrixHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "world");
        this.whiteHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "white");
        this.goldenHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "golden");
        this.specHandleTop = GLES20.glGetUniformLocation(iGlCreateProgram2, "spec1");
        this.specHandleBottom = GLES20.glGetUniformLocation(iGlCreateProgram2, "spec2");
        this.diffuseHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "u_diffuse");
        this.gradientColor1Handle = GLES20.glGetUniformLocation(iGlCreateProgram2, "gradientColor1");
        this.gradientColor2Handle = GLES20.glGetUniformLocation(iGlCreateProgram2, "gradientColor2");
        this.normalSpecColorHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "normalSpecColor");
        this.normalSpecHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "normalSpec");
        this.specColorHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "specColor");
        this.resolutionHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "resolution");
        this.gradientPositionHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "gradientPosition");
        this.modelIndexHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "modelIndex");
        this.modelIndex2Handle = GLES20.glGetUniformLocation(iGlCreateProgram2, "modelIndex2");
        this.behindHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "behind");
        this.typeHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "type");
        this.nightHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "night");
        this.timeHandle = GLES20.glGetUniformLocation(iGlCreateProgram2, "time");
        int i219 = this.N * 3;
        int[] iArr12 = new int[i219];
        this.buffers = iArr12;
        i4 = 0;
        GLES20.glGenBuffers(i219, iArr12, 0);
        i5 = 0;
        while (i5 < this.N) {
            int i33 = i5 * 3;
            GLES20.glBindBuffer(34962, this.buffers[i33]);
            this.mTextures[i5].position(i4);
            GLES20.glBufferData(34962, this.mTextures[i5].capacity() * 4, this.mTextures[i5], 35044);
            GLES20.glEnableVertexAttribArray(this.mTextureCoordinateHandle);
            this.mTextures[i5].clear();
            GLES20.glBindBuffer(34962, this.buffers[i33 + 1]);
            this.mNormals[i5].position(0);
            GLES20.glBufferData(34962, this.mNormals[i5].capacity() * 4, this.mNormals[i5], 35044);
            GLES20.glEnableVertexAttribArray(this.mNormalCoordinateHandle);
            this.mNormals[i5].clear();
            GLES20.glBindBuffer(34962, this.buffers[i33 + 2]);
            this.mVertices[i5].position(0);
            GLES20.glBufferData(34962, this.mVertices[i5].capacity() * 4, this.mVertices[i5], 35044);
            GLES20.glEnableVertexAttribArray(this.mVerticesHandle);
            this.mVertices[i5].clear();
            i5++;
            i4 = 0;
        }
        GLES20.glBindBuffer(34962, i4);
        int[] iArr13 = new int[1];
        GLES20.glGenTextures(1, iArr13, i4);
        int i34 = iArr13[i4];
        GLES20.glBindTexture(3553, i34);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindTexture(3553, i34);
        iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        GLES20.glBindTexture(3553, iArr3[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, bitmapDecodeStream, 0);
        bitmapDecodeStream.recycle();
        int[] iArr14 = new int[1];
        GLES20.glGenTextures(1, iArr14, 0);
        int i35 = iArr14[0];
        this.mBackgroundTextureHandle = i35;
        GLES20.glBindTexture(3553, i35);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glBindTexture(3553, i35);
        i6 = this.type;
        if (i6 != 0) {
            bitmap = SvgHelper.getBitmap(R.raw.start_texture, 240, 240, -1);
        } else {
            bitmap = SvgHelper.getBitmap(R.raw.start_texture, 240, 240, -1);
        }
        if (bitmap != null) {
            int[] iArr15 = new int[1];
            c = 0;
            GLES20.glGenTextures(1, iArr15, 0);
            GLES20.glBindTexture(3553, iArr15[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            bitmap.recycle();
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr15[0]);
            GLES20.glUniform1i(this.mTextureUniformHandle, 0);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, iArr3[0]);
            GLES20.glUniform1i(this.mNormalMapUniformHandle, 1);
        } else {
            c = 0;
        }
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, iArr14[c]);
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
