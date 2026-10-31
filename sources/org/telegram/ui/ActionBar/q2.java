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
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.w00;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.Wallet.r9;
import org.telegram.ui.be1;
import org.telegram.ui.mt;
import org.telegram.ui.q41;
public final class q2 extends TextView {
    public final int f20659a;
    public Object f20660b;

    public q2(Object obj, Context context, int i10) {
        super(context);
        this.f20659a = i10;
        this.f20660b = obj;
    }

    public void b(int i10) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f20660b;
        if (fragmentContextView.N != i10) {
            w00 w00Var = fragmentContextView.d;
            w00Var.setPadding(w00Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.N) + i10, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.N = i10;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f20659a) {
            case 2:
                super.draw(canvas);
                int L = org.telegram.messenger.i0.L(1.0f);
                RectF rectF = org.telegram.messenger.i0.P;
                float f7 = L;
                rectF.set(f7, f7, getWidth() - L, getHeight() - L);
                ((FragmentContextView) this.f20660b).O.a(org.telegram.messenger.i0.L(16.0f), canvas, rectF, this);
                return;
            case 6:
                super.draw(canvas);
                q41 q41Var = (q41) this.f20660b;
                org.telegram.ui.Components.voip.g gVar = q41Var.f40868c;
                if (gVar.f31437g <= 1.0f) {
                    SessionsActivity sessionsActivity = q41Var.f40869f;
                    if (sessionsActivity.V && sessionsActivity.W) {
                        RectF rectF2 = org.telegram.messenger.i0.P;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        gVar.f31436f = getMeasuredWidth();
                        gVar.a(org.telegram.messenger.i0.L(8.0f), canvas, rectF2, null);
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
        switch (this.f20659a) {
            case 5:
                super.onAttachedToWindow();
                zs.e().c((mt) this.f20660b, 259);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f20659a) {
            case 5:
                super.onDetachedFromWindow();
                zs.e().n((mt) this.f20660b, 259);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f20659a) {
            case 1:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.g) this.f20660b) == null) {
                    org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
                    this.f20660b = gVar;
                    gVar.f31440k = false;
                    gVar.f31442m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.g) this.f20660b).f31436f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.g) this.f20660b).a(org.telegram.messenger.i0.L(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f20660b;
                paint.setColor(getCurrentTextColor());
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(1.0f));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
                return;
            case 9:
                org.telegram.ui.Wallet.l6 l6Var = (org.telegram.ui.Wallet.l6) this.f20660b;
                float e = l6Var.f34854g0.e(false, l6Var.f34851e0);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                l6Var.c(e, new org.telegram.ui.Wallet.d3(paint2, 3), new org.telegram.ui.Wallet.k3(7, this, canvas));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f20659a) {
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    ((be1) this.f20660b).G();
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
        switch (this.f20659a) {
            case 0:
                super.onMeasure(i10, i11);
                z2 z2Var = (z2) this.f20660b;
                if (z2Var.Q) {
                    int measuredHeight = getMeasuredHeight();
                    ViewGroup viewGroup = z2Var.N;
                    if (viewGroup != null) {
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin = measuredHeight;
                        return;
                    } else if (z2Var.f21586b != null) {
                        for (int i12 = 1; i12 < z2Var.f21586b.getChildCount(); i12++) {
                            View childAt = z2Var.f21586b.getChildAt(i12);
                            if (childAt instanceof s2) {
                                ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin = measuredHeight;
                                measuredHeight = org.telegram.messenger.i0.L(48.0f) + measuredHeight;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                super.onMeasure(i10, i11);
                b(getMeasuredWidth());
                return;
            case 3:
                super.onMeasure(i10, i11);
                if (cd.X) {
                    ((k31) this.f20660b).f27629b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 10:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((r9) this.f20660b).X));
                return;
            case 11:
                super.onMeasure(i10, i11);
                ((org.telegram.ui.web.o1) this.f20660b).f43154c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f20659a) {
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                ((FragmentContextView) this.f20660b).O.f31436f = getWidth();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f20659a) {
            case 4:
                if (Math.abs(((org.telegram.ui.Components.voip.r) this.f20660b).N.getAlpha() - 1.0f) > 0.001f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f20659a) {
            case 2:
                super.setVisibility(i10);
                if (i10 != 0) {
                    b(0);
                    ((FragmentContextView) this.f20660b).N = 0;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public q2(Activity activity, Paint paint) {
        super(activity);
        this.f20659a = 7;
        this.f20660b = paint;
    }

    public q2(Context context, int i10) {
        super(context);
        this.f20659a = i10;
        switch (i10) {
            case 5:
                super(context);
                this.f20660b = new mt(1, this);
                return;
            default:
                return;
        }
    }
}
