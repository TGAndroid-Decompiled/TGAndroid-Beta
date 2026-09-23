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
    public final int f32257a;
    public final Object f32258b;

    public c5(Object obj, int i10) {
        this.f32257a = i10;
        this.f32258b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        da1 da1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        dt dtVar;
        float f7;
        String str;
        int i12;
        int i13;
        boolean z10;
        int i14;
        long j3;
        TL_stories.StoryItem storyItem;
        float f10;
        float f11 = 0.25f;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        r9 = false;
        boolean z11 = false;
        switch (this.f32257a) {
            case 0:
                d5 d5Var = (d5) this.f32258b;
                d5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                d5Var.f32513w = false;
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
                k9 k9Var = (k9) this.f32258b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj2;
                boolean isEmpty = k9Var.K.isEmpty();
                ArrayList arrayList2 = k9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.h51 c10 = org.telegram.ui.Components.h51.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f24512q = true;
                    arrayList.add(c10);
                    if (!k9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.h51 c11 = org.telegram.ui.Components.h51.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f24512q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.h51.B(null));
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
                            int i22 = i9.f34074a;
                            org.telegram.ui.Components.h51 J = org.telegram.ui.Components.h51.J(i9.class);
                            J.G = chat;
                            J.D = n8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.h51.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        g9 g9Var = (g9) obj4;
                        ai.f2 f2Var = new ai.f2(27, k9Var, g9Var);
                        int i23 = e9.f32849a;
                        org.telegram.ui.Components.h51 J2 = org.telegram.ui.Components.h51.J(e9.class);
                        J2.G = g9Var;
                        J2.D = f2Var;
                        J2.K(k9Var.l0(g9Var.f33490c));
                        arrayList.add(J2);
                    }
                    if (!k9Var.J) {
                        arrayList.add(org.telegram.ui.Components.h51.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.h51.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.h51.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                je jeVar = (je) this.f32258b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var2 = (org.telegram.ui.Components.v51) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(jeVar.f34440y0).getChat(Long.valueOf(-jeVar.f34441z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(jeVar.f34440y0).getChatFull(-jeVar.f34441z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (jeVar.f34421f1) {
                    arrayList4.add(org.telegram.ui.Components.h51.g(jeVar.C0));
                    da1 da1Var2 = jeVar.f34429o1;
                    if (da1Var2 != null && !da1Var2.f32559l) {
                        arrayList4.add(org.telegram.ui.Components.h51.h(5, i10, da1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.h51.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    da1 da1Var3 = jeVar.f34430p1;
                    if (da1Var3 != null && !da1Var3.f32559l) {
                        arrayList4.add(org.telegram.ui.Components.h51.h(2, i10, da1Var3));
                        arrayList4.add(org.telegram.ui.Components.h51.A(-2, charSequence));
                    }
                }
                if (jeVar.f34422g1 && (da1Var = jeVar.f34431q1) != null && !da1Var.f32559l) {
                    arrayList4.add(org.telegram.ui.Components.h51.h(2, i10, da1Var));
                    arrayList4.add(org.telegram.ui.Components.h51.A(-3, null));
                }
                if (jeVar.f34432r1) {
                    arrayList4.add(org.telegram.ui.Components.h51.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.h51.u(jeVar.f34433s1));
                    arrayList4.add(org.telegram.ui.Components.h51.u(jeVar.f34434t1));
                    arrayList4.add(org.telegram.ui.Components.h51.u(jeVar.f34435u1));
                    arrayList4.add(org.telegram.ui.Components.h51.A(-4, jeVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (jeVar.f34421f1) {
                        arrayList4.add(org.telegram.ui.Components.h51.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.h51.k(jeVar.G0));
                        arrayList4.add(org.telegram.ui.Components.h51.A(-5, jeVar.D0));
                        int i24 = MessagesController.getInstance(jeVar.f34440y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (jeVar.B0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(0, new dp0(i11, context, null, false));
                            pqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(pqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.h51 i25 = org.telegram.ui.Components.h51.i(1, string);
                        if (jeVar.B0 >= i24 && jeVar.f34427m1) {
                            z11 = true;
                        }
                        i25.K(z11);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.h51.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (jeVar.f34422g1) {
                        arrayList4.add(org.telegram.ui.Components.h51.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.h51.j(3, jeVar.M0));
                        arrayList4.add(org.telegram.ui.Components.h51.A(-6, jeVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(jeVar.f34440y0).getChat(Long.valueOf(-jeVar.f34441z0))) && MessagesController.getInstance(jeVar.f34440y0).starrefConnectAllowed) {
                    arrayList4.add(ei.h.a(4, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.uj, jeVar.f34439x0), R.drawable.filled_earn_stars, so.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.h51.A(-7, null));
                }
                if (jeVar.f34420e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.h51.p(jeVar.f34420e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.h51.A(-10, null));
                    return;
                }
            case 3:
                de deVar = (de) this.f32258b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var3 = (org.telegram.ui.Components.v51) obj2;
                fe feVar = deVar.f32618f;
                int i26 = deVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = feVar.f33295n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = yh.p7.f47566a;
                        org.telegram.ui.Components.h51 J3 = org.telegram.ui.Components.h51.J(yh.p7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f24512q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(feVar.f33296r)) {
                        arrayList5.add(org.telegram.ui.Components.h51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.h51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.h51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = feVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = yh.p7.f47566a;
                        org.telegram.ui.Components.h51 J4 = org.telegram.ui.Components.h51.J(yh.p7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f24512q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(feVar.f33294f)) {
                        arrayList5.add(org.telegram.ui.Components.h51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.h51.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.h51.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                so soVar = (so) this.f32258b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    soVar.getClass();
                    org.telegram.ui.Components.xc.a0(soVar).d0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(soVar.f37357k0);
                AndroidUtilities.removeFromParent(soVar.f37354h0);
                AndroidUtilities.removeFromParent(soVar.f37356j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new mq((qr) this.f32258b, 1), 1000L);
                return;
            case 6:
                ((of.b) this.f32258b).Q(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                ns nsVar = (ns) this.f32258b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var4 = (org.telegram.ui.Components.v51) obj2;
                TLRPC.User user = nsVar.getMessagesController().getUser(Long.valueOf(nsVar.H));
                arrayList8.add(org.telegram.ui.Components.h51.k(nsVar.V));
                arrayList8.add(org.telegram.ui.Components.h51.k(nsVar.f35587b));
                arrayList8.add(org.telegram.ui.Components.h51.k(nsVar.f35588c));
                if (TextUtils.isEmpty(nsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.h51.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (nsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.h51.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.h51.B(null));
                }
                if (nsVar.I && nsVar.K) {
                    org.telegram.ui.Components.h51 i29 = org.telegram.ui.Components.h51.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(nsVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.h51.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.h51.k(nsVar.d));
                hg.c.p(R.string.AddNotesInfo, arrayList8);
                if (!nsVar.I) {
                    TLRPC.UserFull userFull = nsVar.getMessagesController().getUserFull(nsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.h51.k(nsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.h51.k(nsVar.f35594x));
                    arrayList8.add(org.telegram.ui.Components.h51.k(nsVar.f35595y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.h51.k(nsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.h51.B(null));
                    org.telegram.ui.Components.h51 e = org.telegram.ui.Components.h51.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f24513r = true;
                    arrayList8.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.h51.B(charSequence2));
                if (nsVar.Y) {
                    AndroidUtilities.runOnUIThread(new es(nsVar, user, 0));
                    nsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new fs(nsVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                pt.a((pt) this.f32258b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                lt ltVar = (lt) this.f32258b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                pt ptVar = ltVar.f35086a;
                nt ntVar = ptVar.f36193l;
                if (ntVar != null) {
                    String join = TextUtils.join("", ptVar.f36196o);
                    if (callback != null) {
                        dtVar = new dt(1, ltVar, callback);
                    } else {
                        dtVar = null;
                    }
                    ntVar.f(charSequence3, join, dtVar);
                    if (callback == null) {
                        ptVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.v51 v51Var5 = (org.telegram.ui.Components.v51) obj2;
                zt.R((zt) this.f32258b, (ArrayList) obj);
                return;
            case 11:
                ry ryVar = (ry) this.f32258b;
                Long l10 = (Long) obj2;
                ryVar.P1 = (Long) obj;
                ryVar.U4();
                return;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f32258b).run();
                return;
            case 13:
                final jz jzVar = (jz) this.f32258b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var6 = (org.telegram.ui.Components.v51) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(2);
                h51Var.f24507l = string2;
                h51Var.f24506k = i30;
                arrayList9.add(h51Var);
                org.telegram.ui.Components.h51 i31 = org.telegram.ui.Components.h51.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(jzVar.f34533c);
                arrayList9.add(i31);
                if (jzVar.f34533c) {
                    arrayList9.add(org.telegram.ui.Components.h51.B(null));
                    arrayList9.add(org.telegram.ui.Components.h51.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    jz jzVar2 = jzVar;
                                    jzVar2.d = true;
                                    ((iz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = jzVar2.f34534f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(jzVar2.f34533c), Boolean.valueOf(jzVar2.d));
                                    }
                                    jzVar2.U();
                                    return;
                                default:
                                    jz jzVar3 = jzVar;
                                    jzVar3.d = false;
                                    ((iz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = jzVar3.f34534f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(jzVar3.f34533c), Boolean.valueOf(jzVar3.d));
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
                                    ai.m0 m0Var = jzVar2.f34534f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(jzVar2.f34533c), Boolean.valueOf(jzVar2.d));
                                    }
                                    jzVar2.U();
                                    return;
                                default:
                                    jz jzVar3 = jzVar;
                                    jzVar3.d = false;
                                    ((iz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = jzVar3.f34534f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(jzVar3.f34533c), Boolean.valueOf(jzVar3.d));
                                    }
                                    jzVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = hz.f33950a;
                    org.telegram.ui.Components.h51 J5 = org.telegram.ui.Components.h51.J(hz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(jzVar.d);
                    arrayList9.add(J5);
                    hg.c.p(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                ac0 ac0Var = (ac0) this.f32258b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ac0Var.a();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(ac0Var.f31732b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.z0.o(R.string.AIEditorStyleNotFound, ac0.b(), R.raw.error, 36);
                        return;
                    } else {
                        ac0.b().d0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                fw0 fw0Var = (fw0) this.f32258b;
                fh.b bVar2 = fw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                fw0Var.f33384s = (Bitmap) obj;
                Paint paint = new Paint(1);
                fw0Var.f33385w = paint;
                Bitmap bitmap2 = fw0Var.f33384s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                fw0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f11);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = -0.02f;
                } else {
                    f7 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f7);
                fw0Var.f33385w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                fw0Var.f33386x = new Matrix();
                bVar2.a(bitmap);
                gh.d.c(bVar2, fw0Var.f33375c);
                fw0Var.G.d();
                return;
            case 16:
                mw0 mw0Var = (mw0) this.f32258b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var7 = (org.telegram.ui.Components.v51) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.h51 h51Var2 = new org.telegram.ui.Components.h51(2);
                h51Var2.f24507l = string3;
                h51Var2.f24506k = i33;
                arrayList10.add(h51Var2);
                org.telegram.ui.Components.h51 i34 = org.telegram.ui.Components.h51.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(mw0Var.f35401r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.h51.A(2, null));
                if (mw0Var.f35401r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.a8.a((int) mw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    rs rsVar = new rs(16);
                    org.telegram.ui.Cells.z7 z7Var = new org.telegram.ui.Cells.z7();
                    z7Var.f21680c = a2;
                    z7Var.d = 20;
                    z7Var.e = rsVar;
                    mw0Var.f35397b.d((int) Utilities.clamp(mw0Var.f35402s, 10000L, 0L), z7Var, new t3(mw0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.h51.j(3, mw0Var.f35397b));
                    if (mw0Var.f35402s > 0) {
                        str = mw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.h51.A(4, str));
                    TLRPC.Chat chat3 = mw0Var.getMessagesController().getChat(Long.valueOf(mw0Var.f35396a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        mw0Var.f35398c.setLink(mw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.h51.j(5, mw0Var.f35398c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f32258b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f32258b;
                Bitmap bitmap3 = (Bitmap) obj;
                fh.b bVar3 = profileActivity.f31319p6;
                bVar3.a((Bitmap) obj2);
                gh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                t31 t31Var = (t31) this.f32258b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var8 = (org.telegram.ui.Components.v51) obj2;
                org.telegram.ui.Components.d61 d61Var = t31Var.f37515f;
                u31 u31Var = t31Var.v;
                ArrayList arrayList12 = u31Var.h;
                u5 u5Var = t31Var.h;
                if (u5Var.getMeasuredHeight() <= 0) {
                    u5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.h51 C = org.telegram.ui.Components.h51.C(u5Var.getMeasuredHeight());
                C.d = -1;
                C.f24514s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((u5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = t31Var.f37513b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || t31Var.f37514c != null || t31Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || t31Var.f37514c != null) {
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(t31Var.getContext(), org.telegram.ui.ActionBar.h6.L6, 21, 0, 0, false, false, u31.u(u31Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = t31Var.f37513b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = t31Var.f37514c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(u31Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18859h5));
                        org.telegram.ui.Components.h51 k10 = org.telegram.ui.Components.h51.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (t31Var.f37513b != null) {
                        for (int i35 = 0; i35 < t31Var.f37513b.options.size(); i35++) {
                            org.telegram.ui.Components.h51 h51Var3 = new org.telegram.ui.Components.h51(30);
                            h51Var3.f24507l = t31Var.f37513b.options.get(i35).text;
                            h51Var3.f24506k = R.drawable.msg_arrowright;
                            h51Var3.d = i35;
                            arrayList11.add(h51Var3);
                            measuredHeight += 50;
                        }
                    } else if (t31Var.f37514c != null) {
                        for (int i36 = 0; i36 < t31Var.f37514c.options.size(); i36++) {
                            org.telegram.ui.Components.h51 h51Var4 = new org.telegram.ui.Components.h51(30);
                            h51Var4.f24507l = t31Var.f37514c.options.get(i36).text;
                            h51Var4.f24506k = R.drawable.msg_arrowright;
                            h51Var4.d = i36;
                            arrayList11.add(h51Var4);
                            measuredHeight += 50;
                        }
                    } else if (t31Var.d != null) {
                        if (t31Var.f37516n == null) {
                            s31 s31Var = new s31(t31Var, t31Var.getContext(), u31.v(u31Var));
                            t31Var.f37516n = s31Var;
                            s31Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.g3 g3Var = t31Var.f37516n.f20177b;
                        if (t31Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        g3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.h51 k11 = org.telegram.ui.Components.h51.k(t31Var.f37516n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = u31Var.f37896r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(u31.w(u31Var)).getChat(Long.valueOf(-j10)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        hg.c.p(i13, arrayList11);
                        if (t31Var.f37517r == null) {
                            ci.d dVar = new ci.d(t31Var.getContext(), u31.x(u31Var), true);
                            t31Var.f37518s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(t31Var.getContext());
                            t31Var.f37517r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18859h5, u31.y(u31Var)));
                            t31Var.f37517r.addView(t31Var.f37518s, w7.x5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(t31Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18790d7, u31.z(u31Var)));
                            t31Var.f37517r.addView(view, w7.x5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ci.d dVar2 = t31Var.f37518s;
                        if (!t31Var.d.optional && TextUtils.isEmpty(t31Var.f37516n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        t31Var.f37518s.setOnClickListener(new h60(t31Var, 28));
                        org.telegram.ui.Components.h51 k12 = org.telegram.ui.Components.h51.k(t31Var.f37517r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.h51) hg.c.h(1, arrayList11)).f24505j = true;
                    if (u31Var.d && t31Var.f37512a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(t31Var.getContext());
                        org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(new ColorDrawable(u31Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18733a7)), org.telegram.ui.ActionBar.h6.U0(t31Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18753b7, u31.A(u31Var))), 0, 0);
                        qqVar.f27431w = true;
                        frameLayout2.setBackground(qqVar);
                        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(t31Var.getContext(), null);
                        d90Var.setTextSize(1, 14.0f);
                        d90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), u31.B(u31Var)));
                        d90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A6, u31.F(u31Var)));
                        d90Var.setGravity(17);
                        frameLayout2.addView(d90Var, w7.x5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.h51 k13 = org.telegram.ui.Components.h51.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (d61Var != null) {
                    if (u31.G(u31Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        d61Var.X2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    d61Var.X2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.v51 v51Var9 = (org.telegram.ui.Components.v51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.h51.k(((a41) this.f32258b).X));
                return;
            case 21:
                org.telegram.ui.Components.v51 v51Var10 = (org.telegram.ui.Components.v51) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.h51.k(((k41) this.f32258b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f32258b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.v51 v51Var11 = (org.telegram.ui.Components.v51) obj2;
                j71.Q((j71) this.f32258b, (ArrayList) obj);
                return;
            case 24:
                i71 i71Var = (i71) this.f32258b;
                ArrayList arrayList13 = i71Var.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = i71Var.f34053a;
                ArrayList arrayList14 = i71Var.d;
                if (tL_error5 != null) {
                    if (i71Var.f34058r) {
                        arrayList14.clear();
                        i71Var.f34058r = false;
                    }
                    i71Var.h = true;
                    i71Var.f34056f = false;
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
                if (i71Var.f34058r) {
                    arrayList14.clear();
                    i71Var.f34058r = false;
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
                    i71Var.h = true;
                }
                i71Var.f34056f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                m71 m71Var = (m71) this.f32258b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var12 = (org.telegram.ui.Components.v51) obj2;
                int i39 = m71Var.f35168b0;
                ai.d9 d9Var = m71Var.Z;
                if (d9Var != null) {
                    arrayList16.add(org.telegram.ui.Components.h51.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = d9Var.f725i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = ya1.f39779b;
                        org.telegram.ui.Components.h51 J6 = org.telegram.ui.Components.h51.J(ya1.class);
                        J6.f24516u = 1;
                        J6.f24520z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j3 = storyItem.f18318id;
                        } else {
                            j3 = -1;
                        }
                        J6.B = j3;
                        J6.f24502f = true;
                        J6.v = i39;
                        J6.K(m71Var.f35167a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f24516u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (d9Var.k() || !d9Var.f734r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.h51 o9 = org.telegram.ui.Components.h51.o(i16, 34);
                                o9.f24516u = 1;
                                arrayList16.add(o9);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.h51.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.v51 v51Var13 = (org.telegram.ui.Components.v51) obj2;
                x81.b0((x81) this.f32258b, (ArrayList) obj);
                return;
            case 27:
                j91 j91Var = (j91) this.f32258b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.v51 v51Var14 = (org.telegram.ui.Components.v51) obj2;
                LinearLayout linearLayout = j91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.h51.k(linearLayout));
                }
                LinearLayout linearLayout2 = j91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.h51.k(linearLayout2));
                    return;
                }
                return;
            default:
                de1 de1Var = (de1) this.f32258b;
                fh.b bVar4 = de1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                de1Var.f32631r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                de1Var.v = paint2;
                Bitmap bitmap5 = de1Var.f32631r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                de1Var.f32632s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f11 = 0.05f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f10);
                de1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                de1Var.f32633w = new Matrix();
                bVar4.a(bitmap4);
                gh.d.c(bVar4, de1Var.f32623b);
                de1Var.F.d();
                return;
        }
    }
}
