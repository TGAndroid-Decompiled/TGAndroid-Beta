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
    public final b70 f37470a;
    public final j4 f37471b;
    public final i2 f37472c;

    public h2(i2 i2Var, Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.f37472c = i2Var;
        this.f37470a = b70Var;
        this.f37471b = j4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        i2 i2Var = this.f37472c;
        if (i2Var.f37841c != null) {
            canvas.save();
            l4.v(this.f37470a, canvas, i2Var, 0);
            i2Var.f37841c.draw(canvas, this);
            canvas.restore();
            i2Var.f37841c.f36246s = (int) getX();
            i2Var.f37841c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        i2 i2Var = this.f37472c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = i2Var.f37842f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = i2Var.h;
            j4 j4Var = this.f37471b;
            b70 b70Var = this.f37470a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = l4.f38739b1;
                i2Var.h = l4.C(b70Var, j4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(i2Var.f37842f.language)) {
                    i2Var.h = mi.k.b(i2Var.h, i2Var.f37842f.language);
                }
            }
            d3 q6 = l4.q(b70Var, this, i2Var.h, null, AndroidUtilities.dp(5000.0f), 0, i2Var.f37842f, j4Var);
            i2Var.f37841c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = i2Var.f37841c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(i2Var.f37841c.d.getLineWidth(i14)), i13);
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
        i2 i2Var = this.f37472c;
        if (!l4.l(this.f37470a, this.f37471b, motionEvent, i2Var, i2Var.f37841c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
