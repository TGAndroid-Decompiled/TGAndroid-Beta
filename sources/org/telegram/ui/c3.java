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
public final class c3 implements org.telegram.ui.Cells.da, tj0, org.telegram.ui.Components.oz0 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.u5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final t70 f31509a;
    public View f31510b;
    public boolean f31511c;
    public StaticLayout d;
    public org.telegram.ui.Components.g90 e;
    public org.telegram.ui.Components.g90 f31512f;
    public org.telegram.ui.Components.g90 h;
    public TL_iv.PageBlock f31513n;
    public TL_iv.RichText f31514r;
    public int f31515s;
    public int v;
    public int f31516w;
    public CharSequence f31517x;
    public SpannableStringBuilder f31518y;

    public c3(t70 t70Var) {
        this.f31509a = t70Var;
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
            this.H = org.telegram.ui.Components.y5.update(0, view, false, this.H, staticLayout);
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
        org.telegram.ui.Components.y5.release(view, this.H);
        this.L = null;
    }

    @Override
    public final void draw(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.f31511c = true;
        this.f31510b = view;
        t70 t70Var = this.f31509a;
        float f7 = 0.0f;
        if (!t70Var.E.isEmpty()) {
            s3 s3Var = (s3) t70Var.E.get(t70Var.G);
            if (s3Var.f36539c == this.f31513n && ((obj = s3Var.f36538b) == (richText = this.f31514r) || ((obj instanceof String) && richText == null))) {
                if (-1 != s3Var.f36537a) {
                    org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(0);
                    this.h = g90Var;
                    g90Var.f23303n = false;
                    g90Var.d(this.d, s3Var.f36537a, 0.0f);
                    this.h.f23304o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = s3Var.f36537a;
                    staticLayout.getSelectionPath(i10, t70Var.F.length() + i10, this.h);
                    this.h.f23303n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.g90 g90Var2 = this.h;
        if (g90Var2 != null) {
            canvas.drawPath(g90Var2, j4.f33898y1);
        }
        org.telegram.ui.Components.g90 g90Var3 = this.e;
        if (g90Var3 != null) {
            canvas.drawPath(g90Var3, j4.f33897x1);
        }
        org.telegram.ui.Components.g90 g90Var4 = this.f31512f;
        if (g90Var4 != null) {
            canvas.drawPath(g90Var4, j4.f33899z1);
        }
        if (t70Var.f36856c.g(canvas, this)) {
            view.invalidate();
        }
        if (t70Var.d == this && t70Var.f36855b == null && t70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), j4.f33896w1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            uh.h.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f31511c = false;
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
        return this.f31510b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f31517x;
    }

    @Override
    public final int getRow() {
        return this.f31516w;
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
        return this.f31515s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f31516w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f31515s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
