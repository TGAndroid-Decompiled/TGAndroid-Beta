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
public final class g implements org.telegram.ui.Components.gk0 {
    public final int f37369a;
    public final Object f37370b;

    public g(Object obj, int i10) {
        this.f37369a = i10;
        this.f37370b = obj;
    }

    private final void a(int i10, View view) {
        av0 av0Var = (av0) this.f37370b;
        int i11 = av0Var.D;
        if (i10 == av0Var.f35759x) {
            org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.N(av0Var.getParentActivity(), org.telegram.messenger.cd.L0(2131747929, null), org.telegram.messenger.cd.L0(2131747930, null), org.telegram.messenger.cd.L0(2131751599, null), new yu0(av0Var), null).f20134a;
            x1Var.show();
            x1Var.i();
        } else if (i10 == av0Var.f35754f) {
            if (i11 == 1) {
                ?? k2Var = new org.telegram.ui.ActionBar.k2(null);
                k2Var.d = new Paint();
                k2Var.f36841f = new cv[2];
                k2Var.f36846x = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                ay ayVar = new ay(bundle);
                k2Var.f36838a = ayVar;
                ayVar.C2 = new av(k2Var);
                ayVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                k2Var.f36839b = contactsActivity;
                contactsActivity.U = new av(k2Var);
                contactsActivity.onFragmentCreate();
                av0Var.presentFragment((org.telegram.ui.ActionBar.k2) k2Var);
                return;
            }
            Bundle g10 = a1.g.g("isNeverShare", true);
            if (i11 == 2) {
                g10.putInt("chatAddType", 2);
            }
            v50 v50Var = new v50(g10);
            v50Var.f42633x = new xu0(av0Var);
            av0Var.presentFragment(v50Var);
        } else if (i10 >= av0Var.f35756r && i10 < av0Var.f35757s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", av0Var.getMessagesController().G0.keyAt(i10 - av0Var.f35756r));
                av0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        qt qtVar;
        boolean[] zArr;
        a00 a00Var;
        org.telegram.ui.Components.cc a03;
        int i11;
        int i12;
        boolean z10;
        fu0 fu0Var;
        char c10 = 3;
        nt ntVar = null;
        char c11 = 0;
        r5 = false;
        r5 = false;
        boolean z11 = false;
        switch (this.f37369a) {
            case 0:
                j jVar = (j) this.f37370b;
                ArrayList arrayList = jVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i13 = ((h) arrayList.get(i10)).d;
                    if (i13 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = jVar.d;
                        boolean z12 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z12;
                        ((org.telegram.ui.Cells.t8) view).setChecked(z12);
                        jVar.f38391c = true;
                        return;
                    } else if (i13 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = jVar.d;
                        boolean z13 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z13;
                        ((org.telegram.ui.Cells.t8) view).setChecked(z13);
                        jVar.f38391c = true;
                        return;
                    } else if (i13 == 7) {
                        if (!jVar.getUserConfig().q() && !jVar.getMessagesController().f18737a4 && !jVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(jVar.getParentActivity(), jVar.getResourceProvider());
                            org.telegram.ui.Components.p80 p80Var = obVar.f29023b;
                            p80Var.setText(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131743891, null), org.telegram.ui.ActionBar.t6.uj, 0, new rr0(jVar, 3), null));
                            p80Var.setSingleLine(false);
                            p80Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
                            obVar.f29022a.setImageResource(2131232361);
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
                        jVar.f38391c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                n nVar = (n) this.f37370b;
                if (i10 >= nVar.f39807y && i10 < nVar.D && nVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) nVar.h.get(i10 - nVar.f39807y);
                    if (stickerSetCovered.set.f19820id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f19813id = stickerSetCovered.set.f19820id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.cx0 cx0Var = new org.telegram.ui.Components.cx0(nVar.getParentActivity(), nVar, inputStickerSet, null, null, null);
                    cx0Var.T1 = new l(nVar, view, stickerSetCovered);
                    nVar.showDialog(cx0Var);
                    return;
                }
                return;
            case 2:
                l01.Y((l01) this.f37370b, i10);
                return;
            case 3:
                xc xcVar = (xc) this.f37370b;
                ArrayList arrayList2 = xcVar.f43537c;
                w71 w71Var = xcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.cp cpVar = (org.telegram.ui.Components.cp) arrayList2.get(i10);
                    xcVar.a(cpVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.i0.L(24.0f) + w71Var.getPaddingLeft()) {
                        w71Var.w0(-((org.telegram.messenger.i0.L(48.0f) + w71Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (w71Var.getMeasuredWidth() - w71Var.getPaddingRight()) - org.telegram.messenger.i0.L(24.0f)) {
                        w71Var.w0(org.telegram.messenger.m5.B(48.0f, w71Var.getMeasuredWidth() - w71Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.q20 q20Var = xcVar.f43540r;
                    if (q20Var != null) {
                        q20Var.a(cpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                qp qpVar = (qp) this.f37370b;
                boolean z15 = qpVar.f41026s;
                if (qpVar.getParentActivity() != null) {
                    s4.g0 adapter = qpVar.f41021b.getAdapter();
                    pp ppVar = qpVar.e;
                    if (adapter == ppVar) {
                        chat = (TLRPC.Chat) ppVar.d.get(i10);
                    } else {
                        int i15 = qpVar.G;
                        if (i10 >= i15 && i10 < qpVar.H) {
                            chat = (TLRPC.Chat) qpVar.f41027w.get(i10 - i15);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z15 && qpVar.h.linked_chat_id == 0) {
                            qpVar.e0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f19793id);
                        qpVar.presentFragment(new un(bundle));
                        return;
                    } else if (i10 == qpVar.F) {
                        if (z15 && qpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{qpVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = qpVar.f41023f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.cd.a0("GroupCreateDiscussionDefaultName", null, 2131749463, chat2.title));
                            }
                            c60 c60Var = new c60(bundle2);
                            c60Var.Y = new hp(qpVar);
                            qpVar.presentFragment(c60Var);
                            return;
                        } else if (!qpVar.f41027w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) qpVar.f41027w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qpVar.getParentActivity());
                            if (z15) {
                                L0 = org.telegram.messenger.cd.L0(2131751372, null);
                                a02 = org.telegram.messenger.cd.a0("DiscussionUnlinkChannelAlert", null, 2131751373, chat3.title);
                            } else {
                                L0 = org.telegram.messenger.cd.L0(2131751374, null);
                                a02 = org.telegram.messenger.cd.a0("DiscussionUnlinkGroupAlert", null, 2131751371, chat3.title);
                            }
                            alertDialog$Builder.f20134a.R = L0;
                            alertDialog$Builder.f20134a.T = org.telegram.messenger.i0.W2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751375, null), new y0(qpVar, 24));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                            qpVar.showDialog(x1Var);
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
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
                xp xpVar = (xp) this.f37370b;
                ArrayList arrayList3 = xpVar.f43618n;
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
                            xpVar.Z(2, true);
                        }
                    }
                    Switch r22 = xVar.f23450c;
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
                gt gtVar = (gt) this.f37370b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((kt) view).d;
                lt ltVar = gtVar.f37643a;
                sg.b0 reactionsWindow = ltVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f48288q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.hx0.c(null, ltVar.f39388c0, ltVar.f39409z.getContext(), new z4(gtVar, 9));
                    return;
                }
                jt jtVar = ltVar.f39396l;
                if (jtVar != null) {
                    jtVar.u(stickerSetCovered2.set, TextUtils.join("", ltVar.f39399o));
                }
                ltVar.o();
                return;
            case 7:
                rt rtVar = (rt) this.f37370b;
                if (rtVar.f41283f && rtVar.e) {
                    org.telegram.ui.Components.pj pjVar = rtVar.d;
                    ArrayList arrayList4 = pjVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        ntVar = (nt) pjVar.e.get(i10);
                    }
                } else {
                    int S = rtVar.f41282c.S(i10);
                    int Q = rtVar.f41282c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        ntVar = rtVar.f41282c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    rtVar.finishFragment();
                    if (ntVar != null && (qtVar = rtVar.f41285r) != null) {
                        qtVar.c(ntVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ju juVar = (ju) this.f37370b;
                ArrayList arrayList5 = juVar.f38594j3;
                mu muVar = juVar.f38606v3;
                if ((view instanceof du) && i10 >= 0 && i10 < arrayList5.size()) {
                    fu fuVar = (fu) arrayList5.get(i10);
                    if (fuVar != null) {
                        int i16 = fuVar.h;
                        if (i16 >= 0) {
                            juVar.f38600p3[i16] = !zArr[i16];
                            juVar.D1(true);
                            return;
                        } else if (i16 == -2) {
                            muVar.presentFragment(new DataAutoDownloadActivity(juVar.f38590f3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.p8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(muVar.getParentActivity());
                    alertDialog$Builder2.f20134a.R = org.telegram.messenger.cd.L0(2131746106, null);
                    alertDialog$Builder2.f20134a.T = org.telegram.messenger.cd.L0(2131746107, null);
                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131746135, null), new gu(juVar));
                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                    muVar.showDialog(x1Var2);
                    TextView textView2 = (TextView) x1Var2.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21170q7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                iz.Z((iz) this.f37370b, view, i10);
                return;
            case 10:
                i00 i00Var = (i00) this.f37370b;
                if (i00Var.getParentActivity() != null && (a00Var = (a00) i00Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = a00Var.f35495c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i17 = a00Var.f7680a;
                    if (i17 == 1) {
                        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                        i00Var.A0(a00Var, paVar.getName(), paVar.getCurrentObject(), a00Var.f35497g);
                        return;
                    } else if (i17 == 7) {
                        xs xsVar = new xs(14, i00Var, a00Var);
                        if (i00Var.f38068c.f20546x.f7021f) {
                            i00Var.x0(xsVar, false);
                            return;
                        } else {
                            xsVar.run();
                            return;
                        }
                    } else if (i17 == 8 || (i17 == 4 && a00Var.f35500k == 2131232030)) {
                        org.telegram.messenger.ap apVar = i00Var.f38071r;
                        org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.APP_ERROR;
                        if (i00Var.f38072s && i00Var.f38068c.f20546x.f7021f) {
                            float f7 = -i00Var.Q;
                            i00Var.Q = f7;
                            org.telegram.messenger.i0.F3(f7, view, null);
                            t2Var.a();
                            i00Var.f38073w = true;
                            ij ijVar = i00Var.R;
                            if (ijVar == null || ijVar.getVisibility() != 0) {
                                ij ijVar2 = new ij(6, 2, i00Var.getParentActivity(), null, true);
                                i00Var.R = ijVar2;
                                ijVar2.f29518a.setMaxWidth(org.telegram.messenger.i0.f16026q.x);
                                i00Var.R.setExtraTranslationY(org.telegram.messenger.i0.L(-16.0f));
                                i00Var.R.setText(org.telegram.messenger.cd.L0(2131750776, null));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(3.0f);
                                i00Var.getParentLayout().getOverlayContainerView().addView(i00Var.R, marginLayoutParams);
                                i00Var.R.f(i00Var.f38068c, true);
                                return;
                            }
                            return;
                        }
                        if (!TextUtils.isEmpty(i00Var.f38074x) || !TextUtils.isEmpty(apVar.f14646b)) {
                            int i18 = i00Var.D;
                            int i19 = org.telegram.messenger.vp.D8;
                            if ((i18 & (-1537)) == 0 && i00Var.G.isEmpty() && !i00Var.F.isEmpty()) {
                                i00Var.x0(new mz(i00Var, 1), false);
                                return;
                            }
                        }
                        float f10 = -i00Var.Q;
                        i00Var.Q = f10;
                        org.telegram.messenger.i0.F3(f10, view, null);
                        t2Var.a();
                        if (TextUtils.isEmpty(i00Var.f38074x) && TextUtils.isEmpty(apVar.f14646b)) {
                            a03 = org.telegram.ui.Components.cc.a0(i00Var);
                            i11 = 2131750763;
                        } else {
                            int i20 = i00Var.D;
                            int i21 = org.telegram.messenger.vp.D8;
                            if ((i20 & (-1537)) != 0) {
                                if (!i00Var.G.isEmpty()) {
                                    a03 = org.telegram.ui.Components.cc.a0(i00Var);
                                    i11 = 2131750760;
                                } else {
                                    a03 = org.telegram.ui.Components.cc.a0(i00Var);
                                    i11 = 2131750761;
                                }
                            } else if (i00Var.F.isEmpty()) {
                                a03 = org.telegram.ui.Components.cc.a0(i00Var);
                                i11 = 2131750764;
                            } else {
                                a03 = org.telegram.ui.Components.cc.a0(i00Var);
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
                wz wzVar = (wz) this.f37370b;
                ArrayList arrayList6 = wzVar.W1;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    a00 a00Var2 = (a00) arrayList6.get(i22);
                    int i23 = a00Var2.f7680a;
                    if (i23 == 7) {
                        wzVar.dismiss();
                        wzVar.f26669o1.presentFragment(new iz(wzVar.Q1, a00Var2.f35502m));
                        return;
                    } else if (i23 == 8) {
                        wzVar.d1();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                z00 z00Var = (z00) this.f37370b;
                if (view instanceof org.telegram.ui.Cells.l7) {
                    z00Var.f(i10, view, ((org.telegram.ui.Cells.l7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.o7) {
                    z00Var.f(i10, view, ((org.telegram.ui.Cells.o7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    z00Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    z00Var.f(i10, view, ((org.telegram.ui.Cells.h2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v2) {
                    z00Var.f(i10, view, ((org.telegram.ui.Cells.v2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                e60 e60Var = (e60) this.f37370b;
                if (e60Var.getParentActivity() != null) {
                    if (i10 != e60Var.f36954n && i10 != 0) {
                        if (i10 == e60Var.f36956s) {
                            if (e60Var.f36953f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", e60Var.f36953f.link);
                                    e60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131749120, null)), 500);
                                    return;
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == e60Var.f36955r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(e60Var.getParentActivity());
                            alertDialog$Builder3.f20134a.T = org.telegram.messenger.cd.L0(2131746043, null);
                            alertDialog$Builder3.f20134a.R = org.telegram.messenger.cd.L0(2131746040, null);
                            alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131746041, null), new tt(e60Var, 13));
                            alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            e60Var.showDialog(alertDialog$Builder3.f20134a);
                            return;
                        } else {
                            return;
                        }
                    } else if (e60Var.f36953f != null) {
                        try {
                            ((ClipboardManager) org.telegram.messenger.w0.f19025b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", e60Var.f36953f.link));
                            org.telegram.ui.Components.cc.j(e60Var).j();
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
                k60.Y((k60) this.f37370b, view, i10);
                return;
            case 15:
                y60.Y((y60) this.f37370b, view, i10);
                return;
            case 16:
                LanguageSelectActivity.Y((LanguageSelectActivity) this.f37370b, view, i10);
                return;
            case 17:
                ((kh0) this.f37370b).onBackPressed();
                return;
            case 18:
                sh0 sh0Var = (sh0) this.f37370b;
                int i24 = sh0Var.I;
                if (i10 >= i24 && i10 < sh0Var.J) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) sh0Var.f41526y.get(i10 - i24);
                    if (jjVar.x4()) {
                        if (!sh0Var.f0(jjVar)) {
                            sh0Var.getOrCreateStoryViewer().U(sh0Var.getParentActivity(), jjVar.f16341l, th.n5.a(sh0Var.f41520f));
                            return;
                        }
                        return;
                    }
                    long B0 = org.telegram.messenger.jj.B0(jjVar.f16337k);
                    Bundle bundle3 = new Bundle();
                    if (org.telegram.messenger.o5.E(B0)) {
                        bundle3.putLong("user_id", B0);
                    } else {
                        bundle3.putLong("chat_id", -B0);
                    }
                    bundle3.putInt("message_id", jjVar.f1());
                    bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                    if (sh0Var.getMessagesController().E(bundle3, sh0Var, null, null)) {
                        sh0Var.presentFragment(new un(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.Z((PasscodeActivity) this.f37370b, view, i10);
                return;
            case 20:
                sn0 sn0Var = (sn0) this.f37370b;
                sn0Var.a(i10, true);
                fn0 fn0Var = sn0Var.h;
                if (fn0Var != null) {
                    fn0Var.a(Integer.valueOf(i10));
                    return;
                }
                return;
            case 21:
                lo0 lo0Var = (lo0) this.f37370b;
                ArrayList arrayList7 = lo0Var.f39335f;
                ArrayList arrayList8 = lo0Var.f39343n;
                org.telegram.messenger.we weVar = lo0Var.J;
                if (weVar == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        mo0 mo0Var = lo0Var.f39352t0;
                        if (mo0Var != null) {
                            switch (mo0Var.f39741a) {
                                case 1:
                                    oo0.l0(mo0Var.f39742b, str);
                                    return;
                                default:
                                    oo0.l0(mo0Var.f39742b, str);
                                    return;
                            }
                        }
                        lo0Var.P.getSearchField().setText(str);
                        lo0Var.P.getSearchField().setSelection(str.length());
                        lo0Var.f0(lo0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(lo0Var.getParentActivity());
                        alertDialog$Builder4.f20134a.R = org.telegram.messenger.cd.L0(2131752056, null);
                        alertDialog$Builder4.f20134a.T = org.telegram.messenger.cd.L0(2131752061, null);
                        alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131752099, null), new co0(lo0Var, 4));
                        alertDialog$Builder4.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder4.f20134a;
                        lo0Var.showDialog(x1Var3);
                        TextView textView3 = (TextView) x1Var3.d(-1);
                        if (textView3 != null) {
                            org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.f21170q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                if (weVar != null) {
                    arrayList7 = weVar.e;
                }
                if (i10 >= 0 && i10 < arrayList7.size()) {
                    org.telegram.ui.ActionBar.t0 t0Var = lo0Var.P;
                    if (t0Var != null) {
                        org.telegram.messenger.i0.v1(t0Var.getSearchField());
                    }
                    if (lo0Var.Y) {
                        lo0Var.e0(view, arrayList7.get(i10));
                        return;
                    }
                    int i25 = lo0Var.T;
                    if (i25 != 1 && i25 != 3) {
                        if (i25 != 2) {
                            c10 = '\n';
                            if (i25 != 10) {
                                if (lo0Var.U == null) {
                                    c11 = 4;
                                }
                            }
                        }
                        c11 = c10;
                    } else {
                        c11 = 1;
                    }
                    PhotoViewer.v1().N2(null, lo0Var, null);
                    PhotoViewer v12 = PhotoViewer.v1();
                    int i26 = lo0Var.H;
                    boolean z17 = lo0Var.I;
                    v12.h = i26;
                    v12.f33547n = z17;
                    PhotoViewer.v1().j2(arrayList7, i10, c11, lo0Var.f39342l0, lo0Var.f39358x0, lo0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f37370b;
                ArrayList arrayList9 = photoViewer.f33494g7;
                if (!arrayList9.isEmpty() && (i12 = photoViewer.P4) >= 0 && i12 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof org.telegram.messenger.ze) {
                        ((org.telegram.messenger.ze) obj).f19521s = photoViewer.p1();
                    }
                }
                photoViewer.f33528k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.E2(indexOf);
                }
                photoViewer.f33528k5 = false;
                return;
            case 23:
                at0 at0Var = (at0) this.f37370b;
                boolean[] zArr2 = at0Var.f35739x;
                if (i10 == at0Var.f35727o0) {
                    at0Var.j0();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.t8) {
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    boolean z18 = at0Var.L;
                    org.telegram.ui.Components.sx0 sx0Var = at0Var.Q;
                    if (sx0Var != null) {
                        sx0Var.f();
                    }
                    if (at0Var.I) {
                        int i27 = -at0Var.O;
                        at0Var.O = i27;
                        org.telegram.messenger.i0.F3(i27, t8Var, null);
                        org.telegram.messenger.t2.APP_ERROR.a();
                        return;
                    }
                    if (i10 == at0Var.f35731r0) {
                        z10 = !at0Var.G;
                        at0Var.G = z10;
                    } else {
                        int i28 = at0Var.f35735u0;
                        if (i10 == i28) {
                            z10 = !at0Var.H;
                            at0Var.H = z10;
                        } else if (i10 == at0Var.f35736v0) {
                            z10 = !at0Var.J;
                            at0Var.J = z10;
                            at0Var.v0();
                            int i29 = at0Var.f35735u0;
                            if (i29 >= 0 && i28 < 0) {
                                at0Var.f35711b.i(i29);
                            } else if (i28 >= 0 && i29 < 0) {
                                at0Var.f35711b.s(i28);
                            }
                        } else if (i10 == at0Var.f35733s0) {
                            boolean z19 = at0Var.K;
                            boolean z20 = !z19;
                            at0Var.K = z20;
                            if (!z19 && at0Var.L) {
                                int i30 = at0Var.f35722j0;
                                at0Var.L = false;
                                at0Var.v0();
                                s4.c1 K = at0Var.f35713c.K(at0Var.f35734t0);
                                if (K != null) {
                                    ((org.telegram.ui.Cells.t8) K.f47898a).setChecked(false);
                                } else {
                                    at0Var.f35711b.g(at0Var.f35734t0);
                                }
                                at0Var.f35711b.p(i30, 2);
                            }
                            z10 = z20;
                        } else if (at0Var.N == 0) {
                            boolean z21 = !at0Var.L;
                            at0Var.L = z21;
                            int i31 = at0Var.f35722j0;
                            at0Var.v0();
                            if (at0Var.L) {
                                at0Var.f35711b.o(at0Var.f35722j0, 2);
                            } else {
                                at0Var.f35711b.p(i31, 2);
                            }
                            if (at0Var.L && at0Var.K) {
                                at0Var.K = false;
                                s4.c1 K2 = at0Var.f35713c.K(at0Var.f35733s0);
                                if (K2 != null) {
                                    ((org.telegram.ui.Cells.t8) K2.f47898a).setChecked(false);
                                } else {
                                    at0Var.f35711b.g(at0Var.f35733s0);
                                }
                            }
                            if (at0Var.L) {
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
                    if (at0Var.M && !at0Var.L) {
                        at0Var.f35713c.getChildCount();
                        at0Var.h.b(true);
                    }
                    for (int i33 = at0Var.f35726n0; i33 < at0Var.f35726n0 + at0Var.D; i33++) {
                        s4.c1 K3 = at0Var.f35713c.K(i33);
                        if (K3 != null) {
                            View view2 = K3.f47898a;
                            if (view2 instanceof org.telegram.ui.Cells.e6) {
                                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view2;
                                e6Var.m(at0Var.L, true);
                                e6Var.f21863r.a(zArr2[i33 - at0Var.f35726n0], z18);
                                if (e6Var.getTop() > org.telegram.messenger.i0.L(40.0f) && i10 == at0Var.f35734t0 && !at0Var.M) {
                                    at0Var.h.f(e6Var.getCheckBox(), true);
                                    at0Var.M = true;
                                }
                            }
                        }
                    }
                    t8Var.setChecked(z10);
                    at0Var.m0();
                    return;
                } else {
                    return;
                }
            case 24:
                PremiumPreviewFragment.Y((PremiumPreviewFragment) this.f37370b, view, i10);
                return;
            case 25:
                du0 du0Var = (du0) this.f37370b;
                PremiumPreviewFragment premiumPreviewFragment = du0Var.f36836n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                ls0 ls0Var = du0Var.e;
                if (view.isEnabled() && (view instanceof kg.a2)) {
                    kg.a2 a2Var = (kg.a2) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(a2Var.getTier());
                    premiumPreviewFragment.x0(true);
                    a2Var.c(true, true);
                    for (int i34 = 0; i34 < ls0Var.getChildCount(); i34++) {
                        View childAt = ls0Var.getChildAt(i34);
                        if (childAt instanceof kg.a2) {
                            kg.a2 a2Var2 = (kg.a2) childAt;
                            if (a2Var2.getTier() != a2Var.getTier()) {
                                a2Var2.c(false, true);
                            }
                        }
                    }
                    for (int i35 = 0; i35 < ls0Var.getHiddenChildCount(); i35++) {
                        View V = ls0Var.V(i35);
                        if (V instanceof kg.a2) {
                            kg.a2 a2Var3 = (kg.a2) V;
                            if (a2Var3.getTier() != a2Var.getTier()) {
                                a2Var3.c(false, true);
                            }
                        }
                    }
                    for (int i36 = 0; i36 < ls0Var.getCachedChildCount(); i36++) {
                        View P = ls0Var.P(i36);
                        if (P instanceof kg.a2) {
                            kg.a2 a2Var4 = (kg.a2) P;
                            if (a2Var4.getTier() != a2Var.getTier()) {
                                a2Var4.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < ls0Var.getAttachedScrapChildCount(); i37++) {
                        View O = ls0Var.O(i37);
                        if (O instanceof kg.a2) {
                            kg.a2 a2Var5 = (kg.a2) O;
                            if (a2Var5.getTier() != a2Var.getTier()) {
                                a2Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.J;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((fu0Var = premiumPreviewFragment.f33697f) != null && fu0Var.f37348a.months < ((fu0) arrayList10.get(premiumPreviewFragment.e)).f37348a.months && !premiumPreviewFragment.f33708p0)) {
                        z11 = true;
                    }
                    org.telegram.messenger.i0.W3(frameLayout, z11);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.f37370b, view, i10);
                return;
            case 27:
                a(i10, view);
                return;
            case 28:
                ProfileActivity.b0((ProfileActivity) this.f37370b, i10);
                return;
            default:
                ProxyListActivity.Y((ProxyListActivity) this.f37370b, view, i10);
                return;
        }
    }
}
