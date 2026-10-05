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
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.nj;
import org.telegram.ui.yn;
public final class bb extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int O = 0;
    public final z E;
    public final zc F;
    public final org.telegram.ui.Components.j9 G;
    public final Drawable H;
    public MessagesController.CommonChatsList I;
    public float J;
    public float K;
    public float L;
    public int M;
    public boolean N;
    public final int f21849a;
    public final org.telegram.ui.ActionBar.d6 f21850b;
    public long f21851c;
    public f11 d;
    public f11 f21852e;
    public f11 f21853f;
    public final ArrayList h;
    public ab f21854n;
    public float f21855r;
    public float f21856s;
    public float v;
    public final RectF f21857w;
    public final zc f21858x;
    public final RectF f21859y;

    public bb(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.h = new ArrayList();
        this.f21857w = new RectF();
        this.f21858x = new zc(this);
        this.f21859y = new RectF();
        this.F = new zc(this);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(this, false);
        this.G = j9Var;
        this.f21849a = i10;
        this.f21850b = d6Var;
        z Y = org.telegram.ui.ActionBar.i6.Y(822083583, 8, 8);
        this.E = Y;
        Y.setCallback(this);
        j9Var.f27752p = AndroidUtilities.dp(50.0f);
        j9Var.f27751o = AndroidUtilities.dp(13.0f);
        j9Var.f27759x = false;
        j9Var.f27755s = AndroidUtilities.dp(13.0f);
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
        this.f21856s = Math.max(this.f21856s, abVar.f21814a.f26266c);
        float f7 = this.v;
        float f10 = abVar.f21815b.f26266c;
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
        this.f21851c = j3;
        this.K = 0.0f;
        this.J = 0.0f;
        this.f21856s = 0.0f;
        this.v = 0.0f;
        this.h.clear();
        int i11 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        this.J += AndroidUtilities.dp(14.0f);
        f11 f11Var = new f11(DialogObject.getName(j3), 14.0f, AndroidUtilities.bold());
        this.d = f11Var;
        this.J = f11Var.j() + AndroidUtilities.dp(3.0f) + this.J;
        int i12 = this.f21849a;
        if (ContactsController.getInstance(i12).isContact(j3)) {
            i10 = R.string.ContactInfoIsContact;
        } else {
            i10 = R.string.ContactInfoIsNotContact;
        }
        f11 f11Var2 = new f11(LocaleController.getString(i10), 14.0f, null);
        this.f21852e = f11Var2;
        this.J = f11Var2.j() + AndroidUtilities.dp(11.0f) + this.J;
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
                this.f21854n = a(LocaleController.formatPluralString("Groups", max, new Object[0]), LocaleController.getString(R.string.ContactInfoCommonGroups), true);
                int min = Math.min(3, this.I.chats.size());
                org.telegram.ui.Components.j9 j9Var = this.G;
                j9Var.k(min);
                for (int i14 = 0; i14 < Math.min(3, this.I.chats.size()); i14++) {
                    j9Var.l(i14, this.I.chats.get(i14), i12);
                }
                j9Var.b(true, true);
            } else {
                this.I = null;
                this.f21854n = null;
            }
        } else {
            this.I = null;
            this.f21854n = null;
        }
        this.f21855r = this.f21856s + AndroidUtilities.dp(7.66f) + this.v;
        if (user != null && !user.verified && !UserObject.isService(user.f20194id)) {
            if (user.bot_verification_icon != 0) {
                if (userFull != null && (botverification = userFull.bot_verification) != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("i  ");
                    this.f21853f = new f11(spannableStringBuilder, 12.0f, null);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.z5(botverification.icon, this.f21853f.f26264a.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) botverification.description);
                    f11 f11Var3 = new f11(spannableStringBuilder, 12.0f, null);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    f11Var3.a();
                    f11Var3.n(5);
                    Point point = AndroidUtilities.displaySize;
                    f11Var3.q(Math.min(point.x, point.y) * 0.5f);
                    f11Var3.s(this);
                    this.f21853f = f11Var3;
                    this.J = this.f21853f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.J;
                } else {
                    this.f21853f = null;
                    this.J += AndroidUtilities.dp(14.0f);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
                rq rqVar = new rq(R.drawable.filled_info, 0);
                rqVar.setScale(0.55f, -0.55f);
                rqVar.translate(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(-1.0f));
                spannableStringBuilder2.setSpan(rqVar, 0, 1, 33);
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ContactInfoNotVerified));
                this.f21853f = new f11(spannableStringBuilder2, 12.0f, null);
                this.J = this.f21853f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.J;
            }
        } else {
            this.f21853f = null;
            this.J += AndroidUtilities.dp(14.0f);
        }
        float max2 = Math.max(this.K, this.d.l());
        this.K = max2;
        float max3 = Math.max(max2, this.f21852e.l());
        this.K = max3;
        float max4 = Math.max(max3, this.f21855r);
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
        int i13 = this.f21849a;
        if (i10 == i12) {
            long longValue = ((Long) objArr[0]).longValue();
            long j3 = this.f21851c;
            if (longValue == j3) {
                b(j3, MessagesController.getInstance(i13).getPeerSettings(this.f21851c));
            }
        } else if (i10 == NotificationCenter.commonChatsLoaded && ((Long) objArr[0]).longValue() == this.f21851c) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i13).getCommonChats(this.f21851c);
            this.I = commonChats;
            int count = commonChats.getCount();
            ab abVar = this.f21854n;
            if (abVar != null && count > 0) {
                abVar.f21815b = new f11(LocaleController.formatPluralString("Groups", count, new Object[0]), 12.0f, AndroidUtilities.bold());
                int min = Math.min(3, this.I.chats.size());
                org.telegram.ui.Components.j9 j9Var = this.G;
                j9Var.k(min);
                for (int i14 = 0; i14 < Math.min(3, this.I.chats.size()); i14++) {
                    j9Var.l(i14, this.I.chats.get(i14), i13);
                }
                j9Var.b(true, true);
            } else {
                b(this.f21851c, MessagesController.getInstance(i13).getPeerSettings(this.f21851c));
                requestLayout();
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f21849a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.commonChatsLoaded);
        this.G.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f21849a;
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
        RectF rectF = this.f21857w;
        rectF.set((getWidth() - this.K) / 2.0f, (getHeight() - this.J) / 2.0f, (getWidth() + this.K) / 2.0f, (getHeight() + this.J) / 2.0f);
        float f11 = 0.025f;
        float a2 = this.f21858x.a(0.025f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i10 = this.M;
        float x10 = getX();
        float f12 = this.L;
        org.telegram.ui.ActionBar.d6 d6Var = this.f21850b;
        if (d6Var != null) {
            d6Var.m(x10, f12, measuredWidth, i10);
        } else {
            org.telegram.ui.ActionBar.i6.q(x10, f12, measuredWidth, i10);
        }
        float f13 = 16.0f;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.T0("paintChatActionBackground", d6Var));
        if (d6Var != null) {
            a12 = d6Var.r0();
        } else {
            a12 = org.telegram.ui.ActionBar.i6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.T0("paintChatActionBackgroundDarken", d6Var));
        }
        float f14 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.J) / 2.0f);
        float A = com.google.android.gms.internal.vision.e2.A(getHeight(), this.J, 2.0f, 0.0f);
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float dp = A + AndroidUtilities.dp(14.0f);
        f11 f11Var = this.d;
        f11Var.f26277p = this.K - AndroidUtilities.dp(32.0f);
        f11Var.c(width - (this.d.l() / 2.0f), this.d.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, this.d.j() + AndroidUtilities.dp(3.0f));
        float j3 = dp + this.d.j() + AndroidUtilities.dp(3.0f);
        f11 f11Var2 = this.f21852e;
        f11Var2.f26277p = this.K - AndroidUtilities.dp(32.0f);
        f11Var2.c(width - (this.f21852e.l() / 2.0f), this.f21852e.j() / 2.0f, 0.7f, -1, canvas);
        canvas.translate(0.0f, this.f21852e.j() + AndroidUtilities.dp(11.0f));
        float j10 = this.f21852e.j() + AndroidUtilities.dp(11.0f) + j3;
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
            float dp2 = (width - (this.K / f10)) + AndroidUtilities.dp(f13) + this.f21856s;
            float f15 = j10;
            f11 f11Var3 = abVar.f21814a;
            boolean z11 = abVar.f21816c;
            RectF rectF2 = abVar.d;
            float f16 = dp2 - f11Var3.f26266c;
            float dp3 = (width - (this.K / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f21856s + AndroidUtilities.dp(7.66f);
            f11Var3.f26277p = (dp3 - f16) - AndroidUtilities.dp(7.66f);
            f11Var3.c(f16, f11Var3.j() / 2.0f, 0.7f, -1, canvas);
            float dp4 = (width - (this.K / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f21856s + AndroidUtilities.dp(7.66f);
            float dp5 = (width - (this.K / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f21856s + AndroidUtilities.dp(7.66f) + abVar.f21815b.f26266c;
            org.telegram.ui.Components.j9 j9Var = this.G;
            Drawable drawable = this.H;
            if (z11) {
                f7 = j9Var.A + (drawable.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f);
            } else {
                f7 = 0.0f;
            }
            rectF2.set(dp4, f15, dp5 + f7, abVar.f21815b.j() + f15);
            if (this.f21854n == abVar) {
                RectF rectF3 = this.f21859y;
                rectF3.set(rectF2);
                rectF3.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(2.0f));
                float a10 = this.F.a(f11);
                canvas.scale(a10, a10, rectF3.centerX(), abVar.f21815b.j() / 2.0f);
                z zVar = this.E;
                if (zVar != null) {
                    zVar.setBounds((int) rectF3.left, (int) (rectF3.top - f15), (int) rectF3.right, (int) (rectF3.bottom - f15));
                    zVar.draw(canvas);
                }
            }
            f11 f11Var4 = abVar.f21815b;
            f11Var4.f26277p = (((this.K / 2.0f) + width) - AndroidUtilities.dp(8.0f)) - dp3;
            f11Var4.c(dp3, abVar.f21815b.j() / 2.0f, 1.0f, -1, canvas);
            if (z11) {
                canvas.save();
                canvas.translate((width - (this.K / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f21856s + AndroidUtilities.dp(7.66f) + abVar.f21815b.f26266c + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
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
        if (this.f21853f != null) {
            canvas.translate(0.0f, AndroidUtilities.dp(12.0f));
            f11 f11Var5 = this.f21853f;
            if (f11Var5.f26268f > 1) {
                z10 = true;
            }
            if (z10) {
                f11Var5.c(width - (f11Var5.l() / 2.0f), 0.0f, 0.7f, -1, canvas);
            } else {
                f11Var5.f26277p = this.K - AndroidUtilities.dp(32.0f);
                f11Var5.c(width - (this.f21853f.l() / 2.0f), this.f21853f.j() / 2.0f, 0.7f, -1, canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.q.y(16.0f, (int) this.J, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        nj njVar;
        if (this.f21854n != null && this.f21859y.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && this.f21857w.contains(motionEvent.getX(), motionEvent.getY())) {
            z11 = true;
        } else {
            z11 = false;
        }
        int action = motionEvent.getAction();
        z zVar = this.E;
        zc zcVar = this.F;
        zc zcVar2 = this.f21858x;
        if (action == 0) {
            zcVar2.c(z11);
            zcVar.c(z10);
            zVar.setState(z10 ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (zcVar2.h) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if ((U instanceof yn) && (njVar = ((yn) U).Y0) != null) {
                    njVar.e(true, false);
                }
            } else if (zcVar.h) {
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    Bundle bundle = new Bundle();
                    long j3 = this.f21851c;
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
            zcVar.c(false);
            zcVar2.c(false);
            zVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            zcVar.c(false);
            zcVar2.c(false);
            zVar.setState(new int[0]);
        }
        if (zcVar.h || zcVar2.h) {
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
