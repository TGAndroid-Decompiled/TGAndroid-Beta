package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ab0 extends org.telegram.ui.ActionBar.j {
    public final hb0 f24275a;

    public ab0(hb0 hb0Var) {
        this.f24275a = hb0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        hb0 hb0Var = this.f24275a;
        if (i10 == -1) {
            if (!hb0Var.V.L(true)) {
                hb0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (hb0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < hb0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) hb0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hb0Var.getParentActivity(), 0, hb0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f20142a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f20142a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new y2(14, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new f2(22));
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                    a2Var.show();
                    a2Var.h();
                }
            }
        } else if (i10 == 10) {
            eb0 eb0Var = hb0Var.V;
            eb0Var.c1(eb0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            hb0Var.V.L(true);
            hb0Var.V.getSearchItem().z(false);
        }
    }
}
