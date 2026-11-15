package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
public final class k3 extends xp {
    public final Context f36266b;
    public final NumberTextView f36267c;

    public k3(int i7, Context context, NumberTextView numberTextView) {
        super(i7);
        this.f36266b = context;
        this.f36267c = numberTextView;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        CharSequence filter = super.filter(charSequence, i7, i10, spanned, i11, i12);
        if (filter != null && charSequence != null && filter.length() != charSequence.length()) {
            Vibrator vibrator = (Vibrator) this.f36266b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            org.telegram.messenger.g0.E3(this.f36267c);
        }
        return filter;
    }
}
