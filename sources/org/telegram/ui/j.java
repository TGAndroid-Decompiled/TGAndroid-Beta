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
public final class j implements org.telegram.ui.Components.il0 {
    public final int f37810a;
    public final Object f37811b;

    public j(Object obj, int i10) {
        this.f37810a = i10;
        this.f37811b = obj;
    }

    private final void a(int i10, View view) {
        boolean z4;
        mv0 mv0Var = (mv0) this.f37811b;
        boolean[] zArr = mv0Var.f39118w;
        if (i10 == mv0Var.f39105l0) {
            mv0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.s8) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            boolean z10 = mv0Var.I;
            org.telegram.ui.Components.qy0 qy0Var = mv0Var.N;
            if (qy0Var != null) {
                qy0Var.f();
            }
            if (mv0Var.F) {
                int i11 = -mv0Var.L;
                mv0Var.L = i11;
                AndroidUtilities.shakeViewSpring(s8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == mv0Var.f39108o0) {
                z4 = !mv0Var.D;
                mv0Var.D = z4;
            } else {
                int i12 = mv0Var.f39112r0;
                if (i10 == i12) {
                    z4 = !mv0Var.E;
                    mv0Var.E = z4;
                } else if (i10 == mv0Var.f39114s0) {
                    boolean z11 = !mv0Var.G;
                    mv0Var.G = z11;
                    mv0Var.r0();
                    int i13 = mv0Var.f39112r0;
                    if (i13 >= 0 && i12 < 0) {
                        mv0Var.f39091b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        mv0Var.f39091b.u(i12);
                    }
                    z4 = z11;
                } else if (i10 == mv0Var.f39109p0) {
                    boolean z12 = mv0Var.H;
                    boolean z13 = !z12;
                    mv0Var.H = z13;
                    if (!z12 && mv0Var.I) {
                        int i14 = mv0Var.f39100g0;
                        mv0Var.I = false;
                        mv0Var.r0();
                        f2.m1 K = mv0Var.f39093c.K(mv0Var.f39110q0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.s8) K.f5875a).setChecked(false);
                        } else {
                            mv0Var.f39091b.m(mv0Var.f39110q0);
                        }
                        mv0Var.f39091b.t(i14, 2);
                    }
                    z4 = z13;
                } else if (mv0Var.K == 0) {
                    z4 = !mv0Var.I;
                    mv0Var.I = z4;
                    int i15 = mv0Var.f39100g0;
                    mv0Var.r0();
                    if (mv0Var.I) {
                        mv0Var.f39091b.s(mv0Var.f39100g0, 2);
                    } else {
                        mv0Var.f39091b.t(i15, 2);
                    }
                    if (mv0Var.I && mv0Var.H) {
                        mv0Var.H = false;
                        f2.m1 K2 = mv0Var.f39093c.K(mv0Var.f39109p0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.s8) K2.f5875a).setChecked(false);
                        } else {
                            mv0Var.f39091b.m(mv0Var.f39109p0);
                        }
                    }
                    if (mv0Var.I) {
                        boolean z14 = false;
                        for (int i16 = 0; i16 < zArr.length; i16++) {
                            if (z14) {
                                zArr[i16] = false;
                            } else if (zArr[i16]) {
                                z14 = true;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            if (mv0Var.J && !mv0Var.I) {
                mv0Var.h.b(true);
            }
            mv0Var.f39093c.getChildCount();
            for (int i17 = mv0Var.f39104k0; i17 < mv0Var.f39104k0 + mv0Var.f39122y; i17++) {
                f2.m1 K3 = mv0Var.f39093c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f5875a;
                    if (view2 instanceof org.telegram.ui.Cells.c6) {
                        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view2;
                        c6Var.m(mv0Var.I, true);
                        c6Var.f22655r.a(zArr[i17 - mv0Var.f39104k0], z10);
                        if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == mv0Var.f39110q0 && !mv0Var.J) {
                            mv0Var.h.f(c6Var.getCheckBox(), true);
                            mv0Var.J = true;
                        }
                    }
                }
            }
            s8Var.setChecked(z4);
            mv0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        tx0 tx0Var = (tx0) this.f37811b;
        int i11 = tx0Var.f41659y;
        if (i10 == tx0Var.f41657w) {
            org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.O(tx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new rx0(tx0Var), null).f21168a;
            d2Var.show();
            d2Var.h();
        } else if (i10 == tx0Var.f41653f) {
            if (i11 == 1) {
                ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
                p2Var.d = new Paint();
                p2Var.f38788f = new kv[2];
                p2Var.f38792w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                py pyVar = new py(bundle);
                p2Var.f38784a = pyVar;
                pyVar.f40278z2 = new iv(p2Var);
                pyVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                p2Var.f38785b = contactsActivity;
                contactsActivity.T = new iv(p2Var);
                contactsActivity.onFragmentCreate();
                tx0Var.presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
                return;
            }
            Bundle i12 = android.support.v4.media.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            z60 z60Var = new z60(i12);
            z60Var.f43836w = new qx0(tx0Var);
            tx0Var.presentFragment(z60Var);
        } else if (i10 >= tx0Var.f41655r && i10 < tx0Var.f41656s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", tx0Var.getMessagesController().blockePeers.keyAt(i10 - tx0Var.f41655r));
                tx0Var.presentFragment(new ProfileActivity(bundle3, null));
                return;
            }
            new Bundle();
            throw null;
        }
    }

    @Override
    public final void f(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        int i11;
        int i12;
        yt ytVar;
        boolean[] zArr;
        s00 s00Var;
        org.telegram.ui.Components.qc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        xw0 xw0Var;
        int i15 = 3;
        tt ttVar = null;
        boolean z4 = true;
        r5 = true;
        boolean z10 = true;
        r5 = 1;
        int i16 = 1;
        switch (this.f37810a) {
            case 0:
                n nVar = (n) this.f37811b;
                ArrayList arrayList = nVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((l) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = nVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z11);
                        nVar.f39145c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = nVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z12);
                        nVar.f39145c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!nVar.getUserConfig().isPremium() && !nVar.getMessagesController().autoarchiveAvailable && !nVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(nVar.getParentActivity(), nVar.getResourceProvider());
                            org.telegram.ui.Components.g90 g90Var = acVar.f25211b;
                            g90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.k6.Gi, 0, new yt0(nVar, 3)));
                            g90Var.setSingleLine(false);
                            g90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            acVar.f25210a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.ic.g(nVar, acVar, 3500).j();
                            int i18 = -nVar.f39146e;
                            nVar.f39146e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = nVar.d;
                        boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z13);
                        nVar.f39145c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                r rVar = (r) this.f37811b;
                if (i10 >= rVar.f40731x && i10 < rVar.f40732y && rVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) rVar.h.get(i10 - rVar.f40731x);
                    if (stickerSetCovered.set.f20872id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f20865id = stickerSetCovered.set.f20872id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.xx0 xx0Var = new org.telegram.ui.Components.xx0(rVar.getParentActivity(), rVar, inputStickerSet, null, null, null);
                    xx0Var.Z = new p(rVar, view, stickerSetCovered);
                    rVar.showDialog(xx0Var);
                    return;
                }
                return;
            case 2:
                zc zcVar = (zc) this.f37811b;
                ArrayList arrayList2 = zcVar.f43893c;
                qb1 qb1Var = zcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList2.get(i10);
                    zcVar.a(lpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + qb1Var.getPaddingLeft()) {
                        qb1Var.v0(-((AndroidUtilities.dp(48.0f) + qb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (qb1Var.getMeasuredWidth() - qb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        qb1Var.v0(org.telegram.messenger.y3.z(48.0f, qb1Var.getMeasuredWidth() - qb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = zcVar.f43897r;
                    if (callback != null) {
                        callback.run(lpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                rp rpVar = (rp) this.f37811b;
                boolean z14 = rpVar.f40900s;
                if (rpVar.getParentActivity() != null) {
                    f2.p0 adapter = rpVar.f40894b.getAdapter();
                    qp qpVar = rpVar.f40896e;
                    if (adapter == qpVar) {
                        chat = (TLRPC.Chat) qpVar.d.get(i10);
                    } else {
                        int i19 = rpVar.D;
                        if (i10 >= i19 && i10 < rpVar.E) {
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
                        bundle.putLong("chat_id", chat.f20845id);
                        rpVar.presentFragment(new xn(bundle));
                        return;
                    } else if (i10 == rpVar.C) {
                        if (z14 && rpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{rpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = rpVar.f40897f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            f70 f70Var = new f70(bundle2);
                            f70Var.V = new ip(rpVar);
                            rpVar.presentFragment(f70Var);
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
                            alertDialog$Builder.f21168a.O = string;
                            alertDialog$Builder.f21168a.Q = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new a1(rpVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                            rpVar.showDialog(d2Var);
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
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
                yp ypVar = (yp) this.f37811b;
                ArrayList arrayList3 = ypVar.f43672r;
                boolean z15 = ypVar.D;
                if (z15) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                if (i10 > i11) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    if (z15) {
                        i15 = 2;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - i15);
                    boolean contains = ypVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        ypVar.d.add(tL_availableReaction.reaction);
                    } else {
                        ypVar.d.remove(tL_availableReaction.reaction);
                        if (ypVar.d.isEmpty()) {
                            xp xpVar = ypVar.h;
                            if (xpVar != null) {
                                if (ypVar.D) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                xpVar.t(i12, arrayList3.size() + 1);
                            }
                            ypVar.V(2, true);
                        }
                    }
                    Switch r22 = yVar.f24427c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.np npVar = yVar.d;
                    if (npVar != null) {
                        npVar.a(z16, true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                mt mtVar = (mt) this.f37811b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((pt) view).d;
                qt qtVar = mtVar.f39067a;
                ng.d0 reactionsWindow = qtVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f16049q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.dy0.c(null, qtVar.f40648c0, qtVar.f40670z.getContext(), new d5(mtVar, 9));
                    return;
                }
                ot otVar = qtVar.f40657l;
                if (otVar != null) {
                    otVar.u(stickerSetCovered2.set, TextUtils.join("", qtVar.f40660o));
                }
                qtVar.p();
                return;
            case 6:
                zt ztVar = (zt) this.f37811b;
                if (ztVar.f44020f && ztVar.f44019e) {
                    xt xtVar = ztVar.d;
                    ArrayList arrayList4 = xtVar.f43447e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        ttVar = (tt) xtVar.f43447e.get(i10);
                    }
                } else {
                    int S = ztVar.f44018c.S(i10);
                    int Q = ztVar.f44018c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        ttVar = ztVar.f44018c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    ztVar.finishFragment();
                    if (ttVar != null && (ytVar = ztVar.f44022r) != null) {
                        ytVar.V0(ttVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                uu uuVar = (uu) this.f37811b;
                ArrayList arrayList5 = uuVar.Z2;
                yu yuVar = uuVar.f41940l3;
                if ((view instanceof nu) && i10 >= 0 && i10 < arrayList5.size()) {
                    pu puVar = (pu) arrayList5.get(i10);
                    if (puVar != null) {
                        int i20 = puVar.h;
                        if (i20 >= 0) {
                            uuVar.f41934f3[i20] = !zArr[i20];
                            uuVar.z1(true);
                            return;
                        } else if (i20 == -2) {
                            yuVar.presentFragment(new DataAutoDownloadActivity(uuVar.V2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.o8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(yuVar.getParentActivity());
                    alertDialog$Builder2.f21168a.O = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f21168a.Q = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new qu(uuVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21168a;
                    yuVar.showDialog(d2Var2);
                    TextView textView2 = (TextView) d2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                zz.V((zz) this.f37811b, view, i10);
                return;
            case 9:
                b10 b10Var = (b10) this.f37811b;
                if (b10Var.getParentActivity() != null && (s00Var = (s00) b10Var.M.get(i10)) != null) {
                    View.OnClickListener onClickListener = s00Var.f40972c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = s00Var.f2505a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                        b10Var.v0(s00Var, vaVar.getName(), vaVar.getCurrentObject(), s00Var.f40975g);
                        return;
                    } else if (i21 == 7) {
                        org.telegram.ui.Components.q51 q51Var = new org.telegram.ui.Components.q51(24, b10Var, s00Var);
                        if (b10Var.f35306c.isEnabled()) {
                            b10Var.s0(q51Var, false);
                            return;
                        } else {
                            q51Var.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && s00Var.f40978k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = b10Var.f35310r;
                        if (b10Var.f35311s && b10Var.f35306c.getAlpha() > 0.0f) {
                            float f10 = -b10Var.N;
                            b10Var.N = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            b10Var.v = true;
                            ej ejVar = b10Var.O;
                            if (ejVar == null || ejVar.getVisibility() != 0) {
                                ej ejVar2 = new ej(6, 3, b10Var.getParentActivity(), null, true);
                                b10Var.O = ejVar2;
                                ejVar2.f28967a.setMaxWidth(AndroidUtilities.displaySize.x);
                                b10Var.O.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                b10Var.O.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                b10Var.getParentLayout().getOverlayContainerView().addView(b10Var.O, marginLayoutParams);
                                b10Var.O.f(b10Var.f35306c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(b10Var.f35312w) || !TextUtils.isEmpty(dialogFilter.name)) && (b10Var.f35314y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && b10Var.D.isEmpty() && !b10Var.C.isEmpty()) {
                            b10Var.s0(new d00(b10Var, 1), false);
                            return;
                        } else {
                            float f11 = -b10Var.N;
                            b10Var.N = f11;
                            AndroidUtilities.shakeViewSpring(view, f11);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(b10Var.f35312w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.qc.a0(b10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((b10Var.f35314y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!b10Var.D.isEmpty()) {
                                    a02 = org.telegram.ui.Components.qc.a0(b10Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.qc.a0(b10Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (b10Var.C.isEmpty()) {
                                a02 = org.telegram.ui.Components.qc.a0(b10Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.qc.a0(b10Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.y3.s(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                o00 o00Var = (o00) this.f37811b;
                ArrayList arrayList6 = o00Var.f39490a0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    s00 s00Var2 = (s00) arrayList6.get(i22);
                    int i23 = s00Var2.f2505a;
                    if (i23 == 7) {
                        o00Var.dismiss();
                        o00Var.f31017n.presentFragment(new zz(o00Var.U, s00Var2.f40980m));
                        return;
                    } else if (i23 == 8) {
                        o00Var.Q();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                t10 t10Var = (t10) this.f37811b;
                if (view instanceof org.telegram.ui.Cells.i7) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.l7) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.l7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.e2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r2) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.r2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 12:
                h70 h70Var = (h70) this.f37811b;
                if (h70Var.getParentActivity() != null) {
                    if (i10 != h70Var.f37238n && i10 != 0) {
                        if (i10 == h70Var.f37240s) {
                            if (h70Var.f37237f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", h70Var.f37237f.link);
                                    h70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == h70Var.f37239r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h70Var.getParentActivity());
                            alertDialog$Builder3.f21168a.Q = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f21168a.O = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new gu(h70Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            h70Var.showDialog(alertDialog$Builder3.f21168a);
                            return;
                        } else {
                            return;
                        }
                    } else if (h70Var.f37237f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", h70Var.f37237f.link));
                            org.telegram.ui.Components.qc.j(h70Var).j();
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
                n70.U((n70) this.f37811b, view, i10);
                return;
            case 14:
                d80.U((d80) this.f37811b, view, i10);
                return;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f37811b, view, i10);
                return;
            case 16:
                bd0 bd0Var = (bd0) this.f37811b;
                bd0Var.f35478f0 = -1L;
                int i24 = bd0Var.D0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) bd0Var.Q.J(i10)) != null) {
                        if (bd0Var.f35471b0 == 0) {
                            bd0Var.C0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                            bd0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(bd0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = bd0Var.getMessagesController().getInputChannel(-bd0Var.f35471b0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        d2VarArr[0].setOnCancelListener(new mh.v(bd0Var, bd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ba(bd0Var, d2VarArr, tL_messageMediaVenue, 19)), 8));
                        bd0Var.showDialog(d2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = bd0Var.F;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = bd0Var.f35498w0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), bd0Var.F.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = bd0Var.f35502y0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = bd0Var.F;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = bd0Var.f35502y0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), bd0Var.F.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i24 != 2) {
                    if (bd0Var.C0 != null && bd0Var.f35495u0 != null) {
                        FrameLayout frameLayout = bd0Var.f35484l0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(bd0Var.f35495u0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(bd0Var.f35495u0.getLongitude());
                        bd0Var.C0.d(tL_messageMediaGeo, bd0Var.D0, true, 0, 0L);
                        bd0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && bd0Var.getLocationController().isSharingLocation(bd0Var.f35471b0) && bd0Var.Q.j(i10) == 7) {
                    bd0Var.getLocationController().removeSharingLocation(bd0Var.f35471b0);
                    bd0Var.Q.l();
                    bd0Var.finishFragment();
                    return;
                } else if (i24 == 2 && bd0Var.getLocationController().isSharingLocation(bd0Var.f35471b0) && bd0Var.Q.j(i10) == 6) {
                    if (bd0Var.getLocationController().getSharingLocationInfo(bd0Var.f35471b0).period == Integer.MAX_VALUE) {
                        z4 = false;
                    }
                    bd0Var.s0(z4);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (bd0Var.getLocationController().isSharingLocation(bd0Var.f35471b0)) {
                        bd0Var.getLocationController().removeSharingLocation(bd0Var.f35471b0);
                        bd0Var.Q.l();
                        bd0Var.finishFragment();
                        return;
                    }
                    bd0Var.s0(false);
                    return;
                } else {
                    Object J = bd0Var.Q.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        bd0Var.C0.d((TLRPC.TL_messageMediaVenue) J, bd0Var.D0, true, 0, 0L);
                        bd0Var.finishFragment();
                        return;
                    } else if (J instanceof vc0) {
                        vc0 vc0Var = (vc0) J;
                        bd0Var.f35478f0 = vc0Var.f42083a;
                        if (bd0Var.f35479g0) {
                            bd0Var.f35479g0 = false;
                            bd0Var.C0();
                        }
                        bd0Var.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(vc0Var.f42086e.getPosition(), bd0Var.F.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((ti0) this.f37811b).onBackPressed();
                return;
            case 18:
                bj0 bj0Var = (bj0) this.f37811b;
                int i25 = bj0Var.F;
                if (i10 >= i25 && i10 < bj0Var.G) {
                    MessageObject messageObject2 = (MessageObject) bj0Var.f35555x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!bj0Var.a0(messageObject2)) {
                            bj0Var.getOrCreateStoryViewer().G(bj0Var.getParentActivity(), messageObject2.storyItem, oh.c7.a(bj0Var.f35550f));
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
                    if (bj0Var.getMessagesController().checkCanOpenChat(bundle3, bj0Var)) {
                        bj0Var.presentFragment(new xn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.f37811b, view, i10);
                return;
            case 20:
                mp0 mp0Var = (mp0) this.f37811b;
                mp0Var.a(i10, true);
                zo0 zo0Var = mp0Var.h;
                if (zo0Var != null) {
                    zo0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 21:
                mq0 mq0Var = (mq0) this.f37811b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = mq0Var.f39040f;
                ArrayList arrayList8 = mq0Var.f39048n;
                MediaController.AlbumEntry albumEntry = mq0Var.G;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        qq0 qq0Var = mq0Var.f39052q0;
                        if (qq0Var != null) {
                            switch (qq0Var.f40565a) {
                                case 0:
                                    rq0.h0(qq0Var.f40566b, str);
                                    return;
                                default:
                                    rq0.h0(qq0Var.f40566b, str);
                                    return;
                            }
                        }
                        mq0Var.M.getSearchField().setText(str);
                        mq0Var.M.getSearchField().setSelection(str.length());
                        mq0Var.b0(mq0Var.M.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(mq0Var.getParentActivity());
                        alertDialog$Builder4.f21168a.O = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f21168a.Q = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new aq0(mq0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder4.f21168a;
                        mq0Var.showDialog(d2Var3);
                        TextView textView3 = (TextView) d2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
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
                    org.telegram.ui.ActionBar.w0 w0Var = mq0Var.M;
                    if (w0Var != null) {
                        AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                    }
                    if (mq0Var.V) {
                        mq0Var.a0(view, arrayList7.get(i10));
                        return;
                    }
                    int i26 = mq0Var.Q;
                    if (i26 != 1 && i26 != 3) {
                        i16 = i26 == 2 ? 3 : i26 == 10 ? 10 : mq0Var.R == null ? 4 : 0;
                    }
                    PhotoViewer.t1().K2(null, mq0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = mq0Var.E;
                    boolean z17 = mq0Var.F;
                    t12.h = i27;
                    t12.f34337n = z17;
                    PhotoViewer.t1().f2(arrayList7, i10, i16, mq0Var.f39044i0, mq0Var.f39058u0, mq0Var.R);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f37811b;
                ArrayList arrayList9 = photoViewer.f34255d7;
                if (!arrayList9.isEmpty() && (i14 = photoViewer.M4) >= 0 && i14 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.M4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f34290h5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.M4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.f34290h5 = false;
                return;
            case 23:
                a(i10, view);
                return;
            case 24:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f37811b, view, i10);
                return;
            case 25:
                vw0 vw0Var = (vw0) this.f37811b;
                PremiumPreviewFragment premiumPreviewFragment = vw0Var.f42226n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                sw0 sw0Var = vw0Var.f42224e;
                if (view.isEnabled() && (view instanceof fg.j2)) {
                    fg.j2 j2Var = (fg.j2) view;
                    premiumPreviewFragment.f34487e = arrayList10.indexOf(j2Var.getTier());
                    premiumPreviewFragment.t0(true);
                    j2Var.c(true, true);
                    for (int i28 = 0; i28 < sw0Var.getChildCount(); i28++) {
                        View childAt = sw0Var.getChildAt(i28);
                        if (childAt instanceof fg.j2) {
                            fg.j2 j2Var2 = (fg.j2) childAt;
                            if (j2Var2.getTier() != j2Var.getTier()) {
                                j2Var2.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < sw0Var.getHiddenChildCount(); i29++) {
                        View V = sw0Var.V(i29);
                        if (V instanceof fg.j2) {
                            fg.j2 j2Var3 = (fg.j2) V;
                            if (j2Var3.getTier() != j2Var.getTier()) {
                                j2Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < sw0Var.getCachedChildCount(); i30++) {
                        View P = sw0Var.P(i30);
                        if (P instanceof fg.j2) {
                            fg.j2 j2Var4 = (fg.j2) P;
                            if (j2Var4.getTier() != j2Var.getTier()) {
                                j2Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < sw0Var.getAttachedScrapChildCount(); i31++) {
                        View O = sw0Var.O(i31);
                        if (O instanceof fg.j2) {
                            fg.j2 j2Var5 = (fg.j2) O;
                            if (j2Var5.getTier() != j2Var.getTier()) {
                                j2Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.G;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((xw0Var = premiumPreviewFragment.f34489f) == null || xw0Var.f43466a.months >= ((xw0) arrayList10.get(premiumPreviewFragment.f34487e)).f43466a.months || premiumPreviewFragment.m0)) {
                        z10 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z10);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f37811b, view, i10);
                return;
            case 27:
                b(i10, view);
                return;
            case 28:
                ProfileActivity.f0((ProfileActivity) this.f37811b, i10);
                return;
            default:
                ProxyListActivity.U((ProxyListActivity) this.f37811b, view, i10);
                return;
        }
    }
}
