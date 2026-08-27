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

public final class f3 implements org.telegram.ui.Cells.u9, ej0, org.telegram.ui.Components.ly0 {
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public org.telegram.ui.Components.p5 D;
    public ArrayList E;
    public Stack F;
    public AtomicReference G;
    public View H;

    public final d70 f37916a;

    public View f37917b;

    public boolean f37918c;
    public StaticLayout d;

    public org.telegram.ui.Components.j80 f37919e;

    public org.telegram.ui.Components.j80 f37920f;
    public org.telegram.ui.Components.j80 h;

    public TL_iv.PageBlock f37921n;

    public TL_iv.RichText f37922r;

    public int f37923s;
    public int v;

    public int f37924w;

    public CharSequence f37925x;

    public SpannableStringBuilder f37926y;

    public f3(d70 d70Var) {
        this.f37916a = d70Var;
    }

    public final int a() {
        int i10 = this.A;
        if (i10 != -1) {
            return i10;
        }
        this.A = this.d.getWidth();
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.A = Math.min(this.A, (int) this.d.getLineLeft(i11));
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
        int i10 = this.B;
        if (i10 != -1) {
            return i10;
        }
        this.B = 0;
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.B = Math.max(this.B, (int) this.d.getLineRight(i11));
        }
        return this.B;
    }

    public final int c() {
        int i10 = this.C;
        if (i10 != -1) {
            return i10;
        }
        this.C = 0;
        if (this.d.getLineCount() > 0) {
            int i11 = this.C;
            StaticLayout staticLayout = this.d;
            this.C = Math.max(i11, (int) staticLayout.getLineRight(staticLayout.getLineCount() - 1));
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
        this.f37918c = true;
        this.f37917b = view;
        d70 d70Var = this.f37916a;
        float lineLeft = 0.0f;
        if (d70Var.A.isEmpty()) {
            this.h = null;
        } else {
            v3 v3Var = (v3) d70Var.A.get(d70Var.C);
            if (v3Var.f43338c != this.f37921n || ((obj = v3Var.f43337b) != (richText = this.f37922r) && (!(obj instanceof String) || richText != null))) {
                this.h = null;
            } else if (-1 != v3Var.f43336a) {
                org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(0);
                this.h = j80Var;
                j80Var.f29649n = false;
                j80Var.d(this.d, v3Var.f43336a, 0.0f);
                this.h.f29650o = 0;
                StaticLayout staticLayout = this.d;
                int i10 = v3Var.f43336a;
                staticLayout.getSelectionPath(i10, d70Var.B.length() + i10, this.h);
                this.h.f29649n = true;
            }
        }
        org.telegram.ui.Components.j80 j80Var2 = this.h;
        if (j80Var2 != null) {
            canvas.drawPath(j80Var2, m4.f40328u1);
        }
        org.telegram.ui.Components.j80 j80Var3 = this.f37919e;
        if (j80Var3 != null) {
            canvas.drawPath(j80Var3, m4.f40327t1);
        }
        org.telegram.ui.Components.j80 j80Var4 = this.f37920f;
        if (j80Var4 != null) {
            canvas.drawPath(j80Var4, m4.f40329v1);
        }
        if (d70Var.f37286c.g(canvas, this)) {
            view.invalidate();
        }
        if (d70Var.d == this && d70Var.f37285b == null && d70Var.h) {
            if (this.d.getLineCount() == 1) {
                width = this.d.getLineWidth(0);
                lineLeft = this.d.getLineLeft(0);
            } else {
                width = this.d.getWidth();
            }
            canvas.drawRect((-AndroidUtilities.dp(2.0f)) + lineLeft, 0.0f, lineLeft + width + AndroidUtilities.dp(2.0f), this.d.getHeight(), m4.f40326s1);
        }
        ArrayList arrayList = this.E;
        if (arrayList == null || arrayList.isEmpty()) {
            this.d.draw(canvas);
        } else {
            eh.k.g(view, false, this.d.getPaint().getColor(), 0, this.G, 0, this.d, this.E, canvas, false);
        }
        this.f37918c = false;
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
        return view != null ? view : this.f37917b;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.f37925x;
    }

    @Override
    public final int getRow() {
        return this.f37924w;
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
        return this.f37923s;
    }

    @Override
    public final int getY() {
        return this.v;
    }

    @Override
    public final void setRow(int i10) {
        this.f37924w = i10;
    }

    @Override
    public final void setX(int i10) {
        this.f37923s = i10;
    }

    @Override
    public final void setY(int i10) {
        this.v = i10;
    }
}
