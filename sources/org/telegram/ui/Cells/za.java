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
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.l11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qj;
import org.telegram.ui.zn;
public final class za extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int O = 0;
    public final z E;
    public final bd F;
    public final org.telegram.ui.Components.l9 G;
    public final Drawable H;
    public MessagesController.CommonChatsList I;
    public float J;
    public float K;
    public float L;
    public int M;
    public boolean N;
    public final int f23821a;
    public final org.telegram.ui.ActionBar.e6 f23822b;
    public long f23823c;
    public l11 d;
    public l11 f23824e;
    public l11 f23825f;
    public final ArrayList h;
    public ya f23826n;
    public float f23827r;
    public float f23828s;
    public float v;
    public final RectF f23829w;
    public final bd f23830x;
    public final RectF f23831y;

    public za(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = new ArrayList();
        this.f23829w = new RectF();
        this.f23830x = new bd(this);
        this.f23831y = new RectF();
        this.F = new bd(this);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(this, false);
        this.G = l9Var;
        this.f23821a = i10;
        this.f23822b = e6Var;
        z Z = org.telegram.ui.ActionBar.i6.Z(822083583, 8, 8);
        this.E = Z;
        Z.setCallback(this);
        l9Var.f28381p = AndroidUtilities.dp(50.0f);
        l9Var.f28380o = AndroidUtilities.dp(13.0f);
        l9Var.f28388x = false;
        l9Var.f28384s = AndroidUtilities.dp(13.0f);
        l9Var.j(AndroidUtilities.dp(18.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.H = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final ya a(CharSequence charSequence, String str, boolean z10) {
        int i10;
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.J += AndroidUtilities.dp(7.0f);
        }
        ya yaVar = new ya(str, charSequence, z10);
        arrayList.add(yaVar);
        this.J += AndroidUtilities.dp(14.0f);
        this.f23828s = Math.max(this.f23828s, yaVar.f23789a.f28222c);
        float f7 = this.v;
        float f10 = yaVar.f23790b.f28222c;
        if (z10) {
            i10 = AndroidUtilities.dp(38.0f);
        } else {
            i10 = 0;
        }
        this.v = Math.max(f7, f10 + i10);
        return yaVar;
    }

    public final void b(long j3, TLRPC.PeerSettings peerSettings) {
        int i10;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TL_bots.BotVerification botVerification;
        this.f23823c = j3;
        this.K = 0.0f;
        this.J = 0.0f;
        this.f23828s = 0.0f;
        this.v = 0.0f;
        this.h.clear();
        int i11 = (int) (AndroidUtilities.displaySize.x * 0.95f);
        this.J += AndroidUtilities.dp(14.0f);
        l11 l11Var = new l11(DialogObject.getName(j3), 14.0f, AndroidUtilities.bold());
        this.d = l11Var;
        this.J = l11Var.j() + AndroidUtilities.dp(3.0f) + this.J;
        int i12 = this.f23821a;
        if (ContactsController.getInstance(i12).isContact(j3)) {
            i10 = R.string.ContactInfoIsContact;
        } else {
            i10 = R.string.ContactInfoIsNotContact;
        }
        l11 l11Var2 = new l11(LocaleController.getString(i10), 14.0f, null);
        this.f23824e = l11Var2;
        this.J = l11Var2.j() + AndroidUtilities.dp(11.0f) + this.J;
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
                this.f23826n = a(LocaleController.formatPluralString("Groups", max, new Object[0]), LocaleController.getString(R.string.ContactInfoCommonGroups), true);
                int min = Math.min(3, this.I.chats.size());
                org.telegram.ui.Components.l9 l9Var = this.G;
                l9Var.k(min);
                for (int i14 = 0; i14 < Math.min(3, this.I.chats.size()); i14++) {
                    l9Var.l(i14, this.I.chats.get(i14), i12);
                }
                l9Var.b(true, true);
            } else {
                this.I = null;
                this.f23826n = null;
            }
        } else {
            this.I = null;
            this.f23826n = null;
        }
        this.f23827r = this.f23828s + AndroidUtilities.dp(7.66f) + this.v;
        if (user != null && !user.verified && !UserObject.isService(user.f20185id)) {
            if (user.bot_verification_icon != 0) {
                if (userFull != null && (botVerification = userFull.bot_verification) != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("i  ");
                    this.f23825f = new l11(spannableStringBuilder, 12.0f, null);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.b6(botVerification.icon, this.f23825f.f28220a.getFontMetricsInt()), 0, 1, 33);
                    spannableStringBuilder.append(MessageObject.formatTextWithEntities(botVerification.description));
                    l11 l11Var3 = new l11(spannableStringBuilder, 12.0f, null);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    l11Var3.a();
                    l11Var3.n(5);
                    Point point = AndroidUtilities.displaySize;
                    l11Var3.q(Math.min(point.x, point.y) * 0.5f);
                    l11Var3.s(this);
                    this.f23825f = l11Var3;
                    this.J = this.f23825f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.J;
                } else {
                    this.f23825f = null;
                    this.J += AndroidUtilities.dp(14.0f);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
                er erVar = new er(R.drawable.filled_info, 0);
                erVar.setScale(0.55f, -0.55f);
                erVar.translate(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(-1.0f));
                spannableStringBuilder2.setSpan(erVar, 0, 1, 33);
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ContactInfoNotVerified));
                this.f23825f = new l11(spannableStringBuilder2, 12.0f, null);
                this.J = this.f23825f.j() + AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(15.33f) + this.J;
            }
        } else {
            this.f23825f = null;
            this.J += AndroidUtilities.dp(14.0f);
        }
        float max2 = Math.max(this.K, this.d.l());
        this.K = max2;
        float max3 = Math.max(max2, this.f23824e.l());
        this.K = max3;
        float max4 = Math.max(max3, this.f23827r);
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
        int i13 = this.f23821a;
        if (i10 == i12) {
            long longValue = ((Long) objArr[0]).longValue();
            long j3 = this.f23823c;
            if (longValue == j3) {
                b(j3, MessagesController.getInstance(i13).getPeerSettings(this.f23823c));
            }
        } else if (i10 == NotificationCenter.commonChatsLoaded && ((Long) objArr[0]).longValue() == this.f23823c) {
            MessagesController.CommonChatsList commonChats = MessagesController.getInstance(i13).getCommonChats(this.f23823c);
            this.I = commonChats;
            int count = commonChats.getCount();
            ya yaVar = this.f23826n;
            if (yaVar != null && count > 0) {
                yaVar.f23790b = new l11(LocaleController.formatPluralString("Groups", count, new Object[0]), 12.0f, AndroidUtilities.bold());
                int min = Math.min(3, this.I.chats.size());
                org.telegram.ui.Components.l9 l9Var = this.G;
                l9Var.k(min);
                for (int i14 = 0; i14 < Math.min(3, this.I.chats.size()); i14++) {
                    l9Var.l(i14, this.I.chats.get(i14), i13);
                }
                l9Var.b(true, true);
            } else {
                b(this.f23823c, MessagesController.getInstance(i13).getPeerSettings(this.f23823c));
                requestLayout();
            }
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f23821a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.commonChatsLoaded);
        this.G.g();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f23821a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.commonChatsLoaded);
        this.G.h();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean b12;
        float f7;
        super.onDraw(canvas);
        canvas.save();
        float f10 = 2.0f;
        float width = getWidth() / 2.0f;
        RectF rectF = this.f23829w;
        rectF.set((getWidth() - this.K) / 2.0f, (getHeight() - this.J) / 2.0f, (getWidth() + this.K) / 2.0f, (getHeight() + this.J) / 2.0f);
        float f11 = 0.025f;
        float a2 = this.f23830x.a(0.025f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i10 = this.M;
        float x10 = getX();
        float f12 = this.L;
        org.telegram.ui.ActionBar.e6 e6Var = this.f23822b;
        if (e6Var != null) {
            e6Var.m(x10, f12, measuredWidth, i10);
        } else {
            org.telegram.ui.ActionBar.i6.q(x10, f12, measuredWidth, i10);
        }
        float f13 = 16.0f;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.U0("paintChatActionBackground", e6Var));
        if (e6Var != null) {
            b12 = e6Var.k0();
        } else {
            b12 = org.telegram.ui.ActionBar.i6.b1();
        }
        if (b12) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.U0("paintChatActionBackgroundDarken", e6Var));
        }
        float f14 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.J) / 2.0f);
        float z10 = com.google.android.gms.internal.vision.e2.z(getHeight(), this.J, 2.0f, 0.0f);
        float f15 = 14.0f;
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float dp = z10 + AndroidUtilities.dp(14.0f);
        l11 l11Var = this.d;
        float f16 = 32.0f;
        l11Var.f28233p = this.K - AndroidUtilities.dp(32.0f);
        l11Var.c(width - (this.d.l() / 2.0f), this.d.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, this.d.j() + AndroidUtilities.dp(3.0f));
        float j3 = dp + this.d.j() + AndroidUtilities.dp(3.0f);
        l11 l11Var2 = this.f23824e;
        l11Var2.f28233p = this.K - AndroidUtilities.dp(32.0f);
        l11Var2.c(width - (this.f23824e.l() / 2.0f), this.f23824e.j() / 2.0f, 0.7f, -1, canvas);
        canvas.translate(0.0f, this.f23824e.j() + AndroidUtilities.dp(11.0f));
        float j10 = this.f23824e.j() + AndroidUtilities.dp(11.0f) + j3;
        boolean z11 = false;
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
            ya yaVar = (ya) arrayList.get(i11);
            float dp2 = (width - (this.K / f10)) + AndroidUtilities.dp(f13) + this.f23828s;
            float f17 = j10;
            l11 l11Var3 = yaVar.f23789a;
            boolean z12 = yaVar.f23791c;
            float f18 = f10;
            RectF rectF2 = yaVar.d;
            float f19 = f13;
            float f20 = dp2 - l11Var3.f28222c;
            float f21 = f15;
            float dp3 = (width - (this.K / f18)) + AndroidUtilities.dp(f19) + this.f23828s + AndroidUtilities.dp(7.66f);
            float f22 = f16;
            l11Var3.f28233p = (dp3 - f20) - AndroidUtilities.dp(7.66f);
            l11Var3.c(f20, l11Var3.j() / f18, 0.7f, -1, canvas);
            float dp4 = (width - (this.K / f18)) + AndroidUtilities.dp(f19) + this.f23828s + AndroidUtilities.dp(7.66f);
            float dp5 = (width - (this.K / f18)) + AndroidUtilities.dp(f19) + this.f23828s + AndroidUtilities.dp(7.66f) + yaVar.f23790b.f28222c;
            org.telegram.ui.Components.l9 l9Var = this.G;
            Drawable drawable = this.H;
            if (z12) {
                f7 = l9Var.A + (drawable.getIntrinsicWidth() * 0.8f) + AndroidUtilities.dp(5.0f);
            } else {
                f7 = 0.0f;
            }
            rectF2.set(dp4, f17, dp5 + f7, yaVar.f23790b.j() + f17);
            if (this.f23826n == yaVar) {
                RectF rectF3 = this.f23831y;
                rectF3.set(rectF2);
                rectF3.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(f18));
                float a10 = this.F.a(f11);
                canvas.scale(a10, a10, rectF3.centerX(), yaVar.f23790b.j() / f18);
                z zVar = this.E;
                if (zVar != null) {
                    zVar.setBounds((int) rectF3.left, (int) (rectF3.top - f17), (int) rectF3.right, (int) (rectF3.bottom - f17));
                    zVar.draw(canvas);
                }
            }
            l11 l11Var4 = yaVar.f23790b;
            l11Var4.f28233p = (((this.K / f18) + width) - AndroidUtilities.dp(8.0f)) - dp3;
            l11Var4.c(dp3, yaVar.f23790b.j() / f18, 1.0f, -1, canvas);
            if (z12) {
                canvas.save();
                canvas.translate((width - (this.K / f18)) + AndroidUtilities.dp(f19) + this.f23828s + AndroidUtilities.dp(7.66f) + yaVar.f23790b.f28222c + AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
                l9Var.i(canvas);
                canvas.translate(l9Var.A + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(13.0f) / f18);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / f18), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / f18));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(f21));
            j10 = AndroidUtilities.dp(f21) + f17;
            i11++;
            f10 = f18;
            f13 = f19;
            f15 = f21;
            f16 = f22;
            f11 = 0.025f;
            f14 = 0.0f;
        }
        float f23 = f10;
        float f24 = f16;
        if (this.f23825f != null) {
            canvas.translate(0.0f, AndroidUtilities.dp(12.0f));
            l11 l11Var5 = this.f23825f;
            if (l11Var5.f28224f > 1) {
                z11 = true;
            }
            if (z11) {
                l11Var5.c(width - (l11Var5.l() / f23), 0.0f, 0.7f, -1, canvas);
            } else {
                l11Var5.f28233p = this.K - AndroidUtilities.dp(f24);
                l11Var5.c(width - (this.f23825f.l() / f23), this.f23825f.j() / f23, 0.7f, -1, canvas);
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
        qj qjVar;
        if (this.f23826n != null && this.f23831y.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && this.f23829w.contains(motionEvent.getX(), motionEvent.getY())) {
            z11 = true;
        } else {
            z11 = false;
        }
        int action = motionEvent.getAction();
        z zVar = this.E;
        bd bdVar = this.F;
        bd bdVar2 = this.f23830x;
        if (action == 0) {
            bdVar2.c(z11);
            bdVar.c(z10);
            zVar.setState(z10 ? new int[]{16842919, 16842910} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (bdVar2.f24977i) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if ((U instanceof zn) && (qjVar = ((zn) U).f44702a1) != null) {
                    qjVar.e(true, false);
                }
            } else if (bdVar.f24977i) {
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    Bundle bundle = new Bundle();
                    long j3 = this.f23823c;
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
            bdVar.c(false);
            bdVar2.c(false);
            zVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            bdVar.c(false);
            bdVar2.c(false);
            zVar.setState(new int[0]);
        }
        if (bdVar.f24977i || bdVar2.f24977i) {
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
