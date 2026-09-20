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
    public final int f30333a;
    public final Object f30334b;

    public xp(Object obj, int i10) {
        this.f30333a = i10;
        this.f30334b = obj;
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
        final va0 va0Var;
        int i13;
        o1.k kVar;
        int i14 = this.f30333a;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f30334b;
        switch (i14) {
            case 0:
                ((cq) obj).dismiss();
                return;
            case 1:
                ((rq) obj).a();
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
                gr grVar = ((er) obj).f23922c;
                TLRPC.Peer peer = grVar.f24442d0;
                org.telegram.ui.ActionBar.n2 n2Var = grVar.f24444f0;
                long j3 = grVar.f24445g0;
                if (grVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mr mrVar = new mr(n2Var, peer, j3, z10, grVar.X);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(mrVar);
                    return;
                } else {
                    mrVar.show();
                    return;
                }
            case 4:
                ((ci.d) obj).setLoading(true);
                return;
            case 5:
                is isVar = (is) obj;
                isVar.f25124a.a(!bVar.f14170f, true);
                AndroidUtilities.runOnUIThread(isVar.f25127f, 3000L);
                return;
            case 6:
                ((go0) obj).V(false);
                return;
            case 7:
                ((nt) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((ku) obj).getClass();
                return;
            case 10:
                nf.f.s(((qu) obj).f27663a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                vu vuVar = ((uu) obj).f28856a;
                vuVar.f29832n.setVisibility(4);
                vuVar.h.setVisibility(4);
                ImageView imageView = vuVar.f29836x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((ov) obj).a(true, true);
                return;
            case 13:
                ix ixVar = (ix) obj;
                if (ixVar.Y.getEmojiView() != null) {
                    kz emojiView = ixVar.Y.getEmojiView();
                    if (!emojiView.f25907f0) {
                        try {
                            int i15 = emojiView.R.f28470s.get(EmojiData.dataColored.length);
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
                cy cyVar = (cy) obj;
                cyVar.f23429s.f30374f = true;
                cyVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((xy) obj).h, true);
                return;
            case 16:
                dz dzVar = (dz) obj;
                ArrayList arrayList = dzVar.f23671r;
                ArrayList arrayList2 = dzVar.h;
                fz fzVar = dzVar.f23673w;
                int i16 = fzVar.M;
                kz kzVar = fzVar.Q;
                tw twVar = kzVar.D0;
                if (i16 == dzVar.f23667b) {
                    arrayList2.remove(arrayList);
                    fzVar.E = dzVar.f23668c;
                    fzVar.F = dzVar.d;
                    fzVar.G = dzVar.e;
                    fzVar.H = dzVar.f23669f;
                    fzVar.I = arrayList2;
                    fzVar.J = dzVar.f23670n;
                    fzVar.K = new ArrayList(arrayList);
                    kzVar.G0.e(false);
                    s4.h0 adapter = twVar.getAdapter();
                    fz fzVar2 = kzVar.f25971z0;
                    if (adapter != fzVar2) {
                        twVar.setAdapter(fzVar2);
                    }
                    fzVar.l();
                    return;
                }
                return;
            case 17:
                k00 k00Var = ((j00) obj).e;
                ArrayList arrayList3 = k00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((g00) arrayList3.get(i17)).e && i17 != 0) {
                            f00 f00Var = k00Var.I;
                            k00 k00Var2 = f00Var.d;
                            ArrayList arrayList4 = k00Var2.h;
                            SparseIntArray sparseIntArray = k00Var2.f25584k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((g00) arrayList4.get(i17)).f24220a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (g00) arrayList4.remove(i17));
                                ((g00) arrayList4.get(0)).f24220a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((g00) arrayList4.get(i21)).f24220a = i21;
                                    dialogFilters.get(i21).order = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (k00Var2.K == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        k00Var2.L = i11;
                                        k00Var2.K = i11;
                                    }
                                    if (k00Var2.f25590q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        k00Var2.f25592r0 = i10;
                                        k00Var2.f25590q0 = i10;
                                    }
                                }
                                f00Var.p(i17, 0);
                                e00 e00Var = k00Var2.J;
                                int i23 = ((g00) arrayList4.get(i17)).f24220a;
                                org.telegram.ui.tw twVar2 = (org.telegram.ui.tw) e00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.ty[] tyVarArr = twVar2.f37889b.f38256e0;
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
                                        k00Var2.j();
                                        k00Var2.f25602y = true;
                                        k00Var2.F.setItemAnimator(k00Var2.f25594s0);
                                    }
                                }
                            }
                            k00Var.F.v0(0);
                            org.telegram.ui.sw swVar = (org.telegram.ui.sw) k00Var;
                            org.telegram.ui.uy uyVar = swVar.B0;
                            if (!uyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    swVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                pc I = xc.a0(uyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.cj(swVar, 22));
                                I.k(true);
                                uyVar.f38302n3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                r00 r00Var = (r00) obj;
                if (!r00Var.f27711c) {
                    r00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((z20) obj).g(true);
                return;
            case 20:
                org.telegram.ui.ey eyVar = ((co0) ((e40) obj)).f23374c0;
                if (!eyVar.f26214v0.canScrollVertically(-1)) {
                    eyVar.f26213u0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((g40) obj).f24251b.b(true);
                return;
            case 22:
                ((g40) obj).f24251b.b(true);
                return;
            case 23:
                w40 w40Var = (w40) obj;
                kj0 kj0Var = w40Var.f29931f;
                if (w40Var.f29932n) {
                    kj0Var.getAnimatedDrawable().K(0);
                    kj0Var.setAnimation(w40Var.f29933r);
                    kj0Var.d();
                    return;
                }
                return;
            case 24:
                a60 a60Var = (a60) ((ci.p2) obj).f5304b;
                try {
                    t71 t71Var = a60Var.R;
                    if (t71Var != null && (videoEditedInfo = a60Var.Q) != null) {
                        long j10 = 0;
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = t71Var.n();
                            VideoEditedInfo videoEditedInfo2 = a60Var.Q;
                            if (n10 >= videoEditedInfo2.endTime) {
                                t71 t71Var2 = a60Var.R;
                                long j11 = videoEditedInfo2.startTime;
                                if (j11 > 0) {
                                    j10 = j11;
                                }
                                t71Var2.K(j10);
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
                z90 z90Var = (z90) obj;
                if (z90Var.d) {
                    z90Var.e = true;
                    z90Var.f30791r = false;
                    z90Var.f30789f = 0.0f;
                    z90Var.h = SystemClock.uptimeMillis();
                    z90Var.invalidate();
                    return;
                }
                return;
            case 26:
                ja0 ja0Var = (ja0) obj;
                Activity parentActivity = ja0Var.getParentActivity();
                Activity parentActivity2 = ja0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.m1.f41203m;
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
                va0 va0Var2 = (va0) obj;
                boolean z12 = va0Var2.I;
                boolean z13 = !z12;
                gg.q1 q1Var = va0Var2.e;
                ua0 ua0Var = va0Var2.f29046b;
                if (ua0Var != null && q1Var != null) {
                    if (va0Var2.L && (kVar = va0Var2.K) != null && kVar.f15515f && !z12) {
                        va0Var2.O = 0;
                        return;
                    }
                    boolean g10 = va0Var2.g();
                    if (!z12) {
                        f7 = (-va0Var2.f29051s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = ua0Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - q1Var.h) + va0Var2.f29051s;
                        if (computeVerticalScrollRange <= 0 && va0Var2.f29048f.K() > 0 && (i12 = va0Var2.O) < 3) {
                            va0Var2.O = i12 + 1;
                            va0Var2.o(true);
                            return;
                        }
                        f7 = f11;
                    }
                    va0Var2.O = 0;
                    float f12 = va0Var2.v;
                    if (g10) {
                        max = -Math.max(0.0f, f12 - f7);
                    } else {
                        max = Math.max(0.0f, f12 - f7) + (-f12);
                    }
                    if (!z12 && !g10) {
                        max += ua0Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    o1.k kVar2 = va0Var2.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    va0Var2.L = z13;
                    final float translationY = ua0Var.getTranslationY();
                    final float f14 = va0Var2.M;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f13) {
                        va0Var2.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (va0Var2.N && !z12) {
                            va0Var2.N = false;
                            ua0Var.setLayoutManager(va0Var2.getNeededLayoutManager());
                            va0Var2.I = true;
                            va0Var2.o(true);
                        }
                        va0Var = va0Var2;
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f13);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f15522u = lVar;
                        va0Var2.K = kVar3;
                        va0Var = va0Var2;
                        final float f15 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f16, float f17) {
                                va0 va0Var3 = va0.this;
                                va0Var3.f29046b.setTranslationY(f16);
                                va0Var3.i();
                                float f18 = translationY;
                                va0Var3.M = AndroidUtilities.lerp(f14, f15, (f16 - f18) / (f13 - f18));
                            }
                        });
                        if (!z12) {
                            va0Var.K.a(new ci.z4(va0Var, z13, 2));
                        }
                        va0Var.K.a(new Object());
                        va0Var.K.f();
                    }
                    if (num != null && va0Var.getVisibility() != num.intValue()) {
                        va0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                va0Var2.O = 0;
                return;
            case 28:
                ((kb0) obj).S.f30231n.l();
                return;
            default:
                ((hc0) obj).a();
                return;
        }
    }

    public xp(ku kuVar, l90 l90Var, ClickableSpan clickableSpan) {
        this.f30333a = 9;
        this.f30334b = kuVar;
    }
}
