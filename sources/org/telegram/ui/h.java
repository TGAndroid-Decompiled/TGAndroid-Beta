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
    public final int f39809a;
    public final Object f39810b;

    public h(Object obj, int i10) {
        this.f39809a = i10;
        this.f39810b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        mv0 mv0Var = (mv0) this.f39810b;
        boolean[] zArr = mv0Var.f41703w;
        if (i10 == mv0Var.f41693o0) {
            mv0Var.g0();
        } else if (view instanceof org.telegram.ui.Cells.a9) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            boolean z11 = mv0Var.L;
            org.telegram.ui.Components.tz0 tz0Var = mv0Var.Q;
            if (tz0Var != null) {
                tz0Var.f();
            }
            if (mv0Var.I) {
                int i11 = -mv0Var.O;
                mv0Var.O = i11;
                AndroidUtilities.shakeViewSpring(a9Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == mv0Var.f41697r0) {
                z10 = !mv0Var.G;
                mv0Var.G = z10;
            } else {
                int i12 = mv0Var.f41701u0;
                if (i10 == i12) {
                    z10 = !mv0Var.H;
                    mv0Var.H = z10;
                } else if (i10 == mv0Var.f41702v0) {
                    boolean z12 = !mv0Var.J;
                    mv0Var.J = z12;
                    mv0Var.s0();
                    int i13 = mv0Var.f41701u0;
                    if (i13 >= 0 && i12 < 0) {
                        mv0Var.f41677b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        mv0Var.f41677b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == mv0Var.f41699s0) {
                    boolean z13 = mv0Var.K;
                    boolean z14 = !z13;
                    mv0Var.K = z14;
                    if (!z13 && mv0Var.L) {
                        int i14 = mv0Var.f41688j0;
                        mv0Var.L = false;
                        mv0Var.s0();
                        s4.e1 K = mv0Var.f41679c.K(mv0Var.f41700t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.a9) K.f47738a).setChecked(false);
                        } else {
                            mv0Var.f41677b.m(mv0Var.f41700t0);
                        }
                        mv0Var.f41677b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (mv0Var.N == 0) {
                    z10 = !mv0Var.L;
                    mv0Var.L = z10;
                    int i15 = mv0Var.f41688j0;
                    mv0Var.s0();
                    if (mv0Var.L) {
                        mv0Var.f41677b.s(mv0Var.f41688j0, 2);
                    } else {
                        mv0Var.f41677b.t(i15, 2);
                    }
                    if (mv0Var.L && mv0Var.K) {
                        mv0Var.K = false;
                        s4.e1 K2 = mv0Var.f41679c.K(mv0Var.f41699s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.a9) K2.f47738a).setChecked(false);
                        } else {
                            mv0Var.f41677b.m(mv0Var.f41699s0);
                        }
                    }
                    if (mv0Var.L) {
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
            if (mv0Var.M && !mv0Var.L) {
                mv0Var.f41679c.getChildCount();
                mv0Var.h.b(true);
            }
            for (int i17 = mv0Var.f41692n0; i17 < mv0Var.f41692n0 + mv0Var.f41707y; i17++) {
                s4.e1 K3 = mv0Var.f41679c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f47738a;
                    if (view2 instanceof org.telegram.ui.Cells.h6) {
                        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view2;
                        h6Var.m(mv0Var.L, true);
                        h6Var.f24202r.a(zArr[i17 - mv0Var.f41692n0], z11);
                        if (h6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == mv0Var.f41700t0 && !mv0Var.M) {
                            mv0Var.h.f(h6Var.getCheckBox(), true);
                            mv0Var.M = true;
                        }
                    }
                }
            }
            a9Var.setChecked(z10);
            mv0Var.j0();
        }
    }

    private final void b(int i10, View view) {
        xw0 xw0Var;
        vw0 vw0Var = (vw0) this.f39810b;
        PremiumPreviewFragment premiumPreviewFragment = vw0Var.f44917n;
        ArrayList arrayList = premiumPreviewFragment.d;
        sw0 sw0Var = vw0Var.e;
        if (view.isEnabled() && (view instanceof tg.r1)) {
            tg.r1 r1Var = (tg.r1) view;
            premiumPreviewFragment.e = arrayList.indexOf(r1Var.getTier());
            boolean z10 = true;
            premiumPreviewFragment.u0(true);
            r1Var.c(true, true);
            for (int i11 = 0; i11 < sw0Var.getChildCount(); i11++) {
                View childAt = sw0Var.getChildAt(i11);
                if (childAt instanceof tg.r1) {
                    tg.r1 r1Var2 = (tg.r1) childAt;
                    if (r1Var2.getTier() != r1Var.getTier()) {
                        r1Var2.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < sw0Var.getHiddenChildCount(); i12++) {
                View V = sw0Var.V(i12);
                if (V instanceof tg.r1) {
                    tg.r1 r1Var3 = (tg.r1) V;
                    if (r1Var3.getTier() != r1Var.getTier()) {
                        r1Var3.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < sw0Var.getCachedChildCount(); i13++) {
                View P = sw0Var.P(i13);
                if (P instanceof tg.r1) {
                    tg.r1 r1Var4 = (tg.r1) P;
                    if (r1Var4.getTier() != r1Var.getTier()) {
                        r1Var4.c(false, true);
                    }
                }
            }
            for (int i14 = 0; i14 < sw0Var.getAttachedScrapChildCount(); i14++) {
                View O = sw0Var.O(i14);
                if (O instanceof tg.r1) {
                    tg.r1 r1Var5 = (tg.r1) O;
                    if (r1Var5.getTier() != r1Var.getTier()) {
                        r1Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.J;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((xw0Var = premiumPreviewFragment.f35873f) == null || xw0Var.f45891a.months >= ((xw0) arrayList.get(premiumPreviewFragment.e)).f45891a.months || premiumPreviewFragment.f35884p0)) {
                z10 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10);
        }
    }

    private final void d(int i10, View view) {
        sx0 sx0Var = (sx0) this.f39810b;
        int i11 = sx0Var.f43625y;
        if (i10 == sx0Var.f43623w) {
            org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.N(sx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new qx0(sx0Var), null).f22368a;
            e2Var.show();
            e2Var.i();
        } else if (i10 == sx0Var.f43619f) {
            if (i11 == 1) {
                ?? r2Var = new org.telegram.ui.ActionBar.r2(null);
                r2Var.d = new Paint();
                r2Var.f46366f = new yu[2];
                r2Var.f46370w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                cy cyVar = new cy(bundle);
                r2Var.f46363a = cyVar;
                cyVar.C2 = new wu(r2Var);
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
                r2Var.f46364b = contactsActivity;
                contactsActivity.U = new wu(r2Var);
                contactsActivity.onFragmentCreate();
                sx0Var.presentFragment((org.telegram.ui.ActionBar.r2) r2Var);
                return;
            }
            Bundle i12 = a1.g.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            r60 r60Var = new r60(i12);
            r60Var.f43039w = new px0(sx0Var);
            sx0Var.presentFragment(r60Var);
        } else if (i10 >= sx0Var.f43621r && i10 < sx0Var.f43622s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", sx0Var.getMessagesController().blockePeers.keyAt(i10 - sx0Var.f43621r));
                sx0Var.presentFragment(new ProfileActivity(bundle3, null));
                return;
            }
            new Bundle();
            throw null;
        }
    }

    @Override
    public final void c(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        nt ntVar;
        boolean[] zArr;
        f00 f00Var;
        org.telegram.ui.Components.wc b02;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        int i13 = 3;
        jt jtVar = null;
        boolean z10 = false;
        int i14 = 1;
        switch (this.f39809a) {
            case 0:
                k kVar = (k) this.f39810b;
                ArrayList arrayList = kVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i15 = ((i) arrayList.get(i10)).d;
                    if (i15 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.a9) view).setChecked(z11);
                        kVar.f40769c = true;
                        return;
                    } else if (i15 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.a9) view).setChecked(z12);
                        kVar.f40769c = true;
                        return;
                    } else if (i15 == 7) {
                        if (!kVar.getUserConfig().isPremium() && !kVar.getMessagesController().autoarchiveAvailable && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.z90 z90Var = icVar.f29276b;
                            z90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.y6.Gi, 0, new zt0(kVar, 3)));
                            z90Var.setSingleLine(false);
                            z90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            icVar.f29275a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.qc.g(kVar, icVar, 3500).j();
                            int i16 = -kVar.e;
                            kVar.e = i16;
                            AndroidUtilities.shakeViewSpring(view, i16);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                        boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                        ((org.telegram.ui.Cells.a9) view).setChecked(z13);
                        kVar.f40769c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                o oVar = (o) this.f39810b;
                if (i10 >= oVar.f42051x && i10 < oVar.f42052y && oVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.h.get(i10 - oVar.f42051x);
                    if (stickerSetCovered.set.f22054id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f22047id = stickerSetCovered.set.f22054id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.cz0 cz0Var = new org.telegram.ui.Components.cz0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    cz0Var.f27292c0 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(cz0Var);
                    return;
                }
                return;
            case 2:
                p4 p4Var = (p4) this.f39810b;
                wi.a aVar = wi.e.f51277b;
                if (i10 == 1) {
                    synchronized (aVar) {
                        if (!aVar.f51268b) {
                            SharedPreferences sharedPreferences = wi.d.f51275a;
                            aVar.f51269c = sharedPreferences.contains("audio_recorder_v2_enabled");
                            aVar.d = sharedPreferences.getBoolean("audio_recorder_v2_enabled", true);
                            aVar.f51268b = true;
                        }
                        boolean z14 = !aVar.d;
                        aVar.d = z14;
                        aVar.f51269c = true;
                        aVar.f51268b = true;
                        wi.d.f51275a.edit().putBoolean("audio_recorder_v2_enabled", z14).apply();
                    }
                    p4Var.f42350b.l();
                    return;
                }
                aVar.a();
                if (aVar.d && i10 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p4Var.getParentActivity());
                    alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.AudioRecorderNoiseSuppression);
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.AudioRecorderNoiseSuppressionOff), LocaleController.getString(R.string.AudioRecorderNoiseSuppressionRNNoise)}, new n4(p4Var, 0));
                    p4Var.showDialog(alertDialog$Builder.f22368a);
                    return;
                }
                return;
            case 3:
                zc zcVar = (zc) this.f39810b;
                ArrayList arrayList2 = zcVar.f46254c;
                za1 za1Var = zcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) arrayList2.get(i10);
                    zcVar.a(xpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + za1Var.getPaddingLeft()) {
                        za1Var.w0(-((AndroidUtilities.dp(48.0f) + za1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (za1Var.getMeasuredWidth() - za1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        za1Var.w0(org.telegram.messenger.t.B(48.0f, za1Var.getMeasuredWidth() - za1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = zcVar.f46257r;
                    if (callback != null) {
                        callback.run(xpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                np npVar = (np) this.f39810b;
                boolean z15 = npVar.f41967s;
                if (npVar.getParentActivity() != null) {
                    s4.h0 adapter = npVar.f41962b.getAdapter();
                    mp mpVar = npVar.e;
                    if (adapter == mpVar) {
                        chat = (TLRPC.Chat) mpVar.d.get(i10);
                    } else {
                        int i17 = npVar.G;
                        if (i10 >= i17 && i10 < npVar.H) {
                            chat = (TLRPC.Chat) npVar.v.get(i10 - i17);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z15 && npVar.h.linked_chat_id == 0) {
                            npVar.b0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f22027id);
                        npVar.presentFragment(new un(bundle));
                        return;
                    } else if (i10 == npVar.F) {
                        if (z15 && npVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{npVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = npVar.f41964f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            x60 x60Var = new x60(bundle2);
                            x60Var.Y = new ep(npVar);
                            npVar.presentFragment(x60Var);
                            return;
                        } else if (!npVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) npVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(npVar.getParentActivity());
                            if (z15) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder2.f22368a.R = string;
                            alertDialog$Builder2.f22368a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.DiscussionUnlink), new y0(npVar, 24));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder2.f22368a;
                            npVar.showDialog(e2Var);
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, null);
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
                vp vpVar = (vp) this.f39810b;
                ArrayList arrayList3 = vpVar.f44874n;
                if (i10 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - 3);
                    boolean contains = vpVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        vpVar.d.add(tL_availableReaction.reaction);
                    } else {
                        vpVar.d.remove(tL_availableReaction.reaction);
                        if (vpVar.d.isEmpty()) {
                            up upVar = vpVar.h;
                            if (upVar != null) {
                                upVar.t(2, arrayList3.size() + 1);
                            }
                            vpVar.W(2, true);
                        }
                    }
                    Switch r22 = xVar.f25678c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.zp zpVar = xVar.d;
                    if (zpVar != null) {
                        zpVar.a(z16, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                bt btVar = (bt) this.f39810b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((et) view).d;
                ft ftVar = btVar.f38158a;
                bh.i0 reactionsWindow = ftVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f4060q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.hz0.c(null, ftVar.f39451c0, ftVar.f39472z.getContext(), new e5(btVar, 9));
                    return;
                }
                dt dtVar = ftVar.f39459l;
                if (dtVar != null) {
                    dtVar.v(stickerSetCovered2.set, TextUtils.join("", ftVar.f39462o));
                }
                ftVar.n();
                return;
            case 7:
                ot otVar = (ot) this.f39810b;
                if (otVar.f42284f && otVar.e) {
                    mt mtVar = otVar.d;
                    ArrayList arrayList4 = mtVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        jtVar = (jt) mtVar.e.get(i10);
                    }
                } else {
                    int S = otVar.f42283c.S(i10);
                    int Q = otVar.f42283c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        jtVar = otVar.f42283c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    otVar.finishFragment();
                    if (jtVar != null && (ntVar = otVar.f42286r) != null) {
                        ntVar.Y0(jtVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                hu huVar = (hu) this.f39810b;
                ArrayList arrayList5 = huVar.f40075k3;
                lu luVar = huVar.f40087w3;
                if ((view instanceof au) && i10 >= 0 && i10 < arrayList5.size()) {
                    cu cuVar = (cu) arrayList5.get(i10);
                    if (cuVar != null) {
                        int i18 = cuVar.h;
                        if (i18 >= 0) {
                            huVar.f40081q3[i18] = !zArr[i18];
                            huVar.G1(true);
                            return;
                        } else if (i18 == -2) {
                            luVar.presentFragment(new DataAutoDownloadActivity(huVar.f40071g3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v8) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(luVar.getParentActivity());
                    alertDialog$Builder3.f22368a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder3.f22368a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Reset), new du(huVar));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder3.f22368a;
                    luVar.showDialog(e2Var2);
                    TextView textView2 = (TextView) e2Var2.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23598q7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                lz.W((lz) this.f39810b, view, i10);
                return;
            case 10:
                o00 o00Var = (o00) this.f39810b;
                if (o00Var.getParentActivity() != null && (f00Var = (f00) o00Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = f00Var.f39228c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i19 = f00Var.f47040a;
                    if (i19 == 1) {
                        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                        o00Var.x0(f00Var, abVar.getName(), abVar.getCurrentObject(), f00Var.f39230g);
                        return;
                    } else if (i19 == 7) {
                        sz szVar = new sz(0, o00Var, f00Var);
                        if (o00Var.f42056c.f23138w.f19327f) {
                            o00Var.u0(szVar, false);
                            return;
                        } else {
                            szVar.run();
                            return;
                        }
                    } else if (i19 == 8 || (i19 == 4 && f00Var.f39233k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = o00Var.f42059r;
                        if (o00Var.f42060s && o00Var.f42056c.f23138w.f19327f) {
                            float f7 = -o00Var.Q;
                            o00Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            o00Var.v = true;
                            bj bjVar = o00Var.R;
                            if (bjVar == null || bjVar.getVisibility() != 0) {
                                bj bjVar2 = new bj(6, 2, o00Var.getParentActivity(), null, true);
                                o00Var.R = bjVar2;
                                bjVar2.f32826a.setMaxWidth(AndroidUtilities.displaySize.x);
                                o00Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                o00Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                o00Var.getParentLayout().getOverlayContainerView().addView(o00Var.R, marginLayoutParams);
                                o00Var.R.f(o00Var.f42056c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(o00Var.f42061w) || !TextUtils.isEmpty(dialogFilter.name)) && (o00Var.f42063y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && o00Var.G.isEmpty() && !o00Var.F.isEmpty()) {
                            o00Var.u0(new pz(o00Var, 1), false);
                            return;
                        } else {
                            float f10 = -o00Var.Q;
                            o00Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(o00Var.f42061w) && TextUtils.isEmpty(dialogFilter.name)) {
                                b02 = org.telegram.ui.Components.wc.b0(o00Var);
                                i11 = R.string.FilterInviteErrorEmptyName;
                            } else if ((o00Var.f42063y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!o00Var.G.isEmpty()) {
                                    b02 = org.telegram.ui.Components.wc.b0(o00Var);
                                    i11 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    b02 = org.telegram.ui.Components.wc.b0(o00Var);
                                    i11 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (o00Var.F.isEmpty()) {
                                b02 = org.telegram.ui.Components.wc.b0(o00Var);
                                i11 = R.string.FilterInviteErrorEmpty;
                            } else {
                                b02 = org.telegram.ui.Components.wc.b0(o00Var);
                                i11 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.vh.n(i11, b02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                b00 b00Var = (b00) this.f39810b;
                ArrayList arrayList6 = b00Var.f37935e0;
                int i20 = i10 - 1;
                if (i20 >= 0 && i20 < arrayList6.size()) {
                    f00 f00Var2 = (f00) arrayList6.get(i20);
                    int i21 = f00Var2.f47040a;
                    if (i21 == 7) {
                        b00Var.dismiss();
                        b00Var.f26811n.presentFragment(new lz(b00Var.Y, f00Var2.f39235m));
                        return;
                    } else if (i21 == 8) {
                        b00Var.Q();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                h10 h10Var = (h10) this.f39810b;
                if (view instanceof org.telegram.ui.Cells.o7) {
                    h10Var.f(i10, view, ((org.telegram.ui.Cells.o7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r7) {
                    h10Var.f(i10, view, ((org.telegram.ui.Cells.r7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    h10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    h10Var.f(i10, view, ((org.telegram.ui.Cells.d2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.p2) {
                    h10Var.f(i10, view, ((org.telegram.ui.Cells.p2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                z60 z60Var = (z60) this.f39810b;
                if (z60Var.getParentActivity() != null) {
                    if (i10 != z60Var.f46187n && i10 != 0) {
                        if (i10 == z60Var.f46189s) {
                            if (z60Var.f46186f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", z60Var.f46186f.link);
                                    z60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == z60Var.f46188r) {
                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(z60Var.getParentActivity());
                            alertDialog$Builder4.f22368a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder4.f22368a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new qt(z60Var, 13));
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            z60Var.showDialog(alertDialog$Builder4.f22368a);
                            return;
                        } else {
                            return;
                        }
                    } else if (z60Var.f46186f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", z60Var.f46186f.link));
                            org.telegram.ui.Components.wc.j(z60Var).j();
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                f70.V((f70) this.f39810b, view, i10);
                return;
            case 15:
                w70.V((w70) this.f39810b, view, i10);
                return;
            case 16:
                LanguageSelectActivity.V((LanguageSelectActivity) this.f39810b, view, i10);
                return;
            case 17:
                pc0 pc0Var = (pc0) this.f39810b;
                pc0Var.f42440i0 = -1L;
                int i22 = pc0Var.F0;
                if (i22 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) pc0Var.T.J(i10)) != null) {
                        if (pc0Var.f42435e0 == 0) {
                            pc0Var.E0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                            pc0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(pc0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = pc0Var.getMessagesController().getInputChannel(-pc0Var.f42435e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        e2VarArr[0].setOnCancelListener(new bi.f0(pc0Var, pc0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ea(pc0Var, e2VarArr, tL_messageMediaVenue, 19)), 8));
                        pc0Var.showDialog(e2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i22 == 5) {
                    IMapsProvider.IMap iMap = pc0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = pc0Var.f42461y0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), pc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = pc0Var.A0) != null && (!messageObject.isLiveLocation() || i22 == 6)) {
                    IMapsProvider.IMap iMap2 = pc0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = pc0Var.A0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), pc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i22 != 2) {
                    if (pc0Var.E0 != null && pc0Var.f42457w0 != null) {
                        FrameLayout frameLayout = pc0Var.f42446o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(pc0Var.f42457w0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(pc0Var.f42457w0.getLongitude());
                        pc0Var.E0.d(tL_messageMediaGeo, pc0Var.F0, true, 0, 0L);
                        pc0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i22 == 2 && pc0Var.getLocationController().isSharingLocation(pc0Var.f42435e0) && pc0Var.T.j(i10) == 7) {
                    pc0Var.getLocationController().removeSharingLocation(pc0Var.f42435e0);
                    pc0Var.T.l();
                    pc0Var.finishFragment();
                    return;
                } else if (i22 == 2 && pc0Var.getLocationController().isSharingLocation(pc0Var.f42435e0) && pc0Var.T.j(i10) == 6) {
                    if (pc0Var.getLocationController().getSharingLocationInfo(pc0Var.f42435e0).period != Integer.MAX_VALUE) {
                        z10 = true;
                    }
                    pc0Var.t0(z10);
                    return;
                } else if ((i10 == 2 && i22 == 1) || ((i10 == 1 && i22 == 2) || (i10 == 3 && i22 == 3))) {
                    if (pc0Var.getLocationController().isSharingLocation(pc0Var.f42435e0)) {
                        pc0Var.getLocationController().removeSharingLocation(pc0Var.f42435e0);
                        pc0Var.T.l();
                        pc0Var.finishFragment();
                        return;
                    }
                    pc0Var.t0(false);
                    return;
                } else {
                    Object J = pc0Var.T.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        pc0Var.E0.d((TLRPC.TL_messageMediaVenue) J, pc0Var.F0, true, 0, 0L);
                        pc0Var.finishFragment();
                        return;
                    } else if (J instanceof jc0) {
                        jc0 jc0Var = (jc0) J;
                        pc0Var.f42440i0 = jc0Var.f40553a;
                        if (pc0Var.f42441j0) {
                            pc0Var.f42441j0 = false;
                            pc0Var.D0();
                        }
                        pc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(jc0Var.e.getPosition(), pc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 18:
                ((ni0) this.f39810b).onBackPressed();
                return;
            case 19:
                vi0 vi0Var = (vi0) this.f39810b;
                int i23 = vi0Var.I;
                if (i10 >= i23 && i10 < vi0Var.J) {
                    MessageObject messageObject2 = (MessageObject) vi0Var.f44833x.get(i10 - i23);
                    if (messageObject2.isStory()) {
                        if (!vi0Var.c0(messageObject2)) {
                            vi0Var.getOrCreateStoryViewer().F(vi0Var.getParentActivity(), messageObject2.storyItem, di.q7.a(vi0Var.f44828f));
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
                    if (vi0Var.getMessagesController().checkCanOpenChat(bundle3, vi0Var)) {
                        vi0Var.presentFragment(new un(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                PasscodeActivity.W((PasscodeActivity) this.f39810b, view, i10);
                return;
            case 21:
                qp0 qp0Var = (qp0) this.f39810b;
                qp0Var.a(i10, true);
                dp0 dp0Var = qp0Var.h;
                if (dp0Var != null) {
                    dp0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 22:
                rq0 rq0Var = (rq0) this.f39810b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = rq0Var.f43250f;
                ArrayList arrayList8 = rq0Var.f43258n;
                MediaController.AlbumEntry albumEntry = rq0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        uq0 uq0Var = rq0Var.f43267t0;
                        if (uq0Var != null) {
                            switch (uq0Var.f44517a) {
                                case 0:
                                    vq0.i0(uq0Var.f44518b, str);
                                    return;
                                default:
                                    vq0.i0(uq0Var.f44518b, str);
                                    return;
                            }
                        }
                        rq0Var.P.getSearchField().setText(str);
                        rq0Var.P.getSearchField().setSelection(str.length());
                        rq0Var.c0(rq0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(rq0Var.getParentActivity());
                        alertDialog$Builder5.f22368a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder5.f22368a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder5.k(LocaleController.getString(R.string.ClearButton), new eq0(rq0Var, 4));
                        alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder5.f22368a;
                        rq0Var.showDialog(e2Var3);
                        TextView textView3 = (TextView) e2Var3.d(-1);
                        if (textView3 != null) {
                            org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.f23598q7, null);
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
                    org.telegram.ui.ActionBar.w0 w0Var = rq0Var.P;
                    if (w0Var != null) {
                        AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                    }
                    if (rq0Var.Y) {
                        rq0Var.b0(view, arrayList7.get(i10));
                        return;
                    }
                    int i24 = rq0Var.T;
                    if (i24 != 1 && i24 != 3) {
                        if (i24 != 2) {
                            i13 = 10;
                            if (i24 != 10) {
                                i14 = rq0Var.U == null ? 4 : 0;
                            }
                        }
                        i14 = i13;
                    }
                    PhotoViewer.u1().M2(null, rq0Var, null);
                    PhotoViewer u12 = PhotoViewer.u1();
                    int i25 = rq0Var.H;
                    boolean z17 = rq0Var.I;
                    u12.h = i25;
                    u12.f35723n = z17;
                    PhotoViewer.u1().i2(arrayList7, i10, i14, rq0Var.f43257l0, rq0Var.f43273x0, rq0Var.U);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.f39810b;
                ArrayList arrayList9 = photoViewer.g7;
                if (!arrayList9.isEmpty() && (i12 = photoViewer.P4) >= 0 && i12 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.o1();
                    }
                }
                photoViewer.f35704k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.D2(indexOf);
                }
                photoViewer.f35704k5 = false;
                return;
            case 24:
                a(i10, view);
                return;
            case 25:
                PremiumPreviewFragment.V((PremiumPreviewFragment) this.f39810b, view, i10);
                return;
            case 26:
                b(i10, view);
                return;
            case 27:
                PrivacyControlActivity.Y((PrivacyControlActivity) this.f39810b, view, i10);
                return;
            case 28:
                d(i10, view);
                return;
            default:
                ProfileActivity.X((ProfileActivity) this.f39810b, i10);
                return;
        }
    }
}
