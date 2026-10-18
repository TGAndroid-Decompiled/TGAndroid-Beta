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
public final class d3 implements org.telegram.ui.Cells.y9, ej0, org.telegram.ui.Components.vz0 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.w5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final d70 f36068a;
    public View f36069b;
    public boolean f36070c;
    public StaticLayout d;
    public org.telegram.ui.Components.r90 e;
    public org.telegram.ui.Components.r90 f36071f;
    public org.telegram.ui.Components.r90 h;
    public TL_iv.PageBlock f36072n;
    public TL_iv.RichText f36073r;
    public int f36074s;
    public int v;
    public int f36075w;
    public CharSequence f36076x;
    public SpannableStringBuilder f36077y;

    public d3(d70 d70Var) {
        this.f36068a = d70Var;
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
            this.H = org.telegram.ui.Components.a6.update(0, view, false, this.H, staticLayout);
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
        org.telegram.ui.Components.a6.release(view, this.H);
        this.L = null;
    }

    @Override
    public final void draw(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.f36070c = true;
        this.f36069b = view;
        d70 d70Var = this.f36068a;
        float f7 = 0.0f;
        if (!d70Var.E.isEmpty()) {
            t3 t3Var = (t3) d70Var.E.get(d70Var.G);
            if (t3Var.f41602c == this.f36072n && ((obj = t3Var.f41601b) == (richText = this.f36073r) || ((obj instanceof String) && richText == null))) {
                if (-1 != t3Var.f41600a) {
                    org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(0);
                    this.h = r90Var;
                    r90Var.f29906n = false;
                    r90Var.d(this.d, t3Var.f41600a, 0.0f);
                    this.h.f29907o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = t3Var.f41600a;
                    staticLayout.getSelectionPath(i10, d70Var.F.length() + i10, this.h);
                    this.h.f29906n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.r90 r90Var2 = this.h;
        if (r90Var2 != null) {
            canvas.drawPath(r90Var2, l4.f38748y1);
        }
        org.telegram.ui.Components.r90 r90Var3 = this.e;
        if (r90Var3 != null) {
            canvas.drawPath(r90Var3, l4.f38747x1);
        }
        org.telegram.ui.Components.r90 r90Var4 = this.f36071f;
        if (r90Var4 != null) {
            canvas.drawPath(r90Var4, l4.f38749z1);
        }
        if (d70Var.f36107c.g(canvas, this)) {
            view.invalidate();
        }
        if (d70Var.d == this && d70Var.f36106b == null && d70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), l4.f38746w1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            wh.g.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f36070c = false;
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
        return this.f36069b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f36076x;
    }

    @Override
    public final int getRow() {
        return this.f36075w;
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
        return this.f36074s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f36075w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f36074s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
