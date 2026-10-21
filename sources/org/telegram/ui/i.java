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
public final class i implements org.telegram.ui.Components.xl0 {
    public final int f37822a;
    public final Object f37823b;

    public i(Object obj, int i10) {
        this.f37822a = i10;
        this.f37823b = obj;
    }

    private final void b(int i10, View view) {
        boolean z10;
        fv0 fv0Var = (fv0) this.f37823b;
        boolean[] zArr = fv0Var.f37126w;
        if (i10 == fv0Var.f37116o0) {
            fv0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.v8) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            boolean z11 = fv0Var.L;
            org.telegram.ui.Components.iz0 iz0Var = fv0Var.Q;
            if (iz0Var != null) {
                iz0Var.f();
            }
            if (fv0Var.I) {
                int i11 = -fv0Var.O;
                fv0Var.O = i11;
                AndroidUtilities.shakeViewSpring(v8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == fv0Var.f37120r0) {
                z10 = !fv0Var.G;
                fv0Var.G = z10;
            } else {
                int i12 = fv0Var.f37124u0;
                if (i10 == i12) {
                    z10 = !fv0Var.H;
                    fv0Var.H = z10;
                } else if (i10 == fv0Var.f37125v0) {
                    boolean z12 = !fv0Var.J;
                    fv0Var.J = z12;
                    fv0Var.r0();
                    int i13 = fv0Var.f37124u0;
                    if (i13 >= 0 && i12 < 0) {
                        fv0Var.f37100b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        fv0Var.f37100b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == fv0Var.f37122s0) {
                    boolean z13 = fv0Var.K;
                    boolean z14 = !z13;
                    fv0Var.K = z14;
                    if (!z13 && fv0Var.L) {
                        int i14 = fv0Var.f37111j0;
                        fv0Var.L = false;
                        fv0Var.r0();
                        s4.b1 K = fv0Var.f37102c.K(fv0Var.f37123t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.v8) K.f45917a).setChecked(false);
                        } else {
                            fv0Var.f37100b.m(fv0Var.f37123t0);
                        }
                        fv0Var.f37100b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (fv0Var.N == 0) {
                    z10 = !fv0Var.L;
                    fv0Var.L = z10;
                    int i15 = fv0Var.f37111j0;
                    fv0Var.r0();
                    if (fv0Var.L) {
                        fv0Var.f37100b.s(fv0Var.f37111j0, 2);
                    } else {
                        fv0Var.f37100b.t(i15, 2);
                    }
                    if (fv0Var.L && fv0Var.K) {
                        fv0Var.K = false;
                        s4.b1 K2 = fv0Var.f37102c.K(fv0Var.f37122s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.v8) K2.f45917a).setChecked(false);
                        } else {
                            fv0Var.f37100b.m(fv0Var.f37122s0);
                        }
                    }
                    if (fv0Var.L) {
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
            if (fv0Var.M && !fv0Var.L) {
                fv0Var.h.b(true);
            }
            fv0Var.f37102c.getChildCount();
            for (int i17 = fv0Var.f37115n0; i17 < fv0Var.f37115n0 + fv0Var.f37130y; i17++) {
                s4.b1 K3 = fv0Var.f37102c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f45917a;
                    if (view2 instanceof org.telegram.ui.Cells.c6) {
                        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view2;
                        c6Var.m(fv0Var.L, true);
                        c6Var.f22096r.a(zArr[i17 - fv0Var.f37115n0], z11);
                        if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == fv0Var.f37123t0 && !fv0Var.M) {
                            fv0Var.h.f(c6Var.getCheckBox(), true);
                            fv0Var.M = true;
                        }
                    }
                }
            }
            v8Var.setChecked(z10);
            fv0Var.i0();
        }
    }

    private final void c(int i10, View view) {
        pw0 pw0Var;
        nw0 nw0Var = (nw0) this.f37823b;
        PremiumPreviewFragment premiumPreviewFragment = nw0Var.f39700n;
        ArrayList arrayList = premiumPreviewFragment.d;
        kw0 kw0Var = nw0Var.e;
        if (view.isEnabled() && (view instanceof sg.r1)) {
            sg.r1 r1Var = (sg.r1) view;
            premiumPreviewFragment.e = arrayList.indexOf(r1Var.getTier());
            boolean z10 = true;
            premiumPreviewFragment.t0(true);
            r1Var.c(true, true);
            for (int i11 = 0; i11 < kw0Var.getChildCount(); i11++) {
                View childAt = kw0Var.getChildAt(i11);
                if (childAt instanceof sg.r1) {
                    sg.r1 r1Var2 = (sg.r1) childAt;
                    if (r1Var2.getTier() != r1Var.getTier()) {
                        r1Var2.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < kw0Var.getHiddenChildCount(); i12++) {
                View V = kw0Var.V(i12);
                if (V instanceof sg.r1) {
                    sg.r1 r1Var3 = (sg.r1) V;
                    if (r1Var3.getTier() != r1Var.getTier()) {
                        r1Var3.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < kw0Var.getCachedChildCount(); i13++) {
                View P = kw0Var.P(i13);
                if (P instanceof sg.r1) {
                    sg.r1 r1Var4 = (sg.r1) P;
                    if (r1Var4.getTier() != r1Var.getTier()) {
                        r1Var4.c(false, true);
                    }
                }
            }
            for (int i14 = 0; i14 < kw0Var.getAttachedScrapChildCount(); i14++) {
                View O = kw0Var.O(i14);
                if (O instanceof sg.r1) {
                    sg.r1 r1Var5 = (sg.r1) O;
                    if (r1Var5.getTier() != r1Var.getTier()) {
                        r1Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.J;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((pw0Var = premiumPreviewFragment.f33506f) == null || pw0Var.f40308a.months >= ((pw0) arrayList.get(premiumPreviewFragment.e)).f40308a.months || premiumPreviewFragment.f33517p0)) {
                z10 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10);
        }
    }

    private final void d(int i10, View view) {
        kx0 kx0Var = (kx0) this.f37823b;
        int i11 = kx0Var.f38690y;
        if (i10 == kx0Var.f38688w) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.f5.N(kx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ix0(kx0Var), null).f20605a;
            b2Var.show();
            b2Var.i();
        } else if (i10 == kx0Var.f38684f) {
            if (i11 == 1) {
                ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                n2Var.d = new Paint();
                n2Var.f35431f = new zu[2];
                n2Var.f35435w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                cy cyVar = new cy(bundle);
                n2Var.f35428a = cyVar;
                cyVar.C2 = new wu(n2Var);
                cyVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                n2Var.f35429b = contactsActivity;
                contactsActivity.W = new wu(n2Var);
                contactsActivity.onFragmentCreate();
                kx0Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                return;
            }
            Bundle h = a1.g.h("isNeverShare", true);
            if (i11 == 2) {
                h.putInt("chatAddType", 2);
            }
            l60 l60Var = new l60(h);
            l60Var.f38828w = new hx0(kx0Var);
            kx0Var.presentFragment(l60Var);
        } else if (i10 >= kx0Var.f38686r && i10 < kx0Var.f38687s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", kx0Var.getMessagesController().blockePeers.keyAt(i10 - kx0Var.f38686r));
                kx0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        nt ntVar;
        boolean[] zArr;
        e00 e00Var;
        org.telegram.ui.Components.xc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        int i15 = 3;
        ht htVar = null;
        boolean z10 = false;
        int i16 = 1;
        switch (this.f37822a) {
            case 0:
                l lVar = (l) this.f37823b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                        lVar.f38704c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.v8) view).setChecked(z12);
                        lVar.f38704c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.x90 x90Var = icVar.f27231b;
                            x90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.h6.Gi, 0, new st0(lVar, 3)));
                            x90Var.setSingleLine(false);
                            x90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            icVar.f27230a.setImageResource(R.drawable.msg_settings_premium);
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
                        lVar.f38704c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                p pVar = (p) this.f37823b;
                if (i10 >= pVar.f40029x && i10 < pVar.f40030y && pVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) pVar.h.get(i10 - pVar.f40029x);
                    if (stickerSetCovered.set.f20303id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f20296id = stickerSetCovered.set.f20303id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.qy0 qy0Var = new org.telegram.ui.Components.qy0(pVar.getParentActivity(), pVar, inputStickerSet, null, null, null);
                    qy0Var.f29748c0 = new n(pVar, view, stickerSetCovered);
                    pVar.showDialog(qy0Var);
                    return;
                }
                return;
            case 2:
                r4 r4Var = (r4) this.f37823b;
                ti.a aVar = ti.e.f47220b;
                if (i10 == 1) {
                    synchronized (aVar) {
                        if (!aVar.f47211b) {
                            SharedPreferences sharedPreferences = ti.d.f47218a;
                            aVar.f47212c = sharedPreferences.contains("audio_recorder_v2_enabled");
                            aVar.d = sharedPreferences.getBoolean("audio_recorder_v2_enabled", true);
                            aVar.f47211b = true;
                        }
                        boolean z14 = !aVar.d;
                        aVar.d = z14;
                        aVar.f47212c = true;
                        aVar.f47211b = true;
                        ti.d.f47218a.edit().putBoolean("audio_recorder_v2_enabled", z14).apply();
                    }
                    r4Var.f41056b.l();
                    return;
                }
                aVar.a();
                if (aVar.d && i10 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r4Var.getParentActivity());
                    alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.AudioRecorderNoiseSuppression);
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.AudioRecorderNoiseSuppressionOff), LocaleController.getString(R.string.AudioRecorderNoiseSuppressionRNNoise)}, new p4(r4Var, 0));
                    r4Var.showDialog(alertDialog$Builder.f20605a);
                    return;
                }
                return;
            case 3:
                zc zcVar = (zc) this.f37823b;
                ArrayList arrayList2 = zcVar.f43714c;
                sa1 sa1Var = zcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.vp vpVar = (org.telegram.ui.Components.vp) arrayList2.get(i10);
                    zcVar.a(vpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + sa1Var.getPaddingLeft()) {
                        sa1Var.v0(-((AndroidUtilities.dp(48.0f) + sa1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (sa1Var.getMeasuredWidth() - sa1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        sa1Var.v0(org.telegram.messenger.g0.A(48.0f, sa1Var.getMeasuredWidth() - sa1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = zcVar.f43717r;
                    if (callback != null) {
                        callback.run(vpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ip ipVar = (ip) this.f37823b;
                boolean z15 = ipVar.f38076s;
                if (ipVar.getParentActivity() != null) {
                    s4.g0 adapter = ipVar.f38071b.getAdapter();
                    hp hpVar = ipVar.e;
                    if (adapter == hpVar) {
                        chat = (TLRPC.Chat) hpVar.d.get(i10);
                    } else {
                        int i19 = ipVar.G;
                        if (i10 >= i19 && i10 < ipVar.H) {
                            chat = (TLRPC.Chat) ipVar.v.get(i10 - i19);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z15 && ipVar.h.linked_chat_id == 0) {
                            ipVar.a0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f20276id);
                        ipVar.presentFragment(new qn(bundle));
                        return;
                    } else if (i10 == ipVar.F) {
                        if (z15 && ipVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{ipVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = ipVar.f38073f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            s60 s60Var = new s60(bundle2);
                            s60Var.Y = new ap(ipVar);
                            ipVar.presentFragment(s60Var);
                            return;
                        } else if (!ipVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) ipVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ipVar.getParentActivity());
                            if (z15) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder2.f20605a.R = string;
                            alertDialog$Builder2.f20605a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.DiscussionUnlink), new b1(ipVar, 22));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20605a;
                            ipVar.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228q7, false));
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
                pp ppVar = (pp) this.f37823b;
                ArrayList arrayList3 = ppVar.f40272r;
                boolean z16 = ppVar.G;
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
                    boolean contains = ppVar.d.contains(tL_availableReaction.reaction);
                    boolean z17 = !contains;
                    if (!contains) {
                        ppVar.d.add(tL_availableReaction.reaction);
                    } else {
                        ppVar.d.remove(tL_availableReaction.reaction);
                        if (ppVar.d.isEmpty()) {
                            op opVar = ppVar.h;
                            if (opVar != null) {
                                if (ppVar.G) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                opVar.t(i12, arrayList3.size() + 1);
                            }
                            ppVar.V(2, true);
                        }
                    }
                    Switch r22 = yVar.f23828c;
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
                at atVar = (at) this.f37823b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((dt) view).d;
                et etVar = atVar.f35416a;
                ah.t0 reactionsWindow = etVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f881q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.vy0.c(null, etVar.f36779c0, etVar.f36800z.getContext(), new g5(atVar, 9));
                    return;
                }
                ct ctVar = etVar.f36787l;
                if (ctVar != null) {
                    ctVar.w(stickerSetCovered2.set, TextUtils.join("", etVar.f36790o));
                }
                etVar.p();
                return;
            case 7:
                ot otVar = (ot) this.f37823b;
                if (otVar.f39977f && otVar.e) {
                    mt mtVar = otVar.d;
                    ArrayList arrayList4 = mtVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        htVar = (ht) mtVar.e.get(i10);
                    }
                } else {
                    int S = otVar.f39976c.S(i10);
                    int Q = otVar.f39976c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        htVar = otVar.f39976c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    otVar.finishFragment();
                    if (htVar != null && (ntVar = otVar.f39979r) != null) {
                        ntVar.L0(htVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                hu huVar = (hu) this.f37823b;
                ArrayList arrayList5 = huVar.f37790a3;
                lu luVar = huVar.f37802m3;
                if ((view instanceof au) && i10 >= 0 && i10 < arrayList5.size()) {
                    cu cuVar = (cu) arrayList5.get(i10);
                    if (cuVar != null) {
                        int i20 = cuVar.h;
                        if (i20 >= 0) {
                            huVar.f37796g3[i20] = !zArr[i20];
                            huVar.B1(true);
                            return;
                        } else if (i20 == -2) {
                            luVar.presentFragment(new DataAutoDownloadActivity(huVar.W2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.q8) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(luVar.getParentActivity());
                    alertDialog$Builder3.f20605a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder3.f20605a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Reset), new du(huVar));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder3.f20605a;
                    luVar.showDialog(b2Var2);
                    TextView textView2 = (TextView) b2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                lz.V((lz) this.f37823b, view, i10);
                return;
            case 10:
                n00 n00Var = (n00) this.f37823b;
                if (n00Var.getParentActivity() != null && (e00Var = (e00) n00Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = e00Var.f36473c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = e00Var.f44296a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                        n00Var.v0(e00Var, vaVar.getName(), vaVar.getCurrentObject(), e00Var.f36475g);
                        return;
                    } else if (i21 == 7) {
                        lt ltVar = new lt(13, n00Var, e00Var);
                        if (n00Var.f39377c.isEnabled()) {
                            n00Var.s0(ltVar, false);
                            return;
                        } else {
                            ltVar.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && e00Var.f36478k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = n00Var.f39380r;
                        if (n00Var.f39381s && n00Var.f39377c.getAlpha() > 0.0f) {
                            float f7 = -n00Var.Q;
                            n00Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            n00Var.v = true;
                            aj ajVar = n00Var.R;
                            if (ajVar == null || ajVar.getVisibility() != 0) {
                                aj ajVar2 = new aj(6, 2, n00Var.getParentActivity(), null, true);
                                n00Var.R = ajVar2;
                                ajVar2.f29810a.setMaxWidth(AndroidUtilities.displaySize.x);
                                n00Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                n00Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                n00Var.getParentLayout().getOverlayContainerView().addView(n00Var.R, marginLayoutParams);
                                n00Var.R.f(n00Var.f39377c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(n00Var.f39382w) || !TextUtils.isEmpty(dialogFilter.name)) && (n00Var.f39384y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && n00Var.G.isEmpty() && !n00Var.F.isEmpty()) {
                            n00Var.s0(new pz(n00Var, 1), false);
                            return;
                        } else {
                            float f10 = -n00Var.Q;
                            n00Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(n00Var.f39382w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.xc.a0(n00Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((n00Var.f39384y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!n00Var.G.isEmpty()) {
                                    a02 = org.telegram.ui.Components.xc.a0(n00Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.xc.a0(n00Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (n00Var.F.isEmpty()) {
                                a02 = org.telegram.ui.Components.xc.a0(n00Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.xc.a0(n00Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.mk.q(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                a00 a00Var = (a00) this.f37823b;
                ArrayList arrayList6 = a00Var.f35239d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    e00 e00Var2 = (e00) arrayList6.get(i22);
                    int i23 = e00Var2.f44296a;
                    if (i23 == 7) {
                        a00Var.dismiss();
                        a00Var.f24882n.presentFragment(new lz(a00Var.X, e00Var2.f36480m));
                        return;
                    } else if (i23 == 8) {
                        a00Var.R();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                e10 e10Var = (e10) this.f37823b;
                if (view instanceof org.telegram.ui.Cells.i7) {
                    e10Var.f(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m7) {
                    e10Var.f(i10, view, ((org.telegram.ui.Cells.m7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    e10Var.f(i10, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    e10Var.f(i10, view, ((org.telegram.ui.Cells.f2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r2) {
                    e10Var.f(i10, view, ((org.telegram.ui.Cells.r2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                u60 u60Var = (u60) this.f37823b;
                if (u60Var.getParentActivity() != null) {
                    if (i10 != u60Var.f41814n && i10 != 0) {
                        if (i10 == u60Var.f41816s) {
                            if (u60Var.f41813f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", u60Var.f41813f.link);
                                    u60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == u60Var.f41815r) {
                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(u60Var.getParentActivity());
                            alertDialog$Builder4.f20605a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder4.f20605a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new ut(u60Var, 12));
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            u60Var.showDialog(alertDialog$Builder4.f20605a);
                            return;
                        } else {
                            return;
                        }
                    } else if (u60Var.f41813f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", u60Var.f41813f.link));
                            org.telegram.ui.Components.xc.j(u60Var).j();
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
                a70.U((a70) this.f37823b, view, i10);
                return;
            case 15:
                r70.U((r70) this.f37823b, view, i10);
                return;
            case 16:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f37823b, view, i10);
                return;
            case 17:
                nc0 nc0Var = (nc0) this.f37823b;
                nc0Var.f39510i0 = -1L;
                int i24 = nc0Var.G0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) nc0Var.T.J(i10)) != null) {
                        if (nc0Var.f39505e0 == 0) {
                            nc0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            nc0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(nc0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = nc0Var.getMessagesController().getInputChannel(-nc0Var.f39505e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        b2VarArr[0].setOnCancelListener(new ai.e0(nc0Var, nc0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ca(nc0Var, b2VarArr, tL_messageMediaVenue, 19)), 8));
                        nc0Var.showDialog(b2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = nc0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = nc0Var.f39532z0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), nc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = nc0Var.B0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = nc0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = nc0Var.B0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), nc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i24 != 2) {
                    if (nc0Var.F0 != null && nc0Var.f39529x0 != null) {
                        FrameLayout frameLayout = nc0Var.f39516o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(nc0Var.f39529x0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(nc0Var.f39529x0.getLongitude());
                        nc0Var.F0.b(tL_messageMediaGeo, nc0Var.G0, true, 0, 0L);
                        nc0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && nc0Var.getLocationController().isSharingLocation(nc0Var.f39505e0) && nc0Var.T.j(i10) == 7) {
                    nc0Var.getLocationController().removeSharingLocation(nc0Var.f39505e0);
                    nc0Var.T.l();
                    nc0Var.finishFragment();
                    return;
                } else if (i24 == 2 && nc0Var.getLocationController().isSharingLocation(nc0Var.f39505e0) && nc0Var.T.j(i10) == 6) {
                    if (nc0Var.getLocationController().getSharingLocationInfo(nc0Var.f39505e0).period != Integer.MAX_VALUE) {
                        z10 = true;
                    }
                    nc0Var.r0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (nc0Var.getLocationController().isSharingLocation(nc0Var.f39505e0)) {
                        nc0Var.getLocationController().removeSharingLocation(nc0Var.f39505e0);
                        nc0Var.T.l();
                        nc0Var.finishFragment();
                        return;
                    }
                    nc0Var.r0(false);
                    return;
                } else {
                    Object J = nc0Var.T.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        nc0Var.F0.b((TLRPC.TL_messageMediaVenue) J, nc0Var.G0, true, 0, 0L);
                        nc0Var.finishFragment();
                        return;
                    } else if (J instanceof hc0) {
                        hc0 hc0Var = (hc0) J;
                        nc0Var.f39510i0 = hc0Var.f37570a;
                        if (nc0Var.f39511j0) {
                            nc0Var.f39511j0 = false;
                            nc0Var.B0();
                        }
                        nc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(hc0Var.e.getPosition(), nc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 18:
                ((mi0) this.f37823b).onBackPressed();
                return;
            case 19:
                ui0 ui0Var = (ui0) this.f37823b;
                int i25 = ui0Var.I;
                if (i10 >= i25 && i10 < ui0Var.J) {
                    MessageObject messageObject2 = (MessageObject) ui0Var.f41998x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!ui0Var.a0(messageObject2)) {
                            ui0Var.getOrCreateStoryViewer().F(ui0Var.getParentActivity(), messageObject2.storyItem, ci.r7.a(ui0Var.f41993f));
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
                    if (ui0Var.getMessagesController().checkCanOpenChat(bundle3, ui0Var)) {
                        ui0Var.presentFragment(new qn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                PasscodeActivity.V((PasscodeActivity) this.f37823b, view, i10);
                return;
            case 21:
                hp0 hp0Var = (hp0) this.f37823b;
                hp0Var.a(i10, true);
                uo0 uo0Var = hp0Var.h;
                if (uo0Var != null) {
                    uo0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 22:
                jq0 jq0Var = (jq0) this.f37823b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = jq0Var.f38309f;
                ArrayList arrayList8 = jq0Var.f38317n;
                MediaController.AlbumEntry albumEntry = jq0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        nq0 nq0Var = jq0Var.f38326t0;
                        if (nq0Var != null) {
                            switch (nq0Var.f39674a) {
                                case 0:
                                    oq0.h0(nq0Var.f39675b, str);
                                    return;
                                default:
                                    oq0.h0(nq0Var.f39675b, str);
                                    return;
                            }
                        }
                        jq0Var.P.getSearchField().setText(str);
                        jq0Var.P.getSearchField().setSelection(str.length());
                        jq0Var.b0(jq0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(jq0Var.getParentActivity());
                        alertDialog$Builder5.f20605a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder5.f20605a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder5.k(LocaleController.getString(R.string.ClearButton), new wp0(jq0Var, 4));
                        alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder5.f20605a;
                        jq0Var.showDialog(b2Var3);
                        TextView textView3 = (TextView) b2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228q7, false));
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
                    org.telegram.ui.ActionBar.u0 u0Var = jq0Var.P;
                    if (u0Var != null) {
                        AndroidUtilities.hideKeyboard(u0Var.getSearchField());
                    }
                    if (jq0Var.Y) {
                        jq0Var.a0(view, arrayList7.get(i10));
                        return;
                    }
                    int i26 = jq0Var.T;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 != 2) {
                            i15 = 10;
                            if (i26 != 10) {
                                i16 = jq0Var.U == null ? 4 : 0;
                            }
                        }
                        i16 = i15;
                    }
                    PhotoViewer.u1().M2(null, jq0Var, null);
                    PhotoViewer u12 = PhotoViewer.u1();
                    int i27 = jq0Var.H;
                    boolean z18 = jq0Var.I;
                    u12.h = i27;
                    u12.f33356n = z18;
                    PhotoViewer.u1().i2(arrayList7, i10, i16, jq0Var.f38316l0, jq0Var.f38332x0, jq0Var.U);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.f37823b;
                ArrayList arrayList9 = photoViewer.f33303g7;
                if (!arrayList9.isEmpty() && (i14 = photoViewer.P4) >= 0 && i14 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.o1();
                    }
                }
                photoViewer.f33337k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.D2(indexOf);
                }
                photoViewer.f33337k5 = false;
                return;
            case 24:
                b(i10, view);
                return;
            case 25:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f37823b, view, i10);
                return;
            case 26:
                c(i10, view);
                return;
            case 27:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f37823b, view, i10);
                return;
            case 28:
                d(i10, view);
                return;
            default:
                ProfileActivity.W((ProfileActivity) this.f37823b, i10);
                return;
        }
    }
}
