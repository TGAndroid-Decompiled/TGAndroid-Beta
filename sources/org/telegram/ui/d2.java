package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
public final class d2 extends View {
    public final p50 f46931a;
    public final e4 f46932b;
    public final e2 f46933c;

    public d2(e2 e2Var, Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f46933c = e2Var;
        this.f46931a = p50Var;
        this.f46932b = e4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        e2 e2Var = this.f46933c;
        if (e2Var.f47297c != null) {
            canvas.save();
            g4.t(this.f46931a, canvas, e2Var, 0);
            e2Var.f47297c.d(canvas, this);
            canvas.restore();
            e2Var.f47297c.f54496s = (int) getX();
            e2Var.f47297c.f54497w = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        e2 e2Var = this.f46933c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = e2Var.f47299f;
        int i12 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = e2Var.h;
            e4 e4Var = this.f46932b;
            p50 p50Var = this.f46931a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int L = org.telegram.messenger.g0.L(5000.0f);
                HashSet hashSet = g4.f48040d1;
                CharSequence A = g4.A(p50Var, e4Var.F, this, richText, richText, pageblockpreformatted, L);
                e2Var.h = A;
                TL_iv.pageBlockPreformatted pageblockpreformatted2 = e2Var.f47299f;
                if (pageblockpreformatted2.diff) {
                    e2Var.h = e2.b(e2Var, A, pageblockpreformatted2.language);
                } else if (!TextUtils.isEmpty(pageblockpreformatted2.language)) {
                    e2Var.h = qi.j.b(e2Var.h, e2Var.f47299f.language);
                }
            }
            z2 o4 = g4.o(p50Var, this, e2Var.h, null, org.telegram.messenger.g0.L(5000.0f), 0, e2Var.f47299f, e4Var);
            e2Var.f47297c = o4;
            if (o4 != null) {
                i11 = o4.d.getHeight();
                int lineCount = e2Var.f47297c.d.getLineCount();
                int i13 = 1;
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(e2Var.f47297c.d.getLineWidth(i14)), i13);
                }
                if (e2Var.f47299f.diff && (staticLayout2 = e2Var.f47297c.d) != null) {
                    i13 = Math.max((int) Math.ceil(staticLayout2.getPaint().measureText("m") * e2Var.f47299f.diffColumns), i13);
                }
                e2Var.f47301r = 0;
                if (e2Var.f47299f.continuesNext && (staticLayout = e2Var.f47297c.d) != null && staticLayout.getLineCount() > 1) {
                    StaticLayout staticLayout3 = e2Var.f47297c.d;
                    int lineCount2 = staticLayout3.getLineCount() - 1;
                    int max = Math.max(0, (staticLayout3.getLineBottom(0) - staticLayout3.getLineTop(0)) - (staticLayout3.getLineBottom(lineCount2) - staticLayout3.getLineTop(lineCount2)));
                    e2Var.f47301r = max;
                    i11 += max;
                }
                i12 = i13;
            } else {
                i11 = 0;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(org.telegram.messenger.g0.L(32.0f) + i12, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e2 e2Var = this.f46933c;
        if (!g4.j(this.f46931a, this.f46932b, motionEvent, e2Var, e2Var.f47297c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
