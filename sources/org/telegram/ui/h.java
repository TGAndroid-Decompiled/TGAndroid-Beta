package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.SharedPreferences;
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
public final class h implements org.telegram.ui.Components.zl0 {
    public final int f37695a;
    public final Object f37696b;

    public h(Object obj, int i10) {
        this.f37695a = i10;
        this.f37696b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        hv0 hv0Var = (hv0) this.f37696b;
        boolean[] zArr = hv0Var.f38058w;
        if (i10 == hv0Var.f38048o0) {
            hv0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = hv0Var.L;
            org.telegram.ui.Components.kz0 kz0Var = hv0Var.Q;
            if (kz0Var != null) {
                kz0Var.f();
            }
            if (hv0Var.I) {
                int i11 = -hv0Var.O;
                hv0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == hv0Var.f38052r0) {
                z10 = !hv0Var.G;
                hv0Var.G = z10;
            } else {
                int i12 = hv0Var.f38056u0;
                if (i10 == i12) {
                    z10 = !hv0Var.H;
                    hv0Var.H = z10;
                } else if (i10 == hv0Var.f38057v0) {
                    boolean z12 = !hv0Var.J;
                    hv0Var.J = z12;
                    hv0Var.r0();
                    int i13 = hv0Var.f38056u0;
                    if (i13 >= 0 && i12 < 0) {
                        hv0Var.f38032b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        hv0Var.f38032b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == hv0Var.f38054s0) {
                    boolean z13 = hv0Var.K;
                    boolean z14 = !z13;
                    hv0Var.K = z14;
                    if (!z13 && hv0Var.L) {
                        int i14 = hv0Var.f38043j0;
                        hv0Var.L = false;
                        hv0Var.r0();
                        s4.b1 K = hv0Var.f38034c.K(hv0Var.f38055t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.w8) K.f46342a).setChecked(false);
                        } else {
                            hv0Var.f38032b.m(hv0Var.f38055t0);
                        }
                        hv0Var.f38032b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (hv0Var.N == 0) {
                    z10 = !hv0Var.L;
                    hv0Var.L = z10;
                    int i15 = hv0Var.f38043j0;
                    hv0Var.r0();
                    if (hv0Var.L) {
                        hv0Var.f38032b.s(hv0Var.f38043j0, 2);
                    } else {
                        hv0Var.f38032b.t(i15, 2);
                    }
                    if (hv0Var.L && hv0Var.K) {
                        hv0Var.K = false;
                        s4.b1 K2 = hv0Var.f38034c.K(hv0Var.f38054s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.w8) K2.f46342a).setChecked(false);
                        } else {
                            hv0Var.f38032b.m(hv0Var.f38054s0);
                        }
                    }
                    if (hv0Var.L) {
                        boolean z15 = false;
                        for (int i16 = 0; i16 < zArr.length; i16++) {
                            if (z15) {
                                zArr[i16] = false;
                            } else if (zArr[i16]) {
                                z15 = true;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            if (hv0Var.M && !hv0Var.L) {
                hv0Var.f38034c.getChildCount();
                hv0Var.h.b(true);
            }
            for (int i17 = hv0Var.f38047n0; i17 < hv0Var.f38047n0 + hv0Var.f38062y; i17++) {
                s4.b1 K3 = hv0Var.f38034c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f46342a;
                    if (view2 instanceof org.telegram.ui.Cells.d6) {
                        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view2;
                        d6Var.m(hv0Var.L, true);
                        d6Var.f22283r.a(zArr[i17 - hv0Var.f38047n0], z11);
                        if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == hv0Var.f38055t0 && !hv0Var.M) {
                            hv0Var.h.f(d6Var.getCheckBox(), true);
                            hv0Var.M = true;
                        }
                    }
                }
            }
            w8Var.setChecked(z10);
            hv0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        sw0 sw0Var;
        qw0 qw0Var = (qw0) this.f37696b;
        PremiumPreviewFragment premiumPreviewFragment = qw0Var.f40941n;
        ArrayList arrayList = premiumPreviewFragment.d;
        nw0 nw0Var = qw0Var.e;
        if (view.isEnabled() && (view instanceof sg.r1)) {
            sg.r1 r1Var = (sg.r1) view;
            premiumPreviewFragment.e = arrayList.indexOf(r1Var.getTier());
            boolean z10 = true;
            premiumPreviewFragment.t0(true);
            r1Var.c(true, true);
            for (int i11 = 0; i11 < nw0Var.getChildCount(); i11++) {
                View childAt = nw0Var.getChildAt(i11);
                if (childAt instanceof sg.r1) {
                    sg.r1 r1Var2 = (sg.r1) childAt;
                    if (r1Var2.getTier() != r1Var.getTier()) {
                        r1Var2.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < nw0Var.getHiddenChildCount(); i12++) {
                View V = nw0Var.V(i12);
                if (V instanceof sg.r1) {
                    sg.r1 r1Var3 = (sg.r1) V;
                    if (r1Var3.getTier() != r1Var.getTier()) {
                        r1Var3.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < nw0Var.getCachedChildCount(); i13++) {
                View P = nw0Var.P(i13);
                if (P instanceof sg.r1) {
                    sg.r1 r1Var4 = (sg.r1) P;
                    if (r1Var4.getTier() != r1Var.getTier()) {
                        r1Var4.c(false, true);
                    }
                }
            }
            for (int i14 = 0; i14 < nw0Var.getAttachedScrapChildCount(); i14++) {
                View O = nw0Var.O(i14);
                if (O instanceof sg.r1) {
                    sg.r1 r1Var5 = (sg.r1) O;
                    if (r1Var5.getTier() != r1Var.getTier()) {
                        r1Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.J;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((sw0Var = premiumPreviewFragment.f33809f) == null || sw0Var.f41816a.months >= ((sw0) arrayList.get(premiumPreviewFragment.e)).f41816a.months || premiumPreviewFragment.f33820p0)) {
                z10 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10);
        }
    }

    private final void c(int i10, View view) {
        nx0 nx0Var = (nx0) this.f37696b;
        int i11 = nx0Var.f40016y;
        if (i10 == nx0Var.f40014w) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.d5.N(nx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new lx0(nx0Var), null).f20679a;
            c2Var.show();
            c2Var.i();
        } else if (i10 == nx0Var.f40010f) {
            if (i11 == 1) {
                ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
                o2Var.d = new Paint();
                o2Var.f36409f = new bv[2];
                o2Var.f36413w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                ey eyVar = new ey(bundle);
                o2Var.f36406a = eyVar;
                eyVar.C2 = new zu(o2Var);
                eyVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                o2Var.f36407b = contactsActivity;
                contactsActivity.W = new zu(o2Var);
                contactsActivity.onFragmentCreate();
                nx0Var.presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
                return;
            }
            Bundle h = a1.g.h("isNeverShare", true);
            if (i11 == 2) {
                h.putInt("chatAddType", 2);
            }
            p60 p60Var = new p60(h);
            p60Var.f40375w = new kx0(nx0Var);
            nx0Var.presentFragment(p60Var);
        } else if (i10 >= nx0Var.f40012r && i10 < nx0Var.f40013s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", nx0Var.getMessagesController().blockePeers.keyAt(i10 - nx0Var.f40012r));
                nx0Var.presentFragment(new ProfileActivity(bundle3, null));
                return;
            }
            new Bundle();
            throw null;
        }
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        int i11;
        int i12;
        qt qtVar;
        boolean[] zArr;
        h00 h00Var;
        org.telegram.ui.Components.vc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        int i15 = 3;
        lt ltVar = null;
        boolean z10 = false;
        int i16 = 1;
        switch (this.f37695a) {
            case 0:
                k kVar = (k) this.f37696b;
                ArrayList arrayList = kVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((i) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        kVar.f38708c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z12);
                        kVar.f38708c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!kVar.getUserConfig().isPremium() && !kVar.getMessagesController().autoarchiveAvailable && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.w90 w90Var = gcVar.f26619b;
                            w90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.k6.Gi, 0, new ut0(kVar, 3)));
                            w90Var.setSingleLine(false);
                            w90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            gcVar.f26618a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.oc.g(kVar, gcVar, 3500).j();
                            int i18 = -kVar.e;
                            kVar.e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                        boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z13);
                        kVar.f38708c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                o oVar = (o) this.f37696b;
                if (i10 >= oVar.f40038x && i10 < oVar.f40039y && oVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.h.get(i10 - oVar.f40038x);
                    if (stickerSetCovered.set.f20371id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f20364id = stickerSetCovered.set.f20371id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.sy0 sy0Var = new org.telegram.ui.Components.sy0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    sy0Var.f30638c0 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(sy0Var);
                    return;
                }
                return;
            case 2:
                q4 q4Var = (q4) this.f37696b;
                ti.a aVar = ti.e.f47658b;
                if (i10 == 1) {
                    synchronized (aVar) {
                        if (!aVar.f47649b) {
                            SharedPreferences sharedPreferences = ti.d.f47656a;
                            aVar.f47650c = sharedPreferences.contains("audio_recorder_v2_enabled");
                            aVar.d = sharedPreferences.getBoolean("audio_recorder_v2_enabled", true);
                            aVar.f47649b = true;
                        }
                        boolean z14 = !aVar.d;
                        aVar.d = z14;
                        aVar.f47650c = true;
                        aVar.f47649b = true;
                        ti.d.f47656a.edit().putBoolean("audio_recorder_v2_enabled", z14).apply();
                    }
                    q4Var.f40707b.l();
                    return;
                }
                aVar.a();
                if (aVar.d && i10 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getParentActivity());
                    alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.AudioRecorderNoiseSuppression);
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.AudioRecorderNoiseSuppressionOff), LocaleController.getString(R.string.AudioRecorderNoiseSuppressionRNNoise)}, new o4(q4Var, 0));
                    q4Var.showDialog(alertDialog$Builder.f20679a);
                    return;
                }
                return;
            case 3:
                zc zcVar = (zc) this.f37696b;
                ArrayList arrayList2 = zcVar.f44063c;
                wa1 wa1Var = zcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.tp tpVar = (org.telegram.ui.Components.tp) arrayList2.get(i10);
                    zcVar.a(tpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + wa1Var.getPaddingLeft()) {
                        wa1Var.v0(-((AndroidUtilities.dp(48.0f) + wa1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (wa1Var.getMeasuredWidth() - wa1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        wa1Var.v0(org.telegram.messenger.v0.z(48.0f, wa1Var.getMeasuredWidth() - wa1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = zcVar.f44066r;
                    if (callback != null) {
                        callback.run(tpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                kp kpVar = (kp) this.f37696b;
                boolean z15 = kpVar.f38994s;
                if (kpVar.getParentActivity() != null) {
                    s4.g0 adapter = kpVar.f38989b.getAdapter();
                    jp jpVar = kpVar.e;
                    if (adapter == jpVar) {
                        chat = (TLRPC.Chat) jpVar.d.get(i10);
                    } else {
                        int i19 = kpVar.G;
                        if (i10 >= i19 && i10 < kpVar.H) {
                            chat = (TLRPC.Chat) kpVar.v.get(i10 - i19);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z15 && kpVar.h.linked_chat_id == 0) {
                            kpVar.a0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f20344id);
                        kpVar.presentFragment(new sn(bundle));
                        return;
                    } else if (i10 == kpVar.F) {
                        if (z15 && kpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{kpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = kpVar.f38991f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            w60 w60Var = new w60(bundle2);
                            w60Var.Y = new cp(kpVar);
                            kpVar.presentFragment(w60Var);
                            return;
                        } else if (!kpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) kpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kpVar.getParentActivity());
                            if (z15) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder2.f20679a.R = string;
                            alertDialog$Builder2.f20679a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.DiscussionUnlink), new a1(kpVar, 22));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.f20679a;
                            kpVar.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
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
                rp rpVar = (rp) this.f37696b;
                ArrayList arrayList3 = rpVar.f41200r;
                boolean z16 = rpVar.G;
                if (z16) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                if (i10 > i11) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    if (z16) {
                        i15 = 2;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - i15);
                    boolean contains = rpVar.d.contains(tL_availableReaction.reaction);
                    boolean z17 = !contains;
                    if (!contains) {
                        rpVar.d.add(tL_availableReaction.reaction);
                    } else {
                        rpVar.d.remove(tL_availableReaction.reaction);
                        if (rpVar.d.isEmpty()) {
                            qp qpVar = rpVar.h;
                            if (qpVar != null) {
                                if (rpVar.G) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                qpVar.t(i12, arrayList3.size() + 1);
                            }
                            rpVar.V(2, true);
                        }
                    }
                    Switch r22 = xVar.f23938c;
                    if (r22 != null) {
                        r22.c(z17, true);
                    }
                    org.telegram.ui.Components.vp vpVar = xVar.d;
                    if (vpVar != null) {
                        vpVar.a(z17, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                dt dtVar = (dt) this.f37696b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((gt) view).d;
                ht htVar = dtVar.f36721a;
                ah.t0 reactionsWindow = htVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f882q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.xy0.c(null, htVar.f37988c0, htVar.f38009z.getContext(), new f5(dtVar, 9));
                    return;
                }
                ft ftVar = htVar.f37996l;
                if (ftVar != null) {
                    ftVar.w(stickerSetCovered2.set, TextUtils.join("", htVar.f37999o));
                }
                htVar.n();
                return;
            case 7:
                rt rtVar = (rt) this.f37696b;
                if (rtVar.f41226f && rtVar.e) {
                    pt ptVar = rtVar.d;
                    ArrayList arrayList4 = ptVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        ltVar = (lt) ptVar.e.get(i10);
                    }
                } else {
                    int S = rtVar.f41225c.S(i10);
                    int Q = rtVar.f41225c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        ltVar = rtVar.f41225c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    rtVar.finishFragment();
                    if (ltVar != null && (qtVar = rtVar.f41228r) != null) {
                        qtVar.L0(ltVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ku kuVar = (ku) this.f37696b;
                ArrayList arrayList5 = kuVar.f39039d3;
                ou ouVar = kuVar.f39051p3;
                if ((view instanceof du) && i10 >= 0 && i10 < arrayList5.size()) {
                    fu fuVar = (fu) arrayList5.get(i10);
                    if (fuVar != null) {
                        int i20 = fuVar.h;
                        if (i20 >= 0) {
                            kuVar.f39045j3[i20] = !zArr[i20];
                            kuVar.G1(true);
                            return;
                        } else if (i20 == -2) {
                            ouVar.presentFragment(new DataAutoDownloadActivity(kuVar.Z2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ouVar.getParentActivity());
                    alertDialog$Builder3.f20679a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder3.f20679a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Reset), new gu(kuVar));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder3.f20679a;
                    ouVar.showDialog(c2Var2);
                    TextView textView2 = (TextView) c2Var2.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21422q7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                oz.V((oz) this.f37696b, view, i10);
                return;
            case 10:
                q00 q00Var = (q00) this.f37696b;
                if (q00Var.getParentActivity() != null && (h00Var = (h00) q00Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = h00Var.f37700c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = h00Var.f44712a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
                        q00Var.v0(h00Var, waVar.getName(), waVar.getCurrentObject(), h00Var.f37702g);
                        return;
                    } else if (i21 == 7) {
                        ot otVar = new ot(13, q00Var, h00Var);
                        if (q00Var.f40673c.isEnabled()) {
                            q00Var.s0(otVar, false);
                            return;
                        } else {
                            otVar.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && h00Var.f37705k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = q00Var.f40676r;
                        if (q00Var.f40677s && q00Var.f40673c.getAlpha() > 0.0f) {
                            float f7 = -q00Var.Q;
                            q00Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            q00Var.v = true;
                            aj ajVar = q00Var.R;
                            if (ajVar == null || ajVar.getVisibility() != 0) {
                                aj ajVar2 = new aj(6, 2, q00Var.getParentActivity(), null, true);
                                q00Var.R = ajVar2;
                                ajVar2.f29461a.setMaxWidth(AndroidUtilities.displaySize.x);
                                q00Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                q00Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                q00Var.getParentLayout().getOverlayContainerView().addView(q00Var.R, marginLayoutParams);
                                q00Var.R.f(q00Var.f40673c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(q00Var.f40678w) || !TextUtils.isEmpty(dialogFilter.name)) && (q00Var.f40680y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && q00Var.G.isEmpty() && !q00Var.F.isEmpty()) {
                            q00Var.s0(new sz(q00Var, 1), false);
                            return;
                        } else {
                            float f10 = -q00Var.Q;
                            q00Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(q00Var.f40678w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.vc.a0(q00Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((q00Var.f40680y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!q00Var.G.isEmpty()) {
                                    a02 = org.telegram.ui.Components.vc.a0(q00Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.vc.a0(q00Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (q00Var.F.isEmpty()) {
                                a02 = org.telegram.ui.Components.vc.a0(q00Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.vc.a0(q00Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.tl.q(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                d00 d00Var = (d00) this.f37696b;
                ArrayList arrayList6 = d00Var.f36438e0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    h00 h00Var2 = (h00) arrayList6.get(i22);
                    int i23 = h00Var2.f44712a;
                    if (i23 == 7) {
                        d00Var.dismiss();
                        d00Var.f33212n.presentFragment(new oz(d00Var.Y, h00Var2.f37707m));
                        return;
                    } else if (i23 == 8) {
                        d00Var.Q();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                i10 i10Var = (i10) this.f37696b;
                if (view instanceof org.telegram.ui.Cells.k7) {
                    i10Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    i10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    i10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    i10Var.f(i10, view, ((org.telegram.ui.Cells.e2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.q2) {
                    i10Var.f(i10, view, ((org.telegram.ui.Cells.q2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                y60 y60Var = (y60) this.f37696b;
                if (y60Var.getParentActivity() != null) {
                    if (i10 != y60Var.f43767n && i10 != 0) {
                        if (i10 == y60Var.f43769s) {
                            if (y60Var.f43766f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", y60Var.f43766f.link);
                                    y60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == y60Var.f43768r) {
                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(y60Var.getParentActivity());
                            alertDialog$Builder4.f20679a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder4.f20679a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new xt(y60Var, 12));
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            y60Var.showDialog(alertDialog$Builder4.f20679a);
                            return;
                        } else {
                            return;
                        }
                    } else if (y60Var.f43766f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", y60Var.f43766f.link));
                            org.telegram.ui.Components.vc.j(y60Var).j();
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                e70.U((e70) this.f37696b, view, i10);
                return;
            case 15:
                x70.U((x70) this.f37696b, view, i10);
                return;
            case 16:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f37696b, view, i10);
                return;
            case 17:
                rc0 rc0Var = (rc0) this.f37696b;
                rc0Var.f41104i0 = -1L;
                int i24 = rc0Var.F0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) rc0Var.T.J(i10)) != null) {
                        if (rc0Var.f41099e0 == 0) {
                            rc0Var.E0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            rc0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(rc0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = rc0Var.getMessagesController().getInputChannel(-rc0Var.f41099e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        c2VarArr[0].setOnCancelListener(new ai.e0(rc0Var, rc0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ca(rc0Var, c2VarArr, tL_messageMediaVenue, 19)), 8));
                        rc0Var.showDialog(c2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = rc0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = rc0Var.f41125y0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), rc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = rc0Var.A0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = rc0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = rc0Var.A0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), rc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i24 != 2) {
                    if (rc0Var.E0 != null && rc0Var.f41121w0 != null) {
                        FrameLayout frameLayout = rc0Var.f41110o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(rc0Var.f41121w0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(rc0Var.f41121w0.getLongitude());
                        rc0Var.E0.b(tL_messageMediaGeo, rc0Var.F0, true, 0, 0L);
                        rc0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && rc0Var.getLocationController().isSharingLocation(rc0Var.f41099e0) && rc0Var.T.j(i10) == 7) {
                    rc0Var.getLocationController().removeSharingLocation(rc0Var.f41099e0);
                    rc0Var.T.l();
                    rc0Var.finishFragment();
                    return;
                } else if (i24 == 2 && rc0Var.getLocationController().isSharingLocation(rc0Var.f41099e0) && rc0Var.T.j(i10) == 6) {
                    if (rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f41099e0).period != Integer.MAX_VALUE) {
                        z10 = true;
                    }
                    rc0Var.s0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (rc0Var.getLocationController().isSharingLocation(rc0Var.f41099e0)) {
                        rc0Var.getLocationController().removeSharingLocation(rc0Var.f41099e0);
                        rc0Var.T.l();
                        rc0Var.finishFragment();
                        return;
                    }
                    rc0Var.s0(false);
                    return;
                } else {
                    Object J = rc0Var.T.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        rc0Var.E0.b((TLRPC.TL_messageMediaVenue) J, rc0Var.F0, true, 0, 0L);
                        rc0Var.finishFragment();
                        return;
                    } else if (J instanceof lc0) {
                        lc0 lc0Var = (lc0) J;
                        rc0Var.f41104i0 = lc0Var.f39191a;
                        if (rc0Var.f41105j0) {
                            rc0Var.f41105j0 = false;
                            rc0Var.C0();
                        }
                        rc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(lc0Var.e.getPosition(), rc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 18:
                ((pi0) this.f37696b).onBackPressed();
                return;
            case 19:
                xi0 xi0Var = (xi0) this.f37696b;
                int i25 = xi0Var.I;
                if (i10 >= i25 && i10 < xi0Var.J) {
                    MessageObject messageObject2 = (MessageObject) xi0Var.f43627x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!xi0Var.b0(messageObject2)) {
                            xi0Var.getOrCreateStoryViewer().F(xi0Var.getParentActivity(), messageObject2.storyItem, ci.q7.a(xi0Var.f43622f));
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
                    if (xi0Var.getMessagesController().checkCanOpenChat(bundle3, xi0Var)) {
                        xi0Var.presentFragment(new sn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                PasscodeActivity.V((PasscodeActivity) this.f37696b, view, i10);
                return;
            case 21:
                jp0 jp0Var = (jp0) this.f37696b;
                jp0Var.a(i10, true);
                wo0 wo0Var = jp0Var.h;
                if (wo0Var != null) {
                    wo0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 22:
                lq0 lq0Var = (lq0) this.f37696b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = lq0Var.f39341f;
                ArrayList arrayList8 = lq0Var.f39349n;
                MediaController.AlbumEntry albumEntry = lq0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        pq0 pq0Var = lq0Var.f39358t0;
                        if (pq0Var != null) {
                            switch (pq0Var.f40619a) {
                                case 0:
                                    qq0.h0(pq0Var.f40620b, str);
                                    return;
                                default:
                                    qq0.h0(pq0Var.f40620b, str);
                                    return;
                            }
                        }
                        lq0Var.P.getSearchField().setText(str);
                        lq0Var.P.getSearchField().setSelection(str.length());
                        lq0Var.b0(lq0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(lq0Var.getParentActivity());
                        alertDialog$Builder5.f20679a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder5.f20679a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder5.k(LocaleController.getString(R.string.ClearButton), new yp0(lq0Var, 4));
                        alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder5.f20679a;
                        lq0Var.showDialog(c2Var3);
                        TextView textView3 = (TextView) c2Var3.d(-1);
                        if (textView3 != null) {
                            org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.f21422q7, null);
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
                    org.telegram.ui.ActionBar.u0 u0Var = lq0Var.P;
                    if (u0Var != null) {
                        AndroidUtilities.hideKeyboard(u0Var.getSearchField());
                    }
                    if (lq0Var.Y) {
                        lq0Var.a0(view, arrayList7.get(i10));
                        return;
                    }
                    int i26 = lq0Var.T;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 != 2) {
                            i15 = 10;
                            if (i26 != 10) {
                                i16 = lq0Var.U == null ? 4 : 0;
                            }
                        }
                        i16 = i15;
                    }
                    PhotoViewer.u1().M2(null, lq0Var, null);
                    PhotoViewer u12 = PhotoViewer.u1();
                    int i27 = lq0Var.H;
                    boolean z18 = lq0Var.I;
                    u12.h = i27;
                    u12.f33659n = z18;
                    PhotoViewer.u1().i2(arrayList7, i10, i16, lq0Var.f39348l0, lq0Var.f39364x0, lq0Var.U);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.f37696b;
                ArrayList arrayList9 = photoViewer.f33606g7;
                if (!arrayList9.isEmpty() && (i14 = photoViewer.P4) >= 0 && i14 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.o1();
                    }
                }
                photoViewer.f33640k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.D2(indexOf);
                }
                photoViewer.f33640k5 = false;
                return;
            case 24:
                a(i10, view);
                return;
            case 25:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f37696b, view, i10);
                return;
            case 26:
                b(i10, view);
                return;
            case 27:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f37696b, view, i10);
                return;
            case 28:
                c(i10, view);
                return;
            default:
                ProfileActivity.W((ProfileActivity) this.f37696b, i10);
                return;
        }
    }
}
