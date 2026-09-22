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
    public final int f34380a;
    public final Object f34381b;

    public i(Object obj, int i10) {
        this.f34380a = i10;
        this.f34381b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        aw0 aw0Var = (aw0) this.f34381b;
        boolean[] zArr = aw0Var.f31978w;
        if (i10 == aw0Var.f31968o0) {
            aw0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = aw0Var.L;
            org.telegram.ui.Components.ny0 ny0Var = aw0Var.Q;
            if (ny0Var != null) {
                ny0Var.f();
            }
            if (aw0Var.I) {
                int i11 = -aw0Var.O;
                aw0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == aw0Var.f31972r0) {
                z10 = !aw0Var.G;
                aw0Var.G = z10;
            } else {
                int i12 = aw0Var.f31976u0;
                if (i10 == i12) {
                    z10 = !aw0Var.H;
                    aw0Var.H = z10;
                } else if (i10 == aw0Var.f31977v0) {
                    boolean z12 = !aw0Var.J;
                    aw0Var.J = z12;
                    aw0Var.r0();
                    int i13 = aw0Var.f31976u0;
                    if (i13 >= 0 && i12 < 0) {
                        aw0Var.f31952b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        aw0Var.f31952b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == aw0Var.f31974s0) {
                    boolean z13 = aw0Var.K;
                    boolean z14 = !z13;
                    aw0Var.K = z14;
                    if (!z13 && aw0Var.L) {
                        int i14 = aw0Var.f31963j0;
                        aw0Var.L = false;
                        aw0Var.r0();
                        s4.c1 K = aw0Var.f31954c.K(aw0Var.f31975t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.w8) K.f42671a).setChecked(false);
                        } else {
                            aw0Var.f31952b.m(aw0Var.f31975t0);
                        }
                        aw0Var.f31952b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (aw0Var.N == 0) {
                    z10 = !aw0Var.L;
                    aw0Var.L = z10;
                    int i15 = aw0Var.f31963j0;
                    aw0Var.r0();
                    if (aw0Var.L) {
                        aw0Var.f31952b.s(aw0Var.f31963j0, 2);
                    } else {
                        aw0Var.f31952b.t(i15, 2);
                    }
                    if (aw0Var.L && aw0Var.K) {
                        aw0Var.K = false;
                        s4.c1 K2 = aw0Var.f31954c.K(aw0Var.f31974s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.w8) K2.f42671a).setChecked(false);
                        } else {
                            aw0Var.f31952b.m(aw0Var.f31974s0);
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
            aw0Var.f31954c.getChildCount();
            for (int i17 = aw0Var.f31967n0; i17 < aw0Var.f31967n0 + aw0Var.f31982y; i17++) {
                s4.c1 K3 = aw0Var.f31954c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f42671a;
                    if (view2 instanceof org.telegram.ui.Cells.d6) {
                        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view2;
                        d6Var.m(aw0Var.L, true);
                        d6Var.f19903r.a(zArr[i17 - aw0Var.f31967n0], z11);
                        if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == aw0Var.f31975t0 && !aw0Var.M) {
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
        gy0 gy0Var = (gy0) this.f34381b;
        int i11 = gy0Var.f33975y;
        if (i10 == gy0Var.f33973w) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.c5.O(gy0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ey0(gy0Var), null).f18435a;
            b2Var.show();
            b2Var.h();
        } else if (i10 == gy0Var.f33969f) {
            if (i11 == 1) {
                ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                n2Var.d = new Paint();
                n2Var.f36055f = new mv[2];
                n2Var.f36059w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                uy uyVar = new uy(bundle);
                n2Var.f36052a = uyVar;
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
                n2Var.f36053b = contactsActivity;
                contactsActivity.W = new kv(n2Var);
                contactsActivity.onFragmentCreate();
                gy0Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                return;
            }
            Bundle i12 = a4.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            e70 e70Var = new e70(i12);
            e70Var.f33211w = new dy0(gy0Var);
            gy0Var.presentFragment(e70Var);
        } else if (i10 >= gy0Var.f33971r && i10 < gy0Var.f33972s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", gy0Var.getMessagesController().blockePeers.keyAt(i10 - gy0Var.f33971r));
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
        zt ztVar;
        boolean[] zArr;
        w00 w00Var;
        org.telegram.ui.Components.vc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        lx0 lx0Var;
        int i15 = 3;
        vt vtVar = null;
        boolean z10 = true;
        r5 = true;
        boolean z11 = true;
        r5 = 1;
        int i16 = 1;
        switch (this.f34380a) {
            case 0:
                l lVar = (l) this.f34381b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z12 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z12;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z12);
                        lVar.f35287c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z13 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z13;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z13);
                        lVar.f35287c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.c90 c90Var = gcVar.f24294b;
                            c90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.i6.Gi, 0, new mu0(lVar, 3)));
                            c90Var.setSingleLine(false);
                            c90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            gcVar.f24293a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.oc.g(lVar, gcVar, 3500).j();
                            int i18 = -lVar.e;
                            lVar.e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                        boolean z14 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z14;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z14);
                        lVar.f35287c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                p pVar = (p) this.f34381b;
                if (i10 >= pVar.f36387x && i10 < pVar.f36388y && pVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) pVar.h.get(i10 - pVar.f36387x);
                    if (stickerSetCovered.set.f18136id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f18129id = stickerSetCovered.set.f18136id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(pVar.getParentActivity(), pVar, inputStickerSet, null, null, null);
                    vx0Var.f29455c0 = new n(pVar, view, stickerSetCovered);
                    pVar.showDialog(vx0Var);
                    return;
                }
                return;
            case 2:
                yc ycVar = (yc) this.f34381b;
                ArrayList arrayList2 = ycVar.f39806c;
                ec1 ec1Var = ycVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList2.get(i10);
                    ycVar.a(lpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + ec1Var.getPaddingLeft()) {
                        ec1Var.v0(-((AndroidUtilities.dp(48.0f) + ec1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (ec1Var.getMeasuredWidth() - ec1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        ec1Var.v0(org.telegram.messenger.y0.z(48.0f, ec1Var.getMeasuredWidth() - ec1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = ycVar.f39809r;
                    if (callback != null) {
                        callback.run(lpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                wp wpVar = (wp) this.f34381b;
                boolean z15 = wpVar.f39349s;
                if (wpVar.getParentActivity() != null) {
                    s4.h0 adapter = wpVar.f39344b.getAdapter();
                    vp vpVar = wpVar.e;
                    if (adapter == vpVar) {
                        chat = (TLRPC.Chat) vpVar.d.get(i10);
                    } else {
                        int i19 = wpVar.G;
                        if (i10 >= i19 && i10 < wpVar.H) {
                            chat = (TLRPC.Chat) wpVar.v.get(i10 - i19);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z15 && wpVar.h.linked_chat_id == 0) {
                            wpVar.a0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f18109id);
                        wpVar.presentFragment(new bo(bundle));
                        return;
                    } else if (i10 == wpVar.F) {
                        if (z15 && wpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{wpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = wpVar.f39346f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            l70 l70Var = new l70(bundle2);
                            l70Var.Y = new op(wpVar);
                            wpVar.presentFragment(l70Var);
                            return;
                        } else if (!wpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) wpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wpVar.getParentActivity());
                            if (z15) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.f18435a.R = string;
                            alertDialog$Builder.f18435a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new y0(wpVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18435a;
                            wpVar.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19071q7, false));
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
                dq dqVar = (dq) this.f34381b;
                ArrayList arrayList3 = dqVar.f33064r;
                boolean z16 = dqVar.G;
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
                    boolean contains = dqVar.d.contains(tL_availableReaction.reaction);
                    boolean z17 = !contains;
                    if (!contains) {
                        dqVar.d.add(tL_availableReaction.reaction);
                    } else {
                        dqVar.d.remove(tL_availableReaction.reaction);
                        if (dqVar.d.isEmpty()) {
                            cq cqVar = dqVar.h;
                            if (cqVar != null) {
                                if (dqVar.G) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                cqVar.t(i12, arrayList3.size() + 1);
                            }
                            dqVar.V(2, true);
                        }
                    }
                    Switch r22 = yVar.f21636c;
                    if (r22 != null) {
                        r22.c(z17, true);
                    }
                    org.telegram.ui.Components.np npVar = yVar.d;
                    if (npVar != null) {
                        npVar.a(z17, true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ot otVar = (ot) this.f34381b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((rt) view).d;
                st stVar = otVar.f36339a;
                zg.c0 reactionsWindow = stVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f48989q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.by0.c(null, stVar.f37465c0, stVar.f37486z.getContext(), new b5(otVar, 9));
                    return;
                }
                qt qtVar = stVar.f37473l;
                if (qtVar != null) {
                    qtVar.v(stickerSetCovered2.set, TextUtils.join("", stVar.f37476o));
                }
                stVar.p();
                return;
            case 6:
                au auVar = (au) this.f34381b;
                if (auVar.f31936f && auVar.e) {
                    yt ytVar = auVar.d;
                    ArrayList arrayList4 = ytVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        vtVar = (vt) ytVar.e.get(i10);
                    }
                } else {
                    int S = auVar.f31935c.S(i10);
                    int Q = auVar.f31935c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        vtVar = auVar.f31935c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    auVar.finishFragment();
                    if (vtVar != null && (ztVar = auVar.f31938r) != null) {
                        ztVar.a1(vtVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                vu vuVar = (vu) this.f34381b;
                ArrayList arrayList5 = vuVar.f38624c3;
                zu zuVar = vuVar.f38635o3;
                if ((view instanceof ou) && i10 >= 0 && i10 < arrayList5.size()) {
                    qu quVar = (qu) arrayList5.get(i10);
                    if (quVar != null) {
                        int i20 = quVar.h;
                        if (i20 >= 0) {
                            vuVar.f38630i3[i20] = !zArr[i20];
                            vuVar.A1(true);
                            return;
                        } else if (i20 == -2) {
                            zuVar.presentFragment(new DataAutoDownloadActivity(vuVar.Y2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zuVar.getParentActivity());
                    alertDialog$Builder2.f18435a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f18435a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new ru(vuVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18435a;
                    zuVar.showDialog(b2Var2);
                    TextView textView2 = (TextView) b2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19071q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                c00.V((c00) this.f34381b, view, i10);
                return;
            case 9:
                f10 f10Var = (f10) this.f34381b;
                if (f10Var.getParentActivity() != null && (w00Var = (w00) f10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = w00Var.f38664c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = w00Var.f15531a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                        f10Var.v0(w00Var, abVar.getName(), abVar.getCurrentObject(), w00Var.f38666g);
                        return;
                    } else if (i21 == 7) {
                        kw kwVar = new kw(8, f10Var, w00Var);
                        if (f10Var.f33449c.isEnabled()) {
                            f10Var.s0(kwVar, false);
                            return;
                        } else {
                            kwVar.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && w00Var.f38669k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = f10Var.f33452r;
                        if (f10Var.f33453s && f10Var.f33449c.getAlpha() > 0.0f) {
                            float f7 = -f10Var.Q;
                            f10Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            f10Var.v = true;
                            ij ijVar = f10Var.R;
                            if (ijVar == null || ijVar.getVisibility() != 0) {
                                ij ijVar2 = new ij(6, 3, f10Var.getParentActivity(), null, true);
                                f10Var.R = ijVar2;
                                ijVar2.f24878a.setMaxWidth(AndroidUtilities.displaySize.x);
                                f10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                f10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                f10Var.getParentLayout().getOverlayContainerView().addView(f10Var.R, marginLayoutParams);
                                f10Var.R.f(f10Var.f33449c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(f10Var.f33454w) || !TextUtils.isEmpty(dialogFilter.name)) && (f10Var.f33456y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && f10Var.G.isEmpty() && !f10Var.F.isEmpty()) {
                            f10Var.s0(new g00(f10Var, 1), false);
                            return;
                        } else {
                            float f10 = -f10Var.Q;
                            f10Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(f10Var.f33454w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.vc.a0(f10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((f10Var.f33456y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!f10Var.G.isEmpty()) {
                                    a02 = org.telegram.ui.Components.vc.a0(f10Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.vc.a0(f10Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (f10Var.F.isEmpty()) {
                                a02 = org.telegram.ui.Components.vc.a0(f10Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.vc.a0(f10Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.y0.p(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                r00 r00Var = (r00) this.f34381b;
                ArrayList arrayList6 = r00Var.f36988d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    w00 w00Var2 = (w00) arrayList6.get(i22);
                    int i23 = w00Var2.f15531a;
                    if (i23 == 7) {
                        r00Var.dismiss();
                        r00Var.f30525n.presentFragment(new c00(r00Var.X, w00Var2.f38671m));
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
                x10 x10Var = (x10) this.f34381b;
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
                n70 n70Var = (n70) this.f34381b;
                if (n70Var.getParentActivity() != null) {
                    if (i10 != n70Var.f35905n && i10 != 0) {
                        if (i10 == n70Var.f35907s) {
                            if (n70Var.f35904f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", n70Var.f35904f.link);
                                    n70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == n70Var.f35906r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(n70Var.getParentActivity());
                            alertDialog$Builder3.f18435a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f18435a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new hu(n70Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            n70Var.showDialog(alertDialog$Builder3.f18435a);
                            return;
                        } else {
                            return;
                        }
                    } else if (n70Var.f35904f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", n70Var.f35904f.link));
                            org.telegram.ui.Components.vc.j(n70Var).j();
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
                t70.U((t70) this.f34381b, view, i10);
                return;
            case 14:
                l80.U((l80) this.f34381b, view, i10);
                return;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f34381b, view, i10);
                return;
            case 16:
                id0 id0Var = (id0) this.f34381b;
                id0Var.f34618i0 = -1L;
                int i24 = id0Var.G0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) id0Var.T.J(i10)) != null) {
                        if (id0Var.f34613e0 == 0) {
                            id0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            id0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(id0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = id0Var.getMessagesController().getInputChannel(-id0Var.f34613e0);
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
                        TLRPC.GeoPoint geoPoint2 = id0Var.f34640z0.geo_point;
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
                    if (id0Var.F0 != null && id0Var.f34637x0 != null) {
                        FrameLayout frameLayout = id0Var.f34624o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(id0Var.f34637x0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(id0Var.f34637x0.getLongitude());
                        id0Var.F0.b(tL_messageMediaGeo, id0Var.G0, true, 0, 0L);
                        id0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && id0Var.getLocationController().isSharingLocation(id0Var.f34613e0) && id0Var.T.j(i10) == 7) {
                    id0Var.getLocationController().removeSharingLocation(id0Var.f34613e0);
                    id0Var.T.l();
                    id0Var.finishFragment();
                    return;
                } else if (i24 == 2 && id0Var.getLocationController().isSharingLocation(id0Var.f34613e0) && id0Var.T.j(i10) == 6) {
                    if (id0Var.getLocationController().getSharingLocationInfo(id0Var.f34613e0).period == Integer.MAX_VALUE) {
                        z10 = false;
                    }
                    id0Var.s0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (id0Var.getLocationController().isSharingLocation(id0Var.f34613e0)) {
                        id0Var.getLocationController().removeSharingLocation(id0Var.f34613e0);
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
                        id0Var.f34618i0 = cd0Var.f32756a;
                        if (id0Var.f34619j0) {
                            id0Var.f34619j0 = false;
                            id0Var.C0();
                        }
                        id0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cd0Var.e.getPosition(), id0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((bj0) this.f34381b).onBackPressed();
                return;
            case 18:
                jj0 jj0Var = (jj0) this.f34381b;
                int i25 = jj0Var.I;
                if (i10 >= i25 && i10 < jj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) jj0Var.f34935x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!jj0Var.a0(messageObject2)) {
                            jj0Var.getOrCreateStoryViewer().F(jj0Var.getParentActivity(), messageObject2.storyItem, ai.u9.a(jj0Var.f34930f));
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
                    if (jj0Var.getMessagesController().checkCanOpenChat(bundle3, jj0Var)) {
                        jj0Var.presentFragment(new bo(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.f34381b, view, i10);
                return;
            case 20:
                zp0 zp0Var = (zp0) this.f34381b;
                zp0Var.a(i10, true);
                mp0 mp0Var = zp0Var.h;
                if (mp0Var != null) {
                    mp0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 21:
                ar0 ar0Var = (ar0) this.f34381b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = ar0Var.f31901f;
                ArrayList arrayList8 = ar0Var.f31909n;
                MediaController.AlbumEntry albumEntry = ar0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        fr0 fr0Var = ar0Var.f31918t0;
                        if (fr0Var != null) {
                            switch (fr0Var.f33662a) {
                                case 0:
                                    gr0.h0(fr0Var.f33663b, str);
                                    return;
                                default:
                                    gr0.h0(fr0Var.f33663b, str);
                                    return;
                            }
                        }
                        ar0Var.P.getSearchField().setText(str);
                        ar0Var.P.getSearchField().setSelection(str.length());
                        ar0Var.b0(ar0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ar0Var.getParentActivity());
                        alertDialog$Builder4.f18435a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f18435a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new nq0(ar0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder4.f18435a;
                        ar0Var.showDialog(b2Var3);
                        TextView textView3 = (TextView) b2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19071q7, false));
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
                    org.telegram.ui.ActionBar.v0 v0Var = ar0Var.P;
                    if (v0Var != null) {
                        AndroidUtilities.hideKeyboard(v0Var.getSearchField());
                    }
                    if (ar0Var.Y) {
                        ar0Var.a0(view, arrayList7.get(i10));
                        return;
                    }
                    int i26 = ar0Var.T;
                    if (i26 != 1 && i26 != 3) {
                        i16 = i26 == 2 ? 3 : i26 == 10 ? 10 : ar0Var.U == null ? 4 : 0;
                    }
                    PhotoViewer.t1().J2(null, ar0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = ar0Var.H;
                    boolean z18 = ar0Var.I;
                    t12.h = i27;
                    t12.f31010n = z18;
                    PhotoViewer.t1().f2(arrayList7, i10, i16, ar0Var.f31908l0, ar0Var.f31924x0, ar0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f34381b;
                ArrayList arrayList9 = photoViewer.f30958g7;
                if (!arrayList9.isEmpty() && (i14 = photoViewer.P4) >= 0 && i14 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f30991k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.A2(indexOf);
                }
                photoViewer.f30991k5 = false;
                return;
            case 23:
                a(i10, view);
                return;
            case 24:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f34381b, view, i10);
                return;
            case 25:
                jx0 jx0Var = (jx0) this.f34381b;
                PremiumPreviewFragment premiumPreviewFragment = jx0Var.f35009n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                gx0 gx0Var = jx0Var.e;
                if (view.isEnabled() && (view instanceof rg.p1)) {
                    rg.p1 p1Var = (rg.p1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(p1Var.getTier());
                    premiumPreviewFragment.t0(true);
                    p1Var.c(true, true);
                    for (int i28 = 0; i28 < gx0Var.getChildCount(); i28++) {
                        View childAt = gx0Var.getChildAt(i28);
                        if (childAt instanceof rg.p1) {
                            rg.p1 p1Var2 = (rg.p1) childAt;
                            if (p1Var2.getTier() != p1Var.getTier()) {
                                p1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < gx0Var.getHiddenChildCount(); i29++) {
                        View V = gx0Var.V(i29);
                        if (V instanceof rg.p1) {
                            rg.p1 p1Var3 = (rg.p1) V;
                            if (p1Var3.getTier() != p1Var.getTier()) {
                                p1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < gx0Var.getCachedChildCount(); i30++) {
                        View P = gx0Var.P(i30);
                        if (P instanceof rg.p1) {
                            rg.p1 p1Var4 = (rg.p1) P;
                            if (p1Var4.getTier() != p1Var.getTier()) {
                                p1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < gx0Var.getAttachedScrapChildCount(); i31++) {
                        View O = gx0Var.O(i31);
                        if (O instanceof rg.p1) {
                            rg.p1 p1Var5 = (rg.p1) O;
                            if (p1Var5.getTier() != p1Var.getTier()) {
                                p1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((lx0Var = premiumPreviewFragment.f31160f) == null || lx0Var.f35554a.months >= ((lx0) arrayList10.get(premiumPreviewFragment.e)).f35554a.months || premiumPreviewFragment.f31171p0)) {
                        z11 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z11);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f34381b, view, i10);
                return;
            case 27:
                b(i10, view);
                return;
            case 28:
                ProfileActivity.f0((ProfileActivity) this.f34381b, i10);
                return;
            default:
                ProxyListActivity.U((ProxyListActivity) this.f34381b, view, i10);
                return;
        }
    }
}
