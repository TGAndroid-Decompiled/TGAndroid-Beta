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
    public final int f48383a;
    public final Object f48384b;

    public h(Object obj, int i7) {
        this.f48383a = i7;
        this.f48384b = obj;
    }

    private final void a(int i7, View view) {
        rt0 rt0Var = (rt0) this.f48384b;
        int i10 = rt0Var.E;
        if (i7 == rt0Var.f51892x) {
            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.b5.L(rt0Var.getParentActivity(), org.telegram.messenger.gd.N0(2131747719, null), org.telegram.messenger.gd.N0(2131747720, null), org.telegram.messenger.gd.N0(2131751586, null), new pt0(rt0Var), null).f28835a;
            t1Var.show();
            t1Var.i();
        } else if (i7 == rt0Var.f51887f) {
            if (i10 == 1) {
                ?? g2Var = new org.telegram.ui.ActionBar.g2(null);
                g2Var.d = new Paint();
                g2Var.f47231f = new cu[2];
                g2Var.f47236x = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                bx bxVar = new bx(bundle);
                g2Var.f47227a = bxVar;
                bxVar.E2 = new au(g2Var);
                bxVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                g2Var.f47228b = contactsActivity;
                contactsActivity.V = new au(g2Var);
                contactsActivity.onFragmentCreate();
                rt0Var.presentFragment((org.telegram.ui.ActionBar.g2) g2Var);
                return;
            }
            Bundle k10 = a8.p0.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            y40 y40Var = new y40(k10);
            y40Var.f54220x = new ot0(rt0Var);
            rt0Var.presentFragment(y40Var);
        } else if (i7 >= rt0Var.f51889r && i7 < rt0Var.f51890s) {
            if (i10 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", rt0Var.getMessagesController().H0.keyAt(i7 - rt0Var.f51889r));
                rt0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        String N0;
        String a02;
        ss ssVar;
        boolean[] zArr;
        bz bzVar;
        org.telegram.ui.Components.kc b02;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        ws0 ws0Var;
        int i12 = 3;
        ps psVar = null;
        boolean z12 = false;
        int i13 = 1;
        switch (this.f48383a) {
            case 0:
                k kVar = (k) this.f48384b;
                ArrayList arrayList = kVar.h;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    int i14 = ((i) arrayList.get(i7)).d;
                    if (i14 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z13 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z13;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z13);
                        kVar.f49263c = true;
                        return;
                    } else if (i14 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z14 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z14;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z14);
                        kVar.f49263c = true;
                        return;
                    } else if (i14 == 7) {
                        if (!kVar.getUserConfig().q() && !kVar.getMessagesController().f25703b4 && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.j80 j80Var = xbVar.f41967b;
                            j80Var.setText(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131743619, null), org.telegram.ui.ActionBar.n6.xj, 0, new hq0(kVar, 3), null));
                            j80Var.setSingleLine(false);
                            j80Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            xbVar.f41966a.setImageResource(2131232367);
                            org.telegram.ui.Components.fc.g(kVar, xbVar, 3500).j();
                            int i15 = -kVar.f49264e;
                            kVar.f49264e = i15;
                            org.telegram.messenger.g0.E3(i15, view, null);
                            org.telegram.messenger.q2.APP_ERROR.a();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                        boolean z15 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z15;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z15);
                        kVar.f49263c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                o oVar = (o) this.f48384b;
                if (i7 >= oVar.f50471y && i7 < oVar.E && oVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.h.get(i7 - oVar.f50471y);
                    if (stickerSetCovered.set.f28519id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f28512id = stickerSetCovered.set.f28519id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.jw0 jw0Var = new org.telegram.ui.Components.jw0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    jw0Var.X1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(jw0Var);
                    return;
                }
                return;
            case 2:
                yy0.Z((yy0) this.f48384b, i7);
                return;
            case 3:
                oc ocVar = (oc) this.f48384b;
                ArrayList arrayList2 = ocVar.f50642c;
                d61 d61Var = ocVar.d;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.Components.jp jpVar = (org.telegram.ui.Components.jp) arrayList2.get(i7);
                    ocVar.a(jpVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + d61Var.getPaddingLeft()) {
                        d61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + d61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (d61Var.getMeasuredWidth() - d61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        d61Var.w0(org.telegram.messenger.f3.B(48.0f, d61Var.getMeasuredWidth() - d61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.w10 w10Var = ocVar.f50646r;
                    if (w10Var != null) {
                        w10Var.a(jpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                uo uoVar = (uo) this.f48384b;
                boolean z16 = uoVar.f52703s;
                if (uoVar.getParentActivity() != null) {
                    v4.i0 adapter = uoVar.f52697b.getAdapter();
                    to toVar = uoVar.f52699e;
                    if (adapter == toVar) {
                        chat = (TLRPC.Chat) toVar.d.get(i7);
                    } else {
                        int i16 = uoVar.H;
                        if (i7 >= i16 && i7 < uoVar.I) {
                            chat = (TLRPC.Chat) uoVar.f52704w.get(i7 - i16);
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
                        bundle.putLong("chat_id", chat.f28492id);
                        uoVar.presentFragment(new bn(bundle));
                        return;
                    } else if (i7 == uoVar.G) {
                        if (z16 && uoVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{uoVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = uoVar.f52700f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.gd.a0("GroupCreateDiscussionDefaultName", null, 2131749261, chat2.title));
                            }
                            e50 e50Var = new e50(bundle2);
                            e50Var.Z = new mo(uoVar);
                            uoVar.presentFragment(e50Var);
                            return;
                        } else if (!uoVar.f52704w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) uoVar.f52704w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uoVar.getParentActivity());
                            if (z16) {
                                N0 = org.telegram.messenger.gd.N0(2131751359, null);
                                a02 = org.telegram.messenger.gd.a0("DiscussionUnlinkChannelAlert", null, 2131751360, chat3.title);
                            } else {
                                N0 = org.telegram.messenger.gd.N0(2131751361, null);
                                a02 = org.telegram.messenger.gd.a0("DiscussionUnlinkGroupAlert", null, 2131751358, chat3.title);
                            }
                            alertDialog$Builder.f28835a.S = N0;
                            alertDialog$Builder.f28835a.U = org.telegram.messenger.g0.W2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751362, null), new w0(uoVar, 25));
                            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                            uoVar.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29692q7, null);
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
                bp bpVar = (bp) this.f48384b;
                ArrayList arrayList3 = bpVar.f46472n;
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
                    Switch r22 = xVar.f32375c;
                    if (r22 != null) {
                        r22.c(z17, true);
                    }
                    org.telegram.ui.Components.lp lpVar = xVar.d;
                    if (lpVar != null) {
                        lpVar.a(z17, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                js jsVar = (js) this.f48384b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ms) view).d;
                ns nsVar = jsVar.f49201a;
                ch.b0 reactionsWindow = nsVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f5303q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ow0.c(null, nsVar.f50405c0, nsVar.f50427z.getContext(), new a5(jsVar, 9));
                    return;
                }
                ls lsVar = nsVar.f50414l;
                if (lsVar != null) {
                    lsVar.u(stickerSetCovered2.set, TextUtils.join("", nsVar.f50417o));
                }
                nsVar.o();
                return;
            case 7:
                ts tsVar = (ts) this.f48384b;
                if (tsVar.f52466f && tsVar.f52465e) {
                    org.telegram.ui.Components.dk dkVar = tsVar.d;
                    ArrayList arrayList4 = dkVar.f34376e;
                    if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                        psVar = (ps) dkVar.f34376e.get(i7);
                    }
                } else {
                    int S = tsVar.f52464c.S(i7);
                    int Q = tsVar.f52464c.Q(i7);
                    if (Q >= 0 && S >= 0) {
                        psVar = tsVar.f52464c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i7 >= 0) {
                    tsVar.finishFragment();
                    if (psVar != null && (ssVar = tsVar.f52468r) != null) {
                        ssVar.d(psVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                lt ltVar = (lt) this.f48384b;
                ArrayList arrayList5 = ltVar.f49827k3;
                ot otVar = ltVar.f49839w3;
                if ((view instanceof et) && i7 >= 0 && i7 < arrayList5.size()) {
                    gt gtVar = (gt) arrayList5.get(i7);
                    if (gtVar != null) {
                        int i17 = gtVar.h;
                        if (i17 >= 0) {
                            ltVar.f49833q3[i17] = !zArr[i17];
                            ltVar.D1(true);
                            return;
                        } else if (i17 == -2) {
                            otVar.presentFragment(new DataAutoDownloadActivity(ltVar.f49824g3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(otVar.getParentActivity());
                    alertDialog$Builder2.f28835a.S = org.telegram.messenger.gd.N0(2131745893, null);
                    alertDialog$Builder2.f28835a.U = org.telegram.messenger.gd.N0(2131745894, null);
                    alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131745922, null), new ht(ltVar));
                    alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
                    otVar.showDialog(t1Var2);
                    TextView textView2 = (TextView) t1Var2.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29692q7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                jy.a0((jy) this.f48384b, view, i7);
                return;
            case 10:
                jz jzVar = (jz) this.f48384b;
                if (jzVar.getParentActivity() != null && (bzVar = (bz) jzVar.Q.get(i7)) != null) {
                    View.OnClickListener onClickListener = bzVar.f46665c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i18 = bzVar.f56712a;
                    if (i18 == 1) {
                        org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
                        jzVar.B0(bzVar, saVar.getName(), saVar.getCurrentObject(), bzVar.f46668g);
                        return;
                    } else if (i18 == 7) {
                        org.telegram.ui.Components.voip.o oVar2 = new org.telegram.ui.Components.voip.o(18, jzVar, bzVar);
                        if (jzVar.f49250c.f28919x.f57780f) {
                            jzVar.y0(oVar2, false);
                            return;
                        } else {
                            oVar2.run();
                            return;
                        }
                    } else if (i18 == 8 || (i18 == 4 && bzVar.f46671k == 2131232035)) {
                        org.telegram.messenger.ro roVar = jzVar.f49254r;
                        org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
                        if (jzVar.f49255s && jzVar.f49250c.f28919x.f57780f) {
                            float f10 = -jzVar.R;
                            jzVar.R = f10;
                            org.telegram.messenger.g0.E3(f10, view, null);
                            q2Var.a();
                            jzVar.f49256w = true;
                            hi.u3 u3Var = jzVar.S;
                            if ((u3Var == null || !u3Var.W) && (jzVar.fragmentView instanceof FrameLayout)) {
                                hi.u3 u3Var2 = new hi.u3(jzVar.getParentActivity(), 1);
                                u3Var2.r(true);
                                u3Var2.d = 2300L;
                                u3Var2.U = true;
                                u3Var2.f15490e = true;
                                u3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                u3Var2.f15511v0 = -org.telegram.messenger.g0.L(10.0f);
                                jzVar.S = u3Var2;
                                u3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                u3Var2.l(jzVar.getBaseSimpleGlass().f56739c);
                                u3Var2.v(org.telegram.messenger.gd.N0(2131750763, null));
                                u3Var2.f15506r0 = new ry(u3Var2, 0);
                                ((FrameLayout) jzVar.fragmentView).addView(u3Var2, c8.na.e(-1, 150, 55));
                                u3Var2.z(jzVar.f49250c, true);
                                return;
                            }
                            return;
                        }
                        if (!TextUtils.isEmpty(jzVar.f49257x) || !TextUtils.isEmpty(roVar.f26774b)) {
                            int i19 = jzVar.E;
                            int i20 = org.telegram.messenger.mp.I8;
                            if ((i19 & (-1537)) == 0 && jzVar.H.isEmpty() && !jzVar.G.isEmpty()) {
                                jzVar.y0(new oy(jzVar, 1), false);
                                return;
                            }
                        }
                        float f11 = -jzVar.R;
                        jzVar.R = f11;
                        org.telegram.messenger.g0.E3(f11, view, null);
                        q2Var.a();
                        if (TextUtils.isEmpty(jzVar.f49257x) && TextUtils.isEmpty(roVar.f26774b)) {
                            b02 = org.telegram.ui.Components.kc.b0(jzVar);
                            i10 = 2131750750;
                        } else {
                            int i21 = jzVar.E;
                            int i22 = org.telegram.messenger.mp.I8;
                            if ((i21 & (-1537)) != 0) {
                                if (!jzVar.H.isEmpty()) {
                                    b02 = org.telegram.ui.Components.kc.b0(jzVar);
                                    i10 = 2131750747;
                                } else {
                                    b02 = org.telegram.ui.Components.kc.b0(jzVar);
                                    i10 = 2131750748;
                                }
                            } else if (jzVar.G.isEmpty()) {
                                b02 = org.telegram.ui.Components.kc.b0(jzVar);
                                i10 = 2131750751;
                            } else {
                                b02 = org.telegram.ui.Components.kc.b0(jzVar);
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
                yy yyVar = (yy) this.f48384b;
                ArrayList arrayList6 = yyVar.f54448a2;
                int i23 = i7 - 1;
                if (i23 >= 0 && i23 < arrayList6.size()) {
                    bz bzVar2 = (bz) arrayList6.get(i23);
                    int i24 = bzVar2.f56712a;
                    if (i24 == 7) {
                        yyVar.dismiss();
                        yyVar.f39250s1.presentFragment(new jy(yyVar.U1, bzVar2.f46673m));
                        return;
                    } else if (i24 == 8) {
                        yyVar.e1();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                b00 b00Var = (b00) this.f48384b;
                if (view instanceof org.telegram.ui.Cells.h7) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.g7) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.g7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.i2) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.i2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.u2) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.u2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                g50 g50Var = (g50) this.f48384b;
                if (g50Var.getParentActivity() != null) {
                    if (i7 != g50Var.f48108n && i7 != 0) {
                        if (i7 == g50Var.f48110s) {
                            if (g50Var.f48107f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", g50Var.f48107f.link);
                                    g50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.gd.N0(2131748917, null)), 500);
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            return;
                        } else if (i7 == g50Var.f48109r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(g50Var.getParentActivity());
                            alertDialog$Builder3.f28835a.U = org.telegram.messenger.gd.N0(2131745830, null);
                            alertDialog$Builder3.f28835a.S = org.telegram.messenger.gd.N0(2131745827, null);
                            alertDialog$Builder3.k(org.telegram.messenger.gd.N0(2131745828, null), new zr(g50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                            g50Var.showDialog(alertDialog$Builder3.f28835a);
                            return;
                        } else {
                            return;
                        }
                    } else if (g50Var.f48107f != null) {
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f27013b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", g50Var.f48107f.link));
                            org.telegram.ui.Components.kc.j(g50Var).j();
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
                n50.Z((n50) this.f48384b, view, i7);
                return;
            case 15:
                a60.Z((a60) this.f48384b, view, i7);
                return;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.f48384b, view, i7);
                return;
            case 17:
                ((dg0) this.f48384b).onBackPressed();
                return;
            case 18:
                mg0 mg0Var = (mg0) this.f48384b;
                int i25 = mg0Var.J;
                if (i7 >= i25 && i7 < mg0Var.K) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) mg0Var.f50070y.get(i7 - i25);
                    if (fjVar.x4()) {
                        if (!mg0Var.g0(fjVar)) {
                            mg0Var.getOrCreateStoryViewer().L(mg0Var.getParentActivity(), fjVar.f24078l, fi.y6.a(mg0Var.f50063f));
                            return;
                        }
                        return;
                    }
                    long B0 = org.telegram.messenger.fj.B0(fjVar.f24073k);
                    Bundle bundle3 = new Bundle();
                    if (org.telegram.messenger.n5.E(B0)) {
                        bundle3.putLong("user_id", B0);
                    } else {
                        bundle3.putLong("chat_id", -B0);
                    }
                    bundle3.putInt("message_id", fjVar.e1());
                    bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                    if (mg0Var.getMessagesController().E(bundle3, mg0Var, null, null)) {
                        mg0Var.presentFragment(new bn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.f48384b, view, i7);
                return;
            case 20:
                im0 im0Var = (im0) this.f48384b;
                im0Var.a(i7, true);
                vl0 vl0Var = im0Var.h;
                if (vl0Var != null) {
                    vl0Var.a(Integer.valueOf(i7));
                    return;
                }
                return;
            case 21:
                an0 an0Var = (an0) this.f48384b;
                ArrayList arrayList7 = an0Var.f45752f;
                ArrayList arrayList8 = an0Var.f45760n;
                org.telegram.messenger.ue ueVar = an0Var.K;
                if (ueVar == null && arrayList7.isEmpty()) {
                    if (i7 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i7);
                        bn0 bn0Var = an0Var.f45770u0;
                        if (bn0Var != null) {
                            switch (bn0Var.f46456a) {
                                case 1:
                                    dn0.m0(bn0Var.f46457b, str);
                                    return;
                                default:
                                    dn0.m0(bn0Var.f46457b, str);
                                    return;
                            }
                        }
                        an0Var.Q.getSearchField().setText(str);
                        an0Var.Q.getSearchField().setSelection(str.length());
                        an0Var.g0(an0Var.Q.getSearchField());
                        return;
                    } else if (i7 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(an0Var.getParentActivity());
                        alertDialog$Builder4.f28835a.S = org.telegram.messenger.gd.N0(2131752044, null);
                        alertDialog$Builder4.f28835a.U = org.telegram.messenger.gd.N0(2131752049, null);
                        alertDialog$Builder4.k(org.telegram.messenger.gd.N0(2131752087, null), new sm0(an0Var, 4));
                        alertDialog$Builder4.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder4.f28835a;
                        an0Var.showDialog(t1Var3);
                        TextView textView3 = (TextView) t1Var3.d(-1);
                        if (textView3 != null) {
                            org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.f29692q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                if (ueVar != null) {
                    arrayList7 = ueVar.f27262e;
                }
                if (i7 >= 0 && i7 < arrayList7.size()) {
                    org.telegram.ui.ActionBar.q0 q0Var = an0Var.Q;
                    if (q0Var != null) {
                        org.telegram.messenger.g0.v1(q0Var.getSearchField());
                    }
                    if (an0Var.Z) {
                        an0Var.f0(view, arrayList7.get(i7));
                        return;
                    }
                    int i26 = an0Var.U;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 != 2) {
                            i12 = 10;
                            if (i26 != 10) {
                                i13 = an0Var.V == null ? 4 : 0;
                            }
                        }
                        i13 = i12;
                    }
                    PhotoViewer.p1().J2(null, an0Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i27 = an0Var.I;
                    boolean z18 = an0Var.J;
                    p12.h = i27;
                    p12.f43401n = z18;
                    PhotoViewer.p1().g2(arrayList7, i7, i13, an0Var.m0, an0Var.f45777y0, an0Var.V);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f48384b;
                ArrayList arrayList9 = photoViewer.f43350g7;
                if (!arrayList9.isEmpty() && (i11 = photoViewer.P4) >= 0 && i11 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof org.telegram.messenger.xe) {
                        ((org.telegram.messenger.xe) obj).f27978s = photoViewer.j1();
                    }
                }
                photoViewer.f43381k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.A2(indexOf);
                }
                photoViewer.f43381k5 = false;
                return;
            case 23:
                pr0 pr0Var = (pr0) this.f48384b;
                boolean[] zArr2 = pr0Var.f51130x;
                if (i7 == pr0Var.f51119p0) {
                    pr0Var.k0();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    boolean z19 = pr0Var.M;
                    org.telegram.ui.Components.zw0 zw0Var = pr0Var.R;
                    if (zw0Var != null) {
                        zw0Var.f();
                    }
                    if (pr0Var.J) {
                        int i28 = -pr0Var.P;
                        pr0Var.P = i28;
                        org.telegram.messenger.g0.E3(i28, r8Var, null);
                        org.telegram.messenger.q2.APP_ERROR.a();
                        return;
                    }
                    if (i7 == pr0Var.f51124s0) {
                        z10 = !pr0Var.H;
                        pr0Var.H = z10;
                    } else {
                        int i29 = pr0Var.f51127v0;
                        if (i7 == i29) {
                            z10 = !pr0Var.I;
                            pr0Var.I = z10;
                        } else {
                            if (i7 == pr0Var.f51129w0) {
                                z11 = !pr0Var.K;
                                pr0Var.K = z11;
                                pr0Var.w0();
                                int i30 = pr0Var.f51127v0;
                                if (i30 >= 0 && i29 < 0) {
                                    pr0Var.f51101b.i(i30);
                                } else if (i29 >= 0 && i30 < 0) {
                                    pr0Var.f51101b.s(i29);
                                }
                            } else if (i7 == pr0Var.f51125t0) {
                                boolean z20 = pr0Var.L;
                                z11 = !z20;
                                pr0Var.L = z11;
                                if (!z20 && pr0Var.M) {
                                    int i31 = pr0Var.f51114k0;
                                    pr0Var.M = false;
                                    pr0Var.w0();
                                    v4.f1 K = pr0Var.f51103c.K(pr0Var.f51126u0);
                                    if (K != null) {
                                        ((org.telegram.ui.Cells.r8) K.f59245a).setChecked(false);
                                    } else {
                                        pr0Var.f51101b.g(pr0Var.f51126u0);
                                    }
                                    pr0Var.f51101b.p(i31, 2);
                                }
                            } else if (pr0Var.O == 0) {
                                z10 = !pr0Var.M;
                                pr0Var.M = z10;
                                int i32 = pr0Var.f51114k0;
                                pr0Var.w0();
                                if (pr0Var.M) {
                                    pr0Var.f51101b.o(pr0Var.f51114k0, 2);
                                } else {
                                    pr0Var.f51101b.p(i32, 2);
                                }
                                if (pr0Var.M && pr0Var.L) {
                                    pr0Var.L = false;
                                    v4.f1 K2 = pr0Var.f51103c.K(pr0Var.f51125t0);
                                    if (K2 != null) {
                                        ((org.telegram.ui.Cells.r8) K2.f59245a).setChecked(false);
                                    } else {
                                        pr0Var.f51101b.g(pr0Var.f51125t0);
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
                        pr0Var.f51103c.getChildCount();
                        pr0Var.h.a();
                    }
                    for (int i34 = pr0Var.f51118o0; i34 < pr0Var.f51118o0 + pr0Var.E; i34++) {
                        v4.f1 K3 = pr0Var.f51103c.K(i34);
                        if (K3 != null) {
                            View view2 = K3.f59245a;
                            if (view2 instanceof org.telegram.ui.Cells.a6) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view2;
                                a6Var.n(pr0Var.M, true);
                                a6Var.f30479r.a(zArr2[i34 - pr0Var.f51118o0], z19);
                                if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == pr0Var.f51126u0 && !pr0Var.N) {
                                    pr0Var.h.c(a6Var.getCheckBox());
                                    pr0Var.N = true;
                                }
                            }
                        }
                    }
                    r8Var.setChecked(z10);
                    pr0Var.n0();
                    return;
                } else {
                    return;
                }
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.f48384b, view, i7);
                return;
            case 25:
                us0 us0Var = (us0) this.f48384b;
                PremiumPreviewFragment premiumPreviewFragment = us0Var.f52725n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                br0 br0Var = us0Var.f52723e;
                if (view.isEnabled() && (view instanceof ug.n1)) {
                    ug.n1 n1Var = (ug.n1) view;
                    premiumPreviewFragment.f43553e = arrayList10.indexOf(n1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    n1Var.c(true, true);
                    for (int i35 = 0; i35 < br0Var.getChildCount(); i35++) {
                        View childAt = br0Var.getChildAt(i35);
                        if (childAt instanceof ug.n1) {
                            ug.n1 n1Var2 = (ug.n1) childAt;
                            if (n1Var2.getTier() != n1Var.getTier()) {
                                n1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i36 = 0; i36 < br0Var.getHiddenChildCount(); i36++) {
                        View V = br0Var.V(i36);
                        if (V instanceof ug.n1) {
                            ug.n1 n1Var3 = (ug.n1) V;
                            if (n1Var3.getTier() != n1Var.getTier()) {
                                n1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < br0Var.getCachedChildCount(); i37++) {
                        View P = br0Var.P(i37);
                        if (P instanceof ug.n1) {
                            ug.n1 n1Var4 = (ug.n1) P;
                            if (n1Var4.getTier() != n1Var.getTier()) {
                                n1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < br0Var.getAttachedScrapChildCount(); i38++) {
                        View O = br0Var.O(i38);
                        if (O instanceof ug.n1) {
                            ug.n1 n1Var5 = (ug.n1) O;
                            if (n1Var5.getTier() != n1Var.getTier()) {
                                n1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((ws0Var = premiumPreviewFragment.f43555f) != null && ws0Var.f53748a.months < ((ws0) arrayList10.get(premiumPreviewFragment.f43553e)).f53748a.months && !premiumPreviewFragment.f43567q0)) {
                        z12 = true;
                    }
                    org.telegram.messenger.g0.V3(frameLayout, z12);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.c0((PrivacyControlActivity) this.f48384b, view, i7);
                return;
            case 27:
                a(i7, view);
                return;
            case 28:
                ProfileActivity.c0((ProfileActivity) this.f48384b, i7);
                return;
            default:
                ProxyListActivity.Z((ProxyListActivity) this.f48384b, view, i7);
                return;
        }
    }
}
