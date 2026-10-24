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
public final class i11 implements org.telegram.ui.Components.zl0 {
    public final int f38120a;
    public final Object f38121b;

    public i11(Object obj, int i10) {
        this.f38120a = i10;
        this.f38121b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        org.telegram.ui.Components.lm0 lm0Var;
        org.telegram.ui.Components.lm0 lm0Var2;
        s4.b1 K;
        int i11 = 0;
        switch (this.f38120a) {
            case 0:
                ProxyListActivity.U((ProxyListActivity) this.f38121b, view, i10);
                return;
            case 1:
                c21.U((c21) this.f38121b, view);
                return;
            case 2:
                u21.U((u21) this.f38121b, view, i10);
                return;
            case 3:
                d31 d31Var = (d31) this.f38121b;
                ti.a aVar = ti.e.d;
                if (i10 == 1) {
                    aVar.a();
                    boolean z13 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z13;
                        aVar.f47650c = true;
                        aVar.f47649b = true;
                        ti.d.f47656a.edit().putBoolean("round_video_camera2_enabled", z13).apply();
                    }
                    d31Var.f36462b.l();
                    return;
                }
                aVar.a();
                if (aVar.d) {
                    if (i10 == 2) {
                        d31Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new wv(19));
                        return;
                    } else if (i10 == 3) {
                        d31Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new wv(20));
                        return;
                    } else if (i10 == 4) {
                        d31Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new wv(21));
                        return;
                    } else if (i10 == 5) {
                        CharSequence[] charSequenceArr = new CharSequence[4];
                        while (true) {
                            int[] iArr = d31.f36460c;
                            if (i11 < 3) {
                                charSequenceArr[i11] = d31.U(iArr[i11]);
                                i11++;
                            } else {
                                d31Var.V(R.string.RoundVideoBitrate, charSequenceArr, new wv(22));
                                return;
                            }
                        }
                    } else if (i10 == 8) {
                        ti.a aVar2 = ti.e.f47662i;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        d31Var.f36462b.m(i10);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                k61 k61Var = (k61) this.f38121b;
                org.telegram.ui.Components.l61 G = k61Var.f38808i0.G(i10 - 1);
                if (G != null) {
                    Object obj = G.G;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).s(true, true);
                        k61Var.f38800a0 = (TLObject) G.G;
                        k61Var.U(true);
                        k61Var.f38808i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((n61) this.f38121b).Q(i10, view);
                return;
            case 6:
                SessionsActivity.U((SessionsActivity) this.f38121b, i10);
                return;
            case 7:
                t91 t91Var = (t91) this.f38121b;
                ArrayList arrayList = t91Var.N;
                ArrayList arrayList2 = t91Var.O;
                y81 y81Var = t91Var.X;
                int i12 = y81Var.I;
                if (i10 >= i12 && i10 <= y81Var.J) {
                    q91 q91Var = (q91) t91Var.f41968v0.get(i10 - i12);
                    xi0 xi0Var = new xi0(q91Var.f40751b, true, t91Var.f41943b);
                    xi0Var.f43621e0 = q91Var;
                    t91Var.presentFragment(xi0Var);
                    return;
                }
                int i13 = y81Var.U;
                if (i10 >= i13 && i10 <= y81Var.V) {
                    ((m91) t91Var.Q.get(i10 - i13)).b(t91Var);
                    return;
                }
                int i14 = y81Var.R;
                if (i10 >= i14 && i10 <= y81Var.S) {
                    ((m91) arrayList2.get(i10 - i14)).b(t91Var);
                    return;
                }
                int i15 = y81Var.X;
                if (i10 >= i15 && i10 <= y81Var.Y) {
                    ((m91) t91Var.P.get(i10 - i15)).b(t91Var);
                    return;
                } else if (i10 == y81Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = t91Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    y81 y81Var2 = t91Var.X;
                    if (y81Var2 != null) {
                        y81Var2.E();
                        t91Var.S.setItemAnimator(t91Var.Y);
                        t91Var.X.s(i16 + 1, size);
                        t91Var.X.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                pc1 pc1Var = (pc1) this.f38121b;
                if (pc1Var.X0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pc1Var.Z0(i10);
                if (pc1Var.X0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    pc1Var.L0();
                    pc1Var.l1();
                }
                pc1Var.n1();
                org.telegram.ui.Components.m91 m91Var = pc1Var.K0[1];
                if (pc1Var.X0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                m91Var.a(z12, true);
                pc1Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    pc1Var.Q0.v0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > pc1Var.Q0.getMeasuredWidth()) {
                    wa1 wa1Var = pc1Var.Q0;
                    wa1Var.v0(i18 - wa1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                ld1 ld1Var = (ld1) this.f38121b;
                int i19 = ld1Var.H;
                HashSet hashSet = ld1Var.f39209w;
                if (view instanceof org.telegram.ui.Cells.f4) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) f4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f20344id))) {
                        hashSet.remove(Long.valueOf(chat.f20344id));
                        f4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f20344id));
                        f4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && ld1Var.v != -1 && ld1Var.f39206n.getVisibility() == 0) {
                        ld1Var.v = -1;
                        ld1Var.f39206n.animate().setListener(null).cancel();
                        ld1Var.f39206n.animate().translationY(i19).setDuration(200L).setListener(new hd1(ld1Var, 0)).start();
                        if (ld1Var.f39208s.getVisibility() == 0) {
                            lm0Var2 = ld1Var.f39203b;
                        } else {
                            lm0Var2 = ld1Var.f39202a;
                        }
                        lm0Var2.e1(false);
                        int N0 = ((s4.b0) lm0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == lm0Var2.getAdapter().h() - 1 || (N0 == lm0Var2.getAdapter().h() - 2 && lm0Var2 == ld1Var.f39202a)) && (K = lm0Var2.K(N0)) != null) {
                            int bottom = K.f46342a.getBottom();
                            if (N0 == ld1Var.d.f38233c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (lm0Var2.getMeasuredHeight() - bottom <= i19) {
                                lm0Var2.setTranslationY(-(lm0Var2.getMeasuredHeight() - bottom));
                                lm0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ld1Var.f39202a.setPadding(0, 0, 0, 0);
                        ld1Var.f39203b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && ld1Var.f39206n.getVisibility() == 8 && ld1Var.v != 1) {
                        ld1Var.v = 1;
                        ld1Var.f39206n.setVisibility(0);
                        ld1Var.f39206n.setTranslationY(i19);
                        ld1Var.f39206n.animate().setListener(null).cancel();
                        ld1Var.f39206n.animate().translationY(0.0f).setDuration(200L).setListener(new hd1(ld1Var, 1)).start();
                        ld1Var.f39202a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(f7));
                        ld1Var.f39203b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        ld1Var.f39204c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (ld1Var.f39208s.getVisibility() == 0) {
                            lm0Var = ld1Var.f39203b;
                        } else {
                            lm0Var = ld1Var.f39202a;
                        }
                        int height = lm0Var.getHeight() - view.getBottom();
                        if (height < i19) {
                            lm0Var.v0(0, i19 - height, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                xe1.V((xe1) this.f38121b, view);
                return;
            case 11:
                xe1 xe1Var = ((se1) this.f38121b).f41384t0;
                if (view instanceof org.telegram.ui.Cells.qa) {
                    og.d.m(xe1Var, xe1Var.f43545a, ((org.telegram.ui.Cells.qa) view).getTopic(), 0);
                    return;
                } else if (view instanceof te1) {
                    te1 te1Var = (te1) view;
                    og.d.m(xe1Var, xe1Var.f43545a, te1Var.N, te1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 12:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.f38121b, i10);
                return;
            case 13:
                WallpapersListActivity.V((WallpapersListActivity) this.f38121b, i10);
                return;
            default:
                bi1 bi1Var = (bi1) this.f38121b;
                bi1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder i20 = si.o0.i(string, " ");
                String[] strArr = WallpapersListActivity.f35519n0;
                i20.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f35520o0[i10]));
                SpannableString spannableString = new SpannableString(i20.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = bi1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                bi1Var.f36081n = strArr[i10];
                bi1Var.E("", true);
                return;
        }
    }
}
