package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class ts0 extends fi.r9 {
    public final vs0 h;

    public ts0(vs0 vs0Var, fi.s6 s6Var, long j3, int i7) {
        super(i7, j3, s6Var);
        this.h = vs0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        dq0 dq0Var;
        org.telegram.messenger.gj messageObject;
        vs0 vs0Var = this.h;
        ys0 ys0Var = vs0Var.G;
        int i7 = 0;
        while (true) {
            tr0[] tr0VarArr = ys0Var.f42119n0;
            if (i7 < tr0VarArr.length) {
                dq0 dq0Var2 = tr0VarArr[i7].h;
                if (dq0Var2 != null && dq0Var2.getAdapter() == vs0Var) {
                    dq0Var = ys0Var.f42119n0[i7].h;
                    break;
                }
                i7++;
            } else {
                dq0Var = null;
                break;
            }
        }
        if (dq0Var != null) {
            for (int i10 = 0; i10 < dq0Var.getChildCount(); i10++) {
                View childAt = dq0Var.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.n7) && (messageObject = ((org.telegram.ui.Cells.n7) childAt).getMessageObject()) != null && messageObject.x4()) {
                    arrayList.add(Integer.valueOf(messageObject.f23824l.f28290id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        fi.k6 k6Var = this.h.f41149s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        k6Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Integer num = (Integer) arrayList.get(i7);
                num.intValue();
                if (i7 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i7);
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) k6Var.f11945j.get(num);
                if (gjVar != null && (storyItem = gjVar.f23824l) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                k6Var.x();
            }
        }
        return true;
    }
}
