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
public final class i implements org.telegram.ui.Components.wl0 {
    public final int f37713a;
    public final Object f37714b;

    public i(Object obj, int i10) {
        this.f37713a = i10;
        this.f37714b = obj;
    }

    private final void b(int i10, View view) {
        boolean z10;
        hv0 hv0Var = (hv0) this.f37714b;
        boolean[] zArr = hv0Var.f37690w;
        if (i10 == hv0Var.f37680o0) {
            hv0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.v8) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            boolean z11 = hv0Var.L;
            org.telegram.ui.Components.gz0 gz0Var = hv0Var.Q;
            if (gz0Var != null) {
                gz0Var.f();
            }
            if (hv0Var.I) {
                int i11 = -hv0Var.O;
                hv0Var.O = i11;
                AndroidUtilities.shakeViewSpring(v8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == hv0Var.f37684r0) {
                z10 = !hv0Var.G;
                hv0Var.G = z10;
            } else {
                int i12 = hv0Var.f37688u0;
                if (i10 == i12) {
                    z10 = !hv0Var.H;
                    hv0Var.H = z10;
                } else if (i10 == hv0Var.f37689v0) {
                    boolean z12 = !hv0Var.J;
                    hv0Var.J = z12;
                    hv0Var.r0();
                    int i13 = hv0Var.f37688u0;
                    if (i13 >= 0 && i12 < 0) {
                        hv0Var.f37664b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        hv0Var.f37664b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == hv0Var.f37686s0) {
                    boolean z13 = hv0Var.K;
                    boolean z14 = !z13;
                    hv0Var.K = z14;
                    if (!z13 && hv0Var.L) {
                        int i14 = hv0Var.f37675j0;
                        hv0Var.L = false;
                        hv0Var.r0();
                        s4.b1 K = hv0Var.f37666c.K(hv0Var.f37687t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.v8) K.f45958a).setChecked(false);
                        } else {
                            hv0Var.f37664b.m(hv0Var.f37687t0);
                        }
                        hv0Var.f37664b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (hv0Var.N == 0) {
                    z10 = !hv0Var.L;
                    hv0Var.L = z10;
                    int i15 = hv0Var.f37675j0;
                    hv0Var.r0();
                    if (hv0Var.L) {
                        hv0Var.f37664b.s(hv0Var.f37675j0, 2);
                    } else {
                        hv0Var.f37664b.t(i15, 2);
                    }
                    if (hv0Var.L && hv0Var.K) {
                        hv0Var.K = false;
                        s4.b1 K2 = hv0Var.f37666c.K(hv0Var.f37686s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.v8) K2.f45958a).setChecked(false);
                        } else {
                            hv0Var.f37664b.m(hv0Var.f37686s0);
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
                hv0Var.h.b(true);
            }
            hv0Var.f37666c.getChildCount();
            for (int i17 = hv0Var.f37679n0; i17 < hv0Var.f37679n0 + hv0Var.f37694y; i17++) {
                s4.b1 K3 = hv0Var.f37666c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f45958a;
                    if (view2 instanceof org.telegram.ui.Cells.c6) {
                        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view2;
                        c6Var.m(hv0Var.L, true);
                        c6Var.f22099r.a(zArr[i17 - hv0Var.f37679n0], z11);
                        if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == hv0Var.f37687t0 && !hv0Var.M) {
                            hv0Var.h.f(c6Var.getCheckBox(), true);
                            hv0Var.M = true;
                        }
                    }
                }
            }
            v8Var.setChecked(z10);
            hv0Var.i0();
        }
    }

    private final void c(int i10, View view) {
        rw0 rw0Var;
        pw0 pw0Var = (pw0) this.f37714b;
        PremiumPreviewFragment premiumPreviewFragment = pw0Var.f40258n;
        ArrayList arrayList = premiumPreviewFragment.d;
        mw0 mw0Var = pw0Var.e;
        if (view.isEnabled() && (view instanceof sg.q1)) {
            sg.q1 q1Var = (sg.q1) view;
            premiumPreviewFragment.e = arrayList.indexOf(q1Var.getTier());
            boolean z10 = true;
            premiumPreviewFragment.t0(true);
            q1Var.c(true, true);
            for (int i11 = 0; i11 < mw0Var.getChildCount(); i11++) {
                View childAt = mw0Var.getChildAt(i11);
                if (childAt instanceof sg.q1) {
                    sg.q1 q1Var2 = (sg.q1) childAt;
                    if (q1Var2.getTier() != q1Var.getTier()) {
                        q1Var2.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < mw0Var.getHiddenChildCount(); i12++) {
                View V = mw0Var.V(i12);
                if (V instanceof sg.q1) {
                    sg.q1 q1Var3 = (sg.q1) V;
                    if (q1Var3.getTier() != q1Var.getTier()) {
                        q1Var3.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < mw0Var.getCachedChildCount(); i13++) {
                View P = mw0Var.P(i13);
                if (P instanceof sg.q1) {
                    sg.q1 q1Var4 = (sg.q1) P;
                    if (q1Var4.getTier() != q1Var.getTier()) {
                        q1Var4.c(false, true);
                    }
                }
            }
            for (int i14 = 0; i14 < mw0Var.getAttachedScrapChildCount(); i14++) {
                View O = mw0Var.O(i14);
                if (O instanceof sg.q1) {
                    sg.q1 q1Var5 = (sg.q1) O;
                    if (q1Var5.getTier() != q1Var.getTier()) {
                        q1Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.J;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((rw0Var = premiumPreviewFragment.f33500f) == null || rw0Var.f40843a.months >= ((rw0) arrayList.get(premiumPreviewFragment.e)).f40843a.months || premiumPreviewFragment.f33511p0)) {
                z10 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10);
        }
    }

    private final void d(int i10, View view) {
        mx0 mx0Var = (mx0) this.f37714b;
        int i11 = mx0Var.f39295y;
        if (i10 == mx0Var.f39293w) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.f5.N(mx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new kx0(mx0Var), null).f20608a;
            b2Var.show();
            b2Var.h();
        } else if (i10 == mx0Var.f39289f) {
            if (i11 == 1) {
                ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                n2Var.d = new Paint();
                n2Var.f36013f = new bv[2];
                n2Var.f36017w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                ey eyVar = new ey(bundle);
                n2Var.f36010a = eyVar;
                eyVar.C2 = new yu(n2Var);
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
                n2Var.f36011b = contactsActivity;
                contactsActivity.W = new yu(n2Var);
                contactsActivity.onFragmentCreate();
                mx0Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                return;
            }
            Bundle h = a1.g.h("isNeverShare", true);
            if (i11 == 2) {
                h.putInt("chatAddType", 2);
            }
            n60 n60Var = new n60(h);
            n60Var.f39381w = new jx0(mx0Var);
            mx0Var.presentFragment(n60Var);
        } else if (i10 >= mx0Var.f39291r && i10 < mx0Var.f39292s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", mx0Var.getMessagesController().blockePeers.keyAt(i10 - mx0Var.f39291r));
                mx0Var.presentFragment(new ProfileActivity(bundle3, null));
                return;
            }
            new Bundle();
            throw null;
        }
    }

    @Override
    public final void a(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        int i11;
        int i12;
        pt ptVar;
        boolean[] zArr;
        g00 g00Var;
        org.telegram.ui.Components.xc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        int i15 = 3;
        kt ktVar = null;
        boolean z10 = false;
        int i16 = 1;
        switch (this.f37713a) {
            case 0:
                l lVar = (l) this.f37714b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                        lVar.f38700c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.v8) view).setChecked(z12);
                        lVar.f38700c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.x90 x90Var = icVar.f27186b;
                            x90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.h6.Gi, 0, new ut0(lVar, 3)));
                            x90Var.setSingleLine(false);
                            x90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            icVar.f27185a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.qc.g(lVar, icVar, 3500).j();
                            int i18 = -lVar.e;
                            lVar.e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                        boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                        ((org.telegram.ui.Cells.v8) view).setChecked(z13);
                        lVar.f38700c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                p pVar = (p) this.f37714b;
                if (i10 >= pVar.f39934x && i10 < pVar.f39935y && pVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) pVar.h.get(i10 - pVar.f39934x);
                    if (stickerSetCovered.set.f20306id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f20299id = stickerSetCovered.set.f20306id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.oy0 oy0Var = new org.telegram.ui.Components.oy0(pVar.getParentActivity(), pVar, inputStickerSet, null, null, null);
                    oy0Var.f29091c0 = new n(pVar, view, stickerSetCovered);
                    pVar.showDialog(oy0Var);
                    return;
                }
                return;
            case 2:
                r4 r4Var = (r4) this.f37714b;
                ti.a aVar = ti.e.f47261b;
                if (i10 == 1) {
                    synchronized (aVar) {
                        if (!aVar.f47252b) {
                            SharedPreferences sharedPreferences = ti.d.f47259a;
                            aVar.f47253c = sharedPreferences.contains("audio_recorder_v2_enabled");
                            aVar.d = sharedPreferences.getBoolean("audio_recorder_v2_enabled", true);
                            aVar.f47252b = true;
                        }
                        boolean z14 = !aVar.d;
                        aVar.d = z14;
                        aVar.f47253c = true;
                        aVar.f47252b = true;
                        ti.d.f47259a.edit().putBoolean("audio_recorder_v2_enabled", z14).apply();
                    }
                    r4Var.f40596b.l();
                    return;
                }
                aVar.a();
                if (aVar.d && i10 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r4Var.getParentActivity());
                    alertDialog$Builder.f20608a.R = LocaleController.getString(R.string.AudioRecorderNoiseSuppression);
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.AudioRecorderNoiseSuppressionOff), LocaleController.getString(R.string.AudioRecorderNoiseSuppressionRNNoise)}, new p4(r4Var, 0));
                    r4Var.showDialog(alertDialog$Builder.f20608a);
                    return;
                }
                return;
            case 3:
                bd bdVar = (bd) this.f37714b;
                ArrayList arrayList2 = bdVar.f35671c;
                ua1 ua1Var = bdVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.vp vpVar = (org.telegram.ui.Components.vp) arrayList2.get(i10);
                    bdVar.a(vpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + ua1Var.getPaddingLeft()) {
                        ua1Var.v0(-((AndroidUtilities.dp(48.0f) + ua1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (ua1Var.getMeasuredWidth() - ua1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        ua1Var.v0(org.telegram.messenger.g0.A(48.0f, ua1Var.getMeasuredWidth() - ua1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = bdVar.f35674r;
                    if (callback != null) {
                        callback.run(vpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                kp kpVar = (kp) this.f37714b;
                boolean z15 = kpVar.f38634s;
                if (kpVar.getParentActivity() != null) {
                    s4.g0 adapter = kpVar.f38629b.getAdapter();
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
                        bundle.putLong("chat_id", chat.f20279id);
                        kpVar.presentFragment(new sn(bundle));
                        return;
                    } else if (i10 == kpVar.F) {
                        if (z15 && kpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{kpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = kpVar.f38631f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            u60 u60Var = new u60(bundle2);
                            u60Var.Y = new cp(kpVar);
                            kpVar.presentFragment(u60Var);
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
                            alertDialog$Builder2.f20608a.R = string;
                            alertDialog$Builder2.f20608a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.DiscussionUnlink), new b1(kpVar, 22));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20608a;
                            kpVar.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21231q7, false));
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
                rp rpVar = (rp) this.f37714b;
                ArrayList arrayList3 = rpVar.f40807r;
                boolean z16 = rpVar.G;
                if (z16) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                if (i10 > i11) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
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
                    Switch r22 = yVar.f23831c;
                    if (r22 != null) {
                        r22.c(z17, true);
                    }
                    org.telegram.ui.Components.xp xpVar = yVar.d;
                    if (xpVar != null) {
                        xpVar.a(z17, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ct ctVar = (ct) this.f37714b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ft) view).d;
                gt gtVar = ctVar.f35998a;
                ah.t0 reactionsWindow = gtVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f883q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ty0.c(null, gtVar.f37333c0, gtVar.f37354z.getContext(), new g5(ctVar, 9));
                    return;
                }
                et etVar = gtVar.f37341l;
                if (etVar != null) {
                    etVar.w(stickerSetCovered2.set, TextUtils.join("", gtVar.f37344o));
                }
                gtVar.p();
                return;
            case 7:
                qt qtVar = (qt) this.f37714b;
                if (qtVar.f40522f && qtVar.e) {
                    ot otVar = qtVar.d;
                    ArrayList arrayList4 = otVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        ktVar = (kt) otVar.e.get(i10);
                    }
                } else {
                    int S = qtVar.f40521c.S(i10);
                    int Q = qtVar.f40521c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        ktVar = qtVar.f40521c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    qtVar.finishFragment();
                    if (ktVar != null && (ptVar = qtVar.f40524r) != null) {
                        ptVar.L0(ktVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ju juVar = (ju) this.f37714b;
                ArrayList arrayList5 = juVar.f38345a3;
                nu nuVar = juVar.f38357m3;
                if ((view instanceof cu) && i10 >= 0 && i10 < arrayList5.size()) {
                    eu euVar = (eu) arrayList5.get(i10);
                    if (euVar != null) {
                        int i20 = euVar.h;
                        if (i20 >= 0) {
                            juVar.f38351g3[i20] = !zArr[i20];
                            juVar.B1(true);
                            return;
                        } else if (i20 == -2) {
                            nuVar.presentFragment(new DataAutoDownloadActivity(juVar.W2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.q8) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(nuVar.getParentActivity());
                    alertDialog$Builder3.f20608a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder3.f20608a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Reset), new fu(juVar));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder3.f20608a;
                    nuVar.showDialog(b2Var2);
                    TextView textView2 = (TextView) b2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21231q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                nz.V((nz) this.f37714b, view, i10);
                return;
            case 10:
                p00 p00Var = (p00) this.f37714b;
                if (p00Var.getParentActivity() != null && (g00Var = (g00) p00Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = g00Var.f37036c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = g00Var.f44334a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                        p00Var.v0(g00Var, vaVar.getName(), vaVar.getCurrentObject(), g00Var.f37038g);
                        return;
                    } else if (i21 == 7) {
                        nt ntVar = new nt(13, p00Var, g00Var);
                        if (p00Var.f39941c.isEnabled()) {
                            p00Var.s0(ntVar, false);
                            return;
                        } else {
                            ntVar.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && g00Var.f37041k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = p00Var.f39944r;
                        if (p00Var.f39945s && p00Var.f39941c.getAlpha() > 0.0f) {
                            float f7 = -p00Var.Q;
                            p00Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            p00Var.v = true;
                            cj cjVar = p00Var.R;
                            if (cjVar == null || cjVar.getVisibility() != 0) {
                                cj cjVar2 = new cj(6, 2, p00Var.getParentActivity(), null, true);
                                p00Var.R = cjVar2;
                                cjVar2.f29817a.setMaxWidth(AndroidUtilities.displaySize.x);
                                p00Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                p00Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                p00Var.getParentLayout().getOverlayContainerView().addView(p00Var.R, marginLayoutParams);
                                p00Var.R.f(p00Var.f39941c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(p00Var.f39946w) || !TextUtils.isEmpty(dialogFilter.name)) && (p00Var.f39948y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && p00Var.G.isEmpty() && !p00Var.F.isEmpty()) {
                            p00Var.s0(new rz(p00Var, 1), false);
                            return;
                        } else {
                            float f10 = -p00Var.Q;
                            p00Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(p00Var.f39946w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.xc.a0(p00Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((p00Var.f39948y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!p00Var.G.isEmpty()) {
                                    a02 = org.telegram.ui.Components.xc.a0(p00Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.xc.a0(p00Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (p00Var.F.isEmpty()) {
                                a02 = org.telegram.ui.Components.xc.a0(p00Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.xc.a0(p00Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.kk.q(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                c00 c00Var = (c00) this.f37714b;
                ArrayList arrayList6 = c00Var.f35791d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    g00 g00Var2 = (g00) arrayList6.get(i22);
                    int i23 = g00Var2.f44334a;
                    if (i23 == 7) {
                        c00Var.dismiss();
                        c00Var.f24922n.presentFragment(new nz(c00Var.X, g00Var2.f37043m));
                        return;
                    } else if (i23 == 8) {
                        c00Var.R();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                g10 g10Var = (g10) this.f37714b;
                if (view instanceof org.telegram.ui.Cells.i7) {
                    g10Var.f(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m7) {
                    g10Var.f(i10, view, ((org.telegram.ui.Cells.m7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    g10Var.f(i10, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    g10Var.f(i10, view, ((org.telegram.ui.Cells.f2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r2) {
                    g10Var.f(i10, view, ((org.telegram.ui.Cells.r2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                w60 w60Var = (w60) this.f37714b;
                if (w60Var.getParentActivity() != null) {
                    if (i10 != w60Var.f42395n && i10 != 0) {
                        if (i10 == w60Var.f42397s) {
                            if (w60Var.f42394f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", w60Var.f42394f.link);
                                    w60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == w60Var.f42396r) {
                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(w60Var.getParentActivity());
                            alertDialog$Builder4.f20608a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder4.f20608a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new wt(w60Var, 12));
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            w60Var.showDialog(alertDialog$Builder4.f20608a);
                            return;
                        } else {
                            return;
                        }
                    } else if (w60Var.f42394f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", w60Var.f42394f.link));
                            org.telegram.ui.Components.xc.j(w60Var).j();
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
                c70.U((c70) this.f37714b, view, i10);
                return;
            case 15:
                t70.U((t70) this.f37714b, view, i10);
                return;
            case 16:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f37714b, view, i10);
                return;
            case 17:
                pc0 pc0Var = (pc0) this.f37714b;
                pc0Var.f40068i0 = -1L;
                int i24 = pc0Var.G0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) pc0Var.T.J(i10)) != null) {
                        if (pc0Var.f40063e0 == 0) {
                            pc0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            pc0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(pc0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = pc0Var.getMessagesController().getInputChannel(-pc0Var.f40063e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        b2VarArr[0].setOnCancelListener(new ai.e0(pc0Var, pc0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ea(pc0Var, b2VarArr, tL_messageMediaVenue, 19)), 8));
                        pc0Var.showDialog(b2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = pc0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = pc0Var.f40090z0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), pc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = pc0Var.B0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = pc0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = pc0Var.B0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), pc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i24 != 2) {
                    if (pc0Var.F0 != null && pc0Var.f40087x0 != null) {
                        FrameLayout frameLayout = pc0Var.f40074o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(pc0Var.f40087x0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(pc0Var.f40087x0.getLongitude());
                        pc0Var.F0.b(tL_messageMediaGeo, pc0Var.G0, true, 0, 0L);
                        pc0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && pc0Var.getLocationController().isSharingLocation(pc0Var.f40063e0) && pc0Var.T.j(i10) == 7) {
                    pc0Var.getLocationController().removeSharingLocation(pc0Var.f40063e0);
                    pc0Var.T.l();
                    pc0Var.finishFragment();
                    return;
                } else if (i24 == 2 && pc0Var.getLocationController().isSharingLocation(pc0Var.f40063e0) && pc0Var.T.j(i10) == 6) {
                    if (pc0Var.getLocationController().getSharingLocationInfo(pc0Var.f40063e0).period != Integer.MAX_VALUE) {
                        z10 = true;
                    }
                    pc0Var.r0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (pc0Var.getLocationController().isSharingLocation(pc0Var.f40063e0)) {
                        pc0Var.getLocationController().removeSharingLocation(pc0Var.f40063e0);
                        pc0Var.T.l();
                        pc0Var.finishFragment();
                        return;
                    }
                    pc0Var.r0(false);
                    return;
                } else {
                    Object J = pc0Var.T.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        pc0Var.F0.b((TLRPC.TL_messageMediaVenue) J, pc0Var.G0, true, 0, 0L);
                        pc0Var.finishFragment();
                        return;
                    } else if (J instanceof jc0) {
                        jc0 jc0Var = (jc0) J;
                        pc0Var.f40068i0 = jc0Var.f38127a;
                        if (pc0Var.f40069j0) {
                            pc0Var.f40069j0 = false;
                            pc0Var.B0();
                        }
                        pc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(jc0Var.e.getPosition(), pc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 18:
                ((oi0) this.f37714b).onBackPressed();
                return;
            case 19:
                wi0 wi0Var = (wi0) this.f37714b;
                int i25 = wi0Var.I;
                if (i10 >= i25 && i10 < wi0Var.J) {
                    MessageObject messageObject2 = (MessageObject) wi0Var.f42900x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!wi0Var.a0(messageObject2)) {
                            wi0Var.getOrCreateStoryViewer().F(wi0Var.getParentActivity(), messageObject2.storyItem, ci.r7.a(wi0Var.f42895f));
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
                    if (wi0Var.getMessagesController().checkCanOpenChat(bundle3, wi0Var)) {
                        wi0Var.presentFragment(new sn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                PasscodeActivity.V((PasscodeActivity) this.f37714b, view, i10);
                return;
            case 21:
                jp0 jp0Var = (jp0) this.f37714b;
                jp0Var.a(i10, true);
                wo0 wo0Var = jp0Var.h;
                if (wo0Var != null) {
                    wo0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 22:
                lq0 lq0Var = (lq0) this.f37714b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = lq0Var.f38919f;
                ArrayList arrayList8 = lq0Var.f38927n;
                MediaController.AlbumEntry albumEntry = lq0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        pq0 pq0Var = lq0Var.f38936t0;
                        if (pq0Var != null) {
                            switch (pq0Var.f40232a) {
                                case 0:
                                    qq0.h0(pq0Var.f40233b, str);
                                    return;
                                default:
                                    qq0.h0(pq0Var.f40233b, str);
                                    return;
                            }
                        }
                        lq0Var.P.getSearchField().setText(str);
                        lq0Var.P.getSearchField().setSelection(str.length());
                        lq0Var.b0(lq0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(lq0Var.getParentActivity());
                        alertDialog$Builder5.f20608a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder5.f20608a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder5.k(LocaleController.getString(R.string.ClearButton), new yp0(lq0Var, 4));
                        alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder5.f20608a;
                        lq0Var.showDialog(b2Var3);
                        TextView textView3 = (TextView) b2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21231q7, false));
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
                    PhotoViewer.t1().K2(null, lq0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = lq0Var.H;
                    boolean z18 = lq0Var.I;
                    t12.h = i27;
                    t12.f33350n = z18;
                    PhotoViewer.t1().g2(arrayList7, i10, i16, lq0Var.f38926l0, lq0Var.f38942x0, lq0Var.U);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.f37714b;
                ArrayList arrayList9 = photoViewer.f33297g7;
                if (!arrayList9.isEmpty() && (i14 = photoViewer.P4) >= 0 && i14 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f33331k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.f33331k5 = false;
                return;
            case 24:
                b(i10, view);
                return;
            case 25:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f37714b, view, i10);
                return;
            case 26:
                c(i10, view);
                return;
            case 27:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f37714b, view, i10);
                return;
            case 28:
                d(i10, view);
                return;
            default:
                ProfileActivity.W((ProfileActivity) this.f37714b, i10);
                return;
        }
    }
}
