package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xa0 extends org.telegram.ui.ActionBar.j {
    public final eb0 f32861a;

    public xa0(eb0 eb0Var) {
        this.f32861a = eb0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        eb0 eb0Var = this.f32861a;
        if (i10 == -1) {
            if (!eb0Var.V.L(true)) {
                eb0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (eb0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < eb0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) eb0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eb0Var.getParentActivity(), 0, eb0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f20368a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f20368a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new y2(15, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new e2(24));
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                    a2Var.show();
                    a2Var.h();
                }
            }
        } else if (i10 == 10) {
            bb0 bb0Var = eb0Var.V;
            bb0Var.c1(bb0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            eb0Var.V.L(true);
            eb0Var.V.getSearchItem().z(false);
        }
    }
}
