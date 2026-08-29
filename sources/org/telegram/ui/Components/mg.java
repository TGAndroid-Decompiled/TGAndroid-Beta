package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mg extends j1.b {
    public final int[] f30682o;
    public final ChatActivityEnterView.RecordCircle f30683p;

    public mg(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.f30683p = recordCircle;
        this.f30682o = new int[2];
    }

    @Override
    public final int g(float f9, float f10) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (chatActivityEnterView.f26165n4 && chatActivityEnterView.I1 != null) {
            if (chatActivityEnterView.O3.contains((int) f9, (int) f10)) {
                return 1;
            }
            if (chatActivityEnterView.N3.contains(f9, f10)) {
                return 2;
            }
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f26120f1;
            if (slideTextView != null && (rect = slideTextView.F) != null) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f26120f1;
                int[] iArr = this.f30682o;
                slideTextView2.getLocationOnScreen(iArr);
                rectF.offset(iArr[0], iArr[1]);
                chatActivityEnterView.I1.getLocationOnScreen(iArr);
                rectF.offset(-iArr[0], -iArr[1]);
                if (rectF.contains(f9, f10)) {
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
        if (ChatActivityEnterView.this.f26165n4) {
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
            cVar.h(chatActivityEnterView.O3);
            cVar.o(LocaleController.getString("Send", R.string.Send));
        } else if (i10 == 2) {
            Rect rect2 = chatActivityEnterView.P3;
            RectF rectF = chatActivityEnterView.N3;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.P3);
            cVar.o(LocaleController.getString(R.string.Stop));
        } else if (i10 == 3 && chatActivityEnterView.I1 != null) {
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f26120f1;
            if (slideTextView != null && (rect = slideTextView.F) != null) {
                Rect rect3 = AndroidUtilities.rectTmp2;
                rect3.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f26120f1;
                int[] iArr = this.f30682o;
                slideTextView2.getLocationOnScreen(iArr);
                rect3.offset(iArr[0], iArr[1]);
                chatActivityEnterView.I1.getLocationOnScreen(iArr);
                rect3.offset(-iArr[0], -iArr[1]);
                cVar.h(rect3);
            }
            cVar.o(LocaleController.getString("Cancel", R.string.Cancel));
        }
    }
}
