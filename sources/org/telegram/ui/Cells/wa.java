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
import org.telegram.messenger.sh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.we0;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ce;
import org.telegram.ui.eo;
import org.telegram.ui.fb1;
import org.telegram.ui.fh0;
import org.telegram.ui.i61;
import org.telegram.ui.k61;
import org.telegram.ui.l71;
import org.telegram.ui.le;
import org.telegram.ui.od;
import org.telegram.ui.p61;
import org.telegram.ui.pj1;
import org.telegram.ui.rg0;
import org.telegram.ui.td;
import org.telegram.ui.ud;
import org.telegram.ui.v41;
import org.telegram.ui.wy;
public final class wa implements View.OnClickListener {
    public final int f20684a;
    public final int f20685b;
    public final Object f20686c;
    public final Object d;

    public wa(int i10, View view, AtomicReference atomicReference) {
        this.f20684a = 17;
        this.f20685b = i10;
        this.f20686c = view;
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
        int i13 = this.f20684a;
        AndroidUtilities.VcardItem vcardItem = null;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f20685b;
        Object obj = this.d;
        Object obj2 = this.f20686c;
        switch (i13) {
            case 0:
                ya yaVar = (ya) obj2;
                yaVar.e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new bi.c8(yaVar, i15, 2));
                return;
            case 1:
                ((gb) obj2).a(i15, ((fb) obj).h);
                return;
            case 2:
                le leVar = (le) obj2;
                fb1 fb1Var = (fb1) obj;
                ce ceVar = leVar.Q0;
                if (view.isEnabled() && !ceVar.N && !leVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (leVar.L0 > currentTime) {
                        leVar.Z0 = wc.a0(fb1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, xh.h.j0(leVar.L0 - currentTime)))).j();
                        return;
                    } else if (leVar.X0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        wc.a0(fb1Var).L(leVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new od(leVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        td tdVar = new td(leVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f30703b0 = tdVar;
                        ceVar.setLoading(true);
                        twoStepVerificationActivity.s0(new ud(leVar, fb1Var, twoStepVerificationActivity, 2));
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
                if (eoVar2.f32299d5 != null && i15 < arrayList.size()) {
                    eoVar2.Ba(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 5:
                ((dd0) obj2).setValue(i15);
                ((org.telegram.ui.Components.x2) obj).run();
                return;
            case 6:
                ls lsVar = (ls) obj2;
                j61 j61Var = (j61) obj;
                if (lsVar.S()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    d2Var.R = string;
                    d2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    d2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = lsVar.f25103w0;
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
                lsVar.V();
                j61Var.N(true);
                return;
            case 7:
                v40 v40Var = (v40) obj2;
                v40Var.f27815n = i15;
                v40Var.f27812b.d(view.getLeft(), false);
                v40Var.f27813c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                v40Var.invalidate();
                return;
            case 8:
                ye0 ye0Var = (ye0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = ye0Var.f29312n;
                ArrayList arrayList2 = ye0Var.M;
                org.telegram.ui.ActionBar.p2 p2Var = ye0Var.f29313r;
                int i16 = ye0Var.F;
                if (i15 >= i16 && i15 < ye0Var.G) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i16);
                } else {
                    int i17 = ye0Var.H;
                    if (i15 >= i17 && i15 < ye0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) ye0Var.L.get(i15 - i17);
                    }
                }
                if (vcardItem != null) {
                    if (ye0Var.J) {
                        int i18 = vcardItem.type;
                        if (i18 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(268435456);
                                p2Var.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        } else if (i18 == 1) {
                            nf.f.s(p2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                            return;
                        } else if (i18 == 3) {
                            String value = vcardItem.getValue(false);
                            if (!value.startsWith("http")) {
                                value = "http://".concat(value);
                            }
                            nf.f.s(p2Var.getParentActivity(), value);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p2Var.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new kg.j(6, ye0Var, vcardItem));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i15 >= ye0Var.F && i15 < ye0Var.G) {
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
                        int themedColor = ye0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Sh);
                        textView.setEnabled(z14);
                        if (!z14) {
                            themedColor &= Integer.MAX_VALUE;
                        }
                        textView.setTextColor(themedColor);
                    }
                    ((we0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 9:
                qt0 qt0Var = (qt0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                iv0 iv0Var = qt0Var.f26486f;
                org.telegram.ui.ActionBar.p2 p2Var2 = iv0Var.f24131v1;
                p2Var2.finishPreviewFragment();
                chat.left = false;
                qt0Var.E(false);
                qt0Var.u(i15);
                if (qt0Var.d.isEmpty()) {
                    iv0Var.v1(true);
                    iv0Var.F();
                }
                p2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-iv0Var.f24106j1));
                p2Var2.getMessagesController().addUserToChat(chat.f17195id, p2Var2.getUserConfig().getCurrentUser(), 0, null, p2Var2, new yo0(5, qt0Var, chat));
                return;
            case 10:
                ((x41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 11:
                wy.b0((wy) obj2, i15, (w70) obj);
                return;
            case 12:
                fh0.Y((fh0) obj2, i15, (w70) obj);
                return;
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                m6[] m6VarArr = (m6[]) obj;
                if (i15 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zArr[0] = z10;
                for (int i20 = 0; i20 < 2; i20++) {
                    m6 m6Var = m6VarArr[i20];
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
                    m6Var.f19531c.a(z12, true);
                }
                return;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.p1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((v41) saveToGallerySettingsActivity.f30546s.get(i15)).f37409c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f30540a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 15:
                dy dyVar = (dy) obj;
                l71 l71Var = ((k61) obj2).f34244c;
                if (!dyVar.e && !UserConfig.getInstance(l71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new qg.a1(l71Var.f34560c1, l71Var.getContext(), l71Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    i61 i61Var = l71Var.f34570h0;
                    if (i21 < i61Var.getChildCount()) {
                        if ((i61Var.getChildAt(i21) instanceof p61) && (R = RecyclerView.R((view2 = i61Var.getChildAt(i21)))) >= 0 && l71Var.f34608y0.get(R) == i15) {
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
                    l71Var.i(num.intValue(), view2);
                }
                wv.W(null, dyVar.f22499b, false, null, null);
                l71Var.B0.add(Long.valueOf(dyVar.f22499b.f17222id));
                l71Var.B(true, true, true);
                return;
            case 16:
                bi.d dVar = (bi.d) obj2;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj;
                if (!dVar.N) {
                    bi.u6 u6Var = pj1.d;
                    if (u6Var != null && ((byte[]) u6Var.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.f20685b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new sh(dVar, h3Var, i22, view, u6Var));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 17:
                SharedConfig.setSearchEngineType(i15);
                ((s8) ((View) obj2)).u(org.telegram.ui.web.o1.a().f38031a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 18:
                pg.r1 r1Var = (pg.r1) obj2;
                r1Var.a(i15);
                r1Var.f40273b.u().i(i15 - 1, true);
                r1Var.f40273b.B((og.m) obj);
                return;
            case 19:
                wr0 wr0Var = (wr0) obj2;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) obj;
                tp tpVar = wr0Var.F;
                tpVar.a(!tpVar.f27462a.f21057q, true);
                boolean z17 = tpVar.f27462a.f21057q;
                wc a02 = wc.a0(p2Var3);
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
                wr0Var.d.h = Boolean.valueOf(z17);
                if (wr0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(wr0Var.H, true);
                    wr0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(wr0Var.f44319c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new rg0(29, wr0Var, p2Var3));
                return;
            case 20:
                xh.n5 n5Var = (xh.n5) obj2;
                Runnable runnable = (Runnable) obj;
                n5Var.getClass();
                if ((i15 & 15) != 0) {
                    i14 = 15;
                } else if ((i15 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(n5Var.f45757g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = n5Var.f45757g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    n5Var.f45757g = i24;
                    n5Var.i(true);
                }
                runnable.run();
                return;
            default:
                nf.f.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
        }
    }

    public wa(Object obj, int i10, Object obj2, int i11) {
        this.f20684a = i11;
        this.f20686c = obj;
        this.f20685b = i10;
        this.d = obj2;
    }

    public wa(Object obj, Object obj2, int i10, int i11) {
        this.f20684a = i11;
        this.f20686c = obj;
        this.d = obj2;
        this.f20685b = i10;
    }
}
