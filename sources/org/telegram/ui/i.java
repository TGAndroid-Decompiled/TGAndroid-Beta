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
public final class i implements org.telegram.ui.Components.km0 {
    public final int f38572a;
    public final Object f38573b;

    public i(Object obj, int i10) {
        this.f38572a = i10;
        this.f38573b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        cw0 cw0Var = (cw0) this.f38573b;
        boolean[] zArr = cw0Var.f36567w;
        if (i10 == cw0Var.f36557o0) {
            cw0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = cw0Var.L;
            org.telegram.ui.Components.uz0 uz0Var = cw0Var.Q;
            if (uz0Var != null) {
                uz0Var.f();
            }
            if (cw0Var.I) {
                int i11 = -cw0Var.O;
                cw0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == cw0Var.f36561r0) {
                z10 = !cw0Var.G;
                cw0Var.G = z10;
            } else {
                int i12 = cw0Var.f36565u0;
                if (i10 == i12) {
                    z10 = !cw0Var.H;
                    cw0Var.H = z10;
                } else if (i10 == cw0Var.f36566v0) {
                    boolean z12 = !cw0Var.J;
                    cw0Var.J = z12;
                    cw0Var.r0();
                    int i13 = cw0Var.f36565u0;
                    if (i13 >= 0 && i12 < 0) {
                        cw0Var.f36540b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        cw0Var.f36540b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == cw0Var.f36563s0) {
                    boolean z13 = cw0Var.K;
                    boolean z14 = !z13;
                    cw0Var.K = z14;
                    if (!z13 && cw0Var.L) {
                        int i14 = cw0Var.f36552j0;
                        cw0Var.L = false;
                        cw0Var.r0();
                        s4.d1 K = cw0Var.f36542c.K(cw0Var.f36564t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.w8) K.f47889a).setChecked(false);
                        } else {
                            cw0Var.f36540b.m(cw0Var.f36564t0);
                        }
                        cw0Var.f36540b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (cw0Var.N == 0) {
                    z10 = !cw0Var.L;
                    cw0Var.L = z10;
                    int i15 = cw0Var.f36552j0;
                    cw0Var.r0();
                    if (cw0Var.L) {
                        cw0Var.f36540b.s(cw0Var.f36552j0, 2);
                    } else {
                        cw0Var.f36540b.t(i15, 2);
                    }
                    if (cw0Var.L && cw0Var.K) {
                        cw0Var.K = false;
                        s4.d1 K2 = cw0Var.f36542c.K(cw0Var.f36563s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.w8) K2.f47889a).setChecked(false);
                        } else {
                            cw0Var.f36540b.m(cw0Var.f36563s0);
                        }
                    }
                    if (cw0Var.L) {
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
            if (cw0Var.M && !cw0Var.L) {
                cw0Var.h.b(true);
            }
            cw0Var.f36542c.getChildCount();
            for (int i17 = cw0Var.f36556n0; i17 < cw0Var.f36556n0 + cw0Var.f36571y; i17++) {
                s4.d1 K3 = cw0Var.f36542c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f47889a;
                    if (view2 instanceof org.telegram.ui.Cells.d6) {
                        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view2;
                        d6Var.m(cw0Var.L, true);
                        d6Var.f21739r.a(zArr[i17 - cw0Var.f36556n0], z11);
                        if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == cw0Var.f36564t0 && !cw0Var.M) {
                            cw0Var.h.f(d6Var.getCheckBox(), true);
                            cw0Var.M = true;
                        }
                    }
                }
            }
            w8Var.setChecked(z10);
            cw0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        nx0 nx0Var;
        lx0 lx0Var = (lx0) this.f38573b;
        PremiumPreviewFragment premiumPreviewFragment = lx0Var.f39866n;
        ArrayList arrayList = premiumPreviewFragment.d;
        ix0 ix0Var = lx0Var.f39864e;
        if (view.isEnabled() && (view instanceof rg.q1)) {
            rg.q1 q1Var = (rg.q1) view;
            premiumPreviewFragment.f33969e = arrayList.indexOf(q1Var.getTier());
            boolean z10 = true;
            premiumPreviewFragment.t0(true);
            q1Var.c(true, true);
            for (int i11 = 0; i11 < ix0Var.getChildCount(); i11++) {
                View childAt = ix0Var.getChildAt(i11);
                if (childAt instanceof rg.q1) {
                    rg.q1 q1Var2 = (rg.q1) childAt;
                    if (q1Var2.getTier() != q1Var.getTier()) {
                        q1Var2.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < ix0Var.getHiddenChildCount(); i12++) {
                View V = ix0Var.V(i12);
                if (V instanceof rg.q1) {
                    rg.q1 q1Var3 = (rg.q1) V;
                    if (q1Var3.getTier() != q1Var.getTier()) {
                        q1Var3.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < ix0Var.getCachedChildCount(); i13++) {
                View P = ix0Var.P(i13);
                if (P instanceof rg.q1) {
                    rg.q1 q1Var4 = (rg.q1) P;
                    if (q1Var4.getTier() != q1Var.getTier()) {
                        q1Var4.c(false, true);
                    }
                }
            }
            for (int i14 = 0; i14 < ix0Var.getAttachedScrapChildCount(); i14++) {
                View O = ix0Var.O(i14);
                if (O instanceof rg.q1) {
                    rg.q1 q1Var5 = (rg.q1) O;
                    if (q1Var5.getTier() != q1Var.getTier()) {
                        q1Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.J;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((nx0Var = premiumPreviewFragment.f33971f) == null || nx0Var.f40495a.months >= ((nx0) arrayList.get(premiumPreviewFragment.f33969e)).f40495a.months || premiumPreviewFragment.f33982p0)) {
                z10 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10);
        }
    }

    private final void c(int i10, View view) {
        iy0 iy0Var = (iy0) this.f38573b;
        int i11 = iy0Var.f39043y;
        if (i10 == iy0Var.f39041w) {
            org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.N(iy0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new gy0(iy0Var), null).f20141a;
            a2Var.show();
            a2Var.h();
        } else if (i10 == iy0Var.f39037f) {
            if (i11 == 1) {
                ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
                m2Var.d = new Paint();
                m2Var.f41101f = new ov[2];
                m2Var.f41105w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                vy vyVar = new vy(bundle);
                m2Var.f41097a = vyVar;
                vyVar.C2 = new mv(m2Var);
                vyVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                m2Var.f41098b = contactsActivity;
                contactsActivity.W = new mv(m2Var);
                contactsActivity.onFragmentCreate();
                iy0Var.presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
                return;
            }
            Bundle i12 = a1.g.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            e70 e70Var = new e70(i12);
            e70Var.f37019w = new fy0(iy0Var);
            iy0Var.presentFragment(e70Var);
        } else if (i10 >= iy0Var.f39039r && i10 < iy0Var.f39040s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", iy0Var.getMessagesController().blockePeers.keyAt(i10 - iy0Var.f39039r));
                iy0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        bu buVar;
        boolean[] zArr;
        y00 y00Var;
        org.telegram.ui.Components.zc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        int i15;
        int i16 = 3;
        xt xtVar = null;
        boolean z10 = false;
        switch (this.f38572a) {
            case 0:
                l lVar = (l) this.f38573b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        lVar.f39606c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z12);
                        lVar.f39606c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.ia0 ia0Var = kcVar.f27818b;
                            ia0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.h6.Gi, 0, new pu0(lVar, 3)));
                            ia0Var.setSingleLine(false);
                            ia0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            kcVar.f27817a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.sc.g(lVar, kcVar, 3500).j();
                            int i18 = -lVar.f39607e;
                            lVar.f39607e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                        boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z13);
                        lVar.f39606c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                q qVar = (q) this.f38573b;
                if (i10 >= qVar.f41130x && i10 < qVar.f41131y && qVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) qVar.h.get(i10 - qVar.f41130x);
                    if (stickerSetCovered.set.f19829id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f19822id = stickerSetCovered.set.f19829id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0(qVar.getParentActivity(), qVar, inputStickerSet, null, null, null);
                    dz0Var.f25481c0 = new n(qVar, view, stickerSetCovered);
                    qVar.showDialog(dz0Var);
                    return;
                }
                return;
            case 2:
                o4 o4Var = (o4) this.f38573b;
                ri.a aVar = ri.e.f47789b;
                if (i10 == 1) {
                    synchronized (aVar) {
                        if (!aVar.f47780b) {
                            SharedPreferences sharedPreferences = ri.d.f47787a;
                            aVar.f47781c = sharedPreferences.contains("audio_recorder_v2_enabled");
                            aVar.d = sharedPreferences.getBoolean("audio_recorder_v2_enabled", true);
                            aVar.f47780b = true;
                        }
                        boolean z14 = !aVar.d;
                        aVar.d = z14;
                        aVar.f47781c = true;
                        aVar.f47780b = true;
                        ri.d.f47787a.edit().putBoolean("audio_recorder_v2_enabled", z14).apply();
                    }
                    o4Var.f40555b.l();
                    return;
                }
                aVar.a();
                if (aVar.d && i10 == 2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o4Var.getParentActivity());
                    alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.AudioRecorderNoiseSuppression);
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.AudioRecorderNoiseSuppressionOff), LocaleController.getString(R.string.AudioRecorderNoiseSuppressionRNNoise)}, new m4(o4Var, 0));
                    o4Var.showDialog(alertDialog$Builder.f20141a);
                    return;
                }
                return;
            case 3:
                dd ddVar = (dd) this.f38573b;
                ArrayList arrayList2 = ddVar.f36765c;
                hc1 hc1Var = ddVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.dq dqVar = (org.telegram.ui.Components.dq) arrayList2.get(i10);
                    ddVar.a(dqVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + hc1Var.getPaddingLeft()) {
                        hc1Var.v0(-((AndroidUtilities.dp(48.0f) + hc1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (hc1Var.getMeasuredWidth() - hc1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        hc1Var.v0(org.telegram.messenger.v0.z(48.0f, hc1Var.getMeasuredWidth() - hc1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = ddVar.f36769r;
                    if (callback != null) {
                        callback.run(dqVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                xp xpVar = (xp) this.f38573b;
                boolean z15 = xpVar.f44134s;
                if (xpVar.getParentActivity() != null) {
                    s4.i0 adapter = xpVar.f44128b.getAdapter();
                    wp wpVar = xpVar.f44130e;
                    if (adapter == wpVar) {
                        chat = (TLRPC.Chat) wpVar.d.get(i10);
                    } else {
                        int i19 = xpVar.G;
                        if (i10 >= i19 && i10 < xpVar.H) {
                            chat = (TLRPC.Chat) xpVar.v.get(i10 - i19);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z15 && xpVar.h.linked_chat_id == 0) {
                            xpVar.a0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f19802id);
                        xpVar.presentFragment(new eo(bundle));
                        return;
                    } else if (i10 == xpVar.F) {
                        if (z15 && xpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{xpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = xpVar.f44131f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            l70 l70Var = new l70(bundle2);
                            l70Var.Y = new pp(xpVar);
                            xpVar.presentFragment(l70Var);
                            return;
                        } else if (!xpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) xpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xpVar.getParentActivity());
                            if (z15) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder2.f20141a.R = string;
                            alertDialog$Builder2.f20141a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder2.k(LocaleController.getString(R.string.DiscussionUnlink), new z0(xpVar, 22));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.f20141a;
                            xpVar.showDialog(a2Var);
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20799q7, false));
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
                eq eqVar = (eq) this.f38573b;
                ArrayList arrayList3 = eqVar.f37524r;
                boolean z16 = eqVar.G;
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
                    boolean contains = eqVar.d.contains(tL_availableReaction.reaction);
                    boolean z17 = !contains;
                    if (!contains) {
                        eqVar.d.add(tL_availableReaction.reaction);
                    } else {
                        eqVar.d.remove(tL_availableReaction.reaction);
                        if (eqVar.d.isEmpty()) {
                            dq dqVar2 = eqVar.h;
                            if (dqVar2 != null) {
                                if (eqVar.G) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                dqVar2.t(i12, arrayList3.size() + 1);
                            }
                            eqVar.V(2, true);
                        }
                    }
                    Switch r22 = yVar.f23514c;
                    if (r22 != null) {
                        r22.c(z17, true);
                    }
                    org.telegram.ui.Components.fq fqVar = yVar.d;
                    if (fqVar != null) {
                        fqVar.a(z17, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                qt qtVar = (qt) this.f38573b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((tt) view).d;
                ut utVar = qtVar.f41429a;
                zg.a0 reactionsWindow = utVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f54687q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.iz0.c(null, utVar.f42569c0, utVar.f42591z.getContext(), new e5(qtVar, 9));
                    return;
                }
                st stVar = utVar.f42578l;
                if (stVar != null) {
                    stVar.w(stickerSetCovered2.set, TextUtils.join("", utVar.f42581o));
                }
                utVar.p();
                return;
            case 7:
                cu cuVar = (cu) this.f38573b;
                if (cuVar.f36513f && cuVar.f36512e) {
                    au auVar = cuVar.d;
                    ArrayList arrayList4 = auVar.f35978e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        xtVar = (xt) auVar.f35978e.get(i10);
                    }
                } else {
                    int S = cuVar.f36511c.S(i10);
                    int Q = cuVar.f36511c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        xtVar = cuVar.f36511c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    cuVar.finishFragment();
                    if (xtVar != null && (buVar = cuVar.f36515r) != null) {
                        buVar.V0(xtVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                xu xuVar = (xu) this.f38573b;
                ArrayList arrayList5 = xuVar.f44162a3;
                bv bvVar = xuVar.f44173m3;
                if ((view instanceof qu) && i10 >= 0 && i10 < arrayList5.size()) {
                    su suVar = (su) arrayList5.get(i10);
                    if (suVar != null) {
                        int i20 = suVar.h;
                        if (i20 >= 0) {
                            xuVar.f44168g3[i20] = !zArr[i20];
                            xuVar.B1(true);
                            return;
                        } else if (i20 == -2) {
                            bvVar.presentFragment(new DataAutoDownloadActivity(xuVar.W2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(bvVar.getParentActivity());
                    alertDialog$Builder3.f20141a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder3.f20141a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Reset), new tu(xuVar));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder3.f20141a;
                    bvVar.showDialog(a2Var2);
                    TextView textView2 = (TextView) a2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20799q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                e00.V((e00) this.f38573b, view, i10);
                return;
            case 10:
                h10 h10Var = (h10) this.f38573b;
                if (h10Var.getParentActivity() != null && (y00Var = (y00) h10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = y00Var.f44220c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = y00Var.f16876a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
                        h10Var.v0(y00Var, xaVar.getName(), xaVar.getCurrentObject(), y00Var.f44223g);
                        return;
                    } else if (i21 == 7) {
                        org.telegram.ui.Components.voip.y yVar2 = new org.telegram.ui.Components.voip.y(16, h10Var, y00Var);
                        if (h10Var.f38214c.isEnabled()) {
                            h10Var.s0(yVar2, false);
                            return;
                        } else {
                            yVar2.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && y00Var.f44226k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = h10Var.f38218r;
                        if (h10Var.f38219s && h10Var.f38214c.getAlpha() > 0.0f) {
                            float f7 = -h10Var.Q;
                            h10Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            h10Var.v = true;
                            nj njVar = h10Var.R;
                            if (njVar == null || njVar.getVisibility() != 0) {
                                nj njVar2 = new nj(6, 2, h10Var.getParentActivity(), null, true);
                                h10Var.R = njVar2;
                                njVar2.f24819a.setMaxWidth(AndroidUtilities.displaySize.x);
                                h10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                h10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                h10Var.getParentLayout().getOverlayContainerView().addView(h10Var.R, marginLayoutParams);
                                h10Var.R.f(h10Var.f38214c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(h10Var.f38220w) || !TextUtils.isEmpty(dialogFilter.name)) && (h10Var.f38222y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && h10Var.G.isEmpty() && !h10Var.F.isEmpty()) {
                            h10Var.s0(new i00(h10Var, 1), false);
                            return;
                        } else {
                            float f10 = -h10Var.Q;
                            h10Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(h10Var.f38220w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.zc.a0(h10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((h10Var.f38222y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!h10Var.G.isEmpty()) {
                                    a02 = org.telegram.ui.Components.zc.a0(h10Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.zc.a0(h10Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (h10Var.F.isEmpty()) {
                                a02 = org.telegram.ui.Components.zc.a0(h10Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.zc.a0(h10Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.am.q(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                t00 t00Var = (t00) this.f38573b;
                ArrayList arrayList6 = t00Var.f42034d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    y00 y00Var2 = (y00) arrayList6.get(i22);
                    int i23 = y00Var2.f16876a;
                    if (i23 == 7) {
                        t00Var.dismiss();
                        t00Var.f25297n.presentFragment(new e00(t00Var.X, y00Var2.f44228m));
                        return;
                    } else if (i23 == 8) {
                        t00Var.R();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                y10 y10Var = (y10) this.f38573b;
                if (view instanceof org.telegram.ui.Cells.j7) {
                    y10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    y10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.i7) {
                    y10Var.f(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    y10Var.f(i10, view, ((org.telegram.ui.Cells.f2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s2) {
                    y10Var.f(i10, view, ((org.telegram.ui.Cells.s2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                n70 n70Var = (n70) this.f38573b;
                if (n70Var.getParentActivity() != null) {
                    if (i10 != n70Var.f40247n && i10 != 0) {
                        if (i10 == n70Var.f40249s) {
                            if (n70Var.f40246f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", n70Var.f40246f.link);
                                    n70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == n70Var.f40248r) {
                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(n70Var.getParentActivity());
                            alertDialog$Builder4.f20141a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder4.f20141a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new ju(n70Var, 12));
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            n70Var.showDialog(alertDialog$Builder4.f20141a);
                            return;
                        } else {
                            return;
                        }
                    } else if (n70Var.f40246f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", n70Var.f40246f.link));
                            org.telegram.ui.Components.zc.j(n70Var).j();
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
                v70.U((v70) this.f38573b, view, i10);
                return;
            case 15:
                n80.U((n80) this.f38573b, view, i10);
                return;
            case 16:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f38573b, view, i10);
                return;
            case 17:
                id0 id0Var = (id0) this.f38573b;
                id0Var.f38855i0 = -1L;
                int i24 = id0Var.G0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) id0Var.T.J(i10)) != null) {
                        if (id0Var.f38850e0 == 0) {
                            id0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            id0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(id0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = id0Var.getMessagesController().getInputChannel(-id0Var.f38850e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        a2VarArr[0].setOnCancelListener(new fa(id0Var, id0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ea(id0Var, a2VarArr, tL_messageMediaVenue, 19)), 7));
                        id0Var.showDialog(a2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = id0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = id0Var.f38877z0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), id0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = id0Var.B0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = id0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = id0Var.B0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), id0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i24 != 2) {
                    if (id0Var.F0 != null && id0Var.f38874x0 != null) {
                        FrameLayout frameLayout = id0Var.f38861o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(id0Var.f38874x0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(id0Var.f38874x0.getLongitude());
                        id0Var.F0.b(tL_messageMediaGeo, id0Var.G0, true, 0, 0L);
                        id0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && id0Var.getLocationController().isSharingLocation(id0Var.f38850e0) && id0Var.T.j(i10) == 7) {
                    id0Var.getLocationController().removeSharingLocation(id0Var.f38850e0);
                    id0Var.T.l();
                    id0Var.finishFragment();
                    return;
                } else if (i24 == 2 && id0Var.getLocationController().isSharingLocation(id0Var.f38850e0) && id0Var.T.j(i10) == 6) {
                    if (id0Var.getLocationController().getSharingLocationInfo(id0Var.f38850e0).period != Integer.MAX_VALUE) {
                        z10 = true;
                    }
                    id0Var.r0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (id0Var.getLocationController().isSharingLocation(id0Var.f38850e0)) {
                        id0Var.getLocationController().removeSharingLocation(id0Var.f38850e0);
                        id0Var.T.l();
                        id0Var.finishFragment();
                        return;
                    }
                    id0Var.r0(false);
                    return;
                } else {
                    Object J = id0Var.T.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        id0Var.F0.b((TLRPC.TL_messageMediaVenue) J, id0Var.G0, true, 0, 0L);
                        id0Var.finishFragment();
                        return;
                    } else if (J instanceof cd0) {
                        cd0 cd0Var = (cd0) J;
                        id0Var.f38855i0 = cd0Var.f36398a;
                        if (id0Var.f38856j0) {
                            id0Var.f38856j0 = false;
                            id0Var.B0();
                        }
                        id0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cd0Var.f36401e.getPosition(), id0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 18:
                ((ej0) this.f38573b).onBackPressed();
                return;
            case 19:
                mj0 mj0Var = (mj0) this.f38573b;
                int i25 = mj0Var.I;
                if (i10 >= i25 && i10 < mj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) mj0Var.f40072x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!mj0Var.a0(messageObject2)) {
                            mj0Var.getOrCreateStoryViewer().F(mj0Var.getParentActivity(), messageObject2.storyItem, ai.v9.a(mj0Var.f40067f));
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
                    if (mj0Var.getMessagesController().checkCanOpenChat(bundle3, mj0Var)) {
                        mj0Var.presentFragment(new eo(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                PasscodeActivity.V((PasscodeActivity) this.f38573b, view, i10);
                return;
            case 21:
                bq0 bq0Var = (bq0) this.f38573b;
                bq0Var.a(i10, true);
                op0 op0Var = bq0Var.h;
                if (op0Var != null) {
                    op0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 22:
                dr0 dr0Var = (dr0) this.f38573b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = dr0Var.f36875f;
                ArrayList arrayList8 = dr0Var.f36883n;
                MediaController.AlbumEntry albumEntry = dr0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        hr0 hr0Var = dr0Var.f36892t0;
                        if (hr0Var != null) {
                            switch (hr0Var.f38500a) {
                                case 0:
                                    ir0.h0(hr0Var.f38501b, str);
                                    return;
                                default:
                                    ir0.h0(hr0Var.f38501b, str);
                                    return;
                            }
                        }
                        dr0Var.P.getSearchField().setText(str);
                        dr0Var.P.getSearchField().setSelection(str.length());
                        dr0Var.b0(dr0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(dr0Var.getParentActivity());
                        alertDialog$Builder5.f20141a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder5.f20141a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder5.k(LocaleController.getString(R.string.ClearButton), new qq0(dr0Var, 4));
                        alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder5.f20141a;
                        dr0Var.showDialog(a2Var3);
                        TextView textView3 = (TextView) a2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20799q7, false));
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
                    org.telegram.ui.ActionBar.u0 u0Var = dr0Var.P;
                    if (u0Var != null) {
                        AndroidUtilities.hideKeyboard(u0Var.getSearchField());
                    }
                    if (dr0Var.Y) {
                        dr0Var.a0(view, arrayList7.get(i10));
                        return;
                    }
                    int i26 = dr0Var.T;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 != 2) {
                            i16 = 10;
                            if (i26 != 10) {
                                if (dr0Var.U == null) {
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
                    PhotoViewer.t1().K2(null, dr0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = dr0Var.H;
                    boolean z18 = dr0Var.I;
                    t12.h = i27;
                    t12.f33817n = z18;
                    PhotoViewer.t1().g2(arrayList7, i10, i14, dr0Var.f36882l0, dr0Var.f36898x0, dr0Var.U);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.f38573b;
                ArrayList arrayList9 = photoViewer.f33765g7;
                if (!arrayList9.isEmpty() && (i15 = photoViewer.P4) >= 0 && i15 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f33798k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.f33798k5 = false;
                return;
            case 24:
                a(i10, view);
                return;
            case 25:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f38573b, view, i10);
                return;
            case 26:
                b(i10, view);
                return;
            case 27:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f38573b, view, i10);
                return;
            case 28:
                c(i10, view);
                return;
            default:
                ProfileActivity.f0((ProfileActivity) this.f38573b, i10);
                return;
        }
    }
}
