package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
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
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.kq;

public final class k4 extends FrameLayout {
    public boolean A;
    public final org.telegram.ui.Components.y5 B;
    public long C;
    public int D;
    public ag.i2 E;
    public Drawable F;

    public final org.telegram.ui.Components.n9 f24571a;

    public final cg.q f24572b;

    public final org.telegram.ui.Components.y8 f24573c;
    public int d;

    public TLRPC.User f24574e;

    public long f24575f;
    public final int h;

    public float f24576n;

    public boolean f24577r;

    public final kq f24578s;
    public final bp v;

    public final boolean f24579w;

    public boolean f24580x;

    public final org.telegram.ui.Components.y5 f24581y;

    public k4(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f24573c = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        er erVar = er.h;
        this.f24581y = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        this.B = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        this.D = org.telegram.ui.ActionBar.g6.f23053d6;
        this.f24579w = z10;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f24571a = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(n9Var, h7.z5.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        cg.q qVar = new cg.q(context, 6);
        this.f24572b = qVar;
        NotificationCenter.listenEmojiLoading(qVar);
        qVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        qVar.setTextSize(1, 12.0f);
        qVar.setMaxLines(1);
        qVar.setGravity(49);
        qVar.setLines(1);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(qVar, h7.z5.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        kq kqVar = new kq(context, c6Var);
        this.f24578s = kqVar;
        addView(kqVar, h7.z5.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.g6.W8;
        int i11 = org.telegram.ui.ActionBar.g6.U8;
        jq jqVar = kqVar.f30167a;
        jqVar.v = i10;
        jqVar.f29794w = i11;
        kqVar.setGravity(5);
        if (z10) {
            bp bpVar = new bp(context, 21, c6Var);
            this.v = bpVar;
            bpVar.b(org.telegram.ui.ActionBar.g6.B5, org.telegram.ui.ActionBar.g6.f23124h5, org.telegram.ui.ActionBar.g6.C5);
            bpVar.setDrawUnchecked(false);
            bpVar.setDrawBackgroundAsArc(4);
            bpVar.setProgressDelegate(new ea(this, 4));
            addView(bpVar, h7.z5.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            bpVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j10, String str) {
        if (this.f24575f != j10) {
            this.f24577r = false;
            invalidate();
        }
        this.f24575f = j10;
        boolean zIsUserDialog = DialogObject.isUserDialog(j10);
        org.telegram.ui.Components.n9 n9Var = this.f24571a;
        org.telegram.ui.Components.y8 y8Var = this.f24573c;
        int i10 = this.h;
        cg.q qVar = this.f24572b;
        if (zIsUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.f24574e = user;
            if (str != null) {
                qVar.setText(str);
            } else if (user != null) {
                qVar.setText(UserObject.getFirstName(user));
            } else {
                qVar.setText("");
            }
            y8Var.m(i10, this.f24574e);
            n9Var.e(this.f24574e, y8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (str != null) {
                qVar.setText(str);
            } else if (chat != null) {
                qVar.setText(chat.title);
            } else {
                qVar.setText("");
            }
            y8Var.k(i10, chat);
            this.f24574e = null;
            n9Var.e(chat, y8Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = MessagesController.UPDATE_MASK_STATUS & i10;
        int i13 = this.h;
        if (i12 != 0 && this.f24574e != null) {
            this.f24574e = MessagesController.getInstance(i13).getUser(Long.valueOf(this.f24574e.f22527id));
            this.f24571a.invalidate();
            invalidate();
        }
        if (i10 != 0 && (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i10) == 0 && (i10 & MessagesController.UPDATE_MASK_NEW_MESSAGE) == 0) {
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(this.f24575f);
        kq kqVar = this.f24578s;
        if (dialog == null || (i11 = dialog.unread_count) == 0) {
            this.d = 0;
            kqVar.f30167a.c(0, this.f24577r);
        } else if (this.d != i11) {
            this.d = i11;
            kqVar.f30167a.c(i11, this.f24577r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContactIsUserContactBlocked = (!this.f24580x || this.f24574e == null) ? null : MessagesController.getInstance(this.h).isUserContactBlocked(this.f24574e.f22527id);
        if (this.A == DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked) && this.C == DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked)) {
            return;
        }
        this.A = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
        this.C = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
        if (!z10) {
            this.f24581y.f(this.A, true);
            this.B.f(this.C > 0, true);
        }
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        float f10;
        float f11;
        TLRPC.User user;
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        if (view == this.f24571a) {
            if (this.A || (user = this.f24574e) == null || user.bot) {
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus = user.status;
                int i10 = this.h;
                if ((userStatus == null || userStatus.expires <= ConnectionsManager.getInstance(i10).getCurrentTime()) && !MessagesController.getInstance(i10).onlinePrivacy.containsKey(Long.valueOf(this.f24574e.f22527id))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            if (!this.f24577r) {
                this.f24576n = z10 ? 1.0f : 0.0f;
            }
            if (z10) {
                float f12 = this.f24576n;
                if (f12 != 1.0f) {
                    float f13 = f12 + 0.10666667f;
                    this.f24576n = f13;
                    if (f13 > 1.0f) {
                        this.f24576n = 1.0f;
                    }
                    invalidate();
                } else if (!z10) {
                    f10 = this.f24576n;
                    if (f10 != 0.0f) {
                        f11 = f10 - 0.10666667f;
                        this.f24576n = f11;
                        if (f11 < 0.0f) {
                            this.f24576n = 0.0f;
                        }
                        invalidate();
                    }
                }
            } else if (!z10) {
                f10 = this.f24576n;
                if (f10 != 0.0f) {
                    f11 = f10 - 0.10666667f;
                    this.f24576n = f11;
                    if (f11 < 0.0f) {
                        this.f24576n = 0.0f;
                    }
                    invalidate();
                }
            }
            float fE = this.f24581y.e(this.A);
            if (fE > 0.0f) {
                float height = (view.getHeight() / 2.0f) + view.getY() + AndroidUtilities.dp(18.0f);
                float width = (view.getWidth() / 2.0f) + view.getX() + AndroidUtilities.dp(18.0f);
                canvas.save();
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, this.D, false));
                canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * fE, org.telegram.ui.ActionBar.g6.f23333t0);
                if (this.E == null) {
                    this.E = new ag.i2(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, null);
                }
                this.E.d((int) (width - AndroidUtilities.dp(10.0f)), 0.0f, (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), 0.0f, (int) (AndroidUtilities.dp(10.0f) + height));
                canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * fE, this.E.f458f);
                if (this.F == null) {
                    Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                    this.F = drawableMutate;
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                }
                Drawable drawable = this.F;
                drawable.setBounds((int) (width - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * fE)), (int) (height - (((this.F.getIntrinsicHeight() / 2.0f) * 0.875f) * fE)), (int) (((this.F.getIntrinsicWidth() / 2.0f) * 0.875f * fE) + width), (int) (((this.F.getIntrinsicHeight() / 2.0f) * 0.875f * fE) + height));
                this.F.setAlpha((int) (fE * 255.0f));
                this.F.draw(canvas);
                canvas.restore();
            } else if (this.f24576n != 0.0f) {
                int iDp = AndroidUtilities.dp(53.0f);
                int iDp2 = AndroidUtilities.dp(59.0f);
                canvas.save();
                float f14 = this.f24576n;
                float f15 = iDp2;
                float f16 = iDp;
                canvas.scale(f14, f14, f15, f16);
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, this.D, false));
                canvas.drawCircle(f15, f16, AndroidUtilities.dp(7.0f), org.telegram.ui.ActionBar.g6.f23333t0);
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.T8, false));
                canvas.drawCircle(f15, f16, AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.g6.f23333t0);
                canvas.restore();
            }
            this.f24577r = true;
        }
        return zDrawChild;
    }

    public long getDialogId() {
        return this.f24575f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f24579w) {
            org.telegram.ui.Components.n9 n9Var = this.f24571a;
            int measuredWidth = (n9Var.getMeasuredWidth() / 2) + n9Var.getLeft();
            int measuredHeight = (n9Var.getMeasuredHeight() / 2) + n9Var.getTop();
            org.telegram.ui.ActionBar.g6.f23245o0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B5, false));
            org.telegram.ui.ActionBar.g6.f23245o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.g6.f23245o0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.f24578s.f30167a.E = AndroidUtilities.dp(13.0f);
    }
}
