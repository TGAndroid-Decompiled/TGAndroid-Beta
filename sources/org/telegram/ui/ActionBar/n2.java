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
import org.telegram.ui.Components.y21;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.Wallet.ea;
import org.telegram.ui.Wallet.y6;
import org.telegram.ui.fc1;
import org.telegram.ui.os;
import org.telegram.ui.z21;
public final class n2 extends TextView {
    public final int f29345a;
    public Object f29346b;

    public n2(int i7, Context context, Object obj) {
        super(context);
        this.f29345a = i7;
        this.f29346b = obj;
    }

    public static void a(n2 n2Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    public void b(int i7) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f29346b;
        if (fragmentContextView.O != i7) {
            t00 t00Var = fragmentContextView.d;
            t00Var.setPadding(t00Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.O) + i7, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.O = i7;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f29345a) {
            case 2:
                super.draw(canvas);
                int L = org.telegram.messenger.g0.L(1.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = L;
                rectF.set(f10, f10, getWidth() - L, getHeight() - L);
                ((FragmentContextView) this.f29346b).P.a(org.telegram.messenger.g0.L(16.0f), canvas, rectF, this);
                return;
            case 6:
                super.draw(canvas);
                z21 z21Var = (z21) this.f29346b;
                org.telegram.ui.Components.voip.n nVar = z21Var.f54504c;
                if (nVar.f41075g <= 1.0f) {
                    SessionsActivity sessionsActivity = z21Var.f54506f;
                    if (sessionsActivity.W && sessionsActivity.X) {
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        nVar.f41074f = getMeasuredWidth();
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
        switch (this.f29345a) {
            case 5:
                super.onAttachedToWindow();
                ks.e().c((os) this.f29346b, 262);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f29345a) {
            case 5:
                super.onDetachedFromWindow();
                ks.e().n((os) this.f29346b, 262);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f29345a) {
            case 1:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.n) this.f29346b) == null) {
                    org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
                    this.f29346b = nVar;
                    nVar.f41078k = false;
                    nVar.f41080m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.n) this.f29346b).f41074f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f29346b).a(org.telegram.messenger.g0.L(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f29346b;
                paint.setColor(getCurrentTextColor());
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                return;
            case 9:
                y6 y6Var = (y6) this.f29346b;
                float e10 = y6Var.f45440h0.e(false, y6Var.f45438f0);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                y6Var.c(e10, new org.telegram.ui.Wallet.i3(paint2, 3), new org.telegram.ui.Wallet.r(8, this, canvas));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f29345a) {
            case 8:
                super.onLayout(z10, i7, i10, i11, i12);
                if (z10) {
                    ((fc1) this.f29346b).y();
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
        switch (this.f29345a) {
            case 0:
                super.onMeasure(i7, i10);
                w2 w2Var = (w2) this.f29346b;
                if (w2Var.R) {
                    int measuredHeight = getMeasuredHeight();
                    ViewGroup viewGroup = w2Var.O;
                    if (viewGroup != null) {
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin = measuredHeight;
                        return;
                    } else if (w2Var.f30226b != null) {
                        for (int i11 = 1; i11 < w2Var.f30226b.getChildCount(); i11++) {
                            View childAt = w2Var.f30226b.getChildAt(i11);
                            if (childAt instanceof p2) {
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
                if (gd.f24314a0) {
                    ((y21) this.f29346b).f42309b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 10:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((ea) this.f29346b).Y));
                return;
            case 11:
                super.onMeasure(i7, i10);
                ((org.telegram.ui.web.m1) this.f29346b).f53480c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f29345a) {
            case 2:
                super.onSizeChanged(i7, i10, i11, i12);
                ((FragmentContextView) this.f29346b).P.f41074f = getWidth();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f29345a) {
            case 4:
                if (Math.abs(((org.telegram.ui.Components.voip.z) this.f29346b).O.getAlpha() - 1.0f) > 0.001f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f29345a) {
            case 2:
                super.setVisibility(i7);
                if (i7 != 0) {
                    b(0);
                    ((FragmentContextView) this.f29346b).O = 0;
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public n2(Activity activity, Paint paint) {
        super(activity);
        this.f29345a = 7;
        this.f29346b = paint;
    }

    public n2(Context context, int i7) {
        super(context);
        this.f29345a = i7;
        switch (i7) {
            case 5:
                super(context);
                this.f29346b = new os(1, this);
                return;
            default:
                return;
        }
    }
}
