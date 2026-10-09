package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wa0 extends org.telegram.ui.ActionBar.j {
    public final db0 f32590a;

    public wa0(db0 db0Var) {
        this.f32590a = db0Var;
    }

    @Override
    public final void b(int i10) {
        int i11;
        db0 db0Var = this.f32590a;
        if (i10 == -1) {
            if (!db0Var.V.L(true)) {
                db0Var.finishFragment();
            }
        } else if (i10 == 2) {
            if (db0Var.I != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < db0Var.I.size(); i12++) {
                    TL_stories.StoryItem storyItem = ((MessageObject) db0Var.I.valueAt(i12)).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(db0Var.getParentActivity(), 0, db0Var.getResourceProvider());
                    if (arrayList.size() > 1) {
                        i11 = R.string.DeleteStoriesTitle;
                    } else {
                        i11 = R.string.DeleteStoryTitle;
                    }
                    alertDialog$Builder.f20374a.R = LocaleController.getString(i11);
                    alertDialog$Builder.f20374a.T = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new y2(14, this, arrayList));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new f2(22));
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                    b2Var.show();
                    b2Var.h();
                }
            }
        } else if (i10 == 10) {
            ab0 ab0Var = db0Var.V;
            ab0Var.c1(ab0Var.getClosestTab(), false);
        } else if (i10 == 11) {
            db0Var.V.L(true);
            db0Var.V.getSearchItem().z(false);
        }
    }
}
