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
public final class uz {
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
    public int f33341a0;
    public final FloatBuffer f33342a1;
    public int f33344b0;
    public final FloatBuffer f33345b1;
    public boolean f33346c;
    public int f33347c0;
    public ByteBuffer f33348c1;
    public boolean d;
    public int f33349d0;
    public ByteBuffer f33350d1;
    public sz f33351e;
    public int f33352e0;
    public ByteBuffer f33353e1;
    public float f33354f;
    public int f33355f0;
    public tz f33356f1;
    public sz f33357g;
    public int f33358g0;
    public final boolean f33359g1;
    public boolean h;
    public int f33360h0;
    public nh.n7 f33361h1;
    public int f33362i;
    public int f33363i0;
    public int f33365j;
    public int f33366j0;
    public int f33367k;
    public int f33368k0;
    public int f33369l;
    public int f33370l0;
    public int f33371m;
    public int m0;
    public int f33372n;
    public int f33373n0;
    public o1.a f33374o;
    public int f33375o0;
    public int f33376p;
    public int f33377p0;
    public int f33378q;
    public int f33379q0;
    public int f33380r;
    public int f33381r0;
    public int f33382s;
    public int f33383s0;
    public int f33384t;
    public int f33385t0;
    public int f33386u;
    public int f33387u0;
    public int v;
    public int f33388v0;
    public int f33389w;
    public int f33390w0;
    public int f33391x;
    public int f33392x0;
    public int f33393y;
    public int f33394y0;
    public int f33395z;
    public int f33396z0;
    public boolean f33340a = true;
    public boolean f33343b = true;
    public final int[] H = new int[2];
    public final int[] I = new int[2];
    public final int[] J = new int[2];
    public final int[] K = new int[2];
    public final int[] Q0 = new int[2];
    public final int[] R0 = new int[1];
    public final int[] S0 = new int[4];
    public final int[] T0 = new int[1];
    public final int[] V0 = new int[1];
    public boolean f33364i1 = true;

    public uz(boolean z10, nh.n7 n7Var) {
        this.f33359g1 = z10;
        this.f33361h1 = n7Var;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.Z0 = asFloatBuffer;
        asFloatBuffer.put(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f});
        asFloatBuffer.position(0);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        this.f33345b1 = asFloatBuffer2;
        asFloatBuffer2.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
        allocateDirect3.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
        this.f33342a1 = asFloatBuffer3;
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
                this.f33341a0 = GLES20.glGetUniformLocation(this.T, "contrast");
                this.f33344b0 = GLES20.glGetUniformLocation(this.T, "saturation");
                this.f33347c0 = GLES20.glGetUniformLocation(this.T, "warmth");
                this.f33349d0 = GLES20.glGetUniformLocation(this.T, "vignette");
                this.f33352e0 = GLES20.glGetUniformLocation(this.T, "grain");
                this.f33355f0 = GLES20.glGetUniformLocation(this.T, "width");
                this.f33358g0 = GLES20.glGetUniformLocation(this.T, "height");
                this.f33360h0 = GLES20.glGetUniformLocation(this.T, "curvesImage");
                this.f33363i0 = GLES20.glGetUniformLocation(this.T, "skipTone");
                this.f33366j0 = GLES20.glGetUniformLocation(this.T, "fadeAmount");
                this.f33368k0 = GLES20.glGetUniformLocation(this.T, "shadowsTintIntensity");
                this.f33370l0 = GLES20.glGetUniformLocation(this.T, "highlightsTintIntensity");
                this.m0 = GLES20.glGetUniformLocation(this.T, "shadowsTintColor");
                this.f33373n0 = GLES20.glGetUniformLocation(this.T, "highlightsTintColor");
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
                sz szVar = new sz(8.0f, 3.0f, false);
                this.f33357g = szVar;
                if (szVar.a() && j()) {
                    int h13 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                    int h14 = h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float angle;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sTexture, vTextureCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, vTextureCoord);highp vec2 texCoordToUse = vec2(vTextureCoord.x, (vTextureCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = abs((texCoordToUse.x - excludePoint.x) * aspectRatio * cos(angle) + (texCoordToUse.y - excludePoint.y) * sin(angle));gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                    if (h13 != 0 && h14 != 0) {
                        int glCreateProgram3 = GLES20.glCreateProgram();
                        this.f33375o0 = glCreateProgram3;
                        GLES20.glAttachShader(glCreateProgram3, h13);
                        GLES20.glAttachShader(this.f33375o0, h14);
                        GLES20.glBindAttribLocation(this.f33375o0, 0, "position");
                        GLES20.glBindAttribLocation(this.f33375o0, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f33375o0);
                        GLES20.glGetProgramiv(this.f33375o0, 35714, iArr3, 0);
                        if (iArr3[0] == 0) {
                            GLES20.glDeleteProgram(this.f33375o0);
                            this.f33375o0 = 0;
                        } else {
                            this.f33377p0 = GLES20.glGetAttribLocation(this.f33375o0, "position");
                            this.f33379q0 = GLES20.glGetAttribLocation(this.f33375o0, "inputTexCoord");
                            this.f33381r0 = GLES20.glGetUniformLocation(this.f33375o0, "sTexture");
                            this.f33383s0 = GLES20.glGetUniformLocation(this.f33375o0, "inputImageTexture2");
                            this.f33385t0 = GLES20.glGetUniformLocation(this.f33375o0, "excludeSize");
                            this.f33387u0 = GLES20.glGetUniformLocation(this.f33375o0, "excludePoint");
                            this.f33388v0 = GLES20.glGetUniformLocation(this.f33375o0, "excludeBlurSize");
                            this.f33390w0 = GLES20.glGetUniformLocation(this.f33375o0, "angle");
                            this.f33392x0 = GLES20.glGetUniformLocation(this.f33375o0, "aspectRatio");
                        }
                        int h15 = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                        int h16 = h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sTexture, vTextureCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, vTextureCoord);highp vec2 texCoordToUse = vec2(vTextureCoord.x, (vTextureCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = distance(excludePoint, texCoordToUse);gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                        if (h15 != 0 && h16 != 0) {
                            int glCreateProgram4 = GLES20.glCreateProgram();
                            this.f33394y0 = glCreateProgram4;
                            GLES20.glAttachShader(glCreateProgram4, h15);
                            GLES20.glAttachShader(this.f33394y0, h16);
                            GLES20.glBindAttribLocation(this.f33394y0, 0, "position");
                            GLES20.glBindAttribLocation(this.f33394y0, 1, "inputTexCoord");
                            GLES20.glLinkProgram(this.f33394y0);
                            GLES20.glGetProgramiv(this.f33394y0, 35714, iArr3, 0);
                            if (iArr3[0] == 0) {
                                GLES20.glDeleteProgram(this.f33394y0);
                                this.f33394y0 = 0;
                            } else {
                                this.f33396z0 = GLES20.glGetAttribLocation(this.f33394y0, "position");
                                this.A0 = GLES20.glGetAttribLocation(this.f33394y0, "inputTexCoord");
                                this.B0 = GLES20.glGetUniformLocation(this.f33394y0, "sTexture");
                                this.C0 = GLES20.glGetUniformLocation(this.f33394y0, "inputImageTexture2");
                                this.D0 = GLES20.glGetUniformLocation(this.f33394y0, "excludeSize");
                                this.E0 = GLES20.glGetUniformLocation(this.f33394y0, "excludePoint");
                                this.F0 = GLES20.glGetUniformLocation(this.f33394y0, "excludeBlurSize");
                                this.G0 = GLES20.glGetUniformLocation(this.f33394y0, "aspectRatio");
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
                                    this.f33376p = glCreateProgram6;
                                    GLES20.glAttachShader(glCreateProgram6, h20);
                                    GLES20.glAttachShader(this.f33376p, h19);
                                    GLES20.glBindAttribLocation(this.f33376p, 0, "position");
                                    GLES20.glBindAttribLocation(this.f33376p, 1, "inputTexCoord");
                                    GLES20.glLinkProgram(this.f33376p);
                                    GLES20.glGetProgramiv(this.f33376p, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        GLES20.glDeleteProgram(this.f33376p);
                                        this.f33376p = 0;
                                    } else {
                                        this.f33378q = GLES20.glGetAttribLocation(this.f33376p, "position");
                                        this.f33380r = GLES20.glGetAttribLocation(this.f33376p, "inputTexCoord");
                                        this.f33382s = GLES20.glGetUniformLocation(this.f33376p, "sTexture");
                                        this.f33384t = GLES20.glGetUniformLocation(this.f33376p, "inputImageTexture2");
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
                                        o1.a aVar = new o1.a(8);
                                        int[] iArr4 = new int[1];
                                        aVar.f19014b = iArr4;
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(new PointF(0.0f, 0.0f));
                                        arrayList.add(new PointF(0.5f, 0.5f));
                                        arrayList.add(new PointF(1.0f, 1.0f));
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(new PointF(0.0f, 0.0f));
                                        arrayList2.add(new PointF(0.47f, 0.57f));
                                        arrayList2.add(new PointF(1.0f, 1.0f));
                                        float[] z10 = o1.a.z(arrayList2);
                                        float[] z11 = o1.a.z(arrayList);
                                        GLES20.glGenTextures(1, iArr4, 0);
                                        GLES20.glBindTexture(3553, iArr4[0]);
                                        GLES20.glTexParameteri(3553, 10241, 9729);
                                        GLES20.glTexParameteri(3553, 10240, 9729);
                                        GLES20.glTexParameteri(3553, 10242, 33071);
                                        GLES20.glTexParameteri(3553, 10243, 33071);
                                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1024);
                                        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                                        if (z11.length >= 256 && z11.length >= 256 && z11.length >= 256 && z10.length >= 256) {
                                            for (int i10 = 0; i10 < 256; i10++) {
                                                float f9 = i10;
                                                int min = (int) Math.min(Math.max(z11[i10] + f9, 0.0f), 255.0f);
                                                int min2 = (int) Math.min(Math.max(z11[i10] + f9, 0.0f), 255.0f);
                                                int min3 = (int) Math.min(Math.max(f9 + z11[i10], 0.0f), 255.0f);
                                                allocateDirect.put((byte) Math.min(Math.max(min3 + z10[min3], 0.0f), 255.0f));
                                                allocateDirect.put((byte) Math.min(Math.max(min2 + z10[min2], 0.0f), 255.0f));
                                                allocateDirect.put((byte) Math.min(Math.max(min + z10[min], 0.0f), 255.0f));
                                                allocateDirect.put((byte) -1);
                                            }
                                            allocateDirect.position(0);
                                            GLES20.glTexImage2D(3553, 0, 6408, 256, 1, 0, 6408, 5121, allocateDirect);
                                        }
                                        this.f33374o = aVar;
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
        tz tzVar;
        tz tzVar2 = this.f33356f1;
        if (tzVar2 != null) {
            i10 = tzVar2.getBlurType();
        } else {
            i10 = 0;
        }
        if (this.f33359g1 || (tzVar = this.f33356f1) == null || tzVar.b() || i10 == 0) {
            return false;
        }
        boolean z10 = this.f33340a;
        int[] iArr = this.S0;
        if (z10) {
            if (!this.f33346c) {
                GLES20.glBindTexture(3553, iArr[2]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glTexImage2D(3553, 0, 6408, this.X0, this.Y0, 0, 6408, 5121, null);
                this.f33346c = true;
            }
            GLES20.glUseProgram(this.f33357g.f32762c);
            GLES20.glUniform1i(this.f33357g.f32764f, 0);
            GLES20.glEnableVertexAttribArray(this.f33357g.f32763e);
            GLES20.glVertexAttribPointer(this.f33357g.f32763e, 2, 5126, false, 8, (Buffer) this.f33342a1);
            GLES20.glEnableVertexAttribArray(this.f33357g.d);
            GLES20.glVertexAttribPointer(this.f33357g.d, 2, 5126, false, 8, (Buffer) this.f33345b1);
            GLES20.glBindFramebuffer(36160, this.U0[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr[1]);
            GLES20.glUniform1f(this.f33357g.f32765g, 0.0f);
            GLES20.glUniform1f(this.f33357g.h, 1.0f / this.Y0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.U0[2]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[2], 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glUniform1f(this.f33357g.f32765g, 1.0f / this.X0);
            GLES20.glUniform1f(this.f33357g.h, 0.0f);
            GLES20.glDrawArrays(5, 0, 4);
            this.f33340a = false;
        }
        GLES20.glBindFramebuffer(36160, this.U0[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
        if (i10 == 1) {
            GLES20.glUseProgram(this.f33394y0);
            GLES20.glUniform1i(this.B0, 0);
            GLES20.glUniform1i(this.C0, 1);
            GLES20.glUniform1f(this.D0, this.f33356f1.getBlurExcludeSize());
            GLES20.glUniform1f(this.F0, this.f33356f1.getBlurExcludeBlurSize());
            PointF blurExcludePoint = this.f33356f1.getBlurExcludePoint();
            GLES20.glUniform2f(this.E0, blurExcludePoint.x, blurExcludePoint.y);
            GLES20.glUniform1f(this.G0, this.Y0 / this.X0);
            GLES20.glEnableVertexAttribArray(this.A0);
            GLES20.glVertexAttribPointer(this.A0, 2, 5126, false, 8, (Buffer) this.f33342a1);
            GLES20.glEnableVertexAttribArray(this.f33396z0);
            GLES20.glVertexAttribPointer(this.f33396z0, 2, 5126, false, 8, (Buffer) this.f33345b1);
        } else if (i10 == 2) {
            GLES20.glUseProgram(this.f33375o0);
            GLES20.glUniform1i(this.f33381r0, 0);
            GLES20.glUniform1i(this.f33383s0, 1);
            GLES20.glUniform1f(this.f33385t0, this.f33356f1.getBlurExcludeSize());
            GLES20.glUniform1f(this.f33388v0, this.f33356f1.getBlurExcludeBlurSize());
            GLES20.glUniform1f(this.f33390w0, this.f33356f1.getBlurAngle());
            PointF blurExcludePoint2 = this.f33356f1.getBlurExcludePoint();
            GLES20.glUniform2f(this.f33387u0, blurExcludePoint2.x, blurExcludePoint2.y);
            GLES20.glUniform1f(this.f33392x0, this.Y0 / this.X0);
            GLES20.glEnableVertexAttribArray(this.f33379q0);
            GLES20.glVertexAttribPointer(this.f33379q0, 2, 5126, false, 8, (Buffer) this.f33342a1);
            GLES20.glEnableVertexAttribArray(this.f33377p0);
            GLES20.glVertexAttribPointer(this.f33377p0, 2, 5126, false, 8, (Buffer) this.f33345b1);
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
        boolean z10 = this.f33359g1;
        int i10 = !z10 ? 1 : 0;
        GLES20.glBindFramebuffer(36160, iArr[i10]);
        int[] iArr2 = this.S0;
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[i10], 0);
        GLES20.glUseProgram(this.T);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr2[z10 ? 1 : 0]);
        GLES20.glUniform1i(this.W, 0);
        tz tzVar = this.f33356f1;
        float f9 = 1.0f;
        if (tzVar != null && !tzVar.b()) {
            GLES20.glUniform1f(this.X, this.f33356f1.getShadowsValue());
            GLES20.glUniform1f(this.Y, this.f33356f1.getHighlightsValue());
            GLES20.glUniform1f(this.Z, this.f33356f1.getExposureValue());
            GLES20.glUniform1f(this.f33341a0, this.f33356f1.getContrastValue());
            GLES20.glUniform1f(this.f33344b0, this.f33356f1.getSaturationValue());
            GLES20.glUniform1f(this.f33347c0, this.f33356f1.getWarmthValue());
            GLES20.glUniform1f(this.f33349d0, this.f33356f1.getVignetteValue());
            GLES20.glUniform1f(this.f33352e0, this.f33356f1.getGrainValue());
            GLES20.glUniform1f(this.f33366j0, this.f33356f1.getFadeValue());
            int tintHighlightsColor = this.f33356f1.getTintHighlightsColor();
            int tintShadowsColor = this.f33356f1.getTintShadowsColor();
            GLES20.glUniform3f(this.f33373n0, ((tintHighlightsColor >> 16) & 255) / 255.0f, ((tintHighlightsColor >> 8) & 255) / 255.0f, (tintHighlightsColor & 255) / 255.0f);
            GLES20.glUniform1f(this.f33370l0, this.f33356f1.getTintHighlightsIntensityValue());
            GLES20.glUniform3f(this.m0, ((tintShadowsColor >> 16) & 255) / 255.0f, ((tintShadowsColor >> 8) & 255) / 255.0f, (tintShadowsColor & 255) / 255.0f);
            GLES20.glUniform1f(this.f33368k0, this.f33356f1.getTintShadowsIntensityValue());
            boolean c3 = this.f33356f1.c();
            int i11 = this.f33363i0;
            if (c3) {
                f9 = 0.0f;
            }
            GLES20.glUniform1f(i11, f9);
            if (c3) {
                ByteBuffer a2 = this.f33356f1.a();
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, this.V0[0]);
                GLES20.glTexImage2D(3553, 0, 6408, 200, 1, 0, 6408, 5121, a2);
                GLES20.glUniform1i(this.f33360h0, 1);
            }
        } else {
            GLES20.glUniform1f(this.X, 1.0f);
            GLES20.glUniform1f(this.Y, 1.0f);
            GLES20.glUniform1f(this.Z, 0.0f);
            GLES20.glUniform1f(this.f33341a0, 1.0f);
            GLES20.glUniform1f(this.f33344b0, 1.0f);
            GLES20.glUniform1f(this.f33347c0, 0.0f);
            GLES20.glUniform1f(this.f33349d0, 0.0f);
            GLES20.glUniform1f(this.f33352e0, 0.0f);
            GLES20.glUniform1f(this.f33366j0, 0.0f);
            GLES20.glUniform3f(this.f33373n0, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.f33370l0, 0.0f);
            GLES20.glUniform3f(this.m0, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.f33368k0, 0.0f);
            GLES20.glUniform1f(this.f33363i0, 1.0f);
        }
        GLES20.glUniform1f(this.f33355f0, this.X0);
        GLES20.glUniform1f(this.f33358g0, this.Y0);
        GLES20.glEnableVertexAttribArray(this.V);
        GLES20.glVertexAttribPointer(this.V, 2, 5126, false, 8, (Buffer) this.f33342a1);
        GLES20.glEnableVertexAttribArray(this.U);
        GLES20.glVertexAttribPointer(this.U, 2, 5126, false, 8, (Buffer) this.f33345b1);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void d() {
        boolean z10;
        int i10;
        int i11;
        char c3;
        FloatBuffer floatBuffer;
        boolean z11 = this.f33359g1;
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
            GLES20.glVertexAttribPointer(iArr4[c3], 2, 5126, false, 8, (Buffer) this.f33342a1);
            int[] iArr5 = this.I;
            GLES20.glEnableVertexAttribArray(iArr5[c3]);
            int i13 = iArr5[c3];
            if (z11) {
                floatBuffer = this.f33345b1;
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
            ByteBuffer byteBuffer = this.f33348c1;
            if (byteBuffer == null || i14 > byteBuffer.capacity()) {
                this.f33348c1 = ByteBuffer.allocateDirect(i14);
            }
            if (this.f33350d1 == null) {
                this.f33350d1 = ByteBuffer.allocateDirect(16384);
            }
            if (this.f33353e1 == null) {
                this.f33353e1 = ByteBuffer.allocateDirect(32896);
            }
            GLES20.glReadPixels(0, 0, this.X0, this.Y0, 6408, 5121, this.f33348c1);
            i10 = 33984;
            Utilities.calcCDT(this.f33348c1, this.X0, this.Y0, this.f33350d1, this.f33353e1);
            GLES20.glBindTexture(3553, iArr2[1]);
            GLES20.glTexImage2D(3553, 0, 6408, 256, 16, 0, 6408, 5121, this.f33350d1);
            if (!z11) {
                this.f33348c1 = null;
                this.f33350d1 = null;
                this.f33353e1 = null;
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
        tz tzVar = this.f33356f1;
        if (tzVar != null && !tzVar.b()) {
            GLES20.glUniform1f(this.R, this.f33356f1.getEnhanceValue());
        } else {
            GLES20.glUniform1f(this.R, 0.0f);
        }
        GLES20.glEnableVertexAttribArray(this.P);
        GLES20.glVertexAttribPointer(this.P, 2, 5126, false, 8, (Buffer) this.f33342a1);
        GLES20.glEnableVertexAttribArray(this.O);
        GLES20.glVertexAttribPointer(this.O, 2, 5126, false, 8, (Buffer) this.Z0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void e() {
        if (this.f33359g1) {
            return;
        }
        GLES20.glBindFramebuffer(36160, this.U0[0]);
        int[] iArr = this.S0;
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
        GLES20.glUseProgram(this.H0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[1]);
        GLES20.glUniform1i(this.N0, 0);
        tz tzVar = this.f33356f1;
        if (tzVar != null && !tzVar.b()) {
            GLES20.glUniform1f(this.I0, this.f33356f1.getSharpenValue());
        } else {
            GLES20.glUniform1f(this.I0, 0.0f);
        }
        GLES20.glUniform1f(this.J0, this.X0);
        GLES20.glUniform1f(this.K0, this.Y0);
        GLES20.glEnableVertexAttribArray(this.M0);
        GLES20.glVertexAttribPointer(this.M0, 2, 5126, false, 8, (Buffer) this.f33342a1);
        GLES20.glEnableVertexAttribArray(this.L0);
        GLES20.glVertexAttribPointer(this.L0, 2, 5126, false, 8, (Buffer) this.f33345b1);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void f() {
        int i10;
        int i11;
        tz tzVar = this.f33356f1;
        if (tzVar != null && !tzVar.b() && this.f33356f1.getSoftenSkinValue() > 0.0f && (i10 = this.X0) > 0 && this.Y0 > 0) {
            boolean z10 = this.f33343b;
            int[] iArr = this.T0;
            boolean z11 = this.f33359g1;
            int[] iArr2 = this.S0;
            if (z10 || z11) {
                float f9 = i10 * 0.006f;
                if (this.f33351e == null || Math.abs(this.f33354f - f9) > 1.0E-4d) {
                    sz szVar = this.f33351e;
                    if (szVar != null && (i11 = szVar.f32762c) != 0) {
                        GLES20.glDeleteProgram(i11);
                        szVar.f32762c = 0;
                    }
                    this.f33354f = f9;
                    sz szVar2 = new sz(f9, 2.0f, true);
                    this.f33351e = szVar2;
                    szVar2.a();
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
                GLES20.glUseProgram(this.f33362i);
                GLES20.glUniform1i(this.f33369l, 0);
                GLES20.glEnableVertexAttribArray(this.f33367k);
                GLES20.glVertexAttribPointer(this.f33367k, 2, 5126, false, 8, (Buffer) this.f33342a1);
                GLES20.glEnableVertexAttribArray(this.f33365j);
                if (z11) {
                    GLES20.glUniformMatrix4fv(this.f33371m, 1, false, this.P0, 0);
                    int i12 = this.f33372n;
                    if (i12 != -1) {
                        GLES20.glUniform2f(i12, this.X0, this.Y0);
                    }
                }
                GLES20.glVertexAttribPointer(this.f33365j, 2, 5126, false, 8, (Buffer) this.f33345b1);
                GLES20.glBindFramebuffer(36160, this.U0[0]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
                GLES20.glActiveTexture(33984);
                if (z11) {
                    GLES20.glBindTexture(36197, this.O0);
                } else {
                    GLES20.glBindTexture(3553, iArr[0]);
                }
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glUseProgram(this.f33351e.f32762c);
                GLES20.glUniform1i(this.f33351e.f32764f, 0);
                GLES20.glEnableVertexAttribArray(this.f33351e.f32763e);
                GLES20.glVertexAttribPointer(this.f33351e.f32763e, 2, 5126, false, 8, (Buffer) this.f33342a1);
                GLES20.glEnableVertexAttribArray(this.f33351e.d);
                GLES20.glVertexAttribPointer(this.f33351e.d, 2, 5126, false, 8, (Buffer) this.f33345b1);
                GLES20.glBindFramebuffer(36160, this.U0[1]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[1], 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr2[0]);
                GLES20.glUniform1f(this.f33351e.f32765g, 0.0f);
                GLES20.glUniform1f(this.f33351e.h, 1.0f / this.Y0);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glBindFramebuffer(36160, this.U0[3]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[3], 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr2[1]);
                GLES20.glUniform1f(this.f33351e.f32765g, 1.0f / this.X0);
                GLES20.glUniform1f(this.f33351e.h, 0.0f);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glUseProgram(this.f33376p);
                GLES20.glUniform1i(this.f33382s, 0);
                GLES20.glUniform1i(this.f33384t, 1);
                GLES20.glEnableVertexAttribArray(this.f33380r);
                GLES20.glVertexAttribPointer(this.f33380r, 2, 5126, false, 8, (Buffer) this.f33342a1);
                GLES20.glEnableVertexAttribArray(this.f33378q);
                GLES20.glVertexAttribPointer(this.f33378q, 2, 5126, false, 8, (Buffer) this.f33345b1);
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
                GLES20.glVertexAttribPointer(this.F, 2, 5126, false, 8, (Buffer) this.f33342a1);
                GLES20.glEnableVertexAttribArray(this.E);
                GLES20.glVertexAttribPointer(this.E, 2, 5126, false, 8, (Buffer) this.f33345b1);
                GLES20.glBindFramebuffer(36160, this.U0[3]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[3], 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, iArr2[1]);
                GLES20.glDrawArrays(5, 0, 4);
                this.f33343b = false;
            }
            this.h = true;
            this.W0 = false;
            GLES20.glUseProgram(this.f33386u);
            GLES20.glUniform1i(this.f33391x, 0);
            GLES20.glUniform1i(this.f33393y, 1);
            GLES20.glUniform1i(this.f33395z, 2);
            GLES20.glUniform1f(this.A, this.f33356f1.getSoftenSkinValue());
            GLES20.glEnableVertexAttribArray(this.f33389w);
            GLES20.glVertexAttribPointer(this.f33389w, 2, 5126, false, 8, (Buffer) this.f33342a1);
            GLES20.glEnableVertexAttribArray(this.v);
            GLES20.glVertexAttribPointer(this.v, 2, 5126, false, 8, (Buffer) this.f33345b1);
            if (z11) {
                GLES20.glUniformMatrix4fv(this.B, 1, false, this.P0, 0);
                int i13 = this.C;
                if (i13 != -1) {
                    GLES20.glUniform2f(i13, this.X0, this.Y0);
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
            GLES20.glBindTexture(3553, ((int[]) this.f33374o.f19014b)[0]);
            GLES20.glDrawArrays(5, 0, 4);
        } else if (this.h) {
            this.W0 = false;
            this.h = false;
        }
    }

    public final int g(int i10) {
        char c3;
        boolean z10 = this.f33359g1;
        int[] iArr = this.S0;
        if (z10) {
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
        float f9;
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
            boolean z10 = this.f33364i1;
            if ((z10 && (this.X0 > photoSize || this.Y0 > photoSize)) || i10 % 360 != 0) {
                if (z10 && (this.X0 > photoSize || this.Y0 > photoSize)) {
                    f9 = photoSize / bitmap.getWidth();
                    float height = photoSize / bitmap.getHeight();
                    if (f9 < height) {
                        this.X0 = (int) photoSize;
                        this.Y0 = (int) (bitmap.getHeight() * f9);
                    } else {
                        this.Y0 = (int) photoSize;
                        this.X0 = (int) (bitmap.getWidth() * height);
                        f9 = height;
                    }
                } else {
                    f9 = 1.0f;
                }
                int i14 = i10 % 360;
                if (i14 == 90 || i14 == 270) {
                    int i15 = this.X0;
                    this.X0 = this.Y0;
                    this.Y0 = i15;
                }
                Matrix matrix = new Matrix();
                matrix.setScale(f9, f9);
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
        int h10;
        int i12;
        int i13;
        int h11;
        int h12;
        boolean z10;
        int h13;
        int h14;
        nh.n7 n7Var = this.f33361h1;
        if (n7Var != null) {
            i10 = n7Var.a();
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
        boolean z11 = this.f33359g1;
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
        int i14 = 0;
        while (true) {
            if (z11) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            int i15 = i10;
            String str5 = str4;
            String str6 = str;
            if (i14 < i11) {
                if (i14 == 1 && z11) {
                    if (i15 != 0) {
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
                int i16 = h13;
                int[] iArr2 = this.H;
                GLES20.glDeleteProgram(iArr2[i14]);
                if (i16 != 0 && h14 != 0) {
                    int glCreateProgram = GLES20.glCreateProgram();
                    iArr2[i14] = glCreateProgram;
                    GLES20.glAttachShader(glCreateProgram, i16);
                    GLES20.glAttachShader(iArr2[i14], h14);
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
                    z11 = z10;
                } else {
                    return false;
                }
            } else {
                boolean z12 = z11;
                if (z12) {
                    if (i15 != 0) {
                        i12 = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        i13 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;void main() {vec4 inp = TEX(vTextureCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str6));
                    } else {
                        i12 = 0;
                        i13 = 0;
                    }
                    if (i12 == 0 || i13 == 0) {
                        h = h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
                        h10 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;uniform %2$s sTexture;void main() {vec4 inp = texture2D(sTexture, vTextureCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str2, str3));
                    }
                    GLES20.glDeleteProgram(this.f33362i);
                    if (i12 == 0 && i13 != 0) {
                        int glCreateProgram2 = GLES20.glCreateProgram();
                        this.f33362i = glCreateProgram2;
                        GLES20.glAttachShader(glCreateProgram2, i12);
                        GLES20.glAttachShader(this.f33362i, i13);
                        GLES20.glBindAttribLocation(this.f33362i, 0, "position");
                        GLES20.glBindAttribLocation(this.f33362i, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f33362i);
                        GLES20.glGetProgramiv(this.f33362i, 35714, iArr, 0);
                        if (iArr[0] == 0) {
                            GLES20.glDeleteProgram(this.f33362i);
                            this.f33362i = 0;
                        } else {
                            this.f33365j = GLES20.glGetAttribLocation(this.f33362i, "position");
                            this.f33367k = GLES20.glGetAttribLocation(this.f33362i, "inputTexCoord");
                            this.f33369l = GLES20.glGetUniformLocation(this.f33362i, "sTexture");
                            if (z12) {
                                this.f33371m = GLES20.glGetUniformLocation(this.f33362i, "videoMatrix");
                                this.f33372n = GLES20.glGetUniformLocation(this.f33362i, "texSize");
                            }
                        }
                        if (z12) {
                            if (i15 != 0) {
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
                        GLES20.glDeleteProgram(this.f33386u);
                        if (h11 == 0 || h12 == 0) {
                            return false;
                        }
                        int glCreateProgram3 = GLES20.glCreateProgram();
                        this.f33386u = glCreateProgram3;
                        GLES20.glAttachShader(glCreateProgram3, h11);
                        GLES20.glAttachShader(this.f33386u, h12);
                        GLES20.glBindAttribLocation(this.f33386u, 0, "position");
                        GLES20.glBindAttribLocation(this.f33386u, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f33386u);
                        GLES20.glGetProgramiv(this.f33386u, 35714, iArr, 0);
                        if (iArr[0] == 0) {
                            GLES20.glDeleteProgram(this.f33386u);
                            this.f33386u = 0;
                            return true;
                        }
                        this.v = GLES20.glGetAttribLocation(this.f33386u, "position");
                        this.f33389w = GLES20.glGetAttribLocation(this.f33386u, "inputTexCoord");
                        this.f33391x = GLES20.glGetUniformLocation(this.f33386u, "sTexture");
                        this.f33393y = GLES20.glGetUniformLocation(this.f33386u, "inputImageTexture3");
                        this.f33395z = GLES20.glGetUniformLocation(this.f33386u, "toneCurveTexture");
                        this.A = GLES20.glGetUniformLocation(this.f33386u, "mixturePercent");
                        if (z12) {
                            this.B = GLES20.glGetUniformLocation(this.f33386u, "videoMatrix");
                            this.C = GLES20.glGetUniformLocation(this.f33386u, "texSize");
                            return true;
                        }
                        return true;
                    }
                }
                h = h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                h10 = h(35632, String.format(Locale.US, "%1$s\nprecision lowp float;varying highp vec2 vTextureCoord;uniform %2$s sTexture;void main() {vec4 inp = texture2D(sTexture, vTextureCoord);vec4 image = vec4(inp.rgb * pow(2.0, -1.0), inp.w);vec4 base = vec4(image.g, image.g, image.g, 1.0);vec4 overlay = vec4(image.b, image.b, image.b, 1.0);float ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);gl_FragColor = vec4(ba,ba,ba,image.a);}", str2, str3));
                i12 = h;
                i13 = h10;
                GLES20.glDeleteProgram(this.f33362i);
                return i12 == 0 ? false : false;
            }
        }
    }
}
