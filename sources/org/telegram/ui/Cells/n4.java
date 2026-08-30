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
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.uq;
public final class n4 extends FrameLayout {
    public boolean B;
    public final org.telegram.ui.Components.z5 C;
    public long D;
    public int E;
    public eg.q1 F;
    public Drawable G;
    public final org.telegram.ui.Components.p9 f21430a;
    public final gg.q f21431b;
    public final org.telegram.ui.Components.z8 f21432c;
    public int d;
    public TLRPC.User e;
    public long f21433f;
    public final int h;
    public float f21434n;
    public boolean f21435r;
    public final uq f21436s;
    public final lp v;
    public final boolean f21437w;
    public boolean f21438x;
    public final org.telegram.ui.Components.z5 f21439y;

    public n4(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        this.f21432c = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        nr nrVar = nr.h;
        this.f21439y = new org.telegram.ui.Components.z5(this, 0L, 350L, nrVar);
        this.C = new org.telegram.ui.Components.z5(this, 0L, 350L, nrVar);
        this.E = org.telegram.ui.ActionBar.j6.f19906d6;
        this.f21437w = z4;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f21430a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(p9Var, k7.b6.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        gg.q qVar = new gg.q(context, 4);
        this.f21431b = qVar;
        NotificationCenter.listenEmojiLoading(qVar);
        qVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        qVar.setTextSize(1, 12.0f);
        qVar.setMaxLines(1);
        qVar.setGravity(49);
        qVar.setLines(1);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(qVar, k7.b6.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        uq uqVar = new uq(context, f6Var);
        this.f21436s = uqVar;
        addView(uqVar, k7.b6.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.j6.W8;
        int i11 = org.telegram.ui.ActionBar.j6.U8;
        tq tqVar = uqVar.f29272a;
        tqVar.v = i10;
        tqVar.f29021w = i11;
        uqVar.setGravity(5);
        if (z4) {
            lp lpVar = new lp(context, 21, f6Var);
            this.v = lpVar;
            lpVar.b(org.telegram.ui.ActionBar.j6.B5, org.telegram.ui.ActionBar.j6.f19977h5, org.telegram.ui.ActionBar.j6.C5);
            lpVar.setDrawUnchecked(false);
            lpVar.setDrawBackgroundAsArc(4);
            lpVar.setProgressDelegate(new ha(this, 4));
            addView(lpVar, k7.b6.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            lpVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j10, String str) {
        if (this.f21433f != j10) {
            this.f21435r = false;
            invalidate();
        }
        this.f21433f = j10;
        boolean isUserDialog = DialogObject.isUserDialog(j10);
        org.telegram.ui.Components.p9 p9Var = this.f21430a;
        org.telegram.ui.Components.z8 z8Var = this.f21432c;
        int i10 = this.h;
        gg.q qVar = this.f21431b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.e = user;
            if (str != null) {
                qVar.setText(str);
            } else if (user != null) {
                qVar.setText(UserObject.getFirstName(user));
            } else {
                qVar.setText("");
            }
            z8Var.m(i10, this.e);
            p9Var.e(this.e, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (str != null) {
                qVar.setText(str);
            } else if (chat != null) {
                qVar.setText(chat.title);
            } else {
                qVar.setText("");
            }
            z8Var.k(i10, chat);
            this.e = null;
            p9Var.e(chat, z8Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = MessagesController.UPDATE_MASK_STATUS & i10;
        int i13 = this.h;
        if (i12 != 0 && this.e != null) {
            this.e = MessagesController.getInstance(i13).getUser(Long.valueOf(this.e.f19331id));
            this.f21430a.invalidate();
            invalidate();
        }
        if (i10 == 0 || (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i10) != 0 || (i10 & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(this.f21433f);
            uq uqVar = this.f21436s;
            if (dialog != null && (i11 = dialog.unread_count) != 0) {
                if (this.d != i11) {
                    this.d = i11;
                    uqVar.f29272a.c(i11, this.f21435r);
                    return;
                }
                return;
            }
            this.d = 0;
            uqVar.f29272a.c(0, this.f21435r);
        }
    }

    public final void c(boolean z4) {
        TL_account.RequirementToContact requirementToContact;
        boolean z10;
        if (this.f21438x && this.e != null) {
            requirementToContact = MessagesController.getInstance(this.h).isUserContactBlocked(this.e.f19331id);
        } else {
            requirementToContact = null;
        }
        if (this.B == DialogObject.isPremiumBlocked(requirementToContact) && this.D == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.B = DialogObject.isPremiumBlocked(requirementToContact);
        this.D = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z4) {
            this.f21439y.f(this.B, true);
            if (this.D > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.C.f(z10, true);
        }
        invalidate();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r20, android.view.View r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n4.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f21433f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f21437w) {
            org.telegram.ui.Components.p9 p9Var = this.f21430a;
            int measuredWidth = (p9Var.getMeasuredWidth() / 2) + p9Var.getLeft();
            int measuredHeight = (p9Var.getMeasuredHeight() / 2) + p9Var.getTop();
            org.telegram.ui.ActionBar.j6.f20097o0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B5, false));
            org.telegram.ui.ActionBar.j6.f20097o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.j6.f20097o0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.f21436s.f29272a.E = AndroidUtilities.dp(13.0f);
    }
}
