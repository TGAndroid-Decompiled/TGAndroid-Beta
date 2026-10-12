package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class dx0 implements Comparator {
    public final int f35400a;
    public final MessagesController f35401b;

    public dx0(MessagesController messagesController, int i10) {
        this.f35400a = i10;
        this.f35401b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        qx0 qx0Var = (qx0) obj;
        qx0 qx0Var2 = (qx0) obj2;
        switch (this.f35400a) {
            case 0:
                MessagesController messagesController = this.f35401b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(qx0Var.f39551a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(qx0Var2.f39551a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f35401b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(qx0Var.f39551a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(qx0Var2.f39551a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
