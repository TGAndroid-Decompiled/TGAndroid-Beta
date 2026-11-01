package org.telegram.ui;

import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ky0 {
    public final int f39026a;
    public boolean f39027b;
    public my0 f39028c;
    public final boolean[] f39030g;
    public boolean f39031i;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f39029f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f39032j = new ArrayList();

    public ky0(int i10, int i11) {
        boolean[] zArr = new boolean[2];
        this.f39030g = zArr;
        this.f39026a = i11;
        if (i11 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String i12 = i0.a.i(i11, "");
            for (int i13 = 0; i13 < i12.length(); i13++) {
                int charAt = i12.charAt(i13) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = ny0.f39984s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            org.telegram.messenger.vi.b0(i10).l0(tL_inputStickerSetShortName, 0, false, false, new w(this, hashSet, arrayList, 11));
        }
        String str = ny0.f39984s[Utilities.f14520b.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        org.telegram.messenger.vi.b0(i10).l0(tL_inputStickerSetShortName2, 0, false, false, new org.telegram.ui.Components.vg(29, this, str));
    }

    public static ky0 c(int i10, TLRPC.UserFull userFull, ky0 ky0Var) {
        int i11;
        TL_account.TL_birthday tL_birthday;
        if (org.telegram.messenger.tc.e(2) && org.telegram.messenger.y1.d(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i11 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i11 = 0;
            }
            if (ky0Var != null) {
                if (ky0Var.f39026a == i11) {
                    return ky0Var;
                }
                ky0Var.b(false);
            }
            return new ky0(i10, i11);
        } else if (ky0Var != null) {
            ky0Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f39027b && this.f39029f.size() >= this.e.size()) {
            boolean[] zArr = this.f39030g;
            int i10 = 0;
            if (zArr[0] && zArr[1]) {
                this.f39027b = true;
                ArrayList arrayList = this.h;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((Runnable) obj).run();
                }
                arrayList.clear();
            }
        }
    }

    public final void b(boolean z10) {
        if (!z10 && !this.f39032j.isEmpty()) {
            this.f39031i = true;
            return;
        }
        this.h.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                ((my0) arrayList.get(i10)).R();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
