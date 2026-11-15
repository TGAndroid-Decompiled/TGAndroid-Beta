package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;
public final class h implements org.telegram.ui.Components.gj0 {
    public final int f47560a;
    public final Object f47561b;

    public h(Object obj, int i7) {
        this.f47560a = i7;
        this.f47561b = obj;
    }

    private final void a(int i7, View view) {
        pt0 pt0Var = (pt0) this.f47561b;
        int i10 = pt0Var.E;
        if (i7 == pt0Var.f50370x) {
            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.t4.L(pt0Var.getParentActivity(), org.telegram.messenger.hd.M0(2131747913, null), org.telegram.messenger.hd.M0(2131747914, null), org.telegram.messenger.hd.M0(2131751598, null), new nt0(pt0Var), null).f28392a;
            t1Var.show();
            t1Var.i();
        } else if (i7 == pt0Var.f50365f) {
            if (i10 == 1) {
                ?? e2Var = new org.telegram.ui.ActionBar.e2(null);
                e2Var.d = new Paint();
                e2Var.f46249f = new bu[2];
                e2Var.f46254x = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                yw ywVar = new yw(bundle);
                e2Var.f46245a = ywVar;
                ywVar.E2 = new zt(e2Var);
                ywVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                e2Var.f46246b = contactsActivity;
                contactsActivity.V = new zt(e2Var);
                contactsActivity.onFragmentCreate();
                pt0Var.presentFragment((org.telegram.ui.ActionBar.e2) e2Var);
                return;
            }
            Bundle k10 = a8.p0.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            w40 w40Var = new w40(k10);
            w40Var.f52428x = new mt0(pt0Var);
            pt0Var.presentFragment(w40Var);
        } else if (i7 >= pt0Var.f50367r && i7 < pt0Var.f50368s) {
            if (i10 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", pt0Var.getMessagesController().H0.keyAt(i7 - pt0Var.f50367r));
                pt0Var.presentFragment(new ProfileActivity(bundle3, null));
                return;
            }
            new Bundle();
            throw null;
        }
    }

    @Override
    public final void b(int i7, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String M0;
        String a02;
        ss ssVar;
        boolean[] zArr;
        zy zyVar;
        org.telegram.ui.Components.cc a03;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        ts0 ts0Var;
        int i12 = 3;
        ps psVar = null;
        boolean z12 = false;
        int i13 = 1;
        switch (this.f47560a) {
            case 0:
                k kVar = (k) this.f47561b;
                ArrayList arrayList = kVar.h;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    int i14 = ((i) arrayList.get(i7)).d;
                    if (i14 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z13 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z13;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z13);
                        kVar.f48530c = true;
                        return;
                    } else if (i14 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z14 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z14;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z14);
                        kVar.f48530c = true;
                        return;
                    } else if (i14 == 7) {
                        if (!kVar.getUserConfig().q() && !kVar.getMessagesController().Z3 && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.pb pbVar = new org.telegram.ui.Components.pb(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.z70 z70Var = pbVar.f38262b;
                            z70Var.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131743866, null), org.telegram.ui.ActionBar.j6.xj, 0, new fq0(kVar, 3), null));
                            z70Var.setSingleLine(false);
                            z70Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            pbVar.f38261a.setImageResource(2131232363);
                            org.telegram.ui.Components.xb.g(kVar, pbVar, 3500).j();
                            int i15 = -kVar.f48531e;
                            kVar.f48531e = i15;
                            org.telegram.messenger.g0.F3(i15, view, null);
                            org.telegram.messenger.p2.APP_ERROR.a();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                        boolean z15 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z15;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z15);
                        kVar.f48530c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                o oVar = (o) this.f47561b;
                if (i7 >= oVar.f49746y && i7 < oVar.E && oVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.h.get(i7 - oVar.f49746y);
                    if (stickerSetCovered.set.f28078id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f28071id = stickerSetCovered.set.f28078id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.bw0 bw0Var = new org.telegram.ui.Components.bw0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    bw0Var.X1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(bw0Var);
                    return;
                }
                return;
            case 2:
                vy0.Z((vy0) this.f47561b, i7);
                return;
            case 3:
                oc ocVar = (oc) this.f47561b;
                ArrayList arrayList2 = ocVar.f49907c;
                b61 b61Var = ocVar.d;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) arrayList2.get(i7);
                    ocVar.a(dpVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + b61Var.getPaddingLeft()) {
                        b61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + b61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (b61Var.getMeasuredWidth() - b61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        b61Var.w0(org.telegram.messenger.k5.B(48.0f, b61Var.getMeasuredWidth() - b61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.z10 z10Var = ocVar.f49911r;
                    if (z10Var != null) {
                        z10Var.a(dpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                to toVar = (to) this.f47561b;
                boolean z16 = toVar.f51624s;
                if (toVar.getParentActivity() != null) {
                    v4.h0 adapter = toVar.f51618b.getAdapter();
                    so soVar = toVar.f51620e;
                    if (adapter == soVar) {
                        chat = (TLRPC.Chat) soVar.d.get(i7);
                    } else {
                        int i16 = toVar.H;
                        if (i7 >= i16 && i7 < toVar.I) {
                            chat = (TLRPC.Chat) toVar.f51625w.get(i7 - i16);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z16 && toVar.h.linked_chat_id == 0) {
                            toVar.f0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f28051id);
                        toVar.presentFragment(new an(bundle));
                        return;
                    } else if (i7 == toVar.G) {
                        if (z16 && toVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{toVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = toVar.f51621f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.hd.a0("GroupCreateDiscussionDefaultName", null, 2131749454, chat2.title));
                            }
                            c50 c50Var = new c50(bundle2);
                            c50Var.Z = new lo(toVar);
                            toVar.presentFragment(c50Var);
                            return;
                        } else if (!toVar.f51625w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) toVar.f51625w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(toVar.getParentActivity());
                            if (z16) {
                                M0 = org.telegram.messenger.hd.M0(2131751371, null);
                                a02 = org.telegram.messenger.hd.a0("DiscussionUnlinkChannelAlert", null, 2131751372, chat3.title);
                            } else {
                                M0 = org.telegram.messenger.hd.M0(2131751373, null);
                                a02 = org.telegram.messenger.hd.a0("DiscussionUnlinkGroupAlert", null, 2131751370, chat3.title);
                            }
                            alertDialog$Builder.f28392a.S = M0;
                            alertDialog$Builder.f28392a.U = org.telegram.messenger.g0.X2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751374, null), new w0(toVar, 25));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                            toVar.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 5:
                ap apVar = (ap) this.f47561b;
                ArrayList arrayList3 = apVar.f45474n;
                if (i7 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i7 - 3);
                    boolean contains = apVar.d.contains(tL_availableReaction.reaction);
                    boolean z17 = !contains;
                    if (!contains) {
                        apVar.d.add(tL_availableReaction.reaction);
                    } else {
                        apVar.d.remove(tL_availableReaction.reaction);
                        if (apVar.d.isEmpty()) {
                            zo zoVar = apVar.h;
                            if (zoVar != null) {
                                zoVar.p(2, arrayList3.size() + 1);
                            }
                            apVar.a0(2, true);
                        }
                    }
                    Switch r22 = xVar.f31908c;
                    if (r22 != null) {
                        r22.c(z17, true);
                    }
                    org.telegram.ui.Components.fp fpVar = xVar.d;
                    if (fpVar != null) {
                        fpVar.a(z17, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                js jsVar = (js) this.f47561b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ms) view).d;
                ns nsVar = jsVar.f48452a;
                ch.b0 reactionsWindow = nsVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f5022q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.gw0.c(null, nsVar.f49657c0, nsVar.f49679z.getContext(), new a5(jsVar, 9));
                    return;
                }
                ls lsVar = nsVar.f49666l;
                if (lsVar != null) {
                    lsVar.u(stickerSetCovered2.set, TextUtils.join("", nsVar.f49669o));
                }
                nsVar.o();
                return;
            case 7:
                ts tsVar = (ts) this.f47561b;
                if (tsVar.f51661f && tsVar.f51660e) {
                    org.telegram.ui.Components.vj vjVar = tsVar.d;
                    ArrayList arrayList4 = vjVar.f40444e;
                    if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                        psVar = (ps) vjVar.f40444e.get(i7);
                    }
                } else {
                    int S = tsVar.f51659c.S(i7);
                    int Q = tsVar.f51659c.Q(i7);
                    if (Q >= 0 && S >= 0) {
                        psVar = tsVar.f51659c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i7 >= 0) {
                    tsVar.finishFragment();
                    if (psVar != null && (ssVar = tsVar.f51663r) != null) {
                        ssVar.e(psVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                kt ktVar = (kt) this.f47561b;
                ArrayList arrayList5 = ktVar.f48761k3;
                nt ntVar = ktVar.f48773w3;
                if ((view instanceof dt) && i7 >= 0 && i7 < arrayList5.size()) {
                    ft ftVar = (ft) arrayList5.get(i7);
                    if (ftVar != null) {
                        int i17 = ftVar.h;
                        if (i17 >= 0) {
                            ktVar.f48767q3[i17] = !zArr[i17];
                            ktVar.D1(true);
                            return;
                        } else if (i17 == -2) {
                            ntVar.presentFragment(new DataAutoDownloadActivity(ktVar.f48758g3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.l8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ntVar.getParentActivity());
                    alertDialog$Builder2.f28392a.S = org.telegram.messenger.hd.M0(2131746089, null);
                    alertDialog$Builder2.f28392a.U = org.telegram.messenger.hd.M0(2131746090, null);
                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746118, null), new gt(ktVar));
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                    ntVar.showDialog(t1Var2);
                    TextView textView2 = (TextView) t1Var2.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29090q7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                hy.a0((hy) this.f47561b, view, i7);
                return;
            case 10:
                hz hzVar = (hz) this.f47561b;
                if (hzVar.getParentActivity() != null && (zyVar = (zy) hzVar.Q.get(i7)) != null) {
                    View.OnClickListener onClickListener = zyVar.f54060c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i18 = zyVar.f56015a;
                    if (i18 == 1) {
                        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                        hzVar.B0(zyVar, paVar.getName(), paVar.getCurrentObject(), zyVar.f54063g);
                        return;
                    } else if (i18 == 7) {
                        org.telegram.ui.Components.voip.u uVar = new org.telegram.ui.Components.voip.u(17, hzVar, zyVar);
                        if (hzVar.f47855c.f29949x.f57082f) {
                            hzVar.y0(uVar, false);
                            return;
                        } else {
                            uVar.run();
                            return;
                        }
                    } else if (i18 == 8 || (i18 == 4 && zyVar.f54066k == 2131232031)) {
                        org.telegram.messenger.so soVar2 = hzVar.f47859r;
                        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                        if (hzVar.f47860s && hzVar.f47855c.f29949x.f57082f) {
                            float f10 = -hzVar.R;
                            hzVar.R = f10;
                            org.telegram.messenger.g0.F3(f10, view, null);
                            p2Var.a();
                            hzVar.f47861w = true;
                            hi.l3 l3Var = hzVar.S;
                            if ((l3Var == null || !l3Var.W) && (hzVar.fragmentView instanceof FrameLayout)) {
                                hi.l3 l3Var2 = new hi.l3(hzVar.getParentActivity(), 1);
                                l3Var2.r(true);
                                l3Var2.d = 2300L;
                                l3Var2.U = true;
                                l3Var2.f14554e = true;
                                l3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                l3Var2.f14575v0 = -org.telegram.messenger.g0.L(10.0f);
                                hzVar.S = l3Var2;
                                l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                l3Var2.l(hzVar.getBaseSimpleGlass().f56042c);
                                l3Var2.u(org.telegram.messenger.hd.M0(2131750775, null));
                                l3Var2.f14570r0 = new py(l3Var2, 0);
                                ((FrameLayout) hzVar.fragmentView).addView(l3Var2, c8.ja.e(-1, 150, 55));
                                l3Var2.y(hzVar.f47855c, true);
                                return;
                            }
                            return;
                        }
                        if (!TextUtils.isEmpty(hzVar.f47862x) || !TextUtils.isEmpty(soVar2.f26543b)) {
                            int i19 = hzVar.E;
                            int i20 = org.telegram.messenger.np.D8;
                            if ((i19 & (-1537)) == 0 && hzVar.H.isEmpty() && !hzVar.G.isEmpty()) {
                                hzVar.y0(new my(hzVar, 1), false);
                                return;
                            }
                        }
                        float f11 = -hzVar.R;
                        hzVar.R = f11;
                        org.telegram.messenger.g0.F3(f11, view, null);
                        p2Var.a();
                        if (TextUtils.isEmpty(hzVar.f47862x) && TextUtils.isEmpty(soVar2.f26543b)) {
                            a03 = org.telegram.ui.Components.cc.a0(hzVar);
                            i10 = 2131750762;
                        } else {
                            int i21 = hzVar.E;
                            int i22 = org.telegram.messenger.np.D8;
                            if ((i21 & (-1537)) != 0) {
                                if (!hzVar.H.isEmpty()) {
                                    a03 = org.telegram.ui.Components.cc.a0(hzVar);
                                    i10 = 2131750759;
                                } else {
                                    a03 = org.telegram.ui.Components.cc.a0(hzVar);
                                    i10 = 2131750760;
                                }
                            } else if (hzVar.G.isEmpty()) {
                                a03 = org.telegram.ui.Components.cc.a0(hzVar);
                                i10 = 2131750763;
                            } else {
                                a03 = org.telegram.ui.Components.cc.a0(hzVar);
                                i10 = 2131750761;
                            }
                        }
                        org.telegram.messenger.k5.o(null, i10, a03, null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                wy wyVar = (wy) this.f47561b;
                ArrayList arrayList6 = wyVar.f53028a2;
                int i23 = i7 - 1;
                if (i23 >= 0 && i23 < arrayList6.size()) {
                    zy zyVar2 = (zy) arrayList6.get(i23);
                    int i24 = zyVar2.f56015a;
                    if (i24 == 7) {
                        wyVar.dismiss();
                        wyVar.f35940s1.presentFragment(new hy(wyVar.U1, zyVar2.f54068m));
                        return;
                    } else if (i24 == 8) {
                        wyVar.d1();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                zz zzVar = (zz) this.f47561b;
                if (view instanceof org.telegram.ui.Cells.g7) {
                    zzVar.f(i7, view, ((org.telegram.ui.Cells.g7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    zzVar.f(i7, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.f7) {
                    zzVar.f(i7, view, ((org.telegram.ui.Cells.f7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    zzVar.f(i7, view, ((org.telegram.ui.Cells.h2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.t2) {
                    zzVar.f(i7, view, ((org.telegram.ui.Cells.t2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                e50 e50Var = (e50) this.f47561b;
                if (e50Var.getParentActivity() != null) {
                    if (i7 != e50Var.f46570n && i7 != 0) {
                        if (i7 == e50Var.f46572s) {
                            if (e50Var.f46569f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", e50Var.f46569f.link);
                                    e50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131749110, null)), 500);
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            return;
                        } else if (i7 == e50Var.f46571r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(e50Var.getParentActivity());
                            alertDialog$Builder3.f28392a.U = org.telegram.messenger.hd.M0(2131746026, null);
                            alertDialog$Builder3.f28392a.S = org.telegram.messenger.hd.M0(2131746023, null);
                            alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131746024, null), new zr(e50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            e50Var.showDialog(alertDialog$Builder3.f28392a);
                            return;
                        } else {
                            return;
                        }
                    } else if (e50Var.f46569f != null) {
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f26600b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", e50Var.f46569f.link));
                            org.telegram.ui.Components.cc.j(e50Var).j();
                            return;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                l50.Z((l50) this.f47561b, view, i7);
                return;
            case 15:
                y50.Z((y50) this.f47561b, view, i7);
                return;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.f47561b, view, i7);
                return;
            case 17:
                ((bg0) this.f47561b).onBackPressed();
                return;
            case 18:
                jg0 jg0Var = (jg0) this.f47561b;
                int i25 = jg0Var.J;
                if (i7 >= i25 && i7 < jg0Var.K) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) jg0Var.f48348y.get(i7 - i25);
                    if (gjVar.x4()) {
                        if (!jg0Var.g0(gjVar)) {
                            jg0Var.getOrCreateStoryViewer().L(jg0Var.getParentActivity(), gjVar.f23822l, fi.b7.a(jg0Var.f48341f));
                            return;
                        }
                        return;
                    }
                    long B0 = org.telegram.messenger.gj.B0(gjVar.f23817k);
                    Bundle bundle3 = new Bundle();
                    if (org.telegram.messenger.m5.E(B0)) {
                        bundle3.putLong("user_id", B0);
                    } else {
                        bundle3.putLong("chat_id", -B0);
                    }
                    bundle3.putInt("message_id", gjVar.e1());
                    bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                    if (jg0Var.getMessagesController().E(bundle3, jg0Var, null, null)) {
                        jg0Var.presentFragment(new an(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.f47561b, view, i7);
                return;
            case 20:
                hm0 hm0Var = (hm0) this.f47561b;
                hm0Var.a(i7, true);
                ul0 ul0Var = hm0Var.h;
                if (ul0Var != null) {
                    ul0Var.a(Integer.valueOf(i7));
                    return;
                }
                return;
            case 21:
                ym0 ym0Var = (ym0) this.f47561b;
                ArrayList arrayList7 = ym0Var.f53573f;
                ArrayList arrayList8 = ym0Var.f53581n;
                org.telegram.messenger.ve veVar = ym0Var.K;
                if (veVar == null && arrayList7.isEmpty()) {
                    if (i7 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i7);
                        zm0 zm0Var = ym0Var.f53591u0;
                        if (zm0Var != null) {
                            switch (zm0Var.f53988a) {
                                case 1:
                                    bn0.m0(zm0Var.f53989b, str);
                                    return;
                                default:
                                    bn0.m0(zm0Var.f53989b, str);
                                    return;
                            }
                        }
                        ym0Var.Q.getSearchField().setText(str);
                        ym0Var.Q.getSearchField().setSelection(str.length());
                        ym0Var.g0(ym0Var.Q.getSearchField());
                        return;
                    } else if (i7 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ym0Var.getParentActivity());
                        alertDialog$Builder4.f28392a.S = org.telegram.messenger.hd.M0(2131752056, null);
                        alertDialog$Builder4.f28392a.U = org.telegram.messenger.hd.M0(2131752061, null);
                        alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131752099, null), new rm0(ym0Var, 4));
                        alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder4.f28392a;
                        ym0Var.showDialog(t1Var3);
                        TextView textView3 = (TextView) t1Var3.d(-1);
                        if (textView3 != null) {
                            org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.f29090q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                if (veVar != null) {
                    arrayList7 = veVar.f26971e;
                }
                if (i7 >= 0 && i7 < arrayList7.size()) {
                    org.telegram.ui.ActionBar.q0 q0Var = ym0Var.Q;
                    if (q0Var != null) {
                        org.telegram.messenger.g0.v1(q0Var.getSearchField());
                    }
                    if (ym0Var.Z) {
                        ym0Var.f0(view, arrayList7.get(i7));
                        return;
                    }
                    int i26 = ym0Var.U;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 != 2) {
                            i12 = 10;
                            if (i26 != 10) {
                                i13 = ym0Var.V == null ? 4 : 0;
                            }
                        }
                        i13 = i12;
                    }
                    PhotoViewer.p1().I2(null, ym0Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i27 = ym0Var.I;
                    boolean z18 = ym0Var.J;
                    p12.h = i27;
                    p12.f42830n = z18;
                    PhotoViewer.p1().f2(arrayList7, i7, i13, ym0Var.m0, ym0Var.f53598y0, ym0Var.V);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f47561b;
                ArrayList arrayList9 = photoViewer.f42779g7;
                if (!arrayList9.isEmpty() && (i11 = photoViewer.P4) >= 0 && i11 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof org.telegram.messenger.ye) {
                        ((org.telegram.messenger.ye) obj).f27723s = photoViewer.j1();
                    }
                }
                photoViewer.f42810k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.z2(indexOf);
                }
                photoViewer.f42810k5 = false;
                return;
            case 23:
                nr0 nr0Var = (nr0) this.f47561b;
                boolean[] zArr2 = nr0Var.f49645x;
                if (i7 == nr0Var.f49634p0) {
                    nr0Var.k0();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.q8) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    boolean z19 = nr0Var.M;
                    org.telegram.ui.Components.rw0 rw0Var = nr0Var.R;
                    if (rw0Var != null) {
                        rw0Var.f();
                    }
                    if (nr0Var.J) {
                        int i28 = -nr0Var.P;
                        nr0Var.P = i28;
                        org.telegram.messenger.g0.F3(i28, q8Var, null);
                        org.telegram.messenger.p2.APP_ERROR.a();
                        return;
                    }
                    if (i7 == nr0Var.f49639s0) {
                        z10 = !nr0Var.H;
                        nr0Var.H = z10;
                    } else {
                        int i29 = nr0Var.f49642v0;
                        if (i7 == i29) {
                            z10 = !nr0Var.I;
                            nr0Var.I = z10;
                        } else {
                            if (i7 == nr0Var.f49644w0) {
                                z11 = !nr0Var.K;
                                nr0Var.K = z11;
                                nr0Var.w0();
                                int i30 = nr0Var.f49642v0;
                                if (i30 >= 0 && i29 < 0) {
                                    nr0Var.f49616b.i(i30);
                                } else if (i29 >= 0 && i30 < 0) {
                                    nr0Var.f49616b.s(i29);
                                }
                            } else if (i7 == nr0Var.f49640t0) {
                                boolean z20 = nr0Var.L;
                                z11 = !z20;
                                nr0Var.L = z11;
                                if (!z20 && nr0Var.M) {
                                    int i31 = nr0Var.f49629k0;
                                    nr0Var.M = false;
                                    nr0Var.w0();
                                    v4.e1 K = nr0Var.f49618c.K(nr0Var.f49641u0);
                                    if (K != null) {
                                        ((org.telegram.ui.Cells.q8) K.f58535a).setChecked(false);
                                    } else {
                                        nr0Var.f49616b.g(nr0Var.f49641u0);
                                    }
                                    nr0Var.f49616b.p(i31, 2);
                                }
                            } else if (nr0Var.O == 0) {
                                z10 = !nr0Var.M;
                                nr0Var.M = z10;
                                int i32 = nr0Var.f49629k0;
                                nr0Var.w0();
                                if (nr0Var.M) {
                                    nr0Var.f49616b.o(nr0Var.f49629k0, 2);
                                } else {
                                    nr0Var.f49616b.p(i32, 2);
                                }
                                if (nr0Var.M && nr0Var.L) {
                                    nr0Var.L = false;
                                    v4.e1 K2 = nr0Var.f49618c.K(nr0Var.f49640t0);
                                    if (K2 != null) {
                                        ((org.telegram.ui.Cells.q8) K2.f58535a).setChecked(false);
                                    } else {
                                        nr0Var.f49616b.g(nr0Var.f49640t0);
                                    }
                                }
                                if (nr0Var.M) {
                                    boolean z21 = false;
                                    for (int i33 = 0; i33 < zArr2.length; i33++) {
                                        if (z21) {
                                            zArr2[i33] = false;
                                        } else if (zArr2[i33]) {
                                            z21 = true;
                                        }
                                    }
                                }
                            } else {
                                return;
                            }
                            z10 = z11;
                        }
                    }
                    if (nr0Var.N && !nr0Var.M) {
                        nr0Var.f49618c.getChildCount();
                        nr0Var.h.a();
                    }
                    for (int i34 = nr0Var.f49633o0; i34 < nr0Var.f49633o0 + nr0Var.E; i34++) {
                        v4.e1 K3 = nr0Var.f49618c.K(i34);
                        if (K3 != null) {
                            View view2 = K3.f58535a;
                            if (view2 instanceof org.telegram.ui.Cells.z5) {
                                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view2;
                                z5Var.n(nr0Var.M, true);
                                z5Var.f32121r.a(zArr2[i34 - nr0Var.f49633o0], z19);
                                if (z5Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == nr0Var.f49641u0 && !nr0Var.N) {
                                    nr0Var.h.c(z5Var.getCheckBox());
                                    nr0Var.N = true;
                                }
                            }
                        }
                    }
                    q8Var.setChecked(z10);
                    nr0Var.n0();
                    return;
                } else {
                    return;
                }
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.f47561b, view, i7);
                return;
            case 25:
                rs0 rs0Var = (rs0) this.f47561b;
                PremiumPreviewFragment premiumPreviewFragment = rs0Var.f51020n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                zq0 zq0Var = rs0Var.f51018e;
                if (view.isEnabled() && (view instanceof ug.l1)) {
                    ug.l1 l1Var = (ug.l1) view;
                    premiumPreviewFragment.f42982e = arrayList10.indexOf(l1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    l1Var.c(true, true);
                    for (int i35 = 0; i35 < zq0Var.getChildCount(); i35++) {
                        View childAt = zq0Var.getChildAt(i35);
                        if (childAt instanceof ug.l1) {
                            ug.l1 l1Var2 = (ug.l1) childAt;
                            if (l1Var2.getTier() != l1Var.getTier()) {
                                l1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i36 = 0; i36 < zq0Var.getHiddenChildCount(); i36++) {
                        View V = zq0Var.V(i36);
                        if (V instanceof ug.l1) {
                            ug.l1 l1Var3 = (ug.l1) V;
                            if (l1Var3.getTier() != l1Var.getTier()) {
                                l1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < zq0Var.getCachedChildCount(); i37++) {
                        View P = zq0Var.P(i37);
                        if (P instanceof ug.l1) {
                            ug.l1 l1Var4 = (ug.l1) P;
                            if (l1Var4.getTier() != l1Var.getTier()) {
                                l1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < zq0Var.getAttachedScrapChildCount(); i38++) {
                        View O = zq0Var.O(i38);
                        if (O instanceof ug.l1) {
                            ug.l1 l1Var5 = (ug.l1) O;
                            if (l1Var5.getTier() != l1Var.getTier()) {
                                l1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((ts0Var = premiumPreviewFragment.f42984f) != null && ts0Var.f51665a.months < ((ts0) arrayList10.get(premiumPreviewFragment.f42982e)).f51665a.months && !premiumPreviewFragment.f42996q0)) {
                        z12 = true;
                    }
                    org.telegram.messenger.g0.W3(frameLayout, z12);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.c0((PrivacyControlActivity) this.f47561b, view, i7);
                return;
            case 27:
                a(i7, view);
                return;
            case 28:
                ProfileActivity.c0((ProfileActivity) this.f47561b, i7);
                return;
            default:
                ProxyListActivity.Z((ProxyListActivity) this.f47561b, view, i7);
                return;
        }
    }
}
