package org.telegram.messenger;

import android.app.NotificationChannel;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class yg implements org.telegram.ui.ActionBar.z1, Vector.TLDeserializer {
    public static NotificationChannel a(Object obj) {
        return (NotificationChannel) obj;
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        SharedConfig.lambda$checkSdCard$1(a2Var, i10);
    }
}
