package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class va0 extends org.telegram.ui.ActionBar.j {
    public final cb0 f29612a;

    public va0(cb0 cb0Var) {
        this.f29612a = cb0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        cb0 cb0Var = this.f29612a;
        if (i10 == -1) {
            if (!cb0Var.V.L(true)) {
                cb0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (cb0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < cb0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) cb0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cb0Var.getParentActivity(), 0, cb0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f19248a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f19248a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new u2(16, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new n2(15));
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                    a2Var.show();
                    a2Var.h();
                }
            }
        } else if (i10 == 10) {
            za0 za0Var = cb0Var.V;
            za0Var.d1(za0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            cb0Var.V.L(true);
            cb0Var.V.getSearchItem().z(false);
        }
    }
}
