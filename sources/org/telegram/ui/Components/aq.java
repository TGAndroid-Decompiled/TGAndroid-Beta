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
public final class aq implements Runnable {
    public final int f24700a;
    public final Object f24701b;

    public aq(Object obj, int i10) {
        this.f24700a = i10;
        this.f24701b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        le.b bVar;
        int i10;
        int i11;
        VideoEditedInfo videoEditedInfo;
        float f7;
        int i12;
        float max;
        int i13;
        o1.k kVar;
        int i14 = this.f24700a;
        long j3 = 0;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f24701b;
        switch (i14) {
            case 0:
                ((fq) obj).dismiss();
                return;
            case 1:
                ((uq) obj).a();
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
                jr jrVar = ((hr) obj).f27313c;
                TLRPC.Peer peer = jrVar.f27953d0;
                org.telegram.ui.ActionBar.n2 n2Var = jrVar.f27955f0;
                long j10 = jrVar.f27956g0;
                if (jrVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pr prVar = new pr(n2Var, peer, j10, z10, jrVar.X);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(prVar);
                    return;
                } else {
                    prVar.show();
                    return;
                }
            case 4:
                ((ci.d) obj).setLoading(true);
                return;
            case 5:
                ls lsVar = (ls) obj;
                lsVar.f28520a.a(!bVar.f15437f, true);
                AndroidUtilities.runOnUIThread(lsVar.f28524f, 3000L);
                return;
            case 6:
                ((lo0) obj).V(false);
                return;
            case 7:
                ((qt) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((nu) obj).getClass();
                return;
            case 10:
                nf.f.s(((uu) obj).f31522a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                zu zuVar = ((yu) obj).f33348a;
                zuVar.f33646n.setVisibility(4);
                zuVar.h.setVisibility(4);
                ImageView imageView = zuVar.f33650x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((rv) obj).a(true, true);
                return;
            case 13:
                lx lxVar = (lx) obj;
                if (lxVar.W.getEmojiView() != null) {
                    nz emojiView = lxVar.W.getEmojiView();
                    if (!emojiView.f29204f0) {
                        try {
                            int i15 = emojiView.R.f32737s.get(EmojiData.dataColored.length);
                            if (i15 > 0) {
                                emojiView.P.C0();
                                emojiView.S(i15);
                                emojiView.E(i15, AndroidUtilities.dp(-9.0f));
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
                fy fyVar = (fy) obj;
                fyVar.f26632s.f24763f = true;
                fyVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((az) obj).h, true);
                return;
            case 16:
                gz gzVar = (gz) obj;
                ArrayList arrayList = gzVar.f27017r;
                ArrayList arrayList2 = gzVar.h;
                iz izVar = gzVar.f27019w;
                int i16 = izVar.M;
                nz nzVar = izVar.Q;
                vw vwVar = nzVar.D0;
                if (i16 == gzVar.f27012b) {
                    arrayList2.remove(arrayList);
                    izVar.E = gzVar.f27013c;
                    izVar.F = gzVar.d;
                    izVar.G = gzVar.f27014e;
                    izVar.H = gzVar.f27015f;
                    izVar.I = arrayList2;
                    izVar.J = gzVar.f27016n;
                    izVar.K = new ArrayList(arrayList);
                    nzVar.G0.e(false);
                    s4.h0 adapter = vwVar.getAdapter();
                    iz izVar2 = nzVar.f29268z0;
                    if (adapter != izVar2) {
                        vwVar.setAdapter(izVar2);
                    }
                    izVar.l();
                    return;
                }
                return;
            case 17:
                n00 n00Var = ((m00) obj).f28560e;
                ArrayList arrayList3 = n00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((j00) arrayList3.get(i17)).f27640e && i17 != 0) {
                            i00 i00Var = n00Var.I;
                            n00 n00Var2 = i00Var.d;
                            ArrayList arrayList4 = n00Var2.h;
                            SparseIntArray sparseIntArray = n00Var2.f28889k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((j00) arrayList4.get(i17)).f27637a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (j00) arrayList4.remove(i17));
                                ((j00) arrayList4.get(0)).f27637a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((j00) arrayList4.get(i21)).f27637a = i21;
                                    dialogFilters.get(i21).order = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (n00Var2.K == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        n00Var2.L = i11;
                                        n00Var2.K = i11;
                                    }
                                    if (n00Var2.f28895q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        n00Var2.f28897r0 = i10;
                                        n00Var2.f28895q0 = i10;
                                    }
                                }
                                i00Var.p(i17, 0);
                                h00 h00Var = n00Var2.J;
                                int i23 = ((j00) arrayList4.get(i17)).f27637a;
                                org.telegram.ui.ly lyVar = (org.telegram.ui.ly) h00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.ty[] tyVarArr = lyVar.f38419b.f41435e0;
                                    if (i24 < tyVarArr.length) {
                                        org.telegram.ui.ty tyVar = tyVarArr[i24];
                                        int i25 = tyVar.h;
                                        if (i25 == i23) {
                                            tyVar.h = i19;
                                        } else if (i25 == i19) {
                                            tyVar.h = i23;
                                        }
                                        i24++;
                                    } else {
                                        n00Var2.j();
                                        n00Var2.f28907y = true;
                                        n00Var2.F.setItemAnimator(n00Var2.f28899s0);
                                    }
                                }
                            }
                            n00Var.F.v0(0);
                            org.telegram.ui.ky kyVar = (org.telegram.ui.ky) n00Var;
                            org.telegram.ui.uy uyVar = kyVar.B0;
                            if (!uyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    kyVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                rc I = yc.a0(uyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.bj(kyVar, 24));
                                I.k(true);
                                uyVar.f41481n3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                u00 u00Var = (u00) obj;
                if (!u00Var.f31277c) {
                    u00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((d30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.dy dyVar = ((ho0) ((i40) obj)).f27302c0;
                if (!dyVar.f30165w0.canScrollVertically(-1)) {
                    dyVar.f30164v0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((k40) obj).f28053b.b(true);
                return;
            case 22:
                ((k40) obj).f28053b.b(true);
                return;
            case 23:
                a50 a50Var = (a50) obj;
                nj0 nj0Var = a50Var.f24488f;
                if (a50Var.f24489n) {
                    nj0Var.getAnimatedDrawable().K(0);
                    nj0Var.setAnimation(a50Var.f24490r);
                    nj0Var.d();
                    return;
                }
                return;
            case 24:
                f60 f60Var = (f60) ((ci.o2) obj).f5650b;
                try {
                    e81 e81Var = f60Var.T;
                    if (e81Var != null && (videoEditedInfo = f60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = e81Var.n();
                        VideoEditedInfo videoEditedInfo2 = f60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            e81 e81Var2 = f60Var.T;
                            long j11 = videoEditedInfo2.startTime;
                            if (j11 > 0) {
                                j3 = j11;
                            }
                            e81Var2.K(j3);
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
                e60 e60Var = (e60) obj;
                ki.r0 r0Var = e60Var.R;
                if (r0Var != null && r0Var.f15036a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j12 = e60Var.f26024y0;
                    if (j12 == 0 || elapsedRealtimeNanos - j12 >= 70000000) {
                        e60Var.w();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                fa0 fa0Var = (fa0) obj;
                if (fa0Var.d) {
                    fa0Var.f26439e = true;
                    fa0Var.f26442r = false;
                    fa0Var.f26440f = 0.0f;
                    fa0Var.h = SystemClock.uptimeMillis();
                    fa0Var.invalidate();
                    return;
                }
                return;
            case 27:
                pa0 pa0Var = (pa0) obj;
                Activity parentActivity = pa0Var.getParentActivity();
                Activity parentActivity2 = pa0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.n1.f44551m;
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
                final bb0 bb0Var = (bb0) obj;
                boolean z12 = bb0Var.I;
                boolean z13 = !z12;
                gg.q1 q1Var = bb0Var.f24929e;
                ab0 ab0Var = bb0Var.f24927b;
                if (ab0Var != null && q1Var != null) {
                    if (bb0Var.L && (kVar = bb0Var.K) != null && kVar.f16986f && !z12) {
                        bb0Var.O = 0;
                        return;
                    }
                    boolean g10 = bb0Var.g();
                    if (!z12) {
                        f7 = (-bb0Var.f24933s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = ab0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - q1Var.h) + bb0Var.f24933s;
                        if (computeVerticalScrollRange <= 0 && bb0Var.f24930f.K() > 0 && (i12 = bb0Var.O) < 3) {
                            bb0Var.O = i12 + 1;
                            bb0Var.o(true);
                            return;
                        }
                    }
                    bb0Var.O = 0;
                    float f11 = bb0Var.v;
                    if (g10) {
                        max = -Math.max(0.0f, f11 - f7);
                    } else {
                        max = Math.max(0.0f, f11 - f7) + (-f11);
                    }
                    if (!z12 && !g10) {
                        max += ab0Var.computeVerticalScrollOffset();
                    }
                    final float f12 = max;
                    o1.k kVar2 = bb0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    bb0Var.L = z13;
                    final float translationY = ab0Var.getTranslationY();
                    final float f13 = bb0Var.M;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f12) {
                        bb0Var.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (bb0Var.N && !z12) {
                            bb0Var.N = false;
                            ab0Var.setLayoutManager(bb0Var.getNeededLayoutManager());
                            bb0Var.I = true;
                            bb0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f12);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f16993u = lVar;
                        bb0Var.K = kVar3;
                        final float f14 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f15, float f16) {
                                bb0 bb0Var2 = bb0.this;
                                bb0Var2.f24927b.setTranslationY(f15);
                                bb0Var2.i();
                                float f17 = translationY;
                                bb0Var2.M = AndroidUtilities.lerp(f13, f14, (f15 - f17) / (f12 - f17));
                            }
                        });
                        if (!z12) {
                            bb0Var.K.a(new ci.y4(bb0Var, z13, 2));
                        }
                        bb0Var.K.a(new Object());
                        bb0Var.K.f();
                    }
                    if (num != null && bb0Var.getVisibility() != num.intValue()) {
                        bb0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                bb0Var.O = 0;
                return;
            default:
                ((pb0) obj).S.f25377n.l();
                return;
        }
    }

    public aq(nu nuVar, r90 r90Var, ClickableSpan clickableSpan) {
        this.f24700a = 9;
        this.f24701b = nuVar;
    }
}
