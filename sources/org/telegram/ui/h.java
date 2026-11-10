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
public final class h implements org.telegram.ui.Components.bj0 {
    public final int f46185a;
    public final Object f46186b;

    public h(Object obj, int i7) {
        this.f46185a = i7;
        this.f46186b = obj;
    }

    private final void a(int i7, View view) {
        vt0 vt0Var = (vt0) this.f46186b;
        int i10 = vt0Var.D;
        if (i7 == vt0Var.f50797x) {
            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.u4.L(vt0Var.getParentActivity(), org.telegram.messenger.id.M0(2131747913, null), org.telegram.messenger.id.M0(2131747914, null), org.telegram.messenger.id.M0(2131751598, null), new tt0(vt0Var), null).f27300a;
            u1Var.show();
            u1Var.i();
        } else if (i7 == vt0Var.f50792f) {
            if (i10 == 1) {
                ?? f2Var = new org.telegram.ui.ActionBar.f2(null);
                f2Var.d = new Paint();
                f2Var.f45054f = new cu[2];
                f2Var.f45059x = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                zw zwVar = new zw(bundle);
                f2Var.f45050a = zwVar;
                zwVar.D2 = new au(f2Var);
                zwVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                f2Var.f45051b = contactsActivity;
                contactsActivity.U = new au(f2Var);
                contactsActivity.onFragmentCreate();
                vt0Var.presentFragment((org.telegram.ui.ActionBar.f2) f2Var);
                return;
            }
            Bundle k10 = a8.p0.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            z40 z40Var = new z40(k10);
            z40Var.f52239x = new st0(vt0Var);
            vt0Var.presentFragment(z40Var);
        } else if (i7 >= vt0Var.f50794r && i7 < vt0Var.f50795s) {
            if (i10 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", vt0Var.getMessagesController().G0.keyAt(i7 - vt0Var.f50794r));
                vt0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        bz bzVar;
        org.telegram.ui.Components.gc a03;
        int i10;
        int i11;
        boolean z9;
        boolean z10;
        zs0 zs0Var;
        int i12 = 3;
        ps psVar = null;
        boolean z11 = false;
        int i13 = 1;
        switch (this.f46185a) {
            case 0:
                k kVar = (k) this.f46186b;
                ArrayList arrayList = kVar.h;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    int i14 = ((i) arrayList.get(i7)).d;
                    if (i14 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z12 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z12;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z12);
                        kVar.f47123c = true;
                        return;
                    } else if (i14 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z13 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z13;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z13);
                        kVar.f47123c = true;
                        return;
                    } else if (i14 == 7) {
                        if (!kVar.getUserConfig().q() && !kVar.getMessagesController().Y3 && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.tb tbVar = new org.telegram.ui.Components.tb(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.w70 w70Var = tbVar.f38269b;
                            w70Var.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131743866, null), org.telegram.ui.ActionBar.m6.uj, 0, new jq0(kVar, 3), null));
                            w70Var.setSingleLine(false);
                            w70Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            tbVar.f38268a.setImageResource(2131232362);
                            org.telegram.ui.Components.bc.g(kVar, tbVar, 3500).j();
                            int i15 = -kVar.f47124e;
                            kVar.f47124e = i15;
                            org.telegram.messenger.g0.G3(i15, view, null);
                            org.telegram.messenger.p2.APP_ERROR.a();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                        boolean z14 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z14;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z14);
                        kVar.f47123c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                o oVar = (o) this.f46186b;
                if (i7 >= oVar.f48349y && i7 < oVar.D && oVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.h.get(i7 - oVar.f48349y);
                    if (stickerSetCovered.set.f26987id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f26980id = stickerSetCovered.set.f26987id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.yv0 yv0Var = new org.telegram.ui.Components.yv0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    yv0Var.W1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(yv0Var);
                    return;
                }
                return;
            case 2:
                bz0.Z((bz0) this.f46186b, i7);
                return;
            case 3:
                pc pcVar = (pc) this.f46186b;
                ArrayList arrayList2 = pcVar.f48742c;
                g61 g61Var = pcVar.d;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList2.get(i7);
                    pcVar.a(uoVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + g61Var.getPaddingLeft()) {
                        g61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + g61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (g61Var.getMeasuredWidth() - g61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        g61Var.w0(org.telegram.messenger.k5.B(48.0f, g61Var.getMeasuredWidth() - g61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.c20 c20Var = pcVar.f48746r;
                    if (c20Var != null) {
                        c20Var.a(uoVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                uo uoVar2 = (uo) this.f46186b;
                boolean z15 = uoVar2.f50534s;
                if (uoVar2.getParentActivity() != null) {
                    v4.g0 adapter = uoVar2.f50528b.getAdapter();
                    to toVar = uoVar2.f50530e;
                    if (adapter == toVar) {
                        chat = (TLRPC.Chat) toVar.d.get(i7);
                    } else {
                        int i16 = uoVar2.G;
                        if (i7 >= i16 && i7 < uoVar2.H) {
                            chat = (TLRPC.Chat) uoVar2.f50535w.get(i7 - i16);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z15 && uoVar2.h.linked_chat_id == 0) {
                            uoVar2.f0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f26960id);
                        uoVar2.presentFragment(new cn(bundle));
                        return;
                    } else if (i7 == uoVar2.F) {
                        if (z15 && uoVar2.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{uoVar2.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = uoVar2.f50531f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.id.a0("GroupCreateDiscussionDefaultName", null, 2131749454, chat2.title));
                            }
                            g50 g50Var = new g50(bundle2);
                            g50Var.Y = new mo(uoVar2);
                            uoVar2.presentFragment(g50Var);
                            return;
                        } else if (!uoVar2.f50535w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) uoVar2.f50535w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uoVar2.getParentActivity());
                            if (z15) {
                                M0 = org.telegram.messenger.id.M0(2131751371, null);
                                a02 = org.telegram.messenger.id.a0("DiscussionUnlinkChannelAlert", null, 2131751372, chat3.title);
                            } else {
                                M0 = org.telegram.messenger.id.M0(2131751373, null);
                                a02 = org.telegram.messenger.id.a0("DiscussionUnlinkGroupAlert", null, 2131751370, chat3.title);
                            }
                            alertDialog$Builder.f27300a.R = M0;
                            alertDialog$Builder.f27300a.T = org.telegram.messenger.g0.X2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751374, null), new w0(uoVar2, 25));
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                            uoVar2.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
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
                bp bpVar = (bp) this.f46186b;
                ArrayList arrayList3 = bpVar.f44098n;
                if (i7 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i7 - 3);
                    boolean contains = bpVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
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
                    Switch r22 = xVar.f30774c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.wo woVar = xVar.d;
                    if (woVar != null) {
                        woVar.a(z16, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                js jsVar = (js) this.f46186b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ms) view).d;
                ns nsVar = jsVar.f47066a;
                ch.b0 reactionsWindow = nsVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f6200q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.dw0.c(null, nsVar.f48258c0, nsVar.f48280z.getContext(), new a5(jsVar, 9));
                    return;
                }
                ls lsVar = nsVar.f48267l;
                if (lsVar != null) {
                    lsVar.w(stickerSetCovered2.set, TextUtils.join("", nsVar.f48270o));
                }
                nsVar.o();
                return;
            case 7:
                ts tsVar = (ts) this.f46186b;
                if (tsVar.f50334f && tsVar.f50333e) {
                    org.telegram.ui.Components.nj njVar = tsVar.d;
                    ArrayList arrayList4 = njVar.f36318e;
                    if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                        psVar = (ps) njVar.f36318e.get(i7);
                    }
                } else {
                    int S = tsVar.f50332c.S(i7);
                    int Q = tsVar.f50332c.Q(i7);
                    if (Q >= 0 && S >= 0) {
                        psVar = tsVar.f50332c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i7 >= 0) {
                    tsVar.finishFragment();
                    if (psVar != null && (ssVar = tsVar.f50336r) != null) {
                        ssVar.b(psVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                kt ktVar = (kt) this.f46186b;
                ArrayList arrayList5 = ktVar.j3;
                nt ntVar = ktVar.f47430v3;
                if ((view instanceof dt) && i7 >= 0 && i7 < arrayList5.size()) {
                    ft ftVar = (ft) arrayList5.get(i7);
                    if (ftVar != null) {
                        int i17 = ftVar.h;
                        if (i17 >= 0) {
                            ktVar.f47424p3[i17] = !zArr[i17];
                            ktVar.D1(true);
                            return;
                        } else if (i17 == -2) {
                            ntVar.presentFragment(new DataAutoDownloadActivity(ktVar.f47415f3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ntVar.getParentActivity());
                    alertDialog$Builder2.f27300a.R = org.telegram.messenger.id.M0(2131746089, null);
                    alertDialog$Builder2.f27300a.T = org.telegram.messenger.id.M0(2131746090, null);
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131746118, null), new gt(ktVar));
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27300a;
                    ntVar.showDialog(u1Var2);
                    TextView textView2 = (TextView) u1Var2.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f28131q7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                jy.a0((jy) this.f46186b, view, i7);
                return;
            case 10:
                jz jzVar = (jz) this.f46186b;
                if (jzVar.getParentActivity() != null && (bzVar = (bz) jzVar.P.get(i7)) != null) {
                    View.OnClickListener onClickListener = bzVar.f44175c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i18 = bzVar.f54543a;
                    if (i18 == 1) {
                        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                        jzVar.B0(bzVar, paVar.getName(), paVar.getCurrentObject(), bzVar.f44178g);
                        return;
                    } else if (i18 == 7) {
                        org.telegram.ui.Components.h41 h41Var = new org.telegram.ui.Components.h41(22, jzVar, bzVar);
                        if (jzVar.f47110c.f27379x.f55499f) {
                            jzVar.y0(h41Var, false);
                            return;
                        } else {
                            h41Var.run();
                            return;
                        }
                    } else if (i18 == 8 || (i18 == 4 && bzVar.f44181k == 2131232031)) {
                        org.telegram.messenger.vo voVar = jzVar.f47114r;
                        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                        if (jzVar.f47115s && jzVar.f47110c.f27379x.f55499f) {
                            float f10 = -jzVar.Q;
                            jzVar.Q = f10;
                            org.telegram.messenger.g0.G3(f10, view, null);
                            p2Var.a();
                            jzVar.f47116w = true;
                            fi.m3 m3Var = jzVar.R;
                            if ((m3Var == null || !m3Var.V) && (jzVar.fragmentView instanceof FrameLayout)) {
                                fi.m3 m3Var2 = new fi.m3(jzVar.getParentActivity(), 1);
                                m3Var2.r(true);
                                m3Var2.d = 2300L;
                                m3Var2.T = true;
                                m3Var2.f12424e = true;
                                m3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                m3Var2.f12444u0 = -org.telegram.messenger.g0.L(10.0f);
                                jzVar.R = m3Var2;
                                m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                m3Var2.l(jzVar.getBaseSimpleGlass().f21026c);
                                m3Var2.u(org.telegram.messenger.id.M0(2131750775, null));
                                m3Var2.f12438q0 = new ry(m3Var2, 0);
                                ((FrameLayout) jzVar.fragmentView).addView(m3Var2, c8.ha.e(-1, 150, 55));
                                m3Var2.y(jzVar.f47110c, true);
                                return;
                            }
                            return;
                        }
                        if (!TextUtils.isEmpty(jzVar.f47117x) || !TextUtils.isEmpty(voVar.f26075b)) {
                            int i19 = jzVar.D;
                            int i20 = org.telegram.messenger.qp.C8;
                            if ((i19 & (-1537)) == 0 && jzVar.G.isEmpty() && !jzVar.F.isEmpty()) {
                                jzVar.y0(new oy(jzVar, 1), false);
                                return;
                            }
                        }
                        float f11 = -jzVar.Q;
                        jzVar.Q = f11;
                        org.telegram.messenger.g0.G3(f11, view, null);
                        p2Var.a();
                        if (TextUtils.isEmpty(jzVar.f47117x) && TextUtils.isEmpty(voVar.f26075b)) {
                            a03 = org.telegram.ui.Components.gc.a0(jzVar);
                            i10 = 2131750762;
                        } else {
                            int i21 = jzVar.D;
                            int i22 = org.telegram.messenger.qp.C8;
                            if ((i21 & (-1537)) != 0) {
                                if (!jzVar.G.isEmpty()) {
                                    a03 = org.telegram.ui.Components.gc.a0(jzVar);
                                    i10 = 2131750759;
                                } else {
                                    a03 = org.telegram.ui.Components.gc.a0(jzVar);
                                    i10 = 2131750760;
                                }
                            } else if (jzVar.F.isEmpty()) {
                                a03 = org.telegram.ui.Components.gc.a0(jzVar);
                                i10 = 2131750763;
                            } else {
                                a03 = org.telegram.ui.Components.gc.a0(jzVar);
                                i10 = 2131750761;
                            }
                        }
                        org.telegram.messenger.k5.p(null, i10, a03, null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                yy yyVar = (yy) this.f46186b;
                ArrayList arrayList6 = yyVar.Z1;
                int i23 = i7 - 1;
                if (i23 >= 0 && i23 < arrayList6.size()) {
                    bz bzVar2 = (bz) arrayList6.get(i23);
                    int i24 = bzVar2.f54543a;
                    if (i24 == 7) {
                        yyVar.dismiss();
                        yyVar.f35905r1.presentFragment(new jy(yyVar.T1, bzVar2.f44183m));
                        return;
                    } else if (i24 == 8) {
                        yyVar.d1();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                b00 b00Var = (b00) this.f46186b;
                if (view instanceof org.telegram.ui.Cells.h7) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.g7) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.g7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.h2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.t2) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.t2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                i50 i50Var = (i50) this.f46186b;
                if (i50Var.getParentActivity() != null) {
                    if (i7 != i50Var.f46505n && i7 != 0) {
                        if (i7 == i50Var.f46507s) {
                            if (i50Var.f46504f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", i50Var.f46504f.link);
                                    i50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131749110, null)), 500);
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            return;
                        } else if (i7 == i50Var.f46506r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(i50Var.getParentActivity());
                            alertDialog$Builder3.f27300a.T = org.telegram.messenger.id.M0(2131746026, null);
                            alertDialog$Builder3.f27300a.R = org.telegram.messenger.id.M0(2131746023, null);
                            alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131746024, null), new zr(i50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            i50Var.showDialog(alertDialog$Builder3.f27300a);
                            return;
                        } else {
                            return;
                        }
                    } else if (i50Var.f46504f != null) {
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f25570b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", i50Var.f46504f.link));
                            org.telegram.ui.Components.gc.j(i50Var).j();
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
                p50.Z((p50) this.f46186b, view, i7);
                return;
            case 15:
                c60.Z((c60) this.f46186b, view, i7);
                return;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.f46186b, view, i7);
                return;
            case 17:
                ((eg0) this.f46186b).onBackPressed();
                return;
            case 18:
                mg0 mg0Var = (mg0) this.f46186b;
                int i25 = mg0Var.I;
                if (i7 >= i25 && i7 < mg0Var.J) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) mg0Var.f47968y.get(i7 - i25);
                    if (ijVar.x4()) {
                        if (!mg0Var.g0(ijVar)) {
                            mg0Var.getOrCreateStoryViewer().L(mg0Var.getParentActivity(), ijVar.f23270l, di.i7.a(mg0Var.f47962f));
                            return;
                        }
                        return;
                    }
                    long B0 = org.telegram.messenger.ij.B0(ijVar.f23266k);
                    Bundle bundle3 = new Bundle();
                    if (org.telegram.messenger.m5.E(B0)) {
                        bundle3.putLong("user_id", B0);
                    } else {
                        bundle3.putLong("chat_id", -B0);
                    }
                    bundle3.putInt("message_id", ijVar.e1());
                    bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                    if (mg0Var.getMessagesController().E(bundle3, mg0Var, null, null)) {
                        mg0Var.presentFragment(new cn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.f46186b, view, i7);
                return;
            case 20:
                jm0 jm0Var = (jm0) this.f46186b;
                jm0Var.a(i7, true);
                wl0 wl0Var = jm0Var.h;
                if (wl0Var != null) {
                    wl0Var.a(Integer.valueOf(i7));
                    return;
                }
                return;
            case 21:
                an0 an0Var = (an0) this.f46186b;
                ArrayList arrayList7 = an0Var.f43757f;
                ArrayList arrayList8 = an0Var.f43765n;
                org.telegram.messenger.we weVar = an0Var.J;
                if (weVar == null && arrayList7.isEmpty()) {
                    if (i7 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i7);
                        bn0 bn0Var = an0Var.f43774t0;
                        if (bn0Var != null) {
                            switch (bn0Var.f44089a) {
                                case 1:
                                    dn0.m0(bn0Var.f44090b, str);
                                    return;
                                default:
                                    dn0.m0(bn0Var.f44090b, str);
                                    return;
                            }
                        }
                        an0Var.P.getSearchField().setText(str);
                        an0Var.P.getSearchField().setSelection(str.length());
                        an0Var.g0(an0Var.P.getSearchField());
                        return;
                    } else if (i7 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(an0Var.getParentActivity());
                        alertDialog$Builder4.f27300a.R = org.telegram.messenger.id.M0(2131752056, null);
                        alertDialog$Builder4.f27300a.T = org.telegram.messenger.id.M0(2131752061, null);
                        alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131752099, null), new tm0(an0Var, 4));
                        alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder4.f27300a;
                        an0Var.showDialog(u1Var3);
                        TextView textView3 = (TextView) u1Var3.d(-1);
                        if (textView3 != null) {
                            org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.f28131q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                if (weVar != null) {
                    arrayList7 = weVar.f26304e;
                }
                if (i7 >= 0 && i7 < arrayList7.size()) {
                    org.telegram.ui.ActionBar.r0 r0Var = an0Var.P;
                    if (r0Var != null) {
                        org.telegram.messenger.g0.v1(r0Var.getSearchField());
                    }
                    if (an0Var.Y) {
                        an0Var.f0(view, arrayList7.get(i7));
                        return;
                    }
                    int i26 = an0Var.T;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 != 2) {
                            i12 = 10;
                            if (i26 != 10) {
                                i13 = an0Var.U == null ? 4 : 0;
                            }
                        }
                        i13 = i12;
                    }
                    PhotoViewer.p1().H2(null, an0Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i27 = an0Var.H;
                    boolean z17 = an0Var.I;
                    p12.h = i27;
                    p12.f41459n = z17;
                    PhotoViewer.p1().e2(arrayList7, i7, i13, an0Var.f43764l0, an0Var.f43780x0, an0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f46186b;
                ArrayList arrayList9 = photoViewer.f41399f7;
                if (!arrayList9.isEmpty() && (i11 = photoViewer.O4) >= 0 && i11 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.O4);
                    if (obj instanceof org.telegram.messenger.ze) {
                        ((org.telegram.messenger.ze) obj).f26864s = photoViewer.j1();
                    }
                }
                photoViewer.f41430j5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.O4 = -1;
                    photoViewer.y2(indexOf);
                }
                photoViewer.f41430j5 = false;
                return;
            case 23:
                sr0 sr0Var = (sr0) this.f46186b;
                boolean[] zArr2 = sr0Var.f49950x;
                if (i7 == sr0Var.f49938o0) {
                    sr0Var.k0();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    boolean z18 = sr0Var.L;
                    org.telegram.ui.Components.ow0 ow0Var = sr0Var.Q;
                    if (ow0Var != null) {
                        ow0Var.f();
                    }
                    if (sr0Var.I) {
                        int i28 = -sr0Var.O;
                        sr0Var.O = i28;
                        org.telegram.messenger.g0.G3(i28, r8Var, null);
                        org.telegram.messenger.p2.APP_ERROR.a();
                        return;
                    }
                    if (i7 == sr0Var.f49942r0) {
                        z9 = !sr0Var.G;
                        sr0Var.G = z9;
                    } else {
                        int i29 = sr0Var.f49946u0;
                        if (i7 == i29) {
                            z9 = !sr0Var.H;
                            sr0Var.H = z9;
                        } else {
                            if (i7 == sr0Var.f49947v0) {
                                z10 = !sr0Var.J;
                                sr0Var.J = z10;
                                sr0Var.w0();
                                int i30 = sr0Var.f49946u0;
                                if (i30 >= 0 && i29 < 0) {
                                    sr0Var.f49921b.i(i30);
                                } else if (i29 >= 0 && i30 < 0) {
                                    sr0Var.f49921b.s(i29);
                                }
                            } else if (i7 == sr0Var.f49944s0) {
                                boolean z19 = sr0Var.K;
                                z10 = !z19;
                                sr0Var.K = z10;
                                if (!z19 && sr0Var.L) {
                                    int i31 = sr0Var.f49933j0;
                                    sr0Var.L = false;
                                    sr0Var.w0();
                                    v4.d1 K = sr0Var.f49923c.K(sr0Var.f49945t0);
                                    if (K != null) {
                                        ((org.telegram.ui.Cells.r8) K.f57052a).setChecked(false);
                                    } else {
                                        sr0Var.f49921b.g(sr0Var.f49945t0);
                                    }
                                    sr0Var.f49921b.p(i31, 2);
                                }
                            } else if (sr0Var.N == 0) {
                                z9 = !sr0Var.L;
                                sr0Var.L = z9;
                                int i32 = sr0Var.f49933j0;
                                sr0Var.w0();
                                if (sr0Var.L) {
                                    sr0Var.f49921b.o(sr0Var.f49933j0, 2);
                                } else {
                                    sr0Var.f49921b.p(i32, 2);
                                }
                                if (sr0Var.L && sr0Var.K) {
                                    sr0Var.K = false;
                                    v4.d1 K2 = sr0Var.f49923c.K(sr0Var.f49944s0);
                                    if (K2 != null) {
                                        ((org.telegram.ui.Cells.r8) K2.f57052a).setChecked(false);
                                    } else {
                                        sr0Var.f49921b.g(sr0Var.f49944s0);
                                    }
                                }
                                if (sr0Var.L) {
                                    boolean z20 = false;
                                    for (int i33 = 0; i33 < zArr2.length; i33++) {
                                        if (z20) {
                                            zArr2[i33] = false;
                                        } else if (zArr2[i33]) {
                                            z20 = true;
                                        }
                                    }
                                }
                            } else {
                                return;
                            }
                            z9 = z10;
                        }
                    }
                    if (sr0Var.M && !sr0Var.L) {
                        sr0Var.f49923c.getChildCount();
                        sr0Var.h.a();
                    }
                    for (int i34 = sr0Var.f49937n0; i34 < sr0Var.f49937n0 + sr0Var.D; i34++) {
                        v4.d1 K3 = sr0Var.f49923c.K(i34);
                        if (K3 != null) {
                            View view2 = K3.f57052a;
                            if (view2 instanceof org.telegram.ui.Cells.a6) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view2;
                                a6Var.m(sr0Var.L, true);
                                a6Var.f28909r.a(zArr2[i34 - sr0Var.f49937n0], z18);
                                if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == sr0Var.f49945t0 && !sr0Var.M) {
                                    sr0Var.h.c(a6Var.getCheckBox());
                                    sr0Var.M = true;
                                }
                            }
                        }
                    }
                    r8Var.setChecked(z9);
                    sr0Var.n0();
                    return;
                } else {
                    return;
                }
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.f46186b, view, i7);
                return;
            case 25:
                xs0 xs0Var = (xs0) this.f46186b;
                PremiumPreviewFragment premiumPreviewFragment = xs0Var.f51812n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                er0 er0Var = xs0Var.f51810e;
                if (view.isEnabled() && (view instanceof ug.k1)) {
                    ug.k1 k1Var = (ug.k1) view;
                    premiumPreviewFragment.f41610e = arrayList10.indexOf(k1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    k1Var.c(true, true);
                    for (int i35 = 0; i35 < er0Var.getChildCount(); i35++) {
                        View childAt = er0Var.getChildAt(i35);
                        if (childAt instanceof ug.k1) {
                            ug.k1 k1Var2 = (ug.k1) childAt;
                            if (k1Var2.getTier() != k1Var.getTier()) {
                                k1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i36 = 0; i36 < er0Var.getHiddenChildCount(); i36++) {
                        View V = er0Var.V(i36);
                        if (V instanceof ug.k1) {
                            ug.k1 k1Var3 = (ug.k1) V;
                            if (k1Var3.getTier() != k1Var.getTier()) {
                                k1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < er0Var.getCachedChildCount(); i37++) {
                        View P = er0Var.P(i37);
                        if (P instanceof ug.k1) {
                            ug.k1 k1Var4 = (ug.k1) P;
                            if (k1Var4.getTier() != k1Var.getTier()) {
                                k1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < er0Var.getAttachedScrapChildCount(); i38++) {
                        View O = er0Var.O(i38);
                        if (O instanceof ug.k1) {
                            ug.k1 k1Var5 = (ug.k1) O;
                            if (k1Var5.getTier() != k1Var.getTier()) {
                                k1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.J;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((zs0Var = premiumPreviewFragment.f41612f) != null && zs0Var.f52526a.months < ((zs0) arrayList10.get(premiumPreviewFragment.f41610e)).f52526a.months && !premiumPreviewFragment.f41623p0)) {
                        z11 = true;
                    }
                    org.telegram.messenger.g0.X3(frameLayout, z11);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.c0((PrivacyControlActivity) this.f46186b, view, i7);
                return;
            case 27:
                a(i7, view);
                return;
            case 28:
                ProfileActivity.c0((ProfileActivity) this.f46186b, i7);
                return;
            default:
                ProxyListActivity.Z((ProxyListActivity) this.f46186b, view, i7);
                return;
        }
    }
}
