package org.telegram.tgnet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;

public class TLParseException extends RuntimeException {
    private TLParseException(String str) {
        super(str);
    }

    public static void doThrowOrLog(InputSerializedData inputSerializedData, String str, int i, boolean z) {
        final TLParseException tLParseException = new TLParseException(String.format("can't parse magic %x in %s. Source: %s", Integer.valueOf(i), str, inputSerializedData != null ? inputSerializedData.getDataSourceType() : null));
        FileLog.e(tLParseException, i != -847714938);
        if (i != -847714938) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TLParseException.lambda$doThrowOrLog$0(this.f$0);
                }
            });
        }
        if (z) {
            throw tLParseException;
        }
    }

    public static void lambda$doThrowOrLog$0(TLParseException tLParseException) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.tlSchemeParseException, tLParseException);
    }
}
