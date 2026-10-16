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
public final class kq implements Runnable {
    public final int f26463a;
    public final Object f26464b;

    public kq(Object obj, int i10) {
        this.f26463a = i10;
        this.f26464b = obj;
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
        int i14 = this.f26463a;
        long j10 = 0;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f26464b;
        switch (i14) {
            case 0:
                ((pq) obj).dismiss();
                return;
            case 1:
                ((er) obj).a();
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
                ur urVar = ((sr) obj).f28883c;
                TLRPC.Peer peer = urVar.f29425d0;
                org.telegram.ui.ActionBar.m2 m2Var = urVar.f29427f0;
                long j11 = urVar.f29428g0;
                if (urVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                as asVar = new as(m2Var, peer, j11, z10, urVar.X);
                if (m2Var.getParentActivity() != null) {
                    m2Var.showDialog(asVar);
                    return;
                } else {
                    asVar.show();
                    return;
                }
            case 4:
                ((di.d) obj).setLoading(true);
                return;
            case 5:
                vs vsVar = (vs) obj;
                vsVar.f30302a.a(!bVar.f16004f, true);
                AndroidUtilities.runOnUIThread(vsVar.f30305f, 3000L);
                return;
            case 6:
                ((uo0) obj).V(false);
                return;
            case 7:
                ((au) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((wu) obj).getClass();
                return;
            case 10:
                pf.d.r(((cv) obj).f23899a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                hv hvVar = ((gv) obj).f25113a;
                hvVar.f25408n.setVisibility(4);
                hvVar.h.setVisibility(4);
                ImageView imageView = hvVar.f25412x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((zv) obj).a(true, true);
                return;
            case 13:
                tx txVar = (tx) obj;
                if (txVar.Y.getEmojiView() != null) {
                    wz emojiView = txVar.Y.getEmojiView();
                    if (!emojiView.f30716f0) {
                        try {
                            int i15 = emojiView.R.f24828s.get(EmojiData.dataColored.length);
                            if (i15 > 0) {
                                emojiView.P.B0();
                                emojiView.U(i15);
                                emojiView.G(i15, AndroidUtilities.dp(-9.0f));
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
                ny nyVar = (ny) obj;
                nyVar.f27443s.f26153f = true;
                nyVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((iz) obj).h, true);
                return;
            case 16:
                pz pzVar = (pz) obj;
                ArrayList arrayList = pzVar.f28138r;
                ArrayList arrayList2 = pzVar.h;
                rz rzVar = pzVar.f28140w;
                int i16 = rzVar.M;
                wz wzVar = rzVar.Q;
                ex exVar = wzVar.D0;
                if (i16 == pzVar.f28134b) {
                    arrayList2.remove(arrayList);
                    rzVar.E = pzVar.f28135c;
                    rzVar.F = pzVar.d;
                    rzVar.G = pzVar.e;
                    rzVar.H = pzVar.f28136f;
                    rzVar.I = arrayList2;
                    rzVar.J = pzVar.f28137n;
                    rzVar.K = new ArrayList(arrayList);
                    wzVar.G0.e(false);
                    s4.g0 adapter = exVar.getAdapter();
                    rz rzVar2 = wzVar.f30780z0;
                    if (adapter != rzVar2) {
                        exVar.setAdapter(rzVar2);
                    }
                    rzVar.l();
                    return;
                }
                return;
            case 17:
                w00 w00Var = ((v00) obj).e;
                ArrayList arrayList3 = w00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((s00) arrayList3.get(i17)).e && i17 != 0) {
                            r00 r00Var = w00Var.I;
                            w00 w00Var2 = r00Var.d;
                            ArrayList arrayList4 = w00Var2.h;
                            SparseIntArray sparseIntArray = w00Var2.f30375k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((s00) arrayList4.get(i17)).f28686a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (s00) arrayList4.remove(i17));
                                ((s00) arrayList4.get(0)).f28686a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((s00) arrayList4.get(i21)).f28686a = i21;
                                    dialogFilters.get(i21).order = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (w00Var2.K == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        w00Var2.L = i11;
                                        w00Var2.K = i11;
                                    }
                                    if (w00Var2.f30381q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        w00Var2.f30383r0 = i10;
                                        w00Var2.f30381q0 = i10;
                                    }
                                }
                                r00Var.p(i17, 0);
                                q00 q00Var = w00Var2.J;
                                int i23 = ((s00) arrayList4.get(i17)).f28686a;
                                org.telegram.ui.xw xwVar = (org.telegram.ui.xw) q00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.xy[] xyVarArr = xwVar.f41671b.f42004e0;
                                    if (i24 < xyVarArr.length) {
                                        org.telegram.ui.xy xyVar = xyVarArr[i24];
                                        int i25 = xyVar.h;
                                        if (i25 == i23) {
                                            xyVar.h = i19;
                                        } else if (i25 == i19) {
                                            xyVar.h = i23;
                                        }
                                        i24++;
                                    } else {
                                        w00Var2.j();
                                        w00Var2.f30393y = true;
                                        w00Var2.F.setItemAnimator(w00Var2.f30385s0);
                                    }
                                }
                            }
                            w00Var.F.u0(0);
                            org.telegram.ui.ww wwVar = (org.telegram.ui.ww) w00Var;
                            org.telegram.ui.yy yyVar = wwVar.B0;
                            if (!yyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    wwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                sc I = zc.a0(yyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.gj(wwVar, 23));
                                I.k(true);
                                yyVar.f42056o3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                d10 d10Var = (d10) obj;
                if (!d10Var.f23938c) {
                    d10Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((m30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.iy iyVar = ((qo0) ((r40) obj)).f28341c0;
                if (!iyVar.f31636u0.canScrollVertically(-1)) {
                    iyVar.f31635t0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((t40) obj).f28970b.b(true);
                return;
            case 22:
                ((t40) obj).f28970b.b(true);
                return;
            case 23:
                k50 k50Var = (k50) obj;
                bk0 bk0Var = k50Var.f26210f;
                if (k50Var.f26211n) {
                    bk0Var.getAnimatedDrawable().K(0);
                    bk0Var.setAnimation(k50Var.f26212r);
                    bk0Var.d();
                    return;
                }
                return;
            case 24:
                p60 p60Var = (p60) ((di.n2) obj).f7453b;
                try {
                    i81 i81Var = p60Var.T;
                    if (i81Var != null && (videoEditedInfo = p60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = i81Var.n();
                        VideoEditedInfo videoEditedInfo2 = p60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            i81 i81Var2 = p60Var.T;
                            long j12 = videoEditedInfo2.startTime;
                            if (j12 > 0) {
                                j10 = j12;
                            }
                            i81Var2.K(j10);
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
                o60 o60Var = (o60) obj;
                ri.q0 q0Var = o60Var.R;
                if (q0Var != null && q0Var.f44671a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j13 = o60Var.F0;
                    if (j13 == 0 || elapsedRealtimeNanos - j13 >= 70000000) {
                        o60Var.A();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                sa0 sa0Var = (sa0) obj;
                if (sa0Var.d) {
                    sa0Var.e = true;
                    sa0Var.f28793r = false;
                    sa0Var.f28791f = 0.0f;
                    sa0Var.h = SystemClock.uptimeMillis();
                    sa0Var.invalidate();
                    return;
                }
                return;
            case 27:
                cb0 cb0Var = (cb0) obj;
                Activity parentActivity = cb0Var.getParentActivity();
                Activity parentActivity2 = cb0Var.getParentActivity();
                DispatchQueue dispatchQueue = qg.k1.f43211m;
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
                final ob0 ob0Var = (ob0) obj;
                boolean z12 = ob0Var.I;
                boolean z13 = !z12;
                hg.p1 p1Var = ob0Var.e;
                nb0 nb0Var = ob0Var.f27625b;
                if (nb0Var != null && p1Var != null) {
                    if (ob0Var.L && (kVar = ob0Var.K) != null && kVar.f16154f && !z12) {
                        ob0Var.O = 0;
                        return;
                    }
                    boolean g10 = ob0Var.g();
                    if (!z12) {
                        f7 = (-ob0Var.f27630s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = nb0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - p1Var.h) + ob0Var.f27630s;
                        if (computeVerticalScrollRange <= 0 && ob0Var.f27627f.K() > 0 && (i12 = ob0Var.O) < 3) {
                            ob0Var.O = i12 + 1;
                            ob0Var.o(true);
                            return;
                        }
                    }
                    ob0Var.O = 0;
                    float f11 = ob0Var.v;
                    if (g10) {
                        max = -Math.max(0.0f, f11 - f7);
                    } else {
                        max = Math.max(0.0f, f11 - f7) + (-f11);
                    }
                    if (!z12 && !g10) {
                        max += nb0Var.computeVerticalScrollOffset();
                    }
                    final float f12 = max;
                    o1.k kVar2 = ob0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    ob0Var.L = z13;
                    final float translationY = nb0Var.getTranslationY();
                    final float f13 = ob0Var.M;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f12) {
                        ob0Var.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (ob0Var.N && !z12) {
                            ob0Var.N = false;
                            nb0Var.setLayoutManager(ob0Var.getNeededLayoutManager());
                            ob0Var.I = true;
                            ob0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f12);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f16161u = lVar;
                        ob0Var.K = kVar3;
                        final float f14 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f15, float f16) {
                                ob0 ob0Var2 = ob0.this;
                                ob0Var2.f27625b.setTranslationY(f15);
                                ob0Var2.i();
                                float f17 = translationY;
                                ob0Var2.M = AndroidUtilities.lerp(f13, f14, (f15 - f17) / (f12 - f17));
                            }
                        });
                        if (!z12) {
                            ob0Var.K.a(new di.x4(ob0Var, z13, 2));
                        }
                        ob0Var.K.a(new Object());
                        ob0Var.K.h();
                    }
                    if (num != null && ob0Var.getVisibility() != num.intValue()) {
                        ob0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                ob0Var.O = 0;
                return;
            default:
                ((cc0) obj).S.f27969n.l();
                return;
        }
    }

    public kq(wu wuVar, ea0 ea0Var, ClickableSpan clickableSpan) {
        this.f26463a = 9;
        this.f26464b = wuVar;
    }
}
