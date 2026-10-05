package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
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
public final class m9 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, bh0 {
    public org.telegram.ui.ActionBar.v0 E;
    public final ArrayList F;
    public boolean G;
    public boolean H;
    public boolean I;
    public ArrayList J;
    public final ArrayList K;
    public org.telegram.ui.Components.ns L;
    public FrameLayout M;
    public a9 N;
    public TLRPC.User O;
    public TLRPC.Chat P;
    public Long Q;
    public NotificationCenter.ObserversGroup R;
    public boolean S;
    public int T;
    public int U;
    public float V;
    public int W;
    public j9 f38510a;
    public s4.c0 f38511b;
    public org.telegram.ui.Components.e71 f38512c;
    public View d;
    public org.telegram.ui.Components.bl0 f38513e;
    public org.telegram.ui.Components.c20 f38514f;
    public org.telegram.ui.Components.w00 h;
    public y8 f38515n;
    public ci.e4 f38516r;
    public boolean f38517s;
    public boolean v;
    public ImageView f38518w;
    public NumberTextView f38519x;
    public final ArrayList f38520y;

    public m9() {
        this(null);
    }

    public static void S(org.telegram.ui.m9 r18, org.telegram.tgnet.TLRPC.TL_error r19, org.telegram.tgnet.TLObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m9.S(org.telegram.ui.m9, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void T(m9 m9Var) {
        org.telegram.ui.Components.e71 e71Var = m9Var.f38512c;
        if (e71Var != null) {
            int childCount = e71Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = m9Var.f38512c.getChildAt(i10);
                if (childAt instanceof h9) {
                    ((h9) childAt).d.u(0);
                }
            }
        }
        ImageView imageView = m9Var.f38518w;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(m9Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21216y8), PorterDuff.Mode.MULTIPLY));
            m9Var.f38518w.setBackground(org.telegram.ui.ActionBar.i6.f0(m9Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21235z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = m9Var.actionBar;
        if (kVar != null) {
            kVar.e();
        }
    }

    public static void U(m9 m9Var, org.telegram.ui.Components.h61 h61Var, View view) {
        int i10 = h61Var.d;
        if (i10 == 2) {
            m9Var.h0(true);
            org.telegram.ui.Components.rc I = org.telegram.ui.Components.yc.a0(m9Var).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new n8(m9Var, 2));
            I.f30427j = 5000;
            I.j();
        } else if (i10 == 1) {
            g0(m9Var);
        } else {
            Object obj = h61Var.G;
            if (obj instanceof i9) {
                i9 i9Var = (i9) obj;
                ArrayList arrayList = i9Var.f37323c;
                if (m9Var.actionBar.s()) {
                    m9Var.Z(arrayList, (h9) view);
                } else if (i9Var.f37321a != 0 && !arrayList.isEmpty()) {
                    boolean z10 = i9Var.f37324e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = i9Var.f37322b;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).f20194id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).f20068id;
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(m9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = m9Var.getMessagesController().conferenceCallSizeLimit;
                    b2Var.setOnCancelListener(new r8(m9Var, m9Var.getConnectionsManager().sendRequest(getgroupcall, new q8(m9Var, b2Var, hashSet, tL_inputGroupCallInviteMessage, z10, 0)), 0));
                    b2Var.q(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).f20068id);
                    m9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    m9Var.presentFragment(new yn(bundle), m9Var.f38517s);
                }
            } else if (view instanceof l9) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((l9) view).f38257c.f20047id);
                m9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                m9Var.presentFragment(new yn(bundle2), m9Var.f38517s);
            }
        }
    }

    public static void W(m9 m9Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            m9Var.getMessagesController().putUsers(groupcall.users, false);
            m9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                m9Var.showDialog(new du(m9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.g2.g(m9Var.getParentActivity(), m9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            m9Var.showDialog(new du(m9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.yc.a0(m9Var).d0(tL_error, false);
        }
    }

    public static void X(m9 m9Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            m9Var.getMessagesController().putUsers(groupcall.users, false);
            m9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                m9Var.showDialog(new du(m9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.g2.g(m9Var.getParentActivity(), m9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            m9Var.showDialog(new du(m9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.yc.a0(m9Var).d0(tL_error, false);
        }
    }

    public static org.telegram.ui.ActionBar.k Y(m9 m9Var) {
        return m9Var.actionBar;
    }

    public static void g0(org.telegram.ui.ActionBar.n2 n2Var) {
        n2Var.presentFragment(new f9(a4.a.i("isCall", true), n2Var.getCurrentAccount(), n2Var));
    }

    public static void i0(final Context context, int i10, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.d6 d6Var, boolean z10, final boolean z11) {
        String str2;
        int i11;
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20899h5, d6Var);
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, d6Var, false);
        f3Var.setBackgroundColor(v02);
        f3Var.fixNavigationBar(v02);
        final ?? r12 = {str};
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        e7.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        e7.addView(frameLayout, w7.z5.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, w7.z5.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var)));
        frameLayout.addView(frameLayout2, w7.z5.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int v03 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21214y6, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v03, mode));
        int i12 = org.telegram.ui.ActionBar.i6.f20918i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.v0(i12, d6Var), 1, -1));
        if (z11) {
            frameLayout.addView(imageView2, w7.z5.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.Components.q90 a2 = w7.d6.a(context, 20.0f, i13, true, d6Var);
        a2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        a2.setGravity(17);
        e7.addView(a2, w7.z5.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.q90 a10 = w7.d6.a(context, 14.0f, i13, false, d6Var);
        a10.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        a10.setGravity(17);
        a10.setMaxWidth(ci.e4.a(a10.getText(), a10.getPaint()));
        e7.addView(a10, w7.z5.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        w7.b6.b(frameLayout3, 0.01f, 1.2f);
        int i14 = org.telegram.ui.ActionBar.i6.f20771a7;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.v0(i14, d6Var), org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.v0(i14, d6Var), org.telegram.ui.ActionBar.i6.v0(i12, d6Var)), 12, 12));
        e7.addView(frameLayout3, w7.z5.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.q90 a11 = w7.d6.a(context, 13.0f, i13, false, d6Var);
        a11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        a11.setText(str2);
        frameLayout3.addView(a11, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21086r5, d6Var), mode));
        frameLayout3.addView(imageView3, w7.z5.e(40, 48, 21));
        LinearLayout e10 = org.telegram.messenger.bi.e(context, 0);
        e7.addView(e10, w7.z5.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        ci.d dVar = new ci.d(context, d6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.rq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.g(spannableStringBuilder, false, true);
        e10.addView(dVar, w7.z5.p(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        ci.d dVar2 = new ci.d(context, d6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.rq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.g(spannableStringBuilder2, false, true);
        e10.addView(dVar2, w7.z5.p(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        if (z10) {
            c9 c9Var = new c9(context, d6Var);
            c9Var.setGravity(17);
            c9Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21233z6, d6Var));
            c9Var.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            c9Var.setTextSize(14.0f);
            e7.addView(c9Var, w7.z5.t(190, -2, 1, 28, 12, 28, 8));
            i11 = i10;
            ai.s1 s1Var = new ai.s1(str, i11, f3VarArr);
            org.telegram.ui.Components.q90 a12 = w7.d6.a(context, 14.0f, i13, false, d6Var);
            a12.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), s1Var), true));
            a12.setGravity(17);
            a12.setMaxWidth(ci.e4.a(a12.getText(), a12.getPaint()));
            e7.addView(a12, w7.z5.t(-1, -2, 17, 32, 8, 32, 12));
            w7.b6.b(a12, 0.05f, 1.2f);
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
                org.telegram.ui.Components.yc ycVar;
                int i15;
                switch (r4) {
                    case 0:
                        AndroidUtilities.addToClipboard(r12[0]);
                        ycVar = new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, d6Var);
                        i15 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(r12[0]);
                        ycVar = new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, d6Var);
                        i15 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.bi.n(i15, ycVar);
            }
        });
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.yc ycVar;
                int i15;
                switch (r4) {
                    case 0:
                        AndroidUtilities.addToClipboard(r12[0]);
                        ycVar = new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, d6Var);
                        i15 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(r12[0]);
                        ycVar = new org.telegram.ui.Components.yc(f3Var.topBulletinContainer, d6Var);
                        i15 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.bi.n(i15, ycVar);
            }
        });
        final gg.e1 e1Var = new gg.e1(inputGroupCall, i11, r12, frameLayout3, a11, f3Var, d6Var, 4);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f3 f3Var2 = org.telegram.ui.ActionBar.f3.this;
                org.telegram.ui.ActionBar.d3 d3Var = f3Var2.container;
                org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                org.telegram.ui.Components.b80 F = org.telegram.ui.Components.b80.F(d3Var, d6Var2, frameLayout3);
                int i15 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.Copy);
                String[] strArr = r12;
                F.c(i15, string, new r1(strArr, f3Var2, d6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new org.telegram.ui.ActionBar.g6(8, context, strArr), false);
                F.m(z11, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, e1Var);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new ai.s0(context, str, r12, d6Var, f3Var, 6));
        if (z11) {
            imageView2.setOnClickListener(new ai.o5(f3Var, d6Var, imageView2, e1Var, 5));
        }
    }

    @Override
    public final boolean Q(MotionEvent motionEvent, boolean z10) {
        return true;
    }

    public final void Z(ArrayList arrayList, h9 h9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean f02 = f0(arrayList);
        ArrayList arrayList2 = this.K;
        if (f02) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f20068id));
            }
            org.telegram.ui.Components.qp qpVar = h9Var.f37035e;
            if (qpVar != null) {
                qpVar.a(false, true);
            }
            k0();
            return;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i11)).f20068id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.qp qpVar2 = h9Var.f37035e;
        if (qpVar2 != null) {
            qpVar2.a(true, true);
        }
        k0();
    }

    public final void b0() {
        this.f38514f.setTranslationY(((-this.W) - this.U) - this.V);
    }

    public final void c0() {
        org.telegram.ui.Components.e71 e71Var = this.f38512c;
        i0.b bVar = this.mSystemInsets;
        li.a.c(e71Var, bVar.f11527b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((int) this.L.c(AndroidUtilities.dp(7.0f))), this.T);
        this.d.getLayoutParams().height = this.actionBar.getExtraHeight() + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f11527b + ((int) this.L.c(AndroidUtilities.dp(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.L.getLayoutParams()).topMargin = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f11527b) - AndroidUtilities.dp(19.0f);
        ((ViewGroup.MarginLayoutParams) this.f38510a.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f11527b;
        this.f38510a.setPadding(0, 0, 0, this.W + this.T);
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.I();
        createActionBar.k();
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        createActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        if (!this.v) {
            hg.c.u(false, this.actionBar);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 24));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(10, R.drawable.ic_ab_other);
        this.E = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int i10 = 2;
        this.E.setOnClickListener(new p8(this, 2));
        org.telegram.ui.Components.e71 e71Var = new org.telegram.ui.Components.e71(this, new c5(this, 1), new x8(this), new x8(this));
        this.f38512c = e71Var;
        e71Var.setCaptureSectionsDecoratorAllowed(true);
        this.f38512c.r1();
        this.f38512c.setSectionsDrawBackground(true);
        this.f38512c.f26034f3.f32531r = false;
        y8 y8Var = new y8(this, context, 0);
        this.f38515n = y8Var;
        this.fragmentView = y8Var;
        org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(context, null);
        this.h = w00Var;
        w00Var.setViewType(8);
        this.h.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20771a7, false));
        this.h.f32460w = false;
        this.f38510a = new j9(this, context, this.h);
        this.f38512c.setClipToPadding(false);
        this.f38512c.setEmptyView(this.f38510a);
        org.telegram.ui.Components.e71 e71Var2 = this.f38512c;
        s4.c0 c0Var = new s4.c0(1, false);
        this.f38511b = c0Var;
        e71Var2.setLayoutManager(c0Var);
        org.telegram.ui.Components.e71 e71Var3 = this.f38512c;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        e71Var3.setVerticalScrollbarPosition(i10);
        org.telegram.ui.Components.bl0 bl0Var = new org.telegram.ui.Components.bl0(this.f38512c, this.f38511b);
        this.f38513e = bl0Var;
        li.p pVar = this.glassEngine;
        Objects.requireNonNull(pVar);
        bl0Var.h = new z0(pVar, 12);
        this.f38515n.addView(this.f38512c, w7.z5.e(-1, -1, 3));
        this.f38515n.addView(this.f38510a, w7.z5.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.f38515n.addView(this.d, w7.z5.e(-1, 0, 48));
        this.f38512c.setOnScrollListener(new z8(this));
        if (this.G) {
            this.f38510a.a();
        } else {
            this.f38510a.b();
        }
        org.telegram.ui.Components.c20 c20Var = new org.telegram.ui.Components.c20(context, this.resourceProvider, false);
        this.f38514f = c20Var;
        c20Var.f25230c.setImageResource(R.drawable.filled_calls_plus);
        this.f38514f.setContentDescription(LocaleController.getString(R.string.Call));
        this.f38514f.setOnClickListener(new p8(this, 3));
        this.f38515n.addView(this.f38514f, org.telegram.ui.Components.c20.b());
        org.telegram.ui.Components.ns nsVar = new org.telegram.ui.Components.ns(context);
        this.L = nsVar;
        nsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.L.setOnAnimatedHeightChangedListener(new n8(this, 4));
        org.telegram.ui.Components.ns nsVar2 = this.L;
        ch.d c10 = getBaseSimpleGlass().f15607c.c(this.L, null, false);
        c10.w(eh.b.o(this.resourceProvider));
        c10.y(AndroidUtilities.dp(24.0f));
        c10.x(AndroidUtilities.dp(7.0f));
        nsVar2.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.M = frameLayout;
        this.L.addView(frameLayout);
        this.L.i(this.M, true, false);
        a9 a9Var = new a9(this, context, this, this.f38515n, this.resourceProvider);
        this.N = a9Var;
        this.M.addView(a9Var);
        this.L.setCallFragmentContextView(this.N);
        this.f38515n.addView(this.L, w7.z5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.f38515n.addView(this.actionBar);
        setBulletinDelegate(new b9(this, 0));
        if (this.v) {
            View view2 = this.fragmentView;
            x8 x8Var = new x8(this);
            WeakHashMap weakHashMap = r0.i0.f45610a;
            r0.a0.j(view2, x8Var);
        }
        return this.fragmentView;
    }

    public final void d0(int i10, int i11) {
        if (this.G) {
            return;
        }
        this.G = true;
        j9 j9Var = this.f38510a;
        if (j9Var != null && !this.H) {
            j9Var.a();
        }
        org.telegram.ui.Components.e71 e71Var = this.f38512c;
        if (e71Var != null) {
            e71Var.f26034f3.N(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i11;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.f20156q = "";
        tL_messages_search.offset_id = i10;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new m(this, 1), 2), this.classGuid);
    }

    @Override
    public final void didReceivedNotification(int r19, int r20, java.lang.Object... r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m9.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e0(boolean z10) {
        org.telegram.ui.Components.qp qpVar;
        this.actionBar.r();
        this.K.clear();
        int childCount = this.f38512c.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f38512c.getChildAt(i10);
            if ((childAt instanceof h9) && (qpVar = ((h9) childAt).f37035e) != null) {
                qpVar.a(false, z10);
            }
        }
        this.f38512c.f26034f3.N(true);
    }

    public final boolean f0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.K.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f20068id))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f38512c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21109s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21164v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21128t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20918i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20950k0, null, null, org.telegram.ui.ActionBar.i6.f20828d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38510a, 4, new Class[]{j9.class}, new String[]{"emptyTextView1"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38510a, 4, new Class[]{j9.class}, new String[]{"emptyTextView2"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20810c7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20900h6));
        int i10 = org.telegram.ui.ActionBar.i6.f20791b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        org.telegram.ui.Components.c20 c20Var = this.f38514f;
        if (c20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(c20Var.f25230c, 8, null, null, null, null, org.telegram.ui.ActionBar.i6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38514f.f25230c, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38514f.f25230c, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 0, new Class[]{h9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.il));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 0, new Class[]{h9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20913i1}, null, org.telegram.ui.ActionBar.i6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 0, new Class[]{h9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20859f1}, null, org.telegram.ui.ActionBar.i6.f21236z9));
        TextPaint textPaint = org.telegram.ui.ActionBar.i6.Q0;
        int i11 = org.telegram.ui.ActionBar.i6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 0, new Class[]{h9.class}, textPaint, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 0, new Class[]{h9.class}, org.telegram.ui.ActionBar.i6.P0, null, null, org.telegram.ui.ActionBar.i6.f21048p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.i6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 0, new Class[]{h9.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.i6.D0}, null, -1, null, org.telegram.ui.ActionBar.i6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.i6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 0, new Class[]{h9.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.i6.E0}, null, -1, null, org.telegram.ui.ActionBar.i6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 0, new Class[]{h9.class}, null, org.telegram.ui.ActionBar.i6.f21081r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.V4, org.telegram.ui.ActionBar.i6.X4}, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.W4, org.telegram.ui.ActionBar.i6.Y4}, null, org.telegram.ui.ActionBar.i6.f21088r7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20771a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38512c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        return arrayList;
    }

    public final void h0(boolean z10) {
        if (z10 == getUserConfig().showCallsTab) {
            return;
        }
        getUserConfig().setShowCallsTab(z10);
        this.f38512c.f26034f3.N(true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        int i10;
        int dp;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
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
        a2Var.setBackground(org.telegram.ui.ActionBar.i6.K0(false));
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
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new com.google.firebase.messaging.i(this, z10, zArr, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21068q7, false));
        }
    }

    public final void k0() {
        int i10;
        boolean s10 = this.actionBar.s();
        ArrayList arrayList = this.K;
        boolean z10 = true;
        if (s10) {
            if (arrayList.isEmpty()) {
                e0(true);
                return;
            }
        } else {
            boolean a2 = this.actionBar.a(null);
            ArrayList arrayList2 = this.f38520y;
            if (!a2) {
                org.telegram.ui.ActionBar.z j3 = this.actionBar.j(null);
                if (this.v) {
                    ImageView imageView = new ImageView(getParentActivity());
                    this.f38518w = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    this.f38518w.setImageDrawable(new org.telegram.ui.ActionBar.g2(true));
                    this.f38518w.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f21216y8), PorterDuff.Mode.MULTIPLY));
                    this.f38518w.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(org.telegram.ui.ActionBar.i6.f21235z8), 1, -1));
                    this.f38518w.setOnClickListener(new p8(this, 1));
                    j3.addView(this.f38518w, w7.z5.q(54, 54, 16));
                    arrayList2.add(this.f38518w);
                }
                NumberTextView numberTextView = new NumberTextView(j3.getContext());
                this.f38519x = numberTextView;
                numberTextView.setTextSize(18);
                this.f38519x.setTypeface(AndroidUtilities.bold());
                this.f38519x.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21216y8, false));
                NumberTextView numberTextView2 = this.f38519x;
                if (this.v) {
                    i10 = 18;
                } else {
                    i10 = 72;
                }
                j3.addView(numberTextView2, w7.z5.m(1.0f, 0, -1, i10, 0, 0));
                this.f38519x.setOnTouchListener(new bi.d(2));
                arrayList2.add(j3.h(2, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            }
            this.actionBar.L(null, null);
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
        this.f38519x.a(arrayList.size(), z10);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.actionBar.s()) {
            if (z10) {
                e0(true);
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
            ci.e4 e4Var = new ci.e4(getParentActivity(), 1);
            this.f38516r = e4Var;
            e4Var.d = 3000L;
            e4Var.l(1.0f, -25.0f);
            this.f38516r.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            this.f38516r.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
            this.f38515n.addView(this.f38516r, w7.z5.e(-1, 80, 48));
            this.f38516r.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(16.0f));
            this.f38516r.u();
            this.S = true;
            MessagesController.getGlobalMainSettings().edit().putInt("hidecallshint", MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) + 1).apply();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        super.onFragmentCreate();
        int i11 = 0;
        d0(0, 50);
        this.J = getMessagesController().getActiveGroupCalls();
        NotificationCenter.ObserversGroup observersGroup = this.R;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.R = null;
        }
        this.R = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messagesDeleted).add(NotificationCenter.activeGroupCallsUpdated).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.groupCallUpdated);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.f38517s = bundle.getBoolean("needFinishFragment", true);
            this.v = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.v) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.T = i10;
        if (this.v) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.U = i11;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.R;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.R = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.W = i13;
        c0();
        b0();
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
                org.telegram.ui.Components.voip.g2.l(this.P, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            if (this.O != null) {
                userFull = getMessagesController().getUserFull(this.O.f20194id);
            }
            TLRPC.User user = this.O;
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
            org.telegram.ui.Components.voip.g2.m(user, z11, z12, getParentActivity(), null, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.g2.h(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.e71 e71Var = this.f38512c;
        if (e71Var != null) {
            e71Var.f26034f3.N(true);
        }
    }

    @Override
    public final void r() {
        if (this.f38511b.L0() < 15) {
            this.f38512c.y0(0);
            return;
        }
        org.telegram.ui.Components.bl0 bl0Var = this.f38513e;
        bl0Var.f25015b = 1;
        bl0Var.d(0, 0, false, false);
    }

    @Override
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override
    public final fh.d x() {
        return null;
    }

    public m9(Bundle bundle) {
        super(bundle);
        this.f38517s = true;
        this.f38520y = new ArrayList();
        this.F = new ArrayList();
        this.K = new ArrayList();
        this.S = false;
    }
}
