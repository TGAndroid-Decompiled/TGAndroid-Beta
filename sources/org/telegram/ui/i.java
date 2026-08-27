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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

public final class i implements org.telegram.ui.Components.pk0 {

    public final int f38925a;

    public final Object f38926b;

    public i(Object obj, int i10) {
        this.f38925a = i10;
        this.f38926b = obj;
    }

    private final void b(int i10, View view) {
        boolean z10;
        yu0 yu0Var = (yu0) this.f38926b;
        boolean[] zArr = yu0Var.f44945w;
        if (i10 == yu0Var.f44931k0) {
            yu0Var.f0();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.p8) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            boolean z11 = yu0Var.H;
            org.telegram.ui.Components.wx0 wx0Var = yu0Var.M;
            if (wx0Var != null) {
                wx0Var.f();
            }
            if (yu0Var.E) {
                int i11 = -yu0Var.K;
                yu0Var.K = i11;
                AndroidUtilities.shakeViewSpring(p8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == yu0Var.f44934n0) {
                z10 = !yu0Var.C;
                yu0Var.C = z10;
            } else {
                int i12 = yu0Var.f44937q0;
                if (i10 == i12) {
                    z10 = !yu0Var.D;
                    yu0Var.D = z10;
                } else if (i10 == yu0Var.f44939r0) {
                    boolean z12 = !yu0Var.F;
                    yu0Var.F = z12;
                    yu0Var.r0();
                    int i13 = yu0Var.f44937q0;
                    if (i13 >= 0 && i12 < 0) {
                        yu0Var.f44918b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        yu0Var.f44918b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == yu0Var.f44935o0) {
                    boolean z13 = yu0Var.G;
                    boolean z14 = !z13;
                    yu0Var.G = z14;
                    if (!z13 && yu0Var.H) {
                        int i14 = yu0Var.f44926f0;
                        yu0Var.H = false;
                        yu0Var.r0();
                        f2.o1 o1VarK = yu0Var.f44920c.K(yu0Var.f44936p0);
                        if (o1VarK != null) {
                            ((org.telegram.ui.Cells.p8) o1VarK.f5789a).setChecked(false);
                        } else {
                            yu0Var.f44918b.m(yu0Var.f44936p0);
                        }
                        yu0Var.f44918b.t(i14, 2);
                    }
                    z10 = z14;
                } else {
                    if (yu0Var.J != 0) {
                        return;
                    }
                    z10 = !yu0Var.H;
                    yu0Var.H = z10;
                    int i15 = yu0Var.f44926f0;
                    yu0Var.r0();
                    if (yu0Var.H) {
                        yu0Var.f44918b.s(yu0Var.f44926f0, 2);
                    } else {
                        yu0Var.f44918b.t(i15, 2);
                    }
                    if (yu0Var.H && yu0Var.G) {
                        yu0Var.G = false;
                        f2.o1 o1VarK2 = yu0Var.f44920c.K(yu0Var.f44935o0);
                        if (o1VarK2 != null) {
                            ((org.telegram.ui.Cells.p8) o1VarK2.f5789a).setChecked(false);
                        } else {
                            yu0Var.f44918b.m(yu0Var.f44935o0);
                        }
                    }
                    if (yu0Var.H) {
                        boolean z15 = false;
                        for (int i16 = 0; i16 < zArr.length; i16++) {
                            if (z15) {
                                zArr[i16] = false;
                            } else if (zArr[i16]) {
                                z15 = true;
                            }
                        }
                    }
                }
            }
            if (yu0Var.I && !yu0Var.H) {
                yu0Var.h.b(true);
            }
            yu0Var.f44920c.getChildCount();
            for (int i17 = yu0Var.f44930j0; i17 < yu0Var.f44930j0 + yu0Var.f44949y; i17++) {
                f2.o1 o1VarK3 = yu0Var.f44920c.K(i17);
                if (o1VarK3 != null) {
                    View view2 = o1VarK3.f5789a;
                    if (view2 instanceof org.telegram.ui.Cells.z5) {
                        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view2;
                        z5Var.m(yu0Var.H, true);
                        z5Var.f26037r.a(zArr[i17 - yu0Var.f44930j0], z11);
                        if (z5Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == yu0Var.f44936p0 && !yu0Var.I) {
                            yu0Var.h.f(z5Var.getCheckBox(), true);
                            yu0Var.I = true;
                        }
                    }
                }
            }
            p8Var.setChecked(z10);
            yu0Var.i0();
        }
    }

    private final void c(int i10, View view) {
        hw0 hw0Var;
        fw0 fw0Var = (fw0) this.f38926b;
        PremiumPreviewFragment premiumPreviewFragment = fw0Var.f38219n;
        ArrayList arrayList = premiumPreviewFragment.d;
        cw0 cw0Var = fw0Var.f38217e;
        if (view.isEnabled() && (view instanceof ag.e3)) {
            ag.e3 e3Var = (ag.e3) view;
            premiumPreviewFragment.f35849e = arrayList.indexOf(e3Var.getTier());
            boolean z10 = true;
            premiumPreviewFragment.t0(true);
            e3Var.c(true, true);
            for (int i11 = 0; i11 < cw0Var.getChildCount(); i11++) {
                View childAt = cw0Var.getChildAt(i11);
                if (childAt instanceof ag.e3) {
                    ag.e3 e3Var2 = (ag.e3) childAt;
                    if (e3Var2.getTier() != e3Var.getTier()) {
                        e3Var2.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < cw0Var.getHiddenChildCount(); i12++) {
                View viewV = cw0Var.V(i12);
                if (viewV instanceof ag.e3) {
                    ag.e3 e3Var3 = (ag.e3) viewV;
                    if (e3Var3.getTier() != e3Var.getTier()) {
                        e3Var3.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < cw0Var.getCachedChildCount(); i13++) {
                View viewP = cw0Var.P(i13);
                if (viewP instanceof ag.e3) {
                    ag.e3 e3Var4 = (ag.e3) viewP;
                    if (e3Var4.getTier() != e3Var.getTier()) {
                        e3Var4.c(false, true);
                    }
                }
            }
            for (int i14 = 0; i14 < cw0Var.getAttachedScrapChildCount(); i14++) {
                View viewO = cw0Var.O(i14);
                if (viewO instanceof ag.e3) {
                    ag.e3 e3Var5 = (ag.e3) viewO;
                    if (e3Var5.getTier() != e3Var.getTier()) {
                        e3Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.F;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((hw0Var = premiumPreviewFragment.f35851f) == null || hw0Var.f38895a.months >= ((hw0) arrayList.get(premiumPreviewFragment.f35849e)).f38895a.months || premiumPreviewFragment.f35858l0)) {
                z10 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10);
        }
    }

    private final void d(int i10, View view) {
        cx0 cx0Var = (cx0) this.f38926b;
        int i11 = cx0Var.f37190y;
        if (i10 == cx0Var.f37188w) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.y4.O(cx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ax0(cx0Var), null).f22702a;
            b2Var.show();
            b2Var.h();
            return;
        }
        if (i10 != cx0Var.f37184f) {
            if (i10 < cx0Var.f37186r || i10 >= cx0Var.f37187s) {
                return;
            }
            if (i11 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cx0Var.getMessagesController().blockePeers.keyAt(i10 - cx0Var.f37186r));
            cx0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i11 != 1) {
            Bundle bundleH = a9.p.h("isNeverShare", true);
            if (i11 == 2) {
                bundleH.putInt("chatAddType", 2);
            }
            o60 o60Var = new o60(bundleH);
            o60Var.f41017w = new zw0(cx0Var);
            cx0Var.presentFragment(o60Var);
            return;
        }
        ev evVar = new ev(null);
        evVar.d = new Paint();
        evVar.f37857f = new dv[2];
        evVar.f37861w = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        gy gyVar = new gy(bundle2);
        evVar.f37853a = gyVar;
        gyVar.f38621y2 = new bv(evVar);
        gyVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        evVar.f37854b = contactsActivity;
        contactsActivity.S = new bv(evVar);
        contactsActivity.onFragmentCreate();
        cx0Var.presentFragment(evVar);
    }

    @Override
    public final void a(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String string2;
        st stVar;
        h00 h00Var;
        org.telegram.ui.Components.mc mcVarA0;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        org.telegram.ui.Components.up0 up0Var;
        int i13 = 8;
        int i14 = 3;
        int i15 = 4;
        nt ntVarY = null;
        i = 1;
        int i16 = 1;
        switch (this.f38925a) {
            case 0:
                m mVar = (m) this.f38926b;
                ArrayList arrayList = mVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((k) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = mVar.d;
                        boolean z10 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z10;
                        ((org.telegram.ui.Cells.p8) view).setChecked(z10);
                        mVar.f40276c = true;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = mVar.d;
                        boolean z11 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z11;
                        ((org.telegram.ui.Cells.p8) view).setChecked(z11);
                        mVar.f40276c = true;
                    } else if (i17 == 7) {
                        if (mVar.getUserConfig().isPremium() || mVar.getMessagesController().autoarchiveAvailable || mVar.d.archive_and_mute_new_noncontact_peers) {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = mVar.d;
                            boolean z12 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z12;
                            ((org.telegram.ui.Cells.p8) view).setChecked(z12);
                            mVar.f40276c = true;
                        } else {
                            org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(mVar.getParentActivity(), mVar.getResourceProvider());
                            org.telegram.ui.Components.p80 p80Var = wbVar.f34154b;
                            p80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.g6.Gi, 0, new lt0(mVar, i14)));
                            p80Var.setSingleLine(false);
                            p80Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            wbVar.f34153a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.ec.g(mVar, wbVar, 3500).j();
                            int i18 = -mVar.f40277e;
                            mVar.f40277e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        }
                    }
                    break;
                }
                break;
            case 1:
                q qVar = (q) this.f38926b;
                if (i10 >= qVar.f41466x && i10 < qVar.f41467y && qVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) qVar.h.get(i10 - qVar.f41466x);
                    if (stickerSetCovered.set.f22407id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f22400id = stickerSetCovered.set.f22407id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.ex0 ex0Var = new org.telegram.ui.Components.ex0(qVar.getParentActivity(), qVar, inputStickerSet, null, null, null);
                    ex0Var.Y = new o(qVar, view, stickerSetCovered);
                    qVar.showDialog(ex0Var);
                    break;
                }
                break;
            case 2:
                vc vcVar = (vc) this.f38926b;
                ArrayList arrayList2 = vcVar.f43417c;
                ta1 ta1Var = vcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.zo zoVar = (org.telegram.ui.Components.zo) arrayList2.get(i10);
                    vcVar.a(zoVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + ta1Var.getPaddingLeft()) {
                        ta1Var.v0(-((AndroidUtilities.dp(48.0f) + ta1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (ta1Var.getMeasuredWidth() - ta1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        ta1Var.v0(org.telegram.messenger.y1.A(48.0f, ta1Var.getMeasuredWidth() - ta1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = vcVar.f43421r;
                    if (callback != null) {
                        callback.run(zoVar.a());
                    }
                    break;
                }
                break;
            case 3:
                jp jpVar = (jp) this.f38926b;
                boolean z13 = jpVar.f39457s;
                if (jpVar.getParentActivity() != null) {
                    f2.q0 adapter = jpVar.f39451b.getAdapter();
                    ip ipVar = jpVar.f39453e;
                    if (adapter == ipVar) {
                        chat = (TLRPC.Chat) ipVar.d.get(i10);
                    } else {
                        int i19 = jpVar.C;
                        chat = (i10 < i19 || i10 >= jpVar.D) ? null : (TLRPC.Chat) jpVar.v.get(i10 - i19);
                    }
                    if (chat != null) {
                        if (z13 && jpVar.h.linked_chat_id == 0) {
                            jpVar.a0(chat, true);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.f22380id);
                            jpVar.presentFragment(new rn(bundle));
                        }
                        break;
                    } else if (i10 == jpVar.B) {
                        if (z13 && jpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{jpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = jpVar.f39454f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            u60 u60Var = new u60(bundle2);
                            u60Var.U = new bp(jpVar);
                            jpVar.presentFragment(u60Var);
                            break;
                        } else if (!jpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) jpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jpVar.getParentActivity());
                            if (z13) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                string2 = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                string2 = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.f22702a.N = string;
                            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(string2);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new c1(jpVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                            jpVar.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                            }
                            break;
                        }
                    }
                }
                break;
            case 4:
                qp qpVar = (qp) this.f38926b;
                ArrayList arrayList3 = qpVar.f41724r;
                boolean z14 = qpVar.C;
                if (i10 > (z14 ? 1 : 2)) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - (z14 ? 2 : 3));
                    boolean zContains = qpVar.d.contains(tL_availableReaction.reaction);
                    boolean z15 = !zContains;
                    if (zContains) {
                        qpVar.d.remove(tL_availableReaction.reaction);
                        if (qpVar.d.isEmpty()) {
                            pp ppVar = qpVar.h;
                            if (ppVar != null) {
                                ppVar.t(qpVar.C ? 1 : 2, arrayList3.size() + 1);
                            }
                            qpVar.V(2, true);
                        }
                    } else {
                        qpVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r10 = yVar.f25969c;
                    if (r10 != null) {
                        r10.c(z15, true);
                    }
                    org.telegram.ui.Components.bp bpVar = yVar.d;
                    if (bpVar != null) {
                        bpVar.a(z15, true);
                    }
                    break;
                }
                break;
            case 5:
                ft ftVar = (ft) this.f38926b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((jt) view).d;
                kt ktVar = ftVar.f38203a;
                ig.d0 reactionsWindow = ktVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f11282q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.kx0.c(null, ktVar.f39859c0, ktVar.f39881z.getContext(), new b5(ftVar, 9));
                } else {
                    ht htVar = ktVar.f39868l;
                    if (htVar != null) {
                        htVar.u(stickerSetCovered2.set, TextUtils.join("", ktVar.f39871o));
                    }
                    ktVar.p();
                }
                break;
            case 6:
                tt ttVar = (tt) this.f38926b;
                if (ttVar.f43008f && ttVar.f43007e) {
                    rt rtVar = ttVar.d;
                    ArrayList arrayList4 = rtVar.f42327e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        ntVarY = (nt) rtVar.f42327e.get(i10);
                    }
                } else {
                    int iS = ttVar.f43006c.S(i10);
                    int iQ = ttVar.f43006c.Q(i10);
                    if (iQ >= 0 && iS >= 0) {
                        ntVarY = ttVar.f43006c.O(iS, iQ);
                    }
                }
                if (i10 >= 0) {
                    ttVar.finishFragment();
                    if (ntVarY != null && (stVar = ttVar.f43010r) != null) {
                        stVar.Z0(ntVarY);
                        break;
                    }
                }
                break;
            case 7:
                nu nuVar = (nu) this.f38926b;
                ArrayList arrayList5 = nuVar.Y2;
                ru ruVar = nuVar.f40939k3;
                if ((view instanceof gu) && i10 >= 0 && i10 < arrayList5.size()) {
                    iu iuVar = (iu) arrayList5.get(i10);
                    if (iuVar != null) {
                        int i20 = iuVar.h;
                        if (i20 >= 0) {
                            boolean[] zArr = nuVar.f40933e3;
                            zArr[i20] = !zArr[i20];
                            nuVar.A1(true);
                        } else if (i20 == -2) {
                            ruVar.presentFragment(new DataAutoDownloadActivity(nuVar.U2 - 1));
                        }
                    }
                } else if (view instanceof org.telegram.ui.Cells.l8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ruVar.getParentActivity());
                    alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new ju(nuVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                    ruVar.showDialog(b2Var2);
                    TextView textView2 = (TextView) b2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                    }
                }
                break;
            case 8:
                oz.V((oz) this.f38926b, view, i10);
                break;
            case 9:
                q00 q00Var = (q00) this.f38926b;
                if (q00Var.getParentActivity() != null && (h00Var = (h00) q00Var.L.get(i10)) != null) {
                    View.OnClickListener onClickListener = h00Var.f38643c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    } else {
                        int i21 = h00Var.f49413a;
                        if (i21 == 1) {
                            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
                            q00Var.v0(h00Var, saVar.getName(), saVar.getCurrentObject(), h00Var.f38646g);
                        } else if (i21 == 7) {
                            org.telegram.ui.Components.r61 r61Var = new org.telegram.ui.Components.r61(20, q00Var, h00Var);
                            if (q00Var.f41473c.isEnabled()) {
                                q00Var.s0(r61Var, false);
                            } else {
                                r61Var.run();
                            }
                        } else if (i21 == 8 || (i21 == 4 && h00Var.f38649k == R.drawable.msg2_link2)) {
                            MessagesController.DialogFilter dialogFilter = q00Var.f41477r;
                            org.telegram.ui.ActionBar.c6 c6Var = null;
                            if (q00Var.f41478s && q00Var.f41473c.getAlpha() > 0.0f) {
                                float f10 = -q00Var.M;
                                q00Var.M = f10;
                                AndroidUtilities.shakeViewSpring(view, f10);
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                q00Var.v = true;
                                yi yiVar = q00Var.N;
                                if (yiVar == null || yiVar.getVisibility() != 0) {
                                    yi yiVar2 = new yi(6, 3, q00Var.getParentActivity(), c6Var, true);
                                    q00Var.N = yiVar2;
                                    yiVar2.f34451a.setMaxWidth(AndroidUtilities.displaySize.x);
                                    q00Var.N.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                    q00Var.N.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                    q00Var.getParentLayout().getOverlayContainerView().addView(q00Var.N, marginLayoutParams);
                                    q00Var.N.f(q00Var.f41473c, true);
                                }
                            } else if (!(TextUtils.isEmpty(q00Var.f41479w) && TextUtils.isEmpty(dialogFilter.name)) && (q00Var.f41481y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && q00Var.C.isEmpty() && !q00Var.B.isEmpty()) {
                                q00Var.s0(new sz(q00Var, 1), false);
                            } else {
                                float f11 = -q00Var.M;
                                q00Var.M = f11;
                                AndroidUtilities.shakeViewSpring(view, f11);
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                if (TextUtils.isEmpty(q00Var.f41479w) && TextUtils.isEmpty(dialogFilter.name)) {
                                    mcVarA0 = org.telegram.ui.Components.mc.a0(q00Var);
                                    i11 = R.string.FilterInviteErrorEmptyName;
                                } else if ((q00Var.f41481y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                    if (q00Var.C.isEmpty()) {
                                        mcVarA0 = org.telegram.ui.Components.mc.a0(q00Var);
                                        i11 = R.string.FilterInviteErrorTypes;
                                    } else {
                                        mcVarA0 = org.telegram.ui.Components.mc.a0(q00Var);
                                        i11 = R.string.FilterInviteErrorTypesExcluded;
                                    }
                                } else if (q00Var.B.isEmpty()) {
                                    mcVarA0 = org.telegram.ui.Components.mc.a0(q00Var);
                                    i11 = R.string.FilterInviteErrorEmpty;
                                } else {
                                    mcVarA0 = org.telegram.ui.Components.mc.a0(q00Var);
                                    i11 = R.string.FilterInviteErrorExcluded;
                                }
                                org.telegram.messenger.y1.r(i11, mcVarA0, null);
                            }
                        }
                    }
                }
                break;
            case 10:
                d00 d00Var = (d00) this.f38926b;
                ArrayList arrayList6 = d00Var.Z;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    h00 h00Var2 = (h00) arrayList6.get(i22);
                    int i23 = h00Var2.f49413a;
                    if (i23 == 7) {
                        d00Var.dismiss();
                        d00Var.f31855n.presentFragment(new oz(d00Var.T, h00Var2.f38651m));
                    } else if (i23 == 8) {
                        d00Var.Q();
                    }
                    break;
                }
                break;
            case 11:
                i10 i10Var = (i10) this.f38926b;
                if (view instanceof org.telegram.ui.Cells.f7) {
                    i10Var.f(i10, view, ((org.telegram.ui.Cells.f7) view).getMessage(), 0);
                } else if (view instanceof org.telegram.ui.Cells.i7) {
                    i10Var.f(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                } else if (view instanceof org.telegram.ui.Cells.e7) {
                    i10Var.f(i10, view, ((org.telegram.ui.Cells.e7) view).getMessage(), 0);
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    i10Var.f(i10, view, ((org.telegram.ui.Cells.d2) view).getMessageObject(), 0);
                } else if (view instanceof org.telegram.ui.Cells.p2) {
                    i10Var.f(i10, view, ((org.telegram.ui.Cells.p2) view).getMessage(), 0);
                }
                break;
            case 12:
                w60 w60Var = (w60) this.f38926b;
                if (w60Var.getParentActivity() != null) {
                    if (i10 == w60Var.f43628n || i10 == 0) {
                        if (w60Var.f43627f != null) {
                            try {
                                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", w60Var.f43627f.link));
                                org.telegram.ui.Components.mc.j(w60Var).j();
                            } catch (Exception e9) {
                                FileLog.e(e9);
                                return;
                            }
                            break;
                        }
                    } else if (i10 != w60Var.f43630s) {
                        if (i10 == w60Var.f43629r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(w60Var.getParentActivity());
                            alertDialog$Builder3.f22702a.P = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new zt(w60Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            w60Var.showDialog(alertDialog$Builder3.f22702a);
                        }
                        break;
                    } else if (w60Var.f43627f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", w60Var.f43627f.link);
                            w60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 13:
                c70.U((c70) this.f38926b, view, i10);
                break;
            case 14:
                t70.U((t70) this.f38926b, view, i10);
                break;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f38926b, view, i10);
                break;
            case 16:
                tc0 tc0Var = (tc0) this.f38926b;
                tc0Var.f42863e0 = -1L;
                int i24 = tc0Var.C0;
                if (i24 != 4) {
                    if (i24 != 5) {
                        if (i10 == 1 && (messageObject = tc0Var.f42887x0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                            IMapsProvider.IMap iMap = tc0Var.E;
                            if (iMap != null) {
                                IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                                TLRPC.GeoPoint geoPoint = tc0Var.f42887x0.messageOwner.media.geo;
                                iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), tc0Var.E.getMaxZoomLevel() - 4.0f));
                            }
                            break;
                        } else if (i10 != 1 || i24 == 2) {
                            if (i24 == 2 && tc0Var.getLocationController().isSharingLocation(tc0Var.f42856a0) && tc0Var.P.j(i10) == 7) {
                                tc0Var.getLocationController().removeSharingLocation(tc0Var.f42856a0);
                                tc0Var.P.l();
                                tc0Var.finishFragment();
                            } else if (i24 == 2 && tc0Var.getLocationController().isSharingLocation(tc0Var.f42856a0) && tc0Var.P.j(i10) == 6) {
                                tc0Var.s0(tc0Var.getLocationController().getSharingLocationInfo(tc0Var.f42856a0).period != Integer.MAX_VALUE);
                            } else if ((i10 != 2 || i24 != 1) && ((i10 != 1 || i24 != 2) && (i10 != 3 || i24 != 3))) {
                                Object objJ = tc0Var.P.J(i10);
                                if (objJ instanceof TLRPC.TL_messageMediaVenue) {
                                    tc0Var.B0.d((TLRPC.TL_messageMediaVenue) objJ, tc0Var.C0, true, 0, 0L);
                                    tc0Var.finishFragment();
                                } else if (objJ instanceof nc0) {
                                    nc0 nc0Var = (nc0) objJ;
                                    tc0Var.f42863e0 = nc0Var.f40729a;
                                    if (tc0Var.f42865f0) {
                                        tc0Var.f42865f0 = false;
                                        tc0Var.C0();
                                    }
                                    tc0Var.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(nc0Var.f40732e.getPosition(), tc0Var.E.getMaxZoomLevel() - 4.0f));
                                }
                            } else if (tc0Var.getLocationController().isSharingLocation(tc0Var.f42856a0)) {
                                tc0Var.getLocationController().removeSharingLocation(tc0Var.f42856a0);
                                tc0Var.P.l();
                                tc0Var.finishFragment();
                            } else {
                                tc0Var.s0(false);
                            }
                            break;
                        } else if (tc0Var.B0 != null && tc0Var.f42881t0 != null) {
                            FrameLayout frameLayout = tc0Var.f42870k0;
                            if (frameLayout != null) {
                                frameLayout.callOnClick();
                            } else {
                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                tL_messageMediaGeo.geo = tL_geoPoint;
                                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(tc0Var.f42881t0.getLatitude());
                                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(tc0Var.f42881t0.getLongitude());
                                tc0Var.B0.d(tL_messageMediaGeo, tc0Var.C0, true, 0, 0L);
                                tc0Var.finishFragment();
                            }
                            break;
                        }
                    } else {
                        IMapsProvider.IMap iMap2 = tc0Var.E;
                        if (iMap2 != null) {
                            IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint2 = tc0Var.f42883v0.geo_point;
                            iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), tc0Var.E.getMaxZoomLevel() - 4.0f));
                        }
                        break;
                    }
                } else if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) tc0Var.P.J(i10)) != null) {
                    if (tc0Var.f42856a0 == 0) {
                        tc0Var.B0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                        tc0Var.finishFragment();
                    } else {
                        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(tc0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = tc0Var.getMessagesController().getInputChannel(-tc0Var.f42856a0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint3.lat;
                        tL_inputGeoPoint._long = geoPoint3._long;
                        b2VarArr[0].setOnCancelListener(new hh.x(tc0Var, tc0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new z9(tc0Var, b2VarArr, tL_messageMediaVenue, 19)), i13));
                        tc0Var.showDialog(b2VarArr[0]);
                    }
                    break;
                }
                break;
            case 17:
                ((ni0) this.f38926b).onBackPressed();
                break;
            case 18:
                vi0 vi0Var = (vi0) this.f38926b;
                int i25 = vi0Var.E;
                if (i10 >= i25 && i10 < vi0Var.F) {
                    MessageObject messageObject2 = (MessageObject) vi0Var.f43477x.get(i10 - i25);
                    if (!messageObject2.isStory()) {
                        long dialogId = MessageObject.getDialogId(messageObject2.messageOwner);
                        Bundle bundle3 = new Bundle();
                        if (DialogObject.isUserDialog(dialogId)) {
                            bundle3.putLong("user_id", dialogId);
                        } else {
                            bundle3.putLong("chat_id", -dialogId);
                        }
                        bundle3.putInt("message_id", messageObject2.getId());
                        bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                        if (vi0Var.getMessagesController().checkCanOpenChat(bundle3, vi0Var)) {
                            vi0Var.presentFragment(new rn(bundle3));
                        }
                        break;
                    } else if (!vi0Var.a0(messageObject2)) {
                        vi0Var.getOrCreateStoryViewer().G(vi0Var.getParentActivity(), messageObject2.storyItem, jh.b7.a(vi0Var.f43472f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.f38926b, view, i10);
                break;
            case 20:
                aq0 aq0Var = (aq0) this.f38926b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = aq0Var.f36605f;
                ArrayList arrayList8 = aq0Var.f36613n;
                MediaController.AlbumEntry albumEntry = aq0Var.F;
                if (albumEntry != null || !arrayList7.isEmpty()) {
                    if (albumEntry != null) {
                        arrayList7 = albumEntry.photos;
                    }
                    if (i10 >= 0 && i10 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.v0 v0Var = aq0Var.L;
                        if (v0Var != null) {
                            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
                        }
                        if (aq0Var.U) {
                            aq0Var.a0(view, arrayList7.get(i10));
                        } else {
                            int i26 = aq0Var.P;
                            if (i26 != 1 && i26 != 3) {
                                if (i26 == 2) {
                                    i16 = 3;
                                } else if (i26 == 10) {
                                    i16 = 10;
                                } else {
                                    i16 = aq0Var.Q == null ? 4 : 0;
                                }
                            }
                            PhotoViewer.t1().K2(null, aq0Var, null);
                            PhotoViewer photoViewerT1 = PhotoViewer.t1();
                            int i27 = aq0Var.D;
                            boolean z16 = aq0Var.E;
                            photoViewerT1.h = i27;
                            photoViewerT1.f35700n = z16;
                            PhotoViewer.t1().f2(arrayList7, i10, i16, aq0Var.f36608h0, aq0Var.f36622t0, aq0Var.Q);
                        }
                        break;
                    }
                } else if (i10 >= arrayList8.size()) {
                    if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(aq0Var.getParentActivity());
                        alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f22702a.P = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new np0(aq0Var, i15));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder4.f22702a;
                        aq0Var.showDialog(b2Var3);
                        TextView textView3 = (TextView) b2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                        }
                    }
                    break;
                } else {
                    String str = (String) arrayList8.get(i10);
                    eq0 eq0Var = aq0Var.f36616p0;
                    if (eq0Var == null) {
                        aq0Var.L.getSearchField().setText(str);
                        aq0Var.L.getSearchField().setSelection(str.length());
                        aq0Var.b0(aq0Var.L.getSearchField());
                        break;
                    } else {
                        switch (eq0Var.f37809a) {
                            case 0:
                                fq0.h0(eq0Var.f37810b, str);
                                break;
                            default:
                                fq0.h0(eq0Var.f37810b, str);
                                break;
                        }
                    }
                }
                break;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) this.f38926b;
                ArrayList arrayList9 = photoViewer.f35608c7;
                if (!arrayList9.isEmpty() && (i12 = photoViewer.L4) >= 0 && i12 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.L4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f35644g5 = true;
                int iIndexOf = arrayList9.indexOf(view.getTag());
                if (iIndexOf >= 0) {
                    photoViewer.L4 = -1;
                    photoViewer.B2(iIndexOf);
                }
                photoViewer.f35644g5 = false;
                break;
            case 22:
                b(i10, view);
                break;
            case 23:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f38926b, view, i10);
                break;
            case 24:
                c(i10, view);
                break;
            case 25:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f38926b, view, i10);
                break;
            case 26:
                d(i10, view);
                break;
            case 27:
                ProfileActivity.f0((ProfileActivity) this.f38926b, i10);
                break;
            case 28:
                ProxyListActivity.U((ProxyListActivity) this.f38926b, view, i10);
                break;
            default:
                x11 x11Var = (x11) this.f38926b;
                org.telegram.ui.Components.zk0 zk0Var = x11Var.f44257y;
                org.telegram.ui.Components.yo yoVar = x11Var.f44248b;
                if (yoVar.d.get(i10) != x11Var.G && x11Var.K == null) {
                    x11Var.M = false;
                    x11Var.G = (org.telegram.ui.Components.zo) yoVar.d.get(i10);
                    yoVar.E(i10);
                    x11Var.h.postDelayed(new org.telegram.ui.Components.xl(x11Var, i10, 23), 100L);
                    for (int i28 = 0; i28 < zk0Var.getChildCount(); i28++) {
                        org.telegram.ui.Components.b11 b11Var = (org.telegram.ui.Components.b11) zk0Var.getChildAt(i28);
                        if (b11Var != view && (up0Var = b11Var.F) != null) {
                            AndroidUtilities.cancelRunOnUIThread(up0Var);
                            b11Var.F.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.zo) yoVar.d.get(i10)).f35316a.f22780a) {
                        ((org.telegram.ui.Components.b11) view).d();
                    }
                    k11 k11Var = x11Var.F;
                    if (k11Var != null) {
                        k11Var.f39572a.d0(i10, x11Var.G.f35316a, true);
                    }
                    break;
                }
                break;
        }
    }
}
