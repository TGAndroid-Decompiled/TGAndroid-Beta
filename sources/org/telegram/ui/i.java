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
public final class i implements org.telegram.ui.Components.gm0 {
    public final int f38533a;
    public final Object f38534b;

    public i(Object obj, int i10) {
        this.f38533a = i10;
        this.f38534b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        zv0 zv0Var = (zv0) this.f38534b;
        boolean[] zArr = zv0Var.f45117w;
        if (i10 == zv0Var.f45107o0) {
            zv0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = zv0Var.L;
            org.telegram.ui.Components.qz0 qz0Var = zv0Var.Q;
            if (qz0Var != null) {
                qz0Var.f();
            }
            if (zv0Var.I) {
                int i11 = -zv0Var.O;
                zv0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == zv0Var.f45111r0) {
                z10 = !zv0Var.G;
                zv0Var.G = z10;
            } else {
                int i12 = zv0Var.f45115u0;
                if (i10 == i12) {
                    z10 = !zv0Var.H;
                    zv0Var.H = z10;
                } else if (i10 == zv0Var.f45116v0) {
                    boolean z12 = !zv0Var.J;
                    zv0Var.J = z12;
                    zv0Var.r0();
                    int i13 = zv0Var.f45115u0;
                    if (i13 >= 0 && i12 < 0) {
                        zv0Var.f45090b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        zv0Var.f45090b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == zv0Var.f45113s0) {
                    boolean z13 = zv0Var.K;
                    boolean z14 = !z13;
                    zv0Var.K = z14;
                    if (!z13 && zv0Var.L) {
                        int i14 = zv0Var.f45102j0;
                        zv0Var.L = false;
                        zv0Var.r0();
                        s4.d1 K = zv0Var.f45092c.K(zv0Var.f45114t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.w8) K.f47748a).setChecked(false);
                        } else {
                            zv0Var.f45090b.m(zv0Var.f45114t0);
                        }
                        zv0Var.f45090b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (zv0Var.N == 0) {
                    z10 = !zv0Var.L;
                    zv0Var.L = z10;
                    int i15 = zv0Var.f45102j0;
                    zv0Var.r0();
                    if (zv0Var.L) {
                        zv0Var.f45090b.s(zv0Var.f45102j0, 2);
                    } else {
                        zv0Var.f45090b.t(i15, 2);
                    }
                    if (zv0Var.L && zv0Var.K) {
                        zv0Var.K = false;
                        s4.d1 K2 = zv0Var.f45092c.K(zv0Var.f45113s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.w8) K2.f47748a).setChecked(false);
                        } else {
                            zv0Var.f45090b.m(zv0Var.f45113s0);
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
            zv0Var.f45092c.getChildCount();
            for (int i17 = zv0Var.f45106n0; i17 < zv0Var.f45106n0 + zv0Var.f45121y; i17++) {
                s4.d1 K3 = zv0Var.f45092c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f47748a;
                    if (view2 instanceof org.telegram.ui.Cells.d6) {
                        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view2;
                        d6Var.m(zv0Var.L, true);
                        d6Var.f21969r.a(zArr[i17 - zv0Var.f45106n0], z11);
                        if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == zv0Var.f45114t0 && !zv0Var.M) {
                            zv0Var.h.f(d6Var.getCheckBox(), true);
                            zv0Var.M = true;
                        }
                    }
                }
            }
            w8Var.setChecked(z10);
            zv0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        fy0 fy0Var = (fy0) this.f38534b;
        int i11 = fy0Var.f37814y;
        if (i10 == fy0Var.f37812w) {
            org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.N(fy0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new dy0(fy0Var), null).f20368a;
            a2Var.show();
            a2Var.h();
        } else if (i10 == fy0Var.f37808f) {
            if (i11 == 1) {
                ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
                m2Var.d = new Paint();
                m2Var.f39737f = new kv[2];
                m2Var.f39741w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                sy syVar = new sy(bundle);
                m2Var.f39733a = syVar;
                syVar.C2 = new iv(m2Var);
                syVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                m2Var.f39734b = contactsActivity;
                contactsActivity.W = new iv(m2Var);
                contactsActivity.onFragmentCreate();
                fy0Var.presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
                return;
            }
            Bundle i12 = a1.g.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            c70 c70Var = new c70(i12);
            c70Var.f36612w = new cy0(fy0Var);
            fy0Var.presentFragment(c70Var);
        } else if (i10 >= fy0Var.f37810r && i10 < fy0Var.f37811s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", fy0Var.getMessagesController().blockePeers.keyAt(i10 - fy0Var.f37810r));
                fy0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        xt xtVar;
        boolean[] zArr;
        v00 v00Var;
        org.telegram.ui.Components.ad a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        int i15;
        kx0 kx0Var;
        int i16 = 3;
        tt ttVar = null;
        boolean z10 = true;
        switch (this.f38533a) {
            case 0:
                l lVar = (l) this.f38534b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        lVar.f39459c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z12);
                        lVar.f39459c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.fa0 fa0Var = kcVar.f27922b;
                            fa0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.h6.Gi, 0, new mu0(lVar, 3)));
                            fa0Var.setSingleLine(false);
                            fa0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            kcVar.f27921a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.sc.g(lVar, kcVar, 3500).j();
                            int i18 = -lVar.f39460e;
                            lVar.f39460e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                        boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z13);
                        lVar.f39459c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                p pVar = (p) this.f38534b;
                if (i10 >= pVar.f40677x && i10 < pVar.f40678y && pVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) pVar.h.get(i10 - pVar.f40677x);
                    if (stickerSetCovered.set.f20059id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f20052id = stickerSetCovered.set.f20059id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.zy0 zy0Var = new org.telegram.ui.Components.zy0(pVar.getParentActivity(), pVar, inputStickerSet, null, null, null);
                    zy0Var.f33692c0 = new n(pVar, view, stickerSetCovered);
                    pVar.showDialog(zy0Var);
                    return;
                }
                return;
            case 2:
                yc ycVar = (yc) this.f38534b;
                ArrayList arrayList2 = ycVar.f44311c;
                ec1 ec1Var = ycVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.bq bqVar = (org.telegram.ui.Components.bq) arrayList2.get(i10);
                    ycVar.a(bqVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + ec1Var.getPaddingLeft()) {
                        ec1Var.v0(-((AndroidUtilities.dp(48.0f) + ec1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (ec1Var.getMeasuredWidth() - ec1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        ec1Var.v0(org.telegram.messenger.q.A(48.0f, ec1Var.getMeasuredWidth() - ec1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = ycVar.f44315r;
                    if (callback != null) {
                        callback.run(bqVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                up upVar = (up) this.f38534b;
                boolean z14 = upVar.f42741s;
                if (upVar.getParentActivity() != null) {
                    s4.i0 adapter = upVar.f42735b.getAdapter();
                    tp tpVar = upVar.f42737e;
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
                        bundle.putLong("chat_id", chat.f20032id);
                        upVar.presentFragment(new zn(bundle));
                        return;
                    } else if (i10 == upVar.F) {
                        if (z14 && upVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{upVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = upVar.f42738f;
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
                            alertDialog$Builder.f20368a.R = string;
                            alertDialog$Builder.f20368a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new y0(upVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                            upVar.showDialog(a2Var);
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, false));
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
                bq bqVar2 = (bq) this.f38534b;
                ArrayList arrayList3 = bqVar2.f36432r;
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
                    Switch r22 = yVar.f23741c;
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
                mt mtVar = (mt) this.f38534b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((pt) view).d;
                qt qtVar = mtVar.f40073a;
                zg.a0 reactionsWindow = qtVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f54550q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ez0.c(null, qtVar.f41235c0, qtVar.f41257z.getContext(), new a5(mtVar, 9));
                    return;
                }
                ot otVar = qtVar.f41244l;
                if (otVar != null) {
                    otVar.w(stickerSetCovered2.set, TextUtils.join("", qtVar.f41247o));
                }
                qtVar.p();
                return;
            case 6:
                yt ytVar = (yt) this.f38534b;
                if (ytVar.f44496f && ytVar.f44495e) {
                    wt wtVar = ytVar.d;
                    ArrayList arrayList4 = wtVar.f43872e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        ttVar = (tt) wtVar.f43872e.get(i10);
                    }
                } else {
                    int S = ytVar.f44494c.S(i10);
                    int Q = ytVar.f44494c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        ttVar = ytVar.f44494c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    ytVar.finishFragment();
                    if (ttVar != null && (xtVar = ytVar.f44498r) != null) {
                        xtVar.U0(ttVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                tu tuVar = (tu) this.f38534b;
                ArrayList arrayList5 = tuVar.f42266a3;
                xu xuVar = tuVar.f42277m3;
                if ((view instanceof mu) && i10 >= 0 && i10 < arrayList5.size()) {
                    ou ouVar = (ou) arrayList5.get(i10);
                    if (ouVar != null) {
                        int i20 = ouVar.h;
                        if (i20 >= 0) {
                            tuVar.f42272g3[i20] = !zArr[i20];
                            tuVar.B1(true);
                            return;
                        } else if (i20 == -2) {
                            xuVar.presentFragment(new DataAutoDownloadActivity(tuVar.W2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xuVar.getParentActivity());
                    alertDialog$Builder2.f20368a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f20368a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new pu(tuVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20368a;
                    xuVar.showDialog(a2Var2);
                    TextView textView2 = (TextView) a2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                b00.V((b00) this.f38534b, view, i10);
                return;
            case 9:
                e10 e10Var = (e10) this.f38534b;
                if (e10Var.getParentActivity() != null && (v00Var = (v00) e10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = v00Var.f42813c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = v00Var.f17175a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
                        e10Var.v0(v00Var, xaVar.getName(), xaVar.getCurrentObject(), v00Var.f42816g);
                        return;
                    } else if (i21 == 7) {
                        org.telegram.ui.Components.voip.i iVar = new org.telegram.ui.Components.voip.i(18, e10Var, v00Var);
                        if (e10Var.f37171c.isEnabled()) {
                            e10Var.s0(iVar, false);
                            return;
                        } else {
                            iVar.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && v00Var.f42819k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = e10Var.f37175r;
                        if (e10Var.f37176s && e10Var.f37171c.getAlpha() > 0.0f) {
                            float f7 = -e10Var.Q;
                            e10Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            e10Var.v = true;
                            jj jjVar = e10Var.R;
                            if (jjVar == null || jjVar.getVisibility() != 0) {
                                jj jjVar2 = new jj(6, 2, e10Var.getParentActivity(), null, true);
                                e10Var.R = jjVar2;
                                jjVar2.f24436a.setMaxWidth(AndroidUtilities.displaySize.x);
                                e10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                e10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                e10Var.getParentLayout().getOverlayContainerView().addView(e10Var.R, marginLayoutParams);
                                e10Var.R.f(e10Var.f37171c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(e10Var.f37177w) || !TextUtils.isEmpty(dialogFilter.name)) && (e10Var.f37179y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && e10Var.G.isEmpty() && !e10Var.F.isEmpty()) {
                            e10Var.s0(new f00(e10Var, 1), false);
                            return;
                        } else {
                            float f10 = -e10Var.Q;
                            e10Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(e10Var.f37177w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.ad.a0(e10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((e10Var.f37179y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!e10Var.G.isEmpty()) {
                                    a02 = org.telegram.ui.Components.ad.a0(e10Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.ad.a0(e10Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (e10Var.F.isEmpty()) {
                                a02 = org.telegram.ui.Components.ad.a0(e10Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.ad.a0(e10Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.ai.q(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                q00 q00Var = (q00) this.f38534b;
                ArrayList arrayList6 = q00Var.f41011d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    v00 v00Var2 = (v00) arrayList6.get(i22);
                    int i23 = v00Var2.f17175a;
                    if (i23 == 7) {
                        q00Var.dismiss();
                        q00Var.f25523n.presentFragment(new b00(q00Var.X, v00Var2.f42821m));
                        return;
                    } else if (i23 == 8) {
                        q00Var.R();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                v10 v10Var = (v10) this.f38534b;
                if (view instanceof org.telegram.ui.Cells.k7) {
                    v10Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    v10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    v10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    v10Var.f(i10, view, ((org.telegram.ui.Cells.f2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s2) {
                    v10Var.f(i10, view, ((org.telegram.ui.Cells.s2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 12:
                l70 l70Var = (l70) this.f38534b;
                if (l70Var.getParentActivity() != null) {
                    if (i10 != l70Var.f39534n && i10 != 0) {
                        if (i10 == l70Var.f39536s) {
                            if (l70Var.f39533f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", l70Var.f39533f.link);
                                    l70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == l70Var.f39535r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(l70Var.getParentActivity());
                            alertDialog$Builder3.f20368a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f20368a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new fu(l70Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            l70Var.showDialog(alertDialog$Builder3.f20368a);
                            return;
                        } else {
                            return;
                        }
                    } else if (l70Var.f39533f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", l70Var.f39533f.link));
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
                s70.U((s70) this.f38534b, view, i10);
                return;
            case 14:
                k80.U((k80) this.f38534b, view, i10);
                return;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f38534b, view, i10);
                return;
            case 16:
                gd0 gd0Var = (gd0) this.f38534b;
                gd0Var.f38026i0 = -1L;
                int i24 = gd0Var.G0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) gd0Var.T.J(i10)) != null) {
                        if (gd0Var.f38021e0 == 0) {
                            gd0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            gd0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(gd0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = gd0Var.getMessagesController().getInputChannel(-gd0Var.f38021e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        a2VarArr[0].setOnCancelListener(new ba(gd0Var, gd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new aa(gd0Var, a2VarArr, tL_messageMediaVenue, 19)), 7));
                        gd0Var.showDialog(a2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = gd0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = gd0Var.f38048z0.geo_point;
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
                    if (gd0Var.F0 != null && gd0Var.f38045x0 != null) {
                        FrameLayout frameLayout = gd0Var.f38032o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(gd0Var.f38045x0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(gd0Var.f38045x0.getLongitude());
                        gd0Var.F0.b(tL_messageMediaGeo, gd0Var.G0, true, 0, 0L);
                        gd0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && gd0Var.getLocationController().isSharingLocation(gd0Var.f38021e0) && gd0Var.T.j(i10) == 7) {
                    gd0Var.getLocationController().removeSharingLocation(gd0Var.f38021e0);
                    gd0Var.T.l();
                    gd0Var.finishFragment();
                    return;
                } else if (i24 == 2 && gd0Var.getLocationController().isSharingLocation(gd0Var.f38021e0) && gd0Var.T.j(i10) == 6) {
                    if (gd0Var.getLocationController().getSharingLocationInfo(gd0Var.f38021e0).period == Integer.MAX_VALUE) {
                        z10 = false;
                    }
                    gd0Var.r0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (gd0Var.getLocationController().isSharingLocation(gd0Var.f38021e0)) {
                        gd0Var.getLocationController().removeSharingLocation(gd0Var.f38021e0);
                        gd0Var.T.l();
                        gd0Var.finishFragment();
                        return;
                    }
                    gd0Var.r0(false);
                    return;
                } else {
                    Object J = gd0Var.T.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        gd0Var.F0.b((TLRPC.TL_messageMediaVenue) J, gd0Var.G0, true, 0, 0L);
                        gd0Var.finishFragment();
                        return;
                    } else if (J instanceof ad0) {
                        ad0 ad0Var = (ad0) J;
                        gd0Var.f38026i0 = ad0Var.f36039a;
                        if (gd0Var.f38027j0) {
                            gd0Var.f38027j0 = false;
                            gd0Var.B0();
                        }
                        gd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(ad0Var.f36042e.getPosition(), gd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((cj0) this.f38534b).onBackPressed();
                return;
            case 18:
                kj0 kj0Var = (kj0) this.f38534b;
                int i25 = kj0Var.I;
                if (i10 >= i25 && i10 < kj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) kj0Var.f39363x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!kj0Var.a0(messageObject2)) {
                            kj0Var.getOrCreateStoryViewer().F(kj0Var.getParentActivity(), messageObject2.storyItem, ai.v9.a(kj0Var.f39358f));
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
                    if (kj0Var.getMessagesController().checkCanOpenChat(bundle3, kj0Var)) {
                        kj0Var.presentFragment(new zn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.f38534b, view, i10);
                return;
            case 20:
                yp0 yp0Var = (yp0) this.f38534b;
                yp0Var.a(i10, true);
                lp0 lp0Var = yp0Var.h;
                if (lp0Var != null) {
                    lp0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 21:
                ar0 ar0Var = (ar0) this.f38534b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = ar0Var.f36142f;
                ArrayList arrayList8 = ar0Var.f36150n;
                MediaController.AlbumEntry albumEntry = ar0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        er0 er0Var = ar0Var.f36159t0;
                        if (er0Var != null) {
                            switch (er0Var.f37430a) {
                                case 0:
                                    fr0.h0(er0Var.f37431b, str);
                                    return;
                                default:
                                    fr0.h0(er0Var.f37431b, str);
                                    return;
                            }
                        }
                        ar0Var.P.getSearchField().setText(str);
                        ar0Var.P.getSearchField().setSelection(str.length());
                        ar0Var.b0(ar0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ar0Var.getParentActivity());
                        alertDialog$Builder4.f20368a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f20368a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new nq0(ar0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder4.f20368a;
                        ar0Var.showDialog(a2Var3);
                        TextView textView3 = (TextView) a2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, false));
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
                    org.telegram.ui.ActionBar.u0 u0Var = ar0Var.P;
                    if (u0Var != null) {
                        AndroidUtilities.hideKeyboard(u0Var.getSearchField());
                    }
                    if (ar0Var.Y) {
                        ar0Var.a0(view, arrayList7.get(i10));
                        return;
                    }
                    int i26 = ar0Var.T;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 != 2) {
                            i16 = 10;
                            if (i26 != 10) {
                                if (ar0Var.U == null) {
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
                    PhotoViewer.t1().K2(null, ar0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = ar0Var.H;
                    boolean z17 = ar0Var.I;
                    t12.h = i27;
                    t12.f34008n = z17;
                    PhotoViewer.t1().g2(arrayList7, i10, i14, ar0Var.f36149l0, ar0Var.f36165x0, ar0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f38534b;
                ArrayList arrayList9 = photoViewer.f33956g7;
                if (!arrayList9.isEmpty() && (i15 = photoViewer.P4) >= 0 && i15 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f33989k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.f33989k5 = false;
                return;
            case 23:
                a(i10, view);
                return;
            case 24:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f38534b, view, i10);
                return;
            case 25:
                ix0 ix0Var = (ix0) this.f38534b;
                PremiumPreviewFragment premiumPreviewFragment = ix0Var.f38799n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                fx0 fx0Var = ix0Var.f38797e;
                if (view.isEnabled() && (view instanceof rg.q1)) {
                    rg.q1 q1Var = (rg.q1) view;
                    premiumPreviewFragment.f34160e = arrayList10.indexOf(q1Var.getTier());
                    premiumPreviewFragment.t0(true);
                    q1Var.c(true, true);
                    for (int i28 = 0; i28 < fx0Var.getChildCount(); i28++) {
                        View childAt = fx0Var.getChildAt(i28);
                        if (childAt instanceof rg.q1) {
                            rg.q1 q1Var2 = (rg.q1) childAt;
                            if (q1Var2.getTier() != q1Var.getTier()) {
                                q1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < fx0Var.getHiddenChildCount(); i29++) {
                        View V = fx0Var.V(i29);
                        if (V instanceof rg.q1) {
                            rg.q1 q1Var3 = (rg.q1) V;
                            if (q1Var3.getTier() != q1Var.getTier()) {
                                q1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < fx0Var.getCachedChildCount(); i30++) {
                        View P = fx0Var.P(i30);
                        if (P instanceof rg.q1) {
                            rg.q1 q1Var4 = (rg.q1) P;
                            if (q1Var4.getTier() != q1Var.getTier()) {
                                q1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < fx0Var.getAttachedScrapChildCount(); i31++) {
                        View O = fx0Var.O(i31);
                        if (O instanceof rg.q1) {
                            rg.q1 q1Var5 = (rg.q1) O;
                            if (q1Var5.getTier() != q1Var.getTier()) {
                                q1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((kx0Var = premiumPreviewFragment.f34162f) == null || kx0Var.f39438a.months >= ((kx0) arrayList10.get(premiumPreviewFragment.f34160e)).f39438a.months || premiumPreviewFragment.f34173p0)) {
                        z10 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z10);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f38534b, view, i10);
                return;
            case 27:
                b(i10, view);
                return;
            case 28:
                ProfileActivity.f0((ProfileActivity) this.f38534b, i10);
                return;
            default:
                ProxyListActivity.U((ProxyListActivity) this.f38534b, view, i10);
                return;
        }
    }
}
