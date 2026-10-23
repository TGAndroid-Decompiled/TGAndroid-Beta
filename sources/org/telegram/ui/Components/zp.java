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
public final class zp implements Runnable {
    public final int f33315a;
    public final Object f33316b;

    public zp(Object obj, int i10) {
        this.f33315a = i10;
        this.f33316b = obj;
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
        final float f10;
        int i13;
        o1.k kVar;
        int i14 = this.f33315a;
        long j10 = 0;
        Integer num = null;
        Object obj = this.f33316b;
        switch (i14) {
            case 0:
                ((aq) obj).f24824b.a();
                return;
            case 1:
                ((mq) obj).dismiss();
                return;
            case 2:
                ((ar) obj).a();
                return;
            case 3:
                ((org.telegram.ui.ActionBar.h3) obj).dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 4:
                rr rrVar = ((pr) obj).f29640c;
                TLRPC.Peer peer = rrVar.f30250d0;
                org.telegram.ui.ActionBar.o2 o2Var = rrVar.f30252f0;
                long j11 = rrVar.f30253g0;
                if (rrVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xr xrVar = new xr(o2Var, peer, j11, z10, rrVar.X);
                if (o2Var.getParentActivity() != null) {
                    o2Var.showDialog(xrVar);
                    return;
                } else {
                    xrVar.show();
                    return;
                }
            case 5:
                ((ei.d) obj).setLoading(true);
                return;
            case 6:
                ss ssVar = (ss) obj;
                ssVar.f30544a.a(!bVar.f17447f, true);
                AndroidUtilities.runOnUIThread(ssVar.f30547f, 3000L);
                return;
            case 7:
                ((uo0) obj).V(false);
                return;
            case 8:
                ((vt) obj).a();
                return;
            case 9:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 10:
                ((ru) obj).getClass();
                return;
            case 11:
                pf.d.r(((xu) obj).f32648a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 12:
                cv cvVar = ((bv) obj).f25154a;
                cvVar.f25431n.setVisibility(4);
                cvVar.h.setVisibility(4);
                ImageView imageView = cvVar.f25435x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 13:
                ((vv) obj).a(true, true);
                return;
            case 14:
                px pxVar = (px) obj;
                if (pxVar.Y.getEmojiView() != null) {
                    tz emojiView = pxVar.Y.getEmojiView();
                    if (!emojiView.f30975f0) {
                        try {
                            int i15 = emojiView.R.f24870s.get(EmojiData.dataColored.length);
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
            case 15:
                jy jyVar = (jy) obj;
                jyVar.f27784w.f26471f = true;
                jyVar.a(true);
                return;
            case 16:
                AndroidUtilities.updateViewShow(((gz) obj).h, true);
                return;
            case 17:
                mz mzVar = (mz) obj;
                ArrayList arrayList = mzVar.f28788r;
                ArrayList arrayList2 = mzVar.h;
                oz ozVar = mzVar.f28790w;
                int i16 = ozVar.M;
                tz tzVar = ozVar.Q;
                ax axVar = tzVar.D0;
                if (i16 == mzVar.f28784b) {
                    arrayList2.remove(arrayList);
                    ozVar.E = mzVar.f28785c;
                    ozVar.F = mzVar.d;
                    ozVar.G = mzVar.e;
                    ozVar.H = mzVar.f28786f;
                    ozVar.I = arrayList2;
                    ozVar.J = mzVar.f28787n;
                    ozVar.K = new ArrayList(arrayList);
                    tzVar.G0.e(false);
                    s4.g0 adapter = axVar.getAdapter();
                    oz ozVar2 = tzVar.f31039z0;
                    if (adapter != ozVar2) {
                        axVar.setAdapter(ozVar2);
                    }
                    ozVar.l();
                    return;
                }
                return;
            case 18:
                s00 s00Var = ((r00) obj).e;
                ArrayList arrayList3 = s00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((p00) arrayList3.get(i17)).e && i17 != 0) {
                            o00 o00Var = s00Var.I;
                            s00 s00Var2 = o00Var.d;
                            ArrayList arrayList4 = s00Var2.h;
                            SparseIntArray sparseIntArray = s00Var2.f30318k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((p00) arrayList4.get(i17)).f29374a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (p00) arrayList4.remove(i17));
                                ((p00) arrayList4.get(0)).f29374a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((p00) arrayList4.get(i21)).f29374a = i21;
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
                                    if (s00Var2.f30324q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        s00Var2.f30326r0 = i10;
                                        s00Var2.f30324q0 = i10;
                                    }
                                }
                                o00Var.p(i17, 0);
                                n00 n00Var = s00Var2.J;
                                int i23 = ((p00) arrayList4.get(i17)).f29374a;
                                org.telegram.ui.dw dwVar = (org.telegram.ui.dw) n00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.dy[] dyVarArr = dwVar.f36743b.f37059e0;
                                    if (i24 < dyVarArr.length) {
                                        org.telegram.ui.dy dyVar = dyVarArr[i24];
                                        int i25 = dyVar.h;
                                        if (i25 == i23) {
                                            dyVar.h = i19;
                                        } else if (i25 == i19) {
                                            dyVar.h = i23;
                                        }
                                        i24++;
                                    } else {
                                        s00Var2.j();
                                        s00Var2.f30336y = true;
                                        s00Var2.F.setItemAnimator(s00Var2.f30328s0);
                                    }
                                }
                            }
                            s00Var.F.u0(0);
                            org.telegram.ui.cw cwVar = (org.telegram.ui.cw) s00Var;
                            org.telegram.ui.ey eyVar = cwVar.B0;
                            if (!eyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    cwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = xc.a0(eyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.ti(cwVar, 23));
                                I.k(true);
                                eyVar.f37111o3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 19:
                z00 z00Var = (z00) obj;
                if (!z00Var.f33097c) {
                    z00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 20:
                ((i30) obj).g(true);
                return;
            case 21:
                org.telegram.ui.nx nxVar = ((qo0) ((n40) obj)).f29958e0;
                if (!nxVar.f24817u0.canScrollVertically(-1)) {
                    nxVar.f24816t0.h1(0, 0);
                    return;
                }
                return;
            case 22:
                ((p40) obj).f29412b.b(true);
                return;
            case 23:
                ((p40) obj).f29412b.b(true);
                return;
            case 24:
                g50 g50Var = (g50) obj;
                bk0 bk0Var = g50Var.f26543f;
                if (g50Var.f26544n) {
                    bk0Var.getAnimatedDrawable().K(0);
                    bk0Var.setAnimation(g50Var.f26545r);
                    bk0Var.d();
                    return;
                }
                return;
            case 25:
                n60 n60Var = (n60) ((e6.r) obj).f8400b;
                try {
                    j81 j81Var = n60Var.T;
                    if (j81Var != null && (videoEditedInfo = n60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = j81Var.n();
                        VideoEditedInfo videoEditedInfo2 = n60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            j81 j81Var2 = n60Var.T;
                            long j12 = videoEditedInfo2.startTime;
                            if (j12 > 0) {
                                j10 = j12;
                            }
                            j81Var2.K(j10);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 26:
                m60 m60Var = (m60) obj;
                si.t0 t0Var = m60Var.R;
                if (t0Var != null && t0Var.f47242a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j13 = m60Var.F0;
                    if (j13 == 0 || elapsedRealtimeNanos - j13 >= 70000000) {
                        m60Var.A();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                na0 na0Var = (na0) obj;
                if (na0Var.d) {
                    na0Var.e = true;
                    na0Var.f28928r = false;
                    na0Var.f28926f = 0.0f;
                    na0Var.h = SystemClock.uptimeMillis();
                    na0Var.invalidate();
                    return;
                }
                return;
            case 28:
                xa0 xa0Var = (xa0) obj;
                Activity parentActivity = xa0Var.getParentActivity();
                Activity parentActivity2 = xa0Var.getParentActivity();
                DispatchQueue dispatchQueue = qg.m1.f44988m;
                boolean z11 = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor edit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z11) {
                    edit.clear();
                } else {
                    edit.putBoolean("learning", true);
                }
                edit.apply();
                return;
            default:
                final jb0 jb0Var = (jb0) obj;
                boolean z12 = jb0Var.I;
                boolean z13 = !z12;
                hg.p1 p1Var = jb0Var.e;
                ib0 ib0Var = jb0Var.f27653b;
                if (ib0Var != null && p1Var != null) {
                    if (jb0Var.L && (kVar = jb0Var.K) != null && kVar.f17615f && !z12) {
                        jb0Var.O = 0;
                        return;
                    }
                    boolean g10 = jb0Var.g();
                    if (!z12) {
                        f7 = (-jb0Var.f27658s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = ib0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - p1Var.h) + jb0Var.f27658s;
                        if (computeVerticalScrollRange <= 0 && jb0Var.f27655f.K() > 0 && (i12 = jb0Var.O) < 3) {
                            jb0Var.O = i12 + 1;
                            jb0Var.o(true);
                            return;
                        }
                    }
                    jb0Var.O = 0;
                    float f11 = jb0Var.v;
                    if (g10) {
                        max = -Math.max(0.0f, f11 - f7);
                    } else {
                        max = Math.max(0.0f, f11 - f7) + (-f11);
                    }
                    if (!z12 && !g10) {
                        max += ib0Var.computeVerticalScrollOffset();
                    }
                    o1.k kVar2 = jb0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    jb0Var.L = z13;
                    final float translationY = ib0Var.getTranslationY();
                    final float f12 = jb0Var.M;
                    if (!z12) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    if (translationY == max) {
                        jb0Var.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (jb0Var.N && !z12) {
                            jb0Var.N = false;
                            ib0Var.setLayoutManager(jb0Var.getNeededLayoutManager());
                            jb0Var.I = true;
                            jb0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(max);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f17622u = lVar;
                        jb0Var.K = kVar3;
                        final float f13 = max;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f14, float f15) {
                                jb0 jb0Var2 = jb0.this;
                                jb0Var2.f27653b.setTranslationY(f14);
                                jb0Var2.i();
                                float f16 = translationY;
                                jb0Var2.M = AndroidUtilities.lerp(f12, f10, (f14 - f16) / (f13 - f16));
                            }
                        });
                        if (!z12) {
                            jb0Var.K.a(new ei.q4(jb0Var, z13, 2));
                        }
                        jb0Var.K.a(new Object());
                        jb0Var.K.h();
                    }
                    if (num != null && jb0Var.getVisibility() != num.intValue()) {
                        jb0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                jb0Var.O = 0;
                return;
        }
    }

    public zp(ru ruVar, z90 z90Var, ClickableSpan clickableSpan) {
        this.f33315a = 10;
        this.f33316b = ruVar;
    }
}
