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
    public final int f30953a;
    public final Object f30954b;

    public zp(Object obj, int i10) {
        this.f30953a = i10;
        this.f30954b = obj;
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
        int i14 = this.f30953a;
        long j3 = 0;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f30954b;
        switch (i14) {
            case 0:
                ((eq) obj).dismiss();
                return;
            case 1:
                ((tq) obj).a();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.g3) obj).dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 3:
                ir irVar = ((gr) obj).f24645c;
                TLRPC.Peer peer = irVar.f25217d0;
                org.telegram.ui.ActionBar.o2 o2Var = irVar.f25219f0;
                long j10 = irVar.f25220g0;
                if (irVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                or orVar = new or(o2Var, peer, j10, z10, irVar.X);
                if (o2Var.getParentActivity() != null) {
                    o2Var.showDialog(orVar);
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
                ksVar.f25830a.a(!cVar.f14203f, true);
                AndroidUtilities.runOnUIThread(ksVar.f25833f, 3000L);
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
                nf.f.s(((su) obj).f28380a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                xu xuVar = ((wu) obj).f30181a;
                xuVar.f30486n.setVisibility(4);
                xuVar.h.setVisibility(4);
                ImageView imageView = xuVar.f30490x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((pv) obj).a(true, true);
                return;
            case 13:
                jx jxVar = (jx) obj;
                if (jxVar.Y.getEmojiView() != null) {
                    mz emojiView = jxVar.Y.getEmojiView();
                    if (!emojiView.f26583f0) {
                        try {
                            int i15 = emojiView.R.f28956s.get(EmojiData.dataColored.length);
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
                dy dyVar = (dy) obj;
                dyVar.f23764s.f30797f = true;
                dyVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((zy) obj).h, true);
                return;
            case 16:
                fz fzVar = (fz) obj;
                ArrayList arrayList = fzVar.f24401r;
                ArrayList arrayList2 = fzVar.h;
                hz hzVar = fzVar.f24403w;
                int i16 = hzVar.M;
                mz mzVar = hzVar.Q;
                uw uwVar = mzVar.D0;
                if (i16 == fzVar.f24397b) {
                    arrayList2.remove(arrayList);
                    hzVar.E = fzVar.f24398c;
                    hzVar.F = fzVar.d;
                    hzVar.G = fzVar.e;
                    hzVar.H = fzVar.f24399f;
                    hzVar.I = arrayList2;
                    hzVar.J = fzVar.f24400n;
                    hzVar.K = new ArrayList(arrayList);
                    mzVar.G0.e(false);
                    s4.h0 adapter = uwVar.getAdapter();
                    hz hzVar2 = mzVar.f26647z0;
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
                            SparseIntArray sparseIntArray = m00Var2.f26255k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((i00) arrayList4.get(i17)).f24973a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (i00) arrayList4.remove(i17));
                                ((i00) arrayList4.get(0)).f24973a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((i00) arrayList4.get(i21)).f24973a = i21;
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
                                    if (m00Var2.f26261q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        m00Var2.f26263r0 = i10;
                                        m00Var2.f26261q0 = i10;
                                    }
                                }
                                h00Var.p(i17, 0);
                                g00 g00Var = m00Var2.J;
                                int i23 = ((i00) arrayList4.get(i17)).f24973a;
                                org.telegram.ui.ky kyVar = (org.telegram.ui.ky) g00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.sy[] syVarArr = kyVar.f35193b.f37976e0;
                                    if (i24 < syVarArr.length) {
                                        org.telegram.ui.sy syVar = syVarArr[i24];
                                        int i25 = syVar.h;
                                        if (i25 == i23) {
                                            syVar.h = i19;
                                        } else if (i25 == i19) {
                                            syVar.h = i23;
                                        }
                                        i24++;
                                    } else {
                                        m00Var2.j();
                                        m00Var2.f26273y = true;
                                        m00Var2.F.setItemAnimator(m00Var2.f26265s0);
                                    }
                                }
                            }
                            m00Var.F.v0(0);
                            org.telegram.ui.iy iyVar = (org.telegram.ui.iy) m00Var;
                            org.telegram.ui.ty tyVar = iyVar.B0;
                            if (!tyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    iyVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = xc.a0(tyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.cj(iyVar, 24));
                                I.k(true);
                                tyVar.f38022n3 = I;
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
                if (!t00Var.f28429c) {
                    t00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((c30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.ay ayVar = ((do0) ((h40) obj)).f23705c0;
                if (!ayVar.f26514v0.canScrollVertically(-1)) {
                    ayVar.f26513u0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((j40) obj).f25325b.b(true);
                return;
            case 22:
                ((j40) obj).f25325b.b(true);
                return;
            case 23:
                z40 z40Var = (z40) obj;
                nj0 nj0Var = z40Var.f30845f;
                if (z40Var.f30846n) {
                    nj0Var.getAnimatedDrawable().K(0);
                    nj0Var.setAnimation(z40Var.f30847r);
                    nj0Var.d();
                    return;
                }
                return;
            case 24:
                e60 e60Var = (e60) ((ci.o2) obj).f5247b;
                try {
                    u71 u71Var = e60Var.T;
                    if (u71Var != null && (videoEditedInfo = e60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = u71Var.n();
                        VideoEditedInfo videoEditedInfo2 = e60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            u71 u71Var2 = e60Var.T;
                            long j11 = videoEditedInfo2.startTime;
                            if (j11 > 0) {
                                j3 = j11;
                            }
                            u71Var2.K(j3);
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
                d60 d60Var = (d60) obj;
                ki.r0 r0Var = d60Var.R;
                if (r0Var != null && r0Var.f13837a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j12 = d60Var.f23577y0;
                    if (j12 == 0 || elapsedRealtimeNanos - j12 >= 70000000) {
                        d60Var.w();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ea0 ea0Var = (ea0) obj;
                if (ea0Var.d) {
                    ea0Var.e = true;
                    ea0Var.f24000r = false;
                    ea0Var.f23998f = 0.0f;
                    ea0Var.h = SystemClock.uptimeMillis();
                    ea0Var.invalidate();
                    return;
                }
                return;
            case 27:
                oa0 oa0Var = (oa0) obj;
                Activity parentActivity = oa0Var.getParentActivity();
                Activity parentActivity2 = oa0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.n1.f41177m;
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
                za0 za0Var = ab0Var.f22635b;
                if (za0Var != null && q1Var != null) {
                    if (ab0Var.L && (kVar = ab0Var.K) != null && kVar.f15565f && !z12) {
                        ab0Var.O = 0;
                        return;
                    }
                    boolean g10 = ab0Var.g();
                    if (!z12) {
                        f7 = (-ab0Var.f22640s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = za0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - q1Var.h) + ab0Var.f22640s;
                        if (computeVerticalScrollRange <= 0 && ab0Var.f22637f.K() > 0 && (i12 = ab0Var.O) < 3) {
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
                        kVar3.f15572u = lVar;
                        ab0Var.K = kVar3;
                        final float f14 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f15, float f16) {
                                ab0 ab0Var2 = ab0.this;
                                ab0Var2.f22635b.setTranslationY(f15);
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
                ((ob0) obj).S.f22652n.l();
                return;
        }
    }

    public zp(mu muVar, q90 q90Var, ClickableSpan clickableSpan) {
        this.f30953a = 9;
        this.f30954b = muVar;
    }
}
