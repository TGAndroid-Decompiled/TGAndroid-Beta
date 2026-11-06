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
    public final int f46173a;
    public final Object f46174b;

    public h(Object obj, int i7) {
        this.f46173a = i7;
        this.f46174b = obj;
    }

    private final void a(int i7, View view) {
        st0 st0Var = (st0) this.f46174b;
        int i10 = st0Var.D;
        if (i7 == st0Var.f49834x) {
            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.L(st0Var.getParentActivity(), org.telegram.messenger.hd.M0(2131747912, null), org.telegram.messenger.hd.M0(2131747913, null), org.telegram.messenger.hd.M0(2131751599, null), new qt0(st0Var), null).f27292a;
            u1Var.show();
            u1Var.i();
        } else if (i7 == st0Var.f49829f) {
            if (i10 == 1) {
                ?? f2Var = new org.telegram.ui.ActionBar.f2(null);
                f2Var.d = new Paint();
                f2Var.f44094f = new zt[2];
                f2Var.f44099x = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                ww wwVar = new ww(bundle);
                f2Var.f44090a = wwVar;
                wwVar.C2 = new xt(f2Var);
                wwVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                f2Var.f44091b = contactsActivity;
                contactsActivity.U = new xt(f2Var);
                contactsActivity.onFragmentCreate();
                st0Var.presentFragment((org.telegram.ui.ActionBar.f2) f2Var);
                return;
            }
            Bundle k10 = a8.p0.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            w40 w40Var = new w40(k10);
            w40Var.f50953x = new pt0(st0Var);
            st0Var.presentFragment(w40Var);
        } else if (i7 >= st0Var.f49831r && i7 < st0Var.f49832s) {
            if (i10 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", st0Var.getMessagesController().G0.keyAt(i7 - st0Var.f49831r));
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
        ps psVar;
        boolean[] zArr;
        yy yyVar;
        org.telegram.ui.Components.hc a03;
        int i10;
        int i11;
        boolean z9;
        boolean z10;
        ws0 ws0Var;
        int i12 = 3;
        ms msVar = null;
        boolean z11 = false;
        int i13 = 1;
        switch (this.f46173a) {
            case 0:
                k kVar = (k) this.f46174b;
                ArrayList arrayList = kVar.h;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    int i14 = ((i) arrayList.get(i7)).d;
                    if (i14 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z12 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z12;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z12);
                        kVar.f47067c = true;
                        return;
                    } else if (i14 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z13 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z13;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z13);
                        kVar.f47067c = true;
                        return;
                    } else if (i14 == 7) {
                        if (!kVar.getUserConfig().q() && !kVar.getMessagesController().Y3 && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.w70 w70Var = ubVar.f38581b;
                            w70Var.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131743867, null), org.telegram.ui.ActionBar.k6.uj, 0, new gq0(kVar, 3), null));
                            w70Var.setSingleLine(false);
                            w70Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            ubVar.f38580a.setImageResource(2131232362);
                            org.telegram.ui.Components.cc.g(kVar, ubVar, 3500).j();
                            int i15 = -kVar.f47068e;
                            kVar.f47068e = i15;
                            org.telegram.messenger.g0.G3(i15, view, null);
                            org.telegram.messenger.p2.APP_ERROR.a();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                        boolean z14 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z14;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z14);
                        kVar.f47067c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                o oVar = (o) this.f46174b;
                if (i7 >= oVar.f48191y && i7 < oVar.D && oVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.h.get(i7 - oVar.f48191y);
                    if (stickerSetCovered.set.f26979id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f26972id = stickerSetCovered.set.f26979id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.yv0 yv0Var = new org.telegram.ui.Components.yv0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    yv0Var.T1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(yv0Var);
                    return;
                }
                return;
            case 2:
                xy0.Z((xy0) this.f46174b, i7);
                return;
            case 3:
                pc pcVar = (pc) this.f46174b;
                ArrayList arrayList2 = pcVar.f48778c;
                e61 e61Var = pcVar.d;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList2.get(i7);
                    pcVar.a(uoVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + e61Var.getPaddingLeft()) {
                        e61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + e61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (e61Var.getMeasuredWidth() - e61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        e61Var.w0(org.telegram.messenger.k5.B(48.0f, e61Var.getMeasuredWidth() - e61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.c20 c20Var = pcVar.f48782r;
                    if (c20Var != null) {
                        c20Var.a(uoVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                so soVar = (so) this.f46174b;
                boolean z15 = soVar.f49804s;
                if (soVar.getParentActivity() != null) {
                    v4.g0 adapter = soVar.f49798b.getAdapter();
                    ro roVar = soVar.f49800e;
                    if (adapter == roVar) {
                        chat = (TLRPC.Chat) roVar.d.get(i7);
                    } else {
                        int i16 = soVar.G;
                        if (i7 >= i16 && i7 < soVar.H) {
                            chat = (TLRPC.Chat) soVar.f49805w.get(i7 - i16);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z15 && soVar.h.linked_chat_id == 0) {
                            soVar.f0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f26952id);
                        soVar.presentFragment(new an(bundle));
                        return;
                    } else if (i7 == soVar.F) {
                        if (z15 && soVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{soVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = soVar.f49801f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.hd.a0("GroupCreateDiscussionDefaultName", null, 2131749453, chat2.title));
                            }
                            d50 d50Var = new d50(bundle2);
                            d50Var.Y = new ko(soVar);
                            soVar.presentFragment(d50Var);
                            return;
                        } else if (!soVar.f49805w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) soVar.f49805w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(soVar.getParentActivity());
                            if (z15) {
                                M0 = org.telegram.messenger.hd.M0(2131751372, null);
                                a02 = org.telegram.messenger.hd.a0("DiscussionUnlinkChannelAlert", null, 2131751373, chat3.title);
                            } else {
                                M0 = org.telegram.messenger.hd.M0(2131751374, null);
                                a02 = org.telegram.messenger.hd.a0("DiscussionUnlinkGroupAlert", null, 2131751371, chat3.title);
                            }
                            alertDialog$Builder.f27292a.R = M0;
                            alertDialog$Builder.f27292a.T = org.telegram.messenger.g0.X2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751375, null), new w0(soVar, 25));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                            soVar.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
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
                zo zoVar = (zo) this.f46174b;
                ArrayList arrayList3 = zoVar.f52629n;
                if (i7 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i7 - 3);
                    boolean contains = zoVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        zoVar.d.add(tL_availableReaction.reaction);
                    } else {
                        zoVar.d.remove(tL_availableReaction.reaction);
                        if (zoVar.d.isEmpty()) {
                            yo yoVar = zoVar.h;
                            if (yoVar != null) {
                                yoVar.p(2, arrayList3.size() + 1);
                            }
                            zoVar.a0(2, true);
                        }
                    }
                    Switch r22 = xVar.f30754c;
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
                gs gsVar = (gs) this.f46174b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((js) view).d;
                ks ksVar = gsVar.f46088a;
                ch.b0 reactionsWindow = ksVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f6197q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.dw0.c(null, ksVar.f47273c0, ksVar.f47295z.getContext(), new a5(gsVar, 9));
                    return;
                }
                is isVar = ksVar.f47282l;
                if (isVar != null) {
                    isVar.w(stickerSetCovered2.set, TextUtils.join("", ksVar.f47285o));
                }
                ksVar.o();
                return;
            case 7:
                qs qsVar = (qs) this.f46174b;
                if (qsVar.f49305f && qsVar.f49304e) {
                    org.telegram.ui.Components.oj ojVar = qsVar.d;
                    ArrayList arrayList4 = ojVar.f36612e;
                    if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                        msVar = (ms) ojVar.f36612e.get(i7);
                    }
                } else {
                    int S = qsVar.f49303c.S(i7);
                    int Q = qsVar.f49303c.Q(i7);
                    if (Q >= 0 && S >= 0) {
                        msVar = qsVar.f49303c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i7 >= 0) {
                    qsVar.finishFragment();
                    if (msVar != null && (psVar = qsVar.f49307r) != null) {
                        psVar.b(msVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                gt gtVar = (gt) this.f46174b;
                ArrayList arrayList5 = gtVar.j3;
                kt ktVar = gtVar.f46108v3;
                if ((view instanceof at) && i7 >= 0 && i7 < arrayList5.size()) {
                    ct ctVar = (ct) arrayList5.get(i7);
                    if (ctVar != null) {
                        int i17 = ctVar.h;
                        if (i17 >= 0) {
                            gtVar.f46102p3[i17] = !zArr[i17];
                            gtVar.D1(true);
                            return;
                        } else if (i17 == -2) {
                            ktVar.presentFragment(new DataAutoDownloadActivity(gtVar.f46093f3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ktVar.getParentActivity());
                    alertDialog$Builder2.f27292a.R = org.telegram.messenger.hd.M0(2131746090, null);
                    alertDialog$Builder2.f27292a.T = org.telegram.messenger.hd.M0(2131746091, null);
                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746119, null), new dt(gtVar));
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27292a;
                    ktVar.showDialog(u1Var2);
                    TextView textView2 = (TextView) u1Var2.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28089q7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                gy.a0((gy) this.f46174b, view, i7);
                return;
            case 10:
                gz gzVar = (gz) this.f46174b;
                if (gzVar.getParentActivity() != null && (yyVar = (yy) gzVar.P.get(i7)) != null) {
                    View.OnClickListener onClickListener = yyVar.f52369c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i18 = yyVar.f54440a;
                    if (i18 == 1) {
                        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                        gzVar.B0(yyVar, paVar.getName(), paVar.getCurrentObject(), yyVar.f52372g);
                        return;
                    } else if (i18 == 7) {
                        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(21, gzVar, yyVar);
                        if (gzVar.f46162c.f27353x.f55396f) {
                            gzVar.y0(k51Var, false);
                            return;
                        } else {
                            k51Var.run();
                            return;
                        }
                    } else if (i18 == 8 || (i18 == 4 && yyVar.f52375k == 2131232031)) {
                        org.telegram.messenger.vo voVar = gzVar.f46166r;
                        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
                        if (gzVar.f46167s && gzVar.f46162c.f27353x.f55396f) {
                            float f10 = -gzVar.Q;
                            gzVar.Q = f10;
                            org.telegram.messenger.g0.G3(f10, view, null);
                            p2Var.a();
                            gzVar.f46168w = true;
                            fi.m3 m3Var = gzVar.R;
                            if ((m3Var == null || !m3Var.V) && (gzVar.fragmentView instanceof FrameLayout)) {
                                fi.m3 m3Var2 = new fi.m3(gzVar.getParentActivity(), 1);
                                m3Var2.r(true);
                                m3Var2.d = 2300L;
                                m3Var2.T = true;
                                m3Var2.f12422e = true;
                                m3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                m3Var2.f12442u0 = -org.telegram.messenger.g0.L(10.0f);
                                gzVar.R = m3Var2;
                                m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                m3Var2.l(gzVar.getBaseSimpleGlass().f21018c);
                                m3Var2.u(org.telegram.messenger.hd.M0(2131750776, null));
                                m3Var2.f12436q0 = new oy(m3Var2, 0);
                                ((FrameLayout) gzVar.fragmentView).addView(m3Var2, c8.ha.e(-1, 150, 55));
                                m3Var2.y(gzVar.f46162c, true);
                                return;
                            }
                            return;
                        }
                        if (!TextUtils.isEmpty(gzVar.f46169x) || !TextUtils.isEmpty(voVar.f26057b)) {
                            int i19 = gzVar.D;
                            int i20 = org.telegram.messenger.qp.C8;
                            if ((i19 & (-1537)) == 0 && gzVar.G.isEmpty() && !gzVar.F.isEmpty()) {
                                gzVar.y0(new ly(gzVar, 1), false);
                                return;
                            }
                        }
                        float f11 = -gzVar.Q;
                        gzVar.Q = f11;
                        org.telegram.messenger.g0.G3(f11, view, null);
                        p2Var.a();
                        if (TextUtils.isEmpty(gzVar.f46169x) && TextUtils.isEmpty(voVar.f26057b)) {
                            a03 = org.telegram.ui.Components.hc.a0(gzVar);
                            i10 = 2131750763;
                        } else {
                            int i21 = gzVar.D;
                            int i22 = org.telegram.messenger.qp.C8;
                            if ((i21 & (-1537)) != 0) {
                                if (!gzVar.G.isEmpty()) {
                                    a03 = org.telegram.ui.Components.hc.a0(gzVar);
                                    i10 = 2131750760;
                                } else {
                                    a03 = org.telegram.ui.Components.hc.a0(gzVar);
                                    i10 = 2131750761;
                                }
                            } else if (gzVar.F.isEmpty()) {
                                a03 = org.telegram.ui.Components.hc.a0(gzVar);
                                i10 = 2131750764;
                            } else {
                                a03 = org.telegram.ui.Components.hc.a0(gzVar);
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
                vy vyVar = (vy) this.f46174b;
                ArrayList arrayList6 = vyVar.W1;
                int i23 = i7 - 1;
                if (i23 >= 0 && i23 < arrayList6.size()) {
                    yy yyVar2 = (yy) arrayList6.get(i23);
                    int i24 = yyVar2.f54440a;
                    if (i24 == 7) {
                        vyVar.dismiss();
                        vyVar.f36224o1.presentFragment(new gy(vyVar.Q1, yyVar2.f52377m));
                        return;
                    } else if (i24 == 8) {
                        vyVar.d1();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                yz yzVar = (yz) this.f46174b;
                if (view instanceof org.telegram.ui.Cells.h7) {
                    yzVar.f(i7, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    yzVar.f(i7, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.g7) {
                    yzVar.f(i7, view, ((org.telegram.ui.Cells.g7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    yzVar.f(i7, view, ((org.telegram.ui.Cells.h2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.t2) {
                    yzVar.f(i7, view, ((org.telegram.ui.Cells.t2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                f50 f50Var = (f50) this.f46174b;
                if (f50Var.getParentActivity() != null) {
                    if (i7 != f50Var.f45495n && i7 != 0) {
                        if (i7 == f50Var.f45497s) {
                            if (f50Var.f45494f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", f50Var.f45494f.link);
                                    f50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131749109, null)), 500);
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            return;
                        } else if (i7 == f50Var.f45496r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(f50Var.getParentActivity());
                            alertDialog$Builder3.f27292a.T = org.telegram.messenger.hd.M0(2131746027, null);
                            alertDialog$Builder3.f27292a.R = org.telegram.messenger.hd.M0(2131746024, null);
                            alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131746025, null), new wr(f50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            f50Var.showDialog(alertDialog$Builder3.f27292a);
                            return;
                        } else {
                            return;
                        }
                    } else if (f50Var.f45494f != null) {
                        try {
                            ((ClipboardManager) org.telegram.messenger.t0.f25555b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", f50Var.f45494f.link));
                            org.telegram.ui.Components.hc.j(f50Var).j();
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
                m50.Z((m50) this.f46174b, view, i7);
                return;
            case 15:
                z50.Z((z50) this.f46174b, view, i7);
                return;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.f46174b, view, i7);
                return;
            case 17:
                ((bg0) this.f46174b).onBackPressed();
                return;
            case 18:
                jg0 jg0Var = (jg0) this.f46174b;
                int i25 = jg0Var.I;
                if (i7 >= i25 && i7 < jg0Var.J) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg0Var.f46976y.get(i7 - i25);
                    if (ijVar.y4()) {
                        if (!jg0Var.g0(ijVar)) {
                            jg0Var.getOrCreateStoryViewer().L(jg0Var.getParentActivity(), ijVar.f23241l, di.h7.a(jg0Var.f46970f));
                            return;
                        }
                        return;
                    }
                    long B0 = org.telegram.messenger.ij.B0(ijVar.f23237k);
                    Bundle bundle3 = new Bundle();
                    if (org.telegram.messenger.m5.E(B0)) {
                        bundle3.putLong("user_id", B0);
                    } else {
                        bundle3.putLong("chat_id", -B0);
                    }
                    bundle3.putInt("message_id", ijVar.f1());
                    bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                    if (jg0Var.getMessagesController().E(bundle3, jg0Var, null, null)) {
                        jg0Var.presentFragment(new an(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.f46174b, view, i7);
                return;
            case 20:
                gm0 gm0Var = (gm0) this.f46174b;
                gm0Var.a(i7, true);
                tl0 tl0Var = gm0Var.h;
                if (tl0Var != null) {
                    tl0Var.a(Integer.valueOf(i7));
                    return;
                }
                return;
            case 21:
                xm0 xm0Var = (xm0) this.f46174b;
                ArrayList arrayList7 = xm0Var.f51921f;
                ArrayList arrayList8 = xm0Var.f51929n;
                org.telegram.messenger.we weVar = xm0Var.J;
                if (weVar == null && arrayList7.isEmpty()) {
                    if (i7 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i7);
                        ym0 ym0Var = xm0Var.f51938t0;
                        if (ym0Var != null) {
                            switch (ym0Var.f52291a) {
                                case 1:
                                    an0.m0(ym0Var.f52292b, str);
                                    return;
                                default:
                                    an0.m0(ym0Var.f52292b, str);
                                    return;
                            }
                        }
                        xm0Var.P.getSearchField().setText(str);
                        xm0Var.P.getSearchField().setSelection(str.length());
                        xm0Var.g0(xm0Var.P.getSearchField());
                        return;
                    } else if (i7 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xm0Var.getParentActivity());
                        alertDialog$Builder4.f27292a.R = org.telegram.messenger.hd.M0(2131752056, null);
                        alertDialog$Builder4.f27292a.T = org.telegram.messenger.hd.M0(2131752061, null);
                        alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131752099, null), new qm0(xm0Var, 4));
                        alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder4.f27292a;
                        xm0Var.showDialog(u1Var3);
                        TextView textView3 = (TextView) u1Var3.d(-1);
                        if (textView3 != null) {
                            org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.f28089q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                if (weVar != null) {
                    arrayList7 = weVar.f26289e;
                }
                if (i7 >= 0 && i7 < arrayList7.size()) {
                    org.telegram.ui.ActionBar.r0 r0Var = xm0Var.P;
                    if (r0Var != null) {
                        org.telegram.messenger.g0.v1(r0Var.getSearchField());
                    }
                    if (xm0Var.Y) {
                        xm0Var.f0(view, arrayList7.get(i7));
                        return;
                    }
                    int i26 = xm0Var.T;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 != 2) {
                            i12 = 10;
                            if (i26 != 10) {
                                i13 = xm0Var.U == null ? 4 : 0;
                            }
                        }
                        i13 = i12;
                    }
                    PhotoViewer.p1().H2(null, xm0Var, null);
                    PhotoViewer p12 = PhotoViewer.p1();
                    int i27 = xm0Var.H;
                    boolean z17 = xm0Var.I;
                    p12.h = i27;
                    p12.f41458n = z17;
                    PhotoViewer.p1().e2(arrayList7, i7, i13, xm0Var.f51928l0, xm0Var.f51944x0, xm0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f46174b;
                ArrayList arrayList9 = photoViewer.f41398f7;
                if (!arrayList9.isEmpty() && (i11 = photoViewer.O4) >= 0 && i11 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.O4);
                    if (obj instanceof org.telegram.messenger.ze) {
                        ((org.telegram.messenger.ze) obj).f26839s = photoViewer.j1();
                    }
                }
                photoViewer.f41429j5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.O4 = -1;
                    photoViewer.y2(indexOf);
                }
                photoViewer.f41429j5 = false;
                return;
            case 23:
                pr0 pr0Var = (pr0) this.f46174b;
                boolean[] zArr2 = pr0Var.f48944x;
                if (i7 == pr0Var.f48932o0) {
                    pr0Var.k0();
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    boolean z18 = pr0Var.L;
                    org.telegram.ui.Components.ow0 ow0Var = pr0Var.Q;
                    if (ow0Var != null) {
                        ow0Var.f();
                    }
                    if (pr0Var.I) {
                        int i28 = -pr0Var.O;
                        pr0Var.O = i28;
                        org.telegram.messenger.g0.G3(i28, r8Var, null);
                        org.telegram.messenger.p2.APP_ERROR.a();
                        return;
                    }
                    if (i7 == pr0Var.f48936r0) {
                        z9 = !pr0Var.G;
                        pr0Var.G = z9;
                    } else {
                        int i29 = pr0Var.f48940u0;
                        if (i7 == i29) {
                            z9 = !pr0Var.H;
                            pr0Var.H = z9;
                        } else {
                            if (i7 == pr0Var.f48941v0) {
                                z10 = !pr0Var.J;
                                pr0Var.J = z10;
                                pr0Var.w0();
                                int i30 = pr0Var.f48940u0;
                                if (i30 >= 0 && i29 < 0) {
                                    pr0Var.f48915b.i(i30);
                                } else if (i29 >= 0 && i30 < 0) {
                                    pr0Var.f48915b.s(i29);
                                }
                            } else if (i7 == pr0Var.f48938s0) {
                                boolean z19 = pr0Var.K;
                                z10 = !z19;
                                pr0Var.K = z10;
                                if (!z19 && pr0Var.L) {
                                    int i31 = pr0Var.f48927j0;
                                    pr0Var.L = false;
                                    pr0Var.w0();
                                    v4.d1 K = pr0Var.f48917c.K(pr0Var.f48939t0);
                                    if (K != null) {
                                        ((org.telegram.ui.Cells.r8) K.f56952a).setChecked(false);
                                    } else {
                                        pr0Var.f48915b.g(pr0Var.f48939t0);
                                    }
                                    pr0Var.f48915b.p(i31, 2);
                                }
                            } else if (pr0Var.N == 0) {
                                z9 = !pr0Var.L;
                                pr0Var.L = z9;
                                int i32 = pr0Var.f48927j0;
                                pr0Var.w0();
                                if (pr0Var.L) {
                                    pr0Var.f48915b.o(pr0Var.f48927j0, 2);
                                } else {
                                    pr0Var.f48915b.p(i32, 2);
                                }
                                if (pr0Var.L && pr0Var.K) {
                                    pr0Var.K = false;
                                    v4.d1 K2 = pr0Var.f48917c.K(pr0Var.f48938s0);
                                    if (K2 != null) {
                                        ((org.telegram.ui.Cells.r8) K2.f56952a).setChecked(false);
                                    } else {
                                        pr0Var.f48915b.g(pr0Var.f48938s0);
                                    }
                                }
                                if (pr0Var.L) {
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
                    if (pr0Var.M && !pr0Var.L) {
                        pr0Var.f48917c.getChildCount();
                        pr0Var.h.a();
                    }
                    for (int i34 = pr0Var.f48931n0; i34 < pr0Var.f48931n0 + pr0Var.D; i34++) {
                        v4.d1 K3 = pr0Var.f48917c.K(i34);
                        if (K3 != null) {
                            View view2 = K3.f56952a;
                            if (view2 instanceof org.telegram.ui.Cells.a6) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view2;
                                a6Var.m(pr0Var.L, true);
                                a6Var.f28890r.a(zArr2[i34 - pr0Var.f48931n0], z18);
                                if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == pr0Var.f48939t0 && !pr0Var.M) {
                                    pr0Var.h.c(a6Var.getCheckBox());
                                    pr0Var.M = true;
                                }
                            }
                        }
                    }
                    r8Var.setChecked(z9);
                    pr0Var.n0();
                    return;
                } else {
                    return;
                }
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.f46174b, view, i7);
                return;
            case 25:
                us0 us0Var = (us0) this.f46174b;
                PremiumPreviewFragment premiumPreviewFragment = us0Var.f50493n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                br0 br0Var = us0Var.f50491e;
                if (view.isEnabled() && (view instanceof ug.k1)) {
                    ug.k1 k1Var = (ug.k1) view;
                    premiumPreviewFragment.f41609e = arrayList10.indexOf(k1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    k1Var.c(true, true);
                    for (int i35 = 0; i35 < br0Var.getChildCount(); i35++) {
                        View childAt = br0Var.getChildAt(i35);
                        if (childAt instanceof ug.k1) {
                            ug.k1 k1Var2 = (ug.k1) childAt;
                            if (k1Var2.getTier() != k1Var.getTier()) {
                                k1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i36 = 0; i36 < br0Var.getHiddenChildCount(); i36++) {
                        View V = br0Var.V(i36);
                        if (V instanceof ug.k1) {
                            ug.k1 k1Var3 = (ug.k1) V;
                            if (k1Var3.getTier() != k1Var.getTier()) {
                                k1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < br0Var.getCachedChildCount(); i37++) {
                        View P = br0Var.P(i37);
                        if (P instanceof ug.k1) {
                            ug.k1 k1Var4 = (ug.k1) P;
                            if (k1Var4.getTier() != k1Var.getTier()) {
                                k1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < br0Var.getAttachedScrapChildCount(); i38++) {
                        View O = br0Var.O(i38);
                        if (O instanceof ug.k1) {
                            ug.k1 k1Var5 = (ug.k1) O;
                            if (k1Var5.getTier() != k1Var.getTier()) {
                                k1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.J;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((ws0Var = premiumPreviewFragment.f41611f) != null && ws0Var.f51501a.months < ((ws0) arrayList10.get(premiumPreviewFragment.f41609e)).f51501a.months && !premiumPreviewFragment.f41622p0)) {
                        z11 = true;
                    }
                    org.telegram.messenger.g0.X3(frameLayout, z11);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.c0((PrivacyControlActivity) this.f46174b, view, i7);
                return;
            case 27:
                a(i7, view);
                return;
            case 28:
                ProfileActivity.c0((ProfileActivity) this.f46174b, i7);
                return;
            default:
                ProxyListActivity.Z((ProxyListActivity) this.f46174b, view, i7);
                return;
        }
    }
}
