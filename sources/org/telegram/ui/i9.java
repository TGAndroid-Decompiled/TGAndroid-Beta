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
public final class i9 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, mg0 {
    public final ArrayList A;
    public org.telegram.ui.ActionBar.w0 B;
    public final ArrayList C;
    public boolean D;
    public boolean E;
    public boolean F;
    public ArrayList G;
    public final ArrayList H;
    public org.telegram.ui.Components.bs I;
    public FrameLayout J;
    public w8 K;
    public TLRPC.User L;
    public TLRPC.Chat M;
    public Long N;
    public boolean O;
    public int P;
    public int Q;
    public float R;
    public int S;
    public final Rect T;
    public final ig.e U;
    public final ng.d V;
    public final ng.d W;
    public final ig.a X;
    public ig.k Y;
    public final ArrayList Z;
    public final int f39068a;
    public final RectF f39069a0;
    public f9 f39070b;
    public final RectF f39071b0;
    public f2.m0 f39072c;
    public org.telegram.ui.Components.i51 d;
    public c2.y f39073e;
    public org.telegram.ui.Components.j10 f39074f;
    public org.telegram.ui.Components.e00 h;
    public fh.x4 f39075n;
    public kh.h6 f39076r;
    public kh.x3 f39077s;
    public boolean v;
    public boolean f39078w;
    public ImageView f39079x;
    public NumberTextView f39080y;

    public i9() {
        this(null);
    }

    public static void T(i9 i9Var) {
        org.telegram.ui.Components.i51 i51Var = i9Var.d;
        if (i51Var != null) {
            int childCount = i51Var.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = i9Var.d.getChildAt(i9);
                if (childAt instanceof d9) {
                    ((d9) childAt).d.u(0);
                }
            }
        }
        ImageView imageView = i9Var.f39079x;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i9Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23371y8), PorterDuff.Mode.MULTIPLY));
            i9Var.f39079x.setBackground(org.telegram.ui.ActionBar.f6.f0(i9Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23388z8), 1, -1));
        }
        org.telegram.ui.ActionBar.k kVar = i9Var.actionBar;
        if (kVar != null) {
            kVar.d();
        }
    }

    public static void U(i9 i9Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        c2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            i9Var.getMessagesController().putUsers(groupcall.users, false);
            i9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                i9Var.showDialog(new st(i9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.e2.h(i9Var.getParentActivity(), i9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            i9Var.showDialog(new st(i9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.oc.a0(i9Var).d0(tL_error, false);
        }
    }

    public static void V(org.telegram.ui.i9 r18, org.telegram.tgnet.TLRPC.TL_error r19, org.telegram.tgnet.TLObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i9.V(org.telegram.ui.i9, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void W(i9 i9Var, org.telegram.ui.Components.l41 l41Var, View view) {
        int i9 = l41Var.d;
        if (i9 == 2) {
            i9Var.m0(true);
            org.telegram.ui.Components.gc I = org.telegram.ui.Components.oc.a0(i9Var).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new i8(i9Var, 4));
            I.f28737j = 5000;
            I.j();
        } else if (i9 == 1) {
            l0(i9Var);
        } else {
            Object obj = l41Var.G;
            if (obj instanceof e9) {
                e9 e9Var = (e9) obj;
                ArrayList arrayList = e9Var.f37858c;
                if (i9Var.actionBar.s()) {
                    i9Var.d0(arrayList, (d9) view);
                } else if (e9Var.f37856a != 0 && !arrayList.isEmpty()) {
                    boolean z10 = e9Var.f37859e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = e9Var.f37857b;
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).f22527id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).f22401id;
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(i9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = i9Var.getMessagesController().conferenceCallSizeLimit;
                    c2Var.setOnCancelListener(new o8(i9Var, i9Var.getConnectionsManager().sendRequest(getgroupcall, new n8(i9Var, c2Var, hashSet, tL_inputGroupCallInviteMessage, z10, 0)), 0));
                    c2Var.q(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).f22401id);
                    i9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    i9Var.presentFragment(new qn(bundle), i9Var.v);
                }
            } else if (view instanceof h9) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((h9) view).f38719c.f22380id);
                i9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                i9Var.presentFragment(new qn(bundle2), i9Var.v);
            }
        }
    }

    public static void X(i9 i9Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        c2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            i9Var.getMessagesController().putUsers(groupcall.users, false);
            i9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                i9Var.showDialog(new st(i9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.e2.h(i9Var.getParentActivity(), i9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            i9Var.showDialog(new st(i9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.oc.a0(i9Var).d0(tL_error, false);
        }
    }

    public static org.telegram.ui.ActionBar.k Y(i9 i9Var) {
        return i9Var.actionBar;
    }

    public static void l0(org.telegram.ui.ActionBar.o2 o2Var) {
        o2Var.presentFragment(new b9(aa.d.i("isCall", true), o2Var.getCurrentAccount(), o2Var));
    }

    public static void n0(final Context context, int i9, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.b6 b6Var, boolean z10, final boolean z11) {
        String str2;
        int i10;
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, b6Var);
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, b6Var, false, false);
        f3Var.setBackgroundColor(v02);
        f3Var.fixNavigationBar(v02);
        final String[] strArr = {str};
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        f10.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f10.addView(frameLayout, g7.e6.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, g7.e6.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var)));
        frameLayout.addView(frameLayout2, g7.e6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v03, mode));
        int i11 = org.telegram.ui.ActionBar.f6.f23092i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), 1, -1));
        if (z11) {
            frameLayout.addView(imageView2, g7.e6.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i12 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.Components.l80 a2 = g7.i6.a(context, 20.0f, i12, true, b6Var);
        a2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        a2.setGravity(17);
        f10.addView(a2, g7.e6.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.l80 a3 = g7.i6.a(context, 14.0f, i12, false, b6Var);
        a3.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        a3.setGravity(17);
        a3.setMaxWidth(kh.x3.a(a3.getText(), a3.getPaint()));
        f10.addView(a3, g7.e6.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        g7.g6.b(frameLayout3, 0.01f, 1.2f);
        int i13 = org.telegram.ui.ActionBar.f6.f22947a7;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.f6.Z(org.telegram.ui.ActionBar.f6.v0(i13, b6Var), org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.v0(i13, b6Var), org.telegram.ui.ActionBar.f6.v0(i11, b6Var)), 12, 12));
        f10.addView(frameLayout3, g7.e6.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.l80 a10 = g7.i6.a(context, 13.0f, i12, false, b6Var);
        a10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        a10.setText(str2);
        frameLayout3.addView(a10, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23247r5, b6Var), mode));
        frameLayout3.addView(imageView3, g7.e6.e(40, 48, 21));
        LinearLayout f11 = org.telegram.messenger.ll.f(context, 0);
        f10.addView(f11, g7.e6.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        kh.d dVar = new kh.d(context, b6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.g(spannableStringBuilder, false, true);
        f11.addView(dVar, g7.e6.p(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        kh.d dVar2 = new kh.d(context, b6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.eq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.g(spannableStringBuilder2, false, true);
        f11.addView(dVar2, g7.e6.p(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        if (z10) {
            y8 y8Var = new y8(context, b6Var);
            y8Var.setGravity(17);
            y8Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var));
            y8Var.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            y8Var.setTextSize(14.0f);
            f10.addView(y8Var, g7.e6.t(190, -2, 1, 28, 12, 28, 8));
            i10 = i9;
            d5.i iVar = new d5.i(str, i10, f3VarArr, 27);
            org.telegram.ui.Components.l80 a11 = g7.i6.a(context, 14.0f, i12, false, b6Var);
            a11.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), iVar), true));
            a11.setGravity(17);
            a11.setMaxWidth(kh.x3.a(a11.getText(), a11.getPaint()));
            f10.addView(a11, g7.e6.t(-1, -2, 17, 32, 8, 32, 12));
            g7.g6.b(a11, 0.05f, 1.2f);
            a11.setOnClickListener(new a(iVar, 9));
        } else {
            i10 = i9;
        }
        f3Var.customView = f10;
        f3Var.show();
        f3VarArr[0] = f3Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.oc ocVar;
                int i14;
                switch (r4) {
                    case 0:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        ocVar = new org.telegram.ui.Components.oc(f3Var.topBulletinContainer, b6Var);
                        i14 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        ocVar = new org.telegram.ui.Components.oc(f3Var.topBulletinContainer, b6Var);
                        i14 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.ll.o(i14, ocVar);
            }
        });
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.oc ocVar;
                int i14;
                switch (r4) {
                    case 0:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        ocVar = new org.telegram.ui.Components.oc(f3Var.topBulletinContainer, b6Var);
                        i14 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        ocVar = new org.telegram.ui.Components.oc(f3Var.topBulletinContainer, b6Var);
                        i14 = R.string.LinkCopied;
                        break;
                }
                org.telegram.messenger.ll.o(i14, ocVar);
            }
        });
        final fh.u2 u2Var = new fh.u2(i10, frameLayout3, inputGroupCall, f3Var, b6Var, a10, strArr);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f3 f3Var2 = org.telegram.ui.ActionBar.f3.this;
                org.telegram.ui.ActionBar.d3 d3Var = f3Var2.container;
                org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                org.telegram.ui.Components.x60 F = org.telegram.ui.Components.x60.F(d3Var, b6Var2, frameLayout3);
                int i14 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.Copy);
                String[] strArr2 = strArr;
                F.c(i14, string, new t1(strArr2, f3Var2, b6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new org.telegram.messenger.voip.l0(16, context, strArr2), false);
                F.m(z11, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, u2Var);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new ih.d0(context, str, strArr, b6Var, f3Var, 5));
        if (z11) {
            imageView2.setOnClickListener(new fh.g4(f3Var, b6Var, imageView2, u2Var, 6));
        }
    }

    @Override
    public final boolean R(MotionEvent motionEvent, boolean z10) {
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
        if (!this.f39078w) {
            org.telegram.ui.Cells.j2.v(false, this.actionBar);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 19));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(10, R.drawable.ic_ab_other);
        this.B = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int i9 = 2;
        this.B.setOnClickListener(new m8(this, 2));
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(this, new a5(this, 1), new j8(this), new j8(this));
        this.d = i51Var;
        int i10 = org.telegram.ui.ActionBar.f6.f22947a7;
        i51Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i10, this.resourceProvider));
        this.d.p1();
        this.d.U2.f35188r = false;
        this.f39075n = new fh.x4(this, context, 1);
        pg.i iVar = new pg.i(this.f39075n);
        fh.x4 x4Var = this.f39075n;
        ig.a aVar = this.X;
        aVar.d = iVar;
        aVar.f11131e = x4Var;
        org.telegram.ui.Components.i51 i51Var2 = this.d;
        Objects.requireNonNull(i51Var2);
        this.Y = new ig.k(i51Var2, x4Var, new u8(i51Var2, 0));
        this.d.C0(new i8(this, 6));
        fh.x4 x4Var2 = this.f39075n;
        this.fragmentView = x4Var2;
        x4Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        this.h = e00Var;
        e00Var.setViewType(8);
        this.h.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.h.f27885w = false;
        f9 f9Var = new f9(this, context, this.h);
        this.f39070b = f9Var;
        this.f39075n.addView(f9Var, g7.e6.c(-1.0f, -1));
        this.d.setClipToPadding(false);
        this.d.setEmptyView(this.f39070b);
        org.telegram.ui.Components.i51 i51Var3 = this.d;
        f2.m0 m0Var = new f2.m0(1, false);
        this.f39072c = m0Var;
        i51Var3.setLayoutManager(m0Var);
        org.telegram.ui.Components.i51 i51Var4 = this.d;
        if (LocaleController.isRTL) {
            i9 = 1;
        }
        i51Var4.setVerticalScrollbarPosition(i9);
        c2.y yVar = new c2.y(this.d, this.f39072c);
        this.f39073e = yVar;
        yVar.h = new j8(this);
        fh.x4 x4Var3 = this.f39075n;
        org.telegram.ui.Components.i51 i51Var5 = this.d;
        float f10 = -this.f39068a;
        x4Var3.addView(i51Var5, g7.e6.d(-1, -1.0f, 3, 0.0f, f10, 0.0f, f10));
        this.d.setOnScrollListener(new v8(this));
        if (this.D) {
            this.f39070b.a();
        } else {
            this.f39070b.b();
        }
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, this.resourceProvider, false);
        this.f39074f = j10Var;
        j10Var.f29579c.setImageResource(R.drawable.filled_calls_plus);
        this.f39074f.setContentDescription(LocaleController.getString(R.string.Call));
        this.f39074f.setOnClickListener(new m8(this, 3));
        this.f39075n.addView(this.f39074f, org.telegram.ui.Components.j10.b());
        org.telegram.ui.Components.bs bsVar = new org.telegram.ui.Components.bs(context);
        this.I = bsVar;
        bsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.I.setOnAnimatedHeightChangedListener(new i8(this, 0));
        kg.d c10 = aVar.c(this.I, mg.c.m(this.resourceProvider), false);
        c10.p(AndroidUtilities.dp(24.0f));
        c10.o(AndroidUtilities.dp(7.0f));
        this.I.setBlurredBackground(c10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        this.I.addView(frameLayout);
        this.I.i(this.J, true, false);
        w8 w8Var = new w8(this, context, this, this.f39075n, this.resourceProvider, 0);
        this.K = w8Var;
        this.J.addView(w8Var);
        this.I.setCallFragmentContextView(this.K);
        this.f39075n.addView(this.I, g7.e6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.f39075n.addView(this.actionBar);
        kh.h6 h6Var = new kh.h6(context, this.parentLayout);
        this.f39076r = h6Var;
        h6Var.b(false, false);
        this.f39075n.addView(this.f39076r, g7.e6.e(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.f39075n);
        this.actionBar.setAdaptiveBackground(this.d);
        setBulletinDelegate(new x8(this, 0));
        if (this.f39078w) {
            View view = this.fragmentView;
            j8 j8Var = new j8(this);
            WeakHashMap weakHashMap = r0.j0.f46915a;
            r0.b0.j(view, j8Var);
        }
        return this.fragmentView;
    }

    public final void d0(ArrayList arrayList, d9 d9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean k02 = k0(arrayList);
        ArrayList arrayList2 = this.H;
        if (k02) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i9)).f22401id));
            }
            org.telegram.ui.Components.dp dpVar = d9Var.f37455e;
            if (dpVar != null) {
                dpVar.a(false, true);
            }
            p0();
            return;
        }
        int size2 = arrayList.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f22401id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.dp dpVar2 = d9Var.f37455e;
        if (dpVar2 != null) {
            dpVar2.a(true, true);
        }
        p0();
    }

    @Override
    public final void didReceivedNotification(int r19, int r20, java.lang.Object... r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i9.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e0() {
        ig.e eVar;
        float f10;
        int i9;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.U) != null) {
            int dp = AndroidUtilities.dp(48.0f) + ((int) this.I.c(AndroidUtilities.dp(7.0f)));
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.S) - AndroidUtilities.dp(8.0f);
            this.f39069a0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
            RectF rectF = this.f39071b0;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), this.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            if (this.f39078w) {
                i9 = 2;
            } else {
                i9 = 1;
            }
            eVar.g(i9, this.Z);
            eVar.e(this.Y, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void f0() {
        this.f39074f.setTranslationY(((-this.S) - this.Q) - this.R);
    }

    public final void g0() {
        if (this.d.Z0()) {
            this.d.setClipBounds(null);
            return;
        }
        int i9 = this.f39068a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i9);
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight() - AndroidUtilities.dp(i9);
        Rect rect = this.T;
        rect.set(0, measuredHeight, measuredWidth, measuredHeight2);
        this.d.setClipBounds(rect);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 2);
        View view = this.fragmentView;
        int i9 = org.telegram.ui.ActionBar.f6.f22947a7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39070b, 4, new Class[]{f9.class}, new String[]{"emptyTextView1"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39070b, 4, new Class[]{f9.class}, new String[]{"emptyTextView2"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f22984c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23073h6));
        int i10 = org.telegram.ui.ActionBar.f6.f22966b7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        org.telegram.ui.Components.j10 j10Var = this.f39074f;
        if (j10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(j10Var.f29579c, 8, null, null, null, null, org.telegram.ui.ActionBar.f6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39074f.f29579c, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39074f.f29579c, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{d9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.il));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{d9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23087i1}, null, org.telegram.ui.ActionBar.f6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{d9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23032f1}, null, org.telegram.ui.ActionBar.f6.f23389z9));
        TextPaint textPaint = org.telegram.ui.ActionBar.f6.Q0;
        int i11 = org.telegram.ui.ActionBar.f6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{d9.class}, textPaint, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{d9.class}, org.telegram.ui.ActionBar.f6.P0, null, null, org.telegram.ui.ActionBar.f6.p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.f6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{d9.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.f6.D0}, null, -1, null, org.telegram.ui.ActionBar.f6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.f6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{d9.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.f6.E0}, null, -1, null, org.telegram.ui.ActionBar.f6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{d9.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.f6.V4, org.telegram.ui.ActionBar.f6.X4}, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.f6.W4, org.telegram.ui.ActionBar.f6.Y4}, null, org.telegram.ui.ActionBar.f6.f23249r7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.i51 i51Var = this.d;
        int i9 = this.f39068a;
        i51Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i9) + ((int) this.I.c(AndroidUtilities.dp(14.0f))), 0, AndroidUtilities.dp(i9) + this.S + this.P);
        this.f39070b.setPadding(0, 0, 0, this.S + this.P);
    }

    public final void i0(int i9, int i10) {
        if (this.D) {
            return;
        }
        this.D = true;
        f9 f9Var = this.f39070b;
        if (f9Var != null && !this.E) {
            f9Var.a();
        }
        org.telegram.ui.Components.i51 i51Var = this.d;
        if (i51Var != null) {
            i51Var.U2.N(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i10;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.f22489q = "";
        tL_messages_search.offset_id = i9;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new m(this, 1), 2), this.classGuid);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        org.telegram.ui.Components.dp dpVar;
        this.actionBar.r();
        this.H.clear();
        int childCount = this.d.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = this.d.getChildAt(i9);
            if ((childAt instanceof d9) && (dpVar = ((d9) childAt).f37455e) != null) {
                dpVar.a(false, z10);
            }
        }
        this.d.U2.N(true);
    }

    public final boolean k0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.H.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i9)).f22401id))) {
                return true;
            }
        }
        return false;
    }

    public final void m0(boolean z10) {
        if (z10 == getUserConfig().showCallsTab) {
            return;
        }
        getUserConfig().setShowCallsTab(z10);
        this.d.U2.N(true);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(boolean z10) {
        int i9;
        int dp;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        if (z10) {
            c2Var.N = LocaleController.getString(R.string.DeleteAllCalls);
            c2Var.P = LocaleController.getString(R.string.DeleteAllCallsText);
        } else {
            c2Var.N = LocaleController.getString(R.string.DeleteCalls);
            c2Var.P = LocaleController.getString(R.string.DeleteSelectedCallsText);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1);
        z1Var.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
        z1Var.e(LocaleController.getString(R.string.DeleteCallsForEveryone), "", false, false, false);
        if (LocaleController.isRTL) {
            i9 = AndroidUtilities.dp(8.0f);
        } else {
            i9 = 0;
        }
        if (LocaleController.isRTL) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(8.0f);
        }
        z1Var.setPadding(i9, 0, dp, 0);
        frameLayout.addView(z1Var, g7.e6.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        z1Var.setOnClickListener(new l8(0, zArr));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new b5.e(this, z10, zArr, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.actionBar.s()) {
            if (z10) {
                j0(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (!this.O && getUserConfig().showCallsTab && MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) < 2) {
            kh.x3 x3Var = new kh.x3(getParentActivity(), 1);
            this.f39077s = x3Var;
            x3Var.d = 3000L;
            x3Var.m(1.0f, -25.0f);
            this.f39077s.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            this.f39077s.t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
            this.f39075n.addView(this.f39077s, g7.e6.e(-1, 80, 48));
            this.f39077s.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(16.0f));
            this.f39077s.v();
            this.O = true;
            MessagesController.getGlobalMainSettings().edit().putInt("hidecallshint", MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) + 1).apply();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i9;
        super.onFragmentCreate();
        int i10 = 0;
        i0(0, 50);
        this.G = getMessagesController().getActiveGroupCalls();
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.activeGroupCallsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.v = bundle.getBoolean("needFinishFragment", true);
            this.f39078w = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.f39078w) {
            i9 = AndroidUtilities.dp(72.0f);
        } else {
            i9 = 0;
        }
        this.P = i9;
        if (this.f39078w) {
            i10 = AndroidUtilities.dp(64.0f);
        }
        this.Q = i10;
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
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.S = i12;
        h0();
        f0();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (i9 != 101 && i9 != 102 && i9 != 103) {
            return;
        }
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (iArr[i10] != 0) {
                    z10 = false;
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        TLRPC.UserFull userFull = null;
        if (iArr.length > 0 && z10) {
            if (i9 == 103) {
                org.telegram.ui.Components.voip.e2.m(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            if (this.L != null) {
                userFull = getMessagesController().getUserFull(this.L.f22527id);
            }
            TLRPC.User user = this.L;
            if (i9 == 102) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i9 != 102 && (userFull == null || !userFull.video_calls_available)) {
                z12 = false;
            } else {
                z12 = true;
            }
            org.telegram.ui.Components.voip.e2.n(user, z11, z12, getParentActivity(), null, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.e2.i(getParentActivity(), null, i9);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.i51 i51Var = this.d;
        if (i51Var != null) {
            i51Var.U2.N(true);
        }
    }

    public final void p0() {
        int i9;
        boolean s10 = this.actionBar.s();
        ArrayList arrayList = this.H;
        boolean z10 = true;
        if (s10) {
            if (arrayList.isEmpty()) {
                j0(true);
                return;
            }
        } else {
            boolean a2 = this.actionBar.a(null);
            ArrayList arrayList2 = this.A;
            if (!a2) {
                org.telegram.ui.ActionBar.z j10 = this.actionBar.j(null);
                if (this.f39078w) {
                    ImageView imageView = new ImageView(getParentActivity());
                    this.f39079x = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    this.f39079x.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
                    this.f39079x.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.f23371y8), PorterDuff.Mode.MULTIPLY));
                    this.f39079x.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.f23388z8), 1, -1));
                    this.f39079x.setOnClickListener(new m8(this, 1));
                    j10.addView(this.f39079x, g7.e6.q(54, 54, 16));
                    arrayList2.add(this.f39079x);
                }
                NumberTextView numberTextView = new NumberTextView(j10.getContext());
                this.f39080y = numberTextView;
                numberTextView.setTextSize(18);
                this.f39080y.setTypeface(AndroidUtilities.bold());
                this.f39080y.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23371y8, false));
                NumberTextView numberTextView2 = this.f39080y;
                if (this.f39078w) {
                    i9 = 18;
                } else {
                    i9 = 72;
                }
                j10.addView(numberTextView2, g7.e6.m(1.0f, 0, -1, i9, 0, 0));
                this.f39080y.setOnTouchListener(new jh.d(2));
                arrayList2.add(j10.h(2, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            }
            this.actionBar.N(null, null);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                View view = (View) arrayList2.get(i10);
                view.setPivotY(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f);
                AndroidUtilities.clearDrawableAnimation(view);
                arrayList3.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.1f, 1.0f));
            }
            animatorSet.playTogether(arrayList3);
            animatorSet.setDuration(200L);
            animatorSet.start();
            z10 = false;
        }
        this.f39080y.a(arrayList.size(), z10);
    }

    @Override
    public final void s() {
        if (this.f39072c.L0() < 15) {
            this.d.x0(0);
            return;
        }
        c2.y yVar = this.f39073e;
        yVar.f2255b = 1;
        yVar.c(0, 0, false, false);
    }

    @Override
    public final ng.d y() {
        return this.W;
    }

    public i9(Bundle bundle) {
        super(bundle);
        int i9 = Build.VERSION.SDK_INT;
        this.f39068a = i9 >= 31 ? 48 : 0;
        this.v = true;
        this.A = new ArrayList();
        this.C = new ArrayList();
        this.H = new ArrayList();
        this.O = false;
        this.T = new Rect();
        ArrayList arrayList = new ArrayList();
        this.Z = arrayList;
        RectF rectF = new RectF();
        this.f39069a0 = rectF;
        RectF rectF2 = new RectF();
        this.f39071b0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        ng.c cVar = new ng.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
        if (i9 >= 31) {
            this.U = new ig.e(false);
            this.V = new ng.d(null);
            ng.d dVar = new ng.d(null);
            this.W = dVar;
            ig.a aVar = new ig.a(dVar);
            this.X = aVar;
            aVar.f11132f = LiteMode.isEnabled(262144);
            return;
        }
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = new ig.a(cVar);
    }
}
