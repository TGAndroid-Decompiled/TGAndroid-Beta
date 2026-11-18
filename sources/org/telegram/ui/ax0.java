package org.telegram.ui;

import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ax0 {
    public final int f45683a;
    public boolean f45684b;
    public cx0 f45685c;
    public final boolean[] f45688g;
    public boolean f45689i;
    public final ArrayList d = new ArrayList();
    public final ArrayList f45686e = new ArrayList();
    public final ArrayList f45687f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f45690j = new ArrayList();

    public ax0(int i7, int i10) {
        boolean[] zArr = new boolean[2];
        this.f45688g = zArr;
        this.f45683a = i10;
        if (i10 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String i11 = i5.c.i(i10, "");
            for (int i12 = 0; i12 < i11.length(); i12++) {
                int charAt = i11.charAt(i12) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = dx0.f46991s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            org.telegram.messenger.ri.d0(i7).n0(tL_inputStickerSetShortName, 0, false, false, new x(this, hashSet, arrayList, 11));
        }
        String str = dx0.f46991s[Utilities.f22777b.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        org.telegram.messenger.ri.d0(i7).n0(tL_inputStickerSetShortName2, 0, false, false, new org.telegram.ui.Components.ph(26, this, str));
    }

    public static ax0 c(int i7, TLRPC.UserFull userFull, ax0 ax0Var) {
        int i10;
        TL_account.TL_birthday tL_birthday;
        if (org.telegram.messenger.pc.e(2) && org.telegram.messenger.v1.d(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i10 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i10 = 0;
            }
            if (ax0Var != null) {
                if (ax0Var.f45683a == i10) {
                    return ax0Var;
                }
                ax0Var.b(false);
            }
            return new ax0(i7, i10);
        } else if (ax0Var != null) {
            ax0Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f45684b && this.f45687f.size() >= this.f45686e.size()) {
            boolean[] zArr = this.f45688g;
            int i7 = 0;
            if (zArr[0] && zArr[1]) {
                this.f45684b = true;
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

    public final void b(boolean z10) {
        if (!z10 && !this.f45690j.isEmpty()) {
            this.f45689i = true;
            return;
        }
        this.h.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f45686e;
            if (i7 < arrayList.size()) {
                ((cx0) arrayList.get(i7)).R();
                i7++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
