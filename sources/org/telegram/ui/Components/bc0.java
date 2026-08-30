package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class bc0 {
    public SpannableStringBuilder f23635a;
    public int f23636b;
    public Drawable f23637c;
    public float d;
    public final int e;
    public final int f23638f;
    public int f23639g = -1;
    public int h = -1;
    public float f23640i = 4.66f;

    public bc0(int i10, int i11) {
        this.e = i10;
        this.f23638f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f23635a;
        int i10 = this.f23638f;
        if (spannableStringBuilder != null && this.f23637c != null && AndroidUtilities.density == this.d) {
            if (this.f23636b != org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) {
                Drawable drawable = this.f23637c;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                this.f23636b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.f23635a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.f23637c = mutate;
            int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
            this.f23636b = v03;
            mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f23639g;
            if (i11 <= 0) {
                dp = this.f23637c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f23637c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f23640i);
            this.f23637c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f23637c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f23635a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
