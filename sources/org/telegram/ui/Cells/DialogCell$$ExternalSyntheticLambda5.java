package org.telegram.ui.Cells;

import java.util.Comparator;
import org.telegram.messenger.MessageObject;
public final class DialogCell$$ExternalSyntheticLambda5 implements Comparator {
    public static final DialogCell$$ExternalSyntheticLambda5 INSTANCE = new DialogCell$$ExternalSyntheticLambda5();

    private DialogCell$$ExternalSyntheticLambda5() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$updateMessageThumbs$6;
        lambda$updateMessageThumbs$6 = DialogCell.lambda$updateMessageThumbs$6((MessageObject) obj, (MessageObject) obj2);
        return lambda$updateMessageThumbs$6;
    }
}
