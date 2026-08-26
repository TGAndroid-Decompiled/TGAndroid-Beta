package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.web.MHTML;

public final class FilterShaders {
    public BlurProgram blurProgram;
    public boolean blurTextureCreated;
    public int boostInputTexCoordHandle;
    public int boostPositionHandle;
    public int boostProgram;
    public int boostSourceImageHandle;
    public ByteBuffer calcBuffer;
    public ByteBuffer cdtBuffer;
    public int compositeCurveImageHandle;
    public int compositeInputImageHandle;
    public int compositeInputTexCoordHandle;
    public int compositeMatrixHandle;
    public int compositeMixtureHandle;
    public int compositePositionHandle;
    public int compositeProgram;
    public int compositeSourceImageHandle;
    public int compositeTexSizeHandle;
    public int contrastHandle;
    public int curvesImageHandle;
    public FilterShadersDelegate delegate;
    public int enhanceInputImageTexture2Handle;
    public int enhanceInputTexCoordHandle;
    public int enhanceIntensityHandle;
    public int enhancePositionHandle;
    public int enhanceShaderProgram;
    public int enhanceSourceImageHandle;
    public int exposureHandle;
    public int fadeAmountHandle;
    public int grainHandle;
    public int greenAndBlueChannelOverlayInputTexCoordHandle;
    public int greenAndBlueChannelOverlayMatrixHandle;
    public int greenAndBlueChannelOverlayPositionHandle;
    public int greenAndBlueChannelOverlayProgram;
    public int greenAndBlueChannelOverlaySourceImageHandle;
    public int greenAndBlueChannelOverlayTexSizeHandle;
    public StoryEntry.HDRInfo hdrInfo;
    public int heightHandle;
    public int highPassInputImageHandle;
    public int highPassInputTexCoordHandle;
    public int highPassPositionHandle;
    public int highPassProgram;
    public int highPassSourceImageHandle;
    public int highlightsHandle;
    public int highlightsTintColorHandle;
    public int highlightsTintIntensityHandle;
    public ByteBuffer hsvBuffer;
    public boolean hsvGenerated;
    public int inputTexCoordHandle;
    public final boolean isVideo;
    public float lastRadius;
    public int linearBlurAngleHandle;
    public int linearBlurAspectRatioHandle;
    public int linearBlurExcludeBlurSizeHandle;
    public int linearBlurExcludePointHandle;
    public int linearBlurExcludeSizeHandle;
    public int linearBlurInputTexCoordHandle;
    public int linearBlurPositionHandle;
    public int linearBlurShaderProgram;
    public int linearBlurSourceImage2Handle;
    public int linearBlurSourceImageHandle;
    public int positionHandle;
    public int radialBlurAspectRatioHandle;
    public int radialBlurExcludeBlurSizeHandle;
    public int radialBlurExcludePointHandle;
    public int radialBlurExcludeSizeHandle;
    public int radialBlurInputTexCoordHandle;
    public int radialBlurPositionHandle;
    public int radialBlurShaderProgram;
    public int radialBlurSourceImage2Handle;
    public int radialBlurSourceImageHandle;
    public int renderBufferHeight;
    public int renderBufferWidth;
    public int[] renderFrameBuffer;
    public int rgbToHsvMatrixHandle;
    public int rgbToHsvTexSizeHandle;
    public int saturationHandle;
    public int shadowsHandle;
    public int shadowsTintColorHandle;
    public int shadowsTintIntensityHandle;
    public int sharpenHandle;
    public int sharpenHeightHandle;
    public int sharpenInputTexCoordHandle;
    public int sharpenPositionHandle;
    public int sharpenShaderProgram;
    public int sharpenSourceImageHandle;
    public int sharpenWidthHandle;
    public BlurProgram skinBlurProgram;
    public boolean skinPassDrawn;
    public boolean skinTextureCreated;
    public int skipToneHandle;
    public int sourceImageHandle;
    public final FloatBuffer textureBuffer;
    public MHTML toneCurve;
    public int toolsShaderProgram;
    public final FloatBuffer vertexBuffer;
    public final FloatBuffer vertexInvertBuffer;
    public float[] videoMatrix;
    public int videoTexture;
    public int vignetteHandle;
    public int warmthHandle;
    public int widthHandle;
    public boolean needUpdateBlurTexture = true;
    public boolean needUpdateSkinTexture = true;
    public final int[] rgbToHsvShaderProgram = new int[2];
    public final int[] rgbToHsvPositionHandle = new int[2];
    public final int[] rgbToHsvInputTexCoordHandle = new int[2];
    public final int[] rgbToHsvSourceImageHandle = new int[2];
    public final int[] enhanceTextures = new int[2];
    public final int[] enhanceFrameBuffer = new int[1];
    public final int[] renderTexture = new int[4];
    public final int[] bitmapTextre = new int[1];
    public final int[] curveTextures = new int[1];
    public boolean scaleBitmap = true;

    public final class AnonymousClass1 implements FilterShadersDelegate {
        public final MediaController.SavedFilterState val$lastState;

        public AnonymousClass1(MediaController.SavedFilterState savedFilterState) {
            this.val$lastState = savedFilterState;
        }

        @Override
        public final ByteBuffer fillAndGetCurveBuffer() {
            MediaController.SavedFilterState savedFilterState = this.val$lastState;
            savedFilterState.curvesToolValue.fillBuffer();
            return savedFilterState.curvesToolValue.curveBuffer;
        }

        @Override
        public final float getBlurAngle() {
            return this.val$lastState.blurAngle;
        }

        @Override
        public final float getBlurExcludeBlurSize() {
            return this.val$lastState.blurExcludeBlurSize;
        }

        @Override
        public final PointF getBlurExcludePoint() {
            return this.val$lastState.blurExcludePoint;
        }

        @Override
        public final float getBlurExcludeSize() {
            return this.val$lastState.blurExcludeSize;
        }

        @Override
        public final int getBlurType() {
            return this.val$lastState.blurType;
        }

        @Override
        public final float getContrastValue() {
            return zzjd.m(this.val$lastState.contrastValue, 100.0f, 0.3f, 1.0f);
        }

        @Override
        public final float getEnhanceValue() {
            return this.val$lastState.enhanceValue / 100.0f;
        }

        @Override
        public final float getExposureValue() {
            return this.val$lastState.exposureValue / 100.0f;
        }

        @Override
        public final float getFadeValue() {
            return this.val$lastState.fadeValue / 100.0f;
        }

        @Override
        public final float getGrainValue() {
            return (this.val$lastState.grainValue / 100.0f) * 0.04f;
        }

        @Override
        public final float getHighlightsValue() {
            return SurfaceContainer$$ExternalSyntheticOutline0.m$1(this.val$lastState.highlightsValue, 0.75f, 100.0f, 100.0f);
        }

        @Override
        public final float getSaturationValue() {
            float f = this.val$lastState.saturationValue / 100.0f;
            if (f > 0.0f) {
                f *= 1.05f;
            }
            return f + 1.0f;
        }

        @Override
        public final float getShadowsValue() {
            return SurfaceContainer$$ExternalSyntheticOutline0.m$1(this.val$lastState.shadowsValue, 0.55f, 100.0f, 100.0f);
        }

        @Override
        public final float getSharpenValue() {
            return zzjd.m(this.val$lastState.sharpenValue, 100.0f, 0.6f, 0.11f);
        }

        @Override
        public final float getSoftenSkinValue() {
            return this.val$lastState.softenSkinValue / 100.0f;
        }

        @Override
        public final int getTintHighlightsColor() {
            return this.val$lastState.tintHighlightsColor;
        }

        @Override
        public final float getTintHighlightsIntensityValue() {
            return this.val$lastState.tintHighlightsColor == 0 ? 0.0f : 0.5f;
        }

        @Override
        public final int getTintShadowsColor() {
            return this.val$lastState.tintShadowsColor;
        }

        @Override
        public final float getTintShadowsIntensityValue() {
            return this.val$lastState.tintShadowsColor == 0 ? 0.0f : 0.5f;
        }

        @Override
        public final float getVignetteValue() {
            return this.val$lastState.vignetteValue / 100.0f;
        }

        @Override
        public final float getWarmthValue() {
            return this.val$lastState.warmthValue / 100.0f;
        }

        @Override
        public final boolean shouldDrawCurvesPass() {
            return !this.val$lastState.curvesToolValue.shouldBeSkipped();
        }

        @Override
        public final boolean shouldShowOriginal() {
            return false;
        }
    }

    public final class BlurProgram {
        public int blurHeightHandle;
        public int blurInputTexCoordHandle;
        public int blurPositionHandle;
        public int blurShaderProgram;
        public int blurSourceImageHandle;
        public int blurWidthHandle;
        public final String fragmentShaderCode;
        public final String vertexShaderCode;

        public BlurProgram(float f, float f2, boolean z) {
            int i;
            float fRound;
            int i2;
            double d = 6.283185307179586d;
            if (z) {
                fRound = Math.round(f);
                if (fRound >= 1.0f) {
                    double d2 = fRound;
                    int iFloor = (int) Math.floor(Math.sqrt(Math.log(Math.sqrt(Math.pow(d2, 2.0d) * 6.283185307179586d) * ((double) 0.00390625f)) * Math.pow(d2, 2.0d) * (-2.0d)));
                    i = (iFloor % 2) + iFloor;
                } else {
                    i = 0;
                }
            } else {
                i = (int) f;
                fRound = f2;
            }
            int i3 = (i * 2) + 1;
            float[] fArr = new float[i3];
            int i4 = 0;
            float f3 = 0.0f;
            while (true) {
                i2 = i + 1;
                if (i4 >= i2) {
                    break;
                }
                double d3 = d;
                double d4 = fRound;
                float fExp = (float) (Math.exp((-Math.pow(i4, 2.0d)) / (Math.pow(d4, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d4, 2.0d) * d3)));
                fArr[i4] = fExp;
                f3 = i4 == 0 ? f3 + fExp : (float) ((((double) fExp) * 2.0d) + ((double) f3));
                i4++;
                d = d3;
            }
            double d5 = d;
            for (int i5 = 0; i5 < i2; i5++) {
                fArr[i5] = fArr[i5] / f3;
            }
            int i6 = (i % 2) + (i / 2);
            int iMin = Math.min(i6, 7);
            StringBuilder sb = new StringBuilder("uniform sampler2D sTexture;\nuniform highp float texelWidthOffset;\nuniform highp float texelHeightOffset;\n");
            Locale locale = Locale.US;
            sb.append("varying highp vec2 blurCoordinates[" + ((iMin * 2) + 1) + "];\n");
            sb.append("void main()\n{\nlowp vec4 sum = vec4(0.0);\n");
            sb.append(String.format(locale, "sum += texture2D(sTexture, blurCoordinates[0]) * %f;\n", Float.valueOf(fArr[0])));
            for (int i7 = 0; i7 < iMin; i7++) {
                int i8 = i7 * 2;
                int i9 = i8 + 1;
                int i10 = i8 + 2;
                float f4 = fArr[i9] + fArr[i10];
                Locale locale2 = Locale.US;
                sb.append(String.format(locale2, "sum += texture2D(sTexture, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i9), Float.valueOf(f4)));
                sb.append(String.format(locale2, "sum += texture2D(sTexture, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i10), Float.valueOf(f4)));
            }
            if (i6 > iMin) {
                sb.append("highp vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n");
                while (iMin < i6) {
                    int i11 = iMin * 2;
                    int i12 = i11 + 1;
                    float f5 = fArr[i12];
                    int i13 = i11 + 2;
                    float f6 = fArr[i13];
                    float f7 = f5 + f6;
                    float fM$1 = SurfaceContainer$$ExternalSyntheticOutline0.m$1(f6, i13, f5 * i12, f7);
                    Locale locale3 = Locale.US;
                    sb.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] + singleStepOffset * %f) * %f;\n", Float.valueOf(fM$1), Float.valueOf(f7)));
                    sb.append(String.format(locale3, "sum += texture2D(sTexture, blurCoordinates[0] - singleStepOffset * %f) * %f;\n", Float.valueOf(fM$1), Float.valueOf(f7)));
                    iMin++;
                }
            }
            sb.append("gl_FragColor = sum;\n}\n");
            this.fragmentShaderCode = sb.toString();
            float[] fArr2 = new float[i3];
            int i14 = 0;
            float f8 = 0.0f;
            while (i14 < i2) {
                double d6 = fRound;
                float f9 = fRound;
                float fExp2 = (float) (Math.exp((-Math.pow(i14, 2.0d)) / (Math.pow(d6, 2.0d) * 2.0d)) * (1.0d / Math.sqrt(Math.pow(d6, 2.0d) * d5)));
                fArr2[i14] = fExp2;
                f8 = i14 == 0 ? f8 + fExp2 : (float) ((((double) fExp2) * 2.0d) + ((double) f8));
                i14++;
                fRound = f9;
            }
            for (int i15 = 0; i15 < i2; i15++) {
                fArr2[i15] = fArr2[i15] / f8;
            }
            int iMin2 = Math.min(i6, 7);
            float[] fArr3 = new float[iMin2];
            for (int i16 = 0; i16 < iMin2; i16++) {
                int i17 = i16 * 2;
                int i18 = i17 + 1;
                float f10 = fArr2[i18];
                int i19 = i17 + 2;
                float f11 = fArr2[i19];
                fArr3[i16] = SurfaceContainer$$ExternalSyntheticOutline0.m$1(f11, i19, f10 * i18, f10 + f11);
            }
            StringBuilder sb2 = new StringBuilder("attribute vec4 position;\nattribute vec4 inputTexCoord;\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\n");
            Locale locale4 = Locale.US;
            sb2.append("varying vec2 blurCoordinates[" + ((iMin2 * 2) + 1) + "];\n");
            sb2.append("void main()\n{\ngl_Position = position;\nvec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\nblurCoordinates[0] = inputTexCoord.xy;\n");
            for (int i20 = 0; i20 < iMin2; i20++) {
                int i21 = i20 * 2;
                sb2.append(String.format(Locale.US, "blurCoordinates[%d] = inputTexCoord.xy + singleStepOffset * %f;\nblurCoordinates[%d] = inputTexCoord.xy - singleStepOffset * %f;\n", Integer.valueOf(i21 + 1), Float.valueOf(fArr3[i20]), Integer.valueOf(i21 + 2), Float.valueOf(fArr3[i20])));
            }
            sb2.append("}");
            this.vertexShaderCode = sb2.toString();
        }

        public final boolean create() {
            int iLoadShader = FilterShaders.loadShader(35633, this.vertexShaderCode);
            int iLoadShader2 = FilterShaders.loadShader(35632, this.fragmentShaderCode);
            if (iLoadShader == 0 || iLoadShader2 == 0) {
                return false;
            }
            int iGlCreateProgram = GLES20.glCreateProgram();
            this.blurShaderProgram = iGlCreateProgram;
            GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
            GLES20.glAttachShader(this.blurShaderProgram, iLoadShader2);
            GLES20.glBindAttribLocation(this.blurShaderProgram, 0, "position");
            GLES20.glBindAttribLocation(this.blurShaderProgram, 1, "inputTexCoord");
            GLES20.glLinkProgram(this.blurShaderProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.blurShaderProgram, 35714, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteProgram(this.blurShaderProgram);
                this.blurShaderProgram = 0;
            } else {
                this.blurPositionHandle = GLES20.glGetAttribLocation(this.blurShaderProgram, "position");
                this.blurInputTexCoordHandle = GLES20.glGetAttribLocation(this.blurShaderProgram, "inputTexCoord");
                this.blurSourceImageHandle = GLES20.glGetUniformLocation(this.blurShaderProgram, "sTexture");
                this.blurWidthHandle = GLES20.glGetUniformLocation(this.blurShaderProgram, "texelWidthOffset");
                this.blurHeightHandle = GLES20.glGetUniformLocation(this.blurShaderProgram, "texelHeightOffset");
            }
            return true;
        }
    }

    public interface FilterShadersDelegate {
        ByteBuffer fillAndGetCurveBuffer();

        float getBlurAngle();

        float getBlurExcludeBlurSize();

        PointF getBlurExcludePoint();

        float getBlurExcludeSize();

        int getBlurType();

        float getContrastValue();

        float getEnhanceValue();

        float getExposureValue();

        float getFadeValue();

        float getGrainValue();

        float getHighlightsValue();

        float getSaturationValue();

        float getShadowsValue();

        float getSharpenValue();

        float getSoftenSkinValue();

        int getTintHighlightsColor();

        float getTintHighlightsIntensityValue();

        int getTintShadowsColor();

        float getTintShadowsIntensityValue();

        float getVignetteValue();

        float getWarmthValue();

        boolean shouldDrawCurvesPass();

        boolean shouldShowOriginal();
    }

    public FilterShaders(boolean z, StoryEntry.HDRInfo hDRInfo) {
        this.isVideo = z;
        this.hdrInfo = hDRInfo;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.vertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f});
        floatBufferAsFloatBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        this.vertexInvertBuffer = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer3 = byteBufferAllocateDirect3.asFloatBuffer();
        this.textureBuffer = floatBufferAsFloatBuffer3;
        floatBufferAsFloatBuffer3.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer3.position(0);
    }

    public static int loadShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e(GLES20.glGetShaderInfoLog(iGlCreateShader));
            FileLog.e("shader code:\n " + str);
        }
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public final boolean create() {
        int[] iArr = this.curveTextures;
        GLES20.glGenTextures(1, iArr, 0);
        int[] iArr2 = this.enhanceTextures;
        GLES20.glGenTextures(2, iArr2, 0);
        GLES20.glGenFramebuffers(1, this.enhanceFrameBuffer, 0);
        GLES20.glBindTexture(3553, iArr2[1]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        int[] iArr3 = new int[1];
        int iLoadShader = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
        int iLoadShader2 = loadShader(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;uniform highp float width;uniform highp float height;uniform sampler2D curvesImage;uniform lowp float skipTone;uniform lowp float shadows;const mediump vec3 hsLuminanceWeighting = vec3(0.3, 0.3, 0.3);uniform lowp float highlights;uniform lowp float contrast;uniform lowp float fadeAmount;const mediump vec3 satLuminanceWeighting = vec3(0.2126, 0.7152, 0.0722);uniform lowp float saturation;uniform lowp float shadowsTintIntensity;uniform lowp float highlightsTintIntensity;uniform lowp vec3 shadowsTintColor;uniform lowp vec3 highlightsTintColor;uniform lowp float exposure;uniform lowp float warmth;uniform lowp float grain;const lowp float permTexUnit = 1.0 / 256.0;const lowp float permTexUnitHalf = 0.5 / 256.0;const lowp float grainsize = 2.3;uniform lowp float vignette;highp float getLuma(highp vec3 rgbP) {return (0.299 * rgbP.r) + (0.587 * rgbP.g) + (0.114 * rgbP.b);}lowp vec3 rgbToHsv(lowp vec3 c) {highp vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);highp vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);highp vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);highp float d = q.x - min(q.w, q.y);highp float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}lowp vec3 hsvToRgb(lowp vec3 c) {highp vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);highp vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}highp vec3 rgbToHsl(highp vec3 color) {highp vec3 hsl;highp float fmin = min(min(color.r, color.g), color.b);highp float fmax = max(max(color.r, color.g), color.b);highp float delta = fmax - fmin;hsl.z = (fmax + fmin) / 2.0;if (delta == 0.0) {hsl.x = 0.0;hsl.y = 0.0;} else {if (hsl.z < 0.5) {hsl.y = delta / (fmax + fmin);} else {hsl.y = delta / (2.0 - fmax - fmin);}highp float deltaR = (((fmax - color.r) / 6.0) + (delta / 2.0)) / delta;highp float deltaG = (((fmax - color.g) / 6.0) + (delta / 2.0)) / delta;highp float deltaB = (((fmax - color.b) / 6.0) + (delta / 2.0)) / delta;if (color.r == fmax) {hsl.x = deltaB - deltaG;} else if (color.g == fmax) {hsl.x = (1.0 / 3.0) + deltaR - deltaB;} else if (color.b == fmax) {hsl.x = (2.0 / 3.0) + deltaG - deltaR;}if (hsl.x < 0.0) {hsl.x += 1.0;} else if (hsl.x > 1.0) {hsl.x -= 1.0;}}return hsl;}highp float hueToRgb(highp float f1, highp float f2, highp float hue) {if (hue < 0.0) {hue += 1.0;} else if (hue > 1.0) {hue -= 1.0;}highp float res;if ((6.0 * hue) < 1.0) {res = f1 + (f2 - f1) * 6.0 * hue;} else if ((2.0 * hue) < 1.0) {res = f2;} else if ((3.0 * hue) < 2.0) {res = f1 + (f2 - f1) * ((2.0 / 3.0) - hue) * 6.0;} else {res = f1;}return res;}highp vec3 hslToRgb(highp vec3 hsl) {if (hsl.y == 0.0) {return vec3(hsl.z);} else {highp float f2;if (hsl.z < 0.5) {f2 = hsl.z * (1.0 + hsl.y);} else {f2 = (hsl.z + hsl.y) - (hsl.y * hsl.z);}highp float f1 = 2.0 * hsl.z - f2;return vec3(hueToRgb(f1, f2, hsl.x + (1.0/3.0)), hueToRgb(f1, f2, hsl.x), hueToRgb(f1, f2, hsl.x - (1.0/3.0)));}}highp vec3 rgbToYuv(highp vec3 inP) {highp float luma = getLuma(inP);return vec3(luma, (1.0 / 1.772) * (inP.b - luma), (1.0 / 1.402) * (inP.r - luma));}lowp vec3 yuvToRgb(highp vec3 inP) {return vec3(1.402 * inP.b + inP.r, (inP.r - (0.299 * 1.402 / 0.587) * inP.b - (0.114 * 1.772 / 0.587) * inP.g), 1.772 * inP.g + inP.r);}lowp float easeInOutSigmoid(lowp float value, lowp float strength) {if (value > 0.5) {return 1.0 - pow(2.0 - 2.0 * value, 1.0 / (1.0 - strength)) * 0.5;} else {return pow(2.0 * value, 1.0 / (1.0 - strength)) * 0.5;}}lowp vec3 applyLuminanceCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.z / (1.0 / 200.0), 0.0, 199.0));pixel.y = mix(0.0, pixel.y, smoothstep(0.0, 0.1, pixel.z) * (1.0 - smoothstep(0.8, 1.0, pixel.z)));pixel.z = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).a;return pixel;}lowp vec3 applyRGBCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.r / (1.0 / 200.0), 0.0, 199.0));pixel.r = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).r;index = floor(clamp(pixel.g / (1.0 / 200.0), 0.0, 199.0));pixel.g = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).g, 0.0, 1.0);index = floor(clamp(pixel.b / (1.0 / 200.0), 0.0, 199.0));pixel.b = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).b, 0.0, 1.0);return pixel;}highp vec3 fadeAdjust(highp vec3 color, highp float fadeVal) {return (color * (1.0 - fadeVal)) + ((color + (vec3(-0.9772) * pow(vec3(color), vec3(3.0)) + vec3(1.708) * pow(vec3(color), vec3(2.0)) + vec3(-0.1603) * vec3(color) + vec3(0.2878) - color * vec3(0.9))) * fadeVal);}lowp vec3 tintRaiseShadowsCurve(lowp vec3 color) {return vec3(-0.003671) * pow(color, vec3(3.0)) + vec3(0.3842) * pow(color, vec3(2.0)) + vec3(0.3764) * color + vec3(0.2515);}lowp vec3 tintShadows(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, tintRaiseShadowsCurve(texel), tintColor), tintAmount), 0.0, 1.0);} lowp vec3 tintHighlights(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, vec3(1.0) - tintRaiseShadowsCurve(vec3(1.0) - texel), (vec3(1.0) - tintColor)), tintAmount), 0.0, 1.0);}highp vec4 rnm(in highp vec2 tc) {highp float noise = sin(dot(tc, vec2(12.9898, 78.233))) * 43758.5453;return vec4(fract(noise), fract(noise * 1.2154), fract(noise * 1.3453), fract(noise * 1.3647)) * 2.0 - 1.0;}highp float fade(in highp float t) {return t * t * t * (t * (t * 6.0 - 15.0) + 10.0);}highp float pnoise3D(in highp vec3 p) {highp vec3 pi = permTexUnit * floor(p) + permTexUnitHalf;highp vec3 pf = fract(p);highp float perm = rnm(pi.xy).a;highp float n000 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf);highp float n001 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(0.0, permTexUnit)).a;highp float n010 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 0.0));highp float n011 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, 0.0)).a;highp float n100 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 0.0));highp float n101 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, permTexUnit)).a;highp float n110 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 0.0));highp float n111 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 1.0));highp vec4 n_x = mix(vec4(n000, n001, n010, n011), vec4(n100, n101, n110, n111), fade(pf.x));highp vec2 n_xy = mix(n_x.xy, n_x.zw, fade(pf.y));return mix(n_xy.x, n_xy.y, fade(pf.z));}lowp vec2 coordRot(in lowp vec2 tc, in lowp float angle) {return vec2(((tc.x * 2.0 - 1.0) * cos(angle) - (tc.y * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5, ((tc.y * 2.0 - 1.0) * cos(angle) + (tc.x * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5);}void main() {lowp vec4 source = texture2D(sTexture, vTextureCoord);lowp vec4 result = source;const lowp float toolEpsilon = 0.005;if (skipTone < toolEpsilon) {result = vec4(applyRGBCurve(hslToRgb(applyLuminanceCurve(rgbToHsl(result.rgb)))), result.a);}mediump float hsLuminance = dot(result.rgb, hsLuminanceWeighting);mediump float shadow = clamp((pow(hsLuminance, 1.0 / shadows) + (-0.76) * pow(hsLuminance, 2.0 / shadows)) - hsLuminance, 0.0, 1.0);mediump float highlight = clamp((1.0 - (pow(1.0 - hsLuminance, 1.0 / (2.0 - highlights)) + (-0.8) * pow(1.0 - hsLuminance, 2.0 / (2.0 - highlights)))) - hsLuminance, -1.0, 0.0);lowp vec3 hsresult = vec3(0.0, 0.0, 0.0) + ((hsLuminance + shadow + highlight) - 0.0) * ((result.rgb - vec3(0.0, 0.0, 0.0)) / (hsLuminance - 0.0));mediump float contrastedLuminance = ((hsLuminance - 0.5) * 1.5) + 0.5;mediump float whiteInterp = contrastedLuminance * contrastedLuminance * contrastedLuminance;mediump float whiteTarget = clamp(highlights, 1.0, 2.0) - 1.0;hsresult = mix(hsresult, vec3(1.0), whiteInterp * whiteTarget);mediump float invContrastedLuminance = 1.0 - contrastedLuminance;mediump float blackInterp = invContrastedLuminance * invContrastedLuminance * invContrastedLuminance;mediump float blackTarget = 1.0 - clamp(shadows, 0.0, 1.0);hsresult = mix(hsresult, vec3(0.0), blackInterp * blackTarget);result = vec4(hsresult.rgb, result.a);result = vec4(clamp(((result.rgb - vec3(0.5)) * contrast + vec3(0.5)), 0.0, 1.0), result.a);if (abs(fadeAmount) > toolEpsilon) {result.rgb = fadeAdjust(result.rgb, fadeAmount);}lowp float satLuminance = dot(result.rgb, satLuminanceWeighting);lowp vec3 greyScaleColor = vec3(satLuminance);result = vec4(clamp(mix(greyScaleColor, result.rgb, saturation), 0.0, 1.0), result.a);if (abs(shadowsTintIntensity) > toolEpsilon) {result.rgb = tintShadows(result.rgb, shadowsTintColor, shadowsTintIntensity * 2.0);}if (abs(highlightsTintIntensity) > toolEpsilon) {result.rgb = tintHighlights(result.rgb, highlightsTintColor, highlightsTintIntensity * 2.0);}if (abs(exposure) > toolEpsilon) {mediump float mag = exposure * 1.045;mediump float exppower = 1.0 + abs(mag);if (mag < 0.0) {exppower = 1.0 / exppower;}result.r = 1.0 - pow((1.0 - result.r), exppower);result.g = 1.0 - pow((1.0 - result.g), exppower);result.b = 1.0 - pow((1.0 - result.b), exppower);}if (abs(warmth) > toolEpsilon) {highp vec3 yuvVec;if (warmth > 0.0 ) {yuvVec = vec3(0.1765, -0.1255, 0.0902);} else {yuvVec = -vec3(0.0588, 0.1569, -0.1255);}highp vec3 yuvColor = rgbToYuv(result.rgb);highp float luma = yuvColor.r;highp float curveScale = sin(luma * 3.14159);yuvColor += 0.375 * warmth * curveScale * yuvVec;result.rgb = yuvToRgb(yuvColor);}if (abs(grain) > toolEpsilon) {highp vec3 rotOffset = vec3(1.425, 3.892, 5.835);highp vec2 rotCoordsR = coordRot(vTextureCoord, rotOffset.x);highp vec3 noise = vec3(pnoise3D(vec3(rotCoordsR * vec2(width / grainsize, height / grainsize),0.0)));lowp vec3 lumcoeff = vec3(0.299,0.587,0.114);lowp float luminance = dot(result.rgb, lumcoeff);lowp float lum = smoothstep(0.2, 0.0, luminance);lum += luminance;noise = mix(noise,vec3(0.0),pow(lum,4.0));result.rgb = result.rgb + noise * grain;}if (abs(vignette) > toolEpsilon) {const lowp float midpoint = 0.7;const lowp float fuzziness = 0.62;lowp float radDist = length(vTextureCoord - 0.5) / sqrt(0.5);lowp float mag = easeInOutSigmoid(radDist * midpoint, fuzziness) * vignette * 0.645;result.rgb = mix(pow(result.rgb, vec3(1.0 / (1.0 - mag))), vec3(0.0), mag * mag);}gl_FragColor = result;}");
        if (iLoadShader != 0 && iLoadShader2 != 0) {
            int iGlCreateProgram = GLES20.glCreateProgram();
            this.toolsShaderProgram = iGlCreateProgram;
            GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
            GLES20.glAttachShader(this.toolsShaderProgram, iLoadShader2);
            GLES20.glBindAttribLocation(this.toolsShaderProgram, 0, "position");
            GLES20.glBindAttribLocation(this.toolsShaderProgram, 1, "inputTexCoord");
            GLES20.glLinkProgram(this.toolsShaderProgram);
            GLES20.glGetProgramiv(this.toolsShaderProgram, 35714, iArr3, 0);
            if (iArr3[0] == 0) {
                GLES20.glDeleteProgram(this.toolsShaderProgram);
                this.toolsShaderProgram = 0;
            } else {
                this.positionHandle = GLES20.glGetAttribLocation(this.toolsShaderProgram, "position");
                this.inputTexCoordHandle = GLES20.glGetAttribLocation(this.toolsShaderProgram, "inputTexCoord");
                this.sourceImageHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "sTexture");
                this.shadowsHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "shadows");
                this.highlightsHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "highlights");
                this.exposureHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "exposure");
                this.contrastHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "contrast");
                this.saturationHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "saturation");
                this.warmthHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "warmth");
                this.vignetteHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "vignette");
                this.grainHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "grain");
                this.widthHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "width");
                this.heightHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "height");
                this.curvesImageHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "curvesImage");
                this.skipToneHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "skipTone");
                this.fadeAmountHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "fadeAmount");
                this.shadowsTintIntensityHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "shadowsTintIntensity");
                this.highlightsTintIntensityHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "highlightsTintIntensity");
                this.shadowsTintColorHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "shadowsTintColor");
                this.highlightsTintColorHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "highlightsTintColor");
            }
            int iLoadShader3 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;uniform highp float inputWidth;uniform highp float inputHeight;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;highp vec2 widthStep = vec2(1.0 / inputWidth, 0.0);highp vec2 heightStep = vec2(0.0, 1.0 / inputHeight);leftTexCoord = inputTexCoord - widthStep;rightTexCoord = inputTexCoord + widthStep;topTexCoord = inputTexCoord + heightStep;bottomTexCoord = inputTexCoord - heightStep;}");
            int iLoadShader4 = loadShader(35632, "precision highp float;varying vec2 vTextureCoord;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;uniform sampler2D sTexture;uniform float sharpen;void main() {vec4 result = texture2D(sTexture, vTextureCoord);vec3 leftTextureColor = texture2D(sTexture, leftTexCoord).rgb;vec3 rightTextureColor = texture2D(sTexture, rightTexCoord).rgb;vec3 topTextureColor = texture2D(sTexture, topTexCoord).rgb;vec3 bottomTextureColor = texture2D(sTexture, bottomTexCoord).rgb;result.rgb = result.rgb * (1.0 + 4.0 * sharpen) - (leftTextureColor + rightTextureColor + topTextureColor + bottomTextureColor) * sharpen;gl_FragColor = result;}");
            if (iLoadShader3 != 0 && iLoadShader4 != 0) {
                int iGlCreateProgram2 = GLES20.glCreateProgram();
                this.sharpenShaderProgram = iGlCreateProgram2;
                GLES20.glAttachShader(iGlCreateProgram2, iLoadShader3);
                GLES20.glAttachShader(this.sharpenShaderProgram, iLoadShader4);
                GLES20.glBindAttribLocation(this.sharpenShaderProgram, 0, "position");
                GLES20.glBindAttribLocation(this.sharpenShaderProgram, 1, "inputTexCoord");
                GLES20.glLinkProgram(this.sharpenShaderProgram);
                GLES20.glGetProgramiv(this.sharpenShaderProgram, 35714, iArr3, 0);
                if (iArr3[0] == 0) {
                    GLES20.glDeleteProgram(this.sharpenShaderProgram);
                    this.sharpenShaderProgram = 0;
                } else {
                    this.sharpenPositionHandle = GLES20.glGetAttribLocation(this.sharpenShaderProgram, "position");
                    this.sharpenInputTexCoordHandle = GLES20.glGetAttribLocation(this.sharpenShaderProgram, "inputTexCoord");
                    this.sharpenSourceImageHandle = GLES20.glGetUniformLocation(this.sharpenShaderProgram, "sTexture");
                    this.sharpenWidthHandle = GLES20.glGetUniformLocation(this.sharpenShaderProgram, "inputWidth");
                    this.sharpenHeightHandle = GLES20.glGetUniformLocation(this.sharpenShaderProgram, "inputHeight");
                    this.sharpenHandle = GLES20.glGetUniformLocation(this.sharpenShaderProgram, "sharpen");
                }
                BlurProgram blurProgram = new BlurProgram(8.0f, 3.0f, false);
                this.blurProgram = blurProgram;
                if (blurProgram.create() && setupExternalShaders()) {
                    int iLoadShader5 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                    int iLoadShader6 = loadShader(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float angle;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sTexture, vTextureCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, vTextureCoord);highp vec2 texCoordToUse = vec2(vTextureCoord.x, (vTextureCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = abs((texCoordToUse.x - excludePoint.x) * aspectRatio * cos(angle) + (texCoordToUse.y - excludePoint.y) * sin(angle));gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                    if (iLoadShader5 != 0 && iLoadShader6 != 0) {
                        int iGlCreateProgram3 = GLES20.glCreateProgram();
                        this.linearBlurShaderProgram = iGlCreateProgram3;
                        GLES20.glAttachShader(iGlCreateProgram3, iLoadShader5);
                        GLES20.glAttachShader(this.linearBlurShaderProgram, iLoadShader6);
                        GLES20.glBindAttribLocation(this.linearBlurShaderProgram, 0, "position");
                        GLES20.glBindAttribLocation(this.linearBlurShaderProgram, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.linearBlurShaderProgram);
                        GLES20.glGetProgramiv(this.linearBlurShaderProgram, 35714, iArr3, 0);
                        if (iArr3[0] == 0) {
                            GLES20.glDeleteProgram(this.linearBlurShaderProgram);
                            this.linearBlurShaderProgram = 0;
                        } else {
                            this.linearBlurPositionHandle = GLES20.glGetAttribLocation(this.linearBlurShaderProgram, "position");
                            this.linearBlurInputTexCoordHandle = GLES20.glGetAttribLocation(this.linearBlurShaderProgram, "inputTexCoord");
                            this.linearBlurSourceImageHandle = GLES20.glGetUniformLocation(this.linearBlurShaderProgram, "sTexture");
                            this.linearBlurSourceImage2Handle = GLES20.glGetUniformLocation(this.linearBlurShaderProgram, "inputImageTexture2");
                            this.linearBlurExcludeSizeHandle = GLES20.glGetUniformLocation(this.linearBlurShaderProgram, "excludeSize");
                            this.linearBlurExcludePointHandle = GLES20.glGetUniformLocation(this.linearBlurShaderProgram, "excludePoint");
                            this.linearBlurExcludeBlurSizeHandle = GLES20.glGetUniformLocation(this.linearBlurShaderProgram, "excludeBlurSize");
                            this.linearBlurAngleHandle = GLES20.glGetUniformLocation(this.linearBlurShaderProgram, "angle");
                            this.linearBlurAspectRatioHandle = GLES20.glGetUniformLocation(this.linearBlurShaderProgram, "aspectRatio");
                        }
                        int iLoadShader7 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                        int iLoadShader8 = loadShader(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sTexture, vTextureCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, vTextureCoord);highp vec2 texCoordToUse = vec2(vTextureCoord.x, (vTextureCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = distance(excludePoint, texCoordToUse);gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                        if (iLoadShader7 != 0 && iLoadShader8 != 0) {
                            int iGlCreateProgram4 = GLES20.glCreateProgram();
                            this.radialBlurShaderProgram = iGlCreateProgram4;
                            GLES20.glAttachShader(iGlCreateProgram4, iLoadShader7);
                            GLES20.glAttachShader(this.radialBlurShaderProgram, iLoadShader8);
                            GLES20.glBindAttribLocation(this.radialBlurShaderProgram, 0, "position");
                            GLES20.glBindAttribLocation(this.radialBlurShaderProgram, 1, "inputTexCoord");
                            GLES20.glLinkProgram(this.radialBlurShaderProgram);
                            GLES20.glGetProgramiv(this.radialBlurShaderProgram, 35714, iArr3, 0);
                            if (iArr3[0] == 0) {
                                GLES20.glDeleteProgram(this.radialBlurShaderProgram);
                                this.radialBlurShaderProgram = 0;
                            } else {
                                this.radialBlurPositionHandle = GLES20.glGetAttribLocation(this.radialBlurShaderProgram, "position");
                                this.radialBlurInputTexCoordHandle = GLES20.glGetAttribLocation(this.radialBlurShaderProgram, "inputTexCoord");
                                this.radialBlurSourceImageHandle = GLES20.glGetUniformLocation(this.radialBlurShaderProgram, "sTexture");
                                this.radialBlurSourceImage2Handle = GLES20.glGetUniformLocation(this.radialBlurShaderProgram, "inputImageTexture2");
                                this.radialBlurExcludeSizeHandle = GLES20.glGetUniformLocation(this.radialBlurShaderProgram, "excludeSize");
                                this.radialBlurExcludePointHandle = GLES20.glGetUniformLocation(this.radialBlurShaderProgram, "excludePoint");
                                this.radialBlurExcludeBlurSizeHandle = GLES20.glGetUniformLocation(this.radialBlurShaderProgram, "excludeBlurSize");
                                this.radialBlurAspectRatioHandle = GLES20.glGetUniformLocation(this.radialBlurShaderProgram, "aspectRatio");
                            }
                            int iLoadShader9 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                            int iLoadShader10 = loadShader(35632, "precision highp float;varying vec2 vTextureCoord;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;uniform float intensity;float enhance(float value) {const vec2 offset = vec2(0.001953125, 0.03125);value = value + offset.x;vec2 coord = (clamp(vTextureCoord, 0.125, 1.0 - 0.125001) - 0.125) * 4.0;vec2 frac = fract(coord);coord = floor(coord);float p00 = float(coord.y * 4.0 + coord.x) * 0.0625 + offset.y;float p01 = float(coord.y * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;float p10 = float((coord.y + 1.0) * 4.0 + coord.x) * 0.0625 + offset.y;float p11 = float((coord.y + 1.0) * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;vec3 c00 = texture2D(inputImageTexture2, vec2(value, p00)).rgb;vec3 c01 = texture2D(inputImageTexture2, vec2(value, p01)).rgb;vec3 c10 = texture2D(inputImageTexture2, vec2(value, p10)).rgb;vec3 c11 = texture2D(inputImageTexture2, vec2(value, p11)).rgb;float c1 = ((c00.r - c00.g) / (c00.b - c00.g));float c2 = ((c01.r - c01.g) / (c01.b - c01.g));float c3 = ((c10.r - c10.g) / (c10.b - c10.g));float c4 = ((c11.r - c11.g) / (c11.b - c11.g));float c1_2 = mix(c1, c2, frac.x);float c3_4 = mix(c3, c4, frac.x);return mix(c1_2, c3_4, frac.y);}vec3 hsv_to_rgb(vec3 c) {vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}void main() {vec4 texel = texture2D(sTexture, vTextureCoord);vec4 hsv = texel;hsv.y = min(1.0, hsv.y * 1.2);hsv.z = min(1.0, enhance(hsv.z) * 1.1);gl_FragColor = vec4(hsv_to_rgb(mix(texel.xyz, hsv.xyz, intensity)), texel.w);}");
                            if (iLoadShader9 != 0 && iLoadShader10 != 0) {
                                int iGlCreateProgram5 = GLES20.glCreateProgram();
                                this.enhanceShaderProgram = iGlCreateProgram5;
                                GLES20.glAttachShader(iGlCreateProgram5, iLoadShader9);
                                GLES20.glAttachShader(this.enhanceShaderProgram, iLoadShader10);
                                GLES20.glBindAttribLocation(this.enhanceShaderProgram, 0, "position");
                                GLES20.glBindAttribLocation(this.enhanceShaderProgram, 1, "inputTexCoord");
                                GLES20.glLinkProgram(this.enhanceShaderProgram);
                                GLES20.glGetProgramiv(this.enhanceShaderProgram, 35714, iArr3, 0);
                                if (iArr3[0] == 0) {
                                    GLES20.glDeleteProgram(this.enhanceShaderProgram);
                                    this.enhanceShaderProgram = 0;
                                } else {
                                    this.enhancePositionHandle = GLES20.glGetAttribLocation(this.enhanceShaderProgram, "position");
                                    this.enhanceInputTexCoordHandle = GLES20.glGetAttribLocation(this.enhanceShaderProgram, "inputTexCoord");
                                    this.enhanceSourceImageHandle = GLES20.glGetUniformLocation(this.enhanceShaderProgram, "sTexture");
                                    this.enhanceIntensityHandle = GLES20.glGetUniformLocation(this.enhanceShaderProgram, "intensity");
                                    this.enhanceInputImageTexture2Handle = GLES20.glGetUniformLocation(this.enhanceShaderProgram, "inputImageTexture2");
                                }
                                int iLoadShader11 = loadShader(35632, "precision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;void main() {vec4 image = texture2D(sTexture, vTextureCoord);vec4 blurredImage = texture2D(inputImageTexture2, texCoord2);gl_FragColor = vec4((image.rgb - blurredImage.rgb + vec3(0.5,0.5,0.5)), image.a);}");
                                int iLoadShader12 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = inputTexCoord;texCoord2 = inputTexCoord;}");
                                if (iLoadShader12 != 0 && iLoadShader11 != 0) {
                                    int iGlCreateProgram6 = GLES20.glCreateProgram();
                                    this.highPassProgram = iGlCreateProgram6;
                                    GLES20.glAttachShader(iGlCreateProgram6, iLoadShader12);
                                    GLES20.glAttachShader(this.highPassProgram, iLoadShader11);
                                    GLES20.glBindAttribLocation(this.highPassProgram, 0, "position");
                                    GLES20.glBindAttribLocation(this.highPassProgram, 1, "inputTexCoord");
                                    GLES20.glLinkProgram(this.highPassProgram);
                                    GLES20.glGetProgramiv(this.highPassProgram, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        GLES20.glDeleteProgram(this.highPassProgram);
                                        this.highPassProgram = 0;
                                    } else {
                                        this.highPassPositionHandle = GLES20.glGetAttribLocation(this.highPassProgram, "position");
                                        this.highPassInputTexCoordHandle = GLES20.glGetAttribLocation(this.highPassProgram, "inputTexCoord");
                                        this.highPassSourceImageHandle = GLES20.glGetUniformLocation(this.highPassProgram, "sTexture");
                                        this.highPassInputImageHandle = GLES20.glGetUniformLocation(this.highPassProgram, "inputImageTexture2");
                                    }
                                    int iLoadShader13 = loadShader(35632, "precision lowp float;varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {vec4 color = texture2D(sTexture, vTextureCoord);float hardLightColor = color.b;for (int i = 0; i < 3; ++i){if (hardLightColor < 0.5) {hardLightColor = hardLightColor * hardLightColor * 2.0;} else {hardLightColor = 1.0 - (1.0 - hardLightColor) * (1.0 - hardLightColor) * 2.0;}}float k = 255.0 / (164.0 - 75.0);hardLightColor = (hardLightColor - 75.0 / 255.0) * k;gl_FragColor = vec4(vec3(hardLightColor), color.a);}");
                                    int iLoadShader14 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                    if (iLoadShader14 != 0 && iLoadShader13 != 0) {
                                        int iGlCreateProgram7 = GLES20.glCreateProgram();
                                        this.boostProgram = iGlCreateProgram7;
                                        GLES20.glAttachShader(iGlCreateProgram7, iLoadShader14);
                                        GLES20.glAttachShader(this.boostProgram, iLoadShader13);
                                        GLES20.glBindAttribLocation(this.boostProgram, 0, "position");
                                        GLES20.glBindAttribLocation(this.boostProgram, 1, "inputTexCoord");
                                        GLES20.glLinkProgram(this.boostProgram);
                                        GLES20.glGetProgramiv(this.boostProgram, 35714, iArr3, 0);
                                        if (iArr3[0] == 0) {
                                            GLES20.glDeleteProgram(this.boostProgram);
                                            this.boostProgram = 0;
                                        } else {
                                            this.boostPositionHandle = GLES20.glGetAttribLocation(this.boostProgram, "position");
                                            this.boostInputTexCoordHandle = GLES20.glGetAttribLocation(this.boostProgram, "inputTexCoord");
                                            this.boostSourceImageHandle = GLES20.glGetUniformLocation(this.boostProgram, "sTexture");
                                        }
                                        this.toneCurve = new MHTML(16);
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean drawBlurPass() {
        FilterShadersDelegate filterShadersDelegate;
        FilterShadersDelegate filterShadersDelegate2 = this.delegate;
        int blurType = filterShadersDelegate2 != null ? filterShadersDelegate2.getBlurType() : 0;
        if (this.isVideo || (filterShadersDelegate = this.delegate) == null || filterShadersDelegate.shouldShowOriginal() || blurType == 0) {
            return false;
        }
        boolean z = this.needUpdateBlurTexture;
        int[] iArr = this.renderTexture;
        if (z) {
            if (!this.blurTextureCreated) {
                GLES20.glBindTexture(3553, iArr[2]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glTexImage2D(3553, 0, 6408, this.renderBufferWidth, this.renderBufferHeight, 0, 6408, 5121, null);
                this.blurTextureCreated = true;
            }
            GLES20.glUseProgram(this.blurProgram.blurShaderProgram);
            GLES20.glUniform1i(this.blurProgram.blurSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.blurProgram.blurInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.blurProgram.blurInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.blurProgram.blurPositionHandle);
            GLES20.glVertexAttribPointer(this.blurProgram.blurPositionHandle, 2, 5126, false, 8, (Buffer) this.vertexInvertBuffer);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr[1]);
            GLES20.glUniform1f(this.blurProgram.blurWidthHandle, 0.0f);
            GLES20.glUniform1f(this.blurProgram.blurHeightHandle, 1.0f / this.renderBufferHeight);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[2]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[2], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glUniform1f(this.blurProgram.blurWidthHandle, 1.0f / this.renderBufferWidth);
            GLES20.glUniform1f(this.blurProgram.blurHeightHandle, 0.0f);
            GLES20.glDrawArrays(5, 0, 4);
            this.needUpdateBlurTexture = false;
        }
        GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
        if (blurType == 1) {
            GLES20.glUseProgram(this.radialBlurShaderProgram);
            GLES20.glUniform1i(this.radialBlurSourceImageHandle, 0);
            GLES20.glUniform1i(this.radialBlurSourceImage2Handle, 1);
            GLES20.glUniform1f(this.radialBlurExcludeSizeHandle, this.delegate.getBlurExcludeSize());
            GLES20.glUniform1f(this.radialBlurExcludeBlurSizeHandle, this.delegate.getBlurExcludeBlurSize());
            PointF blurExcludePoint = this.delegate.getBlurExcludePoint();
            GLES20.glUniform2f(this.radialBlurExcludePointHandle, blurExcludePoint.x, blurExcludePoint.y);
            GLES20.glUniform1f(this.radialBlurAspectRatioHandle, this.renderBufferHeight / this.renderBufferWidth);
            GLES20.glEnableVertexAttribArray(this.radialBlurInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.radialBlurInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.radialBlurPositionHandle);
            GLES20.glVertexAttribPointer(this.radialBlurPositionHandle, 2, 5126, false, 8, (Buffer) this.vertexInvertBuffer);
        } else if (blurType == 2) {
            GLES20.glUseProgram(this.linearBlurShaderProgram);
            GLES20.glUniform1i(this.linearBlurSourceImageHandle, 0);
            GLES20.glUniform1i(this.linearBlurSourceImage2Handle, 1);
            GLES20.glUniform1f(this.linearBlurExcludeSizeHandle, this.delegate.getBlurExcludeSize());
            GLES20.glUniform1f(this.linearBlurExcludeBlurSizeHandle, this.delegate.getBlurExcludeBlurSize());
            GLES20.glUniform1f(this.linearBlurAngleHandle, this.delegate.getBlurAngle());
            PointF blurExcludePoint2 = this.delegate.getBlurExcludePoint();
            GLES20.glUniform2f(this.linearBlurExcludePointHandle, blurExcludePoint2.x, blurExcludePoint2.y);
            GLES20.glUniform1f(this.linearBlurAspectRatioHandle, this.renderBufferHeight / this.renderBufferWidth);
            GLES20.glEnableVertexAttribArray(this.linearBlurInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.linearBlurInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.linearBlurPositionHandle);
            GLES20.glVertexAttribPointer(this.linearBlurPositionHandle, 2, 5126, false, 8, (Buffer) this.vertexInvertBuffer);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[1]);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, iArr[2]);
        GLES20.glDrawArrays(5, 0, 4);
        return true;
    }

    public final void drawCustomParamsPass() {
        int[] iArr = this.renderFrameBuffer;
        boolean z = this.isVideo;
        int i = !z ? 1 : 0;
        GLES20.glBindFramebuffer(36160, iArr[i]);
        int[] iArr2 = this.renderTexture;
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[i], 0);
        GLES20.glUseProgram(this.toolsShaderProgram);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr2[z ? 1 : 0]);
        GLES20.glUniform1i(this.sourceImageHandle, 0);
        FilterShadersDelegate filterShadersDelegate = this.delegate;
        if (filterShadersDelegate == null || filterShadersDelegate.shouldShowOriginal()) {
            GLES20.glUniform1f(this.shadowsHandle, 1.0f);
            GLES20.glUniform1f(this.highlightsHandle, 1.0f);
            GLES20.glUniform1f(this.exposureHandle, 0.0f);
            GLES20.glUniform1f(this.contrastHandle, 1.0f);
            GLES20.glUniform1f(this.saturationHandle, 1.0f);
            GLES20.glUniform1f(this.warmthHandle, 0.0f);
            GLES20.glUniform1f(this.vignetteHandle, 0.0f);
            GLES20.glUniform1f(this.grainHandle, 0.0f);
            GLES20.glUniform1f(this.fadeAmountHandle, 0.0f);
            GLES20.glUniform3f(this.highlightsTintColorHandle, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.highlightsTintIntensityHandle, 0.0f);
            GLES20.glUniform3f(this.shadowsTintColorHandle, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.shadowsTintIntensityHandle, 0.0f);
            GLES20.glUniform1f(this.skipToneHandle, 1.0f);
        } else {
            GLES20.glUniform1f(this.shadowsHandle, this.delegate.getShadowsValue());
            GLES20.glUniform1f(this.highlightsHandle, this.delegate.getHighlightsValue());
            GLES20.glUniform1f(this.exposureHandle, this.delegate.getExposureValue());
            GLES20.glUniform1f(this.contrastHandle, this.delegate.getContrastValue());
            GLES20.glUniform1f(this.saturationHandle, this.delegate.getSaturationValue());
            GLES20.glUniform1f(this.warmthHandle, this.delegate.getWarmthValue());
            GLES20.glUniform1f(this.vignetteHandle, this.delegate.getVignetteValue());
            GLES20.glUniform1f(this.grainHandle, this.delegate.getGrainValue());
            GLES20.glUniform1f(this.fadeAmountHandle, this.delegate.getFadeValue());
            int tintHighlightsColor = this.delegate.getTintHighlightsColor();
            int tintShadowsColor = this.delegate.getTintShadowsColor();
            GLES20.glUniform3f(this.highlightsTintColorHandle, ((tintHighlightsColor >> 16) & 255) / 255.0f, ((tintHighlightsColor >> 8) & 255) / 255.0f, (tintHighlightsColor & 255) / 255.0f);
            GLES20.glUniform1f(this.highlightsTintIntensityHandle, this.delegate.getTintHighlightsIntensityValue());
            GLES20.glUniform3f(this.shadowsTintColorHandle, ((tintShadowsColor >> 16) & 255) / 255.0f, ((tintShadowsColor >> 8) & 255) / 255.0f, (tintShadowsColor & 255) / 255.0f);
            GLES20.glUniform1f(this.shadowsTintIntensityHandle, this.delegate.getTintShadowsIntensityValue());
            boolean zShouldDrawCurvesPass = this.delegate.shouldDrawCurvesPass();
            GLES20.glUniform1f(this.skipToneHandle, zShouldDrawCurvesPass ? 0.0f : 1.0f);
            if (zShouldDrawCurvesPass) {
                ByteBuffer byteBufferFillAndGetCurveBuffer = this.delegate.fillAndGetCurveBuffer();
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, this.curveTextures[0]);
                GLES20.glTexImage2D(3553, 0, 6408, 200, 1, 0, 6408, 5121, byteBufferFillAndGetCurveBuffer);
                GLES20.glUniform1i(this.curvesImageHandle, 1);
            }
        }
        GLES20.glUniform1f(this.widthHandle, this.renderBufferWidth);
        GLES20.glUniform1f(this.heightHandle, this.renderBufferHeight);
        GLES20.glEnableVertexAttribArray(this.inputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.inputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.vertexInvertBuffer);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void drawEnhancePass() {
        int i;
        char c;
        boolean z = this.isVideo;
        boolean z2 = z ? true : !this.hsvGenerated;
        int[] iArr = this.renderTexture;
        int[] iArr2 = this.enhanceTextures;
        if (z2) {
            int[] iArr3 = this.rgbToHsvShaderProgram;
            if (!z || this.skinPassDrawn) {
                GLES20.glUseProgram(iArr3[0]);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.skinPassDrawn ? iArr[1] : this.bitmapTextre[0]);
                c = 0;
            } else {
                GLES20.glUseProgram(iArr3[1]);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, this.videoTexture);
                GLES20.glUniformMatrix4fv(this.rgbToHsvMatrixHandle, 1, false, this.videoMatrix, 0);
                int i2 = this.rgbToHsvTexSizeHandle;
                if (i2 != -1) {
                    GLES20.glUniform2f(i2, this.renderBufferWidth, this.renderBufferHeight);
                }
                c = 1;
            }
            GLES20.glUniform1i(this.rgbToHsvSourceImageHandle[c], 0);
            int[] iArr4 = this.rgbToHsvInputTexCoordHandle;
            GLES20.glEnableVertexAttribArray(iArr4[c]);
            GLES20.glVertexAttribPointer(iArr4[c], 2, 5126, false, 8, (Buffer) this.textureBuffer);
            int[] iArr5 = this.rgbToHsvPositionHandle;
            GLES20.glEnableVertexAttribArray(iArr5[c]);
            GLES20.glVertexAttribPointer(iArr5[c], 2, 5126, false, 8, (Buffer) (z ? this.vertexInvertBuffer : this.vertexBuffer));
            GLES20.glBindFramebuffer(36160, this.enhanceFrameBuffer[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (this.hsvGenerated) {
            i = 33984;
        } else {
            int i3 = this.renderBufferWidth * this.renderBufferHeight * 4;
            ByteBuffer byteBuffer = this.hsvBuffer;
            if (byteBuffer == null || i3 > byteBuffer.capacity()) {
                this.hsvBuffer = ByteBuffer.allocateDirect(i3);
            }
            if (this.cdtBuffer == null) {
                this.cdtBuffer = ByteBuffer.allocateDirect(16384);
            }
            if (this.calcBuffer == null) {
                this.calcBuffer = ByteBuffer.allocateDirect(32896);
            }
            GLES20.glReadPixels(0, 0, this.renderBufferWidth, this.renderBufferHeight, 6408, 5121, this.hsvBuffer);
            i = 33984;
            Utilities.calcCDT(this.hsvBuffer, this.renderBufferWidth, this.renderBufferHeight, this.cdtBuffer, this.calcBuffer);
            GLES20.glBindTexture(3553, iArr2[1]);
            GLES20.glTexImage2D(3553, 0, 6408, 256, 16, 0, 6408, 5121, this.cdtBuffer);
            if (!z) {
                this.hsvBuffer = null;
                this.cdtBuffer = null;
                this.calcBuffer = null;
            }
            this.hsvGenerated = true;
        }
        GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], 0);
        GLES20.glUseProgram(this.enhanceShaderProgram);
        GLES20.glActiveTexture(i);
        GLES20.glBindTexture(3553, iArr2[0]);
        GLES20.glUniform1i(this.enhanceSourceImageHandle, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, iArr2[1]);
        GLES20.glUniform1i(this.enhanceInputImageTexture2Handle, 1);
        FilterShadersDelegate filterShadersDelegate = this.delegate;
        if (filterShadersDelegate == null || filterShadersDelegate.shouldShowOriginal()) {
            GLES20.glUniform1f(this.enhanceIntensityHandle, 0.0f);
        } else {
            GLES20.glUniform1f(this.enhanceIntensityHandle, this.delegate.getEnhanceValue());
        }
        GLES20.glEnableVertexAttribArray(this.enhanceInputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.enhanceInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
        GLES20.glEnableVertexAttribArray(this.enhancePositionHandle);
        GLES20.glVertexAttribPointer(this.enhancePositionHandle, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void drawSharpenPass() {
        if (this.isVideo) {
            return;
        }
        GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[0]);
        int[] iArr = this.renderTexture;
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
        GLES20.glUseProgram(this.sharpenShaderProgram);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[1]);
        GLES20.glUniform1i(this.sharpenSourceImageHandle, 0);
        FilterShadersDelegate filterShadersDelegate = this.delegate;
        if (filterShadersDelegate == null || filterShadersDelegate.shouldShowOriginal()) {
            GLES20.glUniform1f(this.sharpenHandle, 0.0f);
        } else {
            GLES20.glUniform1f(this.sharpenHandle, this.delegate.getSharpenValue());
        }
        GLES20.glUniform1f(this.sharpenWidthHandle, this.renderBufferWidth);
        GLES20.glUniform1f(this.sharpenHeightHandle, this.renderBufferHeight);
        GLES20.glEnableVertexAttribArray(this.sharpenInputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.sharpenInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
        GLES20.glEnableVertexAttribArray(this.sharpenPositionHandle);
        GLES20.glVertexAttribPointer(this.sharpenPositionHandle, 2, 5126, false, 8, (Buffer) this.vertexInvertBuffer);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void drawSkinSmoothPass() {
        int i;
        int i2;
        FilterShadersDelegate filterShadersDelegate = this.delegate;
        if (filterShadersDelegate == null || filterShadersDelegate.shouldShowOriginal() || this.delegate.getSoftenSkinValue() <= 0.0f || (i = this.renderBufferWidth) <= 0 || this.renderBufferHeight <= 0) {
            if (this.skinPassDrawn) {
                this.hsvGenerated = false;
                this.skinPassDrawn = false;
                return;
            }
            return;
        }
        boolean z = this.needUpdateSkinTexture;
        int[] iArr = this.bitmapTextre;
        int[] iArr2 = this.renderTexture;
        boolean z2 = this.isVideo;
        if (z || z2) {
            float f = i * 0.006f;
            if (this.skinBlurProgram == null || Math.abs(this.lastRadius - f) > 1.0E-4d) {
                BlurProgram blurProgram = this.skinBlurProgram;
                if (blurProgram != null && (i2 = blurProgram.blurShaderProgram) != 0) {
                    GLES20.glDeleteProgram(i2);
                    blurProgram.blurShaderProgram = 0;
                }
                this.lastRadius = f;
                BlurProgram blurProgram2 = new BlurProgram(f, 2.0f, true);
                this.skinBlurProgram = blurProgram2;
                blurProgram2.create();
            }
            if (!this.skinTextureCreated) {
                GLES20.glBindTexture(3553, iArr2[3]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glTexImage2D(3553, 0, 6408, this.renderBufferWidth, this.renderBufferHeight, 0, 6408, 5121, null);
                this.skinTextureCreated = true;
            }
            GLES20.glUseProgram(this.greenAndBlueChannelOverlayProgram);
            GLES20.glUniform1i(this.greenAndBlueChannelOverlaySourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.greenAndBlueChannelOverlayInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.greenAndBlueChannelOverlayInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.greenAndBlueChannelOverlayPositionHandle);
            if (z2) {
                GLES20.glUniformMatrix4fv(this.greenAndBlueChannelOverlayMatrixHandle, 1, false, this.videoMatrix, 0);
                int i3 = this.greenAndBlueChannelOverlayTexSizeHandle;
                if (i3 != -1) {
                    GLES20.glUniform2f(i3, this.renderBufferWidth, this.renderBufferHeight);
                }
            }
            GLES20.glVertexAttribPointer(this.greenAndBlueChannelOverlayPositionHandle, 2, 5126, false, 8, (Buffer) this.vertexInvertBuffer);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
            GLES20.glActiveTexture(33984);
            if (z2) {
                GLES20.glBindTexture(36197, this.videoTexture);
            } else {
                GLES20.glBindTexture(3553, iArr[0]);
            }
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glUseProgram(this.skinBlurProgram.blurShaderProgram);
            GLES20.glUniform1i(this.skinBlurProgram.blurSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.skinBlurProgram.blurInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.skinBlurProgram.blurInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.skinBlurProgram.blurPositionHandle);
            GLES20.glVertexAttribPointer(this.skinBlurProgram.blurPositionHandle, 2, 5126, false, 8, (Buffer) this.vertexInvertBuffer);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[1]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[1], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr2[0]);
            GLES20.glUniform1f(this.skinBlurProgram.blurWidthHandle, 0.0f);
            GLES20.glUniform1f(this.skinBlurProgram.blurHeightHandle, 1.0f / this.renderBufferHeight);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[3]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[3], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr2[1]);
            GLES20.glUniform1f(this.skinBlurProgram.blurWidthHandle, 1.0f / this.renderBufferWidth);
            GLES20.glUniform1f(this.skinBlurProgram.blurHeightHandle, 0.0f);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glUseProgram(this.highPassProgram);
            GLES20.glUniform1i(this.highPassSourceImageHandle, 0);
            GLES20.glUniform1i(this.highPassInputImageHandle, 1);
            GLES20.glEnableVertexAttribArray(this.highPassInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.highPassInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.highPassPositionHandle);
            GLES20.glVertexAttribPointer(this.highPassPositionHandle, 2, 5126, false, 8, (Buffer) this.vertexInvertBuffer);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[1]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[1], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr2[0]);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, iArr2[3]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glUseProgram(this.boostProgram);
            GLES20.glUniform1i(this.boostSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.boostInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.boostInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.boostPositionHandle);
            GLES20.glVertexAttribPointer(this.boostPositionHandle, 2, 5126, false, 8, (Buffer) this.vertexInvertBuffer);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[3]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[3], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr2[1]);
            GLES20.glDrawArrays(5, 0, 4);
            this.needUpdateSkinTexture = false;
        }
        this.skinPassDrawn = true;
        this.hsvGenerated = false;
        GLES20.glUseProgram(this.compositeProgram);
        GLES20.glUniform1i(this.compositeSourceImageHandle, 0);
        GLES20.glUniform1i(this.compositeInputImageHandle, 1);
        GLES20.glUniform1i(this.compositeCurveImageHandle, 2);
        GLES20.glUniform1f(this.compositeMixtureHandle, this.delegate.getSoftenSkinValue());
        GLES20.glEnableVertexAttribArray(this.compositeInputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.compositeInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
        GLES20.glEnableVertexAttribArray(this.compositePositionHandle);
        GLES20.glVertexAttribPointer(this.compositePositionHandle, 2, 5126, false, 8, (Buffer) this.vertexInvertBuffer);
        if (z2) {
            GLES20.glUniformMatrix4fv(this.compositeMatrixHandle, 1, false, this.videoMatrix, 0);
            int i4 = this.compositeTexSizeHandle;
            if (i4 != -1) {
                GLES20.glUniform2f(i4, this.renderBufferWidth, this.renderBufferHeight);
            }
        }
        GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[1], 0);
        GLES20.glActiveTexture(33984);
        if (z2) {
            GLES20.glBindTexture(36197, this.videoTexture);
        } else {
            GLES20.glBindTexture(3553, iArr[0]);
        }
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, iArr2[3]);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, ((int[]) this.toneCurve.filePos)[0]);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final int getRenderTexture(int i) {
        int[] iArr = this.renderTexture;
        if (this.isVideo) {
            return iArr[i == 0 ? (char) 1 : (char) 0];
        }
        return iArr[i];
    }

    public final void setRenderData(Bitmap bitmap, int i, int i2, int i3, int i4) {
        Bitmap bitmapCreateBitmap;
        float width;
        this.renderBufferWidth = i3;
        this.renderBufferHeight = i4;
        int[] iArr = this.renderFrameBuffer;
        int[] iArr2 = this.renderTexture;
        if (iArr == null) {
            int[] iArr3 = new int[4];
            this.renderFrameBuffer = iArr3;
            GLES20.glGenFramebuffers(4, iArr3, 0);
            GLES20.glGenTextures(4, iArr2, 0);
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            int[] iArr4 = this.bitmapTextre;
            GLES20.glGenTextures(1, iArr4, 0);
            float photoSize = AndroidUtilities.getPhotoSize(true);
            boolean z = this.scaleBitmap;
            if ((!z || (this.renderBufferWidth <= photoSize && this.renderBufferHeight <= photoSize)) && i % 360 == 0) {
                bitmapCreateBitmap = bitmap;
            } else {
                if (!z || (this.renderBufferWidth <= photoSize && this.renderBufferHeight <= photoSize)) {
                    width = 1.0f;
                } else {
                    width = photoSize / bitmap.getWidth();
                    float height = photoSize / bitmap.getHeight();
                    if (width < height) {
                        this.renderBufferWidth = (int) photoSize;
                        this.renderBufferHeight = (int) (bitmap.getHeight() * width);
                    } else {
                        this.renderBufferHeight = (int) photoSize;
                        this.renderBufferWidth = (int) (bitmap.getWidth() * height);
                        width = height;
                    }
                }
                int i5 = i % 360;
                if (i5 == 90 || i5 == 270) {
                    int i6 = this.renderBufferWidth;
                    this.renderBufferWidth = this.renderBufferHeight;
                    this.renderBufferHeight = i6;
                }
                Matrix matrix = new Matrix();
                matrix.setScale(width, width);
                matrix.postRotate(i);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
            GLES20.glBindTexture(3553, iArr4[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, bitmapCreateBitmap, 0);
        }
        for (int i7 = 0; i7 < 2; i7++) {
            GLES20.glBindTexture(3553, iArr2[i7]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexImage2D(3553, 0, 6408, this.renderBufferWidth, this.renderBufferHeight, 0, 6408, 5121, null);
        }
        this.videoTexture = i2;
        GLES20.glBindTexture(3553, this.enhanceTextures[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, this.renderBufferWidth, this.renderBufferHeight, 0, 6408, 5121, null);
    }

    public final boolean setupExternalShaders() {
        String res;
        int iLoadShader;
        int iLoadShader2;
        int iLoadShader3;
        int iLoadShader4;
        int iLoadShader5;
        int iLoadShader6;
        int i;
        StoryEntry.HDRInfo hDRInfo = this.hdrInfo;
        int hDRType = hDRInfo != null ? hDRInfo.getHDRType() : 0;
        String str = "";
        if (hDRType == 1) {
            res = AndroidUtilities.readRes(R.raw.hdr2sdr_hlg);
        } else {
            res = hDRType == 2 ? AndroidUtilities.readRes(R.raw.hdr2sdr_pq) : "";
        }
        boolean z = this.isVideo;
        String str2 = z ? "#extension GL_OES_EGL_image_external : require" : "";
        String str3 = z ? "samplerExternalOES" : "sampler2D";
        int[] iArr = new int[1];
        int i2 = 0;
        while (true) {
            int i3 = hDRType;
            String str4 = str;
            String str5 = res;
            if (i2 >= (z ? 2 : 1)) {
                boolean z2 = z;
                if (z2) {
                    if (i3 != 0) {
                        iLoadShader = loadShader(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        iLoadShader2 = loadShader(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;void main() {vec4 inp = TEX(vTextureCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str5));
                    } else {
                        iLoadShader2 = 0;
                        iLoadShader = 0;
                    }
                    if (iLoadShader == 0 || iLoadShader2 == 0) {
                        iLoadShader = loadShader(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        iLoadShader2 = loadShader(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;uniform %2$s sTexture;void main() {vec4 inp = texture2D(sTexture, vTextureCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str2, str3));
                    }
                } else {
                    iLoadShader = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                    iLoadShader2 = loadShader(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;uniform %2$s sTexture;void main() {vec4 inp = texture2D(sTexture, vTextureCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str2, str3));
                }
                GLES20.glDeleteProgram(this.greenAndBlueChannelOverlayProgram);
                if (iLoadShader == 0 || iLoadShader2 == 0) {
                    return false;
                }
                int iGlCreateProgram = GLES20.glCreateProgram();
                this.greenAndBlueChannelOverlayProgram = iGlCreateProgram;
                GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
                GLES20.glAttachShader(this.greenAndBlueChannelOverlayProgram, iLoadShader2);
                GLES20.glBindAttribLocation(this.greenAndBlueChannelOverlayProgram, 0, "position");
                GLES20.glBindAttribLocation(this.greenAndBlueChannelOverlayProgram, 1, "inputTexCoord");
                GLES20.glLinkProgram(this.greenAndBlueChannelOverlayProgram);
                GLES20.glGetProgramiv(this.greenAndBlueChannelOverlayProgram, 35714, iArr, 0);
                if (iArr[0] == 0) {
                    GLES20.glDeleteProgram(this.greenAndBlueChannelOverlayProgram);
                    this.greenAndBlueChannelOverlayProgram = 0;
                } else {
                    this.greenAndBlueChannelOverlayPositionHandle = GLES20.glGetAttribLocation(this.greenAndBlueChannelOverlayProgram, "position");
                    this.greenAndBlueChannelOverlayInputTexCoordHandle = GLES20.glGetAttribLocation(this.greenAndBlueChannelOverlayProgram, "inputTexCoord");
                    this.greenAndBlueChannelOverlaySourceImageHandle = GLES20.glGetUniformLocation(this.greenAndBlueChannelOverlayProgram, "sTexture");
                    if (z2) {
                        this.greenAndBlueChannelOverlayMatrixHandle = GLES20.glGetUniformLocation(this.greenAndBlueChannelOverlayProgram, "videoMatrix");
                        this.greenAndBlueChannelOverlayTexSizeHandle = GLES20.glGetUniformLocation(this.greenAndBlueChannelOverlayProgram, "texSize");
                    }
                }
                if (z2) {
                    if (i3 != 0) {
                        iLoadShader3 = loadShader(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;texCoord2 = inputTexCoord.xy;}");
                        iLoadShader4 = loadShader(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform sampler2D toneCurveTexture;uniform sampler2D inputImageTexture3;uniform lowp float mixturePercent;void main() {vec4 image = TEX(vTextureCoord);vec4 mask = texture2D(inputImageTexture3, texCoord2);float redCurveValue = texture2D(toneCurveTexture, vec2(image.r, 0.0)).r;float greenCurveValue = texture2D(toneCurveTexture, vec2(image.g, 0.0)).g;float blueCurveValue = texture2D(toneCurveTexture, vec2(image.b, 0.0)).b;vec4 result = vec4(redCurveValue, greenCurveValue, blueCurveValue, image.a);vec4 tone = mix(image, result, mixturePercent);gl_FragColor = vec4(mix(image.rgb, tone.rgb, 1.0 - mask.b), 1.0);}", str5));
                    } else {
                        iLoadShader3 = 0;
                        iLoadShader4 = 0;
                    }
                    if (iLoadShader3 == 0 || iLoadShader4 == 0) {
                        iLoadShader3 = loadShader(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;texCoord2 = inputTexCoord.xy;}");
                        iLoadShader4 = loadShader(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform %2$s sTexture;uniform sampler2D toneCurveTexture;uniform sampler2D inputImageTexture3;uniform lowp float mixturePercent;void main() {vec4 image = texture2D(sTexture, vTextureCoord);vec4 mask = texture2D(inputImageTexture3, texCoord2);float redCurveValue = texture2D(toneCurveTexture, vec2(image.r, 0.0)).r;float greenCurveValue = texture2D(toneCurveTexture, vec2(image.g, 0.0)).g;float blueCurveValue = texture2D(toneCurveTexture, vec2(image.b, 0.0)).b;vec4 result = vec4(redCurveValue, greenCurveValue, blueCurveValue, image.a);vec4 tone = mix(image, result, mixturePercent);gl_FragColor = vec4(mix(image.rgb, tone.rgb, 1.0 - mask.b), 1.0);}", str2, str3));
                    }
                } else {
                    iLoadShader3 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = inputTexCoord;texCoord2 = inputTexCoord;}");
                    iLoadShader4 = loadShader(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform %2$s sTexture;uniform sampler2D toneCurveTexture;uniform sampler2D inputImageTexture3;uniform lowp float mixturePercent;void main() {vec4 image = texture2D(sTexture, vTextureCoord);vec4 mask = texture2D(inputImageTexture3, texCoord2);float redCurveValue = texture2D(toneCurveTexture, vec2(image.r, 0.0)).r;float greenCurveValue = texture2D(toneCurveTexture, vec2(image.g, 0.0)).g;float blueCurveValue = texture2D(toneCurveTexture, vec2(image.b, 0.0)).b;vec4 result = vec4(redCurveValue, greenCurveValue, blueCurveValue, image.a);vec4 tone = mix(image, result, mixturePercent);gl_FragColor = vec4(mix(image.rgb, tone.rgb, 1.0 - mask.b), 1.0);}", str2, str3));
                }
                GLES20.glDeleteProgram(this.compositeProgram);
                if (iLoadShader3 == 0 || iLoadShader4 == 0) {
                    return false;
                }
                int iGlCreateProgram2 = GLES20.glCreateProgram();
                this.compositeProgram = iGlCreateProgram2;
                GLES20.glAttachShader(iGlCreateProgram2, iLoadShader3);
                GLES20.glAttachShader(this.compositeProgram, iLoadShader4);
                GLES20.glBindAttribLocation(this.compositeProgram, 0, "position");
                GLES20.glBindAttribLocation(this.compositeProgram, 1, "inputTexCoord");
                GLES20.glLinkProgram(this.compositeProgram);
                GLES20.glGetProgramiv(this.compositeProgram, 35714, iArr, 0);
                if (iArr[0] == 0) {
                    GLES20.glDeleteProgram(this.compositeProgram);
                    this.compositeProgram = 0;
                    return true;
                }
                this.compositePositionHandle = GLES20.glGetAttribLocation(this.compositeProgram, "position");
                this.compositeInputTexCoordHandle = GLES20.glGetAttribLocation(this.compositeProgram, "inputTexCoord");
                this.compositeSourceImageHandle = GLES20.glGetUniformLocation(this.compositeProgram, "sTexture");
                this.compositeInputImageHandle = GLES20.glGetUniformLocation(this.compositeProgram, "inputImageTexture3");
                this.compositeCurveImageHandle = GLES20.glGetUniformLocation(this.compositeProgram, "toneCurveTexture");
                this.compositeMixtureHandle = GLES20.glGetUniformLocation(this.compositeProgram, "mixturePercent");
                if (!z2) {
                    return true;
                }
                this.compositeMatrixHandle = GLES20.glGetUniformLocation(this.compositeProgram, "videoMatrix");
                this.compositeTexSizeHandle = GLES20.glGetUniformLocation(this.compositeProgram, "texSize");
                return true;
            }
            if (i2 == 1 && z) {
                if (i3 != 0) {
                    iLoadShader5 = loadShader(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                    iLoadShader6 = loadShader(35632, String.format(Locale.US, "%1$s\nprecision highp float;varying vec2 vTextureCoord;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = TEX(vTextureCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}", str5));
                } else {
                    iLoadShader6 = 0;
                    iLoadShader5 = 0;
                }
                if (iLoadShader5 == 0 || iLoadShader6 == 0) {
                    iLoadShader5 = loadShader(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                    iLoadShader6 = loadShader(35632, String.format(Locale.US, "%1$s\nprecision highp float;varying vec2 vTextureCoord;uniform %2$s sTexture;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = texture2D(sTexture, vTextureCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}", str2, str3));
                }
            } else {
                z = z;
                iLoadShader5 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                iLoadShader6 = loadShader(35632, String.format(Locale.US, "%1$s\nprecision highp float;varying vec2 vTextureCoord;uniform %2$s sTexture;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = texture2D(sTexture, vTextureCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}", str4, "sampler2D"));
            }
            int i4 = iLoadShader5;
            int[] iArr2 = this.rgbToHsvShaderProgram;
            GLES20.glDeleteProgram(iArr2[i2]);
            if (i4 == 0 || iLoadShader6 == 0) {
                return false;
            }
            int iGlCreateProgram3 = GLES20.glCreateProgram();
            iArr2[i2] = iGlCreateProgram3;
            GLES20.glAttachShader(iGlCreateProgram3, i4);
            GLES20.glAttachShader(iArr2[i2], iLoadShader6);
            GLES20.glBindAttribLocation(iArr2[i2], 0, "position");
            GLES20.glBindAttribLocation(iArr2[i2], 1, "inputTexCoord");
            GLES20.glLinkProgram(iArr2[i2]);
            GLES20.glGetProgramiv(iArr2[i2], 35714, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteProgram(iArr2[i2]);
                iArr2[i2] = 0;
                i = 1;
            } else {
                this.rgbToHsvPositionHandle[i2] = GLES20.glGetAttribLocation(iArr2[i2], "position");
                this.rgbToHsvInputTexCoordHandle[i2] = GLES20.glGetAttribLocation(iArr2[i2], "inputTexCoord");
                this.rgbToHsvSourceImageHandle[i2] = GLES20.glGetUniformLocation(iArr2[i2], "sTexture");
                i = 1;
                if (i2 == 1) {
                    this.rgbToHsvMatrixHandle = GLES20.glGetUniformLocation(iArr2[i2], "videoMatrix");
                    this.rgbToHsvTexSizeHandle = GLES20.glGetUniformLocation(iArr2[i2], "texSize");
                }
            }
            i2 += i;
            hDRType = i3;
            str = str4;
            res = str5;
            z = z;
        }
    }
}
