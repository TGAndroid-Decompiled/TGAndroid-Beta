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
public final class h implements org.telegram.ui.Components.am0 {
    public final int f39733a;
    public final Object f39734b;

    public h(Object obj, int i10) {
        this.f39733a = i10;
        this.f39734b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        ov0 ov0Var = (ov0) this.f39734b;
        boolean[] zArr = ov0Var.f42235w;
        if (i10 == ov0Var.f42225o0) {
            ov0Var.g0();
        } else if (view instanceof org.telegram.ui.Cells.a9) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            boolean z11 = ov0Var.L;
            org.telegram.ui.Components.uz0 uz0Var = ov0Var.Q;
            if (uz0Var != null) {
                uz0Var.f();
            }
            if (ov0Var.I) {
                int i11 = -ov0Var.O;
                ov0Var.O = i11;
                AndroidUtilities.shakeViewSpring(a9Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == ov0Var.f42229r0) {
                z10 = !ov0Var.G;
                ov0Var.G = z10;
            } else {
                int i12 = ov0Var.f42233u0;
                if (i10 == i12) {
                    z10 = !ov0Var.H;
                    ov0Var.H = z10;
                } else if (i10 == ov0Var.f42234v0) {
                    boolean z12 = !ov0Var.J;
                    ov0Var.J = z12;
                    ov0Var.s0();
                    int i13 = ov0Var.f42233u0;
                    if (i13 >= 0 && i12 < 0) {
                        ov0Var.f42209b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        ov0Var.f42209b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == ov0Var.f42231s0) {
                    boolean z13 = ov0Var.K;
                    boolean z14 = !z13;
                    ov0Var.K = z14;
                    if (!z13 && ov0Var.L) {
                        int i14 = ov0Var.f42220j0;
                        ov0Var.L = false;
                        ov0Var.s0();
                        s4.e1 K = ov0Var.f42211c.K(ov0Var.f42232t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.a9) K.f47773a).setChecked(false);
                        } else {
                            ov0Var.f42209b.m(ov0Var.f42232t0);
                        }
                        ov0Var.f42209b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (ov0Var.N == 0) {
                    z10 = !ov0Var.L;
                    ov0Var.L = z10;
                    int i15 = ov0Var.f42220j0;
                    ov0Var.s0();
                    if (ov0Var.L) {
                        ov0Var.f42209b.s(ov0Var.f42220j0, 2);
                    } else {
                        ov0Var.f42209b.t(i15, 2);
                    }
                    if (ov0Var.L && ov0Var.K) {
                        ov0Var.K = false;
                        s4.e1 K2 = ov0Var.f42211c.K(ov0Var.f42231s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.a9) K2.f47773a).setChecked(false);
                        } else {
                            ov0Var.f42209b.m(ov0Var.f42231s0);
                        }
                    }
                    if (ov0Var.L) {
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
            if (ov0Var.M && !ov0Var.L) {
                ov0Var.f42211c.getChildCount();
                ov0Var.h.b(true);
            }
            for (int i17 = ov0Var.f42224n0; i17 < ov0Var.f42224n0 + ov0Var.f42239y; i17++) {
                s4.e1 K3 = ov0Var.f42211c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f47773a;
                    if (view2 instanceof org.telegram.ui.Cells.h6) {
                        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view2;
                        h6Var.m(ov0Var.L, true);
                        h6Var.f24204r.a(zArr[i17 - ov0Var.f42224n0], z11);
                        if (h6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == ov0Var.f42232t0 && !ov0Var.M) {
                            ov0Var.h.f(h6Var.getCheckBox(), true);
                            ov0Var.M = true;
                        }
                    }
                }
            }
            a9Var.setChecked(z10);
            ov0Var.j0();
        }
    }

    private final void b(int i10, View view) {
        ux0 ux0Var = (ux0) this.f39734b;
        int i11 = ux0Var.f44139y;
        if (i10 == ux0Var.f44137w) {
            org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.N(ux0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new sx0(ux0Var), null).f22369a;
            e2Var.show();
            e2Var.i();
        } else if (i10 == ux0Var.f44133f) {
            if (i11 == 1) {
                ?? r2Var = new org.telegram.ui.ActionBar.r2(null);
                r2Var.d = new Paint();
                r2Var.f38108f = new av[2];
                r2Var.f38112w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                ey eyVar = new ey(bundle);
                r2Var.f38105a = eyVar;
                eyVar.C2 = new yu(r2Var);
                eyVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                r2Var.f38106b = contactsActivity;
                contactsActivity.U = new yu(r2Var);
                contactsActivity.onFragmentCreate();
                ux0Var.presentFragment((org.telegram.ui.ActionBar.r2) r2Var);
                return;
            }
            Bundle i12 = a1.g.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            t60 t60Var = new t60(i12);
            t60Var.f43524w = new rx0(ux0Var);
            ux0Var.presentFragment(t60Var);
        } else if (i10 >= ux0Var.f44135r && i10 < ux0Var.f44136s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", ux0Var.getMessagesController().blockePeers.keyAt(i10 - ux0Var.f44135r));
                ux0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        pt ptVar;
        boolean[] zArr;
        h00 h00Var;
        org.telegram.ui.Components.wc b02;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        zw0 zw0Var;
        char c10 = 3;
        lt ltVar = null;
        boolean z10 = false;
        r5 = false;
        r5 = false;
        boolean z11 = false;
        char c11 = 0;
        switch (this.f39733a) {
            case 0:
                k kVar = (k) this.f39734b;
                ArrayList arrayList = kVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i13 = ((i) arrayList.get(i10)).d;
                    if (i13 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z12 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z12;
                        ((org.telegram.ui.Cells.a9) view).setChecked(z12);
                        kVar.f40637c = true;
                        return;
                    } else if (i13 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z13 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z13;
                        ((org.telegram.ui.Cells.a9) view).setChecked(z13);
                        kVar.f40637c = true;
                        return;
                    } else if (i13 == 7) {
                        if (!kVar.getUserConfig().isPremium() && !kVar.getMessagesController().autoarchiveAvailable && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.aa0 aa0Var = icVar.f29300b;
                            aa0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.y6.Gi, 0, new bu0(kVar, 3)));
                            aa0Var.setSingleLine(false);
                            aa0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            icVar.f29299a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.qc.g(kVar, icVar, 3500).j();
                            int i14 = -kVar.e;
                            kVar.e = i14;
                            AndroidUtilities.shakeViewSpring(view, i14);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                        boolean z14 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z14;
                        ((org.telegram.ui.Cells.a9) view).setChecked(z14);
                        kVar.f40637c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                o oVar = (o) this.f39734b;
                if (i10 >= oVar.f41936x && i10 < oVar.f41937y && oVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.h.get(i10 - oVar.f41936x);
                    if (stickerSetCovered.set.f22055id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f22048id = stickerSetCovered.set.f22055id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    dz0Var.f27582c0 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(dz0Var);
                    return;
                }
                return;
            case 2:
                p4.V((p4) this.f39734b, i10);
                return;
            case 3:
                zc zcVar = (zc) this.f39734b;
                ArrayList arrayList2 = zcVar.f46220c;
                bb1 bb1Var = zcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList2.get(i10);
                    zcVar.a(ypVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + bb1Var.getPaddingLeft()) {
                        bb1Var.w0(-((AndroidUtilities.dp(48.0f) + bb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (bb1Var.getMeasuredWidth() - bb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        bb1Var.w0(org.telegram.messenger.t.B(48.0f, bb1Var.getMeasuredWidth() - bb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = zcVar.f46223r;
                    if (callback != null) {
                        callback.run(ypVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 4:
                pp ppVar = (pp) this.f39734b;
                boolean z15 = ppVar.f42470s;
                if (ppVar.getParentActivity() != null) {
                    s4.h0 adapter = ppVar.f42465b.getAdapter();
                    op opVar = ppVar.e;
                    if (adapter == opVar) {
                        chat = (TLRPC.Chat) opVar.d.get(i10);
                    } else {
                        int i15 = ppVar.G;
                        if (i10 >= i15 && i10 < ppVar.H) {
                            chat = (TLRPC.Chat) ppVar.v.get(i10 - i15);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z15 && ppVar.h.linked_chat_id == 0) {
                            ppVar.b0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f22028id);
                        ppVar.presentFragment(new wn(bundle));
                        return;
                    } else if (i10 == ppVar.F) {
                        if (z15 && ppVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{ppVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = ppVar.f42467f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            z60 z60Var = new z60(bundle2);
                            z60Var.Y = new gp(ppVar);
                            ppVar.presentFragment(z60Var);
                            return;
                        } else if (!ppVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) ppVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ppVar.getParentActivity());
                            if (z15) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.f22369a.R = string;
                            alertDialog$Builder.f22369a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new y0(ppVar, 24));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                            ppVar.showDialog(e2Var);
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
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
                xp xpVar = (xp) this.f39734b;
                ArrayList arrayList3 = xpVar.f45749n;
                if (i10 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - 3);
                    boolean contains = xpVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        xpVar.d.add(tL_availableReaction.reaction);
                    } else {
                        xpVar.d.remove(tL_availableReaction.reaction);
                        if (xpVar.d.isEmpty()) {
                            wp wpVar = xpVar.h;
                            if (wpVar != null) {
                                wpVar.t(2, arrayList3.size() + 1);
                            }
                            xpVar.W(2, true);
                        }
                    }
                    Switch r22 = xVar.f25680c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.aq aqVar = xVar.d;
                    if (aqVar != null) {
                        aqVar.a(z16, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                dt dtVar = (dt) this.f39734b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((gt) view).d;
                ht htVar = dtVar.f38675a;
                bh.i0 reactionsWindow = htVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f4060q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.iz0.c(null, htVar.f39966c0, htVar.f39987z.getContext(), new e5(dtVar, 9));
                    return;
                }
                ft ftVar = htVar.f39974l;
                if (ftVar != null) {
                    ftVar.v(stickerSetCovered2.set, TextUtils.join("", htVar.f39977o));
                }
                htVar.n();
                return;
            case 7:
                qt qtVar = (qt) this.f39734b;
                if (qtVar.f42785f && qtVar.e) {
                    ot otVar = qtVar.d;
                    ArrayList arrayList4 = otVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        ltVar = (lt) otVar.e.get(i10);
                    }
                } else {
                    int S = qtVar.f42784c.S(i10);
                    int Q = qtVar.f42784c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        ltVar = qtVar.f42784c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    qtVar.finishFragment();
                    if (ltVar != null && (ptVar = qtVar.f42787r) != null) {
                        ptVar.Y0(ltVar);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ju juVar = (ju) this.f39734b;
                ArrayList arrayList5 = juVar.f40601k3;
                nu nuVar = juVar.f40613w3;
                if ((view instanceof cu) && i10 >= 0 && i10 < arrayList5.size()) {
                    eu euVar = (eu) arrayList5.get(i10);
                    if (euVar != null) {
                        int i16 = euVar.h;
                        if (i16 >= 0) {
                            juVar.f40607q3[i16] = !zArr[i16];
                            juVar.G1(true);
                            return;
                        } else if (i16 == -2) {
                            nuVar.presentFragment(new DataAutoDownloadActivity(juVar.f40597g3 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.v8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(nuVar.getParentActivity());
                    alertDialog$Builder2.f22369a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f22369a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new fu(juVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
                    nuVar.showDialog(e2Var2);
                    TextView textView2 = (TextView) e2Var2.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23599q7, null);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                oz.W((oz) this.f39734b, view, i10);
                return;
            case 10:
                q00 q00Var = (q00) this.f39734b;
                if (q00Var.getParentActivity() != null && (h00Var = (h00) q00Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = h00Var.f39737c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i17 = h00Var.f47075a;
                    if (i17 == 1) {
                        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                        q00Var.x0(h00Var, abVar.getName(), abVar.getCurrentObject(), h00Var.f39739g);
                        return;
                    } else if (i17 == 7) {
                        kz kzVar = new kz(1, q00Var, h00Var);
                        if (q00Var.f42557c.f23139w.f19326f) {
                            q00Var.u0(kzVar, false);
                            return;
                        } else {
                            kzVar.run();
                            return;
                        }
                    } else if (i17 == 8 || (i17 == 4 && h00Var.f39742k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = q00Var.f42560r;
                        if (q00Var.f42561s && q00Var.f42557c.f23139w.f19326f) {
                            float f7 = -q00Var.Q;
                            q00Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            q00Var.v = true;
                            ej ejVar = q00Var.R;
                            if (ejVar == null || ejVar.getVisibility() != 0) {
                                ej ejVar2 = new ej(6, 2, q00Var.getParentActivity(), null, true);
                                q00Var.R = ejVar2;
                                ejVar2.f32834a.setMaxWidth(AndroidUtilities.displaySize.x);
                                q00Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                q00Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                q00Var.getParentLayout().getOverlayContainerView().addView(q00Var.R, marginLayoutParams);
                                q00Var.R.f(q00Var.f42557c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(q00Var.f42562w) || !TextUtils.isEmpty(dialogFilter.name)) && (q00Var.f42564y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && q00Var.G.isEmpty() && !q00Var.F.isEmpty()) {
                            q00Var.u0(new sz(q00Var, 1), false);
                            return;
                        } else {
                            float f10 = -q00Var.Q;
                            q00Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(q00Var.f42562w) && TextUtils.isEmpty(dialogFilter.name)) {
                                b02 = org.telegram.ui.Components.wc.b0(q00Var);
                                i11 = R.string.FilterInviteErrorEmptyName;
                            } else if ((q00Var.f42564y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!q00Var.G.isEmpty()) {
                                    b02 = org.telegram.ui.Components.wc.b0(q00Var);
                                    i11 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    b02 = org.telegram.ui.Components.wc.b0(q00Var);
                                    i11 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (q00Var.F.isEmpty()) {
                                b02 = org.telegram.ui.Components.wc.b0(q00Var);
                                i11 = R.string.FilterInviteErrorEmpty;
                            } else {
                                b02 = org.telegram.ui.Components.wc.b0(q00Var);
                                i11 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.wh.n(i11, b02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                d00 d00Var = (d00) this.f39734b;
                ArrayList arrayList6 = d00Var.f38485e0;
                int i18 = i10 - 1;
                if (i18 >= 0 && i18 < arrayList6.size()) {
                    h00 h00Var2 = (h00) arrayList6.get(i18);
                    int i19 = h00Var2.f47075a;
                    if (i19 == 7) {
                        d00Var.dismiss();
                        d00Var.f26793n.presentFragment(new oz(d00Var.Y, h00Var2.f39744m));
                        return;
                    } else if (i19 == 8) {
                        d00Var.Q();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                j10 j10Var = (j10) this.f39734b;
                if (view instanceof org.telegram.ui.Cells.o7) {
                    j10Var.f(i10, view, ((org.telegram.ui.Cells.o7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r7) {
                    j10Var.f(i10, view, ((org.telegram.ui.Cells.r7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    j10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    j10Var.f(i10, view, ((org.telegram.ui.Cells.d2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.p2) {
                    j10Var.f(i10, view, ((org.telegram.ui.Cells.p2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 13:
                b70 b70Var = (b70) this.f39734b;
                if (b70Var.getParentActivity() != null) {
                    if (i10 != b70Var.f37913n && i10 != 0) {
                        if (i10 == b70Var.f37915s) {
                            if (b70Var.f37912f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", b70Var.f37912f.link);
                                    b70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == b70Var.f37914r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(b70Var.getParentActivity());
                            alertDialog$Builder3.f22369a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f22369a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new st(b70Var, 13));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            b70Var.showDialog(alertDialog$Builder3.f22369a);
                            return;
                        } else {
                            return;
                        }
                    } else if (b70Var.f37912f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", b70Var.f37912f.link));
                            org.telegram.ui.Components.wc.j(b70Var).j();
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
                h70.V((h70) this.f39734b, view, i10);
                return;
            case 15:
                y70.V((y70) this.f39734b, view, i10);
                return;
            case 16:
                LanguageSelectActivity.V((LanguageSelectActivity) this.f39734b, view, i10);
                return;
            case 17:
                rc0 rc0Var = (rc0) this.f39734b;
                rc0Var.f42933i0 = -1L;
                int i20 = rc0Var.F0;
                if (i20 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) rc0Var.T.J(i10)) != null) {
                        if (rc0Var.f42928e0 == 0) {
                            rc0Var.E0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                            rc0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(rc0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = rc0Var.getMessagesController().getInputChannel(-rc0Var.f42928e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        e2VarArr[0].setOnCancelListener(new bi.f0(rc0Var, rc0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ea(rc0Var, e2VarArr, tL_messageMediaVenue, 19)), 8));
                        rc0Var.showDialog(e2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i20 == 5) {
                    IMapsProvider.IMap iMap = rc0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = rc0Var.f42954y0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), rc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = rc0Var.A0) != null && (!messageObject.isLiveLocation() || i20 == 6)) {
                    IMapsProvider.IMap iMap2 = rc0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = rc0Var.A0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), rc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i20 != 2) {
                    if (rc0Var.E0 != null && rc0Var.f42950w0 != null) {
                        FrameLayout frameLayout = rc0Var.f42939o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(rc0Var.f42950w0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(rc0Var.f42950w0.getLongitude());
                        rc0Var.E0.d(tL_messageMediaGeo, rc0Var.F0, true, 0, 0L);
                        rc0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i20 == 2 && rc0Var.getLocationController().isSharingLocation(rc0Var.f42928e0) && rc0Var.T.j(i10) == 7) {
                    rc0Var.getLocationController().removeSharingLocation(rc0Var.f42928e0);
                    rc0Var.T.l();
                    rc0Var.finishFragment();
                    return;
                } else if (i20 == 2 && rc0Var.getLocationController().isSharingLocation(rc0Var.f42928e0) && rc0Var.T.j(i10) == 6) {
                    if (rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42928e0).period != Integer.MAX_VALUE) {
                        z10 = true;
                    }
                    rc0Var.t0(z10);
                    return;
                } else if ((i10 == 2 && i20 == 1) || ((i10 == 1 && i20 == 2) || (i10 == 3 && i20 == 3))) {
                    if (rc0Var.getLocationController().isSharingLocation(rc0Var.f42928e0)) {
                        rc0Var.getLocationController().removeSharingLocation(rc0Var.f42928e0);
                        rc0Var.T.l();
                        rc0Var.finishFragment();
                        return;
                    }
                    rc0Var.t0(false);
                    return;
                } else {
                    Object J = rc0Var.T.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        rc0Var.E0.d((TLRPC.TL_messageMediaVenue) J, rc0Var.F0, true, 0, 0L);
                        rc0Var.finishFragment();
                        return;
                    } else if (J instanceof lc0) {
                        lc0 lc0Var = (lc0) J;
                        rc0Var.f42933i0 = lc0Var.f41074a;
                        if (rc0Var.f42934j0) {
                            rc0Var.f42934j0 = false;
                            rc0Var.D0();
                        }
                        rc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(lc0Var.e.getPosition(), rc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 18:
                ((pi0) this.f39734b).onBackPressed();
                return;
            case 19:
                xi0 xi0Var = (xi0) this.f39734b;
                int i21 = xi0Var.I;
                if (i10 >= i21 && i10 < xi0Var.J) {
                    MessageObject messageObject2 = (MessageObject) xi0Var.f45708x.get(i10 - i21);
                    if (messageObject2.isStory()) {
                        if (!xi0Var.c0(messageObject2)) {
                            xi0Var.getOrCreateStoryViewer().G(xi0Var.getParentActivity(), messageObject2.storyItem, di.q7.a(xi0Var.f45703f));
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
                    if (xi0Var.getMessagesController().checkCanOpenChat(bundle3, xi0Var)) {
                        xi0Var.presentFragment(new wn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 20:
                PasscodeActivity.W((PasscodeActivity) this.f39734b, view, i10);
                return;
            case 21:
                sp0 sp0Var = (sp0) this.f39734b;
                sp0Var.a(i10, true);
                fp0 fp0Var = sp0Var.h;
                if (fp0Var != null) {
                    fp0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 22:
                tq0 tq0Var = (tq0) this.f39734b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = tq0Var.f43736f;
                ArrayList arrayList8 = tq0Var.f43744n;
                MediaController.AlbumEntry albumEntry = tq0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        wq0 wq0Var = tq0Var.f43753t0;
                        if (wq0Var != null) {
                            switch (wq0Var.f45385a) {
                                case 0:
                                    xq0.i0(wq0Var.f45386b, str);
                                    return;
                                default:
                                    xq0.i0(wq0Var.f45386b, str);
                                    return;
                            }
                        }
                        tq0Var.P.getSearchField().setText(str);
                        tq0Var.P.getSearchField().setSelection(str.length());
                        tq0Var.c0(tq0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(tq0Var.getParentActivity());
                        alertDialog$Builder4.f22369a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f22369a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new gq0(tq0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder4.f22369a;
                        tq0Var.showDialog(e2Var3);
                        TextView textView3 = (TextView) e2Var3.d(-1);
                        if (textView3 != null) {
                            org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.f23599q7, null);
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
                    org.telegram.ui.ActionBar.w0 w0Var = tq0Var.P;
                    if (w0Var != null) {
                        AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                    }
                    if (tq0Var.Y) {
                        tq0Var.b0(view, arrayList7.get(i10));
                        return;
                    }
                    int i22 = tq0Var.T;
                    if (i22 != 1 && i22 != 3) {
                        if (i22 != 2) {
                            c10 = '\n';
                            if (i22 != 10) {
                                if (tq0Var.U == null) {
                                    c11 = 4;
                                }
                            }
                        }
                        c11 = c10;
                    } else {
                        c11 = 1;
                    }
                    PhotoViewer.v1().N2(null, tq0Var, null);
                    PhotoViewer v12 = PhotoViewer.v1();
                    int i23 = tq0Var.H;
                    boolean z17 = tq0Var.I;
                    v12.h = i23;
                    v12.f35747n = z17;
                    PhotoViewer.v1().j2(arrayList7, i10, c11, tq0Var.f43743l0, tq0Var.f43759x0, tq0Var.U);
                    return;
                }
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.f39734b;
                ArrayList arrayList9 = photoViewer.g7;
                if (!arrayList9.isEmpty() && (i12 = photoViewer.P4) >= 0 && i12 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.p1();
                    }
                }
                photoViewer.f35728k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.E2(indexOf);
                }
                photoViewer.f35728k5 = false;
                return;
            case 24:
                a(i10, view);
                return;
            case 25:
                PremiumPreviewFragment.V((PremiumPreviewFragment) this.f39734b, view, i10);
                return;
            case 26:
                xw0 xw0Var = (xw0) this.f39734b;
                PremiumPreviewFragment premiumPreviewFragment = xw0Var.f45792n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                uw0 uw0Var = xw0Var.e;
                if (view.isEnabled() && (view instanceof tg.r1)) {
                    tg.r1 r1Var = (tg.r1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(r1Var.getTier());
                    premiumPreviewFragment.u0(true);
                    r1Var.c(true, true);
                    for (int i24 = 0; i24 < uw0Var.getChildCount(); i24++) {
                        View childAt = uw0Var.getChildAt(i24);
                        if (childAt instanceof tg.r1) {
                            tg.r1 r1Var2 = (tg.r1) childAt;
                            if (r1Var2.getTier() != r1Var.getTier()) {
                                r1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i25 = 0; i25 < uw0Var.getHiddenChildCount(); i25++) {
                        View V = uw0Var.V(i25);
                        if (V instanceof tg.r1) {
                            tg.r1 r1Var3 = (tg.r1) V;
                            if (r1Var3.getTier() != r1Var.getTier()) {
                                r1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i26 = 0; i26 < uw0Var.getCachedChildCount(); i26++) {
                        View P = uw0Var.P(i26);
                        if (P instanceof tg.r1) {
                            tg.r1 r1Var4 = (tg.r1) P;
                            if (r1Var4.getTier() != r1Var.getTier()) {
                                r1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i27 = 0; i27 < uw0Var.getAttachedScrapChildCount(); i27++) {
                        View O = uw0Var.O(i27);
                        if (O instanceof tg.r1) {
                            tg.r1 r1Var5 = (tg.r1) O;
                            if (r1Var5.getTier() != r1Var.getTier()) {
                                r1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (!premiumPreviewFragment.getUserConfig().isPremium() || ((zw0Var = premiumPreviewFragment.f35897f) != null && zw0Var.f46395a.months < ((zw0) arrayList10.get(premiumPreviewFragment.e)).f46395a.months && !premiumPreviewFragment.f35908p0)) {
                        z11 = true;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z11);
                    return;
                }
                return;
            case 27:
                PrivacyControlActivity.Y((PrivacyControlActivity) this.f39734b, view, i10);
                return;
            case 28:
                b(i10, view);
                return;
            default:
                ProfileActivity.X((ProfileActivity) this.f39734b, i10);
                return;
        }
    }
}
