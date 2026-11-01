package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;
public final class g implements org.telegram.ui.Components.hk0 {
    public final int f37260a;
    public final Object f37261b;

    public g(Object obj, int i10) {
        this.f37260a = i10;
        this.f37261b = obj;
    }

    private final void a(int i10, View view) {
        zu0 zu0Var = (zu0) this.f37261b;
        int i11 = zu0Var.D;
        if (i10 == zu0Var.f44102x) {
            org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.N(zu0Var.getParentActivity(), org.telegram.messenger.dd.L0(2131747929, null), org.telegram.messenger.dd.L0(2131747930, null), org.telegram.messenger.dd.L0(2131751599, null), new xu0(zu0Var), null).f20135a;
            x1Var.show();
            x1Var.i();
        } else if (i10 == zu0Var.f44097f) {
            if (i11 == 1) {
                ?? k2Var = new org.telegram.ui.ActionBar.k2(null);
                k2Var.d = new Paint();
                k2Var.f36418f = new bv[2];
                k2Var.f36423x = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                zx zxVar = new zx(bundle);
                k2Var.f36415a = zxVar;
                zxVar.C2 = new zu(k2Var);
                zxVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                k2Var.f36416b = contactsActivity;
                contactsActivity.U = new zu(k2Var);
                contactsActivity.onFragmentCreate();
                zu0Var.presentFragment((org.telegram.ui.ActionBar.k2) k2Var);
                return;
            }
            Bundle g10 = a1.g.g("isNeverShare", true);
            if (i11 == 2) {
                g10.putInt("chatAddType", 2);
            }
            u50 u50Var = new u50(g10);
            u50Var.f41828x = new wu0(zu0Var);
            zu0Var.presentFragment(u50Var);
        } else if (i10 >= zu0Var.f44099r && i10 < zu0Var.f44100s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", zu0Var.getMessagesController().G0.keyAt(i10 - zu0Var.f44099r));
                zu0Var.presentFragment(new ProfileActivity(bundle3, null));
                return;
            }
            new Bundle();
            throw null;
        }
    }

    @Override
    public final void f(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String L0;
        String a02;
        pt ptVar;
        boolean[] zArr;
        zz zzVar;
        org.telegram.ui.Components.cc a03;
        int i11;
        int i12;
        boolean z10;
        eu0 eu0Var;
        char c10 = 3;
        mt mtVar = null;
        char c11 = 0;
        r5 = false;
        r5 = false;
        boolean z11 = false;
        switch (this.f37260a) {
            case 0:
                j jVar = (j) this.f37261b;
                ArrayList arrayList = jVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i13 = ((h) arrayList.get(i10)).d;
                    if (i13 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = jVar.d;
                        boolean z12 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z12;
                        ((org.telegram.ui.Cells.t8) view).setChecked(z12);
                        jVar.f38230c = true;
                        return;
                    } else if (i13 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = jVar.d;
                        boolean z13 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z13;
                        ((org.telegram.ui.Cells.t8) view).setChecked(z13);
                        jVar.f38230c = true;
                        return;
                    } else if (i13 == 7) {
                        if (!jVar.getUserConfig().q() && !jVar.getMessagesController().f19080a4 && !jVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(jVar.getParentActivity(), jVar.getResourceProvider());
                            org.telegram.ui.Components.p80 p80Var = obVar.f29084b;
                            p80Var.setText(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131743891, null), org.telegram.ui.ActionBar.t6.uj, 0, new qr0(jVar, 3), null));
                            p80Var.setSingleLine(false);
                            p80Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
                            obVar.f29083a.setImageResource(2131232361);
                            org.telegram.ui.Components.wb.g(jVar, obVar, 3500).j();
                            int i14 = -jVar.e;
                            jVar.e = i14;
                            org.telegram.messenger.i0.F3(i14, view, null);
                            org.telegram.messenger.t2.APP_ERROR.a();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = jVar.d;
                        boolean z14 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z14;
                        ((org.telegram.ui.Cells.t8) view).setChecked(z14);
                        jVar.f38230c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                n nVar = (n) this.f37261b;
                if (i10 >= nVar.f39657y && i10 < nVar.D && nVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) nVar.h.get(i10 - nVar.f39657y);
                    if (stickerSetCovered.set.f19821id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f19814id = stickerSetCovered.set.f19821id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.dx0 dx0Var = new org.telegram.ui.Components.dx0(nVar.getParentActivity(), nVar, inputStickerSet, null, null, null);
                    dx0Var.T1 = new l(nVar, view, stickerSetCovered);
                    nVar.showDialog(dx0Var);
                    return;
                }
                return;
            case 2:
                l01.Z((l01) this.f37261b, i10);
                return;
            case 3:
                xc xcVar = (xc) this.f37261b;
                ArrayList arrayList2 = xcVar.f43340c;
                u71 u71Var = xcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.cp cpVar = (org.telegram.ui.Components.cp) arrayList2.get(i10);
                    xcVar.a(cpVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.i0.L(24.0f) + u71Var.getPaddingLeft()) {
                        u71Var.w0(-((org.telegram.messenger.i0.L(48.0f) + u71Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (u71Var.getMeasuredWidth() - u71Var.getPaddingRight()) - org.telegram.messenger.i0.L(24.0f)) {
                        u71Var.w0(org.telegram.messenger.m5.B(48.0f, u71Var.getMeasuredWidth() - u71Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.r20 r20Var = xcVar.f43343r;
                    if (r20Var != null) {
                        r20Var.a(cpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                qp qpVar = (qp) this.f37261b;
                boolean z15 = qpVar.f40875s;
                if (qpVar.getParentActivity() != null) {
                    s4.g0 adapter = qpVar.f40870b.getAdapter();
                    pp ppVar = qpVar.e;
                    if (adapter == ppVar) {
                        chat = (TLRPC.Chat) ppVar.d.get(i10);
                    } else {
                        int i15 = qpVar.G;
                        if (i10 >= i15 && i10 < qpVar.H) {
                            chat = (TLRPC.Chat) qpVar.f40876w.get(i10 - i15);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z15 && qpVar.h.linked_chat_id == 0) {
                            qpVar.f0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f19794id);
                        qpVar.presentFragment(new un(bundle));
                        return;
                    } else if (i10 == qpVar.F) {
                        if (z15 && qpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{qpVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = qpVar.f40872f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.dd.a0("GroupCreateDiscussionDefaultName", null, 2131749463, chat2.title));
                            }
                            b60 b60Var = new b60(bundle2);
                            b60Var.Y = new hp(qpVar);
                            qpVar.presentFragment(b60Var);
                            return;
                        } else if (!qpVar.f40876w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) qpVar.f40876w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qpVar.getParentActivity());
                            if (z15) {
                                L0 = org.telegram.messenger.dd.L0(2131751372, null);
                                a02 = org.telegram.messenger.dd.a0("DiscussionUnlinkChannelAlert", null, 2131751373, chat3.title);
                            } else {
                                L0 = org.telegram.messenger.dd.L0(2131751374, null);
                                a02 = org.telegram.messenger.dd.a0("DiscussionUnlinkGroupAlert", null, 2131751371, chat3.title);
                            }
                            alertDialog$Builder.f20135a.R = L0;
                            alertDialog$Builder.f20135a.T = org.telegram.messenger.i0.W2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751375, null), new y0(qpVar, 24));
                            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                            qpVar.showDialog(x1Var);
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
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
                xp xpVar = (xp) this.f37261b;
                ArrayList arrayList3 = xpVar.f43437n;
                if (i10 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - 3);
                    boolean contains = xpVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        xpVar.d.add(tL_availableReaction.reaction);
                    } else {
                        xpVar.d.remove(tL_availableReaction.reaction);
                        if (xpVar.d.isEmpty()) {
                            wp wpVar = xpVar.h;
                            if (wpVar != null) {
                                wpVar.p(2, arrayList3.size() + 1);
                            }
                            xpVar.a0(2, true);
                        }
                    }
                    Switch r22 = xVar.f23451c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.ep epVar = xVar.d;
                    if (epVar != null) {
                        epVar.a(z16, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ft ftVar = (ft) this.f37261b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((jt) view).d;
                kt ktVar = ftVar.f37231a;
                sg.b0 reactionsWindow = ktVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f48299q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ix0.c(null, ktVar.f38978c0, ktVar.f38999z.getContext(), new z4(ftVar, 9));
                    return;
                }
                ht htVar = ktVar.f38986l;
                if (htVar != null) {
                    htVar.u(stickerSetCovered2.set, TextUtils.join("", ktVar.f38989o));
                }
                ktVar.o();
                return;
            case 7:
                qt qtVar = (qt) this.f37261b;
                if (qtVar.f40895f && qtVar.e) {
                    org.telegram.ui.Components.pj pjVar = qtVar.d;
                    ArrayList arrayList4 = pjVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        mtVar = (mt) pjVar.e.get(i10);
                    }
                } else {
                    int S = qtVar.f40894c.S(i10);
                    int Q = qtVar.f40894c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        mtVar = qtVar.f40894c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    qtVar.finishFragment();
                    if (mtVar != null && (ptVar = qtVar.f40897r) != null) {
                        ptVar.c(mtVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                iu iuVar = (iu) this.f37261b;
                ArrayList arrayList5 = iuVar.f38177j3;
                lu luVar = iuVar.f38189v3;
                if ((view instanceof cu) && i10 >= 0 && i10 < arrayList5.size()) {
                    eu euVar = (eu) arrayList5.get(i10);
                    if (euVar != null) {
                        int i16 = euVar.h;
                        if (i16 >= 0) {
                            iuVar.f38183p3[i16] = !zArr[i16];
                            iuVar.D1(true);
                            return;
                        } else if (i16 == -2) {
                            luVar.presentFragment(new DataAutoDownloadActivity(iuVar.f38173f3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.p8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(luVar.getParentActivity());
                    alertDialog$Builder2.f20135a.R = org.telegram.messenger.dd.L0(2131746106, null);
                    alertDialog$Builder2.f20135a.T = org.telegram.messenger.dd.L0(2131746107, null);
                    alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131746135, null), new fu(iuVar));
                    alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20135a;
                    luVar.showDialog(x1Var2);
                    TextView textView2 = (TextView) x1Var2.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21171q7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                hz.a0((hz) this.f37261b, view, i10);
                return;
            case 10:
                h00 h00Var = (h00) this.f37261b;
                if (h00Var.getParentActivity() != null && (zzVar = (zz) h00Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = zzVar.f44256c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i17 = zzVar.f7681a;
                    if (i17 == 1) {
                        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                        h00Var.B0(zzVar, paVar.getName(), paVar.getCurrentObject(), zzVar.f44258g);
                        return;
                    } else if (i17 == 7) {
                        org.telegram.ui.Components.voip.u uVar = new org.telegram.ui.Components.voip.u(15, h00Var, zzVar);
                        if (h00Var.f37603c.f20547x.f7022f) {
                            h00Var.y0(uVar, false);
                            return;
                        } else {
                            uVar.run();
                            return;
                        }
                    } else if (i17 == 8 || (i17 == 4 && zzVar.f44261k == 2131232030)) {
                        org.telegram.messenger.bp bpVar = h00Var.f37606r;
                        org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.APP_ERROR;
                        if (h00Var.f37607s && h00Var.f37603c.f20547x.f7022f) {
                            float f7 = -h00Var.Q;
                            h00Var.Q = f7;
                            org.telegram.messenger.i0.F3(f7, view, null);
                            t2Var.a();
                            h00Var.f37608w = true;
                            ij ijVar = h00Var.R;
                            if (ijVar == null || ijVar.getVisibility() != 0) {
                                ij ijVar2 = new ij(6, 2, h00Var.getParentActivity(), null, true);
                                h00Var.R = ijVar2;
                                ijVar2.f29617a.setMaxWidth(org.telegram.messenger.i0.f16172q.x);
                                h00Var.R.setExtraTranslationY(org.telegram.messenger.i0.L(-16.0f));
                                h00Var.R.setText(org.telegram.messenger.dd.L0(2131750776, null));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(3.0f);
                                h00Var.getParentLayout().getOverlayContainerView().addView(h00Var.R, marginLayoutParams);
                                h00Var.R.f(h00Var.f37603c, true);
                                return;
                            }
                            return;
                        }
                        if (!TextUtils.isEmpty(h00Var.f37609x) || !TextUtils.isEmpty(bpVar.f15001b)) {
                            int i18 = h00Var.D;
                            int i19 = org.telegram.messenger.wp.D8;
                            if ((i18 & (-1537)) == 0 && h00Var.G.isEmpty() && !h00Var.F.isEmpty()) {
                                h00Var.y0(new lz(h00Var, 1), false);
                                return;
                            }
                        }
                        float f10 = -h00Var.Q;
                        h00Var.Q = f10;
                        org.telegram.messenger.i0.F3(f10, view, null);
                        t2Var.a();
                        if (TextUtils.isEmpty(h00Var.f37609x) && TextUtils.isEmpty(bpVar.f15001b)) {
                            a03 = org.telegram.ui.Components.cc.a0(h00Var);
                            i11 = 2131750763;
                        } else {
                            int i20 = h00Var.D;
                            int i21 = org.telegram.messenger.wp.D8;
                            if ((i20 & (-1537)) != 0) {
                                if (!h00Var.G.isEmpty()) {
                                    a03 = org.telegram.ui.Components.cc.a0(h00Var);
                                    i11 = 2131750760;
                                } else {
                                    a03 = org.telegram.ui.Components.cc.a0(h00Var);
                                    i11 = 2131750761;
                                }
                            } else if (h00Var.F.isEmpty()) {
                                a03 = org.telegram.ui.Components.cc.a0(h00Var);
                                i11 = 2131750764;
                            } else {
                                a03 = org.telegram.ui.Components.cc.a0(h00Var);
                                i11 = 2131750762;
                            }
                        }
                        org.telegram.messenger.m5.o(null, i11, a03, null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                vz vzVar = (vz) this.f37261b;
                ArrayList arrayList6 = vzVar.W1;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    zz zzVar2 = (zz) arrayList6.get(i22);
                    int i23 = zzVar2.f7681a;
                    if (i23 == 7) {
                        vzVar.dismiss();
                        vzVar.f26727o1.presentFragment(new hz(vzVar.Q1, zzVar2.f44263m));
                        return;
                    } else if (i23 == 8) {
                        vzVar.d1();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                y00 y00Var = (y00) this.f37261b;
                if (view instanceof org.telegram.ui.Cells.l7) {
                    y00Var.f(i10, view, ((org.telegram.ui.Cells.l7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.o7) {
                    y00Var.f(i10, view, ((org.telegram.ui.Cells.o7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    y00Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    y00Var.f(i10, view, ((org.telegram.ui.Cells.h2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v2) {
                    y00Var.f(i10, view, ((org.telegram.ui.Cells.v2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                d60 d60Var = (d60) this.f37261b;
                if (d60Var.getParentActivity() != null) {
                    if (i10 != d60Var.f36501n && i10 != 0) {
                        if (i10 == d60Var.f36503s) {
                            if (d60Var.f36500f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", d60Var.f36500f.link);
                                    d60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131749120, null)), 500);
                                    return;
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == d60Var.f36502r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(d60Var.getParentActivity());
                            alertDialog$Builder3.f20135a.T = org.telegram.messenger.dd.L0(2131746043, null);
                            alertDialog$Builder3.f20135a.R = org.telegram.messenger.dd.L0(2131746040, null);
                            alertDialog$Builder3.k(org.telegram.messenger.dd.L0(2131746041, null), new st(d60Var, 13));
                            alertDialog$Builder3.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                            d60Var.showDialog(alertDialog$Builder3.f20135a);
                            return;
                        } else {
                            return;
                        }
                    } else if (d60Var.f36500f != null) {
                        try {
                            ((ClipboardManager) org.telegram.messenger.w0.f18945b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", d60Var.f36500f.link));
                            org.telegram.ui.Components.cc.j(d60Var).j();
                            return;
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                j60.Z((j60) this.f37261b, view, i10);
                return;
            case 15:
                x60.Z((x60) this.f37261b, view, i10);
                return;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.f37261b, view, i10);
                return;
            case 17:
                ((ih0) this.f37261b).onBackPressed();
                return;
            case 18:
                qh0 qh0Var = (qh0) this.f37261b;
                int i24 = qh0Var.I;
                if (i10 >= i24 && i10 < qh0Var.J) {
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) qh0Var.f40794y.get(i10 - i24);
                    if (kjVar.x4()) {
                        if (!qh0Var.g0(kjVar)) {
                            qh0Var.getOrCreateStoryViewer().U(qh0Var.getParentActivity(), kjVar.f16694l, th.n5.a(qh0Var.f40788f));
                            return;
                        }
                        return;
                    }
                    long B0 = org.telegram.messenger.kj.B0(kjVar.f16690k);
                    Bundle bundle3 = new Bundle();
                    if (org.telegram.messenger.o5.E(B0)) {
                        bundle3.putLong("user_id", B0);
                    } else {
                        bundle3.putLong("chat_id", -B0);
                    }
                    bundle3.putInt("message_id", kjVar.f1());
                    bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                    if (qh0Var.getMessagesController().E(bundle3, qh0Var, null, null)) {
                        qh0Var.presentFragment(new un(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.f37261b, view, i10);
                return;
            case 20:
                qn0 qn0Var = (qn0) this.f37261b;
                qn0Var.a(i10, true);
                dn0 dn0Var = qn0Var.h;
                if (dn0Var != null) {
                    dn0Var.a(Integer.valueOf(i10));
                    return;
                }
                return;
            case 21:
                jo0 jo0Var = (jo0) this.f37261b;
                ArrayList arrayList7 = jo0Var.f38490f;
                ArrayList arrayList8 = jo0Var.f38498n;
                org.telegram.messenger.xe xeVar = jo0Var.J;
                if (xeVar == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        ko0 ko0Var = jo0Var.f38507t0;
                        if (ko0Var != null) {
                            switch (ko0Var.f38949a) {
                                case 1:
                                    mo0.m0(ko0Var.f38950b, str);
                                    return;
                                default:
                                    mo0.m0(ko0Var.f38950b, str);
                                    return;
                            }
                        }
                        jo0Var.P.getSearchField().setText(str);
                        jo0Var.P.getSearchField().setSelection(str.length());
                        jo0Var.g0(jo0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(jo0Var.getParentActivity());
                        alertDialog$Builder4.f20135a.R = org.telegram.messenger.dd.L0(2131752056, null);
                        alertDialog$Builder4.f20135a.T = org.telegram.messenger.dd.L0(2131752061, null);
                        alertDialog$Builder4.k(org.telegram.messenger.dd.L0(2131752099, null), new ao0(jo0Var, 4));
                        alertDialog$Builder4.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder4.f20135a;
                        jo0Var.showDialog(x1Var3);
                        TextView textView3 = (TextView) x1Var3.d(-1);
                        if (textView3 != null) {
                            org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.f21171q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                if (xeVar != null) {
                    arrayList7 = xeVar.e;
                }
                if (i10 >= 0 && i10 < arrayList7.size()) {
                    org.telegram.ui.ActionBar.t0 t0Var = jo0Var.P;
                    if (t0Var != null) {
                        org.telegram.messenger.i0.v1(t0Var.getSearchField());
                    }
                    if (jo0Var.Y) {
                        jo0Var.f0(view, arrayList7.get(i10));
                        return;
                    }
                    int i25 = jo0Var.T;
                    if (i25 != 1 && i25 != 3) {
                        if (i25 != 2) {
                            c10 = '\n';
                            if (i25 != 10) {
                                if (jo0Var.U == null) {
                                    c11 = 4;
                                }
                            }
                        }
                        c11 = c10;
                    } else {
                        c11 = 1;
                    }
                    PhotoViewer.v1().N2(null, jo0Var, null);
                    PhotoViewer v12 = PhotoViewer.v1();
                    int i26 = jo0Var.H;
                    boolean z17 = jo0Var.I;
                    v12.h = i26;
                    v12.f33554n = z17;
                    PhotoViewer.v1().j2(arrayList7, i10, c11, jo0Var.f38497l0, jo0Var.f38513x0, jo0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f37261b;
                ArrayList arrayList9 = photoViewer.f33501g7;
                if (!arrayList9.isEmpty() && (i12 = photoViewer.P4) >= 0 && i12 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof org.telegram.messenger.af) {
                        ((org.telegram.messenger.af) obj).f14617s = photoViewer.p1();
                    }
                }
                photoViewer.f33535k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.E2(indexOf);
                }
                photoViewer.f33535k5 = false;
                return;
            case 23:
                zs0 zs0Var = (zs0) this.f37261b;
                boolean[] zArr2 = zs0Var.f44082x;
                if (i10 == zs0Var.f44070o0) {
                    zs0Var.k0();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.t8) {
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    boolean z18 = zs0Var.L;
                    org.telegram.ui.Components.tx0 tx0Var = zs0Var.Q;
                    if (tx0Var != null) {
                        tx0Var.f();
                    }
                    if (zs0Var.I) {
                        int i27 = -zs0Var.O;
                        zs0Var.O = i27;
                        org.telegram.messenger.i0.F3(i27, t8Var, null);
                        org.telegram.messenger.t2.APP_ERROR.a();
                        return;
                    }
                    if (i10 == zs0Var.f44074r0) {
                        z10 = !zs0Var.G;
                        zs0Var.G = z10;
                    } else {
                        int i28 = zs0Var.f44078u0;
                        if (i10 == i28) {
                            z10 = !zs0Var.H;
                            zs0Var.H = z10;
                        } else if (i10 == zs0Var.f44079v0) {
                            z10 = !zs0Var.J;
                            zs0Var.J = z10;
                            zs0Var.w0();
                            int i29 = zs0Var.f44078u0;
                            if (i29 >= 0 && i28 < 0) {
                                zs0Var.f44054b.i(i29);
                            } else if (i28 >= 0 && i29 < 0) {
                                zs0Var.f44054b.s(i28);
                            }
                        } else if (i10 == zs0Var.f44076s0) {
                            boolean z19 = zs0Var.K;
                            boolean z20 = !z19;
                            zs0Var.K = z20;
                            if (!z19 && zs0Var.L) {
                                int i30 = zs0Var.f44065j0;
                                zs0Var.L = false;
                                zs0Var.w0();
                                s4.c1 K = zs0Var.f44056c.K(zs0Var.f44077t0);
                                if (K != null) {
                                    ((org.telegram.ui.Cells.t8) K.f47909a).setChecked(false);
                                } else {
                                    zs0Var.f44054b.g(zs0Var.f44077t0);
                                }
                                zs0Var.f44054b.p(i30, 2);
                            }
                            z10 = z20;
                        } else if (zs0Var.N == 0) {
                            boolean z21 = !zs0Var.L;
                            zs0Var.L = z21;
                            int i31 = zs0Var.f44065j0;
                            zs0Var.w0();
                            if (zs0Var.L) {
                                zs0Var.f44054b.o(zs0Var.f44065j0, 2);
                            } else {
                                zs0Var.f44054b.p(i31, 2);
                            }
                            if (zs0Var.L && zs0Var.K) {
                                zs0Var.K = false;
                                s4.c1 K2 = zs0Var.f44056c.K(zs0Var.f44076s0);
                                if (K2 != null) {
                                    ((org.telegram.ui.Cells.t8) K2.f47909a).setChecked(false);
                                } else {
                                    zs0Var.f44054b.g(zs0Var.f44076s0);
                                }
                            }
                            if (zs0Var.L) {
                                int i32 = 0;
                                boolean z22 = false;
                                while (i32 < zArr2.length) {
                                    if (z22) {
                                        zArr2[i32] = false;
                                    } else if (zArr2[i32]) {
                                        z22 = true;
                                    }
                                    i32++;
                                    z22 = z22;
                                }
                            }
                            z10 = z21;
                        } else {
                            return;
                        }
                    }
                    if (zs0Var.M && !zs0Var.L) {
                        zs0Var.f44056c.getChildCount();
                        zs0Var.h.b(true);
                    }
                    for (int i33 = zs0Var.f44069n0; i33 < zs0Var.f44069n0 + zs0Var.D; i33++) {
                        s4.c1 K3 = zs0Var.f44056c.K(i33);
                        if (K3 != null) {
                            View view2 = K3.f47909a;
                            if (view2 instanceof org.telegram.ui.Cells.e6) {
                                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view2;
                                e6Var.m(zs0Var.L, true);
                                e6Var.f21864r.a(zArr2[i33 - zs0Var.f44069n0], z18);
                                if (e6Var.getTop() > org.telegram.messenger.i0.L(40.0f) && i10 == zs0Var.f44077t0 && !zs0Var.M) {
                                    zs0Var.h.f(e6Var.getCheckBox(), true);
                                    zs0Var.M = true;
                                }
                            }
                        }
                    }
                    t8Var.setChecked(z10);
                    zs0Var.n0();
                    return;
                } else {
                    return;
                }
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.f37261b, view, i10);
                return;
            case 25:
                cu0 cu0Var = (cu0) this.f37261b;
                PremiumPreviewFragment premiumPreviewFragment = cu0Var.f36413n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                ks0 ks0Var = cu0Var.e;
                if (view.isEnabled() && (view instanceof kg.a2)) {
                    kg.a2 a2Var = (kg.a2) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(a2Var.getTier());
                    premiumPreviewFragment.y0(true);
                    a2Var.c(true, true);
                    for (int i34 = 0; i34 < ks0Var.getChildCount(); i34++) {
                        View childAt = ks0Var.getChildAt(i34);
                        if (childAt instanceof kg.a2) {
                            kg.a2 a2Var2 = (kg.a2) childAt;
                            if (a2Var2.getTier() != a2Var.getTier()) {
                                a2Var2.c(false, true);
                            }
                        }
                    }
                    for (int i35 = 0; i35 < ks0Var.getHiddenChildCount(); i35++) {
                        View V = ks0Var.V(i35);
                        if (V instanceof kg.a2) {
                            kg.a2 a2Var3 = (kg.a2) V;
                            if (a2Var3.getTier() != a2Var.getTier()) {
                                a2Var3.c(false, true);
                            }
                        }
                    }
                    for (int i36 = 0; i36 < ks0Var.getCachedChildCount(); i36++) {
                        View P = ks0Var.P(i36);
                        if (P instanceof kg.a2) {
                            kg.a2 a2Var4 = (kg.a2) P;
                            if (a2Var4.getTier() != a2Var.getTier()) {
                                a2Var4.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < ks0Var.getAttachedScrapChildCount(); i37++) {
                        View O = ks0Var.O(i37);
                        if (O instanceof kg.a2) {
                            kg.a2 a2Var5 = (kg.a2) O;
                            if (a2Var5.getTier() != a2Var.getTier()) {
                                a2Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.J;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((eu0Var = premiumPreviewFragment.f33704f) != null && eu0Var.f36910a.months < ((eu0) arrayList10.get(premiumPreviewFragment.e)).f36910a.months && !premiumPreviewFragment.f33715p0)) {
                        z11 = true;
                    }
                    org.telegram.messenger.i0.W3(frameLayout, z11);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.c0((PrivacyControlActivity) this.f37261b, view, i10);
                return;
            case 27:
                a(i10, view);
                return;
            case 28:
                ProfileActivity.c0((ProfileActivity) this.f37261b, i10);
                return;
            default:
                ProxyListActivity.Z((ProxyListActivity) this.f37261b, view, i10);
                return;
        }
    }
}
