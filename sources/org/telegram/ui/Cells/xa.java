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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.rc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.lj;
import org.telegram.ui.xn;
public final class xa extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int L = 0;
    public final z B;
    public final rc C;
    public final org.telegram.ui.Components.c9 D;
    public final Drawable E;
    public MessagesController.CommonChatsList F;
    public float G;
    public float H;
    public float I;
    public int J;
    public boolean K;
    public final int f22589a;
    public final org.telegram.ui.ActionBar.f6 f22590b;
    public long f22591c;
    public k01 d;
    public k01 e;
    public k01 f22592f;
    public final ArrayList h;
    public wa f22593n;
    public float f22594r;
    public float f22595s;
    public float v;
    public final RectF f22596w;
    public final rc f22597x;
    public final RectF f22598y;

    public xa(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = new ArrayList();
        this.f22596w = new RectF();
        this.f22597x = new rc(this);
        this.f22598y = new RectF();
        this.C = new rc(this);
        org.telegram.ui.Components.c9 c9Var = new org.telegram.ui.Components.c9(this, false);
        this.D = c9Var;
        this.f22589a = i10;
        this.f22590b = f6Var;
        z Y = org.telegram.ui.ActionBar.j6.Y(822083583, 8, 8);
        this.B = Y;
        Y.setCallback(this);
        c9Var.f23934p = AndroidUtilities.dp(50.0f);
        c9Var.f23933o = AndroidUtilities.dp(13.0f);
        c9Var.f23941x = false;
        c9Var.f23937s = AndroidUtilities.dp(13.0f);
        c9Var.j(AndroidUtilities.dp(18.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.E = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final wa a(CharSequence charSequence, String str, boolean z4) {
        int i10;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.G += AndroidUtilities.dp(7.0f);
        }
        wa waVar = new wa(str, charSequence, z4);
        arrayList.add(waVar);
        this.G += AndroidUtilities.dp(14.0f);
        this.f22595s = Math.max(this.f22595s, waVar.f22552a.f26084c);
        float f10 = this.v;
        float f11 = waVar.f22553b.f26084c;
        if (z4) {
            i10 = AndroidUtilities.dp(38.0f);
        } else {
            i10 = 0;
        }
        this.v = Math.max(f10, f11 + i10);
        return waVar;
    }

    public final void b(long j10, TLRPC.PeerSettings peerSettings) {
        int i10;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TL_bots.botVerification botverification;
        this.f22591c = j10;
        this.H = 0.0f;
        this.G = 0.0f;
        this.f22595s = 0.0f;
        this.v = 0.0f;
        this.h.clear();
        int i11 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        this.G += AndroidUtilities.dp(14.0f);
        k01 k01Var = new k01(DialogObject.getName(j10), 14.0f, AndroidUtilities.bold());
        this.d = k01Var;
        this.G = k01Var.j() + AndroidUtilities.dp(3.0f) + this.G;
        int i12 = this.f22589a;
        if (ContactsController.getInstance(i12).isContact(j10)) {
            i10 = R.string.ContactInfoIsContact;
        } else {
            i10 = R.string.ContactInfoIsNotContact;
        }
        k01 k01Var2 = new k01(LocaleController.getString(i10), 14.0f, null);
        this.e = k01Var2;
        this.G = k01Var2.j() + AndroidUtilities.dp(11.0f) + this.G;
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
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 < 0) {
            user = null;
        } else {
            user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
        }
        if (i13 < 0) {
            userFull = null;
        } else {
            userFull = MessagesController.getInstance(i12).getUserFull(j10);
        }
        if (userFull == null && i13 > 0) {
            MessagesController.getInstance(i12).loadUserInfo(MessagesController.getInstance(i12).getUser(Long.valueOf(j10)), true, 0);
        }
        if (userFull != null) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i12).getCommonChats(j10);
            this.F = commonChats;
            int max = Math.max(userFull.common_chats_count, commonChats.getCount());
            if (max > 0) {
                this.f22593n = a(LocaleController.formatPluralString("Groups", max, new Object[0]), LocaleController.getString(R.string.ContactInfoCommonGroups), true);
                int min = Math.min(3, this.F.chats.size());
                org.telegram.ui.Components.c9 c9Var = this.D;
                c9Var.k(min);
                for (int i14 = 0; i14 < Math.min(3, this.F.chats.size()); i14++) {
                    c9Var.l(i14, this.F.chats.get(i14), i12);
                }
                c9Var.b(true, true);
            } else {
                this.F = null;
                this.f22593n = null;
            }
        } else {
            this.F = null;
            this.f22593n = null;
        }
        this.f22594r = this.f22595s + AndroidUtilities.dp(7.66f) + this.v;
        if (user != null && !user.verified && !UserObject.isService(user.f19331id)) {
            if (user.bot_verification_icon != 0) {
                if (userFull != null && (botverification = userFull.bot_verification) != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("i  ");
                    this.f22592f = new k01(spannableStringBuilder, 12.0f, null);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.u5(botverification.icon, this.f22592f.f26082a.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) botverification.description);
                    k01 k01Var3 = new k01(spannableStringBuilder, 12.0f, null);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    k01Var3.a();
                    k01Var3.n(5);
                    Point point = AndroidUtilities.displaySize;
                    k01Var3.q(Math.min(point.x, point.y) * 0.5f);
                    k01Var3.s(this);
                    this.f22592f = k01Var3;
                    this.G = this.f22592f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.G;
                } else {
                    this.f22592f = null;
                    this.G += AndroidUtilities.dp(14.0f);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
                mq mqVar = new mq(R.drawable.filled_info, 0);
                mqVar.setScale(0.55f, -0.55f);
                mqVar.translate(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(-1.0f));
                spannableStringBuilder2.setSpan(mqVar, 0, 1, 33);
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ContactInfoNotVerified));
                this.f22592f = new k01(spannableStringBuilder2, 12.0f, null);
                this.G = this.f22592f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.G;
            }
        } else {
            this.f22592f = null;
            this.G += AndroidUtilities.dp(14.0f);
        }
        float max2 = Math.max(this.H, this.d.l());
        this.H = max2;
        float max3 = Math.max(max2, this.e.l());
        this.H = max3;
        float max4 = Math.max(max3, this.f22594r);
        this.H = max4;
        this.H = Math.min(max4 + AndroidUtilities.dp(32.0f), i11);
    }

    public final void c(float f10, int i10) {
        if (Math.abs(this.I - f10) > 0.01f || i10 != this.J) {
            invalidate();
        }
        this.J = i10;
        this.I = f10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.userInfoDidLoad;
        int i13 = this.f22589a;
        if (i10 == i12) {
            long longValue = ((Long) objArr[0]).longValue();
            long j10 = this.f22591c;
            if (longValue == j10) {
                b(j10, MessagesController.getInstance(i13).getPeerSettings(this.f22591c));
            }
        } else if (i10 == NotificationCenter.commonChatsLoaded && ((Long) objArr[0]).longValue() == this.f22591c) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i13).getCommonChats(this.f22591c);
            this.F = commonChats;
            int count = commonChats.getCount();
            wa waVar = this.f22593n;
            if (waVar != null && count > 0) {
                waVar.f22553b = new k01(LocaleController.formatPluralString("Groups", count, new Object[0]), 12.0f, AndroidUtilities.bold());
                int min = Math.min(3, this.F.chats.size());
                org.telegram.ui.Components.c9 c9Var = this.D;
                c9Var.k(min);
                for (int i14 = 0; i14 < Math.min(3, this.F.chats.size()); i14++) {
                    c9Var.l(i14, this.F.chats.get(i14), i13);
                }
                c9Var.b(true, true);
            } else {
                b(this.f22591c, MessagesController.getInstance(i13).getPeerSettings(this.f22591c));
                requestLayout();
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f22589a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.commonChatsLoaded);
        this.D.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f22589a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.commonChatsLoaded);
        this.D.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean a12;
        float f10;
        super.onDraw(canvas);
        canvas.save();
        float f11 = 2.0f;
        float width = getWidth() / 2.0f;
        RectF rectF = this.f22596w;
        rectF.set((getWidth() - this.H) / 2.0f, (getHeight() - this.G) / 2.0f, (getWidth() + this.H) / 2.0f, (getHeight() + this.G) / 2.0f);
        float f12 = 0.025f;
        float a2 = this.f22597x.a(0.025f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i10 = this.J;
        float x10 = getX();
        float f13 = this.I;
        org.telegram.ui.ActionBar.f6 f6Var = this.f22590b;
        if (f6Var != null) {
            f6Var.l(x10, f13, measuredWidth, i10);
        } else {
            org.telegram.ui.ActionBar.j6.q(x10, f13, measuredWidth, i10);
        }
        float f14 = 16.0f;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.T0("paintChatActionBackground", f6Var));
        if (f6Var != null) {
            a12 = f6Var.m0();
        } else {
            a12 = org.telegram.ui.ActionBar.j6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.T0("paintChatActionBackgroundDarken", f6Var));
        }
        float f15 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.G) / 2.0f);
        float x11 = e2.c.x(getHeight(), this.G, 2.0f, 0.0f);
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float dp = x11 + AndroidUtilities.dp(14.0f);
        k01 k01Var = this.d;
        k01Var.f26094p = this.H - AndroidUtilities.dp(32.0f);
        k01Var.c(width - (this.d.l() / 2.0f), this.d.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, this.d.j() + AndroidUtilities.dp(3.0f));
        float j10 = dp + this.d.j() + AndroidUtilities.dp(3.0f);
        k01 k01Var2 = this.e;
        k01Var2.f26094p = this.H - AndroidUtilities.dp(32.0f);
        k01Var2.c(width - (this.e.l() / 2.0f), this.e.j() / 2.0f, 0.7f, -1, canvas);
        canvas.translate(0.0f, this.e.j() + AndroidUtilities.dp(11.0f));
        float j11 = this.e.j() + AndroidUtilities.dp(11.0f) + j10;
        boolean z4 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 > 0) {
                canvas.translate(f15, AndroidUtilities.dp(7.0f));
                j11 += AndroidUtilities.dp(7.0f);
            }
            canvas.save();
            wa waVar = (wa) arrayList.get(i11);
            float dp2 = (width - (this.H / f11)) + AndroidUtilities.dp(f14) + this.f22595s;
            float f16 = j11;
            k01 k01Var3 = waVar.f22552a;
            boolean z10 = waVar.f22554c;
            RectF rectF2 = waVar.d;
            float f17 = dp2 - k01Var3.f26084c;
            float dp3 = (width - (this.H / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f22595s + AndroidUtilities.dp(7.66f);
            k01Var3.f26094p = (dp3 - f17) - AndroidUtilities.dp(7.66f);
            k01Var3.c(f17, k01Var3.j() / 2.0f, 0.7f, -1, canvas);
            float dp4 = (width - (this.H / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f22595s + AndroidUtilities.dp(7.66f);
            float dp5 = (width - (this.H / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f22595s + AndroidUtilities.dp(7.66f) + waVar.f22553b.f26084c;
            org.telegram.ui.Components.c9 c9Var = this.D;
            Drawable drawable = this.E;
            if (z10) {
                f10 = c9Var.A + (drawable.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f);
            } else {
                f10 = 0.0f;
            }
            rectF2.set(dp4, f16, dp5 + f10, waVar.f22553b.j() + f16);
            if (this.f22593n == waVar) {
                RectF rectF3 = this.f22598y;
                rectF3.set(rectF2);
                rectF3.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(2.0f));
                float a10 = this.C.a(f12);
                canvas.scale(a10, a10, rectF3.centerX(), waVar.f22553b.j() / 2.0f);
                z zVar = this.B;
                if (zVar != null) {
                    zVar.setBounds((int) rectF3.left, (int) (rectF3.top - f16), (int) rectF3.right, (int) (rectF3.bottom - f16));
                    zVar.draw(canvas);
                }
            }
            k01 k01Var4 = waVar.f22553b;
            k01Var4.f26094p = (((this.H / 2.0f) + width) - AndroidUtilities.dp(8.0f)) - dp3;
            k01Var4.c(dp3, waVar.f22553b.j() / 2.0f, 1.0f, -1, canvas);
            if (z10) {
                canvas.save();
                canvas.translate((width - (this.H / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f22595s + AndroidUtilities.dp(7.66f) + waVar.f22553b.f26084c + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                c9Var.i(canvas);
                canvas.translate(c9Var.A + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(13.0f) / 2.0f);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / 2.0f), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / 2.0f));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
            j11 = AndroidUtilities.dp(14.0f) + f16;
            i11++;
            f11 = 2.0f;
            f12 = 0.025f;
            f15 = 0.0f;
            f14 = 16.0f;
        }
        if (this.f22592f != null) {
            canvas.translate(0.0f, AndroidUtilities.dp(12.0f));
            k01 k01Var5 = this.f22592f;
            if (k01Var5.f26085f > 1) {
                z4 = true;
            }
            if (z4) {
                k01Var5.c(width - (k01Var5.l() / 2.0f), 0.0f, 0.7f, -1, canvas);
            } else {
                k01Var5.f26094p = this.H - AndroidUtilities.dp(32.0f);
                k01Var5.c(width - (this.f22592f.l() / 2.0f), this.f22592f.j() / 2.0f, 0.7f, -1, canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.y3.b(16.0f, (int) this.G, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        lj ljVar;
        if (this.f22593n != null && this.f22598y.contains(motionEvent.getX(), motionEvent.getY())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && this.f22596w.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        z zVar = this.B;
        rc rcVar = this.C;
        rc rcVar2 = this.f22597x;
        if (action == 0) {
            rcVar2.c(z10);
            rcVar.c(z4);
            zVar.setState(z4 ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (rcVar2.h) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if ((U instanceof xn) && (ljVar = ((xn) U).X0) != null) {
                    ljVar.e(true, false);
                }
            } else if (rcVar.h) {
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    Bundle bundle = new Bundle();
                    long j10 = this.f22591c;
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
            rcVar.c(false);
            rcVar2.c(false);
            zVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            rcVar.c(false);
            rcVar2.c(false);
            zVar.setState(new int[0]);
        }
        if (rcVar.h || rcVar2.h) {
            return true;
        }
        return false;
    }

    public void setAnimating(boolean z4) {
        this.K = z4;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.B && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
