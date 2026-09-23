package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class zb0 {
    public SpannableStringBuilder f30556a;
    public int f30557b;
    public Drawable f30558c;
    public float d;
    public final int e;
    public final int f30559f;
    public int f30560g = -1;
    public int h = -1;
    public float f30561i = 4.66f;

    public zb0(int i10, int i11) {
        this.e = i10;
        this.f30559f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f30556a;
        int i10 = this.f30559f;
        if (spannableStringBuilder != null && this.f30558c != null && AndroidUtilities.density == this.d) {
            if (this.f30557b != org.telegram.ui.ActionBar.h6.v0(i10, d6Var)) {
                Drawable drawable = this.f30558c;
                int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
                this.f30557b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.f30556a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.f30558c = mutate;
            int v03 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
            this.f30557b = v03;
            mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f30560g;
            if (i11 <= 0) {
                dp = this.f30558c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f30558c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f30561i);
            this.f30558c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f30558c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f30556a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
