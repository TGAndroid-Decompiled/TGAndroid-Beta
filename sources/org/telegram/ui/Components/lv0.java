package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class lv0 extends ai.sc {
    public final nv0 h;

    public lv0(nv0 nv0Var, ai.l9 l9Var, long j3, int i10) {
        super(i10, j3, l9Var);
        this.h = nv0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        ps0 ps0Var;
        MessageObject messageObject;
        nv0 nv0Var = this.h;
        qv0 qv0Var = nv0Var.F;
        int i10 = 0;
        while (true) {
            ju0[] ju0VarArr = qv0Var.f30239k0;
            if (i10 < ju0VarArr.length) {
                ps0 ps0Var2 = ju0VarArr[i10].h;
                if (ps0Var2 != null && ps0Var2.getAdapter() == nv0Var) {
                    ps0Var = qv0Var.f30239k0[i10].h;
                    break;
                }
                i10++;
            } else {
                ps0Var = null;
                break;
            }
        }
        if (ps0Var != null) {
            for (int i11 = 0; i11 < ps0Var.getChildCount(); i11++) {
                View childAt = ps0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.t7) && (messageObject = ((org.telegram.ui.Cells.t7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f20284id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.h.f29158s;
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
                MessageObject messageObject = (MessageObject) d9Var.f790j.get(num);
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
