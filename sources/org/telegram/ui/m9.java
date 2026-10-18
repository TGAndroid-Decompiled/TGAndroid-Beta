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
public final class m9 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, ng0 {
    public final ArrayList E;
    public org.telegram.ui.ActionBar.u0 F;
    public final ArrayList G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList K;
    public final ArrayList L;
    public org.telegram.ui.Components.us M;
    public FrameLayout N;
    public a9 O;
    public TLRPC.User P;
    public TLRPC.Chat Q;
    public Long R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public int W;
    public final Rect X;
    public final bh.f Y;
    public final gh.d Z;
    public final int f39013a;
    public final gh.d f39014a0;
    public j9 f39015b;
    public final bh.b f39016b0;
    public s4.b0 f39017c;
    public bh.l f39018c0;
    public org.telegram.ui.Components.a71 d;
    public final ArrayList f39019d0;
    public org.telegram.ui.Components.ll0 e;
    public final RectF f39020e0;
    public org.telegram.ui.Components.h20 f39021f;
    public final RectF f39022f0;
    public org.telegram.ui.Components.b10 h;
    public y8 f39023n;
    public ei.g6 f39024r;
    public ei.x3 f39025s;
    public boolean v;
    public boolean f39026w;
    public ImageView f39027x;
    public NumberTextView f39028y;

    public m9() {
        this(null);
    }

    public static void U(m9 m9Var) {
        org.telegram.ui.Components.a71 a71Var = m9Var.d;
        if (a71Var != null) {
            int childCount = a71Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = m9Var.d.getChildAt(i10);
                if (childAt instanceof h9) {
                    ((h9) childAt).d.v(0);
                }
            }
        }
        ImageView imageView = m9Var.f39027x;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(m9Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21376y8), PorterDuff.Mode.MULTIPLY));
            m9Var.f39027x.setBackground(org.telegram.ui.ActionBar.h6.g0(m9Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21393z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = m9Var.actionBar;
        if (kVar != null) {
            kVar.d();
        }
    }

    public static void V(m9 m9Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            m9Var.getMessagesController().putUsers(groupcall.users, false);
            m9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                m9Var.showDialog(new st(m9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.d2.g(m9Var.getParentActivity(), m9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            m9Var.showDialog(new st(m9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.xc.a0(m9Var).f0(tL_error, false);
        }
    }

    public static void W(org.telegram.ui.m9 r18, org.telegram.tgnet.TLRPC.TL_error r19, org.telegram.tgnet.TLObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m9.W(org.telegram.ui.m9, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void X(m9 m9Var, org.telegram.ui.Components.f61 f61Var, View view) {
        int i10 = f61Var.d;
        if (i10 == 2) {
            m9Var.n0(true);
            org.telegram.ui.Components.qc I = org.telegram.ui.Components.xc.a0(m9Var).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new m8(m9Var, 4));
            I.f29638j = 5000;
            I.j();
        } else if (i10 == 1) {
            m0(m9Var);
        } else {
            Object obj = f61Var.G;
            if (obj instanceof i9) {
                i9 i9Var = (i9) obj;
                ArrayList arrayList = i9Var.f37777c;
                if (m9Var.actionBar.s()) {
                    m9Var.e0(arrayList, (h9) view);
                } else if (i9Var.f37775a != 0 && !arrayList.isEmpty()) {
                    boolean z10 = i9Var.e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = i9Var.f37776b;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).f20419id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).f20293id;
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(m9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = m9Var.getMessagesController().conferenceCallSizeLimit;
                    b2Var.setOnCancelListener(new r8(m9Var, m9Var.getConnectionsManager().sendRequest(getgroupcall, new q8(m9Var, b2Var, hashSet, tL_inputGroupCallInviteMessage, z10, 0)), 0));
                    b2Var.q(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).f20293id);
                    m9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    m9Var.presentFragment(new sn(bundle), m9Var.v);
                }
            } else if (view instanceof l9) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((l9) view).f38774c.f20272id);
                m9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                m9Var.presentFragment(new sn(bundle2), m9Var.v);
            }
        }
    }

    public static void Y(m9 m9Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            m9Var.getMessagesController().putUsers(groupcall.users, false);
            m9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                m9Var.showDialog(new st(m9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.d2.g(m9Var.getParentActivity(), m9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            m9Var.showDialog(new st(m9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.xc.a0(m9Var).f0(tL_error, false);
        }
    }

    public static org.telegram.ui.ActionBar.k Z(m9 m9Var) {
        return m9Var.actionBar;
    }

    public static void m0(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(new f9(a1.g.h("isCall", true), n2Var.getCurrentAccount(), n2Var));
    }

    public static void o0(final Context context, int i10, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.d6 d6Var, boolean z10, final boolean z11) {
        String str2;
        int i11;
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21057h5, d6Var);
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, d6Var, false);
        f3Var.setBackgroundColor(w02);
        f3Var.fixNavigationBar(w02);
        final ?? r12 = {str};
        LinearLayout e = org.telegram.messenger.lk.e(context, 1);
        e.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        e.addView(frameLayout, w7.z5.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, w7.z5.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
        frameLayout.addView(frameLayout2, w7.z5.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21374y6, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w03, mode));
        int i12 = org.telegram.ui.ActionBar.h6.f21075i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), 1, -1));
        if (z11) {
            frameLayout.addView(imageView2, w7.z5.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.Components.x90 a2 = w7.d6.a(context, 20.0f, i13, true, d6Var);
        a2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        a2.setGravity(17);
        e.addView(a2, w7.z5.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.x90 a10 = w7.d6.a(context, 14.0f, i13, false, d6Var);
        a10.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        a10.setGravity(17);
        a10.setMaxWidth(ei.x3.a(a10.getText(), a10.getPaint()));
        e.addView(a10, w7.z5.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        w7.b6.b(frameLayout3, 0.01f, 1.2f);
        int i14 = org.telegram.ui.ActionBar.h6.f20928a7;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.h6.a0(org.telegram.ui.ActionBar.h6.w0(i14, d6Var), org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(i14, d6Var), org.telegram.ui.ActionBar.h6.w0(i12, d6Var)), 12, 12));
        e.addView(frameLayout3, w7.z5.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.x90 a11 = w7.d6.a(context, 13.0f, i13, false, d6Var);
        a11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        a11.setText(str2);
        frameLayout3.addView(a11, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21242r5, d6Var), mode));
        frameLayout3.addView(imageView3, w7.z5.e(40, 48, 21));
        LinearLayout e7 = org.telegram.messenger.lk.e(context, 0);
        e.addView(e7, w7.z5.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        ei.d dVar = new ei.d(context, d6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.yq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.g(spannableStringBuilder, false, true);
        e7.addView(dVar, w7.z5.p(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        ei.d dVar2 = new ei.d(context, d6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.yq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.g(spannableStringBuilder2, false, true);
        e7.addView(dVar2, w7.z5.p(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        if (z10) {
            c9 c9Var = new c9(context, d6Var);
            c9Var.setGravity(17);
            c9Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21391z6, d6Var));
            c9Var.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            c9Var.setTextSize(14.0f);
            e.addView(c9Var, w7.z5.t(190, -2, 1, 28, 12, 28, 8));
            i11 = i10;
            i4 i4Var = new i4(str, i11, f3VarArr, 1);
            org.telegram.ui.Components.x90 a12 = w7.d6.a(context, 14.0f, i13, false, d6Var);
            a12.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), i4Var), true));
            a12.setGravity(17);
            a12.setMaxWidth(ei.x3.a(a12.getText(), a12.getPaint()));
            e.addView(a12, w7.z5.t(-1, -2, 17, 32, 8, 32, 12));
            w7.b6.b(a12, 0.05f, 1.2f);
            a12.setOnClickListener(new a(i4Var, 9));
        } else {
            i11 = i10;
        }
        f3Var.customView = e;
        f3Var.show();
        f3VarArr[0] = f3Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.xc xcVar;
                int i15;
                switch (r4) {
                    case 0:
                        AndroidUtilities.addToClipboard(r12[0]);
                        xcVar = new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, d6Var);
                        i15 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(r12[0]);
                        xcVar = new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, d6Var);
                        i15 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.lk.p(i15, xcVar);
            }
        });
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.xc xcVar;
                int i15;
                switch (r4) {
                    case 0:
                        AndroidUtilities.addToClipboard(r12[0]);
                        xcVar = new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, d6Var);
                        i15 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(r12[0]);
                        xcVar = new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, d6Var);
                        i15 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.lk.p(i15, xcVar);
            }
        });
        final hg.d1 d1Var = new hg.d1(inputGroupCall, i11, r12, frameLayout3, a11, f3Var, d6Var, 4);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f3 f3Var2 = org.telegram.ui.ActionBar.f3.this;
                org.telegram.ui.ActionBar.d3 d3Var = f3Var2.container;
                org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                org.telegram.ui.Components.i80 F = org.telegram.ui.Components.i80.F(d3Var, d6Var2, frameLayout3);
                int i15 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.Copy);
                String[] strArr = r12;
                F.c(i15, string, new t1(strArr, f3Var2, d6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new i0(6, context, strArr), false);
                F.m(z11, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, d1Var);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new ci.e0(context, str, r12, d6Var, f3Var, 6));
        if (z11) {
            imageView2.setOnClickListener(new ci.b4(f3Var, d6Var, imageView2, d1Var, 5));
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
        if (!this.f39026w) {
            i2.d.y(false, this.actionBar);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 27));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(10, R.drawable.ic_ab_other);
        this.F = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int i10 = 2;
        this.F.setOnClickListener(new p8(this, 2));
        org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(this, new g5(this, 1), new n8(this), new n8(this));
        this.d = a71Var;
        int i11 = org.telegram.ui.ActionBar.h6.f20928a7;
        a71Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i11, this.resourceProvider));
        this.d.p1();
        this.d.W2.f30201r = false;
        this.f39023n = new y8(this, context, 0);
        ih.j jVar = new ih.j(this.f39023n);
        y8 y8Var = this.f39023n;
        bh.b bVar = this.f39016b0;
        bVar.f4362f = jVar;
        bVar.f4363g = y8Var;
        org.telegram.ui.Components.a71 a71Var2 = this.d;
        Objects.requireNonNull(a71Var2);
        this.f39018c0 = new bh.l(a71Var2, y8Var, new x8(a71Var2, 0));
        this.d.C0(new m8(this, 6));
        y8 y8Var2 = this.f39023n;
        this.fragmentView = y8Var2;
        y8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        this.h = b10Var;
        b10Var.setViewType(8);
        this.h.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.h.f24767w = false;
        j9 j9Var = new j9(this, context, this.h);
        this.f39015b = j9Var;
        this.f39023n.addView(j9Var, w7.z5.c(-1.0f, -1));
        this.d.setClipToPadding(false);
        this.d.setEmptyView(this.f39015b);
        org.telegram.ui.Components.a71 a71Var3 = this.d;
        s4.b0 b0Var = new s4.b0(1, false);
        this.f39017c = b0Var;
        a71Var3.setLayoutManager(b0Var);
        org.telegram.ui.Components.a71 a71Var4 = this.d;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        a71Var4.setVerticalScrollbarPosition(i10);
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(this.d, this.f39017c);
        this.e = ll0Var;
        ll0Var.h = new n8(this);
        y8 y8Var3 = this.f39023n;
        org.telegram.ui.Components.a71 a71Var5 = this.d;
        float f7 = -this.f39013a;
        y8Var3.addView(a71Var5, w7.z5.d(-1, -1.0f, 3, 0.0f, f7, 0.0f, f7));
        this.d.setOnScrollListener(new z8(this));
        if (this.H) {
            this.f39015b.a();
        } else {
            this.f39015b.b();
        }
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
        this.f39021f = h20Var;
        h20Var.f26736c.setImageResource(R.drawable.filled_calls_plus);
        this.f39021f.setContentDescription(LocaleController.getString(R.string.Call));
        this.f39021f.setOnClickListener(new p8(this, 3));
        this.f39023n.addView(this.f39021f, org.telegram.ui.Components.h20.b());
        org.telegram.ui.Components.us usVar = new org.telegram.ui.Components.us(context);
        this.M = usVar;
        usVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.M.setOnAnimatedHeightChangedListener(new m8(this, 0));
        dh.d c10 = bVar.c(this.M, fh.c.n(this.resourceProvider), false);
        c10.q(AndroidUtilities.dp(24.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        this.M.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.N = frameLayout;
        this.M.addView(frameLayout);
        this.M.i(this.N, true, false);
        a9 a9Var = new a9(this, context, this, this.f39023n, this.resourceProvider);
        this.O = a9Var;
        this.N.addView(a9Var);
        this.M.setCallFragmentContextView(this.O);
        this.f39023n.addView(this.M, w7.z5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.f39023n.addView(this.actionBar);
        ei.g6 g6Var = new ei.g6(context, this.parentLayout);
        this.f39024r = g6Var;
        g6Var.b(false, false);
        this.f39023n.addView(this.f39024r, w7.z5.e(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.f39023n);
        this.actionBar.setAdaptiveBackground(this.d);
        setBulletinDelegate(new b9(this, 0));
        if (this.f39026w) {
            View view = this.fragmentView;
            n8 n8Var = new n8(this);
            WeakHashMap weakHashMap = r0.i0.f44818a;
            r0.a0.i(view, n8Var);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r18, int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m9.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e0(ArrayList arrayList, h9 h9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean l02 = l0(arrayList);
        ArrayList arrayList2 = this.L;
        if (l02) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f20293id));
            }
            org.telegram.ui.Components.xp xpVar = h9Var.e;
            if (xpVar != null) {
                xpVar.a(false, true);
            }
            q0();
            return;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i11)).f20293id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.xp xpVar2 = h9Var.e;
        if (xpVar2 != null) {
            xpVar2.a(true, true);
        }
        q0();
    }

    public final void f0() {
        bh.f fVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.Y) != null) {
            int dp = AndroidUtilities.dp(48.0f) + ((int) this.M.c(AndroidUtilities.dp(7.0f)));
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.W) - AndroidUtilities.dp(8.0f);
            this.f39020e0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
            RectF rectF = this.f39022f0;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), this.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            if (this.f39026w) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            fVar.g(i10, this.f39019d0);
            fVar.e(this.f39018c0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void g0() {
        this.f39021f.setTranslationY(((-this.W) - this.U) - this.V);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 2);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20928a7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21265s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21321v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21284t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21075i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21107k0, null, null, org.telegram.ui.ActionBar.h6.f20987d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39015b, 4, new Class[]{j9.class}, new String[]{"emptyTextView1"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39015b, 4, new Class[]{j9.class}, new String[]{"emptyTextView2"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20968c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21058h6));
        int i11 = org.telegram.ui.ActionBar.h6.f20948b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        org.telegram.ui.Components.h20 h20Var = this.f39021f;
        if (h20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(h20Var.f26736c, 8, null, null, null, null, org.telegram.ui.ActionBar.h6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39021f.f26736c, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39021f.f26736c, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{h9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.il));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{h9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21070i1}, null, org.telegram.ui.ActionBar.h6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{h9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21017f1}, null, org.telegram.ui.ActionBar.h6.f21394z9));
        TextPaint textPaint = org.telegram.ui.ActionBar.h6.Q0;
        int i12 = org.telegram.ui.ActionBar.h6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{h9.class}, textPaint, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{h9.class}, org.telegram.ui.ActionBar.h6.P0, null, null, org.telegram.ui.ActionBar.h6.f21206p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.h6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{h9.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.h6.D0}, null, -1, null, org.telegram.ui.ActionBar.h6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.h6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{h9.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.h6.E0}, null, -1, null, org.telegram.ui.ActionBar.h6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{h9.class}, null, org.telegram.ui.ActionBar.h6.f21237r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.h6.V4, org.telegram.ui.ActionBar.h6.X4}, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.h6.W4, org.telegram.ui.ActionBar.h6.Y4}, null, org.telegram.ui.ActionBar.h6.f21244r7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        return arrayList;
    }

    public final void h0() {
        if (this.d.Z0()) {
            this.d.setClipBounds(null);
            return;
        }
        int i10 = this.f39013a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10);
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight() - AndroidUtilities.dp(i10);
        Rect rect = this.X;
        rect.set(0, measuredHeight, measuredWidth, measuredHeight2);
        this.d.setClipBounds(rect);
    }

    public final void i0() {
        org.telegram.ui.Components.a71 a71Var = this.d;
        int i10 = this.f39013a;
        a71Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10) + ((int) this.M.c(AndroidUtilities.dp(14.0f))), 0, AndroidUtilities.dp(i10) + this.W + this.T);
        this.f39015b.setPadding(0, 0, 0, this.W + this.T);
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
        j9 j9Var = this.f39015b;
        if (j9Var != null && !this.I) {
            j9Var.a();
        }
        org.telegram.ui.Components.a71 a71Var = this.d;
        if (a71Var != null) {
            a71Var.W2.N(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i11;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.f20381q = "";
        tL_messages_search.offset_id = i10;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new m(this, 1), 2), this.classGuid);
    }

    public final void k0(boolean z10) {
        org.telegram.ui.Components.xp xpVar;
        this.actionBar.r();
        this.L.clear();
        int childCount = this.d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.d.getChildAt(i10);
            if ((childAt instanceof h9) && (xpVar = ((h9) childAt).e) != null) {
                xpVar.a(false, z10);
            }
        }
        this.d.W2.N(true);
    }

    public final boolean l0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.L.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f20293id))) {
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
        if (this.actionBar.s()) {
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
            ei.x3 x3Var = new ei.x3(getParentActivity(), 1);
            this.f39025s = x3Var;
            x3Var.d = 3000L;
            x3Var.l(1.0f, -25.0f);
            this.f39025s.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            this.f39025s.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
            this.f39023n.addView(this.f39025s, w7.z5.e(-1, 80, 48));
            this.f39025s.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(16.0f));
            this.f39025s.u();
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
            this.f39026w = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.f39026w) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.T = i10;
        if (this.f39026w) {
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
                org.telegram.ui.Components.voip.d2.l(this.Q, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            if (this.P != null) {
                userFull = getMessagesController().getUserFull(this.P.f20419id);
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
            org.telegram.ui.Components.voip.d2.m(user, z11, z12, getParentActivity(), null, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.d2.h(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.a71 a71Var = this.d;
        if (a71Var != null) {
            a71Var.W2.N(true);
        }
    }

    public final void p0(boolean z10) {
        int i10;
        int dp;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
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
        a2Var.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
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
        frameLayout.addView(a2Var, w7.z5.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        a2Var.setOnClickListener(new o8(0, zArr));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.d4(this, z10, zArr, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, false));
        }
    }

    public final void q0() {
        boolean s10 = this.actionBar.s();
        ArrayList arrayList = this.L;
        boolean z10 = true;
        if (s10) {
            if (arrayList.isEmpty()) {
                k0(true);
                return;
            }
        } else {
            boolean a2 = this.actionBar.a(null);
            ArrayList arrayList2 = this.E;
            if (!a2) {
                org.telegram.ui.ActionBar.y j10 = this.actionBar.j(null);
                if (this.f39026w) {
                    ImageView imageView = new ImageView(getParentActivity());
                    this.f39027x = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    this.f39027x.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                    this.f39027x.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21376y8), PorterDuff.Mode.MULTIPLY));
                    this.f39027x.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21393z8), 1, -1));
                    this.f39027x.setOnClickListener(new p8(this, 1));
                    j10.addView(this.f39027x, w7.z5.q(54, 54, 16));
                    arrayList2.add(this.f39027x);
                }
                NumberTextView numberTextView = new NumberTextView(j10.getContext());
                this.f39028y = numberTextView;
                int i10 = 18;
                numberTextView.setTextSize(18);
                this.f39028y.setTypeface(AndroidUtilities.bold());
                this.f39028y.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21376y8, false));
                NumberTextView numberTextView2 = this.f39028y;
                if (!this.f39026w) {
                    i10 = 72;
                }
                j10.addView(numberTextView2, w7.z5.m(1.0f, 0, -1, i10, 0, 0));
                this.f39028y.setOnTouchListener(new di.d(2));
                arrayList2.add(j10.h(2, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
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
        this.f39028y.a(arrayList.size(), z10);
    }

    @Override
    public final void s() {
        if (this.f39017c.L0() < 15) {
            this.d.x0(0);
            return;
        }
        org.telegram.ui.Components.ll0 ll0Var = this.e;
        ll0Var.f28257b = 1;
        ll0Var.c(0, 0, false, false);
    }

    @Override
    public final gh.d z() {
        return this.f39014a0;
    }

    public m9(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.f39013a = i10 >= 31 ? 48 : 0;
        this.v = true;
        this.E = new ArrayList();
        this.G = new ArrayList();
        this.L = new ArrayList();
        this.S = false;
        this.X = new Rect();
        ArrayList arrayList = new ArrayList();
        this.f39019d0 = arrayList;
        RectF rectF = new RectF();
        this.f39020e0 = rectF;
        RectF rectF2 = new RectF();
        this.f39022f0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.f20928a7));
        if (i10 >= 31) {
            this.Y = new bh.f(false);
            this.Z = new gh.d(null);
            gh.d dVar = new gh.d(null);
            this.f39014a0 = dVar;
            bh.b bVar = new bh.b(dVar);
            this.f39016b0 = bVar;
            bVar.f4364i = LiteMode.isEnabled(262144);
            return;
        }
        this.Y = null;
        this.Z = null;
        this.f39014a0 = null;
        this.f39016b0 = new bh.b(cVar);
    }
}
