package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fa0 extends org.telegram.ui.ActionBar.j {
    public final ma0 f24148a;

    public fa0(ma0 ma0Var) {
        this.f24148a = ma0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        ma0 ma0Var = this.f24148a;
        if (i10 == -1) {
            if (!ma0Var.V.L(true)) {
                ma0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (ma0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < ma0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) ma0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ma0Var.getParentActivity(), 0, ma0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f18669a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f18669a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a3(13, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new i2(19));
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
                    b2Var.show();
                    b2Var.h();
                }
            }
        } else if (i10 == 10) {
            ja0 ja0Var = ma0Var.V;
            ja0Var.c1(ja0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            ma0Var.V.L(true);
            ma0Var.V.getSearchItem().z(false);
        }
    }
}
