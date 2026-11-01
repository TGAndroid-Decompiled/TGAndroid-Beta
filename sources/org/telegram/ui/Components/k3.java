package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
public final class k3 extends wp {
    public final Context f27721b;
    public final NumberTextView f27722c;

    public k3(int i10, Context context, NumberTextView numberTextView) {
        super(i10);
        this.f27721b = context;
        this.f27722c = numberTextView;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        CharSequence filter = super.filter(charSequence, i10, i11, spanned, i12, i13);
        if (filter != null && charSequence != null && filter.length() != charSequence.length()) {
            Vibrator vibrator = (Vibrator) this.f27721b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            org.telegram.messenger.i0.E3(this.f27722c);
        }
        return filter;
    }
}
