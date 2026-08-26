package org.telegram.ui.iv;

import android.text.TextUtils;
import android.webkit.JsPromptResult;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextCaption;

public final class RichInlineButtonEditor$$ExternalSyntheticLambda19 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public RichInlineButtonEditor$$ExternalSyntheticLambda19(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                String strTrim = ((EditTextBoldCursor) this.f$0).getText().toString().trim();
                String strTrim2 = ((EditTextBoldCursor) this.f$1).getText().toString().trim();
                if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                    RichInlineButtonEditor$$ExternalSyntheticLambda0 richInlineButtonEditor$$ExternalSyntheticLambda0 = (RichInlineButtonEditor$$ExternalSyntheticLambda0) this.f$2;
                    switch (richInlineButtonEditor$$ExternalSyntheticLambda0.$r8$classId) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = strTrim2;
                            richInlineButtonEditor$$ExternalSyntheticLambda0.f$0.apply(strTrim, tL_inlineButtonTypeUrl);
                            break;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = strTrim2;
                            richInlineButtonEditor$$ExternalSyntheticLambda0.f$0.apply(strTrim, tL_inlineButtonTypeCopy);
                            break;
                    }
                }
                break;
            default:
                boolean[] zArr = (boolean[]) this.f$0;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) this.f$1).confirm(((EditTextCaption) this.f$2).getText().toString());
                }
                break;
        }
    }
}
