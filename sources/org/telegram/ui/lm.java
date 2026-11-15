package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.UndoView;
public final class lm implements org.telegram.ui.Cells.l1 {
    public final an f49005a;

    public lm(an anVar) {
        this.f49005a = anVar;
    }

    @Override
    public final void A0() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.Components.t5 m10;
        an anVar = this.f49005a;
        if (!anVar.A3 && !org.telegram.messenger.gz.A0 && anVar.A0 != null && anVar.getParentActivity() != null && anVar.fragmentView != null) {
            hi.l3 l3Var = anVar.I2;
            if (l3Var == null || !l3Var.W) {
                if (l3Var == null) {
                    int indexOfChild = anVar.f45278m1.indexOfChild(anVar.U);
                    if (indexOfChild != -1) {
                        hi.l3 E6 = anVar.E6(250.0f, 3, indexOfChild + 1, false);
                        anVar.I2 = E6;
                        E6.d = 10000L;
                        E6.m(anVar.getParentActivity().getResources().getDrawable(2131232788).mutate());
                        anVar.I2.u(org.telegram.messenger.hd.M0(2131753762, null));
                    } else {
                        return;
                    }
                }
                int childCount = anVar.A0.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = anVar.A0.getChildAt(i7);
                    if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && org.telegram.messenger.gj.L4(messageObject.f23817k) && (m10 = q1Var.getPhotoImage().m()) != null && m10.o() >= 3000 && !anVar.I2.W) {
                        ImageReceiver photoImage = q1Var.getPhotoImage();
                        float w92 = anVar.w9(q1Var, photoImage.M0);
                        float f10 = photoImage.O0;
                        View view = (View) q1Var.getParent();
                        float w93 = anVar.w9(q1Var, -q1Var.getTop());
                        if (w92 <= org.telegram.messenger.g0.L(80.0f)) {
                            continue;
                        } else if ((w92 + f10) - w93 <= (f10 / 4.0f) + view.getMeasuredHeight()) {
                            anVar.Kb = q1Var;
                            hi.l3 l3Var2 = anVar.I2;
                            l3Var2.f14570r0 = new ye(anVar, 22);
                            l3Var2.x(anVar.v9(q1Var, q1Var.getNoSoundIconCenterX()), w92, true);
                            org.telegram.messenger.gz.D(true);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void B(org.telegram.ui.Cells.q1 q1Var) {
        an anVar = this.f49005a;
        if (!anVar.getMessagesController().T4()) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, anVar.getParentActivity(), null);
            t1Var.r(200L);
            anVar.getMessagesController().R0(new x(this, t1Var, q1Var, 6));
            return;
        }
        if (q1Var.getMessageObject() != null) {
            q1Var.getMessageObject().f23855t2 = Boolean.FALSE;
        }
        q1Var.I3();
    }

    @Override
    public final void B0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        an anVar = this.f49005a;
        if (anVar.getParentActivity() != null && tLObject != null) {
            o4Var = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
            if (o4Var != null) {
                o4Var2 = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
                if (((ActionBarLayout) o4Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28051id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f28200id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232568, 2, anVar.getParentActivity(), anVar.getResourceProvider());
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, anVar.getResourceProvider());
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(anVar.getParentActivity(), false, false);
                z0Var.j(org.telegram.messenger.hd.M0(2131747811, null), 2131232089, null);
                z0Var.setMinimumWidth(160);
                z0Var.setOnClickListener(new a(this, 13));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(anVar.getParentActivity(), false, false);
                z0Var2.j(org.telegram.messenger.hd.M0(2131746662, null), 2131232045, null);
                z0Var2.setMinimumWidth(160);
                z0Var2.setOnClickListener(new y(this, (TLRPC.Chat) tLObject, q1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
                an anVar2 = new an(bundle);
                anVar2.fa = true;
                anVar.presentFragmentAsPreviewWithMenu(anVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                anVar.s7();
                return;
            }
            anVar.presentFragment(new an(bundle));
        }
    }

    @Override
    public final void B1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        e(q1Var, z10, false, z11);
    }

    @Override
    public final void C0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        int i7 = messageObject.D;
        an anVar = this.f49005a;
        if (i7 == 16) {
            TLRPC.MessageAction messageAction = messageObject.f23817k.action;
            int i10 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(anVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i10 < size) {
                    TLRPC.Peer peer = arrayList.get(i10);
                    i10++;
                    hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.e1();
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, anVar.getParentActivity(), null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = anVar.getMessagesController().Q6;
                t1Var.setOnCancelListener(new di.z(this, anVar.getConnectionsManager().sendRequest(getgroupcall, new di.k7(this, t1Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
                t1Var.r(600L);
                return;
            }
            TLRPC.User user = anVar.f45187f;
            if (user != null) {
                boolean J4 = messageObject.J4();
                TLRPC.UserFull userFull = anVar.f45348r8;
                if (userFull != null && userFull.video_calls_available) {
                    i10 = 1;
                }
                org.telegram.ui.Components.voip.c2.m(user, J4, i10, anVar.getParentActivity(), anVar.getMessagesController().b2(anVar.f45187f.f28200id), anVar.getAccountInstance());
                return;
            }
            return;
        }
        anVar.Y7(q1Var, true, false, f10, f11, messageObject.I3(), false, false);
    }

    @Override
    public final void C1(org.telegram.ui.Cells.q1 q1Var) {
        an.f5(this.f49005a, q1Var);
    }

    @Override
    public final void F0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj messageObject;
        if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null && messageObject.f23817k != null) {
            int e12 = messageObject.e1();
            an anVar = this.f49005a;
            if (anVar.Zb != e12 || anVar.f45130ac != 7) {
                TLRPC.InputPeer j12 = anVar.getMessagesController().j1(org.telegram.messenger.gj.B0(messageObject.f23817k));
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = j12;
                getrichmessage.f28273id = e12;
                vf.b bVar = anVar.dc;
                if (bVar != null) {
                    bVar.a(true);
                    anVar.dc = null;
                }
                hi hiVar = new hi(anVar, e12, q1Var, 2);
                hiVar.f58805b = new u5(24, anVar, r3);
                anVar.dc = hiVar;
                hiVar.d();
                int[] iArr = {anVar.getConnectionsManager().sendRequestTyped(getrichmessage, new d3.b(1), new di.z2(anVar, hiVar, iArr, q1Var, messageObject, 3))};
            }
        }
    }

    @Override
    public final void F1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        e(q1Var, z10, false, false);
    }

    @Override
    public final void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
        TLRPC.Message message;
        int i7;
        int i10;
        int i11;
        int L;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.f23817k) != null) {
            int i12 = o2Var.f25705a;
            TL_stars.StarsAmount starsAmount = null;
            an anVar = this.f49005a;
            if (i12 == 1) {
                long o4 = org.telegram.messenger.m5.o(message.from_id);
                li.v vVar = new li.v(25, this, message);
                Pattern pattern = org.telegram.ui.Components.t4.f39507a;
                Activity parentActivity = anVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, null);
                String M0 = org.telegram.messenger.hd.M0(2131744387, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744386, org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).B1(o4, false)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                org.telegram.ui.ActionBar.q6.U(editText, org.telegram.ui.ActionBar.j6.G6, null);
                editText.setHint(org.telegram.messenger.hd.M0(2131744385, null));
                org.telegram.ui.ActionBar.q6.D(editText, org.telegram.ui.ActionBar.j6.H6, null);
                editText.setTextSize(1, 16.0f);
                editText.setBackground(org.telegram.ui.ActionBar.j6.U(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.k4(parentActivity)});
                if (org.telegram.messenger.hd.f24101a0) {
                    i11 = org.telegram.messenger.g0.L(24.0f);
                } else {
                    i11 = 0;
                }
                int L2 = org.telegram.messenger.g0.L(8.0f);
                if (org.telegram.messenger.hd.f24101a0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(24.0f);
                }
                editText.setPadding(i11, L2, L, org.telegram.messenger.g0.L(8.0f));
                editText.setSelection(editText.getText().toString().length());
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751604, null), new org.telegram.ui.Components.f1(0, vVar, editText));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                t1Var.O = new org.telegram.ui.Components.g1(editText, 0);
                frameLayout.addView(editText, c8.ja.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.dg(editText, 3), 100L);
                anVar.showDialog(t1Var);
                TextView textView = (TextView) t1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                }
            } else if (i12 == 2) {
                if (message.suggested_post != null) {
                    i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    boolean A = org.telegram.messenger.t3.A(i7, anVar.f45173e, 24);
                    if (A) {
                        i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                        org.telegram.messenger.t3.A(i10, anVar.f45173e, 5);
                    }
                    aa.c0 c0Var = new aa.c0(this, message, A, messageObject, 28);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    anVar.v7(c0Var, cg.a.l(starsAmount), !A);
                }
            } else if (i12 == 3) {
                anVar.Y7(q1Var, true, false, q1Var.getLastTouchX(), q1Var.getLastTouchY(), true, false, true);
            } else if (i12 == 4) {
                anVar.f45202g2.n(messageObject.Y1(), true);
            }
        }
    }

    @Override
    public final void H(org.telegram.ui.Cells.q1 q1Var) {
        an anVar = this.f49005a;
        anVar.Ta.k(q1Var, anVar, true);
        anVar.A0.I0(false);
    }

    @Override
    public final void H0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        e(q1Var, z10, true, z11);
    }

    @Override
    public final boolean H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        BitmapDrawable bitmapDrawable;
        boolean z10;
        int i14;
        int i15;
        String str2;
        boolean z11;
        w4 w4Var;
        int i16;
        int i17;
        c5 c5Var;
        uj ujVar;
        tj tjVar;
        if (!f()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(org.telegram.messenger.t3.K(chat, false));
        an anVar = this.f49005a;
        if (!isEmpty && anVar.f45173e != null && (((ujVar = anVar.f45162d1) == null || ujVar.getVisibility() != 0) && ((tjVar = anVar.T) == null || tjVar.getVisibility() != 0))) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        TLRPC.Chat chat2 = anVar.f45173e;
        if (chat2 != null && ((anVar.f45358s4 == 0 || anVar.f45408w4) && (!org.telegram.messenger.t3.T(chat2) || anVar.f45173e.megagroup))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat3 = anVar.f45173e;
        if (chat3 != null && chat3.f28051id == chat.f28051id && !anVar.fa()) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        c5[] c5VarArr = new c5[i11 + 1 + i7 + i10];
        c5VarArr[0] = c5.d;
        if (i11 != 0) {
            if (chat.broadcast) {
                c5Var = c5.f46009e;
            } else {
                c5Var = c5.f46010f;
            }
            c5VarArr[1] = c5Var;
            i12 = 2;
        } else {
            i12 = 1;
        }
        if (i7 != 0) {
            c5VarArr[i12] = c5.f46011n;
            i12++;
        }
        if (i10 != 0) {
            c5VarArr[i12] = c5.f46012r;
        }
        TLRPC.ChatFull N0 = anVar.getMessagesController().N0(chat.f28051id);
        if (N0 == null) {
            i13 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
            org.telegram.messenger.gc m10 = org.telegram.messenger.gc.m(org.telegram.messenger.m10.f24934t0, 0, chat);
            org.telegram.messenger.gc m11 = org.telegram.messenger.gc.m(org.telegram.messenger.m10.f24934t0, 1, chat);
            if (m11 != null && (m11.f23719k instanceof TLRPC.TL_photoStrippedSize)) {
                str = "b";
            } else {
                str = null;
            }
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                bitmapDrawable = chatPhoto.strippedBitmap;
            } else {
                bitmapDrawable = null;
            }
            z10 = true;
            i14 = i7;
            i15 = i10;
            str2 = null;
            z11 = i11;
            w4Var = new w4(m10, m11, null, str, null, null, bitmapDrawable, chat, c5VarArr, new y4(i13, org.telegram.messenger.ns.T, chat));
        } else {
            w4Var = w4.a(chat, N0, c5VarArr);
            i14 = i7;
            i15 = i10;
            z10 = true;
            str2 = null;
            z11 = i11;
        }
        if (ab.q.i(w4Var)) {
            ab.q.o().D((ViewGroup) anVar.fragmentView, anVar.Aa, w4Var, new a7(this, chat, q1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(anVar, q1Var);
        H.c(2131232267, org.telegram.messenger.hd.M0(2131747786, str2), new wl(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        if (z12) {
            i16 = 2131232089;
        } else {
            i16 = 2131232114;
        }
        if (z12) {
            i17 = 2131747811;
        } else {
            i17 = 2131747799;
        }
        H.l(i16, org.telegram.messenger.hd.M0(i17, str2), new o1(this, q1Var, chat, 25), z11);
        H.l(2131232223, org.telegram.messenger.hd.M0(2131748609, str2), new wl(this, chat, z10 ? 1 : 0), i14);
        H.l(2131232355, org.telegram.messenger.hd.M0(2131753758, str2), new wl(this, chat, 2), i15);
        H.f37112t = false;
        H.f37093i = 3;
        H.W = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void I0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        TLRPC.Message message = messageObject.f23817k;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.g6(true);
        an anVar = this.f49005a;
        anVar.getMessagesStorage().X1(org.telegram.messenger.gj.B0(messageObject.f23817k), messageObject.f23817k);
        anVar.getMessagesController().f25400t7.h(messageObject, true, false);
        e(q1Var, true, false, true);
    }

    @Override
    public final void I1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        an anVar = this.f49005a;
        if (!anVar.X9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (anVar.getParentActivity() != null) {
                if (anVar.f45162d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.u2 u2Var = new org.telegram.ui.ActionBar.u2(1, (Context) anVar.getParentActivity(), (org.telegram.ui.ActionBar.e6) anVar.Aa, false);
                        u2Var.O();
                        u2Var.P = str;
                        u2Var.Q = false;
                        u2Var.R = true;
                        CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131751767, null)};
                        og.j jVar = new og.j(3, anVar, str);
                        u2Var.M = charSequenceArr;
                        u2Var.L = jVar;
                        anVar.showDialog(u2Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        anVar.Ca(null, tL_inlineButtonTypeUrl.url, true, q1Var, q1Var.getMessageObject());
                        try {
                            q1Var.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void J(org.telegram.messenger.dj djVar) {
        StaticLayout staticLayout = djVar.f23093e;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = djVar.f23093e.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new qi.g(djVar.L, charSequence, false), 0, spannableString.length(), 33);
            org.telegram.messenger.g0.g(spannableString);
            org.telegram.messenger.i20.s(null, 2131752022, org.telegram.ui.Components.cc.a0(this.f49005a));
        }
    }

    @Override
    public final boolean J1() {
        an anVar = this.f49005a;
        if (anVar.f45278m1.getKeyboardHeight() + anVar.Ka >= org.telegram.messenger.g0.L(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
        int i7;
        if (q1Var != null && document != null) {
            an anVar = this.f49005a;
            if (anVar.getParentLayout() != null && a0(q1Var)) {
                boolean J3 = org.telegram.messenger.gj.J3(document);
                q1Var.setScrimBlockBounds(rectF);
                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(anVar, q1Var);
                if (J3) {
                    i7 = 2131745911;
                } else {
                    i7 = 2131745931;
                }
                H.c(2131232115, org.telegram.messenger.hd.M0(i7, null), new o1(this, q1Var, document, 26), false);
                H.f37106p = new xl(q1Var, rectF, 0);
                H.Z();
            }
        }
    }

    @Override
    public final void K1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        boolean z10 = q1Var.getMessageObject().f23817k.media instanceof TLRPC.TL_messageMediaGiveaway;
        an anVar = this.f49005a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) q1Var.getMessageObject().f23817k.media).channels.get(i7).longValue();
            if (anVar.f45259k6 != j3) {
                anVar.presentFragment(an.ua(j3));
            } else {
                anVar.f45314p1.e(false, false);
            }
        }
        if (q1Var.getMessageObject().f23817k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            anVar.presentFragment(ProfileActivity.C4(((TLRPC.TL_messageMediaGiveawayResults) q1Var.getMessageObject().f23817k.media).winners.get(i7).longValue()));
        }
    }

    @Override
    public final boolean L0(long j3) {
        TLRPC.ChatFull N0;
        an anVar = this.f49005a;
        TLRPC.Chat chat = anVar.f45173e;
        if (chat == null || org.telegram.messenger.t3.V(chat)) {
            return false;
        }
        org.telegram.messenger.np messagesController = anVar.getMessagesController();
        long j10 = anVar.f45173e.f28051id;
        if (j10 == j3) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        if (messagesController.getUserConfig().e() == j3 && M0 != null && M0.creator) {
            return true;
        }
        a0.h hVar = (a0.h) messagesController.f25442y1.f(j10);
        if (hVar == null && (N0 = messagesController.N0(j10)) != null && N0.participants != null) {
            for (int i7 = 0; i7 < N0.participants.participants.size(); i7++) {
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i7);
                if (chatParticipant.user_id == j3) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) hVar.f(j3)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override
    public final void L1(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        an anVar = this.f49005a;
        anVar.f45382u5 = messageObject;
        anVar.C9();
    }

    @Override
    public final void N(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (messageObject.f23817k.send_state != 0) {
            this.f49005a.getSendMessagesHelper().g(messageObject);
        }
    }

    @Override
    public final void N0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj gjVar;
        long j3;
        int i7;
        ArrayList arrayList;
        bi.m1 m1Var;
        org.telegram.messenger.bj bjVar;
        int i10;
        an anVar = this.f49005a;
        wh.i iVar = anVar.f45374ta;
        if (iVar != null) {
            HashMap hashMap = iVar.f59363a;
            wh.h hVar = (wh.h) hashMap.get(wh.i.b(q1Var));
            org.telegram.ui.Components.xb xbVar = null;
            if (hVar != null) {
                gjVar = hVar.F;
            } else {
                gjVar = null;
            }
            wh.h hVar2 = (wh.h) anVar.f45374ta.f59363a.get(wh.i.b(q1Var));
            if (hVar2 != null && (i10 = hVar2.S) != -1) {
                j3 = hVar2.f59361x[i10].d;
            } else {
                j3 = 0;
            }
            if (gjVar != null && j3 != 0) {
                Activity parentActivity = anVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.t4.h(parentActivity, i7, j3, false)) {
                    if (gjVar.c1() != 0 && (bjVar = (org.telegram.messenger.bj) anVar.O6.f(gjVar.c1())) != null) {
                        arrayList = bjVar.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.k5.j(gjVar);
                    }
                    if (j3 == org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24934t0).f24953n) {
                        z10 = true;
                    }
                    long j10 = j3;
                    bi.m1 m1Var2 = new bi.m1(this, arrayList, j10, 18);
                    if (z10) {
                        m1Var2.run();
                        m1Var = null;
                    } else {
                        m1Var = m1Var2;
                    }
                    xbVar = org.telegram.ui.Components.cc.v(anVar.getParentActivity(), anVar, null, 1, j10, 1, anVar.getThemedColor(org.telegram.ui.ActionBar.j6.wj), anVar.getThemedColor(org.telegram.ui.ActionBar.j6.yj), 5000, false, m1Var);
                    xbVar.f41644k = true;
                    xbVar.k(xbVar.f41639e instanceof org.telegram.ui.Components.ib);
                }
            }
            wh.h hVar3 = (wh.h) hashMap.get(wh.i.b(q1Var));
            if (hVar3 != null) {
                if (xbVar == null) {
                    hVar3.S = -1;
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.cb cbVar = xbVar.f41639e;
                if (!(cbVar instanceof org.telegram.ui.Components.fb)) {
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.fb fbVar = (org.telegram.ui.Components.fb) cbVar;
                hVar3.X = fbVar;
                fbVar.f34551a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.X.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new mw(2, hVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void O0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        an anVar = this.f49005a;
        anVar.getSendMessagesHelper().n0(true, q1Var.getMessageObject(), keyboardInlineButton, null, null, anVar);
    }

    @Override
    public final void O1(org.telegram.messenger.gj gjVar) {
        this.f49005a.f45353s.put(gjVar, Boolean.TRUE);
    }

    @Override
    public final void P(org.telegram.messenger.gj gjVar) {
        if (org.telegram.messenger.gj.L4(gjVar.f23817k)) {
            this.f49005a.Lb(gjVar, true);
        }
    }

    @Override
    public final boolean Q(org.telegram.ui.Cells.q1 q1Var, final TLRPC.TodoItem todoItem, final boolean z10) {
        TLRPC.Peer peer;
        int i7;
        TLRPC.Peer peer2;
        int i10;
        boolean l32 = org.telegram.messenger.gj.l3(q1Var.getMessageObject().f23817k);
        an anVar = this.f49005a;
        if (l32) {
            TLRPC.Message message = q1Var.getMessageObject().f23817k;
            if (message != null) {
                peer2 = message.from_id;
            } else {
                peer2 = null;
            }
            long o4 = org.telegram.messenger.m5.o(peer2);
            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(anVar);
            i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            a02.Q(2131624113, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744087, org.telegram.messenger.m5.l(i10, o4)))).k(true);
            return false;
        } else if (!q1Var.getMessageObject().q()) {
            TLRPC.Message message2 = q1Var.getMessageObject().f23817k;
            if (message2 != null) {
                peer = message2.from_id;
            } else {
                peer = null;
            }
            long o10 = org.telegram.messenger.m5.o(peer);
            org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(anVar);
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            a03.Q(2131624113, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131744088, org.telegram.messenger.m5.l(i7, o10)))).k(true);
            return false;
        } else if (!anVar.getUserConfig().q()) {
            org.telegram.ui.Components.cc.a0(anVar).Q(2131624217, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.hd.M0(2131744064, null), new tl(this, 9))).k(true);
            return false;
        } else {
            final long M = org.telegram.messenger.t3.M(anVar.f45173e, anVar.f45334q8, true);
            final org.telegram.messenger.ez sendMessagesHelper = anVar.getSendMessagesHelper();
            final org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
            sendMessagesHelper.getClass();
            if (messageObject == null) {
                return true;
            }
            final int hash = Objects.hash(Long.valueOf(org.telegram.messenger.gj.B0(messageObject.f23817k)), Integer.valueOf(messageObject.e1()), Integer.valueOf(todoItem.f28198id));
            sendMessagesHelper.I.put(Integer.valueOf(hash), Boolean.valueOf(z10));
            TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
            tL_messages_toggleTodoCompleted.msg_id = messageObject.e1();
            tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().j1(org.telegram.messenger.gj.B0(messageObject.f23817k));
            if (z10) {
                tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.f28198id));
            } else {
                tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.f28198id));
            }
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    ez ezVar = ez.this;
                    final boolean z11 = z10;
                    if (tL_error == null) {
                        final vr messagesStorage = ezVar.getMessagesStorage();
                        gj gjVar = messageObject;
                        final long B0 = gj.B0(gjVar.f23817k);
                        final int e12 = gjVar.e1();
                        final int i11 = todoItem.f28198id;
                        final long e10 = messagesStorage.getUserConfig().e();
                        final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                        p5 p5Var = messagesStorage.f27220a;
                        final long j3 = M;
                        p5Var.c(new Runnable() {
                            @Override
                            public final void run() {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cr.run():void");
                            }
                        });
                        ezVar.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    }
                    g0.h3(new di.u7(ezVar, hash, z11, 3));
                }
            });
            return true;
        }
    }

    @Override
    public final void Q1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        hm hmVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && vf.c.i(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        an anVar = this.f49005a;
        vf.b bVar = anVar.dc;
        if (bVar != null) {
            bVar.a(true);
        }
        if (q1Var.getMessageObject() == null) {
            hmVar = null;
        } else {
            hmVar = new hm(this, q1Var);
        }
        anVar.dc = hmVar;
        if (!z11 && !vf.c.g(parse, false, null)) {
            org.telegram.ui.Components.t4.o0(anVar, str, true, true, true, !z11, anVar.dc, webPage, anVar.Aa);
        } else {
            vf.c.s(anVar.getParentActivity(), parse, true, true, false, anVar.dc, null, false, true, false, false);
        }
    }

    @Override
    public final boolean R() {
        an anVar = this.f49005a;
        if (anVar.f45294n6[1].size() + anVar.f45294n6[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final CharacterStyle R1(org.telegram.ui.Cells.q1 q1Var) {
        an anVar;
        int i7;
        if (q1Var.getMessageObject() != null && (i7 = (anVar = this.f49005a).Zb) != 0 && i7 == q1Var.getMessageObject().e1() && anVar.f45130ac == 1) {
            return anVar.f45145bc;
        }
        return null;
    }

    @Override
    public final boolean S(org.telegram.ui.Cells.q1 q1Var) {
        int i7;
        org.telegram.messenger.gj messageObject;
        TLRPC.Message message;
        if (q1Var != null) {
            an anVar = this.f49005a;
            if (anVar.getParentActivity() != null) {
                i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                if (org.telegram.messenger.np.s1(i7).s4() && (messageObject = q1Var.getMessageObject()) != null && (message = messageObject.f23817k) != null && message.rich_message != null) {
                    if (!messageObject.L2 || message.translatedRichMessage == null) {
                        return messageObject.u(anVar.f45173e);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void S1(org.telegram.messenger.gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        try {
            an anVar = this.f49005a;
            org.telegram.ui.Components.bu.N0(anVar, gjVar, anVar.f45158cb, str2, str3, str4, str, i7, i10, -1, anVar.V9());
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final boolean T() {
        an anVar = this.f49005a;
        if (!org.telegram.messenger.q10.z(anVar.f45187f) && !org.telegram.messenger.q10.B(anVar.f45187f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void T0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        this.f49005a.l8(characterStyle, z10, q1Var.getMessageObject(), q1Var);
    }

    @Override
    public final boolean T1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.gj gjVar) {
        fe feVar;
        bi.m1 m1Var;
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        long j3;
        ai.j0 j0Var;
        int i7;
        boolean z11;
        int i10;
        nz0 nz0Var;
        int i11;
        float f10;
        int i12;
        long j10;
        ArrayList arrayList = null;
        if (!gjVar.S4() && !gjVar.g4()) {
            if (!org.telegram.messenger.gj.R4(gjVar.f23817k) && !gjVar.h4()) {
                if (gjVar.I3()) {
                    MediaController B = MediaController.B();
                    ArrayList L = this.f49005a.D0.L();
                    an anVar = this.f49005a;
                    long j11 = anVar.f45154c7;
                    boolean z12 = true ^ anVar.D0.O;
                    if (anVar.f45408w4) {
                        j10 = anVar.b();
                    } else {
                        j10 = 0;
                    }
                    return B.o0(L, gjVar, j11, z12, null, j10);
                }
            } else {
                boolean S = MediaController.B().S(gjVar);
                MediaController B2 = MediaController.B();
                if (S) {
                    arrayList = this.f49005a.i8(gjVar, false);
                }
                B2.r0(arrayList, false);
                return S;
            }
        } else {
            pz0 pz0Var = this.f49005a.f45400va;
            if (pz0Var == null || pz0Var.f50404c0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.f26600b.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!gjVar.P3()) {
                            org.telegram.ui.Components.cc.a0(this.f49005a).w(2131232788, org.telegram.messenger.hd.M0(2131743513, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f49005a.f45400va = new pz0(this.f49005a.getParentActivity());
                pz0 pz0Var2 = this.f49005a.f45400va;
                if (!gjVar.P3()) {
                    feVar = this.f49005a.Lb(gjVar, true);
                } else {
                    feVar = null;
                }
                if (!gjVar.P3()) {
                    m1Var = an.a5(this.f49005a, gjVar);
                } else {
                    m1Var = null;
                }
                Context context = pz0Var2.f50399a;
                ai.j0 j0Var2 = pz0Var2.f50403c;
                pz0Var2.Y = feVar;
                pz0Var2.Z = m1Var;
                nz0 nz0Var2 = pz0Var2.O;
                if (nz0Var2 != null) {
                    j0Var2.removeView(nz0Var2);
                    pz0Var2.O = null;
                }
                pz0Var2.P = q1Var;
                org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
                pz0Var2.N = messageObject;
                if (messageObject != null && messageObject.h4()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pz0Var2.T = z10;
                org.telegram.ui.Cells.q1 q1Var2 = pz0Var2.P;
                if (q1Var2 != null) {
                    e6Var = q1Var2.getResourcesProvider();
                } else {
                    e6Var = null;
                }
                pz0Var2.M = e6Var;
                if (pz0Var2.P != null) {
                    pz0Var2.U = 0.0f;
                    pz0Var2.V = q1Var.f31071n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        pz0Var2.U = view.getY() + pz0Var2.U;
                        pz0Var2.V = view.getY() + pz0Var2.V;
                    }
                    int width = pz0Var2.P.getWidth();
                    int height = pz0Var2.P.getHeight();
                    if (pz0Var2.T) {
                        height = Math.min(org.telegram.messenger.g0.L(360.0f), Math.min(width, org.telegram.messenger.g0.f23609q.y));
                    }
                    pz0Var2.L = height - pz0Var2.P.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / org.telegram.messenger.g0.f23608p);
                    j3 = 0;
                    int i13 = height;
                    j0Var = j0Var2;
                    nz0 nz0Var3 = new nz0(pz0Var2, pz0Var2.getContext(), org.telegram.messenger.m10.f24934t0, pz0Var2.P.getResourcesProvider(), width, i13);
                    pz0Var2.O = nz0Var3;
                    pz0Var2.P.u0(nz0Var3);
                    pz0Var2.O.t0(pz0Var2.P);
                    pz0Var2.O.setDelegate(new w7.s(19));
                    nz0 nz0Var4 = pz0Var2.O;
                    org.telegram.messenger.gj gjVar2 = pz0Var2.N;
                    org.telegram.messenger.bj currentMessagesGroup = pz0Var2.P.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = pz0Var2.P;
                    nz0Var4.x3(gjVar2, currentMessagesGroup, q1Var3.G, q1Var3.F, false, false);
                    if (!pz0Var2.T) {
                        org.telegram.ui.Components.z7 z7Var = new org.telegram.ui.Components.z7();
                        pz0Var2.W = z7Var;
                        nz0 nz0Var5 = pz0Var2.O;
                        z7Var.f42277i = nz0Var5;
                        nz0Var5.wc = z7Var;
                        if (nz0Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.tm0 seekBarWaveform = pz0Var2.O.getSeekBarWaveform();
                            seekBarWaveform.L = pz0Var2.f50412s;
                            org.telegram.ui.Cells.q1 q1Var4 = seekBarWaveform.f39736n;
                            if (q1Var4 != null) {
                                q1Var4.invalidate();
                            }
                        }
                    }
                    pz0Var2.I = false;
                    j0Var.addView(pz0Var2.O, new FrameLayout.LayoutParams(pz0Var2.P.getWidth(), i13, 17));
                    i7 = ceil;
                } else {
                    j3 = 0;
                    j0Var = j0Var2;
                    i7 = 360;
                }
                TextureView textureView = pz0Var2.Q;
                if (textureView != null) {
                    j0Var.removeView(textureView);
                    pz0Var2.Q = null;
                }
                if (pz0Var2.T) {
                    pz0Var2.R = false;
                    TextureView textureView2 = new TextureView(context);
                    pz0Var2.Q = textureView2;
                    j0Var.addView(textureView2, 0, c8.ja.c(i7, i7));
                }
                org.telegram.ui.Components.u51 u51Var = MediaController.B().f22353j0;
                if (u51Var != null) {
                    u51Var.g0();
                }
                org.telegram.ui.Components.u51 u51Var2 = pz0Var2.f50414x;
                if (u51Var2 != null) {
                    u51Var2.g0();
                    pz0Var2.f50414x.m0();
                    pz0Var2.f50414x = null;
                }
                org.telegram.ui.Cells.q1 q1Var5 = pz0Var2.P;
                if (q1Var5 != null && q1Var5.getMessageObject() != null) {
                    org.telegram.messenger.w7.G(pz0Var2.P.getMessageObject().K1);
                    File I = org.telegram.messenger.w7.I(pz0Var2.P.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        org.telegram.messenger.w7.G(pz0Var2.P.getMessageObject().K1);
                        I = org.telegram.messenger.w7.M(pz0Var2.P.getMessageObject().f23817k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && pz0Var2.P.getMessageObject().f23817k.attachPath != null) {
                        I = new File(pz0Var2.P.getMessageObject().f23817k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        org.telegram.ui.Components.u51 u51Var3 = new org.telegram.ui.Components.u51();
                        pz0Var2.f50414x = u51Var3;
                        u51Var3.K = new oz0(pz0Var2);
                        if (pz0Var2.W != null) {
                            u51Var3.L = new oz0(pz0Var2);
                        }
                        if (pz0Var2.T) {
                            u51Var3.A0(pz0Var2.Q);
                        }
                        pz0Var2.f50414x.j0(Uri.fromFile(I), "other");
                        pz0Var2.f50414x.h0();
                        org.telegram.ui.Components.ps psVar = pz0Var2.F;
                        if (psVar != null) {
                            psVar.f38402s = pz0Var2.f50414x;
                            psVar.a();
                        }
                    }
                    an anVar2 = this.f49005a;
                    anVar2.showDialog(anVar2.f45400va);
                    return false;
                }
                hi.l3 l3Var = pz0Var2.f50415y;
                if (l3Var != null) {
                    j0Var.removeView(l3Var);
                    pz0Var2.f50415y = null;
                }
                org.telegram.messenger.gj gjVar3 = pz0Var2.N;
                if (gjVar3 != null && gjVar3.P3()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.messenger.gj gjVar4 = pz0Var2.N;
                if (gjVar4 != null && org.telegram.messenger.gj.B0(gjVar4.f23817k) != org.telegram.messenger.m10.i(pz0Var2.N.K1).e()) {
                    hi.l3 l3Var2 = new hi.l3(context, 3);
                    pz0Var2.f50415y = l3Var2;
                    l3Var2.r(true);
                    if (z11) {
                        long B0 = org.telegram.messenger.gj.B0(pz0Var2.N.f23817k);
                        String str = "";
                        if (B0 > j3) {
                            TLRPC.User a22 = org.telegram.messenger.np.s1(pz0Var2.N.K1).a2(Long.valueOf(B0));
                            if (a22 != null) {
                                str = org.telegram.messenger.q10.j(a22, true);
                            }
                        } else {
                            TLRPC.Chat M0 = org.telegram.messenger.np.s1(pz0Var2.N.K1).M0(Long.valueOf(-B0));
                            if (M0 != null) {
                                str = M0.title;
                            }
                        }
                        hi.l3 l3Var3 = pz0Var2.f50415y;
                        if (pz0Var2.T) {
                            i12 = 2131743590;
                        } else {
                            i12 = 2131743514;
                        }
                        l3Var3.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i12, str)));
                    } else {
                        hi.l3 l3Var4 = pz0Var2.f50415y;
                        if (pz0Var2.T) {
                            i11 = 2131743591;
                        } else {
                            i11 = 2131743515;
                        }
                        l3Var4.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(i11, null)));
                    }
                    pz0Var2.f50415y.s(12.0f);
                    hi.l3 l3Var5 = pz0Var2.f50415y;
                    if (!z11 && !pz0Var2.P.G) {
                        f10 = 6.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    l3Var5.setPadding(org.telegram.messenger.g0.L(f10), 0, 0, 0);
                    if (pz0Var2.T) {
                        pz0Var2.f50415y.p(0.5f, 0.0f);
                        pz0Var2.f50415y.L = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        pz0Var2.f50415y.p(0.0f, org.telegram.messenger.g0.L(34.0f));
                        pz0Var2.f50415y.L = Layout.Alignment.ALIGN_NORMAL;
                    }
                    pz0Var2.f50415y.v(14.0f);
                    hi.l3 l3Var6 = pz0Var2.f50415y;
                    l3Var6.h = hi.l3.a(l3Var6.getText(), pz0Var2.f50415y.getTextPaint());
                    if (pz0Var2.T) {
                        j0Var.addView(pz0Var2.f50415y, c8.ja.d((int) ((pz0Var2.P.getWidth() / org.telegram.messenger.g0.f23608p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((pz0Var2.P.getHeight() + pz0Var2.L) / org.telegram.messenger.g0.f23608p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        j0Var.addView(pz0Var2.f50415y, c8.ja.d((int) ((pz0Var2.P.getWidth() / org.telegram.messenger.g0.f23608p) * 0.6f), 150.0f, 17, ((((pz0Var2.P.getWidth() * (-0.39999998f)) / 2.0f) + pz0Var2.P.getBoundsLeft()) / org.telegram.messenger.g0.f23608p) + 1.0f, ((-75.0f) - ((pz0Var2.P.getHeight() / org.telegram.messenger.g0.f23608p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    pz0Var2.f50415y.w();
                }
                TextView textView = pz0Var2.E;
                if (textView != null) {
                    j0Var.removeView(textView);
                    pz0Var2.E = null;
                }
                TextView textView2 = new TextView(context);
                pz0Var2.E = textView2;
                textView2.setTextColor(-1);
                pz0Var2.E.setTypeface(org.telegram.messenger.g0.o());
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    pz0Var2.E.setBackground(org.telegram.ui.ActionBar.j6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    pz0Var2.E.setBackground(org.telegram.ui.ActionBar.j6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                pz0Var2.E.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
                c8.na.a(pz0Var2.E);
                TextView textView3 = pz0Var2.E;
                if (z11) {
                    i10 = 2131743519;
                } else {
                    i10 = 2131743516;
                }
                textView3.setText(org.telegram.messenger.hd.M0(i10, null));
                pz0Var2.E.setOnClickListener(new lz0(pz0Var2, 1));
                j0Var.addView(pz0Var2.E, c8.ja.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (nz0Var = pz0Var2.O) != null && nz0Var.getMessageObject() != null && pz0Var2.O.getMessageObject().f23817k != null) {
                    pz0Var2.O.getMessageObject().f23817k.media_unread = false;
                    pz0Var2.O.invalidate();
                }
                an anVar22 = this.f49005a;
                anVar22.showDialog(anVar22.f45400va);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.gj messageObject;
        if (chat == null) {
            return;
        }
        an anVar = this.f49005a;
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        if (!kVar.x() && !anVar.Y9()) {
            if (!z10 && chat.signature_profiles && (messageObject = q1Var.getMessageObject()) != null && org.telegram.messenger.gj.B0(messageObject.f23817k) != 1271266957) {
                anVar.Qa(org.telegram.messenger.m5.o(messageObject.f23817k.from_id));
                return;
            } else {
                i(q1Var, chat, i7, z10);
                return;
            }
        }
        an.k2(anVar, q1Var, true, f10, f11);
    }

    @Override
    public final void U1() {
        org.telegram.ui.ActionBar.e6 e6Var;
        an anVar = this.f49005a;
        if (anVar.f45278m1 != null && anVar.getParentActivity() != null) {
            Context context = anVar.f45278m1.getContext();
            e6Var = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
            qy0.d1(context, anVar, false, e6Var, null);
        }
    }

    @Override
    public final void V(org.telegram.ui.Cells.q1 q1Var) {
        e(q1Var, true, true, false);
    }

    @Override
    public final boolean V0(org.telegram.ui.Cells.q1 r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm.V0(org.telegram.ui.Cells.q1, boolean):boolean");
    }

    @Override
    public final void W0(org.telegram.ui.Cells.q1 q1Var) {
        an anVar = this.f49005a;
        anVar.getNotificationCenter().k(org.telegram.messenger.ns.f25539n3, Long.valueOf(anVar.f45259k6), q1Var);
    }

    @Override
    public final int X() {
        return this.f49005a.f45204g4;
    }

    @Override
    public final void X0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.f23817k.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            String N0 = org.telegram.messenger.hd.N0("PsaMessageInfo_" + messageObject.f23817k.fwd_from.psa_type);
            if (TextUtils.isEmpty(N0)) {
                N0 = org.telegram.messenger.hd.M0(2131746594, null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
            org.telegram.messenger.gj.d(spannableStringBuilder, false);
            org.telegram.messenger.bj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
            an anVar = this.f49005a;
            if (currentMessagesGroup != null) {
                ArrayList arrayList = currentMessagesGroup.f22710e;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    } else if ((((org.telegram.messenger.yi) arrayList.get(i7)).f27753l & 1) != 0) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) currentMessagesGroup.d.get(i7);
                        if (gjVar != messageObject) {
                            int childCount = anVar.A0.getChildCount();
                            for (int i10 = 0; i10 < childCount; i10++) {
                                View childAt = anVar.A0.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                                    if (gjVar.T(q1Var2.getMessageObject())) {
                                        q1Var = q1Var2;
                                    }
                                }
                            }
                            messageObject = gjVar;
                        }
                    } else {
                        i7++;
                    }
                }
            }
            anVar.qc(messageObject, spannableStringBuilder, 1);
            q1Var.H3(1, false, true);
        }
    }

    @Override
    public final void X1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        hi hiVar;
        int i7;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        ai.v0 v0Var = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            an anVar = this.f49005a;
            vf.b bVar = anVar.dc;
            if (bVar != null) {
                bVar.a(true);
                anVar.dc = null;
            }
            if (q1Var.getMessageObject() == null) {
                anVar.dc = null;
                hiVar = null;
            } else {
                hiVar = new hi(anVar, q1Var.getMessageObject().e1(), q1Var, 1);
                anVar.dc = hiVar;
            }
            i7 = ((org.telegram.ui.ActionBar.e2) this.f49005a).currentAccount;
            di.v8 y10 = di.v8.y(i7, false);
            Objects.requireNonNull(hiVar);
            bh bhVar = new bh(hiVar, 8);
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = org.telegram.messenger.t0.f26600b;
            }
            org.telegram.ui.ActionBar.e6 I = di.v8.I();
            if (messageObject != null && context != null) {
                long B0 = org.telegram.messenger.gj.B0(messageObject.f23817k);
                int e12 = messageObject.e1();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = org.telegram.messenger.np.s1(y10.f9598a).j1(B0);
                tL_inputInvoiceMessage.msg_id = e12;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject u10 = ki.x2.u(I, false);
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                v0Var = new ai.v0(y10, ConnectionsManager.getInstance(y10.f9598a).sendRequest(tL_payments_getPaymentForm, new bi.l1(y10, messageObject, tL_inputInvoiceMessage, bhVar, 3)), 3);
            }
            if (v0Var != null) {
                hiVar.f58805b = v0Var;
                hiVar.d();
                return;
            }
            return;
        }
        TLRPC.Message message = messageObject.f23817k;
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            ArrayList arrayList = new ArrayList();
            int i10 = -1;
            for (int i11 = 0; i11 < tL_messageMediaPaidMedia.extended_media.size(); i11++) {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i11);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                    if (tL_messageExtendedMedia == messageExtendedMedia) {
                        i10 = arrayList.size();
                    }
                    TLRPC.TL_message R7 = an.R7(message);
                    if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                        R7.attachPath = tL_messageExtendedMedia.attachPath;
                    } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                        R7.attachPath = message.attachPath;
                    }
                    R7.media = tL_messageExtendedMedia.media;
                    R7.noforwards = true;
                    arrayList.add(new org.telegram.messenger.gj(messageObject.K1, R7, false, true));
                }
            }
            if (i10 > -1 && !arrayList.isEmpty()) {
                PhotoViewer p12 = PhotoViewer.p1();
                an anVar2 = this.f49005a;
                p12.I2(null, anVar2, anVar2.Aa);
                PhotoViewer.p1().a2(arrayList, i10, this.f49005a.a(), 0L, 0L, this.f49005a.f45171db);
            }
        }
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7;
        int i10;
        org.telegram.messenger.cp cpVar;
        Integer num;
        org.telegram.messenger.gc b10;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        an anVar = this.f49005a;
        if (isEmpty) {
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            ug.g1 g1Var = new ug.g1(anVar, i7, user, null, null, anVar.Aa);
            q1Var.getLocationOnScreen(new int[2]);
            g1Var.f58103r2 = q1Var.getNameStatusX();
            g1Var.f58104s2 = q1Var.getNameStatusY();
            g1Var.f58107v2 = q1Var.getScaleX();
            g1Var.f58105t2 = q1Var.getLeft();
            g1Var.f58106u2 = q1Var.getTop();
            g1Var.f58108w2 = q1Var;
            int e10 = org.telegram.messenger.q10.e(user);
            if (e10 >= 7) {
                i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(i10).f25380r4;
                if (dpVar != null) {
                    cpVar = dpVar.d(e10);
                } else {
                    cpVar = null;
                }
                if (cpVar != null) {
                    num = Integer.valueOf(cpVar.f());
                } else {
                    num = null;
                }
                g1Var.f58102q2 = num;
            } else {
                g1Var.f58102q2 = Integer.valueOf(anVar.getThemedColor(org.telegram.ui.ActionBar.j6.f29110r8[e10]));
            }
            org.telegram.ui.Components.e5 e5Var = q1Var.f31122qa;
            if (e5Var != null && (e5Var.f34194f[0] instanceof org.telegram.ui.Components.g5)) {
                g1Var.f58107v2 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(anVar.getParentActivity());
                    org.telegram.messenger.pz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.j6.f29014m6, 0.2f, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.gc.b(document);
                        if (d != null) {
                            d.f26029e = 512;
                            d.f26030f = 512;
                        }
                        str2 = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.gj.K2(document, false)) {
                            d.f26029e = 512;
                            d.f26030f = 512;
                        }
                        b10 = org.telegram.messenger.gc.b(document);
                        str2 = "160_160";
                    }
                    org.telegram.messenger.gc gcVar = b10;
                    String str3 = str2;
                    i9Var.setLayerNum(7);
                    i9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                    i9Var.m(gcVar, str3, org.telegram.messenger.gc.c(w10, document), "140_140", d, document);
                    if (org.telegram.messenger.gj.C4(document)) {
                        Integer num2 = g1Var.f58102q2;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = anVar.getThemedColor(org.telegram.ui.ActionBar.j6.f29184v6);
                        }
                        i9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        g1Var.f58110y2 = org.telegram.messenger.gj.i1(document);
                    } else {
                        g1Var.f58110y2 = org.telegram.messenger.gj.i1(document);
                    }
                    g1Var.f58109x2 = i9Var;
                    g1Var.A2 = true;
                }
            }
            anVar.showDialog(g1Var);
            return;
        }
        vf.c.t(anVar.getParentActivity(), "https://" + anVar.getMessagesController().V2 + "/nft/" + str);
    }

    @Override
    public final jh.a Z() {
        return this.f49005a.f45376tc;
    }

    @Override
    public final boolean Z1(org.telegram.ui.Cells.q1 r52, org.telegram.tgnet.TLRPC.PollAnswer r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm.Z1(org.telegram.ui.Cells.q1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        an anVar = this.f49005a;
        qj qjVar = anVar.f45118a0;
        if (qjVar != null) {
            CharSequence fieldText = qjVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String K = org.telegram.messenger.t3.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                anVar.f45118a0.setFieldText(spannableStringBuilder);
                org.telegram.messenger.g0.i3(new tl(this, 6), 200L);
            }
        }
    }

    @Override
    public final boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj messageObject;
        if (q1Var == null) {
            messageObject = null;
        } else {
            messageObject = q1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.f23817k != null) {
            an anVar = this.f49005a;
            if (anVar.f45204g4 != 1 && !anVar.W9() && !messageObject.f23817k.noforwards && messageObject.D != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void a2(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.l10 l10Var) {
        TLRPC.Message message;
        if (q1Var == null) {
            l10Var.run();
            return;
        }
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.o4() || messageObject.Y2()) && (message = messageObject.f23817k) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.e2 e2Var = this.f49005a;
            e2Var.getSendMessagesHelper().v(messageObject, messageObject.f23817k.rich_message, null, e2Var, true);
            return;
        }
        l10Var.run();
    }

    public final void b(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        an anVar = this.f49005a;
        qj qjVar = anVar.f45118a0;
        if (qjVar != null) {
            CharSequence fieldText = qjVar.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String n10 = org.telegram.messenger.q10.n(user);
            if (n10 != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) n10).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(r.b.v(org.telegram.messenger.q10.j(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.i41("" + user.f28200id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            anVar.f45118a0.setFieldText(spannableStringBuilder);
            org.telegram.messenger.g0.i3(new tl(this, 7), 200L);
        }
    }

    @Override
    public final boolean c() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        an anVar = this.f49005a;
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            if (!kVar2.x() && !anVar.Y9()) {
                z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
                if (!z10) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean c0(org.telegram.ui.Cells.q1 q1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        char c10;
        int i7;
        w4 b10;
        int i10;
        uj ujVar;
        tj tjVar;
        if (!f()) {
            return false;
        }
        an anVar = this.f49005a;
        if (anVar.f45173e != null && (((ujVar = anVar.f45162d1) == null || ujVar.getVisibility() != 0) && ((tjVar = anVar.T) == null || tjVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = anVar.f45173e;
        if (chat != null && ((anVar.f45358s4 == 0 || anVar.f45408w4) && (!org.telegram.messenger.t3.T(chat) || anVar.f45173e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        c5[] c5VarArr = new c5[r22 + 2 + r42];
        c5VarArr[0] = c5.d;
        c5VarArr[1] = c5.h;
        if (r22 != 0) {
            c5VarArr[2] = c5.f46011n;
            c10 = 3;
        } else {
            c10 = 2;
        }
        if (r42 != 0) {
            c5VarArr[c10] = c5.f46012r;
        }
        TLRPC.UserFull b22 = anVar.getMessagesController().b2(user.f28200id);
        if (b22 == null) {
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
            b10 = w4.b(user, i7, c5VarArr);
        } else {
            b10 = w4.c(user, b22, c5VarArr);
            if (!ab.q.i(b10)) {
                i10 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
                b10 = w4.b(user, i10, c5VarArr);
            }
        }
        if (ab.q.i(b10)) {
            ab.q.o().D((ViewGroup) anVar.fragmentView, anVar.Aa, b10, new a7(this, q1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(anVar, q1Var);
        H.c(2131232267, org.telegram.messenger.hd.M0(2131747786, null), new Runnable(this) {
            public final lm f51964b;

            {
                this.f51964b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f51964b.q(user, false);
                        return;
                    case 1:
                        this.f51964b.b(user);
                        return;
                    default:
                        this.f51964b.f49005a.Pa(user);
                        return;
                }
            }
        }, false);
        H.c(2131232114, org.telegram.messenger.hd.M0(2131745601, null), new o1(this, q1Var, user, 24), false);
        H.l(2131232223, org.telegram.messenger.hd.M0(2131748609, null), new Runnable(this) {
            public final lm f51964b;

            {
                this.f51964b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f51964b.q(user, false);
                        return;
                    case 1:
                        this.f51964b.b(user);
                        return;
                    default:
                        this.f51964b.f49005a.Pa(user);
                        return;
                }
            }
        }, r22);
        H.l(2131232355, org.telegram.messenger.hd.M0(2131753758, null), new Runnable(this) {
            public final lm f51964b;

            {
                this.f51964b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f51964b.q(user, false);
                        return;
                    case 1:
                        this.f51964b.b(user);
                        return;
                    default:
                        this.f51964b.f49005a.Pa(user);
                        return;
                }
            }
        }, r42);
        H.f37112t = false;
        H.f37093i = 3;
        H.W = true;
        H.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final dr0 c2() {
        return this.f49005a.Sa;
    }

    public final void d(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i7;
        org.telegram.ui.ActionBar.e6 e6Var;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        an anVar = this.f49005a;
        anVar.getUserConfig().f();
        if (org.telegram.messenger.g0.E1(anVar.getParentActivity()) && (chat = anVar.f45173e) != null && currentUser != null && !org.telegram.messenger.t3.V(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == anVar.getUserConfig().e()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = channelParticipant.rank;
            } else if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z11 = false;
                    z14 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant2.promoted_by == anVar.getUserConfig().e()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                    z13 = false;
                }
                str2 = channelParticipant2.rank;
                z12 = z11;
                boolean z15 = z13;
                boolean z16 = z14;
                Activity parentActivity = anVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
                org.telegram.ui.Components.gy0.b(parentActivity, i7, -anVar.f45173e.f28051id, currentUser, str2, z15, z16, z12, e6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == anVar.getUserConfig().e()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (org.telegram.messenger.t3.T(anVar.f45173e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                anVar.getMessagesController();
                tL_channels_getParticipant.channel = org.telegram.messenger.np.i1(anVar.f45173e);
                tL_channels_getParticipant.participant = anVar.getMessagesController().j1(currentUser.f28200id);
                anVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new bi.e4(12, this, q1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = anVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            e6Var = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
            org.telegram.ui.Components.gy0.b(parentActivity2, i7, -anVar.f45173e.f28051id, currentUser, str2, z152, z162, z12, e6Var);
        }
    }

    public final void e(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11, boolean z12) {
        org.telegram.messenger.gj primaryMessageObject;
        int i7;
        int i10;
        dj djVar;
        if (q1Var == null || (primaryMessageObject = q1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.M1 = true;
        an anVar = this.f49005a;
        aj ajVar = anVar.A0;
        if (ajVar != null && (djVar = anVar.C0) != null && djVar.f58498y < 0) {
            for (int childCount = ajVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = anVar.A0.getChildAt(childCount);
                anVar.A0.getClass();
                i7 = RecyclerView.R(childAt);
                if (i7 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = anVar.h9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        i10 = anVar.h9(childAt);
                        break;
                    }
                }
            }
        }
        i7 = -1;
        i10 = 0;
        if (z10 && i7 >= 0 && q1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                dj djVar2 = anVar.C0;
                anVar.A0.getClass();
                djVar2.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) anVar.O9), false);
            } else {
                anVar.C0.h1(i7, i10);
            }
        }
        anVar.f45148c1 = z11;
        anVar.Zc(primaryMessageObject, false);
        anVar.f45148c1 = false;
    }

    @Override
    public final void e0(int i7) {
        CharSequence U2;
        int i10;
        SpannableStringBuilder X2;
        int i11;
        an anVar = this.f49005a;
        try {
            if (i7 == 0) {
                anVar.w7();
                mk mkVar = anVar.O3;
                if (mkVar != null) {
                    mkVar.l(0L, 84, null, new tl(this, 1));
                    anVar.O3.performHapticFeedback(3, 2);
                }
            } else if (i7 == 1) {
                String x10 = org.telegram.messenger.hd.x(anVar.getMessagesController().f25415v4, true);
                if (anVar.getMessagesController().f25415v4 > 0) {
                    i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(org.telegram.ui.Components.x11.g(i11), "TranscriptionTrialLeftUntil", x10));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(org.telegram.ui.Components.x11.g(i10), "TranscriptionTrialLeft", new Object[0]));
                }
                org.telegram.ui.Components.cc.a0(anVar).G(2131624300, 6, X2).k(true);
                anVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i7 == 2 || i7 == 3) {
                String x11 = org.telegram.messenger.hd.x(anVar.getMessagesController().f25415v4, true);
                org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(anVar);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(anVar.getMessagesController().f25398t4, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ");
                if (i7 == 2) {
                    U2 = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131743968, null), new tl(this, 2));
                } else if (anVar.getMessagesController().f25415v4 <= 0) {
                    U2 = "";
                } else {
                    U2 = org.telegram.messenger.g0.U2(org.telegram.messenger.hd.a0(null, null, 2131743967, x11), new tl(this, 3));
                }
                SpannableStringBuilder append2 = append.append(U2);
                a02.getClass();
                org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(a02.W(), a02.f33534c);
                fbVar.c(2131624300, 36, 36, new String[0]);
                if (append2 != null) {
                    String charSequence = append2.toString();
                    int i12 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append2.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i12 >= 6) {
                            append2.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i12++;
                    }
                }
                fbVar.f34552b.setText(append2);
                fbVar.f34552b.setSingleLine(false);
                fbVar.f34552b.setMaxLines(6);
                a02.b(fbVar, 7000).k(true);
                org.telegram.messenger.p2.APP_ERROR.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void e2(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new qi.g(str2, str, false), 0, spannableString.length(), 33);
        org.telegram.messenger.g0.g(spannableString);
        org.telegram.messenger.i20.s(null, 2131752022, org.telegram.ui.Components.cc.a0(this.f49005a));
    }

    public final boolean f() {
        an anVar = this.f49005a;
        if (!org.telegram.messenger.q10.B(anVar.f45187f)) {
            TLRPC.Chat chat = anVar.f45173e;
            if (chat != null) {
                if (org.telegram.messenger.t3.T(chat) && !anVar.f45173e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final boolean f0() {
        if (this.f49005a.f45204g4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f1(org.telegram.messenger.gj gjVar) {
        jl jlVar;
        int i7 = (org.telegram.messenger.gj.B0(gjVar.f23817k) > 1271266957L ? 1 : (org.telegram.messenger.gj.B0(gjVar.f23817k) == 1271266957L ? 0 : -1));
        an anVar = this.f49005a;
        if ((i7 == 0 || ((jlVar = anVar.D0) != null && jlVar.O)) && anVar.f45204g4 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f2(long r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm.f2(long):boolean");
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void g2(org.telegram.ui.Cells.q1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm.g2(org.telegram.ui.Cells.q1, int, float, float, boolean):void");
    }

    @Override
    public final String h(org.telegram.ui.Cells.q1 q1Var) {
        an anVar;
        int i7;
        if (q1Var.getMessageObject() != null && (i7 = (anVar = this.f49005a).Zb) != 0 && i7 == q1Var.getMessageObject().e1() && anVar.f45130ac == 3) {
            return anVar.f45159cc;
        }
        return null;
    }

    @Override
    public final void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        this.f49005a.Y7(q1Var, true, false, f10, f11, false, false, false);
    }

    @Override
    public final boolean h2(org.telegram.ui.Cells.q1 r44, org.telegram.tgnet.TLRPC.TodoItem r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm.h2(org.telegram.ui.Cells.q1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    public final void i(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, boolean z10) {
        an anVar = this.f49005a;
        TLRPC.Chat chat2 = anVar.f45173e;
        if (chat2 != null && chat.f28051id == chat2.f28051id) {
            ui uiVar = anVar.f45314p1;
            if (uiVar != null && i7 == 0) {
                uiVar.e(false, false);
            } else if (q1Var.getMessageObject() != null) {
                anVar.l(i7, q1Var.getMessageObject().e1(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f28051id != chat2.f28051id || anVar.fa()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f28051id);
            if (i7 != 0) {
                bundle.putInt("message_id", i7);
            }
            hi hiVar = null;
            if (z10) {
                vf.b bVar = anVar.dc;
                if (bVar != null) {
                    bVar.a(true);
                    anVar.dc = null;
                }
                if (q1Var != null && q1Var.getMessageObject() != null) {
                    hi hiVar2 = new hi(anVar, q1Var.getMessageObject().e1(), q1Var, 0);
                    anVar.dc = hiVar2;
                    hiVar = hiVar2;
                } else {
                    anVar.dc = null;
                }
            }
            if (anVar.getMessagesController().E(bundle, anVar, q1Var.getMessageObject(), hiVar)) {
                hi hiVar3 = hiVar;
                an anVar2 = new an(bundle);
                if (hiVar3 != null && i7 != 0) {
                    org.telegram.messenger.g0.i3(new ai.f1(this, hiVar3, chat, i7, anVar2, 13), 5000L);
                    hiVar3.d();
                    return;
                }
                anVar.presentFragment(anVar2);
            }
        }
    }

    @Override
    public final int i0(org.telegram.ui.Cells.q1 q1Var) {
        sh.b bVar;
        an anVar = this.f49005a;
        if (anVar.f45172dd.f57082f && (bVar = anVar.f45252jd) != null && bVar.f56851n == q1Var && bVar.f56846a.getWidth() > 0) {
            return anVar.f45252jd.f56846a.getHeight();
        }
        return 0;
    }

    @Override
    public final void i1() {
        an anVar = this.f49005a;
        anVar.h8();
        UndoView undoView = anVar.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, anVar.f45259k6, null);
    }

    @Override
    public final void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (messageObject != null) {
            int a10 = sh.g.a(messageObject);
            boolean a11 = c8.zc.a(a10, 7);
            an anVar = this.f49005a;
            if (a11) {
                org.telegram.ui.Components.cc.a0(anVar).Q(2131624007, 36, sh.g.b(a10, messageObject)).j();
            } else if (i7 < 0 && !arrayList.isEmpty()) {
                anVar.getSendMessagesHelper().w0(messageObject, arrayList, null);
                q1Var.c0(true);
            } else if (anVar.getParentActivity() != null) {
                if (anVar.C2 == null) {
                    int indexOfChild = anVar.f45278m1.indexOfChild(anVar.U);
                    if (indexOfChild == -1) {
                        return;
                    }
                    hi.l3 E6 = anVar.E6(250.0f, 3, indexOfChild + 1, false);
                    anVar.C2 = E6;
                    E6.f14575v0 = 0.0f;
                }
                if (arrayList.isEmpty() && i7 < 0) {
                    ArrayList<org.telegram.ui.Cells.p1> pollButtons = q1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i12 = 0;
                    float f10 = 0.0f;
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        org.telegram.ui.Cells.p1 p1Var = pollButtons.get(i12);
                        float y10 = ((q1Var.getY() + p1Var.f30839b) - org.telegram.messenger.g0.L(4.0f)) - anVar.O9;
                        anVar.F2 = org.telegram.messenger.g0.L(13.3f) + p1Var.f30838a;
                        int D = org.telegram.messenger.i20.D(6.0f, p1Var.f30839b, i11);
                        anVar.G2 = D;
                        if (y10 > 0.0f) {
                            i10 = anVar.F2;
                            i11 = D;
                            f10 = 0.0f;
                            break;
                        }
                        i12++;
                        f10 = y10;
                    }
                    if (f10 != 0.0f) {
                        anVar.A0.w0(0, (int) f10, null);
                        anVar.E2 = q1Var;
                        return;
                    }
                }
                an.q2(anVar, q1Var, i7, i10, i11);
            }
        }
    }

    @Override
    public final void j0(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        an anVar = this.f49005a;
        if (anVar.getParentActivity() != null) {
            if (anVar.f45374ta == null) {
                wh.i iVar = new wh.i(anVar.getParentActivity());
                anVar.f45374ta = iVar;
                anVar.f45278m1.addView(iVar, c8.ja.e(-1, -1, 48));
            }
            wh.i iVar2 = anVar.f45374ta;
            HashMap hashMap = iVar2.f59363a;
            ArrayList arrayList = iVar2.f59365c;
            arrayList.clear();
            int i7 = iVar2.d;
            org.telegram.messenger.m10 i10 = org.telegram.messenger.m10.i(i7);
            long j3 = i10.f24953n;
            arrayList.add(Long.valueOf(j3));
            if (i10.W) {
                ArrayList arrayList2 = org.telegram.messenger.si.b0(i7).f26482j1;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                    long j10 = tL_topPeer.peer.user_id;
                    if (j10 != 0) {
                        int i12 = size;
                        if (org.telegram.messenger.np.s1(i7).a2(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                            arrayList.add(Long.valueOf(j10));
                        }
                        size = i12;
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = org.telegram.messenger.np.s1(i7).f25440y;
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i13);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j11 = dialog.f28055id;
                    if (j11 != j3 && !org.telegram.messenger.m5.C(j11)) {
                        if (org.telegram.messenger.m5.E(dialog.f28055id)) {
                            TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2(Long.valueOf(dialog.f28055id));
                            if (a22 != null && !org.telegram.messenger.q10.t(a22) && !org.telegram.messenger.q10.x(a22) && !org.telegram.messenger.q10.A(a22.f28200id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f28055id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f28055id));
                                }
                            }
                        } else {
                            TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-dialog.f28055id));
                            if (M0 != null && !M0.forum && !org.telegram.messenger.t3.r0(M0) && ((!M0.gigagroup || org.telegram.messenger.t3.N(M0)) && (!org.telegram.messenger.t3.T(M0) || M0.creator || (((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages) || M0.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f28055id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f28055id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = wh.i.b(q1Var);
            if (b10 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    Long l10 = (Long) obj2;
                    if (hashSet.add(l10) && org.telegram.messenger.m5.E(l10.longValue())) {
                        arrayList5.add(l10);
                    }
                }
                wh.h hVar = new wh.h(iVar2, q1Var, arrayList5, new ug.t1(12, iVar2, b10));
                hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
                hVar.setCallback(iVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, hVar);
                }
            }
        }
    }

    @Override
    public final void j2(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull N0;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        an anVar = this.f49005a;
        if (org.telegram.messenger.g0.E1(anVar.getParentActivity()) && (chat = anVar.f45173e) != null && currentUser != null && !org.telegram.messenger.t3.V(chat)) {
            org.telegram.messenger.np messagesController = anVar.getMessagesController();
            long j3 = anVar.f45173e.f28051id;
            long j10 = currentUser.f28200id;
            a0.h hVar = (a0.h) messagesController.f25442y1.f(j3);
            if (hVar == null && (N0 = messagesController.N0(j3)) != null && N0.participants != null) {
                for (int i7 = 0; i7 < N0.participants.participants.size(); i7++) {
                    chatParticipant = N0.participants.participants.get(i7);
                    if (chatParticipant.user_id == j10) {
                        break;
                    }
                }
            }
            chatParticipant = (TLObject) hVar.f(j10);
            d(q1Var, chatParticipant);
        }
    }

    @Override
    public final void k() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.r2.f26198a;
        org.telegram.messenger.t0.r();
        vf.c.t(this.f49005a.getParentActivity(), org.telegram.messenger.r2.f26203g);
    }

    @Override
    public final void k1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        an anVar = this.f49005a;
        if (!anVar.X9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (anVar.getParentActivity() != null) {
                if (anVar.f45162d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    qj qjVar = anVar.f45118a0;
                    org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
                    org.telegram.messenger.gj messageObject2 = q1Var.getMessageObject();
                    gi giVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    vf.b bVar = anVar.dc;
                    if (bVar != null) {
                        bVar.a(true);
                        anVar.dc = null;
                    }
                    if (str != null && q1Var.getMessageObject() != null) {
                        gi giVar2 = new gi(anVar, q1Var.getMessageObject().e1(), str, q1Var, 1);
                        anVar.dc = giVar2;
                        giVar = giVar2;
                    } else {
                        anVar.dc = null;
                    }
                    qjVar.i0(keyboardButtonProto, messageObject, messageObject2, giVar);
                }
            }
        }
    }

    public final void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f28200id);
            org.telegram.ui.ActionBar.e2 e2Var = this.f49005a;
            if (e2Var.getMessagesController().E(bundle, e2Var, q1Var.getMessageObject(), null)) {
                e2Var.presentFragment(new an(bundle));
            }
        }
    }

    @Override
    public final boolean l0() {
        boolean z10;
        an anVar = this.f49005a;
        if (!anVar.Y9()) {
            z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
            if (!z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void l2(org.telegram.ui.Cells.q1 q1Var, long j3) {
        Bundle j10 = a8.p0.j(j3, "user_id");
        org.telegram.ui.ActionBar.e2 e2Var = this.f49005a;
        if (e2Var.getMessagesController().E(j10, e2Var, q1Var.getMessageObject(), null)) {
            e2Var.presentFragment(new an(j10));
        }
    }

    @Override
    public final void m(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
        int i10;
        TLRPC.Document document;
        int i11;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i12;
        TLRPC.Document document3;
        int i13;
        int i14;
        int i15;
        long j3;
        long j10;
        int i16;
        boolean z10;
        boolean z11;
        int i17;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        TLRPC.MessageMedia m12 = org.telegram.messenger.gj.m1(messageObject);
        if (messageMedia != null && messageObject != null && (m12 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                Q1(q1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            an anVar = this.f49005a;
            if (geoPoint != null) {
                if (org.telegram.messenger.g0.J1(anVar)) {
                    pa0 pa0Var = new pa0(3);
                    e6Var2 = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
                    pa0Var.setResourceProvider(e6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = anVar.getMessagesController().z1(anVar.a());
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = messageMedia.geo;
                    String str = messageMedia.address;
                    if (str == null) {
                        if (pollAnswer != null && (tL_textWithEntities = pollAnswer.text) != null) {
                            str = tL_textWithEntities.text;
                        } else {
                            str = "";
                        }
                    }
                    tL_messageMediaGeo.address = str;
                    tL_message.media = tL_messageMediaGeo;
                    pa0Var.Q0 = false;
                    pa0Var.G0(new org.telegram.messenger.gj(org.telegram.messenger.m10.f24934t0, tL_message, false, false));
                    anVar.presentFragment(pa0Var);
                }
            } else if (org.telegram.messenger.gj.N2(messageMedia.document)) {
                ns.p().v(anVar.getParentActivity());
                ns.p().u(new jm(this, tL_messageMediaPoll, pollAnswer, q1Var));
                ns p10 = ns.p();
                TLRPC.Document document4 = messageMedia.document;
                if (org.telegram.messenger.gj.H2(document4)) {
                    i17 = 2;
                } else {
                    i17 = 0;
                }
                org.telegram.messenger.gj messageObject2 = q1Var.getMessageObject();
                e6Var = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
                p10.s(document4, null, "", null, null, i17, false, messageObject2, e6Var, 200);
            } else if (org.telegram.messenger.gj.J3(messageMedia.document)) {
                org.telegram.messenger.gj gjVar = MediaController.B().f22377v0;
                if (MediaController.B().I(messageObject) && gjVar != null) {
                    boolean z12 = gjVar.m0;
                    if (i7 == -3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12 == z11) {
                        if (MediaController.B().H()) {
                            MediaController.B().S(gjVar);
                            return;
                        } else {
                            MediaController.B().R(gjVar, true);
                            return;
                        }
                    }
                }
                TLRPC.Message message = messageObject.f23817k;
                TLRPC.TL_message R7 = an.R7(message);
                R7.media = messageMedia;
                R7.attachPath = sh.d.c(i7, message);
                ArrayList arrayList = new ArrayList();
                i16 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(i16, R7, false, true);
                if (i7 == -3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gjVar2.m0 = z10;
                arrayList.add(gjVar2);
                if (MediaController.B().I(messageObject)) {
                    MediaController.B().q(false, true, false, false);
                }
                MediaController.B().o0(arrayList, gjVar2, 0L, true, null, 0L);
            } else {
                TLRPC.Document document5 = messageMedia.document;
                if (document5 != null && !org.telegram.messenger.gj.K4(document5)) {
                    i14 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    sh.a aVar = new sh.a(i14, messageObject, document6, sh.d.c(i7, messageObject.f23817k));
                    if (aVar.f56845g) {
                        org.telegram.messenger.w7.G(i14).f(document6);
                        aVar.a();
                        q1Var.b0();
                        return;
                    } else if (!aVar.f56844f) {
                        org.telegram.messenger.w7.G(i14).W(document6, messageObject, 2, 0);
                        aVar.a();
                        q1Var.b0();
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.f23817k;
                        TLRPC.TL_message R72 = an.R7(message2);
                        R72.media = messageMedia;
                        R72.attachPath = sh.d.c(i7, message2);
                        i15 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                        org.telegram.messenger.gj gjVar3 = new org.telegram.messenger.gj(i15, R72, false, true);
                        if (org.telegram.messenger.gj.y(messageMedia.document)) {
                            PhotoViewer.p1().I2(null, anVar, anVar.Aa);
                            PhotoViewer p12 = PhotoViewer.p1();
                            int i18 = gjVar3.D;
                            long j11 = 0;
                            if (i18 != 0) {
                                j3 = anVar.f45259k6;
                            } else {
                                j3 = 0;
                            }
                            if (i18 != 0) {
                                j10 = anVar.f45154c7;
                            } else {
                                j10 = 0;
                            }
                            if (i18 != 0) {
                                j11 = anVar.b();
                            }
                            p12.e2(gjVar3, anVar, j3, j10, j11, anVar.f45158cb);
                            return;
                        }
                        try {
                            org.telegram.messenger.g0.u2(gjVar3, anVar.getParentActivity(), anVar.Aa, false);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            anVar.M6(gjVar3);
                            return;
                        }
                    }
                }
                TLRPC.Message message3 = messageObject.f23817k;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.gj.K4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i10 = arrayList3.size();
                    } else {
                        i10 = -1;
                    }
                    TLRPC.TL_message R73 = an.R7(message3);
                    R73.media = messageMedia3;
                    R73.attachPath = sh.d.c(-2, message3);
                    i13 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    arrayList3.add(new org.telegram.messenger.gj(i13, R73, false, true));
                    arrayList2.add(-2);
                } else {
                    i10 = -1;
                }
                if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.gj.K4(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i10 = arrayList3.size();
                    }
                    TLRPC.TL_message R74 = an.R7(message3);
                    R74.media = messageMedia2;
                    R74.attachPath = sh.d.c(-3, message3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    R74.message = pollResults2.solution;
                    R74.entities = pollResults2.solution_entities;
                    i12 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    arrayList3.add(new org.telegram.messenger.gj(i12, R74, false, true));
                    arrayList2.add(-3);
                }
                cg.d.b(tL_messageMediaPoll.poll, anVar.getUserConfig().e());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
                if (arrayList4 == null) {
                    arrayList4 = poll.answers;
                }
                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i19);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || org.telegram.messenger.gj.K4(document))) {
                        if (pollAnswer2.unshuffled_index == i7) {
                            i10 = arrayList3.size();
                        }
                        TLRPC.TL_message R75 = an.R7(message3);
                        R75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        R75.message = tL_textWithEntities2.text;
                        R75.entities = tL_textWithEntities2.entities;
                        R75.attachPath = sh.d.c(pollAnswer2.unshuffled_index, message3);
                        i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                        arrayList3.add(new org.telegram.messenger.gj(i11, R75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i10 > -1 && !arrayList3.isEmpty()) {
                    messageObject.f23849s0 = arrayList2;
                    PhotoViewer.p1().I2(null, anVar, anVar.Aa);
                    PhotoViewer.p1().a2(arrayList3, i10, anVar.a(), 0L, 0L, anVar.f45171db);
                }
            }
        }
    }

    public final void n(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f28051id);
            bundle.putBoolean("expandPhoto", false);
            this.f49005a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void n0(String str) {
        an anVar = this.f49005a;
        uj ujVar = anVar.f45162d1;
        if (ujVar == null || ujVar.getVisibility() != 0) {
            tj tjVar = anVar.T;
            if ((tjVar == null || tjVar.getVisibility() != 0) && anVar.f45118a0 != null && str != null && str.length() > 0) {
                qj qjVar = anVar.f45118a0;
                qjVar.setFieldText("@" + str + " ");
                anVar.f45118a0.W0();
            }
        }
    }

    @Override
    public final void o(org.telegram.ui.Cells.q1 q1Var) {
        float f10;
        if (q1Var.getMessageObject().y3()) {
            i1();
            return;
        }
        an anVar = this.f49005a;
        if (!anVar.A3 && anVar.A0 != null && anVar.getParentActivity() != null && anVar.fragmentView != null) {
            if (anVar.J2 == null) {
                int indexOfChild = anVar.f45278m1.indexOfChild(anVar.U);
                if (indexOfChild != -1) {
                    hi.l3 E6 = anVar.E6(250.0f, 3, indexOfChild + 1, false);
                    anVar.J2 = E6;
                    E6.u(org.telegram.messenger.hd.M0(2131749329, null));
                } else {
                    return;
                }
            }
            org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
            if (messageObject != null) {
                TLRPC.User currentUser = q1Var.getCurrentUser();
                if (currentUser != null && currentUser.f28200id == 0) {
                    f10 = (q1Var.getMeasuredHeight() - Math.max(0, q1Var.getBottom() - ((View) q1Var.getParent()).getMeasuredHeight())) - org.telegram.messenger.g0.L(50.0f);
                } else {
                    float L = org.telegram.messenger.g0.L(22.0f);
                    if (!messageObject.P3() && q1Var.f31043k9 && q1Var.V8 != null) {
                        f10 = org.telegram.messenger.g0.L(20.0f) + L;
                    } else {
                        f10 = L;
                    }
                }
                if (anVar.w9(q1Var, f10) > org.telegram.messenger.g0.L(80.0f)) {
                    anVar.J2.x(anVar.v9(q1Var, q1Var.getForwardNameCenterX()), anVar.w9(q1Var, f10) - org.telegram.messenger.g0.L(4.0f), true);
                }
            }
        }
    }

    @Override
    public final boolean o0(org.telegram.ui.Components.p5 p5Var) {
        TLRPC.InputStickerSet i12;
        int i7;
        an anVar = this.f49005a;
        if (!anVar.getMessagesController().D3() && p5Var != null && !p5Var.standard) {
            long documentId = p5Var.getDocumentId();
            TLRPC.Document document = p5Var.document;
            if (document == null) {
                i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                document = org.telegram.ui.Components.g5.e(i7, documentId);
            }
            if (document != null && (i12 = org.telegram.messenger.gj.i1(document)) != null) {
                org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24934t0).m0(i12, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(i12);
                org.telegram.ui.Components.wu wuVar = new org.telegram.ui.Components.wu(anVar, anVar.getParentActivity(), anVar.Aa, arrayList);
                org.telegram.ui.Components.ou ouVar = wuVar.f41449q1;
                ouVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(ouVar);
                ouVar.f38085w = imageReceiver;
                if (ouVar.d) {
                    imageReceiver.P();
                }
                ouVar.f38086x = true;
                ouVar.f38087y.e(true, 1.0f);
                ouVar.f38085w.r0(org.telegram.messenger.gc.b(document), "140_140", org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), "140_140", org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.j6.f29014m6, 0.2f, true), 0L, null, null, 0);
                ouVar.f38085w.E0(7);
                ImageReceiver imageReceiver2 = ouVar.f38085w;
                imageReceiver2.f22303v0 = true;
                imageReceiver2.f22301u0 = true;
                imageReceiver2.W(1);
                ImageReceiver imageReceiver3 = ouVar.f38085w;
                imageReceiver3.f22309x0 = true;
                imageReceiver3.H0(ouVar);
                boolean V9 = anVar.V9();
                wuVar.f29700i0 = V9;
                wuVar.f29707n = V9;
                anVar.showDialog(wuVar);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void p() {
        this.f49005a.f45278m1.getClass();
    }

    @Override
    public final void p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        TLRPC.WebPage webPage;
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.User user;
        String M0;
        int i12;
        TLRPC.User user2;
        int i13;
        TLRPC.WebPage webPage2;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        final boolean z10;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        boolean z11 = false;
        em emVar = null;
        em emVar2 = null;
        File file = null;
        em emVar3 = null;
        em emVar4 = null;
        an anVar = this.f49005a;
        if (i7 == 19) {
            vf.b bVar = anVar.dc;
            if (bVar != null) {
                bVar.a(true);
            }
            if (q1Var.getMessageObject() != null) {
                emVar2 = new em(this, q1Var, 2);
            }
            final em emVar5 = emVar2;
            anVar.dc = emVar5;
            final Activity parentActivity = anVar.getParentActivity();
            final org.telegram.ui.ActionBar.e6 resourceProvider = anVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            emVar5.d();
            emVar5.f58805b = new wg.c(atomicBoolean, 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.f23817k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia3;
                tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                tL_messageMediaGiveaway.flags = tL_messageMediaGiveawayResults.flags;
            } else {
                tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
            }
            final TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
            final String b10 = wg.h.b(messageObject);
            TLRPC.Chat M02 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).M0(Long.valueOf(-messageObject.Z0()));
            if (M02 != null && org.telegram.messenger.t3.V(M02)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j3 = messageObject.f23817k.date * 1000;
            wg.q.d(messageObject, new org.telegram.messenger.z10(atomicBoolean, emVar5, z10, b10, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f59169a;
                public final vf.b f59170b;
                public final boolean f59171c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway f59172e;
                public final Context f59173f;
                public final e6 f59174g;

                {
                    this.f59172e = tL_messageMediaGiveaway2;
                    this.f59173f = parentActivity;
                    this.f59174g = resourceProvider;
                }

                @Override
                public final void a(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f59169a.get()) {
                        this.f59170b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f59171c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.f59172e;
                        Context context = this.f59173f;
                        e6 e6Var = this.f59174g;
                        if (z12) {
                            h.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, e6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            h.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, e6Var);
                        }
                    }
                }
            }, new wg.e(atomicBoolean, emVar5, 0));
        } else if (i7 == 21) {
            org.telegram.messenger.t0.u();
            boolean z12 = org.telegram.messenger.r2.f26198a;
            org.telegram.messenger.t0.r();
            vf.c.t(anVar.getParentActivity(), org.telegram.messenger.r2.f26203g);
        } else if (i7 == 84) {
            anVar.Wa(q1Var);
        } else if (i7 == 80) {
            org.telegram.ui.Cells.n8 n8Var = org.telegram.ui.Components.te0.M1;
            if (anVar.getParentActivity() != null) {
                anVar.showDialog(new org.telegram.ui.Components.te0(anVar.getContext(), anVar.getCurrentAccount(), messageObject, anVar.getResourceProvider()));
            }
        } else if (i7 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.f23817k.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(messageObject) == null) {
                    anVar.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i7 == 5) {
            long j10 = messageObject.f23817k.media.user_id;
            if (j10 != 0) {
                i13 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                user2 = org.telegram.messenger.np.s1(i13).a2(Long.valueOf(j10));
            } else {
                user2 = null;
            }
            TLRPC.MessageMedia messageMedia5 = messageObject.f23817k.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user2 != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.f28200id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                anVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str2)) {
                    File g12 = org.telegram.messenger.g0.g1();
                    g12.mkdirs();
                    file = new File(g12, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str2);
                    bufferedWriter.close();
                }
                anVar.showDialog(new org.telegram.ui.Components.bd0(anVar, null, user2, null, file, pf.b.d(str, false), str3, str4, anVar.Aa));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (i7 == 30) {
            anVar.presentFragment(new an(a8.p0.j(messageObject.f23817k.media.user_id, "user_id")));
        } else if (i7 == 31) {
            long j11 = messageObject.f23817k.media.user_id;
            if (j11 != 0) {
                i12 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                user = org.telegram.messenger.np.s1(i12).a2(Long.valueOf(j11));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.Z1)) {
                    M0 = messageObject.Z1.toString();
                } else if (!TextUtils.isEmpty(user.phone)) {
                    M0 = org.telegram.messenger.k5.h(new StringBuilder("+"), user.phone, pf.b.c());
                } else {
                    String str5 = org.telegram.messenger.gj.n1(messageObject.f23817k).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        M0 = pf.b.c().b(str5);
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131747832, null);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.f28200id);
                bundle2.putString("phone", M0);
                bundle2.putBoolean("addContact", true);
                anVar.presentFragment(new pr(bundle2));
            }
        } else if (i7 != 23 && i7 != 24) {
            if (messageObject.r4()) {
                anVar.ma(messageObject, false, false);
                if (messageObject.T0 != null) {
                    vf.b bVar2 = anVar.dc;
                    if (bVar2 != null) {
                        bVar2.a(true);
                    }
                    if (q1Var.getMessageObject() != null) {
                        emVar3 = new em(this, q1Var, 4);
                    }
                    anVar.dc = emVar3;
                    vf.c.s(anVar.getParentActivity(), Uri.parse(messageObject.T0), true, false, false, anVar.dc, null, false, anVar.getMessagesController().f25269e6, false, false);
                    return;
                }
                return;
            }
            TLRPC.WebPage W1 = messageObject.W1();
            if (W1 == null && (message = messageObject.f23817k) != null && (messageMedia2 = message.media) != null) {
                W1 = messageMedia2.webpage;
            }
            if (W1 != null) {
                if (W1.attributes != null) {
                    for (int i14 = 0; i14 < W1.attributes.size(); i14++) {
                        if ((W1.attributes.get(i14) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) W1.attributes.get(i14)).storyItem) != null) {
                            storyItem.dialogId = org.telegram.messenger.m5.o(tL_webPageAttributeStory.peer);
                            tL_webPageAttributeStory.storyItem.messageId = messageObject.e1();
                            tL_webPageAttributeStory.storyItem.messageType = 1;
                            anVar.getOrCreateStoryViewer().L(anVar.getParentActivity(), tL_webPageAttributeStory.storyItem, fi.b7.a(anVar.A0));
                            return;
                        }
                    }
                }
                if (!anVar.Ha(W1.url, q1Var, null, messageObject.e1(), 2)) {
                    vf.b bVar3 = anVar.dc;
                    if (bVar3 != null) {
                        bVar3.a(true);
                    }
                    if (q1Var.getMessageObject() != null) {
                        emVar4 = new em(this, q1Var, 5);
                    }
                    anVar.dc = emVar4;
                    vf.c.s(anVar.getParentActivity(), Uri.parse(W1.url), true, true, false, anVar.dc, null, false, true, false, false);
                }
            }
        } else {
            if (i7 == 24) {
                z11 = true;
            }
            TLRPC.Message message2 = messageObject.f23817k;
            if (message2 != null && (messageMedia = message2.media) != null) {
                webPage = messageMedia.webpage;
            } else {
                webPage = null;
            }
            if (webPage != null && webPage.url != null) {
                Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage.url);
                vf.b bVar4 = anVar.dc;
                if (bVar4 != null) {
                    bVar4.a(true);
                }
                if (q1Var.getMessageObject() != null) {
                    emVar = new em(this, q1Var, 3);
                }
                anVar.dc = emVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    if (org.telegram.messenger.si.b0(i10).p0(group) == null) {
                        anVar.dc.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                        anVar.dc.f58805b = new ai.v0(this, ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getStickerSet, new hi.b3(3, this, z11)), 29);
                        return;
                    }
                }
                vf.c.s(anVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, anVar.dc, null, false, true, false, false);
            }
        }
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.gj messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (q1Var != null && pageBlock != null) {
            an anVar = this.f49005a;
            if (anVar.getParentActivity() != null && (messageObject = q1Var.getMessageObject()) != null && (message = messageObject.f23817k) != null && messageObject.f23874y2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.f23874y2.f24445g;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    org.telegram.messenger.cu cuVar = (org.telegram.messenger.cu) arrayList2.get(i7);
                    if (cuVar instanceof org.telegram.messenger.qu) {
                        arrayList.add(((org.telegram.messenger.qu) cuVar).f26131r0);
                    } else if (cuVar instanceof org.telegram.messenger.cv) {
                        arrayList.add(((org.telegram.messenger.cv) cuVar).f22944r0);
                    } else if (cuVar instanceof org.telegram.messenger.hu) {
                        ArrayList arrayList3 = ((org.telegram.messenger.hu) cuVar).Y;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            arrayList.add(((org.telegram.messenger.vt) obj).f27238b);
                        }
                    } else if (cuVar instanceof org.telegram.messenger.uu) {
                        ArrayList arrayList4 = ((org.telegram.messenger.uu) cuVar).Y;
                        int size2 = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            arrayList.add(((org.telegram.messenger.vt) obj2).f27238b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.I2(null, anVar, null);
                    return p12.d2(null, null, null, null, null, null, null, indexOf, new rl(anVar, arrayList), null, 0L, 0L, 0L, true, new ql(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    public final void q(TLRPC.User user, boolean z10) {
        int i7;
        if (user != null && user.f28200id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i10 = 0;
            if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f28200id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            an anVar = this.f49005a;
            TLRPC.User user2 = anVar.f45187f;
            if (user2 != null && user2.f28200id == user.f28200id) {
                i10 = 1;
            }
            profileActivity.i5(i10);
            Activity parentActivity = anVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
            org.telegram.messenger.g0.l3(parentActivity, i7);
            anVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void q0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        an anVar = this.f49005a;
        anVar.Y7(q1Var, false, false, f10, f11, true, false, false);
        anVar.A0.getClass();
        an.l2(anVar, RecyclerView.R(q1Var));
    }

    @Override
    public final void q2(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f49005a.Zc(primaryMessageObject, false);
    }

    @Override
    public final void r(org.telegram.ui.Cells.q1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm.r(org.telegram.ui.Cells.q1):void");
    }

    @Override
    public final void s2() {
        this.f49005a.O9();
    }

    @Override
    public final void t() {
        this.f49005a.Fc();
    }

    @Override
    public final void t1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        wh.h hVar;
        int i7;
        boolean z10;
        boolean z11;
        float f12;
        wh.i iVar = this.f49005a.f45374ta;
        if (iVar != null && (hVar = (wh.h) iVar.f59363a.get(wh.i.b(q1Var))) != null) {
            wh.d[] dVarArr = hVar.f59361x;
            RectF rectF = hVar.f59358r;
            if (hVar.N) {
                float f13 = (f10 - rectF.left) + hVar.V;
                float f14 = (f11 - rectF.top) + hVar.W;
                int i10 = wh.g.f59343a;
                int floor = (int) Math.floor((f13 - (org.telegram.messenger.g0.L(9) - (org.telegram.messenger.g0.L(11) / 2.0f))) / org.telegram.messenger.g0.L(wh.g.f59343a + 11));
                if ((-org.telegram.messenger.g0.L(37)) < f14 && f14 < rectF.height()) {
                    i7 = c8.i9.b(floor, 0, dVarArr.length - 1);
                } else {
                    i7 = -1;
                }
                if (hVar.S != i7) {
                    hVar.f59350a.performHapticFeedback(3, 1);
                    hVar.S = i7;
                    for (int i11 = 0; i11 < dVarArr.length; i11++) {
                        wh.d dVar = dVarArr[i11];
                        if (i7 == i11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f15 = 1.0f;
                        if (dVar.f59321p != z10) {
                            ValueAnimator valueAnimator = dVar.f59319n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f59321p = z10;
                            float f16 = dVar.f59320o;
                            if (z10) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f16, f12);
                            dVar.f59319n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f59319n.addUpdateListener(dVar);
                            dVar.f59319n.setInterpolator(wh.f.f59325a);
                            dVar.f59319n.start();
                        }
                        wh.d dVar2 = dVarArr[i11];
                        if (i7 != i11 && i7 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f59318m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f59316k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f59318m = z11;
                            float f17 = dVar2.f59317l;
                            if (!z11) {
                                f15 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f17, f15);
                            dVar2.f59316k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f59316k.addUpdateListener(dVar2);
                            dVar2.f59316k.setInterpolator(wh.f.f59325a);
                            dVar2.f59316k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void t2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.f49005a.n8(q1Var, reactionCount, z10, f10, f11);
    }

    @Override
    public final void u(org.telegram.ui.Cells.q1 q1Var) {
        int i7;
        int i10;
        dj djVar;
        org.telegram.messenger.gj primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.f23785c3 = !primaryMessageObject.f23785c3;
            primaryMessageObject.M1 = true;
            an anVar = this.f49005a;
            aj ajVar = anVar.A0;
            if (ajVar != null && (djVar = anVar.C0) != null && djVar.f58498y < 0) {
                for (int childCount = ajVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = anVar.A0.getChildAt(childCount);
                    anVar.A0.getClass();
                    i7 = RecyclerView.R(childAt);
                    if (i7 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                                i10 = anVar.h9(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                            i10 = anVar.h9(childAt);
                            break;
                        }
                    }
                }
            }
            i7 = -1;
            i10 = 0;
            anVar.Zc(primaryMessageObject, false);
            hi.l3 l3Var = anVar.P1;
            if (l3Var != null) {
                l3Var.f(true);
            }
            if (i7 >= 0 && q1Var.getCurrentMessagesGroup() == null) {
                anVar.C0.h1(i7, i10);
            }
        }
    }

    @Override
    public final void u0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        an anVar = this.f49005a;
        kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
        boolean z10 = true;
        if (!kVar.x() && !anVar.Y9()) {
            if (q1Var != null && q1Var.getMessageObject() != null && q1Var.getMessageObject().r4()) {
                p1(q1Var, 10);
                return;
            }
            if (!org.telegram.messenger.t3.c0(anVar.f45173e) && !anVar.fa()) {
                z10 = false;
            }
            q(user, z10);
            return;
        }
        an.k2(anVar, q1Var, true, f10, f11);
    }

    @Override
    public final boolean v2(int i7) {
        boolean z10;
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        if (i7 != 16 && i7 != 2131296267 && i7 != 2131296264) {
            return false;
        }
        an anVar = this.f49005a;
        z10 = ((org.telegram.ui.ActionBar.e2) anVar).inPreviewMode;
        if (z10 && anVar.fa) {
            o4Var = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
            if (o4Var != null) {
                o4Var2 = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
                ((ActionBarLayout) o4Var2).r();
            }
            return true;
        }
        return !c();
    }

    @Override
    public final void w(org.telegram.ui.Cells.q1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm.w(org.telegram.ui.Cells.q1):void");
    }

    @Override
    public final void w0(org.telegram.ui.Cells.q1 r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lm.w0(org.telegram.ui.Cells.q1, float, float, boolean):void");
    }

    @Override
    public final String x(long j3) {
        TLRPC.Peer peer;
        String C0;
        an anVar = this.f49005a;
        if (org.telegram.messenger.q10.u(anVar.f45187f)) {
            return null;
        }
        TLRPC.Chat chat = anVar.f45173e;
        if (chat != null && !org.telegram.messenger.t3.V(chat) && (C0 = anVar.getMessagesController().C0(anVar.f45173e.f28051id, j3)) != null) {
            return C0;
        }
        TLRPC.TL_forumTopic tL_forumTopic = anVar.f45344r4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j3 && peer.channel_id != j3 && peer.chat_id != j3)) {
            return null;
        }
        return org.telegram.messenger.hd.M0(2131744020, null);
    }

    @Override
    public final boolean x1() {
        an anVar = this.f49005a;
        if (anVar.f45278m1.getMeasuredWidth() > anVar.f45278m1.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void x2() {
        an anVar = this.f49005a;
        if (anVar.getUserConfig().q()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", anVar.f45259k6);
            bundle.putInt("start_from", 10);
            anVar.presentFragment(new org.telegram.ui.Components.x80(bundle, anVar.f45314p1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.cc.a0(anVar).Q(2131624217, 36, org.telegram.messenger.g0.U2(org.telegram.messenger.hd.H(',', "UnlockSimilarChannelsPremium", anVar.getMessagesController().f25445y4), new tl(this, 4))).j();
    }

    @Override
    public final boolean y0(org.telegram.messenger.gj gjVar) {
        return !this.f49005a.f45353s.containsKey(gjVar);
    }

    @Override
    public final void y2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
        org.telegram.messenger.gj messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        an anVar = this.f49005a;
        hi.l3 l3Var = anVar.P1;
        if (l3Var != null) {
            l3Var.f(true);
        }
        if (anVar.getParentActivity() != null && (messageObject = q1Var.getMessageObject()) != null && (R0 = messageObject.R0()) != null && R0.country != null) {
            try {
                str = new Locale("", R0.country).getDisplayCountry(org.telegram.messenger.hd.E0().f24129y);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                str = R0.country;
            }
            hi.l3 l3Var2 = new hi.l3(anVar.getParentActivity(), 3);
            l3Var2.r(true);
            l3Var2.L = Layout.Alignment.ALIGN_NORMAL;
            l3Var2.d = -1L;
            l3Var2.U = true;
            l3Var2.f14554e = true;
            l3Var2.s(12.0f);
            anVar.P1 = l3Var2;
            l3Var2.f14570r0 = new zg(6, this, l3Var2);
            l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750848, str)));
            anVar.P1.l(anVar.L);
            anVar.f45278m1.addView(anVar.P1, c8.ja.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            anVar.f45278m1.post(new l2.x(this, q1Var, i10, i7, 12));
        }
    }

    @Override
    public final void z(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (messageObject != null && messageObject.D == 27) {
            messageObject.Y5();
            messageObject.M1 = true;
            q1Var.H1();
            q1Var.requestLayout();
            this.f49005a.D0.R(messageObject, false, false);
        }
    }

    @Override
    public final void z0(org.telegram.ui.Cells.q1 q1Var) {
        sh.b bVar = this.f49005a.f45252jd;
        if (bVar != null && bVar.f56851n == q1Var) {
            bVar.f56855x.getClass();
        }
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        an anVar = this.f49005a;
        if (anVar.Zb != 0 && q1Var.getMessageObject() != null && anVar.Zb == q1Var.getMessageObject().e1() && anVar.f45130ac == i7) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.i9 z2() {
        return this.f49005a.f45373t9;
    }
}
