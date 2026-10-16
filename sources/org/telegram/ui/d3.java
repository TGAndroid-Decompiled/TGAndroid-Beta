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
public final class d3 implements org.telegram.ui.Cells.z9, xj0, org.telegram.ui.Components.a01 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.x5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final z70 f34855a;
    public View f34856b;
    public boolean f34857c;
    public StaticLayout d;
    public org.telegram.ui.Components.x90 e;
    public org.telegram.ui.Components.x90 f34858f;
    public org.telegram.ui.Components.x90 h;
    public TL_iv.PageBlock f34859n;
    public TL_iv.RichText f34860r;
    public int f34861s;
    public int v;
    public int f34862w;
    public CharSequence f34863x;
    public SpannableStringBuilder f34864y;

    public d3(z70 z70Var) {
        this.f34855a = z70Var;
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
            this.H = org.telegram.ui.Components.b6.update(0, view, false, this.H, staticLayout);
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
        org.telegram.ui.Components.b6.release(view, this.H);
        this.L = null;
    }

    @Override
    public final void draw(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.f34857c = true;
        this.f34856b = view;
        z70 z70Var = this.f34855a;
        float f7 = 0.0f;
        if (!z70Var.E.isEmpty()) {
            t3 t3Var = (t3) z70Var.E.get(z70Var.G);
            if (t3Var.f39997c == this.f34859n && ((obj = t3Var.f39996b) == (richText = this.f34860r) || ((obj instanceof String) && richText == null))) {
                if (-1 != t3Var.f39995a) {
                    org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(0);
                    this.h = x90Var;
                    x90Var.f30898n = false;
                    x90Var.d(this.d, t3Var.f39995a, 0.0f);
                    this.h.f30899o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = t3Var.f39995a;
                    staticLayout.getSelectionPath(i10, z70Var.F.length() + i10, this.h);
                    this.h.f30898n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.x90 x90Var2 = this.h;
        if (x90Var2 != null) {
            canvas.drawPath(x90Var2, k4.f37256y1);
        }
        org.telegram.ui.Components.x90 x90Var3 = this.e;
        if (x90Var3 != null) {
            canvas.drawPath(x90Var3, k4.f37255x1);
        }
        org.telegram.ui.Components.x90 x90Var4 = this.f34858f;
        if (x90Var4 != null) {
            canvas.drawPath(x90Var4, k4.f37257z1);
        }
        if (z70Var.f42176c.g(canvas, this)) {
            view.invalidate();
        }
        if (z70Var.d == this && z70Var.f42175b == null && z70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), k4.f37254w1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            wh.g.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f34857c = false;
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
        return this.f34856b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f34863x;
    }

    @Override
    public final int getRow() {
        return this.f34862w;
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
        return this.f34861s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f34862w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f34861s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
