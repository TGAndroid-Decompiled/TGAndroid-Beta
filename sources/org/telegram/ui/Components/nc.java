package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class nc extends Drawable {
    public final int f36287a;
    public final Object f36288b;
    public final Object f36289c;

    public nc(int i7, Object obj, Object obj2) {
        this.f36287a = i7;
        this.f36288b = obj;
        this.f36289c = obj2;
    }

    @Override
    public final void draw(Canvas canvas) {
        float offsetY;
        switch (this.f36287a) {
            case 0:
                oc ocVar = (oc) this.f36289c;
                if (ocVar.f36569c > 1) {
                    ocVar.c(canvas, ocVar.f36579o);
                    return;
                } else {
                    ocVar.c(canvas, (Paint) this.f36288b);
                    return;
                }
            case 1:
                Paint paint = (Paint) this.f36288b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f36289c;
                if (chatActivityEnterView.U0 != null) {
                    paint.setAlpha(Math.round(chatActivityEnterView.C3 * 102.0f));
                    float width = chatActivityEnterView.getWidth();
                    float y10 = (chatActivityEnterView.U0.getY() - chatActivityEnterView.getHeight()) + org.telegram.ui.ActionBar.m6.f27979i3.getIntrinsicHeight();
                    we weVar = chatActivityEnterView.E0;
                    if (weVar == null) {
                        offsetY = 0.0f;
                    } else {
                        offsetY = weVar.getOffsetY();
                    }
                    canvas.drawRect(0.0f, 0.0f, width, y10 + offsetY, paint);
                    return;
                }
                return;
            case 2:
                Paint paint2 = (Paint) this.f36289c;
                canvas.drawRect(getBounds(), (Paint) this.f36288b);
                int L = org.telegram.messenger.g0.L(9.0f);
                int width2 = getBounds().width() / L;
                int height = getBounds().height() / L;
                int i7 = getBounds().left;
                int i10 = getBounds().top;
                int i11 = 0;
                int i12 = 0;
                while (i12 < width2) {
                    i12++;
                    float f10 = (L * i12) + i7;
                    canvas.drawLine(f10, i10, f10, getBounds().height() + i10, paint2);
                }
                while (i11 < height) {
                    i11++;
                    float f11 = (L * i11) + i10;
                    canvas.drawLine(i7, f11, getBounds().width() + i7, f11, paint2);
                }
                return;
            case 3:
                ((my0) this.f36288b).c(getBounds().centerX() - (((my0) this.f36288b).f36133c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, (org.telegram.ui.ActionBar.h6) this.f36289c), canvas);
                return;
            default:
                ImageReceiver imageReceiver = (ImageReceiver) this.f36288b;
                imageReceiver.h(canvas, null);
                Drawable drawable = (Drawable) this.f36289c;
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                int A = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.M0, intrinsicWidth, 2.0f, imageReceiver.K0);
                int interpolation = (int) ((((imageReceiver.N0 / 2.0f) - intrinsicHeight) + imageReceiver.L0) - ((1.0f - wq.f40050k.getInterpolation(imageReceiver.f21202h1)) * org.telegram.messenger.g0.L(16.0f)));
                drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.f21202h1 * 5.0f) * 255.0f));
                drawable.setBounds(A, interpolation, intrinsicWidth + A, intrinsicHeight + interpolation);
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f36287a) {
            case 4:
                return (int) (((ImageReceiver) this.f36288b).getAlpha() * 255.0f);
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f36287a) {
            case 2:
                return 0;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f36287a) {
            case 2:
                return 0;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f36287a) {
            case 0:
                return -2;
            case 1:
                return -2;
            case 2:
                return 0;
            case 3:
                return -2;
            default:
                return 0;
        }
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f36287a) {
            case 4:
                ((ImageReceiver) this.f36288b).y0(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top, org.telegram.messenger.camera.q.w(2.0f, rect.left, rect.right - org.telegram.messenger.g0.L(2.0f)), org.telegram.messenger.camera.q.w(2.0f, rect.top, rect.bottom - org.telegram.messenger.g0.L(2.0f)));
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f36287a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            default:
                ((ImageReceiver) this.f36288b).setAlpha(i7 / 255.0f);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f36287a;
    }

    public nc(boolean z9) {
        this.f36287a = 2;
        Paint paint = new Paint();
        this.f36288b = paint;
        Paint paint2 = new Paint();
        this.f36289c = paint2;
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        if (z9) {
            paint.setColor(-14865331);
            paint2.setColor(-15854042);
            return;
        }
        paint.setColor(-2172970);
        paint2.setColor(-3752002);
    }

    public nc(oc ocVar, Paint paint) {
        this.f36287a = 0;
        this.f36289c = ocVar;
        this.f36288b = paint;
    }

    public nc(ChatActivityEnterView chatActivityEnterView) {
        this.f36287a = 1;
        this.f36289c = chatActivityEnterView;
        Paint paint = new Paint();
        this.f36288b = paint;
        paint.setColor(0);
    }

    private final void a(int i7) {
    }

    private final void b(int i7) {
    }

    private final void c(int i7) {
    }

    private final void d(int i7) {
    }

    private final void e(ColorFilter colorFilter) {
    }

    private final void f(ColorFilter colorFilter) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(ColorFilter colorFilter) {
    }
}
