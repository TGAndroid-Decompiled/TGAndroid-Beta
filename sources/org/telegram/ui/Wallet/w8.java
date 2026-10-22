package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w8 implements Utilities.Callback3 {
    public final int f35080a;
    public final i9 f35081b;
    public final m0 f35082c;
    public final long d;

    public w8(i9 i9Var, m0 m0Var, long j10, int i10) {
        this.f35080a = i10;
        this.f35081b = i9Var;
        this.f35082c = m0Var;
        this.d = j10;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f35080a) {
            case 0:
                String str = (String) obj;
                final Utilities.Callback callback = (Utilities.Callback) obj3;
                final i9 i9Var = this.f35081b;
                TLRPC.User user = i9Var.e;
                String str2 = i9Var.f34353f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = i9Var.l0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f35082c.b0(user, str2, this.d, str, bArr3, null, i9Var.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        i9 i9Var2 = i9Var;
                                        i9Var2.fragmentView.postDelayed(new r8(i9Var2, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        i9 i9Var3 = i9Var;
                                        i9Var3.fragmentView.postDelayed(new r8(i9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new v8(i9Var, 2), null);
                return;
            default:
                String str3 = (String) obj;
                final Utilities.Callback callback2 = (Utilities.Callback) obj3;
                final i9 i9Var2 = this.f35081b;
                TLRPC.User user2 = i9Var2.e;
                String str4 = i9Var2.f34353f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = i9Var2.l0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f35082c.b0(user2, str4, this.d, str3, bArr4, null, i9Var2.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        i9 i9Var22 = i9Var2;
                                        i9Var22.fragmentView.postDelayed(new r8(i9Var22, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        i9 i9Var3 = i9Var2;
                                        i9Var3.fragmentView.postDelayed(new r8(i9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new v8(i9Var2, 3), null);
                return;
        }
    }
}
