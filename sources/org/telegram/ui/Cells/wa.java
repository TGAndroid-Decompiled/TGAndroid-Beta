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
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.m40;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xx;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ae;
import org.telegram.ui.d61;
import org.telegram.ui.dj1;
import org.telegram.ui.i41;
import org.telegram.ui.je;
import org.telegram.ui.md;
import org.telegram.ui.ra1;
import org.telegram.ui.rd;
import org.telegram.ui.ry;
import org.telegram.ui.sd;
import org.telegram.ui.ui1;
import org.telegram.ui.w51;
import org.telegram.ui.xn;
import org.telegram.ui.y51;
import org.telegram.ui.z61;
import org.telegram.ui.zg0;
public final class wa implements View.OnClickListener {
    public final int f21569a;
    public final int f21570b;
    public final Object f21571c;
    public final Object d;

    public wa(int i10, View view, AtomicReference atomicReference) {
        this.f21569a = 17;
        this.f21570b = i10;
        this.f21571c = view;
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
        int i13 = this.f21569a;
        AndroidUtilities.VcardItem vcardItem = null;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f21570b;
        Object obj = this.d;
        Object obj2 = this.f21571c;
        switch (i13) {
            case 0:
                ya yaVar = (ya) obj2;
                yaVar.e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new ci.l4(yaVar, i15, 3));
                return;
            case 1:
                ((gb) obj2).a(i15, ((fb) obj).h);
                return;
            case 2:
                je jeVar = (je) obj2;
                ra1 ra1Var = (ra1) obj;
                ae aeVar = jeVar.Q0;
                if (view.isEnabled() && !aeVar.N && !jeVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (jeVar.L0 > currentTime) {
                        jeVar.Z0 = xc.a0(ra1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, yh.g.j0(jeVar.L0 - currentTime)))).j();
                        return;
                    } else if (jeVar.X0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        xc.a0(ra1Var).L(jeVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new md(jeVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        rd rdVar = new rd(jeVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f31562b0 = rdVar;
                        aeVar.setLoading(true);
                        twoStepVerificationActivity.s0(new sd(jeVar, ra1Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 3:
                xn xnVar = (xn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (xnVar.X0 != null && xnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    return;
                }
                return;
            case 4:
                xn xnVar2 = (xn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (xnVar2.f39353d5 != null && i15 < arrayList.size()) {
                    xnVar2.Ba(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 5:
                ((tc0) obj2).setValue(i15);
                ((org.telegram.ui.Components.w2) obj).run();
                return;
            case 6:
                gs gsVar = (gs) obj2;
                v51 v51Var = (v51) obj;
                if (gsVar.S()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    b2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = gsVar.f24420w0;
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
                v51Var.N(true);
                return;
            case 7:
                m40 m40Var = (m40) obj2;
                m40Var.f26089n = i15;
                m40Var.f26086b.d(view.getLeft(), false);
                m40Var.f26087c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                m40Var.invalidate();
                return;
            case 8:
                pe0 pe0Var = (pe0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = pe0Var.f27011n;
                ArrayList arrayList2 = pe0Var.M;
                org.telegram.ui.ActionBar.n2 n2Var = pe0Var.f27012r;
                int i16 = pe0Var.F;
                if (i15 >= i16 && i15 < pe0Var.G) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i16);
                } else {
                    int i17 = pe0Var.H;
                    if (i15 >= i17 && i15 < pe0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) pe0Var.L.get(i15 - i17);
                    }
                }
                if (vcardItem != null) {
                    if (pe0Var.J) {
                        int i18 = vcardItem.type;
                        if (i18 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(268435456);
                                n2Var.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        } else if (i18 == 1) {
                            nf.f.s(n2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                            return;
                        } else if (i18 == 3) {
                            String value = vcardItem.getValue(false);
                            if (!value.startsWith("http")) {
                                value = "http://".concat(value);
                            }
                            nf.f.s(n2Var.getParentActivity(), value);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n2Var.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(5, pe0Var, vcardItem));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i15 >= pe0Var.F && i15 < pe0Var.G) {
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
                        int themedColor = pe0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Sh);
                        textView.setEnabled(z14);
                        if (!z14) {
                            themedColor &= Integer.MAX_VALUE;
                        }
                        textView.setTextColor(themedColor);
                    }
                    ((ne0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 9:
                ht0 ht0Var = (ht0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                yu0 yu0Var = ht0Var.f24822f;
                org.telegram.ui.ActionBar.n2 n2Var2 = yu0Var.f30450v1;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                ht0Var.E(false);
                ht0Var.u(i15);
                if (ht0Var.d.isEmpty()) {
                    yu0Var.v1(true);
                    yu0Var.F();
                }
                n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-yu0Var.f30425j1));
                n2Var2.getMessagesController().addUserToChat(chat.f18083id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new ar0(2, ht0Var, chat));
                return;
            case 10:
                ((j41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 11:
                ry.a0((ry) obj2, i15, (o70) obj);
                return;
            case 12:
                zg0.Y((zg0) obj2, i15, (o70) obj);
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
                    l6Var.f20377c.a(z12, true);
                }
                return;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((i41) saveToGallerySettingsActivity.f31405s.get(i15)).f34027c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f31399a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 15:
                xx xxVar = (xx) obj;
                z61 z61Var = ((y51) obj2).f39728c;
                if (!xxVar.e && !UserConfig.getInstance(z61Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new rg.x0(z61Var.f40011c1, z61Var.getContext(), z61Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    w51 w51Var = z61Var.f40021h0;
                    if (i21 < w51Var.getChildCount()) {
                        if ((w51Var.getChildAt(i21) instanceof d61) && (R = RecyclerView.R((view2 = w51Var.getChildAt(i21)))) >= 0 && z61Var.f40059y0.get(R) == i15) {
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
                    z61Var.i(num.intValue(), view2);
                }
                tv.W(null, xxVar.f30088b, false, null, null);
                z61Var.B0.add(Long.valueOf(xxVar.f30088b.f18110id));
                z61Var.B(true, true, true);
                return;
            case 16:
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!dVar.N) {
                    cf.c cVar = dj1.d;
                    if (cVar != null && ((byte[]) cVar.e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.f21570b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new jh(dVar, f3Var, i22, view, cVar));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 17:
                SharedConfig.setSearchEngineType(i15);
                ((s8) ((View) obj2)).u(org.telegram.ui.web.n1.a().f38786a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 18:
                qg.u1 u1Var = (qg.u1) obj2;
                u1Var.a(i15);
                u1Var.f41617b.v().i(i15 - 1, true);
                u1Var.f41617b.b((pg.m) obj);
                return;
            case 19:
                nr0 nr0Var = (nr0) obj2;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj;
                op opVar = nr0Var.F;
                opVar.a(!opVar.f26827a.f21943q, true);
                boolean z17 = opVar.f26827a.f21943q;
                xc a02 = xc.a0(n2Var3);
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
                nr0Var.d.h = Boolean.valueOf(z17);
                if (nr0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(nr0Var.H, true);
                    nr0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(nr0Var.f46070c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new ui1(4, nr0Var, n2Var3));
                return;
            case 20:
                yh.l5 l5Var = (yh.l5) obj2;
                Runnable runnable = (Runnable) obj;
                l5Var.getClass();
                if ((i15 & 15) != 0) {
                    i14 = 15;
                } else if ((i15 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(l5Var.f47333g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = l5Var.f47333g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    l5Var.f47333g = i24;
                    l5Var.i(true);
                }
                runnable.run();
                return;
            default:
                nf.f.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
        }
    }

    public wa(Object obj, int i10, Object obj2, int i11) {
        this.f21569a = i11;
        this.f21571c = obj;
        this.f21570b = i10;
        this.d = obj2;
    }

    public wa(Object obj, Object obj2, int i10, int i11) {
        this.f21569a = i11;
        this.f21571c = obj;
        this.d = obj2;
        this.f21570b = i10;
    }
}
