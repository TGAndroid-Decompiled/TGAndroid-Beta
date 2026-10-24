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
public final class xp implements Runnable {
    public final int f32679a;
    public final Object f32680b;

    public xp(Object obj, int i10) {
        this.f32679a = i10;
        this.f32680b = obj;
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
        int i14 = this.f32679a;
        long j10 = 0;
        Integer num = null;
        Object obj = this.f32680b;
        switch (i14) {
            case 0:
                ((yp) obj).f33019b.a();
                return;
            case 1:
                ((kq) obj).dismiss();
                return;
            case 2:
                ((yq) obj).a();
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
                pr prVar = ((nr) obj).f28998c;
                TLRPC.Peer peer = prVar.f29645d0;
                org.telegram.ui.ActionBar.o2 o2Var = prVar.f29647f0;
                long j11 = prVar.f29648g0;
                if (prVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vr vrVar = new vr(o2Var, peer, j11, z10, prVar.X);
                if (o2Var.getParentActivity() != null) {
                    o2Var.showDialog(vrVar);
                    return;
                } else {
                    vrVar.show();
                    return;
                }
            case 5:
                ((ei.d) obj).setLoading(true);
                return;
            case 6:
                qs qsVar = (qs) obj;
                qsVar.f29984a.a(!bVar.f17447f, true);
                AndroidUtilities.runOnUIThread(qsVar.f29987f, 3000L);
                return;
            case 7:
                ((to0) obj).V(false);
                return;
            case 8:
                ((tt) obj).a();
                return;
            case 9:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 10:
                ((pu) obj).getClass();
                return;
            case 11:
                pf.d.r(((vu) obj).f32048a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 12:
                av avVar = ((zu) obj).f33356a;
                avVar.f24813n.setVisibility(4);
                avVar.h.setVisibility(4);
                ImageView imageView = avVar.f24817x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 13:
                ((tv) obj).a(true, true);
                return;
            case 14:
                nx nxVar = (nx) obj;
                if (nxVar.Y.getEmojiView() != null) {
                    rz emojiView = nxVar.Y.getEmojiView();
                    if (!emojiView.f30319f0) {
                        try {
                            int i15 = emojiView.R.f33074s.get(EmojiData.dataColored.length);
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
                hy hyVar = (hy) obj;
                hyVar.f27201w.f25858f = true;
                hyVar.a(true);
                return;
            case 16:
                AndroidUtilities.updateViewShow(((ez) obj).h, true);
                return;
            case 17:
                kz kzVar = (kz) obj;
                ArrayList arrayList = kzVar.f28102r;
                ArrayList arrayList2 = kzVar.h;
                mz mzVar = kzVar.f28104w;
                int i16 = mzVar.M;
                rz rzVar = mzVar.Q;
                yw ywVar = rzVar.D0;
                if (i16 == kzVar.f28098b) {
                    arrayList2.remove(arrayList);
                    mzVar.E = kzVar.f28099c;
                    mzVar.F = kzVar.d;
                    mzVar.G = kzVar.e;
                    mzVar.H = kzVar.f28100f;
                    mzVar.I = arrayList2;
                    mzVar.J = kzVar.f28101n;
                    mzVar.K = new ArrayList(arrayList);
                    rzVar.G0.e(false);
                    s4.g0 adapter = ywVar.getAdapter();
                    mz mzVar2 = rzVar.f30383z0;
                    if (adapter != mzVar2) {
                        ywVar.setAdapter(mzVar2);
                    }
                    mzVar.l();
                    return;
                }
                return;
            case 18:
                q00 q00Var = ((p00) obj).e;
                ArrayList arrayList3 = q00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((n00) arrayList3.get(i17)).e && i17 != 0) {
                            m00 m00Var = q00Var.I;
                            q00 q00Var2 = m00Var.d;
                            ArrayList arrayList4 = q00Var2.h;
                            SparseIntArray sparseIntArray = q00Var2.f29719k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((n00) arrayList4.get(i17)).f28740a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (n00) arrayList4.remove(i17));
                                ((n00) arrayList4.get(0)).f28740a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((n00) arrayList4.get(i21)).f28740a = i21;
                                    dialogFilters.get(i21).order = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (q00Var2.K == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        q00Var2.L = i11;
                                        q00Var2.K = i11;
                                    }
                                    if (q00Var2.f29725q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        q00Var2.f29727r0 = i10;
                                        q00Var2.f29725q0 = i10;
                                    }
                                }
                                m00Var.p(i17, 0);
                                l00 l00Var = q00Var2.J;
                                int i23 = ((n00) arrayList4.get(i17)).f28740a;
                                org.telegram.ui.dw dwVar = (org.telegram.ui.dw) l00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.dy[] dyVarArr = dwVar.f36730b.f37034e0;
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
                                        q00Var2.j();
                                        q00Var2.f29737y = true;
                                        q00Var2.F.setItemAnimator(q00Var2.f29729s0);
                                    }
                                }
                            }
                            q00Var.F.u0(0);
                            org.telegram.ui.cw cwVar = (org.telegram.ui.cw) q00Var;
                            org.telegram.ui.ey eyVar = cwVar.B0;
                            if (!eyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    cwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                oc I = vc.a0(eyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.ti(cwVar, 23));
                                I.k(true);
                                eyVar.f37086o3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 19:
                x00 x00Var = (x00) obj;
                if (!x00Var.f32468c) {
                    x00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 20:
                ((g30) obj).g(true);
                return;
            case 21:
                org.telegram.ui.nx nxVar2 = ((po0) ((l40) obj)).f29634e0;
                if (!nxVar2.f33321u0.canScrollVertically(-1)) {
                    nxVar2.f33320t0.h1(0, 0);
                    return;
                }
                return;
            case 22:
                ((n40) obj).f28778b.b(true);
                return;
            case 23:
                ((n40) obj).f28778b.b(true);
                return;
            case 24:
                e50 e50Var = (e50) obj;
                ak0 ak0Var = e50Var.f25960f;
                if (e50Var.f25961n) {
                    ak0Var.getAnimatedDrawable().K(0);
                    ak0Var.setAnimation(e50Var.f25962r);
                    ak0Var.d();
                    return;
                }
                return;
            case 25:
                l60 l60Var = (l60) ((e6.r) obj).f8400b;
                try {
                    j81 j81Var = l60Var.T;
                    if (j81Var != null && (videoEditedInfo = l60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = j81Var.n();
                        VideoEditedInfo videoEditedInfo2 = l60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            j81 j81Var2 = l60Var.T;
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
                k60 k60Var = (k60) obj;
                si.t0 t0Var = k60Var.R;
                if (t0Var != null && t0Var.f47241a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j13 = k60Var.F0;
                    if (j13 == 0 || elapsedRealtimeNanos - j13 >= 70000000) {
                        k60Var.A();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                la0 la0Var = (la0) obj;
                if (la0Var.d) {
                    la0Var.e = true;
                    la0Var.f28313r = false;
                    la0Var.f28311f = 0.0f;
                    la0Var.h = SystemClock.uptimeMillis();
                    la0Var.invalidate();
                    return;
                }
                return;
            case 28:
                va0 va0Var = (va0) obj;
                Activity parentActivity = va0Var.getParentActivity();
                Activity parentActivity2 = va0Var.getParentActivity();
                DispatchQueue dispatchQueue = qg.m1.f44987m;
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
                final hb0 hb0Var = (hb0) obj;
                boolean z12 = hb0Var.I;
                boolean z13 = !z12;
                hg.p1 p1Var = hb0Var.e;
                gb0 gb0Var = hb0Var.f26993b;
                if (gb0Var != null && p1Var != null) {
                    if (hb0Var.L && (kVar = hb0Var.K) != null && kVar.f17615f && !z12) {
                        hb0Var.O = 0;
                        return;
                    }
                    boolean g10 = hb0Var.g();
                    if (!z12) {
                        f7 = (-hb0Var.f26998s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = gb0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - p1Var.h) + hb0Var.f26998s;
                        if (computeVerticalScrollRange <= 0 && hb0Var.f26995f.K() > 0 && (i12 = hb0Var.O) < 3) {
                            hb0Var.O = i12 + 1;
                            hb0Var.o(true);
                            return;
                        }
                    }
                    hb0Var.O = 0;
                    float f11 = hb0Var.v;
                    if (g10) {
                        max = -Math.max(0.0f, f11 - f7);
                    } else {
                        max = Math.max(0.0f, f11 - f7) + (-f11);
                    }
                    if (!z12 && !g10) {
                        max += gb0Var.computeVerticalScrollOffset();
                    }
                    o1.k kVar2 = hb0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    hb0Var.L = z13;
                    final float translationY = gb0Var.getTranslationY();
                    final float f12 = hb0Var.M;
                    if (!z12) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    if (translationY == max) {
                        hb0Var.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (hb0Var.N && !z12) {
                            hb0Var.N = false;
                            gb0Var.setLayoutManager(hb0Var.getNeededLayoutManager());
                            hb0Var.I = true;
                            hb0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(max);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f17622u = lVar;
                        hb0Var.K = kVar3;
                        final float f13 = max;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f14, float f15) {
                                hb0 hb0Var2 = hb0.this;
                                hb0Var2.f26993b.setTranslationY(f14);
                                hb0Var2.i();
                                float f16 = translationY;
                                hb0Var2.M = AndroidUtilities.lerp(f12, f10, (f14 - f16) / (f13 - f16));
                            }
                        });
                        if (!z12) {
                            hb0Var.K.a(new ei.q4(hb0Var, z13, 2));
                        }
                        hb0Var.K.a(new Object());
                        hb0Var.K.h();
                    }
                    if (num != null && hb0Var.getVisibility() != num.intValue()) {
                        hb0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                hb0Var.O = 0;
                return;
        }
    }

    public xp(pu puVar, x90 x90Var, ClickableSpan clickableSpan) {
        this.f32679a = 10;
        this.f32680b = puVar;
    }
}
