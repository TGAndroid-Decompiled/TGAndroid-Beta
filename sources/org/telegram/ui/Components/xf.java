package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xf extends j1.b {
    public final int[] f32465o;
    public final ChatActivityEnterView.RecordCircle f32466p;

    public xf(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.f32466p = recordCircle;
        this.f32465o = new int[2];
    }

    @Override
    public final int g(float f7, float f10) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (chatActivityEnterView.f23787s4 && chatActivityEnterView.N1 != null) {
            if (chatActivityEnterView.T3.contains((int) f7, (int) f10)) {
                return 1;
            }
            if (chatActivityEnterView.S3.contains(f7, f10)) {
                return 2;
            }
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23737k1;
            if (slideTextView != null && (rect = slideTextView.K) != null) {
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f23737k1;
                int[] iArr = this.f32465o;
                slideTextView2.getLocationOnScreen(iArr);
                rectF.offset(iArr[0], iArr[1]);
                chatActivityEnterView.N1.getLocationOnScreen(iArr);
                rectF.offset(-iArr[0], -iArr[1]);
                if (rectF.contains(f7, f10)) {
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
        if (ChatActivityEnterView.this.f23787s4) {
            arrayList.add(1);
            arrayList.add(3);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        return true;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (i10 == 1) {
            cVar.h(chatActivityEnterView.T3);
            cVar.o(org.telegram.messenger.cd.L0(2131745657, "Send"));
        } else if (i10 == 2) {
            Rect rect2 = chatActivityEnterView.U3;
            RectF rectF = chatActivityEnterView.S3;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.U3);
            cVar.o(org.telegram.messenger.cd.L0(2131744859, null));
        } else if (i10 == 3 && chatActivityEnterView.N1 != null) {
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23737k1;
            if (slideTextView != null && (rect = slideTextView.K) != null) {
                Rect rect3 = org.telegram.messenger.i0.Q;
                rect3.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f23737k1;
                int[] iArr = this.f32465o;
                slideTextView2.getLocationOnScreen(iArr);
                rect3.offset(iArr[0], iArr[1]);
                chatActivityEnterView.N1.getLocationOnScreen(iArr);
                rect3.offset(-iArr[0], -iArr[1]);
                cVar.h(rect3);
            }
            cVar.o(org.telegram.messenger.cd.L0(2131752589, "Cancel"));
        }
    }
}
