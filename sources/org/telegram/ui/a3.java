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
public final class a3 implements org.telegram.ui.Cells.ba, uj0, org.telegram.ui.Components.dz0 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.t5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final w70 f31692a;
    public View f31693b;
    public boolean f31694c;
    public StaticLayout d;
    public org.telegram.ui.Components.w80 e;
    public org.telegram.ui.Components.w80 f31695f;
    public org.telegram.ui.Components.w80 h;
    public TL_iv.PageBlock f31696n;
    public TL_iv.RichText f31697r;
    public int f31698s;
    public int v;
    public int f31699w;
    public CharSequence f31700x;
    public SpannableStringBuilder f31701y;

    public a3(w70 w70Var) {
        this.f31692a = w70Var;
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
            this.H = org.telegram.ui.Components.x5.update(0, view, false, this.H, staticLayout);
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
        org.telegram.ui.Components.x5.release(view, this.H);
        this.L = null;
    }

    @Override
    public final void draw(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.f31694c = true;
        this.f31693b = view;
        w70 w70Var = this.f31692a;
        float f7 = 0.0f;
        if (!w70Var.E.isEmpty()) {
            q3 q3Var = (q3) w70Var.E.get(w70Var.G);
            if (q3Var.f36798c == this.f31696n && ((obj = q3Var.f36797b) == (richText = this.f31697r) || ((obj instanceof String) && richText == null))) {
                if (-1 != q3Var.f36796a) {
                    org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(0);
                    this.h = w80Var;
                    w80Var.f29605n = false;
                    w80Var.d(this.d, q3Var.f36796a, 0.0f);
                    this.h.f29606o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = q3Var.f36796a;
                    staticLayout.getSelectionPath(i10, w70Var.F.length() + i10, this.h);
                    this.h.f29605n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.w80 w80Var2 = this.h;
        if (w80Var2 != null) {
            canvas.drawPath(w80Var2, h4.f34151y1);
        }
        org.telegram.ui.Components.w80 w80Var3 = this.e;
        if (w80Var3 != null) {
            canvas.drawPath(w80Var3, h4.f34150x1);
        }
        org.telegram.ui.Components.w80 w80Var4 = this.f31695f;
        if (w80Var4 != null) {
            canvas.drawPath(w80Var4, h4.f34152z1);
        }
        if (w70Var.f38587c.g(canvas, this)) {
            view.invalidate();
        }
        if (w70Var.d == this && w70Var.f38586b == null && w70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), h4.f34149w1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            vh.h.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f31694c = false;
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
        return this.f31693b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f31700x;
    }

    @Override
    public final int getRow() {
        return this.f31699w;
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
        return this.f31698s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f31699w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f31698s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
