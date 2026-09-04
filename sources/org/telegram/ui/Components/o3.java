package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
public final class o3 extends fq {
    public final Context f28942b;
    public final NumberTextView f28943c;

    public o3(int i10, Context context, NumberTextView numberTextView) {
        super(i10);
        this.f28942b = context;
        this.f28943c = numberTextView;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        CharSequence filter = super.filter(charSequence, i10, i11, spanned, i12, i13);
        if (filter != null && charSequence != null && filter.length() != charSequence.length()) {
            Vibrator vibrator = (Vibrator) this.f28942b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.f28943c);
        }
        return filter;
    }
}
