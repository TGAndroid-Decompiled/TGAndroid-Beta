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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.wd0;
public final class k6 extends z implements us, org.telegram.ui.ActionBar.k6 {
    public final ep A0;
    public boolean B0;
    public q20 C0;
    public TLRPC.User D;
    public j20 D0;
    public TLRPC.Chat E;
    public boolean E0;
    public TLRPC.EncryptedChat F;
    public TextPaint F0;
    public org.telegram.messenger.f5 G;
    public TextPaint G0;
    public long H;
    public boolean H0;
    public String I;
    public final dc I0;
    public int J;
    public final Paint J0;
    public TLRPC.FileLocation K;
    public final RectF K0;
    public boolean L;
    public qz0 L0;
    public boolean M;
    public boolean M0;
    public final int N;
    public boolean N0;
    public int O;
    public kg.k1 O0;
    public int P;
    public Drawable P0;
    public StaticLayout Q;
    public int Q0;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public jc V;
    public StaticLayout W;
    public int f22123a0;
    public int f22124b0;
    public int f22125c0;
    public boolean f22126d0;
    public int f22127e0;
    public boolean f22128f;
    public final int f22129f0;
    public int f22130g0;
    public wd0 h;
    public int f22131h0;
    public StaticLayout f22132i0;
    public boolean[] f22133j0;
    public boolean f22134k0;
    public boolean f22135l0;
    public final org.telegram.ui.Components.t5 m0;
    public CharSequence f22136n;
    public boolean f22137n0;
    public long f22138o0;
    public boolean f22139p0;
    public int f22140q0;
    public final ImageReceiver f22141r;
    public StaticLayout f22142r0;
    public final org.telegram.ui.Components.r8 f22143s;
    public final org.telegram.ui.Components.d5 f22144s0;
    public final org.telegram.ui.Components.d5 f22145t0;
    public final th.t5 f22146u0;
    public final RectF f22147v0;
    public CharSequence f22148w;
    public qz0 f22149w0;
    public final org.telegram.ui.ActionBar.p6 f22150x;
    public Paint f22151x0;
    public TLRPC.TL_sponsoredPeer f22152y;
    public final dc f22153y0;
    public final RectF f22154z0;

    public k6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.N = d20.f15147s0;
        this.f22129f0 = org.telegram.messenger.i0.L(19.0f);
        this.m0 = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        gr grVar = gr.f26495f;
        this.f22146u0 = new th.t5(null, false);
        this.f22147v0 = new RectF();
        this.f22153y0 = new dc(this);
        this.f22154z0 = new RectF();
        this.H0 = true;
        this.I0 = new dc(this);
        this.J0 = new Paint(1);
        this.K0 = new RectF();
        this.Q0 = org.telegram.ui.ActionBar.a7.f20158b;
        this.f22150x = p6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f22141r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(23.0f));
        this.f22143s = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        ep epVar = new ep(21, context, p6Var);
        this.A0 = epVar;
        epVar.b(-1, org.telegram.ui.ActionBar.t6.f20929d6, org.telegram.ui.ActionBar.t6.f21059k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(3);
        addView(epVar);
        org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), this);
        this.f22144s0 = d5Var;
        d5Var.setCallback(this);
        org.telegram.ui.Components.d5 d5Var2 = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), this);
        this.f22145t0 = d5Var2;
        d5Var2.setCallback(this);
    }

    public final void A(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k6.A(int):void");
    }

    public final void B(boolean z10, TLRPC.User user, TLRPC.Chat chat, boolean z11) {
        long j10;
        boolean z12 = cd.X;
        org.telegram.ui.Components.d5 d5Var = this.f22145t0;
        d5Var.f25298a = z12;
        boolean z13 = this.H0;
        org.telegram.ui.ActionBar.p6 p6Var = this.f22150x;
        if (z13 && z10) {
            d5Var.g(new eq(org.telegram.ui.ActionBar.t6.f20961f1, org.telegram.ui.ActionBar.t6.f21015i1, 0, 0), z11);
            d5Var.k(null);
        } else if (z13 && user != null && !this.L && org.telegram.messenger.o5.f(user.emoji_status) != 0) {
            d5Var.j(org.telegram.messenger.o5.f(user.emoji_status), z11);
            d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21333z9, p6Var)));
        } else if (this.H0 && chat != null && !this.L && org.telegram.messenger.o5.f(chat.emoji_status) != 0) {
            d5Var.j(org.telegram.messenger.o5.f(chat.emoji_status), z11);
            d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21333z9, p6Var)));
        } else {
            if (this.H0 && user != null && !this.L) {
                vp.r1(this.N);
                if (vp.A2(user)) {
                    d5Var.g((Drawable) ea.f.d().f6476f, z11);
                    d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21333z9, p6Var)));
                }
            }
            d5Var.g(null, z11);
            d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21333z9, p6Var)));
        }
        if (user != null) {
            j10 = org.telegram.messenger.o5.c(user);
        } else if (chat != null) {
            j10 = org.telegram.messenger.o5.c(chat);
        } else {
            j10 = 0;
        }
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.d5 d5Var2 = this.f22144s0;
        if (i10 != 0 && !this.L) {
            d5Var2.j(j10, z11);
        } else {
            d5Var2.g(null, z11);
        }
        d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21333z9, p6Var)));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21333z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21311y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21152p6));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f19630i4) {
            invalidate();
        } else if (i10 == zs.f19629i3) {
            TLRPC.User user = this.D;
            TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            int i12 = this.N;
            if (user != null) {
                if (this.f22135l0) {
                    requirementtocontactpaidmessages = vp.r1(i12).H2(this.D.f19942id);
                }
            } else {
                TLRPC.Chat chat = this.E;
                if (chat != null) {
                    if (chat.send_paid_messages_stars != 0) {
                        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages2 = new TL_account.requirementToContactPaidMessages();
                        requirementtocontactpaidmessages2.stars_amount = chat.send_paid_messages_stars;
                        requirementtocontactpaidmessages = requirementtocontactpaidmessages2;
                    }
                } else {
                    org.telegram.messenger.f5 f5Var = this.G;
                    if (f5Var != null) {
                        if (this.f22135l0 && f5Var.f15517m != null) {
                            requirementtocontactpaidmessages = vp.r1(i12).H2(this.G.f15517m.f19942id);
                        }
                    } else {
                        return;
                    }
                }
            }
            boolean z10 = requirementtocontactpaidmessages instanceof TL_account.requirementToContactPremium;
            if (this.f22137n0 != z10 || this.f22138o0 != org.telegram.messenger.o5.k(requirementtocontactpaidmessages)) {
                this.f22137n0 = z10;
                this.f22138o0 = org.telegram.messenger.o5.k(requirementtocontactpaidmessages);
                invalidate();
            }
        }
    }

    public TLRPC.Chat getChat() {
        return this.E;
    }

    public long getDialogId() {
        return this.H;
    }

    public TLRPC.User getUser() {
        return this.D;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22141r.P();
        zs.e().c(this, zs.f19630i4);
        if (this.f22135l0) {
            zs.e().c(this, zs.f19629i3);
        }
        this.f22145t0.a();
        this.f22144s0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22141r.R();
        zs.e().n(this, zs.f19630i4);
        if (this.f22135l0) {
            zs.e().n(this, zs.f19629i3);
        }
        this.f22145t0.b();
        this.f22144s0.b();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.Q;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.f22134k0) {
            sb2.append(", ");
            sb2.append(cd.L0(2131754739, null));
            sb2.append("\n");
        }
        if (this.f22142r0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f22142r0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        ep epVar = this.A0;
        if (epVar.f25836a.f23919q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(epVar.f25836a.f23919q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int L;
        if (this.D != null || this.E != null || this.F != null || this.G != null) {
            ep epVar = this.A0;
            if (epVar != null) {
                if (cd.X) {
                    L = (i12 - i10) - org.telegram.messenger.i0.L(42.0f);
                } else {
                    L = org.telegram.messenger.i0.L(42.0f);
                }
                int L2 = org.telegram.messenger.i0.L(36.0f);
                epVar.layout(L, L2, epVar.getMeasuredWidth() + L, epVar.getMeasuredHeight() + L2);
            }
            if (z10) {
                x();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int L;
        ep epVar = this.A0;
        if (epVar != null) {
            epVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), 1073741824));
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.M0) {
            L = org.telegram.messenger.i0.L(56.0f);
        } else {
            L = org.telegram.messenger.i0.L(60.0f) + (this.M ? 1 : 0);
        }
        setMeasuredDimension(size, L);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.f22152y = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z10) {
        this.H0 = z10;
    }

    public void setOnSponsoredOptionsClick(j20 j20Var) {
        this.D0 = j20Var;
    }

    public void setOpenBotButton(boolean z10) {
        int i10;
        int i11;
        if (this.f22139p0 == z10) {
            return;
        }
        if (this.L0 == null) {
            this.L0 = new qz0(cd.L0(2131753020, null), 14.0f, org.telegram.messenger.i0.o());
        }
        if (z10) {
            i10 = org.telegram.messenger.i0.L(30.0f) + ((int) this.L0.f29774c);
        } else {
            i10 = 0;
        }
        boolean z11 = cd.X;
        if (z11) {
            i11 = i10;
        } else {
            i11 = 0;
        }
        if (z11) {
            i10 = 0;
        }
        setPadding(i11, 0, i10, 0);
        this.f22139p0 = z10;
        this.I0.c(false);
    }

    public void setRectangularAvatar(boolean z10) {
        this.N0 = z10;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.f22148w = charSequence;
        A(0);
    }

    @Override
    public final void updateColors() {
        int i10 = this.Q0;
        int i11 = org.telegram.ui.ActionBar.a7.f20158b;
        if (i10 != i11) {
            this.Q0 = i11;
            try {
                A(0);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } else if (this.Q != null && getMeasuredWidth() > 0) {
            x();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f22145t0 != drawable && this.f22144s0 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void x() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.k6.x():void");
    }

    public final void y(boolean z10, boolean z11) {
        ep epVar = this.A0;
        if (epVar == null) {
            return;
        }
        epVar.a(z10, z11);
    }

    public final void z(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        boolean z12;
        this.f22136n = charSequence;
        boolean z13 = obj instanceof TLRPC.User;
        int i10 = this.N;
        TL_account.RequirementToContact requirementToContact = null;
        TL_account.RequirementToContact requirementToContact2 = null;
        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
        requirementToContact = null;
        if (z13) {
            this.D = (TLRPC.User) obj;
            this.E = null;
            this.G = null;
            if (this.f22135l0) {
                requirementToContact2 = vp.r1(i10).H2(this.D.f19942id);
            }
            this.f22137n0 = requirementToContact2 instanceof TL_account.requirementToContactPremium;
            this.f22138o0 = org.telegram.messenger.o5.k(requirementToContact2);
            if (this.B0 && this.D.bot_has_main_app) {
                z12 = true;
            } else {
                z12 = false;
            }
            setOpenBotButton(z12);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.E = chat;
            this.D = null;
            this.G = null;
            if (chat.send_paid_messages_stars != 0) {
                requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
            }
            this.f22137n0 = false;
            this.f22138o0 = org.telegram.messenger.o5.k(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof org.telegram.messenger.f5) {
            org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) obj;
            this.G = f5Var;
            this.E = null;
            this.D = null;
            if (this.f22135l0 && f5Var.f15517m != null) {
                requirementToContact = vp.r1(i10).H2(this.G.f15517m.f19942id);
            }
            this.f22137n0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.f22138o0 = org.telegram.messenger.o5.k(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.F = encryptedChat;
        this.f22148w = charSequence2;
        this.f22126d0 = z10;
        this.L = z11;
        A(0);
    }
}
