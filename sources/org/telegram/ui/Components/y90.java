package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y90 extends org.telegram.ui.ActionBar.j {
    public final fa0 f33443a;

    public y90(fa0 fa0Var) {
        this.f33443a = fa0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        fa0 fa0Var = this.f33443a;
        if (i10 == -1) {
            if (!fa0Var.S.L(true)) {
                fa0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (fa0Var.F != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < fa0Var.F.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) fa0Var.F.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fa0Var.getParentActivity(), 0, fa0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f21168a.O = LocaleController.getString(i11);
                    alertDialog$Builder.f21168a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new o1(21, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new k2(16));
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.show();
                    d2Var.h();
                }
            }
        } else if (i10 == 10) {
            ca0 ca0Var = fa0Var.S;
            ca0Var.c1(ca0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            fa0Var.S.L(true);
            fa0Var.S.getSearchItem().z(false);
        }
    }
}
