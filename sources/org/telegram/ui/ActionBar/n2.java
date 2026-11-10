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
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.i21;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.Wallet.o9;
import org.telegram.ui.c31;
import org.telegram.ui.jc1;
import org.telegram.ui.os;
import org.telegram.ui.sb1;
public final class n2 extends TextView {
    public final int f28314a;
    public Object f28315b;

    public n2(int i7, Context context, Object obj) {
        super(context);
        this.f28314a = i7;
        this.f28315b = obj;
    }

    public static void a(n2 n2Var, Canvas canvas) {
        super.onDraw(canvas);
    }

    public void b(int i7) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f28315b;
        if (fragmentContextView.N != i7) {
            i00 i00Var = fragmentContextView.d;
            i00Var.setPadding(i00Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.N) + i7, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.N = i7;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f28314a) {
            case 2:
                super.draw(canvas);
                int L = org.telegram.messenger.g0.L(1.0f);
                RectF rectF = org.telegram.messenger.g0.P;
                float f10 = L;
                rectF.set(f10, f10, getWidth() - L, getHeight() - L);
                ((FragmentContextView) this.f28315b).O.a(org.telegram.messenger.g0.L(16.0f), canvas, rectF, this);
                return;
            case 6:
                super.draw(canvas);
                c31 c31Var = (c31) this.f28315b;
                org.telegram.ui.Components.voip.n nVar = c31Var.f44212c;
                if (nVar.f39384g <= 1.0f) {
                    SessionsActivity sessionsActivity = c31Var.f44214f;
                    if (sessionsActivity.V && sessionsActivity.W) {
                        RectF rectF2 = org.telegram.messenger.g0.P;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        nVar.f39383f = getMeasuredWidth();
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
        switch (this.f28314a) {
            case 5:
                super.onAttachedToWindow();
                qs.e().c((os) this.f28315b, 259);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f28314a) {
            case 5:
                super.onDetachedFromWindow();
                qs.e().n((os) this.f28315b, 259);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f28314a) {
            case 1:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.n) this.f28315b) == null) {
                    org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
                    this.f28315b = nVar;
                    nVar.f39387k = false;
                    nVar.f39389m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.n) this.f28315b).f39383f = getMeasuredWidth();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.f28315b).a(org.telegram.messenger.g0.L(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 7:
                super.onDraw(canvas);
                Paint paint = (Paint) this.f28315b;
                paint.setColor(getCurrentTextColor());
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                return;
            case 9:
                org.telegram.ui.Wallet.i6 i6Var = (org.telegram.ui.Wallet.i6) this.f28315b;
                float e10 = i6Var.f42631g0.e(false, i6Var.f42628e0);
                TextPaint paint2 = getPaint();
                Objects.requireNonNull(paint2);
                i6Var.c(e10, new org.telegram.ui.Wallet.c3(paint2, 3), new sb1(15, this, canvas));
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f28314a) {
            case 8:
                super.onLayout(z9, i7, i10, i11, i12);
                if (z9) {
                    ((jc1) this.f28315b).y();
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
        switch (this.f28314a) {
            case 0:
                super.onMeasure(i7, i10);
                w2 w2Var = (w2) this.f28315b;
                if (w2Var.Q) {
                    int measuredHeight = getMeasuredHeight();
                    ViewGroup viewGroup = w2Var.N;
                    if (viewGroup != null) {
                        ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin = measuredHeight;
                        return;
                    } else if (w2Var.f28672b != null) {
                        for (int i11 = 1; i11 < w2Var.f28672b.getChildCount(); i11++) {
                            View childAt = w2Var.f28672b.getChildAt(i11);
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
                if (id.f23161a0) {
                    ((i21) this.f28315b).f34518b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 10:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredHeight() * ((o9) this.f28315b).X));
                return;
            case 11:
                super.onMeasure(i7, i10);
                ((org.telegram.ui.web.n1) this.f28315b).f51186c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f28314a) {
            case 2:
                super.onSizeChanged(i7, i10, i11, i12);
                ((FragmentContextView) this.f28315b).O.f39383f = getWidth();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f28314a) {
            case 4:
                if (Math.abs(((org.telegram.ui.Components.voip.y) this.f28315b).N.getAlpha() - 1.0f) > 0.001f) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f28314a) {
            case 2:
                super.setVisibility(i7);
                if (i7 != 0) {
                    b(0);
                    ((FragmentContextView) this.f28315b).N = 0;
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
        this.f28314a = 7;
        this.f28315b = paint;
    }

    public n2(Context context, int i7) {
        super(context);
        this.f28314a = i7;
        switch (i7) {
            case 5:
                super(context);
                this.f28315b = new os(1, this);
                return;
            default:
                return;
        }
    }
}
