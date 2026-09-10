package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ea0 extends org.telegram.ui.ActionBar.k {
    public final la0 f22654a;

    public ea0(la0 la0Var) {
        this.f22654a = la0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        la0 la0Var = this.f22654a;
        if (i10 == -1) {
            if (!la0Var.V.L(true)) {
                la0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (la0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < la0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) la0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(la0Var.getParentActivity(), 0, la0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f17528a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f17528a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new km(8, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new q2(13));
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    d2Var.show();
                    d2Var.h();
                }
            }
        } else if (i10 == 10) {
            ia0 ia0Var = la0Var.V;
            ia0Var.c1(ia0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            la0Var.V.L(true);
            la0Var.V.getSearchItem().z(false);
        }
    }
}
