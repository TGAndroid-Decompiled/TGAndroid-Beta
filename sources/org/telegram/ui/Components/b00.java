package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class b00 {
    public int A;
    public int A0;
    public int B;
    public int B0;
    public int C;
    public int C0;
    public int D;
    public int D0;
    public int E;
    public int E0;
    public int F;
    public int F0;
    public int G;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public int L;
    public int L0;
    public int M;
    public int M0;
    public int N;
    public int N0;
    public int O;
    public int O0;
    public int P;
    public float[] P0;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int[] U0;
    public int V;
    public int W;
    public boolean W0;
    public int X;
    public int X0;
    public int Y;
    public int Y0;
    public int Z;
    public final FloatBuffer Z0;
    public int f25398a0;
    public final FloatBuffer f25399a1;
    public int f25401b0;
    public final FloatBuffer f25402b1;
    public boolean f25403c;
    public int f25404c0;
    public ByteBuffer f25405c1;
    public boolean d;
    public int f25406d0;
    public ByteBuffer f25407d1;
    public zz f25408e;
    public int f25409e0;
    public ByteBuffer f25410e1;
    public float f25411f;
    public int f25412f0;
    public a00 f25413f1;
    public zz f25414g;
    public int f25415g0;
    public final boolean f25416g1;
    public boolean h;
    public int f25417h0;
    public qh.q6 f25418h1;
    public int f25419i;
    public int f25420i0;
    public int f25422j;
    public int f25423j0;
    public int f25424k;
    public int f25425k0;
    public int f25426l;
    public int f25427l0;
    public int f25428m;
    public int m0;
    public int f25429n;
    public int f25430n0;
    public org.telegram.ui.Cells.f1 f25431o;
    public int f25432o0;
    public int f25433p;
    public int f25434p0;
    public int f25435q;
    public int f25436q0;
    public int f25437r;
    public int f25438r0;
    public int f25439s;
    public int f25440s0;
    public int f25441t;
    public int f25442t0;
    public int f25443u;
    public int f25444u0;
    public int v;
    public int f25445v0;
    public int f25446w;
    public int f25447w0;
    public int f25448x;
    public int f25449x0;
    public int f25450y;
    public int f25451y0;
    public int f25452z;
    public int f25453z0;
    public boolean f25397a = true;
    public boolean f25400b = true;
    public final int[] H = new int[2];
    public final int[] I = new int[2];
    public final int[] J = new int[2];
    public final int[] K = new int[2];
    public final int[] Q0 = new int[2];
    public final int[] R0 = new int[1];
    public final int[] S0 = new int[4];
    public final int[] T0 = new int[1];
    public final int[] V0 = new int[1];
    public boolean f25421i1 = true;

    public b00(boolean z4, qh.q6 q6Var) {
        this.f25416g1 = z4;
        this.f25418h1 = q6Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.Z0 = asFloatBuffer;
        asFloatBuffer.put(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f});
        asFloatBuffer.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f25402b1 = asFloatBuffer2;
        asFloatBuffer2.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f25399a1 = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer3.position(0);
    }

    public static int h(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e(GLES20.glGetShaderInfoLog(glCreateShader));
                FileLog.e("shader code:\n " + str);
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public final boolean a() {
        int[] iArr = this.V0;
        GLES20.glGenTextures(1, iArr, 0);
        int[] iArr2 = this.Q0;
        GLES20.glGenTextures(2, iArr2, 0);
        GLES20.glGenFramebuffers(1, this.R0, 0);
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
        int h = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
        int h9 = h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;uniform highp float width;uniform highp float height;uniform sampler2D curvesImage;uniform lowp float skipTone;uniform lowp float shadows;const mediump vec3 hsLuminanceWeighting = vec3(0.3, 0.3, 0.3);uniform lowp float highlights;uniform lowp float contrast;uniform lowp float fadeAmount;const mediump vec3 satLuminanceWeighting = vec3(0.2126, 0.7152, 0.0722);uniform lowp float saturation;uniform lowp float shadowsTintIntensity;uniform lowp float highlightsTintIntensity;uniform lowp vec3 shadowsTintColor;uniform lowp vec3 highlightsTintColor;uniform lowp float exposure;uniform lowp float warmth;uniform lowp float grain;const lowp float permTexUnit = 1.0 / 256.0;const lowp float permTexUnitHalf = 0.5 / 256.0;const lowp float grainsize = 2.3;uniform lowp float vignette;highp float getLuma(highp vec3 rgbP) {return (0.299 * rgbP.r) + (0.587 * rgbP.g) + (0.114 * rgbP.b);}lowp vec3 rgbToHsv(lowp vec3 c) {highp vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);highp vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);highp vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);highp float d = q.x - min(q.w, q.y);highp float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}lowp vec3 hsvToRgb(lowp vec3 c) {highp vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);highp vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}highp vec3 rgbToHsl(highp vec3 color) {highp vec3 hsl;highp float fmin = min(min(color.r, color.g), color.b);highp float fmax = max(max(color.r, color.g), color.b);highp float delta = fmax - fmin;hsl.z = (fmax + fmin) / 2.0;if (delta == 0.0) {hsl.x = 0.0;hsl.y = 0.0;} else {if (hsl.z < 0.5) {hsl.y = delta / (fmax + fmin);} else {hsl.y = delta / (2.0 - fmax - fmin);}highp float deltaR = (((fmax - color.r) / 6.0) + (delta / 2.0)) / delta;highp float deltaG = (((fmax - color.g) / 6.0) + (delta / 2.0)) / delta;highp float deltaB = (((fmax - color.b) / 6.0) + (delta / 2.0)) / delta;if (color.r == fmax) {hsl.x = deltaB - deltaG;} else if (color.g == fmax) {hsl.x = (1.0 / 3.0) + deltaR - deltaB;} else if (color.b == fmax) {hsl.x = (2.0 / 3.0) + deltaG - deltaR;}if (hsl.x < 0.0) {hsl.x += 1.0;} else if (hsl.x > 1.0) {hsl.x -= 1.0;}}return hsl;}highp float hueToRgb(highp float f1, highp float f2, highp float hue) {if (hue < 0.0) {hue += 1.0;} else if (hue > 1.0) {hue -= 1.0;}highp float res;if ((6.0 * hue) < 1.0) {res = f1 + (f2 - f1) * 6.0 * hue;} else if ((2.0 * hue) < 1.0) {res = f2;} else if ((3.0 * hue) < 2.0) {res = f1 + (f2 - f1) * ((2.0 / 3.0) - hue) * 6.0;} else {res = f1;}return res;}highp vec3 hslToRgb(highp vec3 hsl) {if (hsl.y == 0.0) {return vec3(hsl.z);} else {highp float f2;if (hsl.z < 0.5) {f2 = hsl.z * (1.0 + hsl.y);} else {f2 = (hsl.z + hsl.y) - (hsl.y * hsl.z);}highp float f1 = 2.0 * hsl.z - f2;return vec3(hueToRgb(f1, f2, hsl.x + (1.0/3.0)), hueToRgb(f1, f2, hsl.x), hueToRgb(f1, f2, hsl.x - (1.0/3.0)));}}highp vec3 rgbToYuv(highp vec3 inP) {highp float luma = getLuma(inP);return vec3(luma, (1.0 / 1.772) * (inP.b - luma), (1.0 / 1.402) * (inP.r - luma));}lowp vec3 yuvToRgb(highp vec3 inP) {return vec3(1.402 * inP.b + inP.r, (inP.r - (0.299 * 1.402 / 0.587) * inP.b - (0.114 * 1.772 / 0.587) * inP.g), 1.772 * inP.g + inP.r);}lowp float easeInOutSigmoid(lowp float value, lowp float strength) {if (value > 0.5) {return 1.0 - pow(2.0 - 2.0 * value, 1.0 / (1.0 - strength)) * 0.5;} else {return pow(2.0 * value, 1.0 / (1.0 - strength)) * 0.5;}}lowp vec3 applyLuminanceCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.z / (1.0 / 200.0), 0.0, 199.0));pixel.y = mix(0.0, pixel.y, smoothstep(0.0, 0.1, pixel.z) * (1.0 - smoothstep(0.8, 1.0, pixel.z)));pixel.z = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).a;return pixel;}lowp vec3 applyRGBCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.r / (1.0 / 200.0), 0.0, 199.0));pixel.r = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).r;index = floor(clamp(pixel.g / (1.0 / 200.0), 0.0, 199.0));pixel.g = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).g, 0.0, 1.0);index = floor(clamp(pixel.b / (1.0 / 200.0), 0.0, 199.0));pixel.b = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).b, 0.0, 1.0);return pixel;}highp vec3 fadeAdjust(highp vec3 color, highp float fadeVal) {return (color * (1.0 - fadeVal)) + ((color + (vec3(-0.9772) * pow(vec3(color), vec3(3.0)) + vec3(1.708) * pow(vec3(color), vec3(2.0)) + vec3(-0.1603) * vec3(color) + vec3(0.2878) - color * vec3(0.9))) * fadeVal);}lowp vec3 tintRaiseShadowsCurve(lowp vec3 color) {return vec3(-0.003671) * pow(color, vec3(3.0)) + vec3(0.3842) * pow(color, vec3(2.0)) + vec3(0.3764) * color + vec3(0.2515);}lowp vec3 tintShadows(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, tintRaiseShadowsCurve(texel), tintColor), tintAmount), 0.0, 1.0);} lowp vec3 tintHighlights(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, vec3(1.0) - tintRaiseShadowsCurve(vec3(1.0) - texel), (vec3(1.0) - tintColor)), tintAmount), 0.0, 1.0);}highp vec4 rnm(in highp vec2 tc) {highp float noise = sin(dot(tc, vec2(12.9898, 78.233))) * 43758.5453;return vec4(fract(noise), fract(noise * 1.2154), fract(noise * 1.3453), fract(noise * 1.3647)) * 2.0 - 1.0;}highp float fade(in highp float t) {return t * t * t * (t * (t * 6.0 - 15.0) + 10.0);}highp float pnoise3D(in highp vec3 p) {highp vec3 pi = permTexUnit * floor(p) + permTexUnitHalf;highp vec3 pf = fract(p);highp float perm = rnm(pi.xy).a;highp float n000 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf);highp float n001 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(0.0, permTexUnit)).a;highp float n010 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 0.0));highp float n011 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, 0.0)).a;highp float n100 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 0.0));highp float n101 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, permTexUnit)).a;highp float n110 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 0.0));highp float n111 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 1.0));highp vec4 n_x = mix(vec4(n000, n001, n010, n011), vec4(n100, n101, n110, n111), fade(pf.x));highp vec2 n_xy = mix(n_x.xy, n_x.zw, fade(pf.y));return mix(n_xy.x, n_xy.y, fade(pf.z));}lowp vec2 coordRot(in lowp vec2 tc, in lowp float angle) {return vec2(((tc.x * 2.0 - 1.0) * cos(angle) - (tc.y * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5, ((tc.y * 2.0 - 1.0) * cos(angle) + (tc.x * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5);}void main() {lowp vec4 source = texture2D(sTexture, vTextureCoord);lowp vec4 result = source;const lowp float toolEpsilon = 0.005;if (skipTone < toolEpsilon) {result = vec4(applyRGBCurve(hslToRgb(applyLuminanceCurve(rgbToHsl(result.rgb)))), result.a);}mediump float hsLuminance = dot(result.rgb, hsLuminanceWeighting);mediump float shadow = clamp((pow(hsLuminance, 1.0 / shadows) + (-0.76) * pow(hsLuminance, 2.0 / shadows)) - hsLuminance, 0.0, 1.0);mediump float highlight = clamp((1.0 - (pow(1.0 - hsLuminance, 1.0 / (2.0 - highlights)) + (-0.8) * pow(1.0 - hsLuminance, 2.0 / (2.0 - highlights)))) - hsLuminance, -1.0, 0.0);lowp vec3 hsresult = vec3(0.0, 0.0, 0.0) + ((hsLuminance + shadow + highlight) - 0.0) * ((result.rgb - vec3(0.0, 0.0, 0.0)) / (hsLuminance - 0.0));mediump float contrastedLuminance = ((hsLuminance - 0.5) * 1.5) + 0.5;mediump float whiteInterp = contrastedLuminance * contrastedLuminance * contrastedLuminance;mediump float whiteTarget = clamp(highlights, 1.0, 2.0) - 1.0;hsresult = mix(hsresult, vec3(1.0), whiteInterp * whiteTarget);mediump float invContrastedLuminance = 1.0 - contrastedLuminance;mediump float blackInterp = invContrastedLuminance * invContrastedLuminance * invContrastedLuminance;mediump float blackTarget = 1.0 - clamp(shadows, 0.0, 1.0);hsresult = mix(hsresult, vec3(0.0), blackInterp * blackTarget);result = vec4(hsresult.rgb, result.a);result = vec4(clamp(((result.rgb - vec3(0.5)) * contrast + vec3(0.5)), 0.0, 1.0), result.a);if (abs(fadeAmount) > toolEpsilon) {result.rgb = fadeAdjust(result.rgb, fadeAmount);}lowp float satLuminance = dot(result.rgb, satLuminanceWeighting);lowp vec3 greyScaleColor = vec3(satLuminance);result = vec4(clamp(mix(greyScaleColor, result.rgb, saturation), 0.0, 1.0), result.a);if (abs(shadowsTintIntensity) > toolEpsilon) {result.rgb = tintShadows(result.rgb, shadowsTintColor, shadowsTintIntensity * 2.0);}if (abs(highlightsTintIntensity) > toolEpsilon) {result.rgb = tintHighlights(result.rgb, highlightsTintColor, highlightsTintIntensity * 2.0);}if (abs(exposure) > toolEpsilon) {mediump float mag = exposure * 1.045;mediump float exppower = 1.0 + abs(mag);if (mag < 0.0) {exppower = 1.0 / exppower;}result.r = 1.0 - pow((1.0 - result.r), exppower);result.g = 1.0 - pow((1.0 - result.g), exppower);result.b = 1.0 - pow((1.0 - result.b), exppower);}if (abs(warmth) > toolEpsilon) {highp vec3 yuvVec;if (warmth > 0.0 ) {yuvVec = vec3(0.1765, -0.1255, 0.0902);} else {yuvVec = -vec3(0.0588, 0.1569, -0.1255);}highp vec3 yuvColor = rgbToYuv(result.rgb);highp float luma = yuvColor.r;highp float curveScale = sin(luma * 3.14159);yuvColor += 0.375 * warmth * curveScale * yuvVec;result.rgb = yuvToRgb(yuvColor);}if (abs(grain) > toolEpsilon) {highp vec3 rotOffset = vec3(1.425, 3.892, 5.835);highp vec2 rotCoordsR = coordRot(vTextureCoord, rotOffset.x);highp vec3 noise = vec3(pnoise3D(vec3(rotCoordsR * vec2(width / grainsize, height / grainsize),0.0)));lowp vec3 lumcoeff = vec3(0.299,0.587,0.114);lowp float luminance = dot(result.rgb, lumcoeff);lowp float lum = smoothstep(0.2, 0.0, luminance);lum += luminance;noise = mix(noise,vec3(0.0),pow(lum,4.0));result.rgb = result.rgb + noise * grain;}if (abs(vignette) > toolEpsilon) {const lowp float midpoint = 0.7;const lowp float fuzziness = 0.62;lowp float radDist = length(vTextureCoord - 0.5) / sqrt(0.5);lowp float mag = easeInOutSigmoid(radDist * midpoint, fuzziness) * vignette * 0.645;result.rgb = mix(pow(result.rgb, vec3(1.0 / (1.0 - mag))), vec3(0.0), mag * mag);}gl_FragColor = result;}");
        if (h != 0 && h9 != 0) {
            int glCreateProgram = GLES20.glCreateProgram();
            this.T = glCreateProgram;
            GLES20.glAttachShader(glCreateProgram, h);
            GLES20.glAttachShader(this.T, h9);
            GLES20.glBindAttribLocation(this.T, 0, "position");
            GLES20.glBindAttribLocation(this.T, 1, "inputTexCoord");
            GLES20.glLinkProgram(this.T);
            GLES20.glGetProgramiv(this.T, 35714, iArr3, 0);
            if (iArr3[0] == 0) {
                GLES20.glDeleteProgram(this.T);
                this.T = 0;
            } else {
                this.U = GLES20.glGetAttribLocation(this.T, "position");
                this.V = GLES20.glGetAttribLocation(this.T, "inputTexCoord");
                this.W = GLES20.glGetUniformLocation(this.T, "sTexture");
                this.X = GLES20.glGetUniformLocation(this.T, "shadows");
                this.Y = GLES20.glGetUniformLocation(this.T, "highlights");
                this.Z = GLES20.glGetUniformLocation(this.T, "exposure");
                this.f25398a0 = GLES20.glGetUniformLocation(this.T, "contrast");
                this.f25401b0 = GLES20.glGetUniformLocation(this.T, "saturation");
                this.f25404c0 = GLES20.glGetUniformLocation(this.T, "warmth");
                this.f25406d0 = GLES20.glGetUniformLocation(this.T, "vignette");
                this.f25409e0 = GLES20.glGetUniformLocation(this.T, "grain");
                this.f25412f0 = GLES20.glGetUniformLocation(this.T, "width");
                this.f25415g0 = GLES20.glGetUniformLocation(this.T, "height");
                this.f25417h0 = GLES20.glGetUniformLocation(this.T, "curvesImage");
                this.f25420i0 = GLES20.glGetUniformLocation(this.T, "skipTone");
                this.f25423j0 = GLES20.glGetUniformLocation(this.T, "fadeAmount");
                this.f25425k0 = GLES20.glGetUniformLocation(this.T, "shadowsTintIntensity");
                this.f25427l0 = GLES20.glGetUniformLocation(this.T, "highlightsTintIntensity");
                this.m0 = GLES20.glGetUniformLocation(this.T, "shadowsTintColor");
                this.f25430n0 = GLES20.glGetUniformLocation(this.T, "highlightsTintColor");
            }
            int h10 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;uniform highp float inputWidth;uniform highp float inputHeight;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;highp vec2 widthStep = vec2(1.0 / inputWidth, 0.0);highp vec2 heightStep = vec2(0.0, 1.0 / inputHeight);leftTexCoord = inputTexCoord - widthStep;rightTexCoord = inputTexCoord + widthStep;topTexCoord = inputTexCoord + heightStep;bottomTexCoord = inputTexCoord - heightStep;}");
            int h11 = h(35632, "precision highp float;varying vec2 vTextureCoord;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;uniform sampler2D sTexture;uniform float sharpen;void main() {vec4 result = texture2D(sTexture, vTextureCoord);vec3 leftTextureColor = texture2D(sTexture, leftTexCoord).rgb;vec3 rightTextureColor = texture2D(sTexture, rightTexCoord).rgb;vec3 topTextureColor = texture2D(sTexture, topTexCoord).rgb;vec3 bottomTextureColor = texture2D(sTexture, bottomTexCoord).rgb;result.rgb = result.rgb * (1.0 + 4.0 * sharpen) - (leftTextureColor + rightTextureColor + topTextureColor + bottomTextureColor) * sharpen;gl_FragColor = result;}");
            if (h10 != 0 && h11 != 0) {
                int glCreateProgram2 = GLES20.glCreateProgram();
                this.H0 = glCreateProgram2;
                GLES20.glAttachShader(glCreateProgram2, h10);
                GLES20.glAttachShader(this.H0, h11);
                GLES20.glBindAttribLocation(this.H0, 0, "position");
                GLES20.glBindAttribLocation(this.H0, 1, "inputTexCoord");
                GLES20.glLinkProgram(this.H0);
                GLES20.glGetProgramiv(this.H0, 35714, iArr3, 0);
                if (iArr3[0] == 0) {
                    GLES20.glDeleteProgram(this.H0);
                    this.H0 = 0;
                } else {
                    this.L0 = GLES20.glGetAttribLocation(this.H0, "position");
                    this.M0 = GLES20.glGetAttribLocation(this.H0, "inputTexCoord");
                    this.N0 = GLES20.glGetUniformLocation(this.H0, "sTexture");
                    this.J0 = GLES20.glGetUniformLocation(this.H0, "inputWidth");
                    this.K0 = GLES20.glGetUniformLocation(this.H0, "inputHeight");
                    this.I0 = GLES20.glGetUniformLocation(this.H0, "sharpen");
                }
                zz zzVar = new zz(8.0f, 3.0f, false);
                this.f25414g = zzVar;
                if (zzVar.a() && j()) {
                    int h12 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                    int h13 = h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float angle;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sTexture, vTextureCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, vTextureCoord);highp vec2 texCoordToUse = vec2(vTextureCoord.x, (vTextureCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = abs((texCoordToUse.x - excludePoint.x) * aspectRatio * cos(angle) + (texCoordToUse.y - excludePoint.y) * sin(angle));gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                    if (h12 != 0 && h13 != 0) {
                        int glCreateProgram3 = GLES20.glCreateProgram();
                        this.f25432o0 = glCreateProgram3;
                        GLES20.glAttachShader(glCreateProgram3, h12);
                        GLES20.glAttachShader(this.f25432o0, h13);
                        GLES20.glBindAttribLocation(this.f25432o0, 0, "position");
                        GLES20.glBindAttribLocation(this.f25432o0, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f25432o0);
                        GLES20.glGetProgramiv(this.f25432o0, 35714, iArr3, 0);
                        if (iArr3[0] == 0) {
                            GLES20.glDeleteProgram(this.f25432o0);
                            this.f25432o0 = 0;
                        } else {
                            this.f25434p0 = GLES20.glGetAttribLocation(this.f25432o0, "position");
                            this.f25436q0 = GLES20.glGetAttribLocation(this.f25432o0, "inputTexCoord");
                            this.f25438r0 = GLES20.glGetUniformLocation(this.f25432o0, "sTexture");
                            this.f25440s0 = GLES20.glGetUniformLocation(this.f25432o0, "inputImageTexture2");
                            this.f25442t0 = GLES20.glGetUniformLocation(this.f25432o0, "excludeSize");
                            this.f25444u0 = GLES20.glGetUniformLocation(this.f25432o0, "excludePoint");
                            this.f25445v0 = GLES20.glGetUniformLocation(this.f25432o0, "excludeBlurSize");
                            this.f25447w0 = GLES20.glGetUniformLocation(this.f25432o0, "angle");
                            this.f25449x0 = GLES20.glGetUniformLocation(this.f25432o0, "aspectRatio");
                        }
                        int h14 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                        int h15 = h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sTexture, vTextureCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, vTextureCoord);highp vec2 texCoordToUse = vec2(vTextureCoord.x, (vTextureCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = distance(excludePoint, texCoordToUse);gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                        if (h14 != 0 && h15 != 0) {
                            int glCreateProgram4 = GLES20.glCreateProgram();
                            this.f25451y0 = glCreateProgram4;
                            GLES20.glAttachShader(glCreateProgram4, h14);
                            GLES20.glAttachShader(this.f25451y0, h15);
                            GLES20.glBindAttribLocation(this.f25451y0, 0, "position");
                            GLES20.glBindAttribLocation(this.f25451y0, 1, "inputTexCoord");
                            GLES20.glLinkProgram(this.f25451y0);
                            GLES20.glGetProgramiv(this.f25451y0, 35714, iArr3, 0);
                            if (iArr3[0] == 0) {
                                GLES20.glDeleteProgram(this.f25451y0);
                                this.f25451y0 = 0;
                            } else {
                                this.f25453z0 = GLES20.glGetAttribLocation(this.f25451y0, "position");
                                this.A0 = GLES20.glGetAttribLocation(this.f25451y0, "inputTexCoord");
                                this.B0 = GLES20.glGetUniformLocation(this.f25451y0, "sTexture");
                                this.C0 = GLES20.glGetUniformLocation(this.f25451y0, "inputImageTexture2");
                                this.D0 = GLES20.glGetUniformLocation(this.f25451y0, "excludeSize");
                                this.E0 = GLES20.glGetUniformLocation(this.f25451y0, "excludePoint");
                                this.F0 = GLES20.glGetUniformLocation(this.f25451y0, "excludeBlurSize");
                                this.G0 = GLES20.glGetUniformLocation(this.f25451y0, "aspectRatio");
                            }
                            int h16 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                            int h17 = h(35632, "precision highp float;varying vec2 vTextureCoord;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;uniform float intensity;float enhance(float value) {const vec2 offset = vec2(0.001953125, 0.03125);value = value + offset.x;vec2 coord = (clamp(vTextureCoord, 0.125, 1.0 - 0.125001) - 0.125) * 4.0;vec2 frac = fract(coord);coord = floor(coord);float p00 = float(coord.y * 4.0 + coord.x) * 0.0625 + offset.y;float p01 = float(coord.y * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;float p10 = float((coord.y + 1.0) * 4.0 + coord.x) * 0.0625 + offset.y;float p11 = float((coord.y + 1.0) * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;vec3 c00 = texture2D(inputImageTexture2, vec2(value, p00)).rgb;vec3 c01 = texture2D(inputImageTexture2, vec2(value, p01)).rgb;vec3 c10 = texture2D(inputImageTexture2, vec2(value, p10)).rgb;vec3 c11 = texture2D(inputImageTexture2, vec2(value, p11)).rgb;float c1 = ((c00.r - c00.g) / (c00.b - c00.g));float c2 = ((c01.r - c01.g) / (c01.b - c01.g));float c3 = ((c10.r - c10.g) / (c10.b - c10.g));float c4 = ((c11.r - c11.g) / (c11.b - c11.g));float c1_2 = mix(c1, c2, frac.x);float c3_4 = mix(c3, c4, frac.x);return mix(c1_2, c3_4, frac.y);}vec3 hsv_to_rgb(vec3 c) {vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}void main() {vec4 texel = texture2D(sTexture, vTextureCoord);vec4 hsv = texel;hsv.y = min(1.0, hsv.y * 1.2);hsv.z = min(1.0, enhance(hsv.z) * 1.1);gl_FragColor = vec4(hsv_to_rgb(mix(texel.xyz, hsv.xyz, intensity)), texel.w);}");
                            if (h16 != 0 && h17 != 0) {
                                int glCreateProgram5 = GLES20.glCreateProgram();
                                this.N = glCreateProgram5;
                                GLES20.glAttachShader(glCreateProgram5, h16);
                                GLES20.glAttachShader(this.N, h17);
                                GLES20.glBindAttribLocation(this.N, 0, "position");
                                GLES20.glBindAttribLocation(this.N, 1, "inputTexCoord");
                                GLES20.glLinkProgram(this.N);
                                GLES20.glGetProgramiv(this.N, 35714, iArr3, 0);
                                if (iArr3[0] == 0) {
                                    GLES20.glDeleteProgram(this.N);
                                    this.N = 0;
                                } else {
                                    this.O = GLES20.glGetAttribLocation(this.N, "position");
                                    this.P = GLES20.glGetAttribLocation(this.N, "inputTexCoord");
                                    this.Q = GLES20.glGetUniformLocation(this.N, "sTexture");
                                    this.R = GLES20.glGetUniformLocation(this.N, "intensity");
                                    this.S = GLES20.glGetUniformLocation(this.N, "inputImageTexture2");
                                }
                                int h18 = h(35632, "precision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;void main() {vec4 image = texture2D(sTexture, vTextureCoord);vec4 blurredImage = texture2D(inputImageTexture2, texCoord2);gl_FragColor = vec4((image.rgb - blurredImage.rgb + vec3(0.5,0.5,0.5)), image.a);}");
                                int h19 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = inputTexCoord;texCoord2 = inputTexCoord;}");
                                if (h19 != 0 && h18 != 0) {
                                    int glCreateProgram6 = GLES20.glCreateProgram();
                                    this.f25433p = glCreateProgram6;
                                    GLES20.glAttachShader(glCreateProgram6, h19);
                                    GLES20.glAttachShader(this.f25433p, h18);
                                    GLES20.glBindAttribLocation(this.f25433p, 0, "position");
                                    GLES20.glBindAttribLocation(this.f25433p, 1, "inputTexCoord");
                                    GLES20.glLinkProgram(this.f25433p);
                                    GLES20.glGetProgramiv(this.f25433p, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        GLES20.glDeleteProgram(this.f25433p);
                                        this.f25433p = 0;
                                    } else {
                                        this.f25435q = GLES20.glGetAttribLocation(this.f25433p, "position");
                                        this.f25437r = GLES20.glGetAttribLocation(this.f25433p, "inputTexCoord");
                                        this.f25439s = GLES20.glGetUniformLocation(this.f25433p, "sTexture");
                                        this.f25441t = GLES20.glGetUniformLocation(this.f25433p, "inputImageTexture2");
                                    }
                                    int h20 = h(35632, "precision lowp float;varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {vec4 color = texture2D(sTexture, vTextureCoord);float hardLightColor = color.b;for (int i = 0; i < 3; ++i){if (hardLightColor < 0.5) {hardLightColor = hardLightColor * hardLightColor * 2.0;} else {hardLightColor = 1.0 - (1.0 - hardLightColor) * (1.0 - hardLightColor) * 2.0;}}float k = 255.0 / (164.0 - 75.0);hardLightColor = (hardLightColor - 75.0 / 255.0) * k;gl_FragColor = vec4(vec3(hardLightColor), color.a);}");
                                    int h21 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                    if (h21 != 0 && h20 != 0) {
                                        int glCreateProgram7 = GLES20.glCreateProgram();
                                        this.D = glCreateProgram7;
                                        GLES20.glAttachShader(glCreateProgram7, h21);
                                        GLES20.glAttachShader(this.D, h20);
                                        GLES20.glBindAttribLocation(this.D, 0, "position");
                                        GLES20.glBindAttribLocation(this.D, 1, "inputTexCoord");
                                        GLES20.glLinkProgram(this.D);
                                        GLES20.glGetProgramiv(this.D, 35714, iArr3, 0);
                                        if (iArr3[0] == 0) {
                                            GLES20.glDeleteProgram(this.D);
                                            this.D = 0;
                                        } else {
                                            this.E = GLES20.glGetAttribLocation(this.D, "position");
                                            this.F = GLES20.glGetAttribLocation(this.D, "inputTexCoord");
                                            this.G = GLES20.glGetUniformLocation(this.D, "sTexture");
                                        }
                                        org.telegram.ui.Cells.f1 f1Var = new org.telegram.ui.Cells.f1(4);
                                        int[] iArr4 = new int[1];
                                        f1Var.f22790b = iArr4;
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(new PointF(0.0f, 0.0f));
                                        arrayList.add(new PointF(0.5f, 0.5f));
                                        arrayList.add(new PointF(1.0f, 1.0f));
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(new PointF(0.0f, 0.0f));
                                        arrayList2.add(new PointF(0.47f, 0.57f));
                                        arrayList2.add(new PointF(1.0f, 1.0f));
                                        float[] r10 = org.telegram.ui.Cells.f1.r(arrayList2);
                                        float[] r11 = org.telegram.ui.Cells.f1.r(arrayList);
                                        GLES20.glGenTextures(1, iArr4, 0);
                                        GLES20.glBindTexture(3553, iArr4[0]);
                                        GLES20.glTexParameteri(3553, 10241, 9729);
                                        GLES20.glTexParameteri(3553, 10240, 9729);
                                        GLES20.glTexParameteri(3553, 10242, 33071);
                                        GLES20.glTexParameteri(3553, 10243, 33071);
                                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1024);
                                        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                                        if (r11.length >= 256 && r11.length >= 256 && r11.length >= 256 && r10.length >= 256) {
                                            for (int i10 = 0; i10 < 256; i10++) {
                                                float f10 = i10;
                                                int min = (int) Math.min(Math.max(r11[i10] + f10, 0.0f), 255.0f);
                                                int min2 = (int) Math.min(Math.max(r11[i10] + f10, 0.0f), 255.0f);
                                                int min3 = (int) Math.min(Math.max(f10 + r11[i10], 0.0f), 255.0f);
                                                allocateDirect.put((byte) Math.min(Math.max(min3 + r10[min3], 0.0f), 255.0f));
                                                allocateDirect.put((byte) Math.min(Math.max(min2 + r10[min2], 0.0f), 255.0f));
                                                allocateDirect.put((byte) Math.min(Math.max(min + r10[min], 0.0f), 255.0f));
                                                allocateDirect.put((byte) -1);
                                            }
                                            allocateDirect.position(0);
                                            GLES20.glTexImage2D(3553, 0, 6408, 256, 1, 0, 6408, 5121, allocateDirect);
                                        }
                                        this.f25431o = f1Var;
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

    public final boolean b() {
        int i10;
        a00 a00Var;
        a00 a00Var2 = this.f25413f1;
        if (a00Var2 != null) {
            i10 = a00Var2.getBlurType();
        } else {
            i10 = 0;
        }
        if (this.f25416g1 || (a00Var = this.f25413f1) == null || a00Var.b() || i10 == 0) {
            return false;
        }
        boolean z4 = this.f25397a;
        int[] iArr = this.S0;
        if (z4) {
            if (!this.f25403c) {
                GLES20.glBindTexture(3553, iArr[2]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glTexImage2D(3553, 0, 6408, this.X0, this.Y0, 0, 6408, 5121, null);
                this.f25403c = true;
            }
            GLES20.glUseProgram(this.f25414g.f34047c);
            GLES20.glUniform1i(this.f25414g.f34049f, 0);
            GLES20.glEnableVertexAttribArray(this.f25414g.f34048e);
            GLES20.glVertexAttribPointer(this.f25414g.f34048e, 2, 5126, false, 8, (Buffer) this.f25399a1);
            GLES20.glEnableVertexAttribArray(this.f25414g.d);
            GLES20.glVertexAttribPointer(this.f25414g.d, 2, 5126, false, 8, (Buffer) this.f25402b1);
            GLES20.glBindFramebuffer(36160, this.U0[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr[1]);
            GLES20.glUniform1f(this.f25414g.f34050g, 0.0f);
            GLES20.glUniform1f(this.f25414g.h, 1.0f / this.Y0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.U0[2]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[2], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glUniform1f(this.f25414g.f34050g, 1.0f / this.X0);
            GLES20.glUniform1f(this.f25414g.h, 0.0f);
            GLES20.glDrawArrays(5, 0, 4);
            this.f25397a = false;
        }
        GLES20.glBindFramebuffer(36160, this.U0[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
        if (i10 == 1) {
            GLES20.glUseProgram(this.f25451y0);
            GLES20.glUniform1i(this.B0, 0);
            GLES20.glUniform1i(this.C0, 1);
            GLES20.glUniform1f(this.D0, this.f25413f1.getBlurExcludeSize());
            GLES20.glUniform1f(this.F0, this.f25413f1.getBlurExcludeBlurSize());
            PointF blurExcludePoint = this.f25413f1.getBlurExcludePoint();
            GLES20.glUniform2f(this.E0, blurExcludePoint.x, blurExcludePoint.y);
            GLES20.glUniform1f(this.G0, this.Y0 / this.X0);
            GLES20.glEnableVertexAttribArray(this.A0);
            GLES20.glVertexAttribPointer(this.A0, 2, 5126, false, 8, (Buffer) this.f25399a1);
            GLES20.glEnableVertexAttribArray(this.f25453z0);
            GLES20.glVertexAttribPointer(this.f25453z0, 2, 5126, false, 8, (Buffer) this.f25402b1);
        } else if (i10 == 2) {
            GLES20.glUseProgram(this.f25432o0);
            GLES20.glUniform1i(this.f25438r0, 0);
            GLES20.glUniform1i(this.f25440s0, 1);
            GLES20.glUniform1f(this.f25442t0, this.f25413f1.getBlurExcludeSize());
            GLES20.glUniform1f(this.f25445v0, this.f25413f1.getBlurExcludeBlurSize());
            GLES20.glUniform1f(this.f25447w0, this.f25413f1.getBlurAngle());
            PointF blurExcludePoint2 = this.f25413f1.getBlurExcludePoint();
            GLES20.glUniform2f(this.f25444u0, blurExcludePoint2.x, blurExcludePoint2.y);
            GLES20.glUniform1f(this.f25449x0, this.Y0 / this.X0);
            GLES20.glEnableVertexAttribArray(this.f25436q0);
            GLES20.glVertexAttribPointer(this.f25436q0, 2, 5126, false, 8, (Buffer) this.f25399a1);
            GLES20.glEnableVertexAttribArray(this.f25434p0);
            GLES20.glVertexAttribPointer(this.f25434p0, 2, 5126, false, 8, (Buffer) this.f25402b1);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[1]);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, iArr[2]);
        GLES20.glDrawArrays(5, 0, 4);
        return true;
    }

    public final void c() {
        int[] iArr = this.U0;
        boolean z4 = this.f25416g1;
        int i10 = !z4 ? 1 : 0;
        GLES20.glBindFramebuffer(36160, iArr[i10]);
        int[] iArr2 = this.S0;
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[i10], 0);
        GLES20.glUseProgram(this.T);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr2[z4 ? 1 : 0]);
        GLES20.glUniform1i(this.W, 0);
        a00 a00Var = this.f25413f1;
        float f10 = 1.0f;
        if (a00Var != null && !a00Var.b()) {
            GLES20.glUniform1f(this.X, this.f25413f1.getShadowsValue());
            GLES20.glUniform1f(this.Y, this.f25413f1.getHighlightsValue());
            GLES20.glUniform1f(this.Z, this.f25413f1.getExposureValue());
            GLES20.glUniform1f(this.f25398a0, this.f25413f1.getContrastValue());
            GLES20.glUniform1f(this.f25401b0, this.f25413f1.getSaturationValue());
            GLES20.glUniform1f(this.f25404c0, this.f25413f1.getWarmthValue());
            GLES20.glUniform1f(this.f25406d0, this.f25413f1.getVignetteValue());
            GLES20.glUniform1f(this.f25409e0, this.f25413f1.getGrainValue());
            GLES20.glUniform1f(this.f25423j0, this.f25413f1.getFadeValue());
            int tintHighlightsColor = this.f25413f1.getTintHighlightsColor();
            int tintShadowsColor = this.f25413f1.getTintShadowsColor();
            GLES20.glUniform3f(this.f25430n0, ((tintHighlightsColor >> 16) & 255) / 255.0f, ((tintHighlightsColor >> 8) & 255) / 255.0f, (tintHighlightsColor & 255) / 255.0f);
            GLES20.glUniform1f(this.f25427l0, this.f25413f1.getTintHighlightsIntensityValue());
            GLES20.glUniform3f(this.m0, ((tintShadowsColor >> 16) & 255) / 255.0f, ((tintShadowsColor >> 8) & 255) / 255.0f, (tintShadowsColor & 255) / 255.0f);
            GLES20.glUniform1f(this.f25425k0, this.f25413f1.getTintShadowsIntensityValue());
            boolean c3 = this.f25413f1.c();
            int i11 = this.f25420i0;
            if (c3) {
                f10 = 0.0f;
            }
            GLES20.glUniform1f(i11, f10);
            if (c3) {
                ByteBuffer a2 = this.f25413f1.a();
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, this.V0[0]);
                GLES20.glTexImage2D(3553, 0, 6408, 200, 1, 0, 6408, 5121, a2);
                GLES20.glUniform1i(this.f25417h0, 1);
            }
        } else {
            GLES20.glUniform1f(this.X, 1.0f);
            GLES20.glUniform1f(this.Y, 1.0f);
            GLES20.glUniform1f(this.Z, 0.0f);
            GLES20.glUniform1f(this.f25398a0, 1.0f);
            GLES20.glUniform1f(this.f25401b0, 1.0f);
            GLES20.glUniform1f(this.f25404c0, 0.0f);
            GLES20.glUniform1f(this.f25406d0, 0.0f);
            GLES20.glUniform1f(this.f25409e0, 0.0f);
            GLES20.glUniform1f(this.f25423j0, 0.0f);
            GLES20.glUniform3f(this.f25430n0, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.f25427l0, 0.0f);
            GLES20.glUniform3f(this.m0, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.f25425k0, 0.0f);
            GLES20.glUniform1f(this.f25420i0, 1.0f);
        }
        GLES20.glUniform1f(this.f25412f0, this.X0);
        GLES20.glUniform1f(this.f25415g0, this.Y0);
        GLES20.glEnableVertexAttribArray(this.V);
        GLES20.glVertexAttribPointer(this.V, 2, 5126, false, 8, (Buffer) this.f25399a1);
        GLES20.glEnableVertexAttribArray(this.U);
        GLES20.glVertexAttribPointer(this.U, 2, 5126, false, 8, (Buffer) this.f25402b1);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void d() {
        boolean z4;
        int i10;
        int i11;
        char c3;
        FloatBuffer floatBuffer;
        boolean z10 = this.f25416g1;
        if (z10) {
            z4 = true;
        } else {
            z4 = !this.W0;
        }
        int[] iArr = this.S0;
        int[] iArr2 = this.Q0;
        if (z4) {
            int[] iArr3 = this.H;
            if (z10 && !this.h) {
                GLES20.glUseProgram(iArr3[1]);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, this.O0);
                GLES20.glUniformMatrix4fv(this.L, 1, false, this.P0, 0);
                int i12 = this.M;
                if (i12 != -1) {
                    GLES20.glUniform2f(i12, this.X0, this.Y0);
                }
                c3 = 1;
            } else {
                GLES20.glUseProgram(iArr3[0]);
                GLES20.glActiveTexture(33984);
                if (this.h) {
                    i11 = iArr[1];
                } else {
                    i11 = this.T0[0];
                }
                GLES20.glBindTexture(3553, i11);
                c3 = 0;
            }
            GLES20.glUniform1i(this.K[c3], 0);
            int[] iArr4 = this.J;
            GLES20.glEnableVertexAttribArray(iArr4[c3]);
            GLES20.glVertexAttribPointer(iArr4[c3], 2, 5126, false, 8, (Buffer) this.f25399a1);
            int[] iArr5 = this.I;
            GLES20.glEnableVertexAttribArray(iArr5[c3]);
            int i13 = iArr5[c3];
            if (z10) {
                floatBuffer = this.f25402b1;
            } else {
                floatBuffer = this.Z0;
            }
            GLES20.glVertexAttribPointer(i13, 2, 5126, false, 8, (Buffer) floatBuffer);
            GLES20.glBindFramebuffer(36160, this.R0[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (!this.W0) {
            int i14 = this.X0 * this.Y0 * 4;
            ByteBuffer byteBuffer = this.f25405c1;
            if (byteBuffer == null || i14 > byteBuffer.capacity()) {
                this.f25405c1 = ByteBuffer.allocateDirect(i14);
            }
            if (this.f25407d1 == null) {
                this.f25407d1 = ByteBuffer.allocateDirect(16384);
            }
            if (this.f25410e1 == null) {
                this.f25410e1 = ByteBuffer.allocateDirect(32896);
            }
            GLES20.glReadPixels(0, 0, this.X0, this.Y0, 6408, 5121, this.f25405c1);
            i10 = 33984;
            Utilities.calcCDT(this.f25405c1, this.X0, this.Y0, this.f25407d1, this.f25410e1);
            GLES20.glBindTexture(3553, iArr2[1]);
            GLES20.glTexImage2D(3553, 0, 6408, 256, 16, 0, 6408, 5121, this.f25407d1);
            if (!z10) {
                this.f25405c1 = null;
                this.f25407d1 = null;
                this.f25410e1 = null;
            }
            this.W0 = true;
        } else {
            i10 = 33984;
        }
        GLES20.glBindFramebuffer(36160, this.U0[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], 0);
        GLES20.glUseProgram(this.N);
        GLES20.glActiveTexture(i10);
        GLES20.glBindTexture(3553, iArr2[0]);
        GLES20.glUniform1i(this.Q, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, iArr2[1]);
        GLES20.glUniform1i(this.S, 1);
        a00 a00Var = this.f25413f1;
        if (a00Var != null && !a00Var.b()) {
            GLES20.glUniform1f(this.R, this.f25413f1.getEnhanceValue());
        } else {
            GLES20.glUniform1f(this.R, 0.0f);
        }
        GLES20.glEnableVertexAttribArray(this.P);
        GLES20.glVertexAttribPointer(this.P, 2, 5126, false, 8, (Buffer) this.f25399a1);
        GLES20.glEnableVertexAttribArray(this.O);
        GLES20.glVertexAttribPointer(this.O, 2, 5126, false, 8, (Buffer) this.Z0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void e() {
        if (this.f25416g1) {
            return;
        }
        GLES20.glBindFramebuffer(36160, this.U0[0]);
        int[] iArr = this.S0;
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
        GLES20.glUseProgram(this.H0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[1]);
        GLES20.glUniform1i(this.N0, 0);
        a00 a00Var = this.f25413f1;
        if (a00Var != null && !a00Var.b()) {
            GLES20.glUniform1f(this.I0, this.f25413f1.getSharpenValue());
        } else {
            GLES20.glUniform1f(this.I0, 0.0f);
        }
        GLES20.glUniform1f(this.J0, this.X0);
        GLES20.glUniform1f(this.K0, this.Y0);
        GLES20.glEnableVertexAttribArray(this.M0);
        GLES20.glVertexAttribPointer(this.M0, 2, 5126, false, 8, (Buffer) this.f25399a1);
        GLES20.glEnableVertexAttribArray(this.L0);
        GLES20.glVertexAttribPointer(this.L0, 2, 5126, false, 8, (Buffer) this.f25402b1);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void f() {
        int i10;
        int i11;
        a00 a00Var = this.f25413f1;
        if (a00Var != null && !a00Var.b() && this.f25413f1.getSoftenSkinValue() > 0.0f && (i10 = this.X0) > 0 && this.Y0 > 0) {
            boolean z4 = this.f25400b;
            int[] iArr = this.T0;
            boolean z10 = this.f25416g1;
            int[] iArr2 = this.S0;
            if (z4 || z10) {
                float f10 = i10 * 0.006f;
                if (this.f25408e == null || Math.abs(this.f25411f - f10) > 1.0E-4d) {
                    zz zzVar = this.f25408e;
                    if (zzVar != null && (i11 = zzVar.f34047c) != 0) {
                        GLES20.glDeleteProgram(i11);
                        zzVar.f34047c = 0;
                    }
                    this.f25411f = f10;
                    zz zzVar2 = new zz(f10, 2.0f, true);
                    this.f25408e = zzVar2;
                    zzVar2.a();
                }
                if (!this.d) {
                    GLES20.glBindTexture(3553, iArr2[3]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexParameteri(3553, 10242, 33071);
                    GLES20.glTexParameteri(3553, 10243, 33071);
                    GLES20.glTexImage2D(3553, 0, 6408, this.X0, this.Y0, 0, 6408, 5121, null);
                    this.d = true;
                }
                GLES20.glUseProgram(this.f25419i);
                GLES20.glUniform1i(this.f25426l, 0);
                GLES20.glEnableVertexAttribArray(this.f25424k);
                GLES20.glVertexAttribPointer(this.f25424k, 2, 5126, false, 8, (Buffer) this.f25399a1);
                GLES20.glEnableVertexAttribArray(this.f25422j);
                if (z10) {
                    GLES20.glUniformMatrix4fv(this.f25428m, 1, false, this.P0, 0);
                    int i12 = this.f25429n;
                    if (i12 != -1) {
                        GLES20.glUniform2f(i12, this.X0, this.Y0);
                    }
                }
                GLES20.glVertexAttribPointer(this.f25422j, 2, 5126, false, 8, (Buffer) this.f25402b1);
                GLES20.glBindFramebuffer(36160, this.U0[0]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
                GLES20.glActiveTexture(33984);
                if (z10) {
                    GLES20.glBindTexture(36197, this.O0);
                } else {
                    GLES20.glBindTexture(3553, iArr[0]);
                }
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glUseProgram(this.f25408e.f34047c);
                GLES20.glUniform1i(this.f25408e.f34049f, 0);
                GLES20.glEnableVertexAttribArray(this.f25408e.f34048e);
                GLES20.glVertexAttribPointer(this.f25408e.f34048e, 2, 5126, false, 8, (Buffer) this.f25399a1);
                GLES20.glEnableVertexAttribArray(this.f25408e.d);
                GLES20.glVertexAttribPointer(this.f25408e.d, 2, 5126, false, 8, (Buffer) this.f25402b1);
                GLES20.glBindFramebuffer(36160, this.U0[1]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[1], 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr2[0]);
                GLES20.glUniform1f(this.f25408e.f34050g, 0.0f);
                GLES20.glUniform1f(this.f25408e.h, 1.0f / this.Y0);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glBindFramebuffer(36160, this.U0[3]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[3], 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr2[1]);
                GLES20.glUniform1f(this.f25408e.f34050g, 1.0f / this.X0);
                GLES20.glUniform1f(this.f25408e.h, 0.0f);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glUseProgram(this.f25433p);
                GLES20.glUniform1i(this.f25439s, 0);
                GLES20.glUniform1i(this.f25441t, 1);
                GLES20.glEnableVertexAttribArray(this.f25437r);
                GLES20.glVertexAttribPointer(this.f25437r, 2, 5126, false, 8, (Buffer) this.f25399a1);
                GLES20.glEnableVertexAttribArray(this.f25435q);
                GLES20.glVertexAttribPointer(this.f25435q, 2, 5126, false, 8, (Buffer) this.f25402b1);
                GLES20.glBindFramebuffer(36160, this.U0[1]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[1], 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr2[0]);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, iArr2[3]);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glUseProgram(this.D);
                GLES20.glUniform1i(this.G, 0);
                GLES20.glEnableVertexAttribArray(this.F);
                GLES20.glVertexAttribPointer(this.F, 2, 5126, false, 8, (Buffer) this.f25399a1);
                GLES20.glEnableVertexAttribArray(this.E);
                GLES20.glVertexAttribPointer(this.E, 2, 5126, false, 8, (Buffer) this.f25402b1);
                GLES20.glBindFramebuffer(36160, this.U0[3]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[3], 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr2[1]);
                GLES20.glDrawArrays(5, 0, 4);
                this.f25400b = false;
            }
            this.h = true;
            this.W0 = false;
            GLES20.glUseProgram(this.f25443u);
            GLES20.glUniform1i(this.f25448x, 0);
            GLES20.glUniform1i(this.f25450y, 1);
            GLES20.glUniform1i(this.f25452z, 2);
            GLES20.glUniform1f(this.A, this.f25413f1.getSoftenSkinValue());
            GLES20.glEnableVertexAttribArray(this.f25446w);
            GLES20.glVertexAttribPointer(this.f25446w, 2, 5126, false, 8, (Buffer) this.f25399a1);
            GLES20.glEnableVertexAttribArray(this.v);
            GLES20.glVertexAttribPointer(this.v, 2, 5126, false, 8, (Buffer) this.f25402b1);
            if (z10) {
                GLES20.glUniformMatrix4fv(this.B, 1, false, this.P0, 0);
                int i13 = this.C;
                if (i13 != -1) {
                    GLES20.glUniform2f(i13, this.X0, this.Y0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.U0[1]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[1], 0);
            GLES20.glActiveTexture(33984);
            if (z10) {
                GLES20.glBindTexture(36197, this.O0);
            } else {
                GLES20.glBindTexture(3553, iArr[0]);
            }
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, iArr2[3]);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, ((int[]) this.f25431o.f22790b)[0]);
            GLES20.glDrawArrays(5, 0, 4);
        } else if (this.h) {
            this.W0 = false;
            this.h = false;
        }
    }

    public final int g(int i10) {
        char c3;
        boolean z4 = this.f25416g1;
        int[] iArr = this.S0;
        if (z4) {
            if (i10 == 0) {
                c3 = 1;
            } else {
                c3 = 0;
            }
            return iArr[c3];
        }
        return iArr[i10];
    }

    public final void i(Bitmap bitmap, int i10, int i11, int i12, int i13) {
        Bitmap bitmap2;
        float f10;
        this.X0 = i12;
        this.Y0 = i13;
        int[] iArr = this.U0;
        int[] iArr2 = this.S0;
        if (iArr == null) {
            int[] iArr3 = new int[4];
            this.U0 = iArr3;
            GLES20.glGenFramebuffers(4, iArr3, 0);
            GLES20.glGenTextures(4, iArr2, 0);
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            int[] iArr4 = this.T0;
            GLES20.glGenTextures(1, iArr4, 0);
            float photoSize = AndroidUtilities.getPhotoSize(true);
            boolean z4 = this.f25421i1;
            if ((z4 && (this.X0 > photoSize || this.Y0 > photoSize)) || i10 % 360 != 0) {
                if (z4 && (this.X0 > photoSize || this.Y0 > photoSize)) {
                    f10 = photoSize / bitmap.getWidth();
                    float height = photoSize / bitmap.getHeight();
                    if (f10 < height) {
                        this.X0 = (int) photoSize;
                        this.Y0 = (int) (bitmap.getHeight() * f10);
                    } else {
                        this.Y0 = (int) photoSize;
                        this.X0 = (int) (bitmap.getWidth() * height);
                        f10 = height;
                    }
                } else {
                    f10 = 1.0f;
                }
                int i14 = i10 % 360;
                if (i14 == 90 || i14 == 270) {
                    int i15 = this.X0;
                    this.X0 = this.Y0;
                    this.Y0 = i15;
                }
                Matrix matrix = new Matrix();
                matrix.setScale(f10, f10);
                matrix.postRotate(i10);
                bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } else {
                bitmap2 = bitmap;
            }
            GLES20.glBindTexture(3553, iArr4[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, bitmap2, 0);
        }
        for (int i16 = 0; i16 < 2; i16++) {
            GLES20.glBindTexture(3553, iArr2[i16]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexImage2D(3553, 0, 6408, this.X0, this.Y0, 0, 6408, 5121, null);
        }
        this.O0 = i11;
        GLES20.glBindTexture(3553, this.Q0[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, this.X0, this.Y0, 0, 6408, 5121, null);
    }

    public final boolean j() {
        int i10;
        String str;
        String str2;
        String str3;
        int i11;
        int h;
        int h9;
        int i12;
        int i13;
        int h10;
        int h11;
        boolean z4;
        int h12;
        int h13;
        qh.q6 q6Var = this.f25418h1;
        if (q6Var != null) {
            i10 = q6Var.a();
        } else {
            i10 = 0;
        }
        String str4 = "";
        if (i10 == 1) {
            str = AndroidUtilities.readRes(R.raw.hdr2sdr_hlg);
        } else if (i10 != 2) {
            str = "";
        } else {
            str = AndroidUtilities.readRes(R.raw.hdr2sdr_pq);
        }
        boolean z10 = this.f25416g1;
        if (!z10) {
            str2 = "";
        } else {
            str2 = "#extension GL_OES_EGL_image_external : require";
        }
        if (!z10) {
            str3 = "sampler2D";
        } else {
            str3 = "samplerExternalOES";
        }
        int[] iArr = new int[1];
        int i14 = 0;
        while (true) {
            if (z10) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            int i15 = i10;
            String str5 = str4;
            String str6 = str;
            if (i14 < i11) {
                if (i14 == 1 && z10) {
                    if (i15 != 0) {
                        h12 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        z4 = z10;
                        h13 = h(35632, String.format(Locale.US, "%1$s\nprecision highp float;varying vec2 vTextureCoord;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = TEX(vTextureCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}", str6));
                    } else {
                        z4 = z10;
                        h13 = 0;
                        h12 = 0;
                    }
                    if (h12 == 0 || h13 == 0) {
                        h12 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        h13 = h(35632, String.format(Locale.US, "%1$s\nprecision highp float;varying vec2 vTextureCoord;uniform %2$s sTexture;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = texture2D(sTexture, vTextureCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}", str2, str3));
                    }
                } else {
                    z4 = z10;
                    h12 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                    h13 = h(35632, String.format(Locale.US, "%1$s\nprecision highp float;varying vec2 vTextureCoord;uniform %2$s sTexture;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = texture2D(sTexture, vTextureCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}", str5, "sampler2D"));
                }
                int i16 = h12;
                int[] iArr2 = this.H;
                GLES20.glDeleteProgram(iArr2[i14]);
                if (i16 != 0 && h13 != 0) {
                    int glCreateProgram = GLES20.glCreateProgram();
                    iArr2[i14] = glCreateProgram;
                    GLES20.glAttachShader(glCreateProgram, i16);
                    GLES20.glAttachShader(iArr2[i14], h13);
                    GLES20.glBindAttribLocation(iArr2[i14], 0, "position");
                    GLES20.glBindAttribLocation(iArr2[i14], 1, "inputTexCoord");
                    GLES20.glLinkProgram(iArr2[i14]);
                    GLES20.glGetProgramiv(iArr2[i14], 35714, iArr, 0);
                    if (iArr[0] == 0) {
                        GLES20.glDeleteProgram(iArr2[i14]);
                        iArr2[i14] = 0;
                    } else {
                        this.I[i14] = GLES20.glGetAttribLocation(iArr2[i14], "position");
                        this.J[i14] = GLES20.glGetAttribLocation(iArr2[i14], "inputTexCoord");
                        this.K[i14] = GLES20.glGetUniformLocation(iArr2[i14], "sTexture");
                        if (i14 == 1) {
                            this.L = GLES20.glGetUniformLocation(iArr2[i14], "videoMatrix");
                            this.M = GLES20.glGetUniformLocation(iArr2[i14], "texSize");
                        }
                    }
                    i14++;
                    i10 = i15;
                    str4 = str5;
                    str = str6;
                    z10 = z4;
                } else {
                    return false;
                }
            } else {
                boolean z11 = z10;
                if (z11) {
                    if (i15 != 0) {
                        i12 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        i13 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;void main() {vec4 inp = TEX(vTextureCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str6));
                    } else {
                        i12 = 0;
                        i13 = 0;
                    }
                    if (i12 == 0 || i13 == 0) {
                        h = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        h9 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;uniform %2$s sTexture;void main() {vec4 inp = texture2D(sTexture, vTextureCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str2, str3));
                    }
                    GLES20.glDeleteProgram(this.f25419i);
                    if (i12 == 0 && i13 != 0) {
                        int glCreateProgram2 = GLES20.glCreateProgram();
                        this.f25419i = glCreateProgram2;
                        GLES20.glAttachShader(glCreateProgram2, i12);
                        GLES20.glAttachShader(this.f25419i, i13);
                        GLES20.glBindAttribLocation(this.f25419i, 0, "position");
                        GLES20.glBindAttribLocation(this.f25419i, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f25419i);
                        GLES20.glGetProgramiv(this.f25419i, 35714, iArr, 0);
                        if (iArr[0] == 0) {
                            GLES20.glDeleteProgram(this.f25419i);
                            this.f25419i = 0;
                        } else {
                            this.f25422j = GLES20.glGetAttribLocation(this.f25419i, "position");
                            this.f25424k = GLES20.glGetAttribLocation(this.f25419i, "inputTexCoord");
                            this.f25426l = GLES20.glGetUniformLocation(this.f25419i, "sTexture");
                            if (z11) {
                                this.f25428m = GLES20.glGetUniformLocation(this.f25419i, "videoMatrix");
                                this.f25429n = GLES20.glGetUniformLocation(this.f25419i, "texSize");
                            }
                        }
                        if (z11) {
                            if (i15 != 0) {
                                h10 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;texCoord2 = inputTexCoord.xy;}");
                                h11 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform sampler2D toneCurveTexture;uniform sampler2D inputImageTexture3;uniform lowp float mixturePercent;void main() {vec4 image = TEX(vTextureCoord);vec4 mask = texture2D(inputImageTexture3, texCoord2);float redCurveValue = texture2D(toneCurveTexture, vec2(image.r, 0.0)).r;float greenCurveValue = texture2D(toneCurveTexture, vec2(image.g, 0.0)).g;float blueCurveValue = texture2D(toneCurveTexture, vec2(image.b, 0.0)).b;vec4 result = vec4(redCurveValue, greenCurveValue, blueCurveValue, image.a);vec4 tone = mix(image, result, mixturePercent);gl_FragColor = vec4(mix(image.rgb, tone.rgb, 1.0 - mask.b), 1.0);}", str6));
                            } else {
                                h10 = 0;
                                h11 = 0;
                            }
                            if (h10 == 0 || h11 == 0) {
                                h10 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;texCoord2 = inputTexCoord.xy;}");
                                h11 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform %2$s sTexture;uniform sampler2D toneCurveTexture;uniform sampler2D inputImageTexture3;uniform lowp float mixturePercent;void main() {vec4 image = texture2D(sTexture, vTextureCoord);vec4 mask = texture2D(inputImageTexture3, texCoord2);float redCurveValue = texture2D(toneCurveTexture, vec2(image.r, 0.0)).r;float greenCurveValue = texture2D(toneCurveTexture, vec2(image.g, 0.0)).g;float blueCurveValue = texture2D(toneCurveTexture, vec2(image.b, 0.0)).b;vec4 result = vec4(redCurveValue, greenCurveValue, blueCurveValue, image.a);vec4 tone = mix(image, result, mixturePercent);gl_FragColor = vec4(mix(image.rgb, tone.rgb, 1.0 - mask.b), 1.0);}", str2, str3));
                            }
                        } else {
                            h10 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = inputTexCoord;texCoord2 = inputTexCoord;}");
                            h11 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform %2$s sTexture;uniform sampler2D toneCurveTexture;uniform sampler2D inputImageTexture3;uniform lowp float mixturePercent;void main() {vec4 image = texture2D(sTexture, vTextureCoord);vec4 mask = texture2D(inputImageTexture3, texCoord2);float redCurveValue = texture2D(toneCurveTexture, vec2(image.r, 0.0)).r;float greenCurveValue = texture2D(toneCurveTexture, vec2(image.g, 0.0)).g;float blueCurveValue = texture2D(toneCurveTexture, vec2(image.b, 0.0)).b;vec4 result = vec4(redCurveValue, greenCurveValue, blueCurveValue, image.a);vec4 tone = mix(image, result, mixturePercent);gl_FragColor = vec4(mix(image.rgb, tone.rgb, 1.0 - mask.b), 1.0);}", str2, str3));
                        }
                        GLES20.glDeleteProgram(this.f25443u);
                        if (h10 == 0 || h11 == 0) {
                            return false;
                        }
                        int glCreateProgram3 = GLES20.glCreateProgram();
                        this.f25443u = glCreateProgram3;
                        GLES20.glAttachShader(glCreateProgram3, h10);
                        GLES20.glAttachShader(this.f25443u, h11);
                        GLES20.glBindAttribLocation(this.f25443u, 0, "position");
                        GLES20.glBindAttribLocation(this.f25443u, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f25443u);
                        GLES20.glGetProgramiv(this.f25443u, 35714, iArr, 0);
                        if (iArr[0] == 0) {
                            GLES20.glDeleteProgram(this.f25443u);
                            this.f25443u = 0;
                            return true;
                        }
                        this.v = GLES20.glGetAttribLocation(this.f25443u, "position");
                        this.f25446w = GLES20.glGetAttribLocation(this.f25443u, "inputTexCoord");
                        this.f25448x = GLES20.glGetUniformLocation(this.f25443u, "sTexture");
                        this.f25450y = GLES20.glGetUniformLocation(this.f25443u, "inputImageTexture3");
                        this.f25452z = GLES20.glGetUniformLocation(this.f25443u, "toneCurveTexture");
                        this.A = GLES20.glGetUniformLocation(this.f25443u, "mixturePercent");
                        if (z11) {
                            this.B = GLES20.glGetUniformLocation(this.f25443u, "videoMatrix");
                            this.C = GLES20.glGetUniformLocation(this.f25443u, "texSize");
                            return true;
                        }
                        return true;
                    }
                }
                h = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                h9 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;uniform %2$s sTexture;void main() {vec4 inp = texture2D(sTexture, vTextureCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str2, str3));
                i12 = h;
                i13 = h9;
                GLES20.glDeleteProgram(this.f25419i);
                return i12 == 0 ? false : false;
            }
        }
    }
}
