package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x7 implements Utilities.Callback3 {
    public final int f35707a;
    public final k8 f35708b;
    public final k0 f35709c;
    public final long d;

    public x7(k8 k8Var, k0 k0Var, long j3, int i10) {
        this.f35707a = i10;
        this.f35708b = k8Var;
        this.f35709c = k0Var;
        this.d = j3;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f35707a) {
            case 0:
                String str = (String) obj;
                final Utilities.Callback callback = (Utilities.Callback) obj3;
                final k8 k8Var = this.f35708b;
                TLRPC.User user = k8Var.f35204e;
                String str2 = k8Var.f35206f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = k8Var.l0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f35709c.Z(user, str2, this.d, str, bArr3, null, k8Var.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        k8 k8Var2 = k8Var;
                                        k8Var2.fragmentView.postDelayed(new u7(k8Var2, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        k8 k8Var3 = k8Var;
                                        k8Var3.fragmentView.postDelayed(new u7(k8Var3, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new w7(k8Var, 2));
                return;
            default:
                String str3 = (String) obj;
                final Utilities.Callback callback2 = (Utilities.Callback) obj3;
                final k8 k8Var2 = this.f35708b;
                TLRPC.User user2 = k8Var2.f35204e;
                String str4 = k8Var2.f35206f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = k8Var2.l0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f35709c.Z(user2, str4, this.d, str3, bArr4, null, k8Var2.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        k8 k8Var22 = k8Var2;
                                        k8Var22.fragmentView.postDelayed(new u7(k8Var22, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        k8 k8Var3 = k8Var2;
                                        k8Var3.fragmentView.postDelayed(new u7(k8Var3, 3), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new w7(k8Var2, 3));
                return;
        }
    }
}
