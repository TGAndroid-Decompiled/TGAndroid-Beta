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
    public final o50 f44939a;
    public final e4 f44940b;
    public final e2 f44941c;

    public d2(e2 e2Var, Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.f44941c = e2Var;
        this.f44939a = o50Var;
        this.f44940b = e4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        e2 e2Var = this.f44941c;
        if (e2Var.f45173c != null) {
            canvas.save();
            g4.t(this.f44939a, canvas, e2Var, 0);
            e2Var.f45173c.d(canvas, this);
            canvas.restore();
            e2Var.f45173c.f52421s = (int) getX();
            e2Var.f45173c.f52422w = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        e2 e2Var = this.f44941c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = e2Var.f45175f;
        int i12 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = e2Var.h;
            e4 e4Var = this.f44940b;
            o50 o50Var = this.f44939a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int L = org.telegram.messenger.g0.L(5000.0f);
                HashSet hashSet = g4.f45776c1;
                CharSequence A = g4.A(o50Var, e4Var.E, this, richText, richText, pageblockpreformatted, L);
                e2Var.h = A;
                TL_iv.pageBlockPreformatted pageblockpreformatted2 = e2Var.f45175f;
                if (pageblockpreformatted2.diff) {
                    e2Var.h = e2.b(e2Var, A, pageblockpreformatted2.language);
                } else if (!TextUtils.isEmpty(pageblockpreformatted2.language)) {
                    e2Var.h = ni.m.b(e2Var.h, e2Var.f45175f.language);
                }
            }
            z2 o4 = g4.o(o50Var, this, e2Var.h, null, org.telegram.messenger.g0.L(5000.0f), 0, e2Var.f45175f, e4Var);
            e2Var.f45173c = o4;
            if (o4 != null) {
                i11 = o4.d.getHeight();
                int lineCount = e2Var.f45173c.d.getLineCount();
                int i13 = 1;
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(e2Var.f45173c.d.getLineWidth(i14)), i13);
                }
                if (e2Var.f45175f.diff && (staticLayout2 = e2Var.f45173c.d) != null) {
                    i13 = Math.max((int) Math.ceil(staticLayout2.getPaint().measureText("m") * e2Var.f45175f.diffColumns), i13);
                }
                e2Var.f45177r = 0;
                if (e2Var.f45175f.continuesNext && (staticLayout = e2Var.f45173c.d) != null && staticLayout.getLineCount() > 1) {
                    StaticLayout staticLayout3 = e2Var.f45173c.d;
                    int lineCount2 = staticLayout3.getLineCount() - 1;
                    int max = Math.max(0, (staticLayout3.getLineBottom(0) - staticLayout3.getLineTop(0)) - (staticLayout3.getLineBottom(lineCount2) - staticLayout3.getLineTop(lineCount2)));
                    e2Var.f45177r = max;
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
        e2 e2Var = this.f44941c;
        if (!g4.j(this.f44939a, this.f44940b, motionEvent, e2Var, e2Var.f45173c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
