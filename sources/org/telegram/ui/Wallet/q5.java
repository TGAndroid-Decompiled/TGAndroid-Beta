package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.LruCache;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import org.telegram.messenger.wh;
public final class q5 {
    public static final LruCache B = new LruCache(2);
    public final int[] A;
    public p5 f34781a;
    public int f34782b;
    public float[] f34783c;
    public float d;
    public final int[] e;
    public final Context f34784f;
    public float[] f34785g;
    public final int h;
    public final p5 f34786i;
    public final p5 f34787j;
    public final int[] f34788k;
    public final float[] f34789l;
    public boolean f34790m;
    public final p5 f34791n;
    public final p5 f34792o;
    public final p5 f34793p;
    public final mi.s f34794q;
    public final int f34795r;
    public final mi.s f34796s;
    public final mi.s f34797t;
    public int f34798u;
    public final int v;
    public final x5 f34799w;
    public final p5 f34800x;
    public final float[] f34801y;
    public final float f34802z;

    public q5(android.content.Context r25, int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.q5.<init>(android.content.Context, int, int):void");
    }

    public static void a(float[] fArr, int i10) {
        FloatBuffer h = wh.h(ByteBuffer.allocateDirect(fArr.length * 4));
        h.put(fArr).position(0);
        GLES20.glBindBuffer(34962, i10);
        GLES20.glBufferData(34962, fArr.length * 4, h, 35044);
        GLES20.glBindBuffer(34962, 0);
    }

    public static Bitmap c(Context context, int i10, int i11) {
        int i12;
        int i13;
        Bitmap createBitmap = Bitmap.createBitmap(1024, 625, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f7 = 3.047619f;
        float f10 = 3.0487804f;
        canvas.scale(3.047619f, 3.0487804f);
        float f11 = 336.0f - i11;
        float f12 = f11 - 48.0f;
        Paint paint = new Paint(1);
        paint.setColor(-65536);
        float f13 = 74.0f;
        canvas.drawRoundRect(new RectF(f12, 74.0f, f11, 110.0f), 8.0f, 8.0f, paint);
        Drawable drawable = context.getDrawable(i10);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTint(-16711936);
            mutate.setBounds((int) (f12 + 12.0f), 80, (int) (f11 - 12.0f), 104);
            mutate.draw(canvas);
        }
        int i14 = 0;
        int max = Math.max(0, ((int) Math.floor(f12 * 3.047619f)) - 2);
        int max2 = Math.max(0, ((int) Math.floor(225.60976f)) - 2);
        int min = Math.min(1024, ((int) Math.ceil(f11 * 3.047619f)) + 2);
        int min2 = Math.min(625, ((int) Math.ceil(335.36584f)) + 2);
        if (min > max && min2 > max2) {
            int i15 = min - max;
            int i16 = min2 - max2;
            int[] iArr = new int[i15 * i16];
            createBitmap.getPixels(iArr, 0, i15, max, max2, i15, i16);
            int i17 = max2;
            while (i17 < min2) {
                int i18 = max;
                while (i18 < min) {
                    int i19 = (((i17 - max2) * i15) + i18) - max;
                    int i20 = iArr[i19];
                    float f14 = f7;
                    float f15 = f10;
                    int i21 = (i20 >>> 24) & 255;
                    float f16 = f13;
                    int i22 = (i20 >>> 8) & 255;
                    if (i21 == 0) {
                        iArr[i19] = i14;
                        i12 = min;
                        i13 = i14;
                    } else {
                        i12 = min;
                        float f17 = 1.0f - ((i22 * 0.5f) / 255.0f);
                        i13 = 0;
                        iArr[i19] = Math.max(0, Math.min(255, Math.round(f17 * ((Math.max(0.0f, Math.min(1.0f, (((((i17 / f15) - f16) - 3.4f) * 28.6f) + ((((i18 / f14) - f12) - 5.2f) * 38.2f)) / 2277.2002f)) * (-0.255f)) + 0.995f) * 255.0f))) | (i21 << 16) | (i21 << 24) | (i22 << 8);
                    }
                    i18++;
                    f13 = f16;
                    i14 = i13;
                    min = i12;
                    f7 = f14;
                    f10 = f15;
                }
                i17++;
                f10 = f10;
            }
            createBitmap.setPixels(iArr, 0, i15, max, max2, i15, i16);
        }
        return createBitmap;
    }

    public static int d(Context context, int i10, int i11) {
        Bitmap g10 = g(context, i10, i11);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, g10, 0);
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }

    public static int e() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, ByteBuffer.allocateDirect(4));
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }

    public static synchronized Bitmap g(Context context, int i10, int i11) {
        Bitmap bitmap;
        synchronized (q5.class) {
            String str = i10 + ":" + i11 + ":" + context.getResources().getConfiguration().hashCode();
            LruCache lruCache = B;
            bitmap = (Bitmap) lruCache.get(str);
            if (bitmap == null) {
                bitmap = c(context, i10, i11);
                lruCache.put(str, bitmap);
            }
        }
        return bitmap;
    }

    public static float h(float[] fArr, int i10, int i11, int i12, int i13) {
        return fArr[Math.max(0, Math.min(i10 - 1, i12)) + (Math.max(0, Math.min(i11 - 1, i13)) * i10)];
    }

    public static String i(Context context, String str) {
        try {
            InputStream open = context.getAssets().open(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = open.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                    byteArrayOutputStream.close();
                    open.close();
                    return byteArrayOutputStream2;
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Could not read ".concat(str), e);
        }
    }

    public static void j() {
        GLES20.glTexParameteri(3553, 10241, 9987);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void b(p5 p5Var) {
        GLES20.glUniform3fv(p5Var.d, 4, this.f34785g, 0);
        GLES20.glUniform3fv(p5Var.e, 4, this.f34785g, 12);
        GLES20.glUniform4fv(p5Var.f34711f, 1, this.f34785g, 24);
        GLES20.glUniform2fv(p5Var.f34712g, 1, this.f34785g, 28);
        GLES20.glUniform3fv(p5Var.h, 2, this.f34785g, 30);
        int i10 = p5Var.f34713i;
        if (i10 >= 0) {
            GLES20.glUniform3fv(i10, 2, this.f34785g, 36);
        }
    }

    public final void f(mi.s sVar, p5 p5Var) {
        b(p5Var);
        int i10 = p5Var.f34714j;
        int i11 = sVar.f16979b[0];
        if (i10 >= 0) {
            GLES20.glBindBuffer(34962, i11);
            GLES20.glEnableVertexAttribArray(i10);
            GLES20.glVertexAttribPointer(i10, 3, 5126, false, 0, 0);
        }
        int i12 = p5Var.f34715k;
        int i13 = sVar.f16979b[1];
        if (i12 >= 0) {
            GLES20.glBindBuffer(34962, i13);
            GLES20.glEnableVertexAttribArray(i12);
            GLES20.glVertexAttribPointer(i12, 3, 5126, false, 0, 0);
        }
        GLES20.glDrawArrays(4, 0, sVar.f16978a);
    }
}
