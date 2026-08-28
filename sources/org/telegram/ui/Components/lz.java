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
public final class lz {
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
    public int f30587a0;
    public final FloatBuffer f30588a1;
    public int f30590b0;
    public final FloatBuffer f30591b1;
    public boolean f30592c;
    public int f30593c0;
    public ByteBuffer f30594c1;
    public boolean d;
    public int f30595d0;
    public ByteBuffer f30596d1;
    public jz f30597e;
    public int f30598e0;
    public ByteBuffer f30599e1;
    public float f30600f;
    public int f30601f0;
    public kz f30602f1;
    public jz f30603g;
    public int f30604g0;
    public final boolean f30605g1;
    public boolean h;
    public int f30606h0;
    public kh.z7 f30607h1;
    public int f30608i;
    public int f30609i0;
    public int f30611j;
    public int f30612j0;
    public int f30613k;
    public int f30614k0;
    public int f30615l;
    public int f30616l0;
    public int f30617m;
    public int m0;
    public int f30618n;
    public int f30619n0;
    public m5.c0 f30620o;
    public int f30621o0;
    public int f30622p;
    public int f30623p0;
    public int f30624q;
    public int f30625q0;
    public int f30626r;
    public int f30627r0;
    public int f30628s;
    public int f30629s0;
    public int f30630t;
    public int f30631t0;
    public int f30632u;
    public int f30633u0;
    public int v;
    public int f30634v0;
    public int f30635w;
    public int f30636w0;
    public int f30637x;
    public int f30638x0;
    public int f30639y;
    public int f30640y0;
    public int f30641z;
    public int f30642z0;
    public boolean f30586a = true;
    public boolean f30589b = true;
    public final int[] H = new int[2];
    public final int[] I = new int[2];
    public final int[] J = new int[2];
    public final int[] K = new int[2];
    public final int[] Q0 = new int[2];
    public final int[] R0 = new int[1];
    public final int[] S0 = new int[4];
    public final int[] T0 = new int[1];
    public final int[] V0 = new int[1];
    public boolean f30610i1 = true;

    public lz(boolean z10, kh.z7 z7Var) {
        this.f30605g1 = z10;
        this.f30607h1 = z7Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.Z0 = asFloatBuffer;
        asFloatBuffer.put(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f});
        asFloatBuffer.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f30591b1 = asFloatBuffer2;
        asFloatBuffer2.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f30588a1 = asFloatBuffer3;
        asFloatBuffer3.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer3.position(0);
    }

    public static int h(int i9, String str) {
        int glCreateShader = GLES20.glCreateShader(i9);
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
        int h10 = h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;uniform highp float width;uniform highp float height;uniform sampler2D curvesImage;uniform lowp float skipTone;uniform lowp float shadows;const mediump vec3 hsLuminanceWeighting = vec3(0.3, 0.3, 0.3);uniform lowp float highlights;uniform lowp float contrast;uniform lowp float fadeAmount;const mediump vec3 satLuminanceWeighting = vec3(0.2126, 0.7152, 0.0722);uniform lowp float saturation;uniform lowp float shadowsTintIntensity;uniform lowp float highlightsTintIntensity;uniform lowp vec3 shadowsTintColor;uniform lowp vec3 highlightsTintColor;uniform lowp float exposure;uniform lowp float warmth;uniform lowp float grain;const lowp float permTexUnit = 1.0 / 256.0;const lowp float permTexUnitHalf = 0.5 / 256.0;const lowp float grainsize = 2.3;uniform lowp float vignette;highp float getLuma(highp vec3 rgbP) {return (0.299 * rgbP.r) + (0.587 * rgbP.g) + (0.114 * rgbP.b);}lowp vec3 rgbToHsv(lowp vec3 c) {highp vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);highp vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);highp vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);highp float d = q.x - min(q.w, q.y);highp float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}lowp vec3 hsvToRgb(lowp vec3 c) {highp vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);highp vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}highp vec3 rgbToHsl(highp vec3 color) {highp vec3 hsl;highp float fmin = min(min(color.r, color.g), color.b);highp float fmax = max(max(color.r, color.g), color.b);highp float delta = fmax - fmin;hsl.z = (fmax + fmin) / 2.0;if (delta == 0.0) {hsl.x = 0.0;hsl.y = 0.0;} else {if (hsl.z < 0.5) {hsl.y = delta / (fmax + fmin);} else {hsl.y = delta / (2.0 - fmax - fmin);}highp float deltaR = (((fmax - color.r) / 6.0) + (delta / 2.0)) / delta;highp float deltaG = (((fmax - color.g) / 6.0) + (delta / 2.0)) / delta;highp float deltaB = (((fmax - color.b) / 6.0) + (delta / 2.0)) / delta;if (color.r == fmax) {hsl.x = deltaB - deltaG;} else if (color.g == fmax) {hsl.x = (1.0 / 3.0) + deltaR - deltaB;} else if (color.b == fmax) {hsl.x = (2.0 / 3.0) + deltaG - deltaR;}if (hsl.x < 0.0) {hsl.x += 1.0;} else if (hsl.x > 1.0) {hsl.x -= 1.0;}}return hsl;}highp float hueToRgb(highp float f1, highp float f2, highp float hue) {if (hue < 0.0) {hue += 1.0;} else if (hue > 1.0) {hue -= 1.0;}highp float res;if ((6.0 * hue) < 1.0) {res = f1 + (f2 - f1) * 6.0 * hue;} else if ((2.0 * hue) < 1.0) {res = f2;} else if ((3.0 * hue) < 2.0) {res = f1 + (f2 - f1) * ((2.0 / 3.0) - hue) * 6.0;} else {res = f1;}return res;}highp vec3 hslToRgb(highp vec3 hsl) {if (hsl.y == 0.0) {return vec3(hsl.z);} else {highp float f2;if (hsl.z < 0.5) {f2 = hsl.z * (1.0 + hsl.y);} else {f2 = (hsl.z + hsl.y) - (hsl.y * hsl.z);}highp float f1 = 2.0 * hsl.z - f2;return vec3(hueToRgb(f1, f2, hsl.x + (1.0/3.0)), hueToRgb(f1, f2, hsl.x), hueToRgb(f1, f2, hsl.x - (1.0/3.0)));}}highp vec3 rgbToYuv(highp vec3 inP) {highp float luma = getLuma(inP);return vec3(luma, (1.0 / 1.772) * (inP.b - luma), (1.0 / 1.402) * (inP.r - luma));}lowp vec3 yuvToRgb(highp vec3 inP) {return vec3(1.402 * inP.b + inP.r, (inP.r - (0.299 * 1.402 / 0.587) * inP.b - (0.114 * 1.772 / 0.587) * inP.g), 1.772 * inP.g + inP.r);}lowp float easeInOutSigmoid(lowp float value, lowp float strength) {if (value > 0.5) {return 1.0 - pow(2.0 - 2.0 * value, 1.0 / (1.0 - strength)) * 0.5;} else {return pow(2.0 * value, 1.0 / (1.0 - strength)) * 0.5;}}lowp vec3 applyLuminanceCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.z / (1.0 / 200.0), 0.0, 199.0));pixel.y = mix(0.0, pixel.y, smoothstep(0.0, 0.1, pixel.z) * (1.0 - smoothstep(0.8, 1.0, pixel.z)));pixel.z = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).a;return pixel;}lowp vec3 applyRGBCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.r / (1.0 / 200.0), 0.0, 199.0));pixel.r = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).r;index = floor(clamp(pixel.g / (1.0 / 200.0), 0.0, 199.0));pixel.g = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).g, 0.0, 1.0);index = floor(clamp(pixel.b / (1.0 / 200.0), 0.0, 199.0));pixel.b = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).b, 0.0, 1.0);return pixel;}highp vec3 fadeAdjust(highp vec3 color, highp float fadeVal) {return (color * (1.0 - fadeVal)) + ((color + (vec3(-0.9772) * pow(vec3(color), vec3(3.0)) + vec3(1.708) * pow(vec3(color), vec3(2.0)) + vec3(-0.1603) * vec3(color) + vec3(0.2878) - color * vec3(0.9))) * fadeVal);}lowp vec3 tintRaiseShadowsCurve(lowp vec3 color) {return vec3(-0.003671) * pow(color, vec3(3.0)) + vec3(0.3842) * pow(color, vec3(2.0)) + vec3(0.3764) * color + vec3(0.2515);}lowp vec3 tintShadows(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, tintRaiseShadowsCurve(texel), tintColor), tintAmount), 0.0, 1.0);} lowp vec3 tintHighlights(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, vec3(1.0) - tintRaiseShadowsCurve(vec3(1.0) - texel), (vec3(1.0) - tintColor)), tintAmount), 0.0, 1.0);}highp vec4 rnm(in highp vec2 tc) {highp float noise = sin(dot(tc, vec2(12.9898, 78.233))) * 43758.5453;return vec4(fract(noise), fract(noise * 1.2154), fract(noise * 1.3453), fract(noise * 1.3647)) * 2.0 - 1.0;}highp float fade(in highp float t) {return t * t * t * (t * (t * 6.0 - 15.0) + 10.0);}highp float pnoise3D(in highp vec3 p) {highp vec3 pi = permTexUnit * floor(p) + permTexUnitHalf;highp vec3 pf = fract(p);highp float perm = rnm(pi.xy).a;highp float n000 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf);highp float n001 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(0.0, permTexUnit)).a;highp float n010 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 0.0));highp float n011 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, 0.0)).a;highp float n100 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 0.0));highp float n101 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, permTexUnit)).a;highp float n110 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 0.0));highp float n111 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 1.0));highp vec4 n_x = mix(vec4(n000, n001, n010, n011), vec4(n100, n101, n110, n111), fade(pf.x));highp vec2 n_xy = mix(n_x.xy, n_x.zw, fade(pf.y));return mix(n_xy.x, n_xy.y, fade(pf.z));}lowp vec2 coordRot(in lowp vec2 tc, in lowp float angle) {return vec2(((tc.x * 2.0 - 1.0) * cos(angle) - (tc.y * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5, ((tc.y * 2.0 - 1.0) * cos(angle) + (tc.x * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5);}void main() {lowp vec4 source = texture2D(sTexture, vTextureCoord);lowp vec4 result = source;const lowp float toolEpsilon = 0.005;if (skipTone < toolEpsilon) {result = vec4(applyRGBCurve(hslToRgb(applyLuminanceCurve(rgbToHsl(result.rgb)))), result.a);}mediump float hsLuminance = dot(result.rgb, hsLuminanceWeighting);mediump float shadow = clamp((pow(hsLuminance, 1.0 / shadows) + (-0.76) * pow(hsLuminance, 2.0 / shadows)) - hsLuminance, 0.0, 1.0);mediump float highlight = clamp((1.0 - (pow(1.0 - hsLuminance, 1.0 / (2.0 - highlights)) + (-0.8) * pow(1.0 - hsLuminance, 2.0 / (2.0 - highlights)))) - hsLuminance, -1.0, 0.0);lowp vec3 hsresult = vec3(0.0, 0.0, 0.0) + ((hsLuminance + shadow + highlight) - 0.0) * ((result.rgb - vec3(0.0, 0.0, 0.0)) / (hsLuminance - 0.0));mediump float contrastedLuminance = ((hsLuminance - 0.5) * 1.5) + 0.5;mediump float whiteInterp = contrastedLuminance * contrastedLuminance * contrastedLuminance;mediump float whiteTarget = clamp(highlights, 1.0, 2.0) - 1.0;hsresult = mix(hsresult, vec3(1.0), whiteInterp * whiteTarget);mediump float invContrastedLuminance = 1.0 - contrastedLuminance;mediump float blackInterp = invContrastedLuminance * invContrastedLuminance * invContrastedLuminance;mediump float blackTarget = 1.0 - clamp(shadows, 0.0, 1.0);hsresult = mix(hsresult, vec3(0.0), blackInterp * blackTarget);result = vec4(hsresult.rgb, result.a);result = vec4(clamp(((result.rgb - vec3(0.5)) * contrast + vec3(0.5)), 0.0, 1.0), result.a);if (abs(fadeAmount) > toolEpsilon) {result.rgb = fadeAdjust(result.rgb, fadeAmount);}lowp float satLuminance = dot(result.rgb, satLuminanceWeighting);lowp vec3 greyScaleColor = vec3(satLuminance);result = vec4(clamp(mix(greyScaleColor, result.rgb, saturation), 0.0, 1.0), result.a);if (abs(shadowsTintIntensity) > toolEpsilon) {result.rgb = tintShadows(result.rgb, shadowsTintColor, shadowsTintIntensity * 2.0);}if (abs(highlightsTintIntensity) > toolEpsilon) {result.rgb = tintHighlights(result.rgb, highlightsTintColor, highlightsTintIntensity * 2.0);}if (abs(exposure) > toolEpsilon) {mediump float mag = exposure * 1.045;mediump float exppower = 1.0 + abs(mag);if (mag < 0.0) {exppower = 1.0 / exppower;}result.r = 1.0 - pow((1.0 - result.r), exppower);result.g = 1.0 - pow((1.0 - result.g), exppower);result.b = 1.0 - pow((1.0 - result.b), exppower);}if (abs(warmth) > toolEpsilon) {highp vec3 yuvVec;if (warmth > 0.0 ) {yuvVec = vec3(0.1765, -0.1255, 0.0902);} else {yuvVec = -vec3(0.0588, 0.1569, -0.1255);}highp vec3 yuvColor = rgbToYuv(result.rgb);highp float luma = yuvColor.r;highp float curveScale = sin(luma * 3.14159);yuvColor += 0.375 * warmth * curveScale * yuvVec;result.rgb = yuvToRgb(yuvColor);}if (abs(grain) > toolEpsilon) {highp vec3 rotOffset = vec3(1.425, 3.892, 5.835);highp vec2 rotCoordsR = coordRot(vTextureCoord, rotOffset.x);highp vec3 noise = vec3(pnoise3D(vec3(rotCoordsR * vec2(width / grainsize, height / grainsize),0.0)));lowp vec3 lumcoeff = vec3(0.299,0.587,0.114);lowp float luminance = dot(result.rgb, lumcoeff);lowp float lum = smoothstep(0.2, 0.0, luminance);lum += luminance;noise = mix(noise,vec3(0.0),pow(lum,4.0));result.rgb = result.rgb + noise * grain;}if (abs(vignette) > toolEpsilon) {const lowp float midpoint = 0.7;const lowp float fuzziness = 0.62;lowp float radDist = length(vTextureCoord - 0.5) / sqrt(0.5);lowp float mag = easeInOutSigmoid(radDist * midpoint, fuzziness) * vignette * 0.645;result.rgb = mix(pow(result.rgb, vec3(1.0 / (1.0 - mag))), vec3(0.0), mag * mag);}gl_FragColor = result;}");
        if (h != 0 && h10 != 0) {
            int glCreateProgram = GLES20.glCreateProgram();
            this.T = glCreateProgram;
            GLES20.glAttachShader(glCreateProgram, h);
            GLES20.glAttachShader(this.T, h10);
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
                this.f30587a0 = GLES20.glGetUniformLocation(this.T, "contrast");
                this.f30590b0 = GLES20.glGetUniformLocation(this.T, "saturation");
                this.f30593c0 = GLES20.glGetUniformLocation(this.T, "warmth");
                this.f30595d0 = GLES20.glGetUniformLocation(this.T, "vignette");
                this.f30598e0 = GLES20.glGetUniformLocation(this.T, "grain");
                this.f30601f0 = GLES20.glGetUniformLocation(this.T, "width");
                this.f30604g0 = GLES20.glGetUniformLocation(this.T, "height");
                this.f30606h0 = GLES20.glGetUniformLocation(this.T, "curvesImage");
                this.f30609i0 = GLES20.glGetUniformLocation(this.T, "skipTone");
                this.f30612j0 = GLES20.glGetUniformLocation(this.T, "fadeAmount");
                this.f30614k0 = GLES20.glGetUniformLocation(this.T, "shadowsTintIntensity");
                this.f30616l0 = GLES20.glGetUniformLocation(this.T, "highlightsTintIntensity");
                this.m0 = GLES20.glGetUniformLocation(this.T, "shadowsTintColor");
                this.f30619n0 = GLES20.glGetUniformLocation(this.T, "highlightsTintColor");
            }
            int h11 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;uniform highp float inputWidth;uniform highp float inputHeight;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;highp vec2 widthStep = vec2(1.0 / inputWidth, 0.0);highp vec2 heightStep = vec2(0.0, 1.0 / inputHeight);leftTexCoord = inputTexCoord - widthStep;rightTexCoord = inputTexCoord + widthStep;topTexCoord = inputTexCoord + heightStep;bottomTexCoord = inputTexCoord - heightStep;}");
            int h12 = h(35632, "precision highp float;varying vec2 vTextureCoord;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;uniform sampler2D sTexture;uniform float sharpen;void main() {vec4 result = texture2D(sTexture, vTextureCoord);vec3 leftTextureColor = texture2D(sTexture, leftTexCoord).rgb;vec3 rightTextureColor = texture2D(sTexture, rightTexCoord).rgb;vec3 topTextureColor = texture2D(sTexture, topTexCoord).rgb;vec3 bottomTextureColor = texture2D(sTexture, bottomTexCoord).rgb;result.rgb = result.rgb * (1.0 + 4.0 * sharpen) - (leftTextureColor + rightTextureColor + topTextureColor + bottomTextureColor) * sharpen;gl_FragColor = result;}");
            if (h11 != 0 && h12 != 0) {
                int glCreateProgram2 = GLES20.glCreateProgram();
                this.H0 = glCreateProgram2;
                GLES20.glAttachShader(glCreateProgram2, h11);
                GLES20.glAttachShader(this.H0, h12);
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
                jz jzVar = new jz(8.0f, 3.0f, false);
                this.f30603g = jzVar;
                if (jzVar.a() && j()) {
                    int h13 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                    int h14 = h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float angle;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sTexture, vTextureCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, vTextureCoord);highp vec2 texCoordToUse = vec2(vTextureCoord.x, (vTextureCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = abs((texCoordToUse.x - excludePoint.x) * aspectRatio * cos(angle) + (texCoordToUse.y - excludePoint.y) * sin(angle));gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                    if (h13 != 0 && h14 != 0) {
                        int glCreateProgram3 = GLES20.glCreateProgram();
                        this.f30621o0 = glCreateProgram3;
                        GLES20.glAttachShader(glCreateProgram3, h13);
                        GLES20.glAttachShader(this.f30621o0, h14);
                        GLES20.glBindAttribLocation(this.f30621o0, 0, "position");
                        GLES20.glBindAttribLocation(this.f30621o0, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f30621o0);
                        GLES20.glGetProgramiv(this.f30621o0, 35714, iArr3, 0);
                        if (iArr3[0] == 0) {
                            GLES20.glDeleteProgram(this.f30621o0);
                            this.f30621o0 = 0;
                        } else {
                            this.f30623p0 = GLES20.glGetAttribLocation(this.f30621o0, "position");
                            this.f30625q0 = GLES20.glGetAttribLocation(this.f30621o0, "inputTexCoord");
                            this.f30627r0 = GLES20.glGetUniformLocation(this.f30621o0, "sTexture");
                            this.f30629s0 = GLES20.glGetUniformLocation(this.f30621o0, "inputImageTexture2");
                            this.f30631t0 = GLES20.glGetUniformLocation(this.f30621o0, "excludeSize");
                            this.f30633u0 = GLES20.glGetUniformLocation(this.f30621o0, "excludePoint");
                            this.f30634v0 = GLES20.glGetUniformLocation(this.f30621o0, "excludeBlurSize");
                            this.f30636w0 = GLES20.glGetUniformLocation(this.f30621o0, "angle");
                            this.f30638x0 = GLES20.glGetUniformLocation(this.f30621o0, "aspectRatio");
                        }
                        int h15 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                        int h16 = h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sTexture, vTextureCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, vTextureCoord);highp vec2 texCoordToUse = vec2(vTextureCoord.x, (vTextureCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = distance(excludePoint, texCoordToUse);gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                        if (h15 != 0 && h16 != 0) {
                            int glCreateProgram4 = GLES20.glCreateProgram();
                            this.f30640y0 = glCreateProgram4;
                            GLES20.glAttachShader(glCreateProgram4, h15);
                            GLES20.glAttachShader(this.f30640y0, h16);
                            GLES20.glBindAttribLocation(this.f30640y0, 0, "position");
                            GLES20.glBindAttribLocation(this.f30640y0, 1, "inputTexCoord");
                            GLES20.glLinkProgram(this.f30640y0);
                            GLES20.glGetProgramiv(this.f30640y0, 35714, iArr3, 0);
                            if (iArr3[0] == 0) {
                                GLES20.glDeleteProgram(this.f30640y0);
                                this.f30640y0 = 0;
                            } else {
                                this.f30642z0 = GLES20.glGetAttribLocation(this.f30640y0, "position");
                                this.A0 = GLES20.glGetAttribLocation(this.f30640y0, "inputTexCoord");
                                this.B0 = GLES20.glGetUniformLocation(this.f30640y0, "sTexture");
                                this.C0 = GLES20.glGetUniformLocation(this.f30640y0, "inputImageTexture2");
                                this.D0 = GLES20.glGetUniformLocation(this.f30640y0, "excludeSize");
                                this.E0 = GLES20.glGetUniformLocation(this.f30640y0, "excludePoint");
                                this.F0 = GLES20.glGetUniformLocation(this.f30640y0, "excludeBlurSize");
                                this.G0 = GLES20.glGetUniformLocation(this.f30640y0, "aspectRatio");
                            }
                            int h17 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                            int h18 = h(35632, "precision highp float;varying vec2 vTextureCoord;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;uniform float intensity;float enhance(float value) {const vec2 offset = vec2(0.001953125, 0.03125);value = value + offset.x;vec2 coord = (clamp(vTextureCoord, 0.125, 1.0 - 0.125001) - 0.125) * 4.0;vec2 frac = fract(coord);coord = floor(coord);float p00 = float(coord.y * 4.0 + coord.x) * 0.0625 + offset.y;float p01 = float(coord.y * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;float p10 = float((coord.y + 1.0) * 4.0 + coord.x) * 0.0625 + offset.y;float p11 = float((coord.y + 1.0) * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;vec3 c00 = texture2D(inputImageTexture2, vec2(value, p00)).rgb;vec3 c01 = texture2D(inputImageTexture2, vec2(value, p01)).rgb;vec3 c10 = texture2D(inputImageTexture2, vec2(value, p10)).rgb;vec3 c11 = texture2D(inputImageTexture2, vec2(value, p11)).rgb;float c1 = ((c00.r - c00.g) / (c00.b - c00.g));float c2 = ((c01.r - c01.g) / (c01.b - c01.g));float c3 = ((c10.r - c10.g) / (c10.b - c10.g));float c4 = ((c11.r - c11.g) / (c11.b - c11.g));float c1_2 = mix(c1, c2, frac.x);float c3_4 = mix(c3, c4, frac.x);return mix(c1_2, c3_4, frac.y);}vec3 hsv_to_rgb(vec3 c) {vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}void main() {vec4 texel = texture2D(sTexture, vTextureCoord);vec4 hsv = texel;hsv.y = min(1.0, hsv.y * 1.2);hsv.z = min(1.0, enhance(hsv.z) * 1.1);gl_FragColor = vec4(hsv_to_rgb(mix(texel.xyz, hsv.xyz, intensity)), texel.w);}");
                            if (h17 != 0 && h18 != 0) {
                                int glCreateProgram5 = GLES20.glCreateProgram();
                                this.N = glCreateProgram5;
                                GLES20.glAttachShader(glCreateProgram5, h17);
                                GLES20.glAttachShader(this.N, h18);
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
                                int h19 = h(35632, "precision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;void main() {vec4 image = texture2D(sTexture, vTextureCoord);vec4 blurredImage = texture2D(inputImageTexture2, texCoord2);gl_FragColor = vec4((image.rgb - blurredImage.rgb + vec3(0.5,0.5,0.5)), image.a);}");
                                int h20 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = inputTexCoord;texCoord2 = inputTexCoord;}");
                                if (h20 != 0 && h19 != 0) {
                                    int glCreateProgram6 = GLES20.glCreateProgram();
                                    this.f30622p = glCreateProgram6;
                                    GLES20.glAttachShader(glCreateProgram6, h20);
                                    GLES20.glAttachShader(this.f30622p, h19);
                                    GLES20.glBindAttribLocation(this.f30622p, 0, "position");
                                    GLES20.glBindAttribLocation(this.f30622p, 1, "inputTexCoord");
                                    GLES20.glLinkProgram(this.f30622p);
                                    GLES20.glGetProgramiv(this.f30622p, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        GLES20.glDeleteProgram(this.f30622p);
                                        this.f30622p = 0;
                                    } else {
                                        this.f30624q = GLES20.glGetAttribLocation(this.f30622p, "position");
                                        this.f30626r = GLES20.glGetAttribLocation(this.f30622p, "inputTexCoord");
                                        this.f30628s = GLES20.glGetUniformLocation(this.f30622p, "sTexture");
                                        this.f30630t = GLES20.glGetUniformLocation(this.f30622p, "inputImageTexture2");
                                    }
                                    int h21 = h(35632, "precision lowp float;varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {vec4 color = texture2D(sTexture, vTextureCoord);float hardLightColor = color.b;for (int i = 0; i < 3; ++i){if (hardLightColor < 0.5) {hardLightColor = hardLightColor * hardLightColor * 2.0;} else {hardLightColor = 1.0 - (1.0 - hardLightColor) * (1.0 - hardLightColor) * 2.0;}}float k = 255.0 / (164.0 - 75.0);hardLightColor = (hardLightColor - 75.0 / 255.0) * k;gl_FragColor = vec4(vec3(hardLightColor), color.a);}");
                                    int h22 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                    if (h22 != 0 && h21 != 0) {
                                        int glCreateProgram7 = GLES20.glCreateProgram();
                                        this.D = glCreateProgram7;
                                        GLES20.glAttachShader(glCreateProgram7, h22);
                                        GLES20.glAttachShader(this.D, h21);
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
                                        m5.c0 c0Var = new m5.c0(14);
                                        int[] iArr4 = new int[1];
                                        c0Var.f17378b = iArr4;
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(new PointF(0.0f, 0.0f));
                                        arrayList.add(new PointF(0.5f, 0.5f));
                                        arrayList.add(new PointF(1.0f, 1.0f));
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(new PointF(0.0f, 0.0f));
                                        arrayList2.add(new PointF(0.47f, 0.57f));
                                        arrayList2.add(new PointF(1.0f, 1.0f));
                                        float[] l10 = m5.c0.l(arrayList2);
                                        float[] l11 = m5.c0.l(arrayList);
                                        GLES20.glGenTextures(1, iArr4, 0);
                                        GLES20.glBindTexture(3553, iArr4[0]);
                                        GLES20.glTexParameteri(3553, 10241, 9729);
                                        GLES20.glTexParameteri(3553, 10240, 9729);
                                        GLES20.glTexParameteri(3553, 10242, 33071);
                                        GLES20.glTexParameteri(3553, 10243, 33071);
                                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1024);
                                        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                                        if (l11.length >= 256 && l11.length >= 256 && l11.length >= 256 && l10.length >= 256) {
                                            for (int i9 = 0; i9 < 256; i9++) {
                                                float f10 = i9;
                                                int min = (int) Math.min(Math.max(l11[i9] + f10, 0.0f), 255.0f);
                                                int min2 = (int) Math.min(Math.max(l11[i9] + f10, 0.0f), 255.0f);
                                                int min3 = (int) Math.min(Math.max(f10 + l11[i9], 0.0f), 255.0f);
                                                allocateDirect.put((byte) Math.min(Math.max(min3 + l10[min3], 0.0f), 255.0f));
                                                allocateDirect.put((byte) Math.min(Math.max(min2 + l10[min2], 0.0f), 255.0f));
                                                allocateDirect.put((byte) Math.min(Math.max(min + l10[min], 0.0f), 255.0f));
                                                allocateDirect.put((byte) -1);
                                            }
                                            allocateDirect.position(0);
                                            GLES20.glTexImage2D(3553, 0, 6408, 256, 1, 0, 6408, 5121, allocateDirect);
                                        }
                                        this.f30620o = c0Var;
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
        int i9;
        kz kzVar;
        kz kzVar2 = this.f30602f1;
        if (kzVar2 != null) {
            i9 = kzVar2.getBlurType();
        } else {
            i9 = 0;
        }
        if (this.f30605g1 || (kzVar = this.f30602f1) == null || kzVar.b() || i9 == 0) {
            return false;
        }
        boolean z10 = this.f30586a;
        int[] iArr = this.S0;
        if (z10) {
            if (!this.f30592c) {
                GLES20.glBindTexture(3553, iArr[2]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glTexImage2D(3553, 0, 6408, this.X0, this.Y0, 0, 6408, 5121, null);
                this.f30592c = true;
            }
            GLES20.glUseProgram(this.f30603g.f29889c);
            GLES20.glUniform1i(this.f30603g.f29891f, 0);
            GLES20.glEnableVertexAttribArray(this.f30603g.f29890e);
            GLES20.glVertexAttribPointer(this.f30603g.f29890e, 2, 5126, false, 8, (Buffer) this.f30588a1);
            GLES20.glEnableVertexAttribArray(this.f30603g.d);
            GLES20.glVertexAttribPointer(this.f30603g.d, 2, 5126, false, 8, (Buffer) this.f30591b1);
            GLES20.glBindFramebuffer(36160, this.U0[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr[1]);
            GLES20.glUniform1f(this.f30603g.f29892g, 0.0f);
            GLES20.glUniform1f(this.f30603g.h, 1.0f / this.Y0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.U0[2]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[2], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glUniform1f(this.f30603g.f29892g, 1.0f / this.X0);
            GLES20.glUniform1f(this.f30603g.h, 0.0f);
            GLES20.glDrawArrays(5, 0, 4);
            this.f30586a = false;
        }
        GLES20.glBindFramebuffer(36160, this.U0[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
        if (i9 == 1) {
            GLES20.glUseProgram(this.f30640y0);
            GLES20.glUniform1i(this.B0, 0);
            GLES20.glUniform1i(this.C0, 1);
            GLES20.glUniform1f(this.D0, this.f30602f1.getBlurExcludeSize());
            GLES20.glUniform1f(this.F0, this.f30602f1.getBlurExcludeBlurSize());
            PointF blurExcludePoint = this.f30602f1.getBlurExcludePoint();
            GLES20.glUniform2f(this.E0, blurExcludePoint.x, blurExcludePoint.y);
            GLES20.glUniform1f(this.G0, this.Y0 / this.X0);
            GLES20.glEnableVertexAttribArray(this.A0);
            GLES20.glVertexAttribPointer(this.A0, 2, 5126, false, 8, (Buffer) this.f30588a1);
            GLES20.glEnableVertexAttribArray(this.f30642z0);
            GLES20.glVertexAttribPointer(this.f30642z0, 2, 5126, false, 8, (Buffer) this.f30591b1);
        } else if (i9 == 2) {
            GLES20.glUseProgram(this.f30621o0);
            GLES20.glUniform1i(this.f30627r0, 0);
            GLES20.glUniform1i(this.f30629s0, 1);
            GLES20.glUniform1f(this.f30631t0, this.f30602f1.getBlurExcludeSize());
            GLES20.glUniform1f(this.f30634v0, this.f30602f1.getBlurExcludeBlurSize());
            GLES20.glUniform1f(this.f30636w0, this.f30602f1.getBlurAngle());
            PointF blurExcludePoint2 = this.f30602f1.getBlurExcludePoint();
            GLES20.glUniform2f(this.f30633u0, blurExcludePoint2.x, blurExcludePoint2.y);
            GLES20.glUniform1f(this.f30638x0, this.Y0 / this.X0);
            GLES20.glEnableVertexAttribArray(this.f30625q0);
            GLES20.glVertexAttribPointer(this.f30625q0, 2, 5126, false, 8, (Buffer) this.f30588a1);
            GLES20.glEnableVertexAttribArray(this.f30623p0);
            GLES20.glVertexAttribPointer(this.f30623p0, 2, 5126, false, 8, (Buffer) this.f30591b1);
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
        boolean z10 = this.f30605g1;
        int i9 = !z10 ? 1 : 0;
        GLES20.glBindFramebuffer(36160, iArr[i9]);
        int[] iArr2 = this.S0;
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[i9], 0);
        GLES20.glUseProgram(this.T);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr2[z10 ? 1 : 0]);
        GLES20.glUniform1i(this.W, 0);
        kz kzVar = this.f30602f1;
        float f10 = 1.0f;
        if (kzVar != null && !kzVar.b()) {
            GLES20.glUniform1f(this.X, this.f30602f1.getShadowsValue());
            GLES20.glUniform1f(this.Y, this.f30602f1.getHighlightsValue());
            GLES20.glUniform1f(this.Z, this.f30602f1.getExposureValue());
            GLES20.glUniform1f(this.f30587a0, this.f30602f1.getContrastValue());
            GLES20.glUniform1f(this.f30590b0, this.f30602f1.getSaturationValue());
            GLES20.glUniform1f(this.f30593c0, this.f30602f1.getWarmthValue());
            GLES20.glUniform1f(this.f30595d0, this.f30602f1.getVignetteValue());
            GLES20.glUniform1f(this.f30598e0, this.f30602f1.getGrainValue());
            GLES20.glUniform1f(this.f30612j0, this.f30602f1.getFadeValue());
            int tintHighlightsColor = this.f30602f1.getTintHighlightsColor();
            int tintShadowsColor = this.f30602f1.getTintShadowsColor();
            GLES20.glUniform3f(this.f30619n0, ((tintHighlightsColor >> 16) & 255) / 255.0f, ((tintHighlightsColor >> 8) & 255) / 255.0f, (tintHighlightsColor & 255) / 255.0f);
            GLES20.glUniform1f(this.f30616l0, this.f30602f1.getTintHighlightsIntensityValue());
            GLES20.glUniform3f(this.m0, ((tintShadowsColor >> 16) & 255) / 255.0f, ((tintShadowsColor >> 8) & 255) / 255.0f, (tintShadowsColor & 255) / 255.0f);
            GLES20.glUniform1f(this.f30614k0, this.f30602f1.getTintShadowsIntensityValue());
            boolean c10 = this.f30602f1.c();
            int i10 = this.f30609i0;
            if (c10) {
                f10 = 0.0f;
            }
            GLES20.glUniform1f(i10, f10);
            if (c10) {
                ByteBuffer a2 = this.f30602f1.a();
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, this.V0[0]);
                GLES20.glTexImage2D(3553, 0, 6408, 200, 1, 0, 6408, 5121, a2);
                GLES20.glUniform1i(this.f30606h0, 1);
            }
        } else {
            GLES20.glUniform1f(this.X, 1.0f);
            GLES20.glUniform1f(this.Y, 1.0f);
            GLES20.glUniform1f(this.Z, 0.0f);
            GLES20.glUniform1f(this.f30587a0, 1.0f);
            GLES20.glUniform1f(this.f30590b0, 1.0f);
            GLES20.glUniform1f(this.f30593c0, 0.0f);
            GLES20.glUniform1f(this.f30595d0, 0.0f);
            GLES20.glUniform1f(this.f30598e0, 0.0f);
            GLES20.glUniform1f(this.f30612j0, 0.0f);
            GLES20.glUniform3f(this.f30619n0, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.f30616l0, 0.0f);
            GLES20.glUniform3f(this.m0, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.f30614k0, 0.0f);
            GLES20.glUniform1f(this.f30609i0, 1.0f);
        }
        GLES20.glUniform1f(this.f30601f0, this.X0);
        GLES20.glUniform1f(this.f30604g0, this.Y0);
        GLES20.glEnableVertexAttribArray(this.V);
        GLES20.glVertexAttribPointer(this.V, 2, 5126, false, 8, (Buffer) this.f30588a1);
        GLES20.glEnableVertexAttribArray(this.U);
        GLES20.glVertexAttribPointer(this.U, 2, 5126, false, 8, (Buffer) this.f30591b1);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void d() {
        boolean z10;
        int i9;
        int i10;
        char c10;
        FloatBuffer floatBuffer;
        boolean z11 = this.f30605g1;
        if (z11) {
            z10 = true;
        } else {
            z10 = !this.W0;
        }
        int[] iArr = this.S0;
        int[] iArr2 = this.Q0;
        if (z10) {
            int[] iArr3 = this.H;
            if (z11 && !this.h) {
                GLES20.glUseProgram(iArr3[1]);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, this.O0);
                GLES20.glUniformMatrix4fv(this.L, 1, false, this.P0, 0);
                int i11 = this.M;
                if (i11 != -1) {
                    GLES20.glUniform2f(i11, this.X0, this.Y0);
                }
                c10 = 1;
            } else {
                GLES20.glUseProgram(iArr3[0]);
                GLES20.glActiveTexture(33984);
                if (this.h) {
                    i10 = iArr[1];
                } else {
                    i10 = this.T0[0];
                }
                GLES20.glBindTexture(3553, i10);
                c10 = 0;
            }
            GLES20.glUniform1i(this.K[c10], 0);
            int[] iArr4 = this.J;
            GLES20.glEnableVertexAttribArray(iArr4[c10]);
            GLES20.glVertexAttribPointer(iArr4[c10], 2, 5126, false, 8, (Buffer) this.f30588a1);
            int[] iArr5 = this.I;
            GLES20.glEnableVertexAttribArray(iArr5[c10]);
            int i12 = iArr5[c10];
            if (z11) {
                floatBuffer = this.f30591b1;
            } else {
                floatBuffer = this.Z0;
            }
            GLES20.glVertexAttribPointer(i12, 2, 5126, false, 8, (Buffer) floatBuffer);
            GLES20.glBindFramebuffer(36160, this.R0[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (!this.W0) {
            int i13 = this.X0 * this.Y0 * 4;
            ByteBuffer byteBuffer = this.f30594c1;
            if (byteBuffer == null || i13 > byteBuffer.capacity()) {
                this.f30594c1 = ByteBuffer.allocateDirect(i13);
            }
            if (this.f30596d1 == null) {
                this.f30596d1 = ByteBuffer.allocateDirect(16384);
            }
            if (this.f30599e1 == null) {
                this.f30599e1 = ByteBuffer.allocateDirect(32896);
            }
            GLES20.glReadPixels(0, 0, this.X0, this.Y0, 6408, 5121, this.f30594c1);
            i9 = 33984;
            Utilities.calcCDT(this.f30594c1, this.X0, this.Y0, this.f30596d1, this.f30599e1);
            GLES20.glBindTexture(3553, iArr2[1]);
            GLES20.glTexImage2D(3553, 0, 6408, 256, 16, 0, 6408, 5121, this.f30596d1);
            if (!z11) {
                this.f30594c1 = null;
                this.f30596d1 = null;
                this.f30599e1 = null;
            }
            this.W0 = true;
        } else {
            i9 = 33984;
        }
        GLES20.glBindFramebuffer(36160, this.U0[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[1], 0);
        GLES20.glUseProgram(this.N);
        GLES20.glActiveTexture(i9);
        GLES20.glBindTexture(3553, iArr2[0]);
        GLES20.glUniform1i(this.Q, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, iArr2[1]);
        GLES20.glUniform1i(this.S, 1);
        kz kzVar = this.f30602f1;
        if (kzVar != null && !kzVar.b()) {
            GLES20.glUniform1f(this.R, this.f30602f1.getEnhanceValue());
        } else {
            GLES20.glUniform1f(this.R, 0.0f);
        }
        GLES20.glEnableVertexAttribArray(this.P);
        GLES20.glVertexAttribPointer(this.P, 2, 5126, false, 8, (Buffer) this.f30588a1);
        GLES20.glEnableVertexAttribArray(this.O);
        GLES20.glVertexAttribPointer(this.O, 2, 5126, false, 8, (Buffer) this.Z0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void e() {
        if (this.f30605g1) {
            return;
        }
        GLES20.glBindFramebuffer(36160, this.U0[0]);
        int[] iArr = this.S0;
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
        GLES20.glUseProgram(this.H0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[1]);
        GLES20.glUniform1i(this.N0, 0);
        kz kzVar = this.f30602f1;
        if (kzVar != null && !kzVar.b()) {
            GLES20.glUniform1f(this.I0, this.f30602f1.getSharpenValue());
        } else {
            GLES20.glUniform1f(this.I0, 0.0f);
        }
        GLES20.glUniform1f(this.J0, this.X0);
        GLES20.glUniform1f(this.K0, this.Y0);
        GLES20.glEnableVertexAttribArray(this.M0);
        GLES20.glVertexAttribPointer(this.M0, 2, 5126, false, 8, (Buffer) this.f30588a1);
        GLES20.glEnableVertexAttribArray(this.L0);
        GLES20.glVertexAttribPointer(this.L0, 2, 5126, false, 8, (Buffer) this.f30591b1);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void f() {
        int i9;
        int i10;
        kz kzVar = this.f30602f1;
        if (kzVar != null && !kzVar.b() && this.f30602f1.getSoftenSkinValue() > 0.0f && (i9 = this.X0) > 0 && this.Y0 > 0) {
            boolean z10 = this.f30589b;
            int[] iArr = this.T0;
            boolean z11 = this.f30605g1;
            int[] iArr2 = this.S0;
            if (z10 || z11) {
                float f10 = i9 * 0.006f;
                if (this.f30597e == null || Math.abs(this.f30600f - f10) > 1.0E-4d) {
                    jz jzVar = this.f30597e;
                    if (jzVar != null && (i10 = jzVar.f29889c) != 0) {
                        GLES20.glDeleteProgram(i10);
                        jzVar.f29889c = 0;
                    }
                    this.f30600f = f10;
                    jz jzVar2 = new jz(f10, 2.0f, true);
                    this.f30597e = jzVar2;
                    jzVar2.a();
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
                GLES20.glUseProgram(this.f30608i);
                GLES20.glUniform1i(this.f30615l, 0);
                GLES20.glEnableVertexAttribArray(this.f30613k);
                GLES20.glVertexAttribPointer(this.f30613k, 2, 5126, false, 8, (Buffer) this.f30588a1);
                GLES20.glEnableVertexAttribArray(this.f30611j);
                if (z11) {
                    GLES20.glUniformMatrix4fv(this.f30617m, 1, false, this.P0, 0);
                    int i11 = this.f30618n;
                    if (i11 != -1) {
                        GLES20.glUniform2f(i11, this.X0, this.Y0);
                    }
                }
                GLES20.glVertexAttribPointer(this.f30611j, 2, 5126, false, 8, (Buffer) this.f30591b1);
                GLES20.glBindFramebuffer(36160, this.U0[0]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
                GLES20.glActiveTexture(33984);
                if (z11) {
                    GLES20.glBindTexture(36197, this.O0);
                } else {
                    GLES20.glBindTexture(3553, iArr[0]);
                }
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glUseProgram(this.f30597e.f29889c);
                GLES20.glUniform1i(this.f30597e.f29891f, 0);
                GLES20.glEnableVertexAttribArray(this.f30597e.f29890e);
                GLES20.glVertexAttribPointer(this.f30597e.f29890e, 2, 5126, false, 8, (Buffer) this.f30588a1);
                GLES20.glEnableVertexAttribArray(this.f30597e.d);
                GLES20.glVertexAttribPointer(this.f30597e.d, 2, 5126, false, 8, (Buffer) this.f30591b1);
                GLES20.glBindFramebuffer(36160, this.U0[1]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[1], 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr2[0]);
                GLES20.glUniform1f(this.f30597e.f29892g, 0.0f);
                GLES20.glUniform1f(this.f30597e.h, 1.0f / this.Y0);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glBindFramebuffer(36160, this.U0[3]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[3], 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr2[1]);
                GLES20.glUniform1f(this.f30597e.f29892g, 1.0f / this.X0);
                GLES20.glUniform1f(this.f30597e.h, 0.0f);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glUseProgram(this.f30622p);
                GLES20.glUniform1i(this.f30628s, 0);
                GLES20.glUniform1i(this.f30630t, 1);
                GLES20.glEnableVertexAttribArray(this.f30626r);
                GLES20.glVertexAttribPointer(this.f30626r, 2, 5126, false, 8, (Buffer) this.f30588a1);
                GLES20.glEnableVertexAttribArray(this.f30624q);
                GLES20.glVertexAttribPointer(this.f30624q, 2, 5126, false, 8, (Buffer) this.f30591b1);
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
                GLES20.glVertexAttribPointer(this.F, 2, 5126, false, 8, (Buffer) this.f30588a1);
                GLES20.glEnableVertexAttribArray(this.E);
                GLES20.glVertexAttribPointer(this.E, 2, 5126, false, 8, (Buffer) this.f30591b1);
                GLES20.glBindFramebuffer(36160, this.U0[3]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[3], 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr2[1]);
                GLES20.glDrawArrays(5, 0, 4);
                this.f30589b = false;
            }
            this.h = true;
            this.W0 = false;
            GLES20.glUseProgram(this.f30632u);
            GLES20.glUniform1i(this.f30637x, 0);
            GLES20.glUniform1i(this.f30639y, 1);
            GLES20.glUniform1i(this.f30641z, 2);
            GLES20.glUniform1f(this.A, this.f30602f1.getSoftenSkinValue());
            GLES20.glEnableVertexAttribArray(this.f30635w);
            GLES20.glVertexAttribPointer(this.f30635w, 2, 5126, false, 8, (Buffer) this.f30588a1);
            GLES20.glEnableVertexAttribArray(this.v);
            GLES20.glVertexAttribPointer(this.v, 2, 5126, false, 8, (Buffer) this.f30591b1);
            if (z11) {
                GLES20.glUniformMatrix4fv(this.B, 1, false, this.P0, 0);
                int i12 = this.C;
                if (i12 != -1) {
                    GLES20.glUniform2f(i12, this.X0, this.Y0);
                }
            }
            GLES20.glBindFramebuffer(36160, this.U0[1]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[1], 0);
            GLES20.glActiveTexture(33984);
            if (z11) {
                GLES20.glBindTexture(36197, this.O0);
            } else {
                GLES20.glBindTexture(3553, iArr[0]);
            }
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, iArr2[3]);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, ((int[]) this.f30620o.f17378b)[0]);
            GLES20.glDrawArrays(5, 0, 4);
        } else if (this.h) {
            this.W0 = false;
            this.h = false;
        }
    }

    public final int g(int i9) {
        char c10;
        boolean z10 = this.f30605g1;
        int[] iArr = this.S0;
        if (z10) {
            if (i9 == 0) {
                c10 = 1;
            } else {
                c10 = 0;
            }
            return iArr[c10];
        }
        return iArr[i9];
    }

    public final void i(Bitmap bitmap, int i9, int i10, int i11, int i12) {
        Bitmap bitmap2;
        float f10;
        this.X0 = i11;
        this.Y0 = i12;
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
            boolean z10 = this.f30610i1;
            if ((z10 && (this.X0 > photoSize || this.Y0 > photoSize)) || i9 % 360 != 0) {
                if (z10 && (this.X0 > photoSize || this.Y0 > photoSize)) {
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
                int i13 = i9 % 360;
                if (i13 == 90 || i13 == 270) {
                    int i14 = this.X0;
                    this.X0 = this.Y0;
                    this.Y0 = i14;
                }
                Matrix matrix = new Matrix();
                matrix.setScale(f10, f10);
                matrix.postRotate(i9);
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
        for (int i15 = 0; i15 < 2; i15++) {
            GLES20.glBindTexture(3553, iArr2[i15]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexImage2D(3553, 0, 6408, this.X0, this.Y0, 0, 6408, 5121, null);
        }
        this.O0 = i10;
        GLES20.glBindTexture(3553, this.Q0[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, this.X0, this.Y0, 0, 6408, 5121, null);
    }

    public final boolean j() {
        int i9;
        String str;
        String str2;
        String str3;
        int i10;
        int h;
        int h10;
        int i11;
        int i12;
        int h11;
        int h12;
        boolean z10;
        int h13;
        int h14;
        kh.z7 z7Var = this.f30607h1;
        if (z7Var != null) {
            i9 = z7Var.a();
        } else {
            i9 = 0;
        }
        String str4 = "";
        if (i9 == 1) {
            str = AndroidUtilities.readRes(R.raw.hdr2sdr_hlg);
        } else if (i9 != 2) {
            str = "";
        } else {
            str = AndroidUtilities.readRes(R.raw.hdr2sdr_pq);
        }
        boolean z11 = this.f30605g1;
        if (!z11) {
            str2 = "";
        } else {
            str2 = "#extension GL_OES_EGL_image_external : require";
        }
        if (!z11) {
            str3 = "sampler2D";
        } else {
            str3 = "samplerExternalOES";
        }
        int[] iArr = new int[1];
        int i13 = 0;
        while (true) {
            if (z11) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            int i14 = i9;
            String str5 = str4;
            String str6 = str;
            if (i13 < i10) {
                if (i13 == 1 && z11) {
                    if (i14 != 0) {
                        h13 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        z10 = z11;
                        h14 = h(35632, String.format(Locale.US, "%1$s\nprecision highp float;varying vec2 vTextureCoord;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = TEX(vTextureCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}", str6));
                    } else {
                        z10 = z11;
                        h14 = 0;
                        h13 = 0;
                    }
                    if (h13 == 0 || h14 == 0) {
                        h13 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        h14 = h(35632, String.format(Locale.US, "%1$s\nprecision highp float;varying vec2 vTextureCoord;uniform %2$s sTexture;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = texture2D(sTexture, vTextureCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}", str2, str3));
                    }
                } else {
                    z10 = z11;
                    h13 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                    h14 = h(35632, String.format(Locale.US, "%1$s\nprecision highp float;varying vec2 vTextureCoord;uniform %2$s sTexture;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = texture2D(sTexture, vTextureCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}", str5, "sampler2D"));
                }
                int i15 = h13;
                int[] iArr2 = this.H;
                GLES20.glDeleteProgram(iArr2[i13]);
                if (i15 != 0 && h14 != 0) {
                    int glCreateProgram = GLES20.glCreateProgram();
                    iArr2[i13] = glCreateProgram;
                    GLES20.glAttachShader(glCreateProgram, i15);
                    GLES20.glAttachShader(iArr2[i13], h14);
                    GLES20.glBindAttribLocation(iArr2[i13], 0, "position");
                    GLES20.glBindAttribLocation(iArr2[i13], 1, "inputTexCoord");
                    GLES20.glLinkProgram(iArr2[i13]);
                    GLES20.glGetProgramiv(iArr2[i13], 35714, iArr, 0);
                    if (iArr[0] == 0) {
                        GLES20.glDeleteProgram(iArr2[i13]);
                        iArr2[i13] = 0;
                    } else {
                        this.I[i13] = GLES20.glGetAttribLocation(iArr2[i13], "position");
                        this.J[i13] = GLES20.glGetAttribLocation(iArr2[i13], "inputTexCoord");
                        this.K[i13] = GLES20.glGetUniformLocation(iArr2[i13], "sTexture");
                        if (i13 == 1) {
                            this.L = GLES20.glGetUniformLocation(iArr2[i13], "videoMatrix");
                            this.M = GLES20.glGetUniformLocation(iArr2[i13], "texSize");
                        }
                    }
                    i13++;
                    i9 = i14;
                    str4 = str5;
                    str = str6;
                    z11 = z10;
                } else {
                    return false;
                }
            } else {
                boolean z12 = z11;
                if (z12) {
                    if (i14 != 0) {
                        i11 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        i12 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;void main() {vec4 inp = TEX(vTextureCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str6));
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                    if (i11 == 0 || i12 == 0) {
                        h = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        h10 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;uniform %2$s sTexture;void main() {vec4 inp = texture2D(sTexture, vTextureCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str2, str3));
                    }
                    GLES20.glDeleteProgram(this.f30608i);
                    if (i11 == 0 && i12 != 0) {
                        int glCreateProgram2 = GLES20.glCreateProgram();
                        this.f30608i = glCreateProgram2;
                        GLES20.glAttachShader(glCreateProgram2, i11);
                        GLES20.glAttachShader(this.f30608i, i12);
                        GLES20.glBindAttribLocation(this.f30608i, 0, "position");
                        GLES20.glBindAttribLocation(this.f30608i, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f30608i);
                        GLES20.glGetProgramiv(this.f30608i, 35714, iArr, 0);
                        if (iArr[0] == 0) {
                            GLES20.glDeleteProgram(this.f30608i);
                            this.f30608i = 0;
                        } else {
                            this.f30611j = GLES20.glGetAttribLocation(this.f30608i, "position");
                            this.f30613k = GLES20.glGetAttribLocation(this.f30608i, "inputTexCoord");
                            this.f30615l = GLES20.glGetUniformLocation(this.f30608i, "sTexture");
                            if (z12) {
                                this.f30617m = GLES20.glGetUniformLocation(this.f30608i, "videoMatrix");
                                this.f30618n = GLES20.glGetUniformLocation(this.f30608i, "texSize");
                            }
                        }
                        if (z12) {
                            if (i14 != 0) {
                                h11 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;texCoord2 = inputTexCoord.xy;}");
                                h12 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform sampler2D toneCurveTexture;uniform sampler2D inputImageTexture3;uniform lowp float mixturePercent;void main() {vec4 image = TEX(vTextureCoord);vec4 mask = texture2D(inputImageTexture3, texCoord2);float redCurveValue = texture2D(toneCurveTexture, vec2(image.r, 0.0)).r;float greenCurveValue = texture2D(toneCurveTexture, vec2(image.g, 0.0)).g;float blueCurveValue = texture2D(toneCurveTexture, vec2(image.b, 0.0)).b;vec4 result = vec4(redCurveValue, greenCurveValue, blueCurveValue, image.a);vec4 tone = mix(image, result, mixturePercent);gl_FragColor = vec4(mix(image.rgb, tone.rgb, 1.0 - mask.b), 1.0);}", str6));
                            } else {
                                h11 = 0;
                                h12 = 0;
                            }
                            if (h11 == 0 || h12 == 0) {
                                h11 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;texCoord2 = inputTexCoord.xy;}");
                                h12 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform %2$s sTexture;uniform sampler2D toneCurveTexture;uniform sampler2D inputImageTexture3;uniform lowp float mixturePercent;void main() {vec4 image = texture2D(sTexture, vTextureCoord);vec4 mask = texture2D(inputImageTexture3, texCoord2);float redCurveValue = texture2D(toneCurveTexture, vec2(image.r, 0.0)).r;float greenCurveValue = texture2D(toneCurveTexture, vec2(image.g, 0.0)).g;float blueCurveValue = texture2D(toneCurveTexture, vec2(image.b, 0.0)).b;vec4 result = vec4(redCurveValue, greenCurveValue, blueCurveValue, image.a);vec4 tone = mix(image, result, mixturePercent);gl_FragColor = vec4(mix(image.rgb, tone.rgb, 1.0 - mask.b), 1.0);}", str2, str3));
                            }
                        } else {
                            h11 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;varying vec2 texCoord2;void main() {gl_Position = position;vTextureCoord = inputTexCoord;texCoord2 = inputTexCoord;}");
                            h12 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;varying highp vec2 texCoord2;uniform %2$s sTexture;uniform sampler2D toneCurveTexture;uniform sampler2D inputImageTexture3;uniform lowp float mixturePercent;void main() {vec4 image = texture2D(sTexture, vTextureCoord);vec4 mask = texture2D(inputImageTexture3, texCoord2);float redCurveValue = texture2D(toneCurveTexture, vec2(image.r, 0.0)).r;float greenCurveValue = texture2D(toneCurveTexture, vec2(image.g, 0.0)).g;float blueCurveValue = texture2D(toneCurveTexture, vec2(image.b, 0.0)).b;vec4 result = vec4(redCurveValue, greenCurveValue, blueCurveValue, image.a);vec4 tone = mix(image, result, mixturePercent);gl_FragColor = vec4(mix(image.rgb, tone.rgb, 1.0 - mask.b), 1.0);}", str2, str3));
                        }
                        GLES20.glDeleteProgram(this.f30632u);
                        if (h11 == 0 || h12 == 0) {
                            return false;
                        }
                        int glCreateProgram3 = GLES20.glCreateProgram();
                        this.f30632u = glCreateProgram3;
                        GLES20.glAttachShader(glCreateProgram3, h11);
                        GLES20.glAttachShader(this.f30632u, h12);
                        GLES20.glBindAttribLocation(this.f30632u, 0, "position");
                        GLES20.glBindAttribLocation(this.f30632u, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f30632u);
                        GLES20.glGetProgramiv(this.f30632u, 35714, iArr, 0);
                        if (iArr[0] == 0) {
                            GLES20.glDeleteProgram(this.f30632u);
                            this.f30632u = 0;
                            return true;
                        }
                        this.v = GLES20.glGetAttribLocation(this.f30632u, "position");
                        this.f30635w = GLES20.glGetAttribLocation(this.f30632u, "inputTexCoord");
                        this.f30637x = GLES20.glGetUniformLocation(this.f30632u, "sTexture");
                        this.f30639y = GLES20.glGetUniformLocation(this.f30632u, "inputImageTexture3");
                        this.f30641z = GLES20.glGetUniformLocation(this.f30632u, "toneCurveTexture");
                        this.A = GLES20.glGetUniformLocation(this.f30632u, "mixturePercent");
                        if (z12) {
                            this.B = GLES20.glGetUniformLocation(this.f30632u, "videoMatrix");
                            this.C = GLES20.glGetUniformLocation(this.f30632u, "texSize");
                            return true;
                        }
                        return true;
                    }
                }
                h = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                h10 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;uniform %2$s sTexture;void main() {vec4 inp = texture2D(sTexture, vTextureCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str2, str3));
                i11 = h;
                i12 = h10;
                GLES20.glDeleteProgram(this.f30608i);
                return i11 == 0 ? false : false;
            }
        }
    }
}
