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
public final class b3 implements org.telegram.ui.Cells.ba, uj0, org.telegram.ui.Components.bz0 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.v5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final v70 f34638a;
    public View f34639b;
    public boolean f34640c;
    public StaticLayout d;
    public org.telegram.ui.Components.x80 f34641e;
    public org.telegram.ui.Components.x80 f34642f;
    public org.telegram.ui.Components.x80 h;
    public TL_iv.PageBlock f34643n;
    public TL_iv.RichText f34644r;
    public int f34645s;
    public int v;
    public int f34646w;
    public CharSequence f34647x;
    public SpannableStringBuilder f34648y;

    public b3(v70 v70Var) {
        this.f34638a = v70Var;
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
        this.f34640c = true;
        this.f34639b = view;
        v70 v70Var = this.f34638a;
        float f7 = 0.0f;
        if (!v70Var.E.isEmpty()) {
            r3 r3Var = (r3) v70Var.E.get(v70Var.G);
            if (r3Var.f40081c == this.f34643n && ((obj = r3Var.f40080b) == (richText = this.f34644r) || ((obj instanceof String) && richText == null))) {
                if (-1 != r3Var.f40079a) {
                    org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(0);
                    this.h = x80Var;
                    x80Var.f32485n = false;
                    x80Var.d(this.d, r3Var.f40079a, 0.0f);
                    this.h.f32486o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = r3Var.f40079a;
                    staticLayout.getSelectionPath(i10, v70Var.F.length() + i10, this.h);
                    this.h.f32485n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.x80 x80Var2 = this.h;
        if (x80Var2 != null) {
            canvas.drawPath(x80Var2, i4.f37238y1);
        }
        org.telegram.ui.Components.x80 x80Var3 = this.f34641e;
        if (x80Var3 != null) {
            canvas.drawPath(x80Var3, i4.f37237x1);
        }
        org.telegram.ui.Components.x80 x80Var4 = this.f34642f;
        if (x80Var4 != null) {
            canvas.drawPath(x80Var4, i4.f37239z1);
        }
        if (v70Var.f41463c.g(canvas, this)) {
            view.invalidate();
        }
        if (v70Var.d == this && v70Var.f41462b == null && v70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), i4.f37236w1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            wh.h.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f34640c = false;
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
        return this.f34639b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f34647x;
    }

    @Override
    public final int getRow() {
        return this.f34646w;
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
        return this.f34645s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f34646w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f34645s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
