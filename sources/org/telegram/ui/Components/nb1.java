package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class nb1 {
    public final Paint f30942a = new Paint(1);
    public final Paint f30943b;
    public final Paint f30944c;
    public final Paint d;
    public final Path e;
    public final Path f30945f;
    public final Path f30946g;
    public final RectF h;
    public final RectF f30947i;
    public final RectF f30948j;
    public final float[] f30949k;
    public final float[] f30950l;
    public final Matrix f30951m;
    public final float[] f30952n;

    public nb1() {
        Paint paint = new Paint(1);
        this.f30943b = paint;
        this.f30944c = new Paint(2);
        this.d = new Paint(1);
        this.e = new Path();
        this.f30945f = new Path();
        this.f30946g = new Path();
        this.h = new RectF();
        this.f30947i = new RectF();
        this.f30948j = new RectF();
        this.f30949k = new float[8];
        this.f30950l = new float[8];
        this.f30951m = new Matrix();
        this.f30952n = new float[9];
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void c(JSONArray jSONArray, float[] fArr, int i10, float... fArr2) {
        float f7;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 < fArr2.length) {
                f7 = fArr2[i11];
            } else {
                f7 = 0.0f;
            }
            if (jSONArray != null && i11 < jSONArray.length()) {
                f7 = (float) jSONArray.optDouble(i11, f7);
            }
            fArr[i11] = f7;
        }
    }

    public static void d(Paint paint, JSONObject jSONObject, float f7, float f10) {
        Paint.Cap cap;
        Paint.Join join;
        int i10;
        paint.setStrokeWidth(f7);
        int optInt = jSONObject.optInt("lc");
        int optInt2 = jSONObject.optInt("lj");
        if (optInt == 1) {
            cap = Paint.Cap.ROUND;
        } else if (optInt == 2) {
            cap = Paint.Cap.SQUARE;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
        if (optInt2 == 1) {
            join = Paint.Join.ROUND;
        } else if (optInt2 == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
        paint.setStrokeMiter((float) jSONObject.optDouble("ml", f10));
        JSONArray optJSONArray = jSONObject.optJSONArray("d");
        paint.setPathEffect(null);
        if (optJSONArray != null && optJSONArray.length() != 0) {
            int length = optJSONArray.length();
            if (length % 2 == 1) {
                i10 = length * 2;
            } else {
                i10 = length;
            }
            float[] fArr = new float[i10];
            float f11 = 0.0f;
            for (int i11 = 0; i11 < i10; i11++) {
                float max = Math.max(0.0f, (float) optJSONArray.optDouble(i11 % length));
                fArr[i11] = max;
                f11 += max;
            }
            if (f11 > 0.0f) {
                paint.setPathEffect(new DashPathEffect(fArr, (float) jSONObject.optDouble("do")));
            }
        }
    }

    public static void h(JSONObject jSONObject, Path path) {
        int length;
        Path.FillType fillType;
        int i10;
        path.rewind();
        JSONArray optJSONArray = jSONObject.optJSONArray("o");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("v");
        if (optJSONArray == null) {
            return;
        }
        if (optJSONArray2 == null) {
            length = 0;
        } else {
            length = optJSONArray2.length();
        }
        int i11 = 0;
        int i12 = 0;
        while (i12 < optJSONArray.length()) {
            int optInt = optJSONArray.optInt(i12);
            if (optInt == 3) {
                i10 = 6;
            } else if (optInt == 2) {
                i10 = 4;
            } else if (optInt == 4) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            int i13 = i11 + i10;
            if (i13 > length) {
                break;
            }
            if (optInt != 0) {
                if (optInt != 1) {
                    if (optInt != 2) {
                        if (optInt != 3) {
                            if (optInt == 4) {
                                path.close();
                            }
                        } else {
                            path.cubicTo((float) optJSONArray2.optDouble(i11), (float) optJSONArray2.optDouble(i11 + 1), (float) optJSONArray2.optDouble(i11 + 2), (float) optJSONArray2.optDouble(i11 + 3), (float) optJSONArray2.optDouble(i11 + 4), (float) optJSONArray2.optDouble(i11 + 5));
                        }
                    } else {
                        path.quadTo((float) optJSONArray2.optDouble(i11), (float) optJSONArray2.optDouble(i11 + 1), (float) optJSONArray2.optDouble(i11 + 2), (float) optJSONArray2.optDouble(i11 + 3));
                    }
                } else {
                    path.lineTo((float) optJSONArray2.optDouble(i11), (float) optJSONArray2.optDouble(i11 + 1));
                }
            } else {
                path.moveTo((float) optJSONArray2.optDouble(i11), (float) optJSONArray2.optDouble(i11 + 1));
            }
            i12++;
            i11 = i13;
        }
        if (jSONObject.optInt("e") != 0) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    public static RectF i(JSONObject jSONObject, String str, RectF rectF) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            rectF.setEmpty();
            return rectF;
        }
        float optDouble = (float) optJSONArray.optDouble(0);
        float optDouble2 = (float) optJSONArray.optDouble(1);
        rectF.set(optDouble, optDouble2, ((float) optJSONArray.optDouble(2)) + optDouble, ((float) optJSONArray.optDouble(3)) + optDouble2);
        return rectF;
    }

    public static void k(Paint paint, int i10) {
        paint.setShader(null);
        paint.setColor(i10);
    }

    public static int[] l(JSONArray jSONArray) {
        int length = jSONArray.length() / 2;
        int[] iArr = new int[Math.max(2, length)];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = (int) jSONArray.optLong((i10 * 2) + 1);
        }
        if (length == 1) {
            iArr[1] = iArr[0];
        }
        return iArr;
    }

    public static float[] m(JSONArray jSONArray) {
        int length = jSONArray.length() / 2;
        if (length == 1) {
            return new float[]{0.0f, 1.0f};
        }
        float[] fArr = new float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = Math.max(0.0f, Math.min(1.0f, (float) jSONArray.optDouble(i10 * 2)));
        }
        return fArr;
    }

    public final void a(Path path, JSONObject jSONObject, RectF rectF, float f7) {
        JSONArray optJSONArray = jSONObject.optJSONArray("q");
        if (optJSONArray == null) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i10 = 0;
        while (true) {
            float[] fArr = this.f30949k;
            if (i10 < 8) {
                fArr[i10] = Math.max(((float) optJSONArray.optDouble(i10)) + f7, 0.0f);
                i10++;
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            }
        }
    }

    public final void b(Canvas canvas, JSONObject jSONObject) {
        if (jSONObject.has("l")) {
            canvas.clipRect(i(jSONObject, "l", this.f30947i));
        }
    }

    public final void e(Canvas canvas, JSONArray jSONArray, int i10, mb1 mb1Var, float f7, boolean z10) {
        int i11;
        nb1 nb1Var;
        Matrix matrix;
        e0.e0 e0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        e0.e0 e0Var2;
        Bitmap image;
        Canvas canvas2;
        Matrix matrix2;
        e0.e0 e0Var3;
        Shader shader;
        int optLong;
        boolean z11;
        nb1 nb1Var2;
        Matrix matrix3;
        e0.e0 e0Var4;
        int i12;
        boolean z12;
        float f10;
        BlurMaskFilter blurMaskFilter;
        Canvas canvas3;
        ArrayList arrayList3;
        Matrix matrix4;
        boolean z13;
        int i13;
        float[] fArr;
        ArrayList arrayList4;
        Matrix matrix5;
        nb1 nb1Var3 = this;
        e0.e0 e0Var5 = new e0.e0(canvas);
        ArrayList arrayList5 = (ArrayList) e0Var5.e;
        Matrix matrix6 = (Matrix) e0Var5.d;
        ArrayList arrayList6 = (ArrayList) e0Var5.f9531f;
        int i14 = 0;
        while (i14 < i10) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i14);
            if (optJSONObject == null) {
                e0Var = e0Var5;
                i11 = i14;
                matrix = matrix6;
                arrayList2 = arrayList6;
                nb1Var = nb1Var3;
            } else {
                Canvas canvas4 = (Canvas) e0Var5.f9530c;
                int optInt = optJSONObject.optInt("k");
                e0.e0 e0Var6 = e0Var5;
                RectF rectF = nb1Var3.f30948j;
                i11 = i14;
                float[] fArr2 = nb1Var3.f30952n;
                Path path = nb1Var3.e;
                float[] fArr3 = nb1Var3.f30950l;
                Paint paint = nb1Var3.f30943b;
                Path path2 = nb1Var3.f30945f;
                Paint paint2 = nb1Var3.f30942a;
                RectF rectF2 = nb1Var3.h;
                switch (optInt) {
                    case 0:
                        nb1Var = this;
                        matrix = matrix6;
                        e0Var = e0Var6;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        canvas4.save();
                        nb1Var.b(canvas4, optJSONObject);
                        k(paint2, (int) optJSONObject.optLong("c"));
                        nb1Var.j(optJSONObject, "r", path);
                        canvas4.drawPath(path, paint2);
                        canvas4.restore();
                        break;
                    case 1:
                        matrix = matrix6;
                        e0Var = e0Var6;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        paint.setColor((int) optJSONObject.optLong("c"));
                        paint.setStrokeWidth((float) optJSONObject.optDouble("w", 1.0d));
                        paint.setStrokeCap(Paint.Cap.BUTT);
                        paint.setStrokeJoin(Paint.Join.MITER);
                        paint.setPathEffect(null);
                        nb1Var = this;
                        nb1Var.j(optJSONObject, "r", path);
                        canvas4.drawPath(path, paint);
                        break;
                    case 2:
                        matrix = matrix6;
                        e0Var = e0Var6;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        k(paint2, (int) optJSONObject.optLong("c"));
                        canvas4.drawOval(i(optJSONObject, "r", rectF2), paint2);
                        nb1Var = this;
                        break;
                    case 3:
                        matrix = matrix6;
                        e0Var = e0Var6;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        float optDouble = (float) optJSONObject.optDouble("w", 1.0d);
                        float f11 = optDouble / 2.0f;
                        i(optJSONObject, "r", rectF2).inset(f11, f11);
                        paint.setColor((int) optJSONObject.optLong("c"));
                        paint.setStrokeWidth(optDouble);
                        paint.setStrokeCap(Paint.Cap.BUTT);
                        paint.setStrokeJoin(Paint.Join.MITER);
                        paint.setPathEffect(null);
                        canvas4.drawOval(rectF2, paint);
                        nb1Var = this;
                        break;
                    case 4:
                        nb1Var = this;
                        matrix = matrix6;
                        e0Var = e0Var6;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        Paint deviceFont = mb1Var.deviceFont(optJSONObject.optInt("f"));
                        if (deviceFont != null) {
                            deviceFont.setColor((int) optJSONObject.optLong("c"));
                            deviceFont.setShader(null);
                            canvas4.save();
                            float f12 = 1.0f / f7;
                            canvas4.scale(f12, f12);
                            canvas4.drawText(optJSONObject.optString("t"), ((float) optJSONObject.optDouble("x")) * f7, ((float) optJSONObject.optDouble("y")) * f7, deviceFont);
                            canvas4.restore();
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        nb1Var = this;
                        matrix = matrix6;
                        e0Var2 = e0Var6;
                        arrayList = arrayList5;
                        arrayList2 = arrayList6;
                        if (optJSONObject.has("cv")) {
                            image = mb1Var.canvas(optJSONObject.optInt("cv"));
                        } else {
                            image = mb1Var.image(optJSONObject.optInt("i"));
                        }
                        if (image != null) {
                            canvas4.save();
                            nb1Var.b(canvas4, optJSONObject);
                            if (optJSONObject.has("q")) {
                                String str = "l";
                                if (!optJSONObject.has("l")) {
                                    str = "r";
                                }
                                nb1Var.j(optJSONObject, str, path2);
                                canvas4.clipPath(path2);
                            }
                            canvas4.drawBitmap(image, (Rect) null, i(optJSONObject, "r", rectF2), nb1Var.f30944c);
                            canvas4.restore();
                        }
                        e0Var = e0Var2;
                        break;
                    case 6:
                    case 7:
                    case 8:
                        Matrix matrix7 = matrix6;
                        arrayList = arrayList5;
                        nb1Var = this;
                        arrayList2 = arrayList6;
                        JSONArray optJSONArray = optJSONObject.optJSONArray("s");
                        if (optJSONArray == null || optJSONArray.length() < 2) {
                            matrix = matrix7;
                            e0Var2 = e0Var6;
                        } else {
                            int[] l4 = l(optJSONArray);
                            float[] m10 = m(optJSONArray);
                            matrix = matrix7;
                            c(optJSONObject.optJSONArray("a"), fArr3, 4, new float[0]);
                            float f13 = fArr3[0];
                            float f14 = fArr3[1];
                            float f15 = fArr3[2];
                            float f16 = fArr3[3];
                            canvas4.save();
                            nb1Var.b(canvas4, optJSONObject);
                            nb1Var.j(optJSONObject, "r", path2);
                            canvas4.clipPath(path2);
                            paint2.setColor(-16777216);
                            int i15 = 6;
                            if (optInt == 6) {
                                if (l4.length > 16) {
                                    double d = f15 - f13;
                                    e0Var2 = e0Var6;
                                    double d10 = f16 - f14;
                                    float hypot = (float) Math.hypot(d, d10);
                                    if (hypot <= 0.0f) {
                                        canvas2 = canvas4;
                                    } else {
                                        canvas4.translate(f13, f14);
                                        canvas4.rotate((float) Math.toDegrees(Math.atan2(d10, d)));
                                        int length = m10.length - 1;
                                        int i16 = l4[0];
                                        paint2.setShader(null);
                                        paint2.setColor(i16);
                                        canvas4.drawRect(-8000.0f, -8000.0f, m10[0] * hypot, 8000.0f, paint2);
                                        int i17 = 0;
                                        while (i17 < length) {
                                            float f17 = m10[i17] * hypot;
                                            int i18 = i17 + 1;
                                            float f18 = m10[i18] * hypot;
                                            if (f18 > f17) {
                                                int i19 = l4[i17];
                                                if (i19 == l4[i18]) {
                                                    paint2.setShader(null);
                                                    paint2.setColor(i19);
                                                } else {
                                                    paint2.setColor(-16777216);
                                                    paint2.setShader(new LinearGradient(f17, 0.0f, f18, 0.0f, l4[i17], l4[i18], Shader.TileMode.CLAMP));
                                                }
                                                canvas4.drawRect(f17, -8000.0f, f18, 8000.0f, paint2);
                                            }
                                            i17 = i18;
                                        }
                                        int i20 = l4[length];
                                        paint2.setShader(null);
                                        paint2.setColor(i20);
                                        canvas4.drawRect(m10[length] * hypot, -8000.0f, 8000.0f, 8000.0f, paint2);
                                        canvas2 = canvas4;
                                        paint2.setShader(null);
                                    }
                                    canvas2.restore();
                                } else {
                                    i15 = 6;
                                }
                            }
                            e0Var2 = e0Var6;
                            if (optInt == i15) {
                                paint2.setShader(new LinearGradient(f13, f14, f15, f16, l4, m10, Shader.TileMode.CLAMP));
                            } else if (optInt == 7) {
                                float max = Math.max(f15, 0.01f);
                                float max2 = Math.max(f16, 0.01f);
                                paint2.setShader(new RadialGradient(f13, f14, max, l4, m10, Shader.TileMode.CLAMP));
                                canvas4.translate(f13, f14);
                                canvas4.scale(1.0f, max2 / max);
                                canvas4.translate(-f13, -f14);
                            } else {
                                paint2.setShader(new SweepGradient(f13, f14, l4, m10));
                                canvas4.rotate(f15 - 90.0f, f13, f14);
                            }
                            i(optJSONObject, "r", rectF2);
                            canvas4.drawRect(rectF2.left - 4000.0f, rectF2.top - 4000.0f, rectF2.right + 4000.0f, rectF2.bottom + 4000.0f, paint2);
                            paint2.setShader(null);
                            canvas4.restore();
                        }
                        e0Var = e0Var2;
                        break;
                    case 9:
                        Matrix matrix8 = matrix6;
                        arrayList = arrayList5;
                        matrix2 = matrix8;
                        nb1Var = this;
                        e0Var3 = e0Var6;
                        arrayList2 = arrayList6;
                        canvas4.save();
                        arrayList.add(new Matrix(matrix2));
                        e0Var3.f9529b++;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("p");
                        if (optJSONObject2 != null) {
                            h(optJSONObject2, path2);
                        } else {
                            nb1Var.j(optJSONObject, "r", path2);
                        }
                        canvas4.clipPath(path2);
                        matrix = matrix2;
                        e0Var = e0Var3;
                        break;
                    case 10:
                    case 13:
                        Matrix matrix9 = matrix6;
                        arrayList = arrayList5;
                        matrix2 = matrix9;
                        nb1Var = this;
                        arrayList2 = arrayList6;
                        e0Var3 = e0Var6;
                        if (e0Var3.f9529b > 0) {
                            e0Var3.d();
                        }
                        matrix = matrix2;
                        e0Var = e0Var3;
                        break;
                    case 11:
                        Matrix matrix10 = matrix6;
                        arrayList = arrayList5;
                        matrix2 = matrix10;
                        nb1Var = this;
                        e0Var3 = e0Var6;
                        arrayList2 = arrayList6;
                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("p");
                        if (optJSONObject3 != null) {
                            h(optJSONObject3, path);
                            Shader f19 = nb1Var.f(optJSONObject3, "g", "ga", "s");
                            if (f19 != null) {
                                paint2.setColor(-16777216);
                                paint2.setShader(f19);
                                canvas4.drawPath(path, paint2);
                                paint2.setShader(null);
                            } else if (optJSONObject3.has("f") && (((int) optJSONObject3.optLong("f")) >>> 24) != 0) {
                                k(paint2, (int) optJSONObject3.optLong("f"));
                                canvas4.drawPath(path, paint2);
                            }
                            float optDouble2 = (float) optJSONObject3.optDouble("sw");
                            int i21 = (optDouble2 > 0.0f ? 1 : (optDouble2 == 0.0f ? 0 : -1));
                            if (i21 > 0) {
                                shader = nb1Var.f(optJSONObject3, "sg", "sga", "ss");
                            } else {
                                shader = null;
                            }
                            if (optJSONObject3.has("sc") && (((((int) optJSONObject3.optLong("sc")) >>> 24) != 0 || shader != null) && i21 > 0)) {
                                if (shader != null) {
                                    optLong = -16777216;
                                } else {
                                    optLong = (int) optJSONObject3.optLong("sc");
                                }
                                paint.setColor(optLong);
                                paint.setShader(shader);
                                d(paint, optJSONObject3, optDouble2, 4.0f);
                                canvas4.drawPath(path, paint);
                                paint.setPathEffect(null);
                                paint.setShader(null);
                            }
                        }
                        matrix = matrix2;
                        e0Var = e0Var3;
                        break;
                    case 12:
                        ArrayList arrayList7 = arrayList5;
                        Matrix matrix11 = matrix6;
                        arrayList2 = arrayList6;
                        float optDouble3 = (float) optJSONObject.optDouble("o", 1.0d);
                        if (optJSONObject.optInt("h") != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (optDouble3 < 1.0f && !z11) {
                            canvas4.saveLayerAlpha(null, Math.round(Math.max(0.0f, Math.min(1.0f, optDouble3)) * 255.0f));
                        } else {
                            canvas4.save();
                        }
                        arrayList = arrayList7;
                        arrayList.add(new Matrix(matrix11));
                        e0Var = e0Var6;
                        e0Var.f9529b++;
                        c(optJSONObject.optJSONArray("m"), fArr3, 6, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
                        fArr2[0] = fArr3[0];
                        fArr2[1] = fArr3[2];
                        fArr2[2] = fArr3[4];
                        fArr2[3] = fArr3[1];
                        fArr2[4] = fArr3[3];
                        fArr2[5] = fArr3[5];
                        fArr2[6] = 0.0f;
                        fArr2[7] = 0.0f;
                        fArr2[8] = 1.0f;
                        Matrix matrix12 = this.f30951m;
                        matrix12.setValues(fArr2);
                        canvas4.concat(matrix12);
                        matrix11.preConcat(matrix12);
                        if (z11) {
                            canvas4.clipRect(0, 0, 0, 0);
                            nb1Var = this;
                            matrix = matrix11;
                            break;
                        } else {
                            nb1Var = this;
                            matrix = matrix11;
                            break;
                        }
                    case 14:
                        ArrayList arrayList8 = arrayList5;
                        Matrix matrix13 = matrix6;
                        arrayList2 = arrayList6;
                        c(optJSONObject.optJSONArray("a"), fArr3, 4, new float[0]);
                        float f20 = fArr3[0];
                        float f21 = fArr3[1];
                        float max3 = Math.max(fArr3[2], 0.0f);
                        float f22 = fArr3[3];
                        int optLong2 = (int) optJSONObject.optLong("c");
                        i(optJSONObject, "r", rectF);
                        if (rectF.isEmpty() || (optLong2 >>> 24) == 0 || ((i12 = Build.VERSION.SDK_INT) < 28 && (max3 / 2.0f) * f7 > 0.5f)) {
                            nb1Var2 = this;
                            matrix3 = matrix13;
                            e0Var4 = e0Var6;
                        } else {
                            if (optJSONObject.optInt("n") != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            nb1Var2 = this;
                            Paint paint3 = nb1Var2.d;
                            paint3.setColor(optLong2);
                            float f23 = (max3 / 2.0f) * f7;
                            if (f23 > 0.5f) {
                                f10 = max3;
                                e0Var4 = e0Var6;
                                blurMaskFilter = new BlurMaskFilter(((f23 - 0.5f) / 0.57735f) / f7, BlurMaskFilter.Blur.NORMAL);
                            } else {
                                f10 = max3;
                                e0Var4 = e0Var6;
                                blurMaskFilter = null;
                            }
                            paint3.setMaskFilter(blurMaskFilter);
                            Path path3 = nb1Var2.f30946g;
                            path3.rewind();
                            if (z12) {
                                float abs = Math.abs(f21) + Math.abs(f20) + Math.abs(f22) + (f10 * 1.5f) + 2.0f;
                                matrix3 = matrix13;
                                rectF2.set(rectF.left - abs, rectF.top - abs, rectF.right + abs, rectF.bottom + abs);
                                path3.addRect(rectF2, Path.Direction.CW);
                                rectF2.set(rectF.left + f22, rectF.top + f22, rectF.right - f22, rectF.bottom - f22);
                                if (!rectF2.isEmpty()) {
                                    nb1Var2.a(path3, optJSONObject, rectF2, -f22);
                                }
                                path3.setFillType(Path.FillType.EVEN_ODD);
                            } else {
                                matrix3 = matrix13;
                                rectF2.set(rectF.left - f22, rectF.top - f22, rectF.right + f22, rectF.bottom + f22);
                                if (!optJSONObject.has("q")) {
                                    f22 = 0.0f;
                                }
                                nb1Var2.a(path3, optJSONObject, rectF2, f22);
                            }
                            path3.offset(f20, f21);
                            canvas4.save();
                            nb1Var2.j(optJSONObject, "r", path2);
                            if (z12) {
                                canvas3 = canvas4;
                                canvas3.clipPath(path2);
                            } else {
                                canvas3 = canvas4;
                                if (i12 >= 26) {
                                    canvas3.clipOutPath(path2);
                                } else {
                                    canvas3.clipPath(path2, Region.Op.DIFFERENCE);
                                }
                            }
                            canvas3.drawPath(path3, paint3);
                            canvas3.restore();
                            paint3.setMaskFilter(null);
                        }
                        nb1Var = nb1Var2;
                        e0Var = e0Var4;
                        arrayList = arrayList8;
                        matrix = matrix3;
                        break;
                    case 15:
                        e0Var = e0Var6;
                        lb1 lb1Var = new lb1();
                        lb1Var.f30156a = (Canvas) e0Var.f9530c;
                        lb1Var.f30157b = e0Var.f9529b;
                        arrayList6.add(lb1Var);
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("fl");
                        if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                            i(optJSONObject, "r", rectF);
                            if (!rectF.isEmpty()) {
                                arrayList2 = arrayList6;
                                int i22 = 0;
                                float f24 = 0.0f;
                                float f25 = 0.0f;
                                float f26 = 0.0f;
                                float f27 = 0.0f;
                                while (i22 < optJSONArray2.length()) {
                                    JSONArray optJSONArray3 = optJSONArray2.optJSONArray(i22);
                                    if (optJSONArray3 == null) {
                                        i13 = i22;
                                        fArr = fArr2;
                                    } else {
                                        i13 = i22;
                                        fArr = fArr2;
                                        float max4 = Math.max(0.0f, (float) optJSONArray3.optDouble(1));
                                        if (optJSONArray3.optInt(0) == 0) {
                                            float f28 = max4 * 3.0f;
                                            f24 += f28;
                                            f25 += f28;
                                            f26 += f28;
                                            f27 += f28;
                                        } else {
                                            arrayList4 = arrayList5;
                                            matrix5 = matrix6;
                                            if (optJSONArray3.optInt(0) == 9) {
                                                float optDouble4 = (float) optJSONArray3.optDouble(2);
                                                float optDouble5 = (float) optJSONArray3.optDouble(3);
                                                float f29 = max4 * 1.5f;
                                                float max5 = Math.max(f24, f29 - optDouble4);
                                                float max6 = Math.max(f26, optDouble4 + f29);
                                                float max7 = Math.max(f25, f29 - optDouble5);
                                                f27 = Math.max(f27, f29 + optDouble5);
                                                f26 = max6;
                                                f24 = max5;
                                                f25 = max7;
                                            }
                                            i22 = i13 + 1;
                                            fArr2 = fArr;
                                            arrayList5 = arrayList4;
                                            matrix6 = matrix5;
                                        }
                                    }
                                    arrayList4 = arrayList5;
                                    matrix5 = matrix6;
                                    i22 = i13 + 1;
                                    fArr2 = fArr;
                                    arrayList5 = arrayList4;
                                    matrix6 = matrix5;
                                }
                                float[] fArr4 = fArr2;
                                arrayList3 = arrayList5;
                                Matrix matrix14 = matrix6;
                                rectF.set(rectF.left - f24, rectF.top - f25, rectF.right + f26, rectF.bottom + f27);
                                if (Build.VERSION.SDK_INT >= 31 && ((Canvas) e0Var.f9530c).isHardwareAccelerated()) {
                                    Canvas b10 = kb1.b(lb1Var, rectF, optJSONArray2, f7);
                                    if (b10 != null) {
                                        e0Var.f9530c = b10;
                                        e0Var.f9529b = 0;
                                        z13 = false;
                                        matrix4 = matrix14;
                                        matrix = matrix4;
                                        arrayList = arrayList3;
                                        nb1Var = this;
                                    } else {
                                        matrix4 = matrix14;
                                        z13 = false;
                                        matrix = matrix4;
                                        arrayList = arrayList3;
                                        nb1Var = this;
                                    }
                                } else {
                                    matrix4 = matrix14;
                                    matrix4.getValues(fArr4);
                                    if (fArr4[1] == 0.0f && fArr4[3] == 0.0f) {
                                        Matrix matrix15 = lb1Var.f30160g;
                                        matrix15.set(matrix4);
                                        matrix15.postScale(f7, f7);
                                        matrix15.mapRect(rectF2, rectF);
                                        int floor = (int) Math.floor(rectF2.left);
                                        int floor2 = (int) Math.floor(rectF2.top);
                                        int ceil = ((int) Math.ceil(rectF2.right)) - floor;
                                        int ceil2 = ((int) Math.ceil(rectF2.bottom)) - floor2;
                                        if (ceil > 0 && ceil2 > 0 && ceil * ceil2 <= 16777216) {
                                            lb1Var.f30159f = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                            lb1Var.d = floor;
                                            lb1Var.e = floor2;
                                            lb1Var.h = Math.abs(fArr4[0]) * f7;
                                            lb1Var.f30161i = optJSONArray2;
                                            Canvas canvas5 = new Canvas(lb1Var.f30159f);
                                            canvas5.translate(-floor, -floor2);
                                            canvas5.concat(matrix15);
                                            e0Var.f9530c = canvas5;
                                            z13 = false;
                                            e0Var.f9529b = 0;
                                            matrix = matrix4;
                                            arrayList = arrayList3;
                                            nb1Var = this;
                                            break;
                                        }
                                    }
                                    z13 = false;
                                    matrix = matrix4;
                                    arrayList = arrayList3;
                                    nb1Var = this;
                                }
                            }
                        }
                        arrayList3 = arrayList5;
                        matrix4 = matrix6;
                        arrayList2 = arrayList6;
                        z13 = false;
                        matrix = matrix4;
                        arrayList = arrayList3;
                        nb1Var = this;
                        break;
                    case 16:
                        e0Var = e0Var6;
                        if (!arrayList6.isEmpty()) {
                            g(e0Var, f7);
                        }
                        nb1Var = this;
                        matrix = matrix6;
                        arrayList2 = arrayList6;
                        break;
                    case 17:
                        if (z10 && Build.VERSION.SDK_INT >= 31 && canvas4.isHardwareAccelerated()) {
                            kb1.a(this, e0Var6, jSONArray, i11, optJSONObject, mb1Var, f7);
                            nb1Var = this;
                            e0Var = e0Var6;
                            matrix = matrix6;
                            arrayList2 = arrayList6;
                            break;
                        }
                        break;
                    default:
                        nb1Var = this;
                        matrix = matrix6;
                        arrayList2 = arrayList6;
                        e0Var = e0Var6;
                        break;
                }
                nb1 nb1Var4 = nb1Var;
                i14 = i11 + 1;
                nb1Var3 = nb1Var4;
                arrayList5 = arrayList;
                e0Var5 = e0Var;
                matrix6 = matrix;
                arrayList6 = arrayList2;
            }
            arrayList = arrayList5;
            nb1 nb1Var42 = nb1Var;
            i14 = i11 + 1;
            nb1Var3 = nb1Var42;
            arrayList5 = arrayList;
            e0Var5 = e0Var;
            matrix6 = matrix;
            arrayList6 = arrayList2;
        }
        nb1 nb1Var5 = nb1Var3;
        e0.e0 e0Var7 = e0Var5;
        ArrayList arrayList9 = arrayList6;
        while (!arrayList9.isEmpty()) {
            nb1Var5.g(e0Var7, f7);
        }
        while (e0Var7.f9529b > 0) {
            e0Var7.d();
        }
    }

    public final Shader f(JSONObject jSONObject, String str, String str2, String str3) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str3);
        if (jSONObject.has(str) && optJSONArray != null && optJSONArray.length() >= 4) {
            int[] l4 = l(optJSONArray);
            float[] m10 = m(optJSONArray);
            float[] fArr = this.f30950l;
            c(jSONObject.optJSONArray(str2), fArr, 7, new float[0]);
            if (jSONObject.optInt(str) == 1) {
                return new LinearGradient(fArr[0], fArr[1], fArr[2], fArr[3], l4, m10, Shader.TileMode.CLAMP);
            }
            return new RadialGradient(fArr[0], fArr[1], Math.max(fArr[4], 0.01f), l4, m10, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public final void g(e0.e0 e0Var, float f7) {
        Object obj;
        int i10;
        lb1 lb1Var = (lb1) ic.a.y(1, (ArrayList) e0Var.f9531f);
        while (true) {
            int i11 = e0Var.f9529b;
            obj = lb1Var.f30158c;
            if (obj == null && lb1Var.f30159f == null) {
                i10 = lb1Var.f30157b;
            } else {
                i10 = 0;
            }
            if (i11 <= i10) {
                break;
            }
            e0Var.d();
        }
        if (obj != null) {
            kb1.d(lb1Var, f7);
            e0Var.f9530c = lb1Var.f30156a;
        } else {
            Bitmap bitmap = lb1Var.f30159f;
            if (bitmap != null) {
                WidgetSandboxNative.filterPixels(bitmap, lb1Var.f30161i.toString().getBytes(StandardCharsets.UTF_8), lb1Var.h);
                e0Var.f9530c = lb1Var.f30156a;
                Matrix matrix = new Matrix();
                if (lb1Var.f30160g.invert(matrix)) {
                    ((Canvas) e0Var.f9530c).save();
                    ((Canvas) e0Var.f9530c).concat(matrix);
                    ((Canvas) e0Var.f9530c).drawBitmap(lb1Var.f30159f, lb1Var.d, lb1Var.e, this.f30944c);
                    ((Canvas) e0Var.f9530c).restore();
                }
            }
        }
        e0Var.f9529b = lb1Var.f30157b;
    }

    public final void j(JSONObject jSONObject, String str, Path path) {
        RectF rectF = this.h;
        i(jSONObject, str, rectF);
        path.rewind();
        JSONArray optJSONArray = jSONObject.optJSONArray("q");
        if (optJSONArray == null) {
            path.addRect(rectF, Path.Direction.CW);
            return;
        }
        int i10 = 0;
        while (true) {
            float[] fArr = this.f30949k;
            if (i10 < 8) {
                fArr[i10] = (float) optJSONArray.optDouble(i10);
                i10++;
            } else {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                return;
            }
        }
    }
}
