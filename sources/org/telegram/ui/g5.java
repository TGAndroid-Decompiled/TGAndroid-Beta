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
public final class g5 implements Utilities.Callback2 {
    public final int f37186a;
    public final Object f37187b;

    public g5(Object obj, int i10) {
        this.f37186a = i10;
        this.f37187b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        b91 b91Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.ui.Components.qy qyVar;
        float f7;
        float f10;
        String str;
        int i12;
        int i13;
        boolean z10;
        int i14;
        long j10;
        TL_stories.StoryItem storyItem;
        float f11;
        float f12;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        r9 = false;
        boolean z11 = false;
        switch (this.f37186a) {
            case 0:
                h5 h5Var = (h5) this.f37187b;
                h5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                h5Var.f37512w = false;
                gh.b bVar = h5Var.h;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, h5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                m9 m9Var = (m9) this.f37187b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.t61 t61Var = (org.telegram.ui.Components.t61) obj2;
                boolean isEmpty = m9Var.K.isEmpty();
                ArrayList arrayList2 = m9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.g61 c10 = org.telegram.ui.Components.g61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f26504q = true;
                    arrayList.add(c10);
                    if (!m9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.g61 c11 = org.telegram.ui.Components.g61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f26504q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.g61.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = m9Var.K;
                    int size = arrayList3.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj3 = arrayList3.get(i21);
                        i21++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = m9Var.getMessagesController().getChat(l4)) != null) {
                            p8 p8Var = new p8(m9Var, 0);
                            int i22 = k9.f38459a;
                            org.telegram.ui.Components.g61 J = org.telegram.ui.Components.g61.J(k9.class);
                            J.G = chat;
                            J.D = p8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.g61.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        i9 i9Var = (i9) obj4;
                        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(7, m9Var, i9Var);
                        int i23 = g9.f37233a;
                        org.telegram.ui.Components.g61 J2 = org.telegram.ui.Components.g61.J(g9.class);
                        J2.G = i9Var;
                        J2.D = s1Var;
                        J2.K(m9Var.l0(i9Var.f37914c));
                        arrayList.add(J2);
                    }
                    if (!m9Var.J) {
                        arrayList.add(org.telegram.ui.Components.g61.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.g61.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.g61.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ie ieVar = (ie) this.f37187b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.t61 t61Var2 = (org.telegram.ui.Components.t61) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(ieVar.f37977y0).getChat(Long.valueOf(-ieVar.f37978z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(ieVar.f37977y0).getChatFull(-ieVar.f37978z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (ieVar.f37958f1) {
                    arrayList4.add(org.telegram.ui.Components.g61.g(ieVar.C0));
                    b91 b91Var2 = ieVar.f37966o1;
                    if (b91Var2 != null && !b91Var2.f35559l) {
                        arrayList4.add(org.telegram.ui.Components.g61.h(5, i10, b91Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.g61.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    b91 b91Var3 = ieVar.f37967p1;
                    if (b91Var3 != null && !b91Var3.f35559l) {
                        arrayList4.add(org.telegram.ui.Components.g61.h(2, i10, b91Var3));
                        arrayList4.add(org.telegram.ui.Components.g61.A(-2, charSequence));
                    }
                }
                if (ieVar.f37959g1 && (b91Var = ieVar.f37968q1) != null && !b91Var.f35559l) {
                    arrayList4.add(org.telegram.ui.Components.g61.h(2, i10, b91Var));
                    arrayList4.add(org.telegram.ui.Components.g61.A(-3, null));
                }
                if (ieVar.f37969r1) {
                    arrayList4.add(org.telegram.ui.Components.g61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.g61.u(ieVar.f37970s1));
                    arrayList4.add(org.telegram.ui.Components.g61.u(ieVar.f37971t1));
                    arrayList4.add(org.telegram.ui.Components.g61.u(ieVar.f37972u1));
                    arrayList4.add(org.telegram.ui.Components.g61.A(-4, ieVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (ieVar.f37958f1) {
                        arrayList4.add(org.telegram.ui.Components.g61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.g61.k(ieVar.G0));
                        arrayList4.add(org.telegram.ui.Components.g61.A(-5, ieVar.D0));
                        int i24 = MessagesController.getInstance(ieVar.f37977y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (ieVar.B0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(0, new ro0(i11, context, null, false));
                            yqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(yqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.g61 i25 = org.telegram.ui.Components.g61.i(1, string);
                        if (ieVar.B0 >= i24 && ieVar.f37964m1) {
                            z11 = true;
                        }
                        i25.K(z11);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.g61.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (ieVar.f37959g1) {
                        arrayList4.add(org.telegram.ui.Components.g61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.g61.j(3, ieVar.M0));
                        arrayList4.add(org.telegram.ui.Components.g61.A(-6, ieVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(ieVar.f37977y0).getChat(Long.valueOf(-ieVar.f37978z0))) && MessagesController.getInstance(ieVar.f37977y0).starrefConnectAllowed) {
                    arrayList4.add(gi.h.a(4, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.uj, ieVar.f37976x0), R.drawable.filled_earn_stars, io.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.g61.A(-7, null));
                }
                if (ieVar.f37957e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.g61.p(ieVar.f37957e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.g61.A(-10, null));
                    return;
                }
            case 3:
                ce ceVar = (ce) this.f37187b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.t61 t61Var3 = (org.telegram.ui.Components.t61) obj2;
                ee eeVar = ceVar.f35949f;
                int i26 = ceVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = eeVar.f36646n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = ai.gd.f1376a;
                        org.telegram.ui.Components.g61 J3 = org.telegram.ui.Components.g61.J(ai.gd.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f26504q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(eeVar.f36647r)) {
                        arrayList5.add(org.telegram.ui.Components.g61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.g61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.g61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = eeVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = ai.gd.f1376a;
                        org.telegram.ui.Components.g61 J4 = org.telegram.ui.Components.g61.J(ai.gd.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f26504q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(eeVar.f36645f)) {
                        arrayList5.add(org.telegram.ui.Components.g61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.g61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.g61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                io ioVar = (io) this.f37187b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    ioVar.getClass();
                    org.telegram.ui.Components.xc.a0(ioVar).f0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(ioVar.f38038k0);
                AndroidUtilities.removeFromParent(ioVar.f38035h0);
                AndroidUtilities.removeFromParent(ioVar.f38037j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new cq((hr) this.f37187b, 1), 1000L);
                return;
            case 6:
                ((n4.s) this.f37187b).B(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                fs fsVar = (fs) this.f37187b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.t61 t61Var4 = (org.telegram.ui.Components.t61) obj2;
                TLRPC.User user = fsVar.getMessagesController().getUser(Long.valueOf(fsVar.H));
                arrayList8.add(org.telegram.ui.Components.g61.k(fsVar.V));
                arrayList8.add(org.telegram.ui.Components.g61.k(fsVar.f37067b));
                arrayList8.add(org.telegram.ui.Components.g61.k(fsVar.f37068c));
                if (TextUtils.isEmpty(fsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.g61.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (fsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.g61.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.g61.B(null));
                }
                if (fsVar.I && fsVar.K) {
                    org.telegram.ui.Components.g61 i29 = org.telegram.ui.Components.g61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(fsVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.g61.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.g61.k(fsVar.d));
                i2.e.B(R.string.AddNotesInfo, arrayList8);
                if (!fsVar.I) {
                    TLRPC.UserFull userFull = fsVar.getMessagesController().getUserFull(fsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.g61.k(fsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.g61.k(fsVar.f37074x));
                    arrayList8.add(org.telegram.ui.Components.g61.k(fsVar.f37075y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.g61.k(fsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.g61.B(null));
                    org.telegram.ui.Components.g61 e = org.telegram.ui.Components.g61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e.f26505r = true;
                    arrayList8.add(e);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.g61.B(charSequence2));
                if (fsVar.Y) {
                    AndroidUtilities.runOnUIThread(new wr(fsVar, user, 0));
                    fsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new xr(fsVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                et.a((et) this.f37187b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                at atVar = (at) this.f37187b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                et etVar = atVar.f35425a;
                ct ctVar = etVar.f36786l;
                if (ctVar != null) {
                    String join = TextUtils.join("", etVar.f36789o);
                    if (callback != null) {
                        qyVar = new org.telegram.ui.Components.qy(7, atVar, callback);
                    } else {
                        qyVar = null;
                    }
                    ctVar.t(charSequence3, join, qyVar);
                    if (callback == null) {
                        etVar.p();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.t61 t61Var5 = (org.telegram.ui.Components.t61) obj2;
                qt.S((qt) this.f37187b, (ArrayList) obj);
                return;
            case 11:
                cy cyVar = (cy) this.f37187b;
                Long l10 = (Long) obj2;
                cyVar.P1 = (Long) obj;
                cyVar.S4();
                return;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f37187b).run();
                return;
            case 13:
                final uy uyVar = (uy) this.f37187b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.t61 t61Var6 = (org.telegram.ui.Components.t61) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(2);
                g61Var.f26499l = string2;
                g61Var.f26498k = i30;
                arrayList9.add(g61Var);
                org.telegram.ui.Components.g61 i31 = org.telegram.ui.Components.g61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(uyVar.f42067c);
                arrayList9.add(i31);
                if (uyVar.f42067c) {
                    arrayList9.add(org.telegram.ui.Components.g61.B(null));
                    arrayList9.add(org.telegram.ui.Components.g61.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    uy uyVar2 = uyVar;
                                    uyVar2.d = true;
                                    ((ty) view.getParent()).a(true, true);
                                    ai.q5 q5Var = uyVar2.f42068f;
                                    if (q5Var != null) {
                                        q5Var.run(Boolean.valueOf(uyVar2.f42067c), Boolean.valueOf(uyVar2.d));
                                    }
                                    uyVar2.U();
                                    return;
                                default:
                                    uy uyVar3 = uyVar;
                                    uyVar3.d = false;
                                    ((ty) view.getParent()).a(false, true);
                                    ai.q5 q5Var2 = uyVar3.f42068f;
                                    if (q5Var2 != null) {
                                        q5Var2.run(Boolean.valueOf(uyVar3.f42067c), Boolean.valueOf(uyVar3.d));
                                    }
                                    uyVar3.U();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    uy uyVar2 = uyVar;
                                    uyVar2.d = true;
                                    ((ty) view.getParent()).a(true, true);
                                    ai.q5 q5Var = uyVar2.f42068f;
                                    if (q5Var != null) {
                                        q5Var.run(Boolean.valueOf(uyVar2.f42067c), Boolean.valueOf(uyVar2.d));
                                    }
                                    uyVar2.U();
                                    return;
                                default:
                                    uy uyVar3 = uyVar;
                                    uyVar3.d = false;
                                    ((ty) view.getParent()).a(false, true);
                                    ai.q5 q5Var2 = uyVar3.f42068f;
                                    if (q5Var2 != null) {
                                        q5Var2.run(Boolean.valueOf(uyVar3.f42067c), Boolean.valueOf(uyVar3.d));
                                    }
                                    uyVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = sy.f41546a;
                    org.telegram.ui.Components.g61 J5 = org.telegram.ui.Components.g61.J(sy.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(uyVar.d);
                    arrayList9.add(J5);
                    i2.e.B(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                ib0 ib0Var = (ib0) this.f37187b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ib0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(ib0Var.f37935b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.g0.q(R.string.AIEditorStyleNotFound, ib0.d(), R.raw.error, 36);
                        return;
                    } else {
                        ib0.d().f0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                qv0 qv0Var = (qv0) this.f37187b;
                gh.b bVar2 = qv0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                qv0Var.f40994s = (Bitmap) obj;
                Paint paint = new Paint(1);
                qv0Var.f40995w = paint;
                Bitmap bitmap2 = qv0Var.f40994s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                qv0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = 0.05f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                qv0Var.f40995w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                qv0Var.f40996x = new Matrix();
                bVar2.a(bitmap);
                hh.d.c(bVar2, qv0Var.f40985c);
                qv0Var.G.d();
                return;
            case 16:
                xv0 xv0Var = (xv0) this.f37187b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.t61 t61Var7 = (org.telegram.ui.Components.t61) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.g61 g61Var2 = new org.telegram.ui.Components.g61(2);
                g61Var2.f26499l = string3;
                g61Var2.f26498k = i33;
                arrayList10.add(g61Var2);
                org.telegram.ui.Components.g61 i34 = org.telegram.ui.Components.g61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(xv0Var.f43274r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.g61.A(2, null));
                if (xv0Var.f43274r) {
                    i2.e.p(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.y7.a((int) xv0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    fk0 fk0Var = new fk0(5);
                    org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7();
                    x7Var.f23809c = a2;
                    x7Var.d = 20;
                    x7Var.e = fk0Var;
                    xv0Var.f43270b.d((int) Utilities.clamp(xv0Var.f43275s, 10000L, 0L), x7Var, new v3(xv0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.g61.j(3, xv0Var.f43270b));
                    if (xv0Var.f43275s > 0) {
                        str = xv0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.g61.A(4, str));
                    TLRPC.Chat chat3 = xv0Var.getMessagesController().getChat(Long.valueOf(xv0Var.f43269a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        xv0Var.f43271c.setLink(xv0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        i2.e.p(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.g61.j(5, xv0Var.f43271c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37187b;
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
                ProfileActivity profileActivity = (ProfileActivity) this.f37187b;
                Bitmap bitmap3 = (Bitmap) obj;
                gh.b bVar3 = profileActivity.f33699r6;
                bVar3.a((Bitmap) obj2);
                hh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.f33707s6.d();
                return;
            case 19:
                n21 n21Var = (n21) this.f37187b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.t61 t61Var8 = (org.telegram.ui.Components.t61) obj2;
                org.telegram.ui.Components.b71 b71Var = n21Var.f39395f;
                o21 o21Var = n21Var.v;
                ArrayList arrayList12 = o21Var.h;
                ai.n5 n5Var = n21Var.h;
                if (n5Var.getMeasuredHeight() <= 0) {
                    n5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.g61 C = org.telegram.ui.Components.g61.C(n5Var.getMeasuredHeight());
                C.d = -1;
                C.f26506s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((n5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = n21Var.f39393b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || n21Var.f39394c != null || n21Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || n21Var.f39394c != null) {
                        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(n21Var.getContext(), org.telegram.ui.ActionBar.h6.L6, 21, 0, 0, false, false, o21.w(o21Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = n21Var.f39393b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            l4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = n21Var.f39394c;
                            if (tL_reportResultChooseOption != null) {
                                l4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        l4Var.setBackgroundColor(o21Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21060h5));
                        org.telegram.ui.Components.g61 k10 = org.telegram.ui.Components.g61.k(l4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (n21Var.f39393b != null) {
                        for (int i35 = 0; i35 < n21Var.f39393b.options.size(); i35++) {
                            org.telegram.ui.Components.g61 g61Var3 = new org.telegram.ui.Components.g61(30);
                            g61Var3.f26499l = n21Var.f39393b.options.get(i35).text;
                            g61Var3.f26498k = R.drawable.msg_arrowright;
                            g61Var3.d = i35;
                            arrayList11.add(g61Var3);
                            measuredHeight += 50;
                        }
                    } else if (n21Var.f39394c != null) {
                        for (int i36 = 0; i36 < n21Var.f39394c.options.size(); i36++) {
                            org.telegram.ui.Components.g61 g61Var4 = new org.telegram.ui.Components.g61(30);
                            g61Var4.f26499l = n21Var.f39394c.options.get(i36).text;
                            g61Var4.f26498k = R.drawable.msg_arrowright;
                            g61Var4.d = i36;
                            arrayList11.add(g61Var4);
                            measuredHeight += 50;
                        }
                    } else if (n21Var.d != null) {
                        if (n21Var.f39396n == null) {
                            m21 m21Var = new m21(n21Var, n21Var.getContext(), o21.x(o21Var));
                            n21Var.f39396n = m21Var;
                            m21Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.g3 g3Var = n21Var.f39396n.f22401b;
                        if (n21Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        g3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.g61 k11 = org.telegram.ui.Components.g61.k(n21Var.f39396n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j11 = o21Var.f39745r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j11)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(o21.y(o21Var)).getChat(Long.valueOf(-j11)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        i2.e.B(i13, arrayList11);
                        if (n21Var.f39397r == null) {
                            ei.d dVar = new ei.d(n21Var.getContext(), o21.z(o21Var), true);
                            n21Var.f39398s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(n21Var.getContext());
                            n21Var.f39397r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21060h5, o21.A(o21Var)));
                            n21Var.f39397r.addView(n21Var.f39398s, w7.z5.d(-1, 48.0f, 119, 12.0f, 12.0f, 12.0f, 12.0f));
                            View view = new View(n21Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20990d7, o21.B(o21Var)));
                            n21Var.f39397r.addView(view, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ei.d dVar2 = n21Var.f39398s;
                        if (!n21Var.d.optional && TextUtils.isEmpty(n21Var.f39396n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        n21Var.f39398s.setOnClickListener(new s50(n21Var, 27));
                        org.telegram.ui.Components.g61 k12 = org.telegram.ui.Components.g61.k(n21Var.f39397r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.g61) i2.e.h(1, arrayList11)).f26497j = true;
                    if (o21Var.d && n21Var.f39392a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(n21Var.getContext());
                        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(o21Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20931a7)), org.telegram.ui.ActionBar.h6.V0(n21Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20951b7, o21.C(o21Var))), 0, 0);
                        zqVar.f33023w = true;
                        frameLayout2.setBackground(zqVar);
                        org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(n21Var.getContext(), null);
                        x90Var.setTextSize(1, 14.0f);
                        x90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), o21.D(o21Var)));
                        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A6, o21.F(o21Var)));
                        x90Var.setGravity(17);
                        frameLayout2.addView(x90Var, w7.z5.d(-1, -2.0f, 17, 16.0f, 16.0f, 16.0f, 16.0f));
                        org.telegram.ui.Components.g61 k13 = org.telegram.ui.Components.g61.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (b71Var != null) {
                    if (o21.G(o21Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        b71Var.V2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    b71Var.V2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.t61 t61Var9 = (org.telegram.ui.Components.t61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.g61.k(((t21) this.f37187b).X));
                return;
            case 21:
                org.telegram.ui.Components.t61 t61Var10 = (org.telegram.ui.Components.t61) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.g61.k(((h31) this.f37187b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f37187b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.t61 t61Var11 = (org.telegram.ui.Components.t61) obj2;
                h61.R((h61) this.f37187b, (ArrayList) obj);
                return;
            case 24:
                g61 g61Var5 = (g61) this.f37187b;
                ArrayList arrayList13 = g61Var5.e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = g61Var5.f37200a;
                ArrayList arrayList14 = g61Var5.d;
                if (tL_error5 != null) {
                    if (g61Var5.f37205r) {
                        arrayList14.clear();
                        g61Var5.f37205r = false;
                    }
                    g61Var5.h = true;
                    g61Var5.f37203f = false;
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
                if (g61Var5.f37205r) {
                    arrayList14.clear();
                    g61Var5.f37205r = false;
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
                    g61Var5.h = true;
                }
                g61Var5.f37203f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                k61 k61Var = (k61) this.f37187b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.t61 t61Var12 = (org.telegram.ui.Components.t61) obj2;
                int i39 = k61Var.f38422b0;
                ci.a7 a7Var = k61Var.Z;
                if (a7Var != null) {
                    arrayList16.add(org.telegram.ui.Components.g61.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = a7Var.f5151i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = w91.f42513b;
                        org.telegram.ui.Components.g61 J6 = org.telegram.ui.Components.g61.J(w91.class);
                        J6.f26508u = 1;
                        J6.f26512z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j10 = storyItem.f20509id;
                        } else {
                            j10 = -1;
                        }
                        J6.B = j10;
                        J6.f26494f = true;
                        J6.v = i39;
                        J6.K(k61Var.f38421a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f26508u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (a7Var.k() || !a7Var.f5160r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.g61 o10 = org.telegram.ui.Components.g61.o(i16, 34);
                                o10.f26508u = 1;
                                arrayList16.add(o10);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.g61.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.t61 t61Var13 = (org.telegram.ui.Components.t61) obj2;
                x71.b0((x71) this.f37187b, (ArrayList) obj);
                return;
            case 27:
                h81 h81Var = (h81) this.f37187b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.t61 t61Var14 = (org.telegram.ui.Components.t61) obj2;
                LinearLayout linearLayout = h81Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.g61.k(linearLayout));
                }
                LinearLayout linearLayout2 = h81Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.g61.k(linearLayout2));
                    return;
                }
                return;
            default:
                yc1 yc1Var = (yc1) this.f37187b;
                gh.b bVar4 = yc1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                yc1Var.f43448r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                yc1Var.v = paint2;
                Bitmap bitmap5 = yc1Var.f43448r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                yc1Var.f43449s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f11 = 0.05f;
                } else {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f12 = -0.02f;
                } else {
                    f12 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f12);
                yc1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                yc1Var.f43450w = new Matrix();
                bVar4.a(bitmap4);
                hh.d.c(bVar4, yc1Var.f43440b);
                yc1Var.F.d();
                return;
        }
    }
}
