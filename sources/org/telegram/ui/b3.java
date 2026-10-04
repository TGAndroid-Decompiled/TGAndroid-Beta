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
public final class b3 implements org.telegram.ui.Cells.ba, pj0, org.telegram.ui.Components.xz0 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.v5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final t70 f34971a;
    public View f34972b;
    public boolean f34973c;
    public StaticLayout d;
    public org.telegram.ui.Components.k90 f34974e;
    public org.telegram.ui.Components.k90 f34975f;
    public org.telegram.ui.Components.k90 h;
    public TL_iv.PageBlock f34976n;
    public TL_iv.RichText f34977r;
    public int f34978s;
    public int v;
    public int f34979w;
    public CharSequence f34980x;
    public SpannableStringBuilder f34981y;

    public b3(t70 t70Var) {
        this.f34971a = t70Var;
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
        this.f34973c = true;
        this.f34972b = view;
        t70 t70Var = this.f34971a;
        float f7 = 0.0f;
        if (!t70Var.E.isEmpty()) {
            r3 r3Var = (r3) t70Var.E.get(t70Var.G);
            if (r3Var.f39898c == this.f34976n && ((obj = r3Var.f39897b) == (richText = this.f34977r) || ((obj instanceof String) && richText == null))) {
                if (-1 != r3Var.f39896a) {
                    org.telegram.ui.Components.k90 k90Var = new org.telegram.ui.Components.k90(0);
                    this.h = k90Var;
                    k90Var.f28035n = false;
                    k90Var.d(this.d, r3Var.f39896a, 0.0f);
                    this.h.f28036o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = r3Var.f39896a;
                    staticLayout.getSelectionPath(i10, t70Var.F.length() + i10, this.h);
                    this.h.f28035n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.k90 k90Var2 = this.h;
        if (k90Var2 != null) {
            canvas.drawPath(k90Var2, i4.f37252y1);
        }
        org.telegram.ui.Components.k90 k90Var3 = this.f34974e;
        if (k90Var3 != null) {
            canvas.drawPath(k90Var3, i4.f37251x1);
        }
        org.telegram.ui.Components.k90 k90Var4 = this.f34975f;
        if (k90Var4 != null) {
            canvas.drawPath(k90Var4, i4.f37253z1);
        }
        if (t70Var.f40703c.g(canvas, this)) {
            view.invalidate();
        }
        if (t70Var.d == this && t70Var.f40702b == null && t70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), i4.f37250w1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            vh.g.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f34973c = false;
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
        return this.f34972b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f34980x;
    }

    @Override
    public final int getRow() {
        return this.f34979w;
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
        return this.f34978s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f34979w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f34978s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
