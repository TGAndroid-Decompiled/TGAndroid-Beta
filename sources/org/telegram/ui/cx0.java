package org.telegram.ui;

import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cx0 {
    public final int f44824a;
    public boolean f44825b;
    public ex0 f44826c;
    public final boolean[] f44829g;
    public boolean f44830i;
    public final ArrayList d = new ArrayList();
    public final ArrayList f44827e = new ArrayList();
    public final ArrayList f44828f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f44831j = new ArrayList();

    public cx0(int i7, int i10) {
        boolean[] zArr = new boolean[2];
        this.f44829g = zArr;
        this.f44824a = i10;
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
            String[] strArr = fx0.f45862s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            org.telegram.messenger.ui.b0(i7).l0(tL_inputStickerSetShortName, 0, false, false, new y(this, hashSet, arrayList, 11));
        }
        String str = fx0.f45862s[Utilities.f21339b.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        org.telegram.messenger.ui.b0(i7).l0(tL_inputStickerSetShortName2, 0, false, false, new org.telegram.ui.Components.ex(22, this, str));
    }

    public static cx0 c(int i7, TLRPC.UserFull userFull, cx0 cx0Var) {
        int i10;
        TL_account.TL_birthday tL_birthday;
        if (org.telegram.messenger.sc.e(2) && org.telegram.messenger.v1.d(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i10 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i10 = 0;
            }
            if (cx0Var != null) {
                if (cx0Var.f44824a == i10) {
                    return cx0Var;
                }
                cx0Var.b(false);
            }
            return new cx0(i7, i10);
        } else if (cx0Var != null) {
            cx0Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f44825b && this.f44828f.size() >= this.f44827e.size()) {
            boolean[] zArr = this.f44829g;
            int i7 = 0;
            if (zArr[0] && zArr[1]) {
                this.f44825b = true;
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
        if (!z9 && !this.f44831j.isEmpty()) {
            this.f44830i = true;
            return;
        }
        this.h.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f44827e;
            if (i7 < arrayList.size()) {
                ((ex0) arrayList.get(i7)).R();
                i7++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
