package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class xv0 extends ai.tc {
    public final zv0 h;

    public xv0(zv0 zv0Var, ai.m9 m9Var, long j3, int i10) {
        super(i10, j3, m9Var);
        this.h = zv0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        bt0 bt0Var;
        MessageObject messageObject;
        zv0 zv0Var = this.h;
        cw0 cw0Var = zv0Var.F;
        int i10 = 0;
        while (true) {
            vu0[] vu0VarArr = cw0Var.f25450k0;
            if (i10 < vu0VarArr.length) {
                bt0 bt0Var2 = vu0VarArr[i10].h;
                if (bt0Var2 != null && bt0Var2.getAdapter() == zv0Var) {
                    bt0Var = cw0Var.f25450k0[i10].h;
                    break;
                }
                i10++;
            } else {
                bt0Var = null;
                break;
            }
        }
        if (bt0Var != null) {
            for (int i11 = 0; i11 < bt0Var.getChildCount(); i11++) {
                View childAt = bt0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.t7) && (messageObject = ((org.telegram.ui.Cells.t7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f20279id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ai.e9 e9Var = this.h.f33692s;
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
                MessageObject messageObject = (MessageObject) e9Var.f900j.get(num);
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
