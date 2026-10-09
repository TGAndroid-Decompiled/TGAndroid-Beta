package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v7 implements Utilities.Callback3 {
    public final int f35557a;
    public final i8 f35558b;
    public final k0 f35559c;
    public final long d;

    public v7(i8 i8Var, k0 k0Var, long j3, int i10) {
        this.f35557a = i10;
        this.f35558b = i8Var;
        this.f35559c = k0Var;
        this.d = j3;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f35557a) {
            case 0:
                String str = (String) obj;
                final Utilities.Callback callback = (Utilities.Callback) obj3;
                final i8 i8Var = this.f35558b;
                TLRPC.User user = i8Var.f35022e;
                String str2 = i8Var.f35024f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = i8Var.l0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f35559c.Z(user, str2, this.d, str, bArr3, null, i8Var.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        i8 i8Var2 = i8Var;
                                        i8Var2.fragmentView.postDelayed(new s7(i8Var2, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        i8 i8Var3 = i8Var;
                                        i8Var3.fragmentView.postDelayed(new s7(i8Var3, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new u7(i8Var, 2));
                return;
            default:
                String str3 = (String) obj;
                final Utilities.Callback callback2 = (Utilities.Callback) obj3;
                final i8 i8Var2 = this.f35558b;
                TLRPC.User user2 = i8Var2.f35022e;
                String str4 = i8Var2.f35024f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = i8Var2.l0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f35559c.Z(user2, str4, this.d, str3, bArr4, null, i8Var2.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        i8 i8Var22 = i8Var2;
                                        i8Var22.fragmentView.postDelayed(new s7(i8Var22, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        i8 i8Var3 = i8Var2;
                                        i8Var3.fragmentView.postDelayed(new s7(i8Var3, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new u7(i8Var2, 3));
                return;
        }
    }
}
