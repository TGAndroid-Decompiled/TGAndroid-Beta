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
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.lw;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.db1;
import org.telegram.ui.eo;
import org.telegram.ui.fe;
import org.telegram.ui.fj1;
import org.telegram.ui.gh0;
import org.telegram.ui.k61;
import org.telegram.ui.m61;
import org.telegram.ui.n71;
import org.telegram.ui.oe;
import org.telegram.ui.oj1;
import org.telegram.ui.r61;
import org.telegram.ui.rd;
import org.telegram.ui.u41;
import org.telegram.ui.vy;
import org.telegram.ui.wd;
import org.telegram.ui.xd;
public final class sa implements View.OnClickListener {
    public final int f22684a;
    public final int f22685b;
    public final Object f22686c;
    public final Object d;

    public sa(int i10, View view, AtomicReference atomicReference) {
        this.f22684a = 19;
        this.f22685b = i10;
        this.f22686c = view;
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
        int i13 = this.f22684a;
        AndroidUtilities.VcardItem vcardItem = null;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f22685b;
        Object obj = this.d;
        Object obj2 = this.f22686c;
        switch (i13) {
            case 0:
                ua uaVar = (ua) obj2;
                uaVar.f23298e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new ci.k4(uaVar, i15, 3));
                return;
            case 1:
                ((cb) obj2).a(i15, ((bb) obj).h);
                return;
            case 2:
                oe oeVar = (oe) obj2;
                db1 db1Var = (db1) obj;
                fe feVar = oeVar.Q0;
                if (view.isEnabled() && !feVar.N && !oeVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (oeVar.L0 > currentTime) {
                        oeVar.Z0 = zc.a0(db1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, yh.g.j0(oeVar.L0 - currentTime)))).j();
                        return;
                    } else if (oeVar.X0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        zc.a0(db1Var).L(oeVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new rd(oeVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        wd wdVar = new wd(oeVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f34410b0 = wdVar;
                        feVar.setLoading(true);
                        twoStepVerificationActivity.s0(new xd(oeVar, db1Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 3:
                eo eoVar = (eo) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (eoVar.X0 != null && eoVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    return;
                }
                return;
            case 4:
                eo eoVar2 = (eo) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (eoVar2.f37233d5 != null && i15 < arrayList.size()) {
                    eoVar2.Fa(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 5:
                ((yd0) obj2).setValue(i15);
                ((org.telegram.ui.Components.z2) obj).run();
                return;
            case 6:
                il ilVar = (il) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                s80 F = s80.F(ilVar, c6Var, ilVar.f27218x);
                F.Q = true;
                F.c(R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds), new bl(ilVar, i15, c6Var, 0), false);
                F.c(R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment), new cl(ilVar, 0), false);
                F.f30472s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F.Z();
                return;
            case 7:
                xs xsVar = (xs) obj2;
                h71 h71Var = (h71) obj;
                if (xsVar.T()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20141a;
                    a2Var.R = string;
                    a2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    a2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = xsVar.f32866w0;
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
                xsVar.W();
                h71Var.N(true);
                return;
            case 8:
                f50 f50Var = (f50) obj2;
                f50Var.f25893n = i15;
                f50Var.f25889b.d(view.getLeft(), false);
                f50Var.f25890c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                f50Var.invalidate();
                return;
            case 9:
                uf0 uf0Var = (uf0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = uf0Var.f31156n;
                ArrayList arrayList2 = uf0Var.M;
                org.telegram.ui.ActionBar.m2 m2Var = uf0Var.f31157r;
                int i16 = uf0Var.F;
                if (i15 >= i16 && i15 < uf0Var.G) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i16);
                } else {
                    int i17 = uf0Var.H;
                    if (i15 >= i17 && i15 < uf0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) uf0Var.L.get(i15 - i17);
                    }
                }
                if (vcardItem != null) {
                    if (uf0Var.J) {
                        int i18 = vcardItem.type;
                        if (i18 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(268435456);
                                m2Var.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        } else if (i18 == 1) {
                            of.f.s(m2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                            return;
                        } else if (i18 == 3) {
                            String value = vcardItem.getValue(false);
                            if (!value.startsWith("http")) {
                                value = "http://".concat(value);
                            }
                            of.f.s(m2Var.getParentActivity(), value);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(m2Var.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(5, uf0Var, vcardItem));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i15 >= uf0Var.F && i15 < uf0Var.G) {
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
                        int themedColor = uf0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Sh);
                        textView.setEnabled(z14);
                        if (!z14) {
                            themedColor &= Integer.MAX_VALUE;
                        }
                        textView.setTextColor(themedColor);
                    }
                    ((sf0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 10:
                qu0 qu0Var = (qu0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                hw0 hw0Var = qu0Var.f29936f;
                org.telegram.ui.ActionBar.m2 m2Var2 = hw0Var.f26972v1;
                m2Var2.finishPreviewFragment();
                chat.left = false;
                qu0Var.E(false);
                qu0Var.u(i15);
                if (qu0Var.d.isEmpty()) {
                    hw0Var.v1(true);
                    hw0Var.F();
                }
                m2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-hw0Var.f26947j1));
                m2Var2.getMessagesController().addUserToChat(chat.f19802id, m2Var2.getUserConfig().getCurrentUser(), 0, null, m2Var2, new sj0(11, qu0Var, chat));
                return;
            case 11:
                ((v51) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 12:
                vy.p0((vy) obj2, i15, (s80) obj);
                return;
            case 13:
                gh0.Y((gh0) obj2, i15, (s80) obj);
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
                    l6Var.f22188c.a(z12, true);
                }
                return;
            case 15:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.m1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((u41) saveToGallerySettingsActivity.f34247s.get(i15)).f42363c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f34240a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 16:
                qy qyVar = (qy) obj;
                n71 n71Var = ((m61) obj2).f39931c;
                if (!qyVar.f29949e && !UserConfig.getInstance(n71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new rg.y0(n71Var.f40261c1, n71Var.getContext(), n71Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    k61 k61Var = n71Var.f40272h0;
                    if (i21 < k61Var.getChildCount()) {
                        if ((k61Var.getChildAt(i21) instanceof r61) && (R = RecyclerView.R((view2 = k61Var.getChildAt(i21)))) >= 0 && n71Var.f40310y0.get(R) == i15) {
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
                    n71Var.i(num.intValue(), view2);
                }
                lw.X(null, qyVar.f29947b, false, null, null);
                n71Var.B0.add(Long.valueOf(qyVar.f29947b.f19829id));
                n71Var.B(true, true, true);
                return;
            case 17:
                ((org.telegram.ui.Wallet.k) obj).run(Integer.valueOf(i15));
                ((org.telegram.ui.Wallet.w4) obj2).setSelected(i15);
                return;
            case 18:
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                if (!dVar.N) {
                    ci.u5 u5Var = oj1.d;
                    if (u5Var != null && ((byte[]) u5Var.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.f22685b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new mh(dVar, e3Var, i22, view, u5Var));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 19:
                SharedConfig.setSearchEngineType(i15);
                ((r8) ((View) obj2)).u(org.telegram.ui.web.n1.a().f43350a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 20:
                qg.r1 r1Var = (qg.r1) obj2;
                r1Var.a(i15);
                r1Var.f46468b.v().i(i15 - 1, true);
                r1Var.f46468b.b((pg.m) obj);
                return;
            case 21:
                xs0 xs0Var = (xs0) obj2;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) obj;
                fq fqVar = xs0Var.F;
                fqVar.a(!fqVar.f26150a.f23874q, true);
                boolean z17 = fqVar.f26150a.f23874q;
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
                xs0Var.d.h = Boolean.valueOf(z17);
                if (xs0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(xs0Var.H, true);
                    xs0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(xs0Var.f51723c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new fj1(4, xs0Var, m2Var3));
                return;
            case 22:
                yh.f5 f5Var = (yh.f5) obj2;
                Runnable runnable = (Runnable) obj;
                f5Var.getClass();
                if ((i15 & 15) != 0) {
                    i14 = 15;
                } else if ((i15 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(f5Var.f52739g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = f5Var.f52739g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    f5Var.f52739g = i24;
                    f5Var.i(true);
                }
                runnable.run();
                return;
            default:
                of.f.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
        }
    }

    public sa(Object obj, int i10, Object obj2, int i11) {
        this.f22684a = i11;
        this.f22686c = obj;
        this.f22685b = i10;
        this.d = obj2;
    }

    public sa(Object obj, Object obj2, int i10, int i11) {
        this.f22684a = i11;
        this.f22686c = obj;
        this.d = obj2;
        this.f22685b = i10;
    }
}
