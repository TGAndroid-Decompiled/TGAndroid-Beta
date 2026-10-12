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
public final class b3 implements org.telegram.ui.Cells.z9, uj0, org.telegram.ui.Components.j01 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.x5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final w70 f36037a;
    public View f36038b;
    public boolean f36039c;
    public StaticLayout d;
    public org.telegram.ui.Components.ca0 f36040e;
    public org.telegram.ui.Components.ca0 f36041f;
    public org.telegram.ui.Components.ca0 h;
    public TL_iv.PageBlock f36042n;
    public TL_iv.RichText f36043r;
    public int f36044s;
    public int v;
    public int f36045w;
    public CharSequence f36046x;
    public SpannableStringBuilder f36047y;

    public b3(w70 w70Var) {
        this.f36037a = w70Var;
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
        this.f36039c = true;
        this.f36038b = view;
        w70 w70Var = this.f36037a;
        float f7 = 0.0f;
        if (!w70Var.E.isEmpty()) {
            r3 r3Var = (r3) w70Var.E.get(w70Var.G);
            if (r3Var.f41493c == this.f36042n && ((obj = r3Var.f41492b) == (richText = this.f36043r) || ((obj instanceof String) && richText == null))) {
                if (-1 != r3Var.f41491a) {
                    org.telegram.ui.Components.ca0 ca0Var = new org.telegram.ui.Components.ca0(0);
                    this.h = ca0Var;
                    ca0Var.f24903n = false;
                    ca0Var.d(this.d, r3Var.f41491a, 0.0f);
                    this.h.f24904o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = r3Var.f41491a;
                    staticLayout.getSelectionPath(i10, w70Var.F.length() + i10, this.h);
                    this.h.f24903n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.ca0 ca0Var2 = this.h;
        if (ca0Var2 != null) {
            canvas.drawPath(ca0Var2, i4.f38639y1);
        }
        org.telegram.ui.Components.ca0 ca0Var3 = this.f36040e;
        if (ca0Var3 != null) {
            canvas.drawPath(ca0Var3, i4.f38638x1);
        }
        org.telegram.ui.Components.ca0 ca0Var4 = this.f36041f;
        if (ca0Var4 != null) {
            canvas.drawPath(ca0Var4, i4.f38640z1);
        }
        if (w70Var.f43068c.g(canvas, this)) {
            view.invalidate();
        }
        if (w70Var.d == this && w70Var.f43067b == null && w70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), i4.f38637w1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            vh.g.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f36039c = false;
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
        return this.f36038b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f36046x;
    }

    @Override
    public final int getRow() {
        return this.f36045w;
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
        return this.f36044s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f36045w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f36044s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
