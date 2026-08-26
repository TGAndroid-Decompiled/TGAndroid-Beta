package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog;

public final class GroupCallActivity$6$$ExternalSyntheticLambda4 implements TextView.OnEditorActionListener {
    public final int $r8$classId;
    public final AlertDialog.Builder f$0;

    public GroupCallActivity$6$$ExternalSyntheticLambda4(AlertDialog.Builder builder, int i) {
        this.$r8$classId = i;
        this.f$0 = builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                return GroupCallActivity.AnonymousClass6.lambda$onItemClick$4(this.f$0, textView, i, keyEvent);
            case 1:
                return FilterChatlistActivity.ListAdapter.AnonymousClass1.lambda$editname$5(this.f$0, textView, i, keyEvent);
            default:
                return GroupCallActivity.AnonymousClass6.AnonymousClass1.lambda$onStartRecord$0(this.f$0, textView, i, keyEvent);
        }
    }
}
