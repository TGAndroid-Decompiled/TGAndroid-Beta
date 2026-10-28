package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class lw0 implements Comparator {
    public final int f41271a;
    public final MessagesController f41272b;

    public lw0(MessagesController messagesController, int i10) {
        this.f41271a = i10;
        this.f41272b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        yw0 yw0Var = (yw0) obj;
        yw0 yw0Var2 = (yw0) obj2;
        switch (this.f41271a) {
            case 0:
                MessagesController messagesController = this.f41272b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(yw0Var.f46094a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(yw0Var2.f46094a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f41272b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(yw0Var.f46094a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(yw0Var2.f46094a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
