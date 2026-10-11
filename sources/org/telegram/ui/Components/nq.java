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
public final class nq implements Runnable {
    public final int f29109a;
    public final Object f29110b;

    public nq(Object obj, int i10) {
        this.f29109a = i10;
        this.f29110b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        me.b bVar;
        int i10;
        int i11;
        VideoEditedInfo videoEditedInfo;
        float f7;
        int i12;
        float max;
        final qb0 qb0Var;
        int i13;
        o1.k kVar;
        int i14 = this.f29109a;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f29110b;
        switch (i14) {
            case 0:
                ((sq) obj).dismiss();
                return;
            case 1:
                ((hr) obj).a();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.e3) obj).dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 3:
                xr xrVar = ((vr) obj).f32467c;
                TLRPC.Peer peer = xrVar.f33013d0;
                org.telegram.ui.ActionBar.m2 m2Var = xrVar.f33015f0;
                long j3 = xrVar.f33016g0;
                if (xrVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                es esVar = new es(m2Var, peer, j3, z10, xrVar.X);
                if (m2Var.getParentActivity() != null) {
                    m2Var.showDialog(esVar);
                    return;
                } else {
                    esVar.show();
                    return;
                }
            case 4:
                ((ci.d) obj).setLoading(true);
                return;
            case 5:
                zs zsVar = (zs) obj;
                zsVar.f33644a.a(!bVar.f16366f, true);
                AndroidUtilities.runOnUIThread(zsVar.f33648f, 3000L);
                return;
            case 6:
                ((ap0) obj).V(false);
                return;
            case 7:
                ((eu) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((bv) obj).getClass();
                return;
            case 10:
                of.f.s(((hv) obj).f27083a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                mv mvVar = ((lv) obj).f28461a;
                mvVar.f28868n.setVisibility(4);
                mvVar.h.setVisibility(4);
                ImageView imageView = mvVar.f28872x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((ew) obj).a(true, true);
                return;
            case 13:
                yx yxVar = (yx) obj;
                if (yxVar.Y.getEmojiView() != null) {
                    b00 emojiView = yxVar.Y.getEmojiView();
                    if (!emojiView.f24672f0) {
                        try {
                            int i15 = emojiView.R.f28110s.get(EmojiData.dataColored.length);
                            if (i15 > 0) {
                                emojiView.P.B0();
                                emojiView.U(i15);
                                emojiView.G(i15, AndroidUtilities.dp(-9.0f));
                                emojiView.o(0, null);
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
                sy syVar = (sy) obj;
                syVar.f30902s.f29551f = true;
                syVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((nz) obj).h, true);
                return;
            case 16:
                uz uzVar = (uz) obj;
                ArrayList arrayList = uzVar.f31617r;
                ArrayList arrayList2 = uzVar.h;
                wz wzVar = uzVar.f31619w;
                int i16 = wzVar.M;
                b00 b00Var = wzVar.Q;
                jx jxVar = b00Var.D0;
                if (i16 == uzVar.f31612b) {
                    arrayList2.remove(arrayList);
                    wzVar.E = uzVar.f31613c;
                    wzVar.F = uzVar.d;
                    wzVar.G = uzVar.f31614e;
                    wzVar.H = uzVar.f31615f;
                    wzVar.I = arrayList2;
                    wzVar.J = uzVar.f31616n;
                    wzVar.K = new ArrayList(arrayList);
                    b00Var.G0.e(false);
                    s4.i0 adapter = jxVar.getAdapter();
                    wz wzVar2 = b00Var.f24736z0;
                    if (adapter != wzVar2) {
                        jxVar.setAdapter(wzVar2);
                    }
                    wzVar.l();
                    return;
                }
                return;
            case 17:
                b10 b10Var = ((a10) obj).f24405e;
                ArrayList arrayList3 = b10Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((x00) arrayList3.get(i17)).f32787e && i17 != 0) {
                            w00 w00Var = b10Var.I;
                            b10 b10Var2 = w00Var.d;
                            ArrayList arrayList4 = b10Var2.h;
                            SparseIntArray sparseIntArray = b10Var2.f24759k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((x00) arrayList4.get(i17)).f32784a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (x00) arrayList4.remove(i17));
                                ((x00) arrayList4.get(0)).f32784a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((x00) arrayList4.get(i21)).f32784a = i21;
                                    dialogFilters.get(i21).order = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (b10Var2.K == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        b10Var2.L = i11;
                                        b10Var2.K = i11;
                                    }
                                    if (b10Var2.f24765q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        b10Var2.f24767r0 = i10;
                                        b10Var2.f24765q0 = i10;
                                    }
                                }
                                w00Var.p(i17, 0);
                                v00 v00Var = b10Var2.J;
                                int i23 = ((x00) arrayList4.get(i17)).f32784a;
                                org.telegram.ui.rw rwVar = (org.telegram.ui.rw) v00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.ry[] ryVarArr = rwVar.f41520b.f41907e0;
                                    if (i24 < ryVarArr.length) {
                                        org.telegram.ui.ry ryVar = ryVarArr[i24];
                                        int i25 = ryVar.h;
                                        if (i25 == i23) {
                                            ryVar.h = i19;
                                        } else if (i25 == i19) {
                                            ryVar.h = i23;
                                        }
                                        i24++;
                                    } else {
                                        b10Var2.j();
                                        b10Var2.f24777y = true;
                                        b10Var2.F.setItemAnimator(b10Var2.f24769s0);
                                    }
                                }
                            }
                            b10Var.F.u0(0);
                            org.telegram.ui.qw qwVar = (org.telegram.ui.qw) b10Var;
                            org.telegram.ui.sy syVar2 = qwVar.B0;
                            if (!syVar2.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    qwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                sc I = ad.a0(syVar2).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.cj(qwVar, 23));
                                I.k(true);
                                syVar2.f41953n3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                i10 i10Var = (i10) obj;
                if (!i10Var.f27130c) {
                    i10Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((r30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.cy cyVar = ((wo0) ((w40) obj)).f32698c0;
                if (!cyVar.f26455u0.canScrollVertically(-1)) {
                    cyVar.f26454t0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((y40) obj).f33088b.b(true);
                return;
            case 22:
                ((y40) obj).f33088b.b(true);
                return;
            case 23:
                p50 p50Var = (p50) obj;
                hk0 hk0Var = p50Var.f29615f;
                if (p50Var.f29616n) {
                    hk0Var.getAnimatedDrawable().K(0);
                    hk0Var.setAnimation(p50Var.f29617r);
                    hk0Var.d();
                    return;
                }
                return;
            case 24:
                u60 u60Var = (u60) ((ci.n2) obj).f5630b;
                try {
                    m81 m81Var = u60Var.T;
                    if (m81Var != null && (videoEditedInfo = u60Var.S) != null) {
                        long j10 = 0;
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = m81Var.n();
                            VideoEditedInfo videoEditedInfo2 = u60Var.S;
                            if (n10 >= videoEditedInfo2.endTime) {
                                m81 m81Var2 = u60Var.T;
                                long j11 = videoEditedInfo2.startTime;
                                if (j11 > 0) {
                                    j10 = j11;
                                }
                                m81Var2.K(j10);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 25:
                ua0 ua0Var = (ua0) obj;
                if (ua0Var.d) {
                    ua0Var.f31369e = true;
                    ua0Var.f31372r = false;
                    ua0Var.f31370f = 0.0f;
                    ua0Var.h = SystemClock.uptimeMillis();
                    ua0Var.invalidate();
                    return;
                }
                return;
            case 26:
                eb0 eb0Var = (eb0) obj;
                Activity parentActivity = eb0Var.getParentActivity();
                Activity parentActivity2 = eb0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.m1.f45726m;
                boolean z11 = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor edit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z11) {
                    edit.clear();
                } else {
                    edit.putBoolean("learning", true);
                }
                edit.apply();
                return;
            case 27:
                qb0 qb0Var2 = (qb0) obj;
                boolean z12 = qb0Var2.I;
                boolean z13 = !z12;
                gg.p1 p1Var = qb0Var2.f30115e;
                pb0 pb0Var = qb0Var2.f30113b;
                if (pb0Var != null && p1Var != null) {
                    if (qb0Var2.L && (kVar = qb0Var2.K) != null && kVar.f16981f && !z12) {
                        qb0Var2.O = 0;
                        return;
                    }
                    boolean g10 = qb0Var2.g();
                    if (!z12) {
                        f7 = (-qb0Var2.f30119s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = pb0Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - p1Var.h) + qb0Var2.f30119s;
                        if (computeVerticalScrollRange <= 0 && qb0Var2.f30116f.K() > 0 && (i12 = qb0Var2.O) < 3) {
                            qb0Var2.O = i12 + 1;
                            qb0Var2.o(true);
                            return;
                        }
                        f7 = f11;
                    }
                    qb0Var2.O = 0;
                    float f12 = qb0Var2.v;
                    if (g10) {
                        max = -Math.max(0.0f, f12 - f7);
                    } else {
                        max = Math.max(0.0f, f12 - f7) + (-f12);
                    }
                    if (!z12 && !g10) {
                        max += pb0Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    o1.k kVar2 = qb0Var2.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    qb0Var2.L = z13;
                    final float translationY = pb0Var.getTranslationY();
                    final float f14 = qb0Var2.M;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f13) {
                        qb0Var2.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (qb0Var2.N && !z12) {
                            qb0Var2.N = false;
                            pb0Var.setLayoutManager(qb0Var2.getNeededLayoutManager());
                            qb0Var2.I = true;
                            qb0Var2.o(true);
                        }
                        qb0Var = qb0Var2;
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f13);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f16988u = lVar;
                        qb0Var2.K = kVar3;
                        qb0Var = qb0Var2;
                        final float f15 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f16, float f17) {
                                qb0 qb0Var3 = qb0.this;
                                qb0Var3.f30113b.setTranslationY(f16);
                                qb0Var3.i();
                                float f18 = translationY;
                                qb0Var3.M = AndroidUtilities.lerp(f14, f15, (f16 - f18) / (f13 - f18));
                            }
                        });
                        if (!z12) {
                            qb0Var.K.a(new ci.x4(qb0Var, z13, 2));
                        }
                        qb0Var.K.a(new Object());
                        qb0Var.K.h();
                    }
                    if (num != null && qb0Var.getVisibility() != num.intValue()) {
                        qb0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                qb0Var2.O = 0;
                return;
            case 28:
                ((ec0) obj).S.f30135n.l();
                return;
            default:
                ((ad0) obj).a();
                return;
        }
    }

    public nq(bv bvVar, ga0 ga0Var, ClickableSpan clickableSpan) {
        this.f29109a = 9;
        this.f29110b = bvVar;
    }
}
