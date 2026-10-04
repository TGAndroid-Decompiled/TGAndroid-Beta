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
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b61;
import org.telegram.ui.c71;
import org.telegram.ui.ce;
import org.telegram.ui.ch0;
import org.telegram.ui.dj1;
import org.telegram.ui.g61;
import org.telegram.ui.l41;
import org.telegram.ui.me;
import org.telegram.ui.qd;
import org.telegram.ui.ud;
import org.telegram.ui.ui1;
import org.telegram.ui.uy;
import org.telegram.ui.va1;
import org.telegram.ui.vd;
import org.telegram.ui.yn;
import org.telegram.ui.z51;
public final class ua implements View.OnClickListener {
    public final int f23534a;
    public final int f23535b;
    public final Object f23536c;
    public final Object d;

    public ua(int i10, View view, AtomicReference atomicReference) {
        this.f23534a = 17;
        this.f23535b = i10;
        this.f23536c = view;
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
        int i13 = this.f23534a;
        AndroidUtilities.VcardItem vcardItem = null;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f23535b;
        Object obj = this.d;
        Object obj2 = this.f23536c;
        switch (i13) {
            case 0:
                wa waVar = (wa) obj2;
                waVar.f23704e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new ci.l4(waVar, i15, 3));
                return;
            case 1:
                ((eb) obj2).a(i15, ((db) obj).h);
                return;
            case 2:
                me meVar = (me) obj2;
                va1 va1Var = (va1) obj;
                ce ceVar = meVar.J1;
                if (view.isEnabled() && !ceVar.N && !meVar.D1.N) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (meVar.E1 > currentTime) {
                        meVar.S1 = yc.a0(va1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, yh.g.j0(meVar.E1 - currentTime)))).j();
                        return;
                    } else if (meVar.Q1 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        yc.a0(va1Var).L(meVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new qd(meVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        ud udVar = new ud(meVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f34563b0 = udVar;
                        ceVar.setLoading(true);
                        twoStepVerificationActivity.s0(new vd(meVar, va1Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 3:
                yn ynVar = (yn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (ynVar.V0 != null && ynVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    return;
                }
                return;
            case 4:
                yn ynVar2 = (yn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (ynVar2.f43280b5 != null && i15 < arrayList.size()) {
                    ynVar2.Aa(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 5:
                ((gd0) obj2).setValue(i15);
                ((org.telegram.ui.Components.x2) obj).run();
                return;
            case 6:
                is isVar = (is) obj2;
                u61 u61Var = (u61) obj;
                if (isVar.Q()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(isVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    b2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = isVar.f27486w0;
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
                isVar.T();
                u61Var.N(true);
                return;
            case 7:
                p40 p40Var = (p40) obj2;
                p40Var.f29501n = i15;
                p40Var.f29497b.d(view.getLeft(), false);
                p40Var.f29498c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                p40Var.invalidate();
                return;
            case 8:
                bf0 bf0Var = (bf0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = bf0Var.f24936n;
                ArrayList arrayList2 = bf0Var.M;
                org.telegram.ui.ActionBar.n2 n2Var = bf0Var.f24937r;
                int i16 = bf0Var.F;
                if (i15 >= i16 && i15 < bf0Var.G) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i16);
                } else {
                    int i17 = bf0Var.H;
                    if (i15 >= i17 && i15 < bf0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) bf0Var.L.get(i15 - i17);
                    }
                }
                if (vcardItem != null) {
                    if (bf0Var.J) {
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
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(5, bf0Var, vcardItem));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i15 >= bf0Var.F && i15 < bf0Var.G) {
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
                        int themedColor = bf0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Sh);
                        textView.setEnabled(z14);
                        if (!z14) {
                            themedColor &= Integer.MAX_VALUE;
                        }
                        textView.setTextColor(themedColor);
                    }
                    ((ze0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 9:
                yt0 yt0Var = (yt0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                pv0 pv0Var = yt0Var.f33250f;
                org.telegram.ui.ActionBar.n2 n2Var2 = pv0Var.f29800v1;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                yt0Var.E(false);
                yt0Var.u(i15);
                if (yt0Var.d.isEmpty()) {
                    pv0Var.v1(true);
                    pv0Var.F();
                }
                n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-pv0Var.f29775j1));
                n2Var2.getMessagesController().addUserToChat(chat.f20037id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new uo0(6, yt0Var, chat));
                return;
            case 10:
                ((i51) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 11:
                uy.Z((uy) obj2, i15, (b80) obj);
                return;
            case 12:
                ch0.b0((ch0) obj2, i15, (b80) obj);
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
                    l6Var.f22435c.a(z12, true);
                }
                return;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((l41) saveToGallerySettingsActivity.f34400s.get(i15)).f38157c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f34393a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 15:
                ay ayVar = (ay) obj;
                c71 c71Var = ((b61) obj2).f35009c;
                if (!ayVar.f24705e && !UserConfig.getInstance(c71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new rg.y0(c71Var.f35303c1, c71Var.getContext(), c71Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    z51 z51Var = c71Var.f35314h0;
                    if (i21 < z51Var.getChildCount()) {
                        if ((z51Var.getChildAt(i21) instanceof g61) && (R = RecyclerView.R((view2 = z51Var.getChildAt(i21)))) >= 0 && c71Var.f35352y0.get(R) == i15) {
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
                    c71Var.i(num.intValue(), view2);
                }
                wv.U(null, ayVar.f24703b, false, null, null);
                c71Var.B0.add(Long.valueOf(ayVar.f24703b.f20064id));
                c71Var.B(true, true, true);
                return;
            case 16:
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!dVar.N) {
                    cf.c cVar = dj1.d;
                    if (cVar != null && ((byte[]) cVar.f4605e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.f23535b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new jh(dVar, f3Var, i22, view, cVar));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 17:
                SharedConfig.setSearchEngineType(i15);
                ((r8) ((View) obj2)).u(org.telegram.ui.web.o1.a().f42298a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 18:
                qg.r1 r1Var = (qg.r1) obj2;
                r1Var.a(i15);
                r1Var.f45310b.w().i(i15 - 1, true);
                r1Var.f45310b.b((pg.m) obj);
                return;
            case 19:
                fs0 fs0Var = (fs0) obj2;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj;
                qp qpVar = fs0Var.F;
                qpVar.a(!qpVar.f30140a.f24093q, true);
                boolean z17 = qpVar.f30140a.f24093q;
                yc a02 = yc.a0(n2Var3);
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
                fs0Var.d.h = Boolean.valueOf(z17);
                if (fs0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(fs0Var.H, true);
                    fs0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(fs0Var.f50218c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new ui1(4, fs0Var, n2Var3));
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
                int flag = TLObject.setFlag(k5Var.f51523g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = k5Var.f51523g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    k5Var.f51523g = i24;
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
        this.f23534a = i11;
        this.f23536c = obj;
        this.f23535b = i10;
        this.d = obj2;
    }

    public ua(Object obj, Object obj2, int i10, int i11) {
        this.f23534a = i11;
        this.f23536c = obj;
        this.d = obj2;
        this.f23535b = i10;
    }
}
