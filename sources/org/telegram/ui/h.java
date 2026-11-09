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
public final class h implements org.telegram.ui.Components.cj0 {
    public final int f46107a;
    public final Object f46108b;

    public h(Object obj, int i7) {
        this.f46107a = i7;
        this.f46108b = obj;
    }

    private final void a(int i7, View view) {
        ut0 ut0Var = (ut0) this.f46108b;
        int i10 = ut0Var.D;
        if (i7 == ut0Var.f50468x) {
            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.L(ut0Var.getParentActivity(), org.telegram.messenger.id.M0(2131747913, null), org.telegram.messenger.id.M0(2131747914, null), org.telegram.messenger.id.M0(2131751598, null), new st0(ut0Var), null).f27296a;
            u1Var.show();
            u1Var.i();
        } else if (i7 == ut0Var.f50463f) {
            if (i10 == 1) {
                ?? f2Var = new org.telegram.ui.ActionBar.f2(null);
                f2Var.d = new Paint();
                f2Var.f44756f = new bu[2];
                f2Var.f44761x = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                yw ywVar = new yw(bundle);
                f2Var.f44752a = ywVar;
                ywVar.D2 = new zt(f2Var);
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
                f2Var.f44753b = contactsActivity;
                contactsActivity.U = new zt(f2Var);
                contactsActivity.onFragmentCreate();
                ut0Var.presentFragment((org.telegram.ui.ActionBar.f2) f2Var);
                return;
            }
            Bundle k10 = a8.p0.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            y40 y40Var = new y40(k10);
            y40Var.f51884x = new rt0(ut0Var);
            ut0Var.presentFragment(y40Var);
        } else if (i7 >= ut0Var.f50465r && i7 < ut0Var.f50466s) {
            if (i10 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", ut0Var.getMessagesController().G0.keyAt(i7 - ut0Var.f50465r));
                ut0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        rs rsVar;
        boolean[] zArr;
        az azVar;
        org.telegram.ui.Components.hc a03;
        int i10;
        int i11;
        boolean z9;
        boolean z10;
        ys0 ys0Var;
        int i12 = 3;
        os osVar = null;
        boolean z11 = false;
        int i13 = 1;
        switch (this.f46107a) {
            case 0:
                k kVar = (k) this.f46108b;
                ArrayList arrayList = kVar.h;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    int i14 = ((i) arrayList.get(i7)).d;
                    if (i14 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z12 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z12;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z12);
                        kVar.f47138c = true;
                        return;
                    } else if (i14 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z13 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z13;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z13);
                        kVar.f47138c = true;
                        return;
                    } else if (i14 == 7) {
                        if (!kVar.getUserConfig().q() && !kVar.getMessagesController().Y3 && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.x70 x70Var = ubVar.f38681b;
                            x70Var.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131743866, null), org.telegram.ui.ActionBar.l6.uj, 0, new iq0(kVar, 3), null));
                            x70Var.setSingleLine(false);
                            x70Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            ubVar.f38680a.setImageResource(2131232362);
                            org.telegram.ui.Components.cc.g(kVar, ubVar, 3500).j();
                            int i15 = -kVar.f47139e;
                            kVar.f47139e = i15;
                            org.telegram.messenger.g0.G3(i15, view, null);
                            org.telegram.messenger.p2.APP_ERROR.a();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                        boolean z14 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z14;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z14);
                        kVar.f47138c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                o oVar = (o) this.f46108b;
                if (i7 >= oVar.f48274y && i7 < oVar.D && oVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.h.get(i7 - oVar.f48274y);
                    if (stickerSetCovered.set.f26983id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f26976id = stickerSetCovered.set.f26983id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.zv0 zv0Var = new org.telegram.ui.Components.zv0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    zv0Var.T1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(zv0Var);
                    return;
                }
                return;
            case 2:
                az0.Z((az0) this.f46108b, i7);
                return;
            case 3:
                pc pcVar = (pc) this.f46108b;
                ArrayList arrayList2 = pcVar.f48688c;
                f61 f61Var = pcVar.d;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList2.get(i7);
                    pcVar.a(uoVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + f61Var.getPaddingLeft()) {
                        f61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + f61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (f61Var.getMeasuredWidth() - f61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        f61Var.w0(org.telegram.messenger.k5.B(48.0f, f61Var.getMeasuredWidth() - f61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.c20 c20Var = pcVar.f48692r;
                    if (c20Var != null) {
                        c20Var.a(uoVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                uo uoVar2 = (uo) this.f46108b;
                boolean z15 = uoVar2.f50438s;
                if (uoVar2.getParentActivity() != null) {
                    v4.g0 adapter = uoVar2.f50432b.getAdapter();
                    to toVar = uoVar2.f50434e;
                    if (adapter == toVar) {
                        chat = (TLRPC.Chat) toVar.d.get(i7);
                    } else {
                        int i16 = uoVar2.G;
                        if (i7 >= i16 && i7 < uoVar2.H) {
                            chat = (TLRPC.Chat) uoVar2.f50439w.get(i7 - i16);
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
                        bundle.putLong("chat_id", chat.f26956id);
                        uoVar2.presentFragment(new cn(bundle));
                        return;
                    } else if (i7 == uoVar2.F) {
                        if (z15 && uoVar2.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{uoVar2.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = uoVar2.f50435f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.id.a0("GroupCreateDiscussionDefaultName", null, 2131749454, chat2.title));
                            }
                            f50 f50Var = new f50(bundle2);
                            f50Var.Y = new mo(uoVar2);
                            uoVar2.presentFragment(f50Var);
                            return;
                        } else if (!uoVar2.f50439w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) uoVar2.f50439w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uoVar2.getParentActivity());
                            if (z15) {
                                M0 = org.telegram.messenger.id.M0(2131751371, null);
                                a02 = org.telegram.messenger.id.a0("DiscussionUnlinkChannelAlert", null, 2131751372, chat3.title);
                            } else {
                                M0 = org.telegram.messenger.id.M0(2131751373, null);
                                a02 = org.telegram.messenger.id.a0("DiscussionUnlinkGroupAlert", null, 2131751370, chat3.title);
                            }
                            alertDialog$Builder.f27296a.R = M0;
                            alertDialog$Builder.f27296a.T = org.telegram.messenger.g0.X2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751374, null), new w0(uoVar2, 25));
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                            uoVar2.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
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
                bp bpVar = (bp) this.f46108b;
                ArrayList arrayList3 = bpVar.f44090n;
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
                    Switch r22 = xVar.f30763c;
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
                is isVar = (is) this.f46108b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ls) view).d;
                ms msVar = isVar.f46750a;
                ch.b0 reactionsWindow = msVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f6195q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ew0.c(null, msVar.f47961c0, msVar.f47983z.getContext(), new a5(isVar, 9));
                    return;
                }
                ks ksVar = msVar.f47970l;
                if (ksVar != null) {
                    ksVar.w(stickerSetCovered2.set, TextUtils.join("", msVar.f47973o));
                }
                msVar.o();
                return;
            case 7:
                ss ssVar = (ss) this.f46108b;
                if (ssVar.f49985f && ssVar.f49984e) {
                    org.telegram.ui.Components.oj ojVar = ssVar.d;
                    ArrayList arrayList4 = ojVar.f36728e;
                    if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                        osVar = (os) ojVar.f36728e.get(i7);
                    }
                } else {
                    int S = ssVar.f49983c.S(i7);
                    int Q = ssVar.f49983c.Q(i7);
                    if (Q >= 0 && S >= 0) {
                        osVar = ssVar.f49983c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i7 >= 0) {
                    ssVar.finishFragment();
                    if (osVar != null && (rsVar = ssVar.f49987r) != null) {
                        rsVar.b(osVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                jt jtVar = (jt) this.f46108b;
                ArrayList arrayList5 = jtVar.j3;
                mt mtVar = jtVar.f47096v3;
                if ((view instanceof ct) && i7 >= 0 && i7 < arrayList5.size()) {
                    et etVar = (et) arrayList5.get(i7);
                    if (etVar != null) {
                        int i17 = etVar.h;
                        if (i17 >= 0) {
                            jtVar.f47090p3[i17] = !zArr[i17];
                            jtVar.D1(true);
                            return;
                        } else if (i17 == -2) {
                            mtVar.presentFragment(new DataAutoDownloadActivity(jtVar.f47081f3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(mtVar.getParentActivity());
                    alertDialog$Builder2.f27296a.R = org.telegram.messenger.id.M0(2131746089, null);
                    alertDialog$Builder2.f27296a.T = org.telegram.messenger.id.M0(2131746090, null);
                    alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131746118, null), new ft(jtVar));
                    alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                    mtVar.showDialog(u1Var2);
                    TextView textView2 = (TextView) u1Var2.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f28106q7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                iy.a0((iy) this.f46108b, view, i7);
                return;
            case 10:
                iz izVar = (iz) this.f46108b;
                if (izVar.getParentActivity() != null && (azVar = (az) izVar.P.get(i7)) != null) {
                    View.OnClickListener onClickListener = azVar.f43828c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i18 = azVar.f54544a;
                    if (i18 == 1) {
                        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                        izVar.B0(azVar, paVar.getName(), paVar.getCurrentObject(), azVar.f43831g);
                        return;
                    } else if (i18 == 7) {
                        org.telegram.ui.Components.m51 m51Var = new org.telegram.ui.Components.m51(21, izVar, azVar);
                        if (izVar.f46791c.f27359x.f55500f) {
                            izVar.y0(m51Var, false);
                            return;
                        } else {
                            m51Var.run();
                            return;
                        }
                    } else if (i18 == 8 || (i18 == 4 && azVar.f43834k == 2131232031)) {
                        org.telegram.messenger.vo voVar = izVar.f46795r;
                        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                        if (izVar.f46796s && izVar.f46791c.f27359x.f55500f) {
                            float f10 = -izVar.Q;
                            izVar.Q = f10;
                            org.telegram.messenger.g0.G3(f10, view, null);
                            p2Var.a();
                            izVar.f46797w = true;
                            fi.m3 m3Var = izVar.R;
                            if ((m3Var == null || !m3Var.V) && (izVar.fragmentView instanceof FrameLayout)) {
                                fi.m3 m3Var2 = new fi.m3(izVar.getParentActivity(), 1);
                                m3Var2.r(true);
                                m3Var2.d = 2300L;
                                m3Var2.T = true;
                                m3Var2.f12423e = true;
                                m3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                m3Var2.f12443u0 = -org.telegram.messenger.g0.L(10.0f);
                                izVar.R = m3Var2;
                                m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                m3Var2.l(izVar.getBaseSimpleGlass().f21021c);
                                m3Var2.u(org.telegram.messenger.id.M0(2131750775, null));
                                m3Var2.f12437q0 = new qy(m3Var2, 0);
                                ((FrameLayout) izVar.fragmentView).addView(m3Var2, c8.ha.e(-1, 150, 55));
                                m3Var2.y(izVar.f46791c, true);
                                return;
                            }
                            return;
                        }
                        if (!TextUtils.isEmpty(izVar.f46798x) || !TextUtils.isEmpty(voVar.f26071b)) {
                            int i19 = izVar.D;
                            int i20 = org.telegram.messenger.qp.C8;
                            if ((i19 & (-1537)) == 0 && izVar.G.isEmpty() && !izVar.F.isEmpty()) {
                                izVar.y0(new ny(izVar, 1), false);
                                return;
                            }
                        }
                        float f11 = -izVar.Q;
                        izVar.Q = f11;
                        org.telegram.messenger.g0.G3(f11, view, null);
                        p2Var.a();
                        if (TextUtils.isEmpty(izVar.f46798x) && TextUtils.isEmpty(voVar.f26071b)) {
                            a03 = org.telegram.ui.Components.hc.a0(izVar);
                            i10 = 2131750762;
                        } else {
                            int i21 = izVar.D;
                            int i22 = org.telegram.messenger.qp.C8;
                            if ((i21 & (-1537)) != 0) {
                                if (!izVar.G.isEmpty()) {
                                    a03 = org.telegram.ui.Components.hc.a0(izVar);
                                    i10 = 2131750759;
                                } else {
                                    a03 = org.telegram.ui.Components.hc.a0(izVar);
                                    i10 = 2131750760;
                                }
                            } else if (izVar.F.isEmpty()) {
                                a03 = org.telegram.ui.Components.hc.a0(izVar);
                                i10 = 2131750763;
                            } else {
                                a03 = org.telegram.ui.Components.hc.a0(izVar);
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
                xy xyVar = (xy) this.f46108b;
                ArrayList arrayList6 = xyVar.W1;
                int i23 = i7 - 1;
                if (i23 >= 0 && i23 < arrayList6.size()) {
                    az azVar2 = (az) arrayList6.get(i23);
                    int i24 = azVar2.f54544a;
                    if (i24 == 7) {
                        xyVar.dismiss();
                        xyVar.f36305o1.presentFragment(new iy(xyVar.Q1, azVar2.f43836m));
                        return;
                    } else if (i24 == 8) {
                        xyVar.d1();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                a00 a00Var = (a00) this.f46108b;
                if (view instanceof org.telegram.ui.Cells.h7) {
                    a00Var.f(i7, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    a00Var.f(i7, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.g7) {
                    a00Var.f(i7, view, ((org.telegram.ui.Cells.g7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    a00Var.f(i7, view, ((org.telegram.ui.Cells.h2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.t2) {
                    a00Var.f(i7, view, ((org.telegram.ui.Cells.t2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                h50 h50Var = (h50) this.f46108b;
                if (h50Var.getParentActivity() != null) {
                    if (i7 != h50Var.f46165n && i7 != 0) {
                        if (i7 == h50Var.f46167s) {
                            if (h50Var.f46164f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", h50Var.f46164f.link);
                                    h50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131749110, null)), 500);
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            return;
                        } else if (i7 == h50Var.f46166r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h50Var.getParentActivity());
                            alertDialog$Builder3.f27296a.T = org.telegram.messenger.id.M0(2131746026, null);
                            alertDialog$Builder3.f27296a.R = org.telegram.messenger.id.M0(2131746023, null);
                            alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131746024, null), new yr(h50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            h50Var.showDialog(alertDialog$Builder3.f27296a);
                            return;
                        } else {
                            return;
                        }
                    } else if (h50Var.f46164f != null) {
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", h50Var.f46164f.link));
                            org.telegram.ui.Components.hc.j(h50Var).j();
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
                o50.Z((o50) this.f46108b, view, i7);
                return;
            case 15:
                b60.Z((b60) this.f46108b, view, i7);
                return;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.f46108b, view, i7);
                return;
            case 17:
                ((dg0) this.f46108b).onBackPressed();
                return;
            case 18:
                lg0 lg0Var = (lg0) this.f46108b;
                int i25 = lg0Var.I;
                if (i7 >= i25 && i7 < lg0Var.J) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) lg0Var.f47616y.get(i7 - i25);
                    if (ijVar.x4()) {
                        if (!lg0Var.g0(ijVar)) {
                            lg0Var.getOrCreateStoryViewer().L(lg0Var.getParentActivity(), ijVar.f23266l, di.i7.a(lg0Var.f47610f));
                            return;
                        }
                        return;
                    }
                    long B0 = org.telegram.messenger.ij.B0(ijVar.f23262k);
                    Bundle bundle3 = new Bundle();
                    if (org.telegram.messenger.m5.E(B0)) {
                        bundle3.putLong("user_id", B0);
                    } else {
                        bundle3.putLong("chat_id", -B0);
                    }
                    bundle3.putInt("message_id", ijVar.e1());
                    bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                    if (lg0Var.getMessagesController().E(bundle3, lg0Var, null, null)) {
                        lg0Var.presentFragment(new cn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.f46108b, view, i7);
                return;
            case 20:
                im0 im0Var = (im0) this.f46108b;
                im0Var.a(i7, true);
                vl0 vl0Var = im0Var.h;
                if (vl0Var != null) {
                    vl0Var.a(Integer.valueOf(i7));
                    return;
                }
                return;
            case 21:
                zm0 zm0Var = (zm0) this.f46108b;
                ArrayList arrayList7 = zm0Var.f52607f;
                ArrayList arrayList8 = zm0Var.f52615n;
                org.telegram.messenger.we weVar = zm0Var.J;
                if (weVar == null && arrayList7.isEmpty()) {
                    if (i7 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i7);
                        an0 an0Var = zm0Var.f52624t0;
                        if (an0Var != null) {
                            switch (an0Var.f43748a) {
                                case 1:
                                    cn0.m0(an0Var.f43749b, str);
                                    return;
                                default:
                                    cn0.m0(an0Var.f43749b, str);
                                    return;
                            }
                        }
                        zm0Var.P.getSearchField().setText(str);
                        zm0Var.P.getSearchField().setSelection(str.length());
                        zm0Var.g0(zm0Var.P.getSearchField());
                        return;
                    } else if (i7 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(zm0Var.getParentActivity());
                        alertDialog$Builder4.f27296a.R = org.telegram.messenger.id.M0(2131752056, null);
                        alertDialog$Builder4.f27296a.T = org.telegram.messenger.id.M0(2131752061, null);
                        alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131752099, null), new sm0(zm0Var, 4));
                        alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder4.f27296a;
                        zm0Var.showDialog(u1Var3);
                        TextView textView3 = (TextView) u1Var3.d(-1);
                        if (textView3 != null) {
                            org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.f28106q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                if (weVar != null) {
                    arrayList7 = weVar.f26300e;
                }
                if (i7 >= 0 && i7 < arrayList7.size()) {
                    org.telegram.ui.ActionBar.r0 r0Var = zm0Var.P;
                    if (r0Var != null) {
                        org.telegram.messenger.g0.v1(r0Var.getSearchField());
                    }
                    if (zm0Var.Y) {
                        zm0Var.f0(view, arrayList7.get(i7));
                        return;
                    }
                    int i26 = zm0Var.T;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 != 2) {
                            i12 = 10;
                            if (i26 != 10) {
                                i13 = zm0Var.U == null ? 4 : 0;
                            }
                        }
                        i13 = i12;
                    }
                    PhotoViewer.p1().H2(null, zm0Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i27 = zm0Var.H;
                    boolean z17 = zm0Var.I;
                    p12.h = i27;
                    p12.f41468n = z17;
                    PhotoViewer.p1().e2(arrayList7, i7, i13, zm0Var.f52614l0, zm0Var.f52630x0, zm0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f46108b;
                ArrayList arrayList9 = photoViewer.f41408f7;
                if (!arrayList9.isEmpty() && (i11 = photoViewer.O4) >= 0 && i11 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.O4);
                    if (obj instanceof org.telegram.messenger.ze) {
                        ((org.telegram.messenger.ze) obj).f26860s = photoViewer.j1();
                    }
                }
                photoViewer.f41439j5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.O4 = -1;
                    photoViewer.y2(indexOf);
                }
                photoViewer.f41439j5 = false;
                return;
            case 23:
                rr0 rr0Var = (rr0) this.f46108b;
                boolean[] zArr2 = rr0Var.f49596x;
                if (i7 == rr0Var.f49584o0) {
                    rr0Var.k0();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    boolean z18 = rr0Var.L;
                    org.telegram.ui.Components.pw0 pw0Var = rr0Var.Q;
                    if (pw0Var != null) {
                        pw0Var.f();
                    }
                    if (rr0Var.I) {
                        int i28 = -rr0Var.O;
                        rr0Var.O = i28;
                        org.telegram.messenger.g0.G3(i28, r8Var, null);
                        org.telegram.messenger.p2.APP_ERROR.a();
                        return;
                    }
                    if (i7 == rr0Var.f49588r0) {
                        z9 = !rr0Var.G;
                        rr0Var.G = z9;
                    } else {
                        int i29 = rr0Var.f49592u0;
                        if (i7 == i29) {
                            z9 = !rr0Var.H;
                            rr0Var.H = z9;
                        } else {
                            if (i7 == rr0Var.f49593v0) {
                                z10 = !rr0Var.J;
                                rr0Var.J = z10;
                                rr0Var.w0();
                                int i30 = rr0Var.f49592u0;
                                if (i30 >= 0 && i29 < 0) {
                                    rr0Var.f49567b.i(i30);
                                } else if (i29 >= 0 && i30 < 0) {
                                    rr0Var.f49567b.s(i29);
                                }
                            } else if (i7 == rr0Var.f49590s0) {
                                boolean z19 = rr0Var.K;
                                z10 = !z19;
                                rr0Var.K = z10;
                                if (!z19 && rr0Var.L) {
                                    int i31 = rr0Var.f49579j0;
                                    rr0Var.L = false;
                                    rr0Var.w0();
                                    v4.d1 K = rr0Var.f49569c.K(rr0Var.f49591t0);
                                    if (K != null) {
                                        ((org.telegram.ui.Cells.r8) K.f57056a).setChecked(false);
                                    } else {
                                        rr0Var.f49567b.g(rr0Var.f49591t0);
                                    }
                                    rr0Var.f49567b.p(i31, 2);
                                }
                            } else if (rr0Var.N == 0) {
                                z9 = !rr0Var.L;
                                rr0Var.L = z9;
                                int i32 = rr0Var.f49579j0;
                                rr0Var.w0();
                                if (rr0Var.L) {
                                    rr0Var.f49567b.o(rr0Var.f49579j0, 2);
                                } else {
                                    rr0Var.f49567b.p(i32, 2);
                                }
                                if (rr0Var.L && rr0Var.K) {
                                    rr0Var.K = false;
                                    v4.d1 K2 = rr0Var.f49569c.K(rr0Var.f49590s0);
                                    if (K2 != null) {
                                        ((org.telegram.ui.Cells.r8) K2.f57056a).setChecked(false);
                                    } else {
                                        rr0Var.f49567b.g(rr0Var.f49590s0);
                                    }
                                }
                                if (rr0Var.L) {
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
                    if (rr0Var.M && !rr0Var.L) {
                        rr0Var.f49569c.getChildCount();
                        rr0Var.h.a();
                    }
                    for (int i34 = rr0Var.f49583n0; i34 < rr0Var.f49583n0 + rr0Var.D; i34++) {
                        v4.d1 K3 = rr0Var.f49569c.K(i34);
                        if (K3 != null) {
                            View view2 = K3.f57056a;
                            if (view2 instanceof org.telegram.ui.Cells.a6) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view2;
                                a6Var.m(rr0Var.L, true);
                                a6Var.f28898r.a(zArr2[i34 - rr0Var.f49583n0], z18);
                                if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == rr0Var.f49591t0 && !rr0Var.M) {
                                    rr0Var.h.c(a6Var.getCheckBox());
                                    rr0Var.M = true;
                                }
                            }
                        }
                    }
                    r8Var.setChecked(z9);
                    rr0Var.n0();
                    return;
                } else {
                    return;
                }
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.f46108b, view, i7);
                return;
            case 25:
                ws0 ws0Var = (ws0) this.f46108b;
                PremiumPreviewFragment premiumPreviewFragment = ws0Var.f51471n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                dr0 dr0Var = ws0Var.f51469e;
                if (view.isEnabled() && (view instanceof ug.k1)) {
                    ug.k1 k1Var = (ug.k1) view;
                    premiumPreviewFragment.f41619e = arrayList10.indexOf(k1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    k1Var.c(true, true);
                    for (int i35 = 0; i35 < dr0Var.getChildCount(); i35++) {
                        View childAt = dr0Var.getChildAt(i35);
                        if (childAt instanceof ug.k1) {
                            ug.k1 k1Var2 = (ug.k1) childAt;
                            if (k1Var2.getTier() != k1Var.getTier()) {
                                k1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i36 = 0; i36 < dr0Var.getHiddenChildCount(); i36++) {
                        View V = dr0Var.V(i36);
                        if (V instanceof ug.k1) {
                            ug.k1 k1Var3 = (ug.k1) V;
                            if (k1Var3.getTier() != k1Var.getTier()) {
                                k1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < dr0Var.getCachedChildCount(); i37++) {
                        View P = dr0Var.P(i37);
                        if (P instanceof ug.k1) {
                            ug.k1 k1Var4 = (ug.k1) P;
                            if (k1Var4.getTier() != k1Var.getTier()) {
                                k1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < dr0Var.getAttachedScrapChildCount(); i38++) {
                        View O = dr0Var.O(i38);
                        if (O instanceof ug.k1) {
                            ug.k1 k1Var5 = (ug.k1) O;
                            if (k1Var5.getTier() != k1Var.getTier()) {
                                k1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.J;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((ys0Var = premiumPreviewFragment.f41621f) != null && ys0Var.f52182a.months < ((ys0) arrayList10.get(premiumPreviewFragment.f41619e)).f52182a.months && !premiumPreviewFragment.f41632p0)) {
                        z11 = true;
                    }
                    org.telegram.messenger.g0.X3(frameLayout, z11);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.c0((PrivacyControlActivity) this.f46108b, view, i7);
                return;
            case 27:
                a(i7, view);
                return;
            case 28:
                ProfileActivity.c0((ProfileActivity) this.f46108b, i7);
                return;
            default:
                ProxyListActivity.Z((ProxyListActivity) this.f46108b, view, i7);
                return;
        }
    }
}
