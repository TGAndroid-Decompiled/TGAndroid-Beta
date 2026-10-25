package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import org.json.JSONArray;
import org.json.JSONObject;
public final class ua1 {
    public static final PorterDuff.Mode[] f33323r = {null, PorterDuff.Mode.SRC_IN, PorterDuff.Mode.SRC_OUT, PorterDuff.Mode.SRC_ATOP, PorterDuff.Mode.DST_OVER, PorterDuff.Mode.DST_IN, PorterDuff.Mode.DST_OUT, PorterDuff.Mode.DST_ATOP, PorterDuff.Mode.ADD, PorterDuff.Mode.SRC, PorterDuff.Mode.XOR, PorterDuff.Mode.MULTIPLY, PorterDuff.Mode.SCREEN, PorterDuff.Mode.OVERLAY, PorterDuff.Mode.DARKEN, PorterDuff.Mode.LIGHTEN};
    public final Paint f33324a = new Paint(3);
    public final Paint f33325b = new Paint();
    public final Paint f33326c;
    public final Path d;
    public final Path e;
    public final Matrix f33327f;
    public final Matrix f33328g;
    public final float[] h;
    public final float[] f33329i;
    public final RectF f33330j;
    public final Rect f33331k;
    public final int f33332l;
    public Bitmap f33333m;
    public Bitmap f33334n;
    public Canvas f33335o;
    public int f33336p;
    public int f33337q;

    public ua1(int i10) {
        Paint paint = new Paint();
        this.f33326c = paint;
        this.d = new Path();
        this.e = new Path();
        this.f33327f = new Matrix();
        this.f33328g = new Matrix();
        this.h = new float[9];
        this.f33329i = new float[8];
        this.f33330j = new RectF();
        this.f33331k = new Rect();
        this.f33337q = -1;
        this.f33332l = i10;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static void b(android.graphics.Paint r3, int r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua1.b(android.graphics.Paint, int):void");
    }

    public final void a(Paint paint, JSONObject jSONObject) {
        int length;
        int optInt = jSONObject.optInt("pk");
        JSONArray optJSONArray = jSONObject.optJSONArray("s");
        if (optJSONArray == null) {
            length = 0;
        } else {
            length = optJSONArray.length() / 2;
        }
        if (optInt != 0 && length != 0) {
            int[] l4 = nb1.l(optJSONArray);
            float[] m10 = nb1.m(optJSONArray);
            float[] fArr = this.f33329i;
            nb1.c(jSONObject.optJSONArray("pa"), fArr, 6, new float[0]);
            paint.setColor(-16777216);
            if (optInt == 1) {
                paint.setShader(new LinearGradient(fArr[0], fArr[1], fArr[2], fArr[3], l4, m10, Shader.TileMode.CLAMP));
                return;
            } else if (optInt == 2) {
                float f7 = fArr[2];
                float max = Math.max(fArr[5], 0.01f);
                if (f7 > 0.0f && f7 < max) {
                    float[] fArr2 = new float[m10.length];
                    for (int i10 = 0; i10 < m10.length; i10++) {
                        float f10 = f7 / max;
                        fArr2[i10] = c3.h0.z(1.0f, f10, m10[i10], f10);
                    }
                    m10 = fArr2;
                }
                paint.setShader(new RadialGradient(fArr[3], fArr[4], max, l4, m10, Shader.TileMode.CLAMP));
                return;
            } else {
                SweepGradient sweepGradient = new SweepGradient(fArr[1], fArr[2], l4, m10);
                Matrix matrix = new Matrix();
                matrix.setRotate((float) Math.toDegrees(fArr[0]), fArr[1], fArr[2]);
                sweepGradient.setLocalMatrix(matrix);
                paint.setShader(sweepGradient);
                return;
            }
        }
        paint.setShader(null);
        paint.setColor((int) jSONObject.optLong("c"));
    }

    public final void c(android.graphics.Canvas r23, org.json.JSONObject r24, org.telegram.ui.Components.ta1 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ua1.c(android.graphics.Canvas, org.json.JSONObject, org.telegram.ui.Components.ta1):void");
    }
}
