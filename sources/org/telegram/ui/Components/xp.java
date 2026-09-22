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
    public final int f30026a;
    public final Object f30027b;

    public xp(Object obj, int i10) {
        this.f30026a = i10;
        this.f30027b = obj;
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
        final na0 na0Var;
        int i13;
        o1.k kVar;
        int i14 = this.f30026a;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f30027b;
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
                gr grVar = ((er) obj).f23737c;
                TLRPC.Peer peer = grVar.f24447d0;
                org.telegram.ui.ActionBar.n2 n2Var = grVar.f24449f0;
                long j3 = grVar.f24450g0;
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
                isVar.f25128a.a(!bVar.f13973f, true);
                AndroidUtilities.runOnUIThread(isVar.f25131f, 3000L);
                return;
            case 6:
                ((tn0) obj).V(false);
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
                nf.f.s(((qu) obj).f27443a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                vu vuVar = ((uu) obj).f28509a;
                vuVar.f29430n.setVisibility(4);
                vuVar.h.setVisibility(4);
                ImageView imageView = vuVar.f29434x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((nv) obj).a(true, true);
                return;
            case 13:
                hx hxVar = (hx) obj;
                if (hxVar.Y.getEmojiView() != null) {
                    kz emojiView = hxVar.Y.getEmojiView();
                    if (!emojiView.f25709f0) {
                        try {
                            int i15 = emojiView.R.f27987s.get(EmojiData.dataColored.length);
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
                ay ayVar = (ay) obj;
                ayVar.f22508s.f29822f = true;
                ayVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((xy) obj).h, true);
                return;
            case 16:
                dz dzVar = (dz) obj;
                ArrayList arrayList = dzVar.f23430r;
                ArrayList arrayList2 = dzVar.h;
                fz fzVar = dzVar.f23432w;
                int i16 = fzVar.M;
                kz kzVar = fzVar.Q;
                sw swVar = kzVar.D0;
                if (i16 == dzVar.f23426b) {
                    arrayList2.remove(arrayList);
                    fzVar.E = dzVar.f23427c;
                    fzVar.F = dzVar.d;
                    fzVar.G = dzVar.e;
                    fzVar.H = dzVar.f23428f;
                    fzVar.I = arrayList2;
                    fzVar.J = dzVar.f23429n;
                    fzVar.K = new ArrayList(arrayList);
                    kzVar.G0.e(false);
                    s4.h0 adapter = swVar.getAdapter();
                    fz fzVar2 = kzVar.f25773z0;
                    if (adapter != fzVar2) {
                        swVar.setAdapter(fzVar2);
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
                            SparseIntArray sparseIntArray = k00Var2.f25476k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((g00) arrayList4.get(i17)).f24139a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (g00) arrayList4.remove(i17));
                                ((g00) arrayList4.get(0)).f24139a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((g00) arrayList4.get(i21)).f24139a = i21;
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
                                    if (k00Var2.f25482q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        k00Var2.f25484r0 = i10;
                                        k00Var2.f25482q0 = i10;
                                    }
                                }
                                f00Var.p(i17, 0);
                                e00 e00Var = k00Var2.J;
                                int i23 = ((g00) arrayList4.get(i17)).f24139a;
                                org.telegram.ui.tw twVar = (org.telegram.ui.tw) e00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.ty[] tyVarArr = twVar.f37741b.f38222e0;
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
                                        k00Var2.f25494y = true;
                                        k00Var2.F.setItemAnimator(k00Var2.f25486s0);
                                    }
                                }
                            }
                            k00Var.F.u0(0);
                            org.telegram.ui.sw swVar2 = (org.telegram.ui.sw) k00Var;
                            org.telegram.ui.uy uyVar = swVar2.B0;
                            if (!uyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    swVar2.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                oc I = vc.a0(uyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.dj(swVar2, 22));
                                I.k(true);
                                uyVar.f38268n3 = I;
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
                if (!r00Var.f27494c) {
                    r00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((z20) obj).g(true);
                return;
            case 20:
                org.telegram.ui.ey eyVar = ((pn0) ((e40) obj)).f27095c0;
                if (!eyVar.f30302u0.canScrollVertically(-1)) {
                    eyVar.f30301t0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((g40) obj).f24179b.b(true);
                return;
            case 22:
                ((g40) obj).f24179b.b(true);
                return;
            case 23:
                w40 w40Var = (w40) obj;
                aj0 aj0Var = w40Var.f29562f;
                if (w40Var.f29563n) {
                    aj0Var.getAnimatedDrawable().K(0);
                    aj0Var.setAnimation(w40Var.f29564r);
                    aj0Var.d();
                    return;
                }
                return;
            case 24:
                w50 w50Var = (w50) ((ci.p2) obj).f5300b;
                try {
                    g71 g71Var = w50Var.O;
                    if (g71Var != null && (videoEditedInfo = w50Var.N) != null) {
                        long j10 = 0;
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = g71Var.n();
                            VideoEditedInfo videoEditedInfo2 = w50Var.N;
                            if (n10 >= videoEditedInfo2.endTime) {
                                g71 g71Var2 = w50Var.O;
                                long j11 = videoEditedInfo2.startTime;
                                if (j11 > 0) {
                                    j10 = j11;
                                }
                                g71Var2.K(j10);
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
                r90 r90Var = (r90) obj;
                if (r90Var.d) {
                    r90Var.e = true;
                    r90Var.f27611r = false;
                    r90Var.f27609f = 0.0f;
                    r90Var.h = SystemClock.uptimeMillis();
                    r90Var.invalidate();
                    return;
                }
                return;
            case 26:
                ba0 ba0Var = (ba0) obj;
                Activity parentActivity = ba0Var.getParentActivity();
                Activity parentActivity2 = ba0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.k1.f40892m;
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
                na0 na0Var2 = (na0) obj;
                boolean z12 = na0Var2.I;
                boolean z13 = !z12;
                gg.q1 q1Var = na0Var2.e;
                ma0 ma0Var = na0Var2.f26422b;
                if (ma0Var != null && q1Var != null) {
                    if (na0Var2.L && (kVar = na0Var2.K) != null && kVar.f15342f && !z12) {
                        na0Var2.O = 0;
                        return;
                    }
                    boolean g10 = na0Var2.g();
                    if (!z12) {
                        f7 = (-na0Var2.f26427s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = ma0Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - q1Var.h) + na0Var2.f26427s;
                        if (computeVerticalScrollRange <= 0 && na0Var2.f26424f.K() > 0 && (i12 = na0Var2.O) < 3) {
                            na0Var2.O = i12 + 1;
                            na0Var2.o(true);
                            return;
                        }
                        f7 = f11;
                    }
                    na0Var2.O = 0;
                    float f12 = na0Var2.v;
                    if (g10) {
                        max = -Math.max(0.0f, f12 - f7);
                    } else {
                        max = Math.max(0.0f, f12 - f7) + (-f12);
                    }
                    if (!z12 && !g10) {
                        max += ma0Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    o1.k kVar2 = na0Var2.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    na0Var2.L = z13;
                    final float translationY = ma0Var.getTranslationY();
                    final float f14 = na0Var2.M;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f13) {
                        na0Var2.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (na0Var2.N && !z12) {
                            na0Var2.N = false;
                            ma0Var.setLayoutManager(na0Var2.getNeededLayoutManager());
                            na0Var2.I = true;
                            na0Var2.o(true);
                        }
                        na0Var = na0Var2;
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f13);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f15349u = lVar;
                        na0Var2.K = kVar3;
                        na0Var = na0Var2;
                        final float f15 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f16, float f17) {
                                na0 na0Var3 = na0.this;
                                na0Var3.f26422b.setTranslationY(f16);
                                na0Var3.i();
                                float f18 = translationY;
                                na0Var3.M = AndroidUtilities.lerp(f14, f15, (f16 - f18) / (f13 - f18));
                            }
                        });
                        if (!z12) {
                            na0Var.K.a(new ci.z4(na0Var, z13, 2));
                        }
                        na0Var.K.a(new Object());
                        na0Var.K.f();
                    }
                    if (num != null && na0Var.getVisibility() != num.intValue()) {
                        na0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                na0Var2.O = 0;
                return;
            case 28:
                ((cb0) obj).S.f27000n.l();
                return;
            default:
                ((zb0) obj).a();
                return;
        }
    }

    public xp(ku kuVar, d90 d90Var, ClickableSpan clickableSpan) {
        this.f30026a = 9;
        this.f30027b = kuVar;
    }
}
