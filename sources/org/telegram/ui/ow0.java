package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class ow0 implements Comparator {
    public final int f36354a;
    public final MessagesController f36355b;

    public ow0(MessagesController messagesController, int i10) {
        this.f36354a = i10;
        this.f36355b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        bx0 bx0Var = (bx0) obj;
        bx0 bx0Var2 = (bx0) obj2;
        switch (this.f36354a) {
            case 0:
                MessagesController messagesController = this.f36355b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(bx0Var.f32507a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(bx0Var2.f32507a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f36355b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(bx0Var.f32507a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(bx0Var2.f32507a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
