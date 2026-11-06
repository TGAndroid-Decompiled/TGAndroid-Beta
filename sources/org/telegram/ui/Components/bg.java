package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class bg extends k1.b {
    public final int[] f32143o;
    public final ChatActivityEnterView.RecordCircle f32144p;

    public bg(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.f32144p = recordCircle;
        this.f32143o = new int[2];
    }

    @Override
    public final int g(float f10, float f11) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (chatActivityEnterView.f31122s4 && chatActivityEnterView.N1 != null) {
            if (chatActivityEnterView.T3.contains((int) f10, (int) f11)) {
                return 1;
            }
            if (chatActivityEnterView.S3.contains(f10, f11)) {
                return 2;
            }
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f31072k1;
            if (slideTextView != null && (rect = slideTextView.K) != null) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f31072k1;
                int[] iArr = this.f32143o;
                slideTextView2.getLocationOnScreen(iArr);
                rectF.offset(iArr[0], iArr[1]);
                chatActivityEnterView.N1.getLocationOnScreen(iArr);
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
        if (ChatActivityEnterView.this.f31122s4) {
            arrayList.add(1);
            arrayList.add(3);
        }
    }

    @Override
    public final boolean k(int i7, int i10) {
        return true;
    }

    @Override
    public final void l(int i7, s0.d dVar) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (i7 == 1) {
            dVar.h(chatActivityEnterView.T3);
            dVar.o(org.telegram.messenger.hd.M0(2131745641, "Send"));
        } else if (i7 == 2) {
            Rect rect2 = chatActivityEnterView.U3;
            RectF rectF = chatActivityEnterView.S3;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.U3);
            dVar.o(org.telegram.messenger.hd.M0(2131744842, null));
        } else if (i7 == 3 && chatActivityEnterView.N1 != null) {
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f31072k1;
            if (slideTextView != null && (rect = slideTextView.K) != null) {
                Rect rect3 = org.telegram.messenger.g0.Q;
                rect3.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f31072k1;
                int[] iArr = this.f32143o;
                slideTextView2.getLocationOnScreen(iArr);
                rect3.offset(iArr[0], iArr[1]);
                chatActivityEnterView.N1.getLocationOnScreen(iArr);
                rect3.offset(-iArr[0], -iArr[1]);
                dVar.h(rect3);
            }
            dVar.o(org.telegram.messenger.hd.M0(2131752589, "Cancel"));
        }
    }
}
