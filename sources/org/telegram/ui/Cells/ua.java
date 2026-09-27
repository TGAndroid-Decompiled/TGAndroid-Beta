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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.ut0;
import org.telegram.ui.Components.uv;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.yx;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b61;
import org.telegram.ui.bh0;
import org.telegram.ui.bj1;
import org.telegram.ui.c71;
import org.telegram.ui.ce;
import org.telegram.ui.g61;
import org.telegram.ui.l41;
import org.telegram.ui.me;
import org.telegram.ui.qd;
import org.telegram.ui.ra1;
import org.telegram.ui.si1;
import org.telegram.ui.ty;
import org.telegram.ui.ud;
import org.telegram.ui.vd;
import org.telegram.ui.xn;
import org.telegram.ui.z51;
public final class ua implements View.OnClickListener {
    public final int f21670a;
    public final int f21671b;
    public final Object f21672c;
    public final Object d;

    public ua(int i10, View view, AtomicReference atomicReference) {
        this.f21670a = 17;
        this.f21671b = i10;
        this.f21672c = view;
        this.d = atomicReference;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        View view2;
        int S;
        int i10;
        int i11;
        int i12;
        int i13 = this.f21670a;
        AndroidUtilities.VcardItem vcardItem = null;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f21671b;
        Object obj = this.d;
        Object obj2 = this.f21672c;
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
                me meVar = (me) obj2;
                ra1 ra1Var = (ra1) obj;
                ce ceVar = meVar.Q0;
                if (view.isEnabled() && !ceVar.N && !meVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (meVar.L0 > currentTime) {
                        meVar.Z0 = xc.a0(ra1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, yh.g.j0(meVar.L0 - currentTime)))).j();
                        return;
                    } else if (meVar.X0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        xc.a0(ra1Var).L(meVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new qd(meVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        ud udVar = new ud(meVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f31879b0 = udVar;
                        ceVar.setLoading(true);
                        twoStepVerificationActivity.s0(new vd(meVar, ra1Var, twoStepVerificationActivity, 2));
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
                if (xnVar2.f39733d5 != null && i15 < arrayList.size()) {
                    xnVar2.Ba(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 5:
                ((ed0) obj2).setValue(i15);
                ((org.telegram.ui.Components.x2) obj).run();
                return;
            case 6:
                hs hsVar = (hs) obj2;
                l61 l61Var = (l61) obj;
                if (hsVar.S()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                    c2Var.R = string;
                    c2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    c2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = hsVar.f24907w0;
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
                hsVar.V();
                l61Var.N(true);
                return;
            case 7:
                o40 o40Var = (o40) obj2;
                o40Var.f26964n = i15;
                o40Var.f26961b.d(view.getLeft(), false);
                o40Var.f26962c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                o40Var.invalidate();
                return;
            case 8:
                ze0 ze0Var = (ze0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = ze0Var.f30907n;
                ArrayList arrayList2 = ze0Var.M;
                org.telegram.ui.ActionBar.o2 o2Var = ze0Var.f30908r;
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
                                o2Var.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        } else if (i18 == 1) {
                            nf.f.s(o2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                            return;
                        } else if (i18 == 3) {
                            String value = vcardItem.getValue(false);
                            if (!value.startsWith("http")) {
                                value = "http://".concat(value);
                            }
                            nf.f.s(o2Var.getParentActivity(), value);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o2Var.getParentActivity());
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
                        int themedColor = ze0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Sh);
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
                ut0 ut0Var = (ut0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                lv0 lv0Var = ut0Var.f28941f;
                org.telegram.ui.ActionBar.o2 o2Var2 = lv0Var.f26212v1;
                o2Var2.finishPreviewFragment();
                chat.left = false;
                ut0Var.E(false);
                ut0Var.u(i15);
                if (ut0Var.d.isEmpty()) {
                    lv0Var.v1(true);
                    lv0Var.F();
                }
                o2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-lv0Var.f26187j1));
                o2Var2.getMessagesController().addUserToChat(chat.f18329id, o2Var2.getUserConfig().getCurrentUser(), 0, null, o2Var2, new dp0(4, ut0Var, chat));
                return;
            case 10:
                ((z41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 11:
                ty.a0((ty) obj2, i15, (a80) obj);
                return;
            case 12:
                bh0.Y((bh0) obj2, i15, (a80) obj);
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
                    l6Var.f20614c.a(z12, true);
                }
                return;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.o1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((l41) saveToGallerySettingsActivity.f31722s.get(i15)).f35244c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f31716a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 15:
                yx yxVar = (yx) obj;
                c71 c71Var = ((b61) obj2).f32250c;
                if (!yxVar.e && !UserConfig.getInstance(c71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (R != null) {
                        R.showDialog(new rg.x0(c71Var.f32575c1, c71Var.getContext(), c71Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    z51 z51Var = c71Var.f32585h0;
                    if (i21 < z51Var.getChildCount()) {
                        if ((z51Var.getChildAt(i21) instanceof g61) && (S = RecyclerView.S((view2 = z51Var.getChildAt(i21)))) >= 0 && c71Var.f32623y0.get(S) == i15) {
                            num = Integer.valueOf(S);
                        } else {
                            i21++;
                        }
                    } else {
                        num = null;
                        view2 = null;
                    }
                }
                if (num != null) {
                    c71Var.i(num.intValue(), view2);
                }
                uv.W(null, yxVar.f30795b, false, null, null);
                c71Var.B0.add(Long.valueOf(yxVar.f30795b.f18356id));
                c71Var.B(true, true, true);
                return;
            case 16:
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj;
                if (!dVar.N) {
                    cf.c cVar = bj1.d;
                    if (cVar != null && ((byte[]) cVar.e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.f21671b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new jh(dVar, g3Var, i22, view, cVar));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 17:
                SharedConfig.setSearchEngineType(i15);
                ((r8) ((View) obj2)).u(org.telegram.ui.web.o1.a().f39121a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 18:
                qg.r1 r1Var = (qg.r1) obj2;
                r1Var.a(i15);
                r1Var.f41945b.v().i(i15 - 1, true);
                r1Var.f41945b.b((pg.m) obj);
                return;
            case 19:
                bs0 bs0Var = (bs0) obj2;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) obj;
                pp ppVar = bs0Var.F;
                ppVar.a(!ppVar.f27437a.f22197q, true);
                boolean z17 = ppVar.f27437a.f22197q;
                xc a02 = xc.a0(o2Var3);
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
                bs0Var.d.h = Boolean.valueOf(z17);
                if (bs0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(bs0Var.H, true);
                    bs0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(bs0Var.f46471c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new si1(4, bs0Var, o2Var3));
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
                int flag = TLObject.setFlag(k5Var.f47662g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = k5Var.f47662g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    k5Var.f47662g = i24;
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
        this.f21670a = i11;
        this.f21672c = obj;
        this.f21671b = i10;
        this.d = obj2;
    }

    public ua(Object obj, Object obj2, int i10, int i11) {
        this.f21670a = i11;
        this.f21672c = obj;
        this.d = obj2;
        this.f21671b = i10;
    }
}
