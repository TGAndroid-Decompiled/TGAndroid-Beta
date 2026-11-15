package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class zy {
    public String f28034e;
    public String f28035f;
    public String f28036g;
    public long h;
    public long f28037i;
    public int f28038j;
    public double f28039k;
    public long f28040l;
    public long f28041m;
    public final ez f28043o;
    public final HashMap f28031a = new HashMap();
    public final HashMap f28032b = new HashMap();
    public final HashMap f28033c = new HashMap();
    public final ArrayList d = new ArrayList();
    public int f28042n = Integer.MAX_VALUE;

    public zy(ez ezVar) {
        this.f28043o = ezVar;
    }

    public final void a(String str, long j3, float f10) {
        this.f28032b.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f28033c;
        hashMap.put(str, valueOf);
        this.f28037i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f28037i = ((Long) entry.getValue()).longValue() + this.f28037i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f28037i;
        long j11 = this.f28041m;
        if (j10 != j11) {
            long j12 = this.f28040l;
            if (elapsedRealtime != j12) {
                double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                double d2 = this.f28039k;
                if (d2 == 0.0d) {
                    this.f28039k = d;
                } else {
                    this.f28039k = (0.99d * d2) + (d * 0.01d);
                }
                this.f28042n = (int) (((this.h - j10) * 1000) / this.f28039k);
                this.f28041m = j10;
                this.f28040l = elapsedRealtime;
            }
        }
        int i7 = (int) ((((float) j10) / ((float) this.h)) * 100.0f);
        if (this.f28038j != i7) {
            this.f28038j = i7;
            this.f28043o.getNotificationCenter().k(ns.f25594w1, this.f28034e);
        }
    }

    public final void b() {
        TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
        tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
        tL_stickers_createStickerSet.title = this.f28035f;
        tL_stickers_createStickerSet.short_name = this.f28034e;
        String str = this.f28036g;
        if (str != null) {
            tL_stickers_createStickerSet.software = str;
            tL_stickers_createStickerSet.flags |= 8;
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_inputStickerSetItem tL_inputStickerSetItem = ((xy) arrayList.get(i7)).f27626f;
            if (tL_inputStickerSetItem != null) {
                tL_stickers_createStickerSet.stickers.add(tL_inputStickerSetItem);
            }
        }
        this.f28043o.getConnectionsManager().sendRequest(tL_stickers_createStickerSet, new yy(this, tL_stickers_createStickerSet));
    }
}
