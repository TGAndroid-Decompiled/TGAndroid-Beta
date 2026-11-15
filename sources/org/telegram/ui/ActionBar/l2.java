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
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.n21;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.Wallet.p9;
import org.telegram.ui.ec1;
import org.telegram.ui.os;
import org.telegram.ui.w21;
public final class l2 extends TextView {
    public final int f29359a;
    public Object f29360b;

    public l2(int i7, Context context, Object obj) {
        super(context);
        this.f29359a = i7;
        this.f29360b = obj;
    }

    public void b(int i7) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f29360b;
        if (fragmentContextView.O != i7) {
            m00 m00Var = fragmentContextView.d;
            m00Var.setPadding(m00Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.O) + i7, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.O = i7;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f29359a) {
            case 2:
                super.draw(canvas);
                int L = org.telegram.messenger.g0.L(1.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = L;
                rectF.set(f10, f10, getWidth() - L, getHeight() - L);
                ((FragmentContextView) this.f29360b).P.a(org.telegram.messenger.g0.L(16.0f), canvas, rectF, this);
                return;
            case 6:
                super.draw(canvas);
                w21 w21Var = (w21) this.f29360b;
                org.telegram.ui.Components.voip.n nVar = w21Var.f52373c;
                if (nVar.f40799g <= 1.0f) {
                    SessionsActivity sessionsActivity = w21Var.f52375f;
                    if (sessionsActivity.W && sessionsActivity.X) {
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        nVar.f40798f = getMeasuredWidth();
                        nVar.a(org.telegram.messenger.g0.L(8.0f), canvas, rectF2, null);
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
        switch (this.f29359a) {
            case 5:
                super.onAttachedToWindow();
                ns.e().c((os) this.f29360b, 259);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f29359a) {
            case 5:
                super.onDetachedFromWindow();
                ns.e().n((os) this.f29360b, 259);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f29359a) {
            case 1:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.n) this.f29360b) == null) {
                    org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
                    this.f29360b = nVar;
                    nVar.f40802k = false;
                    nVar.f40804m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.n) this.f29360b).f40798f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f29360b).a(org.telegram.messenger.g0.L(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f29360b;
                paint.setColor(getCurrentTextColor());
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                return;
            case 9:
                org.telegram.ui.Wallet.h6 h6Var = (org.telegram.ui.Wallet.h6) this.f29360b;
                float e10 = h6Var.f43928h0.e(false, h6Var.f43926f0);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                h6Var.c(e10, new org.telegram.ui.Wallet.b3(paint2, 3), new org.telegram.ui.Wallet.r(10, this, canvas));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f29359a) {
            case 8:
                super.onLayout(z10, i7, i10, i11, i12);
                if (z10) {
                    ((ec1) this.f29360b).y();
                    return;
                }
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f29359a) {
            case 0:
                super.onMeasure(i7, i10);
                u2 u2Var = (u2) this.f29360b;
                if (u2Var.R) {
                    int measuredHeight = getMeasuredHeight();
                    ViewGroup viewGroup = u2Var.O;
                    if (viewGroup != null) {
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin = measuredHeight;
                        return;
                    } else if (u2Var.f29682b != null) {
                        for (int i11 = 1; i11 < u2Var.f29682b.getChildCount(); i11++) {
                            View childAt = u2Var.f29682b.getChildAt(i11);
                            if (childAt instanceof n2) {
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
                super.onMeasure(i7, i10);
                b(getMeasuredWidth());
                return;
            case 3:
                super.onMeasure(i7, i10);
                if (hd.f24104a0) {
                    ((n21) this.f29360b).f37435b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 10:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((p9) this.f29360b).Y));
                return;
            case 11:
                super.onMeasure(i7, i10);
                ((org.telegram.ui.web.m1) this.f29360b).f52718c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f29359a) {
            case 2:
                super.onSizeChanged(i7, i10, i11, i12);
                ((FragmentContextView) this.f29360b).P.f40798f = getWidth();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29359a) {
            case 4:
                if (Math.abs(((org.telegram.ui.Components.voip.z) this.f29360b).O.getAlpha() - 1.0f) > 0.001f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f29359a) {
            case 2:
                super.setVisibility(i7);
                if (i7 != 0) {
                    b(0);
                    ((FragmentContextView) this.f29360b).O = 0;
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public l2(Activity activity, Paint paint) {
        super(activity);
        this.f29359a = 7;
        this.f29360b = paint;
    }

    public l2(Context context, int i7) {
        super(context);
        this.f29359a = i7;
        switch (i7) {
            case 5:
                super(context);
                this.f29360b = new os(1, this);
                return;
            default:
                return;
        }
    }
}
