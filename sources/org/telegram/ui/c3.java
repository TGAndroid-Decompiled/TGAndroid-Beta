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
public final class c3 implements org.telegram.ui.Cells.z9, gj0, org.telegram.ui.Components.a01 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.w5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final f70 f36227a;
    public View f36228b;
    public boolean f36229c;
    public StaticLayout d;
    public org.telegram.ui.Components.s90 e;
    public org.telegram.ui.Components.s90 f36230f;
    public org.telegram.ui.Components.s90 h;
    public TL_iv.PageBlock f36231n;
    public TL_iv.RichText f36232r;
    public int f36233s;
    public int v;
    public int f36234w;
    public CharSequence f36235x;
    public SpannableStringBuilder f36236y;

    public c3(f70 f70Var) {
        this.f36227a = f70Var;
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
        this.f36229c = true;
        this.f36228b = view;
        f70 f70Var = this.f36227a;
        float f7 = 0.0f;
        if (!f70Var.E.isEmpty()) {
            s3 s3Var = (s3) f70Var.E.get(f70Var.G);
            if (s3Var.f41300c == this.f36231n && ((obj = s3Var.f41299b) == (richText = this.f36232r) || ((obj instanceof String) && richText == null))) {
                if (-1 != s3Var.f41298a) {
                    org.telegram.ui.Components.s90 s90Var = new org.telegram.ui.Components.s90(0);
                    this.h = s90Var;
                    s90Var.f30432n = false;
                    s90Var.d(this.d, s3Var.f41298a, 0.0f);
                    this.h.f30433o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = s3Var.f41298a;
                    staticLayout.getSelectionPath(i10, f70Var.F.length() + i10, this.h);
                    this.h.f30432n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.s90 s90Var2 = this.h;
        if (s90Var2 != null) {
            canvas.drawPath(s90Var2, k4.f38783z1);
        }
        org.telegram.ui.Components.s90 s90Var3 = this.e;
        if (s90Var3 != null) {
            canvas.drawPath(s90Var3, k4.f38782y1);
        }
        org.telegram.ui.Components.s90 s90Var4 = this.f36230f;
        if (s90Var4 != null) {
            canvas.drawPath(s90Var4, k4.A1);
        }
        if (f70Var.f37231c.g(canvas, this)) {
            view.invalidate();
        }
        if (f70Var.d == this && f70Var.f37230b == null && f70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), k4.f38781x1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            wh.g.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f36229c = false;
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
        return this.f36228b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f36235x;
    }

    @Override
    public final int getRow() {
        return this.f36234w;
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
        return this.f36233s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f36234w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f36233s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
