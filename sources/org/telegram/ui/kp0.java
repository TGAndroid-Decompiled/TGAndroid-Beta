package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public final class kp0 extends FrameLayout {
    public int A;
    public int B;
    public boolean C;
    public final mp0 D;

    public final Paint f39820a;

    public final Paint f39821b;

    public final Paint f39822c;
    public float d;

    public float f39823e;

    public float f39824f;
    public float h;

    public int f39825n;

    public float f39826r;

    public float f39827s;
    public int v;

    public int f39828w;

    public int f39829x;

    public int f39830y;

    public kp0(mp0 mp0Var, Context context) {
        super(context);
        this.D = mp0Var;
        this.f39820a = null;
        this.f39821b = null;
        this.f39822c = null;
        this.d = 600.0f;
        this.f39823e = 600.0f;
        this.f39824f = -1.0f;
        this.h = -1.0f;
        this.f39825n = 0;
        this.f39826r = 0.0f;
        this.f39827s = 0.0f;
        Paint paint = new Paint();
        this.f39820a = paint;
        paint.setColor(1073412858);
        this.f39820a.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.f39820a.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.f39821b = paint2;
        paint2.setColor(-1);
        Paint paint3 = new Paint();
        this.f39822c = paint3;
        paint3.setColor(-939524096);
        setBackgroundColor(-13421773);
        setOnTouchListener(new g0(this, 4));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        mp0 mp0Var = this.D;
        BitmapDrawable bitmapDrawable = mp0Var.f40576b;
        if (bitmapDrawable != null) {
            try {
                int i10 = this.f39829x;
                int i11 = this.f39830y;
                bitmapDrawable.setBounds(i10, i11, this.v + i10, this.f39828w + i11);
                mp0Var.f40576b.draw(canvas);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        int i12 = this.f39829x;
        canvas.drawRect(i12, this.f39830y, i12 + this.v, this.h, this.f39822c);
        float f10 = this.f39829x;
        float f11 = this.h;
        canvas.drawRect(f10, f11, this.f39824f, f11 + this.f39823e, this.f39822c);
        float f12 = this.f39824f + this.d;
        float f13 = this.h;
        canvas.drawRect(f12, f13, this.f39829x + this.v, f13 + this.f39823e, this.f39822c);
        int i13 = this.f39829x;
        canvas.drawRect(i13, this.h + this.f39823e, i13 + this.v, this.f39830y + this.f39828w, this.f39822c);
        float f14 = this.f39824f;
        float f15 = this.h;
        canvas.drawRect(f14, f15, f14 + this.d, f15 + this.f39823e, this.f39820a);
        int iDp = AndroidUtilities.dp(1.0f);
        float f16 = this.f39824f;
        float f17 = iDp;
        float f18 = iDp * 3;
        canvas.drawRect(f16 + f17, this.h + f17, f16 + f17 + AndroidUtilities.dp(20.0f), this.h + f18, this.f39821b);
        float f19 = this.f39824f;
        float f20 = this.h;
        canvas.drawRect(f19 + f17, f20 + f17, f19 + f18, f20 + f17 + AndroidUtilities.dp(20.0f), this.f39821b);
        float fDp = ((this.f39824f + this.d) - f17) - AndroidUtilities.dp(20.0f);
        float f21 = this.h;
        canvas.drawRect(fDp, f21 + f17, (this.f39824f + this.d) - f17, f21 + f18, this.f39821b);
        float f22 = this.f39824f;
        float f23 = this.d;
        float f24 = this.h;
        canvas.drawRect((f22 + f23) - f18, f24 + f17, (f22 + f23) - f17, f24 + f17 + AndroidUtilities.dp(20.0f), this.f39821b);
        canvas.drawRect(this.f39824f + f17, ((this.h + this.f39823e) - f17) - AndroidUtilities.dp(20.0f), this.f39824f + f18, (this.h + this.f39823e) - f17, this.f39821b);
        float f25 = this.f39824f;
        canvas.drawRect(f25 + f17, (this.h + this.f39823e) - f18, f25 + f17 + AndroidUtilities.dp(20.0f), (this.h + this.f39823e) - f17, this.f39821b);
        float fDp2 = ((this.f39824f + this.d) - f17) - AndroidUtilities.dp(20.0f);
        float f26 = this.h;
        float f27 = this.f39823e;
        canvas.drawRect(fDp2, (f26 + f27) - f18, (this.f39824f + this.d) - f17, (f26 + f27) - f17, this.f39821b);
        canvas.drawRect((this.f39824f + this.d) - f18, ((this.h + this.f39823e) - f17) - AndroidUtilities.dp(20.0f), (this.f39824f + this.d) - f17, (this.h + this.f39823e) - f17, this.f39821b);
        for (int i14 = 1; i14 < 3; i14++) {
            float f28 = this.f39824f;
            float f29 = this.d;
            float f30 = i14;
            float f31 = this.h;
            canvas.drawRect(((f29 / 3.0f) * f30) + f28, f31 + f17, s3.c.c(f29, 3.0f, f30, f28 + f17), (f31 + this.f39823e) - f17, this.f39821b);
            float f32 = this.f39824f;
            float f33 = this.h;
            float f34 = this.f39823e;
            canvas.drawRect(f32 + f17, s3.c.c(f34, 3.0f, f30, f33), this.d + (f32 - f17), ((f34 / 3.0f) * f30) + f33 + f17, this.f39821b);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mp0 mp0Var;
        Bitmap bitmap;
        super.onLayout(z10, i10, i11, i12, i13);
        this.A = (i12 - i10) - AndroidUtilities.dp(28.0f);
        int iDp = (i13 - i11) - AndroidUtilities.dp(28.0f);
        this.B = iDp;
        if (this.A == 0 || iDp == 0 || (bitmap = (mp0Var = this.D).f40575a) == null) {
            return;
        }
        float f10 = this.f39824f - this.f39829x;
        float f11 = this.v;
        float f12 = f10 / f11;
        float f13 = this.h - this.f39830y;
        float f14 = this.f39828w;
        float f15 = f13 / f14;
        float f16 = this.d / f11;
        float f17 = this.f39823e / f14;
        float width = bitmap.getWidth();
        float height = mp0Var.f40575a.getHeight();
        int i14 = this.A;
        float f18 = i14 / width;
        int i15 = this.B;
        float f19 = i15 / height;
        if (f18 > f19) {
            this.f39828w = i15;
            this.v = (int) Math.ceil(width * f19);
        } else {
            this.v = i14;
            this.f39828w = (int) Math.ceil(height * f18);
        }
        this.f39829x = AndroidUtilities.dp(14.0f) + ((this.A - this.v) / 2);
        int iDp2 = AndroidUtilities.dp(14.0f) + ((this.B - this.f39828w) / 2);
        this.f39830y = iDp2;
        if (this.f39824f != -1.0f || this.h != -1.0f) {
            float f20 = this.v;
            this.f39824f = (f12 * f20) + this.f39829x;
            float f21 = this.f39828w;
            this.h = (f15 * f21) + iDp2;
            this.d = f16 * f20;
            this.f39823e = f17 * f21;
        } else if (this.C) {
            this.h = iDp2;
            this.f39824f = this.f39829x;
            this.d = this.v;
            this.f39823e = this.f39828w;
        } else {
            int i16 = this.v;
            int i17 = this.f39828w;
            if (i16 > i17) {
                this.h = iDp2;
                this.f39824f = AndroidUtilities.dp(14.0f) + ((this.A - i17) / 2);
                float f22 = this.f39828w;
                this.d = f22;
                this.f39823e = f22;
            } else {
                this.f39824f = this.f39829x;
                this.h = AndroidUtilities.dp(14.0f) + ((this.B - i16) / 2);
                float f23 = this.v;
                this.d = f23;
                this.f39823e = f23;
            }
        }
        invalidate();
    }
}
