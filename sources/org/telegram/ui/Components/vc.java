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
public final class vc extends Drawable {
    public final int f33342a;
    public final Object f33343b;
    public final Object f33344c;

    public vc(boolean z10) {
        this.f33342a = 2;
        Paint paint = new Paint();
        this.f33343b = paint;
        Paint paint2 = new Paint();
        this.f33344c = paint2;
        paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
        if (z10) {
            paint.setColor(-14865331);
            paint2.setColor(-15854042);
            return;
        }
        paint.setColor(-2172970);
        paint2.setColor(-3752002);
    }

    public static String a(float f10) {
        Math.abs(f10 - 0.25f);
        float round = Math.round(f10 * 10.0f) / 10.0f;
        long j10 = round;
        if (round == ((float) j10)) {
            return aa.d.m(j10, "");
        }
        return "" + round;
    }

    @Override
    public final void draw(Canvas canvas) {
        float offsetY;
        switch (this.f33342a) {
            case 0:
                wc wcVar = (wc) this.f33344c;
                if (wcVar.f34189c > 1) {
                    wcVar.c(canvas, wcVar.f34199o);
                    return;
                } else {
                    wcVar.c(canvas, (Paint) this.f33343b);
                    return;
                }
            case 1:
                Paint paint = (Paint) this.f33343b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f33344c;
                if (chatActivityEnterView.Q0 != null) {
                    paint.setAlpha(Math.round(chatActivityEnterView.f26206x3 * 102.0f));
                    float width = chatActivityEnterView.getWidth();
                    float y10 = (chatActivityEnterView.Q0.getY() - chatActivityEnterView.getHeight()) + org.telegram.ui.ActionBar.f6.f23089i3.getIntrinsicHeight();
                    ff ffVar = chatActivityEnterView.A0;
                    if (ffVar == null) {
                        offsetY = 0.0f;
                    } else {
                        offsetY = ffVar.getOffsetY();
                    }
                    canvas.drawRect(0.0f, 0.0f, width, y10 + offsetY, paint);
                    return;
                }
                return;
            case 2:
                Paint paint2 = (Paint) this.f33344c;
                canvas.drawRect(getBounds(), (Paint) this.f33343b);
                int dp = AndroidUtilities.dp(9.0f);
                int width2 = getBounds().width() / dp;
                int height = getBounds().height() / dp;
                int i9 = getBounds().left;
                int i10 = getBounds().top;
                int i11 = 0;
                int i12 = 0;
                while (i12 < width2) {
                    int i13 = i12 + 1;
                    float f10 = (dp * i13) + i9;
                    canvas.drawLine(f10, i10, f10, getBounds().height() + i10, paint2);
                    i12 = i13;
                }
                while (i11 < height) {
                    i11++;
                    float f11 = (dp * i11) + i10;
                    canvas.drawLine(i9, f11, getBounds().width() + i9, f11, paint2);
                }
                return;
            case 3:
                i6 i6Var = (i6) this.f33344c;
                Paint paint3 = (Paint) this.f33343b;
                if (paint3 != null) {
                    paint3.setStrokeWidth(AndroidUtilities.dpf2(1.6f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(((AndroidUtilities.dp(24.0f) - i6Var.d()) / 2.0f) - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(0.2f) + ((AndroidUtilities.dp(24.0f) - i6Var.f29335e) / 2.0f), AndroidUtilities.dpf2(3.0f) + ((i6Var.d() + AndroidUtilities.dp(24.0f)) / 2.0f), (AndroidUtilities.dp(24.0f) + i6Var.f29335e) / 2.0f);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint3);
                }
                i6Var.f29332a.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
                i6Var.setBounds(0, (int) ((AndroidUtilities.dp(24.0f) - i6Var.f29335e) / 2.0f), AndroidUtilities.dp(24.0f), (int) ((AndroidUtilities.dp(24.0f) + i6Var.f29335e) / 2.0f));
                i6Var.draw(canvas);
                return;
            case 4:
                Bitmap bitmap = (Bitmap) this.f33343b;
                if (!bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, (Rect) null, (Rect) this.f33344c, (Paint) null);
                    return;
                }
                return;
            default:
                ImageReceiver imageReceiver = (ImageReceiver) this.f33343b;
                imageReceiver.draw(canvas);
                Drawable drawable = (Drawable) this.f33344c;
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                int A = (int) e2.c.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - gr.f28848k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                drawable.setBounds(A, imageHeight, intrinsicWidth + A, intrinsicHeight + imageHeight);
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f33342a) {
            case 5:
                return (int) (((ImageReceiver) this.f33343b).getAlpha() * 255.0f);
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f33342a) {
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
        switch (this.f33342a) {
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
        switch (this.f33342a) {
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

    public void l(float f10, boolean z10) {
        i6 i6Var = (i6) this.f33344c;
        String str = a(f10) + "X";
        if (z10 && TextUtils.equals(i6Var.f29337g, str)) {
            return;
        }
        i6Var.b();
        i6Var.q(str, z10, true);
        invalidateSelf();
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f33342a) {
            case 5:
                ((ImageReceiver) this.f33343b).setImageCoords(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, org.telegram.messenger.ll.w(2.0f, rect.left, rect.right - AndroidUtilities.dp(2.0f)), org.telegram.messenger.ll.w(2.0f, rect.top, rect.bottom - AndroidUtilities.dp(2.0f)));
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i9) {
        switch (this.f33342a) {
            case 0:
            case 1:
            case 2:
                return;
            case 3:
                ((i6) this.f33344c).f29351w = i9;
                Paint paint = (Paint) this.f33343b;
                if (paint != null) {
                    paint.setAlpha(i9);
                    return;
                }
                return;
            case 4:
                return;
            default:
                ((ImageReceiver) this.f33343b).setAlpha(i9 / 255.0f);
                return;
        }
    }

    @Override
    public void setBounds(int i9, int i10, int i11, int i12) {
        switch (this.f33342a) {
            case 4:
                super.setBounds(i9, i10, i11, i12);
                Bitmap bitmap = (Bitmap) this.f33343b;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int i13 = i11 - i9;
                    int i14 = i12 - i10;
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    float min = Math.min(i13 / width, i14 / height);
                    int round = Math.round(width * min);
                    int round2 = Math.round(height * min);
                    int i15 = i9 + ((i13 - round) / 2);
                    int i16 = i10 + ((i14 - round2) / 2);
                    ((Rect) this.f33344c).set(i15, i16, round + i15, round2 + i16);
                    return;
                }
                return;
            default:
                super.setBounds(i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i9 = this.f33342a;
    }

    public vc() {
        this.f33342a = 3;
        eg.a aVar = new eg.a(this, 8);
        i6 i6Var = new i6(false, true, true, false);
        this.f33344c = i6Var;
        i6Var.setCallback(aVar);
        i6Var.k(0.3f, 165L, gr.h);
        i6Var.f29333b = 1;
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(10.0f));
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        TextPaint textPaint = i6Var.f29332a;
        textPaint.setStyle(style);
        textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.6f));
        Paint paint = new Paint(1);
        this.f33343b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public vc(wc wcVar, Paint paint) {
        this.f33342a = 0;
        this.f33344c = wcVar;
        this.f33343b = paint;
    }

    public vc(Bitmap bitmap) {
        this.f33342a = 4;
        this.f33344c = new Rect();
        this.f33343b = bitmap;
    }

    private final void b(int i9) {
    }

    private final void c(int i9) {
    }

    private final void d(int i9) {
    }

    private final void e(int i9) {
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

    public vc(ImageReceiver imageReceiver, Drawable drawable) {
        this.f33342a = 5;
        this.f33343b = imageReceiver;
        this.f33344c = drawable;
    }

    public vc(ChatActivityEnterView chatActivityEnterView) {
        this.f33342a = 1;
        this.f33344c = chatActivityEnterView;
        Paint paint = new Paint();
        this.f33343b = paint;
        paint.setColor(0);
    }
}
