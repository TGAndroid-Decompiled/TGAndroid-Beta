package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class ew0 implements Comparator {
    public final int f37004a;
    public final MessagesController f37005b;

    public ew0(MessagesController messagesController, int i10) {
        this.f37004a = i10;
        this.f37005b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        rw0 rw0Var = (rw0) obj;
        rw0 rw0Var2 = (rw0) obj2;
        switch (this.f37004a) {
            case 0:
                MessagesController messagesController = this.f37005b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(rw0Var.f41244a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(rw0Var2.f41244a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f37005b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(rw0Var.f41244a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(rw0Var2.f41244a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
