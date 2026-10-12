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
public final class d21 implements org.telegram.ui.Components.km0 {
    public final int f36623a;
    public final Object f36624b;

    public d21(Object obj, int i10) {
        this.f36623a = i10;
        this.f36624b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        org.telegram.ui.Components.ur0 ur0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        org.telegram.ui.Components.wm0 wm0Var;
        org.telegram.ui.Components.wm0 wm0Var2;
        s4.d1 K;
        int i11 = 0;
        switch (this.f36623a) {
            case 0:
                ProxyListActivity.U((ProxyListActivity) this.f36624b, view, i10);
                return;
            case 1:
                f31 f31Var = (f31) this.f36624b;
                org.telegram.ui.Components.wm0 wm0Var3 = f31Var.f37620y;
                org.telegram.ui.Components.cq cqVar = f31Var.f37611b;
                if (cqVar.d.get(i10) != f31Var.K && f31Var.O == null) {
                    f31Var.Q = false;
                    f31Var.K = (org.telegram.ui.Components.dq) cqVar.d.get(i10);
                    cqVar.E(i10);
                    f31Var.h.postDelayed(new org.telegram.ui.Components.nd(f31Var, i10, 27), 100L);
                    while (i11 < wm0Var3.getChildCount()) {
                        org.telegram.ui.Components.f31 f31Var2 = (org.telegram.ui.Components.f31) wm0Var3.getChildAt(i11);
                        if (f31Var2 != view && (ur0Var = f31Var2.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(ur0Var);
                            f31Var2.J.run();
                        }
                        i11++;
                    }
                    if (!((org.telegram.ui.Components.dq) cqVar.d.get(i10)).f25446a.f20239a) {
                        ((org.telegram.ui.Components.f31) view).d();
                    }
                    r21 r21Var = f31Var.J;
                    if (r21Var != null) {
                        r21Var.f41490a.c0(i10, f31Var.K.f25446a, true);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                n31.U((n31) this.f36624b, view);
                return;
            case 3:
                h41.U((h41) this.f36624b, view, i10);
                return;
            case 4:
                p41 p41Var = (p41) this.f36624b;
                ri.a aVar = ri.e.d;
                if (i10 == 1) {
                    aVar.a();
                    boolean z13 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z13;
                        aVar.f47781c = true;
                        aVar.f47780b = true;
                        ri.d.f47787a.edit().putBoolean("round_video_camera2_enabled", z13).apply();
                    }
                    p41Var.f40847b.l();
                    return;
                }
                aVar.a();
                if (aVar.d) {
                    if (i10 == 2) {
                        p41Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new c80(13));
                        return;
                    } else if (i10 == 3) {
                        p41Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new c80(14));
                        return;
                    } else if (i10 == 4) {
                        p41Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new c80(15));
                        return;
                    } else if (i10 == 5) {
                        CharSequence[] charSequenceArr = new CharSequence[4];
                        while (true) {
                            int[] iArr = p41.f40845c;
                            if (i11 < 3) {
                                charSequenceArr[i11] = p41.U(iArr[i11]);
                                i11++;
                            } else {
                                p41Var.V(R.string.RoundVideoBitrate, charSequenceArr, new c80(16));
                                return;
                            }
                        }
                    } else if (i10 == 8) {
                        ri.a aVar2 = ri.e.f47794i;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        p41Var.f40847b.m(i10);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                x71 x71Var = (x71) this.f36624b;
                org.telegram.ui.Components.u61 G = x71Var.f43796i0.G(i10 - 1);
                if (G != null) {
                    Object obj = G.G;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).t(true, true);
                        x71Var.f43788a0 = (TLObject) G.G;
                        x71Var.V(true);
                        x71Var.f43796i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ((a81) this.f36624b).R(i10, view);
                return;
            case 7:
                SessionsActivity.U((SessionsActivity) this.f36624b, i10);
                return;
            case 8:
                db1 db1Var = (db1) this.f36624b;
                ArrayList arrayList = db1Var.N;
                ArrayList arrayList2 = db1Var.O;
                ia1 ia1Var = db1Var.X;
                int i12 = ia1Var.I;
                if (i10 >= i12 && i10 <= ia1Var.J) {
                    ab1 ab1Var = (ab1) db1Var.f36750v0.get(i10 - i12);
                    mj0 mj0Var = new mj0(ab1Var.f35753b, true, db1Var.f36724b);
                    mj0Var.f40066e0 = ab1Var;
                    db1Var.presentFragment(mj0Var);
                    return;
                }
                int i13 = ia1Var.U;
                if (i10 >= i13 && i10 <= ia1Var.V) {
                    ((wa1) db1Var.Q.get(i10 - i13)).b(db1Var);
                    return;
                }
                int i14 = ia1Var.R;
                if (i10 >= i14 && i10 <= ia1Var.S) {
                    ((wa1) arrayList2.get(i10 - i14)).b(db1Var);
                    return;
                }
                int i15 = ia1Var.X;
                if (i10 >= i15 && i10 <= ia1Var.Y) {
                    ((wa1) db1Var.P.get(i10 - i15)).b(db1Var);
                    return;
                } else if (i10 == ia1Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = db1Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    ia1 ia1Var2 = db1Var.X;
                    if (ia1Var2 != null) {
                        ia1Var2.E();
                        db1Var.S.setItemAnimator(db1Var.Y);
                        db1Var.X.s(i16 + 1, size);
                        db1Var.X.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                zd1 zd1Var = (zd1) this.f36624b;
                if (zd1Var.W0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zd1Var.Z0(i10);
                if (zd1Var.W0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    zd1Var.M0();
                    zd1Var.l1();
                }
                zd1Var.n1();
                org.telegram.ui.Components.v91 v91Var = zd1Var.J0[1];
                if (zd1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                v91Var.a(z12, true);
                zd1Var.P0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    zd1Var.P0.v0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > zd1Var.P0.getMeasuredWidth()) {
                    hc1 hc1Var = zd1Var.P0;
                    hc1Var.v0(i18 - hc1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 10:
                we1 we1Var = (we1) this.f36624b;
                int i19 = we1Var.H;
                HashSet hashSet = we1Var.f43153w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f19802id))) {
                        hashSet.remove(Long.valueOf(chat.f19802id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f19802id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && we1Var.v != -1 && we1Var.f43150n.getVisibility() == 0) {
                        we1Var.v = -1;
                        we1Var.f43150n.animate().setListener(null).cancel();
                        we1Var.f43150n.animate().translationY(i19).setDuration(200L).setListener(new se1(we1Var, 0)).start();
                        if (we1Var.f43152s.getVisibility() == 0) {
                            wm0Var2 = we1Var.f43146b;
                        } else {
                            wm0Var2 = we1Var.f43145a;
                        }
                        wm0Var2.d1(false);
                        int N0 = ((s4.d0) wm0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == wm0Var2.getAdapter().h() - 1 || (N0 == wm0Var2.getAdapter().h() - 2 && wm0Var2 == we1Var.f43145a)) && (K = wm0Var2.K(N0)) != null) {
                            int bottom = K.f47889a.getBottom();
                            if (N0 == we1Var.d.f42174c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (wm0Var2.getMeasuredHeight() - bottom <= i19) {
                                wm0Var2.setTranslationY(-(wm0Var2.getMeasuredHeight() - bottom));
                                wm0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        we1Var.f43145a.setPadding(0, 0, 0, 0);
                        we1Var.f43146b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && we1Var.f43150n.getVisibility() == 8 && we1Var.v != 1) {
                        we1Var.v = 1;
                        we1Var.f43150n.setVisibility(0);
                        we1Var.f43150n.setTranslationY(i19);
                        we1Var.f43150n.animate().setListener(null).cancel();
                        we1Var.f43150n.animate().translationY(0.0f).setDuration(200L).setListener(new se1(we1Var, 1)).start();
                        we1Var.f43145a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(f7));
                        we1Var.f43146b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        we1Var.f43147c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (we1Var.f43152s.getVisibility() == 0) {
                            wm0Var = we1Var.f43146b;
                        } else {
                            wm0Var = we1Var.f43145a;
                        }
                        int height = wm0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            wm0Var.v0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                hg1.V((hg1) this.f36624b, view);
                return;
            case 12:
                hg1 hg1Var = ((dg1) this.f36624b).f36823t0;
                if (view instanceof org.telegram.ui.Cells.qa) {
                    ng.d.m(hg1Var, hg1Var.f38376a, ((org.telegram.ui.Cells.qa) view).getTopic(), 0);
                    return;
                } else if (view instanceof eg1) {
                    eg1 eg1Var = (eg1) view;
                    ng.d.m(hg1Var, hg1Var.f38376a, eg1Var.N, eg1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 13:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.f36624b, i10);
                return;
            case 14:
                WallpapersListActivity.V((WallpapersListActivity) this.f36624b, i10);
                return;
            default:
                mj1 mj1Var = (mj1) this.f36624b;
                mj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder j3 = sc.v.j(string, " ");
                String[] strArr = WallpapersListActivity.f35610n0;
                j3.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f35611o0[i10]));
                SpannableString spannableString = new SpannableString(j3.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = mj1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                mj1Var.f40077n = strArr[i10];
                mj1Var.E("", true);
                return;
        }
    }
}
