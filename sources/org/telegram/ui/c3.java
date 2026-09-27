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
public final class c3 implements org.telegram.ui.Cells.ba, oj0, org.telegram.ui.Components.oz0 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.v5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final s70 f32501a;
    public View f32502b;
    public boolean f32503c;
    public StaticLayout d;
    public org.telegram.ui.Components.j90 e;
    public org.telegram.ui.Components.j90 f32504f;
    public org.telegram.ui.Components.j90 h;
    public TL_iv.PageBlock f32505n;
    public TL_iv.RichText f32506r;
    public int f32507s;
    public int v;
    public int f32508w;
    public CharSequence f32509x;
    public SpannableStringBuilder f32510y;

    public c3(s70 s70Var) {
        this.f32501a = s70Var;
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
        this.f32503c = true;
        this.f32502b = view;
        s70 s70Var = this.f32501a;
        float f7 = 0.0f;
        if (!s70Var.E.isEmpty()) {
            s3 s3Var = (s3) s70Var.E.get(s70Var.G);
            if (s3Var.f37287c == this.f32505n && ((obj = s3Var.f37286b) == (richText = this.f32506r) || ((obj instanceof String) && richText == null))) {
                if (-1 != s3Var.f37285a) {
                    org.telegram.ui.Components.j90 j90Var = new org.telegram.ui.Components.j90(0);
                    this.h = j90Var;
                    j90Var.f25416n = false;
                    j90Var.d(this.d, s3Var.f37285a, 0.0f);
                    this.h.f25417o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = s3Var.f37285a;
                    staticLayout.getSelectionPath(i10, s70Var.F.length() + i10, this.h);
                    this.h.f25416n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.j90 j90Var2 = this.h;
        if (j90Var2 != null) {
            canvas.drawPath(j90Var2, j4.f34605y1);
        }
        org.telegram.ui.Components.j90 j90Var3 = this.e;
        if (j90Var3 != null) {
            canvas.drawPath(j90Var3, j4.f34604x1);
        }
        org.telegram.ui.Components.j90 j90Var4 = this.f32504f;
        if (j90Var4 != null) {
            canvas.drawPath(j90Var4, j4.f34606z1);
        }
        if (s70Var.f37321c.g(canvas, this)) {
            view.invalidate();
        }
        if (s70Var.d == this && s70Var.f37320b == null && s70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), j4.f34603w1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            vh.g.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f32503c = false;
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
        return this.f32502b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f32509x;
    }

    @Override
    public final int getRow() {
        return this.f32508w;
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
        return this.f32507s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f32508w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f32507s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
