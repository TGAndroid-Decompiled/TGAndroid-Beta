package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class da0 extends org.telegram.ui.ActionBar.j {
    public final ka0 f23508a;

    public da0(ka0 ka0Var) {
        this.f23508a = ka0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        ka0 ka0Var = this.f23508a;
        if (i10 == -1) {
            if (!ka0Var.V.L(true)) {
                ka0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (ka0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < ka0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) ka0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ka0Var.getParentActivity(), 0, ka0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f18622a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f18622a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b3(13, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new j2(17));
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
                    b2Var.show();
                    b2Var.h();
                }
            }
        } else if (i10 == 10) {
            ha0 ha0Var = ka0Var.V;
            ha0Var.c1(ha0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            ka0Var.V.L(true);
            ka0Var.V.getSearchItem().z(false);
        }
    }
}
