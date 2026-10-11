package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class yv0 extends ai.tc {
    public final aw0 h;

    public yv0(aw0 aw0Var, ai.m9 m9Var, long j3, int i10) {
        super(i10, j3, m9Var);
        this.h = aw0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        ct0 ct0Var;
        MessageObject messageObject;
        aw0 aw0Var = this.h;
        dw0 dw0Var = aw0Var.F;
        int i10 = 0;
        while (true) {
            wu0[] wu0VarArr = dw0Var.f25711k0;
            if (i10 < wu0VarArr.length) {
                ct0 ct0Var2 = wu0VarArr[i10].h;
                if (ct0Var2 != null && ct0Var2.getAdapter() == aw0Var) {
                    ct0Var = dw0Var.f25711k0[i10].h;
                    break;
                }
                i10++;
            } else {
                ct0Var = null;
                break;
            }
        }
        if (ct0Var != null) {
            for (int i11 = 0; i11 < ct0Var.getChildCount(); i11++) {
                View childAt = ct0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.t7) && (messageObject = ((org.telegram.ui.Cells.t7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f20269id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ai.e9 e9Var = this.h.f24608s;
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
