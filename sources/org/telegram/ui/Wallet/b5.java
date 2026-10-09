package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
public final class b5 extends View {
    public final dc.g[] E;
    public Bitmap F;
    public SweepGradient G;
    public float H;
    public float I;
    public final Paint f34682a;
    public final Paint f34683b;
    public final Paint f34684c;
    public final Paint d;
    public final Paint f34685e;
    public final Paint f34686f;
    public final Paint h;
    public final Paint f34687n;
    public final Paint f34688r;
    public final RectF f34689s;
    public final RectF v;
    public final Matrix f34690w;
    public Drawable f34691x;
    public final Path f34692y;

    public b5(Context context, int i10, int i11) {
        super(context);
        this.f34682a = new Paint(1);
        this.f34683b = new Paint(1);
        this.f34684c = new Paint(3);
        this.d = new Paint(3);
        this.f34685e = new Paint(1);
        this.f34686f = new Paint(1);
        this.h = new Paint(1);
        this.f34687n = new Paint(1);
        this.f34688r = new Paint(1);
        this.f34689s = new RectF();
        this.v = new RectF();
        this.f34690w = new Matrix();
        this.f34692y = new Path();
        Random random = new Random(3622097293706218323L);
        dc.g[] gVarArr = new dc.g[16];
        for (int i12 = 0; i12 < 16; i12++) {
            ?? obj = new Object();
            obj.f8291a = (random.nextFloat() * 300.0f) + 18.0f;
            obj.f8292b = (random.nextFloat() * 173.0f) + 16.0f;
            obj.f8293c = (random.nextFloat() * 3.5f) + 1.5f;
            float nextFloat = (random.nextFloat() * 0.48f) + 0.16f;
            double nextFloat2 = random.nextFloat() * 6.2831855f;
            float cos = (float) Math.cos(nextFloat2);
            float sin = (float) Math.sin(nextFloat2);
            obj.d = cos * nextFloat;
            obj.f8294e = nextFloat * sin;
            float f7 = -sin;
            obj.h = f7;
            obj.f8297i = cos;
            obj.f8295f = f7 * 0.08f;
            obj.f8296g = cos * 0.08f;
            gVarArr[i12] = obj;
        }
        this.E = gVarArr;
        Paint paint = this.f34684c;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-16748084, mode));
        this.d.setColorFilter(new PorterDuffColorFilter(Color.argb(15, 255, 255, 255), mode));
        this.f34687n.setColor(-9208960);
        this.f34688r.setColor(-1);
        this.h.setColor(687865856);
        Paint paint2 = this.h;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.h.setStrokeWidth(1.0f);
        this.f34682a.setColor(603979776);
        this.f34682a.setStyle(style);
        this.f34682a.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f34682a.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(1.0f), BlurMaskFilter.Blur.NORMAL));
        float f10 = 336.0f - i11;
        this.v.set(f10 - 50.0f, 73.0f, f10, 111.0f);
        Drawable drawable = getContext().getDrawable(i10);
        this.f34691x = drawable;
        if (drawable != null) {
            this.f34691x = drawable.mutate();
        }
        invalidate();
    }

    public static int b(float f7) {
        float c10 = d5.c((f7 - 0.78f) / 0.18f, 0.0f, 1.0f);
        float B = com.google.android.gms.internal.vision.e2.B(c10, 2.0f, 3.0f, c10 * c10);
        return Color.argb(Math.round(f7 * 145.0f), Math.round((120.0f * B) + 135.0f), Math.round((B * 16.0f) + 239.0f), 255);
    }

    public static float c(float f7, float f10, float f11, float f12, float f13) {
        float f14 = f7 * f7;
        float f15 = f10 * f10;
        float sqrt = (float) Math.sqrt(Math.max(0.0f, (1.0f - f14) - f15));
        float f16 = sqrt * f13;
        return (float) Math.pow(Math.max(0.0f, (f16 + ((f10 * f12) + (f7 * f11))) / ((float) Math.sqrt((sqrt * sqrt) + (f14 + f15)))), 6.0d);
    }

    public final void a(Canvas canvas, int i10) {
        Drawable drawable = this.f34691x;
        if (drawable == null) {
            return;
        }
        drawable.setTint(i10);
        Drawable drawable2 = this.f34691x;
        RectF rectF = this.v;
        drawable2.setBounds((int) (rectF.left + 13.0f), (int) (rectF.top + 7.0f), (int) (rectF.right - 13.0f), (int) (rectF.bottom - 7.0f));
        this.f34691x.draw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float f7;
        dc.g[] gVarArr;
        int i10;
        super.onDraw(canvas);
        RectF rectF = this.f34689s;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = new Path();
        w7.g6.a(path, getWidth(), getHeight());
        int save = canvas.save();
        canvas.clipPath(path);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
        int save2 = canvas.save();
        float f10 = 1.0f;
        canvas.translate(0.0f, -AndroidUtilities.dp(1.0f));
        canvas.drawRoundRect(rectF2, Math.max(0.0f, ((getWidth() * 0.15f) / 2.0f) - AndroidUtilities.dp(0.5f)), Math.max(0.0f, ((getHeight() * 0.15f) / 1.212122f) - AndroidUtilities.dp(0.5f)), this.f34682a);
        canvas.restoreToCount(save2);
        canvas.restoreToCount(save);
        int save3 = canvas.save();
        canvas.clipPath(path);
        float sin = (((float) Math.sin(Math.toRadians(this.I))) * 0.72f) + 0.08f;
        float f11 = (-((float) Math.sin(Math.toRadians(this.H)))) * 0.72f;
        float f12 = 205.0f;
        float sqrt = 1.0f / ((float) Math.sqrt(sc.v.d(f11, f11, sin * sin, 1.0f)));
        float f13 = sin * sqrt;
        float f14 = f11 * sqrt;
        double radians = (float) Math.toRadians(((this.I * 2.0f) + 20.99f) - (this.H * 1.25f));
        float cos = (float) Math.cos(radians);
        float sin2 = (float) Math.sin(radians);
        int save4 = canvas.save();
        canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
        dc.g[] gVarArr2 = this.E;
        int length = gVarArr2.length;
        int i11 = 0;
        while (true) {
            paint = this.f34683b;
            if (i11 >= length) {
                break;
            }
            float f15 = f12;
            dc.g gVar = gVarArr2[i11];
            float f16 = f10;
            float f17 = gVar.f8291a - 168.0f;
            int i12 = i11;
            float f18 = cos;
            float c10 = d5.c((Math.abs((((gVar.f8292b - 102.5f) * sin2) + (f17 * f18)) * (f16 / Math.max(0.001f, (float) Math.sqrt((f7 * f7) + (f17 * f17))))) - 0.38f) / 0.34000003f, 0.0f, f16);
            float f19 = sin2;
            float B = com.google.android.gms.internal.vision.e2.B(c10, 2.0f, 3.0f, c10 * c10);
            float c11 = c(gVar.d + gVar.f8295f, gVar.f8294e + gVar.f8296g, f13, f14, sqrt) * B;
            float c12 = c(gVar.d - gVar.f8295f, gVar.f8294e - gVar.f8296g, f13, f14, sqrt) * B;
            if (Math.max(c11, c12) < 0.015f) {
                gVarArr = gVarArr2;
                i10 = length;
            } else {
                int b10 = b(c11);
                int b11 = b(c12);
                float f20 = gVar.h;
                float f21 = gVar.f8293c;
                float f22 = f20 * f21;
                float f23 = gVar.f8297i * f21;
                float f24 = gVar.f8291a;
                float f25 = gVar.f8292b;
                paint.setShader(new LinearGradient(f24 - f22, f25 - f23, f24 + f22, f25 + f23, b10, b11, Shader.TileMode.CLAMP));
                float f26 = gVar.f8291a;
                float f27 = gVar.f8292b;
                float f28 = gVar.f8293c;
                float f29 = f28 * 0.15f;
                Path path2 = this.f34692y;
                path2.rewind();
                path2.moveTo(f26 - f28, f27);
                float f30 = f26 - f29;
                gVarArr = gVarArr2;
                float f31 = f27 - f29;
                path2.lineTo(f30, f31);
                i10 = length;
                path2.lineTo(f26, f27 - f28);
                float f32 = f26 + f29;
                path2.lineTo(f32, f31);
                path2.lineTo(f26 + f28, f27);
                float f33 = f29 + f27;
                path2.lineTo(f32, f33);
                path2.lineTo(f26, f27 + f28);
                path2.lineTo(f30, f33);
                path2.close();
                canvas.drawPath(path2, paint);
            }
            i11 = i12 + 1;
            f12 = f15;
            cos = f18;
            sin2 = f19;
            gVarArr2 = gVarArr;
            length = i10;
            f10 = 1.0f;
        }
        float f34 = f12;
        paint.setShader(null);
        canvas.restoreToCount(save4);
        canvas.restoreToCount(save3);
        Bitmap bitmap = this.F;
        if (bitmap != null && !bitmap.isRecycled()) {
            int save5 = canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
            canvas.drawBitmap(this.F, (Rect) null, rectF, this.d);
            canvas.restoreToCount(save5);
            canvas.drawBitmap(this.F, (Rect) null, rectF, this.f34684c);
        }
        float width = getWidth() / 336.0f;
        float height = getHeight() / f34;
        int save6 = canvas.save();
        canvas.scale(width, height);
        Path path3 = new Path();
        Path.Direction direction = Path.Direction.CW;
        RectF rectF3 = this.v;
        path3.addRoundRect(rectF3, 9.0f, 9.0f, direction);
        canvas.clipPath(path3);
        canvas.drawRect(rectF3, this.f34685e);
        canvas.drawRect(rectF3, this.f34686f);
        canvas.restoreToCount(save6);
        int save7 = canvas.save();
        canvas.scale(width, height);
        RectF rectF4 = new RectF(rectF3);
        rectF4.inset(-0.5f, -0.5f);
        canvas.drawRoundRect(rectF4, 9.5f, 9.5f, this.h);
        canvas.restoreToCount(save7);
        int save8 = canvas.save();
        canvas.scale(width, height);
        canvas.translate(0.0f, 1.0f);
        a(canvas, this.f34688r.getColor());
        canvas.restoreToCount(save8);
        int save9 = canvas.save();
        canvas.scale(width, height);
        a(canvas, this.f34687n.getColor());
        canvas.restoreToCount(save9);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        RectF rectF = this.v;
        this.f34685e.setShader(new LinearGradient(rectF.left + 5.2f, rectF.top + 3.4f, rectF.right - 4.6f, rectF.bottom - 4.0f, new int[]{-520225025, -524567104}, new float[]{0.0799f, 0.922f}, Shader.TileMode.CLAMP));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        this.G = new SweepGradient(centerX, centerY, new int[]{16777215, 16777215, 1560281087, 16777215, 0, 520093696, 0, 0}, new float[]{0.0f, 0.06f, 0.25f, 0.44f, 0.56f, 0.75f, 0.94f, 1.0f});
        Matrix matrix = this.f34690w;
        matrix.setRotate(90.0f, centerX, centerY);
        this.G.setLocalMatrix(matrix);
        this.f34686f.setShader(this.G);
    }
}
