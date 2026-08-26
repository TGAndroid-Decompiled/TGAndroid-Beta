package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.Utilities;

public final class LinkEditActivity$$ExternalSyntheticLambda14 implements Utilities.Callback {
    public final int $r8$classId;

    public LinkEditActivity$$ExternalSyntheticLambda14(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                LinkEditActivity.lambda$createView$11((Integer) obj);
                break;
            case 1:
                ((Boolean) obj).getClass();
                break;
            default:
                RestrictedLanguagesSelectActivity.lambda$checkRestrictedLanguages$2((HashSet) obj);
                break;
        }
    }
}
