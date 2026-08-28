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
public final class j01 {
    public final int f39329a;
    public boolean f39330b;
    public l01 f39331c;
    public final boolean[] f39334g;
    public boolean f39335i;
    public final ArrayList d = new ArrayList();
    public final ArrayList f39332e = new ArrayList();
    public final ArrayList f39333f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f39336j = new ArrayList();

    public j01(int i9, int i10) {
        boolean[] zArr = new boolean[2];
        this.f39334g = zArr;
        this.f39329a = i10;
        if (i10 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String l10 = j3.r0.l(i10, "");
            for (int i11 = 0; i11 < l10.length(); i11++) {
                int charAt = l10.charAt(i11) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = m01.f40276s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            MediaDataController.getInstance(i9).getStickerSet(tL_inputStickerSetShortName, 0, false, new a0(this, hashSet, arrayList, 7));
        }
        String str = m01.f40276s[Utilities.random.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        MediaDataController.getInstance(i9).getStickerSet(tL_inputStickerSetShortName2, 0, false, new eb0(9, this, str));
    }

    public static j01 c(int i9, TLRPC.UserFull userFull, j01 j01Var) {
        int i10;
        TL_account.TL_birthday tL_birthday;
        if (LiteMode.isEnabled(2) && BirthdayController.isToday(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i10 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i10 = 0;
            }
            if (j01Var != null) {
                if (j01Var.f39329a == i10) {
                    return j01Var;
                }
                j01Var.b(false);
            }
            return new j01(i9, i10);
        } else if (j01Var != null) {
            j01Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f39330b && this.f39333f.size() >= this.f39332e.size()) {
            boolean[] zArr = this.f39334g;
            int i9 = 0;
            if (zArr[0] && zArr[1]) {
                this.f39330b = true;
                ArrayList arrayList = this.h;
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((Runnable) obj).run();
                }
                arrayList.clear();
            }
        }
    }

    public final void b(boolean z10) {
        if (!z10 && !this.f39336j.isEmpty()) {
            this.f39335i = true;
            return;
        }
        this.h.clear();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f39332e;
            if (i9 < arrayList.size()) {
                ((l01) arrayList.get(i9)).onDetachedFromWindow();
                i9++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
