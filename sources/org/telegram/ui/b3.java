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
public final class b3 implements org.telegram.ui.Cells.ba, lj0, org.telegram.ui.Components.mz0 {
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public org.telegram.ui.Components.v5 H;
    public ArrayList I;
    public Stack J;
    public AtomicReference K;
    public View L;
    public final p70 f32298a;
    public View f32299b;
    public boolean f32300c;
    public StaticLayout d;
    public org.telegram.ui.Components.h90 e;
    public org.telegram.ui.Components.h90 f32301f;
    public org.telegram.ui.Components.h90 h;
    public TL_iv.PageBlock f32302n;
    public TL_iv.RichText f32303r;
    public int f32304s;
    public int v;
    public int f32305w;
    public CharSequence f32306x;
    public SpannableStringBuilder f32307y;

    public b3(p70 p70Var) {
        this.f32298a = p70Var;
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
        this.f32300c = true;
        this.f32299b = view;
        p70 p70Var = this.f32298a;
        float f7 = 0.0f;
        if (!p70Var.E.isEmpty()) {
            r3 r3Var = (r3) p70Var.E.get(p70Var.G);
            if (r3Var.f37178c == this.f32302n && ((obj = r3Var.f37177b) == (richText = this.f32303r) || ((obj instanceof String) && richText == null))) {
                if (-1 != r3Var.f37176a) {
                    org.telegram.ui.Components.h90 h90Var = new org.telegram.ui.Components.h90(0);
                    this.h = h90Var;
                    h90Var.f24700n = false;
                    h90Var.d(this.d, r3Var.f37176a, 0.0f);
                    this.h.f24701o = 0;
                    StaticLayout staticLayout = this.d;
                    int i10 = r3Var.f37176a;
                    staticLayout.getSelectionPath(i10, p70Var.F.length() + i10, this.h);
                    this.h.f24700n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.h90 h90Var2 = this.h;
        if (h90Var2 != null) {
            canvas.drawPath(h90Var2, i4.f34385y1);
        }
        org.telegram.ui.Components.h90 h90Var3 = this.e;
        if (h90Var3 != null) {
            canvas.drawPath(h90Var3, i4.f34384x1);
        }
        org.telegram.ui.Components.h90 h90Var4 = this.f32301f;
        if (h90Var4 != null) {
            canvas.drawPath(h90Var4, i4.f34386z1);
        }
        if (p70Var.f36421c.g(canvas, this)) {
            view.invalidate();
        }
        if (p70Var.d == this && p70Var.f36420b == null && p70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f7 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f7, 0.0f, f7 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), i4.f34383w1);
        }
        ArrayList arrayList = this.I;
        if (arrayList != null && !arrayList.isEmpty()) {
            vh.g.g(view, false, this.d.getPaint().getColor(), 0, this.K, 0, this.d, this.I, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f32300c = false;
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
        return this.f32299b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f32306x;
    }

    @Override
    public final int getRow() {
        return this.f32305w;
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
        return this.f32304s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f32305w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f32304s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
