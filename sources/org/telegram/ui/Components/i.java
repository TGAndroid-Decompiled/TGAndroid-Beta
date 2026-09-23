package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f24835a;
    public final Object f24836b;
    public final Object f24837c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f24835a = i10;
        this.f24836b = obj;
        this.f24837c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        pf pfVar;
        boolean z10;
        switch (this.f24835a) {
            case 0:
                return e0.X((e0) this.f24836b, (org.telegram.ui.ActionBar.d6) this.f24837c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f24836b;
                MessageObject messageObject = (MessageObject) this.f24837c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = chatActivityEnterView.V3;
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
                org.telegram.ui.wi0 wi0Var = new org.telegram.ui.wi0(chatActivityEnterView.getContext(), d6Var);
                wi0Var.f39007h0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    for (int i11 = 0; i11 < groupedMessages.messages.size(); i11++) {
                        MessageObject messageObject2 = groupedMessages.messages.get(i11);
                        if (i11 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(chatActivityEnterView.h0(messageObject2, z10));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.h0(messageObject, true));
                }
                wi0Var.q(arrayList);
                o70 F = o70.F(chatActivityEnterView.l1, d6Var, chatActivityEnterView.E1);
                tb0 tb0Var = new tb0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.V3);
                tb0Var.a(!chatActivityEnterView.R4, false);
                tb0Var.setOnClickListener(new ai.o5(chatActivityEnterView, arrayList, tb0Var, wi0Var, 10));
                F.q(tb0Var);
                F.Y();
                wi0Var.p(F);
                wi0Var.r(chatActivityEnterView.E1, false, new ai.o5(chatActivityEnterView, groupedMessages, messageObject, wi0Var, 11));
                wi0Var.show();
                return true;
        }
    }
}
