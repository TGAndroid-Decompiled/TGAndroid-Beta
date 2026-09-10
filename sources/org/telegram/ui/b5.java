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
public final class b5 implements Utilities.Callback2 {
    public final int f31159a;
    public final Object f31160b;

    public b5(Object obj, int i10) {
        this.f31159a = i10;
        this.f31160b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        ra1 ra1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        pf pfVar;
        float f7;
        float f10;
        String str;
        int i12;
        int i13;
        boolean z10;
        int i14;
        long j3;
        TL_stories.StoryItem storyItem;
        float f11;
        float f12;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        r11 = false;
        boolean z11 = false;
        switch (this.f31159a) {
            case 0:
                c5 c5Var = (c5) this.f31160b;
                c5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                c5Var.f31538w = false;
                eh.b bVar = c5Var.h;
                bVar.a((Bitmap) obj2);
                fh.d.c(bVar, c5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                k9 k9Var = (k9) this.f31160b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var = (org.telegram.ui.Components.j61) obj2;
                boolean isEmpty = k9Var.K.isEmpty();
                ArrayList arrayList2 = k9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.v51 c10 = org.telegram.ui.Components.v51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f27834q = true;
                    arrayList.add(c10);
                    if (!k9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.v51 c11 = org.telegram.ui.Components.v51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f27834q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.v51.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = k9Var.K;
                    int size = arrayList3.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj3 = arrayList3.get(i21);
                        i21++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = k9Var.getMessagesController().getChat(l4)) != null) {
                            n8 n8Var = new n8(k9Var, 0);
                            int i22 = i9.f33562a;
                            org.telegram.ui.Components.v51 J = org.telegram.ui.Components.v51.J(i9.class);
                            J.G = chat;
                            J.D = n8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.v51.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        g9 g9Var = (g9) obj4;
                        bi.n3 n3Var = new bi.n3(24, k9Var, g9Var);
                        int i23 = e9.f32123a;
                        org.telegram.ui.Components.v51 J2 = org.telegram.ui.Components.v51.J(e9.class);
                        J2.G = g9Var;
                        J2.D = n3Var;
                        J2.K(k9Var.l0(g9Var.f33046c));
                        arrayList.add(J2);
                    }
                    if (!k9Var.J) {
                        arrayList.add(org.telegram.ui.Components.v51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.v51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.v51.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                le leVar = (le) this.f31160b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var2 = (org.telegram.ui.Components.j61) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(leVar.f34686y0).getChat(Long.valueOf(-leVar.f34687z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(leVar.f34686y0).getChatFull(-leVar.f34687z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (leVar.f34667f1) {
                    arrayList4.add(org.telegram.ui.Components.v51.g(leVar.C0));
                    ra1 ra1Var2 = leVar.f34675o1;
                    if (ra1Var2 != null && !ra1Var2.f36320l) {
                        arrayList4.add(org.telegram.ui.Components.v51.h(5, i10, ra1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.v51.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    ra1 ra1Var3 = leVar.f34676p1;
                    if (ra1Var3 != null && !ra1Var3.f36320l) {
                        arrayList4.add(org.telegram.ui.Components.v51.h(2, i10, ra1Var3));
                        arrayList4.add(org.telegram.ui.Components.v51.A(-2, charSequence));
                    }
                }
                if (leVar.f34668g1 && (ra1Var = leVar.f34677q1) != null && !ra1Var.f36320l) {
                    arrayList4.add(org.telegram.ui.Components.v51.h(2, i10, ra1Var));
                    arrayList4.add(org.telegram.ui.Components.v51.A(-3, null));
                }
                if (leVar.f34678r1) {
                    arrayList4.add(org.telegram.ui.Components.v51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.v51.u(leVar.f34679s1));
                    arrayList4.add(org.telegram.ui.Components.v51.u(leVar.f34680t1));
                    arrayList4.add(org.telegram.ui.Components.v51.u(leVar.f34681u1));
                    arrayList4.add(org.telegram.ui.Components.v51.A(-4, leVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (leVar.f34667f1) {
                        arrayList4.add(org.telegram.ui.Components.v51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.v51.k(leVar.G0));
                        arrayList4.add(org.telegram.ui.Components.v51.A(-5, leVar.D0));
                        int i24 = MessagesController.getInstance(leVar.f34686y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (leVar.B0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(0, new jp0(i11, context, null, false));
                            uqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(uqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.v51 i25 = org.telegram.ui.Components.v51.i(1, string);
                        if (leVar.B0 >= i24 && leVar.f34673m1) {
                            z11 = true;
                        }
                        i25.K(z11);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.v51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (leVar.f34668g1) {
                        arrayList4.add(org.telegram.ui.Components.v51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.v51.j(3, leVar.M0));
                        arrayList4.add(org.telegram.ui.Components.v51.A(-6, leVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(leVar.f34686y0).getChat(Long.valueOf(-leVar.f34687z0))) && MessagesController.getInstance(leVar.f34686y0).starrefConnectAllowed) {
                    arrayList4.add(di.i.a(4, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uj, leVar.f34685x0), R.drawable.filled_earn_stars, yo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.v51.A(-7, null));
                }
                if (leVar.f34666e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.v51.p(leVar.f34666e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.v51.A(-10, null));
                    return;
                }
            case 3:
                fe feVar = (fe) this.f31160b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var3 = (org.telegram.ui.Components.j61) obj2;
                he heVar = feVar.f32791f;
                int i26 = feVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = heVar.f33359n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = xh.s7.f46039a;
                        org.telegram.ui.Components.v51 J3 = org.telegram.ui.Components.v51.J(xh.s7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f27834q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(heVar.f33360r)) {
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = heVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = xh.s7.f46039a;
                        org.telegram.ui.Components.v51 J4 = org.telegram.ui.Components.v51.J(xh.s7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f27834q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(heVar.f33358f)) {
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.v51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                yo yoVar = (yo) this.f31160b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    yoVar.getClass();
                    org.telegram.ui.Components.wc.a0(yoVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(yoVar.f39053k0);
                AndroidUtilities.removeFromParent(yoVar.f39050h0);
                AndroidUtilities.removeFromParent(yoVar.f39052j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new sq((wr) this.f31160b, 1), 1000L);
                return;
            case 6:
                ((og.u0) this.f31160b).q(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ts tsVar = (ts) this.f31160b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var4 = (org.telegram.ui.Components.j61) obj2;
                TLRPC.User user = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H));
                arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.V));
                arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.f37001b));
                arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.f37002c));
                if (TextUtils.isEmpty(tsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.v51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (tsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.v51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.v51.B(null));
                }
                if (tsVar.I && tsVar.K) {
                    org.telegram.ui.Components.v51 i29 = org.telegram.ui.Components.v51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(tsVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.v51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.d));
                com.google.android.gms.internal.vision.e2.w(R.string.AddNotesInfo, arrayList8);
                if (!tsVar.I) {
                    TLRPC.UserFull userFull = tsVar.getMessagesController().getUserFull(tsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.f37008x));
                    arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.f37009y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.v51.k(tsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.v51.B(null));
                    org.telegram.ui.Components.v51 e = org.telegram.ui.Components.v51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f27835r = true;
                    arrayList8.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.v51.B(charSequence2));
                if (tsVar.Y) {
                    AndroidUtilities.runOnUIThread(new ks(tsVar, user, 0));
                    tsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new ls(tsVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                tt.a((tt) this.f31160b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                pt ptVar = (pt) this.f31160b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                tt ttVar = ptVar.f35899a;
                rt rtVar = ttVar.f37026l;
                if (rtVar != null) {
                    String join = TextUtils.join("", ttVar.f37029o);
                    if (callback != null) {
                        pfVar = new pf(24, ptVar, callback);
                    } else {
                        pfVar = null;
                    }
                    rtVar.F(charSequence3, join, pfVar);
                    if (callback == null) {
                        ttVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.j61 j61Var5 = (org.telegram.ui.Components.j61) obj2;
                du.R((du) this.f31160b, (ArrayList) obj);
                return;
            case 11:
                wy wyVar = (wy) this.f31160b;
                Long l10 = (Long) obj2;
                wyVar.P1 = (Long) obj;
                wyVar.U4();
                return;
            case 12:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f31160b).run();
                return;
            case 13:
                final oz ozVar = (oz) this.f31160b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var6 = (org.telegram.ui.Components.j61) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(2);
                v51Var.f27829l = string2;
                v51Var.f27828k = i30;
                arrayList9.add(v51Var);
                org.telegram.ui.Components.v51 i31 = org.telegram.ui.Components.v51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(ozVar.f35648c);
                arrayList9.add(i31);
                if (ozVar.f35648c) {
                    arrayList9.add(org.telegram.ui.Components.v51.B(null));
                    arrayList9.add(org.telegram.ui.Components.v51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    oz ozVar2 = ozVar;
                                    ozVar2.d = true;
                                    ((nz) view.getParent()).a(true, true);
                                    bi.k6 k6Var = ozVar2.f35649f;
                                    if (k6Var != null) {
                                        k6Var.run(Boolean.valueOf(ozVar2.f35648c), Boolean.valueOf(ozVar2.d));
                                    }
                                    ozVar2.U();
                                    return;
                                default:
                                    oz ozVar3 = ozVar;
                                    ozVar3.d = false;
                                    ((nz) view.getParent()).a(false, true);
                                    bi.k6 k6Var2 = ozVar3.f35649f;
                                    if (k6Var2 != null) {
                                        k6Var2.run(Boolean.valueOf(ozVar3.f35648c), Boolean.valueOf(ozVar3.d));
                                    }
                                    ozVar3.U();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    oz ozVar2 = ozVar;
                                    ozVar2.d = true;
                                    ((nz) view.getParent()).a(true, true);
                                    bi.k6 k6Var = ozVar2.f35649f;
                                    if (k6Var != null) {
                                        k6Var.run(Boolean.valueOf(ozVar2.f35648c), Boolean.valueOf(ozVar2.d));
                                    }
                                    ozVar2.U();
                                    return;
                                default:
                                    oz ozVar3 = ozVar;
                                    ozVar3.d = false;
                                    ((nz) view.getParent()).a(false, true);
                                    bi.k6 k6Var2 = ozVar3.f35649f;
                                    if (k6Var2 != null) {
                                        k6Var2.run(Boolean.valueOf(ozVar3.f35648c), Boolean.valueOf(ozVar3.d));
                                    }
                                    ozVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = mz.f35078a;
                    org.telegram.ui.Components.v51 J5 = org.telegram.ui.Components.v51.J(mz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(ozVar.d);
                    arrayList9.add(J5);
                    com.google.android.gms.internal.vision.e2.w(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                fc0 fc0Var = (fc0) this.f31160b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                fc0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(fc0Var.f32779b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.r(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.a2.o(R.string.AIEditorStyleNotFound, fc0.b(), R.raw.error, 36);
                        return;
                    } else {
                        fc0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                ow0 ow0Var = (ow0) this.f31160b;
                eh.b bVar2 = ow0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                ow0Var.f35636s = (Bitmap) obj;
                Paint paint = new Paint(1);
                ow0Var.f35637w = paint;
                Bitmap bitmap2 = ow0Var.f35636s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                ow0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f7 = 0.05f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                ow0Var.f35637w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                ow0Var.f35638x = new Matrix();
                bVar2.a(bitmap);
                fh.d.c(bVar2, ow0Var.f35627c);
                ow0Var.G.d();
                return;
            case 16:
                vw0 vw0Var = (vw0) this.f31160b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var7 = (org.telegram.ui.Components.j61) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.v51 v51Var2 = new org.telegram.ui.Components.v51(2);
                v51Var2.f27829l = string3;
                v51Var2.f27828k = i33;
                arrayList10.add(v51Var2);
                org.telegram.ui.Components.v51 i34 = org.telegram.ui.Components.v51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(vw0Var.f37640r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.v51.A(2, null));
                if (vw0Var.f37640r) {
                    com.google.android.gms.internal.vision.e2.m(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.a8.a((int) vw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    js0 js0Var = new js0(1);
                    org.telegram.ui.Cells.z7 z7Var = new org.telegram.ui.Cells.z7();
                    z7Var.f20792c = a2;
                    z7Var.d = 20;
                    z7Var.e = js0Var;
                    vw0Var.f37636b.d((int) Utilities.clamp(vw0Var.f37641s, 10000L, 0L), z7Var, new u3(vw0Var, 15));
                    arrayList10.add(org.telegram.ui.Components.v51.j(3, vw0Var.f37636b));
                    if (vw0Var.f37641s > 0) {
                        str = vw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.v51.A(4, str));
                    TLRPC.Chat chat3 = vw0Var.getMessagesController().getChat(Long.valueOf(vw0Var.f37635a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        vw0Var.f37637c.setLink(vw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.m(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.v51.j(5, vw0Var.f37637c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f31160b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f31160b;
                Bitmap bitmap3 = (Bitmap) obj;
                eh.b bVar3 = profileActivity.f30460p6;
                bVar3.a((Bitmap) obj2);
                fh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                g41 g41Var = (g41) this.f31160b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var8 = (org.telegram.ui.Components.j61) obj2;
                org.telegram.ui.Components.r61 r61Var = g41Var.f32991f;
                h41 h41Var = g41Var.v;
                ArrayList arrayList12 = h41Var.h;
                u5 u5Var = g41Var.h;
                if (u5Var.getMeasuredHeight() <= 0) {
                    u5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.v51 C = org.telegram.ui.Components.v51.C(u5Var.getMeasuredHeight());
                C.d = -1;
                C.f27836s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((u5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = g41Var.f32989b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || g41Var.f32990c != null || g41Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || g41Var.f32990c != null) {
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(g41Var.getContext(), org.telegram.ui.ActionBar.j6.L6, 21, 0, 0, false, false, h41.u(h41Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = g41Var.f32989b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = g41Var.f32990c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(h41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5));
                        org.telegram.ui.Components.v51 k10 = org.telegram.ui.Components.v51.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (g41Var.f32989b != null) {
                        for (int i35 = 0; i35 < g41Var.f32989b.options.size(); i35++) {
                            org.telegram.ui.Components.v51 v51Var3 = new org.telegram.ui.Components.v51(30);
                            v51Var3.f27829l = g41Var.f32989b.options.get(i35).text;
                            v51Var3.f27828k = R.drawable.msg_arrowright;
                            v51Var3.d = i35;
                            arrayList11.add(v51Var3);
                            measuredHeight += 50;
                        }
                    } else if (g41Var.f32990c != null) {
                        for (int i36 = 0; i36 < g41Var.f32990c.options.size(); i36++) {
                            org.telegram.ui.Components.v51 v51Var4 = new org.telegram.ui.Components.v51(30);
                            v51Var4.f27829l = g41Var.f32990c.options.get(i36).text;
                            v51Var4.f27828k = R.drawable.msg_arrowright;
                            v51Var4.d = i36;
                            arrayList11.add(v51Var4);
                            measuredHeight += 50;
                        }
                    } else if (g41Var.d != null) {
                        if (g41Var.f32992n == null) {
                            f41 f41Var = new f41(g41Var, g41Var.getContext(), h41.v(h41Var));
                            g41Var.f32992n = f41Var;
                            f41Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.g3 g3Var = g41Var.f32992n.f19293b;
                        if (g41Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        g3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.v51 k11 = org.telegram.ui.Components.v51.k(g41Var.f32992n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = h41Var.f33273r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(h41.w(h41Var)).getChat(Long.valueOf(-j10)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        com.google.android.gms.internal.vision.e2.w(i13, arrayList11);
                        if (g41Var.f32993r == null) {
                            bi.d dVar = new bi.d(g41Var.getContext(), h41.x(h41Var), true);
                            g41Var.f32994s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(g41Var.getContext());
                            g41Var.f32993r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, h41.y(h41Var)));
                            g41Var.f32993r.addView(g41Var.f32994s, w7.a6.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(g41Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17929d7, h41.z(h41Var)));
                            g41Var.f32993r.addView(view, w7.a6.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        bi.d dVar2 = g41Var.f32994s;
                        if (!g41Var.d.optional && TextUtils.isEmpty(g41Var.f32992n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        g41Var.f32994s.setOnClickListener(new l60(g41Var, 28));
                        org.telegram.ui.Components.v51 k12 = org.telegram.ui.Components.v51.k(g41Var.f32993r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.v51) hc.b.i(1, arrayList11)).f27827j = true;
                    if (h41Var.d && g41Var.f32988a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(g41Var.getContext());
                        org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(new ColorDrawable(h41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7)), org.telegram.ui.ActionBar.j6.U0(g41Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17892b7, h41.A(h41Var))), 0, 0);
                        vqVar.f28580w = true;
                        frameLayout2.setBackground(vqVar);
                        org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(g41Var.getContext(), null);
                        m90Var.setTextSize(1, 14.0f);
                        m90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), h41.C(h41Var)));
                        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, h41.E(h41Var)));
                        m90Var.setGravity(17);
                        frameLayout2.addView(m90Var, w7.a6.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.v51 k13 = org.telegram.ui.Components.v51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (r61Var != null) {
                    if (h41.F(h41Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        r61Var.X2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    r61Var.X2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.j61 j61Var9 = (org.telegram.ui.Components.j61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.v51.k(((n41) this.f31160b).X));
                return;
            case 21:
                org.telegram.ui.Components.j61 j61Var10 = (org.telegram.ui.Components.j61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.v51.k(((x41) this.f31160b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f31160b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.j61 j61Var11 = (org.telegram.ui.Components.j61) obj2;
                v71.Q((v71) this.f31160b, (ArrayList) obj);
                return;
            case 24:
                u71 u71Var = (u71) this.f31160b;
                ArrayList arrayList13 = u71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = u71Var.f37142a;
                ArrayList arrayList14 = u71Var.d;
                if (tL_error5 != null) {
                    if (u71Var.f37147r) {
                        arrayList14.clear();
                        u71Var.f37147r = false;
                    }
                    u71Var.h = true;
                    u71Var.f37145f = false;
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
                if (u71Var.f37147r) {
                    arrayList14.clear();
                    u71Var.f37147r = false;
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
                    u71Var.h = true;
                }
                u71Var.f37145f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                z71 z71Var = (z71) this.f31160b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var12 = (org.telegram.ui.Components.j61) obj2;
                int i39 = z71Var.f39224b0;
                zh.a5 a5Var = z71Var.Z;
                if (a5Var != null) {
                    arrayList16.add(org.telegram.ui.Components.v51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = a5Var.f48240i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = mb1.f34902b;
                        org.telegram.ui.Components.v51 J6 = org.telegram.ui.Components.v51.J(mb1.class);
                        J6.f27838u = 1;
                        J6.f27842z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j3 = storyItem.f17435id;
                        } else {
                            j3 = -1;
                        }
                        J6.B = j3;
                        J6.f27824f = true;
                        J6.v = i39;
                        J6.K(z71Var.f39223a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f27838u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (a5Var.k() || !a5Var.f48249r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.v51 o9 = org.telegram.ui.Components.v51.o(i16, 34);
                                o9.f27838u = 1;
                                arrayList16.add(o9);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.v51.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.j61 j61Var13 = (org.telegram.ui.Components.j61) obj2;
                k91.b0((k91) this.f31160b, (ArrayList) obj);
                return;
            case 27:
                x91 x91Var = (x91) this.f31160b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.j61 j61Var14 = (org.telegram.ui.Components.j61) obj2;
                LinearLayout linearLayout = x91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.v51.k(linearLayout));
                }
                LinearLayout linearLayout2 = x91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.v51.k(linearLayout2));
                    return;
                }
                return;
            default:
                pe1 pe1Var = (pe1) this.f31160b;
                eh.b bVar4 = pe1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                pe1Var.f35818r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                pe1Var.v = paint2;
                Bitmap bitmap5 = pe1Var.f35818r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                pe1Var.f35819s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f11 = 0.05f;
                } else {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    f12 = -0.02f;
                } else {
                    f12 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f12);
                pe1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                pe1Var.f35820w = new Matrix();
                bVar4.a(bitmap4);
                fh.d.c(bVar4, pe1Var.f35810b);
                pe1Var.F.d();
                return;
        }
    }
}
