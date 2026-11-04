package org.telegram.ui;

import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class pw0 {
    public final int f48692a;
    public boolean f48693b;
    public rw0 f48694c;
    public final boolean[] f48697g;
    public boolean f48698i;
    public final ArrayList d = new ArrayList();
    public final ArrayList f48695e = new ArrayList();
    public final ArrayList f48696f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f48699j = new ArrayList();

    public pw0(int i3, int i10) {
        boolean[] zArr = new boolean[2];
        this.f48697g = zArr;
        this.f48692a = i10;
        if (i10 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String i11 = k2.p1.i(i10, "");
            for (int i12 = 0; i12 < i11.length(); i12++) {
                int charAt = i11.charAt(i12) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = sw0.f49630s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            org.telegram.messenger.li.b0(i3).l0(tL_inputStickerSetShortName, 0, false, false, new z(this, hashSet, arrayList, 11));
        }
        String str = sw0.f49630s[Utilities.f21385b.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        org.telegram.messenger.li.b0(i3).l0(tL_inputStickerSetShortName2, 0, false, false, new org.telegram.ui.Components.ei(25, this, str));
    }

    public static pw0 c(int i3, TLRPC.UserFull userFull, pw0 pw0Var) {
        int i10;
        TL_account.TL_birthday tL_birthday;
        if (org.telegram.messenger.lc.e(2) && org.telegram.messenger.v1.d(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i10 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i10 = 0;
            }
            if (pw0Var != null) {
                if (pw0Var.f48692a == i10) {
                    return pw0Var;
                }
                pw0Var.b(false);
            }
            return new pw0(i3, i10);
        } else if (pw0Var != null) {
            pw0Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f48693b && this.f48696f.size() >= this.f48695e.size()) {
            boolean[] zArr = this.f48697g;
            int i3 = 0;
            if (zArr[0] && zArr[1]) {
                this.f48693b = true;
                ArrayList arrayList = this.h;
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((Runnable) obj).run();
                }
                arrayList.clear();
            }
        }
    }

    public final void b(boolean z10) {
        if (!z10 && !this.f48699j.isEmpty()) {
            this.f48698i = true;
            return;
        }
        this.h.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f48695e;
            if (i3 < arrayList.size()) {
                ((rw0) arrayList.get(i3)).R();
                i3++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
