package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class uu0 extends oh.r9 {
    public final wu0 h;

    public uu0(wu0 wu0Var, oh.t6 t6Var, long j10, int i10) {
        super(i10, j10, t6Var);
        this.h = wu0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        xr0 xr0Var;
        MessageObject messageObject;
        wu0 wu0Var = this.h;
        zu0 zu0Var = wu0Var.C;
        int i10 = 0;
        while (true) {
            rt0[] rt0VarArr = zu0Var.f33980h0;
            if (i10 < rt0VarArr.length) {
                xr0 xr0Var2 = rt0VarArr[i10].h;
                if (xr0Var2 != null && xr0Var2.getAdapter() == wu0Var) {
                    xr0Var = zu0Var.f33980h0[i10].h;
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
                if ((childAt instanceof org.telegram.ui.Cells.r7) && (messageObject = ((org.telegram.ui.Cells.r7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f21080id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        oh.l6 l6Var = this.h.f32857s;
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
                MessageObject messageObject = (MessageObject) l6Var.f17403j.get(num);
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
