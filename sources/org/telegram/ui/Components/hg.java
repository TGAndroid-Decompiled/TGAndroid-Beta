package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class hg extends k1.b {
    public final int[] f35247o;
    public final ChatActivityEnterView.RecordCircle f35248p;

    public hg(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.f35248p = recordCircle;
        this.f35247o = new int[2];
    }

    @Override
    public final int g(float f10, float f11) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (chatActivityEnterView.f32159a5 && chatActivityEnterView.f32302v2 != null) {
            if (chatActivityEnterView.B4.contains((int) f10, (int) f11)) {
                return 1;
            }
            if (chatActivityEnterView.A4.contains(f10, f11)) {
                return 2;
            }
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.S1;
            if (slideTextView != null && (rect = slideTextView.I) != null) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.S1;
                int[] iArr = this.f35247o;
                slideTextView2.getLocationOnScreen(iArr);
                rectF.offset(iArr[0], iArr[1]);
                chatActivityEnterView.f32302v2.getLocationOnScreen(iArr);
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
        if (ChatActivityEnterView.this.f32159a5) {
            arrayList.add(1);
            arrayList.add(3);
        }
    }

    @Override
    public final boolean k(int i7, int i10) {
        return true;
    }

    @Override
    public final void l(int i7, s0.c cVar) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (i7 == 1) {
            cVar.h(chatActivityEnterView.B4);
            cVar.o(org.telegram.messenger.hd.M0(2131745640, "Send"));
        } else if (i7 == 2) {
            Rect rect2 = chatActivityEnterView.C4;
            RectF rectF = chatActivityEnterView.A4;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.C4);
            cVar.o(org.telegram.messenger.hd.M0(2131744841, null));
        } else if (i7 == 3 && chatActivityEnterView.f32302v2 != null) {
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.S1;
            if (slideTextView != null && (rect = slideTextView.I) != null) {
                Rect rect3 = org.telegram.messenger.g0.Q;
                rect3.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.S1;
                int[] iArr = this.f35247o;
                slideTextView2.getLocationOnScreen(iArr);
                rect3.offset(iArr[0], iArr[1]);
                chatActivityEnterView.f32302v2.getLocationOnScreen(iArr);
                rect3.offset(-iArr[0], -iArr[1]);
                cVar.h(rect3);
            }
            cVar.o(org.telegram.messenger.hd.M0(2131752589, "Cancel"));
        }
    }
}
