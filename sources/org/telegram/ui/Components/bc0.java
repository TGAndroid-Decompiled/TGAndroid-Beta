package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class bc0 {
    public SpannableStringBuilder f24660a;
    public int f24661b;
    public Drawable f24662c;
    public float d;
    public final int f24663e;
    public final int f24664f;
    public int f24665g = -1;
    public int h = -1;
    public float f24666i = 4.66f;

    public bc0(int i10, int i11) {
        this.f24663e = i10;
        this.f24664f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f24660a;
        int i10 = this.f24664f;
        if (spannableStringBuilder != null && this.f24662c != null && AndroidUtilities.density == this.d) {
            if (this.f24661b != org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) {
                Drawable drawable = this.f24662c;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                this.f24661b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.f24660a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.f24663e).mutate();
            this.f24662c = mutate;
            int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
            this.f24661b = v03;
            mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f24665g;
            if (i11 <= 0) {
                dp = this.f24662c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f24662c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f24666i);
            this.f24662c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f24662c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f24660a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
