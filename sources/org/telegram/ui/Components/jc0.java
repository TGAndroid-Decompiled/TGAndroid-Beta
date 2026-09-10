package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import org.telegram.messenger.AndroidUtilities;
public final class jc0 {
    public SpannableStringBuilder f24344a;
    public int f24345b;
    public Drawable f24346c;
    public float d;
    public final int e;
    public final int f24347f;
    public int f24348g = -1;
    public int h = -1;
    public float f24349i = 4.66f;

    public jc0(int i10, int i11) {
        this.e = i10;
        this.f24347f = i11;
    }

    public final CharSequence a(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        int dp;
        int dp2;
        SpannableStringBuilder spannableStringBuilder = this.f24344a;
        int i10 = this.f24347f;
        if (spannableStringBuilder != null && this.f24346c != null && AndroidUtilities.density == this.d) {
            if (this.f24345b != org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) {
                Drawable drawable = this.f24346c;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                this.f24345b = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            return this.f24344a;
        } else if (context == null) {
            return null;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("v ");
            this.d = AndroidUtilities.density;
            Drawable mutate = context.getResources().getDrawable(this.e).mutate();
            this.f24346c = mutate;
            int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
            this.f24345b = v03;
            mutate.setColorFilter(new PorterDuffColorFilter(v03, PorterDuff.Mode.SRC_IN));
            int i11 = this.f24348g;
            if (i11 <= 0) {
                dp = this.f24346c.getIntrinsicWidth();
            } else {
                dp = AndroidUtilities.dp(i11);
            }
            int i12 = this.h;
            if (i12 <= 0) {
                dp2 = this.f24346c.getIntrinsicHeight();
            } else {
                dp2 = AndroidUtilities.dp(i12);
            }
            int dp3 = AndroidUtilities.dp(this.f24349i);
            this.f24346c.setBounds(0, dp3, dp, dp2 + dp3);
            spannableStringBuilder2.setSpan(new ImageSpan(this.f24346c, 2), 0, 1, 33);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(2.0f)), 1, 2, 33);
            this.f24344a = spannableStringBuilder2;
            return spannableStringBuilder2;
        }
    }
}
