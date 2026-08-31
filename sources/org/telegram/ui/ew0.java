package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class ew0 implements Comparator {
    public final int f36699a;
    public final MessagesController f36700b;

    public ew0(MessagesController messagesController, int i10) {
        this.f36699a = i10;
        this.f36700b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        rw0 rw0Var = (rw0) obj;
        rw0 rw0Var2 = (rw0) obj2;
        switch (this.f36699a) {
            case 0:
                MessagesController messagesController = this.f36700b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(rw0Var.f41056a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(rw0Var2.f41056a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f36700b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(rw0Var.f41056a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(rw0Var2.f41056a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
