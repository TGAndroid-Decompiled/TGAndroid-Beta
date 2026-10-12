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
public final class pq implements Runnable {
    public final int f29562a;
    public final Object f29563b;

    public pq(Object obj, int i10) {
        this.f29562a = i10;
        this.f29563b = obj;
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
        int i13;
        o1.k kVar;
        int i14 = this.f29562a;
        long j3 = 0;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f29563b;
        switch (i14) {
            case 0:
                ((uq) obj).dismiss();
                return;
            case 1:
                ((jr) obj).a();
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
                zr zrVar = ((xr) obj).f32833c;
                TLRPC.Peer peer = zrVar.f33480d0;
                org.telegram.ui.ActionBar.m2 m2Var = zrVar.f33482f0;
                long j10 = zrVar.f33483g0;
                if (zrVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fs fsVar = new fs(m2Var, peer, j10, z10, zrVar.X);
                if (m2Var.getParentActivity() != null) {
                    m2Var.showDialog(fsVar);
                    return;
                } else {
                    fsVar.show();
                    return;
                }
            case 4:
                ((ci.d) obj).setLoading(true);
                return;
            case 5:
                at atVar = (at) obj;
                atVar.f24472a.a(!bVar.f16088f, true);
                AndroidUtilities.runOnUIThread(atVar.f24476f, 3000L);
                return;
            case 6:
                ((ep0) obj).V(false);
                return;
            case 7:
                ((fu) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((dv) obj).getClass();
                return;
            case 10:
                of.f.s(((jv) obj).f27653a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                ov ovVar = ((nv) obj).f28969a;
                ovVar.f29300n.setVisibility(4);
                ovVar.h.setVisibility(4);
                ImageView imageView = ovVar.f29304x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((gw) obj).a(true, true);
                return;
            case 13:
                ay ayVar = (ay) obj;
                if (ayVar.Y.getEmojiView() != null) {
                    d00 emojiView = ayVar.Y.getEmojiView();
                    if (!emojiView.f25090f0) {
                        try {
                            int i15 = emojiView.R.f28681s.get(EmojiData.dataColored.length);
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
                uy uyVar = (uy) obj;
                uyVar.f31286s.f29950f = true;
                uyVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((pz) obj).h, true);
                return;
            case 16:
                wz wzVar = (wz) obj;
                ArrayList arrayList = wzVar.f32588r;
                ArrayList arrayList2 = wzVar.h;
                yz yzVar = wzVar.f32590w;
                int i16 = yzVar.M;
                d00 d00Var = yzVar.Q;
                lx lxVar = d00Var.D0;
                if (i16 == wzVar.f32583b) {
                    arrayList2.remove(arrayList);
                    yzVar.E = wzVar.f32584c;
                    yzVar.F = wzVar.d;
                    yzVar.G = wzVar.f32585e;
                    yzVar.H = wzVar.f32586f;
                    yzVar.I = arrayList2;
                    yzVar.J = wzVar.f32587n;
                    yzVar.K = new ArrayList(arrayList);
                    d00Var.G0.e(false);
                    s4.i0 adapter = lxVar.getAdapter();
                    yz yzVar2 = d00Var.f25154z0;
                    if (adapter != yzVar2) {
                        lxVar.setAdapter(yzVar2);
                    }
                    yzVar.l();
                    return;
                }
                return;
            case 17:
                d10 d10Var = ((c10) obj).f24791e;
                ArrayList arrayList3 = d10Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((z00) arrayList3.get(i17)).f33237e && i17 != 0) {
                            y00 y00Var = d10Var.I;
                            d10 d10Var2 = y00Var.d;
                            ArrayList arrayList4 = d10Var2.h;
                            SparseIntArray sparseIntArray = d10Var2.f25178k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((z00) arrayList4.get(i17)).f33234a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (z00) arrayList4.remove(i17));
                                ((z00) arrayList4.get(0)).f33234a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((z00) arrayList4.get(i21)).f33234a = i21;
                                    dialogFilters.get(i21).order = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (d10Var2.K == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        d10Var2.L = i11;
                                        d10Var2.K = i11;
                                    }
                                    if (d10Var2.f25184q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        d10Var2.f25186r0 = i10;
                                        d10Var2.f25184q0 = i10;
                                    }
                                }
                                y00Var.p(i17, 0);
                                x00 x00Var = d10Var2.J;
                                int i23 = ((z00) arrayList4.get(i17)).f33234a;
                                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) x00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.uy[] uyVarArr = uwVar.f42601b.f42903e0;
                                    if (i24 < uyVarArr.length) {
                                        org.telegram.ui.uy uyVar2 = uyVarArr[i24];
                                        int i25 = uyVar2.h;
                                        if (i25 == i23) {
                                            uyVar2.h = i19;
                                        } else if (i25 == i19) {
                                            uyVar2.h = i23;
                                        }
                                        i24++;
                                    } else {
                                        d10Var2.j();
                                        d10Var2.f25196y = true;
                                        d10Var2.F.setItemAnimator(d10Var2.f25188s0);
                                    }
                                }
                            }
                            d10Var.F.u0(0);
                            org.telegram.ui.sw swVar = (org.telegram.ui.sw) d10Var;
                            org.telegram.ui.vy vyVar = swVar.B0;
                            if (!vyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    swVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                sc I = zc.a0(vyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.gj(swVar, 23));
                                I.k(true);
                                vyVar.f42949n3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                k10 k10Var = (k10) obj;
                if (!k10Var.f27716c) {
                    k10Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((t30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.fy fyVar = ((ap0) ((y40) obj)).f24456c0;
                if (!fyVar.f27609u0.canScrollVertically(-1)) {
                    fyVar.f27608t0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((a50) obj).f24236b.b(true);
                return;
            case 22:
                ((a50) obj).f24236b.b(true);
                return;
            case 23:
                r50 r50Var = (r50) obj;
                ik0 ik0Var = r50Var.f30037f;
                if (r50Var.f30038n) {
                    ik0Var.getAnimatedDrawable().K(0);
                    ik0Var.setAnimation(r50Var.f30039r);
                    ik0Var.d();
                    return;
                }
                return;
            case 24:
                w60 w60Var = (w60) ((ci.n2) obj).f5629b;
                try {
                    q81 q81Var = w60Var.T;
                    if (q81Var != null && (videoEditedInfo = w60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = q81Var.n();
                        VideoEditedInfo videoEditedInfo2 = w60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            q81 q81Var2 = w60Var.T;
                            long j11 = videoEditedInfo2.startTime;
                            if (j11 > 0) {
                                j3 = j11;
                            }
                            q81Var2.K(j3);
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
                v60 v60Var = (v60) obj;
                qi.o0 o0Var = v60Var.R;
                if (o0Var != null && o0Var.f46809a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j12 = v60Var.F0;
                    if (j12 == 0 || elapsedRealtimeNanos - j12 >= 70000000) {
                        v60Var.A();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                xa0 xa0Var = (xa0) obj;
                if (xa0Var.d) {
                    xa0Var.f32700e = true;
                    xa0Var.f32703r = false;
                    xa0Var.f32701f = 0.0f;
                    xa0Var.h = SystemClock.uptimeMillis();
                    xa0Var.invalidate();
                    return;
                }
                return;
            case 27:
                hb0 hb0Var = (hb0) obj;
                Activity parentActivity = hb0Var.getParentActivity();
                Activity parentActivity2 = hb0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.l1.f45570m;
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
                final tb0 tb0Var = (tb0) obj;
                boolean z12 = tb0Var.I;
                boolean z13 = !z12;
                gg.p1 p1Var = tb0Var.f30841e;
                sb0 sb0Var = tb0Var.f30839b;
                if (sb0Var != null && p1Var != null) {
                    if (tb0Var.L && (kVar = tb0Var.K) != null && kVar.f16683f && !z12) {
                        tb0Var.O = 0;
                        return;
                    }
                    boolean g10 = tb0Var.g();
                    if (!z12) {
                        f7 = (-tb0Var.f30845s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = sb0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - p1Var.h) + tb0Var.f30845s;
                        if (computeVerticalScrollRange <= 0 && tb0Var.f30842f.K() > 0 && (i12 = tb0Var.O) < 3) {
                            tb0Var.O = i12 + 1;
                            tb0Var.o(true);
                            return;
                        }
                    }
                    tb0Var.O = 0;
                    float f11 = tb0Var.v;
                    if (g10) {
                        max = -Math.max(0.0f, f11 - f7);
                    } else {
                        max = Math.max(0.0f, f11 - f7) + (-f11);
                    }
                    if (!z12 && !g10) {
                        max += sb0Var.computeVerticalScrollOffset();
                    }
                    final float f12 = max;
                    o1.k kVar2 = tb0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    tb0Var.L = z13;
                    final float translationY = sb0Var.getTranslationY();
                    final float f13 = tb0Var.M;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f12) {
                        tb0Var.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (tb0Var.N && !z12) {
                            tb0Var.N = false;
                            sb0Var.setLayoutManager(tb0Var.getNeededLayoutManager());
                            tb0Var.I = true;
                            tb0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f12);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f16690u = lVar;
                        tb0Var.K = kVar3;
                        final float f14 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f15, float f16) {
                                tb0 tb0Var2 = tb0.this;
                                tb0Var2.f30839b.setTranslationY(f15);
                                tb0Var2.i();
                                float f17 = translationY;
                                tb0Var2.M = AndroidUtilities.lerp(f13, f14, (f15 - f17) / (f12 - f17));
                            }
                        });
                        if (!z12) {
                            tb0Var.K.a(new ci.x4(tb0Var, z13, 2));
                        }
                        tb0Var.K.a(new Object());
                        tb0Var.K.h();
                    }
                    if (num != null && tb0Var.getVisibility() != num.intValue()) {
                        tb0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                tb0Var.O = 0;
                return;
            default:
                ((hc0) obj).S.f30859n.l();
                return;
        }
    }

    public pq(dv dvVar, ja0 ja0Var, ClickableSpan clickableSpan) {
        this.f29562a = 9;
        this.f29563b = dvVar;
    }
}
