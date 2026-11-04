package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zf extends j1.b {
    public final int[] f41032o;
    public final ChatActivityEnterView.RecordCircle f41033p;

    public zf(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.f41033p = recordCircle;
        this.f41032o = new int[2];
    }

    @Override
    public final int g(float f10, float f11) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (chatActivityEnterView.f31202t4 && chatActivityEnterView.O1 != null) {
            if (chatActivityEnterView.U3.contains((int) f10, (int) f11)) {
                return 1;
            }
            if (chatActivityEnterView.T3.contains(f10, f11)) {
                return 2;
            }
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f31152l1;
            if (slideTextView != null && (rect = slideTextView.L) != null) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f31152l1;
                int[] iArr = this.f41032o;
                slideTextView2.getLocationOnScreen(iArr);
                rectF.offset(iArr[0], iArr[1]);
                chatActivityEnterView.O1.getLocationOnScreen(iArr);
                rectF.offset(-iArr[0], -iArr[1]);
                if (rectF.contains(f10, f11)) {
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
        if (ChatActivityEnterView.this.f31202t4) {
            arrayList.add(1);
            arrayList.add(3);
        }
    }

    @Override
    public final boolean k(int i3, int i10) {
        return true;
    }

    @Override
    public final void l(int i3, s0.d dVar) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (i3 == 1) {
            dVar.h(chatActivityEnterView.U3);
            dVar.o(org.telegram.messenger.bd.M0(2131745650, "Send"));
        } else if (i3 == 2) {
            Rect rect2 = chatActivityEnterView.V3;
            RectF rectF = chatActivityEnterView.T3;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.V3);
            dVar.o(org.telegram.messenger.bd.M0(2131744851, null));
        } else if (i3 == 3 && chatActivityEnterView.O1 != null) {
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f31152l1;
            if (slideTextView != null && (rect = slideTextView.L) != null) {
                Rect rect3 = org.telegram.messenger.g0.Q;
                rect3.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f31152l1;
                int[] iArr = this.f41032o;
                slideTextView2.getLocationOnScreen(iArr);
                rect3.offset(iArr[0], iArr[1]);
                chatActivityEnterView.O1.getLocationOnScreen(iArr);
                rect3.offset(-iArr[0], -iArr[1]);
                dVar.h(rect3);
            }
            dVar.o(org.telegram.messenger.bd.M0(2131752589, "Cancel"));
        }
    }
}
