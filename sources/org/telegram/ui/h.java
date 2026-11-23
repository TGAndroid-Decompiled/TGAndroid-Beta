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
public final class h implements org.telegram.ui.Components.qj0 {
    public final int f48188a;
    public final Object f48189b;

    public h(Object obj, int i7) {
        this.f48188a = i7;
        this.f48189b = obj;
    }

    private final void a(int i7, View view) {
        st0 st0Var = (st0) this.f48189b;
        int i10 = st0Var.E;
        if (i7 == st0Var.f52135x) {
            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.c5.L(st0Var.getParentActivity(), org.telegram.messenger.hd.N0(2131747719, null), org.telegram.messenger.hd.N0(2131747720, null), org.telegram.messenger.hd.N0(2131751586, null), new qt0(st0Var), null).f28777a;
            t1Var.show();
            t1Var.i();
        } else if (i7 == st0Var.f52130f) {
            if (i10 == 1) {
                ?? g2Var = new org.telegram.ui.ActionBar.g2(null);
                g2Var.d = new Paint();
                g2Var.f47388f = new du[2];
                g2Var.f47393x = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                cx cxVar = new cx(bundle);
                g2Var.f47384a = cxVar;
                cxVar.E2 = new bu(g2Var);
                cxVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                g2Var.f47385b = contactsActivity;
                contactsActivity.V = new bu(g2Var);
                contactsActivity.onFragmentCreate();
                st0Var.presentFragment((org.telegram.ui.ActionBar.g2) g2Var);
                return;
            }
            Bundle k10 = a8.p0.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            z40 z40Var = new z40(k10);
            z40Var.f54434x = new pt0(st0Var);
            st0Var.presentFragment(z40Var);
        } else if (i7 >= st0Var.f52132r && i7 < st0Var.f52133s) {
            if (i10 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", st0Var.getMessagesController().H0.keyAt(i7 - st0Var.f52132r));
                st0Var.presentFragment(new ProfileActivity(bundle3, null));
                return;
            }
            new Bundle();
            throw null;
        }
    }

    @Override
    public final void c(int i7, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String N0;
        String a02;
        ts tsVar;
        boolean[] zArr;
        cz czVar;
        org.telegram.ui.Components.lc b02;
        int i10;
        int i11;
        boolean z10;
        xs0 xs0Var;
        char c10 = 3;
        ps psVar = null;
        char c11 = 0;
        r5 = false;
        r5 = false;
        boolean z11 = false;
        switch (this.f48188a) {
            case 0:
                k kVar = (k) this.f48189b;
                ArrayList arrayList = kVar.h;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    int i12 = ((i) arrayList.get(i7)).d;
                    if (i12 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z12 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z12;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z12);
                        kVar.f49151c = true;
                        return;
                    } else if (i12 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z13 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z13;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z13);
                        kVar.f49151c = true;
                        return;
                    } else if (i12 == 7) {
                        if (!kVar.getUserConfig().q() && !kVar.getMessagesController().f25807b4 && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.m80 m80Var = ybVar.f42375b;
                            m80Var.setText(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131743621, null), org.telegram.ui.ActionBar.m6.xj, 0, new hq0(kVar, 3), null));
                            m80Var.setSingleLine(false);
                            m80Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            ybVar.f42374a.setImageResource(2131232364);
                            org.telegram.ui.Components.gc.g(kVar, ybVar, 3500).j();
                            int i13 = -kVar.f49152e;
                            kVar.f49152e = i13;
                            org.telegram.messenger.g0.E3(i13, view, null);
                            org.telegram.messenger.q2.APP_ERROR.a();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                        boolean z14 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z14;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z14);
                        kVar.f49151c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                o oVar = (o) this.f48189b;
                if (i7 >= oVar.f50387y && i7 < oVar.E && oVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.h.get(i7 - oVar.f50387y);
                    if (stickerSetCovered.set.f28461id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f28454id = stickerSetCovered.set.f28461id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.kw0 kw0Var = new org.telegram.ui.Components.kw0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    kw0Var.X1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(kw0Var);
                    return;
                }
                return;
            case 2:
                zy0.Z((zy0) this.f48189b, i7);
                return;
            case 3:
                oc ocVar = (oc) this.f48189b;
                ArrayList arrayList2 = ocVar.f50546c;
                f61 f61Var = ocVar.d;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) arrayList2.get(i7);
                    ocVar.a(mpVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + f61Var.getPaddingLeft()) {
                        f61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + f61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (f61Var.getMeasuredWidth() - f61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        f61Var.w0(org.telegram.messenger.f3.B(48.0f, f61Var.getMeasuredWidth() - f61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.y10 y10Var = ocVar.f50550r;
                    if (y10Var != null) {
                        y10Var.a(mpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                vo voVar = (vo) this.f48189b;
                boolean z15 = voVar.f52866s;
                if (voVar.getParentActivity() != null) {
                    v4.i0 adapter = voVar.f52860b.getAdapter();
                    uo uoVar = voVar.f52862e;
                    if (adapter == uoVar) {
                        chat = (TLRPC.Chat) uoVar.d.get(i7);
                    } else {
                        int i14 = voVar.H;
                        if (i7 >= i14 && i7 < voVar.I) {
                            chat = (TLRPC.Chat) voVar.f52867w.get(i7 - i14);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z15 && voVar.h.linked_chat_id == 0) {
                            voVar.f0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f28434id);
                        voVar.presentFragment(new bn(bundle));
                        return;
                    } else if (i7 == voVar.G) {
                        if (z15 && voVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{voVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = voVar.f52863f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.hd.a0("GroupCreateDiscussionDefaultName", null, 2131749261, chat2.title));
                            }
                            f50 f50Var = new f50(bundle2);
                            f50Var.Z = new no(voVar);
                            voVar.presentFragment(f50Var);
                            return;
                        } else if (!voVar.f52867w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) voVar.f52867w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(voVar.getParentActivity());
                            if (z15) {
                                N0 = org.telegram.messenger.hd.N0(2131751359, null);
                                a02 = org.telegram.messenger.hd.a0("DiscussionUnlinkChannelAlert", null, 2131751360, chat3.title);
                            } else {
                                N0 = org.telegram.messenger.hd.N0(2131751361, null);
                                a02 = org.telegram.messenger.hd.a0("DiscussionUnlinkGroupAlert", null, 2131751358, chat3.title);
                            }
                            alertDialog$Builder.f28777a.S = N0;
                            alertDialog$Builder.f28777a.U = org.telegram.messenger.g0.W2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751362, null), new w0(voVar, 25));
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                            voVar.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
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
                cp cpVar = (cp) this.f48189b;
                ArrayList arrayList3 = cpVar.f46641n;
                if (i7 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i7 - 3);
                    boolean contains = cpVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        cpVar.d.add(tL_availableReaction.reaction);
                    } else {
                        cpVar.d.remove(tL_availableReaction.reaction);
                        if (cpVar.d.isEmpty()) {
                            bp bpVar = cpVar.h;
                            if (bpVar != null) {
                                bpVar.p(2, arrayList3.size() + 1);
                            }
                            cpVar.a0(2, true);
                        }
                    }
                    Switch r22 = xVar.f32307c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.op opVar = xVar.d;
                    if (opVar != null) {
                        opVar.a(z16, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                js jsVar = (js) this.f48189b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ms) view).d;
                ns nsVar = jsVar.f49087a;
                ch.b0 reactionsWindow = nsVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f5340q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.pw0.c(null, nsVar.f50289c0, nsVar.f50311z.getContext(), new a5(jsVar, 9));
                    return;
                }
                ls lsVar = nsVar.f50298l;
                if (lsVar != null) {
                    lsVar.u(stickerSetCovered2.set, TextUtils.join("", nsVar.f50301o));
                }
                nsVar.o();
                return;
            case 7:
                us usVar = (us) this.f48189b;
                if (usVar.f52627f && usVar.f52626e) {
                    org.telegram.ui.Components.ek ekVar = usVar.d;
                    ArrayList arrayList4 = ekVar.f34839e;
                    if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                        psVar = (ps) ekVar.f34839e.get(i7);
                    }
                } else {
                    int S = usVar.f52625c.S(i7);
                    int Q = usVar.f52625c.Q(i7);
                    if (Q >= 0 && S >= 0) {
                        psVar = usVar.f52625c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i7 >= 0) {
                    usVar.finishFragment();
                    if (psVar != null && (tsVar = usVar.f52629r) != null) {
                        tsVar.b(psVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                mt mtVar = (mt) this.f48189b;
                ArrayList arrayList5 = mtVar.f49976k3;
                pt ptVar = mtVar.f49988w3;
                if ((view instanceof ft) && i7 >= 0 && i7 < arrayList5.size()) {
                    ht htVar = (ht) arrayList5.get(i7);
                    if (htVar != null) {
                        int i15 = htVar.h;
                        if (i15 >= 0) {
                            mtVar.f49982q3[i15] = !zArr[i15];
                            mtVar.D1(true);
                            return;
                        } else if (i15 == -2) {
                            ptVar.presentFragment(new DataAutoDownloadActivity(mtVar.f49973g3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ptVar.getParentActivity());
                    alertDialog$Builder2.f28777a.S = org.telegram.messenger.hd.N0(2131745893, null);
                    alertDialog$Builder2.f28777a.U = org.telegram.messenger.hd.N0(2131745894, null);
                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131745922, null), new jt(mtVar));
                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28777a;
                    ptVar.showDialog(t1Var2);
                    TextView textView2 = (TextView) t1Var2.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29622q7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                ky.a0((ky) this.f48189b, view, i7);
                return;
            case 10:
                kz kzVar = (kz) this.f48189b;
                if (kzVar.getParentActivity() != null && (czVar = (cz) kzVar.Q.get(i7)) != null) {
                    View.OnClickListener onClickListener = czVar.f46832c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i16 = czVar.f56634a;
                    if (i16 == 1) {
                        org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
                        kzVar.B0(czVar, raVar.getName(), raVar.getCurrentObject(), czVar.f46835g);
                        return;
                    } else if (i16 == 7) {
                        ss ssVar = new ss(14, kzVar, czVar);
                        if (kzVar.f49428c.f28858x.f57701f) {
                            kzVar.y0(ssVar, false);
                            return;
                        } else {
                            ssVar.run();
                            return;
                        }
                    } else if (i16 == 8 || (i16 == 4 && czVar.f46838k == 2131232032)) {
                        org.telegram.messenger.so soVar = kzVar.f49432r;
                        org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
                        if (kzVar.f49433s && kzVar.f49428c.f28858x.f57701f) {
                            float f10 = -kzVar.R;
                            kzVar.R = f10;
                            org.telegram.messenger.g0.E3(f10, view, null);
                            q2Var.a();
                            kzVar.f49434w = true;
                            hi.l3 l3Var = kzVar.S;
                            if ((l3Var == null || !l3Var.W) && (kzVar.fragmentView instanceof FrameLayout)) {
                                hi.l3 l3Var2 = new hi.l3(kzVar.getParentActivity(), 1);
                                l3Var2.r(true);
                                l3Var2.d = 2300L;
                                l3Var2.U = true;
                                l3Var2.f14972e = true;
                                l3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                l3Var2.f14993v0 = -org.telegram.messenger.g0.L(10.0f);
                                kzVar.S = l3Var2;
                                l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                l3Var2.l(kzVar.getBaseSimpleGlass().f56661c);
                                l3Var2.v(org.telegram.messenger.hd.N0(2131750763, null));
                                l3Var2.f14988r0 = new sy(l3Var2, 0);
                                ((FrameLayout) kzVar.fragmentView).addView(l3Var2, c8.ma.e(-1, 150, 55));
                                l3Var2.z(kzVar.f49428c, true);
                                return;
                            }
                            return;
                        }
                        if (!TextUtils.isEmpty(kzVar.f49435x) || !TextUtils.isEmpty(soVar.f26887b)) {
                            int i17 = kzVar.E;
                            int i18 = org.telegram.messenger.np.I8;
                            if ((i17 & (-1537)) == 0 && kzVar.H.isEmpty() && !kzVar.G.isEmpty()) {
                                kzVar.y0(new py(kzVar, 1), false);
                                return;
                            }
                        }
                        float f11 = -kzVar.R;
                        kzVar.R = f11;
                        org.telegram.messenger.g0.E3(f11, view, null);
                        q2Var.a();
                        if (TextUtils.isEmpty(kzVar.f49435x) && TextUtils.isEmpty(soVar.f26887b)) {
                            b02 = org.telegram.ui.Components.lc.b0(kzVar);
                            i10 = 2131750750;
                        } else {
                            int i19 = kzVar.E;
                            int i20 = org.telegram.messenger.np.I8;
                            if ((i19 & (-1537)) != 0) {
                                if (!kzVar.H.isEmpty()) {
                                    b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                    i10 = 2131750747;
                                } else {
                                    b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                    i10 = 2131750748;
                                }
                            } else if (kzVar.G.isEmpty()) {
                                b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                i10 = 2131750751;
                            } else {
                                b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                i10 = 2131750749;
                            }
                        }
                        org.telegram.messenger.f3.o(null, i10, b02, null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                zy zyVar = (zy) this.f48189b;
                ArrayList arrayList6 = zyVar.f54665a2;
                int i21 = i7 - 1;
                if (i21 >= 0 && i21 < arrayList6.size()) {
                    cz czVar2 = (cz) arrayList6.get(i21);
                    int i22 = czVar2.f56634a;
                    if (i22 == 7) {
                        zyVar.dismiss();
                        zyVar.f39536s1.presentFragment(new ky(zyVar.U1, czVar2.f46840m));
                        return;
                    } else if (i22 == 8) {
                        zyVar.e1();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                c00 c00Var = (c00) this.f48189b;
                if (view instanceof org.telegram.ui.Cells.i7) {
                    c00Var.f(i7, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.l7) {
                    c00Var.f(i7, view, ((org.telegram.ui.Cells.l7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    c00Var.f(i7, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.i2) {
                    c00Var.f(i7, view, ((org.telegram.ui.Cells.i2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.u2) {
                    c00Var.f(i7, view, ((org.telegram.ui.Cells.u2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                h50 h50Var = (h50) this.f48189b;
                if (h50Var.getParentActivity() != null) {
                    if (i7 != h50Var.f48239n && i7 != 0) {
                        if (i7 == h50Var.f48241s) {
                            if (h50Var.f48238f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", h50Var.f48238f.link);
                                    h50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131748917, null)), 500);
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            return;
                        } else if (i7 == h50Var.f48240r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h50Var.getParentActivity());
                            alertDialog$Builder3.f28777a.U = org.telegram.messenger.hd.N0(2131745830, null);
                            alertDialog$Builder3.f28777a.S = org.telegram.messenger.hd.N0(2131745827, null);
                            alertDialog$Builder3.k(org.telegram.messenger.hd.N0(2131745828, null), new zr(h50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            h50Var.showDialog(alertDialog$Builder3.f28777a);
                            return;
                        } else {
                            return;
                        }
                    } else if (h50Var.f48238f != null) {
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f26931b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", h50Var.f48238f.link));
                            org.telegram.ui.Components.lc.j(h50Var).j();
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
                n50.Z((n50) this.f48189b, view, i7);
                return;
            case 15:
                a60.Z((a60) this.f48189b, view, i7);
                return;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.f48189b, view, i7);
                return;
            case 17:
                ((eg0) this.f48189b).onBackPressed();
                return;
            case 18:
                og0 og0Var = (og0) this.f48189b;
                int i23 = og0Var.J;
                if (i7 >= i23 && i7 < og0Var.K) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) og0Var.f50598y.get(i7 - i23);
                    if (gjVar.x4()) {
                        if (!og0Var.g0(gjVar)) {
                            og0Var.getOrCreateStoryViewer().L(og0Var.getParentActivity(), gjVar.f24218l, fi.y6.a(og0Var.f50591f));
                            return;
                        }
                        return;
                    }
                    long B0 = org.telegram.messenger.gj.B0(gjVar.f24213k);
                    Bundle bundle3 = new Bundle();
                    if (org.telegram.messenger.n5.E(B0)) {
                        bundle3.putLong("user_id", B0);
                    } else {
                        bundle3.putLong("chat_id", -B0);
                    }
                    bundle3.putInt("message_id", gjVar.e1());
                    bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                    if (og0Var.getMessagesController().E(bundle3, og0Var, null, null)) {
                        og0Var.presentFragment(new bn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.f48189b, view, i7);
                return;
            case 20:
                km0 km0Var = (km0) this.f48189b;
                km0Var.a(i7, true);
                xl0 xl0Var = km0Var.h;
                if (xl0Var != null) {
                    xl0Var.a(Integer.valueOf(i7));
                    return;
                }
                return;
            case 21:
                cn0 cn0Var = (cn0) this.f48189b;
                ArrayList arrayList7 = cn0Var.f46605f;
                ArrayList arrayList8 = cn0Var.f46613n;
                org.telegram.messenger.ve veVar = cn0Var.K;
                if (veVar == null && arrayList7.isEmpty()) {
                    if (i7 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i7);
                        dn0 dn0Var = cn0Var.f46623u0;
                        if (dn0Var != null) {
                            switch (dn0Var.f47017a) {
                                case 1:
                                    fn0.m0(dn0Var.f47018b, str);
                                    return;
                                default:
                                    fn0.m0(dn0Var.f47018b, str);
                                    return;
                            }
                        }
                        cn0Var.Q.getSearchField().setText(str);
                        cn0Var.Q.getSearchField().setSelection(str.length());
                        cn0Var.g0(cn0Var.Q.getSearchField());
                        return;
                    } else if (i7 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(cn0Var.getParentActivity());
                        alertDialog$Builder4.f28777a.S = org.telegram.messenger.hd.N0(2131752044, null);
                        alertDialog$Builder4.f28777a.U = org.telegram.messenger.hd.N0(2131752049, null);
                        alertDialog$Builder4.k(org.telegram.messenger.hd.N0(2131752087, null), new um0(cn0Var, 4));
                        alertDialog$Builder4.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder4.f28777a;
                        cn0Var.showDialog(t1Var3);
                        TextView textView3 = (TextView) t1Var3.d(-1);
                        if (textView3 != null) {
                            org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.f29622q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                if (veVar != null) {
                    arrayList7 = veVar.f27357e;
                }
                if (i7 >= 0 && i7 < arrayList7.size()) {
                    org.telegram.ui.ActionBar.q0 q0Var = cn0Var.Q;
                    if (q0Var != null) {
                        org.telegram.messenger.g0.v1(q0Var.getSearchField());
                    }
                    if (cn0Var.Z) {
                        cn0Var.f0(view, arrayList7.get(i7));
                        return;
                    }
                    int i24 = cn0Var.U;
                    if (i24 != 1 && i24 != 3) {
                        if (i24 != 2) {
                            c10 = '\n';
                            if (i24 != 10) {
                                if (cn0Var.V == null) {
                                    c11 = 4;
                                }
                            }
                        }
                        c11 = c10;
                    } else {
                        c11 = 1;
                    }
                    PhotoViewer.p1().I2(null, cn0Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i25 = cn0Var.I;
                    boolean z17 = cn0Var.J;
                    p12.h = i25;
                    p12.f43320n = z17;
                    PhotoViewer.p1().f2(arrayList7, i7, c11, cn0Var.m0, cn0Var.f46630y0, cn0Var.V);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f48189b;
                ArrayList arrayList9 = photoViewer.f43269g7;
                if (!arrayList9.isEmpty() && (i11 = photoViewer.P4) >= 0 && i11 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof org.telegram.messenger.ye) {
                        ((org.telegram.messenger.ye) obj).f28074s = photoViewer.j1();
                    }
                }
                photoViewer.f43300k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.z2(indexOf);
                }
                photoViewer.f43300k5 = false;
                return;
            case 23:
                pr0 pr0Var = (pr0) this.f48189b;
                boolean[] zArr2 = pr0Var.f50964x;
                if (i7 == pr0Var.f50953p0) {
                    pr0Var.k0();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s8) {
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    boolean z18 = pr0Var.M;
                    org.telegram.ui.Components.ax0 ax0Var = pr0Var.R;
                    if (ax0Var != null) {
                        ax0Var.f();
                    }
                    if (pr0Var.J) {
                        int i26 = -pr0Var.P;
                        pr0Var.P = i26;
                        org.telegram.messenger.g0.E3(i26, s8Var, null);
                        org.telegram.messenger.q2.APP_ERROR.a();
                        return;
                    }
                    if (i7 == pr0Var.f50958s0) {
                        z10 = !pr0Var.H;
                        pr0Var.H = z10;
                    } else {
                        int i27 = pr0Var.f50961v0;
                        if (i7 == i27) {
                            z10 = !pr0Var.I;
                            pr0Var.I = z10;
                        } else if (i7 == pr0Var.f50963w0) {
                            z10 = !pr0Var.K;
                            pr0Var.K = z10;
                            pr0Var.w0();
                            int i28 = pr0Var.f50961v0;
                            if (i28 >= 0 && i27 < 0) {
                                pr0Var.f50935b.i(i28);
                            } else if (i27 >= 0 && i28 < 0) {
                                pr0Var.f50935b.s(i27);
                            }
                        } else if (i7 == pr0Var.f50959t0) {
                            boolean z19 = pr0Var.L;
                            boolean z20 = !z19;
                            pr0Var.L = z20;
                            if (!z19 && pr0Var.M) {
                                int i29 = pr0Var.f50948k0;
                                pr0Var.M = false;
                                pr0Var.w0();
                                v4.f1 K = pr0Var.f50937c.K(pr0Var.f50960u0);
                                if (K != null) {
                                    ((org.telegram.ui.Cells.s8) K.f59165a).setChecked(false);
                                } else {
                                    pr0Var.f50935b.g(pr0Var.f50960u0);
                                }
                                pr0Var.f50935b.p(i29, 2);
                            }
                            z10 = z20;
                        } else if (pr0Var.O == 0) {
                            boolean z21 = !pr0Var.M;
                            pr0Var.M = z21;
                            int i30 = pr0Var.f50948k0;
                            pr0Var.w0();
                            if (pr0Var.M) {
                                pr0Var.f50935b.o(pr0Var.f50948k0, 2);
                            } else {
                                pr0Var.f50935b.p(i30, 2);
                            }
                            if (pr0Var.M && pr0Var.L) {
                                pr0Var.L = false;
                                v4.f1 K2 = pr0Var.f50937c.K(pr0Var.f50959t0);
                                if (K2 != null) {
                                    ((org.telegram.ui.Cells.s8) K2.f59165a).setChecked(false);
                                } else {
                                    pr0Var.f50935b.g(pr0Var.f50959t0);
                                }
                            }
                            if (pr0Var.M) {
                                int i31 = 0;
                                boolean z22 = false;
                                while (i31 < zArr2.length) {
                                    if (z22) {
                                        zArr2[i31] = false;
                                    } else if (zArr2[i31]) {
                                        z22 = true;
                                    }
                                    i31++;
                                    z22 = z22;
                                }
                            }
                            z10 = z21;
                        } else {
                            return;
                        }
                    }
                    if (pr0Var.N && !pr0Var.M) {
                        pr0Var.f50937c.getChildCount();
                        pr0Var.h.a();
                    }
                    for (int i32 = pr0Var.f50952o0; i32 < pr0Var.f50952o0 + pr0Var.E; i32++) {
                        v4.f1 K3 = pr0Var.f50937c.K(i32);
                        if (K3 != null) {
                            View view2 = K3.f59165a;
                            if (view2 instanceof org.telegram.ui.Cells.b6) {
                                org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view2;
                                b6Var.n(pr0Var.M, true);
                                b6Var.f30479r.a(zArr2[i32 - pr0Var.f50952o0], z18);
                                if (b6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == pr0Var.f50960u0 && !pr0Var.N) {
                                    pr0Var.h.c(b6Var.getCheckBox());
                                    pr0Var.N = true;
                                }
                            }
                        }
                    }
                    s8Var.setChecked(z10);
                    pr0Var.n0();
                    return;
                } else {
                    return;
                }
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.f48189b, view, i7);
                return;
            case 25:
                vs0 vs0Var = (vs0) this.f48189b;
                PremiumPreviewFragment premiumPreviewFragment = vs0Var.f52890n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                br0 br0Var = vs0Var.f52888e;
                if (view.isEnabled() && (view instanceof ug.n1)) {
                    ug.n1 n1Var = (ug.n1) view;
                    premiumPreviewFragment.f43472e = arrayList10.indexOf(n1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    n1Var.c(true, true);
                    for (int i33 = 0; i33 < br0Var.getChildCount(); i33++) {
                        View childAt = br0Var.getChildAt(i33);
                        if (childAt instanceof ug.n1) {
                            ug.n1 n1Var2 = (ug.n1) childAt;
                            if (n1Var2.getTier() != n1Var.getTier()) {
                                n1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i34 = 0; i34 < br0Var.getHiddenChildCount(); i34++) {
                        View V = br0Var.V(i34);
                        if (V instanceof ug.n1) {
                            ug.n1 n1Var3 = (ug.n1) V;
                            if (n1Var3.getTier() != n1Var.getTier()) {
                                n1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i35 = 0; i35 < br0Var.getCachedChildCount(); i35++) {
                        View P = br0Var.P(i35);
                        if (P instanceof ug.n1) {
                            ug.n1 n1Var4 = (ug.n1) P;
                            if (n1Var4.getTier() != n1Var.getTier()) {
                                n1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i36 = 0; i36 < br0Var.getAttachedScrapChildCount(); i36++) {
                        View O = br0Var.O(i36);
                        if (O instanceof ug.n1) {
                            ug.n1 n1Var5 = (ug.n1) O;
                            if (n1Var5.getTier() != n1Var.getTier()) {
                                n1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((xs0Var = premiumPreviewFragment.f43474f) != null && xs0Var.f53947a.months < ((xs0) arrayList10.get(premiumPreviewFragment.f43472e)).f53947a.months && !premiumPreviewFragment.f43486q0)) {
                        z11 = true;
                    }
                    org.telegram.messenger.g0.V3(frameLayout, z11);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.c0((PrivacyControlActivity) this.f48189b, view, i7);
                return;
            case 27:
                a(i7, view);
                return;
            case 28:
                ProfileActivity.c0((ProfileActivity) this.f48189b, i7);
                return;
            default:
                ProxyListActivity.Z((ProxyListActivity) this.f48189b, view, i7);
                return;
        }
    }
}
