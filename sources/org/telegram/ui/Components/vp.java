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
public final class vp implements Runnable {
    public final int f30063a;
    public final Object f30064b;

    public vp(Object obj, int i10) {
        this.f30063a = i10;
        this.f30064b = obj;
    }

    @Override
    public final void run() {
        boolean z4;
        xd.a aVar;
        int i10;
        int i11;
        VideoEditedInfo videoEditedInfo;
        float f10;
        int i12;
        float max;
        final pa0 pa0Var;
        int i13;
        o1.j jVar;
        int i14 = this.f30063a;
        float f11 = 0.0f;
        Integer num = null;
        Object obj = this.f30064b;
        switch (i14) {
            case 0:
                ((aq) obj).dismiss();
                return;
            case 1:
                ((pq) obj).a();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.g3) obj).dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 3:
                er erVar = ((cr) obj).f24041c;
                TLRPC.Peer peer = erVar.f24633a0;
                org.telegram.ui.ActionBar.p2 p2Var = erVar.f24635c0;
                long j10 = erVar.f24636d0;
                if (erVar.V.size() > 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                jr jrVar = new jr(p2Var, peer, j10, z4, erVar.U);
                if (p2Var.getParentActivity() != null) {
                    p2Var.showDialog(jrVar);
                    return;
                } else {
                    jrVar.show();
                    return;
                }
            case 4:
                ((ph.d) obj).setLoading(true);
                return;
            case 5:
                hs hsVar = (hs) obj;
                hsVar.f25481a.a(!aVar.f46893f, true);
                AndroidUtilities.runOnUIThread(hsVar.f25484f, 3000L);
                return;
            case 6:
                ((yn0) obj).V(false);
                return;
            case 7:
                ((jt) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((eu) obj).getClass();
                return;
            case 10:
                af.g.s(((ku) obj).f26385a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                pu puVar = ((ou) obj).f27666a;
                puVar.f27987n.setVisibility(4);
                puVar.h.setVisibility(4);
                ImageView imageView = puVar.f27991x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((hv) obj).a(true, true);
                return;
            case 13:
                gx gxVar = (gx) obj;
                if (gxVar.V.getEmojiView() != null) {
                    kz emojiView = gxVar.V.getEmojiView();
                    if (!emojiView.f26417c0) {
                        try {
                            int i15 = emojiView.O.f28552s.get(EmojiData.dataColored.length);
                            if (i15 > 0) {
                                emojiView.M.B0();
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
                zx zxVar = (zx) obj;
                zxVar.f31470s.f30102f = true;
                zxVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((wy) obj).h, true);
                return;
            case 16:
                dz dzVar = (dz) obj;
                ArrayList arrayList = dzVar.f24393r;
                ArrayList arrayList2 = dzVar.h;
                fz fzVar = dzVar.f24395w;
                int i16 = fzVar.J;
                kz kzVar = fzVar.N;
                pw pwVar = kzVar.A0;
                if (i16 == dzVar.f24389b) {
                    arrayList2.remove(arrayList);
                    fzVar.B = dzVar.f24390c;
                    fzVar.C = dzVar.d;
                    fzVar.D = dzVar.e;
                    fzVar.E = dzVar.f24391f;
                    fzVar.F = arrayList2;
                    fzVar.G = dzVar.f24392n;
                    fzVar.H = new ArrayList(arrayList);
                    kzVar.D0.e(false);
                    f2.o0 adapter = pwVar.getAdapter();
                    fz fzVar2 = kzVar.f26480w0;
                    if (adapter != fzVar2) {
                        pwVar.setAdapter(fzVar2);
                    }
                    fzVar.l();
                    return;
                }
                return;
            case 17:
                j00 j00Var = ((i00) obj).e;
                ArrayList arrayList3 = j00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((g00) arrayList3.get(i17)).e && i17 != 0) {
                            f00 f00Var = j00Var.F;
                            j00 j00Var2 = f00Var.d;
                            ArrayList arrayList4 = j00Var2.h;
                            SparseIntArray sparseIntArray = j00Var2.f25825h0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((g00) arrayList4.get(i17)).f25005a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (g00) arrayList4.remove(i17));
                                ((g00) arrayList4.get(0)).f25005a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((g00) arrayList4.get(i21)).f25005a = i21;
                                    dialogFilters.get(i21).order = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (j00Var2.H == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        j00Var2.I = i11;
                                        j00Var2.H = i11;
                                    }
                                    if (j00Var2.f25831n0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        j00Var2.f25832o0 = i10;
                                        j00Var2.f25831n0 = i10;
                                    }
                                }
                                f00Var.p(i17, 0);
                                e00 e00Var = j00Var2.G;
                                int i23 = ((g00) arrayList4.get(i17)).f25005a;
                                org.telegram.ui.ow owVar = (org.telegram.ui.ow) e00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.ny[] nyVarArr = owVar.f36989b.f37009b0;
                                    if (i24 < nyVarArr.length) {
                                        org.telegram.ui.ny nyVar = nyVarArr[i24];
                                        int i25 = nyVar.h;
                                        if (i25 == i23) {
                                            nyVar.h = i19;
                                        } else if (i25 == i19) {
                                            nyVar.h = i23;
                                        }
                                        i24++;
                                    } else {
                                        j00Var2.j();
                                        j00Var2.f25845y = true;
                                        j00Var2.C.setItemAnimator(j00Var2.f25833p0);
                                    }
                                }
                            }
                            j00Var.C.u0(0);
                            org.telegram.ui.nw nwVar = (org.telegram.ui.nw) j00Var;
                            org.telegram.ui.oy oyVar = nwVar.f36733y0;
                            if (!oyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    nwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                ic I = qc.a0(oyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.zi(nwVar, 22));
                                I.k(true);
                                oyVar.f37058k3 = I;
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
                if (!r00Var.f28336c) {
                    r00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((a30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.xx xxVar = ((un0) ((g40) obj)).Z;
                if (!xxVar.f24333r0.canScrollVertically(-1)) {
                    xxVar.f24332q0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((i40) obj).f25553b.b(true);
                return;
            case 22:
                ((i40) obj).f25553b.b(true);
                return;
            case 23:
                y40 y40Var = (y40) obj;
                jj0 jj0Var = y40Var.f30844f;
                if (y40Var.f30845n) {
                    jj0Var.getAnimatedDrawable().I(0);
                    jj0Var.setAnimation(y40Var.f30846r);
                    jj0Var.d();
                    return;
                }
                return;
            case 24:
                x50 x50Var = (x50) ((g50) obj).f25049b;
                try {
                    i71 i71Var = x50Var.L;
                    if (i71Var != null && (videoEditedInfo = x50Var.K) != null) {
                        long j11 = 0;
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = i71Var.n();
                            VideoEditedInfo videoEditedInfo2 = x50Var.K;
                            if (n10 >= videoEditedInfo2.endTime) {
                                i71 i71Var2 = x50Var.L;
                                long j12 = videoEditedInfo2.startTime;
                                if (j12 > 0) {
                                    j11 = j12;
                                }
                                i71Var2.K(j11);
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
                t90 t90Var = (t90) obj;
                if (t90Var.d) {
                    t90Var.e = true;
                    t90Var.f28946r = false;
                    t90Var.f28944f = 0.0f;
                    t90Var.h = SystemClock.uptimeMillis();
                    t90Var.invalidate();
                    return;
                }
                return;
            case 26:
                da0 da0Var = (da0) obj;
                Activity parentActivity = da0Var.getParentActivity();
                Activity parentActivity2 = da0Var.getParentActivity();
                DispatchQueue dispatchQueue = cg.z1.f2584m;
                boolean z10 = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor edit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z10) {
                    edit.clear();
                } else {
                    edit.putBoolean("learning", true);
                }
                edit.apply();
                return;
            case 27:
                pa0 pa0Var2 = (pa0) obj;
                boolean z11 = pa0Var2.F;
                boolean z12 = !z11;
                tf.z0 z0Var = pa0Var2.e;
                oa0 oa0Var = pa0Var2.f27801b;
                if (oa0Var != null && z0Var != null) {
                    if (pa0Var2.I && (jVar = pa0Var2.H) != null && jVar.f16192f && !z11) {
                        pa0Var2.L = 0;
                        return;
                    }
                    boolean g10 = pa0Var2.g();
                    if (!z11) {
                        f10 = (-pa0Var2.f27806s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = oa0Var.computeVerticalScrollRange();
                        float f12 = (computeVerticalScrollRange - z0Var.h) + pa0Var2.f27806s;
                        if (computeVerticalScrollRange <= 0 && pa0Var2.f27803f.K() > 0 && (i12 = pa0Var2.L) < 3) {
                            pa0Var2.L = i12 + 1;
                            pa0Var2.o(true);
                            return;
                        }
                        f10 = f12;
                    }
                    pa0Var2.L = 0;
                    float f13 = pa0Var2.v;
                    if (g10) {
                        max = -Math.max(0.0f, f13 - f10);
                    } else {
                        max = Math.max(0.0f, f13 - f10) + (-f13);
                    }
                    if (!z11 && !g10) {
                        max += oa0Var.computeVerticalScrollOffset();
                    }
                    final float f14 = max;
                    o1.j jVar2 = pa0Var2.H;
                    if (jVar2 != null) {
                        jVar2.c();
                    }
                    pa0Var2.I = z12;
                    final float translationY = oa0Var.getTranslationY();
                    final float f15 = pa0Var2.J;
                    if (!z11) {
                        f11 = 1.0f;
                    }
                    if (translationY == f14) {
                        pa0Var2.H = null;
                        if (!z11) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (pa0Var2.K && !z11) {
                            pa0Var2.K = false;
                            oa0Var.setLayoutManager(pa0Var2.getNeededLayoutManager());
                            pa0Var2.F = true;
                            pa0Var2.o(true);
                        }
                        pa0Var = pa0Var2;
                    } else {
                        o1.j jVar3 = new o1.j(new kb.a(translationY));
                        o1.k kVar = new o1.k(f14);
                        kVar.a(1.0f);
                        kVar.b(550.0f);
                        jVar3.f16198u = kVar;
                        pa0Var2.H = jVar3;
                        pa0Var = pa0Var2;
                        final float f16 = f11;
                        jVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f17, float f18) {
                                pa0 pa0Var3 = pa0.this;
                                pa0Var3.f27801b.setTranslationY(f17);
                                pa0Var3.i();
                                float f19 = translationY;
                                pa0Var3.J = AndroidUtilities.lerp(f15, f16, (f17 - f19) / (f14 - f19));
                            }
                        });
                        if (!z11) {
                            pa0Var.H.a(new dg.z(pa0Var, z12, 2));
                        }
                        pa0Var.H.a(new Object());
                        pa0Var.H.f();
                    }
                    if (num != null && pa0Var.getVisibility() != num.intValue()) {
                        pa0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                pa0Var2.L = 0;
                return;
            case 28:
                ((db0) obj).S.f28106n.l();
                return;
            default:
                ((ac0) obj).a();
                return;
        }
    }

    public vp(eu euVar, f90 f90Var, ClickableSpan clickableSpan) {
        this.f30063a = 9;
        this.f30064b = euVar;
    }
}
