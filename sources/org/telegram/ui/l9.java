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
public final class l9 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, ug0 {
    public final ArrayList B;
    public org.telegram.ui.ActionBar.w0 C;
    public final ArrayList D;
    public boolean E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public final ArrayList I;
    public org.telegram.ui.Components.js J;
    public FrameLayout K;
    public z8 L;
    public TLRPC.User M;
    public TLRPC.Chat N;
    public Long O;
    public boolean P;
    public int Q;
    public int R;
    public float S;
    public int T;
    public final Rect U;
    public final ng.e V;
    public final sg.d W;
    public final sg.d X;
    public final ng.a Y;
    public ng.k Z;
    public final int f35987a;
    public final ArrayList f35988a0;
    public i9 f35989b;
    public final RectF f35990b0;
    public f2.i0 f35991c;
    public final RectF f35992c0;
    public org.telegram.ui.Components.g61 d;
    public c2.y e;
    public org.telegram.ui.Components.z10 f35993f;
    public org.telegram.ui.Components.t00 h;
    public kh.j4 f35994n;
    public eg.i0 f35995r;
    public ph.f3 f35996s;
    public boolean v;
    public boolean f35997w;
    public ImageView f35998x;
    public NumberTextView f35999y;

    public l9() {
        this(null);
    }

    public static void U(l9 l9Var) {
        org.telegram.ui.Components.g61 g61Var = l9Var.d;
        if (g61Var != null) {
            int childCount = g61Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = l9Var.d.getChildAt(i10);
                if (childAt instanceof g9) {
                    ((g9) childAt).d.u(0);
                }
            }
        }
        ImageView imageView = l9Var.f35998x;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(l9Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20283y8), PorterDuff.Mode.MULTIPLY));
            l9Var.f35998x.setBackground(org.telegram.ui.ActionBar.j6.f0(l9Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20300z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = l9Var.actionBar;
        if (kVar != null) {
            kVar.e();
        }
    }

    public static void V(l9 l9Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z4, TLRPC.TL_error tL_error) {
        d2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            l9Var.getMessagesController().putUsers(groupcall.users, false);
            l9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                l9Var.showDialog(new au(l9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.f2.h(l9Var.getParentActivity(), l9Var.currentAccount, tL_inputGroupCallInviteMessage, z4, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            l9Var.showDialog(new au(l9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.qc.a0(l9Var).d0(tL_error, false);
        }
    }

    public static void W(org.telegram.ui.l9 r18, org.telegram.tgnet.TLRPC.TL_error r19, org.telegram.tgnet.TLObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l9.W(org.telegram.ui.l9, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void X(l9 l9Var, org.telegram.ui.Components.i51 i51Var, View view) {
        int i10 = i51Var.d;
        if (i10 == 2) {
            l9Var.n0(true);
            org.telegram.ui.Components.ic I = org.telegram.ui.Components.qc.a0(l9Var).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new l8(l9Var, 4));
            I.f25672j = 5000;
            I.j();
        } else if (i10 == 1) {
            m0(l9Var);
        } else {
            Object obj = i51Var.G;
            if (obj instanceof h9) {
                h9 h9Var = (h9) obj;
                ArrayList arrayList = h9Var.f34794c;
                if (l9Var.actionBar.s()) {
                    l9Var.e0(arrayList, (g9) view);
                } else if (h9Var.f34792a != 0 && !arrayList.isEmpty()) {
                    boolean z4 = h9Var.e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = h9Var.f34793b;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).f19331id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).f19205id;
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(l9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = l9Var.getMessagesController().conferenceCallSizeLimit;
                    d2Var.setOnCancelListener(new r8(l9Var, l9Var.getConnectionsManager().sendRequest(getgroupcall, new q8(l9Var, d2Var, hashSet, tL_inputGroupCallInviteMessage, z4, 0)), 0));
                    d2Var.q(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).f19205id);
                    l9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    l9Var.presentFragment(new xn(bundle), l9Var.v);
                }
            } else if (view instanceof k9) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((k9) view).f35595c.f19184id);
                l9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                l9Var.presentFragment(new xn(bundle2), l9Var.v);
            }
        }
    }

    public static void Y(l9 l9Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z4, TLRPC.TL_error tL_error) {
        d2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            l9Var.getMessagesController().putUsers(groupcall.users, false);
            l9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                l9Var.showDialog(new au(l9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.f2.h(l9Var.getParentActivity(), l9Var.currentAccount, tL_inputGroupCallInviteMessage, z4, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            l9Var.showDialog(new au(l9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.qc.a0(l9Var).d0(tL_error, false);
        }
    }

    public static void m0(org.telegram.ui.ActionBar.p2 p2Var) {
        p2Var.presentFragment(new e9(android.support.v4.media.a.i("isCall", true), p2Var.getCurrentAccount(), p2Var));
    }

    public static void o0(final Context context, int i10, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.f6 f6Var, boolean z4, final boolean z10) {
        String str2;
        int i11;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, f6Var);
        final org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(context, f6Var, false, false);
        g3Var.setBackgroundColor(v02);
        g3Var.fixNavigationBar(v02);
        final String[] strArr = {str};
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, k7.b6.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, k7.b6.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
        frameLayout.addView(frameLayout2, k7.b6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20281y6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v03, mode));
        int i12 = org.telegram.ui.ActionBar.j6.f19996i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), 1, -1));
        if (z10) {
            frameLayout.addView(imageView2, k7.b6.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.Components.e90 a2 = k7.f6.a(context, 20.0f, i13, true, f6Var);
        a2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        a2.setGravity(17);
        f10.addView(a2, k7.b6.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.e90 a10 = k7.f6.a(context, 14.0f, i13, false, f6Var);
        a10.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        a10.setGravity(17);
        a10.setMaxWidth(ph.f3.a(a10.getText(), a10.getPaint()));
        f10.addView(a10, k7.b6.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        k7.d6.b(frameLayout3, 0.01f, 1.2f);
        int i14 = org.telegram.ui.ActionBar.j6.f19852a7;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.Z(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), org.telegram.ui.ActionBar.j6.v0(i12, f6Var)), 12, 12));
        f10.addView(frameLayout3, k7.b6.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.e90 a11 = k7.f6.a(context, 13.0f, i13, false, f6Var);
        a11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        a11.setText(str2);
        frameLayout3.addView(a11, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20157r5, f6Var), mode));
        frameLayout3.addView(imageView3, k7.b6.e(40, 48, 21));
        LinearLayout f11 = org.telegram.messenger.y3.f(context, 0);
        f10.addView(f11, k7.b6.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        ph.d dVar = new ph.d(context, f6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.mq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.g(spannableStringBuilder, false, true);
        f11.addView(dVar, k7.b6.p(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        ph.d dVar2 = new ph.d(context, f6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.mq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.g(spannableStringBuilder2, false, true);
        f11.addView(dVar2, k7.b6.p(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.g3[] g3VarArr = new org.telegram.ui.ActionBar.g3[1];
        if (z4) {
            b9 b9Var = new b9(context, f6Var);
            b9Var.setGravity(17);
            b9Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20298z6, f6Var));
            b9Var.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            b9Var.setTextSize(14.0f);
            f10.addView(b9Var, k7.b6.t(190, -2, 1, 28, 12, 28, 8));
            i11 = i10;
            ah.a aVar = new ah.a(str, i11, g3VarArr, 24);
            org.telegram.ui.Components.e90 a12 = k7.f6.a(context, 14.0f, i13, false, f6Var);
            a12.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), aVar), true));
            a12.setGravity(17);
            a12.setMaxWidth(ph.f3.a(a12.getText(), a12.getPaint()));
            f10.addView(a12, k7.b6.t(-1, -2, 17, 32, 8, 32, 12));
            k7.d6.b(a12, 0.05f, 1.2f);
            a12.setOnClickListener(new a(aVar, 9));
        } else {
            i11 = i10;
        }
        g3Var.customView = f10;
        g3Var.show();
        g3VarArr[0] = g3Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.qc qcVar;
                int i15;
                switch (r4) {
                    case 0:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        qcVar = new org.telegram.ui.Components.qc(g3Var.topBulletinContainer, f6Var);
                        i15 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        qcVar = new org.telegram.ui.Components.qc(g3Var.topBulletinContainer, f6Var);
                        i15 = R.string.LinkCopied;
                        break;
                }
                b.m(i15, qcVar);
            }
        });
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.qc qcVar;
                int i15;
                switch (r4) {
                    case 0:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        qcVar = new org.telegram.ui.Components.qc(g3Var.topBulletinContainer, f6Var);
                        i15 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        qcVar = new org.telegram.ui.Components.qc(g3Var.topBulletinContainer, f6Var);
                        i15 = R.string.LinkCopied;
                        break;
                }
                b.m(i15, qcVar);
            }
        });
        final kh.m2 m2Var = new kh.m2(i11, frameLayout3, inputGroupCall, g3Var, f6Var, a11, strArr);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.g3 g3Var2 = org.telegram.ui.ActionBar.g3.this;
                org.telegram.ui.ActionBar.e3 e3Var = g3Var2.container;
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.Components.o70 F = org.telegram.ui.Components.o70.F(e3Var, f6Var2, frameLayout3);
                int i15 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.Copy);
                String[] strArr2 = strArr;
                F.c(i15, string, new s1(strArr2, g3Var2, f6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new org.telegram.messenger.voip.b(22, context, strArr2), false);
                F.m(z10, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, m2Var);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new nh.c0(context, str, strArr, f6Var, g3Var, 5));
        if (z10) {
            imageView2.setOnClickListener(new kh.u3(g3Var, f6Var, imageView2, m2Var, 3));
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z4) {
        return true;
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.K();
        createActionBar.k();
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(2.0f));
        createActionBar.getTitlesContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        if (!this.f35997w) {
            yh.z(false, this.actionBar);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 11));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(10, R.drawable.ic_ab_other);
        this.C = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int i10 = 2;
        this.C.setOnClickListener(new p8(this, 2));
        org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(this, new d5(this, 1), new m8(this), new m8(this));
        this.d = g61Var;
        int i11 = org.telegram.ui.ActionBar.j6.f19852a7;
        g61Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i11, this.resourceProvider));
        this.d.p1();
        this.d.V2.f30240r = false;
        this.f35994n = new kh.j4(this, context, 1);
        ug.i iVar = new ug.i(this.f35994n);
        kh.j4 j4Var = this.f35994n;
        ng.a aVar = this.Y;
        aVar.d = iVar;
        aVar.e = j4Var;
        org.telegram.ui.Components.g61 g61Var2 = this.d;
        Objects.requireNonNull(g61Var2);
        this.Z = new ng.k(g61Var2, j4Var, new x8(g61Var2, 0));
        this.d.C0(new l8(this, 6));
        kh.j4 j4Var2 = this.f35994n;
        this.fragmentView = j4Var2;
        j4Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        this.h = t00Var;
        t00Var.setViewType(8);
        this.h.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.h.f28855w = false;
        i9 i9Var = new i9(this, context, this.h);
        this.f35989b = i9Var;
        this.f35994n.addView(i9Var, k7.b6.c(-1.0f, -1));
        this.d.setClipToPadding(false);
        this.d.setEmptyView(this.f35989b);
        org.telegram.ui.Components.g61 g61Var3 = this.d;
        f2.i0 i0Var = new f2.i0(1, false);
        this.f35991c = i0Var;
        g61Var3.setLayoutManager(i0Var);
        org.telegram.ui.Components.g61 g61Var4 = this.d;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        g61Var4.setVerticalScrollbarPosition(i10);
        c2.y yVar = new c2.y(this.d, this.f35991c);
        this.e = yVar;
        yVar.h = new m8(this);
        kh.j4 j4Var3 = this.f35994n;
        org.telegram.ui.Components.g61 g61Var5 = this.d;
        float f10 = -this.f35987a;
        j4Var3.addView(g61Var5, k7.b6.d(-1, -1.0f, 3, 0.0f, f10, 0.0f, f10));
        this.d.setOnScrollListener(new y8(this));
        if (this.E) {
            this.f35989b.a();
        } else {
            this.f35989b.b();
        }
        org.telegram.ui.Components.z10 z10Var = new org.telegram.ui.Components.z10(context, this.resourceProvider, false);
        this.f35993f = z10Var;
        z10Var.f31207c.setImageResource(R.drawable.filled_calls_plus);
        this.f35993f.setContentDescription(LocaleController.getString(R.string.Call));
        this.f35993f.setOnClickListener(new p8(this, 3));
        this.f35994n.addView(this.f35993f, org.telegram.ui.Components.z10.b());
        org.telegram.ui.Components.js jsVar = new org.telegram.ui.Components.js(context);
        this.J = jsVar;
        jsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.J.setOnAnimatedHeightChangedListener(new l8(this, 0));
        pg.b c3 = aVar.c(this.J, rg.b.m(this.resourceProvider), false);
        c3.p(AndroidUtilities.dp(24.0f));
        c3.o(AndroidUtilities.dp(7.0f));
        this.J.setBlurredBackground(c3);
        FrameLayout frameLayout = new FrameLayout(context);
        this.K = frameLayout;
        this.J.addView(frameLayout);
        this.J.i(this.K, true, false);
        z8 z8Var = new z8(this, context, this, this.f35994n, this.resourceProvider, 0);
        this.L = z8Var;
        this.K.addView(z8Var);
        this.J.setCallFragmentContextView(this.L);
        this.f35994n.addView(this.J, k7.b6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.f35994n.addView(this.actionBar);
        eg.i0 i0Var2 = new eg.i0(context, this.parentLayout);
        this.f35995r = i0Var2;
        i0Var2.b(false, false);
        this.f35994n.addView(this.f35995r, k7.b6.e(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.f35994n);
        this.actionBar.setAdaptiveBackground(this.d);
        setBulletinDelegate(new a9(this, 0));
        if (this.f35997w) {
            View view = this.fragmentView;
            m8 m8Var = new m8(this);
            WeakHashMap weakHashMap = r0.j0.f43118a;
            r0.b0.j(view, m8Var);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r19, int r20, java.lang.Object... r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l9.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e0(ArrayList arrayList, g9 g9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean l02 = l0(arrayList);
        ArrayList arrayList2 = this.I;
        if (l02) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f19205id));
            }
            org.telegram.ui.Components.lp lpVar = g9Var.e;
            if (lpVar != null) {
                lpVar.a(false, true);
            }
            q0();
            return;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i11)).f19205id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.lp lpVar2 = g9Var.e;
        if (lpVar2 != null) {
            lpVar2.a(true, true);
        }
        q0();
    }

    public final void f0() {
        ng.e eVar;
        float f10;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.V) != null) {
            int dp = AndroidUtilities.dp(48.0f) + ((int) this.J.c(AndroidUtilities.dp(7.0f)));
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.T) - AndroidUtilities.dp(8.0f);
            this.f35990b0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
            RectF rectF = this.f35992c0;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), this.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            if (this.f35997w) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            eVar.g(i10, this.f35988a0);
            eVar.e(this.Z, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void g0() {
        this.f35993f.setTranslationY(((-this.T) - this.R) - this.S);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 2);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f19852a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35989b, 4, new Class[]{i9.class}, new String[]{"emptyTextView1"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35989b, 4, new Class[]{i9.class}, new String[]{"emptyTextView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19889c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19978h6));
        int i11 = org.telegram.ui.ActionBar.j6.f19871b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        org.telegram.ui.Components.z10 z10Var = this.f35993f;
        if (z10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(z10Var.f31207c, 8, null, null, null, null, org.telegram.ui.ActionBar.j6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35993f.f31207c, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35993f.f31207c, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.il));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19991i1}, null, org.telegram.ui.ActionBar.j6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19937f1}, null, org.telegram.ui.ActionBar.j6.f20301z9));
        TextPaint textPaint = org.telegram.ui.ActionBar.j6.Q0;
        int i12 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, textPaint, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, org.telegram.ui.ActionBar.j6.P0, null, null, org.telegram.ui.ActionBar.j6.f20121p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.j6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.j6.D0}, null, -1, null, org.telegram.ui.ActionBar.j6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.j6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.j6.E0}, null, -1, null, org.telegram.ui.ActionBar.j6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{g9.class}, null, org.telegram.ui.ActionBar.j6.f20152r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.j6.V4, org.telegram.ui.ActionBar.j6.X4}, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.j6.W4, org.telegram.ui.ActionBar.j6.Y4}, null, org.telegram.ui.ActionBar.j6.f20159r7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        return arrayList;
    }

    public final void h0() {
        if (this.d.Z0()) {
            this.d.setClipBounds(null);
            return;
        }
        int i10 = this.f35987a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10);
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight() - AndroidUtilities.dp(i10);
        Rect rect = this.U;
        rect.set(0, measuredHeight, measuredWidth, measuredHeight2);
        this.d.setClipBounds(rect);
    }

    public final void i0() {
        org.telegram.ui.Components.g61 g61Var = this.d;
        int i10 = this.f35987a;
        g61Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10) + ((int) this.J.c(AndroidUtilities.dp(14.0f))), 0, AndroidUtilities.dp(i10) + this.T + this.Q);
        this.f35989b.setPadding(0, 0, 0, this.T + this.Q);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(int i10, int i11) {
        if (this.E) {
            return;
        }
        this.E = true;
        i9 i9Var = this.f35989b;
        if (i9Var != null && !this.F) {
            i9Var.a();
        }
        org.telegram.ui.Components.g61 g61Var = this.d;
        if (g61Var != null) {
            g61Var.V2.N(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i11;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.f19293q = "";
        tL_messages_search.offset_id = i10;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new o(this, 1), 2), this.classGuid);
    }

    public final void k0(boolean z4) {
        org.telegram.ui.Components.lp lpVar;
        this.actionBar.r();
        this.I.clear();
        int childCount = this.d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.d.getChildAt(i10);
            if ((childAt instanceof g9) && (lpVar = ((g9) childAt).e) != null) {
                lpVar.a(false, z4);
            }
        }
        this.d.V2.N(true);
    }

    public final boolean l0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.I.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f19205id))) {
                return true;
            }
        }
        return false;
    }

    public final void n0(boolean z4) {
        if (z4 == getUserConfig().showCallsTab) {
            return;
        }
        getUserConfig().setShowCallsTab(z4);
        this.d.V2.N(true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (this.actionBar.s()) {
            if (z4) {
                k0(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.P && getUserConfig().showCallsTab && MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) < 2) {
            ph.f3 f3Var = new ph.f3(getParentActivity(), 1);
            this.f35996s = f3Var;
            f3Var.d = 3000L;
            f3Var.m(1.0f, -25.0f);
            this.f35996s.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            this.f35996s.t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
            this.f35994n.addView(this.f35996s, k7.b6.e(-1, 80, 48));
            this.f35996s.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(16.0f));
            this.f35996s.v();
            this.P = true;
            MessagesController.getGlobalMainSettings().edit().putInt("hidecallshint", MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) + 1).apply();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        super.onFragmentCreate();
        int i11 = 0;
        j0(0, 50);
        this.H = getMessagesController().getActiveGroupCalls();
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.activeGroupCallsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.v = bundle.getBoolean("needFinishFragment", true);
            this.f35997w = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.f35997w) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.Q = i10;
        if (this.f35997w) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.R = i11;
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
        this.T = i13;
        i0();
        g0();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        boolean z4;
        boolean z10;
        boolean z11;
        if (i10 != 101 && i10 != 102 && i10 != 103) {
            return;
        }
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                if (iArr[i11] != 0) {
                    z4 = false;
                    break;
                }
                i11++;
            } else {
                z4 = true;
                break;
            }
        }
        TLRPC.UserFull userFull = null;
        if (iArr.length > 0 && z4) {
            if (i10 == 103) {
                org.telegram.ui.Components.voip.f2.m(this.N, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            if (this.M != null) {
                userFull = getMessagesController().getUserFull(this.M.f19331id);
            }
            TLRPC.User user = this.M;
            if (i10 == 102) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 != 102 && (userFull == null || !userFull.video_calls_available)) {
                z11 = false;
            } else {
                z11 = true;
            }
            org.telegram.ui.Components.voip.f2.n(user, z10, z11, getParentActivity(), null, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.f2.i(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.g61 g61Var = this.d;
        if (g61Var != null) {
            g61Var.V2.N(true);
        }
    }

    public final void p0(boolean z4) {
        int i10;
        int dp;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
        if (z4) {
            d2Var.O = LocaleController.getString(R.string.DeleteAllCalls);
            d2Var.Q = LocaleController.getString(R.string.DeleteAllCallsText);
        } else {
            d2Var.O = LocaleController.getString(R.string.DeleteCalls);
            d2Var.Q = LocaleController.getString(R.string.DeleteSelectedCallsText);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1);
        z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
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
        frameLayout.addView(z1Var, k7.b6.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        z1Var.setOnClickListener(new o8(0, zArr));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new com.google.firebase.messaging.i(this, z4, zArr, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
        }
    }

    public final void q0() {
        int i10;
        boolean s6 = this.actionBar.s();
        ArrayList arrayList = this.I;
        boolean z4 = true;
        if (s6) {
            if (arrayList.isEmpty()) {
                k0(true);
                return;
            }
        } else {
            boolean a2 = this.actionBar.a(null);
            ArrayList arrayList2 = this.B;
            if (!a2) {
                org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
                if (this.f35997w) {
                    ImageView imageView = new ImageView(getParentActivity());
                    this.f35998x = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    this.f35998x.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
                    this.f35998x.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f20283y8), PorterDuff.Mode.MULTIPLY));
                    this.f35998x.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.f20300z8), 1, -1));
                    this.f35998x.setOnClickListener(new p8(this, 1));
                    j10.addView(this.f35998x, k7.b6.q(54, 54, 16));
                    arrayList2.add(this.f35998x);
                }
                NumberTextView numberTextView = new NumberTextView(j10.getContext());
                this.f35999y = numberTextView;
                numberTextView.setTextSize(18);
                this.f35999y.setTypeface(AndroidUtilities.bold());
                this.f35999y.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20283y8, false));
                NumberTextView numberTextView2 = this.f35999y;
                if (this.f35997w) {
                    i10 = 18;
                } else {
                    i10 = 72;
                }
                j10.addView(numberTextView2, k7.b6.m(1.0f, 0, -1, i10, 0, 0));
                this.f35999y.setOnTouchListener(new oh.d(2));
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
            z4 = false;
        }
        this.f35999y.a(arrayList.size(), z4);
    }

    @Override
    public final void s() {
        if (this.f35991c.L0() < 15) {
            this.d.x0(0);
            return;
        }
        c2.y yVar = this.e;
        yVar.f2031b = 1;
        yVar.c(0, 0, false, false);
    }

    @Override
    public final sg.d y() {
        return this.X;
    }

    public l9(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.f35987a = i10 >= 31 ? 48 : 0;
        this.v = true;
        this.B = new ArrayList();
        this.D = new ArrayList();
        this.I = new ArrayList();
        this.P = false;
        this.U = new Rect();
        ArrayList arrayList = new ArrayList();
        this.f35988a0 = arrayList;
        RectF rectF = new RectF();
        this.f35990b0 = rectF;
        RectF rectF2 = new RectF();
        this.f35992c0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        sg.c cVar = new sg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f19852a7));
        if (i10 >= 31) {
            this.V = new ng.e(false);
            this.W = new sg.d(null);
            sg.d dVar = new sg.d(null);
            this.X = dVar;
            ng.a aVar = new ng.a(dVar);
            this.Y = aVar;
            aVar.f14972f = LiteMode.isEnabled(262144);
            return;
        }
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = new ng.a(cVar);
    }
}
