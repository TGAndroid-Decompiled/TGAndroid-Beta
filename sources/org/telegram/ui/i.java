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
public final class i implements org.telegram.ui.Components.al0 {
    public final int f33951a;
    public final Object f33952b;

    public i(Object obj, int i10) {
        this.f33951a = i10;
        this.f33952b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        tv0 tv0Var = (tv0) this.f33952b;
        boolean[] zArr = tv0Var.f37795w;
        if (i10 == tv0Var.f37785o0) {
            tv0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.x8) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            boolean z11 = tv0Var.L;
            org.telegram.ui.Components.my0 my0Var = tv0Var.Q;
            if (my0Var != null) {
                my0Var.f();
            }
            if (tv0Var.I) {
                int i11 = -tv0Var.O;
                tv0Var.O = i11;
                AndroidUtilities.shakeViewSpring(x8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == tv0Var.f37789r0) {
                z10 = !tv0Var.G;
                tv0Var.G = z10;
            } else {
                int i12 = tv0Var.f37793u0;
                if (i10 == i12) {
                    z10 = !tv0Var.H;
                    tv0Var.H = z10;
                } else if (i10 == tv0Var.f37794v0) {
                    boolean z12 = !tv0Var.J;
                    tv0Var.J = z12;
                    tv0Var.r0();
                    int i13 = tv0Var.f37793u0;
                    if (i13 >= 0 && i12 < 0) {
                        tv0Var.f37769b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        tv0Var.f37769b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == tv0Var.f37791s0) {
                    boolean z13 = tv0Var.K;
                    boolean z14 = !z13;
                    tv0Var.K = z14;
                    if (!z13 && tv0Var.L) {
                        int i14 = tv0Var.f37780j0;
                        tv0Var.L = false;
                        tv0Var.r0();
                        s4.c1 K = tv0Var.f37771c.K(tv0Var.f37792t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.x8) K.f42627a).setChecked(false);
                        } else {
                            tv0Var.f37769b.m(tv0Var.f37792t0);
                        }
                        tv0Var.f37769b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (tv0Var.N == 0) {
                    z10 = !tv0Var.L;
                    tv0Var.L = z10;
                    int i15 = tv0Var.f37780j0;
                    tv0Var.r0();
                    if (tv0Var.L) {
                        tv0Var.f37769b.s(tv0Var.f37780j0, 2);
                    } else {
                        tv0Var.f37769b.t(i15, 2);
                    }
                    if (tv0Var.L && tv0Var.K) {
                        tv0Var.K = false;
                        s4.c1 K2 = tv0Var.f37771c.K(tv0Var.f37791s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.x8) K2.f42627a).setChecked(false);
                        } else {
                            tv0Var.f37769b.m(tv0Var.f37791s0);
                        }
                    }
                    if (tv0Var.L) {
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
            if (tv0Var.M && !tv0Var.L) {
                tv0Var.h.b(true);
            }
            tv0Var.f37771c.getChildCount();
            for (int i17 = tv0Var.f37784n0; i17 < tv0Var.f37784n0 + tv0Var.f37799y; i17++) {
                s4.c1 K3 = tv0Var.f37771c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f42627a;
                    if (view2 instanceof org.telegram.ui.Cells.d6) {
                        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view2;
                        d6Var.m(tv0Var.L, true);
                        d6Var.f19866r.a(zArr[i17 - tv0Var.f37784n0], z11);
                        if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == tv0Var.f37792t0 && !tv0Var.M) {
                            tv0Var.h.f(d6Var.getCheckBox(), true);
                            tv0Var.M = true;
                        }
                    }
                }
            }
            x8Var.setChecked(z10);
            tv0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        zx0 zx0Var = (zx0) this.f33952b;
        int i11 = zx0Var.f40273y;
        if (i10 == zx0Var.f40271w) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.O(zx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new xx0(zx0Var), null).f18409a;
            b2Var.show();
            b2Var.h();
        } else if (i10 == zx0Var.f40267f) {
            if (i11 == 1) {
                ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                n2Var.d = new Paint();
                n2Var.f34806f = new jv[2];
                n2Var.f34810w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                ry ryVar = new ry(bundle);
                n2Var.f34803a = ryVar;
                ryVar.C2 = new hv(n2Var);
                ryVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                n2Var.f34804b = contactsActivity;
                contactsActivity.W = new hv(n2Var);
                contactsActivity.onFragmentCreate();
                zx0Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                return;
            }
            Bundle i12 = a4.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            b70 b70Var = new b70(i12);
            b70Var.f32010w = new wx0(zx0Var);
            zx0Var.presentFragment(b70Var);
        } else if (i10 >= zx0Var.f40269r && i10 < zx0Var.f40270s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", zx0Var.getMessagesController().blockePeers.keyAt(i10 - zx0Var.f40269r));
                zx0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        wt wtVar;
        boolean[] zArr;
        t00 t00Var;
        org.telegram.ui.Components.xc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        ex0 ex0Var;
        int i15 = 3;
        st stVar = null;
        boolean z10 = true;
        r5 = true;
        boolean z11 = true;
        r5 = 1;
        int i16 = 1;
        switch (this.f33951a) {
            case 0:
                l lVar = (l) this.f33952b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z12 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z12;
                        ((org.telegram.ui.Cells.x8) view).setChecked(z12);
                        lVar.f34837c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z13 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z13;
                        ((org.telegram.ui.Cells.x8) view).setChecked(z13);
                        lVar.f34837c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.d90 d90Var = icVar.f24940b;
                            d90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.h6.Gi, 0, new fu0(lVar, 3)));
                            d90Var.setSingleLine(false);
                            d90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            icVar.f24939a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.qc.g(lVar, icVar, 3500).j();
                            int i18 = -lVar.e;
                            lVar.e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                        boolean z14 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z14;
                        ((org.telegram.ui.Cells.x8) view).setChecked(z14);
                        lVar.f34837c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                p pVar = (p) this.f33952b;
                if (i10 >= pVar.f35986x && i10 < pVar.f35987y && pVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) pVar.h.get(i10 - pVar.f35986x);
                    if (stickerSetCovered.set.f18110id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f18103id = stickerSetCovered.set.f18110id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(pVar.getParentActivity(), pVar, inputStickerSet, null, null, null);
                    ux0Var.f28570c0 = new n(pVar, view, stickerSetCovered);
                    pVar.showDialog(ux0Var);
                    return;
                }
                return;
            case 2:
                yc ycVar = (yc) this.f33952b;
                ArrayList arrayList2 = ycVar.f39787c;
                wb1 wb1Var = ycVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) arrayList2.get(i10);
                    ycVar.a(mpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + wb1Var.getPaddingLeft()) {
                        wb1Var.v0(-((AndroidUtilities.dp(48.0f) + wb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (wb1Var.getMeasuredWidth() - wb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        wb1Var.v0(org.telegram.messenger.z0.z(48.0f, wb1Var.getMeasuredWidth() - wb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = ycVar.f39790r;
                    if (callback != null) {
                        callback.run(mpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                sp spVar = (sp) this.f33952b;
                boolean z15 = spVar.f37386s;
                if (spVar.getParentActivity() != null) {
                    s4.h0 adapter = spVar.f37381b.getAdapter();
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
                        if (z15 && spVar.h.linked_chat_id == 0) {
                            spVar.a0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f18083id);
                        spVar.presentFragment(new xn(bundle));
                        return;
                    } else if (i10 == spVar.F) {
                        if (z15 && spVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{spVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = spVar.f37383f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            i70 i70Var = new i70(bundle2);
                            i70Var.Y = new kp(spVar);
                            spVar.presentFragment(i70Var);
                            return;
                        } else if (!spVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) spVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(spVar.getParentActivity());
                            if (z15) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.f18409a.R = string;
                            alertDialog$Builder.f18409a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new z0(spVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                            spVar.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
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
                zp zpVar = (zp) this.f33952b;
                ArrayList arrayList3 = zpVar.f40215r;
                boolean z16 = zpVar.G;
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
                    boolean contains = zpVar.d.contains(tL_availableReaction.reaction);
                    boolean z17 = !contains;
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
                    Switch r22 = yVar.f21617c;
                    if (r22 != null) {
                        r22.c(z17, true);
                    }
                    org.telegram.ui.Components.op opVar = yVar.d;
                    if (opVar != null) {
                        opVar.a(z17, true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                lt ltVar = (lt) this.f33952b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ot) view).d;
                pt ptVar = ltVar.f35086a;
                zg.c0 reactionsWindow = ptVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f48940q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ay0.c(null, ptVar.f36185c0, ptVar.f36206z.getContext(), new c5(ltVar, 9));
                    return;
                }
                nt ntVar = ptVar.f36193l;
                if (ntVar != null) {
                    ntVar.w(stickerSetCovered2.set, TextUtils.join("", ptVar.f36196o));
                }
                ptVar.p();
                return;
            case 6:
                xt xtVar = (xt) this.f33952b;
                if (xtVar.f39658f && xtVar.e) {
                    vt vtVar = xtVar.d;
                    ArrayList arrayList4 = vtVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        stVar = (st) vtVar.e.get(i10);
                    }
                } else {
                    int S = xtVar.f39657c.S(i10);
                    int Q = xtVar.f39657c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        stVar = xtVar.f39657c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    xtVar.finishFragment();
                    if (stVar != null && (wtVar = xtVar.f39660r) != null) {
                        wtVar.a1(stVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                su suVar = (su) this.f33952b;
                ArrayList arrayList5 = suVar.f37421c3;
                wu wuVar = suVar.f37432o3;
                if ((view instanceof lu) && i10 >= 0 && i10 < arrayList5.size()) {
                    nu nuVar = (nu) arrayList5.get(i10);
                    if (nuVar != null) {
                        int i20 = nuVar.h;
                        if (i20 >= 0) {
                            suVar.f37427i3[i20] = !zArr[i20];
                            suVar.A1(true);
                            return;
                        } else if (i20 == -2) {
                            wuVar.presentFragment(new DataAutoDownloadActivity(suVar.Y2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wuVar.getParentActivity());
                    alertDialog$Builder2.f18409a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f18409a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new ou(suVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18409a;
                    wuVar.showDialog(b2Var2);
                    TextView textView2 = (TextView) b2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                zz.V((zz) this.f33952b, view, i10);
                return;
            case 9:
                c10 c10Var = (c10) this.f33952b;
                if (c10Var.getParentActivity() != null && (t00Var = (t00) c10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = t00Var.f37477c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = t00Var.f15508a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
                        c10Var.v0(t00Var, bbVar.getName(), bbVar.getCurrentObject(), t00Var.f37479g);
                        return;
                    } else if (i21 == 7) {
                        hw hwVar = new hw(8, c10Var, t00Var);
                        if (c10Var.f32221c.isEnabled()) {
                            c10Var.s0(hwVar, false);
                            return;
                        } else {
                            hwVar.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && t00Var.f37482k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = c10Var.f32224r;
                        if (c10Var.f32225s && c10Var.f32221c.getAlpha() > 0.0f) {
                            float f7 = -c10Var.Q;
                            c10Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            c10Var.v = true;
                            fj fjVar = c10Var.R;
                            if (fjVar == null || fjVar.getVisibility() != 0) {
                                fj fjVar2 = new fj(6, 3, c10Var.getParentActivity(), null, true);
                                c10Var.R = fjVar2;
                                fjVar2.f25128a.setMaxWidth(AndroidUtilities.displaySize.x);
                                c10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                c10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                c10Var.getParentLayout().getOverlayContainerView().addView(c10Var.R, marginLayoutParams);
                                c10Var.R.f(c10Var.f32221c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(c10Var.f32226w) || !TextUtils.isEmpty(dialogFilter.name)) && (c10Var.f32228y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && c10Var.G.isEmpty() && !c10Var.F.isEmpty()) {
                            c10Var.s0(new d00(c10Var, 1), false);
                            return;
                        } else {
                            float f10 = -c10Var.Q;
                            c10Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(c10Var.f32226w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.xc.a0(c10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((c10Var.f32228y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!c10Var.G.isEmpty()) {
                                    a02 = org.telegram.ui.Components.xc.a0(c10Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.xc.a0(c10Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (c10Var.F.isEmpty()) {
                                a02 = org.telegram.ui.Components.xc.a0(c10Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.xc.a0(c10Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.z0.p(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                o00 o00Var = (o00) this.f33952b;
                ArrayList arrayList6 = o00Var.f35654d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    t00 t00Var2 = (t00) arrayList6.get(i22);
                    int i23 = t00Var2.f15508a;
                    if (i23 == 7) {
                        o00Var.dismiss();
                        o00Var.f22661n.presentFragment(new zz(o00Var.X, t00Var2.f37484m));
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
                u10 u10Var = (u10) this.f33952b;
                if (view instanceof org.telegram.ui.Cells.j7) {
                    u10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    u10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.i7) {
                    u10Var.f(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    u10Var.f(i10, view, ((org.telegram.ui.Cells.e2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r2) {
                    u10Var.f(i10, view, ((org.telegram.ui.Cells.r2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 12:
                k70 k70Var = (k70) this.f33952b;
                if (k70Var.getParentActivity() != null) {
                    if (i10 != k70Var.f34596n && i10 != 0) {
                        if (i10 == k70Var.f34598s) {
                            if (k70Var.f34595f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", k70Var.f34595f.link);
                                    k70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == k70Var.f34597r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(k70Var.getParentActivity());
                            alertDialog$Builder3.f18409a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f18409a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new eu(k70Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            k70Var.showDialog(alertDialog$Builder3.f18409a);
                            return;
                        } else {
                            return;
                        }
                    } else if (k70Var.f34595f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", k70Var.f34595f.link));
                            org.telegram.ui.Components.xc.j(k70Var).j();
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
                q70.U((q70) this.f33952b, view, i10);
                return;
            case 14:
                i80.U((i80) this.f33952b, view, i10);
                return;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f33952b, view, i10);
                return;
            case 16:
                dd0 dd0Var = (dd0) this.f33952b;
                dd0Var.f32592i0 = -1L;
                int i24 = dd0Var.G0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) dd0Var.T.J(i10)) != null) {
                        if (dd0Var.f32587e0 == 0) {
                            dd0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            dd0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(dd0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = dd0Var.getMessagesController().getInputChannel(-dd0Var.f32587e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        b2VarArr[0].setOnCancelListener(new ba(dd0Var, dd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new aa(dd0Var, b2VarArr, tL_messageMediaVenue, 19)), 7));
                        dd0Var.showDialog(b2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = dd0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = dd0Var.f32614z0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), dd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = dd0Var.B0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = dd0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = dd0Var.B0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), dd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i24 != 2) {
                    if (dd0Var.F0 != null && dd0Var.f32611x0 != null) {
                        FrameLayout frameLayout = dd0Var.f32598o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(dd0Var.f32611x0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(dd0Var.f32611x0.getLongitude());
                        dd0Var.F0.b(tL_messageMediaGeo, dd0Var.G0, true, 0, 0L);
                        dd0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && dd0Var.getLocationController().isSharingLocation(dd0Var.f32587e0) && dd0Var.T.j(i10) == 7) {
                    dd0Var.getLocationController().removeSharingLocation(dd0Var.f32587e0);
                    dd0Var.T.l();
                    dd0Var.finishFragment();
                    return;
                } else if (i24 == 2 && dd0Var.getLocationController().isSharingLocation(dd0Var.f32587e0) && dd0Var.T.j(i10) == 6) {
                    if (dd0Var.getLocationController().getSharingLocationInfo(dd0Var.f32587e0).period == Integer.MAX_VALUE) {
                        z10 = false;
                    }
                    dd0Var.s0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (dd0Var.getLocationController().isSharingLocation(dd0Var.f32587e0)) {
                        dd0Var.getLocationController().removeSharingLocation(dd0Var.f32587e0);
                        dd0Var.T.l();
                        dd0Var.finishFragment();
                        return;
                    }
                    dd0Var.s0(false);
                    return;
                } else {
                    Object J = dd0Var.T.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        dd0Var.F0.b((TLRPC.TL_messageMediaVenue) J, dd0Var.G0, true, 0, 0L);
                        dd0Var.finishFragment();
                        return;
                    } else if (J instanceof xc0) {
                        xc0 xc0Var = (xc0) J;
                        dd0Var.f32592i0 = xc0Var.f39239a;
                        if (dd0Var.f32593j0) {
                            dd0Var.f32593j0 = false;
                            dd0Var.C0();
                        }
                        dd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(xc0Var.e.getPosition(), dd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((wi0) this.f33952b).onBackPressed();
                return;
            case 18:
                ej0 ej0Var = (ej0) this.f33952b;
                int i25 = ej0Var.I;
                if (i10 >= i25 && i10 < ej0Var.J) {
                    MessageObject messageObject2 = (MessageObject) ej0Var.f32957x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!ej0Var.a0(messageObject2)) {
                            ej0Var.getOrCreateStoryViewer().F(ej0Var.getParentActivity(), messageObject2.storyItem, ai.u9.a(ej0Var.f32952f));
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
                    if (ej0Var.getMessagesController().checkCanOpenChat(bundle3, ej0Var)) {
                        ej0Var.presentFragment(new xn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.f33952b, view, i10);
                return;
            case 20:
                tp0 tp0Var = (tp0) this.f33952b;
                tp0Var.a(i10, true);
                gp0 gp0Var = tp0Var.h;
                if (gp0Var != null) {
                    gp0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 21:
                uq0 uq0Var = (uq0) this.f33952b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = uq0Var.f38175f;
                ArrayList arrayList8 = uq0Var.f38183n;
                MediaController.AlbumEntry albumEntry = uq0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        zq0 zq0Var = uq0Var.f38192t0;
                        if (zq0Var != null) {
                            switch (zq0Var.f40225a) {
                                case 0:
                                    ar0.h0(zq0Var.f40226b, str);
                                    return;
                                default:
                                    ar0.h0(zq0Var.f40226b, str);
                                    return;
                            }
                        }
                        uq0Var.P.getSearchField().setText(str);
                        uq0Var.P.getSearchField().setSelection(str.length());
                        uq0Var.b0(uq0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(uq0Var.getParentActivity());
                        alertDialog$Builder4.f18409a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f18409a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new hq0(uq0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder4.f18409a;
                        uq0Var.showDialog(b2Var3);
                        TextView textView3 = (TextView) b2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19026q7, false));
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
                    org.telegram.ui.ActionBar.v0 v0Var = uq0Var.P;
                    if (v0Var != null) {
                        AndroidUtilities.hideKeyboard(v0Var.getSearchField());
                    }
                    if (uq0Var.Y) {
                        uq0Var.a0(view, arrayList7.get(i10));
                        return;
                    }
                    int i26 = uq0Var.T;
                    if (i26 != 1 && i26 != 3) {
                        i16 = i26 == 2 ? 3 : i26 == 10 ? 10 : uq0Var.U == null ? 4 : 0;
                    }
                    PhotoViewer.t1().J2(null, uq0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = uq0Var.H;
                    boolean z18 = uq0Var.I;
                    t12.h = i27;
                    t12.f30984n = z18;
                    PhotoViewer.t1().f2(arrayList7, i10, i16, uq0Var.f38182l0, uq0Var.f38198x0, uq0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f33952b;
                ArrayList arrayList9 = photoViewer.f30932g7;
                if (!arrayList9.isEmpty() && (i14 = photoViewer.P4) >= 0 && i14 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f30965k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.A2(indexOf);
                }
                photoViewer.f30965k5 = false;
                return;
            case 23:
                a(i10, view);
                return;
            case 24:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f33952b, view, i10);
                return;
            case 25:
                cx0 cx0Var = (cx0) this.f33952b;
                PremiumPreviewFragment premiumPreviewFragment = cx0Var.f32435n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                zw0 zw0Var = cx0Var.e;
                if (view.isEnabled() && (view instanceof rg.p1)) {
                    rg.p1 p1Var = (rg.p1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(p1Var.getTier());
                    premiumPreviewFragment.t0(true);
                    p1Var.c(true, true);
                    for (int i28 = 0; i28 < zw0Var.getChildCount(); i28++) {
                        View childAt = zw0Var.getChildAt(i28);
                        if (childAt instanceof rg.p1) {
                            rg.p1 p1Var2 = (rg.p1) childAt;
                            if (p1Var2.getTier() != p1Var.getTier()) {
                                p1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < zw0Var.getHiddenChildCount(); i29++) {
                        View V = zw0Var.V(i29);
                        if (V instanceof rg.p1) {
                            rg.p1 p1Var3 = (rg.p1) V;
                            if (p1Var3.getTier() != p1Var.getTier()) {
                                p1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < zw0Var.getCachedChildCount(); i30++) {
                        View P = zw0Var.P(i30);
                        if (P instanceof rg.p1) {
                            rg.p1 p1Var4 = (rg.p1) P;
                            if (p1Var4.getTier() != p1Var.getTier()) {
                                p1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < zw0Var.getAttachedScrapChildCount(); i31++) {
                        View O = zw0Var.O(i31);
                        if (O instanceof rg.p1) {
                            rg.p1 p1Var5 = (rg.p1) O;
                            if (p1Var5.getTier() != p1Var.getTier()) {
                                p1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((ex0Var = premiumPreviewFragment.f31134f) == null || ex0Var.f33032a.months >= ((ex0) arrayList10.get(premiumPreviewFragment.e)).f33032a.months || premiumPreviewFragment.f31145p0)) {
                        z11 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z11);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f33952b, view, i10);
                return;
            case 27:
                b(i10, view);
                return;
            case 28:
                ProfileActivity.f0((ProfileActivity) this.f33952b, i10);
                return;
            default:
                ProxyListActivity.U((ProxyListActivity) this.f33952b, view, i10);
                return;
        }
    }
}
