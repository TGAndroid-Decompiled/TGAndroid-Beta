package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class m extends b84 {
    public final int[] o;
    public final ChatActivityEnterView.RecordCircle p;

    public m(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.p = recordCircle;
        this.o = new int[2];
    }

    @Override
    public final int g(float f, float f2) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (chatActivityEnterView.h5 && chatActivityEnterView.D2 != null) {
            if (chatActivityEnterView.I4.contains((int) f, (int) f2)) {
                return 1;
            }
            if (chatActivityEnterView.H4.contains(f, f2)) {
                return 2;
            }
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.a2;
            if (slideTextView != null && (rect = slideTextView.I) != null) {
                RectF rectF = gm.P;
                rectF.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.a2;
                int[] iArr = this.o;
                slideTextView2.getLocationOnScreen(iArr);
                rectF.offset(iArr[0], iArr[1]);
                chatActivityEnterView.D2.getLocationOnScreen(iArr);
                rectF.offset(-iArr[0], -iArr[1]);
                if (rectF.contains(f, f2)) {
                    return 3;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        if (ChatActivityEnterView.this.h5) {
            arrayList.add(1);
            arrayList.add(3);
        }
    }

    @Override
    public final boolean k(int i, int i2) {
        return true;
    }

    @Override
    public final void l(int i, u4 u4Var) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (i == 1) {
            u4Var.h(chatActivityEnterView.I4);
            u4Var.o(jb6.M0(2131745374, "Send"));
        } else if (i == 2) {
            Rect rect2 = chatActivityEnterView.J4;
            RectF rectF = chatActivityEnterView.H4;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            u4Var.h(chatActivityEnterView.J4);
            u4Var.o(jb6.M0(2131744530, null));
        } else if (i == 3 && chatActivityEnterView.D2 != null) {
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.a2;
            if (slideTextView != null && (rect = slideTextView.I) != null) {
                Rect rect3 = gm.Q;
                rect3.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.a2;
                int[] iArr = this.o;
                slideTextView2.getLocationOnScreen(iArr);
                rect3.offset(iArr[0], iArr[1]);
                chatActivityEnterView.D2.getLocationOnScreen(iArr);
                rect3.offset(-iArr[0], -iArr[1]);
                u4Var.h(rect3);
            }
            u4Var.o(jb6.M0(2131752542, "Cancel"));
        }
    }
}
