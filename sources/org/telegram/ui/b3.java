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
public final class b3 implements org.telegram.ui.Cells.z9, tj0, org.telegram.ui.Components.d01 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.x5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final t70 f36110a;
    public View f36111b;
    public boolean f36112c;
    public StaticLayout d;
    public org.telegram.ui.Components.y90 f36113e;
    public org.telegram.ui.Components.y90 f36114f;
    public org.telegram.ui.Components.y90 h;
    public TL_iv.PageBlock f36115n;
    public TL_iv.RichText f36116r;
    public int f36117s;
    public int v;
    public int f36118w;
    public CharSequence f36119x;
    public SpannableStringBuilder f36120y;

    public b3(t70 t70Var) {
        this.f36110a = t70Var;
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
        this.f36112c = true;
        this.f36111b = view;
        t70 t70Var = this.f36110a;
        float f7 = 0.0f;
        if (!t70Var.E.isEmpty()) {
            r3 r3Var = (r3) t70Var.E.get(t70Var.G);
            if (r3Var.f41259c == this.f36115n && ((obj = r3Var.f41258b) == (richText = this.f36116r) || ((obj instanceof String) && richText == null))) {
                if (-1 != r3Var.f41257a) {
                    org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(0);
                    this.h = y90Var;
                    y90Var.f33174n = false;
                    y90Var.d(this.d, r3Var.f41257a, 0.0f);
                    this.h.f33175o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = r3Var.f41257a;
                    staticLayout.getSelectionPath(i10, t70Var.F.length() + i10, this.h);
                    this.h.f33174n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.y90 y90Var2 = this.h;
        if (y90Var2 != null) {
            canvas.drawPath(y90Var2, i4.f38493y1);
        }
        org.telegram.ui.Components.y90 y90Var3 = this.f36113e;
        if (y90Var3 != null) {
            canvas.drawPath(y90Var3, i4.f38492x1);
        }
        org.telegram.ui.Components.y90 y90Var4 = this.f36114f;
        if (y90Var4 != null) {
            canvas.drawPath(y90Var4, i4.f38494z1);
        }
        if (t70Var.f41886c.g(canvas, this)) {
            view.invalidate();
        }
        if (t70Var.d == this && t70Var.f41885b == null && t70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), i4.f38491w1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            vh.g.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f36112c = false;
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
        return this.f36111b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f36119x;
    }

    @Override
    public final int getRow() {
        return this.f36118w;
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
        return this.f36117s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f36118w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f36117s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
