package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ga0 extends org.telegram.ui.ActionBar.j {
    public final na0 f24421a;

    public ga0(na0 na0Var) {
        this.f24421a = na0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        na0 na0Var = this.f24421a;
        if (i10 == -1) {
            if (!na0Var.V.L(true)) {
                na0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (na0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < na0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) na0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(na0Var.getParentActivity(), 0, na0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f18661a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f18661a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new w2(14, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fa0(0));
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
                    a2Var.show();
                    a2Var.h();
                }
            }
        } else if (i10 == 10) {
            ka0 ka0Var = na0Var.V;
            ka0Var.c1(ka0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            na0Var.V.L(true);
            na0Var.V.getSearchItem().z(false);
        }
    }
}
