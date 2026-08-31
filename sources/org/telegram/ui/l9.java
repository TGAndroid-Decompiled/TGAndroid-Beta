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
public final class l9 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, vg0 {
    public final ArrayList B;
    public org.telegram.ui.ActionBar.w0 C;
    public final ArrayList D;
    public boolean E;
    public boolean F;
    public boolean G;
    public ArrayList H;
    public final ArrayList I;
    public org.telegram.ui.Components.ls J;
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
    public final og.e V;
    public final tg.d W;
    public final tg.d X;
    public final og.a Y;
    public og.k Z;
    public final int f38668a;
    public final ArrayList f38669a0;
    public i9 f38670b;
    public final RectF f38671b0;
    public f2.j0 f38672c;
    public final RectF f38673c0;
    public org.telegram.ui.Components.i61 d;
    public c2.y f38674e;
    public org.telegram.ui.Components.a20 f38675f;
    public org.telegram.ui.Components.u00 h;
    public lh.j4 f38676n;
    public fg.i0 f38677r;
    public qh.f3 f38678s;
    public boolean v;
    public boolean f38679w;
    public ImageView f38680x;
    public NumberTextView f38681y;

    public l9() {
        this(null);
    }

    public static void U(l9 l9Var) {
        org.telegram.ui.Components.i61 i61Var = l9Var.d;
        if (i61Var != null) {
            int childCount = i61Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = l9Var.d.getChildAt(i10);
                if (childAt instanceof g9) {
                    ((g9) childAt).d.u(0);
                }
            }
        }
        ImageView imageView = l9Var.f38680x;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(l9Var.getThemedColor(org.telegram.ui.ActionBar.k6.f22038y8), PorterDuff.Mode.MULTIPLY));
            l9Var.f38680x.setBackground(org.telegram.ui.ActionBar.k6.f0(l9Var.getThemedColor(org.telegram.ui.ActionBar.k6.f22055z8), 1, -1));
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
                l9Var.showDialog(new bu(l9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.g2.h(l9Var.getParentActivity(), l9Var.currentAccount, tL_inputGroupCallInviteMessage, z4, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            l9Var.showDialog(new bu(l9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.qc.a0(l9Var).d0(tL_error, false);
        }
    }

    public static void W(org.telegram.ui.l9 r18, org.telegram.tgnet.TLRPC.TL_error r19, org.telegram.tgnet.TLObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l9.W(org.telegram.ui.l9, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void X(l9 l9Var, org.telegram.ui.Components.j51 j51Var, View view) {
        int i10 = j51Var.d;
        if (i10 == 2) {
            l9Var.n0(true);
            org.telegram.ui.Components.ic I = org.telegram.ui.Components.qc.a0(l9Var).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new l8(l9Var, 4));
            I.f27745j = 5000;
            I.j();
        } else if (i10 == 1) {
            m0(l9Var);
        } else {
            Object obj = j51Var.G;
            if (obj instanceof h9) {
                h9 h9Var = (h9) obj;
                ArrayList arrayList = h9Var.f37370c;
                if (l9Var.actionBar.s()) {
                    l9Var.e0(arrayList, (g9) view);
                } else if (h9Var.f37368a != 0 && !arrayList.isEmpty()) {
                    boolean z4 = h9Var.f37371e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = h9Var.f37369b;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).f20990id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).f20864id;
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(l9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = l9Var.getMessagesController().conferenceCallSizeLimit;
                    d2Var.setOnCancelListener(new r8(l9Var, l9Var.getConnectionsManager().sendRequest(getgroupcall, new q8(l9Var, d2Var, hashSet, tL_inputGroupCallInviteMessage, z4, 0)), 0));
                    d2Var.q(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).f20864id);
                    l9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    l9Var.presentFragment(new xn(bundle), l9Var.v);
                }
            } else if (view instanceof k9) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((k9) view).f38308c.f20843id);
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
                l9Var.showDialog(new bu(l9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.g2.h(l9Var.getParentActivity(), l9Var.currentAccount, tL_inputGroupCallInviteMessage, z4, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            l9Var.showDialog(new bu(l9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.qc.a0(l9Var).d0(tL_error, false);
        }
    }

    public static void m0(org.telegram.ui.ActionBar.p2 p2Var) {
        p2Var.presentFragment(new e9(android.support.v4.media.a.i("isCall", true), p2Var.getCurrentAccount(), p2Var));
    }

    public static void o0(final Context context, int i10, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.g6 g6Var, boolean z4, final boolean z10) {
        String str2;
        int i11;
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, g6Var);
        final org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context, g6Var, false, false);
        h3Var.setBackgroundColor(v02);
        h3Var.fixNavigationBar(v02);
        final String[] strArr = {str};
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, k7.c6.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, k7.c6.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var)));
        frameLayout.addView(frameLayout2, k7.c6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22036y6, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v03, mode));
        int i12 = org.telegram.ui.ActionBar.k6.f21750i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i12, g6Var), 1, -1));
        if (z10) {
            frameLayout.addView(imageView2, k7.c6.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.Components.g90 a2 = k7.g6.a(context, 20.0f, i13, true, g6Var);
        a2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        a2.setGravity(17);
        f10.addView(a2, k7.c6.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.g90 a10 = k7.g6.a(context, 14.0f, i13, false, g6Var);
        a10.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        a10.setGravity(17);
        a10.setMaxWidth(qh.f3.a(a10.getText(), a10.getPaint()));
        f10.addView(a10, k7.c6.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        k7.e6.b(frameLayout3, 0.01f, 1.2f);
        int i14 = org.telegram.ui.ActionBar.k6.f21605a7;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.v0(i14, g6Var), org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.v0(i14, g6Var), org.telegram.ui.ActionBar.k6.v0(i12, g6Var)), 12, 12));
        f10.addView(frameLayout3, k7.c6.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.g90 a11 = k7.g6.a(context, 13.0f, i13, false, g6Var);
        a11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        a11.setText(str2);
        frameLayout3.addView(a11, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21911r5, g6Var), mode));
        frameLayout3.addView(imageView3, k7.c6.e(40, 48, 21));
        LinearLayout f11 = org.telegram.messenger.y3.f(context, 0);
        f10.addView(f11, k7.c6.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        qh.d dVar = new qh.d(context, g6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.oq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.g(spannableStringBuilder, false, true);
        f11.addView(dVar, k7.c6.p(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        qh.d dVar2 = new qh.d(context, g6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.oq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.g(spannableStringBuilder2, false, true);
        f11.addView(dVar2, k7.c6.p(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.h3[] h3VarArr = new org.telegram.ui.ActionBar.h3[1];
        if (z4) {
            b9 b9Var = new b9(context, g6Var);
            b9Var.setGravity(17);
            b9Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22053z6, g6Var));
            b9Var.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            b9Var.setTextSize(14.0f);
            f10.addView(b9Var, k7.c6.t(190, -2, 1, 28, 12, 28, 8));
            i11 = i10;
            bh.a aVar = new bh.a(str, i11, h3VarArr, 24);
            org.telegram.ui.Components.g90 a12 = k7.g6.a(context, 14.0f, i13, false, g6Var);
            a12.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), aVar), true));
            a12.setGravity(17);
            a12.setMaxWidth(qh.f3.a(a12.getText(), a12.getPaint()));
            f10.addView(a12, k7.c6.t(-1, -2, 17, 32, 8, 32, 12));
            k7.e6.b(a12, 0.05f, 1.2f);
            a12.setOnClickListener(new a(aVar, 9));
        } else {
            i11 = i10;
        }
        h3Var.customView = f10;
        h3Var.show();
        h3VarArr[0] = h3Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.qc qcVar;
                int i15;
                switch (r4) {
                    case 0:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        qcVar = new org.telegram.ui.Components.qc(h3Var.topBulletinContainer, g6Var);
                        i15 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        qcVar = new org.telegram.ui.Components.qc(h3Var.topBulletinContainer, g6Var);
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
                        qcVar = new org.telegram.ui.Components.qc(h3Var.topBulletinContainer, g6Var);
                        i15 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        qcVar = new org.telegram.ui.Components.qc(h3Var.topBulletinContainer, g6Var);
                        i15 = R.string.LinkCopied;
                        break;
                }
                b.m(i15, qcVar);
            }
        });
        final lh.l2 l2Var = new lh.l2(i11, frameLayout3, inputGroupCall, h3Var, g6Var, a11, strArr);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.h3 h3Var2 = org.telegram.ui.ActionBar.h3.this;
                org.telegram.ui.ActionBar.f3 f3Var = h3Var2.container;
                org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                org.telegram.ui.Components.q70 F = org.telegram.ui.Components.q70.F(f3Var, g6Var2, frameLayout3);
                int i15 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.Copy);
                String[] strArr2 = strArr;
                F.c(i15, string, new s1(strArr2, h3Var2, g6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new org.telegram.messenger.voip.h(21, context, strArr2), false);
                F.m(z10, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, l2Var);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new oh.b0(context, str, strArr, g6Var, h3Var, 5));
        if (z10) {
            imageView2.setOnClickListener(new lh.u3(h3Var, g6Var, imageView2, l2Var, 3));
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
        if (!this.f38679w) {
            yh.z(false, this.actionBar);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 11));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(10, R.drawable.ic_ab_other);
        this.C = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int i10 = 2;
        this.C.setOnClickListener(new p8(this, 2));
        org.telegram.ui.Components.i61 i61Var = new org.telegram.ui.Components.i61(this, new d5(this, 1), new m8(this), new m8(this));
        this.d = i61Var;
        int i11 = org.telegram.ui.ActionBar.k6.f21605a7;
        i61Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i11, this.resourceProvider));
        this.d.p1();
        this.d.V2.f32957r = false;
        this.f38676n = new lh.j4(this, context, 1);
        vg.i iVar = new vg.i(this.f38676n);
        lh.j4 j4Var = this.f38676n;
        og.a aVar = this.Y;
        aVar.d = iVar;
        aVar.f16754e = j4Var;
        org.telegram.ui.Components.i61 i61Var2 = this.d;
        Objects.requireNonNull(i61Var2);
        this.Z = new og.k(i61Var2, j4Var, new x8(i61Var2, 0));
        this.d.C0(new l8(this, 6));
        lh.j4 j4Var2 = this.f38676n;
        this.fragmentView = j4Var2;
        j4Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        this.h = u00Var;
        u00Var.setViewType(8);
        this.h.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.h.f31509w = false;
        i9 i9Var = new i9(this, context, this.h);
        this.f38670b = i9Var;
        this.f38676n.addView(i9Var, k7.c6.c(-1.0f, -1));
        this.d.setClipToPadding(false);
        this.d.setEmptyView(this.f38670b);
        org.telegram.ui.Components.i61 i61Var3 = this.d;
        f2.j0 j0Var = new f2.j0(1, false);
        this.f38672c = j0Var;
        i61Var3.setLayoutManager(j0Var);
        org.telegram.ui.Components.i61 i61Var4 = this.d;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        i61Var4.setVerticalScrollbarPosition(i10);
        c2.y yVar = new c2.y(this.d, this.f38672c);
        this.f38674e = yVar;
        yVar.h = new m8(this);
        lh.j4 j4Var3 = this.f38676n;
        org.telegram.ui.Components.i61 i61Var5 = this.d;
        float f10 = -this.f38668a;
        j4Var3.addView(i61Var5, k7.c6.d(-1, -1.0f, 3, 0.0f, f10, 0.0f, f10));
        this.d.setOnScrollListener(new y8(this));
        if (this.E) {
            this.f38670b.a();
        } else {
            this.f38670b.b();
        }
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
        this.f38675f = a20Var;
        a20Var.f25128c.setImageResource(R.drawable.filled_calls_plus);
        this.f38675f.setContentDescription(LocaleController.getString(R.string.Call));
        this.f38675f.setOnClickListener(new p8(this, 3));
        this.f38676n.addView(this.f38675f, org.telegram.ui.Components.a20.b());
        org.telegram.ui.Components.ls lsVar = new org.telegram.ui.Components.ls(context);
        this.J = lsVar;
        lsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.J.setOnAnimatedHeightChangedListener(new l8(this, 0));
        qg.b c3 = aVar.c(this.J, sg.b.m(this.resourceProvider), false);
        c3.p(AndroidUtilities.dp(24.0f));
        c3.o(AndroidUtilities.dp(7.0f));
        this.J.setBlurredBackground(c3);
        FrameLayout frameLayout = new FrameLayout(context);
        this.K = frameLayout;
        this.J.addView(frameLayout);
        this.J.i(this.K, true, false);
        z8 z8Var = new z8(this, context, this, this.f38676n, this.resourceProvider, 0);
        this.L = z8Var;
        this.K.addView(z8Var);
        this.J.setCallFragmentContextView(this.L);
        this.f38676n.addView(this.J, k7.c6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.f38676n.addView(this.actionBar);
        fg.i0 i0Var = new fg.i0(context, this.parentLayout);
        this.f38677r = i0Var;
        i0Var.b(false, false);
        this.f38676n.addView(this.f38677r, k7.c6.e(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.f38676n);
        this.actionBar.setAdaptiveBackground(this.d);
        setBulletinDelegate(new a9(this, 0));
        if (this.f38679w) {
            View view = this.fragmentView;
            m8 m8Var = new m8(this);
            WeakHashMap weakHashMap = r0.j0.f46438a;
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
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f20864id));
            }
            org.telegram.ui.Components.np npVar = g9Var.f37126e;
            if (npVar != null) {
                npVar.a(false, true);
            }
            q0();
            return;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i11)).f20864id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.np npVar2 = g9Var.f37126e;
        if (npVar2 != null) {
            npVar2.a(true, true);
        }
        q0();
    }

    public final void f0() {
        og.e eVar;
        float f10;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.V) != null) {
            int dp = AndroidUtilities.dp(48.0f) + ((int) this.J.c(AndroidUtilities.dp(7.0f)));
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.T) - AndroidUtilities.dp(8.0f);
            this.f38671b0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
            RectF rectF = this.f38673c0;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), this.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            if (this.f38679w) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            eVar.g(i10, this.f38669a0);
            eVar.e(this.Z, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void g0() {
        this.f38675f.setTranslationY(((-this.T) - this.R) - this.S);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 2);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.f21605a7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38670b, 4, new Class[]{i9.class}, new String[]{"emptyTextView1"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38670b, 4, new Class[]{i9.class}, new String[]{"emptyTextView2"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21642c7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21732h6));
        int i11 = org.telegram.ui.ActionBar.k6.f21624b7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        org.telegram.ui.Components.a20 a20Var = this.f38675f;
        if (a20Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(a20Var.f25128c, 8, null, null, null, null, org.telegram.ui.ActionBar.k6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38675f.f25128c, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38675f.f25128c, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{g9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.il));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{g9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21745i1}, null, org.telegram.ui.ActionBar.k6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{g9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21691f1}, null, org.telegram.ui.ActionBar.k6.f22056z9));
        TextPaint textPaint = org.telegram.ui.ActionBar.k6.Q0;
        int i12 = org.telegram.ui.ActionBar.k6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{g9.class}, textPaint, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{g9.class}, org.telegram.ui.ActionBar.k6.P0, null, null, org.telegram.ui.ActionBar.k6.f21875p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.k6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{g9.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.k6.D0}, null, -1, null, org.telegram.ui.ActionBar.k6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.k6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{g9.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.k6.E0}, null, -1, null, org.telegram.ui.ActionBar.k6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{g9.class}, null, org.telegram.ui.ActionBar.k6.f21906r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.k6.V4, org.telegram.ui.ActionBar.k6.X4}, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.k6.W4, org.telegram.ui.ActionBar.k6.Y4}, null, org.telegram.ui.ActionBar.k6.f21913r7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        return arrayList;
    }

    public final void h0() {
        if (this.d.Z0()) {
            this.d.setClipBounds(null);
            return;
        }
        int i10 = this.f38668a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10);
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight() - AndroidUtilities.dp(i10);
        Rect rect = this.U;
        rect.set(0, measuredHeight, measuredWidth, measuredHeight2);
        this.d.setClipBounds(rect);
    }

    public final void i0() {
        org.telegram.ui.Components.i61 i61Var = this.d;
        int i10 = this.f38668a;
        i61Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10) + ((int) this.J.c(AndroidUtilities.dp(14.0f))), 0, AndroidUtilities.dp(i10) + this.T + this.Q);
        this.f38670b.setPadding(0, 0, 0, this.T + this.Q);
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
        i9 i9Var = this.f38670b;
        if (i9Var != null && !this.F) {
            i9Var.a();
        }
        org.telegram.ui.Components.i61 i61Var = this.d;
        if (i61Var != null) {
            i61Var.V2.N(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i11;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.f20952q = "";
        tL_messages_search.offset_id = i10;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new o(this, 1), 2), this.classGuid);
    }

    public final void k0(boolean z4) {
        org.telegram.ui.Components.np npVar;
        this.actionBar.r();
        this.I.clear();
        int childCount = this.d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.d.getChildAt(i10);
            if ((childAt instanceof g9) && (npVar = ((g9) childAt).f37126e) != null) {
                npVar.a(false, z4);
            }
        }
        this.d.V2.N(true);
    }

    public final boolean l0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.I.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f20864id))) {
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
            qh.f3 f3Var = new qh.f3(getParentActivity(), 1);
            this.f38678s = f3Var;
            f3Var.d = 3000L;
            f3Var.m(1.0f, -25.0f);
            this.f38678s.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            this.f38678s.t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
            this.f38676n.addView(this.f38678s, k7.c6.e(-1, 80, 48));
            this.f38678s.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(16.0f));
            this.f38678s.v();
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
            this.f38679w = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.f38679w) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.Q = i10;
        if (this.f38679w) {
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
                org.telegram.ui.Components.voip.g2.m(this.N, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            if (this.M != null) {
                userFull = getMessagesController().getUserFull(this.M.f20990id);
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
            org.telegram.ui.Components.voip.g2.n(user, z10, z11, getParentActivity(), null, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.g2.i(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.i61 i61Var = this.d;
        if (i61Var != null) {
            i61Var.V2.N(true);
        }
    }

    public final void p0(boolean z4) {
        int i10;
        int dp;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
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
        z1Var.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
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
        frameLayout.addView(z1Var, k7.c6.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        z1Var.setOnClickListener(new o8(0, zArr));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new com.google.firebase.messaging.i(this, z4, zArr, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
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
                if (this.f38679w) {
                    ImageView imageView = new ImageView(getParentActivity());
                    this.f38680x = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    this.f38680x.setImageDrawable(new org.telegram.ui.ActionBar.i2(true));
                    this.f38680x.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.f22038y8), PorterDuff.Mode.MULTIPLY));
                    this.f38680x.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(org.telegram.ui.ActionBar.k6.f22055z8), 1, -1));
                    this.f38680x.setOnClickListener(new p8(this, 1));
                    j10.addView(this.f38680x, k7.c6.q(54, 54, 16));
                    arrayList2.add(this.f38680x);
                }
                NumberTextView numberTextView = new NumberTextView(j10.getContext());
                this.f38681y = numberTextView;
                numberTextView.setTextSize(18);
                this.f38681y.setTypeface(AndroidUtilities.bold());
                this.f38681y.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22038y8, false));
                NumberTextView numberTextView2 = this.f38681y;
                if (this.f38679w) {
                    i10 = 18;
                } else {
                    i10 = 72;
                }
                j10.addView(numberTextView2, k7.c6.m(1.0f, 0, -1, i10, 0, 0));
                this.f38681y.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
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
        this.f38681y.a(arrayList.size(), z4);
    }

    @Override
    public final void s() {
        if (this.f38672c.L0() < 15) {
            this.d.x0(0);
            return;
        }
        c2.y yVar = this.f38674e;
        yVar.f2206b = 1;
        yVar.c(0, 0, false, false);
    }

    @Override
    public final tg.d y() {
        return this.X;
    }

    public l9(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.f38668a = i10 >= 31 ? 48 : 0;
        this.v = true;
        this.B = new ArrayList();
        this.D = new ArrayList();
        this.I = new ArrayList();
        this.P = false;
        this.U = new Rect();
        ArrayList arrayList = new ArrayList();
        this.f38669a0 = arrayList;
        RectF rectF = new RectF();
        this.f38671b0 = rectF;
        RectF rectF2 = new RectF();
        this.f38673c0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        tg.c cVar = new tg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7));
        if (i10 >= 31) {
            this.V = new og.e(false);
            this.W = new tg.d(null);
            tg.d dVar = new tg.d(null);
            this.X = dVar;
            og.a aVar = new og.a(dVar);
            this.Y = aVar;
            aVar.f16755f = LiteMode.isEnabled(262144);
            return;
        }
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = new og.a(cVar);
    }
}
