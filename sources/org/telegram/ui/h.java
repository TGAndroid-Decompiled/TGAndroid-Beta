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
    public final int f48150a;
    public final Object f48151b;

    public h(Object obj, int i7) {
        this.f48150a = i7;
        this.f48151b = obj;
    }

    private final void a(int i7, View view) {
        tt0 tt0Var = (tt0) this.f48151b;
        int i10 = tt0Var.E;
        if (i7 == tt0Var.f52361x) {
            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.c5.L(tt0Var.getParentActivity(), org.telegram.messenger.hd.N0(2131747719, null), org.telegram.messenger.hd.N0(2131747720, null), org.telegram.messenger.hd.N0(2131751586, null), new rt0(tt0Var), null).f28743a;
            t1Var.show();
            t1Var.i();
        } else if (i7 == tt0Var.f52356f) {
            if (i10 == 1) {
                ?? g2Var = new org.telegram.ui.ActionBar.g2(null);
                g2Var.d = new Paint();
                g2Var.f47345f = new du[2];
                g2Var.f47350x = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                cx cxVar = new cx(bundle);
                g2Var.f47341a = cxVar;
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
                g2Var.f47342b = contactsActivity;
                contactsActivity.V = new bu(g2Var);
                contactsActivity.onFragmentCreate();
                tt0Var.presentFragment((org.telegram.ui.ActionBar.g2) g2Var);
                return;
            }
            Bundle k10 = a8.p0.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            z40 z40Var = new z40(k10);
            z40Var.f54397x = new qt0(tt0Var);
            tt0Var.presentFragment(z40Var);
        } else if (i7 >= tt0Var.f52358r && i7 < tt0Var.f52359s) {
            if (i10 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", tt0Var.getMessagesController().H0.keyAt(i7 - tt0Var.f52358r));
                tt0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        ss ssVar;
        boolean[] zArr;
        cz czVar;
        org.telegram.ui.Components.lc b02;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        ys0 ys0Var;
        int i12 = 3;
        ps psVar = null;
        boolean z12 = false;
        int i13 = 1;
        switch (this.f48150a) {
            case 0:
                k kVar = (k) this.f48151b;
                ArrayList arrayList = kVar.h;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    int i14 = ((i) arrayList.get(i7)).d;
                    if (i14 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z13 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z13;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z13);
                        kVar.f49115c = true;
                        return;
                    } else if (i14 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z14 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z14;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z14);
                        kVar.f49115c = true;
                        return;
                    } else if (i14 == 7) {
                        if (!kVar.getUserConfig().q() && !kVar.getMessagesController().f25771b4 && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.m80 m80Var = ybVar.f42352b;
                            m80Var.setText(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131743623, null), org.telegram.ui.ActionBar.m6.xj, 0, new iq0(kVar, 3), null));
                            m80Var.setSingleLine(false);
                            m80Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            ybVar.f42351a.setImageResource(2131232364);
                            org.telegram.ui.Components.gc.g(kVar, ybVar, 3500).j();
                            int i15 = -kVar.f49116e;
                            kVar.f49116e = i15;
                            org.telegram.messenger.g0.E3(i15, view, null);
                            org.telegram.messenger.q2.APP_ERROR.a();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                        boolean z15 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z15;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z15);
                        kVar.f49115c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                o oVar = (o) this.f48151b;
                if (i7 >= oVar.f50386y && i7 < oVar.E && oVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.h.get(i7 - oVar.f50386y);
                    if (stickerSetCovered.set.f28425id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f28418id = stickerSetCovered.set.f28425id;
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
                zy0.Z((zy0) this.f48151b, i7);
                return;
            case 3:
                oc ocVar = (oc) this.f48151b;
                ArrayList arrayList2 = ocVar.f50531c;
                f61 f61Var = ocVar.d;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) arrayList2.get(i7);
                    ocVar.a(mpVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + f61Var.getPaddingLeft()) {
                        f61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + f61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (f61Var.getMeasuredWidth() - f61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        f61Var.w0(org.telegram.messenger.f3.B(48.0f, f61Var.getMeasuredWidth() - f61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.y10 y10Var = ocVar.f50535r;
                    if (y10Var != null) {
                        y10Var.a(mpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                uo uoVar = (uo) this.f48151b;
                boolean z16 = uoVar.f52604s;
                if (uoVar.getParentActivity() != null) {
                    v4.h0 adapter = uoVar.f52598b.getAdapter();
                    to toVar = uoVar.f52600e;
                    if (adapter == toVar) {
                        chat = (TLRPC.Chat) toVar.d.get(i7);
                    } else {
                        int i16 = uoVar.H;
                        if (i7 >= i16 && i7 < uoVar.I) {
                            chat = (TLRPC.Chat) uoVar.f52605w.get(i7 - i16);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z16 && uoVar.h.linked_chat_id == 0) {
                            uoVar.f0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f28398id);
                        uoVar.presentFragment(new bn(bundle));
                        return;
                    } else if (i7 == uoVar.G) {
                        if (z16 && uoVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{uoVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = uoVar.f52601f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.hd.a0("GroupCreateDiscussionDefaultName", null, 2131749261, chat2.title));
                            }
                            f50 f50Var = new f50(bundle2);
                            f50Var.Z = new mo(uoVar);
                            uoVar.presentFragment(f50Var);
                            return;
                        } else if (!uoVar.f52605w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) uoVar.f52605w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uoVar.getParentActivity());
                            if (z16) {
                                N0 = org.telegram.messenger.hd.N0(2131751359, null);
                                a02 = org.telegram.messenger.hd.a0("DiscussionUnlinkChannelAlert", null, 2131751360, chat3.title);
                            } else {
                                N0 = org.telegram.messenger.hd.N0(2131751361, null);
                                a02 = org.telegram.messenger.hd.a0("DiscussionUnlinkGroupAlert", null, 2131751358, chat3.title);
                            }
                            alertDialog$Builder.f28743a.S = N0;
                            alertDialog$Builder.f28743a.U = org.telegram.messenger.g0.W2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751362, null), new w0(uoVar, 25));
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                            uoVar.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29588q7, null);
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
                bp bpVar = (bp) this.f48151b;
                ArrayList arrayList3 = bpVar.f46253n;
                if (i7 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i7 - 3);
                    boolean contains = bpVar.d.contains(tL_availableReaction.reaction);
                    boolean z17 = !contains;
                    if (!contains) {
                        bpVar.d.add(tL_availableReaction.reaction);
                    } else {
                        bpVar.d.remove(tL_availableReaction.reaction);
                        if (bpVar.d.isEmpty()) {
                            ap apVar = bpVar.h;
                            if (apVar != null) {
                                apVar.p(2, arrayList3.size() + 1);
                            }
                            bpVar.a0(2, true);
                        }
                    }
                    Switch r22 = xVar.f32273c;
                    if (r22 != null) {
                        r22.c(z17, true);
                    }
                    org.telegram.ui.Components.op opVar = xVar.d;
                    if (opVar != null) {
                        opVar.a(z17, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                js jsVar = (js) this.f48151b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ms) view).d;
                ns nsVar = jsVar.f49052a;
                ch.b0 reactionsWindow = nsVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f5303q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.pw0.c(null, nsVar.f50293c0, nsVar.f50315z.getContext(), new a5(jsVar, 9));
                    return;
                }
                ls lsVar = nsVar.f50302l;
                if (lsVar != null) {
                    lsVar.u(stickerSetCovered2.set, TextUtils.join("", nsVar.f50305o));
                }
                nsVar.o();
                return;
            case 7:
                ts tsVar = (ts) this.f48151b;
                if (tsVar.f52343f && tsVar.f52342e) {
                    org.telegram.ui.Components.ek ekVar = tsVar.d;
                    ArrayList arrayList4 = ekVar.f34825e;
                    if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                        psVar = (ps) ekVar.f34825e.get(i7);
                    }
                } else {
                    int S = tsVar.f52341c.S(i7);
                    int Q = tsVar.f52341c.Q(i7);
                    if (Q >= 0 && S >= 0) {
                        psVar = tsVar.f52341c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i7 >= 0) {
                    tsVar.finishFragment();
                    if (psVar != null && (ssVar = tsVar.f52345r) != null) {
                        ssVar.b(psVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                mt mtVar = (mt) this.f48151b;
                ArrayList arrayList5 = mtVar.f49946k3;
                pt ptVar = mtVar.f49958w3;
                if ((view instanceof ft) && i7 >= 0 && i7 < arrayList5.size()) {
                    ht htVar = (ht) arrayList5.get(i7);
                    if (htVar != null) {
                        int i17 = htVar.h;
                        if (i17 >= 0) {
                            mtVar.f49952q3[i17] = !zArr[i17];
                            mtVar.D1(true);
                            return;
                        } else if (i17 == -2) {
                            ptVar.presentFragment(new DataAutoDownloadActivity(mtVar.f49943g3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ptVar.getParentActivity());
                    alertDialog$Builder2.f28743a.S = org.telegram.messenger.hd.N0(2131745893, null);
                    alertDialog$Builder2.f28743a.U = org.telegram.messenger.hd.N0(2131745894, null);
                    alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131745922, null), new jt(mtVar));
                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
                    ptVar.showDialog(t1Var2);
                    TextView textView2 = (TextView) t1Var2.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29588q7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                ky.a0((ky) this.f48151b, view, i7);
                return;
            case 10:
                kz kzVar = (kz) this.f48151b;
                if (kzVar.getParentActivity() != null && (czVar = (cz) kzVar.Q.get(i7)) != null) {
                    View.OnClickListener onClickListener = czVar.f46793c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i18 = czVar.f56599a;
                    if (i18 == 1) {
                        org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
                        kzVar.B0(czVar, raVar.getName(), raVar.getCurrentObject(), czVar.f46796g);
                        return;
                    } else if (i18 == 7) {
                        vs vsVar = new vs(12, kzVar, czVar);
                        if (kzVar.f49403c.f28824x.f57666f) {
                            kzVar.y0(vsVar, false);
                            return;
                        } else {
                            vsVar.run();
                            return;
                        }
                    } else if (i18 == 8 || (i18 == 4 && czVar.f46799k == 2131232032)) {
                        org.telegram.messenger.so soVar = kzVar.f49407r;
                        org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
                        if (kzVar.f49408s && kzVar.f49403c.f28824x.f57666f) {
                            float f10 = -kzVar.R;
                            kzVar.R = f10;
                            org.telegram.messenger.g0.E3(f10, view, null);
                            q2Var.a();
                            kzVar.f49409w = true;
                            hi.l3 l3Var = kzVar.S;
                            if ((l3Var == null || !l3Var.W) && (kzVar.fragmentView instanceof FrameLayout)) {
                                hi.l3 l3Var2 = new hi.l3(kzVar.getParentActivity(), 1);
                                l3Var2.r(true);
                                l3Var2.d = 2300L;
                                l3Var2.U = true;
                                l3Var2.f14852e = true;
                                l3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                l3Var2.f14873v0 = -org.telegram.messenger.g0.L(10.0f);
                                kzVar.S = l3Var2;
                                l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                l3Var2.l(kzVar.getBaseSimpleGlass().f56626c);
                                l3Var2.v(org.telegram.messenger.hd.N0(2131750763, null));
                                l3Var2.f14868r0 = new sy(l3Var2, 0);
                                ((FrameLayout) kzVar.fragmentView).addView(l3Var2, c8.na.e(-1, 150, 55));
                                l3Var2.z(kzVar.f49403c, true);
                                return;
                            }
                            return;
                        }
                        if (!TextUtils.isEmpty(kzVar.f49410x) || !TextUtils.isEmpty(soVar.f26851b)) {
                            int i19 = kzVar.E;
                            int i20 = org.telegram.messenger.np.I8;
                            if ((i19 & (-1537)) == 0 && kzVar.H.isEmpty() && !kzVar.G.isEmpty()) {
                                kzVar.y0(new py(kzVar, 1), false);
                                return;
                            }
                        }
                        float f11 = -kzVar.R;
                        kzVar.R = f11;
                        org.telegram.messenger.g0.E3(f11, view, null);
                        q2Var.a();
                        if (TextUtils.isEmpty(kzVar.f49410x) && TextUtils.isEmpty(soVar.f26851b)) {
                            b02 = org.telegram.ui.Components.lc.b0(kzVar);
                            i10 = 2131750750;
                        } else {
                            int i21 = kzVar.E;
                            int i22 = org.telegram.messenger.np.I8;
                            if ((i21 & (-1537)) != 0) {
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
                zy zyVar = (zy) this.f48151b;
                ArrayList arrayList6 = zyVar.f54624a2;
                int i23 = i7 - 1;
                if (i23 >= 0 && i23 < arrayList6.size()) {
                    cz czVar2 = (cz) arrayList6.get(i23);
                    int i24 = czVar2.f56599a;
                    if (i24 == 7) {
                        zyVar.dismiss();
                        zyVar.f39491s1.presentFragment(new ky(zyVar.U1, czVar2.f46801m));
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
                c00 c00Var = (c00) this.f48151b;
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
                h50 h50Var = (h50) this.f48151b;
                if (h50Var.getParentActivity() != null) {
                    if (i7 != h50Var.f48203n && i7 != 0) {
                        if (i7 == h50Var.f48205s) {
                            if (h50Var.f48202f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", h50Var.f48202f.link);
                                    h50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131748917, null)), 500);
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            return;
                        } else if (i7 == h50Var.f48204r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h50Var.getParentActivity());
                            alertDialog$Builder3.f28743a.U = org.telegram.messenger.hd.N0(2131745830, null);
                            alertDialog$Builder3.f28743a.S = org.telegram.messenger.hd.N0(2131745827, null);
                            alertDialog$Builder3.k(org.telegram.messenger.hd.N0(2131745828, null), new zr(h50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            h50Var.showDialog(alertDialog$Builder3.f28743a);
                            return;
                        } else {
                            return;
                        }
                    } else if (h50Var.f48202f != null) {
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f26895b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", h50Var.f48202f.link));
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
                n50.Z((n50) this.f48151b, view, i7);
                return;
            case 15:
                a60.Z((a60) this.f48151b, view, i7);
                return;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.f48151b, view, i7);
                return;
            case 17:
                ((eg0) this.f48151b).onBackPressed();
                return;
            case 18:
                og0 og0Var = (og0) this.f48151b;
                int i25 = og0Var.J;
                if (i7 >= i25 && i7 < og0Var.K) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) og0Var.f50581y.get(i7 - i25);
                    if (gjVar.x4()) {
                        if (!og0Var.g0(gjVar)) {
                            og0Var.getOrCreateStoryViewer().L(og0Var.getParentActivity(), gjVar.f24182l, fi.y6.a(og0Var.f50574f));
                            return;
                        }
                        return;
                    }
                    long B0 = org.telegram.messenger.gj.B0(gjVar.f24177k);
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
                PasscodeActivity.a0((PasscodeActivity) this.f48151b, view, i7);
                return;
            case 20:
                km0 km0Var = (km0) this.f48151b;
                km0Var.a(i7, true);
                xl0 xl0Var = km0Var.h;
                if (xl0Var != null) {
                    xl0Var.a(Integer.valueOf(i7));
                    return;
                }
                return;
            case 21:
                cn0 cn0Var = (cn0) this.f48151b;
                ArrayList arrayList7 = cn0Var.f46588f;
                ArrayList arrayList8 = cn0Var.f46596n;
                org.telegram.messenger.ve veVar = cn0Var.K;
                if (veVar == null && arrayList7.isEmpty()) {
                    if (i7 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i7);
                        dn0 dn0Var = cn0Var.f46606u0;
                        if (dn0Var != null) {
                            switch (dn0Var.f46977a) {
                                case 1:
                                    fn0.m0(dn0Var.f46978b, str);
                                    return;
                                default:
                                    fn0.m0(dn0Var.f46978b, str);
                                    return;
                            }
                        }
                        cn0Var.Q.getSearchField().setText(str);
                        cn0Var.Q.getSearchField().setSelection(str.length());
                        cn0Var.g0(cn0Var.Q.getSearchField());
                        return;
                    } else if (i7 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(cn0Var.getParentActivity());
                        alertDialog$Builder4.f28743a.S = org.telegram.messenger.hd.N0(2131752044, null);
                        alertDialog$Builder4.f28743a.U = org.telegram.messenger.hd.N0(2131752049, null);
                        alertDialog$Builder4.k(org.telegram.messenger.hd.N0(2131752087, null), new um0(cn0Var, 4));
                        alertDialog$Builder4.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder4.f28743a;
                        cn0Var.showDialog(t1Var3);
                        TextView textView3 = (TextView) t1Var3.d(-1);
                        if (textView3 != null) {
                            org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.f29588q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                if (veVar != null) {
                    arrayList7 = veVar.f27321e;
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
                    p12.f43285n = z18;
                    PhotoViewer.p1().f2(arrayList7, i7, i13, cn0Var.m0, cn0Var.f46613y0, cn0Var.V);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f48151b;
                ArrayList arrayList9 = photoViewer.f43234g7;
                if (!arrayList9.isEmpty() && (i11 = photoViewer.P4) >= 0 && i11 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof org.telegram.messenger.ye) {
                        ((org.telegram.messenger.ye) obj).f28038s = photoViewer.j1();
                    }
                }
                photoViewer.f43265k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.z2(indexOf);
                }
                photoViewer.f43265k5 = false;
                return;
            case 23:
                qr0 qr0Var = (qr0) this.f48151b;
                boolean[] zArr2 = qr0Var.f51312x;
                if (i7 == qr0Var.f51301p0) {
                    qr0Var.k0();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s8) {
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    boolean z19 = qr0Var.M;
                    org.telegram.ui.Components.ax0 ax0Var = qr0Var.R;
                    if (ax0Var != null) {
                        ax0Var.f();
                    }
                    if (qr0Var.J) {
                        int i28 = -qr0Var.P;
                        qr0Var.P = i28;
                        org.telegram.messenger.g0.E3(i28, s8Var, null);
                        org.telegram.messenger.q2.APP_ERROR.a();
                        return;
                    }
                    if (i7 == qr0Var.f51306s0) {
                        z10 = !qr0Var.H;
                        qr0Var.H = z10;
                    } else {
                        int i29 = qr0Var.f51309v0;
                        if (i7 == i29) {
                            z10 = !qr0Var.I;
                            qr0Var.I = z10;
                        } else {
                            if (i7 == qr0Var.f51311w0) {
                                z11 = !qr0Var.K;
                                qr0Var.K = z11;
                                qr0Var.w0();
                                int i30 = qr0Var.f51309v0;
                                if (i30 >= 0 && i29 < 0) {
                                    qr0Var.f51283b.i(i30);
                                } else if (i29 >= 0 && i30 < 0) {
                                    qr0Var.f51283b.s(i29);
                                }
                            } else if (i7 == qr0Var.f51307t0) {
                                boolean z20 = qr0Var.L;
                                z11 = !z20;
                                qr0Var.L = z11;
                                if (!z20 && qr0Var.M) {
                                    int i31 = qr0Var.f51296k0;
                                    qr0Var.M = false;
                                    qr0Var.w0();
                                    v4.e1 K = qr0Var.f51285c.K(qr0Var.f51308u0);
                                    if (K != null) {
                                        ((org.telegram.ui.Cells.s8) K.f59111a).setChecked(false);
                                    } else {
                                        qr0Var.f51283b.g(qr0Var.f51308u0);
                                    }
                                    qr0Var.f51283b.p(i31, 2);
                                }
                            } else if (qr0Var.O == 0) {
                                z10 = !qr0Var.M;
                                qr0Var.M = z10;
                                int i32 = qr0Var.f51296k0;
                                qr0Var.w0();
                                if (qr0Var.M) {
                                    qr0Var.f51283b.o(qr0Var.f51296k0, 2);
                                } else {
                                    qr0Var.f51283b.p(i32, 2);
                                }
                                if (qr0Var.M && qr0Var.L) {
                                    qr0Var.L = false;
                                    v4.e1 K2 = qr0Var.f51285c.K(qr0Var.f51307t0);
                                    if (K2 != null) {
                                        ((org.telegram.ui.Cells.s8) K2.f59111a).setChecked(false);
                                    } else {
                                        qr0Var.f51283b.g(qr0Var.f51307t0);
                                    }
                                }
                                if (qr0Var.M) {
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
                    if (qr0Var.N && !qr0Var.M) {
                        qr0Var.f51285c.getChildCount();
                        qr0Var.h.a();
                    }
                    for (int i34 = qr0Var.f51300o0; i34 < qr0Var.f51300o0 + qr0Var.E; i34++) {
                        v4.e1 K3 = qr0Var.f51285c.K(i34);
                        if (K3 != null) {
                            View view2 = K3.f59111a;
                            if (view2 instanceof org.telegram.ui.Cells.b6) {
                                org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view2;
                                b6Var.n(qr0Var.M, true);
                                b6Var.f30445r.a(zArr2[i34 - qr0Var.f51300o0], z19);
                                if (b6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == qr0Var.f51308u0 && !qr0Var.N) {
                                    qr0Var.h.c(b6Var.getCheckBox());
                                    qr0Var.N = true;
                                }
                            }
                        }
                    }
                    s8Var.setChecked(z10);
                    qr0Var.n0();
                    return;
                } else {
                    return;
                }
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.f48151b, view, i7);
                return;
            case 25:
                ws0 ws0Var = (ws0) this.f48151b;
                PremiumPreviewFragment premiumPreviewFragment = ws0Var.f53450n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                cr0 cr0Var = ws0Var.f53448e;
                if (view.isEnabled() && (view instanceof ug.n1)) {
                    ug.n1 n1Var = (ug.n1) view;
                    premiumPreviewFragment.f43437e = arrayList10.indexOf(n1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    n1Var.c(true, true);
                    for (int i35 = 0; i35 < cr0Var.getChildCount(); i35++) {
                        View childAt = cr0Var.getChildAt(i35);
                        if (childAt instanceof ug.n1) {
                            ug.n1 n1Var2 = (ug.n1) childAt;
                            if (n1Var2.getTier() != n1Var.getTier()) {
                                n1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i36 = 0; i36 < cr0Var.getHiddenChildCount(); i36++) {
                        View V = cr0Var.V(i36);
                        if (V instanceof ug.n1) {
                            ug.n1 n1Var3 = (ug.n1) V;
                            if (n1Var3.getTier() != n1Var.getTier()) {
                                n1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < cr0Var.getCachedChildCount(); i37++) {
                        View P = cr0Var.P(i37);
                        if (P instanceof ug.n1) {
                            ug.n1 n1Var4 = (ug.n1) P;
                            if (n1Var4.getTier() != n1Var.getTier()) {
                                n1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < cr0Var.getAttachedScrapChildCount(); i38++) {
                        View O = cr0Var.O(i38);
                        if (O instanceof ug.n1) {
                            ug.n1 n1Var5 = (ug.n1) O;
                            if (n1Var5.getTier() != n1Var.getTier()) {
                                n1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((ys0Var = premiumPreviewFragment.f43439f) != null && ys0Var.f54246a.months < ((ys0) arrayList10.get(premiumPreviewFragment.f43437e)).f54246a.months && !premiumPreviewFragment.f43451q0)) {
                        z12 = true;
                    }
                    org.telegram.messenger.g0.V3(frameLayout, z12);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.c0((PrivacyControlActivity) this.f48151b, view, i7);
                return;
            case 27:
                a(i7, view);
                return;
            case 28:
                ProfileActivity.c0((ProfileActivity) this.f48151b, i7);
                return;
            default:
                ProxyListActivity.Z((ProxyListActivity) this.f48151b, view, i7);
                return;
        }
    }
}
