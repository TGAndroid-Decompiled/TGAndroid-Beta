package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.util.SparseIntArray;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class hq implements Runnable {
    public final int f26978a;
    public final Object f26979b;

    public hq(Object obj, int i10) {
        this.f26978a = i10;
        this.f26979b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        ne.b bVar;
        int i10;
        int i11;
        VideoEditedInfo videoEditedInfo;
        float f7;
        int i12;
        float max;
        int i13;
        o1.k kVar;
        int i14 = this.f26978a;
        long j10 = 0;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f26979b;
        switch (i14) {
            case 0:
                ((mq) obj).dismiss();
                return;
            case 1:
                ((br) obj).a();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.f3) obj).dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 3:
                rr rrVar = ((pr) obj).f29363c;
                TLRPC.Peer peer = rrVar.f29996d0;
                org.telegram.ui.ActionBar.n2 n2Var = rrVar.f29998f0;
                long j11 = rrVar.f29999g0;
                if (rrVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xr xrVar = new xr(n2Var, peer, j11, z10, rrVar.X);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(xrVar);
                    return;
                } else {
                    xrVar.show();
                    return;
                }
            case 4:
                ((ei.d) obj).setLoading(true);
                return;
            case 5:
                ss ssVar = (ss) obj;
                ssVar.f30349a.a(!bVar.f17384f, true);
                AndroidUtilities.runOnUIThread(ssVar.f30352f, 3000L);
                return;
            case 6:
                ((ro0) obj).V(false);
                return;
            case 7:
                ((vt) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((ru) obj).getClass();
                return;
            case 10:
                pf.d.r(((xu) obj).f32485a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                cv cvVar = ((bv) obj).f25040a;
                cvVar.f25263n.setVisibility(4);
                cvVar.h.setVisibility(4);
                ImageView imageView = cvVar.f25267x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((vv) obj).a(true, true);
                return;
            case 13:
                px pxVar = (px) obj;
                if (pxVar.Y.getEmojiView() != null) {
                    tz emojiView = pxVar.Y.getEmojiView();
                    if (!emojiView.f30732f0) {
                        try {
                            int i15 = emojiView.R.f24741s.get(EmojiData.dataColored.length);
                            if (i15 > 0) {
                                emojiView.P.B0();
                                emojiView.U(i15);
                                emojiView.F(i15, AndroidUtilities.dp(-9.0f));
                                emojiView.n(0, null);
                            } else {
                                return;
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 14:
                jy jyVar = (jy) obj;
                jyVar.f27674s.f26437f = true;
                jyVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((gz) obj).h, true);
                return;
            case 16:
                mz mzVar = (mz) obj;
                ArrayList arrayList = mzVar.f28634r;
                ArrayList arrayList2 = mzVar.h;
                oz ozVar = mzVar.f28636w;
                int i16 = ozVar.M;
                tz tzVar = ozVar.Q;
                ax axVar = tzVar.D0;
                if (i16 == mzVar.f28630b) {
                    arrayList2.remove(arrayList);
                    ozVar.E = mzVar.f28631c;
                    ozVar.F = mzVar.d;
                    ozVar.G = mzVar.e;
                    ozVar.H = mzVar.f28632f;
                    ozVar.I = arrayList2;
                    ozVar.J = mzVar.f28633n;
                    ozVar.K = new ArrayList(arrayList);
                    tzVar.G0.e(false);
                    s4.g0 adapter = axVar.getAdapter();
                    oz ozVar2 = tzVar.f30796z0;
                    if (adapter != ozVar2) {
                        axVar.setAdapter(ozVar2);
                    }
                    ozVar.l();
                    return;
                }
                return;
            case 17:
                s00 s00Var = ((r00) obj).e;
                ArrayList arrayList3 = s00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((p00) arrayList3.get(i17)).e && i17 != 0) {
                            o00 o00Var = s00Var.I;
                            s00 s00Var2 = o00Var.d;
                            ArrayList arrayList4 = s00Var2.h;
                            SparseIntArray sparseIntArray = s00Var2.f30079k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((p00) arrayList4.get(i17)).f29176a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (p00) arrayList4.remove(i17));
                                ((p00) arrayList4.get(0)).f29176a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((p00) arrayList4.get(i21)).f29176a = i21;
                                    dialogFilters.get(i21).order = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (s00Var2.K == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        s00Var2.L = i11;
                                        s00Var2.K = i11;
                                    }
                                    if (s00Var2.f30085q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        s00Var2.f30087r0 = i10;
                                        s00Var2.f30085q0 = i10;
                                    }
                                }
                                o00Var.p(i17, 0);
                                n00 n00Var = s00Var2.J;
                                int i23 = ((p00) arrayList4.get(i17)).f29176a;
                                org.telegram.ui.bw bwVar = (org.telegram.ui.bw) n00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.ay[] ayVarArr = bwVar.f35748b.f36092e0;
                                    if (i24 < ayVarArr.length) {
                                        org.telegram.ui.ay ayVar = ayVarArr[i24];
                                        int i25 = ayVar.h;
                                        if (i25 == i23) {
                                            ayVar.h = i19;
                                        } else if (i25 == i19) {
                                            ayVar.h = i23;
                                        }
                                        i24++;
                                    } else {
                                        s00Var2.j();
                                        s00Var2.f30097y = true;
                                        s00Var2.F.setItemAnimator(s00Var2.f30089s0);
                                    }
                                }
                            }
                            s00Var.F.u0(0);
                            org.telegram.ui.aw awVar = (org.telegram.ui.aw) s00Var;
                            org.telegram.ui.cy cyVar = awVar.B0;
                            if (!cyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    awVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = xc.a0(cyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.ti(awVar, 23));
                                I.k(true);
                                cyVar.f36144o3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                z00 z00Var = (z00) obj;
                if (!z00Var.f32793c) {
                    z00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((i30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.lx lxVar = ((no0) ((n40) obj)).f28858c0;
                if (!lxVar.f32197u0.canScrollVertically(-1)) {
                    lxVar.f32196t0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((p40) obj).f29205b.b(true);
                return;
            case 22:
                ((p40) obj).f29205b.b(true);
                return;
            case 23:
                g50 g50Var = (g50) obj;
                yj0 yj0Var = g50Var.f26505f;
                if (g50Var.f26506n) {
                    yj0Var.getAnimatedDrawable().K(0);
                    yj0Var.setAnimation(g50Var.f26507r);
                    yj0Var.d();
                    return;
                }
                return;
            case 24:
                m60 m60Var = (m60) ((e6.r) obj).f8393b;
                try {
                    c81 c81Var = m60Var.T;
                    if (c81Var != null && (videoEditedInfo = m60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = c81Var.n();
                        VideoEditedInfo videoEditedInfo2 = m60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            c81 c81Var2 = m60Var.T;
                            long j12 = videoEditedInfo2.startTime;
                            if (j12 > 0) {
                                j10 = j12;
                            }
                            c81Var2.K(j10);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 25:
                l60 l60Var = (l60) obj;
                si.r0 r0Var = l60Var.R;
                if (r0Var != null && r0Var.f46758a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j13 = l60Var.F0;
                    if (j13 == 0 || elapsedRealtimeNanos - j13 >= 70000000) {
                        l60Var.A();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ma0 ma0Var = (ma0) obj;
                if (ma0Var.d) {
                    ma0Var.e = true;
                    ma0Var.f28474r = false;
                    ma0Var.f28472f = 0.0f;
                    ma0Var.h = SystemClock.uptimeMillis();
                    ma0Var.invalidate();
                    return;
                }
                return;
            case 27:
                wa0 wa0Var = (wa0) obj;
                Activity parentActivity = wa0Var.getParentActivity();
                Activity parentActivity2 = wa0Var.getParentActivity();
                DispatchQueue dispatchQueue = qg.n1.f44577m;
                boolean z11 = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor edit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z11) {
                    edit.clear();
                } else {
                    edit.putBoolean("learning", true);
                }
                edit.apply();
                return;
            case 28:
                final ib0 ib0Var = (ib0) obj;
                boolean z12 = ib0Var.I;
                boolean z13 = !z12;
                hg.p1 p1Var = ib0Var.e;
                hb0 hb0Var = ib0Var.f27221b;
                if (hb0Var != null && p1Var != null) {
                    if (ib0Var.L && (kVar = ib0Var.K) != null && kVar.f17552f && !z12) {
                        ib0Var.O = 0;
                        return;
                    }
                    boolean g10 = ib0Var.g();
                    if (!z12) {
                        f7 = (-ib0Var.f27226s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = hb0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - p1Var.h) + ib0Var.f27226s;
                        if (computeVerticalScrollRange <= 0 && ib0Var.f27223f.K() > 0 && (i12 = ib0Var.O) < 3) {
                            ib0Var.O = i12 + 1;
                            ib0Var.o(true);
                            return;
                        }
                    }
                    ib0Var.O = 0;
                    float f11 = ib0Var.v;
                    if (g10) {
                        max = -Math.max(0.0f, f11 - f7);
                    } else {
                        max = Math.max(0.0f, f11 - f7) + (-f11);
                    }
                    if (!z12 && !g10) {
                        max += hb0Var.computeVerticalScrollOffset();
                    }
                    final float f12 = max;
                    o1.k kVar2 = ib0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    ib0Var.L = z13;
                    final float translationY = hb0Var.getTranslationY();
                    final float f13 = ib0Var.M;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f12) {
                        ib0Var.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (ib0Var.N && !z12) {
                            ib0Var.N = false;
                            hb0Var.setLayoutManager(ib0Var.getNeededLayoutManager());
                            ib0Var.I = true;
                            ib0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f12);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f17559u = lVar;
                        ib0Var.K = kVar3;
                        final float f14 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f15, float f16) {
                                ib0 ib0Var2 = ib0.this;
                                ib0Var2.f27221b.setTranslationY(f15);
                                ib0Var2.i();
                                float f17 = translationY;
                                ib0Var2.M = AndroidUtilities.lerp(f13, f14, (f15 - f17) / (f12 - f17));
                            }
                        });
                        if (!z12) {
                            ib0Var.K.a(new ei.q4(ib0Var, z13, 2));
                        }
                        ib0Var.K.a(new Object());
                        ib0Var.K.h();
                    }
                    if (num != null && ib0Var.getVisibility() != num.intValue()) {
                        ib0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                ib0Var.O = 0;
                return;
            default:
                ((wb0) obj).S.f27239n.l();
                return;
        }
    }

    public hq(ru ruVar, y90 y90Var, ClickableSpan clickableSpan) {
        this.f26978a = 9;
        this.f26979b = ruVar;
    }
}
