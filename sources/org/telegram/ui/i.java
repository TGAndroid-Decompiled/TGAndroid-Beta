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
    public final int f34341a;
    public final Object f34342b;

    public i(Object obj, int i10) {
        this.f34341a = i10;
        this.f34342b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        aw0 aw0Var = (aw0) this.f34342b;
        boolean[] zArr = aw0Var.f32224w;
        if (i10 == aw0Var.f32214o0) {
            aw0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.x8) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            boolean z11 = aw0Var.L;
            org.telegram.ui.Components.az0 az0Var = aw0Var.Q;
            if (az0Var != null) {
                az0Var.f();
            }
            if (aw0Var.I) {
                int i11 = -aw0Var.O;
                aw0Var.O = i11;
                AndroidUtilities.shakeViewSpring(x8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == aw0Var.f32218r0) {
                z10 = !aw0Var.G;
                aw0Var.G = z10;
            } else {
                int i12 = aw0Var.f32222u0;
                if (i10 == i12) {
                    z10 = !aw0Var.H;
                    aw0Var.H = z10;
                } else if (i10 == aw0Var.f32223v0) {
                    boolean z12 = !aw0Var.J;
                    aw0Var.J = z12;
                    aw0Var.r0();
                    int i13 = aw0Var.f32222u0;
                    if (i13 >= 0 && i12 < 0) {
                        aw0Var.f32198b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        aw0Var.f32198b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == aw0Var.f32220s0) {
                    boolean z13 = aw0Var.K;
                    boolean z14 = !z13;
                    aw0Var.K = z14;
                    if (!z13 && aw0Var.L) {
                        int i14 = aw0Var.f32209j0;
                        aw0Var.L = false;
                        aw0Var.r0();
                        s4.c1 L = aw0Var.f32200c.L(aw0Var.f32221t0);
                        if (L != null) {
                            ((org.telegram.ui.Cells.x8) L.f42995a).setChecked(false);
                        } else {
                            aw0Var.f32198b.m(aw0Var.f32221t0);
                        }
                        aw0Var.f32198b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (aw0Var.N == 0) {
                    z10 = !aw0Var.L;
                    aw0Var.L = z10;
                    int i15 = aw0Var.f32209j0;
                    aw0Var.r0();
                    if (aw0Var.L) {
                        aw0Var.f32198b.s(aw0Var.f32209j0, 2);
                    } else {
                        aw0Var.f32198b.t(i15, 2);
                    }
                    if (aw0Var.L && aw0Var.K) {
                        aw0Var.K = false;
                        s4.c1 L2 = aw0Var.f32200c.L(aw0Var.f32220s0);
                        if (L2 != null) {
                            ((org.telegram.ui.Cells.x8) L2.f42995a).setChecked(false);
                        } else {
                            aw0Var.f32198b.m(aw0Var.f32220s0);
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
            aw0Var.f32200c.getChildCount();
            for (int i17 = aw0Var.f32213n0; i17 < aw0Var.f32213n0 + aw0Var.f32228y; i17++) {
                s4.c1 L3 = aw0Var.f32200c.L(i17);
                if (L3 != null) {
                    View view2 = L3.f42995a;
                    if (view2 instanceof org.telegram.ui.Cells.e6) {
                        org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view2;
                        e6Var.m(aw0Var.L, true);
                        e6Var.f20202r.a(zArr[i17 - aw0Var.f32213n0], z11);
                        if (e6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == aw0Var.f32221t0 && !aw0Var.M) {
                            aw0Var.h.f(e6Var.getCheckBox(), true);
                            aw0Var.M = true;
                        }
                    }
                }
            }
            x8Var.setChecked(z10);
            aw0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        hy0 hy0Var = (hy0) this.f34342b;
        int i11 = hy0Var.f34340y;
        if (i10 == hy0Var.f34338w) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.d5.O(hy0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new fy0(hy0Var), null).f18669a;
            b2Var.show();
            b2Var.h();
        } else if (i10 == hy0Var.f34334f) {
            if (i11 == 1) {
                ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                n2Var.d = new Paint();
                n2Var.f36413f = new nv[2];
                n2Var.f36417w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                uy uyVar = new uy(bundle);
                n2Var.f36410a = uyVar;
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
                n2Var.f36411b = contactsActivity;
                contactsActivity.W = new lv(n2Var);
                contactsActivity.onFragmentCreate();
                hy0Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                return;
            }
            Bundle i12 = a4.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            e70 e70Var = new e70(i12);
            e70Var.f33292w = new ey0(hy0Var);
            hy0Var.presentFragment(e70Var);
        } else if (i10 >= hy0Var.f34336r && i10 < hy0Var.f34337s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", hy0Var.getMessagesController().blockePeers.keyAt(i10 - hy0Var.f34336r));
                hy0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        au auVar;
        boolean[] zArr;
        w00 w00Var;
        org.telegram.ui.Components.xc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        int i15;
        lx0 lx0Var;
        int i16 = 3;
        vt vtVar = null;
        boolean z10 = true;
        switch (this.f34341a) {
            case 0:
                l lVar = (l) this.f34342b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.x8) view).setChecked(z11);
                        lVar.f35287c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.x8) view).setChecked(z12);
                        lVar.f35287c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.hc hcVar = new org.telegram.ui.Components.hc(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.n90 n90Var = hcVar.f24778b;
                            n90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.j6.Gi, 0, new mu0(lVar, 3)));
                            n90Var.setSingleLine(false);
                            n90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            hcVar.f24777a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.pc.g(lVar, hcVar, 3500).j();
                            int i18 = -lVar.e;
                            lVar.e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                        boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                        ((org.telegram.ui.Cells.x8) view).setChecked(z13);
                        lVar.f35287c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                p pVar = (p) this.f34342b;
                if (i10 >= pVar.f36443x && i10 < pVar.f36444y && pVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) pVar.h.get(i10 - pVar.f36443x);
                    if (stickerSetCovered.set.f18370id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f18363id = stickerSetCovered.set.f18370id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.iy0 iy0Var = new org.telegram.ui.Components.iy0(pVar.getParentActivity(), pVar, inputStickerSet, null, null, null);
                    iy0Var.f25200c0 = new n(pVar, view, stickerSetCovered);
                    pVar.showDialog(iy0Var);
                    return;
                }
                return;
            case 2:
                zc zcVar = (zc) this.f34342b;
                ArrayList arrayList2 = zcVar.f40194c;
                fc1 fc1Var = zcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList2.get(i10);
                    zcVar.a(lpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + fc1Var.getPaddingLeft()) {
                        fc1Var.w0(-((AndroidUtilities.dp(48.0f) + fc1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (fc1Var.getMeasuredWidth() - fc1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        fc1Var.w0(org.telegram.messenger.l0.A(48.0f, fc1Var.getMeasuredWidth() - fc1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = zcVar.f40197r;
                    if (callback != null) {
                        callback.run(lpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                up upVar = (up) this.f34342b;
                boolean z14 = upVar.f38206s;
                if (upVar.getParentActivity() != null) {
                    s4.h0 adapter = upVar.f38201b.getAdapter();
                    tp tpVar = upVar.e;
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
                        bundle.putLong("chat_id", chat.f18343id);
                        upVar.presentFragment(new zn(bundle));
                        return;
                    } else if (i10 == upVar.F) {
                        if (z14 && upVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{upVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = upVar.f38203f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            l70 l70Var = new l70(bundle2);
                            l70Var.Y = new mp(upVar);
                            upVar.presentFragment(l70Var);
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
                            alertDialog$Builder.f18669a.R = string;
                            alertDialog$Builder.f18669a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new y0(upVar, 23));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
                            upVar.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false));
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
                bq bqVar = (bq) this.f34342b;
                ArrayList arrayList3 = bqVar.f32533r;
                boolean z15 = bqVar.G;
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
                    boolean contains = bqVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        bqVar.d.add(tL_availableReaction.reaction);
                    } else {
                        bqVar.d.remove(tL_availableReaction.reaction);
                        if (bqVar.d.isEmpty()) {
                            aq aqVar = bqVar.h;
                            if (aqVar != null) {
                                if (bqVar.G) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                aqVar.t(i12, arrayList3.size() + 1);
                            }
                            bqVar.V(2, true);
                        }
                    }
                    Switch r22 = yVar.f21886c;
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
                ot otVar = (ot) this.f34342b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((rt) view).d;
                st stVar = otVar.f36393a;
                zg.c0 reactionsWindow = stVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f49316q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.oy0.c(null, stVar.f37553c0, stVar.f37574z.getContext(), new b5(otVar, 9));
                    return;
                }
                qt qtVar = stVar.f37561l;
                if (qtVar != null) {
                    qtVar.w(stickerSetCovered2.set, TextUtils.join("", stVar.f37564o));
                }
                stVar.p();
                return;
            case 6:
                bu buVar = (bu) this.f34342b;
                if (buVar.f32562f && buVar.e) {
                    zt ztVar = buVar.d;
                    ArrayList arrayList4 = ztVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        vtVar = (vt) ztVar.e.get(i10);
                    }
                } else {
                    int S = buVar.f32561c.S(i10);
                    int Q = buVar.f32561c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        vtVar = buVar.f32561c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    buVar.finishFragment();
                    if (vtVar != null && (auVar = buVar.f32564r) != null) {
                        auVar.Z0(vtVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                wu wuVar = (wu) this.f34342b;
                ArrayList arrayList5 = wuVar.f39259c3;
                av avVar = wuVar.f39270o3;
                if ((view instanceof pu) && i10 >= 0 && i10 < arrayList5.size()) {
                    ru ruVar = (ru) arrayList5.get(i10);
                    if (ruVar != null) {
                        int i20 = ruVar.h;
                        if (i20 >= 0) {
                            wuVar.f39265i3[i20] = !zArr[i20];
                            wuVar.B1(true);
                            return;
                        } else if (i20 == -2) {
                            avVar.presentFragment(new DataAutoDownloadActivity(wuVar.Y2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(avVar.getParentActivity());
                    alertDialog$Builder2.f18669a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f18669a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new su(wuVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18669a;
                    avVar.showDialog(b2Var2);
                    TextView textView2 = (TextView) b2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                c00.V((c00) this.f34342b, view, i10);
                return;
            case 9:
                f10 f10Var = (f10) this.f34342b;
                if (f10Var.getParentActivity() != null && (w00Var = (w00) f10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = w00Var.f38651c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = w00Var.f15719a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                        f10Var.v0(w00Var, abVar.getName(), abVar.getCurrentObject(), w00Var.f38653g);
                        return;
                    } else if (i21 == 7) {
                        yt ytVar = new yt(14, f10Var, w00Var);
                        if (f10Var.f33461c.isEnabled()) {
                            f10Var.s0(ytVar, false);
                            return;
                        } else {
                            ytVar.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && w00Var.f38656k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = f10Var.f33464r;
                        if (f10Var.f33465s && f10Var.f33461c.getAlpha() > 0.0f) {
                            float f7 = -f10Var.Q;
                            f10Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            f10Var.v = true;
                            ij ijVar = f10Var.R;
                            if (ijVar == null || ijVar.getVisibility() != 0) {
                                ij ijVar2 = new ij(6, 3, f10Var.getParentActivity(), null, true);
                                f10Var.R = ijVar2;
                                ijVar2.f24965a.setMaxWidth(AndroidUtilities.displaySize.x);
                                f10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                f10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                f10Var.getParentLayout().getOverlayContainerView().addView(f10Var.R, marginLayoutParams);
                                f10Var.R.f(f10Var.f33461c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(f10Var.f33466w) || !TextUtils.isEmpty(dialogFilter.name)) && (f10Var.f33468y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && f10Var.G.isEmpty() && !f10Var.F.isEmpty()) {
                            f10Var.s0(new g00(f10Var, 1), false);
                            return;
                        } else {
                            float f10 = -f10Var.Q;
                            f10Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(f10Var.f33466w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.xc.a0(f10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((f10Var.f33468y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!f10Var.G.isEmpty()) {
                                    a02 = org.telegram.ui.Components.xc.a0(f10Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.xc.a0(f10Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (f10Var.F.isEmpty()) {
                                a02 = org.telegram.ui.Components.xc.a0(f10Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.xc.a0(f10Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.rk.p(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                r00 r00Var = (r00) this.f34342b;
                ArrayList arrayList6 = r00Var.f37034d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    w00 w00Var2 = (w00) arrayList6.get(i22);
                    int i23 = w00Var2.f15719a;
                    if (i23 == 7) {
                        r00Var.dismiss();
                        r00Var.f22602n.presentFragment(new c00(r00Var.X, w00Var2.f38658m));
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
                x10 x10Var = (x10) this.f34342b;
                if (view instanceof org.telegram.ui.Cells.l7) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.l7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.o7) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.o7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
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
                n70 n70Var = (n70) this.f34342b;
                if (n70Var.getParentActivity() != null) {
                    if (i10 != n70Var.f35926n && i10 != 0) {
                        if (i10 == n70Var.f35928s) {
                            if (n70Var.f35925f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", n70Var.f35925f.link);
                                    n70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == n70Var.f35927r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(n70Var.getParentActivity());
                            alertDialog$Builder3.f18669a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f18669a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new fu(n70Var, 13));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            n70Var.showDialog(alertDialog$Builder3.f18669a);
                            return;
                        } else {
                            return;
                        }
                    } else if (n70Var.f35925f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", n70Var.f35925f.link));
                            org.telegram.ui.Components.xc.j(n70Var).j();
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
                t70.U((t70) this.f34342b, view, i10);
                return;
            case 14:
                l80.U((l80) this.f34342b, view, i10);
                return;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f34342b, view, i10);
                return;
            case 16:
                kd0 kd0Var = (kd0) this.f34342b;
                kd0Var.f35127i0 = -1L;
                int i24 = kd0Var.G0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) kd0Var.T.J(i10)) != null) {
                        if (kd0Var.f35122e0 == 0) {
                            kd0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            kd0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(kd0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = kd0Var.getMessagesController().getInputChannel(-kd0Var.f35122e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        b2VarArr[0].setOnCancelListener(new ca(kd0Var, kd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ba(kd0Var, b2VarArr, tL_messageMediaVenue, 19)), 7));
                        kd0Var.showDialog(b2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = kd0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = kd0Var.f35149z0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), kd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = kd0Var.B0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = kd0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = kd0Var.B0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), kd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i24 != 2) {
                    if (kd0Var.F0 != null && kd0Var.f35146x0 != null) {
                        FrameLayout frameLayout = kd0Var.f35133o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(kd0Var.f35146x0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(kd0Var.f35146x0.getLongitude());
                        kd0Var.F0.b(tL_messageMediaGeo, kd0Var.G0, true, 0, 0L);
                        kd0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && kd0Var.getLocationController().isSharingLocation(kd0Var.f35122e0) && kd0Var.T.j(i10) == 7) {
                    kd0Var.getLocationController().removeSharingLocation(kd0Var.f35122e0);
                    kd0Var.T.l();
                    kd0Var.finishFragment();
                    return;
                } else if (i24 == 2 && kd0Var.getLocationController().isSharingLocation(kd0Var.f35122e0) && kd0Var.T.j(i10) == 6) {
                    if (kd0Var.getLocationController().getSharingLocationInfo(kd0Var.f35122e0).period == Integer.MAX_VALUE) {
                        z10 = false;
                    }
                    kd0Var.s0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (kd0Var.getLocationController().isSharingLocation(kd0Var.f35122e0)) {
                        kd0Var.getLocationController().removeSharingLocation(kd0Var.f35122e0);
                        kd0Var.T.l();
                        kd0Var.finishFragment();
                        return;
                    }
                    kd0Var.s0(false);
                    return;
                } else {
                    Object J = kd0Var.T.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        kd0Var.F0.b((TLRPC.TL_messageMediaVenue) J, kd0Var.G0, true, 0, 0L);
                        kd0Var.finishFragment();
                        return;
                    } else if (J instanceof ed0) {
                        ed0 ed0Var = (ed0) J;
                        kd0Var.f35127i0 = ed0Var.f33331a;
                        if (kd0Var.f35128j0) {
                            kd0Var.f35128j0 = false;
                            kd0Var.C0();
                        }
                        kd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(ed0Var.e.getPosition(), kd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((dj0) this.f34342b).onBackPressed();
                return;
            case 18:
                mj0 mj0Var = (mj0) this.f34342b;
                int i25 = mj0Var.I;
                if (i10 >= i25 && i10 < mj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) mj0Var.f35780x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!mj0Var.a0(messageObject2)) {
                            mj0Var.getOrCreateStoryViewer().F(mj0Var.getParentActivity(), messageObject2.storyItem, ai.u9.a(mj0Var.f35775f));
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
                    if (mj0Var.getMessagesController().checkCanOpenChat(bundle3, mj0Var)) {
                        mj0Var.presentFragment(new zn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.f34342b, view, i10);
                return;
            case 20:
                bq0 bq0Var = (bq0) this.f34342b;
                bq0Var.a(i10, true);
                op0 op0Var = bq0Var.h;
                if (op0Var != null) {
                    op0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 21:
                cr0 cr0Var = (cr0) this.f34342b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = cr0Var.f32861f;
                ArrayList arrayList8 = cr0Var.f32869n;
                MediaController.AlbumEntry albumEntry = cr0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        gr0 gr0Var = cr0Var.f32878t0;
                        if (gr0Var != null) {
                            switch (gr0Var.f33970a) {
                                case 0:
                                    hr0.h0(gr0Var.f33971b, str);
                                    return;
                                default:
                                    hr0.h0(gr0Var.f33971b, str);
                                    return;
                            }
                        }
                        cr0Var.P.getSearchField().setText(str);
                        cr0Var.P.getSearchField().setSelection(str.length());
                        cr0Var.b0(cr0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(cr0Var.getParentActivity());
                        alertDialog$Builder4.f18669a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f18669a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new pq0(cr0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder4.f18669a;
                        cr0Var.showDialog(b2Var3);
                        TextView textView3 = (TextView) b2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false));
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
                    org.telegram.ui.ActionBar.v0 v0Var = cr0Var.P;
                    if (v0Var != null) {
                        AndroidUtilities.hideKeyboard(v0Var.getSearchField());
                    }
                    if (cr0Var.Y) {
                        cr0Var.a0(view, arrayList7.get(i10));
                        return;
                    }
                    int i26 = cr0Var.T;
                    if (i26 != 1 && i26 != 3) {
                        if (i26 == 2) {
                            i14 = 3;
                        } else if (i26 == 10) {
                            i14 = 10;
                        } else if (cr0Var.U == null) {
                            i14 = 4;
                        } else {
                            i14 = 0;
                        }
                    } else {
                        i14 = 1;
                    }
                    PhotoViewer.t1().J2(null, cr0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = cr0Var.H;
                    boolean z17 = cr0Var.I;
                    t12.h = i27;
                    t12.f31318n = z17;
                    PhotoViewer.t1().f2(arrayList7, i10, i14, cr0Var.f32868l0, cr0Var.f32884x0, cr0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f34342b;
                ArrayList arrayList9 = photoViewer.f31266g7;
                if (!arrayList9.isEmpty() && (i15 = photoViewer.P4) >= 0 && i15 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f31299k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.A2(indexOf);
                }
                photoViewer.f31299k5 = false;
                return;
            case 23:
                a(i10, view);
                return;
            case 24:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f34342b, view, i10);
                return;
            case 25:
                jx0 jx0Var = (jx0) this.f34342b;
                PremiumPreviewFragment premiumPreviewFragment = jx0Var.f35026n;
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
                        View W = gx0Var.W(i29);
                        if (W instanceof rg.p1) {
                            rg.p1 p1Var3 = (rg.p1) W;
                            if (p1Var3.getTier() != p1Var.getTier()) {
                                p1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < gx0Var.getCachedChildCount(); i30++) {
                        View Q2 = gx0Var.Q(i30);
                        if (Q2 instanceof rg.p1) {
                            rg.p1 p1Var4 = (rg.p1) Q2;
                            if (p1Var4.getTier() != p1Var.getTier()) {
                                p1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < gx0Var.getAttachedScrapChildCount(); i31++) {
                        View P = gx0Var.P(i31);
                        if (P instanceof rg.p1) {
                            rg.p1 p1Var5 = (rg.p1) P;
                            if (p1Var5.getTier() != p1Var.getTier()) {
                                p1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((lx0Var = premiumPreviewFragment.f31468f) == null || lx0Var.f35558a.months >= ((lx0) arrayList10.get(premiumPreviewFragment.e)).f35558a.months || premiumPreviewFragment.f31479p0)) {
                        z10 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z10);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f34342b, view, i10);
                return;
            case 27:
                b(i10, view);
                return;
            case 28:
                ProfileActivity.f0((ProfileActivity) this.f34342b, i10);
                return;
            default:
                ProxyListActivity.U((ProxyListActivity) this.f34342b, view, i10);
                return;
        }
    }
}
