package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
public final class lq0 extends xh.l {
    public final org.telegram.ui.Cells.s9 V;
    public ArrayList W;
    public boolean f49809a0;
    public Layout f49810b0;
    public org.telegram.ui.Components.t5 f49811c0;
    public boolean f49812d0;
    public org.telegram.ui.Components.n80 f49813e0;
    public Layout f49814f0;
    public Path f49815g0;

    public lq0(Context context, jq0 jq0Var, org.telegram.ui.Cells.s9 s9Var, final org.telegram.messenger.p10 p10Var, final org.telegram.messenger.r10 r10Var) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.G = new org.telegram.ui.Components.i80(this) {
            public final lq0 f49513b;

            {
                this.f49513b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        lq0 lq0Var = this.f49513b;
                        lq0Var.getClass();
                        ((org.telegram.messenger.p10) p10Var).a(clickableSpan, lq0Var);
                        return;
                    default:
                        lq0 lq0Var2 = this.f49513b;
                        ((org.telegram.messenger.r10) p10Var).a(clickableSpan, lq0Var2, new gf0(lq0Var2, 25));
                        return;
                }
            }
        };
        this.H = new org.telegram.ui.Components.i80(this) {
            public final lq0 f49513b;

            {
                this.f49513b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        lq0 lq0Var = this.f49513b;
                        lq0Var.getClass();
                        ((org.telegram.messenger.p10) r10Var).a(clickableSpan, lq0Var);
                        return;
                    default:
                        lq0 lq0Var2 = this.f49513b;
                        ((org.telegram.messenger.r10) r10Var).a(clickableSpan, lq0Var2, new gf0(lq0Var2, 25));
                        return;
                }
            }
        };
        this.V = s9Var;
        c8.ya.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(c8.na.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new i40(jq0Var, 20));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        float f10;
        if (this.f49812d0) {
            Layout layout = getLayout();
            Path path = this.f49815g0;
            if (path == null || this.f49814f0 != layout) {
                if (path == null) {
                    this.f49815g0 = new Path();
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
                        this.f49815g0.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f11, getPaddingLeft() + lineRight, getPaddingTop() + f10, Path.Direction.CW);
                        i10++;
                        f11 = f10;
                    }
                }
                this.f49814f0 = layout;
            }
            if (this.f49813e0 == null) {
                org.telegram.ui.Components.n80 n80Var = new org.telegram.ui.Components.n80();
                this.f49813e0 = n80Var;
                n80Var.f37730y = this.f49815g0;
                n80Var.k(4.0f);
                this.f49813e0.g(org.telegram.ui.ActionBar.n6.r1(0.3f, -1), org.telegram.ui.ActionBar.n6.r1(0.1f, -1), org.telegram.ui.ActionBar.n6.r1(0.2f, -1), org.telegram.ui.ActionBar.n6.r1(0.7f, -1));
                this.f49813e0.setCallback(this);
            }
            this.f49813e0.setBounds(0, 0, getWidth(), getHeight());
            this.f49813e0.draw(canvas);
        }
        if (this.f49812d0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 178, 31);
        }
        if (this.W != null && this.f49809a0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i11 = 0; i11 < this.W.size(); i11++) {
                org.telegram.ui.Components.eh0 eh0Var = (org.telegram.ui.Components.eh0) this.W.get(i11);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                if (this.f49809a0) {
                    i7 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i7 = 0;
                }
                getPaint();
                eh0Var.a(canvas, width + i7, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.f49812d0) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, getLayout(), this.f49811c0, 0.0f, this.f60723b, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.x5.release(this, this.f49811c0);
        this.W = org.telegram.ui.Components.ih0.e(null, this.W);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.s9 s9Var = this.V;
        if (s9Var != null && s9Var.x()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (s9Var != null && getStaticTextLayout() != null && s9Var.f31873p0 == this) {
                s9Var.W(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.f49810b0 != getLayout()) {
            boolean z10 = true;
            int i7 = 0;
            this.f49811c0 = org.telegram.ui.Components.x5.update(0, this, this.f49811c0, getLayout());
            this.W = org.telegram.ui.Components.ih0.e(getLayout(), this.W);
            if (getLayout() == null || !(getLayout().getText() instanceof Spanned) || ((org.telegram.ui.Components.hh0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.hh0.class)).length <= 0) {
                z10 = false;
            }
            this.f49809a0 = z10;
            if (z10) {
                i7 = 32;
            }
            c8.ya.a(this, 16.0f, 8.0f, i7 + 16, 8.0f);
            this.f49810b0 = getLayout();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        this.f49811c0 = org.telegram.ui.Components.x5.update(0, this, this.f49811c0, getLayout());
        this.W = org.telegram.ui.Components.ih0.e(getLayout(), this.W);
    }

    public void setLoading(boolean z10) {
        if (this.f49812d0 == z10) {
            return;
        }
        this.f49812d0 = z10;
        invalidate();
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        if (z10 != isPressed()) {
            z11 = true;
        } else {
            z11 = false;
        }
        super.setPressed(z10);
        if (z11) {
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f49813e0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
