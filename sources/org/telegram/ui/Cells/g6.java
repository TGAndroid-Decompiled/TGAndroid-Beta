package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.wy0;
public final class g6 extends z implements fs, org.telegram.ui.ActionBar.c6 {
    public final RectF A0;
    public final lp B0;
    public boolean C0;
    public w10 D0;
    public TLRPC.User E;
    public p10 E0;
    public TLRPC.Chat F;
    public boolean F0;
    public TLRPC.EncryptedChat G;
    public TextPaint G0;
    public org.telegram.messenger.f5 H;
    public TextPaint H0;
    public long I;
    public boolean I0;
    public String J;
    public final lc J0;
    public int K;
    public final Paint K0;
    public TLRPC.FileLocation L;
    public final RectF L0;
    public boolean M;
    public wy0 M0;
    public boolean N;
    public boolean N0;
    public final int O;
    public boolean O0;
    public int P;
    public ug.a1 P0;
    public int Q;
    public Drawable Q0;
    public StaticLayout R;
    public int R0;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public tc W;
    public StaticLayout f30760a0;
    public int f30761b0;
    public int f30762c0;
    public int f30763d0;
    public boolean f30764e0;
    public boolean f30765f;
    public int f30766f0;
    public final int f30767g0;
    public ld0 h;
    public int f30768h0;
    public int f30769i0;
    public StaticLayout f30770j0;
    public boolean[] f30771k0;
    public boolean f30772l0;
    public boolean m0;
    public CharSequence f30773n;
    public final org.telegram.ui.Components.c6 f30774n0;
    public boolean f30775o0;
    public long f30776p0;
    public boolean f30777q0;
    public final ImageReceiver f30778r;
    public int f30779r0;
    public final org.telegram.ui.Components.a9 f30780s;
    public StaticLayout f30781s0;
    public final org.telegram.ui.Components.m5 f30782t0;
    public final org.telegram.ui.Components.m5 f30783u0;
    public final fi.e7 f30784v0;
    public CharSequence f30785w;
    public final RectF f30786w0;
    public final org.telegram.ui.ActionBar.i6 f30787x;
    public wy0 f30788x0;
    public TLRPC.TL_sponsoredPeer f30789y;
    public Paint f30790y0;
    public final lc f30791z0;

    public g6(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.O = i10.f24637t0;
        this.f30767g0 = org.telegram.messenger.g0.L(19.0f);
        this.f30774n0 = new org.telegram.ui.Components.c6(this, 0L, 350L, kr.h);
        kr krVar = kr.f36858f;
        this.f30784v0 = new fi.e7(null, false);
        this.f30786w0 = new RectF();
        this.f30791z0 = new lc(this);
        this.A0 = new RectF();
        this.I0 = true;
        this.J0 = new lc(this);
        this.K0 = new Paint(1);
        this.L0 = new RectF();
        this.R0 = org.telegram.ui.ActionBar.u6.f30164b;
        this.f30787x = i6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f30778r = imageReceiver;
        imageReceiver.K0(org.telegram.messenger.g0.L(23.0f));
        this.f30780s = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        lp lpVar = new lp(21, context, i6Var);
        this.B0 = lpVar;
        lpVar.b(-1, org.telegram.ui.ActionBar.n6.f29451d6, org.telegram.ui.ActionBar.n6.f29581k7);
        lpVar.setDrawUnchecked(false);
        lpVar.setDrawBackgroundAsArc(3);
        addView(lpVar);
        org.telegram.ui.Components.m5 m5Var = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(20.0f), this);
        this.f30782t0 = m5Var;
        m5Var.setCallback(this);
        org.telegram.ui.Components.m5 m5Var2 = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(20.0f), this);
        this.f30783u0 = m5Var2;
        m5Var2.setCallback(this);
    }

    public final void A(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g6.A(int):void");
    }

    public final void B(boolean z10, TLRPC.User user, TLRPC.Chat chat, boolean z11) {
        long j3;
        boolean z12 = gd.f24314a0;
        org.telegram.ui.Components.m5 m5Var = this.f30783u0;
        m5Var.f37372a = z12;
        boolean z13 = this.I0;
        org.telegram.ui.ActionBar.i6 i6Var = this.f30787x;
        if (z13 && z10) {
            m5Var.g(new lq(org.telegram.ui.ActionBar.n6.f29484f1, org.telegram.ui.ActionBar.n6.f29538i1, 0, 0), z11);
            m5Var.k(null);
        } else if (z13 && user != null && !this.M && org.telegram.messenger.n5.f(user.emoji_status) != 0) {
            m5Var.j(org.telegram.messenger.n5.f(user.emoji_status), z11);
            m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29865z9, i6Var)));
        } else if (this.I0 && chat != null && !this.M && org.telegram.messenger.n5.f(chat.emoji_status) != 0) {
            m5Var.j(org.telegram.messenger.n5.f(chat.emoji_status), z11);
            m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29865z9, i6Var)));
        } else {
            if (this.I0 && user != null && !this.M) {
                mp.u1(this.O);
                if (mp.H2(user)) {
                    m5Var.g((Drawable) ia.e.d().f16291f, z11);
                    m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29865z9, i6Var)));
                }
            }
            m5Var.g(null, z11);
            m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29865z9, i6Var)));
        }
        if (user != null) {
            j3 = org.telegram.messenger.n5.c(user);
        } else if (chat != null) {
            j3 = org.telegram.messenger.n5.c(chat);
        } else {
            j3 = 0;
        }
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.m5 m5Var2 = this.f30782t0;
        if (i7 != 0 && !this.M) {
            m5Var2.j(j3, z11);
        } else {
            m5Var2.g(null, z11);
        }
        m5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29865z9, i6Var)));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29865z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29843y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29671p6));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25247l4) {
            invalidate();
        } else if (i7 == ks.f25241k3) {
            TLRPC.User user = this.E;
            TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            int i11 = this.O;
            if (user != null) {
                if (this.m0) {
                    requirementtocontactpaidmessages = mp.u1(i11).P2(this.E.f28641id);
                }
            } else {
                TLRPC.Chat chat = this.F;
                if (chat != null) {
                    if (chat.send_paid_messages_stars != 0) {
                        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages2 = new TL_account.requirementToContactPaidMessages();
                        requirementtocontactpaidmessages2.stars_amount = chat.send_paid_messages_stars;
                        requirementtocontactpaidmessages = requirementtocontactpaidmessages2;
                    }
                } else {
                    org.telegram.messenger.f5 f5Var = this.H;
                    if (f5Var != null) {
                        if (this.m0 && f5Var.f23958m != null) {
                            requirementtocontactpaidmessages = mp.u1(i11).P2(this.H.f23958m.f28641id);
                        }
                    } else {
                        return;
                    }
                }
            }
            boolean z10 = requirementtocontactpaidmessages instanceof TL_account.requirementToContactPremium;
            if (this.f30775o0 != z10 || this.f30776p0 != org.telegram.messenger.n5.k(requirementtocontactpaidmessages)) {
                this.f30775o0 = z10;
                this.f30776p0 = org.telegram.messenger.n5.k(requirementtocontactpaidmessages);
                invalidate();
            }
        }
    }

    public TLRPC.Chat getChat() {
        return this.F;
    }

    public long getDialogId() {
        return this.I;
    }

    public TLRPC.User getUser() {
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30778r.Q();
        ks.e().c(this, ks.f25247l4);
        if (this.m0) {
            ks.e().c(this, ks.f25241k3);
        }
        this.f30783u0.a();
        this.f30782t0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30778r.S();
        ks.e().n(this, ks.f25247l4);
        if (this.m0) {
            ks.e().n(this, ks.f25241k3);
        }
        this.f30783u0.b();
        this.f30782t0.b();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.R;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.f30772l0) {
            sb2.append(", ");
            sb2.append(gd.N0(2131754738, null));
            sb2.append("\n");
        }
        if (this.f30781s0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f30781s0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        lp lpVar = this.B0;
        if (lpVar.f37189a.f32938q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(lpVar.f37189a.f32938q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L;
        if (this.E != null || this.F != null || this.G != null || this.H != null) {
            lp lpVar = this.B0;
            if (lpVar != null) {
                if (gd.f24314a0) {
                    L = (i11 - i7) - org.telegram.messenger.g0.L(42.0f);
                } else {
                    L = org.telegram.messenger.g0.L(42.0f);
                }
                int L2 = org.telegram.messenger.g0.L(36.0f);
                lpVar.layout(L, L2, lpVar.getMeasuredWidth() + L, lpVar.getMeasuredHeight() + L2);
            }
            if (z10) {
                w();
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        lp lpVar = this.B0;
        if (lpVar != null) {
            lpVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.N0) {
            L = org.telegram.messenger.g0.L(56.0f);
        } else {
            L = org.telegram.messenger.g0.L(60.0f) + (this.N ? 1 : 0);
        }
        setMeasuredDimension(size, L);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.f30789y = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z10) {
        this.I0 = z10;
    }

    public void setOnSponsoredOptionsClick(p10 p10Var) {
        this.E0 = p10Var;
    }

    public void setOpenBotButton(boolean z10) {
        int i7;
        int i10;
        if (this.f30777q0 == z10) {
            return;
        }
        if (this.M0 == null) {
            this.M0 = new wy0(gd.N0(2131753008, null), 14.0f, org.telegram.messenger.g0.o());
        }
        if (z10) {
            i7 = org.telegram.messenger.g0.L(30.0f) + ((int) this.M0.f41763c);
        } else {
            i7 = 0;
        }
        boolean z11 = gd.f24314a0;
        if (z11) {
            i10 = i7;
        } else {
            i10 = 0;
        }
        if (z11) {
            i7 = 0;
        }
        setPadding(i10, 0, i7, 0);
        this.f30777q0 = z10;
        this.J0.c(false);
    }

    public void setRectangularAvatar(boolean z10) {
        this.O0 = z10;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.f30785w = charSequence;
        A(0);
    }

    @Override
    public final void updateColors() {
        int i7 = this.R0;
        int i10 = org.telegram.ui.ActionBar.u6.f30164b;
        if (i7 != i10) {
            this.R0 = i10;
            try {
                A(0);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (this.R != null && getMeasuredWidth() > 0) {
            w();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f30783u0 != drawable && this.f30782t0 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g6.w():void");
    }

    public final void x(boolean z10, boolean z11) {
        lp lpVar = this.B0;
        if (lpVar == null) {
            return;
        }
        lpVar.a(z10, z11);
    }

    public final void z(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        boolean z12;
        this.f30773n = charSequence;
        boolean z13 = obj instanceof TLRPC.User;
        int i7 = this.O;
        TL_account.RequirementToContact requirementToContact = null;
        TL_account.RequirementToContact requirementToContact2 = null;
        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
        requirementToContact = null;
        if (z13) {
            this.E = (TLRPC.User) obj;
            this.F = null;
            this.H = null;
            if (this.m0) {
                requirementToContact2 = mp.u1(i7).P2(this.E.f28641id);
            }
            this.f30775o0 = requirementToContact2 instanceof TL_account.requirementToContactPremium;
            this.f30776p0 = org.telegram.messenger.n5.k(requirementToContact2);
            if (this.C0 && this.E.bot_has_main_app) {
                z12 = true;
            } else {
                z12 = false;
            }
            setOpenBotButton(z12);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.F = chat;
            this.E = null;
            this.H = null;
            if (chat.send_paid_messages_stars != 0) {
                requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
            }
            this.f30775o0 = false;
            this.f30776p0 = org.telegram.messenger.n5.k(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof org.telegram.messenger.f5) {
            org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) obj;
            this.H = f5Var;
            this.F = null;
            this.E = null;
            if (this.m0 && f5Var.f23958m != null) {
                requirementToContact = mp.u1(i7).P2(this.H.f23958m.f28641id);
            }
            this.f30775o0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.f30776p0 = org.telegram.messenger.n5.k(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.G = encryptedChat;
        this.f30785w = charSequence2;
        this.f30764e0 = z10;
        this.M = z11;
        A(0);
    }
}
