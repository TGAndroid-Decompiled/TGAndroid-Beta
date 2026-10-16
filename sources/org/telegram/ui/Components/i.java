package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f25433a;
    public final Object f25434b;
    public final Object f25435c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f25433a = i10;
        this.f25434b = obj;
        this.f25435c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        rf rfVar;
        boolean z10;
        switch (this.f25433a) {
            case 0:
                return e0.Y((e0) this.f25434b, (org.telegram.ui.ActionBar.c6) this.f25435c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25434b;
                MessageObject messageObject = (MessageObject) this.f25435c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = chatActivityEnterView.W3;
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
                org.telegram.ui.gj0 gj0Var = new org.telegram.ui.gj0(chatActivityEnterView.getContext(), c6Var);
                gj0Var.f36243h0 = true;
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
                gj0Var.q(arrayList);
                l80 F = l80.F(chatActivityEnterView.f22623m1, c6Var, chatActivityEnterView.F1);
                uc0 uc0Var = new uc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.W3);
                uc0Var.a(!chatActivityEnterView.R4, false);
                uc0Var.setOnClickListener(new bi.b5(chatActivityEnterView, arrayList, uc0Var, gj0Var, 10));
                F.q(uc0Var);
                F.Y();
                gj0Var.p(F);
                gj0Var.r(chatActivityEnterView.F1, false, new bi.b5(chatActivityEnterView, groupedMessages, messageObject, gj0Var, 11));
                gj0Var.show();
                return true;
        }
    }
}
