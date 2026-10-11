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
    public final int f29215a;
    public final Object f29216b;

    public nq(Object obj, int i10) {
        this.f29215a = i10;
        this.f29216b = obj;
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
        int i14 = this.f29215a;
        long j3 = 0;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f29216b;
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
                xr xrVar = ((vr) obj).f32528c;
                TLRPC.Peer peer = xrVar.f33055d0;
                org.telegram.ui.ActionBar.m2 m2Var = xrVar.f33057f0;
                long j10 = xrVar.f33058g0;
                if (xrVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                es esVar = new es(m2Var, peer, j10, z10, xrVar.X);
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
                zsVar.f33684a.a(!bVar.f16402f, true);
                AndroidUtilities.runOnUIThread(zsVar.f33688f, 3000L);
                return;
            case 6:
                ((zo0) obj).V(false);
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
                of.f.s(((hv) obj).f27242a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                mv mvVar = ((lv) obj).f28623a;
                mvVar.f28946n.setVisibility(4);
                mvVar.h.setVisibility(4);
                ImageView imageView = mvVar.f28950x;
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
                    if (!emojiView.f24741f0) {
                        try {
                            int i15 = emojiView.R.f28154s.get(EmojiData.dataColored.length);
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
                syVar.f30973s.f29654f = true;
                syVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((nz) obj).h, true);
                return;
            case 16:
                uz uzVar = (uz) obj;
                ArrayList arrayList = uzVar.f31757r;
                ArrayList arrayList2 = uzVar.h;
                wz wzVar = uzVar.f31759w;
                int i16 = wzVar.M;
                b00 b00Var = wzVar.Q;
                jx jxVar = b00Var.D0;
                if (i16 == uzVar.f31752b) {
                    arrayList2.remove(arrayList);
                    wzVar.E = uzVar.f31753c;
                    wzVar.F = uzVar.d;
                    wzVar.G = uzVar.f31754e;
                    wzVar.H = uzVar.f31755f;
                    wzVar.I = arrayList2;
                    wzVar.J = uzVar.f31756n;
                    wzVar.K = new ArrayList(arrayList);
                    b00Var.G0.e(false);
                    s4.i0 adapter = jxVar.getAdapter();
                    wz wzVar2 = b00Var.f24805z0;
                    if (adapter != wzVar2) {
                        jxVar.setAdapter(wzVar2);
                    }
                    wzVar.l();
                    return;
                }
                return;
            case 17:
                b10 b10Var = ((a10) obj).f24444e;
                ArrayList arrayList3 = b10Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((x00) arrayList3.get(i17)).f32827e && i17 != 0) {
                            w00 w00Var = b10Var.I;
                            b10 b10Var2 = w00Var.d;
                            ArrayList arrayList4 = b10Var2.h;
                            SparseIntArray sparseIntArray = b10Var2.f24827k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((x00) arrayList4.get(i17)).f32824a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (x00) arrayList4.remove(i17));
                                ((x00) arrayList4.get(0)).f32824a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((x00) arrayList4.get(i21)).f32824a = i21;
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
                                    if (b10Var2.f24833q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        b10Var2.f24835r0 = i10;
                                        b10Var2.f24833q0 = i10;
                                    }
                                }
                                w00Var.p(i17, 0);
                                v00 v00Var = b10Var2.J;
                                int i23 = ((x00) arrayList4.get(i17)).f32824a;
                                org.telegram.ui.rw rwVar = (org.telegram.ui.rw) v00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.ry[] ryVarArr = rwVar.f41554b.f41941e0;
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
                                        b10Var2.f24845y = true;
                                        b10Var2.F.setItemAnimator(b10Var2.f24837s0);
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
                                syVar2.f41987n3 = I;
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
                if (!i10Var.f27288c) {
                    i10Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((r30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.cy cyVar = ((vo0) ((w40) obj)).f31941c0;
                if (!cyVar.f26183u0.canScrollVertically(-1)) {
                    cyVar.f26182t0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((y40) obj).f33143b.b(true);
                return;
            case 22:
                ((y40) obj).f33143b.b(true);
                return;
            case 23:
                p50 p50Var = (p50) obj;
                gk0 gk0Var = p50Var.f29730f;
                if (p50Var.f29731n) {
                    gk0Var.getAnimatedDrawable().K(0);
                    gk0Var.setAnimation(p50Var.f29732r);
                    gk0Var.d();
                    return;
                }
                return;
            case 24:
                t60 t60Var = (t60) ((ci.n2) obj).f5630b;
                try {
                    l81 l81Var = t60Var.T;
                    if (l81Var != null && (videoEditedInfo = t60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = l81Var.n();
                        VideoEditedInfo videoEditedInfo2 = t60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            l81 l81Var2 = t60Var.T;
                            long j11 = videoEditedInfo2.startTime;
                            if (j11 > 0) {
                                j3 = j11;
                            }
                            l81Var2.K(j3);
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
                s60 s60Var = (s60) obj;
                ki.u0 u0Var = s60Var.R;
                if (u0Var != null && u0Var.f15150a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j12 = s60Var.F0;
                    if (j12 == 0 || elapsedRealtimeNanos - j12 >= 70000000) {
                        s60Var.A();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ta0 ta0Var = (ta0) obj;
                if (ta0Var.d) {
                    ta0Var.f31195e = true;
                    ta0Var.f31198r = false;
                    ta0Var.f31196f = 0.0f;
                    ta0Var.h = SystemClock.uptimeMillis();
                    ta0Var.invalidate();
                    return;
                }
                return;
            case 27:
                db0 db0Var = (db0) obj;
                Activity parentActivity = db0Var.getParentActivity();
                Activity parentActivity2 = db0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.m1.f45760m;
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
                final pb0 pb0Var = (pb0) obj;
                boolean z12 = pb0Var.I;
                boolean z13 = !z12;
                gg.p1 p1Var = pb0Var.f29831e;
                ob0 ob0Var = pb0Var.f29829b;
                if (ob0Var != null && p1Var != null) {
                    if (pb0Var.L && (kVar = pb0Var.K) != null && kVar.f17017f && !z12) {
                        pb0Var.O = 0;
                        return;
                    }
                    boolean g10 = pb0Var.g();
                    if (!z12) {
                        f7 = (-pb0Var.f29835s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = ob0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - p1Var.h) + pb0Var.f29835s;
                        if (computeVerticalScrollRange <= 0 && pb0Var.f29832f.K() > 0 && (i12 = pb0Var.O) < 3) {
                            pb0Var.O = i12 + 1;
                            pb0Var.o(true);
                            return;
                        }
                    }
                    pb0Var.O = 0;
                    float f11 = pb0Var.v;
                    if (g10) {
                        max = -Math.max(0.0f, f11 - f7);
                    } else {
                        max = Math.max(0.0f, f11 - f7) + (-f11);
                    }
                    if (!z12 && !g10) {
                        max += ob0Var.computeVerticalScrollOffset();
                    }
                    final float f12 = max;
                    o1.k kVar2 = pb0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    pb0Var.L = z13;
                    final float translationY = ob0Var.getTranslationY();
                    final float f13 = pb0Var.M;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f12) {
                        pb0Var.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (pb0Var.N && !z12) {
                            pb0Var.N = false;
                            ob0Var.setLayoutManager(pb0Var.getNeededLayoutManager());
                            pb0Var.I = true;
                            pb0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f12);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f17024u = lVar;
                        pb0Var.K = kVar3;
                        final float f14 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f15, float f16) {
                                pb0 pb0Var2 = pb0.this;
                                pb0Var2.f29829b.setTranslationY(f15);
                                pb0Var2.i();
                                float f17 = translationY;
                                pb0Var2.M = AndroidUtilities.lerp(f13, f14, (f15 - f17) / (f12 - f17));
                            }
                        });
                        if (!z12) {
                            pb0Var.K.a(new ci.x4(pb0Var, z13, 2));
                        }
                        pb0Var.K.a(new Object());
                        pb0Var.K.h();
                    }
                    if (num != null && pb0Var.getVisibility() != num.intValue()) {
                        pb0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                pb0Var.O = 0;
                return;
            default:
                ((dc0) obj).S.f29851n.l();
                return;
        }
    }

    public nq(bv bvVar, fa0 fa0Var, ClickableSpan clickableSpan) {
        this.f29215a = 9;
        this.f29216b = bvVar;
    }
}
