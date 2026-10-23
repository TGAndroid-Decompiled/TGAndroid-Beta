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
public final class j11 implements org.telegram.ui.Components.am0 {
    public final int f38436a;
    public final Object f38437b;

    public j11(Object obj, int i10) {
        this.f38436a = i10;
        this.f38437b = obj;
    }

    @Override
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        org.telegram.ui.Components.mm0 mm0Var;
        org.telegram.ui.Components.mm0 mm0Var2;
        s4.b1 K;
        int i11 = 0;
        switch (this.f38436a) {
            case 0:
                ProxyListActivity.U((ProxyListActivity) this.f38437b, view, i10);
                return;
            case 1:
                d21.U((d21) this.f38437b, view);
                return;
            case 2:
                v21.U((v21) this.f38437b, view, i10);
                return;
            case 3:
                e31 e31Var = (e31) this.f38437b;
                ti.a aVar = ti.e.d;
                if (i10 == 1) {
                    aVar.a();
                    boolean z13 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z13;
                        aVar.f47651c = true;
                        aVar.f47650b = true;
                        ti.d.f47657a.edit().putBoolean("round_video_camera2_enabled", z13).apply();
                    }
                    e31Var.f36814b.l();
                    return;
                }
                aVar.a();
                if (aVar.d) {
                    if (i10 == 2) {
                        e31Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new wv(19));
                        return;
                    } else if (i10 == 3) {
                        e31Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new wv(20));
                        return;
                    } else if (i10 == 4) {
                        e31Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new wv(21));
                        return;
                    } else if (i10 == 5) {
                        CharSequence[] charSequenceArr = new CharSequence[4];
                        while (true) {
                            int[] iArr = e31.f36812c;
                            if (i11 < 3) {
                                charSequenceArr[i11] = e31.U(iArr[i11]);
                                i11++;
                            } else {
                                e31Var.V(R.string.RoundVideoBitrate, charSequenceArr, new wv(22));
                                return;
                            }
                        }
                    } else if (i10 == 8) {
                        ti.a aVar2 = ti.e.f47663i;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        e31Var.f36814b.m(i10);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                l61 l61Var = (l61) this.f38437b;
                org.telegram.ui.Components.m61 G = l61Var.f39148i0.G(i10 - 1);
                if (G != null) {
                    Object obj = G.G;
                    if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).s(true, true);
                        l61Var.f39140a0 = (TLObject) G.G;
                        l61Var.U(true);
                        l61Var.f39148i0.N(true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((o61) this.f38437b).Q(i10, view);
                return;
            case 6:
                SessionsActivity.U((SessionsActivity) this.f38437b, i10);
                return;
            case 7:
                u91 u91Var = (u91) this.f38437b;
                ArrayList arrayList = u91Var.N;
                ArrayList arrayList2 = u91Var.O;
                z81 z81Var = u91Var.X;
                int i12 = z81Var.I;
                if (i10 >= i12 && i10 <= z81Var.J) {
                    r91 r91Var = (r91) u91Var.f42337v0.get(i10 - i12);
                    yi0 yi0Var = new yi0(r91Var.f41065b, true, u91Var.f42312b);
                    yi0Var.f43880e0 = r91Var;
                    u91Var.presentFragment(yi0Var);
                    return;
                }
                int i13 = z81Var.U;
                if (i10 >= i13 && i10 <= z81Var.V) {
                    ((n91) u91Var.Q.get(i10 - i13)).b(u91Var);
                    return;
                }
                int i14 = z81Var.R;
                if (i10 >= i14 && i10 <= z81Var.S) {
                    ((n91) arrayList2.get(i10 - i14)).b(u91Var);
                    return;
                }
                int i15 = z81Var.X;
                if (i10 >= i15 && i10 <= z81Var.Y) {
                    ((n91) u91Var.P.get(i10 - i15)).b(u91Var);
                    return;
                } else if (i10 == z81Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i16 = u91Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    z81 z81Var2 = u91Var.X;
                    if (z81Var2 != null) {
                        z81Var2.E();
                        u91Var.S.setItemAnimator(u91Var.Y);
                        u91Var.X.s(i16 + 1, size);
                        u91Var.X.u(i16);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                qc1 qc1Var = (qc1) this.f38437b;
                if (qc1Var.X0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qc1Var.Z0(i10);
                if (qc1Var.X0 == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    qc1Var.L0();
                    qc1Var.l1();
                }
                qc1Var.n1();
                org.telegram.ui.Components.m91 m91Var = qc1Var.K0[1];
                if (qc1Var.X0 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                m91Var.a(z12, true);
                qc1Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i17 = left - dp;
                if (i17 < 0) {
                    qc1Var.Q0.v0(i17, 0, null);
                    return;
                }
                int i18 = right + dp;
                if (i18 > qc1Var.Q0.getMeasuredWidth()) {
                    xa1 xa1Var = qc1Var.Q0;
                    xa1Var.v0(i18 - xa1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                md1 md1Var = (md1) this.f38437b;
                int i19 = md1Var.H;
                HashSet hashSet = md1Var.f39518w;
                if (view instanceof org.telegram.ui.Cells.f4) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) f4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.f20343id))) {
                        hashSet.remove(Long.valueOf(chat.f20343id));
                        f4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.f20343id));
                        f4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && md1Var.v != -1 && md1Var.f39515n.getVisibility() == 0) {
                        md1Var.v = -1;
                        md1Var.f39515n.animate().setListener(null).cancel();
                        md1Var.f39515n.animate().translationY(i19).setDuration(200L).setListener(new id1(md1Var, 0)).start();
                        if (md1Var.f39517s.getVisibility() == 0) {
                            mm0Var2 = md1Var.f39512b;
                        } else {
                            mm0Var2 = md1Var.f39511a;
                        }
                        mm0Var2.e1(false);
                        int N0 = ((s4.b0) mm0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == mm0Var2.getAdapter().h() - 1 || (N0 == mm0Var2.getAdapter().h() - 2 && mm0Var2 == md1Var.f39511a)) && (K = mm0Var2.K(N0)) != null) {
                            int bottom = K.f46343a.getBottom();
                            if (N0 == md1Var.d.f38532c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (mm0Var2.getMeasuredHeight() - bottom <= i19) {
                                mm0Var2.setTranslationY(-(mm0Var2.getMeasuredHeight() - bottom));
                                mm0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        md1Var.f39511a.setPadding(0, 0, 0, 0);
                        md1Var.f39512b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && md1Var.f39515n.getVisibility() == 8 && md1Var.v != 1) {
                        md1Var.v = 1;
                        md1Var.f39515n.setVisibility(0);
                        md1Var.f39515n.setTranslationY(i19);
                        md1Var.f39515n.animate().setListener(null).cancel();
                        md1Var.f39515n.animate().translationY(0.0f).setDuration(200L).setListener(new id1(md1Var, 1)).start();
                        md1Var.f39511a.setPadding(0, 0, 0, i19 - AndroidUtilities.dp(f7));
                        md1Var.f39512b.setPadding(0, 0, 0, i19);
                    }
                    if (!hashSet.isEmpty()) {
                        md1Var.f39513c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        if (md1Var.f39517s.getVisibility() == 0) {
                            mm0Var = md1Var.f39512b;
                        } else {
                            mm0Var = md1Var.f39511a;
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
            case 10:
                ye1.V((ye1) this.f38437b, view);
                return;
            case 11:
                ye1 ye1Var = ((te1) this.f38437b).f41992t0;
                if (view instanceof org.telegram.ui.Cells.qa) {
                    og.d.m(ye1Var, ye1Var.f43792a, ((org.telegram.ui.Cells.qa) view).getTopic(), 0);
                    return;
                } else if (view instanceof ue1) {
                    ue1 ue1Var = (ue1) view;
                    og.d.m(ye1Var, ye1Var.f43792a, ue1Var.N, ue1Var.getMessageId());
                    return;
                } else {
                    return;
                }
            case 12:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.f38437b, i10);
                return;
            case 13:
                WallpapersListActivity.V((WallpapersListActivity) this.f38437b, i10);
                return;
            default:
                ci1 ci1Var = (ci1) this.f38437b;
                ci1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder i20 = si.o0.i(string, " ");
                String[] strArr = WallpapersListActivity.f35517n0;
                i20.append(LocaleController.getString(strArr[i10], WallpapersListActivity.f35518o0[i10]));
                SpannableString spannableString = new SpannableString(i20.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = ci1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                ci1Var.f36374n = strArr[i10];
                ci1Var.E("", true);
                return;
        }
    }
}
