package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class bw0 implements Comparator {
    public final int f35752a;
    public final MessagesController f35753b;

    public bw0(MessagesController messagesController, int i10) {
        this.f35752a = i10;
        this.f35753b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        ow0 ow0Var = (ow0) obj;
        ow0 ow0Var2 = (ow0) obj2;
        switch (this.f35752a) {
            case 0:
                MessagesController messagesController = this.f35753b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(ow0Var.f39991a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(ow0Var2.f39991a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f35753b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(ow0Var.f39991a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(ow0Var2.f39991a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
