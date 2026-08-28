package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dj;
import org.telegram.ui.qn;
public final class xa extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int K = 0;
    public final z A;
    public final pc B;
    public final org.telegram.ui.Components.b9 C;
    public final Drawable D;
    public MessagesController.CommonChatsList E;
    public float F;
    public float G;
    public float H;
    public int I;
    public boolean J;
    public final int f25960a;
    public final org.telegram.ui.ActionBar.b6 f25961b;
    public long f25962c;
    public nz0 d;
    public nz0 f25963e;
    public nz0 f25964f;
    public final ArrayList h;
    public wa f25965n;
    public float f25966r;
    public float f25967s;
    public float v;
    public final RectF f25968w;
    public final pc f25969x;
    public final RectF f25970y;

    public xa(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.h = new ArrayList();
        this.f25968w = new RectF();
        this.f25969x = new pc(this);
        this.f25970y = new RectF();
        this.B = new pc(this);
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9(this, false);
        this.C = b9Var;
        this.f25960a = i9;
        this.f25961b = b6Var;
        z Y = org.telegram.ui.ActionBar.f6.Y(822083583, 8, 8);
        this.A = Y;
        Y.setCallback(this);
        b9Var.f27087p = AndroidUtilities.dp(50.0f);
        b9Var.f27086o = AndroidUtilities.dp(13.0f);
        b9Var.f27094x = false;
        b9Var.f27090s = AndroidUtilities.dp(13.0f);
        b9Var.j(AndroidUtilities.dp(18.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.D = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final wa a(CharSequence charSequence, String str, boolean z10) {
        int i9;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.F += AndroidUtilities.dp(7.0f);
        }
        wa waVar = new wa(str, charSequence, z10);
        arrayList.add(waVar);
        this.F += AndroidUtilities.dp(14.0f);
        this.f25967s = Math.max(this.f25967s, waVar.f25914a.f31223c);
        float f10 = this.v;
        float f11 = waVar.f25915b.f31223c;
        if (z10) {
            i9 = AndroidUtilities.dp(38.0f);
        } else {
            i9 = 0;
        }
        this.v = Math.max(f10, f11 + i9);
        return waVar;
    }

    public final void b(long j10, TLRPC.PeerSettings peerSettings) {
        int i9;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TL_bots.botVerification botverification;
        this.f25962c = j10;
        this.G = 0.0f;
        this.F = 0.0f;
        this.f25967s = 0.0f;
        this.v = 0.0f;
        this.h.clear();
        int i10 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        this.F += AndroidUtilities.dp(14.0f);
        nz0 nz0Var = new nz0(DialogObject.getName(j10), 14.0f, AndroidUtilities.bold());
        this.d = nz0Var;
        this.F = nz0Var.j() + AndroidUtilities.dp(3.0f) + this.F;
        int i11 = this.f25960a;
        if (ContactsController.getInstance(i11).isContact(j10)) {
            i9 = R.string.ContactInfoIsContact;
        } else {
            i9 = R.string.ContactInfoIsNotContact;
        }
        nz0 nz0Var2 = new nz0(LocaleController.getString(i9), 14.0f, null);
        this.f25963e = nz0Var2;
        this.F = nz0Var2.j() + AndroidUtilities.dp(11.0f) + this.F;
        if (peerSettings != null && peerSettings.phone_country != null) {
            a(LocaleController.getCountryWithFlag(peerSettings.phone_country, 12, R.string.ContactInfoPhoneFragment), LocaleController.getString(R.string.ContactInfoPhone), false);
        }
        if (peerSettings != null && peerSettings.registration_month != null) {
            String string = LocaleController.getString(R.string.ContactInfoRegistration);
            String str = peerSettings.registration_month;
            String[] split = str.split("\\.");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                str = LocaleController.formatYearMont(calendar.getTimeInMillis() / 1000, true);
            }
            a(str, string, false);
        }
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 < 0) {
            user = null;
        } else {
            user = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        }
        if (i12 < 0) {
            userFull = null;
        } else {
            userFull = MessagesController.getInstance(i11).getUserFull(j10);
        }
        if (userFull == null && i12 > 0) {
            MessagesController.getInstance(i11).loadUserInfo(MessagesController.getInstance(i11).getUser(Long.valueOf(j10)), true, 0);
        }
        if (userFull != null) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i11).getCommonChats(j10);
            this.E = commonChats;
            int max = Math.max(userFull.common_chats_count, commonChats.getCount());
            if (max > 0) {
                this.f25965n = a(LocaleController.formatPluralString("Groups", max, new Object[0]), LocaleController.getString(R.string.ContactInfoCommonGroups), true);
                int min = Math.min(3, this.E.chats.size());
                org.telegram.ui.Components.b9 b9Var = this.C;
                b9Var.k(min);
                for (int i13 = 0; i13 < Math.min(3, this.E.chats.size()); i13++) {
                    b9Var.l(i13, this.E.chats.get(i13), i11);
                }
                b9Var.b(true, true);
            } else {
                this.E = null;
                this.f25965n = null;
            }
        } else {
            this.E = null;
            this.f25965n = null;
        }
        this.f25966r = this.f25967s + AndroidUtilities.dp(7.66f) + this.v;
        if (user != null && !user.verified && !UserObject.isService(user.f22527id)) {
            if (user.bot_verification_icon != 0) {
                if (userFull != null && (botverification = userFull.bot_verification) != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("i  ");
                    this.f25964f = new nz0(spannableStringBuilder, 12.0f, null);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(botverification.icon, this.f25964f.f31221a.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) botverification.description);
                    nz0 nz0Var3 = new nz0(spannableStringBuilder, 12.0f, null);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    nz0Var3.a();
                    nz0Var3.n(5);
                    Point point = AndroidUtilities.displaySize;
                    nz0Var3.q(Math.min(point.x, point.y) * 0.5f);
                    nz0Var3.s(this);
                    this.f25964f = nz0Var3;
                    this.F = this.f25964f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.F;
                } else {
                    this.f25964f = null;
                    this.F += AndroidUtilities.dp(14.0f);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
                eq eqVar = new eq(R.drawable.filled_info, 0);
                eqVar.setScale(0.55f, -0.55f);
                eqVar.translate(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(-1.0f));
                spannableStringBuilder2.setSpan(eqVar, 0, 1, 33);
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ContactInfoNotVerified));
                this.f25964f = new nz0(spannableStringBuilder2, 12.0f, null);
                this.F = this.f25964f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.F;
            }
        } else {
            this.f25964f = null;
            this.F += AndroidUtilities.dp(14.0f);
        }
        float max2 = Math.max(this.G, this.d.l());
        this.G = max2;
        float max3 = Math.max(max2, this.f25963e.l());
        this.G = max3;
        float max4 = Math.max(max3, this.f25966r);
        this.G = max4;
        this.G = Math.min(max4 + AndroidUtilities.dp(32.0f), i10);
    }

    public final void c(float f10, int i9) {
        if (Math.abs(this.H - f10) > 0.01f || i9 != this.I) {
            invalidate();
        }
        this.I = i9;
        this.H = f10;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.userInfoDidLoad;
        int i12 = this.f25960a;
        if (i9 == i11) {
            long longValue = ((Long) objArr[0]).longValue();
            long j10 = this.f25962c;
            if (longValue == j10) {
                b(j10, MessagesController.getInstance(i12).getPeerSettings(this.f25962c));
            }
        } else if (i9 == NotificationCenter.commonChatsLoaded && ((Long) objArr[0]).longValue() == this.f25962c) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i12).getCommonChats(this.f25962c);
            this.E = commonChats;
            int count = commonChats.getCount();
            wa waVar = this.f25965n;
            if (waVar != null && count > 0) {
                waVar.f25915b = new nz0(LocaleController.formatPluralString("Groups", count, new Object[0]), 12.0f, AndroidUtilities.bold());
                int min = Math.min(3, this.E.chats.size());
                org.telegram.ui.Components.b9 b9Var = this.C;
                b9Var.k(min);
                for (int i13 = 0; i13 < Math.min(3, this.E.chats.size()); i13++) {
                    b9Var.l(i13, this.E.chats.get(i13), i12);
                }
                b9Var.b(true, true);
            } else {
                b(this.f25962c, MessagesController.getInstance(i12).getPeerSettings(this.f25962c));
                requestLayout();
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = this.f25960a;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.commonChatsLoaded);
        this.C.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = this.f25960a;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.commonChatsLoaded);
        this.C.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean a12;
        float f10;
        super.onDraw(canvas);
        canvas.save();
        float f11 = 2.0f;
        float width = getWidth() / 2.0f;
        RectF rectF = this.f25968w;
        rectF.set((getWidth() - this.G) / 2.0f, (getHeight() - this.F) / 2.0f, (getWidth() + this.G) / 2.0f, (getHeight() + this.F) / 2.0f);
        float f12 = 0.025f;
        float a2 = this.f25969x.a(0.025f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i9 = this.I;
        float x10 = getX();
        float f13 = this.H;
        org.telegram.ui.ActionBar.b6 b6Var = this.f25961b;
        if (b6Var != null) {
            b6Var.o(x10, f13, measuredWidth, i9);
        } else {
            org.telegram.ui.ActionBar.f6.q(x10, f13, measuredWidth, i9);
        }
        float f14 = 16.0f;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.f6.T0("paintChatActionBackground", b6Var));
        if (b6Var != null) {
            a12 = b6Var.t0();
        } else {
            a12 = org.telegram.ui.ActionBar.f6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.f6.T0("paintChatActionBackgroundDarken", b6Var));
        }
        float f15 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.F) / 2.0f);
        float A = e2.c.A(getHeight(), this.F, 2.0f, 0.0f);
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float dp = A + AndroidUtilities.dp(14.0f);
        nz0 nz0Var = this.d;
        nz0Var.f31234p = this.G - AndroidUtilities.dp(32.0f);
        nz0Var.c(width - (this.d.l() / 2.0f), this.d.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, this.d.j() + AndroidUtilities.dp(3.0f));
        float j10 = dp + this.d.j() + AndroidUtilities.dp(3.0f);
        nz0 nz0Var2 = this.f25963e;
        nz0Var2.f31234p = this.G - AndroidUtilities.dp(32.0f);
        nz0Var2.c(width - (this.f25963e.l() / 2.0f), this.f25963e.j() / 2.0f, 0.7f, -1, canvas);
        canvas.translate(0.0f, this.f25963e.j() + AndroidUtilities.dp(11.0f));
        float j11 = this.f25963e.j() + AndroidUtilities.dp(11.0f) + j10;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (i10 > 0) {
                canvas.translate(f15, AndroidUtilities.dp(7.0f));
                j11 += AndroidUtilities.dp(7.0f);
            }
            canvas.save();
            wa waVar = (wa) arrayList.get(i10);
            float dp2 = (width - (this.G / f11)) + AndroidUtilities.dp(f14) + this.f25967s;
            float f16 = j11;
            nz0 nz0Var3 = waVar.f25914a;
            boolean z11 = waVar.f25916c;
            RectF rectF2 = waVar.d;
            float f17 = dp2 - nz0Var3.f31223c;
            float dp3 = (width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f25967s + AndroidUtilities.dp(7.66f);
            nz0Var3.f31234p = (dp3 - f17) - AndroidUtilities.dp(7.66f);
            nz0Var3.c(f17, nz0Var3.j() / 2.0f, 0.7f, -1, canvas);
            float dp4 = (width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f25967s + AndroidUtilities.dp(7.66f);
            float dp5 = (width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f25967s + AndroidUtilities.dp(7.66f) + waVar.f25915b.f31223c;
            org.telegram.ui.Components.b9 b9Var = this.C;
            Drawable drawable = this.D;
            if (z11) {
                f10 = b9Var.A + (drawable.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f);
            } else {
                f10 = 0.0f;
            }
            rectF2.set(dp4, f16, dp5 + f10, waVar.f25915b.j() + f16);
            if (this.f25965n == waVar) {
                RectF rectF3 = this.f25970y;
                rectF3.set(rectF2);
                rectF3.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(2.0f));
                float a3 = this.B.a(f12);
                canvas.scale(a3, a3, rectF3.centerX(), waVar.f25915b.j() / 2.0f);
                z zVar = this.A;
                if (zVar != null) {
                    zVar.setBounds((int) rectF3.left, (int) (rectF3.top - f16), (int) rectF3.right, (int) (rectF3.bottom - f16));
                    zVar.draw(canvas);
                }
            }
            nz0 nz0Var4 = waVar.f25915b;
            nz0Var4.f31234p = (((this.G / 2.0f) + width) - AndroidUtilities.dp(8.0f)) - dp3;
            nz0Var4.c(dp3, waVar.f25915b.j() / 2.0f, 1.0f, -1, canvas);
            if (z11) {
                canvas.save();
                canvas.translate((width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f25967s + AndroidUtilities.dp(7.66f) + waVar.f25915b.f31223c + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                b9Var.i(canvas);
                canvas.translate(b9Var.A + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(13.0f) / 2.0f);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / 2.0f), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / 2.0f));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
            j11 = AndroidUtilities.dp(14.0f) + f16;
            i10++;
            f11 = 2.0f;
            f12 = 0.025f;
            f15 = 0.0f;
            f14 = 16.0f;
        }
        if (this.f25964f != null) {
            canvas.translate(0.0f, AndroidUtilities.dp(12.0f));
            nz0 nz0Var5 = this.f25964f;
            if (nz0Var5.f31225f > 1) {
                z10 = true;
            }
            if (z10) {
                nz0Var5.c(width - (nz0Var5.l() / 2.0f), 0.0f, 0.7f, -1, canvas);
            } else {
                nz0Var5.f31234p = this.G - AndroidUtilities.dp(32.0f);
                nz0Var5.c(width - (this.f25964f.l() / 2.0f), this.f25964f.j() / 2.0f, 0.7f, -1, canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), org.telegram.messenger.l0.z(16.0f, (int) this.F, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        dj djVar;
        if (this.f25965n != null && this.f25970y.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && this.f25968w.contains(motionEvent.getX(), motionEvent.getY())) {
            z11 = true;
        } else {
            z11 = false;
        }
        int action = motionEvent.getAction();
        z zVar = this.A;
        pc pcVar = this.B;
        pc pcVar2 = this.f25969x;
        if (action == 0) {
            pcVar2.c(z11);
            pcVar.c(z10);
            zVar.setState(z10 ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (pcVar2.h) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if ((U instanceof qn) && (djVar = ((qn) U).W0) != null) {
                    djVar.e(true, false);
                }
            } else if (pcVar.h) {
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    Bundle bundle = new Bundle();
                    long j10 = this.f25962c;
                    if (j10 >= 0) {
                        bundle.putLong("user_id", j10);
                    } else {
                        bundle.putLong("chat_id", -j10);
                    }
                    bundle.putBoolean("open_common", true);
                    U2.presentFragment(new ProfileActivity(bundle, null));
                }
                invalidate();
            }
            pcVar.c(false);
            pcVar2.c(false);
            zVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            pcVar.c(false);
            pcVar2.c(false);
            zVar.setState(new int[0]);
        }
        if (pcVar.h || pcVar2.h) {
            return true;
        }
        return false;
    }

    public void setAnimating(boolean z10) {
        this.J = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.A && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
