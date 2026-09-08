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
public final class i implements org.telegram.ui.Components.zk0 {
    public final int f37168a;
    public final Object f37169b;

    public i(Object obj, int i10) {
        this.f37168a = i10;
        this.f37169b = obj;
    }

    private final void b(int i10, View view) {
        boolean z10;
        zv0 zv0Var = (zv0) this.f37169b;
        boolean[] zArr = zv0Var.f43583w;
        if (i10 == zv0Var.f43573o0) {
            zv0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = zv0Var.L;
            org.telegram.ui.Components.my0 my0Var = zv0Var.Q;
            if (my0Var != null) {
                my0Var.f();
            }
            if (zv0Var.I) {
                int i11 = -zv0Var.O;
                zv0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == zv0Var.f43577r0) {
                z10 = !zv0Var.G;
                zv0Var.G = z10;
            } else {
                int i12 = zv0Var.f43581u0;
                if (i10 == i12) {
                    z10 = !zv0Var.H;
                    zv0Var.H = z10;
                } else if (i10 == zv0Var.f43582v0) {
                    boolean z12 = !zv0Var.J;
                    zv0Var.J = z12;
                    zv0Var.r0();
                    int i13 = zv0Var.f43581u0;
                    if (i13 >= 0 && i12 < 0) {
                        zv0Var.f43556b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        zv0Var.f43556b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == zv0Var.f43579s0) {
                    boolean z13 = zv0Var.K;
                    boolean z14 = !z13;
                    zv0Var.K = z14;
                    if (!z13 && zv0Var.L) {
                        int i14 = zv0Var.f43568j0;
                        zv0Var.L = false;
                        zv0Var.r0();
                        s4.c1 K = zv0Var.f43558c.K(zv0Var.f43580t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.w8) K.f45766a).setChecked(false);
                        } else {
                            zv0Var.f43556b.m(zv0Var.f43580t0);
                        }
                        zv0Var.f43556b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (zv0Var.N == 0) {
                    z10 = !zv0Var.L;
                    zv0Var.L = z10;
                    int i15 = zv0Var.f43568j0;
                    zv0Var.r0();
                    if (zv0Var.L) {
                        zv0Var.f43556b.s(zv0Var.f43568j0, 2);
                    } else {
                        zv0Var.f43556b.t(i15, 2);
                    }
                    if (zv0Var.L && zv0Var.K) {
                        zv0Var.K = false;
                        s4.c1 K2 = zv0Var.f43558c.K(zv0Var.f43579s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.w8) K2.f45766a).setChecked(false);
                        } else {
                            zv0Var.f43556b.m(zv0Var.f43579s0);
                        }
                    }
                    if (zv0Var.L) {
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
            if (zv0Var.M && !zv0Var.L) {
                zv0Var.h.b(true);
            }
            zv0Var.f43558c.getChildCount();
            for (int i17 = zv0Var.f43572n0; i17 < zv0Var.f43572n0 + zv0Var.f43587y; i17++) {
                s4.c1 K3 = zv0Var.f43558c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f45766a;
                    if (view2 instanceof org.telegram.ui.Cells.c6) {
                        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view2;
                        c6Var.m(zv0Var.L, true);
                        c6Var.f21715r.a(zArr[i17 - zv0Var.f43572n0], z11);
                        if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == zv0Var.f43580t0 && !zv0Var.M) {
                            zv0Var.h.f(c6Var.getCheckBox(), true);
                            zv0Var.M = true;
                        }
                    }
                }
            }
            w8Var.setChecked(z10);
            zv0Var.i0();
        }
    }

    private final void c(int i10, View view) {
        hy0 hy0Var = (hy0) this.f37169b;
        int i11 = hy0Var.f37167y;
        if (i10 == hy0Var.f37165w) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.O(hy0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new fy0(hy0Var), null).f20225a;
            b2Var.show();
            b2Var.h();
        } else if (i10 == hy0Var.f37161f) {
            if (i11 == 1) {
                ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                n2Var.d = new Paint();
                n2Var.f39348f = new nv[2];
                n2Var.f39352w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                uy uyVar = new uy(bundle);
                n2Var.f39344a = uyVar;
                uyVar.C2 = new lv(n2Var);
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
                n2Var.f39345b = contactsActivity;
                contactsActivity.W = new lv(n2Var);
                contactsActivity.onFragmentCreate();
                hy0Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                return;
            }
            Bundle i12 = a4.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            f70 f70Var = new f70(i12);
            f70Var.f36333w = new ey0(hy0Var);
            hy0Var.presentFragment(f70Var);
        } else if (i10 >= hy0Var.f37163r && i10 < hy0Var.f37164s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", hy0Var.getMessagesController().blockePeers.keyAt(i10 - hy0Var.f37163r));
                hy0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        au auVar;
        boolean[] zArr;
        w00 w00Var;
        org.telegram.ui.Components.yc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        int i15;
        lx0 lx0Var;
        int i16 = 3;
        vt vtVar = null;
        boolean z10 = true;
        switch (this.f37168a) {
            case 0:
                l lVar = (l) this.f37169b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        lVar.f38185c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z12);
                        lVar.f38185c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.d90 d90Var = icVar.f27097b;
                            d90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.j6.Gi, 0, new lu0(lVar, 3)));
                            d90Var.setSingleLine(false);
                            d90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            icVar.f27096a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.qc.g(lVar, icVar, 3500).j();
                            int i18 = -lVar.f38186e;
                            lVar.f38186e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                        boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z13);
                        lVar.f38185c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                p pVar = (p) this.f37169b;
                if (i10 >= pVar.f39402x && i10 < pVar.f39403y && pVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) pVar.h.get(i10 - pVar.f39402x);
                    if (stickerSetCovered.set.f19923id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f19916id = stickerSetCovered.set.f19923id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(pVar.getParentActivity(), pVar, inputStickerSet, null, null, null);
                    ux0Var.f31022c0 = new n(pVar, view, stickerSetCovered);
                    pVar.showDialog(ux0Var);
                    return;
                }
                return;
            case 2:
                zc zcVar = (zc) this.f37169b;
                ArrayList arrayList2 = zcVar.f43397c;
                ec1 ec1Var = zcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) arrayList2.get(i10);
                    zcVar.a(kpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + ec1Var.getPaddingLeft()) {
                        ec1Var.v0(-((AndroidUtilities.dp(48.0f) + ec1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (ec1Var.getMeasuredWidth() - ec1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        ec1Var.v0(org.telegram.messenger.w1.z(48.0f, ec1Var.getMeasuredWidth() - ec1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = zcVar.f43401r;
                    if (callback != null) {
                        callback.run(kpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                xp xpVar = (xp) this.f37169b;
                boolean z14 = xpVar.f42881s;
                if (xpVar.getParentActivity() != null) {
                    s4.h0 adapter = xpVar.f42875b.getAdapter();
                    wp wpVar = xpVar.f42877e;
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
                        if (z14 && xpVar.h.linked_chat_id == 0) {
                            xpVar.a0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f19896id);
                        xpVar.presentFragment(new co(bundle));
                        return;
                    } else if (i10 == xpVar.F) {
                        if (z14 && xpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{xpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = xpVar.f42878f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            l70 l70Var = new l70(bundle2);
                            l70Var.Y = new pp(xpVar);
                            xpVar.presentFragment(l70Var);
                            return;
                        } else if (!xpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) xpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xpVar.getParentActivity());
                            if (z14) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.f20225a.R = string;
                            alertDialog$Builder.f20225a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new z0(xpVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                            xpVar.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
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
                eq eqVar = (eq) this.f37169b;
                ArrayList arrayList3 = eqVar.f36170r;
                boolean z15 = eqVar.G;
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
                    boolean contains = eqVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        eqVar.d.add(tL_availableReaction.reaction);
                    } else {
                        eqVar.d.remove(tL_availableReaction.reaction);
                        if (eqVar.d.isEmpty()) {
                            dq dqVar = eqVar.h;
                            if (dqVar != null) {
                                if (eqVar.G) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                dqVar.t(i12, arrayList3.size() + 1);
                            }
                            eqVar.V(2, true);
                        }
                    }
                    Switch r22 = yVar.f23578c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.mp mpVar = yVar.d;
                    if (mpVar != null) {
                        mpVar.a(z16, true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ot otVar = (ot) this.f37169b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((rt) view).d;
                st stVar = otVar.f39336a;
                ah.u0 reactionsWindow = stVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f711q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ay0.c(null, stVar.f40556c0, stVar.f40578z.getContext(), new b5(otVar, 9));
                    return;
                }
                qt qtVar = stVar.f40565l;
                if (qtVar != null) {
                    qtVar.v(stickerSetCovered2.set, TextUtils.join("", stVar.f40568o));
                }
                stVar.p();
                return;
            case 6:
                bu buVar = (bu) this.f37169b;
                if (buVar.f34954f && buVar.f34953e) {
                    zt ztVar = buVar.d;
                    ArrayList arrayList4 = ztVar.f43540e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        vtVar = (vt) ztVar.f43540e.get(i10);
                    }
                } else {
                    int S = buVar.f34952c.S(i10);
                    int Q = buVar.f34952c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        vtVar = buVar.f34952c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    buVar.finishFragment();
                    if (vtVar != null && (auVar = buVar.f34956r) != null) {
                        auVar.a1(vtVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                wu wuVar = (wu) this.f37169b;
                ArrayList arrayList5 = wuVar.f42509c3;
                av avVar = wuVar.f42520o3;
                if ((view instanceof pu) && i10 >= 0 && i10 < arrayList5.size()) {
                    ru ruVar = (ru) arrayList5.get(i10);
                    if (ruVar != null) {
                        int i20 = ruVar.h;
                        if (i20 >= 0) {
                            wuVar.f42515i3[i20] = !zArr[i20];
                            wuVar.z1(true);
                            return;
                        } else if (i20 == -2) {
                            avVar.presentFragment(new DataAutoDownloadActivity(wuVar.Y2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(avVar.getParentActivity());
                    alertDialog$Builder2.f20225a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f20225a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new su(wuVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20225a;
                    avVar.showDialog(b2Var2);
                    TextView textView2 = (TextView) b2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                c00.V((c00) this.f37169b, view, i10);
                return;
            case 9:
                f10 f10Var = (f10) this.f37169b;
                if (f10Var.getParentActivity() != null && (w00Var = (w00) f10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = w00Var.f41759c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = w00Var.f44098a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                        f10Var.v0(w00Var, zaVar.getName(), zaVar.getCurrentObject(), w00Var.f41762g);
                        return;
                    } else if (i21 == 7) {
                        yt ytVar = new yt(14, f10Var, w00Var);
                        if (f10Var.f36251c.isEnabled()) {
                            f10Var.s0(ytVar, false);
                            return;
                        } else {
                            ytVar.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && w00Var.f41765k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = f10Var.f36255r;
                        if (f10Var.f36256s && f10Var.f36251c.getAlpha() > 0.0f) {
                            float f7 = -f10Var.Q;
                            f10Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            f10Var.v = true;
                            ij ijVar = f10Var.R;
                            if (ijVar == null || ijVar.getVisibility() != 0) {
                                ij ijVar2 = new ij(6, 3, f10Var.getParentActivity(), null, true);
                                f10Var.R = ijVar2;
                                ijVar2.f26983a.setMaxWidth(AndroidUtilities.displaySize.x);
                                f10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                f10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                f10Var.getParentLayout().getOverlayContainerView().addView(f10Var.R, marginLayoutParams);
                                f10Var.R.f(f10Var.f36251c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(f10Var.f36257w) || !TextUtils.isEmpty(dialogFilter.name)) && (f10Var.f36259y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && f10Var.G.isEmpty() && !f10Var.F.isEmpty()) {
                            f10Var.s0(new g00(f10Var, 1), false);
                            return;
                        } else {
                            float f10 = -f10Var.Q;
                            f10Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(f10Var.f36257w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.yc.a0(f10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((f10Var.f36259y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
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
                            org.telegram.messenger.w1.p(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                r00 r00Var = (r00) this.f37169b;
                ArrayList arrayList6 = r00Var.f40056d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    w00 w00Var2 = (w00) arrayList6.get(i22);
                    int i23 = w00Var2.f44098a;
                    if (i23 == 7) {
                        r00Var.dismiss();
                        r00Var.f24676n.presentFragment(new c00(r00Var.X, w00Var2.f41767m));
                        return;
                    } else if (i23 == 8) {
                        r00Var.Q();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                x10 x10Var = (x10) this.f37169b;
                if (view instanceof org.telegram.ui.Cells.j7) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.i7) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.e2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r2) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.r2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 12:
                n70 n70Var = (n70) this.f37169b;
                if (n70Var.getParentActivity() != null) {
                    if (i10 != n70Var.f38872n && i10 != 0) {
                        if (i10 == n70Var.f38874s) {
                            if (n70Var.f38871f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", n70Var.f38871f.link);
                                    n70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == n70Var.f38873r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(n70Var.getParentActivity());
                            alertDialog$Builder3.f20225a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f20225a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new iu(n70Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            n70Var.showDialog(alertDialog$Builder3.f20225a);
                            return;
                        } else {
                            return;
                        }
                    } else if (n70Var.f38871f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", n70Var.f38871f.link));
                            org.telegram.ui.Components.yc.j(n70Var).j();
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
                u70.U((u70) this.f37169b, view, i10);
                return;
            case 14:
                l80.U((l80) this.f37169b, view, i10);
                return;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f37169b, view, i10);
                return;
            case 16:
                id0 id0Var = (id0) this.f37169b;
                id0Var.f37343i0 = -1L;
                int i24 = id0Var.G0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) id0Var.T.J(i10)) != null) {
                        if (id0Var.f37338e0 == 0) {
                            id0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            id0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(id0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = id0Var.getMessagesController().getInputChannel(-id0Var.f37338e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        b2VarArr[0].setOnCancelListener(new ba(id0Var, id0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new aa(id0Var, b2VarArr, tL_messageMediaVenue, 19)), 7));
                        id0Var.showDialog(b2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = id0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = id0Var.f37365z0.geo_point;
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
                    if (id0Var.F0 != null && id0Var.f37362x0 != null) {
                        FrameLayout frameLayout = id0Var.f37349o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(id0Var.f37362x0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(id0Var.f37362x0.getLongitude());
                        id0Var.F0.b(tL_messageMediaGeo, id0Var.G0, true, 0, 0L);
                        id0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && id0Var.getLocationController().isSharingLocation(id0Var.f37338e0) && id0Var.T.j(i10) == 7) {
                    id0Var.getLocationController().removeSharingLocation(id0Var.f37338e0);
                    id0Var.T.l();
                    id0Var.finishFragment();
                    return;
                } else if (i24 == 2 && id0Var.getLocationController().isSharingLocation(id0Var.f37338e0) && id0Var.T.j(i10) == 6) {
                    if (id0Var.getLocationController().getSharingLocationInfo(id0Var.f37338e0).period == Integer.MAX_VALUE) {
                        z10 = false;
                    }
                    id0Var.s0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (id0Var.getLocationController().isSharingLocation(id0Var.f37338e0)) {
                        id0Var.getLocationController().removeSharingLocation(id0Var.f37338e0);
                        id0Var.T.l();
                        id0Var.finishFragment();
                        return;
                    }
                    id0Var.s0(false);
                    return;
                } else {
                    Object J = id0Var.T.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        id0Var.F0.b((TLRPC.TL_messageMediaVenue) J, id0Var.G0, true, 0, 0L);
                        id0Var.finishFragment();
                        return;
                    } else if (J instanceof cd0) {
                        cd0 cd0Var = (cd0) J;
                        id0Var.f37343i0 = cd0Var.f35100a;
                        if (id0Var.f37344j0) {
                            id0Var.f37344j0 = false;
                            id0Var.C0();
                        }
                        id0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cd0Var.f35103e.getPosition(), id0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((cj0) this.f37169b).onBackPressed();
                return;
            case 18:
                lj0 lj0Var = (lj0) this.f37169b;
                int i25 = lj0Var.I;
                if (i10 >= i25 && i10 < lj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) lj0Var.f38420x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!lj0Var.a0(messageObject2)) {
                            lj0Var.getOrCreateStoryViewer().F(lj0Var.getParentActivity(), messageObject2.storyItem, bi.d9.a(lj0Var.f38415f));
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
                    if (lj0Var.getMessagesController().checkCanOpenChat(bundle3, lj0Var)) {
                        lj0Var.presentFragment(new co(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.f37169b, view, i10);
                return;
            case 20:
                aq0 aq0Var = (aq0) this.f37169b;
                aq0Var.a(i10, true);
                np0 np0Var = aq0Var.h;
                if (np0Var != null) {
                    np0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 21:
                br0 br0Var = (br0) this.f37169b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = br0Var.f34917f;
                ArrayList arrayList8 = br0Var.f34925n;
                MediaController.AlbumEntry albumEntry = br0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        fr0 fr0Var = br0Var.f34934t0;
                        if (fr0Var != null) {
                            switch (fr0Var.f36480a) {
                                case 0:
                                    gr0.h0(fr0Var.f36481b, str);
                                    return;
                                default:
                                    gr0.h0(fr0Var.f36481b, str);
                                    return;
                            }
                        }
                        br0Var.P.getSearchField().setText(str);
                        br0Var.P.getSearchField().setSelection(str.length());
                        br0Var.b0(br0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(br0Var.getParentActivity());
                        alertDialog$Builder4.f20225a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f20225a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new oq0(br0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder4.f20225a;
                        br0Var.showDialog(b2Var3);
                        TextView textView3 = (TextView) b2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
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
                    org.telegram.ui.ActionBar.v0 v0Var = br0Var.P;
                    if (v0Var != null) {
                        AndroidUtilities.hideKeyboard(v0Var.getSearchField());
                    }
                    if (br0Var.Y) {
                        br0Var.a0(view, arrayList7.get(i10));
                        return;
                    }
                    int i26 = br0Var.T;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 == 2) {
                            i14 = 3;
                        } else if (i26 == 10) {
                            i14 = 10;
                        } else if (br0Var.U == null) {
                            i14 = 4;
                        } else {
                            i14 = 0;
                        }
                    } else {
                        i14 = 1;
                    }
                    PhotoViewer.t1().K2(null, br0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = br0Var.H;
                    boolean z17 = br0Var.I;
                    t12.h = i27;
                    t12.f33652n = z17;
                    PhotoViewer.t1().f2(arrayList7, i10, i14, br0Var.f34924l0, br0Var.f34940x0, br0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f37169b;
                ArrayList arrayList9 = photoViewer.f33600g7;
                if (!arrayList9.isEmpty() && (i15 = photoViewer.P4) >= 0 && i15 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f33633k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.f33633k5 = false;
                return;
            case 23:
                b(i10, view);
                return;
            case 24:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f37169b, view, i10);
                return;
            case 25:
                jx0 jx0Var = (jx0) this.f37169b;
                PremiumPreviewFragment premiumPreviewFragment = jx0Var.f37891n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                gx0 gx0Var = jx0Var.f37889e;
                if (view.isEnabled() && (view instanceof sg.t1)) {
                    sg.t1 t1Var = (sg.t1) view;
                    premiumPreviewFragment.f33804e = arrayList10.indexOf(t1Var.getTier());
                    premiumPreviewFragment.t0(true);
                    t1Var.c(true, true);
                    for (int i28 = 0; i28 < gx0Var.getChildCount(); i28++) {
                        View childAt = gx0Var.getChildAt(i28);
                        if (childAt instanceof sg.t1) {
                            sg.t1 t1Var2 = (sg.t1) childAt;
                            if (t1Var2.getTier() != t1Var.getTier()) {
                                t1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < gx0Var.getHiddenChildCount(); i29++) {
                        View V = gx0Var.V(i29);
                        if (V instanceof sg.t1) {
                            sg.t1 t1Var3 = (sg.t1) V;
                            if (t1Var3.getTier() != t1Var.getTier()) {
                                t1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < gx0Var.getCachedChildCount(); i30++) {
                        View P = gx0Var.P(i30);
                        if (P instanceof sg.t1) {
                            sg.t1 t1Var4 = (sg.t1) P;
                            if (t1Var4.getTier() != t1Var.getTier()) {
                                t1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < gx0Var.getAttachedScrapChildCount(); i31++) {
                        View O = gx0Var.O(i31);
                        if (O instanceof sg.t1) {
                            sg.t1 t1Var5 = (sg.t1) O;
                            if (t1Var5.getTier() != t1Var.getTier()) {
                                t1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((lx0Var = premiumPreviewFragment.f33806f) == null || lx0Var.f38535a.months >= ((lx0) arrayList10.get(premiumPreviewFragment.f33804e)).f38535a.months || premiumPreviewFragment.f33817p0)) {
                        z10 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z10);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f37169b, view, i10);
                return;
            case 27:
                c(i10, view);
                return;
            case 28:
                ProfileActivity.f0((ProfileActivity) this.f37169b, i10);
                return;
            default:
                ProxyListActivity.U((ProxyListActivity) this.f37169b, view, i10);
                return;
        }
    }
}
