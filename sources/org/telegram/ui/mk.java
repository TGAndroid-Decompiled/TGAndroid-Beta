package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.FragmentContextView;
public final class mk extends TextView {
    public final int f39204a;
    public Object f39205b;

    public mk(Object obj, Context context, int i10) {
        super(context);
        this.f39204a = i10;
        this.f39205b = obj;
    }

    public void b(int i10) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f39205b;
        if (fragmentContextView.N != i10) {
            org.telegram.ui.Components.z10 z10Var = fragmentContextView.d;
            z10Var.setPadding(z10Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.N) + i10, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.N = i10;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f39204a) {
            case 1:
                super.draw(canvas);
                int dp = AndroidUtilities.dp(1.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = dp;
                rectF.set(f7, f7, getWidth() - dp, getHeight() - dp);
                ((FragmentContextView) this.f39205b).O.a(AndroidUtilities.dp(16.0f), canvas, rectF, this);
                return;
            case 2:
            default:
                super.draw(canvas);
                return;
            case 3:
                super.draw(canvas);
                k71 k71Var = (k71) this.f39205b;
                org.telegram.ui.Components.voip.h hVar = k71Var.f38412c;
                if (hVar.f31468g <= 1.0f) {
                    SessionsActivity sessionsActivity = k71Var.d;
                    if (sessionsActivity.W && sessionsActivity.X) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        hVar.f31467f = getMeasuredWidth();
                        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF2, null);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f39204a) {
            case 0:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f39205b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f39205b = hVar;
                    hVar.f31471k = false;
                    hVar.f31473m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f39205b).f31467f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f39205b).a(AndroidUtilities.dp(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 4:
                super.onDraw(canvas);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), (Paint) this.f39205b);
                return;
            case 6:
                org.telegram.ui.Wallet.v5 v5Var = (org.telegram.ui.Wallet.v5) this.f39205b;
                float d = v5Var.f34981k0.d(v5Var.f34979i0, false);
                TextPaint paint = getPaint();
                Objects.requireNonNull(paint);
                v5Var.d(d, true, new org.telegram.ui.Wallet.o2(paint, 3), new org.telegram.ui.Wallet.t3(6, this, canvas));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f39204a) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    ((jh1) this.f39205b).G();
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f39204a) {
            case 1:
                super.onMeasure(i10, i11);
                b(getMeasuredWidth());
                return;
            case 2:
                super.onMeasure(i10, i11);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.p41) this.f39205b).f29171b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 7:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((org.telegram.ui.Wallet.l9) this.f39205b).U));
                return;
            case 8:
                super.onMeasure(i10, i11);
                ((org.telegram.ui.web.w1) this.f39205b).f42792c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f39204a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ((FragmentContextView) this.f39205b).O.f31467f = getWidth();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f39204a) {
            case 1:
                super.setVisibility(i10);
                if (i10 != 0) {
                    b(0);
                    ((FragmentContextView) this.f39205b).N = 0;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public mk(Activity activity, Paint paint) {
        super(activity);
        this.f39204a = 4;
        this.f39205b = paint;
    }

    public mk(Context context) {
        super(context);
        this.f39204a = 0;
    }
}
