package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.EditTextCell;

public final class AIEditorAlert$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final AIEditorAlert f$0;

    public AIEditorAlert$$ExternalSyntheticLambda0(AIEditorAlert aIEditorAlert, int i) {
        this.$r8$classId = i;
        this.f$0 = aIEditorAlert;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateButton$15(view);
                break;
            case 1:
                AIEditorAlert aIEditorAlert = this.f$0;
                aIEditorAlert.runSend(0, 0, true);
                aIEditorAlert.lambda$showGiftOfferSheet$15();
                break;
            case 2:
                AIEditorAlert aIEditorAlert2 = this.f$0;
                EditTextCell editTextCell = aIEditorAlert2.promptCell;
                AndroidUtilities.hideKeyboard(editTextCell.editText);
                aIEditorAlert2.promptText = editTextCell.getText().toString();
                aIEditorAlert2.updatePromptEditText();
                aIEditorAlert2.updateButton$1(true);
                aIEditorAlert2.request();
                break;
            case 3:
                AIEditorAlert aIEditorAlert3 = this.f$0;
                aIEditorAlert3.collapsed = false;
                aIEditorAlert3.saveScrollPosition$2();
                aIEditorAlert3.adapter.update(true);
                aIEditorAlert3.applyScrolledPosition$1();
                break;
            case 4:
                this.f$0.onToLangMenu(view);
                break;
            case 5:
                AIEditorAlert aIEditorAlert4 = this.f$0;
                aIEditorAlert4.emojify = !aIEditorAlert4.emojify;
                aIEditorAlert4.request();
                if (view instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    if (linearLayout.getChildAt(0) instanceof CheckBox2) {
                        ((CheckBox2) linearLayout.getChildAt(0)).checkBoxBase.setChecked(-1, aIEditorAlert4.emojify, true);
                    }
                }
                break;
            case 6:
                AIEditorAlert aIEditorAlert5 = this.f$0;
                if (!aIEditorAlert5.loading) {
                    AndroidUtilities.addToClipboard(aIEditorAlert5.getResultText());
                    break;
                }
                break;
            case 7:
                this.f$0.lambda$updateButton$18(view);
                break;
            case 8:
                AIEditorAlert aIEditorAlert6 = this.f$0;
                if (aIEditorAlert6.onUseRichListener != null) {
                    TL_iv.RichMessage resultRich = aIEditorAlert6.getResultRich();
                    if (resultRich != null) {
                        aIEditorAlert6.onUseRichListener.run(resultRich);
                    }
                } else if (aIEditorAlert6.onUseListener != null && aIEditorAlert6.getResultText() != null) {
                    aIEditorAlert6.onUseListener.run(aIEditorAlert6.getResultText());
                }
                aIEditorAlert6.lambda$showGiftOfferSheet$15();
                break;
            default:
                this.f$0.lambda$new$0$4(view);
                break;
        }
    }
}
