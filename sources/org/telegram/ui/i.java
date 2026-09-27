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
    public final int f34309a;
    public final Object f34310b;

    public i(Object obj, int i10) {
        this.f34309a = i10;
        this.f34310b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        uv0 uv0Var = (uv0) this.f34310b;
        boolean[] zArr = uv0Var.f38365w;
        if (i10 == uv0Var.f38355o0) {
            uv0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = uv0Var.L;
            org.telegram.ui.Components.zy0 zy0Var = uv0Var.Q;
            if (zy0Var != null) {
                zy0Var.f();
            }
            if (uv0Var.I) {
                int i11 = -uv0Var.O;
                uv0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == uv0Var.f38359r0) {
                z10 = !uv0Var.G;
                uv0Var.G = z10;
            } else {
                int i12 = uv0Var.f38363u0;
                if (i10 == i12) {
                    z10 = !uv0Var.H;
                    uv0Var.H = z10;
                } else if (i10 == uv0Var.f38364v0) {
                    boolean z12 = !uv0Var.J;
                    uv0Var.J = z12;
                    uv0Var.r0();
                    int i13 = uv0Var.f38363u0;
                    if (i13 >= 0 && i12 < 0) {
                        uv0Var.f38339b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        uv0Var.f38339b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == uv0Var.f38361s0) {
                    boolean z13 = uv0Var.K;
                    boolean z14 = !z13;
                    uv0Var.K = z14;
                    if (!z13 && uv0Var.L) {
                        int i14 = uv0Var.f38350j0;
                        uv0Var.L = false;
                        uv0Var.r0();
                        s4.c1 L = uv0Var.f38341c.L(uv0Var.f38362t0);
                        if (L != null) {
                            ((org.telegram.ui.Cells.w8) L.f43005a).setChecked(false);
                        } else {
                            uv0Var.f38339b.m(uv0Var.f38362t0);
                        }
                        uv0Var.f38339b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (uv0Var.N == 0) {
                    z10 = !uv0Var.L;
                    uv0Var.L = z10;
                    int i15 = uv0Var.f38350j0;
                    uv0Var.r0();
                    if (uv0Var.L) {
                        uv0Var.f38339b.s(uv0Var.f38350j0, 2);
                    } else {
                        uv0Var.f38339b.t(i15, 2);
                    }
                    if (uv0Var.L && uv0Var.K) {
                        uv0Var.K = false;
                        s4.c1 L2 = uv0Var.f38341c.L(uv0Var.f38361s0);
                        if (L2 != null) {
                            ((org.telegram.ui.Cells.w8) L2.f43005a).setChecked(false);
                        } else {
                            uv0Var.f38339b.m(uv0Var.f38361s0);
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
            uv0Var.f38341c.getChildCount();
            for (int i17 = uv0Var.f38354n0; i17 < uv0Var.f38354n0 + uv0Var.f38369y; i17++) {
                s4.c1 L3 = uv0Var.f38341c.L(i17);
                if (L3 != null) {
                    View view2 = L3.f43005a;
                    if (view2 instanceof org.telegram.ui.Cells.d6) {
                        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view2;
                        d6Var.m(uv0Var.L, true);
                        d6Var.f20141r.a(zArr[i17 - uv0Var.f38354n0], z11);
                        if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == uv0Var.f38362t0 && !uv0Var.M) {
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
        ay0 ay0Var = (ay0) this.f34310b;
        int i11 = ay0Var.f32183y;
        if (i10 == ay0Var.f32181w) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.e5.O(ay0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new yx0(ay0Var), null).f18655a;
            c2Var.show();
            c2Var.h();
        } else if (i10 == ay0Var.f32177f) {
            if (i11 == 1) {
                ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
                o2Var.d = new Paint();
                o2Var.f35456f = new kv[2];
                o2Var.f35460w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                ty tyVar = new ty(bundle);
                o2Var.f35453a = tyVar;
                tyVar.C2 = new iv(o2Var);
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
                o2Var.f35454b = contactsActivity;
                contactsActivity.W = new iv(o2Var);
                contactsActivity.onFragmentCreate();
                ay0Var.presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
                return;
            }
            Bundle i12 = a4.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            c70 c70Var = new c70(i12);
            c70Var.f32562w = new xx0(ay0Var);
            ay0Var.presentFragment(c70Var);
        } else if (i10 >= ay0Var.f32179r && i10 < ay0Var.f32180s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", ay0Var.getMessagesController().blockePeers.keyAt(i10 - ay0Var.f32179r));
                ay0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        org.telegram.ui.Components.xc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        int i15;
        fx0 fx0Var;
        int i16 = 3;
        tt ttVar = null;
        boolean z10 = true;
        switch (this.f34309a) {
            case 0:
                l lVar = (l) this.f34310b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        lVar.f35207c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z12);
                        lVar.f35207c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.p90 p90Var = icVar.f25084b;
                            p90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.i6.Gi, 0, new hu0(lVar, 3)));
                            p90Var.setSingleLine(false);
                            p90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            icVar.f25083a.setImageResource(R.drawable.msg_settings_premium);
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
                        lVar.f35207c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                r rVar = (r) this.f34310b;
                if (i10 >= rVar.f36940x && i10 < rVar.f36941y && rVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) rVar.h.get(i10 - rVar.f36940x);
                    if (stickerSetCovered.set.f18356id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f18349id = stickerSetCovered.set.f18356id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.hy0 hy0Var = new org.telegram.ui.Components.hy0(rVar.getParentActivity(), rVar, inputStickerSet, null, null, null);
                    hy0Var.f24935c0 = new o(rVar, view, stickerSetCovered);
                    rVar.showDialog(hy0Var);
                    return;
                }
                return;
            case 2:
                ad adVar = (ad) this.f34310b;
                ArrayList arrayList2 = adVar.f32049c;
                wb1 wb1Var = adVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.np npVar = (org.telegram.ui.Components.np) arrayList2.get(i10);
                    adVar.a(npVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + wb1Var.getPaddingLeft()) {
                        wb1Var.w0(-((AndroidUtilities.dp(48.0f) + wb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (wb1Var.getMeasuredWidth() - wb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        wb1Var.w0(org.telegram.messenger.l0.A(48.0f, wb1Var.getMeasuredWidth() - wb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = adVar.f32052r;
                    if (callback != null) {
                        callback.run(npVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                sp spVar = (sp) this.f34310b;
                boolean z14 = spVar.f37546s;
                if (spVar.getParentActivity() != null) {
                    s4.h0 adapter = spVar.f37541b.getAdapter();
                    rp rpVar = spVar.e;
                    if (adapter == rpVar) {
                        chat = (TLRPC.Chat) rpVar.d.get(i10);
                    } else {
                        int i19 = spVar.G;
                        if (i10 >= i19 && i10 < spVar.H) {
                            chat = (TLRPC.Chat) spVar.v.get(i10 - i19);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z14 && spVar.h.linked_chat_id == 0) {
                            spVar.a0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f18329id);
                        spVar.presentFragment(new xn(bundle));
                        return;
                    } else if (i10 == spVar.F) {
                        if (z14 && spVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{spVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = spVar.f37543f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            j70 j70Var = new j70(bundle2);
                            j70Var.Y = new kp(spVar);
                            spVar.presentFragment(j70Var);
                            return;
                        } else if (!spVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) spVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(spVar.getParentActivity());
                            if (z14) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.f18655a.R = string;
                            alertDialog$Builder.f18655a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new a1(spVar, 24));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                            spVar.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
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
                zp zpVar = (zp) this.f34310b;
                ArrayList arrayList3 = zpVar.f40568r;
                boolean z15 = zpVar.G;
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
                    boolean contains = zpVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        zpVar.d.add(tL_availableReaction.reaction);
                    } else {
                        zpVar.d.remove(tL_availableReaction.reaction);
                        if (zpVar.d.isEmpty()) {
                            yp ypVar = zpVar.h;
                            if (ypVar != null) {
                                if (zpVar.G) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                ypVar.t(i12, arrayList3.size() + 1);
                            }
                            zpVar.V(2, true);
                        }
                    }
                    Switch r22 = yVar.f21863c;
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
                mt mtVar = (mt) this.f34310b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((pt) view).d;
                qt qtVar = mtVar.f35750a;
                zg.c0 reactionsWindow = qtVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f49312q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ny0.c(null, qtVar.f36888c0, qtVar.f36909z.getContext(), new d5(mtVar, 9));
                    return;
                }
                ot otVar = qtVar.f36896l;
                if (otVar != null) {
                    otVar.w(stickerSetCovered2.set, TextUtils.join("", qtVar.f36899o));
                }
                qtVar.p();
                return;
            case 6:
                yt ytVar = (yt) this.f34310b;
                if (ytVar.f40319f && ytVar.e) {
                    wt wtVar = ytVar.d;
                    ArrayList arrayList4 = wtVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        ttVar = (tt) wtVar.e.get(i10);
                    }
                } else {
                    int S = ytVar.f40318c.S(i10);
                    int Q = ytVar.f40318c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        ttVar = ytVar.f40318c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    ytVar.finishFragment();
                    if (ttVar != null && (xtVar = ytVar.f40321r) != null) {
                        xtVar.a1(ttVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                tu tuVar = (tu) this.f34310b;
                ArrayList arrayList5 = tuVar.f37917c3;
                xu xuVar = tuVar.f37928o3;
                if ((view instanceof mu) && i10 >= 0 && i10 < arrayList5.size()) {
                    ou ouVar = (ou) arrayList5.get(i10);
                    if (ouVar != null) {
                        int i20 = ouVar.h;
                        if (i20 >= 0) {
                            tuVar.f37923i3[i20] = !zArr[i20];
                            tuVar.B1(true);
                            return;
                        } else if (i20 == -2) {
                            xuVar.presentFragment(new DataAutoDownloadActivity(tuVar.Y2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xuVar.getParentActivity());
                    alertDialog$Builder2.f18655a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f18655a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new pu(tuVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f18655a;
                    xuVar.showDialog(c2Var2);
                    TextView textView2 = (TextView) c2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                b00.V((b00) this.f34310b, view, i10);
                return;
            case 9:
                e10 e10Var = (e10) this.f34310b;
                if (e10Var.getParentActivity() != null && (v00Var = (v00) e10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = v00Var.f38397c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = v00Var.f15754a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                        e10Var.v0(v00Var, zaVar.getName(), zaVar.getCurrentObject(), v00Var.f38399g);
                        return;
                    } else if (i21 == 7) {
                        tv tvVar = new tv(9, e10Var, v00Var);
                        if (e10Var.f33090c.isEnabled()) {
                            e10Var.s0(tvVar, false);
                            return;
                        } else {
                            tvVar.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && v00Var.f38402k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = e10Var.f33093r;
                        if (e10Var.f33094s && e10Var.f33090c.getAlpha() > 0.0f) {
                            float f7 = -e10Var.Q;
                            e10Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            e10Var.v = true;
                            hj hjVar = e10Var.R;
                            if (hjVar == null || hjVar.getVisibility() != 0) {
                                hj hjVar2 = new hj(6, 2, e10Var.getParentActivity(), null, true);
                                e10Var.R = hjVar2;
                                hjVar2.f25933a.setMaxWidth(AndroidUtilities.displaySize.x);
                                e10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                e10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                e10Var.getParentLayout().getOverlayContainerView().addView(e10Var.R, marginLayoutParams);
                                e10Var.R.f(e10Var.f33090c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(e10Var.f33095w) || !TextUtils.isEmpty(dialogFilter.name)) && (e10Var.f33097y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && e10Var.G.isEmpty() && !e10Var.F.isEmpty()) {
                            e10Var.s0(new f00(e10Var, 1), false);
                            return;
                        } else {
                            float f10 = -e10Var.Q;
                            e10Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(e10Var.f33095w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.xc.a0(e10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((e10Var.f33097y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!e10Var.G.isEmpty()) {
                                    a02 = org.telegram.ui.Components.xc.a0(e10Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.xc.a0(e10Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (e10Var.F.isEmpty()) {
                                a02 = org.telegram.ui.Components.xc.a0(e10Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.xc.a0(e10Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.qk.p(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                q00 q00Var = (q00) this.f34310b;
                ArrayList arrayList6 = q00Var.f36595d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    v00 v00Var2 = (v00) arrayList6.get(i22);
                    int i23 = v00Var2.f15754a;
                    if (i23 == 7) {
                        q00Var.dismiss();
                        q00Var.f22964n.presentFragment(new b00(q00Var.X, v00Var2.f38404m));
                        return;
                    } else if (i23 == 8) {
                        q00Var.Q();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                w10 w10Var = (w10) this.f34310b;
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
                l70 l70Var = (l70) this.f34310b;
                if (l70Var.getParentActivity() != null) {
                    if (i10 != l70Var.f35269n && i10 != 0) {
                        if (i10 == l70Var.f35271s) {
                            if (l70Var.f35268f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", l70Var.f35268f.link);
                                    l70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == l70Var.f35270r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(l70Var.getParentActivity());
                            alertDialog$Builder3.f18655a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f18655a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new au(l70Var, 14));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            l70Var.showDialog(alertDialog$Builder3.f18655a);
                            return;
                        } else {
                            return;
                        }
                    } else if (l70Var.f35268f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", l70Var.f35268f.link));
                            org.telegram.ui.Components.xc.j(l70Var).j();
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
                r70.U((r70) this.f34310b, view, i10);
                return;
            case 14:
                j80.U((j80) this.f34310b, view, i10);
                return;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f34310b, view, i10);
                return;
            case 16:
                fd0 fd0Var = (fd0) this.f34310b;
                fd0Var.f33498i0 = -1L;
                int i24 = fd0Var.G0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) fd0Var.T.J(i10)) != null) {
                        if (fd0Var.f33493e0 == 0) {
                            fd0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            fd0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(fd0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = fd0Var.getMessagesController().getInputChannel(-fd0Var.f33493e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        c2VarArr[0].setOnCancelListener(new ea(fd0Var, fd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new da(fd0Var, c2VarArr, tL_messageMediaVenue, 19)), 7));
                        fd0Var.showDialog(c2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = fd0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = fd0Var.f33520z0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), fd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = fd0Var.B0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = fd0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = fd0Var.B0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), fd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i24 != 2) {
                    if (fd0Var.F0 != null && fd0Var.f33517x0 != null) {
                        FrameLayout frameLayout = fd0Var.f33504o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(fd0Var.f33517x0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(fd0Var.f33517x0.getLongitude());
                        fd0Var.F0.b(tL_messageMediaGeo, fd0Var.G0, true, 0, 0L);
                        fd0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && fd0Var.getLocationController().isSharingLocation(fd0Var.f33493e0) && fd0Var.T.j(i10) == 7) {
                    fd0Var.getLocationController().removeSharingLocation(fd0Var.f33493e0);
                    fd0Var.T.l();
                    fd0Var.finishFragment();
                    return;
                } else if (i24 == 2 && fd0Var.getLocationController().isSharingLocation(fd0Var.f33493e0) && fd0Var.T.j(i10) == 6) {
                    if (fd0Var.getLocationController().getSharingLocationInfo(fd0Var.f33493e0).period == Integer.MAX_VALUE) {
                        z10 = false;
                    }
                    fd0Var.s0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (fd0Var.getLocationController().isSharingLocation(fd0Var.f33493e0)) {
                        fd0Var.getLocationController().removeSharingLocation(fd0Var.f33493e0);
                        fd0Var.T.l();
                        fd0Var.finishFragment();
                        return;
                    }
                    fd0Var.s0(false);
                    return;
                } else {
                    Object J = fd0Var.T.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        fd0Var.F0.b((TLRPC.TL_messageMediaVenue) J, fd0Var.G0, true, 0, 0L);
                        fd0Var.finishFragment();
                        return;
                    } else if (J instanceof zc0) {
                        zc0 zc0Var = (zc0) J;
                        fd0Var.f33498i0 = zc0Var.f40465a;
                        if (fd0Var.f33499j0) {
                            fd0Var.f33499j0 = false;
                            fd0Var.C0();
                        }
                        fd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(zc0Var.e.getPosition(), fd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((yi0) this.f34310b).onBackPressed();
                return;
            case 18:
                gj0 gj0Var = (gj0) this.f34310b;
                int i25 = gj0Var.I;
                if (i10 >= i25 && i10 < gj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) gj0Var.f33967x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!gj0Var.a0(messageObject2)) {
                            gj0Var.getOrCreateStoryViewer().F(gj0Var.getParentActivity(), messageObject2.storyItem, ai.u9.a(gj0Var.f33962f));
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
                    if (gj0Var.getMessagesController().checkCanOpenChat(bundle3, gj0Var)) {
                        gj0Var.presentFragment(new xn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.f34310b, view, i10);
                return;
            case 20:
                vp0 vp0Var = (vp0) this.f34310b;
                vp0Var.a(i10, true);
                ip0 ip0Var = vp0Var.h;
                if (ip0Var != null) {
                    ip0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 21:
                wq0 wq0Var = (wq0) this.f34310b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = wq0Var.f39419f;
                ArrayList arrayList8 = wq0Var.f39427n;
                MediaController.AlbumEntry albumEntry = wq0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        ar0 ar0Var = wq0Var.f39436t0;
                        if (ar0Var != null) {
                            switch (ar0Var.f32129a) {
                                case 0:
                                    br0.h0(ar0Var.f32130b, str);
                                    return;
                                default:
                                    br0.h0(ar0Var.f32130b, str);
                                    return;
                            }
                        }
                        wq0Var.P.getSearchField().setText(str);
                        wq0Var.P.getSearchField().setSelection(str.length());
                        wq0Var.b0(wq0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wq0Var.getParentActivity());
                        alertDialog$Builder4.f18655a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f18655a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new jq0(wq0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder4.f18655a;
                        wq0Var.showDialog(c2Var3);
                        TextView textView3 = (TextView) c2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
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
                    org.telegram.ui.ActionBar.w0 w0Var = wq0Var.P;
                    if (w0Var != null) {
                        AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                    }
                    if (wq0Var.Y) {
                        wq0Var.a0(view, arrayList7.get(i10));
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
                    PhotoViewer.t1().J2(null, wq0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = wq0Var.H;
                    boolean z17 = wq0Var.I;
                    t12.h = i27;
                    t12.f31301n = z17;
                    PhotoViewer.t1().f2(arrayList7, i10, i14, wq0Var.f39426l0, wq0Var.f39442x0, wq0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f34310b;
                ArrayList arrayList9 = photoViewer.f31249g7;
                if (!arrayList9.isEmpty() && (i15 = photoViewer.P4) >= 0 && i15 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f31282k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.A2(indexOf);
                }
                photoViewer.f31282k5 = false;
                return;
            case 23:
                a(i10, view);
                return;
            case 24:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f34310b, view, i10);
                return;
            case 25:
                dx0 dx0Var = (dx0) this.f34310b;
                PremiumPreviewFragment premiumPreviewFragment = dx0Var.f33062n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                ax0 ax0Var = dx0Var.e;
                if (view.isEnabled() && (view instanceof rg.p1)) {
                    rg.p1 p1Var = (rg.p1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(p1Var.getTier());
                    premiumPreviewFragment.t0(true);
                    p1Var.c(true, true);
                    for (int i28 = 0; i28 < ax0Var.getChildCount(); i28++) {
                        View childAt = ax0Var.getChildAt(i28);
                        if (childAt instanceof rg.p1) {
                            rg.p1 p1Var2 = (rg.p1) childAt;
                            if (p1Var2.getTier() != p1Var.getTier()) {
                                p1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < ax0Var.getHiddenChildCount(); i29++) {
                        View W = ax0Var.W(i29);
                        if (W instanceof rg.p1) {
                            rg.p1 p1Var3 = (rg.p1) W;
                            if (p1Var3.getTier() != p1Var.getTier()) {
                                p1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < ax0Var.getCachedChildCount(); i30++) {
                        View Q2 = ax0Var.Q(i30);
                        if (Q2 instanceof rg.p1) {
                            rg.p1 p1Var4 = (rg.p1) Q2;
                            if (p1Var4.getTier() != p1Var.getTier()) {
                                p1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < ax0Var.getAttachedScrapChildCount(); i31++) {
                        View P = ax0Var.P(i31);
                        if (P instanceof rg.p1) {
                            rg.p1 p1Var5 = (rg.p1) P;
                            if (p1Var5.getTier() != p1Var.getTier()) {
                                p1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((fx0Var = premiumPreviewFragment.f31451f) == null || fx0Var.f33649a.months >= ((fx0) arrayList10.get(premiumPreviewFragment.e)).f33649a.months || premiumPreviewFragment.f31462p0)) {
                        z10 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z10);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f34310b, view, i10);
                return;
            case 27:
                b(i10, view);
                return;
            case 28:
                ProfileActivity.f0((ProfileActivity) this.f34310b, i10);
                return;
            default:
                ProxyListActivity.U((ProxyListActivity) this.f34310b, view, i10);
                return;
        }
    }
}
