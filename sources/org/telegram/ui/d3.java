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
public final class d3 implements org.telegram.ui.Cells.x9, ij0, org.telegram.ui.Components.fz0 {
    public int B = -1;
    public int C = -1;
    public int D = -1;
    public org.telegram.ui.Components.q5 E;
    public ArrayList F;
    public Stack G;
    public AtomicReference H;
    public View I;
    public final n70 f33493a;
    public View f33494b;
    public boolean f33495c;
    public StaticLayout d;
    public org.telegram.ui.Components.y80 e;
    public org.telegram.ui.Components.y80 f33496f;
    public org.telegram.ui.Components.y80 h;
    public TL_iv.PageBlock f33497n;
    public TL_iv.RichText f33498r;
    public int f33499s;
    public int v;
    public int f33500w;
    public CharSequence f33501x;
    public SpannableStringBuilder f33502y;

    public d3(n70 n70Var) {
        this.f33493a = n70Var;
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
        this.f33495c = true;
        this.f33494b = view;
        n70 n70Var = this.f33493a;
        float f10 = 0.0f;
        if (!n70Var.B.isEmpty()) {
            u3 u3Var = (u3) n70Var.B.get(n70Var.D);
            if (u3Var.f38836c == this.f33497n && ((obj = u3Var.f38835b) == (richText = this.f33498r) || ((obj instanceof String) && richText == null))) {
                if (-1 != u3Var.f38834a) {
                    org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(0);
                    this.h = y80Var;
                    y80Var.f30937n = false;
                    y80Var.d(this.d, u3Var.f38834a, 0.0f);
                    this.h.f30938o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = u3Var.f38834a;
                    staticLayout.getSelectionPath(i10, n70Var.C.length() + i10, this.h);
                    this.h.f30937n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.y80 y80Var2 = this.h;
        if (y80Var2 != null) {
            canvas.drawPath(y80Var2, l4.f35925v1);
        }
        org.telegram.ui.Components.y80 y80Var3 = this.e;
        if (y80Var3 != null) {
            canvas.drawPath(y80Var3, l4.f35924u1);
        }
        org.telegram.ui.Components.y80 y80Var4 = this.f33496f;
        if (y80Var4 != null) {
            canvas.drawPath(y80Var4, l4.f35926w1);
        }
        if (n70Var.f36477c.g(canvas, this)) {
            view.invalidate();
        }
        if (n70Var.d == this && n70Var.f36476b == null && n70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f10 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f10, 0.0f, f10 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), l4.f35923t1);
        }
        ArrayList arrayList = this.F;
        if (arrayList != null && !arrayList.isEmpty()) {
            ih.k.g(view, false, this.d.getPaint().getColor(), 0, this.H, 0, this.d, this.F, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f33495c = false;
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
        return this.f33494b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f33501x;
    }

    @Override
    public final int getRow() {
        return this.f33500w;
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
        return this.f33499s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f33500w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f33499s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
