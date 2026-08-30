package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class cw0 implements Comparator {
    public final int f33442a;
    public final MessagesController f33443b;

    public cw0(MessagesController messagesController, int i10) {
        this.f33442a = i10;
        this.f33443b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        pw0 pw0Var = (pw0) obj;
        pw0 pw0Var2 = (pw0) obj2;
        switch (this.f33442a) {
            case 0:
                MessagesController messagesController = this.f33443b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(pw0Var.f37545a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(pw0Var2.f37545a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f33443b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(pw0Var.f37545a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(pw0Var2.f37545a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
