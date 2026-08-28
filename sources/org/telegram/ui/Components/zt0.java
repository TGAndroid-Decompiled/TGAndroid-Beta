package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class zt0 extends ih.v9 {
    public final bu0 h;

    public zt0(bu0 bu0Var, ih.v6 v6Var, long j10, int i9) {
        super(i9, j10, v6Var);
        this.h = bu0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        dr0 dr0Var;
        MessageObject messageObject;
        bu0 bu0Var = this.h;
        eu0 eu0Var = bu0Var.B;
        int i9 = 0;
        while (true) {
            xs0[] xs0VarArr = eu0Var.f28137g0;
            if (i9 < xs0VarArr.length) {
                dr0 dr0Var2 = xs0VarArr[i9].h;
                if (dr0Var2 != null && dr0Var2.getAdapter() == bu0Var) {
                    dr0Var = eu0Var.f28137g0[i9].h;
                    break;
                }
                i9++;
            } else {
                dr0Var = null;
                break;
            }
        }
        if (dr0Var != null) {
            for (int i10 = 0; i10 < dr0Var.getChildCount(); i10++) {
                View childAt = dr0Var.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.r7) && (messageObject = ((org.telegram.ui.Cells.r7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f22617id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ih.n6 n6Var = this.h.f27281s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        n6Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                Integer num = (Integer) arrayList.get(i9);
                num.intValue();
                if (i9 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i9);
                MessageObject messageObject = (MessageObject) n6Var.f11852j.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                n6Var.x();
            }
        }
        return true;
    }
}
