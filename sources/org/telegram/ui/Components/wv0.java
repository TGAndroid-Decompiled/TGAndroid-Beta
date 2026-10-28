package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class wv0 extends di.ha {
    public final yv0 h;

    public wv0(yv0 yv0Var, di.h7 h7Var, long j10, int i10) {
        super(i10, j10, h7Var);
        this.h = yv0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        et0 et0Var;
        MessageObject messageObject;
        yv0 yv0Var = this.h;
        bw0 bw0Var = yv0Var.F;
        int i10 = 0;
        while (true) {
            uu0[] uu0VarArr = bw0Var.m0;
            if (i10 < uu0VarArr.length) {
                et0 et0Var2 = uu0VarArr[i10].h;
                if (et0Var2 != null && et0Var2.getAdapter() == yv0Var) {
                    et0Var = bw0Var.m0[i10].h;
                    break;
                }
                i10++;
            } else {
                et0Var = null;
                break;
            }
        }
        if (et0Var != null) {
            for (int i11 = 0; i11 < et0Var.getChildCount(); i11++) {
                View childAt = et0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.w7) && (messageObject = ((org.telegram.ui.Cells.w7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f22267id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        di.z6 z6Var = this.h.f35173s;
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
                MessageObject messageObject = (MessageObject) z6Var.f9493j.get(num);
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
