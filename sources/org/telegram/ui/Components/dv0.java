package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class dv0 extends zh.d8 {
    public final fv0 h;

    public dv0(fv0 fv0Var, zh.i5 i5Var, long j3, int i10) {
        super(i10, j3, i5Var);
        this.h = fv0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        gs0 gs0Var;
        MessageObject messageObject;
        fv0 fv0Var = this.h;
        iv0 iv0Var = fv0Var.F;
        int i10 = 0;
        while (true) {
            au0[] au0VarArr = iv0Var.f24107k0;
            if (i10 < au0VarArr.length) {
                gs0 gs0Var2 = au0VarArr[i10].h;
                if (gs0Var2 != null && gs0Var2.getAdapter() == fv0Var) {
                    gs0Var = iv0Var.f24107k0[i10].h;
                    break;
                }
                i10++;
            } else {
                gs0Var = null;
                break;
            }
        }
        if (gs0Var != null) {
            for (int i11 = 0; i11 < gs0Var.getChildCount(); i11++) {
                View childAt = gs0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.u7) && (messageObject = ((org.telegram.ui.Cells.u7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f17435id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        zh.a5 a5Var = this.h.f23089s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        a5Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                num.intValue();
                if (i10 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i10);
                MessageObject messageObject = (MessageObject) a5Var.f48241j.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                a5Var.x();
            }
        }
        return true;
    }
}
