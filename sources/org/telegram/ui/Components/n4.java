package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;

public final class n4 extends up {

    public final Context f30835b;

    public n4(Context context) {
        super(255);
        this.f30835b = context;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        Vibrator vibrator;
        CharSequence charSequenceFilter = super.filter(charSequence, i10, i11, spanned, i12, i13);
        if (charSequenceFilter != null && charSequence != null && charSequenceFilter.length() != charSequence.length() && (vibrator = (Vibrator) this.f30835b.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200L);
        }
        return charSequenceFilter;
    }
}
