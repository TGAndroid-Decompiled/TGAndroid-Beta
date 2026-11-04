package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
public final class bq0 extends yh.l {
    public final org.telegram.ui.Cells.r9 V;
    public ArrayList W;
    public boolean f44125a0;
    public Layout f44126b0;
    public org.telegram.ui.Components.l5 f44127c0;
    public boolean f44128d0;
    public org.telegram.ui.Components.w70 f44129e0;
    public Layout f44130f0;
    public Path f44131g0;

    public bq0(Context context, zp0 zp0Var, org.telegram.ui.Cells.r9 r9Var, final org.telegram.messenger.n10 n10Var, final org.telegram.messenger.p10 p10Var) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.G = new org.telegram.ui.Components.r70(this) {
            public final bq0 f43825b;

            {
                this.f43825b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        bq0 bq0Var = this.f43825b;
                        bq0Var.getClass();
                        ((org.telegram.messenger.n10) n10Var).a(clickableSpan, bq0Var);
                        return;
                    default:
                        bq0 bq0Var2 = this.f43825b;
                        ((org.telegram.messenger.p10) n10Var).a(clickableSpan, bq0Var2, new sg0(bq0Var2, 24));
                        return;
                }
            }
        };
        this.H = new org.telegram.ui.Components.r70(this) {
            public final bq0 f43825b;

            {
                this.f43825b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        bq0 bq0Var = this.f43825b;
                        bq0Var.getClass();
                        ((org.telegram.messenger.n10) p10Var).a(clickableSpan, bq0Var);
                        return;
                    default:
                        bq0 bq0Var2 = this.f43825b;
                        ((org.telegram.messenger.p10) p10Var).a(clickableSpan, bq0Var2, new sg0(bq0Var2, 24));
                        return;
                }
            }
        };
        this.V = r9Var;
        b8.tf.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(b8.mf.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new b40(zp0Var, 20));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        float f10;
        if (this.f44128d0) {
            Layout layout = getLayout();
            Path path = this.f44131g0;
            if (path == null || this.f44130f0 != layout) {
                if (path == null) {
                    this.f44131g0 = new Path();
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
                        this.f44131g0.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f11, getPaddingLeft() + lineRight, getPaddingTop() + f10, Path.Direction.CW);
                        i10++;
                        f11 = f10;
                    }
                }
                this.f44130f0 = layout;
            }
            if (this.f44129e0 == null) {
                org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70();
                this.f44129e0 = w70Var;
                w70Var.f39945y = this.f44131g0;
                w70Var.k(4.0f);
                this.f44129e0.g(org.telegram.ui.ActionBar.k6.r1(0.3f, -1), org.telegram.ui.ActionBar.k6.r1(0.1f, -1), org.telegram.ui.ActionBar.k6.r1(0.2f, -1), org.telegram.ui.ActionBar.k6.r1(0.7f, -1));
                this.f44129e0.setCallback(this);
            }
            this.f44129e0.setBounds(0, 0, getWidth(), getHeight());
            this.f44129e0.draw(canvas);
        }
        if (this.f44128d0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 178, 31);
        }
        if (this.W != null && this.f44125a0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i11 = 0; i11 < this.W.size(); i11++) {
                org.telegram.ui.Components.tg0 tg0Var = (org.telegram.ui.Components.tg0) this.W.get(i11);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                if (this.f44125a0) {
                    i3 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i3 = 0;
                }
                getPaint();
                tg0Var.a(canvas, width + i3, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.f44128d0) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, getLayout(), this.f44127c0, 0.0f, this.f59555b, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.p5.release(this, this.f44127c0);
        this.W = org.telegram.ui.Components.xg0.e(null, this.W);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.r9 r9Var = this.V;
        if (r9Var != null && r9Var.x()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (r9Var != null && getStaticTextLayout() != null && r9Var.f30290p0 == this) {
                r9Var.W(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.f44126b0 != getLayout()) {
            boolean z10 = true;
            int i3 = 0;
            this.f44127c0 = org.telegram.ui.Components.p5.update(0, this, this.f44127c0, getLayout());
            this.W = org.telegram.ui.Components.xg0.e(getLayout(), this.W);
            if (getLayout() == null || !(getLayout().getText() instanceof Spanned) || ((org.telegram.ui.Components.wg0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.wg0.class)).length <= 0) {
                z10 = false;
            }
            this.f44125a0 = z10;
            if (z10) {
                i3 = 32;
            }
            b8.tf.a(this, 16.0f, 8.0f, i3 + 16, 8.0f);
            this.f44126b0 = getLayout();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        this.f44127c0 = org.telegram.ui.Components.p5.update(0, this, this.f44127c0, getLayout());
        this.W = org.telegram.ui.Components.xg0.e(getLayout(), this.W);
    }

    public void setLoading(boolean z10) {
        if (this.f44128d0 == z10) {
            return;
        }
        this.f44128d0 = z10;
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
        if (drawable != this.f44129e0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
