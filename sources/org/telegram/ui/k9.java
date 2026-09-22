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
public final class k9 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, dh0 {
    public final ArrayList E;
    public org.telegram.ui.ActionBar.v0 F;
    public final ArrayList G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList K;
    public final ArrayList L;
    public org.telegram.ui.Components.ks M;
    public FrameLayout N;
    public y8 O;
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
    public final int f35085a;
    public final fh.d f35086a0;
    public h9 f35087b;
    public final ah.c f35088b0;
    public s4.c0 f35089c;
    public ah.n f35090c0;
    public org.telegram.ui.Components.e61 d;
    public final ArrayList f35091d0;
    public org.telegram.ui.Components.ok0 e;
    public final RectF f35092e0;
    public org.telegram.ui.Components.y10 f35093f;
    public final RectF f35094f0;
    public org.telegram.ui.Components.t00 h;
    public w8 f35095n;
    public ci.s6 f35096r;
    public ci.f4 f35097s;
    public boolean v;
    public boolean f35098w;
    public ImageView f35099x;
    public NumberTextView f35100y;

    public k9() {
        this(null);
    }

    public static void U(k9 k9Var) {
        org.telegram.ui.Components.e61 e61Var = k9Var.d;
        if (e61Var != null) {
            int childCount = e61Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = k9Var.d.getChildAt(i10);
                if (childAt instanceof f9) {
                    ((f9) childAt).d.u(0);
                }
            }
        }
        ImageView imageView = k9Var.f35099x;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(k9Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19217y8), PorterDuff.Mode.MULTIPLY));
            k9Var.f35099x.setBackground(org.telegram.ui.ActionBar.i6.f0(k9Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19236z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = k9Var.actionBar;
        if (kVar != null) {
            kVar.e();
        }
    }

    public static void V(k9 k9Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            k9Var.getMessagesController().putUsers(groupcall.users, false);
            k9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                k9Var.showDialog(new cu(k9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.f2.g(k9Var.getParentActivity(), k9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            k9Var.showDialog(new cu(k9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.vc.a0(k9Var).d0(tL_error, false);
        }
    }

    public static void W(org.telegram.ui.k9 r18, org.telegram.tgnet.TLRPC.TL_error r19, org.telegram.tgnet.TLObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k9.W(org.telegram.ui.k9, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void X(k9 k9Var, org.telegram.ui.Components.i51 i51Var, View view) {
        int i10 = i51Var.d;
        if (i10 == 2) {
            k9Var.n0(true);
            org.telegram.ui.Components.oc I = org.telegram.ui.Components.vc.a0(k9Var).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new j8(k9Var, 4));
            I.f26751j = 5000;
            I.j();
        } else if (i10 == 1) {
            m0(k9Var);
        } else {
            Object obj = i51Var.G;
            if (obj instanceof g9) {
                g9 g9Var = (g9) obj;
                ArrayList arrayList = g9Var.f33796c;
                if (k9Var.actionBar.s()) {
                    k9Var.e0(arrayList, (f9) view);
                } else if (g9Var.f33794a != 0 && !arrayList.isEmpty()) {
                    boolean z10 = g9Var.e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = g9Var.f33795b;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).f18256id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).f18130id;
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(k9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = k9Var.getMessagesController().conferenceCallSizeLimit;
                    b2Var.setOnCancelListener(new p8(k9Var, k9Var.getConnectionsManager().sendRequest(getgroupcall, new o8(k9Var, b2Var, hashSet, tL_inputGroupCallInviteMessage, z10, 0)), 0));
                    b2Var.q(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).f18130id);
                    k9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    k9Var.presentFragment(new bo(bundle), k9Var.v);
                }
            } else if (view instanceof j9) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((j9) view).f34820c.f18109id);
                k9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                k9Var.presentFragment(new bo(bundle2), k9Var.v);
            }
        }
    }

    public static void Y(k9 k9Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            k9Var.getMessagesController().putUsers(groupcall.users, false);
            k9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                k9Var.showDialog(new cu(k9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.f2.g(k9Var.getParentActivity(), k9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            k9Var.showDialog(new cu(k9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.vc.a0(k9Var).d0(tL_error, false);
        }
    }

    public static org.telegram.ui.ActionBar.k Z(k9 k9Var) {
        return k9Var.actionBar;
    }

    public static void m0(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(new d9(a4.a.i("isCall", true), n2Var.getCurrentAccount(), n2Var));
    }

    public static void o0(final Context context, int i10, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.e6 e6Var, boolean z10, final boolean z11) {
        String str2;
        int i11;
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18904h5, e6Var);
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, e6Var, false);
        f3Var.setBackgroundColor(v02);
        f3Var.fixNavigationBar(v02);
        final ?? r12 = {str};
        LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
        f7.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f7.addView(frameLayout, w7.x5.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, w7.x5.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
        frameLayout.addView(frameLayout2, w7.x5.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19215y6, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v03, mode));
        int i12 = org.telegram.ui.ActionBar.i6.f18923i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(i12, e6Var), 1, -1));
        if (z11) {
            frameLayout.addView(imageView2, w7.x5.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.Components.c90 a2 = w7.b6.a(context, 20.0f, i13, true, e6Var);
        a2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        a2.setGravity(17);
        f7.addView(a2, w7.x5.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.c90 a10 = w7.b6.a(context, 14.0f, i13, false, e6Var);
        a10.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        a10.setGravity(17);
        a10.setMaxWidth(ci.f4.a(a10.getText(), a10.getPaint()));
        f7.addView(a10, w7.x5.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        w7.z5.b(frameLayout3, 0.01f, 1.2f);
        int i14 = org.telegram.ui.ActionBar.i6.f18778a7;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.v0(i14, e6Var), org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.v0(i14, e6Var), org.telegram.ui.ActionBar.i6.v0(i12, e6Var)), 12, 12));
        f7.addView(frameLayout3, w7.x5.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.c90 a11 = w7.b6.a(context, 13.0f, i13, false, e6Var);
        a11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        a11.setText(str2);
        frameLayout3.addView(a11, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19088r5, e6Var), mode));
        frameLayout3.addView(imageView3, w7.x5.e(40, 48, 21));
        LinearLayout f10 = org.telegram.messenger.vl.f(context, 0);
        f7.addView(f10, w7.x5.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        ci.d dVar = new ci.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.oq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.g(spannableStringBuilder, false, true);
        f10.addView(dVar, w7.x5.p(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        ci.d dVar2 = new ci.d(context, e6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.oq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.g(spannableStringBuilder2, false, true);
        f10.addView(dVar2, w7.x5.p(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        if (z10) {
            a9 a9Var = new a9(context, e6Var);
            a9Var.setGravity(17);
            a9Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19234z6, e6Var));
            a9Var.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            a9Var.setTextSize(14.0f);
            f7.addView(a9Var, w7.x5.t(190, -2, 1, 28, 12, 28, 8));
            i11 = i10;
            ai.s1 s1Var = new ai.s1(str, i11, f3VarArr);
            org.telegram.ui.Components.c90 a12 = w7.b6.a(context, 14.0f, i13, false, e6Var);
            a12.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), s1Var), true));
            a12.setGravity(17);
            a12.setMaxWidth(ci.f4.a(a12.getText(), a12.getPaint()));
            f7.addView(a12, w7.x5.t(-1, -2, 17, 32, 8, 32, 12));
            w7.z5.b(a12, 0.05f, 1.2f);
            a12.setOnClickListener(new a(s1Var, 9));
        } else {
            i11 = i10;
        }
        f3Var.customView = f7;
        f3Var.show();
        f3VarArr[0] = f3Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.vc vcVar;
                int i15;
                switch (r4) {
                    case 0:
                        AndroidUtilities.addToClipboard(r12[0]);
                        vcVar = new org.telegram.ui.Components.vc(f3Var.topBulletinContainer, e6Var);
                        i15 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(r12[0]);
                        vcVar = new org.telegram.ui.Components.vc(f3Var.topBulletinContainer, e6Var);
                        i15 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.vl.p(i15, vcVar);
            }
        });
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.vc vcVar;
                int i15;
                switch (r4) {
                    case 0:
                        AndroidUtilities.addToClipboard(r12[0]);
                        vcVar = new org.telegram.ui.Components.vc(f3Var.topBulletinContainer, e6Var);
                        i15 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(r12[0]);
                        vcVar = new org.telegram.ui.Components.vc(f3Var.topBulletinContainer, e6Var);
                        i15 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.vl.p(i15, vcVar);
            }
        });
        final gg.e1 e1Var = new gg.e1(inputGroupCall, i11, r12, frameLayout3, a11, f3Var, e6Var, 4);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f3 f3Var2 = org.telegram.ui.ActionBar.f3.this;
                org.telegram.ui.ActionBar.d3 d3Var = f3Var2.container;
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.Components.n70 F = org.telegram.ui.Components.n70.F(d3Var, e6Var2, frameLayout3);
                int i15 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.Copy);
                String[] strArr = r12;
                F.c(i15, string, new q1(strArr, f3Var2, e6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new l4(4, context, strArr), false);
                F.m(z11, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, e1Var);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new ai.s0(context, str, r12, e6Var, f3Var, 6));
        if (z11) {
            imageView2.setOnClickListener(new ai.p5(f3Var, e6Var, imageView2, e1Var, 5));
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
        if (!this.f35098w) {
            hg.c.x(false, this.actionBar);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 24));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(10, R.drawable.ic_ab_other);
        this.F = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int i10 = 2;
        this.F.setOnClickListener(new n8(this, 2));
        org.telegram.ui.Components.e61 e61Var = new org.telegram.ui.Components.e61(this, new b5(this, 1), new k8(this), new k8(this));
        this.d = e61Var;
        int i11 = org.telegram.ui.ActionBar.i6.f18778a7;
        e61Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i11, this.resourceProvider));
        this.d.p1();
        this.d.Y2.f29610r = false;
        this.f35095n = new w8(this, context, 0);
        hh.k kVar = new hh.k(this.f35095n);
        w8 w8Var = this.f35095n;
        ah.c cVar = this.f35088b0;
        cVar.f425f = kVar;
        cVar.f426g = w8Var;
        org.telegram.ui.Components.e61 e61Var2 = this.d;
        Objects.requireNonNull(e61Var2);
        this.f35090c0 = new ah.n(e61Var2, w8Var, new v8(e61Var2, 0));
        this.d.C0(new j8(this, 6));
        w8 w8Var2 = this.f35095n;
        this.fragmentView = w8Var2;
        w8Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        this.h = t00Var;
        t00Var.setViewType(8);
        this.h.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.h.f28015w = false;
        h9 h9Var = new h9(this, context, this.h);
        this.f35087b = h9Var;
        this.f35095n.addView(h9Var, w7.x5.c(-1.0f, -1));
        this.d.setClipToPadding(false);
        this.d.setEmptyView(this.f35087b);
        org.telegram.ui.Components.e61 e61Var3 = this.d;
        s4.c0 c0Var = new s4.c0(1, false);
        this.f35089c = c0Var;
        e61Var3.setLayoutManager(c0Var);
        org.telegram.ui.Components.e61 e61Var4 = this.d;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        e61Var4.setVerticalScrollbarPosition(i10);
        org.telegram.ui.Components.ok0 ok0Var = new org.telegram.ui.Components.ok0(this.d, this.f35089c);
        this.e = ok0Var;
        ok0Var.h = new k8(this);
        w8 w8Var3 = this.f35095n;
        org.telegram.ui.Components.e61 e61Var5 = this.d;
        float f7 = -this.f35085a;
        w8Var3.addView(e61Var5, w7.x5.d(-1, -1.0f, 3, 0.0f, f7, 0.0f, f7));
        this.d.setOnScrollListener(new x8(this));
        if (this.H) {
            this.f35087b.a();
        } else {
            this.f35087b.b();
        }
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(context, this.resourceProvider, false);
        this.f35093f = y10Var;
        y10Var.f30127c.setImageResource(R.drawable.filled_calls_plus);
        this.f35093f.setContentDescription(LocaleController.getString(R.string.Call));
        this.f35093f.setOnClickListener(new n8(this, 3));
        this.f35095n.addView(this.f35093f, org.telegram.ui.Components.y10.b());
        org.telegram.ui.Components.ks ksVar = new org.telegram.ui.Components.ks(context);
        this.M = ksVar;
        ksVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.M.setOnAnimatedHeightChangedListener(new j8(this, 0));
        ch.d c10 = cVar.c(this.M, eh.b.n(this.resourceProvider), false);
        c10.q(AndroidUtilities.dp(24.0f));
        c10.p(AndroidUtilities.dp(7.0f));
        this.M.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.N = frameLayout;
        this.M.addView(frameLayout);
        this.M.i(this.N, true, false);
        y8 y8Var = new y8(this, context, this, this.f35095n, this.resourceProvider, 0);
        this.O = y8Var;
        this.N.addView(y8Var);
        this.M.setCallFragmentContextView(this.O);
        this.f35095n.addView(this.M, w7.x5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.f35095n.addView(this.actionBar);
        ci.s6 s6Var = new ci.s6(context, this.parentLayout);
        this.f35096r = s6Var;
        s6Var.b(false, false);
        this.f35095n.addView(this.f35096r, w7.x5.e(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.f35095n);
        this.actionBar.setAdaptiveBackground(this.d);
        setBulletinDelegate(new z8(this, 0));
        if (this.f35098w) {
            View view = this.fragmentView;
            k8 k8Var = new k8(this);
            WeakHashMap weakHashMap = r0.i0.f41839a;
            r0.a0.j(view, k8Var);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r19, int r20, java.lang.Object... r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k9.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e0(ArrayList arrayList, f9 f9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean l02 = l0(arrayList);
        ArrayList arrayList2 = this.L;
        if (l02) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f18130id));
            }
            org.telegram.ui.Components.np npVar = f9Var.e;
            if (npVar != null) {
                npVar.a(false, true);
            }
            q0();
            return;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i11)).f18130id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.np npVar2 = f9Var.e;
        if (npVar2 != null) {
            npVar2.a(true, true);
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
            this.f35092e0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
            RectF rectF = this.f35094f0;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), this.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            if (this.f35098w) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            hVar.g(i10, this.f35091d0);
            hVar.e(this.f35090c0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void g0() {
        this.f35093f.setTranslationY(((-this.W) - this.U) - this.V);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 2);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f18778a7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f19110s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19165v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19129t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f18923i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f18955k0, null, null, org.telegram.ui.ActionBar.i6.f18835d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35087b, 4, new Class[]{h9.class}, new String[]{"emptyTextView1"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35087b, 4, new Class[]{h9.class}, new String[]{"emptyTextView2"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f18817c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f18905h6));
        int i11 = org.telegram.ui.ActionBar.i6.f18798b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        org.telegram.ui.Components.y10 y10Var = this.f35093f;
        if (y10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(y10Var.f30127c, 8, null, null, null, null, org.telegram.ui.ActionBar.i6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35093f.f30127c, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35093f.f30127c, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{f9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.il));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{f9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f18918i1}, null, org.telegram.ui.ActionBar.i6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{f9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f18865f1}, null, org.telegram.ui.ActionBar.i6.f19237z9));
        TextPaint textPaint = org.telegram.ui.ActionBar.i6.Q0;
        int i12 = org.telegram.ui.ActionBar.i6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{f9.class}, textPaint, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{f9.class}, org.telegram.ui.ActionBar.i6.P0, null, null, org.telegram.ui.ActionBar.i6.f19052p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.i6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{f9.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.i6.D0}, null, -1, null, org.telegram.ui.ActionBar.i6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.i6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{f9.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.i6.E0}, null, -1, null, org.telegram.ui.ActionBar.i6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{f9.class}, null, org.telegram.ui.ActionBar.i6.f19083r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.i6.V4, org.telegram.ui.ActionBar.i6.X4}, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.i6.W4, org.telegram.ui.ActionBar.i6.Y4}, null, org.telegram.ui.ActionBar.i6.f19090r7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        return arrayList;
    }

    public final void h0() {
        if (this.d.Z0()) {
            this.d.setClipBounds(null);
            return;
        }
        int i10 = this.f35085a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10);
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight() - AndroidUtilities.dp(i10);
        Rect rect = this.X;
        rect.set(0, measuredHeight, measuredWidth, measuredHeight2);
        this.d.setClipBounds(rect);
    }

    public final void i0() {
        org.telegram.ui.Components.e61 e61Var = this.d;
        int i10 = this.f35085a;
        e61Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10) + ((int) this.M.c(AndroidUtilities.dp(14.0f))), 0, AndroidUtilities.dp(i10) + this.W + this.T);
        this.f35087b.setPadding(0, 0, 0, this.W + this.T);
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
        h9 h9Var = this.f35087b;
        if (h9Var != null && !this.I) {
            h9Var.a();
        }
        org.telegram.ui.Components.e61 e61Var = this.d;
        if (e61Var != null) {
            e61Var.Y2.N(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i11;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.f18218q = "";
        tL_messages_search.offset_id = i10;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new m(this, 1), 2), this.classGuid);
    }

    public final void k0(boolean z10) {
        org.telegram.ui.Components.np npVar;
        this.actionBar.r();
        this.L.clear();
        int childCount = this.d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.d.getChildAt(i10);
            if ((childAt instanceof f9) && (npVar = ((f9) childAt).e) != null) {
                npVar.a(false, z10);
            }
        }
        this.d.Y2.N(true);
    }

    public final boolean l0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.L.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f18130id))) {
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
        this.d.Y2.N(true);
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
            ci.f4 f4Var = new ci.f4(getParentActivity(), 1);
            this.f35097s = f4Var;
            f4Var.d = 3000L;
            f4Var.l(1.0f, -25.0f);
            this.f35097s.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            this.f35097s.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
            this.f35095n.addView(this.f35097s, w7.x5.e(-1, 80, 48));
            this.f35097s.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(16.0f));
            this.f35097s.u();
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
            this.f35098w = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.f35098w) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.T = i10;
        if (this.f35098w) {
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
                userFull = getMessagesController().getUserFull(this.P.f18256id);
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
        org.telegram.ui.Components.e61 e61Var = this.d;
        if (e61Var != null) {
            e61Var.Y2.N(true);
        }
    }

    public final void p0(boolean z10) {
        int i10;
        int dp;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18435a;
        if (z10) {
            b2Var.R = LocaleController.getString(R.string.DeleteAllCalls);
            b2Var.T = LocaleController.getString(R.string.DeleteAllCallsText);
        } else {
            b2Var.R = LocaleController.getString(R.string.DeleteCalls);
            b2Var.T = LocaleController.getString(R.string.DeleteSelectedCallsText);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1);
        z1Var.setBackground(org.telegram.ui.ActionBar.i6.K0(false));
        z1Var.e(LocaleController.getString(R.string.DeleteCallsForEveryone), "", false, false, false);
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
        z1Var.setPadding(i10, 0, dp, 0);
        frameLayout.addView(z1Var, w7.x5.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        z1Var.setOnClickListener(new m8(0, zArr));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new com.google.firebase.messaging.i(this, z10, zArr, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19071q7, false));
        }
    }

    public final void q0() {
        int i10;
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
                org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
                if (this.f35098w) {
                    ImageView imageView = new ImageView(getParentActivity());
                    this.f35099x = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    this.f35099x.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                    this.f35099x.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f19217y8), PorterDuff.Mode.MULTIPLY));
                    this.f35099x.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(org.telegram.ui.ActionBar.i6.f19236z8), 1, -1));
                    this.f35099x.setOnClickListener(new n8(this, 1));
                    j3.addView(this.f35099x, w7.x5.q(54, 54, 16));
                    arrayList2.add(this.f35099x);
                }
                NumberTextView numberTextView = new NumberTextView(j3.getContext());
                this.f35100y = numberTextView;
                numberTextView.setTextSize(18);
                this.f35100y.setTypeface(AndroidUtilities.bold());
                this.f35100y.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19217y8, false));
                NumberTextView numberTextView2 = this.f35100y;
                if (this.f35098w) {
                    i10 = 18;
                } else {
                    i10 = 72;
                }
                j3.addView(numberTextView2, w7.x5.m(1.0f, 0, -1, i10, 0, 0));
                this.f35100y.setOnTouchListener(new bi.d(2));
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
        this.f35100y.a(arrayList.size(), z10);
    }

    @Override
    public final void r() {
        if (this.f35089c.L0() < 15) {
            this.d.x0(0);
            return;
        }
        org.telegram.ui.Components.ok0 ok0Var = this.e;
        ok0Var.f26827b = 1;
        ok0Var.c(0, 0, false, false);
    }

    @Override
    public final fh.d x() {
        return this.f35086a0;
    }

    public k9(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.f35085a = i10 >= 31 ? 48 : 0;
        this.v = true;
        this.E = new ArrayList();
        this.G = new ArrayList();
        this.L = new ArrayList();
        this.S = false;
        this.X = new Rect();
        ArrayList arrayList = new ArrayList();
        this.f35091d0 = arrayList;
        RectF rectF = new RectF();
        this.f35092e0 = rectF;
        RectF rectF2 = new RectF();
        this.f35094f0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.i6.f18778a7));
        if (i10 >= 31) {
            this.Y = new ah.h(false);
            this.Z = new fh.d(null);
            fh.d dVar = new fh.d(null);
            this.f35086a0 = dVar;
            ah.c cVar2 = new ah.c(dVar);
            this.f35088b0 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            return;
        }
        this.Y = null;
        this.Z = null;
        this.f35086a0 = null;
        this.f35088b0 = new ah.c(cVar);
    }
}
