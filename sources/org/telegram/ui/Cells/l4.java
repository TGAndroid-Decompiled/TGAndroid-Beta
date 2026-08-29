package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qq;
public final class l4 extends FrameLayout {
    public boolean A;
    public final org.telegram.ui.Components.d6 B;
    public long C;
    public int D;
    public cg.r1 E;
    public Drawable F;
    public final org.telegram.ui.Components.t9 f24624a;
    public final eg.r f24625b;
    public final org.telegram.ui.Components.e9 f24626c;
    public int d;
    public TLRPC.User f24627e;
    public long f24628f;
    public final int h;
    public float f24629n;
    public boolean f24630r;
    public final qq f24631s;
    public final hp v;
    public final boolean f24632w;
    public boolean f24633x;
    public final org.telegram.ui.Components.d6 f24634y;

    public l4(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f24626c = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        jr jrVar = jr.h;
        this.f24634y = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.B = new org.telegram.ui.Components.d6(this, 0L, 350L, jrVar);
        this.D = org.telegram.ui.ActionBar.g6.f23062d6;
        this.f24632w = z10;
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f24624a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(t9Var, i7.f6.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        eg.r rVar = new eg.r(context, 4);
        this.f24625b = rVar;
        NotificationCenter.listenEmojiLoading(rVar);
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        rVar.setTextSize(1, 12.0f);
        rVar.setMaxLines(1);
        rVar.setGravity(49);
        rVar.setLines(1);
        rVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(rVar, i7.f6.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        qq qqVar = new qq(context, c6Var);
        this.f24631s = qqVar;
        addView(qqVar, i7.f6.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.g6.W8;
        int i11 = org.telegram.ui.ActionBar.g6.U8;
        pq pqVar = qqVar.f32029a;
        pqVar.v = i10;
        pqVar.f31750w = i11;
        qqVar.setGravity(5);
        if (z10) {
            hp hpVar = new hp(context, 21, c6Var);
            this.v = hpVar;
            hpVar.b(org.telegram.ui.ActionBar.g6.B5, org.telegram.ui.ActionBar.g6.f23133h5, org.telegram.ui.ActionBar.g6.C5);
            hpVar.setDrawUnchecked(false);
            hpVar.setDrawBackgroundAsArc(4);
            hpVar.setProgressDelegate(new fa(this, 4));
            addView(hpVar, i7.f6.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            hpVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j10, String str) {
        if (this.f24628f != j10) {
            this.f24630r = false;
            invalidate();
        }
        this.f24628f = j10;
        boolean isUserDialog = DialogObject.isUserDialog(j10);
        org.telegram.ui.Components.t9 t9Var = this.f24624a;
        org.telegram.ui.Components.e9 e9Var = this.f24626c;
        int i10 = this.h;
        eg.r rVar = this.f24625b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.f24627e = user;
            if (str != null) {
                rVar.setText(str);
            } else if (user != null) {
                rVar.setText(UserObject.getFirstName(user));
            } else {
                rVar.setText("");
            }
            e9Var.m(i10, this.f24627e);
            t9Var.e(this.f24627e, e9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (str != null) {
                rVar.setText(str);
            } else if (chat != null) {
                rVar.setText(chat.title);
            } else {
                rVar.setText("");
            }
            e9Var.k(i10, chat);
            this.f24627e = null;
            t9Var.e(chat, e9Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = MessagesController.UPDATE_MASK_STATUS & i10;
        int i13 = this.h;
        if (i12 != 0 && this.f24627e != null) {
            this.f24627e = MessagesController.getInstance(i13).getUser(Long.valueOf(this.f24627e.f22539id));
            this.f24624a.invalidate();
            invalidate();
        }
        if (i10 == 0 || (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i10) != 0 || (i10 & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(this.f24628f);
            qq qqVar = this.f24631s;
            if (dialog != null && (i11 = dialog.unread_count) != 0) {
                if (this.d != i11) {
                    this.d = i11;
                    qqVar.f32029a.c(i11, this.f24630r);
                    return;
                }
                return;
            }
            this.d = 0;
            qqVar.f32029a.c(0, this.f24630r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f24633x && this.f24627e != null) {
            requirementToContact = MessagesController.getInstance(this.h).isUserContactBlocked(this.f24627e.f22539id);
        } else {
            requirementToContact = null;
        }
        if (this.A == DialogObject.isPremiumBlocked(requirementToContact) && this.C == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.A = DialogObject.isPremiumBlocked(requirementToContact);
        this.C = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z10) {
            this.f24634y.f(this.A, true);
            if (this.C > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.B.f(z11, true);
        }
        invalidate();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r20, android.view.View r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.l4.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f24628f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f24632w) {
            org.telegram.ui.Components.t9 t9Var = this.f24624a;
            int measuredWidth = (t9Var.getMeasuredWidth() / 2) + t9Var.getLeft();
            int measuredHeight = (t9Var.getMeasuredHeight() / 2) + t9Var.getTop();
            org.telegram.ui.ActionBar.g6.f23254o0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B5, false));
            org.telegram.ui.ActionBar.g6.f23254o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.g6.f23254o0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.f24631s.f32029a.E = AndroidUtilities.dp(13.0f);
    }
}
