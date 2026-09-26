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
public final class i implements org.telegram.ui.Components.ll0 {
    public final int f34332a;
    public final Object f34333b;

    public i(Object obj, int i10) {
        this.f34332a = i10;
        this.f34333b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        rv0 rv0Var = (rv0) this.f34333b;
        boolean[] zArr = rv0Var.f37523w;
        if (i10 == rv0Var.f37513o0) {
            rv0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = rv0Var.L;
            org.telegram.ui.Components.yy0 yy0Var = rv0Var.Q;
            if (yy0Var != null) {
                yy0Var.f();
            }
            if (rv0Var.I) {
                int i11 = -rv0Var.O;
                rv0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == rv0Var.f37517r0) {
                z10 = !rv0Var.G;
                rv0Var.G = z10;
            } else {
                int i12 = rv0Var.f37521u0;
                if (i10 == i12) {
                    z10 = !rv0Var.H;
                    rv0Var.H = z10;
                } else if (i10 == rv0Var.f37522v0) {
                    boolean z12 = !rv0Var.J;
                    rv0Var.J = z12;
                    rv0Var.r0();
                    int i13 = rv0Var.f37521u0;
                    if (i13 >= 0 && i12 < 0) {
                        rv0Var.f37497b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        rv0Var.f37497b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == rv0Var.f37519s0) {
                    boolean z13 = rv0Var.K;
                    boolean z14 = !z13;
                    rv0Var.K = z14;
                    if (!z13 && rv0Var.L) {
                        int i14 = rv0Var.f37508j0;
                        rv0Var.L = false;
                        rv0Var.r0();
                        s4.c1 K = rv0Var.f37499c.K(rv0Var.f37520t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.w8) K.f42959a).setChecked(false);
                        } else {
                            rv0Var.f37497b.m(rv0Var.f37520t0);
                        }
                        rv0Var.f37497b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (rv0Var.N == 0) {
                    z10 = !rv0Var.L;
                    rv0Var.L = z10;
                    int i15 = rv0Var.f37508j0;
                    rv0Var.r0();
                    if (rv0Var.L) {
                        rv0Var.f37497b.s(rv0Var.f37508j0, 2);
                    } else {
                        rv0Var.f37497b.t(i15, 2);
                    }
                    if (rv0Var.L && rv0Var.K) {
                        rv0Var.K = false;
                        s4.c1 K2 = rv0Var.f37499c.K(rv0Var.f37519s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.w8) K2.f42959a).setChecked(false);
                        } else {
                            rv0Var.f37497b.m(rv0Var.f37519s0);
                        }
                    }
                    if (rv0Var.L) {
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
            if (rv0Var.M && !rv0Var.L) {
                rv0Var.h.b(true);
            }
            rv0Var.f37499c.getChildCount();
            for (int i17 = rv0Var.f37512n0; i17 < rv0Var.f37512n0 + rv0Var.f37527y; i17++) {
                s4.c1 K3 = rv0Var.f37499c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f42959a;
                    if (view2 instanceof org.telegram.ui.Cells.d6) {
                        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view2;
                        d6Var.m(rv0Var.L, true);
                        d6Var.f20139r.a(zArr[i17 - rv0Var.f37512n0], z11);
                        if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == rv0Var.f37520t0 && !rv0Var.M) {
                            rv0Var.h.f(d6Var.getCheckBox(), true);
                            rv0Var.M = true;
                        }
                    }
                }
            }
            w8Var.setChecked(z10);
            rv0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        yx0 yx0Var = (yx0) this.f34333b;
        int i11 = yx0Var.f40276y;
        if (i10 == yx0Var.f40274w) {
            org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.e5.O(yx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new wx0(yx0Var), null).f18661a;
            a2Var.show();
            a2Var.h();
        } else if (i10 == yx0Var.f40270f) {
            if (i11 == 1) {
                ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
                m2Var.d = new Paint();
                m2Var.f34876f = new iv[2];
                m2Var.f34880w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                qy qyVar = new qy(bundle);
                m2Var.f34873a = qyVar;
                qyVar.C2 = new gv(m2Var);
                qyVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                m2Var.f34874b = contactsActivity;
                contactsActivity.W = new gv(m2Var);
                contactsActivity.onFragmentCreate();
                yx0Var.presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
                return;
            }
            Bundle i12 = a4.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            z60 z60Var = new z60(i12);
            z60Var.f40392w = new vx0(yx0Var);
            yx0Var.presentFragment(z60Var);
        } else if (i10 >= yx0Var.f40272r && i10 < yx0Var.f40273s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", yx0Var.getMessagesController().blockePeers.keyAt(i10 - yx0Var.f40272r));
                yx0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        vt vtVar;
        boolean[] zArr;
        s00 s00Var;
        org.telegram.ui.Components.xc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        int i15;
        cx0 cx0Var;
        int i16 = 3;
        qt qtVar = null;
        boolean z10 = true;
        switch (this.f34332a) {
            case 0:
                l lVar = (l) this.f34333b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        lVar.f35201c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z12);
                        lVar.f35201c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.o90 o90Var = icVar.f25047b;
                            o90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.h6.Gi, 0, new eu0(lVar, 3)));
                            o90Var.setSingleLine(false);
                            o90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            icVar.f25046a.setImageResource(R.drawable.msg_settings_premium);
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
                        ((org.telegram.ui.Cells.w8) view).setChecked(z13);
                        lVar.f35201c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                q qVar = (q) this.f34333b;
                if (i10 >= qVar.f36716x && i10 < qVar.f36717y && qVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) qVar.h.get(i10 - qVar.f36716x);
                    if (stickerSetCovered.set.f18362id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f18355id = stickerSetCovered.set.f18362id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.gy0 gy0Var = new org.telegram.ui.Components.gy0(qVar.getParentActivity(), qVar, inputStickerSet, null, null, null);
                    gy0Var.f24602c0 = new n(qVar, view, stickerSetCovered);
                    qVar.showDialog(gy0Var);
                    return;
                }
                return;
            case 2:
                yc ycVar = (yc) this.f34333b;
                ArrayList arrayList2 = ycVar.f40113c;
                wb1 wb1Var = ycVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.np npVar = (org.telegram.ui.Components.np) arrayList2.get(i10);
                    ycVar.a(npVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + wb1Var.getPaddingLeft()) {
                        wb1Var.v0(-((AndroidUtilities.dp(48.0f) + wb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (wb1Var.getMeasuredWidth() - wb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        wb1Var.v0(org.telegram.messenger.f0.A(48.0f, wb1Var.getMeasuredWidth() - wb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = ycVar.f40116r;
                    if (callback != null) {
                        callback.run(npVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                rp rpVar = (rp) this.f34333b;
                boolean z14 = rpVar.f37431s;
                if (rpVar.getParentActivity() != null) {
                    s4.h0 adapter = rpVar.f37426b.getAdapter();
                    qp qpVar = rpVar.e;
                    if (adapter == qpVar) {
                        chat = (TLRPC.Chat) qpVar.d.get(i10);
                    } else {
                        int i19 = rpVar.G;
                        if (i10 >= i19 && i10 < rpVar.H) {
                            chat = (TLRPC.Chat) rpVar.v.get(i10 - i19);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z14 && rpVar.h.linked_chat_id == 0) {
                            rpVar.a0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f18335id);
                        rpVar.presentFragment(new wn(bundle));
                        return;
                    } else if (i10 == rpVar.F) {
                        if (z14 && rpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{rpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = rpVar.f37428f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            g70 g70Var = new g70(bundle2);
                            g70Var.Y = new jp(rpVar);
                            rpVar.presentFragment(g70Var);
                            return;
                        } else if (!rpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) rpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rpVar.getParentActivity());
                            if (z14) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.f18661a.R = string;
                            alertDialog$Builder.f18661a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new z0(rpVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
                            rpVar.showDialog(a2Var);
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19298q7, false));
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
                yp ypVar = (yp) this.f34333b;
                ArrayList arrayList3 = ypVar.f40213r;
                boolean z15 = ypVar.G;
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
                    boolean contains = ypVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        ypVar.d.add(tL_availableReaction.reaction);
                    } else {
                        ypVar.d.remove(tL_availableReaction.reaction);
                        if (ypVar.d.isEmpty()) {
                            xp xpVar = ypVar.h;
                            if (xpVar != null) {
                                if (ypVar.G) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                xpVar.t(i12, arrayList3.size() + 1);
                            }
                            ypVar.V(2, true);
                        }
                    }
                    Switch r22 = yVar.f21860c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.pp ppVar = yVar.d;
                    if (ppVar != null) {
                        ppVar.a(z16, true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                jt jtVar = (jt) this.f34333b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((mt) view).d;
                nt ntVar = jtVar.f34866a;
                zg.b0 reactionsWindow = ntVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f49257q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.my0.c(null, ntVar.f35976c0, ntVar.f35997z.getContext(), new b5(jtVar, 9));
                    return;
                }
                lt ltVar = ntVar.f35984l;
                if (ltVar != null) {
                    ltVar.w(stickerSetCovered2.set, TextUtils.join("", ntVar.f35987o));
                }
                ntVar.p();
                return;
            case 6:
                wt wtVar = (wt) this.f34333b;
                if (wtVar.f39755f && wtVar.e) {
                    ut utVar = wtVar.d;
                    ArrayList arrayList4 = utVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        qtVar = (qt) utVar.e.get(i10);
                    }
                } else {
                    int S = wtVar.f39754c.S(i10);
                    int Q = wtVar.f39754c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        qtVar = wtVar.f39754c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    wtVar.finishFragment();
                    if (qtVar != null && (vtVar = wtVar.f39757r) != null) {
                        vtVar.a1(qtVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ru ruVar = (ru) this.f34333b;
                ArrayList arrayList5 = ruVar.f37465c3;
                vu vuVar = ruVar.f37476o3;
                if ((view instanceof ku) && i10 >= 0 && i10 < arrayList5.size()) {
                    mu muVar = (mu) arrayList5.get(i10);
                    if (muVar != null) {
                        int i20 = muVar.h;
                        if (i20 >= 0) {
                            ruVar.f37471i3[i20] = !zArr[i20];
                            ruVar.A1(true);
                            return;
                        } else if (i20 == -2) {
                            vuVar.presentFragment(new DataAutoDownloadActivity(ruVar.Y2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vuVar.getParentActivity());
                    alertDialog$Builder2.f18661a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f18661a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new nu(ruVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f18661a;
                    vuVar.showDialog(a2Var2);
                    TextView textView2 = (TextView) a2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19298q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                yz.V((yz) this.f34333b, view, i10);
                return;
            case 9:
                b10 b10Var = (b10) this.f34333b;
                if (b10Var.getParentActivity() != null && (s00Var = (s00) b10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = s00Var.f37554c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = s00Var.f15715a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                        b10Var.v0(s00Var, zaVar.getName(), zaVar.getCurrentObject(), s00Var.f37556g);
                        return;
                    } else if (i21 == 7) {
                        tt ttVar = new tt(13, b10Var, s00Var);
                        if (b10Var.f32274c.isEnabled()) {
                            b10Var.s0(ttVar, false);
                            return;
                        } else {
                            ttVar.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && s00Var.f37559k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = b10Var.f32277r;
                        if (b10Var.f32278s && b10Var.f32274c.getAlpha() > 0.0f) {
                            float f7 = -b10Var.Q;
                            b10Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            b10Var.v = true;
                            fj fjVar = b10Var.R;
                            if (fjVar == null || fjVar.getVisibility() != 0) {
                                fj fjVar2 = new fj(6, 3, b10Var.getParentActivity(), null, true);
                                b10Var.R = fjVar2;
                                fjVar2.f25621a.setMaxWidth(AndroidUtilities.displaySize.x);
                                b10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                b10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                b10Var.getParentLayout().getOverlayContainerView().addView(b10Var.R, marginLayoutParams);
                                b10Var.R.f(b10Var.f32274c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(b10Var.f32279w) || !TextUtils.isEmpty(dialogFilter.name)) && (b10Var.f32281y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && b10Var.G.isEmpty() && !b10Var.F.isEmpty()) {
                            b10Var.s0(new c00(b10Var, 1), false);
                            return;
                        } else {
                            float f10 = -b10Var.Q;
                            b10Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(b10Var.f32279w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.xc.a0(b10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((b10Var.f32281y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!b10Var.G.isEmpty()) {
                                    a02 = org.telegram.ui.Components.xc.a0(b10Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.xc.a0(b10Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (b10Var.F.isEmpty()) {
                                a02 = org.telegram.ui.Components.xc.a0(b10Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.xc.a0(b10Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.ok.p(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                n00 n00Var = (n00) this.f34333b;
                ArrayList arrayList6 = n00Var.f35717d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    s00 s00Var2 = (s00) arrayList6.get(i22);
                    int i23 = s00Var2.f15715a;
                    if (i23 == 7) {
                        n00Var.dismiss();
                        n00Var.f22958n.presentFragment(new yz(n00Var.X, s00Var2.f37561m));
                        return;
                    } else if (i23 == 8) {
                        n00Var.Q();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                t10 t10Var = (t10) this.f34333b;
                if (view instanceof org.telegram.ui.Cells.k7) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.f2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s2) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.s2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 12:
                i70 i70Var = (i70) this.f34333b;
                if (i70Var.getParentActivity() != null) {
                    if (i10 != i70Var.f34425n && i10 != 0) {
                        if (i10 == i70Var.f34427s) {
                            if (i70Var.f34424f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", i70Var.f34424f.link);
                                    i70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == i70Var.f34426r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(i70Var.getParentActivity());
                            alertDialog$Builder3.f18661a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f18661a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new du(i70Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            i70Var.showDialog(alertDialog$Builder3.f18661a);
                            return;
                        } else {
                            return;
                        }
                    } else if (i70Var.f34424f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", i70Var.f34424f.link));
                            org.telegram.ui.Components.xc.j(i70Var).j();
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
            case 13:
                o70.U((o70) this.f34333b, view, i10);
                return;
            case 14:
                g80.U((g80) this.f34333b, view, i10);
                return;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f34333b, view, i10);
                return;
            case 16:
                cd0 cd0Var = (cd0) this.f34333b;
                cd0Var.f32666i0 = -1L;
                int i24 = cd0Var.G0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) cd0Var.T.J(i10)) != null) {
                        if (cd0Var.f32661e0 == 0) {
                            cd0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            cd0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(cd0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = cd0Var.getMessagesController().getInputChannel(-cd0Var.f32661e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        a2VarArr[0].setOnCancelListener(new ba(cd0Var, cd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new aa(cd0Var, a2VarArr, tL_messageMediaVenue, 19)), 7));
                        cd0Var.showDialog(a2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = cd0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = cd0Var.f32688z0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), cd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = cd0Var.B0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = cd0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = cd0Var.B0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), cd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i24 != 2) {
                    if (cd0Var.F0 != null && cd0Var.f32685x0 != null) {
                        FrameLayout frameLayout = cd0Var.f32672o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(cd0Var.f32685x0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(cd0Var.f32685x0.getLongitude());
                        cd0Var.F0.b(tL_messageMediaGeo, cd0Var.G0, true, 0, 0L);
                        cd0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && cd0Var.getLocationController().isSharingLocation(cd0Var.f32661e0) && cd0Var.T.j(i10) == 7) {
                    cd0Var.getLocationController().removeSharingLocation(cd0Var.f32661e0);
                    cd0Var.T.l();
                    cd0Var.finishFragment();
                    return;
                } else if (i24 == 2 && cd0Var.getLocationController().isSharingLocation(cd0Var.f32661e0) && cd0Var.T.j(i10) == 6) {
                    if (cd0Var.getLocationController().getSharingLocationInfo(cd0Var.f32661e0).period == Integer.MAX_VALUE) {
                        z10 = false;
                    }
                    cd0Var.s0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (cd0Var.getLocationController().isSharingLocation(cd0Var.f32661e0)) {
                        cd0Var.getLocationController().removeSharingLocation(cd0Var.f32661e0);
                        cd0Var.T.l();
                        cd0Var.finishFragment();
                        return;
                    }
                    cd0Var.s0(false);
                    return;
                } else {
                    Object J = cd0Var.T.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        cd0Var.F0.b((TLRPC.TL_messageMediaVenue) J, cd0Var.G0, true, 0, 0L);
                        cd0Var.finishFragment();
                        return;
                    } else if (J instanceof wc0) {
                        wc0 wc0Var = (wc0) J;
                        cd0Var.f32666i0 = wc0Var.f38954a;
                        if (cd0Var.f32667j0) {
                            cd0Var.f32667j0 = false;
                            cd0Var.C0();
                        }
                        cd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(wc0Var.e.getPosition(), cd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((vi0) this.f34333b).onBackPressed();
                return;
            case 18:
                dj0 dj0Var = (dj0) this.f34333b;
                int i25 = dj0Var.I;
                if (i10 >= i25 && i10 < dj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) dj0Var.f33144x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!dj0Var.a0(messageObject2)) {
                            dj0Var.getOrCreateStoryViewer().F(dj0Var.getParentActivity(), messageObject2.storyItem, ai.u9.a(dj0Var.f33139f));
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
                    if (dj0Var.getMessagesController().checkCanOpenChat(bundle3, dj0Var)) {
                        dj0Var.presentFragment(new wn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.f34333b, view, i10);
                return;
            case 20:
                sp0 sp0Var = (sp0) this.f34333b;
                sp0Var.a(i10, true);
                fp0 fp0Var = sp0Var.h;
                if (fp0Var != null) {
                    fp0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 21:
                tq0 tq0Var = (tq0) this.f34333b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = tq0Var.f38195f;
                ArrayList arrayList8 = tq0Var.f38203n;
                MediaController.AlbumEntry albumEntry = tq0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        xq0 xq0Var = tq0Var.f38212t0;
                        if (xq0Var != null) {
                            switch (xq0Var.f39964a) {
                                case 0:
                                    yq0.h0(xq0Var.f39965b, str);
                                    return;
                                default:
                                    yq0.h0(xq0Var.f39965b, str);
                                    return;
                            }
                        }
                        tq0Var.P.getSearchField().setText(str);
                        tq0Var.P.getSearchField().setSelection(str.length());
                        tq0Var.b0(tq0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(tq0Var.getParentActivity());
                        alertDialog$Builder4.f18661a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f18661a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new gq0(tq0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder4.f18661a;
                        tq0Var.showDialog(a2Var3);
                        TextView textView3 = (TextView) a2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19298q7, false));
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
                    org.telegram.ui.ActionBar.u0 u0Var = tq0Var.P;
                    if (u0Var != null) {
                        AndroidUtilities.hideKeyboard(u0Var.getSearchField());
                    }
                    if (tq0Var.Y) {
                        tq0Var.a0(view, arrayList7.get(i10));
                        return;
                    }
                    int i26 = tq0Var.T;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 == 2) {
                            i14 = 3;
                        } else if (i26 == 10) {
                            i14 = 10;
                        } else if (tq0Var.U == null) {
                            i14 = 4;
                        } else {
                            i14 = 0;
                        }
                    } else {
                        i14 = 1;
                    }
                    PhotoViewer.t1().J2(null, tq0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = tq0Var.H;
                    boolean z17 = tq0Var.I;
                    t12.h = i27;
                    t12.f31298n = z17;
                    PhotoViewer.t1().f2(arrayList7, i10, i14, tq0Var.f38202l0, tq0Var.f38218x0, tq0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f34333b;
                ArrayList arrayList9 = photoViewer.f31246g7;
                if (!arrayList9.isEmpty() && (i15 = photoViewer.P4) >= 0 && i15 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f31279k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.A2(indexOf);
                }
                photoViewer.f31279k5 = false;
                return;
            case 23:
                a(i10, view);
                return;
            case 24:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f34333b, view, i10);
                return;
            case 25:
                ax0 ax0Var = (ax0) this.f34333b;
                PremiumPreviewFragment premiumPreviewFragment = ax0Var.f32252n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                xw0 xw0Var = ax0Var.e;
                if (view.isEnabled() && (view instanceof rg.p1)) {
                    rg.p1 p1Var = (rg.p1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(p1Var.getTier());
                    premiumPreviewFragment.t0(true);
                    p1Var.c(true, true);
                    for (int i28 = 0; i28 < xw0Var.getChildCount(); i28++) {
                        View childAt = xw0Var.getChildAt(i28);
                        if (childAt instanceof rg.p1) {
                            rg.p1 p1Var2 = (rg.p1) childAt;
                            if (p1Var2.getTier() != p1Var.getTier()) {
                                p1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < xw0Var.getHiddenChildCount(); i29++) {
                        View V = xw0Var.V(i29);
                        if (V instanceof rg.p1) {
                            rg.p1 p1Var3 = (rg.p1) V;
                            if (p1Var3.getTier() != p1Var.getTier()) {
                                p1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < xw0Var.getCachedChildCount(); i30++) {
                        View P = xw0Var.P(i30);
                        if (P instanceof rg.p1) {
                            rg.p1 p1Var4 = (rg.p1) P;
                            if (p1Var4.getTier() != p1Var.getTier()) {
                                p1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < xw0Var.getAttachedScrapChildCount(); i31++) {
                        View O = xw0Var.O(i31);
                        if (O instanceof rg.p1) {
                            rg.p1 p1Var5 = (rg.p1) O;
                            if (p1Var5.getTier() != p1Var.getTier()) {
                                p1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((cx0Var = premiumPreviewFragment.f31448f) == null || cx0Var.f32811a.months >= ((cx0) arrayList10.get(premiumPreviewFragment.e)).f32811a.months || premiumPreviewFragment.f31459p0)) {
                        z10 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z10);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f34333b, view, i10);
                return;
            case 27:
                b(i10, view);
                return;
            case 28:
                ProfileActivity.f0((ProfileActivity) this.f34333b, i10);
                return;
            default:
                ProxyListActivity.U((ProxyListActivity) this.f34333b, view, i10);
                return;
        }
    }
}
