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
public final class i implements org.telegram.ui.Components.jl0 {
    public final int f33506a;
    public final Object f33507b;

    public i(Object obj, int i10) {
        this.f33506a = i10;
        this.f33507b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        bw0 bw0Var = (bw0) this.f33507b;
        boolean[] zArr = bw0Var.f31452w;
        if (i10 == bw0Var.f31442o0) {
            bw0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.x8) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            boolean z11 = bw0Var.L;
            org.telegram.ui.Components.zy0 zy0Var = bw0Var.Q;
            if (zy0Var != null) {
                zy0Var.f();
            }
            if (bw0Var.I) {
                int i11 = -bw0Var.O;
                bw0Var.O = i11;
                AndroidUtilities.shakeViewSpring(x8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == bw0Var.f31446r0) {
                z10 = !bw0Var.G;
                bw0Var.G = z10;
            } else {
                int i12 = bw0Var.f31450u0;
                if (i10 == i12) {
                    z10 = !bw0Var.H;
                    bw0Var.H = z10;
                } else if (i10 == bw0Var.f31451v0) {
                    boolean z12 = !bw0Var.J;
                    bw0Var.J = z12;
                    bw0Var.r0();
                    int i13 = bw0Var.f31450u0;
                    if (i13 >= 0 && i12 < 0) {
                        bw0Var.f31426b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        bw0Var.f31426b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == bw0Var.f31448s0) {
                    boolean z13 = bw0Var.K;
                    boolean z14 = !z13;
                    bw0Var.K = z14;
                    if (!z13 && bw0Var.L) {
                        int i14 = bw0Var.f31437j0;
                        bw0Var.L = false;
                        bw0Var.r0();
                        s4.c1 K = bw0Var.f31428c.K(bw0Var.f31449t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.x8) K.f41610a).setChecked(false);
                        } else {
                            bw0Var.f31426b.m(bw0Var.f31449t0);
                        }
                        bw0Var.f31426b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (bw0Var.N == 0) {
                    z10 = !bw0Var.L;
                    bw0Var.L = z10;
                    int i15 = bw0Var.f31437j0;
                    bw0Var.r0();
                    if (bw0Var.L) {
                        bw0Var.f31426b.s(bw0Var.f31437j0, 2);
                    } else {
                        bw0Var.f31426b.t(i15, 2);
                    }
                    if (bw0Var.L && bw0Var.K) {
                        bw0Var.K = false;
                        s4.c1 K2 = bw0Var.f31428c.K(bw0Var.f31448s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.x8) K2.f41610a).setChecked(false);
                        } else {
                            bw0Var.f31426b.m(bw0Var.f31448s0);
                        }
                    }
                    if (bw0Var.L) {
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
            if (bw0Var.M && !bw0Var.L) {
                bw0Var.h.b(true);
            }
            bw0Var.f31428c.getChildCount();
            for (int i17 = bw0Var.f31441n0; i17 < bw0Var.f31441n0 + bw0Var.f31456y; i17++) {
                s4.c1 K3 = bw0Var.f31428c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f41610a;
                    if (view2 instanceof org.telegram.ui.Cells.e6) {
                        org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view2;
                        e6Var.m(bw0Var.L, true);
                        e6Var.f19078r.a(zArr[i17 - bw0Var.f31441n0], z11);
                        if (e6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == bw0Var.f31449t0 && !bw0Var.M) {
                            bw0Var.h.f(e6Var.getCheckBox(), true);
                            bw0Var.M = true;
                        }
                    }
                }
            }
            x8Var.setChecked(z10);
            bw0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        ky0 ky0Var = (ky0) this.f33507b;
        int i11 = ky0Var.f34482y;
        if (i10 == ky0Var.f34480w) {
            org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.d5.O(ky0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new iy0(ky0Var), null).f17528a;
            d2Var.show();
            d2Var.h();
        } else if (i10 == ky0Var.f34476f) {
            if (i11 == 1) {
                ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
                p2Var.d = new Paint();
                p2Var.f35910f = new ov[2];
                p2Var.f35914w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                wy wyVar = new wy(bundle);
                p2Var.f35907a = wyVar;
                wyVar.C2 = new mv(p2Var);
                wyVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                p2Var.f35908b = contactsActivity;
                contactsActivity.W = new mv(p2Var);
                contactsActivity.onFragmentCreate();
                ky0Var.presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
                return;
            }
            Bundle i12 = a4.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            e70 e70Var = new e70(i12);
            e70Var.f32104w = new hy0(ky0Var);
            ky0Var.presentFragment(e70Var);
        } else if (i10 >= ky0Var.f34478r && i10 < ky0Var.f34479s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", ky0Var.getMessagesController().blockePeers.keyAt(i10 - ky0Var.f34478r));
                ky0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        y00 y00Var;
        org.telegram.ui.Components.wc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        int i15;
        nx0 nx0Var;
        int i16 = 3;
        wt wtVar = null;
        boolean z10 = true;
        switch (this.f33506a) {
            case 0:
                l lVar = (l) this.f33507b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.x8) view).setChecked(z11);
                        lVar.f34487c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.x8) view).setChecked(z12);
                        lVar.f34487c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.hc hcVar = new org.telegram.ui.Components.hc(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.m90 m90Var = hcVar.f23574b;
                            m90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.j6.Gi, 0, new mu0(lVar, 3)));
                            m90Var.setSingleLine(false);
                            m90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            hcVar.f23573a.setImageResource(R.drawable.msg_settings_premium);
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
                        lVar.f34487c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                q qVar = (q) this.f33507b;
                if (i10 >= qVar.f35945x && i10 < qVar.f35946y && qVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) qVar.h.get(i10 - qVar.f35945x);
                    if (stickerSetCovered.set.f17222id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f17215id = stickerSetCovered.set.f17222id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.hy0 hy0Var = new org.telegram.ui.Components.hy0(qVar.getParentActivity(), qVar, inputStickerSet, null, null, null);
                    hy0Var.f23807c0 = new o(qVar, view, stickerSetCovered);
                    qVar.showDialog(hy0Var);
                    return;
                }
                return;
            case 2:
                ad adVar = (ad) this.f33507b;
                ArrayList arrayList2 = adVar.f30893c;
                ic1 ic1Var = adVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.rp rpVar = (org.telegram.ui.Components.rp) arrayList2.get(i10);
                    adVar.a(rpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + ic1Var.getPaddingLeft()) {
                        ic1Var.v0(-((AndroidUtilities.dp(48.0f) + ic1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (ic1Var.getMeasuredWidth() - ic1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        ic1Var.v0(org.telegram.messenger.a2.z(48.0f, ic1Var.getMeasuredWidth() - ic1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = adVar.f30896r;
                    if (callback != null) {
                        callback.run(rpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                yp ypVar = (yp) this.f33507b;
                boolean z14 = ypVar.f39082s;
                if (ypVar.getParentActivity() != null) {
                    s4.h0 adapter = ypVar.f39077b.getAdapter();
                    xp xpVar = ypVar.e;
                    if (adapter == xpVar) {
                        chat = (TLRPC.Chat) xpVar.d.get(i10);
                    } else {
                        int i19 = ypVar.G;
                        if (i10 >= i19 && i10 < ypVar.H) {
                            chat = (TLRPC.Chat) ypVar.v.get(i10 - i19);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z14 && ypVar.h.linked_chat_id == 0) {
                            ypVar.a0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f17195id);
                        ypVar.presentFragment(new eo(bundle));
                        return;
                    } else if (i10 == ypVar.F) {
                        if (z14 && ypVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{ypVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = ypVar.f39079f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            k70 k70Var = new k70(bundle2);
                            k70Var.Y = new qp(ypVar);
                            ypVar.presentFragment(k70Var);
                            return;
                        } else if (!ypVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) ypVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ypVar.getParentActivity());
                            if (z14) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.f17528a.R = string;
                            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new a1(ypVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                            ypVar.showDialog(d2Var);
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
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
                fq fqVar = (fq) this.f33507b;
                ArrayList arrayList3 = fqVar.f32889r;
                boolean z15 = fqVar.G;
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
                    boolean contains = fqVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        fqVar.d.add(tL_availableReaction.reaction);
                    } else {
                        fqVar.d.remove(tL_availableReaction.reaction);
                        if (fqVar.d.isEmpty()) {
                            eq eqVar = fqVar.h;
                            if (eqVar != null) {
                                if (fqVar.G) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                eqVar.t(i12, arrayList3.size() + 1);
                            }
                            fqVar.V(2, true);
                        }
                    }
                    Switch r22 = yVar.f20738c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.tp tpVar = yVar.d;
                    if (tpVar != null) {
                        tpVar.a(z16, true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                pt ptVar = (pt) this.f33507b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((st) view).d;
                tt ttVar = ptVar.f35899a;
                yg.c0 reactionsWindow = ttVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f46963q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ny0.c(null, ttVar.f37018c0, ttVar.f37039z.getContext(), new b5(ptVar, 9));
                    return;
                }
                rt rtVar = ttVar.f37026l;
                if (rtVar != null) {
                    rtVar.u(stickerSetCovered2.set, TextUtils.join("", ttVar.f37029o));
                }
                ttVar.p();
                return;
            case 6:
                bu buVar = (bu) this.f33507b;
                if (buVar.f31403f && buVar.e) {
                    zt ztVar = buVar.d;
                    ArrayList arrayList4 = ztVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        wtVar = (wt) ztVar.e.get(i10);
                    }
                } else {
                    int S = buVar.f31402c.S(i10);
                    int Q = buVar.f31402c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        wtVar = buVar.f31402c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    buVar.finishFragment();
                    if (wtVar != null && (auVar = buVar.f31405r) != null) {
                        auVar.a1(wtVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                xu xuVar = (xu) this.f33507b;
                ArrayList arrayList5 = xuVar.f38818c3;
                bv bvVar = xuVar.f38829o3;
                if ((view instanceof qu) && i10 >= 0 && i10 < arrayList5.size()) {
                    su suVar = (su) arrayList5.get(i10);
                    if (suVar != null) {
                        int i20 = suVar.h;
                        if (i20 >= 0) {
                            xuVar.f38824i3[i20] = !zArr[i20];
                            xuVar.z1(true);
                            return;
                        } else if (i20 == -2) {
                            bvVar.presentFragment(new DataAutoDownloadActivity(xuVar.Y2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.s8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bvVar.getParentActivity());
                    alertDialog$Builder2.f17528a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new tu(xuVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f17528a;
                    bvVar.showDialog(d2Var2);
                    TextView textView2 = (TextView) d2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                e00.V((e00) this.f33507b, view, i10);
                return;
            case 9:
                h10 h10Var = (h10) this.f33507b;
                if (h10Var.getParentActivity() != null && (y00Var = (y00) h10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = y00Var.f38857c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = y00Var.f14046a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
                        h10Var.v0(y00Var, bbVar.getName(), bbVar.getCurrentObject(), y00Var.f38859g);
                        return;
                    } else if (i21 == 7) {
                        uv uvVar = new uv(11, h10Var, y00Var);
                        if (h10Var.f33234c.isEnabled()) {
                            h10Var.s0(uvVar, false);
                            return;
                        } else {
                            uvVar.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && y00Var.f38862k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = h10Var.f33237r;
                        if (h10Var.f33238s && h10Var.f33234c.getAlpha() > 0.0f) {
                            float f7 = -h10Var.Q;
                            h10Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            h10Var.v = true;
                            kj kjVar = h10Var.R;
                            if (kjVar == null || kjVar.getVisibility() != 0) {
                                kj kjVar2 = new kj(6, 3, h10Var.getParentActivity(), null, true);
                                h10Var.R = kjVar2;
                                kjVar2.f26935a.setMaxWidth(AndroidUtilities.displaySize.x);
                                h10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                h10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                h10Var.getParentLayout().getOverlayContainerView().addView(h10Var.R, marginLayoutParams);
                                h10Var.R.f(h10Var.f33234c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(h10Var.f33239w) || !TextUtils.isEmpty(dialogFilter.name)) && (h10Var.f33241y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && h10Var.G.isEmpty() && !h10Var.F.isEmpty()) {
                            h10Var.s0(new i00(h10Var, 1), false);
                            return;
                        } else {
                            float f10 = -h10Var.Q;
                            h10Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(h10Var.f33239w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.wc.a0(h10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((h10Var.f33241y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!h10Var.G.isEmpty()) {
                                    a02 = org.telegram.ui.Components.wc.a0(h10Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.wc.a0(h10Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (h10Var.F.isEmpty()) {
                                a02 = org.telegram.ui.Components.wc.a0(h10Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.wc.a0(h10Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.a2.p(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                t00 t00Var = (t00) this.f33507b;
                ArrayList arrayList6 = t00Var.f36805d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    y00 y00Var2 = (y00) arrayList6.get(i22);
                    int i23 = y00Var2.f14046a;
                    if (i23 == 7) {
                        t00Var.dismiss();
                        t00Var.f21452n.presentFragment(new e00(t00Var.X, y00Var2.f38864m));
                        return;
                    } else if (i23 == 8) {
                        t00Var.Q();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                z10 z10Var = (z10) this.f33507b;
                if (view instanceof org.telegram.ui.Cells.l7) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.l7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.o7) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.o7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.e2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r2) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.r2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 12:
                m70 m70Var = (m70) this.f33507b;
                if (m70Var.getParentActivity() != null) {
                    if (i10 != m70Var.f34856n && i10 != 0) {
                        if (i10 == m70Var.f34858s) {
                            if (m70Var.f34855f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", m70Var.f34855f.link);
                                    m70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == m70Var.f34857r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(m70Var.getParentActivity());
                            alertDialog$Builder3.f17528a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f17528a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new iu(m70Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            m70Var.showDialog(alertDialog$Builder3.f17528a);
                            return;
                        } else {
                            return;
                        }
                    } else if (m70Var.f34855f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", m70Var.f34855f.link));
                            org.telegram.ui.Components.wc.j(m70Var).j();
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
                s70.U((s70) this.f33507b, view, i10);
                return;
            case 14:
                k80.U((k80) this.f33507b, view, i10);
                return;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f33507b, view, i10);
                return;
            case 16:
                id0 id0Var = (id0) this.f33507b;
                id0Var.f33626i0 = -1L;
                int i24 = id0Var.G0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) id0Var.T.J(i10)) != null) {
                        if (id0Var.f33621e0 == 0) {
                            id0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            id0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(id0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = id0Var.getMessagesController().getInputChannel(-id0Var.f33621e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        d2VarArr[0].setOnCancelListener(new ba(id0Var, id0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new aa(id0Var, d2VarArr, tL_messageMediaVenue, 19)), 7));
                        id0Var.showDialog(d2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = id0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = id0Var.f33648z0.geo_point;
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
                    if (id0Var.F0 != null && id0Var.f33645x0 != null) {
                        FrameLayout frameLayout = id0Var.f33632o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(id0Var.f33645x0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(id0Var.f33645x0.getLongitude());
                        id0Var.F0.b(tL_messageMediaGeo, id0Var.G0, true, 0, 0L);
                        id0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && id0Var.getLocationController().isSharingLocation(id0Var.f33621e0) && id0Var.T.j(i10) == 7) {
                    id0Var.getLocationController().removeSharingLocation(id0Var.f33621e0);
                    id0Var.T.l();
                    id0Var.finishFragment();
                    return;
                } else if (i24 == 2 && id0Var.getLocationController().isSharingLocation(id0Var.f33621e0) && id0Var.T.j(i10) == 6) {
                    if (id0Var.getLocationController().getSharingLocationInfo(id0Var.f33621e0).period == Integer.MAX_VALUE) {
                        z10 = false;
                    }
                    id0Var.s0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (id0Var.getLocationController().isSharingLocation(id0Var.f33621e0)) {
                        id0Var.getLocationController().removeSharingLocation(id0Var.f33621e0);
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
                        id0Var.f33626i0 = cd0Var.f31642a;
                        if (id0Var.f33627j0) {
                            id0Var.f33627j0 = false;
                            id0Var.C0();
                        }
                        id0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cd0Var.e.getPosition(), id0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((cj0) this.f33507b).onBackPressed();
                return;
            case 18:
                kj0 kj0Var = (kj0) this.f33507b;
                int i25 = kj0Var.I;
                if (i10 >= i25 && i10 < kj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) kj0Var.f34397x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!kj0Var.a0(messageObject2)) {
                            kj0Var.getOrCreateStoryViewer().G(kj0Var.getParentActivity(), messageObject2.storyItem, zh.s5.a(kj0Var.f34392f));
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
                        kj0Var.presentFragment(new eo(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.f33507b, view, i10);
                return;
            case 20:
                aq0 aq0Var = (aq0) this.f33507b;
                aq0Var.a(i10, true);
                mp0 mp0Var = aq0Var.h;
                if (mp0Var != null) {
                    mp0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 21:
                br0 br0Var = (br0) this.f33507b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = br0Var.f31371f;
                ArrayList arrayList8 = br0Var.f31379n;
                MediaController.AlbumEntry albumEntry = br0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        fr0 fr0Var = br0Var.f31388t0;
                        if (fr0Var != null) {
                            switch (fr0Var.f32901a) {
                                case 0:
                                    gr0.h0(fr0Var.f32902b, str);
                                    return;
                                default:
                                    gr0.h0(fr0Var.f32902b, str);
                                    return;
                            }
                        }
                        br0Var.P.getSearchField().setText(str);
                        br0Var.P.getSearchField().setSelection(str.length());
                        br0Var.b0(br0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(br0Var.getParentActivity());
                        alertDialog$Builder4.f17528a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f17528a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new oq0(br0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder4.f17528a;
                        br0Var.showDialog(d2Var3);
                        TextView textView3 = (TextView) d2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
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
                    org.telegram.ui.ActionBar.w0 w0Var = br0Var.P;
                    if (w0Var != null) {
                        AndroidUtilities.hideKeyboard(w0Var.getSearchField());
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
                    t12.f30125n = z17;
                    PhotoViewer.t1().f2(arrayList7, i10, i14, br0Var.f31378l0, br0Var.f31394x0, br0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f33507b;
                ArrayList arrayList9 = photoViewer.f30073g7;
                if (!arrayList9.isEmpty() && (i15 = photoViewer.P4) >= 0 && i15 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f30106k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.f30106k5 = false;
                return;
            case 23:
                a(i10, view);
                return;
            case 24:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f33507b, view, i10);
                return;
            case 25:
                lx0 lx0Var = (lx0) this.f33507b;
                PremiumPreviewFragment premiumPreviewFragment = lx0Var.f34805n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                ix0 ix0Var = lx0Var.e;
                if (view.isEnabled() && (view instanceof qg.r1)) {
                    qg.r1 r1Var = (qg.r1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(r1Var.getTier());
                    premiumPreviewFragment.t0(true);
                    r1Var.c(true, true);
                    for (int i28 = 0; i28 < ix0Var.getChildCount(); i28++) {
                        View childAt = ix0Var.getChildAt(i28);
                        if (childAt instanceof qg.r1) {
                            qg.r1 r1Var2 = (qg.r1) childAt;
                            if (r1Var2.getTier() != r1Var.getTier()) {
                                r1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < ix0Var.getHiddenChildCount(); i29++) {
                        View V = ix0Var.V(i29);
                        if (V instanceof qg.r1) {
                            qg.r1 r1Var3 = (qg.r1) V;
                            if (r1Var3.getTier() != r1Var.getTier()) {
                                r1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < ix0Var.getCachedChildCount(); i30++) {
                        View P = ix0Var.P(i30);
                        if (P instanceof qg.r1) {
                            qg.r1 r1Var4 = (qg.r1) P;
                            if (r1Var4.getTier() != r1Var.getTier()) {
                                r1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < ix0Var.getAttachedScrapChildCount(); i31++) {
                        View O = ix0Var.O(i31);
                        if (O instanceof qg.r1) {
                            qg.r1 r1Var5 = (qg.r1) O;
                            if (r1Var5.getTier() != r1Var.getTier()) {
                                r1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((nx0Var = premiumPreviewFragment.f30275f) == null || nx0Var.f35352a.months >= ((nx0) arrayList10.get(premiumPreviewFragment.e)).f35352a.months || premiumPreviewFragment.f30286p0)) {
                        z10 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z10);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f33507b, view, i10);
                return;
            case 27:
                b(i10, view);
                return;
            case 28:
                ProfileActivity.f0((ProfileActivity) this.f33507b, i10);
                return;
            default:
                ProxyListActivity.U((ProxyListActivity) this.f33507b, view, i10);
                return;
        }
    }
}
