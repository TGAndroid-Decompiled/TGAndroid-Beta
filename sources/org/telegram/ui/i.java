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
public final class i implements org.telegram.ui.Components.em0 {
    public final int f38423a;
    public final Object f38424b;

    public i(Object obj, int i10) {
        this.f38423a = i10;
        this.f38424b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        aw0 aw0Var = (aw0) this.f38424b;
        boolean[] zArr = aw0Var.f36063w;
        if (i10 == aw0Var.f36053o0) {
            aw0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = aw0Var.L;
            org.telegram.ui.Components.oz0 oz0Var = aw0Var.Q;
            if (oz0Var != null) {
                oz0Var.f();
            }
            if (aw0Var.I) {
                int i11 = -aw0Var.O;
                aw0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == aw0Var.f36057r0) {
                z10 = !aw0Var.G;
                aw0Var.G = z10;
            } else {
                int i12 = aw0Var.f36061u0;
                if (i10 == i12) {
                    z10 = !aw0Var.H;
                    aw0Var.H = z10;
                } else if (i10 == aw0Var.f36062v0) {
                    boolean z12 = !aw0Var.J;
                    aw0Var.J = z12;
                    aw0Var.r0();
                    int i13 = aw0Var.f36061u0;
                    if (i13 >= 0 && i12 < 0) {
                        aw0Var.f36036b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        aw0Var.f36036b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == aw0Var.f36059s0) {
                    boolean z13 = aw0Var.K;
                    boolean z14 = !z13;
                    aw0Var.K = z14;
                    if (!z13 && aw0Var.L) {
                        int i14 = aw0Var.f36048j0;
                        aw0Var.L = false;
                        aw0Var.r0();
                        s4.d1 K = aw0Var.f36038c.K(aw0Var.f36060t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.w8) K.f47658a).setChecked(false);
                        } else {
                            aw0Var.f36036b.m(aw0Var.f36060t0);
                        }
                        aw0Var.f36036b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (aw0Var.N == 0) {
                    z10 = !aw0Var.L;
                    aw0Var.L = z10;
                    int i15 = aw0Var.f36048j0;
                    aw0Var.r0();
                    if (aw0Var.L) {
                        aw0Var.f36036b.s(aw0Var.f36048j0, 2);
                    } else {
                        aw0Var.f36036b.t(i15, 2);
                    }
                    if (aw0Var.L && aw0Var.K) {
                        aw0Var.K = false;
                        s4.d1 K2 = aw0Var.f36038c.K(aw0Var.f36059s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.w8) K2.f47658a).setChecked(false);
                        } else {
                            aw0Var.f36036b.m(aw0Var.f36059s0);
                        }
                    }
                    if (aw0Var.L) {
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
            if (aw0Var.M && !aw0Var.L) {
                aw0Var.h.b(true);
            }
            aw0Var.f36038c.getChildCount();
            for (int i17 = aw0Var.f36052n0; i17 < aw0Var.f36052n0 + aw0Var.f36067y; i17++) {
                s4.d1 K3 = aw0Var.f36038c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f47658a;
                    if (view2 instanceof org.telegram.ui.Cells.d6) {
                        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view2;
                        d6Var.m(aw0Var.L, true);
                        d6Var.f21977r.a(zArr[i17 - aw0Var.f36052n0], z11);
                        if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == aw0Var.f36060t0 && !aw0Var.M) {
                            aw0Var.h.f(d6Var.getCheckBox(), true);
                            aw0Var.M = true;
                        }
                    }
                }
            }
            w8Var.setChecked(z10);
            aw0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        gy0 gy0Var = (gy0) this.f38424b;
        int i11 = gy0Var.f38152y;
        if (i10 == gy0Var.f38150w) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.g5.N(gy0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ey0(gy0Var), null).f20374a;
            b2Var.show();
            b2Var.h();
        } else if (i10 == gy0Var.f38146f) {
            if (i11 == 1) {
                ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                n2Var.d = new Paint();
                n2Var.f39995f = new lv[2];
                n2Var.f39999w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                ty tyVar = new ty(bundle);
                n2Var.f39991a = tyVar;
                tyVar.C2 = new jv(n2Var);
                tyVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                n2Var.f39992b = contactsActivity;
                contactsActivity.W = new jv(n2Var);
                contactsActivity.onFragmentCreate();
                gy0Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                return;
            }
            Bundle i12 = a1.g.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            c70 c70Var = new c70(i12);
            c70Var.f36570w = new dy0(gy0Var);
            gy0Var.presentFragment(c70Var);
        } else if (i10 >= gy0Var.f38148r && i10 < gy0Var.f38149s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", gy0Var.getMessagesController().blockePeers.keyAt(i10 - gy0Var.f38148r));
                gy0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        org.telegram.ui.Components.ad a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        int i15;
        lx0 lx0Var;
        int i16 = 3;
        ut utVar = null;
        boolean z10 = true;
        switch (this.f38423a) {
            case 0:
                l lVar = (l) this.f38424b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        lVar.f39384c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z12);
                        lVar.f39384c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.ea0 ea0Var = lcVar.f28419b;
                            ea0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.i6.Gi, 0, new nu0(lVar, 3)));
                            ea0Var.setSingleLine(false);
                            ea0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            lcVar.f28418a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.tc.g(lVar, lcVar, 3500).j();
                            int i18 = -lVar.f39385e;
                            lVar.f39385e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                        boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z13);
                        lVar.f39384c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                q qVar = (q) this.f38424b;
                if (i10 >= qVar.f40947x && i10 < qVar.f40948y && qVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) qVar.h.get(i10 - qVar.f40947x);
                    if (stickerSetCovered.set.f20065id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f20058id = stickerSetCovered.set.f20065id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.xy0 xy0Var = new org.telegram.ui.Components.xy0(qVar.getParentActivity(), qVar, inputStickerSet, null, null, null);
                    xy0Var.f33026c0 = new n(qVar, view, stickerSetCovered);
                    qVar.showDialog(xy0Var);
                    return;
                }
                return;
            case 2:
                zc zcVar = (zc) this.f38424b;
                ArrayList arrayList2 = zcVar.f44541c;
                fc1 fc1Var = zcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.bq bqVar = (org.telegram.ui.Components.bq) arrayList2.get(i10);
                    zcVar.a(bqVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + fc1Var.getPaddingLeft()) {
                        fc1Var.v0(-((AndroidUtilities.dp(48.0f) + fc1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (fc1Var.getMeasuredWidth() - fc1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        fc1Var.v0(org.telegram.messenger.q.A(48.0f, fc1Var.getMeasuredWidth() - fc1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = zcVar.f44545r;
                    if (callback != null) {
                        callback.run(bqVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                up upVar = (up) this.f38424b;
                boolean z14 = upVar.f42507s;
                if (upVar.getParentActivity() != null) {
                    s4.i0 adapter = upVar.f42501b.getAdapter();
                    tp tpVar = upVar.f42503e;
                    if (adapter == tpVar) {
                        chat = (TLRPC.Chat) tpVar.d.get(i10);
                    } else {
                        int i19 = upVar.G;
                        if (i10 >= i19 && i10 < upVar.H) {
                            chat = (TLRPC.Chat) upVar.v.get(i10 - i19);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z14 && upVar.h.linked_chat_id == 0) {
                            upVar.a0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f20038id);
                        upVar.presentFragment(new zn(bundle));
                        return;
                    } else if (i10 == upVar.F) {
                        if (z14 && upVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{upVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = upVar.f42504f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            j70 j70Var = new j70(bundle2);
                            j70Var.Y = new mp(upVar);
                            upVar.presentFragment(j70Var);
                            return;
                        } else if (!upVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) upVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(upVar.getParentActivity());
                            if (z14) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.f20374a.R = string;
                            alertDialog$Builder.f20374a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new z0(upVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                            upVar.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
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
                bq bqVar2 = (bq) this.f38424b;
                ArrayList arrayList3 = bqVar2.f36377r;
                boolean z15 = bqVar2.G;
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
                    boolean contains = bqVar2.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        bqVar2.d.add(tL_availableReaction.reaction);
                    } else {
                        bqVar2.d.remove(tL_availableReaction.reaction);
                        if (bqVar2.d.isEmpty()) {
                            aq aqVar = bqVar2.h;
                            if (aqVar != null) {
                                if (bqVar2.G) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                aqVar.t(i12, arrayList3.size() + 1);
                            }
                            bqVar2.V(2, true);
                        }
                    }
                    Switch r22 = yVar.f23749c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.dq dqVar = yVar.d;
                    if (dqVar != null) {
                        dqVar.a(z16, true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                nt ntVar = (nt) this.f38424b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((qt) view).d;
                rt rtVar = ntVar.f40362a;
                zg.a0 reactionsWindow = rtVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f54463q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.cz0.c(null, rtVar.f41489c0, rtVar.f41511z.getContext(), new b5(ntVar, 9));
                    return;
                }
                pt ptVar = rtVar.f41498l;
                if (ptVar != null) {
                    ptVar.w(stickerSetCovered2.set, TextUtils.join("", rtVar.f41501o));
                }
                rtVar.p();
                return;
            case 6:
                zt ztVar = (zt) this.f38424b;
                if (ztVar.f45065f && ztVar.f45064e) {
                    xt xtVar = ztVar.d;
                    ArrayList arrayList4 = xtVar.f44147e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        utVar = (ut) xtVar.f44147e.get(i10);
                    }
                } else {
                    int S = ztVar.f45063c.S(i10);
                    int Q = ztVar.f45063c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        utVar = ztVar.f45063c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    ztVar.finishFragment();
                    if (utVar != null && (ytVar = ztVar.f45067r) != null) {
                        ytVar.U0(utVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                uu uuVar = (uu) this.f38424b;
                ArrayList arrayList5 = uuVar.f42556a3;
                yu yuVar = uuVar.f42567m3;
                if ((view instanceof nu) && i10 >= 0 && i10 < arrayList5.size()) {
                    pu puVar = (pu) arrayList5.get(i10);
                    if (puVar != null) {
                        int i20 = puVar.h;
                        if (i20 >= 0) {
                            uuVar.f42562g3[i20] = !zArr[i20];
                            uuVar.B1(true);
                            return;
                        } else if (i20 == -2) {
                            yuVar.presentFragment(new DataAutoDownloadActivity(uuVar.W2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(yuVar.getParentActivity());
                    alertDialog$Builder2.f20374a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f20374a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new qu(uuVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20374a;
                    yuVar.showDialog(b2Var2);
                    TextView textView2 = (TextView) b2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                c00.V((c00) this.f38424b, view, i10);
                return;
            case 9:
                f10 f10Var = (f10) this.f38424b;
                if (f10Var.getParentActivity() != null && (w00Var = (w00) f10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = w00Var.f43027c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = w00Var.f17125a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
                        f10Var.v0(w00Var, xaVar.getName(), xaVar.getCurrentObject(), w00Var.f43030g);
                        return;
                    } else if (i21 == 7) {
                        org.telegram.ui.Components.ea1 ea1Var = new org.telegram.ui.Components.ea1(19, f10Var, w00Var);
                        if (f10Var.f37414c.isEnabled()) {
                            f10Var.s0(ea1Var, false);
                            return;
                        } else {
                            ea1Var.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && w00Var.f43033k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = f10Var.f37418r;
                        if (f10Var.f37419s && f10Var.f37414c.getAlpha() > 0.0f) {
                            float f7 = -f10Var.Q;
                            f10Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            f10Var.v = true;
                            jj jjVar = f10Var.R;
                            if (jjVar == null || jjVar.getVisibility() != 0) {
                                jj jjVar2 = new jj(6, 2, f10Var.getParentActivity(), null, true);
                                f10Var.R = jjVar2;
                                jjVar2.f33456a.setMaxWidth(AndroidUtilities.displaySize.x);
                                f10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                f10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                f10Var.getParentLayout().getOverlayContainerView().addView(f10Var.R, marginLayoutParams);
                                f10Var.R.f(f10Var.f37414c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(f10Var.f37420w) || !TextUtils.isEmpty(dialogFilter.name)) && (f10Var.f37422y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && f10Var.G.isEmpty() && !f10Var.F.isEmpty()) {
                            f10Var.s0(new g00(f10Var, 1), false);
                            return;
                        } else {
                            float f10 = -f10Var.Q;
                            f10Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(f10Var.f37420w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.ad.a0(f10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((f10Var.f37422y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!f10Var.G.isEmpty()) {
                                    a02 = org.telegram.ui.Components.ad.a0(f10Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.ad.a0(f10Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (f10Var.F.isEmpty()) {
                                a02 = org.telegram.ui.Components.ad.a0(f10Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.ad.a0(f10Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.bi.q(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                r00 r00Var = (r00) this.f38424b;
                ArrayList arrayList6 = r00Var.f41237d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    w00 w00Var2 = (w00) arrayList6.get(i22);
                    int i23 = w00Var2.f17125a;
                    if (i23 == 7) {
                        r00Var.dismiss();
                        r00Var.f26025n.presentFragment(new c00(r00Var.X, w00Var2.f43035m));
                        return;
                    } else if (i23 == 8) {
                        r00Var.R();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                w10 w10Var = (w10) this.f38424b;
                if (view instanceof org.telegram.ui.Cells.k7) {
                    w10Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    w10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    w10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    w10Var.f(i10, view, ((org.telegram.ui.Cells.f2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s2) {
                    w10Var.f(i10, view, ((org.telegram.ui.Cells.s2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 12:
                l70 l70Var = (l70) this.f38424b;
                if (l70Var.getParentActivity() != null) {
                    if (i10 != l70Var.f39454n && i10 != 0) {
                        if (i10 == l70Var.f39456s) {
                            if (l70Var.f39453f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", l70Var.f39453f.link);
                                    l70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == l70Var.f39455r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(l70Var.getParentActivity());
                            alertDialog$Builder3.f20374a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f20374a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new gu(l70Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            l70Var.showDialog(alertDialog$Builder3.f20374a);
                            return;
                        } else {
                            return;
                        }
                    } else if (l70Var.f39453f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", l70Var.f39453f.link));
                            org.telegram.ui.Components.ad.j(l70Var).j();
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
                s70.U((s70) this.f38424b, view, i10);
                return;
            case 14:
                l80.U((l80) this.f38424b, view, i10);
                return;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f38424b, view, i10);
                return;
            case 16:
                hd0 hd0Var = (hd0) this.f38424b;
                hd0Var.f38268i0 = -1L;
                int i24 = hd0Var.G0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) hd0Var.T.J(i10)) != null) {
                        if (hd0Var.f38263e0 == 0) {
                            hd0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            hd0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(hd0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = hd0Var.getMessagesController().getInputChannel(-hd0Var.f38263e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        b2VarArr[0].setOnCancelListener(new ca(hd0Var, hd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ba(hd0Var, b2VarArr, tL_messageMediaVenue, 19)), 7));
                        hd0Var.showDialog(b2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = hd0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = hd0Var.f38290z0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), hd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = hd0Var.B0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = hd0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = hd0Var.B0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), hd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i24 != 2) {
                    if (hd0Var.F0 != null && hd0Var.f38287x0 != null) {
                        FrameLayout frameLayout = hd0Var.f38274o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(hd0Var.f38287x0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(hd0Var.f38287x0.getLongitude());
                        hd0Var.F0.b(tL_messageMediaGeo, hd0Var.G0, true, 0, 0L);
                        hd0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && hd0Var.getLocationController().isSharingLocation(hd0Var.f38263e0) && hd0Var.T.j(i10) == 7) {
                    hd0Var.getLocationController().removeSharingLocation(hd0Var.f38263e0);
                    hd0Var.T.l();
                    hd0Var.finishFragment();
                    return;
                } else if (i24 == 2 && hd0Var.getLocationController().isSharingLocation(hd0Var.f38263e0) && hd0Var.T.j(i10) == 6) {
                    if (hd0Var.getLocationController().getSharingLocationInfo(hd0Var.f38263e0).period == Integer.MAX_VALUE) {
                        z10 = false;
                    }
                    hd0Var.r0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (hd0Var.getLocationController().isSharingLocation(hd0Var.f38263e0)) {
                        hd0Var.getLocationController().removeSharingLocation(hd0Var.f38263e0);
                        hd0Var.T.l();
                        hd0Var.finishFragment();
                        return;
                    }
                    hd0Var.r0(false);
                    return;
                } else {
                    Object J = hd0Var.T.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        hd0Var.F0.b((TLRPC.TL_messageMediaVenue) J, hd0Var.G0, true, 0, 0L);
                        hd0Var.finishFragment();
                        return;
                    } else if (J instanceof bd0) {
                        bd0 bd0Var = (bd0) J;
                        hd0Var.f38268i0 = bd0Var.f36282a;
                        if (hd0Var.f38269j0) {
                            hd0Var.f38269j0 = false;
                            hd0Var.B0();
                        }
                        hd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(bd0Var.f36285e.getPosition(), hd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((dj0) this.f38424b).onBackPressed();
                return;
            case 18:
                lj0 lj0Var = (lj0) this.f38424b;
                int i25 = lj0Var.I;
                if (i10 >= i25 && i10 < lj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) lj0Var.f39609x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!lj0Var.a0(messageObject2)) {
                            lj0Var.getOrCreateStoryViewer().F(lj0Var.getParentActivity(), messageObject2.storyItem, ai.v9.a(lj0Var.f39604f));
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
                        lj0Var.presentFragment(new zn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.f38424b, view, i10);
                return;
            case 20:
                zp0 zp0Var = (zp0) this.f38424b;
                zp0Var.a(i10, true);
                mp0 mp0Var = zp0Var.h;
                if (mp0Var != null) {
                    mp0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 21:
                br0 br0Var = (br0) this.f38424b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = br0Var.f36398f;
                ArrayList arrayList8 = br0Var.f36406n;
                MediaController.AlbumEntry albumEntry = br0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        fr0 fr0Var = br0Var.f36415t0;
                        if (fr0Var != null) {
                            switch (fr0Var.f37669a) {
                                case 0:
                                    gr0.h0(fr0Var.f37670b, str);
                                    return;
                                default:
                                    gr0.h0(fr0Var.f37670b, str);
                                    return;
                            }
                        }
                        br0Var.P.getSearchField().setText(str);
                        br0Var.P.getSearchField().setSelection(str.length());
                        br0Var.b0(br0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(br0Var.getParentActivity());
                        alertDialog$Builder4.f20374a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f20374a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new oq0(br0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder4.f20374a;
                        br0Var.showDialog(b2Var3);
                        TextView textView3 = (TextView) b2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
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
                        if (i26 != 2) {
                            i16 = 10;
                            if (i26 != 10) {
                                if (br0Var.U == null) {
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
                    PhotoViewer.t1().K2(null, br0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = br0Var.H;
                    boolean z17 = br0Var.I;
                    t12.h = i27;
                    t12.f33980n = z17;
                    PhotoViewer.t1().g2(arrayList7, i10, i14, br0Var.f36405l0, br0Var.f36421x0, br0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f38424b;
                ArrayList arrayList9 = photoViewer.f33928g7;
                if (!arrayList9.isEmpty() && (i15 = photoViewer.P4) >= 0 && i15 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f33961k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.f33961k5 = false;
                return;
            case 23:
                a(i10, view);
                return;
            case 24:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f38424b, view, i10);
                return;
            case 25:
                jx0 jx0Var = (jx0) this.f38424b;
                PremiumPreviewFragment premiumPreviewFragment = jx0Var.f39042n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                gx0 gx0Var = jx0Var.f39040e;
                if (view.isEnabled() && (view instanceof rg.q1)) {
                    rg.q1 q1Var = (rg.q1) view;
                    premiumPreviewFragment.f34132e = arrayList10.indexOf(q1Var.getTier());
                    premiumPreviewFragment.t0(true);
                    q1Var.c(true, true);
                    for (int i28 = 0; i28 < gx0Var.getChildCount(); i28++) {
                        View childAt = gx0Var.getChildAt(i28);
                        if (childAt instanceof rg.q1) {
                            rg.q1 q1Var2 = (rg.q1) childAt;
                            if (q1Var2.getTier() != q1Var.getTier()) {
                                q1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < gx0Var.getHiddenChildCount(); i29++) {
                        View V = gx0Var.V(i29);
                        if (V instanceof rg.q1) {
                            rg.q1 q1Var3 = (rg.q1) V;
                            if (q1Var3.getTier() != q1Var.getTier()) {
                                q1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < gx0Var.getCachedChildCount(); i30++) {
                        View P = gx0Var.P(i30);
                        if (P instanceof rg.q1) {
                            rg.q1 q1Var4 = (rg.q1) P;
                            if (q1Var4.getTier() != q1Var.getTier()) {
                                q1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < gx0Var.getAttachedScrapChildCount(); i31++) {
                        View O = gx0Var.O(i31);
                        if (O instanceof rg.q1) {
                            rg.q1 q1Var5 = (rg.q1) O;
                            if (q1Var5.getTier() != q1Var.getTier()) {
                                q1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((lx0Var = premiumPreviewFragment.f34134f) == null || lx0Var.f39697a.months >= ((lx0) arrayList10.get(premiumPreviewFragment.f34132e)).f39697a.months || premiumPreviewFragment.f34145p0)) {
                        z10 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z10);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f38424b, view, i10);
                return;
            case 27:
                b(i10, view);
                return;
            case 28:
                ProfileActivity.f0((ProfileActivity) this.f38424b, i10);
                return;
            default:
                ProxyListActivity.U((ProxyListActivity) this.f38424b, view, i10);
                return;
        }
    }
}
