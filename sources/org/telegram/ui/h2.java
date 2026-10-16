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
    public final z70 f36369a;
    public final i4 f36370b;
    public final i2 f36371c;

    public h2(i2 i2Var, Context context, z70 z70Var, i4 i4Var) {
        super(context);
        this.f36371c = i2Var;
        this.f36369a = z70Var;
        this.f36370b = i4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        i2 i2Var = this.f36371c;
        if (i2Var.f36700c != null) {
            canvas.save();
            k4.v(this.f36369a, canvas, i2Var, 0);
            i2Var.f36700c.draw(canvas, this);
            canvas.restore();
            i2Var.f36700c.f34861s = (int) getX();
            i2Var.f36700c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        i2 i2Var = this.f36371c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = i2Var.f36701f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = i2Var.h;
            i4 i4Var = this.f36370b;
            z70 z70Var = this.f36369a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = k4.f37234b1;
                i2Var.h = k4.C(z70Var, i4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(i2Var.f36701f.language)) {
                    i2Var.h = li.k.b(i2Var.h, i2Var.f36701f.language);
                }
            }
            d3 q6 = k4.q(z70Var, this, i2Var.h, null, AndroidUtilities.dp(5000.0f), 0, i2Var.f36701f, i4Var);
            i2Var.f36700c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = i2Var.f36700c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(i2Var.f36700c.d.getLineWidth(i14)), i13);
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
        i2 i2Var = this.f36371c;
        if (!k4.l(this.f36369a, this.f36370b, motionEvent, i2Var, i2Var.f36700c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
