package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;

public final class cu0 extends jh.r9 {
    public final eu0 h;

    public cu0(eu0 eu0Var, jh.s6 s6Var, long j10, int i10) {
        super(i10, j10, s6Var);
        this.h = eu0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        er0 er0Var;
        MessageObject messageObject;
        eu0 eu0Var = this.h;
        hu0 hu0Var = eu0Var.B;
        int i10 = 0;
        while (true) {
            zs0[] zs0VarArr = hu0Var.f29122g0;
            if (i10 >= zs0VarArr.length) {
                er0Var = null;
                break;
            }
            er0 er0Var2 = zs0VarArr[i10].h;
            if (er0Var2 != null && er0Var2.getAdapter() == eu0Var) {
                er0Var = hu0Var.f29122g0[i10].h;
                break;
            }
            i10++;
        }
        if (er0Var != null) {
            for (int i11 = 0; i11 < er0Var.getChildCount(); i11++) {
                View childAt = er0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.o7) && (messageObject = ((org.telegram.ui.Cells.o7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f22617id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        jh.j6 j6Var = this.h.f28155s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        j6Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                num.intValue();
                if (i10 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i10);
                MessageObject messageObject = (MessageObject) j6Var.f13541j.get(num);
                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                j6Var.x();
            }
        }
        return true;
    }
}
