package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.e00;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.Wallet.m9;
import org.telegram.ui.js;
import org.telegram.ui.ma1;
import org.telegram.ui.p21;
import org.telegram.ui.zb1;
public final class k2 extends TextView {
    public final int f27762a;
    public Object f27763b;

    public k2(int i3, Context context, Object obj) {
        super(context);
        this.f27762a = i3;
        this.f27763b = obj;
    }

    public static void a(k2 k2Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    public void b(int i3) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f27763b;
        if (fragmentContextView.O != i3) {
            e00 e00Var = fragmentContextView.d;
            e00Var.setPadding(e00Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.O) + i3, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.O = i3;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f27762a) {
            case 2:
                super.draw(canvas);
                int L = org.telegram.messenger.g0.L(1.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = L;
                rectF.set(f10, f10, getWidth() - L, getHeight() - L);
                ((FragmentContextView) this.f27763b).P.a(org.telegram.messenger.g0.L(16.0f), canvas, rectF, this);
                return;
            case 6:
                super.draw(canvas);
                p21 p21Var = (p21) this.f27763b;
                org.telegram.ui.Components.voip.g gVar = p21Var.f48427c;
                if (gVar.f39350g <= 1.0f) {
                    SessionsActivity sessionsActivity = p21Var.f48429f;
                    if (sessionsActivity.W && sessionsActivity.X) {
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        gVar.f39349f = getMeasuredWidth();
                        gVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF2, null);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f27762a) {
            case 5:
                super.onAttachedToWindow();
                hs.e().c((js) this.f27763b, 259);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f27762a) {
            case 5:
                super.onDetachedFromWindow();
                hs.e().n((js) this.f27763b, 259);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f27762a) {
            case 1:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.g) this.f27763b) == null) {
                    org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
                    this.f27763b = gVar;
                    gVar.f39353k = false;
                    gVar.f39355m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.g) this.f27763b).f39349f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.g) this.f27763b).a(org.telegram.messenger.g0.L(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f27763b;
                paint.setColor(getCurrentTextColor());
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                return;
            case 9:
                org.telegram.ui.Wallet.f6 f6Var = (org.telegram.ui.Wallet.f6) this.f27763b;
                float e10 = f6Var.f42534h0.e(false, f6Var.f42532f0);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                f6Var.c(e10, new org.telegram.ui.Wallet.c3(paint2, 3), new ma1(19, this, canvas));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f27762a) {
            case 8:
                super.onLayout(z10, i3, i10, i11, i12);
                if (z10) {
                    ((zb1) this.f27763b).G();
                    return;
                }
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f27762a) {
            case 0:
                super.onMeasure(i3, i10);
                t2 t2Var = (t2) this.f27763b;
                if (t2Var.R) {
                    int measuredHeight = getMeasuredHeight();
                    ViewGroup viewGroup = t2Var.O;
                    if (viewGroup != null) {
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin = measuredHeight;
                        return;
                    } else if (t2Var.f28586b != null) {
                        for (int i11 = 1; i11 < t2Var.f28586b.getChildCount(); i11++) {
                            View childAt = t2Var.f28586b.getChildAt(i11);
                            if (childAt instanceof m2) {
                                ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                                measuredHeight = org.telegram.messenger.g0.L(48.0f) + measuredHeight;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                super.onMeasure(i3, i10);
                b(getMeasuredWidth());
                return;
            case 3:
                super.onMeasure(i3, i10);
                if (bd.f21784a0) {
                    ((d21) this.f27763b).f32918b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 10:
                super.onMeasure(i3, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((m9) this.f27763b).Y));
                return;
            case 11:
                super.onMeasure(i3, i10);
                ((org.telegram.ui.web.l1) this.f27763b).f50941c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f27762a) {
            case 2:
                super.onSizeChanged(i3, i10, i11, i12);
                ((FragmentContextView) this.f27763b).P.f39349f = getWidth();
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27762a) {
            case 4:
                if (Math.abs(((org.telegram.ui.Components.voip.r) this.f27763b).O.getAlpha() - 1.0f) > 0.001f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i3) {
        switch (this.f27762a) {
            case 2:
                super.setVisibility(i3);
                if (i3 != 0) {
                    b(0);
                    ((FragmentContextView) this.f27763b).O = 0;
                    return;
                }
                return;
            default:
                super.setVisibility(i3);
                return;
        }
    }

    public k2(Activity activity, Paint paint) {
        super(activity);
        this.f27762a = 7;
        this.f27763b = paint;
    }

    public k2(Context context, int i3) {
        super(context);
        this.f27762a = i3;
        switch (i3) {
            case 5:
                super(context);
                this.f27763b = new js(1, this);
                return;
            default:
                return;
        }
    }
}
