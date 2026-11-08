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
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Components.j00;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.Wallet.m9;
import org.telegram.ui.fc1;
import org.telegram.ui.ls;
import org.telegram.ui.z21;
public final class m2 extends TextView {
    public final int f28302a;
    public Object f28303b;

    public m2(int i7, Context context, Object obj) {
        super(context);
        this.f28302a = i7;
        this.f28303b = obj;
    }

    public static void a(m2 m2Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    public void b(int i7) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f28303b;
        if (fragmentContextView.N != i7) {
            j00 j00Var = fragmentContextView.d;
            j00Var.setPadding(j00Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.N) + i7, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.N = i7;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f28302a) {
            case 2:
                super.draw(canvas);
                int L = org.telegram.messenger.g0.L(1.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = L;
                rectF.set(f10, f10, getWidth() - L, getHeight() - L);
                ((FragmentContextView) this.f28303b).O.a(org.telegram.messenger.g0.L(16.0f), canvas, rectF, this);
                return;
            case 6:
                super.draw(canvas);
                z21 z21Var = (z21) this.f28303b;
                org.telegram.ui.Components.voip.n nVar = z21Var.f52427c;
                if (nVar.f39375g <= 1.0f) {
                    SessionsActivity sessionsActivity = z21Var.f52429f;
                    if (sessionsActivity.V && sessionsActivity.W) {
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        nVar.f39374f = getMeasuredWidth();
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
        switch (this.f28302a) {
            case 5:
                super.onAttachedToWindow();
                qs.e().c((ls) this.f28303b, 259);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f28302a) {
            case 5:
                super.onDetachedFromWindow();
                qs.e().n((ls) this.f28303b, 259);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f28302a) {
            case 1:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.n) this.f28303b) == null) {
                    org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
                    this.f28303b = nVar;
                    nVar.f39378k = false;
                    nVar.f39380m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.n) this.f28303b).f39374f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f28303b).a(org.telegram.messenger.g0.L(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f28303b;
                paint.setColor(getCurrentTextColor());
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                return;
            case 9:
                org.telegram.ui.Wallet.g6 g6Var = (org.telegram.ui.Wallet.g6) this.f28303b;
                float e10 = g6Var.f42547g0.e(false, g6Var.f42544e0);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                g6Var.c(e10, new org.telegram.ui.Wallet.d3(paint2, 3), new org.telegram.ui.Wallet.n(14, this, canvas));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f28302a) {
            case 8:
                super.onLayout(z9, i7, i10, i11, i12);
                if (z9) {
                    ((fc1) this.f28303b).y();
                    return;
                }
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f28302a) {
            case 0:
                super.onMeasure(i7, i10);
                v2 v2Var = (v2) this.f28303b;
                if (v2Var.Q) {
                    int measuredHeight = getMeasuredHeight();
                    ViewGroup viewGroup = v2Var.N;
                    if (viewGroup != null) {
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin = measuredHeight;
                        return;
                    } else if (v2Var.f28619b != null) {
                        for (int i11 = 1; i11 < v2Var.f28619b.getChildCount(); i11++) {
                            View childAt = v2Var.f28619b.getChildAt(i11);
                            if (childAt instanceof o2) {
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
                if (id.f23157a0) {
                    ((i21) this.f28303b).f34512b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 10:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((m9) this.f28303b).X));
                return;
            case 11:
                super.onMeasure(i7, i10);
                ((org.telegram.ui.web.n1) this.f28303b).f51251c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f28302a) {
            case 2:
                super.onSizeChanged(i7, i10, i11, i12);
                ((FragmentContextView) this.f28303b).O.f39374f = getWidth();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28302a) {
            case 4:
                if (Math.abs(((org.telegram.ui.Components.voip.y) this.f28303b).N.getAlpha() - 1.0f) > 0.001f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f28302a) {
            case 2:
                super.setVisibility(i7);
                if (i7 != 0) {
                    b(0);
                    ((FragmentContextView) this.f28303b).N = 0;
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public m2(Activity activity, Paint paint) {
        super(activity);
        this.f28302a = 7;
        this.f28303b = paint;
    }

    public m2(Context context, int i7) {
        super(context);
        this.f28302a = i7;
        switch (i7) {
            case 5:
                super(context);
                this.f28303b = new ls(1, this);
                return;
            default:
                return;
        }
    }
}
