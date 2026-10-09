package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f27167a;
    public final Object f27168b;
    public final Object f27169c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f27167a = i10;
        this.f27168b = obj;
        this.f27169c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        sf sfVar;
        boolean z10;
        switch (this.f27167a) {
            case 0:
                return e0.Y((e0) this.f27168b, (org.telegram.ui.ActionBar.e6) this.f27169c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f27168b;
                MessageObject messageObject = (MessageObject) this.f27169c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = chatActivityEnterView.W3;
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
                org.telegram.ui.dj0 dj0Var = new org.telegram.ui.dj0(chatActivityEnterView.getContext(), e6Var);
                dj0Var.f37000h0 = true;
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
                dj0Var.q(arrayList);
                p80 F = p80.F(chatActivityEnterView.f23924m1, e6Var, chatActivityEnterView.F1);
                uc0 uc0Var = new uc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.W3);
                uc0Var.a(!chatActivityEnterView.R4, false);
                uc0Var.setOnClickListener(new ai.p5(chatActivityEnterView, arrayList, uc0Var, dj0Var, 10));
                F.q(uc0Var);
                F.Y();
                dj0Var.p(F);
                dj0Var.r(chatActivityEnterView.F1, false, new ai.p5(chatActivityEnterView, groupedMessages, messageObject, dj0Var, 11));
                dj0Var.show();
                return true;
        }
    }
}
