package org.telegram.ui.iv;

import org.telegram.ui.ActionBar.AlertDialog;

public final class RichInlineButtonEditor$$ExternalSyntheticLambda10 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final RichEditorListView.BlockButtonEdit f$0;

    public RichInlineButtonEditor$$ExternalSyntheticLambda10(RichEditorListView.BlockButtonEdit blockButtonEdit, int i) {
        this.$r8$classId = i;
        this.f$0 = blockButtonEdit;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.delete();
                break;
            default:
                this.f$0.delete();
                break;
        }
    }
}
