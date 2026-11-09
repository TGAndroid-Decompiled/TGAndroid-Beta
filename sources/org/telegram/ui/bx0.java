package org.telegram.ui;

import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class bx0 {
    public final int f44152a;
    public boolean f44153b;
    public dx0 f44154c;
    public final boolean[] f44157g;
    public boolean f44158i;
    public final ArrayList d = new ArrayList();
    public final ArrayList f44155e = new ArrayList();
    public final ArrayList f44156f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f44159j = new ArrayList();

    public bx0(int i7, int i10) {
        boolean[] zArr = new boolean[2];
        this.f44157g = zArr;
        this.f44152a = i10;
        if (i10 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String j3 = jg.g.j(i10, "");
            for (int i11 = 0; i11 < j3.length(); i11++) {
                int charAt = j3.charAt(i11) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = ex0.f45525s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            org.telegram.messenger.ui.b0(i7).l0(tL_inputStickerSetShortName, 0, false, false, new y(this, hashSet, arrayList, 11));
        }
        String str = ex0.f45525s[Utilities.f21334b.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        org.telegram.messenger.ui.b0(i7).l0(tL_inputStickerSetShortName2, 0, false, false, new org.telegram.ui.Components.fx(22, this, str));
    }

    public static bx0 c(int i7, TLRPC.UserFull userFull, bx0 bx0Var) {
        int i10;
        TL_account.TL_birthday tL_birthday;
        if (org.telegram.messenger.sc.e(2) && org.telegram.messenger.v1.d(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i10 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i10 = 0;
            }
            if (bx0Var != null) {
                if (bx0Var.f44152a == i10) {
                    return bx0Var;
                }
                bx0Var.b(false);
            }
            return new bx0(i7, i10);
        } else if (bx0Var != null) {
            bx0Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f44153b && this.f44156f.size() >= this.f44155e.size()) {
            boolean[] zArr = this.f44157g;
            int i7 = 0;
            if (zArr[0] && zArr[1]) {
                this.f44153b = true;
                ArrayList arrayList = this.h;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((Runnable) obj).run();
                }
                arrayList.clear();
            }
        }
    }

    public final void b(boolean z9) {
        if (!z9 && !this.f44159j.isEmpty()) {
            this.f44158i = true;
            return;
        }
        this.h.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f44155e;
            if (i7 < arrayList.size()) {
                ((dx0) arrayList.get(i7)).R();
                i7++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
