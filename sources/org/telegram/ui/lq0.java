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
    public final org.telegram.ui.Cells.t9 V;
    public ArrayList W;
    public boolean f49689a0;
    public Layout f49690b0;
    public org.telegram.ui.Components.u5 f49691c0;
    public boolean f49692d0;
    public org.telegram.ui.Components.q80 f49693e0;
    public Layout f49694f0;
    public Path f49695g0;

    public lq0(Context context, jq0 jq0Var, org.telegram.ui.Cells.t9 t9Var, final org.telegram.messenger.r10 r10Var, final org.telegram.messenger.t10 t10Var) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.G = new org.telegram.ui.Components.l80(this) {
            public final lq0 f49377b;

            {
                this.f49377b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        lq0 lq0Var = this.f49377b;
                        lq0Var.getClass();
                        ((org.telegram.messenger.r10) r10Var).a(clickableSpan, lq0Var);
                        return;
                    default:
                        lq0 lq0Var2 = this.f49377b;
                        ((org.telegram.messenger.t10) r10Var).a(clickableSpan, lq0Var2, new hf0(lq0Var2, 25));
                        return;
                }
            }
        };
        this.H = new org.telegram.ui.Components.l80(this) {
            public final lq0 f49377b;

            {
                this.f49377b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        lq0 lq0Var = this.f49377b;
                        lq0Var.getClass();
                        ((org.telegram.messenger.r10) t10Var).a(clickableSpan, lq0Var);
                        return;
                    default:
                        lq0 lq0Var2 = this.f49377b;
                        ((org.telegram.messenger.t10) t10Var).a(clickableSpan, lq0Var2, new hf0(lq0Var2, 25));
                        return;
                }
            }
        };
        this.V = t9Var;
        c8.xa.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(c8.ma.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new j40(jq0Var, 20));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        float f10;
        if (this.f49692d0) {
            Layout layout = getLayout();
            Path path = this.f49695g0;
            if (path == null || this.f49694f0 != layout) {
                if (path == null) {
                    this.f49695g0 = new Path();
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
                        this.f49695g0.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f11, getPaddingLeft() + lineRight, getPaddingTop() + f10, Path.Direction.CW);
                        i10++;
                        f11 = f10;
                    }
                }
                this.f49694f0 = layout;
            }
            if (this.f49693e0 == null) {
                org.telegram.ui.Components.q80 q80Var = new org.telegram.ui.Components.q80();
                this.f49693e0 = q80Var;
                q80Var.f38833y = this.f49695g0;
                q80Var.k(4.0f);
                this.f49693e0.g(org.telegram.ui.ActionBar.m6.r1(0.3f, -1), org.telegram.ui.ActionBar.m6.r1(0.1f, -1), org.telegram.ui.ActionBar.m6.r1(0.2f, -1), org.telegram.ui.ActionBar.m6.r1(0.7f, -1));
                this.f49693e0.setCallback(this);
            }
            this.f49693e0.setBounds(0, 0, getWidth(), getHeight());
            this.f49693e0.draw(canvas);
        }
        if (this.f49692d0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 178, 31);
        }
        if (this.W != null && this.f49689a0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i11 = 0; i11 < this.W.size(); i11++) {
                org.telegram.ui.Components.fh0 fh0Var = (org.telegram.ui.Components.fh0) this.W.get(i11);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                if (this.f49689a0) {
                    i7 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i7 = 0;
                }
                getPaint();
                fh0Var.a(canvas, width + i7, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.f49692d0) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, getLayout(), this.f49691c0, 0.0f, this.f60640b, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.y5.release(this, this.f49691c0);
        this.W = org.telegram.ui.Components.jh0.e(null, this.W);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.t9 t9Var = this.V;
        if (t9Var != null && t9Var.x()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (t9Var != null && getStaticTextLayout() != null && t9Var.f31886p0 == this) {
                t9Var.W(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.f49690b0 != getLayout()) {
            boolean z10 = true;
            int i7 = 0;
            this.f49691c0 = org.telegram.ui.Components.y5.update(0, this, this.f49691c0, getLayout());
            this.W = org.telegram.ui.Components.jh0.e(getLayout(), this.W);
            if (getLayout() == null || !(getLayout().getText() instanceof Spanned) || ((org.telegram.ui.Components.ih0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.ih0.class)).length <= 0) {
                z10 = false;
            }
            this.f49689a0 = z10;
            if (z10) {
                i7 = 32;
            }
            c8.xa.a(this, 16.0f, 8.0f, i7 + 16, 8.0f);
            this.f49690b0 = getLayout();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        this.f49691c0 = org.telegram.ui.Components.y5.update(0, this, this.f49691c0, getLayout());
        this.W = org.telegram.ui.Components.jh0.e(getLayout(), this.W);
    }

    public void setLoading(boolean z10) {
        if (this.f49692d0 == z10) {
            return;
        }
        this.f49692d0 = z10;
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
        if (drawable != this.f49693e0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
