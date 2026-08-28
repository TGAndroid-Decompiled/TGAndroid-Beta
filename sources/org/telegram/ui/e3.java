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
public final class e3 implements org.telegram.ui.Cells.y9, cj0, org.telegram.ui.Components.jy0 {
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public org.telegram.ui.Components.p5 D;
    public ArrayList E;
    public Stack F;
    public AtomicReference G;
    public View H;
    public final a70 f37798a;
    public View f37799b;
    public boolean f37800c;
    public StaticLayout d;
    public org.telegram.ui.Components.f80 f37801e;
    public org.telegram.ui.Components.f80 f37802f;
    public org.telegram.ui.Components.f80 h;
    public TL_iv.PageBlock f37803n;
    public TL_iv.RichText f37804r;
    public int f37805s;
    public int v;
    public int f37806w;
    public CharSequence f37807x;
    public SpannableStringBuilder f37808y;

    public e3(a70 a70Var) {
        this.f37798a = a70Var;
    }

    public final int a() {
        int i9 = this.A;
        if (i9 != -1) {
            return i9;
        }
        this.A = this.d.getWidth();
        for (int i10 = 0; i10 < this.d.getLineCount(); i10++) {
            this.A = Math.min(this.A, (int) this.d.getLineLeft(i10));
        }
        return this.A;
    }

    @Override
    public final void attach(View view) {
        this.H = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.D = org.telegram.ui.Components.t5.update(0, view, false, this.D, staticLayout);
        }
    }

    public final int b() {
        int i9 = this.B;
        if (i9 != -1) {
            return i9;
        }
        this.B = 0;
        for (int i10 = 0; i10 < this.d.getLineCount(); i10++) {
            this.B = Math.max(this.B, (int) this.d.getLineRight(i10));
        }
        return this.B;
    }

    public final int c() {
        int i9 = this.C;
        if (i9 != -1) {
            return i9;
        }
        this.C = 0;
        if (this.d.getLineCount() > 0) {
            int i10 = this.C;
            StaticLayout staticLayout = this.d;
            this.C = Math.max(i10, (int) staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        return this.C;
    }

    @Override
    public final void detach(View view) {
        if (view == null) {
            view = this.H;
        }
        org.telegram.ui.Components.t5.release(view, this.D);
        this.H = null;
    }

    @Override
    public final void draw(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.f37800c = true;
        this.f37799b = view;
        a70 a70Var = this.f37798a;
        float f10 = 0.0f;
        if (!a70Var.A.isEmpty()) {
            u3 u3Var = (u3) a70Var.A.get(a70Var.C);
            if (u3Var.f43122c == this.f37803n && ((obj = u3Var.f43121b) == (richText = this.f37804r) || ((obj instanceof String) && richText == null))) {
                if (-1 != u3Var.f43120a) {
                    org.telegram.ui.Components.f80 f80Var = new org.telegram.ui.Components.f80(0);
                    this.h = f80Var;
                    f80Var.f28333n = false;
                    f80Var.d(this.d, u3Var.f43120a, 0.0f);
                    this.h.f28334o = 0;
                    StaticLayout staticLayout = this.d;
                    int i9 = u3Var.f43120a;
                    staticLayout.getSelectionPath(i9, a70Var.B.length() + i9, this.h);
                    this.h.f28333n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        org.telegram.ui.Components.f80 f80Var2 = this.h;
        if (f80Var2 != null) {
            canvas.drawPath(f80Var2, l4.f40007u1);
        }
        org.telegram.ui.Components.f80 f80Var3 = this.f37801e;
        if (f80Var3 != null) {
            canvas.drawPath(f80Var3, l4.f40006t1);
        }
        org.telegram.ui.Components.f80 f80Var4 = this.f37802f;
        if (f80Var4 != null) {
            canvas.drawPath(f80Var4, l4.f40008v1);
        }
        if (a70Var.f36375c.g(canvas, this)) {
            view.invalidate();
        }
        if (a70Var.d == this && a70Var.f36374b == null && a70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                f10 = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + f10, 0.0f, f10 + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), l4.f40005s1);
        }
        ArrayList arrayList = this.E;
        if (arrayList != null && !arrayList.isEmpty()) {
            dh.l.g(view, false, this.d.getPaint().getColor(), 0, this.G, 0, this.d, this.E, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.f37800c = false;
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
        View view = this.H;
        if (view != null) {
            return view;
        }
        return this.f37799b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f37807x;
    }

    @Override
    public final int getRow() {
        return this.f37806w;
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
        return this.f37805s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i9) {
        this.f37806w = i9;
    }

    @Override
    public final void setX(int i9) {
        this.f37805s = i9;
    }

    @Override
    public final void setY(int i9) {
        this.v = i9;
    }
}
