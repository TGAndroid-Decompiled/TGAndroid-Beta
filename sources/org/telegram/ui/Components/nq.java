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
public final class nq implements Runnable {
    public final int f29255a;
    public final Object f29256b;

    public nq(Object obj, int i10) {
        this.f29255a = i10;
        this.f29256b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        me.b bVar;
        int i10;
        int i11;
        VideoEditedInfo videoEditedInfo;
        float f7;
        int i12;
        float max;
        final pb0 pb0Var;
        int i13;
        o1.k kVar;
        int i14 = this.f29255a;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f29256b;
        switch (i14) {
            case 0:
                ((sq) obj).dismiss();
                return;
            case 1:
                ((hr) obj).a();
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
                wr wrVar = ((ur) obj).f31597c;
                TLRPC.Peer peer = wrVar.f32662d0;
                org.telegram.ui.ActionBar.n2 n2Var = wrVar.f32664f0;
                long j3 = wrVar.f32665g0;
                if (wrVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ds dsVar = new ds(n2Var, peer, j3, z10, wrVar.X);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(dsVar);
                    return;
                } else {
                    dsVar.show();
                    return;
                }
            case 4:
                ((ci.d) obj).setLoading(true);
                return;
            case 5:
                ys ysVar = (ys) obj;
                ysVar.f33337a.a(!bVar.f16338f, true);
                AndroidUtilities.runOnUIThread(ysVar.f33341f, 3000L);
                return;
            case 6:
                ((yo0) obj).V(false);
                return;
            case 7:
                ((du) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((av) obj).getClass();
                return;
            case 10:
                of.f.s(((gv) obj).f26884a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                lv lvVar = ((kv) obj).f28171a;
                lvVar.f28602n.setVisibility(4);
                lvVar.h.setVisibility(4);
                ImageView imageView = lvVar.f28606x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((dw) obj).a(true, true);
                return;
            case 13:
                xx xxVar = (xx) obj;
                if (xxVar.Y.getEmojiView() != null) {
                    a00 emojiView = xxVar.Y.getEmojiView();
                    if (!emojiView.f24411f0) {
                        try {
                            int i15 = emojiView.R.f27798s.get(EmojiData.dataColored.length);
                            if (i15 > 0) {
                                emojiView.P.B0();
                                emojiView.U(i15);
                                emojiView.G(i15, AndroidUtilities.dp(-9.0f));
                                emojiView.o(0, null);
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
                ry ryVar = (ry) obj;
                ryVar.f30541s.f29304f = true;
                ryVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((mz) obj).h, true);
                return;
            case 16:
                tz tzVar = (tz) obj;
                ArrayList arrayList = tzVar.f31316r;
                ArrayList arrayList2 = tzVar.h;
                vz vzVar = tzVar.f31318w;
                int i16 = vzVar.M;
                a00 a00Var = vzVar.Q;
                ix ixVar = a00Var.D0;
                if (i16 == tzVar.f31311b) {
                    arrayList2.remove(arrayList);
                    vzVar.E = tzVar.f31312c;
                    vzVar.F = tzVar.d;
                    vzVar.G = tzVar.f31313e;
                    vzVar.H = tzVar.f31314f;
                    vzVar.I = arrayList2;
                    vzVar.J = tzVar.f31315n;
                    vzVar.K = new ArrayList(arrayList);
                    a00Var.G0.e(false);
                    s4.i0 adapter = ixVar.getAdapter();
                    vz vzVar2 = a00Var.f24475z0;
                    if (adapter != vzVar2) {
                        ixVar.setAdapter(vzVar2);
                    }
                    vzVar.l();
                    return;
                }
                return;
            case 17:
                a10 a10Var = ((z00) obj).f33408e;
                ArrayList arrayList3 = a10Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((w00) arrayList3.get(i17)).f32501e && i17 != 0) {
                            v00 v00Var = a10Var.I;
                            a10 a10Var2 = v00Var.d;
                            ArrayList arrayList4 = a10Var2.h;
                            SparseIntArray sparseIntArray = a10Var2.f24513k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((w00) arrayList4.get(i17)).f32498a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (w00) arrayList4.remove(i17));
                                ((w00) arrayList4.get(0)).f32498a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((w00) arrayList4.get(i21)).f32498a = i21;
                                    dialogFilters.get(i21).order = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (a10Var2.K == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        a10Var2.L = i11;
                                        a10Var2.K = i11;
                                    }
                                    if (a10Var2.f24519q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        a10Var2.f24521r0 = i10;
                                        a10Var2.f24519q0 = i10;
                                    }
                                }
                                v00Var.p(i17, 0);
                                u00 u00Var = a10Var2.J;
                                int i23 = ((w00) arrayList4.get(i17)).f32498a;
                                org.telegram.ui.sw swVar = (org.telegram.ui.sw) u00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.sy[] syVarArr = swVar.f41780b.f42174e0;
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
                                        a10Var2.j();
                                        a10Var2.f24531y = true;
                                        a10Var2.F.setItemAnimator(a10Var2.f24523s0);
                                    }
                                }
                            }
                            a10Var.F.u0(0);
                            org.telegram.ui.qw qwVar = (org.telegram.ui.qw) a10Var;
                            org.telegram.ui.ty tyVar = qwVar.B0;
                            if (!tyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    qwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                tc I = ad.a0(tyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.cj(qwVar, 23));
                                I.k(true);
                                tyVar.f42220n3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                h10 h10Var = (h10) obj;
                if (!h10Var.f26929c) {
                    h10Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((q30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.dy dyVar = ((uo0) ((v40) obj)).f31585c0;
                if (!dyVar.f25784u0.canScrollVertically(-1)) {
                    dyVar.f25783t0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((x40) obj).f32745b.b(true);
                return;
            case 22:
                ((x40) obj).f32745b.b(true);
                return;
            case 23:
                o50 o50Var = (o50) obj;
                fk0 fk0Var = o50Var.f29393f;
                if (o50Var.f29394n) {
                    fk0Var.getAnimatedDrawable().K(0);
                    fk0Var.setAnimation(o50Var.f29395r);
                    fk0Var.d();
                    return;
                }
                return;
            case 24:
                t60 t60Var = (t60) ((ci.n2) obj).f5631b;
                try {
                    k81 k81Var = t60Var.T;
                    if (k81Var != null && (videoEditedInfo = t60Var.S) != null) {
                        long j10 = 0;
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = k81Var.n();
                            VideoEditedInfo videoEditedInfo2 = t60Var.S;
                            if (n10 >= videoEditedInfo2.endTime) {
                                k81 k81Var2 = t60Var.T;
                                long j11 = videoEditedInfo2.startTime;
                                if (j11 > 0) {
                                    j10 = j11;
                                }
                                k81Var2.K(j10);
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
                ta0 ta0Var = (ta0) obj;
                if (ta0Var.d) {
                    ta0Var.f31114e = true;
                    ta0Var.f31117r = false;
                    ta0Var.f31115f = 0.0f;
                    ta0Var.h = SystemClock.uptimeMillis();
                    ta0Var.invalidate();
                    return;
                }
                return;
            case 26:
                db0 db0Var = (db0) obj;
                Activity parentActivity = db0Var.getParentActivity();
                Activity parentActivity2 = db0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.m1.f45692m;
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
                pb0 pb0Var2 = (pb0) obj;
                boolean z12 = pb0Var2.I;
                boolean z13 = !z12;
                gg.p1 p1Var = pb0Var2.f29829e;
                ob0 ob0Var = pb0Var2.f29827b;
                if (ob0Var != null && p1Var != null) {
                    if (pb0Var2.L && (kVar = pb0Var2.K) != null && kVar.f16931f && !z12) {
                        pb0Var2.O = 0;
                        return;
                    }
                    boolean g10 = pb0Var2.g();
                    if (!z12) {
                        f7 = (-pb0Var2.f29833s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = ob0Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - p1Var.h) + pb0Var2.f29833s;
                        if (computeVerticalScrollRange <= 0 && pb0Var2.f29830f.K() > 0 && (i12 = pb0Var2.O) < 3) {
                            pb0Var2.O = i12 + 1;
                            pb0Var2.o(true);
                            return;
                        }
                        f7 = f11;
                    }
                    pb0Var2.O = 0;
                    float f12 = pb0Var2.v;
                    if (g10) {
                        max = -Math.max(0.0f, f12 - f7);
                    } else {
                        max = Math.max(0.0f, f12 - f7) + (-f12);
                    }
                    if (!z12 && !g10) {
                        max += ob0Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    o1.k kVar2 = pb0Var2.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    pb0Var2.L = z13;
                    final float translationY = ob0Var.getTranslationY();
                    final float f14 = pb0Var2.M;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f13) {
                        pb0Var2.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (pb0Var2.N && !z12) {
                            pb0Var2.N = false;
                            ob0Var.setLayoutManager(pb0Var2.getNeededLayoutManager());
                            pb0Var2.I = true;
                            pb0Var2.o(true);
                        }
                        pb0Var = pb0Var2;
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f13);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f16938u = lVar;
                        pb0Var2.K = kVar3;
                        pb0Var = pb0Var2;
                        final float f15 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f16, float f17) {
                                pb0 pb0Var3 = pb0.this;
                                pb0Var3.f29827b.setTranslationY(f16);
                                pb0Var3.i();
                                float f18 = translationY;
                                pb0Var3.M = AndroidUtilities.lerp(f14, f15, (f16 - f18) / (f13 - f18));
                            }
                        });
                        if (!z12) {
                            pb0Var.K.a(new ci.x4(pb0Var, z13, 2));
                        }
                        pb0Var.K.a(new Object());
                        pb0Var.K.h();
                    }
                    if (num != null && pb0Var.getVisibility() != num.intValue()) {
                        pb0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                pb0Var2.O = 0;
                return;
            case 28:
                ((dc0) obj).S.f29848n.l();
                return;
            default:
                ((zc0) obj).a();
                return;
        }
    }

    public nq(av avVar, fa0 fa0Var, ClickableSpan clickableSpan) {
        this.f29255a = 9;
        this.f29256b = avVar;
    }
}
