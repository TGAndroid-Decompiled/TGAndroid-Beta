package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class jc extends Drawable {
    public final int f35951a;
    public final Object f35952b;
    public final Object f35953c;

    public jc(int i7, Object obj, Object obj2) {
        this.f35951a = i7;
        this.f35952b = obj;
        this.f35953c = obj2;
    }

    @Override
    public final void draw(Canvas canvas) {
        float offsetY;
        switch (this.f35951a) {
            case 0:
                kc kcVar = (kc) this.f35953c;
                if (kcVar.f36362c > 1) {
                    kcVar.c(canvas, kcVar.f36372o);
                    return;
                } else {
                    kcVar.c(canvas, (Paint) this.f35952b);
                    return;
                }
            case 1:
                Paint paint = (Paint) this.f35952b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f35953c;
                if (chatActivityEnterView.V0 != null) {
                    paint.setAlpha(Math.round(chatActivityEnterView.f32230k4 * 102.0f));
                    float width = chatActivityEnterView.getWidth();
                    float y10 = (chatActivityEnterView.V0.getY() - chatActivityEnterView.getHeight()) + org.telegram.ui.ActionBar.j6.f28938i3.getIntrinsicHeight();
                    xe xeVar = chatActivityEnterView.F0;
                    if (xeVar == null) {
                        offsetY = 0.0f;
                    } else {
                        offsetY = xeVar.getOffsetY();
                    }
                    canvas.drawRect(0.0f, 0.0f, width, y10 + offsetY, paint);
                    return;
                }
                return;
            case 2:
                Paint paint2 = (Paint) this.f35953c;
                canvas.drawRect(getBounds(), (Paint) this.f35952b);
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
                ((oy0) this.f35952b).c(getBounds().centerX() - (((oy0) this.f35952b).f38103c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, (org.telegram.ui.ActionBar.e6) this.f35953c), canvas);
                return;
            default:
                ImageReceiver imageReceiver = (ImageReceiver) this.f35952b;
                imageReceiver.h(canvas, null);
                Drawable drawable = (Drawable) this.f35953c;
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                int A = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - er.f34423k.getInterpolation(imageReceiver.f22278i1)) * org.telegram.messenger.g0.L(16.0f)));
                drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.f22278i1 * 5.0f) * 255.0f));
                drawable.setBounds(A, interpolation, intrinsicWidth + A, intrinsicHeight + interpolation);
                drawable.draw(canvas);
                return;
        }
    }

    @Override
    public int getAlpha() {
        switch (this.f35951a) {
            case 4:
                return (int) (((ImageReceiver) this.f35952b).getAlpha() * 255.0f);
            default:
                return super.getAlpha();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f35951a) {
            case 2:
                return 0;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f35951a) {
            case 2:
                return 0;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f35951a) {
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
        switch (this.f35951a) {
            case 4:
                ((ImageReceiver) this.f35952b).y0(org.telegram.messenger.g0.L(2.0f) + rect.left, org.telegram.messenger.g0.L(2.0f) + rect.top, org.telegram.messenger.i20.w(2.0f, rect.left, rect.right - org.telegram.messenger.g0.L(2.0f)), org.telegram.messenger.i20.w(2.0f, rect.top, rect.bottom - org.telegram.messenger.g0.L(2.0f)));
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i7) {
        switch (this.f35951a) {
            case 0:
            case 1:
            case 2:
            case 3:
                return;
            default:
                ((ImageReceiver) this.f35952b).setAlpha(i7 / 255.0f);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f35951a;
    }

    public jc(boolean z10) {
        this.f35951a = 2;
        Paint paint = new Paint();
        this.f35952b = paint;
        Paint paint2 = new Paint();
        this.f35953c = paint2;
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        if (z10) {
            paint.setColor(-14865331);
            paint2.setColor(-15854042);
            return;
        }
        paint.setColor(-2172970);
        paint2.setColor(-3752002);
    }

    public jc(kc kcVar, Paint paint) {
        this.f35951a = 0;
        this.f35953c = kcVar;
        this.f35952b = paint;
    }

    public jc(ChatActivityEnterView chatActivityEnterView) {
        this.f35951a = 1;
        this.f35953c = chatActivityEnterView;
        Paint paint = new Paint();
        this.f35952b = paint;
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
