package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ia0 extends org.telegram.ui.ActionBar.j {
    public final pa0 f27347a;

    public ia0(pa0 pa0Var) {
        this.f27347a = pa0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        pa0 pa0Var = this.f27347a;
        if (i10 == -1) {
            if (!pa0Var.V.L(true)) {
                pa0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (pa0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < pa0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) pa0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pa0Var.getParentActivity(), 0, pa0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f20368a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f20368a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new w2(15, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ru(2));
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20368a;
                    b2Var.show();
                    b2Var.h();
                }
            }
        } else if (i10 == 10) {
            ma0 ma0Var = pa0Var.V;
            ma0Var.c1(ma0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            pa0Var.V.L(true);
            pa0Var.V.getSearchItem().z(false);
        }
    }
}
