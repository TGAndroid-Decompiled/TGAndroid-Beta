package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class e2 extends View {
    public final j70 f38733a;
    public final h4 f38734b;
    public final f2 f38735c;

    public e2(f2 f2Var, Context context, j70 j70Var, h4 h4Var) {
        super(context);
        this.f38735c = f2Var;
        this.f38733a = j70Var;
        this.f38734b = h4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f2 f2Var = this.f38735c;
        if (f2Var.f39127c != null) {
            canvas.save();
            j4.v(this.f38733a, canvas, f2Var, 0);
            f2Var.f39127c.draw(canvas, this);
            canvas.restore();
            f2Var.f39127c.f37666s = (int) getX();
            f2Var.f39127c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        f2 f2Var = this.f38735c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = f2Var.f39128f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = f2Var.h;
            h4 h4Var = this.f38734b;
            j70 j70Var = this.f38733a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = j4.f40370c1;
                f2Var.h = j4.C(j70Var, h4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(f2Var.f39128f.language)) {
                    f2Var.h = ni.k.b(f2Var.h, f2Var.f39128f.language);
                }
            }
            a3 q5 = j4.q(j70Var, this, f2Var.h, null, AndroidUtilities.dp(5000.0f), 0, f2Var.f39128f, h4Var);
            f2Var.f39127c = q5;
            if (q5 != null) {
                i12 = q5.d.getHeight();
                int lineCount = f2Var.f39127c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(f2Var.f39127c.d.getLineWidth(i14)), i13);
                }
            } else {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(AndroidUtilities.dp(32.0f) + i13, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2 f2Var = this.f38735c;
        if (!j4.l(this.f38733a, this.f38734b, motionEvent, f2Var, f2Var.f39127c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
