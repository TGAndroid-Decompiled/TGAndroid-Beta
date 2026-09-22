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
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.ut0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xx;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.ye0;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.be;
import org.telegram.ui.bj1;
import org.telegram.ui.g61;
import org.telegram.ui.gh0;
import org.telegram.ui.i61;
import org.telegram.ui.j71;
import org.telegram.ui.ke;
import org.telegram.ui.kj1;
import org.telegram.ui.n61;
import org.telegram.ui.nd;
import org.telegram.ui.s41;
import org.telegram.ui.sd;
import org.telegram.ui.td;
import org.telegram.ui.uy;
import org.telegram.ui.zn;
public final class va implements View.OnClickListener {
    public final int f21718a;
    public final int f21719b;
    public final Object f21720c;
    public final Object d;

    public va(int i10, View view, AtomicReference atomicReference) {
        this.f21718a = 17;
        this.f21719b = i10;
        this.f21720c = view;
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
        int i13 = this.f21718a;
        AndroidUtilities.VcardItem vcardItem = null;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f21719b;
        Object obj = this.d;
        Object obj2 = this.f21720c;
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
                ke keVar = (ke) obj2;
                bb1 bb1Var = (bb1) obj;
                be beVar = keVar.Q0;
                if (view.isEnabled() && !beVar.N && !keVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (keVar.L0 > currentTime) {
                        keVar.Z0 = xc.a0(bb1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, yh.g.j0(keVar.L0 - currentTime)))).j();
                        return;
                    } else if (keVar.X0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        xc.a0(bb1Var).L(keVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new nd(keVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        sd sdVar = new sd(keVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f31896b0 = sdVar;
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
                if (znVar2.f40307d5 != null && i15 < arrayList.size()) {
                    znVar2.Ba(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 5:
                ((fd0) obj2).setValue(i15);
                ((org.telegram.ui.Components.w2) obj).run();
                return;
            case 6:
                fs fsVar = (fs) obj2;
                m61 m61Var = (m61) obj;
                if (fsVar.S()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    b2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = fsVar.f24350w0;
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
                m61Var.N(true);
                return;
            case 7:
                l40 l40Var = (l40) obj2;
                l40Var.f25984n = i15;
                l40Var.f25981b.d(view.getLeft(), false);
                l40Var.f25982c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                l40Var.invalidate();
                return;
            case 8:
                af0 af0Var = (af0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = af0Var.f22647n;
                ArrayList arrayList2 = af0Var.M;
                org.telegram.ui.ActionBar.n2 n2Var = af0Var.f22648r;
                int i16 = af0Var.F;
                if (i15 >= i16 && i15 < af0Var.G) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i16);
                } else {
                    int i17 = af0Var.H;
                    if (i15 >= i17 && i15 < af0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) af0Var.L.get(i15 - i17);
                    }
                }
                if (vcardItem != null) {
                    if (af0Var.J) {
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
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new lg.j(5, af0Var, vcardItem));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i15 >= af0Var.F && i15 < af0Var.G) {
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
                        int themedColor = af0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Sh);
                        textView.setEnabled(z14);
                        if (!z14) {
                            themedColor &= Integer.MAX_VALUE;
                        }
                        textView.setTextColor(themedColor);
                    }
                    ((ye0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 9:
                ut0 ut0Var = (ut0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                lv0 lv0Var = ut0Var.f28899f;
                org.telegram.ui.ActionBar.n2 n2Var2 = lv0Var.f26234v1;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                ut0Var.E(false);
                ut0Var.u(i15);
                if (ut0Var.d.isEmpty()) {
                    lv0Var.v1(true);
                    lv0Var.F();
                }
                n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-lv0Var.f26209j1));
                n2Var2.getMessagesController().addUserToChat(chat.f18343id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new yn0(8, ut0Var, chat));
                return;
            case 10:
                ((a51) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 11:
                uy.b0((uy) obj2, i15, (y70) obj);
                return;
            case 12:
                gh0.Y((gh0) obj2, i15, (y70) obj);
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
                    m6Var.f20667c.a(z12, true);
                }
                return;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((s41) saveToGallerySettingsActivity.f31739s.get(i15)).f37317c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f31733a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 15:
                xx xxVar = (xx) obj;
                j71 j71Var = ((i61) obj2).f34487c;
                if (!xxVar.e && !UserConfig.getInstance(j71Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null) {
                        R.showDialog(new rg.x0(j71Var.f34807c1, j71Var.getContext(), j71Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    g61 g61Var = j71Var.f34817h0;
                    if (i21 < g61Var.getChildCount()) {
                        if ((g61Var.getChildAt(i21) instanceof n61) && (S = RecyclerView.S((view2 = g61Var.getChildAt(i21)))) >= 0 && j71Var.f34855y0.get(S) == i15) {
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
                    j71Var.i(num.intValue(), view2);
                }
                tv.W(null, xxVar.f30422b, false, null, null);
                j71Var.B0.add(Long.valueOf(xxVar.f30422b.f18370id));
                j71Var.B(true, true, true);
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
                        int i22 = this.f21719b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new kh(dVar, f3Var, i22, view, cVar));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 17:
                SharedConfig.setSearchEngineType(i15);
                ((s8) ((View) obj2)).u(org.telegram.ui.web.p1.a().f39038a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 18:
                qg.s1 s1Var = (qg.s1) obj2;
                s1Var.a(i15);
                s1Var.f41954b.v().i(i15 - 1, true);
                s1Var.f41954b.b((pg.m) obj);
                return;
            case 19:
                bs0 bs0Var = (bs0) obj2;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj;
                np npVar = bs0Var.F;
                npVar.a(!npVar.f26861a.f22209q, true);
                boolean z17 = npVar.f26861a.f22209q;
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
                bs0Var.d.h = Boolean.valueOf(z17);
                if (bs0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(bs0Var.H, true);
                    bs0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(bs0Var.f46439c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new bj1(4, bs0Var, n2Var3));
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
                int flag = TLObject.setFlag(l5Var.f47707g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = l5Var.f47707g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    l5Var.f47707g = i24;
                    l5Var.i(true);
                }
                runnable.run();
                return;
            default:
                nf.f.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
        }
    }

    public va(Object obj, int i10, Object obj2, int i11) {
        this.f21718a = i11;
        this.f21720c = obj;
        this.f21719b = i10;
        this.d = obj2;
    }

    public va(Object obj, Object obj2, int i10, int i11) {
        this.f21718a = i11;
        this.f21720c = obj;
        this.d = obj2;
        this.f21719b = i10;
    }
}
