package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
public final class k3 extends pp {
    public final Context f35259b;
    public final NumberTextView f35260c;

    public k3(int i3, Context context, NumberTextView numberTextView) {
        super(i3);
        this.f35259b = context;
        this.f35260c = numberTextView;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i3, int i10, Spanned spanned, int i11, int i12) {
        CharSequence filter = super.filter(charSequence, i3, i10, spanned, i11, i12);
        if (filter != null && charSequence != null && filter.length() != charSequence.length()) {
            Vibrator vibrator = (Vibrator) this.f35259b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            org.telegram.messenger.g0.F3(this.f35260c);
        }
        return filter;
    }
}
