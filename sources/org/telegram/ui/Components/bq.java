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
public final class bq implements Runnable {
    public final int f26938a;
    public final Object f26939b;

    public bq(Object obj, int i10) {
        this.f26938a = i10;
        this.f26939b = obj;
    }

    @Override
    public final void run() {
        boolean z10;
        oe.b bVar;
        int i10;
        int i11;
        VideoEditedInfo videoEditedInfo;
        int i12 = this.f26938a;
        long j10 = 0;
        Object obj = this.f26939b;
        switch (i12) {
            case 0:
                ((cq) obj).f27235b.a();
                return;
            case 1:
                ((oq) obj).dismiss();
                return;
            case 2:
                ((cr) obj).a();
                return;
            case 3:
                ((org.telegram.ui.ActionBar.k3) obj).dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    return;
                }
                return;
            case 4:
                tr trVar = ((rr) obj).f32290c;
                TLRPC.Peer peer = trVar.f33131d0;
                org.telegram.ui.ActionBar.r2 r2Var = trVar.f33133f0;
                long j11 = trVar.f33134g0;
                if (trVar.Y.size() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zr zrVar = new zr(r2Var, peer, j11, z10, trVar.X);
                if (r2Var.getParentActivity() != null) {
                    r2Var.showDialog(zrVar);
                    return;
                } else {
                    zrVar.show();
                    return;
                }
            case 5:
                ((fi.d) obj).setLoading(true);
                return;
            case 6:
                us usVar = (us) obj;
                usVar.f33487a.a(!bVar.f19327f, true);
                AndroidUtilities.runOnUIThread(usVar.f33490f, 3000L);
                return;
            case 7:
                ((yo0) obj).W(false);
                return;
            case 8:
                ((xt) obj).a();
                return;
            case 9:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                return;
            case 10:
                ((su) obj).getClass();
                return;
            case 11:
                qf.d.r(((yu) obj).f35142a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 12:
                dv dvVar = ((cv) obj).f27268a;
                dvVar.f27610n.setVisibility(4);
                dvVar.h.setVisibility(4);
                ImageView imageView = dvVar.f27614x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                return;
            case 13:
                ((vv) obj).a(true, true);
                return;
            case 14:
                ox oxVar = (ox) obj;
                if (oxVar.Y.getEmojiView() != null) {
                    sz emojiView = oxVar.Y.getEmojiView();
                    if (!emojiView.f32728f0) {
                        try {
                            int i13 = emojiView.R.f35431s.get(EmojiData.dataColored.length);
                            if (i13 > 0) {
                                emojiView.P.C0();
                                emojiView.U(i13);
                                emojiView.G(i13, AndroidUtilities.dp(-9.0f));
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
            case 15:
                iy iyVar = (iy) obj;
                iyVar.f29401w.f28010f = true;
                iyVar.a(true);
                return;
            case 16:
                AndroidUtilities.updateViewShow(((fz) obj).h, true);
                return;
            case 17:
                lz lzVar = (lz) obj;
                ArrayList arrayList = lzVar.f30333r;
                ArrayList arrayList2 = lzVar.h;
                nz nzVar = lzVar.f30335w;
                int i14 = nzVar.M;
                sz szVar = nzVar.Q;
                zw zwVar = szVar.D0;
                if (i14 == lzVar.f30329b) {
                    arrayList2.remove(arrayList);
                    nzVar.E = lzVar.f30330c;
                    nzVar.F = lzVar.d;
                    nzVar.G = lzVar.e;
                    nzVar.H = lzVar.f30331f;
                    nzVar.I = arrayList2;
                    nzVar.J = lzVar.f30332n;
                    nzVar.K = new ArrayList(arrayList);
                    szVar.G0.e(false);
                    s4.h0 adapter = zwVar.getAdapter();
                    nz nzVar2 = szVar.f32792z0;
                    if (adapter != nzVar2) {
                        zwVar.setAdapter(nzVar2);
                    }
                    nzVar.l();
                    return;
                }
                return;
            case 18:
                ((wz) obj).b();
                return;
            case 19:
                s00 s00Var = ((r00) obj).e;
                ArrayList arrayList3 = s00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                        if (((p00) arrayList3.get(i15)).e && i15 != 0) {
                            o00 o00Var = s00Var.I;
                            s00 s00Var2 = o00Var.d;
                            ArrayList arrayList4 = s00Var2.h;
                            SparseIntArray sparseIntArray = s00Var2.f32375k0;
                            int size = arrayList4.size();
                            if (i15 >= 0 && i15 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i16 = sparseIntArray.get(i15);
                                int i17 = ((p00) arrayList4.get(i15)).f31401a;
                                for (int i18 = i15 - 1; i18 >= 0; i18--) {
                                    sparseIntArray.put(i18 + 1, sparseIntArray.get(i18));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i15);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i16);
                                arrayList4.add(0, (p00) arrayList4.remove(i15));
                                ((p00) arrayList4.get(0)).f31401a = i17;
                                for (int i19 = 0; i19 <= i15; i19++) {
                                    ((p00) arrayList4.get(i19)).f31401a = i19;
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
                                    if (s00Var2.f32381q0 == i20) {
                                        if (i20 == i15) {
                                            i10 = 0;
                                        } else {
                                            i10 = i20 + 1;
                                        }
                                        s00Var2.f32383r0 = i10;
                                        s00Var2.f32381q0 = i10;
                                    }
                                }
                                o00Var.p(i15, 0);
                                n00 n00Var = s00Var2.J;
                                int i21 = ((p00) arrayList4.get(i15)).f31401a;
                                org.telegram.ui.rx rxVar = (org.telegram.ui.rx) n00Var;
                                int i22 = 0;
                                while (true) {
                                    org.telegram.ui.ay[] ayVarArr = rxVar.f43310b.f38586e0;
                                    if (i22 < ayVarArr.length) {
                                        org.telegram.ui.ay ayVar = ayVarArr[i22];
                                        int i23 = ayVar.h;
                                        if (i23 == i21) {
                                            ayVar.h = i17;
                                        } else if (i23 == i17) {
                                            ayVar.h = i21;
                                        }
                                        i22++;
                                    } else {
                                        s00Var2.j();
                                        s00Var2.f32393y = true;
                                        s00Var2.F.setItemAnimator(s00Var2.f32385s0);
                                    }
                                }
                            }
                            s00Var.F.v0(0);
                            org.telegram.ui.qx qxVar = (org.telegram.ui.qx) s00Var;
                            org.telegram.ui.cy cyVar = qxVar.B0;
                            if (!cyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    qxVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = wc.b0(cyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.ui(qxVar, 24));
                                I.k(true);
                                cyVar.f38638o3 = I;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 20:
                z00 z00Var = (z00) obj;
                if (!z00Var.f35164c) {
                    z00Var.setLayerType(0, null);
                    return;
                }
                return;
            case 21:
                ((k30) obj).g(true);
                return;
            case 22:
                org.telegram.ui.jx jxVar = ((uo0) ((p40) obj)).f33470e0;
                if (!jxVar.f27954w0.canScrollVertically(-1)) {
                    jxVar.f27953v0.h1(0, 0);
                    return;
                }
                return;
            case 23:
                ((r40) obj).f32092b.b(true);
                return;
            case 24:
                ((r40) obj).f32092b.b(true);
                return;
            case 25:
                i50 i50Var = (i50) obj;
                ak0 ak0Var = i50Var.f29191f;
                if (i50Var.f29192n) {
                    ak0Var.getAnimatedDrawable().K(0);
                    ak0Var.setAnimation(i50Var.f29193r);
                    ak0Var.d();
                    return;
                }
                return;
            case 26:
                o60 o60Var = (o60) ((f6.r) obj).f10238b;
                try {
                    s81 s81Var = o60Var.T;
                    if (s81Var != null && (videoEditedInfo = o60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = s81Var.n();
                        VideoEditedInfo videoEditedInfo2 = o60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            s81 s81Var2 = o60Var.T;
                            long j12 = videoEditedInfo2.startTime;
                            if (j12 > 0) {
                                j10 = j12;
                            }
                            s81Var2.K(j10);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 27:
                n60 n60Var = (n60) obj;
                vi.r0 r0Var = n60Var.R;
                if (r0Var != null && r0Var.f50534a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j13 = n60Var.F0;
                    if (j13 == 0 || elapsedRealtimeNanos - j13 >= 70000000) {
                        n60Var.A();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                oa0 oa0Var = (oa0) obj;
                if (oa0Var.d) {
                    oa0Var.e = true;
                    oa0Var.f31247r = false;
                    oa0Var.f31245f = 0.0f;
                    oa0Var.h = SystemClock.uptimeMillis();
                    oa0Var.invalidate();
                    return;
                }
                return;
            default:
                ta0 ta0Var = (ta0) obj;
                Activity parentActivity = ta0Var.getParentActivity();
                Activity parentActivity2 = ta0Var.getParentActivity();
                DispatchQueue dispatchQueue = rg.k1.f47449m;
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

    public bq(su suVar, aa0 aa0Var, ClickableSpan clickableSpan) {
        this.f26938a = 10;
        this.f26939b = suVar;
    }
}
