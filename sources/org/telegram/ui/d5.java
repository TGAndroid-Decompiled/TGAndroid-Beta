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
public final class d5 implements Utilities.Callback2 {
    public final int f33515a;
    public final Object f33516b;

    public d5(Object obj, int i10) {
        this.f33515a = i10;
        this.f33516b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        s91 s91Var;
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
        switch (this.f33515a) {
            case 0:
                e5 e5Var = (e5) this.f33516b;
                e5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                e5Var.f33895w = false;
                sg.b bVar = e5Var.h;
                bVar.a((Bitmap) obj2);
                tg.c.c(bVar, e5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                l9 l9Var = (l9) this.f33516b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var = (org.telegram.ui.Components.w51) obj2;
                boolean isEmpty = l9Var.H.isEmpty();
                ArrayList arrayList2 = l9Var.D;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.i51 c3 = org.telegram.ui.Components.i51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c3.f25570q = true;
                    arrayList.add(c3);
                    if (!l9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.i51 c10 = org.telegram.ui.Components.i51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c10.f25570q = true;
                        arrayList.add(c10);
                    }
                    arrayList.add(org.telegram.ui.Components.i51.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = l9Var.H;
                    int size = arrayList3.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj3 = arrayList3.get(i21);
                        i21++;
                        Long l10 = (Long) obj3;
                        if (l10 != null && (chat = l9Var.getMessagesController().getChat(l10)) != null) {
                            p8 p8Var = new p8(l9Var, 0);
                            int i22 = j9.f35280a;
                            org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(j9.class);
                            J.G = chat;
                            J.D = p8Var;
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
                        h9 h9Var = (h9) obj4;
                        org.telegram.messenger.video.g gVar = new org.telegram.messenger.video.g(12, l9Var, h9Var);
                        int i23 = f9.f34188a;
                        org.telegram.ui.Components.i51 J2 = org.telegram.ui.Components.i51.J(f9.class);
                        J2.G = h9Var;
                        J2.D = gVar;
                        J2.K(l9Var.l0(h9Var.f34794c));
                        arrayList.add(J2);
                    }
                    if (!l9Var.G) {
                        arrayList.add(org.telegram.ui.Components.i51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.i51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.i51.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ke keVar = (ke) this.f33516b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var2 = (org.telegram.ui.Components.w51) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(keVar.f35651v0).getChat(Long.valueOf(-keVar.f35652w0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(keVar.f35651v0).getChatFull(-keVar.f35652w0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (keVar.f35632c1) {
                    arrayList4.add(org.telegram.ui.Components.i51.g(keVar.f35655z0));
                    s91 s91Var2 = keVar.l1;
                    if (s91Var2 != null && !s91Var2.f38237l) {
                        arrayList4.add(org.telegram.ui.Components.i51.h(5, i10, s91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.i51.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    s91 s91Var3 = keVar.f35641m1;
                    if (s91Var3 != null && !s91Var3.f38237l) {
                        arrayList4.add(org.telegram.ui.Components.i51.h(2, i10, s91Var3));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-2, charSequence));
                    }
                }
                if (keVar.f35633d1 && (s91Var = keVar.f35642n1) != null && !s91Var.f38237l) {
                    arrayList4.add(org.telegram.ui.Components.i51.h(2, i10, s91Var));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-3, null));
                }
                if (keVar.f35643o1) {
                    arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.i51.u(keVar.f35644p1));
                    arrayList4.add(org.telegram.ui.Components.i51.u(keVar.f35645q1));
                    arrayList4.add(org.telegram.ui.Components.i51.u(keVar.f35646r1));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-4, keVar.B0));
                }
                if (chat2 != null && chat2.creator) {
                    if (keVar.f35632c1) {
                        arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.i51.k(keVar.D0));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-5, keVar.A0));
                        int i24 = MessagesController.getInstance(keVar.f35651v0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (keVar.f35654y0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(0, new so0(i11, context, null, false));
                            mqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(mqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.i51 i25 = org.telegram.ui.Components.i51.i(1, string);
                        if (keVar.f35654y0 >= i24 && keVar.f35639j1) {
                            z10 = true;
                        }
                        i25.K(z10);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.i51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (keVar.f35633d1) {
                        arrayList4.add(org.telegram.ui.Components.i51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.i51.j(3, keVar.J0));
                        arrayList4.add(org.telegram.ui.Components.i51.A(-6, keVar.C0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(keVar.f35651v0).getChat(Long.valueOf(-keVar.f35652w0))) && MessagesController.getInstance(keVar.f35651v0).starrefConnectAllowed) {
                    arrayList4.add(rh.g.a(4, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uj, keVar.f35650u0), R.drawable.filled_earn_stars, po.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.i51.A(-7, null));
                }
                if (keVar.f35631b1.a()) {
                    arrayList4.add(org.telegram.ui.Components.i51.p(keVar.f35631b1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.i51.A(-10, null));
                    return;
                }
            case 3:
                ee eeVar = (ee) this.f33516b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var3 = (org.telegram.ui.Components.w51) obj2;
                ge geVar = eeVar.f34001f;
                int i26 = eeVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = geVar.f34583n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = lh.da.f12321a;
                        org.telegram.ui.Components.i51 J3 = org.telegram.ui.Components.i51.J(lh.da.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f25570q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(geVar.f34584r)) {
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.i51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = geVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = lh.da.f12321a;
                        org.telegram.ui.Components.i51 J4 = org.telegram.ui.Components.i51.J(lh.da.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f25570q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(geVar.f34582f)) {
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
                po poVar = (po) this.f33516b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    poVar.getClass();
                    org.telegram.ui.Components.qc.a0(poVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(poVar.f37391h0);
                AndroidUtilities.removeFromParent(poVar.f37387e0);
                AndroidUtilities.removeFromParent(poVar.f37390g0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new kq((pr) this.f33516b, 1), 1000L);
                return;
            case 6:
                ((n7.qa) this.f33516b).b1(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ns nsVar = (ns) this.f33516b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var4 = (org.telegram.ui.Components.w51) obj2;
                TLRPC.User user = nsVar.getMessagesController().getUser(Long.valueOf(nsVar.E));
                arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.S));
                arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.f36716b));
                arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.f36717c));
                if (TextUtils.isEmpty(nsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (nsVar.H) {
                    arrayList8.add(org.telegram.ui.Components.i51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.i51.B(null));
                }
                if (nsVar.F && nsVar.H) {
                    org.telegram.ui.Components.i51 i29 = org.telegram.ui.Components.i51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(nsVar.U);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.i51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.d));
                yh.A(R.string.AddNotesInfo, arrayList8);
                if (!nsVar.F) {
                    TLRPC.UserFull userFull = nsVar.getMessagesController().getUserFull(nsVar.E);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.C));
                    }
                    arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.f36723x));
                    arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.f36724y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.i51.k(nsVar.B));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.i51.B(null));
                    org.telegram.ui.Components.i51 e = org.telegram.ui.Components.i51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f25571r = true;
                    arrayList8.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.i51.B(charSequence2));
                if (nsVar.V) {
                    AndroidUtilities.runOnUIThread(new es(nsVar, user, 0));
                    nsVar.V = false;
                    AndroidUtilities.runOnUIThread(new fs(nsVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                pt.a((pt) this.f33516b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                lt ltVar = (lt) this.f33516b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                pt ptVar = ltVar.f36133a;
                nt ntVar = ptVar.f37524l;
                if (ntVar != null) {
                    String join = TextUtils.join("", ptVar.f37527o);
                    if (callback != null) {
                        vkVar = new org.telegram.ui.Components.vk(11, ltVar, callback);
                    } else {
                        vkVar = null;
                    }
                    ntVar.A(charSequence3, join, vkVar);
                    if (callback == null) {
                        ptVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.w51 w51Var5 = (org.telegram.ui.Components.w51) obj2;
                au.R((au) this.f33516b, (ArrayList) obj);
                return;
            case 11:
                oy oyVar = (oy) this.f33516b;
                Long l11 = (Long) obj2;
                oyVar.M1 = (Long) obj;
                oyVar.U4();
                return;
            case 12:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                Long l12 = (Long) obj2;
                ((Runnable) this.f33516b).run();
                return;
            case 13:
                final hz hzVar = (hz) this.f33516b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var6 = (org.telegram.ui.Components.w51) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(2);
                i51Var.f25565l = string2;
                i51Var.f25564k = i30;
                arrayList9.add(i51Var);
                org.telegram.ui.Components.i51 i31 = org.telegram.ui.Components.i51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(hzVar.f34976c);
                arrayList9.add(i31);
                if (hzVar.f34976c) {
                    arrayList9.add(org.telegram.ui.Components.i51.B(null));
                    arrayList9.add(org.telegram.ui.Components.i51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    hz hzVar2 = hzVar;
                                    hzVar2.d = true;
                                    ((gz) view.getParent()).a(true, true);
                                    dh.v vVar = hzVar2.f34977f;
                                    if (vVar != null) {
                                        vVar.run(Boolean.valueOf(hzVar2.f34976c), Boolean.valueOf(hzVar2.d));
                                    }
                                    hzVar2.U();
                                    return;
                                default:
                                    hz hzVar3 = hzVar;
                                    hzVar3.d = false;
                                    ((gz) view.getParent()).a(false, true);
                                    dh.v vVar2 = hzVar3.f34977f;
                                    if (vVar2 != null) {
                                        vVar2.run(Boolean.valueOf(hzVar3.f34976c), Boolean.valueOf(hzVar3.d));
                                    }
                                    hzVar3.U();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    hz hzVar2 = hzVar;
                                    hzVar2.d = true;
                                    ((gz) view.getParent()).a(true, true);
                                    dh.v vVar = hzVar2.f34977f;
                                    if (vVar != null) {
                                        vVar.run(Boolean.valueOf(hzVar2.f34976c), Boolean.valueOf(hzVar2.d));
                                    }
                                    hzVar2.U();
                                    return;
                                default:
                                    hz hzVar3 = hzVar;
                                    hzVar3.d = false;
                                    ((gz) view.getParent()).a(false, true);
                                    dh.v vVar2 = hzVar3.f34977f;
                                    if (vVar2 != null) {
                                        vVar2.run(Boolean.valueOf(hzVar3.f34976c), Boolean.valueOf(hzVar3.d));
                                    }
                                    hzVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = fz.f34420a;
                    org.telegram.ui.Components.i51 J5 = org.telegram.ui.Components.i51.J(fz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(hzVar.d);
                    arrayList9.add(J5);
                    yh.A(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                wb0 wb0Var = (wb0) this.f33516b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                wb0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(wb0Var.f39390b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.r(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        kh.a2.v(R.string.AIEditorStyleNotFound, wb0.b(), R.raw.error, 36);
                        return;
                    } else {
                        wb0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                rv0 rv0Var = (rv0) this.f33516b;
                sg.b bVar2 = rv0Var.C;
                Bitmap bitmap = (Bitmap) obj2;
                rv0Var.f38127s = (Bitmap) obj;
                Paint paint = new Paint(1);
                rv0Var.f38128w = paint;
                Bitmap bitmap2 = rv0Var.f38127s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                rv0Var.v = bitmapShader;
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
                rv0Var.f38128w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                rv0Var.f38129x = new Matrix();
                bVar2.a(bitmap);
                tg.c.c(bVar2, rv0Var.f38121c);
                rv0Var.D.d();
                return;
            case 16:
                yv0 yv0Var = (yv0) this.f33516b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var7 = (org.telegram.ui.Components.w51) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.i51 i51Var2 = new org.telegram.ui.Components.i51(2);
                i51Var2.f25565l = string3;
                i51Var2.f25564k = i33;
                arrayList10.add(i51Var2);
                org.telegram.ui.Components.i51 i34 = org.telegram.ui.Components.i51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(yv0Var.f40589r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.i51.A(2, null));
                if (yv0Var.f40589r) {
                    yh.r(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.x7.a((int) yv0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    al0 al0Var = new al0(4);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.f22548c = a2;
                    w7Var.d = 20;
                    w7Var.e = al0Var;
                    yv0Var.f40585b.d((int) Utilities.clamp(yv0Var.f40590s, 10000L, 0L), w7Var, new w3(yv0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.i51.j(3, yv0Var.f40585b));
                    if (yv0Var.f40590s > 0) {
                        str = yv0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.i51.A(4, str));
                    TLRPC.Chat chat3 = yv0Var.getMessagesController().getChat(Long.valueOf(yv0Var.f40584a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        yv0Var.f40586c.setLink(yv0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        yh.r(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.i51.j(5, yv0Var.f40586c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f33516b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f33516b;
                Bitmap bitmap3 = (Bitmap) obj;
                sg.b bVar3 = profileActivity.f32117m6;
                bVar3.a((Bitmap) obj2);
                tg.c.c(bVar3, profileActivity.fragmentView);
                profileActivity.f32125n6.d();
                return;
            case 19:
                j31 j31Var = (j31) this.f33516b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var8 = (org.telegram.ui.Components.w51) obj2;
                org.telegram.ui.Components.g61 g61Var = j31Var.f35219f;
                k31 k31Var = j31Var.v;
                ArrayList arrayList12 = k31Var.h;
                dg.s1 s1Var = j31Var.h;
                if (s1Var.getMeasuredHeight() <= 0) {
                    s1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.i51 C = org.telegram.ui.Components.i51.C(s1Var.getMeasuredHeight());
                C.d = -1;
                C.f25572s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((s1Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = j31Var.f35217b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || j31Var.f35218c != null || j31Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || j31Var.f35218c != null) {
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(j31Var.getContext(), org.telegram.ui.ActionBar.j6.L6, 21, 0, 0, false, false, k31.u(k31Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = j31Var.f35217b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = j31Var.f35218c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(k31Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5));
                        org.telegram.ui.Components.i51 k10 = org.telegram.ui.Components.i51.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (j31Var.f35217b != null) {
                        for (int i35 = 0; i35 < j31Var.f35217b.options.size(); i35++) {
                            org.telegram.ui.Components.i51 i51Var3 = new org.telegram.ui.Components.i51(30);
                            i51Var3.f25565l = j31Var.f35217b.options.get(i35).text;
                            i51Var3.f25564k = R.drawable.msg_arrowright;
                            i51Var3.d = i35;
                            arrayList11.add(i51Var3);
                            measuredHeight += 50;
                        }
                    } else if (j31Var.f35218c != null) {
                        for (int i36 = 0; i36 < j31Var.f35218c.options.size(); i36++) {
                            org.telegram.ui.Components.i51 i51Var4 = new org.telegram.ui.Components.i51(30);
                            i51Var4.f25565l = j31Var.f35218c.options.get(i36).text;
                            i51Var4.f25564k = R.drawable.msg_arrowright;
                            i51Var4.d = i36;
                            arrayList11.add(i51Var4);
                            measuredHeight += 50;
                        }
                    } else if (j31Var.d != null) {
                        if (j31Var.f35220n == null) {
                            h31 h31Var = new h31(j31Var, j31Var.getContext(), k31.v(k31Var));
                            j31Var.f35220n = h31Var;
                            h31Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.g3 g3Var = j31Var.f35220n.f21199b;
                        if (j31Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        g3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.i51 k11 = org.telegram.ui.Components.i51.k(j31Var.f35220n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j11 = k31Var.f35561r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j11)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(k31.w(k31Var)).getChat(Long.valueOf(-j11)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        yh.A(i13, arrayList11);
                        if (j31Var.f35221r == null) {
                            ph.d dVar = new ph.d(j31Var.getContext(), k31.x(k31Var), true);
                            j31Var.f35222s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(j31Var.getContext());
                            j31Var.f35221r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, k31.y(k31Var)));
                            j31Var.f35221r.addView(j31Var.f35222s, k7.b6.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(j31Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19907d7, k31.A(k31Var)));
                            j31Var.f35221r.addView(view, k7.b6.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ph.d dVar2 = j31Var.f35222s;
                        if (!j31Var.d.optional && TextUtils.isEmpty(j31Var.f35220n.getText())) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        dVar2.setEnabled(z4);
                        j31Var.f35222s.setOnClickListener(new e60(j31Var, 29));
                        org.telegram.ui.Components.i51 k12 = org.telegram.ui.Components.i51.k(j31Var.f35221r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.i51) kh.a2.i(1, arrayList11)).f25563j = true;
                    if (k31Var.d && j31Var.f35216a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(j31Var.getContext());
                        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(new ColorDrawable(k31Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19852a7)), org.telegram.ui.ActionBar.j6.U0(j31Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19871b7, k31.B(k31Var))), 0, 0);
                        nqVar.f27342w = true;
                        frameLayout2.setBackground(nqVar);
                        org.telegram.ui.Components.e90 e90Var = new org.telegram.ui.Components.e90(j31Var.getContext(), null);
                        e90Var.setTextSize(1, 14.0f);
                        e90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), k31.C(k31Var)));
                        e90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, k31.E(k31Var)));
                        e90Var.setGravity(17);
                        frameLayout2.addView(e90Var, k7.b6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.i51 k13 = org.telegram.ui.Components.i51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (g61Var != null) {
                    if (k31.F(k31Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
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
                ((ArrayList) obj).add(org.telegram.ui.Components.i51.k(((p31) this.f33516b).U));
                return;
            case 21:
                org.telegram.ui.Components.w51 w51Var10 = (org.telegram.ui.Components.w51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.i51.k(((z31) this.f33516b).U));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f33516b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.w51 w51Var11 = (org.telegram.ui.Components.w51) obj2;
                b71.Q((b71) this.f33516b, (ArrayList) obj);
                return;
            case 24:
                a71 a71Var = (a71) this.f33516b;
                ArrayList arrayList13 = a71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = a71Var.f32476a;
                ArrayList arrayList14 = a71Var.d;
                if (tL_error5 != null) {
                    if (a71Var.f32481r) {
                        arrayList14.clear();
                        a71Var.f32481r = false;
                    }
                    a71Var.h = true;
                    a71Var.f32479f = false;
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
                if (a71Var.f32481r) {
                    arrayList14.clear();
                    a71Var.f32481r = false;
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
                    a71Var.h = true;
                }
                a71Var.f32479f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                e71 e71Var = (e71) this.f33516b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var12 = (org.telegram.ui.Components.w51) obj2;
                int i39 = e71Var.Y;
                nh.l6 l6Var = e71Var.W;
                if (l6Var != null) {
                    arrayList16.add(org.telegram.ui.Components.i51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = l6Var.f15580i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = na1.f36557b;
                        org.telegram.ui.Components.i51 J6 = org.telegram.ui.Components.i51.J(na1.class);
                        J6.f25574u = 1;
                        J6.f25578z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j10 = storyItem.f19419id;
                        } else {
                            j10 = -1;
                        }
                        J6.B = j10;
                        J6.f25560f = true;
                        J6.v = i39;
                        J6.K(e71Var.X.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f25574u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (l6Var.k() || !l6Var.f15589r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.i51 o10 = org.telegram.ui.Components.i51.o(i16, 34);
                                o10.f25574u = 1;
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
                o81.a0((o81) this.f33516b, (ArrayList) obj);
                return;
            case 27:
                y81 y81Var = (y81) this.f33516b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.w51 w51Var14 = (org.telegram.ui.Components.w51) obj2;
                LinearLayout linearLayout = y81Var.V;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.i51.k(linearLayout));
                }
                LinearLayout linearLayout2 = y81Var.W;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.i51.k(linearLayout2));
                    return;
                }
                return;
            default:
                rd1 rd1Var = (rd1) this.f33516b;
                sg.b bVar4 = rd1Var.B;
                Bitmap bitmap4 = (Bitmap) obj2;
                rd1Var.f37994r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                rd1Var.v = paint2;
                Bitmap bitmap5 = rd1Var.f37994r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                rd1Var.f37995s = bitmapShader2;
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
                rd1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                rd1Var.f37996w = new Matrix();
                bVar4.a(bitmap4);
                tg.c.c(bVar4, rd1Var.f37989b);
                rd1Var.C.d();
                return;
        }
    }
}
