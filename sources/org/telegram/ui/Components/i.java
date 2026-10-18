package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f26969a;
    public final Object f26970b;
    public final Object f26971c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f26969a = i10;
        this.f26970b = obj;
        this.f26971c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        pf pfVar;
        boolean z10;
        switch (this.f26969a) {
            case 0:
                return e0.Y((e0) this.f26970b, (org.telegram.ui.ActionBar.d6) this.f26971c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f26970b;
                MessageObject messageObject = (MessageObject) this.f26971c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = chatActivityEnterView.W3;
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
                org.telegram.ui.ni0 ni0Var = new org.telegram.ui.ni0(chatActivityEnterView.getContext(), d6Var);
                ni0Var.f39459h0 = true;
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
                ni0Var.q(arrayList);
                i80 F = i80.F(chatActivityEnterView.f23978m1, d6Var, chatActivityEnterView.F1);
                nc0 nc0Var = new nc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.W3);
                nc0Var.a(!chatActivityEnterView.R4, false);
                nc0Var.setOnClickListener(new ci.b4(chatActivityEnterView, arrayList, nc0Var, ni0Var, 10));
                F.q(nc0Var);
                F.Y();
                ni0Var.p(F);
                ni0Var.r(chatActivityEnterView.F1, false, new ci.b4(chatActivityEnterView, groupedMessages, messageObject, ni0Var, 11));
                ni0Var.show();
                return true;
        }
    }
}
