package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class z8 implements Utilities.Callback3 {
    public final int f35218a;
    public final l9 f35219b;
    public final m0 f35220c;
    public final long d;

    public z8(l9 l9Var, m0 m0Var, long j10, int i10) {
        this.f35218a = i10;
        this.f35219b = l9Var;
        this.f35220c = m0Var;
        this.d = j10;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f35218a) {
            case 0:
                String str = (String) obj;
                final Utilities.Callback callback = (Utilities.Callback) obj3;
                final l9 l9Var = this.f35219b;
                TLRPC.User user = l9Var.e;
                String str2 = l9Var.f34529f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = l9Var.l0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f35220c.b0(user, str2, this.d, str, bArr3, null, l9Var.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        l9 l9Var2 = l9Var;
                                        l9Var2.fragmentView.postDelayed(new u8(l9Var2, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        l9 l9Var3 = l9Var;
                                        l9Var3.fragmentView.postDelayed(new u8(l9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new y8(l9Var, 2), null);
                return;
            default:
                String str3 = (String) obj;
                final Utilities.Callback callback2 = (Utilities.Callback) obj3;
                final l9 l9Var2 = this.f35219b;
                TLRPC.User user2 = l9Var2.e;
                String str4 = l9Var2.f34529f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = l9Var2.l0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f35220c.b0(user2, str4, this.d, str3, bArr4, null, l9Var2.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        l9 l9Var22 = l9Var2;
                                        l9Var22.fragmentView.postDelayed(new u8(l9Var22, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        l9 l9Var3 = l9Var2;
                                        l9Var3.fragmentView.postDelayed(new u8(l9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new y8(l9Var2, 3), null);
                return;
        }
    }
}
