package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_stories;
public final class sv0 extends ci.ia {
    public final uv0 h;

    public sv0(uv0 uv0Var, ci.h7 h7Var, long j10, int i10) {
        super(i10, j10, h7Var);
        this.h = uv0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        ws0 ws0Var;
        MessageObject messageObject;
        uv0 uv0Var = this.h;
        xv0 xv0Var = uv0Var.F;
        int i10 = 0;
        while (true) {
            qu0[] qu0VarArr = xv0Var.f32687k0;
            if (i10 < qu0VarArr.length) {
                ws0 ws0Var2 = qu0VarArr[i10].h;
                if (ws0Var2 != null && ws0Var2.getAdapter() == uv0Var) {
                    ws0Var = xv0Var.f32687k0[i10].h;
                    break;
                }
                i10++;
            } else {
                ws0Var = null;
                break;
            }
        }
        if (ws0Var != null) {
            for (int i11 = 0; i11 < ws0Var.getChildCount(); i11++) {
                View childAt = ws0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.s7) && (messageObject = ((org.telegram.ui.Cells.s7) childAt).getMessageObject()) != null && messageObject.isStory()) {
                    arrayList.add(Integer.valueOf(messageObject.storyItem.f20577id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        ci.z6 z6Var = this.h.f31223s;
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
                MessageObject messageObject = (MessageObject) z6Var.f6194j.get(num);
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
