package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class dx0 implements Comparator {
    public final int f35149a;
    public final MessagesController f35150b;

    public dx0(MessagesController messagesController, int i10) {
        this.f35149a = i10;
        this.f35150b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        qx0 qx0Var = (qx0) obj;
        qx0 qx0Var2 = (qx0) obj2;
        switch (this.f35149a) {
            case 0:
                MessagesController messagesController = this.f35150b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(qx0Var.f39234a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(qx0Var2.f39234a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f35150b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(qx0Var.f39234a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(qx0Var2.f39234a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
