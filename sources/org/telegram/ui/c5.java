package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class c5 implements Utilities.Callback2 {
    public final int f35306a;
    public final Object f35307b;

    public c5(Object obj, int i10) {
        this.f35306a = i10;
        this.f35307b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        fa1 fa1Var;
        CharSequence charSequence;
        ArrayList arrayList;
        String str;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ft ftVar;
        float f7;
        String str2;
        int i12;
        int i13;
        boolean z10;
        int i14;
        long j3;
        TL_stories.StoryItem storyItem;
        float f10;
        float f11 = 0.25f;
        boolean z11 = true;
        int i15 = 0;
        switch (this.f35306a) {
            case 0:
                d5 d5Var = (d5) this.f35307b;
                d5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                d5Var.f35657w = false;
                fh.b bVar = d5Var.h;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, d5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                m9 m9Var = (m9) this.f35307b;
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.Components.w61 w61Var = (org.telegram.ui.Components.w61) obj2;
                boolean isEmpty = m9Var.J.isEmpty();
                ArrayList arrayList3 = m9Var.F;
                boolean isEmpty2 = arrayList3.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.h61 c10 = org.telegram.ui.Components.h61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f27098q = true;
                    arrayList2.add(c10);
                    if (!m9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.h61 c11 = org.telegram.ui.Components.h61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f27098q = true;
                        arrayList2.add(c11);
                    }
                    arrayList2.add(org.telegram.ui.Components.h61.C(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList4 = m9Var.J;
                    int size = arrayList4.size();
                    int i16 = 0;
                    while (i16 < size) {
                        Object obj3 = arrayList4.get(i16);
                        i16++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = m9Var.getMessagesController().getChat(l4)) != null) {
                            p8 p8Var = new p8(m9Var, 0);
                            int i17 = k9.f37920a;
                            org.telegram.ui.Components.h61 K = org.telegram.ui.Components.h61.K(k9.class);
                            K.G = chat;
                            K.D = p8Var;
                            arrayList2.add(K);
                        }
                    }
                    arrayList2.add(org.telegram.ui.Components.h61.C(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList3.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList3.get(i15);
                        i15++;
                        i9 i9Var = (i9) obj4;
                        ai.f2 f2Var = new ai.f2(27, m9Var, i9Var);
                        int i18 = g9.f36549a;
                        org.telegram.ui.Components.h61 K2 = org.telegram.ui.Components.h61.K(g9.class);
                        K2.G = i9Var;
                        K2.D = f2Var;
                        K2.L(m9Var.f0(i9Var.f37323c));
                        arrayList2.add(K2);
                    }
                    if (!m9Var.I) {
                        arrayList2.add(org.telegram.ui.Components.h61.q(-1, 8));
                        arrayList2.add(org.telegram.ui.Components.h61.q(-2, 8));
                        arrayList2.add(org.telegram.ui.Components.h61.q(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                me meVar = (me) this.f35307b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.w61 w61Var2 = (org.telegram.ui.Components.w61) obj2;
                meVar.R0 = -1;
                TLRPC.Chat chat2 = MessagesController.getInstance(meVar.f38594o0).getChat(Long.valueOf(-meVar.f38596p0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(meVar.f38594o0).getChatFull(-meVar.f38596p0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (meVar.f38581b1) {
                    arrayList5.add(org.telegram.ui.Components.h61.g(meVar.f38602s0));
                    fa1 fa1Var2 = meVar.l1;
                    if (fa1Var2 != null && !fa1Var2.f36253l) {
                        arrayList5.add(org.telegram.ui.Components.h61.h(5, i10, fa1Var2));
                        charSequence = null;
                        arrayList5.add(org.telegram.ui.Components.h61.B(-1, null));
                    } else {
                        charSequence = null;
                    }
                    fa1 fa1Var3 = meVar.f38591m1;
                    if (fa1Var3 != null && !fa1Var3.f36253l) {
                        arrayList5.add(org.telegram.ui.Components.h61.h(2, i10, fa1Var3));
                        arrayList5.add(org.telegram.ui.Components.h61.B(-2, charSequence));
                    }
                }
                if (meVar.f38582c1 && (fa1Var = meVar.f38593n1) != null && !fa1Var.f36253l) {
                    arrayList5.add(org.telegram.ui.Components.h61.h(2, i10, fa1Var));
                    arrayList5.add(org.telegram.ui.Components.h61.B(-3, null));
                }
                if (meVar.f38595o1) {
                    arrayList5.add(org.telegram.ui.Components.h61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList5.add(org.telegram.ui.Components.h61.v(meVar.f38597p1));
                    arrayList5.add(org.telegram.ui.Components.h61.v(meVar.f38599q1));
                    arrayList5.add(org.telegram.ui.Components.h61.v(meVar.f38601r1));
                    arrayList5.add(org.telegram.ui.Components.h61.B(-4, meVar.f38605u0));
                }
                if (chat2 != null && chat2.creator) {
                    if (meVar.f38581b1) {
                        arrayList5.add(org.telegram.ui.Components.h61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList5.add(org.telegram.ui.Components.h61.k(meVar.f38607w0));
                        arrayList5.add(org.telegram.ui.Components.h61.B(-5, meVar.f38604t0));
                        int i19 = MessagesController.getInstance(meVar.f38594o0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (meVar.f38600r0 < i19) {
                            i11 = i19;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(0, new fp0(i11, context, null, false));
                            rqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(rqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.h61 i20 = org.telegram.ui.Components.h61.i(1, string);
                        i20.L((meVar.f38600r0 < i19 || !meVar.f38589j1) ? false : false);
                        arrayList5.add(i20);
                        arrayList5.add(org.telegram.ui.Components.h61.B(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (meVar.f38582c1) {
                        arrayList5.add(org.telegram.ui.Components.h61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList5.add(org.telegram.ui.Components.h61.j(3, meVar.C0));
                        arrayList5.add(org.telegram.ui.Components.h61.B(-6, meVar.f38606v0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(meVar.f38594o0).getChat(Long.valueOf(-meVar.f38596p0))) && MessagesController.getInstance(meVar.f38594o0).starrefConnectAllowed) {
                    arrayList5.add(ei.i.a(4, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.uj, meVar.f38592n0), R.drawable.filled_earn_stars, to.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList5.add(org.telegram.ui.Components.h61.B(-7, null));
                }
                if (meVar.f38580a1.a()) {
                    meVar.R0 = arrayList5.size();
                    arrayList5.add(org.telegram.ui.Components.h61.n(meVar.T0, -2));
                    return;
                }
                arrayList5.add(org.telegram.ui.Components.h61.B(-10, null));
                return;
            case 3:
                ge geVar = (ge) this.f35307b;
                ArrayList arrayList6 = (ArrayList) obj;
                org.telegram.ui.Components.w61 w61Var3 = (org.telegram.ui.Components.w61) obj2;
                ie ieVar = geVar.f36641f;
                int i21 = geVar.d;
                int i22 = ie.f37387x;
                if (i21 == 0) {
                    arrayList = ieVar.f37394r;
                } else {
                    arrayList = ieVar.f37393n;
                }
                int size3 = arrayList.size();
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    int i23 = yh.s7.f51981a;
                    org.telegram.ui.Components.h61 K3 = org.telegram.ui.Components.h61.K(yh.s7.class);
                    K3.G = (TL_stars.StarsTransaction) obj5;
                    K3.f27098q = true;
                    arrayList6.add(K3);
                }
                if (i21 == 0) {
                    str = ieVar.f37395s;
                } else {
                    str = ieVar.h;
                }
                if (!TextUtils.isEmpty(str)) {
                    arrayList6.add(org.telegram.ui.Components.h61.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.h61.q(arrayList6.size(), 7));
                    arrayList6.add(org.telegram.ui.Components.h61.q(arrayList6.size(), 7));
                    return;
                }
                return;
            case 4:
                to toVar = (to) this.f35307b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    toVar.getClass();
                    org.telegram.ui.Components.yc.a0(toVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(toVar.f40959k0);
                AndroidUtilities.removeFromParent(toVar.f40956h0);
                AndroidUtilities.removeFromParent(toVar.f40958j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new nq((rr) this.f35307b, 1), 1000L);
                return;
            case 6:
                ((of.b) this.f35307b).J(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                qs qsVar = (qs) this.f35307b;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.w61 w61Var4 = (org.telegram.ui.Components.w61) obj2;
                TLRPC.User user = qsVar.getMessagesController().getUser(Long.valueOf(qsVar.H));
                arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.V));
                arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.f39870b));
                arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.f39871c));
                if (TextUtils.isEmpty(qsVar.c0())) {
                    arrayList7.add(org.telegram.ui.Components.h61.C(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (qsVar.K) {
                    arrayList7.add(org.telegram.ui.Components.h61.C(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList7.add(org.telegram.ui.Components.h61.C(null));
                }
                if (qsVar.I && qsVar.K) {
                    org.telegram.ui.Components.h61 i24 = org.telegram.ui.Components.h61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i24.L(qsVar.X);
                    arrayList7.add(i24);
                    arrayList7.add(org.telegram.ui.Components.h61.C(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.d));
                hg.c.n(R.string.AddNotesInfo, arrayList7);
                if (!qsVar.I) {
                    TLRPC.UserFull userFull = qsVar.getMessagesController().getUserFull(qsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.F));
                    }
                    arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.f39878x));
                    arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.f39879y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList7.add(org.telegram.ui.Components.h61.k(qsVar.E));
                    }
                    charSequence2 = null;
                    arrayList7.add(org.telegram.ui.Components.h61.C(null));
                    org.telegram.ui.Components.h61 e7 = org.telegram.ui.Components.h61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e7.f27099r = true;
                    arrayList7.add(e7);
                } else {
                    charSequence2 = null;
                }
                arrayList7.add(org.telegram.ui.Components.h61.C(charSequence2));
                if (qsVar.Y) {
                    AndroidUtilities.runOnUIThread(new hs(qsVar, user, 0));
                    qsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new is(qsVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                rt.a((rt) this.f35307b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                nt ntVar = (nt) this.f35307b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                rt rtVar = ntVar.f39031a;
                pt ptVar = rtVar.f40252l;
                if (ptVar != null) {
                    String join = TextUtils.join("", rtVar.f40255o);
                    if (callback != null) {
                        ftVar = new ft(1, ntVar, callback);
                    } else {
                        ftVar = null;
                    }
                    ptVar.f(charSequence3, join, ftVar);
                    if (callback == null) {
                        rtVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.w61 w61Var5 = (org.telegram.ui.Components.w61) obj2;
                du.P((du) this.f35307b, (ArrayList) obj);
                return;
            case 11:
                uy uyVar = (uy) this.f35307b;
                Long l10 = (Long) obj2;
                uyVar.P1 = (Long) obj;
                uyVar.d5();
                return;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f35307b).run();
                return;
            case 13:
                final mz mzVar = (mz) this.f35307b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.w61 w61Var6 = (org.telegram.ui.Components.w61) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i25 = R.raw.topics_top;
                org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(2);
                h61Var.f27093l = string2;
                h61Var.f27092k = i25;
                arrayList8.add(h61Var);
                org.telegram.ui.Components.h61 i26 = org.telegram.ui.Components.h61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i26.L(mzVar.f38774c);
                arrayList8.add(i26);
                if (mzVar.f38774c) {
                    arrayList8.add(org.telegram.ui.Components.h61.C(null));
                    arrayList8.add(org.telegram.ui.Components.h61.u(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    mz mzVar2 = mzVar;
                                    mzVar2.d = true;
                                    ((lz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = mzVar2.f38776f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(mzVar2.f38774c), Boolean.valueOf(mzVar2.d));
                                    }
                                    mzVar2.S();
                                    return;
                                default:
                                    mz mzVar3 = mzVar;
                                    mzVar3.d = false;
                                    ((lz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = mzVar3.f38776f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(mzVar3.f38774c), Boolean.valueOf(mzVar3.d));
                                    }
                                    mzVar3.S();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    mz mzVar2 = mzVar;
                                    mzVar2.d = true;
                                    ((lz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = mzVar2.f38776f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(mzVar2.f38774c), Boolean.valueOf(mzVar2.d));
                                    }
                                    mzVar2.S();
                                    return;
                                default:
                                    mz mzVar3 = mzVar;
                                    mzVar3.d = false;
                                    ((lz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = mzVar3.f38776f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(mzVar3.f38774c), Boolean.valueOf(mzVar3.d));
                                    }
                                    mzVar3.S();
                                    return;
                            }
                        }
                    };
                    int i27 = kz.f38201a;
                    org.telegram.ui.Components.h61 K4 = org.telegram.ui.Components.h61.K(kz.class);
                    K4.d = 2;
                    K4.G = onClickListener;
                    K4.H = onClickListener2;
                    K4.L(mzVar.d);
                    arrayList8.add(K4);
                    hg.c.n(R.string.TopicsLayoutInfo, arrayList8);
                    return;
                }
                return;
            case 14:
                dc0 dc0Var = (dc0) this.f35307b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                dc0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(dc0Var.f35778b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.q.p(R.string.AIEditorStyleNotFound, dc0.b(), R.raw.error, 36);
                        return;
                    } else {
                        dc0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                gw0 gw0Var = (gw0) this.f35307b;
                fh.b bVar2 = gw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                gw0Var.f36785s = (Bitmap) obj;
                Paint paint = new Paint(1);
                gw0Var.f36786w = paint;
                Bitmap bitmap2 = gw0Var.f36785s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                gw0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f11);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f7 = -0.02f;
                } else {
                    f7 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                gw0Var.f36786w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                gw0Var.f36787x = new Matrix();
                bVar2.a(bitmap);
                gh.d.c(bVar2, gw0Var.f36775c);
                gw0Var.G.d();
                return;
            case 16:
                nw0 nw0Var = (nw0) this.f35307b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.w61 w61Var7 = (org.telegram.ui.Components.w61) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i28 = R.raw.bubble;
                org.telegram.ui.Components.h61 h61Var2 = new org.telegram.ui.Components.h61(2);
                h61Var2.f27093l = string3;
                h61Var2.f27092k = i28;
                arrayList9.add(h61Var2);
                org.telegram.ui.Components.h61 i29 = org.telegram.ui.Components.h61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i29.L(nw0Var.f39060r);
                arrayList9.add(i29);
                arrayList9.add(org.telegram.ui.Components.h61.B(2, null));
                if (nw0Var.f39060r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList9);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) nw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    org.telegram.ui.Components.voip.e1 e1Var = new org.telegram.ui.Components.voip.e1(20);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f23780c = a2;
                    y7Var.d = 20;
                    y7Var.f23781e = e1Var;
                    nw0Var.f39055b.d((int) Utilities.clamp(nw0Var.f39061s, 10000L, 0L), y7Var, new t3(nw0Var, 18));
                    arrayList9.add(org.telegram.ui.Components.h61.j(3, nw0Var.f39055b));
                    if (nw0Var.f39061s > 0) {
                        str2 = nw0Var.U();
                    } else {
                        str2 = null;
                    }
                    arrayList9.add(org.telegram.ui.Components.h61.B(4, str2));
                    TLRPC.Chat chat3 = nw0Var.getMessagesController().getChat(Long.valueOf(nw0Var.f39054a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        nw0Var.f39056c.setLink(nw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList9);
                        arrayList9.add(org.telegram.ui.Components.h61.j(5, nw0Var.f39056c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f35307b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f34213e = passkeys.passkeys;
                    privacySettingsActivity.A0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f35307b;
                Bitmap bitmap3 = (Bitmap) obj;
                fh.b bVar3 = profileActivity.f34332p6;
                bVar3.a((Bitmap) obj2);
                gh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                s31 s31Var = (s31) this.f35307b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.w61 w61Var8 = (org.telegram.ui.Components.w61) obj2;
                org.telegram.ui.Components.e71 e71Var = s31Var.f40329f;
                t31 t31Var = s31Var.v;
                ArrayList arrayList11 = t31Var.h;
                u5 u5Var = s31Var.h;
                if (u5Var.getMeasuredHeight() <= 0) {
                    u5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.h61 D = org.telegram.ui.Components.h61.D(u5Var.getMeasuredHeight());
                D.d = -1;
                D.f27100s = true;
                arrayList10.add(D);
                int measuredHeight = (int) ((u5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = s31Var.f40326b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || s31Var.f40327c != null || s31Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || s31Var.f40327c != null) {
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(s31Var.getContext(), org.telegram.ui.ActionBar.i6.L6, 21, 0, 0, false, false, t31.u(t31Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = s31Var.f40326b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = s31Var.f40327c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(t31Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20899h5));
                        org.telegram.ui.Components.h61 k10 = org.telegram.ui.Components.h61.k(m4Var);
                        k10.d = -2;
                        arrayList10.add(k10);
                        measuredHeight += 40;
                    }
                    if (s31Var.f40326b != null) {
                        for (int i30 = 0; i30 < s31Var.f40326b.options.size(); i30++) {
                            org.telegram.ui.Components.h61 h61Var3 = new org.telegram.ui.Components.h61(30);
                            h61Var3.f27093l = s31Var.f40326b.options.get(i30).text;
                            h61Var3.f27092k = R.drawable.msg_arrowright;
                            h61Var3.d = i30;
                            arrayList10.add(h61Var3);
                            measuredHeight += 50;
                        }
                    } else if (s31Var.f40327c != null) {
                        for (int i31 = 0; i31 < s31Var.f40327c.options.size(); i31++) {
                            org.telegram.ui.Components.h61 h61Var4 = new org.telegram.ui.Components.h61(30);
                            h61Var4.f27093l = s31Var.f40327c.options.get(i31).text;
                            h61Var4.f27092k = R.drawable.msg_arrowright;
                            h61Var4.d = i31;
                            arrayList10.add(h61Var4);
                            measuredHeight += 50;
                        }
                    } else if (s31Var.d != null) {
                        if (s31Var.f40330n == null) {
                            r31 r31Var = new r31(s31Var, s31Var.getContext(), t31.v(t31Var));
                            s31Var.f40330n = r31Var;
                            r31Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.h3 h3Var = s31Var.f40330n.f22315b;
                        if (s31Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        h3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.h61 k11 = org.telegram.ui.Components.h61.k(s31Var.f40330n);
                        k11.d = -3;
                        arrayList10.add(k11);
                        long j10 = t31Var.f40705r;
                        if (arrayList11 != null && !arrayList11.isEmpty()) {
                            if (arrayList11.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(t31.w(t31Var)).getChat(Long.valueOf(-j10)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        hg.c.n(i13, arrayList10);
                        if (s31Var.f40331r == null) {
                            ci.d dVar = new ci.d(s31Var.getContext(), t31.x(t31Var), true);
                            s31Var.f40332s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(s31Var.getContext());
                            s31Var.f40331r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20899h5, t31.y(t31Var)));
                            s31Var.f40331r.addView(s31Var.f40332s, w7.z5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(s31Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20828d7, t31.z(t31Var)));
                            s31Var.f40331r.addView(view, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ci.d dVar2 = s31Var.f40332s;
                        if (!s31Var.d.optional && TextUtils.isEmpty(s31Var.f40330n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        s31Var.f40332s.setOnClickListener(new j60(s31Var, 28));
                        org.telegram.ui.Components.h61 k12 = org.telegram.ui.Components.h61.k(s31Var.f40331r);
                        k12.d = -4;
                        arrayList10.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.h61) hg.c.g(1, arrayList10)).f27091j = true;
                    if (t31Var.d && s31Var.f40325a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(s31Var.getContext());
                        org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(new ColorDrawable(t31Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20771a7)), org.telegram.ui.ActionBar.i6.U0(s31Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20791b7, t31.A(t31Var))), 0, 0);
                        sqVar.f30931w = true;
                        frameLayout2.setBackground(sqVar);
                        org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(s31Var.getContext(), null);
                        q90Var.setTextSize(1, 14.0f);
                        q90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), t31.B(t31Var)));
                        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A6, t31.D(t31Var)));
                        q90Var.setGravity(17);
                        frameLayout2.addView(q90Var, w7.z5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.h61 k13 = org.telegram.ui.Components.h61.k(frameLayout2);
                        k13.d = -3;
                        arrayList10.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (e71Var != null) {
                    if (t31.E(t31Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        e71Var.f26033e3.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList10);
                    e71Var.f26033e3.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.w61 w61Var9 = (org.telegram.ui.Components.w61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.h61.k(((z31) this.f35307b).X));
                return;
            case 21:
                org.telegram.ui.Components.w61 w61Var10 = (org.telegram.ui.Components.w61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.h61.k(((m41) this.f35307b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f35307b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.w61 w61Var11 = (org.telegram.ui.Components.w61) obj2;
                k71.O((k71) this.f35307b, (ArrayList) obj);
                return;
            case 24:
                j71 j71Var = (j71) this.f35307b;
                ArrayList arrayList12 = j71Var.f37597e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i32 = j71Var.f37594a;
                ArrayList arrayList13 = j71Var.d;
                if (tL_error5 != null) {
                    if (j71Var.f37600r) {
                        arrayList13.clear();
                        j71Var.f37600r = false;
                    }
                    j71Var.h = true;
                    j71Var.f37598f = false;
                    int size4 = arrayList12.size();
                    while (i15 < size4) {
                        Object obj6 = arrayList12.get(i15);
                        i15++;
                        ((Runnable) obj6).run();
                    }
                    return;
                }
                MessagesController.getInstance(i32).putUsers(channels_channelparticipants.users, false);
                MessagesController.getInstance(i32).putChats(channels_channelparticipants.chats, false);
                if (j71Var.f37600r) {
                    arrayList13.clear();
                    j71Var.f37600r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList14 = channels_channelparticipants.participants;
                int size5 = arrayList14.size();
                int i33 = 0;
                while (i33 < size5) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList14.get(i33);
                    i33++;
                    TLObject userOrChat = MessagesController.getInstance(i32).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                    if (userOrChat != null) {
                        arrayList13.add(userOrChat);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    j71Var.h = true;
                }
                j71Var.f37598f = false;
                int size6 = arrayList12.size();
                while (i15 < size6) {
                    Object obj7 = arrayList12.get(i15);
                    i15++;
                    ((Runnable) obj7).run();
                }
                return;
            case 25:
                n71 n71Var = (n71) this.f35307b;
                ArrayList arrayList15 = (ArrayList) obj;
                org.telegram.ui.Components.w61 w61Var12 = (org.telegram.ui.Components.w61) obj2;
                int i34 = n71Var.f38825b0;
                ai.d9 d9Var = n71Var.Z;
                if (d9Var != null) {
                    arrayList15.add(org.telegram.ui.Components.h61.D(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList16 = d9Var.f789i;
                    int size7 = arrayList16.size();
                    int i35 = i34;
                    int i36 = 0;
                    while (i36 < size7) {
                        Object obj8 = arrayList16.get(i36);
                        i36++;
                        MessageObject messageObject = (MessageObject) obj8;
                        int i37 = ab1.f34830b;
                        org.telegram.ui.Components.h61 K5 = org.telegram.ui.Components.h61.K(ab1.class);
                        K5.f27102u = 1;
                        K5.f27106z = 0;
                        K5.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j3 = storyItem.f20284id;
                        } else {
                            j3 = -1;
                        }
                        K5.B = j3;
                        K5.f27088f = true;
                        K5.v = i34;
                        K5.L(n71Var.f38824a0.containsKey(Integer.valueOf(messageObject.getId())));
                        K5.f27102u = 1;
                        arrayList15.add(K5);
                        i35--;
                        if (i35 == 0) {
                            i35 = i34;
                        }
                    }
                    if (d9Var.k() || !d9Var.f798r) {
                        while (true) {
                            if (i35 <= 0) {
                                i14 = i34;
                            } else {
                                i14 = i35;
                            }
                            if (i15 < i14) {
                                i15++;
                                org.telegram.ui.Components.h61 q6 = org.telegram.ui.Components.h61.q(i15, 34);
                                q6.f27102u = 1;
                                arrayList15.add(q6);
                            }
                        }
                    }
                    arrayList15.add(org.telegram.ui.Components.h61.D(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.w61 w61Var13 = (org.telegram.ui.Components.w61) obj2;
                y81.c0((y81) this.f35307b, (ArrayList) obj);
                return;
            case 27:
                k91 k91Var = (k91) this.f35307b;
                ArrayList arrayList17 = (ArrayList) obj;
                org.telegram.ui.Components.w61 w61Var14 = (org.telegram.ui.Components.w61) obj2;
                LinearLayout linearLayout = k91Var.Y;
                if (linearLayout != null) {
                    arrayList17.add(org.telegram.ui.Components.h61.k(linearLayout));
                }
                LinearLayout linearLayout2 = k91Var.Z;
                if (linearLayout2 != null) {
                    arrayList17.add(org.telegram.ui.Components.h61.k(linearLayout2));
                    return;
                }
                return;
            default:
                ee1 ee1Var = (ee1) this.f35307b;
                fh.b bVar4 = ee1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                ee1Var.f36035r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                ee1Var.v = paint2;
                Bitmap bitmap5 = ee1Var.f36035r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                ee1Var.f36036s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f10);
                ee1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                ee1Var.f36037w = new Matrix();
                bVar4.a(bitmap4);
                gh.d.c(bVar4, ee1Var.f36026b);
                ee1Var.F.d();
                return;
        }
    }
}
