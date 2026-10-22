package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class pa0 extends org.telegram.ui.ActionBar.j {
    public final wa0 f29292a;

    public pa0(wa0 wa0Var) {
        this.f29292a = wa0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        wa0 wa0Var = this.f29292a;
        if (i10 == -1) {
            if (!wa0Var.V.L(true)) {
                wa0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (wa0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < wa0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) wa0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wa0Var.getParentActivity(), 0, wa0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f20608a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f20608a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new q2(18, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new k2(17));
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                    b2Var.show();
                    b2Var.i();
                }
            }
        } else if (i10 == 10) {
            ta0 ta0Var = wa0Var.V;
            ta0Var.e1(ta0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            wa0Var.V.L(true);
            wa0Var.V.getSearchItem().z(false);
        }
    }
}
