package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class h90 extends org.telegram.ui.ActionBar.j {

    public final o90 f28948a;

    public h90(o90 o90Var) {
        this.f28948a = o90Var;
    }

    @Override
    public final void b(int i10) {
        o90 o90Var = this.f28948a;
        if (i10 == -1) {
            if (o90Var.R.L(true)) {
                return;
            }
            o90Var.finishFragment();
            return;
        }
        if (i10 != 2) {
            if (i10 == 10) {
                l90 l90Var = o90Var.R;
                l90Var.c1(l90Var.getClosestTab(), false);
                return;
            } else {
                if (i10 == 11) {
                    o90Var.R.L(true);
                    o90Var.R.getSearchItem().z(false);
                    return;
                }
                return;
            }
        }
        if (o90Var.E != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < o90Var.E.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) o90Var.E.valueAt(i11)).storyItem;
                if (storyItem != null) {
                    arrayList.add(storyItem);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o90Var.getParentActivity(), 0, o90Var.getResourceProvider());
            alertDialog$Builder.f22702a.N = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
            alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList.size(), new Object[0]);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new g1(22, this, arrayList));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new c2(22));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.show();
            b2Var.h();
        }
    }
}
