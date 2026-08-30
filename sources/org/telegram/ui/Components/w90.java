package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class w90 extends org.telegram.ui.ActionBar.j {
    public final da0 f30280a;

    public w90(da0 da0Var) {
        this.f30280a = da0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        da0 da0Var = this.f30280a;
        if (i10 == -1) {
            if (!da0Var.S.L(true)) {
                da0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (da0Var.F != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < da0Var.F.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) da0Var.F.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(da0Var.getParentActivity(), 0, da0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f19503a.O = LocaleController.getString(i11);
                    alertDialog$Builder.f19503a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new o1(21, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new k2(16));
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                    d2Var.show();
                    d2Var.h();
                }
            }
        } else if (i10 == 10) {
            aa0 aa0Var = da0Var.S;
            aa0Var.c1(aa0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            da0Var.S.L(true);
            da0Var.S.getSearchItem().z(false);
        }
    }
}
