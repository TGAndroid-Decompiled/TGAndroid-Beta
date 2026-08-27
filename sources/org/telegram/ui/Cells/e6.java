package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.p00;

public final class e6 extends a0 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.x5 {
    public TLRPC.Chat A;
    public boolean A0;
    public TLRPC.EncryptedChat B;
    public TextPaint B0;
    public ContactsController.Contact C;
    public TextPaint C0;
    public long D;
    public boolean D0;
    public String E;
    public final nc E0;
    public int F;
    public final Paint F0;
    public TLRPC.FileLocation G;
    public final RectF G0;
    public boolean H;
    public pz0 H0;
    public boolean I;
    public boolean I0;
    public final int J;
    public boolean J0;
    public int K;
    public ag.i2 K0;
    public int L;
    public Drawable L0;
    public StaticLayout M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public tc R;
    public StaticLayout S;
    public int T;
    public int U;
    public int V;
    public boolean W;

    public int f24268a0;

    public final int f24269b0;

    public int f24270c0;

    public int f24271d0;

    public StaticLayout f24272e0;

    public boolean f24273f;

    public boolean[] f24274f0;

    public boolean f24275g0;
    public ce0 h;

    public boolean f24276h0;

    public final org.telegram.ui.Components.y5 f24277i0;

    public boolean f24278j0;

    public long f24279k0;

    public boolean f24280l0;
    public int m0;

    public CharSequence f24281n;

    public StaticLayout f24282n0;

    public final org.telegram.ui.Components.i5 f24283o0;

    public final org.telegram.ui.Components.i5 f24284p0;

    public final jh.h7 f24285q0;

    public final ImageReceiver f24286r;

    public final RectF f24287r0;

    public final org.telegram.ui.Components.y8 f24288s;

    public pz0 f24289s0;

    public Paint f24290t0;

    public final nc f24291u0;
    public CharSequence v;

    public final RectF f24292v0;

    public final org.telegram.ui.ActionBar.c6 f24293w;

    public final bp f24294w0;

    public TLRPC.TL_sponsoredPeer f24295x;

    public boolean f24296x0;

    public TLRPC.User f24297y;

    public Utilities.Callback f24298y0;

    public Utilities.Callback2 f24299z0;

    public e6(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.J = UserConfig.selectedAccount;
        this.f24269b0 = AndroidUtilities.dp(19.0f);
        this.f24277i0 = new org.telegram.ui.Components.y5(this, 0L, 350L, er.h);
        er erVar = er.f28122f;
        this.f24285q0 = new jh.h7(null, false);
        this.f24287r0 = new RectF();
        this.f24291u0 = new nc(this);
        this.f24292v0 = new RectF();
        this.D0 = true;
        this.E0 = new nc(this);
        this.F0 = new Paint(1);
        this.G0 = new RectF();
        this.f24293w = c6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f24286r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(23.0f));
        this.f24288s = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        bp bpVar = new bp(context, 21, c6Var);
        this.f24294w0 = bpVar;
        bpVar.b(-1, org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.f23182k7);
        bpVar.setDrawUnchecked(false);
        bpVar.setDrawBackgroundAsArc(3);
        addView(bpVar);
        org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), this);
        this.f24283o0 = i5Var;
        i5Var.setCallback(this);
        org.telegram.ui.Components.i5 i5Var2 = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), this);
        this.f24284p0 = i5Var2;
        i5Var2.setCallback(this);
    }

    @Override
    public final void d() {
        if (this.M == null || getMeasuredWidth() <= 0) {
            return;
        }
        s();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            return;
        }
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.f24297y;
            TL_account.RequirementToContact requirementToContactIsUserContactBlocked = null;
            int i12 = this.J;
            if (user == null) {
                TLRPC.Chat chat = this.A;
                if (chat != null) {
                    requirementToContactIsUserContactBlocked = ChatObject.getRequirementToContact(chat);
                } else {
                    ContactsController.Contact contact = this.C;
                    if (contact == null) {
                        return;
                    }
                    if (this.f24276h0 && contact.user != null) {
                        requirementToContactIsUserContactBlocked = MessagesController.getInstance(i12).isUserContactBlocked(this.C.user.f22527id);
                    }
                }
            } else if (this.f24276h0) {
                requirementToContactIsUserContactBlocked = MessagesController.getInstance(i12).isUserContactBlocked(this.f24297y.f22527id);
            }
            if (this.f24278j0 == DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked) && this.f24279k0 == DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked)) {
                return;
            }
            this.f24278j0 = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
            this.f24279k0 = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
            invalidate();
        }
    }

    public TLRPC.Chat getChat() {
        return this.A;
    }

    public int[] getColorKeys() {
        return null;
    }

    public long getDialogId() {
        return this.D;
    }

    public TLRPC.User getUser() {
        return this.f24297y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24286r.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.f24276h0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.f24284p0.a();
        this.f24283o0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24286r.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.f24276h0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.f24284p0.b();
        this.f24283o0.b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        int iCeil;
        boolean z10;
        org.telegram.ui.Components.i5 i5Var;
        int lineRight;
        if (this.f24297y == null && this.A == null && this.B == null && this.C == null) {
            return;
        }
        boolean z11 = this.I;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24293w;
        if (z11) {
            Paint paintN = (!this.A0 || c6Var == null) ? null : c6Var.N("paintDivider");
            if (paintN == null) {
                paintN = org.telegram.ui.ActionBar.g6.f23175k0;
            }
            Paint paint = paintN;
            if (LocaleController.isRTL) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
            }
        } else {
            canvas2 = canvas;
        }
        if (this.N) {
            a0.p(this.O, this.P, org.telegram.ui.ActionBar.g6.f22995a1);
            org.telegram.ui.ActionBar.g6.f22995a1.draw(canvas2);
        }
        StaticLayout staticLayout = this.M;
        if (staticLayout != null) {
            boolean z12 = LocaleController.isRTL;
            org.telegram.ui.Components.i5 i5Var2 = this.f24283o0;
            if (z12) {
                iCeil = (int) (staticLayout.getLineRight(0) + this.K + AndroidUtilities.dp(6.0f));
            } else {
                if (staticLayout.getLineLeft(0) == 0.0f) {
                    iCeil = (this.K - AndroidUtilities.dp(3.0f)) - i5Var2.f29232s;
                } else {
                    f13 = 6.0f;
                    iCeil = (int) (((((double) (this.K + this.Q)) - Math.ceil(this.M.getLineWidth(0))) - ((double) AndroidUtilities.dp(3.0f))) - ((double) i5Var2.f29232s));
                }
                a0.q(i5Var2, iCeil, ((this.M.getHeight() - i5Var2.f29232s) / 2.0f) + this.L);
                i5Var2.draw(canvas2);
                canvas2.save();
                canvas2.translate(this.K, this.L);
                this.M.draw(canvas2);
                canvas2.restore();
                z10 = LocaleController.isRTL;
                i5Var = this.f24284p0;
                if (z10) {
                    lineRight = (int) (this.M.getLineRight(0) + this.K + AndroidUtilities.dp(f13));
                } else if (this.M.getLineLeft(0) == 0.0f) {
                    lineRight = (this.K - AndroidUtilities.dp(3.0f)) - i5Var.f29232s;
                } else {
                    lineRight = (int) (((((double) (this.K + this.Q)) - Math.ceil(this.M.getLineWidth(0))) - ((double) AndroidUtilities.dp(3.0f))) - ((double) i5Var.f29232s));
                }
                a0.q(i5Var, lineRight, ((this.M.getHeight() - i5Var.f29232s) / 2.0f) + this.L);
                i5Var.draw(canvas2);
            }
            f13 = 6.0f;
            a0.q(i5Var2, iCeil, ((this.M.getHeight() - i5Var2.f29232s) / 2.0f) + this.L);
            i5Var2.draw(canvas2);
            canvas2.save();
            canvas2.translate(this.K, this.L);
            this.M.draw(canvas2);
            canvas2.restore();
            z10 = LocaleController.isRTL;
            i5Var = this.f24284p0;
            if (z10) {
                lineRight = (int) (this.M.getLineRight(0) + this.K + AndroidUtilities.dp(f13));
            } else if (this.M.getLineLeft(0) == 0.0f) {
                lineRight = (this.K - AndroidUtilities.dp(3.0f)) - i5Var.f29232s;
            } else {
                lineRight = (int) (((((double) (this.K + this.Q)) - Math.ceil(this.M.getLineWidth(0))) - ((double) AndroidUtilities.dp(3.0f))) - ((double) i5Var.f29232s));
            }
            a0.q(i5Var, lineRight, ((this.M.getHeight() - i5Var.f29232s) / 2.0f) + this.L);
            i5Var.draw(canvas2);
        }
        if (this.f24295x == null || this.f24289s0 == null || this.f24290t0 == null) {
            f10 = 2.0f;
        } else {
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
            this.f24290t0.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, iV0));
            int iDp = AndroidUtilities.dp(12.66f) + ((int) this.f24289s0.l());
            int iDp2 = AndroidUtilities.dp(17.33f);
            int iDp3 = LocaleController.isRTL ? AndroidUtilities.dp(12.0f) : org.telegram.messenger.y1.B(12.0f, getWidth(), iDp);
            float f14 = iDp3;
            int i10 = this.L;
            f10 = 2.0f;
            RectF rectF = this.f24287r0;
            rectF.set(f14, i10, iDp3 + iDp, i10 + iDp2);
            rectF.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f));
            canvas2.save();
            float fA = this.f24291u0.a(0.1f);
            canvas2.scale(fA, fA, rectF.centerX(), rectF.centerY());
            canvas2.translate(f14, this.L);
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f15 = iDp2;
            rectF2.set(0.0f, 0.0f, iDp, f15);
            float f16 = f15 / 2.0f;
            canvas2.drawRoundRect(rectF2, f16, f16, this.f24290t0);
            this.f24289s0.c(AndroidUtilities.dp(6.33f), f16, 1.0f, iV0, canvas);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.f24282n0 != null) {
            canvas2.save();
            canvas2.translate(this.m0 + this.U, AndroidUtilities.dp(this.I0 ? 35.0f : 33.0f) + this.V);
            this.f24282n0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.f24272e0;
        int i11 = this.f24269b0;
        if (staticLayout2 != null) {
            int iDp4 = this.f24270c0 - AndroidUtilities.dp(5.5f);
            float fDp = AndroidUtilities.dp(11.0f) + iDp4 + this.f24271d0;
            float fDp2 = AndroidUtilities.dp(23.0f) + i11;
            RectF rectF3 = this.f24292v0;
            rectF3.set(iDp4, i11, fDp, fDp2);
            float f17 = AndroidUtilities.density * 11.5f;
            f11 = 23.0f;
            f12 = 4.0f;
            canvas2.drawRoundRect(rectF3, f17, f17, MessagesController.getInstance(this.J).isDialogMuted(this.D, 0L) ? org.telegram.ui.ActionBar.g6.f23417y0 : org.telegram.ui.ActionBar.g6.f23385w0);
            canvas2.save();
            canvas2.translate(this.f24270c0, AndroidUtilities.dp(4.0f) + i11);
            this.f24272e0.draw(canvas2);
            canvas2.restore();
        } else {
            f11 = 23.0f;
            f12 = 4.0f;
        }
        if (this.S != null) {
            tc tcVar = this.R;
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U8, false);
            int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.W8, false);
            tcVar.f32734g.setColor(iW0);
            z zVar = tcVar.f32732e;
            if (zVar != null) {
                org.telegram.ui.ActionBar.g6.B1(zVar, iW1, true);
            }
            RectF rectF4 = AndroidUtilities.rectTmp;
            int i12 = this.T;
            rectF4.set(i12, i11, this.S.getWidth() + i12, AndroidUtilities.dp(f11) + i11);
            rectF4.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(f12));
            tc tcVar2 = this.R;
            tcVar2.f32735i = false;
            tcVar2.f32731c = 0;
            tcVar2.a(rectF4);
            tc tcVar3 = this.R;
            tcVar3.f32740n = true;
            tcVar3.c(canvas2, tcVar3.f32734g);
            z zVar2 = tcVar3.f32732e;
            if (zVar2 != null) {
                zVar2.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate(this.T, AndroidUtilities.dp(f12) + i11);
            this.S.draw(canvas2);
            canvas2.restore();
        }
        boolean z13 = this.f24273f;
        ImageReceiver imageReceiver = this.f24286r;
        if (!z13) {
            TLRPC.Chat chat = this.A;
            jh.h7 h7Var = this.f24285q0;
            if (chat == null || !chat.monoforum) {
                TLRPC.User user = this.f24297y;
                if (user != null) {
                    jh.l7.h(user.f22527id, canvas2, imageReceiver, h7Var);
                } else if (chat != null) {
                    if (ChatObject.isCommunity(chat)) {
                        Drawable drawable = org.telegram.ui.ActionBar.g6.S0;
                        RectF rectF5 = h7Var.F;
                        RectF rectF6 = h7Var.F;
                        gf.s.a(canvas2, drawable, rectF5.centerX(), rectF6.centerY(), rectF6.width());
                    }
                    jh.l7.h(-this.A.f22380id, canvas2, imageReceiver, h7Var);
                } else {
                    imageReceiver.setImageCoords(h7Var.F);
                    imageReceiver.draw(canvas2);
                }
            } else {
                if (this.h == null) {
                    this.h = new ce0();
                }
                ce0 ce0Var = this.h;
                RectF rectF7 = h7Var.F;
                RectF rectF8 = h7Var.F;
                ce0Var.a((int) rectF7.centerX(), (int) rectF8.centerY(), (int) (rectF8.width() / f10));
                canvas2.save();
                canvas2.clipPath(this.h);
                imageReceiver.setImageCoords(rectF8);
                imageReceiver.draw(canvas2);
                canvas2.restore();
            }
        }
        float fE = this.f24277i0.e(this.f24278j0);
        if (fE > 0.0f) {
            float centerY = imageReceiver.getCenterY() + AndroidUtilities.dp(14.0f);
            float centerX = imageReceiver.getCenterX() + AndroidUtilities.dp(16.0f);
            canvas2.save();
            org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
            canvas2.drawCircle(centerX, centerY, AndroidUtilities.dp(11.33f) * fE, org.telegram.ui.ActionBar.g6.f23333t0);
            if (this.K0 == null) {
                this.K0 = new ag.i2(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, this.f24293w);
            }
            this.K0.d((int) (centerX - AndroidUtilities.dp(10.0f)), 0.0f, (int) (centerY - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + centerX), 0.0f, (int) (AndroidUtilities.dp(10.0f) + centerY));
            canvas2.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f) * fE, this.K0.f458f);
            if (this.L0 == null) {
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.L0 = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable2 = this.L0;
            drawable2.setBounds((int) (centerX - (((drawable2.getIntrinsicWidth() / f10) * 0.875f) * fE)), (int) (centerY - (((this.L0.getIntrinsicHeight() / f10) * 0.875f) * fE)), (int) (((this.L0.getIntrinsicWidth() / f10) * 0.875f * fE) + centerX), (int) (((this.L0.getIntrinsicHeight() / f10) * 0.875f * fE) + centerY));
            this.L0.setAlpha((int) (fE * 255.0f));
            this.L0.draw(canvas2);
            canvas2.restore();
        }
        if (!this.f24280l0 || this.H0 == null) {
            return;
        }
        float fDp3 = AndroidUtilities.dp(28.0f) + this.H0.f31697c;
        float fDp4 = LocaleController.isRTL ? AndroidUtilities.dp(15.0f) : (getWidth() - fDp3) - AndroidUtilities.dp(15.0f);
        float fDp5 = AndroidUtilities.dp(28.0f);
        int iW2 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        Paint paint2 = this.F0;
        paint2.setColor(iW2);
        float height = (getHeight() + fDp5) / f10;
        RectF rectF9 = this.G0;
        rectF9.set(fDp4, (getHeight() - fDp5) / f10, fDp3 + fDp4, height);
        canvas2.save();
        float fA2 = this.E0.a(0.06f);
        canvas2.scale(fA2, fA2, rectF9.centerX(), rectF9.centerY());
        canvas2.drawRoundRect(rectF9, rectF9.height() / f10, rectF9.height() / f10, paint2);
        this.H0.c(AndroidUtilities.dp(14.0f) + fDp4, getHeight() / f10, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.M;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.f24275g0) {
            sb2.append(", ");
            rl.j(R.string.AccDescrVerified, "\n", sb2);
        }
        if (this.f24282n0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f24282n0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        bp bpVar = this.f24294w0;
        if (bpVar.f27188a.f26309q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(bpVar.f27188a.f26309q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f24297y == null && this.A == null && this.B == null && this.C == null) {
            return;
        }
        bp bpVar = this.f24294w0;
        if (bpVar != null) {
            int iDp = LocaleController.isRTL ? (i12 - i10) - AndroidUtilities.dp(42.0f) : AndroidUtilities.dp(42.0f);
            int iDp2 = AndroidUtilities.dp(36.0f);
            bpVar.layout(iDp, iDp2, bpVar.getMeasuredWidth() + iDp, bpVar.getMeasuredHeight() + iDp2);
        }
        if (z10) {
            s();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        bp bpVar = this.f24294w0;
        if (bpVar != null) {
            bpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.I0 ? AndroidUtilities.dp(56.0f) : AndroidUtilities.dp(60.0f) + (this.I ? 1 : 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tc tcVar;
        if (this.f24280l0 && this.f24298y0 != null && this.f24297y != null) {
            boolean zContains = this.G0.contains(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            nc ncVar = this.E0;
            if (action == 0 || motionEvent.getAction() == 2) {
                ncVar.c(zContains);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (ncVar.h) {
                        this.f24298y0.run(this.f24297y);
                    }
                    ncVar.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    ncVar.c(false);
                    return true;
                }
            }
            if (!zContains && !ncVar.h) {
                if (this.f24297y != null) {
                }
            }
        } else if (this.f24295x != null && this.f24299z0 != null) {
            boolean zContains2 = this.f24287r0.contains(motionEvent.getX(), motionEvent.getY());
            int action2 = motionEvent.getAction();
            nc ncVar2 = this.f24291u0;
            if (action2 == 0 || motionEvent.getAction() == 2) {
                ncVar2.c(zContains2);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (ncVar2.h) {
                        this.f24299z0.run(this, this.f24295x);
                    }
                    ncVar2.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    ncVar2.c(false);
                    return true;
                }
            }
            if (!zContains2 && !ncVar2.h) {
                return this.f24297y != null ? super.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
            }
        } else if (((this.f24297y != null && this.A == null) || !this.f24285q0.a(motionEvent, this)) && ((tcVar = this.R) == null || !tcVar.b(motionEvent))) {
        }
        return true;
    }

    public final void s() {
        TLRPC.Chat chat;
        TLRPC.User user;
        TextPaint textPaint;
        int measuredWidth;
        float f10;
        float f11;
        CharSequence string;
        TLRPC.UserStatus userStatus;
        int i10;
        int iDp;
        float f12;
        this.N = false;
        this.f24275g0 = false;
        TLRPC.EncryptedChat encryptedChat = this.B;
        float f13 = 11.0f;
        int i11 = this.J;
        if (encryptedChat != null) {
            this.N = true;
            this.D = DialogObject.makeEncryptedDialogId(encryptedChat.f22388id);
            if (LocaleController.isRTL) {
                this.O = (getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 2)) - org.telegram.ui.ActionBar.g6.f22995a1.getIntrinsicWidth();
                this.K = AndroidUtilities.dp(11.0f);
            } else {
                this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.K = org.telegram.ui.ActionBar.g6.f22995a1.getIntrinsicWidth() + AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
            }
            this.P = AndroidUtilities.dp(22.0f);
            w(false, null, null, false);
        } else {
            TLRPC.Chat chat2 = this.A;
            if (chat2 != null) {
                this.D = -chat2.f22380id;
                this.f24275g0 = chat2.verified;
                if (chat2.monoforum && (chat = MessagesController.getInstance(i11).getChat(Long.valueOf(this.A.linked_monoforum_id))) != null) {
                    this.f24275g0 = chat.verified;
                }
                if (LocaleController.isRTL) {
                    this.K = AndroidUtilities.dp(11.0f);
                } else {
                    this.K = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                w(this.f24275g0, null, this.A, false);
            } else {
                TLRPC.User user2 = this.f24297y;
                if (user2 != null) {
                    this.D = user2.f22527id;
                    if (LocaleController.isRTL) {
                        this.K = AndroidUtilities.dp(11.0f);
                    } else {
                        this.K = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    }
                    this.P = AndroidUtilities.dp(21.0f);
                    this.f24275g0 = this.f24297y.verified;
                    if (!this.H) {
                        MessagesController.getInstance(i11).isPremiumUser(this.f24297y);
                    }
                    w(this.f24275g0, this.f24297y, null, false);
                } else if (this.C != null) {
                    this.D = 0L;
                    if (LocaleController.isRTL) {
                        this.K = AndroidUtilities.dp(11.0f);
                    } else {
                        this.K = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    }
                    if (this.R == null) {
                        tc tcVar = new tc(this);
                        this.R = tcVar;
                        tcVar.h = new g(this, 5);
                    }
                }
            }
        }
        if (LocaleController.isRTL) {
            this.m0 = AndroidUtilities.dp(11.0f);
        } else {
            this.m0 = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
        }
        if (this.f24295x != null) {
            if (this.f24289s0 == null) {
                SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(LocaleController.getString(R.string.SearchAd)).append((CharSequence) " i");
                cq cqVar = new cq(R.drawable.ic_ab_other, 0);
                cqVar.setScale(0.55f, 0.55f);
                cqVar.spaceScaleX = 0.7f;
                cqVar.translate(-AndroidUtilities.dp(2.0f), 0.0f);
                spannableStringBuilderAppend.setSpan(cqVar, spannableStringBuilderAppend.length() - 1, spannableStringBuilderAppend.length(), 33);
                this.f24289s0 = new pz0(spannableStringBuilderAppend, 12.0f, null);
            }
            if (this.f24290t0 == null) {
                this.f24290t0 = new Paint(1);
            }
        }
        CharSequence charSequence = this.f24281n;
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            charSequence2 = null;
        }
        TLRPC.Chat chat3 = this.A;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24293w;
        CharSequence charSequenceRemoveRTL = charSequence2;
        if (chat3 != null) {
            if (chat3.monoforum) {
                TLRPC.Chat chat4 = MessagesController.getInstance(i11).getChat(Long.valueOf(this.A.linked_monoforum_id));
                if (chat4 != null) {
                    charSequenceRemoveRTL = charSequence2;
                    charSequenceRemoveRTL = charSequence2;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.escape(chat4.title));
                    spannableStringBuilder.append((CharSequence) " ");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MonoforumSpan));
                    spannableStringBuilder.setSpan(new p00(LocaleController.getString(R.string.MonoforumSpan), org.telegram.ui.ActionBar.g6.f23423y6, c6Var), length, spannableStringBuilder.length(), 33);
                    charSequenceRemoveRTL = spannableStringBuilder;
                } else if (charSequence2 == null) {
                    charSequenceRemoveRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.A.title));
                }
            } else if (charSequence2 == null) {
                charSequenceRemoveRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat3.title));
            }
        } else if (charSequence2 == null && (user = this.f24297y) != null) {
            charSequenceRemoveRTL = charSequence2;
            charSequenceRemoveRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user)));
        }
        charSequenceRemoveRTL = charSequence2;
        CharSequence charSequenceReplaceNewLines = AndroidUtilities.replaceNewLines(charSequenceRemoveRTL);
        if (TextUtils.isEmpty(charSequenceReplaceNewLines)) {
            TLRPC.User user3 = this.f24297y;
            charSequenceReplaceNewLines = (user3 == null || TextUtils.isEmpty(user3.phone)) ? LocaleController.getString(R.string.HiddenName) : org.telegram.messenger.y1.k(new StringBuilder("+"), this.f24297y.phone, oe.b.c());
        }
        if (this.A0) {
            if (this.B0 == null) {
                TextPaint textPaint2 = new TextPaint(1);
                this.B0 = textPaint2;
                textPaint2.setTypeface(AndroidUtilities.bold());
            }
            this.B0.setTextSize(AndroidUtilities.dp(this.I0 ? 15.0f : 16.0f));
            if (this.B != null) {
                this.B0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Z8, c6Var));
            } else {
                this.B0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.X8, c6Var));
            }
            textPaint = this.B0;
        } else {
            textPaint = this.B != null ? org.telegram.ui.ActionBar.g6.E0 : org.telegram.ui.ActionBar.g6.D0;
        }
        TextPaint textPaint3 = textPaint;
        if (LocaleController.isRTL) {
            measuredWidth = (getMeasuredWidth() - this.K) - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            this.Q = measuredWidth;
        } else {
            measuredWidth = (getMeasuredWidth() - this.K) - AndroidUtilities.dp(14.0f);
            this.Q = measuredWidth;
        }
        if (this.N) {
            this.Q -= org.telegram.ui.ActionBar.g6.f22995a1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
        }
        if (this.f24295x != null) {
            int iDp2 = AndroidUtilities.dp(20.66f) + ((int) this.f24289s0.f31697c);
            this.Q -= iDp2;
            if (LocaleController.isRTL) {
                this.K += iDp2;
            }
        }
        if (this.C != null) {
            int iMeasureText = (int) (org.telegram.ui.ActionBar.g6.L0.measureText(LocaleController.getString(R.string.Invite)) + 1.0f);
            this.S = new StaticLayout(LocaleController.getString(R.string.Invite), org.telegram.ui.ActionBar.g6.L0, iMeasureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (LocaleController.isRTL) {
                this.T = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(19.0f);
                this.K += iMeasureText;
                this.m0 += iMeasureText;
            } else {
                this.T = ((getMeasuredWidth() - iMeasureText) - AndroidUtilities.dp(19.0f)) - AndroidUtilities.dp(16.0f);
            }
            this.Q = rl.u(32.0f, iMeasureText, this.Q);
        }
        this.Q -= getPaddingRight() + getPaddingLeft();
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.W) {
            int dialogUnreadCount = MessagesController.getInstance(i11).getDialogUnreadCount((TLRPC.Dialog) MessagesController.getInstance(i11).dialogs_dict.f(this.D));
            if (dialogUnreadCount != 0) {
                this.f24268a0 = dialogUnreadCount;
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dialogUnreadCount);
                String string2 = sb2.toString();
                f10 = 0.0f;
                f11 = 12.0f;
                this.f24271d0 = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(string2)));
                this.f24272e0 = new StaticLayout(string2, org.telegram.ui.ActionBar.g6.L0, this.f24271d0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int iDp3 = AndroidUtilities.dp(18.0f) + this.f24271d0;
                this.Q -= iDp3;
                paddingRight -= iDp3;
                if (LocaleController.isRTL) {
                    this.f24270c0 = AndroidUtilities.dp(19.0f);
                    this.K += iDp3;
                    this.m0 += iDp3;
                } else {
                    this.f24270c0 = (getMeasuredWidth() - this.f24271d0) - AndroidUtilities.dp(19.0f);
                }
            } else {
                f10 = 0.0f;
                f11 = 12.0f;
                this.f24268a0 = 0;
                this.f24272e0 = null;
            }
        } else {
            f10 = 0.0f;
            f11 = 12.0f;
            this.f24268a0 = 0;
            this.f24272e0 = null;
        }
        int i12 = paddingRight;
        org.telegram.ui.Components.i5 i5Var = this.f24283o0;
        boolean zD = i5Var.d();
        int i13 = i5Var.f29232s;
        if (!zD) {
            if (LocaleController.isRTL) {
                this.Q -= i13;
            } else {
                this.K += i13;
            }
        }
        org.telegram.ui.Components.i5 i5Var2 = this.f24284p0;
        if (!i5Var2.d() && !LocaleController.isRTL) {
            this.Q -= i5Var2.f29232s;
        }
        if (this.Q < 0) {
            this.Q = 0;
        }
        float fDp = this.Q - AndroidUtilities.dp(f11);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence charSequenceEllipsize = TextUtils.ellipsize(charSequenceReplaceNewLines, textPaint3, fDp, truncateAt);
        if (charSequenceEllipsize != null) {
            charSequenceEllipsize = Emoji.replaceEmoji(charSequenceEllipsize, textPaint3.getFontMetricsInt(), false);
        }
        CharSequence charSequence3 = charSequenceEllipsize;
        int i14 = this.Q;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.M = new StaticLayout(charSequence3, textPaint3, i14, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint4 = org.telegram.ui.ActionBar.g6.Q0;
        TLRPC.Chat chat5 = this.A;
        if (chat5 == null || this.v != null) {
            CharSequence userStatus2 = this.v;
            if (userStatus2 == null) {
                TLRPC.User user4 = this.f24297y;
                if (user4 == null) {
                    string = null;
                } else if (MessagesController.isSupportUser(user4)) {
                    string = LocaleController.getString(R.string.SupportStatus);
                } else {
                    TLRPC.User user5 = this.f24297y;
                    boolean z10 = user5.bot;
                    if (z10 && (i10 = user5.bot_active_users) != 0) {
                        string = LocaleController.formatPluralStringSpaced("BotUsersShort", i10);
                    } else if (z10) {
                        string = LocaleController.getString(R.string.Bot);
                    } else {
                        long j10 = user5.f22527id;
                        if (j10 == 489000) {
                            string = LocaleController.getString(R.string.VerifyCodesNotifications);
                        } else if (UserObject.isService(j10)) {
                            string = LocaleController.getString(R.string.ServiceNotifications);
                        } else {
                            if (this.f24274f0 == null) {
                                this.f24274f0 = new boolean[1];
                            }
                            boolean[] zArr = this.f24274f0;
                            zArr[0] = false;
                            userStatus2 = LocaleController.formatUserStatus(i11, this.f24297y, zArr);
                            if (this.f24274f0[0]) {
                                textPaint4 = org.telegram.ui.ActionBar.g6.P0;
                            }
                            TLRPC.User user6 = this.f24297y;
                            if (user6 == null || (user6.f22527id != UserConfig.getInstance(i11).getClientUserId() && ((userStatus = this.f24297y.status) == null || userStatus.expires <= ConnectionsManager.getInstance(i11).getCurrentTime()))) {
                                string = userStatus2;
                            } else {
                                textPaint4 = org.telegram.ui.ActionBar.g6.P0;
                                string = LocaleController.getString(R.string.Online);
                            }
                        }
                    }
                }
            } else {
                string = userStatus2;
            }
            if (this.H || UserObject.isReplyUser(this.f24297y)) {
                this.L = AndroidUtilities.dp(20.0f);
                string = null;
            }
        } else {
            if (ChatObject.isCommunity(chat5)) {
                string = LocaleController.getString(R.string.Community).toLowerCase();
            } else if (ChatObject.isChannelAndNotMegaGroup(this.A)) {
                TLRPC.Chat chat6 = this.A;
                int i15 = chat6.participants_count;
                if (i15 != 0) {
                    string = LocaleController.formatPluralStringComma("Subscribers", i15);
                } else {
                    string = !ChatObject.isPublic(chat6) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
                }
            } else {
                TLRPC.Chat chat7 = this.A;
                int i16 = chat7.participants_count;
                if (i16 != 0) {
                    string = LocaleController.formatPluralStringComma("Members", i16);
                } else if (chat7.has_geo) {
                    string = LocaleController.getString(R.string.MegaLocation);
                } else if (ChatObject.isMonoForum(chat7)) {
                    string = LocaleController.getString(R.string.MonoforumMessages);
                } else {
                    string = !ChatObject.isPublic(this.A) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
                }
            }
            this.L = AndroidUtilities.dp(19.0f);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = new TextPaint(1);
            }
            this.C0.setTextSize(AndroidUtilities.dp(this.I0 ? 13.0f : 15.0f));
            if (textPaint4 == org.telegram.ui.ActionBar.g6.Q0) {
                this.C0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
            } else if (textPaint4 == org.telegram.ui.ActionBar.g6.P0) {
                this.C0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p6, c6Var));
            }
            textPaint4 = this.C0;
        }
        if (TextUtils.isEmpty(string)) {
            this.L = AndroidUtilities.dp(20.0f);
            this.f24282n0 = null;
        } else {
            this.f24282n0 = new StaticLayout(TextUtils.ellipsize(string, textPaint4, i12 - AndroidUtilities.dp(f11), truncateAt), textPaint4, i12, alignment, 1.0f, 0.0f, false);
            this.L = AndroidUtilities.dp(9.0f);
            this.P -= AndroidUtilities.dp(10.0f);
        }
        if (LocaleController.isRTL) {
            iDp = (getMeasuredWidth() - AndroidUtilities.dp(57.0f)) - getPaddingRight();
        } else {
            if (this.I0) {
                f13 = 14.0f;
            } else if (this.J0) {
                f13 = 15.0f;
            }
            iDp = AndroidUtilities.dp(f13) + getPaddingLeft();
        }
        RectF rectF = this.f24285q0.F;
        float f14 = iDp;
        float fDp2 = AndroidUtilities.dp(this.I0 ? 6.0f : 7.0f);
        if (this.I0) {
            f12 = 44.0f;
        } else {
            f12 = this.J0 ? 42.0f : 46.0f;
        }
        rectF.set(f14, fDp2, AndroidUtilities.dp(f12) + iDp, AndroidUtilities.dp(this.I0 ? 44.0f : 46.0f) + AndroidUtilities.dp(this.I0 ? 6.0f : 7.0f));
        if (LocaleController.isRTL) {
            if (this.M.getLineCount() > 0 && this.M.getLineLeft(0) == f10) {
                double dCeil = Math.ceil(this.M.getLineWidth(0));
                double d = this.Q;
                if (dCeil < d) {
                    this.K = (int) ((d - dCeil) + ((double) this.K));
                }
            }
            StaticLayout staticLayout = this.f24282n0;
            if (staticLayout != null && staticLayout.getLineCount() > 0 && this.f24282n0.getLineLeft(0) == f10) {
                double dCeil2 = Math.ceil(this.f24282n0.getLineWidth(0));
                double d10 = i12;
                if (dCeil2 < d10) {
                    this.m0 = (int) ((d10 - dCeil2) + ((double) this.m0));
                }
            }
        } else {
            if (this.M.getLineCount() > 0 && this.M.getLineRight(0) == this.Q) {
                double dCeil3 = Math.ceil(this.M.getLineWidth(0));
                double d11 = this.Q;
                if (dCeil3 < d11) {
                    this.K = (int) (((double) this.K) - (d11 - dCeil3));
                }
            }
            StaticLayout staticLayout2 = this.f24282n0;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.f24282n0.getLineRight(0) == i12) {
                double dCeil4 = Math.ceil(this.f24282n0.getLineWidth(0));
                double d12 = i12;
                if (dCeil4 < d12) {
                    this.m0 = (int) (((double) this.m0) - (d12 - dCeil4));
                }
            }
        }
        this.K = getPaddingLeft() + this.K;
        this.m0 = getPaddingLeft() + this.m0;
        this.O = getPaddingLeft() + this.O;
        if (this.I0) {
            this.K = AndroidUtilities.dp(1.0f) + this.K;
            this.L = AndroidUtilities.dp(1.0f) + this.L;
        }
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.f24295x = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z10) {
        this.D0 = z10;
    }

    public void setOnSponsoredOptionsClick(Utilities.Callback2<e6, TLRPC.TL_sponsoredPeer> callback2) {
        this.f24299z0 = callback2;
    }

    public void setOpenBotButton(boolean z10) {
        int iDp;
        if (this.f24280l0 == z10) {
            return;
        }
        if (this.H0 == null) {
            this.H0 = new pz0(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        if (z10) {
            iDp = AndroidUtilities.dp(30.0f) + ((int) this.H0.f31697c);
        } else {
            iDp = 0;
        }
        boolean z11 = LocaleController.isRTL;
        int i10 = z11 ? iDp : 0;
        if (z11) {
            iDp = 0;
        }
        setPadding(i10, 0, iDp, 0);
        this.f24280l0 = z10;
        this.E0.c(false);
    }

    public void setRectangularAvatar(boolean z10) {
        this.J0 = z10;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.v = charSequence;
        v(0);
    }

    public final void t(boolean z10, boolean z11) {
        bp bpVar = this.f24294w0;
        if (bpVar == null) {
            return;
        }
        bpVar.a(z10, z11);
    }

    public final void u(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.f24281n = charSequence;
        boolean z12 = obj instanceof TLRPC.User;
        int i10 = this.J;
        TL_account.RequirementToContact requirementToContactIsUserContactBlocked = null;
        if (z12) {
            this.f24297y = (TLRPC.User) obj;
            this.A = null;
            this.C = null;
            requirementToContactIsUserContactBlocked = this.f24276h0 ? MessagesController.getInstance(i10).isUserContactBlocked(this.f24297y.f22527id) : null;
            this.f24278j0 = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
            this.f24279k0 = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
            setOpenBotButton(this.f24296x0 && this.f24297y.bot_has_main_app);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.A = chat;
            this.f24297y = null;
            this.C = null;
            TL_account.RequirementToContact requirementToContact = ChatObject.getRequirementToContact(chat);
            this.f24278j0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.f24279k0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            setOpenBotButton(false);
        } else if (obj instanceof ContactsController.Contact) {
            ContactsController.Contact contact = (ContactsController.Contact) obj;
            this.C = contact;
            this.A = null;
            this.f24297y = null;
            if (this.f24276h0 && contact.user != null) {
                requirementToContactIsUserContactBlocked = MessagesController.getInstance(i10).isUserContactBlocked(this.C.user.f22527id);
            }
            this.f24278j0 = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
            this.f24279k0 = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.B = encryptedChat;
        this.v = charSequence2;
        this.W = z10;
        this.H = z11;
        v(0);
    }

    public final void v(int i10) {
        Drawable drawable;
        TLRPC.FileLocation fileLocation;
        float f10;
        int iDp;
        TLRPC.Dialog dialog;
        String strI;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.FileLocation fileLocation2;
        Drawable drawable2;
        TLRPC.User user3 = this.f24297y;
        ImageReceiver imageReceiver = this.f24286r;
        int i11 = this.J;
        org.telegram.ui.Components.y8 y8Var = this.f24288s;
        TLRPC.FileLocation fileLocation3 = null;
        if (user3 != null) {
            y8Var.m(i11, user3);
            if (UserObject.isReplyUser(this.f24297y)) {
                y8Var.g(12);
                imageReceiver.setImage(null, null, y8Var, null, null, 0);
            } else if (this.H) {
                y8Var.g(1);
                imageReceiver.setImage(null, null, y8Var, null, null, 0);
            } else {
                TLRPC.User user4 = this.f24297y;
                TLRPC.UserProfilePhoto userProfilePhoto = user4.photo;
                if (userProfilePhoto != null) {
                    fileLocation3 = userProfilePhoto.photo_small;
                    BitmapDrawable bitmapDrawable = userProfilePhoto.strippedBitmap;
                    if (bitmapDrawable != null) {
                        drawable2 = bitmapDrawable;
                    } else {
                        drawable2 = y8Var;
                    }
                } else {
                    drawable2 = y8Var;
                }
                fileLocation = fileLocation3;
                imageReceiver.setImage(ImageLocation.getForUserOrChat(i11, user4, 1), "50_50", ImageLocation.getForUserOrChat(this.f24297y, 2), "50_50", drawable2, this.f24297y, 0);
                fileLocation3 = fileLocation;
            }
        } else {
            TLRPC.Chat chat = this.A;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    fileLocation3 = chatPhoto.photo_small;
                    BitmapDrawable bitmapDrawable2 = chatPhoto.strippedBitmap;
                    if (bitmapDrawable2 != null) {
                        drawable = bitmapDrawable2;
                    } else {
                        drawable = y8Var;
                    }
                } else {
                    drawable = y8Var;
                }
                fileLocation = fileLocation3;
                if (chat.monoforum) {
                    wf.c.n(i11, chat, y8Var, imageReceiver);
                } else {
                    y8Var.k(i11, chat);
                    imageReceiver.setImage(ImageLocation.getForUserOrChat(i11, this.A, 1), "50_50", ImageLocation.getForUserOrChat(this.A, 2), "50_50", drawable, this.A, 0);
                }
                fileLocation3 = fileLocation;
            } else {
                ContactsController.Contact contact = this.C;
                if (contact != null) {
                    y8Var.n(0L, contact.first_name, contact.last_name);
                    imageReceiver.setImage(null, null, y8Var, null, null, 0);
                } else {
                    y8Var.n(0L, null, null);
                    imageReceiver.setImage(null, null, y8Var, null, null, 0);
                }
            }
        }
        if (ChatObject.isCommunity(this.A)) {
            int iDp2 = AndroidUtilities.dp(46.0f);
            Rect rect = gf.s.f7056a;
            iDp = (iDp2 * 20) / 72;
        } else {
            TLRPC.Chat chat2 = this.A;
            if (chat2 == null || !chat2.monoforum) {
                if (this.J0) {
                    f10 = 10.0f;
                } else {
                    f10 = (chat2 == null || !chat2.forum) ? 23.0f : 16.0f;
                }
                iDp = AndroidUtilities.dp(f10);
            } else {
                iDp = 0;
            }
        }
        imageReceiver.setRoundRadius(iDp);
        if (i10 != 0) {
            boolean z10 = !(((MessagesController.UPDATE_MASK_AVATAR & i10) == 0 || this.f24297y == null) && ((MessagesController.UPDATE_MASK_CHAT_AVATAR & i10) == 0 || this.A == null)) && (((fileLocation2 = this.G) != null && fileLocation3 == null) || ((fileLocation2 == null && fileLocation3 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation3.volume_id && fileLocation2.local_id == fileLocation3.local_id))));
            if (!z10 && (MessagesController.UPDATE_MASK_STATUS & i10) != 0 && (user2 = this.f24297y) != null) {
                TLRPC.UserStatus userStatus = user2.status;
                if ((userStatus != null ? userStatus.expires : 0) != this.F) {
                    z10 = true;
                }
            }
            if (!z10 && (MessagesController.UPDATE_MASK_EMOJI_STATUS & i10) != 0 && ((user = this.f24297y) != null || this.A != null)) {
                w(user != null ? user.verified : this.A.verified, user, this.A, true);
            }
            if ((!z10 && (MessagesController.UPDATE_MASK_NAME & i10) != 0 && this.f24297y != null) || ((MessagesController.UPDATE_MASK_CHAT_NAME & i10) != 0 && this.A != null)) {
                if (this.f24297y != null) {
                    strI = this.f24297y.first_name + this.f24297y.last_name;
                } else {
                    TLRPC.Chat chat3 = this.A;
                    strI = chat3.monoforum ? wf.c.i(chat3, i11, false) : chat3.title;
                }
                if (!strI.equals(this.E)) {
                    z10 = true;
                }
            }
            if (!((z10 || !this.W || (i10 & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) == 0 || (dialog = (TLRPC.Dialog) MessagesController.getInstance(i11).dialogs_dict.f(this.D)) == null || MessagesController.getInstance(i11).getDialogUnreadCount(dialog) == this.f24268a0) ? z10 : true)) {
                return;
            }
        }
        TLRPC.User user5 = this.f24297y;
        if (user5 != null) {
            TLRPC.UserStatus userStatus2 = user5.status;
            if (userStatus2 != null) {
                this.F = userStatus2.expires;
            } else {
                this.F = 0;
            }
            this.E = this.f24297y.first_name + this.f24297y.last_name;
        } else {
            TLRPC.Chat chat4 = this.A;
            if (chat4 != null) {
                this.E = chat4.monoforum ? wf.c.i(chat4, i11, false) : chat4.title;
            }
        }
        this.G = fileLocation3;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            requestLayout();
        } else {
            s();
        }
        postInvalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.f24284p0 == drawable || this.f24283o0 == drawable || super.verifyDrawable(drawable);
    }

    public final void w(boolean z10, TLRPC.User user, TLRPC.Chat chat, boolean z11) {
        long botVerificationIcon;
        boolean z12 = LocaleController.isRTL;
        org.telegram.ui.Components.i5 i5Var = this.f24284p0;
        i5Var.f29225a = z12;
        boolean z13 = this.D0;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24293w;
        if (z13 && z10) {
            i5Var.g(new dq(org.telegram.ui.ActionBar.g6.f23085f1, org.telegram.ui.ActionBar.g6.f23139i1, 0, 0), z11);
            i5Var.k(null);
        } else if (z13 && user != null && !this.H && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            i5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z11);
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23444z9, c6Var)));
        } else if (this.D0 && chat != null && !this.H && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            i5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z11);
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23444z9, c6Var)));
        } else if (!this.D0 || user == null || this.H || !MessagesController.getInstance(this.J).isPremiumUser(user)) {
            i5Var.g(null, z11);
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23444z9, c6Var)));
        } else {
            i5Var.g(ag.j2.d().f495e, z11);
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23444z9, c6Var)));
        }
        if (user != null) {
            botVerificationIcon = DialogObject.getBotVerificationIcon(user);
        } else {
            botVerificationIcon = chat != null ? DialogObject.getBotVerificationIcon(chat) : 0L;
        }
        org.telegram.ui.Components.i5 i5Var2 = this.f24283o0;
        if (botVerificationIcon == 0 || this.H) {
            i5Var2.g(null, z11);
        } else {
            i5Var2.j(botVerificationIcon, z11);
        }
        i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23444z9, c6Var)));
    }
}
