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
public final class up implements Runnable {
    public final int f29272a;
    public final Object f29273b;

    public up(Object obj, int i10) {
        this.f29272a = i10;
        this.f29273b = obj;
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
        final qa0 qa0Var;
        int i13;
        o1.j jVar;
        int i14 = this.f29272a;
        float f11 = 0.0f;
        Integer num = null;
        Object obj = this.f29273b;
        switch (i14) {
            case 0:
                ((zp) obj).dismiss();
                return;
            case 1:
                ((oq) obj).a();
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
                dr drVar = ((br) obj).f23738c;
                TLRPC.Peer peer = drVar.f24341a0;
                org.telegram.ui.ActionBar.p2 p2Var = drVar.f24343c0;
                long j10 = drVar.f24344d0;
                if (drVar.V.size() > 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ir irVar = new ir(p2Var, peer, j10, z4, drVar.U);
                if (p2Var.getParentActivity() != null) {
                    p2Var.showDialog(irVar);
                    return;
                } else {
                    irVar.show();
                    return;
                }
            case 4:
                ((ph.d) obj).setLoading(true);
                return;
            case 5:
                gs gsVar = (gs) obj;
                gsVar.f25229a.a(!aVar.f46961f, true);
                AndroidUtilities.runOnUIThread(gsVar.f25232f, 3000L);
                return;
            case 6:
                ((xn0) obj).V(false);
                return;
            case 7:
                ((ht) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((du) obj).getClass();
                return;
            case 10:
                ze.d.s(((ju) obj).f26052a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                ou ouVar = ((nu) obj).f27367a;
                ouVar.f27654n.setVisibility(4);
                ouVar.h.setVisibility(4);
                ImageView imageView = ouVar.f27658x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((gv) obj).a(true, true);
                return;
            case 13:
                gx gxVar = (gx) obj;
                if (gxVar.V.getEmojiView() != null) {
                    kz emojiView = gxVar.V.getEmojiView();
                    if (!emojiView.f26429c0) {
                        try {
                            int i15 = emojiView.O.f28601s.get(EmojiData.dataColored.length);
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
                zxVar.f31498s.f30066f = true;
                zxVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((wy) obj).h, true);
                return;
            case 16:
                dz dzVar = (dz) obj;
                ArrayList arrayList = dzVar.f24402r;
                ArrayList arrayList2 = dzVar.h;
                fz fzVar = dzVar.f24404w;
                int i16 = fzVar.J;
                kz kzVar = fzVar.N;
                pw pwVar = kzVar.A0;
                if (i16 == dzVar.f24398b) {
                    arrayList2.remove(arrayList);
                    fzVar.B = dzVar.f24399c;
                    fzVar.C = dzVar.d;
                    fzVar.D = dzVar.e;
                    fzVar.E = dzVar.f24400f;
                    fzVar.F = arrayList2;
                    fzVar.G = dzVar.f24401n;
                    fzVar.H = new ArrayList(arrayList);
                    kzVar.D0.e(false);
                    f2.o0 adapter = pwVar.getAdapter();
                    fz fzVar2 = kzVar.f26492w0;
                    if (adapter != fzVar2) {
                        pwVar.setAdapter(fzVar2);
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
                        if (((h00) arrayList3.get(i17)).e && i17 != 0) {
                            g00 g00Var = k00Var.F;
                            k00 k00Var2 = g00Var.d;
                            ArrayList arrayList4 = k00Var2.h;
                            SparseIntArray sparseIntArray = k00Var2.f26101h0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((h00) arrayList4.get(i17)).f25280a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (h00) arrayList4.remove(i17));
                                ((h00) arrayList4.get(0)).f25280a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((h00) arrayList4.get(i21)).f25280a = i21;
                                    dialogFilters.get(i21).order = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (k00Var2.H == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        k00Var2.I = i11;
                                        k00Var2.H = i11;
                                    }
                                    if (k00Var2.f26107n0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        k00Var2.f26108o0 = i10;
                                        k00Var2.f26107n0 = i10;
                                    }
                                }
                                g00Var.p(i17, 0);
                                f00 f00Var = k00Var2.G;
                                int i23 = ((h00) arrayList4.get(i17)).f25280a;
                                org.telegram.ui.qw qwVar = (org.telegram.ui.qw) f00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.py[] pyVarArr = qwVar.f37510b.f37527b0;
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
                                        k00Var2.j();
                                        k00Var2.f26121y = true;
                                        k00Var2.C.setItemAnimator(k00Var2.f26109p0);
                                    }
                                }
                            }
                            k00Var.C.u0(0);
                            org.telegram.ui.pw pwVar2 = (org.telegram.ui.pw) k00Var;
                            org.telegram.ui.qy qyVar = pwVar2.f37238y0;
                            if (!qyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    pwVar2.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                ic I = qc.a0(qyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.bj(pwVar2, 22));
                                I.k(true);
                                qyVar.f37576k3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                s00 s00Var = (s00) obj;
                if (!s00Var.f28628c) {
                    s00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((b30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.zx zxVar2 = ((tn0) ((h40) obj)).Z;
                if (!zxVar2.f23999r0.canScrollVertically(-1)) {
                    zxVar2.f23998q0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((j40) obj).f25825b.b(true);
                return;
            case 22:
                ((j40) obj).f25825b.b(true);
                return;
            case 23:
                z40 z40Var = (z40) obj;
                jj0 jj0Var = z40Var.f31245f;
                if (z40Var.f31246n) {
                    jj0Var.getAnimatedDrawable().I(0);
                    jj0Var.setAnimation(z40Var.f31247r);
                    jj0Var.d();
                    return;
                }
                return;
            case 24:
                y50 y50Var = (y50) ((h50) obj).f25318b;
                try {
                    i71 i71Var = y50Var.L;
                    if (i71Var != null && (videoEditedInfo = y50Var.K) != null) {
                        long j11 = 0;
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = i71Var.n();
                            VideoEditedInfo videoEditedInfo2 = y50Var.K;
                            if (n10 >= videoEditedInfo2.endTime) {
                                i71 i71Var2 = y50Var.L;
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
                u90 u90Var = (u90) obj;
                if (u90Var.d) {
                    u90Var.e = true;
                    u90Var.f29162r = false;
                    u90Var.f29160f = 0.0f;
                    u90Var.h = SystemClock.uptimeMillis();
                    u90Var.invalidate();
                    return;
                }
                return;
            case 26:
                ea0 ea0Var = (ea0) obj;
                Activity parentActivity = ea0Var.getParentActivity();
                Activity parentActivity2 = ea0Var.getParentActivity();
                DispatchQueue dispatchQueue = cg.z1.f2567m;
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
                qa0 qa0Var2 = (qa0) obj;
                boolean z11 = qa0Var2.F;
                boolean z12 = !z11;
                tf.z0 z0Var = qa0Var2.e;
                pa0 pa0Var = qa0Var2.f28127b;
                if (pa0Var != null && z0Var != null) {
                    if (qa0Var2.I && (jVar = qa0Var2.H) != null && jVar.f16172f && !z11) {
                        qa0Var2.L = 0;
                        return;
                    }
                    boolean g10 = qa0Var2.g();
                    if (!z11) {
                        f10 = (-qa0Var2.f28132s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = pa0Var.computeVerticalScrollRange();
                        float f12 = (computeVerticalScrollRange - z0Var.h) + qa0Var2.f28132s;
                        if (computeVerticalScrollRange <= 0 && qa0Var2.f28129f.K() > 0 && (i12 = qa0Var2.L) < 3) {
                            qa0Var2.L = i12 + 1;
                            qa0Var2.o(true);
                            return;
                        }
                        f10 = f12;
                    }
                    qa0Var2.L = 0;
                    float f13 = qa0Var2.v;
                    if (g10) {
                        max = -Math.max(0.0f, f13 - f10);
                    } else {
                        max = Math.max(0.0f, f13 - f10) + (-f13);
                    }
                    if (!z11 && !g10) {
                        max += pa0Var.computeVerticalScrollOffset();
                    }
                    final float f14 = max;
                    o1.j jVar2 = qa0Var2.H;
                    if (jVar2 != null) {
                        jVar2.c();
                    }
                    qa0Var2.I = z12;
                    final float translationY = pa0Var.getTranslationY();
                    final float f15 = qa0Var2.J;
                    if (!z11) {
                        f11 = 1.0f;
                    }
                    if (translationY == f14) {
                        qa0Var2.H = null;
                        if (!z11) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (qa0Var2.K && !z11) {
                            qa0Var2.K = false;
                            pa0Var.setLayoutManager(qa0Var2.getNeededLayoutManager());
                            qa0Var2.F = true;
                            qa0Var2.o(true);
                        }
                        qa0Var = qa0Var2;
                    } else {
                        o1.j jVar3 = new o1.j(new kb.a(translationY));
                        o1.k kVar = new o1.k(f14);
                        kVar.a(1.0f);
                        kVar.b(550.0f);
                        jVar3.f16178u = kVar;
                        qa0Var2.H = jVar3;
                        qa0Var = qa0Var2;
                        final float f16 = f11;
                        jVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f17, float f18) {
                                qa0 qa0Var3 = qa0.this;
                                qa0Var3.f28127b.setTranslationY(f17);
                                qa0Var3.i();
                                float f19 = translationY;
                                qa0Var3.J = AndroidUtilities.lerp(f15, f16, (f17 - f19) / (f14 - f19));
                            }
                        });
                        if (!z11) {
                            qa0Var.H.a(new dg.z(qa0Var, z12, 2));
                        }
                        qa0Var.H.a(new Object());
                        qa0Var.H.f();
                    }
                    if (num != null && qa0Var.getVisibility() != num.intValue()) {
                        qa0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                qa0Var2.L = 0;
                return;
            case 28:
                ((eb0) obj).S.f28444n.l();
                return;
            default:
                ((bc0) obj).a();
                return;
        }
    }

    public up(du duVar, g90 g90Var, ClickableSpan clickableSpan) {
        this.f29272a = 9;
        this.f29273b = duVar;
    }
}
