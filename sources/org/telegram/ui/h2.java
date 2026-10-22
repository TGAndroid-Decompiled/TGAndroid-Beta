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
    public final b70 f37469a;
    public final j4 f37470b;
    public final i2 f37471c;

    public h2(i2 i2Var, Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.f37471c = i2Var;
        this.f37469a = b70Var;
        this.f37470b = j4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        i2 i2Var = this.f37471c;
        if (i2Var.f37840c != null) {
            canvas.save();
            l4.v(this.f37469a, canvas, i2Var, 0);
            i2Var.f37840c.draw(canvas, this);
            canvas.restore();
            i2Var.f37840c.f36245s = (int) getX();
            i2Var.f37840c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        i2 i2Var = this.f37471c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = i2Var.f37841f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = i2Var.h;
            j4 j4Var = this.f37470b;
            b70 b70Var = this.f37469a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = l4.f38738b1;
                i2Var.h = l4.C(b70Var, j4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(i2Var.f37841f.language)) {
                    i2Var.h = mi.k.b(i2Var.h, i2Var.f37841f.language);
                }
            }
            d3 q6 = l4.q(b70Var, this, i2Var.h, null, AndroidUtilities.dp(5000.0f), 0, i2Var.f37841f, j4Var);
            i2Var.f37840c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = i2Var.f37840c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(i2Var.f37840c.d.getLineWidth(i14)), i13);
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
        i2 i2Var = this.f37471c;
        if (!l4.l(this.f37469a, this.f37470b, motionEvent, i2Var, i2Var.f37840c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
