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
import org.telegram.messenger.qs;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.h21;
import org.telegram.ui.Components.i00;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.Wallet.n9;
import org.telegram.ui.ec1;
import org.telegram.ui.ls;
import org.telegram.ui.z21;
public final class m2 extends TextView {
    public final int f28298a;
    public Object f28299b;

    public m2(int i7, Context context, Object obj) {
        super(context);
        this.f28298a = i7;
        this.f28299b = obj;
    }

    public static void a(m2 m2Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    public void b(int i7) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f28299b;
        if (fragmentContextView.N != i7) {
            i00 i00Var = fragmentContextView.d;
            i00Var.setPadding(i00Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.N) + i7, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.N = i7;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f28298a) {
            case 2:
                super.draw(canvas);
                int L = org.telegram.messenger.g0.L(1.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = L;
                rectF.set(f10, f10, getWidth() - L, getHeight() - L);
                ((FragmentContextView) this.f28299b).O.a(org.telegram.messenger.g0.L(16.0f), canvas, rectF, this);
                return;
            case 6:
                super.draw(canvas);
                z21 z21Var = (z21) this.f28299b;
                org.telegram.ui.Components.voip.n nVar = z21Var.f52449c;
                if (nVar.f39319g <= 1.0f) {
                    SessionsActivity sessionsActivity = z21Var.f52451f;
                    if (sessionsActivity.V && sessionsActivity.W) {
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        nVar.f39318f = getMeasuredWidth();
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
        switch (this.f28298a) {
            case 5:
                super.onAttachedToWindow();
                qs.e().c((ls) this.f28299b, 259);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f28298a) {
            case 5:
                super.onDetachedFromWindow();
                qs.e().n((ls) this.f28299b, 259);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f28298a) {
            case 1:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.n) this.f28299b) == null) {
                    org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
                    this.f28299b = nVar;
                    nVar.f39322k = false;
                    nVar.f39324m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.n) this.f28299b).f39318f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f28299b).a(org.telegram.messenger.g0.L(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f28299b;
                paint.setColor(getCurrentTextColor());
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                return;
            case 9:
                org.telegram.ui.Wallet.h6 h6Var = (org.telegram.ui.Wallet.h6) this.f28299b;
                float e10 = h6Var.f42577g0.e(false, h6Var.f42574e0);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                h6Var.c(e10, new org.telegram.ui.Wallet.e3(paint2, 3), new org.telegram.ui.Wallet.n(14, this, canvas));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f28298a) {
            case 8:
                super.onLayout(z9, i7, i10, i11, i12);
                if (z9) {
                    ((ec1) this.f28299b).y();
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
        switch (this.f28298a) {
            case 0:
                super.onMeasure(i7, i10);
                v2 v2Var = (v2) this.f28299b;
                if (v2Var.Q) {
                    int measuredHeight = getMeasuredHeight();
                    ViewGroup viewGroup = v2Var.N;
                    if (viewGroup != null) {
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin = measuredHeight;
                        return;
                    } else if (v2Var.f28615b != null) {
                        for (int i11 = 1; i11 < v2Var.f28615b.getChildCount(); i11++) {
                            View childAt = v2Var.f28615b.getChildAt(i11);
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
                if (hd.f22871a0) {
                    ((h21) this.f28299b).f34149b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 10:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((n9) this.f28299b).X));
                return;
            case 11:
                super.onMeasure(i7, i10);
                ((org.telegram.ui.web.o1) this.f28299b).f51260c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f28298a) {
            case 2:
                super.onSizeChanged(i7, i10, i11, i12);
                ((FragmentContextView) this.f28299b).O.f39318f = getWidth();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28298a) {
            case 4:
                if (Math.abs(((org.telegram.ui.Components.voip.y) this.f28299b).N.getAlpha() - 1.0f) > 0.001f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f28298a) {
            case 2:
                super.setVisibility(i7);
                if (i7 != 0) {
                    b(0);
                    ((FragmentContextView) this.f28299b).N = 0;
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
        this.f28298a = 7;
        this.f28299b = paint;
    }

    public m2(Context context, int i7) {
        super(context);
        this.f28298a = i7;
        switch (i7) {
            case 5:
                super(context);
                this.f28299b = new ls(1, this);
                return;
            default:
                return;
        }
    }
}
