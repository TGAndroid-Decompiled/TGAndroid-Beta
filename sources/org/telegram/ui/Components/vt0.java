package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class vt0 extends th.x7 {
    public final xt0 h;

    public vt0(xt0 xt0Var, th.e5 e5Var, long j10, int i10) {
        super(i10, j10, e5Var);
        this.h = xt0Var;
    }

    @Override
    public final void a(ArrayList arrayList) {
        er0 er0Var;
        org.telegram.messenger.kj messageObject;
        xt0 xt0Var = this.h;
        au0 au0Var = xt0Var.F;
        int i10 = 0;
        while (true) {
            ts0[] ts0VarArr = au0Var.m0;
            if (i10 < ts0VarArr.length) {
                er0 er0Var2 = ts0VarArr[i10].h;
                if (er0Var2 != null && er0Var2.getAdapter() == xt0Var) {
                    er0Var = au0Var.m0[i10].h;
                    break;
                }
                i10++;
            } else {
                er0Var = null;
                break;
            }
        }
        if (er0Var != null) {
            for (int i11 = 0; i11 < er0Var.getChildCount(); i11++) {
                View childAt = er0Var.getChildAt(i11);
                if ((childAt instanceof org.telegram.ui.Cells.s7) && (messageObject = ((org.telegram.ui.Cells.s7) childAt).getMessageObject()) != null && messageObject.x4()) {
                    arrayList.add(Integer.valueOf(messageObject.f16694l.f20032id));
                }
            }
        }
    }

    @Override
    public final boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.StoryItem storyItem;
        th.x4 x4Var = this.h.f32635s;
        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
        x4Var.getClass();
        if (arrayList != null && arrayList2 != null) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Integer num = (Integer) arrayList.get(i10);
                num.intValue();
                if (i10 >= arrayList2.size()) {
                    break;
                }
                TL_stories.StoryViews storyViews = arrayList2.get(i10);
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) x4Var.f49651j.get(num);
                if (kjVar != null && (storyItem = kjVar.f16694l) != null) {
                    storyItem.views = storyViews;
                    z10 = true;
                }
            }
            if (z10) {
                x4Var.x();
            }
        }
        return true;
    }
}
