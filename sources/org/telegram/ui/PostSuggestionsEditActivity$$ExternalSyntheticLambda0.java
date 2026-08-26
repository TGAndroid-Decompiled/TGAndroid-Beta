package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
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
                this.f$0.lambda$onBackPressed$4(alertDialog, i);
                break;
            default:
                this.f$0.lambda$onBackPressed$5(alertDialog, i);
                break;
        }
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Integer) obj3).intValue();
        float fFloatValue = ((Float) obj4).floatValue();
        float fFloatValue2 = ((Float) obj5).floatValue();
        this.f$0.onItemClick((UItem) obj, (View) obj2, iIntValue, fFloatValue, fFloatValue2);
    }
}
