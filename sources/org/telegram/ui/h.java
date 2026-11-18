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
public final class h implements org.telegram.ui.Components.oj0 {
    public final int f48107a;
    public final Object f48108b;

    public h(Object obj, int i7) {
        this.f48107a = i7;
        this.f48108b = obj;
    }

    private final void a(int i7, View view) {
        st0 st0Var = (st0) this.f48108b;
        int i10 = st0Var.E;
        if (i7 == st0Var.f52083x) {
            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.b5.L(st0Var.getParentActivity(), org.telegram.messenger.gd.M0(2131747720, null), org.telegram.messenger.gd.M0(2131747721, null), org.telegram.messenger.gd.M0(2131751587, null), new qt0(st0Var), null).f28744a;
            u1Var.show();
            u1Var.i();
        } else if (i7 == st0Var.f52078f) {
            if (i10 == 1) {
                ?? h2Var = new org.telegram.ui.ActionBar.h2(null);
                h2Var.d = new Paint();
                h2Var.f47315f = new du[2];
                h2Var.f47320x = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                cx cxVar = new cx(bundle);
                h2Var.f47311a = cxVar;
                cxVar.E2 = new bu(h2Var);
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
                h2Var.f47312b = contactsActivity;
                contactsActivity.V = new bu(h2Var);
                contactsActivity.onFragmentCreate();
                st0Var.presentFragment((org.telegram.ui.ActionBar.h2) h2Var);
                return;
            }
            Bundle k10 = a8.p0.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            z40 z40Var = new z40(k10);
            z40Var.f54386x = new pt0(st0Var);
            st0Var.presentFragment(z40Var);
        } else if (i7 >= st0Var.f52080r && i7 < st0Var.f52081s) {
            if (i10 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", st0Var.getMessagesController().H0.keyAt(i7 - st0Var.f52080r));
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
        String M0;
        String a02;
        ss ssVar;
        boolean[] zArr;
        cz czVar;
        org.telegram.ui.Components.lc b02;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        xs0 xs0Var;
        int i12 = 3;
        ps psVar = null;
        boolean z12 = false;
        int i13 = 1;
        switch (this.f48107a) {
            case 0:
                k kVar = (k) this.f48108b;
                ArrayList arrayList = kVar.h;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    int i14 = ((i) arrayList.get(i7)).d;
                    if (i14 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z13 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z13;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z13);
                        kVar.f49114c = true;
                        return;
                    } else if (i14 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z14 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z14;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z14);
                        kVar.f49114c = true;
                        return;
                    } else if (i14 == 7) {
                        if (!kVar.getUserConfig().q() && !kVar.getMessagesController().f25608b4 && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.k80 k80Var = ybVar.f42447b;
                            k80Var.setText(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131743629, null), org.telegram.ui.ActionBar.n6.xj, 0, new hq0(kVar, 3), null));
                            k80Var.setSingleLine(false);
                            k80Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            ybVar.f42446a.setImageResource(2131232364);
                            org.telegram.ui.Components.gc.g(kVar, ybVar, 3500).j();
                            int i15 = -kVar.f49115e;
                            kVar.f49115e = i15;
                            org.telegram.messenger.g0.E3(i15, view, null);
                            org.telegram.messenger.q2.APP_ERROR.a();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                        boolean z15 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z15;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z15);
                        kVar.f49114c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                o oVar = (o) this.f48108b;
                if (i7 >= oVar.f50372y && i7 < oVar.E && oVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.h.get(i7 - oVar.f50372y);
                    if (stickerSetCovered.set.f28430id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f28423id = stickerSetCovered.set.f28430id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    iw0Var.X1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(iw0Var);
                    return;
                }
                return;
            case 2:
                zy0.Z((zy0) this.f48108b, i7);
                return;
            case 3:
                oc ocVar = (oc) this.f48108b;
                ArrayList arrayList2 = ocVar.f50517c;
                f61 f61Var = ocVar.d;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) arrayList2.get(i7);
                    ocVar.a(kpVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + f61Var.getPaddingLeft()) {
                        f61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + f61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (f61Var.getMeasuredWidth() - f61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        f61Var.w0(org.telegram.messenger.f3.B(48.0f, f61Var.getMeasuredWidth() - f61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.x10 x10Var = ocVar.f50521r;
                    if (x10Var != null) {
                        x10Var.a(kpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                vo voVar = (vo) this.f48108b;
                boolean z16 = voVar.f52820s;
                if (voVar.getParentActivity() != null) {
                    v4.i0 adapter = voVar.f52814b.getAdapter();
                    uo uoVar = voVar.f52816e;
                    if (adapter == uoVar) {
                        chat = (TLRPC.Chat) uoVar.d.get(i7);
                    } else {
                        int i16 = voVar.H;
                        if (i7 >= i16 && i7 < voVar.I) {
                            chat = (TLRPC.Chat) voVar.f52821w.get(i7 - i16);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z16 && voVar.h.linked_chat_id == 0) {
                            voVar.f0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f28403id);
                        voVar.presentFragment(new bn(bundle));
                        return;
                    } else if (i7 == voVar.G) {
                        if (z16 && voVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{voVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = voVar.f52817f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.gd.a0("GroupCreateDiscussionDefaultName", null, 2131749262, chat2.title));
                            }
                            f50 f50Var = new f50(bundle2);
                            f50Var.Z = new no(voVar);
                            voVar.presentFragment(f50Var);
                            return;
                        } else if (!voVar.f52821w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) voVar.f52821w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(voVar.getParentActivity());
                            if (z16) {
                                M0 = org.telegram.messenger.gd.M0(2131751360, null);
                                a02 = org.telegram.messenger.gd.a0("DiscussionUnlinkChannelAlert", null, 2131751361, chat3.title);
                            } else {
                                M0 = org.telegram.messenger.gd.M0(2131751362, null);
                                a02 = org.telegram.messenger.gd.a0("DiscussionUnlinkGroupAlert", null, 2131751359, chat3.title);
                            }
                            alertDialog$Builder.f28744a.S = M0;
                            alertDialog$Builder.f28744a.U = org.telegram.messenger.g0.W2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751363, null), new w0(voVar, 25));
                            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                            voVar.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, null);
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
                cp cpVar = (cp) this.f48108b;
                ArrayList arrayList3 = cpVar.f46582n;
                if (i7 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i7 - 3);
                    boolean contains = cpVar.d.contains(tL_availableReaction.reaction);
                    boolean z17 = !contains;
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
                    Switch r22 = xVar.f32276c;
                    if (r22 != null) {
                        r22.c(z17, true);
                    }
                    org.telegram.ui.Components.mp mpVar = xVar.d;
                    if (mpVar != null) {
                        mpVar.a(z17, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                js jsVar = (js) this.f48108b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ms) view).d;
                ns nsVar = jsVar.f49050a;
                ch.b0 reactionsWindow = nsVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f5308q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.nw0.c(null, nsVar.f50278c0, nsVar.f50300z.getContext(), new a5(jsVar, 9));
                    return;
                }
                ls lsVar = nsVar.f50287l;
                if (lsVar != null) {
                    lsVar.u(stickerSetCovered2.set, TextUtils.join("", nsVar.f50290o));
                }
                nsVar.o();
                return;
            case 7:
                ts tsVar = (ts) this.f48108b;
                if (tsVar.f52344f && tsVar.f52343e) {
                    org.telegram.ui.Components.ck ckVar = tsVar.d;
                    ArrayList arrayList4 = ckVar.f34040e;
                    if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                        psVar = (ps) ckVar.f34040e.get(i7);
                    }
                } else {
                    int S = tsVar.f52342c.S(i7);
                    int Q = tsVar.f52342c.Q(i7);
                    if (Q >= 0 && S >= 0) {
                        psVar = tsVar.f52342c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i7 >= 0) {
                    tsVar.finishFragment();
                    if (psVar != null && (ssVar = tsVar.f52346r) != null) {
                        ssVar.b(psVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                mt mtVar = (mt) this.f48108b;
                ArrayList arrayList5 = mtVar.f49931k3;
                pt ptVar = mtVar.f49943w3;
                if ((view instanceof ft) && i7 >= 0 && i7 < arrayList5.size()) {
                    ht htVar = (ht) arrayList5.get(i7);
                    if (htVar != null) {
                        int i17 = htVar.h;
                        if (i17 >= 0) {
                            mtVar.f49937q3[i17] = !zArr[i17];
                            mtVar.D1(true);
                            return;
                        } else if (i17 == -2) {
                            ptVar.presentFragment(new DataAutoDownloadActivity(mtVar.f49928g3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ptVar.getParentActivity());
                    alertDialog$Builder2.f28744a.S = org.telegram.messenger.gd.M0(2131745894, null);
                    alertDialog$Builder2.f28744a.U = org.telegram.messenger.gd.M0(2131745895, null);
                    alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131745923, null), new jt(mtVar));
                    alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28744a;
                    ptVar.showDialog(u1Var2);
                    TextView textView2 = (TextView) u1Var2.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29635q7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                ky.a0((ky) this.f48108b, view, i7);
                return;
            case 10:
                kz kzVar = (kz) this.f48108b;
                if (kzVar.getParentActivity() != null && (czVar = (cz) kzVar.Q.get(i7)) != null) {
                    View.OnClickListener onClickListener = czVar.f46773c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i18 = czVar.f56589a;
                    if (i18 == 1) {
                        org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
                        kzVar.B0(czVar, raVar.getName(), raVar.getCurrentObject(), czVar.f46776g);
                        return;
                    } else if (i18 == 7) {
                        vs vsVar = new vs(12, kzVar, czVar);
                        if (kzVar.f49383c.f28870x.f57658f) {
                            kzVar.y0(vsVar, false);
                            return;
                        } else {
                            vsVar.run();
                            return;
                        }
                    } else if (i18 == 8 || (i18 == 4 && czVar.f46779k == 2131232032)) {
                        org.telegram.messenger.ro roVar = kzVar.f49387r;
                        org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
                        if (kzVar.f49388s && kzVar.f49383c.f28870x.f57658f) {
                            float f10 = -kzVar.R;
                            kzVar.R = f10;
                            org.telegram.messenger.g0.E3(f10, view, null);
                            q2Var.a();
                            kzVar.f49389w = true;
                            hi.m3 m3Var = kzVar.S;
                            if ((m3Var == null || !m3Var.W) && (kzVar.fragmentView instanceof FrameLayout)) {
                                hi.m3 m3Var2 = new hi.m3(kzVar.getParentActivity(), 1);
                                m3Var2.r(true);
                                m3Var2.d = 2300L;
                                m3Var2.U = true;
                                m3Var2.f14995e = true;
                                m3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                m3Var2.f15016v0 = -org.telegram.messenger.g0.L(10.0f);
                                kzVar.S = m3Var2;
                                m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                m3Var2.l(kzVar.getBaseSimpleGlass().f56616c);
                                m3Var2.v(org.telegram.messenger.gd.M0(2131750764, null));
                                m3Var2.f15011r0 = new sy(m3Var2, 0);
                                ((FrameLayout) kzVar.fragmentView).addView(m3Var2, c8.ma.e(-1, 150, 55));
                                m3Var2.z(kzVar.f49383c, true);
                                return;
                            }
                            return;
                        }
                        if (!TextUtils.isEmpty(kzVar.f49390x) || !TextUtils.isEmpty(roVar.f26673b)) {
                            int i19 = kzVar.E;
                            int i20 = org.telegram.messenger.mp.I8;
                            if ((i19 & (-1537)) == 0 && kzVar.H.isEmpty() && !kzVar.G.isEmpty()) {
                                kzVar.y0(new py(kzVar, 1), false);
                                return;
                            }
                        }
                        float f11 = -kzVar.R;
                        kzVar.R = f11;
                        org.telegram.messenger.g0.E3(f11, view, null);
                        q2Var.a();
                        if (TextUtils.isEmpty(kzVar.f49390x) && TextUtils.isEmpty(roVar.f26673b)) {
                            b02 = org.telegram.ui.Components.lc.b0(kzVar);
                            i10 = 2131750751;
                        } else {
                            int i21 = kzVar.E;
                            int i22 = org.telegram.messenger.mp.I8;
                            if ((i21 & (-1537)) != 0) {
                                if (!kzVar.H.isEmpty()) {
                                    b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                    i10 = 2131750748;
                                } else {
                                    b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                    i10 = 2131750749;
                                }
                            } else if (kzVar.G.isEmpty()) {
                                b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                i10 = 2131750752;
                            } else {
                                b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                i10 = 2131750750;
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
                zy zyVar = (zy) this.f48108b;
                ArrayList arrayList6 = zyVar.f54614a2;
                int i23 = i7 - 1;
                if (i23 >= 0 && i23 < arrayList6.size()) {
                    cz czVar2 = (cz) arrayList6.get(i23);
                    int i24 = czVar2.f56589a;
                    if (i24 == 7) {
                        zyVar.dismiss();
                        zyVar.f39538s1.presentFragment(new ky(zyVar.U1, czVar2.f46781m));
                        return;
                    } else if (i24 == 8) {
                        zyVar.e1();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                c00 c00Var = (c00) this.f48108b;
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
                h50 h50Var = (h50) this.f48108b;
                if (h50Var.getParentActivity() != null) {
                    if (i7 != h50Var.f48160n && i7 != 0) {
                        if (i7 == h50Var.f48162s) {
                            if (h50Var.f48159f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", h50Var.f48159f.link);
                                    h50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.gd.M0(2131748918, null)), 500);
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            return;
                        } else if (i7 == h50Var.f48161r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h50Var.getParentActivity());
                            alertDialog$Builder3.f28744a.U = org.telegram.messenger.gd.M0(2131745831, null);
                            alertDialog$Builder3.f28744a.S = org.telegram.messenger.gd.M0(2131745828, null);
                            alertDialog$Builder3.k(org.telegram.messenger.gd.M0(2131745829, null), new zr(h50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                            h50Var.showDialog(alertDialog$Builder3.f28744a);
                            return;
                        } else {
                            return;
                        }
                    } else if (h50Var.f48159f != null) {
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f26913b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", h50Var.f48159f.link));
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
                n50.Z((n50) this.f48108b, view, i7);
                return;
            case 15:
                a60.Z((a60) this.f48108b, view, i7);
                return;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.f48108b, view, i7);
                return;
            case 17:
                ((fg0) this.f48108b).onBackPressed();
                return;
            case 18:
                og0 og0Var = (og0) this.f48108b;
                int i25 = og0Var.J;
                if (i7 >= i25 && i7 < og0Var.K) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) og0Var.f50567y.get(i7 - i25);
                    if (fjVar.x4()) {
                        if (!og0Var.g0(fjVar)) {
                            og0Var.getOrCreateStoryViewer().L(og0Var.getParentActivity(), fjVar.f23970l, fi.y6.a(og0Var.f50560f));
                            return;
                        }
                        return;
                    }
                    long B0 = org.telegram.messenger.fj.B0(fjVar.f23965k);
                    Bundle bundle3 = new Bundle();
                    if (org.telegram.messenger.n5.E(B0)) {
                        bundle3.putLong("user_id", B0);
                    } else {
                        bundle3.putLong("chat_id", -B0);
                    }
                    bundle3.putInt("message_id", fjVar.e1());
                    bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                    if (og0Var.getMessagesController().E(bundle3, og0Var, null, null)) {
                        og0Var.presentFragment(new bn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.f48108b, view, i7);
                return;
            case 20:
                km0 km0Var = (km0) this.f48108b;
                km0Var.a(i7, true);
                xl0 xl0Var = km0Var.h;
                if (xl0Var != null) {
                    xl0Var.a(Integer.valueOf(i7));
                    return;
                }
                return;
            case 21:
                cn0 cn0Var = (cn0) this.f48108b;
                ArrayList arrayList7 = cn0Var.f46546f;
                ArrayList arrayList8 = cn0Var.f46554n;
                org.telegram.messenger.ue ueVar = cn0Var.K;
                if (ueVar == null && arrayList7.isEmpty()) {
                    if (i7 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i7);
                        dn0 dn0Var = cn0Var.f46564u0;
                        if (dn0Var != null) {
                            switch (dn0Var.f46948a) {
                                case 1:
                                    fn0.m0(dn0Var.f46949b, str);
                                    return;
                                default:
                                    fn0.m0(dn0Var.f46949b, str);
                                    return;
                            }
                        }
                        cn0Var.Q.getSearchField().setText(str);
                        cn0Var.Q.getSearchField().setSelection(str.length());
                        cn0Var.g0(cn0Var.Q.getSearchField());
                        return;
                    } else if (i7 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(cn0Var.getParentActivity());
                        alertDialog$Builder4.f28744a.S = org.telegram.messenger.gd.M0(2131752045, null);
                        alertDialog$Builder4.f28744a.U = org.telegram.messenger.gd.M0(2131752050, null);
                        alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131752088, null), new um0(cn0Var, 4));
                        alertDialog$Builder4.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder4.f28744a;
                        cn0Var.showDialog(u1Var3);
                        TextView textView3 = (TextView) u1Var3.d(-1);
                        if (textView3 != null) {
                            org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.f29635q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                if (ueVar != null) {
                    arrayList7 = ueVar.f27158e;
                }
                if (i7 >= 0 && i7 < arrayList7.size()) {
                    org.telegram.ui.ActionBar.r0 r0Var = cn0Var.Q;
                    if (r0Var != null) {
                        org.telegram.messenger.g0.v1(r0Var.getSearchField());
                    }
                    if (cn0Var.Z) {
                        cn0Var.f0(view, arrayList7.get(i7));
                        return;
                    }
                    int i26 = cn0Var.U;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 != 2) {
                            i12 = 10;
                            if (i26 != 10) {
                                i13 = cn0Var.V == null ? 4 : 0;
                            }
                        }
                        i13 = i12;
                    }
                    PhotoViewer.p1().I2(null, cn0Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i27 = cn0Var.I;
                    boolean z18 = cn0Var.J;
                    p12.h = i27;
                    p12.f43275n = z18;
                    PhotoViewer.p1().f2(arrayList7, i7, i13, cn0Var.m0, cn0Var.f46571y0, cn0Var.V);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f48108b;
                ArrayList arrayList9 = photoViewer.f43224g7;
                if (!arrayList9.isEmpty() && (i11 = photoViewer.P4) >= 0 && i11 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof org.telegram.messenger.xe) {
                        ((org.telegram.messenger.xe) obj).f27862s = photoViewer.j1();
                    }
                }
                photoViewer.f43255k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.z2(indexOf);
                }
                photoViewer.f43255k5 = false;
                return;
            case 23:
                pr0 pr0Var = (pr0) this.f48108b;
                boolean[] zArr2 = pr0Var.f50915x;
                if (i7 == pr0Var.f50904p0) {
                    pr0Var.k0();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s8) {
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    boolean z19 = pr0Var.M;
                    org.telegram.ui.Components.yw0 yw0Var = pr0Var.R;
                    if (yw0Var != null) {
                        yw0Var.f();
                    }
                    if (pr0Var.J) {
                        int i28 = -pr0Var.P;
                        pr0Var.P = i28;
                        org.telegram.messenger.g0.E3(i28, s8Var, null);
                        org.telegram.messenger.q2.APP_ERROR.a();
                        return;
                    }
                    if (i7 == pr0Var.f50909s0) {
                        z10 = !pr0Var.H;
                        pr0Var.H = z10;
                    } else {
                        int i29 = pr0Var.f50912v0;
                        if (i7 == i29) {
                            z10 = !pr0Var.I;
                            pr0Var.I = z10;
                        } else {
                            if (i7 == pr0Var.f50914w0) {
                                z11 = !pr0Var.K;
                                pr0Var.K = z11;
                                pr0Var.w0();
                                int i30 = pr0Var.f50912v0;
                                if (i30 >= 0 && i29 < 0) {
                                    pr0Var.f50886b.i(i30);
                                } else if (i29 >= 0 && i30 < 0) {
                                    pr0Var.f50886b.s(i29);
                                }
                            } else if (i7 == pr0Var.f50910t0) {
                                boolean z20 = pr0Var.L;
                                z11 = !z20;
                                pr0Var.L = z11;
                                if (!z20 && pr0Var.M) {
                                    int i31 = pr0Var.f50899k0;
                                    pr0Var.M = false;
                                    pr0Var.w0();
                                    v4.f1 K = pr0Var.f50888c.K(pr0Var.f50911u0);
                                    if (K != null) {
                                        ((org.telegram.ui.Cells.s8) K.f59123a).setChecked(false);
                                    } else {
                                        pr0Var.f50886b.g(pr0Var.f50911u0);
                                    }
                                    pr0Var.f50886b.p(i31, 2);
                                }
                            } else if (pr0Var.O == 0) {
                                z10 = !pr0Var.M;
                                pr0Var.M = z10;
                                int i32 = pr0Var.f50899k0;
                                pr0Var.w0();
                                if (pr0Var.M) {
                                    pr0Var.f50886b.o(pr0Var.f50899k0, 2);
                                } else {
                                    pr0Var.f50886b.p(i32, 2);
                                }
                                if (pr0Var.M && pr0Var.L) {
                                    pr0Var.L = false;
                                    v4.f1 K2 = pr0Var.f50888c.K(pr0Var.f50910t0);
                                    if (K2 != null) {
                                        ((org.telegram.ui.Cells.s8) K2.f59123a).setChecked(false);
                                    } else {
                                        pr0Var.f50886b.g(pr0Var.f50910t0);
                                    }
                                }
                                if (pr0Var.M) {
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
                    if (pr0Var.N && !pr0Var.M) {
                        pr0Var.f50888c.getChildCount();
                        pr0Var.h.a();
                    }
                    for (int i34 = pr0Var.f50903o0; i34 < pr0Var.f50903o0 + pr0Var.E; i34++) {
                        v4.f1 K3 = pr0Var.f50888c.K(i34);
                        if (K3 != null) {
                            View view2 = K3.f59123a;
                            if (view2 instanceof org.telegram.ui.Cells.b6) {
                                org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view2;
                                b6Var.n(pr0Var.M, true);
                                b6Var.f30448r.a(zArr2[i34 - pr0Var.f50903o0], z19);
                                if (b6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == pr0Var.f50911u0 && !pr0Var.N) {
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
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.f48108b, view, i7);
                return;
            case 25:
                vs0 vs0Var = (vs0) this.f48108b;
                PremiumPreviewFragment premiumPreviewFragment = vs0Var.f52845n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                br0 br0Var = vs0Var.f52843e;
                if (view.isEnabled() && (view instanceof ug.o1)) {
                    ug.o1 o1Var = (ug.o1) view;
                    premiumPreviewFragment.f43427e = arrayList10.indexOf(o1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    o1Var.c(true, true);
                    for (int i35 = 0; i35 < br0Var.getChildCount(); i35++) {
                        View childAt = br0Var.getChildAt(i35);
                        if (childAt instanceof ug.o1) {
                            ug.o1 o1Var2 = (ug.o1) childAt;
                            if (o1Var2.getTier() != o1Var.getTier()) {
                                o1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i36 = 0; i36 < br0Var.getHiddenChildCount(); i36++) {
                        View V = br0Var.V(i36);
                        if (V instanceof ug.o1) {
                            ug.o1 o1Var3 = (ug.o1) V;
                            if (o1Var3.getTier() != o1Var.getTier()) {
                                o1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < br0Var.getCachedChildCount(); i37++) {
                        View P = br0Var.P(i37);
                        if (P instanceof ug.o1) {
                            ug.o1 o1Var4 = (ug.o1) P;
                            if (o1Var4.getTier() != o1Var.getTier()) {
                                o1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < br0Var.getAttachedScrapChildCount(); i38++) {
                        View O = br0Var.O(i38);
                        if (O instanceof ug.o1) {
                            ug.o1 o1Var5 = (ug.o1) O;
                            if (o1Var5.getTier() != o1Var.getTier()) {
                                o1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((xs0Var = premiumPreviewFragment.f43429f) != null && xs0Var.f53894a.months < ((xs0) arrayList10.get(premiumPreviewFragment.f43427e)).f53894a.months && !premiumPreviewFragment.f43441q0)) {
                        z12 = true;
                    }
                    org.telegram.messenger.g0.V3(frameLayout, z12);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.c0((PrivacyControlActivity) this.f48108b, view, i7);
                return;
            case 27:
                a(i7, view);
                return;
            case 28:
                ProfileActivity.c0((ProfileActivity) this.f48108b, i7);
                return;
            default:
                ProxyListActivity.Z((ProxyListActivity) this.f48108b, view, i7);
                return;
        }
    }
}
