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
    public final int f48996a = 0;
    public final Paint f48997b;
    public Path f48998c;
    public Object d;
    public final Object f48999e;

    public q9(org.telegram.ui.Components.ql0 ql0Var, Context context) {
        super(context);
        this.f48999e = ql0Var;
        this.f48998c = new Path();
        this.d = new RectF();
        this.f48997b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f48996a) {
            case 1:
                int r12 = org.telegram.ui.ActionBar.m6.r1(0.15f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28090o6, ((org.telegram.ui.Components.ql0) this.f48999e).f37323c));
                Paint paint = this.f48997b;
                paint.setColor(r12);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f48998c;
                Paint paint2 = ch.p0.S;
                ch.p0.h(rectF, org.telegram.messenger.g0.P, path);
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
        switch (this.f48996a) {
            case 0:
                org.telegram.ui.Components.r70 r70Var = (org.telegram.ui.Components.r70) this.f48998c;
                if (r70Var != null) {
                    canvas.drawPath(r70Var, this.f48997b);
                }
                if (((n2.n0) this.f48999e).h(canvas)) {
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
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f48996a) {
            case 1:
                org.telegram.ui.Components.ql0 ql0Var = (org.telegram.ui.Components.ql0) this.f48999e;
                super.onLayout(z9, i7, i10, i11, i12);
                int width = getWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < ql0Var.getChildCount(); i14++) {
                    width = Math.min(width, ql0Var.getChildAt(i14).getLeft());
                    i13 = Math.max(i13, ql0Var.getChildAt(i14).getRight());
                }
                setPivotX((width + i13) / 2.0f);
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        float f10;
        switch (this.f48996a) {
            case 0:
                super.onMeasure(i7, i10);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.b41[] b41VarArr = (org.telegram.ui.Components.b41[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.b41.class);
                    if (b41VarArr != null && b41VarArr.length > 0) {
                        org.telegram.ui.Components.r70 r70Var = new org.telegram.ui.Components.r70(0);
                        this.f48998c = r70Var;
                        r70Var.f37537n = false;
                        for (int i13 = 0; i13 < b41VarArr.length; i13++) {
                            int spanStart = spanned.getSpanStart(b41VarArr[i13]);
                            int spanEnd = spanned.getSpanEnd(b41VarArr[i13]);
                            ((org.telegram.ui.Components.r70) this.f48998c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i11 = getPaint().baselineShift;
                            } else {
                                i11 = 0;
                            }
                            org.telegram.ui.Components.r70 r70Var2 = (org.telegram.ui.Components.r70) this.f48998c;
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
                            r70Var2.f37538o = i12;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.r70) this.f48998c);
                        }
                        ((org.telegram.ui.Components.r70) this.f48998c).f37537n = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f48996a) {
            case 0:
                n2.n0 n0Var = (n2.n0) this.f48999e;
                Layout layout = getLayout();
                float f10 = 0;
                int x10 = (int) (motionEvent.getX() - f10);
                int y10 = (int) (motionEvent.getY() - f10);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    int lineForVertical = layout.getLineForVertical(y10);
                    float f11 = x10;
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f11);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if (lineLeft <= f11 && layout.getLineWidth(lineForVertical) + lineLeft >= f11 && y10 >= 0 && y10 <= layout.getHeight()) {
                        Spannable spannable = (Spannable) layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            n0Var.f(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.x70 x70Var = new org.telegram.ui.Components.x70(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = x70Var;
                                x70Var.d(771751935);
                                n0Var.b((org.telegram.ui.Components.x70) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.x70) this.d).f40221i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.x70) this.d).f40221i);
                                org.telegram.ui.Components.r70 b10 = ((org.telegram.ui.Components.x70) this.d).b();
                                b10.d(layout, spanStart, f10);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                org.telegram.ui.Components.x70 x70Var2 = (org.telegram.ui.Components.x70) this.d;
                                if (x70Var2 != null) {
                                    CharacterStyle characterStyle = x70Var2.f40221i;
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
                    n0Var.f(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public q9(Context context, Paint paint) {
        super(context);
        this.f48997b = paint;
        this.f48999e = new n2.n0(this);
    }
}
