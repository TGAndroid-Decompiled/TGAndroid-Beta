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
    public final int f30648a;
    public final Object f30649b;

    public yp(Object obj, int i10) {
        this.f30648a = i10;
        this.f30649b = obj;
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
        int i14 = this.f30648a;
        long j3 = 0;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f30649b;
        switch (i14) {
            case 0:
                ((dq) obj).dismiss();
                return;
            case 1:
                ((sq) obj).a();
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
                hr hrVar = ((fr) obj).f24244c;
                TLRPC.Peer peer = hrVar.f24828d0;
                org.telegram.ui.ActionBar.m2 m2Var = hrVar.f24830f0;
                long j10 = hrVar.f24831g0;
                if (hrVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nr nrVar = new nr(m2Var, peer, j10, z10, hrVar.X);
                if (m2Var.getParentActivity() != null) {
                    m2Var.showDialog(nrVar);
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
                jsVar.f25471a.a(!cVar.f14186f, true);
                AndroidUtilities.runOnUIThread(jsVar.f25474f, 3000L);
                return;
            case 6:
                ((go0) obj).V(false);
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
                nf.f.s(((ru) obj).f28042a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                wu wuVar = ((vu) obj).f29800a;
                wuVar.f30166n.setVisibility(4);
                wuVar.h.setVisibility(4);
                ImageView imageView = wuVar.f30170x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((pv) obj).a(true, true);
                return;
            case 13:
                jx jxVar = (jx) obj;
                if (jxVar.Y.getEmojiView() != null) {
                    lz emojiView = jxVar.Y.getEmojiView();
                    if (!emojiView.f26238f0) {
                        try {
                            int i15 = emojiView.R.f28934s.get(EmojiData.dataColored.length);
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
                dy dyVar = (dy) obj;
                dyVar.f23732s.f30707f = true;
                dyVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((yy) obj).h, true);
                return;
            case 16:
                ez ezVar = (ez) obj;
                ArrayList arrayList = ezVar.f24013r;
                ArrayList arrayList2 = ezVar.h;
                gz gzVar = ezVar.f24015w;
                int i16 = gzVar.M;
                lz lzVar = gzVar.Q;
                uw uwVar = lzVar.D0;
                if (i16 == ezVar.f24009b) {
                    arrayList2.remove(arrayList);
                    gzVar.E = ezVar.f24010c;
                    gzVar.F = ezVar.d;
                    gzVar.G = ezVar.e;
                    gzVar.H = ezVar.f24011f;
                    gzVar.I = arrayList2;
                    gzVar.J = ezVar.f24012n;
                    gzVar.K = new ArrayList(arrayList);
                    lzVar.G0.e(false);
                    s4.h0 adapter = uwVar.getAdapter();
                    gz gzVar2 = lzVar.f26302z0;
                    if (adapter != gzVar2) {
                        uwVar.setAdapter(gzVar2);
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
                            SparseIntArray sparseIntArray = l00Var2.f25941k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((h00) arrayList4.get(i17)).f24577a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (h00) arrayList4.remove(i17));
                                ((h00) arrayList4.get(0)).f24577a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((h00) arrayList4.get(i21)).f24577a = i21;
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
                                    if (l00Var2.f25947q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        l00Var2.f25949r0 = i10;
                                        l00Var2.f25947q0 = i10;
                                    }
                                }
                                g00Var.p(i17, 0);
                                f00 f00Var = l00Var2.J;
                                int i23 = ((h00) arrayList4.get(i17)).f24577a;
                                org.telegram.ui.pw pwVar = (org.telegram.ui.pw) f00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.py[] pyVarArr = pwVar.f36671b.f37021e0;
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
                                        l00Var2.j();
                                        l00Var2.f25959y = true;
                                        l00Var2.F.setItemAnimator(l00Var2.f25951s0);
                                    }
                                }
                            }
                            l00Var.F.u0(0);
                            org.telegram.ui.nw nwVar = (org.telegram.ui.nw) l00Var;
                            org.telegram.ui.qy qyVar = nwVar.B0;
                            if (!qyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    nwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = yc.a0(qyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.aj(nwVar, 22));
                                I.k(true);
                                qyVar.f37067n3 = I;
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
                if (!s00Var.f28083c) {
                    s00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((a30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.zx zxVar = ((co0) ((f40) obj)).f23357c0;
                if (!zxVar.f26162u0.canScrollVertically(-1)) {
                    zxVar.f26161t0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((h40) obj).f24626b.b(true);
                return;
            case 22:
                ((h40) obj).f24626b.b(true);
                return;
            case 23:
                x40 x40Var = (x40) obj;
                lj0 lj0Var = x40Var.f30241f;
                if (x40Var.f30242n) {
                    lj0Var.getAnimatedDrawable().K(0);
                    lj0Var.setAnimation(x40Var.f30243r);
                    lj0Var.d();
                    return;
                }
                return;
            case 24:
                c60 c60Var = (c60) ((ci.o2) obj).f5237b;
                try {
                    s71 s71Var = c60Var.T;
                    if (s71Var != null && (videoEditedInfo = c60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = s71Var.n();
                        VideoEditedInfo videoEditedInfo2 = c60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            s71 s71Var2 = c60Var.T;
                            long j11 = videoEditedInfo2.startTime;
                            if (j11 > 0) {
                                j3 = j11;
                            }
                            s71Var2.K(j3);
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
                b60 b60Var = (b60) obj;
                ki.q0 q0Var = b60Var.O;
                if (q0Var != null && q0Var.f13825a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j12 = b60Var.f22891v0;
                    if (j12 == 0 || elapsedRealtimeNanos - j12 >= 70000000) {
                        b60Var.v();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ca0 ca0Var = (ca0) obj;
                if (ca0Var.d) {
                    ca0Var.e = true;
                    ca0Var.f23272r = false;
                    ca0Var.f23270f = 0.0f;
                    ca0Var.h = SystemClock.uptimeMillis();
                    ca0Var.invalidate();
                    return;
                }
                return;
            case 27:
                na0 na0Var = (na0) obj;
                Activity parentActivity = na0Var.getParentActivity();
                Activity parentActivity2 = na0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.n1.f41165m;
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
                final za0 za0Var = (za0) obj;
                boolean z12 = za0Var.I;
                boolean z13 = !z12;
                gg.q1 q1Var = za0Var.e;
                ya0 ya0Var = za0Var.f30814b;
                if (ya0Var != null && q1Var != null) {
                    if (za0Var.L && (kVar = za0Var.K) != null && kVar.f15511f && !z12) {
                        za0Var.O = 0;
                        return;
                    }
                    boolean g10 = za0Var.g();
                    if (!z12) {
                        f7 = (-za0Var.f30819s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = ya0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - q1Var.h) + za0Var.f30819s;
                        if (computeVerticalScrollRange <= 0 && za0Var.f30816f.K() > 0 && (i12 = za0Var.O) < 3) {
                            za0Var.O = i12 + 1;
                            za0Var.o(true);
                            return;
                        }
                    }
                    za0Var.O = 0;
                    float f11 = za0Var.v;
                    if (g10) {
                        max = -Math.max(0.0f, f11 - f7);
                    } else {
                        max = Math.max(0.0f, f11 - f7) + (-f11);
                    }
                    if (!z12 && !g10) {
                        max += ya0Var.computeVerticalScrollOffset();
                    }
                    final float f12 = max;
                    o1.k kVar2 = za0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    za0Var.L = z13;
                    final float translationY = ya0Var.getTranslationY();
                    final float f13 = za0Var.M;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f12) {
                        za0Var.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (za0Var.N && !z12) {
                            za0Var.N = false;
                            ya0Var.setLayoutManager(za0Var.getNeededLayoutManager());
                            za0Var.I = true;
                            za0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f12);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f15518u = lVar;
                        za0Var.K = kVar3;
                        final float f14 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f15, float f16) {
                                za0 za0Var2 = za0.this;
                                za0Var2.f30814b.setTranslationY(f15);
                                za0Var2.i();
                                float f17 = translationY;
                                za0Var2.M = AndroidUtilities.lerp(f13, f14, (f15 - f17) / (f12 - f17));
                            }
                        });
                        if (!z12) {
                            za0Var.K.a(new ci.y4(za0Var, z13, 2));
                        }
                        za0Var.K.a(new Object());
                        za0Var.K.f();
                    }
                    if (num != null && za0Var.getVisibility() != num.intValue()) {
                        za0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                za0Var.O = 0;
                return;
            default:
                ((nb0) obj).S.f30831n.l();
                return;
        }
    }

    public yp(lu luVar, o90 o90Var, ClickableSpan clickableSpan) {
        this.f30648a = 9;
        this.f30649b = luVar;
    }
}
