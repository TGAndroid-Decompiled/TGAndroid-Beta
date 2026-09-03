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
public final class j implements org.telegram.ui.Components.hl0 {
    public final int f35054a;
    public final Object f35055b;

    public j(Object obj, int i10) {
        this.f35054a = i10;
        this.f35055b = obj;
    }

    private final void a(int i10, View view) {
        boolean z4;
        mv0 mv0Var = (mv0) this.f35055b;
        boolean[] zArr = mv0Var.f36257w;
        if (i10 == mv0Var.f36244l0) {
            mv0Var.f0();
        } else if (view instanceof org.telegram.ui.Cells.r8) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            boolean z10 = mv0Var.I;
            org.telegram.ui.Components.qy0 qy0Var = mv0Var.N;
            if (qy0Var != null) {
                qy0Var.f();
            }
            if (mv0Var.F) {
                int i11 = -mv0Var.L;
                mv0Var.L = i11;
                AndroidUtilities.shakeViewSpring(r8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == mv0Var.f36247o0) {
                z4 = !mv0Var.D;
                mv0Var.D = z4;
            } else {
                int i12 = mv0Var.f36251r0;
                if (i10 == i12) {
                    z4 = !mv0Var.E;
                    mv0Var.E = z4;
                } else if (i10 == mv0Var.f36253s0) {
                    boolean z11 = !mv0Var.G;
                    mv0Var.G = z11;
                    mv0Var.r0();
                    int i13 = mv0Var.f36251r0;
                    if (i13 >= 0 && i12 < 0) {
                        mv0Var.f36231b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        mv0Var.f36231b.u(i12);
                    }
                    z4 = z11;
                } else if (i10 == mv0Var.f36248p0) {
                    boolean z12 = mv0Var.H;
                    boolean z13 = !z12;
                    mv0Var.H = z13;
                    if (!z12 && mv0Var.I) {
                        int i14 = mv0Var.f36239g0;
                        mv0Var.I = false;
                        mv0Var.r0();
                        f2.l1 K = mv0Var.f36233c.K(mv0Var.f36249q0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.r8) K.f5774a).setChecked(false);
                        } else {
                            mv0Var.f36231b.m(mv0Var.f36249q0);
                        }
                        mv0Var.f36231b.t(i14, 2);
                    }
                    z4 = z13;
                } else if (mv0Var.K == 0) {
                    z4 = !mv0Var.I;
                    mv0Var.I = z4;
                    int i15 = mv0Var.f36239g0;
                    mv0Var.r0();
                    if (mv0Var.I) {
                        mv0Var.f36231b.s(mv0Var.f36239g0, 2);
                    } else {
                        mv0Var.f36231b.t(i15, 2);
                    }
                    if (mv0Var.I && mv0Var.H) {
                        mv0Var.H = false;
                        f2.l1 K2 = mv0Var.f36233c.K(mv0Var.f36248p0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.r8) K2.f5774a).setChecked(false);
                        } else {
                            mv0Var.f36231b.m(mv0Var.f36248p0);
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
            mv0Var.f36233c.getChildCount();
            for (int i17 = mv0Var.f36243k0; i17 < mv0Var.f36243k0 + mv0Var.f36261y; i17++) {
                f2.l1 K3 = mv0Var.f36233c.K(i17);
                if (K3 != null) {
                    View view2 = K3.f5774a;
                    if (view2 instanceof org.telegram.ui.Cells.b6) {
                        org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view2;
                        b6Var.m(mv0Var.I, true);
                        b6Var.f20849r.a(zArr[i17 - mv0Var.f36243k0], z10);
                        if (b6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == mv0Var.f36249q0 && !mv0Var.J) {
                            mv0Var.h.f(b6Var.getCheckBox(), true);
                            mv0Var.J = true;
                        }
                    }
                }
            }
            r8Var.setChecked(z4);
            mv0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        tx0 tx0Var = (tx0) this.f35055b;
        int i11 = tx0Var.f38612y;
        if (i10 == tx0Var.f38610w) {
            org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.O(tx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new rx0(tx0Var), null).f19478a;
            d2Var.show();
            d2Var.h();
        } else if (i10 == tx0Var.f38606f) {
            if (i11 == 1) {
                ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
                p2Var.d = new Paint();
                p2Var.f36224f = new lv[2];
                p2Var.f36228w = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("checkCanWrite", false);
                bundle.putBoolean("resetDelegate", false);
                bundle.putInt("dialogsType", 9);
                qy qyVar = new qy(bundle);
                p2Var.f36221a = qyVar;
                qyVar.f37649z2 = new jv(p2Var);
                qyVar.onFragmentCreate();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlyUsers", true);
                bundle2.putBoolean("destroyAfterSelect", true);
                bundle2.putBoolean("returnAsResult", true);
                bundle2.putBoolean("disableSections", true);
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("resetDelegate", false);
                bundle2.putBoolean("allowSelf", false);
                ContactsActivity contactsActivity = new ContactsActivity(bundle2);
                p2Var.f36222b = contactsActivity;
                contactsActivity.T = new jv(p2Var);
                contactsActivity.onFragmentCreate();
                tx0Var.presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
                return;
            }
            Bundle i12 = android.support.v4.media.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            a70 a70Var = new a70(i12);
            a70Var.f32507w = new qx0(tx0Var);
            tx0Var.presentFragment(a70Var);
        } else if (i10 >= tx0Var.f38608r && i10 < tx0Var.f38609s) {
            if (i11 == 1) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", tx0Var.getMessagesController().blockePeers.keyAt(i10 - tx0Var.f38608r));
                tx0Var.presentFragment(new ProfileActivity(bundle3, null));
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
        zt ztVar;
        boolean[] zArr;
        t00 t00Var;
        org.telegram.ui.Components.qc a02;
        int i13;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i14;
        xw0 xw0Var;
        int i15 = 3;
        ut utVar = null;
        boolean z4 = true;
        r5 = true;
        boolean z10 = true;
        r5 = 1;
        int i16 = 1;
        switch (this.f35054a) {
            case 0:
                n nVar = (n) this.f35055b;
                ArrayList arrayList = nVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((l) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = nVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                        nVar.f36294c = true;
                        return;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = nVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z12);
                        nVar.f36294c = true;
                        return;
                    } else if (i17 == 7) {
                        if (!nVar.getUserConfig().isPremium() && !nVar.getMessagesController().autoarchiveAvailable && !nVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(nVar.getParentActivity(), nVar.getResourceProvider());
                            org.telegram.ui.Components.f90 f90Var = acVar.f23359b;
                            f90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.j6.Gi, 0, new yt0(nVar, 3)));
                            f90Var.setSingleLine(false);
                            f90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            acVar.f23358a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.ic.g(nVar, acVar, 3500).j();
                            int i18 = -nVar.e;
                            nVar.e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return;
                        }
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = nVar.d;
                        boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z13);
                        nVar.f36294c = true;
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                r rVar = (r) this.f35055b;
                if (i10 >= rVar.f37666x && i10 < rVar.f37667y && rVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) rVar.h.get(i10 - rVar.f37666x);
                    if (stickerSetCovered.set.f19186id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.f19179id = stickerSetCovered.set.f19186id;
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
                bd bdVar = (bd) this.f35055b;
                ArrayList arrayList2 = bdVar.f32842c;
                rb1 rb1Var = bdVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.ip ipVar = (org.telegram.ui.Components.ip) arrayList2.get(i10);
                    bdVar.a(ipVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + rb1Var.getPaddingLeft()) {
                        rb1Var.v0(-((AndroidUtilities.dp(48.0f) + rb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (rb1Var.getMeasuredWidth() - rb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        rb1Var.v0(org.telegram.messenger.y3.z(48.0f, rb1Var.getMeasuredWidth() - rb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = bdVar.f32845r;
                    if (callback != null) {
                        callback.run(ipVar.a());
                        return;
                    }
                    return;
                }
                return;
            case 3:
                sp spVar = (sp) this.f35055b;
                boolean z14 = spVar.f38287s;
                if (spVar.getParentActivity() != null) {
                    f2.o0 adapter = spVar.f38282b.getAdapter();
                    rp rpVar = spVar.e;
                    if (adapter == rpVar) {
                        chat = (TLRPC.Chat) rpVar.d.get(i10);
                    } else {
                        int i19 = spVar.D;
                        if (i10 >= i19 && i10 < spVar.E) {
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
                        bundle.putLong("chat_id", chat.f19159id);
                        spVar.presentFragment(new zn(bundle));
                        return;
                    } else if (i10 == spVar.C) {
                        if (z14 && spVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{spVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = spVar.f38284f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            g70 g70Var = new g70(bundle2);
                            g70Var.V = new jp(spVar);
                            spVar.presentFragment(g70Var);
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
                            alertDialog$Builder.f19478a.O = string;
                            alertDialog$Builder.f19478a.Q = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new c1(spVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                            spVar.showDialog(d2Var);
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
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
                zp zpVar = (zp) this.f35055b;
                ArrayList arrayList3 = zpVar.f40847r;
                boolean z15 = zpVar.D;
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
                    boolean contains = zpVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (!contains) {
                        zpVar.d.add(tL_availableReaction.reaction);
                    } else {
                        zpVar.d.remove(tL_availableReaction.reaction);
                        if (zpVar.d.isEmpty()) {
                            yp ypVar = zpVar.h;
                            if (ypVar != null) {
                                if (zpVar.D) {
                                    i12 = 1;
                                } else {
                                    i12 = 2;
                                }
                                ypVar.t(i12, arrayList3.size() + 1);
                            }
                            zpVar.V(2, true);
                        }
                    }
                    Switch r22 = yVar.f22570c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.kp kpVar = yVar.d;
                    if (kpVar != null) {
                        kpVar.a(z16, true);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                nt ntVar = (nt) this.f35055b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((qt) view).d;
                rt rtVar = ntVar.f36580a;
                mg.d0 reactionsWindow = rtVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.f13973q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.dy0.c(null, rtVar.f38032c0, rtVar.f38053z.getContext(), new f5(ntVar, 9));
                    return;
                }
                pt ptVar = rtVar.f38040l;
                if (ptVar != null) {
                    ptVar.v(stickerSetCovered2.set, TextUtils.join("", rtVar.f38043o));
                }
                rtVar.p();
                return;
            case 6:
                au auVar = (au) this.f35055b;
                if (auVar.f32644f && auVar.e) {
                    yt ytVar = auVar.d;
                    ArrayList arrayList4 = ytVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        utVar = (ut) ytVar.e.get(i10);
                    }
                } else {
                    int S = auVar.f32643c.S(i10);
                    int Q = auVar.f32643c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        utVar = auVar.f32643c.O(S, Q);
                    } else {
                        return;
                    }
                }
                if (i10 >= 0) {
                    auVar.finishFragment();
                    if (utVar != null && (ztVar = auVar.f32646r) != null) {
                        ztVar.Y0(utVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                vu vuVar = (vu) this.f35055b;
                ArrayList arrayList5 = vuVar.Z2;
                zu zuVar = vuVar.f39203l3;
                if ((view instanceof ou) && i10 >= 0 && i10 < arrayList5.size()) {
                    qu quVar = (qu) arrayList5.get(i10);
                    if (quVar != null) {
                        int i20 = quVar.h;
                        if (i20 >= 0) {
                            vuVar.f39197f3[i20] = !zArr[i20];
                            vuVar.z1(true);
                            return;
                        } else if (i20 == -2) {
                            zuVar.presentFragment(new DataAutoDownloadActivity(vuVar.V2 - 1));
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else if (view instanceof org.telegram.ui.Cells.n8) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zuVar.getParentActivity());
                    alertDialog$Builder2.f19478a.O = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder2.f19478a.Q = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new ru(vuVar));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                    zuVar.showDialog(d2Var2);
                    TextView textView2 = (TextView) d2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 8:
                a00.V((a00) this.f35055b, view, i10);
                return;
            case 9:
                c10 c10Var = (c10) this.f35055b;
                if (c10Var.getParentActivity() != null && (t00Var = (t00) c10Var.M.get(i10)) != null) {
                    View.OnClickListener onClickListener = t00Var.f38343c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    int i21 = t00Var.f1830a;
                    if (i21 == 1) {
                        org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
                        c10Var.v0(t00Var, uaVar.getName(), uaVar.getCurrentObject(), t00Var.f38345g);
                        return;
                    } else if (i21 == 7) {
                        org.telegram.ui.Components.k41 k41Var = new org.telegram.ui.Components.k41(25, c10Var, t00Var);
                        if (c10Var.f32978c.isEnabled()) {
                            c10Var.s0(k41Var, false);
                            return;
                        } else {
                            k41Var.run();
                            return;
                        }
                    } else if (i21 == 8 || (i21 == 4 && t00Var.f38348k == R.drawable.msg2_link2)) {
                        MessagesController.DialogFilter dialogFilter = c10Var.f32981r;
                        if (c10Var.f32982s && c10Var.f32978c.getAlpha() > 0.0f) {
                            float f10 = -c10Var.N;
                            c10Var.N = f10;
                            AndroidUtilities.shakeViewSpring(view, f10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            c10Var.v = true;
                            gj gjVar = c10Var.O;
                            if (gjVar == null || gjVar.getVisibility() != 0) {
                                gj gjVar2 = new gj(6, 3, c10Var.getParentActivity(), null, true);
                                c10Var.O = gjVar2;
                                gjVar2.f26561a.setMaxWidth(AndroidUtilities.displaySize.x);
                                c10Var.O.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                c10Var.O.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                c10Var.getParentLayout().getOverlayContainerView().addView(c10Var.O, marginLayoutParams);
                                c10Var.O.f(c10Var.f32978c, true);
                                return;
                            }
                            return;
                        } else if ((!TextUtils.isEmpty(c10Var.f32983w) || !TextUtils.isEmpty(dialogFilter.name)) && (c10Var.f32985y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && c10Var.D.isEmpty() && !c10Var.C.isEmpty()) {
                            c10Var.s0(new e00(c10Var, 1), false);
                            return;
                        } else {
                            float f11 = -c10Var.N;
                            c10Var.N = f11;
                            AndroidUtilities.shakeViewSpring(view, f11);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            if (TextUtils.isEmpty(c10Var.f32983w) && TextUtils.isEmpty(dialogFilter.name)) {
                                a02 = org.telegram.ui.Components.qc.a0(c10Var);
                                i13 = R.string.FilterInviteErrorEmptyName;
                            } else if ((c10Var.f32985y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                if (!c10Var.D.isEmpty()) {
                                    a02 = org.telegram.ui.Components.qc.a0(c10Var);
                                    i13 = R.string.FilterInviteErrorTypesExcluded;
                                } else {
                                    a02 = org.telegram.ui.Components.qc.a0(c10Var);
                                    i13 = R.string.FilterInviteErrorTypes;
                                }
                            } else if (c10Var.C.isEmpty()) {
                                a02 = org.telegram.ui.Components.qc.a0(c10Var);
                                i13 = R.string.FilterInviteErrorEmpty;
                            } else {
                                a02 = org.telegram.ui.Components.qc.a0(c10Var);
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
                p00 p00Var = (p00) this.f35055b;
                ArrayList arrayList6 = p00Var.f36912a0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    t00 t00Var2 = (t00) arrayList6.get(i22);
                    int i23 = t00Var2.f1830a;
                    if (i23 == 7) {
                        p00Var.dismiss();
                        p00Var.f28701n.presentFragment(new a00(p00Var.U, t00Var2.f38350m));
                        return;
                    } else if (i23 == 8) {
                        p00Var.Q();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                u10 u10Var = (u10) this.f35055b;
                if (view instanceof org.telegram.ui.Cells.h7) {
                    u10Var.f(i10, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    u10Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.g7) {
                    u10Var.f(i10, view, ((org.telegram.ui.Cells.g7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    u10Var.f(i10, view, ((org.telegram.ui.Cells.d2) view).getMessageObject(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.q2) {
                    u10Var.f(i10, view, ((org.telegram.ui.Cells.q2) view).getMessage(), 0);
                    return;
                } else {
                    return;
                }
            case 12:
                i70 i70Var = (i70) this.f35055b;
                if (i70Var.getParentActivity() != null) {
                    if (i10 != i70Var.f34817n && i10 != 0) {
                        if (i10 == i70Var.f34819s) {
                            if (i70Var.f34816f != null) {
                                try {
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", i70Var.f34816f.link);
                                    i70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            return;
                        } else if (i10 == i70Var.f34818r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(i70Var.getParentActivity());
                            alertDialog$Builder3.f19478a.Q = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.f19478a.O = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new hu(i70Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            i70Var.showDialog(alertDialog$Builder3.f19478a);
                            return;
                        } else {
                            return;
                        }
                    } else if (i70Var.f34816f != null) {
                        try {
                            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", i70Var.f34816f.link));
                            org.telegram.ui.Components.qc.j(i70Var).j();
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                o70.U((o70) this.f35055b, view, i10);
                return;
            case 14:
                e80.U((e80) this.f35055b, view, i10);
                return;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.f35055b, view, i10);
                return;
            case 16:
                cd0 cd0Var = (cd0) this.f35055b;
                cd0Var.f33092f0 = -1L;
                int i24 = cd0Var.D0;
                if (i24 == 4) {
                    if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) cd0Var.Q.J(i10)) != null) {
                        if (cd0Var.f33086b0 == 0) {
                            cd0Var.C0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                            cd0Var.finishFragment();
                            return;
                        }
                        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(cd0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = cd0Var.getMessagesController().getInputChannel(-cd0Var.f33086b0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint.lat;
                        tL_inputGeoPoint._long = geoPoint._long;
                        d2VarArr[0].setOnCancelListener(new lh.w(cd0Var, cd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new da(cd0Var, d2VarArr, tL_messageMediaVenue, 19)), 8));
                        cd0Var.showDialog(d2VarArr[0]);
                        return;
                    }
                    return;
                } else if (i24 == 5) {
                    IMapsProvider.IMap iMap = cd0Var.F;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = cd0Var.f33112w0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), cd0Var.F.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && (messageObject = cd0Var.f33116y0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = cd0Var.F;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = cd0Var.f33116y0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), cd0Var.F.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                } else if (i10 == 1 && i24 != 2) {
                    if (cd0Var.C0 != null && cd0Var.f33109u0 != null) {
                        FrameLayout frameLayout = cd0Var.f33098l0;
                        if (frameLayout != null) {
                            frameLayout.callOnClick();
                            return;
                        }
                        TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaGeo.geo = tL_geoPoint;
                        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(cd0Var.f33109u0.getLatitude());
                        tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(cd0Var.f33109u0.getLongitude());
                        cd0Var.C0.b(tL_messageMediaGeo, cd0Var.D0, true, 0, 0L);
                        cd0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i24 == 2 && cd0Var.getLocationController().isSharingLocation(cd0Var.f33086b0) && cd0Var.Q.j(i10) == 7) {
                    cd0Var.getLocationController().removeSharingLocation(cd0Var.f33086b0);
                    cd0Var.Q.l();
                    cd0Var.finishFragment();
                    return;
                } else if (i24 == 2 && cd0Var.getLocationController().isSharingLocation(cd0Var.f33086b0) && cd0Var.Q.j(i10) == 6) {
                    if (cd0Var.getLocationController().getSharingLocationInfo(cd0Var.f33086b0).period == Integer.MAX_VALUE) {
                        z4 = false;
                    }
                    cd0Var.s0(z4);
                    return;
                } else if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (cd0Var.getLocationController().isSharingLocation(cd0Var.f33086b0)) {
                        cd0Var.getLocationController().removeSharingLocation(cd0Var.f33086b0);
                        cd0Var.Q.l();
                        cd0Var.finishFragment();
                        return;
                    }
                    cd0Var.s0(false);
                    return;
                } else {
                    Object J = cd0Var.Q.J(i10);
                    if (J instanceof TLRPC.TL_messageMediaVenue) {
                        cd0Var.C0.b((TLRPC.TL_messageMediaVenue) J, cd0Var.D0, true, 0, 0L);
                        cd0Var.finishFragment();
                        return;
                    } else if (J instanceof wc0) {
                        wc0 wc0Var = (wc0) J;
                        cd0Var.f33092f0 = wc0Var.f39338a;
                        if (cd0Var.f33093g0) {
                            cd0Var.f33093g0 = false;
                            cd0Var.C0();
                        }
                        cd0Var.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(wc0Var.e.getPosition(), cd0Var.F.getMaxZoomLevel() - 4.0f));
                        return;
                    } else {
                        return;
                    }
                }
            case 17:
                ((ui0) this.f35055b).onBackPressed();
                return;
            case 18:
                cj0 cj0Var = (cj0) this.f35055b;
                int i25 = cj0Var.F;
                if (i10 >= i25 && i10 < cj0Var.G) {
                    MessageObject messageObject2 = (MessageObject) cj0Var.f33177x.get(i10 - i25);
                    if (messageObject2.isStory()) {
                        if (!cj0Var.a0(messageObject2)) {
                            cj0Var.getOrCreateStoryViewer().G(cj0Var.getParentActivity(), messageObject2.storyItem, nh.c7.a(cj0Var.f33172f));
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
                    if (cj0Var.getMessagesController().checkCanOpenChat(bundle3, cj0Var)) {
                        cj0Var.presentFragment(new zn(bundle3));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.f35055b, view, i10);
                return;
            case 20:
                mp0 mp0Var = (mp0) this.f35055b;
                mp0Var.a(i10, true);
                zo0 zo0Var = mp0Var.h;
                if (zo0Var != null) {
                    zo0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 21:
                mq0 mq0Var = (mq0) this.f35055b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = mq0Var.f36169f;
                ArrayList arrayList8 = mq0Var.f36177n;
                MediaController.AlbumEntry albumEntry = mq0Var.G;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        qq0 qq0Var = mq0Var.f36181q0;
                        if (qq0Var != null) {
                            switch (qq0Var.f37455a) {
                                case 0:
                                    rq0.h0(qq0Var.f37456b, str);
                                    return;
                                default:
                                    rq0.h0(qq0Var.f37456b, str);
                                    return;
                            }
                        }
                        mq0Var.M.getSearchField().setText(str);
                        mq0Var.M.getSearchField().setSelection(str.length());
                        mq0Var.b0(mq0Var.M.getSearchField());
                        return;
                    } else if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(mq0Var.getParentActivity());
                        alertDialog$Builder4.f19478a.O = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder4.f19478a.Q = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new aq0(mq0Var, 4));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder4.f19478a;
                        mq0Var.showDialog(d2Var3);
                        TextView textView3 = (TextView) d2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
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
                    t12.f31785n = z17;
                    PhotoViewer.t1().f2(arrayList7, i10, i16, mq0Var.f36173i0, mq0Var.f36187u0, mq0Var.R);
                    return;
                }
                return;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.f35055b;
                ArrayList arrayList9 = photoViewer.f31704d7;
                if (!arrayList9.isEmpty() && (i14 = photoViewer.M4) >= 0 && i14 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.M4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.f31738h5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.M4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.f31738h5 = false;
                return;
            case 23:
                a(i10, view);
                return;
            case 24:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.f35055b, view, i10);
                return;
            case 25:
                vw0 vw0Var = (vw0) this.f35055b;
                PremiumPreviewFragment premiumPreviewFragment = vw0Var.f39214n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                sw0 sw0Var = vw0Var.e;
                if (view.isEnabled() && (view instanceof eg.k2)) {
                    eg.k2 k2Var = (eg.k2) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(k2Var.getTier());
                    premiumPreviewFragment.t0(true);
                    k2Var.c(true, true);
                    for (int i28 = 0; i28 < sw0Var.getChildCount(); i28++) {
                        View childAt = sw0Var.getChildAt(i28);
                        if (childAt instanceof eg.k2) {
                            eg.k2 k2Var2 = (eg.k2) childAt;
                            if (k2Var2.getTier() != k2Var.getTier()) {
                                k2Var2.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < sw0Var.getHiddenChildCount(); i29++) {
                        View V = sw0Var.V(i29);
                        if (V instanceof eg.k2) {
                            eg.k2 k2Var3 = (eg.k2) V;
                            if (k2Var3.getTier() != k2Var.getTier()) {
                                k2Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < sw0Var.getCachedChildCount(); i30++) {
                        View P = sw0Var.P(i30);
                        if (P instanceof eg.k2) {
                            eg.k2 k2Var4 = (eg.k2) P;
                            if (k2Var4.getTier() != k2Var.getTier()) {
                                k2Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < sw0Var.getAttachedScrapChildCount(); i31++) {
                        View O = sw0Var.O(i31);
                        if (O instanceof eg.k2) {
                            eg.k2 k2Var5 = (eg.k2) O;
                            if (k2Var5.getTier() != k2Var.getTier()) {
                                k2Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.G;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((xw0Var = premiumPreviewFragment.f31933f) == null || xw0Var.f40084a.months >= ((xw0) arrayList10.get(premiumPreviewFragment.e)).f40084a.months || premiumPreviewFragment.m0)) {
                        z10 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z10);
                    return;
                }
                return;
            case 26:
                PrivacyControlActivity.X((PrivacyControlActivity) this.f35055b, view, i10);
                return;
            case 27:
                b(i10, view);
                return;
            case 28:
                ProfileActivity.f0((ProfileActivity) this.f35055b, i10);
                return;
            default:
                ProxyListActivity.U((ProxyListActivity) this.f35055b, view, i10);
                return;
        }
    }
}
