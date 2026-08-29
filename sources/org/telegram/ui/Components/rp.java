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
public final class rp implements Runnable {
    public final int f32353a;
    public final Object f32354b;

    public rp(Object obj, int i10) {
        this.f32353a = i10;
        this.f32354b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        vd.a aVar;
        int i10;
        int i11;
        VideoEditedInfo videoEditedInfo;
        float f9;
        int i12;
        float max;
        final ka0 ka0Var;
        int i13;
        o1.k kVar;
        int i14 = this.f32353a;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f32354b;
        switch (i14) {
            case 0:
                ((wp) obj).dismiss();
                return;
            case 1:
                ((lq) obj).a();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.f3) obj).dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 3:
                ar arVar = ((yq) obj).f35119c;
                TLRPC.Peer peer = arVar.Z;
                org.telegram.ui.ActionBar.o2 o2Var = arVar.f26837b0;
                long j10 = arVar.f26838c0;
                if (arVar.U.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fr frVar = new fr(o2Var, peer, j10, z10, arVar.T);
                if (o2Var.getParentActivity() != null) {
                    o2Var.showDialog(frVar);
                    return;
                } else {
                    frVar.show();
                    return;
                }
            case 4:
                ((nh.d) obj).setLoading(true);
                return;
            case 5:
                ds dsVar = (ds) obj;
                dsVar.f27864a.a(!aVar.f49506f, true);
                AndroidUtilities.runOnUIThread(dsVar.f27868f, 3000L);
                return;
            case 6:
                ((on0) obj).V(false);
                return;
            case 7:
                ((et) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((bu) obj).getClass();
                return;
            case 10:
                ye.d.s(((hu) obj).f29230a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                mu muVar = ((lu) obj).f30433a;
                muVar.f30768n.setVisibility(4);
                muVar.h.setVisibility(4);
                ImageView imageView = muVar.f30772x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((ev) obj).a(true, true);
                return;
            case 13:
                bx bxVar = (bx) obj;
                if (bxVar.U.getEmojiView() != null) {
                    fz emojiView = bxVar.U.getEmojiView();
                    if (!emojiView.f28578b0) {
                        try {
                            int i15 = emojiView.N.f31163s.get(EmojiData.dataColored.length);
                            if (i15 > 0) {
                                emojiView.L.B0();
                                emojiView.W(i15);
                                emojiView.H(i15, AndroidUtilities.dp(-9.0f));
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
                vx vxVar = (vx) obj;
                vxVar.f34212s.f32405f = true;
                vxVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((ry) obj).h, true);
                return;
            case 16:
                yy yyVar = (yy) obj;
                ArrayList arrayList = yyVar.f35155r;
                ArrayList arrayList2 = yyVar.h;
                az azVar = yyVar.f35157w;
                int i16 = azVar.I;
                fz fzVar = azVar.M;
                lw lwVar = fzVar.f28657z0;
                if (i16 == yyVar.f35150b) {
                    arrayList2.remove(arrayList);
                    azVar.A = yyVar.f35151c;
                    azVar.B = yyVar.d;
                    azVar.C = yyVar.f35152e;
                    azVar.D = yyVar.f35153f;
                    azVar.E = arrayList2;
                    azVar.F = yyVar.f35154n;
                    azVar.G = new ArrayList(arrayList);
                    fzVar.C0.e(false);
                    f2.p0 adapter = lwVar.getAdapter();
                    az azVar2 = fzVar.f28642v0;
                    if (adapter != azVar2) {
                        lwVar.setAdapter(azVar2);
                    }
                    azVar.l();
                    return;
                }
                return;
            case 17:
                f00 f00Var = ((e00) obj).f27901e;
                ArrayList arrayList3 = f00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((c00) arrayList3.get(i17)).f27254e && i17 != 0) {
                            b00 b00Var = f00Var.E;
                            f00 f00Var2 = b00Var.d;
                            ArrayList arrayList4 = f00Var2.h;
                            SparseIntArray sparseIntArray = f00Var2.f28237g0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((c00) arrayList4.get(i17)).f27251a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (c00) arrayList4.remove(i17));
                                ((c00) arrayList4.get(0)).f27251a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((c00) arrayList4.get(i21)).f27251a = i21;
                                    dialogFilters.get(i21).order = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (f00Var2.G == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        f00Var2.H = i11;
                                        f00Var2.G = i11;
                                    }
                                    if (f00Var2.m0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        f00Var2.f28244n0 = i10;
                                        f00Var2.m0 = i10;
                                    }
                                }
                                b00Var.p(i17, 0);
                                a00 a00Var = f00Var2.F;
                                int i23 = ((c00) arrayList4.get(i17)).f27251a;
                                org.telegram.ui.fw fwVar = (org.telegram.ui.fw) a00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.ey[] eyVarArr = fwVar.f38242b.f38256a0;
                                    if (i24 < eyVarArr.length) {
                                        org.telegram.ui.ey eyVar = eyVarArr[i24];
                                        int i25 = eyVar.h;
                                        if (i25 == i23) {
                                            eyVar.h = i19;
                                        } else if (i25 == i19) {
                                            eyVar.h = i23;
                                        }
                                        i24++;
                                    } else {
                                        f00Var2.j();
                                        f00Var2.f28257y = true;
                                        f00Var2.B.setItemAnimator(f00Var2.f28245o0);
                                    }
                                }
                            }
                            f00Var.B.u0(0);
                            org.telegram.ui.ew ewVar = (org.telegram.ui.ew) f00Var;
                            org.telegram.ui.fy fyVar = ewVar.f37909x0;
                            if (!fyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    ewVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                mc I = tc.a0(fyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.ui(ewVar, 22));
                                I.k(true);
                                fyVar.f38306j3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                n00 n00Var = (n00) obj;
                if (!n00Var.f30795c) {
                    n00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((w20) obj).g(true);
                return;
            case 20:
                org.telegram.ui.ox oxVar = ((kn0) ((c40) obj)).Y;
                if (!oxVar.f33003q0.canScrollVertically(-1)) {
                    oxVar.f33002p0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((e40) obj).f27922b.b(true);
                return;
            case 22:
                ((e40) obj).f27922b.b(true);
                return;
            case 23:
                u40 u40Var = (u40) obj;
                aj0 aj0Var = u40Var.f33127f;
                if (u40Var.f33128n) {
                    aj0Var.getAnimatedDrawable().I(0);
                    aj0Var.setAnimation(u40Var.f33129r);
                    aj0Var.d();
                    return;
                }
                return;
            case 24:
                s50 s50Var = (s50) ((nh.g2) obj).f17691b;
                try {
                    x61 x61Var = s50Var.K;
                    if (x61Var != null && (videoEditedInfo = s50Var.J) != null) {
                        long j11 = 0;
                        if (videoEditedInfo.endTime > 0) {
                            long o10 = x61Var.o();
                            VideoEditedInfo videoEditedInfo2 = s50Var.J;
                            if (o10 >= videoEditedInfo2.endTime) {
                                x61 x61Var2 = s50Var.K;
                                long j12 = videoEditedInfo2.startTime;
                                if (j12 > 0) {
                                    j11 = j12;
                                }
                                x61Var2.L(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 25:
                n90 n90Var = (n90) obj;
                if (n90Var.d) {
                    n90Var.f30938e = true;
                    n90Var.f30941r = false;
                    n90Var.f30939f = 0.0f;
                    n90Var.h = SystemClock.uptimeMillis();
                    n90Var.invalidate();
                    return;
                }
                return;
            case 26:
                y90 y90Var = (y90) obj;
                Activity parentActivity = y90Var.getParentActivity();
                Activity parentActivity2 = y90Var.getParentActivity();
                DispatchQueue dispatchQueue = ag.d2.f441m;
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
                ka0 ka0Var2 = (ka0) obj;
                boolean z12 = ka0Var2.E;
                boolean z13 = !z12;
                rf.a1 a1Var = ka0Var2.f29998e;
                ja0 ja0Var = ka0Var2.f29996b;
                if (ja0Var != null && a1Var != null) {
                    if (ka0Var2.H && (kVar = ka0Var2.G) != null && kVar.f19039f && !z12) {
                        ka0Var2.K = 0;
                        return;
                    }
                    boolean g10 = ka0Var2.g();
                    if (!z12) {
                        f9 = (-ka0Var2.f30002s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = ja0Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - a1Var.h) + ka0Var2.f30002s;
                        if (computeVerticalScrollRange <= 0 && ka0Var2.f29999f.K() > 0 && (i12 = ka0Var2.K) < 3) {
                            ka0Var2.K = i12 + 1;
                            ka0Var2.o(true);
                            return;
                        }
                        f9 = f11;
                    }
                    ka0Var2.K = 0;
                    float f12 = ka0Var2.v;
                    if (g10) {
                        max = -Math.max(0.0f, f12 - f9);
                    } else {
                        max = Math.max(0.0f, f12 - f9) + (-f12);
                    }
                    if (!z12 && !g10) {
                        max += ja0Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    o1.k kVar2 = ka0Var2.G;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    ka0Var2.H = z13;
                    final float translationY = ja0Var.getTranslationY();
                    final float f14 = ka0Var2.I;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f13) {
                        ka0Var2.G = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (ka0Var2.J && !z12) {
                            ka0Var2.J = false;
                            ja0Var.setLayoutManager(ka0Var2.getNeededLayoutManager());
                            ka0Var2.E = true;
                            ka0Var2.o(true);
                        }
                        ka0Var = ka0Var2;
                    } else {
                        o1.k kVar3 = new o1.k(new ib.a(translationY));
                        o1.l lVar = new o1.l(f13);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f19045u = lVar;
                        ka0Var2.G = kVar3;
                        ka0Var = ka0Var2;
                        final float f15 = f10;
                        kVar3.b(new o1.h() {
                            @Override
                            public final void a(o1.i iVar, float f16, float f17) {
                                ka0 ka0Var3 = ka0.this;
                                ka0Var3.f29996b.setTranslationY(f16);
                                ka0Var3.i();
                                float f18 = translationY;
                                ka0Var3.I = AndroidUtilities.lerp(f14, f15, (f16 - f18) / (f13 - f18));
                            }
                        });
                        if (!z12) {
                            ka0Var.G.a(new bg.a0(ka0Var, z13, 2));
                        }
                        ka0Var.G.a(new Object());
                        ka0Var.G.f();
                    }
                    if (num != null && ka0Var.getVisibility() != num.intValue()) {
                        ka0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                ka0Var2.K = 0;
                return;
            case 28:
                ((za0) obj).S.f30278n.l();
                return;
            default:
                ((vb0) obj).a();
                return;
        }
    }

    public rp(bu buVar, z80 z80Var, ClickableSpan clickableSpan) {
        this.f32353a = 9;
        this.f32354b = buVar;
    }
}
