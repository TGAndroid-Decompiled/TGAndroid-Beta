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
public final class f5 implements Utilities.Callback2 {
    public final int f33949a;
    public final Object f33950b;

    public f5(Object obj, int i10) {
        this.f33949a = i10;
        this.f33950b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        aa1 aa1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.ui.Components.vk vkVar;
        float f10;
        String str;
        int i12;
        int i13;
        boolean z4;
        int i14;
        long j10;
        TL_stories.StoryItem storyItem;
        float f11;
        float f12 = 0.25f;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        r8 = false;
        boolean z10 = false;
        switch (this.f33949a) {
            case 0:
                g5 g5Var = (g5) this.f33950b;
                g5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                g5Var.f34324w = false;
                sg.b bVar = g5Var.h;
                bVar.a((Bitmap) obj2);
                tg.c.c(bVar, g5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = g5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                n9 n9Var = (n9) this.f33950b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var = (org.telegram.ui.Components.w51) obj2;
                boolean isEmpty = n9Var.H.isEmpty();
                ArrayList arrayList2 = n9Var.D;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.i51 c3 = org.telegram.ui.Components.i51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c3.f25590q = true;
                    arrayList.add(c3);
                    if (!n9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.i51 c10 = org.telegram.ui.Components.i51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c10.f25590q = true;
                        arrayList.add(c10);
                    }
                    arrayList.add(org.telegram.ui.Components.i51.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = n9Var.H;
                    int size = arrayList3.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj3 = arrayList3.get(i21);
                        i21++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (chat = n9Var.getMessagesController().getChat(l10)) != null) {
                            r8 r8Var = new r8(n9Var, 0);
                            int i22 = l9.f35694a;
                            org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(l9.class);
                            J.G = chat;
                            J.D = r8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.i51.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        j9 j9Var = (j9) obj4;
                        org.telegram.messenger.video.g gVar = new org.telegram.messenger.video.g(12, n9Var, j9Var);
                        int i23 = h9.f34607a;
                        org.telegram.ui.Components.i51 J2 = org.telegram.ui.Components.i51.J(h9.class);
                        J2.G = j9Var;
                        J2.D = gVar;
                        J2.K(n9Var.l0(j9Var.f35123c));
                        arrayList.add(J2);
                    }
                    if (!n9Var.G) {
                        arrayList.add(org.telegram.ui.Components.i51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.i51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.i51.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                me meVar = (me) this.f33950b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var2 = (org.telegram.ui.Components.w51) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(meVar.f36058v0).getChat(Long.valueOf(-meVar.f36059w0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(meVar.f36058v0).getChatFull(-meVar.f36059w0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (meVar.f36039c1) {
                    arrayList4.add(org.telegram.ui.Components.i51.g(meVar.f36062z0));
                    aa1 aa1Var2 = meVar.l1;
                    if (aa1Var2 != null && !aa1Var2.f32534l) {
                        arrayList4.add(org.telegram.ui.Components.i51.h(5, i10, aa1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.i51.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    aa1 aa1Var3 = meVar.f36048m1;
                    if (aa1Var3 != null && !aa1Var3.f32534l) {
                        arrayList4.add(org.telegram.ui.Components.i51.h(2, i10, aa1Var3));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-2, charSequence));
                    }
                }
                if (meVar.f36040d1 && (aa1Var = meVar.f36049n1) != null && !aa1Var.f32534l) {
                    arrayList4.add(org.telegram.ui.Components.i51.h(2, i10, aa1Var));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-3, null));
                }
                if (meVar.f36050o1) {
                    arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.i51.u(meVar.f36051p1));
                    arrayList4.add(org.telegram.ui.Components.i51.u(meVar.f36052q1));
                    arrayList4.add(org.telegram.ui.Components.i51.u(meVar.f36053r1));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-4, meVar.B0));
                }
                if (chat2 != null && chat2.creator) {
                    if (meVar.f36039c1) {
                        arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.i51.k(meVar.D0));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-5, meVar.A0));
                        int i24 = MessagesController.getInstance(meVar.f36058v0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (meVar.f36061y0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(0, new wo0(i11, context, null, false));
                            lqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(lqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.i51 i25 = org.telegram.ui.Components.i51.i(1, string);
                        if (meVar.f36061y0 >= i24 && meVar.f36046j1) {
                            z10 = true;
                        }
                        i25.K(z10);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.i51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (meVar.f36040d1) {
                        arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.i51.j(3, meVar.J0));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-6, meVar.C0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(meVar.f36058v0).getChat(Long.valueOf(-meVar.f36059w0))) && MessagesController.getInstance(meVar.f36058v0).starrefConnectAllowed) {
                    arrayList4.add(rh.f.a(4, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uj, meVar.f36057u0), R.drawable.filled_earn_stars, ro.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-7, null));
                }
                if (meVar.f36038b1.a()) {
                    arrayList4.add(org.telegram.ui.Components.i51.p(meVar.f36038b1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.i51.A(-10, null));
                    return;
                }
            case 3:
                ge geVar = (ge) this.f33950b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var3 = (org.telegram.ui.Components.w51) obj2;
                ie ieVar = geVar.f34424f;
                int i26 = geVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = ieVar.f34911n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = lh.da.f12305a;
                        org.telegram.ui.Components.i51 J3 = org.telegram.ui.Components.i51.J(lh.da.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f25590q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(ieVar.f34912r)) {
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = ieVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = lh.da.f12305a;
                        org.telegram.ui.Components.i51 J4 = org.telegram.ui.Components.i51.J(lh.da.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f25590q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(ieVar.f34910f)) {
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                ro roVar = (ro) this.f33950b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    roVar.getClass();
                    org.telegram.ui.Components.qc.a0(roVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(roVar.f37911h0);
                AndroidUtilities.removeFromParent(roVar.f37907e0);
                AndroidUtilities.removeFromParent(roVar.f37910g0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new mq((rr) this.f33950b, 1), 1000L);
                return;
            case 6:
                ((n7.qa) this.f33950b).q0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ps psVar = (ps) this.f33950b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var4 = (org.telegram.ui.Components.w51) obj2;
                TLRPC.User user = psVar.getMessagesController().getUser(Long.valueOf(psVar.E));
                arrayList8.add(org.telegram.ui.Components.i51.k(psVar.S));
                arrayList8.add(org.telegram.ui.Components.i51.k(psVar.f37220b));
                arrayList8.add(org.telegram.ui.Components.i51.k(psVar.f37221c));
                if (TextUtils.isEmpty(psVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (psVar.H) {
                    arrayList8.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.i51.B(null));
                }
                if (psVar.F && psVar.H) {
                    org.telegram.ui.Components.i51 i29 = org.telegram.ui.Components.i51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(psVar.U);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.i51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.i51.k(psVar.d));
                ai.A(R.string.AddNotesInfo, arrayList8);
                if (!psVar.F) {
                    TLRPC.UserFull userFull = psVar.getMessagesController().getUserFull(psVar.E);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.i51.k(psVar.C));
                    }
                    arrayList8.add(org.telegram.ui.Components.i51.k(psVar.f37227x));
                    arrayList8.add(org.telegram.ui.Components.i51.k(psVar.f37228y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.i51.k(psVar.B));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.i51.B(null));
                    org.telegram.ui.Components.i51 e = org.telegram.ui.Components.i51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f25591r = true;
                    arrayList8.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.i51.B(charSequence2));
                if (psVar.V) {
                    AndroidUtilities.runOnUIThread(new gs(psVar, user, 0));
                    psVar.V = false;
                    AndroidUtilities.runOnUIThread(new hs(psVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                rt.a((rt) this.f33950b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                nt ntVar = (nt) this.f33950b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                rt rtVar = ntVar.f36580a;
                pt ptVar = rtVar.f38040l;
                if (ptVar != null) {
                    String join = TextUtils.join("", rtVar.f38043o);
                    if (callback != null) {
                        vkVar = new org.telegram.ui.Components.vk(11, ntVar, callback);
                    } else {
                        vkVar = null;
                    }
                    ptVar.A(charSequence3, join, vkVar);
                    if (callback == null) {
                        rtVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.w51 w51Var5 = (org.telegram.ui.Components.w51) obj2;
                cu.R((cu) this.f33950b, (ArrayList) obj);
                return;
            case 11:
                qy qyVar = (qy) this.f33950b;
                Long l11 = (Long) obj2;
                qyVar.M1 = (Long) obj;
                qyVar.U4();
                return;
            case 12:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                Long l12 = (Long) obj2;
                ((Runnable) this.f33950b).run();
                return;
            case 13:
                final jz jzVar = (jz) this.f33950b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var6 = (org.telegram.ui.Components.w51) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(2);
                i51Var.f25585l = string2;
                i51Var.f25584k = i30;
                arrayList9.add(i51Var);
                org.telegram.ui.Components.i51 i31 = org.telegram.ui.Components.i51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(jzVar.f35392c);
                arrayList9.add(i31);
                if (jzVar.f35392c) {
                    arrayList9.add(org.telegram.ui.Components.i51.B(null));
                    arrayList9.add(org.telegram.ui.Components.i51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    jz jzVar2 = jzVar;
                                    jzVar2.d = true;
                                    ((iz) view.getParent()).a(true, true);
                                    dh.v vVar = jzVar2.f35393f;
                                    if (vVar != null) {
                                        vVar.run(Boolean.valueOf(jzVar2.f35392c), Boolean.valueOf(jzVar2.d));
                                    }
                                    jzVar2.U();
                                    return;
                                default:
                                    jz jzVar3 = jzVar;
                                    jzVar3.d = false;
                                    ((iz) view.getParent()).a(false, true);
                                    dh.v vVar2 = jzVar3.f35393f;
                                    if (vVar2 != null) {
                                        vVar2.run(Boolean.valueOf(jzVar3.f35392c), Boolean.valueOf(jzVar3.d));
                                    }
                                    jzVar3.U();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    jz jzVar2 = jzVar;
                                    jzVar2.d = true;
                                    ((iz) view.getParent()).a(true, true);
                                    dh.v vVar = jzVar2.f35393f;
                                    if (vVar != null) {
                                        vVar.run(Boolean.valueOf(jzVar2.f35392c), Boolean.valueOf(jzVar2.d));
                                    }
                                    jzVar2.U();
                                    return;
                                default:
                                    jz jzVar3 = jzVar;
                                    jzVar3.d = false;
                                    ((iz) view.getParent()).a(false, true);
                                    dh.v vVar2 = jzVar3.f35393f;
                                    if (vVar2 != null) {
                                        vVar2.run(Boolean.valueOf(jzVar3.f35392c), Boolean.valueOf(jzVar3.d));
                                    }
                                    jzVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = hz.f34772a;
                    org.telegram.ui.Components.i51 J5 = org.telegram.ui.Components.i51.J(hz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(jzVar.d);
                    arrayList9.add(J5);
                    ai.A(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                yb0 yb0Var = (yb0) this.f33950b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                yb0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(yb0Var.f40222b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.r(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        kf.k0.v(R.string.AIEditorStyleNotFound, yb0.b(), R.raw.error, 36);
                        return;
                    } else {
                        yb0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                yv0 yv0Var = (yv0) this.f33950b;
                sg.b bVar2 = yv0Var.C;
                Bitmap bitmap = (Bitmap) obj2;
                yv0Var.f40342s = (Bitmap) obj;
                Paint paint = new Paint(1);
                yv0Var.f40343w = paint;
                Bitmap bitmap2 = yv0Var.f40342s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                yv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f12 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f12);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                yv0Var.f40343w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                yv0Var.f40344x = new Matrix();
                bVar2.a(bitmap);
                tg.c.c(bVar2, yv0Var.f40336c);
                yv0Var.D.d();
                return;
            case 16:
                fw0 fw0Var = (fw0) this.f33950b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var7 = (org.telegram.ui.Components.w51) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.i51 i51Var2 = new org.telegram.ui.Components.i51(2);
                i51Var2.f25585l = string3;
                i51Var2.f25584k = i33;
                arrayList10.add(i51Var2);
                org.telegram.ui.Components.i51 i34 = org.telegram.ui.Components.i51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(fw0Var.f34243r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.i51.A(2, null));
                if (fw0Var.f34243r) {
                    ai.q(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.w7.a((int) fw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    cl0 cl0Var = new cl0(4);
                    org.telegram.ui.Cells.v7 v7Var = new org.telegram.ui.Cells.v7();
                    v7Var.f22476c = a2;
                    v7Var.d = 20;
                    v7Var.e = cl0Var;
                    fw0Var.f34239b.d((int) Utilities.clamp(fw0Var.f34244s, 10000L, 0L), v7Var, new y3(fw0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.i51.j(3, fw0Var.f34239b));
                    if (fw0Var.f34244s > 0) {
                        str = fw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.i51.A(4, str));
                    TLRPC.Chat chat3 = fw0Var.getMessagesController().getChat(Long.valueOf(fw0Var.f34238a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        fw0Var.f34240c.setLink(fw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        ai.q(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.i51.j(5, fw0Var.f34240c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f33950b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.e = passkeys.passkeys;
                    privacySettingsActivity.A0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f33950b;
                Bitmap bitmap3 = (Bitmap) obj;
                sg.b bVar3 = profileActivity.f32091m6;
                bVar3.a((Bitmap) obj2);
                tg.c.c(bVar3, profileActivity.fragmentView);
                profileActivity.f32099n6.d();
                return;
            case 19:
                p31 p31Var = (p31) this.f33950b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var8 = (org.telegram.ui.Components.w51) obj2;
                org.telegram.ui.Components.g61 g61Var = p31Var.f36932f;
                q31 q31Var = p31Var.v;
                ArrayList arrayList12 = q31Var.h;
                dg.s1 s1Var = p31Var.h;
                if (s1Var.getMeasuredHeight() <= 0) {
                    s1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.i51 C = org.telegram.ui.Components.i51.C(s1Var.getMeasuredHeight());
                C.d = -1;
                C.f25592s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((s1Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = p31Var.f36930b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || p31Var.f36931c != null || p31Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || p31Var.f36931c != null) {
                        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(p31Var.getContext(), org.telegram.ui.ActionBar.j6.L6, 21, 0, 0, false, false, q31.u(q31Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = p31Var.f36930b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            l4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = p31Var.f36931c;
                            if (tL_reportResultChooseOption != null) {
                                l4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        l4Var.setBackgroundColor(q31Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19952h5));
                        org.telegram.ui.Components.i51 k10 = org.telegram.ui.Components.i51.k(l4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (p31Var.f36930b != null) {
                        for (int i35 = 0; i35 < p31Var.f36930b.options.size(); i35++) {
                            org.telegram.ui.Components.i51 i51Var3 = new org.telegram.ui.Components.i51(30);
                            i51Var3.f25585l = p31Var.f36930b.options.get(i35).text;
                            i51Var3.f25584k = R.drawable.msg_arrowright;
                            i51Var3.d = i35;
                            arrayList11.add(i51Var3);
                            measuredHeight += 50;
                        }
                    } else if (p31Var.f36931c != null) {
                        for (int i36 = 0; i36 < p31Var.f36931c.options.size(); i36++) {
                            org.telegram.ui.Components.i51 i51Var4 = new org.telegram.ui.Components.i51(30);
                            i51Var4.f25585l = p31Var.f36931c.options.get(i36).text;
                            i51Var4.f25584k = R.drawable.msg_arrowright;
                            i51Var4.d = i36;
                            arrayList11.add(i51Var4);
                            measuredHeight += 50;
                        }
                    } else if (p31Var.d != null) {
                        if (p31Var.f36933n == null) {
                            o31 o31Var = new o31(p31Var, p31Var.getContext(), q31.v(q31Var));
                            p31Var.f36933n = o31Var;
                            o31Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.f3 f3Var = p31Var.f36933n.f21132b;
                        if (p31Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        f3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.i51 k11 = org.telegram.ui.Components.i51.k(p31Var.f36933n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j11 = q31Var.f37292r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j11)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(q31.w(q31Var)).getChat(Long.valueOf(-j11)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        ai.A(i13, arrayList11);
                        if (p31Var.f36934r == null) {
                            ph.d dVar = new ph.d(p31Var.getContext(), q31.x(q31Var), true);
                            p31Var.f36935s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(p31Var.getContext());
                            p31Var.f36934r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, q31.y(q31Var)));
                            p31Var.f36934r.addView(p31Var.f36935s, k7.b6.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(p31Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19882d7, q31.A(q31Var)));
                            p31Var.f36934r.addView(view, k7.b6.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ph.d dVar2 = p31Var.f36935s;
                        if (!p31Var.d.optional && TextUtils.isEmpty(p31Var.f36933n.getText())) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        dVar2.setEnabled(z4);
                        p31Var.f36935s.setOnClickListener(new g60(p31Var, 28));
                        org.telegram.ui.Components.i51 k12 = org.telegram.ui.Components.i51.k(p31Var.f36934r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.i51) kf.k0.i(1, arrayList11)).f25583j = true;
                    if (q31Var.d && p31Var.f36929a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(p31Var.getContext());
                        org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(q31Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7)), org.telegram.ui.ActionBar.j6.U0(p31Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19846b7, q31.B(q31Var))), 0, 0);
                        mqVar.f27116w = true;
                        frameLayout2.setBackground(mqVar);
                        org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(p31Var.getContext(), null);
                        f90Var.setTextSize(1, 14.0f);
                        f90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), q31.C(q31Var)));
                        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, q31.E(q31Var)));
                        f90Var.setGravity(17);
                        frameLayout2.addView(f90Var, k7.b6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.i51 k13 = org.telegram.ui.Components.i51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (g61Var != null) {
                    if (q31.F(q31Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        g61Var.U2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    g61Var.U2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.w51 w51Var9 = (org.telegram.ui.Components.w51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.i51.k(((w31) this.f33950b).U));
                return;
            case 21:
                org.telegram.ui.Components.w51 w51Var10 = (org.telegram.ui.Components.w51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.i51.k(((g41) this.f33950b).U));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f33950b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.w51 w51Var11 = (org.telegram.ui.Components.w51) obj2;
                i71.Q((i71) this.f33950b, (ArrayList) obj);
                return;
            case 24:
                h71 h71Var = (h71) this.f33950b;
                ArrayList arrayList13 = h71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = h71Var.f34591a;
                ArrayList arrayList14 = h71Var.d;
                if (tL_error5 != null) {
                    if (h71Var.f34596r) {
                        arrayList14.clear();
                        h71Var.f34596r = false;
                    }
                    h71Var.h = true;
                    h71Var.f34594f = false;
                    int size5 = arrayList13.size();
                    while (i17 < size5) {
                        Object obj7 = arrayList13.get(i17);
                        i17++;
                        ((Runnable) obj7).run();
                    }
                    return;
                }
                MessagesController.getInstance(i37).putUsers(channels_channelparticipants.users, false);
                MessagesController.getInstance(i37).putChats(channels_channelparticipants.chats, false);
                if (h71Var.f34596r) {
                    arrayList14.clear();
                    h71Var.f34596r = false;
                }
                ArrayList<TLRPC.ChannelParticipant> arrayList15 = channels_channelparticipants.participants;
                int size6 = arrayList15.size();
                int i38 = 0;
                while (i38 < size6) {
                    TLRPC.ChannelParticipant channelParticipant = arrayList15.get(i38);
                    i38++;
                    TLObject userOrChat = MessagesController.getInstance(i37).getUserOrChat(DialogObject.getPeerDialogId(channelParticipant.peer));
                    if (userOrChat != null) {
                        arrayList14.add(userOrChat);
                    }
                }
                if (channels_channelparticipants.participants.size() < 30) {
                    h71Var.h = true;
                }
                h71Var.f34594f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                l71 l71Var = (l71) this.f33950b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var12 = (org.telegram.ui.Components.w51) obj2;
                int i39 = l71Var.Y;
                nh.l6 l6Var = l71Var.W;
                if (l6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.i51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = l6Var.f15560i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = va1.f39062b;
                        org.telegram.ui.Components.i51 J6 = org.telegram.ui.Components.i51.J(va1.class);
                        J6.f25594u = 1;
                        J6.f25598z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j10 = storyItem.f19394id;
                        } else {
                            j10 = -1;
                        }
                        J6.B = j10;
                        J6.f25580f = true;
                        J6.v = i39;
                        J6.K(l71Var.X.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f25594u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (l6Var.k() || !l6Var.f15569r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.i51 o10 = org.telegram.ui.Components.i51.o(i16, 34);
                                o10.f25594u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.i51.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.w51 w51Var13 = (org.telegram.ui.Components.w51) obj2;
                w81.a0((w81) this.f33950b, (ArrayList) obj);
                return;
            case 27:
                g91 g91Var = (g91) this.f33950b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var14 = (org.telegram.ui.Components.w51) obj2;
                LinearLayout linearLayout = g91Var.V;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.i51.k(linearLayout));
                }
                LinearLayout linearLayout2 = g91Var.W;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.i51.k(linearLayout2));
                    return;
                }
                return;
            default:
                yd1 yd1Var = (yd1) this.f33950b;
                sg.b bVar4 = yd1Var.B;
                Bitmap bitmap4 = (Bitmap) obj2;
                yd1Var.f40242r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                yd1Var.v = paint2;
                Bitmap bitmap5 = yd1Var.f40242r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                yd1Var.f40243s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f12 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f12);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f11 = -0.02f;
                } else {
                    f11 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f11);
                yd1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                yd1Var.f40244w = new Matrix();
                bVar4.a(bitmap4);
                tg.c.c(bVar4, yd1Var.f40237b);
                yd1Var.C.d();
                return;
        }
    }
}
