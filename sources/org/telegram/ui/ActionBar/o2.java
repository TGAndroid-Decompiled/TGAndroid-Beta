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
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.w21;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.Wallet.da;
import org.telegram.ui.Wallet.x6;
import org.telegram.ui.a31;
import org.telegram.ui.hc1;
import org.telegram.ui.os;
public final class o2 extends TextView {
    public final int f29824a;
    public Object f29825b;

    public o2(int i7, Context context, Object obj) {
        super(context);
        this.f29824a = i7;
        this.f29825b = obj;
    }

    public void b(int i7) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f29825b;
        if (fragmentContextView.O != i7) {
            t00 t00Var = fragmentContextView.d;
            t00Var.setPadding(t00Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.O) + i7, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.O = i7;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f29824a) {
            case 2:
                super.draw(canvas);
                int L = org.telegram.messenger.g0.L(1.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = L;
                rectF.set(f10, f10, getWidth() - L, getHeight() - L);
                ((FragmentContextView) this.f29825b).P.a(org.telegram.messenger.g0.L(16.0f), canvas, rectF, this);
                return;
            case 6:
                super.draw(canvas);
                a31 a31Var = (a31) this.f29825b;
                org.telegram.ui.Components.voip.n nVar = a31Var.f45445c;
                if (nVar.f41051g <= 1.0f) {
                    SessionsActivity sessionsActivity = a31Var.f45447f;
                    if (sessionsActivity.W && sessionsActivity.X) {
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        nVar.f41050f = getMeasuredWidth();
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
        switch (this.f29824a) {
            case 5:
                super.onAttachedToWindow();
                ks.e().c((os) this.f29825b, 261);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f29824a) {
            case 5:
                super.onDetachedFromWindow();
                ks.e().n((os) this.f29825b, 261);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f29824a) {
            case 1:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.n) this.f29825b) == null) {
                    org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
                    this.f29825b = nVar;
                    nVar.f41054k = false;
                    nVar.f41056m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.n) this.f29825b).f41050f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f29825b).a(org.telegram.messenger.g0.L(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f29825b;
                paint.setColor(getCurrentTextColor());
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                return;
            case 9:
                x6 x6Var = (x6) this.f29825b;
                float e10 = x6Var.f45268h0.e(false, x6Var.f45266f0);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                x6Var.c(e10, new org.telegram.ui.Wallet.h3(paint2, 3), new org.telegram.ui.Wallet.c5(2, this, canvas));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f29824a) {
            case 8:
                super.onLayout(z10, i7, i10, i11, i12);
                if (z10) {
                    ((hc1) this.f29825b).y();
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
        switch (this.f29824a) {
            case 0:
                super.onMeasure(i7, i10);
                x2 x2Var = (x2) this.f29825b;
                if (x2Var.R) {
                    int measuredHeight = getMeasuredHeight();
                    ViewGroup viewGroup = x2Var.O;
                    if (viewGroup != null) {
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin = measuredHeight;
                        return;
                    } else if (x2Var.f30192b != null) {
                        for (int i11 = 1; i11 < x2Var.f30192b.getChildCount(); i11++) {
                            View childAt = x2Var.f30192b.getChildAt(i11);
                            if (childAt instanceof q2) {
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
                if (gd.f24216a0) {
                    ((w21) this.f29825b).f41544b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 10:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((da) this.f29825b).Y));
                return;
            case 11:
                super.onMeasure(i7, i10);
                ((org.telegram.ui.web.m1) this.f29825b).f53247c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f29824a) {
            case 2:
                super.onSizeChanged(i7, i10, i11, i12);
                ((FragmentContextView) this.f29825b).P.f41050f = getWidth();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29824a) {
            case 4:
                if (Math.abs(((org.telegram.ui.Components.voip.y) this.f29825b).O.getAlpha() - 1.0f) > 0.001f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f29824a) {
            case 2:
                super.setVisibility(i7);
                if (i7 != 0) {
                    b(0);
                    ((FragmentContextView) this.f29825b).O = 0;
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public o2(Activity activity, Paint paint) {
        super(activity);
        this.f29824a = 7;
        this.f29825b = paint;
    }

    public o2(Context context, int i7) {
        super(context);
        this.f29824a = i7;
        switch (i7) {
            case 5:
                super(context);
                this.f29825b = new os(1, this);
                return;
            default:
                return;
        }
    }
}
