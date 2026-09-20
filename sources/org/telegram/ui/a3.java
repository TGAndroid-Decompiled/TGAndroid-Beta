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
public final class a3 implements org.telegram.ui.Cells.ca, vj0, org.telegram.ui.Components.nz0 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.u5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final u70 f31969a;
    public View f31970b;
    public boolean f31971c;
    public StaticLayout d;
    public org.telegram.ui.Components.e90 e;
    public org.telegram.ui.Components.e90 f31972f;
    public org.telegram.ui.Components.e90 h;
    public TL_iv.PageBlock f31973n;
    public TL_iv.RichText f31974r;
    public int f31975s;
    public int v;
    public int f31976w;
    public CharSequence f31977x;
    public SpannableStringBuilder f31978y;

    public a3(u70 u70Var) {
        this.f31969a = u70Var;
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
        this.f31971c = true;
        this.f31970b = view;
        u70 u70Var = this.f31969a;
        float f7 = 0.0f;
        if (!u70Var.E.isEmpty()) {
            q3 q3Var = (q3) u70Var.E.get(u70Var.G);
            if (q3Var.f36751c == this.f31973n && ((obj = q3Var.f36750b) == (richText = this.f31974r) || ((obj instanceof String) && richText == null))) {
                if (-1 != q3Var.f36749a) {
                    org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(0);
                    this.h = e90Var;
                    e90Var.f23785n = false;
                    e90Var.d(this.d, q3Var.f36749a, 0.0f);
                    this.h.f23786o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = q3Var.f36749a;
                    staticLayout.getSelectionPath(i10, u70Var.F.length() + i10, this.h);
                    this.h.f23785n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.e90 e90Var2 = this.h;
        if (e90Var2 != null) {
            canvas.drawPath(e90Var2, h4.f34092y1);
        }
        org.telegram.ui.Components.e90 e90Var3 = this.e;
        if (e90Var3 != null) {
            canvas.drawPath(e90Var3, h4.f34091x1);
        }
        org.telegram.ui.Components.e90 e90Var4 = this.f31972f;
        if (e90Var4 != null) {
            canvas.drawPath(e90Var4, h4.f34093z1);
        }
        if (u70Var.f37981c.g(canvas, this)) {
            view.invalidate();
        }
        if (u70Var.d == this && u70Var.f37980b == null && u70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), h4.f34090w1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            vh.h.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f31971c = false;
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
        return this.f31970b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f31977x;
    }

    @Override
    public final int getRow() {
        return this.f31976w;
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
        return this.f31975s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f31976w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f31975s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
