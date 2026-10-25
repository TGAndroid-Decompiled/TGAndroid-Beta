package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.view.View;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class a3 implements org.telegram.ui.Cells.da, dj0, org.telegram.ui.Components.i01 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.y5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final h70 f37625a;
    public View f37626b;
    public boolean f37627c;
    public StaticLayout d;
    public org.telegram.ui.Components.s90 e;
    public org.telegram.ui.Components.s90 f37628f;
    public org.telegram.ui.Components.s90 h;
    public TL_iv.PageBlock f37629n;
    public TL_iv.RichText f37630r;
    public int f37631s;
    public int v;
    public int f37632w;
    public CharSequence f37633x;
    public SpannableStringBuilder f37634y;

    public a3(h70 h70Var) {
        this.f37625a = h70Var;
    }

    public final int a() {
        int i10 = this.E;
        if (i10 != -1) {
            return i10;
        }
        this.E = this.d.getWidth();
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.E = Math.min(this.E, (int) this.d.getLineLeft(i11));
        }
        return this.E;
    }

    @Override
    public final void attach(View view) {
        this.L = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.H = org.telegram.ui.Components.c6.update(0, view, false, this.H, staticLayout);
        }
    }

    public final int b() {
        int i10 = this.F;
        if (i10 != -1) {
            return i10;
        }
        this.F = 0;
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.F = Math.max(this.F, (int) this.d.getLineRight(i11));
        }
        return this.F;
    }

    public final int c() {
        int i10 = this.G;
        if (i10 != -1) {
            return i10;
        }
        this.G = 0;
        if (this.d.getLineCount() > 0) {
            int i11 = this.G;
            StaticLayout staticLayout = this.d;
            this.G = Math.max(i11, (int) staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        return this.G;
    }

    @Override
    public final void detach(View view) {
        if (view == null) {
            view = this.L;
        }
        org.telegram.ui.Components.c6.release(view, this.H);
        this.L = null;
    }

    @Override
    public final void draw(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.f37627c = true;
        this.f37626b = view;
        h70 h70Var = this.f37625a;
        float f7 = 0.0f;
        if (!h70Var.E.isEmpty()) {
            r3 r3Var = (r3) h70Var.E.get(h70Var.G);
            if (r3Var.f42986c == this.f37629n && ((obj = r3Var.f42985b) == (richText = this.f37630r) || ((obj instanceof String) && richText == null))) {
                if (-1 != r3Var.f42984a) {
                    org.telegram.ui.Components.s90 s90Var = new org.telegram.ui.Components.s90(0);
                    this.h = s90Var;
                    s90Var.f32484n = false;
                    s90Var.d(this.d, r3Var.f42984a, 0.0f);
                    this.h.f32485o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = r3Var.f42984a;
                    staticLayout.getSelectionPath(i10, h70Var.F.length() + i10, this.h);
                    this.h.f32484n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.s90 s90Var2 = this.h;
        if (s90Var2 != null) {
            canvas.drawPath(s90Var2, j4.f40424z1);
        }
        org.telegram.ui.Components.s90 s90Var3 = this.e;
        if (s90Var3 != null) {
            canvas.drawPath(s90Var3, j4.f40423y1);
        }
        org.telegram.ui.Components.s90 s90Var4 = this.f37628f;
        if (s90Var4 != null) {
            canvas.drawPath(s90Var4, j4.A1);
        }
        if (h70Var.f39918c.g(canvas, this)) {
            view.invalidate();
        }
        if (h70Var.d == this && h70Var.f39917b == null && h70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), j4.f40422x1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            xh.g.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f37627c = false;
    }

    @Override
    public final int getEmojiOnlyCount() {
        return 0;
    }

    @Override
    public final Layout getLayout() {
        return this.d;
    }

    @Override
    public final View getParentView() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        return this.f37626b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f37633x;
    }

    @Override
    public final int getRow() {
        return this.f37632w;
    }

    @Override
    public final Rect getSelectionBounds() {
        return null;
    }

    @Override
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override
    public final int getX() {
        return this.f37631s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f37632w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f37631s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
