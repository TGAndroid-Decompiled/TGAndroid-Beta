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
    public final r50 f44882a;
    public final e4 f44883b;
    public final e2 f44884c;

    public d2(e2 e2Var, Context context, r50 r50Var, e4 e4Var) {
        super(context);
        this.f44884c = e2Var;
        this.f44882a = r50Var;
        this.f44883b = e4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        e2 e2Var = this.f44884c;
        if (e2Var.f45101c != null) {
            canvas.save();
            g4.t(this.f44882a, canvas, e2Var, 0);
            e2Var.f45101c.d(canvas, this);
            canvas.restore();
            e2Var.f45101c.f52183s = (int) getX();
            e2Var.f45101c.f52184w = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        e2 e2Var = this.f44884c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = e2Var.f45103f;
        int i12 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = e2Var.h;
            e4 e4Var = this.f44883b;
            r50 r50Var = this.f44882a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int L = org.telegram.messenger.g0.L(5000.0f);
                HashSet hashSet = g4.f45928c1;
                CharSequence A = g4.A(r50Var, e4Var.E, this, richText, richText, pageblockpreformatted, L);
                e2Var.h = A;
                TL_iv.pageBlockPreformatted pageblockpreformatted2 = e2Var.f45103f;
                if (pageblockpreformatted2.diff) {
                    e2Var.h = e2.b(e2Var, A, pageblockpreformatted2.language);
                } else if (!TextUtils.isEmpty(pageblockpreformatted2.language)) {
                    e2Var.h = ni.m.b(e2Var.h, e2Var.f45103f.language);
                }
            }
            z2 o4 = g4.o(r50Var, this, e2Var.h, null, org.telegram.messenger.g0.L(5000.0f), 0, e2Var.f45103f, e4Var);
            e2Var.f45101c = o4;
            if (o4 != null) {
                i11 = o4.d.getHeight();
                int lineCount = e2Var.f45101c.d.getLineCount();
                int i13 = 1;
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(e2Var.f45101c.d.getLineWidth(i14)), i13);
                }
                if (e2Var.f45103f.diff && (staticLayout2 = e2Var.f45101c.d) != null) {
                    i13 = Math.max((int) Math.ceil(staticLayout2.getPaint().measureText("m") * e2Var.f45103f.diffColumns), i13);
                }
                e2Var.f45105r = 0;
                if (e2Var.f45103f.continuesNext && (staticLayout = e2Var.f45101c.d) != null && staticLayout.getLineCount() > 1) {
                    StaticLayout staticLayout3 = e2Var.f45101c.d;
                    int lineCount2 = staticLayout3.getLineCount() - 1;
                    int max = Math.max(0, (staticLayout3.getLineBottom(0) - staticLayout3.getLineTop(0)) - (staticLayout3.getLineBottom(lineCount2) - staticLayout3.getLineTop(lineCount2)));
                    e2Var.f45105r = max;
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
        e2 e2Var = this.f44884c;
        if (!g4.j(this.f44882a, this.f44883b, motionEvent, e2Var, e2Var.f45101c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
