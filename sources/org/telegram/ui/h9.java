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
public final class h9 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, mg0 {
    public final ArrayList A;
    public org.telegram.ui.ActionBar.w0 B;
    public final ArrayList C;
    public boolean D;
    public boolean E;
    public boolean F;
    public ArrayList G;
    public final ArrayList H;
    public org.telegram.ui.Components.fs I;
    public FrameLayout J;
    public v8 K;
    public TLRPC.User L;
    public TLRPC.Chat M;
    public Long N;
    public boolean O;
    public int P;
    public int Q;
    public float R;
    public int S;
    public final Rect T;
    public final lg.e U;
    public final qg.d V;
    public final qg.d W;
    public final lg.a X;
    public lg.k Y;
    public final ArrayList Z;
    public final int f38787a;
    public final RectF f38788a0;
    public e9 f38789b;
    public final RectF f38790b0;
    public f2.j0 f38791c;
    public org.telegram.ui.Components.u51 d;
    public c2.z f38792e;
    public org.telegram.ui.Components.u10 f38793f;
    public org.telegram.ui.Components.p00 h;
    public ih.j4 f38794n;
    public cg.i0 f38795r;
    public nh.t3 f38796s;
    public boolean v;
    public boolean f38797w;
    public ImageView f38798x;
    public NumberTextView f38799y;

    public h9() {
        this(null);
    }

    public static void U(h9 h9Var) {
        org.telegram.ui.Components.u51 u51Var = h9Var.d;
        if (u51Var != null) {
            int childCount = u51Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = h9Var.d.getChildAt(i10);
                if (childAt instanceof c9) {
                    ((c9) childAt).d.u(0);
                }
            }
        }
        ImageView imageView = h9Var.f38798x;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(h9Var.getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.MULTIPLY));
            h9Var.f38798x.setBackground(org.telegram.ui.ActionBar.g6.f0(h9Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23452z8), 1, -1));
        }
        org.telegram.ui.ActionBar.l lVar = h9Var.actionBar;
        if (lVar != null) {
            lVar.e();
        }
    }

    public static void V(h9 h9Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        c2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            h9Var.getMessagesController().putUsers(groupcall.users, false);
            h9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                h9Var.showDialog(new tt(h9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.h2.h(h9Var.getParentActivity(), h9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            h9Var.showDialog(new tt(h9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.tc.a0(h9Var).d0(tL_error, false);
        }
    }

    public static void W(org.telegram.ui.h9 r18, org.telegram.tgnet.TLRPC.TL_error r19, org.telegram.tgnet.TLObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h9.W(org.telegram.ui.h9, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void X(h9 h9Var, org.telegram.ui.Components.w41 w41Var, View view) {
        int i10 = w41Var.d;
        if (i10 == 2) {
            h9Var.n0(true);
            org.telegram.ui.Components.mc I = org.telegram.ui.Components.tc.a0(h9Var).I(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallTabWasShownTitle)), LocaleController.getString(R.string.UndoNoCaps), 5000, true, new h8(h9Var, 4));
            I.f30652j = 5000;
            I.j();
        } else if (i10 == 1) {
            m0(h9Var);
        } else {
            Object obj = w41Var.G;
            if (obj instanceof d9) {
                d9 d9Var = (d9) obj;
                ArrayList arrayList = d9Var.f37412c;
                if (h9Var.actionBar.s()) {
                    h9Var.e0(arrayList, (c9) view);
                } else if (d9Var.f37410a != 0 && !arrayList.isEmpty()) {
                    boolean z10 = d9Var.f37413e;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = d9Var.f37411b;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        hashSet.add(Long.valueOf(((TLRPC.User) obj2).f22539id));
                    }
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).f22413id;
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(h9Var.getParentActivity(), 3, null);
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    getgroupcall.limit = h9Var.getMessagesController().conferenceCallSizeLimit;
                    c2Var.setOnCancelListener(new n8(h9Var, h9Var.getConnectionsManager().sendRequest(getgroupcall, new m8(h9Var, c2Var, hashSet, tL_inputGroupCallInviteMessage, z10, 0)), 0));
                    c2Var.q(600L);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", MessageObject.getDialogId((TLRPC.Message) arrayList.get(0)));
                    bundle.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).f22413id);
                    h9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    h9Var.presentFragment(new tn(bundle), h9Var.v);
                }
            } else if (view instanceof g9) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", ((g9) view).f38491c.f22392id);
                h9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                h9Var.presentFragment(new tn(bundle2), h9Var.v);
            }
        }
    }

    public static void Y(h9 h9Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z10, TLRPC.TL_error tL_error) {
        c2Var.dismiss();
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            h9Var.getMessagesController().putUsers(groupcall.users, false);
            h9Var.getMessagesController().putChats(groupcall.chats, false);
            if (groupcall.participants.isEmpty()) {
                h9Var.showDialog(new tt(h9Var.getParentActivity(), hashSet));
            } else {
                org.telegram.ui.Components.voip.h2.h(h9Var.getParentActivity(), h9Var.currentAccount, tL_inputGroupCallInviteMessage, z10, groupcall.call, null);
            }
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            h9Var.showDialog(new tt(h9Var.getParentActivity(), hashSet));
        } else if (tL_error != null) {
            org.telegram.ui.Components.tc.a0(h9Var).d0(tL_error, false);
        }
    }

    public static void m0(org.telegram.ui.ActionBar.o2 o2Var) {
        o2Var.presentFragment(new a9(a4.w.i("isCall", true), o2Var.getCurrentAccount(), o2Var));
    }

    public static void o0(final Context context, int i10, TLRPC.InputGroupCall inputGroupCall, String str, final org.telegram.ui.ActionBar.c6 c6Var, boolean z10, final boolean z11) {
        String str2;
        int i11;
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var);
        final org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, c6Var, false, false);
        f3Var.setBackgroundColor(v02);
        f3Var.fixNavigationBar(v02);
        final String[] strArr = {str};
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        g10.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g10.addView(frameLayout, i7.f6.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, i7.f6.e(-1, -1, 17));
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        frameLayout.addView(frameLayout2, i7.f6.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v03, mode));
        int i12 = org.telegram.ui.ActionBar.g6.f23152i6;
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), 1, -1));
        if (z11) {
            frameLayout.addView(imageView2, i7.f6.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.Components.y80 a2 = i7.j6.a(context, 20.0f, i13, true, c6Var);
        a2.setText(LocaleController.getString(R.string.GroupCallCreatedLinkTitle));
        a2.setGravity(17);
        g10.addView(a2, i7.f6.t(-1, -2, 17, 32, 16, 32, 8));
        org.telegram.ui.Components.y80 a10 = i7.j6.a(context, 14.0f, i13, false, c6Var);
        a10.setText(LocaleController.getString(R.string.GroupCallCreatedLinkText));
        a10.setGravity(17);
        a10.setMaxWidth(nh.t3.a(a10.getText(), a10.getPaint()));
        g10.addView(a10, i7.f6.t(-1, -2, 17, 32, 0, 32, 18));
        if (str.startsWith("https://")) {
            str2 = str.substring(8);
        } else {
            str2 = str;
        }
        final FrameLayout frameLayout3 = new FrameLayout(context);
        i7.h6.b(frameLayout3, 0.01f, 1.2f);
        int i14 = org.telegram.ui.ActionBar.g6.f23009a7;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), org.telegram.ui.ActionBar.g6.v0(i12, c6Var)), 12, 12));
        g10.addView(frameLayout3, i7.f6.t(-1, -2, 7, 16, 0, 16, 0));
        org.telegram.ui.Components.y80 a11 = i7.j6.a(context, 13.0f, i13, false, c6Var);
        a11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
        a11.setText(str2);
        frameLayout3.addView(a11, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView3.setScaleType(scaleType);
        imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23310r5, c6Var), mode));
        frameLayout3.addView(imageView3, i7.f6.e(40, 48, 21));
        LinearLayout g11 = org.telegram.messenger.x3.g(context, 0);
        g10.addView(g11, i7.f6.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        nh.d dVar = new nh.d(context, c6Var, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkCopy));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.iq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        dVar.g(spannableStringBuilder, false, true);
        g11.addView(dVar, i7.f6.p(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        nh.d dVar2 = new nh.d(context, c6Var, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreatedLinkShare));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.iq(R.drawable.msg_share_filled, 0), 0, 1, 33);
        dVar2.g(spannableStringBuilder2, false, true);
        g11.addView(dVar2, i7.f6.p(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        org.telegram.ui.ActionBar.f3[] f3VarArr = new org.telegram.ui.ActionBar.f3[1];
        if (z10) {
            x8 x8Var = new x8(context, c6Var);
            x8Var.setGravity(17);
            x8Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var));
            x8Var.setText(" " + LocaleController.getString(R.string.GroupCallCreatedLinkJoinOr) + " ");
            x8Var.setTextSize(14.0f);
            g10.addView(x8Var, i7.f6.t(190, -2, 1, 28, 12, 28, 8));
            i11 = i10;
            ag.v0 v0Var = new ag.v0(str, i11, f3VarArr, 26);
            org.telegram.ui.Components.y80 a12 = i7.j6.a(context, 14.0f, i13, false, c6Var);
            a12.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GroupCallCreatedLinkJoinText), v0Var), true));
            a12.setGravity(17);
            a12.setMaxWidth(nh.t3.a(a12.getText(), a12.getPaint()));
            g10.addView(a12, i7.f6.t(-1, -2, 17, 32, 8, 32, 12));
            i7.h6.b(a12, 0.05f, 1.2f);
            a12.setOnClickListener(new a(v0Var, 9));
        } else {
            i11 = i10;
        }
        f3Var.customView = g10;
        f3Var.show();
        f3VarArr[0] = f3Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.tc tcVar;
                int i15;
                switch (r4) {
                    case 0:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        tcVar = new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, c6Var);
                        i15 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        tcVar = new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, c6Var);
                        i15 = R.string.LinkCopied;
                        break;
                }
                b.n(i15, tcVar);
            }
        });
        dVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.tc tcVar;
                int i15;
                switch (r4) {
                    case 0:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        tcVar = new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, c6Var);
                        i15 = R.string.LinkCopied;
                        break;
                    default:
                        AndroidUtilities.addToClipboard(strArr[0]);
                        tcVar = new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, c6Var);
                        i15 = R.string.LinkCopied;
                        break;
                }
                b.n(i15, tcVar);
            }
        });
        final ih.m2 m2Var = new ih.m2(i11, frameLayout3, inputGroupCall, f3Var, c6Var, a11, strArr);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.f3 f3Var2 = org.telegram.ui.ActionBar.f3.this;
                org.telegram.ui.ActionBar.d3 d3Var = f3Var2.container;
                org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
                org.telegram.ui.Components.j70 F = org.telegram.ui.Components.j70.F(d3Var, c6Var2, frameLayout3);
                int i15 = R.drawable.msg_copy;
                String string = LocaleController.getString(R.string.Copy);
                String[] strArr2 = strArr;
                F.c(i15, string, new u1(strArr2, f3Var2, c6Var2, 7), false);
                F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new org.telegram.ui.ActionBar.c(13, context, strArr2), false);
                F.m(z11, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, m2Var);
                F.Z();
            }
        });
        dVar2.setOnClickListener(new lh.b0(context, str, strArr, c6Var, f3Var, 5));
        if (z11) {
            imageView2.setOnClickListener(new ih.u3(f3Var, c6Var, imageView2, m2Var, 3));
        }
    }

    @Override
    public final boolean S(MotionEvent motionEvent, boolean z10) {
        return true;
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        org.telegram.ui.ActionBar.l createActionBar = super.createActionBar(context);
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
        if (!this.f38797w) {
            th.y(false, this.actionBar);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 11));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(10, R.drawable.ic_ab_other);
        this.B = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int i10 = 2;
        this.B.setOnClickListener(new l8(this, 2));
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(this, new b5(this, 1), new i8(this), new i8(this));
        this.d = u51Var;
        int i11 = org.telegram.ui.ActionBar.g6.f23009a7;
        u51Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, this.resourceProvider));
        this.d.p1();
        this.d.U2.f29939r = false;
        this.f38794n = new ih.j4(this, context, 1);
        sg.i iVar = new sg.i(this.f38794n);
        ih.j4 j4Var = this.f38794n;
        lg.a aVar = this.X;
        aVar.d = iVar;
        aVar.f15224e = j4Var;
        org.telegram.ui.Components.u51 u51Var2 = this.d;
        Objects.requireNonNull(u51Var2);
        this.Y = new lg.k(u51Var2, j4Var, new t8(u51Var2, 0));
        this.d.C0(new h8(this, 6));
        ih.j4 j4Var2 = this.f38794n;
        this.fragmentView = j4Var2;
        j4Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
        this.h = p00Var;
        p00Var.setViewType(8);
        this.h.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.h.f31529w = false;
        e9 e9Var = new e9(this, context, this.h);
        this.f38789b = e9Var;
        this.f38794n.addView(e9Var, i7.f6.c(-1.0f, -1));
        this.d.setClipToPadding(false);
        this.d.setEmptyView(this.f38789b);
        org.telegram.ui.Components.u51 u51Var3 = this.d;
        f2.j0 j0Var = new f2.j0(1, false);
        this.f38791c = j0Var;
        u51Var3.setLayoutManager(j0Var);
        org.telegram.ui.Components.u51 u51Var4 = this.d;
        if (LocaleController.isRTL) {
            i10 = 1;
        }
        u51Var4.setVerticalScrollbarPosition(i10);
        c2.z zVar = new c2.z(this.d, this.f38791c);
        this.f38792e = zVar;
        zVar.h = new i8(this);
        ih.j4 j4Var3 = this.f38794n;
        org.telegram.ui.Components.u51 u51Var5 = this.d;
        float f9 = -this.f38787a;
        j4Var3.addView(u51Var5, i7.f6.d(-1, -1.0f, 3, 0.0f, f9, 0.0f, f9));
        this.d.setOnScrollListener(new u8(this));
        if (this.D) {
            this.f38789b.a();
        } else {
            this.f38789b.b();
        }
        org.telegram.ui.Components.u10 u10Var = new org.telegram.ui.Components.u10(context, this.resourceProvider, false);
        this.f38793f = u10Var;
        u10Var.f33090c.setImageResource(R.drawable.filled_calls_plus);
        this.f38793f.setContentDescription(LocaleController.getString(R.string.Call));
        this.f38793f.setOnClickListener(new l8(this, 3));
        this.f38794n.addView(this.f38793f, org.telegram.ui.Components.u10.b());
        org.telegram.ui.Components.fs fsVar = new org.telegram.ui.Components.fs(context);
        this.I = fsVar;
        fsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        this.I.setOnAnimatedHeightChangedListener(new h8(this, 0));
        ng.d c3 = aVar.c(this.I, pg.a.m(this.resourceProvider), false);
        c3.p(AndroidUtilities.dp(24.0f));
        c3.o(AndroidUtilities.dp(7.0f));
        this.I.setBlurredBackground(c3);
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        this.I.addView(frameLayout);
        this.I.i(this.J, true, false);
        v8 v8Var = new v8(this, context, this, this.f38794n, this.resourceProvider, 0);
        this.K = v8Var;
        this.J.addView(v8Var);
        this.I.setCallFragmentContextView(this.K);
        this.f38794n.addView(this.I, i7.f6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        this.f38794n.addView(this.actionBar);
        cg.i0 i0Var = new cg.i0(context, this.parentLayout);
        this.f38795r = i0Var;
        i0Var.b(false, false);
        this.f38794n.addView(this.f38795r, i7.f6.e(-1, 5, 48));
        this.actionBar.setDrawBlurBackground(this.f38794n);
        this.actionBar.setAdaptiveBackground(this.d);
        setBulletinDelegate(new w8(this, 0));
        if (this.f38797w) {
            View view = this.fragmentView;
            i8 i8Var = new i8(this);
            WeakHashMap weakHashMap = r0.j0.f46829a;
            r0.b0.j(view, i8Var);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int r19, int r20, java.lang.Object... r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h9.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e0(ArrayList arrayList, c9 c9Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean l02 = l0(arrayList);
        ArrayList arrayList2 = this.H;
        if (l02) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f22413id));
            }
            org.telegram.ui.Components.hp hpVar = c9Var.f37045e;
            if (hpVar != null) {
                hpVar.a(false, true);
            }
            q0();
            return;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i11)).f22413id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        org.telegram.ui.Components.hp hpVar2 = c9Var.f37045e;
        if (hpVar2 != null) {
            hpVar2.a(true, true);
        }
        q0();
    }

    public final void f0() {
        lg.e eVar;
        float f9;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.U) != null) {
            int dp = AndroidUtilities.dp(48.0f) + ((int) this.I.c(AndroidUtilities.dp(7.0f)));
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.S) - AndroidUtilities.dp(8.0f);
            this.f38788a0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
            RectF rectF = this.f38790b0;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), this.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f9 = 0.0f;
            } else {
                f9 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f9);
            if (this.f38797w) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            eVar.g(i10, this.Z);
            eVar.e(this.Y, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void g0() {
        this.f38793f.setTranslationY(((-this.S) - this.Q) - this.R);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 2);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23009a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38789b, 4, new Class[]{e9.class}, new String[]{"emptyTextView1"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38789b, 4, new Class[]{e9.class}, new String[]{"emptyTextView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23045c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23134h6));
        int i11 = org.telegram.ui.ActionBar.g6.f23028b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        org.telegram.ui.Components.u10 u10Var = this.f38793f;
        if (u10Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(u10Var.f33090c, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.O9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38793f.f33090c, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.P9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38793f.f33090c, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Q9));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.il));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23147i1}, null, org.telegram.ui.ActionBar.g6.A9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23094f1}, null, org.telegram.ui.ActionBar.g6.f23453z9));
        TextPaint textPaint = org.telegram.ui.ActionBar.g6.Q0;
        int i12 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, textPaint, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, org.telegram.ui.ActionBar.g6.P0, null, null, org.telegram.ui.ActionBar.g6.f23278p6));
        TextPaint[] textPaintArr = org.telegram.ui.ActionBar.g6.B0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], org.telegram.ui.ActionBar.g6.D0}, null, -1, null, org.telegram.ui.ActionBar.g6.X8));
        TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.g6.C0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], org.telegram.ui.ActionBar.g6.E0}, null, -1, null, org.telegram.ui.ActionBar.g6.Z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{c9.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.g6.V4, org.telegram.ui.ActionBar.g6.X4}, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, null, new Drawable[]{null, null, org.telegram.ui.ActionBar.g6.W4, org.telegram.ui.ActionBar.g6.Y4}, null, org.telegram.ui.ActionBar.g6.f23311r7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        return arrayList;
    }

    public final void h0() {
        if (this.d.Z0()) {
            this.d.setClipBounds(null);
            return;
        }
        int i10 = this.f38787a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10);
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight2 = this.d.getMeasuredHeight() - AndroidUtilities.dp(i10);
        Rect rect = this.T;
        rect.set(0, measuredHeight, measuredWidth, measuredHeight2);
        this.d.setClipBounds(rect);
    }

    public final void i0() {
        org.telegram.ui.Components.u51 u51Var = this.d;
        int i10 = this.f38787a;
        u51Var.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10) + ((int) this.I.c(AndroidUtilities.dp(14.0f))), 0, AndroidUtilities.dp(i10) + this.S + this.P);
        this.f38789b.setPadding(0, 0, 0, this.S + this.P);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(int i10, int i11) {
        if (this.D) {
            return;
        }
        this.D = true;
        e9 e9Var = this.f38789b;
        if (e9Var != null && !this.E) {
            e9Var.a();
        }
        org.telegram.ui.Components.u51 u51Var = this.d;
        if (u51Var != null) {
            u51Var.U2.N(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i11;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.f22501q = "";
        tL_messages_search.offset_id = i10;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new o(this, 1), 2), this.classGuid);
    }

    public final void k0(boolean z10) {
        org.telegram.ui.Components.hp hpVar;
        this.actionBar.r();
        this.H.clear();
        int childCount = this.d.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.d.getChildAt(i10);
            if ((childAt instanceof c9) && (hpVar = ((c9) childAt).f37045e) != null) {
                hpVar.a(false, z10);
            }
        }
        this.d.U2.N(true);
    }

    public final boolean l0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.H.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i10)).f22413id))) {
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
        this.d.U2.N(true);
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
        if (!this.O && getUserConfig().showCallsTab && MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) < 2) {
            nh.t3 t3Var = new nh.t3(getParentActivity(), 1);
            this.f38796s = t3Var;
            t3Var.d = 3000L;
            t3Var.m(1.0f, -25.0f);
            this.f38796s.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            this.f38796s.t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.TapToHideCallsTab)));
            this.f38794n.addView(this.f38796s, i7.f6.e(-1, 80, 48));
            this.f38796s.setTranslationY((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(16.0f));
            this.f38796s.v();
            this.O = true;
            MessagesController.getGlobalMainSettings().edit().putInt("hidecallshint", MessagesController.getGlobalMainSettings().getInt("hidecallshint", 0) + 1).apply();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        super.onFragmentCreate();
        int i11 = 0;
        j0(0, 50);
        this.G = getMessagesController().getActiveGroupCalls();
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.activeGroupCallsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.v = bundle.getBoolean("needFinishFragment", true);
            this.f38797w = this.arguments.getBoolean("hasMainTabs", false);
        }
        if (this.f38797w) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.P = i10;
        if (this.f38797w) {
            i11 = AndroidUtilities.dp(64.0f);
        }
        this.Q = i11;
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
        this.S = i13;
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
                org.telegram.ui.Components.voip.h2.m(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
                return;
            }
            if (this.L != null) {
                userFull = getMessagesController().getUserFull(this.L.f22539id);
            }
            TLRPC.User user = this.L;
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
            org.telegram.ui.Components.voip.h2.n(user, z11, z12, getParentActivity(), null, getAccountInstance());
            return;
        }
        org.telegram.ui.Components.voip.h2.i(getParentActivity(), null, i10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.u51 u51Var = this.d;
        if (u51Var != null) {
            u51Var.U2.N(true);
        }
    }

    public final void p0(boolean z10) {
        int i10;
        int dp;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        if (z10) {
            c2Var.N = LocaleController.getString(R.string.DeleteAllCalls);
            c2Var.P = LocaleController.getString(R.string.DeleteAllCallsText);
        } else {
            c2Var.N = LocaleController.getString(R.string.DeleteCalls);
            c2Var.P = LocaleController.getString(R.string.DeleteSelectedCallsText);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(getParentActivity(), 1);
        y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
        y1Var.e(LocaleController.getString(R.string.DeleteCallsForEveryone), "", false, false, false);
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
        y1Var.setPadding(i10, 0, dp, 0);
        frameLayout.addView(y1Var, i7.f6.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        y1Var.setOnClickListener(new k8(0, zArr));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new com.google.firebase.messaging.i(this, z10, zArr, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
        }
    }

    public final void q0() {
        int i10;
        boolean s10 = this.actionBar.s();
        ArrayList arrayList = this.H;
        boolean z10 = true;
        if (s10) {
            if (arrayList.isEmpty()) {
                k0(true);
                return;
            }
        } else {
            boolean a2 = this.actionBar.a(null);
            ArrayList arrayList2 = this.A;
            if (!a2) {
                org.telegram.ui.ActionBar.a0 j10 = this.actionBar.j(null);
                if (this.f38797w) {
                    ImageView imageView = new ImageView(getParentActivity());
                    this.f38798x = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    this.f38798x.setImageDrawable(new org.telegram.ui.ActionBar.h2(true));
                    this.f38798x.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.y8), PorterDuff.Mode.MULTIPLY));
                    this.f38798x.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.f23452z8), 1, -1));
                    this.f38798x.setOnClickListener(new l8(this, 1));
                    j10.addView(this.f38798x, i7.f6.q(54, 54, 16));
                    arrayList2.add(this.f38798x);
                }
                NumberTextView numberTextView = new NumberTextView(j10.getContext());
                this.f38799y = numberTextView;
                numberTextView.setTextSize(18);
                this.f38799y.setTypeface(AndroidUtilities.bold());
                this.f38799y.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y8, false));
                NumberTextView numberTextView2 = this.f38799y;
                if (this.f38797w) {
                    i10 = 18;
                } else {
                    i10 = 72;
                }
                j10.addView(numberTextView2, i7.f6.m(1.0f, 0, -1, i10, 0, 0));
                this.f38799y.setOnTouchListener(new mh.d(2));
                arrayList2.add(j10.h(2, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f)));
            }
            this.actionBar.O(null, null);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                View view = (View) arrayList2.get(i11);
                view.setPivotY(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f);
                AndroidUtilities.clearDrawableAnimation(view);
                arrayList3.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 0.1f, 1.0f));
            }
            animatorSet.playTogether(arrayList3);
            animatorSet.setDuration(200L);
            animatorSet.start();
            z10 = false;
        }
        this.f38799y.a(arrayList.size(), z10);
    }

    @Override
    public final void s() {
        if (this.f38791c.L0() < 15) {
            this.d.x0(0);
            return;
        }
        c2.z zVar = this.f38792e;
        zVar.f2933b = 1;
        zVar.c(0, 0, false, false);
    }

    @Override
    public final qg.d y() {
        return this.W;
    }

    public h9(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.f38787a = i10 >= 31 ? 48 : 0;
        this.v = true;
        this.A = new ArrayList();
        this.C = new ArrayList();
        this.H = new ArrayList();
        this.O = false;
        this.T = new Rect();
        ArrayList arrayList = new ArrayList();
        this.Z = arrayList;
        RectF rectF = new RectF();
        this.f38788a0 = rectF;
        RectF rectF2 = new RectF();
        this.f38790b0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        qg.c cVar = new qg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7));
        if (i10 >= 31) {
            this.U = new lg.e(false);
            this.V = new qg.d(null);
            qg.d dVar = new qg.d(null);
            this.W = dVar;
            lg.a aVar = new lg.a(dVar);
            this.X = aVar;
            aVar.f15225f = LiteMode.isEnabled(262144);
            return;
        }
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = new lg.a(cVar);
    }
}
