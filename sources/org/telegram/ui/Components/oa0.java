package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class oa0 extends org.telegram.ui.ActionBar.j {
    public final va0 f29192a;

    public oa0(va0 va0Var) {
        this.f29192a = va0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        va0 va0Var = this.f29192a;
        if (i10 == -1) {
            if (!va0Var.V.M(true)) {
                va0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (va0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < va0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) va0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(va0Var.getParentActivity(), 0, va0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f20679a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f20679a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new o2(19, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new d2(23));
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                    c2Var.show();
                    c2Var.i();
                }
            }
        } else if (i10 == 10) {
            sa0 sa0Var = va0Var.V;
            sa0Var.f1(sa0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            va0Var.V.M(true);
            va0Var.V.getSearchItem().z(false);
        }
    }
}
