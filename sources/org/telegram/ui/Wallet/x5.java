package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.wh;
public class x5 {
    public final int f35131a;
    public final int f35132b;
    public final int f35133c;
    public final int d;

    public x5() {
        int i10;
        int i11;
        float f7;
        float f10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Random random = new Random(24560118926758988L);
        int i12 = 16;
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        int i13 = 0;
        while (true) {
            float f11 = -1.0f;
            float f12 = 512.0f;
            if (i13 >= i12) {
                break;
            }
            if (i13 == 0) {
                i10 = i12;
                i11 = 1;
            } else {
                i10 = i12;
                i11 = 32;
            }
            int i14 = 0;
            float f13 = 0.0f;
            float f14 = 0.0f;
            while (i14 < i11) {
                float nextFloat = random.nextFloat() * f12;
                float nextFloat2 = random.nextFloat() * 312.5f;
                float f15 = f12;
                float f16 = Float.MAX_VALUE;
                for (int i15 = 0; i15 < i13; i15++) {
                    float abs = Math.abs(nextFloat - fArr[i15]);
                    float abs2 = Math.abs(nextFloat2 - fArr2[i15]);
                    float min = Math.min(abs, f15 - abs);
                    float min2 = Math.min(abs2, 312.5f - abs2);
                    f16 = Math.min(f16, (min2 * min2) + (min * min));
                }
                if (f16 > f11) {
                    f11 = f16;
                    f13 = nextFloat;
                    f14 = nextFloat2;
                }
                i14++;
                f12 = f15;
            }
            float f17 = f12;
            fArr[i13] = f13;
            fArr2[i13] = f14;
            float d = org.telegram.ui.Cells.t0.d(random, 6.0f, 1.0f);
            float d10 = org.telegram.ui.Cells.t0.d(random, 0.45f, 0.05f);
            double nextFloat3 = random.nextFloat() * 6.2831855f;
            float cos = (float) Math.cos(nextFloat3);
            float sin = (float) Math.sin(nextFloat3);
            float f18 = -sin;
            float f19 = cos * d10;
            float f20 = sin * d10;
            float f21 = f18 * 0.6f;
            float f22 = 0.6f * cos;
            float f23 = f19 + f21;
            float f24 = f20 + f22;
            int a2 = (a(f23) << 16) | (-16777216) | (a(f24) << 8) | a((float) Math.sqrt(Math.max(0.0f, (1.0f - (f23 * f23)) - (f24 * f24))));
            int a10 = (a(f19 - f21) << 16) | (-16777216) | (a(f20 - f22) << 8) | a((float) Math.sqrt(Math.max(0.0f, (1.0f - (f7 * f7)) - (f10 * f10))));
            float f25 = f18 * d;
            float f26 = cos * d;
            int i16 = -1;
            while (true) {
                if (i16 <= 1) {
                    int i17 = -1;
                    for (int i18 = 1; i17 <= i18; i18 = 1) {
                        float f27 = f13 + (i17 * 512);
                        float f28 = (i16 * 312.5f) + f14;
                        if (f27 + d > 0.0f && f27 - d < f17 && f28 + d > 0.0f && f28 - d < f17) {
                            int max = Math.max(0, Math.min(464, Math.round((f27 - 24.0f) / 8.0f) * 8));
                            int max2 = Math.max(0, Math.min(464, Math.round((f28 - 24.0f) / 8.0f) * 8));
                            Rect rect = new Rect(max, max2, max + 48, max2 + 48);
                            if (!arrayList.contains(rect)) {
                                arrayList.add(rect);
                            }
                        }
                        arrayList2.add(new w5(f27, f28, d, f25, f26, a2, a10));
                        i17++;
                    }
                    i16++;
                }
            }
            i13++;
            i12 = i10;
        }
        int[] iArr = new int[3];
        GLES20.glGenTextures(3, iArr, 0);
        int i19 = iArr[0];
        int i20 = iArr[1];
        this.f35131a = i20;
        this.f35132b = iArr[2];
        GLES20.glBindTexture(35866, i20);
        e(35866);
        GLES20.glTexParameteri(35866, 33085, 3);
        GLES30.glTexStorage3D(35866, 4, 32856, 48, 48, arrayList.size());
        Bitmap createBitmap = Bitmap.createBitmap(48, 48, Bitmap.Config.ARGB_8888);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(9216);
        int i21 = 0;
        while (i21 < arrayList.size()) {
            Rect rect2 = (Rect) arrayList.get(i21);
            c(createBitmap, rect2.left, rect2.top, arrayList2);
            allocateDirect.clear();
            createBitmap.copyPixelsToBuffer(allocateDirect);
            allocateDirect.position(0);
            int i22 = i21;
            GLES30.glTexSubImage3D(35866, 0, 0, 0, i22, 48, 48, 1, 6408, 5121, allocateDirect);
            i21 = i22 + 1;
        }
        createBitmap.recycle();
        GLES20.glGenerateMipmap(35866);
        GLES20.glBindTexture(3553, this.f35132b);
        e(3553);
        GLES30.glTexStorage2D(3553, 8, 32856, 128, 128);
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        GLES20.glGetIntegerv(36006, iArr3, 0);
        GLES20.glGenFramebuffers(1, iArr2, 0);
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        Bitmap createBitmap2 = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
        GLES20.glBindTexture(3553, i19);
        e(3553);
        GLES20.glTexParameteri(3553, 33085, 2);
        GLES30.glTexStorage2D(3553, 3, 32856, 64, 64);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i19, 2);
        for (int i23 = 0; i23 < 512; i23 += 64) {
            for (int i24 = 0; i24 < 512; i24 += 64) {
                c(createBitmap2, i24, i23, arrayList2);
                GLES20.glBindTexture(3553, i19);
                GLUtils.texSubImage2D(3553, 0, 0, 0, createBitmap2);
                GLES20.glGenerateMipmap(3553);
                GLES20.glBindTexture(3553, this.f35132b);
                GLES20.glCopyTexSubImage2D(3553, 0, i24 / 4, i23 / 4, 0, 0, 16, 16);
            }
        }
        createBitmap2.recycle();
        GLES20.glBindFramebuffer(36160, iArr3[0]);
        GLES20.glGenerateMipmap(3553);
        GLES20.glDeleteFramebuffers(1, iArr2, 0);
        GLES20.glDeleteTextures(1, new int[]{i19}, 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindTexture(35866, 0);
        int size = arrayList.size();
        this.d = size * 6;
        FloatBuffer h = wh.h(ByteBuffer.allocateDirect(size * 192));
        int[] iArr4 = {0, 1, 2, 2, 1, 3};
        for (int i25 = 0; i25 < arrayList.size(); i25++) {
            Rect rect3 = (Rect) arrayList.get(i25);
            for (int i26 = 0; i26 < 6; i26++) {
                int i27 = iArr4[i26];
                float f29 = (i27 & 1) == 0 ? -1.0f : 1.0f;
                float f30 = (i27 & 2) == 0 ? -1.0f : 1.0f;
                float f31 = f29 < 0.0f ? rect3.left : rect3.right;
                float f32 = f30 < 0.0f ? rect3.top : rect3.bottom;
                h.put(-0.0125f);
                h.put((0.5f - (f32 / 312.5f)) * 1.219512f);
                h.put(((f31 / 512.0f) * 2.0f) - 1.0f);
                h.put(rect3.left).put(rect3.top).put(i25);
                h.put(f29).put(f30);
            }
        }
        h.position(0);
        int[] iArr5 = new int[1];
        GLES20.glGenBuffers(1, iArr5, 0);
        int i28 = iArr5[0];
        this.f35133c = i28;
        GLES20.glBindBuffer(34962, i28);
        GLES20.glBufferData(34962, this.d * 32, h, 35044);
        GLES20.glBindBuffer(34962, 0);
    }

    public static int a(float f7) {
        return Math.max(0, Math.min(255, Math.round(((f7 * 0.5f) + 0.5f) * 255.0f)));
    }

    public static void c(Bitmap bitmap, int i10, int i11, ArrayList arrayList) {
        int i12 = 0;
        bitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmap);
        canvas.translate(-i10, -i11);
        Paint paint = new Paint(1);
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            w5 w5Var = (w5) obj;
            paint.setShader(w5Var.f35038b);
            canvas.drawPath(w5Var.f35037a, paint);
        }
    }

    public static void e(int i10) {
        GLES20.glTexParameteri(i10, 10241, 9987);
        GLES20.glTexParameteri(i10, 10240, 9729);
        GLES20.glTexParameteri(i10, 10242, 33071);
        GLES20.glTexParameteri(i10, 10243, 33071);
    }

    public boolean b(int i10) {
        if (i10 == 1) {
            if (this.f35131a - this.f35132b <= 1) {
                return false;
            }
        } else if (this.f35133c - this.d <= 1) {
            return false;
        }
        return true;
    }

    public void d() {
        GLES20.glDeleteProgram(this.f35131a);
        GLES20.glDeleteShader(this.f35132b);
        GLES20.glDeleteShader(this.f35133c);
    }

    public x5(int i10, int i11, int i12, int i13) {
        this.f35131a = i10;
        this.f35132b = i11;
        this.f35133c = i12;
        this.d = i13;
    }

    public x5(String str, String str2) {
        int a2 = si.d0.a(35633, str);
        this.f35132b = a2;
        int a10 = si.d0.a(35632, str2);
        this.f35133c = a10;
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, a2);
        GLES20.glAttachShader(glCreateProgram, a10);
        GLES20.glBindAttribLocation(glCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(glCreateProgram, 1, "aTextureCoord");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            this.f35131a = glCreateProgram;
            this.d = 1;
            int glGetUniformLocation = GLES20.glGetUniformLocation(glCreateProgram, "sTexture");
            GLES20.glUseProgram(glCreateProgram);
            GLES20.glUniform1i(glGetUniformLocation, 0);
            return;
        }
        String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
        GLES20.glDeleteProgram(glCreateProgram);
        throw new IllegalStateException(r.c.g("Unable to link program: ", glGetProgramInfoLog));
    }
}
