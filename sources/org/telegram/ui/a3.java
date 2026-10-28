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
public final class a3 implements org.telegram.ui.Cells.da, fj0, org.telegram.ui.Components.j01 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.y5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final j70 f37660a;
    public View f37661b;
    public boolean f37662c;
    public StaticLayout d;
    public org.telegram.ui.Components.t90 e;
    public org.telegram.ui.Components.t90 f37663f;
    public org.telegram.ui.Components.t90 h;
    public TL_iv.PageBlock f37664n;
    public TL_iv.RichText f37665r;
    public int f37666s;
    public int v;
    public int f37667w;
    public CharSequence f37668x;
    public SpannableStringBuilder f37669y;

    public a3(j70 j70Var) {
        this.f37660a = j70Var;
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
        this.f37662c = true;
        this.f37661b = view;
        j70 j70Var = this.f37660a;
        float f7 = 0.0f;
        if (!j70Var.E.isEmpty()) {
            r3 r3Var = (r3) j70Var.E.get(j70Var.G);
            if (r3Var.f42840c == this.f37664n && ((obj = r3Var.f42839b) == (richText = this.f37665r) || ((obj instanceof String) && richText == null))) {
                if (-1 != r3Var.f42838a) {
                    org.telegram.ui.Components.t90 t90Var = new org.telegram.ui.Components.t90(0);
                    this.h = t90Var;
                    t90Var.f32913n = false;
                    t90Var.d(this.d, r3Var.f42838a, 0.0f);
                    this.h.f32914o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = r3Var.f42838a;
                    staticLayout.getSelectionPath(i10, j70Var.F.length() + i10, this.h);
                    this.h.f32913n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.t90 t90Var2 = this.h;
        if (t90Var2 != null) {
            canvas.drawPath(t90Var2, j4.f40392z1);
        }
        org.telegram.ui.Components.t90 t90Var3 = this.e;
        if (t90Var3 != null) {
            canvas.drawPath(t90Var3, j4.f40391y1);
        }
        org.telegram.ui.Components.t90 t90Var4 = this.f37663f;
        if (t90Var4 != null) {
            canvas.drawPath(t90Var4, j4.A1);
        }
        if (j70Var.f40450c.g(canvas, this)) {
            view.invalidate();
        }
        if (j70Var.d == this && j70Var.f40449b == null && j70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), j4.f40390x1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            xh.g.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f37662c = false;
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
        return this.f37661b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f37668x;
    }

    @Override
    public final int getRow() {
        return this.f37667w;
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
        return this.f37666s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f37667w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f37666s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
