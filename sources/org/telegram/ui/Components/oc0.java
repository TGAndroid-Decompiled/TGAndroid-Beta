package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class oc0 {
    public SpannableStringBuilder f27056a;
    public int f27057b;
    public Drawable f27058c;
    public float d;
    public final int e;
    public final int f27059f;
    public int f27060g = -1;
    public int h = -1;
    public float f27061i = 4.66f;

    public oc0(int i10, int i11) {
        this.e = i10;
        this.f27059f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f27056a;
        int i10 = this.f27059f;
        if (spannableStringBuilder != null && this.f27058c != null && AndroidUtilities.density == this.d) {
            if (this.f27057b != org.telegram.ui.ActionBar.h6.v0(i10, d6Var)) {
                Drawable drawable = this.f27058c;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                this.f27057b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.f27056a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.f27058c = mutate;
            int v03 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
            this.f27057b = v03;
            mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f27060g;
            if (i11 <= 0) {
                dp = this.f27058c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f27058c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f27061i);
            this.f27058c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f27058c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.q2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f27056a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
