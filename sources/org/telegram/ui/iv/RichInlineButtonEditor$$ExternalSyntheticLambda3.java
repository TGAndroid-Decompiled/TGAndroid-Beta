package org.telegram.ui.iv;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextCaption;

public final class RichInlineButtonEditor$$ExternalSyntheticLambda3 implements EditTextCaption.InputDialogCallback, RichInlineButtonEditor.UserPicked {
    public final int $r8$classId;
    public final RichEditorListView.InlineButtonEdit f$0;

    public RichInlineButtonEditor$$ExternalSyntheticLambda3(RichEditorListView.InlineButtonEdit inlineButtonEdit, int i) {
        this.$r8$classId = i;
        this.f$0 = inlineButtonEdit;
    }

    @Override
    public void run(long j) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j;
        this.f$0.apply(tL_inlineButtonTypeUserProfile);
    }

    @Override
    public void run(String str) {
        switch (this.$r8$classId) {
            case 0:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                    tL_inlineButtonTypeUrl.url = str;
                    this.f$0.apply(tL_inlineButtonTypeUrl);
                    break;
                }
                break;
            default:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                    tL_inlineButtonTypeCopy.copy_text = str;
                    this.f$0.apply(tL_inlineButtonTypeCopy);
                    break;
                }
                break;
        }
    }
}
