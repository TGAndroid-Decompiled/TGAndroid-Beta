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
public final class d3 implements org.telegram.ui.Cells.x9, jj0, org.telegram.ui.Components.fz0 {
    public int B = -1;
    public int C = -1;
    public int D = -1;
    public org.telegram.ui.Components.q5 E;
    public ArrayList F;
    public Stack G;
    public AtomicReference H;
    public View I;
    public final o70 f35957a;
    public View f35958b;
    public boolean f35959c;
    public StaticLayout d;
    public org.telegram.ui.Components.z80 f35960e;
    public org.telegram.ui.Components.z80 f35961f;
    public org.telegram.ui.Components.z80 h;
    public TL_iv.PageBlock f35962n;
    public TL_iv.RichText f35963r;
    public int f35964s;
    public int v;
    public int f35965w;
    public CharSequence f35966x;
    public SpannableStringBuilder f35967y;

    public d3(o70 o70Var) {
        this.f35957a = o70Var;
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
        this.f35959c = true;
        this.f35958b = view;
        o70 o70Var = this.f35957a;
        float f10 = 0.0f;
        if (!o70Var.B.isEmpty()) {
            u3 u3Var = (u3) o70Var.B.get(o70Var.D);
            if (u3Var.f41717c == this.f35962n && ((obj = u3Var.f41716b) == (richText = this.f35963r) || ((obj instanceof String) && richText == null))) {
                if (-1 != u3Var.f41715a) {
                    org.telegram.ui.Components.z80 z80Var = new org.telegram.ui.Components.z80(0);
                    this.h = z80Var;
                    z80Var.f33864n = false;
                    z80Var.d(this.d, u3Var.f41715a, 0.0f);
                    this.h.f33865o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = u3Var.f41715a;
                    staticLayout.getSelectionPath(i10, o70Var.C.length() + i10, this.h);
                    this.h.f33864n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.z80 z80Var2 = this.h;
        if (z80Var2 != null) {
            canvas.drawPath(z80Var2, l4.f38504v1);
        }
        org.telegram.ui.Components.z80 z80Var3 = this.f35960e;
        if (z80Var3 != null) {
            canvas.drawPath(z80Var3, l4.f38503u1);
        }
        org.telegram.ui.Components.z80 z80Var4 = this.f35961f;
        if (z80Var4 != null) {
            canvas.drawPath(z80Var4, l4.f38505w1);
        }
        if (o70Var.f39555c.g(canvas, this)) {
            view.invalidate();
        }
        if (o70Var.d == this && o70Var.f39554b == null && o70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f10 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f10, 0.0f, f10 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), l4.f38502t1);
        }
        ArrayList arrayList = this.F;
        if (arrayList != null && !arrayList.isEmpty()) {
            jh.k.g(view, false, this.d.getPaint().getColor(), 0, this.H, 0, this.d, this.F, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f35959c = false;
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
        return this.f35958b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f35966x;
    }

    @Override
    public final int getRow() {
        return this.f35965w;
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
        return this.f35964s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f35965w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f35964s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
