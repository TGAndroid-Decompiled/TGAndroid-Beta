package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class et0 extends fi.o9 {
    public final gt0 h;

    public et0(gt0 gt0Var, fi.p6 p6Var, long j3, int i7) {
        super(i7, j3, p6Var);
        this.h = gt0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        nq0 nq0Var;
        org.telegram.messenger.gj messageObject;
        gt0 gt0Var = this.h;
        jt0 jt0Var = gt0Var.G;
        int i7 = 0;
        while (true) {
            ds0[] ds0VarArr = jt0Var.f36650n0;
            if (i7 < ds0VarArr.length) {
                nq0 nq0Var2 = ds0VarArr[i7].h;
                if (nq0Var2 != null && nq0Var2.getAdapter() == gt0Var) {
                    nq0Var = jt0Var.f36650n0[i7].h;
                    break;
                }
                i7++;
            } else {
                nq0Var = null;
                break;
            }
        }
        if (nq0Var != null) {
            for (int i10 = 0; i10 < nq0Var.getChildCount(); i10++) {
                View childAt = nq0Var.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.p7) && (messageObject = ((org.telegram.ui.Cells.p7) childAt).getMessageObject()) != null && messageObject.x4()) {
                    arrayList.add(Integer.valueOf(messageObject.f24218l.f28673id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        fi.h6 h6Var = this.h.f35670s;
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
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) h6Var.f12090j.get(num);
                if (gjVar != null && (storyItem = gjVar.f24218l) != null) {
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
