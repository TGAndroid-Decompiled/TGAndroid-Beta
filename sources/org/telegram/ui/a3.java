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
import org.telegram.tgnet.tl.TL_iv;
public final class a3 implements org.telegram.ui.Cells.s9, lg0, org.telegram.ui.Components.dx0 {
    public SpannableStringBuilder E;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public org.telegram.ui.Components.l5 I;
    public ArrayList J;
    public Stack K;
    public AtomicReference L;
    public View M;
    public final i50 f43572a;
    public View f43573b;
    public boolean f43574c;
    public StaticLayout d;
    public org.telegram.ui.Components.n70 f43575e;
    public org.telegram.ui.Components.n70 f43576f;
    public org.telegram.ui.Components.n70 h;
    public TL_iv.PageBlock f43577n;
    public TL_iv.RichText f43578r;
    public int f43579s;
    public int f43580w;
    public int f43581x;
    public CharSequence f43582y;

    public a3(i50 i50Var) {
        this.f43572a = i50Var;
    }

    @Override
    public final Layout a() {
        return this.d;
    }

    @Override
    public final int b() {
        return 0;
    }

    @Override
    public final Rect c() {
        return null;
    }

    @Override
    public final void d(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.f43574c = true;
        this.f43573b = view;
        i50 i50Var = this.f43572a;
        float f10 = 0.0f;
        if (!i50Var.F.isEmpty()) {
            q3 q3Var = (q3) i50Var.F.get(i50Var.H);
            if (q3Var.f48742c == this.f43577n && ((obj = q3Var.f48741b) == (richText = this.f43578r) || ((obj instanceof String) && richText == null))) {
                if (-1 != q3Var.f48740a) {
                    org.telegram.ui.Components.n70 n70Var = new org.telegram.ui.Components.n70(0);
                    this.h = n70Var;
                    n70Var.f36403n = false;
                    n70Var.d(this.d, q3Var.f48740a, 0.0f);
                    this.h.f36404o = 0;
                    StaticLayout staticLayout = this.d;
                    int i3 = q3Var.f48740a;
                    staticLayout.getSelectionPath(i3, i50Var.G.length() + i3, this.h);
                    this.h.f36403n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.n70 n70Var2 = this.h;
        if (n70Var2 != null) {
            canvas.drawPath(n70Var2, i4.A1);
        }
        org.telegram.ui.Components.n70 n70Var3 = this.f43575e;
        if (n70Var3 != null) {
            canvas.drawPath(n70Var3, i4.f46076z1);
        }
        org.telegram.ui.Components.n70 n70Var4 = this.f43576f;
        if (n70Var4 != null) {
            canvas.drawPath(n70Var4, i4.B1);
        }
        if (i50Var.f46112c.i(canvas, this)) {
            view.invalidate();
        }
        if (i50Var.d == this && i50Var.f46111b == null && i50Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f10 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-org.telegram.messenger.g0.L(2.0f)) + f10, 0.0f, f10 + width + org.telegram.messenger.g0.L(2.0f), this.d.getHeight(), i4.f46075y1);
        }
        ArrayList arrayList = this.J;
        if (arrayList != null && !arrayList.isEmpty()) {
            yh.f.g(view, false, this.d.getPaint().getColor(), 0, this.L, 0, this.d, this.J, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f43574c = false;
    }

    @Override
    public final View e() {
        View view = this.M;
        if (view != null) {
            return view;
        }
        return this.f43573b;
    }

    @Override
    public final void f(View view) {
        if (view == null) {
            view = this.M;
        }
        org.telegram.ui.Components.p5.release(view, this.I);
        this.M = null;
    }

    @Override
    public final void g(int i3) {
        this.f43581x = i3;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f43582y;
    }

    @Override
    public final int getRow() {
        return this.f43581x;
    }

    @Override
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override
    public final int getX() {
        return this.f43579s;
    }

    @Override
    public final int getY() {
        return this.f43580w;
    }

    @Override
    public final void h(int i3) {
        this.f43580w = i3;
    }

    @Override
    public final void i(View view) {
        this.M = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.I = org.telegram.ui.Components.p5.update(0, view, false, this.I, staticLayout);
        }
    }

    @Override
    public final void j(int i3) {
        this.f43579s = i3;
    }

    public final int k() {
        int i3 = this.F;
        if (i3 != -1) {
            return i3;
        }
        this.F = this.d.getWidth();
        for (int i10 = 0; i10 < this.d.getLineCount(); i10++) {
            this.F = Math.min(this.F, (int) this.d.getLineLeft(i10));
        }
        return this.F;
    }

    public final int l() {
        int i3 = this.G;
        if (i3 != -1) {
            return i3;
        }
        this.G = 0;
        for (int i10 = 0; i10 < this.d.getLineCount(); i10++) {
            this.G = Math.max(this.G, (int) this.d.getLineRight(i10));
        }
        return this.G;
    }

    public final int m() {
        int i3 = this.H;
        if (i3 != -1) {
            return i3;
        }
        this.H = 0;
        if (this.d.getLineCount() > 0) {
            int i10 = this.H;
            StaticLayout staticLayout = this.d;
            this.H = Math.max(i10, (int) staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        return this.H;
    }
}
