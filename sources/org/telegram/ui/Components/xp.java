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
    public final int f30382a;
    public final Object f30383b;

    public xp(Object obj, int i10) {
        this.f30382a = i10;
        this.f30383b = obj;
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
        int i14 = this.f30382a;
        long j3 = 0;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f30383b;
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
                gr grVar = ((er) obj).f24021c;
                TLRPC.Peer peer = grVar.f24609d0;
                org.telegram.ui.ActionBar.n2 n2Var = grVar.f24611f0;
                long j10 = grVar.f24612g0;
                if (grVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mr mrVar = new mr(n2Var, peer, j10, z10, grVar.X);
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
                isVar.f25176a.a(!bVar.f14185f, true);
                AndroidUtilities.runOnUIThread(isVar.f25179f, 3000L);
                return;
            case 6:
                ((io0) obj).V(false);
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
                nf.f.s(((qu) obj).f27676a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                vu vuVar = ((uu) obj).f28900a;
                vuVar.f29800n.setVisibility(4);
                vuVar.h.setVisibility(4);
                ImageView imageView = vuVar.f29804x;
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
                    if (!emojiView.f25867f0) {
                        try {
                            int i15 = emojiView.R.f28550s.get(EmojiData.dataColored.length);
                            if (i15 > 0) {
                                emojiView.P.C0();
                                emojiView.U(i15);
                                emojiView.F(i15, AndroidUtilities.dp(-9.0f));
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
                cyVar.f23496s.f30424f = true;
                cyVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((xy) obj).h, true);
                return;
            case 16:
                dz dzVar = (dz) obj;
                ArrayList arrayList = dzVar.f23784r;
                ArrayList arrayList2 = dzVar.h;
                fz fzVar = dzVar.f23786w;
                int i16 = fzVar.M;
                kz kzVar = fzVar.Q;
                tw twVar = kzVar.D0;
                if (i16 == dzVar.f23780b) {
                    arrayList2.remove(arrayList);
                    fzVar.E = dzVar.f23781c;
                    fzVar.F = dzVar.d;
                    fzVar.G = dzVar.e;
                    fzVar.H = dzVar.f23782f;
                    fzVar.I = arrayList2;
                    fzVar.J = dzVar.f23783n;
                    fzVar.K = new ArrayList(arrayList);
                    kzVar.G0.e(false);
                    s4.h0 adapter = twVar.getAdapter();
                    fz fzVar2 = kzVar.f25931z0;
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
                            SparseIntArray sparseIntArray = k00Var2.f25537k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((g00) arrayList4.get(i17)).f24392a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (g00) arrayList4.remove(i17));
                                ((g00) arrayList4.get(0)).f24392a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((g00) arrayList4.get(i21)).f24392a = i21;
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
                                    if (k00Var2.f25543q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        k00Var2.f25545r0 = i10;
                                        k00Var2.f25543q0 = i10;
                                    }
                                }
                                f00Var.p(i17, 0);
                                e00 e00Var = k00Var2.J;
                                int i23 = ((g00) arrayList4.get(i17)).f24392a;
                                org.telegram.ui.tw twVar2 = (org.telegram.ui.tw) e00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.ty[] tyVarArr = twVar2.f37890b.f38277e0;
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
                                        k00Var2.f25555y = true;
                                        k00Var2.F.setItemAnimator(k00Var2.f25547s0);
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
                                pc I = xc.a0(uyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.dj(swVar, 22));
                                I.k(true);
                                uyVar.f38323n3 = I;
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
                if (!r00Var.f27742c) {
                    r00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((z20) obj).g(true);
                return;
            case 20:
                org.telegram.ui.ey eyVar = ((eo0) ((e40) obj)).f24010c0;
                if (!eyVar.f26856v0.canScrollVertically(-1)) {
                    eyVar.f26855u0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((g40) obj).f24409b.b(true);
                return;
            case 22:
                ((g40) obj).f24409b.b(true);
                return;
            case 23:
                w40 w40Var = (w40) obj;
                nj0 nj0Var = w40Var.f29913f;
                if (w40Var.f29914n) {
                    nj0Var.getAnimatedDrawable().K(0);
                    nj0Var.setAnimation(w40Var.f29915r);
                    nj0Var.d();
                    return;
                }
                return;
            case 24:
                c60 c60Var = (c60) ((ci.p2) obj).f5302b;
                try {
                    v71 v71Var = c60Var.T;
                    if (v71Var != null && (videoEditedInfo = c60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = v71Var.n();
                        VideoEditedInfo videoEditedInfo2 = c60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            v71 v71Var2 = c60Var.T;
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
                b60 b60Var = (b60) obj;
                ki.p0 p0Var = b60Var.O;
                if (p0Var != null && p0Var.f13812a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j12 = b60Var.f22894v0;
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
                    ca0Var.f23336r = false;
                    ca0Var.f23334f = 0.0f;
                    ca0Var.h = SystemClock.uptimeMillis();
                    ca0Var.invalidate();
                    return;
                }
                return;
            case 27:
                ma0 ma0Var = (ma0) obj;
                Activity parentActivity = ma0Var.getParentActivity();
                Activity parentActivity2 = ma0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.n1.f41228m;
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
                final ya0 ya0Var = (ya0) obj;
                boolean z12 = ya0Var.I;
                boolean z13 = !z12;
                gg.q1 q1Var = ya0Var.e;
                xa0 xa0Var = ya0Var.f30616b;
                if (xa0Var != null && q1Var != null) {
                    if (ya0Var.L && (kVar = ya0Var.K) != null && kVar.f15530f && !z12) {
                        ya0Var.O = 0;
                        return;
                    }
                    boolean g10 = ya0Var.g();
                    if (!z12) {
                        f7 = (-ya0Var.f30621s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = xa0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - q1Var.h) + ya0Var.f30621s;
                        if (computeVerticalScrollRange <= 0 && ya0Var.f30618f.K() > 0 && (i12 = ya0Var.O) < 3) {
                            ya0Var.O = i12 + 1;
                            ya0Var.o(true);
                            return;
                        }
                    }
                    ya0Var.O = 0;
                    float f11 = ya0Var.v;
                    if (g10) {
                        max = -Math.max(0.0f, f11 - f7);
                    } else {
                        max = Math.max(0.0f, f11 - f7) + (-f11);
                    }
                    if (!z12 && !g10) {
                        max += xa0Var.computeVerticalScrollOffset();
                    }
                    final float f12 = max;
                    o1.k kVar2 = ya0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    ya0Var.L = z13;
                    final float translationY = xa0Var.getTranslationY();
                    final float f13 = ya0Var.M;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f12) {
                        ya0Var.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (ya0Var.N && !z12) {
                            ya0Var.N = false;
                            xa0Var.setLayoutManager(ya0Var.getNeededLayoutManager());
                            ya0Var.I = true;
                            ya0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f12);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f15537u = lVar;
                        ya0Var.K = kVar3;
                        final float f14 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f15, float f16) {
                                ya0 ya0Var2 = ya0.this;
                                ya0Var2.f30616b.setTranslationY(f15);
                                ya0Var2.i();
                                float f17 = translationY;
                                ya0Var2.M = AndroidUtilities.lerp(f13, f14, (f15 - f17) / (f12 - f17));
                            }
                        });
                        if (!z12) {
                            ya0Var.K.a(new ci.z4(ya0Var, z13, 2));
                        }
                        ya0Var.K.a(new Object());
                        ya0Var.K.f();
                    }
                    if (num != null && ya0Var.getVisibility() != num.intValue()) {
                        ya0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                ya0Var.O = 0;
                return;
            default:
                ((nb0) obj).S.f22627n.l();
                return;
        }
    }

    public xp(ku kuVar, o90 o90Var, ClickableSpan clickableSpan) {
        this.f30382a = 9;
        this.f30383b = kuVar;
    }
}
