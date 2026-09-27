package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f24967a;
    public final Object f24968b;
    public final Object f24969c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f24967a = i10;
        this.f24968b = obj;
        this.f24969c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        qf qfVar;
        boolean z10;
        switch (this.f24967a) {
            case 0:
                return e0.X((e0) this.f24968b, (org.telegram.ui.ActionBar.e6) this.f24969c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f24968b;
                MessageObject messageObject = (MessageObject) this.f24969c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = chatActivityEnterView.W3;
                if (messageObject.isMediaEmpty() || (qfVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(qfVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.yi0 yi0Var = new org.telegram.ui.yi0(chatActivityEnterView.getContext(), e6Var);
                yi0Var.f40232h0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    for (int i11 = 0; i11 < groupedMessages.messages.size(); i11++) {
                        MessageObject messageObject2 = groupedMessages.messages.get(i11);
                        if (i11 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(chatActivityEnterView.g0(messageObject2, z10));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.g0(messageObject, true));
                }
                yi0Var.q(arrayList);
                a80 F = a80.F(chatActivityEnterView.f22028m1, e6Var, chatActivityEnterView.F1);
                fc0 fc0Var = new fc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.W3);
                fc0Var.a(!chatActivityEnterView.R4, false);
                fc0Var.setOnClickListener(new ai.o5(chatActivityEnterView, arrayList, fc0Var, yi0Var, 10));
                F.q(fc0Var);
                F.Y();
                yi0Var.p(F);
                yi0Var.r(chatActivityEnterView.F1, false, new ai.o5(chatActivityEnterView, groupedMessages, messageObject, yi0Var, 11));
                yi0Var.show();
                return true;
        }
    }
}
