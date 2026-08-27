package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pz0;

public class b7 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.y5 A;
    public boolean B;
    public final org.telegram.ui.Components.y5 C;
    public long D;
    public ag.i2 E;
    public Drawable F;
    public final Paint G;
    public long H;
    public pz0 I;

    public final org.telegram.ui.Components.n9 f24115a;

    public final cg.q f24116b;

    public final org.telegram.ui.ActionBar.h5 f24117c;
    public final bp d;

    public final z6 f24118e;

    public a7 f24119f;
    public TLRPC.User h;

    public final int f24120n;

    public float f24121r;

    public long f24122s;
    public long v;

    public boolean f24123w;

    public final int f24124x;

    public final org.telegram.ui.ActionBar.c6 f24125y;

    public b7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24124x = UserConfig.selectedAccount;
        er erVar = er.h;
        this.A = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        this.C = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        this.G = new Paint();
        this.f24125y = c6Var;
        this.f24118e = new z6(this, c6Var, 0);
        setWillNotDraw(false);
        this.f24120n = i10;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f24115a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        if (i10 == 2) {
            addView(n9Var, h7.z5.d(48, 48.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        } else {
            addView(n9Var, h7.z5.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        }
        cg.q qVar = new cg.q(context, 8);
        this.f24116b = qVar;
        NotificationCenter.listenEmojiLoading(qVar);
        qVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(this.B ? org.telegram.ui.ActionBar.g6.C6 : org.telegram.ui.ActionBar.g6.f23161j5, c6Var));
        qVar.setTextSize(1, 12.0f);
        qVar.setMaxLines(2);
        qVar.setGravity(49);
        qVar.setLines(2);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(qVar, h7.z5.d(-1, -2.0f, 51, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24117c = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c6Var));
        h5Var.setTextSize(12);
        h5Var.setMaxLines(2);
        h5Var.setGravity(49);
        h5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        addView(h5Var, h7.z5.d(-1, -2.0f, 51, 6.0f, i10 == 2 ? 58.0f : 66.0f, 6.0f, 0.0f));
        bp bpVar = new bp(context, 21, c6Var);
        this.d = bpVar;
        bpVar.b(org.telegram.ui.ActionBar.g6.B5, org.telegram.ui.ActionBar.g6.f23124h5, org.telegram.ui.ActionBar.g6.C5);
        bpVar.setDrawUnchecked(false);
        bpVar.setDrawBackgroundAsArc(4);
        bpVar.setProgressDelegate(new ea(this, 5));
        addView(bpVar, h7.z5.d(24, 24.0f, 49, 19.0f, i10 == 2 ? -40.0f : 42.0f, 0.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public String a() {
        return LocaleController.getString(R.string.FwdMyStory);
    }

    public final void b(boolean z10, boolean z11) {
        this.d.a(z10, z11);
        if (z10) {
            return;
        }
        d(null, false, true);
    }

    public final void c(long j10, boolean z10, CharSequence charSequence) {
        z6 z6Var = this.f24118e;
        z6Var.f34858p = 1.0f;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24125y;
        org.telegram.ui.Components.n9 n9Var = this.f24115a;
        cg.q qVar = this.f24116b;
        if (j10 == Long.MAX_VALUE) {
            qVar.setText(a());
            if (this.f24119f == null) {
                this.f24119f = new a7(getContext(), n9Var, true, c6Var);
            }
            n9Var.h(null, null, this.f24119f, null);
        } else {
            boolean zIsUserDialog = DialogObject.isUserDialog(j10);
            org.telegram.ui.Components.y5 y5Var = this.C;
            org.telegram.ui.Components.y5 y5Var2 = this.A;
            int i10 = this.f24124x;
            if (zIsUserDialog) {
                this.h = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                TL_account.RequirementToContact requirementToContactIsUserContactBlocked = MessagesController.getInstance(i10).isUserContactBlocked(j10);
                this.B = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
                this.D = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
                qVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(this.B ? org.telegram.ui.ActionBar.g6.C6 : org.telegram.ui.ActionBar.g6.f23161j5, c6Var));
                y5Var2.a(this.B);
                y5Var.a(this.D > 0);
                invalidate();
                z6Var.m(i10, this.h);
                int i11 = this.f24120n;
                if (i11 != 2 && UserObject.isReplyUser(this.h)) {
                    qVar.setText(LocaleController.getString(R.string.RepliesTitle));
                    z6Var.g(12);
                    n9Var.h(null, null, z6Var, this.h);
                } else if (i11 == 2 || !UserObject.isUserSelf(this.h)) {
                    if (charSequence != null) {
                        qVar.setText(charSequence);
                    } else {
                        TLRPC.User user = this.h;
                        if (user != null) {
                            qVar.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            qVar.setText("");
                        }
                    }
                    n9Var.e(this.h, z6Var);
                } else {
                    qVar.setText(LocaleController.getString(R.string.SavedMessages));
                    z6Var.g(1);
                    n9Var.h(null, null, z6Var, this.h);
                }
                n9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            } else {
                this.h = null;
                this.B = false;
                y5Var2.d(0.0f, true);
                this.D = MessagesController.getInstance(i10).getSendPaidMessagesStars(j10);
                y5Var.getClass();
                y5Var.d(0.0f, true);
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                if (charSequence != null) {
                    qVar.setText(charSequence);
                } else if (chat == null) {
                    qVar.setText("");
                } else if (chat.monoforum) {
                    qVar.setText(wf.c.i(chat, i10, false));
                } else {
                    qVar.setText(chat.title);
                }
                if (ChatObject.isMonoForum(chat)) {
                    wf.c.o(i10, chat, z6Var, n9Var);
                } else {
                    z6Var.k(i10, chat);
                    n9Var.e(chat, z6Var);
                }
                n9Var.setRoundRadius((chat == null || !(chat.forum || chat.monoforum)) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
            }
        }
        this.v = j10;
        this.d.a(z10, false);
    }

    public final void d(TLRPC.TL_forumTopic tL_forumTopic, boolean z10, boolean z11) {
        boolean z12 = this.f24123w;
        boolean z13 = tL_forumTopic != null;
        if (z12 == z13 && z11) {
            return;
        }
        int i10 = R.id.spring_tag;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24117c;
        o1.j jVar = (o1.j) h5Var.getTag(i10);
        if (jVar != null) {
            jVar.c();
        }
        if (z13) {
            if (z10) {
                h5Var.l(MessagesController.getInstance(this.f24124x).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)), false);
            } else {
                h5Var.l(wf.c.j(tL_forumTopic, h5Var.getTextPaint(), null), false);
            }
            h5Var.requestLayout();
        }
        if (z11) {
            o1.j jVar2 = new o1.j(new hb.a(z13 ? 0.0f : 1000.0f));
            o1.k kVar = new o1.k(z13 ? 1000.0f : 0.0f);
            kVar.b(1500.0f);
            kVar.a(1.0f);
            jVar2.f19147u = kVar;
            jVar2.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f10, float f11) {
                    float f12 = f10 / 1000.0f;
                    b7 b7Var = this.f25937a;
                    org.telegram.ui.ActionBar.h5 h5Var2 = b7Var.f24117c;
                    h5Var2.setAlpha(f12);
                    cg.q qVar = b7Var.f24116b;
                    float f13 = 1.0f - f12;
                    qVar.setAlpha(f13);
                    h5Var2.setTranslationX(f13 * (-AndroidUtilities.dp(10.0f)));
                    qVar.setTranslationX(f12 * AndroidUtilities.dp(10.0f));
                }
            });
            jVar2.a(new o1.f() {
                @Override
                public final void a(o1.h hVar, boolean z14, float f10, float f11) {
                    this.f26001a.f24117c.setTag(R.id.spring_tag, null);
                }
            });
            h5Var.setTag(R.id.spring_tag, jVar2);
            jVar2.f();
        } else {
            cg.q qVar = this.f24116b;
            if (z13) {
                h5Var.setAlpha(1.0f);
                qVar.setAlpha(0.0f);
                h5Var.setTranslationX(0.0f);
                qVar.setTranslationX(AndroidUtilities.dp(10.0f));
            } else {
                h5Var.setAlpha(0.0f);
                qVar.setAlpha(1.0f);
                h5Var.setTranslationX(-AndroidUtilities.dp(10.0f));
                qVar.setTranslationX(0.0f);
            }
        }
        this.f24123w = z13;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.h;
            int i12 = this.f24124x;
            TL_account.RequirementToContact requirementToContactIsUserContactBlocked = user != null ? MessagesController.getInstance(i12).isUserContactBlocked(this.h.f22527id) : null;
            long sendPaidMessagesStars = this.v < 0 ? MessagesController.getInstance(i12).getSendPaidMessagesStars(this.v) : DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
            if (this.B == DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked) && this.D == sendPaidMessagesStars) {
                return;
            }
            boolean zIsPremiumBlocked = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
            this.B = zIsPremiumBlocked;
            this.D = sendPaidMessagesStars;
            this.f24116b.setTextColor(org.telegram.ui.ActionBar.g6.v0(zIsPremiumBlocked ? org.telegram.ui.ActionBar.g6.C6 : org.telegram.ui.ActionBar.g6.f23161j5, this.f24125y));
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        TLRPC.User user;
        org.telegram.ui.ActionBar.c6 c6Var;
        float f10;
        float f11;
        boolean z10;
        pz0 pz0Var;
        float f12;
        float f13;
        pz0 pz0Var2;
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        org.telegram.ui.Components.n9 n9Var = this.f24115a;
        if (view == n9Var && this.f24120n != 2 && (user = this.h) != null && !MessagesController.isSupportUser(user)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = jElapsedRealtime - this.f24122s;
            long j12 = j11 <= 17 ? j11 : 17L;
            this.f24122s = jElapsedRealtime;
            float fE = this.C.e(this.D > 0);
            org.telegram.ui.ActionBar.c6 c6Var2 = this.f24125y;
            if (fE > 0.0f) {
                float measuredWidth = (n9Var.getMeasuredWidth() / 2.0f) + n9Var.getLeft() + AndroidUtilities.dp(18.0f);
                float measuredHeight = ((n9Var.getMeasuredHeight() / 2.0f) + n9Var.getTop()) - AndroidUtilities.dp(20.83f);
                if (this.I != null) {
                    long j13 = this.H;
                    f11 = 5.0f;
                    long j14 = this.D;
                    if (j13 != j14 && j14 > 0) {
                    }
                    pz0Var = this.I;
                    if (pz0Var == null) {
                        f12 = 0.0f;
                    } else {
                        f12 = pz0Var.f31697c;
                    }
                    float fDp = f12 + AndroidUtilities.dp(10.0f);
                    float fDp2 = AndroidUtilities.dp(14.33f);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f14 = fDp / 2.0f;
                    f13 = measuredWidth - f14;
                    float f15 = fDp2 / 2.0f;
                    rectF.set(f13, measuredHeight - f15, measuredWidth + f14, f15 + measuredHeight);
                    rectF.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                    int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var2);
                    Paint paint = this.G;
                    paint.setColor(iV0);
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                    paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B5, c6Var2));
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                    pz0Var2 = this.I;
                    if (pz0Var2 != null) {
                        c6Var = c6Var2;
                        f10 = 0.0f;
                        pz0Var2.c(f13 + AndroidUtilities.dp(f11), measuredHeight, 1.0f, -1, canvas);
                    } else {
                        c6Var = c6Var2;
                        f10 = 0.0f;
                    }
                } else {
                    f11 = 5.0f;
                }
                StringBuilder sb2 = new StringBuilder("⭐️");
                long j15 = this.D;
                this.H = j15;
                sb2.append(AndroidUtilities.formatWholeNumber((int) j15, 0));
                this.I = new pz0(hh.oa.R0(sb2.toString(), 0.65f, null), 9.33f, AndroidUtilities.bold());
                pz0Var = this.I;
                if (pz0Var == null) {
                    f12 = 0.0f;
                } else {
                    f12 = pz0Var.f31697c;
                }
                float fDp3 = f12 + AndroidUtilities.dp(10.0f);
                float fDp4 = AndroidUtilities.dp(14.33f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f16 = fDp3 / 2.0f;
                f13 = measuredWidth - f16;
                float f17 = fDp4 / 2.0f;
                rectF2.set(f13, measuredHeight - f17, measuredWidth + f16, f17 + measuredHeight);
                rectF2.inset(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(-1.33f));
                int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var2);
                Paint paint2 = this.G;
                paint2.setColor(iV1);
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                rectF2.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B5, c6Var2));
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint2);
                pz0Var2 = this.I;
                if (pz0Var2 != null) {
                    c6Var = c6Var2;
                    f10 = 0.0f;
                    pz0Var2.c(f13 + AndroidUtilities.dp(f11), measuredHeight, 1.0f, -1, canvas);
                } else {
                    c6Var = c6Var2;
                    f10 = 0.0f;
                }
            } else {
                c6Var = c6Var2;
                f10 = 0.0f;
                f11 = 5.0f;
            }
            float fE2 = this.A.e(this.B);
            if (fE2 > f10) {
                int bottom = n9Var.getBottom() - AndroidUtilities.dp(9.0f);
                int right = n9Var.getRight() - AndroidUtilities.dp(9.33f);
                canvas.save();
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
                float f18 = right;
                float f19 = bottom;
                canvas.drawCircle(f18, f19, AndroidUtilities.dp(12.0f) * fE2, org.telegram.ui.ActionBar.g6.f23333t0);
                if (this.E == null) {
                    this.E = new ag.i2(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, this.f24125y);
                }
                this.E.d(right - AndroidUtilities.dp(10.0f), 0.0f, bottom - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + right, 0.0f, AndroidUtilities.dp(10.0f) + bottom);
                canvas.drawCircle(f18, f19, AndroidUtilities.dp(10.0f) * fE2, this.E.f458f);
                if (this.F == null) {
                    Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.F = drawableMutate;
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                Drawable drawable = this.F;
                drawable.setBounds((int) (f18 - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * fE2)), (int) (f19 - (((this.F.getIntrinsicHeight() / 2.0f) * 0.875f) * fE2)), (int) (((this.F.getIntrinsicWidth() / 2.0f) * 0.875f * fE2) + f18), (int) (((this.F.getIntrinsicHeight() / 2.0f) * 0.875f * fE2) + f19));
                this.F.setAlpha((int) (255.0f * fE2));
                this.F.draw(canvas);
                canvas.restore();
            }
            if (this.B) {
                z10 = false;
            } else {
                TLRPC.User user2 = this.h;
                if (user2.self || user2.bot) {
                    z10 = false;
                } else {
                    TLRPC.UserStatus userStatus = user2.status;
                    int i10 = this.f24124x;
                    if ((userStatus == null || userStatus.expires <= ConnectionsManager.getInstance(i10).getCurrentTime()) && !MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(this.h.f22527id))) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
            }
            if (z10 || this.f24121r != f10) {
                int bottom2 = n9Var.getBottom() - AndroidUtilities.dp(6.0f);
                int right2 = n9Var.getRight() - AndroidUtilities.dp(10.0f);
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
                float f20 = right2;
                float f21 = bottom2;
                float f22 = 1.0f - fE2;
                float f23 = 1.0f - fE;
                canvas.drawCircle(f20, f21, AndroidUtilities.dp(7.0f) * this.f24121r * f22 * f23, org.telegram.ui.ActionBar.g6.f23333t0);
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.T8, c6Var));
                canvas.drawCircle(f20, f21, com.google.android.recaptcha.internal.a.C(AndroidUtilities.dp(f11), this.f24121r, f22, f23), org.telegram.ui.ActionBar.g6.f23333t0);
                if (z10) {
                    float f24 = this.f24121r;
                    if (f24 < 1.0f) {
                        float f25 = (j12 / 150.0f) + f24;
                        this.f24121r = f25;
                        if (f25 > 1.0f) {
                            this.f24121r = 1.0f;
                        }
                        n9Var.invalidate();
                        invalidate();
                        return zDrawChild;
                    }
                } else {
                    float f26 = this.f24121r;
                    if (f26 > f10) {
                        float f27 = f26 - (j12 / 150.0f);
                        this.f24121r = f27;
                        if (f27 < f10) {
                            this.f24121r = f10;
                        }
                        n9Var.invalidate();
                        invalidate();
                    }
                }
            }
        }
        return zDrawChild;
    }

    public long getCurrentDialog() {
        return this.v;
    }

    public org.telegram.ui.Components.n9 getImageView() {
        return this.f24115a;
    }

    public long getStarsPrice() {
        return this.D;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f24124x).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f24124x).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.n9 n9Var = this.f24115a;
        int measuredWidth = (n9Var.getMeasuredWidth() / 2) + n9Var.getLeft();
        int measuredHeight = (n9Var.getMeasuredHeight() / 2) + n9Var.getTop();
        org.telegram.ui.ActionBar.g6.f23245o0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B5, this.f24125y));
        org.telegram.ui.ActionBar.g6.f23245o0.setAlpha((int) (this.d.getProgress() * 255.0f));
        int iDp = AndroidUtilities.dp(this.f24120n == 2 ? 24.0f : 28.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(measuredWidth - iDp, measuredHeight - iDp, measuredWidth + iDp, measuredHeight + iDp);
        canvas.drawRoundRect(rectF, n9Var.getRoundRadius()[0], n9Var.getRoundRadius()[0], org.telegram.ui.ActionBar.g6.f23245o0);
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d.f27188a.f26309q) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f24120n == 2 ? 95.0f : 103.0f), 1073741824));
    }
}
