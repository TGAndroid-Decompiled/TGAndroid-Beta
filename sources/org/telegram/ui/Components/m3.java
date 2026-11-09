package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
public final class m3 extends pp {
    public final Context f35927b;
    public final NumberTextView f35928c;

    public m3(int i7, Context context, NumberTextView numberTextView) {
        super(i7);
        this.f35927b = context;
        this.f35928c = numberTextView;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        CharSequence filter = super.filter(charSequence, i7, i10, spanned, i11, i12);
        if (filter != null && charSequence != null && filter.length() != charSequence.length()) {
            Vibrator vibrator = (Vibrator) this.f35927b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            org.telegram.messenger.g0.F3(this.f35928c);
        }
        return filter;
    }
}
