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
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wx;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ae;
import org.telegram.ui.bj1;
import org.telegram.ui.bo;
import org.telegram.ui.d61;
import org.telegram.ui.eh0;
import org.telegram.ui.f61;
import org.telegram.ui.g71;
import org.telegram.ui.je;
import org.telegram.ui.k61;
import org.telegram.ui.kj1;
import org.telegram.ui.md;
import org.telegram.ui.p41;
import org.telegram.ui.rd;
import org.telegram.ui.sd;
import org.telegram.ui.uy;
import org.telegram.ui.ya1;
public final class va implements View.OnClickListener {
    public final int f21487a;
    public final int f21488b;
    public final Object f21489c;
    public final Object d;

    public va(int i10, View view, AtomicReference atomicReference) {
        this.f21487a = 17;
        this.f21488b = i10;
        this.f21489c = view;
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
        int i13 = this.f21487a;
        AndroidUtilities.VcardItem vcardItem = null;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f21488b;
        Object obj = this.d;
        Object obj2 = this.f21489c;
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
                je jeVar = (je) obj2;
                ya1 ya1Var = (ya1) obj;
                ae aeVar = jeVar.Q0;
                if (view.isEnabled() && !aeVar.N && !jeVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (jeVar.L0 > currentTime) {
                        jeVar.Z0 = vc.a0(ya1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, yh.g.j0(jeVar.L0 - currentTime)))).j();
                        return;
                    } else if (jeVar.X0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        vc.a0(ya1Var).L(jeVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new md(jeVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        rd rdVar = new rd(jeVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f31591b0 = rdVar;
                        aeVar.setLoading(true);
                        twoStepVerificationActivity.s0(new sd(jeVar, ya1Var, twoStepVerificationActivity, 2));
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
                if (boVar2.f32280d5 != null && i15 < arrayList.size()) {
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
                w51 w51Var = (w51) obj;
                if (fsVar.S()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    b2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = fsVar.f24084w0;
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
                w51Var.N(true);
                return;
            case 7:
                l40 l40Var = (l40) obj2;
                l40Var.f25827n = i15;
                l40Var.f25824b.d(view.getLeft(), false);
                l40Var.f25825c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                l40Var.invalidate();
                return;
            case 8:
                pe0 pe0Var = (pe0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = pe0Var.f27026n;
                ArrayList arrayList2 = pe0Var.M;
                org.telegram.ui.ActionBar.n2 n2Var = pe0Var.f27027r;
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
                        int themedColor = pe0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Sh);
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
                yu0 yu0Var = ht0Var.f24801f;
                org.telegram.ui.ActionBar.n2 n2Var2 = yu0Var.f30392v1;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                ht0Var.E(false);
                ht0Var.u(i15);
                if (ht0Var.d.isEmpty()) {
                    yu0Var.v1(true);
                    yu0Var.F();
                }
                n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-yu0Var.f30367j1));
                n2Var2.getMessagesController().addUserToChat(chat.f18112id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new ar0(2, ht0Var, chat));
                return;
            case 10:
                ((k41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 11:
                uy.b0((uy) obj2, i15, (n70) obj);
                return;
            case 12:
                eh0.b0((eh0) obj2, i15, (n70) obj);
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
                    k6Var.f20364c.a(z12, true);
                }
                return;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((p41) saveToGallerySettingsActivity.f31434s.get(i15)).f36434c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f31428a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 15:
                wx wxVar = (wx) obj;
                g71 g71Var = ((f61) obj2).f33496c;
                if (!wxVar.e && !UserConfig.getInstance(g71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new rg.x0(g71Var.f33786c1, g71Var.getContext(), g71Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    d61 d61Var = g71Var.f33796h0;
                    if (i21 < d61Var.getChildCount()) {
                        if ((d61Var.getChildAt(i21) instanceof k61) && (R = RecyclerView.R((view2 = d61Var.getChildAt(i21)))) >= 0 && g71Var.f33834y0.get(R) == i15) {
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
                    g71Var.i(num.intValue(), view2);
                }
                sv.W(null, wxVar.f29823b, false, null, null);
                g71Var.B0.add(Long.valueOf(wxVar.f29823b.f18139id));
                g71Var.B(true, true, true);
                return;
            case 16:
                ci.d dVar = (ci.d) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!dVar.N) {
                    cf.c cVar = kj1.d;
                    if (cVar != null && ((byte[]) cVar.e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags = 4 | tL_messages_requestUrlAuth.flags;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.f21488b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new kh(dVar, f3Var, i22, view, cVar));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 17:
                SharedConfig.setSearchEngineType(i15);
                ((r8) ((View) obj2)).u(org.telegram.ui.web.o1.a().f39046a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 18:
                qg.u1 u1Var = (qg.u1) obj2;
                u1Var.a(i15);
                u1Var.f41665b.v().i(i15 - 1, true);
                u1Var.f41665b.b((pg.m) obj);
                return;
            case 19:
                nr0 nr0Var = (nr0) obj2;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj;
                np npVar = nr0Var.F;
                npVar.a(!npVar.f26547a.f21972q, true);
                boolean z17 = npVar.f26547a.f21972q;
                vc a02 = vc.a0(n2Var3);
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
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(nr0Var.f46107c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new bj1(4, nr0Var, n2Var3));
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
                int flag = TLObject.setFlag(n5Var.f47494g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = n5Var.f47494g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    n5Var.f47494g = i24;
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
        this.f21487a = i11;
        this.f21489c = obj;
        this.f21488b = i10;
        this.d = obj2;
    }

    public va(Object obj, Object obj2, int i10, int i11) {
        this.f21487a = i11;
        this.f21489c = obj;
        this.d = obj2;
        this.f21488b = i10;
    }
}
