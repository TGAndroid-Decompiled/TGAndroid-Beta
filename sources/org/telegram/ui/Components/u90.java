package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class u90 extends org.telegram.ui.ActionBar.j {
    public final ba0 f28314a;

    public u90(ba0 ba0Var) {
        this.f28314a = ba0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        ba0 ba0Var = this.f28314a;
        if (i10 == -1) {
            if (!ba0Var.V.L(true)) {
                ba0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (ba0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < ba0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) ba0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ba0Var.getParentActivity(), 0, ba0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f18447a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f18447a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new mf(12, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new l2(15));
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                    c2Var.show();
                    c2Var.h();
                }
            }
        } else if (i10 == 10) {
            y90 y90Var = ba0Var.V;
            y90Var.c1(y90Var.getClosestTab(), false);
        } else if (i10 == 11) {
            ba0Var.V.L(true);
            ba0Var.V.getSearchItem().z(false);
        }
    }
}
