package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class rv0 extends ci.ia {
    public final tv0 h;

    public rv0(tv0 tv0Var, ci.h7 h7Var, long j10, int i10) {
        super(i10, j10, h7Var);
        this.h = tv0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        vs0 vs0Var;
        MessageObject messageObject;
        tv0 tv0Var = this.h;
        wv0 wv0Var = tv0Var.F;
        int i10 = 0;
        while (true) {
            pu0[] pu0VarArr = wv0Var.f32386k0;
            if (i10 < pu0VarArr.length) {
                vs0 vs0Var2 = pu0VarArr[i10].h;
                if (vs0Var2 != null && vs0Var2.getAdapter() == tv0Var) {
                    vs0Var = wv0Var.f32386k0[i10].h;
                    break;
                }
                i10++;
            } else {
                vs0Var = null;
                break;
            }
        }
        if (vs0Var != null) {
            for (int i11 = 0; i11 < vs0Var.getChildCount(); i11++) {
                View childAt = vs0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.s7) && (messageObject = ((org.telegram.ui.Cells.s7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f20578id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ci.z6 z6Var = this.h.f30902s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        z6Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                num.intValue();
                if (i10 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i10);
                MessageObject messageObject = (MessageObject) z6Var.f6194j.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                z6Var.x();
            }
        }
        return true;
    }
}
