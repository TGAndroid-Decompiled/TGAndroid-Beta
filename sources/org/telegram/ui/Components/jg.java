package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jg extends j1.b {
    public final int[] f25973o;
    public final ChatActivityEnterView.RecordCircle f25974p;

    public jg(ChatActivityEnterView.RecordCircle recordCircle, ChatActivityEnterView.RecordCircle recordCircle2) {
        super(recordCircle2);
        this.f25974p = recordCircle;
        this.f25973o = new int[2];
    }

    @Override
    public final int g(float f10, float f11) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (chatActivityEnterView.f22814o4 && chatActivityEnterView.J1 != null) {
            if (chatActivityEnterView.P3.contains((int) f10, (int) f11)) {
                return 1;
            }
            if (chatActivityEnterView.O3.contains(f10, f11)) {
                return 2;
            }
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22769g1;
            if (slideTextView != null && (rect = slideTextView.G) != null) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f22769g1;
                int[] iArr = this.f25973o;
                slideTextView2.getLocationOnScreen(iArr);
                rectF.offset(iArr[0], iArr[1]);
                chatActivityEnterView.J1.getLocationOnScreen(iArr);
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
        if (ChatActivityEnterView.this.f22814o4) {
            arrayList.add(1);
            arrayList.add(3);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        return true;
    }

    @Override
    public final void l(int i10, s0.e eVar) {
        Rect rect;
        ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
        if (i10 == 1) {
            eVar.h(chatActivityEnterView.P3);
            eVar.o(LocaleController.getString("Send", R.string.Send));
        } else if (i10 == 2) {
            Rect rect2 = chatActivityEnterView.Q3;
            RectF rectF = chatActivityEnterView.O3;
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            eVar.h(chatActivityEnterView.Q3);
            eVar.o(LocaleController.getString(R.string.Stop));
        } else if (i10 == 3 && chatActivityEnterView.J1 != null) {
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22769g1;
            if (slideTextView != null && (rect = slideTextView.G) != null) {
                Rect rect3 = AndroidUtilities.rectTmp2;
                rect3.set(rect);
                ChatActivityEnterView.SlideTextView slideTextView2 = chatActivityEnterView.f22769g1;
                int[] iArr = this.f25973o;
                slideTextView2.getLocationOnScreen(iArr);
                rect3.offset(iArr[0], iArr[1]);
                chatActivityEnterView.J1.getLocationOnScreen(iArr);
                rect3.offset(-iArr[0], -iArr[1]);
                eVar.h(rect3);
            }
            eVar.o(LocaleController.getString("Cancel", R.string.Cancel));
        }
    }
}
