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
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fj;
import org.telegram.ui.rn;

public final class ua extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int K = 0;
    public final z A;
    public final nc B;
    public final org.telegram.ui.Components.a9 C;
    public final Drawable D;
    public MessagesController.CommonChatsList E;
    public float F;
    public float G;
    public float H;
    public int I;
    public boolean J;

    public final int f25716a;

    public final org.telegram.ui.ActionBar.c6 f25717b;

    public long f25718c;
    public pz0 d;

    public pz0 f25719e;

    public pz0 f25720f;
    public final ArrayList h;

    public ta f25721n;

    public float f25722r;

    public float f25723s;
    public float v;

    public final RectF f25724w;

    public final nc f25725x;

    public final RectF f25726y;

    public ua(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = new ArrayList();
        this.f25724w = new RectF();
        this.f25725x = new nc(this);
        this.f25726y = new RectF();
        this.B = new nc(this);
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9(this, false);
        this.C = a9Var;
        this.f25716a = i10;
        this.f25717b = c6Var;
        z zVarY = org.telegram.ui.ActionBar.g6.Y(822083583, 8, 8);
        this.A = zVarY;
        zVarY.setCallback(this);
        a9Var.f26675p = AndroidUtilities.dp(50.0f);
        a9Var.f26674o = AndroidUtilities.dp(13.0f);
        a9Var.f26682x = false;
        a9Var.f26678s = AndroidUtilities.dp(13.0f);
        a9Var.j(AndroidUtilities.dp(18.0f));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.D = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final ta a(CharSequence charSequence, String str, boolean z10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.F += AndroidUtilities.dp(7.0f);
        }
        ta taVar = new ta(str, charSequence, z10);
        arrayList.add(taVar);
        this.F += AndroidUtilities.dp(14.0f);
        this.f25723s = Math.max(this.f25723s, taVar.f25686a.f31697c);
        this.v = Math.max(this.v, taVar.f25687b.f31697c + (z10 ? AndroidUtilities.dp(38.0f) : 0));
        return taVar;
    }

    public final void b(long j10, TLRPC.PeerSettings peerSettings) {
        TL_bots.botVerification botverification;
        this.f25718c = j10;
        this.G = 0.0f;
        this.F = 0.0f;
        this.f25723s = 0.0f;
        this.v = 0.0f;
        this.h.clear();
        int i10 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        this.F += AndroidUtilities.dp(14.0f);
        pz0 pz0Var = new pz0(DialogObject.getName(j10), 14.0f, AndroidUtilities.bold());
        this.d = pz0Var;
        this.F = pz0Var.j() + AndroidUtilities.dp(3.0f) + this.F;
        int i11 = this.f25716a;
        pz0 pz0Var2 = new pz0(LocaleController.getString(ContactsController.getInstance(i11).isContact(j10) ? R.string.ContactInfoIsContact : R.string.ContactInfoIsNotContact), 14.0f, null);
        this.f25719e = pz0Var2;
        this.F = pz0Var2.j() + AndroidUtilities.dp(11.0f) + this.F;
        if (peerSettings != null && peerSettings.phone_country != null) {
            a(LocaleController.getCountryWithFlag(peerSettings.phone_country, 12, R.string.ContactInfoPhoneFragment), LocaleController.getString(R.string.ContactInfoPhone), false);
        }
        if (peerSettings != null && peerSettings.registration_month != null) {
            String string = LocaleController.getString(R.string.ContactInfoRegistration);
            String yearMont = peerSettings.registration_month;
            String[] strArrSplit = yearMont.split("\\.");
            if (strArrSplit.length == 2) {
                int i12 = Integer.parseInt(strArrSplit[0]);
                int i13 = Integer.parseInt(strArrSplit[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(i13, i12 - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                yearMont = LocaleController.formatYearMont(calendar.getTimeInMillis() / 1000, true);
            }
            a(yearMont, string, false);
        }
        TLRPC.User user = j10 < 0 ? null : MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        TLRPC.UserFull userFull = j10 < 0 ? null : MessagesController.getInstance(i11).getUserFull(j10);
        if (userFull == null && j10 > 0) {
            MessagesController.getInstance(i11).loadUserInfo(MessagesController.getInstance(i11).getUser(Long.valueOf(j10)), true, 0);
        }
        if (userFull != null) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i11).getCommonChats(j10);
            this.E = commonChats;
            int iMax = Math.max(userFull.common_chats_count, commonChats.getCount());
            if (iMax > 0) {
                this.f25721n = a(LocaleController.formatPluralString("Groups", iMax, new Object[0]), LocaleController.getString(R.string.ContactInfoCommonGroups), true);
                int iMin = Math.min(3, this.E.chats.size());
                org.telegram.ui.Components.a9 a9Var = this.C;
                a9Var.k(iMin);
                for (int i14 = 0; i14 < Math.min(3, this.E.chats.size()); i14++) {
                    a9Var.l(i14, this.E.chats.get(i14), i11);
                }
                a9Var.b(true, true);
            } else {
                this.E = null;
                this.f25721n = null;
            }
        } else {
            this.E = null;
            this.f25721n = null;
        }
        this.f25722r = this.f25723s + AndroidUtilities.dp(7.66f) + this.v;
        if (user == null || user.verified || UserObject.isService(user.f22527id)) {
            this.f25720f = null;
            this.F += AndroidUtilities.dp(14.0f);
        } else if (user.bot_verification_icon == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("i  ");
            cq cqVar = new cq(R.drawable.filled_info, 0);
            cqVar.setScale(0.55f, -0.55f);
            cqVar.translate(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(-1.0f));
            spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ContactInfoNotVerified));
            this.f25720f = new pz0(spannableStringBuilder, 12.0f, null);
            this.F = this.f25720f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.F;
        } else if (userFull == null || (botverification = userFull.bot_verification) == null) {
            this.f25720f = null;
            this.F += AndroidUtilities.dp(14.0f);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
            this.f25720f = new pz0(spannableStringBuilder2, 12.0f, null);
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(botverification.icon, this.f25720f.f31695a.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) botverification.description);
            pz0 pz0Var3 = new pz0(spannableStringBuilder2, 12.0f, null);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            pz0Var3.a();
            pz0Var3.n(5);
            Point point = AndroidUtilities.displaySize;
            pz0Var3.q(Math.min(point.x, point.y) * 0.5f);
            pz0Var3.s(this);
            this.f25720f = pz0Var3;
            this.F = this.f25720f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.F;
        }
        float fMax = Math.max(this.G, this.d.l());
        this.G = fMax;
        float fMax2 = Math.max(fMax, this.f25719e.l());
        this.G = fMax2;
        float fMax3 = Math.max(fMax2, this.f25722r);
        this.G = fMax3;
        this.G = Math.min(fMax3 + AndroidUtilities.dp(32.0f), i10);
    }

    public final void c(float f10, int i10) {
        if (Math.abs(this.H - f10) > 0.01f || i10 != this.I) {
            invalidate();
        }
        this.I = i10;
        this.H = f10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.userInfoDidLoad;
        int i13 = this.f25716a;
        if (i10 == i12) {
            long jLongValue = ((Long) objArr[0]).longValue();
            long j10 = this.f25718c;
            if (jLongValue == j10) {
                b(j10, MessagesController.getInstance(i13).getPeerSettings(this.f25718c));
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.commonChatsLoaded && ((Long) objArr[0]).longValue() == this.f25718c) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i13).getCommonChats(this.f25718c);
            this.E = commonChats;
            int count = commonChats.getCount();
            ta taVar = this.f25721n;
            if (taVar == null || count <= 0) {
                b(this.f25718c, MessagesController.getInstance(i13).getPeerSettings(this.f25718c));
                requestLayout();
            } else {
                taVar.f25687b = new pz0(LocaleController.formatPluralString("Groups", count, new Object[0]), 12.0f, AndroidUtilities.bold());
                int iMin = Math.min(3, this.E.chats.size());
                org.telegram.ui.Components.a9 a9Var = this.C;
                a9Var.k(iMin);
                for (int i14 = 0; i14 < Math.min(3, this.E.chats.size()); i14++) {
                    a9Var.l(i14, this.E.chats.get(i14), i13);
                }
                a9Var.b(true, true);
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f25716a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.commonChatsLoaded);
        this.C.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f25716a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.commonChatsLoaded);
        this.C.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float intrinsicWidth;
        super.onDraw(canvas);
        canvas.save();
        float f10 = 2.0f;
        float width = getWidth() / 2.0f;
        float width2 = (getWidth() - this.G) / 2.0f;
        float height = (getHeight() - this.F) / 2.0f;
        float width3 = (getWidth() + this.G) / 2.0f;
        float height2 = (getHeight() + this.F) / 2.0f;
        RectF rectF = this.f25724w;
        rectF.set(width2, height, width3, height2);
        float f11 = 0.025f;
        float fA = this.f25725x.a(0.025f);
        canvas.scale(fA, fA, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i10 = this.I;
        float x8 = getX();
        float f12 = this.H;
        org.telegram.ui.ActionBar.c6 c6Var = this.f25717b;
        if (c6Var != null) {
            c6Var.m(x8, f12, measuredWidth, i10);
        } else {
            org.telegram.ui.ActionBar.g6.q(x8, f12, measuredWidth, i10);
        }
        float f13 = 16.0f;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.T0("paintChatActionBackground", c6Var));
        if (c6Var != null ? c6Var.u0() : org.telegram.ui.ActionBar.g6.a1()) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.T0("paintChatActionBackgroundDarken", c6Var));
        }
        float f14 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.F) / 2.0f);
        float fA2 = com.google.android.recaptcha.internal.a.A(getHeight(), this.F, 2.0f, 0.0f);
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float fDp = fA2 + AndroidUtilities.dp(14.0f);
        pz0 pz0Var = this.d;
        pz0Var.f31708p = this.G - AndroidUtilities.dp(32.0f);
        pz0Var.c(width - (this.d.l() / 2.0f), this.d.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, this.d.j() + AndroidUtilities.dp(3.0f));
        float fJ = fDp + this.d.j() + AndroidUtilities.dp(3.0f);
        pz0 pz0Var2 = this.f25719e;
        pz0Var2.f31708p = this.G - AndroidUtilities.dp(32.0f);
        pz0Var2.c(width - (this.f25719e.l() / 2.0f), this.f25719e.j() / 2.0f, 0.7f, -1, canvas);
        canvas.translate(0.0f, this.f25719e.j() + AndroidUtilities.dp(11.0f));
        float fJ2 = this.f25719e.j() + AndroidUtilities.dp(11.0f) + fJ;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 > 0) {
                canvas.translate(f14, AndroidUtilities.dp(7.0f));
                fJ2 += AndroidUtilities.dp(7.0f);
            }
            canvas.save();
            ta taVar = (ta) arrayList.get(i11);
            float fDp2 = (width - (this.G / f10)) + AndroidUtilities.dp(f13) + this.f25723s;
            float f15 = fJ2;
            pz0 pz0Var3 = taVar.f25686a;
            boolean z10 = taVar.f25688c;
            RectF rectF2 = taVar.d;
            float f16 = fDp2 - pz0Var3.f31697c;
            float fDp3 = (width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f25723s + AndroidUtilities.dp(7.66f);
            pz0Var3.f31708p = (fDp3 - f16) - AndroidUtilities.dp(7.66f);
            pz0Var3.c(f16, pz0Var3.j() / 2.0f, 0.7f, -1, canvas);
            float fDp4 = (width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f25723s + AndroidUtilities.dp(7.66f);
            float fDp5 = (width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f25723s + AndroidUtilities.dp(7.66f) + taVar.f25687b.f31697c;
            org.telegram.ui.Components.a9 a9Var = this.C;
            Drawable drawable = this.D;
            if (z10) {
                intrinsicWidth = a9Var.A + (drawable.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f);
            } else {
                intrinsicWidth = 0.0f;
            }
            rectF2.set(fDp4, f15, fDp5 + intrinsicWidth, taVar.f25687b.j() + f15);
            if (this.f25721n == taVar) {
                RectF rectF3 = this.f25726y;
                rectF3.set(rectF2);
                rectF3.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(2.0f));
                float fA3 = this.B.a(f11);
                canvas.scale(fA3, fA3, rectF3.centerX(), taVar.f25687b.j() / 2.0f);
                z zVar = this.A;
                if (zVar != null) {
                    zVar.setBounds((int) rectF3.left, (int) (rectF3.top - f15), (int) rectF3.right, (int) (rectF3.bottom - f15));
                    zVar.draw(canvas);
                }
            }
            pz0 pz0Var4 = taVar.f25687b;
            pz0Var4.f31708p = (((this.G / 2.0f) + width) - AndroidUtilities.dp(8.0f)) - fDp3;
            pz0Var4.c(fDp3, taVar.f25687b.j() / 2.0f, 1.0f, -1, canvas);
            if (z10) {
                canvas.save();
                canvas.translate((width - (this.G / 2.0f)) + AndroidUtilities.dp(16.0f) + this.f25723s + AndroidUtilities.dp(7.66f) + taVar.f25687b.f31697c + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                a9Var.i(canvas);
                canvas.translate(a9Var.A + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(13.0f) / 2.0f);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / 2.0f), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / 2.0f));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
            fJ2 = AndroidUtilities.dp(14.0f) + f15;
            i11++;
            f10 = 2.0f;
            f11 = 0.025f;
            f14 = 0.0f;
            f13 = 16.0f;
        }
        if (this.f25720f != null) {
            canvas.translate(0.0f, AndroidUtilities.dp(12.0f));
            pz0 pz0Var5 = this.f25720f;
            if (pz0Var5.f31699f > 1) {
                pz0Var5.c(width - (pz0Var5.l() / 2.0f), 0.0f, 0.7f, -1, canvas);
            } else {
                pz0Var5.f31708p = this.G - AndroidUtilities.dp(32.0f);
                pz0Var5.c(width - (this.f25720f.l() / 2.0f), this.f25720f.j() / 2.0f, 0.7f, -1, canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.y1.b(16.0f, (int) this.F, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fj fjVar;
        boolean z10 = this.f25721n != null && this.f25726y.contains(motionEvent.getX(), motionEvent.getY());
        boolean z11 = !z10 && this.f25724w.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        z zVar = this.A;
        nc ncVar = this.B;
        nc ncVar2 = this.f25725x;
        if (action == 0) {
            ncVar2.c(z11);
            ncVar.c(z10);
            zVar.setState(z10 ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (ncVar2.h) {
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if ((n2VarU instanceof rn) && (fjVar = ((rn) n2VarU).W0) != null) {
                    fjVar.e(true, false);
                }
            } else if (ncVar.h) {
                org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                if (n2VarU2 != null) {
                    Bundle bundle = new Bundle();
                    long j10 = this.f25718c;
                    if (j10 >= 0) {
                        bundle.putLong("user_id", j10);
                    } else {
                        bundle.putLong("chat_id", -j10);
                    }
                    bundle.putBoolean("open_common", true);
                    n2VarU2.presentFragment(new ProfileActivity(bundle, null));
                }
                invalidate();
            }
            ncVar.c(false);
            ncVar2.c(false);
            zVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            ncVar.c(false);
            ncVar2.c(false);
            zVar.setState(new int[0]);
        }
        return ncVar.h || ncVar2.h;
    }

    public void setAnimating(boolean z10) {
        this.J = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.A || super.verifyDrawable(drawable);
    }
}
