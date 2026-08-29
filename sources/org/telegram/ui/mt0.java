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
public final class mt0 extends gh.s {
    public final org.telegram.ui.Cells.u9 N;
    public ArrayList O;
    public boolean P;
    public Layout Q;
    public org.telegram.ui.Components.u5 R;
    public boolean S;
    public org.telegram.ui.Components.c90 T;
    public Layout U;
    public Path V;

    public mt0(Context context, kt0 kt0Var, org.telegram.ui.Cells.u9 u9Var, final Utilities.Callback2 callback2, final Utilities.Callback3 callback3) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.f7464x = new org.telegram.ui.Components.x80(this) {
            public final mt0 f40276b;

            {
                this.f40276b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        mt0 mt0Var = this.f40276b;
                        mt0Var.getClass();
                        ((Utilities.Callback2) callback2).run(clickableSpan, mt0Var);
                        return;
                    default:
                        mt0 mt0Var2 = this.f40276b;
                        ((Utilities.Callback3) callback2).run(clickableSpan, mt0Var2, new vk0(mt0Var2, 22));
                        return;
                }
            }
        };
        this.f7465y = new org.telegram.ui.Components.x80(this) {
            public final mt0 f40276b;

            {
                this.f40276b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r3) {
                    case 0:
                        mt0 mt0Var = this.f40276b;
                        mt0Var.getClass();
                        ((Utilities.Callback2) callback3).run(clickableSpan, mt0Var);
                        return;
                    default:
                        mt0 mt0Var2 = this.f40276b;
                        ((Utilities.Callback3) callback3).run(clickableSpan, mt0Var2, new vk0(mt0Var2, 22));
                        return;
                }
            }
        };
        this.N = u9Var;
        i7.l6.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(i7.f6.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new t50(kt0Var, 20));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        float f9;
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
                    int i11 = 0;
                    float f10 = 0.0f;
                    while (i11 < layout.getLineCount()) {
                        float f11 = dp / 3.0f;
                        float lineLeft = layout.getLineLeft(i11) - f11;
                        float lineRight = layout.getLineRight(i11) + f11;
                        if (i11 == 0) {
                            f10 = layout.getLineTop(i11) - (dp2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i11);
                        if (i11 >= layout.getLineCount() - 1) {
                            f9 = (dp2 / 3.0f) + lineBottom;
                        } else {
                            f9 = lineBottom;
                        }
                        this.V.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f10, getPaddingLeft() + lineRight, getPaddingTop() + f9, Path.Direction.CW);
                        i11++;
                        f10 = f9;
                    }
                }
                this.U = layout;
            }
            if (this.T == null) {
                org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90();
                this.T = c90Var;
                c90Var.f27400x = this.V;
                c90Var.j(4.0f);
                this.T.f(org.telegram.ui.ActionBar.g6.l1(0.3f, -1), org.telegram.ui.ActionBar.g6.l1(0.1f, -1), org.telegram.ui.ActionBar.g6.l1(0.2f, -1), org.telegram.ui.ActionBar.g6.l1(0.7f, -1));
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
            for (int i12 = 0; i12 < this.O.size(); i12++) {
                org.telegram.ui.Components.mi0 mi0Var = (org.telegram.ui.Components.mi0) this.O.get(i12);
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                if (this.P) {
                    i10 = AndroidUtilities.dp(32.0f);
                } else {
                    i10 = 0;
                }
                getPaint();
                mi0Var.a(canvas, width + i10, -1);
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
        org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, getLayout(), this.R, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
        canvas.restore();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.y5.release(this, this.R);
        this.O = org.telegram.ui.Components.qi0.e(null, this.O);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Cells.u9 u9Var = this.N;
        if (u9Var != null && u9Var.y()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (u9Var != null && getStaticTextLayout() != null && u9Var.f25745u0 == this) {
                u9Var.X(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.Q != getLayout()) {
            boolean z10 = true;
            int i10 = 0;
            this.R = org.telegram.ui.Components.y5.update(0, this, this.R, getLayout());
            this.O = org.telegram.ui.Components.qi0.e(getLayout(), this.O);
            z10 = (getLayout() == null || !(getLayout().getText() instanceof Spanned) || ((org.telegram.ui.Components.pi0[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), org.telegram.ui.Components.pi0.class)).length <= 0) ? false : false;
            this.P = z10;
            if (z10) {
                i10 = 32;
            }
            i7.l6.a(this, 16.0f, 8.0f, i10 + 16, 8.0f);
            this.Q = getLayout();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        this.R = org.telegram.ui.Components.y5.update(0, this, this.R, getLayout());
        this.O = org.telegram.ui.Components.qi0.e(getLayout(), this.O);
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
