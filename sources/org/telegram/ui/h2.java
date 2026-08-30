package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
public final class h2 extends View {
    public final n70 f34729a;
    public final j4 f34730b;
    public final i2 f34731c;

    public h2(i2 i2Var, Context context, n70 n70Var, j4 j4Var) {
        super(context);
        this.f34731c = i2Var;
        this.f34729a = n70Var;
        this.f34730b = j4Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        i2 i2Var = this.f34731c;
        if (i2Var.f34999c != null) {
            canvas.save();
            l4.v(this.f34729a, canvas, i2Var, 0);
            i2Var.f34999c.draw(canvas, this);
            canvas.restore();
            i2Var.f34999c.f33499s = (int) getX();
            i2Var.f34999c.v = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        i2 i2Var = this.f34731c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = i2Var.f35000f;
        int i13 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = i2Var.h;
            j4 j4Var = this.f34730b;
            n70 n70Var = this.f34729a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int dp = AndroidUtilities.dp(5000.0f);
                HashSet hashSet = l4.Y0;
                i2Var.h = l4.C(n70Var, j4Var.B, this, richText, richText, pageblockpreformatted, dp);
                if (!TextUtils.isEmpty(i2Var.f35000f.language)) {
                    i2Var.h = CodeHighlighting.getHighlighted(i2Var.h, i2Var.f35000f.language);
                }
            }
            d3 q10 = l4.q(n70Var, this, i2Var.h, null, AndroidUtilities.dp(5000.0f), 0, i2Var.f35000f, j4Var);
            i2Var.f34999c = q10;
            if (q10 != null) {
                i12 = q10.d.getHeight();
                int lineCount = i2Var.f34999c.d.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    i13 = Math.max((int) Math.ceil(i2Var.f34999c.d.getLineWidth(i14)), i13);
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
        i2 i2Var = this.f34731c;
        if (!l4.l(this.f34729a, this.f34730b, motionEvent, i2Var, i2Var.f34999c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
