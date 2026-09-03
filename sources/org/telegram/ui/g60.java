package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public abstract class g60 {
    public static void a(org.telegram.ui.ActionBar.d2 d2Var, af.f fVar, TLObject tLObject, final int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        org.telegram.ui.ActionBar.p2 U;
        float f10;
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        LaunchActivity launchActivity;
        if (d2Var != null) {
            d2Var.dismiss();
        }
        if (fVar != null) {
            fVar.b();
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i10).putUsers(groupcall.users, false);
            MessagesController.getInstance(i10).putChats(groupcall.chats, false);
            if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null && (groupCall = conferenceCall.groupCall) != null && groupcall.call.f20855id == groupCall.f20855id && (launchActivity = LaunchActivity.D1) != null) {
                d60.c1(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
            ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
            oh.b bVar = new oh.b();
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context, bVar, false, false);
            h3Var.fixNavigationBar();
            LinearLayout f11 = org.telegram.messenger.y3.f(context, 1);
            f11.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), bVar.B0(org.telegram.ui.ActionBar.k6.Oh)));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.filled_calls_users);
            frameLayout.addView(imageView, k7.c6.e(56, 56, 17));
            f11.addView(frameLayout, k7.c6.t(80, 80, 1, 2, 21, 2, 13));
            int i11 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.Components.g90 a2 = k7.g6.a(context, 20.0f, i11, true, bVar);
            a2.setText(LocaleController.getString(R.string.GroupCallLinkTitle));
            a2.setGravity(17);
            f11.addView(a2, k7.c6.t(-1, -2, 1, 2, 0, 2, 4));
            List list = (List) Collection.EL.stream(arrayList).map(new n8(5)).filter(new Predicate() {
                public Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override
                public final boolean test(Object obj) {
                    Long l10 = (Long) obj;
                    if (l10.longValue() != UserConfig.getInstance(i10).getClientUserId() && l10.longValue() != 0) {
                        return true;
                    }
                    return false;
                }
            }).collect(Collectors.toList());
            boolean isEmpty = list.isEmpty();
            org.telegram.ui.Components.g90 a10 = k7.g6.a(context, 14.0f, i11, false, bVar);
            a10.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallLinkText)));
            a10.setGravity(17);
            a10.setMaxWidth(qh.e3.a(a10.getText(), a10.getPaint()));
            f11.addView(a10, k7.c6.t(-1, -2, 1, 2, 0, 2, 23));
            if (!isEmpty) {
                View view = new View(context);
                view.setBackgroundColor(-14012362);
                f11.addView(view, k7.c6.s(-1, 7, 0, 0, 0, 0.66f, 0));
                org.telegram.ui.Components.d9 d9Var = new org.telegram.ui.Components.d9(context, false);
                d9Var.setCentered(true);
                d9Var.setSize(AndroidUtilities.dp(38.0f));
                int min = Math.min(3, list.size());
                d9Var.setCount(min);
                for (int i12 = 0; i12 < min; i12++) {
                    d9Var.b(i12, MessagesController.getInstance(i10).getUser((Long) list.get(i12)), i10);
                }
                f10 = 8.0f;
                d9Var.a(false);
                f11.addView(d9Var, k7.c6.k(2.0f, 11.0f, 5.0f, 0.0f, -1, 58));
                org.telegram.ui.Components.g90 a11 = k7.g6.a(context, 14.0f, org.telegram.ui.ActionBar.k6.G6, false, bVar);
                a11.setGravity(17);
                if (list.size() == 1) {
                    a11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2One, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()))));
                } else if (list.size() == 2) {
                    a11.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2Two, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i10, ((Long) list.get(1)).longValue()))));
                } else {
                    a11.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GroupCallLinkText2Many", arrayList.size() - 2, DialogObject.getShortName(i10, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i10, ((Long) list.get(1)).longValue()))));
                }
                a11.setMaxWidth(qh.e3.a(a11.getText(), a11.getPaint()));
                f11.addView(a11, k7.c6.t(-1, -2, 1, 2, 0, 2, 25));
            } else {
                f10 = 8.0f;
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f10));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(org.telegram.ui.ActionBar.k6.Y(bVar.B0(org.telegram.ui.ActionBar.k6.f21752i6), 20, 20));
            org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(context, 24, bVar);
            npVar.b(org.telegram.ui.ActionBar.k6.f21735h7, org.telegram.ui.ActionBar.k6.f21770j7, org.telegram.ui.ActionBar.k6.f21788k7);
            npVar.setDrawUnchecked(true);
            npVar.a(MessagesController.getGlobalMainSettings().getBoolean("callmiconstart", true), false);
            npVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(npVar, k7.c6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(bVar.B0(org.telegram.ui.ActionBar.k6.f21768j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.GroupCallLinkMicrophone));
            linearLayout.addView(textView, k7.c6.t(-2, -2, 16, 9, 0, 0, 0));
            f11.addView(linearLayout, k7.c6.t(-2, 38, 1, 0, 4, 0, 12));
            k7.e6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new f60(npVar, 0));
            qh.d dVar = new qh.d(context, bVar, true);
            dVar.setRoundRadius(24);
            dVar.g(LocaleController.getString(R.string.GroupCallLinkJoin), false, true);
            f11.addView(dVar, k7.c6.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 48));
            h3Var.customView = f11;
            dVar.setOnClickListener(new org.telegram.ui.Components.ko(h3Var, context, npVar, i10, tL_inputGroupCallSlug, 1));
            h3Var.fixNavigationBar();
            h3Var.show();
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
            if (U2 != null) {
                l.d.v(R.string.LinkIsNoActive, org.telegram.ui.Components.qc.a0(U2), R.raw.error, 36);
            }
        } else if (tL_error != null && (U = LaunchActivity.U()) != null) {
            org.telegram.ui.Components.qc.a0(U).d0(tL_error, false);
        }
    }

    public static void b(Activity activity, int i10, String str, af.f fVar) {
        org.telegram.ui.ActionBar.d2 d2Var;
        ConferenceCall conferenceCall;
        LaunchActivity launchActivity;
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null) {
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            if ((inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) && TextUtils.equals(inputGroupCall.slug, tL_inputGroupCallSlug.slug) && (launchActivity = LaunchActivity.D1) != null) {
                d60.c1(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
        }
        if (fVar == null) {
            org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(activity, 3, null);
            d2Var2.q(300L);
            d2Var = d2Var2;
        } else {
            d2Var = null;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallSlug;
        getgroupcall.limit = 10;
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(getgroupcall, new lf.i0(d2Var, fVar, i10, activity, tL_inputGroupCallSlug, 10));
        if (fVar != null) {
            fVar.f180b = new org.telegram.messenger.nh(i10, sendRequest, 3);
            fVar.d();
        }
    }
}
