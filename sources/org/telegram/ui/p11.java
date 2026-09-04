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
public final class p11 {
    public final int f39383a;
    public boolean f39384b;
    public r11 f39385c;
    public final boolean[] f39388g;
    public boolean f39389i;
    public final ArrayList d = new ArrayList();
    public final ArrayList f39386e = new ArrayList();
    public final ArrayList f39387f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f39390j = new ArrayList();

    public p11(int i10, int i11) {
        boolean[] zArr = new boolean[2];
        this.f39388g = zArr;
        this.f39383a = i11;
        if (i11 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String i12 = i2.g.i(i11, "");
            for (int i13 = 0; i13 < i12.length(); i13++) {
                int charAt = i12.charAt(i13) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = s11.f40276s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new y(this, hashSet, arrayList, 7));
        }
        String str = s11.f40276s[Utilities.random.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new oj0(6, this, str));
    }

    public static p11 c(int i10, TLRPC.UserFull userFull, p11 p11Var) {
        int i11;
        TL_account.TL_birthday tL_birthday;
        if (LiteMode.isEnabled(2) && BirthdayController.isToday(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i11 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i11 = 0;
            }
            if (p11Var != null) {
                if (p11Var.f39383a == i11) {
                    return p11Var;
                }
                p11Var.b(false);
            }
            return new p11(i10, i11);
        } else if (p11Var != null) {
            p11Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f39384b && this.f39387f.size() >= this.f39386e.size()) {
            boolean[] zArr = this.f39388g;
            int i10 = 0;
            if (zArr[0] && zArr[1]) {
                this.f39384b = true;
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
        if (!z10 && !this.f39390j.isEmpty()) {
            this.f39389i = true;
            return;
        }
        this.h.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f39386e;
            if (i10 < arrayList.size()) {
                ((r11) arrayList.get(i10)).onDetachedFromWindow();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
