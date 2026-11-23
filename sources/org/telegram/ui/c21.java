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
public final class c21 extends org.telegram.ui.Components.sa {
    public TLRPC.Chat T1;
    public final TLRPC.User U1;
    public final ii V1;
    public TLObject W1;
    public final FrameLayout X1;
    public final u11 Y1;
    public final w11 Z1;
    public final b21 f46394a2;
    public final b21 f46395b2;
    public final b21 f46396c2;
    public final hi.e d2;
    public org.telegram.ui.Components.c51 f46397e2;
    public Context f46398f2;

    public c21(Context context, TLRPC.Chat chat, TLRPC.User user, ii iiVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(2, context, h6Var, true);
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.Q0 = true;
        this.T1 = chat;
        this.U1 = user;
        this.W1 = user;
        this.V1 = iiVar;
        org.telegram.messenger.k10.i(this.f30173a).f();
        FrameLayout frameLayout = new FrameLayout(context);
        this.X1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(20.0f);
        int i7 = org.telegram.ui.ActionBar.m6.O5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, this.J0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout2, d02, M, null, h6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232739);
        int i10 = org.telegram.ui.ActionBar.m6.P5;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, c8.ma.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        this.Y1 = editTextBoldCursor;
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, org.telegram.ui.ActionBar.m6.R5, h6Var);
        org.telegram.ui.ActionBar.t6.D(editTextBoldCursor, i10, h6Var);
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
        editTextBoldCursor.setOnEditorActionListener(new fa(this, 11));
        editTextBoldCursor.addTextChangedListener(new v11(this));
        editTextBoldCursor.setHint(org.telegram.messenger.hd.N0(2131745561, null));
        frameLayout2.addView((View) editTextBoldCursor, c8.ma.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, c8.ma.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.f30176b;
        int max = Math.max(0, viewGroup.indexOfChild(this.f39532p1));
        float f10 = this.f30211u0 / org.telegram.messenger.g0.f24045p;
        viewGroup.addView(frameLayout, max, c8.ma.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        ?? frameLayout3 = new FrameLayout(context);
        this.Z1 = frameLayout3;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        q9Var.setImageDrawable(new org.telegram.ui.Components.oh0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
        frameLayout3.addView(q9Var, c8.ma.e(130, 130, 17));
        b21 b21Var = new b21(this.f30173a, chat.f28434id, new TLRPC.TL_channelParticipantsAdmins());
        b21Var.f45754e.add(new ru0(this, 17));
        this.f46394a2 = b21Var;
        b21 b21Var2 = new b21(this.f30173a, chat.f28434id, new TLRPC.TL_channelParticipantsRecent());
        b21Var2.f45754e.add(new ru0(this, 17));
        this.f46395b2 = b21Var2;
        b21 b21Var3 = new b21(this.f30173a, chat.f28434id, new TLRPC.TL_channelParticipantsSearch());
        b21Var3.f45754e.add(new ru0(this, 17));
        this.f46396c2 = b21Var3;
        org.telegram.ui.Components.ek0 ek0Var = this.f39531o1;
        int i11 = this.f30211u0;
        ek0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(68.0f));
        this.f39531o1.setClipToPadding(false);
        this.f39531o1.setOnItemClickListener(new zx0(this, 3));
        x11 x11Var = new x11(this);
        x11Var.f59194m = false;
        x11Var.C = false;
        x11Var.o(org.telegram.ui.Components.nr.h);
        x11Var.n(350L);
        this.f39531o1.setItemAnimator(x11Var);
        this.f39531o1.addOnLayoutChangeListener(new y11(this));
        this.f39531o1.j(new z11(this));
        this.f30176b.addView(new a21(this, getContext()), c8.ma.e(-1, 68, 87));
        hi.e eVar = new hi.e(getContext(), h6Var, true);
        eVar.setRoundRadius(24);
        this.d2 = eVar;
        eVar.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29641r7, this.J0));
        g1(false);
        ViewGroup viewGroup2 = this.f30176b;
        float f11 = (this.f30211u0 / org.telegram.messenger.g0.f24045p) + 10.0f;
        viewGroup2.addView(eVar, c8.ma.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        eVar.setOnClickListener(new oy0(this, 5));
        org.telegram.ui.Components.c51 c51Var = this.f46397e2;
        if (c51Var != null) {
            c51Var.O(false);
        }
        b21Var.b();
        b21Var2.b();
    }

    public static void e1(c21 c21Var) {
        org.telegram.ui.Components.ek0 ek0Var = c21Var.f39531o1;
        float f10 = -org.telegram.messenger.g0.L(64.0f);
        int i7 = 0;
        while (true) {
            if (i7 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i7);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i7++;
        }
        c21Var.X1.setTranslationY(f10);
    }

    @Override
    public final org.telegram.ui.Components.dk0 M0(org.telegram.ui.Components.ek0 ek0Var) {
        org.telegram.ui.Components.c51 c51Var = new org.telegram.ui.Components.c51(ek0Var, getContext(), this.f30173a, 0, false, new a5(this, 24), this.J0);
        this.f46397e2 = c51Var;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        return org.telegram.messenger.hd.N0(2131754207, null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f46394a2.a();
        this.f46395b2.a();
        this.f46396c2.a();
    }

    public final void f1(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getContext() != null) {
            this.f46398f2 = getContext();
        }
        if (this.f46398f2 != null) {
            if (inputCheckPasswordSRP != null && !org.telegram.messenger.v3.T(this.T1)) {
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.messenger.np.u1(this.f30173a).T(this.f46398f2, this.T1.f28434id, T, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 20), null);
                return;
            }
            TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
            if (org.telegram.messenger.v3.T(this.T1)) {
                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                tL_channels_editCreator.channel = tL_inputChannel;
                TLRPC.Chat chat = this.T1;
                tL_inputChannel.channel_id = chat.f28434id;
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
            tL_channels_editCreator.user_id = org.telegram.messenger.np.u1(this.f30173a).s1(user);
            ConnectionsManager.getInstance(this.f30173a).sendRequest(tL_channels_editCreator, new di.m7(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
        }
    }

    public final void g1(boolean z10) {
        int i7;
        int L;
        String str;
        if (org.telegram.messenger.v3.V(this.T1)) {
            i7 = 2131748810;
        } else {
            i7 = 2131748801;
        }
        float L2 = org.telegram.messenger.g0.L(32.0f);
        hi.e eVar = this.d2;
        if (eVar.getWidth() > 0) {
            L = eVar.getWidth();
        } else {
            L = org.telegram.messenger.g0.f24046q.x - org.telegram.messenger.g0.L(20.0f);
        }
        float max = Math.max(L2, (L - org.telegram.messenger.g0.L(16.0f)) - eVar.getTextPaint().measureText(org.telegram.messenger.hd.N0(i7, null)));
        TLObject tLObject = this.W1;
        if (tLObject instanceof TLRPC.User) {
            str = org.telegram.messenger.p10.l((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else {
            str = "";
        }
        eVar.i(org.telegram.messenger.hd.a0(null, null, i7, TextUtils.ellipsize(str, eVar.getTextPaint(), max, TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            hi.e eVar = this.d2;
            if (eVar != null) {
                eVar.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29641r7, this.J0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
