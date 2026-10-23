package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class g2 extends View {
    public final f70 f37466a;
    public final i4 f37467b;
    public final h2 f37468c;

    public g2(h2 h2Var, Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.f37468c = h2Var;
        this.f37466a = f70Var;
        this.f37467b = i4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        h2 h2Var = this.f37468c;
        if (h2Var.f37712c != null) {
            canvas.save();
            k4.v(this.f37466a, canvas, h2Var, 0);
            h2Var.f37712c.draw(canvas, this);
            canvas.restore();
            h2Var.f37712c.f36233s = (int) getX();
            h2Var.f37712c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        h2 h2Var = this.f37468c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = h2Var.f37713f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = h2Var.h;
            i4 i4Var = this.f37467b;
            f70 f70Var = this.f37466a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = k4.f38761c1;
                h2Var.h = k4.C(f70Var, i4Var.E, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(h2Var.f37713f.language)) {
                    h2Var.h = mi.k.b(h2Var.h, h2Var.f37713f.language);
                }
            }
            c3 q6 = k4.q(f70Var, this, h2Var.h, null, AndroidUtilities.dp(5000.0f), 0, h2Var.f37713f, i4Var);
            h2Var.f37712c = q6;
            if (q6 != null) {
                i12 = q6.d.getHeight();
                int lineCount = h2Var.f37712c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(h2Var.f37712c.d.getLineWidth(i14)), i13);
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
        h2 h2Var = this.f37468c;
        if (!k4.l(this.f37466a, this.f37467b, motionEvent, h2Var, h2Var.f37712c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
