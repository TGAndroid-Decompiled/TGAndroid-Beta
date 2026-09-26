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
    public final int f30935a;
    public final Object f30936b;

    public zp(Object obj, int i10) {
        this.f30935a = i10;
        this.f30936b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        le.c cVar;
        int i10;
        int i11;
        VideoEditedInfo videoEditedInfo;
        float f7;
        int i12;
        float max;
        int i13;
        o1.k kVar;
        int i14 = this.f30935a;
        long j3 = 0;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f30936b;
        switch (i14) {
            case 0:
                ((eq) obj).dismiss();
                return;
            case 1:
                ((tq) obj).a();
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
                ir irVar = ((gr) obj).f24573c;
                TLRPC.Peer peer = irVar.f25177d0;
                org.telegram.ui.ActionBar.m2 m2Var = irVar.f25179f0;
                long j10 = irVar.f25180g0;
                if (irVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                or orVar = new or(m2Var, peer, j10, z10, irVar.X);
                if (m2Var.getParentActivity() != null) {
                    m2Var.showDialog(orVar);
                    return;
                } else {
                    orVar.show();
                    return;
                }
            case 4:
                ((ci.d) obj).setLoading(true);
                return;
            case 5:
                ks ksVar = (ks) obj;
                ksVar.f25784a.a(!cVar.f14201f, true);
                AndroidUtilities.runOnUIThread(ksVar.f25787f, 3000L);
                return;
            case 6:
                ((ho0) obj).V(false);
                return;
            case 7:
                ((pt) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((mu) obj).getClass();
                return;
            case 10:
                nf.f.s(((su) obj).f28359a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                xu xuVar = ((wu) obj).f30202a;
                xuVar.f30471n.setVisibility(4);
                xuVar.h.setVisibility(4);
                ImageView imageView = xuVar.f30475x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((pv) obj).a(true, true);
                return;
            case 13:
                kx kxVar = (kx) obj;
                if (kxVar.Y.getEmojiView() != null) {
                    mz emojiView = kxVar.Y.getEmojiView();
                    if (!emojiView.f26557f0) {
                        try {
                            int i15 = emojiView.R.f29782s.get(EmojiData.dataColored.length);
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
                ey eyVar = (ey) obj;
                eyVar.f24081s.f30994f = true;
                eyVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((zy) obj).h, true);
                return;
            case 16:
                fz fzVar = (fz) obj;
                ArrayList arrayList = fzVar.f24340r;
                ArrayList arrayList2 = fzVar.h;
                hz hzVar = fzVar.f24342w;
                int i16 = hzVar.M;
                mz mzVar = hzVar.Q;
                uw uwVar = mzVar.D0;
                if (i16 == fzVar.f24336b) {
                    arrayList2.remove(arrayList);
                    hzVar.E = fzVar.f24337c;
                    hzVar.F = fzVar.d;
                    hzVar.G = fzVar.e;
                    hzVar.H = fzVar.f24338f;
                    hzVar.I = arrayList2;
                    hzVar.J = fzVar.f24339n;
                    hzVar.K = new ArrayList(arrayList);
                    mzVar.G0.e(false);
                    s4.h0 adapter = uwVar.getAdapter();
                    hz hzVar2 = mzVar.f26621z0;
                    if (adapter != hzVar2) {
                        uwVar.setAdapter(hzVar2);
                    }
                    hzVar.l();
                    return;
                }
                return;
            case 17:
                m00 m00Var = ((l00) obj).e;
                ArrayList arrayList3 = m00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((i00) arrayList3.get(i17)).e && i17 != 0) {
                            h00 h00Var = m00Var.I;
                            m00 m00Var2 = h00Var.d;
                            ArrayList arrayList4 = m00Var2.h;
                            SparseIntArray sparseIntArray = m00Var2.f26240k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((i00) arrayList4.get(i17)).f24923a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (i00) arrayList4.remove(i17));
                                ((i00) arrayList4.get(0)).f24923a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((i00) arrayList4.get(i21)).f24923a = i21;
                                    dialogFilters.get(i21).order = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (m00Var2.K == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        m00Var2.L = i11;
                                        m00Var2.K = i11;
                                    }
                                    if (m00Var2.f26246q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        m00Var2.f26248r0 = i10;
                                        m00Var2.f26246q0 = i10;
                                    }
                                }
                                h00Var.p(i17, 0);
                                g00 g00Var = m00Var2.J;
                                int i23 = ((i00) arrayList4.get(i17)).f24923a;
                                org.telegram.ui.pw pwVar = (org.telegram.ui.pw) g00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.py[] pyVarArr = pwVar.f36685b.f37032e0;
                                    if (i24 < pyVarArr.length) {
                                        org.telegram.ui.py pyVar = pyVarArr[i24];
                                        int i25 = pyVar.h;
                                        if (i25 == i23) {
                                            pyVar.h = i19;
                                        } else if (i25 == i19) {
                                            pyVar.h = i23;
                                        }
                                        i24++;
                                    } else {
                                        m00Var2.j();
                                        m00Var2.f26258y = true;
                                        m00Var2.F.setItemAnimator(m00Var2.f26250s0);
                                    }
                                }
                            }
                            m00Var.F.u0(0);
                            org.telegram.ui.nw nwVar = (org.telegram.ui.nw) m00Var;
                            org.telegram.ui.qy qyVar = nwVar.B0;
                            if (!qyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    nwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = xc.a0(qyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.aj(nwVar, 22));
                                I.k(true);
                                qyVar.f37078n3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                t00 t00Var = (t00) obj;
                if (!t00Var.f28400c) {
                    t00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((b30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.zx zxVar = ((do0) ((g40) obj)).f23725c0;
                if (!zxVar.f26481u0.canScrollVertically(-1)) {
                    zxVar.f26480t0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((i40) obj).f24977b.b(true);
                return;
            case 22:
                ((i40) obj).f24977b.b(true);
                return;
            case 23:
                y40 y40Var = (y40) obj;
                mj0 mj0Var = y40Var.f30555f;
                if (y40Var.f30556n) {
                    mj0Var.getAnimatedDrawable().K(0);
                    mj0Var.setAnimation(y40Var.f30557r);
                    mj0Var.d();
                    return;
                }
                return;
            case 24:
                d60 d60Var = (d60) ((ci.o2) obj).f5237b;
                try {
                    t71 t71Var = d60Var.T;
                    if (t71Var != null && (videoEditedInfo = d60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = t71Var.n();
                        VideoEditedInfo videoEditedInfo2 = d60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            t71 t71Var2 = d60Var.T;
                            long j11 = videoEditedInfo2.startTime;
                            if (j11 > 0) {
                                j3 = j11;
                            }
                            t71Var2.K(j3);
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
                c60 c60Var = (c60) obj;
                ki.r0 r0Var = c60Var.R;
                if (r0Var != null && r0Var.f13835a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j12 = c60Var.f23248y0;
                    if (j12 == 0 || elapsedRealtimeNanos - j12 >= 70000000) {
                        c60Var.w();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                da0 da0Var = (da0) obj;
                if (da0Var.d) {
                    da0Var.e = true;
                    da0Var.f23653r = false;
                    da0Var.f23651f = 0.0f;
                    da0Var.h = SystemClock.uptimeMillis();
                    da0Var.invalidate();
                    return;
                }
                return;
            case 27:
                oa0 oa0Var = (oa0) obj;
                Activity parentActivity = oa0Var.getParentActivity();
                Activity parentActivity2 = oa0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.n1.f41178m;
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
                final ab0 ab0Var = (ab0) obj;
                boolean z12 = ab0Var.I;
                boolean z13 = !z12;
                gg.q1 q1Var = ab0Var.e;
                za0 za0Var = ab0Var.f22591b;
                if (za0Var != null && q1Var != null) {
                    if (ab0Var.L && (kVar = ab0Var.K) != null && kVar.f15526f && !z12) {
                        ab0Var.O = 0;
                        return;
                    }
                    boolean g10 = ab0Var.g();
                    if (!z12) {
                        f7 = (-ab0Var.f22596s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = za0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - q1Var.h) + ab0Var.f22596s;
                        if (computeVerticalScrollRange <= 0 && ab0Var.f22593f.K() > 0 && (i12 = ab0Var.O) < 3) {
                            ab0Var.O = i12 + 1;
                            ab0Var.o(true);
                            return;
                        }
                    }
                    ab0Var.O = 0;
                    float f11 = ab0Var.v;
                    if (g10) {
                        max = -Math.max(0.0f, f11 - f7);
                    } else {
                        max = Math.max(0.0f, f11 - f7) + (-f11);
                    }
                    if (!z12 && !g10) {
                        max += za0Var.computeVerticalScrollOffset();
                    }
                    final float f12 = max;
                    o1.k kVar2 = ab0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    ab0Var.L = z13;
                    final float translationY = za0Var.getTranslationY();
                    final float f13 = ab0Var.M;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f12) {
                        ab0Var.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (ab0Var.N && !z12) {
                            ab0Var.N = false;
                            za0Var.setLayoutManager(ab0Var.getNeededLayoutManager());
                            ab0Var.I = true;
                            ab0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f12);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f15533u = lVar;
                        ab0Var.K = kVar3;
                        final float f14 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f15, float f16) {
                                ab0 ab0Var2 = ab0.this;
                                ab0Var2.f22591b.setTranslationY(f15);
                                ab0Var2.i();
                                float f17 = translationY;
                                ab0Var2.M = AndroidUtilities.lerp(f13, f14, (f15 - f17) / (f12 - f17));
                            }
                        });
                        if (!z12) {
                            ab0Var.K.a(new ci.y4(ab0Var, z13, 2));
                        }
                        ab0Var.K.a(new Object());
                        ab0Var.K.f();
                    }
                    if (num != null && ab0Var.getVisibility() != num.intValue()) {
                        ab0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                ab0Var.O = 0;
                return;
            default:
                ((ob0) obj).S.f22608n.l();
                return;
        }
    }

    public zp(mu muVar, p90 p90Var, ClickableSpan clickableSpan) {
        this.f30935a = 9;
        this.f30936b = muVar;
    }
}
