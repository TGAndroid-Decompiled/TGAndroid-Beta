package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c9 implements Utilities.Callback3 {
    public final int f34107a;
    public final o9 f34108b;
    public final m0 f34109c;
    public final long d;

    public c9(o9 o9Var, m0 m0Var, long j10, int i10) {
        this.f34107a = i10;
        this.f34108b = o9Var;
        this.f34109c = m0Var;
        this.d = j10;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f34107a) {
            case 0:
                String str = (String) obj;
                final Utilities.Callback callback = (Utilities.Callback) obj3;
                final o9 o9Var = this.f34108b;
                TLRPC.User user = o9Var.e;
                String str2 = o9Var.f34694f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = o9Var.l0();
                } else {
                    bArr = null;
                }
                byte[] bArr3 = bArr;
                this.f34109c.b0(user, str2, this.d, str, bArr3, null, o9Var.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str3 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        o9 o9Var2 = o9Var;
                                        o9Var2.fragmentView.postDelayed(new x8(o9Var2, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str3)) {
                                    callback.run(str3);
                                    if (str3 == null) {
                                        o9 o9Var3 = o9Var;
                                        o9Var3.fragmentView.postDelayed(new x8(o9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new b9(o9Var, 2), null);
                return;
            default:
                String str3 = (String) obj;
                final Utilities.Callback callback2 = (Utilities.Callback) obj3;
                final o9 o9Var2 = this.f34108b;
                TLRPC.User user2 = o9Var2.e;
                String str4 = o9Var2.f34694f;
                if (((Boolean) obj2).booleanValue()) {
                    bArr2 = o9Var2.l0();
                } else {
                    bArr2 = null;
                }
                byte[] bArr4 = bArr2;
                this.f34109c.b0(user2, str4, this.d, str3, bArr4, null, o9Var2.h, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        String str32 = (String) obj4;
                        switch (r3) {
                            case 0:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        o9 o9Var22 = o9Var2;
                                        o9Var22.fragmentView.postDelayed(new x8(o9Var22, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (!"PASSCODE_FAILED".equalsIgnoreCase(str32)) {
                                    callback2.run(str32);
                                    if (str32 == null) {
                                        o9 o9Var3 = o9Var2;
                                        o9Var3.fragmentView.postDelayed(new x8(o9Var3, 4), 220L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, new b9(o9Var2, 3), null);
                return;
        }
    }
}
