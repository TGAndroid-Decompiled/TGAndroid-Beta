package org.telegram.p009ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

public class FilterShaders {
    private BlurProgram blurProgram;
    private boolean blurTextureCreated;
    private int boostInputTexCoordHandle;
    private int boostPositionHandle;
    private int boostProgram;
    private int boostSourceImageHandle;
    private ByteBuffer calcBuffer;
    private ByteBuffer cdtBuffer;
    private int compositeCurveImageHandle;
    private int compositeInputImageHandle;
    private int compositeInputTexCoordHandle;
    private int compositeMatrixHandle;
    private int compositeMixtureHandle;
    private int compositePositionHandle;
    private int compositeProgram;
    private int compositeSourceImageHandle;
    private int contrastHandle;
    private int curvesImageHandle;
    private FilterShadersDelegate delegate;
    private int enhanceInputImageTexture2Handle;
    private int enhanceInputTexCoordHandle;
    private int enhanceIntensityHandle;
    private int enhancePositionHandle;
    private int enhanceShaderProgram;
    private int enhanceSourceImageHandle;
    private int exposureHandle;
    private int fadeAmountHandle;
    private int grainHandle;
    private int greenAndBlueChannelOverlayInputTexCoordHandle;
    private int greenAndBlueChannelOverlayMatrixHandle;
    private int greenAndBlueChannelOverlayPositionHandle;
    private int greenAndBlueChannelOverlayProgram;
    private int greenAndBlueChannelOverlaySourceImageHandle;
    private int heightHandle;
    private int highPassInputImageHandle;
    private int highPassInputTexCoordHandle;
    private int highPassPositionHandle;
    private int highPassProgram;
    private int highPassSourceImageHandle;
    private int highlightsHandle;
    private int highlightsTintColorHandle;
    private int highlightsTintIntensityHandle;
    private ByteBuffer hsvBuffer;
    private boolean hsvGenerated;
    private int inputTexCoordHandle;
    private boolean isVideo;
    private float lastRadius;
    private int linearBlurAngleHandle;
    private int linearBlurAspectRatioHandle;
    private int linearBlurExcludeBlurSizeHandle;
    private int linearBlurExcludePointHandle;
    private int linearBlurExcludeSizeHandle;
    private int linearBlurInputTexCoordHandle;
    private int linearBlurPositionHandle;
    private int linearBlurShaderProgram;
    private int linearBlurSourceImage2Handle;
    private int linearBlurSourceImageHandle;
    private int positionHandle;
    private int radialBlurAspectRatioHandle;
    private int radialBlurExcludeBlurSizeHandle;
    private int radialBlurExcludePointHandle;
    private int radialBlurExcludeSizeHandle;
    private int radialBlurInputTexCoordHandle;
    private int radialBlurPositionHandle;
    private int radialBlurShaderProgram;
    private int radialBlurSourceImage2Handle;
    private int radialBlurSourceImageHandle;
    private int renderBufferHeight;
    private int renderBufferWidth;
    private int[] renderFrameBuffer;
    private int rgbToHsvMatrixHandle;
    private int saturationHandle;
    private int shadowsHandle;
    private int shadowsTintColorHandle;
    private int shadowsTintIntensityHandle;
    private int sharpenHandle;
    private int sharpenHeightHandle;
    private int sharpenInputTexCoordHandle;
    private int sharpenPositionHandle;
    private int sharpenShaderProgram;
    private int sharpenSourceImageHandle;
    private int sharpenWidthHandle;
    private BlurProgram skinBlurProgram;
    private boolean skinPassDrawn;
    private boolean skinTextureCreated;
    private int skipToneHandle;
    private int sourceImageHandle;
    public FloatBuffer textureBuffer;
    private ToneCurve toneCurve;
    private int toolsShaderProgram;
    public FloatBuffer vertexBuffer;
    public FloatBuffer vertexInvertBuffer;
    private float[] videoMatrix;
    private int videoTexture;
    private int vignetteHandle;
    private int warmthHandle;
    private int widthHandle;
    private boolean needUpdateBlurTexture = true;
    private boolean needUpdateSkinTexture = true;
    private int[] rgbToHsvShaderProgram = new int[2];
    private int[] rgbToHsvPositionHandle = new int[2];
    private int[] rgbToHsvInputTexCoordHandle = new int[2];
    private int[] rgbToHsvSourceImageHandle = new int[2];
    private int[] enhanceTextures = new int[2];
    private int[] enhanceFrameBuffer = new int[1];
    private int[] renderTexture = new int[4];
    private int[] bitmapTextre = new int[1];
    private int[] curveTextures = new int[1];

    public interface FilterShadersDelegate {
        ByteBuffer fillAndGetCurveBuffer();

        float getBlurAngle();

        float getBlurExcludeBlurSize();

        Point getBlurExcludePoint();

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

    public static String vertexShaderForOptimizedBlurOfRadius(int i, float f) {
        int i2;
        float[] fArr = new float[(i * 2) + 1];
        float f2 = 0.0f;
        int i3 = 0;
        while (true) {
            i2 = i + 1;
            if (i3 >= i2) {
                break;
            }
            double d = f;
            fArr[i3] = (float) ((1.0d / Math.sqrt(Math.pow(d, 2.0d) * 6.283185307179586d)) * Math.exp((-Math.pow(i3, 2.0d)) / (Math.pow(d, 2.0d) * 2.0d)));
            if (i3 == 0) {
                f2 += fArr[i3];
            } else {
                double d2 = f2;
                double d3 = fArr[i3];
                Double.isNaN(d3);
                Double.isNaN(d2);
                f2 = (float) (d2 + (d3 * 2.0d));
            }
            i3++;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            fArr[i4] = fArr[i4] / f2;
        }
        int min = Math.min((i / 2) + (i % 2), 7);
        float[] fArr2 = new float[min];
        for (int i5 = 0; i5 < min; i5++) {
            int i6 = i5 * 2;
            int i7 = i6 + 1;
            float f3 = fArr[i7];
            int i8 = i6 + 2;
            float f4 = fArr[i8];
            fArr2[i5] = ((f3 * i7) + (f4 * i8)) / (f3 + f4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("attribute vec4 position;\n");
        sb.append("attribute vec4 inputTexCoord;\n");
        sb.append("uniform float texelWidthOffset;\n");
        sb.append("uniform float texelHeightOffset;\n");
        sb.append(String.format(Locale.US, "varying vec2 blurCoordinates[%d];\n", Integer.valueOf((min * 2) + 1)));
        sb.append("void main()\n");
        sb.append("{\n");
        sb.append("gl_Position = position;\n");
        sb.append("vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n");
        sb.append("blurCoordinates[0] = inputTexCoord.xy;\n");
        for (int i9 = 0; i9 < min; i9++) {
            int i10 = i9 * 2;
            sb.append(String.format(Locale.US, "blurCoordinates[%d] = inputTexCoord.xy + singleStepOffset * %f;\nblurCoordinates[%d] = inputTexCoord.xy - singleStepOffset * %f;\n", Integer.valueOf(i10 + 1), Float.valueOf(fArr2[i9]), Integer.valueOf(i10 + 2), Float.valueOf(fArr2[i9])));
        }
        sb.append("}");
        return sb.toString();
    }

    public static String fragmentShaderForOptimizedBlurOfRadius(int i, float f) {
        int i2;
        float[] fArr = new float[(i * 2) + 1];
        float f2 = 0.0f;
        int i3 = 0;
        while (true) {
            i2 = i + 1;
            if (i3 >= i2) {
                break;
            }
            double d = f;
            fArr[i3] = (float) ((1.0d / Math.sqrt(Math.pow(d, 2.0d) * 6.283185307179586d)) * Math.exp((-Math.pow(i3, 2.0d)) / (Math.pow(d, 2.0d) * 2.0d)));
            if (i3 == 0) {
                f2 += fArr[i3];
            } else {
                double d2 = f2;
                double d3 = fArr[i3];
                Double.isNaN(d3);
                Double.isNaN(d2);
                f2 = (float) (d2 + (d3 * 2.0d));
            }
            i3++;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            fArr[i4] = fArr[i4] / f2;
        }
        int i5 = (i / 2) + (i % 2);
        int min = Math.min(i5, 7);
        StringBuilder sb = new StringBuilder();
        sb.append("uniform sampler2D sourceImage;\n");
        sb.append("uniform highp float texelWidthOffset;\n");
        sb.append("uniform highp float texelHeightOffset;\n");
        Locale locale = Locale.US;
        sb.append(String.format(locale, "varying highp vec2 blurCoordinates[%d];\n", Integer.valueOf((min * 2) + 1)));
        sb.append("void main()\n");
        sb.append("{\n");
        sb.append("lowp vec4 sum = vec4(0.0);\n");
        sb.append(String.format(locale, "sum += texture2D(sourceImage, blurCoordinates[0]) * %f;\n", Float.valueOf(fArr[0])));
        for (int i6 = 0; i6 < min; i6++) {
            int i7 = i6 * 2;
            int i8 = i7 + 1;
            int i9 = i7 + 2;
            float f3 = fArr[i8] + fArr[i9];
            Locale locale2 = Locale.US;
            sb.append(String.format(locale2, "sum += texture2D(sourceImage, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i8), Float.valueOf(f3)));
            sb.append(String.format(locale2, "sum += texture2D(sourceImage, blurCoordinates[%d]) * %f;\n", Integer.valueOf(i9), Float.valueOf(f3)));
        }
        if (i5 > min) {
            sb.append("highp vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n");
            while (min < i5) {
                int i10 = min * 2;
                int i11 = i10 + 1;
                float f4 = fArr[i11];
                int i12 = i10 + 2;
                float f5 = fArr[i12];
                float f6 = f4 + f5;
                float f7 = ((f4 * i11) + (f5 * i12)) / f6;
                Locale locale3 = Locale.US;
                sb.append(String.format(locale3, "sum += texture2D(sourceImage, blurCoordinates[0] + singleStepOffset * %f) * %f;\n", Float.valueOf(f7), Float.valueOf(f6)));
                sb.append(String.format(locale3, "sum += texture2D(sourceImage, blurCoordinates[0] - singleStepOffset * %f) * %f;\n", Float.valueOf(f7), Float.valueOf(f6)));
                min++;
            }
        }
        sb.append("gl_FragColor = sum;\n");
        sb.append("}\n");
        return sb.toString();
    }

    private static class BlurProgram {
        public int blurHeightHandle;
        public int blurInputTexCoordHandle;
        public int blurPositionHandle;
        public int blurShaderProgram;
        public int blurSourceImageHandle;
        public int blurWidthHandle;
        private String fragmentShaderCode;
        private String vertexShaderCode;

        public BlurProgram(float f, float f2, boolean z) {
            int i;
            if (z) {
                f2 = Math.round(f);
                i = 0;
                if (f2 >= 1.0f) {
                    double d = f2;
                    double d2 = 0.00390625f;
                    double sqrt = Math.sqrt(Math.pow(d, 2.0d) * 6.283185307179586d);
                    Double.isNaN(d2);
                    int floor = (int) Math.floor(Math.sqrt(Math.pow(d, 2.0d) * (-2.0d) * Math.log(d2 * sqrt)));
                    i = floor + (floor % 2);
                }
            } else {
                i = (int) f;
            }
            this.fragmentShaderCode = FilterShaders.fragmentShaderForOptimizedBlurOfRadius(i, f2);
            this.vertexShaderCode = FilterShaders.vertexShaderForOptimizedBlurOfRadius(i, f2);
        }

        public void destroy() {
            int i = this.blurShaderProgram;
            if (i != 0) {
                GLES20.glDeleteProgram(i);
                this.blurShaderProgram = 0;
            }
        }

        public boolean create() {
            int loadShader = FilterShaders.loadShader(35633, this.vertexShaderCode);
            int loadShader2 = FilterShaders.loadShader(35632, this.fragmentShaderCode);
            if (loadShader == 0 || loadShader2 == 0) {
                return false;
            }
            int glCreateProgram = GLES20.glCreateProgram();
            this.blurShaderProgram = glCreateProgram;
            GLES20.glAttachShader(glCreateProgram, loadShader);
            GLES20.glAttachShader(this.blurShaderProgram, loadShader2);
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
                this.blurSourceImageHandle = GLES20.glGetUniformLocation(this.blurShaderProgram, "sourceImage");
                this.blurWidthHandle = GLES20.glGetUniformLocation(this.blurShaderProgram, "texelWidthOffset");
                this.blurHeightHandle = GLES20.glGetUniformLocation(this.blurShaderProgram, "texelHeightOffset");
            }
            return true;
        }
    }

    private static class ToneCurve {
        private float[] blueCurve;
        private int[] curveTexture = new int[1];
        private float[] greenCurve;
        private float[] redCurve;
        private float[] rgbCompositeCurve;

        public ToneCurve() {
            ArrayList<PointF> arrayList = new ArrayList<>();
            arrayList.add(new PointF(0.0f, 0.0f));
            arrayList.add(new PointF(0.5f, 0.5f));
            arrayList.add(new PointF(1.0f, 1.0f));
            ArrayList<PointF> arrayList2 = new ArrayList<>();
            arrayList2.add(new PointF(0.0f, 0.0f));
            arrayList2.add(new PointF(0.47f, 0.57f));
            arrayList2.add(new PointF(1.0f, 1.0f));
            this.rgbCompositeCurve = getPreparedSplineCurve(arrayList2);
            float[] preparedSplineCurve = getPreparedSplineCurve(arrayList);
            this.blueCurve = preparedSplineCurve;
            this.greenCurve = preparedSplineCurve;
            this.redCurve = preparedSplineCurve;
            updateToneCurveTexture();
        }

        private float[] getPreparedSplineCurve(ArrayList<PointF> arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                PointF pointF = arrayList.get(i);
                pointF.x *= 255.0f;
                pointF.y *= 255.0f;
            }
            ArrayList<PointF> splineCurve = splineCurve(arrayList);
            float f = splineCurve.get(0).x;
            if (f > 0.0f) {
                for (int i2 = (int) f; i2 >= 0; i2--) {
                    splineCurve.add(0, new PointF(i2, 0.0f));
                }
            }
            float f2 = splineCurve.get(splineCurve.size() - 1).x;
            if (f2 < 255.0f) {
                int i3 = (int) f2;
                while (true) {
                    i3++;
                    if (i3 > 255) {
                        break;
                    }
                    splineCurve.add(new PointF(i3, 255.0f));
                }
            }
            float[] fArr = new float[splineCurve.size()];
            int size2 = splineCurve.size();
            for (int i4 = 0; i4 < size2; i4++) {
                PointF pointF2 = splineCurve.get(i4);
                float sqrt = (float) Math.sqrt(Math.pow(pointF2.x - pointF2.y, 2.0d));
                if (pointF2.x > pointF2.y) {
                    sqrt = -sqrt;
                }
                fArr[i4] = sqrt;
            }
            return fArr;
        }

        private ArrayList<PointF> splineCurve(ArrayList<PointF> arrayList) {
            double[] secondDerivative = secondDerivative(arrayList);
            int length = secondDerivative.length;
            if (length < 1) {
                return null;
            }
            ArrayList<PointF> arrayList2 = new ArrayList<>(length + 1);
            int i = 0;
            while (i < length - 1) {
                PointF pointF = arrayList.get(i);
                int i2 = i + 1;
                PointF pointF2 = arrayList.get(i2);
                int i3 = (int) pointF.x;
                while (true) {
                    float f = pointF2.x;
                    if (i3 < ((int) f)) {
                        float f2 = i3;
                        float f3 = pointF.x;
                        double d = f2 - f3;
                        ArrayList<PointF> arrayList3 = arrayList2;
                        double d2 = f - f3;
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        double d3 = d / d2;
                        double d4 = 1.0d - d3;
                        float f4 = f - f3;
                        int i4 = i3;
                        double d5 = f4;
                        double d6 = pointF.y;
                        Double.isNaN(d6);
                        PointF pointF3 = pointF;
                        int i5 = i2;
                        double d7 = pointF2.y;
                        Double.isNaN(d7);
                        Double.isNaN(d5);
                        Double.isNaN(d5);
                        float f5 = (float) ((d6 * d4) + (d7 * d3) + (((d5 * d5) / 6.0d) * (((((d4 * d4) * d4) - d4) * secondDerivative[i]) + ((((d3 * d3) * d3) - d3) * secondDerivative[i5]))));
                        if (f5 > 255.0f) {
                            f5 = 255.0f;
                        } else if (f5 < 0.0f) {
                            f5 = 0.0f;
                        }
                        arrayList3.add(new PointF(f2, f5));
                        i3 = i4 + 1;
                        arrayList2 = arrayList3;
                        pointF = pointF3;
                        i2 = i5;
                    }
                }
                i = i2;
            }
            ArrayList<PointF> arrayList4 = arrayList2;
            arrayList4.add(arrayList.get(arrayList.size() - 1));
            return arrayList4;
        }

        private double[] secondDerivative(ArrayList<PointF> arrayList) {
            int i;
            int size = arrayList.size();
            if (size > 0) {
                char c = 1;
                if (size == 1) {
                    return null;
                }
                char c2 = 0;
                double[][] dArr = (double[][]) Array.newInstance(double.class, size, 3);
                double[] dArr2 = new double[size];
                dArr[0][1] = 1.0d;
                double d = 0.0d;
                dArr[0][0] = 0.0d;
                dArr[0][2] = 0.0d;
                int i2 = 1;
                while (true) {
                    i = size - 1;
                    if (i2 >= i) {
                        break;
                    }
                    PointF pointF = arrayList.get(i2 - 1);
                    PointF pointF2 = arrayList.get(i2);
                    int i3 = i2 + 1;
                    PointF pointF3 = arrayList.get(i3);
                    double[] dArr3 = dArr[i2];
                    float f = pointF2.x;
                    float f2 = pointF.x;
                    double d2 = f - f2;
                    Double.isNaN(d2);
                    dArr3[c2] = d2 / 6.0d;
                    double[] dArr4 = dArr[i2];
                    float f3 = pointF3.x;
                    double[][] dArr5 = dArr;
                    double d3 = f3 - f2;
                    Double.isNaN(d3);
                    dArr4[c] = d3 / 3.0d;
                    double[] dArr6 = dArr5[i2];
                    double d4 = f3 - f;
                    Double.isNaN(d4);
                    dArr6[2] = d4 / 6.0d;
                    float f4 = pointF3.y;
                    float f5 = pointF2.y;
                    double d5 = f4 - f5;
                    double d6 = f3 - f;
                    Double.isNaN(d5);
                    Double.isNaN(d6);
                    double d7 = d5 / d6;
                    double d8 = f5 - pointF.y;
                    double d9 = f - f2;
                    Double.isNaN(d8);
                    Double.isNaN(d9);
                    dArr2[i2] = d7 - (d8 / d9);
                    i2 = i3;
                    dArr = dArr5;
                    c = 1;
                    c2 = 0;
                    d = 0.0d;
                }
                double[][] dArr7 = dArr;
                double d10 = d;
                char c3 = 0;
                dArr2[0] = d10;
                dArr2[i] = d10;
                dArr7[i][1] = 1.0d;
                dArr7[i][0] = d10;
                dArr7[i][2] = d10;
                int i4 = 1;
                while (i4 < size) {
                    int i5 = i4 - 1;
                    double d11 = dArr7[i4][c3] / dArr7[i5][1];
                    double[] dArr8 = dArr7[i4];
                    dArr8[1] = dArr8[1] - (dArr7[i5][2] * d11);
                    dArr7[i4][0] = 0.0d;
                    dArr2[i4] = dArr2[i4] - (d11 * dArr2[i5]);
                    i4++;
                    c3 = 0;
                }
                for (int i6 = size - 2; i6 >= 0; i6--) {
                    int i7 = i6 + 1;
                    double d12 = dArr7[i6][2] / dArr7[i7][1];
                    double[] dArr9 = dArr7[i6];
                    dArr9[1] = dArr9[1] - (dArr7[i7][0] * d12);
                    dArr7[i6][2] = 0.0d;
                    dArr2[i6] = dArr2[i6] - (d12 * dArr2[i7]);
                }
                double[] dArr10 = new double[size];
                for (int i8 = 0; i8 < size; i8++) {
                    dArr10[i8] = dArr2[i8] / dArr7[i8][1];
                }
                return dArr10;
            }
            return null;
        }

        private void updateToneCurveTexture() {
            GLES20.glGenTextures(1, this.curveTexture, 0);
            GLES20.glBindTexture(3553, this.curveTexture[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(ConnectionsManager.RequestFlagDoNotWaitFloodWait);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            if (this.redCurve.length < 256 || this.greenCurve.length < 256 || this.blueCurve.length < 256 || this.rgbCompositeCurve.length < 256) {
                return;
            }
            for (int i = 0; i < 256; i++) {
                float f = i;
                int min = (int) Math.min(Math.max(this.redCurve[i] + f, 0.0f), 255.0f);
                int min2 = (int) Math.min(Math.max(this.greenCurve[i] + f, 0.0f), 255.0f);
                int min3 = (int) Math.min(Math.max(f + this.blueCurve[i], 0.0f), 255.0f);
                allocateDirect.put((byte) Math.min(Math.max(min3 + this.rgbCompositeCurve[min3], 0.0f), 255.0f));
                allocateDirect.put((byte) Math.min(Math.max(min2 + this.rgbCompositeCurve[min2], 0.0f), 255.0f));
                allocateDirect.put((byte) Math.min(Math.max(min + this.rgbCompositeCurve[min], 0.0f), 255.0f));
                allocateDirect.put((byte) -1);
            }
            allocateDirect.position(0);
            GLES20.glTexImage2D(3553, 0, 6408, 256, 1, 0, 6408, 5121, allocateDirect);
        }

        public int getCurveTexture() {
            return this.curveTexture[0];
        }
    }

    public FilterShaders(boolean z) {
        this.isVideo = z;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.vertexBuffer = asFloatBuffer;
        asFloatBuffer.put(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f});
        this.vertexBuffer.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.vertexInvertBuffer = asFloatBuffer2;
        asFloatBuffer2.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.vertexInvertBuffer.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.textureBuffer = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        this.textureBuffer.position(0);
    }

    public void setDelegate(FilterShadersDelegate filterShadersDelegate) {
        this.delegate = filterShadersDelegate;
    }

    public boolean create() {
        String str;
        int loadShader;
        int loadShader2;
        String str2;
        int loadShader3;
        int i;
        char c = 0;
        GLES20.glGenTextures(1, this.curveTextures, 0);
        GLES20.glGenTextures(2, this.enhanceTextures, 0);
        GLES20.glGenFramebuffers(1, this.enhanceFrameBuffer, 0);
        GLES20.glBindTexture(3553, this.enhanceTextures[1]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glBindTexture(3553, this.curveTextures[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        int[] iArr = new int[1];
        int loadShader4 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
        int loadShader5 = loadShader(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;uniform highp float width;uniform highp float height;uniform sampler2D curvesImage;uniform lowp float skipTone;uniform lowp float shadows;const mediump vec3 hsLuminanceWeighting = vec3(0.3, 0.3, 0.3);uniform lowp float highlights;uniform lowp float contrast;uniform lowp float fadeAmount;const mediump vec3 satLuminanceWeighting = vec3(0.2126, 0.7152, 0.0722);uniform lowp float saturation;uniform lowp float shadowsTintIntensity;uniform lowp float highlightsTintIntensity;uniform lowp vec3 shadowsTintColor;uniform lowp vec3 highlightsTintColor;uniform lowp float exposure;uniform lowp float warmth;uniform lowp float grain;const lowp float permTexUnit = 1.0 / 256.0;const lowp float permTexUnitHalf = 0.5 / 256.0;const lowp float grainsize = 2.3;uniform lowp float vignette;highp float getLuma(highp vec3 rgbP) {return (0.299 * rgbP.r) + (0.587 * rgbP.g) + (0.114 * rgbP.b);}lowp vec3 rgbToHsv(lowp vec3 c) {highp vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);highp vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);highp vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);highp float d = q.x - min(q.w, q.y);highp float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}lowp vec3 hsvToRgb(lowp vec3 c) {highp vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);highp vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}highp vec3 rgbToHsl(highp vec3 color) {highp vec3 hsl;highp float fmin = min(min(color.r, color.g), color.b);highp float fmax = max(max(color.r, color.g), color.b);highp float delta = fmax - fmin;hsl.z = (fmax + fmin) / 2.0;if (delta == 0.0) {hsl.x = 0.0;hsl.y = 0.0;} else {if (hsl.z < 0.5) {hsl.y = delta / (fmax + fmin);} else {hsl.y = delta / (2.0 - fmax - fmin);}highp float deltaR = (((fmax - color.r) / 6.0) + (delta / 2.0)) / delta;highp float deltaG = (((fmax - color.g) / 6.0) + (delta / 2.0)) / delta;highp float deltaB = (((fmax - color.b) / 6.0) + (delta / 2.0)) / delta;if (color.r == fmax) {hsl.x = deltaB - deltaG;} else if (color.g == fmax) {hsl.x = (1.0 / 3.0) + deltaR - deltaB;} else if (color.b == fmax) {hsl.x = (2.0 / 3.0) + deltaG - deltaR;}if (hsl.x < 0.0) {hsl.x += 1.0;} else if (hsl.x > 1.0) {hsl.x -= 1.0;}}return hsl;}highp float hueToRgb(highp float f1, highp float f2, highp float hue) {if (hue < 0.0) {hue += 1.0;} else if (hue > 1.0) {hue -= 1.0;}highp float res;if ((6.0 * hue) < 1.0) {res = f1 + (f2 - f1) * 6.0 * hue;} else if ((2.0 * hue) < 1.0) {res = f2;} else if ((3.0 * hue) < 2.0) {res = f1 + (f2 - f1) * ((2.0 / 3.0) - hue) * 6.0;} else {res = f1;}return res;}highp vec3 hslToRgb(highp vec3 hsl) {if (hsl.y == 0.0) {return vec3(hsl.z);} else {highp float f2;if (hsl.z < 0.5) {f2 = hsl.z * (1.0 + hsl.y);} else {f2 = (hsl.z + hsl.y) - (hsl.y * hsl.z);}highp float f1 = 2.0 * hsl.z - f2;return vec3(hueToRgb(f1, f2, hsl.x + (1.0/3.0)), hueToRgb(f1, f2, hsl.x), hueToRgb(f1, f2, hsl.x - (1.0/3.0)));}}highp vec3 rgbToYuv(highp vec3 inP) {highp float luma = getLuma(inP);return vec3(luma, (1.0 / 1.772) * (inP.b - luma), (1.0 / 1.402) * (inP.r - luma));}lowp vec3 yuvToRgb(highp vec3 inP) {return vec3(1.402 * inP.b + inP.r, (inP.r - (0.299 * 1.402 / 0.587) * inP.b - (0.114 * 1.772 / 0.587) * inP.g), 1.772 * inP.g + inP.r);}lowp float easeInOutSigmoid(lowp float value, lowp float strength) {if (value > 0.5) {return 1.0 - pow(2.0 - 2.0 * value, 1.0 / (1.0 - strength)) * 0.5;} else {return pow(2.0 * value, 1.0 / (1.0 - strength)) * 0.5;}}lowp vec3 applyLuminanceCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.z / (1.0 / 200.0), 0.0, 199.0));pixel.y = mix(0.0, pixel.y, smoothstep(0.0, 0.1, pixel.z) * (1.0 - smoothstep(0.8, 1.0, pixel.z)));pixel.z = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).a;return pixel;}lowp vec3 applyRGBCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.r / (1.0 / 200.0), 0.0, 199.0));pixel.r = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).r;index = floor(clamp(pixel.g / (1.0 / 200.0), 0.0, 199.0));pixel.g = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).g, 0.0, 1.0);index = floor(clamp(pixel.b / (1.0 / 200.0), 0.0, 199.0));pixel.b = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).b, 0.0, 1.0);return pixel;}highp vec3 fadeAdjust(highp vec3 color, highp float fadeVal) {return (color * (1.0 - fadeVal)) + ((color + (vec3(-0.9772) * pow(vec3(color), vec3(3.0)) + vec3(1.708) * pow(vec3(color), vec3(2.0)) + vec3(-0.1603) * vec3(color) + vec3(0.2878) - color * vec3(0.9))) * fadeVal);}lowp vec3 tintRaiseShadowsCurve(lowp vec3 color) {return vec3(-0.003671) * pow(color, vec3(3.0)) + vec3(0.3842) * pow(color, vec3(2.0)) + vec3(0.3764) * color + vec3(0.2515);}lowp vec3 tintShadows(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, tintRaiseShadowsCurve(texel), tintColor), tintAmount), 0.0, 1.0);} lowp vec3 tintHighlights(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, vec3(1.0) - tintRaiseShadowsCurve(vec3(1.0) - texel), (vec3(1.0) - tintColor)), tintAmount), 0.0, 1.0);}highp vec4 rnm(in highp vec2 tc) {highp float noise = sin(dot(tc, vec2(12.9898, 78.233))) * 43758.5453;return vec4(fract(noise), fract(noise * 1.2154), fract(noise * 1.3453), fract(noise * 1.3647)) * 2.0 - 1.0;}highp float fade(in highp float t) {return t * t * t * (t * (t * 6.0 - 15.0) + 10.0);}highp float pnoise3D(in highp vec3 p) {highp vec3 pi = permTexUnit * floor(p) + permTexUnitHalf;highp vec3 pf = fract(p);highp float perm = rnm(pi.xy).a;highp float n000 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf);highp float n001 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(0.0, permTexUnit)).a;highp float n010 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 0.0));highp float n011 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, 0.0)).a;highp float n100 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 0.0));highp float n101 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, permTexUnit)).a;highp float n110 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 0.0));highp float n111 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 1.0));highp vec4 n_x = mix(vec4(n000, n001, n010, n011), vec4(n100, n101, n110, n111), fade(pf.x));highp vec2 n_xy = mix(n_x.xy, n_x.zw, fade(pf.y));return mix(n_xy.x, n_xy.y, fade(pf.z));}lowp vec2 coordRot(in lowp vec2 tc, in lowp float angle) {return vec2(((tc.x * 2.0 - 1.0) * cos(angle) - (tc.y * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5, ((tc.y * 2.0 - 1.0) * cos(angle) + (tc.x * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5);}void main() {lowp vec4 source = texture2D(sourceImage, texCoord);lowp vec4 result = source;const lowp float toolEpsilon = 0.005;if (skipTone < toolEpsilon) {result = vec4(applyRGBCurve(hslToRgb(applyLuminanceCurve(rgbToHsl(result.rgb)))), result.a);}mediump float hsLuminance = dot(result.rgb, hsLuminanceWeighting);mediump float shadow = clamp((pow(hsLuminance, 1.0 / shadows) + (-0.76) * pow(hsLuminance, 2.0 / shadows)) - hsLuminance, 0.0, 1.0);mediump float highlight = clamp((1.0 - (pow(1.0 - hsLuminance, 1.0 / (2.0 - highlights)) + (-0.8) * pow(1.0 - hsLuminance, 2.0 / (2.0 - highlights)))) - hsLuminance, -1.0, 0.0);lowp vec3 hsresult = vec3(0.0, 0.0, 0.0) + ((hsLuminance + shadow + highlight) - 0.0) * ((result.rgb - vec3(0.0, 0.0, 0.0)) / (hsLuminance - 0.0));mediump float contrastedLuminance = ((hsLuminance - 0.5) * 1.5) + 0.5;mediump float whiteInterp = contrastedLuminance * contrastedLuminance * contrastedLuminance;mediump float whiteTarget = clamp(highlights, 1.0, 2.0) - 1.0;hsresult = mix(hsresult, vec3(1.0), whiteInterp * whiteTarget);mediump float invContrastedLuminance = 1.0 - contrastedLuminance;mediump float blackInterp = invContrastedLuminance * invContrastedLuminance * invContrastedLuminance;mediump float blackTarget = 1.0 - clamp(shadows, 0.0, 1.0);hsresult = mix(hsresult, vec3(0.0), blackInterp * blackTarget);result = vec4(hsresult.rgb, result.a);result = vec4(clamp(((result.rgb - vec3(0.5)) * contrast + vec3(0.5)), 0.0, 1.0), result.a);if (abs(fadeAmount) > toolEpsilon) {result.rgb = fadeAdjust(result.rgb, fadeAmount);}lowp float satLuminance = dot(result.rgb, satLuminanceWeighting);lowp vec3 greyScaleColor = vec3(satLuminance);result = vec4(clamp(mix(greyScaleColor, result.rgb, saturation), 0.0, 1.0), result.a);if (abs(shadowsTintIntensity) > toolEpsilon) {result.rgb = tintShadows(result.rgb, shadowsTintColor, shadowsTintIntensity * 2.0);}if (abs(highlightsTintIntensity) > toolEpsilon) {result.rgb = tintHighlights(result.rgb, highlightsTintColor, highlightsTintIntensity * 2.0);}if (abs(exposure) > toolEpsilon) {mediump float mag = exposure * 1.045;mediump float exppower = 1.0 + abs(mag);if (mag < 0.0) {exppower = 1.0 / exppower;}result.r = 1.0 - pow((1.0 - result.r), exppower);result.g = 1.0 - pow((1.0 - result.g), exppower);result.b = 1.0 - pow((1.0 - result.b), exppower);}if (abs(warmth) > toolEpsilon) {highp vec3 yuvVec;if (warmth > 0.0 ) {yuvVec = vec3(0.1765, -0.1255, 0.0902);} else {yuvVec = -vec3(0.0588, 0.1569, -0.1255);}highp vec3 yuvColor = rgbToYuv(result.rgb);highp float luma = yuvColor.r;highp float curveScale = sin(luma * 3.14159);yuvColor += 0.375 * warmth * curveScale * yuvVec;result.rgb = yuvToRgb(yuvColor);}if (abs(grain) > toolEpsilon) {highp vec3 rotOffset = vec3(1.425, 3.892, 5.835);highp vec2 rotCoordsR = coordRot(texCoord, rotOffset.x);highp vec3 noise = vec3(pnoise3D(vec3(rotCoordsR * vec2(width / grainsize, height / grainsize),0.0)));lowp vec3 lumcoeff = vec3(0.299,0.587,0.114);lowp float luminance = dot(result.rgb, lumcoeff);lowp float lum = smoothstep(0.2, 0.0, luminance);lum += luminance;noise = mix(noise,vec3(0.0),pow(lum,4.0));result.rgb = result.rgb + noise * grain;}if (abs(vignette) > toolEpsilon) {const lowp float midpoint = 0.7;const lowp float fuzziness = 0.62;lowp float radDist = length(texCoord - 0.5) / sqrt(0.5);lowp float mag = easeInOutSigmoid(radDist * midpoint, fuzziness) * vignette * 0.645;result.rgb = mix(pow(result.rgb, vec3(1.0 / (1.0 - mag))), vec3(0.0), mag * mag);}gl_FragColor = result;}");
        if (loadShader4 == 0 || loadShader5 == 0) {
            return false;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.toolsShaderProgram = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, loadShader4);
        GLES20.glAttachShader(this.toolsShaderProgram, loadShader5);
        GLES20.glBindAttribLocation(this.toolsShaderProgram, 0, "position");
        GLES20.glBindAttribLocation(this.toolsShaderProgram, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.toolsShaderProgram);
        GLES20.glGetProgramiv(this.toolsShaderProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.toolsShaderProgram);
            this.toolsShaderProgram = 0;
        } else {
            this.positionHandle = GLES20.glGetAttribLocation(this.toolsShaderProgram, "position");
            this.inputTexCoordHandle = GLES20.glGetAttribLocation(this.toolsShaderProgram, "inputTexCoord");
            this.sourceImageHandle = GLES20.glGetUniformLocation(this.toolsShaderProgram, "sourceImage");
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
        int loadShader6 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;uniform highp float inputWidth;uniform highp float inputHeight;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;void main() {gl_Position = position;texCoord = inputTexCoord;highp vec2 widthStep = vec2(1.0 / inputWidth, 0.0);highp vec2 heightStep = vec2(0.0, 1.0 / inputHeight);leftTexCoord = inputTexCoord - widthStep;rightTexCoord = inputTexCoord + widthStep;topTexCoord = inputTexCoord + heightStep;bottomTexCoord = inputTexCoord - heightStep;}");
        int loadShader7 = loadShader(35632, "precision highp float;varying vec2 texCoord;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;uniform sampler2D sourceImage;uniform float sharpen;void main() {vec4 result = texture2D(sourceImage, texCoord);vec3 leftTextureColor = texture2D(sourceImage, leftTexCoord).rgb;vec3 rightTextureColor = texture2D(sourceImage, rightTexCoord).rgb;vec3 topTextureColor = texture2D(sourceImage, topTexCoord).rgb;vec3 bottomTextureColor = texture2D(sourceImage, bottomTexCoord).rgb;result.rgb = result.rgb * (1.0 + 4.0 * sharpen) - (leftTextureColor + rightTextureColor + topTextureColor + bottomTextureColor) * sharpen;gl_FragColor = result;}");
        if (loadShader6 == 0 || loadShader7 == 0) {
            return false;
        }
        int glCreateProgram2 = GLES20.glCreateProgram();
        this.sharpenShaderProgram = glCreateProgram2;
        GLES20.glAttachShader(glCreateProgram2, loadShader6);
        GLES20.glAttachShader(this.sharpenShaderProgram, loadShader7);
        GLES20.glBindAttribLocation(this.sharpenShaderProgram, 0, "position");
        GLES20.glBindAttribLocation(this.sharpenShaderProgram, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.sharpenShaderProgram);
        GLES20.glGetProgramiv(this.sharpenShaderProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.sharpenShaderProgram);
            this.sharpenShaderProgram = 0;
        } else {
            this.sharpenPositionHandle = GLES20.glGetAttribLocation(this.sharpenShaderProgram, "position");
            this.sharpenInputTexCoordHandle = GLES20.glGetAttribLocation(this.sharpenShaderProgram, "inputTexCoord");
            this.sharpenSourceImageHandle = GLES20.glGetUniformLocation(this.sharpenShaderProgram, "sourceImage");
            this.sharpenWidthHandle = GLES20.glGetUniformLocation(this.sharpenShaderProgram, "inputWidth");
            this.sharpenHeightHandle = GLES20.glGetUniformLocation(this.sharpenShaderProgram, "inputHeight");
            this.sharpenHandle = GLES20.glGetUniformLocation(this.sharpenShaderProgram, "sharpen");
        }
        BlurProgram blurProgram = new BlurProgram(8.0f, 3.0f, false);
        this.blurProgram = blurProgram;
        if (!blurProgram.create()) {
            return false;
        }
        boolean z = this.isVideo;
        String str3 = z ? "#extension GL_OES_EGL_image_external : require" : "";
        String str4 = z ? "samplerExternalOES" : "sampler2D";
        int loadShader8 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
        int loadShader9 = loadShader(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float angle;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sourceImage, texCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, texCoord);highp vec2 texCoordToUse = vec2(texCoord.x, (texCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = abs((texCoordToUse.x - excludePoint.x) * aspectRatio * cos(angle) + (texCoordToUse.y - excludePoint.y) * sin(angle));gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
        if (loadShader8 == 0 || loadShader9 == 0) {
            return false;
        }
        int glCreateProgram3 = GLES20.glCreateProgram();
        this.linearBlurShaderProgram = glCreateProgram3;
        GLES20.glAttachShader(glCreateProgram3, loadShader8);
        GLES20.glAttachShader(this.linearBlurShaderProgram, loadShader9);
        GLES20.glBindAttribLocation(this.linearBlurShaderProgram, 0, "position");
        GLES20.glBindAttribLocation(this.linearBlurShaderProgram, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.linearBlurShaderProgram);
        GLES20.glGetProgramiv(this.linearBlurShaderProgram, 35714, iArr, 0);
        String str5 = "inputImageTexture2";
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.linearBlurShaderProgram);
            this.linearBlurShaderProgram = 0;
        } else {
            this.linearBlurPositionHandle = GLES20.glGetAttribLocation(this.linearBlurShaderProgram, "position");
            this.linearBlurInputTexCoordHandle = GLES20.glGetAttribLocation(this.linearBlurShaderProgram, "inputTexCoord");
            this.linearBlurSourceImageHandle = GLES20.glGetUniformLocation(this.linearBlurShaderProgram, "sourceImage");
            this.linearBlurSourceImage2Handle = GLES20.glGetUniformLocation(this.linearBlurShaderProgram, "inputImageTexture2");
            this.linearBlurExcludeSizeHandle = GLES20.glGetUniformLocation(this.linearBlurShaderProgram, "excludeSize");
            this.linearBlurExcludePointHandle = GLES20.glGetUniformLocation(this.linearBlurShaderProgram, "excludePoint");
            this.linearBlurExcludeBlurSizeHandle = GLES20.glGetUniformLocation(this.linearBlurShaderProgram, "excludeBlurSize");
            this.linearBlurAngleHandle = GLES20.glGetUniformLocation(this.linearBlurShaderProgram, "angle");
            this.linearBlurAspectRatioHandle = GLES20.glGetUniformLocation(this.linearBlurShaderProgram, "aspectRatio");
        }
        int loadShader10 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
        int loadShader11 = loadShader(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sourceImage, texCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, texCoord);highp vec2 texCoordToUse = vec2(texCoord.x, (texCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = distance(excludePoint, texCoordToUse);gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
        if (loadShader10 == 0 || loadShader11 == 0) {
            return false;
        }
        int glCreateProgram4 = GLES20.glCreateProgram();
        this.radialBlurShaderProgram = glCreateProgram4;
        GLES20.glAttachShader(glCreateProgram4, loadShader10);
        GLES20.glAttachShader(this.radialBlurShaderProgram, loadShader11);
        GLES20.glBindAttribLocation(this.radialBlurShaderProgram, 0, "position");
        GLES20.glBindAttribLocation(this.radialBlurShaderProgram, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.radialBlurShaderProgram);
        GLES20.glGetProgramiv(this.radialBlurShaderProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.radialBlurShaderProgram);
            this.radialBlurShaderProgram = 0;
        } else {
            this.radialBlurPositionHandle = GLES20.glGetAttribLocation(this.radialBlurShaderProgram, "position");
            this.radialBlurInputTexCoordHandle = GLES20.glGetAttribLocation(this.radialBlurShaderProgram, "inputTexCoord");
            this.radialBlurSourceImageHandle = GLES20.glGetUniformLocation(this.radialBlurShaderProgram, "sourceImage");
            this.radialBlurSourceImage2Handle = GLES20.glGetUniformLocation(this.radialBlurShaderProgram, "inputImageTexture2");
            this.radialBlurExcludeSizeHandle = GLES20.glGetUniformLocation(this.radialBlurShaderProgram, "excludeSize");
            this.radialBlurExcludePointHandle = GLES20.glGetUniformLocation(this.radialBlurShaderProgram, "excludePoint");
            this.radialBlurExcludeBlurSizeHandle = GLES20.glGetUniformLocation(this.radialBlurShaderProgram, "excludeBlurSize");
            this.radialBlurAspectRatioHandle = GLES20.glGetUniformLocation(this.radialBlurShaderProgram, "aspectRatio");
        }
        int i2 = 0;
        while (true) {
            boolean z2 = this.isVideo;
            if (i2 >= (z2 ? 2 : 1)) {
                String str6 = str5;
                int loadShader12 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                int loadShader13 = loadShader(35632, "precision highp float;varying vec2 texCoord;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;uniform float intensity;float enhance(float value) {const vec2 offset = vec2(0.001953125, 0.03125);value = value + offset.x;vec2 coord = (clamp(texCoord, 0.125, 1.0 - 0.125001) - 0.125) * 4.0;vec2 frac = fract(coord);coord = floor(coord);float p00 = float(coord.y * 4.0 + coord.x) * 0.0625 + offset.y;float p01 = float(coord.y * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;float p10 = float((coord.y + 1.0) * 4.0 + coord.x) * 0.0625 + offset.y;float p11 = float((coord.y + 1.0) * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;vec3 c00 = texture2D(inputImageTexture2, vec2(value, p00)).rgb;vec3 c01 = texture2D(inputImageTexture2, vec2(value, p01)).rgb;vec3 c10 = texture2D(inputImageTexture2, vec2(value, p10)).rgb;vec3 c11 = texture2D(inputImageTexture2, vec2(value, p11)).rgb;float c1 = ((c00.r - c00.g) / (c00.b - c00.g));float c2 = ((c01.r - c01.g) / (c01.b - c01.g));float c3 = ((c10.r - c10.g) / (c10.b - c10.g));float c4 = ((c11.r - c11.g) / (c11.b - c11.g));float c1_2 = mix(c1, c2, frac.x);float c3_4 = mix(c3, c4, frac.x);return mix(c1_2, c3_4, frac.y);}vec3 hsv_to_rgb(vec3 c) {vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}void main() {vec4 texel = texture2D(sourceImage, texCoord);vec4 hsv = texel;hsv.y = min(1.0, hsv.y * 1.2);hsv.z = min(1.0, enhance(hsv.z) * 1.1);gl_FragColor = vec4(hsv_to_rgb(mix(texel.xyz, hsv.xyz, intensity)), texel.w);}");
                if (loadShader12 == 0 || loadShader13 == 0) {
                    return false;
                }
                int glCreateProgram5 = GLES20.glCreateProgram();
                this.enhanceShaderProgram = glCreateProgram5;
                GLES20.glAttachShader(glCreateProgram5, loadShader12);
                GLES20.glAttachShader(this.enhanceShaderProgram, loadShader13);
                GLES20.glBindAttribLocation(this.enhanceShaderProgram, 0, "position");
                GLES20.glBindAttribLocation(this.enhanceShaderProgram, 1, "inputTexCoord");
                GLES20.glLinkProgram(this.enhanceShaderProgram);
                GLES20.glGetProgramiv(this.enhanceShaderProgram, 35714, iArr, 0);
                if (iArr[0] == 0) {
                    GLES20.glDeleteProgram(this.enhanceShaderProgram);
                    this.enhanceShaderProgram = 0;
                    str = str6;
                } else {
                    this.enhancePositionHandle = GLES20.glGetAttribLocation(this.enhanceShaderProgram, "position");
                    this.enhanceInputTexCoordHandle = GLES20.glGetAttribLocation(this.enhanceShaderProgram, "inputTexCoord");
                    this.enhanceSourceImageHandle = GLES20.glGetUniformLocation(this.enhanceShaderProgram, "sourceImage");
                    this.enhanceIntensityHandle = GLES20.glGetUniformLocation(this.enhanceShaderProgram, "intensity");
                    str = str6;
                    this.enhanceInputImageTexture2Handle = GLES20.glGetUniformLocation(this.enhanceShaderProgram, str);
                }
                if (this.isVideo) {
                    loadShader = loadShader(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                } else {
                    loadShader = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                }
                Locale locale = Locale.US;
                int loadShader14 = loadShader(35632, String.format(locale, "%1$s\nprecision lowp float;varying highp vec2 texCoord;uniform %2$s sourceImage;void main() {vec4 inp = texture2D(sourceImage, texCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str3, str4));
                if (loadShader == 0 || loadShader14 == 0) {
                    return false;
                }
                int glCreateProgram6 = GLES20.glCreateProgram();
                this.greenAndBlueChannelOverlayProgram = glCreateProgram6;
                GLES20.glAttachShader(glCreateProgram6, loadShader);
                GLES20.glAttachShader(this.greenAndBlueChannelOverlayProgram, loadShader14);
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
                    this.greenAndBlueChannelOverlaySourceImageHandle = GLES20.glGetUniformLocation(this.greenAndBlueChannelOverlayProgram, "sourceImage");
                    if (this.isVideo) {
                        this.greenAndBlueChannelOverlayMatrixHandle = GLES20.glGetUniformLocation(this.greenAndBlueChannelOverlayProgram, "videoMatrix");
                    }
                }
                int loadShader15 = loadShader(35632, "precision lowp float;varying highp vec2 texCoord;varying highp vec2 texCoord2;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;void main() {vec4 image = texture2D(sourceImage, texCoord);vec4 blurredImage = texture2D(inputImageTexture2, texCoord2);gl_FragColor = vec4((image.rgb - blurredImage.rgb + vec3(0.5,0.5,0.5)), image.a);}");
                int loadShader16 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;varying vec2 texCoord2;void main() {gl_Position = position;texCoord = inputTexCoord;texCoord2 = inputTexCoord;}");
                if (loadShader16 == 0 || loadShader15 == 0) {
                    return false;
                }
                int glCreateProgram7 = GLES20.glCreateProgram();
                this.highPassProgram = glCreateProgram7;
                GLES20.glAttachShader(glCreateProgram7, loadShader16);
                GLES20.glAttachShader(this.highPassProgram, loadShader15);
                GLES20.glBindAttribLocation(this.highPassProgram, 0, "position");
                GLES20.glBindAttribLocation(this.highPassProgram, 1, "inputTexCoord");
                GLES20.glLinkProgram(this.highPassProgram);
                GLES20.glGetProgramiv(this.highPassProgram, 35714, iArr, 0);
                if (iArr[0] == 0) {
                    GLES20.glDeleteProgram(this.highPassProgram);
                    this.highPassProgram = 0;
                } else {
                    this.highPassPositionHandle = GLES20.glGetAttribLocation(this.highPassProgram, "position");
                    this.highPassInputTexCoordHandle = GLES20.glGetAttribLocation(this.highPassProgram, "inputTexCoord");
                    this.highPassSourceImageHandle = GLES20.glGetUniformLocation(this.highPassProgram, "sourceImage");
                    this.highPassInputImageHandle = GLES20.glGetUniformLocation(this.highPassProgram, str);
                }
                int loadShader17 = loadShader(35632, "precision lowp float;varying highp vec2 texCoord;uniform sampler2D sourceImage;void main() {vec4 color = texture2D(sourceImage, texCoord);float hardLightColor = color.b;for (int i = 0; i < 3; ++i){if (hardLightColor < 0.5) {hardLightColor = hardLightColor * hardLightColor * 2.0;} else {hardLightColor = 1.0 - (1.0 - hardLightColor) * (1.0 - hardLightColor) * 2.0;}}float k = 255.0 / (164.0 - 75.0);hardLightColor = (hardLightColor - 75.0 / 255.0) * k;gl_FragColor = vec4(vec3(hardLightColor), color.a);}");
                int loadShader18 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                if (loadShader18 == 0 || loadShader17 == 0) {
                    return false;
                }
                int glCreateProgram8 = GLES20.glCreateProgram();
                this.boostProgram = glCreateProgram8;
                GLES20.glAttachShader(glCreateProgram8, loadShader18);
                GLES20.glAttachShader(this.boostProgram, loadShader17);
                GLES20.glBindAttribLocation(this.boostProgram, 0, "position");
                GLES20.glBindAttribLocation(this.boostProgram, 1, "inputTexCoord");
                GLES20.glLinkProgram(this.boostProgram);
                GLES20.glGetProgramiv(this.boostProgram, 35714, iArr, 0);
                if (iArr[0] == 0) {
                    GLES20.glDeleteProgram(this.boostProgram);
                    this.boostProgram = 0;
                } else {
                    this.boostPositionHandle = GLES20.glGetAttribLocation(this.boostProgram, "position");
                    this.boostInputTexCoordHandle = GLES20.glGetAttribLocation(this.boostProgram, "inputTexCoord");
                    this.boostSourceImageHandle = GLES20.glGetUniformLocation(this.boostProgram, "sourceImage");
                }
                if (this.isVideo) {
                    loadShader2 = loadShader(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 texCoord;varying vec2 texCoord2;void main() {gl_Position = position;texCoord = vec2(videoMatrix * inputTexCoord).xy;texCoord2 = inputTexCoord.xy;}");
                } else {
                    loadShader2 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;varying vec2 texCoord2;void main() {gl_Position = position;texCoord = inputTexCoord;texCoord2 = inputTexCoord;}");
                }
                int loadShader19 = loadShader(35632, String.format(locale, "%1$s\nprecision lowp float;varying highp vec2 texCoord;varying highp vec2 texCoord2;uniform %2$s sourceImage;uniform sampler2D toneCurveTexture;uniform sampler2D inputImageTexture3;uniform lowp float mixturePercent;void main() {vec4 image = texture2D(sourceImage, texCoord);vec4 mask = texture2D(inputImageTexture3, texCoord2);float redCurveValue = texture2D(toneCurveTexture, vec2(image.r, 0.0)).r;float greenCurveValue = texture2D(toneCurveTexture, vec2(image.g, 0.0)).g;float blueCurveValue = texture2D(toneCurveTexture, vec2(image.b, 0.0)).b;vec4 result = vec4(redCurveValue, greenCurveValue, blueCurveValue, image.a);vec4 tone = mix(image, result, mixturePercent);gl_FragColor = vec4(mix(image.rgb, tone.rgb, 1.0 - mask.b), 1.0);}", str3, str4));
                if (loadShader2 == 0 || loadShader19 == 0) {
                    return false;
                }
                int glCreateProgram9 = GLES20.glCreateProgram();
                this.compositeProgram = glCreateProgram9;
                GLES20.glAttachShader(glCreateProgram9, loadShader2);
                GLES20.glAttachShader(this.compositeProgram, loadShader19);
                GLES20.glBindAttribLocation(this.compositeProgram, 0, "position");
                GLES20.glBindAttribLocation(this.compositeProgram, 1, "inputTexCoord");
                GLES20.glLinkProgram(this.compositeProgram);
                GLES20.glGetProgramiv(this.compositeProgram, 35714, iArr, 0);
                if (iArr[0] == 0) {
                    GLES20.glDeleteProgram(this.compositeProgram);
                    this.compositeProgram = 0;
                } else {
                    this.compositePositionHandle = GLES20.glGetAttribLocation(this.compositeProgram, "position");
                    this.compositeInputTexCoordHandle = GLES20.glGetAttribLocation(this.compositeProgram, "inputTexCoord");
                    this.compositeSourceImageHandle = GLES20.glGetUniformLocation(this.compositeProgram, "sourceImage");
                    this.compositeInputImageHandle = GLES20.glGetUniformLocation(this.compositeProgram, "inputImageTexture3");
                    this.compositeCurveImageHandle = GLES20.glGetUniformLocation(this.compositeProgram, "toneCurveTexture");
                    this.compositeMixtureHandle = GLES20.glGetUniformLocation(this.compositeProgram, "mixturePercent");
                    if (this.isVideo) {
                        this.compositeMatrixHandle = GLES20.glGetUniformLocation(this.compositeProgram, "videoMatrix");
                    }
                }
                this.toneCurve = new ToneCurve();
                return true;
            }
            if (i2 == 1 && z2) {
                int loadShader20 = loadShader(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                Locale locale2 = Locale.US;
                str2 = str5;
                Object[] objArr = new Object[2];
                objArr[c] = str3;
                objArr[1] = str4;
                loadShader3 = loadShader(35632, String.format(locale2, "%1$s\nprecision highp float;varying vec2 texCoord;uniform %2$s sourceImage;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = texture2D(sourceImage, texCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}", objArr));
                i = loadShader20;
            } else {
                str2 = str5;
                int loadShader21 = loadShader(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                loadShader3 = loadShader(35632, String.format(Locale.US, "%1$s\nprecision highp float;varying vec2 texCoord;uniform %2$s sourceImage;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = texture2D(sourceImage, texCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}", "", "sampler2D"));
                i = loadShader21;
            }
            if (i == 0 || loadShader3 == 0) {
                return false;
            }
            this.rgbToHsvShaderProgram[i2] = GLES20.glCreateProgram();
            GLES20.glAttachShader(this.rgbToHsvShaderProgram[i2], i);
            GLES20.glAttachShader(this.rgbToHsvShaderProgram[i2], loadShader3);
            GLES20.glBindAttribLocation(this.rgbToHsvShaderProgram[i2], 0, "position");
            GLES20.glBindAttribLocation(this.rgbToHsvShaderProgram[i2], 1, "inputTexCoord");
            GLES20.glLinkProgram(this.rgbToHsvShaderProgram[i2]);
            GLES20.glGetProgramiv(this.rgbToHsvShaderProgram[i2], 35714, iArr, 0);
            if (iArr[0] == 0) {
                GLES20.glDeleteProgram(this.rgbToHsvShaderProgram[i2]);
                this.rgbToHsvShaderProgram[i2] = 0;
            } else {
                this.rgbToHsvPositionHandle[i2] = GLES20.glGetAttribLocation(this.rgbToHsvShaderProgram[i2], "position");
                this.rgbToHsvInputTexCoordHandle[i2] = GLES20.glGetAttribLocation(this.rgbToHsvShaderProgram[i2], "inputTexCoord");
                this.rgbToHsvSourceImageHandle[i2] = GLES20.glGetUniformLocation(this.rgbToHsvShaderProgram[i2], "sourceImage");
                if (i2 == 1) {
                    this.rgbToHsvMatrixHandle = GLES20.glGetUniformLocation(this.rgbToHsvShaderProgram[i2], "videoMatrix");
                }
            }
            i2++;
            str5 = str2;
            c = 0;
        }
    }

    public void setRenderData(Bitmap bitmap, int i, int i2, int i3, int i4) {
        loadTexture(bitmap, i, i3, i4);
        this.videoTexture = i2;
        GLES20.glBindTexture(3553, this.enhanceTextures[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, this.renderBufferWidth, this.renderBufferHeight, 0, 6408, 5121, null);
    }

    public static int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.m34e(GLES20.glGetShaderInfoLog(glCreateShader));
                FileLog.m34e("shader code:\n " + str);
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public void drawEnhancePass() {
        char c;
        boolean z = this.isVideo;
        if (z ? true : !this.hsvGenerated) {
            if (z && !this.skinPassDrawn) {
                GLES20.glUseProgram(this.rgbToHsvShaderProgram[1]);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, this.videoTexture);
                GLES20.glUniformMatrix4fv(this.rgbToHsvMatrixHandle, 1, false, this.videoMatrix, 0);
                c = 1;
            } else {
                GLES20.glUseProgram(this.rgbToHsvShaderProgram[0]);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.skinPassDrawn ? this.renderTexture[1] : this.bitmapTextre[0]);
                c = 0;
            }
            GLES20.glUniform1i(this.rgbToHsvSourceImageHandle[c], 0);
            GLES20.glEnableVertexAttribArray(this.rgbToHsvInputTexCoordHandle[c]);
            GLES20.glVertexAttribPointer(this.rgbToHsvInputTexCoordHandle[c], 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.rgbToHsvPositionHandle[c]);
            GLES20.glVertexAttribPointer(this.rgbToHsvPositionHandle[c], 2, 5126, false, 8, (Buffer) (this.isVideo ? this.vertexInvertBuffer : this.vertexBuffer));
            GLES20.glBindFramebuffer(36160, this.enhanceFrameBuffer[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.enhanceTextures[0], 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (!this.hsvGenerated) {
            int i = this.renderBufferWidth * this.renderBufferHeight * 4;
            ByteBuffer byteBuffer = this.hsvBuffer;
            if (byteBuffer == null || i > byteBuffer.capacity()) {
                this.hsvBuffer = ByteBuffer.allocateDirect(i);
            }
            if (this.cdtBuffer == null) {
                this.cdtBuffer = ByteBuffer.allocateDirect(16384);
            }
            if (this.calcBuffer == null) {
                this.calcBuffer = ByteBuffer.allocateDirect(32896);
            }
            GLES20.glReadPixels(0, 0, this.renderBufferWidth, this.renderBufferHeight, 6408, 5121, this.hsvBuffer);
            Utilities.calcCDT(this.hsvBuffer, this.renderBufferWidth, this.renderBufferHeight, this.cdtBuffer, this.calcBuffer);
            GLES20.glBindTexture(3553, this.enhanceTextures[1]);
            GLES20.glTexImage2D(3553, 0, 6408, 256, 16, 0, 6408, 5121, this.cdtBuffer);
            if (!this.isVideo) {
                this.hsvBuffer = null;
                this.cdtBuffer = null;
                this.calcBuffer = null;
            }
            this.hsvGenerated = true;
        }
        GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[1], 0);
        GLES20.glUseProgram(this.enhanceShaderProgram);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.enhanceTextures[0]);
        GLES20.glUniform1i(this.enhanceSourceImageHandle, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.enhanceTextures[1]);
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

    public void drawSharpenPass() {
        if (this.isVideo) {
            return;
        }
        GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[0], 0);
        GLES20.glUseProgram(this.sharpenShaderProgram);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.renderTexture[1]);
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

    public void drawCustomParamsPass() {
        GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[!this.isVideo ? 1 : 0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[!this.isVideo ? 1 : 0], 0);
        GLES20.glUseProgram(this.toolsShaderProgram);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.renderTexture[this.isVideo ? 1 : 0]);
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
            boolean shouldDrawCurvesPass = this.delegate.shouldDrawCurvesPass();
            GLES20.glUniform1f(this.skipToneHandle, shouldDrawCurvesPass ? 0.0f : 1.0f);
            if (shouldDrawCurvesPass) {
                ByteBuffer fillAndGetCurveBuffer = this.delegate.fillAndGetCurveBuffer();
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, this.curveTextures[0]);
                GLES20.glTexImage2D(3553, 0, 6408, 200, 1, 0, 6408, 5121, fillAndGetCurveBuffer);
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

    public boolean drawSkinSmoothPass() {
        int i;
        FilterShadersDelegate filterShadersDelegate = this.delegate;
        if (filterShadersDelegate == null || filterShadersDelegate.shouldShowOriginal() || this.delegate.getSoftenSkinValue() <= 0.0f || (i = this.renderBufferWidth) <= 0 || this.renderBufferHeight <= 0) {
            if (this.skinPassDrawn) {
                this.hsvGenerated = false;
                this.skinPassDrawn = false;
            }
            return false;
        }
        if (this.needUpdateSkinTexture || this.isVideo) {
            float f = i * 0.006f;
            if (this.skinBlurProgram == null || Math.abs(this.lastRadius - f) > 1.0E-4d) {
                BlurProgram blurProgram = this.skinBlurProgram;
                if (blurProgram != null) {
                    blurProgram.destroy();
                }
                this.lastRadius = f;
                BlurProgram blurProgram2 = new BlurProgram(f, 2.0f, true);
                this.skinBlurProgram = blurProgram2;
                blurProgram2.create();
            }
            if (!this.skinTextureCreated) {
                GLES20.glBindTexture(3553, this.renderTexture[3]);
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
            if (this.isVideo) {
                GLES20.glUniformMatrix4fv(this.greenAndBlueChannelOverlayMatrixHandle, 1, false, this.videoMatrix, 0);
            }
            GLES20.glVertexAttribPointer(this.greenAndBlueChannelOverlayPositionHandle, 2, 5126, false, 8, (Buffer) this.vertexInvertBuffer);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[0], 0);
            GLES20.glActiveTexture(33984);
            if (this.isVideo) {
                GLES20.glBindTexture(36197, this.videoTexture);
            } else {
                GLES20.glBindTexture(3553, this.bitmapTextre[0]);
            }
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glUseProgram(this.skinBlurProgram.blurShaderProgram);
            GLES20.glUniform1i(this.skinBlurProgram.blurSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.skinBlurProgram.blurInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.skinBlurProgram.blurInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.skinBlurProgram.blurPositionHandle);
            GLES20.glVertexAttribPointer(this.skinBlurProgram.blurPositionHandle, 2, 5126, false, 8, (Buffer) this.vertexInvertBuffer);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[1]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[1], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.renderTexture[0]);
            GLES20.glUniform1f(this.skinBlurProgram.blurWidthHandle, 0.0f);
            GLES20.glUniform1f(this.skinBlurProgram.blurHeightHandle, 1.0f / this.renderBufferHeight);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[3]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[3], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.renderTexture[1]);
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
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[1], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.renderTexture[0]);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.renderTexture[3]);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glUseProgram(this.boostProgram);
            GLES20.glUniform1i(this.boostSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.boostInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.boostInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.boostPositionHandle);
            GLES20.glVertexAttribPointer(this.boostPositionHandle, 2, 5126, false, 8, (Buffer) this.vertexInvertBuffer);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[3]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[3], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.renderTexture[1]);
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
        if (this.isVideo) {
            GLES20.glUniformMatrix4fv(this.compositeMatrixHandle, 1, false, this.videoMatrix, 0);
        }
        GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[1], 0);
        GLES20.glActiveTexture(33984);
        if (this.isVideo) {
            GLES20.glBindTexture(36197, this.videoTexture);
        } else {
            GLES20.glBindTexture(3553, this.bitmapTextre[0]);
        }
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.renderTexture[3]);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, this.toneCurve.getCurveTexture());
        GLES20.glDrawArrays(5, 0, 4);
        return true;
    }

    public boolean drawBlurPass() {
        FilterShadersDelegate filterShadersDelegate;
        FilterShadersDelegate filterShadersDelegate2 = this.delegate;
        int blurType = filterShadersDelegate2 != null ? filterShadersDelegate2.getBlurType() : 0;
        if (this.isVideo || (filterShadersDelegate = this.delegate) == null || filterShadersDelegate.shouldShowOriginal() || blurType == 0) {
            return false;
        }
        if (this.needUpdateBlurTexture) {
            if (!this.blurTextureCreated) {
                GLES20.glBindTexture(3553, this.renderTexture[2]);
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
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[0], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.renderTexture[1]);
            GLES20.glUniform1f(this.blurProgram.blurWidthHandle, 0.0f);
            GLES20.glUniform1f(this.blurProgram.blurHeightHandle, 1.0f / this.renderBufferHeight);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[2]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[2], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.renderTexture[0]);
            GLES20.glUniform1f(this.blurProgram.blurWidthHandle, 1.0f / this.renderBufferWidth);
            GLES20.glUniform1f(this.blurProgram.blurHeightHandle, 0.0f);
            GLES20.glDrawArrays(5, 0, 4);
            this.needUpdateBlurTexture = false;
        }
        GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[0], 0);
        if (blurType == 1) {
            GLES20.glUseProgram(this.radialBlurShaderProgram);
            GLES20.glUniform1i(this.radialBlurSourceImageHandle, 0);
            GLES20.glUniform1i(this.radialBlurSourceImage2Handle, 1);
            GLES20.glUniform1f(this.radialBlurExcludeSizeHandle, this.delegate.getBlurExcludeSize());
            GLES20.glUniform1f(this.radialBlurExcludeBlurSizeHandle, this.delegate.getBlurExcludeBlurSize());
            Point blurExcludePoint = this.delegate.getBlurExcludePoint();
            GLES20.glUniform2f(this.radialBlurExcludePointHandle, blurExcludePoint.f1103x, blurExcludePoint.f1104y);
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
            Point blurExcludePoint2 = this.delegate.getBlurExcludePoint();
            GLES20.glUniform2f(this.linearBlurExcludePointHandle, blurExcludePoint2.f1103x, blurExcludePoint2.f1104y);
            GLES20.glUniform1f(this.linearBlurAspectRatioHandle, this.renderBufferHeight / this.renderBufferWidth);
            GLES20.glEnableVertexAttribArray(this.linearBlurInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.linearBlurInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.linearBlurPositionHandle);
            GLES20.glVertexAttribPointer(this.linearBlurPositionHandle, 2, 5126, false, 8, (Buffer) this.vertexInvertBuffer);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.renderTexture[1]);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.renderTexture[2]);
        GLES20.glDrawArrays(5, 0, 4);
        return true;
    }

    public void onVideoFrameUpdate(float[] fArr) {
        this.videoMatrix = fArr;
        this.hsvGenerated = false;
    }

    private Bitmap createBitmap(Bitmap bitmap, int i, float f) {
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private void loadTexture(Bitmap bitmap, int i, int i2, int i3) {
        Bitmap bitmap2 = bitmap;
        this.renderBufferWidth = i2;
        this.renderBufferHeight = i3;
        if (this.renderFrameBuffer == null) {
            int[] iArr = new int[4];
            this.renderFrameBuffer = iArr;
            GLES20.glGenFramebuffers(4, iArr, 0);
            GLES20.glGenTextures(4, this.renderTexture, 0);
        }
        if (bitmap2 != null && !bitmap.isRecycled()) {
            GLES20.glGenTextures(1, this.bitmapTextre, 0);
            float photoSize = AndroidUtilities.getPhotoSize();
            int i4 = this.renderBufferWidth;
            if (i4 > photoSize || this.renderBufferHeight > photoSize || i % 360 != 0) {
                float f = 1.0f;
                if (i4 > photoSize || this.renderBufferHeight > photoSize) {
                    f = photoSize / bitmap.getWidth();
                    float height = photoSize / bitmap.getHeight();
                    if (f < height) {
                        this.renderBufferWidth = (int) photoSize;
                        this.renderBufferHeight = (int) (bitmap.getHeight() * f);
                    } else {
                        this.renderBufferHeight = (int) photoSize;
                        this.renderBufferWidth = (int) (bitmap.getWidth() * height);
                        f = height;
                    }
                }
                int i5 = i % 360;
                if (i5 == 90 || i5 == 270) {
                    int i6 = this.renderBufferWidth;
                    this.renderBufferWidth = this.renderBufferHeight;
                    this.renderBufferHeight = i6;
                }
                bitmap2 = createBitmap(bitmap2, i, f);
            }
            GLES20.glBindTexture(3553, this.bitmapTextre[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, bitmap2, 0);
        }
        for (int i7 = 0; i7 < 2; i7++) {
            GLES20.glBindTexture(3553, this.renderTexture[i7]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexImage2D(3553, 0, 6408, this.renderBufferWidth, this.renderBufferHeight, 0, 6408, 5121, null);
        }
    }

    public FloatBuffer getTextureBuffer() {
        return this.textureBuffer;
    }

    public FloatBuffer getVertexBuffer() {
        return this.vertexBuffer;
    }

    public int getRenderBufferWidth() {
        return this.renderBufferWidth;
    }

    public int getRenderBufferHeight() {
        return this.renderBufferHeight;
    }

    public int getRenderTexture(int i) {
        if (this.isVideo) {
            return this.renderTexture[i == 0 ? (char) 1 : (char) 0];
        }
        return this.renderTexture[i];
    }

    public int getRenderFrameBuffer() {
        int[] iArr = this.renderFrameBuffer;
        if (iArr != null) {
            return iArr[!this.isVideo ? 1 : 0];
        }
        return 0;
    }

    public void requestUpdateBlurTexture() {
        this.needUpdateBlurTexture = true;
        this.needUpdateSkinTexture = true;
    }

    public static FilterShadersDelegate getFilterShadersDelegate(final MediaController.SavedFilterState savedFilterState) {
        return new FilterShadersDelegate() {
            @Override
            public boolean shouldShowOriginal() {
                return false;
            }

            @Override
            public float getSoftenSkinValue() {
                return MediaController.SavedFilterState.this.softenSkinValue / 100.0f;
            }

            @Override
            public float getShadowsValue() {
                return ((MediaController.SavedFilterState.this.shadowsValue * 0.55f) + 100.0f) / 100.0f;
            }

            @Override
            public float getHighlightsValue() {
                return ((MediaController.SavedFilterState.this.highlightsValue * 0.75f) + 100.0f) / 100.0f;
            }

            @Override
            public float getEnhanceValue() {
                return MediaController.SavedFilterState.this.enhanceValue / 100.0f;
            }

            @Override
            public float getExposureValue() {
                return MediaController.SavedFilterState.this.exposureValue / 100.0f;
            }

            @Override
            public float getContrastValue() {
                return ((MediaController.SavedFilterState.this.contrastValue / 100.0f) * 0.3f) + 1.0f;
            }

            @Override
            public float getWarmthValue() {
                return MediaController.SavedFilterState.this.warmthValue / 100.0f;
            }

            @Override
            public float getVignetteValue() {
                return MediaController.SavedFilterState.this.vignetteValue / 100.0f;
            }

            @Override
            public float getSharpenValue() {
                return ((MediaController.SavedFilterState.this.sharpenValue / 100.0f) * 0.6f) + 0.11f;
            }

            @Override
            public float getGrainValue() {
                return (MediaController.SavedFilterState.this.grainValue / 100.0f) * 0.04f;
            }

            @Override
            public float getFadeValue() {
                return MediaController.SavedFilterState.this.fadeValue / 100.0f;
            }

            @Override
            public float getTintHighlightsIntensityValue() {
                return MediaController.SavedFilterState.this.tintHighlightsColor == 0 ? 0.0f : 0.5f;
            }

            @Override
            public float getTintShadowsIntensityValue() {
                return MediaController.SavedFilterState.this.tintShadowsColor == 0 ? 0.0f : 0.5f;
            }

            @Override
            public float getSaturationValue() {
                float f = MediaController.SavedFilterState.this.saturationValue / 100.0f;
                if (f > 0.0f) {
                    f *= 1.05f;
                }
                return f + 1.0f;
            }

            @Override
            public int getTintHighlightsColor() {
                return MediaController.SavedFilterState.this.tintHighlightsColor;
            }

            @Override
            public int getTintShadowsColor() {
                return MediaController.SavedFilterState.this.tintShadowsColor;
            }

            @Override
            public int getBlurType() {
                return MediaController.SavedFilterState.this.blurType;
            }

            @Override
            public float getBlurExcludeSize() {
                return MediaController.SavedFilterState.this.blurExcludeSize;
            }

            @Override
            public float getBlurExcludeBlurSize() {
                return MediaController.SavedFilterState.this.blurExcludeBlurSize;
            }

            @Override
            public float getBlurAngle() {
                return MediaController.SavedFilterState.this.blurAngle;
            }

            @Override
            public Point getBlurExcludePoint() {
                return MediaController.SavedFilterState.this.blurExcludePoint;
            }

            @Override
            public boolean shouldDrawCurvesPass() {
                return !MediaController.SavedFilterState.this.curvesToolValue.shouldBeSkipped();
            }

            @Override
            public ByteBuffer fillAndGetCurveBuffer() {
                MediaController.SavedFilterState.this.curvesToolValue.fillBuffer();
                return MediaController.SavedFilterState.this.curvesToolValue.curveBuffer;
            }
        };
    }
}
