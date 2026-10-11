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
import org.telegram.messenger.ai;
public final class h5 {
    public static final LruCache B = new LruCache(2);
    public final int[] A;
    public g5 f35059a;
    public int f35060b;
    public int f35061c;
    public int d;
    public g5 f35062e;
    public int f35063f;
    public float[] f35064g;
    public float h;
    public final int[] f35065i;
    public final Context f35066j;
    public final int f35067k;
    public final g5 f35068l;
    public final g5 f35069m;
    public final int[] f35070n;
    public final float[] f35071o;
    public boolean f35072p;
    public final g5 f35073q;
    public final g5 f35074r;
    public final li.r f35075s;
    public final li.r f35076t;
    public int f35077u;
    public final int v;
    public final ki.z f35078w;
    public final g5 f35079x;
    public final float[] f35080y;
    public final float f35081z;

    public h5(android.content.Context r25, int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.h5.<init>(android.content.Context, int, int):void");
    }

    public static void a(float[] fArr, int i10) {
        FloatBuffer h = ai.h(ByteBuffer.allocateDirect(fArr.length * 4));
        h.put(fArr).position(0);
        GLES20.glBindBuffer(34962, i10);
        GLES20.glBufferData(34962, fArr.length * 4, h, 35044);
        GLES20.glBindBuffer(34962, 0);
    }

    public static Bitmap b(Context context, int i10, int i11) {
        int i12;
        int i13;
        Bitmap createBitmap = Bitmap.createBitmap(1024, 625, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f7 = 3.047619f;
        float f10 = 3.0487804f;
        canvas.scale(3.047619f, 3.0487804f);
        float f11 = 336.0f - i11;
        float f12 = f11 - 50.0f;
        Paint paint = new Paint(1);
        paint.setColor(-65536);
        float f13 = 73.0f;
        canvas.drawRoundRect(new RectF(f12, 73.0f, f11, 111.0f), 9.0f, 9.0f, paint);
        Drawable drawable = context.getDrawable(i10);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTint(-16711936);
            mutate.setBounds((int) (f12 + 13.0f), 80, (int) (f11 - 13.0f), 104);
            mutate.draw(canvas);
        }
        int i14 = 0;
        int max = Math.max(0, ((int) Math.floor(f12 * 3.047619f)) - 2);
        int max2 = Math.max(0, ((int) Math.floor(222.56097f)) - 2);
        int min = Math.min(1024, ((int) Math.ceil(f11 * 3.047619f)) + 2);
        int min2 = Math.min(625, ((int) Math.ceil(338.41464f)) + 2);
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
                        iArr[i19] = Math.max(0, Math.min(255, Math.round(f17 * ((Math.max(0.0f, Math.min(1.0f, (((((i17 / f15) - f16) - 3.4f) * 30.6f) + ((((i18 / f14) - f12) - 5.2f) * 40.2f)) / 2552.4001f)) * (-0.255f)) + 0.995f) * 255.0f))) | (i21 << 16) | (i21 << 24) | (i22 << 8);
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

    public static int c(Context context, int i10, int i11) {
        Bitmap f7 = f(context, i10, i11);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, f7, 0);
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }

    public static int d() {
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

    public static void e(li.r rVar, g5 g5Var) {
        int i10 = g5Var.f35017b;
        int i11 = rVar.f15682b[0];
        if (i10 >= 0) {
            GLES20.glBindBuffer(34962, i11);
            GLES20.glEnableVertexAttribArray(i10);
            GLES20.glVertexAttribPointer(i10, 3, 5126, false, 0, 0);
        }
        int i12 = g5Var.f35018c;
        int i13 = rVar.f15682b[1];
        if (i12 >= 0) {
            GLES20.glBindBuffer(34962, i13);
            GLES20.glEnableVertexAttribArray(i12);
            GLES20.glVertexAttribPointer(i12, 3, 5126, false, 0, 0);
        }
        GLES20.glDrawArrays(4, 0, rVar.f15681a);
    }

    public static synchronized Bitmap f(Context context, int i10, int i11) {
        Bitmap bitmap;
        synchronized (h5.class) {
            String str = i10 + ":" + i11 + ":" + context.getResources().getConfiguration().hashCode();
            LruCache lruCache = B;
            bitmap = (Bitmap) lruCache.get(str);
            if (bitmap == null) {
                bitmap = b(context, i10, i11);
                lruCache.put(str, bitmap);
            }
        }
        return bitmap;
    }

    public static String g(Context context, String str) {
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
        } catch (IOException e7) {
            throw new IllegalStateException("Could not read ".concat(str), e7);
        }
    }

    public static void i() {
        GLES20.glTexParameteri(3553, 10241, 9987);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void h(Bitmap bitmap) {
        if (this.f35059a == null) {
            Context context = this.f35066j;
            this.f35059a = new g5(context, g(context, "shaders/wallet_card_vertex.glsl"), g(this.f35066j, "shaders/wallet_card_content_fragment.glsl"), "content", "");
            this.f35060b = d();
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f35060b);
        if (this.f35061c == bitmap.getWidth() && this.d == bitmap.getHeight()) {
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            return;
        }
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        this.f35061c = bitmap.getWidth();
        this.d = bitmap.getHeight();
    }
}
