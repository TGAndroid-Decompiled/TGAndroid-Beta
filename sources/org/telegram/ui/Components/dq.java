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
public final class dq implements Runnable {
    public final int f22454a;
    public final Object f22455b;

    public dq(Object obj, int i10) {
        this.f22454a = i10;
        this.f22455b = obj;
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
        final xa0 xa0Var;
        int i13;
        o1.k kVar;
        int i14 = this.f22454a;
        float f10 = 0.0f;
        Integer num = null;
        Object obj = this.f22455b;
        switch (i14) {
            case 0:
                ((iq) obj).dismiss();
                return;
            case 1:
                ((xq) obj).a();
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
                mr mrVar = ((kr) obj).f24799c;
                TLRPC.Peer peer = mrVar.f25271d0;
                org.telegram.ui.ActionBar.p2 p2Var = mrVar.f25273f0;
                long j3 = mrVar.f25274g0;
                if (mrVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sr srVar = new sr(p2Var, peer, j3, z10, mrVar.X);
                if (p2Var.getParentActivity() != null) {
                    p2Var.showDialog(srVar);
                    return;
                } else {
                    srVar.show();
                    return;
                }
            case 4:
                ((bi.d) obj).setLoading(true);
                return;
            case 5:
                os osVar = (os) obj;
                osVar.f25900a.a(!bVar.f12870f, true);
                AndroidUtilities.runOnUIThread(osVar.f25903f, 3000L);
                return;
            case 6:
                ((co0) obj).V(false);
                return;
            case 7:
                ((rt) obj).a();
                return;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 9:
                ((ou) obj).getClass();
                return;
            case 10:
                nf.f.s(((uu) obj).f27748a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 11:
                zu zuVar = ((yu) obj).f29499a;
                zuVar.f29813n.setVisibility(4);
                zuVar.h.setVisibility(4);
                ImageView imageView = zuVar.f29817x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 12:
                ((rv) obj).a(true, true);
                return;
            case 13:
                nx nxVar = (nx) obj;
                if (nxVar.Y.getEmojiView() != null) {
                    rz emojiView = nxVar.Y.getEmojiView();
                    if (!emojiView.f26814f0) {
                        try {
                            int i15 = emojiView.R.f29521s.get(EmojiData.dataColored.length);
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
                iy iyVar = (iy) obj;
                iyVar.f24164s.f22501f = true;
                iyVar.a(true);
                return;
            case 15:
                AndroidUtilities.updateViewShow(((ez) obj).h, true);
                return;
            case 16:
                kz kzVar = (kz) obj;
                ArrayList arrayList = kzVar.f24833r;
                ArrayList arrayList2 = kzVar.h;
                mz mzVar = kzVar.f24835w;
                int i16 = mzVar.M;
                rz rzVar = mzVar.Q;
                yw ywVar = rzVar.D0;
                if (i16 == kzVar.f24829b) {
                    arrayList2.remove(arrayList);
                    mzVar.E = kzVar.f24830c;
                    mzVar.F = kzVar.d;
                    mzVar.G = kzVar.e;
                    mzVar.H = kzVar.f24831f;
                    mzVar.I = arrayList2;
                    mzVar.J = kzVar.f24832n;
                    mzVar.K = new ArrayList(arrayList);
                    rzVar.G0.e(false);
                    s4.h0 adapter = ywVar.getAdapter();
                    mz mzVar2 = rzVar.f26878z0;
                    if (adapter != mzVar2) {
                        ywVar.setAdapter(mzVar2);
                    }
                    mzVar.l();
                    return;
                }
                return;
            case 17:
                r00 r00Var = ((q00) obj).e;
                ArrayList arrayList3 = r00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (((n00) arrayList3.get(i17)).e && i17 != 0) {
                            m00 m00Var = r00Var.I;
                            r00 r00Var2 = m00Var.d;
                            ArrayList arrayList4 = r00Var2.h;
                            SparseIntArray sparseIntArray = r00Var2.f26526k0;
                            int size = arrayList4.size();
                            if (i17 >= 0 && i17 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i18 = sparseIntArray.get(i17);
                                int i19 = ((n00) arrayList4.get(i17)).f25349a;
                                for (int i20 = i17 - 1; i20 >= 0; i20--) {
                                    sparseIntArray.put(i20 + 1, sparseIntArray.get(i20));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i17);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i18);
                                arrayList4.add(0, (n00) arrayList4.remove(i17));
                                ((n00) arrayList4.get(0)).f25349a = i19;
                                for (int i21 = 0; i21 <= i17; i21++) {
                                    ((n00) arrayList4.get(i21)).f25349a = i21;
                                    dialogFilters.get(i21).order = i21;
                                }
                                for (int i22 = 0; i22 <= i17; i22++) {
                                    if (r00Var2.K == i22) {
                                        if (i22 == i17) {
                                            i11 = 0;
                                        } else {
                                            i11 = i22 + 1;
                                        }
                                        r00Var2.L = i11;
                                        r00Var2.K = i11;
                                    }
                                    if (r00Var2.f26532q0 == i22) {
                                        if (i22 == i17) {
                                            i10 = 0;
                                        } else {
                                            i10 = i22 + 1;
                                        }
                                        r00Var2.f26534r0 = i10;
                                        r00Var2.f26532q0 = i10;
                                    }
                                }
                                m00Var.p(i17, 0);
                                l00 l00Var = r00Var2.J;
                                int i23 = ((n00) arrayList4.get(i17)).f25349a;
                                org.telegram.ui.vw vwVar = (org.telegram.ui.vw) l00Var;
                                int i24 = 0;
                                while (true) {
                                    org.telegram.ui.vy[] vyVarArr = vwVar.f37634b.f38431e0;
                                    if (i24 < vyVarArr.length) {
                                        org.telegram.ui.vy vyVar = vyVarArr[i24];
                                        int i25 = vyVar.h;
                                        if (i25 == i23) {
                                            vyVar.h = i19;
                                        } else if (i25 == i19) {
                                            vyVar.h = i23;
                                        }
                                        i24++;
                                    } else {
                                        r00Var2.j();
                                        r00Var2.f26544y = true;
                                        r00Var2.F.setItemAnimator(r00Var2.f26536s0);
                                    }
                                }
                            }
                            r00Var.F.u0(0);
                            org.telegram.ui.uw uwVar = (org.telegram.ui.uw) r00Var;
                            org.telegram.ui.wy wyVar = uwVar.B0;
                            if (!wyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    uwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                pc I = wc.a0(wyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.fj(uwVar, 22));
                                I.k(true);
                                wyVar.f38477n3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                y00 y00Var = (y00) obj;
                if (!y00Var.f29209c) {
                    y00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 19:
                ((j30) obj).g(true);
                return;
            case 20:
                org.telegram.ui.gy gyVar = ((xn0) ((o40) obj)).f29108c0;
                if (!gyVar.f23731u0.canScrollVertically(-1)) {
                    gyVar.f23730t0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                ((q40) obj).f26316b.b(true);
                return;
            case 22:
                ((q40) obj).f26316b.b(true);
                return;
            case 23:
                g50 g50Var = (g50) obj;
                kj0 kj0Var = g50Var.f23245f;
                if (g50Var.f23246n) {
                    kj0Var.getAnimatedDrawable().K(0);
                    kj0Var.setAnimation(g50Var.f23247r);
                    kj0Var.d();
                    return;
                }
                return;
            case 24:
                f60 f60Var = (f60) ((bi.b3) obj).f2355b;
                try {
                    t71 t71Var = f60Var.O;
                    if (t71Var != null && (videoEditedInfo = f60Var.N) != null) {
                        long j10 = 0;
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = t71Var.n();
                            VideoEditedInfo videoEditedInfo2 = f60Var.N;
                            if (n10 >= videoEditedInfo2.endTime) {
                                t71 t71Var2 = f60Var.O;
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
                ba0 ba0Var = (ba0) obj;
                if (ba0Var.d) {
                    ba0Var.e = true;
                    ba0Var.f21791r = false;
                    ba0Var.f21789f = 0.0f;
                    ba0Var.h = SystemClock.uptimeMillis();
                    ba0Var.invalidate();
                    return;
                }
                return;
            case 26:
                la0 la0Var = (la0) obj;
                Activity parentActivity = la0Var.getParentActivity();
                Activity parentActivity2 = la0Var.getParentActivity();
                DispatchQueue dispatchQueue = og.p1.f14450m;
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
                xa0 xa0Var2 = (xa0) obj;
                boolean z12 = xa0Var2.I;
                boolean z13 = !z12;
                fg.r1 r1Var = xa0Var2.e;
                wa0 wa0Var = xa0Var2.f28990b;
                if (wa0Var != null && r1Var != null) {
                    if (xa0Var2.L && (kVar = xa0Var2.K) != null && kVar.f14127f && !z12) {
                        xa0Var2.O = 0;
                        return;
                    }
                    boolean g10 = xa0Var2.g();
                    if (!z12) {
                        f7 = (-xa0Var2.f28995s) - AndroidUtilities.dp(6.0f);
                    } else {
                        int computeVerticalScrollRange = wa0Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - r1Var.h) + xa0Var2.f28995s;
                        if (computeVerticalScrollRange <= 0 && xa0Var2.f28992f.K() > 0 && (i12 = xa0Var2.O) < 3) {
                            xa0Var2.O = i12 + 1;
                            xa0Var2.o(true);
                            return;
                        }
                        f7 = f11;
                    }
                    xa0Var2.O = 0;
                    float f12 = xa0Var2.v;
                    if (g10) {
                        max = -Math.max(0.0f, f12 - f7);
                    } else {
                        max = Math.max(0.0f, f12 - f7) + (-f12);
                    }
                    if (!z12 && !g10) {
                        max += wa0Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    o1.k kVar2 = xa0Var2.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    xa0Var2.L = z13;
                    final float translationY = wa0Var.getTranslationY();
                    final float f14 = xa0Var2.M;
                    if (!z12) {
                        f10 = 1.0f;
                    }
                    if (translationY == f13) {
                        xa0Var2.K = null;
                        if (!z12) {
                            i13 = 8;
                        } else {
                            i13 = 0;
                        }
                        num = Integer.valueOf(i13);
                        if (xa0Var2.N && !z12) {
                            xa0Var2.N = false;
                            wa0Var.setLayoutManager(xa0Var2.getNeededLayoutManager());
                            xa0Var2.I = true;
                            xa0Var2.o(true);
                        }
                        xa0Var = xa0Var2;
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f13);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.f14134u = lVar;
                        xa0Var2.K = kVar3;
                        xa0Var = xa0Var2;
                        final float f15 = f10;
                        kVar3.b(new o1.g() {
                            @Override
                            public final void a(o1.h hVar, float f16, float f17) {
                                xa0 xa0Var3 = xa0.this;
                                xa0Var3.f28990b.setTranslationY(f16);
                                xa0Var3.i();
                                float f18 = translationY;
                                xa0Var3.M = AndroidUtilities.lerp(f14, f15, (f16 - f18) / (f13 - f18));
                            }
                        });
                        if (!z12) {
                            xa0Var.K.a(new bi.u5(xa0Var, z13, 2));
                        }
                        xa0Var.K.a(new Object());
                        xa0Var.K.f();
                    }
                    if (num != null && xa0Var.getVisibility() != num.intValue()) {
                        xa0Var.setVisibility(num.intValue());
                        return;
                    }
                    return;
                }
                xa0Var2.O = 0;
                return;
            case 28:
                ((mb0) obj).S.f29297n.l();
                return;
            default:
                ((ic0) obj).a();
                return;
        }
    }

    public dq(ou ouVar, n90 n90Var, ClickableSpan clickableSpan) {
        this.f22454a = 9;
        this.f22455b = ouVar;
    }
}
