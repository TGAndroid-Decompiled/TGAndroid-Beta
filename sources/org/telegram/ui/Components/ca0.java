package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ca0 extends org.telegram.ui.ActionBar.j {
    public final ja0 f23225a;

    public ca0(ja0 ja0Var) {
        this.f23225a = ja0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        ja0 ja0Var = this.f23225a;
        if (i10 == -1) {
            if (!ja0Var.V.L(true)) {
                ja0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (ja0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < ja0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) ja0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ja0Var.getParentActivity(), 0, ja0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f18654a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f18654a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a3(13, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new i2(19));
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18654a;
                    b2Var.show();
                    b2Var.h();
                }
            }
        } else if (i10 == 10) {
            ga0 ga0Var = ja0Var.V;
            ga0Var.c1(ga0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            ja0Var.V.L(true);
            ja0Var.V.getSearchItem().z(false);
        }
    }
}
