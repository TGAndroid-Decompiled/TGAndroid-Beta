package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class uu0 extends ai.sc {
    public final wu0 h;

    public uu0(wu0 wu0Var, ai.l9 l9Var, long j3, int i10) {
        super(i10, j3, l9Var);
        this.h = wu0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        yr0 yr0Var;
        MessageObject messageObject;
        wu0 wu0Var = this.h;
        zu0 zu0Var = wu0Var.F;
        int i10 = 0;
        while (true) {
            st0[] st0VarArr = zu0Var.f30632k0;
            if (i10 < st0VarArr.length) {
                yr0 yr0Var2 = st0VarArr[i10].h;
                if (yr0Var2 != null && yr0Var2.getAdapter() == wu0Var) {
                    yr0Var = zu0Var.f30632k0[i10].h;
                    break;
                }
                i10++;
            } else {
                yr0Var = null;
                break;
            }
        }
        if (yr0Var != null) {
            for (int i11 = 0; i11 < yr0Var.getChildCount(); i11++) {
                View childAt = yr0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.t7) && (messageObject = ((org.telegram.ui.Cells.t7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f18357id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.h.f29752s;
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
                MessageObject messageObject = (MessageObject) d9Var.f722j.get(num);
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
