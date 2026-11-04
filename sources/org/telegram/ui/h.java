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
public final class h implements org.telegram.ui.Components.fj0 {
    public final int f45762a;
    public final Object f45763b;

    public h(Object obj, int i3) {
        this.f45762a = i3;
        this.f45763b = obj;
    }

    private final void a(int i3, View view) {
        it0 it0Var = (it0) this.f45763b;
        int i10 = it0Var.E;
        if (i3 == it0Var.f46419x) {
            org.telegram.ui.ActionBar.s1 s1Var = org.telegram.ui.Components.t4.N(it0Var.getParentActivity(), org.telegram.messenger.bd.M0(2131747921, null), org.telegram.messenger.bd.M0(2131747922, null), org.telegram.messenger.bd.M0(2131751599, null), new gt0(it0Var), null).f27343a;
            s1Var.show();
            s1Var.i();
        } else if (i3 == it0Var.f46414f) {
            if (i10 == 1) {
                ?? d2Var = new org.telegram.ui.ActionBar.d2(null);
                d2Var.d = new Paint();
                d2Var.f52403f = new xt[2];
                d2Var.f52408x = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                uw uwVar = new uw(bundle);
                d2Var.f52399a = uwVar;
                uwVar.D2 = new vt(d2Var);
                uwVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                d2Var.f52400b = contactsActivity;
                contactsActivity.V = new vt(d2Var);
                contactsActivity.onFragmentCreate();
                it0Var.presentFragment((org.telegram.ui.ActionBar.d2) d2Var);
                return;
            }
            Bundle k10 = a1.g.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            r40 r40Var = new r40(k10);
            r40Var.f49061x = new ft0(it0Var);
            it0Var.presentFragment(r40Var);
        } else if (i3 >= it0Var.f46416r && i3 < it0Var.f46417s) {
            if (i10 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", it0Var.getMessagesController().H0.keyAt(i3 - it0Var.f46416r));
                it0Var.presentFragment(new ProfileActivity(bundle3, null));
                return;
            }
            new Bundle();
            throw null;
        }
    }

    @Override
    public final void f(int i3, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String M0;
        String a02;
        ns nsVar;
        boolean[] zArr;
        vy vyVar;
        org.telegram.ui.Components.fc a03;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        ms0 ms0Var;
        int i12 = 3;
        ks ksVar = null;
        boolean z12 = false;
        int i13 = 1;
        switch (this.f45762a) {
            case 0:
                k kVar = (k) this.f45763b;
                ArrayList arrayList = kVar.h;
                if (i3 >= 0 && i3 < arrayList.size()) {
                    int i14 = ((i) arrayList.get(i3)).d;
                    if (i14 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z13 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z13;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z13);
                        kVar.f46718c = true;
                        return;
                    } else if (i14 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z14 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z14;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z14);
                        kVar.f46718c = true;
                        return;
                    } else if (i14 == 7) {
                        if (!kVar.getUserConfig().q() && !kVar.getMessagesController().Z3 && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.sb sbVar = new org.telegram.ui.Components.sb(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.s70 s70Var = sbVar.f37963b;
                            s70Var.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131743876, null), org.telegram.ui.ActionBar.k6.uj, 0, new xp0(kVar, 3), null));
                            s70Var.setSingleLine(false);
                            s70Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            sbVar.f37962a.setImageResource(2131232362);
                            org.telegram.ui.Components.ac.g(kVar, sbVar, 3500).j();
                            int i15 = -kVar.f46719e;
                            kVar.f46719e = i15;
                            org.telegram.messenger.g0.G3(i15, view, null);
                            org.telegram.messenger.p2.APP_ERROR.a();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                        boolean z15 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z15;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z15);
                        kVar.f46718c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                o oVar = (o) this.f45763b;
                if (i3 >= oVar.f48159y && i3 < oVar.E && oVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.h.get(i3 - oVar.f48159y);
                    if (stickerSetCovered.set.f27028id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f27021id = stickerSetCovered.set.f27028id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.xv0 xv0Var = new org.telegram.ui.Components.xv0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    xv0Var.U1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(xv0Var);
                    return;
                }
                return;
            case 2:
                ny0.Z((ny0) this.f45763b, i3);
                return;
            case 3:
                nc ncVar = (nc) this.f45763b;
                ArrayList arrayList2 = ncVar.f47947c;
                u51 u51Var = ncVar.d;
                if (i3 >= 0 && i3 < arrayList2.size()) {
                    org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList2.get(i3);
                    ncVar.a(uoVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + u51Var.getPaddingLeft()) {
                        u51Var.w0(-((org.telegram.messenger.g0.L(48.0f) + u51Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (u51Var.getMeasuredWidth() - u51Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        u51Var.w0(org.telegram.messenger.k5.B(48.0f, u51Var.getMeasuredWidth() - u51Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.u10 u10Var = ncVar.f47951r;
                    if (u10Var != null) {
                        u10Var.a(uoVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                qo qoVar = (qo) this.f45763b;
                boolean z16 = qoVar.f48927s;
                if (qoVar.getParentActivity() != null) {
                    u4.h0 adapter = qoVar.f48921b.getAdapter();
                    po poVar = qoVar.f48923e;
                    if (adapter == poVar) {
                        chat = (TLRPC.Chat) poVar.d.get(i3);
                    } else {
                        int i16 = qoVar.H;
                        if (i3 >= i16 && i3 < qoVar.I) {
                            chat = (TLRPC.Chat) qoVar.f48928w.get(i3 - i16);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z16 && qoVar.h.linked_chat_id == 0) {
                            qoVar.f0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f27001id);
                        qoVar.presentFragment(new wm(bundle));
                        return;
                    } else if (i3 == qoVar.G) {
                        if (z16 && qoVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{qoVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = qoVar.f48924f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.bd.a0("GroupCreateDiscussionDefaultName", null, 2131749462, chat2.title));
                            }
                            y40 y40Var = new y40(bundle2);
                            y40Var.Z = new go(qoVar);
                            qoVar.presentFragment(y40Var);
                            return;
                        } else if (!qoVar.f48928w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) qoVar.f48928w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qoVar.getParentActivity());
                            if (z16) {
                                M0 = org.telegram.messenger.bd.M0(2131751372, null);
                                a02 = org.telegram.messenger.bd.a0("DiscussionUnlinkChannelAlert", null, 2131751373, chat3.title);
                            } else {
                                M0 = org.telegram.messenger.bd.M0(2131751374, null);
                                a02 = org.telegram.messenger.bd.a0("DiscussionUnlinkGroupAlert", null, 2131751371, chat3.title);
                            }
                            alertDialog$Builder.f27343a.S = M0;
                            alertDialog$Builder.f27343a.U = org.telegram.messenger.g0.X2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751375, null), new x0(qoVar, 25));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            qoVar.showDialog(s1Var);
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
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
                xo xoVar = (xo) this.f45763b;
                ArrayList arrayList3 = xoVar.f52062n;
                if (i3 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i3 - 3);
                    boolean contains = xoVar.d.contains(tL_availableReaction.reaction);
                    boolean z17 = !contains;
                    if (!contains) {
                        xoVar.d.add(tL_availableReaction.reaction);
                    } else {
                        xoVar.d.remove(tL_availableReaction.reaction);
                        if (xoVar.d.isEmpty()) {
                            wo woVar = xoVar.h;
                            if (woVar != null) {
                                woVar.p(2, arrayList3.size() + 1);
                            }
                            xoVar.a0(2, true);
                        }
                    }
                    Switch r22 = xVar.f30832c;
                    if (r22 != null) {
                        r22.c(z17, true);
                    }
                    org.telegram.ui.Components.wo woVar2 = xVar.d;
                    if (woVar2 != null) {
                        woVar2.a(z17, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                es esVar = (es) this.f45763b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((hs) view).d;
                is isVar = esVar.f45025a;
                dh.a0 reactionsWindow = isVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f8945q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.cw0.c(null, isVar.f46387c0, isVar.f46409z.getContext(), new c5(esVar, 9));
                    return;
                }
                gs gsVar = isVar.f46396l;
                if (gsVar != null) {
                    gsVar.v(stickerSetCovered2.set, TextUtils.join("", isVar.f46399o));
                }
                isVar.o();
                return;
            case 7:
                os osVar = (os) this.f45763b;
                if (osVar.f48342f && osVar.f48341e) {
                    org.telegram.ui.Components.nj njVar = osVar.d;
                    ArrayList arrayList4 = njVar.f36567e;
                    if (arrayList4 != null && i3 >= 0 && i3 < arrayList4.size()) {
                        ksVar = (ks) njVar.f36567e.get(i3);
                    }
                } else {
                    int S = osVar.f48340c.S(i3);
                    int Q = osVar.f48340c.Q(i3);
                    if (Q >= 0 && S >= 0) {
                        ksVar = osVar.f48340c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i3 >= 0) {
                    osVar.finishFragment();
                    if (ksVar != null && (nsVar = osVar.f48344r) != null) {
                        nsVar.c(ksVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                et etVar = (et) this.f45763b;
                ArrayList arrayList5 = etVar.f45033k3;
                ht htVar = etVar.f45045w3;
                if ((view instanceof ys) && i3 >= 0 && i3 < arrayList5.size()) {
                    at atVar = (at) arrayList5.get(i3);
                    if (atVar != null) {
                        int i17 = atVar.h;
                        if (i17 >= 0) {
                            etVar.f45039q3[i17] = !zArr[i17];
                            etVar.D1(true);
                            return;
                        } else if (i17 == -2) {
                            htVar.presentFragment(new DataAutoDownloadActivity(etVar.f45030g3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.l8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(htVar.getParentActivity());
                    alertDialog$Builder2.f27343a.S = org.telegram.messenger.bd.M0(2131746099, null);
                    alertDialog$Builder2.f27343a.U = org.telegram.messenger.bd.M0(2131746100, null);
                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131746128, null), new bt(etVar));
                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                    htVar.showDialog(s1Var2);
                    TextView textView2 = (TextView) s1Var2.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28122q7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                cy.a0((cy) this.f45763b, view, i3);
                return;
            case 10:
                ez ezVar = (ez) this.f45763b;
                if (ezVar.getParentActivity() != null && (vyVar = (vy) ezVar.Q.get(i3)) != null) {
                    View.OnClickListener onClickListener = vyVar.f50632c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i18 = vyVar.f54715a;
                    if (i18 == 1) {
                        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                        ezVar.B0(vyVar, paVar.getName(), paVar.getCurrentObject(), vyVar.f50635g);
                        return;
                    } else if (i18 == 7) {
                        org.telegram.ui.Components.p11 p11Var = new org.telegram.ui.Components.p11(26, ezVar, vyVar);
                        if (ezVar.f45103c.f27420x.f53841f) {
                            ezVar.y0(p11Var, false);
                            return;
                        } else {
                            p11Var.run();
                            return;
                        }
                    } else if (i18 == 8 || (i18 == 4 && vyVar.f50638k == 2131232031)) {
                        org.telegram.messenger.mo moVar = ezVar.f45107r;
                        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                        if (ezVar.f45108s && ezVar.f45103c.f27420x.f53841f) {
                            float f10 = -ezVar.R;
                            ezVar.R = f10;
                            org.telegram.messenger.g0.G3(f10, view, null);
                            p2Var.a();
                            ezVar.f45109w = true;
                            gi.l3 l3Var = ezVar.S;
                            if ((l3Var == null || !l3Var.W) && (ezVar.fragmentView instanceof FrameLayout)) {
                                gi.l3 l3Var2 = new gi.l3(ezVar.getParentActivity(), 1);
                                l3Var2.r(true);
                                l3Var2.d = 2300L;
                                l3Var2.U = true;
                                l3Var2.f13084e = true;
                                l3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                l3Var2.f13105v0 = -org.telegram.messenger.g0.L(10.0f);
                                ezVar.S = l3Var2;
                                l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                l3Var2.l(ezVar.getBaseSimpleGlass().f53525c);
                                l3Var2.u(org.telegram.messenger.bd.M0(2131750776, null));
                                l3Var2.f13100r0 = new ky(l3Var2, 0);
                                ((FrameLayout) ezVar.fragmentView).addView(l3Var2, b8.mf.e(-1, 150, 55));
                                l3Var2.y(ezVar.f45103c, true);
                                return;
                            }
                            return;
                        }
                        if (!TextUtils.isEmpty(ezVar.f45110x) || !TextUtils.isEmpty(moVar.f24238b)) {
                            int i19 = ezVar.E;
                            int i20 = org.telegram.messenger.hp.C8;
                            if ((i19 & (-1537)) == 0 && ezVar.H.isEmpty() && !ezVar.G.isEmpty()) {
                                ezVar.y0(new hy(ezVar, 1), false);
                                return;
                            }
                        }
                        float f11 = -ezVar.R;
                        ezVar.R = f11;
                        org.telegram.messenger.g0.G3(f11, view, null);
                        p2Var.a();
                        if (TextUtils.isEmpty(ezVar.f45110x) && TextUtils.isEmpty(moVar.f24238b)) {
                            a03 = org.telegram.ui.Components.fc.a0(ezVar);
                            i10 = 2131750763;
                        } else {
                            int i21 = ezVar.E;
                            int i22 = org.telegram.messenger.hp.C8;
                            if ((i21 & (-1537)) != 0) {
                                if (!ezVar.H.isEmpty()) {
                                    a03 = org.telegram.ui.Components.fc.a0(ezVar);
                                    i10 = 2131750760;
                                } else {
                                    a03 = org.telegram.ui.Components.fc.a0(ezVar);
                                    i10 = 2131750761;
                                }
                            } else if (ezVar.G.isEmpty()) {
                                a03 = org.telegram.ui.Components.fc.a0(ezVar);
                                i10 = 2131750764;
                            } else {
                                a03 = org.telegram.ui.Components.fc.a0(ezVar);
                                i10 = 2131750762;
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
                sy syVar = (sy) this.f45763b;
                ArrayList arrayList6 = syVar.X1;
                int i23 = i3 - 1;
                if (i23 >= 0 && i23 < arrayList6.size()) {
                    vy vyVar2 = (vy) arrayList6.get(i23);
                    int i24 = vyVar2.f54715a;
                    if (i24 == 7) {
                        syVar.dismiss();
                        syVar.f36105p1.presentFragment(new cy(syVar.R1, vyVar2.f50640m));
                        return;
                    } else if (i24 == 8) {
                        syVar.d1();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                wz wzVar = (wz) this.f45763b;
                if (view instanceof org.telegram.ui.Cells.g7) {
                    wzVar.f(i3, view, ((org.telegram.ui.Cells.g7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    wzVar.f(i3, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.f7) {
                    wzVar.f(i3, view, ((org.telegram.ui.Cells.f7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    wzVar.f(i3, view, ((org.telegram.ui.Cells.h2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.t2) {
                    wzVar.f(i3, view, ((org.telegram.ui.Cells.t2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                a50 a50Var = (a50) this.f45763b;
                if (a50Var.getParentActivity() != null) {
                    if (i3 != a50Var.f43607n && i3 != 0) {
                        if (i3 == a50Var.f43609s) {
                            if (a50Var.f43606f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", a50Var.f43606f.link);
                                    a50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131749118, null)), 500);
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            return;
                        } else if (i3 == a50Var.f43608r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(a50Var.getParentActivity());
                            alertDialog$Builder3.f27343a.U = org.telegram.messenger.bd.M0(2131746036, null);
                            alertDialog$Builder3.f27343a.S = org.telegram.messenger.bd.M0(2131746033, null);
                            alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131746034, null), new ur(a50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            a50Var.showDialog(alertDialog$Builder3.f27343a);
                            return;
                        } else {
                            return;
                        }
                    } else if (a50Var.f43606f != null) {
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f25457b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", a50Var.f43606f.link));
                            org.telegram.ui.Components.fc.j(a50Var).j();
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
                g50.Z((g50) this.f45763b, view, i3);
                return;
            case 15:
                t50.Z((t50) this.f45763b, view, i3);
                return;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.f45763b, view, i3);
                return;
            case 17:
                ((vf0) this.f45763b).onBackPressed();
                return;
            case 18:
                dg0 dg0Var = (dg0) this.f45763b;
                int i25 = dg0Var.J;
                if (i3 >= i25 && i3 < dg0Var.K) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) dg0Var.f44707y.get(i3 - i25);
                    if (ziVar.y4()) {
                        if (!dg0Var.g0(ziVar)) {
                            dg0Var.getOrCreateStoryViewer().T(dg0Var.getParentActivity(), ziVar.f26871l, ei.i7.a(dg0Var.f44700f));
                            return;
                        }
                        return;
                    }
                    long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
                    Bundle bundle3 = new Bundle();
                    if (org.telegram.messenger.m5.E(B0)) {
                        bundle3.putLong("user_id", B0);
                    } else {
                        bundle3.putLong("chat_id", -B0);
                    }
                    bundle3.putInt("message_id", ziVar.f1());
                    bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                    if (dg0Var.getMessagesController().E(bundle3, dg0Var, null, null)) {
                        dg0Var.presentFragment(new wm(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.f45763b, view, i3);
                return;
            case 20:
                bm0 bm0Var = (bm0) this.f45763b;
                bm0Var.a(i3, true);
                ol0 ol0Var = bm0Var.h;
                if (ol0Var != null) {
                    ol0Var.a(Integer.valueOf(i3));
                    return;
                }
                return;
            case 21:
                sm0 sm0Var = (sm0) this.f45763b;
                ArrayList arrayList7 = sm0Var.f49547f;
                ArrayList arrayList8 = sm0Var.f49555n;
                org.telegram.messenger.pe peVar = sm0Var.K;
                if (peVar == null && arrayList7.isEmpty()) {
                    if (i3 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i3);
                        tm0 tm0Var = sm0Var.f49565u0;
                        if (tm0Var != null) {
                            switch (tm0Var.f49829a) {
                                case 1:
                                    vm0.m0(tm0Var.f49830b, str);
                                    return;
                                default:
                                    vm0.m0(tm0Var.f49830b, str);
                                    return;
                            }
                        }
                        sm0Var.Q.getSearchField().setText(str);
                        sm0Var.Q.getSearchField().setSelection(str.length());
                        sm0Var.g0(sm0Var.Q.getSearchField());
                        return;
                    } else if (i3 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(sm0Var.getParentActivity());
                        alertDialog$Builder4.f27343a.S = org.telegram.messenger.bd.M0(2131752056, null);
                        alertDialog$Builder4.f27343a.U = org.telegram.messenger.bd.M0(2131752061, null);
                        alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131752099, null), new lm0(sm0Var, 4));
                        alertDialog$Builder4.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder4.f27343a;
                        sm0Var.showDialog(s1Var3);
                        TextView textView3 = (TextView) s1Var3.d(-1);
                        if (textView3 != null) {
                            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.f28122q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                if (peVar != null) {
                    arrayList7 = peVar.f24738e;
                }
                if (i3 >= 0 && i3 < arrayList7.size()) {
                    org.telegram.ui.ActionBar.q0 q0Var = sm0Var.Q;
                    if (q0Var != null) {
                        org.telegram.messenger.g0.v1(q0Var.getSearchField());
                    }
                    if (sm0Var.Z) {
                        sm0Var.f0(view, arrayList7.get(i3));
                        return;
                    }
                    int i26 = sm0Var.U;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 != 2) {
                            i12 = 10;
                            if (i26 != 10) {
                                i13 = sm0Var.V == null ? 4 : 0;
                            }
                        }
                        i13 = i12;
                    }
                    PhotoViewer.v1().N2(null, sm0Var, null);
                    PhotoViewer v12 = PhotoViewer.v1();
                    int i27 = sm0Var.I;
                    boolean z18 = sm0Var.J;
                    v12.h = i27;
                    v12.f41486n = z18;
                    PhotoViewer.v1().j2(arrayList7, i3, i13, sm0Var.m0, sm0Var.f49572y0, sm0Var.V);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f45763b;
                ArrayList arrayList9 = photoViewer.h7;
                if (!arrayList9.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.Q4);
                    if (obj instanceof org.telegram.messenger.se) {
                        ((org.telegram.messenger.se) obj).f25325s = photoViewer.p1();
                    }
                }
                photoViewer.f41475l5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.Q4 = -1;
                    photoViewer.E2(indexOf);
                }
                photoViewer.f41475l5 = false;
                return;
            case 23:
                fr0 fr0Var = (fr0) this.f45763b;
                boolean[] zArr2 = fr0Var.f45358x;
                if (i3 == fr0Var.f45347p0) {
                    fr0Var.k0();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.q8) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    boolean z19 = fr0Var.M;
                    org.telegram.ui.Components.ow0 ow0Var = fr0Var.R;
                    if (ow0Var != null) {
                        ow0Var.f();
                    }
                    if (fr0Var.J) {
                        int i28 = -fr0Var.P;
                        fr0Var.P = i28;
                        org.telegram.messenger.g0.G3(i28, q8Var, null);
                        org.telegram.messenger.p2.APP_ERROR.a();
                        return;
                    }
                    if (i3 == fr0Var.f45352s0) {
                        z10 = !fr0Var.H;
                        fr0Var.H = z10;
                    } else {
                        int i29 = fr0Var.f45355v0;
                        if (i3 == i29) {
                            z10 = !fr0Var.I;
                            fr0Var.I = z10;
                        } else {
                            if (i3 == fr0Var.f45357w0) {
                                z11 = !fr0Var.K;
                                fr0Var.K = z11;
                                fr0Var.w0();
                                int i30 = fr0Var.f45355v0;
                                if (i30 >= 0 && i29 < 0) {
                                    fr0Var.f45329b.i(i30);
                                } else if (i29 >= 0 && i30 < 0) {
                                    fr0Var.f45329b.s(i29);
                                }
                            } else if (i3 == fr0Var.f45353t0) {
                                boolean z20 = fr0Var.L;
                                z11 = !z20;
                                fr0Var.L = z11;
                                if (!z20 && fr0Var.M) {
                                    int i31 = fr0Var.f45342k0;
                                    fr0Var.M = false;
                                    fr0Var.w0();
                                    u4.d1 K = fr0Var.f45331c.K(fr0Var.f45354u0);
                                    if (K != null) {
                                        ((org.telegram.ui.Cells.q8) K.f55540a).setChecked(false);
                                    } else {
                                        fr0Var.f45329b.g(fr0Var.f45354u0);
                                    }
                                    fr0Var.f45329b.p(i31, 2);
                                }
                            } else if (fr0Var.O == 0) {
                                z10 = !fr0Var.M;
                                fr0Var.M = z10;
                                int i32 = fr0Var.f45342k0;
                                fr0Var.w0();
                                if (fr0Var.M) {
                                    fr0Var.f45329b.o(fr0Var.f45342k0, 2);
                                } else {
                                    fr0Var.f45329b.p(i32, 2);
                                }
                                if (fr0Var.M && fr0Var.L) {
                                    fr0Var.L = false;
                                    u4.d1 K2 = fr0Var.f45331c.K(fr0Var.f45353t0);
                                    if (K2 != null) {
                                        ((org.telegram.ui.Cells.q8) K2.f55540a).setChecked(false);
                                    } else {
                                        fr0Var.f45329b.g(fr0Var.f45353t0);
                                    }
                                }
                                if (fr0Var.M) {
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
                    if (fr0Var.N && !fr0Var.M) {
                        fr0Var.f45331c.getChildCount();
                        fr0Var.h.a();
                    }
                    for (int i34 = fr0Var.f45346o0; i34 < fr0Var.f45346o0 + fr0Var.E; i34++) {
                        u4.d1 K3 = fr0Var.f45331c.K(i34);
                        if (K3 != null) {
                            View view2 = K3.f55540a;
                            if (view2 instanceof org.telegram.ui.Cells.z5) {
                                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view2;
                                z5Var.m(fr0Var.M, true);
                                z5Var.f31051r.a(zArr2[i34 - fr0Var.f45346o0], z19);
                                if (z5Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i3 == fr0Var.f45354u0 && !fr0Var.N) {
                                    fr0Var.h.c(z5Var.getCheckBox());
                                    fr0Var.N = true;
                                }
                            }
                        }
                    }
                    q8Var.setChecked(z10);
                    fr0Var.n0();
                    return;
                } else {
                    return;
                }
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.f45763b, view, i3);
                return;
            case 25:
                ks0 ks0Var = (ks0) this.f45763b;
                PremiumPreviewFragment premiumPreviewFragment = ks0Var.f47012n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                rq0 rq0Var = ks0Var.f47010e;
                if (view.isEnabled() && (view instanceof vg.n1)) {
                    vg.n1 n1Var = (vg.n1) view;
                    premiumPreviewFragment.f41639e = arrayList10.indexOf(n1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    n1Var.c(true, true);
                    for (int i35 = 0; i35 < rq0Var.getChildCount(); i35++) {
                        View childAt = rq0Var.getChildAt(i35);
                        if (childAt instanceof vg.n1) {
                            vg.n1 n1Var2 = (vg.n1) childAt;
                            if (n1Var2.getTier() != n1Var.getTier()) {
                                n1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i36 = 0; i36 < rq0Var.getHiddenChildCount(); i36++) {
                        View V = rq0Var.V(i36);
                        if (V instanceof vg.n1) {
                            vg.n1 n1Var3 = (vg.n1) V;
                            if (n1Var3.getTier() != n1Var.getTier()) {
                                n1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < rq0Var.getCachedChildCount(); i37++) {
                        View P = rq0Var.P(i37);
                        if (P instanceof vg.n1) {
                            vg.n1 n1Var4 = (vg.n1) P;
                            if (n1Var4.getTier() != n1Var.getTier()) {
                                n1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < rq0Var.getAttachedScrapChildCount(); i38++) {
                        View O = rq0Var.O(i38);
                        if (O instanceof vg.n1) {
                            vg.n1 n1Var5 = (vg.n1) O;
                            if (n1Var5.getTier() != n1Var.getTier()) {
                                n1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((ms0Var = premiumPreviewFragment.f41641f) != null && ms0Var.f47776a.months < ((ms0) arrayList10.get(premiumPreviewFragment.f41639e)).f47776a.months && !premiumPreviewFragment.f41653q0)) {
                        z12 = true;
                    }
                    org.telegram.messenger.g0.X3(frameLayout, z12);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.c0((PrivacyControlActivity) this.f45763b, view, i3);
                return;
            case 27:
                a(i3, view);
                return;
            case 28:
                ProfileActivity.c0((ProfileActivity) this.f45763b, i3);
                return;
            default:
                ProxyListActivity.Z((ProxyListActivity) this.f45763b, view, i3);
                return;
        }
    }
}
