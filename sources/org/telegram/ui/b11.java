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
public final class b11 {
    public final int f35315a;
    public boolean f35316b;
    public d11 f35317c;
    public final boolean[] f35320g;
    public boolean f35321i;
    public final ArrayList d = new ArrayList();
    public final ArrayList f35318e = new ArrayList();
    public final ArrayList f35319f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f35322j = new ArrayList();

    public b11(int i10, int i11) {
        boolean[] zArr = new boolean[2];
        this.f35320g = zArr;
        this.f35315a = i11;
        if (i11 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String j10 = l.d.j(i11, "");
            for (int i12 = 0; i12 < j10.length(); i12++) {
                int charAt = j10.charAt(i12) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = e11.f36328s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new a0(this, hashSet, arrayList, 7));
        }
        String str = e11.f36328s[Utilities.random.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new org.telegram.ui.Components.xk(23, this, str));
    }

    public static b11 c(int i10, TLRPC.UserFull userFull, b11 b11Var) {
        int i11;
        TL_account.TL_birthday tL_birthday;
        if (LiteMode.isEnabled(2) && BirthdayController.isToday(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i11 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i11 = 0;
            }
            if (b11Var != null) {
                if (b11Var.f35315a == i11) {
                    return b11Var;
                }
                b11Var.b(false);
            }
            return new b11(i10, i11);
        } else if (b11Var != null) {
            b11Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f35316b && this.f35319f.size() >= this.f35318e.size()) {
            boolean[] zArr = this.f35320g;
            int i10 = 0;
            if (zArr[0] && zArr[1]) {
                this.f35316b = true;
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

    public final void b(boolean z4) {
        if (!z4 && !this.f35322j.isEmpty()) {
            this.f35321i = true;
            return;
        }
        this.h.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f35318e;
            if (i10 < arrayList.size()) {
                ((d11) arrayList.get(i10)).onDetachedFromWindow();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
