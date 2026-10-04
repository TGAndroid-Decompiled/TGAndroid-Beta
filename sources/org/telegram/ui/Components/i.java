package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f27263a;
    public final Object f27264b;
    public final Object f27265c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f27263a = i10;
        this.f27264b = obj;
        this.f27265c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        rf rfVar;
        boolean z10;
        switch (this.f27263a) {
            case 0:
                return e0.W((e0) this.f27264b, (org.telegram.ui.ActionBar.d6) this.f27265c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f27264b;
                MessageObject messageObject = (MessageObject) this.f27265c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = chatActivityEnterView.W3;
                if (messageObject.isMediaEmpty() || (rfVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(rfVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.zi0 zi0Var = new org.telegram.ui.zi0(chatActivityEnterView.getContext(), d6Var);
                zi0Var.f43804h0 = true;
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
                zi0Var.q(arrayList);
                b80 F = b80.F(chatActivityEnterView.f23921m1, d6Var, chatActivityEnterView.F1);
                hc0 hc0Var = new hc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.W3);
                hc0Var.a(!chatActivityEnterView.R4, false);
                hc0Var.setOnClickListener(new ai.o5(chatActivityEnterView, arrayList, hc0Var, zi0Var, 10));
                F.q(hc0Var);
                F.Y();
                zi0Var.p(F);
                zi0Var.r(chatActivityEnterView.F1, false, new ai.o5(chatActivityEnterView, groupedMessages, messageObject, zi0Var, 11));
                zi0Var.show();
                return true;
        }
    }
}
