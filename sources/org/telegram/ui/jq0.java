package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
public final class jq0 extends xh.l {
    public final org.telegram.ui.Cells.s9 U;
    public ArrayList V;
    public boolean W;
    public Layout f47001a0;
    public org.telegram.ui.Components.n5 f47002b0;
    public boolean f47003c0;
    public org.telegram.ui.Components.a80 f47004d0;
    public Layout f47005e0;
    public Path f47006f0;

    public jq0(Context context, hq0 hq0Var, org.telegram.ui.Cells.s9 s9Var, final org.telegram.messenger.v10 v10Var, final org.telegram.messenger.x10 x10Var) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.F = new org.telegram.ui.Components.v70(this) {
            public final jq0 f46709b;

            {
                this.f46709b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        jq0 jq0Var = this.f46709b;
                        jq0Var.getClass();
                        ((org.telegram.messenger.v10) v10Var).a(clickableSpan, jq0Var);
                        return;
                    default:
                        jq0 jq0Var2 = this.f46709b;
                        ((org.telegram.messenger.x10) v10Var).a(clickableSpan, jq0Var2, new ef0(jq0Var2, 25));
                        return;
                }
            }
        };
        this.G = new org.telegram.ui.Components.v70(this) {
            public final jq0 f46709b;

            {
                this.f46709b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        jq0 jq0Var = this.f46709b;
                        jq0Var.getClass();
                        ((org.telegram.messenger.v10) x10Var).a(clickableSpan, jq0Var);
                        return;
                    default:
                        jq0 jq0Var2 = this.f46709b;
                        ((org.telegram.messenger.x10) x10Var).a(clickableSpan, jq0Var2, new ef0(jq0Var2, 25));
                        return;
                }
            }
        };
        this.U = s9Var;
        c8.ra.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(c8.ha.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new g40(hq0Var, 20));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        float f10;
        if (this.f47003c0) {
            Layout layout = getLayout();
            Path path = this.f47006f0;
            if (path == null || this.f47005e0 != layout) {
                if (path == null) {
                    this.f47006f0 = new Path();
                } else {
                    path.rewind();
                }
                if (layout != null) {
                    float L = org.telegram.messenger.g0.L(16.0f);
                    float L2 = org.telegram.messenger.g0.L(8.0f);
                    float f11 = 0.0f;
                    int i10 = 0;
                    while (i10 < layout.getLineCount()) {
                        float f12 = L / 3.0f;
                        float lineLeft = layout.getLineLeft(i10) - f12;
                        float lineRight = layout.getLineRight(i10) + f12;
                        if (i10 == 0) {
                            f11 = layout.getLineTop(i10) - (L2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i10);
                        if (i10 >= layout.getLineCount() - 1) {
                            f10 = (L2 / 3.0f) + lineBottom;
                        } else {
                            f10 = lineBottom;
                        }
                        this.f47006f0.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f11, getPaddingLeft() + lineRight, getPaddingTop() + f10, Path.Direction.CW);
                        i10++;
                        f11 = f10;
                    }
                }
                this.f47005e0 = layout;
            }
            if (this.f47004d0 == null) {
                org.telegram.ui.Components.a80 a80Var = new org.telegram.ui.Components.a80();
                this.f47004d0 = a80Var;
                a80Var.f31735y = this.f47006f0;
                a80Var.k(4.0f);
                this.f47004d0.g(org.telegram.ui.ActionBar.k6.r1(0.3f, -1), org.telegram.ui.ActionBar.k6.r1(0.1f, -1), org.telegram.ui.ActionBar.k6.r1(0.2f, -1), org.telegram.ui.ActionBar.k6.r1(0.7f, -1));
                this.f47004d0.setCallback(this);
            }
            this.f47004d0.setBounds(0, 0, getWidth(), getHeight());
            this.f47004d0.draw(canvas);
        }
        if (this.f47003c0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 178, 31);
        }
        if (this.V != null && this.W) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i11 = 0; i11 < this.V.size(); i11++) {
                org.telegram.ui.Components.qg0 qg0Var = (org.telegram.ui.Components.qg0) this.V.get(i11);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                if (this.W) {
                    i7 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i7 = 0;
                }
                getPaint();
                qg0Var.a(canvas, width + i7, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.f47003c0) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, getLayout(), this.f47002b0, 0.0f, this.f58718b, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.r5.release(this, this.f47002b0);
        this.V = org.telegram.ui.Components.ug0.e(null, this.V);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.s9 s9Var = this.U;
        if (s9Var != null && s9Var.x()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (s9Var != null && getStaticTextLayout() != null && s9Var.f30283p0 == this) {
                s9Var.W(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.f47001a0 != getLayout()) {
            boolean z9 = true;
            int i7 = 0;
            this.f47002b0 = org.telegram.ui.Components.r5.update(0, this, this.f47002b0, getLayout());
            this.V = org.telegram.ui.Components.ug0.e(getLayout(), this.V);
            if (getLayout() == null || !(getLayout().getText() instanceof Spanned) || ((org.telegram.ui.Components.tg0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.tg0.class)).length <= 0) {
                z9 = false;
            }
            this.W = z9;
            if (z9) {
                i7 = 32;
            }
            c8.ra.a(this, 16.0f, 8.0f, i7 + 16, 8.0f);
            this.f47001a0 = getLayout();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        this.f47002b0 = org.telegram.ui.Components.r5.update(0, this, this.f47002b0, getLayout());
        this.V = org.telegram.ui.Components.ug0.e(getLayout(), this.V);
    }

    public void setLoading(boolean z9) {
        if (this.f47003c0 == z9) {
            return;
        }
        this.f47003c0 = z9;
        invalidate();
    }

    @Override
    public void setPressed(boolean z9) {
        boolean z10;
        if (z9 != isPressed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.setPressed(z9);
        if (z10) {
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f47004d0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
