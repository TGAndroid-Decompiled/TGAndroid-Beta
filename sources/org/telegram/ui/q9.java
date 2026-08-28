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
import org.telegram.messenger.AndroidUtilities;
public final class q9 extends TextView {
    public final int f41720a = 0;
    public final Paint f41721b;
    public Path f41722c;
    public Object d;
    public final Object f41723e;

    public q9(org.telegram.ui.Components.sm0 sm0Var, Context context) {
        super(context);
        this.f41723e = sm0Var;
        this.f41722c = new Path();
        this.d = new RectF();
        this.f41721b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f41720a) {
            case 1:
                int l1 = org.telegram.ui.ActionBar.f6.l1(0.15f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.o6, ((org.telegram.ui.Components.sm0) this.f41723e).f32520c));
                Paint paint = this.f41721b;
                paint.setColor(l1);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f41722c;
                Paint paint2 = hg.s0.V;
                hg.s0.h(rectF, AndroidUtilities.rectTmp, path);
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
        switch (this.f41720a) {
            case 0:
                org.telegram.ui.Components.f80 f80Var = (org.telegram.ui.Components.f80) this.f41722c;
                if (f80Var != null) {
                    canvas.drawPath(f80Var, this.f41721b);
                }
                if (((org.telegram.ui.Components.i80) this.f41723e).f(canvas)) {
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
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f41720a) {
            case 1:
                org.telegram.ui.Components.sm0 sm0Var = (org.telegram.ui.Components.sm0) this.f41723e;
                super.onLayout(z10, i9, i10, i11, i12);
                int width = getWidth();
                int i13 = 0;
                for (int i14 = 0; i14 < sm0Var.getChildCount(); i14++) {
                    width = Math.min(width, sm0Var.getChildAt(i14).getLeft());
                    i13 = Math.max(i13, sm0Var.getChildAt(i14).getRight());
                }
                setPivotX((width + i13) / 2.0f);
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        float f10;
        switch (this.f41720a) {
            case 0:
                super.onMeasure(i9, i10);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.p41[] p41VarArr = (org.telegram.ui.Components.p41[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.p41.class);
                    if (p41VarArr != null && p41VarArr.length > 0) {
                        org.telegram.ui.Components.f80 f80Var = new org.telegram.ui.Components.f80(0);
                        this.f41722c = f80Var;
                        f80Var.f28333n = false;
                        for (int i13 = 0; i13 < p41VarArr.length; i13++) {
                            int spanStart = spanned.getSpanStart(p41VarArr[i13]);
                            int spanEnd = spanned.getSpanEnd(p41VarArr[i13]);
                            ((org.telegram.ui.Components.f80) this.f41722c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i11 = getPaint().baselineShift;
                            } else {
                                i11 = 0;
                            }
                            org.telegram.ui.Components.f80 f80Var2 = (org.telegram.ui.Components.f80) this.f41722c;
                            if (i11 != 0) {
                                if (i11 > 0) {
                                    f10 = 5.0f;
                                } else {
                                    f10 = -2.0f;
                                }
                                i12 = AndroidUtilities.dp(f10) + i11;
                            } else {
                                i12 = 0;
                            }
                            f80Var2.f28334o = i12;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.f80) this.f41722c);
                        }
                        ((org.telegram.ui.Components.f80) this.f41722c).f28333n = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f41720a) {
            case 0:
                org.telegram.ui.Components.i80 i80Var = (org.telegram.ui.Components.i80) this.f41723e;
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
                            i80Var.d(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.m80 m80Var = new org.telegram.ui.Components.m80(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = m80Var;
                                m80Var.d(771751935);
                                i80Var.a((org.telegram.ui.Components.m80) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.m80) this.d).f30768i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.m80) this.d).f30768i);
                                org.telegram.ui.Components.f80 b10 = ((org.telegram.ui.Components.m80) this.d).b();
                                b10.d(layout, spanStart, f10);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                org.telegram.ui.Components.m80 m80Var2 = (org.telegram.ui.Components.m80) this.d;
                                if (m80Var2 != null) {
                                    CharacterStyle characterStyle = m80Var2.f30768i;
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
                    i80Var.d(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public q9(Context context, Paint paint) {
        super(context);
        this.f41721b = paint;
        this.f41723e = new org.telegram.ui.Components.i80(this);
    }
}
