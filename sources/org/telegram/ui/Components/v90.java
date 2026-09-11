package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class v90 extends org.telegram.ui.ActionBar.j {
    public final ca0 f31159a;

    public v90(ca0 ca0Var) {
        this.f31159a = ca0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        ca0 ca0Var = this.f31159a;
        if (i10 == -1) {
            if (!ca0Var.V.L(true)) {
                ca0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (ca0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < ca0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) ca0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ca0Var.getParentActivity(), 0, ca0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f20198a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f20198a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b3(13, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new p2(12));
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                    b2Var.show();
                    b2Var.h();
                }
            }
        } else if (i10 == 10) {
            z90 z90Var = ca0Var.V;
            z90Var.c1(z90Var.getClosestTab(), false);
        } else if (i10 == 11) {
            ca0Var.V.L(true);
            ca0Var.V.getSearchItem().z(false);
        }
    }
}
