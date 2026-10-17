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
public final class h11 implements org.telegram.ui.Components.wl0 {
    public final int f37400a;
    public final Object f37401b;

    public h11(Object obj, int i10) {
        this.f37400a = i10;
        this.f37401b = obj;
    }

    @Override
    public final void a(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        org.telegram.ui.Components.im0 im0Var;
        org.telegram.ui.Components.im0 im0Var2;
        s4.b1 K;
        int i11 = 0;
        switch (this.f37400a) {
            case 0:
                ProxyListActivity.U((ProxyListActivity) this.f37401b, view, i10);
                return;
            case 1:
                b21.U((b21) this.f37401b, view);
                return;
            case 2:
                t21.U((t21) this.f37401b, view, i10);
                return;
            case 3:
                c31 c31Var = (c31) this.f37401b;
                ti.a aVar = ti.e.d;
                if (i10 == 1) {
                    aVar.a();
                    boolean z13 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z13;
                        aVar.f47228c = true;
                        aVar.f47227b = true;
                        ti.d.f47234a.edit().putBoolean("round_video_camera2_enabled", z13).apply();
                    }
                    c31Var.f35805b.l();
                    return;
                }
                aVar.a();
                if (aVar.d) {
                    if (i10 == 2) {
                        c31Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new hk0(9));
                        return;
                    } else if (i10 == 3) {
                        c31Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new hk0(10));
                        return;
                    } else if (i10 == 4) {
                        c31Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new hk0(11));
                        return;
                    } else if (i10 == 5) {
                        CharSequence[] charSequenceArr = new CharSequence[4];
                        while (true) {
                            int[] iArr = c31.f35803c;
                            if (i11 < 3) {
                                charSequenceArr[i11] = c31.U(iArr[i11]);
                                i11++;
                            } else {
                                c31Var.V(R.string.RoundVideoBitrate, charSequenceArr, new hk0(12));
                                return;
                            }
                        }
                    } else if (i10 == 8) {
                        ti.a aVar2 = ti.e.f47240i;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        c31Var.f35805b.m(i10);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                j61 j61Var = (j61) this.f37401b;
                org.telegram.ui.Components.f61 G = j61Var.f38063i0.G(i10 - 1);
                if (G != null) {
                    Object obj = G.G;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.h6) view).s(true, true);
                        j61Var.f38055a0 = (TLObject) G.G;
                        j61Var.V(true);
                        j61Var.f38063i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((m61) this.f37401b).R(i10, view);
                return;
            case 6:
                SessionsActivity.U((SessionsActivity) this.f37401b, i10);
                return;
            case 7:
                r91 r91Var = (r91) this.f37401b;
                ArrayList arrayList = r91Var.N;
                ArrayList arrayList2 = r91Var.O;
                w81 w81Var = r91Var.X;
                int i12 = w81Var.I;
                if (i10 >= i12 && i10 <= w81Var.J) {
                    o91 o91Var = (o91) r91Var.f40664v0.get(i10 - i12);
                    wi0 wi0Var = new wi0(o91Var.f39695b, true, r91Var.f40639b);
                    wi0Var.f42870e0 = o91Var;
                    r91Var.presentFragment(wi0Var);
                    return;
                }
                int i13 = w81Var.U;
                if (i10 >= i13 && i10 <= w81Var.V) {
                    ((k91) r91Var.Q.get(i10 - i13)).b(r91Var);
                    return;
                }
                int i14 = w81Var.R;
                if (i10 >= i14 && i10 <= w81Var.S) {
                    ((k91) arrayList2.get(i10 - i14)).b(r91Var);
                    return;
                }
                int i15 = w81Var.X;
                if (i10 >= i15 && i10 <= w81Var.Y) {
                    ((k91) r91Var.P.get(i10 - i15)).b(r91Var);
                    return;
                } else if (i10 == w81Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = r91Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    w81 w81Var2 = r91Var.X;
                    if (w81Var2 != null) {
                        w81Var2.E();
                        r91Var.S.setItemAnimator(r91Var.Y);
                        r91Var.X.s(i16 + 1, size);
                        r91Var.X.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                mc1 mc1Var = (mc1) this.f37401b;
                if (mc1Var.W0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mc1Var.Z0(i10);
                if (mc1Var.W0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    mc1Var.M0();
                    mc1Var.l1();
                }
                mc1Var.n1();
                org.telegram.ui.Components.d91 d91Var = mc1Var.J0[1];
                if (mc1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                d91Var.a(z12, true);
                mc1Var.P0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    mc1Var.P0.v0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > mc1Var.P0.getMeasuredWidth()) {
                    ua1 ua1Var = mc1Var.P0;
                    ua1Var.v0(i18 - ua1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                id1 id1Var = (id1) this.f37401b;
                int i19 = id1Var.H;
                HashSet hashSet = id1Var.f37859w;
                if (view instanceof org.telegram.ui.Cells.f4) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) f4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f20272id))) {
                        hashSet.remove(Long.valueOf(chat.f20272id));
                        f4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f20272id));
                        f4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && id1Var.v != -1 && id1Var.f37856n.getVisibility() == 0) {
                        id1Var.v = -1;
                        id1Var.f37856n.animate().setListener(null).cancel();
                        id1Var.f37856n.animate().translationY(i19).setDuration(200L).setListener(new ed1(id1Var, 0)).start();
                        if (id1Var.f37858s.getVisibility() == 0) {
                            im0Var2 = id1Var.f37853b;
                        } else {
                            im0Var2 = id1Var.f37852a;
                        }
                        im0Var2.d1(false);
                        int N0 = ((s4.b0) im0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == im0Var2.getAdapter().h() - 1 || (N0 == im0Var2.getAdapter().h() - 2 && im0Var2 == id1Var.f37852a)) && (K = im0Var2.K(N0)) != null) {
                            int bottom = K.f45938a.getBottom();
                            if (N0 == id1Var.d.f36872c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (im0Var2.getMeasuredHeight() - bottom <= i19) {
                                im0Var2.setTranslationY(-(im0Var2.getMeasuredHeight() - bottom));
                                im0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        id1Var.f37852a.setPadding(0, 0, 0, 0);
                        id1Var.f37853b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && id1Var.f37856n.getVisibility() == 8 && id1Var.v != 1) {
                        id1Var.v = 1;
                        id1Var.f37856n.setVisibility(0);
                        id1Var.f37856n.setTranslationY(i19);
                        id1Var.f37856n.animate().setListener(null).cancel();
                        id1Var.f37856n.animate().translationY(0.0f).setDuration(200L).setListener(new ed1(id1Var, 1)).start();
                        id1Var.f37852a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(f7));
                        id1Var.f37853b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        id1Var.f37854c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (id1Var.f37858s.getVisibility() == 0) {
                            im0Var = id1Var.f37853b;
                        } else {
                            im0Var = id1Var.f37852a;
                        }
                        int height = im0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            im0Var.v0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                te1.V((te1) this.f37401b, view);
                return;
            case 11:
                te1 te1Var = ((pe1) this.f37401b).f40120t0;
                if (view instanceof org.telegram.ui.Cells.pa) {
                    og.d.m(te1Var, te1Var.f41679a, ((org.telegram.ui.Cells.pa) view).getTopic(), 0);
                    return;
                } else if (view instanceof qe1) {
                    qe1 qe1Var = (qe1) view;
                    og.d.m(te1Var, te1Var.f41679a, qe1Var.N, qe1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 12:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.f37401b, i10);
                return;
            case 13:
                WallpapersListActivity.V((WallpapersListActivity) this.f37401b, i10);
                return;
            default:
                xh1 xh1Var = (xh1) this.f37401b;
                xh1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder i20 = r.c.i(string, " ");
                String[] strArr = WallpapersListActivity.f35225n0;
                i20.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f35226o0[i10]));
                SpannableString spannableString = new SpannableString(i20.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = xh1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                xh1Var.f43144n = strArr[i10];
                xh1Var.E("", true);
                return;
        }
    }
}
