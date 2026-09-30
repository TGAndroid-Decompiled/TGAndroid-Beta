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
    public final int f22686a;
    public final Object f22687b;

    public aq(Object obj, int i10) {
        this.f22686a = i10;
        this.f22687b = obj;
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
        int i14 = this.f22686a;
        long j3 = 0;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f22687b;
        switch (i14) {
            case 0:
                ((fq) obj).dismiss();
                return;
            case 1:
                ((uq) obj).a();
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
                jr jrVar = ((hr) obj).f24931c;
                TLRPC.Peer peer = jrVar.f25535d0;
                org.telegram.ui.ActionBar.m2 m2Var = jrVar.f25537f0;
                long j10 = jrVar.f25538g0;
                if (jrVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pr prVar = new pr(m2Var, peer, j10, z10, jrVar.X);
                if (m2Var.getParentActivity() != null) {
                    m2Var.showDialog(prVar);
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
                lsVar.f26097a.a(!cVar.f14217f, true);
                AndroidUtilities.runOnUIThread(lsVar.f26100f, 3000L);
                return;
            case 6:
                ((jo0) obj).V(false);
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
                nf.f.s(((tu) obj).f28657a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                yu yuVar = ((xu) obj).f30506a;
                yuVar.f30812n.setVisibility(4);
                yuVar.h.setVisibility(4);
                ImageView imageView = yuVar.f30816x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((qv) obj).a(true, true);
                return;
            case 13:
                lx lxVar = (lx) obj;
                if (lxVar.Y.getEmojiView() != null) {
                    nz emojiView = lxVar.Y.getEmojiView();
                    if (!emojiView.f26827f0) {
                        try {
                            int i15 = emojiView.R.f30079s.get(EmojiData.dataColored.length);
                            if (i15 > 0) {
                                emojiView.P.C0();
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
                fy fyVar = (fy) obj;
                fyVar.f24384s.f22727f = true;
                fyVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((az) obj).h, true);
                return;
            case 16:
                gz gzVar = (gz) obj;
                ArrayList arrayList = gzVar.f24692r;
                ArrayList arrayList2 = gzVar.h;
                iz izVar = gzVar.f24694w;
                int i16 = izVar.M;
                nz nzVar = izVar.Q;
                vw vwVar = nzVar.D0;
                if (i16 == gzVar.f24688b) {
                    arrayList2.remove(arrayList);
                    izVar.E = gzVar.f24689c;
                    izVar.F = gzVar.d;
                    izVar.G = gzVar.e;
                    izVar.H = gzVar.f24690f;
                    izVar.I = arrayList2;
                    izVar.J = gzVar.f24691n;
                    izVar.K = new ArrayList(arrayList);
                    nzVar.G0.e(false);
                    s4.h0 adapter = vwVar.getAdapter();
                    iz izVar2 = nzVar.f26891z0;
                    if (adapter != izVar2) {
                        vwVar.setAdapter(izVar2);
                    }
                    izVar.l();
                    return;
                }
                return;
            case 17:
                n00 n00Var = ((m00) obj).e;
                ArrayList arrayList3 = n00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((j00) arrayList3.get(i17)).e && i17 != 0) {
                            i00 i00Var = n00Var.I;
                            n00 n00Var2 = i00Var.d;
                            ArrayList arrayList4 = n00Var2.h;
                            SparseIntArray sparseIntArray = n00Var2.f26490k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((j00) arrayList4.get(i17)).f25251a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (j00) arrayList4.remove(i17));
                                ((j00) arrayList4.get(0)).f25251a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((j00) arrayList4.get(i21)).f25251a = i21;
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
                                    if (n00Var2.f26496q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        n00Var2.f26498r0 = i10;
                                        n00Var2.f26496q0 = i10;
                                    }
                                }
                                i00Var.p(i17, 0);
                                h00 h00Var = n00Var2.J;
                                int i23 = ((j00) arrayList4.get(i17)).f25251a;
                                org.telegram.ui.pw pwVar = (org.telegram.ui.pw) h00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.py[] pyVarArr = pwVar.f36786b.f37134e0;
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
                                        n00Var2.j();
                                        n00Var2.f26508y = true;
                                        n00Var2.F.setItemAnimator(n00Var2.f26500s0);
                                    }
                                }
                            }
                            n00Var.F.v0(0);
                            org.telegram.ui.nw nwVar = (org.telegram.ui.nw) n00Var;
                            org.telegram.ui.qy qyVar = nwVar.B0;
                            if (!qyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    nwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                rc I = yc.a0(qyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.aj(nwVar, 22));
                                I.k(true);
                                qyVar.f37180n3 = I;
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
                if (!u00Var.f28700c) {
                    u00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((d30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.zx zxVar = ((fo0) ((i40) obj)).f24323c0;
                if (!zxVar.f27154u0.canScrollVertically(-1)) {
                    zxVar.f27153t0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((k40) obj).f25646b.b(true);
                return;
            case 22:
                ((k40) obj).f25646b.b(true);
                return;
            case 23:
                a50 a50Var = (a50) obj;
                oj0 oj0Var = a50Var.f22557f;
                if (a50Var.f22558n) {
                    oj0Var.getAnimatedDrawable().K(0);
                    oj0Var.setAnimation(a50Var.f22559r);
                    oj0Var.d();
                    return;
                }
                return;
            case 24:
                f60 f60Var = (f60) ((ci.o2) obj).f5244b;
                try {
                    v71 v71Var = f60Var.T;
                    if (v71Var != null && (videoEditedInfo = f60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = v71Var.n();
                        VideoEditedInfo videoEditedInfo2 = f60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            v71 v71Var2 = f60Var.T;
                            long j11 = videoEditedInfo2.startTime;
                            if (j11 > 0) {
                                j3 = j11;
                            }
                            v71Var2.K(j3);
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
                e60 e60Var = (e60) obj;
                ki.r0 r0Var = e60Var.R;
                if (r0Var != null && r0Var.f13851a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j12 = e60Var.f23888y0;
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
                    fa0Var.e = true;
                    fa0Var.f24264r = false;
                    fa0Var.f24262f = 0.0f;
                    fa0Var.h = SystemClock.uptimeMillis();
                    fa0Var.invalidate();
                    return;
                }
                return;
            case 27:
                qa0 qa0Var = (qa0) obj;
                Activity parentActivity = qa0Var.getParentActivity();
                Activity parentActivity2 = qa0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.n1.f41278m;
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
                final cb0 cb0Var = (cb0) obj;
                boolean z12 = cb0Var.I;
                boolean z13 = !z12;
                gg.q1 q1Var = cb0Var.e;
                bb0 bb0Var = cb0Var.f23248b;
                if (bb0Var != null && q1Var != null) {
                    if (cb0Var.L && (kVar = cb0Var.K) != null && kVar.f15542f && !z12) {
                        cb0Var.O = 0;
                        return;
                    }
                    boolean g10 = cb0Var.g();
                    if (!z12) {
                        f7 = (-cb0Var.f23253s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = bb0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - q1Var.h) + cb0Var.f23253s;
                        if (computeVerticalScrollRange <= 0 && cb0Var.f23250f.K() > 0 && (i12 = cb0Var.O) < 3) {
                            cb0Var.O = i12 + 1;
                            cb0Var.o(true);
                            return;
                        }
                    }
                    cb0Var.O = 0;
                    float f11 = cb0Var.v;
                    if (g10) {
                        max = -Math.max(0.0f, f11 - f7);
                    } else {
                        max = Math.max(0.0f, f11 - f7) + (-f11);
                    }
                    if (!z12 && !g10) {
                        max += bb0Var.computeVerticalScrollOffset();
                    }
                    final float f12 = max;
                    o1.k kVar2 = cb0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    cb0Var.L = z13;
                    final float translationY = bb0Var.getTranslationY();
                    final float f13 = cb0Var.M;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f12) {
                        cb0Var.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (cb0Var.N && !z12) {
                            cb0Var.N = false;
                            bb0Var.setLayoutManager(cb0Var.getNeededLayoutManager());
                            cb0Var.I = true;
                            cb0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f12);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f15549u = lVar;
                        cb0Var.K = kVar3;
                        final float f14 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f15, float f16) {
                                cb0 cb0Var2 = cb0.this;
                                cb0Var2.f23248b.setTranslationY(f15);
                                cb0Var2.i();
                                float f17 = translationY;
                                cb0Var2.M = AndroidUtilities.lerp(f13, f14, (f15 - f17) / (f12 - f17));
                            }
                        });
                        if (!z12) {
                            cb0Var.K.a(new ci.y4(cb0Var, z13, 2));
                        }
                        cb0Var.K.a(new Object());
                        cb0Var.K.f();
                    }
                    if (num != null && cb0Var.getVisibility() != num.intValue()) {
                        cb0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                cb0Var.O = 0;
                return;
            default:
                ((qb0) obj).S.f23266n.l();
                return;
        }
    }

    public aq(nu nuVar, r90 r90Var, ClickableSpan clickableSpan) {
        this.f22686a = 9;
        this.f22687b = nuVar;
    }
}
