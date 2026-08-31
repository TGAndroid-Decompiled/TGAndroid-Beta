package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ai implements og.g, yd.a, androidx.activity.result.b, oa0, h71, g5.h0, OnSuccessListener, ra.m, r4.h, com.google.android.gms.common.api.internal.s, uf.j1, OnCompleteListener, wh.h0, wh.d1 {
    public final int f25264a;
    public final Object f25265b;

    public ai(Object obj, int i10) {
        this.f25264a = i10;
        this.f25265b = obj;
    }

    @Override
    public boolean A() {
        return true;
    }

    @Override
    public void B(CharSequence charSequence) {
        wh.m3 m3Var = ((wh.x0) this.f25265b).P;
        if (m3Var != null) {
            m3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                m3Var.f49876a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public long C() {
        return 0L;
    }

    @Override
    public boolean D(wh.e1 e1Var) {
        return false;
    }

    @Override
    public org.telegram.ui.Cells.l9 E() {
        return (wh.x0) this.f25265b;
    }

    @Override
    public long F(long j10) {
        return 1L;
    }

    @Override
    public wh.a G() {
        return ((wh.x0) this.f25265b).f50174a;
    }

    @Override
    public long I(long j10, long j11) {
        return 1L;
    }

    public boolean J(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ai.J(android.view.MotionEvent):boolean");
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public boolean L() {
        wh.x0 x0Var = (wh.x0) this.f25265b;
        wh.m3 m3Var = x0Var.P;
        if (m3Var != null) {
            wh.a aVar = x0Var.f50174a;
            if (m3Var.f49876a.S4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void M(int i10, int i11) {
        wh.x0 x0Var = (wh.x0) this.f25265b;
        wh.m3 m3Var = x0Var.P;
        if (m3Var != null) {
            wh.a aVar = x0Var.f50174a;
            wh.d2 d2Var = m3Var.f49876a.G3;
            if (d2Var != null) {
                d2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void O(Editable editable) {
        ((wh.a5) this.f25265b).h();
    }

    @Override
    public void P(g.x xVar) {
        switch (this.f25264a) {
            case 0:
                xVar.a(((mi) this.f25265b).getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                xVar.a(((mq0) this.f25265b).getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                xVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    @Override
    public void Q() {
        wh.x0 x0Var = (wh.x0) this.f25265b;
        wh.m3 m3Var = x0Var.P;
        if (m3Var != null) {
            wh.a aVar = x0Var.f50174a;
            wh.r3 r3Var = m3Var.f49876a;
            wh.d2 d2Var = r3Var.G3;
            if (d2Var != null) {
                d2Var.g();
            }
            r3Var.f49979e3.onContentChanged();
        }
    }

    @Override
    public boolean R(int i10) {
        if (i10 == ((xn0) this.f25265b).f48751a0) {
            return true;
        }
        return false;
    }

    public byte S() {
        int read = ((com.google.firebase.messaging.d) this.f25265b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public boolean T(boolean z4) {
        return false;
    }

    @Override
    public void U(int i10, int i11, CharSequence charSequence, boolean z4) {
        qh.f fVar = ((qh.k) this.f25265b).f45517f;
        if (fVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z4) {
                Emoji.replaceEmoji(spannableStringBuilder, fVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            fVar.setText(spannableStringBuilder);
            fVar.setSelection(i10 + charSequence.length());
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public void V(ArrayList arrayList) {
        boolean z4;
        xn0 xn0Var = (xn0) this.f25265b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            xn0Var.G.add(((uf.i1) arrayList.get(i10)).f48603a);
        }
        org.telegram.ui.ay ayVar = xn0Var.R;
        if (ayVar != null) {
            if (xn0Var.A0 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            ayVar.d(z4, false);
        }
        xn0Var.l();
    }

    @Override
    public void W() {
        wh.x0 x0Var = (wh.x0) this.f25265b;
        wh.m3 m3Var = x0Var.P;
        if (m3Var != null) {
            wh.a aVar = x0Var.f50174a;
            wh.r3.O1(m3Var.f49876a);
        }
    }

    public int Y() {
        return ((S() & 255) << 24) | ((S() & 255) << 16) | ((S() & 255) << 8) | (S() & 255);
    }

    public int Z() {
        return ((S() & Byte.MAX_VALUE) << 21) | ((S() & Byte.MAX_VALUE) << 14) | ((S() & Byte.MAX_VALUE) << 7) | (S() & Byte.MAX_VALUE);
    }

    @Override
    public long a(long j10) {
        return 0L;
    }

    public void a0(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.f25265b).skip(j10 - j11);
            if (skip > 0) {
                j11 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        u5.r rVar = new u5.r(1, (TaskCompletionSource) obj2);
        u5.i iVar = (u5.i) ((u5.t) obj).u();
        Parcel M0 = iVar.M0();
        com.google.android.gms.internal.cast.s.d(M0, rVar);
        M0.writeStringArray((String[]) this.f25265b);
        iVar.R0(M0, 6);
    }

    public l7.w0 b(n7.qa r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ai.b(n7.qa):l7.w0");
    }

    @Override
    public void c(wh.e1 e1Var) {
        switch (this.f25264a) {
            case 20:
                wh.m3 m3Var = ((wh.x0) this.f25265b).P;
                if (m3Var != null) {
                    wh.r3 r3Var = m3Var.f49876a;
                    wh.r3.M1(r3Var, e1Var);
                    r3Var.f49979e3.h(e1Var, true);
                    return;
                }
                return;
            default:
                wh.y4 y4Var = ((wh.a5) this.f25265b).f49645s;
                if (y4Var != null) {
                    wh.r3 r3Var2 = ((wh.x2) y4Var).f50153a;
                    wh.r3.M1(r3Var2, e1Var);
                    r3Var2.f49979e3.h(e1Var, true);
                    return;
                }
                return;
        }
    }

    public String d(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            w9.d dVar = (w9.d) this.f25265b;
            w9.e eVar = new w9.e(stringWriter, dVar.f49475a, dVar.f49476b, dVar.f49477c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f49479b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public void f() {
        wh.x0 x0Var = (wh.x0) this.f25265b;
        wh.m3 m3Var = x0Var.P;
        if (m3Var != null) {
            wh.r3.P1(m3Var.f49876a, x0Var.f50174a);
        }
    }

    @Override
    public boolean forceEnableVibration() {
        return false;
    }

    @Override
    public void g(int i10) {
        boolean z4;
        xn0 xn0Var = (xn0) this.f25265b;
        xn0Var.A0--;
        xn0Var.f48752b0 = i10;
        if (xn0Var.f48754c0 != i10) {
            xn0Var.f48773s.clear();
        }
        if (xn0Var.f48755d0 != i10) {
            xn0Var.F.clear();
        }
        xn0Var.K = true;
        org.telegram.ui.ay ayVar = xn0Var.R;
        if (ayVar != null) {
            if (xn0Var.A0 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            ayVar.d(z4, true);
        }
        xn0Var.l();
        org.telegram.ui.ay ayVar2 = xn0Var.R;
        if (ayVar2 != null) {
            ayVar2.c();
        }
    }

    @Override
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override
    public void i(Canvas canvas) {
        switch (this.f25264a) {
            case 0:
                mi miVar = (mi) this.f25265b;
                canvas.drawColor(miVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                if (SharedConfig.chatBlurEnabled()) {
                    miVar.f29117z2.b(canvas, -2);
                    return;
                }
                return;
            default:
                mq0 mq0Var = (mq0) this.f25265b;
                canvas.drawColor(mq0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                if (SharedConfig.chatBlurEnabled()) {
                    mq0Var.L0.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        return false;
    }

    @Override
    public void k(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f25265b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f368b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f44145a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.K;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f367a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public long m(long j10, long j11) {
        return 0L;
    }

    @Override
    public long n(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override
    public boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override
    public boolean needClickAt(View view, float f10, float f11) {
        int dp = AndroidUtilities.dp(9.0f);
        l61 l61Var = (l61) this.f25265b;
        float f12 = -dp;
        l61Var.f28617g.inset(f12, f12);
        boolean contains = l61Var.f28617g.contains(f10, f11);
        float f13 = dp;
        l61Var.f28617g.inset(f13, f13);
        return contains;
    }

    @Override
    public boolean needLongPress(float f10, float f11) {
        return false;
    }

    @Override
    public void o(wh.e1 e1Var) {
        wh.a aVar;
        wh.a5 a5Var = (wh.a5) this.f25265b;
        wh.y4 y4Var = a5Var.f49645s;
        if (y4Var != null && (aVar = a5Var.f50174a) != null) {
            wh.r3 r3Var = ((wh.x2) y4Var).f50153a;
            ArrayList arrayList = r3Var.f49987i3;
            long j10 = aVar.f49632t;
            if (j10 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((wh.a) arrayList.get(i11)).f49623k.contains(Long.valueOf(j10))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    wh.d2 d2Var = r3Var.G3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    wh.a aVar2 = new wh.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f49623k;
                    ArrayList arrayList3 = aVar2.f49623k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        android.support.v4.media.a.u(1, arrayList3);
                    }
                    arrayList.add(i10 + 1, aVar2);
                    r3Var.s4();
                    r3Var.V2.N(false);
                    wh.d2 d2Var2 = r3Var.G3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                    r3Var.post(new wh.k2(r3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public void onClickAt(View view, float f10, float f11) {
        Runnable runnable = ((l61) this.f25265b).f28619j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onClickTouchDown(View view, float f10, float f11) {
        ((l61) this.f25265b).h.c(true);
    }

    @Override
    public void onClickTouchUp(View view, float f10, float f11) {
        ((l61) this.f25265b).h.c(false);
    }

    @Override
    public void onComplete(Task task) {
        ld.m mVar = (ld.m) this.f25265b;
        Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                mVar.n(null);
                return;
            } else {
                mVar.resumeWith(task.getResult());
                return;
            }
        }
        mVar.resumeWith(k7.q7.a(exception));
    }

    @Override
    public boolean onLongPressRequestedAt(View view, float f10, float f11) {
        return false;
    }

    @Override
    public void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z4, int i10) {
        qh.j5 j5Var = (qh.j5) this.f25265b;
        qh.h5 h5Var = j5Var.I;
        AndroidUtilities.cancelRunOnUIThread(h5Var);
        k71 k71Var = j5Var.f45495y;
        if (k71Var != null && k71Var.y()) {
            AndroidUtilities.runOnUIThread(h5Var);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        int i10;
        int i11;
        com.google.android.gms.internal.cast.c2 c2Var;
        com.google.android.gms.internal.cast.c1 b10;
        r5.a aVar = (r5.a) this.f25265b;
        Bundle bundle = (Bundle) obj;
        if (com.google.android.gms.internal.cast.n0.f3063j) {
            Context context = aVar.f46680a;
            u5.s sVar = aVar.f46684f;
            com.google.android.gms.internal.cast.n0 n0Var = new com.google.android.gms.internal.cast.n0(context, sVar, aVar.f46682c, aVar.f46687j, aVar.f46685g);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE")) {
                i10 = bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0);
            } else if (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            boolean z4 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i10 == 0) {
                if (z4) {
                    i10 = 0;
                    z4 = true;
                } else {
                    return;
                }
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String e6 = w.c.e(packageName, ".client_cast_analytics_data");
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            n0Var.h = i11;
            y2.q.b(context);
            n0Var.f3069g = y2.q.a().c(w2.a.f49324e).a("CAST_SENDER_SDK", new v2.c("proto"), com.google.android.gms.internal.cast.y.f3180a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                n0Var.f3067e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(e6, 0);
            if (i10 != 0) {
                com.google.android.gms.common.api.internal.v e10 = com.google.android.gms.common.api.internal.w.e();
                e10.f2824c = new ai(sVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                e10.d = new y5.c[]{q5.y.f44640c};
                e10.f2823b = false;
                e10.f2822a = 8426;
                Task e11 = sVar.e(0, e10.e());
                ?? obj2 = new Object();
                obj2.f7300b = n0Var;
                obj2.f7301c = packageName;
                obj2.f7299a = i10;
                obj2.d = sharedPreferences;
                e11.addOnSuccessListener(obj2);
            }
            if (z4) {
                b6.m.h(sharedPreferences);
                u5.b bVar = com.google.android.gms.internal.cast.c2.f2955i;
                synchronized (com.google.android.gms.internal.cast.c2.class) {
                    try {
                        if (com.google.android.gms.internal.cast.c2.f2957k == null) {
                            com.google.android.gms.internal.cast.c2.f2957k = new com.google.android.gms.internal.cast.c2(sharedPreferences, n0Var, packageName);
                        }
                        c2Var = com.google.android.gms.internal.cast.c2.f2957k;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                String str = c2Var.f2960c;
                SharedPreferences sharedPreferences2 = c2Var.f2959b;
                HashSet hashSet = c2Var.f2962f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = c2Var.f2963g;
                hashSet2.clear();
                c2Var.h = 0L;
                String str2 = com.google.android.gms.internal.cast.c2.f2956j;
                if (str2.equals(string) && str.equals(string2)) {
                    c2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j10 = sharedPreferences2.getLong(str3, 0L);
                            if (j10 != 0 && currentTimeMillis - j10 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                com.google.android.gms.internal.cast.c1 b11 = com.google.android.gms.internal.cast.c2.b(str3.substring(41));
                                if (b11 != null) {
                                    hashSet2.add(b11);
                                    hashSet.add(b11);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = com.google.android.gms.internal.cast.c2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    c2Var.c(hashSet3);
                    b6.m.h(c2Var.f2961e);
                    b6.m.h(c2Var.d);
                    c2Var.f2961e.post(c2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    c2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                com.google.android.gms.internal.cast.c2.a(com.google.android.gms.internal.cast.c1.CAST_CONTEXT);
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((qh.j5) this.f25265b).i();
    }

    @Override
    public s4.j p(long j10) {
        return (s4.j) this.f25265b;
    }

    @Override
    public c4.e q(g5.j0 r8, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ai.q(g5.j0, java.io.IOException, int):c4.e");
    }

    @Override
    public boolean r(wh.e1 e1Var) {
        return false;
    }

    @Override
    public void s(wh.e1 e1Var, int i10, int i11) {
        wh.y4 y4Var;
        org.telegram.ui.Cells.m9 textSelectionHelper;
        wh.a5 a5Var = (wh.a5) this.f25265b;
        if (!a5Var.f49646w && i10 != i11 && (y4Var = a5Var.f49645s) != null && (textSelectionHelper = ((wh.x2) y4Var).f50153a.getTextSelectionHelper()) != null) {
            e1Var.post(new org.telegram.messenger.p6(this, e1Var, i11, textSelectionHelper, i10, 5));
        }
    }

    @Override
    public long t(long j10, long j11) {
        return 0L;
    }

    @Override
    public void u(g5.j0 j0Var, long j10, long j11, boolean z4) {
        g5.p0 p0Var = (g5.p0) j0Var;
        r4.g gVar = (r4.g) this.f25265b;
        long j12 = p0Var.f6891a;
        Uri uri = p0Var.d.f6950c;
        ?? obj = new Object();
        gVar.f46630n.getClass();
        gVar.f46634r.m(obj, p0Var.f6893c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public Paint.FontMetricsInt w() {
        return ((qh.k) this.f25265b).f45517f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void x(g5.j0 j0Var, long j10, long j11) {
        int size;
        g5.p0 p0Var = (g5.p0) j0Var;
        r4.g gVar = (r4.g) this.f25265b;
        long j12 = p0Var.f6891a;
        Uri uri = p0Var.d.f6950c;
        ?? obj = new Object();
        gVar.f46630n.getClass();
        gVar.f46634r.p(obj, p0Var.f6893c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        s4.c cVar = (s4.c) p0Var.f6895f;
        s4.c cVar2 = gVar.I;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f46958m.size();
        }
        long j13 = cVar.b(0).f46976b;
        int i10 = 0;
        while (i10 < size && gVar.I.b(i10).f46976b < j13) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.f46958m.size()) {
                h5.a.K("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = gVar.O;
                if (j14 != -9223372036854775807L && cVar.h * 1000 <= j14) {
                    h5.a.K("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.O);
                } else {
                    gVar.N = 0;
                }
            }
            int i11 = gVar.N;
            gVar.N = i11 + 1;
            if (i11 < gVar.f46630n.n3(p0Var.f6893c)) {
                gVar.E.postDelayed(gVar.f46638w, Math.min((gVar.N - 1) * 1000, 5000));
                return;
            }
            gVar.D = new IOException();
            return;
        }
        gVar.I = cVar;
        gVar.J = cVar.d & gVar.J;
        gVar.K = j10 - j11;
        gVar.L = j10;
        synchronized (gVar.f46637u) {
            try {
                if (p0Var.f6892b.f6885a == gVar.G) {
                    Uri uri2 = gVar.I.f46956k;
                    if (uri2 == null) {
                        uri2 = p0Var.d.f6950c;
                    }
                    gVar.G = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (size == 0) {
            s4.c cVar3 = gVar.I;
            if (cVar3.d) {
                b6.h hVar = cVar3.f46954i;
                if (hVar != null) {
                    String str = hVar.f1728b;
                    if (!h5.d0.a(str, "urn:mpeg:dash:utc:direct:2014") && !h5.d0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                        if (!h5.d0.a(str, "urn:mpeg:dash:utc:http-iso:2014") && !h5.d0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                            if (!h5.d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !h5.d0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                                if (!h5.d0.a(str, "urn:mpeg:dash:utc:ntp:2014") && !h5.d0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                    h5.a.p("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
                                    gVar.u(true);
                                    return;
                                }
                                gVar.t();
                                return;
                            }
                            g5.p0 p0Var2 = new g5.p0(gVar.A, Uri.parse(hVar.f1729c), 5, new z9.d(21));
                            gVar.B.f(p0Var2, new r4.d(gVar), 1);
                            gVar.f46634r.u(new o4.j(p0Var2.f6892b), p0Var2.f6893c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                            return;
                        }
                        g5.p0 p0Var3 = new g5.p0(gVar.A, Uri.parse(hVar.f1729c), 5, new Object());
                        gVar.B.f(p0Var3, new r4.d(gVar), 1);
                        gVar.f46634r.u(new o4.j(p0Var3.f6892b), p0Var3.f6893c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                        return;
                    }
                    try {
                        gVar.M = h5.d0.J(hVar.f1729c) - gVar.L;
                        gVar.u(true);
                        return;
                    } catch (j3.r1 e6) {
                        h5.a.p("DashMediaSource", "Failed to resolve time offset.", e6);
                        gVar.u(true);
                        return;
                    }
                }
                gVar.t();
                return;
            }
            gVar.u(true);
            return;
        }
        gVar.P += i10;
        gVar.u(true);
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public Object y2() {
        Constructor constructor = (Constructor) this.f25265b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e6) {
            k7.a8 a8Var = ua.c.f48463a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ua.c.b(constructor) + "' with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + ua.c.b(constructor) + "' with no args", e11.getCause());
        }
    }

    @Override
    public org.telegram.ui.Cells.m9 z() {
        wh.m3 m3Var = ((wh.x0) this.f25265b).P;
        if (m3Var == null) {
            return null;
        }
        return m3Var.f49876a.getTextSelectionHelper();
    }

    public ai(u5.s sVar, String[] strArr) {
        this.f25264a = 16;
        this.f25265b = strArr;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public ai(l6.a aVar) {
        this.f25264a = 23;
        b6.m.h(aVar);
        this.f25265b = aVar;
    }

    public ai(int i10) {
        this.f25264a = i10;
        switch (i10) {
            case 14:
                this.f25265b = new org.telegram.ui.Cells.f1(20);
                return;
            case 15:
                this.f25265b = new SparseArray();
                return;
            default:
                this.f25265b = new h5.w(10);
                return;
        }
    }

    public ai(TextView textView) {
        this.f25264a = 6;
        this.f25265b = new q1.g(textView);
    }

    public ai(Context context, n20 n20Var) {
        this.f25264a = 1;
        this.f25265b = new m20(context, n20Var);
    }

    public ai(int i10, int i11) {
        this.f25264a = 2;
        this.f25265b = ApplicationLoader.applicationContext.getSharedPreferences(android.support.v4.media.a.k(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override
    public void H(CharSequence charSequence) {
    }

    @Override
    public void X(String str) {
    }

    @Override
    public void onSeekFinished(k3.a aVar) {
    }

    @Override
    public void onSeekStarted(k3.a aVar) {
    }

    @Override
    public void v() {
    }

    @Override
    public long h(long j10, long j11) {
        return j11;
    }

    @Override
    public void j(int i10, int i11) {
    }

    @Override
    public void onError(k71 k71Var, Exception exc) {
    }

    @Override
    public void N(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void l(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
    }

    @Override
    public void onClickTouchMove(View view, float f10, float f11) {
    }

    @Override
    public void onLongPressCancelled(View view, float f10, float f11) {
    }

    @Override
    public void onLongPressFinish(View view, float f10, float f11) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }

    @Override
    public void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }
}
