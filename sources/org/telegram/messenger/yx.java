package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yx implements RequestDelegate {
    public final int f19636a;
    public final rz f19637b;
    public final TLRPC.InputMedia f19638c;
    public final dz d;

    public yx(rz rzVar, TLRPC.InputMedia inputMedia, dz dzVar, int i10) {
        this.f19636a = i10;
        this.f19637b = rzVar;
        this.f19638c = inputMedia;
        this.d = dzVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19636a) {
            case 0:
                final rz rzVar = this.f19637b;
                final TLRPC.InputMedia inputMedia = this.f19638c;
                final dz dzVar = this.d;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.iy.run():void");
                    }
                });
                return;
            default:
                final rz rzVar2 = this.f19637b;
                final TLRPC.InputMedia inputMedia2 = this.f19638c;
                final dz dzVar2 = this.d;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.iy.run():void");
                    }
                });
                return;
        }
    }
}
