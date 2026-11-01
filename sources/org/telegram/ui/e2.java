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
    public final l60 f36716a;
    public final f4 f36717b;
    public final f2 f36718c;

    public e2(f2 f2Var, Context context, l60 l60Var, f4 f4Var) {
        super(context);
        this.f36718c = f2Var;
        this.f36716a = l60Var;
        this.f36717b = f4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f2 f2Var = this.f36718c;
        if (f2Var.f36974c != null) {
            canvas.save();
            h4.t(this.f36716a, canvas, f2Var, 0);
            f2Var.f36974c.d(canvas, this);
            canvas.restore();
            f2Var.f36974c.f43793s = (int) getX();
            f2Var.f36974c.f43794w = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        f2 f2Var = this.f36718c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = f2Var.f36975f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = f2Var.h;
            f4 f4Var = this.f36717b;
            l60 l60Var = this.f36716a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int L = org.telegram.messenger.i0.L(5000.0f);
                HashSet hashSet = h4.f37647c1;
                CharSequence A = h4.A(l60Var, f4Var.E, this, richText, richText, pageblockpreformatted, L);
                f2Var.h = A;
                TL_iv.pageBlockPreformatted pageblockpreformatted2 = f2Var.f36975f;
                if (pageblockpreformatted2.diff) {
                    f2Var.h = f2.b(f2Var, A, pageblockpreformatted2.language);
                } else if (!TextUtils.isEmpty(pageblockpreformatted2.language)) {
                    f2Var.h = di.l.b(f2Var.h, f2Var.f36975f.language);
                }
            }
            z2 o10 = h4.o(l60Var, this, f2Var.h, null, org.telegram.messenger.i0.L(5000.0f), 0, f2Var.f36975f, f4Var);
            f2Var.f36974c = o10;
            if (o10 != null) {
                i12 = o10.d.getHeight();
                int lineCount = f2Var.f36974c.d.getLineCount();
                int i14 = 1;
                for (int i15 = 0; i15 < lineCount; i15++) {
                    i14 = Math.max((int) Math.ceil(f2Var.f36974c.d.getLineWidth(i15)), i14);
                }
                if (f2Var.f36975f.diff && (staticLayout2 = f2Var.f36974c.d) != null) {
                    i14 = Math.max((int) Math.ceil(staticLayout2.getPaint().measureText("m") * f2Var.f36975f.diffColumns), i14);
                }
                f2Var.f36977r = 0;
                if (f2Var.f36975f.continuesNext && (staticLayout = f2Var.f36974c.d) != null && staticLayout.getLineCount() > 1) {
                    StaticLayout staticLayout3 = f2Var.f36974c.d;
                    int lineCount2 = staticLayout3.getLineCount() - 1;
                    int max = Math.max(0, (staticLayout3.getLineBottom(0) - staticLayout3.getLineTop(0)) - (staticLayout3.getLineBottom(lineCount2) - staticLayout3.getLineTop(lineCount2)));
                    f2Var.f36977r = max;
                    i12 += max;
                }
                i13 = i14;
            } else {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(org.telegram.messenger.i0.L(32.0f) + i13, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2 f2Var = this.f36718c;
        if (!h4.j(this.f36716a, this.f36717b, motionEvent, f2Var, f2Var.f36974c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
