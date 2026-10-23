package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class fw0 implements Comparator {
    public final int f37424a;
    public final MessagesController f37425b;

    public fw0(MessagesController messagesController, int i10) {
        this.f37424a = i10;
        this.f37425b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        sw0 sw0Var = (sw0) obj;
        sw0 sw0Var2 = (sw0) obj2;
        switch (this.f37424a) {
            case 0:
                MessagesController messagesController = this.f37425b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(sw0Var.f41814a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(sw0Var2.f41814a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f37425b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(sw0Var.f41814a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(sw0Var2.f41814a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
