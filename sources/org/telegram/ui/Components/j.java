package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class j implements View.OnLongClickListener {
    public final int f24175a;
    public final Object f24176b;
    public final Object f24177c;
    public final Object d;

    public j(Object obj, Object obj2, Object obj3, int i10) {
        this.f24175a = i10;
        this.f24176b = obj;
        this.f24177c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        rf rfVar;
        boolean z10;
        switch (this.f24175a) {
            case 0:
                return g0.X((g0) this.f24176b, (org.telegram.ui.ActionBar.f6) this.f24177c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f24176b;
                MessageObject messageObject = (MessageObject) this.f24177c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = chatActivityEnterView.V3;
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
                org.telegram.ui.cj0 cj0Var = new org.telegram.ui.cj0(chatActivityEnterView.getContext(), f6Var);
                cj0Var.f31693h0 = true;
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
                cj0Var.q(arrayList);
                w70 F = w70.F(chatActivityEnterView.l1, f6Var, chatActivityEnterView.E1);
                dc0 dc0Var = new dc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.V3);
                dc0Var.a(!chatActivityEnterView.Q4, false);
                dc0Var.setOnClickListener(new di.o(chatActivityEnterView, arrayList, dc0Var, cj0Var, 9));
                F.q(dc0Var);
                F.Y();
                cj0Var.p(F);
                cj0Var.r(chatActivityEnterView.E1, false, new di.o(chatActivityEnterView, groupedMessages, messageObject, cj0Var, 10));
                cj0Var.show();
                return true;
        }
    }
}
