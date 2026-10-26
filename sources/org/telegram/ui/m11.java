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
public final class m11 implements org.telegram.ui.Components.zl0 {
    public final int f41432a;
    public final Object f41433b;

    public m11(Object obj, int i10) {
        this.f41432a = i10;
        this.f41433b = obj;
    }

    @Override
    public final void c(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        org.telegram.ui.Components.mm0 mm0Var;
        org.telegram.ui.Components.mm0 mm0Var2;
        s4.e1 K;
        int i11 = 0;
        switch (this.f41432a) {
            case 0:
                ProxyListActivity.V((ProxyListActivity) this.f41433b, view, i10);
                return;
            case 1:
                g21.V((g21) this.f41433b, view);
                return;
            case 2:
                y21.V((y21) this.f41433b, view, i10);
                return;
            case 3:
                g31 g31Var = (g31) this.f41433b;
                wi.a aVar = wi.e.d;
                if (i10 == 1) {
                    aVar.a();
                    boolean z13 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z13;
                        aVar.f51269c = true;
                        aVar.f51268b = true;
                        wi.d.f51275a.edit().putBoolean("round_video_camera2_enabled", z13).apply();
                    }
                    g31Var.f39537b.l();
                    return;
                }
                aVar.a();
                if (aVar.d) {
                    if (i10 == 2) {
                        g31Var.W(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new org.telegram.ui.Components.voip.c1(22));
                        return;
                    } else if (i10 == 3) {
                        g31Var.W(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new org.telegram.ui.Components.voip.c1(23));
                        return;
                    } else if (i10 == 4) {
                        g31Var.W(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new org.telegram.ui.Components.voip.c1(24));
                        return;
                    } else if (i10 == 5) {
                        CharSequence[] charSequenceArr = new CharSequence[4];
                        while (true) {
                            int[] iArr = g31.f39535c;
                            if (i11 < 3) {
                                charSequenceArr[i11] = g31.V(iArr[i11]);
                                i11++;
                            } else {
                                g31Var.W(R.string.RoundVideoBitrate, charSequenceArr, new org.telegram.ui.Components.voip.c1(25));
                                return;
                            }
                        }
                    } else if (i10 == 8) {
                        wi.a aVar2 = wi.e.f51281i;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        g31Var.f39537b.m(i10);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                m61 m61Var = (m61) this.f41433b;
                org.telegram.ui.Components.t61 G = m61Var.f41481i0.G(i10 - 1);
                if (G != null) {
                    Object obj = G.G;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.m6) view).r(true, true);
                        m61Var.f41473a0 = (TLObject) G.G;
                        m61Var.U(true);
                        m61Var.f41481i0.O(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((p61) this.f41433b).Q(i10, view);
                return;
            case 6:
                SessionsActivity.V((SessionsActivity) this.f41433b, i10);
                return;
            case 7:
                w91 w91Var = (w91) this.f41433b;
                ArrayList arrayList = w91Var.N;
                ArrayList arrayList2 = w91Var.O;
                b91 b91Var = w91Var.W;
                int i12 = b91Var.I;
                if (i10 >= i12 && i10 <= b91Var.J) {
                    t91 t91Var = (t91) w91Var.f45053y0.get(i10 - i12);
                    vi0 vi0Var = new vi0(t91Var.f43706b, true, w91Var.f45022b);
                    vi0Var.f44827e0 = t91Var;
                    w91Var.presentFragment(vi0Var);
                    return;
                }
                int i13 = b91Var.U;
                if (i10 >= i13 && i10 <= b91Var.V) {
                    ((p91) w91Var.Q.get(i10 - i13)).b(w91Var);
                    return;
                }
                int i14 = b91Var.R;
                if (i10 >= i14 && i10 <= b91Var.S) {
                    ((p91) arrayList2.get(i10 - i14)).b(w91Var);
                    return;
                }
                int i15 = b91Var.X;
                if (i10 >= i15 && i10 <= b91Var.Y) {
                    ((p91) w91Var.P.get(i10 - i15)).b(w91Var);
                    return;
                } else if (i10 == b91Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = w91Var.W.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    b91 b91Var2 = w91Var.W;
                    if (b91Var2 != null) {
                        b91Var2.E();
                        w91Var.S.setItemAnimator(w91Var.X);
                        w91Var.W.s(i16 + 1, size);
                        w91Var.W.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                tc1 tc1Var = (tc1) this.f41433b;
                if (tc1Var.X0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tc1Var.a1(i10);
                if (tc1Var.X0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    tc1Var.M0();
                    tc1Var.m1();
                }
                tc1Var.o1();
                org.telegram.ui.Components.v91 v91Var = tc1Var.K0[1];
                if (tc1Var.X0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                v91Var.a(z12, true);
                tc1Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    tc1Var.Q0.w0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > tc1Var.Q0.getMeasuredWidth()) {
                    za1 za1Var = tc1Var.Q0;
                    za1Var.w0(i18 - za1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                pd1 pd1Var = (pd1) this.f41433b;
                int i19 = pd1Var.H;
                HashSet hashSet = pd1Var.f42478w;
                if (view instanceof org.telegram.ui.Cells.k4) {
                    org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) k4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f22027id))) {
                        hashSet.remove(Long.valueOf(chat.f22027id));
                        k4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f22027id));
                        k4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && pd1Var.v != -1 && pd1Var.f42475n.getVisibility() == 0) {
                        pd1Var.v = -1;
                        pd1Var.f42475n.animate().setListener(null).cancel();
                        pd1Var.f42475n.animate().translationY(i19).setDuration(200L).setListener(new ld1(pd1Var, 0)).start();
                        if (pd1Var.f42477s.getVisibility() == 0) {
                            mm0Var2 = pd1Var.f42472b;
                        } else {
                            mm0Var2 = pd1Var.f42471a;
                        }
                        mm0Var2.d1(false);
                        int N0 = ((s4.c0) mm0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == mm0Var2.getAdapter().h() - 1 || (N0 == mm0Var2.getAdapter().h() - 2 && mm0Var2 == pd1Var.f42471a)) && (K = mm0Var2.K(N0)) != null) {
                            int bottom = K.f47738a.getBottom();
                            if (N0 == pd1Var.d.f41535c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (mm0Var2.getMeasuredHeight() - bottom <= i19) {
                                mm0Var2.setTranslationY(-(mm0Var2.getMeasuredHeight() - bottom));
                                mm0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        pd1Var.f42471a.setPadding(0, 0, 0, 0);
                        pd1Var.f42472b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && pd1Var.f42475n.getVisibility() == 8 && pd1Var.v != 1) {
                        pd1Var.v = 1;
                        pd1Var.f42475n.setVisibility(0);
                        pd1Var.f42475n.setTranslationY(i19);
                        pd1Var.f42475n.animate().setListener(null).cancel();
                        pd1Var.f42475n.animate().translationY(0.0f).setDuration(200L).setListener(new ld1(pd1Var, 1)).start();
                        pd1Var.f42471a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(f7));
                        pd1Var.f42472b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        pd1Var.f42473c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (pd1Var.f42477s.getVisibility() == 0) {
                            mm0Var = pd1Var.f42472b;
                        } else {
                            mm0Var = pd1Var.f42471a;
                        }
                        int height = mm0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            mm0Var.w0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                af1.W((af1) this.f41433b, view);
                return;
            case 11:
                af1 af1Var = ((we1) this.f41433b).f45142v0;
                if (view instanceof org.telegram.ui.Cells.ua) {
                    pg.d.m(af1Var, af1Var.f37734a, ((org.telegram.ui.Cells.ua) view).getTopic(), 0);
                    return;
                } else if (view instanceof xe1) {
                    xe1 xe1Var = (xe1) view;
                    pg.d.m(af1Var, af1Var.f37734a, xe1Var.N, xe1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 12:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) this.f41433b, i10);
                return;
            case 13:
                WallpapersListActivity.V((WallpapersListActivity) this.f41433b, i10);
                return;
            default:
                ei1 ei1Var = (ei1) this.f41433b;
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder l4 = org.telegram.ui.Components.b10.l(string, " ");
                String[] strArr = WallpapersListActivity.f37585j0;
                l4.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f37586k0[i10]));
                SpannableString spannableString = new SpannableString(l4.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = ei1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.P("", true);
                ei1Var.f39119n = strArr[i10];
                ei1Var.E("", true);
                return;
        }
    }
}
