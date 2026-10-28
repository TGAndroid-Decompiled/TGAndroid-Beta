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
public final class cp implements Runnable {
    public final int f27220a;
    public final Object f27221b;

    public cp(Object obj, int i10) {
        this.f27220a = i10;
        this.f27221b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        oe.b bVar;
        int i10;
        int i11;
        VideoEditedInfo videoEditedInfo;
        int i12 = this.f27220a;
        Object obj = this.f27221b;
        switch (i12) {
            case 0:
                ((dp) obj).setVisibility(8);
                return;
            case 1:
                ((cq) obj).f27225b.a();
                return;
            case 2:
                ((oq) obj).dismiss();
                return;
            case 3:
                ((cr) obj).a();
                return;
            case 4:
                ((org.telegram.ui.ActionBar.k3) obj).dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 5:
                tr trVar = ((rr) obj).f32325c;
                TLRPC.Peer peer = trVar.f33127d0;
                org.telegram.ui.ActionBar.r2 r2Var = trVar.f33129f0;
                long j10 = trVar.f33130g0;
                if (trVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zr zrVar = new zr(r2Var, peer, j10, z10, trVar.X);
                if (r2Var.getParentActivity() != null) {
                    r2Var.showDialog(zrVar);
                    return;
                } else {
                    zrVar.show();
                    return;
                }
            case 6:
                ((fi.d) obj).setLoading(true);
                return;
            case 7:
                us usVar = (us) obj;
                usVar.f33452a.a(!bVar.f19326f, true);
                AndroidUtilities.runOnUIThread(usVar.f33455f, 3000L);
                return;
            case 8:
                ((zo0) obj).W(false);
                return;
            case 9:
                ((xt) obj).a();
                return;
            case 10:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 11:
                ((su) obj).getClass();
                return;
            case 12:
                qf.d.r(((yu) obj).f35166a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 13:
                dv dvVar = ((cv) obj).f27258a;
                dvVar.f27553n.setVisibility(4);
                dvVar.h.setVisibility(4);
                ImageView imageView = dvVar.f27557x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 14:
                ((vv) obj).a(true, true);
                return;
            case 15:
                ox oxVar = (ox) obj;
                if (oxVar.Y.getEmojiView() != null) {
                    sz emojiView = oxVar.Y.getEmojiView();
                    if (!emojiView.f32722f0) {
                        try {
                            int i13 = emojiView.R.f35458s.get(EmojiData.dataColored.length);
                            if (i13 > 0) {
                                emojiView.P.C0();
                                emojiView.V(i13);
                                emojiView.H(i13, AndroidUtilities.dp(-9.0f));
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
            case 16:
                iy iyVar = (iy) obj;
                iyVar.f29441w.f27960f = true;
                iyVar.a(true);
                return;
            case 17:
                AndroidUtilities.updateViewShow(((fz) obj).h, true);
                return;
            case 18:
                lz lzVar = (lz) obj;
                ArrayList arrayList = lzVar.f30319r;
                ArrayList arrayList2 = lzVar.h;
                nz nzVar = lzVar.f30321w;
                int i14 = nzVar.M;
                sz szVar = nzVar.Q;
                zw zwVar = szVar.D0;
                if (i14 == lzVar.f30315b) {
                    arrayList2.remove(arrayList);
                    nzVar.E = lzVar.f30316c;
                    nzVar.F = lzVar.d;
                    nzVar.G = lzVar.e;
                    nzVar.H = lzVar.f30317f;
                    nzVar.I = arrayList2;
                    nzVar.J = lzVar.f30318n;
                    nzVar.K = new ArrayList(arrayList);
                    szVar.G0.e(false);
                    s4.h0 adapter = zwVar.getAdapter();
                    nz nzVar2 = szVar.f32786z0;
                    if (adapter != nzVar2) {
                        zwVar.setAdapter(nzVar2);
                    }
                    nzVar.l();
                    return;
                }
                return;
            case 19:
                ((wz) obj).b();
                return;
            case 20:
                s00 s00Var = ((r00) obj).e;
                ArrayList arrayList3 = s00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        if (((p00) arrayList3.get(i15)).e && i15 != 0) {
                            o00 o00Var = s00Var.I;
                            s00 s00Var2 = o00Var.d;
                            ArrayList arrayList4 = s00Var2.h;
                            SparseIntArray sparseIntArray = s00Var2.f32430k0;
                            int size = arrayList4.size();
                            if (i15 >= 0 && i15 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i16 = sparseIntArray.get(i15);
                                int i17 = ((p00) arrayList4.get(i15)).f31417a;
                                for (int i18 = i15 - 1; i18 >= 0; i18--) {
                                    sparseIntArray.put(i18 + 1, sparseIntArray.get(i18));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i15);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i16);
                                arrayList4.add(0, (p00) arrayList4.remove(i15));
                                ((p00) arrayList4.get(0)).f31417a = i17;
                                for (int i19 = 0; i19 <= i15; i19++) {
                                    ((p00) arrayList4.get(i19)).f31417a = i19;
                                    dialogFilters.get(i19).order = i19;
                                }
                                for (int i20 = 0; i20 <= i15; i20++) {
                                    if (s00Var2.K == i20) {
                                        if (i20 == i15) {
                                            i11 = 0;
                                        } else {
                                            i11 = i20 + 1;
                                        }
                                        s00Var2.L = i11;
                                        s00Var2.K = i11;
                                    }
                                    if (s00Var2.f32436q0 == i20) {
                                        if (i20 == i15) {
                                            i10 = 0;
                                        } else {
                                            i10 = i20 + 1;
                                        }
                                        s00Var2.f32438r0 = i10;
                                        s00Var2.f32436q0 = i10;
                                    }
                                }
                                o00Var.p(i15, 0);
                                n00 n00Var = s00Var2.J;
                                int i21 = ((p00) arrayList4.get(i15)).f31417a;
                                org.telegram.ui.ux uxVar = (org.telegram.ui.ux) n00Var;
                                int i22 = 0;
                                while (true) {
                                    org.telegram.ui.dy[] dyVarArr = uxVar.f44129b.f38998e0;
                                    if (i22 < dyVarArr.length) {
                                        org.telegram.ui.dy dyVar = dyVarArr[i22];
                                        int i23 = dyVar.h;
                                        if (i23 == i21) {
                                            dyVar.h = i17;
                                        } else if (i23 == i17) {
                                            dyVar.h = i21;
                                        }
                                        i22++;
                                    } else {
                                        s00Var2.j();
                                        s00Var2.f32448y = true;
                                        s00Var2.F.setItemAnimator(s00Var2.f32440s0);
                                    }
                                }
                            }
                            s00Var.F.v0(0);
                            org.telegram.ui.tx txVar = (org.telegram.ui.tx) s00Var;
                            org.telegram.ui.ey eyVar = txVar.B0;
                            if (!eyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    txVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = wc.b0(eyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.xi(txVar, 24));
                                I.k(true);
                                eyVar.f39050o3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 21:
                z00 z00Var = (z00) obj;
                if (!z00Var.f35194c) {
                    z00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 22:
                ((k30) obj).g(true);
                return;
            case 23:
                org.telegram.ui.mx mxVar = ((vo0) ((p40) obj)).f33812e0;
                if (!mxVar.f28262w0.canScrollVertically(-1)) {
                    mxVar.f28261v0.h1(0, 0);
                    return;
                }
                return;
            case 24:
                ((r40) obj).f32118b.b(true);
                return;
            case 25:
                ((r40) obj).f32118b.b(true);
                return;
            case 26:
                i50 i50Var = (i50) obj;
                bk0 bk0Var = i50Var.f29217f;
                if (i50Var.f29218n) {
                    bk0Var.getAnimatedDrawable().K(0);
                    bk0Var.setAnimation(i50Var.f29219r);
                    bk0Var.d();
                    return;
                }
                return;
            case 27:
                p60 p60Var = (p60) ((f6.r) obj).f10237b;
                try {
                    t81 t81Var = p60Var.S;
                    if (t81Var != null && (videoEditedInfo = p60Var.R) != null) {
                        long j11 = 0;
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = t81Var.n();
                            VideoEditedInfo videoEditedInfo2 = p60Var.R;
                            if (n10 >= videoEditedInfo2.endTime) {
                                t81 t81Var2 = p60Var.S;
                                long j12 = videoEditedInfo2.startTime;
                                if (j12 > 0) {
                                    j11 = j12;
                                }
                                t81Var2.K(j11);
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
            case 28:
                pa0 pa0Var = (pa0) obj;
                if (pa0Var.d) {
                    pa0Var.e = true;
                    pa0Var.f31557r = false;
                    pa0Var.f31555f = 0.0f;
                    pa0Var.h = SystemClock.uptimeMillis();
                    pa0Var.invalidate();
                    return;
                }
                return;
            default:
                ua0 ua0Var = (ua0) obj;
                Activity parentActivity = ua0Var.getParentActivity();
                Activity parentActivity2 = ua0Var.getParentActivity();
                DispatchQueue dispatchQueue = rg.k1.f47484m;
                boolean z11 = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor edit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z11) {
                    edit.clear();
                } else {
                    edit.putBoolean("learning", true);
                }
                edit.apply();
                return;
        }
    }

    public cp(su suVar, ba0 ba0Var, ClickableSpan clickableSpan) {
        this.f27220a = 11;
        this.f27221b = suVar;
    }
}
