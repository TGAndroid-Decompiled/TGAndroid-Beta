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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.oj;
import org.telegram.ui.zn;
public final class bb extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int O = 0;
    public final z E;
    public final yc F;
    public final org.telegram.ui.Components.j9 G;
    public final Drawable H;
    public MessagesController.CommonChatsList I;
    public float J;
    public float K;
    public float L;
    public int M;
    public boolean N;
    public final int f20028a;
    public final org.telegram.ui.ActionBar.e6 f20029b;
    public long f20030c;
    public v01 d;
    public v01 e;
    public v01 f20031f;
    public final ArrayList h;
    public ab f20032n;
    public float f20033r;
    public float f20034s;
    public float v;
    public final RectF f20035w;
    public final yc f20036x;
    public final RectF f20037y;

    public bb(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = new ArrayList();
        this.f20035w = new RectF();
        this.f20036x = new yc(this);
        this.f20037y = new RectF();
        this.F = new yc(this);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(this, false);
        this.G = j9Var;
        this.f20028a = i10;
        this.f20029b = e6Var;
        z Y = org.telegram.ui.ActionBar.j6.Y(822083583, 8, 8);
        this.E = Y;
        Y.setCallback(this);
        j9Var.f25259p = AndroidUtilities.dp(50.0f);
        j9Var.f25258o = AndroidUtilities.dp(13.0f);
        j9Var.f25266x = false;
        j9Var.f25262s = AndroidUtilities.dp(13.0f);
        j9Var.j(AndroidUtilities.dp(18.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.H = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final ab a(CharSequence charSequence, String str, boolean z10) {
        int i10;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.J += AndroidUtilities.dp(7.0f);
        }
        ab abVar = new ab(str, charSequence, z10);
        arrayList.add(abVar);
        this.J += AndroidUtilities.dp(14.0f);
        this.f20034s = Math.max(this.f20034s, abVar.f19996a.f28868c);
        float f7 = this.v;
        float f10 = abVar.f19997b.f28868c;
        if (z10) {
            i10 = AndroidUtilities.dp(38.0f);
        } else {
            i10 = 0;
        }
        this.v = Math.max(f7, f10 + i10);
        return abVar;
    }

    public final void b(long j3, TLRPC.PeerSettings peerSettings) {
        int i10;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TL_bots.botVerification botverification;
        this.f20030c = j3;
        this.K = 0.0f;
        this.J = 0.0f;
        this.f20034s = 0.0f;
        this.v = 0.0f;
        this.h.clear();
        int i11 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        this.J += AndroidUtilities.dp(14.0f);
        v01 v01Var = new v01(DialogObject.getName(j3), 14.0f, AndroidUtilities.bold());
        this.d = v01Var;
        this.J = v01Var.j() + AndroidUtilities.dp(3.0f) + this.J;
        int i12 = this.f20028a;
        if (ContactsController.getInstance(i12).isContact(j3)) {
            i10 = R.string.ContactInfoIsContact;
        } else {
            i10 = R.string.ContactInfoIsNotContact;
        }
        v01 v01Var2 = new v01(LocaleController.getString(i10), 14.0f, null);
        this.e = v01Var2;
        this.J = v01Var2.j() + AndroidUtilities.dp(11.0f) + this.J;
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
        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i13 < 0) {
            user = null;
        } else {
            user = MessagesController.getInstance(i12).getUser(Long.valueOf(j3));
        }
        if (i13 < 0) {
            userFull = null;
        } else {
            userFull = MessagesController.getInstance(i12).getUserFull(j3);
        }
        if (userFull == null && i13 > 0) {
            MessagesController.getInstance(i12).loadUserInfo(MessagesController.getInstance(i12).getUser(Long.valueOf(j3)), true, 0);
        }
        if (userFull != null) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i12).getCommonChats(j3);
            this.I = commonChats;
            int max = Math.max(userFull.common_chats_count, commonChats.getCount());
            if (max > 0) {
                this.f20032n = a(LocaleController.formatPluralString("Groups", max, new Object[0]), LocaleController.getString(R.string.ContactInfoCommonGroups), true);
                int min = Math.min(3, this.I.chats.size());
                org.telegram.ui.Components.j9 j9Var = this.G;
                j9Var.k(min);
                for (int i14 = 0; i14 < Math.min(3, this.I.chats.size()); i14++) {
                    j9Var.l(i14, this.I.chats.get(i14), i12);
                }
                j9Var.b(true, true);
            } else {
                this.I = null;
                this.f20032n = null;
            }
        } else {
            this.I = null;
            this.f20032n = null;
        }
        this.f20033r = this.f20034s + AndroidUtilities.dp(7.66f) + this.v;
        if (user != null && !user.verified && !UserObject.isService(user.f18443id)) {
            if (user.bot_verification_icon != 0) {
                if (userFull != null && (botverification = userFull.bot_verification) != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("i  ");
                    this.f20031f = new v01(spannableStringBuilder, 12.0f, null);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.z5(botverification.icon, this.f20031f.f28866a.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) botverification.description);
                    v01 v01Var3 = new v01(spannableStringBuilder, 12.0f, null);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    v01Var3.a();
                    v01Var3.n(5);
                    Point point = AndroidUtilities.displaySize;
                    v01Var3.q(Math.min(point.x, point.y) * 0.5f);
                    v01Var3.s(this);
                    this.f20031f = v01Var3;
                    this.J = this.f20031f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.J;
                } else {
                    this.f20031f = null;
                    this.J += AndroidUtilities.dp(14.0f);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
                oq oqVar = new oq(R.drawable.filled_info, 0);
                oqVar.setScale(0.55f, -0.55f);
                oqVar.translate(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(-1.0f));
                spannableStringBuilder2.setSpan(oqVar, 0, 1, 33);
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ContactInfoNotVerified));
                this.f20031f = new v01(spannableStringBuilder2, 12.0f, null);
                this.J = this.f20031f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.J;
            }
        } else {
            this.f20031f = null;
            this.J += AndroidUtilities.dp(14.0f);
        }
        float max2 = Math.max(this.K, this.d.l());
        this.K = max2;
        float max3 = Math.max(max2, this.e.l());
        this.K = max3;
        float max4 = Math.max(max3, this.f20033r);
        this.K = max4;
        this.K = Math.min(max4 + AndroidUtilities.dp(32.0f), i11);
    }

    public final void c(float f7, int i10) {
        if (Math.abs(this.L - f7) > 0.01f || i10 != this.M) {
            invalidate();
        }
        this.M = i10;
        this.L = f7;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.userInfoDidLoad;
        int i13 = this.f20028a;
        if (i10 == i12) {
            long longValue = ((Long) objArr[0]).longValue();
            long j3 = this.f20030c;
            if (longValue == j3) {
                b(j3, MessagesController.getInstance(i13).getPeerSettings(this.f20030c));
            }
        } else if (i10 == NotificationCenter.commonChatsLoaded && ((Long) objArr[0]).longValue() == this.f20030c) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i13).getCommonChats(this.f20030c);
            this.I = commonChats;
            int count = commonChats.getCount();
            ab abVar = this.f20032n;
            if (abVar != null && count > 0) {
                abVar.f19997b = new v01(LocaleController.formatPluralString("Groups", count, new Object[0]), 12.0f, AndroidUtilities.bold());
                int min = Math.min(3, this.I.chats.size());
                org.telegram.ui.Components.j9 j9Var = this.G;
                j9Var.k(min);
                for (int i14 = 0; i14 < Math.min(3, this.I.chats.size()); i14++) {
                    j9Var.l(i14, this.I.chats.get(i14), i13);
                }
                j9Var.b(true, true);
            } else {
                b(this.f20030c, MessagesController.getInstance(i13).getPeerSettings(this.f20030c));
                requestLayout();
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f20028a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.commonChatsLoaded);
        this.G.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f20028a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.commonChatsLoaded);
        this.G.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean a12;
        float f7;
        super.onDraw(canvas);
        canvas.save();
        float f10 = 2.0f;
        float width = getWidth() / 2.0f;
        RectF rectF = this.f20035w;
        rectF.set((getWidth() - this.K) / 2.0f, (getHeight() - this.J) / 2.0f, (getWidth() + this.K) / 2.0f, (getHeight() + this.J) / 2.0f);
        float f11 = 0.025f;
        float a2 = this.f20036x.a(0.025f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i10 = this.M;
        float x10 = getX();
        float f12 = this.L;
        org.telegram.ui.ActionBar.e6 e6Var = this.f20029b;
        if (e6Var != null) {
            e6Var.m(x10, f12, measuredWidth, i10);
        } else {
            org.telegram.ui.ActionBar.j6.q(x10, f12, measuredWidth, i10);
        }
        float f13 = 16.0f;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.T0("paintChatActionBackground", e6Var));
        if (e6Var != null) {
            a12 = e6Var.p0();
        } else {
            a12 = org.telegram.ui.ActionBar.j6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.j6.T0("paintChatActionBackgroundDarken", e6Var));
        }
        float f14 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.J) / 2.0f);
        float A = com.google.android.gms.internal.vision.e2.A(getHeight(), this.J, 2.0f, 0.0f);
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float dp = A + AndroidUtilities.dp(14.0f);
        v01 v01Var = this.d;
        v01Var.f28878p = this.K - AndroidUtilities.dp(32.0f);
        v01Var.c(width - (this.d.l() / 2.0f), this.d.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, this.d.j() + AndroidUtilities.dp(3.0f));
        float j3 = dp + this.d.j() + AndroidUtilities.dp(3.0f);
        v01 v01Var2 = this.e;
        v01Var2.f28878p = this.K - AndroidUtilities.dp(32.0f);
        v01Var2.c(width - (this.e.l() / 2.0f), this.e.j() / 2.0f, 0.7f, -1, canvas);
        canvas.translate(0.0f, this.e.j() + AndroidUtilities.dp(11.0f));
        float j10 = this.e.j() + AndroidUtilities.dp(11.0f) + j3;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 > 0) {
                canvas.translate(f14, AndroidUtilities.dp(7.0f));
                j10 += AndroidUtilities.dp(7.0f);
            }
            canvas.save();
            ab abVar = (ab) arrayList.get(i11);
            float dp2 = (width - (this.K / f10)) + AndroidUtilities.dp(f13) + this.f20034s;
            float f15 = j10;
            v01 v01Var3 = abVar.f19996a;
            boolean z11 = abVar.f19998c;
            RectF rectF2 = abVar.d;
            float f16 = dp2 - v01Var3.f28868c;
            float dp3 = (width - (this.K / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f20034s + AndroidUtilities.dp(7.66f);
            v01Var3.f28878p = (dp3 - f16) - AndroidUtilities.dp(7.66f);
            v01Var3.c(f16, v01Var3.j() / 2.0f, 0.7f, -1, canvas);
            float dp4 = (width - (this.K / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f20034s + AndroidUtilities.dp(7.66f);
            float dp5 = (width - (this.K / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f20034s + AndroidUtilities.dp(7.66f) + abVar.f19997b.f28868c;
            org.telegram.ui.Components.j9 j9Var = this.G;
            Drawable drawable = this.H;
            if (z11) {
                f7 = j9Var.A + (drawable.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f);
            } else {
                f7 = 0.0f;
            }
            rectF2.set(dp4, f15, dp5 + f7, abVar.f19997b.j() + f15);
            if (this.f20032n == abVar) {
                RectF rectF3 = this.f20037y;
                rectF3.set(rectF2);
                rectF3.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(2.0f));
                float a10 = this.F.a(f11);
                canvas.scale(a10, a10, rectF3.centerX(), abVar.f19997b.j() / 2.0f);
                z zVar = this.E;
                if (zVar != null) {
                    zVar.setBounds((int) rectF3.left, (int) (rectF3.top - f15), (int) rectF3.right, (int) (rectF3.bottom - f15));
                    zVar.draw(canvas);
                }
            }
            v01 v01Var4 = abVar.f19997b;
            v01Var4.f28878p = (((this.K / 2.0f) + width) - AndroidUtilities.dp(8.0f)) - dp3;
            v01Var4.c(dp3, abVar.f19997b.j() / 2.0f, 1.0f, -1, canvas);
            if (z11) {
                canvas.save();
                canvas.translate((width - (this.K / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f20034s + AndroidUtilities.dp(7.66f) + abVar.f19997b.f28868c + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                j9Var.i(canvas);
                canvas.translate(j9Var.A + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(13.0f) / 2.0f);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / 2.0f), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / 2.0f));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
            j10 = AndroidUtilities.dp(14.0f) + f15;
            i11++;
            f10 = 2.0f;
            f11 = 0.025f;
            f14 = 0.0f;
            f13 = 16.0f;
        }
        if (this.f20031f != null) {
            canvas.translate(0.0f, AndroidUtilities.dp(12.0f));
            v01 v01Var5 = this.f20031f;
            if (v01Var5.f28869f > 1) {
                z10 = true;
            }
            if (z10) {
                v01Var5.c(width - (v01Var5.l() / 2.0f), 0.0f, 0.7f, -1, canvas);
            } else {
                v01Var5.f28878p = this.K - AndroidUtilities.dp(32.0f);
                v01Var5.c(width - (this.f20031f.l() / 2.0f), this.f20031f.j() / 2.0f, 0.7f, -1, canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.q.z(16.0f, (int) this.J, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        oj ojVar;
        if (this.f20032n != null && this.f20037y.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && this.f20035w.contains(motionEvent.getX(), motionEvent.getY())) {
            z11 = true;
        } else {
            z11 = false;
        }
        int action = motionEvent.getAction();
        z zVar = this.E;
        yc ycVar = this.F;
        yc ycVar2 = this.f20036x;
        if (action == 0) {
            ycVar2.c(z11);
            ycVar.c(z10);
            zVar.setState(z10 ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (ycVar2.h) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if ((U instanceof zn) && (ojVar = ((zn) U).f40201a1) != null) {
                    ojVar.e(true, false);
                }
            } else if (ycVar.h) {
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    Bundle bundle = new Bundle();
                    long j3 = this.f20030c;
                    if (j3 >= 0) {
                        bundle.putLong("user_id", j3);
                    } else {
                        bundle.putLong("chat_id", -j3);
                    }
                    bundle.putBoolean("open_common", true);
                    U2.presentFragment(new ProfileActivity(bundle, null));
                }
                invalidate();
            }
            ycVar.c(false);
            ycVar2.c(false);
            zVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            ycVar.c(false);
            ycVar2.c(false);
            zVar.setState(new int[0]);
        }
        if (ycVar.h || ycVar2.h) {
            return true;
        }
        return false;
    }

    public void setAnimating(boolean z10) {
        this.N = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
