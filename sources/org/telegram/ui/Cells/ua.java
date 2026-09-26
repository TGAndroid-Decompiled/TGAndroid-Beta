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
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yx;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a71;
import org.telegram.ui.ae;
import org.telegram.ui.dj1;
import org.telegram.ui.e61;
import org.telegram.ui.j41;
import org.telegram.ui.je;
import org.telegram.ui.md;
import org.telegram.ui.qy;
import org.telegram.ui.rd;
import org.telegram.ui.sa1;
import org.telegram.ui.sd;
import org.telegram.ui.ui1;
import org.telegram.ui.wn;
import org.telegram.ui.x51;
import org.telegram.ui.yg0;
import org.telegram.ui.z51;
public final class ua implements View.OnClickListener {
    public final int f21667a;
    public final int f21668b;
    public final Object f21669c;
    public final Object d;

    public ua(int i10, View view, AtomicReference atomicReference) {
        this.f21667a = 17;
        this.f21668b = i10;
        this.f21669c = view;
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
        int i13 = this.f21667a;
        AndroidUtilities.VcardItem vcardItem = null;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f21668b;
        Object obj = this.d;
        Object obj2 = this.f21669c;
        switch (i13) {
            case 0:
                wa waVar = (wa) obj2;
                waVar.e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new ci.l4(waVar, i15, 3));
                return;
            case 1:
                ((eb) obj2).a(i15, ((db) obj).h);
                return;
            case 2:
                je jeVar = (je) obj2;
                sa1 sa1Var = (sa1) obj;
                ae aeVar = jeVar.Q0;
                if (view.isEnabled() && !aeVar.N && !jeVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (jeVar.L0 > currentTime) {
                        jeVar.Z0 = xc.a0(sa1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, yh.g.j0(jeVar.L0 - currentTime)))).j();
                        return;
                    } else if (jeVar.X0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        xc.a0(sa1Var).L(jeVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new md(jeVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        rd rdVar = new rd(jeVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f31877b0 = rdVar;
                        aeVar.setLoading(true);
                        twoStepVerificationActivity.s0(new sd(jeVar, sa1Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 3:
                wn wnVar = (wn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (wnVar.X0 != null && wnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    return;
                }
                return;
            case 4:
                wn wnVar2 = (wn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (wnVar2.f39452d5 != null && i15 < arrayList.size()) {
                    wnVar2.Ba(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 5:
                ((ed0) obj2).setValue(i15);
                ((org.telegram.ui.Components.x2) obj).run();
                return;
            case 6:
                gs gsVar = (gs) obj2;
                j61 j61Var = (j61) obj;
                if (gsVar.S()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
                    a2Var.R = string;
                    a2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    a2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = gsVar.f24524w0;
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
                gsVar.V();
                j61Var.N(true);
                return;
            case 7:
                m40 m40Var = (m40) obj2;
                m40Var.f26356n = i15;
                m40Var.f26353b.d(view.getLeft(), false);
                m40Var.f26354c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                m40Var.invalidate();
                return;
            case 8:
                ze0 ze0Var = (ze0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = ze0Var.f30859n;
                ArrayList arrayList2 = ze0Var.M;
                org.telegram.ui.ActionBar.m2 m2Var = ze0Var.f30860r;
                int i16 = ze0Var.F;
                if (i15 >= i16 && i15 < ze0Var.G) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i16);
                } else {
                    int i17 = ze0Var.H;
                    if (i15 >= i17 && i15 < ze0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) ze0Var.L.get(i15 - i17);
                    }
                }
                if (vcardItem != null) {
                    if (ze0Var.J) {
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
                            nf.f.s(m2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                            return;
                        } else if (i18 == 3) {
                            String value = vcardItem.getValue(false);
                            if (!value.startsWith("http")) {
                                value = "http://".concat(value);
                            }
                            nf.f.s(m2Var.getParentActivity(), value);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(m2Var.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(5, ze0Var, vcardItem));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i15 >= ze0Var.F && i15 < ze0Var.G) {
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
                        int themedColor = ze0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Sh);
                        textView.setEnabled(z14);
                        if (!z14) {
                            themedColor &= Integer.MAX_VALUE;
                        }
                        textView.setTextColor(themedColor);
                    }
                    ((xe0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 9:
                st0 st0Var = (st0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                jv0 jv0Var = st0Var.f28326f;
                org.telegram.ui.ActionBar.m2 m2Var2 = jv0Var.f25559v1;
                m2Var2.finishPreviewFragment();
                chat.left = false;
                st0Var.E(false);
                st0Var.u(i15);
                if (st0Var.d.isEmpty()) {
                    jv0Var.v1(true);
                    jv0Var.F();
                }
                m2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-jv0Var.f25534j1));
                m2Var2.getMessagesController().addUserToChat(chat.f18335id, m2Var2.getUserConfig().getCurrentUser(), 0, null, m2Var2, new wn0(7, st0Var, chat));
                return;
            case 10:
                ((x41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 11:
                qy.a0((qy) obj2, i15, (y70) obj);
                return;
            case 12:
                yg0.Y((yg0) obj2, i15, (y70) obj);
                return;
            case 13:
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
                    l6Var.f20612c.a(z12, true);
                }
                return;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.m1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((j41) saveToGallerySettingsActivity.f31720s.get(i15)).f34641c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f31714a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 15:
                yx yxVar = (yx) obj;
                a71 a71Var = ((z51) obj2).f40341c;
                if (!yxVar.e && !UserConfig.getInstance(a71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new rg.x0(a71Var.f32017c1, a71Var.getContext(), a71Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    x51 x51Var = a71Var.f32027h0;
                    if (i21 < x51Var.getChildCount()) {
                        if ((x51Var.getChildAt(i21) instanceof e61) && (R = RecyclerView.R((view2 = x51Var.getChildAt(i21)))) >= 0 && a71Var.f32065y0.get(R) == i15) {
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
                    a71Var.i(num.intValue(), view2);
                }
                tv.W(null, yxVar.f30715b, false, null, null);
                a71Var.B0.add(Long.valueOf(yxVar.f30715b.f18362id));
                a71Var.B(true, true, true);
                return;
            case 16:
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                if (!dVar.N) {
                    cf.c cVar = dj1.d;
                    if (cVar != null && ((byte[]) cVar.e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.f21668b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new jh(dVar, e3Var, i22, view, cVar));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 17:
                SharedConfig.setSearchEngineType(i15);
                ((r8) ((View) obj2)).u(org.telegram.ui.web.n1.a().f39154a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 18:
                qg.s1 s1Var = (qg.s1) obj2;
                s1Var.a(i15);
                s1Var.f41919b.v().i(i15 - 1, true);
                s1Var.f41919b.b((pg.m) obj);
                return;
            case 19:
                zr0 zr0Var = (zr0) obj2;
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) obj;
                op opVar = zr0Var.F;
                opVar.a(!opVar.f27167a.f22194q, true);
                boolean z17 = opVar.f27167a.f22194q;
                xc a02 = xc.a0(m2Var3);
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
                zr0Var.d.h = Boolean.valueOf(z17);
                if (zr0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(zr0Var.H, true);
                    zr0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(zr0Var.f46398c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new ui1(4, zr0Var, m2Var3));
                return;
            case 20:
                yh.k5 k5Var = (yh.k5) obj2;
                Runnable runnable = (Runnable) obj;
                k5Var.getClass();
                if ((i15 & 15) != 0) {
                    i14 = 15;
                } else if ((i15 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(k5Var.f47608g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = k5Var.f47608g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    k5Var.f47608g = i24;
                    k5Var.i(true);
                }
                runnable.run();
                return;
            default:
                nf.f.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
        }
    }

    public ua(Object obj, int i10, Object obj2, int i11) {
        this.f21667a = i11;
        this.f21669c = obj;
        this.f21668b = i10;
        this.d = obj2;
    }

    public ua(Object obj, Object obj2, int i10, int i11) {
        this.f21667a = i11;
        this.f21669c = obj;
        this.d = obj2;
        this.f21668b = i10;
    }
}
