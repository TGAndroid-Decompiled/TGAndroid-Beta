package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class hv0 extends ai.sc {
    public final jv0 h;

    public hv0(jv0 jv0Var, ai.l9 l9Var, long j3, int i10) {
        super(i10, j3, l9Var);
        this.h = jv0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        ls0 ls0Var;
        MessageObject messageObject;
        jv0 jv0Var = this.h;
        mv0 mv0Var = jv0Var.F;
        int i10 = 0;
        while (true) {
            fu0[] fu0VarArr = mv0Var.f26425k0;
            if (i10 < fu0VarArr.length) {
                ls0 ls0Var2 = fu0VarArr[i10].h;
                if (ls0Var2 != null && ls0Var2.getAdapter() == jv0Var) {
                    ls0Var = mv0Var.f26425k0[i10].h;
                    break;
                }
                i10++;
            } else {
                ls0Var = null;
                break;
            }
        }
        if (ls0Var != null) {
            for (int i11 = 0; i11 < ls0Var.getChildCount(); i11++) {
                View childAt = ls0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.t7) && (messageObject = ((org.telegram.ui.Cells.t7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f18587id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ai.d9 d9Var = this.h.f25553s;
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
                MessageObject messageObject = (MessageObject) d9Var.f726j.get(num);
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
