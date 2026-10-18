package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class h2 extends View {
    public final d70 f37420a;
    public final j4 f37421b;
    public final i2 f37422c;

    public h2(i2 i2Var, Context context, d70 d70Var, j4 j4Var) {
        super(context);
        this.f37422c = i2Var;
        this.f37420a = d70Var;
        this.f37421b = j4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        i2 i2Var = this.f37422c;
        if (i2Var.f37736c != null) {
            canvas.save();
            l4.v(this.f37420a, canvas, i2Var, 0);
            i2Var.f37736c.draw(canvas, this);
            canvas.restore();
            i2Var.f37736c.f36074s = (int) getX();
            i2Var.f37736c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        i2 i2Var = this.f37422c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = i2Var.f37737f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = i2Var.h;
            j4 j4Var = this.f37421b;
            d70 d70Var = this.f37420a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = l4.f38726b1;
                i2Var.h = l4.C(d70Var, j4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(i2Var.f37737f.language)) {
                    i2Var.h = mi.k.b(i2Var.h, i2Var.f37737f.language);
                }
            }
            d3 q6 = l4.q(d70Var, this, i2Var.h, null, AndroidUtilities.dp(5000.0f), 0, i2Var.f37737f, j4Var);
            i2Var.f37736c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = i2Var.f37736c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(i2Var.f37736c.d.getLineWidth(i14)), i13);
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
        i2 i2Var = this.f37422c;
        if (!l4.l(this.f37420a, this.f37421b, motionEvent, i2Var, i2Var.f37736c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
