package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.messenger.Emoji;
public final class f4 extends org.telegram.ui.ActionBar.l5 {
    public final int M0;

    public f4(Context context, int i10) {
        super(context);
        this.M0 = i10;
    }

    @Override
    public boolean k(CharSequence charSequence) {
        switch (this.M0) {
            case 1:
                return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            case 2:
                return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            case 3:
            default:
                return super.k(charSequence);
            case 4:
                return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
        }
    }

    @Override
    public boolean l(CharSequence charSequence, boolean z10) {
        switch (this.M0) {
            case 0:
                return super.l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), z10);
            case 3:
                return super.l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
            default:
                return super.l(charSequence, z10);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.M0) {
            case 5:
                super.onMeasure(i10, i11);
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
