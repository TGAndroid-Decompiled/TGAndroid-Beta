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
    public final int f33144a;
    public final Object f33145b;

    public xp(Object obj, int i10) {
        this.f33144a = i10;
        this.f33145b = obj;
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
        final ra0 ra0Var;
        int i13;
        o1.j jVar;
        int i14 = this.f33144a;
        float f11 = 0.0f;
        Integer num = null;
        Object obj = this.f33145b;
        switch (i14) {
            case 0:
                ((cq) obj).dismiss();
                return;
            case 1:
                ((rq) obj).a();
                return;
            case 2:
                ((org.telegram.ui.ActionBar.h3) obj).dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 3:
                gr grVar = ((er) obj).f26634c;
                TLRPC.Peer peer = grVar.f27248a0;
                org.telegram.ui.ActionBar.p2 p2Var = grVar.f27250c0;
                long j10 = grVar.f27251d0;
                if (grVar.V.size() > 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                lr lrVar = new lr(p2Var, peer, j10, z4, grVar.U);
                if (p2Var.getParentActivity() != null) {
                    p2Var.showDialog(lrVar);
                    return;
                } else {
                    lrVar.show();
                    return;
                }
            case 4:
                ((qh.d) obj).setLoading(true);
                return;
            case 5:
                js jsVar = (js) obj;
                jsVar.f28190a.a(!aVar.f50506f, true);
                AndroidUtilities.runOnUIThread(jsVar.f28194f, 3000L);
                return;
            case 6:
                ((zn0) obj).V(false);
                return;
            case 7:
                ((lt) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((gu) obj).getClass();
                return;
            case 10:
                af.g.s(((mu) obj).f29248a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                ru ruVar = ((qu) obj).f30479a;
                ruVar.f30859n.setVisibility(4);
                ruVar.h.setVisibility(4);
                ImageView imageView = ruVar.f30863x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((jv) obj).a(true, true);
                return;
            case 13:
                ix ixVar = (ix) obj;
                if (ixVar.V.getEmojiView() != null) {
                    mz emojiView = ixVar.V.getEmojiView();
                    if (!emojiView.f29271c0) {
                        try {
                            int i15 = emojiView.O.f31475s.get(EmojiData.dataColored.length);
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
                cy cyVar = (cy) obj;
                cyVar.f26112s.f33192f = true;
                cyVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((yy) obj).h, true);
                return;
            case 16:
                fz fzVar = (fz) obj;
                ArrayList arrayList = fzVar.f27046r;
                ArrayList arrayList2 = fzVar.h;
                hz hzVar = fzVar.f27048w;
                int i16 = hzVar.J;
                mz mzVar = hzVar.N;
                rw rwVar = mzVar.A0;
                if (i16 == fzVar.f27041b) {
                    arrayList2.remove(arrayList);
                    hzVar.B = fzVar.f27042c;
                    hzVar.C = fzVar.d;
                    hzVar.D = fzVar.f27043e;
                    hzVar.E = fzVar.f27044f;
                    hzVar.F = arrayList2;
                    hzVar.G = fzVar.f27045n;
                    hzVar.H = new ArrayList(arrayList);
                    mzVar.D0.e(false);
                    f2.p0 adapter = rwVar.getAdapter();
                    hz hzVar2 = mzVar.f29335w0;
                    if (adapter != hzVar2) {
                        rwVar.setAdapter(hzVar2);
                    }
                    hzVar.l();
                    return;
                }
                return;
            case 17:
                l00 l00Var = ((k00) obj).f28240e;
                ArrayList arrayList3 = l00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((i00) arrayList3.get(i17)).f27637e && i17 != 0) {
                            h00 h00Var = l00Var.F;
                            l00 l00Var2 = h00Var.d;
                            ArrayList arrayList4 = l00Var2.h;
                            SparseIntArray sparseIntArray = l00Var2.f28498h0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((i00) arrayList4.get(i17)).f27634a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (i00) arrayList4.remove(i17));
                                ((i00) arrayList4.get(0)).f27634a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((i00) arrayList4.get(i21)).f27634a = i21;
                                    dialogFilters.get(i21).order = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (l00Var2.H == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        l00Var2.I = i11;
                                        l00Var2.H = i11;
                                    }
                                    if (l00Var2.f28504n0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        l00Var2.f28505o0 = i10;
                                        l00Var2.f28504n0 = i10;
                                    }
                                }
                                h00Var.p(i17, 0);
                                g00 g00Var = l00Var2.G;
                                int i23 = ((i00) arrayList4.get(i17)).f27634a;
                                org.telegram.ui.pw pwVar = (org.telegram.ui.pw) g00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.oy[] oyVarArr = pwVar.f40168b.f40185b0;
                                    if (i24 < oyVarArr.length) {
                                        org.telegram.ui.oy oyVar = oyVarArr[i24];
                                        int i25 = oyVar.h;
                                        if (i25 == i23) {
                                            oyVar.h = i19;
                                        } else if (i25 == i19) {
                                            oyVar.h = i23;
                                        }
                                        i24++;
                                    } else {
                                        l00Var2.j();
                                        l00Var2.f28518y = true;
                                        l00Var2.C.setItemAnimator(l00Var2.f28506p0);
                                    }
                                }
                            }
                            l00Var.C.u0(0);
                            org.telegram.ui.ow owVar = (org.telegram.ui.ow) l00Var;
                            org.telegram.ui.py pyVar = owVar.f39851y0;
                            if (!pyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    owVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                ic I = qc.a0(pyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.zi(owVar, 22));
                                I.k(true);
                                pyVar.f40235k3 = I;
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
                if (!s00Var.f30922c) {
                    s00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((c30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.yx yxVar = ((vn0) ((i40) obj)).Z;
                if (!yxVar.f26613r0.canScrollVertically(-1)) {
                    yxVar.f26612q0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((k40) obj).f28259b.b(true);
                return;
            case 22:
                ((k40) obj).f28259b.b(true);
                return;
            case 23:
                a50 a50Var = (a50) obj;
                lj0 lj0Var = a50Var.f25158f;
                if (a50Var.f25159n) {
                    lj0Var.getAnimatedDrawable().I(0);
                    lj0Var.setAnimation(a50Var.f25160r);
                    lj0Var.d();
                    return;
                }
                return;
            case 24:
                z50 z50Var = (z50) ((i50) obj).f27674b;
                try {
                    k71 k71Var = z50Var.L;
                    if (k71Var != null && (videoEditedInfo = z50Var.K) != null) {
                        long j11 = 0;
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = k71Var.n();
                            VideoEditedInfo videoEditedInfo2 = z50Var.K;
                            if (n10 >= videoEditedInfo2.endTime) {
                                k71 k71Var2 = z50Var.L;
                                long j12 = videoEditedInfo2.startTime;
                                if (j12 > 0) {
                                    j11 = j12;
                                }
                                k71Var2.K(j11);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 25:
                v90 v90Var = (v90) obj;
                if (v90Var.d) {
                    v90Var.f31867e = true;
                    v90Var.f31870r = false;
                    v90Var.f31868f = 0.0f;
                    v90Var.h = SystemClock.uptimeMillis();
                    v90Var.invalidate();
                    return;
                }
                return;
            case 26:
                fa0 fa0Var = (fa0) obj;
                Activity parentActivity = fa0Var.getParentActivity();
                Activity parentActivity2 = fa0Var.getParentActivity();
                DispatchQueue dispatchQueue = dg.y1.f4725m;
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
                ra0 ra0Var2 = (ra0) obj;
                boolean z11 = ra0Var2.F;
                boolean z12 = !z11;
                uf.z0 z0Var = ra0Var2.f30662e;
                qa0 qa0Var = ra0Var2.f30660b;
                if (qa0Var != null && z0Var != null) {
                    if (ra0Var2.I && (jVar = ra0Var2.H) != null && jVar.f16330f && !z11) {
                        ra0Var2.L = 0;
                        return;
                    }
                    boolean g10 = ra0Var2.g();
                    if (!z11) {
                        f10 = (-ra0Var2.f30666s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = qa0Var.computeVerticalScrollRange();
                        float f12 = (computeVerticalScrollRange - z0Var.h) + ra0Var2.f30666s;
                        if (computeVerticalScrollRange <= 0 && ra0Var2.f30663f.K() > 0 && (i12 = ra0Var2.L) < 3) {
                            ra0Var2.L = i12 + 1;
                            ra0Var2.o(true);
                            return;
                        }
                        f10 = f12;
                    }
                    ra0Var2.L = 0;
                    float f13 = ra0Var2.v;
                    if (g10) {
                        max = -Math.max(0.0f, f13 - f10);
                    } else {
                        max = Math.max(0.0f, f13 - f10) + (-f13);
                    }
                    if (!z11 && !g10) {
                        max += qa0Var.computeVerticalScrollOffset();
                    }
                    final float f14 = max;
                    o1.j jVar2 = ra0Var2.H;
                    if (jVar2 != null) {
                        jVar2.c();
                    }
                    ra0Var2.I = z12;
                    final float translationY = qa0Var.getTranslationY();
                    final float f15 = ra0Var2.J;
                    if (!z11) {
                        f11 = 1.0f;
                    }
                    if (translationY == f14) {
                        ra0Var2.H = null;
                        if (!z11) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (ra0Var2.K && !z11) {
                            ra0Var2.K = false;
                            qa0Var.setLayoutManager(ra0Var2.getNeededLayoutManager());
                            ra0Var2.F = true;
                            ra0Var2.o(true);
                        }
                        ra0Var = ra0Var2;
                    } else {
                        o1.j jVar3 = new o1.j(new kb.a(translationY));
                        o1.k kVar = new o1.k(f14);
                        kVar.a(1.0f);
                        kVar.b(550.0f);
                        jVar3.f16336u = kVar;
                        ra0Var2.H = jVar3;
                        ra0Var = ra0Var2;
                        final float f16 = f11;
                        jVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f17, float f18) {
                                ra0 ra0Var3 = ra0.this;
                                ra0Var3.f30660b.setTranslationY(f17);
                                ra0Var3.i();
                                float f19 = translationY;
                                ra0Var3.J = AndroidUtilities.lerp(f15, f16, (f17 - f19) / (f14 - f19));
                            }
                        });
                        if (!z11) {
                            ra0Var.H.a(new eg.x(ra0Var, z12, 2));
                        }
                        ra0Var.H.a(new Object());
                        ra0Var.H.f();
                    }
                    if (num != null && ra0Var.getVisibility() != num.intValue()) {
                        ra0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                ra0Var2.L = 0;
                return;
            case 28:
                ((fb0) obj).S.f31032n.l();
                return;
            default:
                ((cc0) obj).a();
                return;
        }
    }

    public xp(gu guVar, h90 h90Var, ClickableSpan clickableSpan) {
        this.f33144a = 9;
        this.f33145b = guVar;
    }
}
