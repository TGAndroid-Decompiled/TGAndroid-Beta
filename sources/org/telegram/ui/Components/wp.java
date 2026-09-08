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
public final class wp implements Runnable {
    public final int f32332a;
    public final Object f32333b;

    public wp(Object obj, int i10) {
        this.f32332a = i10;
        this.f32333b = obj;
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
        final oa0 oa0Var;
        int i13;
        o1.k kVar;
        int i14 = this.f32332a;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f32333b;
        switch (i14) {
            case 0:
                ((bq) obj).dismiss();
                return;
            case 1:
                ((qq) obj).a();
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
                fr frVar = ((dr) obj).f25477c;
                TLRPC.Peer peer = frVar.f26197d0;
                org.telegram.ui.ActionBar.n2 n2Var = frVar.f26199f0;
                long j3 = frVar.f26200g0;
                if (frVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lr lrVar = new lr(n2Var, peer, j3, z10, frVar.X);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(lrVar);
                    return;
                } else {
                    lrVar.show();
                    return;
                }
            case 4:
                ((di.d) obj).setLoading(true);
                return;
            case 5:
                hs hsVar = (hs) obj;
                hsVar.f26855a.a(!bVar.f15396f, true);
                AndroidUtilities.runOnUIThread(hsVar.f26859f, 3000L);
                return;
            case 6:
                ((tn0) obj).V(false);
                return;
            case 7:
                ((lt) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((iu) obj).getClass();
                return;
            case 10:
                of.f.s(((ou) obj).f29214a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                tu tuVar = ((su) obj).f30443a;
                tuVar.f30738n.setVisibility(4);
                tuVar.h.setVisibility(4);
                ImageView imageView = tuVar.f30742x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((mv) obj).a(true, true);
                return;
            case 13:
                ix ixVar = (ix) obj;
                if (ixVar.Y.getEmojiView() != null) {
                    kz emojiView = ixVar.Y.getEmojiView();
                    if (!emojiView.f27969f0) {
                        try {
                            int i15 = emojiView.R.f30756s.get(EmojiData.dataColored.length);
                            if (i15 > 0) {
                                emojiView.P.B0();
                                emojiView.W(i15);
                                emojiView.I(i15, AndroidUtilities.dp(-9.0f));
                                emojiView.n(null, 0);
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
                cyVar.f25151s.f32794f = true;
                cyVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((xy) obj).h, true);
                return;
            case 16:
                dz dzVar = (dz) obj;
                ArrayList arrayList = dzVar.f25515r;
                ArrayList arrayList2 = dzVar.h;
                fz fzVar = dzVar.f25517w;
                int i16 = fzVar.M;
                kz kzVar = fzVar.Q;
                tw twVar = kzVar.D0;
                if (i16 == dzVar.f25510b) {
                    arrayList2.remove(arrayList);
                    fzVar.E = dzVar.f25511c;
                    fzVar.F = dzVar.d;
                    fzVar.G = dzVar.f25512e;
                    fzVar.H = dzVar.f25513f;
                    fzVar.I = arrayList2;
                    fzVar.J = dzVar.f25514n;
                    fzVar.K = new ArrayList(arrayList);
                    kzVar.G0.e(false);
                    s4.h0 adapter = twVar.getAdapter();
                    fz fzVar2 = kzVar.f28033z0;
                    if (adapter != fzVar2) {
                        twVar.setAdapter(fzVar2);
                    }
                    fzVar.l();
                    return;
                }
                return;
            case 17:
                k00 k00Var = ((j00) obj).f27321e;
                ArrayList arrayList3 = k00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((g00) arrayList3.get(i17)).f26247e && i17 != 0) {
                            f00 f00Var = k00Var.I;
                            k00 k00Var2 = f00Var.d;
                            ArrayList arrayList4 = k00Var2.h;
                            SparseIntArray sparseIntArray = k00Var2.f27646k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((g00) arrayList4.get(i17)).f26244a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (g00) arrayList4.remove(i17));
                                ((g00) arrayList4.get(0)).f26244a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((g00) arrayList4.get(i21)).f26244a = i21;
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
                                    if (k00Var2.f27652q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        k00Var2.f27654r0 = i10;
                                        k00Var2.f27652q0 = i10;
                                    }
                                }
                                f00Var.p(i17, 0);
                                e00 e00Var = k00Var2.J;
                                int i23 = ((g00) arrayList4.get(i17)).f26244a;
                                org.telegram.ui.tw twVar2 = (org.telegram.ui.tw) e00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.ty[] tyVarArr = twVar2.f40868b.f41286e0;
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
                                        k00Var2.f27664y = true;
                                        k00Var2.F.setItemAnimator(k00Var2.f27656s0);
                                    }
                                }
                            }
                            k00Var.F.u0(0);
                            org.telegram.ui.sw swVar = (org.telegram.ui.sw) k00Var;
                            org.telegram.ui.uy uyVar = swVar.B0;
                            if (!uyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    swVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = yc.a0(uyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.dj(swVar, 22));
                                I.k(true);
                                uyVar.f41332n3 = I;
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
                if (!r00Var.f29896c) {
                    r00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((z20) obj).g(true);
                return;
            case 20:
                org.telegram.ui.ey eyVar = ((pn0) ((e40) obj)).f29470c0;
                if (!eyVar.f32995u0.canScrollVertically(-1)) {
                    eyVar.f32994t0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((g40) obj).f26277b.b(true);
                return;
            case 22:
                ((g40) obj).f26277b.b(true);
                return;
            case 23:
                w40 w40Var = (w40) obj;
                aj0 aj0Var = w40Var.f32145f;
                if (w40Var.f32146n) {
                    aj0Var.getAnimatedDrawable().I(0);
                    aj0Var.setAnimation(w40Var.f32147r);
                    aj0Var.d();
                    return;
                }
                return;
            case 24:
                w50 w50Var = (w50) ((di.p2) obj).f7850b;
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 25:
                s90 s90Var = (s90) obj;
                if (s90Var.d) {
                    s90Var.f30259e = true;
                    s90Var.f30262r = false;
                    s90Var.f30260f = 0.0f;
                    s90Var.h = SystemClock.uptimeMillis();
                    s90Var.invalidate();
                    return;
                }
                return;
            case 26:
                ca0 ca0Var = (ca0) obj;
                Activity parentActivity = ca0Var.getParentActivity();
                Activity parentActivity2 = ca0Var.getParentActivity();
                DispatchQueue dispatchQueue = qg.k1.f44491m;
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
                hg.q1 q1Var = oa0Var2.f29047e;
                na0 na0Var = oa0Var2.f29045b;
                if (na0Var != null && q1Var != null) {
                    if (oa0Var2.L && (kVar = oa0Var2.K) != null && kVar.f16845f && !z12) {
                        oa0Var2.O = 0;
                        return;
                    }
                    boolean g10 = oa0Var2.g();
                    if (!z12) {
                        f7 = (-oa0Var2.f29051s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = na0Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - q1Var.h) + oa0Var2.f29051s;
                        if (computeVerticalScrollRange <= 0 && oa0Var2.f29048f.K() > 0 && (i12 = oa0Var2.O) < 3) {
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
                        kVar3.f16852u = lVar;
                        oa0Var2.K = kVar3;
                        oa0Var = oa0Var2;
                        final float f15 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f16, float f17) {
                                oa0 oa0Var3 = oa0.this;
                                oa0Var3.f29045b.setTranslationY(f16);
                                oa0Var3.i();
                                float f18 = translationY;
                                oa0Var3.M = AndroidUtilities.lerp(f14, f15, (f16 - f18) / (f13 - f18));
                            }
                        });
                        if (!z12) {
                            oa0Var.K.a(new di.z4(oa0Var, z13, 2));
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
                ((db0) obj).S.f29692n.l();
                return;
            default:
                ((ac0) obj).a();
                return;
        }
    }

    public wp(iu iuVar, e90 e90Var, ClickableSpan clickableSpan) {
        this.f32332a = 9;
        this.f32333b = iuVar;
    }
}
