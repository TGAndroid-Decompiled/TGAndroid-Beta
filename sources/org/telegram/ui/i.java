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
public final class i implements org.telegram.ui.Components.ml0 {
    public final int f37200a;
    public final Object f37201b;

    public i(Object obj, int i10) {
        this.f37200a = i10;
        this.f37201b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        uv0 uv0Var = (uv0) this.f37201b;
        boolean[] zArr = uv0Var.f41360w;
        if (i10 == uv0Var.f41350o0) {
            uv0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = uv0Var.L;
            org.telegram.ui.Components.iz0 iz0Var = uv0Var.Q;
            if (iz0Var != null) {
                iz0Var.f();
            }
            if (uv0Var.I) {
                int i11 = -uv0Var.O;
                uv0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == uv0Var.f41354r0) {
                z10 = !uv0Var.G;
                uv0Var.G = z10;
            } else {
                int i12 = uv0Var.f41358u0;
                if (i10 == i12) {
                    z10 = !uv0Var.H;
                    uv0Var.H = z10;
                } else if (i10 == uv0Var.f41359v0) {
                    boolean z12 = !uv0Var.J;
                    uv0Var.J = z12;
                    uv0Var.r0();
                    int i13 = uv0Var.f41358u0;
                    if (i13 >= 0 && i12 < 0) {
                        uv0Var.f41333b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        uv0Var.f41333b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == uv0Var.f41356s0) {
                    boolean z13 = uv0Var.K;
                    boolean z14 = !z13;
                    uv0Var.K = z14;
                    if (!z13 && uv0Var.L) {
                        int i14 = uv0Var.f41345j0;
                        uv0Var.L = false;
                        uv0Var.r0();
                        s4.c1 K = uv0Var.f41335c.K(uv0Var.f41357t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.w8) K.f46531a).setChecked(false);
                        } else {
                            uv0Var.f41333b.m(uv0Var.f41357t0);
                        }
                        uv0Var.f41333b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (uv0Var.N == 0) {
                    z10 = !uv0Var.L;
                    uv0Var.L = z10;
                    int i15 = uv0Var.f41345j0;
                    uv0Var.r0();
                    if (uv0Var.L) {
                        uv0Var.f41333b.s(uv0Var.f41345j0, 2);
                    } else {
                        uv0Var.f41333b.t(i15, 2);
                    }
                    if (uv0Var.L && uv0Var.K) {
                        uv0Var.K = false;
                        s4.c1 K2 = uv0Var.f41335c.K(uv0Var.f41356s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.w8) K2.f46531a).setChecked(false);
                        } else {
                            uv0Var.f41333b.m(uv0Var.f41356s0);
                        }
                    }
                    if (uv0Var.L) {
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
            if (uv0Var.M && !uv0Var.L) {
                uv0Var.h.b(true);
            }
            uv0Var.f41335c.getChildCount();
            for (int i17 = uv0Var.f41349n0; i17 < uv0Var.f41349n0 + uv0Var.f41364y; i17++) {
                s4.c1 K3 = uv0Var.f41335c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f46531a;
                    if (view2 instanceof org.telegram.ui.Cells.d6) {
                        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view2;
                        d6Var.m(uv0Var.L, true);
                        d6Var.f21929r.a(zArr[i17 - uv0Var.f41349n0], z11);
                        if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == uv0Var.f41357t0 && !uv0Var.M) {
                            uv0Var.h.f(d6Var.getCheckBox(), true);
                            uv0Var.M = true;
                        }
                    }
                }
            }
            w8Var.setChecked(z10);
            uv0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        by0 by0Var = (by0) this.f37201b;
        int i11 = by0Var.f35220y;
        if (i10 == by0Var.f35218w) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.O(by0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new zx0(by0Var), null).f20372a;
            b2Var.show();
            b2Var.h();
        } else if (i10 == by0Var.f35214f) {
            if (i11 == 1) {
                ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                n2Var.d = new Paint();
                n2Var.f39055f = new mv[2];
                n2Var.f39059w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                uy uyVar = new uy(bundle);
                n2Var.f39051a = uyVar;
                uyVar.C2 = new kv(n2Var);
                uyVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                n2Var.f39052b = contactsActivity;
                contactsActivity.W = new kv(n2Var);
                contactsActivity.onFragmentCreate();
                by0Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                return;
            }
            Bundle i12 = a4.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            d70 d70Var = new d70(i12);
            d70Var.f35693w = new yx0(by0Var);
            by0Var.presentFragment(d70Var);
        } else if (i10 >= by0Var.f35216r && i10 < by0Var.f35217s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", by0Var.getMessagesController().blockePeers.keyAt(i10 - by0Var.f35216r));
                by0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        yt ytVar;
        boolean[] zArr;
        w00 w00Var;
        org.telegram.ui.Components.yc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        int i15;
        fx0 fx0Var;
        int i16 = 3;
        ut utVar = null;
        boolean z10 = true;
        switch (this.f37200a) {
            case 0:
                l lVar = (l) this.f37201b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        lVar.f38136c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z12);
                        lVar.f38136c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.q90 q90Var = jcVar.f27726b;
                            q90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.i6.Gi, 0, new hu0(lVar, 3)));
                            q90Var.setSingleLine(false);
                            q90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            jcVar.f27725a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.rc.g(lVar, jcVar, 3500).j();
                            int i18 = -lVar.f38137e;
                            lVar.f38137e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                        boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z13);
                        lVar.f38136c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                q qVar = (q) this.f37201b;
                if (i10 >= qVar.f39575x && i10 < qVar.f39576y && qVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) qVar.h.get(i10 - qVar.f39575x);
                    if (stickerSetCovered.set.f20069id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f20062id = stickerSetCovered.set.f20069id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.qy0 qy0Var = new org.telegram.ui.Components.qy0(qVar.getParentActivity(), qVar, inputStickerSet, null, null, null);
                    qy0Var.f30196c0 = new n(qVar, view, stickerSetCovered);
                    qVar.showDialog(qy0Var);
                    return;
                }
                return;
            case 2:
                ad adVar = (ad) this.f37201b;
                ArrayList arrayList2 = adVar.f34786c;
                zb1 zb1Var = adVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.op opVar = (org.telegram.ui.Components.op) arrayList2.get(i10);
                    adVar.a(opVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + zb1Var.getPaddingLeft()) {
                        zb1Var.w0(-((AndroidUtilities.dp(48.0f) + zb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (zb1Var.getMeasuredWidth() - zb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        zb1Var.w0(org.telegram.messenger.q.A(48.0f, zb1Var.getMeasuredWidth() - zb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = adVar.f34790r;
                    if (callback != null) {
                        callback.run(opVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                tp tpVar = (tp) this.f37201b;
                boolean z14 = tpVar.f40933s;
                if (tpVar.getParentActivity() != null) {
                    s4.h0 adapter = tpVar.f40927b.getAdapter();
                    sp spVar = tpVar.f40929e;
                    if (adapter == spVar) {
                        chat = (TLRPC.Chat) spVar.d.get(i10);
                    } else {
                        int i19 = tpVar.G;
                        if (i10 >= i19 && i10 < tpVar.H) {
                            chat = (TLRPC.Chat) tpVar.v.get(i10 - i19);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z14 && tpVar.h.linked_chat_id == 0) {
                            tpVar.Z(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f20042id);
                        tpVar.presentFragment(new yn(bundle));
                        return;
                    } else if (i10 == tpVar.F) {
                        if (z14 && tpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{tpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = tpVar.f40930f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            k70 k70Var = new k70(bundle2);
                            k70Var.Y = new lp(tpVar);
                            tpVar.presentFragment(k70Var);
                            return;
                        } else if (!tpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) tpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tpVar.getParentActivity());
                            if (z14) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.f20372a.R = string;
                            alertDialog$Builder.f20372a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new z0(tpVar, 24));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20372a;
                            tpVar.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21063q7, false));
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
                aq aqVar = (aq) this.f37201b;
                ArrayList arrayList3 = aqVar.f34886r;
                boolean z15 = aqVar.G;
                if (z15) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                if (i10 > i11) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    if (z15) {
                        i16 = 2;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - i16);
                    boolean contains = aqVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        aqVar.d.add(tL_availableReaction.reaction);
                    } else {
                        aqVar.d.remove(tL_availableReaction.reaction);
                        if (aqVar.d.isEmpty()) {
                            zp zpVar = aqVar.h;
                            if (zpVar != null) {
                                if (aqVar.G) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                zpVar.t(i12, arrayList3.size() + 1);
                            }
                            aqVar.T(2, true);
                        }
                    }
                    Switch r22 = yVar.f23746c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.qp qpVar = yVar.d;
                    if (qpVar != null) {
                        qpVar.a(z16, true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                nt ntVar = (nt) this.f37201b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((qt) view).d;
                rt rtVar = ntVar.f39042a;
                zg.b0 reactionsWindow = rtVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f53336q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.wy0.c(null, rtVar.f40268c0, rtVar.f40290z.getContext(), new c5(ntVar, 9));
                    return;
                }
                pt ptVar = rtVar.f40277l;
                if (ptVar != null) {
                    ptVar.w(stickerSetCovered2.set, TextUtils.join("", rtVar.f40280o));
                }
                rtVar.p();
                return;
            case 6:
                zt ztVar = (zt) this.f37201b;
                if (ztVar.f43890f && ztVar.f43889e) {
                    xt xtVar = ztVar.d;
                    ArrayList arrayList4 = xtVar.f42950e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        utVar = (ut) xtVar.f42950e.get(i10);
                    }
                } else {
                    int S = ztVar.f43888c.S(i10);
                    int Q = ztVar.f43888c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        utVar = ztVar.f43888c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    ztVar.finishFragment();
                    if (utVar != null && (ytVar = ztVar.f43892r) != null) {
                        ytVar.b1(utVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                vu vuVar = (vu) this.f37201b;
                ArrayList arrayList5 = vuVar.j3;
                zu zuVar = vuVar.f41840v3;
                if ((view instanceof ou) && i10 >= 0 && i10 < arrayList5.size()) {
                    qu quVar = (qu) arrayList5.get(i10);
                    if (quVar != null) {
                        int i20 = quVar.h;
                        if (i20 >= 0) {
                            vuVar.f41834p3[i20] = !zArr[i20];
                            vuVar.C1(true);
                            return;
                        } else if (i20 == -2) {
                            zuVar.presentFragment(new DataAutoDownloadActivity(vuVar.f41825f3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zuVar.getParentActivity());
                    alertDialog$Builder2.f20372a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f20372a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new ru(vuVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20372a;
                    zuVar.showDialog(b2Var2);
                    TextView textView2 = (TextView) b2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21063q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                c00.T((c00) this.f37201b, view, i10);
                return;
            case 9:
                f10 f10Var = (f10) this.f37201b;
                if (f10Var.getParentActivity() != null && (w00Var = (w00) f10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = w00Var.f41880c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = w00Var.f17187a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                        f10Var.v0(w00Var, zaVar.getName(), zaVar.getCurrentObject(), w00Var.f41883g);
                        return;
                    } else if (i21 == 7) {
                        cu cuVar = new cu(11, f10Var, w00Var);
                        if (f10Var.f36141c.isEnabled()) {
                            f10Var.s0(cuVar, false);
                            return;
                        } else {
                            cuVar.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && w00Var.f41886k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = f10Var.f36145r;
                        if (f10Var.f36146s && f10Var.f36141c.getAlpha() > 0.0f) {
                            float f7 = -f10Var.Q;
                            f10Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            f10Var.v = true;
                            gj gjVar = f10Var.R;
                            if (gjVar == null || gjVar.getVisibility() != 0) {
                                gj gjVar2 = new gj(6, 2, f10Var.getParentActivity(), null, true);
                                f10Var.R = gjVar2;
                                gjVar2.f28522a.setMaxWidth(AndroidUtilities.displaySize.x);
                                f10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                f10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                f10Var.getParentLayout().getOverlayContainerView().addView(f10Var.R, marginLayoutParams);
                                f10Var.R.f(f10Var.f36141c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(f10Var.f36147w) || !TextUtils.isEmpty(dialogFilter.name)) && (f10Var.f36149y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && f10Var.G.isEmpty() && !f10Var.F.isEmpty()) {
                            f10Var.s0(new g00(f10Var, 1), false);
                            return;
                        } else {
                            float f10 = -f10Var.Q;
                            f10Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(f10Var.f36147w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.yc.a0(f10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((f10Var.f36149y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!f10Var.G.isEmpty()) {
                                    a02 = org.telegram.ui.Components.yc.a0(f10Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.yc.a0(f10Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (f10Var.F.isEmpty()) {
                                a02 = org.telegram.ui.Components.yc.a0(f10Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.yc.a0(f10Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.bi.o(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                r00 r00Var = (r00) this.f37201b;
                ArrayList arrayList6 = r00Var.f39874d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    w00 w00Var2 = (w00) arrayList6.get(i22);
                    int i23 = w00Var2.f17187a;
                    if (i23 == 7) {
                        r00Var.dismiss();
                        r00Var.f25309n.presentFragment(new c00(r00Var.X, w00Var2.f41888m));
                        return;
                    } else if (i23 == 8) {
                        r00Var.O();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                x10 x10Var = (x10) this.f37201b;
                if (view instanceof org.telegram.ui.Cells.k7) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.f2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s2) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.s2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 12:
                m70 m70Var = (m70) this.f37201b;
                if (m70Var.getParentActivity() != null) {
                    if (i10 != m70Var.f38455n && i10 != 0) {
                        if (i10 == m70Var.f38457s) {
                            if (m70Var.f38454f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", m70Var.f38454f.link);
                                    m70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == m70Var.f38456r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(m70Var.getParentActivity());
                            alertDialog$Builder3.f20372a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f20372a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new bu(m70Var, 13));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            m70Var.showDialog(alertDialog$Builder3.f20372a);
                            return;
                        } else {
                            return;
                        }
                    } else if (m70Var.f38454f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", m70Var.f38454f.link));
                            org.telegram.ui.Components.yc.j(m70Var).j();
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
            case 13:
                s70.S((s70) this.f37201b, view, i10);
                return;
            case 14:
                k80.S((k80) this.f37201b, view, i10);
                return;
            case 15:
                LanguageSelectActivity.S((LanguageSelectActivity) this.f37201b, view, i10);
                return;
            case 16:
                gd0 gd0Var = (gd0) this.f37201b;
                gd0Var.f36580i0 = -1L;
                int i24 = gd0Var.G0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) gd0Var.T.J(i10)) != null) {
                        if (gd0Var.f36575e0 == 0) {
                            gd0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            gd0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(gd0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = gd0Var.getMessagesController().getInputChannel(-gd0Var.f36575e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        b2VarArr[0].setOnCancelListener(new da(gd0Var, gd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ca(gd0Var, b2VarArr, tL_messageMediaVenue, 19)), 7));
                        gd0Var.showDialog(b2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = gd0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = gd0Var.f36602z0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), gd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = gd0Var.B0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = gd0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = gd0Var.B0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), gd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i24 != 2) {
                    if (gd0Var.F0 != null && gd0Var.f36599x0 != null) {
                        FrameLayout frameLayout = gd0Var.f36586o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(gd0Var.f36599x0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(gd0Var.f36599x0.getLongitude());
                        gd0Var.F0.b(tL_messageMediaGeo, gd0Var.G0, true, 0, 0L);
                        gd0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && gd0Var.getLocationController().isSharingLocation(gd0Var.f36575e0) && gd0Var.T.j(i10) == 7) {
                    gd0Var.getLocationController().removeSharingLocation(gd0Var.f36575e0);
                    gd0Var.T.l();
                    gd0Var.finishFragment();
                    return;
                } else if (i24 == 2 && gd0Var.getLocationController().isSharingLocation(gd0Var.f36575e0) && gd0Var.T.j(i10) == 6) {
                    if (gd0Var.getLocationController().getSharingLocationInfo(gd0Var.f36575e0).period == Integer.MAX_VALUE) {
                        z10 = false;
                    }
                    gd0Var.s0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (gd0Var.getLocationController().isSharingLocation(gd0Var.f36575e0)) {
                        gd0Var.getLocationController().removeSharingLocation(gd0Var.f36575e0);
                        gd0Var.T.l();
                        gd0Var.finishFragment();
                        return;
                    }
                    gd0Var.s0(false);
                    return;
                } else {
                    Object J = gd0Var.T.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        gd0Var.F0.b((TLRPC.TL_messageMediaVenue) J, gd0Var.G0, true, 0, 0L);
                        gd0Var.finishFragment();
                        return;
                    } else if (J instanceof ad0) {
                        ad0 ad0Var = (ad0) J;
                        gd0Var.f36580i0 = ad0Var.f34794a;
                        if (gd0Var.f36581j0) {
                            gd0Var.f36581j0 = false;
                            gd0Var.C0();
                        }
                        gd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(ad0Var.f34797e.getPosition(), gd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((zi0) this.f37201b).onBackPressed();
                return;
            case 18:
                hj0 hj0Var = (hj0) this.f37201b;
                int i25 = hj0Var.I;
                if (i10 >= i25 && i10 < hj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) hj0Var.f37107x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!hj0Var.Z(messageObject2)) {
                            hj0Var.getOrCreateStoryViewer().F(hj0Var.getParentActivity(), messageObject2.storyItem, ai.u9.a(hj0Var.f37102f));
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
                    if (hj0Var.getMessagesController().checkCanOpenChat(bundle3, hj0Var)) {
                        hj0Var.presentFragment(new yn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.T((PasscodeActivity) this.f37201b, view, i10);
                return;
            case 20:
                vp0 vp0Var = (vp0) this.f37201b;
                vp0Var.a(i10, true);
                ip0 ip0Var = vp0Var.h;
                if (ip0Var != null) {
                    ip0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 21:
                wq0 wq0Var = (wq0) this.f37201b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = wq0Var.f42609f;
                ArrayList arrayList8 = wq0Var.f42617n;
                MediaController.AlbumEntry albumEntry = wq0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        ar0 ar0Var = wq0Var.f42626t0;
                        if (ar0Var != null) {
                            switch (ar0Var.f34899a) {
                                case 0:
                                    br0.h0(ar0Var.f34900b, str);
                                    return;
                                default:
                                    br0.h0(ar0Var.f34900b, str);
                                    return;
                            }
                        }
                        wq0Var.P.getSearchField().setText(str);
                        wq0Var.P.getSearchField().setSelection(str.length());
                        wq0Var.b0(wq0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wq0Var.getParentActivity());
                        alertDialog$Builder4.f20372a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f20372a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new jq0(wq0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder4.f20372a;
                        wq0Var.showDialog(b2Var3);
                        TextView textView3 = (TextView) b2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21063q7, false));
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
                    org.telegram.ui.ActionBar.v0 v0Var = wq0Var.P;
                    if (v0Var != null) {
                        AndroidUtilities.hideKeyboard(v0Var.getSearchField());
                    }
                    if (wq0Var.Y) {
                        wq0Var.Z(view, arrayList7.get(i10));
                        return;
                    }
                    int i26 = wq0Var.T;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 == 2) {
                            i14 = 3;
                        } else if (i26 == 10) {
                            i14 = 10;
                        } else if (wq0Var.U == null) {
                            i14 = 4;
                        } else {
                            i14 = 0;
                        }
                    } else {
                        i14 = 1;
                    }
                    PhotoViewer.t1().K2(null, wq0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = wq0Var.H;
                    boolean z17 = wq0Var.I;
                    t12.h = i27;
                    t12.f33977n = z17;
                    PhotoViewer.t1().g2(arrayList7, i10, i14, wq0Var.f42616l0, wq0Var.f42632x0, wq0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f37201b;
                ArrayList arrayList9 = photoViewer.f33925g7;
                if (!arrayList9.isEmpty() && (i15 = photoViewer.P4) >= 0 && i15 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f33958k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.f33958k5 = false;
                return;
            case 23:
                a(i10, view);
                return;
            case 24:
                PremiumPreviewFragment.S((PremiumPreviewFragment) this.f37201b, view, i10);
                return;
            case 25:
                dx0 dx0Var = (dx0) this.f37201b;
                PremiumPreviewFragment premiumPreviewFragment = dx0Var.f35861n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                ax0 ax0Var = dx0Var.f35859e;
                if (view.isEnabled() && (view instanceof rg.r1)) {
                    rg.r1 r1Var = (rg.r1) view;
                    premiumPreviewFragment.f34129e = arrayList10.indexOf(r1Var.getTier());
                    premiumPreviewFragment.t0(true);
                    r1Var.c(true, true);
                    for (int i28 = 0; i28 < ax0Var.getChildCount(); i28++) {
                        View childAt = ax0Var.getChildAt(i28);
                        if (childAt instanceof rg.r1) {
                            rg.r1 r1Var2 = (rg.r1) childAt;
                            if (r1Var2.getTier() != r1Var.getTier()) {
                                r1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < ax0Var.getHiddenChildCount(); i29++) {
                        View V = ax0Var.V(i29);
                        if (V instanceof rg.r1) {
                            rg.r1 r1Var3 = (rg.r1) V;
                            if (r1Var3.getTier() != r1Var.getTier()) {
                                r1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < ax0Var.getCachedChildCount(); i30++) {
                        View P = ax0Var.P(i30);
                        if (P instanceof rg.r1) {
                            rg.r1 r1Var4 = (rg.r1) P;
                            if (r1Var4.getTier() != r1Var.getTier()) {
                                r1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < ax0Var.getAttachedScrapChildCount(); i31++) {
                        View O = ax0Var.O(i31);
                        if (O instanceof rg.r1) {
                            rg.r1 r1Var5 = (rg.r1) O;
                            if (r1Var5.getTier() != r1Var.getTier()) {
                                r1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((fx0Var = premiumPreviewFragment.f34131f) == null || fx0Var.f36427a.months >= ((fx0) arrayList10.get(premiumPreviewFragment.f34129e)).f36427a.months || premiumPreviewFragment.f34142p0)) {
                        z10 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z10);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.W((PrivacyControlActivity) this.f37201b, view, i10);
                return;
            case 27:
                b(i10, view);
                return;
            case 28:
                ProfileActivity.f0((ProfileActivity) this.f37201b, i10);
                return;
            default:
                ProxyListActivity.S((ProxyListActivity) this.f37201b, view, i10);
                return;
        }
    }
}
