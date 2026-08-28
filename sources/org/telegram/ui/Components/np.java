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
public final class np implements Runnable {
    public final int f31143a;
    public final Object f31144b;

    public np(Object obj, int i9) {
        this.f31143a = i9;
        this.f31144b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        td.a aVar;
        int i9;
        int i10;
        VideoEditedInfo videoEditedInfo;
        float f10;
        int i11;
        float max;
        final w90 w90Var;
        int i12;
        o1.j jVar;
        int i13 = this.f31143a;
        float f11 = 0.0f;
        Integer num = null;
        Object obj = this.f31144b;
        switch (i13) {
            case 0:
                ((sp) obj).dismiss();
                return;
            case 1:
                ((hq) obj).a();
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
                wq wqVar = ((uq) obj).f33114c;
                TLRPC.Peer peer = wqVar.Z;
                org.telegram.ui.ActionBar.o2 o2Var = wqVar.f34317b0;
                long j10 = wqVar.f34318c0;
                if (wqVar.U.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cr crVar = new cr(o2Var, peer, j10, z10, wqVar.T);
                if (o2Var.getParentActivity() != null) {
                    o2Var.showDialog(crVar);
                    return;
                } else {
                    crVar.show();
                    return;
                }
            case 4:
                ((kh.d) obj).setLoading(true);
                return;
            case 5:
                zr zrVar = (zr) obj;
                zrVar.f35360a.a(!aVar.f47776f, true);
                AndroidUtilities.runOnUIThread(zrVar.f35364f, 3000L);
                return;
            case 6:
                ((cn0) obj).V(false);
                return;
            case 7:
                ((zs) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((vt) obj).getClass();
                return;
            case 10:
                ve.e.s(((bu) obj).f27278a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                gu guVar = ((fu) obj).f28568a;
                guVar.f28872n.setVisibility(4);
                guVar.h.setVisibility(4);
                ImageView imageView = guVar.f28876x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((yu) obj).a(true, true);
                return;
            case 13:
                uw uwVar = (uw) obj;
                if (uwVar.U.getEmojiView() != null) {
                    wy emojiView = uwVar.U.getEmojiView();
                    if (!emojiView.f34387b0) {
                        try {
                            int i14 = emojiView.N.f28593s.get(EmojiData.dataColored.length);
                            if (i14 > 0) {
                                emojiView.L.B0();
                                emojiView.V(i14);
                                emojiView.H(i14, AndroidUtilities.dp(-9.0f));
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
                nx nxVar = (nx) obj;
                nxVar.f31200s.f29868f = true;
                nxVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((jy) obj).h, true);
                return;
            case 16:
                py pyVar = (py) obj;
                ArrayList arrayList = pyVar.f31776r;
                ArrayList arrayList2 = pyVar.h;
                ry ryVar = pyVar.f31778w;
                int i15 = ryVar.I;
                wy wyVar = ryVar.M;
                fw fwVar = wyVar.f34466z0;
                if (i15 == pyVar.f31771b) {
                    arrayList2.remove(arrayList);
                    ryVar.A = pyVar.f31772c;
                    ryVar.B = pyVar.d;
                    ryVar.C = pyVar.f31773e;
                    ryVar.D = pyVar.f31774f;
                    ryVar.E = arrayList2;
                    ryVar.F = pyVar.f31775n;
                    ryVar.G = new ArrayList(arrayList);
                    wyVar.C0.e(false);
                    f2.r0 adapter = fwVar.getAdapter();
                    ry ryVar2 = wyVar.f34451v0;
                    if (adapter != ryVar2) {
                        fwVar.setAdapter(ryVar2);
                    }
                    ryVar.l();
                    return;
                }
                return;
            case 17:
                vz vzVar = ((uz) obj).f33173e;
                ArrayList arrayList3 = vzVar.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        if (((sz) arrayList3.get(i16)).f32575e && i16 != 0) {
                            rz rzVar = vzVar.E;
                            vz vzVar2 = rzVar.d;
                            ArrayList arrayList4 = vzVar2.h;
                            SparseIntArray sparseIntArray = vzVar2.f34041g0;
                            int size = arrayList4.size();
                            if (i16 >= 0 && i16 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i17 = sparseIntArray.get(i16);
                                int i18 = ((sz) arrayList4.get(i16)).f32572a;
                                for (int i19 = i16 - 1; i19 >= 0; i19--) {
                                    sparseIntArray.put(i19 + 1, sparseIntArray.get(i19));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i16);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i17);
                                arrayList4.add(0, (sz) arrayList4.remove(i16));
                                ((sz) arrayList4.get(0)).f32572a = i18;
                                for (int i20 = 0; i20 <= i16; i20++) {
                                    ((sz) arrayList4.get(i20)).f32572a = i20;
                                    dialogFilters.get(i20).order = i20;
                                }
                                for (int i21 = 0; i21 <= i16; i21++) {
                                    if (vzVar2.G == i21) {
                                        if (i21 == i16) {
                                            i10 = 0;
                                        } else {
                                            i10 = i21 + 1;
                                        }
                                        vzVar2.H = i10;
                                        vzVar2.G = i10;
                                    }
                                    if (vzVar2.m0 == i21) {
                                        if (i21 == i16) {
                                            i9 = 0;
                                        } else {
                                            i9 = i21 + 1;
                                        }
                                        vzVar2.f34048n0 = i9;
                                        vzVar2.m0 = i9;
                                    }
                                }
                                rzVar.p(i16, 0);
                                qz qzVar = vzVar2.F;
                                int i22 = ((sz) arrayList4.get(i16)).f32572a;
                                org.telegram.ui.dw dwVar = (org.telegram.ui.dw) qzVar;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.cy[] cyVarArr = dwVar.f37619b.f37629a0;
                                    if (i23 < cyVarArr.length) {
                                        org.telegram.ui.cy cyVar = cyVarArr[i23];
                                        int i24 = cyVar.h;
                                        if (i24 == i22) {
                                            cyVar.h = i18;
                                        } else if (i24 == i18) {
                                            cyVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        vzVar2.j();
                                        vzVar2.f34061y = true;
                                        vzVar2.B.setItemAnimator(vzVar2.f34049o0);
                                    }
                                }
                            }
                            vzVar.B.u0(0);
                            org.telegram.ui.cw cwVar = (org.telegram.ui.cw) vzVar;
                            org.telegram.ui.dy dyVar = cwVar.f37335x0;
                            if (!dyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    cwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                gc I = oc.a0(dyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.ri(cwVar, 22));
                                I.k(true);
                                dyVar.f37679j3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                c00 c00Var = (c00) obj;
                if (!c00Var.f27322c) {
                    c00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((j20) obj).g(true);
                return;
            case 20:
                org.telegram.ui.mx mxVar = ((ym0) ((o30) obj)).Y;
                if (!mxVar.f29150q0.canScrollVertically(-1)) {
                    mxVar.f29149p0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((q30) obj).f31824b.b(true);
                return;
            case 22:
                ((q30) obj).f31824b.b(true);
                return;
            case 23:
                g40 g40Var = (g40) obj;
                pi0 pi0Var = g40Var.f28639f;
                if (g40Var.f28640n) {
                    pi0Var.getAnimatedDrawable().I(0);
                    pi0Var.setAnimation(g40Var.f28641r);
                    pi0Var.d();
                    return;
                }
                return;
            case 24:
                f50 f50Var = (f50) ((kh.j2) obj).f15459b;
                try {
                    k61 k61Var = f50Var.K;
                    if (k61Var != null && (videoEditedInfo = f50Var.J) != null) {
                        long j11 = 0;
                        if (videoEditedInfo.endTime > 0) {
                            long o6 = k61Var.o();
                            VideoEditedInfo videoEditedInfo2 = f50Var.J;
                            if (o6 >= videoEditedInfo2.endTime) {
                                k61 k61Var2 = f50Var.K;
                                long j12 = videoEditedInfo2.startTime;
                                if (j12 > 0) {
                                    j11 = j12;
                                }
                                k61Var2.L(j11);
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
                a90 a90Var = (a90) obj;
                if (a90Var.d) {
                    a90Var.f26738e = true;
                    a90Var.f26741r = false;
                    a90Var.f26739f = 0.0f;
                    a90Var.h = SystemClock.uptimeMillis();
                    a90Var.invalidate();
                    return;
                }
                return;
            case 26:
                k90 k90Var = (k90) obj;
                Activity parentActivity = k90Var.getParentActivity();
                Activity parentActivity2 = k90Var.getParentActivity();
                DispatchQueue dispatchQueue = xf.k1.f49254m;
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
                w90 w90Var2 = (w90) obj;
                boolean z12 = w90Var2.E;
                boolean z13 = !z12;
                of.k1 k1Var = w90Var2.f34158e;
                v90 v90Var = w90Var2.f34156b;
                if (v90Var != null && k1Var != null) {
                    if (w90Var2.H && (jVar = w90Var2.G) != null && jVar.f18794f && !z12) {
                        w90Var2.K = 0;
                        return;
                    }
                    boolean g10 = w90Var2.g();
                    if (!z12) {
                        f10 = (-w90Var2.f34162s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = v90Var.computeVerticalScrollRange();
                        float f12 = (computeVerticalScrollRange - k1Var.h) + w90Var2.f34162s;
                        if (computeVerticalScrollRange <= 0 && w90Var2.f34159f.K() > 0 && (i11 = w90Var2.K) < 3) {
                            w90Var2.K = i11 + 1;
                            w90Var2.o(true);
                            return;
                        }
                        f10 = f12;
                    }
                    w90Var2.K = 0;
                    float f13 = w90Var2.v;
                    if (g10) {
                        max = -Math.max(0.0f, f13 - f10);
                    } else {
                        max = Math.max(0.0f, f13 - f10) + (-f13);
                    }
                    if (!z12 && !g10) {
                        max += v90Var.computeVerticalScrollOffset();
                    }
                    final float f14 = max;
                    o1.j jVar2 = w90Var2.G;
                    if (jVar2 != null) {
                        jVar2.c();
                    }
                    w90Var2.H = z13;
                    final float translationY = v90Var.getTranslationY();
                    final float f15 = w90Var2.I;
                    if (!z12) {
                        f11 = 1.0f;
                    }
                    if (translationY == f14) {
                        w90Var2.G = null;
                        if (!z12) {
                            i12 = 8;
                        } else {
                            i12 = 0;
                        }
                        num = Integer.valueOf(i12);
                        if (w90Var2.J && !z12) {
                            w90Var2.J = false;
                            v90Var.setLayoutManager(w90Var2.getNeededLayoutManager());
                            w90Var2.E = true;
                            w90Var2.o(true);
                        }
                        w90Var = w90Var2;
                    } else {
                        o1.j jVar3 = new o1.j(new gb.a(translationY));
                        o1.k kVar = new o1.k(f14);
                        kVar.a(1.0f);
                        kVar.b(550.0f);
                        jVar3.f18800u = kVar;
                        w90Var2.G = jVar3;
                        w90Var = w90Var2;
                        final float f16 = f11;
                        jVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f17, float f18) {
                                w90 w90Var3 = w90.this;
                                w90Var3.f34156b.setTranslationY(f17);
                                w90Var3.i();
                                float f19 = translationY;
                                w90Var3.I = AndroidUtilities.lerp(f15, f16, (f17 - f19) / (f14 - f19));
                            }
                        });
                        if (!z12) {
                            w90Var.G.a(new kh.r4(w90Var, z13, 2));
                        }
                        w90Var.G.a(new Object());
                        w90Var.G.f();
                    }
                    if (num != null && w90Var.getVisibility() != num.intValue()) {
                        w90Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                w90Var2.K = 0;
                return;
            case 28:
                ((ka0) obj).S.f34173n.l();
                return;
            default:
                ((gb0) obj).a();
                return;
        }
    }

    public np(vt vtVar, m80 m80Var, ClickableSpan clickableSpan) {
        this.f31143a = 9;
        this.f31144b = vtVar;
    }
}
