package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class ts0 extends di.z9 {
    public final vs0 h;

    public ts0(vs0 vs0Var, di.z6 z6Var, long j3, int i7) {
        super(i7, j3, z6Var);
        this.h = vs0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        cq0 cq0Var;
        org.telegram.messenger.ij messageObject;
        vs0 vs0Var = this.h;
        ys0 ys0Var = vs0Var.F;
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = ys0Var.m0;
            if (i7 < tr0VarArr.length) {
                cq0 cq0Var2 = tr0VarArr[i7].h;
                if (cq0Var2 != null && cq0Var2.getAdapter() == vs0Var) {
                    cq0Var = ys0Var.m0[i7].h;
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
                if ((childAt instanceof org.telegram.ui.Cells.o7) && (messageObject = ((org.telegram.ui.Cells.o7) childAt).getMessageObject()) != null && messageObject.x4()) {
                    arrayList.add(Integer.valueOf(messageObject.f23270l.f27199id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        di.r6 r6Var = this.h.f39730s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        r6Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z9 = false;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Integer num = (Integer) arrayList.get(i7);
                num.intValue();
                if (i7 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i7);
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) r6Var.f9700j.get(num);
                if (ijVar != null && (storyItem = ijVar.f23270l) != null) {
                    storyItem.views = storyViews;
                    z9 = true;
                }
            }
            if (z9) {
                r6Var.x();
            }
        }
        return true;
    }
}
