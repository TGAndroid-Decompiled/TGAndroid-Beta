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
public final class f11 implements org.telegram.ui.Components.xl0 {
    public final int f36866a;
    public final Object f36867b;

    public f11(Object obj, int i10) {
        this.f36866a = i10;
        this.f36867b = obj;
    }

    @Override
    public final void a(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        org.telegram.ui.Components.jm0 jm0Var;
        org.telegram.ui.Components.jm0 jm0Var2;
        s4.b1 K;
        int i11 = 0;
        switch (this.f36866a) {
            case 0:
                ProxyListActivity.U((ProxyListActivity) this.f36867b, view, i10);
                return;
            case 1:
                z11.U((z11) this.f36867b, view);
                return;
            case 2:
                r21.U((r21) this.f36867b, view, i10);
                return;
            case 3:
                a31 a31Var = (a31) this.f36867b;
                ti.a aVar = ti.e.d;
                if (i10 == 1) {
                    aVar.a();
                    boolean z13 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z13;
                        aVar.f47215c = true;
                        aVar.f47214b = true;
                        ti.d.f47221a.edit().putBoolean("round_video_camera2_enabled", z13).apply();
                    }
                    a31Var.f35268b.l();
                    return;
                }
                aVar.a();
                if (aVar.d) {
                    if (i10 == 2) {
                        a31Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new fk0(9));
                        return;
                    } else if (i10 == 3) {
                        a31Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new fk0(10));
                        return;
                    } else if (i10 == 4) {
                        a31Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new fk0(11));
                        return;
                    } else if (i10 == 5) {
                        CharSequence[] charSequenceArr = new CharSequence[4];
                        while (true) {
                            int[] iArr = a31.f35266c;
                            if (i11 < 3) {
                                charSequenceArr[i11] = a31.U(iArr[i11]);
                                i11++;
                            } else {
                                a31Var.V(R.string.RoundVideoBitrate, charSequenceArr, new fk0(12));
                                return;
                            }
                        }
                    } else if (i10 == 8) {
                        ti.a aVar2 = ti.e.f47227i;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        a31Var.f35268b.m(i10);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                h61 h61Var = (h61) this.f36867b;
                org.telegram.ui.Components.h61 G = h61Var.f37517i0.G(i10 - 1);
                if (G != null) {
                    Object obj = G.G;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.h6) view).t(true, true);
                        h61Var.f37509a0 = (TLObject) G.G;
                        h61Var.V(true);
                        h61Var.f37517i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((k61) this.f36867b).R(i10, view);
                return;
            case 6:
                SessionsActivity.U((SessionsActivity) this.f36867b, i10);
                return;
            case 7:
                p91 p91Var = (p91) this.f36867b;
                ArrayList arrayList = p91Var.N;
                ArrayList arrayList2 = p91Var.O;
                u81 u81Var = p91Var.X;
                int i12 = u81Var.I;
                if (i10 >= i12 && i10 <= u81Var.J) {
                    m91 m91Var = (m91) p91Var.f40157v0.get(i10 - i12);
                    ui0 ui0Var = new ui0(m91Var.f39166b, true, p91Var.f40132b);
                    ui0Var.f41995e0 = m91Var;
                    p91Var.presentFragment(ui0Var);
                    return;
                }
                int i13 = u81Var.U;
                if (i10 >= i13 && i10 <= u81Var.V) {
                    ((i91) p91Var.Q.get(i10 - i13)).b(p91Var);
                    return;
                }
                int i14 = u81Var.R;
                if (i10 >= i14 && i10 <= u81Var.S) {
                    ((i91) arrayList2.get(i10 - i14)).b(p91Var);
                    return;
                }
                int i15 = u81Var.X;
                if (i10 >= i15 && i10 <= u81Var.Y) {
                    ((i91) p91Var.P.get(i10 - i15)).b(p91Var);
                    return;
                } else if (i10 == u81Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = p91Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    u81 u81Var2 = p91Var.X;
                    if (u81Var2 != null) {
                        u81Var2.E();
                        p91Var.S.setItemAnimator(p91Var.Y);
                        p91Var.X.s(i16 + 1, size);
                        p91Var.X.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                kc1 kc1Var = (kc1) this.f36867b;
                if (kc1Var.W0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kc1Var.Z0(i10);
                if (kc1Var.W0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    kc1Var.M0();
                    kc1Var.l1();
                }
                kc1Var.n1();
                org.telegram.ui.Components.f91 f91Var = kc1Var.J0[1];
                if (kc1Var.W0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f91Var.a(z12, true);
                kc1Var.P0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    kc1Var.P0.v0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > kc1Var.P0.getMeasuredWidth()) {
                    sa1 sa1Var = kc1Var.P0;
                    sa1Var.v0(i18 - sa1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                gd1 gd1Var = (gd1) this.f36867b;
                int i19 = gd1Var.H;
                HashSet hashSet = gd1Var.f37295w;
                if (view instanceof org.telegram.ui.Cells.f4) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) f4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f20279id))) {
                        hashSet.remove(Long.valueOf(chat.f20279id));
                        f4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f20279id));
                        f4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && gd1Var.v != -1 && gd1Var.f37292n.getVisibility() == 0) {
                        gd1Var.v = -1;
                        gd1Var.f37292n.animate().setListener(null).cancel();
                        gd1Var.f37292n.animate().translationY(i19).setDuration(200L).setListener(new cd1(gd1Var, 0)).start();
                        if (gd1Var.f37294s.getVisibility() == 0) {
                            jm0Var2 = gd1Var.f37289b;
                        } else {
                            jm0Var2 = gd1Var.f37288a;
                        }
                        jm0Var2.d1(false);
                        int N0 = ((s4.b0) jm0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == jm0Var2.getAdapter().h() - 1 || (N0 == jm0Var2.getAdapter().h() - 2 && jm0Var2 == gd1Var.f37288a)) && (K = jm0Var2.K(N0)) != null) {
                            int bottom = K.f45920a.getBottom();
                            if (N0 == gd1Var.d.f36339c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (jm0Var2.getMeasuredHeight() - bottom <= i19) {
                                jm0Var2.setTranslationY(-(jm0Var2.getMeasuredHeight() - bottom));
                                jm0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        gd1Var.f37288a.setPadding(0, 0, 0, 0);
                        gd1Var.f37289b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && gd1Var.f37292n.getVisibility() == 8 && gd1Var.v != 1) {
                        gd1Var.v = 1;
                        gd1Var.f37292n.setVisibility(0);
                        gd1Var.f37292n.setTranslationY(i19);
                        gd1Var.f37292n.animate().setListener(null).cancel();
                        gd1Var.f37292n.animate().translationY(0.0f).setDuration(200L).setListener(new cd1(gd1Var, 1)).start();
                        gd1Var.f37288a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(f7));
                        gd1Var.f37289b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        gd1Var.f37290c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (gd1Var.f37294s.getVisibility() == 0) {
                            jm0Var = gd1Var.f37289b;
                        } else {
                            jm0Var = gd1Var.f37288a;
                        }
                        int height = jm0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            jm0Var.v0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                re1.V((re1) this.f36867b, view);
                return;
            case 11:
                re1 re1Var = ((ne1) this.f36867b).f39584t0;
                if (view instanceof org.telegram.ui.Cells.pa) {
                    og.d.m(re1Var, re1Var.f41151a, ((org.telegram.ui.Cells.pa) view).getTopic(), 0);
                    return;
                } else if (view instanceof oe1) {
                    oe1 oe1Var = (oe1) view;
                    og.d.m(re1Var, re1Var.f41151a, oe1Var.N, oe1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 12:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.f36867b, i10);
                return;
            case 13:
                WallpapersListActivity.V((WallpapersListActivity) this.f36867b, i10);
                return;
            default:
                vh1 vh1Var = (vh1) this.f36867b;
                vh1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder i20 = r4.c.i(string, " ");
                String[] strArr = WallpapersListActivity.f35212n0;
                i20.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f35213o0[i10]));
                SpannableString spannableString = new SpannableString(i20.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = vh1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                vh1Var.f42265n = strArr[i10];
                vh1Var.E("", true);
                return;
        }
    }
}
