package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
public final class k4 extends pp {
    public final Context f35263b;

    public k4(Context context) {
        super(255);
        this.f35263b = context;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i3, int i10, Spanned spanned, int i11, int i12) {
        Vibrator vibrator;
        CharSequence filter = super.filter(charSequence, i3, i10, spanned, i11, i12);
        if (filter != null && charSequence != null && filter.length() != charSequence.length() && (vibrator = (Vibrator) this.f35263b.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200L);
        }
        return filter;
    }
}
