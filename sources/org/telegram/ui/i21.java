package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i21 implements org.telegram.ui.Components.am0 {
    public final int f36702a;
    public final Object f36703b;

    public i21(Object obj, int i10) {
        this.f36702a = i10;
        this.f36703b = obj;
    }

    @Override
    public final void a(int i10, View view) {
        org.telegram.ui.Components.kr0 kr0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        org.telegram.ui.Components.mm0 mm0Var;
        org.telegram.ui.Components.mm0 mm0Var2;
        s4.b1 K;
        int i11 = 0;
        switch (this.f36702a) {
            case 0:
                ProxyListActivity.U((ProxyListActivity) this.f36703b, view, i10);
                return;
            case 1:
                k31 k31Var = (k31) this.f36703b;
                org.telegram.ui.Components.mm0 mm0Var3 = k31Var.f37233y;
                org.telegram.ui.Components.xp xpVar = k31Var.f37225b;
                if (xpVar.d.get(i10) != k31Var.K && k31Var.O == null) {
                    k31Var.Q = false;
                    k31Var.K = (org.telegram.ui.Components.yp) xpVar.d.get(i10);
                    xpVar.E(i10);
                    k31Var.h.postDelayed(new org.telegram.ui.Components.o8(k31Var, i10, 27), 100L);
                    while (i11 < mm0Var3.getChildCount()) {
                        org.telegram.ui.Components.w21 w21Var = (org.telegram.ui.Components.w21) mm0Var3.getChildAt(i11);
                        if (w21Var != view && (kr0Var = w21Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(kr0Var);
                            w21Var.J.run();
                        }
                        i11++;
                    }
                    if (!((org.telegram.ui.Components.yp) xpVar.d.get(i10)).f31345a.f19342a) {
                        ((org.telegram.ui.Components.w21) view).d();
                    }
                    w21 w21Var2 = k31Var.J;
                    if (w21Var2 != null) {
                        w21Var2.f40849a.c0(i10, k31Var.K.f31345a, true);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                s31.U((s31) this.f36703b, view);
                return;
            case 3:
                l41.U((l41) this.f36703b, view, i10);
                return;
            case 4:
                t41 t41Var = (t41) this.f36703b;
                si.a aVar = si.e.d;
                if (i10 == 1) {
                    aVar.a();
                    boolean z13 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z13;
                        aVar.f45477c = true;
                        aVar.f45476b = true;
                        si.d.f45483a.edit().putBoolean("round_video_camera2_enabled", z13).apply();
                    }
                    t41Var.f40007b.l();
                    return;
                }
                aVar.a();
                if (aVar.d) {
                    if (i10 == 2) {
                        t41Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new ps0(6));
                        return;
                    } else if (i10 == 3) {
                        t41Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new ps0(7));
                        return;
                    } else if (i10 == 4) {
                        t41Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new ps0(8));
                        return;
                    } else if (i10 == 5) {
                        CharSequence[] charSequenceArr = new CharSequence[4];
                        while (true) {
                            int[] iArr = t41.f40005c;
                            if (i11 < 3) {
                                charSequenceArr[i11] = t41.U(iArr[i11]);
                                i11++;
                            } else {
                                t41Var.V(R.string.RoundVideoBitrate, charSequenceArr, new ps0(9));
                                return;
                            }
                        }
                    } else if (i10 == 8) {
                        si.a aVar2 = si.e.f45489i;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        t41Var.f40007b.m(i10);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                b81 b81Var = (b81) this.f36703b;
                org.telegram.ui.Components.m61 G = b81Var.f34241i0.G(i10 - 1);
                if (G != null) {
                    Object obj = G.G;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).t(true, true);
                        b81Var.f34233a0 = (TLObject) G.G;
                        b81Var.V(true);
                        b81Var.f34241i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ((e81) this.f36703b).R(i10, view);
                return;
            case 7:
                SessionsActivity.U((SessionsActivity) this.f36703b, i10);
                return;
            case 8:
                hb1 hb1Var = (hb1) this.f36703b;
                ArrayList arrayList = hb1Var.N;
                ArrayList arrayList2 = hb1Var.O;
                ma1 ma1Var = hb1Var.X;
                int i12 = ma1Var.I;
                if (i10 >= i12 && i10 <= ma1Var.J) {
                    eb1 eb1Var = (eb1) hb1Var.f36502v0.get(i10 - i12);
                    pj0 pj0Var = new pj0(eb1Var.f35246b, true, hb1Var.f36477b);
                    pj0Var.f38953e0 = eb1Var;
                    hb1Var.presentFragment(pj0Var);
                    return;
                }
                int i13 = ma1Var.U;
                if (i10 >= i13 && i10 <= ma1Var.V) {
                    ((ab1) hb1Var.Q.get(i10 - i13)).b(hb1Var);
                    return;
                }
                int i14 = ma1Var.R;
                if (i10 >= i14 && i10 <= ma1Var.S) {
                    ((ab1) arrayList2.get(i10 - i14)).b(hb1Var);
                    return;
                }
                int i15 = ma1Var.X;
                if (i10 >= i15 && i10 <= ma1Var.Y) {
                    ((ab1) hb1Var.P.get(i10 - i15)).b(hb1Var);
                    return;
                } else if (i10 == ma1Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = hb1Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    ma1 ma1Var2 = hb1Var.X;
                    if (ma1Var2 != null) {
                        ma1Var2.E();
                        hb1Var.S.setItemAnimator(hb1Var.Y);
                        hb1Var.X.s(i16 + 1, size);
                        hb1Var.X.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                ce1 ce1Var = (ce1) this.f36703b;
                if (ce1Var.W0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ce1Var.Z0(i10);
                if (ce1Var.W0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    ce1Var.M0();
                    ce1Var.l1();
                }
                ce1Var.n1();
                org.telegram.ui.Components.m91 m91Var = ce1Var.J0[1];
                if (ce1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                m91Var.a(z12, true);
                ce1Var.P0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    ce1Var.P0.v0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > ce1Var.P0.getMeasuredWidth()) {
                    kc1 kc1Var = ce1Var.P0;
                    kc1Var.v0(i18 - kc1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 10:
                ze1 ze1Var = (ze1) this.f36703b;
                int i19 = ze1Var.H;
                HashSet hashSet = ze1Var.f42299w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f18916id))) {
                        hashSet.remove(Long.valueOf(chat.f18916id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f18916id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && ze1Var.v != -1 && ze1Var.f42296n.getVisibility() == 0) {
                        ze1Var.v = -1;
                        ze1Var.f42296n.animate().setListener(null).cancel();
                        ze1Var.f42296n.animate().translationY(i19).setDuration(200L).setListener(new ve1(ze1Var, 0)).start();
                        if (ze1Var.f42298s.getVisibility() == 0) {
                            mm0Var2 = ze1Var.f42293b;
                        } else {
                            mm0Var2 = ze1Var.f42292a;
                        }
                        mm0Var2.d1(false);
                        int N0 = ((s4.b0) mm0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == mm0Var2.getAdapter().h() - 1 || (N0 == mm0Var2.getAdapter().h() - 2 && mm0Var2 == ze1Var.f42292a)) && (K = mm0Var2.K(N0)) != null) {
                            int bottom = K.f44838a.getBottom();
                            if (N0 == ze1Var.d.f40945c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (mm0Var2.getMeasuredHeight() - bottom <= i19) {
                                mm0Var2.setTranslationY(-(mm0Var2.getMeasuredHeight() - bottom));
                                mm0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ze1Var.f42292a.setPadding(0, 0, 0, 0);
                        ze1Var.f42293b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && ze1Var.f42296n.getVisibility() == 8 && ze1Var.v != 1) {
                        ze1Var.v = 1;
                        ze1Var.f42296n.setVisibility(0);
                        ze1Var.f42296n.setTranslationY(i19);
                        ze1Var.f42296n.animate().setListener(null).cancel();
                        ze1Var.f42296n.animate().translationY(0.0f).setDuration(200L).setListener(new ve1(ze1Var, 1)).start();
                        ze1Var.f42292a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(f7));
                        ze1Var.f42293b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        ze1Var.f42294c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (ze1Var.f42298s.getVisibility() == 0) {
                            mm0Var = ze1Var.f42293b;
                        } else {
                            mm0Var = ze1Var.f42292a;
                        }
                        int height = mm0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            mm0Var.v0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                kg1.V((kg1) this.f36703b, view);
                return;
            case 12:
                kg1 kg1Var = ((gg1) this.f36703b).f36214t0;
                if (view instanceof org.telegram.ui.Cells.qa) {
                    og.d.m(kg1Var, kg1Var.f37380a, ((org.telegram.ui.Cells.qa) view).getTopic(), 0);
                    return;
                } else if (view instanceof hg1) {
                    hg1 hg1Var = (hg1) view;
                    og.d.m(kg1Var, kg1Var.f37380a, hg1Var.N, hg1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 13:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.f36703b, i10);
                return;
            case 14:
                WallpapersListActivity.V((WallpapersListActivity) this.f36703b, i10);
                return;
            default:
                rj1 rj1Var = (rj1) this.f36703b;
                rj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder i20 = t8.b.i(string, " ");
                String[] strArr = WallpapersListActivity.f33676n0;
                i20.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f33677o0[i10]));
                SpannableString spannableString = new SpannableString(i20.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = rj1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                rj1Var.f39536n = strArr[i10];
                rj1Var.E("", true);
                return;
        }
    }
}
