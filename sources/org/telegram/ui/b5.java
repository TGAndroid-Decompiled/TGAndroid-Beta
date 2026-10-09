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
    public final int f36137a;
    public final Object f36138b;

    public b5(Object obj, int i10) {
        this.f36137a = i10;
        this.f36138b = obj;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        TLRPC.Chat chat;
        int i10;
        int i11;
        na1 na1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ft ftVar;
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
        switch (this.f36137a) {
            case 0:
                c5 c5Var = (c5) this.f36138b;
                c5Var.v.setBackground(new BitmapDrawable((Bitmap) obj));
                c5Var.f36525w = false;
                fh.b bVar = c5Var.h;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, c5Var);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c5Var.d;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.invalidate();
                    return;
                }
                return;
            case 1:
                j9 j9Var = (j9) this.f36138b;
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.Components.c71 c71Var = (org.telegram.ui.Components.c71) obj2;
                boolean isEmpty = j9Var.K.isEmpty();
                ArrayList arrayList2 = j9Var.G;
                boolean isEmpty2 = arrayList2.isEmpty();
                if (!isEmpty || !isEmpty2) {
                    org.telegram.ui.Components.p61 c10 = org.telegram.ui.Components.p61.c(1, R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2));
                    c10.f29739q = true;
                    arrayList.add(c10);
                    if (!j9Var.getUserConfig().showCallsTab) {
                        org.telegram.ui.Components.p61 c11 = org.telegram.ui.Components.p61.c(2, R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs));
                        c11.f29739q = true;
                        arrayList.add(c11);
                    }
                    arrayList.add(org.telegram.ui.Components.p61.B(null));
                }
                if (!isEmpty) {
                    ArrayList arrayList3 = j9Var.K;
                    int size = arrayList3.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj3 = arrayList3.get(i21);
                        i21++;
                        Long l4 = (Long) obj3;
                        if (l4 != null && (chat = j9Var.getMessagesController().getChat(l4)) != null) {
                            m8 m8Var = new m8(j9Var, 0);
                            int i22 = h9.f38231a;
                            org.telegram.ui.Components.p61 J = org.telegram.ui.Components.p61.J(h9.class);
                            J.G = chat;
                            J.D = m8Var;
                            arrayList.add(J);
                        }
                    }
                    arrayList.add(org.telegram.ui.Components.p61.B(null));
                }
                if (!isEmpty2) {
                    int size2 = arrayList2.size();
                    while (i15 < size2) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        f9 f9Var = (f9) obj4;
                        ai.f2 f2Var = new ai.f2(27, j9Var, f9Var);
                        int i23 = d9.f36903a;
                        org.telegram.ui.Components.p61 J2 = org.telegram.ui.Components.p61.J(d9.class);
                        J2.G = f9Var;
                        J2.D = f2Var;
                        J2.K(j9Var.l0(f9Var.f37486c));
                        arrayList.add(J2);
                    }
                    if (!j9Var.J) {
                        arrayList.add(org.telegram.ui.Components.p61.o(-1, 8));
                        arrayList.add(org.telegram.ui.Components.p61.o(-2, 8));
                        arrayList.add(org.telegram.ui.Components.p61.o(-3, 8));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ke keVar = (ke) this.f36138b;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.c71 c71Var2 = (org.telegram.ui.Components.c71) obj2;
                TLRPC.Chat chat2 = MessagesController.getInstance(keVar.f39255y0).getChat(Long.valueOf(-keVar.f39256z0));
                TLRPC.ChatFull chatFull = MessagesController.getInstance(keVar.f39255y0).getChatFull(-keVar.f39256z0);
                if (chatFull != null) {
                    i10 = chatFull.stats_dc;
                } else {
                    i10 = -1;
                }
                if (keVar.f39236f1) {
                    arrayList4.add(org.telegram.ui.Components.p61.g(keVar.C0));
                    na1 na1Var2 = keVar.f39244o1;
                    if (na1Var2 != null && !na1Var2.f40155l) {
                        arrayList4.add(org.telegram.ui.Components.p61.h(5, i10, na1Var2));
                        charSequence = null;
                        arrayList4.add(org.telegram.ui.Components.p61.A(-1, null));
                    } else {
                        charSequence = null;
                    }
                    na1 na1Var3 = keVar.f39245p1;
                    if (na1Var3 != null && !na1Var3.f40155l) {
                        arrayList4.add(org.telegram.ui.Components.p61.h(2, i10, na1Var3));
                        arrayList4.add(org.telegram.ui.Components.p61.A(-2, charSequence));
                    }
                }
                if (keVar.f39237g1 && (na1Var = keVar.f39246q1) != null && !na1Var.f40155l) {
                    arrayList4.add(org.telegram.ui.Components.p61.h(2, i10, na1Var));
                    arrayList4.add(org.telegram.ui.Components.p61.A(-3, null));
                }
                if (keVar.f39247r1) {
                    arrayList4.add(org.telegram.ui.Components.p61.b(LocaleController.getString(R.string.MonetizationOverview)));
                    arrayList4.add(org.telegram.ui.Components.p61.u(keVar.f39248s1));
                    arrayList4.add(org.telegram.ui.Components.p61.u(keVar.f39249t1));
                    arrayList4.add(org.telegram.ui.Components.p61.u(keVar.f39250u1));
                    arrayList4.add(org.telegram.ui.Components.p61.A(-4, keVar.E0));
                }
                if (chat2 != null && chat2.creator) {
                    if (keVar.f39236f1) {
                        arrayList4.add(org.telegram.ui.Components.p61.b(LocaleController.getString(R.string.MonetizationBalance)));
                        arrayList4.add(org.telegram.ui.Components.p61.k(keVar.G0));
                        arrayList4.add(org.telegram.ui.Components.p61.A(-5, keVar.D0));
                        int i24 = MessagesController.getInstance(keVar.f39255y0).channelRestrictSponsoredLevelMin;
                        String string = LocaleController.getString(R.string.MonetizationSwitchOff);
                        if (keVar.B0 < i24) {
                            i11 = i24;
                        } else {
                            i11 = 0;
                        }
                        if (i11 > 0) {
                            Context context = ApplicationLoader.applicationContext;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            spannableStringBuilder.append((CharSequence) "  L");
                            org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(0, new jp0(i11, context, null, false));
                            erVar.setTranslateY(AndroidUtilities.dp(1.0f));
                            spannableStringBuilder.setSpan(erVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            string = spannableStringBuilder;
                        }
                        org.telegram.ui.Components.p61 i25 = org.telegram.ui.Components.p61.i(1, string);
                        if (keVar.B0 >= i24 && keVar.f39242m1) {
                            z11 = true;
                        }
                        i25.K(z11);
                        arrayList4.add(i25);
                        arrayList4.add(org.telegram.ui.Components.p61.A(-8, LocaleController.getString(R.string.MonetizationSwitchOffInfo)));
                    }
                    if (keVar.f39237g1) {
                        arrayList4.add(org.telegram.ui.Components.p61.b(LocaleController.getString(R.string.MonetizationStarsBalance)));
                        arrayList4.add(org.telegram.ui.Components.p61.j(3, keVar.M0));
                        arrayList4.add(org.telegram.ui.Components.p61.A(-6, keVar.F0));
                    }
                }
                if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(keVar.f39255y0).getChat(Long.valueOf(-keVar.f39256z0))) && MessagesController.getInstance(keVar.f39255y0).starrefConnectAllowed) {
                    arrayList4.add(ei.h.a(4, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.uj, keVar.f39254x0), R.drawable.filled_earn_stars, uo.d0(LocaleController.getString(R.string.ChannelAffiliateProgramRowTitle)), LocaleController.getString(R.string.ChannelAffiliateProgramRowText)));
                    arrayList4.add(org.telegram.ui.Components.p61.A(-7, null));
                }
                if (keVar.f39235e1.a()) {
                    arrayList4.add(org.telegram.ui.Components.p61.p(keVar.f39235e1, AndroidUtilities.dp(24.0f), true));
                    return;
                } else {
                    arrayList4.add(org.telegram.ui.Components.p61.A(-10, null));
                    return;
                }
            case 3:
                ee eeVar = (ee) this.f36138b;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.c71 c71Var3 = (org.telegram.ui.Components.c71) obj2;
                ge geVar = eeVar.f37241f;
                int i26 = eeVar.d;
                if (i26 == 0) {
                    ArrayList arrayList6 = geVar.f37988n;
                    int size3 = arrayList6.size();
                    while (i19 < size3) {
                        Object obj5 = arrayList6.get(i19);
                        i19++;
                        int i27 = yh.i7.f52708a;
                        org.telegram.ui.Components.p61 J3 = org.telegram.ui.Components.p61.J(yh.i7.class);
                        J3.G = (TL_stars.StarsTransaction) obj5;
                        J3.f29739q = true;
                        arrayList5.add(J3);
                    }
                    if (!TextUtils.isEmpty(geVar.f37989r)) {
                        arrayList5.add(org.telegram.ui.Components.p61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.p61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.p61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else if (i26 == 1) {
                    ArrayList arrayList7 = geVar.h;
                    int size4 = arrayList7.size();
                    while (i20 < size4) {
                        Object obj6 = arrayList7.get(i20);
                        i20++;
                        int i28 = yh.i7.f52708a;
                        org.telegram.ui.Components.p61 J4 = org.telegram.ui.Components.p61.J(yh.i7.class);
                        J4.G = (TL_stars.StarsTransaction) obj6;
                        J4.f29739q = true;
                        arrayList5.add(J4);
                    }
                    if (!TextUtils.isEmpty(geVar.f37987f)) {
                        arrayList5.add(org.telegram.ui.Components.p61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.p61.o(arrayList5.size(), 7));
                        arrayList5.add(org.telegram.ui.Components.p61.o(arrayList5.size(), 7));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                uo uoVar = (uo) this.f36138b;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    uoVar.getClass();
                    org.telegram.ui.Components.ad.a0(uoVar).f0(tL_error, false);
                }
                AndroidUtilities.removeFromParent(uoVar.f42477k0);
                AndroidUtilities.removeFromParent(uoVar.f42474h0);
                AndroidUtilities.removeFromParent(uoVar.f42476j0);
                return;
            case 5:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                AndroidUtilities.runOnUIThread(new oq((tr) this.f36138b, 1), 1000L);
                return;
            case 6:
                ((pf.b) this.f36138b).N(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.3f) + 0.2f);
                return;
            case 7:
                qs qsVar = (qs) this.f36138b;
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.c71 c71Var4 = (org.telegram.ui.Components.c71) obj2;
                TLRPC.User user = qsVar.getMessagesController().getUser(Long.valueOf(qsVar.H));
                arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.V));
                arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.f41171b));
                arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.f41172c));
                if (TextUtils.isEmpty(qsVar.c0())) {
                    arrayList8.add(org.telegram.ui.Components.p61.B(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.MobileHiddenExceptionInfo)), UserObject.getFirstName(user))));
                } else if (qsVar.K) {
                    arrayList8.add(org.telegram.ui.Components.p61.B(AndroidUtilities.replaceTags(LocaleController.formatString("MobileVisibleInfo", R.string.MobileVisibleInfo, UserObject.getFirstName(user)))));
                } else {
                    arrayList8.add(org.telegram.ui.Components.p61.B(null));
                }
                if (qsVar.I && qsVar.K) {
                    org.telegram.ui.Components.p61 i29 = org.telegram.ui.Components.p61.i(2, LocaleController.getString(R.string.AddContactShareNumber));
                    i29.K(qsVar.X);
                    arrayList8.add(i29);
                    arrayList8.add(org.telegram.ui.Components.p61.B(LocaleController.formatString(R.string.AddContactShareNumberInfo, UserObject.getFirstName(user))));
                }
                arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.d));
                hg.c.n(R.string.AddNotesInfo, arrayList8);
                if (!qsVar.I) {
                    TLRPC.UserFull userFull = qsVar.getMessagesController().getUserFull(qsVar.H);
                    if (userFull != null && userFull.birthday == null) {
                        arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.F));
                    }
                    arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.f41179x));
                    arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.f41180y));
                    if (user != null && (userProfilePhoto = user.photo) != null && userProfilePhoto.personal) {
                        arrayList8.add(org.telegram.ui.Components.p61.k(qsVar.E));
                    }
                    charSequence2 = null;
                    arrayList8.add(org.telegram.ui.Components.p61.B(null));
                    org.telegram.ui.Components.p61 e7 = org.telegram.ui.Components.p61.e(1, LocaleController.getString(R.string.DeleteContact));
                    e7.f29740r = true;
                    arrayList8.add(e7);
                } else {
                    charSequence2 = null;
                }
                arrayList8.add(org.telegram.ui.Components.p61.B(charSequence2));
                if (qsVar.Y) {
                    AndroidUtilities.runOnUIThread(new hs(qsVar, user, 0));
                    qsVar.Y = false;
                    AndroidUtilities.runOnUIThread(new is(qsVar, 0), 200L);
                    return;
                }
                return;
            case 8:
                rt.a((rt) this.f36138b, (Bitmap) obj, (Bitmap) obj2);
                return;
            case 9:
                nt ntVar = (nt) this.f36138b;
                CharSequence charSequence3 = (CharSequence) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                rt rtVar = ntVar.f40360a;
                pt ptVar = rtVar.f41496l;
                if (ptVar != null) {
                    String join = TextUtils.join("", rtVar.f41499o);
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
                org.telegram.ui.Components.c71 c71Var5 = (org.telegram.ui.Components.c71) obj2;
                bu.S((bu) this.f36138b, (ArrayList) obj);
                return;
            case 11:
                ty tyVar = (ty) this.f36138b;
                Long l10 = (Long) obj2;
                tyVar.P1 = (Long) obj;
                tyVar.R4();
                return;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Long l11 = (Long) obj2;
                ((Runnable) this.f36138b).run();
                return;
            case 13:
                final lz lzVar = (lz) this.f36138b;
                ArrayList arrayList9 = (ArrayList) obj;
                org.telegram.ui.Components.c71 c71Var6 = (org.telegram.ui.Components.c71) obj2;
                String string2 = LocaleController.getString(R.string.TopicsInfo);
                int i30 = R.raw.topics_top;
                org.telegram.ui.Components.p61 p61Var = new org.telegram.ui.Components.p61(2);
                p61Var.f29734l = string2;
                p61Var.f29733k = i30;
                arrayList9.add(p61Var);
                org.telegram.ui.Components.p61 i31 = org.telegram.ui.Components.p61.i(1, LocaleController.getString(R.string.TopicsEnable));
                i31.K(lzVar.f39709c);
                arrayList9.add(i31);
                if (lzVar.f39709c) {
                    arrayList9.add(org.telegram.ui.Components.p61.B(null));
                    arrayList9.add(org.telegram.ui.Components.p61.t(LocaleController.getString(R.string.TopicsLayout)));
                    View.OnClickListener onClickListener = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    lz lzVar2 = lzVar;
                                    lzVar2.d = true;
                                    ((kz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = lzVar2.f39711f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(lzVar2.f39709c), Boolean.valueOf(lzVar2.d));
                                    }
                                    lzVar2.U();
                                    return;
                                default:
                                    lz lzVar3 = lzVar;
                                    lzVar3.d = false;
                                    ((kz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = lzVar3.f39711f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(lzVar3.f39709c), Boolean.valueOf(lzVar3.d));
                                    }
                                    lzVar3.U();
                                    return;
                            }
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    lz lzVar2 = lzVar;
                                    lzVar2.d = true;
                                    ((kz) view.getParent()).a(true, true);
                                    ai.m0 m0Var = lzVar2.f39711f;
                                    if (m0Var != null) {
                                        m0Var.run(Boolean.valueOf(lzVar2.f39709c), Boolean.valueOf(lzVar2.d));
                                    }
                                    lzVar2.U();
                                    return;
                                default:
                                    lz lzVar3 = lzVar;
                                    lzVar3.d = false;
                                    ((kz) view.getParent()).a(false, true);
                                    ai.m0 m0Var2 = lzVar3.f39711f;
                                    if (m0Var2 != null) {
                                        m0Var2.run(Boolean.valueOf(lzVar3.f39709c), Boolean.valueOf(lzVar3.d));
                                    }
                                    lzVar3.U();
                                    return;
                            }
                        }
                    };
                    int i32 = jz.f39043a;
                    org.telegram.ui.Components.p61 J5 = org.telegram.ui.Components.p61.J(jz.class);
                    J5.d = 2;
                    J5.G = onClickListener;
                    J5.H = onClickListener2;
                    J5.K(lzVar.d);
                    arrayList9.add(J5);
                    hg.c.n(R.string.TopicsLayoutInfo, arrayList9);
                    return;
                }
                return;
            case 14:
                ec0 ec0Var = (ec0) this.f36138b;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ec0Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    MessagesController.getInstance(ec0Var.f37220b).putUsers(tL_tones.users, false);
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null && !tL_tones.tones.isEmpty()) {
                        new org.telegram.ui.Components.q(U.getContext(), tL_tones.tones.get(0), U.getResourceProvider()).show();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error3.text)) {
                        org.telegram.messenger.q.q(R.string.AIEditorStyleNotFound, ec0.d(), R.raw.error, 36);
                        return;
                    } else {
                        ec0.d().f0(tL_error3, false);
                        return;
                    }
                } else {
                    return;
                }
            case 15:
                mw0 mw0Var = (mw0) this.f36138b;
                fh.b bVar2 = mw0Var.F;
                Bitmap bitmap = (Bitmap) obj2;
                mw0Var.f40015s = (Bitmap) obj;
                Paint paint = new Paint(1);
                mw0Var.f40016w = paint;
                Bitmap bitmap2 = mw0Var.f40015s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                mw0Var.v = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f7 = 0.05f;
                } else {
                    f7 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f7);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f10 = -0.02f;
                } else {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                mw0Var.f40016w.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                mw0Var.f40017x = new Matrix();
                bVar2.a(bitmap);
                gh.d.c(bVar2, mw0Var.f40005c);
                mw0Var.G.d();
                return;
            case 16:
                tw0 tw0Var = (tw0) this.f36138b;
                ArrayList arrayList10 = (ArrayList) obj;
                org.telegram.ui.Components.c71 c71Var7 = (org.telegram.ui.Components.c71) obj2;
                String string3 = LocaleController.getString(R.string.AllowPostSuggestionsHint2);
                int i33 = R.raw.bubble;
                org.telegram.ui.Components.p61 p61Var2 = new org.telegram.ui.Components.p61(2);
                p61Var2.f29734l = string3;
                p61Var2.f29733k = i33;
                arrayList10.add(p61Var2);
                org.telegram.ui.Components.p61 i34 = org.telegram.ui.Components.p61.i(1, LocaleController.getString(R.string.AllowPostSuggestions));
                i34.K(tw0Var.f42139r);
                arrayList10.add(i34);
                arrayList10.add(org.telegram.ui.Components.p61.A(2, null));
                if (tw0Var.f42139r) {
                    com.google.android.gms.internal.vision.e2.n(R.string.PriceForEachSuggestion, arrayList10);
                    int[] a2 = org.telegram.ui.Cells.z7.a((int) tw0Var.getMessagesController().starsPaidMessageAmountMax, new int[]{0, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                    a80 a80Var = new a80(9);
                    org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7();
                    y7Var.f23781c = a2;
                    y7Var.d = 20;
                    y7Var.f23782e = a80Var;
                    tw0Var.f42134b.d((int) Utilities.clamp(tw0Var.f42140s, 10000L, 0L), y7Var, new t3(tw0Var, 18));
                    arrayList10.add(org.telegram.ui.Components.p61.j(3, tw0Var.f42134b));
                    if (tw0Var.f42140s > 0) {
                        str = tw0Var.W();
                    } else {
                        str = null;
                    }
                    arrayList10.add(org.telegram.ui.Components.p61.A(4, str));
                    TLRPC.Chat chat3 = tw0Var.getMessagesController().getChat(Long.valueOf(tw0Var.f42133a));
                    if (chat3 != null && !TextUtils.isEmpty(ChatObject.getPublicUsername(chat3))) {
                        tw0Var.f42135c.setLink(tw0Var.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat3) + "?direct");
                        com.google.android.gms.internal.vision.e2.n(R.string.ChannelLinkDirectMessages, arrayList10);
                        arrayList10.add(org.telegram.ui.Components.p61.j(5, tw0Var.f42135c));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f36138b;
                TL_account.Passkeys passkeys = (TL_account.Passkeys) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                privacySettingsActivity.getClass();
                if (passkeys != null) {
                    privacySettingsActivity.f34203e = passkeys.passkeys;
                    privacySettingsActivity.A0(true);
                    return;
                }
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) this.f36138b;
                Bitmap bitmap3 = (Bitmap) obj;
                fh.b bVar3 = profileActivity.f34322p6;
                bVar3.a((Bitmap) obj2);
                gh.d.c(bVar3, profileActivity.fragmentView);
                profileActivity.q6.d();
                return;
            case 19:
                b41 b41Var = (b41) this.f36138b;
                ArrayList arrayList11 = (ArrayList) obj;
                org.telegram.ui.Components.c71 c71Var8 = (org.telegram.ui.Components.c71) obj2;
                org.telegram.ui.Components.k71 k71Var = b41Var.f36133f;
                c41 c41Var = b41Var.v;
                ArrayList arrayList12 = c41Var.h;
                t5 t5Var = b41Var.h;
                if (t5Var.getMeasuredHeight() <= 0) {
                    t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                }
                org.telegram.ui.Components.p61 C = org.telegram.ui.Components.p61.C(t5Var.getMeasuredHeight());
                C.d = -1;
                C.f29741s = true;
                arrayList11.add(C);
                int measuredHeight = (int) ((t5Var.getMeasuredHeight() / AndroidUtilities.density) + 0);
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = b41Var.f36130b;
                if (tL_channels_sponsoredMessageReportResultChooseOption != null || b41Var.f36131c != null || b41Var.d != null) {
                    if (tL_channels_sponsoredMessageReportResultChooseOption != null || b41Var.f36131c != null) {
                        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(b41Var.getContext(), org.telegram.ui.ActionBar.i6.L6, 21, 0, 0, false, false, c41.w(c41Var));
                        TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption2 = b41Var.f36130b;
                        if (tL_channels_sponsoredMessageReportResultChooseOption2 != null) {
                            m4Var.setText(tL_channels_sponsoredMessageReportResultChooseOption2.title);
                        } else {
                            TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = b41Var.f36131c;
                            if (tL_reportResultChooseOption != null) {
                                m4Var.setText(tL_reportResultChooseOption.title);
                            }
                        }
                        m4Var.setBackgroundColor(c41Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20868h5));
                        org.telegram.ui.Components.p61 k10 = org.telegram.ui.Components.p61.k(m4Var);
                        k10.d = -2;
                        arrayList11.add(k10);
                        measuredHeight += 40;
                    }
                    if (b41Var.f36130b != null) {
                        for (int i35 = 0; i35 < b41Var.f36130b.options.size(); i35++) {
                            org.telegram.ui.Components.p61 p61Var3 = new org.telegram.ui.Components.p61(30);
                            p61Var3.f29734l = b41Var.f36130b.options.get(i35).text;
                            p61Var3.f29733k = R.drawable.msg_arrowright;
                            p61Var3.d = i35;
                            arrayList11.add(p61Var3);
                            measuredHeight += 50;
                        }
                    } else if (b41Var.f36131c != null) {
                        for (int i36 = 0; i36 < b41Var.f36131c.options.size(); i36++) {
                            org.telegram.ui.Components.p61 p61Var4 = new org.telegram.ui.Components.p61(30);
                            p61Var4.f29734l = b41Var.f36131c.options.get(i36).text;
                            p61Var4.f29733k = R.drawable.msg_arrowright;
                            p61Var4.d = i36;
                            arrayList11.add(p61Var4);
                            measuredHeight += 50;
                        }
                    } else if (b41Var.d != null) {
                        if (b41Var.f36134n == null) {
                            a41 a41Var = new a41(b41Var, b41Var.getContext(), c41.x(c41Var));
                            b41Var.f36134n = a41Var;
                            a41Var.setShowLimitWhenNear(100);
                        }
                        org.telegram.ui.Cells.h3 h3Var = b41Var.f36134n.f22297b;
                        if (b41Var.d.optional) {
                            i12 = R.string.Report2CommentOptional;
                        } else {
                            i12 = R.string.Report2Comment;
                        }
                        h3Var.setHint(LocaleController.getString(i12));
                        org.telegram.ui.Components.p61 k11 = org.telegram.ui.Components.p61.k(b41Var.f36134n);
                        k11.d = -3;
                        arrayList11.add(k11);
                        long j10 = c41Var.f36515r;
                        if (arrayList12 != null && !arrayList12.isEmpty()) {
                            if (arrayList12.size() > 1) {
                                i13 = R.string.Report2CommentInfoMany;
                            } else {
                                i13 = R.string.Report2CommentInfo;
                            }
                        } else if (DialogObject.isUserDialog(j10)) {
                            i13 = R.string.Report2CommentInfoUser;
                        } else if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(c41.y(c41Var)).getChat(Long.valueOf(-j10)))) {
                            i13 = R.string.Report2CommentInfoChannel;
                        } else {
                            i13 = R.string.Report2CommentInfoGroup;
                        }
                        hg.c.n(i13, arrayList11);
                        if (b41Var.f36135r == null) {
                            ci.d dVar = new ci.d(b41Var.getContext(), c41.z(c41Var), true);
                            b41Var.f36136s = dVar;
                            dVar.g(LocaleController.getString(R.string.Report2Send), false, true);
                            FrameLayout frameLayout = new FrameLayout(b41Var.getContext());
                            b41Var.f36135r = frameLayout;
                            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20868h5, c41.B(c41Var)));
                            b41Var.f36135r.addView(b41Var.f36136s, w7.x5.a(48.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 119));
                            View view = new View(b41Var.getContext());
                            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20798d7, c41.C(c41Var)));
                            b41Var.f36135r.addView(view, w7.x5.b(-1.0f, 1.0f / AndroidUtilities.density, 48));
                        }
                        ci.d dVar2 = b41Var.f36136s;
                        if (!b41Var.d.optional && TextUtils.isEmpty(b41Var.f36134n.getText())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        dVar2.setEnabled(z10);
                        b41Var.f36136s.setOnClickListener(new m60(b41Var, 27));
                        org.telegram.ui.Components.p61 k12 = org.telegram.ui.Components.p61.k(b41Var.f36135r);
                        k12.d = -4;
                        arrayList11.add(k12);
                        measuredHeight += 112;
                    }
                    ((org.telegram.ui.Components.p61) hg.c.g(1, arrayList11)).f29732j = true;
                    if (c41Var.d && b41Var.f36129a == 0) {
                        FrameLayout frameLayout2 = new FrameLayout(b41Var.getContext());
                        org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(new ColorDrawable(c41Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20741a7)), org.telegram.ui.ActionBar.i6.V0(b41Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20761b7, c41.D(c41Var))), 0, 0);
                        frVar.f26471w = true;
                        frameLayout2.setBackground(frVar);
                        org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(b41Var.getContext(), null);
                        ea0Var.setTextSize(1, 14.0f);
                        ea0Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString(R.string.ReportAdLearnMore), c41.E(c41Var)));
                        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A6, c41.G(c41Var)));
                        ea0Var.setGravity(17);
                        frameLayout2.addView(ea0Var, w7.x5.a(-2.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 17));
                        org.telegram.ui.Components.p61 k13 = org.telegram.ui.Components.p61.k(frameLayout2);
                        k13.d = -3;
                        arrayList11.add(k13);
                        measuredHeight += 46;
                    }
                }
                if (k71Var != null) {
                    if (c41.H(c41Var).getMeasuredHeight() - AndroidUtilities.statusBarHeight < AndroidUtilities.dp(measuredHeight)) {
                        k71Var.V2.k1(false);
                        return;
                    }
                    Collections.reverse(arrayList11);
                    k71Var.V2.k1(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.c71 c71Var9 = (org.telegram.ui.Components.c71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.p61.k(((h41) this.f36138b).X));
                return;
            case 21:
                org.telegram.ui.Components.c71 c71Var10 = (org.telegram.ui.Components.c71) obj2;
                ((ArrayList) obj).add(org.telegram.ui.Components.p61.k(((u41) this.f36138b).X));
                return;
            case 22:
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                TextView textView = (TextView) obj2;
                ((SecretMediaViewer) this.f36138b).getClass();
                return;
            case 23:
                org.telegram.ui.Components.c71 c71Var11 = (org.telegram.ui.Components.c71) obj2;
                u71.R((u71) this.f36138b, (ArrayList) obj);
                return;
            case 24:
                t71 t71Var = (t71) this.f36138b;
                ArrayList arrayList13 = t71Var.f41896e;
                TLRPC.channels_ChannelParticipants channels_channelparticipants = (TLRPC.channels_ChannelParticipants) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                int i37 = t71Var.f41893a;
                ArrayList arrayList14 = t71Var.d;
                if (tL_error5 != null) {
                    if (t71Var.f41899r) {
                        arrayList14.clear();
                        t71Var.f41899r = false;
                    }
                    t71Var.h = true;
                    t71Var.f41897f = false;
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
                if (t71Var.f41899r) {
                    arrayList14.clear();
                    t71Var.f41899r = false;
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
                    t71Var.h = true;
                }
                t71Var.f41897f = false;
                int size7 = arrayList13.size();
                while (i18 < size7) {
                    Object obj8 = arrayList13.get(i18);
                    i18++;
                    ((Runnable) obj8).run();
                }
                return;
            case 25:
                x71 x71Var = (x71) this.f36138b;
                ArrayList arrayList16 = (ArrayList) obj;
                org.telegram.ui.Components.c71 c71Var12 = (org.telegram.ui.Components.c71) obj2;
                int i39 = x71Var.f43842b0;
                ai.e9 e9Var = x71Var.Z;
                if (e9Var != null) {
                    arrayList16.add(org.telegram.ui.Components.p61.C(AndroidUtilities.dp(16.0f)));
                    ArrayList arrayList17 = e9Var.f899i;
                    int size8 = arrayList17.size();
                    int i40 = i39;
                    int i41 = 0;
                    while (i41 < size8) {
                        Object obj9 = arrayList17.get(i41);
                        i41++;
                        MessageObject messageObject = (MessageObject) obj9;
                        int i42 = ib1.f38602b;
                        org.telegram.ui.Components.p61 J6 = org.telegram.ui.Components.p61.J(ib1.class);
                        J6.f29743u = 1;
                        J6.f29747z = 0;
                        J6.G = messageObject;
                        if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                            j3 = storyItem.f20275id;
                        } else {
                            j3 = -1;
                        }
                        J6.B = j3;
                        J6.f29729f = true;
                        J6.v = i39;
                        J6.K(x71Var.f43841a0.containsKey(Integer.valueOf(messageObject.getId())));
                        J6.f29743u = 1;
                        arrayList16.add(J6);
                        i40--;
                        if (i40 == 0) {
                            i40 = i39;
                        }
                    }
                    if (e9Var.k() || !e9Var.f908r) {
                        while (true) {
                            if (i40 <= 0) {
                                i14 = i39;
                            } else {
                                i14 = i40;
                            }
                            if (i16 < i14) {
                                i16++;
                                org.telegram.ui.Components.p61 o9 = org.telegram.ui.Components.p61.o(i16, 34);
                                o9.f29743u = 1;
                                arrayList16.add(o9);
                            }
                        }
                    }
                    arrayList16.add(org.telegram.ui.Components.p61.C(AndroidUtilities.dp(68.0f)));
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.c71 c71Var13 = (org.telegram.ui.Components.c71) obj2;
                i91.b0((i91) this.f36138b, (ArrayList) obj);
                return;
            case 27:
                t91 t91Var = (t91) this.f36138b;
                ArrayList arrayList18 = (ArrayList) obj;
                org.telegram.ui.Components.c71 c71Var14 = (org.telegram.ui.Components.c71) obj2;
                LinearLayout linearLayout = t91Var.Y;
                if (linearLayout != null) {
                    arrayList18.add(org.telegram.ui.Components.p61.k(linearLayout));
                }
                LinearLayout linearLayout2 = t91Var.Z;
                if (linearLayout2 != null) {
                    arrayList18.add(org.telegram.ui.Components.p61.k(linearLayout2));
                    return;
                }
                return;
            default:
                me1 me1Var = (me1) this.f36138b;
                fh.b bVar4 = me1Var.E;
                Bitmap bitmap4 = (Bitmap) obj2;
                me1Var.f39887r = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                me1Var.v = paint2;
                Bitmap bitmap5 = me1Var.f39887r;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                me1Var.f39888s = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f11 = 0.05f;
                } else {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, f11);
                if (org.telegram.ui.ActionBar.i6.I.q()) {
                    f12 = -0.02f;
                } else {
                    f12 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f12);
                me1Var.v.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                me1Var.f39889w = new Matrix();
                bVar4.a(bitmap4);
                gh.d.c(bVar4, me1Var.f39878b);
                me1Var.F.d();
                return;
        }
    }
}
