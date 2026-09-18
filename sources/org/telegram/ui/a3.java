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
public final class a3 implements org.telegram.ui.Cells.ba, tj0, org.telegram.ui.Components.oz0 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.v5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final u70 f31929a;
    public View f31930b;
    public boolean f31931c;
    public StaticLayout d;
    public org.telegram.ui.Components.f90 e;
    public org.telegram.ui.Components.f90 f31932f;
    public org.telegram.ui.Components.f90 h;
    public TL_iv.PageBlock f31933n;
    public TL_iv.RichText f31934r;
    public int f31935s;
    public int v;
    public int f31936w;
    public CharSequence f31937x;
    public SpannableStringBuilder f31938y;

    public a3(u70 u70Var) {
        this.f31929a = u70Var;
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
        this.f31931c = true;
        this.f31930b = view;
        u70 u70Var = this.f31929a;
        float f7 = 0.0f;
        if (!u70Var.E.isEmpty()) {
            q3 q3Var = (q3) u70Var.E.get(u70Var.G);
            if (q3Var.f36671c == this.f31933n && ((obj = q3Var.f36670b) == (richText = this.f31934r) || ((obj instanceof String) && richText == null))) {
                if (-1 != q3Var.f36669a) {
                    org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(0);
                    this.h = f90Var;
                    f90Var.f24081n = false;
                    f90Var.d(this.d, q3Var.f36669a, 0.0f);
                    this.h.f24082o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = q3Var.f36669a;
                    staticLayout.getSelectionPath(i10, u70Var.F.length() + i10, this.h);
                    this.h.f24081n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.f90 f90Var2 = this.h;
        if (f90Var2 != null) {
            canvas.drawPath(f90Var2, h4.f34052y1);
        }
        org.telegram.ui.Components.f90 f90Var3 = this.e;
        if (f90Var3 != null) {
            canvas.drawPath(f90Var3, h4.f34051x1);
        }
        org.telegram.ui.Components.f90 f90Var4 = this.f31932f;
        if (f90Var4 != null) {
            canvas.drawPath(f90Var4, h4.f34053z1);
        }
        if (u70Var.f37897c.g(canvas, this)) {
            view.invalidate();
        }
        if (u70Var.d == this && u70Var.f37896b == null && u70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), h4.f34050w1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            vh.h.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f31931c = false;
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
        return this.f31930b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f31937x;
    }

    @Override
    public final int getRow() {
        return this.f31936w;
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
        return this.f31935s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f31936w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f31935s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
