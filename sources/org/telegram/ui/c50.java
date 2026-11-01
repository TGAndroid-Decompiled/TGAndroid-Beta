package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public abstract class c50 {
    public static void a(org.telegram.ui.ActionBar.x1 x1Var, gf.e eVar, TLObject tLObject, final int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        org.telegram.ui.ActionBar.k2 T;
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        LaunchActivity launchActivity;
        if (x1Var != null) {
            x1Var.dismiss();
        }
        if (eVar != null) {
            eVar.b();
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            org.telegram.messenger.wp.r1(i10).V3(groupcall.users, false);
            org.telegram.messenger.wp.r1(i10).P3(groupcall.chats, false);
            if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null && (groupCall = conferenceCall.groupCall) != null && groupcall.call.f19804id == groupCall.f19804id && (launchActivity = LaunchActivity.I1) != null) {
                a50.e1(launchActivity, org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
            ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
            th.b bVar = new th.b();
            org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, context, (org.telegram.ui.ActionBar.p6) bVar, false);
            z2Var.O();
            LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
            f7.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(8.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.i0.L(80.0f);
            int i11 = org.telegram.ui.ActionBar.t6.Ci;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i11, bVar));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
            frameLayout.setBackground(L2);
            org.telegram.ui.ActionBar.a7.k(frameLayout, L2, N, null, bVar);
            frameLayout.addView(org.telegram.messenger.a30.e(context, 2131231091), w7.b6.e(56, 56, 17));
            f7.addView(frameLayout, w7.b6.t(80, 80, 1, 2, 21, 2, 13));
            int i12 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.Components.p80 a2 = w7.g6.a(context, 20.0f, i12, true, bVar);
            a2.setText(org.telegram.messenger.dd.L0(2131749471, null));
            a2.setGravity(17);
            f7.addView(a2, w7.b6.t(-1, -2, 1, 2, 0, 2, 4));
            List list = (List) Collection.EL.stream(arrayList).map(new k2.f(11)).filter(new Predicate() {
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
                    Long l4 = (Long) obj;
                    if (l4.longValue() != org.telegram.messenger.e20.i(i10).e() && l4.longValue() != 0) {
                        return true;
                    }
                    return false;
                }
            }).collect(Collectors.toList());
            boolean isEmpty = list.isEmpty();
            org.telegram.ui.Components.p80 a10 = w7.g6.a(context, 14.0f, i12, false, bVar);
            a10.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131749477, null)));
            a10.setGravity(17);
            a10.setMaxWidth(vh.p2.a(a10.getText(), a10.getPaint()));
            f7.addView(a10, w7.b6.t(-1, -2, 1, 2, 0, 2, 23));
            if (!isEmpty) {
                View view = new View(context);
                view.setBackgroundColor(-14012362);
                f7.addView(view, w7.b6.n(0.66f, -1, 7, 0, 0, 0, 0));
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false);
                u8Var.setCentered(true);
                u8Var.setSize(org.telegram.messenger.i0.L(38.0f));
                int min = Math.min(3, list.size());
                u8Var.setCount(min);
                for (int i13 = 0; i13 < min; i13++) {
                    u8Var.b(i13, i10, org.telegram.messenger.wp.r1(i10).Z1((Long) list.get(i13)));
                }
                u8Var.a(false);
                f7.addView(u8Var, w7.b6.k(2.0f, 11.0f, 5.0f, 0.0f, -1, 58));
                org.telegram.ui.Components.p80 a11 = w7.g6.a(context, 14.0f, org.telegram.ui.ActionBar.t6.G6, false, bVar);
                a11.setGravity(17);
                if (list.size() == 1) {
                    a11.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131749473, org.telegram.messenger.o5.s(i10, ((Long) list.get(0)).longValue()))));
                } else if (list.size() == 2) {
                    a11.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131749472, org.telegram.messenger.o5.s(i10, ((Long) list.get(0)).longValue()), org.telegram.messenger.o5.s(i10, ((Long) list.get(1)).longValue()))));
                } else {
                    a11.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.K("GroupCallLinkText2Many", arrayList.size() - 2, ',', org.telegram.messenger.o5.s(i10, ((Long) list.get(0)).longValue()), org.telegram.messenger.o5.s(i10, ((Long) list.get(1)).longValue()))));
                }
                a11.setMaxWidth(vh.p2.a(a11.getText(), a11.getPaint()));
                f7.addView(a11, w7.b6.t(-1, -2, 1, 2, 0, 2, 25));
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i14 = org.telegram.ui.ActionBar.t6.f21021i6;
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i14, bVar), 20, 20);
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i14);
            linearLayout.setBackground(a02);
            org.telegram.ui.ActionBar.a7.k(linearLayout, a02, null, N2, bVar);
            org.telegram.ui.Components.ep epVar = new org.telegram.ui.Components.ep(24, context, bVar);
            epVar.b(org.telegram.ui.ActionBar.t6.f21004h7, org.telegram.ui.ActionBar.t6.f21040j7, org.telegram.ui.ActionBar.t6.f21060k7);
            epVar.setDrawUnchecked(true);
            epVar.a(org.telegram.messenger.wp.d1().getBoolean("callmiconstart", true), false);
            epVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(epVar, w7.b6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, bVar);
            sc.e.u(textView, 1, 14.0f, null, 2131749478);
            linearLayout.addView(textView, w7.b6.t(-2, -2, 16, 9, 0, 0, 0));
            f7.addView(linearLayout, w7.b6.t(-2, 38, 1, 0, 4, 0, 12));
            w7.e6.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new a(epVar, 29));
            vh.d dVar = new vh.d(context, bVar, true);
            dVar.setRoundRadius(24);
            dVar.i(org.telegram.messenger.dd.L0(2131749479, null), false, true);
            f7.addView(dVar, w7.b6.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 48));
            z2Var.N = f7;
            dVar.setOnClickListener(new org.telegram.ui.Components.co(z2Var, context, epVar, i10, tL_inputGroupCallSlug, 1));
            z2Var.O();
            z2Var.show();
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
            if (T2 != null) {
                org.telegram.messenger.m5.n(null, 2131748911, org.telegram.ui.Components.cc.a0(T2), 2131624011, 36);
            }
        } else if (tL_error != null && (T = LaunchActivity.T()) != null) {
            org.telegram.ui.Components.cc.a0(T).f0(tL_error, false);
        }
    }

    public static void b(Activity activity, int i10, String str, gf.e eVar) {
        org.telegram.ui.ActionBar.x1 x1Var;
        ConferenceCall conferenceCall;
        LaunchActivity launchActivity;
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null) {
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            if ((inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) && TextUtils.equals(inputGroupCall.slug, tL_inputGroupCallSlug.slug) && (launchActivity = LaunchActivity.I1) != null) {
                a50.e1(launchActivity, org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
        }
        if (eVar == null) {
            org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, activity, null);
            x1Var2.r(300L);
            x1Var = x1Var2;
        } else {
            x1Var = null;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallSlug;
        getgroupcall.limit = 10;
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(getgroupcall, new q8(x1Var, eVar, i10, activity, tL_inputGroupCallSlug));
        if (eVar != null) {
            eVar.f7486b = new org.telegram.messenger.ud(i10, sendRequest, 4);
            eVar.d();
        }
    }
}
