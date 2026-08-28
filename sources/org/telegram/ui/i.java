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
public final class i implements org.telegram.ui.Components.mk0 {
    public final int f38964a;
    public final Object f38965b;

    public i(Object obj, int i9) {
        this.f38964a = i9;
        this.f38965b = obj;
    }

    private final void b(int i9, View view) {
        boolean z10;
        xu0 xu0Var = (xu0) this.f38965b;
        boolean[] zArr = xu0Var.f44636w;
        if (i9 == xu0Var.f44622k0) {
            xu0Var.e0();
        } else if (view instanceof org.telegram.ui.Cells.t8) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            boolean z11 = xu0Var.H;
            org.telegram.ui.Components.ux0 ux0Var = xu0Var.M;
            if (ux0Var != null) {
                ux0Var.f();
            }
            if (xu0Var.E) {
                int i10 = -xu0Var.K;
                xu0Var.K = i10;
                AndroidUtilities.shakeViewSpring(t8Var, i10);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i9 == xu0Var.f44625n0) {
                z10 = !xu0Var.C;
                xu0Var.C = z10;
            } else {
                int i11 = xu0Var.f44628q0;
                if (i9 == i11) {
                    z10 = !xu0Var.D;
                    xu0Var.D = z10;
                } else if (i9 == xu0Var.f44630r0) {
                    boolean z12 = !xu0Var.F;
                    xu0Var.F = z12;
                    xu0Var.q0();
                    int i12 = xu0Var.f44628q0;
                    if (i12 >= 0 && i11 < 0) {
                        xu0Var.f44609b.o(i12);
                    } else if (i11 >= 0 && i12 < 0) {
                        xu0Var.f44609b.u(i11);
                    }
                    z10 = z12;
                } else if (i9 == xu0Var.f44626o0) {
                    boolean z13 = xu0Var.G;
                    boolean z14 = !z13;
                    xu0Var.G = z14;
                    if (!z13 && xu0Var.H) {
                        int i13 = xu0Var.f44617f0;
                        xu0Var.H = false;
                        xu0Var.q0();
                        f2.q1 K = xu0Var.f44611c.K(xu0Var.f44627p0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.t8) K.f5501a).setChecked(false);
                        } else {
                            xu0Var.f44609b.m(xu0Var.f44627p0);
                        }
                        xu0Var.f44609b.t(i13, 2);
                    }
                    z10 = z14;
                } else if (xu0Var.J == 0) {
                    z10 = !xu0Var.H;
                    xu0Var.H = z10;
                    int i14 = xu0Var.f44617f0;
                    xu0Var.q0();
                    if (xu0Var.H) {
                        xu0Var.f44609b.s(xu0Var.f44617f0, 2);
                    } else {
                        xu0Var.f44609b.t(i14, 2);
                    }
                    if (xu0Var.H && xu0Var.G) {
                        xu0Var.G = false;
                        f2.q1 K2 = xu0Var.f44611c.K(xu0Var.f44626o0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.t8) K2.f5501a).setChecked(false);
                        } else {
                            xu0Var.f44609b.m(xu0Var.f44626o0);
                        }
                    }
                    if (xu0Var.H) {
                        boolean z15 = false;
                        for (int i15 = 0; i15 < zArr.length; i15++) {
                            if (z15) {
                                zArr[i15] = false;
                            } else if (zArr[i15]) {
                                z15 = true;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            if (xu0Var.I && !xu0Var.H) {
                xu0Var.h.b(true);
            }
            xu0Var.f44611c.getChildCount();
            for (int i16 = xu0Var.f44621j0; i16 < xu0Var.f44621j0 + xu0Var.f44640y; i16++) {
                f2.q1 K3 = xu0Var.f44611c.K(i16);
                if (K3 != null) {
                    View view2 = K3.f5501a;
                    if (view2 instanceof org.telegram.ui.Cells.c6) {
                        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view2;
                        c6Var.m(xu0Var.H, true);
                        c6Var.f24201r.a(zArr[i16 - xu0Var.f44621j0], z11);
                        if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i9 == xu0Var.f44627p0 && !xu0Var.I) {
                            xu0Var.h.f(c6Var.getCheckBox(), true);
                            xu0Var.I = true;
                        }
                    }
                }
            }
            t8Var.setChecked(z10);
            xu0Var.h0();
        }
    }

    private final void c(int i9, View view) {
        hw0 hw0Var;
        fw0 fw0Var = (fw0) this.f38965b;
        PremiumPreviewFragment premiumPreviewFragment = fw0Var.f38361n;
        ArrayList arrayList = premiumPreviewFragment.d;
        cw0 cw0Var = fw0Var.f38359e;
        if (view.isEnabled() && (view instanceof zf.p1)) {
            zf.p1 p1Var = (zf.p1) view;
            premiumPreviewFragment.f35846e = arrayList.indexOf(p1Var.getTier());
            boolean z10 = true;
            premiumPreviewFragment.s0(true);
            p1Var.c(true, true);
            for (int i10 = 0; i10 < cw0Var.getChildCount(); i10++) {
                View childAt = cw0Var.getChildAt(i10);
                if (childAt instanceof zf.p1) {
                    zf.p1 p1Var2 = (zf.p1) childAt;
                    if (p1Var2.getTier() != p1Var.getTier()) {
                        p1Var2.c(false, true);
                    }
                }
            }
            for (int i11 = 0; i11 < cw0Var.getHiddenChildCount(); i11++) {
                View V = cw0Var.V(i11);
                if (V instanceof zf.p1) {
                    zf.p1 p1Var3 = (zf.p1) V;
                    if (p1Var3.getTier() != p1Var.getTier()) {
                        p1Var3.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < cw0Var.getCachedChildCount(); i12++) {
                View P = cw0Var.P(i12);
                if (P instanceof zf.p1) {
                    zf.p1 p1Var4 = (zf.p1) P;
                    if (p1Var4.getTier() != p1Var.getTier()) {
                        p1Var4.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < cw0Var.getAttachedScrapChildCount(); i13++) {
                View O = cw0Var.O(i13);
                if (O instanceof zf.p1) {
                    zf.p1 p1Var5 = (zf.p1) O;
                    if (p1Var5.getTier() != p1Var.getTier()) {
                        p1Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.F;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((hw0Var = premiumPreviewFragment.f35848f) == null || hw0Var.f38943a.months >= ((hw0) arrayList.get(premiumPreviewFragment.f35846e)).f38943a.months || premiumPreviewFragment.f35855l0)) {
                z10 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10);
        }
    }

    private final void d(int i9, View view) {
        cx0 cx0Var = (cx0) this.f38965b;
        int i10 = cx0Var.f37349y;
        if (i9 == cx0Var.f37347w) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.y4.O(cx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ax0(cx0Var), null).f22702a;
            c2Var.show();
            c2Var.h();
        } else if (i9 == cx0Var.f37343f) {
            if (i10 == 1) {
                ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
                o2Var.d = new Paint();
                o2Var.f37000f = new av[2];
                o2Var.f37004w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                dy dyVar = new dy(bundle);
                o2Var.f36996a = dyVar;
                dyVar.f37752y2 = new yu(o2Var);
                dyVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                o2Var.f36997b = contactsActivity;
                contactsActivity.S = new yu(o2Var);
                contactsActivity.onFragmentCreate();
                cx0Var.presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
                return;
            }
            Bundle i11 = aa.d.i("isNeverShare", true);
            if (i10 == 2) {
                i11.putInt("chatAddType", 2);
            }
            k60 k60Var = new k60(i11);
            k60Var.f39749w = new zw0(cx0Var);
            cx0Var.presentFragment(k60Var);
        } else if (i9 >= cx0Var.f37345r && i9 < cx0Var.f37346s) {
            if (i10 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", cx0Var.getMessagesController().blockePeers.keyAt(i9 - cx0Var.f37345r));
                cx0Var.presentFragment(new ProfileActivity(bundle3, null));
                return;
            }
            new Bundle();
            throw null;
        }
    }

    @Override
    public final void a(int i9, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        int i10;
        int i11;
        pt ptVar;
        boolean[] zArr;
        e00 e00Var;
        org.telegram.ui.Components.oc a02;
        int i12;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i13;
        org.telegram.ui.Components.tp0 tp0Var;
        int i14 = 3;
        lt ltVar = null;
        boolean z10 = true;
        r5 = 1;
        int i15 = 1;
        switch (this.f38964a) {
            case 0:
                l lVar = (l) this.f38965b;
                ArrayList arrayList = lVar.h;
                if (i9 >= 0 && i9 < arrayList.size()) {
                    int i16 = ((j) arrayList.get(i9)).d;
                    if (i16 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.t8) view).setChecked(z11);
                        lVar.f39953c = true;
                        return;
                    } else if (i16 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.t8) view).setChecked(z12);
                        lVar.f39953c = true;
                        return;
                    } else if (i16 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.l80 l80Var = ybVar.f34916b;
                            l80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.f6.Gi, 0, new kt0(lVar, 3)));
                            l80Var.setSingleLine(false);
                            l80Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            ybVar.f34915a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.gc.g(lVar, ybVar, 3500).j();
                            int i17 = -lVar.f39954e;
                            lVar.f39954e = i17;
                            AndroidUtilities.shakeViewSpring(view, i17);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                        boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                        ((org.telegram.ui.Cells.t8) view).setChecked(z13);
                        lVar.f39953c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                p pVar = (p) this.f38965b;
                if (i9 >= pVar.f41295x && i9 < pVar.f41296y && pVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) pVar.h.get(i9 - pVar.f41295x);
                    if (stickerSetCovered.set.f22407id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f22400id = stickerSetCovered.set.f22407id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.cx0 cx0Var = new org.telegram.ui.Components.cx0(pVar.getParentActivity(), pVar, inputStickerSet, null, null, null);
                    cx0Var.Y = new n(pVar, view, stickerSetCovered);
                    pVar.showDialog(cx0Var);
                    return;
                }
                return;
            case 2:
                vc vcVar = (vc) this.f38965b;
                ArrayList arrayList2 = vcVar.f43430c;
                va1 va1Var = vcVar.d;
                if (i9 >= 0 && i9 < arrayList2.size()) {
                    org.telegram.ui.Components.bp bpVar = (org.telegram.ui.Components.bp) arrayList2.get(i9);
                    vcVar.a(bpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + va1Var.getPaddingLeft()) {
                        va1Var.v0(-((AndroidUtilities.dp(48.0f) + va1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (va1Var.getMeasuredWidth() - va1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        va1Var.v0(org.telegram.messenger.l0.A(48.0f, va1Var.getMeasuredWidth() - va1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = vcVar.f43434r;
                    if (callback != null) {
                        callback.run(bpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                hp hpVar = (hp) this.f38965b;
                boolean z14 = hpVar.f38888s;
                if (hpVar.getParentActivity() != null) {
                    f2.r0 adapter = hpVar.f38882b.getAdapter();
                    gp gpVar = hpVar.f38884e;
                    if (adapter == gpVar) {
                        chat = (TLRPC.Chat) gpVar.d.get(i9);
                    } else {
                        int i18 = hpVar.C;
                        if (i9 >= i18 && i9 < hpVar.D) {
                            chat = (TLRPC.Chat) hpVar.v.get(i9 - i18);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z14 && hpVar.h.linked_chat_id == 0) {
                            hpVar.Z(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f22380id);
                        hpVar.presentFragment(new qn(bundle));
                        return;
                    } else if (i9 == hpVar.B) {
                        if (z14 && hpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{hpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = hpVar.f38885f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            r60 r60Var = new r60(bundle2);
                            r60Var.U = new zo(hpVar);
                            hpVar.presentFragment(r60Var);
                            return;
                        } else if (!hpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) hpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hpVar.getParentActivity());
                            if (z14) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.f22702a.N = string;
                            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new b1(hpVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                            hpVar.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
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
                op opVar = (op) this.f38965b;
                ArrayList arrayList3 = opVar.f41223r;
                boolean z15 = opVar.C;
                if (z15) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                if (i9 > i10) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    if (z15) {
                        i14 = 2;
                    }
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i9 - i14);
                    boolean contains = opVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        opVar.d.add(tL_availableReaction.reaction);
                    } else {
                        opVar.d.remove(tL_availableReaction.reaction);
                        if (opVar.d.isEmpty()) {
                            np npVar = opVar.h;
                            if (npVar != null) {
                                if (opVar.C) {
                                    i11 = 1;
                                } else {
                                    i11 = 2;
                                }
                                npVar.t(i11, arrayList3.size() + 1);
                            }
                            opVar.U(2, true);
                        }
                    }
                    Switch r22 = yVar.f25973c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.dp dpVar = yVar.d;
                    if (dpVar != null) {
                        dpVar.a(z16, true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                dt dtVar = (dt) this.f38965b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((gt) view).d;
                ht htVar = dtVar.f37593a;
                hg.e0 reactionsWindow = htVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f10588q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ix0.c(null, htVar.f38914c0, htVar.f38936z.getContext(), new a5(dtVar, 9));
                    return;
                }
                ft ftVar = htVar.f38923l;
                if (ftVar != null) {
                    ftVar.v(stickerSetCovered2.set, TextUtils.join("", htVar.f38926o));
                }
                htVar.p();
                return;
            case 6:
                qt qtVar = (qt) this.f38965b;
                if (qtVar.f42191f && qtVar.f42190e) {
                    ot otVar = qtVar.d;
                    ArrayList arrayList4 = otVar.f41238e;
                    if (arrayList4 != null && i9 >= 0 && i9 < arrayList4.size()) {
                        ltVar = (lt) otVar.f41238e.get(i9);
                    }
                } else {
                    int S = qtVar.f42189c.S(i9);
                    int Q = qtVar.f42189c.Q(i9);
                    if (Q >= 0 && S >= 0) {
                        ltVar = qtVar.f42189c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i9 >= 0) {
                    qtVar.finishFragment();
                    if (ltVar != null && (ptVar = qtVar.f42193r) != null) {
                        ptVar.a1(ltVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ku kuVar = (ku) this.f38965b;
                ArrayList arrayList5 = kuVar.Y2;
                ou ouVar = kuVar.f39930k3;
                if ((view instanceof du) && i9 >= 0 && i9 < arrayList5.size()) {
                    fu fuVar = (fu) arrayList5.get(i9);
                    if (fuVar != null) {
                        int i19 = fuVar.h;
                        if (i19 >= 0) {
                            kuVar.f39924e3[i19] = !zArr[i19];
                            kuVar.A1(true);
                            return;
                        } else if (i19 == -2) {
                            ouVar.presentFragment(new DataAutoDownloadActivity(kuVar.U2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.p8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ouVar.getParentActivity());
                    alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new gu(kuVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                    ouVar.showDialog(c2Var2);
                    TextView textView2 = (TextView) c2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                lz.U((lz) this.f38965b, view, i9);
                return;
            case 9:
                n00 n00Var = (n00) this.f38965b;
                if (n00Var.getParentActivity() != null && (e00Var = (e00) n00Var.L.get(i9)) != null) {
                    View.OnClickListener onClickListener = e00Var.f37767c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i20 = e00Var.f48814a;
                    if (i20 == 1) {
                        org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                        n00Var.u0(e00Var, vaVar.getName(), vaVar.getCurrentObject(), e00Var.f37770g);
                        return;
                    } else if (i20 == 7) {
                        org.telegram.ui.Components.p61 p61Var = new org.telegram.ui.Components.p61(20, n00Var, e00Var);
                        if (n00Var.f40566c.isEnabled()) {
                            n00Var.r0(p61Var, false);
                            return;
                        } else {
                            p61Var.run();
                            return;
                        }
                    } else if (i20 == 8 || (i20 == 4 && e00Var.f37773k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = n00Var.f40570r;
                        if (n00Var.f40571s && n00Var.f40566c.getAlpha() > 0.0f) {
                            float f10 = -n00Var.M;
                            n00Var.M = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            n00Var.v = true;
                            wi wiVar = n00Var.N;
                            if (wiVar == null || wiVar.getVisibility() != 0) {
                                wi wiVar2 = new wi(6, 3, n00Var.getParentActivity(), null, true);
                                n00Var.N = wiVar2;
                                wiVar2.f32342a.setMaxWidth(AndroidUtilities.displaySize.x);
                                n00Var.N.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                n00Var.N.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                n00Var.getParentLayout().getOverlayContainerView().addView(n00Var.N, marginLayoutParams);
                                n00Var.N.f(n00Var.f40566c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(n00Var.f40572w) || !TextUtils.isEmpty(dialogFilter.name)) && (n00Var.f40574y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && n00Var.C.isEmpty() && !n00Var.B.isEmpty()) {
                            n00Var.r0(new pz(n00Var, 1), false);
                            return;
                        } else {
                            float f11 = -n00Var.M;
                            n00Var.M = f11;
                            AndroidUtilities.shakeViewSpring(view, f11);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(n00Var.f40572w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.oc.a0(n00Var);
                                i12 = R.string.FilterInviteErrorEmptyName;
                            } else if ((n00Var.f40574y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!n00Var.C.isEmpty()) {
                                    a02 = org.telegram.ui.Components.oc.a0(n00Var);
                                    i12 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.oc.a0(n00Var);
                                    i12 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (n00Var.B.isEmpty()) {
                                a02 = org.telegram.ui.Components.oc.a0(n00Var);
                                i12 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.oc.a0(n00Var);
                                i12 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.ll.p(i12, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                a00 a00Var = (a00) this.f38965b;
                ArrayList arrayList6 = a00Var.Z;
                int i21 = i9 - 1;
                if (i21 >= 0 && i21 < arrayList6.size()) {
                    e00 e00Var2 = (e00) arrayList6.get(i21);
                    int i22 = e00Var2.f48814a;
                    if (i22 == 7) {
                        a00Var.dismiss();
                        a00Var.f32410n.presentFragment(new lz(a00Var.T, e00Var2.f37775m));
                        return;
                    } else if (i22 == 8) {
                        a00Var.P();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                f10 f10Var = (f10) this.f38965b;
                if (view instanceof org.telegram.ui.Cells.i7) {
                    f10Var.f(i9, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.l7) {
                    f10Var.f(i9, view, ((org.telegram.ui.Cells.l7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    f10Var.f(i9, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    f10Var.f(i9, view, ((org.telegram.ui.Cells.e2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.r2) {
                    f10Var.f(i9, view, ((org.telegram.ui.Cells.r2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 12:
                t60 t60Var = (t60) this.f38965b;
                if (t60Var.getParentActivity() != null) {
                    if (i9 != t60Var.f42874n && i9 != 0) {
                        if (i9 == t60Var.f42876s) {
                            if (t60Var.f42873f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", t60Var.f42873f.link);
                                    t60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                            }
                            return;
                        } else if (i9 == t60Var.f42875r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(t60Var.getParentActivity());
                            alertDialog$Builder3.f22702a.P = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new wt(t60Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            t60Var.showDialog(alertDialog$Builder3.f22702a);
                            return;
                        } else {
                            return;
                        }
                    } else if (t60Var.f42873f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", t60Var.f42873f.link));
                            org.telegram.ui.Components.oc.j(t60Var).j();
                            return;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                z60.T((z60) this.f38965b, view, i9);
                return;
            case 14:
                q70.T((q70) this.f38965b, view, i9);
                return;
            case 15:
                LanguageSelectActivity.T((LanguageSelectActivity) this.f38965b, view, i9);
                return;
            case 16:
                pc0 pc0Var = (pc0) this.f38965b;
                pc0Var.f41449e0 = -1L;
                int i23 = pc0Var.C0;
                if (i23 == 4) {
                    if (i9 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) pc0Var.P.J(i9)) != null) {
                        if (pc0Var.f41442a0 == 0) {
                            pc0Var.B0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                            pc0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(pc0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = pc0Var.getMessagesController().getInputChannel(-pc0Var.f41442a0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        c2VarArr[0].setOnCancelListener(new gh.x(pc0Var, pc0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new y9(pc0Var, c2VarArr, tL_messageMediaVenue, 19)), 8));
                        pc0Var.showDialog(c2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i23 == 5) {
                    IMapsProvider.IMap iMap = pc0Var.E;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = pc0Var.f41469v0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), pc0Var.E.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i9 == 1 && (messageObject = pc0Var.f41473x0) != null && (!messageObject.isLiveLocation() || i23 == 6)) {
                    IMapsProvider.IMap iMap2 = pc0Var.E;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = pc0Var.f41473x0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), pc0Var.E.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i9 == 1 && i23 != 2) {
                    if (pc0Var.B0 != null && pc0Var.f41467t0 != null) {
                        FrameLayout frameLayout = pc0Var.f41456k0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(pc0Var.f41467t0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(pc0Var.f41467t0.getLongitude());
                        pc0Var.B0.d(tL_messageMediaGeo, pc0Var.C0, true, 0, 0L);
                        pc0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i23 == 2 && pc0Var.getLocationController().isSharingLocation(pc0Var.f41442a0) && pc0Var.P.j(i9) == 7) {
                    pc0Var.getLocationController().removeSharingLocation(pc0Var.f41442a0);
                    pc0Var.P.l();
                    pc0Var.finishFragment();
                    return;
                } else if (i23 == 2 && pc0Var.getLocationController().isSharingLocation(pc0Var.f41442a0) && pc0Var.P.j(i9) == 6) {
                    if (pc0Var.getLocationController().getSharingLocationInfo(pc0Var.f41442a0).period == Integer.MAX_VALUE) {
                        z10 = false;
                    }
                    pc0Var.r0(z10);
                    return;
                } else if ((i9 == 2 && i23 == 1) || ((i9 == 1 && i23 == 2) || (i9 == 3 && i23 == 3))) {
                    if (pc0Var.getLocationController().isSharingLocation(pc0Var.f41442a0)) {
                        pc0Var.getLocationController().removeSharingLocation(pc0Var.f41442a0);
                        pc0Var.P.l();
                        pc0Var.finishFragment();
                        return;
                    }
                    pc0Var.r0(false);
                    return;
                } else {
                    Object J = pc0Var.P.J(i9);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        pc0Var.B0.d((TLRPC.TL_messageMediaVenue) J, pc0Var.C0, true, 0, 0L);
                        pc0Var.finishFragment();
                        return;
                    } else if (J instanceof jc0) {
                        jc0 jc0Var = (jc0) J;
                        pc0Var.f41449e0 = jc0Var.f39436a;
                        if (pc0Var.f41451f0) {
                            pc0Var.f41451f0 = false;
                            pc0Var.B0();
                        }
                        pc0Var.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(jc0Var.f39439e.getPosition(), pc0Var.E.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((li0) this.f38965b).onBackPressed();
                return;
            case 18:
                ti0 ti0Var = (ti0) this.f38965b;
                int i24 = ti0Var.E;
                if (i9 >= i24 && i9 < ti0Var.F) {
                    MessageObject messageObject2 = (MessageObject) ti0Var.f43020x.get(i9 - i24);
                    if (messageObject2.isStory()) {
                        if (!ti0Var.Z(messageObject2)) {
                            ti0Var.getOrCreateStoryViewer().F(ti0Var.getParentActivity(), messageObject2.storyItem, ih.e7.a(ti0Var.f43015f));
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
                    if (ti0Var.getMessagesController().checkCanOpenChat(bundle3, ti0Var)) {
                        ti0Var.presentFragment(new qn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.U((PasscodeActivity) this.f38965b, view, i9);
                return;
            case 20:
                zp0 zp0Var = (zp0) this.f38965b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = zp0Var.f45215f;
                ArrayList arrayList8 = zp0Var.f45223n;
                MediaController.AlbumEntry albumEntry = zp0Var.F;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i9 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i9);
                        dq0 dq0Var = zp0Var.f45226p0;
                        if (dq0Var != null) {
                            switch (dq0Var.f37583a) {
                                case 0:
                                    eq0.g0(dq0Var.f37584b, str);
                                    return;
                                default:
                                    eq0.g0(dq0Var.f37584b, str);
                                    return;
                            }
                        }
                        zp0Var.L.getSearchField().setText(str);
                        zp0Var.L.getSearchField().setSelection(str.length());
                        zp0Var.a0(zp0Var.L.getSearchField());
                        return;
                    } else if (i9 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(zp0Var.getParentActivity());
                        alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f22702a.P = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new mp0(zp0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder4.f22702a;
                        zp0Var.showDialog(c2Var3);
                        TextView textView3 = (TextView) c2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
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
                if (i9 >= 0 && i9 < arrayList7.size()) {
                    org.telegram.ui.ActionBar.w0 w0Var = zp0Var.L;
                    if (w0Var != null) {
                        AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                    }
                    if (zp0Var.U) {
                        zp0Var.Z(view, arrayList7.get(i9));
                        return;
                    }
                    int i25 = zp0Var.P;
                    if (i25 != 1 && i25 != 3) {
                        i15 = i25 == 2 ? 3 : i25 == 10 ? 10 : zp0Var.Q == null ? 4 : 0;
                    }
                    PhotoViewer.t1().K2(null, zp0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i26 = zp0Var.D;
                    boolean z17 = zp0Var.E;
                    t12.h = i26;
                    t12.f35697n = z17;
                    PhotoViewer.t1().f2(arrayList7, i9, i15, zp0Var.f45218h0, zp0Var.f45232t0, zp0Var.Q);
                    return;
                }
                return;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) this.f38965b;
                ArrayList arrayList9 = photoViewer.f35605c7;
                if (!arrayList9.isEmpty() && (i13 = photoViewer.L4) >= 0 && i13 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.L4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f35641g5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.L4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.f35641g5 = false;
                return;
            case 22:
                b(i9, view);
                return;
            case 23:
                PremiumPreviewFragment.T((PremiumPreviewFragment) this.f38965b, view, i9);
                return;
            case 24:
                c(i9, view);
                return;
            case 25:
                PrivacyControlActivity.W((PrivacyControlActivity) this.f38965b, view, i9);
                return;
            case 26:
                d(i9, view);
                return;
            case 27:
                ProfileActivity.e0((ProfileActivity) this.f38965b, i9);
                return;
            case 28:
                ProxyListActivity.T((ProxyListActivity) this.f38965b, view, i9);
                return;
            default:
                y11 y11Var = (y11) this.f38965b;
                org.telegram.ui.Components.wk0 wk0Var = y11Var.f44684y;
                org.telegram.ui.Components.ap apVar = y11Var.f44675b;
                if (apVar.d.get(i9) != y11Var.G && y11Var.K == null) {
                    y11Var.M = false;
                    y11Var.G = (org.telegram.ui.Components.bp) apVar.d.get(i9);
                    apVar.E(i9);
                    y11Var.h.postDelayed(new org.telegram.ui.Components.qd(y11Var, i9, 24), 100L);
                    for (int i27 = 0; i27 < wk0Var.getChildCount(); i27++) {
                        org.telegram.ui.Components.a11 a11Var = (org.telegram.ui.Components.a11) wk0Var.getChildAt(i27);
                        if (a11Var != view && (tp0Var = a11Var.F) != null) {
                            AndroidUtilities.cancelRunOnUIThread(tp0Var);
                            a11Var.F.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.bp) apVar.d.get(i9)).f27261a.f22748a) {
                        ((org.telegram.ui.Components.a11) view).d();
                    }
                    l11 l11Var = y11Var.F;
                    if (l11Var != null) {
                        l11Var.f39969a.c0(i9, y11Var.G.f27261a, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
