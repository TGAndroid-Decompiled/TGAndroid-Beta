package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ot0 extends dh.u {
    public final org.telegram.ui.Cells.x9 N;
    public ArrayList O;
    public boolean P;
    public Layout Q;
    public org.telegram.ui.Components.p5 R;
    public boolean S;
    public org.telegram.ui.Components.p80 T;
    public Layout U;
    public Path V;

    public ot0(Context context, mt0 mt0Var, org.telegram.ui.Cells.x9 x9Var, final Utilities.Callback2 callback2, final Utilities.Callback3 callback3) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.f4676x = new org.telegram.ui.Components.k80(this) {
            public final ot0 f40810b;

            {
                this.f40810b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        ot0 ot0Var = this.f40810b;
                        ot0Var.getClass();
                        ((Utilities.Callback2) callback2).run(clickableSpan, ot0Var);
                        return;
                    default:
                        ot0 ot0Var2 = this.f40810b;
                        ((Utilities.Callback3) callback2).run(clickableSpan, ot0Var2, new zk0(ot0Var2, 22));
                        return;
                }
            }
        };
        this.f4677y = new org.telegram.ui.Components.k80(this) {
            public final ot0 f40810b;

            {
                this.f40810b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        ot0 ot0Var = this.f40810b;
                        ot0Var.getClass();
                        ((Utilities.Callback2) callback3).run(clickableSpan, ot0Var);
                        return;
                    default:
                        ot0 ot0Var2 = this.f40810b;
                        ((Utilities.Callback3) callback3).run(clickableSpan, ot0Var2, new zk0(ot0Var2, 22));
                        return;
                }
            }
        };
        this.N = x9Var;
        g7.k6.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(g7.e6.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new q50(mt0Var, 20));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i9;
        float f10;
        if (this.S) {
            Layout layout = getLayout();
            Path path = this.V;
            if (path == null || this.U != layout) {
                if (path == null) {
                    this.V = new Path();
                } else {
                    path.rewind();
                }
                if (layout != null) {
                    float dp = AndroidUtilities.dp(16.0f);
                    float dp2 = AndroidUtilities.dp(8.0f);
                    int i10 = 0;
                    float f11 = 0.0f;
                    while (i10 < layout.getLineCount()) {
                        float f12 = dp / 3.0f;
                        float lineLeft = layout.getLineLeft(i10) - f12;
                        float lineRight = layout.getLineRight(i10) + f12;
                        if (i10 == 0) {
                            f11 = layout.getLineTop(i10) - (dp2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i10);
                        if (i10 >= layout.getLineCount() - 1) {
                            f10 = (dp2 / 3.0f) + lineBottom;
                        } else {
                            f10 = lineBottom;
                        }
                        this.V.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f11, getPaddingLeft() + lineRight, getPaddingTop() + f10, Path.Direction.CW);
                        i10++;
                        f11 = f10;
                    }
                }
                this.U = layout;
            }
            if (this.T == null) {
                org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80();
                this.T = p80Var;
                p80Var.f31591x = this.V;
                p80Var.j(4.0f);
                this.T.f(org.telegram.ui.ActionBar.f6.l1(0.3f, -1), org.telegram.ui.ActionBar.f6.l1(0.1f, -1), org.telegram.ui.ActionBar.f6.l1(0.2f, -1), org.telegram.ui.ActionBar.f6.l1(0.7f, -1));
                this.T.setCallback(this);
            }
            this.T.setBounds(0, 0, getWidth(), getHeight());
            this.T.draw(canvas);
        }
        if (this.S) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 178, 31);
        }
        if (this.O != null && this.P) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            for (int i11 = 0; i11 < this.O.size(); i11++) {
                org.telegram.ui.Components.bi0 bi0Var = (org.telegram.ui.Components.bi0) this.O.get(i11);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                if (this.P) {
                    i9 = AndroidUtilities.dp(32.0f);
                } else {
                    i9 = 0;
                }
                getPaint();
                bi0Var.a(canvas, width + i9, -1);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (this.S) {
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getScrollY() + getHeight()) - (getPaddingBottom() * 0.75f));
        org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, getLayout(), this.R, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.t5.release(this, this.R);
        this.O = org.telegram.ui.Components.fi0.e(null, this.O);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.x9 x9Var = this.N;
        if (x9Var != null && x9Var.y()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (x9Var != null && getStaticTextLayout() != null && x9Var.f25959u0 == this) {
                x9Var.X(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.Q != getLayout()) {
            boolean z10 = true;
            int i9 = 0;
            this.R = org.telegram.ui.Components.t5.update(0, this, this.R, getLayout());
            this.O = org.telegram.ui.Components.fi0.e(getLayout(), this.O);
            z10 = (getLayout() == null || !(getLayout().getText() instanceof Spanned) || ((org.telegram.ui.Components.ei0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.ei0.class)).length <= 0) ? false : false;
            this.P = z10;
            if (z10) {
                i9 = 32;
            }
            g7.k6.a(this, 16.0f, 8.0f, i9 + 16, 8.0f);
            this.Q = getLayout();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        this.R = org.telegram.ui.Components.t5.update(0, this, this.R, getLayout());
        this.O = org.telegram.ui.Components.fi0.e(getLayout(), this.O);
    }

    public void setLoading(boolean z10) {
        if (this.S == z10) {
            return;
        }
        this.S = z10;
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
        if (drawable != this.T && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
