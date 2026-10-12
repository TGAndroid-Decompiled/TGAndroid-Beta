package org.telegram.ui;

import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class o11 {
    public final int f40535a;
    public boolean f40536b;
    public q11 f40537c;
    public final boolean[] f40540g;
    public boolean f40541i;
    public final ArrayList d = new ArrayList();
    public final ArrayList f40538e = new ArrayList();
    public final ArrayList f40539f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f40542j = new ArrayList();

    public o11(int i10, int i11) {
        boolean[] zArr = new boolean[2];
        this.f40540g = zArr;
        this.f40535a = i11;
        if (i11 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String i12 = hg.c.i(i11, "");
            for (int i13 = 0; i13 < i12.length(); i13++) {
                int charAt = i12.charAt(i13) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = r11.f41470s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new z(this, hashSet, arrayList, 11));
        }
        String str = r11.f41470s[Utilities.random.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new jt(14, this, str));
    }

    public static o11 c(int i10, TLRPC.UserFull userFull, o11 o11Var) {
        int i11;
        TL_account.TL_birthday tL_birthday;
        if (LiteMode.isEnabled(2) && BirthdayController.isToday(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i11 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i11 = 0;
            }
            if (o11Var != null) {
                if (o11Var.f40535a == i11) {
                    return o11Var;
                }
                o11Var.b(false);
            }
            return new o11(i10, i11);
        } else if (o11Var != null) {
            o11Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f40536b && this.f40539f.size() >= this.f40538e.size()) {
            boolean[] zArr = this.f40540g;
            int i10 = 0;
            if (zArr[0] && zArr[1]) {
                this.f40536b = true;
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
        if (!z10 && !this.f40542j.isEmpty()) {
            this.f40541i = true;
            return;
        }
        this.h.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f40538e;
            if (i10 < arrayList.size()) {
                ((q11) arrayList.get(i10)).onDetachedFromWindow();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
