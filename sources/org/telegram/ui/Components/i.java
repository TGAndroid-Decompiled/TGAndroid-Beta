package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i implements View.OnLongClickListener {
    public final int f29106a;
    public final Object f29107b;
    public final Object f29108c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f29106a = i10;
        this.f29107b = obj;
        this.f29108c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        pf pfVar;
        boolean z10;
        switch (this.f29106a) {
            case 0:
                return e0.X((e0) this.f29107b, (org.telegram.ui.ActionBar.u6) this.f29108c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f29107b;
                MessageObject messageObject = (MessageObject) this.f29108c;
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
                org.telegram.ui.pi0 pi0Var = new org.telegram.ui.pi0(chatActivityEnterView.getContext(), u6Var);
                pi0Var.f42417g0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    for (int i11 = 0; i11 < groupedMessages.messages.size(); i11++) {
                        MessageObject messageObject2 = groupedMessages.messages.get(i11);
                        if (i11 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList.add(chatActivityEnterView.c0(messageObject2, z10));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.c0(messageObject, true));
                }
                pi0Var.p(arrayList);
                l80 F = l80.F(chatActivityEnterView.f25919m1, u6Var, chatActivityEnterView.F1);
                nc0 nc0Var = new nc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.W3);
                nc0Var.a(!chatActivityEnterView.R4, false);
                nc0Var.setOnClickListener(new di.c4(chatActivityEnterView, arrayList, nc0Var, pi0Var, 10));
                F.q(nc0Var);
                F.Y();
                pi0Var.o(F);
                pi0Var.q(chatActivityEnterView.F1, false, new di.c4(chatActivityEnterView, groupedMessages, messageObject, pi0Var, 11));
                pi0Var.show();
                return true;
        }
    }
}
