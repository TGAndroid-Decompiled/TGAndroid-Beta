package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f29074a;
    public final Object f29075b;
    public final Object f29076c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f29074a = i10;
        this.f29075b = obj;
        this.f29076c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        pf pfVar;
        boolean z10;
        switch (this.f29074a) {
            case 0:
                return e0.X((e0) this.f29075b, (org.telegram.ui.ActionBar.u6) this.f29076c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f29075b;
                MessageObject messageObject = (MessageObject) this.f29076c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.u6 u6Var = chatActivityEnterView.W3;
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
                org.telegram.ui.ni0 ni0Var = new org.telegram.ui.ni0(chatActivityEnterView.getContext(), u6Var);
                ni0Var.f41911g0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    for (int i11 = 0; i11 < groupedMessages.messages.size(); i11++) {
                        MessageObject messageObject2 = groupedMessages.messages.get(i11);
                        if (i11 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(chatActivityEnterView.d0(messageObject2, z10));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.d0(messageObject, true));
                }
                ni0Var.p(arrayList);
                k80 F = k80.F(chatActivityEnterView.f25915m1, u6Var, chatActivityEnterView.F1);
                mc0 mc0Var = new mc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.W3);
                mc0Var.a(!chatActivityEnterView.R4, false);
                mc0Var.setOnClickListener(new di.c4(chatActivityEnterView, arrayList, mc0Var, ni0Var, 10));
                F.q(mc0Var);
                F.Y();
                ni0Var.o(F);
                ni0Var.q(chatActivityEnterView.F1, false, new di.c4(chatActivityEnterView, groupedMessages, messageObject, ni0Var, 11));
                ni0Var.show();
                return true;
        }
    }
}
