package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
public final class j3 extends wp {
    public final Context f29614b;
    public final NumberTextView f29615c;

    public j3(int i9, Context context, NumberTextView numberTextView) {
        super(i9);
        this.f29614b = context;
        this.f29615c = numberTextView;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        CharSequence filter = super.filter(charSequence, i9, i10, spanned, i11, i12);
        if (filter != null && charSequence != null && filter.length() != charSequence.length()) {
            Vibrator vibrator = (Vibrator) this.f29614b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.f29615c);
        }
        return filter;
    }
}
