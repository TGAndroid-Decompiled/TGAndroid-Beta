package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qg extends k1.b {
    public final int[] f38785o;
    public final ChatActivityEnterView.RecordCircle f38786p;

    public qg(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.f38786p = recordCircle;
        this.f38785o = new int[2];
    }

    @Override
    public final int g(float f10, float f11) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (chatActivityEnterView.f32596g5 && chatActivityEnterView.B2 != null) {
            if (chatActivityEnterView.H4.contains((int) f10, (int) f11)) {
                return 1;
            }
            if (chatActivityEnterView.G4.contains(f10, f11)) {
                return 2;
            }
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Y1;
            if (slideTextView != null && (rect = slideTextView.I) != null) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.Y1;
                int[] iArr = this.f38785o;
                slideTextView2.getLocationOnScreen(iArr);
                rectF.offset(iArr[0], iArr[1]);
                chatActivityEnterView.B2.getLocationOnScreen(iArr);
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
        if (ChatActivityEnterView.this.f32596g5) {
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
            cVar.h(chatActivityEnterView.H4);
            cVar.o(org.telegram.messenger.gd.M0(2131745445, "Send"));
        } else if (i7 == 2) {
            Rect rect2 = chatActivityEnterView.I4;
            RectF rectF = chatActivityEnterView.G4;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.I4);
            cVar.o(org.telegram.messenger.gd.M0(2131744606, null));
        } else if (i7 == 3 && chatActivityEnterView.B2 != null) {
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Y1;
            if (slideTextView != null && (rect = slideTextView.I) != null) {
                Rect rect3 = org.telegram.messenger.g0.Q;
                rect3.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.Y1;
                int[] iArr = this.f38785o;
                slideTextView2.getLocationOnScreen(iArr);
                rect3.offset(iArr[0], iArr[1]);
                chatActivityEnterView.B2.getLocationOnScreen(iArr);
                rect3.offset(-iArr[0], -iArr[1]);
                cVar.h(rect3);
            }
            cVar.o(org.telegram.messenger.gd.M0(2131752578, "Cancel"));
        }
    }
}
