package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
public final class n3 extends aq {
    public final Context f30837b;
    public final NumberTextView f30838c;

    public n3(int i10, Context context, NumberTextView numberTextView) {
        super(i10);
        this.f30837b = context;
        this.f30838c = numberTextView;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        CharSequence filter = super.filter(charSequence, i10, i11, spanned, i12, i13);
        if (filter != null && charSequence != null && filter.length() != charSequence.length()) {
            Vibrator vibrator = (Vibrator) this.f30837b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.f30838c);
        }
        return filter;
    }
}
