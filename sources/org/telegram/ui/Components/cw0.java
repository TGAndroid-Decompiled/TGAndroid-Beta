package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class cw0 extends ai.tc {
    public final ew0 h;

    public cw0(ew0 ew0Var, ai.m9 m9Var, long j3, int i10) {
        super(i10, j3, m9Var);
        this.h = ew0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        gt0 gt0Var;
        MessageObject messageObject;
        ew0 ew0Var = this.h;
        hw0 hw0Var = ew0Var.F;
        int i10 = 0;
        while (true) {
            av0[] av0VarArr = hw0Var.f26948k0;
            if (i10 < av0VarArr.length) {
                gt0 gt0Var2 = av0VarArr[i10].h;
                if (gt0Var2 != null && gt0Var2.getAdapter() == ew0Var) {
                    gt0Var = hw0Var.f26948k0[i10].h;
                    break;
                }
                i10++;
            } else {
                gt0Var = null;
                break;
            }
        }
        if (gt0Var != null) {
            for (int i11 = 0; i11 < gt0Var.getChildCount(); i11++) {
                View childAt = gt0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.t7) && (messageObject = ((org.telegram.ui.Cells.t7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f20041id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ai.e9 e9Var = this.h.f25795s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        e9Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                num.intValue();
                if (i10 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i10);
                MessageObject messageObject = (MessageObject) e9Var.f898j.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                e9Var.x();
            }
        }
        return true;
    }
}
