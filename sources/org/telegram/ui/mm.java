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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.UndoView;
public final class mm implements org.telegram.ui.Cells.l1 {
    public final bn f49922a;

    public mm(bn bnVar) {
        this.f49922a = bnVar;
    }

    @Override
    public final void A0() {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.fj messageObject;
        org.telegram.ui.Components.b6 m10;
        bn bnVar = this.f49922a;
        if (!bnVar.A3 && !org.telegram.messenger.bz.A0 && bnVar.A0 != null && bnVar.getParentActivity() != null && bnVar.fragmentView != null) {
            hi.m3 m3Var = bnVar.I2;
            if (m3Var == null || !m3Var.W) {
                if (m3Var == null) {
                    int indexOfChild = bnVar.f46093m1.indexOfChild(bnVar.U);
                    if (indexOfChild != -1) {
                        hi.m3 E6 = bnVar.E6(250.0f, 3, indexOfChild + 1, false);
                        bnVar.I2 = E6;
                        E6.d = 10000L;
                        E6.m(bnVar.getParentActivity().getResources().getDrawable(2131232789).mutate());
                        bnVar.I2.v(org.telegram.messenger.gd.M0(2131753760, null));
                    } else {
                        return;
                    }
                }
                int childCount = bnVar.A0.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = bnVar.A0.getChildAt(i7);
                    if ((childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && org.telegram.messenger.fj.L4(messageObject.f23968k) && (m10 = q1Var.getPhotoImage().m()) != null && m10.o() >= 3000 && !bnVar.I2.W) {
                        ImageReceiver photoImage = q1Var.getPhotoImage();
                        float w92 = bnVar.w9(q1Var, photoImage.M0);
                        float f10 = photoImage.O0;
                        View view = (View) q1Var.getParent();
                        float w93 = bnVar.w9(q1Var, -q1Var.getTop());
                        if (w92 <= org.telegram.messenger.g0.L(80.0f)) {
                            continue;
                        } else if ((w92 + f10) - w93 <= (f10 / 4.0f) + view.getMeasuredHeight()) {
                            bnVar.Lb = q1Var;
                            hi.m3 m3Var2 = bnVar.I2;
                            m3Var2.f15014r0 = new af(bnVar, 22);
                            m3Var2.y(bnVar.v9(q1Var, q1Var.getNoSoundIconCenterX()), w92, true);
                            org.telegram.messenger.bz.D(true);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void B(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
        if (messageObject != null && messageObject.D == 27) {
            messageObject.Y5();
            messageObject.M1 = true;
            q1Var.H1();
            q1Var.requestLayout();
            this.f49922a.D0.R(messageObject, false, false);
        }
    }

    @Override
    public final void B0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.s4 s4Var2;
        bn bnVar = this.f49922a;
        if (bnVar.getParentActivity() != null && tLObject != null) {
            s4Var = ((org.telegram.ui.ActionBar.h2) bnVar).parentLayout;
            if (s4Var != null) {
                s4Var2 = ((org.telegram.ui.ActionBar.h2) bnVar).parentLayout;
                if (((ActionBarLayout) s4Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28405id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f28554id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232569, 2, bnVar.getParentActivity(), bnVar.getResourceProvider());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, bnVar.getResourceProvider());
                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(bnVar.getParentActivity(), false, false);
                z0Var.j(org.telegram.messenger.gd.M0(2131747618, null), 2131232090, null);
                z0Var.setMinimumWidth(160);
                z0Var.setOnClickListener(new a(this, 13));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(bnVar.getParentActivity(), false, false);
                z0Var2.j(org.telegram.messenger.gd.M0(2131746467, null), 2131232046, null);
                z0Var2.setMinimumWidth(160);
                z0Var2.setOnClickListener(new y(this, (TLRPC.Chat) tLObject, q1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
                bn bnVar2 = new bn(bundle);
                bnVar2.f46024ga = true;
                bnVar.presentFragmentAsPreviewWithMenu(bnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                bnVar.s7();
                return;
            }
            bnVar.presentFragment(new bn(bundle));
        }
    }

    @Override
    public final void B1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        f(q1Var, z10, false, z11);
    }

    @Override
    public final void C0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
        int i7 = messageObject.D;
        bn bnVar = this.f49922a;
        if (i7 == 16) {
            TLRPC.MessageAction messageAction = messageObject.f23968k.action;
            int i10 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(bnVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i10 < size) {
                    TLRPC.Peer peer = arrayList.get(i10);
                    i10++;
                    hashSet.add(Long.valueOf(org.telegram.messenger.n5.o(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.e1();
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, bnVar.getParentActivity(), null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = bnVar.getMessagesController().S6;
                u1Var.setOnCancelListener(new di.z(this, bnVar.getConnectionsManager().sendRequest(getgroupcall, new di.m7(this, u1Var, hashSet, tL_inputGroupCallInviteMessage, messageObject)), 2));
                u1Var.r(600L);
                return;
            }
            TLRPC.User user = bnVar.f46001f;
            if (user != null) {
                boolean J4 = messageObject.J4();
                TLRPC.UserFull userFull = bnVar.f46176s8;
                if (userFull != null && userFull.video_calls_available) {
                    i10 = 1;
                }
                org.telegram.ui.Components.voip.b2.m(user, J4, i10, bnVar.getParentActivity(), bnVar.getMessagesController().d2(bnVar.f46001f.f28554id), bnVar.getAccountInstance());
                return;
            }
            return;
        }
        bnVar.Y7(q1Var, true, false, f10, f11, messageObject.I3(), false, false);
    }

    @Override
    public final void C1(org.telegram.ui.Cells.q1 q1Var) {
        bn.f5(this.f49922a, q1Var);
    }

    @Override
    public final void E(org.telegram.ui.Cells.q1 q1Var) {
        bn bnVar = this.f49922a;
        if (!bnVar.getMessagesController().e5()) {
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, bnVar.getParentActivity(), null);
            u1Var.r(200L);
            bnVar.getMessagesController().T0(new x(this, u1Var, q1Var, 6));
            return;
        }
        if (q1Var.getMessageObject() != null) {
            q1Var.getMessageObject().f24006t2 = Boolean.FALSE;
        }
        q1Var.J3();
    }

    @Override
    public final void F0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.fj messageObject;
        if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null && messageObject.f23968k != null) {
            int e12 = messageObject.e1();
            bn bnVar = this.f49922a;
            if (bnVar.f45944ac != e12 || bnVar.f45959bc != 7) {
                TLRPC.InputPeer l1 = bnVar.getMessagesController().l1(org.telegram.messenger.fj.B0(messageObject.f23968k));
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = l1;
                getrichmessage.f28627id = e12;
                vf.b bVar = bnVar.f45999ec;
                if (bVar != null) {
                    bVar.a(true);
                    bnVar.f45999ec = null;
                }
                hi hiVar = new hi(bnVar, e12, q1Var, 2);
                hiVar.f59374b = new k9(20, bnVar, r3);
                bnVar.f45999ec = hiVar;
                hiVar.d();
                int[] iArr = {bnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new d3.b(1), new ne(bnVar, hiVar, iArr, q1Var, messageObject, 2))};
            }
        }
    }

    @Override
    public final void F1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        f(q1Var, z10, false, false);
    }

    @Override
    public final void H0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        f(q1Var, z10, true, z11);
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
        vj vjVar;
        uj ujVar;
        if (!g()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(org.telegram.messenger.v3.K(chat, false));
        bn bnVar = this.f49922a;
        if (!isEmpty && bnVar.f45987e != null && (((vjVar = bnVar.f45976d1) == null || vjVar.getVisibility() != 0) && ((ujVar = bnVar.T) == null || ujVar.getVisibility() != 0))) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        TLRPC.Chat chat2 = bnVar.f45987e;
        if (chat2 != null && ((bnVar.f46173s4 == 0 || bnVar.f46236x4) && (!org.telegram.messenger.v3.T(chat2) || bnVar.f45987e.megagroup))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat3 = bnVar.f45987e;
        if (chat3 != null && chat3.f28405id == chat.f28405id && !bnVar.fa()) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        c5[] c5VarArr = new c5[i11 + 1 + i7 + i10];
        c5VarArr[0] = c5.d;
        if (i11 != 0) {
            if (chat.broadcast) {
                c5Var = c5.f46396e;
            } else {
                c5Var = c5.f46397f;
            }
            c5VarArr[1] = c5Var;
            i12 = 2;
        } else {
            i12 = 1;
        }
        if (i7 != 0) {
            c5VarArr[i12] = c5.f46398n;
            i12++;
        }
        if (i10 != 0) {
            c5VarArr[i12] = c5.f46399r;
        }
        TLRPC.ChatFull P0 = bnVar.getMessagesController().P0(chat.f28405id);
        if (P0 == null) {
            i13 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
            org.telegram.messenger.fc m10 = org.telegram.messenger.fc.m(org.telegram.messenger.j10.f24773t0, 0, chat);
            org.telegram.messenger.fc m11 = org.telegram.messenger.fc.m(org.telegram.messenger.j10.f24773t0, 1, chat);
            if (m11 != null && (m11.f23875k instanceof TLRPC.TL_photoStrippedSize)) {
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
            w4Var = new w4(m10, m11, null, str, null, null, bitmapDrawable, chat, c5VarArr, new y4(i13, org.telegram.messenger.ks.T, chat));
        } else {
            w4Var = w4.a(chat, P0, c5VarArr);
            i14 = i7;
            i15 = i10;
            z10 = true;
            str2 = null;
            z11 = i11;
        }
        if (ab.q.h(w4Var)) {
            ab.q.o().D((ViewGroup) bnVar.fragmentView, bnVar.Ba, w4Var, new z6(this, chat, q1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(bnVar, q1Var);
        I.c(2131232268, org.telegram.messenger.gd.M0(2131747593, str2), new xl(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        if (z12) {
            i16 = 2131232090;
        } else {
            i16 = 2131232115;
        }
        if (z12) {
            i17 = 2131747618;
        } else {
            i17 = 2131747606;
        }
        I.l(i16, org.telegram.messenger.gd.M0(i17, str2), new o1(this, q1Var, chat, 25), z11);
        I.l(2131232224, org.telegram.messenger.gd.M0(2131748417, str2), new xl(this, chat, z10 ? 1 : 0), i14);
        I.l(2131232356, org.telegram.messenger.gd.M0(2131753756, str2), new xl(this, chat, 2), i15);
        I.f42377t = false;
        I.f42356i = 3;
        I.Z = true;
        I.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        I.a0();
        return true;
    }

    @Override
    public final void I(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.p2 p2Var) {
        TLRPC.Message message;
        int i7;
        int i10;
        int i11;
        int L;
        org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.f23968k) != null) {
            int i12 = p2Var.f26182a;
            TL_stars.StarsAmount starsAmount = null;
            bn bnVar = this.f49922a;
            if (i12 == 1) {
                long o4 = org.telegram.messenger.n5.o(message.from_id);
                li.d dVar = new li.d(24, this, message);
                Pattern pattern = org.telegram.ui.Components.b5.f33529a;
                Activity parentActivity = bnVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, null);
                String M0 = org.telegram.messenger.gd.M0(2131744152, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131744151, org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24773t0).D1(o4, false)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                org.telegram.ui.ActionBar.u6.U(editText, org.telegram.ui.ActionBar.n6.G6, null);
                editText.setHint(org.telegram.messenger.gd.M0(2131744150, null));
                org.telegram.ui.ActionBar.u6.D(editText, org.telegram.ui.ActionBar.n6.H6, null);
                editText.setTextSize(1, 16.0f);
                editText.setBackground(org.telegram.ui.ActionBar.n6.U(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.s4(parentActivity)});
                if (org.telegram.messenger.gd.f24216a0) {
                    i11 = org.telegram.messenger.g0.L(24.0f);
                } else {
                    i11 = 0;
                }
                int L2 = org.telegram.messenger.g0.L(8.0f);
                if (org.telegram.messenger.gd.f24216a0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(24.0f);
                }
                editText.setPadding(i11, L2, L, org.telegram.messenger.g0.L(8.0f));
                editText.setSelection(editText.getText().toString().length());
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751593, null), new oi.e0(28, dVar, editText));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                u1Var.O = new org.telegram.ui.Components.q1(editText, 0);
                frameLayout.addView(editText, c8.ma.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.lg(editText, 3), 100L);
                bnVar.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, null);
                }
            } else if (i12 == 2) {
                if (message.suggested_post != null) {
                    i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    boolean A = org.telegram.messenger.v3.A(i7, bnVar.f45987e, 24);
                    if (A) {
                        i10 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                        org.telegram.messenger.v3.A(i10, bnVar.f45987e, 5);
                    }
                    aa.c0 c0Var = new aa.c0(this, message, A, messageObject, 28);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    bnVar.v7(c0Var, cg.a.m(starsAmount), !A);
                }
            } else if (i12 == 3) {
                bnVar.Y7(q1Var, true, false, q1Var.getLastTouchX(), q1Var.getLastTouchY(), true, false, true);
            } else if (i12 == 4) {
                bnVar.f46016g2.n(messageObject.Y1(), true);
            }
        }
    }

    @Override
    public final void I0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
        TLRPC.Message message = messageObject.f23968k;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.g6(true);
        bn bnVar = this.f49922a;
        bnVar.getMessagesStorage().X1(org.telegram.messenger.fj.B0(messageObject.f23968k), messageObject.f23968k);
        bnVar.getMessagesController().f25789v7.h(messageObject, true, false);
        f(q1Var, true, false, true);
    }

    @Override
    public final void I1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        bn bnVar = this.f49922a;
        if (!bnVar.X9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (bnVar.getParentActivity() != null) {
                if (bnVar.f45976d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.x2 x2Var = new org.telegram.ui.ActionBar.x2(1, (Context) bnVar.getParentActivity(), (org.telegram.ui.ActionBar.i6) bnVar.Ba, false);
                        x2Var.O();
                        x2Var.P = str;
                        x2Var.Q = false;
                        x2Var.R = true;
                        CharSequence[] charSequenceArr = {org.telegram.messenger.gd.M0(2131751756, null)};
                        og.j jVar = new og.j(3, bnVar, str);
                        x2Var.M = charSequenceArr;
                        x2Var.L = jVar;
                        bnVar.showDialog(x2Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        bnVar.Ca(null, tL_inlineButtonTypeUrl.url, true, q1Var, q1Var.getMessageObject());
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
    public final boolean J1() {
        bn bnVar = this.f49922a;
        if (bnVar.f46093m1.getKeyboardHeight() + bnVar.La >= org.telegram.messenger.g0.L(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final void K(org.telegram.ui.Cells.q1 q1Var) {
        bn bnVar = this.f49922a;
        bnVar.Ua.k(q1Var, bnVar, true);
        bnVar.A0.I0(false);
    }

    @Override
    public final void K1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        boolean z10 = q1Var.getMessageObject().f23968k.media instanceof TLRPC.TL_messageMediaGiveaway;
        bn bnVar = this.f49922a;
        if (z10) {
            long j3 = -((TLRPC.TL_messageMediaGiveaway) q1Var.getMessageObject().f23968k.media).channels.get(i7).longValue();
            if (bnVar.f46085l6 != j3) {
                bnVar.presentFragment(bn.ua(j3));
            } else {
                bnVar.f46129p1.e(false, false);
            }
        }
        if (q1Var.getMessageObject().f23968k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            bnVar.presentFragment(ProfileActivity.D4(((TLRPC.TL_messageMediaGiveawayResults) q1Var.getMessageObject().f23968k.media).winners.get(i7).longValue()));
        }
    }

    @Override
    public final void L(org.telegram.messenger.cj cjVar) {
        StaticLayout staticLayout = cjVar.f23364e;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = cjVar.f23364e.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new qi.g(cjVar.L, charSequence, false), 0, spannableString.length(), 33);
            org.telegram.messenger.g0.g(spannableString);
            org.telegram.messenger.n10.t(null, 2131752011, org.telegram.ui.Components.lc.b0(this.f49922a));
        }
    }

    @Override
    public final boolean L0(long j3) {
        TLRPC.ChatFull P0;
        bn bnVar = this.f49922a;
        TLRPC.Chat chat = bnVar.f45987e;
        if (chat == null || org.telegram.messenger.v3.V(chat)) {
            return false;
        }
        org.telegram.messenger.mp messagesController = bnVar.getMessagesController();
        long j10 = bnVar.f45987e.f28405id;
        if (j10 == j3) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j10));
        if (messagesController.getUserConfig().e() == j3 && O0 != null && O0.creator) {
            return true;
        }
        a0.h hVar = (a0.h) messagesController.A1.f(j10);
        if (hVar == null && (P0 = messagesController.P0(j10)) != null && P0.participants != null) {
            for (int i7 = 0; i7 < P0.participants.participants.size(); i7++) {
                TLRPC.ChatParticipant chatParticipant = P0.participants.participants.get(i7);
                if (chatParticipant.user_id == j3) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) hVar.f(j3)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override
    public final void L1(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
        bn bnVar = this.f49922a;
        bnVar.f46210v5 = messageObject;
        bnVar.C9();
    }

    @Override
    public final void N(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
        int i7;
        if (q1Var != null && document != null) {
            bn bnVar = this.f49922a;
            if (bnVar.getParentLayout() != null && d0(q1Var)) {
                boolean J3 = org.telegram.messenger.fj.J3(document);
                q1Var.setScrimBlockBounds(rectF);
                org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(bnVar, q1Var);
                if (J3) {
                    i7 = 2131745716;
                } else {
                    i7 = 2131745736;
                }
                I.c(2131232116, org.telegram.messenger.gd.M0(i7, null), new o1(this, q1Var, document, 26), false);
                I.f42369p = new yl(q1Var, rectF, 0);
                I.a0();
            }
        }
    }

    @Override
    public final void N0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.fj fjVar;
        long j3;
        int i7;
        ArrayList arrayList;
        bi.m2 m2Var;
        org.telegram.messenger.aj ajVar;
        int i10;
        bn bnVar = this.f49922a;
        wh.i iVar = bnVar.f46202ua;
        if (iVar != null) {
            HashMap hashMap = iVar.f59927a;
            wh.h hVar = (wh.h) hashMap.get(wh.i.b(q1Var));
            org.telegram.ui.Components.gc gcVar = null;
            if (hVar != null) {
                fjVar = hVar.F;
            } else {
                fjVar = null;
            }
            wh.h hVar2 = (wh.h) bnVar.f46202ua.f59927a.get(wh.i.b(q1Var));
            if (hVar2 != null && (i10 = hVar2.S) != -1) {
                j3 = hVar2.f59925x[i10].d;
            } else {
                j3 = 0;
            }
            if (fjVar != null && j3 != 0) {
                Activity parentActivity = bnVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.b5.h(parentActivity, i7, j3, false)) {
                    if (fjVar.c1() != 0 && (ajVar = (org.telegram.messenger.aj) bnVar.P6.f(fjVar.c1())) != null) {
                        arrayList = ajVar.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.f3.i(fjVar);
                    }
                    if (j3 == org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).f24792n) {
                        z10 = true;
                    }
                    long j10 = j3;
                    bi.m2 m2Var2 = new bi.m2(this, arrayList, j10, 18);
                    if (z10) {
                        m2Var2.run();
                        m2Var = null;
                    } else {
                        m2Var = m2Var2;
                    }
                    gcVar = org.telegram.ui.Components.lc.v(bnVar.getParentActivity(), bnVar, null, 1, j10, 1, bnVar.getThemedColor(org.telegram.ui.ActionBar.n6.wj), bnVar.getThemedColor(org.telegram.ui.ActionBar.n6.yj), 5000, false, m2Var);
                    gcVar.f35462k = true;
                    gcVar.k(gcVar.f35457e instanceof org.telegram.ui.Components.rb);
                }
            }
            wh.h hVar3 = (wh.h) hashMap.get(wh.i.b(q1Var));
            if (hVar3 != null) {
                if (gcVar == null) {
                    hVar3.S = -1;
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.lb lbVar = gcVar.f35457e;
                if (!(lbVar instanceof org.telegram.ui.Components.ob)) {
                    hVar3.c();
                    return;
                }
                org.telegram.ui.Components.ob obVar = (org.telegram.ui.Components.ob) lbVar;
                hVar3.X = obVar;
                obVar.f38054a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = hVar3.X.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new pw(2, hVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void O0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        bn bnVar = this.f49922a;
        bnVar.getSendMessagesHelper().n0(true, q1Var.getMessageObject(), keyboardInlineButton, null, null, bnVar);
    }

    @Override
    public final void O1(org.telegram.messenger.fj fjVar) {
        this.f49922a.f46168s.put(fjVar, Boolean.TRUE);
    }

    @Override
    public final void P(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
        if (messageObject.f23968k.send_state != 0) {
            this.f49922a.getSendMessagesHelper().g(messageObject);
        }
    }

    @Override
    public final void Q1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        im imVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && vf.c.i(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        bn bnVar = this.f49922a;
        vf.b bVar = bnVar.f45999ec;
        if (bVar != null) {
            bVar.a(true);
        }
        if (q1Var.getMessageObject() == null) {
            imVar = null;
        } else {
            imVar = new im(this, q1Var);
        }
        bnVar.f45999ec = imVar;
        if (!z11 && !vf.c.g(parse, false, null)) {
            org.telegram.ui.Components.b5.o0(bnVar, str, true, true, true, !z11, bnVar.f45999ec, webPage, bnVar.Ba);
        } else {
            vf.c.s(bnVar.getParentActivity(), parse, true, true, false, bnVar.f45999ec, null, false, true, false, false);
        }
    }

    @Override
    public final void R(org.telegram.messenger.fj fjVar) {
        if (org.telegram.messenger.fj.L4(fjVar.f23968k)) {
            this.f49922a.Lb(fjVar, true);
        }
    }

    @Override
    public final CharacterStyle R1(org.telegram.ui.Cells.q1 q1Var) {
        bn bnVar;
        int i7;
        if (q1Var.getMessageObject() != null && (i7 = (bnVar = this.f49922a).f45944ac) != 0 && i7 == q1Var.getMessageObject().e1() && bnVar.f45959bc == 1) {
            return bnVar.f45973cc;
        }
        return null;
    }

    @Override
    public final boolean S(org.telegram.ui.Cells.q1 q1Var, final TLRPC.TodoItem todoItem, final boolean z10) {
        TLRPC.Peer peer;
        int i7;
        TLRPC.Peer peer2;
        int i10;
        boolean l32 = org.telegram.messenger.fj.l3(q1Var.getMessageObject().f23968k);
        bn bnVar = this.f49922a;
        if (l32) {
            TLRPC.Message message = q1Var.getMessageObject().f23968k;
            if (message != null) {
                peer2 = message.from_id;
            } else {
                peer2 = null;
            }
            long o4 = org.telegram.messenger.n5.o(peer2);
            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar);
            i10 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
            b02.Q(2131624113, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743852, org.telegram.messenger.n5.l(i10, o4)))).k(true);
            return false;
        } else if (!q1Var.getMessageObject().q()) {
            TLRPC.Message message2 = q1Var.getMessageObject().f23968k;
            if (message2 != null) {
                peer = message2.from_id;
            } else {
                peer = null;
            }
            long o10 = org.telegram.messenger.n5.o(peer);
            org.telegram.ui.Components.lc b03 = org.telegram.ui.Components.lc.b0(bnVar);
            i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
            b03.Q(2131624113, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131743853, org.telegram.messenger.n5.l(i7, o10)))).k(true);
            return false;
        } else if (!bnVar.getUserConfig().q()) {
            org.telegram.ui.Components.lc.b0(bnVar).Q(2131624217, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.gd.M0(2131743829, null), new ul(this, 9))).k(true);
            return false;
        } else {
            final long M = org.telegram.messenger.v3.M(bnVar.f45987e, bnVar.f46163r8, true);
            final org.telegram.messenger.zy sendMessagesHelper = bnVar.getSendMessagesHelper();
            final org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
            sendMessagesHelper.getClass();
            if (messageObject == null) {
                return true;
            }
            final int hash = Objects.hash(Long.valueOf(org.telegram.messenger.fj.B0(messageObject.f23968k)), Integer.valueOf(messageObject.e1()), Integer.valueOf(todoItem.f28552id));
            sendMessagesHelper.I.put(Integer.valueOf(hash), Boolean.valueOf(z10));
            TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
            tL_messages_toggleTodoCompleted.msg_id = messageObject.e1();
            tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().l1(org.telegram.messenger.fj.B0(messageObject.f23968k));
            if (z10) {
                tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.f28552id));
            } else {
                tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.f28552id));
            }
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    zy zyVar = zy.this;
                    final boolean z11 = z10;
                    if (tL_error == null) {
                        final tr messagesStorage = zyVar.getMessagesStorage();
                        fj fjVar = messageObject;
                        final long B0 = fj.B0(fjVar.f23968k);
                        final int e12 = fjVar.e1();
                        final int i11 = todoItem.f28552id;
                        final long e10 = messagesStorage.getUserConfig().e();
                        final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                        q5 q5Var = messagesStorage.f27054a;
                        final long j3 = M;
                        q5Var.c(new Runnable() {
                            @Override
                            public final void run() {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ar.run():void");
                            }
                        });
                        zyVar.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    }
                    g0.g3(new di.x7(zyVar, hash, z11, 3));
                }
            });
            return true;
        }
    }

    @Override
    public final void S1(org.telegram.messenger.fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        try {
            bn bnVar = this.f49922a;
            org.telegram.ui.Components.gu.O0(bnVar, fjVar, bnVar.f45985db, str2, str3, str4, str, i7, i10, -1, bnVar.V9());
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override
    public final boolean T() {
        bn bnVar = this.f49922a;
        if (bnVar.f46121o6[1].size() + bnVar.f46121o6[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void T0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        this.f49922a.l8(characterStyle, z10, q1Var.getMessageObject(), q1Var);
    }

    @Override
    public final boolean T1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.fj fjVar) {
        he heVar;
        bi.m2 m2Var;
        boolean z10;
        org.telegram.ui.ActionBar.i6 i6Var;
        long j3;
        ai.k0 k0Var;
        int i7;
        boolean z11;
        int i10;
        rz0 rz0Var;
        int i11;
        float f10;
        int i12;
        long j10;
        ArrayList arrayList = null;
        if (!fjVar.S4() && !fjVar.g4()) {
            if (!org.telegram.messenger.fj.R4(fjVar.f23968k) && !fjVar.h4()) {
                if (fjVar.I3()) {
                    MediaController B = MediaController.B();
                    ArrayList L = this.f49922a.D0.L();
                    bn bnVar = this.f49922a;
                    long j11 = bnVar.f45981d7;
                    boolean z12 = true ^ bnVar.D0.O;
                    if (bnVar.f46236x4) {
                        j10 = bnVar.d();
                    } else {
                        j10 = 0;
                    }
                    return B.o0(L, fjVar, j11, z12, null, j10);
                }
            } else {
                boolean S = MediaController.B().S(fjVar);
                MediaController B2 = MediaController.B();
                if (S) {
                    arrayList = this.f49922a.i8(fjVar, false);
                }
                B2.r0(arrayList, false);
                return S;
            }
        } else {
            tz0 tz0Var = this.f49922a.f46229wa;
            if (tz0Var == null || tz0Var.f52387c0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.t0.f26915b.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!fjVar.P3()) {
                            org.telegram.ui.Components.lc.b0(this.f49922a).w(2131232789, org.telegram.messenger.gd.M0(2131743276, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f49922a.f46229wa = new tz0(this.f49922a.getParentActivity());
                tz0 tz0Var2 = this.f49922a.f46229wa;
                if (!fjVar.P3()) {
                    heVar = this.f49922a.Lb(fjVar, true);
                } else {
                    heVar = null;
                }
                if (!fjVar.P3()) {
                    m2Var = bn.a5(this.f49922a, fjVar);
                } else {
                    m2Var = null;
                }
                Context context = tz0Var2.f52382a;
                ai.k0 k0Var2 = tz0Var2.f52386c;
                tz0Var2.Y = heVar;
                tz0Var2.Z = m2Var;
                rz0 rz0Var2 = tz0Var2.O;
                if (rz0Var2 != null) {
                    k0Var2.removeView(rz0Var2);
                    tz0Var2.O = null;
                }
                tz0Var2.P = q1Var;
                org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
                tz0Var2.N = messageObject;
                if (messageObject != null && messageObject.h4()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tz0Var2.T = z10;
                org.telegram.ui.Cells.q1 q1Var2 = tz0Var2.P;
                if (q1Var2 != null) {
                    i6Var = q1Var2.getResourcesProvider();
                } else {
                    i6Var = null;
                }
                tz0Var2.M = i6Var;
                if (tz0Var2.P != null) {
                    tz0Var2.U = 0.0f;
                    tz0Var2.V = q1Var.f31443n;
                    if (q1Var.getParent() instanceof View) {
                        View view = (View) q1Var.getParent();
                        tz0Var2.U = view.getY() + tz0Var2.U;
                        tz0Var2.V = view.getY() + tz0Var2.V;
                    }
                    int width = tz0Var2.P.getWidth();
                    int height = tz0Var2.P.getHeight();
                    if (tz0Var2.T) {
                        height = Math.min(org.telegram.messenger.g0.L(360.0f), Math.min(width, org.telegram.messenger.g0.f24121q.y));
                    }
                    tz0Var2.L = height - tz0Var2.P.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / org.telegram.messenger.g0.f24120p);
                    j3 = 0;
                    int i13 = height;
                    k0Var = k0Var2;
                    rz0 rz0Var3 = new rz0(tz0Var2, tz0Var2.getContext(), org.telegram.messenger.j10.f24773t0, tz0Var2.P.getResourcesProvider(), width, i13);
                    tz0Var2.O = rz0Var3;
                    tz0Var2.P.t0(rz0Var3);
                    tz0Var2.O.s0(tz0Var2.P);
                    tz0Var2.O.setDelegate(new w7.s(19));
                    rz0 rz0Var4 = tz0Var2.O;
                    org.telegram.messenger.fj fjVar2 = tz0Var2.N;
                    org.telegram.messenger.aj currentMessagesGroup = tz0Var2.P.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.q1 q1Var3 = tz0Var2.P;
                    rz0Var4.y3(fjVar2, currentMessagesGroup, q1Var3.G, q1Var3.F, false, false);
                    if (!tz0Var2.T) {
                        org.telegram.ui.Components.h8 h8Var = new org.telegram.ui.Components.h8();
                        tz0Var2.W = h8Var;
                        rz0 rz0Var5 = tz0Var2.O;
                        h8Var.f35806i = rz0Var5;
                        rz0Var5.wc = h8Var;
                        if (rz0Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.bn0 seekBarWaveform = tz0Var2.O.getSeekBarWaveform();
                            seekBarWaveform.L = tz0Var2.f52395s;
                            org.telegram.ui.Cells.q1 q1Var4 = seekBarWaveform.f33737n;
                            if (q1Var4 != null) {
                                q1Var4.invalidate();
                            }
                        }
                    }
                    tz0Var2.I = false;
                    k0Var.addView(tz0Var2.O, new FrameLayout.LayoutParams(tz0Var2.P.getWidth(), i13, 17));
                    i7 = ceil;
                } else {
                    j3 = 0;
                    k0Var = k0Var2;
                    i7 = 360;
                }
                TextureView textureView = tz0Var2.Q;
                if (textureView != null) {
                    k0Var.removeView(textureView);
                    tz0Var2.Q = null;
                }
                if (tz0Var2.T) {
                    tz0Var2.R = false;
                    TextureView textureView2 = new TextureView(context);
                    tz0Var2.Q = textureView2;
                    k0Var.addView(textureView2, 0, c8.ma.c(i7, i7));
                }
                org.telegram.ui.Components.f61 f61Var = MediaController.B().f22719j0;
                if (f61Var != null) {
                    f61Var.g0();
                }
                org.telegram.ui.Components.f61 f61Var2 = tz0Var2.f52397x;
                if (f61Var2 != null) {
                    f61Var2.g0();
                    tz0Var2.f52397x.m0();
                    tz0Var2.f52397x = null;
                }
                org.telegram.ui.Cells.q1 q1Var5 = tz0Var2.P;
                if (q1Var5 != null && q1Var5.getMessageObject() != null) {
                    org.telegram.messenger.w7.G(tz0Var2.P.getMessageObject().K1);
                    File I = org.telegram.messenger.w7.I(tz0Var2.P.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        org.telegram.messenger.w7.G(tz0Var2.P.getMessageObject().K1);
                        I = org.telegram.messenger.w7.M(tz0Var2.P.getMessageObject().f23968k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && tz0Var2.P.getMessageObject().f23968k.attachPath != null) {
                        I = new File(tz0Var2.P.getMessageObject().f23968k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        org.telegram.ui.Components.f61 f61Var3 = new org.telegram.ui.Components.f61();
                        tz0Var2.f52397x = f61Var3;
                        f61Var3.K = new sz0(tz0Var2);
                        if (tz0Var2.W != null) {
                            f61Var3.L = new sz0(tz0Var2);
                        }
                        if (tz0Var2.T) {
                            f61Var3.A0(tz0Var2.Q);
                        }
                        tz0Var2.f52397x.j0(Uri.fromFile(I), "other");
                        tz0Var2.f52397x.h0();
                        org.telegram.ui.Components.ws wsVar = tz0Var2.F;
                        if (wsVar != null) {
                            wsVar.f41771s = tz0Var2.f52397x;
                            wsVar.a();
                        }
                    }
                    bn bnVar2 = this.f49922a;
                    bnVar2.showDialog(bnVar2.f46229wa);
                    return false;
                }
                hi.m3 m3Var = tz0Var2.f52398y;
                if (m3Var != null) {
                    k0Var.removeView(m3Var);
                    tz0Var2.f52398y = null;
                }
                org.telegram.messenger.fj fjVar3 = tz0Var2.N;
                if (fjVar3 != null && fjVar3.P3()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.messenger.fj fjVar4 = tz0Var2.N;
                if (fjVar4 != null && org.telegram.messenger.fj.B0(fjVar4.f23968k) != org.telegram.messenger.j10.i(tz0Var2.N.K1).e()) {
                    hi.m3 m3Var2 = new hi.m3(context, 3);
                    tz0Var2.f52398y = m3Var2;
                    m3Var2.r(true);
                    if (z11) {
                        long B0 = org.telegram.messenger.fj.B0(tz0Var2.N.f23968k);
                        String str = "";
                        if (B0 > j3) {
                            TLRPC.User c22 = org.telegram.messenger.mp.u1(tz0Var2.N.K1).c2(Long.valueOf(B0));
                            if (c22 != null) {
                                str = org.telegram.messenger.o10.k(c22, true);
                            }
                        } else {
                            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(tz0Var2.N.K1).O0(Long.valueOf(-B0));
                            if (O0 != null) {
                                str = O0.title;
                            }
                        }
                        hi.m3 m3Var3 = tz0Var2.f52398y;
                        if (tz0Var2.T) {
                            i12 = 2131743353;
                        } else {
                            i12 = 2131743277;
                        }
                        m3Var3.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i12, str)));
                    } else {
                        hi.m3 m3Var4 = tz0Var2.f52398y;
                        if (tz0Var2.T) {
                            i11 = 2131743354;
                        } else {
                            i11 = 2131743278;
                        }
                        m3Var4.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(i11, null)));
                    }
                    tz0Var2.f52398y.s(12.0f);
                    hi.m3 m3Var5 = tz0Var2.f52398y;
                    if (!z11 && !tz0Var2.P.G) {
                        f10 = 6.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    m3Var5.setPadding(org.telegram.messenger.g0.L(f10), 0, 0, 0);
                    if (tz0Var2.T) {
                        tz0Var2.f52398y.p(0.5f, 0.0f);
                        tz0Var2.f52398y.L = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        tz0Var2.f52398y.p(0.0f, org.telegram.messenger.g0.L(34.0f));
                        tz0Var2.f52398y.L = Layout.Alignment.ALIGN_NORMAL;
                    }
                    tz0Var2.f52398y.w(14.0f);
                    hi.m3 m3Var6 = tz0Var2.f52398y;
                    m3Var6.h = hi.m3.a(m3Var6.getText(), tz0Var2.f52398y.getTextPaint());
                    if (tz0Var2.T) {
                        k0Var.addView(tz0Var2.f52398y, c8.ma.d((int) ((tz0Var2.P.getWidth() / org.telegram.messenger.g0.f24120p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((tz0Var2.P.getHeight() + tz0Var2.L) / org.telegram.messenger.g0.f24120p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        k0Var.addView(tz0Var2.f52398y, c8.ma.d((int) ((tz0Var2.P.getWidth() / org.telegram.messenger.g0.f24120p) * 0.6f), 150.0f, 17, ((((tz0Var2.P.getWidth() * (-0.39999998f)) / 2.0f) + tz0Var2.P.getBoundsLeft()) / org.telegram.messenger.g0.f24120p) + 1.0f, ((-75.0f) - ((tz0Var2.P.getHeight() / org.telegram.messenger.g0.f24120p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    tz0Var2.f52398y.x();
                }
                TextView textView = tz0Var2.E;
                if (textView != null) {
                    k0Var.removeView(textView);
                    tz0Var2.E = null;
                }
                TextView textView2 = new TextView(context);
                tz0Var2.E = textView2;
                textView2.setTextColor(-1);
                tz0Var2.E.setTypeface(org.telegram.messenger.g0.o());
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    tz0Var2.E.setBackground(org.telegram.ui.ActionBar.n6.k0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    tz0Var2.E.setBackground(org.telegram.ui.ActionBar.n6.k0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                tz0Var2.E.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
                c8.ra.a(tz0Var2.E);
                TextView textView3 = tz0Var2.E;
                if (z11) {
                    i10 = 2131743282;
                } else {
                    i10 = 2131743279;
                }
                textView3.setText(org.telegram.messenger.gd.M0(i10, null));
                tz0Var2.E.setOnClickListener(new pz0(tz0Var2, 1));
                k0Var.addView(tz0Var2.E, c8.ma.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (rz0Var = tz0Var2.O) != null && rz0Var.getMessageObject() != null && tz0Var2.O.getMessageObject().f23968k != null) {
                    tz0Var2.O.getMessageObject().f23968k.media_unread = false;
                    tz0Var2.O.invalidate();
                }
                bn bnVar22 = this.f49922a;
                bnVar22.showDialog(bnVar22.f46229wa);
                return false;
            }
        }
        return false;
    }

    @Override
    public final boolean U(org.telegram.ui.Cells.q1 q1Var) {
        int i7;
        org.telegram.messenger.fj messageObject;
        TLRPC.Message message;
        if (q1Var != null) {
            bn bnVar = this.f49922a;
            if (bnVar.getParentActivity() != null) {
                i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                if (org.telegram.messenger.mp.u1(i7).B4() && (messageObject = q1Var.getMessageObject()) != null && (message = messageObject.f23968k) != null && message.rich_message != null) {
                    if (!messageObject.L2 || message.translatedRichMessage == null) {
                        return messageObject.u(bnVar.f45987e);
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
    public final void U1() {
        org.telegram.ui.ActionBar.i6 i6Var;
        bn bnVar = this.f49922a;
        if (bnVar.f46093m1 != null && bnVar.getParentActivity() != null) {
            Context context = bnVar.f46093m1.getContext();
            i6Var = ((org.telegram.ui.ActionBar.h2) bnVar).resourceProvider;
            uy0.e1(context, bnVar, false, i6Var, null);
        }
    }

    @Override
    public final boolean V0(org.telegram.ui.Cells.q1 r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.V0(org.telegram.ui.Cells.q1, boolean):boolean");
    }

    @Override
    public final boolean W() {
        bn bnVar = this.f49922a;
        if (!org.telegram.messenger.o10.A(bnVar.f46001f) && !org.telegram.messenger.o10.C(bnVar.f46001f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void W0(org.telegram.ui.Cells.q1 q1Var) {
        bn bnVar = this.f49922a;
        bnVar.getNotificationCenter().k(org.telegram.messenger.ks.f25170p3, Long.valueOf(bnVar.f46085l6), q1Var);
    }

    @Override
    public final void X(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.fj messageObject;
        if (chat == null) {
            return;
        }
        bn bnVar = this.f49922a;
        kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
        if (!kVar.y() && !bnVar.Y9()) {
            if (!z10 && chat.signature_profiles && (messageObject = q1Var.getMessageObject()) != null && org.telegram.messenger.fj.B0(messageObject.f23968k) != 1271266957) {
                bnVar.Qa(org.telegram.messenger.n5.o(messageObject.f23968k.from_id));
                return;
            } else {
                j(q1Var, chat, i7, z10);
                return;
            }
        }
        bn.k2(bnVar, q1Var, true, f10, f11);
    }

    @Override
    public final void X0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.f23968k.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            String N0 = org.telegram.messenger.gd.N0("PsaMessageInfo_" + messageObject.f23968k.fwd_from.psa_type);
            if (TextUtils.isEmpty(N0)) {
                N0 = org.telegram.messenger.gd.M0(2131746399, null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
            org.telegram.messenger.fj.d(spannableStringBuilder, false);
            org.telegram.messenger.aj currentMessagesGroup = q1Var.getCurrentMessagesGroup();
            bn bnVar = this.f49922a;
            if (currentMessagesGroup != null) {
                ArrayList arrayList = currentMessagesGroup.f22901e;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    } else if ((((org.telegram.messenger.xi) arrayList.get(i7)).f27891l & 1) != 0) {
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) currentMessagesGroup.d.get(i7);
                        if (fjVar != messageObject) {
                            int childCount = bnVar.A0.getChildCount();
                            for (int i10 = 0; i10 < childCount; i10++) {
                                View childAt = bnVar.A0.getChildAt(i10);
                                if (childAt instanceof org.telegram.ui.Cells.q1) {
                                    org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                                    if (fjVar.T(q1Var2.getMessageObject())) {
                                        q1Var = q1Var2;
                                    }
                                }
                            }
                            messageObject = fjVar;
                        }
                    } else {
                        i7++;
                    }
                }
            }
            bnVar.qc(messageObject, spannableStringBuilder, 1);
            q1Var.I3(1, false, true);
        }
    }

    @Override
    public final void X1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        hi hiVar;
        int i7;
        org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
        ai.w0 w0Var = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            bn bnVar = this.f49922a;
            vf.b bVar = bnVar.f45999ec;
            if (bVar != null) {
                bVar.a(true);
                bnVar.f45999ec = null;
            }
            if (q1Var.getMessageObject() == null) {
                bnVar.f45999ec = null;
                hiVar = null;
            } else {
                hiVar = new hi(bnVar, q1Var.getMessageObject().e1(), q1Var, 1);
                bnVar.f45999ec = hiVar;
            }
            i7 = ((org.telegram.ui.ActionBar.h2) this.f49922a).currentAccount;
            di.x8 y10 = di.x8.y(i7, false);
            Objects.requireNonNull(hiVar);
            bh bhVar = new bh(hiVar, 8);
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = org.telegram.messenger.t0.f26915b;
            }
            org.telegram.ui.ActionBar.i6 I = di.x8.I();
            if (messageObject != null && context != null) {
                long B0 = org.telegram.messenger.fj.B0(messageObject.f23968k);
                int e12 = messageObject.e1();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = org.telegram.messenger.mp.u1(y10.f10018a).l1(B0);
                tL_inputInvoiceMessage.msg_id = e12;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject u10 = ki.t2.u(I, false);
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                w0Var = new ai.w0(y10, ConnectionsManager.getInstance(y10.f10018a).sendRequest(tL_payments_getPaymentForm, new bi.g2(y10, messageObject, tL_inputInvoiceMessage, bhVar, 3)), 6);
            }
            if (w0Var != null) {
                hiVar.f59374b = w0Var;
                hiVar.d();
                return;
            }
            return;
        }
        TLRPC.Message message = messageObject.f23968k;
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
                    TLRPC.TL_message R7 = bn.R7(message);
                    if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                        R7.attachPath = tL_messageExtendedMedia.attachPath;
                    } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                        R7.attachPath = message.attachPath;
                    }
                    R7.media = tL_messageExtendedMedia.media;
                    R7.noforwards = true;
                    arrayList.add(new org.telegram.messenger.fj(messageObject.K1, R7, false, true));
                }
            }
            if (i10 > -1 && !arrayList.isEmpty()) {
                PhotoViewer p12 = PhotoViewer.p1();
                bn bnVar2 = this.f49922a;
                p12.I2(null, bnVar2, bnVar2.Ba);
                PhotoViewer.p1().a2(arrayList, i10, this.f49922a.a(), 0L, 0L, this.f49922a.eb);
            }
        }
    }

    @Override
    public final void Y(org.telegram.ui.Cells.q1 q1Var) {
        f(q1Var, true, true, false);
    }

    @Override
    public final void Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i7;
        int i10;
        org.telegram.messenger.bp bpVar;
        Integer num;
        org.telegram.messenger.fc b10;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        bn bnVar = this.f49922a;
        if (isEmpty) {
            i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
            ug.i1 i1Var = new ug.i1(bnVar, i7, user, null, null, bnVar.Ba);
            q1Var.getLocationOnScreen(new int[2]);
            i1Var.f58693r2 = q1Var.getNameStatusX();
            i1Var.f58694s2 = q1Var.getNameStatusY();
            i1Var.f58697v2 = q1Var.getScaleX();
            i1Var.f58695t2 = q1Var.getLeft();
            i1Var.f58696u2 = q1Var.getTop();
            i1Var.f58698w2 = q1Var;
            int f10 = org.telegram.messenger.o10.f(user);
            if (f10 >= 7) {
                i10 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(i10).f25769t4;
                if (cpVar != null) {
                    bpVar = cpVar.d(f10);
                } else {
                    bpVar = null;
                }
                if (bpVar != null) {
                    num = Integer.valueOf(bpVar.f());
                } else {
                    num = null;
                }
                i1Var.f58692q2 = num;
            } else {
                i1Var.f58692q2 = Integer.valueOf(bnVar.getThemedColor(org.telegram.ui.ActionBar.n6.f29657r8[f10]));
            }
            org.telegram.ui.Components.m5 m5Var = q1Var.f31494qa;
            if (m5Var != null && (m5Var.f37361f[0] instanceof org.telegram.ui.Components.o5)) {
                i1Var.f58697v2 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(bnVar.getParentActivity());
                    org.telegram.messenger.lz d = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.f29561m6, 0.2f, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b10 = org.telegram.messenger.fc.b(document);
                        if (d != null) {
                            d.f25488e = 512;
                            d.f25489f = 512;
                        }
                        str2 = "160_160_g";
                    } else {
                        if (d != null && org.telegram.messenger.fj.K2(document, false)) {
                            d.f25488e = 512;
                            d.f25489f = 512;
                        }
                        b10 = org.telegram.messenger.fc.b(document);
                        str2 = "160_160";
                    }
                    org.telegram.messenger.fc fcVar = b10;
                    String str3 = str2;
                    q9Var.setLayerNum(7);
                    q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
                    q9Var.m(fcVar, str3, org.telegram.messenger.fc.c(w10, document), "140_140", d, document);
                    if (org.telegram.messenger.fj.C4(document)) {
                        Integer num2 = i1Var.f58692q2;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = bnVar.getThemedColor(org.telegram.ui.ActionBar.n6.f29731v6);
                        }
                        q9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        i1Var.f58700y2 = org.telegram.messenger.fj.i1(document);
                    } else {
                        i1Var.f58700y2 = org.telegram.messenger.fj.i1(document);
                    }
                    i1Var.f58699x2 = q9Var;
                    i1Var.A2 = true;
                }
            }
            bnVar.showDialog(i1Var);
            return;
        }
        vf.c.t(bnVar.getParentActivity(), "https://" + bnVar.getMessagesController().X2 + "/nft/" + str);
    }

    @Override
    public final int Z() {
        return this.f49922a.f46018g4;
    }

    @Override
    public final boolean Z1(org.telegram.ui.Cells.q1 r50, org.telegram.tgnet.TLRPC.PollAnswer r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.Z1(org.telegram.ui.Cells.q1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        bn bnVar = this.f49922a;
        rj rjVar = bnVar.f45932a0;
        if (rjVar != null) {
            CharSequence fieldText = rjVar.getFieldText();
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
            String K = org.telegram.messenger.v3.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                bnVar.f45932a0.setFieldText(spannableStringBuilder);
                org.telegram.messenger.g0.h3(new ul(this, 6), 200L);
            }
        }
    }

    @Override
    public final void a2(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.i10 i10Var) {
        TLRPC.Message message;
        if (q1Var == null) {
            i10Var.run();
            return;
        }
        org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.o4() || messageObject.Y2()) && (message = messageObject.f23968k) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.h2 h2Var = this.f49922a;
            h2Var.getSendMessagesHelper().v(messageObject, messageObject.f23968k.rich_message, null, h2Var, true);
            return;
        }
        i10Var.run();
    }

    @Override
    public final boolean b() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        bn bnVar = this.f49922a;
        kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
            if (!kVar2.y() && !bnVar.Y9()) {
                z10 = ((org.telegram.ui.ActionBar.h2) bnVar).inPreviewMode;
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
    public final void c() {
        this.f49922a.f46093m1.getClass();
    }

    @Override
    public final jh.a c0() {
        return this.f49922a.f46204uc;
    }

    @Override
    public final fr0 c2() {
        return this.f49922a.Ta;
    }

    public final void d(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        bn bnVar = this.f49922a;
        rj rjVar = bnVar.f45932a0;
        if (rjVar != null) {
            CharSequence fieldText = rjVar.getFieldText();
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
            String o4 = org.telegram.messenger.o10.o(user);
            if (o4 != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) o4).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(p5.c.v(org.telegram.messenger.o10.k(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.s41("" + user.f28554id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            bnVar.f45932a0.setFieldText(spannableStringBuilder);
            org.telegram.messenger.g0.h3(new ul(this, 7), 200L);
        }
    }

    @Override
    public final boolean d0(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.fj messageObject;
        if (q1Var == null) {
            messageObject = null;
        } else {
            messageObject = q1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.f23968k != null) {
            bn bnVar = this.f49922a;
            if (bnVar.f46018g4 != 1 && !bnVar.W9() && !messageObject.f23968k.noforwards && messageObject.D != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void e(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i7;
        org.telegram.ui.ActionBar.i6 i6Var;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        bn bnVar = this.f49922a;
        bnVar.getUserConfig().f();
        if (org.telegram.messenger.g0.E1(bnVar.getParentActivity()) && (chat = bnVar.f45987e) != null && currentUser != null && !org.telegram.messenger.v3.V(chat)) {
            boolean z13 = true;
            boolean z14 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == bnVar.getUserConfig().e()) {
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
                    if (channelParticipant2.promoted_by == bnVar.getUserConfig().e()) {
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
                Activity parentActivity = bnVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                i6Var = ((org.telegram.ui.ActionBar.h2) bnVar).resourceProvider;
                org.telegram.ui.Components.ny0.b(parentActivity, i7, -bnVar.f45987e.f28405id, currentUser, str2, z15, z16, z12, i6Var);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z10 = false;
                    z14 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == bnVar.getUserConfig().e()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    z13 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (org.telegram.messenger.v3.T(bnVar.f45987e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                bnVar.getMessagesController();
                tL_channels_getParticipant.channel = org.telegram.messenger.mp.k1(bnVar.f45987e);
                tL_channels_getParticipant.participant = bnVar.getMessagesController().l1(currentUser.f28554id);
                bnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new d3.b(1), new bi.m6(15, this, q1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = bnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
            i6Var = ((org.telegram.ui.ActionBar.h2) bnVar).resourceProvider;
            org.telegram.ui.Components.ny0.b(parentActivity2, i7, -bnVar.f45987e.f28405id, currentUser, str2, z152, z162, z12, i6Var);
        }
    }

    @Override
    public final boolean e0(org.telegram.ui.Cells.q1 q1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        char c10;
        int i7;
        w4 b10;
        int i10;
        vj vjVar;
        uj ujVar;
        if (!g()) {
            return false;
        }
        bn bnVar = this.f49922a;
        if (bnVar.f45987e != null && (((vjVar = bnVar.f45976d1) == null || vjVar.getVisibility() != 0) && ((ujVar = bnVar.T) == null || ujVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = bnVar.f45987e;
        if (chat != null && ((bnVar.f46173s4 == 0 || bnVar.f46236x4) && (!org.telegram.messenger.v3.T(chat) || bnVar.f45987e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        c5[] c5VarArr = new c5[r22 + 2 + r42];
        c5VarArr[0] = c5.d;
        c5VarArr[1] = c5.h;
        if (r22 != 0) {
            c5VarArr[2] = c5.f46398n;
            c10 = 3;
        } else {
            c10 = 2;
        }
        if (r42 != 0) {
            c5VarArr[c10] = c5.f46399r;
        }
        TLRPC.UserFull d2 = bnVar.getMessagesController().d2(user.f28554id);
        if (d2 == null) {
            i7 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
            b10 = w4.b(user, i7, c5VarArr);
        } else {
            b10 = w4.c(user, d2, c5VarArr);
            if (!ab.q.h(b10)) {
                i10 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
                b10 = w4.b(user, i10, c5VarArr);
            }
        }
        if (ab.q.h(b10)) {
            ab.q.o().D((ViewGroup) bnVar.fragmentView, bnVar.Ba, b10, new z6(this, q1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.y60 I = org.telegram.ui.Components.y60.I(bnVar, q1Var);
        I.c(2131232268, org.telegram.messenger.gd.M0(2131747593, null), new Runnable(this) {
            public final mm f52809b;

            {
                this.f52809b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f52809b.o(user, false);
                        return;
                    case 1:
                        this.f52809b.d(user);
                        return;
                    default:
                        this.f52809b.f49922a.Pa(user);
                        return;
                }
            }
        }, false);
        I.c(2131232115, org.telegram.messenger.gd.M0(2131745406, null), new o1(this, q1Var, user, 24), false);
        I.l(2131232224, org.telegram.messenger.gd.M0(2131748417, null), new Runnable(this) {
            public final mm f52809b;

            {
                this.f52809b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f52809b.o(user, false);
                        return;
                    case 1:
                        this.f52809b.d(user);
                        return;
                    default:
                        this.f52809b.f49922a.Pa(user);
                        return;
                }
            }
        }, r22);
        I.l(2131232356, org.telegram.messenger.gd.M0(2131753756, null), new Runnable(this) {
            public final mm f52809b;

            {
                this.f52809b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f52809b.o(user, false);
                        return;
                    case 1:
                        this.f52809b.d(user);
                        return;
                    default:
                        this.f52809b.f49922a.Pa(user);
                        return;
                }
            }
        }, r42);
        I.f42377t = false;
        I.f42356i = 3;
        I.Z = true;
        I.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
        I.a0();
        return true;
    }

    @Override
    public final void e2(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new qi.g(str2, str, false), 0, spannableString.length(), 33);
        org.telegram.messenger.g0.g(spannableString);
        org.telegram.messenger.n10.t(null, 2131752011, org.telegram.ui.Components.lc.b0(this.f49922a));
    }

    public final void f(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11, boolean z12) {
        org.telegram.messenger.fj primaryMessageObject;
        int i7;
        int i10;
        ej ejVar;
        if (q1Var == null || (primaryMessageObject = q1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.M1 = true;
        bn bnVar = this.f49922a;
        bj bjVar = bnVar.A0;
        if (bjVar != null && (ejVar = bnVar.C0) != null && ejVar.f59083y < 0) {
            for (int childCount = bjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = bnVar.A0.getChildAt(childCount);
                bnVar.A0.getClass();
                i7 = RecyclerView.R(childAt);
                if (i7 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = bnVar.h9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.u0) {
                        i10 = bnVar.h9(childAt);
                        break;
                    }
                }
            }
        }
        i7 = -1;
        i10 = 0;
        if (z10 && i7 >= 0 && q1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                ej ejVar2 = bnVar.C0;
                bnVar.A0.getClass();
                ejVar2.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) bnVar.P9), false);
            } else {
                bnVar.C0.h1(i7, i10);
            }
        }
        bnVar.f45962c1 = z11;
        bnVar.Zc(primaryMessageObject, false);
        bnVar.f45962c1 = false;
    }

    @Override
    public final boolean f1(org.telegram.messenger.fj fjVar) {
        kl klVar;
        int i7 = (org.telegram.messenger.fj.B0(fjVar.f23968k) > 1271266957L ? 1 : (org.telegram.messenger.fj.B0(fjVar.f23968k) == 1271266957L ? 0 : -1));
        bn bnVar = this.f49922a;
        if ((i7 == 0 || ((klVar = bnVar.D0) != null && klVar.O)) && bnVar.f46018g4 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f2(long r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.f2(long):boolean");
    }

    public final boolean g() {
        bn bnVar = this.f49922a;
        if (!org.telegram.messenger.o10.C(bnVar.f46001f)) {
            TLRPC.Chat chat = bnVar.f45987e;
            if (chat != null) {
                if (org.telegram.messenger.v3.T(chat) && !bnVar.f45987e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void g2(org.telegram.ui.Cells.q1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.g2(org.telegram.ui.Cells.q1, int, float, float, boolean):void");
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void h0(int i7) {
        CharSequence T2;
        int i10;
        SpannableStringBuilder W2;
        int i11;
        bn bnVar = this.f49922a;
        try {
            if (i7 == 0) {
                bnVar.w7();
                nk nkVar = bnVar.O3;
                if (nkVar != null) {
                    nkVar.l(0L, 84, null, new ul(this, 1));
                    bnVar.O3.performHapticFeedback(3, 2);
                }
            } else if (i7 == 1) {
                String x10 = org.telegram.messenger.gd.x(bnVar.getMessagesController().f25806x4, true);
                if (bnVar.getMessagesController().f25806x4 > 0) {
                    i11 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(org.telegram.ui.Components.g21.g(i11), "TranscriptionTrialLeftUntil", x10));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(org.telegram.ui.Components.g21.g(i10), "TranscriptionTrialLeft", new Object[0]));
                }
                org.telegram.ui.Components.lc.b0(bnVar).G(2131624300, 6, W2).k(true);
                bnVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i7 == 2 || i7 == 3) {
                String x11 = org.telegram.messenger.gd.x(bnVar.getMessagesController().f25806x4, true);
                org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(bnVar);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(bnVar.getMessagesController().f25786v4, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ");
                if (i7 == 2) {
                    T2 = org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131743731, null), new ul(this, 2));
                } else if (bnVar.getMessagesController().f25806x4 <= 0) {
                    T2 = "";
                } else {
                    T2 = org.telegram.messenger.g0.T2(org.telegram.messenger.gd.a0(null, null, 2131743730, x11), new ul(this, 3));
                }
                SpannableStringBuilder append2 = append.append(T2);
                b02.getClass();
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(b02.X(), b02.f37093c);
                obVar.c(2131624300, 36, 36, new String[0]);
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
                obVar.f38055b.setText(append2);
                obVar.f38055b.setSingleLine(false);
                obVar.f38055b.setMaxLines(6);
                b02.b(obVar, 7000).k(true);
                org.telegram.messenger.q2.APP_ERROR.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean h2(org.telegram.ui.Cells.q1 r40, org.telegram.tgnet.TLRPC.TodoItem r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.h2(org.telegram.ui.Cells.q1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final String i(org.telegram.ui.Cells.q1 q1Var) {
        bn bnVar;
        int i7;
        if (q1Var.getMessageObject() != null && (i7 = (bnVar = this.f49922a).f45944ac) != 0 && i7 == q1Var.getMessageObject().e1() && bnVar.f45959bc == 3) {
            return bnVar.dc;
        }
        return null;
    }

    @Override
    public final boolean i0() {
        if (this.f49922a.f46018g4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void i1() {
        bn bnVar = this.f49922a;
        bnVar.h8();
        UndoView undoView = bnVar.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, bnVar.f46085l6, null);
    }

    public final void j(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, boolean z10) {
        bn bnVar = this.f49922a;
        TLRPC.Chat chat2 = bnVar.f45987e;
        if (chat2 != null && chat.f28405id == chat2.f28405id) {
            vi viVar = bnVar.f46129p1;
            if (viVar != null && i7 == 0) {
                viVar.e(false, false);
            } else if (q1Var.getMessageObject() != null) {
                bnVar.l(i7, q1Var.getMessageObject().e1(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f28405id != chat2.f28405id || bnVar.fa()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f28405id);
            if (i7 != 0) {
                bundle.putInt("message_id", i7);
            }
            hi hiVar = null;
            if (z10) {
                vf.b bVar = bnVar.f45999ec;
                if (bVar != null) {
                    bVar.a(true);
                    bnVar.f45999ec = null;
                }
                if (q1Var != null && q1Var.getMessageObject() != null) {
                    hi hiVar2 = new hi(bnVar, q1Var.getMessageObject().e1(), q1Var, 0);
                    bnVar.f45999ec = hiVar2;
                    hiVar = hiVar2;
                } else {
                    bnVar.f45999ec = null;
                }
            }
            if (bnVar.getMessagesController().E(bundle, bnVar, q1Var.getMessageObject(), hiVar)) {
                hi hiVar3 = hiVar;
                bn bnVar2 = new bn(bundle);
                if (hiVar3 != null && i7 != 0) {
                    org.telegram.messenger.g0.h3(new ai.g1(this, hiVar3, chat, i7, bnVar2, 13), 5000L);
                    hiVar3.d();
                    return;
                }
                bnVar.presentFragment(bnVar2);
            }
        }
    }

    @Override
    public final void j0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        this.f49922a.Y7(q1Var, true, false, f10, f11, false, false, false);
    }

    @Override
    public final void j2(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull P0;
        TLRPC.User currentUser = q1Var.getCurrentUser();
        bn bnVar = this.f49922a;
        if (org.telegram.messenger.g0.E1(bnVar.getParentActivity()) && (chat = bnVar.f45987e) != null && currentUser != null && !org.telegram.messenger.v3.V(chat)) {
            org.telegram.messenger.mp messagesController = bnVar.getMessagesController();
            long j3 = bnVar.f45987e.f28405id;
            long j10 = currentUser.f28554id;
            a0.h hVar = (a0.h) messagesController.A1.f(j3);
            if (hVar == null && (P0 = messagesController.P0(j3)) != null && P0.participants != null) {
                for (int i7 = 0; i7 < P0.participants.participants.size(); i7++) {
                    chatParticipant = P0.participants.participants.get(i7);
                    if (chatParticipant.user_id == j10) {
                        break;
                    }
                }
            }
            chatParticipant = (TLObject) hVar.f(j10);
            e(q1Var, chatParticipant);
        }
    }

    public final void k(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f28554id);
            org.telegram.ui.ActionBar.h2 h2Var = this.f49922a;
            if (h2Var.getMessagesController().E(bundle, h2Var, q1Var.getMessageObject(), null)) {
                h2Var.presentFragment(new bn(bundle));
            }
        }
    }

    @Override
    public final int k0(org.telegram.ui.Cells.q1 q1Var) {
        sh.c cVar;
        bn bnVar = this.f49922a;
        if (bnVar.f46000ed.f57658f && (cVar = bnVar.f46079kd) != null && cVar.f57427n == q1Var && cVar.f57422a.getWidth() > 0) {
            return bnVar.f46079kd.f57422a.getHeight();
        }
        return 0;
    }

    @Override
    public final void k1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        bn bnVar = this.f49922a;
        if (!bnVar.X9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (bnVar.getParentActivity() != null) {
                if (bnVar.f45976d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    rj rjVar = bnVar.f45932a0;
                    org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
                    org.telegram.messenger.fj messageObject2 = q1Var.getMessageObject();
                    gi giVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    vf.b bVar = bnVar.f45999ec;
                    if (bVar != null) {
                        bVar.a(true);
                        bnVar.f45999ec = null;
                    }
                    if (str != null && q1Var.getMessageObject() != null) {
                        gi giVar2 = new gi(bnVar, q1Var.getMessageObject().e1(), str, q1Var, 1);
                        bnVar.f45999ec = giVar2;
                        giVar = giVar2;
                    } else {
                        bnVar.f45999ec = null;
                    }
                    rjVar.p0(keyboardButtonProto, messageObject, messageObject2, giVar);
                }
            }
        }
    }

    @Override
    public final void l(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
        org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
        if (messageObject != null) {
            int a10 = sh.h.a(messageObject);
            boolean a11 = c8.dd.a(a10, 7);
            bn bnVar = this.f49922a;
            if (a11) {
                org.telegram.ui.Components.lc.b0(bnVar).Q(2131624007, 36, sh.h.b(a10, messageObject)).j();
            } else if (i7 < 0 && !arrayList.isEmpty()) {
                bnVar.getSendMessagesHelper().w0(messageObject, arrayList, null);
                q1Var.a0(true);
            } else if (bnVar.getParentActivity() != null) {
                if (bnVar.C2 == null) {
                    int indexOfChild = bnVar.f46093m1.indexOfChild(bnVar.U);
                    if (indexOfChild == -1) {
                        return;
                    }
                    hi.m3 E6 = bnVar.E6(250.0f, 3, indexOfChild + 1, false);
                    bnVar.C2 = E6;
                    E6.f15019v0 = 0.0f;
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
                        float y10 = ((q1Var.getY() + p1Var.f31216b) - org.telegram.messenger.g0.L(4.0f)) - bnVar.P9;
                        bnVar.F2 = org.telegram.messenger.g0.L(13.3f) + p1Var.f31215a;
                        int i13 = org.telegram.ui.Cells.c0.i(6.0f, p1Var.f31216b, i11);
                        bnVar.G2 = i13;
                        if (y10 > 0.0f) {
                            i10 = bnVar.F2;
                            i11 = i13;
                            f10 = 0.0f;
                            break;
                        }
                        i12++;
                        f10 = y10;
                    }
                    if (f10 != 0.0f) {
                        bnVar.A0.w0(0, (int) f10, null);
                        bnVar.E2 = q1Var;
                        return;
                    }
                }
                bn.q2(bnVar, q1Var, i7, i10, i11);
            }
        }
    }

    @Override
    public final void l0(org.telegram.ui.Cells.q1 q1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        bn bnVar = this.f49922a;
        if (bnVar.getParentActivity() != null) {
            if (bnVar.f46202ua == null) {
                wh.i iVar = new wh.i(bnVar.getParentActivity());
                bnVar.f46202ua = iVar;
                bnVar.f46093m1.addView(iVar, c8.ma.e(-1, -1, 48));
            }
            wh.i iVar2 = bnVar.f46202ua;
            HashMap hashMap = iVar2.f59927a;
            ArrayList arrayList = iVar2.f59929c;
            arrayList.clear();
            int i7 = iVar2.d;
            org.telegram.messenger.j10 i10 = org.telegram.messenger.j10.i(i7);
            long j3 = i10.f24792n;
            arrayList.add(Long.valueOf(j3));
            if (i10.W) {
                ArrayList arrayList2 = org.telegram.messenger.ri.d0(i7).f26622j1;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                    long j10 = tL_topPeer.peer.user_id;
                    if (j10 != 0) {
                        int i12 = size;
                        if (org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                            arrayList.add(Long.valueOf(j10));
                        }
                        size = i12;
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = org.telegram.messenger.mp.u1(i7).f25811y;
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i13);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j11 = dialog.f28409id;
                    if (j11 != j3 && !org.telegram.messenger.n5.C(j11)) {
                        if (org.telegram.messenger.n5.E(dialog.f28409id)) {
                            TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(dialog.f28409id));
                            if (c22 != null && !org.telegram.messenger.o10.u(c22) && !org.telegram.messenger.o10.y(c22) && !org.telegram.messenger.o10.B(c22.f28554id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f28409id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f28409id));
                                }
                            }
                        } else {
                            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-dialog.f28409id));
                            if (O0 != null && !O0.forum && !org.telegram.messenger.v3.r0(O0) && ((!O0.gigagroup || org.telegram.messenger.v3.N(O0)) && (!org.telegram.messenger.v3.T(O0) || O0.creator || (((tL_chatAdminRights = O0.admin_rights) != null && tL_chatAdminRights.post_messages) || O0.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f28409id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f28409id));
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
                    if (hashSet.add(l10) && org.telegram.messenger.n5.E(l10.longValue())) {
                        arrayList5.add(l10);
                    }
                }
                wh.h hVar = new wh.h(iVar2, q1Var, arrayList5, new wg.r(4, iVar2, b10));
                hVar.setBounds(0, 0, iVar2.getMeasuredWidth(), iVar2.getMeasuredHeight());
                hVar.setCallback(iVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, hVar);
                }
            }
        }
    }

    @Override
    public final void l2(org.telegram.ui.Cells.q1 q1Var, long j3) {
        Bundle j10 = a8.p0.j(j3, "user_id");
        org.telegram.ui.ActionBar.h2 h2Var = this.f49922a;
        if (h2Var.getMessagesController().E(j10, h2Var, q1Var.getMessageObject(), null)) {
            h2Var.presentFragment(new bn(j10));
        }
    }

    @Override
    public final void m() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.s2.f26723a;
        org.telegram.messenger.t0.r();
        vf.c.t(this.f49922a.getParentActivity(), org.telegram.messenger.s2.f26728g);
    }

    public final void n(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f28405id);
            bundle.putBoolean("expandPhoto", false);
            this.f49922a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final boolean n0() {
        boolean z10;
        bn bnVar = this.f49922a;
        if (!bnVar.Y9()) {
            z10 = ((org.telegram.ui.ActionBar.h2) bnVar).inPreviewMode;
            if (!z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(TLRPC.User user, boolean z10) {
        int i7;
        if (user != null && user.f28554id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i10 = 0;
            if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                z10 = false;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f28554id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            bn bnVar = this.f49922a;
            TLRPC.User user2 = bnVar.f46001f;
            if (user2 != null && user2.f28554id == user.f28554id) {
                i10 = 1;
            }
            profileActivity.j5(i10);
            Activity parentActivity = bnVar.getParentActivity();
            i7 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
            org.telegram.messenger.g0.k3(parentActivity, i7);
            bnVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void o0(String str) {
        bn bnVar = this.f49922a;
        vj vjVar = bnVar.f45976d1;
        if (vjVar == null || vjVar.getVisibility() != 0) {
            uj ujVar = bnVar.T;
            if ((ujVar == null || ujVar.getVisibility() != 0) && bnVar.f45932a0 != null && str != null && str.length() > 0) {
                rj rjVar = bnVar.f45932a0;
                rjVar.setFieldText("@" + str + " ");
                bnVar.f45932a0.e1();
            }
        }
    }

    @Override
    public final void p(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
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
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
        TLRPC.MessageMedia m12 = org.telegram.messenger.fj.m1(messageObject);
        if (messageMedia != null && messageObject != null && (m12 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m12;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                Q1(q1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            bn bnVar = this.f49922a;
            if (geoPoint != null) {
                if (org.telegram.messenger.g0.J1(bnVar)) {
                    pa0 pa0Var = new pa0(3);
                    i6Var2 = ((org.telegram.ui.ActionBar.h2) bnVar).resourceProvider;
                    pa0Var.setResourceProvider(i6Var2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = bnVar.getMessagesController().B1(bnVar.a());
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
                    pa0Var.V0 = false;
                    pa0Var.G0(new org.telegram.messenger.fj(org.telegram.messenger.j10.f24773t0, tL_message, false, false));
                    bnVar.presentFragment(pa0Var);
                }
            } else if (org.telegram.messenger.fj.N2(messageMedia.document)) {
                ns.p().v(bnVar.getParentActivity());
                ns.p().u(new km(this, tL_messageMediaPoll, pollAnswer, q1Var));
                ns p10 = ns.p();
                TLRPC.Document document4 = messageMedia.document;
                if (org.telegram.messenger.fj.H2(document4)) {
                    i17 = 2;
                } else {
                    i17 = 0;
                }
                org.telegram.messenger.fj messageObject2 = q1Var.getMessageObject();
                i6Var = ((org.telegram.ui.ActionBar.h2) bnVar).resourceProvider;
                p10.s(document4, null, "", null, null, i17, false, messageObject2, i6Var, 200);
            } else if (org.telegram.messenger.fj.J3(messageMedia.document)) {
                org.telegram.messenger.fj fjVar = MediaController.B().f22743v0;
                if (MediaController.B().I(messageObject) && fjVar != null) {
                    boolean z12 = fjVar.m0;
                    if (i7 == -3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12 == z11) {
                        if (MediaController.B().H()) {
                            MediaController.B().S(fjVar);
                            return;
                        } else {
                            MediaController.B().R(fjVar, true);
                            return;
                        }
                    }
                }
                TLRPC.Message message = messageObject.f23968k;
                TLRPC.TL_message R7 = bn.R7(message);
                R7.media = messageMedia;
                R7.attachPath = sh.e.c(i7, message);
                ArrayList arrayList = new ArrayList();
                i16 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(i16, R7, false, true);
                if (i7 == -3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fjVar2.m0 = z10;
                arrayList.add(fjVar2);
                if (MediaController.B().I(messageObject)) {
                    MediaController.B().q(false, true, false, false);
                }
                MediaController.B().o0(arrayList, fjVar2, 0L, true, null, 0L);
            } else {
                TLRPC.Document document5 = messageMedia.document;
                if (document5 != null && !org.telegram.messenger.fj.K4(document5)) {
                    i14 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    sh.a aVar = new sh.a(i14, messageObject, document6, sh.e.c(i7, messageObject.f23968k));
                    if (aVar.f57419g) {
                        org.telegram.messenger.w7.G(i14).f(document6);
                        aVar.a();
                        q1Var.Z();
                        return;
                    } else if (!aVar.f57418f) {
                        org.telegram.messenger.w7.G(i14).W(document6, messageObject, 2, 0);
                        aVar.a();
                        q1Var.Z();
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.f23968k;
                        TLRPC.TL_message R72 = bn.R7(message2);
                        R72.media = messageMedia;
                        R72.attachPath = sh.e.c(i7, message2);
                        i15 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                        org.telegram.messenger.fj fjVar3 = new org.telegram.messenger.fj(i15, R72, false, true);
                        if (org.telegram.messenger.fj.y(messageMedia.document)) {
                            PhotoViewer.p1().I2(null, bnVar, bnVar.Ba);
                            PhotoViewer p12 = PhotoViewer.p1();
                            int i18 = fjVar3.D;
                            long j11 = 0;
                            if (i18 != 0) {
                                j3 = bnVar.f46085l6;
                            } else {
                                j3 = 0;
                            }
                            if (i18 != 0) {
                                j10 = bnVar.f45981d7;
                            } else {
                                j10 = 0;
                            }
                            if (i18 != 0) {
                                j11 = bnVar.d();
                            }
                            p12.e2(fjVar3, bnVar, j3, j10, j11, bnVar.f45985db);
                            return;
                        }
                        try {
                            org.telegram.messenger.g0.u2(fjVar3, bnVar.getParentActivity(), bnVar.Ba, false);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            bnVar.M6(fjVar3);
                            return;
                        }
                    }
                }
                TLRPC.Message message3 = messageObject.f23968k;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || org.telegram.messenger.fj.K4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i10 = arrayList3.size();
                    } else {
                        i10 = -1;
                    }
                    TLRPC.TL_message R73 = bn.R7(message3);
                    R73.media = messageMedia3;
                    R73.attachPath = sh.e.c(-2, message3);
                    i13 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    arrayList3.add(new org.telegram.messenger.fj(i13, R73, false, true));
                    arrayList2.add(-2);
                } else {
                    i10 = -1;
                }
                if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || org.telegram.messenger.fj.K4(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i10 = arrayList3.size();
                    }
                    TLRPC.TL_message R74 = bn.R7(message3);
                    R74.media = messageMedia2;
                    R74.attachPath = sh.e.c(-3, message3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    R74.message = pollResults2.solution;
                    R74.entities = pollResults2.solution_entities;
                    i12 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    arrayList3.add(new org.telegram.messenger.fj(i12, R74, false, true));
                    arrayList2.add(-3);
                }
                cg.d.b(tL_messageMediaPoll.poll, bnVar.getUserConfig().e());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
                if (arrayList4 == null) {
                    arrayList4 = poll.answers;
                }
                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i19);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || org.telegram.messenger.fj.K4(document))) {
                        if (pollAnswer2.unshuffled_index == i7) {
                            i10 = arrayList3.size();
                        }
                        TLRPC.TL_message R75 = bn.R7(message3);
                        R75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        R75.message = tL_textWithEntities2.text;
                        R75.entities = tL_textWithEntities2.entities;
                        R75.attachPath = sh.e.c(pollAnswer2.unshuffled_index, message3);
                        i11 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                        arrayList3.add(new org.telegram.messenger.fj(i11, R75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i10 > -1 && !arrayList3.isEmpty()) {
                    messageObject.f24000s0 = arrayList2;
                    PhotoViewer.p1().I2(null, bnVar, bnVar.Ba);
                    PhotoViewer.p1().a2(arrayList3, i10, bnVar.a(), 0L, 0L, bnVar.eb);
                }
            }
        }
    }

    @Override
    public final boolean p0(org.telegram.ui.Components.x5 x5Var) {
        TLRPC.InputStickerSet i12;
        int i7;
        bn bnVar = this.f49922a;
        if (!bnVar.getMessagesController().K3() && x5Var != null && !x5Var.standard) {
            long documentId = x5Var.getDocumentId();
            TLRPC.Document document = x5Var.document;
            if (document == null) {
                i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                document = org.telegram.ui.Components.o5.e(i7, documentId);
            }
            if (document != null && (i12 = org.telegram.messenger.fj.i1(document)) != null) {
                org.telegram.messenger.ri.d0(org.telegram.messenger.j10.f24773t0).o0(i12, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(i12);
                org.telegram.ui.Components.bv bvVar = new org.telegram.ui.Components.bv(bnVar, bnVar.getParentActivity(), bnVar.Ba, arrayList);
                org.telegram.ui.Components.tu tuVar = bvVar.f33787q1;
                tuVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(tuVar);
                tuVar.f40106w = imageReceiver;
                if (tuVar.d) {
                    imageReceiver.P();
                }
                tuVar.f40107x = true;
                tuVar.f40108y.e(true, 1.0f);
                tuVar.f40106w.r0(org.telegram.messenger.fc.b(document), "140_140", org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false), document), "140_140", org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.f29561m6, 0.2f, true), 0L, null, null, 0);
                tuVar.f40106w.E0(7);
                ImageReceiver imageReceiver2 = tuVar.f40106w;
                imageReceiver2.f22669v0 = true;
                imageReceiver2.f22667u0 = true;
                imageReceiver2.W(1);
                ImageReceiver imageReceiver3 = tuVar.f40106w;
                imageReceiver3.f22675x0 = true;
                imageReceiver3.H0(tuVar);
                boolean V9 = bnVar.V9();
                bvVar.f30210i0 = V9;
                bvVar.f30217n = V9;
                bnVar.showDialog(bvVar);
                return true;
            }
        }
        return false;
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
        org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
        boolean z11 = false;
        fm fmVar = null;
        fm fmVar2 = null;
        File file = null;
        fm fmVar3 = null;
        fm fmVar4 = null;
        bn bnVar = this.f49922a;
        if (i7 == 19) {
            vf.b bVar = bnVar.f45999ec;
            if (bVar != null) {
                bVar.a(true);
            }
            if (q1Var.getMessageObject() != null) {
                fmVar2 = new fm(this, q1Var, 2);
            }
            final fm fmVar5 = fmVar2;
            bnVar.f45999ec = fmVar5;
            final Activity parentActivity = bnVar.getParentActivity();
            final org.telegram.ui.ActionBar.i6 resourceProvider = bnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            fmVar5.d();
            fmVar5.f59374b = new wg.c(atomicBoolean, 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.f23968k.media;
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
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24773t0).O0(Long.valueOf(-messageObject.Z0()));
            if (O0 != null && org.telegram.messenger.v3.V(O0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j3 = messageObject.f23968k.date * 1000;
            wg.s.d(messageObject, new org.telegram.messenger.x10(atomicBoolean, fmVar5, z10, b10, j3, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f59728a;
                public final vf.b f59729b;
                public final boolean f59730c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway f59731e;
                public final Context f59732f;
                public final i6 f59733g;

                {
                    this.f59731e = tL_messageMediaGiveaway2;
                    this.f59732f = parentActivity;
                    this.f59733g = resourceProvider;
                }

                @Override
                public final void a(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f59728a.get()) {
                        this.f59729b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f59730c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.f59731e;
                        Context context = this.f59732f;
                        i6 i6Var = this.f59733g;
                        if (z12) {
                            h.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, i6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            h.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, i6Var);
                        }
                    }
                }
            }, new wg.e(atomicBoolean, fmVar5, 0));
        } else if (i7 == 21) {
            org.telegram.messenger.t0.u();
            boolean z12 = org.telegram.messenger.s2.f26723a;
            org.telegram.messenger.t0.r();
            vf.c.t(bnVar.getParentActivity(), org.telegram.messenger.s2.f26728g);
        } else if (i7 == 84) {
            bnVar.Wa(q1Var);
        } else if (i7 == 80) {
            org.telegram.ui.Cells.o8 o8Var = org.telegram.ui.Components.df0.M1;
            if (bnVar.getParentActivity() != null) {
                bnVar.showDialog(new org.telegram.ui.Components.df0(bnVar.getContext(), bnVar.getCurrentAccount(), messageObject, bnVar.getResourceProvider()));
            }
        } else if (i7 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.f23968k.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(messageObject) == null) {
                    bnVar.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i7 == 5) {
            long j10 = messageObject.f23968k.media.user_id;
            if (j10 != 0) {
                i13 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                user2 = org.telegram.messenger.mp.u1(i13).c2(Long.valueOf(j10));
            } else {
                user2 = null;
            }
            TLRPC.MessageMedia messageMedia5 = messageObject.f23968k.media;
            String str = messageMedia5.phone_number;
            String str2 = messageMedia5.vcard;
            String str3 = messageMedia5.first_name;
            String str4 = messageMedia5.last_name;
            if (user2 != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.f28554id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str2);
                bundle.putString("vcard_phone", str);
                bundle.putString("vcard_first_name", str3);
                bundle.putString("vcard_last_name", str4);
                bnVar.presentFragment(new ProfileActivity(bundle, null));
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
                bnVar.showDialog(new org.telegram.ui.Components.ld0(bnVar, null, user2, null, file, pf.b.d(str, false), str3, str4, bnVar.Ba));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (i7 == 30) {
            bnVar.presentFragment(new bn(a8.p0.j(messageObject.f23968k.media.user_id, "user_id")));
        } else if (i7 == 31) {
            long j11 = messageObject.f23968k.media.user_id;
            if (j11 != 0) {
                i12 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                user = org.telegram.messenger.mp.u1(i12).c2(Long.valueOf(j11));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.Z1)) {
                    M0 = messageObject.Z1.toString();
                } else if (!TextUtils.isEmpty(user.phone)) {
                    M0 = org.telegram.messenger.n10.h(new StringBuilder("+"), user.phone, pf.b.c());
                } else {
                    String str5 = org.telegram.messenger.fj.n1(messageObject.f23968k).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        M0 = pf.b.c().b(str5);
                    } else {
                        M0 = org.telegram.messenger.gd.M0(2131747639, null);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.f28554id);
                bundle2.putString("phone", M0);
                bundle2.putBoolean("addContact", true);
                bnVar.presentFragment(new qr(bundle2));
            }
        } else if (i7 != 23 && i7 != 24) {
            if (messageObject.r4()) {
                bnVar.ma(messageObject, false, false);
                if (messageObject.T0 != null) {
                    vf.b bVar2 = bnVar.f45999ec;
                    if (bVar2 != null) {
                        bVar2.a(true);
                    }
                    if (q1Var.getMessageObject() != null) {
                        fmVar3 = new fm(this, q1Var, 4);
                    }
                    bnVar.f45999ec = fmVar3;
                    vf.c.s(bnVar.getParentActivity(), Uri.parse(messageObject.T0), true, false, false, bnVar.f45999ec, null, false, bnVar.getMessagesController().f25659g6, false, false);
                    return;
                }
                return;
            }
            TLRPC.WebPage W1 = messageObject.W1();
            if (W1 == null && (message = messageObject.f23968k) != null && (messageMedia2 = message.media) != null) {
                W1 = messageMedia2.webpage;
            }
            if (W1 != null) {
                if (W1.attributes != null) {
                    for (int i14 = 0; i14 < W1.attributes.size(); i14++) {
                        if ((W1.attributes.get(i14) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) W1.attributes.get(i14)).storyItem) != null) {
                            storyItem.dialogId = org.telegram.messenger.n5.o(tL_webPageAttributeStory.peer);
                            tL_webPageAttributeStory.storyItem.messageId = messageObject.e1();
                            tL_webPageAttributeStory.storyItem.messageType = 1;
                            bnVar.getOrCreateStoryViewer().L(bnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, fi.y6.a(bnVar.A0));
                            return;
                        }
                    }
                }
                if (!bnVar.Ha(W1.url, q1Var, null, messageObject.e1(), 2)) {
                    vf.b bVar3 = bnVar.f45999ec;
                    if (bVar3 != null) {
                        bVar3.a(true);
                    }
                    if (q1Var.getMessageObject() != null) {
                        fmVar4 = new fm(this, q1Var, 5);
                    }
                    bnVar.f45999ec = fmVar4;
                    vf.c.s(bnVar.getParentActivity(), Uri.parse(W1.url), true, true, false, bnVar.f45999ec, null, false, true, false, false);
                }
            }
        } else {
            if (i7 == 24) {
                z11 = true;
            }
            TLRPC.Message message2 = messageObject.f23968k;
            if (message2 != null && (messageMedia = message2.media) != null) {
                webPage = messageMedia.webpage;
            } else {
                webPage = null;
            }
            if (webPage != null && webPage.url != null) {
                Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage.url);
                vf.b bVar4 = bnVar.f45999ec;
                if (bVar4 != null) {
                    bVar4.a(true);
                }
                if (q1Var.getMessageObject() != null) {
                    fmVar = new fm(this, q1Var, 3);
                }
                bnVar.f45999ec = fmVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i10 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                    if (org.telegram.messenger.ri.d0(i10).r0(group) == null) {
                        bnVar.f45999ec.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i11 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                        bnVar.f45999ec.f59374b = new ii(this, ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getStickerSet, new hi.c3(3, this, z11)), 2);
                        return;
                    }
                }
                vf.c.s(bnVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, bnVar.f45999ec, null, false, true, false, false);
            }
        }
    }

    @Override
    public final boolean p2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.fj messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (q1Var != null && pageBlock != null) {
            bn bnVar = this.f49922a;
            if (bnVar.getParentActivity() != null && (messageObject = q1Var.getMessageObject()) != null && (message = messageObject.f23968k) != null && messageObject.f24025y2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.f24025y2.f23775g;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    org.telegram.messenger.zt ztVar = (org.telegram.messenger.zt) arrayList2.get(i7);
                    if (ztVar instanceof org.telegram.messenger.mu) {
                        arrayList.add(((org.telegram.messenger.mu) ztVar).f25841r0);
                    } else if (ztVar instanceof org.telegram.messenger.yu) {
                        arrayList.add(((org.telegram.messenger.yu) ztVar).f28183r0);
                    } else if (ztVar instanceof org.telegram.messenger.eu) {
                        ArrayList arrayList3 = ((org.telegram.messenger.eu) ztVar).Y;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            arrayList.add(((org.telegram.messenger.st) obj).f26851b);
                        }
                    } else if (ztVar instanceof org.telegram.messenger.qu) {
                        ArrayList arrayList4 = ((org.telegram.messenger.qu) ztVar).Y;
                        int size2 = arrayList4.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            arrayList.add(((org.telegram.messenger.st) obj2).f26851b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer p12 = PhotoViewer.p1();
                    p12.I2(null, bnVar, null);
                    return p12.d2(null, null, null, null, null, null, null, indexOf, new sl(bnVar, arrayList), null, 0L, 0L, 0L, true, new rl(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    @Override
    public final void q(org.telegram.ui.Cells.q1 q1Var) {
        float f10;
        if (q1Var.getMessageObject().y3()) {
            i1();
            return;
        }
        bn bnVar = this.f49922a;
        if (!bnVar.A3 && bnVar.A0 != null && bnVar.getParentActivity() != null && bnVar.fragmentView != null) {
            if (bnVar.J2 == null) {
                int indexOfChild = bnVar.f46093m1.indexOfChild(bnVar.U);
                if (indexOfChild != -1) {
                    hi.m3 E6 = bnVar.E6(250.0f, 3, indexOfChild + 1, false);
                    bnVar.J2 = E6;
                    E6.v(org.telegram.messenger.gd.M0(2131749137, null));
                } else {
                    return;
                }
            }
            org.telegram.messenger.fj messageObject = q1Var.getMessageObject();
            if (messageObject != null) {
                TLRPC.User currentUser = q1Var.getCurrentUser();
                if (currentUser != null && currentUser.f28554id == 0) {
                    f10 = (q1Var.getMeasuredHeight() - Math.max(0, q1Var.getBottom() - ((View) q1Var.getParent()).getMeasuredHeight())) - org.telegram.messenger.g0.L(50.0f);
                } else {
                    float L = org.telegram.messenger.g0.L(22.0f);
                    if (!messageObject.P3() && q1Var.f31415k9 && q1Var.V8 != null) {
                        f10 = org.telegram.messenger.g0.L(20.0f) + L;
                    } else {
                        f10 = L;
                    }
                }
                if (bnVar.w9(q1Var, f10) > org.telegram.messenger.g0.L(80.0f)) {
                    bnVar.J2.y(bnVar.v9(q1Var, q1Var.getForwardNameCenterX()), bnVar.w9(q1Var, f10) - org.telegram.messenger.g0.L(4.0f), true);
                }
            }
        }
    }

    @Override
    public final void q0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        bn bnVar = this.f49922a;
        bnVar.Y7(q1Var, false, false, f10, f11, true, false, false);
        bnVar.A0.getClass();
        bn.l2(bnVar, RecyclerView.R(q1Var));
    }

    @Override
    public final void q2(org.telegram.ui.Cells.q1 q1Var) {
        org.telegram.messenger.fj primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f49922a.Zc(primaryMessageObject, false);
    }

    @Override
    public final void s(org.telegram.ui.Cells.q1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.s(org.telegram.ui.Cells.q1):void");
    }

    @Override
    public final void s2() {
        this.f49922a.O9();
    }

    @Override
    public final void t1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        wh.h hVar;
        int i7;
        boolean z10;
        boolean z11;
        float f12;
        wh.i iVar = this.f49922a.f46202ua;
        if (iVar != null && (hVar = (wh.h) iVar.f59927a.get(wh.i.b(q1Var))) != null) {
            wh.d[] dVarArr = hVar.f59925x;
            RectF rectF = hVar.f59922r;
            if (hVar.N) {
                float f13 = (f10 - rectF.left) + hVar.V;
                float f14 = (f11 - rectF.top) + hVar.W;
                int i10 = wh.g.f59907a;
                int floor = (int) Math.floor((f13 - (org.telegram.messenger.g0.L(9) - (org.telegram.messenger.g0.L(11) / 2.0f))) / org.telegram.messenger.g0.L(wh.g.f59907a + 11));
                if ((-org.telegram.messenger.g0.L(37)) < f14 && f14 < rectF.height()) {
                    i7 = c8.l9.b(floor, 0, dVarArr.length - 1);
                } else {
                    i7 = -1;
                }
                if (hVar.S != i7) {
                    hVar.f59914a.performHapticFeedback(3, 1);
                    hVar.S = i7;
                    for (int i11 = 0; i11 < dVarArr.length; i11++) {
                        wh.d dVar = dVarArr[i11];
                        if (i7 == i11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f15 = 1.0f;
                        if (dVar.f59885p != z10) {
                            ValueAnimator valueAnimator = dVar.f59883n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f59885p = z10;
                            float f16 = dVar.f59884o;
                            if (z10) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f16, f12);
                            dVar.f59883n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f59883n.addUpdateListener(dVar);
                            dVar.f59883n.setInterpolator(wh.f.f59889a);
                            dVar.f59883n.start();
                        }
                        wh.d dVar2 = dVarArr[i11];
                        if (i7 != i11 && i7 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f59882m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f59880k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f59882m = z11;
                            float f17 = dVar2.f59881l;
                            if (!z11) {
                                f15 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f17, f15);
                            dVar2.f59880k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f59880k.addUpdateListener(dVar2);
                            dVar2.f59880k.setInterpolator(wh.f.f59889a);
                            dVar2.f59880k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void t2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.f49922a.n8(q1Var, reactionCount, z10, f10, f11);
    }

    @Override
    public final void u0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        bn bnVar = this.f49922a;
        kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
        boolean z10 = true;
        if (!kVar.y() && !bnVar.Y9()) {
            if (q1Var != null && q1Var.getMessageObject() != null && q1Var.getMessageObject().r4()) {
                p1(q1Var, 10);
                return;
            }
            if (!org.telegram.messenger.v3.c0(bnVar.f45987e) && !bnVar.fa()) {
                z10 = false;
            }
            o(user, z10);
            return;
        }
        bn.k2(bnVar, q1Var, true, f10, f11);
    }

    @Override
    public final void v() {
        this.f49922a.Fc();
    }

    @Override
    public final boolean v2(int i7) {
        boolean z10;
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.s4 s4Var2;
        if (i7 != 16 && i7 != 2131296267 && i7 != 2131296264) {
            return false;
        }
        bn bnVar = this.f49922a;
        z10 = ((org.telegram.ui.ActionBar.h2) bnVar).inPreviewMode;
        if (z10 && bnVar.f46024ga) {
            s4Var = ((org.telegram.ui.ActionBar.h2) bnVar).parentLayout;
            if (s4Var != null) {
                s4Var2 = ((org.telegram.ui.ActionBar.h2) bnVar).parentLayout;
                ((ActionBarLayout) s4Var2).r();
            }
            return true;
        }
        return !b();
    }

    @Override
    public final void w(org.telegram.ui.Cells.q1 q1Var) {
        int i7;
        int i10;
        ej ejVar;
        org.telegram.messenger.fj primaryMessageObject = q1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.f23936c3 = !primaryMessageObject.f23936c3;
            primaryMessageObject.M1 = true;
            bn bnVar = this.f49922a;
            bj bjVar = bnVar.A0;
            if (bjVar != null && (ejVar = bnVar.C0) != null && ejVar.f59083y < 0) {
                for (int childCount = bjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = bnVar.A0.getChildAt(childCount);
                    bnVar.A0.getClass();
                    i7 = RecyclerView.R(childAt);
                    if (i7 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                                i10 = bnVar.h9(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.u0) {
                            i10 = bnVar.h9(childAt);
                            break;
                        }
                    }
                }
            }
            i7 = -1;
            i10 = 0;
            bnVar.Zc(primaryMessageObject, false);
            hi.m3 m3Var = bnVar.P1;
            if (m3Var != null) {
                m3Var.f(true);
            }
            if (i7 >= 0 && q1Var.getCurrentMessagesGroup() == null) {
                bnVar.C0.h1(i7, i10);
            }
        }
    }

    @Override
    public final void w0(org.telegram.ui.Cells.q1 r29, float r30, float r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.w0(org.telegram.ui.Cells.q1, float, float, boolean):void");
    }

    @Override
    public final boolean x1() {
        bn bnVar = this.f49922a;
        if (bnVar.f46093m1.getMeasuredWidth() > bnVar.f46093m1.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void x2() {
        bn bnVar = this.f49922a;
        if (bnVar.getUserConfig().q()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", bnVar.f46085l6);
            bundle.putInt("start_from", 10);
            bnVar.presentFragment(new org.telegram.ui.Components.i90(bundle, bnVar.f46129p1.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.lc.b0(bnVar).Q(2131624217, 36, org.telegram.messenger.g0.T2(org.telegram.messenger.gd.H(',', "UnlockSimilarChannelsPremium", bnVar.getMessagesController().A4), new ul(this, 4))).j();
    }

    @Override
    public final void y(org.telegram.ui.Cells.q1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mm.y(org.telegram.ui.Cells.q1):void");
    }

    @Override
    public final boolean y0(org.telegram.messenger.fj fjVar) {
        return !this.f49922a.f46168s.containsKey(fjVar);
    }

    @Override
    public final void y2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
        org.telegram.messenger.fj messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        bn bnVar = this.f49922a;
        hi.m3 m3Var = bnVar.P1;
        if (m3Var != null) {
            m3Var.f(true);
        }
        if (bnVar.getParentActivity() != null && (messageObject = q1Var.getMessageObject()) != null && (R0 = messageObject.R0()) != null && R0.country != null) {
            try {
                str = new Locale("", R0.country).getDisplayCountry(org.telegram.messenger.gd.E0().f24244y);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                str = R0.country;
            }
            hi.m3 m3Var2 = new hi.m3(bnVar.getParentActivity(), 3);
            m3Var2.r(true);
            m3Var2.L = Layout.Alignment.ALIGN_NORMAL;
            m3Var2.d = -1L;
            m3Var2.U = true;
            m3Var2.f14998e = true;
            m3Var2.s(12.0f);
            bnVar.P1 = m3Var2;
            m3Var2.f15014r0 = new ci(2, this, m3Var2);
            m3Var2.v(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750837, str)));
            bnVar.P1.l(bnVar.L);
            bnVar.f46093m1.addView(bnVar.P1, c8.ma.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            bnVar.f46093m1.post(new l2.x(this, q1Var, i10, i7, 12));
        }
    }

    @Override
    public final String z(long j3) {
        TLRPC.Peer peer;
        String E0;
        bn bnVar = this.f49922a;
        if (org.telegram.messenger.o10.v(bnVar.f46001f)) {
            return null;
        }
        TLRPC.Chat chat = bnVar.f45987e;
        if (chat != null && !org.telegram.messenger.v3.V(chat) && (E0 = bnVar.getMessagesController().E0(bnVar.f45987e.f28405id, j3)) != null) {
            return E0;
        }
        TLRPC.TL_forumTopic tL_forumTopic = bnVar.f46159r4;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j3 && peer.channel_id != j3 && peer.chat_id != j3)) {
            return null;
        }
        return org.telegram.messenger.gd.M0(2131743785, null);
    }

    @Override
    public final void z0(org.telegram.ui.Cells.q1 q1Var) {
        sh.c cVar = this.f49922a.f46079kd;
        if (cVar != null && cVar.f57427n == q1Var) {
            cVar.f57431x.getClass();
        }
    }

    @Override
    public final boolean z1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        bn bnVar = this.f49922a;
        if (bnVar.f45944ac != 0 && q1Var.getMessageObject() != null && bnVar.f45944ac == q1Var.getMessageObject().e1() && bnVar.f45959bc == i7) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Cells.j9 z2() {
        return this.f49922a.f46201u9;
    }
}
