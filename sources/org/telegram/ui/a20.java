package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a20 implements RequestDelegate {
    public final int f35540a = 3;
    public final int f35541b;
    public final Object f35542c;
    public final long d;
    public final Object e;
    public final Object f35543f;
    public final Object f35544g;
    public final Object h;

    public a20(int i10, org.telegram.ui.ActionBar.x1 x1Var, Context context, long j10, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.web.q qVar, org.telegram.tgnet.e eVar) {
        this.f35541b = i10;
        this.e = x1Var;
        this.f35543f = context;
        this.d = j10;
        this.f35544g = p6Var;
        this.h = qVar;
        this.f35542c = eVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f35540a;
        int i11 = this.f35541b;
        Object obj = this.f35542c;
        Object obj2 = this.h;
        Object obj3 = this.f35544g;
        Object obj4 = this.f35543f;
        Object obj5 = this.e;
        switch (i10) {
            case 0:
                a50 a50Var = (a50) obj5;
                HashSet hashSet = (HashSet) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) obj2;
                String str = (String) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                long j10 = this.d;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    org.telegram.messenger.wp.r1(a50Var.f21584a).L3(updates, false);
                    org.telegram.messenger.i0.g3(new a3.i0(a50Var, updates, j10, 18));
                } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
                    hashSet.add(Long.valueOf(j10));
                }
                if (atomicInteger.incrementAndGet() == i11 && !hashSet.isEmpty()) {
                    org.telegram.messenger.i0.g3(new fp((Object) a50Var, (Object) hashSet, (Object) u3Var, (Object) str, 27));
                    return;
                }
                return;
            case 1:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new org.telegram.messenger.qb((LaunchActivity) obj5, tLObject, this.f35541b, (String) obj, (String) obj4, (TLRPC.User) obj3, (String) obj2, this.d));
                return;
            case 2:
                Activity activity = (Activity) obj5;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj4;
                byte[] bArr = (byte[]) obj3;
                un unVar = (un) obj2;
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.f(tLObject, activity, p6Var, this.d, bArr, unVar, kjVar));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        org.telegram.messenger.i0.h3(new qz0(unVar, activity, p6Var, kjVar, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        org.telegram.messenger.i0.h3(new xh(unVar, i11, kjVar), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.i0.h3(new qz0(unVar, activity, p6Var, kjVar, 1), 200L);
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.qb(tLObject, this.f35541b, (org.telegram.ui.ActionBar.x1) obj5, (Context) obj4, this.d, (org.telegram.ui.ActionBar.p6) obj3, (org.telegram.ui.web.q) obj2, (org.telegram.tgnet.e) obj));
                return;
        }
    }

    public a20(Activity activity, org.telegram.ui.ActionBar.p6 p6Var, long j10, byte[] bArr, un unVar, org.telegram.messenger.kj kjVar, int i10) {
        this.e = activity;
        this.f35543f = p6Var;
        this.d = j10;
        this.f35544g = bArr;
        this.h = unVar;
        this.f35542c = kjVar;
        this.f35541b = i10;
    }

    public a20(a50 a50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, org.telegram.messenger.u3 u3Var, String str) {
        this.e = a50Var;
        this.d = j10;
        this.f35543f = hashSet;
        this.f35544g = atomicInteger;
        this.f35541b = i10;
        this.h = u3Var;
        this.f35542c = str;
    }

    public a20(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.f35541b = i10;
        this.f35542c = str;
        this.f35543f = str2;
        this.f35544g = user;
        this.h = str3;
        this.d = j10;
    }
}
