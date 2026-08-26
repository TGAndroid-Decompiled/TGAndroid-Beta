package org.telegram.ui.iv;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.StickersDialogs;

public final class RichEditText$$ExternalSyntheticLambda1 implements InputFilter {
    public final int $r8$classId;
    public final EditTextBoldCursor f$0;

    public RichEditText$$ExternalSyntheticLambda1(int i, EditTextBoldCursor editTextBoldCursor) {
        this.$r8$classId = i;
        this.f$0 = editTextBoldCursor;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        switch (this.$r8$classId) {
            case 0:
                RichEditText richEditText = (RichEditText) this.f$0;
                if (!richEditText.locked || richEditText.ignoreTextChange) {
                    return null;
                }
                RichEditText.Listener listener = richEditText.listener;
                if (listener != null && charSequence != null && i2 > i && i3 == i4) {
                    listener.onLockedInsert(charSequence.subSequence(i, i2));
                }
                return spanned.subSequence(i3, i4);
            default:
                if (charSequence.length() <= 0 || !Character.isWhitespace(charSequence.charAt(0))) {
                    return charSequence;
                }
                return (TextUtils.isEmpty(((StickersDialogs.AnonymousClass1) this.f$0).getText()) || i3 == 0) ? "" : charSequence;
        }
    }
}
