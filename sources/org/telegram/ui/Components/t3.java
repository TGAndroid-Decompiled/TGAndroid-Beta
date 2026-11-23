package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
public final class t3 extends gq {
    public final Context f39755b;
    public final NumberTextView f39756c;

    public t3(int i7, Context context, NumberTextView numberTextView) {
        super(i7);
        this.f39755b = context;
        this.f39756c = numberTextView;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        CharSequence filter = super.filter(charSequence, i7, i10, spanned, i11, i12);
        if (filter != null && charSequence != null && filter.length() != charSequence.length()) {
            Vibrator vibrator = (Vibrator) this.f39755b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            org.telegram.messenger.g0.D3(this.f39756c);
        }
        return filter;
    }
}
