package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class tu0 extends nh.r9 {
    public final vu0 h;

    public tu0(vu0 vu0Var, nh.t6 t6Var, long j10, int i10) {
        super(i10, j10, t6Var);
        this.h = vu0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        wr0 wr0Var;
        MessageObject messageObject;
        vu0 vu0Var = this.h;
        yu0 yu0Var = vu0Var.C;
        int i10 = 0;
        while (true) {
            qt0[] qt0VarArr = yu0Var.f31120h0;
            if (i10 < qt0VarArr.length) {
                wr0 wr0Var2 = qt0VarArr[i10].h;
                if (wr0Var2 != null && wr0Var2.getAdapter() == vu0Var) {
                    wr0Var = yu0Var.f31120h0[i10].h;
                    break;
                }
                i10++;
            } else {
                wr0Var = null;
                break;
            }
        }
        if (wr0Var != null) {
            for (int i11 = 0; i11 < wr0Var.getChildCount(); i11++) {
                View childAt = wr0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.r7) && (messageObject = ((org.telegram.ui.Cells.r7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f19419id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        nh.l6 l6Var = this.h.f30091s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        l6Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z4 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                num.intValue();
                if (i10 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i10);
                MessageObject messageObject = (MessageObject) l6Var.f15581j.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    storyItem.views = storyViews;
                    z4 = true;
                }
            }
            if (z4) {
                l6Var.x();
            }
        }
        return true;
    }
}
