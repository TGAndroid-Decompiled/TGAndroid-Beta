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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gj;
import org.telegram.ui.tn;
public final class ua extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int K = 0;
    public final z A;
    public final uc B;
    public final org.telegram.ui.Components.g9 C;
    public final Drawable D;
    public MessagesController.CommonChatsList E;
    public float F;
    public float G;
    public float H;
    public int I;
    public boolean J;
    public final int f25746a;
    public final org.telegram.ui.ActionBar.c6 f25747b;
    public long f25748c;
    public zz0 d;
    public zz0 f25749e;
    public zz0 f25750f;
    public final ArrayList h;
    public ta f25751n;
    public float f25752r;
    public float f25753s;
    public float v;
    public final RectF f25754w;
    public final uc f25755x;
    public final RectF f25756y;

    public ua(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = new ArrayList();
        this.f25754w = new RectF();
        this.f25755x = new uc(this);
        this.f25756y = new RectF();
        this.B = new uc(this);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(this, false);
        this.C = g9Var;
        this.f25746a = i10;
        this.f25747b = c6Var;
        z Y = org.telegram.ui.ActionBar.g6.Y(822083583, 8, 8);
        this.A = Y;
        Y.setCallback(this);
        g9Var.f28836p = AndroidUtilities.dp(50.0f);
        g9Var.f28835o = AndroidUtilities.dp(13.0f);
        g9Var.f28843x = false;
        g9Var.f28839s = AndroidUtilities.dp(13.0f);
        g9Var.j(AndroidUtilities.dp(18.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.D = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final ta a(CharSequence charSequence, String str, boolean z10) {
        int i10;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.F += AndroidUtilities.dp(7.0f);
        }
        ta taVar = new ta(str, charSequence, z10);
        arrayList.add(taVar);
        this.F += AndroidUtilities.dp(14.0f);
        this.f25753s = Math.max(this.f25753s, taVar.f25710a.f35462c);
        float f9 = this.v;
        float f10 = taVar.f25711b.f35462c;
        if (z10) {
            i10 = AndroidUtilities.dp(38.0f);
        } else {
            i10 = 0;
        }
        this.v = Math.max(f9, f10 + i10);
        return taVar;
    }

    public final void b(long j10, TLRPC.PeerSettings peerSettings) {
        int i10;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TL_bots.botVerification botverification;
        this.f25748c = j10;
        this.G = 0.0f;
        this.F = 0.0f;
        this.f25753s = 0.0f;
        this.v = 0.0f;
        this.h.clear();
        int i11 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        this.F += AndroidUtilities.dp(14.0f);
        zz0 zz0Var = new zz0(DialogObject.getName(j10), 14.0f, AndroidUtilities.bold());
        this.d = zz0Var;
        this.F = zz0Var.j() + AndroidUtilities.dp(3.0f) + this.F;
        int i12 = this.f25746a;
        if (ContactsController.getInstance(i12).isContact(j10)) {
            i10 = R.string.ContactInfoIsContact;
        } else {
            i10 = R.string.ContactInfoIsNotContact;
        }
        zz0 zz0Var2 = new zz0(LocaleController.getString(i10), 14.0f, null);
        this.f25749e = zz0Var2;
        this.F = zz0Var2.j() + AndroidUtilities.dp(11.0f) + this.F;
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
            this.E = commonChats;
            int max = Math.max(userFull.common_chats_count, commonChats.getCount());
            if (max > 0) {
                this.f25751n = a(LocaleController.formatPluralString("Groups", max, new Object[0]), LocaleController.getString(R.string.ContactInfoCommonGroups), true);
                int min = Math.min(3, this.E.chats.size());
                org.telegram.ui.Components.g9 g9Var = this.C;
                g9Var.k(min);
                for (int i14 = 0; i14 < Math.min(3, this.E.chats.size()); i14++) {
                    g9Var.l(i14, this.E.chats.get(i14), i12);
                }
                g9Var.b(true, true);
            } else {
                this.E = null;
                this.f25751n = null;
            }
        } else {
            this.E = null;
            this.f25751n = null;
        }
        this.f25752r = this.f25753s + AndroidUtilities.dp(7.66f) + this.v;
        if (user != null && !user.verified && !UserObject.isService(user.f22539id)) {
            if (user.bot_verification_icon != 0) {
                if (userFull != null && (botverification = userFull.bot_verification) != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("i  ");
                    this.f25750f = new zz0(spannableStringBuilder, 12.0f, null);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(botverification.icon, this.f25750f.f35460a.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) botverification.description);
                    zz0 zz0Var3 = new zz0(spannableStringBuilder, 12.0f, null);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    zz0Var3.a();
                    zz0Var3.n(5);
                    Point point = AndroidUtilities.displaySize;
                    zz0Var3.q(Math.min(point.x, point.y) * 0.5f);
                    zz0Var3.s(this);
                    this.f25750f = zz0Var3;
                    this.F = this.f25750f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.F;
                } else {
                    this.f25750f = null;
                    this.F += AndroidUtilities.dp(14.0f);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
                iq iqVar = new iq(R.drawable.filled_info, 0);
                iqVar.setScale(0.55f, -0.55f);
                iqVar.translate(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(-1.0f));
                spannableStringBuilder2.setSpan(iqVar, 0, 1, 33);
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ContactInfoNotVerified));
                this.f25750f = new zz0(spannableStringBuilder2, 12.0f, null);
                this.F = this.f25750f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.F;
            }
        } else {
            this.f25750f = null;
            this.F += AndroidUtilities.dp(14.0f);
        }
        float max2 = Math.max(this.G, this.d.l());
        this.G = max2;
        float max3 = Math.max(max2, this.f25749e.l());
        this.G = max3;
        float max4 = Math.max(max3, this.f25752r);
        this.G = max4;
        this.G = Math.min(max4 + AndroidUtilities.dp(32.0f), i11);
    }

    public final void c(float f9, int i10) {
        if (Math.abs(this.H - f9) > 0.01f || i10 != this.I) {
            invalidate();
        }
        this.I = i10;
        this.H = f9;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.userInfoDidLoad;
        int i13 = this.f25746a;
        if (i10 == i12) {
            long longValue = ((Long) objArr[0]).longValue();
            long j10 = this.f25748c;
            if (longValue == j10) {
                b(j10, MessagesController.getInstance(i13).getPeerSettings(this.f25748c));
            }
        } else if (i10 == NotificationCenter.commonChatsLoaded && ((Long) objArr[0]).longValue() == this.f25748c) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i13).getCommonChats(this.f25748c);
            this.E = commonChats;
            int count = commonChats.getCount();
            ta taVar = this.f25751n;
            if (taVar != null && count > 0) {
                taVar.f25711b = new zz0(LocaleController.formatPluralString("Groups", count, new Object[0]), 12.0f, AndroidUtilities.bold());
                int min = Math.min(3, this.E.chats.size());
                org.telegram.ui.Components.g9 g9Var = this.C;
                g9Var.k(min);
                for (int i14 = 0; i14 < Math.min(3, this.E.chats.size()); i14++) {
                    g9Var.l(i14, this.E.chats.get(i14), i13);
                }
                g9Var.b(true, true);
            } else {
                b(this.f25748c, MessagesController.getInstance(i13).getPeerSettings(this.f25748c));
                requestLayout();
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f25746a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.commonChatsLoaded);
        this.C.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f25746a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.commonChatsLoaded);
        this.C.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean a12;
        float f9;
        super.onDraw(canvas);
        canvas.save();
        float f10 = 2.0f;
        float width = getWidth() / 2.0f;
        RectF rectF = this.f25754w;
        rectF.set((getWidth() - this.G) / 2.0f, (getHeight() - this.F) / 2.0f, (getWidth() + this.G) / 2.0f, (getHeight() + this.F) / 2.0f);
        float f11 = 0.025f;
        float a2 = this.f25755x.a(0.025f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i10 = this.I;
        float x4 = getX();
        float f12 = this.H;
        org.telegram.ui.ActionBar.c6 c6Var = this.f25747b;
        if (c6Var != null) {
            c6Var.l(x4, f12, measuredWidth, i10);
        } else {
            org.telegram.ui.ActionBar.g6.q(x4, f12, measuredWidth, i10);
        }
        float f13 = 16.0f;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.T0("paintChatActionBackground", c6Var));
        if (c6Var != null) {
            a12 = c6Var.l0();
        } else {
            a12 = org.telegram.ui.ActionBar.g6.a1();
        }
        if (a12) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.T0("paintChatActionBackgroundDarken", c6Var));
        }
        float f14 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.F) / 2.0f);
        float A = com.google.android.recaptcha.internal.a.A(getHeight(), this.F, 2.0f, 0.0f);
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float dp = A + AndroidUtilities.dp(14.0f);
        zz0 zz0Var = this.d;
        zz0Var.f35473p = this.G - AndroidUtilities.dp(32.0f);
        zz0Var.c(width - (this.d.l() / 2.0f), this.d.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, this.d.j() + AndroidUtilities.dp(3.0f));
        float j10 = dp + this.d.j() + AndroidUtilities.dp(3.0f);
        zz0 zz0Var2 = this.f25749e;
        zz0Var2.f35473p = this.G - AndroidUtilities.dp(32.0f);
        zz0Var2.c(width - (this.f25749e.l() / 2.0f), this.f25749e.j() / 2.0f, 0.7f, -1, canvas);
        canvas.translate(0.0f, this.f25749e.j() + AndroidUtilities.dp(11.0f));
        float j11 = this.f25749e.j() + AndroidUtilities.dp(11.0f) + j10;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 > 0) {
                canvas.translate(f14, AndroidUtilities.dp(7.0f));
                j11 += AndroidUtilities.dp(7.0f);
            }
            canvas.save();
            ta taVar = (ta) arrayList.get(i11);
            float dp2 = (width - (this.G / f10)) + AndroidUtilities.dp(f13) + this.f25753s;
            float f15 = j11;
            zz0 zz0Var3 = taVar.f25710a;
            boolean z11 = taVar.f25712c;
            RectF rectF2 = taVar.d;
            float f16 = dp2 - zz0Var3.f35462c;
            float dp3 = (width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f25753s + AndroidUtilities.dp(7.66f);
            zz0Var3.f35473p = (dp3 - f16) - AndroidUtilities.dp(7.66f);
            zz0Var3.c(f16, zz0Var3.j() / 2.0f, 0.7f, -1, canvas);
            float dp4 = (width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f25753s + AndroidUtilities.dp(7.66f);
            float dp5 = (width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f25753s + AndroidUtilities.dp(7.66f) + taVar.f25711b.f35462c;
            org.telegram.ui.Components.g9 g9Var = this.C;
            Drawable drawable = this.D;
            if (z11) {
                f9 = g9Var.A + (drawable.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f);
            } else {
                f9 = 0.0f;
            }
            rectF2.set(dp4, f15, dp5 + f9, taVar.f25711b.j() + f15);
            if (this.f25751n == taVar) {
                RectF rectF3 = this.f25756y;
                rectF3.set(rectF2);
                rectF3.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(2.0f));
                float a10 = this.B.a(f11);
                canvas.scale(a10, a10, rectF3.centerX(), taVar.f25711b.j() / 2.0f);
                z zVar = this.A;
                if (zVar != null) {
                    zVar.setBounds((int) rectF3.left, (int) (rectF3.top - f15), (int) rectF3.right, (int) (rectF3.bottom - f15));
                    zVar.draw(canvas);
                }
            }
            zz0 zz0Var4 = taVar.f25711b;
            zz0Var4.f35473p = (((this.G / 2.0f) + width) - AndroidUtilities.dp(8.0f)) - dp3;
            zz0Var4.c(dp3, taVar.f25711b.j() / 2.0f, 1.0f, -1, canvas);
            if (z11) {
                canvas.save();
                canvas.translate((width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f25753s + AndroidUtilities.dp(7.66f) + taVar.f25711b.f35462c + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                g9Var.i(canvas);
                canvas.translate(g9Var.A + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(13.0f) / 2.0f);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / 2.0f), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / 2.0f));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
            j11 = AndroidUtilities.dp(14.0f) + f15;
            i11++;
            f10 = 2.0f;
            f11 = 0.025f;
            f14 = 0.0f;
            f13 = 16.0f;
        }
        if (this.f25750f != null) {
            canvas.translate(0.0f, AndroidUtilities.dp(12.0f));
            zz0 zz0Var5 = this.f25750f;
            if (zz0Var5.f35464f > 1) {
                z10 = true;
            }
            if (z10) {
                zz0Var5.c(width - (zz0Var5.l() / 2.0f), 0.0f, 0.7f, -1, canvas);
            } else {
                zz0Var5.f35473p = this.G - AndroidUtilities.dp(32.0f);
                zz0Var5.c(width - (this.f25750f.l() / 2.0f), this.f25750f.j() / 2.0f, 0.7f, -1, canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.x3.b(16.0f, (int) this.F, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        gj gjVar;
        if (this.f25751n != null && this.f25756y.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && this.f25754w.contains(motionEvent.getX(), motionEvent.getY())) {
            z11 = true;
        } else {
            z11 = false;
        }
        int action = motionEvent.getAction();
        z zVar = this.A;
        uc ucVar = this.B;
        uc ucVar2 = this.f25755x;
        if (action == 0) {
            ucVar2.c(z11);
            ucVar.c(z10);
            zVar.setState(z10 ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (ucVar2.h) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if ((U instanceof tn) && (gjVar = ((tn) U).W0) != null) {
                    gjVar.e(true, false);
                }
            } else if (ucVar.h) {
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    Bundle bundle = new Bundle();
                    long j10 = this.f25748c;
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
            ucVar.c(false);
            ucVar2.c(false);
            zVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            ucVar.c(false);
            ucVar2.c(false);
            zVar.setState(new int[0]);
        }
        if (ucVar.h || ucVar2.h) {
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
