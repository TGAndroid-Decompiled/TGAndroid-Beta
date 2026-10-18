package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class dw0 implements Comparator {
    public final int f36331a;
    public final MessagesController f36332b;

    public dw0(MessagesController messagesController, int i10) {
        this.f36331a = i10;
        this.f36332b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        qw0 qw0Var = (qw0) obj;
        qw0 qw0Var2 = (qw0) obj2;
        switch (this.f36331a) {
            case 0:
                MessagesController messagesController = this.f36332b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(qw0Var.f40533a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(qw0Var2.f40533a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f36332b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(qw0Var.f40533a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(qw0Var2.f40533a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
