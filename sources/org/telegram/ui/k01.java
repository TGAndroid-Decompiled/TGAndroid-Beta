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
    public final int f39718a;
    public boolean f39719b;
    public m01 f39720c;
    public final boolean[] f39723g;
    public boolean f39724i;
    public final ArrayList d = new ArrayList();
    public final ArrayList f39721e = new ArrayList();
    public final ArrayList f39722f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f39725j = new ArrayList();

    public k01(int i10, int i11) {
        boolean[] zArr = new boolean[2];
        this.f39723g = zArr;
        this.f39718a = i11;
        if (i11 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String k9 = j7.l1.k(i11, "");
            for (int i12 = 0; i12 < k9.length(); i12++) {
                int charAt = k9.charAt(i12) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = n01.f40667s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new b0(this, hashSet, arrayList, 7));
        }
        String str = n01.f40667s[Utilities.random.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new yu0(2, this, str));
    }

    public static k01 c(int i10, TLRPC.UserFull userFull, k01 k01Var) {
        int i11;
        TL_account.TL_birthday tL_birthday;
        if (LiteMode.isEnabled(2) && BirthdayController.isToday(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i11 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i11 = 0;
            }
            if (k01Var != null) {
                if (k01Var.f39718a == i11) {
                    return k01Var;
                }
                k01Var.b(false);
            }
            return new k01(i10, i11);
        } else if (k01Var != null) {
            k01Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f39719b && this.f39722f.size() >= this.f39721e.size()) {
            boolean[] zArr = this.f39723g;
            int i10 = 0;
            if (zArr[0] && zArr[1]) {
                this.f39719b = true;
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
        if (!z10 && !this.f39725j.isEmpty()) {
            this.f39724i = true;
            return;
        }
        this.h.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f39721e;
            if (i10 < arrayList.size()) {
                ((m01) arrayList.get(i10)).onDetachedFromWindow();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
