package org.telegram.ui.iv;

import android.view.KeyEvent;
import android.view.View;

public final class RichEditorListView$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final RichEditorListView f$0;
    public final int f$1;

    public RichEditorListView$$ExternalSyntheticLambda5(RichEditorListView richEditorListView, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = richEditorListView;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.scrollBy(0, this.f$1);
                break;
            case 1:
                this.f$0.persistDetailsTitle(this.f$1);
                break;
            case 2:
                KeyEvent.Callback callbackSelectableAt = this.f$0.selectableAt(this.f$1);
                if (callbackSelectableAt instanceof RichCaptionHost) {
                    ((RichCaptionHost) callbackSelectableAt).persistCaption();
                }
                break;
            default:
                View viewSelectableAt = this.f$0.selectableAt(this.f$1);
                if (viewSelectableAt instanceof RichTextCell) {
                    ((RichTextCell) viewSelectableAt).persistAuthor();
                }
                break;
        }
    }
}
