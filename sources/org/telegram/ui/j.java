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
public final class j implements org.telegram.ui.Components.il0 {
    public final int f35187a;
    public final Object f35188b;

    public j(Object obj, int i10) {
        this.f35187a = i10;
        this.f35188b = obj;
    }

    private final void a(int i10, View view) {
        boolean z4;
        fv0 fv0Var = (fv0) this.f35188b;
        boolean[] zArr = fv0Var.f34400w;
        if (i10 == fv0Var.f34387l0) {
            fv0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.s8) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            boolean z10 = fv0Var.I;
            org.telegram.ui.Components.qy0 qy0Var = fv0Var.N;
            if (qy0Var != null) {
                qy0Var.f();
            }
            if (fv0Var.F) {
                int i11 = -fv0Var.L;
                fv0Var.L = i11;
                AndroidUtilities.shakeViewSpring(s8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == fv0Var.f34390o0) {
                z4 = !fv0Var.D;
                fv0Var.D = z4;
            } else {
                int i12 = fv0Var.f34394r0;
                if (i10 == i12) {
                    z4 = !fv0Var.E;
                    fv0Var.E = z4;
                } else if (i10 == fv0Var.f34396s0) {
                    boolean z11 = !fv0Var.G;
                    fv0Var.G = z11;
                    fv0Var.r0();
                    int i13 = fv0Var.f34394r0;
                    if (i13 >= 0 && i12 < 0) {
                        fv0Var.f34374b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        fv0Var.f34374b.u(i12);
                    }
                    z4 = z11;
                } else if (i10 == fv0Var.f34391p0) {
                    boolean z12 = fv0Var.H;
                    boolean z13 = !z12;
                    fv0Var.H = z13;
                    if (!z12 && fv0Var.I) {
                        int i14 = fv0Var.f34382g0;
                        fv0Var.I = false;
                        fv0Var.r0();
                        f2.l1 K = fv0Var.f34376c.K(fv0Var.f34392q0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.s8) K.f5785a).setChecked(false);
                        } else {
                            fv0Var.f34374b.m(fv0Var.f34392q0);
                        }
                        fv0Var.f34374b.t(i14, 2);
                    }
                    z4 = z13;
                } else if (fv0Var.K == 0) {
                    z4 = !fv0Var.I;
                    fv0Var.I = z4;
                    int i15 = fv0Var.f34382g0;
                    fv0Var.r0();
                    if (fv0Var.I) {
                        fv0Var.f34374b.s(fv0Var.f34382g0, 2);
                    } else {
                        fv0Var.f34374b.t(i15, 2);
                    }
                    if (fv0Var.I && fv0Var.H) {
                        fv0Var.H = false;
                        f2.l1 K2 = fv0Var.f34376c.K(fv0Var.f34391p0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.s8) K2.f5785a).setChecked(false);
                        } else {
                            fv0Var.f34374b.m(fv0Var.f34391p0);
                        }
                    }
                    if (fv0Var.I) {
                        boolean z14 = false;
                        for (int i16 = 0; i16 < zArr.length; i16++) {
                            if (z14) {
                                zArr[i16] = false;
                            } else if (zArr[i16]) {
                                z14 = true;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            if (fv0Var.J && !fv0Var.I) {
                fv0Var.h.b(true);
            }
            fv0Var.f34376c.getChildCount();
            for (int i17 = fv0Var.f34386k0; i17 < fv0Var.f34386k0 + fv0Var.f34404y; i17++) {
                f2.l1 K3 = fv0Var.f34376c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f5785a;
                    if (view2 instanceof org.telegram.ui.Cells.c6) {
                        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view2;
                        c6Var.m(fv0Var.I, true);
                        c6Var.f20920r.a(zArr[i17 - fv0Var.f34386k0], z10);
                        if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == fv0Var.f34392q0 && !fv0Var.J) {
                            fv0Var.h.f(c6Var.getCheckBox(), true);
                            fv0Var.J = true;
                        }
                    }
                }
            }
            s8Var.setChecked(z4);
            fv0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        qw0 qw0Var;
        ow0 ow0Var = (ow0) this.f35188b;
        PremiumPreviewFragment premiumPreviewFragment = ow0Var.f36994n;
        ArrayList arrayList = premiumPreviewFragment.d;
        lw0 lw0Var = ow0Var.e;
        if (view.isEnabled() && (view instanceof eg.k2)) {
            eg.k2 k2Var = (eg.k2) view;
            premiumPreviewFragment.e = arrayList.indexOf(k2Var.getTier());
            boolean z4 = true;
            premiumPreviewFragment.t0(true);
            k2Var.c(true, true);
            for (int i11 = 0; i11 < lw0Var.getChildCount(); i11++) {
                View childAt = lw0Var.getChildAt(i11);
                if (childAt instanceof eg.k2) {
                    eg.k2 k2Var2 = (eg.k2) childAt;
                    if (k2Var2.getTier() != k2Var.getTier()) {
                        k2Var2.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < lw0Var.getHiddenChildCount(); i12++) {
                View V = lw0Var.V(i12);
                if (V instanceof eg.k2) {
                    eg.k2 k2Var3 = (eg.k2) V;
                    if (k2Var3.getTier() != k2Var.getTier()) {
                        k2Var3.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < lw0Var.getCachedChildCount(); i13++) {
                View P = lw0Var.P(i13);
                if (P instanceof eg.k2) {
                    eg.k2 k2Var4 = (eg.k2) P;
                    if (k2Var4.getTier() != k2Var.getTier()) {
                        k2Var4.c(false, true);
                    }
                }
            }
            for (int i14 = 0; i14 < lw0Var.getAttachedScrapChildCount(); i14++) {
                View O = lw0Var.O(i14);
                if (O instanceof eg.k2) {
                    eg.k2 k2Var5 = (eg.k2) O;
                    if (k2Var5.getTier() != k2Var.getTier()) {
                        k2Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.G;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((qw0Var = premiumPreviewFragment.f31959f) == null || qw0Var.f37853a.months >= ((qw0) arrayList.get(premiumPreviewFragment.e)).f37853a.months || premiumPreviewFragment.m0)) {
                z4 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z4);
        }
    }

    private final void c(int i10, View view) {
        mx0 mx0Var = (mx0) this.f35188b;
        int i11 = mx0Var.f36409y;
        if (i10 == mx0Var.f36407w) {
            org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.O(mx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new kx0(mx0Var), null).f19503a;
            d2Var.show();
            d2Var.h();
        } else if (i10 == mx0Var.f36403f) {
            if (i11 == 1) {
                ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
                p2Var.d = new Paint();
                p2Var.f35821f = new jv[2];
                p2Var.f35825w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                oy oyVar = new oy(bundle);
                p2Var.f35818a = oyVar;
                oyVar.f37131z2 = new hv(p2Var);
                oyVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                p2Var.f35819b = contactsActivity;
                contactsActivity.T = new hv(p2Var);
                contactsActivity.onFragmentCreate();
                mx0Var.presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
                return;
            }
            Bundle i12 = android.support.v4.media.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            y60 y60Var = new y60(i12);
            y60Var.f40435w = new jx0(mx0Var);
            mx0Var.presentFragment(y60Var);
        } else if (i10 >= mx0Var.f36405r && i10 < mx0Var.f36406s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", mx0Var.getMessagesController().blockePeers.keyAt(i10 - mx0Var.f36405r));
                mx0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        String string;
        String formatString;
        int i11;
        int i12;
        xt xtVar;
        boolean[] zArr;
        s00 s00Var;
        org.telegram.ui.Components.qc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        org.telegram.ui.Components.nq0 nq0Var;
        int i15 = 3;
        st stVar = null;
        boolean z4 = true;
        r5 = 1;
        int i16 = 1;
        switch (this.f35187a) {
            case 0:
                n nVar = (n) this.f35188b;
                ArrayList arrayList = nVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((l) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = nVar.d;
                        boolean z10 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z10;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z10);
                        nVar.f36418c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = nVar.d;
                        boolean z11 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z11;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z11);
                        nVar.f36418c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!nVar.getUserConfig().isPremium() && !nVar.getMessagesController().autoarchiveAvailable && !nVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(nVar.getParentActivity(), nVar.getResourceProvider());
                            org.telegram.ui.Components.e90 e90Var = acVar.f23342b;
                            e90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.j6.Gi, 0, new rt0(nVar, 3)));
                            e90Var.setSingleLine(false);
                            e90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            acVar.f23341a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.ic.g(nVar, acVar, 3500).j();
                            int i18 = -nVar.e;
                            nVar.e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = nVar.d;
                        boolean z12 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z12;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z12);
                        nVar.f36418c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                r rVar = (r) this.f35188b;
                if (i10 >= rVar.f37890x && i10 < rVar.f37891y && rVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) rVar.h.get(i10 - rVar.f37890x);
                    if (stickerSetCovered.set.f19211id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f19204id = stickerSetCovered.set.f19211id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.xx0 xx0Var = new org.telegram.ui.Components.xx0(rVar.getParentActivity(), rVar, inputStickerSet, null, null, null);
                    xx0Var.Z = new p(rVar, view, stickerSetCovered);
                    rVar.showDialog(xx0Var);
                    return;
                }
                return;
            case 2:
                zc zcVar = (zc) this.f35188b;
                ArrayList arrayList2 = zcVar.f40757c;
                jb1 jb1Var = zcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.jp jpVar = (org.telegram.ui.Components.jp) arrayList2.get(i10);
                    zcVar.a(jpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + jb1Var.getPaddingLeft()) {
                        jb1Var.v0(-((AndroidUtilities.dp(48.0f) + jb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (jb1Var.getMeasuredWidth() - jb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        jb1Var.v0(org.telegram.messenger.y3.z(48.0f, jb1Var.getMeasuredWidth() - jb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = zcVar.f40760r;
                    if (callback != null) {
                        callback.run(jpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                qp qpVar = (qp) this.f35188b;
                boolean z13 = qpVar.f37809s;
                if (qpVar.getParentActivity() != null) {
                    f2.o0 adapter = qpVar.f37804b.getAdapter();
                    pp ppVar = qpVar.e;
                    if (adapter == ppVar) {
                        chat = (TLRPC.Chat) ppVar.d.get(i10);
                    } else {
                        int i19 = qpVar.D;
                        if (i10 >= i19 && i10 < qpVar.E) {
                            chat = (TLRPC.Chat) qpVar.v.get(i10 - i19);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z13 && qpVar.h.linked_chat_id == 0) {
                            qpVar.a0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f19184id);
                        qpVar.presentFragment(new xn(bundle));
                        return;
                    } else if (i10 == qpVar.C) {
                        if (z13 && qpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{qpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = qpVar.f37806f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            e70 e70Var = new e70(bundle2);
                            e70Var.V = new ip(qpVar);
                            qpVar.presentFragment(e70Var);
                            return;
                        } else if (!qpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) qpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qpVar.getParentActivity());
                            if (z13) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.f19503a.O = string;
                            alertDialog$Builder.f19503a.Q = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new a1(qpVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                            qpVar.showDialog(d2Var);
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
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
            case 4:
                xp xpVar = (xp) this.f35188b;
                ArrayList arrayList3 = xpVar.f40281r;
                boolean z14 = xpVar.D;
                if (z14) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                if (i10 > i11) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    if (z14) {
                        i15 = 2;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - i15);
                    boolean contains = xpVar.d.contains(tL_availableReaction.reaction);
                    boolean z15 = !contains;
                    if (!contains) {
                        xpVar.d.add(tL_availableReaction.reaction);
                    } else {
                        xpVar.d.remove(tL_availableReaction.reaction);
                        if (xpVar.d.isEmpty()) {
                            wp wpVar = xpVar.h;
                            if (wpVar != null) {
                                if (xpVar.D) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                wpVar.t(i12, arrayList3.size() + 1);
                            }
                            xpVar.V(2, true);
                        }
                    }
                    Switch r22 = yVar.f22601c;
                    if (r22 != null) {
                        r22.c(z15, true);
                    }
                    org.telegram.ui.Components.lp lpVar = yVar.d;
                    if (lpVar != null) {
                        lpVar.a(z15, true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                lt ltVar = (lt) this.f35188b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ot) view).d;
                pt ptVar = ltVar.f36133a;
                mg.d0 reactionsWindow = ptVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f13985q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.dy0.c(null, ptVar.f37516c0, ptVar.f37537z.getContext(), new d5(ltVar, 9));
                    return;
                }
                nt ntVar = ptVar.f37524l;
                if (ntVar != null) {
                    ntVar.v(stickerSetCovered2.set, TextUtils.join("", ptVar.f37527o));
                }
                ptVar.p();
                return;
            case 6:
                yt ytVar = (yt) this.f35188b;
                if (ytVar.f40574f && ytVar.e) {
                    wt wtVar = ytVar.d;
                    ArrayList arrayList4 = wtVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        stVar = (st) wtVar.e.get(i10);
                    }
                } else {
                    int S = ytVar.f40573c.S(i10);
                    int Q = ytVar.f40573c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        stVar = ytVar.f40573c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    ytVar.finishFragment();
                    if (stVar != null && (xtVar = ytVar.f40576r) != null) {
                        xtVar.b1(stVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                tu tuVar = (tu) this.f35188b;
                ArrayList arrayList5 = tuVar.Z2;
                xu xuVar = tuVar.f38761l3;
                if ((view instanceof mu) && i10 >= 0 && i10 < arrayList5.size()) {
                    ou ouVar = (ou) arrayList5.get(i10);
                    if (ouVar != null) {
                        int i20 = ouVar.h;
                        if (i20 >= 0) {
                            tuVar.f38755f3[i20] = !zArr[i20];
                            tuVar.A1(true);
                            return;
                        } else if (i20 == -2) {
                            xuVar.presentFragment(new DataAutoDownloadActivity(tuVar.V2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.o8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xuVar.getParentActivity());
                    alertDialog$Builder2.f19503a.O = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new pu(tuVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19503a;
                    xuVar.showDialog(d2Var2);
                    TextView textView2 = (TextView) d2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                yz.V((yz) this.f35188b, view, i10);
                return;
            case 9:
                b10 b10Var = (b10) this.f35188b;
                if (b10Var.getParentActivity() != null && (s00Var = (s00) b10Var.M.get(i10)) != null) {
                    View.OnClickListener onClickListener = s00Var.f38157c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = s00Var.f1808a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                        b10Var.v0(s00Var, vaVar.getName(), vaVar.getCurrentObject(), s00Var.f38159g);
                        return;
                    } else if (i21 == 7) {
                        org.telegram.ui.Components.k41 k41Var = new org.telegram.ui.Components.k41(26, b10Var, s00Var);
                        if (b10Var.f32761c.isEnabled()) {
                            b10Var.s0(k41Var, false);
                            return;
                        } else {
                            k41Var.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && s00Var.f38162k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = b10Var.f32764r;
                        if (b10Var.f32765s && b10Var.f32761c.getAlpha() > 0.0f) {
                            float f10 = -b10Var.N;
                            b10Var.N = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            b10Var.v = true;
                            ej ejVar = b10Var.O;
                            if (ejVar == null || ejVar.getVisibility() != 0) {
                                ej ejVar2 = new ej(6, 3, b10Var.getParentActivity(), null, true);
                                b10Var.O = ejVar2;
                                ejVar2.f26145a.setMaxWidth(AndroidUtilities.displaySize.x);
                                b10Var.O.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                b10Var.O.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                b10Var.getParentLayout().getOverlayContainerView().addView(b10Var.O, marginLayoutParams);
                                b10Var.O.f(b10Var.f32761c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(b10Var.f32766w) || !TextUtils.isEmpty(dialogFilter.name)) && (b10Var.f32768y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && b10Var.D.isEmpty() && !b10Var.C.isEmpty()) {
                            b10Var.s0(new c00(b10Var, 1), false);
                            return;
                        } else {
                            float f11 = -b10Var.N;
                            b10Var.N = f11;
                            AndroidUtilities.shakeViewSpring(view, f11);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(b10Var.f32766w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.qc.a0(b10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((b10Var.f32768y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!b10Var.D.isEmpty()) {
                                    a02 = org.telegram.ui.Components.qc.a0(b10Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.qc.a0(b10Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (b10Var.C.isEmpty()) {
                                a02 = org.telegram.ui.Components.qc.a0(b10Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.qc.a0(b10Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.y3.s(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                o00 o00Var = (o00) this.f35188b;
                ArrayList arrayList6 = o00Var.f36760a0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    s00 s00Var2 = (s00) arrayList6.get(i22);
                    int i23 = s00Var2.f1808a;
                    if (i23 == 7) {
                        o00Var.dismiss();
                        o00Var.f28678n.presentFragment(new yz(o00Var.U, s00Var2.f38164m));
                        return;
                    } else if (i23 == 8) {
                        o00Var.Q();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                t10 t10Var = (t10) this.f35188b;
                if (view instanceof org.telegram.ui.Cells.i7) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.l7) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.l7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.e2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r2) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.r2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 12:
                g70 g70Var = (g70) this.f35188b;
                if (g70Var.getParentActivity() != null) {
                    if (i10 != g70Var.f34464n && i10 != 0) {
                        if (i10 == g70Var.f34466s) {
                            if (g70Var.f34463f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", g70Var.f34463f.link);
                                    g70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == g70Var.f34465r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(g70Var.getParentActivity());
                            alertDialog$Builder3.f19503a.Q = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f19503a.O = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new fu(g70Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            g70Var.showDialog(alertDialog$Builder3.f19503a);
                            return;
                        } else {
                            return;
                        }
                    } else if (g70Var.f34463f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", g70Var.f34463f.link));
                            org.telegram.ui.Components.qc.j(g70Var).j();
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                m70.U((m70) this.f35188b, view, i10);
                return;
            case 14:
                c80.U((c80) this.f35188b, view, i10);
                return;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f35188b, view, i10);
                return;
            case 16:
                ad0 ad0Var = (ad0) this.f35188b;
                ad0Var.f32530f0 = -1L;
                int i24 = ad0Var.D0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) ad0Var.Q.J(i10)) != null) {
                        if (ad0Var.f32524b0 == 0) {
                            ad0Var.C0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                            ad0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(ad0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = ad0Var.getMessagesController().getInputChannel(-ad0Var.f32524b0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        d2VarArr[0].setOnCancelListener(new lh.w(ad0Var, ad0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ba(ad0Var, d2VarArr, tL_messageMediaVenue, 19)), 8));
                        ad0Var.showDialog(d2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = ad0Var.F;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = ad0Var.f32550w0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), ad0Var.F.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = ad0Var.f32554y0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = ad0Var.F;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = ad0Var.f32554y0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), ad0Var.F.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i24 != 2) {
                    if (ad0Var.C0 != null && ad0Var.f32547u0 != null) {
                        FrameLayout frameLayout = ad0Var.f32536l0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(ad0Var.f32547u0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(ad0Var.f32547u0.getLongitude());
                        ad0Var.C0.d(tL_messageMediaGeo, ad0Var.D0, true, 0, 0L);
                        ad0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && ad0Var.getLocationController().isSharingLocation(ad0Var.f32524b0) && ad0Var.Q.j(i10) == 7) {
                    ad0Var.getLocationController().removeSharingLocation(ad0Var.f32524b0);
                    ad0Var.Q.l();
                    ad0Var.finishFragment();
                    return;
                } else if (i24 == 2 && ad0Var.getLocationController().isSharingLocation(ad0Var.f32524b0) && ad0Var.Q.j(i10) == 6) {
                    if (ad0Var.getLocationController().getSharingLocationInfo(ad0Var.f32524b0).period == Integer.MAX_VALUE) {
                        z4 = false;
                    }
                    ad0Var.s0(z4);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (ad0Var.getLocationController().isSharingLocation(ad0Var.f32524b0)) {
                        ad0Var.getLocationController().removeSharingLocation(ad0Var.f32524b0);
                        ad0Var.Q.l();
                        ad0Var.finishFragment();
                        return;
                    }
                    ad0Var.s0(false);
                    return;
                } else {
                    Object J = ad0Var.Q.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        ad0Var.C0.d((TLRPC.TL_messageMediaVenue) J, ad0Var.D0, true, 0, 0L);
                        ad0Var.finishFragment();
                        return;
                    } else if (J instanceof uc0) {
                        uc0 uc0Var = (uc0) J;
                        ad0Var.f32530f0 = uc0Var.f38906a;
                        if (ad0Var.f32531g0) {
                            ad0Var.f32531g0 = false;
                            ad0Var.C0();
                        }
                        ad0Var.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(uc0Var.e.getPosition(), ad0Var.F.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((si0) this.f35188b).onBackPressed();
                return;
            case 18:
                aj0 aj0Var = (aj0) this.f35188b;
                int i25 = aj0Var.F;
                if (i10 >= i25 && i10 < aj0Var.G) {
                    MessageObject messageObject2 = (MessageObject) aj0Var.f32656x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!aj0Var.a0(messageObject2)) {
                            aj0Var.getOrCreateStoryViewer().G(aj0Var.getParentActivity(), messageObject2.storyItem, nh.c7.a(aj0Var.f32651f));
                            return;
                        }
                        return;
                    }
                    long dialogId = MessageObject.getDialogId(messageObject2.messageOwner);
                    Bundle bundle3 = new Bundle();
                    if (DialogObject.isUserDialog(dialogId)) {
                        bundle3.putLong("user_id", dialogId);
                    } else {
                        bundle3.putLong("chat_id", -dialogId);
                    }
                    bundle3.putInt("message_id", messageObject2.getId());
                    bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                    if (aj0Var.getMessagesController().checkCanOpenChat(bundle3, aj0Var)) {
                        aj0Var.presentFragment(new xn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.f35188b, view, i10);
                return;
            case 20:
                fq0 fq0Var = (fq0) this.f35188b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = fq0Var.f34321f;
                ArrayList arrayList8 = fq0Var.f34329n;
                MediaController.AlbumEntry albumEntry = fq0Var.G;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        jq0 jq0Var = fq0Var.f34333q0;
                        if (jq0Var != null) {
                            switch (jq0Var.f35465a) {
                                case 0:
                                    kq0.h0(jq0Var.f35466b, str);
                                    return;
                                default:
                                    kq0.h0(jq0Var.f35466b, str);
                                    return;
                            }
                        }
                        fq0Var.M.getSearchField().setText(str);
                        fq0Var.M.getSearchField().setSelection(str.length());
                        fq0Var.b0(fq0Var.M.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(fq0Var.getParentActivity());
                        alertDialog$Builder4.f19503a.O = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f19503a.Q = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new tp0(fq0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder4.f19503a;
                        fq0Var.showDialog(d2Var3);
                        TextView textView3 = (TextView) d2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                if (albumEntry != null) {
                    arrayList7 = albumEntry.photos;
                }
                if (i10 >= 0 && i10 < arrayList7.size()) {
                    org.telegram.ui.ActionBar.w0 w0Var = fq0Var.M;
                    if (w0Var != null) {
                        AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                    }
                    if (fq0Var.V) {
                        fq0Var.a0(view, arrayList7.get(i10));
                        return;
                    }
                    int i26 = fq0Var.Q;
                    if (i26 != 1 && i26 != 3) {
                        i16 = i26 == 2 ? 3 : i26 == 10 ? 10 : fq0Var.R == null ? 4 : 0;
                    }
                    PhotoViewer.t1().K2(null, fq0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = fq0Var.E;
                    boolean z16 = fq0Var.F;
                    t12.h = i27;
                    t12.f31811n = z16;
                    PhotoViewer.t1().f2(arrayList7, i10, i16, fq0Var.f34325i0, fq0Var.f34339u0, fq0Var.R);
                    return;
                }
                return;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) this.f35188b;
                ArrayList arrayList9 = photoViewer.f31730d7;
                if (!arrayList9.isEmpty() && (i14 = photoViewer.M4) >= 0 && i14 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.M4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f31764h5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.M4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.f31764h5 = false;
                return;
            case 22:
                a(i10, view);
                return;
            case 23:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f35188b, view, i10);
                return;
            case 24:
                b(i10, view);
                return;
            case 25:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f35188b, view, i10);
                return;
            case 26:
                c(i10, view);
                return;
            case 27:
                ProfileActivity.f0((ProfileActivity) this.f35188b, i10);
                return;
            case 28:
                ProxyListActivity.U((ProxyListActivity) this.f35188b, view, i10);
                return;
            default:
                l21 l21Var = (l21) this.f35188b;
                org.telegram.ui.Components.sl0 sl0Var = l21Var.f35898y;
                org.telegram.ui.Components.ip ipVar = l21Var.f35890b;
                if (ipVar.d.get(i10) != l21Var.H && l21Var.L == null) {
                    l21Var.N = false;
                    l21Var.H = (org.telegram.ui.Components.jp) ipVar.d.get(i10);
                    ipVar.E(i10);
                    l21Var.h.postDelayed(new org.telegram.ui.Components.hm(l21Var, i10, 23), 100L);
                    for (int i28 = 0; i28 < sl0Var.getChildCount(); i28++) {
                        org.telegram.ui.Components.w11 w11Var = (org.telegram.ui.Components.w11) sl0Var.getChildAt(i28);
                        if (w11Var != view && (nq0Var = w11Var.G) != null) {
                            AndroidUtilities.cancelRunOnUIThread(nq0Var);
                            w11Var.G.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.jp) ipVar.d.get(i10)).f26015a.f19663a) {
                        ((org.telegram.ui.Components.w11) view).d();
                    }
                    x11 x11Var = l21Var.G;
                    if (x11Var != null) {
                        x11Var.f39831a.d0(i10, l21Var.H.f26015a, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
