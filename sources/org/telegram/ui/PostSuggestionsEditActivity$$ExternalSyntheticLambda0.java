package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.UItem;

public final class PostSuggestionsEditActivity$$ExternalSyntheticLambda0 implements AlertDialog.OnButtonClickListener, Utilities.Callback5 {
    public final int $r8$classId;
    public final PostSuggestionsEditActivity f$0;

    public PostSuggestionsEditActivity$$ExternalSyntheticLambda0(PostSuggestionsEditActivity postSuggestionsEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = postSuggestionsEditActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.processDone$16();
                break;
            default:
                this.f$0.lambda$onBackPressed$5$1(alertDialog, i);
                break;
        }
    }

    @Override
    public void mo1067run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        PostSuggestionsEditActivity postSuggestionsEditActivity = this.f$0;
        postSuggestionsEditActivity.getClass();
        if (((UItem) obj).id == 1) {
            TextCheckCell textCheckCell = (TextCheckCell) view;
            boolean z = !textCheckCell.checkBox.isChecked;
            postSuggestionsEditActivity.isSuggestionsEnabled = z;
            textCheckCell.setChecked(z);
            postSuggestionsEditActivity.listView.adapter.update(true);
            postSuggestionsEditActivity.checkDone$7(true);
        }
    }
}
