package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class tr {

    public final int f32860a;

    public String f32861b;

    public final ArrayList f32862c;
    public final boolean[] d;

    public boolean[] f32863e;

    public boolean f32864f;

    public final int f32865g;
    public int h;

    public int f32866i;

    public final ur f32867j;

    public tr(ur urVar, int i10, ArrayList arrayList) {
        this.f32867j = urVar;
        this.f32860a = i10;
        int size = arrayList.size();
        this.f32865g = size;
        this.f32866i = 0;
        if (size > 0) {
            this.f32862c = arrayList;
            this.d = new boolean[size];
            this.f32864f = true;
            g();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i10 = 0; i10 < this.f32865g; i10++) {
            if (!this.d[i10] || ((zArr = this.f32863e) != null && !zArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        return (this.f32863e != null ? this.h : this.f32865g) > 1;
    }

    public final boolean c() {
        return (this.f32863e != null ? this.h : this.f32865g) > 0;
    }

    public final void d() {
        boolean[] zArr;
        boolean[] zArr2;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            int i11 = this.f32865g;
            zArr = this.d;
            if (i10 < i11) {
                if (zArr[i10] && ((zArr2 = this.f32863e) == null || zArr2[i10])) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        Arrays.fill(zArr, !z10);
        f();
        this.f32867j.T.N(true);
    }

    public final void e(int i10) {
        boolean[] zArr = this.f32863e;
        if (zArr == null || zArr[i10]) {
            boolean[] zArr2 = this.d;
            boolean z10 = zArr2[i10];
            zArr2[i10] = !z10;
            if (z10) {
                this.f32866i--;
            } else {
                this.f32866i++;
            }
            this.f32867j.T.N(true);
        }
    }

    public final void f() {
        this.f32866i = 0;
        this.h = 0;
        for (int i10 = 0; i10 < this.f32865g; i10++) {
            boolean[] zArr = this.f32863e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i10]) {
                    this.f32866i++;
                }
            } else if (zArr[i10]) {
                this.h++;
                if (zArr2[i10]) {
                    this.f32866i++;
                }
            }
        }
    }

    public final void g() {
        TLObject tLObject;
        int i10 = this.f32865g;
        if (i10 == 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                tLObject = null;
                break;
            }
            boolean[] zArr = this.f32863e;
            if (zArr == null || zArr[i11]) {
                tLObject = (TLObject) this.f32862c.get(i11);
                break;
            }
            i11++;
        }
        String forcedFirstName = tLObject instanceof TLRPC.User ? UserObject.getForcedFirstName((TLRPC.User) tLObject) : ContactsController.formatName(tLObject);
        int i12 = this.f32860a;
        if (i12 == 0) {
            this.f32861b = LocaleController.getString(R.string.DeleteReportSpam);
            return;
        }
        if (i12 == 1) {
            this.f32861b = b() ? LocaleController.getString(R.string.DeleteAllMessagesFromUsers) : LocaleController.formatString(R.string.DeleteAllFrom, forcedFirstName);
            return;
        }
        if (i12 == 3) {
            this.f32861b = b() ? LocaleController.getString(R.string.DeleteAllReactionsFromUsers) : LocaleController.formatString(R.string.DeleteAllReactionsFrom, forcedFirstName);
        } else if (i12 == 2) {
            if (this.f32867j.f33171c0) {
                this.f32861b = b() ? LocaleController.getString(R.string.DeleteRestrictUsers) : LocaleController.formatString(R.string.DeleteRestrict, forcedFirstName);
            } else {
                this.f32861b = b() ? LocaleController.getString(R.string.DeleteBanUsers) : LocaleController.formatString(R.string.DeleteBan, forcedFirstName);
            }
        }
    }
}
