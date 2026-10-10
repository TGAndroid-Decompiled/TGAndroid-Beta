package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class je0 implements RequestDelegate {
    public final int f38968a;
    public final le0 f38969b;
    public final String f38970c;
    public final String d;

    public je0(le0 le0Var, String str, String str2, int i10) {
        this.f38968a = i10;
        this.f38969b = le0Var;
        this.f38970c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38968a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ge0(this.f38969b, tL_error, this.f38970c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ge0(this.f38969b, tL_error, tLObject, this.f38970c, this.d));
                return;
        }
    }
}
