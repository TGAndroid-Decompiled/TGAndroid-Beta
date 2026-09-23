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
public final class yp implements Runnable {
    public final int f30364a;
    public final Object f30365b;

    public yp(Object obj, int i10) {
        this.f30364a = i10;
        this.f30365b = obj;
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
        final oa0 oa0Var;
        int i13;
        o1.k kVar;
        int i14 = this.f30364a;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f30365b;
        switch (i14) {
            case 0:
                ((dq) obj).dismiss();
                return;
            case 1:
                ((sq) obj).a();
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
                hr hrVar = ((fr) obj).f24077c;
                TLRPC.Peer peer = hrVar.f24810d0;
                org.telegram.ui.ActionBar.n2 n2Var = hrVar.f24812f0;
                long j3 = hrVar.f24813g0;
                if (hrVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nr nrVar = new nr(n2Var, peer, j3, z10, hrVar.X);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(nrVar);
                    return;
                } else {
                    nrVar.show();
                    return;
                }
            case 4:
                ((ci.d) obj).setLoading(true);
                return;
            case 5:
                js jsVar = (js) obj;
                jsVar.f25392a.a(!cVar.f13963f, true);
                AndroidUtilities.runOnUIThread(jsVar.f25395f, 3000L);
                return;
            case 6:
                ((tn0) obj).V(false);
                return;
            case 7:
                ((ot) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((lu) obj).getClass();
                return;
            case 10:
                nf.f.s(((ru) obj).f27733a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                wu wuVar = ((vu) obj).f29391a;
                wuVar.f29813n.setVisibility(4);
                wuVar.h.setVisibility(4);
                ImageView imageView = wuVar.f29817x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((ov) obj).a(true, true);
                return;
            case 13:
                ix ixVar = (ix) obj;
                if (ixVar.Y.getEmojiView() != null) {
                    lz emojiView = ixVar.Y.getEmojiView();
                    if (!emojiView.f25977f0) {
                        try {
                            int i15 = emojiView.R.f28327s.get(EmojiData.dataColored.length);
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
                cy cyVar = (cy) obj;
                cyVar.f23133s.f30090f = true;
                cyVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((yy) obj).h, true);
                return;
            case 16:
                ez ezVar = (ez) obj;
                ArrayList arrayList = ezVar.f23773r;
                ArrayList arrayList2 = ezVar.h;
                gz gzVar = ezVar.f23775w;
                int i16 = gzVar.M;
                lz lzVar = gzVar.Q;
                tw twVar = lzVar.D0;
                if (i16 == ezVar.f23769b) {
                    arrayList2.remove(arrayList);
                    gzVar.E = ezVar.f23770c;
                    gzVar.F = ezVar.d;
                    gzVar.G = ezVar.e;
                    gzVar.H = ezVar.f23771f;
                    gzVar.I = arrayList2;
                    gzVar.J = ezVar.f23772n;
                    gzVar.K = new ArrayList(arrayList);
                    lzVar.G0.e(false);
                    s4.h0 adapter = twVar.getAdapter();
                    gz gzVar2 = lzVar.f26041z0;
                    if (adapter != gzVar2) {
                        twVar.setAdapter(gzVar2);
                    }
                    gzVar.l();
                    return;
                }
                return;
            case 17:
                l00 l00Var = ((k00) obj).e;
                ArrayList arrayList3 = l00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((h00) arrayList3.get(i17)).e && i17 != 0) {
                            g00 g00Var = l00Var.I;
                            l00 l00Var2 = g00Var.d;
                            ArrayList arrayList4 = l00Var2.h;
                            SparseIntArray sparseIntArray = l00Var2.f25747k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((h00) arrayList4.get(i17)).f24468a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (h00) arrayList4.remove(i17));
                                ((h00) arrayList4.get(0)).f24468a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((h00) arrayList4.get(i21)).f24468a = i21;
                                    dialogFilters.get(i21).order = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (l00Var2.K == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        l00Var2.L = i11;
                                        l00Var2.K = i11;
                                    }
                                    if (l00Var2.f25753q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        l00Var2.f25755r0 = i10;
                                        l00Var2.f25753q0 = i10;
                                    }
                                }
                                g00Var.p(i17, 0);
                                f00 f00Var = l00Var2.J;
                                int i23 = ((h00) arrayList4.get(i17)).f24468a;
                                org.telegram.ui.qw qwVar = (org.telegram.ui.qw) f00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.qy[] qyVarArr = qwVar.f36622b.f36978e0;
                                    if (i24 < qyVarArr.length) {
                                        org.telegram.ui.qy qyVar = qyVarArr[i24];
                                        int i25 = qyVar.h;
                                        if (i25 == i23) {
                                            qyVar.h = i19;
                                        } else if (i25 == i19) {
                                            qyVar.h = i23;
                                        }
                                        i24++;
                                    } else {
                                        l00Var2.j();
                                        l00Var2.f25765y = true;
                                        l00Var2.F.setItemAnimator(l00Var2.f25757s0);
                                    }
                                }
                            }
                            l00Var.F.u0(0);
                            org.telegram.ui.pw pwVar = (org.telegram.ui.pw) l00Var;
                            org.telegram.ui.ry ryVar = pwVar.B0;
                            if (!ryVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    pwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = xc.a0(ryVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.aj(pwVar, 22));
                                I.k(true);
                                ryVar.f37024n3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                s00 s00Var = (s00) obj;
                if (!s00Var.f27771c) {
                    s00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((a30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.ay ayVar = ((pn0) ((f40) obj)).f27112c0;
                if (!ayVar.f30353u0.canScrollVertically(-1)) {
                    ayVar.f30352t0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((h40) obj).f24490b.b(true);
                return;
            case 22:
                ((h40) obj).f24490b.b(true);
                return;
            case 23:
                x40 x40Var = (x40) obj;
                bj0 bj0Var = x40Var.f29880f;
                if (x40Var.f29881n) {
                    bj0Var.getAnimatedDrawable().K(0);
                    bj0Var.setAnimation(x40Var.f29882r);
                    bj0Var.d();
                    return;
                }
                return;
            case 24:
                x50 x50Var = (x50) ((ci.o2) obj).f5237b;
                try {
                    f71 f71Var = x50Var.O;
                    if (f71Var != null && (videoEditedInfo = x50Var.N) != null) {
                        long j10 = 0;
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = f71Var.n();
                            VideoEditedInfo videoEditedInfo2 = x50Var.N;
                            if (n10 >= videoEditedInfo2.endTime) {
                                f71 f71Var2 = x50Var.O;
                                long j11 = videoEditedInfo2.startTime;
                                if (j11 > 0) {
                                    j10 = j11;
                                }
                                f71Var2.K(j10);
                                return;
                            }
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
                s90 s90Var = (s90) obj;
                if (s90Var.d) {
                    s90Var.e = true;
                    s90Var.f27884r = false;
                    s90Var.f27882f = 0.0f;
                    s90Var.h = SystemClock.uptimeMillis();
                    s90Var.invalidate();
                    return;
                }
                return;
            case 26:
                ca0 ca0Var = (ca0) obj;
                Activity parentActivity = ca0Var.getParentActivity();
                Activity parentActivity2 = ca0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.l1.f40851m;
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
                oa0 oa0Var2 = (oa0) obj;
                boolean z12 = oa0Var2.I;
                boolean z13 = !z12;
                gg.q1 q1Var = oa0Var2.e;
                na0 na0Var = oa0Var2.f26694b;
                if (na0Var != null && q1Var != null) {
                    if (oa0Var2.L && (kVar = oa0Var2.K) != null && kVar.f15319f && !z12) {
                        oa0Var2.O = 0;
                        return;
                    }
                    boolean g10 = oa0Var2.g();
                    if (!z12) {
                        f7 = (-oa0Var2.f26699s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = na0Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - q1Var.h) + oa0Var2.f26699s;
                        if (computeVerticalScrollRange <= 0 && oa0Var2.f26696f.K() > 0 && (i12 = oa0Var2.O) < 3) {
                            oa0Var2.O = i12 + 1;
                            oa0Var2.o(true);
                            return;
                        }
                        f7 = f11;
                    }
                    oa0Var2.O = 0;
                    float f12 = oa0Var2.v;
                    if (g10) {
                        max = -Math.max(0.0f, f12 - f7);
                    } else {
                        max = Math.max(0.0f, f12 - f7) + (-f12);
                    }
                    if (!z12 && !g10) {
                        max += na0Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    o1.k kVar2 = oa0Var2.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    oa0Var2.L = z13;
                    final float translationY = na0Var.getTranslationY();
                    final float f14 = oa0Var2.M;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f13) {
                        oa0Var2.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (oa0Var2.N && !z12) {
                            oa0Var2.N = false;
                            na0Var.setLayoutManager(oa0Var2.getNeededLayoutManager());
                            oa0Var2.I = true;
                            oa0Var2.o(true);
                        }
                        oa0Var = oa0Var2;
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f13);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f15326u = lVar;
                        oa0Var2.K = kVar3;
                        oa0Var = oa0Var2;
                        final float f15 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f16, float f17) {
                                oa0 oa0Var3 = oa0.this;
                                oa0Var3.f26694b.setTranslationY(f16);
                                oa0Var3.i();
                                float f18 = translationY;
                                oa0Var3.M = AndroidUtilities.lerp(f14, f15, (f16 - f18) / (f13 - f18));
                            }
                        });
                        if (!z12) {
                            oa0Var.K.a(new ci.y4(oa0Var, z13, 2));
                        }
                        oa0Var.K.a(new Object());
                        oa0Var.K.f();
                    }
                    if (num != null && oa0Var.getVisibility() != num.intValue()) {
                        oa0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                oa0Var2.O = 0;
                return;
            case 28:
                ((cb0) obj).S.f26710n.l();
                return;
            default:
                ((yb0) obj).a();
                return;
        }
    }

    public yp(lu luVar, e90 e90Var, ClickableSpan clickableSpan) {
        this.f30364a = 9;
        this.f30365b = luVar;
    }
}
