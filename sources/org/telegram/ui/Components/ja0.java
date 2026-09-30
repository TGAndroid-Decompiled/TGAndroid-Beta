package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ja0 extends org.telegram.ui.ActionBar.j {
    public final qa0 f25387a;

    public ja0(qa0 qa0Var) {
        this.f25387a = qa0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        qa0 qa0Var = this.f25387a;
        if (i10 == -1) {
            if (!qa0Var.V.L(true)) {
                qa0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (qa0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < qa0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) qa0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qa0Var.getParentActivity(), 0, qa0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f18678a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f18678a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new w2(14, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ia0(0));
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18678a;
                    a2Var.show();
                    a2Var.h();
                }
            }
        } else if (i10 == 10) {
            na0 na0Var = qa0Var.V;
            na0Var.c1(na0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            qa0Var.V.L(true);
            qa0Var.V.getSearchItem().z(false);
        }
    }
}
