package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class fd extends Drawable {
    public final int f26014a;
    public final Object f26015b;
    public final Object f26016c;

    public fd(boolean z10) {
        this.f26014a = 2;
        Paint paint = new Paint();
        this.f26015b = paint;
        Paint paint2 = new Paint();
        this.f26016c = paint2;
        paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (z10) {
            paint.setColor(-14865331);
            paint2.setColor(-15854042);
            return;
        }
        paint.setColor(-2172970);
        paint2.setColor(-3752002);
    }

    public static String a(float f7) {
        Math.abs(f7 - 0.25f);
        float round = Math.round(f7 * 10.0f) / 10.0f;
        long j3 = round;
        if (round == ((float) j3)) {
            return a4.a.o(j3, "");
        }
        return "" + round;
    }

    @Override
    public final void draw(Canvas canvas) {
        float offsetY;
        switch (this.f26014a) {
            case 0:
                gd gdVar = (gd) this.f26016c;
                if (gdVar.f26349c > 1) {
                    gdVar.c(canvas, gdVar.f26359o);
                    return;
                } else {
                    gdVar.c(canvas, (Paint) this.f26015b);
                    return;
                }
            case 1:
                Paint paint = (Paint) this.f26015b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f26016c;
                if (chatActivityEnterView.U0 != null) {
                    paint.setAlpha(Math.round(chatActivityEnterView.B3 * 102.0f));
                    float width = chatActivityEnterView.getWidth();
                    float y3 = (chatActivityEnterView.U0.getY() - chatActivityEnterView.getHeight()) + org.telegram.ui.ActionBar.j6.f20750i3.getIntrinsicHeight();
                    qf qfVar = chatActivityEnterView.E0;
                    if (qfVar == null) {
                        offsetY = 0.0f;
                    } else {
                        offsetY = qfVar.getOffsetY();
                    }
                    canvas.drawRect(0.0f, 0.0f, width, y3 + offsetY, paint);
                    return;
                }
                return;
            case 2:
                Paint paint2 = (Paint) this.f26016c;
                canvas.drawRect(getBounds(), (Paint) this.f26015b);
                int dp = AndroidUtilities.dp(9.0f);
                int width2 = getBounds().width() / dp;
                int height = getBounds().height() / dp;
                int i10 = getBounds().left;
                int i11 = getBounds().top;
                int i12 = 0;
                int i13 = 0;
                while (i13 < width2) {
                    int i14 = i13 + 1;
                    float f7 = (dp * i14) + i10;
                    canvas.drawLine(f7, i11, f7, getBounds().height() + i11, paint2);
                    i13 = i14;
                }
                while (i12 < height) {
                    i12++;
                    float f10 = (dp * i12) + i11;
                    canvas.drawLine(i10, f10, getBounds().width() + i10, f10, paint2);
                }
                return;
            case 3:
                p6 p6Var = (p6) this.f26016c;
                Paint paint3 = (Paint) this.f26015b;
                if (paint3 != null) {
                    paint3.setStrokeWidth(AndroidUtilities.dpf2(1.6f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(((AndroidUtilities.dp(24.0f) - p6Var.d()) / 2.0f) - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(0.2f) + ((AndroidUtilities.dp(24.0f) - p6Var.f29287e) / 2.0f), AndroidUtilities.dpf2(3.0f) + ((p6Var.d() + AndroidUtilities.dp(24.0f)) / 2.0f), (AndroidUtilities.dp(24.0f) + p6Var.f29287e) / 2.0f);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint3);
                }
                p6Var.f29284a.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
                p6Var.setBounds(0, (int) ((AndroidUtilities.dp(24.0f) - p6Var.f29287e) / 2.0f), AndroidUtilities.dp(24.0f), (int) ((AndroidUtilities.dp(24.0f) + p6Var.f29287e) / 2.0f));
                p6Var.draw(canvas);
                return;
            case 4:
                Bitmap bitmap = (Bitmap) this.f26015b;
                if (!bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, (Rect) null, (Rect) this.f26016c, (Paint) null);
                    return;
                }
                return;
            default:
                ImageReceiver imageReceiver = (ImageReceiver) this.f26015b;
                imageReceiver.draw(canvas);
                Drawable drawable = (Drawable) this.f26016c;
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                int A = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - pr.f29470k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                drawable.setBounds(A, imageHeight, intrinsicWidth + A, intrinsicHeight + imageHeight);
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f26014a) {
            case 5:
                return (int) (((ImageReceiver) this.f26015b).getAlpha() * 255.0f);
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f26014a) {
            case 2:
                return 0;
            case 3:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f26014a) {
            case 2:
                return 0;
            case 3:
                return AndroidUtilities.dp(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f26014a) {
            case 0:
                return -2;
            case 1:
                return -2;
            case 2:
                return 0;
            case 3:
                return -2;
            case 4:
                return -3;
            default:
                return 0;
        }
    }

    public void l(float f7, boolean z10) {
        p6 p6Var = (p6) this.f26016c;
        String str = a(f7) + "X";
        if (z10 && TextUtils.equals(p6Var.f29289g, str)) {
            return;
        }
        p6Var.b();
        p6Var.q(str, z10, true);
        invalidateSelf();
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f26014a) {
            case 5:
                ((ImageReceiver) this.f26015b).setImageCoords(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, org.telegram.messenger.wl.v(2.0f, rect.left, rect.right - AndroidUtilities.dp(2.0f)), org.telegram.messenger.wl.v(2.0f, rect.top, rect.bottom - AndroidUtilities.dp(2.0f)));
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f26014a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                ((p6) this.f26016c).f29303w = i10;
                Paint paint = (Paint) this.f26015b;
                if (paint != null) {
                    paint.setAlpha(i10);
                    return;
                }
                return;
            case 4:
                return;
            default:
                ((ImageReceiver) this.f26015b).setAlpha(i10 / 255.0f);
                return;
        }
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f26014a) {
            case 4:
                super.setBounds(i10, i11, i12, i13);
                Bitmap bitmap = (Bitmap) this.f26015b;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int i14 = i12 - i10;
                    int i15 = i13 - i11;
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    float min = Math.min(i14 / width, i15 / height);
                    int round = Math.round(width * min);
                    int round2 = Math.round(height * min);
                    int i16 = i10 + ((i14 - round) / 2);
                    int i17 = i11 + ((i15 - round2) / 2);
                    ((Rect) this.f26016c).set(i16, i17, round + i16, round2 + i17);
                    return;
                }
                return;
            default:
                super.setBounds(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f26014a;
    }

    public fd() {
        this.f26014a = 3;
        ah.g1 g1Var = new ah.g1(this, 5);
        p6 p6Var = new p6(false, true, true, false);
        this.f26016c = p6Var;
        p6Var.setCallback(g1Var);
        p6Var.k(0.3f, 165L, pr.h);
        p6Var.f29285b = 1;
        p6Var.u(AndroidUtilities.bold());
        p6Var.t(AndroidUtilities.dp(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = p6Var.f29284a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.6f));
        Paint paint = new Paint(1);
        this.f26015b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public fd(gd gdVar, Paint paint) {
        this.f26014a = 0;
        this.f26016c = gdVar;
        this.f26015b = paint;
    }

    public fd(Bitmap bitmap) {
        this.f26014a = 4;
        this.f26016c = new Rect();
        this.f26015b = bitmap;
    }

    private final void b(int i10) {
    }

    private final void c(int i10) {
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(ColorFilter colorFilter) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(ColorFilter colorFilter) {
    }

    private final void j(ColorFilter colorFilter) {
    }

    private final void k(ColorFilter colorFilter) {
    }

    public fd(ImageReceiver imageReceiver, Drawable drawable) {
        this.f26014a = 5;
        this.f26015b = imageReceiver;
        this.f26016c = drawable;
    }

    public fd(ChatActivityEnterView chatActivityEnterView) {
        this.f26014a = 1;
        this.f26016c = chatActivityEnterView;
        Paint paint = new Paint();
        this.f26015b = paint;
        paint.setColor(0);
    }
}
