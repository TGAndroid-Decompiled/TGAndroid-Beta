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
public final class i implements org.telegram.ui.Components.am0 {
    public final int f36681a;
    public final Object f36682b;

    public i(Object obj, int i10) {
        this.f36681a = i10;
        this.f36682b = obj;
    }

    private final void b(int i10, View view) {
        boolean z10;
        fw0 fw0Var = (fw0) this.f36682b;
        boolean[] zArr = fw0Var.f36007w;
        if (i10 == fw0Var.f35997o0) {
            fw0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = fw0Var.L;
            org.telegram.ui.Components.lz0 lz0Var = fw0Var.Q;
            if (lz0Var != null) {
                lz0Var.f();
            }
            if (fw0Var.I) {
                int i11 = -fw0Var.O;
                fw0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == fw0Var.f36001r0) {
                z10 = !fw0Var.G;
                fw0Var.G = z10;
            } else {
                int i12 = fw0Var.f36005u0;
                if (i10 == i12) {
                    z10 = !fw0Var.H;
                    fw0Var.H = z10;
                } else if (i10 == fw0Var.f36006v0) {
                    boolean z12 = !fw0Var.J;
                    fw0Var.J = z12;
                    fw0Var.r0();
                    int i13 = fw0Var.f36005u0;
                    if (i13 >= 0 && i12 < 0) {
                        fw0Var.f35981b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        fw0Var.f35981b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == fw0Var.f36003s0) {
                    boolean z13 = fw0Var.K;
                    boolean z14 = !z13;
                    fw0Var.K = z14;
                    if (!z13 && fw0Var.L) {
                        int i14 = fw0Var.f35992j0;
                        fw0Var.L = false;
                        fw0Var.r0();
                        s4.b1 K = fw0Var.f35983c.K(fw0Var.f36004t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.w8) K.f44838a).setChecked(false);
                        } else {
                            fw0Var.f35981b.m(fw0Var.f36004t0);
                        }
                        fw0Var.f35981b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (fw0Var.N == 0) {
                    z10 = !fw0Var.L;
                    fw0Var.L = z10;
                    int i15 = fw0Var.f35992j0;
                    fw0Var.r0();
                    if (fw0Var.L) {
                        fw0Var.f35981b.s(fw0Var.f35992j0, 2);
                    } else {
                        fw0Var.f35981b.t(i15, 2);
                    }
                    if (fw0Var.L && fw0Var.K) {
                        fw0Var.K = false;
                        s4.b1 K2 = fw0Var.f35983c.K(fw0Var.f36003s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.w8) K2.f44838a).setChecked(false);
                        } else {
                            fw0Var.f35981b.m(fw0Var.f36003s0);
                        }
                    }
                    if (fw0Var.L) {
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
            if (fw0Var.M && !fw0Var.L) {
                fw0Var.h.b(true);
            }
            fw0Var.f35983c.getChildCount();
            for (int i17 = fw0Var.f35996n0; i17 < fw0Var.f35996n0 + fw0Var.f36011y; i17++) {
                s4.b1 K3 = fw0Var.f35983c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f44838a;
                    if (view2 instanceof org.telegram.ui.Cells.d6) {
                        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view2;
                        d6Var.m(fw0Var.L, true);
                        d6Var.f20769r.a(zArr[i17 - fw0Var.f35996n0], z11);
                        if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == fw0Var.f36004t0 && !fw0Var.M) {
                            fw0Var.h.f(d6Var.getCheckBox(), true);
                            fw0Var.M = true;
                        }
                    }
                }
            }
            w8Var.setChecked(z10);
            fw0Var.i0();
        }
    }

    private final void c(int i10, View view) {
        rx0 rx0Var;
        px0 px0Var = (px0) this.f36682b;
        PremiumPreviewFragment premiumPreviewFragment = px0Var.f39026n;
        ArrayList arrayList = premiumPreviewFragment.d;
        mx0 mx0Var = px0Var.e;
        if (view.isEnabled() && (view instanceof sg.r1)) {
            sg.r1 r1Var = (sg.r1) view;
            premiumPreviewFragment.e = arrayList.indexOf(r1Var.getTier());
            boolean z10 = true;
            premiumPreviewFragment.t0(true);
            r1Var.c(true, true);
            for (int i11 = 0; i11 < mx0Var.getChildCount(); i11++) {
                View childAt = mx0Var.getChildAt(i11);
                if (childAt instanceof sg.r1) {
                    sg.r1 r1Var2 = (sg.r1) childAt;
                    if (r1Var2.getTier() != r1Var.getTier()) {
                        r1Var2.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < mx0Var.getHiddenChildCount(); i12++) {
                View V = mx0Var.V(i12);
                if (V instanceof sg.r1) {
                    sg.r1 r1Var3 = (sg.r1) V;
                    if (r1Var3.getTier() != r1Var.getTier()) {
                        r1Var3.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < mx0Var.getCachedChildCount(); i13++) {
                View P = mx0Var.P(i13);
                if (P instanceof sg.r1) {
                    sg.r1 r1Var4 = (sg.r1) P;
                    if (r1Var4.getTier() != r1Var.getTier()) {
                        r1Var4.c(false, true);
                    }
                }
            }
            for (int i14 = 0; i14 < mx0Var.getAttachedScrapChildCount(); i14++) {
                View O = mx0Var.O(i14);
                if (O instanceof sg.r1) {
                    sg.r1 r1Var5 = (sg.r1) O;
                    if (r1Var5.getTier() != r1Var.getTier()) {
                        r1Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.J;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((rx0Var = premiumPreviewFragment.f32155f) == null || rx0Var.f39615a.months >= ((rx0) arrayList.get(premiumPreviewFragment.e)).f39615a.months || premiumPreviewFragment.f32166p0)) {
                z10 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10);
        }
    }

    private final void d(int i10, View view) {
        my0 my0Var = (my0) this.f36682b;
        int i11 = my0Var.f38095y;
        if (i10 == my0Var.f38093w) {
            org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.N(my0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ky0(my0Var), null).f19248a;
            a2Var.show();
            a2Var.h();
        } else if (i10 == my0Var.f38089f) {
            if (i11 == 1) {
                ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
                m2Var.d = new Paint();
                m2Var.f39952f = new rv[2];
                m2Var.f39956w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                yy yyVar = new yy(bundle);
                m2Var.f39949a = yyVar;
                yyVar.C2 = new pv(m2Var);
                yyVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                m2Var.f39950b = contactsActivity;
                contactsActivity.W = new pv(m2Var);
                contactsActivity.onFragmentCreate();
                my0Var.presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
                return;
            }
            Bundle h = a1.g.h("isNeverShare", true);
            if (i11 == 2) {
                h.putInt("chatAddType", 2);
            }
            j70 j70Var = new j70(h);
            j70Var.f36966w = new jy0(my0Var);
            my0Var.presentFragment(j70Var);
        } else if (i10 >= my0Var.f38091r && i10 < my0Var.f38092s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", my0Var.getMessagesController().blockePeers.keyAt(i10 - my0Var.f38091r));
                my0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        eu euVar;
        boolean[] zArr;
        b10 b10Var;
        org.telegram.ui.Components.zc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        int i15;
        int i16 = 3;
        au auVar = null;
        boolean z10 = false;
        switch (this.f36681a) {
            case 0:
                l lVar = (l) this.f36682b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        lVar.f37561c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z12);
                        lVar.f37561c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.da0 da0Var = kcVar.f26348b;
                            da0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.g6.Gi, 0, new su0(lVar, 3)));
                            da0Var.setSingleLine(false);
                            da0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            kcVar.f26347a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.sc.g(lVar, kcVar, 3500).j();
                            int i18 = -lVar.e;
                            lVar.e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                        boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z13);
                        lVar.f37561c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                p pVar = (p) this.f36682b;
                if (i10 >= pVar.f38780x && i10 < pVar.f38781y && pVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) pVar.h.get(i10 - pVar.f38780x);
                    if (stickerSetCovered.set.f18943id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f18936id = stickerSetCovered.set.f18943id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.uy0 uy0Var = new org.telegram.ui.Components.uy0(pVar.getParentActivity(), pVar, inputStickerSet, null, null, null);
                    uy0Var.f29492c0 = new n(pVar, view, stickerSetCovered);
                    pVar.showDialog(uy0Var);
                    return;
                }
                return;
            case 2:
                q4 q4Var = (q4) this.f36682b;
                si.a aVar = si.e.f45485b;
                if (i10 == 1) {
                    synchronized (aVar) {
                        if (!aVar.f45476b) {
                            SharedPreferences sharedPreferences = si.d.f45483a;
                            aVar.f45477c = sharedPreferences.contains("audio_recorder_v2_enabled");
                            aVar.d = sharedPreferences.getBoolean("audio_recorder_v2_enabled", true);
                            aVar.f45476b = true;
                        }
                        boolean z14 = !aVar.d;
                        aVar.d = z14;
                        aVar.f45477c = true;
                        aVar.f45476b = true;
                        si.d.f45483a.edit().putBoolean("audio_recorder_v2_enabled", z14).apply();
                    }
                    q4Var.f39058b.l();
                    return;
                }
                aVar.a();
                if (aVar.d && i10 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getParentActivity());
                    alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.AudioRecorderNoiseSuppression);
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.AudioRecorderNoiseSuppressionOff), LocaleController.getString(R.string.AudioRecorderNoiseSuppressionRNNoise)}, new o4(q4Var, 0));
                    q4Var.showDialog(alertDialog$Builder.f19248a);
                    return;
                }
                return;
            case 3:
                ed edVar = (ed) this.f36682b;
                ArrayList arrayList2 = edVar.f35258c;
                kc1 kc1Var = edVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList2.get(i10);
                    edVar.a(ypVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + kc1Var.getPaddingLeft()) {
                        kc1Var.v0(-((AndroidUtilities.dp(48.0f) + kc1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (kc1Var.getMeasuredWidth() - kc1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        kc1Var.v0(org.telegram.messenger.g0.A(48.0f, kc1Var.getMeasuredWidth() - kc1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = edVar.f35261r;
                    if (callback != null) {
                        callback.run(ypVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                aq aqVar = (aq) this.f36682b;
                boolean z15 = aqVar.f34054s;
                if (aqVar.getParentActivity() != null) {
                    s4.g0 adapter = aqVar.f34049b.getAdapter();
                    zp zpVar = aqVar.e;
                    if (adapter == zpVar) {
                        chat = (TLRPC.Chat) zpVar.d.get(i10);
                    } else {
                        int i19 = aqVar.G;
                        if (i10 >= i19 && i10 < aqVar.H) {
                            chat = (TLRPC.Chat) aqVar.v.get(i10 - i19);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z15 && aqVar.h.linked_chat_id == 0) {
                            aqVar.a0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f18916id);
                        aqVar.presentFragment(new fo(bundle));
                        return;
                    } else if (i10 == aqVar.F) {
                        if (z15 && aqVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{aqVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = aqVar.f34051f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            p70 p70Var = new p70(bundle2);
                            p70Var.Y = new rp(aqVar);
                            aqVar.presentFragment(p70Var);
                            return;
                        } else if (!aqVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) aqVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(aqVar.getParentActivity());
                            if (z15) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder2.f19248a.R = string;
                            alertDialog$Builder2.f19248a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.DiscussionUnlink), new b1(aqVar, 22));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.f19248a;
                            aqVar.showDialog(a2Var);
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
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
                hq hqVar = (hq) this.f36682b;
                ArrayList arrayList3 = hqVar.f36628r;
                boolean z16 = hqVar.G;
                if (z16) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                if (i10 > i11) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    if (z16) {
                        i16 = 2;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - i16);
                    boolean contains = hqVar.d.contains(tL_availableReaction.reaction);
                    boolean z17 = !contains;
                    if (!contains) {
                        hqVar.d.add(tL_availableReaction.reaction);
                    } else {
                        hqVar.d.remove(tL_availableReaction.reaction);
                        if (hqVar.d.isEmpty()) {
                            gq gqVar = hqVar.h;
                            if (gqVar != null) {
                                if (hqVar.G) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                gqVar.t(i12, arrayList3.size() + 1);
                            }
                            hqVar.V(2, true);
                        }
                    }
                    Switch r22 = yVar.f22459c;
                    if (r22 != null) {
                        r22.c(z17, true);
                    }
                    org.telegram.ui.Components.aq aqVar2 = yVar.d;
                    if (aqVar2 != null) {
                        aqVar2.a(z17, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                tt ttVar = (tt) this.f36682b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((wt) view).d;
                xt xtVar = ttVar.f40207a;
                ah.t0 reactionsWindow = xtVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f881q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.zy0.c(null, xtVar.f41639c0, xtVar.f41660z.getContext(), new f5(ttVar, 9));
                    return;
                }
                vt vtVar = xtVar.f41647l;
                if (vtVar != null) {
                    vtVar.w(stickerSetCovered2.set, TextUtils.join("", xtVar.f41650o));
                }
                xtVar.p();
                return;
            case 7:
                fu fuVar = (fu) this.f36682b;
                if (fuVar.f35956f && fuVar.e) {
                    du duVar = fuVar.d;
                    ArrayList arrayList4 = duVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        auVar = (au) duVar.e.get(i10);
                    }
                } else {
                    int S = fuVar.f35955c.S(i10);
                    int Q = fuVar.f35955c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        auVar = fuVar.f35955c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    fuVar.finishFragment();
                    if (auVar != null && (euVar = fuVar.f35958r) != null) {
                        euVar.Z0(auVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                av avVar = (av) this.f36682b;
                ArrayList arrayList5 = avVar.f34090a3;
                ev evVar = avVar.f34102m3;
                if ((view instanceof tu) && i10 >= 0 && i10 < arrayList5.size()) {
                    vu vuVar = (vu) arrayList5.get(i10);
                    if (vuVar != null) {
                        int i20 = vuVar.h;
                        if (i20 >= 0) {
                            avVar.f34096g3[i20] = !zArr[i20];
                            avVar.B1(true);
                            return;
                        } else if (i20 == -2) {
                            evVar.presentFragment(new DataAutoDownloadActivity(avVar.W2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(evVar.getParentActivity());
                    alertDialog$Builder3.f19248a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder3.f19248a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Reset), new wu(avVar));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder3.f19248a;
                    evVar.showDialog(a2Var2);
                    TextView textView2 = (TextView) a2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                h00.V((h00) this.f36682b, view, i10);
                return;
            case 10:
                k10 k10Var = (k10) this.f36682b;
                if (k10Var.getParentActivity() != null && (b10Var = (b10) k10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = b10Var.f34140c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = b10Var.f42904a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
                        k10Var.v0(b10Var, xaVar.getName(), xaVar.getCurrentObject(), b10Var.f34142g);
                        return;
                    } else if (i21 == 7) {
                        org.telegram.ui.Components.n51 n51Var = new org.telegram.ui.Components.n51(25, k10Var, b10Var);
                        if (k10Var.f37200c.isEnabled()) {
                            k10Var.s0(n51Var, false);
                            return;
                        } else {
                            n51Var.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && b10Var.f34145k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = k10Var.f37203r;
                        if (k10Var.f37204s && k10Var.f37200c.getAlpha() > 0.0f) {
                            float f7 = -k10Var.Q;
                            k10Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            k10Var.v = true;
                            nj njVar = k10Var.R;
                            if (njVar == null || njVar.getVisibility() != 0) {
                                nj njVar2 = new nj(6, 2, k10Var.getParentActivity(), null, true);
                                k10Var.R = njVar2;
                                njVar2.f29552a.setMaxWidth(AndroidUtilities.displaySize.x);
                                k10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                k10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                k10Var.getParentLayout().getOverlayContainerView().addView(k10Var.R, marginLayoutParams);
                                k10Var.R.f(k10Var.f37200c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(k10Var.f37205w) || !TextUtils.isEmpty(dialogFilter.name)) && (k10Var.f37207y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && k10Var.G.isEmpty() && !k10Var.F.isEmpty()) {
                            k10Var.s0(new l00(k10Var, 1), false);
                            return;
                        } else {
                            float f10 = -k10Var.Q;
                            k10Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(k10Var.f37205w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.zc.a0(k10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((k10Var.f37207y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!k10Var.G.isEmpty()) {
                                    a02 = org.telegram.ui.Components.zc.a0(k10Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.zc.a0(k10Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (k10Var.F.isEmpty()) {
                                a02 = org.telegram.ui.Components.zc.a0(k10Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.zc.a0(k10Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.sk.q(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                w00 w00Var = (w00) this.f36682b;
                ArrayList arrayList6 = w00Var.f40818d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    b10 b10Var2 = (b10) arrayList6.get(i22);
                    int i23 = b10Var2.f42904a;
                    if (i23 == 7) {
                        w00Var.dismiss();
                        w00Var.f24070n.presentFragment(new h00(w00Var.X, b10Var2.f34147m));
                        return;
                    } else if (i23 == 8) {
                        w00Var.R();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                b20 b20Var = (b20) this.f36682b;
                if (view instanceof org.telegram.ui.Cells.j7) {
                    b20Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    b20Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.i7) {
                    b20Var.f(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    b20Var.f(i10, view, ((org.telegram.ui.Cells.f2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s2) {
                    b20Var.f(i10, view, ((org.telegram.ui.Cells.s2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                s70 s70Var = (s70) this.f36682b;
                if (s70Var.getParentActivity() != null) {
                    if (i10 != s70Var.f39709n && i10 != 0) {
                        if (i10 == s70Var.f39711s) {
                            if (s70Var.f39708f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", s70Var.f39708f.link);
                                    s70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == s70Var.f39710r) {
                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(s70Var.getParentActivity());
                            alertDialog$Builder4.f19248a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder4.f19248a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new mu(s70Var, 12));
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            s70Var.showDialog(alertDialog$Builder4.f19248a);
                            return;
                        } else {
                            return;
                        }
                    } else if (s70Var.f39708f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", s70Var.f39708f.link));
                            org.telegram.ui.Components.zc.j(s70Var).j();
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
                y70.U((y70) this.f36682b, view, i10);
                return;
            case 15:
                p80.U((p80) this.f36682b, view, i10);
                return;
            case 16:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f36682b, view, i10);
                return;
            case 17:
                ld0 ld0Var = (ld0) this.f36682b;
                ld0Var.f37695i0 = -1L;
                int i24 = ld0Var.G0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) ld0Var.T.J(i10)) != null) {
                        if (ld0Var.f37690e0 == 0) {
                            ld0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            ld0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(ld0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = ld0Var.getMessagesController().getInputChannel(-ld0Var.f37690e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        a2VarArr[0].setOnCancelListener(new ga(ld0Var, ld0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new fa(ld0Var, a2VarArr, tL_messageMediaVenue, 19)), 7));
                        ld0Var.showDialog(a2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = ld0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = ld0Var.f37717z0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), ld0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = ld0Var.B0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = ld0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = ld0Var.B0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), ld0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i24 != 2) {
                    if (ld0Var.F0 != null && ld0Var.f37714x0 != null) {
                        FrameLayout frameLayout = ld0Var.f37701o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(ld0Var.f37714x0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(ld0Var.f37714x0.getLongitude());
                        ld0Var.F0.b(tL_messageMediaGeo, ld0Var.G0, true, 0, 0L);
                        ld0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && ld0Var.getLocationController().isSharingLocation(ld0Var.f37690e0) && ld0Var.T.j(i10) == 7) {
                    ld0Var.getLocationController().removeSharingLocation(ld0Var.f37690e0);
                    ld0Var.T.l();
                    ld0Var.finishFragment();
                    return;
                } else if (i24 == 2 && ld0Var.getLocationController().isSharingLocation(ld0Var.f37690e0) && ld0Var.T.j(i10) == 6) {
                    if (ld0Var.getLocationController().getSharingLocationInfo(ld0Var.f37690e0).period != Integer.MAX_VALUE) {
                        z10 = true;
                    }
                    ld0Var.r0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (ld0Var.getLocationController().isSharingLocation(ld0Var.f37690e0)) {
                        ld0Var.getLocationController().removeSharingLocation(ld0Var.f37690e0);
                        ld0Var.T.l();
                        ld0Var.finishFragment();
                        return;
                    }
                    ld0Var.r0(false);
                    return;
                } else {
                    Object J = ld0Var.T.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        ld0Var.F0.b((TLRPC.TL_messageMediaVenue) J, ld0Var.G0, true, 0, 0L);
                        ld0Var.finishFragment();
                        return;
                    } else if (J instanceof fd0) {
                        fd0 fd0Var = (fd0) J;
                        ld0Var.f37695i0 = fd0Var.f35508a;
                        if (ld0Var.f37696j0) {
                            ld0Var.f37696j0 = false;
                            ld0Var.B0();
                        }
                        ld0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(fd0Var.e.getPosition(), ld0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 18:
                ((gj0) this.f36682b).onBackPressed();
                return;
            case 19:
                pj0 pj0Var = (pj0) this.f36682b;
                int i25 = pj0Var.I;
                if (i10 >= i25 && i10 < pj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) pj0Var.f38959x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!pj0Var.a0(messageObject2)) {
                            pj0Var.getOrCreateStoryViewer().F(pj0Var.getParentActivity(), messageObject2.storyItem, bi.g9.a(pj0Var.f38954f));
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
                    if (pj0Var.getMessagesController().checkCanOpenChat(bundle3, pj0Var)) {
                        pj0Var.presentFragment(new fo(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                PasscodeActivity.V((PasscodeActivity) this.f36682b, view, i10);
                return;
            case 21:
                dq0 dq0Var = (dq0) this.f36682b;
                dq0Var.a(i10, true);
                qp0 qp0Var = dq0Var.h;
                if (qp0Var != null) {
                    qp0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 22:
                fr0 fr0Var = (fr0) this.f36682b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = fr0Var.f35919f;
                ArrayList arrayList8 = fr0Var.f35927n;
                MediaController.AlbumEntry albumEntry = fr0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        jr0 jr0Var = fr0Var.f35936t0;
                        if (jr0Var != null) {
                            switch (jr0Var.f37124a) {
                                case 0:
                                    kr0.h0(jr0Var.f37125b, str);
                                    return;
                                default:
                                    kr0.h0(jr0Var.f37125b, str);
                                    return;
                            }
                        }
                        fr0Var.P.getSearchField().setText(str);
                        fr0Var.P.getSearchField().setSelection(str.length());
                        fr0Var.b0(fr0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(fr0Var.getParentActivity());
                        alertDialog$Builder5.f19248a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder5.f19248a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder5.k(LocaleController.getString(R.string.ClearButton), new sq0(fr0Var, 4));
                        alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder5.f19248a;
                        fr0Var.showDialog(a2Var3);
                        TextView textView3 = (TextView) a2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
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
                    org.telegram.ui.ActionBar.u0 u0Var = fr0Var.P;
                    if (u0Var != null) {
                        AndroidUtilities.hideKeyboard(u0Var.getSearchField());
                    }
                    if (fr0Var.Y) {
                        fr0Var.a0(view, arrayList7.get(i10));
                        return;
                    }
                    int i26 = fr0Var.T;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 != 2) {
                            i16 = 10;
                            if (i26 != 10) {
                                if (fr0Var.U == null) {
                                    i14 = 4;
                                } else {
                                    i14 = 0;
                                }
                            }
                        }
                        i14 = i16;
                    } else {
                        i14 = 1;
                    }
                    PhotoViewer.t1().K2(null, fr0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = fr0Var.H;
                    boolean z18 = fr0Var.I;
                    t12.h = i27;
                    t12.f32005n = z18;
                    PhotoViewer.t1().g2(arrayList7, i10, i14, fr0Var.f35926l0, fr0Var.f35942x0, fr0Var.U);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.f36682b;
                ArrayList arrayList9 = photoViewer.f31952g7;
                if (!arrayList9.isEmpty() && (i15 = photoViewer.P4) >= 0 && i15 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f31986k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.f31986k5 = false;
                return;
            case 24:
                b(i10, view);
                return;
            case 25:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f36682b, view, i10);
                return;
            case 26:
                c(i10, view);
                return;
            case 27:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f36682b, view, i10);
                return;
            case 28:
                d(i10, view);
                return;
            default:
                ProfileActivity.f0((ProfileActivity) this.f36682b, i10);
                return;
        }
    }
}
