package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class ss0 extends di.y9 {
    public final us0 h;

    public ss0(us0 us0Var, di.y6 y6Var, long j3, int i7) {
        super(i7, j3, y6Var);
        this.h = us0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        cq0 cq0Var;
        org.telegram.messenger.ij messageObject;
        us0 us0Var = this.h;
        xs0 xs0Var = us0Var.F;
        int i7 = 0;
        while (true) {
            sr0[] sr0VarArr = xs0Var.m0;
            if (i7 < sr0VarArr.length) {
                cq0 cq0Var2 = sr0VarArr[i7].h;
                if (cq0Var2 != null && cq0Var2.getAdapter() == us0Var) {
                    cq0Var = xs0Var.m0[i7].h;
                    break;
                }
                i7++;
            } else {
                cq0Var = null;
                break;
            }
        }
        if (cq0Var != null) {
            for (int i10 = 0; i10 < cq0Var.getChildCount(); i10++) {
                View childAt = cq0Var.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.o7) && (messageObject = ((org.telegram.ui.Cells.o7) childAt).getMessageObject()) != null && messageObject.y4()) {
                    arrayList.add(Integer.valueOf(messageObject.f23248l.f27192id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        di.q6 q6Var = this.h.f38717s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        q6Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z9 = false;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Integer num = (Integer) arrayList.get(i7);
                num.intValue();
                if (i7 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i7);
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) q6Var.f9644j.get(num);
                if (ijVar != null && (storyItem = ijVar.f23248l) != null) {
                    storyItem.views = storyViews;
                    z9 = true;
                }
            }
            if (z9) {
                q6Var.x();
            }
        }
        return true;
    }
}
