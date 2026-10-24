package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Utilities.Callback3 {
    public final int f35422a;
    public final j9 f35423b;
    public final l0 f35424c;
    public final long d;

    public x8(j9 j9Var, l0 l0Var, long j10, int i10) {
        this.f35422a = i10;
        this.f35423b = j9Var;
        this.f35424c = l0Var;
        this.d = j10;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f35422a) {
            case 0:
                String str = (String) obj;
                final Utilities.Callback callback = (Utilities.Callback) obj3;
                final j9 j9Var = this.f35423b;
                TLRPC.User user = j9Var.e;
                String str2 = j9Var.f34664f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = j9Var.m0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f35424c.b0(user, str2, this.d, str, bArr3, null, j9Var.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        j9 j9Var2 = j9Var;
                                        j9Var2.fragmentView.postDelayed(new s8(j9Var2, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        j9 j9Var3 = j9Var;
                                        j9Var3.fragmentView.postDelayed(new s8(j9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new w8(j9Var, 2), null);
                return;
            default:
                String str3 = (String) obj;
                final Utilities.Callback callback2 = (Utilities.Callback) obj3;
                final j9 j9Var2 = this.f35423b;
                TLRPC.User user2 = j9Var2.e;
                String str4 = j9Var2.f34664f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = j9Var2.m0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f35424c.b0(user2, str4, this.d, str3, bArr4, null, j9Var2.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        j9 j9Var22 = j9Var2;
                                        j9Var22.fragmentView.postDelayed(new s8(j9Var22, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        j9 j9Var3 = j9Var2;
                                        j9Var3.fragmentView.postDelayed(new s8(j9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new w8(j9Var2, 3), null);
                return;
        }
    }
}
