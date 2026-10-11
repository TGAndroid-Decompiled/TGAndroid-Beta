package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class y7 implements Utilities.Callback3 {
    public final int f35771a;
    public final l8 f35772b;
    public final l0 f35773c;
    public final long d;

    public y7(l8 l8Var, l0 l0Var, long j3, int i10) {
        this.f35771a = i10;
        this.f35772b = l8Var;
        this.f35773c = l0Var;
        this.d = j3;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f35771a) {
            case 0:
                String str = (String) obj;
                final Utilities.Callback callback = (Utilities.Callback) obj3;
                final l8 l8Var = this.f35772b;
                TLRPC.User user = l8Var.f35268e;
                String str2 = l8Var.f35270f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = l8Var.l0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f35773c.Z(user, str2, this.d, str, bArr3, null, l8Var.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        l8 l8Var2 = l8Var;
                                        l8Var2.fragmentView.postDelayed(new v7(l8Var2, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        l8 l8Var3 = l8Var;
                                        l8Var3.fragmentView.postDelayed(new v7(l8Var3, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new x7(l8Var, 2));
                return;
            default:
                String str3 = (String) obj;
                final Utilities.Callback callback2 = (Utilities.Callback) obj3;
                final l8 l8Var2 = this.f35772b;
                TLRPC.User user2 = l8Var2.f35268e;
                String str4 = l8Var2.f35270f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = l8Var2.l0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f35773c.Z(user2, str4, this.d, str3, bArr4, null, l8Var2.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        l8 l8Var22 = l8Var2;
                                        l8Var22.fragmentView.postDelayed(new v7(l8Var22, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        l8 l8Var3 = l8Var2;
                                        l8Var3.fragmentView.postDelayed(new v7(l8Var3, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new x7(l8Var2, 3));
                return;
        }
    }
}
