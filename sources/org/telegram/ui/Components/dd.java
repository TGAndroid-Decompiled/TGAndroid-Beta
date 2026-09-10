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
public final class dd extends Drawable {
    public final int f22362a;
    public final Object f22363b;
    public final Object f22364c;

    public dd(boolean z10) {
        this.f22362a = 2;
        Paint paint = new Paint();
        this.f22363b = paint;
        Paint paint2 = new Paint();
        this.f22364c = paint2;
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
        switch (this.f22362a) {
            case 0:
                ed edVar = (ed) this.f22364c;
                if (edVar.f22674c > 1) {
                    edVar.c(canvas, edVar.f22683o);
                    return;
                } else {
                    edVar.c(canvas, (Paint) this.f22363b);
                    return;
                }
            case 1:
                Paint paint = (Paint) this.f22363b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f22364c;
                if (chatActivityEnterView.U0 != null) {
                    paint.setAlpha(Math.round(chatActivityEnterView.B3 * 102.0f));
                    float width = chatActivityEnterView.getWidth();
                    float y3 = (chatActivityEnterView.U0.getY() - chatActivityEnterView.getHeight()) + org.telegram.ui.ActionBar.j6.f18014i3.getIntrinsicHeight();
                    rf rfVar = chatActivityEnterView.E0;
                    if (rfVar == null) {
                        offsetY = 0.0f;
                    } else {
                        offsetY = rfVar.getOffsetY();
                    }
                    canvas.drawRect(0.0f, 0.0f, width, y3 + offsetY, paint);
                    return;
                }
                return;
            case 2:
                Paint paint2 = (Paint) this.f22364c;
                canvas.drawRect(getBounds(), (Paint) this.f22363b);
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
                n6 n6Var = (n6) this.f22364c;
                Paint paint3 = (Paint) this.f22363b;
                if (paint3 != null) {
                    paint3.setStrokeWidth(AndroidUtilities.dpf2(1.6f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(((AndroidUtilities.dp(24.0f) - n6Var.d()) / 2.0f) - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(0.2f) + ((AndroidUtilities.dp(24.0f) - n6Var.e) / 2.0f), AndroidUtilities.dpf2(3.0f) + ((n6Var.d() + AndroidUtilities.dp(24.0f)) / 2.0f), (AndroidUtilities.dp(24.0f) + n6Var.e) / 2.0f);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint3);
                }
                n6Var.f25424a.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
                n6Var.setBounds(0, (int) ((AndroidUtilities.dp(24.0f) - n6Var.e) / 2.0f), AndroidUtilities.dp(24.0f), (int) ((AndroidUtilities.dp(24.0f) + n6Var.e) / 2.0f));
                n6Var.draw(canvas);
                return;
            case 4:
                ImageReceiver imageReceiver = (ImageReceiver) this.f22363b;
                imageReceiver.draw(canvas);
                Drawable drawable = (Drawable) this.f22364c;
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                int A = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - wr.f28823k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                drawable.setBounds(A, imageHeight, intrinsicWidth + A, intrinsicHeight + imageHeight);
                drawable.draw(canvas);
                return;
            default:
                Bitmap bitmap = (Bitmap) this.f22363b;
                if (!bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, (Rect) null, (Rect) this.f22364c, (Paint) null);
                    return;
                }
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f22362a) {
            case 4:
                return (int) (((ImageReceiver) this.f22363b).getAlpha() * 255.0f);
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f22362a) {
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
        switch (this.f22362a) {
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
        switch (this.f22362a) {
            case 0:
                return -2;
            case 1:
                return -2;
            case 2:
                return 0;
            case 3:
                return -2;
            case 4:
                return 0;
            default:
                return -3;
        }
    }

    public void l(float f7, boolean z10) {
        n6 n6Var = (n6) this.f22364c;
        String str = a(f7) + "X";
        if (z10 && TextUtils.equals(n6Var.f25428g, str)) {
            return;
        }
        n6Var.b();
        n6Var.q(str, z10, true);
        invalidateSelf();
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f22362a) {
            case 4:
                ((ImageReceiver) this.f22363b).setImageCoords(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, org.telegram.messenger.em.v(2.0f, rect.left, rect.right - AndroidUtilities.dp(2.0f)), org.telegram.messenger.em.v(2.0f, rect.top, rect.bottom - AndroidUtilities.dp(2.0f)));
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f22362a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                ((n6) this.f22364c).f25442w = i10;
                Paint paint = (Paint) this.f22363b;
                if (paint != null) {
                    paint.setAlpha(i10);
                    return;
                }
                return;
            case 4:
                ((ImageReceiver) this.f22363b).setAlpha(i10 / 255.0f);
                return;
            default:
                return;
        }
    }

    @Override
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.f22362a) {
            case 5:
                super.setBounds(i10, i11, i12, i13);
                Bitmap bitmap = (Bitmap) this.f22363b;
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
                    ((Rect) this.f22364c).set(i16, i17, round + i16, round2 + i17);
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
        int i10 = this.f22362a;
    }

    public dd() {
        this.f22362a = 3;
        hi.s0 s0Var = new hi.s0(this, 4);
        n6 n6Var = new n6(false, true, true, false);
        this.f22364c = n6Var;
        n6Var.setCallback(s0Var);
        n6Var.k(0.3f, 165L, wr.h);
        n6Var.f25425b = 1;
        n6Var.u(AndroidUtilities.bold());
        n6Var.t(AndroidUtilities.dp(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = n6Var.f25424a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.6f));
        Paint paint = new Paint(1);
        this.f22363b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public dd(ed edVar, Paint paint) {
        this.f22362a = 0;
        this.f22364c = edVar;
        this.f22363b = paint;
    }

    public dd(Bitmap bitmap) {
        this.f22362a = 5;
        this.f22364c = new Rect();
        this.f22363b = bitmap;
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

    public dd(ImageReceiver imageReceiver, Drawable drawable) {
        this.f22362a = 4;
        this.f22363b = imageReceiver;
        this.f22364c = drawable;
    }

    public dd(ChatActivityEnterView chatActivityEnterView) {
        this.f22362a = 1;
        this.f22364c = chatActivityEnterView;
        Paint paint = new Paint();
        this.f22363b = paint;
        paint.setColor(0);
    }
}
