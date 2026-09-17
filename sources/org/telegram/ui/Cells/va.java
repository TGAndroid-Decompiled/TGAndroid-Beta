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
import org.telegram.messenger.kh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wx;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ab1;
import org.telegram.ui.bj1;
import org.telegram.ui.bo;
import org.telegram.ui.ce;
import org.telegram.ui.f61;
import org.telegram.ui.gh0;
import org.telegram.ui.h61;
import org.telegram.ui.i71;
import org.telegram.ui.kj1;
import org.telegram.ui.le;
import org.telegram.ui.m61;
import org.telegram.ui.od;
import org.telegram.ui.r41;
import org.telegram.ui.td;
import org.telegram.ui.ud;
import org.telegram.ui.wy;
public final class va implements View.OnClickListener {
    public final int f21497a;
    public final int f21498b;
    public final Object f21499c;
    public final Object d;

    public va(int i10, View view, AtomicReference atomicReference) {
        this.f21497a = 17;
        this.f21498b = i10;
        this.f21499c = view;
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
        int i13 = this.f21497a;
        AndroidUtilities.VcardItem vcardItem = null;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f21498b;
        Object obj = this.d;
        Object obj2 = this.f21499c;
        switch (i13) {
            case 0:
                xa xaVar = (xa) obj2;
                xaVar.e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new ci.b7(xaVar, i15, 2));
                return;
            case 1:
                ((fb) obj2).a(i15, ((eb) obj).h);
                return;
            case 2:
                le leVar = (le) obj2;
                ab1 ab1Var = (ab1) obj;
                ce ceVar = leVar.Q0;
                if (view.isEnabled() && !ceVar.N && !leVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (leVar.L0 > currentTime) {
                        leVar.Z0 = vc.a0(ab1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, yh.g.j0(leVar.L0 - currentTime)))).j();
                        return;
                    } else if (leVar.X0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        vc.a0(ab1Var).L(leVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new od(leVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        td tdVar = new td(leVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f31604b0 = tdVar;
                        ceVar.setLoading(true);
                        twoStepVerificationActivity.s0(new ud(leVar, ab1Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 3:
                bo boVar = (bo) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (boVar.X0 != null && boVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    return;
                }
                return;
            case 4:
                bo boVar2 = (bo) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (boVar2.f32258d5 != null && i15 < arrayList.size()) {
                    boVar2.Ba(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 5:
                ((uc0) obj2).setValue(i15);
                ((org.telegram.ui.Components.w2) obj).run();
                return;
            case 6:
                fs fsVar = (fs) obj2;
                x51 x51Var = (x51) obj;
                if (fsVar.S()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
                    c2Var.R = string;
                    c2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    c2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = fsVar.f24005w0;
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
                fsVar.V();
                x51Var.N(true);
                return;
            case 7:
                l40 l40Var = (l40) obj2;
                l40Var.f25816n = i15;
                l40Var.f25813b.d(view.getLeft(), false);
                l40Var.f25814c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                l40Var.invalidate();
                return;
            case 8:
                pe0 pe0Var = (pe0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = pe0Var.f27013n;
                ArrayList arrayList2 = pe0Var.M;
                org.telegram.ui.ActionBar.o2 o2Var = pe0Var.f27014r;
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
                        int themedColor = pe0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Sh);
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
                it0 it0Var = (it0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                zu0 zu0Var = it0Var.f25028f;
                org.telegram.ui.ActionBar.o2 o2Var2 = zu0Var.f30656v1;
                o2Var2.finishPreviewFragment();
                chat.left = false;
                it0Var.E(false);
                it0Var.u(i15);
                if (it0Var.d.isEmpty()) {
                    zu0Var.v1(true);
                    zu0Var.F();
                }
                o2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-zu0Var.f30631j1));
                o2Var2.getMessagesController().addUserToChat(chat.f18121id, o2Var2.getUserConfig().getCurrentUser(), 0, null, o2Var2, new br0(2, it0Var, chat));
                return;
            case 10:
                ((l41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 11:
                wy.b0((wy) obj2, i15, (n70) obj);
                return;
            case 12:
                gh0.b0((gh0) obj2, i15, (n70) obj);
                return;
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                k6[] k6VarArr = (k6[]) obj;
                if (i15 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zArr[0] = z10;
                for (int i20 = 0; i20 < 2; i20++) {
                    k6 k6Var = k6VarArr[i20];
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
                    k6Var.f20374c.a(z12, true);
                }
                return;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.o1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((r41) saveToGallerySettingsActivity.f31447s.get(i15)).f37078c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f31441a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 15:
                wx wxVar = (wx) obj;
                i71 i71Var = ((h61) obj2).f34192c;
                if (!wxVar.e && !UserConfig.getInstance(i71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (R != null) {
                        R.showDialog(new rg.x0(i71Var.f34451c1, i71Var.getContext(), i71Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    f61 f61Var = i71Var.f34461h0;
                    if (i21 < f61Var.getChildCount()) {
                        if ((f61Var.getChildAt(i21) instanceof m61) && (S = RecyclerView.S((view2 = f61Var.getChildAt(i21)))) >= 0 && i71Var.f34499y0.get(S) == i15) {
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
                    i71Var.i(num.intValue(), view2);
                }
                sv.W(null, wxVar.f29759b, false, null, null);
                i71Var.B0.add(Long.valueOf(wxVar.f29759b.f18148id));
                i71Var.B(true, true, true);
                return;
            case 16:
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj;
                if (!dVar.N) {
                    cf.c cVar = kj1.d;
                    if (cVar != null && ((byte[]) cVar.e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags = 4 | tL_messages_requestUrlAuth.flags;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.f21498b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new kh(dVar, g3Var, i22, view, cVar));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 17:
                SharedConfig.setSearchEngineType(i15);
                ((r8) ((View) obj2)).u(org.telegram.ui.web.o1.a().f38889a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 18:
                qg.u1 u1Var = (qg.u1) obj2;
                u1Var.a(i15);
                u1Var.f41687b.v().i(i15 - 1, true);
                u1Var.f41687b.b((pg.m) obj);
                return;
            case 19:
                or0 or0Var = (or0) obj2;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) obj;
                np npVar = or0Var.F;
                npVar.a(!npVar.f26508a.f21982q, true);
                boolean z17 = npVar.f26508a.f21982q;
                vc a02 = vc.a0(o2Var3);
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
                or0Var.d.h = Boolean.valueOf(z17);
                if (or0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(or0Var.H, true);
                    or0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(or0Var.f46130c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new bj1(4, or0Var, o2Var3));
                return;
            case 20:
                yh.n5 n5Var = (yh.n5) obj2;
                Runnable runnable = (Runnable) obj;
                n5Var.getClass();
                if ((i15 & 15) != 0) {
                    i14 = 15;
                } else if ((i15 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(n5Var.f47517g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = n5Var.f47517g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    n5Var.f47517g = i24;
                    n5Var.i(true);
                }
                runnable.run();
                return;
            default:
                nf.f.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
        }
    }

    public va(Object obj, int i10, Object obj2, int i11) {
        this.f21497a = i11;
        this.f21499c = obj;
        this.f21498b = i10;
        this.d = obj2;
    }

    public va(Object obj, Object obj2, int i10, int i11) {
        this.f21497a = i11;
        this.f21499c = obj;
        this.d = obj2;
        this.f21498b = i10;
    }
}
