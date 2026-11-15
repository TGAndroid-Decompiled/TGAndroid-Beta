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
public abstract class e40 {
    public static void a(org.telegram.ui.ActionBar.t1 t1Var, vf.b bVar, TLObject tLObject, final int i7, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        org.telegram.ui.ActionBar.e2 T;
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        LaunchActivity launchActivity;
        if (t1Var != null) {
            t1Var.dismiss();
        }
        if (bVar != null) {
            bVar.b();
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            org.telegram.messenger.np.s1(i7).Y3(groupcall.users, false);
            org.telegram.messenger.np.s1(i7).S3(groupcall.chats, false);
            if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null && (groupCall = conferenceCall.groupCall) != null && groupcall.call.f28061id == groupCall.f28061id && (launchActivity = LaunchActivity.H1) != null) {
                c40.e1(launchActivity, org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
            ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
            fi.b bVar2 = new fi.b();
            org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, context, (org.telegram.ui.ActionBar.e6) bVar2, false);
            u2Var.O();
            LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
            f10.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(8.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            int L = org.telegram.messenger.g0.L(80.0f);
            int i10 = org.telegram.ui.ActionBar.j6.Fi;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i10, bVar2));
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
            frameLayout.setBackground(L2);
            org.telegram.ui.ActionBar.q6.j(frameLayout, L2, M, null, bVar2);
            frameLayout.addView(org.telegram.messenger.i20.e(context, 2131231091), c8.ja.e(56, 56, 17));
            f10.addView(frameLayout, c8.ja.t(80, 80, 1, 2, 21, 2, 13));
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.Components.z70 a10 = c8.sa.a(context, 20.0f, i11, true, bVar2);
            a10.setText(org.telegram.messenger.hd.M0(2131749462, null));
            a10.setGravity(17);
            f10.addView(a10, c8.ja.t(-1, -2, 1, 2, 0, 2, 4));
            List list = (List) Collection.EL.stream(arrayList).map(new aa.l(13)).filter(new Predicate() {
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
                    if (l10.longValue() != org.telegram.messenger.m10.i(i7).e() && l10.longValue() != 0) {
                        return true;
                    }
                    return false;
                }
            }).collect(Collectors.toList());
            boolean isEmpty = list.isEmpty();
            org.telegram.ui.Components.z70 a11 = c8.sa.a(context, 14.0f, i11, false, bVar2);
            a11.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749468, null)));
            a11.setGravity(17);
            a11.setMaxWidth(hi.l3.a(a11.getText(), a11.getPaint()));
            f10.addView(a11, c8.ja.t(-1, -2, 1, 2, 0, 2, 23));
            if (!isEmpty) {
                View view = new View(context);
                view.setBackgroundColor(-14012362);
                f10.addView(view, c8.ja.n(0.66f, -1, 7, 0, 0, 0, 0));
                org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(context, false);
                w8Var.setCentered(true);
                w8Var.setSize(org.telegram.messenger.g0.L(38.0f));
                int min = Math.min(3, list.size());
                w8Var.setCount(min);
                for (int i12 = 0; i12 < min; i12++) {
                    w8Var.b(i12, i7, org.telegram.messenger.np.s1(i7).a2((Long) list.get(i12)));
                }
                w8Var.a(false);
                f10.addView(w8Var, c8.ja.k(2.0f, 11.0f, 5.0f, 0.0f, -1, 58));
                org.telegram.ui.Components.z70 a12 = c8.sa.a(context, 14.0f, org.telegram.ui.ActionBar.j6.G6, false, bVar2);
                a12.setGravity(17);
                if (list.size() == 1) {
                    a12.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131749464, org.telegram.messenger.m5.s(i7, ((Long) list.get(0)).longValue()))));
                } else if (list.size() == 2) {
                    a12.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131749463, org.telegram.messenger.m5.s(i7, ((Long) list.get(0)).longValue()), org.telegram.messenger.m5.s(i7, ((Long) list.get(1)).longValue()))));
                } else {
                    a12.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.K("GroupCallLinkText2Many", arrayList.size() - 2, ',', org.telegram.messenger.m5.s(i7, ((Long) list.get(0)).longValue()), org.telegram.messenger.m5.s(i7, ((Long) list.get(1)).longValue()))));
                }
                a12.setMaxWidth(hi.l3.a(a12.getText(), a12.getPaint()));
                f10.addView(a12, c8.ja.t(-1, -2, 1, 2, 0, 2, 25));
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i13 = org.telegram.ui.ActionBar.j6.f28941i6;
            org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i13, bVar2), 20, 20);
            org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i13);
            linearLayout.setBackground(a02);
            org.telegram.ui.ActionBar.q6.j(linearLayout, a02, null, M2, bVar2);
            org.telegram.ui.Components.fp fpVar = new org.telegram.ui.Components.fp(24, context, bVar2);
            fpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.f28959j7, org.telegram.ui.ActionBar.j6.f28979k7);
            fpVar.setDrawUnchecked(true);
            fpVar.a(org.telegram.messenger.np.e1().getBoolean("callmiconstart", true), false);
            fpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(fpVar, c8.ja.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, bVar2);
            i5.c.w(textView, 1, 14.0f, null, 2131749469);
            linearLayout.addView(textView, c8.ja.t(-2, -2, 16, 9, 0, 0, 0));
            f10.addView(linearLayout, c8.ja.t(-2, 38, 1, 0, 4, 0, 12));
            c8.na.b(linearLayout, 0.025f, 1.5f);
            linearLayout.setOnClickListener(new a(fpVar, 29));
            hi.d dVar = new hi.d(context, bVar2, true);
            dVar.setRoundRadius(24);
            dVar.i(org.telegram.messenger.hd.M0(2131749470, null), false, true);
            f10.addView(dVar, c8.ja.k(2.0f, 0.0f, 2.0f, 0.0f, -1, 48));
            u2Var.O = f10;
            dVar.setOnClickListener(new org.telegram.ui.Components.eo(u2Var, context, fpVar, i7, tL_inputGroupCallSlug, 1));
            u2Var.O();
            u2Var.show();
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
            if (T2 != null) {
                org.telegram.messenger.k5.n(null, 2131748901, org.telegram.ui.Components.cc.a0(T2), 2131624012, 36);
            }
        } else if (tL_error != null && (T = LaunchActivity.T()) != null) {
            org.telegram.ui.Components.cc.a0(T).f0(tL_error, false);
        }
    }

    public static void b(Activity activity, int i7, String str, vf.b bVar) {
        org.telegram.ui.ActionBar.t1 t1Var;
        ConferenceCall conferenceCall;
        LaunchActivity launchActivity;
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null) {
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            if ((inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) && TextUtils.equals(inputGroupCall.slug, tL_inputGroupCallSlug.slug) && (launchActivity = LaunchActivity.H1) != null) {
                c40.e1(launchActivity, org.telegram.messenger.c.a(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            }
        }
        if (bVar == null) {
            org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, activity, null);
            t1Var2.r(300L);
            t1Var = t1Var2;
        } else {
            t1Var = null;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallSlug;
        getgroupcall.limit = 10;
        int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(getgroupcall, new bg.k0(t1Var, bVar, i7, activity, tL_inputGroupCallSlug, 10));
        if (bVar != null) {
            bVar.f58805b = new org.telegram.messenger.f9(i7, sendRequest, 6);
            bVar.d();
        }
    }
}
