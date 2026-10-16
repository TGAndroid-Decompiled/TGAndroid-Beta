package org.telegram.ui.Cells;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.mh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.wk;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.y40;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fo;
import org.telegram.ui.gm;
import org.telegram.ui.hb1;
import org.telegram.ui.he;
import org.telegram.ui.jh0;
import org.telegram.ui.kj1;
import org.telegram.ui.o61;
import org.telegram.ui.q61;
import org.telegram.ui.qe;
import org.telegram.ui.r71;
import org.telegram.ui.td;
import org.telegram.ui.tj1;
import org.telegram.ui.v61;
import org.telegram.ui.yd;
import org.telegram.ui.yy;
import org.telegram.ui.z41;
import org.telegram.ui.zd;
public final class sa implements View.OnClickListener {
    public final int f21654a;
    public final int f21655b;
    public final Object f21656c;
    public final Object d;

    public sa(int i10, View view, AtomicReference atomicReference) {
        this.f21654a = 19;
        this.f21655b = i10;
        this.f21656c = view;
        this.d = atomicReference;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        View view2;
        int R;
        int i10;
        int i11;
        int i12;
        int i13 = this.f21654a;
        AndroidUtilities.VcardItem vcardItem = null;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f21655b;
        Object obj = this.d;
        Object obj2 = this.f21656c;
        switch (i13) {
            case 0:
                ua uaVar = (ua) obj2;
                uaVar.e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new di.k4(uaVar, i15, 3));
                return;
            case 1:
                ((cb) obj2).a(i15, ((bb) obj).h);
                return;
            case 2:
                qe qeVar = (qe) obj2;
                hb1 hb1Var = (hb1) obj;
                he heVar = qeVar.Q0;
                if (view.isEnabled() && !heVar.N && !qeVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (qeVar.L0 > currentTime) {
                        qeVar.Z0 = zc.a0(hb1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, zh.g.j0(qeVar.L0 - currentTime)))).j();
                        return;
                    } else if (qeVar.X0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        zc.a0(hb1Var).L(qeVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new td(qeVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        yd ydVar = new yd(qeVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f32584b0 = ydVar;
                        heVar.setLoading(true);
                        twoStepVerificationActivity.s0(new zd(qeVar, hb1Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 3:
                fo foVar = (fo) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (foVar.X0 != null && foVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    return;
                }
                return;
            case 4:
                fo foVar2 = (fo) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (foVar2.f35617d5 != null && i15 < arrayList.size()) {
                    foVar2.Fa(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 5:
                ((ud0) obj2).setValue(i15);
                ((org.telegram.ui.Components.z2) obj).run();
                return;
            case 6:
                cl clVar = (cl) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                l80 F = l80.F(clVar, c6Var, clVar.f23796x);
                F.Q = true;
                F.c(R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds), new gm(clVar, i15, c6Var, 1), false);
                F.c(R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment), new wk(clVar, 0), false);
                F.f26668s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F.Z();
                return;
            case 7:
                ss ssVar = (ss) obj2;
                a71 a71Var = (a71) obj;
                if (ssVar.T()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ssVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                    a2Var.R = string;
                    a2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    a2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = ssVar.f28906w0;
                boolean z15 = !z13;
                tL_chatBannedRights.send_media = z15;
                tL_chatBannedRights.send_photos = z15;
                tL_chatBannedRights.send_videos = z15;
                tL_chatBannedRights.send_stickers = z15;
                tL_chatBannedRights.send_gifs = z15;
                tL_chatBannedRights.send_inline = z15;
                tL_chatBannedRights.send_games = z15;
                tL_chatBannedRights.send_audios = z15;
                tL_chatBannedRights.send_docs = z15;
                tL_chatBannedRights.send_voices = z15;
                tL_chatBannedRights.send_roundvideos = z15;
                tL_chatBannedRights.embed_links = z15;
                tL_chatBannedRights.send_polls = z15;
                tL_chatBannedRights.send_reactions = z15;
                ssVar.W();
                a71Var.N(true);
                return;
            case 8:
                y40 y40Var = (y40) obj2;
                y40Var.f31153n = i15;
                y40Var.f31150b.d(view.getLeft(), false);
                y40Var.f31151c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                y40Var.invalidate();
                return;
            case 9:
                pf0 pf0Var = (pf0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = pf0Var.f27990n;
                ArrayList arrayList2 = pf0Var.M;
                org.telegram.ui.ActionBar.m2 m2Var = pf0Var.f27991r;
                int i16 = pf0Var.F;
                if (i15 >= i16 && i15 < pf0Var.G) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i16);
                } else {
                    int i17 = pf0Var.H;
                    if (i15 >= i17 && i15 < pf0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) pf0Var.L.get(i15 - i17);
                    }
                }
                if (vcardItem != null) {
                    if (pf0Var.J) {
                        int i18 = vcardItem.type;
                        if (i18 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(268435456);
                                m2Var.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        } else if (i18 == 1) {
                            pf.d.r(m2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                            return;
                        } else if (i18 == 3) {
                            String value = vcardItem.getValue(false);
                            if (!value.startsWith("http")) {
                                value = "http://".concat(value);
                            }
                            pf.d.r(m2Var.getParentActivity(), value);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(m2Var.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new mg.j(5, pf0Var, vcardItem));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i15 >= pf0Var.F && i15 < pf0Var.G) {
                        int i19 = 0;
                        while (true) {
                            if (i19 < arrayList2.size()) {
                                if (((AndroidUtilities.VcardItem) arrayList2.get(i19)).checked) {
                                    z14 = true;
                                } else {
                                    i19++;
                                }
                            }
                        }
                        int themedColor = pf0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Sh);
                        textView.setEnabled(z14);
                        if (!z14) {
                            themedColor &= Integer.MAX_VALUE;
                        }
                        textView.setTextColor(themedColor);
                    }
                    ((nf0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 10:
                gu0 gu0Var = (gu0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                xv0 xv0Var = gu0Var.f25112f;
                org.telegram.ui.ActionBar.m2 m2Var2 = xv0Var.f31069v1;
                m2Var2.finishPreviewFragment();
                chat.left = false;
                gu0Var.E(false);
                gu0Var.u(i15);
                if (gu0Var.d.isEmpty()) {
                    xv0Var.w1(true);
                    xv0Var.F();
                }
                m2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-xv0Var.f31044j1));
                m2Var2.getMessagesController().addUserToChat(chat.f18916id, m2Var2.getUserConfig().getCurrentUser(), 0, null, m2Var2, new g90(20, gu0Var, chat));
                return;
            case 11:
                ((m51) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 12:
                yy.v0((yy) obj2, i15, (l80) obj);
                return;
            case 13:
                jh0.Y((jh0) obj2, i15, (l80) obj);
                return;
            case 14:
                boolean[] zArr = (boolean[]) obj2;
                l6[] l6VarArr = (l6[]) obj;
                if (i15 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zArr[0] = z10;
                for (int i20 = 0; i20 < 2; i20++) {
                    l6 l6Var = l6VarArr[i20];
                    boolean z16 = zArr[0];
                    if (i20 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z16 == z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    l6Var.f21184c.a(z12, true);
                }
                return;
            case 15:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.m1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((z41) saveToGallerySettingsActivity.f32427s.get(i15)).f42152c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f32421a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 16:
                jy jyVar = (jy) obj;
                r71 r71Var = ((q61) obj2).f39070c;
                if (!jyVar.e && !UserConfig.getInstance(r71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new sg.y0(r71Var.f39320c1, r71Var.getContext(), r71Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    o61 o61Var = r71Var.f39330h0;
                    if (i21 < o61Var.getChildCount()) {
                        if ((o61Var.getChildAt(i21) instanceof v61) && (R = RecyclerView.R((view2 = o61Var.getChildAt(i21)))) >= 0 && r71Var.f39368y0.get(R) == i15) {
                            num = Integer.valueOf(R);
                        } else {
                            i21++;
                        }
                    } else {
                        num = null;
                        view2 = null;
                    }
                }
                if (num != null) {
                    r71Var.i(num.intValue(), view2);
                }
                ew.X(null, jyVar.f26151b, false, null, null);
                r71Var.B0.add(Long.valueOf(jyVar.f26151b.f18943id));
                r71Var.B(true, true, true);
                return;
            case 17:
                ((org.telegram.ui.Wallet.k) obj).run(Integer.valueOf(i15));
                ((org.telegram.ui.Wallet.v4) obj2).setSelected(i15);
                return;
            case 18:
                di.d dVar = (di.d) obj2;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                if (!dVar.N) {
                    com.google.android.gms.internal.cast.z5 z5Var = tj1.d;
                    if (z5Var != null && ((byte[]) z5Var.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.f21655b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new mh(dVar, e3Var, i22, view, z5Var));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 19:
                SharedConfig.setSearchEngineType(i15);
                ((r8) ((View) obj2)).u(org.telegram.ui.web.o1.a().f41144a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 20:
                rg.t1 t1Var = (rg.t1) obj2;
                t1Var.a(i15);
                t1Var.f44311b.x().i(i15 - 1, true);
                t1Var.f44311b.o((qg.m) obj);
                return;
            case 21:
                ns0 ns0Var = (ns0) obj2;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) obj;
                aq aqVar = ns0Var.F;
                aqVar.a(!aqVar.f23281a.f22792q, true);
                boolean z17 = aqVar.f23281a.f22792q;
                zc a02 = zc.a0(m2Var3);
                if (z17) {
                    i10 = R.raw.silent_unmute;
                } else {
                    i10 = R.raw.silent_mute;
                }
                if (z17) {
                    i11 = R.string.Gift2ChannelNotifyChecked;
                } else {
                    i11 = R.string.Gift2ChannelNotifyNotChecked;
                }
                a02.P(i10, LocaleController.getString(i11)).j();
                ns0Var.d.h = Boolean.valueOf(z17);
                if (ns0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(ns0Var.H, true);
                    ns0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(ns0Var.f49090c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new kj1(4, ns0Var, m2Var3));
                return;
            case 22:
                zh.f5 f5Var = (zh.f5) obj2;
                Runnable runnable = (Runnable) obj;
                f5Var.getClass();
                if ((i15 & 15) != 0) {
                    i14 = 15;
                } else if ((i15 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(f5Var.f50506g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = f5Var.f50506g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    f5Var.f50506g = i24;
                    f5Var.i(true);
                }
                runnable.run();
                return;
            default:
                pf.d.r((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
        }
    }

    public sa(Object obj, int i10, Object obj2, int i11) {
        this.f21654a = i11;
        this.f21656c = obj;
        this.f21655b = i10;
        this.d = obj2;
    }

    public sa(Object obj, Object obj2, int i10, int i11) {
        this.f21654a = i11;
        this.f21656c = obj;
        this.d = obj2;
        this.f21655b = i10;
    }
}
