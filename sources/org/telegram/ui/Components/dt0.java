package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class dt0 extends fi.o9 {
    public final ft0 h;

    public dt0(ft0 ft0Var, fi.p6 p6Var, long j3, int i7) {
        super(i7, j3, p6Var);
        this.h = ft0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        mq0 mq0Var;
        org.telegram.messenger.fj messageObject;
        ft0 ft0Var = this.h;
        it0 it0Var = ft0Var.G;
        int i7 = 0;
        while (true) {
            ds0[] ds0VarArr = it0Var.f36133n0;
            if (i7 < ds0VarArr.length) {
                mq0 mq0Var2 = ds0VarArr[i7].h;
                if (mq0Var2 != null && mq0Var2.getAdapter() == ft0Var) {
                    mq0Var = it0Var.f36133n0[i7].h;
                    break;
                }
                i7++;
            } else {
                mq0Var = null;
                break;
            }
        }
        if (mq0Var != null) {
            for (int i10 = 0; i10 < mq0Var.getChildCount(); i10++) {
                View childAt = mq0Var.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.o7) && (messageObject = ((org.telegram.ui.Cells.o7) childAt).getMessageObject()) != null && messageObject.x4()) {
                    arrayList.add(Integer.valueOf(messageObject.f24078l.f28731id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        fi.h6 h6Var = this.h.f35199s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        h6Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Integer num = (Integer) arrayList.get(i7);
                num.intValue();
                if (i7 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i7);
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) h6Var.f12052j.get(num);
                if (fjVar != null && (storyItem = fjVar.f24078l) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                h6Var.x();
            }
        }
        return true;
    }
}
