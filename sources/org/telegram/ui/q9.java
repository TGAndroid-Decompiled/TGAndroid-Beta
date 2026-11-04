package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
public final class q9 extends TextView {
    public final int f48815a = 0;
    public final Paint f48816b;
    public Path f48817c;
    public Object d;
    public final Object f48818e;

    public q9(org.telegram.ui.Components.tl0 tl0Var, Context context) {
        super(context);
        this.f48818e = tl0Var;
        this.f48817c = new Path();
        this.d = new RectF();
        this.f48816b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f48815a) {
            case 1:
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.15f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28081o6, ((org.telegram.ui.Components.tl0) this.f48818e).f38487c));
                Paint paint = this.f48816b;
                paint.setColor(r12);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f48817c;
                Paint paint2 = dh.o0.S;
                dh.o0.h(rectF, org.telegram.messenger.g0.P, path);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f48815a) {
            case 0:
                org.telegram.ui.Components.n70 n70Var = (org.telegram.ui.Components.n70) this.f48817c;
                if (n70Var != null) {
                    canvas.drawPath(n70Var, this.f48816b);
                }
                if (((m2.p0) this.f48818e).h(canvas)) {
                    invalidate();
                }
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f48815a) {
            case 1:
                org.telegram.ui.Components.tl0 tl0Var = (org.telegram.ui.Components.tl0) this.f48818e;
                super.onLayout(z10, i3, i10, i11, i12);
                int width = getWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < tl0Var.getChildCount(); i14++) {
                    width = Math.min(width, tl0Var.getChildAt(i14).getLeft());
                    i13 = Math.max(i13, tl0Var.getChildAt(i14).getRight());
                }
                setPivotX((width + i13) / 2.0f);
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        float f10;
        switch (this.f48815a) {
            case 0:
                super.onMeasure(i3, i10);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.v31[] v31VarArr = (org.telegram.ui.Components.v31[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.v31.class);
                    if (v31VarArr != null && v31VarArr.length > 0) {
                        org.telegram.ui.Components.n70 n70Var = new org.telegram.ui.Components.n70(0);
                        this.f48817c = n70Var;
                        n70Var.f36403n = false;
                        for (int i13 = 0; i13 < v31VarArr.length; i13++) {
                            int spanStart = spanned.getSpanStart(v31VarArr[i13]);
                            int spanEnd = spanned.getSpanEnd(v31VarArr[i13]);
                            ((org.telegram.ui.Components.n70) this.f48817c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i11 = getPaint().baselineShift;
                            } else {
                                i11 = 0;
                            }
                            org.telegram.ui.Components.n70 n70Var2 = (org.telegram.ui.Components.n70) this.f48817c;
                            if (i11 != 0) {
                                if (i11 > 0) {
                                    f10 = 5.0f;
                                } else {
                                    f10 = -2.0f;
                                }
                                i12 = org.telegram.messenger.g0.L(f10) + i11;
                            } else {
                                i12 = 0;
                            }
                            n70Var2.f36404o = i12;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.n70) this.f48817c);
                        }
                        ((org.telegram.ui.Components.n70) this.f48817c).f36403n = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f48815a) {
            case 0:
                m2.p0 p0Var = (m2.p0) this.f48818e;
                Layout layout = getLayout();
                float f10 = 0;
                int x10 = (int) (motionEvent.getX() - f10);
                int y9 = (int) (motionEvent.getY() - f10);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    int lineForVertical = layout.getLineForVertical(y9);
                    float f11 = x10;
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f11);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if (lineLeft <= f11 && layout.getLineWidth(lineForVertical) + lineLeft >= f11 && y9 >= 0 && y9 <= layout.getHeight()) {
                        Spannable spannable = (Spannable) layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            p0Var.f(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.t70 t70Var = new org.telegram.ui.Components.t70(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = t70Var;
                                t70Var.d(771751935);
                                p0Var.b((org.telegram.ui.Components.t70) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.t70) this.d).f38328i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.t70) this.d).f38328i);
                                org.telegram.ui.Components.n70 b10 = ((org.telegram.ui.Components.t70) this.d).b();
                                b10.d(layout, spanStart, f10);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                org.telegram.ui.Components.t70 t70Var2 = (org.telegram.ui.Components.t70) this.d;
                                if (t70Var2 != null) {
                                    CharacterStyle characterStyle = t70Var2.f38328i;
                                    ClickableSpan clickableSpan = clickableSpanArr[0];
                                    if (characterStyle == clickableSpan) {
                                        clickableSpan.onClick(this);
                                    }
                                }
                                this.d = null;
                                return true;
                            }
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    p0Var.f(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public q9(Context context, Paint paint) {
        super(context);
        this.f48816b = paint;
        this.f48818e = new m2.p0(this);
    }
}
