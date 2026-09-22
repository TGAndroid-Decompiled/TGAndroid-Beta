package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class tu0 extends ai.sc {
    public final vu0 h;

    public tu0(vu0 vu0Var, ai.l9 l9Var, long j3, int i10) {
        super(i10, j3, l9Var);
        this.h = vu0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        xr0 xr0Var;
        MessageObject messageObject;
        vu0 vu0Var = this.h;
        yu0 yu0Var = vu0Var.F;
        int i10 = 0;
        while (true) {
            rt0[] rt0VarArr = yu0Var.f30365k0;
            if (i10 < rt0VarArr.length) {
                xr0 xr0Var2 = rt0VarArr[i10].h;
                if (xr0Var2 != null && xr0Var2.getAdapter() == vu0Var) {
                    xr0Var = yu0Var.f30365k0[i10].h;
                    break;
                }
                i10++;
            } else {
                xr0Var = null;
                break;
            }
        }
        if (xr0Var != null) {
            for (int i11 = 0; i11 < xr0Var.getChildCount(); i11++) {
                View childAt = xr0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.t7) && (messageObject = ((org.telegram.ui.Cells.t7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f18344id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.h.f29438s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        d9Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                num.intValue();
                if (i10 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i10);
                MessageObject messageObject = (MessageObject) d9Var.f719j.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                d9Var.x();
            }
        }
        return true;
    }
}
