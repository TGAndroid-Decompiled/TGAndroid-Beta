package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class ow0 implements Comparator {
    public final int f36344a;
    public final MessagesController f36345b;

    public ow0(MessagesController messagesController, int i10) {
        this.f36344a = i10;
        this.f36345b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        bx0 bx0Var = (bx0) obj;
        bx0 bx0Var2 = (bx0) obj2;
        switch (this.f36344a) {
            case 0:
                MessagesController messagesController = this.f36345b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(bx0Var.f32493a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(bx0Var2.f32493a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f36345b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(bx0Var.f32493a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(bx0Var2.f32493a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
