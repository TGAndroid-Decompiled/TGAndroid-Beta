package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class dc0 {
    public SpannableStringBuilder f26249a;
    public int f26250b;
    public Drawable f26251c;
    public float d;
    public final int f26252e;
    public final int f26253f;
    public int f26254g = -1;
    public int h = -1;
    public float f26255i = 4.66f;

    public dc0(int i10, int i11) {
        this.f26252e = i10;
        this.f26253f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f26249a;
        int i10 = this.f26253f;
        if (spannableStringBuilder != null && this.f26251c != null && AndroidUtilities.density == this.d) {
            if (this.f26250b != org.telegram.ui.ActionBar.k6.v0(i10, g6Var)) {
                Drawable drawable = this.f26251c;
                int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
                this.f26250b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.f26249a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.f26252e).mutate();
            this.f26251c = mutate;
            int v03 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
            this.f26250b = v03;
            mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f26254g;
            if (i11 <= 0) {
                dp = this.f26251c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f26251c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f26255i);
            this.f26251c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f26251c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f26249a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
