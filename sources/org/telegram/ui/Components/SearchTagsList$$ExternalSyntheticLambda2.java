package org.telegram.ui.Components;

import android.view.View;
import androidx.core.util.Consumer;

public final class SearchTagsList$$ExternalSyntheticLambda2 implements Consumer {
    public final int $r8$classId;

    public SearchTagsList$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.$r8$classId) {
            case 0:
                SearchTagsList.lambda$new$1(view);
                break;
            case 1:
                ChatAttachAlertPhotoLayout.lambda$updatePhotoStarsPrice$11(view);
                break;
            default:
                SearchTagsList.lambda$clear$11(view);
                break;
        }
    }
}
