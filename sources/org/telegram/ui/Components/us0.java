package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class us0 extends di.z9 {
    public final ws0 h;

    public us0(ws0 ws0Var, di.z6 z6Var, long j3, int i7) {
        super(i7, j3, z6Var);
        this.h = ws0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        dq0 dq0Var;
        org.telegram.messenger.ij messageObject;
        ws0 ws0Var = this.h;
        zs0 zs0Var = ws0Var.F;
        int i7 = 0;
        while (true) {
            ur0[] ur0VarArr = zs0Var.m0;
            if (i7 < ur0VarArr.length) {
                dq0 dq0Var2 = ur0VarArr[i7].h;
                if (dq0Var2 != null && dq0Var2.getAdapter() == ws0Var) {
                    dq0Var = zs0Var.m0[i7].h;
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
                if ((childAt instanceof org.telegram.ui.Cells.o7) && (messageObject = ((org.telegram.ui.Cells.o7) childAt).getMessageObject()) != null && messageObject.x4()) {
                    arrayList.add(Integer.valueOf(messageObject.f23266l.f27195id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        di.r6 r6Var = this.h.f40145s;
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
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) r6Var.f9695j.get(num);
                if (ijVar != null && (storyItem = ijVar.f23266l) != null) {
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
