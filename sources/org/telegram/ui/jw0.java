package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class jw0 implements Comparator {
    public final int f35377a;
    public final MessagesController f35378b;

    public jw0(MessagesController messagesController, int i10) {
        this.f35377a = i10;
        this.f35378b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        ww0 ww0Var = (ww0) obj;
        ww0 ww0Var2 = (ww0) obj2;
        switch (this.f35377a) {
            case 0:
                MessagesController messagesController = this.f35378b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(ww0Var.f39779a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(ww0Var2.f39779a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f35378b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(ww0Var.f39779a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(ww0Var2.f39779a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
