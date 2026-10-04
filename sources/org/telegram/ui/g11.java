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
public final class g11 {
    public final int f36465a;
    public boolean f36466b;
    public i11 f36467c;
    public final boolean[] f36470g;
    public boolean f36471i;
    public final ArrayList d = new ArrayList();
    public final ArrayList f36468e = new ArrayList();
    public final ArrayList f36469f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f36472j = new ArrayList();

    public g11(int i10, int i11) {
        boolean[] zArr = new boolean[2];
        this.f36470g = zArr;
        this.f36465a = i11;
        if (i11 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String h = hg.k0.h(i11, "");
            for (int i12 = 0; i12 < h.length(); i12++) {
                int charAt = h.charAt(i12) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = j11.f37548s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new z(this, hashSet, arrayList, 11));
        }
        String str = j11.f37548s[Utilities.random.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new ft(14, this, str));
    }

    public static g11 c(int i10, TLRPC.UserFull userFull, g11 g11Var) {
        int i11;
        TL_account.TL_birthday tL_birthday;
        if (LiteMode.isEnabled(2) && BirthdayController.isToday(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i11 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i11 = 0;
            }
            if (g11Var != null) {
                if (g11Var.f36465a == i11) {
                    return g11Var;
                }
                g11Var.b(false);
            }
            return new g11(i10, i11);
        } else if (g11Var != null) {
            g11Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f36466b && this.f36469f.size() >= this.f36468e.size()) {
            boolean[] zArr = this.f36470g;
            int i10 = 0;
            if (zArr[0] && zArr[1]) {
                this.f36466b = true;
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
        if (!z10 && !this.f36472j.isEmpty()) {
            this.f36471i = true;
            return;
        }
        this.h.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36468e;
            if (i10 < arrayList.size()) {
                ((i11) arrayList.get(i10)).onDetachedFromWindow();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
