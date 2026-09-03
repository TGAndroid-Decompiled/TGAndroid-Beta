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
public final class f3 implements org.telegram.ui.Cells.w9, kj0, org.telegram.ui.Components.fz0 {
    public int B = -1;
    public int C = -1;
    public int D = -1;
    public org.telegram.ui.Components.q5 E;
    public ArrayList F;
    public Stack G;
    public AtomicReference H;
    public View I;
    public final p70 f33927a;
    public View f33928b;
    public boolean f33929c;
    public StaticLayout d;
    public org.telegram.ui.Components.y80 e;
    public org.telegram.ui.Components.y80 f33930f;
    public org.telegram.ui.Components.y80 h;
    public TL_iv.PageBlock f33931n;
    public TL_iv.RichText f33932r;
    public int f33933s;
    public int v;
    public int f33934w;
    public CharSequence f33935x;
    public SpannableStringBuilder f33936y;

    public f3(p70 p70Var) {
        this.f33927a = p70Var;
    }

    public final int a() {
        int i10 = this.B;
        if (i10 != -1) {
            return i10;
        }
        this.B = this.d.getWidth();
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.B = Math.min(this.B, (int) this.d.getLineLeft(i11));
        }
        return this.B;
    }

    @Override
    public final void attach(View view) {
        this.I = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.E = org.telegram.ui.Components.u5.update(0, view, false, this.E, staticLayout);
        }
    }

    public final int b() {
        int i10 = this.C;
        if (i10 != -1) {
            return i10;
        }
        this.C = 0;
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.C = Math.max(this.C, (int) this.d.getLineRight(i11));
        }
        return this.C;
    }

    public final int c() {
        int i10 = this.D;
        if (i10 != -1) {
            return i10;
        }
        this.D = 0;
        if (this.d.getLineCount() > 0) {
            int i11 = this.D;
            StaticLayout staticLayout = this.d;
            this.D = Math.max(i11, (int) staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        return this.D;
    }

    @Override
    public final void detach(View view) {
        if (view == null) {
            view = this.I;
        }
        org.telegram.ui.Components.u5.release(view, this.E);
        this.I = null;
    }

    @Override
    public final void draw(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.f33929c = true;
        this.f33928b = view;
        p70 p70Var = this.f33927a;
        float f10 = 0.0f;
        if (!p70Var.B.isEmpty()) {
            w3 w3Var = (w3) p70Var.B.get(p70Var.D);
            if (w3Var.f39260c == this.f33931n && ((obj = w3Var.f39259b) == (richText = this.f33932r) || ((obj instanceof String) && richText == null))) {
                if (-1 != w3Var.f39258a) {
                    org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(0);
                    this.h = y80Var;
                    y80Var.f30951n = false;
                    y80Var.d(this.d, w3Var.f39258a, 0.0f);
                    this.h.f30952o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = w3Var.f39258a;
                    staticLayout.getSelectionPath(i10, p70Var.C.length() + i10, this.h);
                    this.h.f30951n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.y80 y80Var2 = this.h;
        if (y80Var2 != null) {
            canvas.drawPath(y80Var2, n4.f36355v1);
        }
        org.telegram.ui.Components.y80 y80Var3 = this.e;
        if (y80Var3 != null) {
            canvas.drawPath(y80Var3, n4.f36354u1);
        }
        org.telegram.ui.Components.y80 y80Var4 = this.f33930f;
        if (y80Var4 != null) {
            canvas.drawPath(y80Var4, n4.f36356w1);
        }
        if (p70Var.f36982c.g(canvas, this)) {
            view.invalidate();
        }
        if (p70Var.d == this && p70Var.f36981b == null && p70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f10 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f10, 0.0f, f10 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), n4.f36353t1);
        }
        ArrayList arrayList = this.F;
        if (arrayList != null && !arrayList.isEmpty()) {
            ih.k.g(view, false, this.d.getPaint().getColor(), 0, this.H, 0, this.d, this.F, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f33929c = false;
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
        View view = this.I;
        if (view != null) {
            return view;
        }
        return this.f33928b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f33935x;
    }

    @Override
    public final int getRow() {
        return this.f33934w;
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
        return this.f33933s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f33934w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f33933s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
