package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class q11 extends org.telegram.ui.Components.ma {
    public TLRPC.Chat Q1;
    public final TLRPC.User R1;
    public final cg.l0 S1;
    public TLObject T1;
    public final FrameLayout U1;
    public final i11 V1;
    public final k11 W1;
    public final p11 X1;
    public final p11 Y1;
    public final p11 Z1;
    public final gi.d f48730a2;
    public org.telegram.ui.Components.f41 f48731b2;
    public Context c2;

    public q11(Context context, TLRPC.Chat chat, TLRPC.User user, cg.l0 l0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(2, context, e6Var, true);
        this.C1 = org.telegram.messenger.g0.L(12.0f);
        this.Q0 = true;
        this.Q1 = chat;
        this.R1 = user;
        this.T1 = user;
        this.S1 = l0Var;
        org.telegram.messenger.h10.i(this.f28583a).f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i3 = org.telegram.ui.ActionBar.k6.O5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i3, this.J0));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, d02, N, null, e6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232735);
        int i10 = org.telegram.ui.ActionBar.k6.P5;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, b8.mf.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        this.V1 = editTextBoldCursor;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, org.telegram.ui.ActionBar.k6.R5, e6Var);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, i10, e6Var);
        editTextBoldCursor.setTextSize(1, 15.0f);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setGravity(112);
        editTextBoldCursor.setClipToPadding(true);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(46.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        editTextBoldCursor.setTranslationY(-org.telegram.messenger.g0.L(0.66f));
        editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | 524288);
        editTextBoldCursor.setImeOptions(33554435);
        editTextBoldCursor.setTextIsSelectable(false);
        editTextBoldCursor.setOnEditorActionListener(new ea(this, 11));
        editTextBoldCursor.addTextChangedListener(new j11(this));
        editTextBoldCursor.setHint(org.telegram.messenger.bd.M0(2131745767, null));
        frameLayout2.addView((View) editTextBoldCursor, b8.mf.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, b8.mf.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.f28586b;
        int max = Math.max(0, viewGroup.indexOfChild(this.m1));
        float f10 = this.f28618u0 / org.telegram.messenger.g0.f22607p;
        viewGroup.addView(frameLayout, max, b8.mf.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        ?? frameLayout3 = new FrameLayout(context);
        this.W1 = frameLayout3;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.setImageDrawable(new org.telegram.ui.Components.ch0(2131624319, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        frameLayout3.addView(k9Var, b8.mf.e(130, 130, 17));
        p11 p11Var = new p11(this.f28583a, chat.f27001id, new TLRPC.TL_channelParticipantsAdmins());
        p11Var.f48406e.add(new pu0(this, 16));
        this.X1 = p11Var;
        p11 p11Var2 = new p11(this.f28583a, chat.f27001id, new TLRPC.TL_channelParticipantsRecent());
        p11Var2.f48406e.add(new pu0(this, 16));
        this.Y1 = p11Var2;
        p11 p11Var3 = new p11(this.f28583a, chat.f27001id, new TLRPC.TL_channelParticipantsSearch());
        p11Var3.f48406e.add(new pu0(this, 16));
        this.Z1 = p11Var3;
        org.telegram.ui.Components.tj0 tj0Var = this.f36102l1;
        int i11 = this.f28618u0;
        tj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(68.0f));
        this.f36102l1.setClipToPadding(false);
        this.f36102l1.setOnItemClickListener(new nx0(this, 3));
        l11 l11Var = new l11(this);
        l11Var.f55567m = false;
        l11Var.C = false;
        l11Var.o(org.telegram.ui.Components.xq.h);
        l11Var.n(350L);
        this.f36102l1.setItemAnimator(l11Var);
        this.f36102l1.addOnLayoutChangeListener(new m11(this));
        this.f36102l1.j(new n11(this));
        this.f28586b.addView(new o11(this, getContext()), b8.mf.e(-1, 68, 87));
        gi.d dVar = new gi.d(getContext(), e6Var, true);
        dVar.setRoundRadius(24);
        this.f48730a2 = dVar;
        dVar.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28141r7, this.J0));
        f1(false);
        ViewGroup viewGroup2 = this.f28586b;
        float f11 = (this.f28618u0 / org.telegram.messenger.g0.f22607p) + 10.0f;
        viewGroup2.addView(dVar, b8.mf.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        dVar.setOnClickListener(new cy0(this, 5));
        org.telegram.ui.Components.f41 f41Var = this.f48731b2;
        if (f41Var != null) {
            f41Var.O(false);
        }
        p11Var.b();
        p11Var2.b();
    }

    public static void d1(q11 q11Var) {
        org.telegram.ui.Components.tj0 tj0Var = q11Var.f36102l1;
        float f10 = -org.telegram.messenger.g0.L(64.0f);
        int i3 = 0;
        while (true) {
            if (i3 >= tj0Var.getChildCount()) {
                break;
            }
            View childAt = tj0Var.getChildAt(i3);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i3++;
        }
        q11Var.U1.setTranslationY(f10);
    }

    @Override
    public final org.telegram.ui.Components.sj0 L0(org.telegram.ui.Components.tj0 tj0Var) {
        org.telegram.ui.Components.f41 f41Var = new org.telegram.ui.Components.f41(tj0Var, getContext(), this.f28583a, 0, false, new c5(this, 23), this.J0);
        this.f48731b2 = f41Var;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.bd.M0(2131754210, null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.X1.a();
        this.Y1.a();
        this.Z1.a();
    }

    public final void e1(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.c2 = getContext();
        }
        if (this.c2 != null) {
            if (inputCheckPasswordSRP != null && !org.telegram.messenger.t3.T(this.Q1)) {
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.messenger.hp.s1(this.f28583a).T(this.c2, this.Q1.f27001id, T, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 19), null);
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (org.telegram.messenger.t3.T(this.Q1)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.Q1;
                tL_inputChannel.channel_id = chat.f27001id;
                tL_inputChannel.access_hash = chat.access_hash;
            } else {
                tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
            }
            if (inputCheckPasswordSRP != null) {
                tL_inputCheckPasswordEmpty = inputCheckPasswordSRP;
            } else {
                tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_channels_editCreator.password = tL_inputCheckPasswordEmpty;
            tL_channels_editCreator.user_id = org.telegram.messenger.hp.s1(this.f28583a).q1(user);
            ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_channels_editCreator, new ci.s7(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
        }
    }

    public final void f1(boolean z10) {
        int i3;
        int L;
        String str;
        if (org.telegram.messenger.t3.V(this.Q1)) {
            i3 = 2131749011;
        } else {
            i3 = 2131749002;
        }
        float L2 = org.telegram.messenger.g0.L(32.0f);
        gi.d dVar = this.f48730a2;
        if (dVar.getWidth() > 0) {
            L = dVar.getWidth();
        } else {
            L = org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(20.0f);
        }
        float max = Math.max(L2, (L - org.telegram.messenger.g0.L(16.0f)) - dVar.getTextPaint().measureText(org.telegram.messenger.bd.M0(i3, null)));
        TLObject tLObject = this.T1;
        if (tLObject instanceof TLRPC.User) {
            str = org.telegram.messenger.l10.k((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else {
            str = "";
        }
        dVar.i(org.telegram.messenger.bd.a0(null, null, i3, TextUtils.ellipsize(str, dVar.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            gi.d dVar = this.f48730a2;
            if (dVar != null) {
                dVar.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28141r7, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
