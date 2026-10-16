package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class w7 implements Utilities.Callback3 {
    public final int f33556a;
    public final j8 f33557b;
    public final k0 f33558c;
    public final long d;

    public w7(j8 j8Var, k0 k0Var, long j10, int i10) {
        this.f33556a = i10;
        this.f33557b = j8Var;
        this.f33558c = k0Var;
        this.d = j10;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f33556a) {
            case 0:
                String str = (String) obj;
                final Utilities.Callback callback = (Utilities.Callback) obj3;
                final j8 j8Var = this.f33557b;
                TLRPC.User user = j8Var.e;
                String str2 = j8Var.f33071f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = j8Var.l0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f33558c.Z(user, str2, this.d, str, bArr3, null, j8Var.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        j8 j8Var2 = j8Var;
                                        j8Var2.fragmentView.postDelayed(new t7(j8Var2, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        j8 j8Var3 = j8Var;
                                        j8Var3.fragmentView.postDelayed(new t7(j8Var3, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new v7(j8Var, 2));
                return;
            default:
                String str3 = (String) obj;
                final Utilities.Callback callback2 = (Utilities.Callback) obj3;
                final j8 j8Var2 = this.f33557b;
                TLRPC.User user2 = j8Var2.e;
                String str4 = j8Var2.f33071f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = j8Var2.l0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f33558c.Z(user2, str4, this.d, str3, bArr4, null, j8Var2.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        j8 j8Var22 = j8Var2;
                                        j8Var22.fragmentView.postDelayed(new t7(j8Var22, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        j8 j8Var3 = j8Var2;
                                        j8Var3.fragmentView.postDelayed(new t7(j8Var3, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new v7(j8Var2, 3));
                return;
        }
    }
}
