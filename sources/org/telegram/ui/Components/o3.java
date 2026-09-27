package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
public final class o3 extends iq {
    public final Context f26949b;
    public final NumberTextView f26950c;

    public o3(int i10, Context context, NumberTextView numberTextView) {
        super(i10);
        this.f26949b = context;
        this.f26950c = numberTextView;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        CharSequence filter = super.filter(charSequence, i10, i11, spanned, i12, i13);
        if (filter != null && charSequence != null && filter.length() != charSequence.length()) {
            Vibrator vibrator = (Vibrator) this.f26949b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.f26950c);
        }
        return filter;
    }
}
