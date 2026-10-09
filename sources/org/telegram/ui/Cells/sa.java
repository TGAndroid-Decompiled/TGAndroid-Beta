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
import org.telegram.messenger.jh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.iw;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.be;
import org.telegram.ui.ej1;
import org.telegram.ui.fh0;
import org.telegram.ui.h61;
import org.telegram.ui.j61;
import org.telegram.ui.k71;
import org.telegram.ui.ke;
import org.telegram.ui.nd;
import org.telegram.ui.nj1;
import org.telegram.ui.o61;
import org.telegram.ui.s41;
import org.telegram.ui.sd;
import org.telegram.ui.td;
import org.telegram.ui.ty;
import org.telegram.ui.zn;
public final class sa implements View.OnClickListener {
    public final int f22921a;
    public final int f22922b;
    public final Object f22923c;
    public final Object d;

    public sa(int i10, View view, AtomicReference atomicReference) {
        this.f22921a = 19;
        this.f22922b = i10;
        this.f22923c = view;
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
        int i13 = this.f22921a;
        AndroidUtilities.VcardItem vcardItem = null;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f22922b;
        Object obj = this.d;
        Object obj2 = this.f22923c;
        switch (i13) {
            case 0:
                ua uaVar = (ua) obj2;
                uaVar.f23526e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new ci.k4(uaVar, i15, 3));
                return;
            case 1:
                ((cb) obj2).a(i15, ((bb) obj).h);
                return;
            case 2:
                ke keVar = (ke) obj2;
                bb1 bb1Var = (bb1) obj;
                be beVar = keVar.Q0;
                if (view.isEnabled() && !beVar.N && !keVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (keVar.L0 > currentTime) {
                        keVar.Z0 = ad.a0(bb1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, yh.g.j0(keVar.L0 - currentTime)))).j();
                        return;
                    } else if (keVar.X0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        ad.a0(bb1Var).L(keVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new nd(keVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        sd sdVar = new sd(keVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f34573b0 = sdVar;
                        beVar.setLoading(true);
                        twoStepVerificationActivity.s0(new td(keVar, bb1Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 3:
                zn znVar = (zn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (znVar.X0 != null && znVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    return;
                }
                return;
            case 4:
                zn znVar2 = (zn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (znVar2.f44745d5 != null && i15 < arrayList.size()) {
                    znVar2.Fa(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 5:
                ((ud0) obj2).setValue(i15);
                ((org.telegram.ui.Components.z2) obj).run();
                return;
            case 6:
                gl glVar = (gl) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                p80 F = p80.F(glVar, e6Var, glVar.f26794x);
                F.Q = true;
                F.c(R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds), new zk(glVar, i15, e6Var, 0), false);
                F.c(R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment), new al(glVar, 0), false);
                F.f29789s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F.Z();
                return;
            case 7:
                vs vsVar = (vs) obj2;
                c71 c71Var = (c71) obj;
                if (vsVar.T()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    b2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = vsVar.f32450w0;
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
                vsVar.W();
                c71Var.N(true);
                return;
            case 8:
                c50 c50Var = (c50) obj2;
                c50Var.f25257n = i15;
                c50Var.f25253b.d(view.getLeft(), false);
                c50Var.f25254c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                c50Var.invalidate();
                return;
            case 9:
                qf0 qf0Var = (qf0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = qf0Var.f30157n;
                ArrayList arrayList2 = qf0Var.M;
                org.telegram.ui.ActionBar.n2 n2Var = qf0Var.f30158r;
                int i16 = qf0Var.F;
                if (i15 >= i16 && i15 < qf0Var.G) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i16);
                } else {
                    int i17 = qf0Var.H;
                    if (i15 >= i17 && i15 < qf0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) qf0Var.L.get(i15 - i17);
                    }
                }
                if (vcardItem != null) {
                    if (qf0Var.J) {
                        int i18 = vcardItem.type;
                        if (i18 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(268435456);
                                n2Var.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        } else if (i18 == 1) {
                            of.f.s(n2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                            return;
                        } else if (i18 == 3) {
                            String value = vcardItem.getValue(false);
                            if (!value.startsWith("http")) {
                                value = "http://".concat(value);
                            }
                            of.f.s(n2Var.getParentActivity(), value);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n2Var.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(5, qf0Var, vcardItem));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i15 >= qf0Var.F && i15 < qf0Var.G) {
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
                        int themedColor = qf0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Sh);
                        textView.setEnabled(z14);
                        if (!z14) {
                            themedColor &= Integer.MAX_VALUE;
                        }
                        textView.setTextColor(themedColor);
                    }
                    ((of0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 10:
                ku0 ku0Var = (ku0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                bw0 bw0Var = ku0Var.f28170f;
                org.telegram.ui.ActionBar.n2 n2Var2 = bw0Var.f25166v1;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                ku0Var.E(false);
                ku0Var.u(i15);
                if (ku0Var.d.isEmpty()) {
                    bw0Var.v1(true);
                    bw0Var.F();
                }
                n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-bw0Var.f25141j1));
                n2Var2.getMessagesController().addUserToChat(chat.f20038id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new ci0(14, ku0Var, chat));
                return;
            case 11:
                ((q51) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 12:
                ty.p0((ty) obj2, i15, (p80) obj);
                return;
            case 13:
                fh0.Y((fh0) obj2, i15, (p80) obj);
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
                    l6Var.f22425c.a(z12, true);
                }
                return;
            case 15:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((s41) saveToGallerySettingsActivity.f34410s.get(i15)).f41579c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f34403a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 16:
                ny nyVar = (ny) obj;
                k71 k71Var = ((j61) obj2).f38839c;
                if (!nyVar.f29303e && !UserConfig.getInstance(k71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new rg.y0(k71Var.f39121c1, k71Var.getContext(), k71Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    h61 h61Var = k71Var.f39132h0;
                    if (i21 < h61Var.getChildCount()) {
                        if ((h61Var.getChildAt(i21) instanceof o61) && (R = RecyclerView.R((view2 = h61Var.getChildAt(i21)))) >= 0 && k71Var.f39170y0.get(R) == i15) {
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
                    k71Var.i(num.intValue(), view2);
                }
                iw.X(null, nyVar.f29301b, false, null, null);
                k71Var.B0.add(Long.valueOf(nyVar.f29301b.f20065id));
                k71Var.B(true, true, true);
                return;
            case 17:
                ((org.telegram.ui.Wallet.j) obj).run(Integer.valueOf(i15));
                ((org.telegram.ui.Wallet.u4) obj2).setSelected(i15);
                return;
            case 18:
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!dVar.N) {
                    ci.u5 u5Var = nj1.d;
                    if (u5Var != null && ((byte[]) u5Var.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.f22922b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new jh(dVar, f3Var, i22, view, u5Var));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 19:
                SharedConfig.setSearchEngineType(i15);
                ((r8) ((View) obj2)).u(org.telegram.ui.web.n1.a().f43408a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 20:
                qg.r1 r1Var = (qg.r1) obj2;
                r1Var.a(i15);
                r1Var.f46531b.v().i(i15 - 1, true);
                r1Var.f46531b.b((pg.m) obj);
                return;
            case 21:
                rs0 rs0Var = (rs0) obj2;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj;
                dq dqVar = rs0Var.F;
                dqVar.a(!dqVar.f25790a.f24097q, true);
                boolean z17 = dqVar.f25790a.f24097q;
                ad a02 = ad.a0(n2Var3);
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
                rs0Var.d.h = Boolean.valueOf(z17);
                if (rs0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(rs0Var.H, true);
                    rs0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(rs0Var.f51513c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new ej1(4, rs0Var, n2Var3));
                return;
            case 22:
                yh.e5 e5Var = (yh.e5) obj2;
                Runnable runnable = (Runnable) obj;
                e5Var.getClass();
                if ((i15 & 15) != 0) {
                    i14 = 15;
                } else if ((i15 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(e5Var.f52438g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = e5Var.f52438g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    e5Var.f52438g = i24;
                    e5Var.i(true);
                }
                runnable.run();
                return;
            default:
                of.f.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
        }
    }

    public sa(Object obj, int i10, Object obj2, int i11) {
        this.f22921a = i11;
        this.f22923c = obj;
        this.f22922b = i10;
        this.d = obj2;
    }

    public sa(Object obj, Object obj2, int i10, int i11) {
        this.f22921a = i11;
        this.f22923c = obj;
        this.d = obj2;
        this.f22922b = i10;
    }
}
