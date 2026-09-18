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
    public final int f34403a;
    public final Object f34404b;

    public i(Object obj, int i10) {
        this.f34403a = i10;
        this.f34404b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        cw0 cw0Var = (cw0) this.f34404b;
        boolean[] zArr = cw0Var.f32962w;
        if (i10 == cw0Var.f32952o0) {
            cw0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = cw0Var.L;
            org.telegram.ui.Components.oy0 oy0Var = cw0Var.Q;
            if (oy0Var != null) {
                oy0Var.f();
            }
            if (cw0Var.I) {
                int i11 = -cw0Var.O;
                cw0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == cw0Var.f32956r0) {
                z10 = !cw0Var.G;
                cw0Var.G = z10;
            } else {
                int i12 = cw0Var.f32960u0;
                if (i10 == i12) {
                    z10 = !cw0Var.H;
                    cw0Var.H = z10;
                } else if (i10 == cw0Var.f32961v0) {
                    boolean z12 = !cw0Var.J;
                    cw0Var.J = z12;
                    cw0Var.r0();
                    int i13 = cw0Var.f32960u0;
                    if (i13 >= 0 && i12 < 0) {
                        cw0Var.f32936b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        cw0Var.f32936b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == cw0Var.f32958s0) {
                    boolean z13 = cw0Var.K;
                    boolean z14 = !z13;
                    cw0Var.K = z14;
                    if (!z13 && cw0Var.L) {
                        int i14 = cw0Var.f32947j0;
                        cw0Var.L = false;
                        cw0Var.r0();
                        s4.c1 L = cw0Var.f32938c.L(cw0Var.f32959t0);
                        if (L != null) {
                            ((org.telegram.ui.Cells.w8) L.f42702a).setChecked(false);
                        } else {
                            cw0Var.f32936b.m(cw0Var.f32959t0);
                        }
                        cw0Var.f32936b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (cw0Var.N == 0) {
                    z10 = !cw0Var.L;
                    cw0Var.L = z10;
                    int i15 = cw0Var.f32947j0;
                    cw0Var.r0();
                    if (cw0Var.L) {
                        cw0Var.f32936b.s(cw0Var.f32947j0, 2);
                    } else {
                        cw0Var.f32936b.t(i15, 2);
                    }
                    if (cw0Var.L && cw0Var.K) {
                        cw0Var.K = false;
                        s4.c1 L2 = cw0Var.f32938c.L(cw0Var.f32958s0);
                        if (L2 != null) {
                            ((org.telegram.ui.Cells.w8) L2.f42702a).setChecked(false);
                        } else {
                            cw0Var.f32936b.m(cw0Var.f32958s0);
                        }
                    }
                    if (cw0Var.L) {
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
            if (cw0Var.M && !cw0Var.L) {
                cw0Var.h.b(true);
            }
            cw0Var.f32938c.getChildCount();
            for (int i17 = cw0Var.f32951n0; i17 < cw0Var.f32951n0 + cw0Var.f32966y; i17++) {
                s4.c1 L3 = cw0Var.f32938c.L(i17);
                if (L3 != null) {
                    View view2 = L3.f42702a;
                    if (view2 instanceof org.telegram.ui.Cells.c6) {
                        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view2;
                        c6Var.m(cw0Var.L, true);
                        c6Var.f19876r.a(zArr[i17 - cw0Var.f32951n0], z11);
                        if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == cw0Var.f32959t0 && !cw0Var.M) {
                            cw0Var.h.f(c6Var.getCheckBox(), true);
                            cw0Var.M = true;
                        }
                    }
                }
            }
            w8Var.setChecked(z10);
            cw0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        iy0 iy0Var = (iy0) this.f34404b;
        int i11 = iy0Var.f34720y;
        if (i10 == iy0Var.f34718w) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.O(iy0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new gy0(iy0Var), null).f18447a;
            c2Var.show();
            c2Var.h();
        } else if (i10 == iy0Var.f34714f) {
            if (i11 == 1) {
                ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
                o2Var.d = new Paint();
                o2Var.f36742f = new ov[2];
                o2Var.f36746w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                wy wyVar = new wy(bundle);
                o2Var.f36739a = wyVar;
                wyVar.C2 = new mv(o2Var);
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
                o2Var.f36740b = contactsActivity;
                contactsActivity.W = new mv(o2Var);
                contactsActivity.onFragmentCreate();
                iy0Var.presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
                return;
            }
            Bundle i12 = a4.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            g70 g70Var = new g70(i12);
            g70Var.f33898w = new fy0(iy0Var);
            iy0Var.presentFragment(g70Var);
        } else if (i10 >= iy0Var.f34716r && i10 < iy0Var.f34717s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", iy0Var.getMessagesController().blockePeers.keyAt(i10 - iy0Var.f34716r));
                iy0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        bu buVar;
        boolean[] zArr;
        y00 y00Var;
        org.telegram.ui.Components.vc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        nx0 nx0Var;
        int i15 = 3;
        xt xtVar = null;
        boolean z10 = true;
        r5 = true;
        boolean z11 = true;
        r5 = 1;
        int i16 = 1;
        switch (this.f34403a) {
            case 0:
                l lVar = (l) this.f34404b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z12 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z12;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z12);
                        lVar.f35390c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z13 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z13;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z13);
                        lVar.f35390c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.c90 c90Var = gcVar.f24169b;
                            c90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.j6.Gi, 0, new ou0(lVar, 3)));
                            c90Var.setSingleLine(false);
                            c90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            gcVar.f24168a.setImageResource(R.drawable.msg_settings_premium);
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
                        lVar.f35390c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                p pVar = (p) this.f34404b;
                if (i10 >= pVar.f36478x && i10 < pVar.f36479y && pVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) pVar.h.get(i10 - pVar.f36478x);
                    if (stickerSetCovered.set.f18148id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f18141id = stickerSetCovered.set.f18148id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(pVar.getParentActivity(), pVar, inputStickerSet, null, null, null);
                    wx0Var.f29773c0 = new n(pVar, view, stickerSetCovered);
                    pVar.showDialog(wx0Var);
                    return;
                }
                return;
            case 2:
                ad adVar = (ad) this.f34404b;
                ArrayList arrayList2 = adVar.f31830c;
                fc1 fc1Var = adVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList2.get(i10);
                    adVar.a(lpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + fc1Var.getPaddingLeft()) {
                        fc1Var.w0(-((AndroidUtilities.dp(48.0f) + fc1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (fc1Var.getMeasuredWidth() - fc1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        fc1Var.w0(org.telegram.messenger.w1.z(48.0f, fc1Var.getMeasuredWidth() - fc1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = adVar.f31833r;
                    if (callback != null) {
                        callback.run(lpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                wp wpVar = (wp) this.f34404b;
                boolean z15 = wpVar.f39128s;
                if (wpVar.getParentActivity() != null) {
                    s4.h0 adapter = wpVar.f39123b.getAdapter();
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
                        bundle.putLong("chat_id", chat.f18121id);
                        wpVar.presentFragment(new bo(bundle));
                        return;
                    } else if (i10 == wpVar.F) {
                        if (z15 && wpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{wpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = wpVar.f39125f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            n70 n70Var = new n70(bundle2);
                            n70Var.Y = new op(wpVar);
                            wpVar.presentFragment(n70Var);
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
                            alertDialog$Builder.f18447a.R = string;
                            alertDialog$Builder.f18447a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new y0(wpVar, 23));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                            wpVar.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19101q7, false));
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
                dq dqVar = (dq) this.f34404b;
                ArrayList arrayList3 = dqVar.f33207r;
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
                    Switch r22 = yVar.f21656c;
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
                qt qtVar = (qt) this.f34404b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((tt) view).d;
                ut utVar = qtVar.f37022a;
                zg.c0 reactionsWindow = utVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f49024q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.cy0.c(null, utVar.f38205c0, utVar.f38226z.getContext(), new b5(qtVar, 9));
                    return;
                }
                st stVar = utVar.f38213l;
                if (stVar != null) {
                    stVar.v(stickerSetCovered2.set, TextUtils.join("", utVar.f38216o));
                }
                utVar.p();
                return;
            case 6:
                cu cuVar = (cu) this.f34404b;
                if (cuVar.f32920f && cuVar.e) {
                    au auVar = cuVar.d;
                    ArrayList arrayList4 = auVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        xtVar = (xt) auVar.e.get(i10);
                    }
                } else {
                    int S = cuVar.f32919c.S(i10);
                    int Q = cuVar.f32919c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        xtVar = cuVar.f32919c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    cuVar.finishFragment();
                    if (xtVar != null && (buVar = cuVar.f32922r) != null) {
                        buVar.a1(xtVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                xu xuVar = (xu) this.f34404b;
                ArrayList arrayList5 = xuVar.f39708c3;
                bv bvVar = xuVar.f39719o3;
                if ((view instanceof qu) && i10 >= 0 && i10 < arrayList5.size()) {
                    su suVar = (su) arrayList5.get(i10);
                    if (suVar != null) {
                        int i20 = suVar.h;
                        if (i20 >= 0) {
                            xuVar.f39714i3[i20] = !zArr[i20];
                            xuVar.B1(true);
                            return;
                        } else if (i20 == -2) {
                            bvVar.presentFragment(new DataAutoDownloadActivity(xuVar.Y2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bvVar.getParentActivity());
                    alertDialog$Builder2.f18447a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f18447a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new tu(xuVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f18447a;
                    bvVar.showDialog(c2Var2);
                    TextView textView2 = (TextView) c2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19101q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                e00.V((e00) this.f34404b, view, i10);
                return;
            case 9:
                h10 h10Var = (h10) this.f34404b;
                if (h10Var.getParentActivity() != null && (y00Var = (y00) h10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = y00Var.f39747c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = y00Var.f15543a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                        h10Var.v0(y00Var, abVar.getName(), abVar.getCurrentObject(), y00Var.f39749g);
                        return;
                    } else if (i21 == 7) {
                        mw mwVar = new mw(8, h10Var, y00Var);
                        if (h10Var.f34093c.isEnabled()) {
                            h10Var.s0(mwVar, false);
                            return;
                        } else {
                            mwVar.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && y00Var.f39752k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = h10Var.f34096r;
                        if (h10Var.f34097s && h10Var.f34093c.getAlpha() > 0.0f) {
                            float f7 = -h10Var.Q;
                            h10Var.Q = f7;
                            AndroidUtilities.shakeViewSpring(view, f7);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            h10Var.v = true;
                            jj jjVar = h10Var.R;
                            if (jjVar == null || jjVar.getVisibility() != 0) {
                                jj jjVar2 = new jj(6, 3, h10Var.getParentActivity(), null, true);
                                h10Var.R = jjVar2;
                                jjVar2.f24811a.setMaxWidth(AndroidUtilities.displaySize.x);
                                h10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                h10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                h10Var.getParentLayout().getOverlayContainerView().addView(h10Var.R, marginLayoutParams);
                                h10Var.R.f(h10Var.f34093c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(h10Var.f34098w) || !TextUtils.isEmpty(dialogFilter.name)) && (h10Var.f34100y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && h10Var.G.isEmpty() && !h10Var.F.isEmpty()) {
                            h10Var.s0(new i00(h10Var, 1), false);
                            return;
                        } else {
                            float f10 = -h10Var.Q;
                            h10Var.Q = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(h10Var.f34098w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.vc.a0(h10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((h10Var.f34100y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!h10Var.G.isEmpty()) {
                                    a02 = org.telegram.ui.Components.vc.a0(h10Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.vc.a0(h10Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (h10Var.F.isEmpty()) {
                                a02 = org.telegram.ui.Components.vc.a0(h10Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.vc.a0(h10Var);
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
                t00 t00Var = (t00) this.f34404b;
                ArrayList arrayList6 = t00Var.f37603d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    y00 y00Var2 = (y00) arrayList6.get(i22);
                    int i23 = y00Var2.f15543a;
                    if (i23 == 7) {
                        t00Var.dismiss();
                        t00Var.f30454n.presentFragment(new e00(t00Var.X, y00Var2.f39754m));
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
                z10 z10Var = (z10) this.f34404b;
                if (view instanceof org.telegram.ui.Cells.j7) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.i7) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
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
                p70 p70Var = (p70) this.f34404b;
                if (p70Var.getParentActivity() != null) {
                    if (i10 != p70Var.f36553n && i10 != 0) {
                        if (i10 == p70Var.f36555s) {
                            if (p70Var.f36552f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", p70Var.f36552f.link);
                                    p70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == p70Var.f36554r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(p70Var.getParentActivity());
                            alertDialog$Builder3.f18447a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f18447a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new gu(p70Var, 13));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            p70Var.showDialog(alertDialog$Builder3.f18447a);
                            return;
                        } else {
                            return;
                        }
                    } else if (p70Var.f36552f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", p70Var.f36552f.link));
                            org.telegram.ui.Components.vc.j(p70Var).j();
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
                v70.U((v70) this.f34404b, view, i10);
                return;
            case 14:
                n80.U((n80) this.f34404b, view, i10);
                return;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f34404b, view, i10);
                return;
            case 16:
                kd0 kd0Var = (kd0) this.f34404b;
                kd0Var.f35231i0 = -1L;
                int i24 = kd0Var.G0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) kd0Var.T.J(i10)) != null) {
                        if (kd0Var.f35226e0 == 0) {
                            kd0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            kd0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(kd0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = kd0Var.getMessagesController().getInputChannel(-kd0Var.f35226e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        c2VarArr[0].setOnCancelListener(new da(kd0Var, kd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ca(kd0Var, c2VarArr, tL_messageMediaVenue, 19)), 7));
                        kd0Var.showDialog(c2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = kd0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = kd0Var.f35253z0.geo_point;
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
                    if (kd0Var.F0 != null && kd0Var.f35250x0 != null) {
                        FrameLayout frameLayout = kd0Var.f35237o0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(kd0Var.f35250x0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(kd0Var.f35250x0.getLongitude());
                        kd0Var.F0.b(tL_messageMediaGeo, kd0Var.G0, true, 0, 0L);
                        kd0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && kd0Var.getLocationController().isSharingLocation(kd0Var.f35226e0) && kd0Var.T.j(i10) == 7) {
                    kd0Var.getLocationController().removeSharingLocation(kd0Var.f35226e0);
                    kd0Var.T.l();
                    kd0Var.finishFragment();
                    return;
                } else if (i24 == 2 && kd0Var.getLocationController().isSharingLocation(kd0Var.f35226e0) && kd0Var.T.j(i10) == 6) {
                    if (kd0Var.getLocationController().getSharingLocationInfo(kd0Var.f35226e0).period == Integer.MAX_VALUE) {
                        z10 = false;
                    }
                    kd0Var.s0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (kd0Var.getLocationController().isSharingLocation(kd0Var.f35226e0)) {
                        kd0Var.getLocationController().removeSharingLocation(kd0Var.f35226e0);
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
                        kd0Var.f35231i0 = ed0Var.f33370a;
                        if (kd0Var.f35232j0) {
                            kd0Var.f35232j0 = false;
                            kd0Var.C0();
                        }
                        kd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(ed0Var.e.getPosition(), kd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((dj0) this.f34404b).onBackPressed();
                return;
            case 18:
                lj0 lj0Var = (lj0) this.f34404b;
                int i25 = lj0Var.I;
                if (i10 >= i25 && i10 < lj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) lj0Var.f35579x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!lj0Var.a0(messageObject2)) {
                            lj0Var.getOrCreateStoryViewer().F(lj0Var.getParentActivity(), messageObject2.storyItem, ai.u9.a(lj0Var.f35574f));
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
                        lj0Var.presentFragment(new bo(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.f34404b, view, i10);
                return;
            case 20:
                bq0 bq0Var = (bq0) this.f34404b;
                bq0Var.a(i10, true);
                op0 op0Var = bq0Var.h;
                if (op0Var != null) {
                    op0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 21:
                cr0 cr0Var = (cr0) this.f34404b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = cr0Var.f32883f;
                ArrayList arrayList8 = cr0Var.f32891n;
                MediaController.AlbumEntry albumEntry = cr0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        hr0 hr0Var = cr0Var.f32900t0;
                        if (hr0Var != null) {
                            switch (hr0Var.f34335a) {
                                case 0:
                                    ir0.h0(hr0Var.f34336b, str);
                                    return;
                                default:
                                    ir0.h0(hr0Var.f34336b, str);
                                    return;
                            }
                        }
                        cr0Var.P.getSearchField().setText(str);
                        cr0Var.P.getSearchField().setSelection(str.length());
                        cr0Var.b0(cr0Var.P.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(cr0Var.getParentActivity());
                        alertDialog$Builder4.f18447a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f18447a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new pq0(cr0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder4.f18447a;
                        cr0Var.showDialog(c2Var3);
                        TextView textView3 = (TextView) c2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19101q7, false));
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
                    org.telegram.ui.ActionBar.w0 w0Var = cr0Var.P;
                    if (w0Var != null) {
                        AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                    }
                    if (cr0Var.Y) {
                        cr0Var.a0(view, arrayList7.get(i10));
                        return;
                    }
                    int i26 = cr0Var.T;
                    if (i26 != 1 && i26 != 3) {
                        i16 = i26 == 2 ? 3 : i26 == 10 ? 10 : cr0Var.U == null ? 4 : 0;
                    }
                    PhotoViewer.t1().J2(null, cr0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = cr0Var.H;
                    boolean z18 = cr0Var.I;
                    t12.h = i27;
                    t12.f31030n = z18;
                    PhotoViewer.t1().f2(arrayList7, i10, i16, cr0Var.f32890l0, cr0Var.f32906x0, cr0Var.U);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f34404b;
                ArrayList arrayList9 = photoViewer.f30978g7;
                if (!arrayList9.isEmpty() && (i14 = photoViewer.P4) >= 0 && i14 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f31011k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.A2(indexOf);
                }
                photoViewer.f31011k5 = false;
                return;
            case 23:
                a(i10, view);
                return;
            case 24:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f34404b, view, i10);
                return;
            case 25:
                lx0 lx0Var = (lx0) this.f34404b;
                PremiumPreviewFragment premiumPreviewFragment = lx0Var.f35652n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                ix0 ix0Var = lx0Var.e;
                if (view.isEnabled() && (view instanceof rg.p1)) {
                    rg.p1 p1Var = (rg.p1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(p1Var.getTier());
                    premiumPreviewFragment.t0(true);
                    p1Var.c(true, true);
                    for (int i28 = 0; i28 < ix0Var.getChildCount(); i28++) {
                        View childAt = ix0Var.getChildAt(i28);
                        if (childAt instanceof rg.p1) {
                            rg.p1 p1Var2 = (rg.p1) childAt;
                            if (p1Var2.getTier() != p1Var.getTier()) {
                                p1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < ix0Var.getHiddenChildCount(); i29++) {
                        View W = ix0Var.W(i29);
                        if (W instanceof rg.p1) {
                            rg.p1 p1Var3 = (rg.p1) W;
                            if (p1Var3.getTier() != p1Var.getTier()) {
                                p1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < ix0Var.getCachedChildCount(); i30++) {
                        View Q2 = ix0Var.Q(i30);
                        if (Q2 instanceof rg.p1) {
                            rg.p1 p1Var4 = (rg.p1) Q2;
                            if (p1Var4.getTier() != p1Var.getTier()) {
                                p1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < ix0Var.getAttachedScrapChildCount(); i31++) {
                        View P = ix0Var.P(i31);
                        if (P instanceof rg.p1) {
                            rg.p1 p1Var5 = (rg.p1) P;
                            if (p1Var5.getTier() != p1Var.getTier()) {
                                p1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((nx0Var = premiumPreviewFragment.f31180f) == null || nx0Var.f36175a.months >= ((nx0) arrayList10.get(premiumPreviewFragment.e)).f36175a.months || premiumPreviewFragment.f31191p0)) {
                        z11 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z11);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f34404b, view, i10);
                return;
            case 27:
                b(i10, view);
                return;
            case 28:
                ProfileActivity.f0((ProfileActivity) this.f34404b, i10);
                return;
            default:
                ProxyListActivity.U((ProxyListActivity) this.f34404b, view, i10);
                return;
        }
    }
}
