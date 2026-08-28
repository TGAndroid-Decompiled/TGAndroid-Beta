package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d90 extends org.telegram.ui.ActionBar.j {
    public final k90 f27692a;

    public d90(k90 k90Var) {
        this.f27692a = k90Var;
    }

    @Override
    public final void b(int i9) {
        int i10;
        k90 k90Var = this.f27692a;
        if (i9 == -1) {
            if (!k90Var.R.L(true)) {
                k90Var.finishFragment();
            }
        } else if (i9 == 2) {
            if (k90Var.E != null) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < k90Var.E.size(); i11++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) k90Var.E.valueAt(i11)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k90Var.getParentActivity(), 0, k90Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i10 = R.string.DeleteStoriesTitle;
                    } else {
                        i10 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f22702a.N = LocaleController.getString(i10);
                    alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new g1(22, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new g2(17));
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.show();
                    c2Var.h();
                }
            }
        } else if (i9 == 10) {
            h90 h90Var = k90Var.R;
            h90Var.c1(h90Var.getClosestTab(), false);
        } else if (i9 == 11) {
            k90Var.R.L(true);
            k90Var.R.getSearchItem().z(false);
        }
    }
}
