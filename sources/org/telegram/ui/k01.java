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

public final class k01 {

    public final int f39552a;

    public boolean f39553b;

    public m01 f39554c;

    public final boolean[] f39557g;

    public boolean f39558i;
    public final ArrayList d = new ArrayList();

    public final ArrayList f39555e = new ArrayList();

    public final ArrayList f39556f = new ArrayList();
    public final ArrayList h = new ArrayList();

    public final ArrayList f39559j = new ArrayList();

    public k01(int i10, int i11) {
        boolean[] zArr = new boolean[2];
        this.f39557g = zArr;
        this.f39552a = i11;
        int i12 = 9;
        if (i11 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String strK = i0.a.k(i11, "");
            for (int i13 = 0; i13 < strK.length(); i13++) {
                int iCharAt = strK.charAt(i13) - '0';
                if (iCharAt >= 0 && iCharAt <= 9) {
                    arrayList.add(Integer.valueOf(iCharAt));
                    hashSet.add(Integer.valueOf(iCharAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = n01.f40619s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new b0(this, hashSet, arrayList, 7));
        }
        String str = n01.f40619s[Utilities.random.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new ib0(i12, this, str));
    }

    public static k01 c(int i10, TLRPC.UserFull userFull, k01 k01Var) {
        TL_account.TL_birthday tL_birthday;
        if (!LiteMode.isEnabled(2) || !BirthdayController.isToday(userFull)) {
            if (k01Var == null) {
                return null;
            }
            k01Var.b(false);
            return null;
        }
        int years = (userFull == null || (tL_birthday = userFull.birthday) == null || (tL_birthday.flags & 1) == 0) ? 0 : Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
        if (k01Var != null) {
            if (k01Var.f39552a == years) {
                return k01Var;
            }
            k01Var.b(false);
        }
        return new k01(i10, years);
    }

    public final void a() {
        if (this.f39553b || this.f39556f.size() < this.f39555e.size()) {
            return;
        }
        boolean[] zArr = this.f39557g;
        int i10 = 0;
        if (zArr[0] && zArr[1]) {
            this.f39553b = true;
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

    public final void b(boolean z10) {
        if (!z10 && !this.f39559j.isEmpty()) {
            this.f39558i = true;
            return;
        }
        this.h.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f39555e;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                ((m01) arrayList.get(i10)).onDetachedFromWindow();
                i10++;
            }
        }
    }
}
