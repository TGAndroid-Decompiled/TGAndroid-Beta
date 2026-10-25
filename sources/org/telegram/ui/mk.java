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
    public final int f41568a;
    public Object f41569b;

    public mk(Object obj, Context context, int i10) {
        super(context);
        this.f41568a = i10;
        this.f41569b = obj;
    }

    public static void a(mk mkVar, Canvas canvas) {
        super.onDraw(canvas);
    }

    public void b(int i10) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f41569b;
        if (fragmentContextView.N != i10) {
            org.telegram.ui.Components.b20 b20Var = fragmentContextView.d;
            b20Var.setPadding(b20Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.N) + i10, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.N = i10;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f41568a) {
            case 1:
                super.draw(canvas);
                int dp = AndroidUtilities.dp(1.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f7 = dp;
                rectF.set(f7, f7, getWidth() - dp, getHeight() - dp);
                ((FragmentContextView) this.f41569b).O.a(AndroidUtilities.dp(16.0f), canvas, rectF, this);
                return;
            case 2:
            default:
                super.draw(canvas);
                return;
            case 3:
                super.draw(canvas);
                o71 o71Var = (o71) this.f41569b;
                org.telegram.ui.Components.voip.h hVar = o71Var.f42113c;
                if (hVar.f33818g <= 1.0f) {
                    SessionsActivity sessionsActivity = o71Var.f42114f;
                    if (sessionsActivity.V && sessionsActivity.W) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        hVar.f33817f = getMeasuredWidth();
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
        switch (this.f41568a) {
            case 0:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f41569b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f41569b = hVar;
                    hVar.f33821k = false;
                    hVar.f33823m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f41569b).f33817f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f41569b).a(AndroidUtilities.dp(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 4:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f41569b;
                paint.setColor(getCurrentTextColor());
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                return;
            case 6:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f41569b;
                float d = w5Var.f37427g0.d(w5Var.f37424e0, false);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                w5Var.c(d, new org.telegram.ui.Wallet.n2(paint2, 3), new zc1(26, this, canvas));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41568a) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    ((ph1) this.f41569b).G();
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
        switch (this.f41568a) {
            case 1:
                super.onMeasure(i10, i11);
                b(getMeasuredWidth());
                return;
            case 2:
                super.onMeasure(i10, i11);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.d51) this.f41569b).f27399b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 7:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((org.telegram.ui.Wallet.i9) this.f41569b).X));
                return;
            case 8:
                super.onMeasure(i10, i11);
                ((org.telegram.ui.web.x1) this.f41569b).f45451c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f41568a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ((FragmentContextView) this.f41569b).O.f33817f = getWidth();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f41568a) {
            case 1:
                super.setVisibility(i10);
                if (i10 != 0) {
                    b(0);
                    ((FragmentContextView) this.f41569b).N = 0;
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
        this.f41568a = 4;
        this.f41569b = paint;
    }

    public mk(Context context) {
        super(context);
        this.f41568a = 0;
    }
}
