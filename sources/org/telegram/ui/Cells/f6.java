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
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.oy0;
public final class f6 extends z implements is, org.telegram.ui.ActionBar.z5 {
    public final RectF A0;
    public final fp B0;
    public boolean C0;
    public z10 D0;
    public TLRPC.User E;
    public s10 E0;
    public TLRPC.Chat F;
    public boolean F0;
    public TLRPC.EncryptedChat G;
    public TextPaint G0;
    public org.telegram.messenger.d5 H;
    public TextPaint H0;
    public long I;
    public boolean I0;
    public String J;
    public final dc J0;
    public int K;
    public final Paint K0;
    public TLRPC.FileLocation L;
    public final RectF L0;
    public boolean M;
    public oy0 M0;
    public boolean N;
    public boolean N0;
    public final int O;
    public boolean O0;
    public int P;
    public ug.z0 P0;
    public int Q;
    public Drawable Q0;
    public StaticLayout R;
    public int R0;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public kc W;
    public StaticLayout f30239a0;
    public int f30240b0;
    public int f30241c0;
    public int f30242d0;
    public boolean f30243e0;
    public boolean f30244f;
    public int f30245f0;
    public final int f30246g0;
    public cd0 h;
    public int f30247h0;
    public int f30248i0;
    public StaticLayout f30249j0;
    public boolean[] f30250k0;
    public boolean f30251l0;
    public boolean m0;
    public CharSequence f30252n;
    public final org.telegram.ui.Components.u5 f30253n0;
    public boolean f30254o0;
    public long f30255p0;
    public boolean f30256q0;
    public final ImageReceiver f30257r;
    public int f30258r0;
    public final org.telegram.ui.Components.t8 f30259s;
    public StaticLayout f30260s0;
    public final org.telegram.ui.Components.e5 f30261t0;
    public final org.telegram.ui.Components.e5 f30262u0;
    public final fi.h7 f30263v0;
    public CharSequence f30264w;
    public final RectF f30265w0;
    public final org.telegram.ui.ActionBar.e6 f30266x;
    public oy0 f30267x0;
    public TLRPC.TL_sponsoredPeer f30268y;
    public Paint f30269y0;
    public final dc f30270z0;

    public f6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.O = m10.f24934t0;
        this.f30246g0 = org.telegram.messenger.g0.L(19.0f);
        this.f30253n0 = new org.telegram.ui.Components.u5(this, 0L, 350L, er.h);
        er erVar = er.f34420f;
        this.f30263v0 = new fi.h7(null, false);
        this.f30265w0 = new RectF();
        this.f30270z0 = new dc(this);
        this.A0 = new RectF();
        this.I0 = true;
        this.J0 = new dc(this);
        this.K0 = new Paint(1);
        this.L0 = new RectF();
        this.R0 = org.telegram.ui.ActionBar.q6.f29535b;
        this.f30266x = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f30257r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(23.0f));
        this.f30259s = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        fp fpVar = new fp(21, context, e6Var);
        this.B0 = fpVar;
        fpVar.b(-1, org.telegram.ui.ActionBar.j6.f28849d6, org.telegram.ui.ActionBar.j6.f28979k7);
        fpVar.setDrawUnchecked(false);
        fpVar.setDrawBackgroundAsArc(3);
        addView(fpVar);
        org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), this);
        this.f30261t0 = e5Var;
        e5Var.setCallback(this);
        org.telegram.ui.Components.e5 e5Var2 = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), this);
        this.f30262u0 = e5Var2;
        e5Var2.setCallback(this);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29263z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29069p6));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25514i4) {
            invalidate();
        } else if (i7 == ns.f25513i3) {
            TLRPC.User user = this.E;
            TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            int i11 = this.O;
            if (user != null) {
                if (this.m0) {
                    requirementtocontactpaidmessages = np.s1(i11).J2(this.E.f28200id);
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
                    org.telegram.messenger.d5 d5Var = this.H;
                    if (d5Var != null) {
                        if (this.m0 && d5Var.f23041m != null) {
                            requirementtocontactpaidmessages = np.s1(i11).J2(this.H.f23041m.f28200id);
                        }
                    } else {
                        return;
                    }
                }
            }
            boolean z10 = requirementtocontactpaidmessages instanceof TL_account.requirementToContactPremium;
            if (this.f30254o0 != z10 || this.f30255p0 != org.telegram.messenger.m5.k(requirementtocontactpaidmessages)) {
                this.f30254o0 = z10;
                this.f30255p0 = org.telegram.messenger.m5.k(requirementtocontactpaidmessages);
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
        this.f30257r.P();
        ns.e().c(this, ns.f25514i4);
        if (this.m0) {
            ns.e().c(this, ns.f25513i3);
        }
        this.f30262u0.a();
        this.f30261t0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30257r.R();
        ns.e().n(this, ns.f25514i4);
        if (this.m0) {
            ns.e().n(this, ns.f25513i3);
        }
        this.f30262u0.b();
        this.f30261t0.b();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.R;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.f30251l0) {
            sb2.append(", ");
            sb2.append(hd.M0(2131754739, null));
            sb2.append("\n");
        }
        if (this.f30260s0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f30260s0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        fp fpVar = this.B0;
        if (fpVar.f34663a.f32441q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(fpVar.f34663a.f32441q);
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
            fp fpVar = this.B0;
            if (fpVar != null) {
                if (hd.f24101a0) {
                    L = (i11 - i7) - org.telegram.messenger.g0.L(42.0f);
                } else {
                    L = org.telegram.messenger.g0.L(42.0f);
                }
                int L2 = org.telegram.messenger.g0.L(36.0f);
                fpVar.layout(L, L2, fpVar.getMeasuredWidth() + L, fpVar.getMeasuredHeight() + L2);
            }
            if (z10) {
                v();
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int L;
        fp fpVar = this.B0;
        if (fpVar != null) {
            fpVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.f30268y = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z10) {
        this.I0 = z10;
    }

    public void setOnSponsoredOptionsClick(s10 s10Var) {
        this.E0 = s10Var;
    }

    public void setOpenBotButton(boolean z10) {
        int i7;
        int i10;
        if (this.f30256q0 == z10) {
            return;
        }
        if (this.M0 == null) {
            this.M0 = new oy0(hd.M0(2131753020, null), 14.0f, org.telegram.messenger.g0.o());
        }
        if (z10) {
            i7 = org.telegram.messenger.g0.L(30.0f) + ((int) this.M0.f38105c);
        } else {
            i7 = 0;
        }
        boolean z11 = hd.f24101a0;
        if (z11) {
            i10 = i7;
        } else {
            i10 = 0;
        }
        if (z11) {
            i7 = 0;
        }
        setPadding(i10, 0, i7, 0);
        this.f30256q0 = z10;
        this.J0.c(false);
    }

    public void setRectangularAvatar(boolean z10) {
        this.O0 = z10;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.f30264w = charSequence;
        y(0);
    }

    @Override
    public final void updateColors() {
        int i7 = this.R0;
        int i10 = org.telegram.ui.ActionBar.q6.f29535b;
        if (i7 != i10) {
            this.R0 = i10;
            try {
                y(0);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (this.R != null && getMeasuredWidth() > 0) {
            v();
        }
    }

    public final void v() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f6.v():void");
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f30262u0 != drawable && this.f30261t0 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(boolean z10, boolean z11) {
        fp fpVar = this.B0;
        if (fpVar == null) {
            return;
        }
        fpVar.a(z10, z11);
    }

    public final void x(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        boolean z12;
        this.f30252n = charSequence;
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
                requirementToContact2 = np.s1(i7).J2(this.E.f28200id);
            }
            this.f30254o0 = requirementToContact2 instanceof TL_account.requirementToContactPremium;
            this.f30255p0 = org.telegram.messenger.m5.k(requirementToContact2);
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
            this.f30254o0 = false;
            this.f30255p0 = org.telegram.messenger.m5.k(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof org.telegram.messenger.d5) {
            org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) obj;
            this.H = d5Var;
            this.F = null;
            this.E = null;
            if (this.m0 && d5Var.f23041m != null) {
                requirementToContact = np.s1(i7).J2(this.H.f23041m.f28200id);
            }
            this.f30254o0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.f30255p0 = org.telegram.messenger.m5.k(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.G = encryptedChat;
        this.f30264w = charSequence2;
        this.f30243e0 = z10;
        this.M = z11;
        y(0);
    }

    public final void y(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f6.y(int):void");
    }

    public final void z(boolean z10, TLRPC.User user, TLRPC.Chat chat, boolean z11) {
        long j3;
        boolean z12 = hd.f24101a0;
        org.telegram.ui.Components.e5 e5Var = this.f30262u0;
        e5Var.f34190a = z12;
        boolean z13 = this.I0;
        org.telegram.ui.ActionBar.e6 e6Var = this.f30266x;
        if (z13 && z10) {
            e5Var.g(new fq(org.telegram.ui.ActionBar.j6.f28882f1, org.telegram.ui.ActionBar.j6.f28936i1, 0, 0), z11);
            e5Var.k(null);
        } else if (z13 && user != null && !this.M && org.telegram.messenger.m5.f(user.emoji_status) != 0) {
            e5Var.j(org.telegram.messenger.m5.f(user.emoji_status), z11);
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29263z9, e6Var)));
        } else if (this.I0 && chat != null && !this.M && org.telegram.messenger.m5.f(chat.emoji_status) != 0) {
            e5Var.j(org.telegram.messenger.m5.f(chat.emoji_status), z11);
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29263z9, e6Var)));
        } else {
            if (this.I0 && user != null && !this.M) {
                np.s1(this.O);
                if (np.B2(user)) {
                    e5Var.g((Drawable) ia.f.d().f15887f, z11);
                    e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29263z9, e6Var)));
                }
            }
            e5Var.g(null, z11);
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29263z9, e6Var)));
        }
        if (user != null) {
            j3 = org.telegram.messenger.m5.c(user);
        } else if (chat != null) {
            j3 = org.telegram.messenger.m5.c(chat);
        } else {
            j3 = 0;
        }
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.e5 e5Var2 = this.f30261t0;
        if (i7 != 0 && !this.M) {
            e5Var2.j(j3, z11);
        } else {
            e5Var2.g(null, z11);
        }
        e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29263z9, e6Var)));
    }
}
