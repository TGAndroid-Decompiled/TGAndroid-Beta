package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class mc extends Drawable {
    public final int f36118a;
    public final Object f36119b;
    public final Object f36120c;

    public mc(int i3, Object obj, Object obj2) {
        this.f36118a = i3;
        this.f36119b = obj;
        this.f36120c = obj2;
    }

    @Override
    public final void draw(Canvas canvas) {
        float offsetY;
        switch (this.f36118a) {
            case 0:
                nc ncVar = (nc) this.f36120c;
                if (ncVar.f36435c > 1) {
                    ncVar.c(canvas, ncVar.f36445o);
                    return;
                } else {
                    ncVar.c(canvas, (Paint) this.f36119b);
                    return;
                }
            case 1:
                Paint paint = (Paint) this.f36119b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f36120c;
                if (chatActivityEnterView.V0 != null) {
                    paint.setAlpha(Math.round(chatActivityEnterView.D3 * 102.0f));
                    float width = chatActivityEnterView.getWidth();
                    float y9 = (chatActivityEnterView.V0.getY() - chatActivityEnterView.getHeight()) + org.telegram.ui.ActionBar.k6.i3.getIntrinsicHeight();
                    ve veVar = chatActivityEnterView.F0;
                    if (veVar == null) {
                        offsetY = 0.0f;
                    } else {
                        offsetY = veVar.getOffsetY();
                    }
                    canvas.drawRect(0.0f, 0.0f, width, y9 + offsetY, paint);
                    return;
                }
                return;
            case 2:
                Paint paint2 = (Paint) this.f36120c;
                canvas.drawRect(getBounds(), (Paint) this.f36119b);
                int L = org.telegram.messenger.g0.L(9.0f);
                int width2 = getBounds().width() / L;
                int height = getBounds().height() / L;
                int i3 = getBounds().left;
                int i10 = getBounds().top;
                int i11 = 0;
                int i12 = 0;
                while (i12 < width2) {
                    i12++;
                    float f10 = (L * i12) + i3;
                    canvas.drawLine(f10, i10, f10, getBounds().height() + i10, paint2);
                }
                while (i11 < height) {
                    i11++;
                    float f11 = (L * i11) + i10;
                    canvas.drawLine(i3, f11, getBounds().width() + i3, f11, paint2);
                }
                return;
            case 3:
                ((ly0) this.f36119b).c(getBounds().centerX() - (((ly0) this.f36119b).f35918c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, (org.telegram.ui.ActionBar.e6) this.f36120c), canvas);
                return;
            case 4:
                ImageReceiver imageReceiver = (ImageReceiver) this.f36119b;
                imageReceiver.h(canvas, null);
                Drawable drawable = (Drawable) this.f36120c;
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                int z10 = (int) com.google.android.recaptcha.internal.a.z(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - xq.f40456k.getInterpolation(imageReceiver.f21249i1)) * org.telegram.messenger.g0.L(16.0f)));
                drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.f21249i1 * 5.0f) * 255.0f));
                drawable.setBounds(z10, interpolation, intrinsicWidth + z10, intrinsicHeight + interpolation);
                drawable.draw(canvas);
                return;
            default:
                Bitmap bitmap = (Bitmap) this.f36119b;
                if (!bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, (Rect) null, (Rect) this.f36120c, (Paint) null);
                    return;
                }
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f36118a) {
            case 4:
                return (int) (((ImageReceiver) this.f36119b).getAlpha() * 255.0f);
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f36118a) {
            case 2:
                return 0;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f36118a) {
            case 2:
                return 0;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f36118a) {
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

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f36118a) {
            case 4:
                ((ImageReceiver) this.f36119b).y0(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top, org.telegram.messenger.camera.q.w(2.0f, rect.left, rect.right - org.telegram.messenger.g0.L(2.0f)), org.telegram.messenger.camera.q.w(2.0f, rect.top, rect.bottom - org.telegram.messenger.g0.L(2.0f)));
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i3) {
        switch (this.f36118a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            case 4:
                ((ImageReceiver) this.f36119b).setAlpha(i3 / 255.0f);
                return;
            default:
                return;
        }
    }

    @Override
    public void setBounds(int i3, int i10, int i11, int i12) {
        switch (this.f36118a) {
            case 5:
                super.setBounds(i3, i10, i11, i12);
                Bitmap bitmap = (Bitmap) this.f36119b;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int i13 = i11 - i3;
                    int i14 = i12 - i10;
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    float min = Math.min(i13 / width, i14 / height);
                    int round = Math.round(width * min);
                    int round2 = Math.round(height * min);
                    int i15 = i3 + ((i13 - round) / 2);
                    int i16 = i10 + ((i14 - round2) / 2);
                    ((Rect) this.f36120c).set(i15, i16, round + i15, round2 + i16);
                    return;
                }
                return;
            default:
                super.setBounds(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i3 = this.f36118a;
    }

    public mc(boolean z10) {
        this.f36118a = 2;
        Paint paint = new Paint();
        this.f36119b = paint;
        Paint paint2 = new Paint();
        this.f36120c = paint2;
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        if (z10) {
            paint.setColor(-14865331);
            paint2.setColor(-15854042);
            return;
        }
        paint.setColor(-2172970);
        paint2.setColor(-3752002);
    }

    public mc(nc ncVar, Paint paint) {
        this.f36118a = 0;
        this.f36120c = ncVar;
        this.f36119b = paint;
    }

    public mc(Bitmap bitmap) {
        this.f36118a = 5;
        this.f36120c = new Rect();
        this.f36119b = bitmap;
    }

    public mc(ChatActivityEnterView chatActivityEnterView) {
        this.f36118a = 1;
        this.f36120c = chatActivityEnterView;
        Paint paint = new Paint();
        this.f36119b = paint;
        paint.setColor(0);
    }

    private final void a(int i3) {
    }

    private final void b(int i3) {
    }

    private final void c(int i3) {
    }

    private final void d(int i3) {
    }

    private final void e(int i3) {
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
}
