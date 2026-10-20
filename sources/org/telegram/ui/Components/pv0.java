package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class pv0 extends ci.ja {
    public final rv0 h;

    public pv0(rv0 rv0Var, ci.i7 i7Var, long j10, int i10) {
        super(i10, j10, i7Var);
        this.h = rv0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        ts0 ts0Var;
        MessageObject messageObject;
        rv0 rv0Var = this.h;
        uv0 uv0Var = rv0Var.F;
        int i10 = 0;
        while (true) {
            nu0[] nu0VarArr = uv0Var.f31046k0;
            if (i10 < nu0VarArr.length) {
                ts0 ts0Var2 = nu0VarArr[i10].h;
                if (ts0Var2 != null && ts0Var2.getAdapter() == rv0Var) {
                    ts0Var = uv0Var.f31046k0[i10].h;
                    break;
                }
                i10++;
            } else {
                ts0Var = null;
                break;
            }
        }
        if (ts0Var != null) {
            for (int i11 = 0; i11 < ts0Var.getChildCount(); i11++) {
                View childAt = ts0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.s7) && (messageObject = ((org.telegram.ui.Cells.s7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f20510id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ci.a7 a7Var = this.h.f30025s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        a7Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                num.intValue();
                if (i10 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i10);
                MessageObject messageObject = (MessageObject) a7Var.f5150j.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                a7Var.x();
            }
        }
        return true;
    }
}
