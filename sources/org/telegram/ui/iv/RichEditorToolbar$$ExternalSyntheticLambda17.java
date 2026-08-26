package org.telegram.ui.iv;

import android.view.View;

public final class RichEditorToolbar$$ExternalSyntheticLambda17 implements View.OnClickListener {
    public final int $r8$classId;
    public final RichEditorToolbar f$0;
    public final int f$1;

    public RichEditorToolbar$$ExternalSyntheticLambda17(RichEditorToolbar richEditorToolbar, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = richEditorToolbar;
        this.f$1 = i;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ChatAttachAlertRichLayout.this.onBlockButtonClicked(this.f$1, view);
                break;
            default:
                ChatAttachAlertRichLayout.this.listView.onFormattingClicked(this.f$1);
                break;
        }
    }
}
