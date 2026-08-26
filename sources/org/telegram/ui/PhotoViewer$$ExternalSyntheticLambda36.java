package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;

public final class PhotoViewer$$ExternalSyntheticLambda36 implements AlertDialog.OnButtonClickListener, Utilities.Callback2Return {
    public final int $r8$classId;

    public PhotoViewer$$ExternalSyntheticLambda36(int i) {
        this.$r8$classId = i;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer.lambda$sendPressed$87(alertDialog, i);
                break;
            case 1:
            default:
                alertDialog.dismiss();
                break;
            case 2:
                alertDialog.dismiss();
                break;
            case 3:
                alertDialog.dismiss();
                break;
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        return PostSuggestionsEditActivity.lambda$fillItems$0((Integer) obj, (Integer) obj2);
    }
}
