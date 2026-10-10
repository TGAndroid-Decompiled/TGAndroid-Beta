package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.NumberTextView;
public final class j9 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, eh0 {
    public final ArrayList E;
    public org.telegram.ui.ActionBar.v0 F;
    public final ArrayList G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList K;
    public final ArrayList L;
    public org.telegram.ui.Components.bt M;
    public FrameLayout N;
    public x8 O;
    public TLRPC.User P;
    public TLRPC.Chat Q;
    public Long R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public int W;
    public final Rect X;
    public final ah.h Y;
    public final fh.d Z;
    public final int f38910a;
    public final fh.d f38911a0;
    public g9 f38912b;
    public final ah.c f38913b0;
    public s4.d0 f38914c;
    public ah.n f38915c0;
    public org.telegram.ui.Components.l71 d;
    public final ArrayList f38916d0;
    public org.telegram.ui.Components.ul0 f38917e;
    public final RectF f38918e0;
    public org.telegram.ui.Components.q20 f38919f;
    public final RectF f38920f0;
    public org.telegram.ui.Components.k10 h;
    public v8 f38921n;
    public ci.r6 f38922r;
    public ci.d4 f38923s;
    public boolean v;
    public boolean f38924w;
    public ImageView f38925x;
    public NumberTextView f38926y;

    public j9() {
        this(null);
    }

    public static void U(j9 j9Var) {
        org.telegram.ui.Components.l71 l71Var = j9Var.d;
        if (l71Var != null) {
            int childCount = l71Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = j9Var.d.getChildAt(i10);
                if (childAt instanceof e9) {
                    ((e9) childAt).d.v(0);
                }
            }
        }
        ImageView imageView = j9Var.f38925x;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(j9Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21187y8), PorterDuff.Mode.MULTIPLY));
            j9Var.f38925x.setBackground(org.telegram.ui.ActionBar.i6.g0(j9Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21205z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = j9Var.actionBar;
        if (kVar != null) {
            kVar.e();
        }
    }

    public static void V(j9 j9Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            j9Var.getMessagesController().putUsers(groupcall.users, false);
            j9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                j9Var.showDialog(new bu(j9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.f2.g(j9Var.getParentActivity(), j9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            j9Var.showDialog(new bu(j9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.ad.a0(j9Var).f0(tL_error, false);
        }
    }

    public static void W(org.telegram.ui.j9 r18, org.telegram.tgnet.TLRPC.TL_error r19, org.telegram.tgnet.TLObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j9.W(org.telegram.ui.j9, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void X(j9 j9Var, org.telegram.ui.Components.q61 q61Var, View view) {
        int i10 = q61Var.d;
        if (i10 == 2) {
            j9Var.n0(true);
            org.telegram.ui.Components.tc I = org.telegram.ui.Components.ad.a0(j9Var).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new i8(j9Var, 4));
            I.f31096j = 5000;
            I.j();
        } else if (i10 == 1) {
            m0(j9Var);
        } else {
            Object obj = q61Var.G;
            if (obj instanceof f9) {
                f9 f9Var = (f9) obj;
                ArrayList arrayList = f9Var.f37532c;
                if (j9Var.actionBar.t()) {
                    j9Var.e0(arrayList, (e9) view);
                } else if (f9Var.f37530a != 0 && !arrayList.isEmpty()) {
                    boolean z10 = f9Var.f37533e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = f9Var.f37531b;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).f20189id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).f20063id;
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(j9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = j9Var.getMessagesController().conferenceCallSizeLimit;
                    b2Var.setOnCancelListener(new o8(j9Var, j9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(j9Var, b2Var, hashSet, tL_inputGroupCallInviteMessage, z10, 0)), 0));
                    b2Var.q(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).f20063id);
                    j9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    j9Var.presentFragment(new zn(bundle), j9Var.v);
                }
            } else if (view instanceof i9) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((i9) view).f38588c.f20042id);
                j9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                j9Var.presentFragment(new zn(bundle2), j9Var.v);
            }
        }
    }

    public static void Y(j9 j9Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            j9Var.getMessagesController().putUsers(groupcall.users, false);
            j9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                j9Var.showDialog(new bu(j9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.f2.g(j9Var.getParentActivity(), j9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            j9Var.showDialog(new bu(j9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.ad.a0(j9Var).f0(tL_error, false);
        }
    }

    public static org.telegram.ui.ActionBar.k Z(j9 j9Var) {
        return j9Var.actionBar;
    }

    public static void m0(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(new c9(a1.g.i("isCall", true), n2Var.getCurrentAccount(), n2Var));
    }

    public static void o0(final Context context, int i10, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.e6 e6Var, boolean z10, final boolean z11) {
        String str2;
        int i11;
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20872h5, e6Var);
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, e6Var, false);
        f3Var.setBackgroundColor(w02);
        f3Var.fixNavigationBar(w02);
        final ?? r12 = {str};
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        e7.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        e7.addView(frameLayout, w7.x5.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, w7.x5.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
        frameLayout.addView(frameLayout2, w7.x5.a(80.0f, 0.0f, 12.0f, 0.0f, 0.0f, 80, 1));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21185y6, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w03, mode));
        int i12 = org.telegram.ui.ActionBar.i6.f20892i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(i12, e6Var), 1, -1));
        if (z11) {
            frameLayout.addView(imageView2, w7.x5.a(56.0f, 0.0f, 0.0f, 0.0f, 0.0f, 56, 53));
        }
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.Components.fa0 a2 = w7.b6.a(context, 20.0f, i13, true, e6Var);
        a2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        a2.setGravity(17);
        e7.addView(a2, w7.x5.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.fa0 a10 = w7.b6.a(context, 14.0f, i13, false, e6Var);
        a10.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        a10.setGravity(17);
        a10.setMaxWidth(ci.d4.a(a10.getText(), a10.getPaint()));
        e7.addView(a10, w7.x5.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        w7.z5.b(frameLayout3, 0.01f, 1.2f);
        int i14 = org.telegram.ui.ActionBar.i6.f20745a7;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.i6.a0(org.telegram.ui.ActionBar.i6.w0(i14, e6Var), org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(i14, e6Var), org.telegram.ui.ActionBar.i6.w0(i12, e6Var)), 12, 12));
        e7.addView(frameLayout3, w7.x5.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.fa0 a11 = w7.b6.a(context, 13.0f, i13, false, e6Var);
        a11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        a11.setText(str2);
        frameLayout3.addView(a11, w7.x5.a(-1.0f, 0.0f, 0.0f, 30.0f, 0.0f, -1, 119));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21058r5, e6Var), mode));
        frameLayout3.addView(imageView3, w7.x5.e(40, 48, 21));
        LinearLayout e10 = org.telegram.messenger.bi.e(context, 0);
        e7.addView(e10, w7.x5.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        ci.d dVar = new ci.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.er(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.g(spannableStringBuilder, false, true);
        e10.addView(dVar, w7.x5.p(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        ci.d dVar2 = new ci.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.er(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.g(spannableStringBuilder2, false, true);
        e10.addView(dVar2, w7.x5.p(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        if (z10) {
            z8 z8Var = new z8(context, e6Var);
            z8Var.setGravity(17);
            z8Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21203z6, e6Var));
            z8Var.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            z8Var.setTextSize(14.0f);
            e7.addView(z8Var, w7.x5.t(190, -2, 1, 28, 12, 28, 8));
            i11 = i10;
            ai.s1 s1Var = new ai.s1(str, i11, f3VarArr);
            org.telegram.ui.Components.fa0 a12 = w7.b6.a(context, 14.0f, i13, false, e6Var);
            a12.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), s1Var), true));
            a12.setGravity(17);
            a12.setMaxWidth(ci.d4.a(a12.getText(), a12.getPaint()));
            e7.addView(a12, w7.x5.t(-1, -2, 17, 32, 8, 32, 12));
            w7.z5.b(a12, 0.05f, 1.2f);
            a12.setOnClickListener(new a(s1Var, 9));
        } else {
            i11 = i10;
        }
        f3Var.customView = e7;
        f3Var.show();
        f3VarArr[0] = f3Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.ad adVar;
                int i15;
                switch (r4) {
                    case 0:
                        AndroidUtilities.addToClipboard(r12[0]);
                        adVar = new org.telegram.ui.Components.ad(f3Var.topBulletinContainer, e6Var);
                        i15 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(r12[0]);
                        adVar = new org.telegram.ui.Components.ad(f3Var.topBulletinContainer, e6Var);
                        i15 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.bi.p(i15, adVar);
            }
        });
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.ad adVar;
                int i15;
                switch (r4) {
                    case 0:
                        AndroidUtilities.addToClipboard(r12[0]);
                        adVar = new org.telegram.ui.Components.ad(f3Var.topBulletinContainer, e6Var);
                        i15 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(r12[0]);
                        adVar = new org.telegram.ui.Components.ad(f3Var.topBulletinContainer, e6Var);
                        i15 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.bi.p(i15, adVar);
            }
        });
        final gg.d1 d1Var = new gg.d1(inputGroupCall, i11, r12, frameLayout3, a11, f3Var, e6Var, 4);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f3 f3Var2 = org.telegram.ui.ActionBar.f3.this;
                org.telegram.ui.ActionBar.d3 d3Var = f3Var2.container;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.Components.q80 F = org.telegram.ui.Components.q80.F(d3Var, e6Var2, frameLayout3);
                int i15 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.Copy);
                String[] strArr = r12;
                F.c(i15, string, new r1(strArr, f3Var2, e6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new org.telegram.ui.ActionBar.p(11, context, strArr), false);
                F.m(z11, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, d1Var);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new ai.s0(context, str, r12, e6Var, f3Var, 6));
        if (z11) {
            imageView2.setOnClickListener(new ai.p5(f3Var, e6Var, imageView2, d1Var, 5));
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        return true;
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.L();
        createActionBar.k();
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        createActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        if (!this.f38924w) {
            hg.c.v(false, this.actionBar);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 24));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.o().a(10, R.drawable.ic_ab_other);
        this.F = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int i10 = 2;
        this.F.setOnClickListener(new m8(this, 2));
        org.telegram.ui.Components.l71 l71Var = new org.telegram.ui.Components.l71(this, new b5(this, 1), new j8(this), new j8(this));
        this.d = l71Var;
        int i11 = org.telegram.ui.ActionBar.i6.f20745a7;
        l71Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i11, this.resourceProvider));
        this.d.p1();
        this.d.W2.f25587r = false;
        this.f38921n = new v8(this, context, 0);
        hh.j jVar = new hh.j(this.f38921n);
        v8 v8Var = this.f38921n;
        ah.c cVar = this.f38913b0;
        cVar.f545f = jVar;
        cVar.f546g = v8Var;
        org.telegram.ui.Components.l71 l71Var2 = this.d;
        Objects.requireNonNull(l71Var2);
        this.f38915c0 = new ah.n(l71Var2, v8Var, new u8(l71Var2, 0));
        this.d.C0(new i8(this, 6));
        v8 v8Var2 = this.f38921n;
        this.fragmentView = v8Var2;
        v8Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(context, null);
        this.h = k10Var;
        k10Var.setViewType(8);
        this.h.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        this.h.f27857w = false;
        g9 g9Var = new g9(this, context, this.h);
        this.f38912b = g9Var;
        this.f38921n.addView(g9Var, w7.x5.d(-1.0f, -1));
        this.d.setClipToPadding(false);
        this.d.setEmptyView(this.f38912b);
        org.telegram.ui.Components.l71 l71Var3 = this.d;
        s4.d0 d0Var = new s4.d0(1, false);
        this.f38914c = d0Var;
        l71Var3.setLayoutManager(d0Var);
        org.telegram.ui.Components.l71 l71Var4 = this.d;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        l71Var4.setVerticalScrollbarPosition(i10);
        org.telegram.ui.Components.ul0 ul0Var = new org.telegram.ui.Components.ul0(this.d, this.f38914c);
        this.f38917e = ul0Var;
        ul0Var.h = new j8(this);
        v8 v8Var3 = this.f38921n;
        org.telegram.ui.Components.l71 l71Var5 = this.d;
        float f7 = -this.f38910a;
        v8Var3.addView(l71Var5, w7.x5.a(-1.0f, 0.0f, f7, 0.0f, f7, -1, 3));
        this.d.setOnScrollListener(new w8(this));
        if (this.H) {
            this.f38912b.a();
        } else {
            this.f38912b.b();
        }
        org.telegram.ui.Components.q20 q20Var = new org.telegram.ui.Components.q20(context, this.resourceProvider, false);
        this.f38919f = q20Var;
        q20Var.f29985c.setImageResource(R.drawable.filled_calls_plus);
        this.f38919f.setContentDescription(LocaleController.getString(R.string.Call));
        this.f38919f.setOnClickListener(new m8(this, 3));
        this.f38921n.addView(this.f38919f, org.telegram.ui.Components.q20.b());
        org.telegram.ui.Components.bt btVar = new org.telegram.ui.Components.bt(context);
        this.M = btVar;
        btVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.M.setOnAnimatedHeightChangedListener(new i8(this, 0));
        ch.d c10 = cVar.c(this.M, eh.b.n(this.resourceProvider), false);
        c10.q(AndroidUtilities.dp(24.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        this.M.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.N = frameLayout;
        this.M.addView(frameLayout);
        this.M.i(this.N, true, false);
        x8 x8Var = new x8(this, context, this, this.f38921n, this.resourceProvider);
        this.O = x8Var;
        this.N.addView(x8Var);
        this.M.setCallFragmentContextView(this.O);
        this.f38921n.addView(this.M, w7.x5.a(-2.0f, 0.0f, -14.0f, 0.0f, 0.0f, -1, 48));
        this.f38921n.addView(this.actionBar);
        ci.r6 r6Var = new ci.r6(context, this.parentLayout);
        this.f38922r = r6Var;
        r6Var.b(false, false);
        this.f38921n.addView(this.f38922r, w7.x5.e(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.f38921n);
        this.actionBar.setAdaptiveBackground(this.d);
        setBulletinDelegate(new y8(this, 0));
        if (this.f38924w) {
            View view = this.fragmentView;
            j8 j8Var = new j8(this);
            WeakHashMap weakHashMap = r0.i0.f46810a;
            r0.a0.i(view, j8Var);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r18, int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j9.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e0(ArrayList arrayList, e9 e9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean l02 = l0(arrayList);
        ArrayList arrayList2 = this.L;
        if (l02) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f20063id));
            }
            org.telegram.ui.Components.dq dqVar = e9Var.f37245e;
            if (dqVar != null) {
                dqVar.a(false, true);
            }
            q0();
            return;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i11)).f20063id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.dq dqVar2 = e9Var.f37245e;
        if (dqVar2 != null) {
            dqVar2.a(true, true);
        }
        q0();
    }

    public final void f0() {
        ah.h hVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.Y) != null) {
            int dp = AndroidUtilities.dp(48.0f) + ((int) this.M.c(AndroidUtilities.dp(7.0f)));
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.W) - AndroidUtilities.dp(8.0f);
            this.f38918e0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
            RectF rectF = this.f38920f0;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), this.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            if (this.f38924w) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            hVar.g(i10, this.f38916d0);
            hVar.e(this.f38915c0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void g0() {
        this.f38919f.setTranslationY(((-this.W) - this.U) - this.V);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 2);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f20745a7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21079s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21134v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21098t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20892i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20923k0, null, null, org.telegram.ui.ActionBar.i6.f20802d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38912b, 4, new Class[]{g9.class}, new String[]{"emptyTextView1"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38912b, 4, new Class[]{g9.class}, new String[]{"emptyTextView2"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20785c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20873h6));
        int i11 = org.telegram.ui.ActionBar.i6.f20765b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        org.telegram.ui.Components.q20 q20Var = this.f38919f;
        if (q20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(q20Var.f29985c, 8, null, null, null, null, org.telegram.ui.ActionBar.i6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38919f.f29985c, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38919f.f29985c, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{e9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.il));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{e9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20887i1}, null, org.telegram.ui.ActionBar.i6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{e9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20833f1}, null, org.telegram.ui.ActionBar.i6.f21206z9));
        TextPaint textPaint = org.telegram.ui.ActionBar.i6.Q0;
        int i12 = org.telegram.ui.ActionBar.i6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{e9.class}, textPaint, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{e9.class}, org.telegram.ui.ActionBar.i6.P0, null, null, org.telegram.ui.ActionBar.i6.f21021p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.i6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{e9.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.i6.D0}, null, -1, null, org.telegram.ui.ActionBar.i6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.i6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{e9.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.i6.E0}, null, -1, null, org.telegram.ui.ActionBar.i6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{e9.class}, null, org.telegram.ui.ActionBar.i6.f21053r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.i6.V4, org.telegram.ui.ActionBar.i6.X4}, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.i6.W4, org.telegram.ui.ActionBar.i6.Y4}, null, org.telegram.ui.ActionBar.i6.f21060r7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        return arrayList;
    }

    public final void h0() {
        if (this.d.Z0()) {
            this.d.setClipBounds(null);
            return;
        }
        int i10 = this.f38910a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10);
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight() - AndroidUtilities.dp(i10);
        Rect rect = this.X;
        rect.set(0, measuredHeight, measuredWidth, measuredHeight2);
        this.d.setClipBounds(rect);
    }

    public final void i0() {
        org.telegram.ui.Components.l71 l71Var = this.d;
        int i10 = this.f38910a;
        l71Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10) + ((int) this.M.c(AndroidUtilities.dp(14.0f))), 0, AndroidUtilities.dp(i10) + this.W + this.T);
        this.f38912b.setPadding(0, 0, 0, this.W + this.T);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(int i10, int i11) {
        if (this.H) {
            return;
        }
        this.H = true;
        g9 g9Var = this.f38912b;
        if (g9Var != null && !this.I) {
            g9Var.a();
        }
        org.telegram.ui.Components.l71 l71Var = this.d;
        if (l71Var != null) {
            l71Var.W2.N(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i11;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.f20151q = "";
        tL_messages_search.offset_id = i10;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new m(this, 1), 2), this.classGuid);
    }

    public final void k0(boolean z10) {
        org.telegram.ui.Components.dq dqVar;
        this.actionBar.s();
        this.L.clear();
        int childCount = this.d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.d.getChildAt(i10);
            if ((childAt instanceof e9) && (dqVar = ((e9) childAt).f37245e) != null) {
                dqVar.a(false, z10);
            }
        }
        this.d.W2.N(true);
    }

    public final boolean l0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.L.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f20063id))) {
                return true;
            }
        }
        return false;
    }

    public final void n0(boolean z10) {
        if (z10 == getUserConfig().showCallsTab) {
            return;
        }
        getUserConfig().setShowCallsTab(z10);
        this.d.W2.N(true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.actionBar.t()) {
            if (z10) {
                k0(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.S && getUserConfig().showCallsTab && MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) < 2) {
            ci.d4 d4Var = new ci.d4(getParentActivity(), 1);
            this.f38923s = d4Var;
            d4Var.d = 3000L;
            d4Var.l(1.0f, -25.0f);
            this.f38923s.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            this.f38923s.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
            this.f38921n.addView(this.f38923s, w7.x5.e(-1, 80, 48));
            this.f38923s.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(16.0f));
            this.f38923s.u();
            this.S = true;
            MessagesController.getGlobalMainSettings().edit().putInt("hidecallshint", MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) + 1).apply();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        super.onFragmentCreate();
        int i11 = 0;
        j0(0, 50);
        this.K = getMessagesController().getActiveGroupCalls();
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.activeGroupCallsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.v = bundle.getBoolean("needFinishFragment", true);
            this.f38924w = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.f38924w) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.T = i10;
        if (this.f38924w) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.U = i11;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.activeGroupCallsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.W = i13;
        i0();
        g0();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (i10 != 101 && i10 != 102 && i10 != 103) {
            return;
        }
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                if (iArr[i11] != 0) {
                    z10 = false;
                    break;
                }
                i11++;
            } else {
                z10 = true;
                break;
            }
        }
        TLRPC.UserFull userFull = null;
        if (iArr.length > 0 && z10) {
            if (i10 == 103) {
                org.telegram.ui.Components.voip.f2.l(this.Q, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            if (this.P != null) {
                userFull = getMessagesController().getUserFull(this.P.f20189id);
            }
            TLRPC.User user = this.P;
            if (i10 == 102) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i10 != 102 && (userFull == null || !userFull.video_calls_available)) {
                z12 = false;
            } else {
                z12 = true;
            }
            org.telegram.ui.Components.voip.f2.m(user, z11, z12, getParentActivity(), null, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.f2.h(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.l71 l71Var = this.d;
        if (l71Var != null) {
            l71Var.W2.N(true);
        }
    }

    public final void p0(boolean z10) {
        int i10;
        int dp;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20378a;
        if (z10) {
            b2Var.R = LocaleController.getString(R.string.DeleteAllCalls);
            b2Var.T = LocaleController.getString(R.string.DeleteAllCallsText);
        } else {
            b2Var.R = LocaleController.getString(R.string.DeleteCalls);
            b2Var.T = LocaleController.getString(R.string.DeleteSelectedCallsText);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(getParentActivity(), 1);
        a2Var.setBackground(org.telegram.ui.ActionBar.i6.L0(false));
        a2Var.e(LocaleController.getString(R.string.DeleteCallsForEveryone), "", false, false, false);
        if (LocaleController.isRTL) {
            i10 = AndroidUtilities.dp(8.0f);
        } else {
            i10 = 0;
        }
        if (LocaleController.isRTL) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(8.0f);
        }
        a2Var.setPadding(i10, 0, dp, 0);
        frameLayout.addView(a2Var, w7.x5.a(48.0f, 8.0f, 0.0f, 8.0f, 0.0f, -1, 51));
        a2Var.setOnClickListener(new l8(0, zArr));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new com.google.firebase.messaging.i(this, z10, zArr, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21041q7, false));
        }
    }

    public final void q0() {
        boolean t10 = this.actionBar.t();
        ArrayList arrayList = this.L;
        boolean z10 = true;
        if (t10) {
            if (arrayList.isEmpty()) {
                k0(true);
                return;
            }
        } else {
            boolean a2 = this.actionBar.a(null);
            ArrayList arrayList2 = this.E;
            if (!a2) {
                org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
                if (this.f38924w) {
                    ImageView imageView = new ImageView(getParentActivity());
                    this.f38925x = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    this.f38925x.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                    this.f38925x.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f21187y8), PorterDuff.Mode.MULTIPLY));
                    this.f38925x.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(org.telegram.ui.ActionBar.i6.f21205z8), 1, -1));
                    this.f38925x.setOnClickListener(new m8(this, 1));
                    j3.addView(this.f38925x, w7.x5.q(54, 54, 16));
                    arrayList2.add(this.f38925x);
                }
                NumberTextView numberTextView = new NumberTextView(j3.getContext());
                this.f38926y = numberTextView;
                int i10 = 18;
                numberTextView.setTextSize(18);
                this.f38926y.setTypeface(AndroidUtilities.bold());
                this.f38926y.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21187y8, false));
                NumberTextView numberTextView2 = this.f38926y;
                if (!this.f38924w) {
                    i10 = 72;
                }
                j3.addView(numberTextView2, w7.x5.m(1.0f, 0, -1, i10, 0, 0));
                this.f38926y.setOnTouchListener(new bi.d(2));
                arrayList2.add(j3.h(2, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            }
            this.actionBar.O(null, null);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                View view = (View) arrayList2.get(i11);
                view.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f);
                AndroidUtilities.clearDrawableAnimation(view);
                arrayList3.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.1f, 1.0f));
            }
            animatorSet.playTogether(arrayList3);
            animatorSet.setDuration(200L);
            animatorSet.start();
            z10 = false;
        }
        this.f38926y.a(arrayList.size(), z10);
    }

    @Override
    public final void s() {
        if (this.f38914c.L0() < 15) {
            this.d.x0(0);
            return;
        }
        org.telegram.ui.Components.ul0 ul0Var = this.f38917e;
        ul0Var.f31548b = 1;
        ul0Var.c(0, 0, false, false);
    }

    @Override
    public final fh.d y() {
        return this.f38911a0;
    }

    public j9(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.f38910a = i10 >= 31 ? 48 : 0;
        this.v = true;
        this.E = new ArrayList();
        this.G = new ArrayList();
        this.L = new ArrayList();
        this.S = false;
        this.X = new Rect();
        ArrayList arrayList = new ArrayList();
        this.f38916d0 = arrayList;
        RectF rectF = new RectF();
        this.f38918e0 = rectF;
        RectF rectF2 = new RectF();
        this.f38920f0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.i6.f20745a7));
        if (i10 >= 31) {
            this.Y = new ah.h(false);
            this.Z = new fh.d(null);
            fh.d dVar = new fh.d(null);
            this.f38911a0 = dVar;
            ah.c cVar2 = new ah.c(dVar);
            this.f38913b0 = cVar2;
            cVar2.f547i = LiteMode.isEnabled(262144);
            return;
        }
        this.Y = null;
        this.Z = null;
        this.f38911a0 = null;
        this.f38913b0 = new ah.c(cVar);
    }
}
