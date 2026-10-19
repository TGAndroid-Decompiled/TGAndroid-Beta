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
public final class d3 implements org.telegram.ui.Cells.y9, bj0, org.telegram.ui.Components.wz0 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.w5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final b70 f36257a;
    public View f36258b;
    public boolean f36259c;
    public StaticLayout d;
    public org.telegram.ui.Components.r90 e;
    public org.telegram.ui.Components.r90 f36260f;
    public org.telegram.ui.Components.r90 h;
    public TL_iv.PageBlock f36261n;
    public TL_iv.RichText f36262r;
    public int f36263s;
    public int v;
    public int f36264w;
    public CharSequence f36265x;
    public SpannableStringBuilder f36266y;

    public d3(b70 b70Var) {
        this.f36257a = b70Var;
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
            this.H = org.telegram.ui.Components.a6.update(0, view, false, this.H, staticLayout);
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
        org.telegram.ui.Components.a6.release(view, this.H);
        this.L = null;
    }

    @Override
    public final void draw(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.f36259c = true;
        this.f36258b = view;
        b70 b70Var = this.f36257a;
        float f7 = 0.0f;
        if (!b70Var.E.isEmpty()) {
            t3 t3Var = (t3) b70Var.E.get(b70Var.G);
            if (t3Var.f41582c == this.f36261n && ((obj = t3Var.f41581b) == (richText = this.f36262r) || ((obj instanceof String) && richText == null))) {
                if (-1 != t3Var.f41580a) {
                    org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(0);
                    this.h = r90Var;
                    r90Var.f29896n = false;
                    r90Var.d(this.d, t3Var.f41580a, 0.0f);
                    this.h.f29897o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = t3Var.f41580a;
                    staticLayout.getSelectionPath(i10, b70Var.F.length() + i10, this.h);
                    this.h.f29896n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.r90 r90Var2 = this.h;
        if (r90Var2 != null) {
            canvas.drawPath(r90Var2, l4.f38752y1);
        }
        org.telegram.ui.Components.r90 r90Var3 = this.e;
        if (r90Var3 != null) {
            canvas.drawPath(r90Var3, l4.f38751x1);
        }
        org.telegram.ui.Components.r90 r90Var4 = this.f36260f;
        if (r90Var4 != null) {
            canvas.drawPath(r90Var4, l4.f38753z1);
        }
        if (b70Var.f35533c.g(canvas, this)) {
            view.invalidate();
        }
        if (b70Var.d == this && b70Var.f35532b == null && b70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), l4.f38750w1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            wh.g.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f36259c = false;
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
        return this.f36258b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f36265x;
    }

    @Override
    public final int getRow() {
        return this.f36264w;
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
        return this.f36263s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f36264w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f36263s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
