package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qa0 extends org.telegram.ui.ActionBar.j {
    public final xa0 f29821a;

    public qa0(xa0 xa0Var) {
        this.f29821a = xa0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        xa0 xa0Var = this.f29821a;
        if (i10 == -1) {
            if (!xa0Var.V.M(true)) {
                xa0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (xa0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < xa0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) xa0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa0Var.getParentActivity(), 0, xa0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f20678a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f20678a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new p2(19, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new e2(23));
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                    c2Var.show();
                    c2Var.i();
                }
            }
        } else if (i10 == 10) {
            ua0 ua0Var = xa0Var.V;
            ua0Var.f1(ua0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            xa0Var.V.M(true);
            xa0Var.V.getSearchItem().z(false);
        }
    }
}
