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
public final class j implements org.telegram.ui.Components.zk0 {
    public final int f39374a;
    public final Object f39375b;

    public j(Object obj, int i10) {
        this.f39374a = i10;
        this.f39375b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        vu0 vu0Var = (vu0) this.f39375b;
        boolean[] zArr = vu0Var.f43781w;
        if (i10 == vu0Var.f43767k0) {
            vu0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.q8) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            boolean z11 = vu0Var.H;
            org.telegram.ui.Components.fy0 fy0Var = vu0Var.M;
            if (fy0Var != null) {
                fy0Var.f();
            }
            if (vu0Var.E) {
                int i11 = -vu0Var.K;
                vu0Var.K = i11;
                AndroidUtilities.shakeViewSpring(q8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == vu0Var.f43770n0) {
                z10 = !vu0Var.C;
                vu0Var.C = z10;
            } else {
                int i12 = vu0Var.f43773q0;
                if (i10 == i12) {
                    z10 = !vu0Var.D;
                    vu0Var.D = z10;
                } else if (i10 == vu0Var.f43775r0) {
                    boolean z12 = !vu0Var.F;
                    vu0Var.F = z12;
                    vu0Var.r0();
                    int i13 = vu0Var.f43773q0;
                    if (i13 >= 0 && i12 < 0) {
                        vu0Var.f43754b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        vu0Var.f43754b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == vu0Var.f43771o0) {
                    boolean z13 = vu0Var.G;
                    boolean z14 = !z13;
                    vu0Var.G = z14;
                    if (!z13 && vu0Var.H) {
                        int i14 = vu0Var.f43762f0;
                        vu0Var.H = false;
                        vu0Var.r0();
                        f2.n1 K = vu0Var.f43756c.K(vu0Var.f43772p0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.q8) K.f6432a).setChecked(false);
                        } else {
                            vu0Var.f43754b.m(vu0Var.f43772p0);
                        }
                        vu0Var.f43754b.t(i14, 2);
                    }
                    z10 = z14;
                } else if (vu0Var.J == 0) {
                    z10 = !vu0Var.H;
                    vu0Var.H = z10;
                    int i15 = vu0Var.f43762f0;
                    vu0Var.r0();
                    if (vu0Var.H) {
                        vu0Var.f43754b.s(vu0Var.f43762f0, 2);
                    } else {
                        vu0Var.f43754b.t(i15, 2);
                    }
                    if (vu0Var.H && vu0Var.G) {
                        vu0Var.G = false;
                        f2.n1 K2 = vu0Var.f43756c.K(vu0Var.f43771o0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.q8) K2.f6432a).setChecked(false);
                        } else {
                            vu0Var.f43754b.m(vu0Var.f43771o0);
                        }
                    }
                    if (vu0Var.H) {
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
            if (vu0Var.I && !vu0Var.H) {
                vu0Var.h.b(true);
            }
            vu0Var.f43756c.getChildCount();
            for (int i17 = vu0Var.f43766j0; i17 < vu0Var.f43766j0 + vu0Var.f43785y; i17++) {
                f2.n1 K3 = vu0Var.f43756c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f6432a;
                    if (view2 instanceof org.telegram.ui.Cells.a6) {
                        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view2;
                        a6Var.m(vu0Var.H, true);
                        a6Var.f24087r.a(zArr[i17 - vu0Var.f43766j0], z11);
                        if (a6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == vu0Var.f43772p0 && !vu0Var.I) {
                            vu0Var.h.f(a6Var.getCheckBox(), true);
                            vu0Var.I = true;
                        }
                    }
                }
            }
            q8Var.setChecked(z10);
            vu0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        gw0 gw0Var;
        ew0 ew0Var = (ew0) this.f39375b;
        PremiumPreviewFragment premiumPreviewFragment = ew0Var.f37915n;
        ArrayList arrayList = premiumPreviewFragment.d;
        bw0 bw0Var = ew0Var.f37913e;
        if (view.isEnabled() && (view instanceof cg.l2)) {
            cg.l2 l2Var = (cg.l2) view;
            premiumPreviewFragment.f35912e = arrayList.indexOf(l2Var.getTier());
            boolean z10 = true;
            premiumPreviewFragment.t0(true);
            l2Var.c(true, true);
            for (int i11 = 0; i11 < bw0Var.getChildCount(); i11++) {
                View childAt = bw0Var.getChildAt(i11);
                if (childAt instanceof cg.l2) {
                    cg.l2 l2Var2 = (cg.l2) childAt;
                    if (l2Var2.getTier() != l2Var.getTier()) {
                        l2Var2.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < bw0Var.getHiddenChildCount(); i12++) {
                View V = bw0Var.V(i12);
                if (V instanceof cg.l2) {
                    cg.l2 l2Var3 = (cg.l2) V;
                    if (l2Var3.getTier() != l2Var.getTier()) {
                        l2Var3.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < bw0Var.getCachedChildCount(); i13++) {
                View P = bw0Var.P(i13);
                if (P instanceof cg.l2) {
                    cg.l2 l2Var4 = (cg.l2) P;
                    if (l2Var4.getTier() != l2Var.getTier()) {
                        l2Var4.c(false, true);
                    }
                }
            }
            for (int i14 = 0; i14 < bw0Var.getAttachedScrapChildCount(); i14++) {
                View O = bw0Var.O(i14);
                if (O instanceof cg.l2) {
                    cg.l2 l2Var5 = (cg.l2) O;
                    if (l2Var5.getTier() != l2Var.getTier()) {
                        l2Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.F;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((gw0Var = premiumPreviewFragment.f35914f) == null || gw0Var.f38677a.months >= ((gw0) arrayList.get(premiumPreviewFragment.f35912e)).f38677a.months || premiumPreviewFragment.f35921l0)) {
                z10 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10);
        }
    }

    private final void d(int i10, View view) {
        bx0 bx0Var = (bx0) this.f39375b;
        int i11 = bx0Var.f36941y;
        if (i10 == bx0Var.f36939w) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.O(bx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new zw0(bx0Var), null).f22714a;
            c2Var.show();
            c2Var.h();
        } else if (i10 == bx0Var.f36935f) {
            if (i11 == 1) {
                ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
                o2Var.d = new Paint();
                o2Var.f37222f = new bv[2];
                o2Var.f37226w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                fy fyVar = new fy(bundle);
                o2Var.f37218a = fyVar;
                fyVar.f38379y2 = new zu(o2Var);
                fyVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                o2Var.f37219b = contactsActivity;
                contactsActivity.S = new zu(o2Var);
                contactsActivity.onFragmentCreate();
                bx0Var.presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
                return;
            }
            Bundle i12 = a4.w.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            m60 m60Var = new m60(i12);
            m60Var.f40465w = new yw0(bx0Var);
            bx0Var.presentFragment(m60Var);
        } else if (i10 >= bx0Var.f36937r && i10 < bx0Var.f36938s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", bx0Var.getMessagesController().blockePeers.keyAt(i10 - bx0Var.f36937r));
                bx0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        int i11;
        int i12;
        qt qtVar;
        boolean[] zArr;
        g00 g00Var;
        org.telegram.ui.Components.tc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        org.telegram.ui.Components.fq0 fq0Var;
        int i15 = 3;
        lt ltVar = null;
        boolean z10 = true;
        r5 = 1;
        int i16 = 1;
        switch (this.f39374a) {
            case 0:
                n nVar = (n) this.f39375b;
                ArrayList arrayList = nVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((l) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = nVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z11);
                        nVar.f40656c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = nVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z12);
                        nVar.f40656c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!nVar.getUserConfig().isPremium() && !nVar.getMessagesController().autoarchiveAvailable && !nVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(nVar.getParentActivity(), nVar.getResourceProvider());
                            org.telegram.ui.Components.y80 y80Var = ecVar.f28000b;
                            y80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.g6.Gi, 0, new it0(nVar, 3)));
                            y80Var.setSingleLine(false);
                            y80Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            ecVar.f27999a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.mc.g(nVar, ecVar, 3500).j();
                            int i18 = -nVar.f40657e;
                            nVar.f40657e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = nVar.d;
                        boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z13);
                        nVar.f40656c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                r rVar = (r) this.f39375b;
                if (i10 >= rVar.f41825x && i10 < rVar.f41826y && rVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) rVar.h.get(i10 - rVar.f41825x);
                    if (stickerSetCovered.set.f22419id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f22412id = stickerSetCovered.set.f22419id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.nx0 nx0Var = new org.telegram.ui.Components.nx0(rVar.getParentActivity(), rVar, inputStickerSet, null, null, null);
                    nx0Var.Y = new p(rVar, view, stickerSetCovered);
                    rVar.showDialog(nx0Var);
                    return;
                }
                return;
            case 2:
                tc tcVar = (tc) this.f39375b;
                ArrayList arrayList2 = tcVar.f42646c;
                wa1 wa1Var = tcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.fp fpVar = (org.telegram.ui.Components.fp) arrayList2.get(i10);
                    tcVar.a(fpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + wa1Var.getPaddingLeft()) {
                        wa1Var.v0(-((AndroidUtilities.dp(48.0f) + wa1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (wa1Var.getMeasuredWidth() - wa1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        wa1Var.v0(org.telegram.messenger.x3.z(48.0f, wa1Var.getMeasuredWidth() - wa1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = tcVar.f42650r;
                    if (callback != null) {
                        callback.run(fpVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                kp kpVar = (kp) this.f39375b;
                boolean z14 = kpVar.f39984s;
                if (kpVar.getParentActivity() != null) {
                    f2.p0 adapter = kpVar.f39978b.getAdapter();
                    jp jpVar = kpVar.f39980e;
                    if (adapter == jpVar) {
                        chat = (TLRPC.Chat) jpVar.d.get(i10);
                    } else {
                        int i19 = kpVar.C;
                        if (i10 >= i19 && i10 < kpVar.D) {
                            chat = (TLRPC.Chat) kpVar.v.get(i10 - i19);
                        } else {
                            chat = null;
                        }
                    }
                    if (chat != null) {
                        if (z14 && kpVar.h.linked_chat_id == 0) {
                            kpVar.a0(chat, true);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chat.f22392id);
                        kpVar.presentFragment(new tn(bundle));
                        return;
                    } else if (i10 == kpVar.B) {
                        if (z14 && kpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{kpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = kpVar.f39981f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            t60 t60Var = new t60(bundle2);
                            t60Var.U = new cp(kpVar);
                            kpVar.presentFragment(t60Var);
                            return;
                        } else if (!kpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) kpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kpVar.getParentActivity());
                            if (z14) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.f22714a.N = string;
                            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new c1(kpVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                            kpVar.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
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
                rp rpVar = (rp) this.f39375b;
                ArrayList arrayList3 = rpVar.f42176r;
                boolean z15 = rpVar.C;
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
                    boolean contains = rpVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        rpVar.d.add(tL_availableReaction.reaction);
                    } else {
                        rpVar.d.remove(tL_availableReaction.reaction);
                        if (rpVar.d.isEmpty()) {
                            qp qpVar = rpVar.h;
                            if (qpVar != null) {
                                if (rpVar.C) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                qpVar.t(i12, arrayList3.size() + 1);
                            }
                            rpVar.V(2, true);
                        }
                    }
                    Switch r22 = yVar.f25976c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.hp hpVar = yVar.d;
                    if (hpVar != null) {
                        hpVar.a(z16, true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                dt dtVar = (dt) this.f39375b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((gt) view).d;
                ht htVar = dtVar.f37629a;
                kg.d0 reactionsWindow = htVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f13695q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.tx0.c(null, htVar.f39023c0, htVar.f39045z.getContext(), new b5(dtVar, 9));
                    return;
                }
                ft ftVar = htVar.f39032l;
                if (ftVar != null) {
                    ftVar.u(stickerSetCovered2.set, TextUtils.join("", htVar.f39035o));
                }
                htVar.p();
                return;
            case 6:
                rt rtVar = (rt) this.f39375b;
                if (rtVar.f42201f && rtVar.f42200e) {
                    pt ptVar = rtVar.d;
                    ArrayList arrayList4 = ptVar.f41460e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        ltVar = (lt) ptVar.f41460e.get(i10);
                    }
                } else {
                    int S = rtVar.f42199c.S(i10);
                    int Q = rtVar.f42199c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        ltVar = rtVar.f42199c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    rtVar.finishFragment();
                    if (ltVar != null && (qtVar = rtVar.f42203r) != null) {
                        qtVar.Z0(ltVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                lu luVar = (lu) this.f39375b;
                ArrayList arrayList5 = luVar.Y2;
                pu puVar = luVar.f40288k3;
                if ((view instanceof eu) && i10 >= 0 && i10 < arrayList5.size()) {
                    gu guVar = (gu) arrayList5.get(i10);
                    if (guVar != null) {
                        int i20 = guVar.h;
                        if (i20 >= 0) {
                            luVar.f40282e3[i20] = !zArr[i20];
                            luVar.A1(true);
                            return;
                        } else if (i20 == -2) {
                            puVar.presentFragment(new DataAutoDownloadActivity(luVar.U2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.m8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(puVar.getParentActivity());
                    alertDialog$Builder2.f22714a.N = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f22714a.P = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new hu(luVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                    puVar.showDialog(c2Var2);
                    TextView textView2 = (TextView) c2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                nz.V((nz) this.f39375b, view, i10);
                return;
            case 9:
                p00 p00Var = (p00) this.f39375b;
                if (p00Var.getParentActivity() != null && (g00Var = (g00) p00Var.L.get(i10)) != null) {
                    View.OnClickListener onClickListener = g00Var.f38401c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = g00Var.f50845a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
                        p00Var.v0(g00Var, saVar.getName(), saVar.getCurrentObject(), g00Var.f38404g);
                        return;
                    } else if (i21 == 7) {
                        org.telegram.ui.Components.voip.o oVar = new org.telegram.ui.Components.voip.o(17, p00Var, g00Var);
                        if (p00Var.f41262c.isEnabled()) {
                            p00Var.s0(oVar, false);
                            return;
                        } else {
                            oVar.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && g00Var.f38407k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = p00Var.f41266r;
                        if (p00Var.f41267s && p00Var.f41262c.getAlpha() > 0.0f) {
                            float f9 = -p00Var.M;
                            p00Var.M = f9;
                            AndroidUtilities.shakeViewSpring(view, f9);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            p00Var.v = true;
                            zi ziVar = p00Var.N;
                            if (ziVar == null || ziVar.getVisibility() != 0) {
                                zi ziVar2 = new zi(6, 3, p00Var.getParentActivity(), null, true);
                                p00Var.N = ziVar2;
                                ziVar2.f28745a.setMaxWidth(AndroidUtilities.displaySize.x);
                                p00Var.N.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                p00Var.N.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                p00Var.getParentLayout().getOverlayContainerView().addView(p00Var.N, marginLayoutParams);
                                p00Var.N.f(p00Var.f41262c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(p00Var.f41268w) || !TextUtils.isEmpty(dialogFilter.name)) && (p00Var.f41270y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && p00Var.C.isEmpty() && !p00Var.B.isEmpty()) {
                            p00Var.s0(new rz(p00Var, 1), false);
                            return;
                        } else {
                            float f10 = -p00Var.M;
                            p00Var.M = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(p00Var.f41268w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.tc.a0(p00Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((p00Var.f41270y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!p00Var.C.isEmpty()) {
                                    a02 = org.telegram.ui.Components.tc.a0(p00Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.tc.a0(p00Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (p00Var.B.isEmpty()) {
                                a02 = org.telegram.ui.Components.tc.a0(p00Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.tc.a0(p00Var);
                                i13 = R.string.FilterInviteErrorExcluded;
                            }
                            org.telegram.messenger.x3.s(i13, a02, null);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                c00 c00Var = (c00) this.f39375b;
                ArrayList arrayList6 = c00Var.Z;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    g00 g00Var2 = (g00) arrayList6.get(i22);
                    int i23 = g00Var2.f50845a;
                    if (i23 == 7) {
                        c00Var.dismiss();
                        c00Var.f34662n.presentFragment(new nz(c00Var.T, g00Var2.f38409m));
                        return;
                    } else if (i23 == 8) {
                        c00Var.Q();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                h10 h10Var = (h10) this.f39375b;
                if (view instanceof org.telegram.ui.Cells.g7) {
                    h10Var.f(i10, view, ((org.telegram.ui.Cells.g7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    h10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.f7) {
                    h10Var.f(i10, view, ((org.telegram.ui.Cells.f7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    h10Var.f(i10, view, ((org.telegram.ui.Cells.d2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.p2) {
                    h10Var.f(i10, view, ((org.telegram.ui.Cells.p2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 12:
                v60 v60Var = (v60) this.f39375b;
                if (v60Var.getParentActivity() != null) {
                    if (i10 != v60Var.f43444n && i10 != 0) {
                        if (i10 == v60Var.f43446s) {
                            if (v60Var.f43443f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", v60Var.f43443f.link);
                                    v60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == v60Var.f43445r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(v60Var.getParentActivity());
                            alertDialog$Builder3.f22714a.P = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f22714a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new xt(v60Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            v60Var.showDialog(alertDialog$Builder3.f22714a);
                            return;
                        } else {
                            return;
                        }
                    } else if (v60Var.f43443f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", v60Var.f43443f.link));
                            org.telegram.ui.Components.tc.j(v60Var).j();
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
                c70.U((c70) this.f39375b, view, i10);
                return;
            case 14:
                s70.U((s70) this.f39375b, view, i10);
                return;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f39375b, view, i10);
                return;
            case 16:
                rc0 rc0Var = (rc0) this.f39375b;
                rc0Var.f42040e0 = -1L;
                int i24 = rc0Var.C0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) rc0Var.P.J(i10)) != null) {
                        if (rc0Var.f42033a0 == 0) {
                            rc0Var.B0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                            rc0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(rc0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = rc0Var.getMessagesController().getInputChannel(-rc0Var.f42033a0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        c2VarArr[0].setOnCancelListener(new jh.w(rc0Var, rc0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new x9(rc0Var, c2VarArr, tL_messageMediaVenue, 19)), 8));
                        rc0Var.showDialog(c2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = rc0Var.E;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = rc0Var.f42060v0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), rc0Var.E.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = rc0Var.f42064x0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = rc0Var.E;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = rc0Var.f42064x0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), rc0Var.E.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i24 != 2) {
                    if (rc0Var.B0 != null && rc0Var.f42058t0 != null) {
                        FrameLayout frameLayout = rc0Var.f42047k0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(rc0Var.f42058t0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(rc0Var.f42058t0.getLongitude());
                        rc0Var.B0.d(tL_messageMediaGeo, rc0Var.C0, true, 0, 0L);
                        rc0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && rc0Var.getLocationController().isSharingLocation(rc0Var.f42033a0) && rc0Var.P.j(i10) == 7) {
                    rc0Var.getLocationController().removeSharingLocation(rc0Var.f42033a0);
                    rc0Var.P.l();
                    rc0Var.finishFragment();
                    return;
                } else if (i24 == 2 && rc0Var.getLocationController().isSharingLocation(rc0Var.f42033a0) && rc0Var.P.j(i10) == 6) {
                    if (rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42033a0).period == Integer.MAX_VALUE) {
                        z10 = false;
                    }
                    rc0Var.s0(z10);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (rc0Var.getLocationController().isSharingLocation(rc0Var.f42033a0)) {
                        rc0Var.getLocationController().removeSharingLocation(rc0Var.f42033a0);
                        rc0Var.P.l();
                        rc0Var.finishFragment();
                        return;
                    }
                    rc0Var.s0(false);
                    return;
                } else {
                    Object J = rc0Var.P.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        rc0Var.B0.d((TLRPC.TL_messageMediaVenue) J, rc0Var.C0, true, 0, 0L);
                        rc0Var.finishFragment();
                        return;
                    } else if (J instanceof lc0) {
                        lc0 lc0Var = (lc0) J;
                        rc0Var.f42040e0 = lc0Var.f40164a;
                        if (rc0Var.f42042f0) {
                            rc0Var.f42042f0 = false;
                            rc0Var.C0();
                        }
                        rc0Var.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(lc0Var.f40167e.getPosition(), rc0Var.E.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((ki0) this.f39375b).onBackPressed();
                return;
            case 18:
                si0 si0Var = (si0) this.f39375b;
                int i25 = si0Var.E;
                if (i10 >= i25 && i10 < si0Var.F) {
                    MessageObject messageObject2 = (MessageObject) si0Var.f42411x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!si0Var.a0(messageObject2)) {
                            si0Var.getOrCreateStoryViewer().G(si0Var.getParentActivity(), messageObject2.storyItem, lh.b7.a(si0Var.f42406f));
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
                    if (si0Var.getMessagesController().checkCanOpenChat(bundle3, si0Var)) {
                        si0Var.presentFragment(new tn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.f39375b, view, i10);
                return;
            case 20:
                zp0 zp0Var = (zp0) this.f39375b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = zp0Var.f45280f;
                ArrayList arrayList8 = zp0Var.f45288n;
                MediaController.AlbumEntry albumEntry = zp0Var.F;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        dq0 dq0Var = zp0Var.f45291p0;
                        if (dq0Var != null) {
                            switch (dq0Var.f37609a) {
                                case 0:
                                    eq0.h0(dq0Var.f37610b, str);
                                    return;
                                default:
                                    eq0.h0(dq0Var.f37610b, str);
                                    return;
                            }
                        }
                        zp0Var.L.getSearchField().setText(str);
                        zp0Var.L.getSearchField().setSelection(str.length());
                        zp0Var.b0(zp0Var.L.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(zp0Var.getParentActivity());
                        alertDialog$Builder4.f22714a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f22714a.P = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new lp0(zp0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder4.f22714a;
                        zp0Var.showDialog(c2Var3);
                        TextView textView3 = (TextView) c2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
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
                    org.telegram.ui.ActionBar.w0 w0Var = zp0Var.L;
                    if (w0Var != null) {
                        AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                    }
                    if (zp0Var.U) {
                        zp0Var.a0(view, arrayList7.get(i10));
                        return;
                    }
                    int i26 = zp0Var.P;
                    if (i26 != 1 && i26 != 3) {
                        i16 = i26 == 2 ? 3 : i26 == 10 ? 10 : zp0Var.Q == null ? 4 : 0;
                    }
                    PhotoViewer.t1().K2(null, zp0Var, null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i27 = zp0Var.D;
                    boolean z17 = zp0Var.E;
                    t12.h = i27;
                    t12.f35763n = z17;
                    PhotoViewer.t1().f2(arrayList7, i10, i16, zp0Var.f45283h0, zp0Var.f45297t0, zp0Var.Q);
                    return;
                }
                return;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) this.f39375b;
                ArrayList arrayList9 = photoViewer.f35671c7;
                if (!arrayList9.isEmpty() && (i14 = photoViewer.L4) >= 0 && i14 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.L4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f35707g5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.L4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.f35707g5 = false;
                return;
            case 22:
                a(i10, view);
                return;
            case 23:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f39375b, view, i10);
                return;
            case 24:
                b(i10, view);
                return;
            case 25:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f39375b, view, i10);
                return;
            case 26:
                d(i10, view);
                return;
            case 27:
                ProfileActivity.f0((ProfileActivity) this.f39375b, i10);
                return;
            case 28:
                ProxyListActivity.U((ProxyListActivity) this.f39375b, view, i10);
                return;
            default:
                z11 z11Var = (z11) this.f39375b;
                org.telegram.ui.Components.jl0 jl0Var = z11Var.f45034y;
                org.telegram.ui.Components.ep epVar = z11Var.f45025b;
                if (epVar.d.get(i10) != z11Var.G && z11Var.K == null) {
                    z11Var.M = false;
                    z11Var.G = (org.telegram.ui.Components.fp) epVar.d.get(i10);
                    epVar.E(i10);
                    z11Var.h.postDelayed(new org.telegram.ui.Components.i8(z11Var, i10, 26), 100L);
                    for (int i28 = 0; i28 < jl0Var.getChildCount(); i28++) {
                        org.telegram.ui.Components.l11 l11Var = (org.telegram.ui.Components.l11) jl0Var.getChildAt(i28);
                        if (l11Var != view && (fq0Var = l11Var.F) != null) {
                            AndroidUtilities.cancelRunOnUIThread(fq0Var);
                            l11Var.F.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.fp) epVar.d.get(i10)).f28512a.f22762a) {
                        ((org.telegram.ui.Components.l11) view).d();
                    }
                    m11 m11Var = z11Var.F;
                    if (m11Var != null) {
                        m11Var.f40343a.d0(i10, z11Var.G.f28512a, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
