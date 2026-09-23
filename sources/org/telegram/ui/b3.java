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
public final class b3 implements org.telegram.ui.Cells.ca, mj0, org.telegram.ui.Components.bz0 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.v5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final r70 f31941a;
    public View f31942b;
    public boolean f31943c;
    public StaticLayout d;
    public org.telegram.ui.Components.x80 e;
    public org.telegram.ui.Components.x80 f31944f;
    public org.telegram.ui.Components.x80 h;
    public TL_iv.PageBlock f31945n;
    public TL_iv.RichText f31946r;
    public int f31947s;
    public int v;
    public int f31948w;
    public CharSequence f31949x;
    public SpannableStringBuilder f31950y;

    public b3(r70 r70Var) {
        this.f31941a = r70Var;
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
            this.H = org.telegram.ui.Components.z5.update(0, view, false, this.H, staticLayout);
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
        org.telegram.ui.Components.z5.release(view, this.H);
        this.L = null;
    }

    @Override
    public final void draw(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.f31943c = true;
        this.f31942b = view;
        r70 r70Var = this.f31941a;
        float f7 = 0.0f;
        if (!r70Var.E.isEmpty()) {
            r3 r3Var = (r3) r70Var.E.get(r70Var.G);
            if (r3Var.f36676c == this.f31945n && ((obj = r3Var.f36675b) == (richText = this.f31946r) || ((obj instanceof String) && richText == null))) {
                if (-1 != r3Var.f36674a) {
                    org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(0);
                    this.h = x80Var;
                    x80Var.f29950n = false;
                    x80Var.d(this.d, r3Var.f36674a, 0.0f);
                    this.h.f29951o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = r3Var.f36674a;
                    staticLayout.getSelectionPath(i10, r70Var.F.length() + i10, this.h);
                    this.h.f29950n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.x80 x80Var2 = this.h;
        if (x80Var2 != null) {
            canvas.drawPath(x80Var2, i4.f33999y1);
        }
        org.telegram.ui.Components.x80 x80Var3 = this.e;
        if (x80Var3 != null) {
            canvas.drawPath(x80Var3, i4.f33998x1);
        }
        org.telegram.ui.Components.x80 x80Var4 = this.f31944f;
        if (x80Var4 != null) {
            canvas.drawPath(x80Var4, i4.f34000z1);
        }
        if (r70Var.f36711c.g(canvas, this)) {
            view.invalidate();
        }
        if (r70Var.d == this && r70Var.f36710b == null && r70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), i4.f33997w1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            vh.h.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f31943c = false;
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
        return this.f31942b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f31949x;
    }

    @Override
    public final int getRow() {
        return this.f31948w;
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
        return this.f31947s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f31948w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f31947s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
