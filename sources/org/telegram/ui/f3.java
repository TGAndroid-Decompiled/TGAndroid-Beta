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
public final class f3 implements org.telegram.ui.Cells.v9, aj0, org.telegram.ui.Components.uy0 {
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public org.telegram.ui.Components.u5 D;
    public ArrayList E;
    public Stack F;
    public AtomicReference G;
    public View H;
    public final d70 f37967a;
    public View f37968b;
    public boolean f37969c;
    public StaticLayout d;
    public org.telegram.ui.Components.s80 f37970e;
    public org.telegram.ui.Components.s80 f37971f;
    public org.telegram.ui.Components.s80 h;
    public TL_iv.PageBlock f37972n;
    public TL_iv.RichText f37973r;
    public int f37974s;
    public int v;
    public int f37975w;
    public CharSequence f37976x;
    public SpannableStringBuilder f37977y;

    public f3(d70 d70Var) {
        this.f37967a = d70Var;
    }

    public final int a() {
        int i10 = this.A;
        if (i10 != -1) {
            return i10;
        }
        this.A = this.d.getWidth();
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.A = Math.min(this.A, (int) this.d.getLineLeft(i11));
        }
        return this.A;
    }

    @Override
    public final void attach(View view) {
        this.H = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.D = org.telegram.ui.Components.y5.update(0, view, false, this.D, staticLayout);
        }
    }

    public final int b() {
        int i10 = this.B;
        if (i10 != -1) {
            return i10;
        }
        this.B = 0;
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.B = Math.max(this.B, (int) this.d.getLineRight(i11));
        }
        return this.B;
    }

    public final int c() {
        int i10 = this.C;
        if (i10 != -1) {
            return i10;
        }
        this.C = 0;
        if (this.d.getLineCount() > 0) {
            int i11 = this.C;
            StaticLayout staticLayout = this.d;
            this.C = Math.max(i11, (int) staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        return this.C;
    }

    @Override
    public final void detach(View view) {
        if (view == null) {
            view = this.H;
        }
        org.telegram.ui.Components.y5.release(view, this.D);
        this.H = null;
    }

    @Override
    public final void draw(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.f37969c = true;
        this.f37968b = view;
        d70 d70Var = this.f37967a;
        float f9 = 0.0f;
        if (!d70Var.A.isEmpty()) {
            v3 v3Var = (v3) d70Var.A.get(d70Var.C);
            if (v3Var.f43412c == this.f37972n && ((obj = v3Var.f43411b) == (richText = this.f37973r) || ((obj instanceof String) && richText == null))) {
                if (-1 != v3Var.f43410a) {
                    org.telegram.ui.Components.s80 s80Var = new org.telegram.ui.Components.s80(0);
                    this.h = s80Var;
                    s80Var.f32546n = false;
                    s80Var.d(this.d, v3Var.f43410a, 0.0f);
                    this.h.f32547o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = v3Var.f43410a;
                    staticLayout.getSelectionPath(i10, d70Var.B.length() + i10, this.h);
                    this.h.f32546n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.s80 s80Var2 = this.h;
        if (s80Var2 != null) {
            canvas.drawPath(s80Var2, m4.f40385u1);
        }
        org.telegram.ui.Components.s80 s80Var3 = this.f37970e;
        if (s80Var3 != null) {
            canvas.drawPath(s80Var3, m4.f40384t1);
        }
        org.telegram.ui.Components.s80 s80Var4 = this.f37971f;
        if (s80Var4 != null) {
            canvas.drawPath(s80Var4, m4.f40386v1);
        }
        if (d70Var.f37381c.g(canvas, this)) {
            view.invalidate();
        }
        if (d70Var.d == this && d70Var.f37380b == null && d70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f9 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f9, 0.0f, f9 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), m4.f40383s1);
        }
        ArrayList arrayList = this.E;
        if (arrayList != null && !arrayList.isEmpty()) {
            gh.k.g(view, false, this.d.getPaint().getColor(), 0, this.G, 0, this.d, this.E, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f37969c = false;
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
        View view = this.H;
        if (view != null) {
            return view;
        }
        return this.f37968b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f37976x;
    }

    @Override
    public final int getRow() {
        return this.f37975w;
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
        return this.f37974s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f37975w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f37974s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
