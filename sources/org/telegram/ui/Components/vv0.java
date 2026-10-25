package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class vv0 extends di.ha {
    public final xv0 h;

    public vv0(xv0 xv0Var, di.h7 h7Var, long j10, int i10) {
        super(i10, j10, h7Var);
        this.h = xv0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        dt0 dt0Var;
        MessageObject messageObject;
        xv0 xv0Var = this.h;
        aw0 aw0Var = xv0Var.F;
        int i10 = 0;
        while (true) {
            tu0[] tu0VarArr = aw0Var.m0;
            if (i10 < tu0VarArr.length) {
                dt0 dt0Var2 = tu0VarArr[i10].h;
                if (dt0Var2 != null && dt0Var2.getAdapter() == xv0Var) {
                    dt0Var = aw0Var.m0[i10].h;
                    break;
                }
                i10++;
            } else {
                dt0Var = null;
                break;
            }
        }
        if (dt0Var != null) {
            for (int i11 = 0; i11 < dt0Var.getChildCount(); i11++) {
                View childAt = dt0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.w7) && (messageObject = ((org.telegram.ui.Cells.w7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f22264id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        di.z6 z6Var = this.h.f34830s;
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
                MessageObject messageObject = (MessageObject) z6Var.f9494j.get(num);
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
