package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
public final class e2 extends View {
    public final i50 f44854a;
    public final g4 f44855b;
    public final f2 f44856c;

    public e2(f2 f2Var, Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f44856c = f2Var;
        this.f44854a = i50Var;
        this.f44855b = g4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f2 f2Var = this.f44856c;
        if (f2Var.f45121c != null) {
            canvas.save();
            i4.t(this.f44854a, canvas, f2Var, 0);
            f2Var.f45121c.d(canvas, this);
            canvas.restore();
            f2Var.f45121c.f43579s = (int) getX();
            f2Var.f45121c.f43580w = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        f2 f2Var = this.f44856c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = f2Var.f45123f;
        int i12 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = f2Var.h;
            g4 g4Var = this.f44855b;
            i50 i50Var = this.f44854a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int L = org.telegram.messenger.g0.L(5000.0f);
                HashSet hashSet = i4.f46056d1;
                CharSequence A = i4.A(i50Var, g4Var.F, this, richText, richText, pageblockpreformatted, L);
                f2Var.h = A;
                TL_iv.pageBlockPreformatted pageblockpreformatted2 = f2Var.f45123f;
                if (pageblockpreformatted2.diff) {
                    f2Var.h = f2.b(f2Var, A, pageblockpreformatted2.language);
                } else if (!TextUtils.isEmpty(pageblockpreformatted2.language)) {
                    f2Var.h = oi.k.b(f2Var.h, f2Var.f45123f.language);
                }
            }
            a3 o10 = i4.o(i50Var, this, f2Var.h, null, org.telegram.messenger.g0.L(5000.0f), 0, f2Var.f45123f, g4Var);
            f2Var.f45121c = o10;
            if (o10 != null) {
                i11 = o10.d.getHeight();
                int lineCount = f2Var.f45121c.d.getLineCount();
                int i13 = 1;
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(f2Var.f45121c.d.getLineWidth(i14)), i13);
                }
                if (f2Var.f45123f.diff && (staticLayout2 = f2Var.f45121c.d) != null) {
                    i13 = Math.max((int) Math.ceil(staticLayout2.getPaint().measureText("m") * f2Var.f45123f.diffColumns), i13);
                }
                f2Var.f45125r = 0;
                if (f2Var.f45123f.continuesNext && (staticLayout = f2Var.f45121c.d) != null && staticLayout.getLineCount() > 1) {
                    StaticLayout staticLayout3 = f2Var.f45121c.d;
                    int lineCount2 = staticLayout3.getLineCount() - 1;
                    int max = Math.max(0, (staticLayout3.getLineBottom(0) - staticLayout3.getLineTop(0)) - (staticLayout3.getLineBottom(lineCount2) - staticLayout3.getLineTop(lineCount2)));
                    f2Var.f45125r = max;
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
        f2 f2Var = this.f44856c;
        if (!i4.j(this.f44854a, this.f44855b, motionEvent, f2Var, f2Var.f45121c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
