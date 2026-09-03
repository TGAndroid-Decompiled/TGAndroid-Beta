package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class dc0 {
    public SpannableStringBuilder f26252a;
    public int f26253b;
    public Drawable f26254c;
    public float d;
    public final int f26255e;
    public final int f26256f;
    public int f26257g = -1;
    public int h = -1;
    public float f26258i = 4.66f;

    public dc0(int i10, int i11) {
        this.f26255e = i10;
        this.f26256f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f26252a;
        int i10 = this.f26256f;
        if (spannableStringBuilder != null && this.f26254c != null && AndroidUtilities.density == this.d) {
            if (this.f26253b != org.telegram.ui.ActionBar.k6.v0(i10, g6Var)) {
                Drawable drawable = this.f26254c;
                int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
                this.f26253b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.f26252a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.f26255e).mutate();
            this.f26254c = mutate;
            int v03 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
            this.f26253b = v03;
            mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f26257g;
            if (i11 <= 0) {
                dp = this.f26254c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f26254c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f26258i);
            this.f26254c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f26254c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f26252a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
