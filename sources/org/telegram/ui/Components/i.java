package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f27270a;
    public final Object f27271b;
    public final Object f27272c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f27270a = i10;
        this.f27271b = obj;
        this.f27272c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        sf sfVar;
        boolean z10;
        switch (this.f27270a) {
            case 0:
                return e0.Y((e0) this.f27271b, (org.telegram.ui.ActionBar.d6) this.f27272c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f27271b;
                MessageObject messageObject = (MessageObject) this.f27272c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = chatActivityEnterView.W3;
                if (messageObject.isMediaEmpty() || (sfVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(sfVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.cj0 cj0Var = new org.telegram.ui.cj0(chatActivityEnterView.getContext(), d6Var);
                cj0Var.f36769h0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    for (int i11 = 0; i11 < groupedMessages.messages.size(); i11++) {
                        MessageObject messageObject2 = groupedMessages.messages.get(i11);
                        if (i11 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(chatActivityEnterView.e0(messageObject2, z10));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.e0(messageObject, true));
                }
                cj0Var.q(arrayList);
                p80 F = p80.F(chatActivityEnterView.f23952m1, d6Var, chatActivityEnterView.F1);
                uc0 uc0Var = new uc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.W3);
                uc0Var.a(!chatActivityEnterView.R4, false);
                uc0Var.setOnClickListener(new ai.p5(chatActivityEnterView, arrayList, uc0Var, cj0Var, 10));
                F.q(uc0Var);
                F.Y();
                cj0Var.p(F);
                cj0Var.r(chatActivityEnterView.F1, false, new ai.p5(chatActivityEnterView, groupedMessages, messageObject, cj0Var, 11));
                cj0Var.show();
                return true;
        }
    }
}
