package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class r90 extends org.telegram.ui.ActionBar.k {
    public final y90 f32246a;

    public r90(y90 y90Var) {
        this.f32246a = y90Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        y90 y90Var = this.f32246a;
        if (i10 == -1) {
            if (!y90Var.R.L(true)) {
                y90Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (y90Var.E != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < y90Var.E.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) y90Var.E.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y90Var.getParentActivity(), 0, y90Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f22714a.N = LocaleController.getString(i11);
                    alertDialog$Builder.f22714a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j1(22, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new r2(11));
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.show();
                    c2Var.h();
                }
            }
        } else if (i10 == 10) {
            v90 v90Var = y90Var.R;
            v90Var.c1(v90Var.getClosestTab(), false);
        } else if (i10 == 11) {
            y90Var.R.L(true);
            y90Var.R.getSearchItem().z(false);
        }
    }
}
