package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f24780a;
    public final Object f24781b;
    public final Object f24782c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f24780a = i10;
        this.f24781b = obj;
        this.f24782c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        pf pfVar;
        boolean z10;
        switch (this.f24780a) {
            case 0:
                return e0.X((e0) this.f24781b, (org.telegram.ui.ActionBar.e6) this.f24782c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f24781b;
                MessageObject messageObject = (MessageObject) this.f24782c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = chatActivityEnterView.V3;
                if (messageObject.isMediaEmpty() || (pfVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(pfVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.cj0 cj0Var = new org.telegram.ui.cj0(chatActivityEnterView.getContext(), e6Var);
                cj0Var.f32682h0 = true;
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
                w70 F = w70.F(chatActivityEnterView.l1, e6Var, chatActivityEnterView.E1);
                dc0 dc0Var = new dc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.V3);
                dc0Var.a(!chatActivityEnterView.Q4, false);
                dc0Var.setOnClickListener(new ai.p5(chatActivityEnterView, arrayList, dc0Var, cj0Var, 10));
                F.q(dc0Var);
                F.Y();
                cj0Var.p(F);
                cj0Var.r(chatActivityEnterView.E1, false, new ai.p5(chatActivityEnterView, groupedMessages, messageObject, cj0Var, 11));
                cj0Var.show();
                return true;
        }
    }
}
