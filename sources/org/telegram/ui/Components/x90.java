package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class x90 extends org.telegram.ui.ActionBar.j {
    public final ea0 f30566a;

    public x90(ea0 ea0Var) {
        this.f30566a = ea0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        ea0 ea0Var = this.f30566a;
        if (i10 == -1) {
            if (!ea0Var.S.L(true)) {
                ea0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (ea0Var.F != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < ea0Var.F.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) ea0Var.F.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ea0Var.getParentActivity(), 0, ea0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f19478a.O = LocaleController.getString(i11);
                    alertDialog$Builder.f19478a.Q = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new o1(21, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new k2(16));
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                    d2Var.show();
                    d2Var.h();
                }
            }
        } else if (i10 == 10) {
            ba0 ba0Var = ea0Var.S;
            ba0Var.c1(ba0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            ea0Var.S.L(true);
            ea0Var.S.getSearchItem().z(false);
        }
    }
}
